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
package ims.core.admin.domain.objects;

/**
 * 
 * @author John MacEnri
 * Generated.
 */


public class Referral extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1004100001;
	private static final long serialVersionUID = 1004100001L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Authoring Care Professional */
	private ims.core.resource.people.domain.objects.Hcp authoringCP;
	/** Authoring Date Time */
	private java.util.Date authoringDateTime;
	/** ReferralType */
	private ims.domain.lookups.LookupInstance referralType;
	/** Can hold on to non-standard information e.g. CCO Foreign Casesheet No. */
	private String details;
	/** ClinicalContact */
	private ims.core.admin.domain.objects.ClinicalContact clinicalContact;
	/** CareContext */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** External Referal Key RKEY */
	private String extReferralKey;
	private ims.core.patient.domain.objects.Patient patient;
	/** Date the referral was received */
	private java.util.Date referralReceivedDate;
	/** Original Referral Date */
	private java.util.Date originalReferralDate;
	/** Active flag */
	private Boolean isActive;
	/** Date of the First Appt associated with this referral */
	private java.util.Date firstApptDate;
	private ims.domain.lookups.LookupInstance sourceOfReferral;
	/** If referrer is a GP, this will be set */
	private ims.core.resource.people.domain.objects.Gp referringGP;
	/** If referrer is a Clinician, this will be set */
	private ims.core.resource.people.domain.objects.Hcp referringClinician;
	/** Priority of this referral */
	private ims.domain.lookups.LookupInstance referralPriority;
	/** Hcp Responsible for this Referral */
	private ims.core.resource.people.domain.objects.Hcp referredTo;
	private ims.domain.lookups.LookupInstance specialty;
	/** Freetext to display extra referral information */
	private String referralDetails;
	/** Date of Referral */
	private java.util.Date dateOfReferral;
	/** Name of the location from where the referral took place */
	private String referralLocation;
	/** If this referral is linked to a pathway, the clock id */
	private String clockId;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public Referral (Integer id, int ver)
    {
    	super(id, ver);
    }
    public Referral ()
    {
    	super();
    }
    public Referral (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.admin.domain.objects.Referral.class;
	}


	public ims.core.resource.people.domain.objects.Hcp getAuthoringCP() {
		return authoringCP;
	}
	public void setAuthoringCP(ims.core.resource.people.domain.objects.Hcp authoringCP) {
		this.authoringCP = authoringCP;
	}

	public java.util.Date getAuthoringDateTime() {
		return authoringDateTime;
	}
	public void setAuthoringDateTime(java.util.Date authoringDateTime) {
		this.authoringDateTime = authoringDateTime;
	}

	public ims.domain.lookups.LookupInstance getReferralType() {
		return referralType;
	}
	public void setReferralType(ims.domain.lookups.LookupInstance referralType) {
		this.referralType = referralType;
	}

	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		if ( null != details && details.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for details. Tried to set value: "+
				details);
		}
		this.details = details;
	}

	public ims.core.admin.domain.objects.ClinicalContact getClinicalContact() {
		return clinicalContact;
	}
	public void setClinicalContact(ims.core.admin.domain.objects.ClinicalContact clinicalContact) {
		this.clinicalContact = clinicalContact;
	}

	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public String getExtReferralKey() {
		return extReferralKey;
	}
	public void setExtReferralKey(String extReferralKey) {
		if ( null != extReferralKey && extReferralKey.length() > 50 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for extReferralKey. Tried to set value: "+
				extReferralKey);
		}
		this.extReferralKey = extReferralKey;
	}

	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public static java.util.List listReferralByPatient(ims.domain.ILightweightDomainFactory factory, ims.core.patient.domain.objects.Patient val)
	{
		String hql = "from Referral c where c.patient = :patient";		
		return factory.find(hql, new String[]{"patient"}, new Object[]{val});		
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public java.util.Date getReferralReceivedDate() {
		return referralReceivedDate;
	}
	public void setReferralReceivedDate(java.util.Date referralReceivedDate) {
		this.referralReceivedDate = referralReceivedDate;
	}

	public java.util.Date getOriginalReferralDate() {
		return originalReferralDate;
	}
	public void setOriginalReferralDate(java.util.Date originalReferralDate) {
		this.originalReferralDate = originalReferralDate;
	}

	public Boolean isIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public java.util.Date getFirstApptDate() {
		return firstApptDate;
	}
	public void setFirstApptDate(java.util.Date firstApptDate) {
		this.firstApptDate = firstApptDate;
	}

	public ims.domain.lookups.LookupInstance getSourceOfReferral() {
		return sourceOfReferral;
	}
	public void setSourceOfReferral(ims.domain.lookups.LookupInstance sourceOfReferral) {
		this.sourceOfReferral = sourceOfReferral;
	}

	public ims.core.resource.people.domain.objects.Gp getReferringGP() {
		return referringGP;
	}
	public void setReferringGP(ims.core.resource.people.domain.objects.Gp referringGP) {
		this.referringGP = referringGP;
	}

	public ims.core.resource.people.domain.objects.Hcp getReferringClinician() {
		return referringClinician;
	}
	public void setReferringClinician(ims.core.resource.people.domain.objects.Hcp referringClinician) {
		this.referringClinician = referringClinician;
	}

	public ims.domain.lookups.LookupInstance getReferralPriority() {
		return referralPriority;
	}
	public void setReferralPriority(ims.domain.lookups.LookupInstance referralPriority) {
		this.referralPriority = referralPriority;
	}

	public ims.core.resource.people.domain.objects.Hcp getReferredTo() {
		return referredTo;
	}
	public void setReferredTo(ims.core.resource.people.domain.objects.Hcp referredTo) {
		this.referredTo = referredTo;
	}

	public ims.domain.lookups.LookupInstance getSpecialty() {
		return specialty;
	}
	public void setSpecialty(ims.domain.lookups.LookupInstance specialty) {
		this.specialty = specialty;
	}

	public String getReferralDetails() {
		return referralDetails;
	}
	public void setReferralDetails(String referralDetails) {
		if ( null != referralDetails && referralDetails.length() > 250 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for referralDetails. Tried to set value: "+
				referralDetails);
		}
		this.referralDetails = referralDetails;
	}

	public java.util.Date getDateOfReferral() {
		return dateOfReferral;
	}
	public void setDateOfReferral(java.util.Date dateOfReferral) {
		this.dateOfReferral = dateOfReferral;
	}

	public String getReferralLocation() {
		return referralLocation;
	}
	public void setReferralLocation(String referralLocation) {
		if ( null != referralLocation && referralLocation.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for referralLocation. Tried to set value: "+
				referralLocation);
		}
		this.referralLocation = referralLocation;
	}

	public String getClockId() {
		return clockId;
	}
	public void setClockId(String clockId) {
		if ( null != clockId && clockId.length() > 25 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for clockId. Tried to set value: "+
				clockId);
		}
		this.clockId = clockId;
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
		
		auditStr.append("\r\n*authoringCP* :");
		if (authoringCP != null)
		{
			auditStr.append(toShortClassName(authoringCP));
				
		    auditStr.append(authoringCP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringDateTime* :");
		auditStr.append(authoringDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*referralType* :");
		if (referralType != null)
			auditStr.append(referralType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*details* :");
		auditStr.append(details);
	    auditStr.append("; ");
		auditStr.append("\r\n*clinicalContact* :");
		if (clinicalContact != null)
		{
			auditStr.append(toShortClassName(clinicalContact));
				
		    auditStr.append(clinicalContact.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*extReferralKey* :");
		auditStr.append(extReferralKey);
	    auditStr.append("; ");
		auditStr.append("\r\n*patient* :");
		if (patient != null)
		{
			auditStr.append(toShortClassName(patient));
				
		    auditStr.append(patient.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*referralReceivedDate* :");
		auditStr.append(referralReceivedDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*originalReferralDate* :");
		auditStr.append(originalReferralDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*isActive* :");
		auditStr.append(isActive);
	    auditStr.append("; ");
		auditStr.append("\r\n*firstApptDate* :");
		auditStr.append(firstApptDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*sourceOfReferral* :");
		if (sourceOfReferral != null)
			auditStr.append(sourceOfReferral.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*referringGP* :");
		if (referringGP != null)
		{
			auditStr.append(toShortClassName(referringGP));
				
		    auditStr.append(referringGP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*referringClinician* :");
		if (referringClinician != null)
		{
			auditStr.append(toShortClassName(referringClinician));
				
		    auditStr.append(referringClinician.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*referralPriority* :");
		if (referralPriority != null)
			auditStr.append(referralPriority.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*referredTo* :");
		if (referredTo != null)
		{
			auditStr.append(toShortClassName(referredTo));
				
		    auditStr.append(referredTo.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*specialty* :");
		if (specialty != null)
			auditStr.append(specialty.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*referralDetails* :");
		auditStr.append(referralDetails);
	    auditStr.append("; ");
		auditStr.append("\r\n*dateOfReferral* :");
		auditStr.append(dateOfReferral);
	    auditStr.append("; ");
		auditStr.append("\r\n*referralLocation* :");
		auditStr.append(referralLocation);
	    auditStr.append("; ");
		auditStr.append("\r\n*clockId* :");
		auditStr.append(clockId);
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
		
		String keyClassName = "Referral";
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
		if (this.getAuthoringCP() != null)
		{
			sb.append("<authoringCP>");
			sb.append(this.getAuthoringCP().toXMLString(domMap)); 	
			sb.append("</authoringCP>");		
		}
		if (this.getAuthoringDateTime() != null)
		{
			sb.append("<authoringDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getAuthoringDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</authoringDateTime>");		
		}
		if (this.getReferralType() != null)
		{
			sb.append("<referralType>");
			sb.append(this.getReferralType().toXMLString()); 
			sb.append("</referralType>");		
		}
		if (this.getDetails() != null)
		{
			sb.append("<details>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDetails().toString()));
			sb.append("</details>");		
		}
		if (this.getClinicalContact() != null)
		{
			sb.append("<clinicalContact>");
			sb.append(this.getClinicalContact().toXMLString(domMap)); 	
			sb.append("</clinicalContact>");		
		}
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
		}
		if (this.getExtReferralKey() != null)
		{
			sb.append("<extReferralKey>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getExtReferralKey().toString()));
			sb.append("</extReferralKey>");		
		}
		if (this.getPatient() != null)
		{
			sb.append("<patient>");
			sb.append(this.getPatient().toXMLString(domMap)); 	
			sb.append("</patient>");		
		}
		if (this.getReferralReceivedDate() != null)
		{
			sb.append("<referralReceivedDate>");
			sb.append(new ims.framework.utils.DateTime(this.getReferralReceivedDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</referralReceivedDate>");		
		}
		if (this.getOriginalReferralDate() != null)
		{
			sb.append("<originalReferralDate>");
			sb.append(new ims.framework.utils.DateTime(this.getOriginalReferralDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</originalReferralDate>");		
		}
		if (this.isIsActive() != null)
		{
			sb.append("<isActive>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsActive().toString()));
			sb.append("</isActive>");		
		}
		if (this.getFirstApptDate() != null)
		{
			sb.append("<firstApptDate>");
			sb.append(new ims.framework.utils.DateTime(this.getFirstApptDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</firstApptDate>");		
		}
		if (this.getSourceOfReferral() != null)
		{
			sb.append("<sourceOfReferral>");
			sb.append(this.getSourceOfReferral().toXMLString()); 
			sb.append("</sourceOfReferral>");		
		}
		if (this.getReferringGP() != null)
		{
			sb.append("<referringGP>");
			sb.append(this.getReferringGP().toXMLString(domMap)); 	
			sb.append("</referringGP>");		
		}
		if (this.getReferringClinician() != null)
		{
			sb.append("<referringClinician>");
			sb.append(this.getReferringClinician().toXMLString(domMap)); 	
			sb.append("</referringClinician>");		
		}
		if (this.getReferralPriority() != null)
		{
			sb.append("<referralPriority>");
			sb.append(this.getReferralPriority().toXMLString()); 
			sb.append("</referralPriority>");		
		}
		if (this.getReferredTo() != null)
		{
			sb.append("<referredTo>");
			sb.append(this.getReferredTo().toXMLString(domMap)); 	
			sb.append("</referredTo>");		
		}
		if (this.getSpecialty() != null)
		{
			sb.append("<specialty>");
			sb.append(this.getSpecialty().toXMLString()); 
			sb.append("</specialty>");		
		}
		if (this.getReferralDetails() != null)
		{
			sb.append("<referralDetails>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReferralDetails().toString()));
			sb.append("</referralDetails>");		
		}
		if (this.getDateOfReferral() != null)
		{
			sb.append("<dateOfReferral>");
			sb.append(new ims.framework.utils.DateTime(this.getDateOfReferral()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateOfReferral>");		
		}
		if (this.getReferralLocation() != null)
		{
			sb.append("<referralLocation>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReferralLocation().toString()));
			sb.append("</referralLocation>");		
		}
		if (this.getClockId() != null)
		{
			sb.append("<clockId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getClockId().toString()));
			sb.append("</clockId>");		
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
			Referral domainObject = getReferralfromXML(itemEl, factory, domMap);

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
			Referral domainObject = getReferralfromXML(itemEl, factory, domMap);

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
		
	public static Referral getReferralfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getReferralfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static Referral getReferralfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!Referral.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!Referral.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the Referral class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (Referral)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(Referral.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		Referral ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (Referral)factory.getImportedDomainObject(Referral.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new Referral();
		}
		String keyClassName = "Referral";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (Referral)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, Referral obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("authoringCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringCP(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("authoringDateTime");
		if(fldEl != null)
		{	
    		obj.setAuthoringDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("referralType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReferralType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("details");
		if(fldEl != null)
		{	
    		obj.setDetails(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("clinicalContact");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setClinicalContact(ims.core.admin.domain.objects.ClinicalContact.getClinicalContactfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("extReferralKey");
		if(fldEl != null)
		{	
    		obj.setExtReferralKey(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("referralReceivedDate");
		if(fldEl != null)
		{	
    		obj.setReferralReceivedDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("originalReferralDate");
		if(fldEl != null)
		{	
    		obj.setOriginalReferralDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("isActive");
		if(fldEl != null)
		{	
    		obj.setIsActive(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("firstApptDate");
		if(fldEl != null)
		{	
    		obj.setFirstApptDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("sourceOfReferral");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSourceOfReferral(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("referringGP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setReferringGP(ims.core.resource.people.domain.objects.Gp.getGpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("referringClinician");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setReferringClinician(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("referralPriority");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReferralPriority(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("referredTo");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setReferredTo(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("specialty");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSpecialty(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("referralDetails");
		if(fldEl != null)
		{	
    		obj.setReferralDetails(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dateOfReferral");
		if(fldEl != null)
		{	
    		obj.setDateOfReferral(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("referralLocation");
		if(fldEl != null)
		{	
    		obj.setReferralLocation(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("clockId");
		if(fldEl != null)
		{	
    		obj.setClockId(new String(fldEl.getTextTrim()));	
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
		public static final String AuthoringCP = "authoringCP";
		public static final String AuthoringDateTime = "authoringDateTime";
		public static final String ReferralType = "referralType";
		public static final String Details = "details";
		public static final String ClinicalContact = "clinicalContact";
		public static final String CareContext = "careContext";
		public static final String ExtReferralKey = "extReferralKey";
		public static final String Patient = "patient";
		public static final String ReferralReceivedDate = "referralReceivedDate";
		public static final String OriginalReferralDate = "originalReferralDate";
		public static final String IsActive = "isActive";
		public static final String FirstApptDate = "firstApptDate";
		public static final String SourceOfReferral = "sourceOfReferral";
		public static final String ReferringGP = "referringGP";
		public static final String ReferringClinician = "referringClinician";
		public static final String ReferralPriority = "referralPriority";
		public static final String ReferredTo = "referredTo";
		public static final String Specialty = "specialty";
		public static final String ReferralDetails = "referralDetails";
		public static final String DateOfReferral = "dateOfReferral";
		public static final String ReferralLocation = "referralLocation";
		public static final String ClockId = "clockId";
	}
}

