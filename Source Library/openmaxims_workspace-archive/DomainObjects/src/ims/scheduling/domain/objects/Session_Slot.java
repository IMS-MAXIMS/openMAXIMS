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
 * @author Kevin O'Carroll
 * Generated.
 */


public class Session_Slot extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1055100016;
	private static final long serialVersionUID = 1055100016L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Activity */
	private ims.core.resource.place.domain.objects.Activity activity;
	/** StartTm */
	private String startTm;
	/** Duration(Min) */
	private Integer duration;
	/** Priority */
	private ims.domain.lookups.LookupInstance priority;
	/** isActive */
	private Boolean isActive;
	/** BookingSource (CabGw, Internal) */
	private ims.domain.lookups.LookupInstance bookingSource;
	/** DirectAccessSlot */
	private ims.domain.lookups.LookupInstance directAccessSlot;
	/** Directory of Services
	  * Collection of ims.scheduling.domain.objects.DirectoryOfServiceSessionSlot.
	  */
	private java.util.Set directoryOfServices;
	/** Date calculated during generation, when will this be dealloced from Choose and Book */
	private java.util.Date deallocDate;
	/** Profile Slot */
	private ims.scheduling.domain.objects.Profile_Slot profileSlot;
	/** Session Date & Time  */
	private java.util.Date sessDateTime;
	/** Instance Number of this generated session slot */
	private Integer instanceNo;
	/** Ope, Cancelled, DNA */
	private ims.domain.lookups.LookupInstance status;
	/** Booking_Appointment for this slot */
	private ims.scheduling.domain.objects.Booking_Appointment appointment;
	private ims.domain.lookups.LookupInstance statusReason;
	/** History of Session Slot
	  * Collection of ims.scheduling.domain.objects.SessionSlotStatus.
	  */
	private java.util.Set statusReasonHistory;
	/** Slot Responsibility */
	private ims.scheduling.domain.objects.Session_ListOwner slotResp;
	/** Link to parent Session */
	private ims.scheduling.domain.objects.Sch_Session session;
	/** 
	  * Collection of ims.core.clinical.domain.objects.ServiceFunction.
	  */
	private java.util.Set functions;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public Session_Slot (Integer id, int ver)
    {
    	super(id, ver);
    }
    public Session_Slot ()
    {
    	super();
    }
    public Session_Slot (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.scheduling.domain.objects.Session_Slot.class;
	}


	public ims.core.resource.place.domain.objects.Activity getActivity() {
		return activity;
	}
	public void setActivity(ims.core.resource.place.domain.objects.Activity activity) {
		this.activity = activity;
	}

	public String getStartTm() {
		return startTm;
	}
	public void setStartTm(String startTm) {
		this.startTm = startTm;
	}

	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public ims.domain.lookups.LookupInstance getPriority() {
		return priority;
	}
	public void setPriority(ims.domain.lookups.LookupInstance priority) {
		this.priority = priority;
	}

	public Boolean isIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public ims.domain.lookups.LookupInstance getBookingSource() {
		return bookingSource;
	}
	public void setBookingSource(ims.domain.lookups.LookupInstance bookingSource) {
		this.bookingSource = bookingSource;
	}

	public ims.domain.lookups.LookupInstance getDirectAccessSlot() {
		return directAccessSlot;
	}
	public void setDirectAccessSlot(ims.domain.lookups.LookupInstance directAccessSlot) {
		this.directAccessSlot = directAccessSlot;
	}

	public java.util.Set getDirectoryOfServices() {
		if ( null == directoryOfServices ) {
			directoryOfServices = new java.util.HashSet();
		}
		return directoryOfServices;
	}
	public void setDirectoryOfServices(java.util.Set paramValue) {
		this.directoryOfServices = paramValue;
	}

	public java.util.Date getDeallocDate() {
		return deallocDate;
	}
	public void setDeallocDate(java.util.Date deallocDate) {
		this.deallocDate = deallocDate;
	}

	public ims.scheduling.domain.objects.Profile_Slot getProfileSlot() {
		return profileSlot;
	}
	public void setProfileSlot(ims.scheduling.domain.objects.Profile_Slot profileSlot) {
		this.profileSlot = profileSlot;
	}

	public java.util.Date getSessDateTime() {
		return sessDateTime;
	}
	public void setSessDateTime(java.util.Date sessDateTime) {
		this.sessDateTime = sessDateTime;
	}

	public Integer getInstanceNo() {
		return instanceNo;
	}
	public void setInstanceNo(Integer instanceNo) {
		this.instanceNo = instanceNo;
	}

	public ims.domain.lookups.LookupInstance getStatus() {
		return status;
	}
	public void setStatus(ims.domain.lookups.LookupInstance status) {
		this.status = status;
	}

	public ims.scheduling.domain.objects.Booking_Appointment getAppointment() {
		return appointment;
	}
	public void setAppointment(ims.scheduling.domain.objects.Booking_Appointment appointment) {
		this.appointment = appointment;
	}

	public ims.domain.lookups.LookupInstance getStatusReason() {
		return statusReason;
	}
	public void setStatusReason(ims.domain.lookups.LookupInstance statusReason) {
		this.statusReason = statusReason;
	}

	public java.util.Set getStatusReasonHistory() {
		if ( null == statusReasonHistory ) {
			statusReasonHistory = new java.util.HashSet();
		}
		return statusReasonHistory;
	}
	public void setStatusReasonHistory(java.util.Set paramValue) {
		this.statusReasonHistory = paramValue;
	}

	public ims.scheduling.domain.objects.Session_ListOwner getSlotResp() {
		return slotResp;
	}
	public void setSlotResp(ims.scheduling.domain.objects.Session_ListOwner slotResp) {
		this.slotResp = slotResp;
	}

	public ims.scheduling.domain.objects.Sch_Session getSession() {
		return session;
	}
	public void setSession(ims.scheduling.domain.objects.Sch_Session session) {
		this.session = session;
	}

	public java.util.Set getFunctions() {
		if ( null == functions ) {
			functions = new java.util.HashSet();
		}
		return functions;
	}
	public void setFunctions(java.util.Set paramValue) {
		this.functions = paramValue;
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
		
		auditStr.append("\r\n*activity* :");
		if (activity != null)
		{
			auditStr.append(toShortClassName(activity));
				
		    auditStr.append(activity.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*startTm* :");
		auditStr.append(startTm);
	    auditStr.append("; ");
		auditStr.append("\r\n*duration* :");
		auditStr.append(duration);
	    auditStr.append("; ");
		auditStr.append("\r\n*priority* :");
		if (priority != null)
			auditStr.append(priority.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*isActive* :");
		auditStr.append(isActive);
	    auditStr.append("; ");
		auditStr.append("\r\n*bookingSource* :");
		if (bookingSource != null)
			auditStr.append(bookingSource.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*directAccessSlot* :");
		if (directAccessSlot != null)
			auditStr.append(directAccessSlot.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*directoryOfServices* :");
		if (directoryOfServices != null)
		{
			java.util.Iterator it8 = directoryOfServices.iterator();
			int i8=0;
			while (it8.hasNext())
			{
				if (i8 > 0)
					auditStr.append(",");
				ims.scheduling.domain.objects.DirectoryOfServiceSessionSlot obj = (ims.scheduling.domain.objects.DirectoryOfServiceSessionSlot)it8.next();
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
		auditStr.append("\r\n*deallocDate* :");
		auditStr.append(deallocDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*profileSlot* :");
		if (profileSlot != null)
		{
			auditStr.append(toShortClassName(profileSlot));
				
		    auditStr.append(profileSlot.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*sessDateTime* :");
		auditStr.append(sessDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*instanceNo* :");
		auditStr.append(instanceNo);
	    auditStr.append("; ");
		auditStr.append("\r\n*status* :");
		if (status != null)
			auditStr.append(status.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*appointment* :");
		if (appointment != null)
		{
			auditStr.append(toShortClassName(appointment));
				
		    auditStr.append(appointment.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*statusReason* :");
		if (statusReason != null)
			auditStr.append(statusReason.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*statusReasonHistory* :");
		if (statusReasonHistory != null)
		{
			java.util.Iterator it16 = statusReasonHistory.iterator();
			int i16=0;
			while (it16.hasNext())
			{
				if (i16 > 0)
					auditStr.append(",");
				ims.scheduling.domain.objects.SessionSlotStatus obj = (ims.scheduling.domain.objects.SessionSlotStatus)it16.next();
		if (obj != null)
		{
		   if (i16 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i16++;
		}
		if (i16 > 0)
			auditStr.append("] " + i16);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*slotResp* :");
		if (slotResp != null)
		{
			auditStr.append(toShortClassName(slotResp));
				
		    auditStr.append(slotResp.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*session* :");
		if (session != null)
		{
			auditStr.append(toShortClassName(session));
				
		    auditStr.append(session.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*functions* :");
		if (functions != null)
		{
			java.util.Iterator it19 = functions.iterator();
			int i19=0;
			while (it19.hasNext())
			{
				if (i19 > 0)
					auditStr.append(",");
				ims.core.clinical.domain.objects.ServiceFunction obj = (ims.core.clinical.domain.objects.ServiceFunction)it19.next();
		if (obj != null)
		{
		   if (i19 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i19++;
		}
		if (i19 > 0)
			auditStr.append("] " + i19);
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
		
		String keyClassName = "Session_Slot";
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
		if (this.getActivity() != null)
		{
			sb.append("<activity>");
			sb.append(this.getActivity().toXMLString(domMap)); 	
			sb.append("</activity>");		
		}
		if (this.getStartTm() != null)
		{
			sb.append("<startTm>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getStartTm().toString()));
			sb.append("</startTm>");		
		}
		if (this.getDuration() != null)
		{
			sb.append("<duration>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDuration().toString()));
			sb.append("</duration>");		
		}
		if (this.getPriority() != null)
		{
			sb.append("<priority>");
			sb.append(this.getPriority().toXMLString()); 
			sb.append("</priority>");		
		}
		if (this.isIsActive() != null)
		{
			sb.append("<isActive>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsActive().toString()));
			sb.append("</isActive>");		
		}
		if (this.getBookingSource() != null)
		{
			sb.append("<bookingSource>");
			sb.append(this.getBookingSource().toXMLString()); 
			sb.append("</bookingSource>");		
		}
		if (this.getDirectAccessSlot() != null)
		{
			sb.append("<directAccessSlot>");
			sb.append(this.getDirectAccessSlot().toXMLString()); 
			sb.append("</directAccessSlot>");		
		}
		if (this.getDirectoryOfServices() != null)
		{
			if (this.getDirectoryOfServices().size() > 0 )
			{
			sb.append("<directoryOfServices>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getDirectoryOfServices(), domMap));
			sb.append("</directoryOfServices>");		
			}
		}
		if (this.getDeallocDate() != null)
		{
			sb.append("<deallocDate>");
			sb.append(new ims.framework.utils.DateTime(this.getDeallocDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</deallocDate>");		
		}
		if (this.getProfileSlot() != null)
		{
			sb.append("<profileSlot>");
			sb.append(this.getProfileSlot().toXMLString(domMap)); 	
			sb.append("</profileSlot>");		
		}
		if (this.getSessDateTime() != null)
		{
			sb.append("<sessDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getSessDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</sessDateTime>");		
		}
		if (this.getInstanceNo() != null)
		{
			sb.append("<instanceNo>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getInstanceNo().toString()));
			sb.append("</instanceNo>");		
		}
		if (this.getStatus() != null)
		{
			sb.append("<status>");
			sb.append(this.getStatus().toXMLString()); 
			sb.append("</status>");		
		}
		if (this.getAppointment() != null)
		{
			sb.append("<appointment>");
			sb.append(this.getAppointment().toXMLString(domMap)); 	
			sb.append("</appointment>");		
		}
		if (this.getStatusReason() != null)
		{
			sb.append("<statusReason>");
			sb.append(this.getStatusReason().toXMLString()); 
			sb.append("</statusReason>");		
		}
		if (this.getStatusReasonHistory() != null)
		{
			if (this.getStatusReasonHistory().size() > 0 )
			{
			sb.append("<statusReasonHistory>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getStatusReasonHistory(), domMap));
			sb.append("</statusReasonHistory>");		
			}
		}
		if (this.getSlotResp() != null)
		{
			sb.append("<slotResp>");
			sb.append(this.getSlotResp().toXMLString(domMap)); 	
			sb.append("</slotResp>");		
		}
		if (this.getSession() != null)
		{
			sb.append("<session>");
			sb.append(this.getSession().toXMLString(domMap)); 	
			sb.append("</session>");		
		}
		if (this.getFunctions() != null)
		{
			if (this.getFunctions().size() > 0 )
			{
			sb.append("<functions>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getFunctions(), domMap));
			sb.append("</functions>");		
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
			Session_Slot domainObject = getSession_SlotfromXML(itemEl, factory, domMap);

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
			Session_Slot domainObject = getSession_SlotfromXML(itemEl, factory, domMap);

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
		
	public static Session_Slot getSession_SlotfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getSession_SlotfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static Session_Slot getSession_SlotfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!Session_Slot.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!Session_Slot.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the Session_Slot class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (Session_Slot)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(Session_Slot.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		Session_Slot ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (Session_Slot)factory.getImportedDomainObject(Session_Slot.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new Session_Slot();
		}
		String keyClassName = "Session_Slot";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (Session_Slot)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, Session_Slot obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("activity");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setActivity(ims.core.resource.place.domain.objects.Activity.getActivityfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("startTm");
		if(fldEl != null)
		{	
    		obj.setStartTm(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("duration");
		if(fldEl != null)
		{	
    		obj.setDuration(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("priority");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPriority(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("isActive");
		if(fldEl != null)
		{	
    		obj.setIsActive(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("bookingSource");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setBookingSource(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("directAccessSlot");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDirectAccessSlot(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("directoryOfServices");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setDirectoryOfServices(ims.scheduling.domain.objects.DirectoryOfServiceSessionSlot.fromSetXMLString(fldEl, factory, obj.getDirectoryOfServices(), domMap));
		}
		fldEl = el.element("deallocDate");
		if(fldEl != null)
		{	
    		obj.setDeallocDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("profileSlot");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setProfileSlot(ims.scheduling.domain.objects.Profile_Slot.getProfile_SlotfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("sessDateTime");
		if(fldEl != null)
		{	
    		obj.setSessDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("instanceNo");
		if(fldEl != null)
		{	
    		obj.setInstanceNo(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("status");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("appointment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAppointment(ims.scheduling.domain.objects.Booking_Appointment.getBooking_AppointmentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("statusReason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setStatusReason(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("statusReasonHistory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setStatusReasonHistory(ims.scheduling.domain.objects.SessionSlotStatus.fromSetXMLString(fldEl, factory, obj.getStatusReasonHistory(), domMap));
		}
		fldEl = el.element("slotResp");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSlotResp(ims.scheduling.domain.objects.Session_ListOwner.getSession_ListOwnerfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("session");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSession(ims.scheduling.domain.objects.Sch_Session.getSch_SessionfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("functions");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setFunctions(ims.core.clinical.domain.objects.ServiceFunction.fromSetXMLString(fldEl, factory, obj.getFunctions(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "directoryOfServices"
		, "statusReasonHistory"
		, "functions"
		};
	}

	/**
	buildCabMessage
	*/
public String buildCabMessage() 
{
	StringBuffer sb = new StringBuffer();
	
	sb.append("USRN:");
	if(this.directoryOfServices != null && this.directoryOfServices.size() > 0)		
	{
		java.util.Iterator it = this.directoryOfServices.iterator();
		while(it.hasNext())
		{
			DirectoryOfServiceSessionSlot doSlot = (DirectoryOfServiceSessionSlot)it.next();
			// wdev-5700 we want to notify slot cancellation for items where the ubrn is null
			// and if not an icab booking.
			// Only include this usrn if the associated ubrn is null
						// wdev-5726 only interested if this is published 
			if (doSlot.isIsPublished() != null && doSlot.isIsPublished().booleanValue() == true)
			{
				if (doSlot.getUBRN() == null || (getAppointment() != null && (getAppointment().isIsCABBooking() == null 
						|| getAppointment().isIsCABBooking().booleanValue() == false)))
					sb.append(doSlot.getUSRN());
			
				if(it.hasNext())
					sb.append(";");
			}
		}			
	}
	sb.append(";");	

	if (sb.toString().equals("USRN:;"))
		return ""; //WDEV-5818
	return sb.toString();
}

	/**
	getUBRN - Get the UBRN booked into this slot
	*/
public String getUBRN() 
	{
		// Return the ubrn for this slot - it can be found in the directoryofServices collection
		java.util.Iterator it = this.getDirectoryOfServices().iterator();
		while (it.hasNext())
		{
			ims.scheduling.domain.objects.DirectoryOfServiceSessionSlot dos = (DirectoryOfServiceSessionSlot) it.next();
			if (dos.getUBRN() != null)
				return dos.getUBRN();
		}
		return null;
	}

	/**
	clearUBRN - Used on cancel of an appointment
	*/
	public void clearUBRN()
	{
		// Clear the ubrn from the slot
		java.util.Iterator it = this.getDirectoryOfServices().iterator();
		while (it.hasNext())
		{
			ims.scheduling.domain.objects.DirectoryOfServiceSessionSlot dos = (DirectoryOfServiceSessionSlot) it.next();
			if (dos.getUBRN() != null)
				dos.setUBRN(null);
		}
	}

	/**
	Return the USRN for the given UBRN
	*/
public String getUSRNfromUBRN(String ubrn)
	{
		// Get the usrn associated with the given ubrn
		java.util.Iterator it = this.getDirectoryOfServices().iterator();
		while (it.hasNext())
		{
			ims.scheduling.domain.objects.DirectoryOfServiceSessionSlot dos = (DirectoryOfServiceSessionSlot) it.next();
			if (dos.getUBRN() != null && dos.getUBRN().equals(ubrn))
				return dos.getUSRN();
		}
		return null;
	}

	/**
	getDOSfromUBRN - Returns the directory of service for the given UBRN
	*/

public ims.scheduling.domain.objects.DirectoryofService getDOSfromUBRN(String ubrn)
{
	// Get the usrn associated with the given ubrn
	java.util.Iterator it = this.getDirectoryOfServices().iterator();
	while (it.hasNext())
	{
		ims.scheduling.domain.objects.DirectoryOfServiceSessionSlot dos = (DirectoryOfServiceSessionSlot) it.next();
		if (dos.getUBRN() != null && dos.getUBRN().equals(ubrn))
			return dos.getDirectoryOfService();
	}
	return null;
}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Activity = "activity";
		public static final String StartTm = "startTm";
		public static final String Duration = "duration";
		public static final String Priority = "priority";
		public static final String IsActive = "isActive";
		public static final String BookingSource = "bookingSource";
		public static final String DirectAccessSlot = "directAccessSlot";
		public static final String DirectoryOfServices = "directoryOfServices";
		public static final String DeallocDate = "deallocDate";
		public static final String ProfileSlot = "profileSlot";
		public static final String SessDateTime = "sessDateTime";
		public static final String InstanceNo = "instanceNo";
		public static final String Status = "status";
		public static final String Appointment = "appointment";
		public static final String StatusReason = "statusReason";
		public static final String StatusReasonHistory = "statusReasonHistory";
		public static final String SlotResp = "slotResp";
		public static final String Session = "session";
		public static final String Functions = "functions";
	}
}

