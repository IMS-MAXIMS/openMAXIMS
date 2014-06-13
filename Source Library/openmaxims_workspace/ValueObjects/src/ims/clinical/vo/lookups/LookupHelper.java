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
package ims.clinical.vo.lookups;

import ims.domain.lookups.LookupService;

/**
 * This is a generated interface.
 * Provides methods to get the ValueObject Lookup types of this namespace.
 * 
 */
public final class LookupHelper {
	public static TreatmentInterventionTypeCollection getTreatmentInterventionType(LookupService lookupService) {
		TreatmentInterventionTypeCollection collection =
			(TreatmentInterventionTypeCollection) lookupService.getLookupCollection(TreatmentInterventionType.TYPE_ID, 
				TreatmentInterventionTypeCollection.class, TreatmentInterventionType.class);
		return collection;
	}

	public static TreatmentInterventionType getTreatmentInterventionTypeInstance(LookupService lookupService, int id) 
	{
		return (TreatmentInterventionType)lookupService.getLookupInstance(TreatmentInterventionType.class, TreatmentInterventionType.TYPE_ID, id);
	}
	

	public static AnaestheticUsedCollection getAnaestheticUsed(LookupService lookupService) {
		AnaestheticUsedCollection collection =
			(AnaestheticUsedCollection) lookupService.getLookupCollection(AnaestheticUsed.TYPE_ID, 
				AnaestheticUsedCollection.class, AnaestheticUsed.class);
		return collection;
	}

	public static AnaestheticUsed getAnaestheticUsedInstance(LookupService lookupService, int id) 
	{
		return (AnaestheticUsed)lookupService.getLookupInstance(AnaestheticUsed.class, AnaestheticUsed.TYPE_ID, id);
	}
	

	public static ClinicalOutcomeCategoryCollection getClinicalOutcomeCategory(LookupService lookupService) {
		ClinicalOutcomeCategoryCollection collection =
			(ClinicalOutcomeCategoryCollection) lookupService.getLookupCollection(ClinicalOutcomeCategory.TYPE_ID, 
				ClinicalOutcomeCategoryCollection.class, ClinicalOutcomeCategory.class);
		return collection;
	}

	public static ClinicalOutcomeCategory getClinicalOutcomeCategoryInstance(LookupService lookupService, int id) 
	{
		return (ClinicalOutcomeCategory)lookupService.getLookupInstance(ClinicalOutcomeCategory.class, ClinicalOutcomeCategory.TYPE_ID, id);
	}
	

	public static EDischargeSummarySectionCollection getEDischargeSummarySection(LookupService lookupService) {
		EDischargeSummarySectionCollection collection =
			(EDischargeSummarySectionCollection) lookupService.getLookupCollection(EDischargeSummarySection.TYPE_ID, 
				EDischargeSummarySectionCollection.class, EDischargeSummarySection.class);
		return collection;
	}

	public static EDischargeSummarySection getEDischargeSummarySectionInstance(LookupService lookupService, int id) 
	{
		return (EDischargeSummarySection)lookupService.getLookupInstance(EDischargeSummarySection.class, EDischargeSummarySection.TYPE_ID, id);
	}
	

	public static AdditonalClinicalInformationCollection getAdditonalClinicalInformation(LookupService lookupService) {
		AdditonalClinicalInformationCollection collection =
			(AdditonalClinicalInformationCollection) lookupService.getLookupCollection(AdditonalClinicalInformation.TYPE_ID, 
				AdditonalClinicalInformationCollection.class, AdditonalClinicalInformation.class);
		return collection;
	}

	public static AdditonalClinicalInformation getAdditonalClinicalInformationInstance(LookupService lookupService, int id) 
	{
		return (AdditonalClinicalInformation)lookupService.getLookupInstance(AdditonalClinicalInformation.class, AdditonalClinicalInformation.TYPE_ID, id);
	}
	

	public static MedicationDurationCollection getMedicationDuration(LookupService lookupService) {
		MedicationDurationCollection collection =
			(MedicationDurationCollection) lookupService.getLookupCollection(MedicationDuration.TYPE_ID, 
				MedicationDurationCollection.class, MedicationDuration.class);
		return collection;
	}

	public static MedicationDuration getMedicationDurationInstance(LookupService lookupService, int id) 
	{
		return (MedicationDuration)lookupService.getLookupInstance(MedicationDuration.class, MedicationDuration.TYPE_ID, id);
	}
	

	public static AdviceApplicatiableForUnitCollection getAdviceApplicatiableForUnit(LookupService lookupService) {
		AdviceApplicatiableForUnitCollection collection =
			(AdviceApplicatiableForUnitCollection) lookupService.getLookupCollection(AdviceApplicatiableForUnit.TYPE_ID, 
				AdviceApplicatiableForUnitCollection.class, AdviceApplicatiableForUnit.class);
		return collection;
	}

	public static AdviceApplicatiableForUnit getAdviceApplicatiableForUnitInstance(LookupService lookupService, int id) 
	{
		return (AdviceApplicatiableForUnit)lookupService.getLookupInstance(AdviceApplicatiableForUnit.class, AdviceApplicatiableForUnit.TYPE_ID, id);
	}
	

	public static ReturnToWorkAdviceCollection getReturnToWorkAdvice(LookupService lookupService) {
		ReturnToWorkAdviceCollection collection =
			(ReturnToWorkAdviceCollection) lookupService.getLookupCollection(ReturnToWorkAdvice.TYPE_ID, 
				ReturnToWorkAdviceCollection.class, ReturnToWorkAdvice.class);
		return collection;
	}

	public static ReturnToWorkAdvice getReturnToWorkAdviceInstance(LookupService lookupService, int id) 
	{
		return (ReturnToWorkAdvice)lookupService.getLookupInstance(ReturnToWorkAdvice.class, ReturnToWorkAdvice.TYPE_ID, id);
	}
	

	public static AnaestheticTypeCollection getAnaestheticType(LookupService lookupService) {
		AnaestheticTypeCollection collection =
			(AnaestheticTypeCollection) lookupService.getLookupCollection(AnaestheticType.TYPE_ID, 
				AnaestheticTypeCollection.class, AnaestheticType.class);
		return collection;
	}

	public static AnaestheticType getAnaestheticTypeInstance(LookupService lookupService, int id) 
	{
		return (AnaestheticType)lookupService.getLookupInstance(AnaestheticType.class, AnaestheticType.TYPE_ID, id);
	}
	

	public static IllicitDrugsCurrentStatusCollection getIllicitDrugsCurrentStatus(LookupService lookupService) {
		IllicitDrugsCurrentStatusCollection collection =
			(IllicitDrugsCurrentStatusCollection) lookupService.getLookupCollection(IllicitDrugsCurrentStatus.TYPE_ID, 
				IllicitDrugsCurrentStatusCollection.class, IllicitDrugsCurrentStatus.class);
		return collection;
	}

	public static IllicitDrugsCurrentStatus getIllicitDrugsCurrentStatusInstance(LookupService lookupService, int id) 
	{
		return (IllicitDrugsCurrentStatus)lookupService.getLookupInstance(IllicitDrugsCurrentStatus.class, IllicitDrugsCurrentStatus.TYPE_ID, id);
	}
	

	public static TourniquetPressureCollection getTourniquetPressure(LookupService lookupService) {
		TourniquetPressureCollection collection =
			(TourniquetPressureCollection) lookupService.getLookupCollection(TourniquetPressure.TYPE_ID, 
				TourniquetPressureCollection.class, TourniquetPressure.class);
		return collection;
	}

	public static TourniquetPressure getTourniquetPressureInstance(LookupService lookupService, int id) 
	{
		return (TourniquetPressure)lookupService.getLookupInstance(TourniquetPressure.class, TourniquetPressure.TYPE_ID, id);
	}
	

	public static TourniquetPositionCollection getTourniquetPosition(LookupService lookupService) {
		TourniquetPositionCollection collection =
			(TourniquetPositionCollection) lookupService.getLookupCollection(TourniquetPosition.TYPE_ID, 
				TourniquetPositionCollection.class, TourniquetPosition.class);
		return collection;
	}

	public static TourniquetPosition getTourniquetPositionInstance(LookupService lookupService, int id) 
	{
		return (TourniquetPosition)lookupService.getLookupInstance(TourniquetPosition.class, TourniquetPosition.TYPE_ID, id);
	}
	

	public static TableDevicesCollection getTableDevices(LookupService lookupService) {
		TableDevicesCollection collection =
			(TableDevicesCollection) lookupService.getLookupCollection(TableDevices.TYPE_ID, 
				TableDevicesCollection.class, TableDevices.class);
		return collection;
	}

	public static TableDevices getTableDevicesInstance(LookupService lookupService, int id) 
	{
		return (TableDevices)lookupService.getLookupInstance(TableDevices.class, TableDevices.TYPE_ID, id);
	}
	

	public static LocalAnaestheticCollection getLocalAnaesthetic(LookupService lookupService) {
		LocalAnaestheticCollection collection =
			(LocalAnaestheticCollection) lookupService.getLookupCollection(LocalAnaesthetic.TYPE_ID, 
				LocalAnaestheticCollection.class, LocalAnaesthetic.class);
		return collection;
	}

	public static LocalAnaesthetic getLocalAnaestheticInstance(LookupService lookupService, int id) 
	{
		return (LocalAnaesthetic)lookupService.getLookupInstance(LocalAnaesthetic.class, LocalAnaesthetic.TYPE_ID, id);
	}
	

	public static DressingsAndAidsCollection getDressingsAndAids(LookupService lookupService) {
		DressingsAndAidsCollection collection =
			(DressingsAndAidsCollection) lookupService.getLookupCollection(DressingsAndAids.TYPE_ID, 
				DressingsAndAidsCollection.class, DressingsAndAids.class);
		return collection;
	}

	public static DressingsAndAids getDressingsAndAidsInstance(LookupService lookupService, int id) 
	{
		return (DressingsAndAids)lookupService.getLookupInstance(DressingsAndAids.class, DressingsAndAids.TYPE_ID, id);
	}
	

	public static ProcedureHighCostDrugCollection getProcedureHighCostDrug(LookupService lookupService) {
		ProcedureHighCostDrugCollection collection =
			(ProcedureHighCostDrugCollection) lookupService.getLookupCollection(ProcedureHighCostDrug.TYPE_ID, 
				ProcedureHighCostDrugCollection.class, ProcedureHighCostDrug.class);
		return collection;
	}

	public static ProcedureHighCostDrug getProcedureHighCostDrugInstance(LookupService lookupService, int id) 
	{
		return (ProcedureHighCostDrug)lookupService.getLookupInstance(ProcedureHighCostDrug.class, ProcedureHighCostDrug.TYPE_ID, id);
	}
	

	public static OutcomeOfClinicAttendanceCollection getOutcomeOfClinicAttendance(LookupService lookupService) {
		OutcomeOfClinicAttendanceCollection collection =
			(OutcomeOfClinicAttendanceCollection) lookupService.getLookupCollection(OutcomeOfClinicAttendance.TYPE_ID, 
				OutcomeOfClinicAttendanceCollection.class, OutcomeOfClinicAttendance.class);
		return collection;
	}

	public static OutcomeOfClinicAttendance getOutcomeOfClinicAttendanceInstance(LookupService lookupService, int id) 
	{
		return (OutcomeOfClinicAttendance)lookupService.getLookupInstance(OutcomeOfClinicAttendance.class, OutcomeOfClinicAttendance.TYPE_ID, id);
	}
	

	public static NurseEnabledInstructionsCollection getNurseEnabledInstructions(LookupService lookupService) {
		NurseEnabledInstructionsCollection collection =
			(NurseEnabledInstructionsCollection) lookupService.getLookupCollection(NurseEnabledInstructions.TYPE_ID, 
				NurseEnabledInstructionsCollection.class, NurseEnabledInstructions.class);
		return collection;
	}

	public static NurseEnabledInstructions getNurseEnabledInstructionsInstance(LookupService lookupService, int id) 
	{
		return (NurseEnabledInstructions)lookupService.getLookupInstance(NurseEnabledInstructions.class, NurseEnabledInstructions.TYPE_ID, id);
	}
	

	public static DiathermyTypeCollection getDiathermyType(LookupService lookupService) {
		DiathermyTypeCollection collection =
			(DiathermyTypeCollection) lookupService.getLookupCollection(DiathermyType.TYPE_ID, 
				DiathermyTypeCollection.class, DiathermyType.class);
		return collection;
	}

	public static DiathermyType getDiathermyTypeInstance(LookupService lookupService, int id) 
	{
		return (DiathermyType)lookupService.getLookupInstance(DiathermyType.class, DiathermyType.TYPE_ID, id);
	}
	

	public static DressingCollection getDressing(LookupService lookupService) {
		DressingCollection collection =
			(DressingCollection) lookupService.getLookupCollection(Dressing.TYPE_ID, 
				DressingCollection.class, Dressing.class);
		return collection;
	}

	public static Dressing getDressingInstance(LookupService lookupService, int id) 
	{
		return (Dressing)lookupService.getLookupInstance(Dressing.class, Dressing.TYPE_ID, id);
	}
	

	public static LocalAnaestheticTypeCollection getLocalAnaestheticType(LookupService lookupService) {
		LocalAnaestheticTypeCollection collection =
			(LocalAnaestheticTypeCollection) lookupService.getLookupCollection(LocalAnaestheticType.TYPE_ID, 
				LocalAnaestheticTypeCollection.class, LocalAnaestheticType.class);
		return collection;
	}

	public static LocalAnaestheticType getLocalAnaestheticTypeInstance(LookupService lookupService, int id) 
	{
		return (LocalAnaestheticType)lookupService.getLookupInstance(LocalAnaestheticType.class, LocalAnaestheticType.TYPE_ID, id);
	}
	

	public static SkinPreparationusedCollection getSkinPreparationused(LookupService lookupService) {
		SkinPreparationusedCollection collection =
			(SkinPreparationusedCollection) lookupService.getLookupCollection(SkinPreparationused.TYPE_ID, 
				SkinPreparationusedCollection.class, SkinPreparationused.class);
		return collection;
	}

	public static SkinPreparationused getSkinPreparationusedInstance(LookupService lookupService, int id) 
	{
		return (SkinPreparationused)lookupService.getLookupInstance(SkinPreparationused.class, SkinPreparationused.TYPE_ID, id);
	}
	

	public static ReasonNotFitForSurgeryCollection getReasonNotFitForSurgery(LookupService lookupService) {
		ReasonNotFitForSurgeryCollection collection =
			(ReasonNotFitForSurgeryCollection) lookupService.getLookupCollection(ReasonNotFitForSurgery.TYPE_ID, 
				ReasonNotFitForSurgeryCollection.class, ReasonNotFitForSurgery.class);
		return collection;
	}

	public static ReasonNotFitForSurgery getReasonNotFitForSurgeryInstance(LookupService lookupService, int id) 
	{
		return (ReasonNotFitForSurgery)lookupService.getLookupInstance(ReasonNotFitForSurgery.class, ReasonNotFitForSurgery.TYPE_ID, id);
	}
	

	public static RACPMedicationStatusCollection getRACPMedicationStatus(LookupService lookupService) {
		RACPMedicationStatusCollection collection =
			(RACPMedicationStatusCollection) lookupService.getLookupCollection(RACPMedicationStatus.TYPE_ID, 
				RACPMedicationStatusCollection.class, RACPMedicationStatus.class);
		return collection;
	}

	public static RACPMedicationStatus getRACPMedicationStatusInstance(LookupService lookupService, int id) 
	{
		return (RACPMedicationStatus)lookupService.getLookupInstance(RACPMedicationStatus.class, RACPMedicationStatus.TYPE_ID, id);
	}
	

	public static RACPMedicationCollection getRACPMedication(LookupService lookupService) {
		RACPMedicationCollection collection =
			(RACPMedicationCollection) lookupService.getLookupCollection(RACPMedication.TYPE_ID, 
				RACPMedicationCollection.class, RACPMedication.class);
		return collection;
	}

	public static RACPMedication getRACPMedicationInstance(LookupService lookupService, int id) 
	{
		return (RACPMedication)lookupService.getLookupInstance(RACPMedication.class, RACPMedication.TYPE_ID, id);
	}
	

	public static RACPExerciseECGInterpretationCollection getRACPExerciseECGInterpretation(LookupService lookupService) {
		RACPExerciseECGInterpretationCollection collection =
			(RACPExerciseECGInterpretationCollection) lookupService.getLookupCollection(RACPExerciseECGInterpretation.TYPE_ID, 
				RACPExerciseECGInterpretationCollection.class, RACPExerciseECGInterpretation.class);
		return collection;
	}

	public static RACPExerciseECGInterpretation getRACPExerciseECGInterpretationInstance(LookupService lookupService, int id) 
	{
		return (RACPExerciseECGInterpretation)lookupService.getLookupInstance(RACPExerciseECGInterpretation.class, RACPExerciseECGInterpretation.TYPE_ID, id);
	}
	

	public static RACPExerciseECGResultCollection getRACPExerciseECGResult(LookupService lookupService) {
		RACPExerciseECGResultCollection collection =
			(RACPExerciseECGResultCollection) lookupService.getLookupCollection(RACPExerciseECGResult.TYPE_ID, 
				RACPExerciseECGResultCollection.class, RACPExerciseECGResult.class);
		return collection;
	}

	public static RACPExerciseECGResult getRACPExerciseECGResultInstance(LookupService lookupService, int id) 
	{
		return (RACPExerciseECGResult)lookupService.getLookupInstance(RACPExerciseECGResult.class, RACPExerciseECGResult.TYPE_ID, id);
	}
	

	public static RACPStopTestReasonCollection getRACPStopTestReason(LookupService lookupService) {
		RACPStopTestReasonCollection collection =
			(RACPStopTestReasonCollection) lookupService.getLookupCollection(RACPStopTestReason.TYPE_ID, 
				RACPStopTestReasonCollection.class, RACPStopTestReason.class);
		return collection;
	}

	public static RACPStopTestReason getRACPStopTestReasonInstance(LookupService lookupService, int id) 
	{
		return (RACPStopTestReason)lookupService.getLookupInstance(RACPStopTestReason.class, RACPStopTestReason.TYPE_ID, id);
	}
	

	public static RACPMedicationAtTestCollection getRACPMedicationAtTest(LookupService lookupService) {
		RACPMedicationAtTestCollection collection =
			(RACPMedicationAtTestCollection) lookupService.getLookupCollection(RACPMedicationAtTest.TYPE_ID, 
				RACPMedicationAtTestCollection.class, RACPMedicationAtTest.class);
		return collection;
	}

	public static RACPMedicationAtTest getRACPMedicationAtTestInstance(LookupService lookupService, int id) 
	{
		return (RACPMedicationAtTest)lookupService.getLookupInstance(RACPMedicationAtTest.class, RACPMedicationAtTest.TYPE_ID, id);
	}
	

	public static RACPPreAssessmentCHDCollection getRACPPreAssessmentCHD(LookupService lookupService) {
		RACPPreAssessmentCHDCollection collection =
			(RACPPreAssessmentCHDCollection) lookupService.getLookupCollection(RACPPreAssessmentCHD.TYPE_ID, 
				RACPPreAssessmentCHDCollection.class, RACPPreAssessmentCHD.class);
		return collection;
	}

	public static RACPPreAssessmentCHD getRACPPreAssessmentCHDInstance(LookupService lookupService, int id) 
	{
		return (RACPPreAssessmentCHD)lookupService.getLookupInstance(RACPPreAssessmentCHD.class, RACPPreAssessmentCHD.TYPE_ID, id);
	}
	

	public static RACPProtocolCollection getRACPProtocol(LookupService lookupService) {
		RACPProtocolCollection collection =
			(RACPProtocolCollection) lookupService.getLookupCollection(RACPProtocol.TYPE_ID, 
				RACPProtocolCollection.class, RACPProtocol.class);
		return collection;
	}

	public static RACPProtocol getRACPProtocolInstance(LookupService lookupService, int id) 
	{
		return (RACPProtocol)lookupService.getLookupInstance(RACPProtocol.class, RACPProtocol.TYPE_ID, id);
	}
	

	public static DiabetesStatusCollection getDiabetesStatus(LookupService lookupService) {
		DiabetesStatusCollection collection =
			(DiabetesStatusCollection) lookupService.getLookupCollection(DiabetesStatus.TYPE_ID, 
				DiabetesStatusCollection.class, DiabetesStatus.class);
		return collection;
	}

	public static DiabetesStatus getDiabetesStatusInstance(LookupService lookupService, int id) 
	{
		return (DiabetesStatus)lookupService.getLookupInstance(DiabetesStatus.class, DiabetesStatus.TYPE_ID, id);
	}
	

	public static SymptomDurationCollection getSymptomDuration(LookupService lookupService) {
		SymptomDurationCollection collection =
			(SymptomDurationCollection) lookupService.getLookupCollection(SymptomDuration.TYPE_ID, 
				SymptomDurationCollection.class, SymptomDuration.class);
		return collection;
	}

	public static SymptomDuration getSymptomDurationInstance(LookupService lookupService, int id) 
	{
		return (SymptomDuration)lookupService.getLookupInstance(SymptomDuration.class, SymptomDuration.TYPE_ID, id);
	}
	

	public static DischargeLetterStatusCollection getDischargeLetterStatus(LookupService lookupService) {
		DischargeLetterStatusCollection collection =
			(DischargeLetterStatusCollection) lookupService.getLookupCollection(DischargeLetterStatus.TYPE_ID, 
				DischargeLetterStatusCollection.class, DischargeLetterStatus.class);
		return collection;
	}

	public static DischargeLetterStatus getDischargeLetterStatusInstance(LookupService lookupService, int id) 
	{
		return (DischargeLetterStatus)lookupService.getLookupInstance(DischargeLetterStatus.class, DischargeLetterStatus.TYPE_ID, id);
	}
	

	public static TTORequiredCollection getTTORequired(LookupService lookupService) {
		TTORequiredCollection collection =
			(TTORequiredCollection) lookupService.getLookupCollection(TTORequired.TYPE_ID, 
				TTORequiredCollection.class, TTORequired.class);
		return collection;
	}

	public static TTORequired getTTORequiredInstance(LookupService lookupService, int id) 
	{
		return (TTORequired)lookupService.getLookupInstance(TTORequired.class, TTORequired.TYPE_ID, id);
	}
	

	public static DoseFormIndicatorCollection getDoseFormIndicator(LookupService lookupService) {
		DoseFormIndicatorCollection collection =
			(DoseFormIndicatorCollection) lookupService.getLookupCollection(DoseFormIndicator.TYPE_ID, 
				DoseFormIndicatorCollection.class, DoseFormIndicator.class);
		return collection;
	}

	public static DoseFormIndicator getDoseFormIndicatorInstance(LookupService lookupService, int id) 
	{
		return (DoseFormIndicator)lookupService.getLookupInstance(DoseFormIndicator.class, DoseFormIndicator.TYPE_ID, id);
	}
	

	public static CoMorbiditiesCollection getCoMorbidities(LookupService lookupService) {
		CoMorbiditiesCollection collection =
			(CoMorbiditiesCollection) lookupService.getLookupCollection(CoMorbidities.TYPE_ID, 
				CoMorbiditiesCollection.class, CoMorbidities.class);
		return collection;
	}

	public static CoMorbidities getCoMorbiditiesInstance(LookupService lookupService, int id) 
	{
		return (CoMorbidities)lookupService.getLookupInstance(CoMorbidities.class, CoMorbidities.TYPE_ID, id);
	}
	

	public static ReferralDisciplineCollection getReferralDiscipline(LookupService lookupService) {
		ReferralDisciplineCollection collection =
			(ReferralDisciplineCollection) lookupService.getLookupCollection(ReferralDiscipline.TYPE_ID, 
				ReferralDisciplineCollection.class, ReferralDiscipline.class);
		return collection;
	}

	public static ReferralDiscipline getReferralDisciplineInstance(LookupService lookupService, int id) 
	{
		return (ReferralDiscipline)lookupService.getLookupInstance(ReferralDiscipline.class, ReferralDiscipline.TYPE_ID, id);
	}
	

	public static SurgeryDischargeDestinationCollection getSurgeryDischargeDestination(LookupService lookupService) {
		SurgeryDischargeDestinationCollection collection =
			(SurgeryDischargeDestinationCollection) lookupService.getLookupCollection(SurgeryDischargeDestination.TYPE_ID, 
				SurgeryDischargeDestinationCollection.class, SurgeryDischargeDestination.class);
		return collection;
	}

	public static SurgeryDischargeDestination getSurgeryDischargeDestinationInstance(LookupService lookupService, int id) 
	{
		return (SurgeryDischargeDestination)lookupService.getLookupInstance(SurgeryDischargeDestination.class, SurgeryDischargeDestination.TYPE_ID, id);
	}
	

	public static SpecialtyFunctionCodeCollection getSpecialtyFunctionCode(LookupService lookupService) {
		SpecialtyFunctionCodeCollection collection =
			(SpecialtyFunctionCodeCollection) lookupService.getLookupCollection(SpecialtyFunctionCode.TYPE_ID, 
				SpecialtyFunctionCodeCollection.class, SpecialtyFunctionCode.class);
		return collection;
	}

	public static SpecialtyFunctionCode getSpecialtyFunctionCodeInstance(LookupService lookupService, int id) 
	{
		return (SpecialtyFunctionCode)lookupService.getLookupInstance(SpecialtyFunctionCode.class, SpecialtyFunctionCode.TYPE_ID, id);
	}
	

	public static DelayReasonGPUrgentReferralCollection getDelayReasonGPUrgentReferral(LookupService lookupService) {
		DelayReasonGPUrgentReferralCollection collection =
			(DelayReasonGPUrgentReferralCollection) lookupService.getLookupCollection(DelayReasonGPUrgentReferral.TYPE_ID, 
				DelayReasonGPUrgentReferralCollection.class, DelayReasonGPUrgentReferral.class);
		return collection;
	}

	public static DelayReasonGPUrgentReferral getDelayReasonGPUrgentReferralInstance(LookupService lookupService, int id) 
	{
		return (DelayReasonGPUrgentReferral)lookupService.getLookupInstance(DelayReasonGPUrgentReferral.class, DelayReasonGPUrgentReferral.TYPE_ID, id);
	}
	

	public static HSShowerLocationCollection getHSShowerLocation(LookupService lookupService) {
		HSShowerLocationCollection collection =
			(HSShowerLocationCollection) lookupService.getLookupCollection(HSShowerLocation.TYPE_ID, 
				HSShowerLocationCollection.class, HSShowerLocation.class);
		return collection;
	}

	public static HSShowerLocation getHSShowerLocationInstance(LookupService lookupService, int id) 
	{
		return (HSShowerLocation)lookupService.getLookupInstance(HSShowerLocation.class, HSShowerLocation.TYPE_ID, id);
	}
	

	public static HSToiletLocationCollection getHSToiletLocation(LookupService lookupService) {
		HSToiletLocationCollection collection =
			(HSToiletLocationCollection) lookupService.getLookupCollection(HSToiletLocation.TYPE_ID, 
				HSToiletLocationCollection.class, HSToiletLocation.class);
		return collection;
	}

	public static HSToiletLocation getHSToiletLocationInstance(LookupService lookupService, int id) 
	{
		return (HSToiletLocation)lookupService.getLookupInstance(HSToiletLocation.class, HSToiletLocation.TYPE_ID, id);
	}
	

	public static HSBathroomLocationCollection getHSBathroomLocation(LookupService lookupService) {
		HSBathroomLocationCollection collection =
			(HSBathroomLocationCollection) lookupService.getLookupCollection(HSBathroomLocation.TYPE_ID, 
				HSBathroomLocationCollection.class, HSBathroomLocation.class);
		return collection;
	}

	public static HSBathroomLocation getHSBathroomLocationInstance(LookupService lookupService, int id) 
	{
		return (HSBathroomLocation)lookupService.getLookupInstance(HSBathroomLocation.class, HSBathroomLocation.TYPE_ID, id);
	}
	

	public static HSRailsSideCollection getHSRailsSide(LookupService lookupService) {
		HSRailsSideCollection collection =
			(HSRailsSideCollection) lookupService.getLookupCollection(HSRailsSide.TYPE_ID, 
				HSRailsSideCollection.class, HSRailsSide.class);
		return collection;
	}

	public static HSRailsSide getHSRailsSideInstance(LookupService lookupService, int id) 
	{
		return (HSRailsSide)lookupService.getLookupInstance(HSRailsSide.class, HSRailsSide.TYPE_ID, id);
	}
	

	public static HSRailsCollection getHSRails(LookupService lookupService) {
		HSRailsCollection collection =
			(HSRailsCollection) lookupService.getLookupCollection(HSRails.TYPE_ID, 
				HSRailsCollection.class, HSRails.class);
		return collection;
	}

	public static HSRails getHSRailsInstance(LookupService lookupService, int id) 
	{
		return (HSRails)lookupService.getLookupInstance(HSRails.class, HSRails.TYPE_ID, id);
	}
	

	public static HSStairsCollection getHSStairs(LookupService lookupService) {
		HSStairsCollection collection =
			(HSStairsCollection) lookupService.getLookupCollection(HSStairs.TYPE_ID, 
				HSStairsCollection.class, HSStairs.class);
		return collection;
	}

	public static HSStairs getHSStairsInstance(LookupService lookupService, int id) 
	{
		return (HSStairs)lookupService.getLookupInstance(HSStairs.class, HSStairs.TYPE_ID, id);
	}
	

	public static HSFloorLevelCollection getHSFloorLevel(LookupService lookupService) {
		HSFloorLevelCollection collection =
			(HSFloorLevelCollection) lookupService.getLookupCollection(HSFloorLevel.TYPE_ID, 
				HSFloorLevelCollection.class, HSFloorLevel.class);
		return collection;
	}

	public static HSFloorLevel getHSFloorLevelInstance(LookupService lookupService, int id) 
	{
		return (HSFloorLevel)lookupService.getLookupInstance(HSFloorLevel.class, HSFloorLevel.TYPE_ID, id);
	}
	

	public static HSOwnershipCollection getHSOwnership(LookupService lookupService) {
		HSOwnershipCollection collection =
			(HSOwnershipCollection) lookupService.getLookupCollection(HSOwnership.TYPE_ID, 
				HSOwnershipCollection.class, HSOwnership.class);
		return collection;
	}

	public static HSOwnership getHSOwnershipInstance(LookupService lookupService, int id) 
	{
		return (HSOwnership)lookupService.getLookupInstance(HSOwnership.class, HSOwnership.TYPE_ID, id);
	}
	

	public static HSLiftCollection getHSLift(LookupService lookupService) {
		HSLiftCollection collection =
			(HSLiftCollection) lookupService.getLookupCollection(HSLift.TYPE_ID, 
				HSLiftCollection.class, HSLift.class);
		return collection;
	}

	public static HSLift getHSLiftInstance(LookupService lookupService, int id) 
	{
		return (HSLift)lookupService.getLookupInstance(HSLift.class, HSLift.TYPE_ID, id);
	}
	

	public static HSSupervisedByCollection getHSSupervisedBy(LookupService lookupService) {
		HSSupervisedByCollection collection =
			(HSSupervisedByCollection) lookupService.getLookupCollection(HSSupervisedBy.TYPE_ID, 
				HSSupervisedByCollection.class, HSSupervisedBy.class);
		return collection;
	}

	public static HSSupervisedBy getHSSupervisedByInstance(LookupService lookupService, int id) 
	{
		return (HSSupervisedBy)lookupService.getLookupInstance(HSSupervisedBy.class, HSSupervisedBy.TYPE_ID, id);
	}
	

	public static HSAccomTypeCollection getHSAccomType(LookupService lookupService) {
		HSAccomTypeCollection collection =
			(HSAccomTypeCollection) lookupService.getLookupCollection(HSAccomType.TYPE_ID, 
				HSAccomTypeCollection.class, HSAccomType.class);
		return collection;
	}

	public static HSAccomType getHSAccomTypeInstance(LookupService lookupService, int id) 
	{
		return (HSAccomType)lookupService.getLookupInstance(HSAccomType.class, HSAccomType.TYPE_ID, id);
	}
	

	public static ReferralSourceCollection getReferralSource(LookupService lookupService) {
		ReferralSourceCollection collection =
			(ReferralSourceCollection) lookupService.getLookupCollection(ReferralSource.TYPE_ID, 
				ReferralSourceCollection.class, ReferralSource.class);
		return collection;
	}

	public static ReferralSource getReferralSourceInstance(LookupService lookupService, int id) 
	{
		return (ReferralSource)lookupService.getLookupInstance(ReferralSource.class, ReferralSource.TYPE_ID, id);
	}
	

	public static TypeOfReferralCollection getTypeOfReferral(LookupService lookupService) {
		TypeOfReferralCollection collection =
			(TypeOfReferralCollection) lookupService.getLookupCollection(TypeOfReferral.TYPE_ID, 
				TypeOfReferralCollection.class, TypeOfReferral.class);
		return collection;
	}

	public static TypeOfReferral getTypeOfReferralInstance(LookupService lookupService, int id) 
	{
		return (TypeOfReferral)lookupService.getLookupInstance(TypeOfReferral.class, TypeOfReferral.TYPE_ID, id);
	}
	

	public static NoteTypeCollection getNoteType(LookupService lookupService) {
		NoteTypeCollection collection =
			(NoteTypeCollection) lookupService.getLookupCollection(NoteType.TYPE_ID, 
				NoteTypeCollection.class, NoteType.class);
		return collection;
	}

	public static NoteType getNoteTypeInstance(LookupService lookupService, int id) 
	{
		return (NoteType)lookupService.getLookupInstance(NoteType.class, NoteType.TYPE_ID, id);
	}
	

	public static GoalPlanningOutcomeCollection getGoalPlanningOutcome(LookupService lookupService) {
		GoalPlanningOutcomeCollection collection =
			(GoalPlanningOutcomeCollection) lookupService.getLookupCollection(GoalPlanningOutcome.TYPE_ID, 
				GoalPlanningOutcomeCollection.class, GoalPlanningOutcome.class);
		return collection;
	}

	public static GoalPlanningOutcome getGoalPlanningOutcomeInstance(LookupService lookupService, int id) 
	{
		return (GoalPlanningOutcome)lookupService.getLookupInstance(GoalPlanningOutcome.class, GoalPlanningOutcome.TYPE_ID, id);
	}
	

	public static PlanOfCareGroupingsCollection getPlanOfCareGroupings(LookupService lookupService) {
		PlanOfCareGroupingsCollection collection =
			(PlanOfCareGroupingsCollection) lookupService.getLookupCollection(PlanOfCareGroupings.TYPE_ID, 
				PlanOfCareGroupingsCollection.class, PlanOfCareGroupings.class);
		return collection;
	}

	public static PlanOfCareGroupings getPlanOfCareGroupingsInstance(LookupService lookupService, int id) 
	{
		return (PlanOfCareGroupings)lookupService.getLookupInstance(PlanOfCareGroupings.class, PlanOfCareGroupings.TYPE_ID, id);
	}
	

	public static CodingItemTypeCollection getCodingItemType(LookupService lookupService) {
		CodingItemTypeCollection collection =
			(CodingItemTypeCollection) lookupService.getLookupCollection(CodingItemType.TYPE_ID, 
				CodingItemTypeCollection.class, CodingItemType.class);
		return collection;
	}

	public static CodingItemType getCodingItemTypeInstance(LookupService lookupService, int id) 
	{
		return (CodingItemType)lookupService.getLookupInstance(CodingItemType.class, CodingItemType.TYPE_ID, id);
	}
	

	public static InvasiveDeviceActionCollection getInvasiveDeviceAction(LookupService lookupService) {
		InvasiveDeviceActionCollection collection =
			(InvasiveDeviceActionCollection) lookupService.getLookupCollection(InvasiveDeviceAction.TYPE_ID, 
				InvasiveDeviceActionCollection.class, InvasiveDeviceAction.class);
		return collection;
	}

	public static InvasiveDeviceAction getInvasiveDeviceActionInstance(LookupService lookupService, int id) 
	{
		return (InvasiveDeviceAction)lookupService.getLookupInstance(InvasiveDeviceAction.class, InvasiveDeviceAction.TYPE_ID, id);
	}
	

	public static InvasiveDeviceVIPScaleCollection getInvasiveDeviceVIPScale(LookupService lookupService) {
		InvasiveDeviceVIPScaleCollection collection =
			(InvasiveDeviceVIPScaleCollection) lookupService.getLookupCollection(InvasiveDeviceVIPScale.TYPE_ID, 
				InvasiveDeviceVIPScaleCollection.class, InvasiveDeviceVIPScale.class);
		return collection;
	}

	public static InvasiveDeviceVIPScale getInvasiveDeviceVIPScaleInstance(LookupService lookupService, int id) 
	{
		return (InvasiveDeviceVIPScale)lookupService.getLookupInstance(InvasiveDeviceVIPScale.class, InvasiveDeviceVIPScale.TYPE_ID, id);
	}
	

	public static PresentAbsentUnknownCollection getPresentAbsentUnknown(LookupService lookupService) {
		PresentAbsentUnknownCollection collection =
			(PresentAbsentUnknownCollection) lookupService.getLookupCollection(PresentAbsentUnknown.TYPE_ID, 
				PresentAbsentUnknownCollection.class, PresentAbsentUnknown.class);
		return collection;
	}

	public static PresentAbsentUnknown getPresentAbsentUnknownInstance(LookupService lookupService, int id) 
	{
		return (PresentAbsentUnknown)lookupService.getLookupInstance(PresentAbsentUnknown.class, PresentAbsentUnknown.TYPE_ID, id);
	}
	

	public static MDTAreaCollection getMDTArea(LookupService lookupService) {
		MDTAreaCollection collection =
			(MDTAreaCollection) lookupService.getLookupCollection(MDTArea.TYPE_ID, 
				MDTAreaCollection.class, MDTArea.class);
		return collection;
	}

	public static MDTArea getMDTAreaInstance(LookupService lookupService, int id) 
	{
		return (MDTArea)lookupService.getLookupInstance(MDTArea.class, MDTArea.TYPE_ID, id);
	}
	

	public static InpatientFollowUpCollection getInpatientFollowUp(LookupService lookupService) {
		InpatientFollowUpCollection collection =
			(InpatientFollowUpCollection) lookupService.getLookupCollection(InpatientFollowUp.TYPE_ID, 
				InpatientFollowUpCollection.class, InpatientFollowUp.class);
		return collection;
	}

	public static InpatientFollowUp getInpatientFollowUpInstance(LookupService lookupService, int id) 
	{
		return (InpatientFollowUp)lookupService.getLookupInstance(InpatientFollowUp.class, InpatientFollowUp.TYPE_ID, id);
	}
	

	public static ClinicalCorrespondenceTypeCollection getClinicalCorrespondenceType(LookupService lookupService) {
		ClinicalCorrespondenceTypeCollection collection =
			(ClinicalCorrespondenceTypeCollection) lookupService.getLookupCollection(ClinicalCorrespondenceType.TYPE_ID, 
				ClinicalCorrespondenceTypeCollection.class, ClinicalCorrespondenceType.class);
		return collection;
	}

	public static ClinicalCorrespondenceType getClinicalCorrespondenceTypeInstance(LookupService lookupService, int id) 
	{
		return (ClinicalCorrespondenceType)lookupService.getLookupInstance(ClinicalCorrespondenceType.class, ClinicalCorrespondenceType.TYPE_ID, id);
	}
	

	public static ReviewInDurationCollection getReviewInDuration(LookupService lookupService) {
		ReviewInDurationCollection collection =
			(ReviewInDurationCollection) lookupService.getLookupCollection(ReviewInDuration.TYPE_ID, 
				ReviewInDurationCollection.class, ReviewInDuration.class);
		return collection;
	}

	public static ReviewInDuration getReviewInDurationInstance(LookupService lookupService, int id) 
	{
		return (ReviewInDuration)lookupService.getLookupInstance(ReviewInDuration.class, ReviewInDuration.TYPE_ID, id);
	}
	

	public static OpdFollowUpCollection getOpdFollowUp(LookupService lookupService) {
		OpdFollowUpCollection collection =
			(OpdFollowUpCollection) lookupService.getLookupCollection(OpdFollowUp.TYPE_ID, 
				OpdFollowUpCollection.class, OpdFollowUp.class);
		return collection;
	}

	public static OpdFollowUp getOpdFollowUpInstance(LookupService lookupService, int id) 
	{
		return (OpdFollowUp)lookupService.getLookupInstance(OpdFollowUp.class, OpdFollowUp.TYPE_ID, id);
	}
	

	public static PatientProblemDurationUnitsCollection getPatientProblemDurationUnits(LookupService lookupService) {
		PatientProblemDurationUnitsCollection collection =
			(PatientProblemDurationUnitsCollection) lookupService.getLookupCollection(PatientProblemDurationUnits.TYPE_ID, 
				PatientProblemDurationUnitsCollection.class, PatientProblemDurationUnits.class);
		return collection;
	}

	public static PatientProblemDurationUnits getPatientProblemDurationUnitsInstance(LookupService lookupService, int id) 
	{
		return (PatientProblemDurationUnits)lookupService.getLookupInstance(PatientProblemDurationUnits.class, PatientProblemDurationUnits.TYPE_ID, id);
	}
	

	public static InvasiveDeviceRemovalReasonCollection getInvasiveDeviceRemovalReason(LookupService lookupService) {
		InvasiveDeviceRemovalReasonCollection collection =
			(InvasiveDeviceRemovalReasonCollection) lookupService.getLookupCollection(InvasiveDeviceRemovalReason.TYPE_ID, 
				InvasiveDeviceRemovalReasonCollection.class, InvasiveDeviceRemovalReason.class);
		return collection;
	}

	public static InvasiveDeviceRemovalReason getInvasiveDeviceRemovalReasonInstance(LookupService lookupService, int id) 
	{
		return (InvasiveDeviceRemovalReason)lookupService.getLookupInstance(InvasiveDeviceRemovalReason.class, InvasiveDeviceRemovalReason.TYPE_ID, id);
	}
	

	public static InvasiveDeviceCollection getInvasiveDevice(LookupService lookupService) {
		InvasiveDeviceCollection collection =
			(InvasiveDeviceCollection) lookupService.getLookupCollection(InvasiveDevice.TYPE_ID, 
				InvasiveDeviceCollection.class, InvasiveDevice.class);
		return collection;
	}

	public static InvasiveDevice getInvasiveDeviceInstance(LookupService lookupService, int id) 
	{
		return (InvasiveDevice)lookupService.getLookupInstance(InvasiveDevice.class, InvasiveDevice.TYPE_ID, id);
	}
	

	public static CorrespondenceStatusCollection getCorrespondenceStatus(LookupService lookupService) {
		CorrespondenceStatusCollection collection =
			(CorrespondenceStatusCollection) lookupService.getLookupCollection(CorrespondenceStatus.TYPE_ID, 
				CorrespondenceStatusCollection.class, CorrespondenceStatus.class);
		return collection;
	}

	public static CorrespondenceStatus getCorrespondenceStatusInstance(LookupService lookupService, int id) 
	{
		return (CorrespondenceStatus)lookupService.getLookupInstance(CorrespondenceStatus.class, CorrespondenceStatus.TYPE_ID, id);
	}
	

	public static CDIAssociationDescriptionCollection getCDIAssociationDescription(LookupService lookupService) {
		CDIAssociationDescriptionCollection collection =
			(CDIAssociationDescriptionCollection) lookupService.getLookupCollection(CDIAssociationDescription.TYPE_ID, 
				CDIAssociationDescriptionCollection.class, CDIAssociationDescription.class);
		return collection;
	}

	public static CDIAssociationDescription getCDIAssociationDescriptionInstance(LookupService lookupService, int id) 
	{
		return (CDIAssociationDescription)lookupService.getLookupInstance(CDIAssociationDescription.class, CDIAssociationDescription.TYPE_ID, id);
	}
	

	public static SiteCollection getSite(LookupService lookupService) {
		SiteCollection collection =
			(SiteCollection) lookupService.getLookupCollection(Site.TYPE_ID, 
				SiteCollection.class, Site.class);
		return collection;
	}

	public static Site getSiteInstance(LookupService lookupService, int id) 
	{
		return (Site)lookupService.getLookupInstance(Site.class, Site.TYPE_ID, id);
	}
	

	public static MDTListAorBCollection getMDTListAorB(LookupService lookupService) {
		MDTListAorBCollection collection =
			(MDTListAorBCollection) lookupService.getLookupCollection(MDTListAorB.TYPE_ID, 
				MDTListAorBCollection.class, MDTListAorB.class);
		return collection;
	}

	public static MDTListAorB getMDTListAorBInstance(LookupService lookupService, int id) 
	{
		return (MDTListAorB)lookupService.getLookupInstance(MDTListAorB.class, MDTListAorB.TYPE_ID, id);
	}
	

	public static NeedsAssessmentNumberCollection getNeedsAssessmentNumber(LookupService lookupService) {
		NeedsAssessmentNumberCollection collection =
			(NeedsAssessmentNumberCollection) lookupService.getLookupCollection(NeedsAssessmentNumber.TYPE_ID, 
				NeedsAssessmentNumberCollection.class, NeedsAssessmentNumber.class);
		return collection;
	}

	public static NeedsAssessmentNumber getNeedsAssessmentNumberInstance(LookupService lookupService, int id) 
	{
		return (NeedsAssessmentNumber)lookupService.getLookupInstance(NeedsAssessmentNumber.class, NeedsAssessmentNumber.TYPE_ID, id);
	}
	

	public static AbsentPresentCollection getAbsentPresent(LookupService lookupService) {
		AbsentPresentCollection collection =
			(AbsentPresentCollection) lookupService.getLookupCollection(AbsentPresent.TYPE_ID, 
				AbsentPresentCollection.class, AbsentPresent.class);
		return collection;
	}

	public static AbsentPresent getAbsentPresentInstance(LookupService lookupService, int id) 
	{
		return (AbsentPresent)lookupService.getLookupInstance(AbsentPresent.class, AbsentPresent.TYPE_ID, id);
	}
	

	public static AttendanceStatusCollection getAttendanceStatus(LookupService lookupService) {
		AttendanceStatusCollection collection =
			(AttendanceStatusCollection) lookupService.getLookupCollection(AttendanceStatus.TYPE_ID, 
				AttendanceStatusCollection.class, AttendanceStatus.class);
		return collection;
	}

	public static AttendanceStatus getAttendanceStatusInstance(LookupService lookupService, int id) 
	{
		return (AttendanceStatus)lookupService.getLookupInstance(AttendanceStatus.class, AttendanceStatus.TYPE_ID, id);
	}
	

	public static MeetingAttendeeStatusCollection getMeetingAttendeeStatus(LookupService lookupService) {
		MeetingAttendeeStatusCollection collection =
			(MeetingAttendeeStatusCollection) lookupService.getLookupCollection(MeetingAttendeeStatus.TYPE_ID, 
				MeetingAttendeeStatusCollection.class, MeetingAttendeeStatus.class);
		return collection;
	}

	public static MeetingAttendeeStatus getMeetingAttendeeStatusInstance(LookupService lookupService, int id) 
	{
		return (MeetingAttendeeStatus)lookupService.getLookupInstance(MeetingAttendeeStatus.class, MeetingAttendeeStatus.TYPE_ID, id);
	}
	

	public static MeetingStatusCollection getMeetingStatus(LookupService lookupService) {
		MeetingStatusCollection collection =
			(MeetingStatusCollection) lookupService.getLookupCollection(MeetingStatus.TYPE_ID, 
				MeetingStatusCollection.class, MeetingStatus.class);
		return collection;
	}

	public static MeetingStatus getMeetingStatusInstance(LookupService lookupService, int id) 
	{
		return (MeetingStatus)lookupService.getLookupInstance(MeetingStatus.class, MeetingStatus.TYPE_ID, id);
	}
	

	public static LevelOfAchievementCollection getLevelOfAchievement(LookupService lookupService) {
		LevelOfAchievementCollection collection =
			(LevelOfAchievementCollection) lookupService.getLookupCollection(LevelOfAchievement.TYPE_ID, 
				LevelOfAchievementCollection.class, LevelOfAchievement.class);
		return collection;
	}

	public static LevelOfAchievement getLevelOfAchievementInstance(LookupService lookupService, int id) 
	{
		return (LevelOfAchievement)lookupService.getLookupInstance(LevelOfAchievement.class, LevelOfAchievement.TYPE_ID, id);
	}
	

	public static GoalAreaOfNeedCollection getGoalAreaOfNeed(LookupService lookupService) {
		GoalAreaOfNeedCollection collection =
			(GoalAreaOfNeedCollection) lookupService.getLookupCollection(GoalAreaOfNeed.TYPE_ID, 
				GoalAreaOfNeedCollection.class, GoalAreaOfNeed.class);
		return collection;
	}

	public static GoalAreaOfNeed getGoalAreaOfNeedInstance(LookupService lookupService, int id) 
	{
		return (GoalAreaOfNeed)lookupService.getLookupInstance(GoalAreaOfNeed.class, GoalAreaOfNeed.TYPE_ID, id);
	}
	

	public static GoalTermCollection getGoalTerm(LookupService lookupService) {
		GoalTermCollection collection =
			(GoalTermCollection) lookupService.getLookupCollection(GoalTerm.TYPE_ID, 
				GoalTermCollection.class, GoalTerm.class);
		return collection;
	}

	public static GoalTerm getGoalTermInstance(LookupService lookupService, int id) 
	{
		return (GoalTerm)lookupService.getLookupInstance(GoalTerm.class, GoalTerm.TYPE_ID, id);
	}
	

	public static CaseConferenceOutcomeCollection getCaseConferenceOutcome(LookupService lookupService) {
		CaseConferenceOutcomeCollection collection =
			(CaseConferenceOutcomeCollection) lookupService.getLookupCollection(CaseConferenceOutcome.TYPE_ID, 
				CaseConferenceOutcomeCollection.class, CaseConferenceOutcome.class);
		return collection;
	}

	public static CaseConferenceOutcome getCaseConferenceOutcomeInstance(LookupService lookupService, int id) 
	{
		return (CaseConferenceOutcome)lookupService.getLookupInstance(CaseConferenceOutcome.class, CaseConferenceOutcome.TYPE_ID, id);
	}
	

	public static ChecklistItemCollection getChecklistItem(LookupService lookupService) {
		ChecklistItemCollection collection =
			(ChecklistItemCollection) lookupService.getLookupCollection(ChecklistItem.TYPE_ID, 
				ChecklistItemCollection.class, ChecklistItem.class);
		return collection;
	}

	public static ChecklistItem getChecklistItemInstance(LookupService lookupService, int id) 
	{
		return (ChecklistItem)lookupService.getLookupInstance(ChecklistItem.class, ChecklistItem.TYPE_ID, id);
	}
	

	public static SymptomsCollection getSymptoms(LookupService lookupService) {
		SymptomsCollection collection =
			(SymptomsCollection) lookupService.getLookupCollection(Symptoms.TYPE_ID, 
				SymptomsCollection.class, Symptoms.class);
		return collection;
	}

	public static Symptoms getSymptomsInstance(LookupService lookupService, int id) 
	{
		return (Symptoms)lookupService.getLookupInstance(Symptoms.class, Symptoms.TYPE_ID, id);
	}
	

	public static BodySystemCollection getBodySystem(LookupService lookupService) {
		BodySystemCollection collection =
			(BodySystemCollection) lookupService.getLookupCollection(BodySystem.TYPE_ID, 
				BodySystemCollection.class, BodySystem.class);
		return collection;
	}

	public static BodySystem getBodySystemInstance(LookupService lookupService, int id) 
	{
		return (BodySystem)lookupService.getLookupInstance(BodySystem.class, BodySystem.TYPE_ID, id);
	}
	

	public static SurgicalCheckListNotPerformedReasonCollection getSurgicalCheckListNotPerformedReason(LookupService lookupService) {
		SurgicalCheckListNotPerformedReasonCollection collection =
			(SurgicalCheckListNotPerformedReasonCollection) lookupService.getLookupCollection(SurgicalCheckListNotPerformedReason.TYPE_ID, 
				SurgicalCheckListNotPerformedReasonCollection.class, SurgicalCheckListNotPerformedReason.class);
		return collection;
	}

	public static SurgicalCheckListNotPerformedReason getSurgicalCheckListNotPerformedReasonInstance(LookupService lookupService, int id) 
	{
		return (SurgicalCheckListNotPerformedReason)lookupService.getLookupInstance(SurgicalCheckListNotPerformedReason.class, SurgicalCheckListNotPerformedReason.TYPE_ID, id);
	}
	

	public static SurgicalAuditOperationDetailStatusCollection getSurgicalAuditOperationDetailStatus(LookupService lookupService) {
		SurgicalAuditOperationDetailStatusCollection collection =
			(SurgicalAuditOperationDetailStatusCollection) lookupService.getLookupCollection(SurgicalAuditOperationDetailStatus.TYPE_ID, 
				SurgicalAuditOperationDetailStatusCollection.class, SurgicalAuditOperationDetailStatus.class);
		return collection;
	}

	public static SurgicalAuditOperationDetailStatus getSurgicalAuditOperationDetailStatusInstance(LookupService lookupService, int id) 
	{
		return (SurgicalAuditOperationDetailStatus)lookupService.getLookupInstance(SurgicalAuditOperationDetailStatus.class, SurgicalAuditOperationDetailStatus.TYPE_ID, id);
	}
	

	public static OperationCancellationReasonCollection getOperationCancellationReason(LookupService lookupService) {
		OperationCancellationReasonCollection collection =
			(OperationCancellationReasonCollection) lookupService.getLookupCollection(OperationCancellationReason.TYPE_ID, 
				OperationCancellationReasonCollection.class, OperationCancellationReason.class);
		return collection;
	}

	public static OperationCancellationReason getOperationCancellationReasonInstance(LookupService lookupService, int id) 
	{
		return (OperationCancellationReason)lookupService.getLookupInstance(OperationCancellationReason.class, OperationCancellationReason.TYPE_ID, id);
	}
	

	public static HandoverFromRecoveryNurseCollection getHandoverFromRecoveryNurse(LookupService lookupService) {
		HandoverFromRecoveryNurseCollection collection =
			(HandoverFromRecoveryNurseCollection) lookupService.getLookupCollection(HandoverFromRecoveryNurse.TYPE_ID, 
				HandoverFromRecoveryNurseCollection.class, HandoverFromRecoveryNurse.class);
		return collection;
	}

	public static HandoverFromRecoveryNurse getHandoverFromRecoveryNurseInstance(LookupService lookupService, int id) 
	{
		return (HandoverFromRecoveryNurse)lookupService.getLookupInstance(HandoverFromRecoveryNurse.class, HandoverFromRecoveryNurse.TYPE_ID, id);
	}
	

	public static SurgicalPackCollection getSurgicalPack(LookupService lookupService) {
		SurgicalPackCollection collection =
			(SurgicalPackCollection) lookupService.getLookupCollection(SurgicalPack.TYPE_ID, 
				SurgicalPackCollection.class, SurgicalPack.class);
		return collection;
	}

	public static SurgicalPack getSurgicalPackInstance(LookupService lookupService, int id) 
	{
		return (SurgicalPack)lookupService.getLookupInstance(SurgicalPack.class, SurgicalPack.TYPE_ID, id);
	}
	

	public static SiteMarkedActionTakenCollection getSiteMarkedActionTaken(LookupService lookupService) {
		SiteMarkedActionTakenCollection collection =
			(SiteMarkedActionTakenCollection) lookupService.getLookupCollection(SiteMarkedActionTaken.TYPE_ID, 
				SiteMarkedActionTakenCollection.class, SiteMarkedActionTaken.class);
		return collection;
	}

	public static SiteMarkedActionTaken getSiteMarkedActionTakenInstance(LookupService lookupService, int id) 
	{
		return (SiteMarkedActionTaken)lookupService.getLookupInstance(SiteMarkedActionTaken.class, SiteMarkedActionTaken.TYPE_ID, id);
	}
	

	public static VTEAsessmentStatusCollection getVTEAsessmentStatus(LookupService lookupService) {
		VTEAsessmentStatusCollection collection =
			(VTEAsessmentStatusCollection) lookupService.getLookupCollection(VTEAsessmentStatus.TYPE_ID, 
				VTEAsessmentStatusCollection.class, VTEAsessmentStatus.class);
		return collection;
	}

	public static VTEAsessmentStatus getVTEAsessmentStatusInstance(LookupService lookupService, int id) 
	{
		return (VTEAsessmentStatus)lookupService.getLookupInstance(VTEAsessmentStatus.class, VTEAsessmentStatus.TYPE_ID, id);
	}
	

	public static VTERiskGroupCollection getVTERiskGroup(LookupService lookupService) {
		VTERiskGroupCollection collection =
			(VTERiskGroupCollection) lookupService.getLookupCollection(VTERiskGroup.TYPE_ID, 
				VTERiskGroupCollection.class, VTERiskGroup.class);
		return collection;
	}

	public static VTERiskGroup getVTERiskGroupInstance(LookupService lookupService, int id) 
	{
		return (VTERiskGroup)lookupService.getLookupInstance(VTERiskGroup.class, VTERiskGroup.TYPE_ID, id);
	}
	

	public static HospitalAtNightPatientStatusCollection getHospitalAtNightPatientStatus(LookupService lookupService) {
		HospitalAtNightPatientStatusCollection collection =
			(HospitalAtNightPatientStatusCollection) lookupService.getLookupCollection(HospitalAtNightPatientStatus.TYPE_ID, 
				HospitalAtNightPatientStatusCollection.class, HospitalAtNightPatientStatus.class);
		return collection;
	}

	public static HospitalAtNightPatientStatus getHospitalAtNightPatientStatusInstance(LookupService lookupService, int id) 
	{
		return (HospitalAtNightPatientStatus)lookupService.getLookupInstance(HospitalAtNightPatientStatus.class, HospitalAtNightPatientStatus.TYPE_ID, id);
	}
	

	public static HospitalAtNightClinicalTaskCollection getHospitalAtNightClinicalTask(LookupService lookupService) {
		HospitalAtNightClinicalTaskCollection collection =
			(HospitalAtNightClinicalTaskCollection) lookupService.getLookupCollection(HospitalAtNightClinicalTask.TYPE_ID, 
				HospitalAtNightClinicalTaskCollection.class, HospitalAtNightClinicalTask.class);
		return collection;
	}

	public static HospitalAtNightClinicalTask getHospitalAtNightClinicalTaskInstance(LookupService lookupService, int id) 
	{
		return (HospitalAtNightClinicalTask)lookupService.getLookupInstance(HospitalAtNightClinicalTask.class, HospitalAtNightClinicalTask.TYPE_ID, id);
	}
	

	public static HospitalAtNightRequestTypeCollection getHospitalAtNightRequestType(LookupService lookupService) {
		HospitalAtNightRequestTypeCollection collection =
			(HospitalAtNightRequestTypeCollection) lookupService.getLookupCollection(HospitalAtNightRequestType.TYPE_ID, 
				HospitalAtNightRequestTypeCollection.class, HospitalAtNightRequestType.class);
		return collection;
	}

	public static HospitalAtNightRequestType getHospitalAtNightRequestTypeInstance(LookupService lookupService, int id) 
	{
		return (HospitalAtNightRequestType)lookupService.getLookupInstance(HospitalAtNightRequestType.class, HospitalAtNightRequestType.TYPE_ID, id);
	}
	

	public static TTAStatusCollection getTTAStatus(LookupService lookupService) {
		TTAStatusCollection collection =
			(TTAStatusCollection) lookupService.getLookupCollection(TTAStatus.TYPE_ID, 
				TTAStatusCollection.class, TTAStatus.class);
		return collection;
	}

	public static TTAStatus getTTAStatusInstance(LookupService lookupService, int id) 
	{
		return (TTAStatus)lookupService.getLookupInstance(TTAStatus.class, TTAStatus.TYPE_ID, id);
	}
	

	public static MEWSCollection getMEWS(LookupService lookupService) {
		MEWSCollection collection =
			(MEWSCollection) lookupService.getLookupCollection(MEWS.TYPE_ID, 
				MEWSCollection.class, MEWS.class);
		return collection;
	}

	public static MEWS getMEWSInstance(LookupService lookupService, int id) 
	{
		return (MEWS)lookupService.getLookupInstance(MEWS.class, MEWS.TYPE_ID, id);
	}
	

	public static ClinicalNoteClassificationCollection getClinicalNoteClassification(LookupService lookupService) {
		ClinicalNoteClassificationCollection collection =
			(ClinicalNoteClassificationCollection) lookupService.getLookupCollection(ClinicalNoteClassification.TYPE_ID, 
				ClinicalNoteClassificationCollection.class, ClinicalNoteClassification.class);
		return collection;
	}

	public static ClinicalNoteClassification getClinicalNoteClassificationInstance(LookupService lookupService, int id) 
	{
		return (ClinicalNoteClassification)lookupService.getLookupInstance(ClinicalNoteClassification.class, ClinicalNoteClassification.TYPE_ID, id);
	}
	

	public static EDischargeSummarySectionStatusCollection getEDischargeSummarySectionStatus(LookupService lookupService) {
		EDischargeSummarySectionStatusCollection collection =
			(EDischargeSummarySectionStatusCollection) lookupService.getLookupCollection(EDischargeSummarySectionStatus.TYPE_ID, 
				EDischargeSummarySectionStatusCollection.class, EDischargeSummarySectionStatus.class);
		return collection;
	}

	public static EDischargeSummarySectionStatus getEDischargeSummarySectionStatusInstance(LookupService lookupService, int id) 
	{
		return (EDischargeSummarySectionStatus)lookupService.getLookupInstance(EDischargeSummarySectionStatus.class, EDischargeSummarySectionStatus.TYPE_ID, id);
	}
	

	public static DischargeSummaryJobTypeCollection getDischargeSummaryJobType(LookupService lookupService) {
		DischargeSummaryJobTypeCollection collection =
			(DischargeSummaryJobTypeCollection) lookupService.getLookupCollection(DischargeSummaryJobType.TYPE_ID, 
				DischargeSummaryJobTypeCollection.class, DischargeSummaryJobType.class);
		return collection;
	}

	public static DischargeSummaryJobType getDischargeSummaryJobTypeInstance(LookupService lookupService, int id) 
	{
		return (DischargeSummaryJobType)lookupService.getLookupInstance(DischargeSummaryJobType.class, DischargeSummaryJobType.TYPE_ID, id);
	}
	

	public static DischargeSupplementaryLetterStatusCollection getDischargeSupplementaryLetterStatus(LookupService lookupService) {
		DischargeSupplementaryLetterStatusCollection collection =
			(DischargeSupplementaryLetterStatusCollection) lookupService.getLookupCollection(DischargeSupplementaryLetterStatus.TYPE_ID, 
				DischargeSupplementaryLetterStatusCollection.class, DischargeSupplementaryLetterStatus.class);
		return collection;
	}

	public static DischargeSupplementaryLetterStatus getDischargeSupplementaryLetterStatusInstance(LookupService lookupService, int id) 
	{
		return (DischargeSupplementaryLetterStatus)lookupService.getLookupInstance(DischargeSupplementaryLetterStatus.class, DischargeSupplementaryLetterStatus.TYPE_ID, id);
	}
	

	public static CataractDressingsCollection getCataractDressings(LookupService lookupService) {
		CataractDressingsCollection collection =
			(CataractDressingsCollection) lookupService.getLookupCollection(CataractDressings.TYPE_ID, 
				CataractDressingsCollection.class, CataractDressings.class);
		return collection;
	}

	public static CataractDressings getCataractDressingsInstance(LookupService lookupService, int id) 
	{
		return (CataractDressings)lookupService.getLookupInstance(CataractDressings.class, CataractDressings.TYPE_ID, id);
	}
	

	public static ProphylaxisOfferedCollection getProphylaxisOffered(LookupService lookupService) {
		ProphylaxisOfferedCollection collection =
			(ProphylaxisOfferedCollection) lookupService.getLookupCollection(ProphylaxisOffered.TYPE_ID, 
				ProphylaxisOfferedCollection.class, ProphylaxisOffered.class);
		return collection;
	}

	public static ProphylaxisOffered getProphylaxisOfferedInstance(LookupService lookupService, int id) 
	{
		return (ProphylaxisOffered)lookupService.getLookupInstance(ProphylaxisOffered.class, ProphylaxisOffered.TYPE_ID, id);
	}
	

	public static SkinClosureCollection getSkinClosure(LookupService lookupService) {
		SkinClosureCollection collection =
			(SkinClosureCollection) lookupService.getLookupCollection(SkinClosure.TYPE_ID, 
				SkinClosureCollection.class, SkinClosure.class);
		return collection;
	}

	public static SkinClosure getSkinClosureInstance(LookupService lookupService, int id) 
	{
		return (SkinClosure)lookupService.getLookupInstance(SkinClosure.class, SkinClosure.TYPE_ID, id);
	}
	

	public static RACPExerciseECGFindingsCollection getRACPExerciseECGFindings(LookupService lookupService) {
		RACPExerciseECGFindingsCollection collection =
			(RACPExerciseECGFindingsCollection) lookupService.getLookupCollection(RACPExerciseECGFindings.TYPE_ID, 
				RACPExerciseECGFindingsCollection.class, RACPExerciseECGFindings.class);
		return collection;
	}

	public static RACPExerciseECGFindings getRACPExerciseECGFindingsInstance(LookupService lookupService, int id) 
	{
		return (RACPExerciseECGFindings)lookupService.getLookupInstance(RACPExerciseECGFindings.class, RACPExerciseECGFindings.TYPE_ID, id);
	}
	

	public static TheatreTrackingStatusCollection getTheatreTrackingStatus(LookupService lookupService) {
		TheatreTrackingStatusCollection collection =
			(TheatreTrackingStatusCollection) lookupService.getLookupCollection(TheatreTrackingStatus.TYPE_ID, 
				TheatreTrackingStatusCollection.class, TheatreTrackingStatus.class);
		return collection;
	}

	public static TheatreTrackingStatus getTheatreTrackingStatusInstance(LookupService lookupService, int id) 
	{
		return (TheatreTrackingStatus)lookupService.getLookupInstance(TheatreTrackingStatus.class, TheatreTrackingStatus.TYPE_ID, id);
	}
	

	public static ReferralCategoryCollection getReferralCategory(LookupService lookupService) {
		ReferralCategoryCollection collection =
			(ReferralCategoryCollection) lookupService.getLookupCollection(ReferralCategory.TYPE_ID, 
				ReferralCategoryCollection.class, ReferralCategory.class);
		return collection;
	}

	public static ReferralCategory getReferralCategoryInstance(LookupService lookupService, int id) 
	{
		return (ReferralCategory)lookupService.getLookupInstance(ReferralCategory.class, ReferralCategory.TYPE_ID, id);
	}
	

	public static PrimaryPreceedingCollection getPrimaryPreceeding(LookupService lookupService) {
		PrimaryPreceedingCollection collection =
			(PrimaryPreceedingCollection) lookupService.getLookupCollection(PrimaryPreceeding.TYPE_ID, 
				PrimaryPreceedingCollection.class, PrimaryPreceeding.class);
		return collection;
	}

	public static PrimaryPreceeding getPrimaryPreceedingInstance(LookupService lookupService, int id) 
	{
		return (PrimaryPreceeding)lookupService.getLookupInstance(PrimaryPreceeding.class, PrimaryPreceeding.TYPE_ID, id);
	}
	

	public static GoalPlanningCancellationReasonCollection getGoalPlanningCancellationReason(LookupService lookupService) {
		GoalPlanningCancellationReasonCollection collection =
			(GoalPlanningCancellationReasonCollection) lookupService.getLookupCollection(GoalPlanningCancellationReason.TYPE_ID, 
				GoalPlanningCancellationReasonCollection.class, GoalPlanningCancellationReason.class);
		return collection;
	}

	public static GoalPlanningCancellationReason getGoalPlanningCancellationReasonInstance(LookupService lookupService, int id) 
	{
		return (GoalPlanningCancellationReason)lookupService.getLookupInstance(GoalPlanningCancellationReason.class, GoalPlanningCancellationReason.TYPE_ID, id);
	}
	

	public static PatientProcedureOutcomeCollection getPatientProcedureOutcome(LookupService lookupService) {
		PatientProcedureOutcomeCollection collection =
			(PatientProcedureOutcomeCollection) lookupService.getLookupCollection(PatientProcedureOutcome.TYPE_ID, 
				PatientProcedureOutcomeCollection.class, PatientProcedureOutcome.class);
		return collection;
	}

	public static PatientProcedureOutcome getPatientProcedureOutcomeInstance(LookupService lookupService, int id) 
	{
		return (PatientProcedureOutcome)lookupService.getLookupInstance(PatientProcedureOutcome.class, PatientProcedureOutcome.TYPE_ID, id);
	}
	

	public static MedicationSnapShotCollection getMedicationSnapShot(LookupService lookupService) {
		MedicationSnapShotCollection collection =
			(MedicationSnapShotCollection) lookupService.getLookupCollection(MedicationSnapShot.TYPE_ID, 
				MedicationSnapShotCollection.class, MedicationSnapShot.class);
		return collection;
	}

	public static MedicationSnapShot getMedicationSnapShotInstance(LookupService lookupService, int id) 
	{
		return (MedicationSnapShot)lookupService.getLookupInstance(MedicationSnapShot.class, MedicationSnapShot.TYPE_ID, id);
	}
	
}



