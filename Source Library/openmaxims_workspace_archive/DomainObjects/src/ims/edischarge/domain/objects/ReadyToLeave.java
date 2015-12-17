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
package ims.edischarge.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class ReadyToLeave extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1099100006;
	private static final long serialVersionUID = 1099100006L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Care Context */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** Authoring Details */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInfo;
	/** NurseEnabledDischargeConfirmation */
	private String nurseEnabledDischargeConfirmation;
	/** CompletedOn */
	private java.util.Date completedOn;
	/** CompletedBy */
	private ims.core.resource.people.domain.objects.Hcp completedBy;
	/** DischargeDetails */
	private ims.edischarge.domain.objects.DischargeDetails dischargeDetails;
	/** Has the Patient Received a copy of the Discharge Summary */
	private Boolean hasPatientReceivedCopyOfDischarge;
	/** Comments From Patient */
	private String commentsFromPatient;
	/** Discharging Nurse */
	private ims.core.resource.people.domain.objects.Hcp dischargingNurse;
	/** Admitted On */
	private java.util.Date admittedOn;
	/** Clinical Discharge Date and Time */
	private java.util.Date clinicalDischargeDateTime;
	/** Admitted On Time */
	private String admittedTime;
	/** Is Complete */
	private Boolean isComplete;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ReadyToLeave (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ReadyToLeave ()
    {
    	super();
    }
    public ReadyToLeave (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.edischarge.domain.objects.ReadyToLeave.class;
	}


	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getAuthoringInfo() {
		return authoringInfo;
	}
	public void setAuthoringInfo(ims.core.clinical.domain.objects.AuthoringInformation authoringInfo) {
		this.authoringInfo = authoringInfo;
	}

	public String getNurseEnabledDischargeConfirmation() {
		return nurseEnabledDischargeConfirmation;
	}
	public void setNurseEnabledDischargeConfirmation(String nurseEnabledDischargeConfirmation) {
		this.nurseEnabledDischargeConfirmation = nurseEnabledDischargeConfirmation;
	}

	public java.util.Date getCompletedOn() {
		return completedOn;
	}
	public void setCompletedOn(java.util.Date completedOn) {
		this.completedOn = completedOn;
	}

	public ims.core.resource.people.domain.objects.Hcp getCompletedBy() {
		return completedBy;
	}
	public void setCompletedBy(ims.core.resource.people.domain.objects.Hcp completedBy) {
		this.completedBy = completedBy;
	}

	public ims.edischarge.domain.objects.DischargeDetails getDischargeDetails() {
		return dischargeDetails;
	}
	public void setDischargeDetails(ims.edischarge.domain.objects.DischargeDetails dischargeDetails) {
		this.dischargeDetails = dischargeDetails;
	}

	public Boolean isHasPatientReceivedCopyOfDischarge() {
		return hasPatientReceivedCopyOfDischarge;
	}
	public void setHasPatientReceivedCopyOfDischarge(Boolean hasPatientReceivedCopyOfDischarge) {
		this.hasPatientReceivedCopyOfDischarge = hasPatientReceivedCopyOfDischarge;
	}

	public String getCommentsFromPatient() {
		return commentsFromPatient;
	}
	public void setCommentsFromPatient(String commentsFromPatient) {
		this.commentsFromPatient = commentsFromPatient;
	}

	public ims.core.resource.people.domain.objects.Hcp getDischargingNurse() {
		return dischargingNurse;
	}
	public void setDischargingNurse(ims.core.resource.people.domain.objects.Hcp dischargingNurse) {
		this.dischargingNurse = dischargingNurse;
	}

	public java.util.Date getAdmittedOn() {
		return admittedOn;
	}
	public void setAdmittedOn(java.util.Date admittedOn) {
		this.admittedOn = admittedOn;
	}

	public java.util.Date getClinicalDischargeDateTime() {
		return clinicalDischargeDateTime;
	}
	public void setClinicalDischargeDateTime(java.util.Date clinicalDischargeDateTime) {
		this.clinicalDischargeDateTime = clinicalDischargeDateTime;
	}

	public String getAdmittedTime() {
		return admittedTime;
	}
	public void setAdmittedTime(String admittedTime) {
		this.admittedTime = admittedTime;
	}

	public Boolean isIsComplete() {
		return isComplete;
	}
	public void setIsComplete(Boolean isComplete) {
		this.isComplete = isComplete;
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
		
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringInfo* :");
		if (authoringInfo != null)
		{
			auditStr.append(toShortClassName(authoringInfo));
				
		    auditStr.append(authoringInfo.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*nurseEnabledDischargeConfirmation* :");
		auditStr.append(nurseEnabledDischargeConfirmation);
	    auditStr.append("; ");
		auditStr.append("\r\n*completedOn* :");
		auditStr.append(completedOn);
	    auditStr.append("; ");
		auditStr.append("\r\n*completedBy* :");
		if (completedBy != null)
		{
			auditStr.append(toShortClassName(completedBy));
				
		    auditStr.append(completedBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*dischargeDetails* :");
		if (dischargeDetails != null)
		{
			auditStr.append(toShortClassName(dischargeDetails));
				
		    auditStr.append(dischargeDetails.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*hasPatientReceivedCopyOfDischarge* :");
		auditStr.append(hasPatientReceivedCopyOfDischarge);
	    auditStr.append("; ");
		auditStr.append("\r\n*commentsFromPatient* :");
		auditStr.append(commentsFromPatient);
	    auditStr.append("; ");
		auditStr.append("\r\n*dischargingNurse* :");
		if (dischargingNurse != null)
		{
			auditStr.append(toShortClassName(dischargingNurse));
				
		    auditStr.append(dischargingNurse.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*admittedOn* :");
		auditStr.append(admittedOn);
	    auditStr.append("; ");
		auditStr.append("\r\n*clinicalDischargeDateTime* :");
		auditStr.append(clinicalDischargeDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*admittedTime* :");
		auditStr.append(admittedTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*isComplete* :");
		auditStr.append(isComplete);
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
		
		String keyClassName = "ReadyToLeave";
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
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
		}
		if (this.getAuthoringInfo() != null)
		{
			sb.append("<authoringInfo>");
			sb.append(this.getAuthoringInfo().toXMLString(domMap)); 	
			sb.append("</authoringInfo>");		
		}
		if (this.getNurseEnabledDischargeConfirmation() != null)
		{
			sb.append("<nurseEnabledDischargeConfirmation>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNurseEnabledDischargeConfirmation().toString()));
			sb.append("</nurseEnabledDischargeConfirmation>");		
		}
		if (this.getCompletedOn() != null)
		{
			sb.append("<completedOn>");
			sb.append(new ims.framework.utils.DateTime(this.getCompletedOn()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</completedOn>");		
		}
		if (this.getCompletedBy() != null)
		{
			sb.append("<completedBy>");
			sb.append(this.getCompletedBy().toXMLString(domMap)); 	
			sb.append("</completedBy>");		
		}
		if (this.getDischargeDetails() != null)
		{
			sb.append("<dischargeDetails>");
			sb.append(this.getDischargeDetails().toXMLString(domMap)); 	
			sb.append("</dischargeDetails>");		
		}
		if (this.isHasPatientReceivedCopyOfDischarge() != null)
		{
			sb.append("<hasPatientReceivedCopyOfDischarge>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHasPatientReceivedCopyOfDischarge().toString()));
			sb.append("</hasPatientReceivedCopyOfDischarge>");		
		}
		if (this.getCommentsFromPatient() != null)
		{
			sb.append("<commentsFromPatient>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCommentsFromPatient().toString()));
			sb.append("</commentsFromPatient>");		
		}
		if (this.getDischargingNurse() != null)
		{
			sb.append("<dischargingNurse>");
			sb.append(this.getDischargingNurse().toXMLString(domMap)); 	
			sb.append("</dischargingNurse>");		
		}
		if (this.getAdmittedOn() != null)
		{
			sb.append("<admittedOn>");
			sb.append(new ims.framework.utils.DateTime(this.getAdmittedOn()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</admittedOn>");		
		}
		if (this.getClinicalDischargeDateTime() != null)
		{
			sb.append("<clinicalDischargeDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getClinicalDischargeDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</clinicalDischargeDateTime>");		
		}
		if (this.getAdmittedTime() != null)
		{
			sb.append("<admittedTime>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAdmittedTime().toString()));
			sb.append("</admittedTime>");		
		}
		if (this.isIsComplete() != null)
		{
			sb.append("<isComplete>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsComplete().toString()));
			sb.append("</isComplete>");		
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
			ReadyToLeave domainObject = getReadyToLeavefromXML(itemEl, factory, domMap);

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
			ReadyToLeave domainObject = getReadyToLeavefromXML(itemEl, factory, domMap);

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
		
	public static ReadyToLeave getReadyToLeavefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getReadyToLeavefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ReadyToLeave getReadyToLeavefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ReadyToLeave.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ReadyToLeave.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ReadyToLeave class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ReadyToLeave)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ReadyToLeave.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ReadyToLeave ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ReadyToLeave)factory.getImportedDomainObject(ReadyToLeave.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ReadyToLeave();
		}
		String keyClassName = "ReadyToLeave";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ReadyToLeave)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ReadyToLeave obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("authoringInfo");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringInfo(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("nurseEnabledDischargeConfirmation");
		if(fldEl != null)
		{	
    		obj.setNurseEnabledDischargeConfirmation(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("completedOn");
		if(fldEl != null)
		{	
    		obj.setCompletedOn(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("completedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCompletedBy(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("dischargeDetails");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setDischargeDetails(ims.edischarge.domain.objects.DischargeDetails.getDischargeDetailsfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("hasPatientReceivedCopyOfDischarge");
		if(fldEl != null)
		{	
    		obj.setHasPatientReceivedCopyOfDischarge(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("commentsFromPatient");
		if(fldEl != null)
		{	
    		obj.setCommentsFromPatient(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dischargingNurse");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setDischargingNurse(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("admittedOn");
		if(fldEl != null)
		{	
    		obj.setAdmittedOn(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("clinicalDischargeDateTime");
		if(fldEl != null)
		{	
    		obj.setClinicalDischargeDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("admittedTime");
		if(fldEl != null)
		{	
    		obj.setAdmittedTime(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isComplete");
		if(fldEl != null)
		{	
    		obj.setIsComplete(new Boolean(fldEl.getTextTrim()));	
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
		public static final String CareContext = "careContext";
		public static final String AuthoringInfo = "authoringInfo";
		public static final String NurseEnabledDischargeConfirmation = "nurseEnabledDischargeConfirmation";
		public static final String CompletedOn = "completedOn";
		public static final String CompletedBy = "completedBy";
		public static final String DischargeDetails = "dischargeDetails";
		public static final String HasPatientReceivedCopyOfDischarge = "hasPatientReceivedCopyOfDischarge";
		public static final String CommentsFromPatient = "commentsFromPatient";
		public static final String DischargingNurse = "dischargingNurse";
		public static final String AdmittedOn = "admittedOn";
		public static final String ClinicalDischargeDateTime = "clinicalDischargeDateTime";
		public static final String AdmittedTime = "admittedTime";
		public static final String IsComplete = "isComplete";
	}
}

