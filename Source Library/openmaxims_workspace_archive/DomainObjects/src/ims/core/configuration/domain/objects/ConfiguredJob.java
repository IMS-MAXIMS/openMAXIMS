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
 * @author Catalin Tomozei
 * Generated.
 */


public class ConfiguredJob extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1028100057;
	private static final long serialVersionUID = 1028100057L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Job running Frequency */
	private ims.domain.lookups.LookupInstance frequency;
	/** Start DateTime */
	private java.util.Date startDateTime;
	/** End DateTime */
	private java.util.Date endDateTime;
	/** Type of trigger: SimpleTrigger or CronTrigger */
	private Boolean isCronTrigger;
	/** Quartz cron expression */
	private String cronExpression;
	/** Lat run DateTime */
	private java.util.Date lastRun;
	/** Next run DateTime */
	private java.util.Date nextRun;
	/** toString() of CronExpression */
	private String cronExpressionDisplay;
	/** True if SystemJob is configured */
	private Boolean isActive;
	/** Job description */
	private String description;
	/** System Job */
	private ims.core.configuration.domain.objects.SystemJob scheduledJob;
	/** Notifications when job is successful
	  * Collection of ims.core.configuration.domain.objects.ConfiguredJobNotification.
	  */
	private java.util.List notificationsOnSuccess;
	/** Notifications when job failed
	  * Collection of ims.core.configuration.domain.objects.ConfiguredJobNotification.
	  */
	private java.util.List notificationsOnFailure;
	/** Configured Job Name */
	private String name;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ConfiguredJob (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ConfiguredJob ()
    {
    	super();
    }
    public ConfiguredJob (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.configuration.domain.objects.ConfiguredJob.class;
	}


	public ims.domain.lookups.LookupInstance getFrequency() {
		return frequency;
	}
	public void setFrequency(ims.domain.lookups.LookupInstance frequency) {
		this.frequency = frequency;
	}

	public java.util.Date getStartDateTime() {
		return startDateTime;
	}
	public void setStartDateTime(java.util.Date startDateTime) {
		this.startDateTime = startDateTime;
	}

	public java.util.Date getEndDateTime() {
		return endDateTime;
	}
	public void setEndDateTime(java.util.Date endDateTime) {
		this.endDateTime = endDateTime;
	}

	public Boolean isIsCronTrigger() {
		return isCronTrigger;
	}
	public void setIsCronTrigger(Boolean isCronTrigger) {
		this.isCronTrigger = isCronTrigger;
	}

	public String getCronExpression() {
		return cronExpression;
	}
	public void setCronExpression(String cronExpression) {
		if ( null != cronExpression && cronExpression.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for cronExpression. Tried to set value: "+
				cronExpression);
		}
		this.cronExpression = cronExpression;
	}

	public java.util.Date getLastRun() {
		return lastRun;
	}
	public void setLastRun(java.util.Date lastRun) {
		this.lastRun = lastRun;
	}

	public java.util.Date getNextRun() {
		return nextRun;
	}
	public void setNextRun(java.util.Date nextRun) {
		this.nextRun = nextRun;
	}

	public String getCronExpressionDisplay() {
		return cronExpressionDisplay;
	}
	public void setCronExpressionDisplay(String cronExpressionDisplay) {
		if ( null != cronExpressionDisplay && cronExpressionDisplay.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for cronExpressionDisplay. Tried to set value: "+
				cronExpressionDisplay);
		}
		this.cronExpressionDisplay = cronExpressionDisplay;
	}

	public Boolean isIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		if ( null != description && description.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for description. Tried to set value: "+
				description);
		}
		this.description = description;
	}

	public ims.core.configuration.domain.objects.SystemJob getScheduledJob() {
		return scheduledJob;
	}
	public void setScheduledJob(ims.core.configuration.domain.objects.SystemJob scheduledJob) {
		this.scheduledJob = scheduledJob;
	}

	public java.util.List getNotificationsOnSuccess() {
		if ( null == notificationsOnSuccess ) {
			notificationsOnSuccess = new java.util.ArrayList();
		}
		return notificationsOnSuccess;
	}
	public void setNotificationsOnSuccess(java.util.List paramValue) {
		this.notificationsOnSuccess = paramValue;
	}

	public java.util.List getNotificationsOnFailure() {
		if ( null == notificationsOnFailure ) {
			notificationsOnFailure = new java.util.ArrayList();
		}
		return notificationsOnFailure;
	}
	public void setNotificationsOnFailure(java.util.List paramValue) {
		this.notificationsOnFailure = paramValue;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		if ( null != name && name.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for name. Tried to set value: "+
				name);
		}
		this.name = name;
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
		
		auditStr.append("\r\n*frequency* :");
		if (frequency != null)
			auditStr.append(frequency.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*startDateTime* :");
		auditStr.append(startDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*endDateTime* :");
		auditStr.append(endDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*isCronTrigger* :");
		auditStr.append(isCronTrigger);
	    auditStr.append("; ");
		auditStr.append("\r\n*cronExpression* :");
		auditStr.append(cronExpression);
	    auditStr.append("; ");
		auditStr.append("\r\n*lastRun* :");
		auditStr.append(lastRun);
	    auditStr.append("; ");
		auditStr.append("\r\n*nextRun* :");
		auditStr.append(nextRun);
	    auditStr.append("; ");
		auditStr.append("\r\n*cronExpressionDisplay* :");
		auditStr.append(cronExpressionDisplay);
	    auditStr.append("; ");
		auditStr.append("\r\n*isActive* :");
		auditStr.append(isActive);
	    auditStr.append("; ");
		auditStr.append("\r\n*description* :");
		auditStr.append(description);
	    auditStr.append("; ");
		auditStr.append("\r\n*scheduledJob* :");
		if (scheduledJob != null)
		{
			auditStr.append(toShortClassName(scheduledJob));
				
		    auditStr.append(scheduledJob.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*notificationsOnSuccess* :");
		if (notificationsOnSuccess != null)
		{
		int i12=0;
		for (i12=0; i12<notificationsOnSuccess.size(); i12++)
		{
			if (i12 > 0)
				auditStr.append(",");
			ims.core.configuration.domain.objects.ConfiguredJobNotification obj = (ims.core.configuration.domain.objects.ConfiguredJobNotification)notificationsOnSuccess.get(i12);
		    if (obj != null)
			{
				if (i12 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i12 > 0)
			auditStr.append("] " + i12);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*notificationsOnFailure* :");
		if (notificationsOnFailure != null)
		{
		int i13=0;
		for (i13=0; i13<notificationsOnFailure.size(); i13++)
		{
			if (i13 > 0)
				auditStr.append(",");
			ims.core.configuration.domain.objects.ConfiguredJobNotification obj = (ims.core.configuration.domain.objects.ConfiguredJobNotification)notificationsOnFailure.get(i13);
		    if (obj != null)
			{
				if (i13 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i13 > 0)
			auditStr.append("] " + i13);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*name* :");
		auditStr.append(name);
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
		
		String keyClassName = "ConfiguredJob";
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
		if (this.getFrequency() != null)
		{
			sb.append("<frequency>");
			sb.append(this.getFrequency().toXMLString()); 
			sb.append("</frequency>");		
		}
		if (this.getStartDateTime() != null)
		{
			sb.append("<startDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getStartDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</startDateTime>");		
		}
		if (this.getEndDateTime() != null)
		{
			sb.append("<endDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getEndDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</endDateTime>");		
		}
		if (this.isIsCronTrigger() != null)
		{
			sb.append("<isCronTrigger>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsCronTrigger().toString()));
			sb.append("</isCronTrigger>");		
		}
		if (this.getCronExpression() != null)
		{
			sb.append("<cronExpression>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCronExpression().toString()));
			sb.append("</cronExpression>");		
		}
		if (this.getLastRun() != null)
		{
			sb.append("<lastRun>");
			sb.append(new ims.framework.utils.DateTime(this.getLastRun()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</lastRun>");		
		}
		if (this.getNextRun() != null)
		{
			sb.append("<nextRun>");
			sb.append(new ims.framework.utils.DateTime(this.getNextRun()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</nextRun>");		
		}
		if (this.getCronExpressionDisplay() != null)
		{
			sb.append("<cronExpressionDisplay>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCronExpressionDisplay().toString()));
			sb.append("</cronExpressionDisplay>");		
		}
		if (this.isIsActive() != null)
		{
			sb.append("<isActive>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsActive().toString()));
			sb.append("</isActive>");		
		}
		if (this.getDescription() != null)
		{
			sb.append("<description>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDescription().toString()));
			sb.append("</description>");		
		}
		if (this.getScheduledJob() != null)
		{
			sb.append("<scheduledJob>");
			sb.append(this.getScheduledJob().toXMLString(domMap)); 	
			sb.append("</scheduledJob>");		
		}
		if (this.getNotificationsOnSuccess() != null)
		{
			if (this.getNotificationsOnSuccess().size() > 0 )
			{
			sb.append("<notificationsOnSuccess>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getNotificationsOnSuccess(), domMap));
			sb.append("</notificationsOnSuccess>");		
			}
		}
		if (this.getNotificationsOnFailure() != null)
		{
			if (this.getNotificationsOnFailure().size() > 0 )
			{
			sb.append("<notificationsOnFailure>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getNotificationsOnFailure(), domMap));
			sb.append("</notificationsOnFailure>");		
			}
		}
		if (this.getName() != null)
		{
			sb.append("<name>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getName().toString()));
			sb.append("</name>");		
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
			ConfiguredJob domainObject = getConfiguredJobfromXML(itemEl, factory, domMap);

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
			ConfiguredJob domainObject = getConfiguredJobfromXML(itemEl, factory, domMap);

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
		
	public static ConfiguredJob getConfiguredJobfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getConfiguredJobfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ConfiguredJob getConfiguredJobfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ConfiguredJob.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ConfiguredJob.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ConfiguredJob class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ConfiguredJob)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ConfiguredJob.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ConfiguredJob ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ConfiguredJob)factory.getImportedDomainObject(ConfiguredJob.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ConfiguredJob();
		}
		String keyClassName = "ConfiguredJob";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ConfiguredJob)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ConfiguredJob obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("frequency");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setFrequency(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("startDateTime");
		if(fldEl != null)
		{	
    		obj.setStartDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("endDateTime");
		if(fldEl != null)
		{	
    		obj.setEndDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("isCronTrigger");
		if(fldEl != null)
		{	
    		obj.setIsCronTrigger(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("cronExpression");
		if(fldEl != null)
		{	
    		obj.setCronExpression(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("lastRun");
		if(fldEl != null)
		{	
    		obj.setLastRun(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("nextRun");
		if(fldEl != null)
		{	
    		obj.setNextRun(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("cronExpressionDisplay");
		if(fldEl != null)
		{	
    		obj.setCronExpressionDisplay(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isActive");
		if(fldEl != null)
		{	
    		obj.setIsActive(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("description");
		if(fldEl != null)
		{	
    		obj.setDescription(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("scheduledJob");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setScheduledJob(ims.core.configuration.domain.objects.SystemJob.getSystemJobfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("notificationsOnSuccess");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setNotificationsOnSuccess(ims.core.configuration.domain.objects.ConfiguredJobNotification.fromListXMLString(fldEl, factory, obj.getNotificationsOnSuccess(), domMap));
		}
		fldEl = el.element("notificationsOnFailure");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setNotificationsOnFailure(ims.core.configuration.domain.objects.ConfiguredJobNotification.fromListXMLString(fldEl, factory, obj.getNotificationsOnFailure(), domMap));
		}
		fldEl = el.element("name");
		if(fldEl != null)
		{	
    		obj.setName(new String(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "notificationsOnSuccess"
		, "notificationsOnFailure"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Frequency = "frequency";
		public static final String StartDateTime = "startDateTime";
		public static final String EndDateTime = "endDateTime";
		public static final String IsCronTrigger = "isCronTrigger";
		public static final String CronExpression = "cronExpression";
		public static final String LastRun = "lastRun";
		public static final String NextRun = "nextRun";
		public static final String CronExpressionDisplay = "cronExpressionDisplay";
		public static final String IsActive = "isActive";
		public static final String Description = "description";
		public static final String ScheduledJob = "scheduledJob";
		public static final String NotificationsOnSuccess = "notificationsOnSuccess";
		public static final String NotificationsOnFailure = "notificationsOnFailure";
		public static final String Name = "name";
	}
}

