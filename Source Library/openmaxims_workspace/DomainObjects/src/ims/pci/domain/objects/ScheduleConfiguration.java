//#############################################################################
//#                                                                           #
//#  Copyright (C) <2015>  <IMS MAXIMS>                                       #
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
//#  IMS MAXIMS provides absolutely NO GUARANTEE OF THE CLINICAL SAFTEY of    #
//#  this program.  Users of this software do so entirely at their own risk.  #
//#  IMS MAXIMS only ensures the Clinical Safety of unaltered run-time        #
//#  software that it builds, deploys and maintains.                          #
//#                                                                           #
//#############################################################################
//#EOH
/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5589.25814)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated: 12/10/2015, 13:28
 *
 */
package ims.pci.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class ScheduleConfiguration extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1091100002;
	private static final long serialVersionUID = 1091100002L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** PCI Schedule Name */
	private String scheduleName;
	/** Schedule Type */
	private ims.domain.lookups.LookupInstance scheduleType;
	/** Start DOB */
	private java.util.Date startDob;
	/** End DOB */
	private java.util.Date endDob;
	/** Campaign Start Date */
	private java.util.Date campaignStartDate;
	/** Status */
	private ims.domain.lookups.LookupInstance status;
	/** Stages
	  * Collection of ims.pci.domain.objects.StageConfiguration.
	  */
	private java.util.List stages;
	/** Is this a default schedule TRUE or FALSE */
	private Boolean isDefaultSchedule;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ScheduleConfiguration (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ScheduleConfiguration ()
    {
    	super();
    }
    public ScheduleConfiguration (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.pci.domain.objects.ScheduleConfiguration.class;
	}


	public String getScheduleName() {
		return scheduleName;
	}
	public static ScheduleConfiguration getScheduleConfigurationFromScheduleName(ims.domain.ILightweightDomainFactory factory, String val)
	{
		String hql = "from ScheduleConfiguration c where c.scheduleName = :scheduleName";		
		java.util.List l = factory.find(hql, new String[]{"scheduleName"}, new Object[]{val});
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. ScheduleConfiguration.scheduleName = " + val + " returned " + l.size() + " records. " );
		return (ScheduleConfiguration)l.get(0);
	}
	public void setScheduleName(String scheduleName) {
		if ( null != scheduleName && scheduleName.length() > 75 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for scheduleName. Tried to set value: "+
				scheduleName);
		}
		this.scheduleName = scheduleName;
	}

	public ims.domain.lookups.LookupInstance getScheduleType() {
		return scheduleType;
	}
	public void setScheduleType(ims.domain.lookups.LookupInstance scheduleType) {
		this.scheduleType = scheduleType;
	}

	public java.util.Date getStartDob() {
		return startDob;
	}
	public void setStartDob(java.util.Date startDob) {
		this.startDob = startDob;
	}

	public java.util.Date getEndDob() {
		return endDob;
	}
	public void setEndDob(java.util.Date endDob) {
		this.endDob = endDob;
	}

	public java.util.Date getCampaignStartDate() {
		return campaignStartDate;
	}
	public void setCampaignStartDate(java.util.Date campaignStartDate) {
		this.campaignStartDate = campaignStartDate;
	}

	public ims.domain.lookups.LookupInstance getStatus() {
		return status;
	}
	public void setStatus(ims.domain.lookups.LookupInstance status) {
		this.status = status;
	}

	public java.util.List getStages() {
		if ( null == stages ) {
			stages = new java.util.ArrayList();
		}
		return stages;
	}
	public void setStages(java.util.List paramValue) {
		this.stages = paramValue;
	}

	public Boolean isIsDefaultSchedule() {
		return isDefaultSchedule;
	}
	public void setIsDefaultSchedule(Boolean isDefaultSchedule) {
		this.isDefaultSchedule = isDefaultSchedule;
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
		
		auditStr.append("\r\n*scheduleName* :");
		auditStr.append(scheduleName);
	    auditStr.append("; ");
		auditStr.append("\r\n*scheduleType* :");
		if (scheduleType != null)
			auditStr.append(scheduleType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*startDob* :");
		auditStr.append(startDob);
	    auditStr.append("; ");
		auditStr.append("\r\n*endDob* :");
		auditStr.append(endDob);
	    auditStr.append("; ");
		auditStr.append("\r\n*campaignStartDate* :");
		auditStr.append(campaignStartDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*status* :");
		if (status != null)
			auditStr.append(status.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*stages* :");
		if (stages != null)
		{
		int i7=0;
		for (i7=0; i7<stages.size(); i7++)
		{
			if (i7 > 0)
				auditStr.append(",");
			ims.pci.domain.objects.StageConfiguration obj = (ims.pci.domain.objects.StageConfiguration)stages.get(i7);
		    if (obj != null)
			{
				if (i7 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i7 > 0)
			auditStr.append("] " + i7);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isDefaultSchedule* :");
		auditStr.append(isDefaultSchedule);
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
		
		String keyClassName = "ScheduleConfiguration";
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
		if (this.getScheduleName() != null)
		{
			sb.append("<scheduleName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getScheduleName().toString()));
			sb.append("</scheduleName>");		
		}
		if (this.getScheduleType() != null)
		{
			sb.append("<scheduleType>");
			sb.append(this.getScheduleType().toXMLString()); 
			sb.append("</scheduleType>");		
		}
		if (this.getStartDob() != null)
		{
			sb.append("<startDob>");
			sb.append(new ims.framework.utils.DateTime(this.getStartDob()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</startDob>");		
		}
		if (this.getEndDob() != null)
		{
			sb.append("<endDob>");
			sb.append(new ims.framework.utils.DateTime(this.getEndDob()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</endDob>");		
		}
		if (this.getCampaignStartDate() != null)
		{
			sb.append("<campaignStartDate>");
			sb.append(new ims.framework.utils.DateTime(this.getCampaignStartDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</campaignStartDate>");		
		}
		if (this.getStatus() != null)
		{
			sb.append("<status>");
			sb.append(this.getStatus().toXMLString()); 
			sb.append("</status>");		
		}
		if (this.getStages() != null)
		{
			if (this.getStages().size() > 0 )
			{
			sb.append("<stages>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getStages(), domMap));
			sb.append("</stages>");		
			}
		}
		if (this.isIsDefaultSchedule() != null)
		{
			sb.append("<isDefaultSchedule>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsDefaultSchedule().toString()));
			sb.append("</isDefaultSchedule>");		
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
			ScheduleConfiguration domainObject = getScheduleConfigurationfromXML(itemEl, factory, domMap);

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
			ScheduleConfiguration domainObject = getScheduleConfigurationfromXML(itemEl, factory, domMap);

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
		
	public static ScheduleConfiguration getScheduleConfigurationfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getScheduleConfigurationfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ScheduleConfiguration getScheduleConfigurationfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ScheduleConfiguration.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ScheduleConfiguration.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ScheduleConfiguration class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ScheduleConfiguration)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ScheduleConfiguration.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ScheduleConfiguration ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ScheduleConfiguration)factory.getImportedDomainObject(ScheduleConfiguration.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ScheduleConfiguration();
		}
		String keyClassName = "ScheduleConfiguration";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ScheduleConfiguration)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ScheduleConfiguration obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("scheduleName");
		if(fldEl != null)
		{	
    		obj.setScheduleName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("scheduleType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setScheduleType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("startDob");
		if(fldEl != null)
		{	
    		obj.setStartDob(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("endDob");
		if(fldEl != null)
		{	
    		obj.setEndDob(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("campaignStartDate");
		if(fldEl != null)
		{	
    		obj.setCampaignStartDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("status");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("stages");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setStages(ims.pci.domain.objects.StageConfiguration.fromListXMLString(fldEl, factory, obj.getStages(), domMap));
		}
		fldEl = el.element("isDefaultSchedule");
		if(fldEl != null)
		{	
    		obj.setIsDefaultSchedule(new Boolean(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "stages"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String ScheduleName = "scheduleName";
		public static final String ScheduleType = "scheduleType";
		public static final String StartDob = "startDob";
		public static final String EndDob = "endDob";
		public static final String CampaignStartDate = "campaignStartDate";
		public static final String Status = "status";
		public static final String Stages = "stages";
		public static final String IsDefaultSchedule = "isDefaultSchedule";
	}
}

