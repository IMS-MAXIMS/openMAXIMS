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
package ims.therapies.domain.objects;

/**
 * 
 * @author Cristian Belciug
 * Generated.
 */


public class Contact extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1030100009;
	private static final long serialVersionUID = 1030100009L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** CareContext */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** HCP */
	private ims.core.resource.people.domain.objects.Hcp contactHCP;
	/** HCPDiscipline */
	private ims.domain.lookups.LookupInstance hCPDiscipline;
	/** ContactDateTime */
	private java.util.Date contactDateTime;
	/** Episode of Care */
	private ims.core.admin.domain.objects.EpisodeOfCare episodeOfCare;
	private ims.core.clinical.domain.objects.AuthoringInformation recordingInfo;
	private ims.domain.lookups.LookupInstance contactType;
	private ims.domain.lookups.LookupInstance referringProblem;
	private ims.domain.lookups.LookupInstance consentReason;
	private Boolean isFirstContact;
	/** 
	  * Collection of ims.oncology.domain.objects.ContactTypesByDisciplineItem.
	  */
	private java.util.List activities;
	private Boolean patientConsentToTreatment;
	private Integer timeRequired;
	private Integer timeSpent;
	private Integer numOfAdditionalHCPs;
	/** ResponsibleHCP */
	private ims.core.resource.people.domain.objects.Hcp responsibleHCP;
	private Boolean noActivityUndertaken;
	/** 
	  * Collection of ims.therapies.domain.objects.AdditionalHCP.
	  */
	private java.util.List additionalHCPs;
	private ims.domain.lookups.LookupInstance caseload;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public Contact (Integer id, int ver)
    {
    	super(id, ver);
    }
    public Contact ()
    {
    	super();
    }
    public Contact (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.therapies.domain.objects.Contact.class;
	}


	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public ims.core.resource.people.domain.objects.Hcp getContactHCP() {
		return contactHCP;
	}
	public void setContactHCP(ims.core.resource.people.domain.objects.Hcp contactHCP) {
		this.contactHCP = contactHCP;
	}

	public ims.domain.lookups.LookupInstance getHCPDiscipline() {
		return hCPDiscipline;
	}
	public void setHCPDiscipline(ims.domain.lookups.LookupInstance hCPDiscipline) {
		this.hCPDiscipline = hCPDiscipline;
	}

	public java.util.Date getContactDateTime() {
		return contactDateTime;
	}
	public void setContactDateTime(java.util.Date contactDateTime) {
		this.contactDateTime = contactDateTime;
	}

	public ims.core.admin.domain.objects.EpisodeOfCare getEpisodeOfCare() {
		return episodeOfCare;
	}
	public void setEpisodeOfCare(ims.core.admin.domain.objects.EpisodeOfCare episodeOfCare) {
		this.episodeOfCare = episodeOfCare;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getRecordingInfo() {
		return recordingInfo;
	}
	public void setRecordingInfo(ims.core.clinical.domain.objects.AuthoringInformation recordingInfo) {
		this.recordingInfo = recordingInfo;
	}

	public ims.domain.lookups.LookupInstance getContactType() {
		return contactType;
	}
	public void setContactType(ims.domain.lookups.LookupInstance contactType) {
		this.contactType = contactType;
	}

	public ims.domain.lookups.LookupInstance getReferringProblem() {
		return referringProblem;
	}
	public void setReferringProblem(ims.domain.lookups.LookupInstance referringProblem) {
		this.referringProblem = referringProblem;
	}

	public ims.domain.lookups.LookupInstance getConsentReason() {
		return consentReason;
	}
	public void setConsentReason(ims.domain.lookups.LookupInstance consentReason) {
		this.consentReason = consentReason;
	}

	public Boolean isIsFirstContact() {
		return isFirstContact;
	}
	public void setIsFirstContact(Boolean isFirstContact) {
		this.isFirstContact = isFirstContact;
	}

	public java.util.List getActivities() {
		if ( null == activities ) {
			activities = new java.util.ArrayList();
		}
		return activities;
	}
	public void setActivities(java.util.List paramValue) {
		this.activities = paramValue;
	}

	public Boolean isPatientConsentToTreatment() {
		return patientConsentToTreatment;
	}
	public void setPatientConsentToTreatment(Boolean patientConsentToTreatment) {
		this.patientConsentToTreatment = patientConsentToTreatment;
	}

	public Integer getTimeRequired() {
		return timeRequired;
	}
	public void setTimeRequired(Integer timeRequired) {
		this.timeRequired = timeRequired;
	}

	public Integer getTimeSpent() {
		return timeSpent;
	}
	public void setTimeSpent(Integer timeSpent) {
		this.timeSpent = timeSpent;
	}

	public Integer getNumOfAdditionalHCPs() {
		return numOfAdditionalHCPs;
	}
	public void setNumOfAdditionalHCPs(Integer numOfAdditionalHCPs) {
		this.numOfAdditionalHCPs = numOfAdditionalHCPs;
	}

	public ims.core.resource.people.domain.objects.Hcp getResponsibleHCP() {
		return responsibleHCP;
	}
	public void setResponsibleHCP(ims.core.resource.people.domain.objects.Hcp responsibleHCP) {
		this.responsibleHCP = responsibleHCP;
	}

	public Boolean isNoActivityUndertaken() {
		return noActivityUndertaken;
	}
	public void setNoActivityUndertaken(Boolean noActivityUndertaken) {
		this.noActivityUndertaken = noActivityUndertaken;
	}

	public java.util.List getAdditionalHCPs() {
		if ( null == additionalHCPs ) {
			additionalHCPs = new java.util.ArrayList();
		}
		return additionalHCPs;
	}
	public void setAdditionalHCPs(java.util.List paramValue) {
		this.additionalHCPs = paramValue;
	}

	public ims.domain.lookups.LookupInstance getCaseload() {
		return caseload;
	}
	public void setCaseload(ims.domain.lookups.LookupInstance caseload) {
		this.caseload = caseload;
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
		auditStr.append("\r\n*contactHCP* :");
		if (contactHCP != null)
		{
			auditStr.append(toShortClassName(contactHCP));
				
		    auditStr.append(contactHCP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*hCPDiscipline* :");
		if (hCPDiscipline != null)
			auditStr.append(hCPDiscipline.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*contactDateTime* :");
		auditStr.append(contactDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*episodeOfCare* :");
		if (episodeOfCare != null)
		{
			auditStr.append(toShortClassName(episodeOfCare));
				
		    auditStr.append(episodeOfCare.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*recordingInfo* :");
		if (recordingInfo != null)
		{
			auditStr.append(toShortClassName(recordingInfo));
				
		    auditStr.append(recordingInfo.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*contactType* :");
		if (contactType != null)
			auditStr.append(contactType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*referringProblem* :");
		if (referringProblem != null)
			auditStr.append(referringProblem.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*consentReason* :");
		if (consentReason != null)
			auditStr.append(consentReason.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*isFirstContact* :");
		auditStr.append(isFirstContact);
	    auditStr.append("; ");
		auditStr.append("\r\n*activities* :");
		if (activities != null)
		{
		int i11=0;
		for (i11=0; i11<activities.size(); i11++)
		{
			if (i11 > 0)
				auditStr.append(",");
			ims.oncology.domain.objects.ContactTypesByDisciplineItem obj = (ims.oncology.domain.objects.ContactTypesByDisciplineItem)activities.get(i11);
		    if (obj != null)
			{
				if (i11 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i11 > 0)
			auditStr.append("] " + i11);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*patientConsentToTreatment* :");
		auditStr.append(patientConsentToTreatment);
	    auditStr.append("; ");
		auditStr.append("\r\n*timeRequired* :");
		auditStr.append(timeRequired);
	    auditStr.append("; ");
		auditStr.append("\r\n*timeSpent* :");
		auditStr.append(timeSpent);
	    auditStr.append("; ");
		auditStr.append("\r\n*numOfAdditionalHCPs* :");
		auditStr.append(numOfAdditionalHCPs);
	    auditStr.append("; ");
		auditStr.append("\r\n*responsibleHCP* :");
		if (responsibleHCP != null)
		{
			auditStr.append(toShortClassName(responsibleHCP));
				
		    auditStr.append(responsibleHCP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*noActivityUndertaken* :");
		auditStr.append(noActivityUndertaken);
	    auditStr.append("; ");
		auditStr.append("\r\n*additionalHCPs* :");
		if (additionalHCPs != null)
		{
		int i18=0;
		for (i18=0; i18<additionalHCPs.size(); i18++)
		{
			if (i18 > 0)
				auditStr.append(",");
			ims.therapies.domain.objects.AdditionalHCP obj = (ims.therapies.domain.objects.AdditionalHCP)additionalHCPs.get(i18);
		    if (obj != null)
			{
				if (i18 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i18 > 0)
			auditStr.append("] " + i18);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*caseload* :");
		if (caseload != null)
			auditStr.append(caseload.getText());
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
		
		String keyClassName = "Contact";
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
		if (this.getContactHCP() != null)
		{
			sb.append("<contactHCP>");
			sb.append(this.getContactHCP().toXMLString(domMap)); 	
			sb.append("</contactHCP>");		
		}
		if (this.getHCPDiscipline() != null)
		{
			sb.append("<hCPDiscipline>");
			sb.append(this.getHCPDiscipline().toXMLString()); 
			sb.append("</hCPDiscipline>");		
		}
		if (this.getContactDateTime() != null)
		{
			sb.append("<contactDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getContactDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</contactDateTime>");		
		}
		if (this.getEpisodeOfCare() != null)
		{
			sb.append("<episodeOfCare>");
			sb.append(this.getEpisodeOfCare().toXMLString(domMap)); 	
			sb.append("</episodeOfCare>");		
		}
		if (this.getRecordingInfo() != null)
		{
			sb.append("<recordingInfo>");
			sb.append(this.getRecordingInfo().toXMLString(domMap)); 	
			sb.append("</recordingInfo>");		
		}
		if (this.getContactType() != null)
		{
			sb.append("<contactType>");
			sb.append(this.getContactType().toXMLString()); 
			sb.append("</contactType>");		
		}
		if (this.getReferringProblem() != null)
		{
			sb.append("<referringProblem>");
			sb.append(this.getReferringProblem().toXMLString()); 
			sb.append("</referringProblem>");		
		}
		if (this.getConsentReason() != null)
		{
			sb.append("<consentReason>");
			sb.append(this.getConsentReason().toXMLString()); 
			sb.append("</consentReason>");		
		}
		if (this.isIsFirstContact() != null)
		{
			sb.append("<isFirstContact>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsFirstContact().toString()));
			sb.append("</isFirstContact>");		
		}
		if (this.getActivities() != null)
		{
			if (this.getActivities().size() > 0 )
			{
			sb.append("<activities>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getActivities(), domMap));
			sb.append("</activities>");		
			}
		}
		if (this.isPatientConsentToTreatment() != null)
		{
			sb.append("<patientConsentToTreatment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isPatientConsentToTreatment().toString()));
			sb.append("</patientConsentToTreatment>");		
		}
		if (this.getTimeRequired() != null)
		{
			sb.append("<timeRequired>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTimeRequired().toString()));
			sb.append("</timeRequired>");		
		}
		if (this.getTimeSpent() != null)
		{
			sb.append("<timeSpent>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTimeSpent().toString()));
			sb.append("</timeSpent>");		
		}
		if (this.getNumOfAdditionalHCPs() != null)
		{
			sb.append("<numOfAdditionalHCPs>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNumOfAdditionalHCPs().toString()));
			sb.append("</numOfAdditionalHCPs>");		
		}
		if (this.getResponsibleHCP() != null)
		{
			sb.append("<responsibleHCP>");
			sb.append(this.getResponsibleHCP().toXMLString(domMap)); 	
			sb.append("</responsibleHCP>");		
		}
		if (this.isNoActivityUndertaken() != null)
		{
			sb.append("<noActivityUndertaken>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isNoActivityUndertaken().toString()));
			sb.append("</noActivityUndertaken>");		
		}
		if (this.getAdditionalHCPs() != null)
		{
			if (this.getAdditionalHCPs().size() > 0 )
			{
			sb.append("<additionalHCPs>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getAdditionalHCPs(), domMap));
			sb.append("</additionalHCPs>");		
			}
		}
		if (this.getCaseload() != null)
		{
			sb.append("<caseload>");
			sb.append(this.getCaseload().toXMLString()); 
			sb.append("</caseload>");		
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
			Contact domainObject = getContactfromXML(itemEl, factory, domMap);

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
			Contact domainObject = getContactfromXML(itemEl, factory, domMap);

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
		
	public static Contact getContactfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getContactfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static Contact getContactfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!Contact.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!Contact.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the Contact class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (Contact)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(Contact.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		Contact ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (Contact)factory.getImportedDomainObject(Contact.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new Contact();
		}
		String keyClassName = "Contact";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (Contact)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, Contact obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("contactHCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setContactHCP(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("hCPDiscipline");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setHCPDiscipline(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("contactDateTime");
		if(fldEl != null)
		{	
    		obj.setContactDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("episodeOfCare");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setEpisodeOfCare(ims.core.admin.domain.objects.EpisodeOfCare.getEpisodeOfCarefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("recordingInfo");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRecordingInfo(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("contactType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setContactType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("referringProblem");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReferringProblem(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("consentReason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setConsentReason(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("isFirstContact");
		if(fldEl != null)
		{	
    		obj.setIsFirstContact(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("activities");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setActivities(ims.oncology.domain.objects.ContactTypesByDisciplineItem.fromListXMLString(fldEl, factory, obj.getActivities(), domMap));
		}
		fldEl = el.element("patientConsentToTreatment");
		if(fldEl != null)
		{	
    		obj.setPatientConsentToTreatment(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("timeRequired");
		if(fldEl != null)
		{	
    		obj.setTimeRequired(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("timeSpent");
		if(fldEl != null)
		{	
    		obj.setTimeSpent(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("numOfAdditionalHCPs");
		if(fldEl != null)
		{	
    		obj.setNumOfAdditionalHCPs(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("responsibleHCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setResponsibleHCP(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("noActivityUndertaken");
		if(fldEl != null)
		{	
    		obj.setNoActivityUndertaken(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("additionalHCPs");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setAdditionalHCPs(ims.therapies.domain.objects.AdditionalHCP.fromListXMLString(fldEl, factory, obj.getAdditionalHCPs(), domMap));
		}
		fldEl = el.element("caseload");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCaseload(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "activities"
		, "additionalHCPs"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String CareContext = "careContext";
		public static final String ContactHCP = "contactHCP";
		public static final String HCPDiscipline = "hCPDiscipline";
		public static final String ContactDateTime = "contactDateTime";
		public static final String EpisodeOfCare = "episodeOfCare";
		public static final String RecordingInfo = "recordingInfo";
		public static final String ContactType = "contactType";
		public static final String ReferringProblem = "referringProblem";
		public static final String ConsentReason = "consentReason";
		public static final String IsFirstContact = "isFirstContact";
		public static final String Activities = "activities";
		public static final String PatientConsentToTreatment = "patientConsentToTreatment";
		public static final String TimeRequired = "timeRequired";
		public static final String TimeSpent = "timeSpent";
		public static final String NumOfAdditionalHCPs = "numOfAdditionalHCPs";
		public static final String ResponsibleHCP = "responsibleHCP";
		public static final String NoActivityUndertaken = "noActivityUndertaken";
		public static final String AdditionalHCPs = "additionalHCPs";
		public static final String Caseload = "caseload";
	}
}

