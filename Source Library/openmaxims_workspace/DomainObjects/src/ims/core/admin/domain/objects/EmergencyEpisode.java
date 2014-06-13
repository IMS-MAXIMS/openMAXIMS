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
 * Emergency Episode Details
 * @author Neil McAnaspie
 * Generated.
 */


public class EmergencyEpisode extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1004100024;
	private static final long serialVersionUID = 1004100024L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** InjuryDateTime */
	private java.util.Date injuryDateTime;
	/** Source Of Referral */
	private ims.domain.lookups.LookupInstance sourceOfReferral;
	/** Incident Location */
	private ims.domain.lookups.LookupInstance incidentLocation;
	/** LocationDetails */
	private String locationDetails;
	/** Elapsed Time Since Injury */
	private Integer elapsedTime;
	/** Elapsed Period Since Injury */
	private ims.domain.lookups.LookupInstance elapsedPeriod;
	/** Patient Category */
	private ims.domain.lookups.LookupInstance category;
	/** Patient Mobility */
	private ims.domain.lookups.LookupInstance mobility;
	/** ReferringGP */
	private ims.core.resource.people.domain.objects.Gp referringGP;
	/** Presenting Complaint */
	private ims.domain.lookups.LookupInstance presentingComplaint;
	/** School */
	private ims.domain.lookups.LookupInstance school;
	/** Occupation */
	private ims.domain.lookups.LookupInstance occupation;
	/** Occupation Status */
	private ims.domain.lookups.LookupInstance occupationStatus;
	/** Place of Emplyoment Type */
	private String placeofEmployment;
	/** Episode Of Care */
	private ims.core.admin.domain.objects.EpisodeOfCare episodeOfCare;
	/** EmergencyAttendances
	  * Collection of ims.core.admin.domain.objects.EmergencyAttendance.
	  */
	private java.util.Set emergencyAttendances;
	/** Triage Category Type */
	private ims.domain.lookups.LookupInstance triageCategoryType;
	/** Special Interest Details
	  * Collection of ims.core.clinical.domain.objects.SpecialInterestDetail.
	  */
	private java.util.List specialInterestDetails;
	/** RTA Details */
	private ims.core.admin.domain.objects.RTA rTADetails;
	/** TIIG */
	private ims.core.admin.domain.objects.TIIG tiig;
	/** Patient */
	private ims.core.patient.domain.objects.Patient patient;
	/** Other Referral Source */
	private String otherReferral;
	/** MedPatientConsent */
	private Boolean medPatientConsent;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public EmergencyEpisode (Integer id, int ver)
    {
    	super(id, ver);
    }
    public EmergencyEpisode ()
    {
    	super();
    }
    public EmergencyEpisode (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.admin.domain.objects.EmergencyEpisode.class;
	}


	public java.util.Date getInjuryDateTime() {
		return injuryDateTime;
	}
	public void setInjuryDateTime(java.util.Date injuryDateTime) {
		this.injuryDateTime = injuryDateTime;
	}

	public ims.domain.lookups.LookupInstance getSourceOfReferral() {
		return sourceOfReferral;
	}
	public void setSourceOfReferral(ims.domain.lookups.LookupInstance sourceOfReferral) {
		this.sourceOfReferral = sourceOfReferral;
	}

	public ims.domain.lookups.LookupInstance getIncidentLocation() {
		return incidentLocation;
	}
	public void setIncidentLocation(ims.domain.lookups.LookupInstance incidentLocation) {
		this.incidentLocation = incidentLocation;
	}

	public String getLocationDetails() {
		return locationDetails;
	}
	public void setLocationDetails(String locationDetails) {
		if ( null != locationDetails && locationDetails.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for locationDetails. Tried to set value: "+
				locationDetails);
		}
		this.locationDetails = locationDetails;
	}

	public Integer getElapsedTime() {
		return elapsedTime;
	}
	public void setElapsedTime(Integer elapsedTime) {
		this.elapsedTime = elapsedTime;
	}

	public ims.domain.lookups.LookupInstance getElapsedPeriod() {
		return elapsedPeriod;
	}
	public void setElapsedPeriod(ims.domain.lookups.LookupInstance elapsedPeriod) {
		this.elapsedPeriod = elapsedPeriod;
	}

	public ims.domain.lookups.LookupInstance getCategory() {
		return category;
	}
	public void setCategory(ims.domain.lookups.LookupInstance category) {
		this.category = category;
	}

	public ims.domain.lookups.LookupInstance getMobility() {
		return mobility;
	}
	public void setMobility(ims.domain.lookups.LookupInstance mobility) {
		this.mobility = mobility;
	}

	public ims.core.resource.people.domain.objects.Gp getReferringGP() {
		return referringGP;
	}
	public void setReferringGP(ims.core.resource.people.domain.objects.Gp referringGP) {
		this.referringGP = referringGP;
	}

	public ims.domain.lookups.LookupInstance getPresentingComplaint() {
		return presentingComplaint;
	}
	public void setPresentingComplaint(ims.domain.lookups.LookupInstance presentingComplaint) {
		this.presentingComplaint = presentingComplaint;
	}

	public ims.domain.lookups.LookupInstance getSchool() {
		return school;
	}
	public void setSchool(ims.domain.lookups.LookupInstance school) {
		this.school = school;
	}

	public ims.domain.lookups.LookupInstance getOccupation() {
		return occupation;
	}
	public void setOccupation(ims.domain.lookups.LookupInstance occupation) {
		this.occupation = occupation;
	}

	public ims.domain.lookups.LookupInstance getOccupationStatus() {
		return occupationStatus;
	}
	public void setOccupationStatus(ims.domain.lookups.LookupInstance occupationStatus) {
		this.occupationStatus = occupationStatus;
	}

	public String getPlaceofEmployment() {
		return placeofEmployment;
	}
	public void setPlaceofEmployment(String placeofEmployment) {
		if ( null != placeofEmployment && placeofEmployment.length() > 150 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for placeofEmployment. Tried to set value: "+
				placeofEmployment);
		}
		this.placeofEmployment = placeofEmployment;
	}

	public ims.core.admin.domain.objects.EpisodeOfCare getEpisodeOfCare() {
		return episodeOfCare;
	}
	public void setEpisodeOfCare(ims.core.admin.domain.objects.EpisodeOfCare episodeOfCare) {
		this.episodeOfCare = episodeOfCare;
	}

	public java.util.Set getEmergencyAttendances() {
		if ( null == emergencyAttendances ) {
			emergencyAttendances = new java.util.HashSet();
		}
		return emergencyAttendances;
	}
	public void setEmergencyAttendances(java.util.Set paramValue) {
		this.emergencyAttendances = paramValue;
	}

	public ims.domain.lookups.LookupInstance getTriageCategoryType() {
		return triageCategoryType;
	}
	public void setTriageCategoryType(ims.domain.lookups.LookupInstance triageCategoryType) {
		this.triageCategoryType = triageCategoryType;
	}

	public java.util.List getSpecialInterestDetails() {
		if ( null == specialInterestDetails ) {
			specialInterestDetails = new java.util.ArrayList();
		}
		return specialInterestDetails;
	}
	public void setSpecialInterestDetails(java.util.List paramValue) {
		this.specialInterestDetails = paramValue;
	}

	public ims.core.admin.domain.objects.RTA getRTADetails() {
		return rTADetails;
	}
	public void setRTADetails(ims.core.admin.domain.objects.RTA rTADetails) {
		this.rTADetails = rTADetails;
	}

	public ims.core.admin.domain.objects.TIIG getTiig() {
		return tiig;
	}
	public void setTiig(ims.core.admin.domain.objects.TIIG tiig) {
		this.tiig = tiig;
	}

	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public String getOtherReferral() {
		return otherReferral;
	}
	public void setOtherReferral(String otherReferral) {
		if ( null != otherReferral && otherReferral.length() > 75 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for otherReferral. Tried to set value: "+
				otherReferral);
		}
		this.otherReferral = otherReferral;
	}

	public Boolean isMedPatientConsent() {
		return medPatientConsent;
	}
	public void setMedPatientConsent(Boolean medPatientConsent) {
		this.medPatientConsent = medPatientConsent;
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
		
		auditStr.append("\r\n*injuryDateTime* :");
		auditStr.append(injuryDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*sourceOfReferral* :");
		if (sourceOfReferral != null)
			auditStr.append(sourceOfReferral.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*incidentLocation* :");
		if (incidentLocation != null)
			auditStr.append(incidentLocation.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*locationDetails* :");
		auditStr.append(locationDetails);
	    auditStr.append("; ");
		auditStr.append("\r\n*elapsedTime* :");
		auditStr.append(elapsedTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*elapsedPeriod* :");
		if (elapsedPeriod != null)
			auditStr.append(elapsedPeriod.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*category* :");
		if (category != null)
			auditStr.append(category.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*mobility* :");
		if (mobility != null)
			auditStr.append(mobility.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*referringGP* :");
		if (referringGP != null)
		{
			auditStr.append(toShortClassName(referringGP));
				
		    auditStr.append(referringGP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*presentingComplaint* :");
		if (presentingComplaint != null)
			auditStr.append(presentingComplaint.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*school* :");
		if (school != null)
			auditStr.append(school.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*occupation* :");
		if (occupation != null)
			auditStr.append(occupation.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*occupationStatus* :");
		if (occupationStatus != null)
			auditStr.append(occupationStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*placeofEmployment* :");
		auditStr.append(placeofEmployment);
	    auditStr.append("; ");
		auditStr.append("\r\n*episodeOfCare* :");
		if (episodeOfCare != null)
		{
			auditStr.append(toShortClassName(episodeOfCare));
				
		    auditStr.append(episodeOfCare.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*emergencyAttendances* :");
		if (emergencyAttendances != null)
		{
			java.util.Iterator it16 = emergencyAttendances.iterator();
			int i16=0;
			while (it16.hasNext())
			{
				if (i16 > 0)
					auditStr.append(",");
				ims.core.admin.domain.objects.EmergencyAttendance obj = (ims.core.admin.domain.objects.EmergencyAttendance)it16.next();
		if (obj != null)
		{
		   if (i16 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i16++;
		}
		if (i16 > 0)
			auditStr.append("] " + i16);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*triageCategoryType* :");
		if (triageCategoryType != null)
			auditStr.append(triageCategoryType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*specialInterestDetails* :");
		if (specialInterestDetails != null)
		{
		int i18=0;
		for (i18=0; i18<specialInterestDetails.size(); i18++)
		{
			if (i18 > 0)
				auditStr.append(",");
			ims.core.clinical.domain.objects.SpecialInterestDetail obj = (ims.core.clinical.domain.objects.SpecialInterestDetail)specialInterestDetails.get(i18);
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
		auditStr.append("\r\n*rTADetails* :");
		if (rTADetails != null)
		{
			auditStr.append(toShortClassName(rTADetails));
				
		    auditStr.append(rTADetails.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*tiig* :");
		if (tiig != null)
		{
			auditStr.append(toShortClassName(tiig));
				
		    auditStr.append(tiig.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*patient* :");
		if (patient != null)
		{
			auditStr.append(toShortClassName(patient));
				
		    auditStr.append(patient.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*otherReferral* :");
		auditStr.append(otherReferral);
	    auditStr.append("; ");
		auditStr.append("\r\n*medPatientConsent* :");
		auditStr.append(medPatientConsent);
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
		
		String keyClassName = "EmergencyEpisode";
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
		if (this.getInjuryDateTime() != null)
		{
			sb.append("<injuryDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getInjuryDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</injuryDateTime>");		
		}
		if (this.getSourceOfReferral() != null)
		{
			sb.append("<sourceOfReferral>");
			sb.append(this.getSourceOfReferral().toXMLString()); 
			sb.append("</sourceOfReferral>");		
		}
		if (this.getIncidentLocation() != null)
		{
			sb.append("<incidentLocation>");
			sb.append(this.getIncidentLocation().toXMLString()); 
			sb.append("</incidentLocation>");		
		}
		if (this.getLocationDetails() != null)
		{
			sb.append("<locationDetails>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLocationDetails().toString()));
			sb.append("</locationDetails>");		
		}
		if (this.getElapsedTime() != null)
		{
			sb.append("<elapsedTime>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getElapsedTime().toString()));
			sb.append("</elapsedTime>");		
		}
		if (this.getElapsedPeriod() != null)
		{
			sb.append("<elapsedPeriod>");
			sb.append(this.getElapsedPeriod().toXMLString()); 
			sb.append("</elapsedPeriod>");		
		}
		if (this.getCategory() != null)
		{
			sb.append("<category>");
			sb.append(this.getCategory().toXMLString()); 
			sb.append("</category>");		
		}
		if (this.getMobility() != null)
		{
			sb.append("<mobility>");
			sb.append(this.getMobility().toXMLString()); 
			sb.append("</mobility>");		
		}
		if (this.getReferringGP() != null)
		{
			sb.append("<referringGP>");
			sb.append(this.getReferringGP().toXMLString(domMap)); 	
			sb.append("</referringGP>");		
		}
		if (this.getPresentingComplaint() != null)
		{
			sb.append("<presentingComplaint>");
			sb.append(this.getPresentingComplaint().toXMLString()); 
			sb.append("</presentingComplaint>");		
		}
		if (this.getSchool() != null)
		{
			sb.append("<school>");
			sb.append(this.getSchool().toXMLString()); 
			sb.append("</school>");		
		}
		if (this.getOccupation() != null)
		{
			sb.append("<occupation>");
			sb.append(this.getOccupation().toXMLString()); 
			sb.append("</occupation>");		
		}
		if (this.getOccupationStatus() != null)
		{
			sb.append("<occupationStatus>");
			sb.append(this.getOccupationStatus().toXMLString()); 
			sb.append("</occupationStatus>");		
		}
		if (this.getPlaceofEmployment() != null)
		{
			sb.append("<placeofEmployment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPlaceofEmployment().toString()));
			sb.append("</placeofEmployment>");		
		}
		if (this.getEpisodeOfCare() != null)
		{
			sb.append("<episodeOfCare>");
			sb.append(this.getEpisodeOfCare().toXMLString(domMap)); 	
			sb.append("</episodeOfCare>");		
		}
		if (this.getEmergencyAttendances() != null)
		{
			if (this.getEmergencyAttendances().size() > 0 )
			{
			sb.append("<emergencyAttendances>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getEmergencyAttendances(), domMap));
			sb.append("</emergencyAttendances>");		
			}
		}
		if (this.getTriageCategoryType() != null)
		{
			sb.append("<triageCategoryType>");
			sb.append(this.getTriageCategoryType().toXMLString()); 
			sb.append("</triageCategoryType>");		
		}
		if (this.getSpecialInterestDetails() != null)
		{
			if (this.getSpecialInterestDetails().size() > 0 )
			{
			sb.append("<specialInterestDetails>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getSpecialInterestDetails(), domMap));
			sb.append("</specialInterestDetails>");		
			}
		}
		if (this.getRTADetails() != null)
		{
			sb.append("<rTADetails>");
			sb.append(this.getRTADetails().toXMLString(domMap)); 	
			sb.append("</rTADetails>");		
		}
		if (this.getTiig() != null)
		{
			sb.append("<tiig>");
			sb.append(this.getTiig().toXMLString(domMap)); 	
			sb.append("</tiig>");		
		}
		if (this.getPatient() != null)
		{
			sb.append("<patient>");
			sb.append(this.getPatient().toXMLString(domMap)); 	
			sb.append("</patient>");		
		}
		if (this.getOtherReferral() != null)
		{
			sb.append("<otherReferral>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOtherReferral().toString()));
			sb.append("</otherReferral>");		
		}
		if (this.isMedPatientConsent() != null)
		{
			sb.append("<medPatientConsent>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isMedPatientConsent().toString()));
			sb.append("</medPatientConsent>");		
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
			EmergencyEpisode domainObject = getEmergencyEpisodefromXML(itemEl, factory, domMap);

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
			EmergencyEpisode domainObject = getEmergencyEpisodefromXML(itemEl, factory, domMap);

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
		
	public static EmergencyEpisode getEmergencyEpisodefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getEmergencyEpisodefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static EmergencyEpisode getEmergencyEpisodefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!EmergencyEpisode.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!EmergencyEpisode.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the EmergencyEpisode class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (EmergencyEpisode)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(EmergencyEpisode.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		EmergencyEpisode ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (EmergencyEpisode)factory.getImportedDomainObject(EmergencyEpisode.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new EmergencyEpisode();
		}
		String keyClassName = "EmergencyEpisode";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (EmergencyEpisode)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, EmergencyEpisode obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("injuryDateTime");
		if(fldEl != null)
		{	
    		obj.setInjuryDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("sourceOfReferral");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSourceOfReferral(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("incidentLocation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setIncidentLocation(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("locationDetails");
		if(fldEl != null)
		{	
    		obj.setLocationDetails(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("elapsedTime");
		if(fldEl != null)
		{	
    		obj.setElapsedTime(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("elapsedPeriod");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setElapsedPeriod(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("category");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCategory(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("mobility");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setMobility(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("referringGP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setReferringGP(ims.core.resource.people.domain.objects.Gp.getGpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("presentingComplaint");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPresentingComplaint(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("school");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSchool(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("occupation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setOccupation(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("occupationStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setOccupationStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("placeofEmployment");
		if(fldEl != null)
		{	
    		obj.setPlaceofEmployment(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("episodeOfCare");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setEpisodeOfCare(ims.core.admin.domain.objects.EpisodeOfCare.getEpisodeOfCarefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("emergencyAttendances");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setEmergencyAttendances(ims.core.admin.domain.objects.EmergencyAttendance.fromSetXMLString(fldEl, factory, obj.getEmergencyAttendances(), domMap));
		}
		fldEl = el.element("triageCategoryType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTriageCategoryType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("specialInterestDetails");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setSpecialInterestDetails(ims.core.clinical.domain.objects.SpecialInterestDetail.fromListXMLString(fldEl, factory, obj.getSpecialInterestDetails(), domMap));
		}
		fldEl = el.element("rTADetails");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRTADetails(ims.core.admin.domain.objects.RTA.getRTAfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("tiig");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTiig(ims.core.admin.domain.objects.TIIG.getTIIGfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("otherReferral");
		if(fldEl != null)
		{	
    		obj.setOtherReferral(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("medPatientConsent");
		if(fldEl != null)
		{	
    		obj.setMedPatientConsent(new Boolean(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "emergencyAttendances"
		, "specialInterestDetails"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String InjuryDateTime = "injuryDateTime";
		public static final String SourceOfReferral = "sourceOfReferral";
		public static final String IncidentLocation = "incidentLocation";
		public static final String LocationDetails = "locationDetails";
		public static final String ElapsedTime = "elapsedTime";
		public static final String ElapsedPeriod = "elapsedPeriod";
		public static final String Category = "category";
		public static final String Mobility = "mobility";
		public static final String ReferringGP = "referringGP";
		public static final String PresentingComplaint = "presentingComplaint";
		public static final String School = "school";
		public static final String Occupation = "occupation";
		public static final String OccupationStatus = "occupationStatus";
		public static final String PlaceofEmployment = "placeofEmployment";
		public static final String EpisodeOfCare = "episodeOfCare";
		public static final String EmergencyAttendances = "emergencyAttendances";
		public static final String TriageCategoryType = "triageCategoryType";
		public static final String SpecialInterestDetails = "specialInterestDetails";
		public static final String RTADetails = "rTADetails";
		public static final String Tiig = "tiig";
		public static final String Patient = "patient";
		public static final String OtherReferral = "otherReferral";
		public static final String MedPatientConsent = "medPatientConsent";
	}
}

