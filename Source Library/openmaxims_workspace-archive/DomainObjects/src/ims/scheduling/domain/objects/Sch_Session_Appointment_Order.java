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


public class Sch_Session_Appointment_Order extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1090100012;
	private static final long serialVersionUID = 1090100012L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** ProfileSession */
	private ims.scheduling.domain.objects.Sch_Session session;
	/** Appointments
	  * Collection of ims.scheduling.domain.objects.Booking_Appointment.
	  */
	private java.util.List appointments;
	/** Is the list order finalised */
	private Boolean isFinalised;
	/** Finalised By */
	private ims.core.resource.people.domain.objects.MemberOfStaff finalisedBy;
	/** Finalised Date Time */
	private java.util.Date finalisedDateTime;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public Sch_Session_Appointment_Order (Integer id, int ver)
    {
    	super(id, ver);
    }
    public Sch_Session_Appointment_Order ()
    {
    	super();
    }
    public Sch_Session_Appointment_Order (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.scheduling.domain.objects.Sch_Session_Appointment_Order.class;
	}


	public ims.scheduling.domain.objects.Sch_Session getSession() {
		return session;
	}
	public static Sch_Session_Appointment_Order getSch_Session_Appointment_OrderFromSession(ims.domain.ILightweightDomainFactory factory, Integer id)
	{
		java.util.List l = factory.find("from Sch_Session_Appointment_Order c where c.session.id = " + id);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. Sch_Session_Appointment_Order.session.id = " + id + " returned " + l.size() + " records. " );
		return (Sch_Session_Appointment_Order)l.get(0);
	}
	public void setSession(ims.scheduling.domain.objects.Sch_Session session) {
		this.session = session;
	}

	public java.util.List getAppointments() {
		if ( null == appointments ) {
			appointments = new java.util.ArrayList();
		}
		return appointments;
	}
	public void setAppointments(java.util.List paramValue) {
		this.appointments = paramValue;
	}

	public Boolean isIsFinalised() {
		return isFinalised;
	}
	public void setIsFinalised(Boolean isFinalised) {
		this.isFinalised = isFinalised;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getFinalisedBy() {
		return finalisedBy;
	}
	public void setFinalisedBy(ims.core.resource.people.domain.objects.MemberOfStaff finalisedBy) {
		this.finalisedBy = finalisedBy;
	}

	public java.util.Date getFinalisedDateTime() {
		return finalisedDateTime;
	}
	public void setFinalisedDateTime(java.util.Date finalisedDateTime) {
		this.finalisedDateTime = finalisedDateTime;
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
		
		auditStr.append("\r\n*session* :");
		if (session != null)
		{
			auditStr.append(toShortClassName(session));
				
		    auditStr.append(session.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*appointments* :");
		if (appointments != null)
		{
		int i2=0;
		for (i2=0; i2<appointments.size(); i2++)
		{
			if (i2 > 0)
				auditStr.append(",");
			ims.scheduling.domain.objects.Booking_Appointment obj = (ims.scheduling.domain.objects.Booking_Appointment)appointments.get(i2);
		    if (obj != null)
			{
				if (i2 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i2 > 0)
			auditStr.append("] " + i2);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isFinalised* :");
		auditStr.append(isFinalised);
	    auditStr.append("; ");
		auditStr.append("\r\n*finalisedBy* :");
		if (finalisedBy != null)
		{
			auditStr.append(toShortClassName(finalisedBy));
				
		    auditStr.append(finalisedBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*finalisedDateTime* :");
		auditStr.append(finalisedDateTime);
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
		
		String keyClassName = "Sch_Session_Appointment_Order";
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
		if (this.getSession() != null)
		{
			sb.append("<session>");
			sb.append(this.getSession().toXMLString(domMap)); 	
			sb.append("</session>");		
		}
		if (this.getAppointments() != null)
		{
			if (this.getAppointments().size() > 0 )
			{
			sb.append("<appointments>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getAppointments(), domMap));
			sb.append("</appointments>");		
			}
		}
		if (this.isIsFinalised() != null)
		{
			sb.append("<isFinalised>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsFinalised().toString()));
			sb.append("</isFinalised>");		
		}
		if (this.getFinalisedBy() != null)
		{
			sb.append("<finalisedBy>");
			sb.append(this.getFinalisedBy().toXMLString(domMap)); 	
			sb.append("</finalisedBy>");		
		}
		if (this.getFinalisedDateTime() != null)
		{
			sb.append("<finalisedDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getFinalisedDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</finalisedDateTime>");		
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
			Sch_Session_Appointment_Order domainObject = getSch_Session_Appointment_OrderfromXML(itemEl, factory, domMap);

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
			Sch_Session_Appointment_Order domainObject = getSch_Session_Appointment_OrderfromXML(itemEl, factory, domMap);

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
		
	public static Sch_Session_Appointment_Order getSch_Session_Appointment_OrderfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getSch_Session_Appointment_OrderfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static Sch_Session_Appointment_Order getSch_Session_Appointment_OrderfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!Sch_Session_Appointment_Order.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!Sch_Session_Appointment_Order.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the Sch_Session_Appointment_Order class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (Sch_Session_Appointment_Order)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(Sch_Session_Appointment_Order.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		Sch_Session_Appointment_Order ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (Sch_Session_Appointment_Order)factory.getImportedDomainObject(Sch_Session_Appointment_Order.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new Sch_Session_Appointment_Order();
		}
		String keyClassName = "Sch_Session_Appointment_Order";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (Sch_Session_Appointment_Order)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, Sch_Session_Appointment_Order obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("session");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSession(ims.scheduling.domain.objects.Sch_Session.getSch_SessionfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("appointments");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setAppointments(ims.scheduling.domain.objects.Booking_Appointment.fromListXMLString(fldEl, factory, obj.getAppointments(), domMap));
		}
		fldEl = el.element("isFinalised");
		if(fldEl != null)
		{	
    		obj.setIsFinalised(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("finalisedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setFinalisedBy(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("finalisedDateTime");
		if(fldEl != null)
		{	
    		obj.setFinalisedDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "appointments"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Session = "session";
		public static final String Appointments = "appointments";
		public static final String IsFinalised = "isFinalised";
		public static final String FinalisedBy = "finalisedBy";
		public static final String FinalisedDateTime = "finalisedDateTime";
	}
}

