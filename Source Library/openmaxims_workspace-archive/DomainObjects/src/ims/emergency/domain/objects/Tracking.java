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
package ims.emergency.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class Tracking extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1086100005;
	private static final long serialVersionUID = 1086100005L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Patient */
	private ims.core.patient.domain.objects.Patient patient;
	/** Emergency Attendance */
	private ims.core.admin.domain.objects.EmergencyAttendance attendance;
	/** Episode */
	private ims.core.admin.domain.objects.EmergencyEpisode episode;
	/** Current DNW Status */
	private ims.emergency.domain.objects.DNW currentDNW;
	/** Current Referral to Specialty */
	private ims.emergency.domain.objects.ReferralToSpecTeam currentReferral;
	/** Triage */
	private ims.emergency.domain.objects.Triage triageDetails;
	/** Current Area */
	private ims.emergency.configuration.domain.objects.TrackingArea currentArea;
	/** ED Location */
	private ims.core.resource.place.domain.objects.Location eDLocation;
	/** CurrentStatus */
	private ims.emergency.domain.objects.TrackingAttendanceStatus currentStatus;
	/** is Unknown Patient */
	private Boolean isUnknownPatient;
	/** is a Primary Care Patient */
	private Boolean isPrimaryCare;
	/** Is the patient Discharged */
	private Boolean isDischarged;
	/** Seen By */
	private ims.emergency.domain.objects.SeenByHCP seenBy;
	/** Current Cubicle */
	private ims.emergency.domain.objects.CubicleAllocation currentCubicle;
	/** Last Movement Date Time */
	private java.util.Date lastMovementDateTime;
	/** Bed Availability */
	private ims.emergency.domain.objects.BedAvailability bedAvailability;
	/** Patient is Currently In Xray */
	private Boolean isCurrentlyInXray;
	/** Associated Pending Emergency Admission */
	private ims.core.admin.pas.domain.objects.PendingEmergencyAdmission associatedPendingEmergencyAdmission;
	/** DischargeLetterStatus */
	private ims.domain.lookups.LookupInstance dischargeLetterStatus;
	/** ReasonForBreach */
	private ims.domain.lookups.LookupInstance reasonForBreach;
	/** Current Transfer Record */
	private ims.emergency.domain.objects.EDTransfer currentTransferRecord;
	/** CurrentPartialAdmission */
	private ims.emergency.domain.objects.EDPartialAdmission currentPartialAdmission;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public Tracking (Integer id, int ver)
    {
    	super(id, ver);
    }
    public Tracking ()
    {
    	super();
    }
    public Tracking (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.emergency.domain.objects.Tracking.class;
	}


	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public ims.core.admin.domain.objects.EmergencyAttendance getAttendance() {
		return attendance;
	}
	public void setAttendance(ims.core.admin.domain.objects.EmergencyAttendance attendance) {
		this.attendance = attendance;
	}

	public ims.core.admin.domain.objects.EmergencyEpisode getEpisode() {
		return episode;
	}
	public void setEpisode(ims.core.admin.domain.objects.EmergencyEpisode episode) {
		this.episode = episode;
	}

	public ims.emergency.domain.objects.DNW getCurrentDNW() {
		return currentDNW;
	}
	public void setCurrentDNW(ims.emergency.domain.objects.DNW currentDNW) {
		this.currentDNW = currentDNW;
	}

	public ims.emergency.domain.objects.ReferralToSpecTeam getCurrentReferral() {
		return currentReferral;
	}
	public void setCurrentReferral(ims.emergency.domain.objects.ReferralToSpecTeam currentReferral) {
		this.currentReferral = currentReferral;
	}

	public ims.emergency.domain.objects.Triage getTriageDetails() {
		return triageDetails;
	}
	public void setTriageDetails(ims.emergency.domain.objects.Triage triageDetails) {
		this.triageDetails = triageDetails;
	}

	public ims.emergency.configuration.domain.objects.TrackingArea getCurrentArea() {
		return currentArea;
	}
	public void setCurrentArea(ims.emergency.configuration.domain.objects.TrackingArea currentArea) {
		this.currentArea = currentArea;
	}

	public ims.core.resource.place.domain.objects.Location getEDLocation() {
		return eDLocation;
	}
	public void setEDLocation(ims.core.resource.place.domain.objects.Location eDLocation) {
		this.eDLocation = eDLocation;
	}

	public ims.emergency.domain.objects.TrackingAttendanceStatus getCurrentStatus() {
		return currentStatus;
	}
	public void setCurrentStatus(ims.emergency.domain.objects.TrackingAttendanceStatus currentStatus) {
		this.currentStatus = currentStatus;
	}

	public Boolean isIsUnknownPatient() {
		return isUnknownPatient;
	}
	public void setIsUnknownPatient(Boolean isUnknownPatient) {
		this.isUnknownPatient = isUnknownPatient;
	}

	public Boolean isIsPrimaryCare() {
		return isPrimaryCare;
	}
	public void setIsPrimaryCare(Boolean isPrimaryCare) {
		this.isPrimaryCare = isPrimaryCare;
	}

	public Boolean isIsDischarged() {
		return isDischarged;
	}
	public void setIsDischarged(Boolean isDischarged) {
		this.isDischarged = isDischarged;
	}

	public ims.emergency.domain.objects.SeenByHCP getSeenBy() {
		return seenBy;
	}
	public void setSeenBy(ims.emergency.domain.objects.SeenByHCP seenBy) {
		this.seenBy = seenBy;
	}

	public ims.emergency.domain.objects.CubicleAllocation getCurrentCubicle() {
		return currentCubicle;
	}
	public void setCurrentCubicle(ims.emergency.domain.objects.CubicleAllocation currentCubicle) {
		this.currentCubicle = currentCubicle;
	}

	public java.util.Date getLastMovementDateTime() {
		return lastMovementDateTime;
	}
	public void setLastMovementDateTime(java.util.Date lastMovementDateTime) {
		this.lastMovementDateTime = lastMovementDateTime;
	}

	public ims.emergency.domain.objects.BedAvailability getBedAvailability() {
		return bedAvailability;
	}
	public void setBedAvailability(ims.emergency.domain.objects.BedAvailability bedAvailability) {
		this.bedAvailability = bedAvailability;
	}

	public Boolean isIsCurrentlyInXray() {
		return isCurrentlyInXray;
	}
	public void setIsCurrentlyInXray(Boolean isCurrentlyInXray) {
		this.isCurrentlyInXray = isCurrentlyInXray;
	}

	public ims.core.admin.pas.domain.objects.PendingEmergencyAdmission getAssociatedPendingEmergencyAdmission() {
		return associatedPendingEmergencyAdmission;
	}
	public void setAssociatedPendingEmergencyAdmission(ims.core.admin.pas.domain.objects.PendingEmergencyAdmission associatedPendingEmergencyAdmission) {
		this.associatedPendingEmergencyAdmission = associatedPendingEmergencyAdmission;
	}

	public ims.domain.lookups.LookupInstance getDischargeLetterStatus() {
		return dischargeLetterStatus;
	}
	public void setDischargeLetterStatus(ims.domain.lookups.LookupInstance dischargeLetterStatus) {
		this.dischargeLetterStatus = dischargeLetterStatus;
	}

	public ims.domain.lookups.LookupInstance getReasonForBreach() {
		return reasonForBreach;
	}
	public void setReasonForBreach(ims.domain.lookups.LookupInstance reasonForBreach) {
		this.reasonForBreach = reasonForBreach;
	}

	public ims.emergency.domain.objects.EDTransfer getCurrentTransferRecord() {
		return currentTransferRecord;
	}
	public void setCurrentTransferRecord(ims.emergency.domain.objects.EDTransfer currentTransferRecord) {
		this.currentTransferRecord = currentTransferRecord;
	}

	public ims.emergency.domain.objects.EDPartialAdmission getCurrentPartialAdmission() {
		return currentPartialAdmission;
	}
	public void setCurrentPartialAdmission(ims.emergency.domain.objects.EDPartialAdmission currentPartialAdmission) {
		this.currentPartialAdmission = currentPartialAdmission;
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
		auditStr.append("\r\n*attendance* :");
		if (attendance != null)
		{
			auditStr.append(toShortClassName(attendance));
				
		    auditStr.append(attendance.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*episode* :");
		if (episode != null)
		{
			auditStr.append(toShortClassName(episode));
				
		    auditStr.append(episode.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*currentDNW* :");
		if (currentDNW != null)
		{
			auditStr.append(toShortClassName(currentDNW));
				
		    auditStr.append(currentDNW.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*currentReferral* :");
		if (currentReferral != null)
		{
			auditStr.append(toShortClassName(currentReferral));
				
		    auditStr.append(currentReferral.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*triageDetails* :");
		if (triageDetails != null)
		{
			auditStr.append(toShortClassName(triageDetails));
				
		    auditStr.append(triageDetails.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*currentArea* :");
		if (currentArea != null)
		{
			auditStr.append(toShortClassName(currentArea));
				
		    auditStr.append(currentArea.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*eDLocation* :");
		if (eDLocation != null)
		{
			auditStr.append(toShortClassName(eDLocation));
				
		    auditStr.append(eDLocation.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*currentStatus* :");
		if (currentStatus != null)
		{
			auditStr.append(toShortClassName(currentStatus));
				
		    auditStr.append(currentStatus.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isUnknownPatient* :");
		auditStr.append(isUnknownPatient);
	    auditStr.append("; ");
		auditStr.append("\r\n*isPrimaryCare* :");
		auditStr.append(isPrimaryCare);
	    auditStr.append("; ");
		auditStr.append("\r\n*isDischarged* :");
		auditStr.append(isDischarged);
	    auditStr.append("; ");
		auditStr.append("\r\n*seenBy* :");
		if (seenBy != null)
		{
			auditStr.append(toShortClassName(seenBy));
				
		    auditStr.append(seenBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*currentCubicle* :");
		if (currentCubicle != null)
		{
			auditStr.append(toShortClassName(currentCubicle));
				
		    auditStr.append(currentCubicle.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*lastMovementDateTime* :");
		auditStr.append(lastMovementDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*bedAvailability* :");
		if (bedAvailability != null)
		{
			auditStr.append(toShortClassName(bedAvailability));
				
		    auditStr.append(bedAvailability.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isCurrentlyInXray* :");
		auditStr.append(isCurrentlyInXray);
	    auditStr.append("; ");
		auditStr.append("\r\n*associatedPendingEmergencyAdmission* :");
		if (associatedPendingEmergencyAdmission != null)
		{
			auditStr.append(toShortClassName(associatedPendingEmergencyAdmission));
				
		    auditStr.append(associatedPendingEmergencyAdmission.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*dischargeLetterStatus* :");
		if (dischargeLetterStatus != null)
			auditStr.append(dischargeLetterStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*reasonForBreach* :");
		if (reasonForBreach != null)
			auditStr.append(reasonForBreach.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*currentTransferRecord* :");
		if (currentTransferRecord != null)
		{
			auditStr.append(toShortClassName(currentTransferRecord));
				
		    auditStr.append(currentTransferRecord.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*currentPartialAdmission* :");
		if (currentPartialAdmission != null)
		{
			auditStr.append(toShortClassName(currentPartialAdmission));
				
		    auditStr.append(currentPartialAdmission.getId());
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
		
		String keyClassName = "Tracking";
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
		if (this.getAttendance() != null)
		{
			sb.append("<attendance>");
			sb.append(this.getAttendance().toXMLString(domMap)); 	
			sb.append("</attendance>");		
		}
		if (this.getEpisode() != null)
		{
			sb.append("<episode>");
			sb.append(this.getEpisode().toXMLString(domMap)); 	
			sb.append("</episode>");		
		}
		if (this.getCurrentDNW() != null)
		{
			sb.append("<currentDNW>");
			sb.append(this.getCurrentDNW().toXMLString(domMap)); 	
			sb.append("</currentDNW>");		
		}
		if (this.getCurrentReferral() != null)
		{
			sb.append("<currentReferral>");
			sb.append(this.getCurrentReferral().toXMLString(domMap)); 	
			sb.append("</currentReferral>");		
		}
		if (this.getTriageDetails() != null)
		{
			sb.append("<triageDetails>");
			sb.append(this.getTriageDetails().toXMLString(domMap)); 	
			sb.append("</triageDetails>");		
		}
		if (this.getCurrentArea() != null)
		{
			sb.append("<currentArea>");
			sb.append(this.getCurrentArea().toXMLString(domMap)); 	
			sb.append("</currentArea>");		
		}
		if (this.getEDLocation() != null)
		{
			sb.append("<eDLocation>");
			sb.append(this.getEDLocation().toXMLString(domMap)); 	
			sb.append("</eDLocation>");		
		}
		if (this.getCurrentStatus() != null)
		{
			sb.append("<currentStatus>");
			sb.append(this.getCurrentStatus().toXMLString(domMap)); 	
			sb.append("</currentStatus>");		
		}
		if (this.isIsUnknownPatient() != null)
		{
			sb.append("<isUnknownPatient>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsUnknownPatient().toString()));
			sb.append("</isUnknownPatient>");		
		}
		if (this.isIsPrimaryCare() != null)
		{
			sb.append("<isPrimaryCare>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsPrimaryCare().toString()));
			sb.append("</isPrimaryCare>");		
		}
		if (this.isIsDischarged() != null)
		{
			sb.append("<isDischarged>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsDischarged().toString()));
			sb.append("</isDischarged>");		
		}
		if (this.getSeenBy() != null)
		{
			sb.append("<seenBy>");
			sb.append(this.getSeenBy().toXMLString(domMap)); 	
			sb.append("</seenBy>");		
		}
		if (this.getCurrentCubicle() != null)
		{
			sb.append("<currentCubicle>");
			sb.append(this.getCurrentCubicle().toXMLString(domMap)); 	
			sb.append("</currentCubicle>");		
		}
		if (this.getLastMovementDateTime() != null)
		{
			sb.append("<lastMovementDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getLastMovementDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</lastMovementDateTime>");		
		}
		if (this.getBedAvailability() != null)
		{
			sb.append("<bedAvailability>");
			sb.append(this.getBedAvailability().toXMLString(domMap)); 	
			sb.append("</bedAvailability>");		
		}
		if (this.isIsCurrentlyInXray() != null)
		{
			sb.append("<isCurrentlyInXray>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsCurrentlyInXray().toString()));
			sb.append("</isCurrentlyInXray>");		
		}
		if (this.getAssociatedPendingEmergencyAdmission() != null)
		{
			sb.append("<associatedPendingEmergencyAdmission>");
			sb.append(this.getAssociatedPendingEmergencyAdmission().toXMLString(domMap)); 	
			sb.append("</associatedPendingEmergencyAdmission>");		
		}
		if (this.getDischargeLetterStatus() != null)
		{
			sb.append("<dischargeLetterStatus>");
			sb.append(this.getDischargeLetterStatus().toXMLString()); 
			sb.append("</dischargeLetterStatus>");		
		}
		if (this.getReasonForBreach() != null)
		{
			sb.append("<reasonForBreach>");
			sb.append(this.getReasonForBreach().toXMLString()); 
			sb.append("</reasonForBreach>");		
		}
		if (this.getCurrentTransferRecord() != null)
		{
			sb.append("<currentTransferRecord>");
			sb.append(this.getCurrentTransferRecord().toXMLString(domMap)); 	
			sb.append("</currentTransferRecord>");		
		}
		if (this.getCurrentPartialAdmission() != null)
		{
			sb.append("<currentPartialAdmission>");
			sb.append(this.getCurrentPartialAdmission().toXMLString(domMap)); 	
			sb.append("</currentPartialAdmission>");		
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
			Tracking domainObject = getTrackingfromXML(itemEl, factory, domMap);

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
			Tracking domainObject = getTrackingfromXML(itemEl, factory, domMap);

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
		
	public static Tracking getTrackingfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getTrackingfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static Tracking getTrackingfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!Tracking.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!Tracking.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the Tracking class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (Tracking)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(Tracking.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		Tracking ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (Tracking)factory.getImportedDomainObject(Tracking.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new Tracking();
		}
		String keyClassName = "Tracking";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (Tracking)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, Tracking obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("attendance");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAttendance(ims.core.admin.domain.objects.EmergencyAttendance.getEmergencyAttendancefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("episode");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setEpisode(ims.core.admin.domain.objects.EmergencyEpisode.getEmergencyEpisodefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("currentDNW");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCurrentDNW(ims.emergency.domain.objects.DNW.getDNWfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("currentReferral");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCurrentReferral(ims.emergency.domain.objects.ReferralToSpecTeam.getReferralToSpecTeamfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("triageDetails");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTriageDetails(ims.emergency.domain.objects.Triage.getTriagefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("currentArea");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCurrentArea(ims.emergency.configuration.domain.objects.TrackingArea.getTrackingAreafromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("eDLocation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setEDLocation(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("currentStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCurrentStatus(ims.emergency.domain.objects.TrackingAttendanceStatus.getTrackingAttendanceStatusfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("isUnknownPatient");
		if(fldEl != null)
		{	
    		obj.setIsUnknownPatient(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isPrimaryCare");
		if(fldEl != null)
		{	
    		obj.setIsPrimaryCare(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isDischarged");
		if(fldEl != null)
		{	
    		obj.setIsDischarged(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("seenBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSeenBy(ims.emergency.domain.objects.SeenByHCP.getSeenByHCPfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("currentCubicle");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCurrentCubicle(ims.emergency.domain.objects.CubicleAllocation.getCubicleAllocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("lastMovementDateTime");
		if(fldEl != null)
		{	
    		obj.setLastMovementDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("bedAvailability");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setBedAvailability(ims.emergency.domain.objects.BedAvailability.getBedAvailabilityfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("isCurrentlyInXray");
		if(fldEl != null)
		{	
    		obj.setIsCurrentlyInXray(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("associatedPendingEmergencyAdmission");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAssociatedPendingEmergencyAdmission(ims.core.admin.pas.domain.objects.PendingEmergencyAdmission.getPendingEmergencyAdmissionfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("dischargeLetterStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDischargeLetterStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("reasonForBreach");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReasonForBreach(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("currentTransferRecord");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCurrentTransferRecord(ims.emergency.domain.objects.EDTransfer.getEDTransferfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("currentPartialAdmission");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCurrentPartialAdmission(ims.emergency.domain.objects.EDPartialAdmission.getEDPartialAdmissionfromXML(fldEl, factory, domMap)); 
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
		public static final String Attendance = "attendance";
		public static final String Episode = "episode";
		public static final String CurrentDNW = "currentDNW";
		public static final String CurrentReferral = "currentReferral";
		public static final String TriageDetails = "triageDetails";
		public static final String CurrentArea = "currentArea";
		public static final String EDLocation = "eDLocation";
		public static final String CurrentStatus = "currentStatus";
		public static final String IsUnknownPatient = "isUnknownPatient";
		public static final String IsPrimaryCare = "isPrimaryCare";
		public static final String IsDischarged = "isDischarged";
		public static final String SeenBy = "seenBy";
		public static final String CurrentCubicle = "currentCubicle";
		public static final String LastMovementDateTime = "lastMovementDateTime";
		public static final String BedAvailability = "bedAvailability";
		public static final String IsCurrentlyInXray = "isCurrentlyInXray";
		public static final String AssociatedPendingEmergencyAdmission = "associatedPendingEmergencyAdmission";
		public static final String DischargeLetterStatus = "dischargeLetterStatus";
		public static final String ReasonForBreach = "reasonForBreach";
		public static final String CurrentTransferRecord = "currentTransferRecord";
		public static final String CurrentPartialAdmission = "currentPartialAdmission";
	}
}

