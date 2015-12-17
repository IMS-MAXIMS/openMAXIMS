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


public class TumourGroupSiteTNMValue extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1074100011;
	private static final long serialVersionUID = 1074100011L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** TNMType */
	private ims.domain.lookups.LookupInstance tNMType;
	/** TNMValue */
	private String tNMValue;
	/** TNMDescription */
	private String tNMDescription;
	/** ClinicalPathological */
	private ims.domain.lookups.LookupInstance clinicalPathological;
	/** isActive */
	private Boolean isActive;
	/** TaxonomyMap
	  * Collection of ims.core.clinical.domain.objects.TaxonomyMap.
	  */
	private java.util.List taxonomyMap;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public TumourGroupSiteTNMValue (Integer id, int ver)
    {
    	super(id, ver);
    }
    public TumourGroupSiteTNMValue ()
    {
    	super();
    }
    public TumourGroupSiteTNMValue (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue.class;
	}


	public ims.domain.lookups.LookupInstance getTNMType() {
		return tNMType;
	}
	public void setTNMType(ims.domain.lookups.LookupInstance tNMType) {
		this.tNMType = tNMType;
	}

	public String getTNMValue() {
		return tNMValue;
	}
	public void setTNMValue(String tNMValue) {
		if ( null != tNMValue && tNMValue.length() > 30 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for tNMValue. Tried to set value: "+
				tNMValue);
		}
		this.tNMValue = tNMValue;
	}

	public String getTNMDescription() {
		return tNMDescription;
	}
	public void setTNMDescription(String tNMDescription) {
		if ( null != tNMDescription && tNMDescription.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for tNMDescription. Tried to set value: "+
				tNMDescription);
		}
		this.tNMDescription = tNMDescription;
	}

	public ims.domain.lookups.LookupInstance getClinicalPathological() {
		return clinicalPathological;
	}
	public void setClinicalPathological(ims.domain.lookups.LookupInstance clinicalPathological) {
		this.clinicalPathological = clinicalPathological;
	}

	public Boolean isIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
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
		
		auditStr.append("\r\n*tNMType* :");
		if (tNMType != null)
			auditStr.append(tNMType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*tNMValue* :");
		auditStr.append(tNMValue);
	    auditStr.append("; ");
		auditStr.append("\r\n*tNMDescription* :");
		auditStr.append(tNMDescription);
	    auditStr.append("; ");
		auditStr.append("\r\n*clinicalPathological* :");
		if (clinicalPathological != null)
			auditStr.append(clinicalPathological.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*isActive* :");
		auditStr.append(isActive);
	    auditStr.append("; ");
		auditStr.append("\r\n*taxonomyMap* :");
		if (taxonomyMap != null)
		{
		int i6=0;
		for (i6=0; i6<taxonomyMap.size(); i6++)
		{
			if (i6 > 0)
				auditStr.append(",");
			ims.core.clinical.domain.objects.TaxonomyMap obj = (ims.core.clinical.domain.objects.TaxonomyMap)taxonomyMap.get(i6);
		    if (obj != null)
			{
				if (i6 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i6 > 0)
			auditStr.append("] " + i6);
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
		
		String keyClassName = "TumourGroupSiteTNMValue";
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
		if (this.getTNMType() != null)
		{
			sb.append("<tNMType>");
			sb.append(this.getTNMType().toXMLString()); 
			sb.append("</tNMType>");		
		}
		if (this.getTNMValue() != null)
		{
			sb.append("<tNMValue>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTNMValue().toString()));
			sb.append("</tNMValue>");		
		}
		if (this.getTNMDescription() != null)
		{
			sb.append("<tNMDescription>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTNMDescription().toString()));
			sb.append("</tNMDescription>");		
		}
		if (this.getClinicalPathological() != null)
		{
			sb.append("<clinicalPathological>");
			sb.append(this.getClinicalPathological().toXMLString()); 
			sb.append("</clinicalPathological>");		
		}
		if (this.isIsActive() != null)
		{
			sb.append("<isActive>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsActive().toString()));
			sb.append("</isActive>");		
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
			TumourGroupSiteTNMValue domainObject = getTumourGroupSiteTNMValuefromXML(itemEl, factory, domMap);

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
			TumourGroupSiteTNMValue domainObject = getTumourGroupSiteTNMValuefromXML(itemEl, factory, domMap);

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
		
	public static TumourGroupSiteTNMValue getTumourGroupSiteTNMValuefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getTumourGroupSiteTNMValuefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static TumourGroupSiteTNMValue getTumourGroupSiteTNMValuefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!TumourGroupSiteTNMValue.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!TumourGroupSiteTNMValue.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the TumourGroupSiteTNMValue class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (TumourGroupSiteTNMValue)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(TumourGroupSiteTNMValue.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		TumourGroupSiteTNMValue ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (TumourGroupSiteTNMValue)factory.getImportedDomainObject(TumourGroupSiteTNMValue.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new TumourGroupSiteTNMValue();
		}
		String keyClassName = "TumourGroupSiteTNMValue";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (TumourGroupSiteTNMValue)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, TumourGroupSiteTNMValue obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("tNMType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTNMType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("tNMValue");
		if(fldEl != null)
		{	
    		obj.setTNMValue(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("tNMDescription");
		if(fldEl != null)
		{	
    		obj.setTNMDescription(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("clinicalPathological");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setClinicalPathological(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("isActive");
		if(fldEl != null)
		{	
    		obj.setIsActive(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("taxonomyMap");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setTaxonomyMap(ims.core.clinical.domain.objects.TaxonomyMap.fromListXMLString(fldEl, factory, obj.getTaxonomyMap(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "taxonomyMap"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String TNMType = "tNMType";
		public static final String TNMValue = "tNMValue";
		public static final String TNMDescription = "tNMDescription";
		public static final String ClinicalPathological = "clinicalPathological";
		public static final String IsActive = "isActive";
		public static final String TaxonomyMap = "taxonomyMap";
	}
}

