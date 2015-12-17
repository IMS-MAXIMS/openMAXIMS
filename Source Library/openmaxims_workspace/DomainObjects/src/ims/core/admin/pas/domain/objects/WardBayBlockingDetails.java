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
package ims.core.admin.pas.domain.objects;

/**
 * 
 * @author George Cristian Josan
 * Generated.
 */


public class WardBayBlockingDetails extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1014100023;
	private static final long serialVersionUID = 1014100023L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private ims.core.resource.people.domain.objects.MemberOfStaff blockedBy;
	private java.util.Date blockedDate;
	private ims.domain.lookups.LookupInstance reasonForBlocking;
	private java.util.Date estimatedReopeningDate;
	private ims.domain.lookups.LookupInstance reopenReason;
	private java.util.Date reopenDate;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public WardBayBlockingDetails (Integer id, int ver)
    {
    	super(id, ver);
    }
    public WardBayBlockingDetails ()
    {
    	super();
    }
    public WardBayBlockingDetails (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.admin.pas.domain.objects.WardBayBlockingDetails.class;
	}


	public ims.core.resource.people.domain.objects.MemberOfStaff getBlockedBy() {
		return blockedBy;
	}
	public void setBlockedBy(ims.core.resource.people.domain.objects.MemberOfStaff blockedBy) {
		this.blockedBy = blockedBy;
	}

	public java.util.Date getBlockedDate() {
		return blockedDate;
	}
	public void setBlockedDate(java.util.Date blockedDate) {
		this.blockedDate = blockedDate;
	}

	public ims.domain.lookups.LookupInstance getReasonForBlocking() {
		return reasonForBlocking;
	}
	public void setReasonForBlocking(ims.domain.lookups.LookupInstance reasonForBlocking) {
		this.reasonForBlocking = reasonForBlocking;
	}

	public java.util.Date getEstimatedReopeningDate() {
		return estimatedReopeningDate;
	}
	public void setEstimatedReopeningDate(java.util.Date estimatedReopeningDate) {
		this.estimatedReopeningDate = estimatedReopeningDate;
	}

	public ims.domain.lookups.LookupInstance getReopenReason() {
		return reopenReason;
	}
	public void setReopenReason(ims.domain.lookups.LookupInstance reopenReason) {
		this.reopenReason = reopenReason;
	}

	public java.util.Date getReopenDate() {
		return reopenDate;
	}
	public void setReopenDate(java.util.Date reopenDate) {
		this.reopenDate = reopenDate;
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
		
		auditStr.append("\r\n*blockedBy* :");
		if (blockedBy != null)
		{
			auditStr.append(toShortClassName(blockedBy));
				
		    auditStr.append(blockedBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*blockedDate* :");
		auditStr.append(blockedDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*reasonForBlocking* :");
		if (reasonForBlocking != null)
			auditStr.append(reasonForBlocking.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*estimatedReopeningDate* :");
		auditStr.append(estimatedReopeningDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*reopenReason* :");
		if (reopenReason != null)
			auditStr.append(reopenReason.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*reopenDate* :");
		auditStr.append(reopenDate);
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
		
		String keyClassName = "WardBayBlockingDetails";
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
		if (this.getBlockedBy() != null)
		{
			sb.append("<blockedBy>");
			sb.append(this.getBlockedBy().toXMLString(domMap)); 	
			sb.append("</blockedBy>");		
		}
		if (this.getBlockedDate() != null)
		{
			sb.append("<blockedDate>");
			sb.append(new ims.framework.utils.DateTime(this.getBlockedDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</blockedDate>");		
		}
		if (this.getReasonForBlocking() != null)
		{
			sb.append("<reasonForBlocking>");
			sb.append(this.getReasonForBlocking().toXMLString()); 
			sb.append("</reasonForBlocking>");		
		}
		if (this.getEstimatedReopeningDate() != null)
		{
			sb.append("<estimatedReopeningDate>");
			sb.append(new ims.framework.utils.DateTime(this.getEstimatedReopeningDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</estimatedReopeningDate>");		
		}
		if (this.getReopenReason() != null)
		{
			sb.append("<reopenReason>");
			sb.append(this.getReopenReason().toXMLString()); 
			sb.append("</reopenReason>");		
		}
		if (this.getReopenDate() != null)
		{
			sb.append("<reopenDate>");
			sb.append(new ims.framework.utils.DateTime(this.getReopenDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</reopenDate>");		
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
			WardBayBlockingDetails domainObject = getWardBayBlockingDetailsfromXML(itemEl, factory, domMap);

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
			WardBayBlockingDetails domainObject = getWardBayBlockingDetailsfromXML(itemEl, factory, domMap);

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
		
	public static WardBayBlockingDetails getWardBayBlockingDetailsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getWardBayBlockingDetailsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static WardBayBlockingDetails getWardBayBlockingDetailsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!WardBayBlockingDetails.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!WardBayBlockingDetails.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the WardBayBlockingDetails class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (WardBayBlockingDetails)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(WardBayBlockingDetails.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		WardBayBlockingDetails ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (WardBayBlockingDetails)factory.getImportedDomainObject(WardBayBlockingDetails.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new WardBayBlockingDetails();
		}
		String keyClassName = "WardBayBlockingDetails";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (WardBayBlockingDetails)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, WardBayBlockingDetails obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("blockedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setBlockedBy(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("blockedDate");
		if(fldEl != null)
		{	
    		obj.setBlockedDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("reasonForBlocking");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReasonForBlocking(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("estimatedReopeningDate");
		if(fldEl != null)
		{	
    		obj.setEstimatedReopeningDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("reopenReason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReopenReason(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("reopenDate");
		if(fldEl != null)
		{	
    		obj.setReopenDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
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
		public static final String BlockedBy = "blockedBy";
		public static final String BlockedDate = "blockedDate";
		public static final String ReasonForBlocking = "reasonForBlocking";
		public static final String EstimatedReopeningDate = "estimatedReopeningDate";
		public static final String ReopenReason = "reopenReason";
		public static final String ReopenDate = "reopenDate";
	}
}

