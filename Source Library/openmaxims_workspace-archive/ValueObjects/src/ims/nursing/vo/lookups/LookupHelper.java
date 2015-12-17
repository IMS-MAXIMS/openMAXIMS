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
package ims.nursing.vo.lookups;

import ims.domain.lookups.LookupService;

/**
 * This is a generated interface.
 * Provides methods to get the ValueObject Lookup types of this namespace.
 * 
 */
public final class LookupHelper {
	public static BladderManagementAidsCollection getBladderManagementAids(LookupService lookupService) {
		BladderManagementAidsCollection collection =
			(BladderManagementAidsCollection) lookupService.getLookupCollection(BladderManagementAids.TYPE_ID, 
				BladderManagementAidsCollection.class, BladderManagementAids.class);
		return collection;
	}

	public static BladderManagementAids getBladderManagementAidsInstance(LookupService lookupService, int id) 
	{
		return (BladderManagementAids)lookupService.getLookupInstance(BladderManagementAids.class, BladderManagementAids.TYPE_ID, id);
	}
	

	public static BowelRoutinePerformedByCollection getBowelRoutinePerformedBy(LookupService lookupService) {
		BowelRoutinePerformedByCollection collection =
			(BowelRoutinePerformedByCollection) lookupService.getLookupCollection(BowelRoutinePerformedBy.TYPE_ID, 
				BowelRoutinePerformedByCollection.class, BowelRoutinePerformedBy.class);
		return collection;
	}

	public static BowelRoutinePerformedBy getBowelRoutinePerformedByInstance(LookupService lookupService, int id) 
	{
		return (BowelRoutinePerformedBy)lookupService.getLookupInstance(BowelRoutinePerformedBy.class, BowelRoutinePerformedBy.TYPE_ID, id);
	}
	

	public static SafetyLevelCollection getSafetyLevel(LookupService lookupService) {
		SafetyLevelCollection collection =
			(SafetyLevelCollection) lookupService.getLookupCollection(SafetyLevel.TYPE_ID, 
				SafetyLevelCollection.class, SafetyLevel.class);
		return collection;
	}

	public static SafetyLevel getSafetyLevelInstance(LookupService lookupService, int id) 
	{
		return (SafetyLevel)lookupService.getLookupInstance(SafetyLevel.class, SafetyLevel.TYPE_ID, id);
	}
	

	public static CarePlanStatusCollection getCarePlanStatus(LookupService lookupService) {
		CarePlanStatusCollection collection =
			(CarePlanStatusCollection) lookupService.getLookupCollection(CarePlanStatus.TYPE_ID, 
				CarePlanStatusCollection.class, CarePlanStatus.class);
		return collection;
	}

	public static CarePlanStatus getCarePlanStatusInstance(LookupService lookupService, int id) 
	{
		return (CarePlanStatus)lookupService.getLookupInstance(CarePlanStatus.class, CarePlanStatus.TYPE_ID, id);
	}
	

	public static CushionTypeCollection getCushionType(LookupService lookupService) {
		CushionTypeCollection collection =
			(CushionTypeCollection) lookupService.getLookupCollection(CushionType.TYPE_ID, 
				CushionTypeCollection.class, CushionType.class);
		return collection;
	}

	public static CushionType getCushionTypeInstance(LookupService lookupService, int id) 
	{
		return (CushionType)lookupService.getLookupInstance(CushionType.class, CushionType.TYPE_ID, id);
	}
	

	public static CarePlanInterventionStatusCollection getCarePlanInterventionStatus(LookupService lookupService) {
		CarePlanInterventionStatusCollection collection =
			(CarePlanInterventionStatusCollection) lookupService.getLookupCollection(CarePlanInterventionStatus.TYPE_ID, 
				CarePlanInterventionStatusCollection.class, CarePlanInterventionStatus.class);
		return collection;
	}

	public static CarePlanInterventionStatus getCarePlanInterventionStatusInstance(LookupService lookupService, int id) 
	{
		return (CarePlanInterventionStatus)lookupService.getLookupInstance(CarePlanInterventionStatus.class, CarePlanInterventionStatus.TYPE_ID, id);
	}
	

	public static CarePlanTemplateStatusCollection getCarePlanTemplateStatus(LookupService lookupService) {
		CarePlanTemplateStatusCollection collection =
			(CarePlanTemplateStatusCollection) lookupService.getLookupCollection(CarePlanTemplateStatus.TYPE_ID, 
				CarePlanTemplateStatusCollection.class, CarePlanTemplateStatus.class);
		return collection;
	}

	public static CarePlanTemplateStatus getCarePlanTemplateStatusInstance(LookupService lookupService, int id) 
	{
		return (CarePlanTemplateStatus)lookupService.getLookupInstance(CarePlanTemplateStatus.class, CarePlanTemplateStatus.TYPE_ID, id);
	}
	

	public static SkinWoundTypeCollection getSkinWoundType(LookupService lookupService) {
		SkinWoundTypeCollection collection =
			(SkinWoundTypeCollection) lookupService.getLookupCollection(SkinWoundType.TYPE_ID, 
				SkinWoundTypeCollection.class, SkinWoundType.class);
		return collection;
	}

	public static SkinWoundType getSkinWoundTypeInstance(LookupService lookupService, int id) 
	{
		return (SkinWoundType)lookupService.getLookupInstance(SkinWoundType.class, SkinWoundType.TYPE_ID, id);
	}
	

	public static SkinSecondaryDressingCollection getSkinSecondaryDressing(LookupService lookupService) {
		SkinSecondaryDressingCollection collection =
			(SkinSecondaryDressingCollection) lookupService.getLookupCollection(SkinSecondaryDressing.TYPE_ID, 
				SkinSecondaryDressingCollection.class, SkinSecondaryDressing.class);
		return collection;
	}

	public static SkinSecondaryDressing getSkinSecondaryDressingInstance(LookupService lookupService, int id) 
	{
		return (SkinSecondaryDressing)lookupService.getLookupInstance(SkinSecondaryDressing.class, SkinSecondaryDressing.TYPE_ID, id);
	}
	

	public static SkinPainCollection getSkinPain(LookupService lookupService) {
		SkinPainCollection collection =
			(SkinPainCollection) lookupService.getLookupCollection(SkinPain.TYPE_ID, 
				SkinPainCollection.class, SkinPain.class);
		return collection;
	}

	public static SkinPain getSkinPainInstance(LookupService lookupService, int id) 
	{
		return (SkinPain)lookupService.getLookupInstance(SkinPain.class, SkinPain.TYPE_ID, id);
	}
	

	public static SkinExudateTypeCollection getSkinExudateType(LookupService lookupService) {
		SkinExudateTypeCollection collection =
			(SkinExudateTypeCollection) lookupService.getLookupCollection(SkinExudateType.TYPE_ID, 
				SkinExudateTypeCollection.class, SkinExudateType.class);
		return collection;
	}

	public static SkinExudateType getSkinExudateTypeInstance(LookupService lookupService, int id) 
	{
		return (SkinExudateType)lookupService.getLookupInstance(SkinExudateType.class, SkinExudateType.TYPE_ID, id);
	}
	

	public static SkinSurroundingSkinCollection getSkinSurroundingSkin(LookupService lookupService) {
		SkinSurroundingSkinCollection collection =
			(SkinSurroundingSkinCollection) lookupService.getLookupCollection(SkinSurroundingSkin.TYPE_ID, 
				SkinSurroundingSkinCollection.class, SkinSurroundingSkin.class);
		return collection;
	}

	public static SkinSurroundingSkin getSkinSurroundingSkinInstance(LookupService lookupService, int id) 
	{
		return (SkinSurroundingSkin)lookupService.getLookupInstance(SkinSurroundingSkin.class, SkinSurroundingSkin.TYPE_ID, id);
	}
	

	public static SkinWoundBedCollection getSkinWoundBed(LookupService lookupService) {
		SkinWoundBedCollection collection =
			(SkinWoundBedCollection) lookupService.getLookupCollection(SkinWoundBed.TYPE_ID, 
				SkinWoundBedCollection.class, SkinWoundBed.class);
		return collection;
	}

	public static SkinWoundBed getSkinWoundBedInstance(LookupService lookupService, int id) 
	{
		return (SkinWoundBed)lookupService.getLookupInstance(SkinWoundBed.class, SkinWoundBed.TYPE_ID, id);
	}
	

	public static PainHypersensitivityCollection getPainHypersensitivity(LookupService lookupService) {
		PainHypersensitivityCollection collection =
			(PainHypersensitivityCollection) lookupService.getLookupCollection(PainHypersensitivity.TYPE_ID, 
				PainHypersensitivityCollection.class, PainHypersensitivity.class);
		return collection;
	}

	public static PainHypersensitivity getPainHypersensitivityInstance(LookupService lookupService, int id) 
	{
		return (PainHypersensitivity)lookupService.getLookupInstance(PainHypersensitivity.class, PainHypersensitivity.TYPE_ID, id);
	}
	

	public static PainSeverityCollection getPainSeverity(LookupService lookupService) {
		PainSeverityCollection collection =
			(PainSeverityCollection) lookupService.getLookupCollection(PainSeverity.TYPE_ID, 
				PainSeverityCollection.class, PainSeverity.class);
		return collection;
	}

	public static PainSeverity getPainSeverityInstance(LookupService lookupService, int id) 
	{
		return (PainSeverity)lookupService.getLookupInstance(PainSeverity.class, PainSeverity.TYPE_ID, id);
	}
	

	public static PainTypeCollection getPainType(LookupService lookupService) {
		PainTypeCollection collection =
			(PainTypeCollection) lookupService.getLookupCollection(PainType.TYPE_ID, 
				PainTypeCollection.class, PainType.class);
		return collection;
	}

	public static PainType getPainTypeInstance(LookupService lookupService, int id) 
	{
		return (PainType)lookupService.getLookupInstance(PainType.class, PainType.TYPE_ID, id);
	}
	

	public static MattressTypeCollection getMattressType(LookupService lookupService) {
		MattressTypeCollection collection =
			(MattressTypeCollection) lookupService.getLookupCollection(MattressType.TYPE_ID, 
				MattressTypeCollection.class, MattressType.class);
		return collection;
	}

	public static MattressType getMattressTypeInstance(LookupService lookupService, int id) 
	{
		return (MattressType)lookupService.getLookupInstance(MattressType.class, MattressType.TYPE_ID, id);
	}
	

	public static CPActionFrequencyCollection getCPActionFrequency(LookupService lookupService) {
		CPActionFrequencyCollection collection =
			(CPActionFrequencyCollection) lookupService.getLookupCollection(CPActionFrequency.TYPE_ID, 
				CPActionFrequencyCollection.class, CPActionFrequency.class);
		return collection;
	}

	public static CPActionFrequency getCPActionFrequencyInstance(LookupService lookupService, int id) 
	{
		return (CPActionFrequency)lookupService.getLookupInstance(CPActionFrequency.class, CPActionFrequency.TYPE_ID, id);
	}
	

	public static EnvironmentalChecklistCollection getEnvironmentalChecklist(LookupService lookupService) {
		EnvironmentalChecklistCollection collection =
			(EnvironmentalChecklistCollection) lookupService.getLookupCollection(EnvironmentalChecklist.TYPE_ID, 
				EnvironmentalChecklistCollection.class, EnvironmentalChecklist.class);
		return collection;
	}

	public static EnvironmentalChecklist getEnvironmentalChecklistInstance(LookupService lookupService, int id) 
	{
		return (EnvironmentalChecklist)lookupService.getLookupInstance(EnvironmentalChecklist.class, EnvironmentalChecklist.TYPE_ID, id);
	}
	

	public static PreferredLanguageCollection getPreferredLanguage(LookupService lookupService) {
		PreferredLanguageCollection collection =
			(PreferredLanguageCollection) lookupService.getLookupCollection(PreferredLanguage.TYPE_ID, 
				PreferredLanguageCollection.class, PreferredLanguage.class);
		return collection;
	}

	public static PreferredLanguage getPreferredLanguageInstance(LookupService lookupService, int id) 
	{
		return (PreferredLanguage)lookupService.getLookupInstance(PreferredLanguage.class, PreferredLanguage.TYPE_ID, id);
	}
	

	public static MechanicalEquipCollection getMechanicalEquip(LookupService lookupService) {
		MechanicalEquipCollection collection =
			(MechanicalEquipCollection) lookupService.getLookupCollection(MechanicalEquip.TYPE_ID, 
				MechanicalEquipCollection.class, MechanicalEquip.class);
		return collection;
	}

	public static MechanicalEquip getMechanicalEquipInstance(LookupService lookupService, int id) 
	{
		return (MechanicalEquip)lookupService.getLookupInstance(MechanicalEquip.class, MechanicalEquip.TYPE_ID, id);
	}
	

	public static PatientHandlingMovementCollection getPatientHandlingMovement(LookupService lookupService) {
		PatientHandlingMovementCollection collection =
			(PatientHandlingMovementCollection) lookupService.getLookupCollection(PatientHandlingMovement.TYPE_ID, 
				PatientHandlingMovementCollection.class, PatientHandlingMovement.class);
		return collection;
	}

	public static PatientHandlingMovement getPatientHandlingMovementInstance(LookupService lookupService, int id) 
	{
		return (PatientHandlingMovement)lookupService.getLookupInstance(PatientHandlingMovement.class, PatientHandlingMovement.TYPE_ID, id);
	}
	

	public static PlanOfCareIntervalCollection getPlanOfCareInterval(LookupService lookupService) {
		PlanOfCareIntervalCollection collection =
			(PlanOfCareIntervalCollection) lookupService.getLookupCollection(PlanOfCareInterval.TYPE_ID, 
				PlanOfCareIntervalCollection.class, PlanOfCareInterval.class);
		return collection;
	}

	public static PlanOfCareInterval getPlanOfCareIntervalInstance(LookupService lookupService, int id) 
	{
		return (PlanOfCareInterval)lookupService.getLookupInstance(PlanOfCareInterval.class, PlanOfCareInterval.TYPE_ID, id);
	}
	

	public static PlanOfCareGroupCollection getPlanOfCareGroup(LookupService lookupService) {
		PlanOfCareGroupCollection collection =
			(PlanOfCareGroupCollection) lookupService.getLookupCollection(PlanOfCareGroup.TYPE_ID, 
				PlanOfCareGroupCollection.class, PlanOfCareGroup.class);
		return collection;
	}

	public static PlanOfCareGroup getPlanOfCareGroupInstance(LookupService lookupService, int id) 
	{
		return (PlanOfCareGroup)lookupService.getLookupInstance(PlanOfCareGroup.class, PlanOfCareGroup.TYPE_ID, id);
	}
	

	public static PlanOfCareLevelOfInterventionCollection getPlanOfCareLevelOfIntervention(LookupService lookupService) {
		PlanOfCareLevelOfInterventionCollection collection =
			(PlanOfCareLevelOfInterventionCollection) lookupService.getLookupCollection(PlanOfCareLevelOfIntervention.TYPE_ID, 
				PlanOfCareLevelOfInterventionCollection.class, PlanOfCareLevelOfIntervention.class);
		return collection;
	}

	public static PlanOfCareLevelOfIntervention getPlanOfCareLevelOfInterventionInstance(LookupService lookupService, int id) 
	{
		return (PlanOfCareLevelOfIntervention)lookupService.getLookupInstance(PlanOfCareLevelOfIntervention.class, PlanOfCareLevelOfIntervention.TYPE_ID, id);
	}
	

	public static ValuableCollection getValuable(LookupService lookupService) {
		ValuableCollection collection =
			(ValuableCollection) lookupService.getLookupCollection(Valuable.TYPE_ID, 
				ValuableCollection.class, Valuable.class);
		return collection;
	}

	public static Valuable getValuableInstance(LookupService lookupService, int id) 
	{
		return (Valuable)lookupService.getLookupInstance(Valuable.class, Valuable.TYPE_ID, id);
	}
	

	public static MovementTypeCollection getMovementType(LookupService lookupService) {
		MovementTypeCollection collection =
			(MovementTypeCollection) lookupService.getLookupCollection(MovementType.TYPE_ID, 
				MovementTypeCollection.class, MovementType.class);
		return collection;
	}

	public static MovementType getMovementTypeInstance(LookupService lookupService, int id) 
	{
		return (MovementType)lookupService.getLookupInstance(MovementType.class, MovementType.TYPE_ID, id);
	}
	

	public static PropertyItemStatusCollection getPropertyItemStatus(LookupService lookupService) {
		PropertyItemStatusCollection collection =
			(PropertyItemStatusCollection) lookupService.getLookupCollection(PropertyItemStatus.TYPE_ID, 
				PropertyItemStatusCollection.class, PropertyItemStatus.class);
		return collection;
	}

	public static PropertyItemStatus getPropertyItemStatusInstance(LookupService lookupService, int id) 
	{
		return (PropertyItemStatus)lookupService.getLookupInstance(PropertyItemStatus.class, PropertyItemStatus.TYPE_ID, id);
	}
	

	public static PropertyItemCollection getPropertyItem(LookupService lookupService) {
		PropertyItemCollection collection =
			(PropertyItemCollection) lookupService.getLookupCollection(PropertyItem.TYPE_ID, 
				PropertyItemCollection.class, PropertyItem.class);
		return collection;
	}

	public static PropertyItem getPropertyItemInstance(LookupService lookupService, int id) 
	{
		return (PropertyItem)lookupService.getLookupInstance(PropertyItem.class, PropertyItem.TYPE_ID, id);
	}
	

	public static AdmissionQuestionCollection getAdmissionQuestion(LookupService lookupService) {
		AdmissionQuestionCollection collection =
			(AdmissionQuestionCollection) lookupService.getLookupCollection(AdmissionQuestion.TYPE_ID, 
				AdmissionQuestionCollection.class, AdmissionQuestion.class);
		return collection;
	}

	public static AdmissionQuestion getAdmissionQuestionInstance(LookupService lookupService, int id) 
	{
		return (AdmissionQuestion)lookupService.getLookupInstance(AdmissionQuestion.class, AdmissionQuestion.TYPE_ID, id);
	}
	

	public static PlanOfCareActionStatusCollection getPlanOfCareActionStatus(LookupService lookupService) {
		PlanOfCareActionStatusCollection collection =
			(PlanOfCareActionStatusCollection) lookupService.getLookupCollection(PlanOfCareActionStatus.TYPE_ID, 
				PlanOfCareActionStatusCollection.class, PlanOfCareActionStatus.class);
		return collection;
	}

	public static PlanOfCareActionStatus getPlanOfCareActionStatusInstance(LookupService lookupService, int id) 
	{
		return (PlanOfCareActionStatus)lookupService.getLookupInstance(PlanOfCareActionStatus.class, PlanOfCareActionStatus.TYPE_ID, id);
	}
	

	public static BlanchingCollection getBlanching(LookupService lookupService) {
		BlanchingCollection collection =
			(BlanchingCollection) lookupService.getLookupCollection(Blanching.TYPE_ID, 
				BlanchingCollection.class, Blanching.class);
		return collection;
	}

	public static Blanching getBlanchingInstance(LookupService lookupService, int id) 
	{
		return (Blanching)lookupService.getLookupInstance(Blanching.class, Blanching.TYPE_ID, id);
	}
	

	public static MUSTManagementCollection getMUSTManagement(LookupService lookupService) {
		MUSTManagementCollection collection =
			(MUSTManagementCollection) lookupService.getLookupCollection(MUSTManagement.TYPE_ID, 
				MUSTManagementCollection.class, MUSTManagement.class);
		return collection;
	}

	public static MUSTManagement getMUSTManagementInstance(LookupService lookupService, int id) 
	{
		return (MUSTManagement)lookupService.getLookupInstance(MUSTManagement.class, MUSTManagement.TYPE_ID, id);
	}
	

	public static StaffAssistanceCollection getStaffAssistance(LookupService lookupService) {
		StaffAssistanceCollection collection =
			(StaffAssistanceCollection) lookupService.getLookupCollection(StaffAssistance.TYPE_ID, 
				StaffAssistanceCollection.class, StaffAssistance.class);
		return collection;
	}

	public static StaffAssistance getStaffAssistanceInstance(LookupService lookupService, int id) 
	{
		return (StaffAssistance)lookupService.getLookupInstance(StaffAssistance.class, StaffAssistance.TYPE_ID, id);
	}
	

	public static PlanOfCareStatusCollection getPlanOfCareStatus(LookupService lookupService) {
		PlanOfCareStatusCollection collection =
			(PlanOfCareStatusCollection) lookupService.getLookupCollection(PlanOfCareStatus.TYPE_ID, 
				PlanOfCareStatusCollection.class, PlanOfCareStatus.class);
		return collection;
	}

	public static PlanOfCareStatus getPlanOfCareStatusInstance(LookupService lookupService, int id) 
	{
		return (PlanOfCareStatus)lookupService.getLookupInstance(PlanOfCareStatus.class, PlanOfCareStatus.TYPE_ID, id);
	}
	

	public static MRSATreatmentCollection getMRSATreatment(LookupService lookupService) {
		MRSATreatmentCollection collection =
			(MRSATreatmentCollection) lookupService.getLookupCollection(MRSATreatment.TYPE_ID, 
				MRSATreatmentCollection.class, MRSATreatment.class);
		return collection;
	}

	public static MRSATreatment getMRSATreatmentInstance(LookupService lookupService, int id) 
	{
		return (MRSATreatment)lookupService.getLookupInstance(MRSATreatment.class, MRSATreatment.TYPE_ID, id);
	}
	

	public static MRSAResultCollection getMRSAResult(LookupService lookupService) {
		MRSAResultCollection collection =
			(MRSAResultCollection) lookupService.getLookupCollection(MRSAResult.TYPE_ID, 
				MRSAResultCollection.class, MRSAResult.class);
		return collection;
	}

	public static MRSAResult getMRSAResultInstance(LookupService lookupService, int id) 
	{
		return (MRSAResult)lookupService.getLookupInstance(MRSAResult.class, MRSAResult.TYPE_ID, id);
	}
	

	public static MRSASiteCollection getMRSASite(LookupService lookupService) {
		MRSASiteCollection collection =
			(MRSASiteCollection) lookupService.getLookupCollection(MRSASite.TYPE_ID, 
				MRSASiteCollection.class, MRSASite.class);
		return collection;
	}

	public static MRSASite getMRSASiteInstance(LookupService lookupService, int id) 
	{
		return (MRSASite)lookupService.getLookupInstance(MRSASite.class, MRSASite.TYPE_ID, id);
	}
	

	public static NutritionalMethodTypeCollection getNutritionalMethodType(LookupService lookupService) {
		NutritionalMethodTypeCollection collection =
			(NutritionalMethodTypeCollection) lookupService.getLookupCollection(NutritionalMethodType.TYPE_ID, 
				NutritionalMethodTypeCollection.class, NutritionalMethodType.class);
		return collection;
	}

	public static NutritionalMethodType getNutritionalMethodTypeInstance(LookupService lookupService, int id) 
	{
		return (NutritionalMethodType)lookupService.getLookupInstance(NutritionalMethodType.class, NutritionalMethodType.TYPE_ID, id);
	}
	

	public static NutritionalMethodSiteCollection getNutritionalMethodSite(LookupService lookupService) {
		NutritionalMethodSiteCollection collection =
			(NutritionalMethodSiteCollection) lookupService.getLookupCollection(NutritionalMethodSite.TYPE_ID, 
				NutritionalMethodSiteCollection.class, NutritionalMethodSite.class);
		return collection;
	}

	public static NutritionalMethodSite getNutritionalMethodSiteInstance(LookupService lookupService, int id) 
	{
		return (NutritionalMethodSite)lookupService.getLookupInstance(NutritionalMethodSite.class, NutritionalMethodSite.TYPE_ID, id);
	}
	

	public static BladderTypeCollection getBladderType(LookupService lookupService) {
		BladderTypeCollection collection =
			(BladderTypeCollection) lookupService.getLookupCollection(BladderType.TYPE_ID, 
				BladderTypeCollection.class, BladderType.class);
		return collection;
	}

	public static BladderType getBladderTypeInstance(LookupService lookupService, int id) 
	{
		return (BladderType)lookupService.getLookupInstance(BladderType.class, BladderType.TYPE_ID, id);
	}
	

	public static BowelConstipationDiarrhoeaCollection getBowelConstipationDiarrhoea(LookupService lookupService) {
		BowelConstipationDiarrhoeaCollection collection =
			(BowelConstipationDiarrhoeaCollection) lookupService.getLookupCollection(BowelConstipationDiarrhoea.TYPE_ID, 
				BowelConstipationDiarrhoeaCollection.class, BowelConstipationDiarrhoea.class);
		return collection;
	}

	public static BowelConstipationDiarrhoea getBowelConstipationDiarrhoeaInstance(LookupService lookupService, int id) 
	{
		return (BowelConstipationDiarrhoea)lookupService.getLookupInstance(BowelConstipationDiarrhoea.class, BowelConstipationDiarrhoea.TYPE_ID, id);
	}
	

	public static BowelRoutineLocationCollection getBowelRoutineLocation(LookupService lookupService) {
		BowelRoutineLocationCollection collection =
			(BowelRoutineLocationCollection) lookupService.getLookupCollection(BowelRoutineLocation.TYPE_ID, 
				BowelRoutineLocationCollection.class, BowelRoutineLocation.class);
		return collection;
	}

	public static BowelRoutineLocation getBowelRoutineLocationInstance(LookupService lookupService, int id) 
	{
		return (BowelRoutineLocation)lookupService.getLookupInstance(BowelRoutineLocation.class, BowelRoutineLocation.TYPE_ID, id);
	}
	

	public static BowelTimeOfDayCollection getBowelTimeOfDay(LookupService lookupService) {
		BowelTimeOfDayCollection collection =
			(BowelTimeOfDayCollection) lookupService.getLookupCollection(BowelTimeOfDay.TYPE_ID, 
				BowelTimeOfDayCollection.class, BowelTimeOfDay.class);
		return collection;
	}

	public static BowelTimeOfDay getBowelTimeOfDayInstance(LookupService lookupService, int id) 
	{
		return (BowelTimeOfDay)lookupService.getLookupInstance(BowelTimeOfDay.class, BowelTimeOfDay.TYPE_ID, id);
	}
	

	public static BowelPatternCollection getBowelPattern(LookupService lookupService) {
		BowelPatternCollection collection =
			(BowelPatternCollection) lookupService.getLookupCollection(BowelPattern.TYPE_ID, 
				BowelPatternCollection.class, BowelPattern.class);
		return collection;
	}

	public static BowelPattern getBowelPatternInstance(LookupService lookupService, int id) 
	{
		return (BowelPattern)lookupService.getLookupInstance(BowelPattern.class, BowelPattern.TYPE_ID, id);
	}
	

	public static BowelRegimeCollection getBowelRegime(LookupService lookupService) {
		BowelRegimeCollection collection =
			(BowelRegimeCollection) lookupService.getLookupCollection(BowelRegime.TYPE_ID, 
				BowelRegimeCollection.class, BowelRegime.class);
		return collection;
	}

	public static BowelRegime getBowelRegimeInstance(LookupService lookupService, int id) 
	{
		return (BowelRegime)lookupService.getLookupInstance(BowelRegime.class, BowelRegime.TYPE_ID, id);
	}
	

	public static StoolTypeCollection getStoolType(LookupService lookupService) {
		StoolTypeCollection collection =
			(StoolTypeCollection) lookupService.getLookupCollection(StoolType.TYPE_ID, 
				StoolTypeCollection.class, StoolType.class);
		return collection;
	}

	public static StoolType getStoolTypeInstance(LookupService lookupService, int id) 
	{
		return (StoolType)lookupService.getLookupInstance(StoolType.class, StoolType.TYPE_ID, id);
	}
	

	public static BathingPatternCollection getBathingPattern(LookupService lookupService) {
		BathingPatternCollection collection =
			(BathingPatternCollection) lookupService.getLookupCollection(BathingPattern.TYPE_ID, 
				BathingPatternCollection.class, BathingPattern.class);
		return collection;
	}

	public static BathingPattern getBathingPatternInstance(LookupService lookupService, int id) 
	{
		return (BathingPattern)lookupService.getLookupInstance(BathingPattern.class, BathingPattern.TYPE_ID, id);
	}
	

	public static TransfersCollection getTransfers(LookupService lookupService) {
		TransfersCollection collection =
			(TransfersCollection) lookupService.getLookupCollection(Transfers.TYPE_ID, 
				TransfersCollection.class, Transfers.class);
		return collection;
	}

	public static Transfers getTransfersInstance(LookupService lookupService, int id) 
	{
		return (Transfers)lookupService.getLookupInstance(Transfers.class, Transfers.TYPE_ID, id);
	}
	

	public static MobilityAidsCollection getMobilityAids(LookupService lookupService) {
		MobilityAidsCollection collection =
			(MobilityAidsCollection) lookupService.getLookupCollection(MobilityAids.TYPE_ID, 
				MobilityAidsCollection.class, MobilityAids.class);
		return collection;
	}

	public static MobilityAids getMobilityAidsInstance(LookupService lookupService, int id) 
	{
		return (MobilityAids)lookupService.getLookupInstance(MobilityAids.class, MobilityAids.TYPE_ID, id);
	}
	

	public static MobilityStatusCollection getMobilityStatus(LookupService lookupService) {
		MobilityStatusCollection collection =
			(MobilityStatusCollection) lookupService.getLookupCollection(MobilityStatus.TYPE_ID, 
				MobilityStatusCollection.class, MobilityStatus.class);
		return collection;
	}

	public static MobilityStatus getMobilityStatusInstance(LookupService lookupService, int id) 
	{
		return (MobilityStatus)lookupService.getLookupInstance(MobilityStatus.class, MobilityStatus.TYPE_ID, id);
	}
	

	public static TurnsDurationCollection getTurnsDuration(LookupService lookupService) {
		TurnsDurationCollection collection =
			(TurnsDurationCollection) lookupService.getLookupCollection(TurnsDuration.TYPE_ID, 
				TurnsDurationCollection.class, TurnsDuration.class);
		return collection;
	}

	public static TurnsDuration getTurnsDurationInstance(LookupService lookupService, int id) 
	{
		return (TurnsDuration)lookupService.getLookupInstance(TurnsDuration.class, TurnsDuration.TYPE_ID, id);
	}
	

	public static TurnTypeCollection getTurnType(LookupService lookupService) {
		TurnTypeCollection collection =
			(TurnTypeCollection) lookupService.getLookupCollection(TurnType.TYPE_ID, 
				TurnTypeCollection.class, TurnType.class);
		return collection;
	}

	public static TurnType getTurnTypeInstance(LookupService lookupService, int id) 
	{
		return (TurnType)lookupService.getLookupInstance(TurnType.class, TurnType.TYPE_ID, id);
	}
	

	public static BreathingTreatmentCollection getBreathingTreatment(LookupService lookupService) {
		BreathingTreatmentCollection collection =
			(BreathingTreatmentCollection) lookupService.getLookupCollection(BreathingTreatment.TYPE_ID, 
				BreathingTreatmentCollection.class, BreathingTreatment.class);
		return collection;
	}

	public static BreathingTreatment getBreathingTreatmentInstance(LookupService lookupService, int id) 
	{
		return (BreathingTreatment)lookupService.getLookupInstance(BreathingTreatment.class, BreathingTreatment.TYPE_ID, id);
	}
	

	public static CommunicationProblemsCollection getCommunicationProblems(LookupService lookupService) {
		CommunicationProblemsCollection collection =
			(CommunicationProblemsCollection) lookupService.getLookupCollection(CommunicationProblems.TYPE_ID, 
				CommunicationProblemsCollection.class, CommunicationProblems.class);
		return collection;
	}

	public static CommunicationProblems getCommunicationProblemsInstance(LookupService lookupService, int id) 
	{
		return (CommunicationProblems)lookupService.getLookupInstance(CommunicationProblems.class, CommunicationProblems.TYPE_ID, id);
	}
	

	public static AssessmentInformationStatusCollection getAssessmentInformationStatus(LookupService lookupService) {
		AssessmentInformationStatusCollection collection =
			(AssessmentInformationStatusCollection) lookupService.getLookupCollection(AssessmentInformationStatus.TYPE_ID, 
				AssessmentInformationStatusCollection.class, AssessmentInformationStatus.class);
		return collection;
	}

	public static AssessmentInformationStatus getAssessmentInformationStatusInstance(LookupService lookupService, int id) 
	{
		return (AssessmentInformationStatus)lookupService.getLookupInstance(AssessmentInformationStatus.class, AssessmentInformationStatus.TYPE_ID, id);
	}
	

	public static AssessmentComponentTypeCollection getAssessmentComponentType(LookupService lookupService) {
		AssessmentComponentTypeCollection collection =
			(AssessmentComponentTypeCollection) lookupService.getLookupCollection(AssessmentComponentType.TYPE_ID, 
				AssessmentComponentTypeCollection.class, AssessmentComponentType.class);
		return collection;
	}

	public static AssessmentComponentType getAssessmentComponentTypeInstance(LookupService lookupService, int id) 
	{
		return (AssessmentComponentType)lookupService.getLookupInstance(AssessmentComponentType.class, AssessmentComponentType.TYPE_ID, id);
	}
	

	public static SkinFrequencyOfChangeCollection getSkinFrequencyOfChange(LookupService lookupService) {
		SkinFrequencyOfChangeCollection collection =
			(SkinFrequencyOfChangeCollection) lookupService.getLookupCollection(SkinFrequencyOfChange.TYPE_ID, 
				SkinFrequencyOfChangeCollection.class, SkinFrequencyOfChange.class);
		return collection;
	}

	public static SkinFrequencyOfChange getSkinFrequencyOfChangeInstance(LookupService lookupService, int id) 
	{
		return (SkinFrequencyOfChange)lookupService.getLookupInstance(SkinFrequencyOfChange.class, SkinFrequencyOfChange.TYPE_ID, id);
	}
	

	public static SkinPrimaryDressingCollection getSkinPrimaryDressing(LookupService lookupService) {
		SkinPrimaryDressingCollection collection =
			(SkinPrimaryDressingCollection) lookupService.getLookupCollection(SkinPrimaryDressing.TYPE_ID, 
				SkinPrimaryDressingCollection.class, SkinPrimaryDressing.class);
		return collection;
	}

	public static SkinPrimaryDressing getSkinPrimaryDressingInstance(LookupService lookupService, int id) 
	{
		return (SkinPrimaryDressing)lookupService.getLookupInstance(SkinPrimaryDressing.class, SkinPrimaryDressing.TYPE_ID, id);
	}
	

	public static SkinOdourCollection getSkinOdour(LookupService lookupService) {
		SkinOdourCollection collection =
			(SkinOdourCollection) lookupService.getLookupCollection(SkinOdour.TYPE_ID, 
				SkinOdourCollection.class, SkinOdour.class);
		return collection;
	}

	public static SkinOdour getSkinOdourInstance(LookupService lookupService, int id) 
	{
		return (SkinOdour)lookupService.getLookupInstance(SkinOdour.class, SkinOdour.TYPE_ID, id);
	}
	

	public static SkinExudateAmountCollection getSkinExudateAmount(LookupService lookupService) {
		SkinExudateAmountCollection collection =
			(SkinExudateAmountCollection) lookupService.getLookupCollection(SkinExudateAmount.TYPE_ID, 
				SkinExudateAmountCollection.class, SkinExudateAmount.class);
		return collection;
	}

	public static SkinExudateAmount getSkinExudateAmountInstance(LookupService lookupService, int id) 
	{
		return (SkinExudateAmount)lookupService.getLookupInstance(SkinExudateAmount.class, SkinExudateAmount.TYPE_ID, id);
	}
	

	public static SkinPressureSoreGradeCollection getSkinPressureSoreGrade(LookupService lookupService) {
		SkinPressureSoreGradeCollection collection =
			(SkinPressureSoreGradeCollection) lookupService.getLookupCollection(SkinPressureSoreGrade.TYPE_ID, 
				SkinPressureSoreGradeCollection.class, SkinPressureSoreGrade.class);
		return collection;
	}

	public static SkinPressureSoreGrade getSkinPressureSoreGradeInstance(LookupService lookupService, int id) 
	{
		return (SkinPressureSoreGrade)lookupService.getLookupInstance(SkinPressureSoreGrade.class, SkinPressureSoreGrade.TYPE_ID, id);
	}
	

	public static PainDepthCollection getPainDepth(LookupService lookupService) {
		PainDepthCollection collection =
			(PainDepthCollection) lookupService.getLookupCollection(PainDepth.TYPE_ID, 
				PainDepthCollection.class, PainDepth.class);
		return collection;
	}

	public static PainDepth getPainDepthInstance(LookupService lookupService, int id) 
	{
		return (PainDepth)lookupService.getLookupInstance(PainDepth.class, PainDepth.TYPE_ID, id);
	}
	

	public static PainProgressionCollection getPainProgression(LookupService lookupService) {
		PainProgressionCollection collection =
			(PainProgressionCollection) lookupService.getLookupCollection(PainProgression.TYPE_ID, 
				PainProgressionCollection.class, PainProgression.class);
		return collection;
	}

	public static PainProgression getPainProgressionInstance(LookupService lookupService, int id) 
	{
		return (PainProgression)lookupService.getLookupInstance(PainProgression.class, PainProgression.TYPE_ID, id);
	}
	

	public static PainOnsetCollection getPainOnset(LookupService lookupService) {
		PainOnsetCollection collection =
			(PainOnsetCollection) lookupService.getLookupCollection(PainOnset.TYPE_ID, 
				PainOnsetCollection.class, PainOnset.class);
		return collection;
	}

	public static PainOnset getPainOnsetInstance(LookupService lookupService, int id) 
	{
		return (PainOnset)lookupService.getLookupInstance(PainOnset.class, PainOnset.TYPE_ID, id);
	}
	

	public static TurnsPerformedByCollection getTurnsPerformedBy(LookupService lookupService) {
		TurnsPerformedByCollection collection =
			(TurnsPerformedByCollection) lookupService.getLookupCollection(TurnsPerformedBy.TYPE_ID, 
				TurnsPerformedByCollection.class, TurnsPerformedBy.class);
		return collection;
	}

	public static TurnsPerformedBy getTurnsPerformedByInstance(LookupService lookupService, int id) 
	{
		return (TurnsPerformedBy)lookupService.getLookupInstance(TurnsPerformedBy.class, TurnsPerformedBy.TYPE_ID, id);
	}
	

	public static FrequencyOfTurnsCollection getFrequencyOfTurns(LookupService lookupService) {
		FrequencyOfTurnsCollection collection =
			(FrequencyOfTurnsCollection) lookupService.getLookupCollection(FrequencyOfTurns.TYPE_ID, 
				FrequencyOfTurnsCollection.class, FrequencyOfTurns.class);
		return collection;
	}

	public static FrequencyOfTurns getFrequencyOfTurnsInstance(LookupService lookupService, int id) 
	{
		return (FrequencyOfTurns)lookupService.getLookupInstance(FrequencyOfTurns.class, FrequencyOfTurns.TYPE_ID, id);
	}
	

	public static HygieneActivitiesCollection getHygieneActivities(LookupService lookupService) {
		HygieneActivitiesCollection collection =
			(HygieneActivitiesCollection) lookupService.getLookupCollection(HygieneActivities.TYPE_ID, 
				HygieneActivitiesCollection.class, HygieneActivities.class);
		return collection;
	}

	public static HygieneActivities getHygieneActivitiesInstance(LookupService lookupService, int id) 
	{
		return (HygieneActivities)lookupService.getLookupInstance(HygieneActivities.class, HygieneActivities.TYPE_ID, id);
	}
	

	public static ChairTypeCollection getChairType(LookupService lookupService) {
		ChairTypeCollection collection =
			(ChairTypeCollection) lookupService.getLookupCollection(ChairType.TYPE_ID, 
				ChairTypeCollection.class, ChairType.class);
		return collection;
	}

	public static ChairType getChairTypeInstance(LookupService lookupService, int id) 
	{
		return (ChairType)lookupService.getLookupInstance(ChairType.class, ChairType.TYPE_ID, id);
	}
	

	public static BedTypeCollection getBedType(LookupService lookupService) {
		BedTypeCollection collection =
			(BedTypeCollection) lookupService.getLookupCollection(BedType.TYPE_ID, 
				BedTypeCollection.class, BedType.class);
		return collection;
	}

	public static BedType getBedTypeInstance(LookupService lookupService, int id) 
	{
		return (BedType)lookupService.getLookupInstance(BedType.class, BedType.TYPE_ID, id);
	}
	

	public static SpecialDietCollection getSpecialDiet(LookupService lookupService) {
		SpecialDietCollection collection =
			(SpecialDietCollection) lookupService.getLookupCollection(SpecialDiet.TYPE_ID, 
				SpecialDietCollection.class, SpecialDiet.class);
		return collection;
	}

	public static SpecialDiet getSpecialDietInstance(LookupService lookupService, int id) 
	{
		return (SpecialDiet)lookupService.getLookupInstance(SpecialDiet.class, SpecialDiet.TYPE_ID, id);
	}
	

	public static NutritionalMethodCollection getNutritionalMethod(LookupService lookupService) {
		NutritionalMethodCollection collection =
			(NutritionalMethodCollection) lookupService.getLookupCollection(NutritionalMethod.TYPE_ID, 
				NutritionalMethodCollection.class, NutritionalMethod.class);
		return collection;
	}

	public static NutritionalMethod getNutritionalMethodInstance(LookupService lookupService, int id) 
	{
		return (NutritionalMethod)lookupService.getLookupInstance(NutritionalMethod.class, NutritionalMethod.TYPE_ID, id);
	}
	

	public static BreathingAcuteChronicCollection getBreathingAcuteChronic(LookupService lookupService) {
		BreathingAcuteChronicCollection collection =
			(BreathingAcuteChronicCollection) lookupService.getLookupCollection(BreathingAcuteChronic.TYPE_ID, 
				BreathingAcuteChronicCollection.class, BreathingAcuteChronic.class);
		return collection;
	}

	public static BreathingAcuteChronic getBreathingAcuteChronicInstance(LookupService lookupService, int id) 
	{
		return (BreathingAcuteChronic)lookupService.getLookupInstance(BreathingAcuteChronic.class, BreathingAcuteChronic.TYPE_ID, id);
	}
	

	public static BreathingDyspnoeaCollection getBreathingDyspnoea(LookupService lookupService) {
		BreathingDyspnoeaCollection collection =
			(BreathingDyspnoeaCollection) lookupService.getLookupCollection(BreathingDyspnoea.TYPE_ID, 
				BreathingDyspnoeaCollection.class, BreathingDyspnoea.class);
		return collection;
	}

	public static BreathingDyspnoea getBreathingDyspnoeaInstance(LookupService lookupService, int id) 
	{
		return (BreathingDyspnoea)lookupService.getLookupInstance(BreathingDyspnoea.class, BreathingDyspnoea.TYPE_ID, id);
	}
	

	public static CarePlanInterventionManOptCollection getCarePlanInterventionManOpt(LookupService lookupService) {
		CarePlanInterventionManOptCollection collection =
			(CarePlanInterventionManOptCollection) lookupService.getLookupCollection(CarePlanInterventionManOpt.TYPE_ID, 
				CarePlanInterventionManOptCollection.class, CarePlanInterventionManOpt.class);
		return collection;
	}

	public static CarePlanInterventionManOpt getCarePlanInterventionManOptInstance(LookupService lookupService, int id) 
	{
		return (CarePlanInterventionManOpt)lookupService.getLookupInstance(CarePlanInterventionManOpt.class, CarePlanInterventionManOpt.TYPE_ID, id);
	}
	

	public static PainStatusCollection getPainStatus(LookupService lookupService) {
		PainStatusCollection collection =
			(PainStatusCollection) lookupService.getLookupCollection(PainStatus.TYPE_ID, 
				PainStatusCollection.class, PainStatus.class);
		return collection;
	}

	public static PainStatus getPainStatusInstance(LookupService lookupService, int id) 
	{
		return (PainStatus)lookupService.getLookupInstance(PainStatus.class, PainStatus.TYPE_ID, id);
	}
	

	public static SkinCleansedWithCollection getSkinCleansedWith(LookupService lookupService) {
		SkinCleansedWithCollection collection =
			(SkinCleansedWithCollection) lookupService.getLookupCollection(SkinCleansedWith.TYPE_ID, 
				SkinCleansedWithCollection.class, SkinCleansedWith.class);
		return collection;
	}

	public static SkinCleansedWith getSkinCleansedWithInstance(LookupService lookupService, int id) 
	{
		return (SkinCleansedWith)lookupService.getLookupInstance(SkinCleansedWith.class, SkinCleansedWith.TYPE_ID, id);
	}
	

	public static BowelOstomyTypeCollection getBowelOstomyType(LookupService lookupService) {
		BowelOstomyTypeCollection collection =
			(BowelOstomyTypeCollection) lookupService.getLookupCollection(BowelOstomyType.TYPE_ID, 
				BowelOstomyTypeCollection.class, BowelOstomyType.class);
		return collection;
	}

	public static BowelOstomyType getBowelOstomyTypeInstance(LookupService lookupService, int id) 
	{
		return (BowelOstomyType)lookupService.getLookupInstance(BowelOstomyType.class, BowelOstomyType.TYPE_ID, id);
	}
	

	public static AssessmentStatusCollection getAssessmentStatus(LookupService lookupService) {
		AssessmentStatusCollection collection =
			(AssessmentStatusCollection) lookupService.getLookupCollection(AssessmentStatus.TYPE_ID, 
				AssessmentStatusCollection.class, AssessmentStatus.class);
		return collection;
	}

	public static AssessmentStatus getAssessmentStatusInstance(LookupService lookupService, int id) 
	{
		return (AssessmentStatus)lookupService.getLookupInstance(AssessmentStatus.class, AssessmentStatus.TYPE_ID, id);
	}
	

	public static AssessmentTypeCollection getAssessmentType(LookupService lookupService) {
		AssessmentTypeCollection collection =
			(AssessmentTypeCollection) lookupService.getLookupCollection(AssessmentType.TYPE_ID, 
				AssessmentTypeCollection.class, AssessmentType.class);
		return collection;
	}

	public static AssessmentType getAssessmentTypeInstance(LookupService lookupService, int id) 
	{
		return (AssessmentType)lookupService.getLookupInstance(AssessmentType.class, AssessmentType.TYPE_ID, id);
	}
	

	public static BladderManagementTypeCollection getBladderManagementType(LookupService lookupService) {
		BladderManagementTypeCollection collection =
			(BladderManagementTypeCollection) lookupService.getLookupCollection(BladderManagementType.TYPE_ID, 
				BladderManagementTypeCollection.class, BladderManagementType.class);
		return collection;
	}

	public static BladderManagementType getBladderManagementTypeInstance(LookupService lookupService, int id) 
	{
		return (BladderManagementType)lookupService.getLookupInstance(BladderManagementType.class, BladderManagementType.TYPE_ID, id);
	}
	

	public static BladderManagementMethodCollection getBladderManagementMethod(LookupService lookupService) {
		BladderManagementMethodCollection collection =
			(BladderManagementMethodCollection) lookupService.getLookupCollection(BladderManagementMethod.TYPE_ID, 
				BladderManagementMethodCollection.class, BladderManagementMethod.class);
		return collection;
	}

	public static BladderManagementMethod getBladderManagementMethodInstance(LookupService lookupService, int id) 
	{
		return (BladderManagementMethod)lookupService.getLookupInstance(BladderManagementMethod.class, BladderManagementMethod.TYPE_ID, id);
	}
	

	public static UrinaryDiversionCollection getUrinaryDiversion(LookupService lookupService) {
		UrinaryDiversionCollection collection =
			(UrinaryDiversionCollection) lookupService.getLookupCollection(UrinaryDiversion.TYPE_ID, 
				UrinaryDiversionCollection.class, UrinaryDiversion.class);
		return collection;
	}

	public static UrinaryDiversion getUrinaryDiversionInstance(LookupService lookupService, int id) 
	{
		return (UrinaryDiversion)lookupService.getLookupInstance(UrinaryDiversion.class, UrinaryDiversion.TYPE_ID, id);
	}
	

	public static DependencyLevelCollection getDependencyLevel(LookupService lookupService) {
		DependencyLevelCollection collection =
			(DependencyLevelCollection) lookupService.getLookupCollection(DependencyLevel.TYPE_ID, 
				DependencyLevelCollection.class, DependencyLevel.class);
		return collection;
	}

	public static DependencyLevel getDependencyLevelInstance(LookupService lookupService, int id) 
	{
		return (DependencyLevel)lookupService.getLookupInstance(DependencyLevel.class, DependencyLevel.TYPE_ID, id);
	}
	

	public static ContinenceDayNightCollection getContinenceDayNight(LookupService lookupService) {
		ContinenceDayNightCollection collection =
			(ContinenceDayNightCollection) lookupService.getLookupCollection(ContinenceDayNight.TYPE_ID, 
				ContinenceDayNightCollection.class, ContinenceDayNight.class);
		return collection;
	}

	public static ContinenceDayNight getContinenceDayNightInstance(LookupService lookupService, int id) 
	{
		return (ContinenceDayNight)lookupService.getLookupInstance(ContinenceDayNight.class, ContinenceDayNight.TYPE_ID, id);
	}
	

	public static AbilityCollection getAbility(LookupService lookupService) {
		AbilityCollection collection =
			(AbilityCollection) lookupService.getLookupCollection(Ability.TYPE_ID, 
				AbilityCollection.class, Ability.class);
		return collection;
	}

	public static Ability getAbilityInstance(LookupService lookupService, int id) 
	{
		return (Ability)lookupService.getLookupInstance(Ability.class, Ability.TYPE_ID, id);
	}
	
}



