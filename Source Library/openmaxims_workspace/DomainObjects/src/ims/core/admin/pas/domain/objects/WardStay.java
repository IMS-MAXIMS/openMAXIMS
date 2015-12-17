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
 * @author John MacEnri
 * Generated.
 */


public class WardStay extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1014100004;
	private static final long serialVersionUID = 1014100004L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** ward */
	private ims.core.resource.place.domain.objects.Location ward;
	/** Transfer In Date Time */
	private java.util.Date transferDateTime;
	/** Transfer Out Date Time */
	private java.util.Date transferOutDateTime;
	/** Ward Type - Main\Side */
	private ims.domain.lookups.LookupInstance wardType;
	/** Bed */
	private ims.core.layout.domain.objects.BedSpace bedSpace;
	/** The same as BayConfig.Location for chosen Bay */
	private ims.core.resource.place.domain.objects.Location bay;
	/** Patient Status */
	private ims.domain.lookups.LookupInstance patientStatus;
	/** Reason why patient was allocated to a private bed, event though patient doesn't it has a different patient category. */
	private ims.domain.lookups.LookupInstance reasonPrivateBedAllocated;
	/** Reason why patient was admitted outside of configred hours */
	private ims.domain.lookups.LookupInstance reasonAdmittingOutsideHours;
	/** Reason why patient was admitted to different gender specific bay */
	private ims.domain.lookups.LookupInstance reasonGenderBreach;
	private Boolean admitedInMixedGenderBay;
	private String reasonPrivateBedAllocatedComment;
	private String reasonAdmittingOutsideHoursComment;
	private String reasonGenderBreachComment;
	private ims.core.clinical.domain.objects.Service service;
	private ims.domain.lookups.LookupInstance transferReason;
	private String transferComment;
    public WardStay (Integer id, int ver)
    {
    	super(id, ver);
    }
    public WardStay ()
    {
    	super();
    }
    public WardStay (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.admin.pas.domain.objects.WardStay.class;
	}


	public ims.core.resource.place.domain.objects.Location getWard() {
		return ward;
	}
	public void setWard(ims.core.resource.place.domain.objects.Location ward) {
		this.ward = ward;
	}

	public java.util.Date getTransferDateTime() {
		return transferDateTime;
	}
	public void setTransferDateTime(java.util.Date transferDateTime) {
		this.transferDateTime = transferDateTime;
	}

	public java.util.Date getTransferOutDateTime() {
		return transferOutDateTime;
	}
	public void setTransferOutDateTime(java.util.Date transferOutDateTime) {
		this.transferOutDateTime = transferOutDateTime;
	}

	public ims.domain.lookups.LookupInstance getWardType() {
		return wardType;
	}
	public void setWardType(ims.domain.lookups.LookupInstance wardType) {
		this.wardType = wardType;
	}

	public ims.core.layout.domain.objects.BedSpace getBedSpace() {
		return bedSpace;
	}
	public void setBedSpace(ims.core.layout.domain.objects.BedSpace bedSpace) {
		this.bedSpace = bedSpace;
	}

	public ims.core.resource.place.domain.objects.Location getBay() {
		return bay;
	}
	public void setBay(ims.core.resource.place.domain.objects.Location bay) {
		this.bay = bay;
	}

	public ims.domain.lookups.LookupInstance getPatientStatus() {
		return patientStatus;
	}
	public void setPatientStatus(ims.domain.lookups.LookupInstance patientStatus) {
		this.patientStatus = patientStatus;
	}

	public ims.domain.lookups.LookupInstance getReasonPrivateBedAllocated() {
		return reasonPrivateBedAllocated;
	}
	public void setReasonPrivateBedAllocated(ims.domain.lookups.LookupInstance reasonPrivateBedAllocated) {
		this.reasonPrivateBedAllocated = reasonPrivateBedAllocated;
	}

	public ims.domain.lookups.LookupInstance getReasonAdmittingOutsideHours() {
		return reasonAdmittingOutsideHours;
	}
	public void setReasonAdmittingOutsideHours(ims.domain.lookups.LookupInstance reasonAdmittingOutsideHours) {
		this.reasonAdmittingOutsideHours = reasonAdmittingOutsideHours;
	}

	public ims.domain.lookups.LookupInstance getReasonGenderBreach() {
		return reasonGenderBreach;
	}
	public void setReasonGenderBreach(ims.domain.lookups.LookupInstance reasonGenderBreach) {
		this.reasonGenderBreach = reasonGenderBreach;
	}

	public Boolean isAdmitedInMixedGenderBay() {
		return admitedInMixedGenderBay;
	}
	public void setAdmitedInMixedGenderBay(Boolean admitedInMixedGenderBay) {
		this.admitedInMixedGenderBay = admitedInMixedGenderBay;
	}

	public String getReasonPrivateBedAllocatedComment() {
		return reasonPrivateBedAllocatedComment;
	}
	public void setReasonPrivateBedAllocatedComment(String reasonPrivateBedAllocatedComment) {
		if ( null != reasonPrivateBedAllocatedComment && reasonPrivateBedAllocatedComment.length() > 250 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for reasonPrivateBedAllocatedComment. Tried to set value: "+
				reasonPrivateBedAllocatedComment);
		}
		this.reasonPrivateBedAllocatedComment = reasonPrivateBedAllocatedComment;
	}

	public String getReasonAdmittingOutsideHoursComment() {
		return reasonAdmittingOutsideHoursComment;
	}
	public void setReasonAdmittingOutsideHoursComment(String reasonAdmittingOutsideHoursComment) {
		if ( null != reasonAdmittingOutsideHoursComment && reasonAdmittingOutsideHoursComment.length() > 250 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for reasonAdmittingOutsideHoursComment. Tried to set value: "+
				reasonAdmittingOutsideHoursComment);
		}
		this.reasonAdmittingOutsideHoursComment = reasonAdmittingOutsideHoursComment;
	}

	public String getReasonGenderBreachComment() {
		return reasonGenderBreachComment;
	}
	public void setReasonGenderBreachComment(String reasonGenderBreachComment) {
		if ( null != reasonGenderBreachComment && reasonGenderBreachComment.length() > 250 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for reasonGenderBreachComment. Tried to set value: "+
				reasonGenderBreachComment);
		}
		this.reasonGenderBreachComment = reasonGenderBreachComment;
	}

	public ims.core.clinical.domain.objects.Service getService() {
		return service;
	}
	public void setService(ims.core.clinical.domain.objects.Service service) {
		this.service = service;
	}

	public ims.domain.lookups.LookupInstance getTransferReason() {
		return transferReason;
	}
	public void setTransferReason(ims.domain.lookups.LookupInstance transferReason) {
		this.transferReason = transferReason;
	}

	public String getTransferComment() {
		return transferComment;
	}
	public void setTransferComment(String transferComment) {
		if ( null != transferComment && transferComment.length() > 250 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for transferComment. Tried to set value: "+
				transferComment);
		}
		this.transferComment = transferComment;
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
		
		auditStr.append("\r\n*ward* :");
		if (ward != null)
		{
			auditStr.append(toShortClassName(ward));
				
		    auditStr.append(ward.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*transferDateTime* :");
		auditStr.append(transferDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*transferOutDateTime* :");
		auditStr.append(transferOutDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*wardType* :");
		if (wardType != null)
			auditStr.append(wardType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*bedSpace* :");
		if (bedSpace != null)
		{
			auditStr.append(toShortClassName(bedSpace));
				
		    auditStr.append(bedSpace.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*bay* :");
		if (bay != null)
		{
			auditStr.append(toShortClassName(bay));
				
		    auditStr.append(bay.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*patientStatus* :");
		if (patientStatus != null)
			auditStr.append(patientStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*reasonPrivateBedAllocated* :");
		if (reasonPrivateBedAllocated != null)
			auditStr.append(reasonPrivateBedAllocated.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*reasonAdmittingOutsideHours* :");
		if (reasonAdmittingOutsideHours != null)
			auditStr.append(reasonAdmittingOutsideHours.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*reasonGenderBreach* :");
		if (reasonGenderBreach != null)
			auditStr.append(reasonGenderBreach.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*admitedInMixedGenderBay* :");
		auditStr.append(admitedInMixedGenderBay);
	    auditStr.append("; ");
		auditStr.append("\r\n*reasonPrivateBedAllocatedComment* :");
		auditStr.append(reasonPrivateBedAllocatedComment);
	    auditStr.append("; ");
		auditStr.append("\r\n*reasonAdmittingOutsideHoursComment* :");
		auditStr.append(reasonAdmittingOutsideHoursComment);
	    auditStr.append("; ");
		auditStr.append("\r\n*reasonGenderBreachComment* :");
		auditStr.append(reasonGenderBreachComment);
	    auditStr.append("; ");
		auditStr.append("\r\n*service* :");
		if (service != null)
		{
			auditStr.append(toShortClassName(service));
				
		    auditStr.append(service.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*transferReason* :");
		if (transferReason != null)
			auditStr.append(transferReason.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*transferComment* :");
		auditStr.append(transferComment);
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
		
		String keyClassName = "WardStay";
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
		if (this.getWard() != null)
		{
			sb.append("<ward>");
			sb.append(this.getWard().toXMLString(domMap)); 	
			sb.append("</ward>");		
		}
		if (this.getTransferDateTime() != null)
		{
			sb.append("<transferDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getTransferDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</transferDateTime>");		
		}
		if (this.getTransferOutDateTime() != null)
		{
			sb.append("<transferOutDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getTransferOutDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</transferOutDateTime>");		
		}
		if (this.getWardType() != null)
		{
			sb.append("<wardType>");
			sb.append(this.getWardType().toXMLString()); 
			sb.append("</wardType>");		
		}
		if (this.getBedSpace() != null)
		{
			sb.append("<bedSpace>");
			sb.append(this.getBedSpace().toXMLString(domMap)); 	
			sb.append("</bedSpace>");		
		}
		if (this.getBay() != null)
		{
			sb.append("<bay>");
			sb.append(this.getBay().toXMLString(domMap)); 	
			sb.append("</bay>");		
		}
		if (this.getPatientStatus() != null)
		{
			sb.append("<patientStatus>");
			sb.append(this.getPatientStatus().toXMLString()); 
			sb.append("</patientStatus>");		
		}
		if (this.getReasonPrivateBedAllocated() != null)
		{
			sb.append("<reasonPrivateBedAllocated>");
			sb.append(this.getReasonPrivateBedAllocated().toXMLString()); 
			sb.append("</reasonPrivateBedAllocated>");		
		}
		if (this.getReasonAdmittingOutsideHours() != null)
		{
			sb.append("<reasonAdmittingOutsideHours>");
			sb.append(this.getReasonAdmittingOutsideHours().toXMLString()); 
			sb.append("</reasonAdmittingOutsideHours>");		
		}
		if (this.getReasonGenderBreach() != null)
		{
			sb.append("<reasonGenderBreach>");
			sb.append(this.getReasonGenderBreach().toXMLString()); 
			sb.append("</reasonGenderBreach>");		
		}
		if (this.isAdmitedInMixedGenderBay() != null)
		{
			sb.append("<admitedInMixedGenderBay>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isAdmitedInMixedGenderBay().toString()));
			sb.append("</admitedInMixedGenderBay>");		
		}
		if (this.getReasonPrivateBedAllocatedComment() != null)
		{
			sb.append("<reasonPrivateBedAllocatedComment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReasonPrivateBedAllocatedComment().toString()));
			sb.append("</reasonPrivateBedAllocatedComment>");		
		}
		if (this.getReasonAdmittingOutsideHoursComment() != null)
		{
			sb.append("<reasonAdmittingOutsideHoursComment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReasonAdmittingOutsideHoursComment().toString()));
			sb.append("</reasonAdmittingOutsideHoursComment>");		
		}
		if (this.getReasonGenderBreachComment() != null)
		{
			sb.append("<reasonGenderBreachComment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReasonGenderBreachComment().toString()));
			sb.append("</reasonGenderBreachComment>");		
		}
		if (this.getService() != null)
		{
			sb.append("<service>");
			sb.append(this.getService().toXMLString(domMap)); 	
			sb.append("</service>");		
		}
		if (this.getTransferReason() != null)
		{
			sb.append("<transferReason>");
			sb.append(this.getTransferReason().toXMLString()); 
			sb.append("</transferReason>");		
		}
		if (this.getTransferComment() != null)
		{
			sb.append("<transferComment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTransferComment().toString()));
			sb.append("</transferComment>");		
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
			WardStay domainObject = getWardStayfromXML(itemEl, factory, domMap);

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
			WardStay domainObject = getWardStayfromXML(itemEl, factory, domMap);

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
		
	public static WardStay getWardStayfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getWardStayfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static WardStay getWardStayfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!WardStay.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!WardStay.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the WardStay class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (WardStay)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(WardStay.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		WardStay ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (WardStay)factory.getImportedDomainObject(WardStay.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new WardStay();
		}
		String keyClassName = "WardStay";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (WardStay)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, WardStay obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("ward");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setWard(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("transferDateTime");
		if(fldEl != null)
		{	
    		obj.setTransferDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("transferOutDateTime");
		if(fldEl != null)
		{	
    		obj.setTransferOutDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("wardType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setWardType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("bedSpace");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setBedSpace(ims.core.layout.domain.objects.BedSpace.getBedSpacefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("bay");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setBay(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("patientStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPatientStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("reasonPrivateBedAllocated");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReasonPrivateBedAllocated(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("reasonAdmittingOutsideHours");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReasonAdmittingOutsideHours(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("reasonGenderBreach");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReasonGenderBreach(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("admitedInMixedGenderBay");
		if(fldEl != null)
		{	
    		obj.setAdmitedInMixedGenderBay(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("reasonPrivateBedAllocatedComment");
		if(fldEl != null)
		{	
    		obj.setReasonPrivateBedAllocatedComment(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("reasonAdmittingOutsideHoursComment");
		if(fldEl != null)
		{	
    		obj.setReasonAdmittingOutsideHoursComment(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("reasonGenderBreachComment");
		if(fldEl != null)
		{	
    		obj.setReasonGenderBreachComment(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("service");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setService(ims.core.clinical.domain.objects.Service.getServicefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("transferReason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTransferReason(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("transferComment");
		if(fldEl != null)
		{	
    		obj.setTransferComment(new String(fldEl.getTextTrim()));	
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
		public static final String Ward = "ward";
		public static final String TransferDateTime = "transferDateTime";
		public static final String TransferOutDateTime = "transferOutDateTime";
		public static final String WardType = "wardType";
		public static final String BedSpace = "bedSpace";
		public static final String Bay = "bay";
		public static final String PatientStatus = "patientStatus";
		public static final String ReasonPrivateBedAllocated = "reasonPrivateBedAllocated";
		public static final String ReasonAdmittingOutsideHours = "reasonAdmittingOutsideHours";
		public static final String ReasonGenderBreach = "reasonGenderBreach";
		public static final String AdmitedInMixedGenderBay = "admitedInMixedGenderBay";
		public static final String ReasonPrivateBedAllocatedComment = "reasonPrivateBedAllocatedComment";
		public static final String ReasonAdmittingOutsideHoursComment = "reasonAdmittingOutsideHoursComment";
		public static final String ReasonGenderBreachComment = "reasonGenderBreachComment";
		public static final String Service = "service";
		public static final String TransferReason = "transferReason";
		public static final String TransferComment = "transferComment";
	}
}

