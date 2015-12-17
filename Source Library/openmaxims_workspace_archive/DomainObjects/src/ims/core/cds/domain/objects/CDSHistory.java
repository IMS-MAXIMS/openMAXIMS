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
package ims.core.cds.domain.objects;

/**
 * 
 * @author Vasile Purdila
 * Generated.
 */


public class CDSHistory extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1104100006;
	private static final long serialVersionUID = 1104100006L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private java.util.Date jobStartTime;
	private java.util.Date jobEndTime;
	private Boolean jobSuccessful;
	private String fileUrl;
	private String logUrl;
	private String errorMessage;
	private ims.domain.lookups.LookupInstance reportType;
	private String location;
	private java.util.Date startDate;
	private java.util.Date endDate;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public CDSHistory (Integer id, int ver)
    {
    	super(id, ver);
    }
    public CDSHistory ()
    {
    	super();
    }
    public CDSHistory (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.cds.domain.objects.CDSHistory.class;
	}


	public java.util.Date getJobStartTime() {
		return jobStartTime;
	}
	public void setJobStartTime(java.util.Date jobStartTime) {
		this.jobStartTime = jobStartTime;
	}

	public java.util.Date getJobEndTime() {
		return jobEndTime;
	}
	public void setJobEndTime(java.util.Date jobEndTime) {
		this.jobEndTime = jobEndTime;
	}

	public Boolean isJobSuccessful() {
		return jobSuccessful;
	}
	public void setJobSuccessful(Boolean jobSuccessful) {
		this.jobSuccessful = jobSuccessful;
	}

	public String getFileUrl() {
		return fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		if ( null != fileUrl && fileUrl.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for fileUrl. Tried to set value: "+
				fileUrl);
		}
		this.fileUrl = fileUrl;
	}

	public String getLogUrl() {
		return logUrl;
	}
	public void setLogUrl(String logUrl) {
		if ( null != logUrl && logUrl.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for logUrl. Tried to set value: "+
				logUrl);
		}
		this.logUrl = logUrl;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		if ( null != errorMessage && errorMessage.length() > 2000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for errorMessage. Tried to set value: "+
				errorMessage);
		}
		this.errorMessage = errorMessage;
	}

	public ims.domain.lookups.LookupInstance getReportType() {
		return reportType;
	}
	public void setReportType(ims.domain.lookups.LookupInstance reportType) {
		this.reportType = reportType;
	}

	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		if ( null != location && location.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for location. Tried to set value: "+
				location);
		}
		this.location = location;
	}

	public java.util.Date getStartDate() {
		return startDate;
	}
	public void setStartDate(java.util.Date startDate) {
		this.startDate = startDate;
	}

	public java.util.Date getEndDate() {
		return endDate;
	}
	public void setEndDate(java.util.Date endDate) {
		this.endDate = endDate;
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
		
		auditStr.append("\r\n*jobStartTime* :");
		auditStr.append(jobStartTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*jobEndTime* :");
		auditStr.append(jobEndTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*jobSuccessful* :");
		auditStr.append(jobSuccessful);
	    auditStr.append("; ");
		auditStr.append("\r\n*fileUrl* :");
		auditStr.append(fileUrl);
	    auditStr.append("; ");
		auditStr.append("\r\n*logUrl* :");
		auditStr.append(logUrl);
	    auditStr.append("; ");
		auditStr.append("\r\n*errorMessage* :");
		auditStr.append(errorMessage);
	    auditStr.append("; ");
		auditStr.append("\r\n*reportType* :");
		if (reportType != null)
			auditStr.append(reportType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*location* :");
		auditStr.append(location);
	    auditStr.append("; ");
		auditStr.append("\r\n*startDate* :");
		auditStr.append(startDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*endDate* :");
		auditStr.append(endDate);
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
		
		String keyClassName = "CDSHistory";
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
		if (this.getJobStartTime() != null)
		{
			sb.append("<jobStartTime>");
			sb.append(new ims.framework.utils.DateTime(this.getJobStartTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</jobStartTime>");		
		}
		if (this.getJobEndTime() != null)
		{
			sb.append("<jobEndTime>");
			sb.append(new ims.framework.utils.DateTime(this.getJobEndTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</jobEndTime>");		
		}
		if (this.isJobSuccessful() != null)
		{
			sb.append("<jobSuccessful>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isJobSuccessful().toString()));
			sb.append("</jobSuccessful>");		
		}
		if (this.getFileUrl() != null)
		{
			sb.append("<fileUrl>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getFileUrl().toString()));
			sb.append("</fileUrl>");		
		}
		if (this.getLogUrl() != null)
		{
			sb.append("<logUrl>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLogUrl().toString()));
			sb.append("</logUrl>");		
		}
		if (this.getErrorMessage() != null)
		{
			sb.append("<errorMessage>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getErrorMessage().toString()));
			sb.append("</errorMessage>");		
		}
		if (this.getReportType() != null)
		{
			sb.append("<reportType>");
			sb.append(this.getReportType().toXMLString()); 
			sb.append("</reportType>");		
		}
		if (this.getLocation() != null)
		{
			sb.append("<location>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLocation().toString()));
			sb.append("</location>");		
		}
		if (this.getStartDate() != null)
		{
			sb.append("<startDate>");
			sb.append(new ims.framework.utils.DateTime(this.getStartDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</startDate>");		
		}
		if (this.getEndDate() != null)
		{
			sb.append("<endDate>");
			sb.append(new ims.framework.utils.DateTime(this.getEndDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</endDate>");		
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
			CDSHistory domainObject = getCDSHistoryfromXML(itemEl, factory, domMap);

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
			CDSHistory domainObject = getCDSHistoryfromXML(itemEl, factory, domMap);

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
		
	public static CDSHistory getCDSHistoryfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getCDSHistoryfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static CDSHistory getCDSHistoryfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!CDSHistory.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!CDSHistory.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the CDSHistory class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (CDSHistory)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(CDSHistory.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		CDSHistory ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (CDSHistory)factory.getImportedDomainObject(CDSHistory.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new CDSHistory();
		}
		String keyClassName = "CDSHistory";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (CDSHistory)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, CDSHistory obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("jobStartTime");
		if(fldEl != null)
		{	
    		obj.setJobStartTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("jobEndTime");
		if(fldEl != null)
		{	
    		obj.setJobEndTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("jobSuccessful");
		if(fldEl != null)
		{	
    		obj.setJobSuccessful(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("fileUrl");
		if(fldEl != null)
		{	
    		obj.setFileUrl(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("logUrl");
		if(fldEl != null)
		{	
    		obj.setLogUrl(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("errorMessage");
		if(fldEl != null)
		{	
    		obj.setErrorMessage(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("reportType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReportType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("location");
		if(fldEl != null)
		{	
    		obj.setLocation(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("startDate");
		if(fldEl != null)
		{	
    		obj.setStartDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("endDate");
		if(fldEl != null)
		{	
    		obj.setEndDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
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
		public static final String JobStartTime = "jobStartTime";
		public static final String JobEndTime = "jobEndTime";
		public static final String JobSuccessful = "jobSuccessful";
		public static final String FileUrl = "fileUrl";
		public static final String LogUrl = "logUrl";
		public static final String ErrorMessage = "errorMessage";
		public static final String ReportType = "reportType";
		public static final String Location = "location";
		public static final String StartDate = "startDate";
		public static final String EndDate = "endDate";
	}
}

