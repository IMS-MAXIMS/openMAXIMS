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
 * @author Daniel Laffan
 * Generated.
 */


public class DrawingGraphicImage extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1028100007;
	private static final long serialVersionUID = 1028100007L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Name of Image */
	private String imageName;
	/** Image Description */
	private String imageDescription;
	/** Actual Image to be Used */
	private ims.core.configuration.domain.objects.AppImage image;
	/** Root Image Configuration */
	private ims.core.configuration.domain.objects.DrawingGraphicGroup rootGroup;
	/** Version Number */
	private Integer versionNumber;
	/** ImageStatus */
	private ims.domain.lookups.LookupInstance imageStatus;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public DrawingGraphicImage (Integer id, int ver)
    {
    	super(id, ver);
    }
    public DrawingGraphicImage ()
    {
    	super();
    }
    public DrawingGraphicImage (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.configuration.domain.objects.DrawingGraphicImage.class;
	}


	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		if ( null != imageName && imageName.length() > 70 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for imageName. Tried to set value: "+
				imageName);
		}
		this.imageName = imageName;
	}

	public String getImageDescription() {
		return imageDescription;
	}
	public void setImageDescription(String imageDescription) {
		if ( null != imageDescription && imageDescription.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for imageDescription. Tried to set value: "+
				imageDescription);
		}
		this.imageDescription = imageDescription;
	}

	public ims.core.configuration.domain.objects.AppImage getImage() {
		return image;
	}
	public void setImage(ims.core.configuration.domain.objects.AppImage image) {
		this.image = image;
	}

	public ims.core.configuration.domain.objects.DrawingGraphicGroup getRootGroup() {
		return rootGroup;
	}
	public void setRootGroup(ims.core.configuration.domain.objects.DrawingGraphicGroup rootGroup) {
		this.rootGroup = rootGroup;
	}

	public Integer getVersionNumber() {
		return versionNumber;
	}
	public void setVersionNumber(Integer versionNumber) {
		this.versionNumber = versionNumber;
	}

	public ims.domain.lookups.LookupInstance getImageStatus() {
		return imageStatus;
	}
	public void setImageStatus(ims.domain.lookups.LookupInstance imageStatus) {
		this.imageStatus = imageStatus;
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
		
		auditStr.append("\r\n*imageName* :");
		auditStr.append(imageName);
	    auditStr.append("; ");
		auditStr.append("\r\n*imageDescription* :");
		auditStr.append(imageDescription);
	    auditStr.append("; ");
		auditStr.append("\r\n*image* :");
		if (image != null)
		{
			auditStr.append(toShortClassName(image));
				
		    auditStr.append(image.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*rootGroup* :");
		if (rootGroup != null)
		{
			auditStr.append(toShortClassName(rootGroup));
				
		    auditStr.append(rootGroup.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*versionNumber* :");
		auditStr.append(versionNumber);
	    auditStr.append("; ");
		auditStr.append("\r\n*imageStatus* :");
		if (imageStatus != null)
			auditStr.append(imageStatus.getText());
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
		
		String keyClassName = "DrawingGraphicImage";
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
		if (this.getImageName() != null)
		{
			sb.append("<imageName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getImageName().toString()));
			sb.append("</imageName>");		
		}
		if (this.getImageDescription() != null)
		{
			sb.append("<imageDescription>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getImageDescription().toString()));
			sb.append("</imageDescription>");		
		}
		if (this.getImage() != null)
		{
			sb.append("<image>");
			sb.append(this.getImage().toXMLString(domMap)); 	
			sb.append("</image>");		
		}
		if (this.getRootGroup() != null)
		{
			sb.append("<rootGroup>");
			sb.append(this.getRootGroup().toXMLString(domMap)); 	
			sb.append("</rootGroup>");		
		}
		if (this.getVersionNumber() != null)
		{
			sb.append("<versionNumber>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getVersionNumber().toString()));
			sb.append("</versionNumber>");		
		}
		if (this.getImageStatus() != null)
		{
			sb.append("<imageStatus>");
			sb.append(this.getImageStatus().toXMLString()); 
			sb.append("</imageStatus>");		
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
			DrawingGraphicImage domainObject = getDrawingGraphicImagefromXML(itemEl, factory, domMap);

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
			DrawingGraphicImage domainObject = getDrawingGraphicImagefromXML(itemEl, factory, domMap);

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
		
	public static DrawingGraphicImage getDrawingGraphicImagefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getDrawingGraphicImagefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static DrawingGraphicImage getDrawingGraphicImagefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!DrawingGraphicImage.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!DrawingGraphicImage.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the DrawingGraphicImage class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (DrawingGraphicImage)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(DrawingGraphicImage.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		DrawingGraphicImage ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (DrawingGraphicImage)factory.getImportedDomainObject(DrawingGraphicImage.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new DrawingGraphicImage();
		}
		String keyClassName = "DrawingGraphicImage";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (DrawingGraphicImage)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, DrawingGraphicImage obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("imageName");
		if(fldEl != null)
		{	
    		obj.setImageName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("imageDescription");
		if(fldEl != null)
		{	
    		obj.setImageDescription(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("image");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setImage(ims.core.configuration.domain.objects.AppImage.getAppImagefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("rootGroup");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRootGroup(ims.core.configuration.domain.objects.DrawingGraphicGroup.getDrawingGraphicGroupfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("versionNumber");
		if(fldEl != null)
		{	
    		obj.setVersionNumber(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("imageStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setImageStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
		public static final String ImageName = "imageName";
		public static final String ImageDescription = "imageDescription";
		public static final String Image = "image";
		public static final String RootGroup = "rootGroup";
		public static final String VersionNumber = "versionNumber";
		public static final String ImageStatus = "imageStatus";
	}
}

