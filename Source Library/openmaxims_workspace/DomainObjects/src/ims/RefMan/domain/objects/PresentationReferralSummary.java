//#############################################################################
//#                                                                           #
//#  Copyright (C) <2015>  <IMS MAXIMS>                                       #
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
//#  IMS MAXIMS provides absolutely NO GUARANTEE OF THE CLINICAL SAFTEY of    #
//#  this program.  Users of this software do so entirely at their own risk.  #
//#  IMS MAXIMS only ensures the Clinical Safety of unaltered run-time        #
//#  software that it builds, deploys and maintains.                          #
//#                                                                           #
//#############################################################################
//#EOH
/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5589.25814)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated: 12/10/2015, 13:28
 *
 */
package ims.RefMan.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class PresentationReferralSummary extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1096100001;
	private static final long serialVersionUID = 1096100001L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Cats Referral */
	private ims.RefMan.domain.objects.CatsReferral catsReferral;
	/** AuthoringUser */
	private ims.core.resource.people.domain.objects.MemberOfStaff authoringUser;
	/** Authoring Date Time */
	private java.util.Date authoringDateTime;
	/** Presenting Issues - Complaints
	  * Collection of ims.clinical.domain.objects.PatientComplaint.
	  */
	private java.util.Set presentingIssues;
	/** Medication On Referral
	  * Collection of ims.core.clinical.domain.objects.PatientMedication.
	  */
	private java.util.Set medicationOnReferral;
	/** Allergies
	  * Collection of ims.core.clinical.domain.objects.PatientAllergy.
	  */
	private java.util.Set allergies;
	/** Comorbidities
	  * Collection of ims.core.clinical.domain.objects.PatientDiagnosis.
	  */
	private java.util.Set comorbidities;
	/** Presenting Issues Non Indicated */
	private Boolean presentingIssuesNonIndicated;
	/** Meedication Non Indicated */
	private Boolean medicationNonIndicated;
	/** Allergies Non Indicated */
	private Boolean allergiesIssuesNonIndicated;
	/** Comorbidities Non Indicated */
	private Boolean comorbiditiesIssuesNonIndicated;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PresentationReferralSummary (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PresentationReferralSummary ()
    {
    	super();
    }
    public PresentationReferralSummary (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.RefMan.domain.objects.PresentationReferralSummary.class;
	}


	public ims.RefMan.domain.objects.CatsReferral getCatsReferral() {
		return catsReferral;
	}
	public void setCatsReferral(ims.RefMan.domain.objects.CatsReferral catsReferral) {
		this.catsReferral = catsReferral;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getAuthoringUser() {
		return authoringUser;
	}
	public void setAuthoringUser(ims.core.resource.people.domain.objects.MemberOfStaff authoringUser) {
		this.authoringUser = authoringUser;
	}

	public java.util.Date getAuthoringDateTime() {
		return authoringDateTime;
	}
	public void setAuthoringDateTime(java.util.Date authoringDateTime) {
		this.authoringDateTime = authoringDateTime;
	}

	public java.util.Set getPresentingIssues() {
		if ( null == presentingIssues ) {
			presentingIssues = new java.util.HashSet();
		}
		return presentingIssues;
	}
	public void setPresentingIssues(java.util.Set paramValue) {
		this.presentingIssues = paramValue;
	}

	public java.util.Set getMedicationOnReferral() {
		if ( null == medicationOnReferral ) {
			medicationOnReferral = new java.util.HashSet();
		}
		return medicationOnReferral;
	}
	public void setMedicationOnReferral(java.util.Set paramValue) {
		this.medicationOnReferral = paramValue;
	}

	public java.util.Set getAllergies() {
		if ( null == allergies ) {
			allergies = new java.util.HashSet();
		}
		return allergies;
	}
	public void setAllergies(java.util.Set paramValue) {
		this.allergies = paramValue;
	}

	public java.util.Set getComorbidities() {
		if ( null == comorbidities ) {
			comorbidities = new java.util.HashSet();
		}
		return comorbidities;
	}
	public void setComorbidities(java.util.Set paramValue) {
		this.comorbidities = paramValue;
	}

	public Boolean isPresentingIssuesNonIndicated() {
		return presentingIssuesNonIndicated;
	}
	public void setPresentingIssuesNonIndicated(Boolean presentingIssuesNonIndicated) {
		this.presentingIssuesNonIndicated = presentingIssuesNonIndicated;
	}

	public Boolean isMedicationNonIndicated() {
		return medicationNonIndicated;
	}
	public void setMedicationNonIndicated(Boolean medicationNonIndicated) {
		this.medicationNonIndicated = medicationNonIndicated;
	}

	public Boolean isAllergiesIssuesNonIndicated() {
		return allergiesIssuesNonIndicated;
	}
	public void setAllergiesIssuesNonIndicated(Boolean allergiesIssuesNonIndicated) {
		this.allergiesIssuesNonIndicated = allergiesIssuesNonIndicated;
	}

	public Boolean isComorbiditiesIssuesNonIndicated() {
		return comorbiditiesIssuesNonIndicated;
	}
	public void setComorbiditiesIssuesNonIndicated(Boolean comorbiditiesIssuesNonIndicated) {
		this.comorbiditiesIssuesNonIndicated = comorbiditiesIssuesNonIndicated;
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
		
		auditStr.append("\r\n*catsReferral* :");
		if (catsReferral != null)
		{
			auditStr.append(toShortClassName(catsReferral));
				
		    auditStr.append(catsReferral.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringUser* :");
		if (authoringUser != null)
		{
			auditStr.append(toShortClassName(authoringUser));
				
		    auditStr.append(authoringUser.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringDateTime* :");
		auditStr.append(authoringDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*presentingIssues* :");
		if (presentingIssues != null)
		{
			java.util.Iterator it4 = presentingIssues.iterator();
			int i4=0;
			while (it4.hasNext())
			{
				if (i4 > 0)
					auditStr.append(",");
				ims.clinical.domain.objects.PatientComplaint obj = (ims.clinical.domain.objects.PatientComplaint)it4.next();
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
		auditStr.append("\r\n*medicationOnReferral* :");
		if (medicationOnReferral != null)
		{
			java.util.Iterator it5 = medicationOnReferral.iterator();
			int i5=0;
			while (it5.hasNext())
			{
				if (i5 > 0)
					auditStr.append(",");
				ims.core.clinical.domain.objects.PatientMedication obj = (ims.core.clinical.domain.objects.PatientMedication)it5.next();
		if (obj != null)
		{
		   if (i5 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i5++;
		}
		if (i5 > 0)
			auditStr.append("] " + i5);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*allergies* :");
		if (allergies != null)
		{
			java.util.Iterator it6 = allergies.iterator();
			int i6=0;
			while (it6.hasNext())
			{
				if (i6 > 0)
					auditStr.append(",");
				ims.core.clinical.domain.objects.PatientAllergy obj = (ims.core.clinical.domain.objects.PatientAllergy)it6.next();
		if (obj != null)
		{
		   if (i6 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i6++;
		}
		if (i6 > 0)
			auditStr.append("] " + i6);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*comorbidities* :");
		if (comorbidities != null)
		{
			java.util.Iterator it7 = comorbidities.iterator();
			int i7=0;
			while (it7.hasNext())
			{
				if (i7 > 0)
					auditStr.append(",");
				ims.core.clinical.domain.objects.PatientDiagnosis obj = (ims.core.clinical.domain.objects.PatientDiagnosis)it7.next();
		if (obj != null)
		{
		   if (i7 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i7++;
		}
		if (i7 > 0)
			auditStr.append("] " + i7);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*presentingIssuesNonIndicated* :");
		auditStr.append(presentingIssuesNonIndicated);
	    auditStr.append("; ");
		auditStr.append("\r\n*medicationNonIndicated* :");
		auditStr.append(medicationNonIndicated);
	    auditStr.append("; ");
		auditStr.append("\r\n*allergiesIssuesNonIndicated* :");
		auditStr.append(allergiesIssuesNonIndicated);
	    auditStr.append("; ");
		auditStr.append("\r\n*comorbiditiesIssuesNonIndicated* :");
		auditStr.append(comorbiditiesIssuesNonIndicated);
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
		
		String keyClassName = "PresentationReferralSummary";
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
		if (this.getCatsReferral() != null)
		{
			sb.append("<catsReferral>");
			sb.append(this.getCatsReferral().toXMLString(domMap)); 	
			sb.append("</catsReferral>");		
		}
		if (this.getAuthoringUser() != null)
		{
			sb.append("<authoringUser>");
			sb.append(this.getAuthoringUser().toXMLString(domMap)); 	
			sb.append("</authoringUser>");		
		}
		if (this.getAuthoringDateTime() != null)
		{
			sb.append("<authoringDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getAuthoringDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</authoringDateTime>");		
		}
		if (this.getPresentingIssues() != null)
		{
			if (this.getPresentingIssues().size() > 0 )
			{
			sb.append("<presentingIssues>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getPresentingIssues(), domMap));
			sb.append("</presentingIssues>");		
			}
		}
		if (this.getMedicationOnReferral() != null)
		{
			if (this.getMedicationOnReferral().size() > 0 )
			{
			sb.append("<medicationOnReferral>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getMedicationOnReferral(), domMap));
			sb.append("</medicationOnReferral>");		
			}
		}
		if (this.getAllergies() != null)
		{
			if (this.getAllergies().size() > 0 )
			{
			sb.append("<allergies>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getAllergies(), domMap));
			sb.append("</allergies>");		
			}
		}
		if (this.getComorbidities() != null)
		{
			if (this.getComorbidities().size() > 0 )
			{
			sb.append("<comorbidities>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getComorbidities(), domMap));
			sb.append("</comorbidities>");		
			}
		}
		if (this.isPresentingIssuesNonIndicated() != null)
		{
			sb.append("<presentingIssuesNonIndicated>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isPresentingIssuesNonIndicated().toString()));
			sb.append("</presentingIssuesNonIndicated>");		
		}
		if (this.isMedicationNonIndicated() != null)
		{
			sb.append("<medicationNonIndicated>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isMedicationNonIndicated().toString()));
			sb.append("</medicationNonIndicated>");		
		}
		if (this.isAllergiesIssuesNonIndicated() != null)
		{
			sb.append("<allergiesIssuesNonIndicated>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isAllergiesIssuesNonIndicated().toString()));
			sb.append("</allergiesIssuesNonIndicated>");		
		}
		if (this.isComorbiditiesIssuesNonIndicated() != null)
		{
			sb.append("<comorbiditiesIssuesNonIndicated>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isComorbiditiesIssuesNonIndicated().toString()));
			sb.append("</comorbiditiesIssuesNonIndicated>");		
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
			PresentationReferralSummary domainObject = getPresentationReferralSummaryfromXML(itemEl, factory, domMap);

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
			PresentationReferralSummary domainObject = getPresentationReferralSummaryfromXML(itemEl, factory, domMap);

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
		
	public static PresentationReferralSummary getPresentationReferralSummaryfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPresentationReferralSummaryfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PresentationReferralSummary getPresentationReferralSummaryfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PresentationReferralSummary.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PresentationReferralSummary.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PresentationReferralSummary class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PresentationReferralSummary)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PresentationReferralSummary.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PresentationReferralSummary ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PresentationReferralSummary)factory.getImportedDomainObject(PresentationReferralSummary.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PresentationReferralSummary();
		}
		String keyClassName = "PresentationReferralSummary";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PresentationReferralSummary)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PresentationReferralSummary obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("catsReferral");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCatsReferral(ims.RefMan.domain.objects.CatsReferral.getCatsReferralfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("authoringUser");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringUser(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("authoringDateTime");
		if(fldEl != null)
		{	
    		obj.setAuthoringDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("presentingIssues");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setPresentingIssues(ims.clinical.domain.objects.PatientComplaint.fromSetXMLString(fldEl, factory, obj.getPresentingIssues(), domMap));
		}
		fldEl = el.element("medicationOnReferral");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setMedicationOnReferral(ims.core.clinical.domain.objects.PatientMedication.fromSetXMLString(fldEl, factory, obj.getMedicationOnReferral(), domMap));
		}
		fldEl = el.element("allergies");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setAllergies(ims.core.clinical.domain.objects.PatientAllergy.fromSetXMLString(fldEl, factory, obj.getAllergies(), domMap));
		}
		fldEl = el.element("comorbidities");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setComorbidities(ims.core.clinical.domain.objects.PatientDiagnosis.fromSetXMLString(fldEl, factory, obj.getComorbidities(), domMap));
		}
		fldEl = el.element("presentingIssuesNonIndicated");
		if(fldEl != null)
		{	
    		obj.setPresentingIssuesNonIndicated(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("medicationNonIndicated");
		if(fldEl != null)
		{	
    		obj.setMedicationNonIndicated(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("allergiesIssuesNonIndicated");
		if(fldEl != null)
		{	
    		obj.setAllergiesIssuesNonIndicated(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("comorbiditiesIssuesNonIndicated");
		if(fldEl != null)
		{	
    		obj.setComorbiditiesIssuesNonIndicated(new Boolean(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "presentingIssues"
		, "medicationOnReferral"
		, "allergies"
		, "comorbidities"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String CatsReferral = "catsReferral";
		public static final String AuthoringUser = "authoringUser";
		public static final String AuthoringDateTime = "authoringDateTime";
		public static final String PresentingIssues = "presentingIssues";
		public static final String MedicationOnReferral = "medicationOnReferral";
		public static final String Allergies = "allergies";
		public static final String Comorbidities = "comorbidities";
		public static final String PresentingIssuesNonIndicated = "presentingIssuesNonIndicated";
		public static final String MedicationNonIndicated = "medicationNonIndicated";
		public static final String AllergiesIssuesNonIndicated = "allergiesIssuesNonIndicated";
		public static final String ComorbiditiesIssuesNonIndicated = "comorbiditiesIssuesNonIndicated";
	}
}

