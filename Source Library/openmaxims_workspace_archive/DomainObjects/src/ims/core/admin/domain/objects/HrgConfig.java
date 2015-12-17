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
package ims.core.admin.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class HrgConfig extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1004100036;
	private static final long serialVersionUID = 1004100036L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** HRGCode */
	private String hRGCode;
	/** HRG Description */
	private String hRGDescription;
	/** CostPounds */
	private Integer costPounds;
	/** Cost Pence */
	private Integer costPence;
	/** Mappings
	  * Collection of ims.core.clinical.domain.objects.NonUniqueTaxonomyMap.
	  */
	private java.util.List mappings;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public HrgConfig (Integer id, int ver)
    {
    	super(id, ver);
    }
    public HrgConfig ()
    {
    	super();
    }
    public HrgConfig (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.admin.domain.objects.HrgConfig.class;
	}


	public String getHRGCode() {
		return hRGCode;
	}
	public void setHRGCode(String hRGCode) {
		if ( null != hRGCode && hRGCode.length() > 25 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for hRGCode. Tried to set value: "+
				hRGCode);
		}
		this.hRGCode = hRGCode;
	}

	public String getHRGDescription() {
		return hRGDescription;
	}
	public void setHRGDescription(String hRGDescription) {
		if ( null != hRGDescription && hRGDescription.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for hRGDescription. Tried to set value: "+
				hRGDescription);
		}
		this.hRGDescription = hRGDescription;
	}

	public Integer getCostPounds() {
		return costPounds;
	}
	public void setCostPounds(Integer costPounds) {
		this.costPounds = costPounds;
	}

	public Integer getCostPence() {
		return costPence;
	}
	public void setCostPence(Integer costPence) {
		this.costPence = costPence;
	}

	public java.util.List getMappings() {
		if ( null == mappings ) {
			mappings = new java.util.ArrayList();
		}
		return mappings;
	}
	public void setMappings(java.util.List paramValue) {
		this.mappings = paramValue;
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
		
		auditStr.append("\r\n*hRGCode* :");
		auditStr.append(hRGCode);
	    auditStr.append("; ");
		auditStr.append("\r\n*hRGDescription* :");
		auditStr.append(hRGDescription);
	    auditStr.append("; ");
		auditStr.append("\r\n*costPounds* :");
		auditStr.append(costPounds);
	    auditStr.append("; ");
		auditStr.append("\r\n*costPence* :");
		auditStr.append(costPence);
	    auditStr.append("; ");
		auditStr.append("\r\n*mappings* :");
		if (mappings != null)
		{
		int i5=0;
		for (i5=0; i5<mappings.size(); i5++)
		{
			if (i5 > 0)
				auditStr.append(",");
			ims.core.clinical.domain.objects.NonUniqueTaxonomyMap obj = (ims.core.clinical.domain.objects.NonUniqueTaxonomyMap)mappings.get(i5);
		    if (obj != null)
			{
				if (i5 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i5 > 0)
			auditStr.append("] " + i5);
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
		
		String keyClassName = "HrgConfig";
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
		if (this.getHRGCode() != null)
		{
			sb.append("<hRGCode>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getHRGCode().toString()));
			sb.append("</hRGCode>");		
		}
		if (this.getHRGDescription() != null)
		{
			sb.append("<hRGDescription>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getHRGDescription().toString()));
			sb.append("</hRGDescription>");		
		}
		if (this.getCostPounds() != null)
		{
			sb.append("<costPounds>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCostPounds().toString()));
			sb.append("</costPounds>");		
		}
		if (this.getCostPence() != null)
		{
			sb.append("<costPence>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCostPence().toString()));
			sb.append("</costPence>");		
		}
		if (this.getMappings() != null)
		{
			if (this.getMappings().size() > 0 )
			{
			sb.append("<mappings>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getMappings(), domMap));
			sb.append("</mappings>");		
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
			HrgConfig domainObject = getHrgConfigfromXML(itemEl, factory, domMap);

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
			HrgConfig domainObject = getHrgConfigfromXML(itemEl, factory, domMap);

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
		
	public static HrgConfig getHrgConfigfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getHrgConfigfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static HrgConfig getHrgConfigfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!HrgConfig.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!HrgConfig.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the HrgConfig class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (HrgConfig)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(HrgConfig.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		HrgConfig ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (HrgConfig)factory.getImportedDomainObject(HrgConfig.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new HrgConfig();
		}
		String keyClassName = "HrgConfig";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (HrgConfig)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, HrgConfig obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("hRGCode");
		if(fldEl != null)
		{	
    		obj.setHRGCode(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("hRGDescription");
		if(fldEl != null)
		{	
    		obj.setHRGDescription(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("costPounds");
		if(fldEl != null)
		{	
    		obj.setCostPounds(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("costPence");
		if(fldEl != null)
		{	
    		obj.setCostPence(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("mappings");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setMappings(ims.core.clinical.domain.objects.NonUniqueTaxonomyMap.fromListXMLString(fldEl, factory, obj.getMappings(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "mappings"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String HRGCode = "hRGCode";
		public static final String HRGDescription = "hRGDescription";
		public static final String CostPounds = "costPounds";
		public static final String CostPence = "costPence";
		public static final String Mappings = "mappings";
	}
}

