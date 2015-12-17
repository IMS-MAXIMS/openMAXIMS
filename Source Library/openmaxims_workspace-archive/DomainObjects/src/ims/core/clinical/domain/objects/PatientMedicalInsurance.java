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


public class PatientMedicalInsurance extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1072100099;
	private static final long serialVersionUID = 1072100099L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Patient */
	private ims.core.patient.domain.objects.Patient patient;
	/** Company */
	private ims.core.configuration.domain.objects.PrivateInsuranceCompany company;
	/** Policy Number */
	private String policyNumber;
	/** PlanOrUnits */
	private String planOrUnits;
	/** Policy Type */
	private ims.domain.lookups.LookupInstance policyType;
	/** Authorisation Number */
	private String authorisationNumber;
	/** ExpiryDate */
	private java.util.Date expiryDate;
	/** Current Status */
	private ims.domain.lookups.LookupInstance currentStatus;
	/** Status Change Date */
	private java.util.Date statusChangeDate;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PatientMedicalInsurance (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PatientMedicalInsurance ()
    {
    	super();
    }
    public PatientMedicalInsurance (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.clinical.domain.objects.PatientMedicalInsurance.class;
	}


	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public ims.core.configuration.domain.objects.PrivateInsuranceCompany getCompany() {
		return company;
	}
	public void setCompany(ims.core.configuration.domain.objects.PrivateInsuranceCompany company) {
		this.company = company;
	}

	public String getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(String policyNumber) {
		if ( null != policyNumber && policyNumber.length() > 20 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for policyNumber. Tried to set value: "+
				policyNumber);
		}
		this.policyNumber = policyNumber;
	}

	public String getPlanOrUnits() {
		return planOrUnits;
	}
	public void setPlanOrUnits(String planOrUnits) {
		if ( null != planOrUnits && planOrUnits.length() > 4 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for planOrUnits. Tried to set value: "+
				planOrUnits);
		}
		this.planOrUnits = planOrUnits;
	}

	public ims.domain.lookups.LookupInstance getPolicyType() {
		return policyType;
	}
	public void setPolicyType(ims.domain.lookups.LookupInstance policyType) {
		this.policyType = policyType;
	}

	public String getAuthorisationNumber() {
		return authorisationNumber;
	}
	public void setAuthorisationNumber(String authorisationNumber) {
		if ( null != authorisationNumber && authorisationNumber.length() > 20 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for authorisationNumber. Tried to set value: "+
				authorisationNumber);
		}
		this.authorisationNumber = authorisationNumber;
	}

	public java.util.Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(java.util.Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public ims.domain.lookups.LookupInstance getCurrentStatus() {
		return currentStatus;
	}
	public void setCurrentStatus(ims.domain.lookups.LookupInstance currentStatus) {
		this.currentStatus = currentStatus;
	}

	public java.util.Date getStatusChangeDate() {
		return statusChangeDate;
	}
	public void setStatusChangeDate(java.util.Date statusChangeDate) {
		this.statusChangeDate = statusChangeDate;
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
		auditStr.append("\r\n*company* :");
		if (company != null)
		{
			auditStr.append(toShortClassName(company));
				
		    auditStr.append(company.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*policyNumber* :");
		auditStr.append(policyNumber);
	    auditStr.append("; ");
		auditStr.append("\r\n*planOrUnits* :");
		auditStr.append(planOrUnits);
	    auditStr.append("; ");
		auditStr.append("\r\n*policyType* :");
		if (policyType != null)
			auditStr.append(policyType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*authorisationNumber* :");
		auditStr.append(authorisationNumber);
	    auditStr.append("; ");
		auditStr.append("\r\n*expiryDate* :");
		auditStr.append(expiryDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*currentStatus* :");
		if (currentStatus != null)
			auditStr.append(currentStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*statusChangeDate* :");
		auditStr.append(statusChangeDate);
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
		
		String keyClassName = "PatientMedicalInsurance";
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
		if (this.getCompany() != null)
		{
			sb.append("<company>");
			sb.append(this.getCompany().toXMLString(domMap)); 	
			sb.append("</company>");		
		}
		if (this.getPolicyNumber() != null)
		{
			sb.append("<policyNumber>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPolicyNumber().toString()));
			sb.append("</policyNumber>");		
		}
		if (this.getPlanOrUnits() != null)
		{
			sb.append("<planOrUnits>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPlanOrUnits().toString()));
			sb.append("</planOrUnits>");		
		}
		if (this.getPolicyType() != null)
		{
			sb.append("<policyType>");
			sb.append(this.getPolicyType().toXMLString()); 
			sb.append("</policyType>");		
		}
		if (this.getAuthorisationNumber() != null)
		{
			sb.append("<authorisationNumber>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAuthorisationNumber().toString()));
			sb.append("</authorisationNumber>");		
		}
		if (this.getExpiryDate() != null)
		{
			sb.append("<expiryDate>");
			sb.append(new ims.framework.utils.DateTime(this.getExpiryDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</expiryDate>");		
		}
		if (this.getCurrentStatus() != null)
		{
			sb.append("<currentStatus>");
			sb.append(this.getCurrentStatus().toXMLString()); 
			sb.append("</currentStatus>");		
		}
		if (this.getStatusChangeDate() != null)
		{
			sb.append("<statusChangeDate>");
			sb.append(new ims.framework.utils.DateTime(this.getStatusChangeDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</statusChangeDate>");		
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
			PatientMedicalInsurance domainObject = getPatientMedicalInsurancefromXML(itemEl, factory, domMap);

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
			PatientMedicalInsurance domainObject = getPatientMedicalInsurancefromXML(itemEl, factory, domMap);

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
		
	public static PatientMedicalInsurance getPatientMedicalInsurancefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPatientMedicalInsurancefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PatientMedicalInsurance getPatientMedicalInsurancefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PatientMedicalInsurance.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PatientMedicalInsurance.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PatientMedicalInsurance class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PatientMedicalInsurance)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PatientMedicalInsurance.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PatientMedicalInsurance ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PatientMedicalInsurance)factory.getImportedDomainObject(PatientMedicalInsurance.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PatientMedicalInsurance();
		}
		String keyClassName = "PatientMedicalInsurance";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PatientMedicalInsurance)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PatientMedicalInsurance obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("company");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCompany(ims.core.configuration.domain.objects.PrivateInsuranceCompany.getPrivateInsuranceCompanyfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("policyNumber");
		if(fldEl != null)
		{	
    		obj.setPolicyNumber(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("planOrUnits");
		if(fldEl != null)
		{	
    		obj.setPlanOrUnits(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("policyType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPolicyType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("authorisationNumber");
		if(fldEl != null)
		{	
    		obj.setAuthorisationNumber(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("expiryDate");
		if(fldEl != null)
		{	
    		obj.setExpiryDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("currentStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCurrentStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("statusChangeDate");
		if(fldEl != null)
		{	
    		obj.setStatusChangeDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
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
		public static final String Company = "company";
		public static final String PolicyNumber = "policyNumber";
		public static final String PlanOrUnits = "planOrUnits";
		public static final String PolicyType = "policyType";
		public static final String AuthorisationNumber = "authorisationNumber";
		public static final String ExpiryDate = "expiryDate";
		public static final String CurrentStatus = "currentStatus";
		public static final String StatusChangeDate = "statusChangeDate";
	}
}

