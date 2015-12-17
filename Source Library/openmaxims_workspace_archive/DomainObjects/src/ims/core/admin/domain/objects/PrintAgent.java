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


public class PrintAgent extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1004100014;
	private static final long serialVersionUID = 1004100014L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private String queryServerUrl;
	private String reportServerUrl;
	/** 
	  * Collection of ims.core.admin.domain.objects.TemplatePrinter.
	  */
	private java.util.Set templatePrinters;
	/** Description */
	private String description;
	/** Trigger */
	private String trigger;
	/** Last Successful Run Date Time */
	private java.util.Date lastSuccessfulRunDateTime;
	/** LastRunDateTime */
	private java.util.Date lastRunDateTime;
	/** JobType */
	private ims.domain.lookups.LookupInstance jobType;
	/** isActive */
	private Boolean isActive;
	/** DNA Appts In the Last X Hrs */
	private Integer dNAApptsInLastXhrs;
	/** No Of Records Updated */
	private Integer noOfRecordsUpdated;
	/** GHG specific. LocationToPrintFor */
	private ims.core.resource.place.domain.objects.LocSite locationToPrintFor;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PrintAgent (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PrintAgent ()
    {
    	super();
    }
    public PrintAgent (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.admin.domain.objects.PrintAgent.class;
	}


	public String getQueryServerUrl() {
		return queryServerUrl;
	}
	public void setQueryServerUrl(String queryServerUrl) {
		if ( null != queryServerUrl && queryServerUrl.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for queryServerUrl. Tried to set value: "+
				queryServerUrl);
		}
		this.queryServerUrl = queryServerUrl;
	}

	public String getReportServerUrl() {
		return reportServerUrl;
	}
	public void setReportServerUrl(String reportServerUrl) {
		if ( null != reportServerUrl && reportServerUrl.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for reportServerUrl. Tried to set value: "+
				reportServerUrl);
		}
		this.reportServerUrl = reportServerUrl;
	}

	public java.util.Set getTemplatePrinters() {
		if ( null == templatePrinters ) {
			templatePrinters = new java.util.HashSet();
		}
		return templatePrinters;
	}
	public void setTemplatePrinters(java.util.Set paramValue) {
		this.templatePrinters = paramValue;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		if ( null != description && description.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for description. Tried to set value: "+
				description);
		}
		this.description = description;
	}

	public String getTrigger() {
		return trigger;
	}
	public void setTrigger(String trigger) {
		if ( null != trigger && trigger.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for trigger. Tried to set value: "+
				trigger);
		}
		this.trigger = trigger;
	}

	public java.util.Date getLastSuccessfulRunDateTime() {
		return lastSuccessfulRunDateTime;
	}
	public void setLastSuccessfulRunDateTime(java.util.Date lastSuccessfulRunDateTime) {
		this.lastSuccessfulRunDateTime = lastSuccessfulRunDateTime;
	}

	public java.util.Date getLastRunDateTime() {
		return lastRunDateTime;
	}
	public void setLastRunDateTime(java.util.Date lastRunDateTime) {
		this.lastRunDateTime = lastRunDateTime;
	}

	public ims.domain.lookups.LookupInstance getJobType() {
		return jobType;
	}
	public void setJobType(ims.domain.lookups.LookupInstance jobType) {
		this.jobType = jobType;
	}

	public Boolean isIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Integer getDNAApptsInLastXhrs() {
		return dNAApptsInLastXhrs;
	}
	public void setDNAApptsInLastXhrs(Integer dNAApptsInLastXhrs) {
		this.dNAApptsInLastXhrs = dNAApptsInLastXhrs;
	}

	public Integer getNoOfRecordsUpdated() {
		return noOfRecordsUpdated;
	}
	public void setNoOfRecordsUpdated(Integer noOfRecordsUpdated) {
		this.noOfRecordsUpdated = noOfRecordsUpdated;
	}

	public ims.core.resource.place.domain.objects.LocSite getLocationToPrintFor() {
		return locationToPrintFor;
	}
	public void setLocationToPrintFor(ims.core.resource.place.domain.objects.LocSite locationToPrintFor) {
		this.locationToPrintFor = locationToPrintFor;
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
		
		auditStr.append("\r\n*queryServerUrl* :");
		auditStr.append(queryServerUrl);
	    auditStr.append("; ");
		auditStr.append("\r\n*reportServerUrl* :");
		auditStr.append(reportServerUrl);
	    auditStr.append("; ");
		auditStr.append("\r\n*templatePrinters* :");
		if (templatePrinters != null)
		{
			java.util.Iterator it3 = templatePrinters.iterator();
			int i3=0;
			while (it3.hasNext())
			{
				if (i3 > 0)
					auditStr.append(",");
				ims.core.admin.domain.objects.TemplatePrinter obj = (ims.core.admin.domain.objects.TemplatePrinter)it3.next();
		if (obj != null)
		{
		   if (i3 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i3++;
		}
		if (i3 > 0)
			auditStr.append("] " + i3);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*description* :");
		auditStr.append(description);
	    auditStr.append("; ");
		auditStr.append("\r\n*trigger* :");
		auditStr.append(trigger);
	    auditStr.append("; ");
		auditStr.append("\r\n*lastSuccessfulRunDateTime* :");
		auditStr.append(lastSuccessfulRunDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*lastRunDateTime* :");
		auditStr.append(lastRunDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*jobType* :");
		if (jobType != null)
			auditStr.append(jobType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*isActive* :");
		auditStr.append(isActive);
	    auditStr.append("; ");
		auditStr.append("\r\n*dNAApptsInLastXhrs* :");
		auditStr.append(dNAApptsInLastXhrs);
	    auditStr.append("; ");
		auditStr.append("\r\n*noOfRecordsUpdated* :");
		auditStr.append(noOfRecordsUpdated);
	    auditStr.append("; ");
		auditStr.append("\r\n*locationToPrintFor* :");
		if (locationToPrintFor != null)
		{
			auditStr.append(toShortClassName(locationToPrintFor));
				
		    auditStr.append(locationToPrintFor.getId());
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
		
		String keyClassName = "PrintAgent";
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
		if (this.getQueryServerUrl() != null)
		{
			sb.append("<queryServerUrl>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getQueryServerUrl().toString()));
			sb.append("</queryServerUrl>");		
		}
		if (this.getReportServerUrl() != null)
		{
			sb.append("<reportServerUrl>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReportServerUrl().toString()));
			sb.append("</reportServerUrl>");		
		}
		if (this.getTemplatePrinters() != null)
		{
			if (this.getTemplatePrinters().size() > 0 )
			{
			sb.append("<templatePrinters>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getTemplatePrinters(), domMap));
			sb.append("</templatePrinters>");		
			}
		}
		if (this.getDescription() != null)
		{
			sb.append("<description>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDescription().toString()));
			sb.append("</description>");		
		}
		if (this.getTrigger() != null)
		{
			sb.append("<trigger>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTrigger().toString()));
			sb.append("</trigger>");		
		}
		if (this.getLastSuccessfulRunDateTime() != null)
		{
			sb.append("<lastSuccessfulRunDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getLastSuccessfulRunDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</lastSuccessfulRunDateTime>");		
		}
		if (this.getLastRunDateTime() != null)
		{
			sb.append("<lastRunDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getLastRunDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</lastRunDateTime>");		
		}
		if (this.getJobType() != null)
		{
			sb.append("<jobType>");
			sb.append(this.getJobType().toXMLString()); 
			sb.append("</jobType>");		
		}
		if (this.isIsActive() != null)
		{
			sb.append("<isActive>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsActive().toString()));
			sb.append("</isActive>");		
		}
		if (this.getDNAApptsInLastXhrs() != null)
		{
			sb.append("<dNAApptsInLastXhrs>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDNAApptsInLastXhrs().toString()));
			sb.append("</dNAApptsInLastXhrs>");		
		}
		if (this.getNoOfRecordsUpdated() != null)
		{
			sb.append("<noOfRecordsUpdated>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNoOfRecordsUpdated().toString()));
			sb.append("</noOfRecordsUpdated>");		
		}
		if (this.getLocationToPrintFor() != null)
		{
			sb.append("<locationToPrintFor>");
			sb.append(this.getLocationToPrintFor().toXMLString(domMap)); 	
			sb.append("</locationToPrintFor>");		
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
			PrintAgent domainObject = getPrintAgentfromXML(itemEl, factory, domMap);

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
			PrintAgent domainObject = getPrintAgentfromXML(itemEl, factory, domMap);

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
		
	public static PrintAgent getPrintAgentfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPrintAgentfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PrintAgent getPrintAgentfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PrintAgent.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PrintAgent.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PrintAgent class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PrintAgent)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PrintAgent.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PrintAgent ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PrintAgent)factory.getImportedDomainObject(PrintAgent.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PrintAgent();
		}
		String keyClassName = "PrintAgent";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PrintAgent)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PrintAgent obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("queryServerUrl");
		if(fldEl != null)
		{	
    		obj.setQueryServerUrl(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("reportServerUrl");
		if(fldEl != null)
		{	
    		obj.setReportServerUrl(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("templatePrinters");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setTemplatePrinters(ims.core.admin.domain.objects.TemplatePrinter.fromSetXMLString(fldEl, factory, obj.getTemplatePrinters(), domMap));
		}
		fldEl = el.element("description");
		if(fldEl != null)
		{	
    		obj.setDescription(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("trigger");
		if(fldEl != null)
		{	
    		obj.setTrigger(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("lastSuccessfulRunDateTime");
		if(fldEl != null)
		{	
    		obj.setLastSuccessfulRunDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("lastRunDateTime");
		if(fldEl != null)
		{	
    		obj.setLastRunDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("jobType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setJobType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("isActive");
		if(fldEl != null)
		{	
    		obj.setIsActive(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dNAApptsInLastXhrs");
		if(fldEl != null)
		{	
    		obj.setDNAApptsInLastXhrs(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("noOfRecordsUpdated");
		if(fldEl != null)
		{	
    		obj.setNoOfRecordsUpdated(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("locationToPrintFor");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setLocationToPrintFor(ims.core.resource.place.domain.objects.LocSite.getLocSitefromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "templatePrinters"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String QueryServerUrl = "queryServerUrl";
		public static final String ReportServerUrl = "reportServerUrl";
		public static final String TemplatePrinters = "templatePrinters";
		public static final String Description = "description";
		public static final String Trigger = "trigger";
		public static final String LastSuccessfulRunDateTime = "lastSuccessfulRunDateTime";
		public static final String LastRunDateTime = "lastRunDateTime";
		public static final String JobType = "jobType";
		public static final String IsActive = "isActive";
		public static final String DNAApptsInLastXhrs = "dNAApptsInLastXhrs";
		public static final String NoOfRecordsUpdated = "noOfRecordsUpdated";
		public static final String LocationToPrintFor = "locationToPrintFor";
	}
}

