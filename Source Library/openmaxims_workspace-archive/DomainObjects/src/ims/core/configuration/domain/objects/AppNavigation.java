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


public class AppNavigation extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1028100027;
	private static final long serialVersionUID = 1028100027L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private String navigationName;
	private Boolean isActive;
	private String comment;
	/** 
	  * Collection of ims.core.configuration.domain.objects.AppNavRootGroup.
	  */
	private java.util.List rootGroups;
	private ims.core.configuration.domain.objects.AppForm patientSearchForm;
	private ims.core.configuration.domain.objects.AppForm startForm;
	/** Navigation style - text or images */
	private ims.domain.lookups.LookupInstance style;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public AppNavigation (Integer id, int ver)
    {
    	super(id, ver);
    }
    public AppNavigation ()
    {
    	super();
    }
    public AppNavigation (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.configuration.domain.objects.AppNavigation.class;
	}


	public String getNavigationName() {
		return navigationName;
	}
	public static AppNavigation getAppNavigationFromNavigationName(ims.domain.ILightweightDomainFactory factory, String val)
	{
		String hql = "from AppNavigation c where c.navigationName = :navigationName";		
		java.util.List l = factory.find(hql, new String[]{"navigationName"}, new Object[]{val});
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. AppNavigation.navigationName = " + val + " returned " + l.size() + " records. " );
		return (AppNavigation)l.get(0);
	}
	public void setNavigationName(String navigationName) {
		if ( null != navigationName && navigationName.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for navigationName. Tried to set value: "+
				navigationName);
		}
		this.navigationName = navigationName;
	}

	public Boolean isIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		if ( null != comment && comment.length() > 200 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for comment. Tried to set value: "+
				comment);
		}
		this.comment = comment;
	}

	public java.util.List getRootGroups() {
		if ( null == rootGroups ) {
			rootGroups = new java.util.ArrayList();
		}
		return rootGroups;
	}
	public void setRootGroups(java.util.List paramValue) {
		this.rootGroups = paramValue;
	}

	public ims.core.configuration.domain.objects.AppForm getPatientSearchForm() {
		return patientSearchForm;
	}
	public void setPatientSearchForm(ims.core.configuration.domain.objects.AppForm patientSearchForm) {
		this.patientSearchForm = patientSearchForm;
	}

	public ims.core.configuration.domain.objects.AppForm getStartForm() {
		return startForm;
	}
	public void setStartForm(ims.core.configuration.domain.objects.AppForm startForm) {
		this.startForm = startForm;
	}

	public ims.domain.lookups.LookupInstance getStyle() {
		return style;
	}
	public void setStyle(ims.domain.lookups.LookupInstance style) {
		this.style = style;
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
		
		auditStr.append("\r\n*navigationName* :");
		auditStr.append(navigationName);
	    auditStr.append("; ");
		auditStr.append("\r\n*isActive* :");
		auditStr.append(isActive);
	    auditStr.append("; ");
		auditStr.append("\r\n*comment* :");
		auditStr.append(comment);
	    auditStr.append("; ");
		auditStr.append("\r\n*rootGroups* :");
		if (rootGroups != null)
		{
		int i4=0;
		for (i4=0; i4<rootGroups.size(); i4++)
		{
			if (i4 > 0)
				auditStr.append(",");
			ims.core.configuration.domain.objects.AppNavRootGroup obj = (ims.core.configuration.domain.objects.AppNavRootGroup)rootGroups.get(i4);
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
		auditStr.append("\r\n*patientSearchForm* :");
		if (patientSearchForm != null)
		{
			auditStr.append(toShortClassName(patientSearchForm));
				
		    auditStr.append(patientSearchForm.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*startForm* :");
		if (startForm != null)
		{
			auditStr.append(toShortClassName(startForm));
				
		    auditStr.append(startForm.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*style* :");
		if (style != null)
			auditStr.append(style.getText());
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
		
		String keyClassName = "AppNavigation";
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
		if (this.getNavigationName() != null)
		{
			sb.append("<navigationName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNavigationName().toString()));
			sb.append("</navigationName>");		
		}
		if (this.isIsActive() != null)
		{
			sb.append("<isActive>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsActive().toString()));
			sb.append("</isActive>");		
		}
		if (this.getComment() != null)
		{
			sb.append("<comment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getComment().toString()));
			sb.append("</comment>");		
		}
		if (this.getRootGroups() != null)
		{
			if (this.getRootGroups().size() > 0 )
			{
			sb.append("<rootGroups>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getRootGroups(), domMap));
			sb.append("</rootGroups>");		
			}
		}
		if (this.getPatientSearchForm() != null)
		{
			sb.append("<patientSearchForm>");
			sb.append(this.getPatientSearchForm().toXMLString(domMap)); 	
			sb.append("</patientSearchForm>");		
		}
		if (this.getStartForm() != null)
		{
			sb.append("<startForm>");
			sb.append(this.getStartForm().toXMLString(domMap)); 	
			sb.append("</startForm>");		
		}
		if (this.getStyle() != null)
		{
			sb.append("<style>");
			sb.append(this.getStyle().toXMLString()); 
			sb.append("</style>");		
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
			AppNavigation domainObject = getAppNavigationfromXML(itemEl, factory, domMap);

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
			AppNavigation domainObject = getAppNavigationfromXML(itemEl, factory, domMap);

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
		
	public static AppNavigation getAppNavigationfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getAppNavigationfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static AppNavigation getAppNavigationfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!AppNavigation.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!AppNavigation.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the AppNavigation class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (AppNavigation)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(AppNavigation.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		AppNavigation ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (AppNavigation)factory.getImportedDomainObject(AppNavigation.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new AppNavigation();
		}
		String keyClassName = "AppNavigation";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (AppNavigation)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, AppNavigation obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("navigationName");
		if(fldEl != null)
		{	
    		obj.setNavigationName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isActive");
		if(fldEl != null)
		{	
    		obj.setIsActive(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("comment");
		if(fldEl != null)
		{	
    		obj.setComment(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("rootGroups");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setRootGroups(ims.core.configuration.domain.objects.AppNavRootGroup.fromListXMLString(fldEl, factory, obj.getRootGroups(), domMap));
		}
		fldEl = el.element("patientSearchForm");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatientSearchForm(ims.core.configuration.domain.objects.AppForm.getAppFormfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("startForm");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setStartForm(ims.core.configuration.domain.objects.AppForm.getAppFormfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("style");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setStyle(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "rootGroups"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String NavigationName = "navigationName";
		public static final String IsActive = "isActive";
		public static final String Comment = "comment";
		public static final String RootGroups = "rootGroups";
		public static final String PatientSearchForm = "patientSearchForm";
		public static final String StartForm = "startForm";
		public static final String Style = "style";
	}
}

