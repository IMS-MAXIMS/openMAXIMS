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
 * @author Joan Heelan
 * Generated.
 */


public class School extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1007100014;
	private static final long serialVersionUID = 1007100014L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** School Name */
	private String schoolName;
	/** uppercase copy of school name */
	private String upperCaseName;
	/** Address / Location */
	private String location;
	/** Phone Number */
	private String phoneNumber;
	/** Sector. Location type -1420 */
	private ims.core.resource.place.domain.objects.Location sector;
	/** External Mappings
	  * Collection of ims.core.clinical.domain.objects.TaxonomyMap.
	  */
	private java.util.List externalMappings;
	/** Flag a school as inactive */
	private Boolean isActive;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public School (Integer id, int ver)
    {
    	super(id, ver);
    }
    public School ()
    {
    	super();
    }
    public School (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.resource.place.domain.objects.School.class;
	}


	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		if ( null != schoolName && schoolName.length() > 50 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for schoolName. Tried to set value: "+
				schoolName);
		}
		this.schoolName = schoolName;
	}

	public String getUpperCaseName() {
		return upperCaseName;
	}
	public void setUpperCaseName(String upperCaseName) {
		if ( null != upperCaseName && upperCaseName.length() > 50 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for upperCaseName. Tried to set value: "+
				upperCaseName);
		}
		this.upperCaseName = upperCaseName;
	}

	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		if ( null != location && location.length() > 50 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for location. Tried to set value: "+
				location);
		}
		this.location = location;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		if ( null != phoneNumber && phoneNumber.length() > 20 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for phoneNumber. Tried to set value: "+
				phoneNumber);
		}
		this.phoneNumber = phoneNumber;
	}

	public ims.core.resource.place.domain.objects.Location getSector() {
		return sector;
	}
	public void setSector(ims.core.resource.place.domain.objects.Location sector) {
		this.sector = sector;
	}

	public java.util.List getExternalMappings() {
		if ( null == externalMappings ) {
			externalMappings = new java.util.ArrayList();
		}
		return externalMappings;
	}
	public void setExternalMappings(java.util.List paramValue) {
		this.externalMappings = paramValue;
	}

	public Boolean isIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
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
		
		auditStr.append("\r\n*schoolName* :");
		auditStr.append(schoolName);
	    auditStr.append("; ");
		auditStr.append("\r\n*upperCaseName* :");
		auditStr.append(upperCaseName);
	    auditStr.append("; ");
		auditStr.append("\r\n*location* :");
		auditStr.append(location);
	    auditStr.append("; ");
		auditStr.append("\r\n*phoneNumber* :");
		auditStr.append(phoneNumber);
	    auditStr.append("; ");
		auditStr.append("\r\n*sector* :");
		if (sector != null)
		{
			auditStr.append(toShortClassName(sector));
				
		    auditStr.append(sector.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*externalMappings* :");
		if (externalMappings != null)
		{
		int i6=0;
		for (i6=0; i6<externalMappings.size(); i6++)
		{
			if (i6 > 0)
				auditStr.append(",");
			ims.core.clinical.domain.objects.TaxonomyMap obj = (ims.core.clinical.domain.objects.TaxonomyMap)externalMappings.get(i6);
		    if (obj != null)
			{
				if (i6 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i6 > 0)
			auditStr.append("] " + i6);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isActive* :");
		auditStr.append(isActive);
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
		
		String keyClassName = "School";
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
		if (this.getSchoolName() != null)
		{
			sb.append("<schoolName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSchoolName().toString()));
			sb.append("</schoolName>");		
		}
		if (this.getUpperCaseName() != null)
		{
			sb.append("<upperCaseName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getUpperCaseName().toString()));
			sb.append("</upperCaseName>");		
		}
		if (this.getLocation() != null)
		{
			sb.append("<location>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLocation().toString()));
			sb.append("</location>");		
		}
		if (this.getPhoneNumber() != null)
		{
			sb.append("<phoneNumber>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPhoneNumber().toString()));
			sb.append("</phoneNumber>");		
		}
		if (this.getSector() != null)
		{
			sb.append("<sector>");
			sb.append(this.getSector().toXMLString(domMap)); 	
			sb.append("</sector>");		
		}
		if (this.getExternalMappings() != null)
		{
			if (this.getExternalMappings().size() > 0 )
			{
			sb.append("<externalMappings>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getExternalMappings(), domMap));
			sb.append("</externalMappings>");		
			}
		}
		if (this.isIsActive() != null)
		{
			sb.append("<isActive>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsActive().toString()));
			sb.append("</isActive>");		
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
			School domainObject = getSchoolfromXML(itemEl, factory, domMap);

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
			School domainObject = getSchoolfromXML(itemEl, factory, domMap);

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
		
	public static School getSchoolfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getSchoolfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static School getSchoolfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!School.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!School.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the School class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (School)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(School.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		School ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (School)factory.getImportedDomainObject(School.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new School();
		}
		String keyClassName = "School";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (School)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, School obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("schoolName");
		if(fldEl != null)
		{	
    		obj.setSchoolName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("upperCaseName");
		if(fldEl != null)
		{	
    		obj.setUpperCaseName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("location");
		if(fldEl != null)
		{	
    		obj.setLocation(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("phoneNumber");
		if(fldEl != null)
		{	
    		obj.setPhoneNumber(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("sector");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSector(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("externalMappings");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setExternalMappings(ims.core.clinical.domain.objects.TaxonomyMap.fromListXMLString(fldEl, factory, obj.getExternalMappings(), domMap));
		}
		fldEl = el.element("isActive");
		if(fldEl != null)
		{	
    		obj.setIsActive(new Boolean(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "externalMappings"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String SchoolName = "schoolName";
		public static final String UpperCaseName = "upperCaseName";
		public static final String Location = "location";
		public static final String PhoneNumber = "phoneNumber";
		public static final String Sector = "sector";
		public static final String ExternalMappings = "externalMappings";
		public static final String IsActive = "isActive";
	}
}

