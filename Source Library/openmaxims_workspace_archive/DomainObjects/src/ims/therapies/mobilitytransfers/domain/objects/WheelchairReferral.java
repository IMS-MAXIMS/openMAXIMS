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
package ims.therapies.mobilitytransfers.domain.objects;

/**
 * 
 * @author Joan Heelan
 * Generated.
 */


public class WheelchairReferral extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1019100044;
	private static final long serialVersionUID = 1019100044L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Care Context */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** ClinicalContact */
	private ims.core.admin.domain.objects.ClinicalContact clinicalContact;
	/** Authoring Date Time */
	private java.util.Date authoringDateTime;
	/** Authoring Care Professional */
	private ims.core.resource.people.domain.objects.Hcp authoringCP;
	/** Referral Date */
	private java.util.Date referralDate;
	/** Assessment Date */
	private java.util.Date assessmentDate;
	/** Chair Type */
	private ims.domain.lookups.LookupInstance chairType;
	/** Wheelchair Authority */
	private String wheelchairAuthority;
	/** Wheelchair Therapist */
	private String wheelchairTherapist;
	/** Outcome Of Assessment */
	private String outcomeOfAssessment;
	/** Discharge Date */
	private java.util.Date dischargeDate;
	/** Discharge Details */
	private String dischargeDetails;
	/** Details on Other Assessments */
	private String otherAssessmentInfo;
	/** Patient Informed on Wheelchair Services? */
	private ims.domain.lookups.LookupInstance patientInformed;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public WheelchairReferral (Integer id, int ver)
    {
    	super(id, ver);
    }
    public WheelchairReferral ()
    {
    	super();
    }
    public WheelchairReferral (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.therapies.mobilitytransfers.domain.objects.WheelchairReferral.class;
	}


	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public ims.core.admin.domain.objects.ClinicalContact getClinicalContact() {
		return clinicalContact;
	}
	public void setClinicalContact(ims.core.admin.domain.objects.ClinicalContact clinicalContact) {
		this.clinicalContact = clinicalContact;
	}

	public java.util.Date getAuthoringDateTime() {
		return authoringDateTime;
	}
	public void setAuthoringDateTime(java.util.Date authoringDateTime) {
		this.authoringDateTime = authoringDateTime;
	}

	public ims.core.resource.people.domain.objects.Hcp getAuthoringCP() {
		return authoringCP;
	}
	public void setAuthoringCP(ims.core.resource.people.domain.objects.Hcp authoringCP) {
		this.authoringCP = authoringCP;
	}

	public java.util.Date getReferralDate() {
		return referralDate;
	}
	public void setReferralDate(java.util.Date referralDate) {
		this.referralDate = referralDate;
	}

	public java.util.Date getAssessmentDate() {
		return assessmentDate;
	}
	public void setAssessmentDate(java.util.Date assessmentDate) {
		this.assessmentDate = assessmentDate;
	}

	public ims.domain.lookups.LookupInstance getChairType() {
		return chairType;
	}
	public void setChairType(ims.domain.lookups.LookupInstance chairType) {
		this.chairType = chairType;
	}

	public String getWheelchairAuthority() {
		return wheelchairAuthority;
	}
	public void setWheelchairAuthority(String wheelchairAuthority) {
		if ( null != wheelchairAuthority && wheelchairAuthority.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for wheelchairAuthority. Tried to set value: "+
				wheelchairAuthority);
		}
		this.wheelchairAuthority = wheelchairAuthority;
	}

	public String getWheelchairTherapist() {
		return wheelchairTherapist;
	}
	public void setWheelchairTherapist(String wheelchairTherapist) {
		if ( null != wheelchairTherapist && wheelchairTherapist.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for wheelchairTherapist. Tried to set value: "+
				wheelchairTherapist);
		}
		this.wheelchairTherapist = wheelchairTherapist;
	}

	public String getOutcomeOfAssessment() {
		return outcomeOfAssessment;
	}
	public void setOutcomeOfAssessment(String outcomeOfAssessment) {
		if ( null != outcomeOfAssessment && outcomeOfAssessment.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for outcomeOfAssessment. Tried to set value: "+
				outcomeOfAssessment);
		}
		this.outcomeOfAssessment = outcomeOfAssessment;
	}

	public java.util.Date getDischargeDate() {
		return dischargeDate;
	}
	public void setDischargeDate(java.util.Date dischargeDate) {
		this.dischargeDate = dischargeDate;
	}

	public String getDischargeDetails() {
		return dischargeDetails;
	}
	public void setDischargeDetails(String dischargeDetails) {
		if ( null != dischargeDetails && dischargeDetails.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for dischargeDetails. Tried to set value: "+
				dischargeDetails);
		}
		this.dischargeDetails = dischargeDetails;
	}

	public String getOtherAssessmentInfo() {
		return otherAssessmentInfo;
	}
	public void setOtherAssessmentInfo(String otherAssessmentInfo) {
		if ( null != otherAssessmentInfo && otherAssessmentInfo.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for otherAssessmentInfo. Tried to set value: "+
				otherAssessmentInfo);
		}
		this.otherAssessmentInfo = otherAssessmentInfo;
	}

	public ims.domain.lookups.LookupInstance getPatientInformed() {
		return patientInformed;
	}
	public void setPatientInformed(ims.domain.lookups.LookupInstance patientInformed) {
		this.patientInformed = patientInformed;
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
		auditStr.append("\r\n*clinicalContact* :");
		if (clinicalContact != null)
		{
			auditStr.append(toShortClassName(clinicalContact));
				
		    auditStr.append(clinicalContact.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringDateTime* :");
		auditStr.append(authoringDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringCP* :");
		if (authoringCP != null)
		{
			auditStr.append(toShortClassName(authoringCP));
				
		    auditStr.append(authoringCP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*referralDate* :");
		auditStr.append(referralDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*assessmentDate* :");
		auditStr.append(assessmentDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*chairType* :");
		if (chairType != null)
			auditStr.append(chairType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*wheelchairAuthority* :");
		auditStr.append(wheelchairAuthority);
	    auditStr.append("; ");
		auditStr.append("\r\n*wheelchairTherapist* :");
		auditStr.append(wheelchairTherapist);
	    auditStr.append("; ");
		auditStr.append("\r\n*outcomeOfAssessment* :");
		auditStr.append(outcomeOfAssessment);
	    auditStr.append("; ");
		auditStr.append("\r\n*dischargeDate* :");
		auditStr.append(dischargeDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*dischargeDetails* :");
		auditStr.append(dischargeDetails);
	    auditStr.append("; ");
		auditStr.append("\r\n*otherAssessmentInfo* :");
		auditStr.append(otherAssessmentInfo);
	    auditStr.append("; ");
		auditStr.append("\r\n*patientInformed* :");
		if (patientInformed != null)
			auditStr.append(patientInformed.getText());
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
		
		String keyClassName = "WheelchairReferral";
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
		if (this.getClinicalContact() != null)
		{
			sb.append("<clinicalContact>");
			sb.append(this.getClinicalContact().toXMLString(domMap)); 	
			sb.append("</clinicalContact>");		
		}
		if (this.getAuthoringDateTime() != null)
		{
			sb.append("<authoringDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getAuthoringDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</authoringDateTime>");		
		}
		if (this.getAuthoringCP() != null)
		{
			sb.append("<authoringCP>");
			sb.append(this.getAuthoringCP().toXMLString(domMap)); 	
			sb.append("</authoringCP>");		
		}
		if (this.getReferralDate() != null)
		{
			sb.append("<referralDate>");
			sb.append(new ims.framework.utils.DateTime(this.getReferralDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</referralDate>");		
		}
		if (this.getAssessmentDate() != null)
		{
			sb.append("<assessmentDate>");
			sb.append(new ims.framework.utils.DateTime(this.getAssessmentDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</assessmentDate>");		
		}
		if (this.getChairType() != null)
		{
			sb.append("<chairType>");
			sb.append(this.getChairType().toXMLString()); 
			sb.append("</chairType>");		
		}
		if (this.getWheelchairAuthority() != null)
		{
			sb.append("<wheelchairAuthority>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getWheelchairAuthority().toString()));
			sb.append("</wheelchairAuthority>");		
		}
		if (this.getWheelchairTherapist() != null)
		{
			sb.append("<wheelchairTherapist>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getWheelchairTherapist().toString()));
			sb.append("</wheelchairTherapist>");		
		}
		if (this.getOutcomeOfAssessment() != null)
		{
			sb.append("<outcomeOfAssessment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOutcomeOfAssessment().toString()));
			sb.append("</outcomeOfAssessment>");		
		}
		if (this.getDischargeDate() != null)
		{
			sb.append("<dischargeDate>");
			sb.append(new ims.framework.utils.DateTime(this.getDischargeDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dischargeDate>");		
		}
		if (this.getDischargeDetails() != null)
		{
			sb.append("<dischargeDetails>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDischargeDetails().toString()));
			sb.append("</dischargeDetails>");		
		}
		if (this.getOtherAssessmentInfo() != null)
		{
			sb.append("<otherAssessmentInfo>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOtherAssessmentInfo().toString()));
			sb.append("</otherAssessmentInfo>");		
		}
		if (this.getPatientInformed() != null)
		{
			sb.append("<patientInformed>");
			sb.append(this.getPatientInformed().toXMLString()); 
			sb.append("</patientInformed>");		
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
			WheelchairReferral domainObject = getWheelchairReferralfromXML(itemEl, factory, domMap);

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
			WheelchairReferral domainObject = getWheelchairReferralfromXML(itemEl, factory, domMap);

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
		
	public static WheelchairReferral getWheelchairReferralfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getWheelchairReferralfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static WheelchairReferral getWheelchairReferralfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!WheelchairReferral.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!WheelchairReferral.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the WheelchairReferral class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (WheelchairReferral)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(WheelchairReferral.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		WheelchairReferral ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (WheelchairReferral)factory.getImportedDomainObject(WheelchairReferral.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new WheelchairReferral();
		}
		String keyClassName = "WheelchairReferral";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (WheelchairReferral)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, WheelchairReferral obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("clinicalContact");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setClinicalContact(ims.core.admin.domain.objects.ClinicalContact.getClinicalContactfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("authoringDateTime");
		if(fldEl != null)
		{	
    		obj.setAuthoringDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("authoringCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringCP(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("referralDate");
		if(fldEl != null)
		{	
    		obj.setReferralDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("assessmentDate");
		if(fldEl != null)
		{	
    		obj.setAssessmentDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("chairType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setChairType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("wheelchairAuthority");
		if(fldEl != null)
		{	
    		obj.setWheelchairAuthority(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("wheelchairTherapist");
		if(fldEl != null)
		{	
    		obj.setWheelchairTherapist(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("outcomeOfAssessment");
		if(fldEl != null)
		{	
    		obj.setOutcomeOfAssessment(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dischargeDate");
		if(fldEl != null)
		{	
    		obj.setDischargeDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("dischargeDetails");
		if(fldEl != null)
		{	
    		obj.setDischargeDetails(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("otherAssessmentInfo");
		if(fldEl != null)
		{	
    		obj.setOtherAssessmentInfo(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("patientInformed");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPatientInformed(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
		public static final String ClinicalContact = "clinicalContact";
		public static final String AuthoringDateTime = "authoringDateTime";
		public static final String AuthoringCP = "authoringCP";
		public static final String ReferralDate = "referralDate";
		public static final String AssessmentDate = "assessmentDate";
		public static final String ChairType = "chairType";
		public static final String WheelchairAuthority = "wheelchairAuthority";
		public static final String WheelchairTherapist = "wheelchairTherapist";
		public static final String OutcomeOfAssessment = "outcomeOfAssessment";
		public static final String DischargeDate = "dischargeDate";
		public static final String DischargeDetails = "dischargeDetails";
		public static final String OtherAssessmentInfo = "otherAssessmentInfo";
		public static final String PatientInformed = "patientInformed";
	}
}

