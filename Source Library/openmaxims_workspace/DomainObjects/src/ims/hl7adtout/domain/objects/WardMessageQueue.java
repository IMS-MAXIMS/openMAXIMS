//#############################################################################
//#                                                                           #
//#  Copyright (C) <2015>  <IMS MAXIMS>                                       #
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
//#  IMS MAXIMS provides absolutely NO GUARANTEE OF THE CLINICAL SAFTEY of    #
//#  this program.  Users of this software do so entirely at their own risk.  #
//#  IMS MAXIMS only ensures the Clinical Safety of unaltered run-time        #
//#  software that it builds, deploys and maintains.                          #
//#                                                                           #
//#############################################################################
//#EOH
/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5589.25814)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated: 12/10/2015, 13:28
 *
 */
package ims.hl7adtout.domain.objects;

/**
 * 
 * @author Michael Noonan
 * Generated.
 */


public class WardMessageQueue extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1103100010;
	private static final long serialVersionUID = 1103100010L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private ims.core.admin.domain.objects.ProviderSystem providerSystem;
	private Boolean wasProcessed;
	private Boolean wasDiscarded;
	private String msgText;
	private String ackText;
	private String failureMsg;
	private ims.domain.lookups.LookupInstance messageStatus;
	private ims.domain.lookups.LookupInstance msgType;
	private ims.domain.lookups.LookupInstance queueType;
	private ims.core.resource.place.domain.objects.Location ward;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public WardMessageQueue (Integer id, int ver)
    {
    	super(id, ver);
    }
    public WardMessageQueue ()
    {
    	super();
    }
    public WardMessageQueue (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.hl7adtout.domain.objects.WardMessageQueue.class;
	}


	public ims.core.admin.domain.objects.ProviderSystem getProviderSystem() {
		return providerSystem;
	}
	public void setProviderSystem(ims.core.admin.domain.objects.ProviderSystem providerSystem) {
		this.providerSystem = providerSystem;
	}

	public Boolean isWasProcessed() {
		return wasProcessed;
	}
	public void setWasProcessed(Boolean wasProcessed) {
		this.wasProcessed = wasProcessed;
	}

	public Boolean isWasDiscarded() {
		return wasDiscarded;
	}
	public void setWasDiscarded(Boolean wasDiscarded) {
		this.wasDiscarded = wasDiscarded;
	}

	public String getMsgText() {
		return msgText;
	}
	public void setMsgText(String msgText) {
		this.msgText = msgText;
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

	public ims.domain.lookups.LookupInstance getMessageStatus() {
		return messageStatus;
	}
	public void setMessageStatus(ims.domain.lookups.LookupInstance messageStatus) {
		this.messageStatus = messageStatus;
	}

	public ims.domain.lookups.LookupInstance getMsgType() {
		return msgType;
	}
	public void setMsgType(ims.domain.lookups.LookupInstance msgType) {
		this.msgType = msgType;
	}

	public ims.domain.lookups.LookupInstance getQueueType() {
		return queueType;
	}
	public void setQueueType(ims.domain.lookups.LookupInstance queueType) {
		this.queueType = queueType;
	}

	public ims.core.resource.place.domain.objects.Location getWard() {
		return ward;
	}
	public void setWard(ims.core.resource.place.domain.objects.Location ward) {
		this.ward = ward;
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
		
		auditStr.append("\r\n*providerSystem* :");
		if (providerSystem != null)
		{
			auditStr.append(toShortClassName(providerSystem));
				
		    auditStr.append(providerSystem.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*wasProcessed* :");
		auditStr.append(wasProcessed);
	    auditStr.append("; ");
		auditStr.append("\r\n*wasDiscarded* :");
		auditStr.append(wasDiscarded);
	    auditStr.append("; ");
		auditStr.append("\r\n*msgText* :");
		auditStr.append(msgText);
	    auditStr.append("; ");
		auditStr.append("\r\n*ackText* :");
		auditStr.append(ackText);
	    auditStr.append("; ");
		auditStr.append("\r\n*failureMsg* :");
		auditStr.append(failureMsg);
	    auditStr.append("; ");
		auditStr.append("\r\n*messageStatus* :");
		if (messageStatus != null)
			auditStr.append(messageStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*msgType* :");
		if (msgType != null)
			auditStr.append(msgType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*queueType* :");
		if (queueType != null)
			auditStr.append(queueType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*ward* :");
		if (ward != null)
		{
			auditStr.append(toShortClassName(ward));
				
		    auditStr.append(ward.getId());
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
		
		String keyClassName = "WardMessageQueue";
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
		if (this.getProviderSystem() != null)
		{
			sb.append("<providerSystem>");
			sb.append(this.getProviderSystem().toXMLString(domMap)); 	
			sb.append("</providerSystem>");		
		}
		if (this.isWasProcessed() != null)
		{
			sb.append("<wasProcessed>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isWasProcessed().toString()));
			sb.append("</wasProcessed>");		
		}
		if (this.isWasDiscarded() != null)
		{
			sb.append("<wasDiscarded>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isWasDiscarded().toString()));
			sb.append("</wasDiscarded>");		
		}
		if (this.getMsgText() != null)
		{
			sb.append("<msgText>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMsgText().toString()));
			sb.append("</msgText>");		
		}
		if (this.getAckText() != null)
		{
			sb.append("<ackText>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAckText().toString()));
			sb.append("</ackText>");		
		}
		if (this.getFailureMsg() != null)
		{
			sb.append("<failureMsg>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getFailureMsg().toString()));
			sb.append("</failureMsg>");		
		}
		if (this.getMessageStatus() != null)
		{
			sb.append("<messageStatus>");
			sb.append(this.getMessageStatus().toXMLString()); 
			sb.append("</messageStatus>");		
		}
		if (this.getMsgType() != null)
		{
			sb.append("<msgType>");
			sb.append(this.getMsgType().toXMLString()); 
			sb.append("</msgType>");		
		}
		if (this.getQueueType() != null)
		{
			sb.append("<queueType>");
			sb.append(this.getQueueType().toXMLString()); 
			sb.append("</queueType>");		
		}
		if (this.getWard() != null)
		{
			sb.append("<ward>");
			sb.append(this.getWard().toXMLString(domMap)); 	
			sb.append("</ward>");		
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
			WardMessageQueue domainObject = getWardMessageQueuefromXML(itemEl, factory, domMap);

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
			WardMessageQueue domainObject = getWardMessageQueuefromXML(itemEl, factory, domMap);

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
		
	public static WardMessageQueue getWardMessageQueuefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getWardMessageQueuefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static WardMessageQueue getWardMessageQueuefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!WardMessageQueue.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!WardMessageQueue.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the WardMessageQueue class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (WardMessageQueue)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(WardMessageQueue.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		WardMessageQueue ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (WardMessageQueue)factory.getImportedDomainObject(WardMessageQueue.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new WardMessageQueue();
		}
		String keyClassName = "WardMessageQueue";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (WardMessageQueue)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, WardMessageQueue obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("providerSystem");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setProviderSystem(ims.core.admin.domain.objects.ProviderSystem.getProviderSystemfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("wasProcessed");
		if(fldEl != null)
		{	
    		obj.setWasProcessed(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("wasDiscarded");
		if(fldEl != null)
		{	
    		obj.setWasDiscarded(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("msgText");
		if(fldEl != null)
		{	
    		obj.setMsgText(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("ackText");
		if(fldEl != null)
		{	
    		obj.setAckText(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("failureMsg");
		if(fldEl != null)
		{	
    		obj.setFailureMsg(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("messageStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setMessageStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("msgType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setMsgType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("queueType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setQueueType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("ward");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setWard(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
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
		public static final String ProviderSystem = "providerSystem";
		public static final String WasProcessed = "wasProcessed";
		public static final String WasDiscarded = "wasDiscarded";
		public static final String MsgText = "msgText";
		public static final String AckText = "ackText";
		public static final String FailureMsg = "failureMsg";
		public static final String MessageStatus = "messageStatus";
		public static final String MsgType = "msgType";
		public static final String QueueType = "queueType";
		public static final String Ward = "ward";
	}
}

