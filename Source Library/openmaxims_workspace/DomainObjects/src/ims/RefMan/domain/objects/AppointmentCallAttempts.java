/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated: 16/04/2014, 12:34
 *
 */
package ims.RefMan.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class AppointmentCallAttempts extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1096100010;
	private static final long serialVersionUID = 1096100010L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Attempted Call Date Time */
	private java.util.Date callDateTime;
	/** Caller */
	private ims.core.resource.people.domain.objects.MemberOfStaff caller;
	/** Appointment Service */
	private ims.core.clinical.domain.objects.Service appointmentService;
	private ims.domain.lookups.LookupInstance reason;
	/** Caller Comments */
	private String callerComments;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public AppointmentCallAttempts (Integer id, int ver)
    {
    	super(id, ver);
    }
    public AppointmentCallAttempts ()
    {
    	super();
    }
    public AppointmentCallAttempts (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.RefMan.domain.objects.AppointmentCallAttempts.class;
	}


	public java.util.Date getCallDateTime() {
		return callDateTime;
	}
	public void setCallDateTime(java.util.Date callDateTime) {
		this.callDateTime = callDateTime;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getCaller() {
		return caller;
	}
	public void setCaller(ims.core.resource.people.domain.objects.MemberOfStaff caller) {
		this.caller = caller;
	}

	public ims.core.clinical.domain.objects.Service getAppointmentService() {
		return appointmentService;
	}
	public void setAppointmentService(ims.core.clinical.domain.objects.Service appointmentService) {
		this.appointmentService = appointmentService;
	}

	public ims.domain.lookups.LookupInstance getReason() {
		return reason;
	}
	public void setReason(ims.domain.lookups.LookupInstance reason) {
		this.reason = reason;
	}

	public String getCallerComments() {
		return callerComments;
	}
	public void setCallerComments(String callerComments) {
		if ( null != callerComments && callerComments.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for callerComments. Tried to set value: "+
				callerComments);
		}
		this.callerComments = callerComments;
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
		
		auditStr.append("\r\n*callDateTime* :");
		auditStr.append(callDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*caller* :");
		if (caller != null)
		{
			auditStr.append(toShortClassName(caller));
				
		    auditStr.append(caller.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*appointmentService* :");
		if (appointmentService != null)
		{
			auditStr.append(toShortClassName(appointmentService));
				
		    auditStr.append(appointmentService.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*reason* :");
		if (reason != null)
			auditStr.append(reason.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*callerComments* :");
		auditStr.append(callerComments);
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
		
		String keyClassName = "AppointmentCallAttempts";
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
		if (this.getCallDateTime() != null)
		{
			sb.append("<callDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getCallDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</callDateTime>");		
		}
		if (this.getCaller() != null)
		{
			sb.append("<caller>");
			sb.append(this.getCaller().toXMLString(domMap)); 	
			sb.append("</caller>");		
		}
		if (this.getAppointmentService() != null)
		{
			sb.append("<appointmentService>");
			sb.append(this.getAppointmentService().toXMLString(domMap)); 	
			sb.append("</appointmentService>");		
		}
		if (this.getReason() != null)
		{
			sb.append("<reason>");
			sb.append(this.getReason().toXMLString()); 
			sb.append("</reason>");		
		}
		if (this.getCallerComments() != null)
		{
			sb.append("<callerComments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCallerComments().toString()));
			sb.append("</callerComments>");		
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
			AppointmentCallAttempts domainObject = getAppointmentCallAttemptsfromXML(itemEl, factory, domMap);

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
			AppointmentCallAttempts domainObject = getAppointmentCallAttemptsfromXML(itemEl, factory, domMap);

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
		
	public static AppointmentCallAttempts getAppointmentCallAttemptsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getAppointmentCallAttemptsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static AppointmentCallAttempts getAppointmentCallAttemptsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!AppointmentCallAttempts.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!AppointmentCallAttempts.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the AppointmentCallAttempts class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (AppointmentCallAttempts)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(AppointmentCallAttempts.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		AppointmentCallAttempts ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (AppointmentCallAttempts)factory.getImportedDomainObject(AppointmentCallAttempts.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new AppointmentCallAttempts();
		}
		String keyClassName = "AppointmentCallAttempts";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (AppointmentCallAttempts)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, AppointmentCallAttempts obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("callDateTime");
		if(fldEl != null)
		{	
    		obj.setCallDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("caller");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCaller(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("appointmentService");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAppointmentService(ims.core.clinical.domain.objects.Service.getServicefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("reason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReason(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("callerComments");
		if(fldEl != null)
		{	
    		obj.setCallerComments(new String(fldEl.getTextTrim()));	
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
		public static final String CallDateTime = "callDateTime";
		public static final String Caller = "caller";
		public static final String AppointmentService = "appointmentService";
		public static final String Reason = "reason";
		public static final String CallerComments = "callerComments";
	}
}

