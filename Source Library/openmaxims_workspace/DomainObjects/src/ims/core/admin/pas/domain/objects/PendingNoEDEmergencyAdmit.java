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


public class PendingNoEDEmergencyAdmit extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1014100027;
	private static final long serialVersionUID = 1014100027L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private ims.domain.lookups.LookupInstance type;
	private ims.domain.lookups.LookupInstance category;
	private ims.domain.lookups.LookupInstance sourceOfReferral;
	private ims.domain.lookups.LookupInstance transferReason;
	private ims.core.clinical.domain.objects.Service service;
	private ims.core.resource.place.domain.objects.Location hospital;
	private ims.core.resource.place.domain.objects.Location ward;
	private String referredLocation;
	private String contactDetails;
	private String comments;
	private java.util.Date proposedTransferDate;
	private ims.core.resource.people.domain.objects.MemberOfStaff recordedBy;
	private java.util.Date recordedDateTime;
	private ims.core.admin.pas.domain.objects.PendingAdmissionStatus currentStatus;
	/** 
	  * Collection of ims.core.admin.pas.domain.objects.PendingAdmissionStatus.
	  */
	private java.util.List statusHistory;
	private ims.domain.lookups.LookupInstance sourceOfEmergencyReferral;
	private ims.core.admin.pas.domain.objects.AdmissionDetail admissionDetail;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PendingNoEDEmergencyAdmit (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PendingNoEDEmergencyAdmit ()
    {
    	super();
    }
    public PendingNoEDEmergencyAdmit (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.admin.pas.domain.objects.PendingNoEDEmergencyAdmit.class;
	}


	public ims.domain.lookups.LookupInstance getType() {
		return type;
	}
	public void setType(ims.domain.lookups.LookupInstance type) {
		this.type = type;
	}

	public ims.domain.lookups.LookupInstance getCategory() {
		return category;
	}
	public void setCategory(ims.domain.lookups.LookupInstance category) {
		this.category = category;
	}

	public ims.domain.lookups.LookupInstance getSourceOfReferral() {
		return sourceOfReferral;
	}
	public void setSourceOfReferral(ims.domain.lookups.LookupInstance sourceOfReferral) {
		this.sourceOfReferral = sourceOfReferral;
	}

	public ims.domain.lookups.LookupInstance getTransferReason() {
		return transferReason;
	}
	public void setTransferReason(ims.domain.lookups.LookupInstance transferReason) {
		this.transferReason = transferReason;
	}

	public ims.core.clinical.domain.objects.Service getService() {
		return service;
	}
	public void setService(ims.core.clinical.domain.objects.Service service) {
		this.service = service;
	}

	public ims.core.resource.place.domain.objects.Location getHospital() {
		return hospital;
	}
	public void setHospital(ims.core.resource.place.domain.objects.Location hospital) {
		this.hospital = hospital;
	}

	public ims.core.resource.place.domain.objects.Location getWard() {
		return ward;
	}
	public void setWard(ims.core.resource.place.domain.objects.Location ward) {
		this.ward = ward;
	}

	public String getReferredLocation() {
		return referredLocation;
	}
	public void setReferredLocation(String referredLocation) {
		if ( null != referredLocation && referredLocation.length() > 35 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for referredLocation. Tried to set value: "+
				referredLocation);
		}
		this.referredLocation = referredLocation;
	}

	public String getContactDetails() {
		return contactDetails;
	}
	public void setContactDetails(String contactDetails) {
		if ( null != contactDetails && contactDetails.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for contactDetails. Tried to set value: "+
				contactDetails);
		}
		this.contactDetails = contactDetails;
	}

	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		if ( null != comments && comments.length() > 250 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for comments. Tried to set value: "+
				comments);
		}
		this.comments = comments;
	}

	public java.util.Date getProposedTransferDate() {
		return proposedTransferDate;
	}
	public void setProposedTransferDate(java.util.Date proposedTransferDate) {
		this.proposedTransferDate = proposedTransferDate;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getRecordedBy() {
		return recordedBy;
	}
	public void setRecordedBy(ims.core.resource.people.domain.objects.MemberOfStaff recordedBy) {
		this.recordedBy = recordedBy;
	}

	public java.util.Date getRecordedDateTime() {
		return recordedDateTime;
	}
	public void setRecordedDateTime(java.util.Date recordedDateTime) {
		this.recordedDateTime = recordedDateTime;
	}

	public ims.core.admin.pas.domain.objects.PendingAdmissionStatus getCurrentStatus() {
		return currentStatus;
	}
	public void setCurrentStatus(ims.core.admin.pas.domain.objects.PendingAdmissionStatus currentStatus) {
		this.currentStatus = currentStatus;
	}

	public java.util.List getStatusHistory() {
		if ( null == statusHistory ) {
			statusHistory = new java.util.ArrayList();
		}
		return statusHistory;
	}
	public void setStatusHistory(java.util.List paramValue) {
		this.statusHistory = paramValue;
	}

	public ims.domain.lookups.LookupInstance getSourceOfEmergencyReferral() {
		return sourceOfEmergencyReferral;
	}
	public void setSourceOfEmergencyReferral(ims.domain.lookups.LookupInstance sourceOfEmergencyReferral) {
		this.sourceOfEmergencyReferral = sourceOfEmergencyReferral;
	}

	public ims.core.admin.pas.domain.objects.AdmissionDetail getAdmissionDetail() {
		return admissionDetail;
	}
	public void setAdmissionDetail(ims.core.admin.pas.domain.objects.AdmissionDetail admissionDetail) {
		this.admissionDetail = admissionDetail;
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
		
		auditStr.append("\r\n*type* :");
		if (type != null)
			auditStr.append(type.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*category* :");
		if (category != null)
			auditStr.append(category.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*sourceOfReferral* :");
		if (sourceOfReferral != null)
			auditStr.append(sourceOfReferral.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*transferReason* :");
		if (transferReason != null)
			auditStr.append(transferReason.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*service* :");
		if (service != null)
		{
			auditStr.append(toShortClassName(service));
				
		    auditStr.append(service.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*hospital* :");
		if (hospital != null)
		{
			auditStr.append(toShortClassName(hospital));
				
		    auditStr.append(hospital.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*ward* :");
		if (ward != null)
		{
			auditStr.append(toShortClassName(ward));
				
		    auditStr.append(ward.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*referredLocation* :");
		auditStr.append(referredLocation);
	    auditStr.append("; ");
		auditStr.append("\r\n*contactDetails* :");
		auditStr.append(contactDetails);
	    auditStr.append("; ");
		auditStr.append("\r\n*comments* :");
		auditStr.append(comments);
	    auditStr.append("; ");
		auditStr.append("\r\n*proposedTransferDate* :");
		auditStr.append(proposedTransferDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*recordedBy* :");
		if (recordedBy != null)
		{
			auditStr.append(toShortClassName(recordedBy));
				
		    auditStr.append(recordedBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*recordedDateTime* :");
		auditStr.append(recordedDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*currentStatus* :");
		if (currentStatus != null)
		{
			auditStr.append(toShortClassName(currentStatus));
				
		    auditStr.append(currentStatus.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*statusHistory* :");
		if (statusHistory != null)
		{
		int i15=0;
		for (i15=0; i15<statusHistory.size(); i15++)
		{
			if (i15 > 0)
				auditStr.append(",");
			ims.core.admin.pas.domain.objects.PendingAdmissionStatus obj = (ims.core.admin.pas.domain.objects.PendingAdmissionStatus)statusHistory.get(i15);
		    if (obj != null)
			{
				if (i15 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i15 > 0)
			auditStr.append("] " + i15);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*sourceOfEmergencyReferral* :");
		if (sourceOfEmergencyReferral != null)
			auditStr.append(sourceOfEmergencyReferral.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*admissionDetail* :");
		if (admissionDetail != null)
		{
			auditStr.append(toShortClassName(admissionDetail));
				
		    auditStr.append(admissionDetail.getId());
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
		
		String keyClassName = "PendingNoEDEmergencyAdmit";
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
		if (this.getType() != null)
		{
			sb.append("<type>");
			sb.append(this.getType().toXMLString()); 
			sb.append("</type>");		
		}
		if (this.getCategory() != null)
		{
			sb.append("<category>");
			sb.append(this.getCategory().toXMLString()); 
			sb.append("</category>");		
		}
		if (this.getSourceOfReferral() != null)
		{
			sb.append("<sourceOfReferral>");
			sb.append(this.getSourceOfReferral().toXMLString()); 
			sb.append("</sourceOfReferral>");		
		}
		if (this.getTransferReason() != null)
		{
			sb.append("<transferReason>");
			sb.append(this.getTransferReason().toXMLString()); 
			sb.append("</transferReason>");		
		}
		if (this.getService() != null)
		{
			sb.append("<service>");
			sb.append(this.getService().toXMLString(domMap)); 	
			sb.append("</service>");		
		}
		if (this.getHospital() != null)
		{
			sb.append("<hospital>");
			sb.append(this.getHospital().toXMLString(domMap)); 	
			sb.append("</hospital>");		
		}
		if (this.getWard() != null)
		{
			sb.append("<ward>");
			sb.append(this.getWard().toXMLString(domMap)); 	
			sb.append("</ward>");		
		}
		if (this.getReferredLocation() != null)
		{
			sb.append("<referredLocation>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReferredLocation().toString()));
			sb.append("</referredLocation>");		
		}
		if (this.getContactDetails() != null)
		{
			sb.append("<contactDetails>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getContactDetails().toString()));
			sb.append("</contactDetails>");		
		}
		if (this.getComments() != null)
		{
			sb.append("<comments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getComments().toString()));
			sb.append("</comments>");		
		}
		if (this.getProposedTransferDate() != null)
		{
			sb.append("<proposedTransferDate>");
			sb.append(new ims.framework.utils.DateTime(this.getProposedTransferDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</proposedTransferDate>");		
		}
		if (this.getRecordedBy() != null)
		{
			sb.append("<recordedBy>");
			sb.append(this.getRecordedBy().toXMLString(domMap)); 	
			sb.append("</recordedBy>");		
		}
		if (this.getRecordedDateTime() != null)
		{
			sb.append("<recordedDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getRecordedDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</recordedDateTime>");		
		}
		if (this.getCurrentStatus() != null)
		{
			sb.append("<currentStatus>");
			sb.append(this.getCurrentStatus().toXMLString(domMap)); 	
			sb.append("</currentStatus>");		
		}
		if (this.getStatusHistory() != null)
		{
			if (this.getStatusHistory().size() > 0 )
			{
			sb.append("<statusHistory>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getStatusHistory(), domMap));
			sb.append("</statusHistory>");		
			}
		}
		if (this.getSourceOfEmergencyReferral() != null)
		{
			sb.append("<sourceOfEmergencyReferral>");
			sb.append(this.getSourceOfEmergencyReferral().toXMLString()); 
			sb.append("</sourceOfEmergencyReferral>");		
		}
		if (this.getAdmissionDetail() != null)
		{
			sb.append("<admissionDetail>");
			sb.append(this.getAdmissionDetail().toXMLString(domMap)); 	
			sb.append("</admissionDetail>");		
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
			PendingNoEDEmergencyAdmit domainObject = getPendingNoEDEmergencyAdmitfromXML(itemEl, factory, domMap);

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
			PendingNoEDEmergencyAdmit domainObject = getPendingNoEDEmergencyAdmitfromXML(itemEl, factory, domMap);

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
		
	public static PendingNoEDEmergencyAdmit getPendingNoEDEmergencyAdmitfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPendingNoEDEmergencyAdmitfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PendingNoEDEmergencyAdmit getPendingNoEDEmergencyAdmitfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PendingNoEDEmergencyAdmit.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PendingNoEDEmergencyAdmit.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PendingNoEDEmergencyAdmit class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PendingNoEDEmergencyAdmit)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PendingNoEDEmergencyAdmit.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PendingNoEDEmergencyAdmit ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PendingNoEDEmergencyAdmit)factory.getImportedDomainObject(PendingNoEDEmergencyAdmit.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PendingNoEDEmergencyAdmit();
		}
		String keyClassName = "PendingNoEDEmergencyAdmit";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PendingNoEDEmergencyAdmit)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PendingNoEDEmergencyAdmit obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("type");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("category");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCategory(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("sourceOfReferral");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSourceOfReferral(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("transferReason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTransferReason(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("service");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setService(ims.core.clinical.domain.objects.Service.getServicefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("hospital");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setHospital(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("ward");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setWard(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("referredLocation");
		if(fldEl != null)
		{	
    		obj.setReferredLocation(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("contactDetails");
		if(fldEl != null)
		{	
    		obj.setContactDetails(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("comments");
		if(fldEl != null)
		{	
    		obj.setComments(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("proposedTransferDate");
		if(fldEl != null)
		{	
    		obj.setProposedTransferDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("recordedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRecordedBy(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("recordedDateTime");
		if(fldEl != null)
		{	
    		obj.setRecordedDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("currentStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCurrentStatus(ims.core.admin.pas.domain.objects.PendingAdmissionStatus.getPendingAdmissionStatusfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("statusHistory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setStatusHistory(ims.core.admin.pas.domain.objects.PendingAdmissionStatus.fromListXMLString(fldEl, factory, obj.getStatusHistory(), domMap));
		}
		fldEl = el.element("sourceOfEmergencyReferral");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSourceOfEmergencyReferral(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("admissionDetail");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAdmissionDetail(ims.core.admin.pas.domain.objects.AdmissionDetail.getAdmissionDetailfromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "statusHistory"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Type = "type";
		public static final String Category = "category";
		public static final String SourceOfReferral = "sourceOfReferral";
		public static final String TransferReason = "transferReason";
		public static final String Service = "service";
		public static final String Hospital = "hospital";
		public static final String Ward = "ward";
		public static final String ReferredLocation = "referredLocation";
		public static final String ContactDetails = "contactDetails";
		public static final String Comments = "comments";
		public static final String ProposedTransferDate = "proposedTransferDate";
		public static final String RecordedBy = "recordedBy";
		public static final String RecordedDateTime = "recordedDateTime";
		public static final String CurrentStatus = "currentStatus";
		public static final String StatusHistory = "statusHistory";
		public static final String SourceOfEmergencyReferral = "sourceOfEmergencyReferral";
		public static final String AdmissionDetail = "admissionDetail";
	}
}

