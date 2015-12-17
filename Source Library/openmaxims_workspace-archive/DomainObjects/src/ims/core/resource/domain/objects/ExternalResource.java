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
package ims.core.resource.domain.objects;

/**
 * 
 * @author Rory Fitzpatrick
 * Generated.
 */


public class ExternalResource extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1005100008;
	private static final long serialVersionUID = 1005100008L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** ExternalResourceType */
	private ims.domain.lookups.LookupInstance externalResourceType;
	/** HCPType */
	private ims.domain.lookups.LookupInstance hCPType;
	/** ResourceAddress */
	private ims.core.generic.domain.objects.Address resourceAddress;
	/** ResourceStatus */
	private ims.domain.lookups.LookupInstance resourceStatus;
	/** ResourceName */
	private String resourcename;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ExternalResource (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ExternalResource ()
    {
    	super();
    }
    public ExternalResource (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.resource.domain.objects.ExternalResource.class;
	}


	public ims.domain.lookups.LookupInstance getExternalResourceType() {
		return externalResourceType;
	}
	public void setExternalResourceType(ims.domain.lookups.LookupInstance externalResourceType) {
		this.externalResourceType = externalResourceType;
	}

	public ims.domain.lookups.LookupInstance getHCPType() {
		return hCPType;
	}
	public void setHCPType(ims.domain.lookups.LookupInstance hCPType) {
		this.hCPType = hCPType;
	}

	public ims.core.generic.domain.objects.Address getResourceAddress() {
		return resourceAddress;
	}
	public void setResourceAddress(ims.core.generic.domain.objects.Address resourceAddress) {
		this.resourceAddress = resourceAddress;
	}

	public ims.domain.lookups.LookupInstance getResourceStatus() {
		return resourceStatus;
	}
	public void setResourceStatus(ims.domain.lookups.LookupInstance resourceStatus) {
		this.resourceStatus = resourceStatus;
	}

	public String getResourcename() {
		return resourcename;
	}
	public void setResourcename(String resourcename) {
		if ( null != resourcename && resourcename.length() > 70 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for resourcename. Tried to set value: "+
				resourcename);
		}
		this.resourcename = resourcename;
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
		
		auditStr.append("\r\n*externalResourceType* :");
		if (externalResourceType != null)
			auditStr.append(externalResourceType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*hCPType* :");
		if (hCPType != null)
			auditStr.append(hCPType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*resourceAddress* :");
		if (resourceAddress != null)
		{
			auditStr.append(toShortClassName(resourceAddress));
				
		    auditStr.append(resourceAddress.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*resourceStatus* :");
		if (resourceStatus != null)
			auditStr.append(resourceStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*resourcename* :");
		auditStr.append(resourcename);
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
		
		String keyClassName = "ExternalResource";
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
		if (this.getExternalResourceType() != null)
		{
			sb.append("<externalResourceType>");
			sb.append(this.getExternalResourceType().toXMLString()); 
			sb.append("</externalResourceType>");		
		}
		if (this.getHCPType() != null)
		{
			sb.append("<hCPType>");
			sb.append(this.getHCPType().toXMLString()); 
			sb.append("</hCPType>");		
		}
		if (this.getResourceAddress() != null)
		{
			sb.append("<resourceAddress>");
			sb.append(this.getResourceAddress().toXMLString(domMap)); 	
			sb.append("</resourceAddress>");		
		}
		if (this.getResourceStatus() != null)
		{
			sb.append("<resourceStatus>");
			sb.append(this.getResourceStatus().toXMLString()); 
			sb.append("</resourceStatus>");		
		}
		if (this.getResourcename() != null)
		{
			sb.append("<resourcename>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getResourcename().toString()));
			sb.append("</resourcename>");		
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
			ExternalResource domainObject = getExternalResourcefromXML(itemEl, factory, domMap);

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
			ExternalResource domainObject = getExternalResourcefromXML(itemEl, factory, domMap);

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
		
	public static ExternalResource getExternalResourcefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getExternalResourcefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ExternalResource getExternalResourcefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ExternalResource.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ExternalResource.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ExternalResource class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ExternalResource)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ExternalResource.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ExternalResource ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ExternalResource)factory.getImportedDomainObject(ExternalResource.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ExternalResource();
		}
		String keyClassName = "ExternalResource";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ExternalResource)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ExternalResource obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("externalResourceType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setExternalResourceType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("hCPType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setHCPType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("resourceAddress");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setResourceAddress(ims.core.generic.domain.objects.Address.getAddressfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("resourceStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setResourceStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("resourcename");
		if(fldEl != null)
		{	
    		obj.setResourcename(new String(fldEl.getTextTrim()));	
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
		public static final String ExternalResourceType = "externalResourceType";
		public static final String HCPType = "hCPType";
		public static final String ResourceAddress = "resourceAddress";
		public static final String ResourceStatus = "resourceStatus";
		public static final String Resourcename = "resourcename";
	}
}

