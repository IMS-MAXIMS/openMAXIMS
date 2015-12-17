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
package ims.core.documents.domain.objects;

/**
 * 
 * @author Catalin Tomozei
 * Generated.
 */


public class ConversionDetails extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1068100003;
	private static final long serialVersionUID = 1068100003L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Last unid */
	private Integer lastUnid;
	/** Last DateTime when a record was updated */
	private java.util.Date lastUpdatedDateTime;
	/** Total conversions */
	private Integer totalConversions;
	/** Time for one conversion */
	private Integer timeForOneConversion;
	/** Number of conversion in one minute */
	private Integer oneMinuteAverage;
	/** Number of conversion in one hour */
	private Integer oneHourAverage;
	/** Date of Creation of the Trigger */
	private java.util.Date creationDate;
	/** TriggerFrequency */
	private String triggerFrequency;
	/** LastRun */
	private java.util.Date lastRun;
	/** Next Run */
	private java.util.Date nextRun;
	/** RepeatInterval */
	private String repeatInterval;
	/** Configured Scheduled Job ID */
	private Integer configuredScheduledJobID;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ConversionDetails (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ConversionDetails ()
    {
    	super();
    }
    public ConversionDetails (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.documents.domain.objects.ConversionDetails.class;
	}


	public Integer getLastUnid() {
		return lastUnid;
	}
	public void setLastUnid(Integer lastUnid) {
		this.lastUnid = lastUnid;
	}

	public java.util.Date getLastUpdatedDateTime() {
		return lastUpdatedDateTime;
	}
	public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
		this.lastUpdatedDateTime = lastUpdatedDateTime;
	}

	public Integer getTotalConversions() {
		return totalConversions;
	}
	public void setTotalConversions(Integer totalConversions) {
		this.totalConversions = totalConversions;
	}

	public Integer getTimeForOneConversion() {
		return timeForOneConversion;
	}
	public void setTimeForOneConversion(Integer timeForOneConversion) {
		this.timeForOneConversion = timeForOneConversion;
	}

	public Integer getOneMinuteAverage() {
		return oneMinuteAverage;
	}
	public void setOneMinuteAverage(Integer oneMinuteAverage) {
		this.oneMinuteAverage = oneMinuteAverage;
	}

	public Integer getOneHourAverage() {
		return oneHourAverage;
	}
	public void setOneHourAverage(Integer oneHourAverage) {
		this.oneHourAverage = oneHourAverage;
	}

	public java.util.Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(java.util.Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getTriggerFrequency() {
		return triggerFrequency;
	}
	public void setTriggerFrequency(String triggerFrequency) {
		if ( null != triggerFrequency && triggerFrequency.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for triggerFrequency. Tried to set value: "+
				triggerFrequency);
		}
		this.triggerFrequency = triggerFrequency;
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

	public String getRepeatInterval() {
		return repeatInterval;
	}
	public void setRepeatInterval(String repeatInterval) {
		if ( null != repeatInterval && repeatInterval.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for repeatInterval. Tried to set value: "+
				repeatInterval);
		}
		this.repeatInterval = repeatInterval;
	}

	public Integer getConfiguredScheduledJobID() {
		return configuredScheduledJobID;
	}
	public void setConfiguredScheduledJobID(Integer configuredScheduledJobID) {
		this.configuredScheduledJobID = configuredScheduledJobID;
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
		
		auditStr.append("\r\n*lastUnid* :");
		auditStr.append(lastUnid);
	    auditStr.append("; ");
		auditStr.append("\r\n*lastUpdatedDateTime* :");
		auditStr.append(lastUpdatedDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*totalConversions* :");
		auditStr.append(totalConversions);
	    auditStr.append("; ");
		auditStr.append("\r\n*timeForOneConversion* :");
		auditStr.append(timeForOneConversion);
	    auditStr.append("; ");
		auditStr.append("\r\n*oneMinuteAverage* :");
		auditStr.append(oneMinuteAverage);
	    auditStr.append("; ");
		auditStr.append("\r\n*oneHourAverage* :");
		auditStr.append(oneHourAverage);
	    auditStr.append("; ");
		auditStr.append("\r\n*creationDate* :");
		auditStr.append(creationDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*triggerFrequency* :");
		auditStr.append(triggerFrequency);
	    auditStr.append("; ");
		auditStr.append("\r\n*lastRun* :");
		auditStr.append(lastRun);
	    auditStr.append("; ");
		auditStr.append("\r\n*nextRun* :");
		auditStr.append(nextRun);
	    auditStr.append("; ");
		auditStr.append("\r\n*repeatInterval* :");
		auditStr.append(repeatInterval);
	    auditStr.append("; ");
		auditStr.append("\r\n*configuredScheduledJobID* :");
		auditStr.append(configuredScheduledJobID);
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
		
		String keyClassName = "ConversionDetails";
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
		if (this.getLastUnid() != null)
		{
			sb.append("<lastUnid>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLastUnid().toString()));
			sb.append("</lastUnid>");		
		}
		if (this.getLastUpdatedDateTime() != null)
		{
			sb.append("<lastUpdatedDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getLastUpdatedDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</lastUpdatedDateTime>");		
		}
		if (this.getTotalConversions() != null)
		{
			sb.append("<totalConversions>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTotalConversions().toString()));
			sb.append("</totalConversions>");		
		}
		if (this.getTimeForOneConversion() != null)
		{
			sb.append("<timeForOneConversion>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTimeForOneConversion().toString()));
			sb.append("</timeForOneConversion>");		
		}
		if (this.getOneMinuteAverage() != null)
		{
			sb.append("<oneMinuteAverage>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOneMinuteAverage().toString()));
			sb.append("</oneMinuteAverage>");		
		}
		if (this.getOneHourAverage() != null)
		{
			sb.append("<oneHourAverage>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOneHourAverage().toString()));
			sb.append("</oneHourAverage>");		
		}
		if (this.getCreationDate() != null)
		{
			sb.append("<creationDate>");
			sb.append(new ims.framework.utils.DateTime(this.getCreationDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</creationDate>");		
		}
		if (this.getTriggerFrequency() != null)
		{
			sb.append("<triggerFrequency>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTriggerFrequency().toString()));
			sb.append("</triggerFrequency>");		
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
		if (this.getRepeatInterval() != null)
		{
			sb.append("<repeatInterval>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRepeatInterval().toString()));
			sb.append("</repeatInterval>");		
		}
		if (this.getConfiguredScheduledJobID() != null)
		{
			sb.append("<configuredScheduledJobID>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getConfiguredScheduledJobID().toString()));
			sb.append("</configuredScheduledJobID>");		
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
			ConversionDetails domainObject = getConversionDetailsfromXML(itemEl, factory, domMap);

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
			ConversionDetails domainObject = getConversionDetailsfromXML(itemEl, factory, domMap);

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
		
	public static ConversionDetails getConversionDetailsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getConversionDetailsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ConversionDetails getConversionDetailsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ConversionDetails.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ConversionDetails.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ConversionDetails class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ConversionDetails)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ConversionDetails.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ConversionDetails ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ConversionDetails)factory.getImportedDomainObject(ConversionDetails.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ConversionDetails();
		}
		String keyClassName = "ConversionDetails";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ConversionDetails)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ConversionDetails obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("lastUnid");
		if(fldEl != null)
		{	
    		obj.setLastUnid(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("lastUpdatedDateTime");
		if(fldEl != null)
		{	
    		obj.setLastUpdatedDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("totalConversions");
		if(fldEl != null)
		{	
    		obj.setTotalConversions(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("timeForOneConversion");
		if(fldEl != null)
		{	
    		obj.setTimeForOneConversion(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("oneMinuteAverage");
		if(fldEl != null)
		{	
    		obj.setOneMinuteAverage(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("oneHourAverage");
		if(fldEl != null)
		{	
    		obj.setOneHourAverage(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("creationDate");
		if(fldEl != null)
		{	
    		obj.setCreationDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("triggerFrequency");
		if(fldEl != null)
		{	
    		obj.setTriggerFrequency(new String(fldEl.getTextTrim()));	
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
		fldEl = el.element("repeatInterval");
		if(fldEl != null)
		{	
    		obj.setRepeatInterval(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("configuredScheduledJobID");
		if(fldEl != null)
		{	
    		obj.setConfiguredScheduledJobID(new Integer(fldEl.getTextTrim()));	
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
		public static final String LastUnid = "lastUnid";
		public static final String LastUpdatedDateTime = "lastUpdatedDateTime";
		public static final String TotalConversions = "totalConversions";
		public static final String TimeForOneConversion = "timeForOneConversion";
		public static final String OneMinuteAverage = "oneMinuteAverage";
		public static final String OneHourAverage = "oneHourAverage";
		public static final String CreationDate = "creationDate";
		public static final String TriggerFrequency = "triggerFrequency";
		public static final String LastRun = "lastRun";
		public static final String NextRun = "nextRun";
		public static final String RepeatInterval = "repeatInterval";
		public static final String ConfiguredScheduledJobID = "configuredScheduledJobID";
	}
}

