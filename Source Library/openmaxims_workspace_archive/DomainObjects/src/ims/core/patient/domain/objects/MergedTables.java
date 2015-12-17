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
 * @author Barbara Worwood
 * Generated.
 */


public class MergedTables extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1001100012;
	private static final long serialVersionUID = 1001100012L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Name of the database table updated */
	private String tableName;
	/** Name of the hib object that was affected */
	private String entityName;
	/** Id of the row that was updated on the table */
	private Integer objectId;
	/** Name of the Attribute being updated */
	private String attributeName;
    public MergedTables (Integer id, int ver)
    {
    	super(id, ver);
		isComponentClass=true;
    }
    public MergedTables ()
    {
    	super();
		isComponentClass=true;
    }
    public MergedTables (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
		isComponentClass=true;
    }
	public Class getRealDomainClass()
	{
		return ims.core.patient.domain.objects.MergedTables.class;
	}


	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		if ( null != tableName && tableName.length() > 50 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for tableName. Tried to set value: "+
				tableName);
		}
		this.tableName = tableName;
	}

	public String getEntityName() {
		return entityName;
	}
	public void setEntityName(String entityName) {
		if ( null != entityName && entityName.length() > 250 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for entityName. Tried to set value: "+
				entityName);
		}
		this.entityName = entityName;
	}

	public Integer getObjectId() {
		return objectId;
	}
	public void setObjectId(Integer objectId) {
		this.objectId = objectId;
	}

	public String getAttributeName() {
		return attributeName;
	}
	public void setAttributeName(String attributeName) {
		if ( null != attributeName && attributeName.length() > 250 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for attributeName. Tried to set value: "+
				attributeName);
		}
		this.attributeName = attributeName;
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
		
		auditStr.append("\r\n*tableName* :");
		auditStr.append(tableName);
	    auditStr.append("; ");
		auditStr.append("\r\n*entityName* :");
		auditStr.append(entityName);
	    auditStr.append("; ");
		auditStr.append("\r\n*objectId* :");
		auditStr.append(objectId);
	    auditStr.append("; ");
		auditStr.append("\r\n*attributeName* :");
		auditStr.append(attributeName);
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
		if (this.getTableName() != null)
		{
			sb.append("<tableName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTableName().toString()));
			sb.append("</tableName>");		
		}
		if (this.getEntityName() != null)
		{
			sb.append("<entityName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getEntityName().toString()));
			sb.append("</entityName>");		
		}
		if (this.getObjectId() != null)
		{
			sb.append("<objectId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getObjectId().toString()));
			sb.append("</objectId>");		
		}
		if (this.getAttributeName() != null)
		{
			sb.append("<attributeName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAttributeName().toString()));
			sb.append("</attributeName>");		
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
			MergedTables domainObject = getMergedTablesfromXML(itemEl, factory, domMap);

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
			MergedTables domainObject = getMergedTablesfromXML(itemEl, factory, domMap);

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
		
	public static MergedTables getMergedTablesfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getMergedTablesfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static MergedTables getMergedTablesfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!MergedTables.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!MergedTables.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the MergedTables class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (MergedTables)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(MergedTables.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		MergedTables ret = null;
		if (ret == null)
		{
			ret = new MergedTables();
		}
		fillFieldsfromXML(el, factory, ret, domMap);
		return ret;
	}

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, MergedTables obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("tableName");
		if(fldEl != null)
		{	
    		obj.setTableName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("entityName");
		if(fldEl != null)
		{	
    		obj.setEntityName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("objectId");
		if(fldEl != null)
		{	
    		obj.setObjectId(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("attributeName");
		if(fldEl != null)
		{	
    		obj.setAttributeName(new String(fldEl.getTextTrim()));	
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
		public static final String TableName = "tableName";
		public static final String EntityName = "entityName";
		public static final String ObjectId = "objectId";
		public static final String AttributeName = "attributeName";
	}
}

