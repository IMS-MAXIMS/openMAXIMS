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
 * @author Marius Mihalec
 * Generated.
 */


public class ConfiguredJobExecutionSummary extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1028100060;
	private static final long serialVersionUID = 1028100060L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}
	@Override
	public boolean canNeverBeAudited()
	{
		return true;
	}
	@Override
	public boolean shouldFireRules()
	{
		return false;
	}

	private ims.core.configuration.domain.objects.ConfiguredJob configuredJob;
	private Integer status;
	private String message;
	private java.util.Date endDateTime;
	private java.util.Date startDateTime;
	/** 
	  * Collection of ims.core.configuration.domain.objects.ConfiguredJobExecutionTrace.
	  */
	private java.util.List traces;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ConfiguredJobExecutionSummary (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ConfiguredJobExecutionSummary ()
    {
    	super();
    }
    public ConfiguredJobExecutionSummary (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.configuration.domain.objects.ConfiguredJobExecutionSummary.class;
	}


	public ims.core.configuration.domain.objects.ConfiguredJob getConfiguredJob() {
		return configuredJob;
	}
	public void setConfiguredJob(ims.core.configuration.domain.objects.ConfiguredJob configuredJob) {
		this.configuredJob = configuredJob;
	}

	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public java.util.Date getEndDateTime() {
		return endDateTime;
	}
	public void setEndDateTime(java.util.Date endDateTime) {
		this.endDateTime = endDateTime;
	}

	public java.util.Date getStartDateTime() {
		return startDateTime;
	}
	public void setStartDateTime(java.util.Date startDateTime) {
		this.startDateTime = startDateTime;
	}

	public java.util.List getTraces() {
		if ( null == traces ) {
			traces = new java.util.ArrayList();
		}
		return traces;
	}
	public void setTraces(java.util.List paramValue) {
		this.traces = paramValue;
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
		
		auditStr.append("\r\n*configuredJob* :");
		if (configuredJob != null)
		{
			auditStr.append(toShortClassName(configuredJob));
				
		    auditStr.append(configuredJob.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*status* :");
		auditStr.append(status);
	    auditStr.append("; ");
		auditStr.append("\r\n*message* :");
		auditStr.append(message);
	    auditStr.append("; ");
		auditStr.append("\r\n*endDateTime* :");
		auditStr.append(endDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*startDateTime* :");
		auditStr.append(startDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*traces* :");
		if (traces != null)
		{
		int i6=0;
		for (i6=0; i6<traces.size(); i6++)
		{
			if (i6 > 0)
				auditStr.append(",");
			ims.core.configuration.domain.objects.ConfiguredJobExecutionTrace obj = (ims.core.configuration.domain.objects.ConfiguredJobExecutionTrace)traces.get(i6);
		    if (obj != null)
			{
				if (i6 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i6 > 0)
			auditStr.append("] " + i6);
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
		
		String keyClassName = "ConfiguredJobExecutionSummary";
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
		if (this.getConfiguredJob() != null)
		{
			sb.append("<configuredJob>");
			sb.append(this.getConfiguredJob().toXMLString(domMap)); 	
			sb.append("</configuredJob>");		
		}
		if (this.getStatus() != null)
		{
			sb.append("<status>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getStatus().toString()));
			sb.append("</status>");		
		}
		if (this.getMessage() != null)
		{
			sb.append("<message>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMessage().toString()));
			sb.append("</message>");		
		}
		if (this.getEndDateTime() != null)
		{
			sb.append("<endDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getEndDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</endDateTime>");		
		}
		if (this.getStartDateTime() != null)
		{
			sb.append("<startDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getStartDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</startDateTime>");		
		}
		if (this.getTraces() != null)
		{
			if (this.getTraces().size() > 0 )
			{
			sb.append("<traces>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getTraces(), domMap));
			sb.append("</traces>");		
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
			ConfiguredJobExecutionSummary domainObject = getConfiguredJobExecutionSummaryfromXML(itemEl, factory, domMap);

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
			ConfiguredJobExecutionSummary domainObject = getConfiguredJobExecutionSummaryfromXML(itemEl, factory, domMap);

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
		
	public static ConfiguredJobExecutionSummary getConfiguredJobExecutionSummaryfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getConfiguredJobExecutionSummaryfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ConfiguredJobExecutionSummary getConfiguredJobExecutionSummaryfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ConfiguredJobExecutionSummary.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ConfiguredJobExecutionSummary.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ConfiguredJobExecutionSummary class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ConfiguredJobExecutionSummary)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ConfiguredJobExecutionSummary.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ConfiguredJobExecutionSummary ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ConfiguredJobExecutionSummary)factory.getImportedDomainObject(ConfiguredJobExecutionSummary.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ConfiguredJobExecutionSummary();
		}
		String keyClassName = "ConfiguredJobExecutionSummary";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ConfiguredJobExecutionSummary)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ConfiguredJobExecutionSummary obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("configuredJob");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setConfiguredJob(ims.core.configuration.domain.objects.ConfiguredJob.getConfiguredJobfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("status");
		if(fldEl != null)
		{	
    		obj.setStatus(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("message");
		if(fldEl != null)
		{	
    		obj.setMessage(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("endDateTime");
		if(fldEl != null)
		{	
    		obj.setEndDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("startDateTime");
		if(fldEl != null)
		{	
    		obj.setStartDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("traces");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setTraces(ims.core.configuration.domain.objects.ConfiguredJobExecutionTrace.fromListXMLString(fldEl, factory, obj.getTraces(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "traces"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String ConfiguredJob = "configuredJob";
		public static final String Status = "status";
		public static final String Message = "message";
		public static final String EndDateTime = "endDateTime";
		public static final String StartDateTime = "startDateTime";
		public static final String Traces = "traces";
	}
}

