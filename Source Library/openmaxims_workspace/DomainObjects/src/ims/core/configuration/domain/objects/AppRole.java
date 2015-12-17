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
package ims.core.configuration.domain.objects;

/**
 * 
 * @author John MacEnri
 * Generated.
 */


public class AppRole extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1021100000;
	private static final long serialVersionUID = 1021100000L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private String name;
	private String description;
	private Boolean isActive;
	private ims.core.configuration.domain.objects.AppNavigation navigation;
	/** Names of AppRights granted to this Role
	  * Collection of ims.core.configuration.domain.objects.AppRight.
	  */
	private java.util.List appRights;
	private ims.core.configuration.domain.objects.AppTopButtonConfig topButtonConfig;
	/** 
	  * Collection of ims.core.configuration.domain.objects.RoleMenuActionsDenied.
	  */
	private java.util.Set formMenuActionsDenied;
	/** Role mappings
	  * Collection of ims.core.clinical.domain.objects.TaxonomyMap.
	  */
	private java.util.List codeMappings;
	/** SessionTimeout session (in seconds) */
	private Integer sessionTimeout;
	/** Autolock timer (in seconds) */
	private Integer autolockTimer;
	/** 
	  * Collection of ims.core.configuration.domain.objects.AlertAccessRight.
	  */
	private java.util.List alertsAccess;
	/** Requires PDS Access */
	private Boolean requiresPDS;
	/** SPINE Role Based Access Role Code */
	private ims.core.admin.domain.objects.RBACBaselineJobRole spineRbac;
	/** Names of PDS Rights granted to this Role
	  * Collection of ims.core.configuration.domain.objects.AppRight.
	  */
	private java.util.List pdsRights;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public AppRole (Integer id, int ver)
    {
    	super(id, ver);
    }
    public AppRole ()
    {
    	super();
    }
    public AppRole (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.configuration.domain.objects.AppRole.class;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		if ( null != name && name.length() > 30 ) {
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

	public Boolean isIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public ims.core.configuration.domain.objects.AppNavigation getNavigation() {
		return navigation;
	}
	public void setNavigation(ims.core.configuration.domain.objects.AppNavigation navigation) {
		this.navigation = navigation;
	}

	public java.util.List getAppRights() {
		if ( null == appRights ) {
			appRights = new java.util.ArrayList();
		}
		return appRights;
	}
	public void setAppRights(java.util.List paramValue) {
		this.appRights = paramValue;
	}

	public ims.core.configuration.domain.objects.AppTopButtonConfig getTopButtonConfig() {
		return topButtonConfig;
	}
	public void setTopButtonConfig(ims.core.configuration.domain.objects.AppTopButtonConfig topButtonConfig) {
		this.topButtonConfig = topButtonConfig;
	}

	public java.util.Set getFormMenuActionsDenied() {
		if ( null == formMenuActionsDenied ) {
			formMenuActionsDenied = new java.util.HashSet();
		}
		return formMenuActionsDenied;
	}
	public void setFormMenuActionsDenied(java.util.Set paramValue) {
		this.formMenuActionsDenied = paramValue;
	}

	public java.util.List getCodeMappings() {
		if ( null == codeMappings ) {
			codeMappings = new java.util.ArrayList();
		}
		return codeMappings;
	}
	public void setCodeMappings(java.util.List paramValue) {
		this.codeMappings = paramValue;
	}

	public Integer getSessionTimeout() {
		return sessionTimeout;
	}
	public void setSessionTimeout(Integer sessionTimeout) {
		this.sessionTimeout = sessionTimeout;
	}

	public Integer getAutolockTimer() {
		return autolockTimer;
	}
	public void setAutolockTimer(Integer autolockTimer) {
		this.autolockTimer = autolockTimer;
	}

	public java.util.List getAlertsAccess() {
		if ( null == alertsAccess ) {
			alertsAccess = new java.util.ArrayList();
		}
		return alertsAccess;
	}
	public void setAlertsAccess(java.util.List paramValue) {
		this.alertsAccess = paramValue;
	}

	public Boolean isRequiresPDS() {
		return requiresPDS;
	}
	public void setRequiresPDS(Boolean requiresPDS) {
		this.requiresPDS = requiresPDS;
	}

	public ims.core.admin.domain.objects.RBACBaselineJobRole getSpineRbac() {
		return spineRbac;
	}
	public void setSpineRbac(ims.core.admin.domain.objects.RBACBaselineJobRole spineRbac) {
		this.spineRbac = spineRbac;
	}

	public java.util.List getPdsRights() {
		if ( null == pdsRights ) {
			pdsRights = new java.util.ArrayList();
		}
		return pdsRights;
	}
	public void setPdsRights(java.util.List paramValue) {
		this.pdsRights = paramValue;
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
		auditStr.append("\r\n*isActive* :");
		auditStr.append(isActive);
	    auditStr.append("; ");
		auditStr.append("\r\n*navigation* :");
		if (navigation != null)
		{
			auditStr.append(toShortClassName(navigation));
				
		    auditStr.append(navigation.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*appRights* :");
		if (appRights != null)
		{
		int i5=0;
		for (i5=0; i5<appRights.size(); i5++)
		{
			if (i5 > 0)
				auditStr.append(",");
			ims.core.configuration.domain.objects.AppRight obj = (ims.core.configuration.domain.objects.AppRight)appRights.get(i5);
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
		auditStr.append("\r\n*topButtonConfig* :");
		if (topButtonConfig != null)
		{
			auditStr.append(toShortClassName(topButtonConfig));
				
		    auditStr.append(topButtonConfig.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*formMenuActionsDenied* :");
		if (formMenuActionsDenied != null)
		{
			java.util.Iterator it7 = formMenuActionsDenied.iterator();
			int i7=0;
			while (it7.hasNext())
			{
				if (i7 > 0)
					auditStr.append(",");
				ims.core.configuration.domain.objects.RoleMenuActionsDenied obj = (ims.core.configuration.domain.objects.RoleMenuActionsDenied)it7.next();
		if (obj != null)
		{
		   if (i7 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i7++;
		}
		if (i7 > 0)
			auditStr.append("] " + i7);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*codeMappings* :");
		if (codeMappings != null)
		{
		int i8=0;
		for (i8=0; i8<codeMappings.size(); i8++)
		{
			if (i8 > 0)
				auditStr.append(",");
			ims.core.clinical.domain.objects.TaxonomyMap obj = (ims.core.clinical.domain.objects.TaxonomyMap)codeMappings.get(i8);
		    if (obj != null)
			{
				if (i8 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i8 > 0)
			auditStr.append("] " + i8);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*sessionTimeout* :");
		auditStr.append(sessionTimeout);
	    auditStr.append("; ");
		auditStr.append("\r\n*autolockTimer* :");
		auditStr.append(autolockTimer);
	    auditStr.append("; ");
		auditStr.append("\r\n*alertsAccess* :");
		if (alertsAccess != null)
		{
		int i11=0;
		for (i11=0; i11<alertsAccess.size(); i11++)
		{
			if (i11 > 0)
				auditStr.append(",");
			ims.core.configuration.domain.objects.AlertAccessRight obj = (ims.core.configuration.domain.objects.AlertAccessRight)alertsAccess.get(i11);
		    if (obj != null)
			{
				if (i11 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i11 > 0)
			auditStr.append("] " + i11);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*requiresPDS* :");
		auditStr.append(requiresPDS);
	    auditStr.append("; ");
		auditStr.append("\r\n*spineRbac* :");
		if (spineRbac != null)
		{
			auditStr.append(toShortClassName(spineRbac));
				
		    auditStr.append(spineRbac.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*pdsRights* :");
		if (pdsRights != null)
		{
		int i14=0;
		for (i14=0; i14<pdsRights.size(); i14++)
		{
			if (i14 > 0)
				auditStr.append(",");
			ims.core.configuration.domain.objects.AppRight obj = (ims.core.configuration.domain.objects.AppRight)pdsRights.get(i14);
		    if (obj != null)
			{
				if (i14 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i14 > 0)
			auditStr.append("] " + i14);
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
		
		String keyClassName = "AppRole";
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
		if (this.isIsActive() != null)
		{
			sb.append("<isActive>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsActive().toString()));
			sb.append("</isActive>");		
		}
		if (this.getNavigation() != null)
		{
			sb.append("<navigation>");
			sb.append(this.getNavigation().toXMLString(domMap)); 	
			sb.append("</navigation>");		
		}
		if (this.getAppRights() != null)
		{
			if (this.getAppRights().size() > 0 )
			{
			sb.append("<appRights>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getAppRights(), domMap));
			sb.append("</appRights>");		
			}
		}
		if (this.getTopButtonConfig() != null)
		{
			sb.append("<topButtonConfig>");
			sb.append(this.getTopButtonConfig().toXMLString(domMap)); 	
			sb.append("</topButtonConfig>");		
		}
		if (this.getFormMenuActionsDenied() != null)
		{
			if (this.getFormMenuActionsDenied().size() > 0 )
			{
			sb.append("<formMenuActionsDenied>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getFormMenuActionsDenied(), domMap));
			sb.append("</formMenuActionsDenied>");		
			}
		}
		if (this.getCodeMappings() != null)
		{
			if (this.getCodeMappings().size() > 0 )
			{
			sb.append("<codeMappings>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getCodeMappings(), domMap));
			sb.append("</codeMappings>");		
			}
		}
		if (this.getSessionTimeout() != null)
		{
			sb.append("<sessionTimeout>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSessionTimeout().toString()));
			sb.append("</sessionTimeout>");		
		}
		if (this.getAutolockTimer() != null)
		{
			sb.append("<autolockTimer>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAutolockTimer().toString()));
			sb.append("</autolockTimer>");		
		}
		if (this.getAlertsAccess() != null)
		{
			if (this.getAlertsAccess().size() > 0 )
			{
			sb.append("<alertsAccess>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getAlertsAccess(), domMap));
			sb.append("</alertsAccess>");		
			}
		}
		if (this.isRequiresPDS() != null)
		{
			sb.append("<requiresPDS>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isRequiresPDS().toString()));
			sb.append("</requiresPDS>");		
		}
		if (this.getSpineRbac() != null)
		{
			sb.append("<spineRbac>");
			sb.append(this.getSpineRbac().toXMLString(domMap)); 	
			sb.append("</spineRbac>");		
		}
		if (this.getPdsRights() != null)
		{
			if (this.getPdsRights().size() > 0 )
			{
			sb.append("<pdsRights>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getPdsRights(), domMap));
			sb.append("</pdsRights>");		
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
			AppRole domainObject = getAppRolefromXML(itemEl, factory, domMap);

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
			AppRole domainObject = getAppRolefromXML(itemEl, factory, domMap);

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
		
	public static AppRole getAppRolefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getAppRolefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static AppRole getAppRolefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!AppRole.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!AppRole.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the AppRole class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (AppRole)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(AppRole.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		AppRole ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (AppRole)factory.getImportedDomainObject(AppRole.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new AppRole();
		}
		String keyClassName = "AppRole";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (AppRole)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, AppRole obj, java.util.HashMap domMap) throws Exception
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
		fldEl = el.element("isActive");
		if(fldEl != null)
		{	
    		obj.setIsActive(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("navigation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setNavigation(ims.core.configuration.domain.objects.AppNavigation.getAppNavigationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("appRights");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setAppRights(ims.core.configuration.domain.objects.AppRight.fromListXMLString(fldEl, factory, obj.getAppRights(), domMap));
		}
		fldEl = el.element("topButtonConfig");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTopButtonConfig(ims.core.configuration.domain.objects.AppTopButtonConfig.getAppTopButtonConfigfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("formMenuActionsDenied");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setFormMenuActionsDenied(ims.core.configuration.domain.objects.RoleMenuActionsDenied.fromSetXMLString(fldEl, factory, obj.getFormMenuActionsDenied(), domMap));
		}
		fldEl = el.element("codeMappings");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setCodeMappings(ims.core.clinical.domain.objects.TaxonomyMap.fromListXMLString(fldEl, factory, obj.getCodeMappings(), domMap));
		}
		fldEl = el.element("sessionTimeout");
		if(fldEl != null)
		{	
    		obj.setSessionTimeout(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("autolockTimer");
		if(fldEl != null)
		{	
    		obj.setAutolockTimer(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("alertsAccess");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setAlertsAccess(ims.core.configuration.domain.objects.AlertAccessRight.fromListXMLString(fldEl, factory, obj.getAlertsAccess(), domMap));
		}
		fldEl = el.element("requiresPDS");
		if(fldEl != null)
		{	
    		obj.setRequiresPDS(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("spineRbac");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSpineRbac(ims.core.admin.domain.objects.RBACBaselineJobRole.getRBACBaselineJobRolefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("pdsRights");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setPdsRights(ims.core.configuration.domain.objects.AppRight.fromListXMLString(fldEl, factory, obj.getPdsRights(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "appRights"
		, "formMenuActionsDenied"
		, "codeMappings"
		, "alertsAccess"
		, "pdsRights"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Name = "name";
		public static final String Description = "description";
		public static final String IsActive = "isActive";
		public static final String Navigation = "navigation";
		public static final String AppRights = "appRights";
		public static final String TopButtonConfig = "topButtonConfig";
		public static final String FormMenuActionsDenied = "formMenuActionsDenied";
		public static final String CodeMappings = "codeMappings";
		public static final String SessionTimeout = "sessionTimeout";
		public static final String AutolockTimer = "autolockTimer";
		public static final String AlertsAccess = "alertsAccess";
		public static final String RequiresPDS = "requiresPDS";
		public static final String SpineRbac = "spineRbac";
		public static final String PdsRights = "pdsRights";
	}
}

