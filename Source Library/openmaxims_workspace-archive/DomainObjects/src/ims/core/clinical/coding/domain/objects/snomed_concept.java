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
 * @author Sean Nesbitt
 * Generated.
 */


public class snomed_concept extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1065100006;
	private static final long serialVersionUID = 1065100006L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private String conceptid;
	private Integer conceptstatus;
	private String fullyspecifiedname;
	private String ctv3id;
	private String snomedid;
	private Integer isprimitive;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public snomed_concept (Integer id, int ver)
    {
    	super(id, ver);
    }
    public snomed_concept ()
    {
    	super();
    }
    public snomed_concept (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.clinical.coding.domain.objects.snomed_concept.class;
	}


	public String getConceptid() {
		return conceptid;
	}
	public void setConceptid(String conceptid) {
		if ( null != conceptid && conceptid.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for conceptid. Tried to set value: "+
				conceptid);
		}
		this.conceptid = conceptid;
	}

	public Integer getConceptstatus() {
		return conceptstatus;
	}
	public void setConceptstatus(Integer conceptstatus) {
		this.conceptstatus = conceptstatus;
	}

	public String getFullyspecifiedname() {
		return fullyspecifiedname;
	}
	public void setFullyspecifiedname(String fullyspecifiedname) {
		if ( null != fullyspecifiedname && fullyspecifiedname.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for fullyspecifiedname. Tried to set value: "+
				fullyspecifiedname);
		}
		this.fullyspecifiedname = fullyspecifiedname;
	}

	public String getCtv3id() {
		return ctv3id;
	}
	public void setCtv3id(String ctv3id) {
		if ( null != ctv3id && ctv3id.length() > 5 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for ctv3id. Tried to set value: "+
				ctv3id);
		}
		this.ctv3id = ctv3id;
	}

	public String getSnomedid() {
		return snomedid;
	}
	public void setSnomedid(String snomedid) {
		if ( null != snomedid && snomedid.length() > 8 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for snomedid. Tried to set value: "+
				snomedid);
		}
		this.snomedid = snomedid;
	}

	public Integer getIsprimitive() {
		return isprimitive;
	}
	public void setIsprimitive(Integer isprimitive) {
		this.isprimitive = isprimitive;
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
		
		auditStr.append("\r\n*conceptid* :");
		auditStr.append(conceptid);
	    auditStr.append("; ");
		auditStr.append("\r\n*conceptstatus* :");
		auditStr.append(conceptstatus);
	    auditStr.append("; ");
		auditStr.append("\r\n*fullyspecifiedname* :");
		auditStr.append(fullyspecifiedname);
	    auditStr.append("; ");
		auditStr.append("\r\n*ctv3id* :");
		auditStr.append(ctv3id);
	    auditStr.append("; ");
		auditStr.append("\r\n*snomedid* :");
		auditStr.append(snomedid);
	    auditStr.append("; ");
		auditStr.append("\r\n*isprimitive* :");
		auditStr.append(isprimitive);
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
		
		String keyClassName = "snomed_concept";
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
		if (this.getConceptid() != null)
		{
			sb.append("<conceptid>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getConceptid().toString()));
			sb.append("</conceptid>");		
		}
		if (this.getConceptstatus() != null)
		{
			sb.append("<conceptstatus>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getConceptstatus().toString()));
			sb.append("</conceptstatus>");		
		}
		if (this.getFullyspecifiedname() != null)
		{
			sb.append("<fullyspecifiedname>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getFullyspecifiedname().toString()));
			sb.append("</fullyspecifiedname>");		
		}
		if (this.getCtv3id() != null)
		{
			sb.append("<ctv3id>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCtv3id().toString()));
			sb.append("</ctv3id>");		
		}
		if (this.getSnomedid() != null)
		{
			sb.append("<snomedid>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSnomedid().toString()));
			sb.append("</snomedid>");		
		}
		if (this.getIsprimitive() != null)
		{
			sb.append("<isprimitive>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getIsprimitive().toString()));
			sb.append("</isprimitive>");		
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
			snomed_concept domainObject = getsnomed_conceptfromXML(itemEl, factory, domMap);

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
			snomed_concept domainObject = getsnomed_conceptfromXML(itemEl, factory, domMap);

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
		
	public static snomed_concept getsnomed_conceptfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getsnomed_conceptfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static snomed_concept getsnomed_conceptfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!snomed_concept.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!snomed_concept.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the snomed_concept class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (snomed_concept)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(snomed_concept.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		snomed_concept ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (snomed_concept)factory.getImportedDomainObject(snomed_concept.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new snomed_concept();
		}
		String keyClassName = "snomed_concept";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (snomed_concept)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, snomed_concept obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("conceptid");
		if(fldEl != null)
		{	
    		obj.setConceptid(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("conceptstatus");
		if(fldEl != null)
		{	
    		obj.setConceptstatus(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("fullyspecifiedname");
		if(fldEl != null)
		{	
    		obj.setFullyspecifiedname(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("ctv3id");
		if(fldEl != null)
		{	
    		obj.setCtv3id(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("snomedid");
		if(fldEl != null)
		{	
    		obj.setSnomedid(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isprimitive");
		if(fldEl != null)
		{	
    		obj.setIsprimitive(new Integer(fldEl.getTextTrim()));	
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
		public static final String Conceptid = "conceptid";
		public static final String Conceptstatus = "conceptstatus";
		public static final String Fullyspecifiedname = "fullyspecifiedname";
		public static final String Ctv3id = "ctv3id";
		public static final String Snomedid = "snomedid";
		public static final String Isprimitive = "isprimitive";
	}
}

