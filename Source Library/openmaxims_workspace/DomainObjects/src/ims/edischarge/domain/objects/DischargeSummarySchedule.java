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
package ims.edischarge.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class DischargeSummarySchedule extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1099100005;
	private static final long serialVersionUID = 1099100005L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Date of Creation of the Trigger */
	private java.util.Date creationDate;
	/** Trigger Frequency */
	private String triggerFrequency;
	/** Last Run */
	private java.util.Date lastRun;
	/** Next Run */
	private java.util.Date nextRun;
	/** Number of Letters Generated */
	private Integer generatedLeettersNo;
	/** PrintAgent */
	private String printAgentTo;
	private String repeatInterval;
	/** JobType */
	private ims.domain.lookups.LookupInstance jobType;
	/** Number of emails sent successful */
	private Integer successfulEmailsNo;
	/** Number of emails sent failed */
	private Integer failedEmailsNo;
	/** Number of Letters Printed */
	private Integer printedLettersNo;
	/** List of failed emails
	  * Collection of ims.edischarge.domain.objects.FailedEmailsDetails.
	  */
	private java.util.List failedEmails;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public DischargeSummarySchedule (Integer id, int ver)
    {
    	super(id, ver);
    }
    public DischargeSummarySchedule ()
    {
    	super();
    }
    public DischargeSummarySchedule (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.edischarge.domain.objects.DischargeSummarySchedule.class;
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

	public Integer getGeneratedLeettersNo() {
		return generatedLeettersNo;
	}
	public void setGeneratedLeettersNo(Integer generatedLeettersNo) {
		this.generatedLeettersNo = generatedLeettersNo;
	}

	public String getPrintAgentTo() {
		return printAgentTo;
	}
	public void setPrintAgentTo(String printAgentTo) {
		if ( null != printAgentTo && printAgentTo.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for printAgentTo. Tried to set value: "+
				printAgentTo);
		}
		this.printAgentTo = printAgentTo;
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

	public ims.domain.lookups.LookupInstance getJobType() {
		return jobType;
	}
	public void setJobType(ims.domain.lookups.LookupInstance jobType) {
		this.jobType = jobType;
	}

	public Integer getSuccessfulEmailsNo() {
		return successfulEmailsNo;
	}
	public void setSuccessfulEmailsNo(Integer successfulEmailsNo) {
		this.successfulEmailsNo = successfulEmailsNo;
	}

	public Integer getFailedEmailsNo() {
		return failedEmailsNo;
	}
	public void setFailedEmailsNo(Integer failedEmailsNo) {
		this.failedEmailsNo = failedEmailsNo;
	}

	public Integer getPrintedLettersNo() {
		return printedLettersNo;
	}
	public void setPrintedLettersNo(Integer printedLettersNo) {
		this.printedLettersNo = printedLettersNo;
	}

	public java.util.List getFailedEmails() {
		if ( null == failedEmails ) {
			failedEmails = new java.util.ArrayList();
		}
		return failedEmails;
	}
	public void setFailedEmails(java.util.List paramValue) {
		this.failedEmails = paramValue;
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
		auditStr.append("\r\n*generatedLeettersNo* :");
		auditStr.append(generatedLeettersNo);
	    auditStr.append("; ");
		auditStr.append("\r\n*printAgentTo* :");
		auditStr.append(printAgentTo);
	    auditStr.append("; ");
		auditStr.append("\r\n*repeatInterval* :");
		auditStr.append(repeatInterval);
	    auditStr.append("; ");
		auditStr.append("\r\n*jobType* :");
		if (jobType != null)
			auditStr.append(jobType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*successfulEmailsNo* :");
		auditStr.append(successfulEmailsNo);
	    auditStr.append("; ");
		auditStr.append("\r\n*failedEmailsNo* :");
		auditStr.append(failedEmailsNo);
	    auditStr.append("; ");
		auditStr.append("\r\n*printedLettersNo* :");
		auditStr.append(printedLettersNo);
	    auditStr.append("; ");
		auditStr.append("\r\n*failedEmails* :");
		if (failedEmails != null)
		{
		int i12=0;
		for (i12=0; i12<failedEmails.size(); i12++)
		{
			if (i12 > 0)
				auditStr.append(",");
			ims.edischarge.domain.objects.FailedEmailsDetails obj = (ims.edischarge.domain.objects.FailedEmailsDetails)failedEmails.get(i12);
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
		
		String keyClassName = "DischargeSummarySchedule";
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
		if (this.getGeneratedLeettersNo() != null)
		{
			sb.append("<generatedLeettersNo>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getGeneratedLeettersNo().toString()));
			sb.append("</generatedLeettersNo>");		
		}
		if (this.getPrintAgentTo() != null)
		{
			sb.append("<printAgentTo>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPrintAgentTo().toString()));
			sb.append("</printAgentTo>");		
		}
		if (this.getRepeatInterval() != null)
		{
			sb.append("<repeatInterval>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRepeatInterval().toString()));
			sb.append("</repeatInterval>");		
		}
		if (this.getJobType() != null)
		{
			sb.append("<jobType>");
			sb.append(this.getJobType().toXMLString()); 
			sb.append("</jobType>");		
		}
		if (this.getSuccessfulEmailsNo() != null)
		{
			sb.append("<successfulEmailsNo>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSuccessfulEmailsNo().toString()));
			sb.append("</successfulEmailsNo>");		
		}
		if (this.getFailedEmailsNo() != null)
		{
			sb.append("<failedEmailsNo>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getFailedEmailsNo().toString()));
			sb.append("</failedEmailsNo>");		
		}
		if (this.getPrintedLettersNo() != null)
		{
			sb.append("<printedLettersNo>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPrintedLettersNo().toString()));
			sb.append("</printedLettersNo>");		
		}
		if (this.getFailedEmails() != null)
		{
			if (this.getFailedEmails().size() > 0 )
			{
			sb.append("<failedEmails>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getFailedEmails(), domMap));
			sb.append("</failedEmails>");		
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
			DischargeSummarySchedule domainObject = getDischargeSummarySchedulefromXML(itemEl, factory, domMap);

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
			DischargeSummarySchedule domainObject = getDischargeSummarySchedulefromXML(itemEl, factory, domMap);

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
		
	public static DischargeSummarySchedule getDischargeSummarySchedulefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getDischargeSummarySchedulefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static DischargeSummarySchedule getDischargeSummarySchedulefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!DischargeSummarySchedule.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!DischargeSummarySchedule.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the DischargeSummarySchedule class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (DischargeSummarySchedule)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(DischargeSummarySchedule.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		DischargeSummarySchedule ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (DischargeSummarySchedule)factory.getImportedDomainObject(DischargeSummarySchedule.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new DischargeSummarySchedule();
		}
		String keyClassName = "DischargeSummarySchedule";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (DischargeSummarySchedule)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, DischargeSummarySchedule obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
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
		fldEl = el.element("generatedLeettersNo");
		if(fldEl != null)
		{	
    		obj.setGeneratedLeettersNo(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("printAgentTo");
		if(fldEl != null)
		{	
    		obj.setPrintAgentTo(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("repeatInterval");
		if(fldEl != null)
		{	
    		obj.setRepeatInterval(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("jobType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setJobType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("successfulEmailsNo");
		if(fldEl != null)
		{	
    		obj.setSuccessfulEmailsNo(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("failedEmailsNo");
		if(fldEl != null)
		{	
    		obj.setFailedEmailsNo(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("printedLettersNo");
		if(fldEl != null)
		{	
    		obj.setPrintedLettersNo(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("failedEmails");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setFailedEmails(ims.edischarge.domain.objects.FailedEmailsDetails.fromListXMLString(fldEl, factory, obj.getFailedEmails(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "failedEmails"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String CreationDate = "creationDate";
		public static final String TriggerFrequency = "triggerFrequency";
		public static final String LastRun = "lastRun";
		public static final String NextRun = "nextRun";
		public static final String GeneratedLeettersNo = "generatedLeettersNo";
		public static final String PrintAgentTo = "printAgentTo";
		public static final String RepeatInterval = "repeatInterval";
		public static final String JobType = "jobType";
		public static final String SuccessfulEmailsNo = "successfulEmailsNo";
		public static final String FailedEmailsNo = "failedEmailsNo";
		public static final String PrintedLettersNo = "printedLettersNo";
		public static final String FailedEmails = "failedEmails";
	}
}

