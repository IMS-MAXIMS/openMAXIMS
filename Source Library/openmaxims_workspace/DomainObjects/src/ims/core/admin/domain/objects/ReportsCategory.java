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
 * @author John MacEnri
 * Generated.
 */


public class ReportsCategory extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1004100022;
	private static final long serialVersionUID = 1004100022L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Name */
	private String name;
	/** Reports
	  * Collection of ims.core.admin.domain.objects.ReportBo.
	  */
	private java.util.Set reports;
	/** ParentCategory */
	private ims.core.admin.domain.objects.ReportsCategory parentCategory;
	/** 
	  * Collection of ims.core.admin.domain.objects.ReportsCategory.
	  */
	private java.util.Set subCategories;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ReportsCategory (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ReportsCategory ()
    {
    	super();
    }
    public ReportsCategory (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.admin.domain.objects.ReportsCategory.class;
	}


	public String getName() {
		return name;
	}
	public static ReportsCategory getReportsCategoryFromName(ims.domain.ILightweightDomainFactory factory, String val)
	{
		String hql = "from ReportsCategory c where c.name = :name";		
		java.util.List l = factory.find(hql, new String[]{"name"}, new Object[]{val});
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. ReportsCategory.name = " + val + " returned " + l.size() + " records. " );
		return (ReportsCategory)l.get(0);
	}
	public void setName(String name) {
		if ( null != name && name.length() > 50 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for name. Tried to set value: "+
				name);
		}
		this.name = name;
	}

	public java.util.Set getReports() {
		if ( null == reports ) {
			reports = new java.util.HashSet();
		}
		return reports;
	}
	public void setReports(java.util.Set paramValue) {
		this.reports = paramValue;
	}

	public ims.core.admin.domain.objects.ReportsCategory getParentCategory() {
		return parentCategory;
	}
	public void setParentCategory(ims.core.admin.domain.objects.ReportsCategory parentCategory) {
		this.parentCategory = parentCategory;
	}

	public java.util.Set getSubCategories() {
		if ( null == subCategories ) {
			subCategories = new java.util.HashSet();
		}
		return subCategories;
	}
	public void setSubCategories(java.util.Set paramValue) {
		this.subCategories = paramValue;
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
		
		auditStr.append("\r\n*name* :");
		auditStr.append(name);
	    auditStr.append("; ");
		auditStr.append("\r\n*reports* :");
		if (reports != null)
		{
			java.util.Iterator it2 = reports.iterator();
			int i2=0;
			while (it2.hasNext())
			{
				if (i2 > 0)
					auditStr.append(",");
				ims.core.admin.domain.objects.ReportBo obj = (ims.core.admin.domain.objects.ReportBo)it2.next();
		if (obj != null)
		{
		   if (i2 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i2++;
		}
		if (i2 > 0)
			auditStr.append("] " + i2);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*parentCategory* :");
		if (parentCategory != null)
		{
			auditStr.append(toShortClassName(parentCategory));
				
		    auditStr.append(parentCategory.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*subCategories* :");
		if (subCategories != null)
		{
			java.util.Iterator it4 = subCategories.iterator();
			int i4=0;
			while (it4.hasNext())
			{
				if (i4 > 0)
					auditStr.append(",");
				ims.core.admin.domain.objects.ReportsCategory obj = (ims.core.admin.domain.objects.ReportsCategory)it4.next();
		if (obj != null)
		{
		   if (i4 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i4++;
		}
		if (i4 > 0)
			auditStr.append("] " + i4);
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
		
		String keyClassName = "ReportsCategory";
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
		if (this.getReports() != null)
		{
			if (this.getReports().size() > 0 )
			{
			sb.append("<reports>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getReports(), domMap));
			sb.append("</reports>");		
			}
		}
		if (this.getParentCategory() != null)
		{
			sb.append("<parentCategory>");
			sb.append(this.getParentCategory().toXMLString(domMap)); 	
			sb.append("</parentCategory>");		
		}
		if (this.getSubCategories() != null)
		{
			if (this.getSubCategories().size() > 0 )
			{
			sb.append("<subCategories>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getSubCategories(), domMap));
			sb.append("</subCategories>");		
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
			ReportsCategory domainObject = getReportsCategoryfromXML(itemEl, factory, domMap);

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
			ReportsCategory domainObject = getReportsCategoryfromXML(itemEl, factory, domMap);

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
		
	public static ReportsCategory getReportsCategoryfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getReportsCategoryfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ReportsCategory getReportsCategoryfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ReportsCategory.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ReportsCategory.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ReportsCategory class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ReportsCategory)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ReportsCategory.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ReportsCategory ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ReportsCategory)factory.getImportedDomainObject(ReportsCategory.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ReportsCategory();
		}
		String keyClassName = "ReportsCategory";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ReportsCategory)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ReportsCategory obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("name");
		if(fldEl != null)
		{	
    		obj.setName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("reports");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setReports(ims.core.admin.domain.objects.ReportBo.fromSetXMLString(fldEl, factory, obj.getReports(), domMap));
		}
		fldEl = el.element("parentCategory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setParentCategory(ims.core.admin.domain.objects.ReportsCategory.getReportsCategoryfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("subCategories");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setSubCategories(ims.core.admin.domain.objects.ReportsCategory.fromSetXMLString(fldEl, factory, obj.getSubCategories(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "reports"
		, "subCategories"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Name = "name";
		public static final String Reports = "reports";
		public static final String ParentCategory = "parentCategory";
		public static final String SubCategories = "subCategories";
	}
}

