/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated: 16/04/2014, 12:34
 *
 */
package ims.RefMan.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class ConsultationOutcome extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1096100028;
	private static final long serialVersionUID = 1096100028L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** AuthoringInformation */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInformation;
	/** Patient */
	private ims.core.patient.domain.objects.Patient patient;
	/** Care Context */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** Further Management Instructions */
	private String furtherManagement;
	/** Discharge Date */
	private java.util.Date dischargeDate;
	/** Discharge Type */
	private ims.domain.lookups.LookupInstance dischargeType;
	/** Followup Management Type */
	private ims.domain.lookups.LookupInstance followupType;
	/** Discharge Method */
	private ims.domain.lookups.LookupInstance dischargeMethod;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ConsultationOutcome (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ConsultationOutcome ()
    {
    	super();
    }
    public ConsultationOutcome (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.RefMan.domain.objects.ConsultationOutcome.class;
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
	public static java.util.List listConsultationOutcomeByPatient(ims.domain.ILightweightDomainFactory factory, ims.core.patient.domain.objects.Patient val)
	{
		String hql = "from ConsultationOutcome c where c.patient = :patient";		
		return factory.find(hql, new String[]{"patient"}, new Object[]{val});		
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

	public String getFurtherManagement() {
		return furtherManagement;
	}
	public void setFurtherManagement(String furtherManagement) {
		this.furtherManagement = furtherManagement;
	}

	public java.util.Date getDischargeDate() {
		return dischargeDate;
	}
	public void setDischargeDate(java.util.Date dischargeDate) {
		this.dischargeDate = dischargeDate;
	}

	public ims.domain.lookups.LookupInstance getDischargeType() {
		return dischargeType;
	}
	public void setDischargeType(ims.domain.lookups.LookupInstance dischargeType) {
		this.dischargeType = dischargeType;
	}

	public ims.domain.lookups.LookupInstance getFollowupType() {
		return followupType;
	}
	public void setFollowupType(ims.domain.lookups.LookupInstance followupType) {
		this.followupType = followupType;
	}

	public ims.domain.lookups.LookupInstance getDischargeMethod() {
		return dischargeMethod;
	}
	public void setDischargeMethod(ims.domain.lookups.LookupInstance dischargeMethod) {
		this.dischargeMethod = dischargeMethod;
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
		auditStr.append("\r\n*furtherManagement* :");
		auditStr.append(furtherManagement);
	    auditStr.append("; ");
		auditStr.append("\r\n*dischargeDate* :");
		auditStr.append(dischargeDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*dischargeType* :");
		if (dischargeType != null)
			auditStr.append(dischargeType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*followupType* :");
		if (followupType != null)
			auditStr.append(followupType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*dischargeMethod* :");
		if (dischargeMethod != null)
			auditStr.append(dischargeMethod.getText());
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
		
		String keyClassName = "ConsultationOutcome";
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
		if (this.getFurtherManagement() != null)
		{
			sb.append("<furtherManagement>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getFurtherManagement().toString()));
			sb.append("</furtherManagement>");		
		}
		if (this.getDischargeDate() != null)
		{
			sb.append("<dischargeDate>");
			sb.append(new ims.framework.utils.DateTime(this.getDischargeDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dischargeDate>");		
		}
		if (this.getDischargeType() != null)
		{
			sb.append("<dischargeType>");
			sb.append(this.getDischargeType().toXMLString()); 
			sb.append("</dischargeType>");		
		}
		if (this.getFollowupType() != null)
		{
			sb.append("<followupType>");
			sb.append(this.getFollowupType().toXMLString()); 
			sb.append("</followupType>");		
		}
		if (this.getDischargeMethod() != null)
		{
			sb.append("<dischargeMethod>");
			sb.append(this.getDischargeMethod().toXMLString()); 
			sb.append("</dischargeMethod>");		
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
			ConsultationOutcome domainObject = getConsultationOutcomefromXML(itemEl, factory, domMap);

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
			ConsultationOutcome domainObject = getConsultationOutcomefromXML(itemEl, factory, domMap);

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
		
	public static ConsultationOutcome getConsultationOutcomefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getConsultationOutcomefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ConsultationOutcome getConsultationOutcomefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ConsultationOutcome.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ConsultationOutcome.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ConsultationOutcome class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ConsultationOutcome)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ConsultationOutcome.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ConsultationOutcome ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ConsultationOutcome)factory.getImportedDomainObject(ConsultationOutcome.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ConsultationOutcome();
		}
		String keyClassName = "ConsultationOutcome";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ConsultationOutcome)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ConsultationOutcome obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
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
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("furtherManagement");
		if(fldEl != null)
		{	
    		obj.setFurtherManagement(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dischargeDate");
		if(fldEl != null)
		{	
    		obj.setDischargeDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("dischargeType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDischargeType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("followupType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setFollowupType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("dischargeMethod");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDischargeMethod(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
		public static final String AuthoringInformation = "authoringInformation";
		public static final String Patient = "patient";
		public static final String CareContext = "careContext";
		public static final String FurtherManagement = "furtherManagement";
		public static final String DischargeDate = "dischargeDate";
		public static final String DischargeType = "dischargeType";
		public static final String FollowupType = "followupType";
		public static final String DischargeMethod = "dischargeMethod";
	}
}

