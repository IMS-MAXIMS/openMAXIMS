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
 * This code was generated.
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated: 16/04/2014, 12:38
 */
package ims.spinalinjuries.vo.lookups;

import ims.domain.lookups.LookupService;

/**
 * This is a generated interface.
 * Provides methods to get the ValueObject Lookup types of this namespace.
 * 
 */
public final class LookupHelper {
	public static UltrasoundFreqCollection getUltrasoundFreq(LookupService lookupService) {
		UltrasoundFreqCollection collection =
			(UltrasoundFreqCollection) lookupService.getLookupCollection(UltrasoundFreq.TYPE_ID, 
				UltrasoundFreqCollection.class, UltrasoundFreq.class);
		return collection;
	}

	public static UltrasoundFreq getUltrasoundFreqInstance(LookupService lookupService, int id) 
	{
		return (UltrasoundFreq)lookupService.getLookupInstance(UltrasoundFreq.class, UltrasoundFreq.TYPE_ID, id);
	}
	

	public static SoftTissueMassageAreaCollection getSoftTissueMassageArea(LookupService lookupService) {
		SoftTissueMassageAreaCollection collection =
			(SoftTissueMassageAreaCollection) lookupService.getLookupCollection(SoftTissueMassageArea.TYPE_ID, 
				SoftTissueMassageAreaCollection.class, SoftTissueMassageArea.class);
		return collection;
	}

	public static SoftTissueMassageArea getSoftTissueMassageAreaInstance(LookupService lookupService, int id) 
	{
		return (SoftTissueMassageArea)lookupService.getLookupInstance(SoftTissueMassageArea.class, SoftTissueMassageArea.TYPE_ID, id);
	}
	

	public static ThermalAreaCollection getThermalArea(LookupService lookupService) {
		ThermalAreaCollection collection =
			(ThermalAreaCollection) lookupService.getLookupCollection(ThermalArea.TYPE_ID, 
				ThermalAreaCollection.class, ThermalArea.class);
		return collection;
	}

	public static ThermalArea getThermalAreaInstance(LookupService lookupService, int id) 
	{
		return (ThermalArea)lookupService.getLookupInstance(ThermalArea.class, ThermalArea.TYPE_ID, id);
	}
	

	public static ThermalTypeCollection getThermalType(LookupService lookupService) {
		ThermalTypeCollection collection =
			(ThermalTypeCollection) lookupService.getLookupCollection(ThermalType.TYPE_ID, 
				ThermalTypeCollection.class, ThermalType.class);
		return collection;
	}

	public static ThermalType getThermalTypeInstance(LookupService lookupService, int id) 
	{
		return (ThermalType)lookupService.getLookupInstance(ThermalType.class, ThermalType.TYPE_ID, id);
	}
	

	public static SplintWearRegimeCollection getSplintWearRegime(LookupService lookupService) {
		SplintWearRegimeCollection collection =
			(SplintWearRegimeCollection) lookupService.getLookupCollection(SplintWearRegime.TYPE_ID, 
				SplintWearRegimeCollection.class, SplintWearRegime.class);
		return collection;
	}

	public static SplintWearRegime getSplintWearRegimeInstance(LookupService lookupService, int id) 
	{
		return (SplintWearRegime)lookupService.getLookupInstance(SplintWearRegime.class, SplintWearRegime.TYPE_ID, id);
	}
	

	public static RemedialTechniqueCollection getRemedialTechnique(LookupService lookupService) {
		RemedialTechniqueCollection collection =
			(RemedialTechniqueCollection) lookupService.getLookupCollection(RemedialTechnique.TYPE_ID, 
				RemedialTechniqueCollection.class, RemedialTechnique.class);
		return collection;
	}

	public static RemedialTechnique getRemedialTechniqueInstance(LookupService lookupService, int id) 
	{
		return (RemedialTechnique)lookupService.getLookupInstance(RemedialTechnique.class, RemedialTechnique.TYPE_ID, id);
	}
	

	public static RemedialSubjectiveObsCollection getRemedialSubjectiveObs(LookupService lookupService) {
		RemedialSubjectiveObsCollection collection =
			(RemedialSubjectiveObsCollection) lookupService.getLookupCollection(RemedialSubjectiveObs.TYPE_ID, 
				RemedialSubjectiveObsCollection.class, RemedialSubjectiveObs.class);
		return collection;
	}

	public static RemedialSubjectiveObs getRemedialSubjectiveObsInstance(LookupService lookupService, int id) 
	{
		return (RemedialSubjectiveObs)lookupService.getLookupInstance(RemedialSubjectiveObs.class, RemedialSubjectiveObs.TYPE_ID, id);
	}
	

	public static RemedialIndependenceCollection getRemedialIndependence(LookupService lookupService) {
		RemedialIndependenceCollection collection =
			(RemedialIndependenceCollection) lookupService.getLookupCollection(RemedialIndependence.TYPE_ID, 
				RemedialIndependenceCollection.class, RemedialIndependence.class);
		return collection;
	}

	public static RemedialIndependence getRemedialIndependenceInstance(LookupService lookupService, int id) 
	{
		return (RemedialIndependence)lookupService.getLookupInstance(RemedialIndependence.class, RemedialIndependence.TYPE_ID, id);
	}
	

	public static RemedialActPositionCollection getRemedialActPosition(LookupService lookupService) {
		RemedialActPositionCollection collection =
			(RemedialActPositionCollection) lookupService.getLookupCollection(RemedialActPosition.TYPE_ID, 
				RemedialActPositionCollection.class, RemedialActPosition.class);
		return collection;
	}

	public static RemedialActPosition getRemedialActPositionInstance(LookupService lookupService, int id) 
	{
		return (RemedialActPosition)lookupService.getLookupInstance(RemedialActPosition.class, RemedialActPosition.TYPE_ID, id);
	}
	

	public static RemedialActivityCollection getRemedialActivity(LookupService lookupService) {
		RemedialActivityCollection collection =
			(RemedialActivityCollection) lookupService.getLookupCollection(RemedialActivity.TYPE_ID, 
				RemedialActivityCollection.class, RemedialActivity.class);
		return collection;
	}

	public static RemedialActivity getRemedialActivityInstance(LookupService lookupService, int id) 
	{
		return (RemedialActivity)lookupService.getLookupInstance(RemedialActivity.class, RemedialActivity.TYPE_ID, id);
	}
	

	public static MaterialCollection getMaterial(LookupService lookupService) {
		MaterialCollection collection =
			(MaterialCollection) lookupService.getLookupCollection(Material.TYPE_ID, 
				MaterialCollection.class, Material.class);
		return collection;
	}

	public static Material getMaterialInstance(LookupService lookupService, int id) 
	{
		return (Material)lookupService.getLookupInstance(Material.class, Material.TYPE_ID, id);
	}
	

	public static RehabIndependenceLevelCollection getRehabIndependenceLevel(LookupService lookupService) {
		RehabIndependenceLevelCollection collection =
			(RehabIndependenceLevelCollection) lookupService.getLookupCollection(RehabIndependenceLevel.TYPE_ID, 
				RehabIndependenceLevelCollection.class, RehabIndependenceLevel.class);
		return collection;
	}

	public static RehabIndependenceLevel getRehabIndependenceLevelInstance(LookupService lookupService, int id) 
	{
		return (RehabIndependenceLevel)lookupService.getLookupInstance(RehabIndependenceLevel.class, RehabIndependenceLevel.TYPE_ID, id);
	}
	

	public static RehabEnvAdaptationCollection getRehabEnvAdaptation(LookupService lookupService) {
		RehabEnvAdaptationCollection collection =
			(RehabEnvAdaptationCollection) lookupService.getLookupCollection(RehabEnvAdaptation.TYPE_ID, 
				RehabEnvAdaptationCollection.class, RehabEnvAdaptation.class);
		return collection;
	}

	public static RehabEnvAdaptation getRehabEnvAdaptationInstance(LookupService lookupService, int id) 
	{
		return (RehabEnvAdaptation)lookupService.getLookupInstance(RehabEnvAdaptation.class, RehabEnvAdaptation.TYPE_ID, id);
	}
	

	public static HydrotherapyEquipmentCollection getHydrotherapyEquipment(LookupService lookupService) {
		HydrotherapyEquipmentCollection collection =
			(HydrotherapyEquipmentCollection) lookupService.getLookupCollection(HydrotherapyEquipment.TYPE_ID, 
				HydrotherapyEquipmentCollection.class, HydrotherapyEquipment.class);
		return collection;
	}

	public static HydrotherapyEquipment getHydrotherapyEquipmentInstance(LookupService lookupService, int id) 
	{
		return (HydrotherapyEquipment)lookupService.getLookupInstance(HydrotherapyEquipment.class, HydrotherapyEquipment.TYPE_ID, id);
	}
	

	public static HydrotherapyModalitiesCollection getHydrotherapyModalities(LookupService lookupService) {
		HydrotherapyModalitiesCollection collection =
			(HydrotherapyModalitiesCollection) lookupService.getLookupCollection(HydrotherapyModalities.TYPE_ID, 
				HydrotherapyModalitiesCollection.class, HydrotherapyModalities.class);
		return collection;
	}

	public static HydrotherapyModalities getHydrotherapyModalitiesInstance(LookupService lookupService, int id) 
	{
		return (HydrotherapyModalities)lookupService.getLookupInstance(HydrotherapyModalities.class, HydrotherapyModalities.TYPE_ID, id);
	}
	

	public static HydrotherapyTransferInCollection getHydrotherapyTransferIn(LookupService lookupService) {
		HydrotherapyTransferInCollection collection =
			(HydrotherapyTransferInCollection) lookupService.getLookupCollection(HydrotherapyTransferIn.TYPE_ID, 
				HydrotherapyTransferInCollection.class, HydrotherapyTransferIn.class);
		return collection;
	}

	public static HydrotherapyTransferIn getHydrotherapyTransferInInstance(LookupService lookupService, int id) 
	{
		return (HydrotherapyTransferIn)lookupService.getLookupInstance(HydrotherapyTransferIn.class, HydrotherapyTransferIn.TYPE_ID, id);
	}
	

	public static HydrotherapyLevelOfAssistanceCollection getHydrotherapyLevelOfAssistance(LookupService lookupService) {
		HydrotherapyLevelOfAssistanceCollection collection =
			(HydrotherapyLevelOfAssistanceCollection) lookupService.getLookupCollection(HydrotherapyLevelOfAssistance.TYPE_ID, 
				HydrotherapyLevelOfAssistanceCollection.class, HydrotherapyLevelOfAssistance.class);
		return collection;
	}

	public static HydrotherapyLevelOfAssistance getHydrotherapyLevelOfAssistanceInstance(LookupService lookupService, int id) 
	{
		return (HydrotherapyLevelOfAssistance)lookupService.getLookupInstance(HydrotherapyLevelOfAssistance.class, HydrotherapyLevelOfAssistance.TYPE_ID, id);
	}
	

	public static ComplementaryTherapyCollection getComplementaryTherapy(LookupService lookupService) {
		ComplementaryTherapyCollection collection =
			(ComplementaryTherapyCollection) lookupService.getLookupCollection(ComplementaryTherapy.TYPE_ID, 
				ComplementaryTherapyCollection.class, ComplementaryTherapy.class);
		return collection;
	}

	public static ComplementaryTherapy getComplementaryTherapyInstance(LookupService lookupService, int id) 
	{
		return (ComplementaryTherapy)lookupService.getLookupInstance(ComplementaryTherapy.class, ComplementaryTherapy.TYPE_ID, id);
	}
	

	public static EnvironmentVisitRoomTypeCollection getEnvironmentVisitRoomType(LookupService lookupService) {
		EnvironmentVisitRoomTypeCollection collection =
			(EnvironmentVisitRoomTypeCollection) lookupService.getLookupCollection(EnvironmentVisitRoomType.TYPE_ID, 
				EnvironmentVisitRoomTypeCollection.class, EnvironmentVisitRoomType.class);
		return collection;
	}

	public static EnvironmentVisitRoomType getEnvironmentVisitRoomTypeInstance(LookupService lookupService, int id) 
	{
		return (EnvironmentVisitRoomType)lookupService.getLookupInstance(EnvironmentVisitRoomType.class, EnvironmentVisitRoomType.TYPE_ID, id);
	}
	

	public static DoorWidthUnitOfMeasurementCollection getDoorWidthUnitOfMeasurement(LookupService lookupService) {
		DoorWidthUnitOfMeasurementCollection collection =
			(DoorWidthUnitOfMeasurementCollection) lookupService.getLookupCollection(DoorWidthUnitOfMeasurement.TYPE_ID, 
				DoorWidthUnitOfMeasurementCollection.class, DoorWidthUnitOfMeasurement.class);
		return collection;
	}

	public static DoorWidthUnitOfMeasurement getDoorWidthUnitOfMeasurementInstance(LookupService lookupService, int id) 
	{
		return (DoorWidthUnitOfMeasurement)lookupService.getLookupInstance(DoorWidthUnitOfMeasurement.class, DoorWidthUnitOfMeasurement.TYPE_ID, id);
	}
	

	public static MSKGroupTypeCollection getMSKGroupType(LookupService lookupService) {
		MSKGroupTypeCollection collection =
			(MSKGroupTypeCollection) lookupService.getLookupCollection(MSKGroupType.TYPE_ID, 
				MSKGroupTypeCollection.class, MSKGroupType.class);
		return collection;
	}

	public static MSKGroupType getMSKGroupTypeInstance(LookupService lookupService, int id) 
	{
		return (MSKGroupType)lookupService.getLookupInstance(MSKGroupType.class, MSKGroupType.TYPE_ID, id);
	}
	

	public static HandMovementsTestsCollection getHandMovementsTests(LookupService lookupService) {
		HandMovementsTestsCollection collection =
			(HandMovementsTestsCollection) lookupService.getLookupCollection(HandMovementsTests.TYPE_ID, 
				HandMovementsTestsCollection.class, HandMovementsTests.class);
		return collection;
	}

	public static HandMovementsTests getHandMovementsTestsInstance(LookupService lookupService, int id) 
	{
		return (HandMovementsTests)lookupService.getLookupInstance(HandMovementsTests.class, HandMovementsTests.TYPE_ID, id);
	}
	

	public static RangeOfMovementActionCollection getRangeOfMovementAction(LookupService lookupService) {
		RangeOfMovementActionCollection collection =
			(RangeOfMovementActionCollection) lookupService.getLookupCollection(RangeOfMovementAction.TYPE_ID, 
				RangeOfMovementActionCollection.class, RangeOfMovementAction.class);
		return collection;
	}

	public static RangeOfMovementAction getRangeOfMovementActionInstance(LookupService lookupService, int id) 
	{
		return (RangeOfMovementAction)lookupService.getLookupInstance(RangeOfMovementAction.class, RangeOfMovementAction.TYPE_ID, id);
	}
	

	public static RangeOfMovementQualitativeRangeCollection getRangeOfMovementQualitativeRange(LookupService lookupService) {
		RangeOfMovementQualitativeRangeCollection collection =
			(RangeOfMovementQualitativeRangeCollection) lookupService.getLookupCollection(RangeOfMovementQualitativeRange.TYPE_ID, 
				RangeOfMovementQualitativeRangeCollection.class, RangeOfMovementQualitativeRange.class);
		return collection;
	}

	public static RangeOfMovementQualitativeRange getRangeOfMovementQualitativeRangeInstance(LookupService lookupService, int id) 
	{
		return (RangeOfMovementQualitativeRange)lookupService.getLookupInstance(RangeOfMovementQualitativeRange.class, RangeOfMovementQualitativeRange.TYPE_ID, id);
	}
	

	public static RangeOfMovementLimitedCollection getRangeOfMovementLimited(LookupService lookupService) {
		RangeOfMovementLimitedCollection collection =
			(RangeOfMovementLimitedCollection) lookupService.getLookupCollection(RangeOfMovementLimited.TYPE_ID, 
				RangeOfMovementLimitedCollection.class, RangeOfMovementLimited.class);
		return collection;
	}

	public static RangeOfMovementLimited getRangeOfMovementLimitedInstance(LookupService lookupService, int id) 
	{
		return (RangeOfMovementLimited)lookupService.getLookupInstance(RangeOfMovementLimited.class, RangeOfMovementLimited.TYPE_ID, id);
	}
	

	public static StrengtheningProgramMovementCollection getStrengtheningProgramMovement(LookupService lookupService) {
		StrengtheningProgramMovementCollection collection =
			(StrengtheningProgramMovementCollection) lookupService.getLookupCollection(StrengtheningProgramMovement.TYPE_ID, 
				StrengtheningProgramMovementCollection.class, StrengtheningProgramMovement.class);
		return collection;
	}

	public static StrengtheningProgramMovement getStrengtheningProgramMovementInstance(LookupService lookupService, int id) 
	{
		return (StrengtheningProgramMovement)lookupService.getLookupInstance(StrengtheningProgramMovement.class, StrengtheningProgramMovement.TYPE_ID, id);
	}
	

	public static RemedialSequenceCollection getRemedialSequence(LookupService lookupService) {
		RemedialSequenceCollection collection =
			(RemedialSequenceCollection) lookupService.getLookupCollection(RemedialSequence.TYPE_ID, 
				RemedialSequenceCollection.class, RemedialSequence.class);
		return collection;
	}

	public static RemedialSequence getRemedialSequenceInstance(LookupService lookupService, int id) 
	{
		return (RemedialSequence)lookupService.getLookupInstance(RemedialSequence.class, RemedialSequence.TYPE_ID, id);
	}
	

	public static SleepApnoeaAnswerCollection getSleepApnoeaAnswer(LookupService lookupService) {
		SleepApnoeaAnswerCollection collection =
			(SleepApnoeaAnswerCollection) lookupService.getLookupCollection(SleepApnoeaAnswer.TYPE_ID, 
				SleepApnoeaAnswerCollection.class, SleepApnoeaAnswer.class);
		return collection;
	}

	public static SleepApnoeaAnswer getSleepApnoeaAnswerInstance(LookupService lookupService, int id) 
	{
		return (SleepApnoeaAnswer)lookupService.getLookupInstance(SleepApnoeaAnswer.class, SleepApnoeaAnswer.TYPE_ID, id);
	}
	

	public static SleepEpworthChanceOfSleepCollection getSleepEpworthChanceOfSleep(LookupService lookupService) {
		SleepEpworthChanceOfSleepCollection collection =
			(SleepEpworthChanceOfSleepCollection) lookupService.getLookupCollection(SleepEpworthChanceOfSleep.TYPE_ID, 
				SleepEpworthChanceOfSleepCollection.class, SleepEpworthChanceOfSleep.class);
		return collection;
	}

	public static SleepEpworthChanceOfSleep getSleepEpworthChanceOfSleepInstance(LookupService lookupService, int id) 
	{
		return (SleepEpworthChanceOfSleep)lookupService.getLookupInstance(SleepEpworthChanceOfSleep.class, SleepEpworthChanceOfSleep.TYPE_ID, id);
	}
	

	public static SleepFindingsCollection getSleepFindings(LookupService lookupService) {
		SleepFindingsCollection collection =
			(SleepFindingsCollection) lookupService.getLookupCollection(SleepFindings.TYPE_ID, 
				SleepFindingsCollection.class, SleepFindings.class);
		return collection;
	}

	public static SleepFindings getSleepFindingsInstance(LookupService lookupService, int id) 
	{
		return (SleepFindings)lookupService.getLookupInstance(SleepFindings.class, SleepFindings.TYPE_ID, id);
	}
	

	public static SleepApnoeaFactorsCollection getSleepApnoeaFactors(LookupService lookupService) {
		SleepApnoeaFactorsCollection collection =
			(SleepApnoeaFactorsCollection) lookupService.getLookupCollection(SleepApnoeaFactors.TYPE_ID, 
				SleepApnoeaFactorsCollection.class, SleepApnoeaFactors.class);
		return collection;
	}

	public static SleepApnoeaFactors getSleepApnoeaFactorsInstance(LookupService lookupService, int id) 
	{
		return (SleepApnoeaFactors)lookupService.getLookupInstance(SleepApnoeaFactors.class, SleepApnoeaFactors.TYPE_ID, id);
	}
	

	public static SpasAssToneQualititativeCollection getSpasAssToneQualititative(LookupService lookupService) {
		SpasAssToneQualititativeCollection collection =
			(SpasAssToneQualititativeCollection) lookupService.getLookupCollection(SpasAssToneQualititative.TYPE_ID, 
				SpasAssToneQualititativeCollection.class, SpasAssToneQualititative.class);
		return collection;
	}

	public static SpasAssToneQualititative getSpasAssToneQualititativeInstance(LookupService lookupService, int id) 
	{
		return (SpasAssToneQualititative)lookupService.getLookupInstance(SpasAssToneQualititative.class, SpasAssToneQualititative.TYPE_ID, id);
	}
	

	public static SleepCognitiveFunctionCollection getSleepCognitiveFunction(LookupService lookupService) {
		SleepCognitiveFunctionCollection collection =
			(SleepCognitiveFunctionCollection) lookupService.getLookupCollection(SleepCognitiveFunction.TYPE_ID, 
				SleepCognitiveFunctionCollection.class, SleepCognitiveFunction.class);
		return collection;
	}

	public static SleepCognitiveFunction getSleepCognitiveFunctionInstance(LookupService lookupService, int id) 
	{
		return (SleepCognitiveFunction)lookupService.getLookupInstance(SleepCognitiveFunction.class, SleepCognitiveFunction.TYPE_ID, id);
	}
	

	public static SleepEpworthScoreCollection getSleepEpworthScore(LookupService lookupService) {
		SleepEpworthScoreCollection collection =
			(SleepEpworthScoreCollection) lookupService.getLookupCollection(SleepEpworthScore.TYPE_ID, 
				SleepEpworthScoreCollection.class, SleepEpworthScore.class);
		return collection;
	}

	public static SleepEpworthScore getSleepEpworthScoreInstance(LookupService lookupService, int id) 
	{
		return (SleepEpworthScore)lookupService.getLookupInstance(SleepEpworthScore.class, SleepEpworthScore.TYPE_ID, id);
	}
	

	public static SleepPulseOximetryCollection getSleepPulseOximetry(LookupService lookupService) {
		SleepPulseOximetryCollection collection =
			(SleepPulseOximetryCollection) lookupService.getLookupCollection(SleepPulseOximetry.TYPE_ID, 
				SleepPulseOximetryCollection.class, SleepPulseOximetry.class);
		return collection;
	}

	public static SleepPulseOximetry getSleepPulseOximetryInstance(LookupService lookupService, int id) 
	{
		return (SleepPulseOximetry)lookupService.getLookupInstance(SleepPulseOximetry.class, SleepPulseOximetry.TYPE_ID, id);
	}
	

	public static SATreatmentGoalStatusCollection getSATreatmentGoalStatus(LookupService lookupService) {
		SATreatmentGoalStatusCollection collection =
			(SATreatmentGoalStatusCollection) lookupService.getLookupCollection(SATreatmentGoalStatus.TYPE_ID, 
				SATreatmentGoalStatusCollection.class, SATreatmentGoalStatus.class);
		return collection;
	}

	public static SATreatmentGoalStatus getSATreatmentGoalStatusInstance(LookupService lookupService, int id) 
	{
		return (SATreatmentGoalStatus)lookupService.getLookupInstance(SATreatmentGoalStatus.class, SATreatmentGoalStatus.TYPE_ID, id);
	}
	

	public static SALimbsCollection getSALimbs(LookupService lookupService) {
		SALimbsCollection collection =
			(SALimbsCollection) lookupService.getLookupCollection(SALimbs.TYPE_ID, 
				SALimbsCollection.class, SALimbs.class);
		return collection;
	}

	public static SALimbs getSALimbsInstance(LookupService lookupService, int id) 
	{
		return (SALimbs)lookupService.getLookupInstance(SALimbs.class, SALimbs.TYPE_ID, id);
	}
	

	public static SABotulinmCollection getSABotulinm(LookupService lookupService) {
		SABotulinmCollection collection =
			(SABotulinmCollection) lookupService.getLookupCollection(SABotulinm.TYPE_ID, 
				SABotulinmCollection.class, SABotulinm.class);
		return collection;
	}

	public static SABotulinm getSABotulinmInstance(LookupService lookupService, int id) 
	{
		return (SABotulinm)lookupService.getLookupInstance(SABotulinm.class, SABotulinm.TYPE_ID, id);
	}
	

	public static SATreatmentPlanCollection getSATreatmentPlan(LookupService lookupService) {
		SATreatmentPlanCollection collection =
			(SATreatmentPlanCollection) lookupService.getLookupCollection(SATreatmentPlan.TYPE_ID, 
				SATreatmentPlanCollection.class, SATreatmentPlan.class);
		return collection;
	}

	public static SATreatmentPlan getSATreatmentPlanInstance(LookupService lookupService, int id) 
	{
		return (SATreatmentPlan)lookupService.getLookupInstance(SATreatmentPlan.class, SATreatmentPlan.TYPE_ID, id);
	}
	

	public static SATreatmentGoalCollection getSATreatmentGoal(LookupService lookupService) {
		SATreatmentGoalCollection collection =
			(SATreatmentGoalCollection) lookupService.getLookupCollection(SATreatmentGoal.TYPE_ID, 
				SATreatmentGoalCollection.class, SATreatmentGoal.class);
		return collection;
	}

	public static SATreatmentGoal getSATreatmentGoalInstance(LookupService lookupService, int id) 
	{
		return (SATreatmentGoal)lookupService.getLookupInstance(SATreatmentGoal.class, SATreatmentGoal.TYPE_ID, id);
	}
	

	public static SystemReviewHeadingsCollection getSystemReviewHeadings(LookupService lookupService) {
		SystemReviewHeadingsCollection collection =
			(SystemReviewHeadingsCollection) lookupService.getLookupCollection(SystemReviewHeadings.TYPE_ID, 
				SystemReviewHeadingsCollection.class, SystemReviewHeadings.class);
		return collection;
	}

	public static SystemReviewHeadings getSystemReviewHeadingsInstance(LookupService lookupService, int id) 
	{
		return (SystemReviewHeadings)lookupService.getLookupInstance(SystemReviewHeadings.class, SystemReviewHeadings.TYPE_ID, id);
	}
	

	public static InjuryClassTypeOfInjuryCollection getInjuryClassTypeOfInjury(LookupService lookupService) {
		InjuryClassTypeOfInjuryCollection collection =
			(InjuryClassTypeOfInjuryCollection) lookupService.getLookupCollection(InjuryClassTypeOfInjury.TYPE_ID, 
				InjuryClassTypeOfInjuryCollection.class, InjuryClassTypeOfInjury.class);
		return collection;
	}

	public static InjuryClassTypeOfInjury getInjuryClassTypeOfInjuryInstance(LookupService lookupService, int id) 
	{
		return (InjuryClassTypeOfInjury)lookupService.getLookupInstance(InjuryClassTypeOfInjury.class, InjuryClassTypeOfInjury.TYPE_ID, id);
	}
	

	public static FCEjaculationCollection getFCEjaculation(LookupService lookupService) {
		FCEjaculationCollection collection =
			(FCEjaculationCollection) lookupService.getLookupCollection(FCEjaculation.TYPE_ID, 
				FCEjaculationCollection.class, FCEjaculation.class);
		return collection;
	}

	public static FCEjaculation getFCEjaculationInstance(LookupService lookupService, int id) 
	{
		return (FCEjaculation)lookupService.getLookupInstance(FCEjaculation.class, FCEjaculation.TYPE_ID, id);
	}
	

	public static NeuroCompleteIncompleteCollection getNeuroCompleteIncomplete(LookupService lookupService) {
		NeuroCompleteIncompleteCollection collection =
			(NeuroCompleteIncompleteCollection) lookupService.getLookupCollection(NeuroCompleteIncomplete.TYPE_ID, 
				NeuroCompleteIncompleteCollection.class, NeuroCompleteIncomplete.class);
		return collection;
	}

	public static NeuroCompleteIncomplete getNeuroCompleteIncompleteInstance(LookupService lookupService, int id) 
	{
		return (NeuroCompleteIncomplete)lookupService.getLookupInstance(NeuroCompleteIncomplete.class, NeuroCompleteIncomplete.TYPE_ID, id);
	}
	

	public static SpinalSyndromeCollection getSpinalSyndrome(LookupService lookupService) {
		SpinalSyndromeCollection collection =
			(SpinalSyndromeCollection) lookupService.getLookupCollection(SpinalSyndrome.TYPE_ID, 
				SpinalSyndromeCollection.class, SpinalSyndrome.class);
		return collection;
	}

	public static SpinalSyndrome getSpinalSyndromeInstance(LookupService lookupService, int id) 
	{
		return (SpinalSyndrome)lookupService.getLookupInstance(SpinalSyndrome.class, SpinalSyndrome.TYPE_ID, id);
	}
	

	public static AsiaGradeCollection getAsiaGrade(LookupService lookupService) {
		AsiaGradeCollection collection =
			(AsiaGradeCollection) lookupService.getLookupCollection(AsiaGrade.TYPE_ID, 
				AsiaGradeCollection.class, AsiaGrade.class);
		return collection;
	}

	public static AsiaGrade getAsiaGradeInstance(LookupService lookupService, int id) 
	{
		return (AsiaGrade)lookupService.getLookupInstance(AsiaGrade.class, AsiaGrade.TYPE_ID, id);
	}
	

	public static EnvironmentalHomeVisitComponentTypeCollection getEnvironmentalHomeVisitComponentType(LookupService lookupService) {
		EnvironmentalHomeVisitComponentTypeCollection collection =
			(EnvironmentalHomeVisitComponentTypeCollection) lookupService.getLookupCollection(EnvironmentalHomeVisitComponentType.TYPE_ID, 
				EnvironmentalHomeVisitComponentTypeCollection.class, EnvironmentalHomeVisitComponentType.class);
		return collection;
	}

	public static EnvironmentalHomeVisitComponentType getEnvironmentalHomeVisitComponentTypeInstance(LookupService lookupService, int id) 
	{
		return (EnvironmentalHomeVisitComponentType)lookupService.getLookupInstance(EnvironmentalHomeVisitComponentType.class, EnvironmentalHomeVisitComponentType.TYPE_ID, id);
	}
	

	public static WheelchairCushionSizeCollection getWheelchairCushionSize(LookupService lookupService) {
		WheelchairCushionSizeCollection collection =
			(WheelchairCushionSizeCollection) lookupService.getLookupCollection(WheelchairCushionSize.TYPE_ID, 
				WheelchairCushionSizeCollection.class, WheelchairCushionSize.class);
		return collection;
	}

	public static WheelchairCushionSize getWheelchairCushionSizeInstance(LookupService lookupService, int id) 
	{
		return (WheelchairCushionSize)lookupService.getLookupInstance(WheelchairCushionSize.class, WheelchairCushionSize.TYPE_ID, id);
	}
	

	public static WheelchairCoverTypeCollection getWheelchairCoverType(LookupService lookupService) {
		WheelchairCoverTypeCollection collection =
			(WheelchairCoverTypeCollection) lookupService.getLookupCollection(WheelchairCoverType.TYPE_ID, 
				WheelchairCoverTypeCollection.class, WheelchairCoverType.class);
		return collection;
	}

	public static WheelchairCoverType getWheelchairCoverTypeInstance(LookupService lookupService, int id) 
	{
		return (WheelchairCoverType)lookupService.getLookupInstance(WheelchairCoverType.class, WheelchairCoverType.TYPE_ID, id);
	}
	

	public static WheelchairCushionCategoryCollection getWheelchairCushionCategory(LookupService lookupService) {
		WheelchairCushionCategoryCollection collection =
			(WheelchairCushionCategoryCollection) lookupService.getLookupCollection(WheelchairCushionCategory.TYPE_ID, 
				WheelchairCushionCategoryCollection.class, WheelchairCushionCategory.class);
		return collection;
	}

	public static WheelchairCushionCategory getWheelchairCushionCategoryInstance(LookupService lookupService, int id) 
	{
		return (WheelchairCushionCategory)lookupService.getLookupInstance(WheelchairCushionCategory.class, WheelchairCushionCategory.TYPE_ID, id);
	}
	

	public static WheelchairFootplatesCollection getWheelchairFootplates(LookupService lookupService) {
		WheelchairFootplatesCollection collection =
			(WheelchairFootplatesCollection) lookupService.getLookupCollection(WheelchairFootplates.TYPE_ID, 
				WheelchairFootplatesCollection.class, WheelchairFootplates.class);
		return collection;
	}

	public static WheelchairFootplates getWheelchairFootplatesInstance(LookupService lookupService, int id) 
	{
		return (WheelchairFootplates)lookupService.getLookupInstance(WheelchairFootplates.class, WheelchairFootplates.TYPE_ID, id);
	}
	

	public static WheelchairFrameCollection getWheelchairFrame(LookupService lookupService) {
		WheelchairFrameCollection collection =
			(WheelchairFrameCollection) lookupService.getLookupCollection(WheelchairFrame.TYPE_ID, 
				WheelchairFrameCollection.class, WheelchairFrame.class);
		return collection;
	}

	public static WheelchairFrame getWheelchairFrameInstance(LookupService lookupService, int id) 
	{
		return (WheelchairFrame)lookupService.getLookupInstance(WheelchairFrame.class, WheelchairFrame.TYPE_ID, id);
	}
	

	public static WheelchairModelCollection getWheelchairModel(LookupService lookupService) {
		WheelchairModelCollection collection =
			(WheelchairModelCollection) lookupService.getLookupCollection(WheelchairModel.TYPE_ID, 
				WheelchairModelCollection.class, WheelchairModel.class);
		return collection;
	}

	public static WheelchairModel getWheelchairModelInstance(LookupService lookupService, int id) 
	{
		return (WheelchairModel)lookupService.getLookupInstance(WheelchairModel.class, WheelchairModel.TYPE_ID, id);
	}
	

	public static WheelchairTypeCollection getWheelchairType(LookupService lookupService) {
		WheelchairTypeCollection collection =
			(WheelchairTypeCollection) lookupService.getLookupCollection(WheelchairType.TYPE_ID, 
				WheelchairTypeCollection.class, WheelchairType.class);
		return collection;
	}

	public static WheelchairType getWheelchairTypeInstance(LookupService lookupService, int id) 
	{
		return (WheelchairType)lookupService.getLookupInstance(WheelchairType.class, WheelchairType.TYPE_ID, id);
	}
	

	public static MskBonesCollection getMskBones(LookupService lookupService) {
		MskBonesCollection collection =
			(MskBonesCollection) lookupService.getLookupCollection(MskBones.TYPE_ID, 
				MskBonesCollection.class, MskBones.class);
		return collection;
	}

	public static MskBones getMskBonesInstance(LookupService lookupService, int id) 
	{
		return (MskBones)lookupService.getLookupInstance(MskBones.class, MskBones.TYPE_ID, id);
	}
	

	public static GeneralFindingsJointCollection getGeneralFindingsJoint(LookupService lookupService) {
		GeneralFindingsJointCollection collection =
			(GeneralFindingsJointCollection) lookupService.getLookupCollection(GeneralFindingsJoint.TYPE_ID, 
				GeneralFindingsJointCollection.class, GeneralFindingsJoint.class);
		return collection;
	}

	public static GeneralFindingsJoint getGeneralFindingsJointInstance(LookupService lookupService, int id) 
	{
		return (GeneralFindingsJoint)lookupService.getLookupInstance(GeneralFindingsJoint.class, GeneralFindingsJoint.TYPE_ID, id);
	}
	

	public static GeneralFindingsBoneCollection getGeneralFindingsBone(LookupService lookupService) {
		GeneralFindingsBoneCollection collection =
			(GeneralFindingsBoneCollection) lookupService.getLookupCollection(GeneralFindingsBone.TYPE_ID, 
				GeneralFindingsBoneCollection.class, GeneralFindingsBone.class);
		return collection;
	}

	public static GeneralFindingsBone getGeneralFindingsBoneInstance(LookupService lookupService, int id) 
	{
		return (GeneralFindingsBone)lookupService.getLookupInstance(GeneralFindingsBone.class, GeneralFindingsBone.TYPE_ID, id);
	}
	

	public static RespExamLungFieldsCollection getRespExamLungFields(LookupService lookupService) {
		RespExamLungFieldsCollection collection =
			(RespExamLungFieldsCollection) lookupService.getLookupCollection(RespExamLungFields.TYPE_ID, 
				RespExamLungFieldsCollection.class, RespExamLungFields.class);
		return collection;
	}

	public static RespExamLungFields getRespExamLungFieldsInstance(LookupService lookupService, int id) 
	{
		return (RespExamLungFields)lookupService.getLookupInstance(RespExamLungFields.class, RespExamLungFields.TYPE_ID, id);
	}
	

	public static RespExamObsTypeFindingCollection getRespExamObsTypeFinding(LookupService lookupService) {
		RespExamObsTypeFindingCollection collection =
			(RespExamObsTypeFindingCollection) lookupService.getLookupCollection(RespExamObsTypeFinding.TYPE_ID, 
				RespExamObsTypeFindingCollection.class, RespExamObsTypeFinding.class);
		return collection;
	}

	public static RespExamObsTypeFinding getRespExamObsTypeFindingInstance(LookupService lookupService, int id) 
	{
		return (RespExamObsTypeFinding)lookupService.getLookupInstance(RespExamObsTypeFinding.class, RespExamObsTypeFinding.TYPE_ID, id);
	}
	

	public static SpineExamInterpretationCollection getSpineExamInterpretation(LookupService lookupService) {
		SpineExamInterpretationCollection collection =
			(SpineExamInterpretationCollection) lookupService.getLookupCollection(SpineExamInterpretation.TYPE_ID, 
				SpineExamInterpretationCollection.class, SpineExamInterpretation.class);
		return collection;
	}

	public static SpineExamInterpretation getSpineExamInterpretationInstance(LookupService lookupService, int id) 
	{
		return (SpineExamInterpretation)lookupService.getLookupInstance(SpineExamInterpretation.class, SpineExamInterpretation.TYPE_ID, id);
	}
	

	public static MSKSenstionModalityCollection getMSKSenstionModality(LookupService lookupService) {
		MSKSenstionModalityCollection collection =
			(MSKSenstionModalityCollection) lookupService.getLookupCollection(MSKSenstionModality.TYPE_ID, 
				MSKSenstionModalityCollection.class, MSKSenstionModality.class);
		return collection;
	}

	public static MSKSenstionModality getMSKSenstionModalityInstance(LookupService lookupService, int id) 
	{
		return (MSKSenstionModality)lookupService.getLookupInstance(MSKSenstionModality.class, MSKSenstionModality.TYPE_ID, id);
	}
	

	public static MSKSensationFrankelGradeCollection getMSKSensationFrankelGrade(LookupService lookupService) {
		MSKSensationFrankelGradeCollection collection =
			(MSKSensationFrankelGradeCollection) lookupService.getLookupCollection(MSKSensationFrankelGrade.TYPE_ID, 
				MSKSensationFrankelGradeCollection.class, MSKSensationFrankelGrade.class);
		return collection;
	}

	public static MSKSensationFrankelGrade getMSKSensationFrankelGradeInstance(LookupService lookupService, int id) 
	{
		return (MSKSensationFrankelGrade)lookupService.getLookupInstance(MSKSensationFrankelGrade.class, MSKSensationFrankelGrade.TYPE_ID, id);
	}
	

	public static NeuroExamPeripheralTestsCollection getNeuroExamPeripheralTests(LookupService lookupService) {
		NeuroExamPeripheralTestsCollection collection =
			(NeuroExamPeripheralTestsCollection) lookupService.getLookupCollection(NeuroExamPeripheralTests.TYPE_ID, 
				NeuroExamPeripheralTestsCollection.class, NeuroExamPeripheralTests.class);
		return collection;
	}

	public static NeuroExamPeripheralTests getNeuroExamPeripheralTestsInstance(LookupService lookupService, int id) 
	{
		return (NeuroExamPeripheralTests)lookupService.getLookupInstance(NeuroExamPeripheralTests.class, NeuroExamPeripheralTests.TYPE_ID, id);
	}
	

	public static MskBonesJointFindingsCollection getMskBonesJointFindings(LookupService lookupService) {
		MskBonesJointFindingsCollection collection =
			(MskBonesJointFindingsCollection) lookupService.getLookupCollection(MskBonesJointFindings.TYPE_ID, 
				MskBonesJointFindingsCollection.class, MskBonesJointFindings.class);
		return collection;
	}

	public static MskBonesJointFindings getMskBonesJointFindingsInstance(LookupService lookupService, int id) 
	{
		return (MskBonesJointFindings)lookupService.getLookupInstance(MskBonesJointFindings.class, MskBonesJointFindings.TYPE_ID, id);
	}
	

	public static MskJointsMovementsCollection getMskJointsMovements(LookupService lookupService) {
		MskJointsMovementsCollection collection =
			(MskJointsMovementsCollection) lookupService.getLookupCollection(MskJointsMovements.TYPE_ID, 
				MskJointsMovementsCollection.class, MskJointsMovements.class);
		return collection;
	}

	public static MskJointsMovements getMskJointsMovementsInstance(LookupService lookupService, int id) 
	{
		return (MskJointsMovements)lookupService.getLookupInstance(MskJointsMovements.class, MskJointsMovements.TYPE_ID, id);
	}
	

	public static FCTreatmentsOfferedCollection getFCTreatmentsOffered(LookupService lookupService) {
		FCTreatmentsOfferedCollection collection =
			(FCTreatmentsOfferedCollection) lookupService.getLookupCollection(FCTreatmentsOffered.TYPE_ID, 
				FCTreatmentsOfferedCollection.class, FCTreatmentsOffered.class);
		return collection;
	}

	public static FCTreatmentsOffered getFCTreatmentsOfferedInstance(LookupService lookupService, int id) 
	{
		return (FCTreatmentsOffered)lookupService.getLookupInstance(FCTreatmentsOffered.class, FCTreatmentsOffered.TYPE_ID, id);
	}
	

	public static FCSpermfrozenCollection getFCSpermfrozen(LookupService lookupService) {
		FCSpermfrozenCollection collection =
			(FCSpermfrozenCollection) lookupService.getLookupCollection(FCSpermfrozen.TYPE_ID, 
				FCSpermfrozenCollection.class, FCSpermfrozen.class);
		return collection;
	}

	public static FCSpermfrozen getFCSpermfrozenInstance(LookupService lookupService, int id) 
	{
		return (FCSpermfrozen)lookupService.getLookupInstance(FCSpermfrozen.class, FCSpermfrozen.TYPE_ID, id);
	}
	

	public static FCmethodsSuccessWithCollection getFCmethodsSuccessWith(LookupService lookupService) {
		FCmethodsSuccessWithCollection collection =
			(FCmethodsSuccessWithCollection) lookupService.getLookupCollection(FCmethodsSuccessWith.TYPE_ID, 
				FCmethodsSuccessWithCollection.class, FCmethodsSuccessWith.class);
		return collection;
	}

	public static FCmethodsSuccessWith getFCmethodsSuccessWithInstance(LookupService lookupService, int id) 
	{
		return (FCmethodsSuccessWith)lookupService.getLookupInstance(FCmethodsSuccessWith.class, FCmethodsSuccessWith.TYPE_ID, id);
	}
	

	public static FCElisaCollection getFCElisa(LookupService lookupService) {
		FCElisaCollection collection =
			(FCElisaCollection) lookupService.getLookupCollection(FCElisa.TYPE_ID, 
				FCElisaCollection.class, FCElisa.class);
		return collection;
	}

	public static FCElisa getFCElisaInstance(LookupService lookupService, int id) 
	{
		return (FCElisa)lookupService.getLookupInstance(FCElisa.class, FCElisa.TYPE_ID, id);
	}
	

	public static FCSemenAnalysisCollection getFCSemenAnalysis(LookupService lookupService) {
		FCSemenAnalysisCollection collection =
			(FCSemenAnalysisCollection) lookupService.getLookupCollection(FCSemenAnalysis.TYPE_ID, 
				FCSemenAnalysisCollection.class, FCSemenAnalysis.class);
		return collection;
	}

	public static FCSemenAnalysis getFCSemenAnalysisInstance(LookupService lookupService, int id) 
	{
		return (FCSemenAnalysis)lookupService.getLookupInstance(FCSemenAnalysis.class, FCSemenAnalysis.TYPE_ID, id);
	}
	

	public static FCSemenCultureCollection getFCSemenCulture(LookupService lookupService) {
		FCSemenCultureCollection collection =
			(FCSemenCultureCollection) lookupService.getLookupCollection(FCSemenCulture.TYPE_ID, 
				FCSemenCultureCollection.class, FCSemenCulture.class);
		return collection;
	}

	public static FCSemenCulture getFCSemenCultureInstance(LookupService lookupService, int id) 
	{
		return (FCSemenCulture)lookupService.getLookupInstance(FCSemenCulture.class, FCSemenCulture.TYPE_ID, id);
	}
	

	public static FCConsentForScreenCollection getFCConsentForScreen(LookupService lookupService) {
		FCConsentForScreenCollection collection =
			(FCConsentForScreenCollection) lookupService.getLookupCollection(FCConsentForScreen.TYPE_ID, 
				FCConsentForScreenCollection.class, FCConsentForScreen.class);
		return collection;
	}

	public static FCConsentForScreen getFCConsentForScreenInstance(LookupService lookupService, int id) 
	{
		return (FCConsentForScreen)lookupService.getLookupInstance(FCConsentForScreen.class, FCConsentForScreen.TYPE_ID, id);
	}
	

	public static FCInfectionScreeningCollection getFCInfectionScreening(LookupService lookupService) {
		FCInfectionScreeningCollection collection =
			(FCInfectionScreeningCollection) lookupService.getLookupCollection(FCInfectionScreening.TYPE_ID, 
				FCInfectionScreeningCollection.class, FCInfectionScreening.class);
		return collection;
	}

	public static FCInfectionScreening getFCInfectionScreeningInstance(LookupService lookupService, int id) 
	{
		return (FCInfectionScreening)lookupService.getLookupInstance(FCInfectionScreening.class, FCInfectionScreening.TYPE_ID, id);
	}
	

	public static FCEndoEvalCollection getFCEndoEval(LookupService lookupService) {
		FCEndoEvalCollection collection =
			(FCEndoEvalCollection) lookupService.getLookupCollection(FCEndoEval.TYPE_ID, 
				FCEndoEvalCollection.class, FCEndoEval.class);
		return collection;
	}

	public static FCEndoEval getFCEndoEvalInstance(LookupService lookupService, int id) 
	{
		return (FCEndoEval)lookupService.getLookupInstance(FCEndoEval.class, FCEndoEval.TYPE_ID, id);
	}
	

	public static FCTestAtrophyCollection getFCTestAtrophy(LookupService lookupService) {
		FCTestAtrophyCollection collection =
			(FCTestAtrophyCollection) lookupService.getLookupCollection(FCTestAtrophy.TYPE_ID, 
				FCTestAtrophyCollection.class, FCTestAtrophy.class);
		return collection;
	}

	public static FCTestAtrophy getFCTestAtrophyInstance(LookupService lookupService, int id) 
	{
		return (FCTestAtrophy)lookupService.getLookupInstance(FCTestAtrophy.class, FCTestAtrophy.TYPE_ID, id);
	}
	

	public static FCBladderDrainageCollection getFCBladderDrainage(LookupService lookupService) {
		FCBladderDrainageCollection collection =
			(FCBladderDrainageCollection) lookupService.getLookupCollection(FCBladderDrainage.TYPE_ID, 
				FCBladderDrainageCollection.class, FCBladderDrainage.class);
		return collection;
	}

	public static FCBladderDrainage getFCBladderDrainageInstance(LookupService lookupService, int id) 
	{
		return (FCBladderDrainage)lookupService.getLookupInstance(FCBladderDrainage.class, FCBladderDrainage.TYPE_ID, id);
	}
	

	public static FCSexDriveCollection getFCSexDrive(LookupService lookupService) {
		FCSexDriveCollection collection =
			(FCSexDriveCollection) lookupService.getLookupCollection(FCSexDrive.TYPE_ID, 
				FCSexDriveCollection.class, FCSexDrive.class);
		return collection;
	}

	public static FCSexDrive getFCSexDriveInstance(LookupService lookupService, int id) 
	{
		return (FCSexDrive)lookupService.getLookupInstance(FCSexDrive.class, FCSexDrive.TYPE_ID, id);
	}
	

	public static FCErectDysTreatmentsCollection getFCErectDysTreatments(LookupService lookupService) {
		FCErectDysTreatmentsCollection collection =
			(FCErectDysTreatmentsCollection) lookupService.getLookupCollection(FCErectDysTreatments.TYPE_ID, 
				FCErectDysTreatmentsCollection.class, FCErectDysTreatments.class);
		return collection;
	}

	public static FCErectDysTreatments getFCErectDysTreatmentsInstance(LookupService lookupService, int id) 
	{
		return (FCErectDysTreatments)lookupService.getLookupInstance(FCErectDysTreatments.class, FCErectDysTreatments.TYPE_ID, id);
	}
	

	public static WheelchairSurfaceCollection getWheelchairSurface(LookupService lookupService) {
		WheelchairSurfaceCollection collection =
			(WheelchairSurfaceCollection) lookupService.getLookupCollection(WheelchairSurface.TYPE_ID, 
				WheelchairSurfaceCollection.class, WheelchairSurface.class);
		return collection;
	}

	public static WheelchairSurface getWheelchairSurfaceInstance(LookupService lookupService, int id) 
	{
		return (WheelchairSurface)lookupService.getLookupInstance(WheelchairSurface.class, WheelchairSurface.TYPE_ID, id);
	}
	

	public static RespiratoryTreatmentCollection getRespiratoryTreatment(LookupService lookupService) {
		RespiratoryTreatmentCollection collection =
			(RespiratoryTreatmentCollection) lookupService.getLookupCollection(RespiratoryTreatment.TYPE_ID, 
				RespiratoryTreatmentCollection.class, RespiratoryTreatment.class);
		return collection;
	}

	public static RespiratoryTreatment getRespiratoryTreatmentInstance(LookupService lookupService, int id) 
	{
		return (RespiratoryTreatment)lookupService.getLookupInstance(RespiratoryTreatment.class, RespiratoryTreatment.TYPE_ID, id);
	}
	

	public static AssistedCoughCollection getAssistedCough(LookupService lookupService) {
		AssistedCoughCollection collection =
			(AssistedCoughCollection) lookupService.getLookupCollection(AssistedCough.TYPE_ID, 
				AssistedCoughCollection.class, AssistedCough.class);
		return collection;
	}

	public static AssistedCough getAssistedCoughInstance(LookupService lookupService, int id) 
	{
		return (AssistedCough)lookupService.getLookupInstance(AssistedCough.class, AssistedCough.TYPE_ID, id);
	}
	

	public static PosturalDrainageCollection getPosturalDrainage(LookupService lookupService) {
		PosturalDrainageCollection collection =
			(PosturalDrainageCollection) lookupService.getLookupCollection(PosturalDrainage.TYPE_ID, 
				PosturalDrainageCollection.class, PosturalDrainage.class);
		return collection;
	}

	public static PosturalDrainage getPosturalDrainageInstance(LookupService lookupService, int id) 
	{
		return (PosturalDrainage)lookupService.getLookupInstance(PosturalDrainage.class, PosturalDrainage.TYPE_ID, id);
	}
	

	public static NeuroExmOtherTestsCollection getNeuroExmOtherTests(LookupService lookupService) {
		NeuroExmOtherTestsCollection collection =
			(NeuroExmOtherTestsCollection) lookupService.getLookupCollection(NeuroExmOtherTests.TYPE_ID, 
				NeuroExmOtherTestsCollection.class, NeuroExmOtherTests.class);
		return collection;
	}

	public static NeuroExmOtherTests getNeuroExmOtherTestsInstance(LookupService lookupService, int id) 
	{
		return (NeuroExmOtherTests)lookupService.getLookupInstance(NeuroExmOtherTests.class, NeuroExmOtherTests.TYPE_ID, id);
	}
	

	public static NeuroExmAnalTestCollection getNeuroExmAnalTest(LookupService lookupService) {
		NeuroExmAnalTestCollection collection =
			(NeuroExmAnalTestCollection) lookupService.getLookupCollection(NeuroExmAnalTest.TYPE_ID, 
				NeuroExmAnalTestCollection.class, NeuroExmAnalTest.class);
		return collection;
	}

	public static NeuroExmAnalTest getNeuroExmAnalTestInstance(LookupService lookupService, int id) 
	{
		return (NeuroExmAnalTest)lookupService.getLookupInstance(NeuroExmAnalTest.class, NeuroExmAnalTest.TYPE_ID, id);
	}
	

	public static SpineExaminationFindingCollection getSpineExaminationFinding(LookupService lookupService) {
		SpineExaminationFindingCollection collection =
			(SpineExaminationFindingCollection) lookupService.getLookupCollection(SpineExaminationFinding.TYPE_ID, 
				SpineExaminationFindingCollection.class, SpineExaminationFinding.class);
		return collection;
	}

	public static SpineExaminationFinding getSpineExaminationFindingInstance(LookupService lookupService, int id) 
	{
		return (SpineExaminationFinding)lookupService.getLookupInstance(SpineExaminationFinding.class, SpineExaminationFinding.TYPE_ID, id);
	}
	

	public static InvestigationsOnAdmissionCollection getInvestigationsOnAdmission(LookupService lookupService) {
		InvestigationsOnAdmissionCollection collection =
			(InvestigationsOnAdmissionCollection) lookupService.getLookupCollection(InvestigationsOnAdmission.TYPE_ID, 
				InvestigationsOnAdmissionCollection.class, InvestigationsOnAdmission.class);
		return collection;
	}

	public static InvestigationsOnAdmission getInvestigationsOnAdmissionInstance(LookupService lookupService, int id) 
	{
		return (InvestigationsOnAdmission)lookupService.getLookupInstance(InvestigationsOnAdmission.class, InvestigationsOnAdmission.TYPE_ID, id);
	}
	

	public static MotorSensationRootValuesCollection getMotorSensationRootValues(LookupService lookupService) {
		MotorSensationRootValuesCollection collection =
			(MotorSensationRootValuesCollection) lookupService.getLookupCollection(MotorSensationRootValues.TYPE_ID, 
				MotorSensationRootValuesCollection.class, MotorSensationRootValues.class);
		return collection;
	}

	public static MotorSensationRootValues getMotorSensationRootValuesInstance(LookupService lookupService, int id) 
	{
		return (MotorSensationRootValues)lookupService.getLookupInstance(MotorSensationRootValues.class, MotorSensationRootValues.TYPE_ID, id);
	}
	

	public static InjuryAssociatedFactorCollection getInjuryAssociatedFactor(LookupService lookupService) {
		InjuryAssociatedFactorCollection collection =
			(InjuryAssociatedFactorCollection) lookupService.getLookupCollection(InjuryAssociatedFactor.TYPE_ID, 
				InjuryAssociatedFactorCollection.class, InjuryAssociatedFactor.class);
		return collection;
	}

	public static InjuryAssociatedFactor getInjuryAssociatedFactorInstance(LookupService lookupService, int id) 
	{
		return (InjuryAssociatedFactor)lookupService.getLookupInstance(InjuryAssociatedFactor.class, InjuryAssociatedFactor.TYPE_ID, id);
	}
	

	public static DurLOCUnitCollection getDurLOCUnit(LookupService lookupService) {
		DurLOCUnitCollection collection =
			(DurLOCUnitCollection) lookupService.getLookupCollection(DurLOCUnit.TYPE_ID, 
				DurLOCUnitCollection.class, DurLOCUnit.class);
		return collection;
	}

	public static DurLOCUnit getDurLOCUnitInstance(LookupService lookupService, int id) 
	{
		return (DurLOCUnit)lookupService.getLookupInstance(DurLOCUnit.class, DurLOCUnit.TYPE_ID, id);
	}
	

	public static InjuryClassMechanismCollection getInjuryClassMechanism(LookupService lookupService) {
		InjuryClassMechanismCollection collection =
			(InjuryClassMechanismCollection) lookupService.getLookupCollection(InjuryClassMechanism.TYPE_ID, 
				InjuryClassMechanismCollection.class, InjuryClassMechanism.class);
		return collection;
	}

	public static InjuryClassMechanism getInjuryClassMechanismInstance(LookupService lookupService, int id) 
	{
		return (InjuryClassMechanism)lookupService.getLookupInstance(InjuryClassMechanism.class, InjuryClassMechanism.TYPE_ID, id);
	}
	

	public static InjuryClassCauseofInjuryCollection getInjuryClassCauseofInjury(LookupService lookupService) {
		InjuryClassCauseofInjuryCollection collection =
			(InjuryClassCauseofInjuryCollection) lookupService.getLookupCollection(InjuryClassCauseofInjury.TYPE_ID, 
				InjuryClassCauseofInjuryCollection.class, InjuryClassCauseofInjury.class);
		return collection;
	}

	public static InjuryClassCauseofInjury getInjuryClassCauseofInjuryInstance(LookupService lookupService, int id) 
	{
		return (InjuryClassCauseofInjury)lookupService.getLookupInstance(InjuryClassCauseofInjury.class, InjuryClassCauseofInjury.TYPE_ID, id);
	}
	

	public static InjuryClassModeofInjuryCollection getInjuryClassModeofInjury(LookupService lookupService) {
		InjuryClassModeofInjuryCollection collection =
			(InjuryClassModeofInjuryCollection) lookupService.getLookupCollection(InjuryClassModeofInjury.TYPE_ID, 
				InjuryClassModeofInjuryCollection.class, InjuryClassModeofInjury.class);
		return collection;
	}

	public static InjuryClassModeofInjury getInjuryClassModeofInjuryInstance(LookupService lookupService, int id) 
	{
		return (InjuryClassModeofInjury)lookupService.getLookupInstance(InjuryClassModeofInjury.class, InjuryClassModeofInjury.TYPE_ID, id);
	}
	

	public static SocialStatusModalityCollection getSocialStatusModality(LookupService lookupService) {
		SocialStatusModalityCollection collection =
			(SocialStatusModalityCollection) lookupService.getLookupCollection(SocialStatusModality.TYPE_ID, 
				SocialStatusModalityCollection.class, SocialStatusModality.class);
		return collection;
	}

	public static SocialStatusModality getSocialStatusModalityInstance(LookupService lookupService, int id) 
	{
		return (SocialStatusModality)lookupService.getLookupInstance(SocialStatusModality.class, SocialStatusModality.TYPE_ID, id);
	}
	

	public static ErectDysTreatmentsGivenCollection getErectDysTreatmentsGiven(LookupService lookupService) {
		ErectDysTreatmentsGivenCollection collection =
			(ErectDysTreatmentsGivenCollection) lookupService.getLookupCollection(ErectDysTreatmentsGiven.TYPE_ID, 
				ErectDysTreatmentsGivenCollection.class, ErectDysTreatmentsGiven.class);
		return collection;
	}

	public static ErectDysTreatmentsGiven getErectDysTreatmentsGivenInstance(LookupService lookupService, int id) 
	{
		return (ErectDysTreatmentsGiven)lookupService.getLookupInstance(ErectDysTreatmentsGiven.class, ErectDysTreatmentsGiven.TYPE_ID, id);
	}
	

	public static AdaptationCollection getAdaptation(LookupService lookupService) {
		AdaptationCollection collection =
			(AdaptationCollection) lookupService.getLookupCollection(Adaptation.TYPE_ID, 
				AdaptationCollection.class, Adaptation.class);
		return collection;
	}

	public static Adaptation getAdaptationInstance(LookupService lookupService, int id) 
	{
		return (Adaptation)lookupService.getLookupInstance(Adaptation.class, Adaptation.TYPE_ID, id);
	}
	

	public static RoomTypeCollection getRoomType(LookupService lookupService) {
		RoomTypeCollection collection =
			(RoomTypeCollection) lookupService.getLookupCollection(RoomType.TYPE_ID, 
				RoomTypeCollection.class, RoomType.class);
		return collection;
	}

	public static RoomType getRoomTypeInstance(LookupService lookupService, int id) 
	{
		return (RoomType)lookupService.getLookupInstance(RoomType.class, RoomType.TYPE_ID, id);
	}
	

	public static RoomLocationCollection getRoomLocation(LookupService lookupService) {
		RoomLocationCollection collection =
			(RoomLocationCollection) lookupService.getLookupCollection(RoomLocation.TYPE_ID, 
				RoomLocationCollection.class, RoomLocation.class);
		return collection;
	}

	public static RoomLocation getRoomLocationInstance(LookupService lookupService, int id) 
	{
		return (RoomLocation)lookupService.getLookupInstance(RoomLocation.class, RoomLocation.TYPE_ID, id);
	}
	

	public static OwnershipStatusCollection getOwnershipStatus(LookupService lookupService) {
		OwnershipStatusCollection collection =
			(OwnershipStatusCollection) lookupService.getLookupCollection(OwnershipStatus.TYPE_ID, 
				OwnershipStatusCollection.class, OwnershipStatus.class);
		return collection;
	}

	public static OwnershipStatus getOwnershipStatusInstance(LookupService lookupService, int id) 
	{
		return (OwnershipStatus)lookupService.getLookupInstance(OwnershipStatus.class, OwnershipStatus.TYPE_ID, id);
	}
	

	public static AccommodationTypeCollection getAccommodationType(LookupService lookupService) {
		AccommodationTypeCollection collection =
			(AccommodationTypeCollection) lookupService.getLookupCollection(AccommodationType.TYPE_ID, 
				AccommodationTypeCollection.class, AccommodationType.class);
		return collection;
	}

	public static AccommodationType getAccommodationTypeInstance(LookupService lookupService, int id) 
	{
		return (AccommodationType)lookupService.getLookupInstance(AccommodationType.class, AccommodationType.TYPE_ID, id);
	}
	

	public static DrivingAspectCollection getDrivingAspect(LookupService lookupService) {
		DrivingAspectCollection collection =
			(DrivingAspectCollection) lookupService.getLookupCollection(DrivingAspect.TYPE_ID, 
				DrivingAspectCollection.class, DrivingAspect.class);
		return collection;
	}

	public static DrivingAspect getDrivingAspectInstance(LookupService lookupService, int id) 
	{
		return (DrivingAspect)lookupService.getLookupInstance(DrivingAspect.class, DrivingAspect.TYPE_ID, id);
	}
	

	public static GaitTreatmentSupervisionLevelCollection getGaitTreatmentSupervisionLevel(LookupService lookupService) {
		GaitTreatmentSupervisionLevelCollection collection =
			(GaitTreatmentSupervisionLevelCollection) lookupService.getLookupCollection(GaitTreatmentSupervisionLevel.TYPE_ID, 
				GaitTreatmentSupervisionLevelCollection.class, GaitTreatmentSupervisionLevel.class);
		return collection;
	}

	public static GaitTreatmentSupervisionLevel getGaitTreatmentSupervisionLevelInstance(LookupService lookupService, int id) 
	{
		return (GaitTreatmentSupervisionLevel)lookupService.getLookupInstance(GaitTreatmentSupervisionLevel.class, GaitTreatmentSupervisionLevel.TYPE_ID, id);
	}
	

	public static OrthosesCollection getOrthoses(LookupService lookupService) {
		OrthosesCollection collection =
			(OrthosesCollection) lookupService.getLookupCollection(Orthoses.TYPE_ID, 
				OrthosesCollection.class, Orthoses.class);
		return collection;
	}

	public static Orthoses getOrthosesInstance(LookupService lookupService, int id) 
	{
		return (Orthoses)lookupService.getLookupInstance(Orthoses.class, Orthoses.TYPE_ID, id);
	}
	

	public static GaitTechniqueCollection getGaitTechnique(LookupService lookupService) {
		GaitTechniqueCollection collection =
			(GaitTechniqueCollection) lookupService.getLookupCollection(GaitTechnique.TYPE_ID, 
				GaitTechniqueCollection.class, GaitTechnique.class);
		return collection;
	}

	public static GaitTechnique getGaitTechniqueInstance(LookupService lookupService, int id) 
	{
		return (GaitTechnique)lookupService.getLookupInstance(GaitTechnique.class, GaitTechnique.TYPE_ID, id);
	}
	

	public static GaitTestEnvironmentCollection getGaitTestEnvironment(LookupService lookupService) {
		GaitTestEnvironmentCollection collection =
			(GaitTestEnvironmentCollection) lookupService.getLookupCollection(GaitTestEnvironment.TYPE_ID, 
				GaitTestEnvironmentCollection.class, GaitTestEnvironment.class);
		return collection;
	}

	public static GaitTestEnvironment getGaitTestEnvironmentInstance(LookupService lookupService, int id) 
	{
		return (GaitTestEnvironment)lookupService.getLookupInstance(GaitTestEnvironment.class, GaitTestEnvironment.TYPE_ID, id);
	}
	

	public static SportActivityCollection getSportActivity(LookupService lookupService) {
		SportActivityCollection collection =
			(SportActivityCollection) lookupService.getLookupCollection(SportActivity.TYPE_ID, 
				SportActivityCollection.class, SportActivity.class);
		return collection;
	}

	public static SportActivity getSportActivityInstance(LookupService lookupService, int id) 
	{
		return (SportActivity)lookupService.getLookupInstance(SportActivity.class, SportActivity.TYPE_ID, id);
	}
	

	public static EnvironmentalVisitLocationCollection getEnvironmentalVisitLocation(LookupService lookupService) {
		EnvironmentalVisitLocationCollection collection =
			(EnvironmentalVisitLocationCollection) lookupService.getLookupCollection(EnvironmentalVisitLocation.TYPE_ID, 
				EnvironmentalVisitLocationCollection.class, EnvironmentalVisitLocation.class);
		return collection;
	}

	public static EnvironmentalVisitLocation getEnvironmentalVisitLocationInstance(LookupService lookupService, int id) 
	{
		return (EnvironmentalVisitLocation)lookupService.getLookupInstance(EnvironmentalVisitLocation.class, EnvironmentalVisitLocation.TYPE_ID, id);
	}
	

	public static StrengtheningProgramLimbTypeCollection getStrengtheningProgramLimbType(LookupService lookupService) {
		StrengtheningProgramLimbTypeCollection collection =
			(StrengtheningProgramLimbTypeCollection) lookupService.getLookupCollection(StrengtheningProgramLimbType.TYPE_ID, 
				StrengtheningProgramLimbTypeCollection.class, StrengtheningProgramLimbType.class);
		return collection;
	}

	public static StrengtheningProgramLimbType getStrengtheningProgramLimbTypeInstance(LookupService lookupService, int id) 
	{
		return (StrengtheningProgramLimbType)lookupService.getLookupInstance(StrengtheningProgramLimbType.class, StrengtheningProgramLimbType.TYPE_ID, id);
	}
	

	public static StrengtheningProgramExerciseCollection getStrengtheningProgramExercise(LookupService lookupService) {
		StrengtheningProgramExerciseCollection collection =
			(StrengtheningProgramExerciseCollection) lookupService.getLookupCollection(StrengtheningProgramExercise.TYPE_ID, 
				StrengtheningProgramExerciseCollection.class, StrengtheningProgramExercise.class);
		return collection;
	}

	public static StrengtheningProgramExercise getStrengtheningProgramExerciseInstance(LookupService lookupService, int id) 
	{
		return (StrengtheningProgramExercise)lookupService.getLookupInstance(StrengtheningProgramExercise.class, StrengtheningProgramExercise.TYPE_ID, id);
	}
	

	public static WheelchairSkillAssessedLevelCollection getWheelchairSkillAssessedLevel(LookupService lookupService) {
		WheelchairSkillAssessedLevelCollection collection =
			(WheelchairSkillAssessedLevelCollection) lookupService.getLookupCollection(WheelchairSkillAssessedLevel.TYPE_ID, 
				WheelchairSkillAssessedLevelCollection.class, WheelchairSkillAssessedLevel.class);
		return collection;
	}

	public static WheelchairSkillAssessedLevel getWheelchairSkillAssessedLevelInstance(LookupService lookupService, int id) 
	{
		return (WheelchairSkillAssessedLevel)lookupService.getLookupInstance(WheelchairSkillAssessedLevel.class, WheelchairSkillAssessedLevel.TYPE_ID, id);
	}
	

	public static WheelchairSkillCollection getWheelchairSkill(LookupService lookupService) {
		WheelchairSkillCollection collection =
			(WheelchairSkillCollection) lookupService.getLookupCollection(WheelchairSkill.TYPE_ID, 
				WheelchairSkillCollection.class, WheelchairSkill.class);
		return collection;
	}

	public static WheelchairSkill getWheelchairSkillInstance(LookupService lookupService, int id) 
	{
		return (WheelchairSkill)lookupService.getLookupInstance(WheelchairSkill.class, WheelchairSkill.TYPE_ID, id);
	}
	

	public static PowerchairSkillAssessedLevelCollection getPowerchairSkillAssessedLevel(LookupService lookupService) {
		PowerchairSkillAssessedLevelCollection collection =
			(PowerchairSkillAssessedLevelCollection) lookupService.getLookupCollection(PowerchairSkillAssessedLevel.TYPE_ID, 
				PowerchairSkillAssessedLevelCollection.class, PowerchairSkillAssessedLevel.class);
		return collection;
	}

	public static PowerchairSkillAssessedLevel getPowerchairSkillAssessedLevelInstance(LookupService lookupService, int id) 
	{
		return (PowerchairSkillAssessedLevel)lookupService.getLookupInstance(PowerchairSkillAssessedLevel.class, PowerchairSkillAssessedLevel.TYPE_ID, id);
	}
	

	public static PowerchairSkillCollection getPowerchairSkill(LookupService lookupService) {
		PowerchairSkillCollection collection =
			(PowerchairSkillCollection) lookupService.getLookupCollection(PowerchairSkill.TYPE_ID, 
				PowerchairSkillCollection.class, PowerchairSkill.class);
		return collection;
	}

	public static PowerchairSkill getPowerchairSkillInstance(LookupService lookupService, int id) 
	{
		return (PowerchairSkill)lookupService.getLookupInstance(PowerchairSkill.class, PowerchairSkill.TYPE_ID, id);
	}
	

	public static WheelchairCushionAccessoryCollection getWheelchairCushionAccessory(LookupService lookupService) {
		WheelchairCushionAccessoryCollection collection =
			(WheelchairCushionAccessoryCollection) lookupService.getLookupCollection(WheelchairCushionAccessory.TYPE_ID, 
				WheelchairCushionAccessoryCollection.class, WheelchairCushionAccessory.class);
		return collection;
	}

	public static WheelchairCushionAccessory getWheelchairCushionAccessoryInstance(LookupService lookupService, int id) 
	{
		return (WheelchairCushionAccessory)lookupService.getLookupInstance(WheelchairCushionAccessory.class, WheelchairCushionAccessory.TYPE_ID, id);
	}
	

	public static WheelchairCushionModificationCollection getWheelchairCushionModification(LookupService lookupService) {
		WheelchairCushionModificationCollection collection =
			(WheelchairCushionModificationCollection) lookupService.getLookupCollection(WheelchairCushionModification.TYPE_ID, 
				WheelchairCushionModificationCollection.class, WheelchairCushionModification.class);
		return collection;
	}

	public static WheelchairCushionModification getWheelchairCushionModificationInstance(LookupService lookupService, int id) 
	{
		return (WheelchairCushionModification)lookupService.getLookupInstance(WheelchairCushionModification.class, WheelchairCushionModification.TYPE_ID, id);
	}
	

	public static WheelchairCushionTypeCollection getWheelchairCushionType(LookupService lookupService) {
		WheelchairCushionTypeCollection collection =
			(WheelchairCushionTypeCollection) lookupService.getLookupCollection(WheelchairCushionType.TYPE_ID, 
				WheelchairCushionTypeCollection.class, WheelchairCushionType.class);
		return collection;
	}

	public static WheelchairCushionType getWheelchairCushionTypeInstance(LookupService lookupService, int id) 
	{
		return (WheelchairCushionType)lookupService.getLookupInstance(WheelchairCushionType.class, WheelchairCushionType.TYPE_ID, id);
	}
	

	public static RemedialLocationCollection getRemedialLocation(LookupService lookupService) {
		RemedialLocationCollection collection =
			(RemedialLocationCollection) lookupService.getLookupCollection(RemedialLocation.TYPE_ID, 
				RemedialLocationCollection.class, RemedialLocation.class);
		return collection;
	}

	public static RemedialLocation getRemedialLocationInstance(LookupService lookupService, int id) 
	{
		return (RemedialLocation)lookupService.getLookupInstance(RemedialLocation.class, RemedialLocation.TYPE_ID, id);
	}
	

	public static UltrasoundMuscleAspectCollection getUltrasoundMuscleAspect(LookupService lookupService) {
		UltrasoundMuscleAspectCollection collection =
			(UltrasoundMuscleAspectCollection) lookupService.getLookupCollection(UltrasoundMuscleAspect.TYPE_ID, 
				UltrasoundMuscleAspectCollection.class, UltrasoundMuscleAspect.class);
		return collection;
	}

	public static UltrasoundMuscleAspect getUltrasoundMuscleAspectInstance(LookupService lookupService, int id) 
	{
		return (UltrasoundMuscleAspect)lookupService.getLookupInstance(UltrasoundMuscleAspect.class, UltrasoundMuscleAspect.TYPE_ID, id);
	}
	

	public static ConnectiveTissueMassageAreaCollection getConnectiveTissueMassageArea(LookupService lookupService) {
		ConnectiveTissueMassageAreaCollection collection =
			(ConnectiveTissueMassageAreaCollection) lookupService.getLookupCollection(ConnectiveTissueMassageArea.TYPE_ID, 
				ConnectiveTissueMassageAreaCollection.class, ConnectiveTissueMassageArea.class);
		return collection;
	}

	public static ConnectiveTissueMassageArea getConnectiveTissueMassageAreaInstance(LookupService lookupService, int id) 
	{
		return (ConnectiveTissueMassageArea)lookupService.getLookupInstance(ConnectiveTissueMassageArea.class, ConnectiveTissueMassageArea.TYPE_ID, id);
	}
	

	public static SplintInstructionLeafletCollection getSplintInstructionLeaflet(LookupService lookupService) {
		SplintInstructionLeafletCollection collection =
			(SplintInstructionLeafletCollection) lookupService.getLookupCollection(SplintInstructionLeaflet.TYPE_ID, 
				SplintInstructionLeafletCollection.class, SplintInstructionLeaflet.class);
		return collection;
	}

	public static SplintInstructionLeaflet getSplintInstructionLeafletInstance(LookupService lookupService, int id) 
	{
		return (SplintInstructionLeaflet)lookupService.getLookupInstance(SplintInstructionLeaflet.class, SplintInstructionLeaflet.TYPE_ID, id);
	}
	

	public static SplintAdditionalFeatureCollection getSplintAdditionalFeature(LookupService lookupService) {
		SplintAdditionalFeatureCollection collection =
			(SplintAdditionalFeatureCollection) lookupService.getLookupCollection(SplintAdditionalFeature.TYPE_ID, 
				SplintAdditionalFeatureCollection.class, SplintAdditionalFeature.class);
		return collection;
	}

	public static SplintAdditionalFeature getSplintAdditionalFeatureInstance(LookupService lookupService, int id) 
	{
		return (SplintAdditionalFeature)lookupService.getLookupInstance(SplintAdditionalFeature.class, SplintAdditionalFeature.TYPE_ID, id);
	}
	

	public static SplintSizeCollection getSplintSize(LookupService lookupService) {
		SplintSizeCollection collection =
			(SplintSizeCollection) lookupService.getLookupCollection(SplintSize.TYPE_ID, 
				SplintSizeCollection.class, SplintSize.class);
		return collection;
	}

	public static SplintSize getSplintSizeInstance(LookupService lookupService, int id) 
	{
		return (SplintSize)lookupService.getLookupInstance(SplintSize.class, SplintSize.TYPE_ID, id);
	}
	

	public static SplintBaseCollection getSplintBase(LookupService lookupService) {
		SplintBaseCollection collection =
			(SplintBaseCollection) lookupService.getLookupCollection(SplintBase.TYPE_ID, 
				SplintBaseCollection.class, SplintBase.class);
		return collection;
	}

	public static SplintBase getSplintBaseInstance(LookupService lookupService, int id) 
	{
		return (SplintBase)lookupService.getLookupInstance(SplintBase.class, SplintBase.TYPE_ID, id);
	}
	

	public static ErectDysfxnErectQualCollection getErectDysfxnErectQual(LookupService lookupService) {
		ErectDysfxnErectQualCollection collection =
			(ErectDysfxnErectQualCollection) lookupService.getLookupCollection(ErectDysfxnErectQual.TYPE_ID, 
				ErectDysfxnErectQualCollection.class, ErectDysfxnErectQual.class);
		return collection;
	}

	public static ErectDysfxnErectQual getErectDysfxnErectQualInstance(LookupService lookupService, int id) 
	{
		return (ErectDysfxnErectQual)lookupService.getLookupInstance(ErectDysfxnErectQual.class, ErectDysfxnErectQual.TYPE_ID, id);
	}
	

	public static SplintProductCollection getSplintProduct(LookupService lookupService) {
		SplintProductCollection collection =
			(SplintProductCollection) lookupService.getLookupCollection(SplintProduct.TYPE_ID, 
				SplintProductCollection.class, SplintProduct.class);
		return collection;
	}

	public static SplintProduct getSplintProductInstance(LookupService lookupService, int id) 
	{
		return (SplintProduct)lookupService.getLookupInstance(SplintProduct.class, SplintProduct.TYPE_ID, id);
	}
	

	public static SplintMaterialCollection getSplintMaterial(LookupService lookupService) {
		SplintMaterialCollection collection =
			(SplintMaterialCollection) lookupService.getLookupCollection(SplintMaterial.TYPE_ID, 
				SplintMaterialCollection.class, SplintMaterial.class);
		return collection;
	}

	public static SplintMaterial getSplintMaterialInstance(LookupService lookupService, int id) 
	{
		return (SplintMaterial)lookupService.getLookupInstance(SplintMaterial.class, SplintMaterial.TYPE_ID, id);
	}
	

	public static SplintTypeCollection getSplintType(LookupService lookupService) {
		SplintTypeCollection collection =
			(SplintTypeCollection) lookupService.getLookupCollection(SplintType.TYPE_ID, 
				SplintTypeCollection.class, SplintType.class);
		return collection;
	}

	public static SplintType getSplintTypeInstance(LookupService lookupService, int id) 
	{
		return (SplintType)lookupService.getLookupInstance(SplintType.class, SplintType.TYPE_ID, id);
	}
	

	public static SplintCategoryCollection getSplintCategory(LookupService lookupService) {
		SplintCategoryCollection collection =
			(SplintCategoryCollection) lookupService.getLookupCollection(SplintCategory.TYPE_ID, 
				SplintCategoryCollection.class, SplintCategory.class);
		return collection;
	}

	public static SplintCategory getSplintCategoryInstance(LookupService lookupService, int id) 
	{
		return (SplintCategory)lookupService.getLookupInstance(SplintCategory.class, SplintCategory.TYPE_ID, id);
	}
	

	public static SplintAreaCollection getSplintArea(LookupService lookupService) {
		SplintAreaCollection collection =
			(SplintAreaCollection) lookupService.getLookupCollection(SplintArea.TYPE_ID, 
				SplintAreaCollection.class, SplintArea.class);
		return collection;
	}

	public static SplintArea getSplintAreaInstance(LookupService lookupService, int id) 
	{
		return (SplintArea)lookupService.getLookupInstance(SplintArea.class, SplintArea.TYPE_ID, id);
	}
	

	public static FunctionalTransferRiskCollection getFunctionalTransferRisk(LookupService lookupService) {
		FunctionalTransferRiskCollection collection =
			(FunctionalTransferRiskCollection) lookupService.getLookupCollection(FunctionalTransferRisk.TYPE_ID, 
				FunctionalTransferRiskCollection.class, FunctionalTransferRisk.class);
		return collection;
	}

	public static FunctionalTransferRisk getFunctionalTransferRiskInstance(LookupService lookupService, int id) 
	{
		return (FunctionalTransferRisk)lookupService.getLookupInstance(FunctionalTransferRisk.class, FunctionalTransferRisk.TYPE_ID, id);
	}
	

	public static FunctionalTransferPositionCollection getFunctionalTransferPosition(LookupService lookupService) {
		FunctionalTransferPositionCollection collection =
			(FunctionalTransferPositionCollection) lookupService.getLookupCollection(FunctionalTransferPosition.TYPE_ID, 
				FunctionalTransferPositionCollection.class, FunctionalTransferPosition.class);
		return collection;
	}

	public static FunctionalTransferPosition getFunctionalTransferPositionInstance(LookupService lookupService, int id) 
	{
		return (FunctionalTransferPosition)lookupService.getLookupInstance(FunctionalTransferPosition.class, FunctionalTransferPosition.TYPE_ID, id);
	}
	

	public static FunctionalTransferEquipmentCollection getFunctionalTransferEquipment(LookupService lookupService) {
		FunctionalTransferEquipmentCollection collection =
			(FunctionalTransferEquipmentCollection) lookupService.getLookupCollection(FunctionalTransferEquipment.TYPE_ID, 
				FunctionalTransferEquipmentCollection.class, FunctionalTransferEquipment.class);
		return collection;
	}

	public static FunctionalTransferEquipment getFunctionalTransferEquipmentInstance(LookupService lookupService, int id) 
	{
		return (FunctionalTransferEquipment)lookupService.getLookupInstance(FunctionalTransferEquipment.class, FunctionalTransferEquipment.TYPE_ID, id);
	}
	

	public static FunctionalTransferTechniqueCollection getFunctionalTransferTechnique(LookupService lookupService) {
		FunctionalTransferTechniqueCollection collection =
			(FunctionalTransferTechniqueCollection) lookupService.getLookupCollection(FunctionalTransferTechnique.TYPE_ID, 
				FunctionalTransferTechniqueCollection.class, FunctionalTransferTechnique.class);
		return collection;
	}

	public static FunctionalTransferTechnique getFunctionalTransferTechniqueInstance(LookupService lookupService, int id) 
	{
		return (FunctionalTransferTechnique)lookupService.getLookupInstance(FunctionalTransferTechnique.class, FunctionalTransferTechnique.TYPE_ID, id);
	}
	

	public static UltrasoundIntensityCollection getUltrasoundIntensity(LookupService lookupService) {
		UltrasoundIntensityCollection collection =
			(UltrasoundIntensityCollection) lookupService.getLookupCollection(UltrasoundIntensity.TYPE_ID, 
				UltrasoundIntensityCollection.class, UltrasoundIntensity.class);
		return collection;
	}

	public static UltrasoundIntensity getUltrasoundIntensityInstance(LookupService lookupService, int id) 
	{
		return (UltrasoundIntensity)lookupService.getLookupInstance(UltrasoundIntensity.class, UltrasoundIntensity.TYPE_ID, id);
	}
	

	public static UltrasoundPulseCollection getUltrasoundPulse(LookupService lookupService) {
		UltrasoundPulseCollection collection =
			(UltrasoundPulseCollection) lookupService.getLookupCollection(UltrasoundPulse.TYPE_ID, 
				UltrasoundPulseCollection.class, UltrasoundPulse.class);
		return collection;
	}

	public static UltrasoundPulse getUltrasoundPulseInstance(LookupService lookupService, int id) 
	{
		return (UltrasoundPulse)lookupService.getLookupInstance(UltrasoundPulse.class, UltrasoundPulse.TYPE_ID, id);
	}
	

	public static UltrasoundWaveCollection getUltrasoundWave(LookupService lookupService) {
		UltrasoundWaveCollection collection =
			(UltrasoundWaveCollection) lookupService.getLookupCollection(UltrasoundWave.TYPE_ID, 
				UltrasoundWaveCollection.class, UltrasoundWave.class);
		return collection;
	}

	public static UltrasoundWave getUltrasoundWaveInstance(LookupService lookupService, int id) 
	{
		return (UltrasoundWave)lookupService.getLookupInstance(UltrasoundWave.class, UltrasoundWave.TYPE_ID, id);
	}
	

	public static UltrasoundTargetAndAreaCollection getUltrasoundTargetAndArea(LookupService lookupService) {
		UltrasoundTargetAndAreaCollection collection =
			(UltrasoundTargetAndAreaCollection) lookupService.getLookupCollection(UltrasoundTargetAndArea.TYPE_ID, 
				UltrasoundTargetAndAreaCollection.class, UltrasoundTargetAndArea.class);
		return collection;
	}

	public static UltrasoundTargetAndArea getUltrasoundTargetAndAreaInstance(LookupService lookupService, int id) 
	{
		return (UltrasoundTargetAndArea)lookupService.getLookupInstance(UltrasoundTargetAndArea.class, UltrasoundTargetAndArea.TYPE_ID, id);
	}
	

	public static TENSSizeCollection getTENSSize(LookupService lookupService) {
		TENSSizeCollection collection =
			(TENSSizeCollection) lookupService.getLookupCollection(TENSSize.TYPE_ID, 
				TENSSizeCollection.class, TENSSize.class);
		return collection;
	}

	public static TENSSize getTENSSizeInstance(LookupService lookupService, int id) 
	{
		return (TENSSize)lookupService.getLookupInstance(TENSSize.class, TENSSize.TYPE_ID, id);
	}
	

	public static TENSElectrodesCollection getTENSElectrodes(LookupService lookupService) {
		TENSElectrodesCollection collection =
			(TENSElectrodesCollection) lookupService.getLookupCollection(TENSElectrodes.TYPE_ID, 
				TENSElectrodesCollection.class, TENSElectrodes.class);
		return collection;
	}

	public static TENSElectrodes getTENSElectrodesInstance(LookupService lookupService, int id) 
	{
		return (TENSElectrodes)lookupService.getLookupInstance(TENSElectrodes.class, TENSElectrodes.TYPE_ID, id);
	}
	

	public static TENSDailyUsageCollection getTENSDailyUsage(LookupService lookupService) {
		TENSDailyUsageCollection collection =
			(TENSDailyUsageCollection) lookupService.getLookupCollection(TENSDailyUsage.TYPE_ID, 
				TENSDailyUsageCollection.class, TENSDailyUsage.class);
		return collection;
	}

	public static TENSDailyUsage getTENSDailyUsageInstance(LookupService lookupService, int id) 
	{
		return (TENSDailyUsage)lookupService.getLookupInstance(TENSDailyUsage.class, TENSDailyUsage.TYPE_ID, id);
	}
	

	public static TENSModeCollection getTENSMode(LookupService lookupService) {
		TENSModeCollection collection =
			(TENSModeCollection) lookupService.getLookupCollection(TENSMode.TYPE_ID, 
				TENSModeCollection.class, TENSMode.class);
		return collection;
	}

	public static TENSMode getTENSModeInstance(LookupService lookupService, int id) 
	{
		return (TENSMode)lookupService.getLookupInstance(TENSMode.class, TENSMode.TYPE_ID, id);
	}
	

	public static TENSModelCollection getTENSModel(LookupService lookupService) {
		TENSModelCollection collection =
			(TENSModelCollection) lookupService.getLookupCollection(TENSModel.TYPE_ID, 
				TENSModelCollection.class, TENSModel.class);
		return collection;
	}

	public static TENSModel getTENSModelInstance(LookupService lookupService, int id) 
	{
		return (TENSModel)lookupService.getLookupInstance(TENSModel.class, TENSModel.TYPE_ID, id);
	}
	

	public static TENSAreaCollection getTENSArea(LookupService lookupService) {
		TENSAreaCollection collection =
			(TENSAreaCollection) lookupService.getLookupCollection(TENSArea.TYPE_ID, 
				TENSAreaCollection.class, TENSArea.class);
		return collection;
	}

	public static TENSArea getTENSAreaInstance(LookupService lookupService, int id) 
	{
		return (TENSArea)lookupService.getLookupInstance(TENSArea.class, TENSArea.TYPE_ID, id);
	}
	

	public static PneumaticCycleCollection getPneumaticCycle(LookupService lookupService) {
		PneumaticCycleCollection collection =
			(PneumaticCycleCollection) lookupService.getLookupCollection(PneumaticCycle.TYPE_ID, 
				PneumaticCycleCollection.class, PneumaticCycle.class);
		return collection;
	}

	public static PneumaticCycle getPneumaticCycleInstance(LookupService lookupService, int id) 
	{
		return (PneumaticCycle)lookupService.getLookupInstance(PneumaticCycle.class, PneumaticCycle.TYPE_ID, id);
	}
	

	public static PneumaticSplintsCollection getPneumaticSplints(LookupService lookupService) {
		PneumaticSplintsCollection collection =
			(PneumaticSplintsCollection) lookupService.getLookupCollection(PneumaticSplints.TYPE_ID, 
				PneumaticSplintsCollection.class, PneumaticSplints.class);
		return collection;
	}

	public static PneumaticSplints getPneumaticSplintsInstance(LookupService lookupService, int id) 
	{
		return (PneumaticSplints)lookupService.getLookupInstance(PneumaticSplints.class, PneumaticSplints.TYPE_ID, id);
	}
	

	public static PneumaticAreaCollection getPneumaticArea(LookupService lookupService) {
		PneumaticAreaCollection collection =
			(PneumaticAreaCollection) lookupService.getLookupCollection(PneumaticArea.TYPE_ID, 
				PneumaticAreaCollection.class, PneumaticArea.class);
		return collection;
	}

	public static PneumaticArea getPneumaticAreaInstance(LookupService lookupService, int id) 
	{
		return (PneumaticArea)lookupService.getLookupInstance(PneumaticArea.class, PneumaticArea.TYPE_ID, id);
	}
	

	public static PneumaticStartingPosCollection getPneumaticStartingPos(LookupService lookupService) {
		PneumaticStartingPosCollection collection =
			(PneumaticStartingPosCollection) lookupService.getLookupCollection(PneumaticStartingPos.TYPE_ID, 
				PneumaticStartingPosCollection.class, PneumaticStartingPos.class);
		return collection;
	}

	public static PneumaticStartingPos getPneumaticStartingPosInstance(LookupService lookupService, int id) 
	{
		return (PneumaticStartingPos)lookupService.getLookupInstance(PneumaticStartingPos.class, PneumaticStartingPos.TYPE_ID, id);
	}
	

	public static FCAchieveErectionCollection getFCAchieveErection(LookupService lookupService) {
		FCAchieveErectionCollection collection =
			(FCAchieveErectionCollection) lookupService.getLookupCollection(FCAchieveErection.TYPE_ID, 
				FCAchieveErectionCollection.class, FCAchieveErection.class);
		return collection;
	}

	public static FCAchieveErection getFCAchieveErectionInstance(LookupService lookupService, int id) 
	{
		return (FCAchieveErection)lookupService.getLookupInstance(FCAchieveErection.class, FCAchieveErection.TYPE_ID, id);
	}
	

	public static DeepFrictionMassageAreaStructureCollection getDeepFrictionMassageAreaStructure(LookupService lookupService) {
		DeepFrictionMassageAreaStructureCollection collection =
			(DeepFrictionMassageAreaStructureCollection) lookupService.getLookupCollection(DeepFrictionMassageAreaStructure.TYPE_ID, 
				DeepFrictionMassageAreaStructureCollection.class, DeepFrictionMassageAreaStructure.class);
		return collection;
	}

	public static DeepFrictionMassageAreaStructure getDeepFrictionMassageAreaStructureInstance(LookupService lookupService, int id) 
	{
		return (DeepFrictionMassageAreaStructure)lookupService.getLookupInstance(DeepFrictionMassageAreaStructure.class, DeepFrictionMassageAreaStructure.TYPE_ID, id);
	}
	

	public static SoftTissueMassageTypeCollection getSoftTissueMassageType(LookupService lookupService) {
		SoftTissueMassageTypeCollection collection =
			(SoftTissueMassageTypeCollection) lookupService.getLookupCollection(SoftTissueMassageType.TYPE_ID, 
				SoftTissueMassageTypeCollection.class, SoftTissueMassageType.class);
		return collection;
	}

	public static SoftTissueMassageType getSoftTissueMassageTypeInstance(LookupService lookupService, int id) 
	{
		return (SoftTissueMassageType)lookupService.getLookupInstance(SoftTissueMassageType.class, SoftTissueMassageType.TYPE_ID, id);
	}
	

	public static RemedialPatPositionCollection getRemedialPatPosition(LookupService lookupService) {
		RemedialPatPositionCollection collection =
			(RemedialPatPositionCollection) lookupService.getLookupCollection(RemedialPatPosition.TYPE_ID, 
				RemedialPatPositionCollection.class, RemedialPatPosition.class);
		return collection;
	}

	public static RemedialPatPosition getRemedialPatPositionInstance(LookupService lookupService, int id) 
	{
		return (RemedialPatPosition)lookupService.getLookupInstance(RemedialPatPosition.class, RemedialPatPosition.TYPE_ID, id);
	}
	

	public static RehabPurposeCollection getRehabPurpose(LookupService lookupService) {
		RehabPurposeCollection collection =
			(RehabPurposeCollection) lookupService.getLookupCollection(RehabPurpose.TYPE_ID, 
				RehabPurposeCollection.class, RehabPurpose.class);
		return collection;
	}

	public static RehabPurpose getRehabPurposeInstance(LookupService lookupService, int id) 
	{
		return (RehabPurpose)lookupService.getLookupInstance(RehabPurpose.class, RehabPurpose.TYPE_ID, id);
	}
	

	public static RehabLocationCollection getRehabLocation(LookupService lookupService) {
		RehabLocationCollection collection =
			(RehabLocationCollection) lookupService.getLookupCollection(RehabLocation.TYPE_ID, 
				RehabLocationCollection.class, RehabLocation.class);
		return collection;
	}

	public static RehabLocation getRehabLocationInstance(LookupService lookupService, int id) 
	{
		return (RehabLocation)lookupService.getLookupInstance(RehabLocation.class, RehabLocation.TYPE_ID, id);
	}
	

	public static RehabActivityCollection getRehabActivity(LookupService lookupService) {
		RehabActivityCollection collection =
			(RehabActivityCollection) lookupService.getLookupCollection(RehabActivity.TYPE_ID, 
				RehabActivityCollection.class, RehabActivity.class);
		return collection;
	}

	public static RehabActivity getRehabActivityInstance(LookupService lookupService, int id) 
	{
		return (RehabActivity)lookupService.getLookupInstance(RehabActivity.class, RehabActivity.TYPE_ID, id);
	}
	

	public static RehabTechniqueCollection getRehabTechnique(LookupService lookupService) {
		RehabTechniqueCollection collection =
			(RehabTechniqueCollection) lookupService.getLookupCollection(RehabTechnique.TYPE_ID, 
				RehabTechniqueCollection.class, RehabTechnique.class);
		return collection;
	}

	public static RehabTechnique getRehabTechniqueInstance(LookupService lookupService, int id) 
	{
		return (RehabTechnique)lookupService.getLookupInstance(RehabTechnique.class, RehabTechnique.TYPE_ID, id);
	}
	

	public static RehabEquipmentCollection getRehabEquipment(LookupService lookupService) {
		RehabEquipmentCollection collection =
			(RehabEquipmentCollection) lookupService.getLookupCollection(RehabEquipment.TYPE_ID, 
				RehabEquipmentCollection.class, RehabEquipment.class);
		return collection;
	}

	public static RehabEquipment getRehabEquipmentInstance(LookupService lookupService, int id) 
	{
		return (RehabEquipment)lookupService.getLookupInstance(RehabEquipment.class, RehabEquipment.TYPE_ID, id);
	}
	

	public static MobilisationsTreatmentCollection getMobilisationsTreatment(LookupService lookupService) {
		MobilisationsTreatmentCollection collection =
			(MobilisationsTreatmentCollection) lookupService.getLookupCollection(MobilisationsTreatment.TYPE_ID, 
				MobilisationsTreatmentCollection.class, MobilisationsTreatment.class);
		return collection;
	}

	public static MobilisationsTreatment getMobilisationsTreatmentInstance(LookupService lookupService, int id) 
	{
		return (MobilisationsTreatment)lookupService.getLookupInstance(MobilisationsTreatment.class, MobilisationsTreatment.TYPE_ID, id);
	}
	

	public static HydrotherapyTransferOutCollection getHydrotherapyTransferOut(LookupService lookupService) {
		HydrotherapyTransferOutCollection collection =
			(HydrotherapyTransferOutCollection) lookupService.getLookupCollection(HydrotherapyTransferOut.TYPE_ID, 
				HydrotherapyTransferOutCollection.class, HydrotherapyTransferOut.class);
		return collection;
	}

	public static HydrotherapyTransferOut getHydrotherapyTransferOutInstance(LookupService lookupService, int id) 
	{
		return (HydrotherapyTransferOut)lookupService.getLookupInstance(HydrotherapyTransferOut.class, HydrotherapyTransferOut.TYPE_ID, id);
	}
	

	public static GaitReEducationGaitAspectCollection getGaitReEducationGaitAspect(LookupService lookupService) {
		GaitReEducationGaitAspectCollection collection =
			(GaitReEducationGaitAspectCollection) lookupService.getLookupCollection(GaitReEducationGaitAspect.TYPE_ID, 
				GaitReEducationGaitAspectCollection.class, GaitReEducationGaitAspect.class);
		return collection;
	}

	public static GaitReEducationGaitAspect getGaitReEducationGaitAspectInstance(LookupService lookupService, int id) 
	{
		return (GaitReEducationGaitAspect)lookupService.getLookupInstance(GaitReEducationGaitAspect.class, GaitReEducationGaitAspect.TYPE_ID, id);
	}
	
}



