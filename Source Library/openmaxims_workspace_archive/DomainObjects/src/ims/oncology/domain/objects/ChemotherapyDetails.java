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


public class ChemotherapyDetails extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1074100004;
	private static final long serialVersionUID = 1074100004L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** CareContext */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** SACT Programme Nr */
	private Integer programmeNr;
	/** SACT Regimen Nr */
	private Integer regimenNr;
	/** Treatment Hospital */
	private ims.domain.lookups.LookupInstance treatmentSite;
	/** Treating Consultant */
	private ims.core.resource.people.domain.objects.Hcp treatingConsultant;
	/** DateDecisionToTreat */
	private java.util.Date dateDecisionToTreat;
	/** Drug Treatment Type */
	private ims.domain.lookups.LookupInstance drugTherapyType;
	/** Cancer Treatement Intent */
	private ims.domain.lookups.LookupInstance cancerTreatementIntent;
	/** Height Value in Cm */
	private java.lang.Float heightValueCM;
	/** Weight Value in Kg */
	private java.lang.Float weightValueKG;
	/** PreTreatSurfaceArea */
	private java.lang.Float preTreatSurfaceArea;
	/** CreatinineClearance */
	private java.lang.Float creatinineClearance;
	/** Performance Status at DDT */
	private ims.domain.lookups.LookupInstance performanceStatus;
	/** Comorbidity Adjustment? */
	private ims.domain.lookups.LookupInstance comorbidityAdjustment;
	/** Chemo-Radiation? */
	private ims.domain.lookups.LookupInstance chemoRadiation;
	/** Clinical Trial? */
	private ims.domain.lookups.LookupInstance clinicalTrial;
	/** Regimen Acronym */
	private ims.domain.lookups.LookupInstance regimenAcronym;
	/** Course Start Date */
	private java.util.Date startDate;
	/** Course End Date */
	private java.util.Date endDate;
	/** Treatment Response */
	private ims.domain.lookups.LookupInstance treatmentResponse;
	/** Treatment Change Reason */
	private ims.domain.lookups.LookupInstance txChangeReason;
	/** Delay Reason 1 */
	private ims.domain.lookups.LookupInstance delayReason1;
	/** Delay Reason 2 */
	private ims.domain.lookups.LookupInstance delayReason2;
	/** Nr of cycles planned */
	private Integer plannedCycles;
	/** AuthoringInfo */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInfo;
	/** Outcome - Regimen modification - dose reduction */
	private ims.domain.lookups.LookupInstance outcomeDoseReduction;
	/** Outcome - Regimen modification - time delay */
	private ims.domain.lookups.LookupInstance outcomeTimeDelay;
	/** Outcome - Regimen modification - stopped early */
	private ims.domain.lookups.LookupInstance outcomeStoppedEarly;
	/** Outcome - Regimen Summary */
	private ims.domain.lookups.LookupInstance outcomeSummary;
	/** Episode of Care */
	private ims.core.admin.domain.objects.EpisodeOfCare episodeOfCare;
	/** Cycle Details
	  * Collection of ims.oncology.domain.objects.ChemotherapyCycleDetails.
	  */
	private java.util.List cycleDetails;
	/** CCOCycleDetails
	  * Collection of ims.oncology.domain.objects.ChemoCycleDetailsCCO.
	  */
	private java.util.List cCOCycleDetails;
	/** Status */
	private ims.domain.lookups.LookupInstance status;
	/** Prescribing HCP */
	private ims.core.resource.people.domain.objects.Medic prescribingHCP;
	/** Prescribed Date */
	private java.util.Date prescribedDate;
	/** AssociatedTreatmentPlanAction */
	private ims.oncology.domain.objects.PatAction associatedTreatmentPlanAction;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ChemotherapyDetails (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ChemotherapyDetails ()
    {
    	super();
    }
    public ChemotherapyDetails (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.oncology.domain.objects.ChemotherapyDetails.class;
	}


	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public Integer getProgrammeNr() {
		return programmeNr;
	}
	public void setProgrammeNr(Integer programmeNr) {
		this.programmeNr = programmeNr;
	}

	public Integer getRegimenNr() {
		return regimenNr;
	}
	public void setRegimenNr(Integer regimenNr) {
		this.regimenNr = regimenNr;
	}

	public ims.domain.lookups.LookupInstance getTreatmentSite() {
		return treatmentSite;
	}
	public void setTreatmentSite(ims.domain.lookups.LookupInstance treatmentSite) {
		this.treatmentSite = treatmentSite;
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

	public ims.domain.lookups.LookupInstance getDrugTherapyType() {
		return drugTherapyType;
	}
	public void setDrugTherapyType(ims.domain.lookups.LookupInstance drugTherapyType) {
		this.drugTherapyType = drugTherapyType;
	}

	public ims.domain.lookups.LookupInstance getCancerTreatementIntent() {
		return cancerTreatementIntent;
	}
	public void setCancerTreatementIntent(ims.domain.lookups.LookupInstance cancerTreatementIntent) {
		this.cancerTreatementIntent = cancerTreatementIntent;
	}

	public java.lang.Float getHeightValueCM() {
		return heightValueCM;
	}
	public void setHeightValueCM(java.lang.Float heightValueCM) {
		this.heightValueCM = heightValueCM;
	}

	public java.lang.Float getWeightValueKG() {
		return weightValueKG;
	}
	public void setWeightValueKG(java.lang.Float weightValueKG) {
		this.weightValueKG = weightValueKG;
	}

	public java.lang.Float getPreTreatSurfaceArea() {
		return preTreatSurfaceArea;
	}
	public void setPreTreatSurfaceArea(java.lang.Float preTreatSurfaceArea) {
		this.preTreatSurfaceArea = preTreatSurfaceArea;
	}

	public java.lang.Float getCreatinineClearance() {
		return creatinineClearance;
	}
	public void setCreatinineClearance(java.lang.Float creatinineClearance) {
		this.creatinineClearance = creatinineClearance;
	}

	public ims.domain.lookups.LookupInstance getPerformanceStatus() {
		return performanceStatus;
	}
	public void setPerformanceStatus(ims.domain.lookups.LookupInstance performanceStatus) {
		this.performanceStatus = performanceStatus;
	}

	public ims.domain.lookups.LookupInstance getComorbidityAdjustment() {
		return comorbidityAdjustment;
	}
	public void setComorbidityAdjustment(ims.domain.lookups.LookupInstance comorbidityAdjustment) {
		this.comorbidityAdjustment = comorbidityAdjustment;
	}

	public ims.domain.lookups.LookupInstance getChemoRadiation() {
		return chemoRadiation;
	}
	public void setChemoRadiation(ims.domain.lookups.LookupInstance chemoRadiation) {
		this.chemoRadiation = chemoRadiation;
	}

	public ims.domain.lookups.LookupInstance getClinicalTrial() {
		return clinicalTrial;
	}
	public void setClinicalTrial(ims.domain.lookups.LookupInstance clinicalTrial) {
		this.clinicalTrial = clinicalTrial;
	}

	public ims.domain.lookups.LookupInstance getRegimenAcronym() {
		return regimenAcronym;
	}
	public void setRegimenAcronym(ims.domain.lookups.LookupInstance regimenAcronym) {
		this.regimenAcronym = regimenAcronym;
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

	public ims.domain.lookups.LookupInstance getTreatmentResponse() {
		return treatmentResponse;
	}
	public void setTreatmentResponse(ims.domain.lookups.LookupInstance treatmentResponse) {
		this.treatmentResponse = treatmentResponse;
	}

	public ims.domain.lookups.LookupInstance getTxChangeReason() {
		return txChangeReason;
	}
	public void setTxChangeReason(ims.domain.lookups.LookupInstance txChangeReason) {
		this.txChangeReason = txChangeReason;
	}

	public ims.domain.lookups.LookupInstance getDelayReason1() {
		return delayReason1;
	}
	public void setDelayReason1(ims.domain.lookups.LookupInstance delayReason1) {
		this.delayReason1 = delayReason1;
	}

	public ims.domain.lookups.LookupInstance getDelayReason2() {
		return delayReason2;
	}
	public void setDelayReason2(ims.domain.lookups.LookupInstance delayReason2) {
		this.delayReason2 = delayReason2;
	}

	public Integer getPlannedCycles() {
		return plannedCycles;
	}
	public void setPlannedCycles(Integer plannedCycles) {
		this.plannedCycles = plannedCycles;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getAuthoringInfo() {
		return authoringInfo;
	}
	public void setAuthoringInfo(ims.core.clinical.domain.objects.AuthoringInformation authoringInfo) {
		this.authoringInfo = authoringInfo;
	}

	public ims.domain.lookups.LookupInstance getOutcomeDoseReduction() {
		return outcomeDoseReduction;
	}
	public void setOutcomeDoseReduction(ims.domain.lookups.LookupInstance outcomeDoseReduction) {
		this.outcomeDoseReduction = outcomeDoseReduction;
	}

	public ims.domain.lookups.LookupInstance getOutcomeTimeDelay() {
		return outcomeTimeDelay;
	}
	public void setOutcomeTimeDelay(ims.domain.lookups.LookupInstance outcomeTimeDelay) {
		this.outcomeTimeDelay = outcomeTimeDelay;
	}

	public ims.domain.lookups.LookupInstance getOutcomeStoppedEarly() {
		return outcomeStoppedEarly;
	}
	public void setOutcomeStoppedEarly(ims.domain.lookups.LookupInstance outcomeStoppedEarly) {
		this.outcomeStoppedEarly = outcomeStoppedEarly;
	}

	public ims.domain.lookups.LookupInstance getOutcomeSummary() {
		return outcomeSummary;
	}
	public void setOutcomeSummary(ims.domain.lookups.LookupInstance outcomeSummary) {
		this.outcomeSummary = outcomeSummary;
	}

	public ims.core.admin.domain.objects.EpisodeOfCare getEpisodeOfCare() {
		return episodeOfCare;
	}
	public void setEpisodeOfCare(ims.core.admin.domain.objects.EpisodeOfCare episodeOfCare) {
		this.episodeOfCare = episodeOfCare;
	}

	public java.util.List getCycleDetails() {
		if ( null == cycleDetails ) {
			cycleDetails = new java.util.ArrayList();
		}
		return cycleDetails;
	}
	public void setCycleDetails(java.util.List paramValue) {
		this.cycleDetails = paramValue;
	}

	public java.util.List getCCOCycleDetails() {
		if ( null == cCOCycleDetails ) {
			cCOCycleDetails = new java.util.ArrayList();
		}
		return cCOCycleDetails;
	}
	public void setCCOCycleDetails(java.util.List paramValue) {
		this.cCOCycleDetails = paramValue;
	}

	public ims.domain.lookups.LookupInstance getStatus() {
		return status;
	}
	public void setStatus(ims.domain.lookups.LookupInstance status) {
		this.status = status;
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
		auditStr.append("\r\n*programmeNr* :");
		auditStr.append(programmeNr);
	    auditStr.append("; ");
		auditStr.append("\r\n*regimenNr* :");
		auditStr.append(regimenNr);
	    auditStr.append("; ");
		auditStr.append("\r\n*treatmentSite* :");
		if (treatmentSite != null)
			auditStr.append(treatmentSite.getText());
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
		auditStr.append("\r\n*drugTherapyType* :");
		if (drugTherapyType != null)
			auditStr.append(drugTherapyType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*cancerTreatementIntent* :");
		if (cancerTreatementIntent != null)
			auditStr.append(cancerTreatementIntent.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*heightValueCM* :");
		auditStr.append(heightValueCM);
	    auditStr.append("; ");
		auditStr.append("\r\n*weightValueKG* :");
		auditStr.append(weightValueKG);
	    auditStr.append("; ");
		auditStr.append("\r\n*preTreatSurfaceArea* :");
		auditStr.append(preTreatSurfaceArea);
	    auditStr.append("; ");
		auditStr.append("\r\n*creatinineClearance* :");
		auditStr.append(creatinineClearance);
	    auditStr.append("; ");
		auditStr.append("\r\n*performanceStatus* :");
		if (performanceStatus != null)
			auditStr.append(performanceStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*comorbidityAdjustment* :");
		if (comorbidityAdjustment != null)
			auditStr.append(comorbidityAdjustment.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*chemoRadiation* :");
		if (chemoRadiation != null)
			auditStr.append(chemoRadiation.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*clinicalTrial* :");
		if (clinicalTrial != null)
			auditStr.append(clinicalTrial.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*regimenAcronym* :");
		if (regimenAcronym != null)
			auditStr.append(regimenAcronym.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*startDate* :");
		auditStr.append(startDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*endDate* :");
		auditStr.append(endDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*treatmentResponse* :");
		if (treatmentResponse != null)
			auditStr.append(treatmentResponse.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*txChangeReason* :");
		if (txChangeReason != null)
			auditStr.append(txChangeReason.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*delayReason1* :");
		if (delayReason1 != null)
			auditStr.append(delayReason1.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*delayReason2* :");
		if (delayReason2 != null)
			auditStr.append(delayReason2.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*plannedCycles* :");
		auditStr.append(plannedCycles);
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringInfo* :");
		if (authoringInfo != null)
		{
			auditStr.append(toShortClassName(authoringInfo));
				
		    auditStr.append(authoringInfo.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*outcomeDoseReduction* :");
		if (outcomeDoseReduction != null)
			auditStr.append(outcomeDoseReduction.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*outcomeTimeDelay* :");
		if (outcomeTimeDelay != null)
			auditStr.append(outcomeTimeDelay.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*outcomeStoppedEarly* :");
		if (outcomeStoppedEarly != null)
			auditStr.append(outcomeStoppedEarly.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*outcomeSummary* :");
		if (outcomeSummary != null)
			auditStr.append(outcomeSummary.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*episodeOfCare* :");
		if (episodeOfCare != null)
		{
			auditStr.append(toShortClassName(episodeOfCare));
				
		    auditStr.append(episodeOfCare.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*cycleDetails* :");
		if (cycleDetails != null)
		{
		int i31=0;
		for (i31=0; i31<cycleDetails.size(); i31++)
		{
			if (i31 > 0)
				auditStr.append(",");
			ims.oncology.domain.objects.ChemotherapyCycleDetails obj = (ims.oncology.domain.objects.ChemotherapyCycleDetails)cycleDetails.get(i31);
		    if (obj != null)
			{
				if (i31 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i31 > 0)
			auditStr.append("] " + i31);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*cCOCycleDetails* :");
		if (cCOCycleDetails != null)
		{
		int i32=0;
		for (i32=0; i32<cCOCycleDetails.size(); i32++)
		{
			if (i32 > 0)
				auditStr.append(",");
			ims.oncology.domain.objects.ChemoCycleDetailsCCO obj = (ims.oncology.domain.objects.ChemoCycleDetailsCCO)cCOCycleDetails.get(i32);
		    if (obj != null)
			{
				if (i32 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i32 > 0)
			auditStr.append("] " + i32);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*status* :");
		if (status != null)
			auditStr.append(status.getText());
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
		
		String keyClassName = "ChemotherapyDetails";
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
		if (this.getProgrammeNr() != null)
		{
			sb.append("<programmeNr>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getProgrammeNr().toString()));
			sb.append("</programmeNr>");		
		}
		if (this.getRegimenNr() != null)
		{
			sb.append("<regimenNr>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRegimenNr().toString()));
			sb.append("</regimenNr>");		
		}
		if (this.getTreatmentSite() != null)
		{
			sb.append("<treatmentSite>");
			sb.append(this.getTreatmentSite().toXMLString()); 
			sb.append("</treatmentSite>");		
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
		if (this.getDrugTherapyType() != null)
		{
			sb.append("<drugTherapyType>");
			sb.append(this.getDrugTherapyType().toXMLString()); 
			sb.append("</drugTherapyType>");		
		}
		if (this.getCancerTreatementIntent() != null)
		{
			sb.append("<cancerTreatementIntent>");
			sb.append(this.getCancerTreatementIntent().toXMLString()); 
			sb.append("</cancerTreatementIntent>");		
		}
		if (this.getHeightValueCM() != null)
		{
			sb.append("<heightValueCM>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getHeightValueCM().toString()));
			sb.append("</heightValueCM>");		
		}
		if (this.getWeightValueKG() != null)
		{
			sb.append("<weightValueKG>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getWeightValueKG().toString()));
			sb.append("</weightValueKG>");		
		}
		if (this.getPreTreatSurfaceArea() != null)
		{
			sb.append("<preTreatSurfaceArea>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPreTreatSurfaceArea().toString()));
			sb.append("</preTreatSurfaceArea>");		
		}
		if (this.getCreatinineClearance() != null)
		{
			sb.append("<creatinineClearance>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCreatinineClearance().toString()));
			sb.append("</creatinineClearance>");		
		}
		if (this.getPerformanceStatus() != null)
		{
			sb.append("<performanceStatus>");
			sb.append(this.getPerformanceStatus().toXMLString()); 
			sb.append("</performanceStatus>");		
		}
		if (this.getComorbidityAdjustment() != null)
		{
			sb.append("<comorbidityAdjustment>");
			sb.append(this.getComorbidityAdjustment().toXMLString()); 
			sb.append("</comorbidityAdjustment>");		
		}
		if (this.getChemoRadiation() != null)
		{
			sb.append("<chemoRadiation>");
			sb.append(this.getChemoRadiation().toXMLString()); 
			sb.append("</chemoRadiation>");		
		}
		if (this.getClinicalTrial() != null)
		{
			sb.append("<clinicalTrial>");
			sb.append(this.getClinicalTrial().toXMLString()); 
			sb.append("</clinicalTrial>");		
		}
		if (this.getRegimenAcronym() != null)
		{
			sb.append("<regimenAcronym>");
			sb.append(this.getRegimenAcronym().toXMLString()); 
			sb.append("</regimenAcronym>");		
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
		if (this.getTreatmentResponse() != null)
		{
			sb.append("<treatmentResponse>");
			sb.append(this.getTreatmentResponse().toXMLString()); 
			sb.append("</treatmentResponse>");		
		}
		if (this.getTxChangeReason() != null)
		{
			sb.append("<txChangeReason>");
			sb.append(this.getTxChangeReason().toXMLString()); 
			sb.append("</txChangeReason>");		
		}
		if (this.getDelayReason1() != null)
		{
			sb.append("<delayReason1>");
			sb.append(this.getDelayReason1().toXMLString()); 
			sb.append("</delayReason1>");		
		}
		if (this.getDelayReason2() != null)
		{
			sb.append("<delayReason2>");
			sb.append(this.getDelayReason2().toXMLString()); 
			sb.append("</delayReason2>");		
		}
		if (this.getPlannedCycles() != null)
		{
			sb.append("<plannedCycles>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPlannedCycles().toString()));
			sb.append("</plannedCycles>");		
		}
		if (this.getAuthoringInfo() != null)
		{
			sb.append("<authoringInfo>");
			sb.append(this.getAuthoringInfo().toXMLString(domMap)); 	
			sb.append("</authoringInfo>");		
		}
		if (this.getOutcomeDoseReduction() != null)
		{
			sb.append("<outcomeDoseReduction>");
			sb.append(this.getOutcomeDoseReduction().toXMLString()); 
			sb.append("</outcomeDoseReduction>");		
		}
		if (this.getOutcomeTimeDelay() != null)
		{
			sb.append("<outcomeTimeDelay>");
			sb.append(this.getOutcomeTimeDelay().toXMLString()); 
			sb.append("</outcomeTimeDelay>");		
		}
		if (this.getOutcomeStoppedEarly() != null)
		{
			sb.append("<outcomeStoppedEarly>");
			sb.append(this.getOutcomeStoppedEarly().toXMLString()); 
			sb.append("</outcomeStoppedEarly>");		
		}
		if (this.getOutcomeSummary() != null)
		{
			sb.append("<outcomeSummary>");
			sb.append(this.getOutcomeSummary().toXMLString()); 
			sb.append("</outcomeSummary>");		
		}
		if (this.getEpisodeOfCare() != null)
		{
			sb.append("<episodeOfCare>");
			sb.append(this.getEpisodeOfCare().toXMLString(domMap)); 	
			sb.append("</episodeOfCare>");		
		}
		if (this.getCycleDetails() != null)
		{
			if (this.getCycleDetails().size() > 0 )
			{
			sb.append("<cycleDetails>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getCycleDetails(), domMap));
			sb.append("</cycleDetails>");		
			}
		}
		if (this.getCCOCycleDetails() != null)
		{
			if (this.getCCOCycleDetails().size() > 0 )
			{
			sb.append("<cCOCycleDetails>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getCCOCycleDetails(), domMap));
			sb.append("</cCOCycleDetails>");		
			}
		}
		if (this.getStatus() != null)
		{
			sb.append("<status>");
			sb.append(this.getStatus().toXMLString()); 
			sb.append("</status>");		
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
			ChemotherapyDetails domainObject = getChemotherapyDetailsfromXML(itemEl, factory, domMap);

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
			ChemotherapyDetails domainObject = getChemotherapyDetailsfromXML(itemEl, factory, domMap);

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
		
	public static ChemotherapyDetails getChemotherapyDetailsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getChemotherapyDetailsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ChemotherapyDetails getChemotherapyDetailsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ChemotherapyDetails.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ChemotherapyDetails.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ChemotherapyDetails class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ChemotherapyDetails)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ChemotherapyDetails.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ChemotherapyDetails ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ChemotherapyDetails)factory.getImportedDomainObject(ChemotherapyDetails.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ChemotherapyDetails();
		}
		String keyClassName = "ChemotherapyDetails";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ChemotherapyDetails)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ChemotherapyDetails obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("programmeNr");
		if(fldEl != null)
		{	
    		obj.setProgrammeNr(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("regimenNr");
		if(fldEl != null)
		{	
    		obj.setRegimenNr(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("treatmentSite");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTreatmentSite(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
		fldEl = el.element("drugTherapyType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDrugTherapyType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("cancerTreatementIntent");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCancerTreatementIntent(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("heightValueCM");
		if(fldEl != null)
		{	
    		obj.setHeightValueCM(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("weightValueKG");
		if(fldEl != null)
		{	
    		obj.setWeightValueKG(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("preTreatSurfaceArea");
		if(fldEl != null)
		{	
    		obj.setPreTreatSurfaceArea(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("creatinineClearance");
		if(fldEl != null)
		{	
    		obj.setCreatinineClearance(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("performanceStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPerformanceStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("comorbidityAdjustment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setComorbidityAdjustment(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("chemoRadiation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setChemoRadiation(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("clinicalTrial");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setClinicalTrial(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("regimenAcronym");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setRegimenAcronym(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
		fldEl = el.element("treatmentResponse");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTreatmentResponse(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("txChangeReason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTxChangeReason(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("delayReason1");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDelayReason1(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("delayReason2");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDelayReason2(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("plannedCycles");
		if(fldEl != null)
		{	
    		obj.setPlannedCycles(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("authoringInfo");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringInfo(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("outcomeDoseReduction");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setOutcomeDoseReduction(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("outcomeTimeDelay");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setOutcomeTimeDelay(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("outcomeStoppedEarly");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setOutcomeStoppedEarly(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("outcomeSummary");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setOutcomeSummary(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("episodeOfCare");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setEpisodeOfCare(ims.core.admin.domain.objects.EpisodeOfCare.getEpisodeOfCarefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("cycleDetails");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setCycleDetails(ims.oncology.domain.objects.ChemotherapyCycleDetails.fromListXMLString(fldEl, factory, obj.getCycleDetails(), domMap));
		}
		fldEl = el.element("cCOCycleDetails");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setCCOCycleDetails(ims.oncology.domain.objects.ChemoCycleDetailsCCO.fromListXMLString(fldEl, factory, obj.getCCOCycleDetails(), domMap));
		}
		fldEl = el.element("status");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "cycleDetails"
		, "cCOCycleDetails"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String CareContext = "careContext";
		public static final String ProgrammeNr = "programmeNr";
		public static final String RegimenNr = "regimenNr";
		public static final String TreatmentSite = "treatmentSite";
		public static final String TreatingConsultant = "treatingConsultant";
		public static final String DateDecisionToTreat = "dateDecisionToTreat";
		public static final String DrugTherapyType = "drugTherapyType";
		public static final String CancerTreatementIntent = "cancerTreatementIntent";
		public static final String HeightValueCM = "heightValueCM";
		public static final String WeightValueKG = "weightValueKG";
		public static final String PreTreatSurfaceArea = "preTreatSurfaceArea";
		public static final String CreatinineClearance = "creatinineClearance";
		public static final String PerformanceStatus = "performanceStatus";
		public static final String ComorbidityAdjustment = "comorbidityAdjustment";
		public static final String ChemoRadiation = "chemoRadiation";
		public static final String ClinicalTrial = "clinicalTrial";
		public static final String RegimenAcronym = "regimenAcronym";
		public static final String StartDate = "startDate";
		public static final String EndDate = "endDate";
		public static final String TreatmentResponse = "treatmentResponse";
		public static final String TxChangeReason = "txChangeReason";
		public static final String DelayReason1 = "delayReason1";
		public static final String DelayReason2 = "delayReason2";
		public static final String PlannedCycles = "plannedCycles";
		public static final String AuthoringInfo = "authoringInfo";
		public static final String OutcomeDoseReduction = "outcomeDoseReduction";
		public static final String OutcomeTimeDelay = "outcomeTimeDelay";
		public static final String OutcomeStoppedEarly = "outcomeStoppedEarly";
		public static final String OutcomeSummary = "outcomeSummary";
		public static final String EpisodeOfCare = "episodeOfCare";
		public static final String CycleDetails = "cycleDetails";
		public static final String CCOCycleDetails = "cCOCycleDetails";
		public static final String Status = "status";
		public static final String PrescribingHCP = "prescribingHCP";
		public static final String PrescribedDate = "prescribedDate";
		public static final String AssociatedTreatmentPlanAction = "associatedTreatmentPlanAction";
	}
}

