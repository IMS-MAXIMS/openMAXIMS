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
package ims.core.clinical.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class PatientCaseNoteRequest extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1003100131;
	private static final long serialVersionUID = 1003100131L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Patient */
	private ims.core.patient.domain.objects.Patient patient;
	/** CaseNote */
	private ims.core.clinical.domain.objects.PatientCaseNote caseNote;
	private ims.domain.lookups.LookupInstance requestStatus;
	/** Requested For Location */
	private ims.core.resource.place.domain.objects.Location requestedForLocation;
	/** Requested By */
	private ims.core.resource.people.domain.objects.MemberOfStaff requestedBy;
	/** Required By Date */
	private java.util.Date requiredByDate;
	/** ReasonForRequest */
	private ims.domain.lookups.LookupInstance reasonForRequest;
	/** Request Comment */
	private ims.core.clinical.domain.objects.PatientCaseNoteComment requestComment;
	/** Cancelled By */
	private ims.core.resource.people.domain.objects.MemberOfStaff cancelledBy;
	/** Cancelled Date */
	private java.util.Date cancelledDate;
	/** Cancellation Reason */
	private ims.domain.lookups.LookupInstance cancellationReason;
	/** Creation Date */
	private java.util.Date creationDate;
	/** Transfer That Completed Request */
	private ims.core.clinical.domain.objects.PatientCaseNoteTransfer transferThatCompletedRequest;
	/** Appointment */
	private ims.scheduling.domain.objects.Booking_Appointment appointment;
	/** TCI List Entry */
	private ims.RefMan.domain.objects.TCIForPatientElectiveList tCIDetail;
	private java.util.Date printedPullListDate;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PatientCaseNoteRequest (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PatientCaseNoteRequest ()
    {
    	super();
    }
    public PatientCaseNoteRequest (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.clinical.domain.objects.PatientCaseNoteRequest.class;
	}


	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public ims.core.clinical.domain.objects.PatientCaseNote getCaseNote() {
		return caseNote;
	}
	public void setCaseNote(ims.core.clinical.domain.objects.PatientCaseNote caseNote) {
		this.caseNote = caseNote;
	}

	public ims.domain.lookups.LookupInstance getRequestStatus() {
		return requestStatus;
	}
	public void setRequestStatus(ims.domain.lookups.LookupInstance requestStatus) {
		this.requestStatus = requestStatus;
	}

	public ims.core.resource.place.domain.objects.Location getRequestedForLocation() {
		return requestedForLocation;
	}
	public void setRequestedForLocation(ims.core.resource.place.domain.objects.Location requestedForLocation) {
		this.requestedForLocation = requestedForLocation;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getRequestedBy() {
		return requestedBy;
	}
	public void setRequestedBy(ims.core.resource.people.domain.objects.MemberOfStaff requestedBy) {
		this.requestedBy = requestedBy;
	}

	public java.util.Date getRequiredByDate() {
		return requiredByDate;
	}
	public void setRequiredByDate(java.util.Date requiredByDate) {
		this.requiredByDate = requiredByDate;
	}

	public ims.domain.lookups.LookupInstance getReasonForRequest() {
		return reasonForRequest;
	}
	public void setReasonForRequest(ims.domain.lookups.LookupInstance reasonForRequest) {
		this.reasonForRequest = reasonForRequest;
	}

	public ims.core.clinical.domain.objects.PatientCaseNoteComment getRequestComment() {
		return requestComment;
	}
	public void setRequestComment(ims.core.clinical.domain.objects.PatientCaseNoteComment requestComment) {
		this.requestComment = requestComment;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getCancelledBy() {
		return cancelledBy;
	}
	public void setCancelledBy(ims.core.resource.people.domain.objects.MemberOfStaff cancelledBy) {
		this.cancelledBy = cancelledBy;
	}

	public java.util.Date getCancelledDate() {
		return cancelledDate;
	}
	public void setCancelledDate(java.util.Date cancelledDate) {
		this.cancelledDate = cancelledDate;
	}

	public ims.domain.lookups.LookupInstance getCancellationReason() {
		return cancellationReason;
	}
	public void setCancellationReason(ims.domain.lookups.LookupInstance cancellationReason) {
		this.cancellationReason = cancellationReason;
	}

	public java.util.Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(java.util.Date creationDate) {
		this.creationDate = creationDate;
	}

	public ims.core.clinical.domain.objects.PatientCaseNoteTransfer getTransferThatCompletedRequest() {
		return transferThatCompletedRequest;
	}
	public void setTransferThatCompletedRequest(ims.core.clinical.domain.objects.PatientCaseNoteTransfer transferThatCompletedRequest) {
		this.transferThatCompletedRequest = transferThatCompletedRequest;
	}

	public ims.scheduling.domain.objects.Booking_Appointment getAppointment() {
		return appointment;
	}
	public void setAppointment(ims.scheduling.domain.objects.Booking_Appointment appointment) {
		this.appointment = appointment;
	}

	public ims.RefMan.domain.objects.TCIForPatientElectiveList getTCIDetail() {
		return tCIDetail;
	}
	public void setTCIDetail(ims.RefMan.domain.objects.TCIForPatientElectiveList tCIDetail) {
		this.tCIDetail = tCIDetail;
	}

	public java.util.Date getPrintedPullListDate() {
		return printedPullListDate;
	}
	public void setPrintedPullListDate(java.util.Date printedPullListDate) {
		this.printedPullListDate = printedPullListDate;
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
		auditStr.append("\r\n*caseNote* :");
		if (caseNote != null)
		{
			auditStr.append(toShortClassName(caseNote));
				
		    auditStr.append(caseNote.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*requestStatus* :");
		if (requestStatus != null)
			auditStr.append(requestStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*requestedForLocation* :");
		if (requestedForLocation != null)
		{
			auditStr.append(toShortClassName(requestedForLocation));
				
		    auditStr.append(requestedForLocation.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*requestedBy* :");
		if (requestedBy != null)
		{
			auditStr.append(toShortClassName(requestedBy));
				
		    auditStr.append(requestedBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*requiredByDate* :");
		auditStr.append(requiredByDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*reasonForRequest* :");
		if (reasonForRequest != null)
			auditStr.append(reasonForRequest.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*requestComment* :");
		if (requestComment != null)
		{
			auditStr.append(toShortClassName(requestComment));
				
		    auditStr.append(requestComment.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*cancelledBy* :");
		if (cancelledBy != null)
		{
			auditStr.append(toShortClassName(cancelledBy));
				
		    auditStr.append(cancelledBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*cancelledDate* :");
		auditStr.append(cancelledDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*cancellationReason* :");
		if (cancellationReason != null)
			auditStr.append(cancellationReason.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*creationDate* :");
		auditStr.append(creationDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*transferThatCompletedRequest* :");
		if (transferThatCompletedRequest != null)
		{
			auditStr.append(toShortClassName(transferThatCompletedRequest));
				
		    auditStr.append(transferThatCompletedRequest.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*appointment* :");
		if (appointment != null)
		{
			auditStr.append(toShortClassName(appointment));
				
		    auditStr.append(appointment.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*tCIDetail* :");
		if (tCIDetail != null)
		{
			auditStr.append(toShortClassName(tCIDetail));
				
		    auditStr.append(tCIDetail.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*printedPullListDate* :");
		auditStr.append(printedPullListDate);
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
		
		String keyClassName = "PatientCaseNoteRequest";
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
		if (this.getCaseNote() != null)
		{
			sb.append("<caseNote>");
			sb.append(this.getCaseNote().toXMLString(domMap)); 	
			sb.append("</caseNote>");		
		}
		if (this.getRequestStatus() != null)
		{
			sb.append("<requestStatus>");
			sb.append(this.getRequestStatus().toXMLString()); 
			sb.append("</requestStatus>");		
		}
		if (this.getRequestedForLocation() != null)
		{
			sb.append("<requestedForLocation>");
			sb.append(this.getRequestedForLocation().toXMLString(domMap)); 	
			sb.append("</requestedForLocation>");		
		}
		if (this.getRequestedBy() != null)
		{
			sb.append("<requestedBy>");
			sb.append(this.getRequestedBy().toXMLString(domMap)); 	
			sb.append("</requestedBy>");		
		}
		if (this.getRequiredByDate() != null)
		{
			sb.append("<requiredByDate>");
			sb.append(new ims.framework.utils.DateTime(this.getRequiredByDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</requiredByDate>");		
		}
		if (this.getReasonForRequest() != null)
		{
			sb.append("<reasonForRequest>");
			sb.append(this.getReasonForRequest().toXMLString()); 
			sb.append("</reasonForRequest>");		
		}
		if (this.getRequestComment() != null)
		{
			sb.append("<requestComment>");
			sb.append(this.getRequestComment().toXMLString(domMap)); 	
			sb.append("</requestComment>");		
		}
		if (this.getCancelledBy() != null)
		{
			sb.append("<cancelledBy>");
			sb.append(this.getCancelledBy().toXMLString(domMap)); 	
			sb.append("</cancelledBy>");		
		}
		if (this.getCancelledDate() != null)
		{
			sb.append("<cancelledDate>");
			sb.append(new ims.framework.utils.DateTime(this.getCancelledDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</cancelledDate>");		
		}
		if (this.getCancellationReason() != null)
		{
			sb.append("<cancellationReason>");
			sb.append(this.getCancellationReason().toXMLString()); 
			sb.append("</cancellationReason>");		
		}
		if (this.getCreationDate() != null)
		{
			sb.append("<creationDate>");
			sb.append(new ims.framework.utils.DateTime(this.getCreationDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</creationDate>");		
		}
		if (this.getTransferThatCompletedRequest() != null)
		{
			sb.append("<transferThatCompletedRequest>");
			sb.append(this.getTransferThatCompletedRequest().toXMLString(domMap)); 	
			sb.append("</transferThatCompletedRequest>");		
		}
		if (this.getAppointment() != null)
		{
			sb.append("<appointment>");
			sb.append(this.getAppointment().toXMLString(domMap)); 	
			sb.append("</appointment>");		
		}
		if (this.getTCIDetail() != null)
		{
			sb.append("<tCIDetail>");
			sb.append(this.getTCIDetail().toXMLString(domMap)); 	
			sb.append("</tCIDetail>");		
		}
		if (this.getPrintedPullListDate() != null)
		{
			sb.append("<printedPullListDate>");
			sb.append(new ims.framework.utils.DateTime(this.getPrintedPullListDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</printedPullListDate>");		
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
			PatientCaseNoteRequest domainObject = getPatientCaseNoteRequestfromXML(itemEl, factory, domMap);

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
			PatientCaseNoteRequest domainObject = getPatientCaseNoteRequestfromXML(itemEl, factory, domMap);

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
		
	public static PatientCaseNoteRequest getPatientCaseNoteRequestfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPatientCaseNoteRequestfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PatientCaseNoteRequest getPatientCaseNoteRequestfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PatientCaseNoteRequest.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PatientCaseNoteRequest.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PatientCaseNoteRequest class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PatientCaseNoteRequest)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PatientCaseNoteRequest.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PatientCaseNoteRequest ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PatientCaseNoteRequest)factory.getImportedDomainObject(PatientCaseNoteRequest.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PatientCaseNoteRequest();
		}
		String keyClassName = "PatientCaseNoteRequest";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PatientCaseNoteRequest)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PatientCaseNoteRequest obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("caseNote");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCaseNote(ims.core.clinical.domain.objects.PatientCaseNote.getPatientCaseNotefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("requestStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setRequestStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("requestedForLocation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRequestedForLocation(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("requestedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRequestedBy(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("requiredByDate");
		if(fldEl != null)
		{	
    		obj.setRequiredByDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("reasonForRequest");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReasonForRequest(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("requestComment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRequestComment(ims.core.clinical.domain.objects.PatientCaseNoteComment.getPatientCaseNoteCommentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("cancelledBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCancelledBy(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("cancelledDate");
		if(fldEl != null)
		{	
    		obj.setCancelledDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("cancellationReason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCancellationReason(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("creationDate");
		if(fldEl != null)
		{	
    		obj.setCreationDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("transferThatCompletedRequest");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTransferThatCompletedRequest(ims.core.clinical.domain.objects.PatientCaseNoteTransfer.getPatientCaseNoteTransferfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("appointment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAppointment(ims.scheduling.domain.objects.Booking_Appointment.getBooking_AppointmentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("tCIDetail");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTCIDetail(ims.RefMan.domain.objects.TCIForPatientElectiveList.getTCIForPatientElectiveListfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("printedPullListDate");
		if(fldEl != null)
		{	
    		obj.setPrintedPullListDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
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
		public static final String CaseNote = "caseNote";
		public static final String RequestStatus = "requestStatus";
		public static final String RequestedForLocation = "requestedForLocation";
		public static final String RequestedBy = "requestedBy";
		public static final String RequiredByDate = "requiredByDate";
		public static final String ReasonForRequest = "reasonForRequest";
		public static final String RequestComment = "requestComment";
		public static final String CancelledBy = "cancelledBy";
		public static final String CancelledDate = "cancelledDate";
		public static final String CancellationReason = "cancellationReason";
		public static final String CreationDate = "creationDate";
		public static final String TransferThatCompletedRequest = "transferThatCompletedRequest";
		public static final String Appointment = "appointment";
		public static final String TCIDetail = "tCIDetail";
		public static final String PrintedPullListDate = "printedPullListDate";
	}
}

