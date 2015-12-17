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
package ims.core.patient.domain.objects;

/**
 * 
 * @author John MacEnri
 * Generated.
 */


public class PatientId extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1001100004;
	private static final long serialVersionUID = 1001100004L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private ims.domain.lookups.LookupInstance type;
	private String value;
	/** Default 0, used for NHS Number verification */
	private Boolean verified;
	/** Flag to indicate whether this id is from a Merged Patient */
	private Boolean merged;
    public PatientId (Integer id, int ver)
    {
    	super(id, ver);
		isComponentClass=true;
    }
    public PatientId ()
    {
    	super();
		isComponentClass=true;
    }
    public PatientId (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
		isComponentClass=true;
    }
	public Class getRealDomainClass()
	{
		return ims.core.patient.domain.objects.PatientId.class;
	}


	public ims.domain.lookups.LookupInstance getType() {
		return type;
	}
	public void setType(ims.domain.lookups.LookupInstance type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		if ( null != value && value.length() > 50 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for value. Tried to set value: "+
				value);
		}
		this.value = value;
	}

	public Boolean isVerified() {
		return verified;
	}
	public void setVerified(Boolean verified) {
		this.verified = verified;
	}

	public Boolean isMerged() {
		return merged;
	}
	public void setMerged(Boolean merged) {
		this.merged = merged;
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
	// method generated based on 'type_val_idx' unique index.
	public static boolean recordExistForTypeAndValueAndVerified(ims.domain.ILightweightDomainFactory factory,
		 ims.domain.lookups.LookupInstance type
	,
	 String value
	,
	 Boolean verified
	)	
	{
		return recordExistForTypeAndValueAndVerified(factory, type, value, verified, null);
	}	

	// method generated based on 'type_val_idx' unique index.
	public static boolean recordExistForTypeAndValueAndVerified(ims.domain.ILightweightDomainFactory factory,
		 ims.domain.lookups.LookupInstance type
	,
	 String value
	,
	 Boolean verified
	, Integer recordId)	
	{
		String[] names = new String[3];
		Object[] values = new Object[3];
		StringBuffer hql = new StringBuffer();
		
		hql.append("from PatientId c where ");
		hql.append(" c.type = :type ");
		names[0] = "type";
		values[0] = type;		
		hql.append(" and "); 
		hql.append(" c.value = :value ");
		names[1] = "value";
		values[1] = value;		
		hql.append(" and "); 
		hql.append(" c.verified = :verified ");
		names[2] = "verified";
		values[2] = verified;		
		if(recordId != null)
		{
			hql.append(" and c.id <> " + recordId);
		}
		
		return factory.count(hql.toString(), names, values) > 0;				
	}	

	// method generated based on 'type_val_idx' unique index.
	public static PatientId getRecordByTypeAndValueAndVerified(ims.domain.ILightweightDomainFactory factory,
	 ims.domain.lookups.LookupInstance type
	,
	 String value
	,
	 Boolean verified
	)
	{
		String[] names = new String[3];
		Object[] values = new Object[3];
		StringBuffer hql = new StringBuffer();
		hql.append("from PatientId c where ");
		hql.append(" c.type = :type ");
		names[0] = "type";
		values[0] = type;		
		hql.append(" and "); 
		hql.append(" c.value = :value ");
		names[1] = "value";
		values[1] = value;		
		hql.append(" and "); 
		hql.append(" c.verified = :verified ");
		names[2] = "verified";
		values[2] = verified;		
		java.util.List l = factory.find(hql.toString(), names, values);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. " + hql + " returned " + l.size() + " records. " );
		return (PatientId)l.get(0);
	}

	public static PatientId getPatientIdFromtype_val_idx(ims.domain.ILightweightDomainFactory factory,
	 ims.domain.lookups.LookupInstance type
	,
	 String value
	,
	 Boolean verified
	)
	{
		String[] names = new String[3];
		Object[] values = new Object[3];
		StringBuffer hql = new StringBuffer();
		hql.append("from PatientId c where ");
		hql.append(" c.type = :type ");
		names[0] = "type";
		values[0] = type;		
		hql.append(" and "); 
		hql.append(" c.value = :value ");
		names[1] = "value";
		values[1] = value;		
		hql.append(" and "); 
		hql.append(" c.verified = :verified ");
		names[2] = "verified";
		values[2] = verified;		
		java.util.List l = factory.find(hql.toString(), names, values);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. " + hql + " returned " + l.size() + " records. " );
		return (PatientId)l.get(0);
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
		auditStr.append("\r\n*value* :");
		auditStr.append(value);
	    auditStr.append("; ");
		auditStr.append("\r\n*verified* :");
		auditStr.append(verified);
	    auditStr.append("; ");
		auditStr.append("\r\n*merged* :");
		auditStr.append(merged);
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
		if (this.getType() != null)
		{
			sb.append("<type>");
			sb.append(this.getType().toXMLString()); 
			sb.append("</type>");		
		}
		if (this.getValue() != null)
		{
			sb.append("<value>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getValue().toString()));
			sb.append("</value>");		
		}
		if (this.isVerified() != null)
		{
			sb.append("<verified>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isVerified().toString()));
			sb.append("</verified>");		
		}
		if (this.isMerged() != null)
		{
			sb.append("<merged>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isMerged().toString()));
			sb.append("</merged>");		
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
			PatientId domainObject = getPatientIdfromXML(itemEl, factory, domMap);

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
			PatientId domainObject = getPatientIdfromXML(itemEl, factory, domMap);

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
		
	public static PatientId getPatientIdfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPatientIdfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PatientId getPatientIdfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PatientId.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PatientId.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PatientId class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PatientId)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PatientId.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PatientId ret = null;
		if (ret == null)
		{
			ret = new PatientId();
		}
		fillFieldsfromXML(el, factory, ret, domMap);
		return ret;
	}

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PatientId obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("type");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("value");
		if(fldEl != null)
		{	
    		obj.setValue(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("verified");
		if(fldEl != null)
		{	
    		obj.setVerified(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("merged");
		if(fldEl != null)
		{	
    		obj.setMerged(new Boolean(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		};
	}

	/**
	equals:
	*/
public boolean equals(Object obj)
	{
		if (null == obj) {
			return false;
		}
		if (!(obj instanceof ims.core.patient.domain.objects.PatientId)) 
		{
			return false;
		}
		ims.core.patient.domain.objects.PatientId tmp = (ims.core.patient.domain.objects.PatientId)obj;
		return (tmp.getType().equals(this.getType()) && tmp.getValue().equals(this.getValue()) &&
		((tmp.isVerified() == null && this.isVerified() == null) || (tmp.isVerified() != null && tmp.isVerified().equals(this.isVerified()))));		
	}

	/**
	hashcode:
	*/
	public int hashCode()
	{
		int result = 0;
		if(this.getType() != null)
		{
			result += this.getType().hashCode();
		}
		if(this.getValue() != null)
		{
			result += this.getValue().hashCode();
		}

		return result;
	}


	/**
	toString
	*/
public String toString()
	{	
		StringBuffer objStr = new StringBuffer();
	
		if (type != null)
			objStr.append(type.getText() + "-");
		objStr.append(value);
            if (verified != null)
                  objStr.append(":" + verified);
		return objStr.toString();
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Type = "type";
		public static final String Value = "value";
		public static final String Verified = "verified";
		public static final String Merged = "merged";
	}
}

