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
package ims.pathways.domain.objects;

/**
 * 
 * @author Barbara Worwood
 * Generated.
 */


public class PatientEvent extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1088100002;
	private static final long serialVersionUID = 1088100002L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private ims.core.patient.domain.objects.Patient patient;
	/** Can be either Internal or External */
	private ims.pathways.configuration.domain.objects.Event event;
	/** Event Description */
	private String description;
	private java.util.Date eventDateTime;
	/** Event Status - Active or Cancelled */
	private ims.domain.lookups.LookupInstance eventStatus;
	/** Id of the Message that created this Patient Event */
	private String messageId;
	/** The unique id to identify this event by an external system, may be null for non-pathway events */
	private Integer externalEventId;
	/** Journey this event relates to - could be null */
	private ims.pathways.domain.objects.PatientPathwayJourney journey;
	/** Patient Target this event relates to - could be null if no rkey or pathway id with message */
	private ims.pathways.domain.objects.PatientJourneyTarget patientTarget;
	/** External Event */
	private ims.pathways.configuration.domain.objects.ExternalEventMapping externalEvent;
	private ims.pathways.configuration.domain.objects.RTTEvent rttExternalEvent;
	/** Clinic Code */
	private String clinicCode;
	/** Specialty */
	private ims.domain.lookups.LookupInstance specialty;
	/** Consultant */
	private ims.core.resource.people.domain.objects.Hcp consultant;
	/** This date will be set by the interface when the linked event is scheduled - retrieves the scheduled date from the message */
	private java.util.Date scheduledDate;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PatientEvent (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PatientEvent ()
    {
    	super();
    }
    public PatientEvent (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.pathways.domain.objects.PatientEvent.class;
	}


	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public ims.pathways.configuration.domain.objects.Event getEvent() {
		return event;
	}
	public void setEvent(ims.pathways.configuration.domain.objects.Event event) {
		this.event = event;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		if ( null != description && description.length() > 2000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for description. Tried to set value: "+
				description);
		}
		this.description = description;
	}

	public java.util.Date getEventDateTime() {
		return eventDateTime;
	}
	public void setEventDateTime(java.util.Date eventDateTime) {
		this.eventDateTime = eventDateTime;
	}

	public ims.domain.lookups.LookupInstance getEventStatus() {
		return eventStatus;
	}
	public void setEventStatus(ims.domain.lookups.LookupInstance eventStatus) {
		this.eventStatus = eventStatus;
	}

	public String getMessageId() {
		return messageId;
	}
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public Integer getExternalEventId() {
		return externalEventId;
	}
	public void setExternalEventId(Integer externalEventId) {
		this.externalEventId = externalEventId;
	}

	public ims.pathways.domain.objects.PatientPathwayJourney getJourney() {
		return journey;
	}
	public void setJourney(ims.pathways.domain.objects.PatientPathwayJourney journey) {
		this.journey = journey;
	}

	public ims.pathways.domain.objects.PatientJourneyTarget getPatientTarget() {
		return patientTarget;
	}
	public void setPatientTarget(ims.pathways.domain.objects.PatientJourneyTarget patientTarget) {
		this.patientTarget = patientTarget;
	}

	public ims.pathways.configuration.domain.objects.ExternalEventMapping getExternalEvent() {
		return externalEvent;
	}
	public void setExternalEvent(ims.pathways.configuration.domain.objects.ExternalEventMapping externalEvent) {
		this.externalEvent = externalEvent;
	}

	public ims.pathways.configuration.domain.objects.RTTEvent getRttExternalEvent() {
		return rttExternalEvent;
	}
	public void setRttExternalEvent(ims.pathways.configuration.domain.objects.RTTEvent rttExternalEvent) {
		this.rttExternalEvent = rttExternalEvent;
	}

	public String getClinicCode() {
		return clinicCode;
	}
	public void setClinicCode(String clinicCode) {
		this.clinicCode = clinicCode;
	}

	public ims.domain.lookups.LookupInstance getSpecialty() {
		return specialty;
	}
	public void setSpecialty(ims.domain.lookups.LookupInstance specialty) {
		this.specialty = specialty;
	}

	public ims.core.resource.people.domain.objects.Hcp getConsultant() {
		return consultant;
	}
	public void setConsultant(ims.core.resource.people.domain.objects.Hcp consultant) {
		this.consultant = consultant;
	}

	public java.util.Date getScheduledDate() {
		return scheduledDate;
	}
	public void setScheduledDate(java.util.Date scheduledDate) {
		this.scheduledDate = scheduledDate;
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
		auditStr.append("\r\n*event* :");
		if (event != null)
		{
			auditStr.append(toShortClassName(event));
				
		    auditStr.append(event.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*description* :");
		auditStr.append(description);
	    auditStr.append("; ");
		auditStr.append("\r\n*eventDateTime* :");
		auditStr.append(eventDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*eventStatus* :");
		if (eventStatus != null)
			auditStr.append(eventStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*messageId* :");
		auditStr.append(messageId);
	    auditStr.append("; ");
		auditStr.append("\r\n*externalEventId* :");
		auditStr.append(externalEventId);
	    auditStr.append("; ");
		auditStr.append("\r\n*journey* :");
		if (journey != null)
		{
			auditStr.append(toShortClassName(journey));
				
		    auditStr.append(journey.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*patientTarget* :");
		if (patientTarget != null)
		{
			auditStr.append(toShortClassName(patientTarget));
				
		    auditStr.append(patientTarget.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*externalEvent* :");
		if (externalEvent != null)
		{
			auditStr.append(toShortClassName(externalEvent));
				
		    auditStr.append(externalEvent.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*rttExternalEvent* :");
		if (rttExternalEvent != null)
		{
			auditStr.append(toShortClassName(rttExternalEvent));
				
		    auditStr.append(rttExternalEvent.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*clinicCode* :");
		auditStr.append(clinicCode);
	    auditStr.append("; ");
		auditStr.append("\r\n*specialty* :");
		if (specialty != null)
			auditStr.append(specialty.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*consultant* :");
		if (consultant != null)
		{
			auditStr.append(toShortClassName(consultant));
				
		    auditStr.append(consultant.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*scheduledDate* :");
		auditStr.append(scheduledDate);
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
		
		String keyClassName = "PatientEvent";
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
		if (this.getEvent() != null)
		{
			sb.append("<event>");
			sb.append(this.getEvent().toXMLString(domMap)); 	
			sb.append("</event>");		
		}
		if (this.getDescription() != null)
		{
			sb.append("<description>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDescription().toString()));
			sb.append("</description>");		
		}
		if (this.getEventDateTime() != null)
		{
			sb.append("<eventDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getEventDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</eventDateTime>");		
		}
		if (this.getEventStatus() != null)
		{
			sb.append("<eventStatus>");
			sb.append(this.getEventStatus().toXMLString()); 
			sb.append("</eventStatus>");		
		}
		if (this.getMessageId() != null)
		{
			sb.append("<messageId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMessageId().toString()));
			sb.append("</messageId>");		
		}
		if (this.getExternalEventId() != null)
		{
			sb.append("<externalEventId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getExternalEventId().toString()));
			sb.append("</externalEventId>");		
		}
		if (this.getJourney() != null)
		{
			sb.append("<journey>");
			sb.append(this.getJourney().toXMLString(domMap)); 	
			sb.append("</journey>");		
		}
		if (this.getPatientTarget() != null)
		{
			sb.append("<patientTarget>");
			sb.append(this.getPatientTarget().toXMLString(domMap)); 	
			sb.append("</patientTarget>");		
		}
		if (this.getExternalEvent() != null)
		{
			sb.append("<externalEvent>");
			sb.append(this.getExternalEvent().toXMLString(domMap)); 	
			sb.append("</externalEvent>");		
		}
		if (this.getRttExternalEvent() != null)
		{
			sb.append("<rttExternalEvent>");
			sb.append(this.getRttExternalEvent().toXMLString(domMap)); 	
			sb.append("</rttExternalEvent>");		
		}
		if (this.getClinicCode() != null)
		{
			sb.append("<clinicCode>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getClinicCode().toString()));
			sb.append("</clinicCode>");		
		}
		if (this.getSpecialty() != null)
		{
			sb.append("<specialty>");
			sb.append(this.getSpecialty().toXMLString()); 
			sb.append("</specialty>");		
		}
		if (this.getConsultant() != null)
		{
			sb.append("<consultant>");
			sb.append(this.getConsultant().toXMLString(domMap)); 	
			sb.append("</consultant>");		
		}
		if (this.getScheduledDate() != null)
		{
			sb.append("<scheduledDate>");
			sb.append(new ims.framework.utils.DateTime(this.getScheduledDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</scheduledDate>");		
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
			PatientEvent domainObject = getPatientEventfromXML(itemEl, factory, domMap);

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
			PatientEvent domainObject = getPatientEventfromXML(itemEl, factory, domMap);

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
		
	public static PatientEvent getPatientEventfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPatientEventfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PatientEvent getPatientEventfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PatientEvent.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PatientEvent.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PatientEvent class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PatientEvent)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PatientEvent.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PatientEvent ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PatientEvent)factory.getImportedDomainObject(PatientEvent.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PatientEvent();
		}
		String keyClassName = "PatientEvent";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PatientEvent)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PatientEvent obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("event");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setEvent(ims.pathways.configuration.domain.objects.Event.getEventfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("description");
		if(fldEl != null)
		{	
    		obj.setDescription(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("eventDateTime");
		if(fldEl != null)
		{	
    		obj.setEventDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("eventStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setEventStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("messageId");
		if(fldEl != null)
		{	
    		obj.setMessageId(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("externalEventId");
		if(fldEl != null)
		{	
    		obj.setExternalEventId(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("journey");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setJourney(ims.pathways.domain.objects.PatientPathwayJourney.getPatientPathwayJourneyfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("patientTarget");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatientTarget(ims.pathways.domain.objects.PatientJourneyTarget.getPatientJourneyTargetfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("externalEvent");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setExternalEvent(ims.pathways.configuration.domain.objects.ExternalEventMapping.getExternalEventMappingfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("rttExternalEvent");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRttExternalEvent(ims.pathways.configuration.domain.objects.RTTEvent.getRTTEventfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("clinicCode");
		if(fldEl != null)
		{	
    		obj.setClinicCode(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("specialty");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSpecialty(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("consultant");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setConsultant(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("scheduledDate");
		if(fldEl != null)
		{	
    		obj.setScheduledDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
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
		public static final String Patient = "patient";
		public static final String Event = "event";
		public static final String Description = "description";
		public static final String EventDateTime = "eventDateTime";
		public static final String EventStatus = "eventStatus";
		public static final String MessageId = "messageId";
		public static final String ExternalEventId = "externalEventId";
		public static final String Journey = "journey";
		public static final String PatientTarget = "patientTarget";
		public static final String ExternalEvent = "externalEvent";
		public static final String RttExternalEvent = "rttExternalEvent";
		public static final String ClinicCode = "clinicCode";
		public static final String Specialty = "specialty";
		public static final String Consultant = "consultant";
		public static final String ScheduledDate = "scheduledDate";
	}
}

