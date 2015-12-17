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


public class PendingEmergencyAdmission extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1014100011;
	private static final long serialVersionUID = 1014100011L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** pasEvent */
	private ims.core.admin.pas.domain.objects.PASEvent pasEvent;
	/** Emergency Admission Status */
	private ims.domain.lookups.LookupInstance admissionStatus;
	/** Decision to Admit Date Time */
	private java.util.Date dTADateTime;
	/** Admission Type */
	private ims.domain.lookups.LookupInstance admissionType;
	/** Reason for Admission */
	private String reasonForAdmission;
	/** Current Location */
	private ims.core.resource.place.domain.objects.Location currentLocation;
	/** Allocated Ward */
	private ims.core.resource.place.domain.objects.Location allocatedWard;
	/** Comments */
	private String comments;
	/** A&E discharge date time */
	private java.util.Date conclusionDate;
	/** BedTypeRequested */
	private ims.domain.lookups.LookupInstance bedTypeRequested;
	/** Allocated Ward History
	  * Collection of ims.core.admin.pas.domain.objects.AllocatedWardHistory.
	  */
	private java.util.Set allocatedWardHistory;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PendingEmergencyAdmission (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PendingEmergencyAdmission ()
    {
    	super();
    }
    public PendingEmergencyAdmission (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.admin.pas.domain.objects.PendingEmergencyAdmission.class;
	}


	public ims.core.admin.pas.domain.objects.PASEvent getPasEvent() {
		return pasEvent;
	}
	public void setPasEvent(ims.core.admin.pas.domain.objects.PASEvent pasEvent) {
		this.pasEvent = pasEvent;
	}

	public ims.domain.lookups.LookupInstance getAdmissionStatus() {
		return admissionStatus;
	}
	public void setAdmissionStatus(ims.domain.lookups.LookupInstance admissionStatus) {
		this.admissionStatus = admissionStatus;
	}

	public java.util.Date getDTADateTime() {
		return dTADateTime;
	}
	public void setDTADateTime(java.util.Date dTADateTime) {
		this.dTADateTime = dTADateTime;
	}

	public ims.domain.lookups.LookupInstance getAdmissionType() {
		return admissionType;
	}
	public void setAdmissionType(ims.domain.lookups.LookupInstance admissionType) {
		this.admissionType = admissionType;
	}

	public String getReasonForAdmission() {
		return reasonForAdmission;
	}
	public void setReasonForAdmission(String reasonForAdmission) {
		if ( null != reasonForAdmission && reasonForAdmission.length() > 1500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for reasonForAdmission. Tried to set value: "+
				reasonForAdmission);
		}
		this.reasonForAdmission = reasonForAdmission;
	}

	public ims.core.resource.place.domain.objects.Location getCurrentLocation() {
		return currentLocation;
	}
	public void setCurrentLocation(ims.core.resource.place.domain.objects.Location currentLocation) {
		this.currentLocation = currentLocation;
	}

	public ims.core.resource.place.domain.objects.Location getAllocatedWard() {
		return allocatedWard;
	}
	public void setAllocatedWard(ims.core.resource.place.domain.objects.Location allocatedWard) {
		this.allocatedWard = allocatedWard;
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

	public java.util.Date getConclusionDate() {
		return conclusionDate;
	}
	public void setConclusionDate(java.util.Date conclusionDate) {
		this.conclusionDate = conclusionDate;
	}

	public ims.domain.lookups.LookupInstance getBedTypeRequested() {
		return bedTypeRequested;
	}
	public void setBedTypeRequested(ims.domain.lookups.LookupInstance bedTypeRequested) {
		this.bedTypeRequested = bedTypeRequested;
	}

	public java.util.Set getAllocatedWardHistory() {
		if ( null == allocatedWardHistory ) {
			allocatedWardHistory = new java.util.HashSet();
		}
		return allocatedWardHistory;
	}
	public void setAllocatedWardHistory(java.util.Set paramValue) {
		this.allocatedWardHistory = paramValue;
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
		auditStr.append("\r\n*admissionStatus* :");
		if (admissionStatus != null)
			auditStr.append(admissionStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*dTADateTime* :");
		auditStr.append(dTADateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*admissionType* :");
		if (admissionType != null)
			auditStr.append(admissionType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*reasonForAdmission* :");
		auditStr.append(reasonForAdmission);
	    auditStr.append("; ");
		auditStr.append("\r\n*currentLocation* :");
		if (currentLocation != null)
		{
			auditStr.append(toShortClassName(currentLocation));
				
		    auditStr.append(currentLocation.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*allocatedWard* :");
		if (allocatedWard != null)
		{
			auditStr.append(toShortClassName(allocatedWard));
				
		    auditStr.append(allocatedWard.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*comments* :");
		auditStr.append(comments);
	    auditStr.append("; ");
		auditStr.append("\r\n*conclusionDate* :");
		auditStr.append(conclusionDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*bedTypeRequested* :");
		if (bedTypeRequested != null)
			auditStr.append(bedTypeRequested.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*allocatedWardHistory* :");
		if (allocatedWardHistory != null)
		{
			java.util.Iterator it11 = allocatedWardHistory.iterator();
			int i11=0;
			while (it11.hasNext())
			{
				if (i11 > 0)
					auditStr.append(",");
				ims.core.admin.pas.domain.objects.AllocatedWardHistory obj = (ims.core.admin.pas.domain.objects.AllocatedWardHistory)it11.next();
		if (obj != null)
		{
		   if (i11 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i11++;
		}
		if (i11 > 0)
			auditStr.append("] " + i11);
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
		
		String keyClassName = "PendingEmergencyAdmission";
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
		if (this.getAdmissionStatus() != null)
		{
			sb.append("<admissionStatus>");
			sb.append(this.getAdmissionStatus().toXMLString()); 
			sb.append("</admissionStatus>");		
		}
		if (this.getDTADateTime() != null)
		{
			sb.append("<dTADateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getDTADateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dTADateTime>");		
		}
		if (this.getAdmissionType() != null)
		{
			sb.append("<admissionType>");
			sb.append(this.getAdmissionType().toXMLString()); 
			sb.append("</admissionType>");		
		}
		if (this.getReasonForAdmission() != null)
		{
			sb.append("<reasonForAdmission>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReasonForAdmission().toString()));
			sb.append("</reasonForAdmission>");		
		}
		if (this.getCurrentLocation() != null)
		{
			sb.append("<currentLocation>");
			sb.append(this.getCurrentLocation().toXMLString(domMap)); 	
			sb.append("</currentLocation>");		
		}
		if (this.getAllocatedWard() != null)
		{
			sb.append("<allocatedWard>");
			sb.append(this.getAllocatedWard().toXMLString(domMap)); 	
			sb.append("</allocatedWard>");		
		}
		if (this.getComments() != null)
		{
			sb.append("<comments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getComments().toString()));
			sb.append("</comments>");		
		}
		if (this.getConclusionDate() != null)
		{
			sb.append("<conclusionDate>");
			sb.append(new ims.framework.utils.DateTime(this.getConclusionDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</conclusionDate>");		
		}
		if (this.getBedTypeRequested() != null)
		{
			sb.append("<bedTypeRequested>");
			sb.append(this.getBedTypeRequested().toXMLString()); 
			sb.append("</bedTypeRequested>");		
		}
		if (this.getAllocatedWardHistory() != null)
		{
			if (this.getAllocatedWardHistory().size() > 0 )
			{
			sb.append("<allocatedWardHistory>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getAllocatedWardHistory(), domMap));
			sb.append("</allocatedWardHistory>");		
			}
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
			PendingEmergencyAdmission domainObject = getPendingEmergencyAdmissionfromXML(itemEl, factory, domMap);

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
			PendingEmergencyAdmission domainObject = getPendingEmergencyAdmissionfromXML(itemEl, factory, domMap);

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
		
	public static PendingEmergencyAdmission getPendingEmergencyAdmissionfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPendingEmergencyAdmissionfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PendingEmergencyAdmission getPendingEmergencyAdmissionfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PendingEmergencyAdmission.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PendingEmergencyAdmission.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PendingEmergencyAdmission class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PendingEmergencyAdmission)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PendingEmergencyAdmission.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PendingEmergencyAdmission ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PendingEmergencyAdmission)factory.getImportedDomainObject(PendingEmergencyAdmission.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PendingEmergencyAdmission();
		}
		String keyClassName = "PendingEmergencyAdmission";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PendingEmergencyAdmission)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PendingEmergencyAdmission obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("pasEvent");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPasEvent(ims.core.admin.pas.domain.objects.PASEvent.getPASEventfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("admissionStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAdmissionStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("dTADateTime");
		if(fldEl != null)
		{	
    		obj.setDTADateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("admissionType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAdmissionType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("reasonForAdmission");
		if(fldEl != null)
		{	
    		obj.setReasonForAdmission(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("currentLocation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCurrentLocation(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("allocatedWard");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAllocatedWard(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("comments");
		if(fldEl != null)
		{	
    		obj.setComments(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("conclusionDate");
		if(fldEl != null)
		{	
    		obj.setConclusionDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("bedTypeRequested");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setBedTypeRequested(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("allocatedWardHistory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setAllocatedWardHistory(ims.core.admin.pas.domain.objects.AllocatedWardHistory.fromSetXMLString(fldEl, factory, obj.getAllocatedWardHistory(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "allocatedWardHistory"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String PasEvent = "pasEvent";
		public static final String AdmissionStatus = "admissionStatus";
		public static final String DTADateTime = "dTADateTime";
		public static final String AdmissionType = "admissionType";
		public static final String ReasonForAdmission = "reasonForAdmission";
		public static final String CurrentLocation = "currentLocation";
		public static final String AllocatedWard = "allocatedWard";
		public static final String Comments = "comments";
		public static final String ConclusionDate = "conclusionDate";
		public static final String BedTypeRequested = "bedTypeRequested";
		public static final String AllocatedWardHistory = "allocatedWardHistory";
	}
}

