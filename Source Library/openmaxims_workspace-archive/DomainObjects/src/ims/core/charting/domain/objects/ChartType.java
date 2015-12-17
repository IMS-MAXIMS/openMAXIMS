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


public class ChartType extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1081100000;
	private static final long serialVersionUID = 1081100000L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Name */
	private String name;
	/** Description */
	private String description;
	/** MaxFactor */
	private Integer maxFactor;
	/** MinFactor */
	private Integer minFactor;
	/** Below Band Percent */
	private Integer belowBandPercent;
	/** Above Band Percent */
	private Integer aboveBandPercent;
	/** BackgroundColour */
	private ims.framework.utils.Color backgroundColour;
	/** ForegroundColour */
	private ims.framework.utils.Color foregroundColour;
	/** NormalBandColour */
	private ims.framework.utils.Color normalBandColour;
	/** isActive */
	private Boolean isActive;
	/** DatasetTypes
	  * Collection of ims.core.charting.domain.objects.ChartTypeDataset.
	  */
	private java.util.List datasetTypes;
    public ChartType (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ChartType ()
    {
    	super();
    }
    public ChartType (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.charting.domain.objects.ChartType.class;
	}


	public String getName() {
		return name;
	}
	public static ChartType getChartTypeFromName(ims.domain.ILightweightDomainFactory factory, String val)
	{
		String hql = "from ChartType c where c.name = :name";		
		java.util.List l = factory.find(hql, new String[]{"name"}, new Object[]{val});
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. ChartType.name = " + val + " returned " + l.size() + " records. " );
		return (ChartType)l.get(0);
	}
	public void setName(String name) {
		if ( null != name && name.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for name. Tried to set value: "+
				name);
		}
		this.name = name;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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

	public Integer getBelowBandPercent() {
		return belowBandPercent;
	}
	public void setBelowBandPercent(Integer belowBandPercent) {
		this.belowBandPercent = belowBandPercent;
	}

	public Integer getAboveBandPercent() {
		return aboveBandPercent;
	}
	public void setAboveBandPercent(Integer aboveBandPercent) {
		this.aboveBandPercent = aboveBandPercent;
	}

	public ims.framework.utils.Color getBackgroundColour() {
		return backgroundColour;
	}
	public void setBackgroundColour(ims.framework.utils.Color backgroundColour) {
		this.backgroundColour = backgroundColour;
	}

	public ims.framework.utils.Color getForegroundColour() {
		return foregroundColour;
	}
	public void setForegroundColour(ims.framework.utils.Color foregroundColour) {
		this.foregroundColour = foregroundColour;
	}

	public ims.framework.utils.Color getNormalBandColour() {
		return normalBandColour;
	}
	public void setNormalBandColour(ims.framework.utils.Color normalBandColour) {
		this.normalBandColour = normalBandColour;
	}

	public Boolean isIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public java.util.List getDatasetTypes() {
		if ( null == datasetTypes ) {
			datasetTypes = new java.util.ArrayList();
		}
		return datasetTypes;
	}
	public void setDatasetTypes(java.util.List paramValue) {
		this.datasetTypes = paramValue;
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
		auditStr.append("\r\n*description* :");
		auditStr.append(description);
	    auditStr.append("; ");
		auditStr.append("\r\n*maxFactor* :");
		auditStr.append(maxFactor);
	    auditStr.append("; ");
		auditStr.append("\r\n*minFactor* :");
		auditStr.append(minFactor);
	    auditStr.append("; ");
		auditStr.append("\r\n*belowBandPercent* :");
		auditStr.append(belowBandPercent);
	    auditStr.append("; ");
		auditStr.append("\r\n*aboveBandPercent* :");
		auditStr.append(aboveBandPercent);
	    auditStr.append("; ");
		auditStr.append("\r\n*backgroundColour* :");
		auditStr.append(backgroundColour);
	    auditStr.append("; ");
		auditStr.append("\r\n*foregroundColour* :");
		auditStr.append(foregroundColour);
	    auditStr.append("; ");
		auditStr.append("\r\n*normalBandColour* :");
		auditStr.append(normalBandColour);
	    auditStr.append("; ");
		auditStr.append("\r\n*isActive* :");
		auditStr.append(isActive);
	    auditStr.append("; ");
		auditStr.append("\r\n*datasetTypes* :");
		if (datasetTypes != null)
		{
		int i11=0;
		for (i11=0; i11<datasetTypes.size(); i11++)
		{
			if (i11 > 0)
				auditStr.append(",");
			ims.core.charting.domain.objects.ChartTypeDataset obj = (ims.core.charting.domain.objects.ChartTypeDataset)datasetTypes.get(i11);
		    if (obj != null)
			{
				if (i11 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i11 > 0)
			auditStr.append("] " + i11);
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
		
		String keyClassName = "ChartType";
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
		if (this.getDescription() != null)
		{
			sb.append("<description>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDescription().toString()));
			sb.append("</description>");		
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
		if (this.getBelowBandPercent() != null)
		{
			sb.append("<belowBandPercent>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getBelowBandPercent().toString()));
			sb.append("</belowBandPercent>");		
		}
		if (this.getAboveBandPercent() != null)
		{
			sb.append("<aboveBandPercent>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAboveBandPercent().toString()));
			sb.append("</aboveBandPercent>");		
		}
		if (this.getBackgroundColour() != null)
		{
			sb.append("<backgroundColour>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getBackgroundColour().toString()));
			sb.append("</backgroundColour>");		
		}
		if (this.getForegroundColour() != null)
		{
			sb.append("<foregroundColour>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getForegroundColour().toString()));
			sb.append("</foregroundColour>");		
		}
		if (this.getNormalBandColour() != null)
		{
			sb.append("<normalBandColour>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNormalBandColour().toString()));
			sb.append("</normalBandColour>");		
		}
		if (this.isIsActive() != null)
		{
			sb.append("<isActive>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsActive().toString()));
			sb.append("</isActive>");		
		}
		if (this.getDatasetTypes() != null)
		{
			if (this.getDatasetTypes().size() > 0 )
			{
			sb.append("<datasetTypes>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getDatasetTypes(), domMap));
			sb.append("</datasetTypes>");		
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
			ChartType domainObject = getChartTypefromXML(itemEl, factory, domMap);

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
			ChartType domainObject = getChartTypefromXML(itemEl, factory, domMap);

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
		
	public static ChartType getChartTypefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getChartTypefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ChartType getChartTypefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ChartType.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ChartType.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ChartType class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ChartType)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ChartType.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ChartType ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ChartType)factory.getImportedDomainObject(ChartType.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ChartType();
		}
		String keyClassName = "ChartType";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ChartType)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ChartType obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("name");
		if(fldEl != null)
		{	
    		obj.setName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("description");
		if(fldEl != null)
		{	
    		obj.setDescription(new String(fldEl.getTextTrim()));	
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
		fldEl = el.element("belowBandPercent");
		if(fldEl != null)
		{	
    		obj.setBelowBandPercent(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("aboveBandPercent");
		if(fldEl != null)
		{	
    		obj.setAboveBandPercent(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("backgroundColour");
		if(fldEl != null)
		{	
    		obj.setBackgroundColour(ims.framework.utils.Color.getColor(fldEl.getTextTrim()));		
		}
		fldEl = el.element("foregroundColour");
		if(fldEl != null)
		{	
    		obj.setForegroundColour(ims.framework.utils.Color.getColor(fldEl.getTextTrim()));		
		}
		fldEl = el.element("normalBandColour");
		if(fldEl != null)
		{	
    		obj.setNormalBandColour(ims.framework.utils.Color.getColor(fldEl.getTextTrim()));		
		}
		fldEl = el.element("isActive");
		if(fldEl != null)
		{	
    		obj.setIsActive(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("datasetTypes");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setDatasetTypes(ims.core.charting.domain.objects.ChartTypeDataset.fromListXMLString(fldEl, factory, obj.getDatasetTypes(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "datasetTypes"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Name = "name";
		public static final String Description = "description";
		public static final String MaxFactor = "maxFactor";
		public static final String MinFactor = "minFactor";
		public static final String BelowBandPercent = "belowBandPercent";
		public static final String AboveBandPercent = "aboveBandPercent";
		public static final String BackgroundColour = "backgroundColour";
		public static final String ForegroundColour = "foregroundColour";
		public static final String NormalBandColour = "normalBandColour";
		public static final String IsActive = "isActive";
		public static final String DatasetTypes = "datasetTypes";
	}
}

