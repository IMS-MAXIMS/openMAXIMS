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
package ims.coe.vo.lookups;

import ims.domain.lookups.LookupService;

/**
 * This is a generated interface.
 * Provides methods to get the ValueObject Lookup types of this namespace.
 * 
 */
public final class LookupHelper {
	public static DescribeAppetiteCollection getDescribeAppetite(LookupService lookupService) {
		DescribeAppetiteCollection collection =
			(DescribeAppetiteCollection) lookupService.getLookupCollection(DescribeAppetite.TYPE_ID, 
				DescribeAppetiteCollection.class, DescribeAppetite.class);
		return collection;
	}

	public static DescribeAppetite getDescribeAppetiteInstance(LookupService lookupService, int id) 
	{
		return (DescribeAppetite)lookupService.getLookupInstance(DescribeAppetite.class, DescribeAppetite.TYPE_ID, id);
	}
	

	public static ManualDexterityCollection getManualDexterity(LookupService lookupService) {
		ManualDexterityCollection collection =
			(ManualDexterityCollection) lookupService.getLookupCollection(ManualDexterity.TYPE_ID, 
				ManualDexterityCollection.class, ManualDexterity.class);
		return collection;
	}

	public static ManualDexterity getManualDexterityInstance(LookupService lookupService, int id) 
	{
		return (ManualDexterity)lookupService.getLookupInstance(ManualDexterity.class, ManualDexterity.TYPE_ID, id);
	}
	

	public static OralAssessmentCollection getOralAssessment(LookupService lookupService) {
		OralAssessmentCollection collection =
			(OralAssessmentCollection) lookupService.getLookupCollection(OralAssessment.TYPE_ID, 
				OralAssessmentCollection.class, OralAssessment.class);
		return collection;
	}

	public static OralAssessment getOralAssessmentInstance(LookupService lookupService, int id) 
	{
		return (OralAssessment)lookupService.getLookupInstance(OralAssessment.class, OralAssessment.TYPE_ID, id);
	}
	

	public static SputumAmountCollection getSputumAmount(LookupService lookupService) {
		SputumAmountCollection collection =
			(SputumAmountCollection) lookupService.getLookupCollection(SputumAmount.TYPE_ID, 
				SputumAmountCollection.class, SputumAmount.class);
		return collection;
	}

	public static SputumAmount getSputumAmountInstance(LookupService lookupService, int id) 
	{
		return (SputumAmount)lookupService.getLookupInstance(SputumAmount.class, SputumAmount.TYPE_ID, id);
	}
	

	public static BowelMedicationCollection getBowelMedication(LookupService lookupService) {
		BowelMedicationCollection collection =
			(BowelMedicationCollection) lookupService.getLookupCollection(BowelMedication.TYPE_ID, 
				BowelMedicationCollection.class, BowelMedication.class);
		return collection;
	}

	public static BowelMedication getBowelMedicationInstance(LookupService lookupService, int id) 
	{
		return (BowelMedication)lookupService.getLookupInstance(BowelMedication.class, BowelMedication.TYPE_ID, id);
	}
	

	public static InfectionResultCollection getInfectionResult(LookupService lookupService) {
		InfectionResultCollection collection =
			(InfectionResultCollection) lookupService.getLookupCollection(InfectionResult.TYPE_ID, 
				InfectionResultCollection.class, InfectionResult.class);
		return collection;
	}

	public static InfectionResult getInfectionResultInstance(LookupService lookupService, int id) 
	{
		return (InfectionResult)lookupService.getLookupInstance(InfectionResult.class, InfectionResult.TYPE_ID, id);
	}
	

	public static HomeFacilitiesCollection getHomeFacilities(LookupService lookupService) {
		HomeFacilitiesCollection collection =
			(HomeFacilitiesCollection) lookupService.getLookupCollection(HomeFacilities.TYPE_ID, 
				HomeFacilitiesCollection.class, HomeFacilities.class);
		return collection;
	}

	public static HomeFacilities getHomeFacilitiesInstance(LookupService lookupService, int id) 
	{
		return (HomeFacilities)lookupService.getLookupInstance(HomeFacilities.class, HomeFacilities.TYPE_ID, id);
	}
	

	public static AccommodationHousingCollection getAccommodationHousing(LookupService lookupService) {
		AccommodationHousingCollection collection =
			(AccommodationHousingCollection) lookupService.getLookupCollection(AccommodationHousing.TYPE_ID, 
				AccommodationHousingCollection.class, AccommodationHousing.class);
		return collection;
	}

	public static AccommodationHousing getAccommodationHousingInstance(LookupService lookupService, int id) 
	{
		return (AccommodationHousing)lookupService.getLookupInstance(AccommodationHousing.class, AccommodationHousing.TYPE_ID, id);
	}
	

	public static FeetFindingsCollection getFeetFindings(LookupService lookupService) {
		FeetFindingsCollection collection =
			(FeetFindingsCollection) lookupService.getLookupCollection(FeetFindings.TYPE_ID, 
				FeetFindingsCollection.class, FeetFindings.class);
		return collection;
	}

	public static FeetFindings getFeetFindingsInstance(LookupService lookupService, int id) 
	{
		return (FeetFindings)lookupService.getLookupInstance(FeetFindings.class, FeetFindings.TYPE_ID, id);
	}
	

	public static DischargeFunctionalCollection getDischargeFunctional(LookupService lookupService) {
		DischargeFunctionalCollection collection =
			(DischargeFunctionalCollection) lookupService.getLookupCollection(DischargeFunctional.TYPE_ID, 
				DischargeFunctionalCollection.class, DischargeFunctional.class);
		return collection;
	}

	public static DischargeFunctional getDischargeFunctionalInstance(LookupService lookupService, int id) 
	{
		return (DischargeFunctional)lookupService.getLookupInstance(DischargeFunctional.class, DischargeFunctional.TYPE_ID, id);
	}
	

	public static DischargeActionsCollection getDischargeActions(LookupService lookupService) {
		DischargeActionsCollection collection =
			(DischargeActionsCollection) lookupService.getLookupCollection(DischargeActions.TYPE_ID, 
				DischargeActionsCollection.class, DischargeActions.class);
		return collection;
	}

	public static DischargeActions getDischargeActionsInstance(LookupService lookupService, int id) 
	{
		return (DischargeActions)lookupService.getLookupInstance(DischargeActions.class, DischargeActions.TYPE_ID, id);
	}
	

	public static DischargeDestinationCollection getDischargeDestination(LookupService lookupService) {
		DischargeDestinationCollection collection =
			(DischargeDestinationCollection) lookupService.getLookupCollection(DischargeDestination.TYPE_ID, 
				DischargeDestinationCollection.class, DischargeDestination.class);
		return collection;
	}

	public static DischargeDestination getDischargeDestinationInstance(LookupService lookupService, int id) 
	{
		return (DischargeDestination)lookupService.getLookupInstance(DischargeDestination.class, DischargeDestination.TYPE_ID, id);
	}
	

	public static EquipmentOtherCollection getEquipmentOther(LookupService lookupService) {
		EquipmentOtherCollection collection =
			(EquipmentOtherCollection) lookupService.getLookupCollection(EquipmentOther.TYPE_ID, 
				EquipmentOtherCollection.class, EquipmentOther.class);
		return collection;
	}

	public static EquipmentOther getEquipmentOtherInstance(LookupService lookupService, int id) 
	{
		return (EquipmentOther)lookupService.getLookupInstance(EquipmentOther.class, EquipmentOther.TYPE_ID, id);
	}
	

	public static MechanicalEquipmentCollection getMechanicalEquipment(LookupService lookupService) {
		MechanicalEquipmentCollection collection =
			(MechanicalEquipmentCollection) lookupService.getLookupCollection(MechanicalEquipment.TYPE_ID, 
				MechanicalEquipmentCollection.class, MechanicalEquipment.class);
		return collection;
	}

	public static MechanicalEquipment getMechanicalEquipmentInstance(LookupService lookupService, int id) 
	{
		return (MechanicalEquipment)lookupService.getLookupInstance(MechanicalEquipment.class, MechanicalEquipment.TYPE_ID, id);
	}
	

	public static PatientMovementCollection getPatientMovement(LookupService lookupService) {
		PatientMovementCollection collection =
			(PatientMovementCollection) lookupService.getLookupCollection(PatientMovement.TYPE_ID, 
				PatientMovementCollection.class, PatientMovement.class);
		return collection;
	}

	public static PatientMovement getPatientMovementInstance(LookupService lookupService, int id) 
	{
		return (PatientMovement)lookupService.getLookupInstance(PatientMovement.class, PatientMovement.TYPE_ID, id);
	}
	

	public static PatientHandlingAssessmentCollection getPatientHandlingAssessment(LookupService lookupService) {
		PatientHandlingAssessmentCollection collection =
			(PatientHandlingAssessmentCollection) lookupService.getLookupCollection(PatientHandlingAssessment.TYPE_ID, 
				PatientHandlingAssessmentCollection.class, PatientHandlingAssessment.class);
		return collection;
	}

	public static PatientHandlingAssessment getPatientHandlingAssessmentInstance(LookupService lookupService, int id) 
	{
		return (PatientHandlingAssessment)lookupService.getLookupInstance(PatientHandlingAssessment.class, PatientHandlingAssessment.TYPE_ID, id);
	}
	

	public static SleepMedicationCollection getSleepMedication(LookupService lookupService) {
		SleepMedicationCollection collection =
			(SleepMedicationCollection) lookupService.getLookupCollection(SleepMedication.TYPE_ID, 
				SleepMedicationCollection.class, SleepMedication.class);
		return collection;
	}

	public static SleepMedication getSleepMedicationInstance(LookupService lookupService, int id) 
	{
		return (SleepMedication)lookupService.getLookupInstance(SleepMedication.class, SleepMedication.TYPE_ID, id);
	}
	

	public static SkinConditionCollection getSkinCondition(LookupService lookupService) {
		SkinConditionCollection collection =
			(SkinConditionCollection) lookupService.getLookupCollection(SkinCondition.TYPE_ID, 
				SkinConditionCollection.class, SkinCondition.class);
		return collection;
	}

	public static SkinCondition getSkinConditionInstance(LookupService lookupService, int id) 
	{
		return (SkinCondition)lookupService.getLookupInstance(SkinCondition.class, SkinCondition.TYPE_ID, id);
	}
	

	public static ConditionOfNailsCollection getConditionOfNails(LookupService lookupService) {
		ConditionOfNailsCollection collection =
			(ConditionOfNailsCollection) lookupService.getLookupCollection(ConditionOfNails.TYPE_ID, 
				ConditionOfNailsCollection.class, ConditionOfNails.class);
		return collection;
	}

	public static ConditionOfNails getConditionOfNailsInstance(LookupService lookupService, int id) 
	{
		return (ConditionOfNails)lookupService.getLookupInstance(ConditionOfNails.class, ConditionOfNails.TYPE_ID, id);
	}
	

	public static ConditionOfHairCollection getConditionOfHair(LookupService lookupService) {
		ConditionOfHairCollection collection =
			(ConditionOfHairCollection) lookupService.getLookupCollection(ConditionOfHair.TYPE_ID, 
				ConditionOfHairCollection.class, ConditionOfHair.class);
		return collection;
	}

	public static ConditionOfHair getConditionOfHairInstance(LookupService lookupService, int id) 
	{
		return (ConditionOfHair)lookupService.getLookupInstance(ConditionOfHair.class, ConditionOfHair.TYPE_ID, id);
	}
	

	public static ConditionOfFeetCollection getConditionOfFeet(LookupService lookupService) {
		ConditionOfFeetCollection collection =
			(ConditionOfFeetCollection) lookupService.getLookupCollection(ConditionOfFeet.TYPE_ID, 
				ConditionOfFeetCollection.class, ConditionOfFeet.class);
		return collection;
	}

	public static ConditionOfFeet getConditionOfFeetInstance(LookupService lookupService, int id) 
	{
		return (ConditionOfFeet)lookupService.getLookupInstance(ConditionOfFeet.class, ConditionOfFeet.TYPE_ID, id);
	}
	

	public static PainMedicationCollection getPainMedication(LookupService lookupService) {
		PainMedicationCollection collection =
			(PainMedicationCollection) lookupService.getLookupCollection(PainMedication.TYPE_ID, 
				PainMedicationCollection.class, PainMedication.class);
		return collection;
	}

	public static PainMedication getPainMedicationInstance(LookupService lookupService, int id) 
	{
		return (PainMedication)lookupService.getLookupInstance(PainMedication.class, PainMedication.TYPE_ID, id);
	}
	

	public static ClubNameCollection getClubName(LookupService lookupService) {
		ClubNameCollection collection =
			(ClubNameCollection) lookupService.getLookupCollection(ClubName.TYPE_ID, 
				ClubNameCollection.class, ClubName.class);
		return collection;
	}

	public static ClubName getClubNameInstance(LookupService lookupService, int id) 
	{
		return (ClubName)lookupService.getLookupInstance(ClubName.class, ClubName.TYPE_ID, id);
	}
	

	public static EmotionalStateAssessmentCollection getEmotionalStateAssessment(LookupService lookupService) {
		EmotionalStateAssessmentCollection collection =
			(EmotionalStateAssessmentCollection) lookupService.getLookupCollection(EmotionalStateAssessment.TYPE_ID, 
				EmotionalStateAssessmentCollection.class, EmotionalStateAssessment.class);
		return collection;
	}

	public static EmotionalStateAssessment getEmotionalStateAssessmentInstance(LookupService lookupService, int id) 
	{
		return (EmotionalStateAssessment)lookupService.getLookupInstance(EmotionalStateAssessment.class, EmotionalStateAssessment.TYPE_ID, id);
	}
	

	public static SwallowingAbilityCollection getSwallowingAbility(LookupService lookupService) {
		SwallowingAbilityCollection collection =
			(SwallowingAbilityCollection) lookupService.getLookupCollection(SwallowingAbility.TYPE_ID, 
				SwallowingAbilityCollection.class, SwallowingAbility.class);
		return collection;
	}

	public static SwallowingAbility getSwallowingAbilityInstance(LookupService lookupService, int id) 
	{
		return (SwallowingAbility)lookupService.getLookupInstance(SwallowingAbility.class, SwallowingAbility.TYPE_ID, id);
	}
	

	public static ShavingPreferenceCollection getShavingPreference(LookupService lookupService) {
		ShavingPreferenceCollection collection =
			(ShavingPreferenceCollection) lookupService.getLookupCollection(ShavingPreference.TYPE_ID, 
				ShavingPreferenceCollection.class, ShavingPreference.class);
		return collection;
	}

	public static ShavingPreference getShavingPreferenceInstance(LookupService lookupService, int id) 
	{
		return (ShavingPreference)lookupService.getLookupInstance(ShavingPreference.class, ShavingPreference.TYPE_ID, id);
	}
	

	public static DressingAndGroomingPreferencesCollection getDressingAndGroomingPreferences(LookupService lookupService) {
		DressingAndGroomingPreferencesCollection collection =
			(DressingAndGroomingPreferencesCollection) lookupService.getLookupCollection(DressingAndGroomingPreferences.TYPE_ID, 
				DressingAndGroomingPreferencesCollection.class, DressingAndGroomingPreferences.class);
		return collection;
	}

	public static DressingAndGroomingPreferences getDressingAndGroomingPreferencesInstance(LookupService lookupService, int id) 
	{
		return (DressingAndGroomingPreferences)lookupService.getLookupInstance(DressingAndGroomingPreferences.class, DressingAndGroomingPreferences.TYPE_ID, id);
	}
	

	public static DressingAndGroomingActivitiesCollection getDressingAndGroomingActivities(LookupService lookupService) {
		DressingAndGroomingActivitiesCollection collection =
			(DressingAndGroomingActivitiesCollection) lookupService.getLookupCollection(DressingAndGroomingActivities.TYPE_ID, 
				DressingAndGroomingActivitiesCollection.class, DressingAndGroomingActivities.class);
		return collection;
	}

	public static DressingAndGroomingActivities getDressingAndGroomingActivitiesInstance(LookupService lookupService, int id) 
	{
		return (DressingAndGroomingActivities)lookupService.getLookupInstance(DressingAndGroomingActivities.class, DressingAndGroomingActivities.TYPE_ID, id);
	}
	

	public static VerballyCollection getVerbally(LookupService lookupService) {
		VerballyCollection collection =
			(VerballyCollection) lookupService.getLookupCollection(Verbally.TYPE_ID, 
				VerballyCollection.class, Verbally.class);
		return collection;
	}

	public static Verbally getVerballyInstance(LookupService lookupService, int id) 
	{
		return (Verbally)lookupService.getLookupInstance(Verbally.class, Verbally.TYPE_ID, id);
	}
	

	public static CommunicatesCollection getCommunicates(LookupService lookupService) {
		CommunicatesCollection collection =
			(CommunicatesCollection) lookupService.getLookupCollection(Communicates.TYPE_ID, 
				CommunicatesCollection.class, Communicates.class);
		return collection;
	}

	public static Communicates getCommunicatesInstance(LookupService lookupService, int id) 
	{
		return (Communicates)lookupService.getLookupInstance(Communicates.class, Communicates.TYPE_ID, id);
	}
	

	public static SpeechAndLanguageUnderstandingCollection getSpeechAndLanguageUnderstanding(LookupService lookupService) {
		SpeechAndLanguageUnderstandingCollection collection =
			(SpeechAndLanguageUnderstandingCollection) lookupService.getLookupCollection(SpeechAndLanguageUnderstanding.TYPE_ID, 
				SpeechAndLanguageUnderstandingCollection.class, SpeechAndLanguageUnderstanding.class);
		return collection;
	}

	public static SpeechAndLanguageUnderstanding getSpeechAndLanguageUnderstandingInstance(LookupService lookupService, int id) 
	{
		return (SpeechAndLanguageUnderstanding)lookupService.getLookupInstance(SpeechAndLanguageUnderstanding.class, SpeechAndLanguageUnderstanding.TYPE_ID, id);
	}
	

	public static SputumTypeCollection getSputumType(LookupService lookupService) {
		SputumTypeCollection collection =
			(SputumTypeCollection) lookupService.getLookupCollection(SputumType.TYPE_ID, 
				SputumTypeCollection.class, SputumType.class);
		return collection;
	}

	public static SputumType getSputumTypeInstance(LookupService lookupService, int id) 
	{
		return (SputumType)lookupService.getLookupInstance(SputumType.class, SputumType.TYPE_ID, id);
	}
	

	public static DiarrhoeaColourCollection getDiarrhoeaColour(LookupService lookupService) {
		DiarrhoeaColourCollection collection =
			(DiarrhoeaColourCollection) lookupService.getLookupCollection(DiarrhoeaColour.TYPE_ID, 
				DiarrhoeaColourCollection.class, DiarrhoeaColour.class);
		return collection;
	}

	public static DiarrhoeaColour getDiarrhoeaColourInstance(LookupService lookupService, int id) 
	{
		return (DiarrhoeaColour)lookupService.getLookupInstance(DiarrhoeaColour.class, DiarrhoeaColour.TYPE_ID, id);
	}
	

	public static DiarrhoeaOdourCollection getDiarrhoeaOdour(LookupService lookupService) {
		DiarrhoeaOdourCollection collection =
			(DiarrhoeaOdourCollection) lookupService.getLookupCollection(DiarrhoeaOdour.TYPE_ID, 
				DiarrhoeaOdourCollection.class, DiarrhoeaOdour.class);
		return collection;
	}

	public static DiarrhoeaOdour getDiarrhoeaOdourInstance(LookupService lookupService, int id) 
	{
		return (DiarrhoeaOdour)lookupService.getLookupInstance(DiarrhoeaOdour.class, DiarrhoeaOdour.TYPE_ID, id);
	}
	

	public static DiarrhoeaConsistencyCollection getDiarrhoeaConsistency(LookupService lookupService) {
		DiarrhoeaConsistencyCollection collection =
			(DiarrhoeaConsistencyCollection) lookupService.getLookupCollection(DiarrhoeaConsistency.TYPE_ID, 
				DiarrhoeaConsistencyCollection.class, DiarrhoeaConsistency.class);
		return collection;
	}

	public static DiarrhoeaConsistency getDiarrhoeaConsistencyInstance(LookupService lookupService, int id) 
	{
		return (DiarrhoeaConsistency)lookupService.getLookupInstance(DiarrhoeaConsistency.class, DiarrhoeaConsistency.TYPE_ID, id);
	}
	

	public static DiarrhoeaFrequencyCollection getDiarrhoeaFrequency(LookupService lookupService) {
		DiarrhoeaFrequencyCollection collection =
			(DiarrhoeaFrequencyCollection) lookupService.getLookupCollection(DiarrhoeaFrequency.TYPE_ID, 
				DiarrhoeaFrequencyCollection.class, DiarrhoeaFrequency.class);
		return collection;
	}

	public static DiarrhoeaFrequency getDiarrhoeaFrequencyInstance(LookupService lookupService, int id) 
	{
		return (DiarrhoeaFrequency)lookupService.getLookupInstance(DiarrhoeaFrequency.class, DiarrhoeaFrequency.TYPE_ID, id);
	}
	

	public static DiarrhoeaAmountCollection getDiarrhoeaAmount(LookupService lookupService) {
		DiarrhoeaAmountCollection collection =
			(DiarrhoeaAmountCollection) lookupService.getLookupCollection(DiarrhoeaAmount.TYPE_ID, 
				DiarrhoeaAmountCollection.class, DiarrhoeaAmount.class);
		return collection;
	}

	public static DiarrhoeaAmount getDiarrhoeaAmountInstance(LookupService lookupService, int id) 
	{
		return (DiarrhoeaAmount)lookupService.getLookupInstance(DiarrhoeaAmount.class, DiarrhoeaAmount.TYPE_ID, id);
	}
	

	public static BowelsOpenCollection getBowelsOpen(LookupService lookupService) {
		BowelsOpenCollection collection =
			(BowelsOpenCollection) lookupService.getLookupCollection(BowelsOpen.TYPE_ID, 
				BowelsOpenCollection.class, BowelsOpen.class);
		return collection;
	}

	public static BowelsOpen getBowelsOpenInstance(LookupService lookupService, int id) 
	{
		return (BowelsOpen)lookupService.getLookupInstance(BowelsOpen.class, BowelsOpen.TYPE_ID, id);
	}
	

	public static InfectionControlTypeCollection getInfectionControlType(LookupService lookupService) {
		InfectionControlTypeCollection collection =
			(InfectionControlTypeCollection) lookupService.getLookupCollection(InfectionControlType.TYPE_ID, 
				InfectionControlTypeCollection.class, InfectionControlType.class);
		return collection;
	}

	public static InfectionControlType getInfectionControlTypeInstance(LookupService lookupService, int id) 
	{
		return (InfectionControlType)lookupService.getLookupInstance(InfectionControlType.class, InfectionControlType.TYPE_ID, id);
	}
	

	public static ActivityLevelAidsUsedCollection getActivityLevelAidsUsed(LookupService lookupService) {
		ActivityLevelAidsUsedCollection collection =
			(ActivityLevelAidsUsedCollection) lookupService.getLookupCollection(ActivityLevelAidsUsed.TYPE_ID, 
				ActivityLevelAidsUsedCollection.class, ActivityLevelAidsUsed.class);
		return collection;
	}

	public static ActivityLevelAidsUsed getActivityLevelAidsUsedInstance(LookupService lookupService, int id) 
	{
		return (ActivityLevelAidsUsed)lookupService.getLookupInstance(ActivityLevelAidsUsed.class, ActivityLevelAidsUsed.TYPE_ID, id);
	}
	

	public static FormCommencementFilterCollection getFormCommencementFilter(LookupService lookupService) {
		FormCommencementFilterCollection collection =
			(FormCommencementFilterCollection) lookupService.getLookupCollection(FormCommencementFilter.TYPE_ID, 
				FormCommencementFilterCollection.class, FormCommencementFilter.class);
		return collection;
	}

	public static FormCommencementFilter getFormCommencementFilterInstance(LookupService lookupService, int id) 
	{
		return (FormCommencementFilter)lookupService.getLookupInstance(FormCommencementFilter.class, FormCommencementFilter.TYPE_ID, id);
	}
	

	public static FormsCommencedCollection getFormsCommenced(LookupService lookupService) {
		FormsCommencedCollection collection =
			(FormsCommencedCollection) lookupService.getLookupCollection(FormsCommenced.TYPE_ID, 
				FormsCommencedCollection.class, FormsCommenced.class);
		return collection;
	}

	public static FormsCommenced getFormsCommencedInstance(LookupService lookupService, int id) 
	{
		return (FormsCommenced)lookupService.getLookupInstance(FormsCommenced.class, FormsCommenced.TYPE_ID, id);
	}
	

	public static BladderSkillsCollection getBladderSkills(LookupService lookupService) {
		BladderSkillsCollection collection =
			(BladderSkillsCollection) lookupService.getLookupCollection(BladderSkills.TYPE_ID, 
				BladderSkillsCollection.class, BladderSkills.class);
		return collection;
	}

	public static BladderSkills getBladderSkillsInstance(LookupService lookupService, int id) 
	{
		return (BladderSkills)lookupService.getLookupInstance(BladderSkills.class, BladderSkills.TYPE_ID, id);
	}
	

	public static ContinenceTypeCollection getContinenceType(LookupService lookupService) {
		ContinenceTypeCollection collection =
			(ContinenceTypeCollection) lookupService.getLookupCollection(ContinenceType.TYPE_ID, 
				ContinenceTypeCollection.class, ContinenceType.class);
		return collection;
	}

	public static ContinenceType getContinenceTypeInstance(LookupService lookupService, int id) 
	{
		return (ContinenceType)lookupService.getLookupInstance(ContinenceType.class, ContinenceType.TYPE_ID, id);
	}
	

	public static ActivityLevelActivityCollection getActivityLevelActivity(LookupService lookupService) {
		ActivityLevelActivityCollection collection =
			(ActivityLevelActivityCollection) lookupService.getLookupCollection(ActivityLevelActivity.TYPE_ID, 
				ActivityLevelActivityCollection.class, ActivityLevelActivity.class);
		return collection;
	}

	public static ActivityLevelActivity getActivityLevelActivityInstance(LookupService lookupService, int id) 
	{
		return (ActivityLevelActivity)lookupService.getLookupInstance(ActivityLevelActivity.class, ActivityLevelActivity.TYPE_ID, id);
	}
	

	public static AccommodationLivingArrangementsCollection getAccommodationLivingArrangements(LookupService lookupService) {
		AccommodationLivingArrangementsCollection collection =
			(AccommodationLivingArrangementsCollection) lookupService.getLookupCollection(AccommodationLivingArrangements.TYPE_ID, 
				AccommodationLivingArrangementsCollection.class, AccommodationLivingArrangements.class);
		return collection;
	}

	public static AccommodationLivingArrangements getAccommodationLivingArrangementsInstance(LookupService lookupService, int id) 
	{
		return (AccommodationLivingArrangements)lookupService.getLookupInstance(AccommodationLivingArrangements.class, AccommodationLivingArrangements.TYPE_ID, id);
	}
	
}



