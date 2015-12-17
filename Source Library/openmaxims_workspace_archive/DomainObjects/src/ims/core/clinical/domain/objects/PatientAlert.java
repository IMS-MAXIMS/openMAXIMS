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
package ims.core.clinical.domain.objects;

/**
 * 
 * @author Sinead McDermott
 * Generated.
 */


public class PatientAlert extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1003100012;
	private static final long serialVersionUID = 1003100012L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Actual Alert */
	private ims.domain.lookups.LookupInstance alertType;
	/** Alert Currently a concern! */
	private Boolean isCurrentlyActiveAlert;
	/** InactivationComments */
	private String inactivationComments;
	/** EndDateTime */
	private java.util.Date endDateTime;
	/** Free text comments */
	private String comments;
	/** Source of Information - GP / Patient / Notes */
	private ims.domain.lookups.LookupInstance sourceofInformation;
	/** Confirmation Status - Confirmed / Rejected etc */
	private ims.domain.lookups.LookupInstance alertConfirmedStatus;
	/** Confirming HCP */
	private ims.core.resource.people.domain.objects.Hcp alertConfirmedBy;
	/** Confirming DateTime */
	private java.util.Date alertConfirmedDateTime;
	/** Date the alert was identified */
	private Integer dateIdentified;
	/** AuthoringInformation */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInformation;
	/** Patient */
	private ims.core.patient.domain.objects.Patient patient;
	/** Who Inactivated the alert */
	private ims.core.clinical.domain.objects.AuthoringInformation inactivationAuthoringInfo;
	/** Include Alert In Discharge Report
	  * Collection of ims.core.clinical.domain.objects.IncludeAlertInDischargeReport.
	  */
	private java.util.Set includeAlertInDischargeReports;
	/** RecordingInformation */
	private ims.core.clinical.domain.objects.RecordingUserInformation recordingInformation;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PatientAlert (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PatientAlert ()
    {
    	super();
    }
    public PatientAlert (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.clinical.domain.objects.PatientAlert.class;
	}


	public ims.domain.lookups.LookupInstance getAlertType() {
		return alertType;
	}
	public void setAlertType(ims.domain.lookups.LookupInstance alertType) {
		this.alertType = alertType;
	}

	public Boolean isIsCurrentlyActiveAlert() {
		return isCurrentlyActiveAlert;
	}
	public void setIsCurrentlyActiveAlert(Boolean isCurrentlyActiveAlert) {
		this.isCurrentlyActiveAlert = isCurrentlyActiveAlert;
	}

	public String getInactivationComments() {
		return inactivationComments;
	}
	public void setInactivationComments(String inactivationComments) {
		if ( null != inactivationComments && inactivationComments.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for inactivationComments. Tried to set value: "+
				inactivationComments);
		}
		this.inactivationComments = inactivationComments;
	}

	public java.util.Date getEndDateTime() {
		return endDateTime;
	}
	public void setEndDateTime(java.util.Date endDateTime) {
		this.endDateTime = endDateTime;
	}

	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		if ( null != comments && comments.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for comments. Tried to set value: "+
				comments);
		}
		this.comments = comments;
	}

	public ims.domain.lookups.LookupInstance getSourceofInformation() {
		return sourceofInformation;
	}
	public void setSourceofInformation(ims.domain.lookups.LookupInstance sourceofInformation) {
		this.sourceofInformation = sourceofInformation;
	}

	public ims.domain.lookups.LookupInstance getAlertConfirmedStatus() {
		return alertConfirmedStatus;
	}
	public void setAlertConfirmedStatus(ims.domain.lookups.LookupInstance alertConfirmedStatus) {
		this.alertConfirmedStatus = alertConfirmedStatus;
	}

	public ims.core.resource.people.domain.objects.Hcp getAlertConfirmedBy() {
		return alertConfirmedBy;
	}
	public void setAlertConfirmedBy(ims.core.resource.people.domain.objects.Hcp alertConfirmedBy) {
		this.alertConfirmedBy = alertConfirmedBy;
	}

	public java.util.Date getAlertConfirmedDateTime() {
		return alertConfirmedDateTime;
	}
	public void setAlertConfirmedDateTime(java.util.Date alertConfirmedDateTime) {
		this.alertConfirmedDateTime = alertConfirmedDateTime;
	}

	public Integer getDateIdentified() {
		return dateIdentified;
	}
	public void setDateIdentified(Integer dateIdentified) {
		this.dateIdentified = dateIdentified;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getAuthoringInformation() {
		return authoringInformation;
	}
	public void setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation authoringInformation) {
		this.authoringInformation = authoringInformation;
	}

	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getInactivationAuthoringInfo() {
		return inactivationAuthoringInfo;
	}
	public void setInactivationAuthoringInfo(ims.core.clinical.domain.objects.AuthoringInformation inactivationAuthoringInfo) {
		this.inactivationAuthoringInfo = inactivationAuthoringInfo;
	}

	public java.util.Set getIncludeAlertInDischargeReports() {
		if ( null == includeAlertInDischargeReports ) {
			includeAlertInDischargeReports = new java.util.HashSet();
		}
		return includeAlertInDischargeReports;
	}
	public void setIncludeAlertInDischargeReports(java.util.Set paramValue) {
		this.includeAlertInDischargeReports = paramValue;
	}

	public ims.core.clinical.domain.objects.RecordingUserInformation getRecordingInformation() {
		return recordingInformation;
	}
	public void setRecordingInformation(ims.core.clinical.domain.objects.RecordingUserInformation recordingInformation) {
		this.recordingInformation = recordingInformation;
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
		
		auditStr.append("\r\n*alertType* :");
		if (alertType != null)
			auditStr.append(alertType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*isCurrentlyActiveAlert* :");
		auditStr.append(isCurrentlyActiveAlert);
	    auditStr.append("; ");
		auditStr.append("\r\n*inactivationComments* :");
		auditStr.append(inactivationComments);
	    auditStr.append("; ");
		auditStr.append("\r\n*endDateTime* :");
		auditStr.append(endDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*comments* :");
		auditStr.append(comments);
	    auditStr.append("; ");
		auditStr.append("\r\n*sourceofInformation* :");
		if (sourceofInformation != null)
			auditStr.append(sourceofInformation.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*alertConfirmedStatus* :");
		if (alertConfirmedStatus != null)
			auditStr.append(alertConfirmedStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*alertConfirmedBy* :");
		if (alertConfirmedBy != null)
		{
			auditStr.append(toShortClassName(alertConfirmedBy));
				
		    auditStr.append(alertConfirmedBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*alertConfirmedDateTime* :");
		auditStr.append(alertConfirmedDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*dateIdentified* :");
		auditStr.append(dateIdentified);
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringInformation* :");
		if (authoringInformation != null)
		{
			auditStr.append(toShortClassName(authoringInformation));
				
		    auditStr.append(authoringInformation.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*patient* :");
		if (patient != null)
		{
			auditStr.append(toShortClassName(patient));
				
		    auditStr.append(patient.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*inactivationAuthoringInfo* :");
		if (inactivationAuthoringInfo != null)
		{
			auditStr.append(toShortClassName(inactivationAuthoringInfo));
				
		    auditStr.append(inactivationAuthoringInfo.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*includeAlertInDischargeReports* :");
		if (includeAlertInDischargeReports != null)
		{
			java.util.Iterator it14 = includeAlertInDischargeReports.iterator();
			int i14=0;
			while (it14.hasNext())
			{
				if (i14 > 0)
					auditStr.append(",");
				ims.core.clinical.domain.objects.IncludeAlertInDischargeReport obj = (ims.core.clinical.domain.objects.IncludeAlertInDischargeReport)it14.next();
		if (obj != null)
		{
		   if (i14 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i14++;
		}
		if (i14 > 0)
			auditStr.append("] " + i14);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*recordingInformation* :");
		if (recordingInformation != null)
		{
			auditStr.append(toShortClassName(recordingInformation));
				
		    auditStr.append(recordingInformation.toString());
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
		
		String keyClassName = "PatientAlert";
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
		if (this.getAlertType() != null)
		{
			sb.append("<alertType>");
			sb.append(this.getAlertType().toXMLString()); 
			sb.append("</alertType>");		
		}
		if (this.isIsCurrentlyActiveAlert() != null)
		{
			sb.append("<isCurrentlyActiveAlert>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsCurrentlyActiveAlert().toString()));
			sb.append("</isCurrentlyActiveAlert>");		
		}
		if (this.getInactivationComments() != null)
		{
			sb.append("<inactivationComments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getInactivationComments().toString()));
			sb.append("</inactivationComments>");		
		}
		if (this.getEndDateTime() != null)
		{
			sb.append("<endDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getEndDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</endDateTime>");		
		}
		if (this.getComments() != null)
		{
			sb.append("<comments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getComments().toString()));
			sb.append("</comments>");		
		}
		if (this.getSourceofInformation() != null)
		{
			sb.append("<sourceofInformation>");
			sb.append(this.getSourceofInformation().toXMLString()); 
			sb.append("</sourceofInformation>");		
		}
		if (this.getAlertConfirmedStatus() != null)
		{
			sb.append("<alertConfirmedStatus>");
			sb.append(this.getAlertConfirmedStatus().toXMLString()); 
			sb.append("</alertConfirmedStatus>");		
		}
		if (this.getAlertConfirmedBy() != null)
		{
			sb.append("<alertConfirmedBy>");
			sb.append(this.getAlertConfirmedBy().toXMLString(domMap)); 	
			sb.append("</alertConfirmedBy>");		
		}
		if (this.getAlertConfirmedDateTime() != null)
		{
			sb.append("<alertConfirmedDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getAlertConfirmedDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</alertConfirmedDateTime>");		
		}
		if (this.getDateIdentified() != null)
		{
			sb.append("<dateIdentified>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDateIdentified().toString()));
			sb.append("</dateIdentified>");		
		}
		if (this.getAuthoringInformation() != null)
		{
			sb.append("<authoringInformation>");
			sb.append(this.getAuthoringInformation().toXMLString(domMap)); 	
			sb.append("</authoringInformation>");		
		}
		if (this.getPatient() != null)
		{
			sb.append("<patient>");
			sb.append(this.getPatient().toXMLString(domMap)); 	
			sb.append("</patient>");		
		}
		if (this.getInactivationAuthoringInfo() != null)
		{
			sb.append("<inactivationAuthoringInfo>");
			sb.append(this.getInactivationAuthoringInfo().toXMLString(domMap)); 	
			sb.append("</inactivationAuthoringInfo>");		
		}
		if (this.getIncludeAlertInDischargeReports() != null)
		{
			if (this.getIncludeAlertInDischargeReports().size() > 0 )
			{
			sb.append("<includeAlertInDischargeReports>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getIncludeAlertInDischargeReports(), domMap));
			sb.append("</includeAlertInDischargeReports>");		
			}
		}
		if (this.getRecordingInformation() != null)
		{
			sb.append("<recordingInformation>");
			sb.append(this.getRecordingInformation().toXMLString(domMap)); 	
			sb.append("</recordingInformation>");		
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
			PatientAlert domainObject = getPatientAlertfromXML(itemEl, factory, domMap);

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
			PatientAlert domainObject = getPatientAlertfromXML(itemEl, factory, domMap);

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
		
	public static PatientAlert getPatientAlertfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPatientAlertfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PatientAlert getPatientAlertfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PatientAlert.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PatientAlert.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PatientAlert class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PatientAlert)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PatientAlert.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PatientAlert ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PatientAlert)factory.getImportedDomainObject(PatientAlert.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PatientAlert();
		}
		String keyClassName = "PatientAlert";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PatientAlert)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PatientAlert obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("alertType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAlertType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("isCurrentlyActiveAlert");
		if(fldEl != null)
		{	
    		obj.setIsCurrentlyActiveAlert(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("inactivationComments");
		if(fldEl != null)
		{	
    		obj.setInactivationComments(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("endDateTime");
		if(fldEl != null)
		{	
    		obj.setEndDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("comments");
		if(fldEl != null)
		{	
    		obj.setComments(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("sourceofInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSourceofInformation(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("alertConfirmedStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAlertConfirmedStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("alertConfirmedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAlertConfirmedBy(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("alertConfirmedDateTime");
		if(fldEl != null)
		{	
    		obj.setAlertConfirmedDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("dateIdentified");
		if(fldEl != null)
		{	
    		obj.setDateIdentified(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("authoringInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("inactivationAuthoringInfo");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setInactivationAuthoringInfo(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("includeAlertInDischargeReports");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setIncludeAlertInDischargeReports(ims.core.clinical.domain.objects.IncludeAlertInDischargeReport.fromSetXMLString(fldEl, factory, obj.getIncludeAlertInDischargeReports(), domMap));
		}
		fldEl = el.element("recordingInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRecordingInformation(ims.core.clinical.domain.objects.RecordingUserInformation.getRecordingUserInformationfromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "includeAlertInDischargeReports"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String AlertType = "alertType";
		public static final String IsCurrentlyActiveAlert = "isCurrentlyActiveAlert";
		public static final String InactivationComments = "inactivationComments";
		public static final String EndDateTime = "endDateTime";
		public static final String Comments = "comments";
		public static final String SourceofInformation = "sourceofInformation";
		public static final String AlertConfirmedStatus = "alertConfirmedStatus";
		public static final String AlertConfirmedBy = "alertConfirmedBy";
		public static final String AlertConfirmedDateTime = "alertConfirmedDateTime";
		public static final String DateIdentified = "dateIdentified";
		public static final String AuthoringInformation = "authoringInformation";
		public static final String Patient = "patient";
		public static final String InactivationAuthoringInfo = "inactivationAuthoringInfo";
		public static final String IncludeAlertInDischargeReports = "includeAlertInDischargeReports";
		public static final String RecordingInformation = "recordingInformation";
	}
}

