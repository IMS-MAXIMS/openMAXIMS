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


public class Sch_Booking extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1055100006;
	private static final long serialVersionUID = 1055100006L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Patient */
	private ims.core.patient.domain.objects.Patient patient;
	/** BookingComments */
	private String bookingComments;
	/** Booking System Type */
	private ims.domain.lookups.LookupInstance bookingSysType;
	/** PriorDateOffered */
	private java.util.Date priorDateOffered;
	/** Transport Comments */
	private String transportComments;
	/** Patient Status */
	private ims.domain.lookups.LookupInstance patientStatus;
	/** Appointments
	  * Collection of ims.scheduling.domain.objects.Booking_Appointment.
	  */
	private java.util.Set appointments;
	/** FirstAppointment */
	private ims.scheduling.domain.objects.Booking_Appointment firstAppointment;
	/** LastAppointment */
	private ims.scheduling.domain.objects.Booking_Appointment lastAppointment;
	/** TransportArrangementsReq */
	private Boolean transportArrangementsReq;
	/** TransportReferances */
	private ims.scheduling.domain.objects.BookingTransportReferances transportReferances;
	/** SpecialRequirements */
	private ims.domain.lookups.LookupInstance specialRequirements;
	/** Unique Booking Reference Number */
	private String uBRN;
	/** Spine Data Services Referral ID e.g. GP */
	private String referrerSdsId;
	/** Spine Data Services Referral Role Id */
	private String referrerSdsRoleId;
	/** Spine Data Services Referral Organisation Id e.g. Practice */
	private String referrerSdsOrgId;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public Sch_Booking (Integer id, int ver)
    {
    	super(id, ver);
    }
    public Sch_Booking ()
    {
    	super();
    }
    public Sch_Booking (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.scheduling.domain.objects.Sch_Booking.class;
	}


	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public String getBookingComments() {
		return bookingComments;
	}
	public void setBookingComments(String bookingComments) {
		if ( null != bookingComments && bookingComments.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for bookingComments. Tried to set value: "+
				bookingComments);
		}
		this.bookingComments = bookingComments;
	}

	public ims.domain.lookups.LookupInstance getBookingSysType() {
		return bookingSysType;
	}
	public void setBookingSysType(ims.domain.lookups.LookupInstance bookingSysType) {
		this.bookingSysType = bookingSysType;
	}

	public java.util.Date getPriorDateOffered() {
		return priorDateOffered;
	}
	public void setPriorDateOffered(java.util.Date priorDateOffered) {
		this.priorDateOffered = priorDateOffered;
	}

	public String getTransportComments() {
		return transportComments;
	}
	public void setTransportComments(String transportComments) {
		if ( null != transportComments && transportComments.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for transportComments. Tried to set value: "+
				transportComments);
		}
		this.transportComments = transportComments;
	}

	public ims.domain.lookups.LookupInstance getPatientStatus() {
		return patientStatus;
	}
	public void setPatientStatus(ims.domain.lookups.LookupInstance patientStatus) {
		this.patientStatus = patientStatus;
	}

	public java.util.Set getAppointments() {
		if ( null == appointments ) {
			appointments = new java.util.HashSet();
		}
		return appointments;
	}
	public void setAppointments(java.util.Set paramValue) {
		this.appointments = paramValue;
	}

	public ims.scheduling.domain.objects.Booking_Appointment getFirstAppointment() {
		return firstAppointment;
	}
	public static java.util.List listSch_BookingByFirstAppointment(ims.domain.ILightweightDomainFactory factory, ims.scheduling.domain.objects.Booking_Appointment val)
	{
		String hql = "from Sch_Booking c where c.firstAppointment = :firstAppointment";		
		return factory.find(hql, new String[]{"firstAppointment"}, new Object[]{val});		
	}
	public void setFirstAppointment(ims.scheduling.domain.objects.Booking_Appointment firstAppointment) {
		this.firstAppointment = firstAppointment;
	}

	public ims.scheduling.domain.objects.Booking_Appointment getLastAppointment() {
		return lastAppointment;
	}
	public void setLastAppointment(ims.scheduling.domain.objects.Booking_Appointment lastAppointment) {
		this.lastAppointment = lastAppointment;
	}

	public Boolean isTransportArrangementsReq() {
		return transportArrangementsReq;
	}
	public void setTransportArrangementsReq(Boolean transportArrangementsReq) {
		this.transportArrangementsReq = transportArrangementsReq;
	}

	public ims.scheduling.domain.objects.BookingTransportReferances getTransportReferances() {
		return transportReferances;
	}
	public void setTransportReferances(ims.scheduling.domain.objects.BookingTransportReferances transportReferances) {
		this.transportReferances = transportReferances;
	}

	public ims.domain.lookups.LookupInstance getSpecialRequirements() {
		return specialRequirements;
	}
	public void setSpecialRequirements(ims.domain.lookups.LookupInstance specialRequirements) {
		this.specialRequirements = specialRequirements;
	}

	public String getUBRN() {
		return uBRN;
	}
	public void setUBRN(String uBRN) {
		if ( null != uBRN && uBRN.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for uBRN. Tried to set value: "+
				uBRN);
		}
		this.uBRN = uBRN;
	}

	public String getReferrerSdsId() {
		return referrerSdsId;
	}
	public void setReferrerSdsId(String referrerSdsId) {
		if ( null != referrerSdsId && referrerSdsId.length() > 50 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for referrerSdsId. Tried to set value: "+
				referrerSdsId);
		}
		this.referrerSdsId = referrerSdsId;
	}

	public String getReferrerSdsRoleId() {
		return referrerSdsRoleId;
	}
	public void setReferrerSdsRoleId(String referrerSdsRoleId) {
		if ( null != referrerSdsRoleId && referrerSdsRoleId.length() > 50 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for referrerSdsRoleId. Tried to set value: "+
				referrerSdsRoleId);
		}
		this.referrerSdsRoleId = referrerSdsRoleId;
	}

	public String getReferrerSdsOrgId() {
		return referrerSdsOrgId;
	}
	public void setReferrerSdsOrgId(String referrerSdsOrgId) {
		if ( null != referrerSdsOrgId && referrerSdsOrgId.length() > 50 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for referrerSdsOrgId. Tried to set value: "+
				referrerSdsOrgId);
		}
		this.referrerSdsOrgId = referrerSdsOrgId;
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
		
		auditStr.append("\r\n*patient* :");
		if (patient != null)
		{
			auditStr.append(toShortClassName(patient));
				
		    auditStr.append(patient.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*bookingComments* :");
		auditStr.append(bookingComments);
	    auditStr.append("; ");
		auditStr.append("\r\n*bookingSysType* :");
		if (bookingSysType != null)
			auditStr.append(bookingSysType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*priorDateOffered* :");
		auditStr.append(priorDateOffered);
	    auditStr.append("; ");
		auditStr.append("\r\n*transportComments* :");
		auditStr.append(transportComments);
	    auditStr.append("; ");
		auditStr.append("\r\n*patientStatus* :");
		if (patientStatus != null)
			auditStr.append(patientStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*appointments* :");
		if (appointments != null)
		{
			java.util.Iterator it7 = appointments.iterator();
			int i7=0;
			while (it7.hasNext())
			{
				if (i7 > 0)
					auditStr.append(",");
				ims.scheduling.domain.objects.Booking_Appointment obj = (ims.scheduling.domain.objects.Booking_Appointment)it7.next();
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
		auditStr.append("\r\n*firstAppointment* :");
		if (firstAppointment != null)
		{
			auditStr.append(toShortClassName(firstAppointment));
				
		    auditStr.append(firstAppointment.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*lastAppointment* :");
		if (lastAppointment != null)
		{
			auditStr.append(toShortClassName(lastAppointment));
				
		    auditStr.append(lastAppointment.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*transportArrangementsReq* :");
		auditStr.append(transportArrangementsReq);
	    auditStr.append("; ");
		auditStr.append("\r\n*transportReferances* :");
		if (transportReferances != null)
		{
			auditStr.append(toShortClassName(transportReferances));
				
		    auditStr.append(transportReferances.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*specialRequirements* :");
		if (specialRequirements != null)
			auditStr.append(specialRequirements.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*uBRN* :");
		auditStr.append(uBRN);
	    auditStr.append("; ");
		auditStr.append("\r\n*referrerSdsId* :");
		auditStr.append(referrerSdsId);
	    auditStr.append("; ");
		auditStr.append("\r\n*referrerSdsRoleId* :");
		auditStr.append(referrerSdsRoleId);
	    auditStr.append("; ");
		auditStr.append("\r\n*referrerSdsOrgId* :");
		auditStr.append(referrerSdsOrgId);
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
		
		String keyClassName = "Sch_Booking";
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
		if (this.getPatient() != null)
		{
			sb.append("<patient>");
			sb.append(this.getPatient().toXMLString(domMap)); 	
			sb.append("</patient>");		
		}
		if (this.getBookingComments() != null)
		{
			sb.append("<bookingComments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getBookingComments().toString()));
			sb.append("</bookingComments>");		
		}
		if (this.getBookingSysType() != null)
		{
			sb.append("<bookingSysType>");
			sb.append(this.getBookingSysType().toXMLString()); 
			sb.append("</bookingSysType>");		
		}
		if (this.getPriorDateOffered() != null)
		{
			sb.append("<priorDateOffered>");
			sb.append(new ims.framework.utils.DateTime(this.getPriorDateOffered()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</priorDateOffered>");		
		}
		if (this.getTransportComments() != null)
		{
			sb.append("<transportComments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTransportComments().toString()));
			sb.append("</transportComments>");		
		}
		if (this.getPatientStatus() != null)
		{
			sb.append("<patientStatus>");
			sb.append(this.getPatientStatus().toXMLString()); 
			sb.append("</patientStatus>");		
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
		if (this.getFirstAppointment() != null)
		{
			sb.append("<firstAppointment>");
			sb.append(this.getFirstAppointment().toXMLString(domMap)); 	
			sb.append("</firstAppointment>");		
		}
		if (this.getLastAppointment() != null)
		{
			sb.append("<lastAppointment>");
			sb.append(this.getLastAppointment().toXMLString(domMap)); 	
			sb.append("</lastAppointment>");		
		}
		if (this.isTransportArrangementsReq() != null)
		{
			sb.append("<transportArrangementsReq>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isTransportArrangementsReq().toString()));
			sb.append("</transportArrangementsReq>");		
		}
		if (this.getTransportReferances() != null)
		{
			sb.append("<transportReferances>");
			sb.append(this.getTransportReferances().toXMLString(domMap)); 	
			sb.append("</transportReferances>");		
		}
		if (this.getSpecialRequirements() != null)
		{
			sb.append("<specialRequirements>");
			sb.append(this.getSpecialRequirements().toXMLString()); 
			sb.append("</specialRequirements>");		
		}
		if (this.getUBRN() != null)
		{
			sb.append("<uBRN>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getUBRN().toString()));
			sb.append("</uBRN>");		
		}
		if (this.getReferrerSdsId() != null)
		{
			sb.append("<referrerSdsId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReferrerSdsId().toString()));
			sb.append("</referrerSdsId>");		
		}
		if (this.getReferrerSdsRoleId() != null)
		{
			sb.append("<referrerSdsRoleId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReferrerSdsRoleId().toString()));
			sb.append("</referrerSdsRoleId>");		
		}
		if (this.getReferrerSdsOrgId() != null)
		{
			sb.append("<referrerSdsOrgId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReferrerSdsOrgId().toString()));
			sb.append("</referrerSdsOrgId>");		
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
			Sch_Booking domainObject = getSch_BookingfromXML(itemEl, factory, domMap);

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
			Sch_Booking domainObject = getSch_BookingfromXML(itemEl, factory, domMap);

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
		
	public static Sch_Booking getSch_BookingfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getSch_BookingfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static Sch_Booking getSch_BookingfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!Sch_Booking.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!Sch_Booking.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the Sch_Booking class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (Sch_Booking)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(Sch_Booking.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		Sch_Booking ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (Sch_Booking)factory.getImportedDomainObject(Sch_Booking.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new Sch_Booking();
		}
		String keyClassName = "Sch_Booking";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (Sch_Booking)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, Sch_Booking obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("bookingComments");
		if(fldEl != null)
		{	
    		obj.setBookingComments(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("bookingSysType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setBookingSysType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("priorDateOffered");
		if(fldEl != null)
		{	
    		obj.setPriorDateOffered(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("transportComments");
		if(fldEl != null)
		{	
    		obj.setTransportComments(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("patientStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPatientStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("appointments");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setAppointments(ims.scheduling.domain.objects.Booking_Appointment.fromSetXMLString(fldEl, factory, obj.getAppointments(), domMap));
		}
		fldEl = el.element("firstAppointment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setFirstAppointment(ims.scheduling.domain.objects.Booking_Appointment.getBooking_AppointmentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("lastAppointment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setLastAppointment(ims.scheduling.domain.objects.Booking_Appointment.getBooking_AppointmentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("transportArrangementsReq");
		if(fldEl != null)
		{	
    		obj.setTransportArrangementsReq(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("transportReferances");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTransportReferances(ims.scheduling.domain.objects.BookingTransportReferances.getBookingTransportReferancesfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("specialRequirements");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSpecialRequirements(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("uBRN");
		if(fldEl != null)
		{	
    		obj.setUBRN(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("referrerSdsId");
		if(fldEl != null)
		{	
    		obj.setReferrerSdsId(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("referrerSdsRoleId");
		if(fldEl != null)
		{	
    		obj.setReferrerSdsRoleId(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("referrerSdsOrgId");
		if(fldEl != null)
		{	
    		obj.setReferrerSdsOrgId(new String(fldEl.getTextTrim()));	
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
		public static final String Patient = "patient";
		public static final String BookingComments = "bookingComments";
		public static final String BookingSysType = "bookingSysType";
		public static final String PriorDateOffered = "priorDateOffered";
		public static final String TransportComments = "transportComments";
		public static final String PatientStatus = "patientStatus";
		public static final String Appointments = "appointments";
		public static final String FirstAppointment = "firstAppointment";
		public static final String LastAppointment = "lastAppointment";
		public static final String TransportArrangementsReq = "transportArrangementsReq";
		public static final String TransportReferances = "transportReferances";
		public static final String SpecialRequirements = "specialRequirements";
		public static final String UBRN = "uBRN";
		public static final String ReferrerSdsId = "referrerSdsId";
		public static final String ReferrerSdsRoleId = "referrerSdsRoleId";
		public static final String ReferrerSdsOrgId = "referrerSdsOrgId";
	}
}

