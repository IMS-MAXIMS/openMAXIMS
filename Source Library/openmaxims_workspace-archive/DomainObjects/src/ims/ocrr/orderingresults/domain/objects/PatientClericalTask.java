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
 * @author Neil McAnaspie
 * Generated.
 */


public class PatientClericalTask extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1070100027;
	private static final long serialVersionUID = 1070100027L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Patient */
	private ims.core.patient.domain.objects.Patient patient;
	/** Investigation */
	private ims.ocrr.orderingresults.domain.objects.OrderInvestigation investigation;
	/** Requestor  */
	private ims.core.resource.people.domain.objects.MemberOfStaff requestor;
	/** Requested DateTime */
	private java.util.Date requestedDateTime;
	/** AllocatedTo */
	private ims.core.resource.people.domain.objects.MemberOfStaff allocatedTo;
	/** Comment */
	private String comment;
	/** CompletedBy */
	private ims.core.resource.people.domain.objects.MemberOfStaff completedBy;
	/** Completed DateTime */
	private java.util.Date completedDateTime;
	/** Status */
	private ims.domain.lookups.LookupInstance status;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PatientClericalTask (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PatientClericalTask ()
    {
    	super();
    }
    public PatientClericalTask (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.ocrr.orderingresults.domain.objects.PatientClericalTask.class;
	}


	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public ims.ocrr.orderingresults.domain.objects.OrderInvestigation getInvestigation() {
		return investigation;
	}
	public void setInvestigation(ims.ocrr.orderingresults.domain.objects.OrderInvestigation investigation) {
		this.investigation = investigation;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getRequestor() {
		return requestor;
	}
	public void setRequestor(ims.core.resource.people.domain.objects.MemberOfStaff requestor) {
		this.requestor = requestor;
	}

	public java.util.Date getRequestedDateTime() {
		return requestedDateTime;
	}
	public void setRequestedDateTime(java.util.Date requestedDateTime) {
		this.requestedDateTime = requestedDateTime;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getAllocatedTo() {
		return allocatedTo;
	}
	public void setAllocatedTo(ims.core.resource.people.domain.objects.MemberOfStaff allocatedTo) {
		this.allocatedTo = allocatedTo;
	}

	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getCompletedBy() {
		return completedBy;
	}
	public void setCompletedBy(ims.core.resource.people.domain.objects.MemberOfStaff completedBy) {
		this.completedBy = completedBy;
	}

	public java.util.Date getCompletedDateTime() {
		return completedDateTime;
	}
	public void setCompletedDateTime(java.util.Date completedDateTime) {
		this.completedDateTime = completedDateTime;
	}

	public ims.domain.lookups.LookupInstance getStatus() {
		return status;
	}
	public void setStatus(ims.domain.lookups.LookupInstance status) {
		this.status = status;
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
		auditStr.append("\r\n*investigation* :");
		if (investigation != null)
		{
			auditStr.append(toShortClassName(investigation));
				
		    auditStr.append(investigation.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*requestor* :");
		if (requestor != null)
		{
			auditStr.append(toShortClassName(requestor));
				
		    auditStr.append(requestor.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*requestedDateTime* :");
		auditStr.append(requestedDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*allocatedTo* :");
		if (allocatedTo != null)
		{
			auditStr.append(toShortClassName(allocatedTo));
				
		    auditStr.append(allocatedTo.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*comment* :");
		auditStr.append(comment);
	    auditStr.append("; ");
		auditStr.append("\r\n*completedBy* :");
		if (completedBy != null)
		{
			auditStr.append(toShortClassName(completedBy));
				
		    auditStr.append(completedBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*completedDateTime* :");
		auditStr.append(completedDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*status* :");
		if (status != null)
			auditStr.append(status.getText());
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
		
		String keyClassName = "PatientClericalTask";
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
		if (this.getInvestigation() != null)
		{
			sb.append("<investigation>");
			sb.append(this.getInvestigation().toXMLString(domMap)); 	
			sb.append("</investigation>");		
		}
		if (this.getRequestor() != null)
		{
			sb.append("<requestor>");
			sb.append(this.getRequestor().toXMLString(domMap)); 	
			sb.append("</requestor>");		
		}
		if (this.getRequestedDateTime() != null)
		{
			sb.append("<requestedDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getRequestedDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</requestedDateTime>");		
		}
		if (this.getAllocatedTo() != null)
		{
			sb.append("<allocatedTo>");
			sb.append(this.getAllocatedTo().toXMLString(domMap)); 	
			sb.append("</allocatedTo>");		
		}
		if (this.getComment() != null)
		{
			sb.append("<comment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getComment().toString()));
			sb.append("</comment>");		
		}
		if (this.getCompletedBy() != null)
		{
			sb.append("<completedBy>");
			sb.append(this.getCompletedBy().toXMLString(domMap)); 	
			sb.append("</completedBy>");		
		}
		if (this.getCompletedDateTime() != null)
		{
			sb.append("<completedDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getCompletedDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</completedDateTime>");		
		}
		if (this.getStatus() != null)
		{
			sb.append("<status>");
			sb.append(this.getStatus().toXMLString()); 
			sb.append("</status>");		
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
			PatientClericalTask domainObject = getPatientClericalTaskfromXML(itemEl, factory, domMap);

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
			PatientClericalTask domainObject = getPatientClericalTaskfromXML(itemEl, factory, domMap);

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
		
	public static PatientClericalTask getPatientClericalTaskfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPatientClericalTaskfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PatientClericalTask getPatientClericalTaskfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PatientClericalTask.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PatientClericalTask.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PatientClericalTask class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PatientClericalTask)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PatientClericalTask.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PatientClericalTask ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PatientClericalTask)factory.getImportedDomainObject(PatientClericalTask.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PatientClericalTask();
		}
		String keyClassName = "PatientClericalTask";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PatientClericalTask)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PatientClericalTask obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("investigation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setInvestigation(ims.ocrr.orderingresults.domain.objects.OrderInvestigation.getOrderInvestigationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("requestor");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRequestor(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("requestedDateTime");
		if(fldEl != null)
		{	
    		obj.setRequestedDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("allocatedTo");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAllocatedTo(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("comment");
		if(fldEl != null)
		{	
    		obj.setComment(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("completedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCompletedBy(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("completedDateTime");
		if(fldEl != null)
		{	
    		obj.setCompletedDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("status");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
		public static final String Investigation = "investigation";
		public static final String Requestor = "requestor";
		public static final String RequestedDateTime = "requestedDateTime";
		public static final String AllocatedTo = "allocatedTo";
		public static final String Comment = "comment";
		public static final String CompletedBy = "completedBy";
		public static final String CompletedDateTime = "completedDateTime";
		public static final String Status = "status";
	}
}

