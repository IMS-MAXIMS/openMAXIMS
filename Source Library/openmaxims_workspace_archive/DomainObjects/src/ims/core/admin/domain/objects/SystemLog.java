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
package ims.core.admin.domain.objects;

/**
 * 
 * @author Marius Mihalec
 * Generated.
 */


public class SystemLog extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1004100037;
	private static final long serialVersionUID = 1004100037L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}
	@Override
	public boolean canNeverBeAudited()
	{
		return true;
	}

	/** Date and Time of the event */
	private java.util.Date eventDateTime;
	/** Event Type - Application, Reports, etc. */
	private Integer eventType;
	/** Event level - Information, Warning, Error, Fatal Error */
	private Integer eventLevel;
	/** The user that caused the event */
	private String user;
	/** Application that caused the event */
	private String source;
	/** Computer name from where the event was caused */
	private String computer;
	/** User Agent */
	private String userAgent;
	/** Session Id */
	private String sessionId;
	/** The event message */
	private String message;
	/** Application server */
	private String appServer;
    public SystemLog (Integer id, int ver)
    {
    	super(id, ver);
    }
    public SystemLog ()
    {
    	super();
    }
    public SystemLog (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.admin.domain.objects.SystemLog.class;
	}


	public java.util.Date getEventDateTime() {
		return eventDateTime;
	}
	public void setEventDateTime(java.util.Date eventDateTime) {
		this.eventDateTime = eventDateTime;
	}

	public Integer getEventType() {
		return eventType;
	}
	public void setEventType(Integer eventType) {
		this.eventType = eventType;
	}

	public Integer getEventLevel() {
		return eventLevel;
	}
	public void setEventLevel(Integer eventLevel) {
		this.eventLevel = eventLevel;
	}

	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		if ( null != user && user.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for user. Tried to set value: "+
				user);
		}
		this.user = user;
	}

	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		if ( null != source && source.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for source. Tried to set value: "+
				source);
		}
		this.source = source;
	}

	public String getComputer() {
		return computer;
	}
	public void setComputer(String computer) {
		if ( null != computer && computer.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for computer. Tried to set value: "+
				computer);
		}
		this.computer = computer;
	}

	public String getUserAgent() {
		return userAgent;
	}
	public void setUserAgent(String userAgent) {
		if ( null != userAgent && userAgent.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for userAgent. Tried to set value: "+
				userAgent);
		}
		this.userAgent = userAgent;
	}

	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		if ( null != sessionId && sessionId.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for sessionId. Tried to set value: "+
				sessionId);
		}
		this.sessionId = sessionId;
	}

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public String getAppServer() {
		return appServer;
	}
	public void setAppServer(String appServer) {
		if ( null != appServer && appServer.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for appServer. Tried to set value: "+
				appServer);
		}
		this.appServer = appServer;
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
		
		auditStr.append("\r\n*eventDateTime* :");
		auditStr.append(eventDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*eventType* :");
		auditStr.append(eventType);
	    auditStr.append("; ");
		auditStr.append("\r\n*eventLevel* :");
		auditStr.append(eventLevel);
	    auditStr.append("; ");
		auditStr.append("\r\n*user* :");
		auditStr.append(user);
	    auditStr.append("; ");
		auditStr.append("\r\n*source* :");
		auditStr.append(source);
	    auditStr.append("; ");
		auditStr.append("\r\n*computer* :");
		auditStr.append(computer);
	    auditStr.append("; ");
		auditStr.append("\r\n*userAgent* :");
		auditStr.append(userAgent);
	    auditStr.append("; ");
		auditStr.append("\r\n*sessionId* :");
		auditStr.append(sessionId);
	    auditStr.append("; ");
		auditStr.append("\r\n*message* :");
		auditStr.append(message);
	    auditStr.append("; ");
		auditStr.append("\r\n*appServer* :");
		auditStr.append(appServer);
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
		
		String keyClassName = "SystemLog";
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
		if (this.getEventDateTime() != null)
		{
			sb.append("<eventDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getEventDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</eventDateTime>");		
		}
		if (this.getEventType() != null)
		{
			sb.append("<eventType>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getEventType().toString()));
			sb.append("</eventType>");		
		}
		if (this.getEventLevel() != null)
		{
			sb.append("<eventLevel>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getEventLevel().toString()));
			sb.append("</eventLevel>");		
		}
		if (this.getUser() != null)
		{
			sb.append("<user>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getUser().toString()));
			sb.append("</user>");		
		}
		if (this.getSource() != null)
		{
			sb.append("<source>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSource().toString()));
			sb.append("</source>");		
		}
		if (this.getComputer() != null)
		{
			sb.append("<computer>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getComputer().toString()));
			sb.append("</computer>");		
		}
		if (this.getUserAgent() != null)
		{
			sb.append("<userAgent>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getUserAgent().toString()));
			sb.append("</userAgent>");		
		}
		if (this.getSessionId() != null)
		{
			sb.append("<sessionId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSessionId().toString()));
			sb.append("</sessionId>");		
		}
		if (this.getMessage() != null)
		{
			sb.append("<message>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMessage().toString()));
			sb.append("</message>");		
		}
		if (this.getAppServer() != null)
		{
			sb.append("<appServer>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAppServer().toString()));
			sb.append("</appServer>");		
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
			SystemLog domainObject = getSystemLogfromXML(itemEl, factory, domMap);

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
			SystemLog domainObject = getSystemLogfromXML(itemEl, factory, domMap);

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
		
	public static SystemLog getSystemLogfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getSystemLogfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static SystemLog getSystemLogfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!SystemLog.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!SystemLog.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the SystemLog class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (SystemLog)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(SystemLog.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		SystemLog ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (SystemLog)factory.getImportedDomainObject(SystemLog.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new SystemLog();
		}
		String keyClassName = "SystemLog";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (SystemLog)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, SystemLog obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("eventDateTime");
		if(fldEl != null)
		{	
    		obj.setEventDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("eventType");
		if(fldEl != null)
		{	
    		obj.setEventType(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("eventLevel");
		if(fldEl != null)
		{	
    		obj.setEventLevel(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("user");
		if(fldEl != null)
		{	
    		obj.setUser(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("source");
		if(fldEl != null)
		{	
    		obj.setSource(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("computer");
		if(fldEl != null)
		{	
    		obj.setComputer(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("userAgent");
		if(fldEl != null)
		{	
    		obj.setUserAgent(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("sessionId");
		if(fldEl != null)
		{	
    		obj.setSessionId(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("message");
		if(fldEl != null)
		{	
    		obj.setMessage(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("appServer");
		if(fldEl != null)
		{	
    		obj.setAppServer(new String(fldEl.getTextTrim()));	
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
		public static final String EventDateTime = "eventDateTime";
		public static final String EventType = "eventType";
		public static final String EventLevel = "eventLevel";
		public static final String User = "user";
		public static final String Source = "source";
		public static final String Computer = "computer";
		public static final String UserAgent = "userAgent";
		public static final String SessionId = "sessionId";
		public static final String Message = "message";
		public static final String AppServer = "appServer";
	}
}

