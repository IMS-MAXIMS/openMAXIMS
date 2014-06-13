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
package ims.hl7.domain.objects;

/**
 * 
 * @author Barbara Worwood
 * Generated.
 */


public class HL7Outbound extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1106100001;
	private static final long serialVersionUID = 1106100001L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private ims.core.patient.domain.objects.Patient patient;
	private ims.core.admin.domain.objects.ProviderSystem providerSystem;
	private String hL7Message;
	/** Type within Category e.g. A12,  O02, M02 */
	private ims.domain.lookups.LookupInstance messageType;
	/** e.g. ADT, MFN, OCS */
	private ims.domain.lookups.LookupInstance messageCategory;
	/** Only filled when a message fails to send and this will record the error */
	private String failureMessage;
	private java.util.Date messageSentDateTime;
	/** Flag to determine whether the message was successfully sent  */
	private Boolean successfulOutcome;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public HL7Outbound (Integer id, int ver)
    {
    	super(id, ver);
    }
    public HL7Outbound ()
    {
    	super();
    }
    public HL7Outbound (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.hl7.domain.objects.HL7Outbound.class;
	}


	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public ims.core.admin.domain.objects.ProviderSystem getProviderSystem() {
		return providerSystem;
	}
	public void setProviderSystem(ims.core.admin.domain.objects.ProviderSystem providerSystem) {
		this.providerSystem = providerSystem;
	}

	public String getHL7Message() {
		return hL7Message;
	}
	public void setHL7Message(String hL7Message) {
		this.hL7Message = hL7Message;
	}

	public ims.domain.lookups.LookupInstance getMessageType() {
		return messageType;
	}
	public void setMessageType(ims.domain.lookups.LookupInstance messageType) {
		this.messageType = messageType;
	}

	public ims.domain.lookups.LookupInstance getMessageCategory() {
		return messageCategory;
	}
	public void setMessageCategory(ims.domain.lookups.LookupInstance messageCategory) {
		this.messageCategory = messageCategory;
	}

	public String getFailureMessage() {
		return failureMessage;
	}
	public void setFailureMessage(String failureMessage) {
		if ( null != failureMessage && failureMessage.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for failureMessage. Tried to set value: "+
				failureMessage);
		}
		this.failureMessage = failureMessage;
	}

	public java.util.Date getMessageSentDateTime() {
		return messageSentDateTime;
	}
	public void setMessageSentDateTime(java.util.Date messageSentDateTime) {
		this.messageSentDateTime = messageSentDateTime;
	}

	public Boolean isSuccessfulOutcome() {
		return successfulOutcome;
	}
	public void setSuccessfulOutcome(Boolean successfulOutcome) {
		this.successfulOutcome = successfulOutcome;
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
		auditStr.append("\r\n*providerSystem* :");
		if (providerSystem != null)
		{
			auditStr.append(toShortClassName(providerSystem));
				
		    auditStr.append(providerSystem.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*hL7Message* :");
		auditStr.append(hL7Message);
	    auditStr.append("; ");
		auditStr.append("\r\n*messageType* :");
		if (messageType != null)
			auditStr.append(messageType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*messageCategory* :");
		if (messageCategory != null)
			auditStr.append(messageCategory.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*failureMessage* :");
		auditStr.append(failureMessage);
	    auditStr.append("; ");
		auditStr.append("\r\n*messageSentDateTime* :");
		auditStr.append(messageSentDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*successfulOutcome* :");
		auditStr.append(successfulOutcome);
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
		
		String keyClassName = "HL7Outbound";
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
		if (this.getProviderSystem() != null)
		{
			sb.append("<providerSystem>");
			sb.append(this.getProviderSystem().toXMLString(domMap)); 	
			sb.append("</providerSystem>");		
		}
		if (this.getHL7Message() != null)
		{
			sb.append("<hL7Message>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getHL7Message().toString()));
			sb.append("</hL7Message>");		
		}
		if (this.getMessageType() != null)
		{
			sb.append("<messageType>");
			sb.append(this.getMessageType().toXMLString()); 
			sb.append("</messageType>");		
		}
		if (this.getMessageCategory() != null)
		{
			sb.append("<messageCategory>");
			sb.append(this.getMessageCategory().toXMLString()); 
			sb.append("</messageCategory>");		
		}
		if (this.getFailureMessage() != null)
		{
			sb.append("<failureMessage>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getFailureMessage().toString()));
			sb.append("</failureMessage>");		
		}
		if (this.getMessageSentDateTime() != null)
		{
			sb.append("<messageSentDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getMessageSentDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</messageSentDateTime>");		
		}
		if (this.isSuccessfulOutcome() != null)
		{
			sb.append("<successfulOutcome>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isSuccessfulOutcome().toString()));
			sb.append("</successfulOutcome>");		
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
			HL7Outbound domainObject = getHL7OutboundfromXML(itemEl, factory, domMap);

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
			HL7Outbound domainObject = getHL7OutboundfromXML(itemEl, factory, domMap);

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
		
	public static HL7Outbound getHL7OutboundfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getHL7OutboundfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static HL7Outbound getHL7OutboundfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!HL7Outbound.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!HL7Outbound.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the HL7Outbound class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (HL7Outbound)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(HL7Outbound.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		HL7Outbound ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (HL7Outbound)factory.getImportedDomainObject(HL7Outbound.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new HL7Outbound();
		}
		String keyClassName = "HL7Outbound";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (HL7Outbound)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, HL7Outbound obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("providerSystem");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setProviderSystem(ims.core.admin.domain.objects.ProviderSystem.getProviderSystemfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("hL7Message");
		if(fldEl != null)
		{	
    		obj.setHL7Message(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("messageType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setMessageType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("messageCategory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setMessageCategory(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("failureMessage");
		if(fldEl != null)
		{	
    		obj.setFailureMessage(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("messageSentDateTime");
		if(fldEl != null)
		{	
    		obj.setMessageSentDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("successfulOutcome");
		if(fldEl != null)
		{	
    		obj.setSuccessfulOutcome(new Boolean(fldEl.getTextTrim()));	
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
		public static final String ProviderSystem = "providerSystem";
		public static final String HL7Message = "hL7Message";
		public static final String MessageType = "messageType";
		public static final String MessageCategory = "messageCategory";
		public static final String FailureMessage = "failureMessage";
		public static final String MessageSentDateTime = "messageSentDateTime";
		public static final String SuccessfulOutcome = "successfulOutcome";
	}
}

