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
 * @author Joan Heelan
 * Generated.
 */


public class RACPReferral extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1003100110;
	private static final long serialVersionUID = 1003100110L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Patient */
	private ims.core.patient.domain.objects.Patient patient;
	/** Care Context */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** Date Referral made */
	private java.util.Date dateReferralMade;
	/** Date Received */
	private java.util.Date dateReferralReceived;
	/** Waiting Time (Days) */
	private Integer waitingTime;
	/** Referral Reason */
	private ims.domain.lookups.LookupInstance referralReason;
	/** Reason for appointment delay */
	private ims.domain.lookups.LookupInstance delayReason;
	/** Overseeing Cardiologist */
	private ims.core.resource.people.domain.objects.Hcp cardiologist;
	/** Chest Pain Clinic Doctor */
	private ims.core.resource.people.domain.objects.Hcp clinicDoctor;
	/** Appointment Date */
	private java.util.Date appointmentDate;
	/** Source of Referral */
	private ims.domain.lookups.LookupInstance sourceofReferral;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public RACPReferral (Integer id, int ver)
    {
    	super(id, ver);
    }
    public RACPReferral ()
    {
    	super();
    }
    public RACPReferral (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.clinical.domain.objects.RACPReferral.class;
	}


	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public java.util.Date getDateReferralMade() {
		return dateReferralMade;
	}
	public void setDateReferralMade(java.util.Date dateReferralMade) {
		this.dateReferralMade = dateReferralMade;
	}

	public java.util.Date getDateReferralReceived() {
		return dateReferralReceived;
	}
	public void setDateReferralReceived(java.util.Date dateReferralReceived) {
		this.dateReferralReceived = dateReferralReceived;
	}

	public Integer getWaitingTime() {
		return waitingTime;
	}
	public void setWaitingTime(Integer waitingTime) {
		this.waitingTime = waitingTime;
	}

	public ims.domain.lookups.LookupInstance getReferralReason() {
		return referralReason;
	}
	public void setReferralReason(ims.domain.lookups.LookupInstance referralReason) {
		this.referralReason = referralReason;
	}

	public ims.domain.lookups.LookupInstance getDelayReason() {
		return delayReason;
	}
	public void setDelayReason(ims.domain.lookups.LookupInstance delayReason) {
		this.delayReason = delayReason;
	}

	public ims.core.resource.people.domain.objects.Hcp getCardiologist() {
		return cardiologist;
	}
	public void setCardiologist(ims.core.resource.people.domain.objects.Hcp cardiologist) {
		this.cardiologist = cardiologist;
	}

	public ims.core.resource.people.domain.objects.Hcp getClinicDoctor() {
		return clinicDoctor;
	}
	public void setClinicDoctor(ims.core.resource.people.domain.objects.Hcp clinicDoctor) {
		this.clinicDoctor = clinicDoctor;
	}

	public java.util.Date getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(java.util.Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public ims.domain.lookups.LookupInstance getSourceofReferral() {
		return sourceofReferral;
	}
	public void setSourceofReferral(ims.domain.lookups.LookupInstance sourceofReferral) {
		this.sourceofReferral = sourceofReferral;
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
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*dateReferralMade* :");
		auditStr.append(dateReferralMade);
	    auditStr.append("; ");
		auditStr.append("\r\n*dateReferralReceived* :");
		auditStr.append(dateReferralReceived);
	    auditStr.append("; ");
		auditStr.append("\r\n*waitingTime* :");
		auditStr.append(waitingTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*referralReason* :");
		if (referralReason != null)
			auditStr.append(referralReason.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*delayReason* :");
		if (delayReason != null)
			auditStr.append(delayReason.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*cardiologist* :");
		if (cardiologist != null)
		{
			auditStr.append(toShortClassName(cardiologist));
				
		    auditStr.append(cardiologist.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*clinicDoctor* :");
		if (clinicDoctor != null)
		{
			auditStr.append(toShortClassName(clinicDoctor));
				
		    auditStr.append(clinicDoctor.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*appointmentDate* :");
		auditStr.append(appointmentDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*sourceofReferral* :");
		if (sourceofReferral != null)
			auditStr.append(sourceofReferral.getText());
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
		
		String keyClassName = "RACPReferral";
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
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
		}
		if (this.getDateReferralMade() != null)
		{
			sb.append("<dateReferralMade>");
			sb.append(new ims.framework.utils.DateTime(this.getDateReferralMade()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateReferralMade>");		
		}
		if (this.getDateReferralReceived() != null)
		{
			sb.append("<dateReferralReceived>");
			sb.append(new ims.framework.utils.DateTime(this.getDateReferralReceived()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateReferralReceived>");		
		}
		if (this.getWaitingTime() != null)
		{
			sb.append("<waitingTime>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getWaitingTime().toString()));
			sb.append("</waitingTime>");		
		}
		if (this.getReferralReason() != null)
		{
			sb.append("<referralReason>");
			sb.append(this.getReferralReason().toXMLString()); 
			sb.append("</referralReason>");		
		}
		if (this.getDelayReason() != null)
		{
			sb.append("<delayReason>");
			sb.append(this.getDelayReason().toXMLString()); 
			sb.append("</delayReason>");		
		}
		if (this.getCardiologist() != null)
		{
			sb.append("<cardiologist>");
			sb.append(this.getCardiologist().toXMLString(domMap)); 	
			sb.append("</cardiologist>");		
		}
		if (this.getClinicDoctor() != null)
		{
			sb.append("<clinicDoctor>");
			sb.append(this.getClinicDoctor().toXMLString(domMap)); 	
			sb.append("</clinicDoctor>");		
		}
		if (this.getAppointmentDate() != null)
		{
			sb.append("<appointmentDate>");
			sb.append(new ims.framework.utils.DateTime(this.getAppointmentDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</appointmentDate>");		
		}
		if (this.getSourceofReferral() != null)
		{
			sb.append("<sourceofReferral>");
			sb.append(this.getSourceofReferral().toXMLString()); 
			sb.append("</sourceofReferral>");		
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
			RACPReferral domainObject = getRACPReferralfromXML(itemEl, factory, domMap);

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
			RACPReferral domainObject = getRACPReferralfromXML(itemEl, factory, domMap);

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
		
	public static RACPReferral getRACPReferralfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getRACPReferralfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static RACPReferral getRACPReferralfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!RACPReferral.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!RACPReferral.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the RACPReferral class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (RACPReferral)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(RACPReferral.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		RACPReferral ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (RACPReferral)factory.getImportedDomainObject(RACPReferral.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new RACPReferral();
		}
		String keyClassName = "RACPReferral";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (RACPReferral)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, RACPReferral obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("dateReferralMade");
		if(fldEl != null)
		{	
    		obj.setDateReferralMade(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("dateReferralReceived");
		if(fldEl != null)
		{	
    		obj.setDateReferralReceived(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("waitingTime");
		if(fldEl != null)
		{	
    		obj.setWaitingTime(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("referralReason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReferralReason(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("delayReason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDelayReason(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("cardiologist");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCardiologist(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("clinicDoctor");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setClinicDoctor(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("appointmentDate");
		if(fldEl != null)
		{	
    		obj.setAppointmentDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("sourceofReferral");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSourceofReferral(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
		public static final String CareContext = "careContext";
		public static final String DateReferralMade = "dateReferralMade";
		public static final String DateReferralReceived = "dateReferralReceived";
		public static final String WaitingTime = "waitingTime";
		public static final String ReferralReason = "referralReason";
		public static final String DelayReason = "delayReason";
		public static final String Cardiologist = "cardiologist";
		public static final String ClinicDoctor = "clinicDoctor";
		public static final String AppointmentDate = "appointmentDate";
		public static final String SourceofReferral = "sourceofReferral";
	}
}

