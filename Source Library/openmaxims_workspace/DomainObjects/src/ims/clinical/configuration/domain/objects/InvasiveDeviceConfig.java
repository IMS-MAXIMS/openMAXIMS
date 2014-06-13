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
package ims.clinical.configuration.domain.objects;

/**
 * 
 * @author Joan Heelan
 * Generated.
 */


public class InvasiveDeviceConfig extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1073100015;
	private static final long serialVersionUID = 1073100015L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Invasive Device */
	private String invasiveDevice;
	/** How long the device is to be left in place. */
	private Integer durationInt;
	/** Recommend Duration Unit */
	private ims.domain.lookups.LookupInstance durationUnit;
	/** Type
	  * Collection of ims.clinical.configuration.domain.objects.InvasiveDeviceType.
	  */
	private java.util.List type;
	/** Size - collection of sizes
	  * Collection of ims.clinical.configuration.domain.objects.InvasiveDeviceConfigSize.
	  */
	private java.util.List size;
	/** isActive */
	private Boolean isActive;
	/** RequiresVIP */
	private Boolean requiresVIP;
	/** Site Relevent */
	private Boolean hasSite;
	/** Has Types */
	private Boolean hasTypes;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public InvasiveDeviceConfig (Integer id, int ver)
    {
    	super(id, ver);
    }
    public InvasiveDeviceConfig ()
    {
    	super();
    }
    public InvasiveDeviceConfig (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.clinical.configuration.domain.objects.InvasiveDeviceConfig.class;
	}


	public String getInvasiveDevice() {
		return invasiveDevice;
	}
	public void setInvasiveDevice(String invasiveDevice) {
		if ( null != invasiveDevice && invasiveDevice.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for invasiveDevice. Tried to set value: "+
				invasiveDevice);
		}
		this.invasiveDevice = invasiveDevice;
	}

	public Integer getDurationInt() {
		return durationInt;
	}
	public void setDurationInt(Integer durationInt) {
		this.durationInt = durationInt;
	}

	public ims.domain.lookups.LookupInstance getDurationUnit() {
		return durationUnit;
	}
	public void setDurationUnit(ims.domain.lookups.LookupInstance durationUnit) {
		this.durationUnit = durationUnit;
	}

	public java.util.List getType() {
		if ( null == type ) {
			type = new java.util.ArrayList();
		}
		return type;
	}
	public void setType(java.util.List paramValue) {
		this.type = paramValue;
	}

	public java.util.List getSize() {
		if ( null == size ) {
			size = new java.util.ArrayList();
		}
		return size;
	}
	public void setSize(java.util.List paramValue) {
		this.size = paramValue;
	}

	public Boolean isIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean isRequiresVIP() {
		return requiresVIP;
	}
	public void setRequiresVIP(Boolean requiresVIP) {
		this.requiresVIP = requiresVIP;
	}

	public Boolean isHasSite() {
		return hasSite;
	}
	public void setHasSite(Boolean hasSite) {
		this.hasSite = hasSite;
	}

	public Boolean isHasTypes() {
		return hasTypes;
	}
	public void setHasTypes(Boolean hasTypes) {
		this.hasTypes = hasTypes;
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
		
		auditStr.append("\r\n*invasiveDevice* :");
		auditStr.append(invasiveDevice);
	    auditStr.append("; ");
		auditStr.append("\r\n*durationInt* :");
		auditStr.append(durationInt);
	    auditStr.append("; ");
		auditStr.append("\r\n*durationUnit* :");
		if (durationUnit != null)
			auditStr.append(durationUnit.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*type* :");
		if (type != null)
		{
		int i4=0;
		for (i4=0; i4<type.size(); i4++)
		{
			if (i4 > 0)
				auditStr.append(",");
			ims.clinical.configuration.domain.objects.InvasiveDeviceType obj = (ims.clinical.configuration.domain.objects.InvasiveDeviceType)type.get(i4);
		    if (obj != null)
			{
				if (i4 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i4 > 0)
			auditStr.append("] " + i4);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*size* :");
		if (size != null)
		{
		int i5=0;
		for (i5=0; i5<size.size(); i5++)
		{
			if (i5 > 0)
				auditStr.append(",");
			ims.clinical.configuration.domain.objects.InvasiveDeviceConfigSize obj = (ims.clinical.configuration.domain.objects.InvasiveDeviceConfigSize)size.get(i5);
		    if (obj != null)
			{
				if (i5 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i5 > 0)
			auditStr.append("] " + i5);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isActive* :");
		auditStr.append(isActive);
	    auditStr.append("; ");
		auditStr.append("\r\n*requiresVIP* :");
		auditStr.append(requiresVIP);
	    auditStr.append("; ");
		auditStr.append("\r\n*hasSite* :");
		auditStr.append(hasSite);
	    auditStr.append("; ");
		auditStr.append("\r\n*hasTypes* :");
		auditStr.append(hasTypes);
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
		
		String keyClassName = "InvasiveDeviceConfig";
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
		if (this.getInvasiveDevice() != null)
		{
			sb.append("<invasiveDevice>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getInvasiveDevice().toString()));
			sb.append("</invasiveDevice>");		
		}
		if (this.getDurationInt() != null)
		{
			sb.append("<durationInt>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDurationInt().toString()));
			sb.append("</durationInt>");		
		}
		if (this.getDurationUnit() != null)
		{
			sb.append("<durationUnit>");
			sb.append(this.getDurationUnit().toXMLString()); 
			sb.append("</durationUnit>");		
		}
		if (this.getType() != null)
		{
			if (this.getType().size() > 0 )
			{
			sb.append("<type>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getType(), domMap));
			sb.append("</type>");		
			}
		}
		if (this.getSize() != null)
		{
			if (this.getSize().size() > 0 )
			{
			sb.append("<size>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getSize(), domMap));
			sb.append("</size>");		
			}
		}
		if (this.isIsActive() != null)
		{
			sb.append("<isActive>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsActive().toString()));
			sb.append("</isActive>");		
		}
		if (this.isRequiresVIP() != null)
		{
			sb.append("<requiresVIP>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isRequiresVIP().toString()));
			sb.append("</requiresVIP>");		
		}
		if (this.isHasSite() != null)
		{
			sb.append("<hasSite>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHasSite().toString()));
			sb.append("</hasSite>");		
		}
		if (this.isHasTypes() != null)
		{
			sb.append("<hasTypes>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHasTypes().toString()));
			sb.append("</hasTypes>");		
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
			InvasiveDeviceConfig domainObject = getInvasiveDeviceConfigfromXML(itemEl, factory, domMap);

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
			InvasiveDeviceConfig domainObject = getInvasiveDeviceConfigfromXML(itemEl, factory, domMap);

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
		
	public static InvasiveDeviceConfig getInvasiveDeviceConfigfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getInvasiveDeviceConfigfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static InvasiveDeviceConfig getInvasiveDeviceConfigfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!InvasiveDeviceConfig.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!InvasiveDeviceConfig.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the InvasiveDeviceConfig class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (InvasiveDeviceConfig)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(InvasiveDeviceConfig.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		InvasiveDeviceConfig ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (InvasiveDeviceConfig)factory.getImportedDomainObject(InvasiveDeviceConfig.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new InvasiveDeviceConfig();
		}
		String keyClassName = "InvasiveDeviceConfig";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (InvasiveDeviceConfig)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, InvasiveDeviceConfig obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("invasiveDevice");
		if(fldEl != null)
		{	
    		obj.setInvasiveDevice(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("durationInt");
		if(fldEl != null)
		{	
    		obj.setDurationInt(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("durationUnit");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDurationUnit(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("type");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setType(ims.clinical.configuration.domain.objects.InvasiveDeviceType.fromListXMLString(fldEl, factory, obj.getType(), domMap));
		}
		fldEl = el.element("size");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setSize(ims.clinical.configuration.domain.objects.InvasiveDeviceConfigSize.fromListXMLString(fldEl, factory, obj.getSize(), domMap));
		}
		fldEl = el.element("isActive");
		if(fldEl != null)
		{	
    		obj.setIsActive(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("requiresVIP");
		if(fldEl != null)
		{	
    		obj.setRequiresVIP(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("hasSite");
		if(fldEl != null)
		{	
    		obj.setHasSite(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("hasTypes");
		if(fldEl != null)
		{	
    		obj.setHasTypes(new Boolean(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "type"
		, "size"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String InvasiveDevice = "invasiveDevice";
		public static final String DurationInt = "durationInt";
		public static final String DurationUnit = "durationUnit";
		public static final String Type = "type";
		public static final String Size = "size";
		public static final String IsActive = "isActive";
		public static final String RequiresVIP = "requiresVIP";
		public static final String HasSite = "hasSite";
		public static final String HasTypes = "hasTypes";
	}
}

