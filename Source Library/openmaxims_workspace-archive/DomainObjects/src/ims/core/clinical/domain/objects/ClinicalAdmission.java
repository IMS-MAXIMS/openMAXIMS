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


public class ClinicalAdmission extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1009100020;
	private static final long serialVersionUID = 1009100020L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Authoring Information */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInformation;
	/** Care Context */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** Admitting Nurse */
	private ims.core.resource.people.domain.objects.Nurse admittingNurse;
	/** Client Understanding */
	private String clientUnderstanding;
	/** Social Circumstance */
	private String socialCircumstance;
	/** AdmissionChecklist
	  * Collection of ims.nursing.domain.objects.AdmissionChecklist.
	  */
	private java.util.List admissionChecklist;
	/** Admission Confirmed Date / Time */
	private java.util.Date confirmedDateTime;
	/** Admission Confirmed By */
	private ims.core.resource.people.domain.objects.MemberOfStaff confirmedBy;
	/** Discharged Date / Time */
	private java.util.Date dischargedDateTime;
	/** Discharged By */
	private ims.core.resource.people.domain.objects.MemberOfStaff dischargedBy;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ClinicalAdmission (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ClinicalAdmission ()
    {
    	super();
    }
    public ClinicalAdmission (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.clinical.domain.objects.ClinicalAdmission.class;
	}


	public ims.core.clinical.domain.objects.AuthoringInformation getAuthoringInformation() {
		return authoringInformation;
	}
	public void setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation authoringInformation) {
		this.authoringInformation = authoringInformation;
	}

	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public ims.core.resource.people.domain.objects.Nurse getAdmittingNurse() {
		return admittingNurse;
	}
	public void setAdmittingNurse(ims.core.resource.people.domain.objects.Nurse admittingNurse) {
		this.admittingNurse = admittingNurse;
	}

	public String getClientUnderstanding() {
		return clientUnderstanding;
	}
	public void setClientUnderstanding(String clientUnderstanding) {
		if ( null != clientUnderstanding && clientUnderstanding.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for clientUnderstanding. Tried to set value: "+
				clientUnderstanding);
		}
		this.clientUnderstanding = clientUnderstanding;
	}

	public String getSocialCircumstance() {
		return socialCircumstance;
	}
	public void setSocialCircumstance(String socialCircumstance) {
		if ( null != socialCircumstance && socialCircumstance.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for socialCircumstance. Tried to set value: "+
				socialCircumstance);
		}
		this.socialCircumstance = socialCircumstance;
	}

	public java.util.List getAdmissionChecklist() {
		if ( null == admissionChecklist ) {
			admissionChecklist = new java.util.ArrayList();
		}
		return admissionChecklist;
	}
	public void setAdmissionChecklist(java.util.List paramValue) {
		this.admissionChecklist = paramValue;
	}

	public java.util.Date getConfirmedDateTime() {
		return confirmedDateTime;
	}
	public void setConfirmedDateTime(java.util.Date confirmedDateTime) {
		this.confirmedDateTime = confirmedDateTime;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getConfirmedBy() {
		return confirmedBy;
	}
	public void setConfirmedBy(ims.core.resource.people.domain.objects.MemberOfStaff confirmedBy) {
		this.confirmedBy = confirmedBy;
	}

	public java.util.Date getDischargedDateTime() {
		return dischargedDateTime;
	}
	public void setDischargedDateTime(java.util.Date dischargedDateTime) {
		this.dischargedDateTime = dischargedDateTime;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getDischargedBy() {
		return dischargedBy;
	}
	public void setDischargedBy(ims.core.resource.people.domain.objects.MemberOfStaff dischargedBy) {
		this.dischargedBy = dischargedBy;
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
		
		auditStr.append("\r\n*authoringInformation* :");
		if (authoringInformation != null)
		{
			auditStr.append(toShortClassName(authoringInformation));
				
		    auditStr.append(authoringInformation.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*admittingNurse* :");
		if (admittingNurse != null)
		{
			auditStr.append(toShortClassName(admittingNurse));
				
		    auditStr.append(admittingNurse.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*clientUnderstanding* :");
		auditStr.append(clientUnderstanding);
	    auditStr.append("; ");
		auditStr.append("\r\n*socialCircumstance* :");
		auditStr.append(socialCircumstance);
	    auditStr.append("; ");
		auditStr.append("\r\n*admissionChecklist* :");
		if (admissionChecklist != null)
		{
		int i6=0;
		for (i6=0; i6<admissionChecklist.size(); i6++)
		{
			if (i6 > 0)
				auditStr.append(",");
			ims.nursing.domain.objects.AdmissionChecklist obj = (ims.nursing.domain.objects.AdmissionChecklist)admissionChecklist.get(i6);
		    if (obj != null)
			{
				if (i6 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i6 > 0)
			auditStr.append("] " + i6);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*confirmedDateTime* :");
		auditStr.append(confirmedDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*confirmedBy* :");
		if (confirmedBy != null)
		{
			auditStr.append(toShortClassName(confirmedBy));
				
		    auditStr.append(confirmedBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*dischargedDateTime* :");
		auditStr.append(dischargedDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*dischargedBy* :");
		if (dischargedBy != null)
		{
			auditStr.append(toShortClassName(dischargedBy));
				
		    auditStr.append(dischargedBy.getId());
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
		
		String keyClassName = "ClinicalAdmission";
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
		if (this.getAuthoringInformation() != null)
		{
			sb.append("<authoringInformation>");
			sb.append(this.getAuthoringInformation().toXMLString(domMap)); 	
			sb.append("</authoringInformation>");		
		}
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
		}
		if (this.getAdmittingNurse() != null)
		{
			sb.append("<admittingNurse>");
			sb.append(this.getAdmittingNurse().toXMLString(domMap)); 	
			sb.append("</admittingNurse>");		
		}
		if (this.getClientUnderstanding() != null)
		{
			sb.append("<clientUnderstanding>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getClientUnderstanding().toString()));
			sb.append("</clientUnderstanding>");		
		}
		if (this.getSocialCircumstance() != null)
		{
			sb.append("<socialCircumstance>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSocialCircumstance().toString()));
			sb.append("</socialCircumstance>");		
		}
		if (this.getAdmissionChecklist() != null)
		{
			if (this.getAdmissionChecklist().size() > 0 )
			{
			sb.append("<admissionChecklist>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getAdmissionChecklist(), domMap));
			sb.append("</admissionChecklist>");		
			}
		}
		if (this.getConfirmedDateTime() != null)
		{
			sb.append("<confirmedDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getConfirmedDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</confirmedDateTime>");		
		}
		if (this.getConfirmedBy() != null)
		{
			sb.append("<confirmedBy>");
			sb.append(this.getConfirmedBy().toXMLString(domMap)); 	
			sb.append("</confirmedBy>");		
		}
		if (this.getDischargedDateTime() != null)
		{
			sb.append("<dischargedDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getDischargedDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dischargedDateTime>");		
		}
		if (this.getDischargedBy() != null)
		{
			sb.append("<dischargedBy>");
			sb.append(this.getDischargedBy().toXMLString(domMap)); 	
			sb.append("</dischargedBy>");		
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
			ClinicalAdmission domainObject = getClinicalAdmissionfromXML(itemEl, factory, domMap);

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
			ClinicalAdmission domainObject = getClinicalAdmissionfromXML(itemEl, factory, domMap);

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
		
	public static ClinicalAdmission getClinicalAdmissionfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getClinicalAdmissionfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ClinicalAdmission getClinicalAdmissionfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ClinicalAdmission.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ClinicalAdmission.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ClinicalAdmission class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ClinicalAdmission)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ClinicalAdmission.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ClinicalAdmission ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ClinicalAdmission)factory.getImportedDomainObject(ClinicalAdmission.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ClinicalAdmission();
		}
		String keyClassName = "ClinicalAdmission";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ClinicalAdmission)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ClinicalAdmission obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("authoringInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("admittingNurse");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAdmittingNurse(ims.core.resource.people.domain.objects.Nurse.getNursefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("clientUnderstanding");
		if(fldEl != null)
		{	
    		obj.setClientUnderstanding(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("socialCircumstance");
		if(fldEl != null)
		{	
    		obj.setSocialCircumstance(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("admissionChecklist");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setAdmissionChecklist(ims.nursing.domain.objects.AdmissionChecklist.fromListXMLString(fldEl, factory, obj.getAdmissionChecklist(), domMap));
		}
		fldEl = el.element("confirmedDateTime");
		if(fldEl != null)
		{	
    		obj.setConfirmedDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("confirmedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setConfirmedBy(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("dischargedDateTime");
		if(fldEl != null)
		{	
    		obj.setDischargedDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("dischargedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setDischargedBy(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "admissionChecklist"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String AuthoringInformation = "authoringInformation";
		public static final String CareContext = "careContext";
		public static final String AdmittingNurse = "admittingNurse";
		public static final String ClientUnderstanding = "clientUnderstanding";
		public static final String SocialCircumstance = "socialCircumstance";
		public static final String AdmissionChecklist = "admissionChecklist";
		public static final String ConfirmedDateTime = "confirmedDateTime";
		public static final String ConfirmedBy = "confirmedBy";
		public static final String DischargedDateTime = "dischargedDateTime";
		public static final String DischargedBy = "dischargedBy";
	}
}

