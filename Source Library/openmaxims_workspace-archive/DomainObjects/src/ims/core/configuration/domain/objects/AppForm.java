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
package ims.core.configuration.domain.objects;

/**
 * 
 * @author John MacEnri
 * Generated.
 */


public class AppForm extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1021100001;
	private static final long serialVersionUID = 1021100001L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return false;
	}

	private ims.core.configuration.domain.objects.AppNameSpace namespace;
	private String name;
	private String aliasName;
	private String caption;
	private Boolean isDialog;
	private Boolean isComponent;
	private Boolean canBeInNavigation;
	private Boolean canBeInTopButtons;
	private Boolean isAlias;
	private String logicClass;
	private String accessClass;
	private String domainClass;
	private String helpLink;
	private String rieBoClassName;
	private Boolean isSystem;
	/** 
	  * Collection of ims.core.configuration.domain.objects.AppFormContextVariable.
	  */
	private java.util.List contextVariables;
	/** 
	  * Collection of ims.core.configuration.domain.objects.AppFormLookup.
	  */
	private java.util.List lookups;
	/** 
	  * Collection of ims.core.configuration.domain.objects.MenuAction.
	  */
	private java.util.Set menuActions;
	/** Specifies if the dialog will display the PID bar */
	private Boolean informationBarVisible;
	/** Form Description */
	private String description;
	/** Form Image */
	private ims.core.configuration.domain.objects.AppImage image;
	/** Form Mappings
	  * Collection of ims.core.clinical.domain.objects.TaxonomyMap.
	  */
	private java.util.List codeMappings;
    public AppForm (Integer id, int ver)
    {
    	super(id, ver);
    }
    public AppForm ()
    {
    	super();
    }
    public AppForm (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.configuration.domain.objects.AppForm.class;
	}


	public ims.core.configuration.domain.objects.AppNameSpace getNamespace() {
		return namespace;
	}
	public void setNamespace(ims.core.configuration.domain.objects.AppNameSpace namespace) {
		this.namespace = namespace;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		if ( null != name && name.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for name. Tried to set value: "+
				name);
		}
		this.name = name;
	}

	public String getAliasName() {
		return aliasName;
	}
	public void setAliasName(String aliasName) {
		if ( null != aliasName && aliasName.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for aliasName. Tried to set value: "+
				aliasName);
		}
		this.aliasName = aliasName;
	}

	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		if ( null != caption && caption.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for caption. Tried to set value: "+
				caption);
		}
		this.caption = caption;
	}

	public Boolean isIsDialog() {
		return isDialog;
	}
	public void setIsDialog(Boolean isDialog) {
		this.isDialog = isDialog;
	}

	public Boolean isIsComponent() {
		return isComponent;
	}
	public void setIsComponent(Boolean isComponent) {
		this.isComponent = isComponent;
	}

	public Boolean isCanBeInNavigation() {
		return canBeInNavigation;
	}
	public void setCanBeInNavigation(Boolean canBeInNavigation) {
		this.canBeInNavigation = canBeInNavigation;
	}

	public Boolean isCanBeInTopButtons() {
		return canBeInTopButtons;
	}
	public void setCanBeInTopButtons(Boolean canBeInTopButtons) {
		this.canBeInTopButtons = canBeInTopButtons;
	}

	public Boolean isIsAlias() {
		return isAlias;
	}
	public void setIsAlias(Boolean isAlias) {
		this.isAlias = isAlias;
	}

	public String getLogicClass() {
		return logicClass;
	}
	public void setLogicClass(String logicClass) {
		if ( null != logicClass && logicClass.length() > 200 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for logicClass. Tried to set value: "+
				logicClass);
		}
		this.logicClass = logicClass;
	}

	public String getAccessClass() {
		return accessClass;
	}
	public void setAccessClass(String accessClass) {
		if ( null != accessClass && accessClass.length() > 200 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for accessClass. Tried to set value: "+
				accessClass);
		}
		this.accessClass = accessClass;
	}

	public String getDomainClass() {
		return domainClass;
	}
	public void setDomainClass(String domainClass) {
		if ( null != domainClass && domainClass.length() > 200 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for domainClass. Tried to set value: "+
				domainClass);
		}
		this.domainClass = domainClass;
	}

	public String getHelpLink() {
		return helpLink;
	}
	public void setHelpLink(String helpLink) {
		if ( null != helpLink && helpLink.length() > 200 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for helpLink. Tried to set value: "+
				helpLink);
		}
		this.helpLink = helpLink;
	}

	public String getRieBoClassName() {
		return rieBoClassName;
	}
	public void setRieBoClassName(String rieBoClassName) {
		if ( null != rieBoClassName && rieBoClassName.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for rieBoClassName. Tried to set value: "+
				rieBoClassName);
		}
		this.rieBoClassName = rieBoClassName;
	}

	public Boolean isIsSystem() {
		return isSystem;
	}
	public void setIsSystem(Boolean isSystem) {
		this.isSystem = isSystem;
	}

	public java.util.List getContextVariables() {
		if ( null == contextVariables ) {
			contextVariables = new java.util.ArrayList();
		}
		return contextVariables;
	}
	public void setContextVariables(java.util.List paramValue) {
		this.contextVariables = paramValue;
	}

	public java.util.List getLookups() {
		if ( null == lookups ) {
			lookups = new java.util.ArrayList();
		}
		return lookups;
	}
	public void setLookups(java.util.List paramValue) {
		this.lookups = paramValue;
	}

	public java.util.Set getMenuActions() {
		if ( null == menuActions ) {
			menuActions = new java.util.HashSet();
		}
		return menuActions;
	}
	public void setMenuActions(java.util.Set paramValue) {
		this.menuActions = paramValue;
	}

	public Boolean isInformationBarVisible() {
		return informationBarVisible;
	}
	public void setInformationBarVisible(Boolean informationBarVisible) {
		this.informationBarVisible = informationBarVisible;
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

	public ims.core.configuration.domain.objects.AppImage getImage() {
		return image;
	}
	public void setImage(ims.core.configuration.domain.objects.AppImage image) {
		this.image = image;
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
		
		auditStr.append("\r\n*namespace* :");
		if (namespace != null)
		{
			auditStr.append(toShortClassName(namespace));
				
		    auditStr.append(namespace.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*name* :");
		auditStr.append(name);
	    auditStr.append("; ");
		auditStr.append("\r\n*aliasName* :");
		auditStr.append(aliasName);
	    auditStr.append("; ");
		auditStr.append("\r\n*caption* :");
		auditStr.append(caption);
	    auditStr.append("; ");
		auditStr.append("\r\n*isDialog* :");
		auditStr.append(isDialog);
	    auditStr.append("; ");
		auditStr.append("\r\n*isComponent* :");
		auditStr.append(isComponent);
	    auditStr.append("; ");
		auditStr.append("\r\n*canBeInNavigation* :");
		auditStr.append(canBeInNavigation);
	    auditStr.append("; ");
		auditStr.append("\r\n*canBeInTopButtons* :");
		auditStr.append(canBeInTopButtons);
	    auditStr.append("; ");
		auditStr.append("\r\n*isAlias* :");
		auditStr.append(isAlias);
	    auditStr.append("; ");
		auditStr.append("\r\n*logicClass* :");
		auditStr.append(logicClass);
	    auditStr.append("; ");
		auditStr.append("\r\n*accessClass* :");
		auditStr.append(accessClass);
	    auditStr.append("; ");
		auditStr.append("\r\n*domainClass* :");
		auditStr.append(domainClass);
	    auditStr.append("; ");
		auditStr.append("\r\n*helpLink* :");
		auditStr.append(helpLink);
	    auditStr.append("; ");
		auditStr.append("\r\n*rieBoClassName* :");
		auditStr.append(rieBoClassName);
	    auditStr.append("; ");
		auditStr.append("\r\n*isSystem* :");
		auditStr.append(isSystem);
	    auditStr.append("; ");
		auditStr.append("\r\n*contextVariables* :");
		if (contextVariables != null)
		{
		int i16=0;
		for (i16=0; i16<contextVariables.size(); i16++)
		{
			if (i16 > 0)
				auditStr.append(",");
			ims.core.configuration.domain.objects.AppFormContextVariable obj = (ims.core.configuration.domain.objects.AppFormContextVariable)contextVariables.get(i16);
		    if (obj != null)
			{
				if (i16 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i16 > 0)
			auditStr.append("] " + i16);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*lookups* :");
		if (lookups != null)
		{
		int i17=0;
		for (i17=0; i17<lookups.size(); i17++)
		{
			if (i17 > 0)
				auditStr.append(",");
			ims.core.configuration.domain.objects.AppFormLookup obj = (ims.core.configuration.domain.objects.AppFormLookup)lookups.get(i17);
		    if (obj != null)
			{
				if (i17 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i17 > 0)
			auditStr.append("] " + i17);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*menuActions* :");
		if (menuActions != null)
		{
			java.util.Iterator it18 = menuActions.iterator();
			int i18=0;
			while (it18.hasNext())
			{
				if (i18 > 0)
					auditStr.append(",");
				ims.core.configuration.domain.objects.MenuAction obj = (ims.core.configuration.domain.objects.MenuAction)it18.next();
		if (obj != null)
		{
		   if (i18 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i18++;
		}
		if (i18 > 0)
			auditStr.append("] " + i18);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*informationBarVisible* :");
		auditStr.append(informationBarVisible);
	    auditStr.append("; ");
		auditStr.append("\r\n*description* :");
		auditStr.append(description);
	    auditStr.append("; ");
		auditStr.append("\r\n*image* :");
		if (image != null)
		{
			auditStr.append(toShortClassName(image));
				
		    auditStr.append(image.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*codeMappings* :");
		if (codeMappings != null)
		{
		int i22=0;
		for (i22=0; i22<codeMappings.size(); i22++)
		{
			if (i22 > 0)
				auditStr.append(",");
			ims.core.clinical.domain.objects.TaxonomyMap obj = (ims.core.clinical.domain.objects.TaxonomyMap)codeMappings.get(i22);
		    if (obj != null)
			{
				if (i22 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i22 > 0)
			auditStr.append("] " + i22);
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
		
		String keyClassName = "AppForm";
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
		if (this.getNamespace() != null)
		{
			sb.append("<namespace>");
			sb.append(this.getNamespace().toXMLString(domMap)); 	
			sb.append("</namespace>");		
		}
		if (this.getName() != null)
		{
			sb.append("<name>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getName().toString()));
			sb.append("</name>");		
		}
		if (this.getAliasName() != null)
		{
			sb.append("<aliasName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAliasName().toString()));
			sb.append("</aliasName>");		
		}
		if (this.getCaption() != null)
		{
			sb.append("<caption>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCaption().toString()));
			sb.append("</caption>");		
		}
		if (this.isIsDialog() != null)
		{
			sb.append("<isDialog>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsDialog().toString()));
			sb.append("</isDialog>");		
		}
		if (this.isIsComponent() != null)
		{
			sb.append("<isComponent>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsComponent().toString()));
			sb.append("</isComponent>");		
		}
		if (this.isCanBeInNavigation() != null)
		{
			sb.append("<canBeInNavigation>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isCanBeInNavigation().toString()));
			sb.append("</canBeInNavigation>");		
		}
		if (this.isCanBeInTopButtons() != null)
		{
			sb.append("<canBeInTopButtons>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isCanBeInTopButtons().toString()));
			sb.append("</canBeInTopButtons>");		
		}
		if (this.isIsAlias() != null)
		{
			sb.append("<isAlias>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsAlias().toString()));
			sb.append("</isAlias>");		
		}
		if (this.getLogicClass() != null)
		{
			sb.append("<logicClass>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLogicClass().toString()));
			sb.append("</logicClass>");		
		}
		if (this.getAccessClass() != null)
		{
			sb.append("<accessClass>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAccessClass().toString()));
			sb.append("</accessClass>");		
		}
		if (this.getDomainClass() != null)
		{
			sb.append("<domainClass>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDomainClass().toString()));
			sb.append("</domainClass>");		
		}
		if (this.getHelpLink() != null)
		{
			sb.append("<helpLink>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getHelpLink().toString()));
			sb.append("</helpLink>");		
		}
		if (this.getRieBoClassName() != null)
		{
			sb.append("<rieBoClassName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRieBoClassName().toString()));
			sb.append("</rieBoClassName>");		
		}
		if (this.isIsSystem() != null)
		{
			sb.append("<isSystem>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsSystem().toString()));
			sb.append("</isSystem>");		
		}
		if (this.getContextVariables() != null)
		{
			if (this.getContextVariables().size() > 0 )
			{
			sb.append("<contextVariables>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getContextVariables(), domMap));
			sb.append("</contextVariables>");		
			}
		}
		if (this.getLookups() != null)
		{
			if (this.getLookups().size() > 0 )
			{
			sb.append("<lookups>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getLookups(), domMap));
			sb.append("</lookups>");		
			}
		}
		if (this.getMenuActions() != null)
		{
			if (this.getMenuActions().size() > 0 )
			{
			sb.append("<menuActions>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getMenuActions(), domMap));
			sb.append("</menuActions>");		
			}
		}
		if (this.isInformationBarVisible() != null)
		{
			sb.append("<informationBarVisible>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isInformationBarVisible().toString()));
			sb.append("</informationBarVisible>");		
		}
		if (this.getDescription() != null)
		{
			sb.append("<description>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDescription().toString()));
			sb.append("</description>");		
		}
		if (this.getImage() != null)
		{
			sb.append("<image>");
			sb.append(this.getImage().toXMLString(domMap)); 	
			sb.append("</image>");		
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
			AppForm domainObject = getAppFormfromXML(itemEl, factory, domMap);

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
			AppForm domainObject = getAppFormfromXML(itemEl, factory, domMap);

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
		
	public static AppForm getAppFormfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getAppFormfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static AppForm getAppFormfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!AppForm.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!AppForm.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the AppForm class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (AppForm)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(AppForm.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		AppForm ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (AppForm)factory.getImportedDomainObject(AppForm.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new AppForm();
		}
		String keyClassName = "AppForm";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (AppForm)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, AppForm obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("namespace");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setNamespace(ims.core.configuration.domain.objects.AppNameSpace.getAppNameSpacefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("name");
		if(fldEl != null)
		{	
    		obj.setName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("aliasName");
		if(fldEl != null)
		{	
    		obj.setAliasName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("caption");
		if(fldEl != null)
		{	
    		obj.setCaption(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isDialog");
		if(fldEl != null)
		{	
    		obj.setIsDialog(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isComponent");
		if(fldEl != null)
		{	
    		obj.setIsComponent(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("canBeInNavigation");
		if(fldEl != null)
		{	
    		obj.setCanBeInNavigation(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("canBeInTopButtons");
		if(fldEl != null)
		{	
    		obj.setCanBeInTopButtons(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isAlias");
		if(fldEl != null)
		{	
    		obj.setIsAlias(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("logicClass");
		if(fldEl != null)
		{	
    		obj.setLogicClass(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("accessClass");
		if(fldEl != null)
		{	
    		obj.setAccessClass(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("domainClass");
		if(fldEl != null)
		{	
    		obj.setDomainClass(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("helpLink");
		if(fldEl != null)
		{	
    		obj.setHelpLink(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("rieBoClassName");
		if(fldEl != null)
		{	
    		obj.setRieBoClassName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isSystem");
		if(fldEl != null)
		{	
    		obj.setIsSystem(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("contextVariables");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setContextVariables(ims.core.configuration.domain.objects.AppFormContextVariable.fromListXMLString(fldEl, factory, obj.getContextVariables(), domMap));
		}
		fldEl = el.element("lookups");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setLookups(ims.core.configuration.domain.objects.AppFormLookup.fromListXMLString(fldEl, factory, obj.getLookups(), domMap));
		}
		fldEl = el.element("menuActions");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setMenuActions(ims.core.configuration.domain.objects.MenuAction.fromSetXMLString(fldEl, factory, obj.getMenuActions(), domMap));
		}
		fldEl = el.element("informationBarVisible");
		if(fldEl != null)
		{	
    		obj.setInformationBarVisible(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("description");
		if(fldEl != null)
		{	
    		obj.setDescription(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("image");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setImage(ims.core.configuration.domain.objects.AppImage.getAppImagefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("codeMappings");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setCodeMappings(ims.core.clinical.domain.objects.TaxonomyMap.fromListXMLString(fldEl, factory, obj.getCodeMappings(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "contextVariables"
		, "lookups"
		, "menuActions"
		, "codeMappings"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Namespace = "namespace";
		public static final String Name = "name";
		public static final String AliasName = "aliasName";
		public static final String Caption = "caption";
		public static final String IsDialog = "isDialog";
		public static final String IsComponent = "isComponent";
		public static final String CanBeInNavigation = "canBeInNavigation";
		public static final String CanBeInTopButtons = "canBeInTopButtons";
		public static final String IsAlias = "isAlias";
		public static final String LogicClass = "logicClass";
		public static final String AccessClass = "accessClass";
		public static final String DomainClass = "domainClass";
		public static final String HelpLink = "helpLink";
		public static final String RieBoClassName = "rieBoClassName";
		public static final String IsSystem = "isSystem";
		public static final String ContextVariables = "contextVariables";
		public static final String Lookups = "lookups";
		public static final String MenuActions = "menuActions";
		public static final String InformationBarVisible = "informationBarVisible";
		public static final String Description = "description";
		public static final String Image = "image";
		public static final String CodeMappings = "codeMappings";
	}
}

