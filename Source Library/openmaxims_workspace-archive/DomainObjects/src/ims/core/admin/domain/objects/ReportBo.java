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
 * @author Neil McAnaspie
 * Generated.
 */


public class ReportBo extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1004100009;
	private static final long serialVersionUID = 1004100009L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return false;
	}

	/** Report Name */
	private String reportName;
	/** Report Description */
	private String reportDescription;
	/** Is Active */
	private Boolean isActive;
	private String reportXml;
	/** 
	  * Collection of ims.core.admin.domain.objects.TemplateBo.
	  */
	private java.util.Set templates;
	/** 
	  * Collection of ims.core.admin.domain.objects.ReportSeedBo.
	  */
	private java.util.Set seeds;
	/** Will be a value generated from DevEnv Report Manager */
	private Integer imsId;
	/** Used to associate an exported XML file with a Report entity */
	private String exportFileName;
	/** Specifies if the query can be modified by the customer */
	private Boolean queryEditable;
	/** Specifies if the template can be modified by the customer */
	private Boolean templateEditable;
	/** Holds the datetime when a report gets deployed */
	private java.util.Date lastDeployment;
	/** Holds the datetime when a report gets updated */
	private java.util.Date lastUpdated;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ReportBo (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ReportBo ()
    {
    	super();
    }
    public ReportBo (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.admin.domain.objects.ReportBo.class;
	}


	public String getReportName() {
		return reportName;
	}
	public void setReportName(String reportName) {
		if ( null != reportName && reportName.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for reportName. Tried to set value: "+
				reportName);
		}
		this.reportName = reportName;
	}

	public String getReportDescription() {
		return reportDescription;
	}
	public void setReportDescription(String reportDescription) {
		if ( null != reportDescription && reportDescription.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for reportDescription. Tried to set value: "+
				reportDescription);
		}
		this.reportDescription = reportDescription;
	}

	public Boolean isIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public String getReportXml() {
		return reportXml;
	}
	public void setReportXml(String reportXml) {
		this.reportXml = reportXml;
	}

	public java.util.Set getTemplates() {
		if ( null == templates ) {
			templates = new java.util.HashSet();
		}
		return templates;
	}
	public void setTemplates(java.util.Set paramValue) {
		this.templates = paramValue;
	}

	public java.util.Set getSeeds() {
		if ( null == seeds ) {
			seeds = new java.util.HashSet();
		}
		return seeds;
	}
	public void setSeeds(java.util.Set paramValue) {
		this.seeds = paramValue;
	}

	public Integer getImsId() {
		return imsId;
	}
	public void setImsId(Integer imsId) {
		this.imsId = imsId;
	}

	public String getExportFileName() {
		return exportFileName;
	}
	public void setExportFileName(String exportFileName) {
		if ( null != exportFileName && exportFileName.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for exportFileName. Tried to set value: "+
				exportFileName);
		}
		this.exportFileName = exportFileName;
	}

	public Boolean isQueryEditable() {
		return queryEditable;
	}
	public void setQueryEditable(Boolean queryEditable) {
		this.queryEditable = queryEditable;
	}

	public Boolean isTemplateEditable() {
		return templateEditable;
	}
	public void setTemplateEditable(Boolean templateEditable) {
		this.templateEditable = templateEditable;
	}

	public java.util.Date getLastDeployment() {
		return lastDeployment;
	}
	public void setLastDeployment(java.util.Date lastDeployment) {
		this.lastDeployment = lastDeployment;
	}

	public java.util.Date getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(java.util.Date lastUpdated) {
		this.lastUpdated = lastUpdated;
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
	// method generated based on 'report_unq1' unique index.
	public static boolean recordExistForReportNameAndImsId(ims.domain.ILightweightDomainFactory factory,
		 String reportName
	,
	 Integer imsId
	)	
	{
		return recordExistForReportNameAndImsId(factory, reportName, imsId, null);
	}	

	// method generated based on 'report_unq1' unique index.
	public static boolean recordExistForReportNameAndImsId(ims.domain.ILightweightDomainFactory factory,
		 String reportName
	,
	 Integer imsId
	, Integer recordId)	
	{
		String[] names = new String[2];
		Object[] values = new Object[2];
		StringBuffer hql = new StringBuffer();
		
		hql.append("from ReportBo c where ");
		hql.append(" c.reportName = :reportName ");
		names[0] = "reportName";
		values[0] = reportName;		
		hql.append(" and "); 
		hql.append(" c.imsId = :imsId ");
		names[1] = "imsId";
		values[1] = imsId;		
		if(recordId != null)
		{
			hql.append(" and c.id <> " + recordId);
		}
		
		return factory.count(hql.toString(), names, values) > 0;				
	}	

	// method generated based on 'report_unq1' unique index.
	public static ReportBo getRecordByReportNameAndImsId(ims.domain.ILightweightDomainFactory factory,
	 String reportName
	,
	 Integer imsId
	)
	{
		String[] names = new String[2];
		Object[] values = new Object[2];
		StringBuffer hql = new StringBuffer();
		hql.append("from ReportBo c where ");
		hql.append(" c.reportName = :reportName ");
		names[0] = "reportName";
		values[0] = reportName;		
		hql.append(" and "); 
		hql.append(" c.imsId = :imsId ");
		names[1] = "imsId";
		values[1] = imsId;		
		java.util.List l = factory.find(hql.toString(), names, values);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. " + hql + " returned " + l.size() + " records. " );
		return (ReportBo)l.get(0);
	}

	public static ReportBo getReportBoFromreport_unq1(ims.domain.ILightweightDomainFactory factory,
	 String reportName
	,
	 Integer imsId
	)
	{
		String[] names = new String[2];
		Object[] values = new Object[2];
		StringBuffer hql = new StringBuffer();
		hql.append("from ReportBo c where ");
		hql.append(" c.reportName = :reportName ");
		names[0] = "reportName";
		values[0] = reportName;		
		hql.append(" and "); 
		hql.append(" c.imsId = :imsId ");
		names[1] = "imsId";
		values[1] = imsId;		
		java.util.List l = factory.find(hql.toString(), names, values);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. " + hql + " returned " + l.size() + " records. " );
		return (ReportBo)l.get(0);
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
		
		auditStr.append("\r\n*reportName* :");
		auditStr.append(reportName);
	    auditStr.append("; ");
		auditStr.append("\r\n*reportDescription* :");
		auditStr.append(reportDescription);
	    auditStr.append("; ");
		auditStr.append("\r\n*isActive* :");
		auditStr.append(isActive);
	    auditStr.append("; ");
		auditStr.append("\r\n*reportXml* :");
		auditStr.append(reportXml);
	    auditStr.append("; ");
		auditStr.append("\r\n*templates* :");
		if (templates != null)
		{
			java.util.Iterator it5 = templates.iterator();
			int i5=0;
			while (it5.hasNext())
			{
				if (i5 > 0)
					auditStr.append(",");
				ims.core.admin.domain.objects.TemplateBo obj = (ims.core.admin.domain.objects.TemplateBo)it5.next();
		if (obj != null)
		{
		   if (i5 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i5++;
		}
		if (i5 > 0)
			auditStr.append("] " + i5);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*seeds* :");
		if (seeds != null)
		{
			java.util.Iterator it6 = seeds.iterator();
			int i6=0;
			while (it6.hasNext())
			{
				if (i6 > 0)
					auditStr.append(",");
				ims.core.admin.domain.objects.ReportSeedBo obj = (ims.core.admin.domain.objects.ReportSeedBo)it6.next();
		if (obj != null)
		{
		   if (i6 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i6++;
		}
		if (i6 > 0)
			auditStr.append("] " + i6);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*imsId* :");
		auditStr.append(imsId);
	    auditStr.append("; ");
		auditStr.append("\r\n*exportFileName* :");
		auditStr.append(exportFileName);
	    auditStr.append("; ");
		auditStr.append("\r\n*queryEditable* :");
		auditStr.append(queryEditable);
	    auditStr.append("; ");
		auditStr.append("\r\n*templateEditable* :");
		auditStr.append(templateEditable);
	    auditStr.append("; ");
		auditStr.append("\r\n*lastDeployment* :");
		auditStr.append(lastDeployment);
	    auditStr.append("; ");
		auditStr.append("\r\n*lastUpdated* :");
		auditStr.append(lastUpdated);
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
		
		String keyClassName = "ReportBo";
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
		if (this.getReportName() != null)
		{
			sb.append("<reportName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReportName().toString()));
			sb.append("</reportName>");		
		}
		if (this.getReportDescription() != null)
		{
			sb.append("<reportDescription>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReportDescription().toString()));
			sb.append("</reportDescription>");		
		}
		if (this.isIsActive() != null)
		{
			sb.append("<isActive>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsActive().toString()));
			sb.append("</isActive>");		
		}
		if (this.getReportXml() != null)
		{
			sb.append("<reportXml>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReportXml().toString()));
			sb.append("</reportXml>");		
		}
		if (this.getTemplates() != null)
		{
			if (this.getTemplates().size() > 0 )
			{
			sb.append("<templates>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getTemplates(), domMap));
			sb.append("</templates>");		
			}
		}
		if (this.getSeeds() != null)
		{
			if (this.getSeeds().size() > 0 )
			{
			sb.append("<seeds>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getSeeds(), domMap));
			sb.append("</seeds>");		
			}
		}
		if (this.getImsId() != null)
		{
			sb.append("<imsId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getImsId().toString()));
			sb.append("</imsId>");		
		}
		if (this.getExportFileName() != null)
		{
			sb.append("<exportFileName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getExportFileName().toString()));
			sb.append("</exportFileName>");		
		}
		if (this.isQueryEditable() != null)
		{
			sb.append("<queryEditable>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isQueryEditable().toString()));
			sb.append("</queryEditable>");		
		}
		if (this.isTemplateEditable() != null)
		{
			sb.append("<templateEditable>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isTemplateEditable().toString()));
			sb.append("</templateEditable>");		
		}
		if (this.getLastDeployment() != null)
		{
			sb.append("<lastDeployment>");
			sb.append(new ims.framework.utils.DateTime(this.getLastDeployment()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</lastDeployment>");		
		}
		if (this.getLastUpdated() != null)
		{
			sb.append("<lastUpdated>");
			sb.append(new ims.framework.utils.DateTime(this.getLastUpdated()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</lastUpdated>");		
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
			ReportBo domainObject = getReportBofromXML(itemEl, factory, domMap);

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
			ReportBo domainObject = getReportBofromXML(itemEl, factory, domMap);

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
		
	public static ReportBo getReportBofromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getReportBofromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ReportBo getReportBofromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ReportBo.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ReportBo.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ReportBo class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ReportBo)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ReportBo.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ReportBo ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ReportBo)factory.getImportedDomainObject(ReportBo.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ReportBo();
		}
		String keyClassName = "ReportBo";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ReportBo)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ReportBo obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("reportName");
		if(fldEl != null)
		{	
    		obj.setReportName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("reportDescription");
		if(fldEl != null)
		{	
    		obj.setReportDescription(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isActive");
		if(fldEl != null)
		{	
    		obj.setIsActive(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("reportXml");
		if(fldEl != null)
		{	
    		obj.setReportXml(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("templates");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setTemplates(ims.core.admin.domain.objects.TemplateBo.fromSetXMLString(fldEl, factory, obj.getTemplates(), domMap));
		}
		fldEl = el.element("seeds");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setSeeds(ims.core.admin.domain.objects.ReportSeedBo.fromSetXMLString(fldEl, factory, obj.getSeeds(), domMap));
		}
		fldEl = el.element("imsId");
		if(fldEl != null)
		{	
    		obj.setImsId(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("exportFileName");
		if(fldEl != null)
		{	
    		obj.setExportFileName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("queryEditable");
		if(fldEl != null)
		{	
    		obj.setQueryEditable(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("templateEditable");
		if(fldEl != null)
		{	
    		obj.setTemplateEditable(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("lastDeployment");
		if(fldEl != null)
		{	
    		obj.setLastDeployment(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("lastUpdated");
		if(fldEl != null)
		{	
    		obj.setLastUpdated(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "templates"
		, "seeds"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String ReportName = "reportName";
		public static final String ReportDescription = "reportDescription";
		public static final String IsActive = "isActive";
		public static final String ReportXml = "reportXml";
		public static final String Templates = "templates";
		public static final String Seeds = "seeds";
		public static final String ImsId = "imsId";
		public static final String ExportFileName = "exportFileName";
		public static final String QueryEditable = "queryEditable";
		public static final String TemplateEditable = "templateEditable";
		public static final String LastDeployment = "lastDeployment";
		public static final String LastUpdated = "lastUpdated";
	}
}

