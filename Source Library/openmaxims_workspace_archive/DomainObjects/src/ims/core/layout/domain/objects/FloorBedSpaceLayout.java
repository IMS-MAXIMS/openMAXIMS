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
package ims.core.layout.domain.objects;

/**
 * 
 * @author Marius Mihalec
 * Generated.
 */


public class FloorBedSpaceLayout extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1095100002;
	private static final long serialVersionUID = 1095100002L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Name */
	private String name;
	/** Floor Layout */
	private ims.core.layout.domain.objects.FloorLayout floorLayout;
	/** Bed Spaces
	  * Collection of ims.core.layout.domain.objects.BedSpace.
	  */
	private java.util.Set bedSpaces;
	/** Status */
	private ims.domain.lookups.LookupInstance status;
	/** isTemplate */
	private Boolean isTemplate;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public FloorBedSpaceLayout (Integer id, int ver)
    {
    	super(id, ver);
    }
    public FloorBedSpaceLayout ()
    {
    	super();
    }
    public FloorBedSpaceLayout (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.layout.domain.objects.FloorBedSpaceLayout.class;
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

	public ims.core.layout.domain.objects.FloorLayout getFloorLayout() {
		return floorLayout;
	}
	public void setFloorLayout(ims.core.layout.domain.objects.FloorLayout floorLayout) {
		this.floorLayout = floorLayout;
	}

	public java.util.Set getBedSpaces() {
		if ( null == bedSpaces ) {
			bedSpaces = new java.util.HashSet();
		}
		return bedSpaces;
	}
	public void setBedSpaces(java.util.Set paramValue) {
		this.bedSpaces = paramValue;
	}

	public ims.domain.lookups.LookupInstance getStatus() {
		return status;
	}
	public void setStatus(ims.domain.lookups.LookupInstance status) {
		this.status = status;
	}

	public Boolean isIsTemplate() {
		return isTemplate;
	}
	public void setIsTemplate(Boolean isTemplate) {
		this.isTemplate = isTemplate;
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
		auditStr.append("\r\n*floorLayout* :");
		if (floorLayout != null)
		{
			auditStr.append(toShortClassName(floorLayout));
				
		    auditStr.append(floorLayout.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*bedSpaces* :");
		if (bedSpaces != null)
		{
			java.util.Iterator it3 = bedSpaces.iterator();
			int i3=0;
			while (it3.hasNext())
			{
				if (i3 > 0)
					auditStr.append(",");
				ims.core.layout.domain.objects.BedSpace obj = (ims.core.layout.domain.objects.BedSpace)it3.next();
		if (obj != null)
		{
		   if (i3 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i3++;
		}
		if (i3 > 0)
			auditStr.append("] " + i3);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*status* :");
		if (status != null)
			auditStr.append(status.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*isTemplate* :");
		auditStr.append(isTemplate);
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
		
		String keyClassName = "FloorBedSpaceLayout";
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
		if (this.getFloorLayout() != null)
		{
			sb.append("<floorLayout>");
			sb.append(this.getFloorLayout().toXMLString(domMap)); 	
			sb.append("</floorLayout>");		
		}
		if (this.getBedSpaces() != null)
		{
			if (this.getBedSpaces().size() > 0 )
			{
			sb.append("<bedSpaces>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getBedSpaces(), domMap));
			sb.append("</bedSpaces>");		
			}
		}
		if (this.getStatus() != null)
		{
			sb.append("<status>");
			sb.append(this.getStatus().toXMLString()); 
			sb.append("</status>");		
		}
		if (this.isIsTemplate() != null)
		{
			sb.append("<isTemplate>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsTemplate().toString()));
			sb.append("</isTemplate>");		
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
			FloorBedSpaceLayout domainObject = getFloorBedSpaceLayoutfromXML(itemEl, factory, domMap);

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
			FloorBedSpaceLayout domainObject = getFloorBedSpaceLayoutfromXML(itemEl, factory, domMap);

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
		
	public static FloorBedSpaceLayout getFloorBedSpaceLayoutfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getFloorBedSpaceLayoutfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static FloorBedSpaceLayout getFloorBedSpaceLayoutfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!FloorBedSpaceLayout.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!FloorBedSpaceLayout.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the FloorBedSpaceLayout class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (FloorBedSpaceLayout)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(FloorBedSpaceLayout.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		FloorBedSpaceLayout ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (FloorBedSpaceLayout)factory.getImportedDomainObject(FloorBedSpaceLayout.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new FloorBedSpaceLayout();
		}
		String keyClassName = "FloorBedSpaceLayout";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (FloorBedSpaceLayout)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, FloorBedSpaceLayout obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("name");
		if(fldEl != null)
		{	
    		obj.setName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("floorLayout");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setFloorLayout(ims.core.layout.domain.objects.FloorLayout.getFloorLayoutfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("bedSpaces");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setBedSpaces(ims.core.layout.domain.objects.BedSpace.fromSetXMLString(fldEl, factory, obj.getBedSpaces(), domMap));
		}
		fldEl = el.element("status");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("isTemplate");
		if(fldEl != null)
		{	
    		obj.setIsTemplate(new Boolean(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "bedSpaces"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Name = "name";
		public static final String FloorLayout = "floorLayout";
		public static final String BedSpaces = "bedSpaces";
		public static final String Status = "status";
		public static final String IsTemplate = "isTemplate";
	}
}

