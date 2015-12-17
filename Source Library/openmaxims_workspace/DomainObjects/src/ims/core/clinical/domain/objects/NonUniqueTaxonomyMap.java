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
package ims.core.clinical.domain.objects;

/**
 * 
 * @author John MacEnri
 * Generated.
 */


public class NonUniqueTaxonomyMap extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1003100071;
	private static final long serialVersionUID = 1003100071L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private ims.domain.lookups.LookupInstance taxonomyName;
	private String taxonomyCode;
	private java.util.Date effectiveFrom;
	private java.util.Date effectiveTo;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public NonUniqueTaxonomyMap (Integer id, int ver)
    {
    	super(id, ver);
		isComponentClass=true;
    }
    public NonUniqueTaxonomyMap ()
    {
    	super();
		isComponentClass=true;
    }
    public NonUniqueTaxonomyMap (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
		isComponentClass=true;
    }
	public Class getRealDomainClass()
	{
		return ims.core.clinical.domain.objects.NonUniqueTaxonomyMap.class;
	}


	public ims.domain.lookups.LookupInstance getTaxonomyName() {
		return taxonomyName;
	}
	public void setTaxonomyName(ims.domain.lookups.LookupInstance taxonomyName) {
		this.taxonomyName = taxonomyName;
	}

	public String getTaxonomyCode() {
		return taxonomyCode;
	}
	public void setTaxonomyCode(String taxonomyCode) {
		if ( null != taxonomyCode && taxonomyCode.length() > 30 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for taxonomyCode. Tried to set value: "+
				taxonomyCode);
		}
		this.taxonomyCode = taxonomyCode;
	}

	public java.util.Date getEffectiveFrom() {
		return effectiveFrom;
	}
	public void setEffectiveFrom(java.util.Date effectiveFrom) {
		this.effectiveFrom = effectiveFrom;
	}

	public java.util.Date getEffectiveTo() {
		return effectiveTo;
	}
	public void setEffectiveTo(java.util.Date effectiveTo) {
		this.effectiveTo = effectiveTo;
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
		
		auditStr.append("\r\n*taxonomyName* :");
		if (taxonomyName != null)
			auditStr.append(taxonomyName.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*taxonomyCode* :");
		auditStr.append(taxonomyCode);
	    auditStr.append("; ");
		auditStr.append("\r\n*effectiveFrom* :");
		auditStr.append(effectiveFrom);
	    auditStr.append("; ");
		auditStr.append("\r\n*effectiveTo* :");
		auditStr.append(effectiveTo);
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
		sb.append(" source=\"" + ims.configuration.EnvironmentConfig.getImportExportSourceName() + "\" ");
		sb.append(" classVersion=\"" + this.getClassVersion() + "\" ");
		sb.append(" component=\"" + this.getIsComponentClass() + "\" >");
		
		if (domMap.get(this) == null)
		{
			domMap.put(this, this);
			sb.append(this.fieldsToXMLString(domMap));
		}
		sb.append("</class>");
		
		
		return sb.toString();
	}

	public String fieldsToXMLString(java.util.HashMap domMap)
	{
		StringBuffer sb = new StringBuffer();
		if (this.getTaxonomyName() != null)
		{
			sb.append("<taxonomyName>");
			sb.append(this.getTaxonomyName().toXMLString()); 
			sb.append("</taxonomyName>");		
		}
		if (this.getTaxonomyCode() != null)
		{
			sb.append("<taxonomyCode>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTaxonomyCode().toString()));
			sb.append("</taxonomyCode>");		
		}
		if (this.getEffectiveFrom() != null)
		{
			sb.append("<effectiveFrom>");
			sb.append(new ims.framework.utils.DateTime(this.getEffectiveFrom()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</effectiveFrom>");		
		}
		if (this.getEffectiveTo() != null)
		{
			sb.append("<effectiveTo>");
			sb.append(new ims.framework.utils.DateTime(this.getEffectiveTo()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</effectiveTo>");		
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
			NonUniqueTaxonomyMap domainObject = getNonUniqueTaxonomyMapfromXML(itemEl, factory, domMap);

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
			NonUniqueTaxonomyMap domainObject = getNonUniqueTaxonomyMapfromXML(itemEl, factory, domMap);

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
		
	public static NonUniqueTaxonomyMap getNonUniqueTaxonomyMapfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getNonUniqueTaxonomyMapfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static NonUniqueTaxonomyMap getNonUniqueTaxonomyMapfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!NonUniqueTaxonomyMap.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!NonUniqueTaxonomyMap.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the NonUniqueTaxonomyMap class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (NonUniqueTaxonomyMap)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(NonUniqueTaxonomyMap.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		NonUniqueTaxonomyMap ret = null;
		if (ret == null)
		{
			ret = new NonUniqueTaxonomyMap();
		}
		fillFieldsfromXML(el, factory, ret, domMap);
		return ret;
	}

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, NonUniqueTaxonomyMap obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("taxonomyName");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTaxonomyName(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("taxonomyCode");
		if(fldEl != null)
		{	
    		obj.setTaxonomyCode(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("effectiveFrom");
		if(fldEl != null)
		{	
    		obj.setEffectiveFrom(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("effectiveTo");
		if(fldEl != null)
		{	
    		obj.setEffectiveTo(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		};
	}

	/**
	equals
	*/
public boolean equals(Object obj)
{
	if (null == obj)
	{
		return false;
	}
	if(!(obj instanceof NonUniqueTaxonomyMap))
	{
           return false;
	}
	NonUniqueTaxonomyMap compareObj=(NonUniqueTaxonomyMap)obj;
	if((taxonomyCode==null ? compareObj.taxonomyCode == null : taxonomyCode.equals(compareObj.taxonomyCode))&&
		(taxonomyName==null ? compareObj.taxonomyName==null : taxonomyName.equals(compareObj.taxonomyName))&&
		(effectiveFrom==null? compareObj.effectiveFrom==null : effectiveFrom.equals(compareObj.effectiveFrom))&&
		(effectiveTo==null? compareObj.effectiveTo==null : effectiveTo.equals(compareObj.effectiveTo)))
		return true;
	return super.equals(obj);
}


	/**
	toString
	*/
public String toString()
	{	
		StringBuffer objStr = new StringBuffer();
	
		if (taxonomyName != null)
			objStr.append(taxonomyName.getText() + "-");
		objStr.append(taxonomyCode);
		return objStr.toString();
	}

	/**
	hashcode
	*/
public int hashCode()
{
	int hash = 0;
	if (taxonomyName!= null) hash += taxonomyName.hashCode()* 10011;
	if (taxonomyCode!= null) hash += taxonomyCode.hashCode();
	if (effectiveFrom!= null) hash += effectiveFrom.hashCode();
	if (effectiveTo!= null) hash += effectiveTo.hashCode();
	return hash;
}



	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String TaxonomyName = "taxonomyName";
		public static final String TaxonomyCode = "taxonomyCode";
		public static final String EffectiveFrom = "effectiveFrom";
		public static final String EffectiveTo = "effectiveTo";
	}
}

