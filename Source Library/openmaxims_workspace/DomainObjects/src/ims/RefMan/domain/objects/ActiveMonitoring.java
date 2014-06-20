/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated: 16/04/2014, 12:34
 *
 */
package ims.RefMan.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class ActiveMonitoring extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1096100046;
	private static final long serialVersionUID = 1096100046L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Start Date time of Active Monitoring */
	private java.util.Date startDateActiveMonitoring;
	/** Active Monitoring Reason */
	private ims.domain.lookups.LookupInstance activeMonitoringReason;
	/** Period of Monitoring Days */
	private Integer periodOfMonitoringDays;
	/** Book the next Appointment By */
	private java.util.Date bookApptBy;
	/** Active Monitoring Comments */
	private String activeMonitoringComments;
	/** Authoring HCP */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringHCP;
	/** RecordingInformation */
	private ims.core.clinical.domain.objects.AuthoringInformation recordingInformation;
	/** Active Monitoring End Date */
	private java.util.Date activeMonitoringEndDate;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ActiveMonitoring (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ActiveMonitoring ()
    {
    	super();
    }
    public ActiveMonitoring (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.RefMan.domain.objects.ActiveMonitoring.class;
	}


	public java.util.Date getStartDateActiveMonitoring() {
		return startDateActiveMonitoring;
	}
	public void setStartDateActiveMonitoring(java.util.Date startDateActiveMonitoring) {
		this.startDateActiveMonitoring = startDateActiveMonitoring;
	}

	public ims.domain.lookups.LookupInstance getActiveMonitoringReason() {
		return activeMonitoringReason;
	}
	public void setActiveMonitoringReason(ims.domain.lookups.LookupInstance activeMonitoringReason) {
		this.activeMonitoringReason = activeMonitoringReason;
	}

	public Integer getPeriodOfMonitoringDays() {
		return periodOfMonitoringDays;
	}
	public void setPeriodOfMonitoringDays(Integer periodOfMonitoringDays) {
		this.periodOfMonitoringDays = periodOfMonitoringDays;
	}

	public java.util.Date getBookApptBy() {
		return bookApptBy;
	}
	public void setBookApptBy(java.util.Date bookApptBy) {
		this.bookApptBy = bookApptBy;
	}

	public String getActiveMonitoringComments() {
		return activeMonitoringComments;
	}
	public void setActiveMonitoringComments(String activeMonitoringComments) {
		this.activeMonitoringComments = activeMonitoringComments;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getAuthoringHCP() {
		return authoringHCP;
	}
	public void setAuthoringHCP(ims.core.clinical.domain.objects.AuthoringInformation authoringHCP) {
		this.authoringHCP = authoringHCP;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getRecordingInformation() {
		return recordingInformation;
	}
	public void setRecordingInformation(ims.core.clinical.domain.objects.AuthoringInformation recordingInformation) {
		this.recordingInformation = recordingInformation;
	}

	public java.util.Date getActiveMonitoringEndDate() {
		return activeMonitoringEndDate;
	}
	public void setActiveMonitoringEndDate(java.util.Date activeMonitoringEndDate) {
		this.activeMonitoringEndDate = activeMonitoringEndDate;
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
		
		auditStr.append("\r\n*startDateActiveMonitoring* :");
		auditStr.append(startDateActiveMonitoring);
	    auditStr.append("; ");
		auditStr.append("\r\n*activeMonitoringReason* :");
		if (activeMonitoringReason != null)
			auditStr.append(activeMonitoringReason.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*periodOfMonitoringDays* :");
		auditStr.append(periodOfMonitoringDays);
	    auditStr.append("; ");
		auditStr.append("\r\n*bookApptBy* :");
		auditStr.append(bookApptBy);
	    auditStr.append("; ");
		auditStr.append("\r\n*activeMonitoringComments* :");
		auditStr.append(activeMonitoringComments);
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringHCP* :");
		if (authoringHCP != null)
		{
			auditStr.append(toShortClassName(authoringHCP));
				
		    auditStr.append(authoringHCP.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*recordingInformation* :");
		if (recordingInformation != null)
		{
			auditStr.append(toShortClassName(recordingInformation));
				
		    auditStr.append(recordingInformation.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*activeMonitoringEndDate* :");
		auditStr.append(activeMonitoringEndDate);
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
		
		String keyClassName = "ActiveMonitoring";
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
		if (this.getStartDateActiveMonitoring() != null)
		{
			sb.append("<startDateActiveMonitoring>");
			sb.append(new ims.framework.utils.DateTime(this.getStartDateActiveMonitoring()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</startDateActiveMonitoring>");		
		}
		if (this.getActiveMonitoringReason() != null)
		{
			sb.append("<activeMonitoringReason>");
			sb.append(this.getActiveMonitoringReason().toXMLString()); 
			sb.append("</activeMonitoringReason>");		
		}
		if (this.getPeriodOfMonitoringDays() != null)
		{
			sb.append("<periodOfMonitoringDays>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPeriodOfMonitoringDays().toString()));
			sb.append("</periodOfMonitoringDays>");		
		}
		if (this.getBookApptBy() != null)
		{
			sb.append("<bookApptBy>");
			sb.append(new ims.framework.utils.DateTime(this.getBookApptBy()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</bookApptBy>");		
		}
		if (this.getActiveMonitoringComments() != null)
		{
			sb.append("<activeMonitoringComments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getActiveMonitoringComments().toString()));
			sb.append("</activeMonitoringComments>");		
		}
		if (this.getAuthoringHCP() != null)
		{
			sb.append("<authoringHCP>");
			sb.append(this.getAuthoringHCP().toXMLString(domMap)); 	
			sb.append("</authoringHCP>");		
		}
		if (this.getRecordingInformation() != null)
		{
			sb.append("<recordingInformation>");
			sb.append(this.getRecordingInformation().toXMLString(domMap)); 	
			sb.append("</recordingInformation>");		
		}
		if (this.getActiveMonitoringEndDate() != null)
		{
			sb.append("<activeMonitoringEndDate>");
			sb.append(new ims.framework.utils.DateTime(this.getActiveMonitoringEndDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</activeMonitoringEndDate>");		
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
			ActiveMonitoring domainObject = getActiveMonitoringfromXML(itemEl, factory, domMap);

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
			ActiveMonitoring domainObject = getActiveMonitoringfromXML(itemEl, factory, domMap);

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
		
	public static ActiveMonitoring getActiveMonitoringfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getActiveMonitoringfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ActiveMonitoring getActiveMonitoringfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ActiveMonitoring.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ActiveMonitoring.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ActiveMonitoring class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ActiveMonitoring)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ActiveMonitoring.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ActiveMonitoring ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ActiveMonitoring)factory.getImportedDomainObject(ActiveMonitoring.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ActiveMonitoring();
		}
		String keyClassName = "ActiveMonitoring";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ActiveMonitoring)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ActiveMonitoring obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("startDateActiveMonitoring");
		if(fldEl != null)
		{	
    		obj.setStartDateActiveMonitoring(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("activeMonitoringReason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setActiveMonitoringReason(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("periodOfMonitoringDays");
		if(fldEl != null)
		{	
    		obj.setPeriodOfMonitoringDays(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("bookApptBy");
		if(fldEl != null)
		{	
    		obj.setBookApptBy(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("activeMonitoringComments");
		if(fldEl != null)
		{	
    		obj.setActiveMonitoringComments(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("authoringHCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringHCP(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("recordingInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRecordingInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("activeMonitoringEndDate");
		if(fldEl != null)
		{	
    		obj.setActiveMonitoringEndDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
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
		public static final String StartDateActiveMonitoring = "startDateActiveMonitoring";
		public static final String ActiveMonitoringReason = "activeMonitoringReason";
		public static final String PeriodOfMonitoringDays = "periodOfMonitoringDays";
		public static final String BookApptBy = "bookApptBy";
		public static final String ActiveMonitoringComments = "activeMonitoringComments";
		public static final String AuthoringHCP = "authoringHCP";
		public static final String RecordingInformation = "recordingInformation";
		public static final String ActiveMonitoringEndDate = "activeMonitoringEndDate";
	}
}

