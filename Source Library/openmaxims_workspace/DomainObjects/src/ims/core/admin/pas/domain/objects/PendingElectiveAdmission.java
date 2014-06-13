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
package ims.core.admin.pas.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class PendingElectiveAdmission extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1014100012;
	private static final long serialVersionUID = 1014100012L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** pasEvent */
	private ims.core.admin.pas.domain.objects.PASEvent pasEvent;
	/** TCI Date */
	private java.util.Date tCIDate;
	/** Allocated Ward */
	private ims.core.resource.place.domain.objects.Location allocatedWard;
	/** Procedure
	  * Collection of ims.core.clinical.domain.objects.Procedure.
	  */
	private java.util.Set procedures;
	/** Comments */
	private String comments;
	/** ElectiveAdmissionStatus */
	private ims.domain.lookups.LookupInstance electiveAdmissionStatus;
	/** Ward Type - Main\Side */
	private ims.domain.lookups.LookupInstance wardType;
	/** is the patient - Maternity */
	private Boolean isMaternity;
	/** TCIType PV1.40 BedStatus */
	private ims.domain.lookups.LookupInstance tCIType;
	/** AdmissionSource */
	private ims.domain.lookups.LookupInstance admissionSource;
	/** Reason For Admission */
	private String reasonForAdmission;
	/** ExpectedStay */
	private Integer expectedStay;
	/** TCITime */
	private String tCITime;
	/** ManagementIntention */
	private ims.domain.lookups.LookupInstance managementIntention;
	/** PV1-4 Admission Type */
	private ims.domain.lookups.LookupInstance admissionMethod;
	/** PV1.8 Referring Consultant */
	private ims.core.resource.people.domain.objects.Medic referringConsultant;
	/** PV1.41 PatientStatus */
	private ims.domain.lookups.LookupInstance patientStatus;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PendingElectiveAdmission (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PendingElectiveAdmission ()
    {
    	super();
    }
    public PendingElectiveAdmission (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.admin.pas.domain.objects.PendingElectiveAdmission.class;
	}


	public ims.core.admin.pas.domain.objects.PASEvent getPasEvent() {
		return pasEvent;
	}
	public void setPasEvent(ims.core.admin.pas.domain.objects.PASEvent pasEvent) {
		this.pasEvent = pasEvent;
	}

	public java.util.Date getTCIDate() {
		return tCIDate;
	}
	public void setTCIDate(java.util.Date tCIDate) {
		this.tCIDate = tCIDate;
	}

	public ims.core.resource.place.domain.objects.Location getAllocatedWard() {
		return allocatedWard;
	}
	public void setAllocatedWard(ims.core.resource.place.domain.objects.Location allocatedWard) {
		this.allocatedWard = allocatedWard;
	}

	public java.util.Set getProcedures() {
		if ( null == procedures ) {
			procedures = new java.util.HashSet();
		}
		return procedures;
	}
	public void setProcedures(java.util.Set paramValue) {
		this.procedures = paramValue;
	}

	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		if ( null != comments && comments.length() > 1500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for comments. Tried to set value: "+
				comments);
		}
		this.comments = comments;
	}

	public ims.domain.lookups.LookupInstance getElectiveAdmissionStatus() {
		return electiveAdmissionStatus;
	}
	public void setElectiveAdmissionStatus(ims.domain.lookups.LookupInstance electiveAdmissionStatus) {
		this.electiveAdmissionStatus = electiveAdmissionStatus;
	}

	public ims.domain.lookups.LookupInstance getWardType() {
		return wardType;
	}
	public void setWardType(ims.domain.lookups.LookupInstance wardType) {
		this.wardType = wardType;
	}

	public Boolean isIsMaternity() {
		return isMaternity;
	}
	public void setIsMaternity(Boolean isMaternity) {
		this.isMaternity = isMaternity;
	}

	public ims.domain.lookups.LookupInstance getTCIType() {
		return tCIType;
	}
	public void setTCIType(ims.domain.lookups.LookupInstance tCIType) {
		this.tCIType = tCIType;
	}

	public ims.domain.lookups.LookupInstance getAdmissionSource() {
		return admissionSource;
	}
	public void setAdmissionSource(ims.domain.lookups.LookupInstance admissionSource) {
		this.admissionSource = admissionSource;
	}

	public String getReasonForAdmission() {
		return reasonForAdmission;
	}
	public void setReasonForAdmission(String reasonForAdmission) {
		if ( null != reasonForAdmission && reasonForAdmission.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for reasonForAdmission. Tried to set value: "+
				reasonForAdmission);
		}
		this.reasonForAdmission = reasonForAdmission;
	}

	public Integer getExpectedStay() {
		return expectedStay;
	}
	public void setExpectedStay(Integer expectedStay) {
		this.expectedStay = expectedStay;
	}

	public String getTCITime() {
		return tCITime;
	}
	public void setTCITime(String tCITime) {
		this.tCITime = tCITime;
	}

	public ims.domain.lookups.LookupInstance getManagementIntention() {
		return managementIntention;
	}
	public void setManagementIntention(ims.domain.lookups.LookupInstance managementIntention) {
		this.managementIntention = managementIntention;
	}

	public ims.domain.lookups.LookupInstance getAdmissionMethod() {
		return admissionMethod;
	}
	public void setAdmissionMethod(ims.domain.lookups.LookupInstance admissionMethod) {
		this.admissionMethod = admissionMethod;
	}

	public ims.core.resource.people.domain.objects.Medic getReferringConsultant() {
		return referringConsultant;
	}
	public void setReferringConsultant(ims.core.resource.people.domain.objects.Medic referringConsultant) {
		this.referringConsultant = referringConsultant;
	}

	public ims.domain.lookups.LookupInstance getPatientStatus() {
		return patientStatus;
	}
	public void setPatientStatus(ims.domain.lookups.LookupInstance patientStatus) {
		this.patientStatus = patientStatus;
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
		
		auditStr.append("\r\n*pasEvent* :");
		if (pasEvent != null)
		{
			auditStr.append(toShortClassName(pasEvent));
				
		    auditStr.append(pasEvent.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*tCIDate* :");
		auditStr.append(tCIDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*allocatedWard* :");
		if (allocatedWard != null)
		{
			auditStr.append(toShortClassName(allocatedWard));
				
		    auditStr.append(allocatedWard.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*procedures* :");
		if (procedures != null)
		{
			java.util.Iterator it4 = procedures.iterator();
			int i4=0;
			while (it4.hasNext())
			{
				if (i4 > 0)
					auditStr.append(",");
				ims.core.clinical.domain.objects.Procedure obj = (ims.core.clinical.domain.objects.Procedure)it4.next();
		if (obj != null)
		{
		   if (i4 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i4++;
		}
		if (i4 > 0)
			auditStr.append("] " + i4);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*comments* :");
		auditStr.append(comments);
	    auditStr.append("; ");
		auditStr.append("\r\n*electiveAdmissionStatus* :");
		if (electiveAdmissionStatus != null)
			auditStr.append(electiveAdmissionStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*wardType* :");
		if (wardType != null)
			auditStr.append(wardType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*isMaternity* :");
		auditStr.append(isMaternity);
	    auditStr.append("; ");
		auditStr.append("\r\n*tCIType* :");
		if (tCIType != null)
			auditStr.append(tCIType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*admissionSource* :");
		if (admissionSource != null)
			auditStr.append(admissionSource.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*reasonForAdmission* :");
		auditStr.append(reasonForAdmission);
	    auditStr.append("; ");
		auditStr.append("\r\n*expectedStay* :");
		auditStr.append(expectedStay);
	    auditStr.append("; ");
		auditStr.append("\r\n*tCITime* :");
		auditStr.append(tCITime);
	    auditStr.append("; ");
		auditStr.append("\r\n*managementIntention* :");
		if (managementIntention != null)
			auditStr.append(managementIntention.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*admissionMethod* :");
		if (admissionMethod != null)
			auditStr.append(admissionMethod.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*referringConsultant* :");
		if (referringConsultant != null)
		{
			auditStr.append(toShortClassName(referringConsultant));
				
		    auditStr.append(referringConsultant.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*patientStatus* :");
		if (patientStatus != null)
			auditStr.append(patientStatus.getText());
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
		
		String keyClassName = "PendingElectiveAdmission";
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
		if (this.getPasEvent() != null)
		{
			sb.append("<pasEvent>");
			sb.append(this.getPasEvent().toXMLString(domMap)); 	
			sb.append("</pasEvent>");		
		}
		if (this.getTCIDate() != null)
		{
			sb.append("<tCIDate>");
			sb.append(new ims.framework.utils.DateTime(this.getTCIDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</tCIDate>");		
		}
		if (this.getAllocatedWard() != null)
		{
			sb.append("<allocatedWard>");
			sb.append(this.getAllocatedWard().toXMLString(domMap)); 	
			sb.append("</allocatedWard>");		
		}
		if (this.getProcedures() != null)
		{
			if (this.getProcedures().size() > 0 )
			{
			sb.append("<procedures>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getProcedures(), domMap));
			sb.append("</procedures>");		
			}
		}
		if (this.getComments() != null)
		{
			sb.append("<comments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getComments().toString()));
			sb.append("</comments>");		
		}
		if (this.getElectiveAdmissionStatus() != null)
		{
			sb.append("<electiveAdmissionStatus>");
			sb.append(this.getElectiveAdmissionStatus().toXMLString()); 
			sb.append("</electiveAdmissionStatus>");		
		}
		if (this.getWardType() != null)
		{
			sb.append("<wardType>");
			sb.append(this.getWardType().toXMLString()); 
			sb.append("</wardType>");		
		}
		if (this.isIsMaternity() != null)
		{
			sb.append("<isMaternity>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsMaternity().toString()));
			sb.append("</isMaternity>");		
		}
		if (this.getTCIType() != null)
		{
			sb.append("<tCIType>");
			sb.append(this.getTCIType().toXMLString()); 
			sb.append("</tCIType>");		
		}
		if (this.getAdmissionSource() != null)
		{
			sb.append("<admissionSource>");
			sb.append(this.getAdmissionSource().toXMLString()); 
			sb.append("</admissionSource>");		
		}
		if (this.getReasonForAdmission() != null)
		{
			sb.append("<reasonForAdmission>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReasonForAdmission().toString()));
			sb.append("</reasonForAdmission>");		
		}
		if (this.getExpectedStay() != null)
		{
			sb.append("<expectedStay>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getExpectedStay().toString()));
			sb.append("</expectedStay>");		
		}
		if (this.getTCITime() != null)
		{
			sb.append("<tCITime>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTCITime().toString()));
			sb.append("</tCITime>");		
		}
		if (this.getManagementIntention() != null)
		{
			sb.append("<managementIntention>");
			sb.append(this.getManagementIntention().toXMLString()); 
			sb.append("</managementIntention>");		
		}
		if (this.getAdmissionMethod() != null)
		{
			sb.append("<admissionMethod>");
			sb.append(this.getAdmissionMethod().toXMLString()); 
			sb.append("</admissionMethod>");		
		}
		if (this.getReferringConsultant() != null)
		{
			sb.append("<referringConsultant>");
			sb.append(this.getReferringConsultant().toXMLString(domMap)); 	
			sb.append("</referringConsultant>");		
		}
		if (this.getPatientStatus() != null)
		{
			sb.append("<patientStatus>");
			sb.append(this.getPatientStatus().toXMLString()); 
			sb.append("</patientStatus>");		
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
			PendingElectiveAdmission domainObject = getPendingElectiveAdmissionfromXML(itemEl, factory, domMap);

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
			PendingElectiveAdmission domainObject = getPendingElectiveAdmissionfromXML(itemEl, factory, domMap);

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
		
	public static PendingElectiveAdmission getPendingElectiveAdmissionfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPendingElectiveAdmissionfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PendingElectiveAdmission getPendingElectiveAdmissionfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PendingElectiveAdmission.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PendingElectiveAdmission.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PendingElectiveAdmission class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PendingElectiveAdmission)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PendingElectiveAdmission.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PendingElectiveAdmission ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PendingElectiveAdmission)factory.getImportedDomainObject(PendingElectiveAdmission.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PendingElectiveAdmission();
		}
		String keyClassName = "PendingElectiveAdmission";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PendingElectiveAdmission)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PendingElectiveAdmission obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("pasEvent");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPasEvent(ims.core.admin.pas.domain.objects.PASEvent.getPASEventfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("tCIDate");
		if(fldEl != null)
		{	
    		obj.setTCIDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("allocatedWard");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAllocatedWard(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("procedures");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setProcedures(ims.core.clinical.domain.objects.Procedure.fromSetXMLString(fldEl, factory, obj.getProcedures(), domMap));
		}
		fldEl = el.element("comments");
		if(fldEl != null)
		{	
    		obj.setComments(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("electiveAdmissionStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setElectiveAdmissionStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("wardType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setWardType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("isMaternity");
		if(fldEl != null)
		{	
    		obj.setIsMaternity(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("tCIType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTCIType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("admissionSource");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAdmissionSource(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("reasonForAdmission");
		if(fldEl != null)
		{	
    		obj.setReasonForAdmission(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("expectedStay");
		if(fldEl != null)
		{	
    		obj.setExpectedStay(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("tCITime");
		if(fldEl != null)
		{	
    		obj.setTCITime(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("managementIntention");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setManagementIntention(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("admissionMethod");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAdmissionMethod(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("referringConsultant");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setReferringConsultant(ims.core.resource.people.domain.objects.Medic.getMedicfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("patientStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPatientStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "procedures"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String PasEvent = "pasEvent";
		public static final String TCIDate = "tCIDate";
		public static final String AllocatedWard = "allocatedWard";
		public static final String Procedures = "procedures";
		public static final String Comments = "comments";
		public static final String ElectiveAdmissionStatus = "electiveAdmissionStatus";
		public static final String WardType = "wardType";
		public static final String IsMaternity = "isMaternity";
		public static final String TCIType = "tCIType";
		public static final String AdmissionSource = "admissionSource";
		public static final String ReasonForAdmission = "reasonForAdmission";
		public static final String ExpectedStay = "expectedStay";
		public static final String TCITime = "tCITime";
		public static final String ManagementIntention = "managementIntention";
		public static final String AdmissionMethod = "admissionMethod";
		public static final String ReferringConsultant = "referringConsultant";
		public static final String PatientStatus = "patientStatus";
	}
}

