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
package ims.ntpf.locall.domain.objects;

/**
 * This assumes the call is a request for referral
 * @author Joan Heelan
 * Generated.
 */


public class LoCall extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1039100000;
	private static final long serialVersionUID = 1039100000L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Lo-Call Number */
	private String loCallNumber;
	/** Lo-Call Date */
	private java.util.Date loCallDate;
	/** How did caller hear about NTPF? */
	private ims.domain.lookups.LookupInstance whereHeard;
	/** Caller Relationship - Patient, GP, Mother, Father, Spouse, Guardian */
	private ims.domain.lookups.LookupInstance callerRelationship;
	/** Call Type - GP Referral, Patient Self Referral, & Guardian */
	private ims.domain.lookups.LookupInstance callType;
	/** Caller Name - only enabled if caller type is not equal to GP */
	private String callerName;
	/** Caller Number - only enabled if caller type is not equal to GP */
	private String callerNumber;
	/** Waiting List Details
	  * Collection of ims.ntpf.locall.domain.objects.LoCallWaitingListDetails.
	  */
	private java.util.Set waitingListDetails;
	/** Patient CheckList
	  * Collection of ims.ntpf.locall.domain.objects.PatientCheckList.
	  */
	private java.util.Set patientCheckList;
	/** GP Details */
	private ims.ntpf.locall.domain.objects.GPDetails gPDetails;
	/** LoCall Comments
	  * Collection of ims.ntpf.common.domain.objects.Comment.
	  */
	private java.util.Set loCallComments;
	/** Patient */
	private ims.core.patient.domain.objects.Patient patient;
	/** Medical Insurance */
	private ims.domain.lookups.LookupInstance medicalInsurance;
	/** Insurance Type */
	private ims.domain.lookups.LookupInstance insuranceType;
	/** True if comments recorded against locall */
	private Boolean hasComments;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public LoCall (Integer id, int ver)
    {
    	super(id, ver);
    }
    public LoCall ()
    {
    	super();
    }
    public LoCall (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.ntpf.locall.domain.objects.LoCall.class;
	}


	public String getLoCallNumber() {
		return loCallNumber;
	}
	public void setLoCallNumber(String loCallNumber) {
		this.loCallNumber = loCallNumber;
	}

	public java.util.Date getLoCallDate() {
		return loCallDate;
	}
	public void setLoCallDate(java.util.Date loCallDate) {
		this.loCallDate = loCallDate;
	}

	public ims.domain.lookups.LookupInstance getWhereHeard() {
		return whereHeard;
	}
	public void setWhereHeard(ims.domain.lookups.LookupInstance whereHeard) {
		this.whereHeard = whereHeard;
	}

	public ims.domain.lookups.LookupInstance getCallerRelationship() {
		return callerRelationship;
	}
	public void setCallerRelationship(ims.domain.lookups.LookupInstance callerRelationship) {
		this.callerRelationship = callerRelationship;
	}

	public ims.domain.lookups.LookupInstance getCallType() {
		return callType;
	}
	public void setCallType(ims.domain.lookups.LookupInstance callType) {
		this.callType = callType;
	}

	public String getCallerName() {
		return callerName;
	}
	public void setCallerName(String callerName) {
		if ( null != callerName && callerName.length() > 50 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for callerName. Tried to set value: "+
				callerName);
		}
		this.callerName = callerName;
	}

	public String getCallerNumber() {
		return callerNumber;
	}
	public void setCallerNumber(String callerNumber) {
		if ( null != callerNumber && callerNumber.length() > 30 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for callerNumber. Tried to set value: "+
				callerNumber);
		}
		this.callerNumber = callerNumber;
	}

	public java.util.Set getWaitingListDetails() {
		if ( null == waitingListDetails ) {
			waitingListDetails = new java.util.HashSet();
		}
		return waitingListDetails;
	}
	public void setWaitingListDetails(java.util.Set paramValue) {
		this.waitingListDetails = paramValue;
	}

	public java.util.Set getPatientCheckList() {
		if ( null == patientCheckList ) {
			patientCheckList = new java.util.HashSet();
		}
		return patientCheckList;
	}
	public void setPatientCheckList(java.util.Set paramValue) {
		this.patientCheckList = paramValue;
	}

	public ims.ntpf.locall.domain.objects.GPDetails getGPDetails() {
		return gPDetails;
	}
	public void setGPDetails(ims.ntpf.locall.domain.objects.GPDetails gPDetails) {
		this.gPDetails = gPDetails;
	}

	public java.util.Set getLoCallComments() {
		if ( null == loCallComments ) {
			loCallComments = new java.util.HashSet();
		}
		return loCallComments;
	}
	public void setLoCallComments(java.util.Set paramValue) {
		this.loCallComments = paramValue;
	}

	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public ims.domain.lookups.LookupInstance getMedicalInsurance() {
		return medicalInsurance;
	}
	public void setMedicalInsurance(ims.domain.lookups.LookupInstance medicalInsurance) {
		this.medicalInsurance = medicalInsurance;
	}

	public ims.domain.lookups.LookupInstance getInsuranceType() {
		return insuranceType;
	}
	public void setInsuranceType(ims.domain.lookups.LookupInstance insuranceType) {
		this.insuranceType = insuranceType;
	}

	public Boolean isHasComments() {
		return hasComments;
	}
	public void setHasComments(Boolean hasComments) {
		this.hasComments = hasComments;
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
		
		auditStr.append("\r\n*loCallNumber* :");
		auditStr.append(loCallNumber);
	    auditStr.append("; ");
		auditStr.append("\r\n*loCallDate* :");
		auditStr.append(loCallDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*whereHeard* :");
		if (whereHeard != null)
			auditStr.append(whereHeard.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*callerRelationship* :");
		if (callerRelationship != null)
			auditStr.append(callerRelationship.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*callType* :");
		if (callType != null)
			auditStr.append(callType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*callerName* :");
		auditStr.append(callerName);
	    auditStr.append("; ");
		auditStr.append("\r\n*callerNumber* :");
		auditStr.append(callerNumber);
	    auditStr.append("; ");
		auditStr.append("\r\n*waitingListDetails* :");
		if (waitingListDetails != null)
		{
			java.util.Iterator it8 = waitingListDetails.iterator();
			int i8=0;
			while (it8.hasNext())
			{
				if (i8 > 0)
					auditStr.append(",");
				ims.ntpf.locall.domain.objects.LoCallWaitingListDetails obj = (ims.ntpf.locall.domain.objects.LoCallWaitingListDetails)it8.next();
		if (obj != null)
		{
		   if (i8 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i8++;
		}
		if (i8 > 0)
			auditStr.append("] " + i8);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*patientCheckList* :");
		if (patientCheckList != null)
		{
			java.util.Iterator it9 = patientCheckList.iterator();
			int i9=0;
			while (it9.hasNext())
			{
				if (i9 > 0)
					auditStr.append(",");
				ims.ntpf.locall.domain.objects.PatientCheckList obj = (ims.ntpf.locall.domain.objects.PatientCheckList)it9.next();
		if (obj != null)
		{
		   if (i9 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i9++;
		}
		if (i9 > 0)
			auditStr.append("] " + i9);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*gPDetails* :");
		if (gPDetails != null)
		{
			auditStr.append(toShortClassName(gPDetails));
				
		    auditStr.append(gPDetails.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*loCallComments* :");
		if (loCallComments != null)
		{
			java.util.Iterator it11 = loCallComments.iterator();
			int i11=0;
			while (it11.hasNext())
			{
				if (i11 > 0)
					auditStr.append(",");
				ims.ntpf.common.domain.objects.Comment obj = (ims.ntpf.common.domain.objects.Comment)it11.next();
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
		auditStr.append("\r\n*patient* :");
		if (patient != null)
		{
			auditStr.append(toShortClassName(patient));
				
		    auditStr.append(patient.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*medicalInsurance* :");
		if (medicalInsurance != null)
			auditStr.append(medicalInsurance.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*insuranceType* :");
		if (insuranceType != null)
			auditStr.append(insuranceType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*hasComments* :");
		auditStr.append(hasComments);
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
		
		String keyClassName = "LoCall";
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
		if (this.getLoCallNumber() != null)
		{
			sb.append("<loCallNumber>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLoCallNumber().toString()));
			sb.append("</loCallNumber>");		
		}
		if (this.getLoCallDate() != null)
		{
			sb.append("<loCallDate>");
			sb.append(new ims.framework.utils.DateTime(this.getLoCallDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</loCallDate>");		
		}
		if (this.getWhereHeard() != null)
		{
			sb.append("<whereHeard>");
			sb.append(this.getWhereHeard().toXMLString()); 
			sb.append("</whereHeard>");		
		}
		if (this.getCallerRelationship() != null)
		{
			sb.append("<callerRelationship>");
			sb.append(this.getCallerRelationship().toXMLString()); 
			sb.append("</callerRelationship>");		
		}
		if (this.getCallType() != null)
		{
			sb.append("<callType>");
			sb.append(this.getCallType().toXMLString()); 
			sb.append("</callType>");		
		}
		if (this.getCallerName() != null)
		{
			sb.append("<callerName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCallerName().toString()));
			sb.append("</callerName>");		
		}
		if (this.getCallerNumber() != null)
		{
			sb.append("<callerNumber>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCallerNumber().toString()));
			sb.append("</callerNumber>");		
		}
		if (this.getWaitingListDetails() != null)
		{
			if (this.getWaitingListDetails().size() > 0 )
			{
			sb.append("<waitingListDetails>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getWaitingListDetails(), domMap));
			sb.append("</waitingListDetails>");		
			}
		}
		if (this.getPatientCheckList() != null)
		{
			if (this.getPatientCheckList().size() > 0 )
			{
			sb.append("<patientCheckList>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getPatientCheckList(), domMap));
			sb.append("</patientCheckList>");		
			}
		}
		if (this.getGPDetails() != null)
		{
			sb.append("<gPDetails>");
			sb.append(this.getGPDetails().toXMLString(domMap)); 	
			sb.append("</gPDetails>");		
		}
		if (this.getLoCallComments() != null)
		{
			if (this.getLoCallComments().size() > 0 )
			{
			sb.append("<loCallComments>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getLoCallComments(), domMap));
			sb.append("</loCallComments>");		
			}
		}
		if (this.getPatient() != null)
		{
			sb.append("<patient>");
			sb.append(this.getPatient().toXMLString(domMap)); 	
			sb.append("</patient>");		
		}
		if (this.getMedicalInsurance() != null)
		{
			sb.append("<medicalInsurance>");
			sb.append(this.getMedicalInsurance().toXMLString()); 
			sb.append("</medicalInsurance>");		
		}
		if (this.getInsuranceType() != null)
		{
			sb.append("<insuranceType>");
			sb.append(this.getInsuranceType().toXMLString()); 
			sb.append("</insuranceType>");		
		}
		if (this.isHasComments() != null)
		{
			sb.append("<hasComments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHasComments().toString()));
			sb.append("</hasComments>");		
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
			LoCall domainObject = getLoCallfromXML(itemEl, factory, domMap);

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
			LoCall domainObject = getLoCallfromXML(itemEl, factory, domMap);

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
		
	public static LoCall getLoCallfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getLoCallfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static LoCall getLoCallfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!LoCall.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!LoCall.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the LoCall class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (LoCall)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(LoCall.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		LoCall ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (LoCall)factory.getImportedDomainObject(LoCall.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new LoCall();
		}
		String keyClassName = "LoCall";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (LoCall)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, LoCall obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("loCallNumber");
		if(fldEl != null)
		{	
    		obj.setLoCallNumber(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("loCallDate");
		if(fldEl != null)
		{	
    		obj.setLoCallDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("whereHeard");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setWhereHeard(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("callerRelationship");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCallerRelationship(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("callType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCallType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("callerName");
		if(fldEl != null)
		{	
    		obj.setCallerName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("callerNumber");
		if(fldEl != null)
		{	
    		obj.setCallerNumber(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("waitingListDetails");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setWaitingListDetails(ims.ntpf.locall.domain.objects.LoCallWaitingListDetails.fromSetXMLString(fldEl, factory, obj.getWaitingListDetails(), domMap));
		}
		fldEl = el.element("patientCheckList");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setPatientCheckList(ims.ntpf.locall.domain.objects.PatientCheckList.fromSetXMLString(fldEl, factory, obj.getPatientCheckList(), domMap));
		}
		fldEl = el.element("gPDetails");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setGPDetails(ims.ntpf.locall.domain.objects.GPDetails.getGPDetailsfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("loCallComments");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setLoCallComments(ims.ntpf.common.domain.objects.Comment.fromSetXMLString(fldEl, factory, obj.getLoCallComments(), domMap));
		}
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("medicalInsurance");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setMedicalInsurance(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("insuranceType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setInsuranceType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("hasComments");
		if(fldEl != null)
		{	
    		obj.setHasComments(new Boolean(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "waitingListDetails"
		, "patientCheckList"
		, "loCallComments"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String LoCallNumber = "loCallNumber";
		public static final String LoCallDate = "loCallDate";
		public static final String WhereHeard = "whereHeard";
		public static final String CallerRelationship = "callerRelationship";
		public static final String CallType = "callType";
		public static final String CallerName = "callerName";
		public static final String CallerNumber = "callerNumber";
		public static final String WaitingListDetails = "waitingListDetails";
		public static final String PatientCheckList = "patientCheckList";
		public static final String GPDetails = "gPDetails";
		public static final String LoCallComments = "loCallComments";
		public static final String Patient = "patient";
		public static final String MedicalInsurance = "medicalInsurance";
		public static final String InsuranceType = "insuranceType";
		public static final String HasComments = "hasComments";
	}
}

