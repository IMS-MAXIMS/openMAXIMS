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
package ims.assessment.configuration.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class ScreeningProfile extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1083100007;
	private static final long serialVersionUID = 1083100007L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Screening Profile Name */
	private String profileName;
	/** Context Type */
	private ims.domain.lookups.LookupInstance contextType;
	/** Components
	  * Collection of ims.assessment.configuration.domain.objects.ScreeningProfileComponent.
	  */
	private java.util.List profileComponents;
	/** ActiveStatus */
	private ims.domain.lookups.LookupInstance activeStatus;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ScreeningProfile (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ScreeningProfile ()
    {
    	super();
    }
    public ScreeningProfile (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.assessment.configuration.domain.objects.ScreeningProfile.class;
	}


	public String getProfileName() {
		return profileName;
	}
	public void setProfileName(String profileName) {
		if ( null != profileName && profileName.length() > 75 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for profileName. Tried to set value: "+
				profileName);
		}
		this.profileName = profileName;
	}

	public ims.domain.lookups.LookupInstance getContextType() {
		return contextType;
	}
	public void setContextType(ims.domain.lookups.LookupInstance contextType) {
		this.contextType = contextType;
	}

	public java.util.List getProfileComponents() {
		if ( null == profileComponents ) {
			profileComponents = new java.util.ArrayList();
		}
		return profileComponents;
	}
	public void setProfileComponents(java.util.List paramValue) {
		this.profileComponents = paramValue;
	}

	public ims.domain.lookups.LookupInstance getActiveStatus() {
		return activeStatus;
	}
	public void setActiveStatus(ims.domain.lookups.LookupInstance activeStatus) {
		this.activeStatus = activeStatus;
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
		
		auditStr.append("\r\n*profileName* :");
		auditStr.append(profileName);
	    auditStr.append("; ");
		auditStr.append("\r\n*contextType* :");
		if (contextType != null)
			auditStr.append(contextType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*profileComponents* :");
		if (profileComponents != null)
		{
		int i3=0;
		for (i3=0; i3<profileComponents.size(); i3++)
		{
			if (i3 > 0)
				auditStr.append(",");
			ims.assessment.configuration.domain.objects.ScreeningProfileComponent obj = (ims.assessment.configuration.domain.objects.ScreeningProfileComponent)profileComponents.get(i3);
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
		auditStr.append("\r\n*activeStatus* :");
		if (activeStatus != null)
			auditStr.append(activeStatus.getText());
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
		
		String keyClassName = "ScreeningProfile";
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
		if (this.getProfileName() != null)
		{
			sb.append("<profileName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getProfileName().toString()));
			sb.append("</profileName>");		
		}
		if (this.getContextType() != null)
		{
			sb.append("<contextType>");
			sb.append(this.getContextType().toXMLString()); 
			sb.append("</contextType>");		
		}
		if (this.getProfileComponents() != null)
		{
			if (this.getProfileComponents().size() > 0 )
			{
			sb.append("<profileComponents>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getProfileComponents(), domMap));
			sb.append("</profileComponents>");		
			}
		}
		if (this.getActiveStatus() != null)
		{
			sb.append("<activeStatus>");
			sb.append(this.getActiveStatus().toXMLString()); 
			sb.append("</activeStatus>");		
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
			ScreeningProfile domainObject = getScreeningProfilefromXML(itemEl, factory, domMap);

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
			ScreeningProfile domainObject = getScreeningProfilefromXML(itemEl, factory, domMap);

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
		
	public static ScreeningProfile getScreeningProfilefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getScreeningProfilefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ScreeningProfile getScreeningProfilefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ScreeningProfile.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ScreeningProfile.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ScreeningProfile class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ScreeningProfile)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ScreeningProfile.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ScreeningProfile ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ScreeningProfile)factory.getImportedDomainObject(ScreeningProfile.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ScreeningProfile();
		}
		String keyClassName = "ScreeningProfile";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ScreeningProfile)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ScreeningProfile obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("profileName");
		if(fldEl != null)
		{	
    		obj.setProfileName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("contextType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setContextType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("profileComponents");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setProfileComponents(ims.assessment.configuration.domain.objects.ScreeningProfileComponent.fromListXMLString(fldEl, factory, obj.getProfileComponents(), domMap));
		}
		fldEl = el.element("activeStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setActiveStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "profileComponents"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String ProfileName = "profileName";
		public static final String ContextType = "contextType";
		public static final String ProfileComponents = "profileComponents";
		public static final String ActiveStatus = "activeStatus";
	}
}

