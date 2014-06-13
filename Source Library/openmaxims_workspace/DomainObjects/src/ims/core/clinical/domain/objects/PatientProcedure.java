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
 * High Level procedure Object
 * @author Kevin O'Carroll
 * Generated.
 */


public class PatientProcedure extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1003100017;
	private static final long serialVersionUID = 1003100017L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Procedure */
	private ims.core.clinical.domain.objects.Procedure procedure;
	/** Procedure Description */
	private String procedureDescription;
	/** Anatomical Site */
	private ims.domain.lookups.LookupInstance procSite;
	/** Site Text */
	private String siteText;
	/** Laterality */
	private ims.domain.lookups.LookupInstance procLaterality;
	/** Procedure Urgency */
	private ims.domain.lookups.LookupInstance procedureUrgency;
	/** Procedure Status - Planned / Immediate */
	private ims.domain.lookups.LookupInstance procedureStatus;
	/** Exclusion From other Specialities ( default to Zero) */
	private Boolean excludeFromOthers;
	/** Date Planned */
	private Integer datePlanned;
	/** Date / Time Procedure Started */
	private Integer procDate;
	/** ProcTime */
	private String procTime;
	/** ProcedureOutcome */
	private ims.domain.lookups.LookupInstance procedureOutcome;
	/** CancelledDate */
	private java.util.Date cancelledDate;
	/** CancelledReason */
	private String cancelledReason;
	/** Significant Procedure */
	private Boolean signifProc;
	/** Performed By / Surgeon */
	private ims.core.resource.people.domain.objects.Hcp peformedBy;
	/** SurgeonsGrade */
	private ims.domain.lookups.LookupInstance surgeonsGrade;
	/** Free text field for name or Hospitals/Wards etc... */
	private String location;
	/** Notes */
	private String notes;
	/** Associated Specialty ?inherit from Episode */
	private ims.domain.lookups.LookupInstance specialty;
	/** High level Source of Information - Gp/Patient/Notes */
	private ims.domain.lookups.LookupInstance infoSource;
	/** Confirmation Status */
	private ims.domain.lookups.LookupInstance confirmedStatus;
	/** Confirmed By */
	private ims.core.resource.people.domain.objects.Hcp confirmedBy;
	/** Confirmed Date and Time */
	private java.util.Date confirmedDateTime;
	/** HCP Present
	  * Collection of ims.core.resource.people.domain.objects.Hcp.
	  */
	private java.util.Set hCPPresent;
	/** Inserted Devices
	  * Collection of ims.core.clinical.domain.objects.PatientCharacteristic.
	  */
	private java.util.Set insertedDevices;
	/** Removed Devices
	  * Collection of ims.core.clinical.domain.objects.PatientCharacteristic.
	  */
	private java.util.Set removedDevices;
	private ims.domain.lookups.LookupInstance procLocation;
	/** ClinicalContact */
	private ims.core.admin.domain.objects.ClinicalContact clinicalContact;
	/** Care Context */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** PlannedProc */
	private ims.core.clinical.domain.objects.PatientProcedure plannedProc;
	/** AuthoringInformation */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInformation;
	/** ProcEndDate */
	private Integer procEndDate;
	/** ProcEndTime */
	private String procEndTime;
	/** ProcedureIntent */
	private ims.domain.lookups.LookupInstance procedureIntent;
	/** UniqueLineRefNo - Used for Monthly Activity Report */
	private String uniqueLineRefNo;
	private Boolean includeInDischargeLetter;
	/** Intra Operative Details */
	private ims.core.clinical.domain.objects.IntraOperativeCareRecord intraOperativeRecord;
	/** Episode of Care */
	private ims.core.admin.domain.objects.EpisodeOfCare episodeOfCare;
	/** IncompleteReason */
	private ims.domain.lookups.LookupInstance incompleteReason;
	/** Consultant */
	private ims.core.resource.people.domain.objects.Hcp consultant;
	/** is Primary Procedure for Operation */
	private Boolean isPrimary;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PatientProcedure (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PatientProcedure ()
    {
    	super();
    }
    public PatientProcedure (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.clinical.domain.objects.PatientProcedure.class;
	}


	public ims.core.clinical.domain.objects.Procedure getProcedure() {
		return procedure;
	}
	public void setProcedure(ims.core.clinical.domain.objects.Procedure procedure) {
		this.procedure = procedure;
	}

	public String getProcedureDescription() {
		return procedureDescription;
	}
	public void setProcedureDescription(String procedureDescription) {
		if ( null != procedureDescription && procedureDescription.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for procedureDescription. Tried to set value: "+
				procedureDescription);
		}
		this.procedureDescription = procedureDescription;
	}

	public ims.domain.lookups.LookupInstance getProcSite() {
		return procSite;
	}
	public void setProcSite(ims.domain.lookups.LookupInstance procSite) {
		this.procSite = procSite;
	}

	public String getSiteText() {
		return siteText;
	}
	public void setSiteText(String siteText) {
		if ( null != siteText && siteText.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for siteText. Tried to set value: "+
				siteText);
		}
		this.siteText = siteText;
	}

	public ims.domain.lookups.LookupInstance getProcLaterality() {
		return procLaterality;
	}
	public void setProcLaterality(ims.domain.lookups.LookupInstance procLaterality) {
		this.procLaterality = procLaterality;
	}

	public ims.domain.lookups.LookupInstance getProcedureUrgency() {
		return procedureUrgency;
	}
	public void setProcedureUrgency(ims.domain.lookups.LookupInstance procedureUrgency) {
		this.procedureUrgency = procedureUrgency;
	}

	public ims.domain.lookups.LookupInstance getProcedureStatus() {
		return procedureStatus;
	}
	public void setProcedureStatus(ims.domain.lookups.LookupInstance procedureStatus) {
		this.procedureStatus = procedureStatus;
	}

	public Boolean isExcludeFromOthers() {
		return excludeFromOthers;
	}
	public void setExcludeFromOthers(Boolean excludeFromOthers) {
		this.excludeFromOthers = excludeFromOthers;
	}

	public Integer getDatePlanned() {
		return datePlanned;
	}
	public void setDatePlanned(Integer datePlanned) {
		this.datePlanned = datePlanned;
	}

	public Integer getProcDate() {
		return procDate;
	}
	public void setProcDate(Integer procDate) {
		this.procDate = procDate;
	}

	public String getProcTime() {
		return procTime;
	}
	public void setProcTime(String procTime) {
		this.procTime = procTime;
	}

	public ims.domain.lookups.LookupInstance getProcedureOutcome() {
		return procedureOutcome;
	}
	public void setProcedureOutcome(ims.domain.lookups.LookupInstance procedureOutcome) {
		this.procedureOutcome = procedureOutcome;
	}

	public java.util.Date getCancelledDate() {
		return cancelledDate;
	}
	public void setCancelledDate(java.util.Date cancelledDate) {
		this.cancelledDate = cancelledDate;
	}

	public String getCancelledReason() {
		return cancelledReason;
	}
	public void setCancelledReason(String cancelledReason) {
		if ( null != cancelledReason && cancelledReason.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for cancelledReason. Tried to set value: "+
				cancelledReason);
		}
		this.cancelledReason = cancelledReason;
	}

	public Boolean isSignifProc() {
		return signifProc;
	}
	public void setSignifProc(Boolean signifProc) {
		this.signifProc = signifProc;
	}

	public ims.core.resource.people.domain.objects.Hcp getPeformedBy() {
		return peformedBy;
	}
	public void setPeformedBy(ims.core.resource.people.domain.objects.Hcp peformedBy) {
		this.peformedBy = peformedBy;
	}

	public ims.domain.lookups.LookupInstance getSurgeonsGrade() {
		return surgeonsGrade;
	}
	public void setSurgeonsGrade(ims.domain.lookups.LookupInstance surgeonsGrade) {
		this.surgeonsGrade = surgeonsGrade;
	}

	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		if ( null != location && location.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for location. Tried to set value: "+
				location);
		}
		this.location = location;
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

	public ims.domain.lookups.LookupInstance getSpecialty() {
		return specialty;
	}
	public void setSpecialty(ims.domain.lookups.LookupInstance specialty) {
		this.specialty = specialty;
	}

	public ims.domain.lookups.LookupInstance getInfoSource() {
		return infoSource;
	}
	public void setInfoSource(ims.domain.lookups.LookupInstance infoSource) {
		this.infoSource = infoSource;
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

	public java.util.Set getHCPPresent() {
		if ( null == hCPPresent ) {
			hCPPresent = new java.util.HashSet();
		}
		return hCPPresent;
	}
	public void setHCPPresent(java.util.Set paramValue) {
		this.hCPPresent = paramValue;
	}

	public java.util.Set getInsertedDevices() {
		if ( null == insertedDevices ) {
			insertedDevices = new java.util.HashSet();
		}
		return insertedDevices;
	}
	public void setInsertedDevices(java.util.Set paramValue) {
		this.insertedDevices = paramValue;
	}

	public java.util.Set getRemovedDevices() {
		if ( null == removedDevices ) {
			removedDevices = new java.util.HashSet();
		}
		return removedDevices;
	}
	public void setRemovedDevices(java.util.Set paramValue) {
		this.removedDevices = paramValue;
	}

	public ims.domain.lookups.LookupInstance getProcLocation() {
		return procLocation;
	}
	public void setProcLocation(ims.domain.lookups.LookupInstance procLocation) {
		this.procLocation = procLocation;
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

	public ims.core.clinical.domain.objects.PatientProcedure getPlannedProc() {
		return plannedProc;
	}
	public void setPlannedProc(ims.core.clinical.domain.objects.PatientProcedure plannedProc) {
		this.plannedProc = plannedProc;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getAuthoringInformation() {
		return authoringInformation;
	}
	public void setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation authoringInformation) {
		this.authoringInformation = authoringInformation;
	}

	public Integer getProcEndDate() {
		return procEndDate;
	}
	public void setProcEndDate(Integer procEndDate) {
		this.procEndDate = procEndDate;
	}

	public String getProcEndTime() {
		return procEndTime;
	}
	public void setProcEndTime(String procEndTime) {
		this.procEndTime = procEndTime;
	}

	public ims.domain.lookups.LookupInstance getProcedureIntent() {
		return procedureIntent;
	}
	public void setProcedureIntent(ims.domain.lookups.LookupInstance procedureIntent) {
		this.procedureIntent = procedureIntent;
	}

	public String getUniqueLineRefNo() {
		return uniqueLineRefNo;
	}
	public void setUniqueLineRefNo(String uniqueLineRefNo) {
		if ( null != uniqueLineRefNo && uniqueLineRefNo.length() > 8 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for uniqueLineRefNo. Tried to set value: "+
				uniqueLineRefNo);
		}
		this.uniqueLineRefNo = uniqueLineRefNo;
	}

	public Boolean isIncludeInDischargeLetter() {
		return includeInDischargeLetter;
	}
	public void setIncludeInDischargeLetter(Boolean includeInDischargeLetter) {
		this.includeInDischargeLetter = includeInDischargeLetter;
	}

	public ims.core.clinical.domain.objects.IntraOperativeCareRecord getIntraOperativeRecord() {
		return intraOperativeRecord;
	}
	public void setIntraOperativeRecord(ims.core.clinical.domain.objects.IntraOperativeCareRecord intraOperativeRecord) {
		this.intraOperativeRecord = intraOperativeRecord;
	}

	public ims.core.admin.domain.objects.EpisodeOfCare getEpisodeOfCare() {
		return episodeOfCare;
	}
	public void setEpisodeOfCare(ims.core.admin.domain.objects.EpisodeOfCare episodeOfCare) {
		this.episodeOfCare = episodeOfCare;
	}

	public ims.domain.lookups.LookupInstance getIncompleteReason() {
		return incompleteReason;
	}
	public void setIncompleteReason(ims.domain.lookups.LookupInstance incompleteReason) {
		this.incompleteReason = incompleteReason;
	}

	public ims.core.resource.people.domain.objects.Hcp getConsultant() {
		return consultant;
	}
	public void setConsultant(ims.core.resource.people.domain.objects.Hcp consultant) {
		this.consultant = consultant;
	}

	public Boolean isIsPrimary() {
		return isPrimary;
	}
	public void setIsPrimary(Boolean isPrimary) {
		this.isPrimary = isPrimary;
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
		
		auditStr.append("\r\n*procedure* :");
		if (procedure != null)
		{
			auditStr.append(toShortClassName(procedure));
				
		    auditStr.append(procedure.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*procedureDescription* :");
		auditStr.append(procedureDescription);
	    auditStr.append("; ");
		auditStr.append("\r\n*procSite* :");
		if (procSite != null)
			auditStr.append(procSite.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*siteText* :");
		auditStr.append(siteText);
	    auditStr.append("; ");
		auditStr.append("\r\n*procLaterality* :");
		if (procLaterality != null)
			auditStr.append(procLaterality.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*procedureUrgency* :");
		if (procedureUrgency != null)
			auditStr.append(procedureUrgency.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*procedureStatus* :");
		if (procedureStatus != null)
			auditStr.append(procedureStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*excludeFromOthers* :");
		auditStr.append(excludeFromOthers);
	    auditStr.append("; ");
		auditStr.append("\r\n*datePlanned* :");
		auditStr.append(datePlanned);
	    auditStr.append("; ");
		auditStr.append("\r\n*procDate* :");
		auditStr.append(procDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*procTime* :");
		auditStr.append(procTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*procedureOutcome* :");
		if (procedureOutcome != null)
			auditStr.append(procedureOutcome.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*cancelledDate* :");
		auditStr.append(cancelledDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*cancelledReason* :");
		auditStr.append(cancelledReason);
	    auditStr.append("; ");
		auditStr.append("\r\n*signifProc* :");
		auditStr.append(signifProc);
	    auditStr.append("; ");
		auditStr.append("\r\n*peformedBy* :");
		if (peformedBy != null)
		{
			auditStr.append(toShortClassName(peformedBy));
				
		    auditStr.append(peformedBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*surgeonsGrade* :");
		if (surgeonsGrade != null)
			auditStr.append(surgeonsGrade.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*location* :");
		auditStr.append(location);
	    auditStr.append("; ");
		auditStr.append("\r\n*notes* :");
		auditStr.append(notes);
	    auditStr.append("; ");
		auditStr.append("\r\n*specialty* :");
		if (specialty != null)
			auditStr.append(specialty.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*infoSource* :");
		if (infoSource != null)
			auditStr.append(infoSource.getText());
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
		auditStr.append("\r\n*hCPPresent* :");
		if (hCPPresent != null)
		{
			java.util.Iterator it25 = hCPPresent.iterator();
			int i25=0;
			while (it25.hasNext())
			{
				if (i25 > 0)
					auditStr.append(",");
				ims.core.resource.people.domain.objects.Hcp obj = (ims.core.resource.people.domain.objects.Hcp)it25.next();
		if (obj != null)
		{
		   if (i25 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i25++;
		}
		if (i25 > 0)
			auditStr.append("] " + i25);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*insertedDevices* :");
		if (insertedDevices != null)
		{
			java.util.Iterator it26 = insertedDevices.iterator();
			int i26=0;
			while (it26.hasNext())
			{
				if (i26 > 0)
					auditStr.append(",");
				ims.core.clinical.domain.objects.PatientCharacteristic obj = (ims.core.clinical.domain.objects.PatientCharacteristic)it26.next();
		if (obj != null)
		{
		   if (i26 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i26++;
		}
		if (i26 > 0)
			auditStr.append("] " + i26);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*removedDevices* :");
		if (removedDevices != null)
		{
			java.util.Iterator it27 = removedDevices.iterator();
			int i27=0;
			while (it27.hasNext())
			{
				if (i27 > 0)
					auditStr.append(",");
				ims.core.clinical.domain.objects.PatientCharacteristic obj = (ims.core.clinical.domain.objects.PatientCharacteristic)it27.next();
		if (obj != null)
		{
		   if (i27 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i27++;
		}
		if (i27 > 0)
			auditStr.append("] " + i27);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*procLocation* :");
		if (procLocation != null)
			auditStr.append(procLocation.getText());
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
		auditStr.append("\r\n*plannedProc* :");
		if (plannedProc != null)
		{
			auditStr.append(toShortClassName(plannedProc));
				
		    auditStr.append(plannedProc.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringInformation* :");
		if (authoringInformation != null)
		{
			auditStr.append(toShortClassName(authoringInformation));
				
		    auditStr.append(authoringInformation.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*procEndDate* :");
		auditStr.append(procEndDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*procEndTime* :");
		auditStr.append(procEndTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*procedureIntent* :");
		if (procedureIntent != null)
			auditStr.append(procedureIntent.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*uniqueLineRefNo* :");
		auditStr.append(uniqueLineRefNo);
	    auditStr.append("; ");
		auditStr.append("\r\n*includeInDischargeLetter* :");
		auditStr.append(includeInDischargeLetter);
	    auditStr.append("; ");
		auditStr.append("\r\n*intraOperativeRecord* :");
		if (intraOperativeRecord != null)
		{
			auditStr.append(toShortClassName(intraOperativeRecord));
				
		    auditStr.append(intraOperativeRecord.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*episodeOfCare* :");
		if (episodeOfCare != null)
		{
			auditStr.append(toShortClassName(episodeOfCare));
				
		    auditStr.append(episodeOfCare.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*incompleteReason* :");
		if (incompleteReason != null)
			auditStr.append(incompleteReason.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*consultant* :");
		if (consultant != null)
		{
			auditStr.append(toShortClassName(consultant));
				
		    auditStr.append(consultant.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isPrimary* :");
		auditStr.append(isPrimary);
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
		
		String keyClassName = "PatientProcedure";
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
		if (this.getProcedure() != null)
		{
			sb.append("<procedure>");
			sb.append(this.getProcedure().toXMLString(domMap)); 	
			sb.append("</procedure>");		
		}
		if (this.getProcedureDescription() != null)
		{
			sb.append("<procedureDescription>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getProcedureDescription().toString()));
			sb.append("</procedureDescription>");		
		}
		if (this.getProcSite() != null)
		{
			sb.append("<procSite>");
			sb.append(this.getProcSite().toXMLString()); 
			sb.append("</procSite>");		
		}
		if (this.getSiteText() != null)
		{
			sb.append("<siteText>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSiteText().toString()));
			sb.append("</siteText>");		
		}
		if (this.getProcLaterality() != null)
		{
			sb.append("<procLaterality>");
			sb.append(this.getProcLaterality().toXMLString()); 
			sb.append("</procLaterality>");		
		}
		if (this.getProcedureUrgency() != null)
		{
			sb.append("<procedureUrgency>");
			sb.append(this.getProcedureUrgency().toXMLString()); 
			sb.append("</procedureUrgency>");		
		}
		if (this.getProcedureStatus() != null)
		{
			sb.append("<procedureStatus>");
			sb.append(this.getProcedureStatus().toXMLString()); 
			sb.append("</procedureStatus>");		
		}
		if (this.isExcludeFromOthers() != null)
		{
			sb.append("<excludeFromOthers>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isExcludeFromOthers().toString()));
			sb.append("</excludeFromOthers>");		
		}
		if (this.getDatePlanned() != null)
		{
			sb.append("<datePlanned>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDatePlanned().toString()));
			sb.append("</datePlanned>");		
		}
		if (this.getProcDate() != null)
		{
			sb.append("<procDate>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getProcDate().toString()));
			sb.append("</procDate>");		
		}
		if (this.getProcTime() != null)
		{
			sb.append("<procTime>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getProcTime().toString()));
			sb.append("</procTime>");		
		}
		if (this.getProcedureOutcome() != null)
		{
			sb.append("<procedureOutcome>");
			sb.append(this.getProcedureOutcome().toXMLString()); 
			sb.append("</procedureOutcome>");		
		}
		if (this.getCancelledDate() != null)
		{
			sb.append("<cancelledDate>");
			sb.append(new ims.framework.utils.DateTime(this.getCancelledDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</cancelledDate>");		
		}
		if (this.getCancelledReason() != null)
		{
			sb.append("<cancelledReason>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCancelledReason().toString()));
			sb.append("</cancelledReason>");		
		}
		if (this.isSignifProc() != null)
		{
			sb.append("<signifProc>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isSignifProc().toString()));
			sb.append("</signifProc>");		
		}
		if (this.getPeformedBy() != null)
		{
			sb.append("<peformedBy>");
			sb.append(this.getPeformedBy().toXMLString(domMap)); 	
			sb.append("</peformedBy>");		
		}
		if (this.getSurgeonsGrade() != null)
		{
			sb.append("<surgeonsGrade>");
			sb.append(this.getSurgeonsGrade().toXMLString()); 
			sb.append("</surgeonsGrade>");		
		}
		if (this.getLocation() != null)
		{
			sb.append("<location>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLocation().toString()));
			sb.append("</location>");		
		}
		if (this.getNotes() != null)
		{
			sb.append("<notes>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNotes().toString()));
			sb.append("</notes>");		
		}
		if (this.getSpecialty() != null)
		{
			sb.append("<specialty>");
			sb.append(this.getSpecialty().toXMLString()); 
			sb.append("</specialty>");		
		}
		if (this.getInfoSource() != null)
		{
			sb.append("<infoSource>");
			sb.append(this.getInfoSource().toXMLString()); 
			sb.append("</infoSource>");		
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
		if (this.getHCPPresent() != null)
		{
			if (this.getHCPPresent().size() > 0 )
			{
			sb.append("<hCPPresent>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getHCPPresent(), domMap));
			sb.append("</hCPPresent>");		
			}
		}
		if (this.getInsertedDevices() != null)
		{
			if (this.getInsertedDevices().size() > 0 )
			{
			sb.append("<insertedDevices>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getInsertedDevices(), domMap));
			sb.append("</insertedDevices>");		
			}
		}
		if (this.getRemovedDevices() != null)
		{
			if (this.getRemovedDevices().size() > 0 )
			{
			sb.append("<removedDevices>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getRemovedDevices(), domMap));
			sb.append("</removedDevices>");		
			}
		}
		if (this.getProcLocation() != null)
		{
			sb.append("<procLocation>");
			sb.append(this.getProcLocation().toXMLString()); 
			sb.append("</procLocation>");		
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
		if (this.getPlannedProc() != null)
		{
			sb.append("<plannedProc>");
			sb.append(this.getPlannedProc().toXMLString(domMap)); 	
			sb.append("</plannedProc>");		
		}
		if (this.getAuthoringInformation() != null)
		{
			sb.append("<authoringInformation>");
			sb.append(this.getAuthoringInformation().toXMLString(domMap)); 	
			sb.append("</authoringInformation>");		
		}
		if (this.getProcEndDate() != null)
		{
			sb.append("<procEndDate>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getProcEndDate().toString()));
			sb.append("</procEndDate>");		
		}
		if (this.getProcEndTime() != null)
		{
			sb.append("<procEndTime>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getProcEndTime().toString()));
			sb.append("</procEndTime>");		
		}
		if (this.getProcedureIntent() != null)
		{
			sb.append("<procedureIntent>");
			sb.append(this.getProcedureIntent().toXMLString()); 
			sb.append("</procedureIntent>");		
		}
		if (this.getUniqueLineRefNo() != null)
		{
			sb.append("<uniqueLineRefNo>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getUniqueLineRefNo().toString()));
			sb.append("</uniqueLineRefNo>");		
		}
		if (this.isIncludeInDischargeLetter() != null)
		{
			sb.append("<includeInDischargeLetter>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIncludeInDischargeLetter().toString()));
			sb.append("</includeInDischargeLetter>");		
		}
		if (this.getIntraOperativeRecord() != null)
		{
			sb.append("<intraOperativeRecord>");
			sb.append(this.getIntraOperativeRecord().toXMLString(domMap)); 	
			sb.append("</intraOperativeRecord>");		
		}
		if (this.getEpisodeOfCare() != null)
		{
			sb.append("<episodeOfCare>");
			sb.append(this.getEpisodeOfCare().toXMLString(domMap)); 	
			sb.append("</episodeOfCare>");		
		}
		if (this.getIncompleteReason() != null)
		{
			sb.append("<incompleteReason>");
			sb.append(this.getIncompleteReason().toXMLString()); 
			sb.append("</incompleteReason>");		
		}
		if (this.getConsultant() != null)
		{
			sb.append("<consultant>");
			sb.append(this.getConsultant().toXMLString(domMap)); 	
			sb.append("</consultant>");		
		}
		if (this.isIsPrimary() != null)
		{
			sb.append("<isPrimary>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsPrimary().toString()));
			sb.append("</isPrimary>");		
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
			PatientProcedure domainObject = getPatientProcedurefromXML(itemEl, factory, domMap);

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
			PatientProcedure domainObject = getPatientProcedurefromXML(itemEl, factory, domMap);

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
		
	public static PatientProcedure getPatientProcedurefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPatientProcedurefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PatientProcedure getPatientProcedurefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PatientProcedure.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PatientProcedure.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PatientProcedure class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PatientProcedure)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PatientProcedure.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PatientProcedure ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PatientProcedure)factory.getImportedDomainObject(PatientProcedure.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PatientProcedure();
		}
		String keyClassName = "PatientProcedure";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PatientProcedure)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PatientProcedure obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("procedure");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setProcedure(ims.core.clinical.domain.objects.Procedure.getProcedurefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("procedureDescription");
		if(fldEl != null)
		{	
    		obj.setProcedureDescription(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("procSite");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setProcSite(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("siteText");
		if(fldEl != null)
		{	
    		obj.setSiteText(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("procLaterality");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setProcLaterality(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("procedureUrgency");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setProcedureUrgency(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("procedureStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setProcedureStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("excludeFromOthers");
		if(fldEl != null)
		{	
    		obj.setExcludeFromOthers(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("datePlanned");
		if(fldEl != null)
		{	
    		obj.setDatePlanned(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("procDate");
		if(fldEl != null)
		{	
    		obj.setProcDate(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("procTime");
		if(fldEl != null)
		{	
    		obj.setProcTime(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("procedureOutcome");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setProcedureOutcome(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("cancelledDate");
		if(fldEl != null)
		{	
    		obj.setCancelledDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("cancelledReason");
		if(fldEl != null)
		{	
    		obj.setCancelledReason(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("signifProc");
		if(fldEl != null)
		{	
    		obj.setSignifProc(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("peformedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPeformedBy(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("surgeonsGrade");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSurgeonsGrade(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("location");
		if(fldEl != null)
		{	
    		obj.setLocation(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("notes");
		if(fldEl != null)
		{	
    		obj.setNotes(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("specialty");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSpecialty(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("infoSource");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setInfoSource(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
		fldEl = el.element("hCPPresent");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setHCPPresent(ims.core.resource.people.domain.objects.Hcp.fromSetXMLString(fldEl, factory, obj.getHCPPresent(), domMap));
		}
		fldEl = el.element("insertedDevices");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setInsertedDevices(ims.core.clinical.domain.objects.PatientCharacteristic.fromSetXMLString(fldEl, factory, obj.getInsertedDevices(), domMap));
		}
		fldEl = el.element("removedDevices");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setRemovedDevices(ims.core.clinical.domain.objects.PatientCharacteristic.fromSetXMLString(fldEl, factory, obj.getRemovedDevices(), domMap));
		}
		fldEl = el.element("procLocation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setProcLocation(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
		fldEl = el.element("plannedProc");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPlannedProc(ims.core.clinical.domain.objects.PatientProcedure.getPatientProcedurefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("authoringInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("procEndDate");
		if(fldEl != null)
		{	
    		obj.setProcEndDate(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("procEndTime");
		if(fldEl != null)
		{	
    		obj.setProcEndTime(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("procedureIntent");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setProcedureIntent(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("uniqueLineRefNo");
		if(fldEl != null)
		{	
    		obj.setUniqueLineRefNo(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("includeInDischargeLetter");
		if(fldEl != null)
		{	
    		obj.setIncludeInDischargeLetter(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("intraOperativeRecord");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setIntraOperativeRecord(ims.core.clinical.domain.objects.IntraOperativeCareRecord.getIntraOperativeCareRecordfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("episodeOfCare");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setEpisodeOfCare(ims.core.admin.domain.objects.EpisodeOfCare.getEpisodeOfCarefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("incompleteReason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setIncompleteReason(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("consultant");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setConsultant(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("isPrimary");
		if(fldEl != null)
		{	
    		obj.setIsPrimary(new Boolean(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "hCPPresent"
		, "insertedDevices"
		, "removedDevices"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Procedure = "procedure";
		public static final String ProcedureDescription = "procedureDescription";
		public static final String ProcSite = "procSite";
		public static final String SiteText = "siteText";
		public static final String ProcLaterality = "procLaterality";
		public static final String ProcedureUrgency = "procedureUrgency";
		public static final String ProcedureStatus = "procedureStatus";
		public static final String ExcludeFromOthers = "excludeFromOthers";
		public static final String DatePlanned = "datePlanned";
		public static final String ProcDate = "procDate";
		public static final String ProcTime = "procTime";
		public static final String ProcedureOutcome = "procedureOutcome";
		public static final String CancelledDate = "cancelledDate";
		public static final String CancelledReason = "cancelledReason";
		public static final String SignifProc = "signifProc";
		public static final String PeformedBy = "peformedBy";
		public static final String SurgeonsGrade = "surgeonsGrade";
		public static final String Location = "location";
		public static final String Notes = "notes";
		public static final String Specialty = "specialty";
		public static final String InfoSource = "infoSource";
		public static final String ConfirmedStatus = "confirmedStatus";
		public static final String ConfirmedBy = "confirmedBy";
		public static final String ConfirmedDateTime = "confirmedDateTime";
		public static final String HCPPresent = "hCPPresent";
		public static final String InsertedDevices = "insertedDevices";
		public static final String RemovedDevices = "removedDevices";
		public static final String ProcLocation = "procLocation";
		public static final String ClinicalContact = "clinicalContact";
		public static final String CareContext = "careContext";
		public static final String PlannedProc = "plannedProc";
		public static final String AuthoringInformation = "authoringInformation";
		public static final String ProcEndDate = "procEndDate";
		public static final String ProcEndTime = "procEndTime";
		public static final String ProcedureIntent = "procedureIntent";
		public static final String UniqueLineRefNo = "uniqueLineRefNo";
		public static final String IncludeInDischargeLetter = "includeInDischargeLetter";
		public static final String IntraOperativeRecord = "intraOperativeRecord";
		public static final String EpisodeOfCare = "episodeOfCare";
		public static final String IncompleteReason = "incompleteReason";
		public static final String Consultant = "consultant";
		public static final String IsPrimary = "isPrimary";
	}
}

