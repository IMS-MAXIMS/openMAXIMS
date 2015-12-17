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
package ims.scheduling.domain.objects;

/**
 * 
 * @author Barbara Worwood
 * Generated.
 */


public class ProfileRipple extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1090100026;
	private static final long serialVersionUID = 1090100026L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** When was the Profile Ripple Requested */
	private java.util.Date dateTimeRequested;
	/** From what date should we update sessions */
	private java.util.Date effectiveFromDate;
	/** Profile Start Time */
	private String startTime;
	/** Profile End Time */
	private String endTime;
	/** ListOwners
	  * Collection of ims.scheduling.domain.objects.Profile_ListOwner.
	  */
	private java.util.Set listOwners;
	/** Cancellation Reason */
	private ims.domain.lookups.LookupInstance cancellationReason;
	/** Slots set to Inactive
	  * Collection of ims.scheduling.domain.objects.Profile_Slot.
	  */
	private java.util.Set inactiveSlots;
	/** New Slots added to Profile
	  * Collection of ims.scheduling.domain.objects.Profile_Slot.
	  */
	private java.util.Set newSlots;
	/** When did the ripple to sessions occur */
	private java.util.Date dateTimeActivated;
	/** Number of Session affected by the ripple */
	private Integer numberOfSessions;
	/** Profile that was updated */
	private ims.scheduling.domain.objects.Sch_Profile profile;
	/** Is this an active request */
	private Boolean active;
	/** Holds any resulting errors or messages following ripple */
	private String details;
	/** Profile Name */
	private String name;
	/** Profile Description */
	private String description;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ProfileRipple (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ProfileRipple ()
    {
    	super();
    }
    public ProfileRipple (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.scheduling.domain.objects.ProfileRipple.class;
	}


	public java.util.Date getDateTimeRequested() {
		return dateTimeRequested;
	}
	public void setDateTimeRequested(java.util.Date dateTimeRequested) {
		this.dateTimeRequested = dateTimeRequested;
	}

	public java.util.Date getEffectiveFromDate() {
		return effectiveFromDate;
	}
	public void setEffectiveFromDate(java.util.Date effectiveFromDate) {
		this.effectiveFromDate = effectiveFromDate;
	}

	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public java.util.Set getListOwners() {
		if ( null == listOwners ) {
			listOwners = new java.util.HashSet();
		}
		return listOwners;
	}
	public void setListOwners(java.util.Set paramValue) {
		this.listOwners = paramValue;
	}

	public ims.domain.lookups.LookupInstance getCancellationReason() {
		return cancellationReason;
	}
	public void setCancellationReason(ims.domain.lookups.LookupInstance cancellationReason) {
		this.cancellationReason = cancellationReason;
	}

	public java.util.Set getInactiveSlots() {
		if ( null == inactiveSlots ) {
			inactiveSlots = new java.util.HashSet();
		}
		return inactiveSlots;
	}
	public void setInactiveSlots(java.util.Set paramValue) {
		this.inactiveSlots = paramValue;
	}

	public java.util.Set getNewSlots() {
		if ( null == newSlots ) {
			newSlots = new java.util.HashSet();
		}
		return newSlots;
	}
	public void setNewSlots(java.util.Set paramValue) {
		this.newSlots = paramValue;
	}

	public java.util.Date getDateTimeActivated() {
		return dateTimeActivated;
	}
	public void setDateTimeActivated(java.util.Date dateTimeActivated) {
		this.dateTimeActivated = dateTimeActivated;
	}

	public Integer getNumberOfSessions() {
		return numberOfSessions;
	}
	public void setNumberOfSessions(Integer numberOfSessions) {
		this.numberOfSessions = numberOfSessions;
	}

	public ims.scheduling.domain.objects.Sch_Profile getProfile() {
		return profile;
	}
	public void setProfile(ims.scheduling.domain.objects.Sch_Profile profile) {
		this.profile = profile;
	}

	public Boolean isActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		if ( null != details && details.length() > 2000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for details. Tried to set value: "+
				details);
		}
		this.details = details;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		if ( null != name && name.length() > 100 ) {
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
		
		auditStr.append("\r\n*dateTimeRequested* :");
		auditStr.append(dateTimeRequested);
	    auditStr.append("; ");
		auditStr.append("\r\n*effectiveFromDate* :");
		auditStr.append(effectiveFromDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*startTime* :");
		auditStr.append(startTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*endTime* :");
		auditStr.append(endTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*listOwners* :");
		if (listOwners != null)
		{
			java.util.Iterator it5 = listOwners.iterator();
			int i5=0;
			while (it5.hasNext())
			{
				if (i5 > 0)
					auditStr.append(",");
				ims.scheduling.domain.objects.Profile_ListOwner obj = (ims.scheduling.domain.objects.Profile_ListOwner)it5.next();
		if (obj != null)
		{
		   if (i5 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i5++;
		}
		if (i5 > 0)
			auditStr.append("] " + i5);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*cancellationReason* :");
		if (cancellationReason != null)
			auditStr.append(cancellationReason.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*inactiveSlots* :");
		if (inactiveSlots != null)
		{
			java.util.Iterator it7 = inactiveSlots.iterator();
			int i7=0;
			while (it7.hasNext())
			{
				if (i7 > 0)
					auditStr.append(",");
				ims.scheduling.domain.objects.Profile_Slot obj = (ims.scheduling.domain.objects.Profile_Slot)it7.next();
		if (obj != null)
		{
		   if (i7 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i7++;
		}
		if (i7 > 0)
			auditStr.append("] " + i7);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*newSlots* :");
		if (newSlots != null)
		{
			java.util.Iterator it8 = newSlots.iterator();
			int i8=0;
			while (it8.hasNext())
			{
				if (i8 > 0)
					auditStr.append(",");
				ims.scheduling.domain.objects.Profile_Slot obj = (ims.scheduling.domain.objects.Profile_Slot)it8.next();
		if (obj != null)
		{
		   if (i8 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i8++;
		}
		if (i8 > 0)
			auditStr.append("] " + i8);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*dateTimeActivated* :");
		auditStr.append(dateTimeActivated);
	    auditStr.append("; ");
		auditStr.append("\r\n*numberOfSessions* :");
		auditStr.append(numberOfSessions);
	    auditStr.append("; ");
		auditStr.append("\r\n*profile* :");
		if (profile != null)
		{
			auditStr.append(toShortClassName(profile));
				
		    auditStr.append(profile.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*active* :");
		auditStr.append(active);
	    auditStr.append("; ");
		auditStr.append("\r\n*details* :");
		auditStr.append(details);
	    auditStr.append("; ");
		auditStr.append("\r\n*name* :");
		auditStr.append(name);
	    auditStr.append("; ");
		auditStr.append("\r\n*description* :");
		auditStr.append(description);
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
		
		String keyClassName = "ProfileRipple";
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
		if (this.getDateTimeRequested() != null)
		{
			sb.append("<dateTimeRequested>");
			sb.append(new ims.framework.utils.DateTime(this.getDateTimeRequested()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateTimeRequested>");		
		}
		if (this.getEffectiveFromDate() != null)
		{
			sb.append("<effectiveFromDate>");
			sb.append(new ims.framework.utils.DateTime(this.getEffectiveFromDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</effectiveFromDate>");		
		}
		if (this.getStartTime() != null)
		{
			sb.append("<startTime>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getStartTime().toString()));
			sb.append("</startTime>");		
		}
		if (this.getEndTime() != null)
		{
			sb.append("<endTime>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getEndTime().toString()));
			sb.append("</endTime>");		
		}
		if (this.getListOwners() != null)
		{
			if (this.getListOwners().size() > 0 )
			{
			sb.append("<listOwners>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getListOwners(), domMap));
			sb.append("</listOwners>");		
			}
		}
		if (this.getCancellationReason() != null)
		{
			sb.append("<cancellationReason>");
			sb.append(this.getCancellationReason().toXMLString()); 
			sb.append("</cancellationReason>");		
		}
		if (this.getInactiveSlots() != null)
		{
			if (this.getInactiveSlots().size() > 0 )
			{
			sb.append("<inactiveSlots>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getInactiveSlots(), domMap));
			sb.append("</inactiveSlots>");		
			}
		}
		if (this.getNewSlots() != null)
		{
			if (this.getNewSlots().size() > 0 )
			{
			sb.append("<newSlots>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getNewSlots(), domMap));
			sb.append("</newSlots>");		
			}
		}
		if (this.getDateTimeActivated() != null)
		{
			sb.append("<dateTimeActivated>");
			sb.append(new ims.framework.utils.DateTime(this.getDateTimeActivated()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateTimeActivated>");		
		}
		if (this.getNumberOfSessions() != null)
		{
			sb.append("<numberOfSessions>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNumberOfSessions().toString()));
			sb.append("</numberOfSessions>");		
		}
		if (this.getProfile() != null)
		{
			sb.append("<profile>");
			sb.append(this.getProfile().toXMLString(domMap)); 	
			sb.append("</profile>");		
		}
		if (this.isActive() != null)
		{
			sb.append("<active>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isActive().toString()));
			sb.append("</active>");		
		}
		if (this.getDetails() != null)
		{
			sb.append("<details>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDetails().toString()));
			sb.append("</details>");		
		}
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
			ProfileRipple domainObject = getProfileRipplefromXML(itemEl, factory, domMap);

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
			ProfileRipple domainObject = getProfileRipplefromXML(itemEl, factory, domMap);

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
		
	public static ProfileRipple getProfileRipplefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getProfileRipplefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ProfileRipple getProfileRipplefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ProfileRipple.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ProfileRipple.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ProfileRipple class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ProfileRipple)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ProfileRipple.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ProfileRipple ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ProfileRipple)factory.getImportedDomainObject(ProfileRipple.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ProfileRipple();
		}
		String keyClassName = "ProfileRipple";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ProfileRipple)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ProfileRipple obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("dateTimeRequested");
		if(fldEl != null)
		{	
    		obj.setDateTimeRequested(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("effectiveFromDate");
		if(fldEl != null)
		{	
    		obj.setEffectiveFromDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("startTime");
		if(fldEl != null)
		{	
    		obj.setStartTime(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("endTime");
		if(fldEl != null)
		{	
    		obj.setEndTime(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("listOwners");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setListOwners(ims.scheduling.domain.objects.Profile_ListOwner.fromSetXMLString(fldEl, factory, obj.getListOwners(), domMap));
		}
		fldEl = el.element("cancellationReason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCancellationReason(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("inactiveSlots");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setInactiveSlots(ims.scheduling.domain.objects.Profile_Slot.fromSetXMLString(fldEl, factory, obj.getInactiveSlots(), domMap));
		}
		fldEl = el.element("newSlots");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setNewSlots(ims.scheduling.domain.objects.Profile_Slot.fromSetXMLString(fldEl, factory, obj.getNewSlots(), domMap));
		}
		fldEl = el.element("dateTimeActivated");
		if(fldEl != null)
		{	
    		obj.setDateTimeActivated(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("numberOfSessions");
		if(fldEl != null)
		{	
    		obj.setNumberOfSessions(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("profile");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setProfile(ims.scheduling.domain.objects.Sch_Profile.getSch_ProfilefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("active");
		if(fldEl != null)
		{	
    		obj.setActive(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("details");
		if(fldEl != null)
		{	
    		obj.setDetails(new String(fldEl.getTextTrim()));	
		}
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
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "listOwners"
		, "inactiveSlots"
		, "newSlots"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String DateTimeRequested = "dateTimeRequested";
		public static final String EffectiveFromDate = "effectiveFromDate";
		public static final String StartTime = "startTime";
		public static final String EndTime = "endTime";
		public static final String ListOwners = "listOwners";
		public static final String CancellationReason = "cancellationReason";
		public static final String InactiveSlots = "inactiveSlots";
		public static final String NewSlots = "newSlots";
		public static final String DateTimeActivated = "dateTimeActivated";
		public static final String NumberOfSessions = "numberOfSessions";
		public static final String Profile = "profile";
		public static final String Active = "active";
		public static final String Details = "details";
		public static final String Name = "name";
		public static final String Description = "description";
	}
}

