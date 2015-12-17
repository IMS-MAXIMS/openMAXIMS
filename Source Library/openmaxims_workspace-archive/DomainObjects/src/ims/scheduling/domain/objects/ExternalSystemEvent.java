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


public class ExternalSystemEvent extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1096100008;
	private static final long serialVersionUID = 1096100008L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Appointment */
	private ims.scheduling.domain.objects.Booking_Appointment appointment;
	private Boolean wasProcessed;
	private java.util.Date processedDateTime;
	private ims.domain.lookups.LookupInstance eventType;
	private ims.core.admin.domain.objects.ProviderSystem providerSystem;
	private ims.domain.lookups.LookupInstance messageStatus;
	/** The message text normally HL7 */
	private String msgText;
	/** Only filled when a message fails to send and this will record the error */
	private String failureMsg;
	/** Investigation */
	private ims.ocrr.orderingresults.domain.objects.OrderInvestigation investigation;
	private String ackText;
	/** If the External System Event is a Cancel appointment event then this holds the location of the old appointment */
	private ims.core.resource.place.domain.objects.Location cancelledAppointmentLocation;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ExternalSystemEvent (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ExternalSystemEvent ()
    {
    	super();
    }
    public ExternalSystemEvent (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.scheduling.domain.objects.ExternalSystemEvent.class;
	}


	public ims.scheduling.domain.objects.Booking_Appointment getAppointment() {
		return appointment;
	}
	public void setAppointment(ims.scheduling.domain.objects.Booking_Appointment appointment) {
		this.appointment = appointment;
	}

	public Boolean isWasProcessed() {
		return wasProcessed;
	}
	public void setWasProcessed(Boolean wasProcessed) {
		this.wasProcessed = wasProcessed;
	}

	public java.util.Date getProcessedDateTime() {
		return processedDateTime;
	}
	public void setProcessedDateTime(java.util.Date processedDateTime) {
		this.processedDateTime = processedDateTime;
	}

	public ims.domain.lookups.LookupInstance getEventType() {
		return eventType;
	}
	public void setEventType(ims.domain.lookups.LookupInstance eventType) {
		this.eventType = eventType;
	}

	public ims.core.admin.domain.objects.ProviderSystem getProviderSystem() {
		return providerSystem;
	}
	public void setProviderSystem(ims.core.admin.domain.objects.ProviderSystem providerSystem) {
		this.providerSystem = providerSystem;
	}

	public ims.domain.lookups.LookupInstance getMessageStatus() {
		return messageStatus;
	}
	public void setMessageStatus(ims.domain.lookups.LookupInstance messageStatus) {
		this.messageStatus = messageStatus;
	}

	public String getMsgText() {
		return msgText;
	}
	public void setMsgText(String msgText) {
		this.msgText = msgText;
	}

	public String getFailureMsg() {
		return failureMsg;
	}
	public void setFailureMsg(String failureMsg) {
		if ( null != failureMsg && failureMsg.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for failureMsg. Tried to set value: "+
				failureMsg);
		}
		this.failureMsg = failureMsg;
	}

	public ims.ocrr.orderingresults.domain.objects.OrderInvestigation getInvestigation() {
		return investigation;
	}
	public void setInvestigation(ims.ocrr.orderingresults.domain.objects.OrderInvestigation investigation) {
		this.investigation = investigation;
	}

	public String getAckText() {
		return ackText;
	}
	public void setAckText(String ackText) {
		if ( null != ackText && ackText.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for ackText. Tried to set value: "+
				ackText);
		}
		this.ackText = ackText;
	}

	public ims.core.resource.place.domain.objects.Location getCancelledAppointmentLocation() {
		return cancelledAppointmentLocation;
	}
	public void setCancelledAppointmentLocation(ims.core.resource.place.domain.objects.Location cancelledAppointmentLocation) {
		this.cancelledAppointmentLocation = cancelledAppointmentLocation;
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
		
		auditStr.append("\r\n*appointment* :");
		if (appointment != null)
		{
			auditStr.append(toShortClassName(appointment));
				
		    auditStr.append(appointment.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*wasProcessed* :");
		auditStr.append(wasProcessed);
	    auditStr.append("; ");
		auditStr.append("\r\n*processedDateTime* :");
		auditStr.append(processedDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*eventType* :");
		if (eventType != null)
			auditStr.append(eventType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*providerSystem* :");
		if (providerSystem != null)
		{
			auditStr.append(toShortClassName(providerSystem));
				
		    auditStr.append(providerSystem.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*messageStatus* :");
		if (messageStatus != null)
			auditStr.append(messageStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*msgText* :");
		auditStr.append(msgText);
	    auditStr.append("; ");
		auditStr.append("\r\n*failureMsg* :");
		auditStr.append(failureMsg);
	    auditStr.append("; ");
		auditStr.append("\r\n*investigation* :");
		if (investigation != null)
		{
			auditStr.append(toShortClassName(investigation));
				
		    auditStr.append(investigation.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*ackText* :");
		auditStr.append(ackText);
	    auditStr.append("; ");
		auditStr.append("\r\n*cancelledAppointmentLocation* :");
		if (cancelledAppointmentLocation != null)
		{
			auditStr.append(toShortClassName(cancelledAppointmentLocation));
				
		    auditStr.append(cancelledAppointmentLocation.getId());
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
		
		String keyClassName = "ExternalSystemEvent";
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
		if (this.getAppointment() != null)
		{
			sb.append("<appointment>");
			sb.append(this.getAppointment().toXMLString(domMap)); 	
			sb.append("</appointment>");		
		}
		if (this.isWasProcessed() != null)
		{
			sb.append("<wasProcessed>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isWasProcessed().toString()));
			sb.append("</wasProcessed>");		
		}
		if (this.getProcessedDateTime() != null)
		{
			sb.append("<processedDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getProcessedDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</processedDateTime>");		
		}
		if (this.getEventType() != null)
		{
			sb.append("<eventType>");
			sb.append(this.getEventType().toXMLString()); 
			sb.append("</eventType>");		
		}
		if (this.getProviderSystem() != null)
		{
			sb.append("<providerSystem>");
			sb.append(this.getProviderSystem().toXMLString(domMap)); 	
			sb.append("</providerSystem>");		
		}
		if (this.getMessageStatus() != null)
		{
			sb.append("<messageStatus>");
			sb.append(this.getMessageStatus().toXMLString()); 
			sb.append("</messageStatus>");		
		}
		if (this.getMsgText() != null)
		{
			sb.append("<msgText>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMsgText().toString()));
			sb.append("</msgText>");		
		}
		if (this.getFailureMsg() != null)
		{
			sb.append("<failureMsg>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getFailureMsg().toString()));
			sb.append("</failureMsg>");		
		}
		if (this.getInvestigation() != null)
		{
			sb.append("<investigation>");
			sb.append(this.getInvestigation().toXMLString(domMap)); 	
			sb.append("</investigation>");		
		}
		if (this.getAckText() != null)
		{
			sb.append("<ackText>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAckText().toString()));
			sb.append("</ackText>");		
		}
		if (this.getCancelledAppointmentLocation() != null)
		{
			sb.append("<cancelledAppointmentLocation>");
			sb.append(this.getCancelledAppointmentLocation().toXMLString(domMap)); 	
			sb.append("</cancelledAppointmentLocation>");		
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
			ExternalSystemEvent domainObject = getExternalSystemEventfromXML(itemEl, factory, domMap);

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
			ExternalSystemEvent domainObject = getExternalSystemEventfromXML(itemEl, factory, domMap);

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
		
	public static ExternalSystemEvent getExternalSystemEventfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getExternalSystemEventfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ExternalSystemEvent getExternalSystemEventfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ExternalSystemEvent.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ExternalSystemEvent.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ExternalSystemEvent class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ExternalSystemEvent)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ExternalSystemEvent.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ExternalSystemEvent ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ExternalSystemEvent)factory.getImportedDomainObject(ExternalSystemEvent.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ExternalSystemEvent();
		}
		String keyClassName = "ExternalSystemEvent";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ExternalSystemEvent)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ExternalSystemEvent obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("appointment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAppointment(ims.scheduling.domain.objects.Booking_Appointment.getBooking_AppointmentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("wasProcessed");
		if(fldEl != null)
		{	
    		obj.setWasProcessed(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("processedDateTime");
		if(fldEl != null)
		{	
    		obj.setProcessedDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("eventType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setEventType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("providerSystem");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setProviderSystem(ims.core.admin.domain.objects.ProviderSystem.getProviderSystemfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("messageStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setMessageStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("msgText");
		if(fldEl != null)
		{	
    		obj.setMsgText(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("failureMsg");
		if(fldEl != null)
		{	
    		obj.setFailureMsg(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("investigation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setInvestigation(ims.ocrr.orderingresults.domain.objects.OrderInvestigation.getOrderInvestigationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("ackText");
		if(fldEl != null)
		{	
    		obj.setAckText(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("cancelledAppointmentLocation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCancelledAppointmentLocation(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
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
		public static final String Appointment = "appointment";
		public static final String WasProcessed = "wasProcessed";
		public static final String ProcessedDateTime = "processedDateTime";
		public static final String EventType = "eventType";
		public static final String ProviderSystem = "providerSystem";
		public static final String MessageStatus = "messageStatus";
		public static final String MsgText = "msgText";
		public static final String FailureMsg = "failureMsg";
		public static final String Investigation = "investigation";
		public static final String AckText = "ackText";
		public static final String CancelledAppointmentLocation = "cancelledAppointmentLocation";
	}
}

