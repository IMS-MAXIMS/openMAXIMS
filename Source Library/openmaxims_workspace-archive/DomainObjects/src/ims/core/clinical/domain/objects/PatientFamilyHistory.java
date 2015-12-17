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


public class PatientFamilyHistory extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1003100056;
	private static final long serialVersionUID = 1003100056L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Clinical Contact */
	private ims.core.admin.domain.objects.ClinicalContact clinicalContact;
	/** Family member's relationship to patient */
	private ims.domain.lookups.LookupInstance relationship;
	/** Relative's Name */
	private String relativeName;
	/** Diagnosis */
	private ims.core.clinical.domain.objects.Diagnosis diagnosis;
	/** Diagnosis Description */
	private String diagnosisDescription;
	/** Relative DOB */
	private Integer relativeDOB;
	/** Age at onset */
	private Integer ageAtOnset;
	/** Relative Living? Optional */
	private ims.domain.lookups.LookupInstance relativeLiving;
	/** Age at death */
	private Integer ageAtDeath;
	/** Notes */
	private String notes;
	/** AuthoringInformation */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInformation;
	/** Patient */
	private ims.core.patient.domain.objects.Patient patient;
	private ims.core.admin.domain.objects.CareContext careContext;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PatientFamilyHistory (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PatientFamilyHistory ()
    {
    	super();
    }
    public PatientFamilyHistory (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.clinical.domain.objects.PatientFamilyHistory.class;
	}


	public ims.core.admin.domain.objects.ClinicalContact getClinicalContact() {
		return clinicalContact;
	}
	public void setClinicalContact(ims.core.admin.domain.objects.ClinicalContact clinicalContact) {
		this.clinicalContact = clinicalContact;
	}

	public ims.domain.lookups.LookupInstance getRelationship() {
		return relationship;
	}
	public void setRelationship(ims.domain.lookups.LookupInstance relationship) {
		this.relationship = relationship;
	}

	public String getRelativeName() {
		return relativeName;
	}
	public void setRelativeName(String relativeName) {
		if ( null != relativeName && relativeName.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for relativeName. Tried to set value: "+
				relativeName);
		}
		this.relativeName = relativeName;
	}

	public ims.core.clinical.domain.objects.Diagnosis getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(ims.core.clinical.domain.objects.Diagnosis diagnosis) {
		this.diagnosis = diagnosis;
	}

	public String getDiagnosisDescription() {
		return diagnosisDescription;
	}
	public void setDiagnosisDescription(String diagnosisDescription) {
		if ( null != diagnosisDescription && diagnosisDescription.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for diagnosisDescription. Tried to set value: "+
				diagnosisDescription);
		}
		this.diagnosisDescription = diagnosisDescription;
	}

	public Integer getRelativeDOB() {
		return relativeDOB;
	}
	public void setRelativeDOB(Integer relativeDOB) {
		this.relativeDOB = relativeDOB;
	}

	public Integer getAgeAtOnset() {
		return ageAtOnset;
	}
	public void setAgeAtOnset(Integer ageAtOnset) {
		this.ageAtOnset = ageAtOnset;
	}

	public ims.domain.lookups.LookupInstance getRelativeLiving() {
		return relativeLiving;
	}
	public void setRelativeLiving(ims.domain.lookups.LookupInstance relativeLiving) {
		this.relativeLiving = relativeLiving;
	}

	public Integer getAgeAtDeath() {
		return ageAtDeath;
	}
	public void setAgeAtDeath(Integer ageAtDeath) {
		this.ageAtDeath = ageAtDeath;
	}

	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		if ( null != notes && notes.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for notes. Tried to set value: "+
				notes);
		}
		this.notes = notes;
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

	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
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
		
		auditStr.append("\r\n*clinicalContact* :");
		if (clinicalContact != null)
		{
			auditStr.append(toShortClassName(clinicalContact));
				
		    auditStr.append(clinicalContact.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*relationship* :");
		if (relationship != null)
			auditStr.append(relationship.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*relativeName* :");
		auditStr.append(relativeName);
	    auditStr.append("; ");
		auditStr.append("\r\n*diagnosis* :");
		if (diagnosis != null)
		{
			auditStr.append(toShortClassName(diagnosis));
				
		    auditStr.append(diagnosis.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*diagnosisDescription* :");
		auditStr.append(diagnosisDescription);
	    auditStr.append("; ");
		auditStr.append("\r\n*relativeDOB* :");
		auditStr.append(relativeDOB);
	    auditStr.append("; ");
		auditStr.append("\r\n*ageAtOnset* :");
		auditStr.append(ageAtOnset);
	    auditStr.append("; ");
		auditStr.append("\r\n*relativeLiving* :");
		if (relativeLiving != null)
			auditStr.append(relativeLiving.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*ageAtDeath* :");
		auditStr.append(ageAtDeath);
	    auditStr.append("; ");
		auditStr.append("\r\n*notes* :");
		auditStr.append(notes);
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
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
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
		
		String keyClassName = "PatientFamilyHistory";
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
		if (this.getClinicalContact() != null)
		{
			sb.append("<clinicalContact>");
			sb.append(this.getClinicalContact().toXMLString(domMap)); 	
			sb.append("</clinicalContact>");		
		}
		if (this.getRelationship() != null)
		{
			sb.append("<relationship>");
			sb.append(this.getRelationship().toXMLString()); 
			sb.append("</relationship>");		
		}
		if (this.getRelativeName() != null)
		{
			sb.append("<relativeName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRelativeName().toString()));
			sb.append("</relativeName>");		
		}
		if (this.getDiagnosis() != null)
		{
			sb.append("<diagnosis>");
			sb.append(this.getDiagnosis().toXMLString(domMap)); 	
			sb.append("</diagnosis>");		
		}
		if (this.getDiagnosisDescription() != null)
		{
			sb.append("<diagnosisDescription>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDiagnosisDescription().toString()));
			sb.append("</diagnosisDescription>");		
		}
		if (this.getRelativeDOB() != null)
		{
			sb.append("<relativeDOB>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRelativeDOB().toString()));
			sb.append("</relativeDOB>");		
		}
		if (this.getAgeAtOnset() != null)
		{
			sb.append("<ageAtOnset>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAgeAtOnset().toString()));
			sb.append("</ageAtOnset>");		
		}
		if (this.getRelativeLiving() != null)
		{
			sb.append("<relativeLiving>");
			sb.append(this.getRelativeLiving().toXMLString()); 
			sb.append("</relativeLiving>");		
		}
		if (this.getAgeAtDeath() != null)
		{
			sb.append("<ageAtDeath>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAgeAtDeath().toString()));
			sb.append("</ageAtDeath>");		
		}
		if (this.getNotes() != null)
		{
			sb.append("<notes>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNotes().toString()));
			sb.append("</notes>");		
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
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
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
			PatientFamilyHistory domainObject = getPatientFamilyHistoryfromXML(itemEl, factory, domMap);

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
			PatientFamilyHistory domainObject = getPatientFamilyHistoryfromXML(itemEl, factory, domMap);

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
		
	public static PatientFamilyHistory getPatientFamilyHistoryfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPatientFamilyHistoryfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PatientFamilyHistory getPatientFamilyHistoryfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PatientFamilyHistory.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PatientFamilyHistory.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PatientFamilyHistory class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PatientFamilyHistory)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PatientFamilyHistory.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PatientFamilyHistory ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PatientFamilyHistory)factory.getImportedDomainObject(PatientFamilyHistory.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PatientFamilyHistory();
		}
		String keyClassName = "PatientFamilyHistory";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PatientFamilyHistory)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PatientFamilyHistory obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("clinicalContact");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setClinicalContact(ims.core.admin.domain.objects.ClinicalContact.getClinicalContactfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("relationship");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setRelationship(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("relativeName");
		if(fldEl != null)
		{	
    		obj.setRelativeName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("diagnosis");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setDiagnosis(ims.core.clinical.domain.objects.Diagnosis.getDiagnosisfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("diagnosisDescription");
		if(fldEl != null)
		{	
    		obj.setDiagnosisDescription(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("relativeDOB");
		if(fldEl != null)
		{	
    		obj.setRelativeDOB(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("ageAtOnset");
		if(fldEl != null)
		{	
    		obj.setAgeAtOnset(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("relativeLiving");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setRelativeLiving(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("ageAtDeath");
		if(fldEl != null)
		{	
    		obj.setAgeAtDeath(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("notes");
		if(fldEl != null)
		{	
    		obj.setNotes(new String(fldEl.getTextTrim()));	
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
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
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
		public static final String ClinicalContact = "clinicalContact";
		public static final String Relationship = "relationship";
		public static final String RelativeName = "relativeName";
		public static final String Diagnosis = "diagnosis";
		public static final String DiagnosisDescription = "diagnosisDescription";
		public static final String RelativeDOB = "relativeDOB";
		public static final String AgeAtOnset = "ageAtOnset";
		public static final String RelativeLiving = "relativeLiving";
		public static final String AgeAtDeath = "ageAtDeath";
		public static final String Notes = "notes";
		public static final String AuthoringInformation = "authoringInformation";
		public static final String Patient = "patient";
		public static final String CareContext = "careContext";
	}
}

