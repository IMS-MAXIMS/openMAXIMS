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
package ims.core.resource.people.domain.objects;

/**
 * 
 * @author Barbara Worwood
 * Generated.
 */


public class Hcp extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1006100000;
	private static final long serialVersionUID = 1006100000L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Hierarchial - to allow for Discipline eg Nursing and Type eg Public Health Nurse */
	private ims.domain.lookups.LookupInstance hcpType;
	private ims.core.resource.people.domain.objects.MemberOfStaff mos;
	/** isActive */
	private Boolean isActive;
	/** Is the HCP a responsible HCP */
	private Boolean isHCPaResponsibleHCP;
	/** Is the HCP a Local Consultant */
	private Boolean isALocalConsultant;
	/** Is the HCP a responsible for an ED location */
	private Boolean isAResponsibleEDClinician;
    public Hcp (Integer id, int ver)
    {
    	super(id, ver);
    }
    public Hcp ()
    {
    	super();
    }
    public Hcp (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.resource.people.domain.objects.Hcp.class;
	}


	public ims.domain.lookups.LookupInstance getHcpType() {
		return hcpType;
	}
	public void setHcpType(ims.domain.lookups.LookupInstance hcpType) {
		this.hcpType = hcpType;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getMos() {
		return mos;
	}
	public void setMos(ims.core.resource.people.domain.objects.MemberOfStaff mos) {
		this.mos = mos;
	}

	public Boolean isIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean isIsHCPaResponsibleHCP() {
		return isHCPaResponsibleHCP;
	}
	public void setIsHCPaResponsibleHCP(Boolean isHCPaResponsibleHCP) {
		this.isHCPaResponsibleHCP = isHCPaResponsibleHCP;
	}

	public Boolean isIsALocalConsultant() {
		return isALocalConsultant;
	}
	public void setIsALocalConsultant(Boolean isALocalConsultant) {
		this.isALocalConsultant = isALocalConsultant;
	}

	public Boolean isIsAResponsibleEDClinician() {
		return isAResponsibleEDClinician;
	}
	public void setIsAResponsibleEDClinician(Boolean isAResponsibleEDClinician) {
		this.isAResponsibleEDClinician = isAResponsibleEDClinician;
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
		
		auditStr.append("\r\n*hcpType* :");
		if (hcpType != null)
			auditStr.append(hcpType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*mos* :");
		if (mos != null)
		{
			auditStr.append(toShortClassName(mos));
				
		    auditStr.append(mos.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isActive* :");
		auditStr.append(isActive);
	    auditStr.append("; ");
		auditStr.append("\r\n*isHCPaResponsibleHCP* :");
		auditStr.append(isHCPaResponsibleHCP);
	    auditStr.append("; ");
		auditStr.append("\r\n*isALocalConsultant* :");
		auditStr.append(isALocalConsultant);
	    auditStr.append("; ");
		auditStr.append("\r\n*isAResponsibleEDClinician* :");
		auditStr.append(isAResponsibleEDClinician);
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
		
		String keyClassName = "Hcp";
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
		if (this.getHcpType() != null)
		{
			sb.append("<hcpType>");
			sb.append(this.getHcpType().toXMLString()); 
			sb.append("</hcpType>");		
		}
		if (this.getMos() != null)
		{
			sb.append("<mos>");
			sb.append(this.getMos().toXMLString(domMap)); 	
			sb.append("</mos>");		
		}
		if (this.isIsActive() != null)
		{
			sb.append("<isActive>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsActive().toString()));
			sb.append("</isActive>");		
		}
		if (this.isIsHCPaResponsibleHCP() != null)
		{
			sb.append("<isHCPaResponsibleHCP>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsHCPaResponsibleHCP().toString()));
			sb.append("</isHCPaResponsibleHCP>");		
		}
		if (this.isIsALocalConsultant() != null)
		{
			sb.append("<isALocalConsultant>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsALocalConsultant().toString()));
			sb.append("</isALocalConsultant>");		
		}
		if (this.isIsAResponsibleEDClinician() != null)
		{
			sb.append("<isAResponsibleEDClinician>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsAResponsibleEDClinician().toString()));
			sb.append("</isAResponsibleEDClinician>");		
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
			Hcp domainObject = getHcpfromXML(itemEl, factory, domMap);

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
			Hcp domainObject = getHcpfromXML(itemEl, factory, domMap);

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
		
	public static Hcp getHcpfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getHcpfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static Hcp getHcpfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!Hcp.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!Hcp.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the Hcp class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (Hcp)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(Hcp.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		Hcp ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (Hcp)factory.getImportedDomainObject(Hcp.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new Hcp();
		}
		String keyClassName = "Hcp";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (Hcp)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, Hcp obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("hcpType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setHcpType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("mos");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setMos(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("isActive");
		if(fldEl != null)
		{	
    		obj.setIsActive(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isHCPaResponsibleHCP");
		if(fldEl != null)
		{	
    		obj.setIsHCPaResponsibleHCP(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isALocalConsultant");
		if(fldEl != null)
		{	
    		obj.setIsALocalConsultant(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isAResponsibleEDClinician");
		if(fldEl != null)
		{	
    		obj.setIsAResponsibleEDClinician(new Boolean(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		};
	}

	/**
	getExtCode
	*/
public String getExtCode(int taxTypeId)
{
	MemberOfStaff mos = this.getMos();
	if (mos == null) return null;
	java.util.List l = mos.getCodeMappings();
	if (l == null || l.size() == 0) 
		return null;
	
	for (int i = 0; i < l.size(); i++)
	{
		ims.core.clinical.domain.objects.TaxonomyMap map = (ims.core.clinical.domain.objects.TaxonomyMap)l.get(i);
		if (map.getTaxonomyName().getId() == taxTypeId)
		{
			return map.getTaxonomyCode();
		}
	}
	return null;
}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String HcpType = "hcpType";
		public static final String Mos = "mos";
		public static final String IsActive = "isActive";
		public static final String IsHCPaResponsibleHCP = "isHCPaResponsibleHCP";
		public static final String IsALocalConsultant = "isALocalConsultant";
		public static final String IsAResponsibleEDClinician = "isAResponsibleEDClinician";
	}
}

