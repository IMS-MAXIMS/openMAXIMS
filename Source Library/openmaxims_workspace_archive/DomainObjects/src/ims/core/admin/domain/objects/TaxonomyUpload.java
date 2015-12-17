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
package ims.core.admin.domain.objects;

/**
 * 
 * @author Sean Nesbitt
 * Generated.
 */


public class TaxonomyUpload extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1004100038;
	private static final long serialVersionUID = 1004100038L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Taxonomy Column Map Filename */
	private String taxonomyColumnMapFilename;
	/** Taxonomy Code */
	private ims.domain.lookups.LookupInstance taxonomyCode;
	/** TaxonomyFilename */
	private String taxonomyFilename;
	/** File Format Type */
	private ims.domain.lookups.LookupInstance fileType;
	private ims.domain.lookups.LookupInstance taxonomyElement;
	private String delimeter;
	private String qualifier;
	private Boolean deleteFirst;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public TaxonomyUpload (Integer id, int ver)
    {
    	super(id, ver);
    }
    public TaxonomyUpload ()
    {
    	super();
    }
    public TaxonomyUpload (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.admin.domain.objects.TaxonomyUpload.class;
	}


	public String getTaxonomyColumnMapFilename() {
		return taxonomyColumnMapFilename;
	}
	public void setTaxonomyColumnMapFilename(String taxonomyColumnMapFilename) {
		if ( null != taxonomyColumnMapFilename && taxonomyColumnMapFilename.length() > 200 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for taxonomyColumnMapFilename. Tried to set value: "+
				taxonomyColumnMapFilename);
		}
		this.taxonomyColumnMapFilename = taxonomyColumnMapFilename;
	}

	public ims.domain.lookups.LookupInstance getTaxonomyCode() {
		return taxonomyCode;
	}
	public void setTaxonomyCode(ims.domain.lookups.LookupInstance taxonomyCode) {
		this.taxonomyCode = taxonomyCode;
	}

	public String getTaxonomyFilename() {
		return taxonomyFilename;
	}
	public void setTaxonomyFilename(String taxonomyFilename) {
		if ( null != taxonomyFilename && taxonomyFilename.length() > 200 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for taxonomyFilename. Tried to set value: "+
				taxonomyFilename);
		}
		this.taxonomyFilename = taxonomyFilename;
	}

	public ims.domain.lookups.LookupInstance getFileType() {
		return fileType;
	}
	public void setFileType(ims.domain.lookups.LookupInstance fileType) {
		this.fileType = fileType;
	}

	public ims.domain.lookups.LookupInstance getTaxonomyElement() {
		return taxonomyElement;
	}
	public void setTaxonomyElement(ims.domain.lookups.LookupInstance taxonomyElement) {
		this.taxonomyElement = taxonomyElement;
	}

	public String getDelimeter() {
		return delimeter;
	}
	public void setDelimeter(String delimeter) {
		if ( null != delimeter && delimeter.length() > 4 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for delimeter. Tried to set value: "+
				delimeter);
		}
		this.delimeter = delimeter;
	}

	public String getQualifier() {
		return qualifier;
	}
	public void setQualifier(String qualifier) {
		if ( null != qualifier && qualifier.length() > 4 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for qualifier. Tried to set value: "+
				qualifier);
		}
		this.qualifier = qualifier;
	}

	public Boolean isDeleteFirst() {
		return deleteFirst;
	}
	public void setDeleteFirst(Boolean deleteFirst) {
		this.deleteFirst = deleteFirst;
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
		if ( "Instantiation".equals("Configuration") )
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
		
		auditStr.append("\r\n*taxonomyColumnMapFilename* :");
		auditStr.append(taxonomyColumnMapFilename);
	    auditStr.append("; ");
		auditStr.append("\r\n*taxonomyCode* :");
		if (taxonomyCode != null)
			auditStr.append(taxonomyCode.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*taxonomyFilename* :");
		auditStr.append(taxonomyFilename);
	    auditStr.append("; ");
		auditStr.append("\r\n*fileType* :");
		if (fileType != null)
			auditStr.append(fileType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*taxonomyElement* :");
		if (taxonomyElement != null)
			auditStr.append(taxonomyElement.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*delimeter* :");
		auditStr.append(delimeter);
	    auditStr.append("; ");
		auditStr.append("\r\n*qualifier* :");
		auditStr.append(qualifier);
	    auditStr.append("; ");
		auditStr.append("\r\n*deleteFirst* :");
		auditStr.append(deleteFirst);
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
		
		String keyClassName = "TaxonomyUpload";
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
		if (this.getTaxonomyColumnMapFilename() != null)
		{
			sb.append("<taxonomyColumnMapFilename>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTaxonomyColumnMapFilename().toString()));
			sb.append("</taxonomyColumnMapFilename>");		
		}
		if (this.getTaxonomyCode() != null)
		{
			sb.append("<taxonomyCode>");
			sb.append(this.getTaxonomyCode().toXMLString()); 
			sb.append("</taxonomyCode>");		
		}
		if (this.getTaxonomyFilename() != null)
		{
			sb.append("<taxonomyFilename>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTaxonomyFilename().toString()));
			sb.append("</taxonomyFilename>");		
		}
		if (this.getFileType() != null)
		{
			sb.append("<fileType>");
			sb.append(this.getFileType().toXMLString()); 
			sb.append("</fileType>");		
		}
		if (this.getTaxonomyElement() != null)
		{
			sb.append("<taxonomyElement>");
			sb.append(this.getTaxonomyElement().toXMLString()); 
			sb.append("</taxonomyElement>");		
		}
		if (this.getDelimeter() != null)
		{
			sb.append("<delimeter>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDelimeter().toString()));
			sb.append("</delimeter>");		
		}
		if (this.getQualifier() != null)
		{
			sb.append("<qualifier>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getQualifier().toString()));
			sb.append("</qualifier>");		
		}
		if (this.isDeleteFirst() != null)
		{
			sb.append("<deleteFirst>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isDeleteFirst().toString()));
			sb.append("</deleteFirst>");		
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
			TaxonomyUpload domainObject = getTaxonomyUploadfromXML(itemEl, factory, domMap);

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
			TaxonomyUpload domainObject = getTaxonomyUploadfromXML(itemEl, factory, domMap);

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
		
	public static TaxonomyUpload getTaxonomyUploadfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getTaxonomyUploadfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static TaxonomyUpload getTaxonomyUploadfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!TaxonomyUpload.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!TaxonomyUpload.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the TaxonomyUpload class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (TaxonomyUpload)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(TaxonomyUpload.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		TaxonomyUpload ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (TaxonomyUpload)factory.getImportedDomainObject(TaxonomyUpload.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new TaxonomyUpload();
		}
		String keyClassName = "TaxonomyUpload";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (TaxonomyUpload)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, TaxonomyUpload obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("taxonomyColumnMapFilename");
		if(fldEl != null)
		{	
    		obj.setTaxonomyColumnMapFilename(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("taxonomyCode");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTaxonomyCode(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("taxonomyFilename");
		if(fldEl != null)
		{	
    		obj.setTaxonomyFilename(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("fileType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setFileType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("taxonomyElement");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTaxonomyElement(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("delimeter");
		if(fldEl != null)
		{	
    		obj.setDelimeter(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("qualifier");
		if(fldEl != null)
		{	
    		obj.setQualifier(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("deleteFirst");
		if(fldEl != null)
		{	
    		obj.setDeleteFirst(new Boolean(fldEl.getTextTrim()));	
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
		public static final String TaxonomyColumnMapFilename = "taxonomyColumnMapFilename";
		public static final String TaxonomyCode = "taxonomyCode";
		public static final String TaxonomyFilename = "taxonomyFilename";
		public static final String FileType = "fileType";
		public static final String TaxonomyElement = "taxonomyElement";
		public static final String Delimeter = "delimeter";
		public static final String Qualifier = "qualifier";
		public static final String DeleteFirst = "deleteFirst";
	}
}

