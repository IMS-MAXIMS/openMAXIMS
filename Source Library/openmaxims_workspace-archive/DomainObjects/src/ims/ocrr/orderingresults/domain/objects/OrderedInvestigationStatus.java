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
 * @author Kevin O'Carroll
 * Generated.
 */


public class OrderedInvestigationStatus extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1070100011;
	private static final long serialVersionUID = 1070100011L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** OrdInvStatus */
	private ims.domain.lookups.LookupInstance ordInvStatus;
	/** DateTime status changed */
	private java.util.Date changeDateTime;
	/** User name of who caused status change */
	private String changeUser;
	/** Status Reason */
	private String statusReason;
	/** Cancellation Reason */
	private ims.domain.lookups.LookupInstance statusChangeReason;
	/** DateTime HL7 message (if any)was processed */
	private java.util.Date processedDateTime;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public OrderedInvestigationStatus (Integer id, int ver)
    {
    	super(id, ver);
		isComponentClass=true;
    }
    public OrderedInvestigationStatus ()
    {
    	super();
		isComponentClass=true;
    }
    public OrderedInvestigationStatus (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
		isComponentClass=true;
    }
	public Class getRealDomainClass()
	{
		return ims.ocrr.orderingresults.domain.objects.OrderedInvestigationStatus.class;
	}


	public ims.domain.lookups.LookupInstance getOrdInvStatus() {
		return ordInvStatus;
	}
	public void setOrdInvStatus(ims.domain.lookups.LookupInstance ordInvStatus) {
		this.ordInvStatus = ordInvStatus;
	}

	public java.util.Date getChangeDateTime() {
		return changeDateTime;
	}
	public void setChangeDateTime(java.util.Date changeDateTime) {
		this.changeDateTime = changeDateTime;
	}

	public String getChangeUser() {
		return changeUser;
	}
	public void setChangeUser(String changeUser) {
		if ( null != changeUser && changeUser.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for changeUser. Tried to set value: "+
				changeUser);
		}
		this.changeUser = changeUser;
	}

	public String getStatusReason() {
		return statusReason;
	}
	public void setStatusReason(String statusReason) {
		if ( null != statusReason && statusReason.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for statusReason. Tried to set value: "+
				statusReason);
		}
		this.statusReason = statusReason;
	}

	public ims.domain.lookups.LookupInstance getStatusChangeReason() {
		return statusChangeReason;
	}
	public void setStatusChangeReason(ims.domain.lookups.LookupInstance statusChangeReason) {
		this.statusChangeReason = statusChangeReason;
	}

	public java.util.Date getProcessedDateTime() {
		return processedDateTime;
	}
	public void setProcessedDateTime(java.util.Date processedDateTime) {
		this.processedDateTime = processedDateTime;
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
		
		auditStr.append("\r\n*ordInvStatus* :");
		if (ordInvStatus != null)
			auditStr.append(ordInvStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*changeDateTime* :");
		auditStr.append(changeDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*changeUser* :");
		auditStr.append(changeUser);
	    auditStr.append("; ");
		auditStr.append("\r\n*statusReason* :");
		auditStr.append(statusReason);
	    auditStr.append("; ");
		auditStr.append("\r\n*statusChangeReason* :");
		if (statusChangeReason != null)
			auditStr.append(statusChangeReason.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*processedDateTime* :");
		auditStr.append(processedDateTime);
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
		sb.append(" source=\"" + ims.configuration.EnvironmentConfig.getImportExportSourceName() + "\" ");
		sb.append(" classVersion=\"" + this.getClassVersion() + "\" ");
		sb.append(" component=\"" + this.getIsComponentClass() + "\" >");
		
		if (domMap.get(this) == null)
		{
			domMap.put(this, this);
			sb.append(this.fieldsToXMLString(domMap));
		}
		sb.append("</class>");
		
		
		return sb.toString();
	}

	public String fieldsToXMLString(java.util.HashMap domMap)
	{
		StringBuffer sb = new StringBuffer();
		if (this.getOrdInvStatus() != null)
		{
			sb.append("<ordInvStatus>");
			sb.append(this.getOrdInvStatus().toXMLString()); 
			sb.append("</ordInvStatus>");		
		}
		if (this.getChangeDateTime() != null)
		{
			sb.append("<changeDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getChangeDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</changeDateTime>");		
		}
		if (this.getChangeUser() != null)
		{
			sb.append("<changeUser>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getChangeUser().toString()));
			sb.append("</changeUser>");		
		}
		if (this.getStatusReason() != null)
		{
			sb.append("<statusReason>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getStatusReason().toString()));
			sb.append("</statusReason>");		
		}
		if (this.getStatusChangeReason() != null)
		{
			sb.append("<statusChangeReason>");
			sb.append(this.getStatusChangeReason().toXMLString()); 
			sb.append("</statusChangeReason>");		
		}
		if (this.getProcessedDateTime() != null)
		{
			sb.append("<processedDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getProcessedDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</processedDateTime>");		
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
			OrderedInvestigationStatus domainObject = getOrderedInvestigationStatusfromXML(itemEl, factory, domMap);

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
			OrderedInvestigationStatus domainObject = getOrderedInvestigationStatusfromXML(itemEl, factory, domMap);

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
		
	public static OrderedInvestigationStatus getOrderedInvestigationStatusfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getOrderedInvestigationStatusfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static OrderedInvestigationStatus getOrderedInvestigationStatusfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!OrderedInvestigationStatus.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!OrderedInvestigationStatus.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the OrderedInvestigationStatus class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (OrderedInvestigationStatus)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(OrderedInvestigationStatus.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		OrderedInvestigationStatus ret = null;
		if (ret == null)
		{
			ret = new OrderedInvestigationStatus();
		}
		fillFieldsfromXML(el, factory, ret, domMap);
		return ret;
	}

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, OrderedInvestigationStatus obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("ordInvStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setOrdInvStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("changeDateTime");
		if(fldEl != null)
		{	
    		obj.setChangeDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("changeUser");
		if(fldEl != null)
		{	
    		obj.setChangeUser(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("statusReason");
		if(fldEl != null)
		{	
    		obj.setStatusReason(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("statusChangeReason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setStatusChangeReason(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("processedDateTime");
		if(fldEl != null)
		{	
    		obj.setProcessedDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		};
	}

	/**
	equals
	*/
public boolean equals(Object obj)
{
	if (null == obj)
	{
		return false;
	}

	if (!(obj instanceof OrderedInvestigationStatus))
		return false;

	OrderedInvestigationStatus oi = (OrderedInvestigationStatus)obj;
		
	return 	oi.getOrdInvStatus().equals(ordInvStatus) && 
			oi.getChangeDateTime().equals(changeDateTime) &&
			oi.systemInformation.equals(systemInformation);
}

	/**
	hashcode
	*/
public int hashCode()
{
	return (ordInvStatus.hashCode() * 10001) + changeDateTime.hashCode() + systemInformation.hashCode();
}

	/**
	toString
	*/
public String toString()
	{	
		StringBuffer objStr = new StringBuffer();
	
		if (ordInvStatus != null)
			objStr.append(ordInvStatus.getText() + "-");
		if (changeDateTime != null)
			objStr.append(changeDateTime + "-");
		if (changeUser != null)
			objStr.append(changeUser + "-");
		if (statusReason != null)
			objStr.append(statusReason);
		return objStr.toString();
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String OrdInvStatus = "ordInvStatus";
		public static final String ChangeDateTime = "changeDateTime";
		public static final String ChangeUser = "changeUser";
		public static final String StatusReason = "statusReason";
		public static final String StatusChangeReason = "statusChangeReason";
		public static final String ProcessedDateTime = "processedDateTime";
	}
}

