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
package ims.oncology.configuration.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class TumourSite extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1074100010;
	private static final long serialVersionUID = 1074100010L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Name */
	private String name;
	/** Description */
	private String description;
	/** Histologies
	  * Collection of ims.oncology.configuration.domain.objects.TumourGroupHistology.
	  */
	private java.util.List histologies;
	/** TNMValues
	  * Collection of ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue.
	  */
	private java.util.List tNMValues;
	/** TaxonomyMap
	  * Collection of ims.core.clinical.domain.objects.TaxonomyMap.
	  */
	private java.util.List taxonomyMap;
	/** isActive */
	private Boolean isActive;
	/** hasSiteSpecificTNM */
	private Boolean hasSiteSpecificTNM;
	/** hasSiteSpecificHistology */
	private Boolean hasSiteSpecificHistology;
	/** Version */
	private ims.oncology.configuration.domain.objects.TNMStagingClassificationVersion tNMVersion;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public TumourSite (Integer id, int ver)
    {
    	super(id, ver);
    }
    public TumourSite ()
    {
    	super();
    }
    public TumourSite (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.oncology.configuration.domain.objects.TumourSite.class;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		if ( null != name && name.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for name. Tried to set value: "+
				name);
		}
		this.name = name;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		if ( null != description && description.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for description. Tried to set value: "+
				description);
		}
		this.description = description;
	}

	public java.util.List getHistologies() {
		if ( null == histologies ) {
			histologies = new java.util.ArrayList();
		}
		return histologies;
	}
	public void setHistologies(java.util.List paramValue) {
		this.histologies = paramValue;
	}

	public java.util.List getTNMValues() {
		if ( null == tNMValues ) {
			tNMValues = new java.util.ArrayList();
		}
		return tNMValues;
	}
	public void setTNMValues(java.util.List paramValue) {
		this.tNMValues = paramValue;
	}

	public java.util.List getTaxonomyMap() {
		if ( null == taxonomyMap ) {
			taxonomyMap = new java.util.ArrayList();
		}
		return taxonomyMap;
	}
	public void setTaxonomyMap(java.util.List paramValue) {
		this.taxonomyMap = paramValue;
	}

	public Boolean isIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean isHasSiteSpecificTNM() {
		return hasSiteSpecificTNM;
	}
	public void setHasSiteSpecificTNM(Boolean hasSiteSpecificTNM) {
		this.hasSiteSpecificTNM = hasSiteSpecificTNM;
	}

	public Boolean isHasSiteSpecificHistology() {
		return hasSiteSpecificHistology;
	}
	public void setHasSiteSpecificHistology(Boolean hasSiteSpecificHistology) {
		this.hasSiteSpecificHistology = hasSiteSpecificHistology;
	}

	public ims.oncology.configuration.domain.objects.TNMStagingClassificationVersion getTNMVersion() {
		return tNMVersion;
	}
	public void setTNMVersion(ims.oncology.configuration.domain.objects.TNMStagingClassificationVersion tNMVersion) {
		this.tNMVersion = tNMVersion;
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
		
		auditStr.append("\r\n*name* :");
		auditStr.append(name);
	    auditStr.append("; ");
		auditStr.append("\r\n*description* :");
		auditStr.append(description);
	    auditStr.append("; ");
		auditStr.append("\r\n*histologies* :");
		if (histologies != null)
		{
		int i3=0;
		for (i3=0; i3<histologies.size(); i3++)
		{
			if (i3 > 0)
				auditStr.append(",");
			ims.oncology.configuration.domain.objects.TumourGroupHistology obj = (ims.oncology.configuration.domain.objects.TumourGroupHistology)histologies.get(i3);
		    if (obj != null)
			{
				if (i3 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i3 > 0)
			auditStr.append("] " + i3);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*tNMValues* :");
		if (tNMValues != null)
		{
		int i4=0;
		for (i4=0; i4<tNMValues.size(); i4++)
		{
			if (i4 > 0)
				auditStr.append(",");
			ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue obj = (ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue)tNMValues.get(i4);
		    if (obj != null)
			{
				if (i4 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i4 > 0)
			auditStr.append("] " + i4);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*taxonomyMap* :");
		if (taxonomyMap != null)
		{
		int i5=0;
		for (i5=0; i5<taxonomyMap.size(); i5++)
		{
			if (i5 > 0)
				auditStr.append(",");
			ims.core.clinical.domain.objects.TaxonomyMap obj = (ims.core.clinical.domain.objects.TaxonomyMap)taxonomyMap.get(i5);
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
		auditStr.append("\r\n*isActive* :");
		auditStr.append(isActive);
	    auditStr.append("; ");
		auditStr.append("\r\n*hasSiteSpecificTNM* :");
		auditStr.append(hasSiteSpecificTNM);
	    auditStr.append("; ");
		auditStr.append("\r\n*hasSiteSpecificHistology* :");
		auditStr.append(hasSiteSpecificHistology);
	    auditStr.append("; ");
		auditStr.append("\r\n*tNMVersion* :");
		if (tNMVersion != null)
		{
			auditStr.append(toShortClassName(tNMVersion));
				
		    auditStr.append(tNMVersion.getId());
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
		
		String keyClassName = "TumourSite";
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
		if (this.getDescription() != null)
		{
			sb.append("<description>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDescription().toString()));
			sb.append("</description>");		
		}
		if (this.getHistologies() != null)
		{
			if (this.getHistologies().size() > 0 )
			{
			sb.append("<histologies>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getHistologies(), domMap));
			sb.append("</histologies>");		
			}
		}
		if (this.getTNMValues() != null)
		{
			if (this.getTNMValues().size() > 0 )
			{
			sb.append("<tNMValues>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getTNMValues(), domMap));
			sb.append("</tNMValues>");		
			}
		}
		if (this.getTaxonomyMap() != null)
		{
			if (this.getTaxonomyMap().size() > 0 )
			{
			sb.append("<taxonomyMap>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getTaxonomyMap(), domMap));
			sb.append("</taxonomyMap>");		
			}
		}
		if (this.isIsActive() != null)
		{
			sb.append("<isActive>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsActive().toString()));
			sb.append("</isActive>");		
		}
		if (this.isHasSiteSpecificTNM() != null)
		{
			sb.append("<hasSiteSpecificTNM>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHasSiteSpecificTNM().toString()));
			sb.append("</hasSiteSpecificTNM>");		
		}
		if (this.isHasSiteSpecificHistology() != null)
		{
			sb.append("<hasSiteSpecificHistology>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHasSiteSpecificHistology().toString()));
			sb.append("</hasSiteSpecificHistology>");		
		}
		if (this.getTNMVersion() != null)
		{
			sb.append("<tNMVersion>");
			sb.append(this.getTNMVersion().toXMLString(domMap)); 	
			sb.append("</tNMVersion>");		
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
			TumourSite domainObject = getTumourSitefromXML(itemEl, factory, domMap);

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
			TumourSite domainObject = getTumourSitefromXML(itemEl, factory, domMap);

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
		
	public static TumourSite getTumourSitefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getTumourSitefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static TumourSite getTumourSitefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!TumourSite.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!TumourSite.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the TumourSite class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (TumourSite)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(TumourSite.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		TumourSite ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (TumourSite)factory.getImportedDomainObject(TumourSite.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new TumourSite();
		}
		String keyClassName = "TumourSite";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (TumourSite)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, TumourSite obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("name");
		if(fldEl != null)
		{	
    		obj.setName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("description");
		if(fldEl != null)
		{	
    		obj.setDescription(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("histologies");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setHistologies(ims.oncology.configuration.domain.objects.TumourGroupHistology.fromListXMLString(fldEl, factory, obj.getHistologies(), domMap));
		}
		fldEl = el.element("tNMValues");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setTNMValues(ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue.fromListXMLString(fldEl, factory, obj.getTNMValues(), domMap));
		}
		fldEl = el.element("taxonomyMap");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setTaxonomyMap(ims.core.clinical.domain.objects.TaxonomyMap.fromListXMLString(fldEl, factory, obj.getTaxonomyMap(), domMap));
		}
		fldEl = el.element("isActive");
		if(fldEl != null)
		{	
    		obj.setIsActive(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("hasSiteSpecificTNM");
		if(fldEl != null)
		{	
    		obj.setHasSiteSpecificTNM(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("hasSiteSpecificHistology");
		if(fldEl != null)
		{	
    		obj.setHasSiteSpecificHistology(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("tNMVersion");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTNMVersion(ims.oncology.configuration.domain.objects.TNMStagingClassificationVersion.getTNMStagingClassificationVersionfromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "histologies"
		, "tNMValues"
		, "taxonomyMap"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Name = "name";
		public static final String Description = "description";
		public static final String Histologies = "histologies";
		public static final String TNMValues = "tNMValues";
		public static final String TaxonomyMap = "taxonomyMap";
		public static final String IsActive = "isActive";
		public static final String HasSiteSpecificTNM = "hasSiteSpecificTNM";
		public static final String HasSiteSpecificHistology = "hasSiteSpecificHistology";
		public static final String TNMVersion = "tNMVersion";
	}
}

