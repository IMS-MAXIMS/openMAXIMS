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


public class WardBayClosingDetails extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1014100022;
	private static final long serialVersionUID = 1014100022L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private ims.core.resource.people.domain.objects.MemberOfStaff closedBy;
	private java.util.Date closureDate;
	private ims.domain.lookups.LookupInstance reasonForClosure;
	private java.util.Date estimatedReopeningDate;
	private ims.domain.lookups.LookupInstance reopenReason;
	private java.util.Date reopenDate;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public WardBayClosingDetails (Integer id, int ver)
    {
    	super(id, ver);
    }
    public WardBayClosingDetails ()
    {
    	super();
    }
    public WardBayClosingDetails (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.admin.pas.domain.objects.WardBayClosingDetails.class;
	}


	public ims.core.resource.people.domain.objects.MemberOfStaff getClosedBy() {
		return closedBy;
	}
	public void setClosedBy(ims.core.resource.people.domain.objects.MemberOfStaff closedBy) {
		this.closedBy = closedBy;
	}

	public java.util.Date getClosureDate() {
		return closureDate;
	}
	public void setClosureDate(java.util.Date closureDate) {
		this.closureDate = closureDate;
	}

	public ims.domain.lookups.LookupInstance getReasonForClosure() {
		return reasonForClosure;
	}
	public void setReasonForClosure(ims.domain.lookups.LookupInstance reasonForClosure) {
		this.reasonForClosure = reasonForClosure;
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
		
		auditStr.append("\r\n*closedBy* :");
		if (closedBy != null)
		{
			auditStr.append(toShortClassName(closedBy));
				
		    auditStr.append(closedBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*closureDate* :");
		auditStr.append(closureDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*reasonForClosure* :");
		if (reasonForClosure != null)
			auditStr.append(reasonForClosure.getText());
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
		
		String keyClassName = "WardBayClosingDetails";
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
		if (this.getClosedBy() != null)
		{
			sb.append("<closedBy>");
			sb.append(this.getClosedBy().toXMLString(domMap)); 	
			sb.append("</closedBy>");		
		}
		if (this.getClosureDate() != null)
		{
			sb.append("<closureDate>");
			sb.append(new ims.framework.utils.DateTime(this.getClosureDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</closureDate>");		
		}
		if (this.getReasonForClosure() != null)
		{
			sb.append("<reasonForClosure>");
			sb.append(this.getReasonForClosure().toXMLString()); 
			sb.append("</reasonForClosure>");		
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
			WardBayClosingDetails domainObject = getWardBayClosingDetailsfromXML(itemEl, factory, domMap);

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
			WardBayClosingDetails domainObject = getWardBayClosingDetailsfromXML(itemEl, factory, domMap);

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
		
	public static WardBayClosingDetails getWardBayClosingDetailsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getWardBayClosingDetailsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static WardBayClosingDetails getWardBayClosingDetailsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!WardBayClosingDetails.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!WardBayClosingDetails.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the WardBayClosingDetails class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (WardBayClosingDetails)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(WardBayClosingDetails.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		WardBayClosingDetails ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (WardBayClosingDetails)factory.getImportedDomainObject(WardBayClosingDetails.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new WardBayClosingDetails();
		}
		String keyClassName = "WardBayClosingDetails";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (WardBayClosingDetails)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, WardBayClosingDetails obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("closedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setClosedBy(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("closureDate");
		if(fldEl != null)
		{	
    		obj.setClosureDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("reasonForClosure");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReasonForClosure(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
		public static final String ClosedBy = "closedBy";
		public static final String ClosureDate = "closureDate";
		public static final String ReasonForClosure = "reasonForClosure";
		public static final String EstimatedReopeningDate = "estimatedReopeningDate";
		public static final String ReopenReason = "reopenReason";
		public static final String ReopenDate = "reopenDate";
	}
}

