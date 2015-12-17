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
package ims.correspondence.configuration.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class GlossaryProfile extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1053100001;
	private static final long serialVersionUID = 1053100001L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** The ID of the specifier (Consultant, Specialty) */
	private Integer specifierID;
	/** The Specifier Type */
	private ims.domain.lookups.LookupInstance specifierType;
	/** Glossaries
	  * Collection of ims.correspondence.configuration.domain.objects.Glossary.
	  */
	private java.util.Set glossaries;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public GlossaryProfile (Integer id, int ver)
    {
    	super(id, ver);
    }
    public GlossaryProfile ()
    {
    	super();
    }
    public GlossaryProfile (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.correspondence.configuration.domain.objects.GlossaryProfile.class;
	}


	public Integer getSpecifierID() {
		return specifierID;
	}
	public void setSpecifierID(Integer specifierID) {
		this.specifierID = specifierID;
	}

	public ims.domain.lookups.LookupInstance getSpecifierType() {
		return specifierType;
	}
	public void setSpecifierType(ims.domain.lookups.LookupInstance specifierType) {
		this.specifierType = specifierType;
	}

	public java.util.Set getGlossaries() {
		if ( null == glossaries ) {
			glossaries = new java.util.HashSet();
		}
		return glossaries;
	}
	public void setGlossaries(java.util.Set paramValue) {
		this.glossaries = paramValue;
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
	// method generated based on 'specifier_unq_idx1' unique index.
	public static boolean recordExistForSpecifierIDAndSpecifierType(ims.domain.ILightweightDomainFactory factory,
		 Integer specifierID
	,
	 ims.domain.lookups.LookupInstance specifierType
	)	
	{
		return recordExistForSpecifierIDAndSpecifierType(factory, specifierID, specifierType, null);
	}	

	// method generated based on 'specifier_unq_idx1' unique index.
	public static boolean recordExistForSpecifierIDAndSpecifierType(ims.domain.ILightweightDomainFactory factory,
		 Integer specifierID
	,
	 ims.domain.lookups.LookupInstance specifierType
	, Integer recordId)	
	{
		String[] names = new String[2];
		Object[] values = new Object[2];
		StringBuffer hql = new StringBuffer();
		
		hql.append("from GlossaryProfile c where ");
		hql.append(" c.specifierID = :specifierID ");
		names[0] = "specifierID";
		values[0] = specifierID;		
		hql.append(" and "); 
		hql.append(" c.specifierType = :specifierType ");
		names[1] = "specifierType";
		values[1] = specifierType;		
		if(recordId != null)
		{
			hql.append(" and c.id <> " + recordId);
		}
		
		return factory.count(hql.toString(), names, values) > 0;				
	}	

	// method generated based on 'specifier_unq_idx1' unique index.
	public static GlossaryProfile getRecordBySpecifierIDAndSpecifierType(ims.domain.ILightweightDomainFactory factory,
	 Integer specifierID
	,
	 ims.domain.lookups.LookupInstance specifierType
	)
	{
		String[] names = new String[2];
		Object[] values = new Object[2];
		StringBuffer hql = new StringBuffer();
		hql.append("from GlossaryProfile c where ");
		hql.append(" c.specifierID = :specifierID ");
		names[0] = "specifierID";
		values[0] = specifierID;		
		hql.append(" and "); 
		hql.append(" c.specifierType = :specifierType ");
		names[1] = "specifierType";
		values[1] = specifierType;		
		java.util.List l = factory.find(hql.toString(), names, values);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. " + hql + " returned " + l.size() + " records. " );
		return (GlossaryProfile)l.get(0);
	}

	public static GlossaryProfile getGlossaryProfileFromspecifier_unq_idx1(ims.domain.ILightweightDomainFactory factory,
	 Integer specifierID
	,
	 ims.domain.lookups.LookupInstance specifierType
	)
	{
		String[] names = new String[2];
		Object[] values = new Object[2];
		StringBuffer hql = new StringBuffer();
		hql.append("from GlossaryProfile c where ");
		hql.append(" c.specifierID = :specifierID ");
		names[0] = "specifierID";
		values[0] = specifierID;		
		hql.append(" and "); 
		hql.append(" c.specifierType = :specifierType ");
		names[1] = "specifierType";
		values[1] = specifierType;		
		java.util.List l = factory.find(hql.toString(), names, values);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. " + hql + " returned " + l.size() + " records. " );
		return (GlossaryProfile)l.get(0);
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
		
		auditStr.append("\r\n*specifierID* :");
		auditStr.append(specifierID);
	    auditStr.append("; ");
		auditStr.append("\r\n*specifierType* :");
		if (specifierType != null)
			auditStr.append(specifierType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*glossaries* :");
		if (glossaries != null)
		{
			java.util.Iterator it3 = glossaries.iterator();
			int i3=0;
			while (it3.hasNext())
			{
				if (i3 > 0)
					auditStr.append(",");
				ims.correspondence.configuration.domain.objects.Glossary obj = (ims.correspondence.configuration.domain.objects.Glossary)it3.next();
		if (obj != null)
		{
		   if (i3 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i3++;
		}
		if (i3 > 0)
			auditStr.append("] " + i3);
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
		
		String keyClassName = "GlossaryProfile";
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
		if (this.getSpecifierID() != null)
		{
			sb.append("<specifierID>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSpecifierID().toString()));
			sb.append("</specifierID>");		
		}
		if (this.getSpecifierType() != null)
		{
			sb.append("<specifierType>");
			sb.append(this.getSpecifierType().toXMLString()); 
			sb.append("</specifierType>");		
		}
		if (this.getGlossaries() != null)
		{
			if (this.getGlossaries().size() > 0 )
			{
			sb.append("<glossaries>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getGlossaries(), domMap));
			sb.append("</glossaries>");		
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
			GlossaryProfile domainObject = getGlossaryProfilefromXML(itemEl, factory, domMap);

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
			GlossaryProfile domainObject = getGlossaryProfilefromXML(itemEl, factory, domMap);

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
		
	public static GlossaryProfile getGlossaryProfilefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getGlossaryProfilefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static GlossaryProfile getGlossaryProfilefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!GlossaryProfile.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!GlossaryProfile.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the GlossaryProfile class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (GlossaryProfile)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(GlossaryProfile.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		GlossaryProfile ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (GlossaryProfile)factory.getImportedDomainObject(GlossaryProfile.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new GlossaryProfile();
		}
		String keyClassName = "GlossaryProfile";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (GlossaryProfile)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, GlossaryProfile obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("specifierID");
		if(fldEl != null)
		{	
    		obj.setSpecifierID(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("specifierType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSpecifierType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("glossaries");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setGlossaries(ims.correspondence.configuration.domain.objects.Glossary.fromSetXMLString(fldEl, factory, obj.getGlossaries(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "glossaries"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String SpecifierID = "specifierID";
		public static final String SpecifierType = "specifierType";
		public static final String Glossaries = "glossaries";
	}
}

