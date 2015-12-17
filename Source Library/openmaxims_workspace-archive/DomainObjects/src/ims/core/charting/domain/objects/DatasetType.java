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
package ims.core.charting.domain.objects;

/**
 * 
 * @author John MacEnri
 * Generated.
 */


public class DatasetType extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1081100001;
	private static final long serialVersionUID = 1081100001L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Name */
	private String name;
	/** Category */
	private ims.domain.lookups.LookupInstance category;
	/** Unit of Measure */
	private ims.domain.lookups.LookupInstance unitOfMeasure;
	/** MaxFactor */
	private Integer maxFactor;
	/** MinFactor */
	private Integer minFactor;
	/** NormalBandMaxValueMale */
	private java.lang.Float normalBandMaxValueMale;
	/** NormalBandMinValueMale */
	private java.lang.Float normalBandMinValueMale;
	/** NormalBandMaxValueFemale */
	private java.lang.Float normalBandMaxValueFemale;
	/** NormalBandMinValueFemale */
	private java.lang.Float normalBandMinValueFemale;
	/** DefaultLineType */
	private ims.domain.lookups.LookupInstance defaultLineType;
	/** Default Line Colour Point Icon */
	private ims.domain.lookups.LookupInstance defLineColPtIcon;
	/** isActive */
	private Boolean isActive;
    public DatasetType (Integer id, int ver)
    {
    	super(id, ver);
    }
    public DatasetType ()
    {
    	super();
    }
    public DatasetType (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.charting.domain.objects.DatasetType.class;
	}


	public String getName() {
		return name;
	}
	public static DatasetType getDatasetTypeFromName(ims.domain.ILightweightDomainFactory factory, String val)
	{
		String hql = "from DatasetType c where c.name = :name";		
		java.util.List l = factory.find(hql, new String[]{"name"}, new Object[]{val});
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. DatasetType.name = " + val + " returned " + l.size() + " records. " );
		return (DatasetType)l.get(0);
	}
	public void setName(String name) {
		if ( null != name && name.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for name. Tried to set value: "+
				name);
		}
		this.name = name;
	}

	public ims.domain.lookups.LookupInstance getCategory() {
		return category;
	}
	public void setCategory(ims.domain.lookups.LookupInstance category) {
		this.category = category;
	}

	public ims.domain.lookups.LookupInstance getUnitOfMeasure() {
		return unitOfMeasure;
	}
	public void setUnitOfMeasure(ims.domain.lookups.LookupInstance unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
	}

	public Integer getMaxFactor() {
		return maxFactor;
	}
	public void setMaxFactor(Integer maxFactor) {
		this.maxFactor = maxFactor;
	}

	public Integer getMinFactor() {
		return minFactor;
	}
	public void setMinFactor(Integer minFactor) {
		this.minFactor = minFactor;
	}

	public java.lang.Float getNormalBandMaxValueMale() {
		return normalBandMaxValueMale;
	}
	public void setNormalBandMaxValueMale(java.lang.Float normalBandMaxValueMale) {
		this.normalBandMaxValueMale = normalBandMaxValueMale;
	}

	public java.lang.Float getNormalBandMinValueMale() {
		return normalBandMinValueMale;
	}
	public void setNormalBandMinValueMale(java.lang.Float normalBandMinValueMale) {
		this.normalBandMinValueMale = normalBandMinValueMale;
	}

	public java.lang.Float getNormalBandMaxValueFemale() {
		return normalBandMaxValueFemale;
	}
	public void setNormalBandMaxValueFemale(java.lang.Float normalBandMaxValueFemale) {
		this.normalBandMaxValueFemale = normalBandMaxValueFemale;
	}

	public java.lang.Float getNormalBandMinValueFemale() {
		return normalBandMinValueFemale;
	}
	public void setNormalBandMinValueFemale(java.lang.Float normalBandMinValueFemale) {
		this.normalBandMinValueFemale = normalBandMinValueFemale;
	}

	public ims.domain.lookups.LookupInstance getDefaultLineType() {
		return defaultLineType;
	}
	public void setDefaultLineType(ims.domain.lookups.LookupInstance defaultLineType) {
		this.defaultLineType = defaultLineType;
	}

	public ims.domain.lookups.LookupInstance getDefLineColPtIcon() {
		return defLineColPtIcon;
	}
	public void setDefLineColPtIcon(ims.domain.lookups.LookupInstance defLineColPtIcon) {
		this.defLineColPtIcon = defLineColPtIcon;
	}

	public Boolean isIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
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
		
		auditStr.append("\r\n*name* :");
		auditStr.append(name);
	    auditStr.append("; ");
		auditStr.append("\r\n*category* :");
		if (category != null)
			auditStr.append(category.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*unitOfMeasure* :");
		if (unitOfMeasure != null)
			auditStr.append(unitOfMeasure.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*maxFactor* :");
		auditStr.append(maxFactor);
	    auditStr.append("; ");
		auditStr.append("\r\n*minFactor* :");
		auditStr.append(minFactor);
	    auditStr.append("; ");
		auditStr.append("\r\n*normalBandMaxValueMale* :");
		auditStr.append(normalBandMaxValueMale);
	    auditStr.append("; ");
		auditStr.append("\r\n*normalBandMinValueMale* :");
		auditStr.append(normalBandMinValueMale);
	    auditStr.append("; ");
		auditStr.append("\r\n*normalBandMaxValueFemale* :");
		auditStr.append(normalBandMaxValueFemale);
	    auditStr.append("; ");
		auditStr.append("\r\n*normalBandMinValueFemale* :");
		auditStr.append(normalBandMinValueFemale);
	    auditStr.append("; ");
		auditStr.append("\r\n*defaultLineType* :");
		if (defaultLineType != null)
			auditStr.append(defaultLineType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*defLineColPtIcon* :");
		if (defLineColPtIcon != null)
			auditStr.append(defLineColPtIcon.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*isActive* :");
		auditStr.append(isActive);
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
		
		String keyClassName = "DatasetType";
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
		if (this.getCategory() != null)
		{
			sb.append("<category>");
			sb.append(this.getCategory().toXMLString()); 
			sb.append("</category>");		
		}
		if (this.getUnitOfMeasure() != null)
		{
			sb.append("<unitOfMeasure>");
			sb.append(this.getUnitOfMeasure().toXMLString()); 
			sb.append("</unitOfMeasure>");		
		}
		if (this.getMaxFactor() != null)
		{
			sb.append("<maxFactor>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMaxFactor().toString()));
			sb.append("</maxFactor>");		
		}
		if (this.getMinFactor() != null)
		{
			sb.append("<minFactor>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMinFactor().toString()));
			sb.append("</minFactor>");		
		}
		if (this.getNormalBandMaxValueMale() != null)
		{
			sb.append("<normalBandMaxValueMale>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNormalBandMaxValueMale().toString()));
			sb.append("</normalBandMaxValueMale>");		
		}
		if (this.getNormalBandMinValueMale() != null)
		{
			sb.append("<normalBandMinValueMale>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNormalBandMinValueMale().toString()));
			sb.append("</normalBandMinValueMale>");		
		}
		if (this.getNormalBandMaxValueFemale() != null)
		{
			sb.append("<normalBandMaxValueFemale>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNormalBandMaxValueFemale().toString()));
			sb.append("</normalBandMaxValueFemale>");		
		}
		if (this.getNormalBandMinValueFemale() != null)
		{
			sb.append("<normalBandMinValueFemale>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNormalBandMinValueFemale().toString()));
			sb.append("</normalBandMinValueFemale>");		
		}
		if (this.getDefaultLineType() != null)
		{
			sb.append("<defaultLineType>");
			sb.append(this.getDefaultLineType().toXMLString()); 
			sb.append("</defaultLineType>");		
		}
		if (this.getDefLineColPtIcon() != null)
		{
			sb.append("<defLineColPtIcon>");
			sb.append(this.getDefLineColPtIcon().toXMLString()); 
			sb.append("</defLineColPtIcon>");		
		}
		if (this.isIsActive() != null)
		{
			sb.append("<isActive>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsActive().toString()));
			sb.append("</isActive>");		
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
			DatasetType domainObject = getDatasetTypefromXML(itemEl, factory, domMap);

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
			DatasetType domainObject = getDatasetTypefromXML(itemEl, factory, domMap);

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
		
	public static DatasetType getDatasetTypefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getDatasetTypefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static DatasetType getDatasetTypefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!DatasetType.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!DatasetType.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the DatasetType class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (DatasetType)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(DatasetType.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		DatasetType ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (DatasetType)factory.getImportedDomainObject(DatasetType.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new DatasetType();
		}
		String keyClassName = "DatasetType";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (DatasetType)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, DatasetType obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("name");
		if(fldEl != null)
		{	
    		obj.setName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("category");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCategory(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("unitOfMeasure");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setUnitOfMeasure(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("maxFactor");
		if(fldEl != null)
		{	
    		obj.setMaxFactor(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("minFactor");
		if(fldEl != null)
		{	
    		obj.setMinFactor(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("normalBandMaxValueMale");
		if(fldEl != null)
		{	
    		obj.setNormalBandMaxValueMale(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("normalBandMinValueMale");
		if(fldEl != null)
		{	
    		obj.setNormalBandMinValueMale(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("normalBandMaxValueFemale");
		if(fldEl != null)
		{	
    		obj.setNormalBandMaxValueFemale(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("normalBandMinValueFemale");
		if(fldEl != null)
		{	
    		obj.setNormalBandMinValueFemale(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("defaultLineType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDefaultLineType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("defLineColPtIcon");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDefLineColPtIcon(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("isActive");
		if(fldEl != null)
		{	
    		obj.setIsActive(new Boolean(fldEl.getTextTrim()));	
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
		public static final String Name = "name";
		public static final String Category = "category";
		public static final String UnitOfMeasure = "unitOfMeasure";
		public static final String MaxFactor = "maxFactor";
		public static final String MinFactor = "minFactor";
		public static final String NormalBandMaxValueMale = "normalBandMaxValueMale";
		public static final String NormalBandMinValueMale = "normalBandMinValueMale";
		public static final String NormalBandMaxValueFemale = "normalBandMaxValueFemale";
		public static final String NormalBandMinValueFemale = "normalBandMinValueFemale";
		public static final String DefaultLineType = "defaultLineType";
		public static final String DefLineColPtIcon = "defLineColPtIcon";
		public static final String IsActive = "isActive";
	}
}

