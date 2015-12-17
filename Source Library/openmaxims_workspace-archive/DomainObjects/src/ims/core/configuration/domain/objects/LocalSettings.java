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
package ims.core.configuration.domain.objects;

/**
 * 
 * @author Marius Mihalec
 * Generated.
 */


public class LocalSettings extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1028100058;
	private static final long serialVersionUID = 1028100058L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Computer Instance Identifier */
	private String instanceIdentifier;
	/** Setting Type */
	private Integer settingType;
	/** String of Value(s) */
	private String values;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public LocalSettings (Integer id, int ver)
    {
    	super(id, ver);
    }
    public LocalSettings ()
    {
    	super();
    }
    public LocalSettings (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.configuration.domain.objects.LocalSettings.class;
	}


	public String getInstanceIdentifier() {
		return instanceIdentifier;
	}
	public void setInstanceIdentifier(String instanceIdentifier) {
		if ( null != instanceIdentifier && instanceIdentifier.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for instanceIdentifier. Tried to set value: "+
				instanceIdentifier);
		}
		this.instanceIdentifier = instanceIdentifier;
	}

	public Integer getSettingType() {
		return settingType;
	}
	public void setSettingType(Integer settingType) {
		this.settingType = settingType;
	}

	public String getValues() {
		return values;
	}
	public void setValues(String values) {
		this.values = values;
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
	// method generated based on 'localsettings_uq' unique index.
	public static boolean recordExistForInstanceIdentifierAndSettingType(ims.domain.ILightweightDomainFactory factory,
		 String instanceIdentifier
	,
	 Integer settingType
	)	
	{
		return recordExistForInstanceIdentifierAndSettingType(factory, instanceIdentifier, settingType, null);
	}	

	// method generated based on 'localsettings_uq' unique index.
	public static boolean recordExistForInstanceIdentifierAndSettingType(ims.domain.ILightweightDomainFactory factory,
		 String instanceIdentifier
	,
	 Integer settingType
	, Integer recordId)	
	{
		String[] names = new String[2];
		Object[] values = new Object[2];
		StringBuffer hql = new StringBuffer();
		
		hql.append("from LocalSettings c where ");
		hql.append(" c.instanceIdentifier = :instanceIdentifier ");
		names[0] = "instanceIdentifier";
		values[0] = instanceIdentifier;		
		hql.append(" and "); 
		hql.append(" c.settingType = :settingType ");
		names[1] = "settingType";
		values[1] = settingType;		
		if(recordId != null)
		{
			hql.append(" and c.id <> " + recordId);
		}
		
		return factory.count(hql.toString(), names, values) > 0;				
	}	

	// method generated based on 'localsettings_uq' unique index.
	public static LocalSettings getRecordByInstanceIdentifierAndSettingType(ims.domain.ILightweightDomainFactory factory,
	 String instanceIdentifier
	,
	 Integer settingType
	)
	{
		String[] names = new String[2];
		Object[] values = new Object[2];
		StringBuffer hql = new StringBuffer();
		hql.append("from LocalSettings c where ");
		hql.append(" c.instanceIdentifier = :instanceIdentifier ");
		names[0] = "instanceIdentifier";
		values[0] = instanceIdentifier;		
		hql.append(" and "); 
		hql.append(" c.settingType = :settingType ");
		names[1] = "settingType";
		values[1] = settingType;		
		java.util.List l = factory.find(hql.toString(), names, values);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. " + hql + " returned " + l.size() + " records. " );
		return (LocalSettings)l.get(0);
	}

	public static LocalSettings getLocalSettingsFromlocalsettings_uq(ims.domain.ILightweightDomainFactory factory,
	 String instanceIdentifier
	,
	 Integer settingType
	)
	{
		String[] names = new String[2];
		Object[] values = new Object[2];
		StringBuffer hql = new StringBuffer();
		hql.append("from LocalSettings c where ");
		hql.append(" c.instanceIdentifier = :instanceIdentifier ");
		names[0] = "instanceIdentifier";
		values[0] = instanceIdentifier;		
		hql.append(" and "); 
		hql.append(" c.settingType = :settingType ");
		names[1] = "settingType";
		values[1] = settingType;		
		java.util.List l = factory.find(hql.toString(), names, values);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. " + hql + " returned " + l.size() + " records. " );
		return (LocalSettings)l.get(0);
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
		
		auditStr.append("\r\n*instanceIdentifier* :");
		auditStr.append(instanceIdentifier);
	    auditStr.append("; ");
		auditStr.append("\r\n*settingType* :");
		auditStr.append(settingType);
	    auditStr.append("; ");
		auditStr.append("\r\n*values* :");
		auditStr.append(values);
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
		
		String keyClassName = "LocalSettings";
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
		if (this.getInstanceIdentifier() != null)
		{
			sb.append("<instanceIdentifier>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getInstanceIdentifier().toString()));
			sb.append("</instanceIdentifier>");		
		}
		if (this.getSettingType() != null)
		{
			sb.append("<settingType>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSettingType().toString()));
			sb.append("</settingType>");		
		}
		if (this.getValues() != null)
		{
			sb.append("<values>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getValues().toString()));
			sb.append("</values>");		
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
			LocalSettings domainObject = getLocalSettingsfromXML(itemEl, factory, domMap);

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
			LocalSettings domainObject = getLocalSettingsfromXML(itemEl, factory, domMap);

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
		
	public static LocalSettings getLocalSettingsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getLocalSettingsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static LocalSettings getLocalSettingsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!LocalSettings.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!LocalSettings.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the LocalSettings class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (LocalSettings)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(LocalSettings.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		LocalSettings ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (LocalSettings)factory.getImportedDomainObject(LocalSettings.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new LocalSettings();
		}
		String keyClassName = "LocalSettings";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (LocalSettings)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, LocalSettings obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("instanceIdentifier");
		if(fldEl != null)
		{	
    		obj.setInstanceIdentifier(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("settingType");
		if(fldEl != null)
		{	
    		obj.setSettingType(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("values");
		if(fldEl != null)
		{	
    		obj.setValues(new String(fldEl.getTextTrim()));	
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
		public static final String InstanceIdentifier = "instanceIdentifier";
		public static final String SettingType = "settingType";
		public static final String Values = "values";
	}
}

