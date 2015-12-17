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


public class WorkAllocation extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1096100033;
	private static final long serialVersionUID = 1096100033L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Cats Referral */
	private ims.RefMan.domain.objects.CatsReferral catsReferral;
	/** Referral Allocated By */
	private ims.core.resource.people.domain.objects.MemberOfStaff allocatedBy;
	/** Date Referral Allocated */
	private java.util.Date dateAllocated;
	/** Referral Allocated To */
	private ims.core.resource.people.domain.objects.MemberOfStaff allocatedTo;
	/** Task Completed Date Time */
	private java.util.Date completedDateTime;
	/** CompletedBy */
	private ims.core.resource.people.domain.objects.MemberOfStaff completedBy;
	/** Referral Work allocation task unallocated By */
	private ims.core.resource.people.domain.objects.MemberOfStaff unallocatedBy;
	/** Referral Work allocation task unallocated Date */
	private java.util.Date unallocatedDate;
	/** Referral Status */
	private ims.domain.lookups.LookupInstance referralStatus;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public WorkAllocation (Integer id, int ver)
    {
    	super(id, ver);
    }
    public WorkAllocation ()
    {
    	super();
    }
    public WorkAllocation (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.RefMan.domain.objects.WorkAllocation.class;
	}


	public ims.RefMan.domain.objects.CatsReferral getCatsReferral() {
		return catsReferral;
	}
	public void setCatsReferral(ims.RefMan.domain.objects.CatsReferral catsReferral) {
		this.catsReferral = catsReferral;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getAllocatedBy() {
		return allocatedBy;
	}
	public void setAllocatedBy(ims.core.resource.people.domain.objects.MemberOfStaff allocatedBy) {
		this.allocatedBy = allocatedBy;
	}

	public java.util.Date getDateAllocated() {
		return dateAllocated;
	}
	public void setDateAllocated(java.util.Date dateAllocated) {
		this.dateAllocated = dateAllocated;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getAllocatedTo() {
		return allocatedTo;
	}
	public void setAllocatedTo(ims.core.resource.people.domain.objects.MemberOfStaff allocatedTo) {
		this.allocatedTo = allocatedTo;
	}

	public java.util.Date getCompletedDateTime() {
		return completedDateTime;
	}
	public void setCompletedDateTime(java.util.Date completedDateTime) {
		this.completedDateTime = completedDateTime;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getCompletedBy() {
		return completedBy;
	}
	public void setCompletedBy(ims.core.resource.people.domain.objects.MemberOfStaff completedBy) {
		this.completedBy = completedBy;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getUnallocatedBy() {
		return unallocatedBy;
	}
	public void setUnallocatedBy(ims.core.resource.people.domain.objects.MemberOfStaff unallocatedBy) {
		this.unallocatedBy = unallocatedBy;
	}

	public java.util.Date getUnallocatedDate() {
		return unallocatedDate;
	}
	public void setUnallocatedDate(java.util.Date unallocatedDate) {
		this.unallocatedDate = unallocatedDate;
	}

	public ims.domain.lookups.LookupInstance getReferralStatus() {
		return referralStatus;
	}
	public void setReferralStatus(ims.domain.lookups.LookupInstance referralStatus) {
		this.referralStatus = referralStatus;
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
		
		auditStr.append("\r\n*catsReferral* :");
		if (catsReferral != null)
		{
			auditStr.append(toShortClassName(catsReferral));
				
		    auditStr.append(catsReferral.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*allocatedBy* :");
		if (allocatedBy != null)
		{
			auditStr.append(toShortClassName(allocatedBy));
				
		    auditStr.append(allocatedBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*dateAllocated* :");
		auditStr.append(dateAllocated);
	    auditStr.append("; ");
		auditStr.append("\r\n*allocatedTo* :");
		if (allocatedTo != null)
		{
			auditStr.append(toShortClassName(allocatedTo));
				
		    auditStr.append(allocatedTo.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*completedDateTime* :");
		auditStr.append(completedDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*completedBy* :");
		if (completedBy != null)
		{
			auditStr.append(toShortClassName(completedBy));
				
		    auditStr.append(completedBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*unallocatedBy* :");
		if (unallocatedBy != null)
		{
			auditStr.append(toShortClassName(unallocatedBy));
				
		    auditStr.append(unallocatedBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*unallocatedDate* :");
		auditStr.append(unallocatedDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*referralStatus* :");
		if (referralStatus != null)
			auditStr.append(referralStatus.getText());
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
		
		String keyClassName = "WorkAllocation";
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
		if (this.getCatsReferral() != null)
		{
			sb.append("<catsReferral>");
			sb.append(this.getCatsReferral().toXMLString(domMap)); 	
			sb.append("</catsReferral>");		
		}
		if (this.getAllocatedBy() != null)
		{
			sb.append("<allocatedBy>");
			sb.append(this.getAllocatedBy().toXMLString(domMap)); 	
			sb.append("</allocatedBy>");		
		}
		if (this.getDateAllocated() != null)
		{
			sb.append("<dateAllocated>");
			sb.append(new ims.framework.utils.DateTime(this.getDateAllocated()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateAllocated>");		
		}
		if (this.getAllocatedTo() != null)
		{
			sb.append("<allocatedTo>");
			sb.append(this.getAllocatedTo().toXMLString(domMap)); 	
			sb.append("</allocatedTo>");		
		}
		if (this.getCompletedDateTime() != null)
		{
			sb.append("<completedDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getCompletedDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</completedDateTime>");		
		}
		if (this.getCompletedBy() != null)
		{
			sb.append("<completedBy>");
			sb.append(this.getCompletedBy().toXMLString(domMap)); 	
			sb.append("</completedBy>");		
		}
		if (this.getUnallocatedBy() != null)
		{
			sb.append("<unallocatedBy>");
			sb.append(this.getUnallocatedBy().toXMLString(domMap)); 	
			sb.append("</unallocatedBy>");		
		}
		if (this.getUnallocatedDate() != null)
		{
			sb.append("<unallocatedDate>");
			sb.append(new ims.framework.utils.DateTime(this.getUnallocatedDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</unallocatedDate>");		
		}
		if (this.getReferralStatus() != null)
		{
			sb.append("<referralStatus>");
			sb.append(this.getReferralStatus().toXMLString()); 
			sb.append("</referralStatus>");		
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
			WorkAllocation domainObject = getWorkAllocationfromXML(itemEl, factory, domMap);

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
			WorkAllocation domainObject = getWorkAllocationfromXML(itemEl, factory, domMap);

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
		
	public static WorkAllocation getWorkAllocationfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getWorkAllocationfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static WorkAllocation getWorkAllocationfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!WorkAllocation.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!WorkAllocation.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the WorkAllocation class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (WorkAllocation)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(WorkAllocation.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		WorkAllocation ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (WorkAllocation)factory.getImportedDomainObject(WorkAllocation.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new WorkAllocation();
		}
		String keyClassName = "WorkAllocation";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (WorkAllocation)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, WorkAllocation obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("catsReferral");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCatsReferral(ims.RefMan.domain.objects.CatsReferral.getCatsReferralfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("allocatedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAllocatedBy(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("dateAllocated");
		if(fldEl != null)
		{	
    		obj.setDateAllocated(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("allocatedTo");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAllocatedTo(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("completedDateTime");
		if(fldEl != null)
		{	
    		obj.setCompletedDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("completedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCompletedBy(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("unallocatedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setUnallocatedBy(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("unallocatedDate");
		if(fldEl != null)
		{	
    		obj.setUnallocatedDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("referralStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReferralStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
		public static final String CatsReferral = "catsReferral";
		public static final String AllocatedBy = "allocatedBy";
		public static final String DateAllocated = "dateAllocated";
		public static final String AllocatedTo = "allocatedTo";
		public static final String CompletedDateTime = "completedDateTime";
		public static final String CompletedBy = "completedBy";
		public static final String UnallocatedBy = "unallocatedBy";
		public static final String UnallocatedDate = "unallocatedDate";
		public static final String ReferralStatus = "referralStatus";
	}
}

