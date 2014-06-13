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
package ims.ntpf.exchequer.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class ExchequerMapping extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1078100000;
	private static final long serialVersionUID = 1078100000L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Type - Month or Year */
	private ims.domain.lookups.LookupInstance dateType;
	/** Year or Month value */
	private Integer yearMonth;
	/** ExchequerMapping */
	private String exchequerMapping;
    public ExchequerMapping (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ExchequerMapping ()
    {
    	super();
    }
    public ExchequerMapping (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.ntpf.exchequer.domain.objects.ExchequerMapping.class;
	}


	public ims.domain.lookups.LookupInstance getDateType() {
		return dateType;
	}
	public void setDateType(ims.domain.lookups.LookupInstance dateType) {
		this.dateType = dateType;
	}

	public Integer getYearMonth() {
		return yearMonth;
	}
	public void setYearMonth(Integer yearMonth) {
		this.yearMonth = yearMonth;
	}

	public String getExchequerMapping() {
		return exchequerMapping;
	}
	public void setExchequerMapping(String exchequerMapping) {
		this.exchequerMapping = exchequerMapping;
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
	// method generated based on 'exchequermapping_idx1' unique index.
	public static boolean recordExistForDateTypeAndYearMonth(ims.domain.ILightweightDomainFactory factory,
		 ims.domain.lookups.LookupInstance dateType
	,
	 Integer yearMonth
	)	
	{
		return recordExistForDateTypeAndYearMonth(factory, dateType, yearMonth, null);
	}	

	// method generated based on 'exchequermapping_idx1' unique index.
	public static boolean recordExistForDateTypeAndYearMonth(ims.domain.ILightweightDomainFactory factory,
		 ims.domain.lookups.LookupInstance dateType
	,
	 Integer yearMonth
	, Integer recordId)	
	{
		String[] names = new String[2];
		Object[] values = new Object[2];
		StringBuffer hql = new StringBuffer();
		
		hql.append("from ExchequerMapping c where ");
		hql.append(" c.dateType = :dateType ");
		names[0] = "dateType";
		values[0] = dateType;		
		hql.append(" and "); 
		hql.append(" c.yearMonth = :yearMonth ");
		names[1] = "yearMonth";
		values[1] = yearMonth;		
		if(recordId != null)
		{
			hql.append(" and c.id <> " + recordId);
		}
		
		return factory.count(hql.toString(), names, values) > 0;				
	}	

	// method generated based on 'exchequermapping_idx1' unique index.
	public static ExchequerMapping getRecordByDateTypeAndYearMonth(ims.domain.ILightweightDomainFactory factory,
	 ims.domain.lookups.LookupInstance dateType
	,
	 Integer yearMonth
	)
	{
		String[] names = new String[2];
		Object[] values = new Object[2];
		StringBuffer hql = new StringBuffer();
		hql.append("from ExchequerMapping c where ");
		hql.append(" c.dateType = :dateType ");
		names[0] = "dateType";
		values[0] = dateType;		
		hql.append(" and "); 
		hql.append(" c.yearMonth = :yearMonth ");
		names[1] = "yearMonth";
		values[1] = yearMonth;		
		java.util.List l = factory.find(hql.toString(), names, values);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. " + hql + " returned " + l.size() + " records. " );
		return (ExchequerMapping)l.get(0);
	}

	public static ExchequerMapping getExchequerMappingFromexchequermapping_idx1(ims.domain.ILightweightDomainFactory factory,
	 ims.domain.lookups.LookupInstance dateType
	,
	 Integer yearMonth
	)
	{
		String[] names = new String[2];
		Object[] values = new Object[2];
		StringBuffer hql = new StringBuffer();
		hql.append("from ExchequerMapping c where ");
		hql.append(" c.dateType = :dateType ");
		names[0] = "dateType";
		values[0] = dateType;		
		hql.append(" and "); 
		hql.append(" c.yearMonth = :yearMonth ");
		names[1] = "yearMonth";
		values[1] = yearMonth;		
		java.util.List l = factory.find(hql.toString(), names, values);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. " + hql + " returned " + l.size() + " records. " );
		return (ExchequerMapping)l.get(0);
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
		
		auditStr.append("\r\n*dateType* :");
		if (dateType != null)
			auditStr.append(dateType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*yearMonth* :");
		auditStr.append(yearMonth);
	    auditStr.append("; ");
		auditStr.append("\r\n*exchequerMapping* :");
		auditStr.append(exchequerMapping);
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
		
		String keyClassName = "ExchequerMapping";
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
		if (this.getDateType() != null)
		{
			sb.append("<dateType>");
			sb.append(this.getDateType().toXMLString()); 
			sb.append("</dateType>");		
		}
		if (this.getYearMonth() != null)
		{
			sb.append("<yearMonth>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getYearMonth().toString()));
			sb.append("</yearMonth>");		
		}
		if (this.getExchequerMapping() != null)
		{
			sb.append("<exchequerMapping>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getExchequerMapping().toString()));
			sb.append("</exchequerMapping>");		
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
			ExchequerMapping domainObject = getExchequerMappingfromXML(itemEl, factory, domMap);

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
			ExchequerMapping domainObject = getExchequerMappingfromXML(itemEl, factory, domMap);

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
		
	public static ExchequerMapping getExchequerMappingfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getExchequerMappingfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ExchequerMapping getExchequerMappingfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ExchequerMapping.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ExchequerMapping.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ExchequerMapping class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ExchequerMapping)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ExchequerMapping.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ExchequerMapping ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ExchequerMapping)factory.getImportedDomainObject(ExchequerMapping.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ExchequerMapping();
		}
		String keyClassName = "ExchequerMapping";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ExchequerMapping)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ExchequerMapping obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("dateType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDateType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("yearMonth");
		if(fldEl != null)
		{	
    		obj.setYearMonth(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("exchequerMapping");
		if(fldEl != null)
		{	
    		obj.setExchequerMapping(new String(fldEl.getTextTrim()));	
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
		public static final String DateType = "dateType";
		public static final String YearMonth = "yearMonth";
		public static final String ExchequerMapping = "exchequerMapping";
	}
}

