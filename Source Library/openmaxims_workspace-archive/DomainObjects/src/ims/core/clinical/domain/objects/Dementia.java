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
 * @author Neil McAnaspie
 * Generated.
 */


public class Dementia extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1003100117;
	private static final long serialVersionUID = 1003100117L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Patient */
	private ims.core.patient.domain.objects.Patient patient;
	/** Admission Date Time */
	private java.util.Date admissionDateTime;
	/** Breach Date Time */
	private java.util.Date breachDateTime;
	/** Patients Age On Admission */
	private Integer ageOnAdmission;
	/** Discharge Date Time */
	private java.util.Date dischargeDateTime;
	/** Current Worklist Status */
	private ims.core.clinical.domain.objects.DementiaWorklistStatus currentWorklistStatus;
	/** Historical Worklist Status
	  * Collection of ims.core.clinical.domain.objects.DementiaWorklistStatus.
	  */
	private java.util.List historicalWorklistStatus;
	/** Dementia Confirmed  */
	private Boolean dementiaConfirmed;
	/** Delirium Confirmed */
	private Boolean deliriumConfirmed;
	/** AMTS Total Score */
	private Integer aMTSScore;
	/** Step One Find */
	private ims.core.clinical.domain.objects.DementiaFind stepOneFind;
	/** Step Two Assess */
	private ims.core.clinical.domain.objects.DementiaAssessAndInvestigate stepTwoAssess;
	/** Confirmed Patient Put On Dementia Pathway */
	private Boolean confirmedPatientPutOnDementiaPathway;
	/** Admission Detail */
	private ims.core.admin.pas.domain.objects.AdmissionDetail admissionDetail;
	/** is Excluded From Worklist */
	private Boolean isExcludedFromWorklist;
	/** Follow Up Assess
	  * Collection of ims.core.clinical.domain.objects.DementiaAssessAndInvestigate.
	  */
	private java.util.List followUpAssessments;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public Dementia (Integer id, int ver)
    {
    	super(id, ver);
    }
    public Dementia ()
    {
    	super();
    }
    public Dementia (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.clinical.domain.objects.Dementia.class;
	}


	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public java.util.Date getAdmissionDateTime() {
		return admissionDateTime;
	}
	public void setAdmissionDateTime(java.util.Date admissionDateTime) {
		this.admissionDateTime = admissionDateTime;
	}

	public java.util.Date getBreachDateTime() {
		return breachDateTime;
	}
	public void setBreachDateTime(java.util.Date breachDateTime) {
		this.breachDateTime = breachDateTime;
	}

	public Integer getAgeOnAdmission() {
		return ageOnAdmission;
	}
	public void setAgeOnAdmission(Integer ageOnAdmission) {
		this.ageOnAdmission = ageOnAdmission;
	}

	public java.util.Date getDischargeDateTime() {
		return dischargeDateTime;
	}
	public void setDischargeDateTime(java.util.Date dischargeDateTime) {
		this.dischargeDateTime = dischargeDateTime;
	}

	public ims.core.clinical.domain.objects.DementiaWorklistStatus getCurrentWorklistStatus() {
		return currentWorklistStatus;
	}
	public void setCurrentWorklistStatus(ims.core.clinical.domain.objects.DementiaWorklistStatus currentWorklistStatus) {
		this.currentWorklistStatus = currentWorklistStatus;
	}

	public java.util.List getHistoricalWorklistStatus() {
		if ( null == historicalWorklistStatus ) {
			historicalWorklistStatus = new java.util.ArrayList();
		}
		return historicalWorklistStatus;
	}
	public void setHistoricalWorklistStatus(java.util.List paramValue) {
		this.historicalWorklistStatus = paramValue;
	}

	public Boolean isDementiaConfirmed() {
		return dementiaConfirmed;
	}
	public void setDementiaConfirmed(Boolean dementiaConfirmed) {
		this.dementiaConfirmed = dementiaConfirmed;
	}

	public Boolean isDeliriumConfirmed() {
		return deliriumConfirmed;
	}
	public void setDeliriumConfirmed(Boolean deliriumConfirmed) {
		this.deliriumConfirmed = deliriumConfirmed;
	}

	public Integer getAMTSScore() {
		return aMTSScore;
	}
	public void setAMTSScore(Integer aMTSScore) {
		this.aMTSScore = aMTSScore;
	}

	public ims.core.clinical.domain.objects.DementiaFind getStepOneFind() {
		return stepOneFind;
	}
	public void setStepOneFind(ims.core.clinical.domain.objects.DementiaFind stepOneFind) {
		this.stepOneFind = stepOneFind;
	}

	public ims.core.clinical.domain.objects.DementiaAssessAndInvestigate getStepTwoAssess() {
		return stepTwoAssess;
	}
	public void setStepTwoAssess(ims.core.clinical.domain.objects.DementiaAssessAndInvestigate stepTwoAssess) {
		this.stepTwoAssess = stepTwoAssess;
	}

	public Boolean isConfirmedPatientPutOnDementiaPathway() {
		return confirmedPatientPutOnDementiaPathway;
	}
	public void setConfirmedPatientPutOnDementiaPathway(Boolean confirmedPatientPutOnDementiaPathway) {
		this.confirmedPatientPutOnDementiaPathway = confirmedPatientPutOnDementiaPathway;
	}

	public ims.core.admin.pas.domain.objects.AdmissionDetail getAdmissionDetail() {
		return admissionDetail;
	}
	public void setAdmissionDetail(ims.core.admin.pas.domain.objects.AdmissionDetail admissionDetail) {
		this.admissionDetail = admissionDetail;
	}

	public Boolean isIsExcludedFromWorklist() {
		return isExcludedFromWorklist;
	}
	public void setIsExcludedFromWorklist(Boolean isExcludedFromWorklist) {
		this.isExcludedFromWorklist = isExcludedFromWorklist;
	}

	public java.util.List getFollowUpAssessments() {
		if ( null == followUpAssessments ) {
			followUpAssessments = new java.util.ArrayList();
		}
		return followUpAssessments;
	}
	public void setFollowUpAssessments(java.util.List paramValue) {
		this.followUpAssessments = paramValue;
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
		auditStr.append("\r\n*admissionDateTime* :");
		auditStr.append(admissionDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*breachDateTime* :");
		auditStr.append(breachDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*ageOnAdmission* :");
		auditStr.append(ageOnAdmission);
	    auditStr.append("; ");
		auditStr.append("\r\n*dischargeDateTime* :");
		auditStr.append(dischargeDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*currentWorklistStatus* :");
		if (currentWorklistStatus != null)
		{
			auditStr.append(toShortClassName(currentWorklistStatus));
				
		    auditStr.append(currentWorklistStatus.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*historicalWorklistStatus* :");
		if (historicalWorklistStatus != null)
		{
		int i7=0;
		for (i7=0; i7<historicalWorklistStatus.size(); i7++)
		{
			if (i7 > 0)
				auditStr.append(",");
			ims.core.clinical.domain.objects.DementiaWorklistStatus obj = (ims.core.clinical.domain.objects.DementiaWorklistStatus)historicalWorklistStatus.get(i7);
		    if (obj != null)
			{
				if (i7 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i7 > 0)
			auditStr.append("] " + i7);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*dementiaConfirmed* :");
		auditStr.append(dementiaConfirmed);
	    auditStr.append("; ");
		auditStr.append("\r\n*deliriumConfirmed* :");
		auditStr.append(deliriumConfirmed);
	    auditStr.append("; ");
		auditStr.append("\r\n*aMTSScore* :");
		auditStr.append(aMTSScore);
	    auditStr.append("; ");
		auditStr.append("\r\n*stepOneFind* :");
		if (stepOneFind != null)
		{
			auditStr.append(toShortClassName(stepOneFind));
				
		    auditStr.append(stepOneFind.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*stepTwoAssess* :");
		if (stepTwoAssess != null)
		{
			auditStr.append(toShortClassName(stepTwoAssess));
				
		    auditStr.append(stepTwoAssess.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*confirmedPatientPutOnDementiaPathway* :");
		auditStr.append(confirmedPatientPutOnDementiaPathway);
	    auditStr.append("; ");
		auditStr.append("\r\n*admissionDetail* :");
		if (admissionDetail != null)
		{
			auditStr.append(toShortClassName(admissionDetail));
				
		    auditStr.append(admissionDetail.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isExcludedFromWorklist* :");
		auditStr.append(isExcludedFromWorklist);
	    auditStr.append("; ");
		auditStr.append("\r\n*followUpAssessments* :");
		if (followUpAssessments != null)
		{
		int i16=0;
		for (i16=0; i16<followUpAssessments.size(); i16++)
		{
			if (i16 > 0)
				auditStr.append(",");
			ims.core.clinical.domain.objects.DementiaAssessAndInvestigate obj = (ims.core.clinical.domain.objects.DementiaAssessAndInvestigate)followUpAssessments.get(i16);
		    if (obj != null)
			{
				if (i16 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i16 > 0)
			auditStr.append("] " + i16);
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
		
		String keyClassName = "Dementia";
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
		if (this.getAdmissionDateTime() != null)
		{
			sb.append("<admissionDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getAdmissionDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</admissionDateTime>");		
		}
		if (this.getBreachDateTime() != null)
		{
			sb.append("<breachDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getBreachDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</breachDateTime>");		
		}
		if (this.getAgeOnAdmission() != null)
		{
			sb.append("<ageOnAdmission>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAgeOnAdmission().toString()));
			sb.append("</ageOnAdmission>");		
		}
		if (this.getDischargeDateTime() != null)
		{
			sb.append("<dischargeDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getDischargeDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dischargeDateTime>");		
		}
		if (this.getCurrentWorklistStatus() != null)
		{
			sb.append("<currentWorklistStatus>");
			sb.append(this.getCurrentWorklistStatus().toXMLString(domMap)); 	
			sb.append("</currentWorklistStatus>");		
		}
		if (this.getHistoricalWorklistStatus() != null)
		{
			if (this.getHistoricalWorklistStatus().size() > 0 )
			{
			sb.append("<historicalWorklistStatus>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getHistoricalWorklistStatus(), domMap));
			sb.append("</historicalWorklistStatus>");		
			}
		}
		if (this.isDementiaConfirmed() != null)
		{
			sb.append("<dementiaConfirmed>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isDementiaConfirmed().toString()));
			sb.append("</dementiaConfirmed>");		
		}
		if (this.isDeliriumConfirmed() != null)
		{
			sb.append("<deliriumConfirmed>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isDeliriumConfirmed().toString()));
			sb.append("</deliriumConfirmed>");		
		}
		if (this.getAMTSScore() != null)
		{
			sb.append("<aMTSScore>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAMTSScore().toString()));
			sb.append("</aMTSScore>");		
		}
		if (this.getStepOneFind() != null)
		{
			sb.append("<stepOneFind>");
			sb.append(this.getStepOneFind().toXMLString(domMap)); 	
			sb.append("</stepOneFind>");		
		}
		if (this.getStepTwoAssess() != null)
		{
			sb.append("<stepTwoAssess>");
			sb.append(this.getStepTwoAssess().toXMLString(domMap)); 	
			sb.append("</stepTwoAssess>");		
		}
		if (this.isConfirmedPatientPutOnDementiaPathway() != null)
		{
			sb.append("<confirmedPatientPutOnDementiaPathway>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isConfirmedPatientPutOnDementiaPathway().toString()));
			sb.append("</confirmedPatientPutOnDementiaPathway>");		
		}
		if (this.getAdmissionDetail() != null)
		{
			sb.append("<admissionDetail>");
			sb.append(this.getAdmissionDetail().toXMLString(domMap)); 	
			sb.append("</admissionDetail>");		
		}
		if (this.isIsExcludedFromWorklist() != null)
		{
			sb.append("<isExcludedFromWorklist>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsExcludedFromWorklist().toString()));
			sb.append("</isExcludedFromWorklist>");		
		}
		if (this.getFollowUpAssessments() != null)
		{
			if (this.getFollowUpAssessments().size() > 0 )
			{
			sb.append("<followUpAssessments>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getFollowUpAssessments(), domMap));
			sb.append("</followUpAssessments>");		
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
			Dementia domainObject = getDementiafromXML(itemEl, factory, domMap);

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
			Dementia domainObject = getDementiafromXML(itemEl, factory, domMap);

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
		
	public static Dementia getDementiafromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getDementiafromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static Dementia getDementiafromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!Dementia.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!Dementia.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the Dementia class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (Dementia)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(Dementia.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		Dementia ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (Dementia)factory.getImportedDomainObject(Dementia.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new Dementia();
		}
		String keyClassName = "Dementia";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (Dementia)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, Dementia obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("admissionDateTime");
		if(fldEl != null)
		{	
    		obj.setAdmissionDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("breachDateTime");
		if(fldEl != null)
		{	
    		obj.setBreachDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("ageOnAdmission");
		if(fldEl != null)
		{	
    		obj.setAgeOnAdmission(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dischargeDateTime");
		if(fldEl != null)
		{	
    		obj.setDischargeDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("currentWorklistStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCurrentWorklistStatus(ims.core.clinical.domain.objects.DementiaWorklistStatus.getDementiaWorklistStatusfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("historicalWorklistStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setHistoricalWorklistStatus(ims.core.clinical.domain.objects.DementiaWorklistStatus.fromListXMLString(fldEl, factory, obj.getHistoricalWorklistStatus(), domMap));
		}
		fldEl = el.element("dementiaConfirmed");
		if(fldEl != null)
		{	
    		obj.setDementiaConfirmed(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("deliriumConfirmed");
		if(fldEl != null)
		{	
    		obj.setDeliriumConfirmed(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("aMTSScore");
		if(fldEl != null)
		{	
    		obj.setAMTSScore(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("stepOneFind");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setStepOneFind(ims.core.clinical.domain.objects.DementiaFind.getDementiaFindfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("stepTwoAssess");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setStepTwoAssess(ims.core.clinical.domain.objects.DementiaAssessAndInvestigate.getDementiaAssessAndInvestigatefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("confirmedPatientPutOnDementiaPathway");
		if(fldEl != null)
		{	
    		obj.setConfirmedPatientPutOnDementiaPathway(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("admissionDetail");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAdmissionDetail(ims.core.admin.pas.domain.objects.AdmissionDetail.getAdmissionDetailfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("isExcludedFromWorklist");
		if(fldEl != null)
		{	
    		obj.setIsExcludedFromWorklist(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("followUpAssessments");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setFollowUpAssessments(ims.core.clinical.domain.objects.DementiaAssessAndInvestigate.fromListXMLString(fldEl, factory, obj.getFollowUpAssessments(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "historicalWorklistStatus"
		, "followUpAssessments"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Patient = "patient";
		public static final String AdmissionDateTime = "admissionDateTime";
		public static final String BreachDateTime = "breachDateTime";
		public static final String AgeOnAdmission = "ageOnAdmission";
		public static final String DischargeDateTime = "dischargeDateTime";
		public static final String CurrentWorklistStatus = "currentWorklistStatus";
		public static final String HistoricalWorklistStatus = "historicalWorklistStatus";
		public static final String DementiaConfirmed = "dementiaConfirmed";
		public static final String DeliriumConfirmed = "deliriumConfirmed";
		public static final String AMTSScore = "aMTSScore";
		public static final String StepOneFind = "stepOneFind";
		public static final String StepTwoAssess = "stepTwoAssess";
		public static final String ConfirmedPatientPutOnDementiaPathway = "confirmedPatientPutOnDementiaPathway";
		public static final String AdmissionDetail = "admissionDetail";
		public static final String IsExcludedFromWorklist = "isExcludedFromWorklist";
		public static final String FollowUpAssessments = "followUpAssessments";
	}
}

