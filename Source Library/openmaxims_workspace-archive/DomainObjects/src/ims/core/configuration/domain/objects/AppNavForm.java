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


public class AppNavForm extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1028100030;
	private static final long serialVersionUID = 1028100030L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return false;
	}

	private String nodeText;
	private ims.core.configuration.domain.objects.AppForm form;
	private Boolean isReadOnly;
	private ims.domain.lookups.LookupInstance accessForRip;
	private ims.domain.lookups.LookupInstance accessForEpisEnd;
	private Integer posIndex;
	/** 
	  * Collection of ims.core.generic.domain.objects.GenericIdentifier.
	  */
	private java.util.List linkedClasses;
    public AppNavForm (Integer id, int ver)
    {
    	super(id, ver);
    }
    public AppNavForm ()
    {
    	super();
    }
    public AppNavForm (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.configuration.domain.objects.AppNavForm.class;
	}


	public String getNodeText() {
		return nodeText;
	}
	public void setNodeText(String nodeText) {
		if ( null != nodeText && nodeText.length() > 50 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for nodeText. Tried to set value: "+
				nodeText);
		}
		this.nodeText = nodeText;
	}

	public ims.core.configuration.domain.objects.AppForm getForm() {
		return form;
	}
	public void setForm(ims.core.configuration.domain.objects.AppForm form) {
		this.form = form;
	}

	public Boolean isIsReadOnly() {
		return isReadOnly;
	}
	public void setIsReadOnly(Boolean isReadOnly) {
		this.isReadOnly = isReadOnly;
	}

	public ims.domain.lookups.LookupInstance getAccessForRip() {
		return accessForRip;
	}
	public void setAccessForRip(ims.domain.lookups.LookupInstance accessForRip) {
		this.accessForRip = accessForRip;
	}

	public ims.domain.lookups.LookupInstance getAccessForEpisEnd() {
		return accessForEpisEnd;
	}
	public void setAccessForEpisEnd(ims.domain.lookups.LookupInstance accessForEpisEnd) {
		this.accessForEpisEnd = accessForEpisEnd;
	}

	public Integer getPosIndex() {
		return posIndex;
	}
	public void setPosIndex(Integer posIndex) {
		this.posIndex = posIndex;
	}

	public java.util.List getLinkedClasses() {
		if ( null == linkedClasses ) {
			linkedClasses = new java.util.ArrayList();
		}
		return linkedClasses;
	}
	public void setLinkedClasses(java.util.List paramValue) {
		this.linkedClasses = paramValue;
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
		
		auditStr.append("\r\n*nodeText* :");
		auditStr.append(nodeText);
	    auditStr.append("; ");
		auditStr.append("\r\n*form* :");
		if (form != null)
		{
			auditStr.append(toShortClassName(form));
				
		    auditStr.append(form.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isReadOnly* :");
		auditStr.append(isReadOnly);
	    auditStr.append("; ");
		auditStr.append("\r\n*accessForRip* :");
		if (accessForRip != null)
			auditStr.append(accessForRip.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*accessForEpisEnd* :");
		if (accessForEpisEnd != null)
			auditStr.append(accessForEpisEnd.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*posIndex* :");
		auditStr.append(posIndex);
	    auditStr.append("; ");
		auditStr.append("\r\n*linkedClasses* :");
		if (linkedClasses != null)
		{
		int i7=0;
		for (i7=0; i7<linkedClasses.size(); i7++)
		{
			if (i7 > 0)
				auditStr.append(",");
			ims.core.generic.domain.objects.GenericIdentifier obj = (ims.core.generic.domain.objects.GenericIdentifier)linkedClasses.get(i7);
		    if (obj != null)
			{
				if (i7 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i7 > 0)
			auditStr.append("] " + i7);
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
		
		String keyClassName = "AppNavForm";
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
		if (this.getNodeText() != null)
		{
			sb.append("<nodeText>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNodeText().toString()));
			sb.append("</nodeText>");		
		}
		if (this.getForm() != null)
		{
			sb.append("<form>");
			sb.append(this.getForm().toXMLString(domMap)); 	
			sb.append("</form>");		
		}
		if (this.isIsReadOnly() != null)
		{
			sb.append("<isReadOnly>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsReadOnly().toString()));
			sb.append("</isReadOnly>");		
		}
		if (this.getAccessForRip() != null)
		{
			sb.append("<accessForRip>");
			sb.append(this.getAccessForRip().toXMLString()); 
			sb.append("</accessForRip>");		
		}
		if (this.getAccessForEpisEnd() != null)
		{
			sb.append("<accessForEpisEnd>");
			sb.append(this.getAccessForEpisEnd().toXMLString()); 
			sb.append("</accessForEpisEnd>");		
		}
		if (this.getPosIndex() != null)
		{
			sb.append("<posIndex>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPosIndex().toString()));
			sb.append("</posIndex>");		
		}
		if (this.getLinkedClasses() != null)
		{
			if (this.getLinkedClasses().size() > 0 )
			{
			sb.append("<linkedClasses>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getLinkedClasses(), domMap));
			sb.append("</linkedClasses>");		
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
			AppNavForm domainObject = getAppNavFormfromXML(itemEl, factory, domMap);

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
			AppNavForm domainObject = getAppNavFormfromXML(itemEl, factory, domMap);

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
		
	public static AppNavForm getAppNavFormfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getAppNavFormfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static AppNavForm getAppNavFormfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!AppNavForm.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!AppNavForm.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the AppNavForm class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (AppNavForm)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(AppNavForm.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		AppNavForm ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (AppNavForm)factory.getImportedDomainObject(AppNavForm.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new AppNavForm();
		}
		String keyClassName = "AppNavForm";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (AppNavForm)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, AppNavForm obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("nodeText");
		if(fldEl != null)
		{	
    		obj.setNodeText(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("form");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setForm(ims.core.configuration.domain.objects.AppForm.getAppFormfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("isReadOnly");
		if(fldEl != null)
		{	
    		obj.setIsReadOnly(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("accessForRip");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAccessForRip(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("accessForEpisEnd");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAccessForEpisEnd(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("posIndex");
		if(fldEl != null)
		{	
    		obj.setPosIndex(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("linkedClasses");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setLinkedClasses(ims.core.generic.domain.objects.GenericIdentifier.fromListXMLString(fldEl, factory, obj.getLinkedClasses(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "linkedClasses"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String NodeText = "nodeText";
		public static final String Form = "form";
		public static final String IsReadOnly = "isReadOnly";
		public static final String AccessForRip = "accessForRip";
		public static final String AccessForEpisEnd = "accessForEpisEnd";
		public static final String PosIndex = "posIndex";
		public static final String LinkedClasses = "linkedClasses";
	}
}

