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
 * @author Kevin O'Carroll
 * Generated.
 */


public class SECSConfiguration extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1028100024;
	private static final long serialVersionUID = 1028100024L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Type */
	private ims.domain.lookups.LookupInstance type;
	/** Range of Values and associated score */
	private ims.clinical.configuration.domain.objects.SECSRangeConfig rangeConfig;
	/** Lookup Values and associated scores */
	private ims.clinical.configuration.domain.objects.SECSLookupConfig lookupConfig;
	/** Oxygen Sats Configuration */
	private ims.clinical.configuration.domain.objects.SECSOxygenSats oxygenSatsConfig;
	/** isActive Flag */
	private Boolean isActive;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public SECSConfiguration (Integer id, int ver)
    {
    	super(id, ver);
    }
    public SECSConfiguration ()
    {
    	super();
    }
    public SECSConfiguration (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.clinical.configuration.domain.objects.SECSConfiguration.class;
	}


	public ims.domain.lookups.LookupInstance getType() {
		return type;
	}
	public void setType(ims.domain.lookups.LookupInstance type) {
		this.type = type;
	}

	public ims.clinical.configuration.domain.objects.SECSRangeConfig getRangeConfig() {
		return rangeConfig;
	}
	public void setRangeConfig(ims.clinical.configuration.domain.objects.SECSRangeConfig rangeConfig) {
		this.rangeConfig = rangeConfig;
	}

	public ims.clinical.configuration.domain.objects.SECSLookupConfig getLookupConfig() {
		return lookupConfig;
	}
	public void setLookupConfig(ims.clinical.configuration.domain.objects.SECSLookupConfig lookupConfig) {
		this.lookupConfig = lookupConfig;
	}

	public ims.clinical.configuration.domain.objects.SECSOxygenSats getOxygenSatsConfig() {
		return oxygenSatsConfig;
	}
	public void setOxygenSatsConfig(ims.clinical.configuration.domain.objects.SECSOxygenSats oxygenSatsConfig) {
		this.oxygenSatsConfig = oxygenSatsConfig;
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
		
		auditStr.append("\r\n*type* :");
		if (type != null)
			auditStr.append(type.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*rangeConfig* :");
		if (rangeConfig != null)
		{
			auditStr.append(toShortClassName(rangeConfig));
				
		    auditStr.append(rangeConfig.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*lookupConfig* :");
		if (lookupConfig != null)
		{
			auditStr.append(toShortClassName(lookupConfig));
				
		    auditStr.append(lookupConfig.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*oxygenSatsConfig* :");
		if (oxygenSatsConfig != null)
		{
			auditStr.append(toShortClassName(oxygenSatsConfig));
				
		    auditStr.append(oxygenSatsConfig.getId());
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
		
		String keyClassName = "SECSConfiguration";
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
		if (this.getType() != null)
		{
			sb.append("<type>");
			sb.append(this.getType().toXMLString()); 
			sb.append("</type>");		
		}
		if (this.getRangeConfig() != null)
		{
			sb.append("<rangeConfig>");
			sb.append(this.getRangeConfig().toXMLString(domMap)); 	
			sb.append("</rangeConfig>");		
		}
		if (this.getLookupConfig() != null)
		{
			sb.append("<lookupConfig>");
			sb.append(this.getLookupConfig().toXMLString(domMap)); 	
			sb.append("</lookupConfig>");		
		}
		if (this.getOxygenSatsConfig() != null)
		{
			sb.append("<oxygenSatsConfig>");
			sb.append(this.getOxygenSatsConfig().toXMLString(domMap)); 	
			sb.append("</oxygenSatsConfig>");		
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
			SECSConfiguration domainObject = getSECSConfigurationfromXML(itemEl, factory, domMap);

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
			SECSConfiguration domainObject = getSECSConfigurationfromXML(itemEl, factory, domMap);

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
		
	public static SECSConfiguration getSECSConfigurationfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getSECSConfigurationfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static SECSConfiguration getSECSConfigurationfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!SECSConfiguration.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!SECSConfiguration.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the SECSConfiguration class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (SECSConfiguration)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(SECSConfiguration.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		SECSConfiguration ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (SECSConfiguration)factory.getImportedDomainObject(SECSConfiguration.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new SECSConfiguration();
		}
		String keyClassName = "SECSConfiguration";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (SECSConfiguration)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, SECSConfiguration obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("type");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("rangeConfig");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRangeConfig(ims.clinical.configuration.domain.objects.SECSRangeConfig.getSECSRangeConfigfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("lookupConfig");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setLookupConfig(ims.clinical.configuration.domain.objects.SECSLookupConfig.getSECSLookupConfigfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("oxygenSatsConfig");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setOxygenSatsConfig(ims.clinical.configuration.domain.objects.SECSOxygenSats.getSECSOxygenSatsfromXML(fldEl, factory, domMap)); 
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
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Type = "type";
		public static final String RangeConfig = "rangeConfig";
		public static final String LookupConfig = "lookupConfig";
		public static final String OxygenSatsConfig = "oxygenSatsConfig";
		public static final String IsActive = "isActive";
	}
}

