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
package ims.core.clinical.coding.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class Icd10AmBlock extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1037100000;
	private static final long serialVersionUID = 1037100000L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** ascii_desc */
	private String ascii_desc;
	/** ascii_short_desc */
	private String ascii_short_desc;
	/** effective_from */
	private java.util.Date effective_from;
	/** inactive */
	private java.util.Date inactive;
    public Icd10AmBlock (Integer id, int ver)
    {
    	super(id, ver);
    }
    public Icd10AmBlock ()
    {
    	super();
    }
    public Icd10AmBlock (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.clinical.coding.domain.objects.Icd10AmBlock.class;
	}


	public String getAscii_desc() {
		return ascii_desc;
	}
	public void setAscii_desc(String ascii_desc) {
		if ( null != ascii_desc && ascii_desc.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for ascii_desc. Tried to set value: "+
				ascii_desc);
		}
		this.ascii_desc = ascii_desc;
	}

	public String getAscii_short_desc() {
		return ascii_short_desc;
	}
	public void setAscii_short_desc(String ascii_short_desc) {
		if ( null != ascii_short_desc && ascii_short_desc.length() > 40 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for ascii_short_desc. Tried to set value: "+
				ascii_short_desc);
		}
		this.ascii_short_desc = ascii_short_desc;
	}

	public java.util.Date getEffective_from() {
		return effective_from;
	}
	public void setEffective_from(java.util.Date effective_from) {
		this.effective_from = effective_from;
	}

	public java.util.Date getInactive() {
		return inactive;
	}
	public void setInactive(java.util.Date inactive) {
		this.inactive = inactive;
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
		
		auditStr.append("\r\n*ascii_desc* :");
		auditStr.append(ascii_desc);
	    auditStr.append("; ");
		auditStr.append("\r\n*ascii_short_desc* :");
		auditStr.append(ascii_short_desc);
	    auditStr.append("; ");
		auditStr.append("\r\n*effective_from* :");
		auditStr.append(effective_from);
	    auditStr.append("; ");
		auditStr.append("\r\n*inactive* :");
		auditStr.append(inactive);
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
		
		String keyClassName = "Icd10AmBlock";
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
		if (this.getAscii_desc() != null)
		{
			sb.append("<ascii_desc>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAscii_desc().toString()));
			sb.append("</ascii_desc>");		
		}
		if (this.getAscii_short_desc() != null)
		{
			sb.append("<ascii_short_desc>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAscii_short_desc().toString()));
			sb.append("</ascii_short_desc>");		
		}
		if (this.getEffective_from() != null)
		{
			sb.append("<effective_from>");
			sb.append(new ims.framework.utils.DateTime(this.getEffective_from()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</effective_from>");		
		}
		if (this.getInactive() != null)
		{
			sb.append("<inactive>");
			sb.append(new ims.framework.utils.DateTime(this.getInactive()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</inactive>");		
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
			Icd10AmBlock domainObject = getIcd10AmBlockfromXML(itemEl, factory, domMap);

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
			Icd10AmBlock domainObject = getIcd10AmBlockfromXML(itemEl, factory, domMap);

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
		
	public static Icd10AmBlock getIcd10AmBlockfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getIcd10AmBlockfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static Icd10AmBlock getIcd10AmBlockfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!Icd10AmBlock.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!Icd10AmBlock.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the Icd10AmBlock class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (Icd10AmBlock)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(Icd10AmBlock.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		Icd10AmBlock ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (Icd10AmBlock)factory.getImportedDomainObject(Icd10AmBlock.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new Icd10AmBlock();
		}
		String keyClassName = "Icd10AmBlock";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (Icd10AmBlock)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, Icd10AmBlock obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("ascii_desc");
		if(fldEl != null)
		{	
    		obj.setAscii_desc(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("ascii_short_desc");
		if(fldEl != null)
		{	
    		obj.setAscii_short_desc(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("effective_from");
		if(fldEl != null)
		{	
    		obj.setEffective_from(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("inactive");
		if(fldEl != null)
		{	
    		obj.setInactive(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
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
		public static final String Ascii_desc = "ascii_desc";
		public static final String Ascii_short_desc = "ascii_short_desc";
		public static final String Effective_from = "effective_from";
		public static final String Inactive = "inactive";
	}
}

