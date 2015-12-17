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
package ims.oncology.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class PrimaryTumourDetails extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1074100007;
	private static final long serialVersionUID = 1074100007L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** CareContext */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** PatientDiagnosis */
	private ims.core.clinical.domain.objects.PatientDiagnosis patientDiagnosis;
	/** AuthoringInformation */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInformation;
	/** TumourGroup */
	private ims.oncology.configuration.domain.objects.TumourGroup tumourGroup;
	/** TumourSite */
	private ims.oncology.configuration.domain.objects.TumourSite tumourSite;
	/** TumourLaterality */
	private ims.domain.lookups.LookupInstance tumourLaterality;
	/** Benign */
	private ims.domain.lookups.LookupInstance benign;
	/** TumourStatus */
	private ims.domain.lookups.LookupInstance tumourStatus;
	/** EndDate */
	private java.util.Date endDate;
	/** TumourHistology */
	private ims.oncology.configuration.domain.objects.TumourHistology tumourHistology;
	/** Histology Source */
	private ims.domain.lookups.LookupInstance histologySource;
	/** GradeofDifferentation */
	private ims.oncology.configuration.domain.objects.HistopathologicGrade gradeofDifferentation;
	/** Differentation Source */
	private ims.domain.lookups.LookupInstance differentatationSource;
	/** StagingClassifications
	  * Collection of ims.oncology.domain.objects.PatientTumourClassification.
	  */
	private java.util.Set stagingClassifications;
	/** PreTreatmentTVal */
	private ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue preTreatmentTVal;
	/** PreTreatmentTCert */
	private ims.domain.lookups.LookupInstance preTreatmentTCert;
	/** PreTreatmentNVal */
	private ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue preTreatmentNVal;
	/** PreTreatmentNCert */
	private ims.domain.lookups.LookupInstance preTreatmentNCert;
	/** PreTreatmentMVal */
	private ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue preTreatmentMVal;
	/** PreTreatmentMCert */
	private ims.domain.lookups.LookupInstance preTreatmentMCert;
	/** PreTreatmentSerumMarker */
	private ims.oncology.configuration.domain.objects.TumourSerumMarker preTreatmentSerumMarker;
	/** Over45Status */
	private String over45Status;
	/** PreTreatmentOverall */
	private ims.oncology.configuration.domain.objects.TumourGroupSiteOverallStaging preTreatmentOverall;
	/** PreTreatmentOverAllCert */
	private ims.domain.lookups.LookupInstance preTreatmentOverAllCert;
	/** IntegratedTVal */
	private ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue integratedTVal;
	/** IntegratedNVal */
	private ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue integratedNVal;
	/** IntegratedMVal */
	private ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue integratedMVal;
	/** Indicates this is the current record */
	private Boolean isCurrent;
	/** Basis - Clinical/Pathological etc */
	private ims.domain.lookups.LookupInstance basisofDiagnosis;
	/** TumourRecurrence
	  * Collection of ims.oncology.domain.objects.PatientTumourRecurrence.
	  */
	private java.util.Set tumourRecurrence;
	/** Episode of Care */
	private ims.core.admin.domain.objects.EpisodeOfCare episodeOfCare;
	/** TumourVersion */
	private ims.oncology.configuration.domain.objects.TNMStagingClassificationVersion tumourVersion;
	/** PathologicalTVal */
	private ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue pathologicalTVal;
	/** PathologicalNVal */
	private ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue pathologicalNVal;
	/** PathologicalMVal */
	private ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue pathologicalMVal;
	/** Assessment */
	private ims.assessment.instantiation.domain.objects.PatientAssessment assessment;
	/** MovedToPrognostic */
	private Boolean movedToPrognostic;
	/** Prognostic Location */
	private ims.oncology.configuration.domain.objects.PrognosticLocationConfig prognosticLocation;
	/** Prognostic Risk */
	private ims.oncology.configuration.domain.objects.PrognosticRiskConfiguration prognosticRisk;
	/** Prognostic PSA */
	private ims.oncology.configuration.domain.objects.PSAConfig prognosticPSA;
	/** Prognostic Gleason */
	private ims.oncology.configuration.domain.objects.GleasonConfig prognosticGleason;
	/** Prognostic Overall Grouping */
	private ims.oncology.configuration.domain.objects.PrognosticGrouping prognosticGrouping;
	/** PrognosticGroupingCert */
	private ims.domain.lookups.LookupInstance prognosticGroupingCert;
	/** PrognosticTVal */
	private ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue prognosticTVal;
	/** PrognosticNVal */
	private ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue prognosticNVal;
	/** PrognosticMVal */
	private ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue prognosticMVal;
	/** PrognosticTCert */
	private ims.domain.lookups.LookupInstance prognosticTCert;
	/** PrognosticNCert */
	private ims.domain.lookups.LookupInstance prognosticNCert;
	/** PrognosticMCert */
	private ims.domain.lookups.LookupInstance prognosticMCert;
	/** Date when Pathological Staging was recorded */
	private java.util.Date pathologicalDate;
	/** Date when Integrated staging was recorded */
	private java.util.Date integratedDate;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PrimaryTumourDetails (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PrimaryTumourDetails ()
    {
    	super();
    }
    public PrimaryTumourDetails (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.oncology.domain.objects.PrimaryTumourDetails.class;
	}


	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public ims.core.clinical.domain.objects.PatientDiagnosis getPatientDiagnosis() {
		return patientDiagnosis;
	}
	public void setPatientDiagnosis(ims.core.clinical.domain.objects.PatientDiagnosis patientDiagnosis) {
		this.patientDiagnosis = patientDiagnosis;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getAuthoringInformation() {
		return authoringInformation;
	}
	public void setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation authoringInformation) {
		this.authoringInformation = authoringInformation;
	}

	public ims.oncology.configuration.domain.objects.TumourGroup getTumourGroup() {
		return tumourGroup;
	}
	public void setTumourGroup(ims.oncology.configuration.domain.objects.TumourGroup tumourGroup) {
		this.tumourGroup = tumourGroup;
	}

	public ims.oncology.configuration.domain.objects.TumourSite getTumourSite() {
		return tumourSite;
	}
	public void setTumourSite(ims.oncology.configuration.domain.objects.TumourSite tumourSite) {
		this.tumourSite = tumourSite;
	}

	public ims.domain.lookups.LookupInstance getTumourLaterality() {
		return tumourLaterality;
	}
	public void setTumourLaterality(ims.domain.lookups.LookupInstance tumourLaterality) {
		this.tumourLaterality = tumourLaterality;
	}

	public ims.domain.lookups.LookupInstance getBenign() {
		return benign;
	}
	public void setBenign(ims.domain.lookups.LookupInstance benign) {
		this.benign = benign;
	}

	public ims.domain.lookups.LookupInstance getTumourStatus() {
		return tumourStatus;
	}
	public void setTumourStatus(ims.domain.lookups.LookupInstance tumourStatus) {
		this.tumourStatus = tumourStatus;
	}

	public java.util.Date getEndDate() {
		return endDate;
	}
	public void setEndDate(java.util.Date endDate) {
		this.endDate = endDate;
	}

	public ims.oncology.configuration.domain.objects.TumourHistology getTumourHistology() {
		return tumourHistology;
	}
	public void setTumourHistology(ims.oncology.configuration.domain.objects.TumourHistology tumourHistology) {
		this.tumourHistology = tumourHistology;
	}

	public ims.domain.lookups.LookupInstance getHistologySource() {
		return histologySource;
	}
	public void setHistologySource(ims.domain.lookups.LookupInstance histologySource) {
		this.histologySource = histologySource;
	}

	public ims.oncology.configuration.domain.objects.HistopathologicGrade getGradeofDifferentation() {
		return gradeofDifferentation;
	}
	public void setGradeofDifferentation(ims.oncology.configuration.domain.objects.HistopathologicGrade gradeofDifferentation) {
		this.gradeofDifferentation = gradeofDifferentation;
	}

	public ims.domain.lookups.LookupInstance getDifferentatationSource() {
		return differentatationSource;
	}
	public void setDifferentatationSource(ims.domain.lookups.LookupInstance differentatationSource) {
		this.differentatationSource = differentatationSource;
	}

	public java.util.Set getStagingClassifications() {
		if ( null == stagingClassifications ) {
			stagingClassifications = new java.util.HashSet();
		}
		return stagingClassifications;
	}
	public void setStagingClassifications(java.util.Set paramValue) {
		this.stagingClassifications = paramValue;
	}

	public ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue getPreTreatmentTVal() {
		return preTreatmentTVal;
	}
	public void setPreTreatmentTVal(ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue preTreatmentTVal) {
		this.preTreatmentTVal = preTreatmentTVal;
	}

	public ims.domain.lookups.LookupInstance getPreTreatmentTCert() {
		return preTreatmentTCert;
	}
	public void setPreTreatmentTCert(ims.domain.lookups.LookupInstance preTreatmentTCert) {
		this.preTreatmentTCert = preTreatmentTCert;
	}

	public ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue getPreTreatmentNVal() {
		return preTreatmentNVal;
	}
	public void setPreTreatmentNVal(ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue preTreatmentNVal) {
		this.preTreatmentNVal = preTreatmentNVal;
	}

	public ims.domain.lookups.LookupInstance getPreTreatmentNCert() {
		return preTreatmentNCert;
	}
	public void setPreTreatmentNCert(ims.domain.lookups.LookupInstance preTreatmentNCert) {
		this.preTreatmentNCert = preTreatmentNCert;
	}

	public ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue getPreTreatmentMVal() {
		return preTreatmentMVal;
	}
	public void setPreTreatmentMVal(ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue preTreatmentMVal) {
		this.preTreatmentMVal = preTreatmentMVal;
	}

	public ims.domain.lookups.LookupInstance getPreTreatmentMCert() {
		return preTreatmentMCert;
	}
	public void setPreTreatmentMCert(ims.domain.lookups.LookupInstance preTreatmentMCert) {
		this.preTreatmentMCert = preTreatmentMCert;
	}

	public ims.oncology.configuration.domain.objects.TumourSerumMarker getPreTreatmentSerumMarker() {
		return preTreatmentSerumMarker;
	}
	public void setPreTreatmentSerumMarker(ims.oncology.configuration.domain.objects.TumourSerumMarker preTreatmentSerumMarker) {
		this.preTreatmentSerumMarker = preTreatmentSerumMarker;
	}

	public String getOver45Status() {
		return over45Status;
	}
	public void setOver45Status(String over45Status) {
		if ( null != over45Status && over45Status.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for over45Status. Tried to set value: "+
				over45Status);
		}
		this.over45Status = over45Status;
	}

	public ims.oncology.configuration.domain.objects.TumourGroupSiteOverallStaging getPreTreatmentOverall() {
		return preTreatmentOverall;
	}
	public void setPreTreatmentOverall(ims.oncology.configuration.domain.objects.TumourGroupSiteOverallStaging preTreatmentOverall) {
		this.preTreatmentOverall = preTreatmentOverall;
	}

	public ims.domain.lookups.LookupInstance getPreTreatmentOverAllCert() {
		return preTreatmentOverAllCert;
	}
	public void setPreTreatmentOverAllCert(ims.domain.lookups.LookupInstance preTreatmentOverAllCert) {
		this.preTreatmentOverAllCert = preTreatmentOverAllCert;
	}

	public ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue getIntegratedTVal() {
		return integratedTVal;
	}
	public void setIntegratedTVal(ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue integratedTVal) {
		this.integratedTVal = integratedTVal;
	}

	public ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue getIntegratedNVal() {
		return integratedNVal;
	}
	public void setIntegratedNVal(ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue integratedNVal) {
		this.integratedNVal = integratedNVal;
	}

	public ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue getIntegratedMVal() {
		return integratedMVal;
	}
	public void setIntegratedMVal(ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue integratedMVal) {
		this.integratedMVal = integratedMVal;
	}

	public Boolean isIsCurrent() {
		return isCurrent;
	}
	public void setIsCurrent(Boolean isCurrent) {
		this.isCurrent = isCurrent;
	}

	public ims.domain.lookups.LookupInstance getBasisofDiagnosis() {
		return basisofDiagnosis;
	}
	public void setBasisofDiagnosis(ims.domain.lookups.LookupInstance basisofDiagnosis) {
		this.basisofDiagnosis = basisofDiagnosis;
	}

	public java.util.Set getTumourRecurrence() {
		if ( null == tumourRecurrence ) {
			tumourRecurrence = new java.util.HashSet();
		}
		return tumourRecurrence;
	}
	public void setTumourRecurrence(java.util.Set paramValue) {
		this.tumourRecurrence = paramValue;
	}

	public ims.core.admin.domain.objects.EpisodeOfCare getEpisodeOfCare() {
		return episodeOfCare;
	}
	public void setEpisodeOfCare(ims.core.admin.domain.objects.EpisodeOfCare episodeOfCare) {
		this.episodeOfCare = episodeOfCare;
	}

	public ims.oncology.configuration.domain.objects.TNMStagingClassificationVersion getTumourVersion() {
		return tumourVersion;
	}
	public void setTumourVersion(ims.oncology.configuration.domain.objects.TNMStagingClassificationVersion tumourVersion) {
		this.tumourVersion = tumourVersion;
	}

	public ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue getPathologicalTVal() {
		return pathologicalTVal;
	}
	public void setPathologicalTVal(ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue pathologicalTVal) {
		this.pathologicalTVal = pathologicalTVal;
	}

	public ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue getPathologicalNVal() {
		return pathologicalNVal;
	}
	public void setPathologicalNVal(ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue pathologicalNVal) {
		this.pathologicalNVal = pathologicalNVal;
	}

	public ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue getPathologicalMVal() {
		return pathologicalMVal;
	}
	public void setPathologicalMVal(ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue pathologicalMVal) {
		this.pathologicalMVal = pathologicalMVal;
	}

	public ims.assessment.instantiation.domain.objects.PatientAssessment getAssessment() {
		return assessment;
	}
	public void setAssessment(ims.assessment.instantiation.domain.objects.PatientAssessment assessment) {
		this.assessment = assessment;
	}

	public Boolean isMovedToPrognostic() {
		return movedToPrognostic;
	}
	public void setMovedToPrognostic(Boolean movedToPrognostic) {
		this.movedToPrognostic = movedToPrognostic;
	}

	public ims.oncology.configuration.domain.objects.PrognosticLocationConfig getPrognosticLocation() {
		return prognosticLocation;
	}
	public void setPrognosticLocation(ims.oncology.configuration.domain.objects.PrognosticLocationConfig prognosticLocation) {
		this.prognosticLocation = prognosticLocation;
	}

	public ims.oncology.configuration.domain.objects.PrognosticRiskConfiguration getPrognosticRisk() {
		return prognosticRisk;
	}
	public void setPrognosticRisk(ims.oncology.configuration.domain.objects.PrognosticRiskConfiguration prognosticRisk) {
		this.prognosticRisk = prognosticRisk;
	}

	public ims.oncology.configuration.domain.objects.PSAConfig getPrognosticPSA() {
		return prognosticPSA;
	}
	public void setPrognosticPSA(ims.oncology.configuration.domain.objects.PSAConfig prognosticPSA) {
		this.prognosticPSA = prognosticPSA;
	}

	public ims.oncology.configuration.domain.objects.GleasonConfig getPrognosticGleason() {
		return prognosticGleason;
	}
	public void setPrognosticGleason(ims.oncology.configuration.domain.objects.GleasonConfig prognosticGleason) {
		this.prognosticGleason = prognosticGleason;
	}

	public ims.oncology.configuration.domain.objects.PrognosticGrouping getPrognosticGrouping() {
		return prognosticGrouping;
	}
	public void setPrognosticGrouping(ims.oncology.configuration.domain.objects.PrognosticGrouping prognosticGrouping) {
		this.prognosticGrouping = prognosticGrouping;
	}

	public ims.domain.lookups.LookupInstance getPrognosticGroupingCert() {
		return prognosticGroupingCert;
	}
	public void setPrognosticGroupingCert(ims.domain.lookups.LookupInstance prognosticGroupingCert) {
		this.prognosticGroupingCert = prognosticGroupingCert;
	}

	public ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue getPrognosticTVal() {
		return prognosticTVal;
	}
	public void setPrognosticTVal(ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue prognosticTVal) {
		this.prognosticTVal = prognosticTVal;
	}

	public ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue getPrognosticNVal() {
		return prognosticNVal;
	}
	public void setPrognosticNVal(ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue prognosticNVal) {
		this.prognosticNVal = prognosticNVal;
	}

	public ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue getPrognosticMVal() {
		return prognosticMVal;
	}
	public void setPrognosticMVal(ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue prognosticMVal) {
		this.prognosticMVal = prognosticMVal;
	}

	public ims.domain.lookups.LookupInstance getPrognosticTCert() {
		return prognosticTCert;
	}
	public void setPrognosticTCert(ims.domain.lookups.LookupInstance prognosticTCert) {
		this.prognosticTCert = prognosticTCert;
	}

	public ims.domain.lookups.LookupInstance getPrognosticNCert() {
		return prognosticNCert;
	}
	public void setPrognosticNCert(ims.domain.lookups.LookupInstance prognosticNCert) {
		this.prognosticNCert = prognosticNCert;
	}

	public ims.domain.lookups.LookupInstance getPrognosticMCert() {
		return prognosticMCert;
	}
	public void setPrognosticMCert(ims.domain.lookups.LookupInstance prognosticMCert) {
		this.prognosticMCert = prognosticMCert;
	}

	public java.util.Date getPathologicalDate() {
		return pathologicalDate;
	}
	public void setPathologicalDate(java.util.Date pathologicalDate) {
		this.pathologicalDate = pathologicalDate;
	}

	public java.util.Date getIntegratedDate() {
		return integratedDate;
	}
	public void setIntegratedDate(java.util.Date integratedDate) {
		this.integratedDate = integratedDate;
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
		auditStr.append("\r\n*patientDiagnosis* :");
		if (patientDiagnosis != null)
		{
			auditStr.append(toShortClassName(patientDiagnosis));
				
		    auditStr.append(patientDiagnosis.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringInformation* :");
		if (authoringInformation != null)
		{
			auditStr.append(toShortClassName(authoringInformation));
				
		    auditStr.append(authoringInformation.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*tumourGroup* :");
		if (tumourGroup != null)
		{
			auditStr.append(toShortClassName(tumourGroup));
				
		    auditStr.append(tumourGroup.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*tumourSite* :");
		if (tumourSite != null)
		{
			auditStr.append(toShortClassName(tumourSite));
				
		    auditStr.append(tumourSite.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*tumourLaterality* :");
		if (tumourLaterality != null)
			auditStr.append(tumourLaterality.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*benign* :");
		if (benign != null)
			auditStr.append(benign.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*tumourStatus* :");
		if (tumourStatus != null)
			auditStr.append(tumourStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*endDate* :");
		auditStr.append(endDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*tumourHistology* :");
		if (tumourHistology != null)
		{
			auditStr.append(toShortClassName(tumourHistology));
				
		    auditStr.append(tumourHistology.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*histologySource* :");
		if (histologySource != null)
			auditStr.append(histologySource.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*gradeofDifferentation* :");
		if (gradeofDifferentation != null)
		{
			auditStr.append(toShortClassName(gradeofDifferentation));
				
		    auditStr.append(gradeofDifferentation.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*differentatationSource* :");
		if (differentatationSource != null)
			auditStr.append(differentatationSource.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*stagingClassifications* :");
		if (stagingClassifications != null)
		{
			java.util.Iterator it14 = stagingClassifications.iterator();
			int i14=0;
			while (it14.hasNext())
			{
				if (i14 > 0)
					auditStr.append(",");
				ims.oncology.domain.objects.PatientTumourClassification obj = (ims.oncology.domain.objects.PatientTumourClassification)it14.next();
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
		auditStr.append("\r\n*preTreatmentTVal* :");
		if (preTreatmentTVal != null)
		{
			auditStr.append(toShortClassName(preTreatmentTVal));
				
		    auditStr.append(preTreatmentTVal.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*preTreatmentTCert* :");
		if (preTreatmentTCert != null)
			auditStr.append(preTreatmentTCert.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*preTreatmentNVal* :");
		if (preTreatmentNVal != null)
		{
			auditStr.append(toShortClassName(preTreatmentNVal));
				
		    auditStr.append(preTreatmentNVal.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*preTreatmentNCert* :");
		if (preTreatmentNCert != null)
			auditStr.append(preTreatmentNCert.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*preTreatmentMVal* :");
		if (preTreatmentMVal != null)
		{
			auditStr.append(toShortClassName(preTreatmentMVal));
				
		    auditStr.append(preTreatmentMVal.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*preTreatmentMCert* :");
		if (preTreatmentMCert != null)
			auditStr.append(preTreatmentMCert.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*preTreatmentSerumMarker* :");
		if (preTreatmentSerumMarker != null)
		{
			auditStr.append(toShortClassName(preTreatmentSerumMarker));
				
		    auditStr.append(preTreatmentSerumMarker.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*over45Status* :");
		auditStr.append(over45Status);
	    auditStr.append("; ");
		auditStr.append("\r\n*preTreatmentOverall* :");
		if (preTreatmentOverall != null)
		{
			auditStr.append(toShortClassName(preTreatmentOverall));
				
		    auditStr.append(preTreatmentOverall.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*preTreatmentOverAllCert* :");
		if (preTreatmentOverAllCert != null)
			auditStr.append(preTreatmentOverAllCert.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*integratedTVal* :");
		if (integratedTVal != null)
		{
			auditStr.append(toShortClassName(integratedTVal));
				
		    auditStr.append(integratedTVal.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*integratedNVal* :");
		if (integratedNVal != null)
		{
			auditStr.append(toShortClassName(integratedNVal));
				
		    auditStr.append(integratedNVal.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*integratedMVal* :");
		if (integratedMVal != null)
		{
			auditStr.append(toShortClassName(integratedMVal));
				
		    auditStr.append(integratedMVal.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isCurrent* :");
		auditStr.append(isCurrent);
	    auditStr.append("; ");
		auditStr.append("\r\n*basisofDiagnosis* :");
		if (basisofDiagnosis != null)
			auditStr.append(basisofDiagnosis.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*tumourRecurrence* :");
		if (tumourRecurrence != null)
		{
			java.util.Iterator it30 = tumourRecurrence.iterator();
			int i30=0;
			while (it30.hasNext())
			{
				if (i30 > 0)
					auditStr.append(",");
				ims.oncology.domain.objects.PatientTumourRecurrence obj = (ims.oncology.domain.objects.PatientTumourRecurrence)it30.next();
		if (obj != null)
		{
		   if (i30 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i30++;
		}
		if (i30 > 0)
			auditStr.append("] " + i30);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*episodeOfCare* :");
		if (episodeOfCare != null)
		{
			auditStr.append(toShortClassName(episodeOfCare));
				
		    auditStr.append(episodeOfCare.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*tumourVersion* :");
		if (tumourVersion != null)
		{
			auditStr.append(toShortClassName(tumourVersion));
				
		    auditStr.append(tumourVersion.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*pathologicalTVal* :");
		if (pathologicalTVal != null)
		{
			auditStr.append(toShortClassName(pathologicalTVal));
				
		    auditStr.append(pathologicalTVal.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*pathologicalNVal* :");
		if (pathologicalNVal != null)
		{
			auditStr.append(toShortClassName(pathologicalNVal));
				
		    auditStr.append(pathologicalNVal.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*pathologicalMVal* :");
		if (pathologicalMVal != null)
		{
			auditStr.append(toShortClassName(pathologicalMVal));
				
		    auditStr.append(pathologicalMVal.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*assessment* :");
		if (assessment != null)
		{
			auditStr.append(toShortClassName(assessment));
				
		    auditStr.append(assessment.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*movedToPrognostic* :");
		auditStr.append(movedToPrognostic);
	    auditStr.append("; ");
		auditStr.append("\r\n*prognosticLocation* :");
		if (prognosticLocation != null)
		{
			auditStr.append(toShortClassName(prognosticLocation));
				
		    auditStr.append(prognosticLocation.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*prognosticRisk* :");
		if (prognosticRisk != null)
		{
			auditStr.append(toShortClassName(prognosticRisk));
				
		    auditStr.append(prognosticRisk.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*prognosticPSA* :");
		if (prognosticPSA != null)
		{
			auditStr.append(toShortClassName(prognosticPSA));
				
		    auditStr.append(prognosticPSA.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*prognosticGleason* :");
		if (prognosticGleason != null)
		{
			auditStr.append(toShortClassName(prognosticGleason));
				
		    auditStr.append(prognosticGleason.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*prognosticGrouping* :");
		if (prognosticGrouping != null)
		{
			auditStr.append(toShortClassName(prognosticGrouping));
				
		    auditStr.append(prognosticGrouping.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*prognosticGroupingCert* :");
		if (prognosticGroupingCert != null)
			auditStr.append(prognosticGroupingCert.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*prognosticTVal* :");
		if (prognosticTVal != null)
		{
			auditStr.append(toShortClassName(prognosticTVal));
				
		    auditStr.append(prognosticTVal.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*prognosticNVal* :");
		if (prognosticNVal != null)
		{
			auditStr.append(toShortClassName(prognosticNVal));
				
		    auditStr.append(prognosticNVal.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*prognosticMVal* :");
		if (prognosticMVal != null)
		{
			auditStr.append(toShortClassName(prognosticMVal));
				
		    auditStr.append(prognosticMVal.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*prognosticTCert* :");
		if (prognosticTCert != null)
			auditStr.append(prognosticTCert.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*prognosticNCert* :");
		if (prognosticNCert != null)
			auditStr.append(prognosticNCert.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*prognosticMCert* :");
		if (prognosticMCert != null)
			auditStr.append(prognosticMCert.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*pathologicalDate* :");
		auditStr.append(pathologicalDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*integratedDate* :");
		auditStr.append(integratedDate);
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
		
		String keyClassName = "PrimaryTumourDetails";
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
		if (this.getPatientDiagnosis() != null)
		{
			sb.append("<patientDiagnosis>");
			sb.append(this.getPatientDiagnosis().toXMLString(domMap)); 	
			sb.append("</patientDiagnosis>");		
		}
		if (this.getAuthoringInformation() != null)
		{
			sb.append("<authoringInformation>");
			sb.append(this.getAuthoringInformation().toXMLString(domMap)); 	
			sb.append("</authoringInformation>");		
		}
		if (this.getTumourGroup() != null)
		{
			sb.append("<tumourGroup>");
			sb.append(this.getTumourGroup().toXMLString(domMap)); 	
			sb.append("</tumourGroup>");		
		}
		if (this.getTumourSite() != null)
		{
			sb.append("<tumourSite>");
			sb.append(this.getTumourSite().toXMLString(domMap)); 	
			sb.append("</tumourSite>");		
		}
		if (this.getTumourLaterality() != null)
		{
			sb.append("<tumourLaterality>");
			sb.append(this.getTumourLaterality().toXMLString()); 
			sb.append("</tumourLaterality>");		
		}
		if (this.getBenign() != null)
		{
			sb.append("<benign>");
			sb.append(this.getBenign().toXMLString()); 
			sb.append("</benign>");		
		}
		if (this.getTumourStatus() != null)
		{
			sb.append("<tumourStatus>");
			sb.append(this.getTumourStatus().toXMLString()); 
			sb.append("</tumourStatus>");		
		}
		if (this.getEndDate() != null)
		{
			sb.append("<endDate>");
			sb.append(new ims.framework.utils.DateTime(this.getEndDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</endDate>");		
		}
		if (this.getTumourHistology() != null)
		{
			sb.append("<tumourHistology>");
			sb.append(this.getTumourHistology().toXMLString(domMap)); 	
			sb.append("</tumourHistology>");		
		}
		if (this.getHistologySource() != null)
		{
			sb.append("<histologySource>");
			sb.append(this.getHistologySource().toXMLString()); 
			sb.append("</histologySource>");		
		}
		if (this.getGradeofDifferentation() != null)
		{
			sb.append("<gradeofDifferentation>");
			sb.append(this.getGradeofDifferentation().toXMLString(domMap)); 	
			sb.append("</gradeofDifferentation>");		
		}
		if (this.getDifferentatationSource() != null)
		{
			sb.append("<differentatationSource>");
			sb.append(this.getDifferentatationSource().toXMLString()); 
			sb.append("</differentatationSource>");		
		}
		if (this.getStagingClassifications() != null)
		{
			if (this.getStagingClassifications().size() > 0 )
			{
			sb.append("<stagingClassifications>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getStagingClassifications(), domMap));
			sb.append("</stagingClassifications>");		
			}
		}
		if (this.getPreTreatmentTVal() != null)
		{
			sb.append("<preTreatmentTVal>");
			sb.append(this.getPreTreatmentTVal().toXMLString(domMap)); 	
			sb.append("</preTreatmentTVal>");		
		}
		if (this.getPreTreatmentTCert() != null)
		{
			sb.append("<preTreatmentTCert>");
			sb.append(this.getPreTreatmentTCert().toXMLString()); 
			sb.append("</preTreatmentTCert>");		
		}
		if (this.getPreTreatmentNVal() != null)
		{
			sb.append("<preTreatmentNVal>");
			sb.append(this.getPreTreatmentNVal().toXMLString(domMap)); 	
			sb.append("</preTreatmentNVal>");		
		}
		if (this.getPreTreatmentNCert() != null)
		{
			sb.append("<preTreatmentNCert>");
			sb.append(this.getPreTreatmentNCert().toXMLString()); 
			sb.append("</preTreatmentNCert>");		
		}
		if (this.getPreTreatmentMVal() != null)
		{
			sb.append("<preTreatmentMVal>");
			sb.append(this.getPreTreatmentMVal().toXMLString(domMap)); 	
			sb.append("</preTreatmentMVal>");		
		}
		if (this.getPreTreatmentMCert() != null)
		{
			sb.append("<preTreatmentMCert>");
			sb.append(this.getPreTreatmentMCert().toXMLString()); 
			sb.append("</preTreatmentMCert>");		
		}
		if (this.getPreTreatmentSerumMarker() != null)
		{
			sb.append("<preTreatmentSerumMarker>");
			sb.append(this.getPreTreatmentSerumMarker().toXMLString(domMap)); 	
			sb.append("</preTreatmentSerumMarker>");		
		}
		if (this.getOver45Status() != null)
		{
			sb.append("<over45Status>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOver45Status().toString()));
			sb.append("</over45Status>");		
		}
		if (this.getPreTreatmentOverall() != null)
		{
			sb.append("<preTreatmentOverall>");
			sb.append(this.getPreTreatmentOverall().toXMLString(domMap)); 	
			sb.append("</preTreatmentOverall>");		
		}
		if (this.getPreTreatmentOverAllCert() != null)
		{
			sb.append("<preTreatmentOverAllCert>");
			sb.append(this.getPreTreatmentOverAllCert().toXMLString()); 
			sb.append("</preTreatmentOverAllCert>");		
		}
		if (this.getIntegratedTVal() != null)
		{
			sb.append("<integratedTVal>");
			sb.append(this.getIntegratedTVal().toXMLString(domMap)); 	
			sb.append("</integratedTVal>");		
		}
		if (this.getIntegratedNVal() != null)
		{
			sb.append("<integratedNVal>");
			sb.append(this.getIntegratedNVal().toXMLString(domMap)); 	
			sb.append("</integratedNVal>");		
		}
		if (this.getIntegratedMVal() != null)
		{
			sb.append("<integratedMVal>");
			sb.append(this.getIntegratedMVal().toXMLString(domMap)); 	
			sb.append("</integratedMVal>");		
		}
		if (this.isIsCurrent() != null)
		{
			sb.append("<isCurrent>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsCurrent().toString()));
			sb.append("</isCurrent>");		
		}
		if (this.getBasisofDiagnosis() != null)
		{
			sb.append("<basisofDiagnosis>");
			sb.append(this.getBasisofDiagnosis().toXMLString()); 
			sb.append("</basisofDiagnosis>");		
		}
		if (this.getTumourRecurrence() != null)
		{
			if (this.getTumourRecurrence().size() > 0 )
			{
			sb.append("<tumourRecurrence>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getTumourRecurrence(), domMap));
			sb.append("</tumourRecurrence>");		
			}
		}
		if (this.getEpisodeOfCare() != null)
		{
			sb.append("<episodeOfCare>");
			sb.append(this.getEpisodeOfCare().toXMLString(domMap)); 	
			sb.append("</episodeOfCare>");		
		}
		if (this.getTumourVersion() != null)
		{
			sb.append("<tumourVersion>");
			sb.append(this.getTumourVersion().toXMLString(domMap)); 	
			sb.append("</tumourVersion>");		
		}
		if (this.getPathologicalTVal() != null)
		{
			sb.append("<pathologicalTVal>");
			sb.append(this.getPathologicalTVal().toXMLString(domMap)); 	
			sb.append("</pathologicalTVal>");		
		}
		if (this.getPathologicalNVal() != null)
		{
			sb.append("<pathologicalNVal>");
			sb.append(this.getPathologicalNVal().toXMLString(domMap)); 	
			sb.append("</pathologicalNVal>");		
		}
		if (this.getPathologicalMVal() != null)
		{
			sb.append("<pathologicalMVal>");
			sb.append(this.getPathologicalMVal().toXMLString(domMap)); 	
			sb.append("</pathologicalMVal>");		
		}
		if (this.getAssessment() != null)
		{
			sb.append("<assessment>");
			sb.append(this.getAssessment().toXMLString(domMap)); 	
			sb.append("</assessment>");		
		}
		if (this.isMovedToPrognostic() != null)
		{
			sb.append("<movedToPrognostic>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isMovedToPrognostic().toString()));
			sb.append("</movedToPrognostic>");		
		}
		if (this.getPrognosticLocation() != null)
		{
			sb.append("<prognosticLocation>");
			sb.append(this.getPrognosticLocation().toXMLString(domMap)); 	
			sb.append("</prognosticLocation>");		
		}
		if (this.getPrognosticRisk() != null)
		{
			sb.append("<prognosticRisk>");
			sb.append(this.getPrognosticRisk().toXMLString(domMap)); 	
			sb.append("</prognosticRisk>");		
		}
		if (this.getPrognosticPSA() != null)
		{
			sb.append("<prognosticPSA>");
			sb.append(this.getPrognosticPSA().toXMLString(domMap)); 	
			sb.append("</prognosticPSA>");		
		}
		if (this.getPrognosticGleason() != null)
		{
			sb.append("<prognosticGleason>");
			sb.append(this.getPrognosticGleason().toXMLString(domMap)); 	
			sb.append("</prognosticGleason>");		
		}
		if (this.getPrognosticGrouping() != null)
		{
			sb.append("<prognosticGrouping>");
			sb.append(this.getPrognosticGrouping().toXMLString(domMap)); 	
			sb.append("</prognosticGrouping>");		
		}
		if (this.getPrognosticGroupingCert() != null)
		{
			sb.append("<prognosticGroupingCert>");
			sb.append(this.getPrognosticGroupingCert().toXMLString()); 
			sb.append("</prognosticGroupingCert>");		
		}
		if (this.getPrognosticTVal() != null)
		{
			sb.append("<prognosticTVal>");
			sb.append(this.getPrognosticTVal().toXMLString(domMap)); 	
			sb.append("</prognosticTVal>");		
		}
		if (this.getPrognosticNVal() != null)
		{
			sb.append("<prognosticNVal>");
			sb.append(this.getPrognosticNVal().toXMLString(domMap)); 	
			sb.append("</prognosticNVal>");		
		}
		if (this.getPrognosticMVal() != null)
		{
			sb.append("<prognosticMVal>");
			sb.append(this.getPrognosticMVal().toXMLString(domMap)); 	
			sb.append("</prognosticMVal>");		
		}
		if (this.getPrognosticTCert() != null)
		{
			sb.append("<prognosticTCert>");
			sb.append(this.getPrognosticTCert().toXMLString()); 
			sb.append("</prognosticTCert>");		
		}
		if (this.getPrognosticNCert() != null)
		{
			sb.append("<prognosticNCert>");
			sb.append(this.getPrognosticNCert().toXMLString()); 
			sb.append("</prognosticNCert>");		
		}
		if (this.getPrognosticMCert() != null)
		{
			sb.append("<prognosticMCert>");
			sb.append(this.getPrognosticMCert().toXMLString()); 
			sb.append("</prognosticMCert>");		
		}
		if (this.getPathologicalDate() != null)
		{
			sb.append("<pathologicalDate>");
			sb.append(new ims.framework.utils.DateTime(this.getPathologicalDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</pathologicalDate>");		
		}
		if (this.getIntegratedDate() != null)
		{
			sb.append("<integratedDate>");
			sb.append(new ims.framework.utils.DateTime(this.getIntegratedDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</integratedDate>");		
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
			PrimaryTumourDetails domainObject = getPrimaryTumourDetailsfromXML(itemEl, factory, domMap);

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
			PrimaryTumourDetails domainObject = getPrimaryTumourDetailsfromXML(itemEl, factory, domMap);

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
		
	public static PrimaryTumourDetails getPrimaryTumourDetailsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPrimaryTumourDetailsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PrimaryTumourDetails getPrimaryTumourDetailsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PrimaryTumourDetails.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PrimaryTumourDetails.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PrimaryTumourDetails class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PrimaryTumourDetails)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PrimaryTumourDetails.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PrimaryTumourDetails ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PrimaryTumourDetails)factory.getImportedDomainObject(PrimaryTumourDetails.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PrimaryTumourDetails();
		}
		String keyClassName = "PrimaryTumourDetails";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PrimaryTumourDetails)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PrimaryTumourDetails obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("patientDiagnosis");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatientDiagnosis(ims.core.clinical.domain.objects.PatientDiagnosis.getPatientDiagnosisfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("authoringInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("tumourGroup");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTumourGroup(ims.oncology.configuration.domain.objects.TumourGroup.getTumourGroupfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("tumourSite");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTumourSite(ims.oncology.configuration.domain.objects.TumourSite.getTumourSitefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("tumourLaterality");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTumourLaterality(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("benign");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setBenign(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("tumourStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTumourStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("endDate");
		if(fldEl != null)
		{	
    		obj.setEndDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("tumourHistology");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTumourHistology(ims.oncology.configuration.domain.objects.TumourHistology.getTumourHistologyfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("histologySource");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setHistologySource(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("gradeofDifferentation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setGradeofDifferentation(ims.oncology.configuration.domain.objects.HistopathologicGrade.getHistopathologicGradefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("differentatationSource");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDifferentatationSource(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("stagingClassifications");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setStagingClassifications(ims.oncology.domain.objects.PatientTumourClassification.fromSetXMLString(fldEl, factory, obj.getStagingClassifications(), domMap));
		}
		fldEl = el.element("preTreatmentTVal");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPreTreatmentTVal(ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue.getTumourGroupSiteTNMValuefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("preTreatmentTCert");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPreTreatmentTCert(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("preTreatmentNVal");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPreTreatmentNVal(ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue.getTumourGroupSiteTNMValuefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("preTreatmentNCert");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPreTreatmentNCert(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("preTreatmentMVal");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPreTreatmentMVal(ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue.getTumourGroupSiteTNMValuefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("preTreatmentMCert");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPreTreatmentMCert(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("preTreatmentSerumMarker");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPreTreatmentSerumMarker(ims.oncology.configuration.domain.objects.TumourSerumMarker.getTumourSerumMarkerfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("over45Status");
		if(fldEl != null)
		{	
    		obj.setOver45Status(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("preTreatmentOverall");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPreTreatmentOverall(ims.oncology.configuration.domain.objects.TumourGroupSiteOverallStaging.getTumourGroupSiteOverallStagingfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("preTreatmentOverAllCert");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPreTreatmentOverAllCert(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("integratedTVal");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setIntegratedTVal(ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue.getTumourGroupSiteTNMValuefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("integratedNVal");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setIntegratedNVal(ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue.getTumourGroupSiteTNMValuefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("integratedMVal");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setIntegratedMVal(ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue.getTumourGroupSiteTNMValuefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("isCurrent");
		if(fldEl != null)
		{	
    		obj.setIsCurrent(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("basisofDiagnosis");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setBasisofDiagnosis(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("tumourRecurrence");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setTumourRecurrence(ims.oncology.domain.objects.PatientTumourRecurrence.fromSetXMLString(fldEl, factory, obj.getTumourRecurrence(), domMap));
		}
		fldEl = el.element("episodeOfCare");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setEpisodeOfCare(ims.core.admin.domain.objects.EpisodeOfCare.getEpisodeOfCarefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("tumourVersion");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTumourVersion(ims.oncology.configuration.domain.objects.TNMStagingClassificationVersion.getTNMStagingClassificationVersionfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("pathologicalTVal");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPathologicalTVal(ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue.getTumourGroupSiteTNMValuefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("pathologicalNVal");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPathologicalNVal(ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue.getTumourGroupSiteTNMValuefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("pathologicalMVal");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPathologicalMVal(ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue.getTumourGroupSiteTNMValuefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("assessment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAssessment(ims.assessment.instantiation.domain.objects.PatientAssessment.getPatientAssessmentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("movedToPrognostic");
		if(fldEl != null)
		{	
    		obj.setMovedToPrognostic(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("prognosticLocation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPrognosticLocation(ims.oncology.configuration.domain.objects.PrognosticLocationConfig.getPrognosticLocationConfigfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("prognosticRisk");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPrognosticRisk(ims.oncology.configuration.domain.objects.PrognosticRiskConfiguration.getPrognosticRiskConfigurationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("prognosticPSA");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPrognosticPSA(ims.oncology.configuration.domain.objects.PSAConfig.getPSAConfigfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("prognosticGleason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPrognosticGleason(ims.oncology.configuration.domain.objects.GleasonConfig.getGleasonConfigfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("prognosticGrouping");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPrognosticGrouping(ims.oncology.configuration.domain.objects.PrognosticGrouping.getPrognosticGroupingfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("prognosticGroupingCert");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPrognosticGroupingCert(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("prognosticTVal");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPrognosticTVal(ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue.getTumourGroupSiteTNMValuefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("prognosticNVal");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPrognosticNVal(ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue.getTumourGroupSiteTNMValuefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("prognosticMVal");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPrognosticMVal(ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue.getTumourGroupSiteTNMValuefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("prognosticTCert");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPrognosticTCert(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("prognosticNCert");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPrognosticNCert(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("prognosticMCert");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPrognosticMCert(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("pathologicalDate");
		if(fldEl != null)
		{	
    		obj.setPathologicalDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("integratedDate");
		if(fldEl != null)
		{	
    		obj.setIntegratedDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "stagingClassifications"
		, "tumourRecurrence"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String CareContext = "careContext";
		public static final String PatientDiagnosis = "patientDiagnosis";
		public static final String AuthoringInformation = "authoringInformation";
		public static final String TumourGroup = "tumourGroup";
		public static final String TumourSite = "tumourSite";
		public static final String TumourLaterality = "tumourLaterality";
		public static final String Benign = "benign";
		public static final String TumourStatus = "tumourStatus";
		public static final String EndDate = "endDate";
		public static final String TumourHistology = "tumourHistology";
		public static final String HistologySource = "histologySource";
		public static final String GradeofDifferentation = "gradeofDifferentation";
		public static final String DifferentatationSource = "differentatationSource";
		public static final String StagingClassifications = "stagingClassifications";
		public static final String PreTreatmentTVal = "preTreatmentTVal";
		public static final String PreTreatmentTCert = "preTreatmentTCert";
		public static final String PreTreatmentNVal = "preTreatmentNVal";
		public static final String PreTreatmentNCert = "preTreatmentNCert";
		public static final String PreTreatmentMVal = "preTreatmentMVal";
		public static final String PreTreatmentMCert = "preTreatmentMCert";
		public static final String PreTreatmentSerumMarker = "preTreatmentSerumMarker";
		public static final String Over45Status = "over45Status";
		public static final String PreTreatmentOverall = "preTreatmentOverall";
		public static final String PreTreatmentOverAllCert = "preTreatmentOverAllCert";
		public static final String IntegratedTVal = "integratedTVal";
		public static final String IntegratedNVal = "integratedNVal";
		public static final String IntegratedMVal = "integratedMVal";
		public static final String IsCurrent = "isCurrent";
		public static final String BasisofDiagnosis = "basisofDiagnosis";
		public static final String TumourRecurrence = "tumourRecurrence";
		public static final String EpisodeOfCare = "episodeOfCare";
		public static final String TumourVersion = "tumourVersion";
		public static final String PathologicalTVal = "pathologicalTVal";
		public static final String PathologicalNVal = "pathologicalNVal";
		public static final String PathologicalMVal = "pathologicalMVal";
		public static final String Assessment = "assessment";
		public static final String MovedToPrognostic = "movedToPrognostic";
		public static final String PrognosticLocation = "prognosticLocation";
		public static final String PrognosticRisk = "prognosticRisk";
		public static final String PrognosticPSA = "prognosticPSA";
		public static final String PrognosticGleason = "prognosticGleason";
		public static final String PrognosticGrouping = "prognosticGrouping";
		public static final String PrognosticGroupingCert = "prognosticGroupingCert";
		public static final String PrognosticTVal = "prognosticTVal";
		public static final String PrognosticNVal = "prognosticNVal";
		public static final String PrognosticMVal = "prognosticMVal";
		public static final String PrognosticTCert = "prognosticTCert";
		public static final String PrognosticNCert = "prognosticNCert";
		public static final String PrognosticMCert = "prognosticMCert";
		public static final String PathologicalDate = "pathologicalDate";
		public static final String IntegratedDate = "integratedDate";
	}
}

