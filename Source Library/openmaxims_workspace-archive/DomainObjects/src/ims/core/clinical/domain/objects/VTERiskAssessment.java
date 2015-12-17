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
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class VTERiskAssessment extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1072100100;
	private static final long serialVersionUID = 1072100100L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Patient */
	private ims.core.patient.domain.objects.Patient patient;
	/** CareContext */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** AuthoringInformation */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInformation;
	/** RecordingInformation */
	private ims.core.clinical.domain.objects.RecordingUserInformation recordingInformation;
	/** VTE Assessment Status */
	private ims.domain.lookups.LookupInstance vTEAssessmentStatus;
	/** CompletedBy */
	private ims.core.clinical.domain.objects.RecordingUserInformation completedBy;
	/** Medical Patient Not expected to have reduced  mobility relative to normal  state */
	private ims.domain.lookups.LookupInstance notExpectedReducedMobility;
	/** Active Cancer */
	private ims.domain.lookups.LookupInstance activeCancer;
	/** Active AgeOverSixtyCancer */
	private ims.domain.lookups.LookupInstance ageOverSixty;
	/** Dehydration */
	private ims.domain.lookups.LookupInstance dehydration;
	/** Known Thrombophilias */
	private ims.domain.lookups.LookupInstance knownThrombophilias;
	/** Obesity */
	private ims.domain.lookups.LookupInstance obesity;
	/** Significant Morbidities */
	private ims.domain.lookups.LookupInstance significantMorbidities;
	/** History of VTE */
	private ims.domain.lookups.LookupInstance historyOfVTE;
	/** Use of HRT */
	private ims.domain.lookups.LookupInstance useOfHRT;
	/** Use Of Ostogren */
	private ims.domain.lookups.LookupInstance useOfOstogren;
	/** Varicose Veins */
	private ims.domain.lookups.LookupInstance varicoseVeins;
	/** Pregnancy */
	private ims.domain.lookups.LookupInstance pregnancy;
	/** Reduced Mobility */
	private ims.domain.lookups.LookupInstance reducedMobility;
	/** Critical Care Admission */
	private ims.domain.lookups.LookupInstance criticalCareAdmission;
	/** Hip or Knee Replacement */
	private ims.domain.lookups.LookupInstance hipKneeReplacement;
	/** Hip Fracture */
	private ims.domain.lookups.LookupInstance hipFracture;
	/** Anaesthetic And Surgery */
	private ims.domain.lookups.LookupInstance anaestheticAndSurgery;
	/** Acute Surgical Admission */
	private ims.domain.lookups.LookupInstance acuteSurgicalAdmission;
	/** Surgery Significant Mobility Reduction */
	private ims.domain.lookups.LookupInstance surgerySignificantMobilityReduction;
	/** Pregnancy */
	private ims.domain.lookups.LookupInstance activeBleeding;
	/** Acquired Bleeding */
	private ims.domain.lookups.LookupInstance acquiredBleeding;
	/** Concurrent Anticoagulants */
	private ims.domain.lookups.LookupInstance concurrentAnticoagulants;
	/** Uncontrolled Hypertension */
	private ims.domain.lookups.LookupInstance uncontrolledHypertension;
	/** Thrombocytopenia */
	private ims.domain.lookups.LookupInstance thrombocytopenia;
	/** Acute Stroke */
	private ims.domain.lookups.LookupInstance acuteStroke;
	/** Untreated Bleeding Disorder */
	private ims.domain.lookups.LookupInstance untreatedBleedingDisorder;
	/** Neuro Spinal Eye Surgery */
	private ims.domain.lookups.LookupInstance neuroSpinalEyeSurgery;
	/** Other Procedure With High Bleeding Risk */
	private ims.domain.lookups.LookupInstance otherProcedureWithHighBleedingRisk;
	/** Lumbar Puncture Within Next 12 hrs */
	private ims.domain.lookups.LookupInstance lumbarPunctureWithinNext12hrs;
	/** Lumbar Puncture Previous 4hrs */
	private ims.domain.lookups.LookupInstance lumbarPuncturePrevious4hrs;
	/** Risk Group */
	private ims.domain.lookups.LookupInstance riskGroup;
	/** Prophylaxis Offered */
	private ims.domain.lookups.LookupInstance prophylaxisOffered;
	/** Surgery involving lower limb or pelvis with total anaesthetic + surgical time > 60 mins */
	private ims.domain.lookups.LookupInstance surgeryLowerLimbPelvis60mins;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public VTERiskAssessment (Integer id, int ver)
    {
    	super(id, ver);
    }
    public VTERiskAssessment ()
    {
    	super();
    }
    public VTERiskAssessment (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.clinical.domain.objects.VTERiskAssessment.class;
	}


	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getAuthoringInformation() {
		return authoringInformation;
	}
	public void setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation authoringInformation) {
		this.authoringInformation = authoringInformation;
	}

	public ims.core.clinical.domain.objects.RecordingUserInformation getRecordingInformation() {
		return recordingInformation;
	}
	public void setRecordingInformation(ims.core.clinical.domain.objects.RecordingUserInformation recordingInformation) {
		this.recordingInformation = recordingInformation;
	}

	public ims.domain.lookups.LookupInstance getVTEAssessmentStatus() {
		return vTEAssessmentStatus;
	}
	public void setVTEAssessmentStatus(ims.domain.lookups.LookupInstance vTEAssessmentStatus) {
		this.vTEAssessmentStatus = vTEAssessmentStatus;
	}

	public ims.core.clinical.domain.objects.RecordingUserInformation getCompletedBy() {
		return completedBy;
	}
	public void setCompletedBy(ims.core.clinical.domain.objects.RecordingUserInformation completedBy) {
		this.completedBy = completedBy;
	}

	public ims.domain.lookups.LookupInstance getNotExpectedReducedMobility() {
		return notExpectedReducedMobility;
	}
	public void setNotExpectedReducedMobility(ims.domain.lookups.LookupInstance notExpectedReducedMobility) {
		this.notExpectedReducedMobility = notExpectedReducedMobility;
	}

	public ims.domain.lookups.LookupInstance getActiveCancer() {
		return activeCancer;
	}
	public void setActiveCancer(ims.domain.lookups.LookupInstance activeCancer) {
		this.activeCancer = activeCancer;
	}

	public ims.domain.lookups.LookupInstance getAgeOverSixty() {
		return ageOverSixty;
	}
	public void setAgeOverSixty(ims.domain.lookups.LookupInstance ageOverSixty) {
		this.ageOverSixty = ageOverSixty;
	}

	public ims.domain.lookups.LookupInstance getDehydration() {
		return dehydration;
	}
	public void setDehydration(ims.domain.lookups.LookupInstance dehydration) {
		this.dehydration = dehydration;
	}

	public ims.domain.lookups.LookupInstance getKnownThrombophilias() {
		return knownThrombophilias;
	}
	public void setKnownThrombophilias(ims.domain.lookups.LookupInstance knownThrombophilias) {
		this.knownThrombophilias = knownThrombophilias;
	}

	public ims.domain.lookups.LookupInstance getObesity() {
		return obesity;
	}
	public void setObesity(ims.domain.lookups.LookupInstance obesity) {
		this.obesity = obesity;
	}

	public ims.domain.lookups.LookupInstance getSignificantMorbidities() {
		return significantMorbidities;
	}
	public void setSignificantMorbidities(ims.domain.lookups.LookupInstance significantMorbidities) {
		this.significantMorbidities = significantMorbidities;
	}

	public ims.domain.lookups.LookupInstance getHistoryOfVTE() {
		return historyOfVTE;
	}
	public void setHistoryOfVTE(ims.domain.lookups.LookupInstance historyOfVTE) {
		this.historyOfVTE = historyOfVTE;
	}

	public ims.domain.lookups.LookupInstance getUseOfHRT() {
		return useOfHRT;
	}
	public void setUseOfHRT(ims.domain.lookups.LookupInstance useOfHRT) {
		this.useOfHRT = useOfHRT;
	}

	public ims.domain.lookups.LookupInstance getUseOfOstogren() {
		return useOfOstogren;
	}
	public void setUseOfOstogren(ims.domain.lookups.LookupInstance useOfOstogren) {
		this.useOfOstogren = useOfOstogren;
	}

	public ims.domain.lookups.LookupInstance getVaricoseVeins() {
		return varicoseVeins;
	}
	public void setVaricoseVeins(ims.domain.lookups.LookupInstance varicoseVeins) {
		this.varicoseVeins = varicoseVeins;
	}

	public ims.domain.lookups.LookupInstance getPregnancy() {
		return pregnancy;
	}
	public void setPregnancy(ims.domain.lookups.LookupInstance pregnancy) {
		this.pregnancy = pregnancy;
	}

	public ims.domain.lookups.LookupInstance getReducedMobility() {
		return reducedMobility;
	}
	public void setReducedMobility(ims.domain.lookups.LookupInstance reducedMobility) {
		this.reducedMobility = reducedMobility;
	}

	public ims.domain.lookups.LookupInstance getCriticalCareAdmission() {
		return criticalCareAdmission;
	}
	public void setCriticalCareAdmission(ims.domain.lookups.LookupInstance criticalCareAdmission) {
		this.criticalCareAdmission = criticalCareAdmission;
	}

	public ims.domain.lookups.LookupInstance getHipKneeReplacement() {
		return hipKneeReplacement;
	}
	public void setHipKneeReplacement(ims.domain.lookups.LookupInstance hipKneeReplacement) {
		this.hipKneeReplacement = hipKneeReplacement;
	}

	public ims.domain.lookups.LookupInstance getHipFracture() {
		return hipFracture;
	}
	public void setHipFracture(ims.domain.lookups.LookupInstance hipFracture) {
		this.hipFracture = hipFracture;
	}

	public ims.domain.lookups.LookupInstance getAnaestheticAndSurgery() {
		return anaestheticAndSurgery;
	}
	public void setAnaestheticAndSurgery(ims.domain.lookups.LookupInstance anaestheticAndSurgery) {
		this.anaestheticAndSurgery = anaestheticAndSurgery;
	}

	public ims.domain.lookups.LookupInstance getAcuteSurgicalAdmission() {
		return acuteSurgicalAdmission;
	}
	public void setAcuteSurgicalAdmission(ims.domain.lookups.LookupInstance acuteSurgicalAdmission) {
		this.acuteSurgicalAdmission = acuteSurgicalAdmission;
	}

	public ims.domain.lookups.LookupInstance getSurgerySignificantMobilityReduction() {
		return surgerySignificantMobilityReduction;
	}
	public void setSurgerySignificantMobilityReduction(ims.domain.lookups.LookupInstance surgerySignificantMobilityReduction) {
		this.surgerySignificantMobilityReduction = surgerySignificantMobilityReduction;
	}

	public ims.domain.lookups.LookupInstance getActiveBleeding() {
		return activeBleeding;
	}
	public void setActiveBleeding(ims.domain.lookups.LookupInstance activeBleeding) {
		this.activeBleeding = activeBleeding;
	}

	public ims.domain.lookups.LookupInstance getAcquiredBleeding() {
		return acquiredBleeding;
	}
	public void setAcquiredBleeding(ims.domain.lookups.LookupInstance acquiredBleeding) {
		this.acquiredBleeding = acquiredBleeding;
	}

	public ims.domain.lookups.LookupInstance getConcurrentAnticoagulants() {
		return concurrentAnticoagulants;
	}
	public void setConcurrentAnticoagulants(ims.domain.lookups.LookupInstance concurrentAnticoagulants) {
		this.concurrentAnticoagulants = concurrentAnticoagulants;
	}

	public ims.domain.lookups.LookupInstance getUncontrolledHypertension() {
		return uncontrolledHypertension;
	}
	public void setUncontrolledHypertension(ims.domain.lookups.LookupInstance uncontrolledHypertension) {
		this.uncontrolledHypertension = uncontrolledHypertension;
	}

	public ims.domain.lookups.LookupInstance getThrombocytopenia() {
		return thrombocytopenia;
	}
	public void setThrombocytopenia(ims.domain.lookups.LookupInstance thrombocytopenia) {
		this.thrombocytopenia = thrombocytopenia;
	}

	public ims.domain.lookups.LookupInstance getAcuteStroke() {
		return acuteStroke;
	}
	public void setAcuteStroke(ims.domain.lookups.LookupInstance acuteStroke) {
		this.acuteStroke = acuteStroke;
	}

	public ims.domain.lookups.LookupInstance getUntreatedBleedingDisorder() {
		return untreatedBleedingDisorder;
	}
	public void setUntreatedBleedingDisorder(ims.domain.lookups.LookupInstance untreatedBleedingDisorder) {
		this.untreatedBleedingDisorder = untreatedBleedingDisorder;
	}

	public ims.domain.lookups.LookupInstance getNeuroSpinalEyeSurgery() {
		return neuroSpinalEyeSurgery;
	}
	public void setNeuroSpinalEyeSurgery(ims.domain.lookups.LookupInstance neuroSpinalEyeSurgery) {
		this.neuroSpinalEyeSurgery = neuroSpinalEyeSurgery;
	}

	public ims.domain.lookups.LookupInstance getOtherProcedureWithHighBleedingRisk() {
		return otherProcedureWithHighBleedingRisk;
	}
	public void setOtherProcedureWithHighBleedingRisk(ims.domain.lookups.LookupInstance otherProcedureWithHighBleedingRisk) {
		this.otherProcedureWithHighBleedingRisk = otherProcedureWithHighBleedingRisk;
	}

	public ims.domain.lookups.LookupInstance getLumbarPunctureWithinNext12hrs() {
		return lumbarPunctureWithinNext12hrs;
	}
	public void setLumbarPunctureWithinNext12hrs(ims.domain.lookups.LookupInstance lumbarPunctureWithinNext12hrs) {
		this.lumbarPunctureWithinNext12hrs = lumbarPunctureWithinNext12hrs;
	}

	public ims.domain.lookups.LookupInstance getLumbarPuncturePrevious4hrs() {
		return lumbarPuncturePrevious4hrs;
	}
	public void setLumbarPuncturePrevious4hrs(ims.domain.lookups.LookupInstance lumbarPuncturePrevious4hrs) {
		this.lumbarPuncturePrevious4hrs = lumbarPuncturePrevious4hrs;
	}

	public ims.domain.lookups.LookupInstance getRiskGroup() {
		return riskGroup;
	}
	public void setRiskGroup(ims.domain.lookups.LookupInstance riskGroup) {
		this.riskGroup = riskGroup;
	}

	public ims.domain.lookups.LookupInstance getProphylaxisOffered() {
		return prophylaxisOffered;
	}
	public void setProphylaxisOffered(ims.domain.lookups.LookupInstance prophylaxisOffered) {
		this.prophylaxisOffered = prophylaxisOffered;
	}

	public ims.domain.lookups.LookupInstance getSurgeryLowerLimbPelvis60mins() {
		return surgeryLowerLimbPelvis60mins;
	}
	public void setSurgeryLowerLimbPelvis60mins(ims.domain.lookups.LookupInstance surgeryLowerLimbPelvis60mins) {
		this.surgeryLowerLimbPelvis60mins = surgeryLowerLimbPelvis60mins;
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
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringInformation* :");
		if (authoringInformation != null)
		{
			auditStr.append(toShortClassName(authoringInformation));
				
		    auditStr.append(authoringInformation.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*recordingInformation* :");
		if (recordingInformation != null)
		{
			auditStr.append(toShortClassName(recordingInformation));
				
		    auditStr.append(recordingInformation.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*vTEAssessmentStatus* :");
		if (vTEAssessmentStatus != null)
			auditStr.append(vTEAssessmentStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*completedBy* :");
		if (completedBy != null)
		{
			auditStr.append(toShortClassName(completedBy));
				
		    auditStr.append(completedBy.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*notExpectedReducedMobility* :");
		if (notExpectedReducedMobility != null)
			auditStr.append(notExpectedReducedMobility.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*activeCancer* :");
		if (activeCancer != null)
			auditStr.append(activeCancer.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*ageOverSixty* :");
		if (ageOverSixty != null)
			auditStr.append(ageOverSixty.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*dehydration* :");
		if (dehydration != null)
			auditStr.append(dehydration.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*knownThrombophilias* :");
		if (knownThrombophilias != null)
			auditStr.append(knownThrombophilias.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*obesity* :");
		if (obesity != null)
			auditStr.append(obesity.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*significantMorbidities* :");
		if (significantMorbidities != null)
			auditStr.append(significantMorbidities.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*historyOfVTE* :");
		if (historyOfVTE != null)
			auditStr.append(historyOfVTE.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*useOfHRT* :");
		if (useOfHRT != null)
			auditStr.append(useOfHRT.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*useOfOstogren* :");
		if (useOfOstogren != null)
			auditStr.append(useOfOstogren.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*varicoseVeins* :");
		if (varicoseVeins != null)
			auditStr.append(varicoseVeins.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*pregnancy* :");
		if (pregnancy != null)
			auditStr.append(pregnancy.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*reducedMobility* :");
		if (reducedMobility != null)
			auditStr.append(reducedMobility.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*criticalCareAdmission* :");
		if (criticalCareAdmission != null)
			auditStr.append(criticalCareAdmission.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*hipKneeReplacement* :");
		if (hipKneeReplacement != null)
			auditStr.append(hipKneeReplacement.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*hipFracture* :");
		if (hipFracture != null)
			auditStr.append(hipFracture.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*anaestheticAndSurgery* :");
		if (anaestheticAndSurgery != null)
			auditStr.append(anaestheticAndSurgery.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*acuteSurgicalAdmission* :");
		if (acuteSurgicalAdmission != null)
			auditStr.append(acuteSurgicalAdmission.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*surgerySignificantMobilityReduction* :");
		if (surgerySignificantMobilityReduction != null)
			auditStr.append(surgerySignificantMobilityReduction.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*activeBleeding* :");
		if (activeBleeding != null)
			auditStr.append(activeBleeding.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*acquiredBleeding* :");
		if (acquiredBleeding != null)
			auditStr.append(acquiredBleeding.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*concurrentAnticoagulants* :");
		if (concurrentAnticoagulants != null)
			auditStr.append(concurrentAnticoagulants.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*uncontrolledHypertension* :");
		if (uncontrolledHypertension != null)
			auditStr.append(uncontrolledHypertension.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*thrombocytopenia* :");
		if (thrombocytopenia != null)
			auditStr.append(thrombocytopenia.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*acuteStroke* :");
		if (acuteStroke != null)
			auditStr.append(acuteStroke.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*untreatedBleedingDisorder* :");
		if (untreatedBleedingDisorder != null)
			auditStr.append(untreatedBleedingDisorder.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*neuroSpinalEyeSurgery* :");
		if (neuroSpinalEyeSurgery != null)
			auditStr.append(neuroSpinalEyeSurgery.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*otherProcedureWithHighBleedingRisk* :");
		if (otherProcedureWithHighBleedingRisk != null)
			auditStr.append(otherProcedureWithHighBleedingRisk.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*lumbarPunctureWithinNext12hrs* :");
		if (lumbarPunctureWithinNext12hrs != null)
			auditStr.append(lumbarPunctureWithinNext12hrs.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*lumbarPuncturePrevious4hrs* :");
		if (lumbarPuncturePrevious4hrs != null)
			auditStr.append(lumbarPuncturePrevious4hrs.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*riskGroup* :");
		if (riskGroup != null)
			auditStr.append(riskGroup.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*prophylaxisOffered* :");
		if (prophylaxisOffered != null)
			auditStr.append(prophylaxisOffered.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*surgeryLowerLimbPelvis60mins* :");
		if (surgeryLowerLimbPelvis60mins != null)
			auditStr.append(surgeryLowerLimbPelvis60mins.getText());
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
		
		String keyClassName = "VTERiskAssessment";
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
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
		}
		if (this.getAuthoringInformation() != null)
		{
			sb.append("<authoringInformation>");
			sb.append(this.getAuthoringInformation().toXMLString(domMap)); 	
			sb.append("</authoringInformation>");		
		}
		if (this.getRecordingInformation() != null)
		{
			sb.append("<recordingInformation>");
			sb.append(this.getRecordingInformation().toXMLString(domMap)); 	
			sb.append("</recordingInformation>");		
		}
		if (this.getVTEAssessmentStatus() != null)
		{
			sb.append("<vTEAssessmentStatus>");
			sb.append(this.getVTEAssessmentStatus().toXMLString()); 
			sb.append("</vTEAssessmentStatus>");		
		}
		if (this.getCompletedBy() != null)
		{
			sb.append("<completedBy>");
			sb.append(this.getCompletedBy().toXMLString(domMap)); 	
			sb.append("</completedBy>");		
		}
		if (this.getNotExpectedReducedMobility() != null)
		{
			sb.append("<notExpectedReducedMobility>");
			sb.append(this.getNotExpectedReducedMobility().toXMLString()); 
			sb.append("</notExpectedReducedMobility>");		
		}
		if (this.getActiveCancer() != null)
		{
			sb.append("<activeCancer>");
			sb.append(this.getActiveCancer().toXMLString()); 
			sb.append("</activeCancer>");		
		}
		if (this.getAgeOverSixty() != null)
		{
			sb.append("<ageOverSixty>");
			sb.append(this.getAgeOverSixty().toXMLString()); 
			sb.append("</ageOverSixty>");		
		}
		if (this.getDehydration() != null)
		{
			sb.append("<dehydration>");
			sb.append(this.getDehydration().toXMLString()); 
			sb.append("</dehydration>");		
		}
		if (this.getKnownThrombophilias() != null)
		{
			sb.append("<knownThrombophilias>");
			sb.append(this.getKnownThrombophilias().toXMLString()); 
			sb.append("</knownThrombophilias>");		
		}
		if (this.getObesity() != null)
		{
			sb.append("<obesity>");
			sb.append(this.getObesity().toXMLString()); 
			sb.append("</obesity>");		
		}
		if (this.getSignificantMorbidities() != null)
		{
			sb.append("<significantMorbidities>");
			sb.append(this.getSignificantMorbidities().toXMLString()); 
			sb.append("</significantMorbidities>");		
		}
		if (this.getHistoryOfVTE() != null)
		{
			sb.append("<historyOfVTE>");
			sb.append(this.getHistoryOfVTE().toXMLString()); 
			sb.append("</historyOfVTE>");		
		}
		if (this.getUseOfHRT() != null)
		{
			sb.append("<useOfHRT>");
			sb.append(this.getUseOfHRT().toXMLString()); 
			sb.append("</useOfHRT>");		
		}
		if (this.getUseOfOstogren() != null)
		{
			sb.append("<useOfOstogren>");
			sb.append(this.getUseOfOstogren().toXMLString()); 
			sb.append("</useOfOstogren>");		
		}
		if (this.getVaricoseVeins() != null)
		{
			sb.append("<varicoseVeins>");
			sb.append(this.getVaricoseVeins().toXMLString()); 
			sb.append("</varicoseVeins>");		
		}
		if (this.getPregnancy() != null)
		{
			sb.append("<pregnancy>");
			sb.append(this.getPregnancy().toXMLString()); 
			sb.append("</pregnancy>");		
		}
		if (this.getReducedMobility() != null)
		{
			sb.append("<reducedMobility>");
			sb.append(this.getReducedMobility().toXMLString()); 
			sb.append("</reducedMobility>");		
		}
		if (this.getCriticalCareAdmission() != null)
		{
			sb.append("<criticalCareAdmission>");
			sb.append(this.getCriticalCareAdmission().toXMLString()); 
			sb.append("</criticalCareAdmission>");		
		}
		if (this.getHipKneeReplacement() != null)
		{
			sb.append("<hipKneeReplacement>");
			sb.append(this.getHipKneeReplacement().toXMLString()); 
			sb.append("</hipKneeReplacement>");		
		}
		if (this.getHipFracture() != null)
		{
			sb.append("<hipFracture>");
			sb.append(this.getHipFracture().toXMLString()); 
			sb.append("</hipFracture>");		
		}
		if (this.getAnaestheticAndSurgery() != null)
		{
			sb.append("<anaestheticAndSurgery>");
			sb.append(this.getAnaestheticAndSurgery().toXMLString()); 
			sb.append("</anaestheticAndSurgery>");		
		}
		if (this.getAcuteSurgicalAdmission() != null)
		{
			sb.append("<acuteSurgicalAdmission>");
			sb.append(this.getAcuteSurgicalAdmission().toXMLString()); 
			sb.append("</acuteSurgicalAdmission>");		
		}
		if (this.getSurgerySignificantMobilityReduction() != null)
		{
			sb.append("<surgerySignificantMobilityReduction>");
			sb.append(this.getSurgerySignificantMobilityReduction().toXMLString()); 
			sb.append("</surgerySignificantMobilityReduction>");		
		}
		if (this.getActiveBleeding() != null)
		{
			sb.append("<activeBleeding>");
			sb.append(this.getActiveBleeding().toXMLString()); 
			sb.append("</activeBleeding>");		
		}
		if (this.getAcquiredBleeding() != null)
		{
			sb.append("<acquiredBleeding>");
			sb.append(this.getAcquiredBleeding().toXMLString()); 
			sb.append("</acquiredBleeding>");		
		}
		if (this.getConcurrentAnticoagulants() != null)
		{
			sb.append("<concurrentAnticoagulants>");
			sb.append(this.getConcurrentAnticoagulants().toXMLString()); 
			sb.append("</concurrentAnticoagulants>");		
		}
		if (this.getUncontrolledHypertension() != null)
		{
			sb.append("<uncontrolledHypertension>");
			sb.append(this.getUncontrolledHypertension().toXMLString()); 
			sb.append("</uncontrolledHypertension>");		
		}
		if (this.getThrombocytopenia() != null)
		{
			sb.append("<thrombocytopenia>");
			sb.append(this.getThrombocytopenia().toXMLString()); 
			sb.append("</thrombocytopenia>");		
		}
		if (this.getAcuteStroke() != null)
		{
			sb.append("<acuteStroke>");
			sb.append(this.getAcuteStroke().toXMLString()); 
			sb.append("</acuteStroke>");		
		}
		if (this.getUntreatedBleedingDisorder() != null)
		{
			sb.append("<untreatedBleedingDisorder>");
			sb.append(this.getUntreatedBleedingDisorder().toXMLString()); 
			sb.append("</untreatedBleedingDisorder>");		
		}
		if (this.getNeuroSpinalEyeSurgery() != null)
		{
			sb.append("<neuroSpinalEyeSurgery>");
			sb.append(this.getNeuroSpinalEyeSurgery().toXMLString()); 
			sb.append("</neuroSpinalEyeSurgery>");		
		}
		if (this.getOtherProcedureWithHighBleedingRisk() != null)
		{
			sb.append("<otherProcedureWithHighBleedingRisk>");
			sb.append(this.getOtherProcedureWithHighBleedingRisk().toXMLString()); 
			sb.append("</otherProcedureWithHighBleedingRisk>");		
		}
		if (this.getLumbarPunctureWithinNext12hrs() != null)
		{
			sb.append("<lumbarPunctureWithinNext12hrs>");
			sb.append(this.getLumbarPunctureWithinNext12hrs().toXMLString()); 
			sb.append("</lumbarPunctureWithinNext12hrs>");		
		}
		if (this.getLumbarPuncturePrevious4hrs() != null)
		{
			sb.append("<lumbarPuncturePrevious4hrs>");
			sb.append(this.getLumbarPuncturePrevious4hrs().toXMLString()); 
			sb.append("</lumbarPuncturePrevious4hrs>");		
		}
		if (this.getRiskGroup() != null)
		{
			sb.append("<riskGroup>");
			sb.append(this.getRiskGroup().toXMLString()); 
			sb.append("</riskGroup>");		
		}
		if (this.getProphylaxisOffered() != null)
		{
			sb.append("<prophylaxisOffered>");
			sb.append(this.getProphylaxisOffered().toXMLString()); 
			sb.append("</prophylaxisOffered>");		
		}
		if (this.getSurgeryLowerLimbPelvis60mins() != null)
		{
			sb.append("<surgeryLowerLimbPelvis60mins>");
			sb.append(this.getSurgeryLowerLimbPelvis60mins().toXMLString()); 
			sb.append("</surgeryLowerLimbPelvis60mins>");		
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
			VTERiskAssessment domainObject = getVTERiskAssessmentfromXML(itemEl, factory, domMap);

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
			VTERiskAssessment domainObject = getVTERiskAssessmentfromXML(itemEl, factory, domMap);

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
		
	public static VTERiskAssessment getVTERiskAssessmentfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getVTERiskAssessmentfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static VTERiskAssessment getVTERiskAssessmentfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!VTERiskAssessment.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!VTERiskAssessment.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the VTERiskAssessment class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (VTERiskAssessment)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(VTERiskAssessment.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		VTERiskAssessment ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (VTERiskAssessment)factory.getImportedDomainObject(VTERiskAssessment.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new VTERiskAssessment();
		}
		String keyClassName = "VTERiskAssessment";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (VTERiskAssessment)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, VTERiskAssessment obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("authoringInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("recordingInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRecordingInformation(ims.core.clinical.domain.objects.RecordingUserInformation.getRecordingUserInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("vTEAssessmentStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setVTEAssessmentStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("completedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCompletedBy(ims.core.clinical.domain.objects.RecordingUserInformation.getRecordingUserInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("notExpectedReducedMobility");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setNotExpectedReducedMobility(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("activeCancer");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setActiveCancer(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("ageOverSixty");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAgeOverSixty(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("dehydration");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDehydration(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("knownThrombophilias");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setKnownThrombophilias(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("obesity");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setObesity(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("significantMorbidities");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSignificantMorbidities(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("historyOfVTE");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setHistoryOfVTE(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("useOfHRT");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setUseOfHRT(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("useOfOstogren");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setUseOfOstogren(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("varicoseVeins");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setVaricoseVeins(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("pregnancy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPregnancy(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("reducedMobility");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReducedMobility(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("criticalCareAdmission");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCriticalCareAdmission(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("hipKneeReplacement");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setHipKneeReplacement(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("hipFracture");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setHipFracture(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("anaestheticAndSurgery");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAnaestheticAndSurgery(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("acuteSurgicalAdmission");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAcuteSurgicalAdmission(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("surgerySignificantMobilityReduction");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSurgerySignificantMobilityReduction(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("activeBleeding");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setActiveBleeding(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("acquiredBleeding");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAcquiredBleeding(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("concurrentAnticoagulants");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setConcurrentAnticoagulants(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("uncontrolledHypertension");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setUncontrolledHypertension(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("thrombocytopenia");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setThrombocytopenia(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("acuteStroke");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAcuteStroke(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("untreatedBleedingDisorder");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setUntreatedBleedingDisorder(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("neuroSpinalEyeSurgery");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setNeuroSpinalEyeSurgery(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("otherProcedureWithHighBleedingRisk");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setOtherProcedureWithHighBleedingRisk(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("lumbarPunctureWithinNext12hrs");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setLumbarPunctureWithinNext12hrs(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("lumbarPuncturePrevious4hrs");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setLumbarPuncturePrevious4hrs(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("riskGroup");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setRiskGroup(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("prophylaxisOffered");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setProphylaxisOffered(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("surgeryLowerLimbPelvis60mins");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSurgeryLowerLimbPelvis60mins(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
		public static final String CareContext = "careContext";
		public static final String AuthoringInformation = "authoringInformation";
		public static final String RecordingInformation = "recordingInformation";
		public static final String VTEAssessmentStatus = "vTEAssessmentStatus";
		public static final String CompletedBy = "completedBy";
		public static final String NotExpectedReducedMobility = "notExpectedReducedMobility";
		public static final String ActiveCancer = "activeCancer";
		public static final String AgeOverSixty = "ageOverSixty";
		public static final String Dehydration = "dehydration";
		public static final String KnownThrombophilias = "knownThrombophilias";
		public static final String Obesity = "obesity";
		public static final String SignificantMorbidities = "significantMorbidities";
		public static final String HistoryOfVTE = "historyOfVTE";
		public static final String UseOfHRT = "useOfHRT";
		public static final String UseOfOstogren = "useOfOstogren";
		public static final String VaricoseVeins = "varicoseVeins";
		public static final String Pregnancy = "pregnancy";
		public static final String ReducedMobility = "reducedMobility";
		public static final String CriticalCareAdmission = "criticalCareAdmission";
		public static final String HipKneeReplacement = "hipKneeReplacement";
		public static final String HipFracture = "hipFracture";
		public static final String AnaestheticAndSurgery = "anaestheticAndSurgery";
		public static final String AcuteSurgicalAdmission = "acuteSurgicalAdmission";
		public static final String SurgerySignificantMobilityReduction = "surgerySignificantMobilityReduction";
		public static final String ActiveBleeding = "activeBleeding";
		public static final String AcquiredBleeding = "acquiredBleeding";
		public static final String ConcurrentAnticoagulants = "concurrentAnticoagulants";
		public static final String UncontrolledHypertension = "uncontrolledHypertension";
		public static final String Thrombocytopenia = "thrombocytopenia";
		public static final String AcuteStroke = "acuteStroke";
		public static final String UntreatedBleedingDisorder = "untreatedBleedingDisorder";
		public static final String NeuroSpinalEyeSurgery = "neuroSpinalEyeSurgery";
		public static final String OtherProcedureWithHighBleedingRisk = "otherProcedureWithHighBleedingRisk";
		public static final String LumbarPunctureWithinNext12hrs = "lumbarPunctureWithinNext12hrs";
		public static final String LumbarPuncturePrevious4hrs = "lumbarPuncturePrevious4hrs";
		public static final String RiskGroup = "riskGroup";
		public static final String ProphylaxisOffered = "prophylaxisOffered";
		public static final String SurgeryLowerLimbPelvis60mins = "surgeryLowerLimbPelvis60mins";
	}
}

