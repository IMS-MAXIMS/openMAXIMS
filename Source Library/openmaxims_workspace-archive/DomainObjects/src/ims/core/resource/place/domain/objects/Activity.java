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
package ims.core.resource.place.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class Activity extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1007100005;
	private static final long serialVersionUID = 1007100005L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Name */
	private String name;
	/** Description */
	private String description;
	/** Time Required (in minutes) */
	private Integer tmReq;
	/** Interval required (in hours) */
	private Integer intReq;
	/** Patient Required */
	private Boolean isPatReq;
	/** isScheduled */
	private Boolean isScheduled;
	/** isWorkQueue */
	private Boolean isWorkQueue;
	/** Active Indicator */
	private Boolean isActive;
	/** Activity Reason */
	private ims.domain.lookups.LookupInstance reason;
	/** ActivityImage */
	private ims.core.configuration.domain.objects.AppImage activityImage;
	/** Activity Status */
	private ims.domain.lookups.LookupInstance status;
	/** ActivityType */
	private ims.domain.lookups.LookupInstance activityType;
	/** SpecialRequirements
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List specialRequirements;
	/** CodeMappings
	  * Collection of ims.core.clinical.domain.objects.TaxonomyMap.
	  */
	private java.util.List codeMappings;
	/** First Appointment */
	private Boolean firstAppointment;
	/** Diagnostic */
	private Boolean diagnostic;
    public Activity (Integer id, int ver)
    {
    	super(id, ver);
    }
    public Activity ()
    {
    	super();
    }
    public Activity (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.resource.place.domain.objects.Activity.class;
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

	public Integer getTmReq() {
		return tmReq;
	}
	public void setTmReq(Integer tmReq) {
		this.tmReq = tmReq;
	}

	public Integer getIntReq() {
		return intReq;
	}
	public void setIntReq(Integer intReq) {
		this.intReq = intReq;
	}

	public Boolean isIsPatReq() {
		return isPatReq;
	}
	public void setIsPatReq(Boolean isPatReq) {
		this.isPatReq = isPatReq;
	}

	public Boolean isIsScheduled() {
		return isScheduled;
	}
	public void setIsScheduled(Boolean isScheduled) {
		this.isScheduled = isScheduled;
	}

	public Boolean isIsWorkQueue() {
		return isWorkQueue;
	}
	public void setIsWorkQueue(Boolean isWorkQueue) {
		this.isWorkQueue = isWorkQueue;
	}

	public Boolean isIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public ims.domain.lookups.LookupInstance getReason() {
		return reason;
	}
	public void setReason(ims.domain.lookups.LookupInstance reason) {
		this.reason = reason;
	}

	public ims.core.configuration.domain.objects.AppImage getActivityImage() {
		return activityImage;
	}
	public void setActivityImage(ims.core.configuration.domain.objects.AppImage activityImage) {
		this.activityImage = activityImage;
	}

	public ims.domain.lookups.LookupInstance getStatus() {
		return status;
	}
	public void setStatus(ims.domain.lookups.LookupInstance status) {
		this.status = status;
	}

	public ims.domain.lookups.LookupInstance getActivityType() {
		return activityType;
	}
	public void setActivityType(ims.domain.lookups.LookupInstance activityType) {
		this.activityType = activityType;
	}

	public java.util.List getSpecialRequirements() {
		if ( null == specialRequirements ) {
			specialRequirements = new java.util.ArrayList();
		}
		return specialRequirements;
	}
	public void setSpecialRequirements(java.util.List paramValue) {
		this.specialRequirements = paramValue;
	}

	public java.util.List getCodeMappings() {
		if ( null == codeMappings ) {
			codeMappings = new java.util.ArrayList();
		}
		return codeMappings;
	}
	public void setCodeMappings(java.util.List paramValue) {
		this.codeMappings = paramValue;
	}

	public Boolean isFirstAppointment() {
		return firstAppointment;
	}
	public void setFirstAppointment(Boolean firstAppointment) {
		this.firstAppointment = firstAppointment;
	}

	public Boolean isDiagnostic() {
		return diagnostic;
	}
	public void setDiagnostic(Boolean diagnostic) {
		this.diagnostic = diagnostic;
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
	// method generated based on 'activity_unq1' unique index.
	public static boolean recordExistForNameAndIsActiveAndActivityType(ims.domain.ILightweightDomainFactory factory,
		 String name
	,
	 Boolean isActive
	,
	 ims.domain.lookups.LookupInstance activityType
	)	
	{
		return recordExistForNameAndIsActiveAndActivityType(factory, name, isActive, activityType, null);
	}	

	// method generated based on 'activity_unq1' unique index.
	public static boolean recordExistForNameAndIsActiveAndActivityType(ims.domain.ILightweightDomainFactory factory,
		 String name
	,
	 Boolean isActive
	,
	 ims.domain.lookups.LookupInstance activityType
	, Integer recordId)	
	{
		String[] names = new String[3];
		Object[] values = new Object[3];
		StringBuffer hql = new StringBuffer();
		
		hql.append("from Activity c where ");
		hql.append(" c.name = :name ");
		names[0] = "name";
		values[0] = name;		
		hql.append(" and "); 
		hql.append(" c.isActive = :isActive ");
		names[1] = "isActive";
		values[1] = isActive;		
		hql.append(" and "); 
		hql.append(" c.activityType = :activityType ");
		names[2] = "activityType";
		values[2] = activityType;		
		if(recordId != null)
		{
			hql.append(" and c.id <> " + recordId);
		}
		
		return factory.count(hql.toString(), names, values) > 0;				
	}	

	// method generated based on 'activity_unq1' unique index.
	public static Activity getRecordByNameAndIsActiveAndActivityType(ims.domain.ILightweightDomainFactory factory,
	 String name
	,
	 Boolean isActive
	,
	 ims.domain.lookups.LookupInstance activityType
	)
	{
		String[] names = new String[3];
		Object[] values = new Object[3];
		StringBuffer hql = new StringBuffer();
		hql.append("from Activity c where ");
		hql.append(" c.name = :name ");
		names[0] = "name";
		values[0] = name;		
		hql.append(" and "); 
		hql.append(" c.isActive = :isActive ");
		names[1] = "isActive";
		values[1] = isActive;		
		hql.append(" and "); 
		hql.append(" c.activityType = :activityType ");
		names[2] = "activityType";
		values[2] = activityType;		
		java.util.List l = factory.find(hql.toString(), names, values);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. " + hql + " returned " + l.size() + " records. " );
		return (Activity)l.get(0);
	}

	public static Activity getActivityFromactivity_unq1(ims.domain.ILightweightDomainFactory factory,
	 String name
	,
	 Boolean isActive
	,
	 ims.domain.lookups.LookupInstance activityType
	)
	{
		String[] names = new String[3];
		Object[] values = new Object[3];
		StringBuffer hql = new StringBuffer();
		hql.append("from Activity c where ");
		hql.append(" c.name = :name ");
		names[0] = "name";
		values[0] = name;		
		hql.append(" and "); 
		hql.append(" c.isActive = :isActive ");
		names[1] = "isActive";
		values[1] = isActive;		
		hql.append(" and "); 
		hql.append(" c.activityType = :activityType ");
		names[2] = "activityType";
		values[2] = activityType;		
		java.util.List l = factory.find(hql.toString(), names, values);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. " + hql + " returned " + l.size() + " records. " );
		return (Activity)l.get(0);
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
		auditStr.append("\r\n*description* :");
		auditStr.append(description);
	    auditStr.append("; ");
		auditStr.append("\r\n*tmReq* :");
		auditStr.append(tmReq);
	    auditStr.append("; ");
		auditStr.append("\r\n*intReq* :");
		auditStr.append(intReq);
	    auditStr.append("; ");
		auditStr.append("\r\n*isPatReq* :");
		auditStr.append(isPatReq);
	    auditStr.append("; ");
		auditStr.append("\r\n*isScheduled* :");
		auditStr.append(isScheduled);
	    auditStr.append("; ");
		auditStr.append("\r\n*isWorkQueue* :");
		auditStr.append(isWorkQueue);
	    auditStr.append("; ");
		auditStr.append("\r\n*isActive* :");
		auditStr.append(isActive);
	    auditStr.append("; ");
		auditStr.append("\r\n*reason* :");
		if (reason != null)
			auditStr.append(reason.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*activityImage* :");
		if (activityImage != null)
		{
			auditStr.append(toShortClassName(activityImage));
				
		    auditStr.append(activityImage.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*status* :");
		if (status != null)
			auditStr.append(status.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*activityType* :");
		if (activityType != null)
			auditStr.append(activityType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*specialRequirements* :");
		if (specialRequirements != null)
		{
			java.util.Iterator it13 = specialRequirements.iterator();
			int i13=0;
			while (it13.hasNext())
			{
				if (i13 > 0)
					auditStr.append(",");
				ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)it13.next();
			auditStr.append(obj.getText());
			i13++;
		}
		if (i13 > 0)
			auditStr.append("] " + i13);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*codeMappings* :");
		if (codeMappings != null)
		{
		int i14=0;
		for (i14=0; i14<codeMappings.size(); i14++)
		{
			if (i14 > 0)
				auditStr.append(",");
			ims.core.clinical.domain.objects.TaxonomyMap obj = (ims.core.clinical.domain.objects.TaxonomyMap)codeMappings.get(i14);
		    if (obj != null)
			{
				if (i14 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i14 > 0)
			auditStr.append("] " + i14);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*firstAppointment* :");
		auditStr.append(firstAppointment);
	    auditStr.append("; ");
		auditStr.append("\r\n*diagnostic* :");
		auditStr.append(diagnostic);
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
		
		String keyClassName = "Activity";
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
		if (this.getDescription() != null)
		{
			sb.append("<description>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDescription().toString()));
			sb.append("</description>");		
		}
		if (this.getTmReq() != null)
		{
			sb.append("<tmReq>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTmReq().toString()));
			sb.append("</tmReq>");		
		}
		if (this.getIntReq() != null)
		{
			sb.append("<intReq>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getIntReq().toString()));
			sb.append("</intReq>");		
		}
		if (this.isIsPatReq() != null)
		{
			sb.append("<isPatReq>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsPatReq().toString()));
			sb.append("</isPatReq>");		
		}
		if (this.isIsScheduled() != null)
		{
			sb.append("<isScheduled>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsScheduled().toString()));
			sb.append("</isScheduled>");		
		}
		if (this.isIsWorkQueue() != null)
		{
			sb.append("<isWorkQueue>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsWorkQueue().toString()));
			sb.append("</isWorkQueue>");		
		}
		if (this.isIsActive() != null)
		{
			sb.append("<isActive>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsActive().toString()));
			sb.append("</isActive>");		
		}
		if (this.getReason() != null)
		{
			sb.append("<reason>");
			sb.append(this.getReason().toXMLString()); 
			sb.append("</reason>");		
		}
		if (this.getActivityImage() != null)
		{
			sb.append("<activityImage>");
			sb.append(this.getActivityImage().toXMLString(domMap)); 	
			sb.append("</activityImage>");		
		}
		if (this.getStatus() != null)
		{
			sb.append("<status>");
			sb.append(this.getStatus().toXMLString()); 
			sb.append("</status>");		
		}
		if (this.getActivityType() != null)
		{
			sb.append("<activityType>");
			sb.append(this.getActivityType().toXMLString()); 
			sb.append("</activityType>");		
		}
		if (this.getSpecialRequirements() != null)
		{
			if (this.getSpecialRequirements().size() > 0 )
			{
			sb.append("<specialRequirements>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getSpecialRequirements())); 
			sb.append("</specialRequirements>");		
			}
		}
		if (this.getCodeMappings() != null)
		{
			if (this.getCodeMappings().size() > 0 )
			{
			sb.append("<codeMappings>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getCodeMappings(), domMap));
			sb.append("</codeMappings>");		
			}
		}
		if (this.isFirstAppointment() != null)
		{
			sb.append("<firstAppointment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isFirstAppointment().toString()));
			sb.append("</firstAppointment>");		
		}
		if (this.isDiagnostic() != null)
		{
			sb.append("<diagnostic>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isDiagnostic().toString()));
			sb.append("</diagnostic>");		
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
			Activity domainObject = getActivityfromXML(itemEl, factory, domMap);

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
			Activity domainObject = getActivityfromXML(itemEl, factory, domMap);

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
		
	public static Activity getActivityfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getActivityfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static Activity getActivityfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!Activity.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!Activity.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the Activity class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (Activity)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(Activity.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		Activity ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (Activity)factory.getImportedDomainObject(Activity.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new Activity();
		}
		String keyClassName = "Activity";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (Activity)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, Activity obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("name");
		if(fldEl != null)
		{	
    		obj.setName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("description");
		if(fldEl != null)
		{	
    		obj.setDescription(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("tmReq");
		if(fldEl != null)
		{	
    		obj.setTmReq(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("intReq");
		if(fldEl != null)
		{	
    		obj.setIntReq(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isPatReq");
		if(fldEl != null)
		{	
    		obj.setIsPatReq(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isScheduled");
		if(fldEl != null)
		{	
    		obj.setIsScheduled(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isWorkQueue");
		if(fldEl != null)
		{	
    		obj.setIsWorkQueue(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isActive");
		if(fldEl != null)
		{	
    		obj.setIsActive(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("reason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReason(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("activityImage");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setActivityImage(ims.core.configuration.domain.objects.AppImage.getAppImagefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("status");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("activityType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setActivityType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("specialRequirements");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setSpecialRequirements(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getSpecialRequirements())); 
		}
		fldEl = el.element("codeMappings");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setCodeMappings(ims.core.clinical.domain.objects.TaxonomyMap.fromListXMLString(fldEl, factory, obj.getCodeMappings(), domMap));
		}
		fldEl = el.element("firstAppointment");
		if(fldEl != null)
		{	
    		obj.setFirstAppointment(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("diagnostic");
		if(fldEl != null)
		{	
    		obj.setDiagnostic(new Boolean(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "specialRequirements"
		, "codeMappings"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Name = "name";
		public static final String Description = "description";
		public static final String TmReq = "tmReq";
		public static final String IntReq = "intReq";
		public static final String IsPatReq = "isPatReq";
		public static final String IsScheduled = "isScheduled";
		public static final String IsWorkQueue = "isWorkQueue";
		public static final String IsActive = "isActive";
		public static final String Reason = "reason";
		public static final String ActivityImage = "activityImage";
		public static final String Status = "status";
		public static final String ActivityType = "activityType";
		public static final String SpecialRequirements = "specialRequirements";
		public static final String CodeMappings = "codeMappings";
		public static final String FirstAppointment = "firstAppointment";
		public static final String Diagnostic = "diagnostic";
	}
}

