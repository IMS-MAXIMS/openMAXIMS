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
package ims.core.scheduler.domain.objects;

/**
 * 
 * @author Barbara Worwood
 * Generated.
 */


public class PatientApptDiary extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1055100003;
	private static final long serialVersionUID = 1055100003L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** The ID of the associated scheduler (dto) appointment */
	private Integer appointmentId;
	/** For ADT type bookings, the associated PasEvent */
	private ims.core.admin.pas.domain.objects.PASEvent pasEvent;
	/** Appointment Date */
	private java.util.Date apptDate;
	/** Appointment Start Time */
	private String startTime;
	/** Appointment End Time */
	private String endTime;
	/** Name of the Clinic */
	private String clinicName;
	/** Clinic if non-scheduler */
	private ims.core.resource.place.domain.objects.Clinic clinic;
	/** Source of diary information */
	private String source;
	/** Appointment Type - Scheduler (dto) = Action Activity, Pas (First or Repeat) */
	private String apptType;
	/** Patient who's appointment this is */
	private ims.core.patient.domain.objects.Patient patient;
	/** Current Appt Status */
	private String status;
	/** Date of this latest status point */
	private java.util.Date statusDate;
	/** Name of the person who booked the appointment */
	private String bookedBy;
	/** The Date the appt was booked */
	private java.util.Date bookedDate;
	/** DTO Patient Identifier */
	private Integer pkey;
	/** The ID of the associated scheduler (dto) appointment header */
	private Integer appointHeaderId;
	/** Boolean Active/Inactive flag */
	private Boolean active;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PatientApptDiary (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PatientApptDiary ()
    {
    	super();
    }
    public PatientApptDiary (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.scheduler.domain.objects.PatientApptDiary.class;
	}


	public Integer getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(Integer appointmentId) {
		this.appointmentId = appointmentId;
	}

	public ims.core.admin.pas.domain.objects.PASEvent getPasEvent() {
		return pasEvent;
	}
	public static java.util.List listPatientApptDiaryByPasEvent(ims.domain.ILightweightDomainFactory factory, ims.core.admin.pas.domain.objects.PASEvent val)
	{
		String hql = "from PatientApptDiary c where c.pasEvent = :pasEvent";		
		return factory.find(hql, new String[]{"pasEvent"}, new Object[]{val});		
	}
	public void setPasEvent(ims.core.admin.pas.domain.objects.PASEvent pasEvent) {
		this.pasEvent = pasEvent;
	}

	public java.util.Date getApptDate() {
		return apptDate;
	}
	public void setApptDate(java.util.Date apptDate) {
		this.apptDate = apptDate;
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

	public String getClinicName() {
		return clinicName;
	}
	public void setClinicName(String clinicName) {
		if ( null != clinicName && clinicName.length() > 50 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for clinicName. Tried to set value: "+
				clinicName);
		}
		this.clinicName = clinicName;
	}

	public ims.core.resource.place.domain.objects.Clinic getClinic() {
		return clinic;
	}
	public void setClinic(ims.core.resource.place.domain.objects.Clinic clinic) {
		this.clinic = clinic;
	}

	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		if ( null != source && source.length() > 50 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for source. Tried to set value: "+
				source);
		}
		this.source = source;
	}

	public String getApptType() {
		return apptType;
	}
	public void setApptType(String apptType) {
		if ( null != apptType && apptType.length() > 50 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for apptType. Tried to set value: "+
				apptType);
		}
		this.apptType = apptType;
	}

	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		if ( null != status && status.length() > 30 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for status. Tried to set value: "+
				status);
		}
		this.status = status;
	}

	public java.util.Date getStatusDate() {
		return statusDate;
	}
	public void setStatusDate(java.util.Date statusDate) {
		this.statusDate = statusDate;
	}

	public String getBookedBy() {
		return bookedBy;
	}
	public void setBookedBy(String bookedBy) {
		if ( null != bookedBy && bookedBy.length() > 50 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for bookedBy. Tried to set value: "+
				bookedBy);
		}
		this.bookedBy = bookedBy;
	}

	public java.util.Date getBookedDate() {
		return bookedDate;
	}
	public void setBookedDate(java.util.Date bookedDate) {
		this.bookedDate = bookedDate;
	}

	public Integer getPkey() {
		return pkey;
	}
	public void setPkey(Integer pkey) {
		this.pkey = pkey;
	}

	public Integer getAppointHeaderId() {
		return appointHeaderId;
	}
	public void setAppointHeaderId(Integer appointHeaderId) {
		this.appointHeaderId = appointHeaderId;
	}

	public Boolean isActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
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
		
		auditStr.append("\r\n*appointmentId* :");
		auditStr.append(appointmentId);
	    auditStr.append("; ");
		auditStr.append("\r\n*pasEvent* :");
		if (pasEvent != null)
		{
			auditStr.append(toShortClassName(pasEvent));
				
		    auditStr.append(pasEvent.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*apptDate* :");
		auditStr.append(apptDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*startTime* :");
		auditStr.append(startTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*endTime* :");
		auditStr.append(endTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*clinicName* :");
		auditStr.append(clinicName);
	    auditStr.append("; ");
		auditStr.append("\r\n*clinic* :");
		if (clinic != null)
		{
			auditStr.append(toShortClassName(clinic));
				
		    auditStr.append(clinic.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*source* :");
		auditStr.append(source);
	    auditStr.append("; ");
		auditStr.append("\r\n*apptType* :");
		auditStr.append(apptType);
	    auditStr.append("; ");
		auditStr.append("\r\n*patient* :");
		if (patient != null)
		{
			auditStr.append(toShortClassName(patient));
				
		    auditStr.append(patient.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*status* :");
		auditStr.append(status);
	    auditStr.append("; ");
		auditStr.append("\r\n*statusDate* :");
		auditStr.append(statusDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*bookedBy* :");
		auditStr.append(bookedBy);
	    auditStr.append("; ");
		auditStr.append("\r\n*bookedDate* :");
		auditStr.append(bookedDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*pkey* :");
		auditStr.append(pkey);
	    auditStr.append("; ");
		auditStr.append("\r\n*appointHeaderId* :");
		auditStr.append(appointHeaderId);
	    auditStr.append("; ");
		auditStr.append("\r\n*active* :");
		auditStr.append(active);
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
		
		String keyClassName = "PatientApptDiary";
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
		if (this.getAppointmentId() != null)
		{
			sb.append("<appointmentId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAppointmentId().toString()));
			sb.append("</appointmentId>");		
		}
		if (this.getPasEvent() != null)
		{
			sb.append("<pasEvent>");
			sb.append(this.getPasEvent().toXMLString(domMap)); 	
			sb.append("</pasEvent>");		
		}
		if (this.getApptDate() != null)
		{
			sb.append("<apptDate>");
			sb.append(new ims.framework.utils.DateTime(this.getApptDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</apptDate>");		
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
		if (this.getClinicName() != null)
		{
			sb.append("<clinicName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getClinicName().toString()));
			sb.append("</clinicName>");		
		}
		if (this.getClinic() != null)
		{
			sb.append("<clinic>");
			sb.append(this.getClinic().toXMLString(domMap)); 	
			sb.append("</clinic>");		
		}
		if (this.getSource() != null)
		{
			sb.append("<source>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSource().toString()));
			sb.append("</source>");		
		}
		if (this.getApptType() != null)
		{
			sb.append("<apptType>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getApptType().toString()));
			sb.append("</apptType>");		
		}
		if (this.getPatient() != null)
		{
			sb.append("<patient>");
			sb.append(this.getPatient().toXMLString(domMap)); 	
			sb.append("</patient>");		
		}
		if (this.getStatus() != null)
		{
			sb.append("<status>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getStatus().toString()));
			sb.append("</status>");		
		}
		if (this.getStatusDate() != null)
		{
			sb.append("<statusDate>");
			sb.append(new ims.framework.utils.DateTime(this.getStatusDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</statusDate>");		
		}
		if (this.getBookedBy() != null)
		{
			sb.append("<bookedBy>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getBookedBy().toString()));
			sb.append("</bookedBy>");		
		}
		if (this.getBookedDate() != null)
		{
			sb.append("<bookedDate>");
			sb.append(new ims.framework.utils.DateTime(this.getBookedDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</bookedDate>");		
		}
		if (this.getPkey() != null)
		{
			sb.append("<pkey>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPkey().toString()));
			sb.append("</pkey>");		
		}
		if (this.getAppointHeaderId() != null)
		{
			sb.append("<appointHeaderId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAppointHeaderId().toString()));
			sb.append("</appointHeaderId>");		
		}
		if (this.isActive() != null)
		{
			sb.append("<active>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isActive().toString()));
			sb.append("</active>");		
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
			PatientApptDiary domainObject = getPatientApptDiaryfromXML(itemEl, factory, domMap);

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
			PatientApptDiary domainObject = getPatientApptDiaryfromXML(itemEl, factory, domMap);

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
		
	public static PatientApptDiary getPatientApptDiaryfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPatientApptDiaryfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PatientApptDiary getPatientApptDiaryfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PatientApptDiary.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PatientApptDiary.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PatientApptDiary class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PatientApptDiary)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PatientApptDiary.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PatientApptDiary ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PatientApptDiary)factory.getImportedDomainObject(PatientApptDiary.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PatientApptDiary();
		}
		String keyClassName = "PatientApptDiary";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PatientApptDiary)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PatientApptDiary obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("appointmentId");
		if(fldEl != null)
		{	
    		obj.setAppointmentId(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("pasEvent");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPasEvent(ims.core.admin.pas.domain.objects.PASEvent.getPASEventfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("apptDate");
		if(fldEl != null)
		{	
    		obj.setApptDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
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
		fldEl = el.element("clinicName");
		if(fldEl != null)
		{	
    		obj.setClinicName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("clinic");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setClinic(ims.core.resource.place.domain.objects.Clinic.getClinicfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("source");
		if(fldEl != null)
		{	
    		obj.setSource(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("apptType");
		if(fldEl != null)
		{	
    		obj.setApptType(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("status");
		if(fldEl != null)
		{	
    		obj.setStatus(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("statusDate");
		if(fldEl != null)
		{	
    		obj.setStatusDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("bookedBy");
		if(fldEl != null)
		{	
    		obj.setBookedBy(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("bookedDate");
		if(fldEl != null)
		{	
    		obj.setBookedDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("pkey");
		if(fldEl != null)
		{	
    		obj.setPkey(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("appointHeaderId");
		if(fldEl != null)
		{	
    		obj.setAppointHeaderId(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("active");
		if(fldEl != null)
		{	
    		obj.setActive(new Boolean(fldEl.getTextTrim()));	
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
		public static final String AppointmentId = "appointmentId";
		public static final String PasEvent = "pasEvent";
		public static final String ApptDate = "apptDate";
		public static final String StartTime = "startTime";
		public static final String EndTime = "endTime";
		public static final String ClinicName = "clinicName";
		public static final String Clinic = "clinic";
		public static final String Source = "source";
		public static final String ApptType = "apptType";
		public static final String Patient = "patient";
		public static final String Status = "status";
		public static final String StatusDate = "statusDate";
		public static final String BookedBy = "bookedBy";
		public static final String BookedDate = "bookedDate";
		public static final String Pkey = "pkey";
		public static final String AppointHeaderId = "appointHeaderId";
		public static final String Active = "active";
	}
}

