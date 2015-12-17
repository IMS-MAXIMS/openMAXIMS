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


public class AppNavSecondGroup extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1028100029;
	private static final long serialVersionUID = 1028100029L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private String groupName;
	/** 
	  * Collection of ims.core.configuration.domain.objects.AppNavForm.
	  */
	private java.util.List forms;
	private Integer posIndex;
	private ims.core.configuration.domain.objects.AppImage image;
    public AppNavSecondGroup (Integer id, int ver)
    {
    	super(id, ver);
    }
    public AppNavSecondGroup ()
    {
    	super();
    }
    public AppNavSecondGroup (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.configuration.domain.objects.AppNavSecondGroup.class;
	}


	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		if ( null != groupName && groupName.length() > 50 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for groupName. Tried to set value: "+
				groupName);
		}
		this.groupName = groupName;
	}

	public java.util.List getForms() {
		if ( null == forms ) {
			forms = new java.util.ArrayList();
		}
		return forms;
	}
	public void setForms(java.util.List paramValue) {
		this.forms = paramValue;
	}

	public Integer getPosIndex() {
		return posIndex;
	}
	public void setPosIndex(Integer posIndex) {
		this.posIndex = posIndex;
	}

	public ims.core.configuration.domain.objects.AppImage getImage() {
		return image;
	}
	public void setImage(ims.core.configuration.domain.objects.AppImage image) {
		this.image = image;
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
		
		auditStr.append("\r\n*groupName* :");
		auditStr.append(groupName);
	    auditStr.append("; ");
		auditStr.append("\r\n*forms* :");
		if (forms != null)
		{
		int i2=0;
		for (i2=0; i2<forms.size(); i2++)
		{
			if (i2 > 0)
				auditStr.append(",");
			ims.core.configuration.domain.objects.AppNavForm obj = (ims.core.configuration.domain.objects.AppNavForm)forms.get(i2);
		    if (obj != null)
			{
				if (i2 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i2 > 0)
			auditStr.append("] " + i2);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*posIndex* :");
		auditStr.append(posIndex);
	    auditStr.append("; ");
		auditStr.append("\r\n*image* :");
		if (image != null)
		{
			auditStr.append(toShortClassName(image));
				
		    auditStr.append(image.getId());
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
		
		String keyClassName = "AppNavSecondGroup";
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
		if (this.getGroupName() != null)
		{
			sb.append("<groupName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getGroupName().toString()));
			sb.append("</groupName>");		
		}
		if (this.getForms() != null)
		{
			if (this.getForms().size() > 0 )
			{
			sb.append("<forms>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getForms(), domMap));
			sb.append("</forms>");		
			}
		}
		if (this.getPosIndex() != null)
		{
			sb.append("<posIndex>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPosIndex().toString()));
			sb.append("</posIndex>");		
		}
		if (this.getImage() != null)
		{
			sb.append("<image>");
			sb.append(this.getImage().toXMLString(domMap)); 	
			sb.append("</image>");		
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
			AppNavSecondGroup domainObject = getAppNavSecondGroupfromXML(itemEl, factory, domMap);

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
			AppNavSecondGroup domainObject = getAppNavSecondGroupfromXML(itemEl, factory, domMap);

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
		
	public static AppNavSecondGroup getAppNavSecondGroupfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getAppNavSecondGroupfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static AppNavSecondGroup getAppNavSecondGroupfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!AppNavSecondGroup.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!AppNavSecondGroup.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the AppNavSecondGroup class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (AppNavSecondGroup)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(AppNavSecondGroup.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		AppNavSecondGroup ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (AppNavSecondGroup)factory.getImportedDomainObject(AppNavSecondGroup.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new AppNavSecondGroup();
		}
		String keyClassName = "AppNavSecondGroup";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (AppNavSecondGroup)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, AppNavSecondGroup obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("groupName");
		if(fldEl != null)
		{	
    		obj.setGroupName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("forms");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setForms(ims.core.configuration.domain.objects.AppNavForm.fromListXMLString(fldEl, factory, obj.getForms(), domMap));
		}
		fldEl = el.element("posIndex");
		if(fldEl != null)
		{	
    		obj.setPosIndex(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("image");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setImage(ims.core.configuration.domain.objects.AppImage.getAppImagefromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "forms"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String GroupName = "groupName";
		public static final String Forms = "forms";
		public static final String PosIndex = "posIndex";
		public static final String Image = "image";
	}
}

