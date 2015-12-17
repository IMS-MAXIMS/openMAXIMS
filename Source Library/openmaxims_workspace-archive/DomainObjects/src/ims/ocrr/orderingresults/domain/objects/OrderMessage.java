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
package ims.ocrr.orderingresults.domain.objects;

/**
 * 
 * @author John MacEnri
 * Generated.
 */


public class OrderMessage extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1070100013;
	private static final long serialVersionUID = 1070100013L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** OrderDetails */
	private ims.ocrr.orderingresults.domain.objects.OcsOrderSession orderDetails;
	/** 
	  * Collection of ims.ocrr.orderingresults.domain.objects.OrderInvestigation.
	  */
	private java.util.Set investigations;
	private ims.domain.lookups.LookupInstance messageStatus;
	private ims.core.admin.domain.objects.ProviderSystem providerSystem;
	/** Placer Order Number  */
	private String placerOrdNum;
	private String hL7Message;
	/** Path or Rad */
	private ims.domain.lookups.LookupInstance orderCategory;
	/** Only filled when a message fails to send and this will record the error */
	private String failureMessage;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public OrderMessage (Integer id, int ver)
    {
    	super(id, ver);
    }
    public OrderMessage ()
    {
    	super();
    }
    public OrderMessage (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.ocrr.orderingresults.domain.objects.OrderMessage.class;
	}


	public ims.ocrr.orderingresults.domain.objects.OcsOrderSession getOrderDetails() {
		return orderDetails;
	}
	public void setOrderDetails(ims.ocrr.orderingresults.domain.objects.OcsOrderSession orderDetails) {
		this.orderDetails = orderDetails;
	}

	public java.util.Set getInvestigations() {
		if ( null == investigations ) {
			investigations = new java.util.HashSet();
		}
		return investigations;
	}
	public void setInvestigations(java.util.Set paramValue) {
		this.investigations = paramValue;
	}

	public ims.domain.lookups.LookupInstance getMessageStatus() {
		return messageStatus;
	}
	public void setMessageStatus(ims.domain.lookups.LookupInstance messageStatus) {
		this.messageStatus = messageStatus;
	}

	public ims.core.admin.domain.objects.ProviderSystem getProviderSystem() {
		return providerSystem;
	}
	public void setProviderSystem(ims.core.admin.domain.objects.ProviderSystem providerSystem) {
		this.providerSystem = providerSystem;
	}

	public String getPlacerOrdNum() {
		return placerOrdNum;
	}
	public void setPlacerOrdNum(String placerOrdNum) {
		if ( null != placerOrdNum && placerOrdNum.length() > 20 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for placerOrdNum. Tried to set value: "+
				placerOrdNum);
		}
		this.placerOrdNum = placerOrdNum;
	}

	public String getHL7Message() {
		return hL7Message;
	}
	public void setHL7Message(String hL7Message) {
		this.hL7Message = hL7Message;
	}

	public ims.domain.lookups.LookupInstance getOrderCategory() {
		return orderCategory;
	}
	public void setOrderCategory(ims.domain.lookups.LookupInstance orderCategory) {
		this.orderCategory = orderCategory;
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
	// method generated based on 'order_msg_unq1' unique index.
	public static boolean recordExistForPlacerOrdNumAndOrderCategory(ims.domain.ILightweightDomainFactory factory,
		 String placerOrdNum
	,
	 ims.domain.lookups.LookupInstance orderCategory
	)	
	{
		return recordExistForPlacerOrdNumAndOrderCategory(factory, placerOrdNum, orderCategory, null);
	}	

	// method generated based on 'order_msg_unq1' unique index.
	public static boolean recordExistForPlacerOrdNumAndOrderCategory(ims.domain.ILightweightDomainFactory factory,
		 String placerOrdNum
	,
	 ims.domain.lookups.LookupInstance orderCategory
	, Integer recordId)	
	{
		String[] names = new String[2];
		Object[] values = new Object[2];
		StringBuffer hql = new StringBuffer();
		
		hql.append("from OrderMessage c where ");
		hql.append(" c.placerOrdNum = :placerOrdNum ");
		names[0] = "placerOrdNum";
		values[0] = placerOrdNum;		
		hql.append(" and "); 
		hql.append(" c.orderCategory = :orderCategory ");
		names[1] = "orderCategory";
		values[1] = orderCategory;		
		if(recordId != null)
		{
			hql.append(" and c.id <> " + recordId);
		}
		
		return factory.count(hql.toString(), names, values) > 0;				
	}	

	// method generated based on 'order_msg_unq1' unique index.
	public static OrderMessage getRecordByPlacerOrdNumAndOrderCategory(ims.domain.ILightweightDomainFactory factory,
	 String placerOrdNum
	,
	 ims.domain.lookups.LookupInstance orderCategory
	)
	{
		String[] names = new String[2];
		Object[] values = new Object[2];
		StringBuffer hql = new StringBuffer();
		hql.append("from OrderMessage c where ");
		hql.append(" c.placerOrdNum = :placerOrdNum ");
		names[0] = "placerOrdNum";
		values[0] = placerOrdNum;		
		hql.append(" and "); 
		hql.append(" c.orderCategory = :orderCategory ");
		names[1] = "orderCategory";
		values[1] = orderCategory;		
		java.util.List l = factory.find(hql.toString(), names, values);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. " + hql + " returned " + l.size() + " records. " );
		return (OrderMessage)l.get(0);
	}

	public static OrderMessage getOrderMessageFromorder_msg_unq1(ims.domain.ILightweightDomainFactory factory,
	 String placerOrdNum
	,
	 ims.domain.lookups.LookupInstance orderCategory
	)
	{
		String[] names = new String[2];
		Object[] values = new Object[2];
		StringBuffer hql = new StringBuffer();
		hql.append("from OrderMessage c where ");
		hql.append(" c.placerOrdNum = :placerOrdNum ");
		names[0] = "placerOrdNum";
		values[0] = placerOrdNum;		
		hql.append(" and "); 
		hql.append(" c.orderCategory = :orderCategory ");
		names[1] = "orderCategory";
		values[1] = orderCategory;		
		java.util.List l = factory.find(hql.toString(), names, values);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. " + hql + " returned " + l.size() + " records. " );
		return (OrderMessage)l.get(0);
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
		
		auditStr.append("\r\n*orderDetails* :");
		if (orderDetails != null)
		{
			auditStr.append(toShortClassName(orderDetails));
				
		    auditStr.append(orderDetails.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*investigations* :");
		if (investigations != null)
		{
			java.util.Iterator it2 = investigations.iterator();
			int i2=0;
			while (it2.hasNext())
			{
				if (i2 > 0)
					auditStr.append(",");
				ims.ocrr.orderingresults.domain.objects.OrderInvestigation obj = (ims.ocrr.orderingresults.domain.objects.OrderInvestigation)it2.next();
		if (obj != null)
		{
		   if (i2 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i2++;
		}
		if (i2 > 0)
			auditStr.append("] " + i2);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*messageStatus* :");
		if (messageStatus != null)
			auditStr.append(messageStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*providerSystem* :");
		if (providerSystem != null)
		{
			auditStr.append(toShortClassName(providerSystem));
				
		    auditStr.append(providerSystem.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*placerOrdNum* :");
		auditStr.append(placerOrdNum);
	    auditStr.append("; ");
		auditStr.append("\r\n*hL7Message* :");
		auditStr.append(hL7Message);
	    auditStr.append("; ");
		auditStr.append("\r\n*orderCategory* :");
		if (orderCategory != null)
			auditStr.append(orderCategory.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*failureMessage* :");
		auditStr.append(failureMessage);
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
		
		String keyClassName = "OrderMessage";
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
		if (this.getOrderDetails() != null)
		{
			sb.append("<orderDetails>");
			sb.append(this.getOrderDetails().toXMLString(domMap)); 	
			sb.append("</orderDetails>");		
		}
		if (this.getInvestigations() != null)
		{
			if (this.getInvestigations().size() > 0 )
			{
			sb.append("<investigations>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getInvestigations(), domMap));
			sb.append("</investigations>");		
			}
		}
		if (this.getMessageStatus() != null)
		{
			sb.append("<messageStatus>");
			sb.append(this.getMessageStatus().toXMLString()); 
			sb.append("</messageStatus>");		
		}
		if (this.getProviderSystem() != null)
		{
			sb.append("<providerSystem>");
			sb.append(this.getProviderSystem().toXMLString(domMap)); 	
			sb.append("</providerSystem>");		
		}
		if (this.getPlacerOrdNum() != null)
		{
			sb.append("<placerOrdNum>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPlacerOrdNum().toString()));
			sb.append("</placerOrdNum>");		
		}
		if (this.getHL7Message() != null)
		{
			sb.append("<hL7Message>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getHL7Message().toString()));
			sb.append("</hL7Message>");		
		}
		if (this.getOrderCategory() != null)
		{
			sb.append("<orderCategory>");
			sb.append(this.getOrderCategory().toXMLString()); 
			sb.append("</orderCategory>");		
		}
		if (this.getFailureMessage() != null)
		{
			sb.append("<failureMessage>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getFailureMessage().toString()));
			sb.append("</failureMessage>");		
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
			OrderMessage domainObject = getOrderMessagefromXML(itemEl, factory, domMap);

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
			OrderMessage domainObject = getOrderMessagefromXML(itemEl, factory, domMap);

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
		
	public static OrderMessage getOrderMessagefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getOrderMessagefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static OrderMessage getOrderMessagefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!OrderMessage.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!OrderMessage.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the OrderMessage class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (OrderMessage)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(OrderMessage.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		OrderMessage ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (OrderMessage)factory.getImportedDomainObject(OrderMessage.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new OrderMessage();
		}
		String keyClassName = "OrderMessage";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (OrderMessage)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, OrderMessage obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("orderDetails");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setOrderDetails(ims.ocrr.orderingresults.domain.objects.OcsOrderSession.getOcsOrderSessionfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("investigations");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setInvestigations(ims.ocrr.orderingresults.domain.objects.OrderInvestigation.fromSetXMLString(fldEl, factory, obj.getInvestigations(), domMap));
		}
		fldEl = el.element("messageStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setMessageStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("providerSystem");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setProviderSystem(ims.core.admin.domain.objects.ProviderSystem.getProviderSystemfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("placerOrdNum");
		if(fldEl != null)
		{	
    		obj.setPlacerOrdNum(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("hL7Message");
		if(fldEl != null)
		{	
    		obj.setHL7Message(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("orderCategory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setOrderCategory(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("failureMessage");
		if(fldEl != null)
		{	
    		obj.setFailureMessage(new String(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "investigations"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String OrderDetails = "orderDetails";
		public static final String Investigations = "investigations";
		public static final String MessageStatus = "messageStatus";
		public static final String ProviderSystem = "providerSystem";
		public static final String PlacerOrdNum = "placerOrdNum";
		public static final String HL7Message = "hL7Message";
		public static final String OrderCategory = "orderCategory";
		public static final String FailureMessage = "failureMessage";
	}
}

