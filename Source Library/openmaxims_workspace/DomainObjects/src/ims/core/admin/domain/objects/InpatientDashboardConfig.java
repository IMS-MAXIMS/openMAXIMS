//#############################################################################
//#                                                                           #
//#  Copyright (C) <2015>  <IMS MAXIMS>                                       #
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
//#  IMS MAXIMS provides absolutely NO GUARANTEE OF THE CLINICAL SAFTEY of    #
//#  this program.  Users of this software do so entirely at their own risk.  #
//#  IMS MAXIMS only ensures the Clinical Safety of unaltered run-time        #
//#  software that it builds, deploys and maintains.                          #
//#                                                                           #
//#############################################################################
//#EOH
/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5589.25814)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated: 12/10/2015, 13:28
 *
 */
package ims.core.admin.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class InpatientDashboardConfig extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1004100080;
	private static final long serialVersionUID = 1004100080L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Ward Dept Name */
	private String wardDeptName;
	/** Category */
	private ims.domain.lookups.LookupInstance category;
	/** Wards
	  * Collection of ims.core.resource.place.domain.objects.Location.
	  */
	private java.util.Set wardLocations;
	/** is Active */
	private Boolean isActive;
	/** SequenceNo */
	private Integer sequenceNo;
	/** Red */
	private Integer red;
	/** Green */
	private Integer green;
	/** Blue */
	private Integer blue;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public InpatientDashboardConfig (Integer id, int ver)
    {
    	super(id, ver);
    }
    public InpatientDashboardConfig ()
    {
    	super();
    }
    public InpatientDashboardConfig (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.admin.domain.objects.InpatientDashboardConfig.class;
	}


	public String getWardDeptName() {
		return wardDeptName;
	}
	public void setWardDeptName(String wardDeptName) {
		if ( null != wardDeptName && wardDeptName.length() > 125 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for wardDeptName. Tried to set value: "+
				wardDeptName);
		}
		this.wardDeptName = wardDeptName;
	}

	public ims.domain.lookups.LookupInstance getCategory() {
		return category;
	}
	public void setCategory(ims.domain.lookups.LookupInstance category) {
		this.category = category;
	}

	public java.util.Set getWardLocations() {
		if ( null == wardLocations ) {
			wardLocations = new java.util.HashSet();
		}
		return wardLocations;
	}
	public void setWardLocations(java.util.Set paramValue) {
		this.wardLocations = paramValue;
	}

	public Boolean isIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Integer getSequenceNo() {
		return sequenceNo;
	}
	public void setSequenceNo(Integer sequenceNo) {
		this.sequenceNo = sequenceNo;
	}

	public Integer getRed() {
		return red;
	}
	public void setRed(Integer red) {
		this.red = red;
	}

	public Integer getGreen() {
		return green;
	}
	public void setGreen(Integer green) {
		this.green = green;
	}

	public Integer getBlue() {
		return blue;
	}
	public void setBlue(Integer blue) {
		this.blue = blue;
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
		
		auditStr.append("\r\n*wardDeptName* :");
		auditStr.append(wardDeptName);
	    auditStr.append("; ");
		auditStr.append("\r\n*category* :");
		if (category != null)
			auditStr.append(category.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*wardLocations* :");
		if (wardLocations != null)
		{
			java.util.Iterator it3 = wardLocations.iterator();
			int i3=0;
			while (it3.hasNext())
			{
				if (i3 > 0)
					auditStr.append(",");
				ims.core.resource.place.domain.objects.Location obj = (ims.core.resource.place.domain.objects.Location)it3.next();
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
		auditStr.append("\r\n*isActive* :");
		auditStr.append(isActive);
	    auditStr.append("; ");
		auditStr.append("\r\n*sequenceNo* :");
		auditStr.append(sequenceNo);
	    auditStr.append("; ");
		auditStr.append("\r\n*red* :");
		auditStr.append(red);
	    auditStr.append("; ");
		auditStr.append("\r\n*green* :");
		auditStr.append(green);
	    auditStr.append("; ");
		auditStr.append("\r\n*blue* :");
		auditStr.append(blue);
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
		
		String keyClassName = "InpatientDashboardConfig";
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
		if (this.getWardDeptName() != null)
		{
			sb.append("<wardDeptName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getWardDeptName().toString()));
			sb.append("</wardDeptName>");		
		}
		if (this.getCategory() != null)
		{
			sb.append("<category>");
			sb.append(this.getCategory().toXMLString()); 
			sb.append("</category>");		
		}
		if (this.getWardLocations() != null)
		{
			if (this.getWardLocations().size() > 0 )
			{
			sb.append("<wardLocations>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getWardLocations(), domMap));
			sb.append("</wardLocations>");		
			}
		}
		if (this.isIsActive() != null)
		{
			sb.append("<isActive>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsActive().toString()));
			sb.append("</isActive>");		
		}
		if (this.getSequenceNo() != null)
		{
			sb.append("<sequenceNo>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSequenceNo().toString()));
			sb.append("</sequenceNo>");		
		}
		if (this.getRed() != null)
		{
			sb.append("<red>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRed().toString()));
			sb.append("</red>");		
		}
		if (this.getGreen() != null)
		{
			sb.append("<green>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getGreen().toString()));
			sb.append("</green>");		
		}
		if (this.getBlue() != null)
		{
			sb.append("<blue>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getBlue().toString()));
			sb.append("</blue>");		
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
			InpatientDashboardConfig domainObject = getInpatientDashboardConfigfromXML(itemEl, factory, domMap);

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
			InpatientDashboardConfig domainObject = getInpatientDashboardConfigfromXML(itemEl, factory, domMap);

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
		
	public static InpatientDashboardConfig getInpatientDashboardConfigfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getInpatientDashboardConfigfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static InpatientDashboardConfig getInpatientDashboardConfigfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!InpatientDashboardConfig.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!InpatientDashboardConfig.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the InpatientDashboardConfig class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (InpatientDashboardConfig)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(InpatientDashboardConfig.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		InpatientDashboardConfig ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (InpatientDashboardConfig)factory.getImportedDomainObject(InpatientDashboardConfig.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new InpatientDashboardConfig();
		}
		String keyClassName = "InpatientDashboardConfig";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (InpatientDashboardConfig)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, InpatientDashboardConfig obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("wardDeptName");
		if(fldEl != null)
		{	
    		obj.setWardDeptName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("category");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCategory(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("wardLocations");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setWardLocations(ims.core.resource.place.domain.objects.Location.fromSetXMLString(fldEl, factory, obj.getWardLocations(), domMap));
		}
		fldEl = el.element("isActive");
		if(fldEl != null)
		{	
    		obj.setIsActive(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("sequenceNo");
		if(fldEl != null)
		{	
    		obj.setSequenceNo(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("red");
		if(fldEl != null)
		{	
    		obj.setRed(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("green");
		if(fldEl != null)
		{	
    		obj.setGreen(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("blue");
		if(fldEl != null)
		{	
    		obj.setBlue(new Integer(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "wardLocations"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String WardDeptName = "wardDeptName";
		public static final String Category = "category";
		public static final String WardLocations = "wardLocations";
		public static final String IsActive = "isActive";
		public static final String SequenceNo = "sequenceNo";
		public static final String Red = "red";
		public static final String Green = "green";
		public static final String Blue = "blue";
	}
}

