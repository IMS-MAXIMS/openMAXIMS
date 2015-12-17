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
package ims.ocrr.configuration.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class OrderEntryTemplate extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1061100005;
	private static final long serialVersionUID = 1061100005L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** FormName */
	private String formName;
	/** Menu Name */
	private String menuName;
	/** Description */
	private String description;
	/** Components
	  * Collection of ims.ocrr.configuration.domain.objects.OrderEntryTemplateComponent.
	  */
	private java.util.Set components;
	/** TemplateCategory */
	private ims.domain.lookups.LookupInstance templateCategory;
	/** ActiveStatus */
	private ims.domain.lookups.LookupInstance activeStatus;
	/** TemplatesLocations
	  * Collection of ims.ocrr.configuration.domain.objects.TemplateLocation.
	  */
	private java.util.Set templatesLocations;
	/** 
	  * Collection of ims.ocrr.configuration.domain.objects.OrderEntryTemplateColumn.
	  */
	private java.util.Set columns;
	/** Template Roles
	  * Collection of ims.ocrr.configuration.domain.objects.TemplateRole.
	  */
	private java.util.Set templateRoles;
	/** Form Text */
	private String formText;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public OrderEntryTemplate (Integer id, int ver)
    {
    	super(id, ver);
    }
    public OrderEntryTemplate ()
    {
    	super();
    }
    public OrderEntryTemplate (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.ocrr.configuration.domain.objects.OrderEntryTemplate.class;
	}


	public String getFormName() {
		return formName;
	}
	public void setFormName(String formName) {
		if ( null != formName && formName.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for formName. Tried to set value: "+
				formName);
		}
		this.formName = formName;
	}

	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		if ( null != menuName && menuName.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for menuName. Tried to set value: "+
				menuName);
		}
		this.menuName = menuName;
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

	public java.util.Set getComponents() {
		if ( null == components ) {
			components = new java.util.HashSet();
		}
		return components;
	}
	public void setComponents(java.util.Set paramValue) {
		this.components = paramValue;
	}

	public ims.domain.lookups.LookupInstance getTemplateCategory() {
		return templateCategory;
	}
	public void setTemplateCategory(ims.domain.lookups.LookupInstance templateCategory) {
		this.templateCategory = templateCategory;
	}

	public ims.domain.lookups.LookupInstance getActiveStatus() {
		return activeStatus;
	}
	public void setActiveStatus(ims.domain.lookups.LookupInstance activeStatus) {
		this.activeStatus = activeStatus;
	}

	public java.util.Set getTemplatesLocations() {
		if ( null == templatesLocations ) {
			templatesLocations = new java.util.HashSet();
		}
		return templatesLocations;
	}
	public void setTemplatesLocations(java.util.Set paramValue) {
		this.templatesLocations = paramValue;
	}

	public java.util.Set getColumns() {
		if ( null == columns ) {
			columns = new java.util.HashSet();
		}
		return columns;
	}
	public void setColumns(java.util.Set paramValue) {
		this.columns = paramValue;
	}

	public java.util.Set getTemplateRoles() {
		if ( null == templateRoles ) {
			templateRoles = new java.util.HashSet();
		}
		return templateRoles;
	}
	public void setTemplateRoles(java.util.Set paramValue) {
		this.templateRoles = paramValue;
	}

	public String getFormText() {
		return formText;
	}
	public void setFormText(String formText) {
		this.formText = formText;
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
		
		auditStr.append("\r\n*formName* :");
		auditStr.append(formName);
	    auditStr.append("; ");
		auditStr.append("\r\n*menuName* :");
		auditStr.append(menuName);
	    auditStr.append("; ");
		auditStr.append("\r\n*description* :");
		auditStr.append(description);
	    auditStr.append("; ");
		auditStr.append("\r\n*components* :");
		if (components != null)
		{
			java.util.Iterator it4 = components.iterator();
			int i4=0;
			while (it4.hasNext())
			{
				if (i4 > 0)
					auditStr.append(",");
				ims.ocrr.configuration.domain.objects.OrderEntryTemplateComponent obj = (ims.ocrr.configuration.domain.objects.OrderEntryTemplateComponent)it4.next();
		if (obj != null)
		{
		   if (i4 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i4++;
		}
		if (i4 > 0)
			auditStr.append("] " + i4);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*templateCategory* :");
		if (templateCategory != null)
			auditStr.append(templateCategory.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*activeStatus* :");
		if (activeStatus != null)
			auditStr.append(activeStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*templatesLocations* :");
		if (templatesLocations != null)
		{
			java.util.Iterator it7 = templatesLocations.iterator();
			int i7=0;
			while (it7.hasNext())
			{
				if (i7 > 0)
					auditStr.append(",");
				ims.ocrr.configuration.domain.objects.TemplateLocation obj = (ims.ocrr.configuration.domain.objects.TemplateLocation)it7.next();
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
		auditStr.append("\r\n*columns* :");
		if (columns != null)
		{
			java.util.Iterator it8 = columns.iterator();
			int i8=0;
			while (it8.hasNext())
			{
				if (i8 > 0)
					auditStr.append(",");
				ims.ocrr.configuration.domain.objects.OrderEntryTemplateColumn obj = (ims.ocrr.configuration.domain.objects.OrderEntryTemplateColumn)it8.next();
		if (obj != null)
		{
		   if (i8 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i8++;
		}
		if (i8 > 0)
			auditStr.append("] " + i8);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*templateRoles* :");
		if (templateRoles != null)
		{
			java.util.Iterator it9 = templateRoles.iterator();
			int i9=0;
			while (it9.hasNext())
			{
				if (i9 > 0)
					auditStr.append(",");
				ims.ocrr.configuration.domain.objects.TemplateRole obj = (ims.ocrr.configuration.domain.objects.TemplateRole)it9.next();
		if (obj != null)
		{
		   if (i9 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i9++;
		}
		if (i9 > 0)
			auditStr.append("] " + i9);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*formText* :");
		auditStr.append(formText);
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
		
		String keyClassName = "OrderEntryTemplate";
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
		if (this.getFormName() != null)
		{
			sb.append("<formName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getFormName().toString()));
			sb.append("</formName>");		
		}
		if (this.getMenuName() != null)
		{
			sb.append("<menuName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMenuName().toString()));
			sb.append("</menuName>");		
		}
		if (this.getDescription() != null)
		{
			sb.append("<description>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDescription().toString()));
			sb.append("</description>");		
		}
		if (this.getComponents() != null)
		{
			if (this.getComponents().size() > 0 )
			{
			sb.append("<components>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getComponents(), domMap));
			sb.append("</components>");		
			}
		}
		if (this.getTemplateCategory() != null)
		{
			sb.append("<templateCategory>");
			sb.append(this.getTemplateCategory().toXMLString()); 
			sb.append("</templateCategory>");		
		}
		if (this.getActiveStatus() != null)
		{
			sb.append("<activeStatus>");
			sb.append(this.getActiveStatus().toXMLString()); 
			sb.append("</activeStatus>");		
		}
		if (this.getTemplatesLocations() != null)
		{
			if (this.getTemplatesLocations().size() > 0 )
			{
			sb.append("<templatesLocations>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getTemplatesLocations(), domMap));
			sb.append("</templatesLocations>");		
			}
		}
		if (this.getColumns() != null)
		{
			if (this.getColumns().size() > 0 )
			{
			sb.append("<columns>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getColumns(), domMap));
			sb.append("</columns>");		
			}
		}
		if (this.getTemplateRoles() != null)
		{
			if (this.getTemplateRoles().size() > 0 )
			{
			sb.append("<templateRoles>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getTemplateRoles(), domMap));
			sb.append("</templateRoles>");		
			}
		}
		if (this.getFormText() != null)
		{
			sb.append("<formText>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getFormText().toString()));
			sb.append("</formText>");		
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
			OrderEntryTemplate domainObject = getOrderEntryTemplatefromXML(itemEl, factory, domMap);

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
			OrderEntryTemplate domainObject = getOrderEntryTemplatefromXML(itemEl, factory, domMap);

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
		
	public static OrderEntryTemplate getOrderEntryTemplatefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getOrderEntryTemplatefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static OrderEntryTemplate getOrderEntryTemplatefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!OrderEntryTemplate.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!OrderEntryTemplate.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the OrderEntryTemplate class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (OrderEntryTemplate)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(OrderEntryTemplate.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		OrderEntryTemplate ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (OrderEntryTemplate)factory.getImportedDomainObject(OrderEntryTemplate.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new OrderEntryTemplate();
		}
		String keyClassName = "OrderEntryTemplate";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (OrderEntryTemplate)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, OrderEntryTemplate obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("formName");
		if(fldEl != null)
		{	
    		obj.setFormName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("menuName");
		if(fldEl != null)
		{	
    		obj.setMenuName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("description");
		if(fldEl != null)
		{	
    		obj.setDescription(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("components");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setComponents(ims.ocrr.configuration.domain.objects.OrderEntryTemplateComponent.fromSetXMLString(fldEl, factory, obj.getComponents(), domMap));
		}
		fldEl = el.element("templateCategory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTemplateCategory(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("activeStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setActiveStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("templatesLocations");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setTemplatesLocations(ims.ocrr.configuration.domain.objects.TemplateLocation.fromSetXMLString(fldEl, factory, obj.getTemplatesLocations(), domMap));
		}
		fldEl = el.element("columns");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setColumns(ims.ocrr.configuration.domain.objects.OrderEntryTemplateColumn.fromSetXMLString(fldEl, factory, obj.getColumns(), domMap));
		}
		fldEl = el.element("templateRoles");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setTemplateRoles(ims.ocrr.configuration.domain.objects.TemplateRole.fromSetXMLString(fldEl, factory, obj.getTemplateRoles(), domMap));
		}
		fldEl = el.element("formText");
		if(fldEl != null)
		{	
    		obj.setFormText(new String(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "components"
		, "templatesLocations"
		, "columns"
		, "templateRoles"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String FormName = "formName";
		public static final String MenuName = "menuName";
		public static final String Description = "description";
		public static final String Components = "components";
		public static final String TemplateCategory = "templateCategory";
		public static final String ActiveStatus = "activeStatus";
		public static final String TemplatesLocations = "templatesLocations";
		public static final String Columns = "columns";
		public static final String TemplateRoles = "templateRoles";
		public static final String FormText = "formText";
	}
}

