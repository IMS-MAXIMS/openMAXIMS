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
 * @author Neil McAnaspie
 * Generated.
 */


public class SessionTheatreTCISlot extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1090100017;
	private static final long serialVersionUID = 1090100017L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** To Come In Time */
	private String toComeInTime;
	/** isActive */
	private Boolean isActive;
	/** Profile Slot */
	private ims.scheduling.domain.objects.ProfileTheatreTCISlot profileSlot;
	/** Session Date & Time  */
	private java.util.Date sessDateTime;
	/** Ope, Cancelled, DNA */
	private ims.domain.lookups.LookupInstance status;
	/** Booking_Appointment for this slot */
	private ims.scheduling.domain.objects.Booking_Appointment appointment;
	private ims.domain.lookups.LookupInstance statusReason;
	/** History of Session Slot
	  * Collection of ims.scheduling.domain.objects.SessionSlotStatus.
	  */
	private java.util.Set statusReasonHistory;
	/** Link to parent Session */
	private ims.scheduling.domain.objects.Sch_Session session;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public SessionTheatreTCISlot (Integer id, int ver)
    {
    	super(id, ver);
    }
    public SessionTheatreTCISlot ()
    {
    	super();
    }
    public SessionTheatreTCISlot (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.scheduling.domain.objects.SessionTheatreTCISlot.class;
	}


	public String getToComeInTime() {
		return toComeInTime;
	}
	public void setToComeInTime(String toComeInTime) {
		this.toComeInTime = toComeInTime;
	}

	public Boolean isIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public ims.scheduling.domain.objects.ProfileTheatreTCISlot getProfileSlot() {
		return profileSlot;
	}
	public void setProfileSlot(ims.scheduling.domain.objects.ProfileTheatreTCISlot profileSlot) {
		this.profileSlot = profileSlot;
	}

	public java.util.Date getSessDateTime() {
		return sessDateTime;
	}
	public void setSessDateTime(java.util.Date sessDateTime) {
		this.sessDateTime = sessDateTime;
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

	public ims.scheduling.domain.objects.Sch_Session getSession() {
		return session;
	}
	public void setSession(ims.scheduling.domain.objects.Sch_Session session) {
		this.session = session;
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
		
		auditStr.append("\r\n*toComeInTime* :");
		auditStr.append(toComeInTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*isActive* :");
		auditStr.append(isActive);
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
			java.util.Iterator it8 = statusReasonHistory.iterator();
			int i8=0;
			while (it8.hasNext())
			{
				if (i8 > 0)
					auditStr.append(",");
				ims.scheduling.domain.objects.SessionSlotStatus obj = (ims.scheduling.domain.objects.SessionSlotStatus)it8.next();
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
		auditStr.append("\r\n*session* :");
		if (session != null)
		{
			auditStr.append(toShortClassName(session));
				
		    auditStr.append(session.getId());
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
		
		String keyClassName = "SessionTheatreTCISlot";
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
		if (this.getToComeInTime() != null)
		{
			sb.append("<toComeInTime>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getToComeInTime().toString()));
			sb.append("</toComeInTime>");		
		}
		if (this.isIsActive() != null)
		{
			sb.append("<isActive>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsActive().toString()));
			sb.append("</isActive>");		
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
		if (this.getSession() != null)
		{
			sb.append("<session>");
			sb.append(this.getSession().toXMLString(domMap)); 	
			sb.append("</session>");		
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
			SessionTheatreTCISlot domainObject = getSessionTheatreTCISlotfromXML(itemEl, factory, domMap);

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
			SessionTheatreTCISlot domainObject = getSessionTheatreTCISlotfromXML(itemEl, factory, domMap);

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
		
	public static SessionTheatreTCISlot getSessionTheatreTCISlotfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getSessionTheatreTCISlotfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static SessionTheatreTCISlot getSessionTheatreTCISlotfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!SessionTheatreTCISlot.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!SessionTheatreTCISlot.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the SessionTheatreTCISlot class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (SessionTheatreTCISlot)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(SessionTheatreTCISlot.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		SessionTheatreTCISlot ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (SessionTheatreTCISlot)factory.getImportedDomainObject(SessionTheatreTCISlot.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new SessionTheatreTCISlot();
		}
		String keyClassName = "SessionTheatreTCISlot";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (SessionTheatreTCISlot)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, SessionTheatreTCISlot obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("toComeInTime");
		if(fldEl != null)
		{	
    		obj.setToComeInTime(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isActive");
		if(fldEl != null)
		{	
    		obj.setIsActive(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("profileSlot");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setProfileSlot(ims.scheduling.domain.objects.ProfileTheatreTCISlot.getProfileTheatreTCISlotfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("sessDateTime");
		if(fldEl != null)
		{	
    		obj.setSessDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
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
		fldEl = el.element("session");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSession(ims.scheduling.domain.objects.Sch_Session.getSch_SessionfromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "statusReasonHistory"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String ToComeInTime = "toComeInTime";
		public static final String IsActive = "isActive";
		public static final String ProfileSlot = "profileSlot";
		public static final String SessDateTime = "sessDateTime";
		public static final String Status = "status";
		public static final String Appointment = "appointment";
		public static final String StatusReason = "statusReason";
		public static final String StatusReasonHistory = "statusReasonHistory";
		public static final String Session = "session";
	}
}

