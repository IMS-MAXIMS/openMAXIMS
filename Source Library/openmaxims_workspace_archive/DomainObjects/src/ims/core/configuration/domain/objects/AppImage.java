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


public class AppImage extends ims.domain.DomainObject implements java.io.Serializable , ims.framework.interfaces.IAppImage{
	public static final int CLASSID = 1021100003;
	private static final long serialVersionUID = 1021100003L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return false;
	}

	private String imagePath;
	/** True if Image supplied by IMS. False if Image set up by Site */
	private Boolean isSystem;
	/** Namespace ID from DevEnv. Null if Site supplied. */
	private Integer nameSpace;
	private Boolean isActive;
	private Integer width;
	private Integer height;
    public AppImage (Integer id, int ver)
    {
    	super(id, ver);
    }
    public AppImage ()
    {
    	super();
    }
    public AppImage (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.configuration.domain.objects.AppImage.class;
	}


	public String getImagePath() {
		return imagePath;
	}
	public static AppImage getAppImageFromImagePath(ims.domain.ILightweightDomainFactory factory, String val)
	{
		String hql = "from AppImage c where c.imagePath = :imagePath";		
		java.util.List l = factory.find(hql, new String[]{"imagePath"}, new Object[]{val});
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. AppImage.imagePath = " + val + " returned " + l.size() + " records. " );
		return (AppImage)l.get(0);
	}
	public void setImagePath(String imagePath) {
		if ( null != imagePath && imagePath.length() > 200 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for imagePath. Tried to set value: "+
				imagePath);
		}
		this.imagePath = imagePath;
	}

	public Boolean isIsSystem() {
		return isSystem;
	}
	public void setIsSystem(Boolean isSystem) {
		this.isSystem = isSystem;
	}

	public Integer getNameSpace() {
		return nameSpace;
	}
	public void setNameSpace(Integer nameSpace) {
		this.nameSpace = nameSpace;
	}

	public Boolean isIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Integer getWidth() {
		return width;
	}
	public void setWidth(Integer width) {
		this.width = width;
	}

	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
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
		
		auditStr.append("\r\n*imagePath* :");
		auditStr.append(imagePath);
	    auditStr.append("; ");
		auditStr.append("\r\n*isSystem* :");
		auditStr.append(isSystem);
	    auditStr.append("; ");
		auditStr.append("\r\n*nameSpace* :");
		auditStr.append(nameSpace);
	    auditStr.append("; ");
		auditStr.append("\r\n*isActive* :");
		auditStr.append(isActive);
	    auditStr.append("; ");
		auditStr.append("\r\n*width* :");
		auditStr.append(width);
	    auditStr.append("; ");
		auditStr.append("\r\n*height* :");
		auditStr.append(height);
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
		
		String keyClassName = "AppImage";
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
		if (this.getImagePath() != null)
		{
			sb.append("<imagePath>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getImagePath().toString()));
			sb.append("</imagePath>");		
		}
		if (this.isIsSystem() != null)
		{
			sb.append("<isSystem>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsSystem().toString()));
			sb.append("</isSystem>");		
		}
		if (this.getNameSpace() != null)
		{
			sb.append("<nameSpace>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNameSpace().toString()));
			sb.append("</nameSpace>");		
		}
		if (this.isIsActive() != null)
		{
			sb.append("<isActive>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsActive().toString()));
			sb.append("</isActive>");		
		}
		if (this.getWidth() != null)
		{
			sb.append("<width>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getWidth().toString()));
			sb.append("</width>");		
		}
		if (this.getHeight() != null)
		{
			sb.append("<height>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getHeight().toString()));
			sb.append("</height>");		
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
			AppImage domainObject = getAppImagefromXML(itemEl, factory, domMap);

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
			AppImage domainObject = getAppImagefromXML(itemEl, factory, domMap);

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
		
	public static AppImage getAppImagefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getAppImagefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static AppImage getAppImagefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!AppImage.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!AppImage.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the AppImage class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (AppImage)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(AppImage.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		AppImage ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (AppImage)factory.getImportedDomainObject(AppImage.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new AppImage();
		}
		String keyClassName = "AppImage";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (AppImage)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, AppImage obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("imagePath");
		if(fldEl != null)
		{	
    		obj.setImagePath(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isSystem");
		if(fldEl != null)
		{	
    		obj.setIsSystem(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("nameSpace");
		if(fldEl != null)
		{	
    		obj.setNameSpace(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isActive");
		if(fldEl != null)
		{	
    		obj.setIsActive(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("width");
		if(fldEl != null)
		{	
    		obj.setWidth(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("height");
		if(fldEl != null)
		{	
    		obj.setHeight(new Integer(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		};
	}

	/**
	Image interface methods
	*/
	public int getImageId()
	{
		return this.getId().intValue();
	}
	public int getImageWidth()
	{
		return this.width.intValue();
	}
	public int getImageHeight()
	{
		return this.height.intValue();
	}
	public ims.framework.utils.beans.ImageBean getImageBean()
	{
		return new ims.framework.utils.beans.ImageBean(this);
	}
	public ims.framework.utils.ImageInfo getImageInfo()
	{
		return ims.framework.utils.ImagePath.getImageInfo(this.getImagePath());
	}
	public boolean isActive()
	{
		if(isActive != null && isActive.booleanValue())
			return true;
		return false;
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String ImagePath = "imagePath";
		public static final String IsSystem = "isSystem";
		public static final String NameSpace = "nameSpace";
		public static final String IsActive = "isActive";
		public static final String Width = "width";
		public static final String Height = "height";
	}
}

