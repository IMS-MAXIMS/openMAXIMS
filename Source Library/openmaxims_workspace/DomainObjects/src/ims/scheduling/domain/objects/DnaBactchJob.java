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
package ims.scheduling.domain.objects;

/**
 * 
 * @author Ander Telleria
 * Generated.
 */


public class DnaBactchJob extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1090100007;
	private static final long serialVersionUID = 1090100007L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Name of the Job */
	private String name;
	/** Date of Creation of the Trigger */
	private java.util.Date creationDate;
	/** Trigger Frecuency */
	private String triggerFrecuency;
	/** Last Run */
	private java.util.Date lastRun;
	/** Next Run */
	private java.util.Date nextRun;
	/** Number of appointments Updated */
	private Integer numAppointmentsUpdated;
	/** PrintAgent */
	private String printAgentTo;
	/** jobDetail */
	private String jobDetail;
	/** Cron */
	private String cron;
	/** CronFebruary */
	private String cronFebruary;
	/** isSimpreCron */
	private Boolean isSimpleCron;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public DnaBactchJob (Integer id, int ver)
    {
    	super(id, ver);
    }
    public DnaBactchJob ()
    {
    	super();
    }
    public DnaBactchJob (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.scheduling.domain.objects.DnaBactchJob.class;
	}


	public String getName() {
		return name;
	}
	public static DnaBactchJob getDnaBactchJobFromName(ims.domain.ILightweightDomainFactory factory, String val)
	{
		String hql = "from DnaBactchJob c where c.name = :name";		
		java.util.List l = factory.find(hql, new String[]{"name"}, new Object[]{val});
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. DnaBactchJob.name = " + val + " returned " + l.size() + " records. " );
		return (DnaBactchJob)l.get(0);
	}
	public void setName(String name) {
		if ( null != name && name.length() > 50 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for name. Tried to set value: "+
				name);
		}
		this.name = name;
	}

	public java.util.Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(java.util.Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getTriggerFrecuency() {
		return triggerFrecuency;
	}
	public void setTriggerFrecuency(String triggerFrecuency) {
		if ( null != triggerFrecuency && triggerFrecuency.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for triggerFrecuency. Tried to set value: "+
				triggerFrecuency);
		}
		this.triggerFrecuency = triggerFrecuency;
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

	public Integer getNumAppointmentsUpdated() {
		return numAppointmentsUpdated;
	}
	public void setNumAppointmentsUpdated(Integer numAppointmentsUpdated) {
		this.numAppointmentsUpdated = numAppointmentsUpdated;
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

	public String getJobDetail() {
		return jobDetail;
	}
	public void setJobDetail(String jobDetail) {
		this.jobDetail = jobDetail;
	}

	public String getCron() {
		return cron;
	}
	public void setCron(String cron) {
		this.cron = cron;
	}

	public String getCronFebruary() {
		return cronFebruary;
	}
	public void setCronFebruary(String cronFebruary) {
		this.cronFebruary = cronFebruary;
	}

	public Boolean isIsSimpleCron() {
		return isSimpleCron;
	}
	public void setIsSimpleCron(Boolean isSimpleCron) {
		this.isSimpleCron = isSimpleCron;
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
		
		auditStr.append("\r\n*name* :");
		auditStr.append(name);
	    auditStr.append("; ");
		auditStr.append("\r\n*creationDate* :");
		auditStr.append(creationDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*triggerFrecuency* :");
		auditStr.append(triggerFrecuency);
	    auditStr.append("; ");
		auditStr.append("\r\n*lastRun* :");
		auditStr.append(lastRun);
	    auditStr.append("; ");
		auditStr.append("\r\n*nextRun* :");
		auditStr.append(nextRun);
	    auditStr.append("; ");
		auditStr.append("\r\n*numAppointmentsUpdated* :");
		auditStr.append(numAppointmentsUpdated);
	    auditStr.append("; ");
		auditStr.append("\r\n*printAgentTo* :");
		auditStr.append(printAgentTo);
	    auditStr.append("; ");
		auditStr.append("\r\n*jobDetail* :");
		auditStr.append(jobDetail);
	    auditStr.append("; ");
		auditStr.append("\r\n*cron* :");
		auditStr.append(cron);
	    auditStr.append("; ");
		auditStr.append("\r\n*cronFebruary* :");
		auditStr.append(cronFebruary);
	    auditStr.append("; ");
		auditStr.append("\r\n*isSimpleCron* :");
		auditStr.append(isSimpleCron);
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
		
		String keyClassName = "DnaBactchJob";
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
		if (this.getCreationDate() != null)
		{
			sb.append("<creationDate>");
			sb.append(new ims.framework.utils.DateTime(this.getCreationDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</creationDate>");		
		}
		if (this.getTriggerFrecuency() != null)
		{
			sb.append("<triggerFrecuency>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTriggerFrecuency().toString()));
			sb.append("</triggerFrecuency>");		
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
		if (this.getNumAppointmentsUpdated() != null)
		{
			sb.append("<numAppointmentsUpdated>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNumAppointmentsUpdated().toString()));
			sb.append("</numAppointmentsUpdated>");		
		}
		if (this.getPrintAgentTo() != null)
		{
			sb.append("<printAgentTo>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPrintAgentTo().toString()));
			sb.append("</printAgentTo>");		
		}
		if (this.getJobDetail() != null)
		{
			sb.append("<jobDetail>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getJobDetail().toString()));
			sb.append("</jobDetail>");		
		}
		if (this.getCron() != null)
		{
			sb.append("<cron>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCron().toString()));
			sb.append("</cron>");		
		}
		if (this.getCronFebruary() != null)
		{
			sb.append("<cronFebruary>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCronFebruary().toString()));
			sb.append("</cronFebruary>");		
		}
		if (this.isIsSimpleCron() != null)
		{
			sb.append("<isSimpleCron>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsSimpleCron().toString()));
			sb.append("</isSimpleCron>");		
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
			DnaBactchJob domainObject = getDnaBactchJobfromXML(itemEl, factory, domMap);

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
			DnaBactchJob domainObject = getDnaBactchJobfromXML(itemEl, factory, domMap);

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
		
	public static DnaBactchJob getDnaBactchJobfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getDnaBactchJobfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static DnaBactchJob getDnaBactchJobfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!DnaBactchJob.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!DnaBactchJob.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the DnaBactchJob class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (DnaBactchJob)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(DnaBactchJob.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		DnaBactchJob ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (DnaBactchJob)factory.getImportedDomainObject(DnaBactchJob.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new DnaBactchJob();
		}
		String keyClassName = "DnaBactchJob";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (DnaBactchJob)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, DnaBactchJob obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("name");
		if(fldEl != null)
		{	
    		obj.setName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("creationDate");
		if(fldEl != null)
		{	
    		obj.setCreationDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("triggerFrecuency");
		if(fldEl != null)
		{	
    		obj.setTriggerFrecuency(new String(fldEl.getTextTrim()));	
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
		fldEl = el.element("numAppointmentsUpdated");
		if(fldEl != null)
		{	
    		obj.setNumAppointmentsUpdated(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("printAgentTo");
		if(fldEl != null)
		{	
    		obj.setPrintAgentTo(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("jobDetail");
		if(fldEl != null)
		{	
    		obj.setJobDetail(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("cron");
		if(fldEl != null)
		{	
    		obj.setCron(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("cronFebruary");
		if(fldEl != null)
		{	
    		obj.setCronFebruary(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isSimpleCron");
		if(fldEl != null)
		{	
    		obj.setIsSimpleCron(new Boolean(fldEl.getTextTrim()));	
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
		public static final String CreationDate = "creationDate";
		public static final String TriggerFrecuency = "triggerFrecuency";
		public static final String LastRun = "lastRun";
		public static final String NextRun = "nextRun";
		public static final String NumAppointmentsUpdated = "numAppointmentsUpdated";
		public static final String PrintAgentTo = "printAgentTo";
		public static final String JobDetail = "jobDetail";
		public static final String Cron = "cron";
		public static final String CronFebruary = "cronFebruary";
		public static final String IsSimpleCron = "isSimpleCron";
	}
}

