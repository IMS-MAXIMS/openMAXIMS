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


public class Notifications extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1004100043;
	private static final long serialVersionUID = 1004100043L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return false;
	}
	@Override
	public boolean canNeverBeAudited()
	{
		return true;
	}

	/** Application User */
	private ims.core.configuration.domain.objects.AppUser user;
	/** Date and Time */
	private java.util.Date dateTime;
	/** Message */
	private String message;
	/** Priority */
	private Integer priority;
	/** Entity Type */
	private String entityType;
	/** Entity Id */
	private Integer entityId;
	/** Notification was seen by the user */
	private Boolean seen;
	/** Date and Time when the user have seen the notification */
	private java.util.Date seenAt;
	/** Source of notification */
	private String source;
	/** Specifies if the user was notified */
	private Boolean userNotified;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public Notifications (Integer id, int ver)
    {
    	super(id, ver);
    }
    public Notifications ()
    {
    	super();
    }
    public Notifications (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.admin.domain.objects.Notifications.class;
	}


	public ims.core.configuration.domain.objects.AppUser getUser() {
		return user;
	}
	public void setUser(ims.core.configuration.domain.objects.AppUser user) {
		this.user = user;
	}

	public java.util.Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(java.util.Date dateTime) {
		this.dateTime = dateTime;
	}

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public String getEntityType() {
		return entityType;
	}
	public void setEntityType(String entityType) {
		if ( null != entityType && entityType.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for entityType. Tried to set value: "+
				entityType);
		}
		this.entityType = entityType;
	}

	public Integer getEntityId() {
		return entityId;
	}
	public void setEntityId(Integer entityId) {
		this.entityId = entityId;
	}

	public Boolean isSeen() {
		return seen;
	}
	public void setSeen(Boolean seen) {
		this.seen = seen;
	}

	public java.util.Date getSeenAt() {
		return seenAt;
	}
	public void setSeenAt(java.util.Date seenAt) {
		this.seenAt = seenAt;
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

	public Boolean isUserNotified() {
		return userNotified;
	}
	public void setUserNotified(Boolean userNotified) {
		this.userNotified = userNotified;
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
		
		auditStr.append("\r\n*user* :");
		if (user != null)
		{
			auditStr.append(toShortClassName(user));
				
		    auditStr.append(user.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*dateTime* :");
		auditStr.append(dateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*message* :");
		auditStr.append(message);
	    auditStr.append("; ");
		auditStr.append("\r\n*priority* :");
		auditStr.append(priority);
	    auditStr.append("; ");
		auditStr.append("\r\n*entityType* :");
		auditStr.append(entityType);
	    auditStr.append("; ");
		auditStr.append("\r\n*entityId* :");
		auditStr.append(entityId);
	    auditStr.append("; ");
		auditStr.append("\r\n*seen* :");
		auditStr.append(seen);
	    auditStr.append("; ");
		auditStr.append("\r\n*seenAt* :");
		auditStr.append(seenAt);
	    auditStr.append("; ");
		auditStr.append("\r\n*source* :");
		auditStr.append(source);
	    auditStr.append("; ");
		auditStr.append("\r\n*userNotified* :");
		auditStr.append(userNotified);
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
		
		String keyClassName = "Notifications";
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
		if (this.getUser() != null)
		{
			sb.append("<user>");
			sb.append(this.getUser().toXMLString(domMap)); 	
			sb.append("</user>");		
		}
		if (this.getDateTime() != null)
		{
			sb.append("<dateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateTime>");		
		}
		if (this.getMessage() != null)
		{
			sb.append("<message>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMessage().toString()));
			sb.append("</message>");		
		}
		if (this.getPriority() != null)
		{
			sb.append("<priority>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPriority().toString()));
			sb.append("</priority>");		
		}
		if (this.getEntityType() != null)
		{
			sb.append("<entityType>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getEntityType().toString()));
			sb.append("</entityType>");		
		}
		if (this.getEntityId() != null)
		{
			sb.append("<entityId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getEntityId().toString()));
			sb.append("</entityId>");		
		}
		if (this.isSeen() != null)
		{
			sb.append("<seen>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isSeen().toString()));
			sb.append("</seen>");		
		}
		if (this.getSeenAt() != null)
		{
			sb.append("<seenAt>");
			sb.append(new ims.framework.utils.DateTime(this.getSeenAt()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</seenAt>");		
		}
		if (this.getSource() != null)
		{
			sb.append("<source>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSource().toString()));
			sb.append("</source>");		
		}
		if (this.isUserNotified() != null)
		{
			sb.append("<userNotified>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isUserNotified().toString()));
			sb.append("</userNotified>");		
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
			Notifications domainObject = getNotificationsfromXML(itemEl, factory, domMap);

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
			Notifications domainObject = getNotificationsfromXML(itemEl, factory, domMap);

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
		
	public static Notifications getNotificationsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getNotificationsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static Notifications getNotificationsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!Notifications.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!Notifications.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the Notifications class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (Notifications)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(Notifications.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		Notifications ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (Notifications)factory.getImportedDomainObject(Notifications.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new Notifications();
		}
		String keyClassName = "Notifications";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (Notifications)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, Notifications obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("user");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setUser(ims.core.configuration.domain.objects.AppUser.getAppUserfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("dateTime");
		if(fldEl != null)
		{	
    		obj.setDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("message");
		if(fldEl != null)
		{	
    		obj.setMessage(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("priority");
		if(fldEl != null)
		{	
    		obj.setPriority(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("entityType");
		if(fldEl != null)
		{	
    		obj.setEntityType(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("entityId");
		if(fldEl != null)
		{	
    		obj.setEntityId(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("seen");
		if(fldEl != null)
		{	
    		obj.setSeen(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("seenAt");
		if(fldEl != null)
		{	
    		obj.setSeenAt(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("source");
		if(fldEl != null)
		{	
    		obj.setSource(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("userNotified");
		if(fldEl != null)
		{	
    		obj.setUserNotified(new Boolean(fldEl.getTextTrim()));	
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
		public static final String User = "user";
		public static final String DateTime = "dateTime";
		public static final String Message = "message";
		public static final String Priority = "priority";
		public static final String EntityType = "entityType";
		public static final String EntityId = "entityId";
		public static final String Seen = "seen";
		public static final String SeenAt = "seenAt";
		public static final String Source = "source";
		public static final String UserNotified = "userNotified";
	}
}

