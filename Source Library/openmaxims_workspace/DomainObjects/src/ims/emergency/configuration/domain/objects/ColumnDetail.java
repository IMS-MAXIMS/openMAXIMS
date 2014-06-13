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
package ims.emergency.configuration.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class ColumnDetail extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1087100002;
	private static final long serialVersionUID = 1087100002L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Column Header */
	private String colHeader;
	/** Column Width */
	private Integer colWidth;
	/** Display Image */
	private Boolean displayImage;
	/** Image */
	private ims.core.configuration.domain.objects.AppImage image;
	private ims.domain.lookups.LookupInstance column;
	/** Mask In Public Area */
	private Boolean maskInPublicArea;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ColumnDetail (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ColumnDetail ()
    {
    	super();
    }
    public ColumnDetail (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.emergency.configuration.domain.objects.ColumnDetail.class;
	}


	public String getColHeader() {
		return colHeader;
	}
	public void setColHeader(String colHeader) {
		if ( null != colHeader && colHeader.length() > 50 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for colHeader. Tried to set value: "+
				colHeader);
		}
		this.colHeader = colHeader;
	}

	public Integer getColWidth() {
		return colWidth;
	}
	public void setColWidth(Integer colWidth) {
		this.colWidth = colWidth;
	}

	public Boolean isDisplayImage() {
		return displayImage;
	}
	public void setDisplayImage(Boolean displayImage) {
		this.displayImage = displayImage;
	}

	public ims.core.configuration.domain.objects.AppImage getImage() {
		return image;
	}
	public void setImage(ims.core.configuration.domain.objects.AppImage image) {
		this.image = image;
	}

	public ims.domain.lookups.LookupInstance getColumn() {
		return column;
	}
	public void setColumn(ims.domain.lookups.LookupInstance column) {
		this.column = column;
	}

	public Boolean isMaskInPublicArea() {
		return maskInPublicArea;
	}
	public void setMaskInPublicArea(Boolean maskInPublicArea) {
		this.maskInPublicArea = maskInPublicArea;
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
		
		auditStr.append("\r\n*colHeader* :");
		auditStr.append(colHeader);
	    auditStr.append("; ");
		auditStr.append("\r\n*colWidth* :");
		auditStr.append(colWidth);
	    auditStr.append("; ");
		auditStr.append("\r\n*displayImage* :");
		auditStr.append(displayImage);
	    auditStr.append("; ");
		auditStr.append("\r\n*image* :");
		if (image != null)
		{
			auditStr.append(toShortClassName(image));
				
		    auditStr.append(image.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*column* :");
		if (column != null)
			auditStr.append(column.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*maskInPublicArea* :");
		auditStr.append(maskInPublicArea);
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
		
		String keyClassName = "ColumnDetail";
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
		if (this.getColHeader() != null)
		{
			sb.append("<colHeader>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getColHeader().toString()));
			sb.append("</colHeader>");		
		}
		if (this.getColWidth() != null)
		{
			sb.append("<colWidth>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getColWidth().toString()));
			sb.append("</colWidth>");		
		}
		if (this.isDisplayImage() != null)
		{
			sb.append("<displayImage>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isDisplayImage().toString()));
			sb.append("</displayImage>");		
		}
		if (this.getImage() != null)
		{
			sb.append("<image>");
			sb.append(this.getImage().toXMLString(domMap)); 	
			sb.append("</image>");		
		}
		if (this.getColumn() != null)
		{
			sb.append("<column>");
			sb.append(this.getColumn().toXMLString()); 
			sb.append("</column>");		
		}
		if (this.isMaskInPublicArea() != null)
		{
			sb.append("<maskInPublicArea>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isMaskInPublicArea().toString()));
			sb.append("</maskInPublicArea>");		
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
			ColumnDetail domainObject = getColumnDetailfromXML(itemEl, factory, domMap);

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
			ColumnDetail domainObject = getColumnDetailfromXML(itemEl, factory, domMap);

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
		
	public static ColumnDetail getColumnDetailfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getColumnDetailfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ColumnDetail getColumnDetailfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ColumnDetail.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ColumnDetail.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ColumnDetail class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ColumnDetail)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ColumnDetail.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ColumnDetail ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ColumnDetail)factory.getImportedDomainObject(ColumnDetail.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ColumnDetail();
		}
		String keyClassName = "ColumnDetail";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ColumnDetail)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ColumnDetail obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("colHeader");
		if(fldEl != null)
		{	
    		obj.setColHeader(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("colWidth");
		if(fldEl != null)
		{	
    		obj.setColWidth(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("displayImage");
		if(fldEl != null)
		{	
    		obj.setDisplayImage(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("image");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setImage(ims.core.configuration.domain.objects.AppImage.getAppImagefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("column");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setColumn(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("maskInPublicArea");
		if(fldEl != null)
		{	
    		obj.setMaskInPublicArea(new Boolean(fldEl.getTextTrim()));	
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
		public static final String ColHeader = "colHeader";
		public static final String ColWidth = "colWidth";
		public static final String DisplayImage = "displayImage";
		public static final String Image = "image";
		public static final String Column = "column";
		public static final String MaskInPublicArea = "maskInPublicArea";
	}
}

