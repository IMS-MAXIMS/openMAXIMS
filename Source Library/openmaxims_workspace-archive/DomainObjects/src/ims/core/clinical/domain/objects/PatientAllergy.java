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


public class PatientAllergy extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1003100008;
	private static final long serialVersionUID = 1003100008L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Allergen  */
	private ims.core.clinical.domain.objects.Allergen allergen;
	/** AllergenDescription */
	private String allergenDescription;
	private ims.domain.lookups.LookupInstance allergenType;
	/** 
	  * Collection of ims.core.clinical.domain.objects.PatientAllergyReaction.
	  */
	private java.util.Set allergenReactions;
	private Integer whenIdentified;
	/** Source of information */
	private ims.domain.lookups.LookupInstance sourceofInformation;
	private String comments;
	private ims.domain.lookups.LookupInstance confirmedStatus;
	private ims.core.resource.people.domain.objects.Hcp confirmedBy;
	private java.util.Date confirmedDateTime;
	private Boolean isCurrentlyActiveAllergy;
	private java.util.Date isCurrentEndDateTime;
	/** InactivationComments */
	private String inactivationComments;
	private ims.core.resource.people.domain.objects.Hcp isCurrentEndingHCP;
	/** Clinical Contact */
	private ims.core.admin.domain.objects.ClinicalContact clinicalContact;
	/** AuthoringInformation */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInformation;
	/** Patient */
	private ims.core.patient.domain.objects.Patient patient;
	/** Who Inactivated the allergy */
	private ims.core.clinical.domain.objects.AuthoringInformation inactivationAuthoringInfo;
	/** Include Allergy In Discharge Reports
	  * Collection of ims.core.clinical.domain.objects.IncludeAllergyInDischargeReport.
	  */
	private java.util.Set includeAllergyInDischargeReports;
	/** RecordingInformation */
	private ims.core.clinical.domain.objects.RecordingUserInformation recordingInformation;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PatientAllergy (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PatientAllergy ()
    {
    	super();
    }
    public PatientAllergy (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.clinical.domain.objects.PatientAllergy.class;
	}


	public ims.core.clinical.domain.objects.Allergen getAllergen() {
		return allergen;
	}
	public void setAllergen(ims.core.clinical.domain.objects.Allergen allergen) {
		this.allergen = allergen;
	}

	public String getAllergenDescription() {
		return allergenDescription;
	}
	public void setAllergenDescription(String allergenDescription) {
		if ( null != allergenDescription && allergenDescription.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for allergenDescription. Tried to set value: "+
				allergenDescription);
		}
		this.allergenDescription = allergenDescription;
	}

	public ims.domain.lookups.LookupInstance getAllergenType() {
		return allergenType;
	}
	public void setAllergenType(ims.domain.lookups.LookupInstance allergenType) {
		this.allergenType = allergenType;
	}

	public java.util.Set getAllergenReactions() {
		if ( null == allergenReactions ) {
			allergenReactions = new java.util.HashSet();
		}
		return allergenReactions;
	}
	public void setAllergenReactions(java.util.Set paramValue) {
		this.allergenReactions = paramValue;
	}

	public Integer getWhenIdentified() {
		return whenIdentified;
	}
	public void setWhenIdentified(Integer whenIdentified) {
		this.whenIdentified = whenIdentified;
	}

	public ims.domain.lookups.LookupInstance getSourceofInformation() {
		return sourceofInformation;
	}
	public void setSourceofInformation(ims.domain.lookups.LookupInstance sourceofInformation) {
		this.sourceofInformation = sourceofInformation;
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

	public ims.domain.lookups.LookupInstance getConfirmedStatus() {
		return confirmedStatus;
	}
	public void setConfirmedStatus(ims.domain.lookups.LookupInstance confirmedStatus) {
		this.confirmedStatus = confirmedStatus;
	}

	public ims.core.resource.people.domain.objects.Hcp getConfirmedBy() {
		return confirmedBy;
	}
	public void setConfirmedBy(ims.core.resource.people.domain.objects.Hcp confirmedBy) {
		this.confirmedBy = confirmedBy;
	}

	public java.util.Date getConfirmedDateTime() {
		return confirmedDateTime;
	}
	public void setConfirmedDateTime(java.util.Date confirmedDateTime) {
		this.confirmedDateTime = confirmedDateTime;
	}

	public Boolean isIsCurrentlyActiveAllergy() {
		return isCurrentlyActiveAllergy;
	}
	public void setIsCurrentlyActiveAllergy(Boolean isCurrentlyActiveAllergy) {
		this.isCurrentlyActiveAllergy = isCurrentlyActiveAllergy;
	}

	public java.util.Date getIsCurrentEndDateTime() {
		return isCurrentEndDateTime;
	}
	public void setIsCurrentEndDateTime(java.util.Date isCurrentEndDateTime) {
		this.isCurrentEndDateTime = isCurrentEndDateTime;
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

	public ims.core.resource.people.domain.objects.Hcp getIsCurrentEndingHCP() {
		return isCurrentEndingHCP;
	}
	public void setIsCurrentEndingHCP(ims.core.resource.people.domain.objects.Hcp isCurrentEndingHCP) {
		this.isCurrentEndingHCP = isCurrentEndingHCP;
	}

	public ims.core.admin.domain.objects.ClinicalContact getClinicalContact() {
		return clinicalContact;
	}
	public void setClinicalContact(ims.core.admin.domain.objects.ClinicalContact clinicalContact) {
		this.clinicalContact = clinicalContact;
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

	public java.util.Set getIncludeAllergyInDischargeReports() {
		if ( null == includeAllergyInDischargeReports ) {
			includeAllergyInDischargeReports = new java.util.HashSet();
		}
		return includeAllergyInDischargeReports;
	}
	public void setIncludeAllergyInDischargeReports(java.util.Set paramValue) {
		this.includeAllergyInDischargeReports = paramValue;
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
		
		auditStr.append("\r\n*allergen* :");
		if (allergen != null)
		{
			auditStr.append(toShortClassName(allergen));
				
		    auditStr.append(allergen.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*allergenDescription* :");
		auditStr.append(allergenDescription);
	    auditStr.append("; ");
		auditStr.append("\r\n*allergenType* :");
		if (allergenType != null)
			auditStr.append(allergenType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*allergenReactions* :");
		if (allergenReactions != null)
		{
			java.util.Iterator it4 = allergenReactions.iterator();
			int i4=0;
			while (it4.hasNext())
			{
				if (i4 > 0)
					auditStr.append(",");
				ims.core.clinical.domain.objects.PatientAllergyReaction obj = (ims.core.clinical.domain.objects.PatientAllergyReaction)it4.next();
		if (obj != null)
		{
		   if (i4 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i4++;
		}
		if (i4 > 0)
			auditStr.append("] " + i4);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*whenIdentified* :");
		auditStr.append(whenIdentified);
	    auditStr.append("; ");
		auditStr.append("\r\n*sourceofInformation* :");
		if (sourceofInformation != null)
			auditStr.append(sourceofInformation.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*comments* :");
		auditStr.append(comments);
	    auditStr.append("; ");
		auditStr.append("\r\n*confirmedStatus* :");
		if (confirmedStatus != null)
			auditStr.append(confirmedStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*confirmedBy* :");
		if (confirmedBy != null)
		{
			auditStr.append(toShortClassName(confirmedBy));
				
		    auditStr.append(confirmedBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*confirmedDateTime* :");
		auditStr.append(confirmedDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*isCurrentlyActiveAllergy* :");
		auditStr.append(isCurrentlyActiveAllergy);
	    auditStr.append("; ");
		auditStr.append("\r\n*isCurrentEndDateTime* :");
		auditStr.append(isCurrentEndDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*inactivationComments* :");
		auditStr.append(inactivationComments);
	    auditStr.append("; ");
		auditStr.append("\r\n*isCurrentEndingHCP* :");
		if (isCurrentEndingHCP != null)
		{
			auditStr.append(toShortClassName(isCurrentEndingHCP));
				
		    auditStr.append(isCurrentEndingHCP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*clinicalContact* :");
		if (clinicalContact != null)
		{
			auditStr.append(toShortClassName(clinicalContact));
				
		    auditStr.append(clinicalContact.getId());
		}
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
		auditStr.append("\r\n*includeAllergyInDischargeReports* :");
		if (includeAllergyInDischargeReports != null)
		{
			java.util.Iterator it19 = includeAllergyInDischargeReports.iterator();
			int i19=0;
			while (it19.hasNext())
			{
				if (i19 > 0)
					auditStr.append(",");
				ims.core.clinical.domain.objects.IncludeAllergyInDischargeReport obj = (ims.core.clinical.domain.objects.IncludeAllergyInDischargeReport)it19.next();
		if (obj != null)
		{
		   if (i19 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i19++;
		}
		if (i19 > 0)
			auditStr.append("] " + i19);
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
		
		String keyClassName = "PatientAllergy";
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
		if (this.getAllergen() != null)
		{
			sb.append("<allergen>");
			sb.append(this.getAllergen().toXMLString(domMap)); 	
			sb.append("</allergen>");		
		}
		if (this.getAllergenDescription() != null)
		{
			sb.append("<allergenDescription>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAllergenDescription().toString()));
			sb.append("</allergenDescription>");		
		}
		if (this.getAllergenType() != null)
		{
			sb.append("<allergenType>");
			sb.append(this.getAllergenType().toXMLString()); 
			sb.append("</allergenType>");		
		}
		if (this.getAllergenReactions() != null)
		{
			if (this.getAllergenReactions().size() > 0 )
			{
			sb.append("<allergenReactions>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getAllergenReactions(), domMap));
			sb.append("</allergenReactions>");		
			}
		}
		if (this.getWhenIdentified() != null)
		{
			sb.append("<whenIdentified>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getWhenIdentified().toString()));
			sb.append("</whenIdentified>");		
		}
		if (this.getSourceofInformation() != null)
		{
			sb.append("<sourceofInformation>");
			sb.append(this.getSourceofInformation().toXMLString()); 
			sb.append("</sourceofInformation>");		
		}
		if (this.getComments() != null)
		{
			sb.append("<comments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getComments().toString()));
			sb.append("</comments>");		
		}
		if (this.getConfirmedStatus() != null)
		{
			sb.append("<confirmedStatus>");
			sb.append(this.getConfirmedStatus().toXMLString()); 
			sb.append("</confirmedStatus>");		
		}
		if (this.getConfirmedBy() != null)
		{
			sb.append("<confirmedBy>");
			sb.append(this.getConfirmedBy().toXMLString(domMap)); 	
			sb.append("</confirmedBy>");		
		}
		if (this.getConfirmedDateTime() != null)
		{
			sb.append("<confirmedDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getConfirmedDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</confirmedDateTime>");		
		}
		if (this.isIsCurrentlyActiveAllergy() != null)
		{
			sb.append("<isCurrentlyActiveAllergy>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsCurrentlyActiveAllergy().toString()));
			sb.append("</isCurrentlyActiveAllergy>");		
		}
		if (this.getIsCurrentEndDateTime() != null)
		{
			sb.append("<isCurrentEndDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getIsCurrentEndDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</isCurrentEndDateTime>");		
		}
		if (this.getInactivationComments() != null)
		{
			sb.append("<inactivationComments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getInactivationComments().toString()));
			sb.append("</inactivationComments>");		
		}
		if (this.getIsCurrentEndingHCP() != null)
		{
			sb.append("<isCurrentEndingHCP>");
			sb.append(this.getIsCurrentEndingHCP().toXMLString(domMap)); 	
			sb.append("</isCurrentEndingHCP>");		
		}
		if (this.getClinicalContact() != null)
		{
			sb.append("<clinicalContact>");
			sb.append(this.getClinicalContact().toXMLString(domMap)); 	
			sb.append("</clinicalContact>");		
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
		if (this.getIncludeAllergyInDischargeReports() != null)
		{
			if (this.getIncludeAllergyInDischargeReports().size() > 0 )
			{
			sb.append("<includeAllergyInDischargeReports>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getIncludeAllergyInDischargeReports(), domMap));
			sb.append("</includeAllergyInDischargeReports>");		
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
			PatientAllergy domainObject = getPatientAllergyfromXML(itemEl, factory, domMap);

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
			PatientAllergy domainObject = getPatientAllergyfromXML(itemEl, factory, domMap);

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
		
	public static PatientAllergy getPatientAllergyfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPatientAllergyfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PatientAllergy getPatientAllergyfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PatientAllergy.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PatientAllergy.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PatientAllergy class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PatientAllergy)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PatientAllergy.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PatientAllergy ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PatientAllergy)factory.getImportedDomainObject(PatientAllergy.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PatientAllergy();
		}
		String keyClassName = "PatientAllergy";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PatientAllergy)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PatientAllergy obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("allergen");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAllergen(ims.core.clinical.domain.objects.Allergen.getAllergenfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("allergenDescription");
		if(fldEl != null)
		{	
    		obj.setAllergenDescription(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("allergenType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAllergenType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("allergenReactions");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setAllergenReactions(ims.core.clinical.domain.objects.PatientAllergyReaction.fromSetXMLString(fldEl, factory, obj.getAllergenReactions(), domMap));
		}
		fldEl = el.element("whenIdentified");
		if(fldEl != null)
		{	
    		obj.setWhenIdentified(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("sourceofInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSourceofInformation(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("comments");
		if(fldEl != null)
		{	
    		obj.setComments(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("confirmedStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setConfirmedStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("confirmedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setConfirmedBy(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("confirmedDateTime");
		if(fldEl != null)
		{	
    		obj.setConfirmedDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("isCurrentlyActiveAllergy");
		if(fldEl != null)
		{	
    		obj.setIsCurrentlyActiveAllergy(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isCurrentEndDateTime");
		if(fldEl != null)
		{	
    		obj.setIsCurrentEndDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("inactivationComments");
		if(fldEl != null)
		{	
    		obj.setInactivationComments(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isCurrentEndingHCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setIsCurrentEndingHCP(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("clinicalContact");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setClinicalContact(ims.core.admin.domain.objects.ClinicalContact.getClinicalContactfromXML(fldEl, factory, domMap)); 
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
		fldEl = el.element("includeAllergyInDischargeReports");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setIncludeAllergyInDischargeReports(ims.core.clinical.domain.objects.IncludeAllergyInDischargeReport.fromSetXMLString(fldEl, factory, obj.getIncludeAllergyInDischargeReports(), domMap));
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
		 "allergenReactions"
		, "includeAllergyInDischargeReports"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Allergen = "allergen";
		public static final String AllergenDescription = "allergenDescription";
		public static final String AllergenType = "allergenType";
		public static final String AllergenReactions = "allergenReactions";
		public static final String WhenIdentified = "whenIdentified";
		public static final String SourceofInformation = "sourceofInformation";
		public static final String Comments = "comments";
		public static final String ConfirmedStatus = "confirmedStatus";
		public static final String ConfirmedBy = "confirmedBy";
		public static final String ConfirmedDateTime = "confirmedDateTime";
		public static final String IsCurrentlyActiveAllergy = "isCurrentlyActiveAllergy";
		public static final String IsCurrentEndDateTime = "isCurrentEndDateTime";
		public static final String InactivationComments = "inactivationComments";
		public static final String IsCurrentEndingHCP = "isCurrentEndingHCP";
		public static final String ClinicalContact = "clinicalContact";
		public static final String AuthoringInformation = "authoringInformation";
		public static final String Patient = "patient";
		public static final String InactivationAuthoringInfo = "inactivationAuthoringInfo";
		public static final String IncludeAllergyInDischargeReports = "includeAllergyInDischargeReports";
		public static final String RecordingInformation = "recordingInformation";
	}
}

