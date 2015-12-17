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


public class RadiotherapyDetails extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1074100003;
	private static final long serialVersionUID = 1074100003L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** CareContext */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** RadiotherapyType */
	private ims.domain.lookups.LookupInstance radiotherapyType;
	/** TreatingHospital */
	private ims.domain.lookups.LookupInstance treatingHospital;
	/** TreatingConsultant */
	private ims.core.resource.people.domain.objects.Hcp treatingConsultant;
	/** DateDecisionToTreat */
	private java.util.Date dateDecisionToTreat;
	/** Performance Status at DDT */
	private ims.domain.lookups.LookupInstance performanceStatusAtDDT;
	/** AnatomicalTreatmentSite */
	private ims.domain.lookups.LookupInstance anatomicalTreatmentSite;
	/** TreatementIntent */
	private ims.domain.lookups.LookupInstance treatementIntent;
	/** PrescribedDose */
	private java.lang.Float prescribedDose;
	/** PrescribedFractions */
	private Integer prescribedFractions;
	/** PrescribedDuration */
	private Integer prescribedDuration;
	/** Concurrent Chemotherapy */
	private ims.domain.lookups.LookupInstance concurrentChemotherapy;
	/** Actual Start Date */
	private java.util.Date startDate;
	/** Actual End Date */
	private java.util.Date endDate;
	/** Treatment Category */
	private Integer treatmentCategory;
	/** Disease Status */
	private ims.domain.lookups.LookupInstance diseaseStatus;
	/** Disease Treatment */
	private ims.domain.lookups.LookupInstance diseaseTreatment;
	/** Reason Delay - 1 */
	private ims.domain.lookups.LookupInstance reasonDelay1;
	/** Reason Delay - 2 */
	private ims.domain.lookups.LookupInstance reasonDelay2;
	/** TreatmentCourseStatus */
	private ims.domain.lookups.LookupInstance treatmentCourseStatus;
	/** TeletherapyDetails */
	private ims.oncology.domain.objects.TeletherapyDetails teletherapyDetails;
	/** BrachytherapyDetails */
	private ims.oncology.domain.objects.BrachytherapyDetails brachytherapyDetails;
	/** AuthoringInformation */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInformation;
	/** Episode of Care */
	private ims.core.admin.domain.objects.EpisodeOfCare episodeOfCare;
	/** Prescribing HCP */
	private ims.core.resource.people.domain.objects.Medic prescribingHCP;
	/** Prescribed Date */
	private java.util.Date prescribedDate;
	/** CCO - Associated Treatment Plan Action */
	private ims.oncology.domain.objects.PatAction associatedTreatmentPlanAction;
	/** HRG */
	private ims.domain.lookups.LookupInstance hRG;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public RadiotherapyDetails (Integer id, int ver)
    {
    	super(id, ver);
    }
    public RadiotherapyDetails ()
    {
    	super();
    }
    public RadiotherapyDetails (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.oncology.domain.objects.RadiotherapyDetails.class;
	}


	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public ims.domain.lookups.LookupInstance getRadiotherapyType() {
		return radiotherapyType;
	}
	public void setRadiotherapyType(ims.domain.lookups.LookupInstance radiotherapyType) {
		this.radiotherapyType = radiotherapyType;
	}

	public ims.domain.lookups.LookupInstance getTreatingHospital() {
		return treatingHospital;
	}
	public void setTreatingHospital(ims.domain.lookups.LookupInstance treatingHospital) {
		this.treatingHospital = treatingHospital;
	}

	public ims.core.resource.people.domain.objects.Hcp getTreatingConsultant() {
		return treatingConsultant;
	}
	public void setTreatingConsultant(ims.core.resource.people.domain.objects.Hcp treatingConsultant) {
		this.treatingConsultant = treatingConsultant;
	}

	public java.util.Date getDateDecisionToTreat() {
		return dateDecisionToTreat;
	}
	public void setDateDecisionToTreat(java.util.Date dateDecisionToTreat) {
		this.dateDecisionToTreat = dateDecisionToTreat;
	}

	public ims.domain.lookups.LookupInstance getPerformanceStatusAtDDT() {
		return performanceStatusAtDDT;
	}
	public void setPerformanceStatusAtDDT(ims.domain.lookups.LookupInstance performanceStatusAtDDT) {
		this.performanceStatusAtDDT = performanceStatusAtDDT;
	}

	public ims.domain.lookups.LookupInstance getAnatomicalTreatmentSite() {
		return anatomicalTreatmentSite;
	}
	public void setAnatomicalTreatmentSite(ims.domain.lookups.LookupInstance anatomicalTreatmentSite) {
		this.anatomicalTreatmentSite = anatomicalTreatmentSite;
	}

	public ims.domain.lookups.LookupInstance getTreatementIntent() {
		return treatementIntent;
	}
	public void setTreatementIntent(ims.domain.lookups.LookupInstance treatementIntent) {
		this.treatementIntent = treatementIntent;
	}

	public java.lang.Float getPrescribedDose() {
		return prescribedDose;
	}
	public void setPrescribedDose(java.lang.Float prescribedDose) {
		this.prescribedDose = prescribedDose;
	}

	public Integer getPrescribedFractions() {
		return prescribedFractions;
	}
	public void setPrescribedFractions(Integer prescribedFractions) {
		this.prescribedFractions = prescribedFractions;
	}

	public Integer getPrescribedDuration() {
		return prescribedDuration;
	}
	public void setPrescribedDuration(Integer prescribedDuration) {
		this.prescribedDuration = prescribedDuration;
	}

	public ims.domain.lookups.LookupInstance getConcurrentChemotherapy() {
		return concurrentChemotherapy;
	}
	public void setConcurrentChemotherapy(ims.domain.lookups.LookupInstance concurrentChemotherapy) {
		this.concurrentChemotherapy = concurrentChemotherapy;
	}

	public java.util.Date getStartDate() {
		return startDate;
	}
	public void setStartDate(java.util.Date startDate) {
		this.startDate = startDate;
	}

	public java.util.Date getEndDate() {
		return endDate;
	}
	public void setEndDate(java.util.Date endDate) {
		this.endDate = endDate;
	}

	public Integer getTreatmentCategory() {
		return treatmentCategory;
	}
	public void setTreatmentCategory(Integer treatmentCategory) {
		this.treatmentCategory = treatmentCategory;
	}

	public ims.domain.lookups.LookupInstance getDiseaseStatus() {
		return diseaseStatus;
	}
	public void setDiseaseStatus(ims.domain.lookups.LookupInstance diseaseStatus) {
		this.diseaseStatus = diseaseStatus;
	}

	public ims.domain.lookups.LookupInstance getDiseaseTreatment() {
		return diseaseTreatment;
	}
	public void setDiseaseTreatment(ims.domain.lookups.LookupInstance diseaseTreatment) {
		this.diseaseTreatment = diseaseTreatment;
	}

	public ims.domain.lookups.LookupInstance getReasonDelay1() {
		return reasonDelay1;
	}
	public void setReasonDelay1(ims.domain.lookups.LookupInstance reasonDelay1) {
		this.reasonDelay1 = reasonDelay1;
	}

	public ims.domain.lookups.LookupInstance getReasonDelay2() {
		return reasonDelay2;
	}
	public void setReasonDelay2(ims.domain.lookups.LookupInstance reasonDelay2) {
		this.reasonDelay2 = reasonDelay2;
	}

	public ims.domain.lookups.LookupInstance getTreatmentCourseStatus() {
		return treatmentCourseStatus;
	}
	public void setTreatmentCourseStatus(ims.domain.lookups.LookupInstance treatmentCourseStatus) {
		this.treatmentCourseStatus = treatmentCourseStatus;
	}

	public ims.oncology.domain.objects.TeletherapyDetails getTeletherapyDetails() {
		return teletherapyDetails;
	}
	public void setTeletherapyDetails(ims.oncology.domain.objects.TeletherapyDetails teletherapyDetails) {
		this.teletherapyDetails = teletherapyDetails;
	}

	public ims.oncology.domain.objects.BrachytherapyDetails getBrachytherapyDetails() {
		return brachytherapyDetails;
	}
	public void setBrachytherapyDetails(ims.oncology.domain.objects.BrachytherapyDetails brachytherapyDetails) {
		this.brachytherapyDetails = brachytherapyDetails;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getAuthoringInformation() {
		return authoringInformation;
	}
	public void setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation authoringInformation) {
		this.authoringInformation = authoringInformation;
	}

	public ims.core.admin.domain.objects.EpisodeOfCare getEpisodeOfCare() {
		return episodeOfCare;
	}
	public void setEpisodeOfCare(ims.core.admin.domain.objects.EpisodeOfCare episodeOfCare) {
		this.episodeOfCare = episodeOfCare;
	}

	public ims.core.resource.people.domain.objects.Medic getPrescribingHCP() {
		return prescribingHCP;
	}
	public void setPrescribingHCP(ims.core.resource.people.domain.objects.Medic prescribingHCP) {
		this.prescribingHCP = prescribingHCP;
	}

	public java.util.Date getPrescribedDate() {
		return prescribedDate;
	}
	public void setPrescribedDate(java.util.Date prescribedDate) {
		this.prescribedDate = prescribedDate;
	}

	public ims.oncology.domain.objects.PatAction getAssociatedTreatmentPlanAction() {
		return associatedTreatmentPlanAction;
	}
	public void setAssociatedTreatmentPlanAction(ims.oncology.domain.objects.PatAction associatedTreatmentPlanAction) {
		this.associatedTreatmentPlanAction = associatedTreatmentPlanAction;
	}

	public ims.domain.lookups.LookupInstance getHRG() {
		return hRG;
	}
	public void setHRG(ims.domain.lookups.LookupInstance hRG) {
		this.hRG = hRG;
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
		auditStr.append("\r\n*radiotherapyType* :");
		if (radiotherapyType != null)
			auditStr.append(radiotherapyType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*treatingHospital* :");
		if (treatingHospital != null)
			auditStr.append(treatingHospital.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*treatingConsultant* :");
		if (treatingConsultant != null)
		{
			auditStr.append(toShortClassName(treatingConsultant));
				
		    auditStr.append(treatingConsultant.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*dateDecisionToTreat* :");
		auditStr.append(dateDecisionToTreat);
	    auditStr.append("; ");
		auditStr.append("\r\n*performanceStatusAtDDT* :");
		if (performanceStatusAtDDT != null)
			auditStr.append(performanceStatusAtDDT.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*anatomicalTreatmentSite* :");
		if (anatomicalTreatmentSite != null)
			auditStr.append(anatomicalTreatmentSite.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*treatementIntent* :");
		if (treatementIntent != null)
			auditStr.append(treatementIntent.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*prescribedDose* :");
		auditStr.append(prescribedDose);
	    auditStr.append("; ");
		auditStr.append("\r\n*prescribedFractions* :");
		auditStr.append(prescribedFractions);
	    auditStr.append("; ");
		auditStr.append("\r\n*prescribedDuration* :");
		auditStr.append(prescribedDuration);
	    auditStr.append("; ");
		auditStr.append("\r\n*concurrentChemotherapy* :");
		if (concurrentChemotherapy != null)
			auditStr.append(concurrentChemotherapy.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*startDate* :");
		auditStr.append(startDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*endDate* :");
		auditStr.append(endDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*treatmentCategory* :");
		auditStr.append(treatmentCategory);
	    auditStr.append("; ");
		auditStr.append("\r\n*diseaseStatus* :");
		if (diseaseStatus != null)
			auditStr.append(diseaseStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*diseaseTreatment* :");
		if (diseaseTreatment != null)
			auditStr.append(diseaseTreatment.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*reasonDelay1* :");
		if (reasonDelay1 != null)
			auditStr.append(reasonDelay1.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*reasonDelay2* :");
		if (reasonDelay2 != null)
			auditStr.append(reasonDelay2.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*treatmentCourseStatus* :");
		if (treatmentCourseStatus != null)
			auditStr.append(treatmentCourseStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*teletherapyDetails* :");
		if (teletherapyDetails != null)
		{
			auditStr.append(toShortClassName(teletherapyDetails));
				
		    auditStr.append(teletherapyDetails.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*brachytherapyDetails* :");
		if (brachytherapyDetails != null)
		{
			auditStr.append(toShortClassName(brachytherapyDetails));
				
		    auditStr.append(brachytherapyDetails.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringInformation* :");
		if (authoringInformation != null)
		{
			auditStr.append(toShortClassName(authoringInformation));
				
		    auditStr.append(authoringInformation.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*episodeOfCare* :");
		if (episodeOfCare != null)
		{
			auditStr.append(toShortClassName(episodeOfCare));
				
		    auditStr.append(episodeOfCare.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*prescribingHCP* :");
		if (prescribingHCP != null)
		{
			auditStr.append(toShortClassName(prescribingHCP));
				
		    auditStr.append(prescribingHCP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*prescribedDate* :");
		auditStr.append(prescribedDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*associatedTreatmentPlanAction* :");
		if (associatedTreatmentPlanAction != null)
		{
			auditStr.append(toShortClassName(associatedTreatmentPlanAction));
				
		    auditStr.append(associatedTreatmentPlanAction.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*hRG* :");
		if (hRG != null)
			auditStr.append(hRG.getText());
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
		
		String keyClassName = "RadiotherapyDetails";
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
		if (this.getRadiotherapyType() != null)
		{
			sb.append("<radiotherapyType>");
			sb.append(this.getRadiotherapyType().toXMLString()); 
			sb.append("</radiotherapyType>");		
		}
		if (this.getTreatingHospital() != null)
		{
			sb.append("<treatingHospital>");
			sb.append(this.getTreatingHospital().toXMLString()); 
			sb.append("</treatingHospital>");		
		}
		if (this.getTreatingConsultant() != null)
		{
			sb.append("<treatingConsultant>");
			sb.append(this.getTreatingConsultant().toXMLString(domMap)); 	
			sb.append("</treatingConsultant>");		
		}
		if (this.getDateDecisionToTreat() != null)
		{
			sb.append("<dateDecisionToTreat>");
			sb.append(new ims.framework.utils.DateTime(this.getDateDecisionToTreat()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateDecisionToTreat>");		
		}
		if (this.getPerformanceStatusAtDDT() != null)
		{
			sb.append("<performanceStatusAtDDT>");
			sb.append(this.getPerformanceStatusAtDDT().toXMLString()); 
			sb.append("</performanceStatusAtDDT>");		
		}
		if (this.getAnatomicalTreatmentSite() != null)
		{
			sb.append("<anatomicalTreatmentSite>");
			sb.append(this.getAnatomicalTreatmentSite().toXMLString()); 
			sb.append("</anatomicalTreatmentSite>");		
		}
		if (this.getTreatementIntent() != null)
		{
			sb.append("<treatementIntent>");
			sb.append(this.getTreatementIntent().toXMLString()); 
			sb.append("</treatementIntent>");		
		}
		if (this.getPrescribedDose() != null)
		{
			sb.append("<prescribedDose>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPrescribedDose().toString()));
			sb.append("</prescribedDose>");		
		}
		if (this.getPrescribedFractions() != null)
		{
			sb.append("<prescribedFractions>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPrescribedFractions().toString()));
			sb.append("</prescribedFractions>");		
		}
		if (this.getPrescribedDuration() != null)
		{
			sb.append("<prescribedDuration>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPrescribedDuration().toString()));
			sb.append("</prescribedDuration>");		
		}
		if (this.getConcurrentChemotherapy() != null)
		{
			sb.append("<concurrentChemotherapy>");
			sb.append(this.getConcurrentChemotherapy().toXMLString()); 
			sb.append("</concurrentChemotherapy>");		
		}
		if (this.getStartDate() != null)
		{
			sb.append("<startDate>");
			sb.append(new ims.framework.utils.DateTime(this.getStartDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</startDate>");		
		}
		if (this.getEndDate() != null)
		{
			sb.append("<endDate>");
			sb.append(new ims.framework.utils.DateTime(this.getEndDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</endDate>");		
		}
		if (this.getTreatmentCategory() != null)
		{
			sb.append("<treatmentCategory>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTreatmentCategory().toString()));
			sb.append("</treatmentCategory>");		
		}
		if (this.getDiseaseStatus() != null)
		{
			sb.append("<diseaseStatus>");
			sb.append(this.getDiseaseStatus().toXMLString()); 
			sb.append("</diseaseStatus>");		
		}
		if (this.getDiseaseTreatment() != null)
		{
			sb.append("<diseaseTreatment>");
			sb.append(this.getDiseaseTreatment().toXMLString()); 
			sb.append("</diseaseTreatment>");		
		}
		if (this.getReasonDelay1() != null)
		{
			sb.append("<reasonDelay1>");
			sb.append(this.getReasonDelay1().toXMLString()); 
			sb.append("</reasonDelay1>");		
		}
		if (this.getReasonDelay2() != null)
		{
			sb.append("<reasonDelay2>");
			sb.append(this.getReasonDelay2().toXMLString()); 
			sb.append("</reasonDelay2>");		
		}
		if (this.getTreatmentCourseStatus() != null)
		{
			sb.append("<treatmentCourseStatus>");
			sb.append(this.getTreatmentCourseStatus().toXMLString()); 
			sb.append("</treatmentCourseStatus>");		
		}
		if (this.getTeletherapyDetails() != null)
		{
			sb.append("<teletherapyDetails>");
			sb.append(this.getTeletherapyDetails().toXMLString(domMap)); 	
			sb.append("</teletherapyDetails>");		
		}
		if (this.getBrachytherapyDetails() != null)
		{
			sb.append("<brachytherapyDetails>");
			sb.append(this.getBrachytherapyDetails().toXMLString(domMap)); 	
			sb.append("</brachytherapyDetails>");		
		}
		if (this.getAuthoringInformation() != null)
		{
			sb.append("<authoringInformation>");
			sb.append(this.getAuthoringInformation().toXMLString(domMap)); 	
			sb.append("</authoringInformation>");		
		}
		if (this.getEpisodeOfCare() != null)
		{
			sb.append("<episodeOfCare>");
			sb.append(this.getEpisodeOfCare().toXMLString(domMap)); 	
			sb.append("</episodeOfCare>");		
		}
		if (this.getPrescribingHCP() != null)
		{
			sb.append("<prescribingHCP>");
			sb.append(this.getPrescribingHCP().toXMLString(domMap)); 	
			sb.append("</prescribingHCP>");		
		}
		if (this.getPrescribedDate() != null)
		{
			sb.append("<prescribedDate>");
			sb.append(new ims.framework.utils.DateTime(this.getPrescribedDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</prescribedDate>");		
		}
		if (this.getAssociatedTreatmentPlanAction() != null)
		{
			sb.append("<associatedTreatmentPlanAction>");
			sb.append(this.getAssociatedTreatmentPlanAction().toXMLString(domMap)); 	
			sb.append("</associatedTreatmentPlanAction>");		
		}
		if (this.getHRG() != null)
		{
			sb.append("<hRG>");
			sb.append(this.getHRG().toXMLString()); 
			sb.append("</hRG>");		
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
			RadiotherapyDetails domainObject = getRadiotherapyDetailsfromXML(itemEl, factory, domMap);

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
			RadiotherapyDetails domainObject = getRadiotherapyDetailsfromXML(itemEl, factory, domMap);

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
		
	public static RadiotherapyDetails getRadiotherapyDetailsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getRadiotherapyDetailsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static RadiotherapyDetails getRadiotherapyDetailsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!RadiotherapyDetails.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!RadiotherapyDetails.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the RadiotherapyDetails class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (RadiotherapyDetails)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(RadiotherapyDetails.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		RadiotherapyDetails ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (RadiotherapyDetails)factory.getImportedDomainObject(RadiotherapyDetails.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new RadiotherapyDetails();
		}
		String keyClassName = "RadiotherapyDetails";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (RadiotherapyDetails)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, RadiotherapyDetails obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("radiotherapyType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setRadiotherapyType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("treatingHospital");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTreatingHospital(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("treatingConsultant");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTreatingConsultant(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("dateDecisionToTreat");
		if(fldEl != null)
		{	
    		obj.setDateDecisionToTreat(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("performanceStatusAtDDT");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPerformanceStatusAtDDT(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("anatomicalTreatmentSite");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAnatomicalTreatmentSite(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("treatementIntent");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTreatementIntent(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("prescribedDose");
		if(fldEl != null)
		{	
    		obj.setPrescribedDose(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("prescribedFractions");
		if(fldEl != null)
		{	
    		obj.setPrescribedFractions(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("prescribedDuration");
		if(fldEl != null)
		{	
    		obj.setPrescribedDuration(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("concurrentChemotherapy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setConcurrentChemotherapy(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("startDate");
		if(fldEl != null)
		{	
    		obj.setStartDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("endDate");
		if(fldEl != null)
		{	
    		obj.setEndDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("treatmentCategory");
		if(fldEl != null)
		{	
    		obj.setTreatmentCategory(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("diseaseStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDiseaseStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("diseaseTreatment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDiseaseTreatment(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("reasonDelay1");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReasonDelay1(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("reasonDelay2");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReasonDelay2(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("treatmentCourseStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTreatmentCourseStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("teletherapyDetails");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTeletherapyDetails(ims.oncology.domain.objects.TeletherapyDetails.getTeletherapyDetailsfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("brachytherapyDetails");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setBrachytherapyDetails(ims.oncology.domain.objects.BrachytherapyDetails.getBrachytherapyDetailsfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("authoringInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("episodeOfCare");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setEpisodeOfCare(ims.core.admin.domain.objects.EpisodeOfCare.getEpisodeOfCarefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("prescribingHCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPrescribingHCP(ims.core.resource.people.domain.objects.Medic.getMedicfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("prescribedDate");
		if(fldEl != null)
		{	
    		obj.setPrescribedDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("associatedTreatmentPlanAction");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAssociatedTreatmentPlanAction(ims.oncology.domain.objects.PatAction.getPatActionfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("hRG");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setHRG(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
		public static final String CareContext = "careContext";
		public static final String RadiotherapyType = "radiotherapyType";
		public static final String TreatingHospital = "treatingHospital";
		public static final String TreatingConsultant = "treatingConsultant";
		public static final String DateDecisionToTreat = "dateDecisionToTreat";
		public static final String PerformanceStatusAtDDT = "performanceStatusAtDDT";
		public static final String AnatomicalTreatmentSite = "anatomicalTreatmentSite";
		public static final String TreatementIntent = "treatementIntent";
		public static final String PrescribedDose = "prescribedDose";
		public static final String PrescribedFractions = "prescribedFractions";
		public static final String PrescribedDuration = "prescribedDuration";
		public static final String ConcurrentChemotherapy = "concurrentChemotherapy";
		public static final String StartDate = "startDate";
		public static final String EndDate = "endDate";
		public static final String TreatmentCategory = "treatmentCategory";
		public static final String DiseaseStatus = "diseaseStatus";
		public static final String DiseaseTreatment = "diseaseTreatment";
		public static final String ReasonDelay1 = "reasonDelay1";
		public static final String ReasonDelay2 = "reasonDelay2";
		public static final String TreatmentCourseStatus = "treatmentCourseStatus";
		public static final String TeletherapyDetails = "teletherapyDetails";
		public static final String BrachytherapyDetails = "brachytherapyDetails";
		public static final String AuthoringInformation = "authoringInformation";
		public static final String EpisodeOfCare = "episodeOfCare";
		public static final String PrescribingHCP = "prescribingHCP";
		public static final String PrescribedDate = "prescribedDate";
		public static final String AssociatedTreatmentPlanAction = "associatedTreatmentPlanAction";
		public static final String HRG = "hRG";
	}
}

