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
package ims.ntpf.casereferral.domain.objects;

/**
 * 
 * @author Joan Heelan
 * Generated.
 */


public class CaseReferral extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1035100000;
	private static final long serialVersionUID = 1035100000L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Patient */
	private ims.core.patient.domain.objects.Patient patient;
	/** Case Type - Inpatient/OutPat/DayCase */
	private ims.domain.lookups.LookupInstance caseType;
	/** Case Classification - Medical/Surgery */
	private ims.domain.lookups.LookupInstance caseClassification;
	/** Case Category - Adult / Paed */
	private ims.domain.lookups.LookupInstance caseCategory;
	/** Referral In Date */
	private java.util.Date referralInDate;
	/** Referral Source */
	private ims.domain.lookups.LookupInstance referralSource;
	/** Referral GP */
	private ims.core.resource.people.domain.objects.Gp referralGP;
	/** Referring Hospital : (Type = referring hospital only) */
	private ims.core.resource.place.domain.objects.Location referringHospital;
	/** Referring Consultant */
	private ims.core.resource.people.domain.objects.Medic referringConsultant;
	/** Referring Liason Officer */
	private ims.core.resource.people.domain.objects.MemberOfStaff referringLiasonOfficer;
	/** Referring Hosp Chart Number */
	private String referringHospChartNumber;
	/** Date On Wait List */
	private Integer dateOnWaitList;
	/** Specialty */
	private ims.core.clinical.domain.objects.Service specialty;
	/** Procedures
	  * Collection of ims.ntpf.casereferral.domain.objects.CaseProcedure.
	  */
	private java.util.Set procedures;
	/** Treating Hospital */
	private ims.core.resource.place.domain.objects.Location treatingHospital;
	/** Treating Consultant */
	private ims.core.resource.people.domain.objects.Medic treatingConsultant;
	/** Treating Hosp Chart Number */
	private String treatingHospChartNumber;
	/** Current Status - Hierarchical parent */
	private ims.domain.lookups.LookupInstance currentStatus;
	/** Status Reason - Hierarchical child */
	private ims.domain.lookups.LookupInstance statusReason;
	/** CaseStatusHistory
	  * Collection of ims.ntpf.casereferral.domain.objects.CaseStatus.
	  */
	private java.util.Set caseStatusHistory;
	/** Linked LoCall WL Detail which created the CaseReferral */
	private ims.ntpf.locall.domain.objects.LoCallWaitingListDetails creatingLoCallWLDetail;
	/** Linked Outlier which created the CaseReferral */
	private ims.ntpf.casereferral.domain.objects.Outlier creatingOutlier;
	/** Linked Discharge Summary which created the CaseReferral */
	private ims.ntpf.casereferral.domain.objects.DischargeSummary creatingDischargeSummary;
	/** Associated Cases - Duplicate Cases
	  * Collection of ims.ntpf.casereferral.domain.objects.CaseReferral.
	  */
	private java.util.Set associatedCases;
	/** 
	  * Collection of ims.ntpf.casereferral.domain.objects.DischargeSummary.
	  */
	private java.util.Set associatedDischargeSummaries;
	/** 
	  * Collection of ims.ntpf.casereferral.domain.objects.Outlier.
	  */
	private java.util.Set associatedOutliers;
	/** Comments Collection
	  * Collection of ims.ntpf.common.domain.objects.Comment.
	  */
	private java.util.Set caseComments;
	private Boolean isLinkedToCase;
	/** True if comments recorded against case */
	private Boolean hasComments;
	/** Hospital Received From */
	private ims.core.resource.place.domain.objects.Location hospital;
	/** Medical Record Number */
	private String mrn;
	/** WL Episode Number */
	private String episodeNumber;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public CaseReferral (Integer id, int ver)
    {
    	super(id, ver);
    }
    public CaseReferral ()
    {
    	super();
    }
    public CaseReferral (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.ntpf.casereferral.domain.objects.CaseReferral.class;
	}


	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public ims.domain.lookups.LookupInstance getCaseType() {
		return caseType;
	}
	public void setCaseType(ims.domain.lookups.LookupInstance caseType) {
		this.caseType = caseType;
	}

	public ims.domain.lookups.LookupInstance getCaseClassification() {
		return caseClassification;
	}
	public void setCaseClassification(ims.domain.lookups.LookupInstance caseClassification) {
		this.caseClassification = caseClassification;
	}

	public ims.domain.lookups.LookupInstance getCaseCategory() {
		return caseCategory;
	}
	public void setCaseCategory(ims.domain.lookups.LookupInstance caseCategory) {
		this.caseCategory = caseCategory;
	}

	public java.util.Date getReferralInDate() {
		return referralInDate;
	}
	public void setReferralInDate(java.util.Date referralInDate) {
		this.referralInDate = referralInDate;
	}

	public ims.domain.lookups.LookupInstance getReferralSource() {
		return referralSource;
	}
	public void setReferralSource(ims.domain.lookups.LookupInstance referralSource) {
		this.referralSource = referralSource;
	}

	public ims.core.resource.people.domain.objects.Gp getReferralGP() {
		return referralGP;
	}
	public void setReferralGP(ims.core.resource.people.domain.objects.Gp referralGP) {
		this.referralGP = referralGP;
	}

	public ims.core.resource.place.domain.objects.Location getReferringHospital() {
		return referringHospital;
	}
	public void setReferringHospital(ims.core.resource.place.domain.objects.Location referringHospital) {
		this.referringHospital = referringHospital;
	}

	public ims.core.resource.people.domain.objects.Medic getReferringConsultant() {
		return referringConsultant;
	}
	public void setReferringConsultant(ims.core.resource.people.domain.objects.Medic referringConsultant) {
		this.referringConsultant = referringConsultant;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getReferringLiasonOfficer() {
		return referringLiasonOfficer;
	}
	public void setReferringLiasonOfficer(ims.core.resource.people.domain.objects.MemberOfStaff referringLiasonOfficer) {
		this.referringLiasonOfficer = referringLiasonOfficer;
	}

	public String getReferringHospChartNumber() {
		return referringHospChartNumber;
	}
	public void setReferringHospChartNumber(String referringHospChartNumber) {
		if ( null != referringHospChartNumber && referringHospChartNumber.length() > 30 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for referringHospChartNumber. Tried to set value: "+
				referringHospChartNumber);
		}
		this.referringHospChartNumber = referringHospChartNumber;
	}

	public Integer getDateOnWaitList() {
		return dateOnWaitList;
	}
	public void setDateOnWaitList(Integer dateOnWaitList) {
		this.dateOnWaitList = dateOnWaitList;
	}

	public ims.core.clinical.domain.objects.Service getSpecialty() {
		return specialty;
	}
	public void setSpecialty(ims.core.clinical.domain.objects.Service specialty) {
		this.specialty = specialty;
	}

	public java.util.Set getProcedures() {
		if ( null == procedures ) {
			procedures = new java.util.HashSet();
		}
		return procedures;
	}
	public void setProcedures(java.util.Set paramValue) {
		this.procedures = paramValue;
	}

	public ims.core.resource.place.domain.objects.Location getTreatingHospital() {
		return treatingHospital;
	}
	public void setTreatingHospital(ims.core.resource.place.domain.objects.Location treatingHospital) {
		this.treatingHospital = treatingHospital;
	}

	public ims.core.resource.people.domain.objects.Medic getTreatingConsultant() {
		return treatingConsultant;
	}
	public void setTreatingConsultant(ims.core.resource.people.domain.objects.Medic treatingConsultant) {
		this.treatingConsultant = treatingConsultant;
	}

	public String getTreatingHospChartNumber() {
		return treatingHospChartNumber;
	}
	public void setTreatingHospChartNumber(String treatingHospChartNumber) {
		if ( null != treatingHospChartNumber && treatingHospChartNumber.length() > 30 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for treatingHospChartNumber. Tried to set value: "+
				treatingHospChartNumber);
		}
		this.treatingHospChartNumber = treatingHospChartNumber;
	}

	public ims.domain.lookups.LookupInstance getCurrentStatus() {
		return currentStatus;
	}
	public void setCurrentStatus(ims.domain.lookups.LookupInstance currentStatus) {
		this.currentStatus = currentStatus;
	}

	public ims.domain.lookups.LookupInstance getStatusReason() {
		return statusReason;
	}
	public void setStatusReason(ims.domain.lookups.LookupInstance statusReason) {
		this.statusReason = statusReason;
	}

	public java.util.Set getCaseStatusHistory() {
		if ( null == caseStatusHistory ) {
			caseStatusHistory = new java.util.HashSet();
		}
		return caseStatusHistory;
	}
	public void setCaseStatusHistory(java.util.Set paramValue) {
		this.caseStatusHistory = paramValue;
	}

	public ims.ntpf.locall.domain.objects.LoCallWaitingListDetails getCreatingLoCallWLDetail() {
		return creatingLoCallWLDetail;
	}
	public void setCreatingLoCallWLDetail(ims.ntpf.locall.domain.objects.LoCallWaitingListDetails creatingLoCallWLDetail) {
		this.creatingLoCallWLDetail = creatingLoCallWLDetail;
	}

	public ims.ntpf.casereferral.domain.objects.Outlier getCreatingOutlier() {
		return creatingOutlier;
	}
	public void setCreatingOutlier(ims.ntpf.casereferral.domain.objects.Outlier creatingOutlier) {
		this.creatingOutlier = creatingOutlier;
	}

	public ims.ntpf.casereferral.domain.objects.DischargeSummary getCreatingDischargeSummary() {
		return creatingDischargeSummary;
	}
	public void setCreatingDischargeSummary(ims.ntpf.casereferral.domain.objects.DischargeSummary creatingDischargeSummary) {
		this.creatingDischargeSummary = creatingDischargeSummary;
	}

	public java.util.Set getAssociatedCases() {
		if ( null == associatedCases ) {
			associatedCases = new java.util.HashSet();
		}
		return associatedCases;
	}
	public void setAssociatedCases(java.util.Set paramValue) {
		this.associatedCases = paramValue;
	}

	public java.util.Set getAssociatedDischargeSummaries() {
		if ( null == associatedDischargeSummaries ) {
			associatedDischargeSummaries = new java.util.HashSet();
		}
		return associatedDischargeSummaries;
	}
	public void setAssociatedDischargeSummaries(java.util.Set paramValue) {
		this.associatedDischargeSummaries = paramValue;
	}

	public java.util.Set getAssociatedOutliers() {
		if ( null == associatedOutliers ) {
			associatedOutliers = new java.util.HashSet();
		}
		return associatedOutliers;
	}
	public void setAssociatedOutliers(java.util.Set paramValue) {
		this.associatedOutliers = paramValue;
	}

	public java.util.Set getCaseComments() {
		if ( null == caseComments ) {
			caseComments = new java.util.HashSet();
		}
		return caseComments;
	}
	public void setCaseComments(java.util.Set paramValue) {
		this.caseComments = paramValue;
	}

	public Boolean isIsLinkedToCase() {
		return isLinkedToCase;
	}
	public void setIsLinkedToCase(Boolean isLinkedToCase) {
		this.isLinkedToCase = isLinkedToCase;
	}

	public Boolean isHasComments() {
		return hasComments;
	}
	public void setHasComments(Boolean hasComments) {
		this.hasComments = hasComments;
	}

	public ims.core.resource.place.domain.objects.Location getHospital() {
		return hospital;
	}
	public void setHospital(ims.core.resource.place.domain.objects.Location hospital) {
		this.hospital = hospital;
	}

	public String getMrn() {
		return mrn;
	}
	public void setMrn(String mrn) {
		if ( null != mrn && mrn.length() > 50 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for mrn. Tried to set value: "+
				mrn);
		}
		this.mrn = mrn;
	}

	public String getEpisodeNumber() {
		return episodeNumber;
	}
	public void setEpisodeNumber(String episodeNumber) {
		if ( null != episodeNumber && episodeNumber.length() > 50 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for episodeNumber. Tried to set value: "+
				episodeNumber);
		}
		this.episodeNumber = episodeNumber;
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
		auditStr.append("\r\n*caseType* :");
		if (caseType != null)
			auditStr.append(caseType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*caseClassification* :");
		if (caseClassification != null)
			auditStr.append(caseClassification.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*caseCategory* :");
		if (caseCategory != null)
			auditStr.append(caseCategory.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*referralInDate* :");
		auditStr.append(referralInDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*referralSource* :");
		if (referralSource != null)
			auditStr.append(referralSource.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*referralGP* :");
		if (referralGP != null)
		{
			auditStr.append(toShortClassName(referralGP));
				
		    auditStr.append(referralGP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*referringHospital* :");
		if (referringHospital != null)
		{
			auditStr.append(toShortClassName(referringHospital));
				
		    auditStr.append(referringHospital.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*referringConsultant* :");
		if (referringConsultant != null)
		{
			auditStr.append(toShortClassName(referringConsultant));
				
		    auditStr.append(referringConsultant.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*referringLiasonOfficer* :");
		if (referringLiasonOfficer != null)
		{
			auditStr.append(toShortClassName(referringLiasonOfficer));
				
		    auditStr.append(referringLiasonOfficer.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*referringHospChartNumber* :");
		auditStr.append(referringHospChartNumber);
	    auditStr.append("; ");
		auditStr.append("\r\n*dateOnWaitList* :");
		auditStr.append(dateOnWaitList);
	    auditStr.append("; ");
		auditStr.append("\r\n*specialty* :");
		if (specialty != null)
		{
			auditStr.append(toShortClassName(specialty));
				
		    auditStr.append(specialty.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*procedures* :");
		if (procedures != null)
		{
			java.util.Iterator it14 = procedures.iterator();
			int i14=0;
			while (it14.hasNext())
			{
				if (i14 > 0)
					auditStr.append(",");
				ims.ntpf.casereferral.domain.objects.CaseProcedure obj = (ims.ntpf.casereferral.domain.objects.CaseProcedure)it14.next();
		if (obj != null)
		{
		   if (i14 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i14++;
		}
		if (i14 > 0)
			auditStr.append("] " + i14);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*treatingHospital* :");
		if (treatingHospital != null)
		{
			auditStr.append(toShortClassName(treatingHospital));
				
		    auditStr.append(treatingHospital.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*treatingConsultant* :");
		if (treatingConsultant != null)
		{
			auditStr.append(toShortClassName(treatingConsultant));
				
		    auditStr.append(treatingConsultant.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*treatingHospChartNumber* :");
		auditStr.append(treatingHospChartNumber);
	    auditStr.append("; ");
		auditStr.append("\r\n*currentStatus* :");
		if (currentStatus != null)
			auditStr.append(currentStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*statusReason* :");
		if (statusReason != null)
			auditStr.append(statusReason.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*caseStatusHistory* :");
		if (caseStatusHistory != null)
		{
			java.util.Iterator it20 = caseStatusHistory.iterator();
			int i20=0;
			while (it20.hasNext())
			{
				if (i20 > 0)
					auditStr.append(",");
				ims.ntpf.casereferral.domain.objects.CaseStatus obj = (ims.ntpf.casereferral.domain.objects.CaseStatus)it20.next();
		if (obj != null)
		{
		   if (i20 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i20++;
		}
		if (i20 > 0)
			auditStr.append("] " + i20);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*creatingLoCallWLDetail* :");
		if (creatingLoCallWLDetail != null)
		{
			auditStr.append(toShortClassName(creatingLoCallWLDetail));
				
		    auditStr.append(creatingLoCallWLDetail.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*creatingOutlier* :");
		if (creatingOutlier != null)
		{
			auditStr.append(toShortClassName(creatingOutlier));
				
		    auditStr.append(creatingOutlier.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*creatingDischargeSummary* :");
		if (creatingDischargeSummary != null)
		{
			auditStr.append(toShortClassName(creatingDischargeSummary));
				
		    auditStr.append(creatingDischargeSummary.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*associatedCases* :");
		if (associatedCases != null)
		{
			java.util.Iterator it24 = associatedCases.iterator();
			int i24=0;
			while (it24.hasNext())
			{
				if (i24 > 0)
					auditStr.append(",");
				ims.ntpf.casereferral.domain.objects.CaseReferral obj = (ims.ntpf.casereferral.domain.objects.CaseReferral)it24.next();
		if (obj != null)
		{
		   if (i24 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i24++;
		}
		if (i24 > 0)
			auditStr.append("] " + i24);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*associatedDischargeSummaries* :");
		if (associatedDischargeSummaries != null)
		{
			java.util.Iterator it25 = associatedDischargeSummaries.iterator();
			int i25=0;
			while (it25.hasNext())
			{
				if (i25 > 0)
					auditStr.append(",");
				ims.ntpf.casereferral.domain.objects.DischargeSummary obj = (ims.ntpf.casereferral.domain.objects.DischargeSummary)it25.next();
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
		auditStr.append("\r\n*associatedOutliers* :");
		if (associatedOutliers != null)
		{
			java.util.Iterator it26 = associatedOutliers.iterator();
			int i26=0;
			while (it26.hasNext())
			{
				if (i26 > 0)
					auditStr.append(",");
				ims.ntpf.casereferral.domain.objects.Outlier obj = (ims.ntpf.casereferral.domain.objects.Outlier)it26.next();
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
		auditStr.append("\r\n*caseComments* :");
		if (caseComments != null)
		{
			java.util.Iterator it27 = caseComments.iterator();
			int i27=0;
			while (it27.hasNext())
			{
				if (i27 > 0)
					auditStr.append(",");
				ims.ntpf.common.domain.objects.Comment obj = (ims.ntpf.common.domain.objects.Comment)it27.next();
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
		auditStr.append("\r\n*isLinkedToCase* :");
		auditStr.append(isLinkedToCase);
	    auditStr.append("; ");
		auditStr.append("\r\n*hasComments* :");
		auditStr.append(hasComments);
	    auditStr.append("; ");
		auditStr.append("\r\n*hospital* :");
		if (hospital != null)
		{
			auditStr.append(toShortClassName(hospital));
				
		    auditStr.append(hospital.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*mrn* :");
		auditStr.append(mrn);
	    auditStr.append("; ");
		auditStr.append("\r\n*episodeNumber* :");
		auditStr.append(episodeNumber);
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
		
		String keyClassName = "CaseReferral";
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
		if (this.getCaseType() != null)
		{
			sb.append("<caseType>");
			sb.append(this.getCaseType().toXMLString()); 
			sb.append("</caseType>");		
		}
		if (this.getCaseClassification() != null)
		{
			sb.append("<caseClassification>");
			sb.append(this.getCaseClassification().toXMLString()); 
			sb.append("</caseClassification>");		
		}
		if (this.getCaseCategory() != null)
		{
			sb.append("<caseCategory>");
			sb.append(this.getCaseCategory().toXMLString()); 
			sb.append("</caseCategory>");		
		}
		if (this.getReferralInDate() != null)
		{
			sb.append("<referralInDate>");
			sb.append(new ims.framework.utils.DateTime(this.getReferralInDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</referralInDate>");		
		}
		if (this.getReferralSource() != null)
		{
			sb.append("<referralSource>");
			sb.append(this.getReferralSource().toXMLString()); 
			sb.append("</referralSource>");		
		}
		if (this.getReferralGP() != null)
		{
			sb.append("<referralGP>");
			sb.append(this.getReferralGP().toXMLString(domMap)); 	
			sb.append("</referralGP>");		
		}
		if (this.getReferringHospital() != null)
		{
			sb.append("<referringHospital>");
			sb.append(this.getReferringHospital().toXMLString(domMap)); 	
			sb.append("</referringHospital>");		
		}
		if (this.getReferringConsultant() != null)
		{
			sb.append("<referringConsultant>");
			sb.append(this.getReferringConsultant().toXMLString(domMap)); 	
			sb.append("</referringConsultant>");		
		}
		if (this.getReferringLiasonOfficer() != null)
		{
			sb.append("<referringLiasonOfficer>");
			sb.append(this.getReferringLiasonOfficer().toXMLString(domMap)); 	
			sb.append("</referringLiasonOfficer>");		
		}
		if (this.getReferringHospChartNumber() != null)
		{
			sb.append("<referringHospChartNumber>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReferringHospChartNumber().toString()));
			sb.append("</referringHospChartNumber>");		
		}
		if (this.getDateOnWaitList() != null)
		{
			sb.append("<dateOnWaitList>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDateOnWaitList().toString()));
			sb.append("</dateOnWaitList>");		
		}
		if (this.getSpecialty() != null)
		{
			sb.append("<specialty>");
			sb.append(this.getSpecialty().toXMLString(domMap)); 	
			sb.append("</specialty>");		
		}
		if (this.getProcedures() != null)
		{
			if (this.getProcedures().size() > 0 )
			{
			sb.append("<procedures>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getProcedures(), domMap));
			sb.append("</procedures>");		
			}
		}
		if (this.getTreatingHospital() != null)
		{
			sb.append("<treatingHospital>");
			sb.append(this.getTreatingHospital().toXMLString(domMap)); 	
			sb.append("</treatingHospital>");		
		}
		if (this.getTreatingConsultant() != null)
		{
			sb.append("<treatingConsultant>");
			sb.append(this.getTreatingConsultant().toXMLString(domMap)); 	
			sb.append("</treatingConsultant>");		
		}
		if (this.getTreatingHospChartNumber() != null)
		{
			sb.append("<treatingHospChartNumber>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTreatingHospChartNumber().toString()));
			sb.append("</treatingHospChartNumber>");		
		}
		if (this.getCurrentStatus() != null)
		{
			sb.append("<currentStatus>");
			sb.append(this.getCurrentStatus().toXMLString()); 
			sb.append("</currentStatus>");		
		}
		if (this.getStatusReason() != null)
		{
			sb.append("<statusReason>");
			sb.append(this.getStatusReason().toXMLString()); 
			sb.append("</statusReason>");		
		}
		if (this.getCaseStatusHistory() != null)
		{
			if (this.getCaseStatusHistory().size() > 0 )
			{
			sb.append("<caseStatusHistory>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getCaseStatusHistory(), domMap));
			sb.append("</caseStatusHistory>");		
			}
		}
		if (this.getCreatingLoCallWLDetail() != null)
		{
			sb.append("<creatingLoCallWLDetail>");
			sb.append(this.getCreatingLoCallWLDetail().toXMLString(domMap)); 	
			sb.append("</creatingLoCallWLDetail>");		
		}
		if (this.getCreatingOutlier() != null)
		{
			sb.append("<creatingOutlier>");
			sb.append(this.getCreatingOutlier().toXMLString(domMap)); 	
			sb.append("</creatingOutlier>");		
		}
		if (this.getCreatingDischargeSummary() != null)
		{
			sb.append("<creatingDischargeSummary>");
			sb.append(this.getCreatingDischargeSummary().toXMLString(domMap)); 	
			sb.append("</creatingDischargeSummary>");		
		}
		if (this.getAssociatedCases() != null)
		{
			if (this.getAssociatedCases().size() > 0 )
			{
			sb.append("<associatedCases>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getAssociatedCases(), domMap));
			sb.append("</associatedCases>");		
			}
		}
		if (this.getAssociatedDischargeSummaries() != null)
		{
			if (this.getAssociatedDischargeSummaries().size() > 0 )
			{
			sb.append("<associatedDischargeSummaries>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getAssociatedDischargeSummaries(), domMap));
			sb.append("</associatedDischargeSummaries>");		
			}
		}
		if (this.getAssociatedOutliers() != null)
		{
			if (this.getAssociatedOutliers().size() > 0 )
			{
			sb.append("<associatedOutliers>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getAssociatedOutliers(), domMap));
			sb.append("</associatedOutliers>");		
			}
		}
		if (this.getCaseComments() != null)
		{
			if (this.getCaseComments().size() > 0 )
			{
			sb.append("<caseComments>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getCaseComments(), domMap));
			sb.append("</caseComments>");		
			}
		}
		if (this.isIsLinkedToCase() != null)
		{
			sb.append("<isLinkedToCase>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsLinkedToCase().toString()));
			sb.append("</isLinkedToCase>");		
		}
		if (this.isHasComments() != null)
		{
			sb.append("<hasComments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHasComments().toString()));
			sb.append("</hasComments>");		
		}
		if (this.getHospital() != null)
		{
			sb.append("<hospital>");
			sb.append(this.getHospital().toXMLString(domMap)); 	
			sb.append("</hospital>");		
		}
		if (this.getMrn() != null)
		{
			sb.append("<mrn>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMrn().toString()));
			sb.append("</mrn>");		
		}
		if (this.getEpisodeNumber() != null)
		{
			sb.append("<episodeNumber>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getEpisodeNumber().toString()));
			sb.append("</episodeNumber>");		
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
			CaseReferral domainObject = getCaseReferralfromXML(itemEl, factory, domMap);

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
			CaseReferral domainObject = getCaseReferralfromXML(itemEl, factory, domMap);

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
		
	public static CaseReferral getCaseReferralfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getCaseReferralfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static CaseReferral getCaseReferralfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!CaseReferral.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!CaseReferral.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the CaseReferral class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (CaseReferral)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(CaseReferral.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		CaseReferral ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (CaseReferral)factory.getImportedDomainObject(CaseReferral.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new CaseReferral();
		}
		String keyClassName = "CaseReferral";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (CaseReferral)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, CaseReferral obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("caseType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCaseType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("caseClassification");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCaseClassification(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("caseCategory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCaseCategory(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("referralInDate");
		if(fldEl != null)
		{	
    		obj.setReferralInDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("referralSource");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReferralSource(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("referralGP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setReferralGP(ims.core.resource.people.domain.objects.Gp.getGpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("referringHospital");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setReferringHospital(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("referringConsultant");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setReferringConsultant(ims.core.resource.people.domain.objects.Medic.getMedicfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("referringLiasonOfficer");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setReferringLiasonOfficer(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("referringHospChartNumber");
		if(fldEl != null)
		{	
    		obj.setReferringHospChartNumber(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dateOnWaitList");
		if(fldEl != null)
		{	
    		obj.setDateOnWaitList(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("specialty");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSpecialty(ims.core.clinical.domain.objects.Service.getServicefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("procedures");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setProcedures(ims.ntpf.casereferral.domain.objects.CaseProcedure.fromSetXMLString(fldEl, factory, obj.getProcedures(), domMap));
		}
		fldEl = el.element("treatingHospital");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTreatingHospital(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("treatingConsultant");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTreatingConsultant(ims.core.resource.people.domain.objects.Medic.getMedicfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("treatingHospChartNumber");
		if(fldEl != null)
		{	
    		obj.setTreatingHospChartNumber(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("currentStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCurrentStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("statusReason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setStatusReason(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("caseStatusHistory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setCaseStatusHistory(ims.ntpf.casereferral.domain.objects.CaseStatus.fromSetXMLString(fldEl, factory, obj.getCaseStatusHistory(), domMap));
		}
		fldEl = el.element("creatingLoCallWLDetail");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCreatingLoCallWLDetail(ims.ntpf.locall.domain.objects.LoCallWaitingListDetails.getLoCallWaitingListDetailsfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("creatingOutlier");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCreatingOutlier(ims.ntpf.casereferral.domain.objects.Outlier.getOutlierfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("creatingDischargeSummary");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCreatingDischargeSummary(ims.ntpf.casereferral.domain.objects.DischargeSummary.getDischargeSummaryfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("associatedCases");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setAssociatedCases(ims.ntpf.casereferral.domain.objects.CaseReferral.fromSetXMLString(fldEl, factory, obj.getAssociatedCases(), domMap));
		}
		fldEl = el.element("associatedDischargeSummaries");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setAssociatedDischargeSummaries(ims.ntpf.casereferral.domain.objects.DischargeSummary.fromSetXMLString(fldEl, factory, obj.getAssociatedDischargeSummaries(), domMap));
		}
		fldEl = el.element("associatedOutliers");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setAssociatedOutliers(ims.ntpf.casereferral.domain.objects.Outlier.fromSetXMLString(fldEl, factory, obj.getAssociatedOutliers(), domMap));
		}
		fldEl = el.element("caseComments");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setCaseComments(ims.ntpf.common.domain.objects.Comment.fromSetXMLString(fldEl, factory, obj.getCaseComments(), domMap));
		}
		fldEl = el.element("isLinkedToCase");
		if(fldEl != null)
		{	
    		obj.setIsLinkedToCase(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("hasComments");
		if(fldEl != null)
		{	
    		obj.setHasComments(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("hospital");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setHospital(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("mrn");
		if(fldEl != null)
		{	
    		obj.setMrn(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("episodeNumber");
		if(fldEl != null)
		{	
    		obj.setEpisodeNumber(new String(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "procedures"
		, "caseStatusHistory"
		, "associatedCases"
		, "associatedDischargeSummaries"
		, "associatedOutliers"
		, "caseComments"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Patient = "patient";
		public static final String CaseType = "caseType";
		public static final String CaseClassification = "caseClassification";
		public static final String CaseCategory = "caseCategory";
		public static final String ReferralInDate = "referralInDate";
		public static final String ReferralSource = "referralSource";
		public static final String ReferralGP = "referralGP";
		public static final String ReferringHospital = "referringHospital";
		public static final String ReferringConsultant = "referringConsultant";
		public static final String ReferringLiasonOfficer = "referringLiasonOfficer";
		public static final String ReferringHospChartNumber = "referringHospChartNumber";
		public static final String DateOnWaitList = "dateOnWaitList";
		public static final String Specialty = "specialty";
		public static final String Procedures = "procedures";
		public static final String TreatingHospital = "treatingHospital";
		public static final String TreatingConsultant = "treatingConsultant";
		public static final String TreatingHospChartNumber = "treatingHospChartNumber";
		public static final String CurrentStatus = "currentStatus";
		public static final String StatusReason = "statusReason";
		public static final String CaseStatusHistory = "caseStatusHistory";
		public static final String CreatingLoCallWLDetail = "creatingLoCallWLDetail";
		public static final String CreatingOutlier = "creatingOutlier";
		public static final String CreatingDischargeSummary = "creatingDischargeSummary";
		public static final String AssociatedCases = "associatedCases";
		public static final String AssociatedDischargeSummaries = "associatedDischargeSummaries";
		public static final String AssociatedOutliers = "associatedOutliers";
		public static final String CaseComments = "caseComments";
		public static final String IsLinkedToCase = "isLinkedToCase";
		public static final String HasComments = "hasComments";
		public static final String Hospital = "hospital";
		public static final String Mrn = "mrn";
		public static final String EpisodeNumber = "episodeNumber";
	}
}

