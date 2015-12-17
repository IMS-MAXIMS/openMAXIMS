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
package ims.oncology.vo.lookups;

import ims.domain.lookups.LookupService;

/**
 * This is a generated interface.
 * Provides methods to get the ValueObject Lookup types of this namespace.
 * 
 */
public final class LookupHelper {
	public static TreatmentGroupSiteCollection getTreatmentGroupSite(LookupService lookupService) {
		TreatmentGroupSiteCollection collection =
			(TreatmentGroupSiteCollection) lookupService.getLookupCollection(TreatmentGroupSite.TYPE_ID, 
				TreatmentGroupSiteCollection.class, TreatmentGroupSite.class);
		return collection;
	}

	public static TreatmentGroupSite getTreatmentGroupSiteInstance(LookupService lookupService, int id) 
	{
		return (TreatmentGroupSite)lookupService.getLookupInstance(TreatmentGroupSite.class, TreatmentGroupSite.TYPE_ID, id);
	}
	

	public static ChemoProviderOrgCollection getChemoProviderOrg(LookupService lookupService) {
		ChemoProviderOrgCollection collection =
			(ChemoProviderOrgCollection) lookupService.getLookupCollection(ChemoProviderOrg.TYPE_ID, 
				ChemoProviderOrgCollection.class, ChemoProviderOrg.class);
		return collection;
	}

	public static ChemoProviderOrg getChemoProviderOrgInstance(LookupService lookupService, int id) 
	{
		return (ChemoProviderOrg)lookupService.getLookupInstance(ChemoProviderOrg.class, ChemoProviderOrg.TYPE_ID, id);
	}
	

	public static RegimenOutcomeSummaryCollection getRegimenOutcomeSummary(LookupService lookupService) {
		RegimenOutcomeSummaryCollection collection =
			(RegimenOutcomeSummaryCollection) lookupService.getLookupCollection(RegimenOutcomeSummary.TYPE_ID, 
				RegimenOutcomeSummaryCollection.class, RegimenOutcomeSummary.class);
		return collection;
	}

	public static RegimenOutcomeSummary getRegimenOutcomeSummaryInstance(LookupService lookupService, int id) 
	{
		return (RegimenOutcomeSummary)lookupService.getLookupInstance(RegimenOutcomeSummary.class, RegimenOutcomeSummary.TYPE_ID, id);
	}
	

	public static BrachytherapyPrescriptionPointCollection getBrachytherapyPrescriptionPoint(LookupService lookupService) {
		BrachytherapyPrescriptionPointCollection collection =
			(BrachytherapyPrescriptionPointCollection) lookupService.getLookupCollection(BrachytherapyPrescriptionPoint.TYPE_ID, 
				BrachytherapyPrescriptionPointCollection.class, BrachytherapyPrescriptionPoint.class);
		return collection;
	}

	public static BrachytherapyPrescriptionPoint getBrachytherapyPrescriptionPointInstance(LookupService lookupService, int id) 
	{
		return (BrachytherapyPrescriptionPoint)lookupService.getLookupInstance(BrachytherapyPrescriptionPoint.class, BrachytherapyPrescriptionPoint.TYPE_ID, id);
	}
	

	public static RadiotherapyDelayReasonCollection getRadiotherapyDelayReason(LookupService lookupService) {
		RadiotherapyDelayReasonCollection collection =
			(RadiotherapyDelayReasonCollection) lookupService.getLookupCollection(RadiotherapyDelayReason.TYPE_ID, 
				RadiotherapyDelayReasonCollection.class, RadiotherapyDelayReason.class);
		return collection;
	}

	public static RadiotherapyDelayReason getRadiotherapyDelayReasonInstance(LookupService lookupService, int id) 
	{
		return (RadiotherapyDelayReason)lookupService.getLookupInstance(RadiotherapyDelayReason.class, RadiotherapyDelayReason.TYPE_ID, id);
	}
	

	public static DiseaseStatusCollection getDiseaseStatus(LookupService lookupService) {
		DiseaseStatusCollection collection =
			(DiseaseStatusCollection) lookupService.getLookupCollection(DiseaseStatus.TYPE_ID, 
				DiseaseStatusCollection.class, DiseaseStatus.class);
		return collection;
	}

	public static DiseaseStatus getDiseaseStatusInstance(LookupService lookupService, int id) 
	{
		return (DiseaseStatus)lookupService.getLookupInstance(DiseaseStatus.class, DiseaseStatus.TYPE_ID, id);
	}
	

	public static ChemoCycleTreatmentTypeCollection getChemoCycleTreatmentType(LookupService lookupService) {
		ChemoCycleTreatmentTypeCollection collection =
			(ChemoCycleTreatmentTypeCollection) lookupService.getLookupCollection(ChemoCycleTreatmentType.TYPE_ID, 
				ChemoCycleTreatmentTypeCollection.class, ChemoCycleTreatmentType.class);
		return collection;
	}

	public static ChemoCycleTreatmentType getChemoCycleTreatmentTypeInstance(LookupService lookupService, int id) 
	{
		return (ChemoCycleTreatmentType)lookupService.getLookupInstance(ChemoCycleTreatmentType.class, ChemoCycleTreatmentType.TYPE_ID, id);
	}
	

	public static DeliveryCodeAllOtherDaysCollection getDeliveryCodeAllOtherDays(LookupService lookupService) {
		DeliveryCodeAllOtherDaysCollection collection =
			(DeliveryCodeAllOtherDaysCollection) lookupService.getLookupCollection(DeliveryCodeAllOtherDays.TYPE_ID, 
				DeliveryCodeAllOtherDaysCollection.class, DeliveryCodeAllOtherDays.class);
		return collection;
	}

	public static DeliveryCodeAllOtherDays getDeliveryCodeAllOtherDaysInstance(LookupService lookupService, int id) 
	{
		return (DeliveryCodeAllOtherDays)lookupService.getLookupInstance(DeliveryCodeAllOtherDays.class, DeliveryCodeAllOtherDays.TYPE_ID, id);
	}
	

	public static DayOneDeliveryCodeCollection getDayOneDeliveryCode(LookupService lookupService) {
		DayOneDeliveryCodeCollection collection =
			(DayOneDeliveryCodeCollection) lookupService.getLookupCollection(DayOneDeliveryCode.TYPE_ID, 
				DayOneDeliveryCodeCollection.class, DayOneDeliveryCode.class);
		return collection;
	}

	public static DayOneDeliveryCode getDayOneDeliveryCodeInstance(LookupService lookupService, int id) 
	{
		return (DayOneDeliveryCode)lookupService.getLookupInstance(DayOneDeliveryCode.class, DayOneDeliveryCode.TYPE_ID, id);
	}
	

	public static ProcurementCodeCollection getProcurementCode(LookupService lookupService) {
		ProcurementCodeCollection collection =
			(ProcurementCodeCollection) lookupService.getLookupCollection(ProcurementCode.TYPE_ID, 
				ProcurementCodeCollection.class, ProcurementCode.class);
		return collection;
	}

	public static ProcurementCode getProcurementCodeInstance(LookupService lookupService, int id) 
	{
		return (ProcurementCode)lookupService.getLookupInstance(ProcurementCode.class, ProcurementCode.TYPE_ID, id);
	}
	

	public static TreatmentHospitalCollection getTreatmentHospital(LookupService lookupService) {
		TreatmentHospitalCollection collection =
			(TreatmentHospitalCollection) lookupService.getLookupCollection(TreatmentHospital.TYPE_ID, 
				TreatmentHospitalCollection.class, TreatmentHospital.class);
		return collection;
	}

	public static TreatmentHospital getTreatmentHospitalInstance(LookupService lookupService, int id) 
	{
		return (TreatmentHospital)lookupService.getLookupInstance(TreatmentHospital.class, TreatmentHospital.TYPE_ID, id);
	}
	

	public static PrognosticGroupCollection getPrognosticGroup(LookupService lookupService) {
		PrognosticGroupCollection collection =
			(PrognosticGroupCollection) lookupService.getLookupCollection(PrognosticGroup.TYPE_ID, 
				PrognosticGroupCollection.class, PrognosticGroup.class);
		return collection;
	}

	public static PrognosticGroup getPrognosticGroupInstance(LookupService lookupService, int id) 
	{
		return (PrognosticGroup)lookupService.getLookupInstance(PrognosticGroup.class, PrognosticGroup.TYPE_ID, id);
	}
	

	public static InternalReferralSourceCollection getInternalReferralSource(LookupService lookupService) {
		InternalReferralSourceCollection collection =
			(InternalReferralSourceCollection) lookupService.getLookupCollection(InternalReferralSource.TYPE_ID, 
				InternalReferralSourceCollection.class, InternalReferralSource.class);
		return collection;
	}

	public static InternalReferralSource getInternalReferralSourceInstance(LookupService lookupService, int id) 
	{
		return (InternalReferralSource)lookupService.getLookupInstance(InternalReferralSource.class, InternalReferralSource.TYPE_ID, id);
	}
	

	public static InternalReferralTypeAndReasonCollection getInternalReferralTypeAndReason(LookupService lookupService) {
		InternalReferralTypeAndReasonCollection collection =
			(InternalReferralTypeAndReasonCollection) lookupService.getLookupCollection(InternalReferralTypeAndReason.TYPE_ID, 
				InternalReferralTypeAndReasonCollection.class, InternalReferralTypeAndReason.class);
		return collection;
	}

	public static InternalReferralTypeAndReason getInternalReferralTypeAndReasonInstance(LookupService lookupService, int id) 
	{
		return (InternalReferralTypeAndReason)lookupService.getLookupInstance(InternalReferralTypeAndReason.class, InternalReferralTypeAndReason.TYPE_ID, id);
	}
	

	public static ReferralReasonCollection getReferralReason(LookupService lookupService) {
		ReferralReasonCollection collection =
			(ReferralReasonCollection) lookupService.getLookupCollection(ReferralReason.TYPE_ID, 
				ReferralReasonCollection.class, ReferralReason.class);
		return collection;
	}

	public static ReferralReason getReferralReasonInstance(LookupService lookupService, int id) 
	{
		return (ReferralReason)lookupService.getLookupInstance(ReferralReason.class, ReferralReason.TYPE_ID, id);
	}
	

	public static ReferralOutcomeCollection getReferralOutcome(LookupService lookupService) {
		ReferralOutcomeCollection collection =
			(ReferralOutcomeCollection) lookupService.getLookupCollection(ReferralOutcome.TYPE_ID, 
				ReferralOutcomeCollection.class, ReferralOutcome.class);
		return collection;
	}

	public static ReferralOutcome getReferralOutcomeInstance(LookupService lookupService, int id) 
	{
		return (ReferralOutcome)lookupService.getLookupInstance(ReferralOutcome.class, ReferralOutcome.TYPE_ID, id);
	}
	

	public static StagingInvestigationResultCollection getStagingInvestigationResult(LookupService lookupService) {
		StagingInvestigationResultCollection collection =
			(StagingInvestigationResultCollection) lookupService.getLookupCollection(StagingInvestigationResult.TYPE_ID, 
				StagingInvestigationResultCollection.class, StagingInvestigationResult.class);
		return collection;
	}

	public static StagingInvestigationResult getStagingInvestigationResultInstance(LookupService lookupService, int id) 
	{
		return (StagingInvestigationResult)lookupService.getLookupInstance(StagingInvestigationResult.class, StagingInvestigationResult.TYPE_ID, id);
	}
	

	public static BrachytherapyPatientTypeCollection getBrachytherapyPatientType(LookupService lookupService) {
		BrachytherapyPatientTypeCollection collection =
			(BrachytherapyPatientTypeCollection) lookupService.getLookupCollection(BrachytherapyPatientType.TYPE_ID, 
				BrachytherapyPatientTypeCollection.class, BrachytherapyPatientType.class);
		return collection;
	}

	public static BrachytherapyPatientType getBrachytherapyPatientTypeInstance(LookupService lookupService, int id) 
	{
		return (BrachytherapyPatientType)lookupService.getLookupInstance(BrachytherapyPatientType.class, BrachytherapyPatientType.TYPE_ID, id);
	}
	

	public static RecurrenceSiteCollection getRecurrenceSite(LookupService lookupService) {
		RecurrenceSiteCollection collection =
			(RecurrenceSiteCollection) lookupService.getLookupCollection(RecurrenceSite.TYPE_ID, 
				RecurrenceSiteCollection.class, RecurrenceSite.class);
		return collection;
	}

	public static RecurrenceSite getRecurrenceSiteInstance(LookupService lookupService, int id) 
	{
		return (RecurrenceSite)lookupService.getLookupInstance(RecurrenceSite.class, RecurrenceSite.TYPE_ID, id);
	}
	

	public static TumourStatusCollection getTumourStatus(LookupService lookupService) {
		TumourStatusCollection collection =
			(TumourStatusCollection) lookupService.getLookupCollection(TumourStatus.TYPE_ID, 
				TumourStatusCollection.class, TumourStatus.class);
		return collection;
	}

	public static TumourStatus getTumourStatusInstance(LookupService lookupService, int id) 
	{
		return (TumourStatus)lookupService.getLookupInstance(TumourStatus.class, TumourStatus.TYPE_ID, id);
	}
	

	public static TNMClinicalpathologicalCollection getTNMClinicalpathological(LookupService lookupService) {
		TNMClinicalpathologicalCollection collection =
			(TNMClinicalpathologicalCollection) lookupService.getLookupCollection(TNMClinicalpathological.TYPE_ID, 
				TNMClinicalpathologicalCollection.class, TNMClinicalpathological.class);
		return collection;
	}

	public static TNMClinicalpathological getTNMClinicalpathologicalInstance(LookupService lookupService, int id) 
	{
		return (TNMClinicalpathological)lookupService.getLookupInstance(TNMClinicalpathological.class, TNMClinicalpathological.TYPE_ID, id);
	}
	

	public static HistopathologyReportStatusCollection getHistopathologyReportStatus(LookupService lookupService) {
		HistopathologyReportStatusCollection collection =
			(HistopathologyReportStatusCollection) lookupService.getLookupCollection(HistopathologyReportStatus.TYPE_ID, 
				HistopathologyReportStatusCollection.class, HistopathologyReportStatus.class);
		return collection;
	}

	public static HistopathologyReportStatus getHistopathologyReportStatusInstance(LookupService lookupService, int id) 
	{
		return (HistopathologyReportStatus)lookupService.getLookupInstance(HistopathologyReportStatus.class, HistopathologyReportStatus.TYPE_ID, id);
	}
	

	public static BrachyTherapyDoseRateCollection getBrachyTherapyDoseRate(LookupService lookupService) {
		BrachyTherapyDoseRateCollection collection =
			(BrachyTherapyDoseRateCollection) lookupService.getLookupCollection(BrachyTherapyDoseRate.TYPE_ID, 
				BrachyTherapyDoseRateCollection.class, BrachyTherapyDoseRate.class);
		return collection;
	}

	public static BrachyTherapyDoseRate getBrachyTherapyDoseRateInstance(LookupService lookupService, int id) 
	{
		return (BrachyTherapyDoseRate)lookupService.getLookupInstance(BrachyTherapyDoseRate.class, BrachyTherapyDoseRate.TYPE_ID, id);
	}
	

	public static BeamEnergyCollection getBeamEnergy(LookupService lookupService) {
		BeamEnergyCollection collection =
			(BeamEnergyCollection) lookupService.getLookupCollection(BeamEnergy.TYPE_ID, 
				BeamEnergyCollection.class, BeamEnergy.class);
		return collection;
	}

	public static BeamEnergy getBeamEnergyInstance(LookupService lookupService, int id) 
	{
		return (BeamEnergy)lookupService.getLookupInstance(BeamEnergy.class, BeamEnergy.TYPE_ID, id);
	}
	

	public static OrganisationOrganisedTreatmentCollection getOrganisationOrganisedTreatment(LookupService lookupService) {
		OrganisationOrganisedTreatmentCollection collection =
			(OrganisationOrganisedTreatmentCollection) lookupService.getLookupCollection(OrganisationOrganisedTreatment.TYPE_ID, 
				OrganisationOrganisedTreatmentCollection.class, OrganisationOrganisedTreatment.class);
		return collection;
	}

	public static OrganisationOrganisedTreatment getOrganisationOrganisedTreatmentInstance(LookupService lookupService, int id) 
	{
		return (OrganisationOrganisedTreatment)lookupService.getLookupInstance(OrganisationOrganisedTreatment.class, OrganisationOrganisedTreatment.TYPE_ID, id);
	}
	

	public static TreatmentTypeCollection getTreatmentType(LookupService lookupService) {
		TreatmentTypeCollection collection =
			(TreatmentTypeCollection) lookupService.getLookupCollection(TreatmentType.TYPE_ID, 
				TreatmentTypeCollection.class, TreatmentType.class);
		return collection;
	}

	public static TreatmentType getTreatmentTypeInstance(LookupService lookupService, int id) 
	{
		return (TreatmentType)lookupService.getLookupInstance(TreatmentType.class, TreatmentType.TYPE_ID, id);
	}
	

	public static OrganisationPlannedTreatmentCollection getOrganisationPlannedTreatment(LookupService lookupService) {
		OrganisationPlannedTreatmentCollection collection =
			(OrganisationPlannedTreatmentCollection) lookupService.getLookupCollection(OrganisationPlannedTreatment.TYPE_ID, 
				OrganisationPlannedTreatmentCollection.class, OrganisationPlannedTreatment.class);
		return collection;
	}

	public static OrganisationPlannedTreatment getOrganisationPlannedTreatmentInstance(LookupService lookupService, int id) 
	{
		return (OrganisationPlannedTreatment)lookupService.getLookupInstance(OrganisationPlannedTreatment.class, OrganisationPlannedTreatment.TYPE_ID, id);
	}
	

	public static TumourOverallStageCollection getTumourOverallStage(LookupService lookupService) {
		TumourOverallStageCollection collection =
			(TumourOverallStageCollection) lookupService.getLookupCollection(TumourOverallStage.TYPE_ID, 
				TumourOverallStageCollection.class, TumourOverallStage.class);
		return collection;
	}

	public static TumourOverallStage getTumourOverallStageInstance(LookupService lookupService, int id) 
	{
		return (TumourOverallStage)lookupService.getLookupInstance(TumourOverallStage.class, TumourOverallStage.TYPE_ID, id);
	}
	

	public static CarePlanCurrentStatusCollection getCarePlanCurrentStatus(LookupService lookupService) {
		CarePlanCurrentStatusCollection collection =
			(CarePlanCurrentStatusCollection) lookupService.getLookupCollection(CarePlanCurrentStatus.TYPE_ID, 
				CarePlanCurrentStatusCollection.class, CarePlanCurrentStatus.class);
		return collection;
	}

	public static CarePlanCurrentStatus getCarePlanCurrentStatusInstance(LookupService lookupService, int id) 
	{
		return (CarePlanCurrentStatus)lookupService.getLookupInstance(CarePlanCurrentStatus.class, CarePlanCurrentStatus.TYPE_ID, id);
	}
	

	public static RecurrenceIndicatorCollection getRecurrenceIndicator(LookupService lookupService) {
		RecurrenceIndicatorCollection collection =
			(RecurrenceIndicatorCollection) lookupService.getLookupCollection(RecurrenceIndicator.TYPE_ID, 
				RecurrenceIndicatorCollection.class, RecurrenceIndicator.class);
		return collection;
	}

	public static RecurrenceIndicator getRecurrenceIndicatorInstance(LookupService lookupService, int id) 
	{
		return (RecurrenceIndicator)lookupService.getLookupInstance(RecurrenceIndicator.class, RecurrenceIndicator.TYPE_ID, id);
	}
	

	public static SpecialTechniqueCollection getSpecialTechnique(LookupService lookupService) {
		SpecialTechniqueCollection collection =
			(SpecialTechniqueCollection) lookupService.getLookupCollection(SpecialTechnique.TYPE_ID, 
				SpecialTechniqueCollection.class, SpecialTechnique.class);
		return collection;
	}

	public static SpecialTechnique getSpecialTechniqueInstance(LookupService lookupService, int id) 
	{
		return (SpecialTechnique)lookupService.getLookupInstance(SpecialTechnique.class, SpecialTechnique.TYPE_ID, id);
	}
	

	public static BrachyTxTypeCollection getBrachyTxType(LookupService lookupService) {
		BrachyTxTypeCollection collection =
			(BrachyTxTypeCollection) lookupService.getLookupCollection(BrachyTxType.TYPE_ID, 
				BrachyTxTypeCollection.class, BrachyTxType.class);
		return collection;
	}

	public static BrachyTxType getBrachyTxTypeInstance(LookupService lookupService, int id) 
	{
		return (BrachyTxType)lookupService.getLookupInstance(BrachyTxType.class, BrachyTxType.TYPE_ID, id);
	}
	

	public static BrachytherapyDeliveryTypeCollection getBrachytherapyDeliveryType(LookupService lookupService) {
		BrachytherapyDeliveryTypeCollection collection =
			(BrachytherapyDeliveryTypeCollection) lookupService.getLookupCollection(BrachytherapyDeliveryType.TYPE_ID, 
				BrachytherapyDeliveryTypeCollection.class, BrachytherapyDeliveryType.class);
		return collection;
	}

	public static BrachytherapyDeliveryType getBrachytherapyDeliveryTypeInstance(LookupService lookupService, int id) 
	{
		return (BrachytherapyDeliveryType)lookupService.getLookupInstance(BrachytherapyDeliveryType.class, BrachytherapyDeliveryType.TYPE_ID, id);
	}
	

	public static OncDischargeDestinationCollection getOncDischargeDestination(LookupService lookupService) {
		OncDischargeDestinationCollection collection =
			(OncDischargeDestinationCollection) lookupService.getLookupCollection(OncDischargeDestination.TYPE_ID, 
				OncDischargeDestinationCollection.class, OncDischargeDestination.class);
		return collection;
	}

	public static OncDischargeDestination getOncDischargeDestinationInstance(LookupService lookupService, int id) 
	{
		return (OncDischargeDestination)lookupService.getLookupInstance(OncDischargeDestination.class, OncDischargeDestination.TYPE_ID, id);
	}
	

	public static DifferentatationSourceCollection getDifferentatationSource(LookupService lookupService) {
		DifferentatationSourceCollection collection =
			(DifferentatationSourceCollection) lookupService.getLookupCollection(DifferentatationSource.TYPE_ID, 
				DifferentatationSourceCollection.class, DifferentatationSource.class);
		return collection;
	}

	public static DifferentatationSource getDifferentatationSourceInstance(LookupService lookupService, int id) 
	{
		return (DifferentatationSource)lookupService.getLookupInstance(DifferentatationSource.class, DifferentatationSource.TYPE_ID, id);
	}
	

	public static HistologySourceCollection getHistologySource(LookupService lookupService) {
		HistologySourceCollection collection =
			(HistologySourceCollection) lookupService.getLookupCollection(HistologySource.TYPE_ID, 
				HistologySourceCollection.class, HistologySource.class);
		return collection;
	}

	public static HistologySource getHistologySourceInstance(LookupService lookupService, int id) 
	{
		return (HistologySource)lookupService.getLookupInstance(HistologySource.class, HistologySource.TYPE_ID, id);
	}
	

	public static NoOfFieldsCollection getNoOfFields(LookupService lookupService) {
		NoOfFieldsCollection collection =
			(NoOfFieldsCollection) lookupService.getLookupCollection(NoOfFields.TYPE_ID, 
				NoOfFieldsCollection.class, NoOfFields.class);
		return collection;
	}

	public static NoOfFields getNoOfFieldsInstance(LookupService lookupService, int id) 
	{
		return (NoOfFields)lookupService.getLookupInstance(NoOfFields.class, NoOfFields.TYPE_ID, id);
	}
	

	public static OncCarePlanStatusCollection getOncCarePlanStatus(LookupService lookupService) {
		OncCarePlanStatusCollection collection =
			(OncCarePlanStatusCollection) lookupService.getLookupCollection(OncCarePlanStatus.TYPE_ID, 
				OncCarePlanStatusCollection.class, OncCarePlanStatus.class);
		return collection;
	}

	public static OncCarePlanStatus getOncCarePlanStatusInstance(LookupService lookupService, int id) 
	{
		return (OncCarePlanStatus)lookupService.getLookupInstance(OncCarePlanStatus.class, OncCarePlanStatus.TYPE_ID, id);
	}
	

	public static DelayReasDecTreatTreatCollection getDelayReasDecTreatTreat(LookupService lookupService) {
		DelayReasDecTreatTreatCollection collection =
			(DelayReasDecTreatTreatCollection) lookupService.getLookupCollection(DelayReasDecTreatTreat.TYPE_ID, 
				DelayReasDecTreatTreatCollection.class, DelayReasDecTreatTreat.class);
		return collection;
	}

	public static DelayReasDecTreatTreat getDelayReasDecTreatTreatInstance(LookupService lookupService, int id) 
	{
		return (DelayReasDecTreatTreat)lookupService.getLookupInstance(DelayReasDecTreatTreat.class, DelayReasDecTreatTreat.TYPE_ID, id);
	}
	

	public static DelayReasReferralTreatCollection getDelayReasReferralTreat(LookupService lookupService) {
		DelayReasReferralTreatCollection collection =
			(DelayReasReferralTreatCollection) lookupService.getLookupCollection(DelayReasReferralTreat.TYPE_ID, 
				DelayReasReferralTreatCollection.class, DelayReasReferralTreat.class);
		return collection;
	}

	public static DelayReasReferralTreat getDelayReasReferralTreatInstance(LookupService lookupService, int id) 
	{
		return (DelayReasReferralTreat)lookupService.getLookupInstance(DelayReasReferralTreat.class, DelayReasReferralTreat.TYPE_ID, id);
	}
	

	public static ReasDateDecTreatTreatmentCollection getReasDateDecTreatTreatment(LookupService lookupService) {
		ReasDateDecTreatTreatmentCollection collection =
			(ReasDateDecTreatTreatmentCollection) lookupService.getLookupCollection(ReasDateDecTreatTreatment.TYPE_ID, 
				ReasDateDecTreatTreatmentCollection.class, ReasDateDecTreatTreatment.class);
		return collection;
	}

	public static ReasDateDecTreatTreatment getReasDateDecTreatTreatmentInstance(LookupService lookupService, int id) 
	{
		return (ReasDateDecTreatTreatment)lookupService.getLookupInstance(ReasDateDecTreatTreatment.class, ReasDateDecTreatTreatment.TYPE_ID, id);
	}
	

	public static DateFirstSeenDateDecTreatReasCollection getDateFirstSeenDateDecTreatReas(LookupService lookupService) {
		DateFirstSeenDateDecTreatReasCollection collection =
			(DateFirstSeenDateDecTreatReasCollection) lookupService.getLookupCollection(DateFirstSeenDateDecTreatReas.TYPE_ID, 
				DateFirstSeenDateDecTreatReasCollection.class, DateFirstSeenDateDecTreatReas.class);
		return collection;
	}

	public static DateFirstSeenDateDecTreatReas getDateFirstSeenDateDecTreatReasInstance(LookupService lookupService, int id) 
	{
		return (DateFirstSeenDateDecTreatReas)lookupService.getLookupInstance(DateFirstSeenDateDecTreatReas.class, DateFirstSeenDateDecTreatReas.TYPE_ID, id);
	}
	

	public static DateReferralDateFirstSeenReasonCollection getDateReferralDateFirstSeenReason(LookupService lookupService) {
		DateReferralDateFirstSeenReasonCollection collection =
			(DateReferralDateFirstSeenReasonCollection) lookupService.getLookupCollection(DateReferralDateFirstSeenReason.TYPE_ID, 
				DateReferralDateFirstSeenReasonCollection.class, DateReferralDateFirstSeenReason.class);
		return collection;
	}

	public static DateReferralDateFirstSeenReason getDateReferralDateFirstSeenReasonInstance(LookupService lookupService, int id) 
	{
		return (DateReferralDateFirstSeenReason)lookupService.getLookupInstance(DateReferralDateFirstSeenReason.class, DateReferralDateFirstSeenReason.TYPE_ID, id);
	}
	

	public static CarePlanModalityStatusCollection getCarePlanModalityStatus(LookupService lookupService) {
		CarePlanModalityStatusCollection collection =
			(CarePlanModalityStatusCollection) lookupService.getLookupCollection(CarePlanModalityStatus.TYPE_ID, 
				CarePlanModalityStatusCollection.class, CarePlanModalityStatus.class);
		return collection;
	}

	public static CarePlanModalityStatus getCarePlanModalityStatusInstance(LookupService lookupService, int id) 
	{
		return (CarePlanModalityStatus)lookupService.getLookupInstance(CarePlanModalityStatus.class, CarePlanModalityStatus.TYPE_ID, id);
	}
	

	public static CarePlanTreatmentModalityCollection getCarePlanTreatmentModality(LookupService lookupService) {
		CarePlanTreatmentModalityCollection collection =
			(CarePlanTreatmentModalityCollection) lookupService.getLookupCollection(CarePlanTreatmentModality.TYPE_ID, 
				CarePlanTreatmentModalityCollection.class, CarePlanTreatmentModality.class);
		return collection;
	}

	public static CarePlanTreatmentModality getCarePlanTreatmentModalityInstance(LookupService lookupService, int id) 
	{
		return (CarePlanTreatmentModality)lookupService.getLookupInstance(CarePlanTreatmentModality.class, CarePlanTreatmentModality.TYPE_ID, id);
	}
	

	public static NoAntiCancerTxReasonCollection getNoAntiCancerTxReason(LookupService lookupService) {
		NoAntiCancerTxReasonCollection collection =
			(NoAntiCancerTxReasonCollection) lookupService.getLookupCollection(NoAntiCancerTxReason.TYPE_ID, 
				NoAntiCancerTxReasonCollection.class, NoAntiCancerTxReason.class);
		return collection;
	}

	public static NoAntiCancerTxReason getNoAntiCancerTxReasonInstance(LookupService lookupService, int id) 
	{
		return (NoAntiCancerTxReason)lookupService.getLookupInstance(NoAntiCancerTxReason.class, NoAntiCancerTxReason.TYPE_ID, id);
	}
	

	public static CarePlanIntentCollection getCarePlanIntent(LookupService lookupService) {
		CarePlanIntentCollection collection =
			(CarePlanIntentCollection) lookupService.getLookupCollection(CarePlanIntent.TYPE_ID, 
				CarePlanIntentCollection.class, CarePlanIntent.class);
		return collection;
	}

	public static CarePlanIntent getCarePlanIntentInstance(LookupService lookupService, int id) 
	{
		return (CarePlanIntent)lookupService.getLookupInstance(CarePlanIntent.class, CarePlanIntent.TYPE_ID, id);
	}
	

	public static PatientPerformanceStatusCollection getPatientPerformanceStatus(LookupService lookupService) {
		PatientPerformanceStatusCollection collection =
			(PatientPerformanceStatusCollection) lookupService.getLookupCollection(PatientPerformanceStatus.TYPE_ID, 
				PatientPerformanceStatusCollection.class, PatientPerformanceStatus.class);
		return collection;
	}

	public static PatientPerformanceStatus getPatientPerformanceStatusInstance(LookupService lookupService, int id) 
	{
		return (PatientPerformanceStatus)lookupService.getLookupInstance(PatientPerformanceStatus.class, PatientPerformanceStatus.TYPE_ID, id);
	}
	

	public static CoMorbidityAssessmentCollection getCoMorbidityAssessment(LookupService lookupService) {
		CoMorbidityAssessmentCollection collection =
			(CoMorbidityAssessmentCollection) lookupService.getLookupCollection(CoMorbidityAssessment.TYPE_ID, 
				CoMorbidityAssessmentCollection.class, CoMorbidityAssessment.class);
		return collection;
	}

	public static CoMorbidityAssessment getCoMorbidityAssessmentInstance(LookupService lookupService, int id) 
	{
		return (CoMorbidityAssessment)lookupService.getLookupInstance(CoMorbidityAssessment.class, CoMorbidityAssessment.TYPE_ID, id);
	}
	

	public static SpecimenNatureCollection getSpecimenNature(LookupService lookupService) {
		SpecimenNatureCollection collection =
			(SpecimenNatureCollection) lookupService.getLookupCollection(SpecimenNature.TYPE_ID, 
				SpecimenNatureCollection.class, SpecimenNature.class);
		return collection;
	}

	public static SpecimenNature getSpecimenNatureInstance(LookupService lookupService, int id) 
	{
		return (SpecimenNature)lookupService.getLookupInstance(SpecimenNature.class, SpecimenNature.TYPE_ID, id);
	}
	

	public static ServiceReportStatusCollection getServiceReportStatus(LookupService lookupService) {
		ServiceReportStatusCollection collection =
			(ServiceReportStatusCollection) lookupService.getLookupCollection(ServiceReportStatus.TYPE_ID, 
				ServiceReportStatusCollection.class, ServiceReportStatus.class);
		return collection;
	}

	public static ServiceReportStatus getServiceReportStatusInstance(LookupService lookupService, int id) 
	{
		return (ServiceReportStatus)lookupService.getLookupInstance(ServiceReportStatus.class, ServiceReportStatus.TYPE_ID, id);
	}
	

	public static ExcisionMarginCollection getExcisionMargin(LookupService lookupService) {
		ExcisionMarginCollection collection =
			(ExcisionMarginCollection) lookupService.getLookupCollection(ExcisionMargin.TYPE_ID, 
				ExcisionMarginCollection.class, ExcisionMargin.class);
		return collection;
	}

	public static ExcisionMargin getExcisionMarginInstance(LookupService lookupService, int id) 
	{
		return (ExcisionMargin)lookupService.getLookupInstance(ExcisionMargin.class, ExcisionMargin.TYPE_ID, id);
	}
	

	public static VascularLymphInvasionCollection getVascularLymphInvasion(LookupService lookupService) {
		VascularLymphInvasionCollection collection =
			(VascularLymphInvasionCollection) lookupService.getLookupCollection(VascularLymphInvasion.TYPE_ID, 
				VascularLymphInvasionCollection.class, VascularLymphInvasion.class);
		return collection;
	}

	public static VascularLymphInvasion getVascularLymphInvasionInstance(LookupService lookupService, int id) 
	{
		return (VascularLymphInvasion)lookupService.getLookupInstance(VascularLymphInvasion.class, VascularLymphInvasion.TYPE_ID, id);
	}
	

	public static SynchronousTumourIndicatorCollection getSynchronousTumourIndicator(LookupService lookupService) {
		SynchronousTumourIndicatorCollection collection =
			(SynchronousTumourIndicatorCollection) lookupService.getLookupCollection(SynchronousTumourIndicator.TYPE_ID, 
				SynchronousTumourIndicatorCollection.class, SynchronousTumourIndicator.class);
		return collection;
	}

	public static SynchronousTumourIndicator getSynchronousTumourIndicatorInstance(LookupService lookupService, int id) 
	{
		return (SynchronousTumourIndicator)lookupService.getLookupInstance(SynchronousTumourIndicator.class, SynchronousTumourIndicator.TYPE_ID, id);
	}
	

	public static InvestigationTypeCollection getInvestigationType(LookupService lookupService) {
		InvestigationTypeCollection collection =
			(InvestigationTypeCollection) lookupService.getLookupCollection(InvestigationType.TYPE_ID, 
				InvestigationTypeCollection.class, InvestigationType.class);
		return collection;
	}

	public static InvestigationType getInvestigationTypeInstance(LookupService lookupService, int id) 
	{
		return (InvestigationType)lookupService.getLookupInstance(InvestigationType.class, InvestigationType.TYPE_ID, id);
	}
	

	public static TNMCertaintyFactorCollection getTNMCertaintyFactor(LookupService lookupService) {
		TNMCertaintyFactorCollection collection =
			(TNMCertaintyFactorCollection) lookupService.getLookupCollection(TNMCertaintyFactor.TYPE_ID, 
				TNMCertaintyFactorCollection.class, TNMCertaintyFactor.class);
		return collection;
	}

	public static TNMCertaintyFactor getTNMCertaintyFactorInstance(LookupService lookupService, int id) 
	{
		return (TNMCertaintyFactor)lookupService.getLookupInstance(TNMCertaintyFactor.class, TNMCertaintyFactor.TYPE_ID, id);
	}
	

	public static TNMTypeCollection getTNMType(LookupService lookupService) {
		TNMTypeCollection collection =
			(TNMTypeCollection) lookupService.getLookupCollection(TNMType.TYPE_ID, 
				TNMTypeCollection.class, TNMType.class);
		return collection;
	}

	public static TNMType getTNMTypeInstance(LookupService lookupService, int id) 
	{
		return (TNMType)lookupService.getLookupInstance(TNMType.class, TNMType.TYPE_ID, id);
	}
	

	public static GradeofDifferentationCollection getGradeofDifferentation(LookupService lookupService) {
		GradeofDifferentationCollection collection =
			(GradeofDifferentationCollection) lookupService.getLookupCollection(GradeofDifferentation.TYPE_ID, 
				GradeofDifferentationCollection.class, GradeofDifferentation.class);
		return collection;
	}

	public static GradeofDifferentation getGradeofDifferentationInstance(LookupService lookupService, int id) 
	{
		return (GradeofDifferentation)lookupService.getLookupInstance(GradeofDifferentation.class, GradeofDifferentation.TYPE_ID, id);
	}
	

	public static ChemoTherapyHRGCollection getChemoTherapyHRG(LookupService lookupService) {
		ChemoTherapyHRGCollection collection =
			(ChemoTherapyHRGCollection) lookupService.getLookupCollection(ChemoTherapyHRG.TYPE_ID, 
				ChemoTherapyHRGCollection.class, ChemoTherapyHRG.class);
		return collection;
	}

	public static ChemoTherapyHRG getChemoTherapyHRGInstance(LookupService lookupService, int id) 
	{
		return (ChemoTherapyHRG)lookupService.getLookupInstance(ChemoTherapyHRG.class, ChemoTherapyHRG.TYPE_ID, id);
	}
	

	public static ChemoTxChangeReasonCollection getChemoTxChangeReason(LookupService lookupService) {
		ChemoTxChangeReasonCollection collection =
			(ChemoTxChangeReasonCollection) lookupService.getLookupCollection(ChemoTxChangeReason.TYPE_ID, 
				ChemoTxChangeReasonCollection.class, ChemoTxChangeReason.class);
		return collection;
	}

	public static ChemoTxChangeReason getChemoTxChangeReasonInstance(LookupService lookupService, int id) 
	{
		return (ChemoTxChangeReason)lookupService.getLookupInstance(ChemoTxChangeReason.class, ChemoTxChangeReason.TYPE_ID, id);
	}
	

	public static DrugProgramResponseCollection getDrugProgramResponse(LookupService lookupService) {
		DrugProgramResponseCollection collection =
			(DrugProgramResponseCollection) lookupService.getLookupCollection(DrugProgramResponse.TYPE_ID, 
				DrugProgramResponseCollection.class, DrugProgramResponse.class);
		return collection;
	}

	public static DrugProgramResponse getDrugProgramResponseInstance(LookupService lookupService, int id) 
	{
		return (DrugProgramResponse)lookupService.getLookupInstance(DrugProgramResponse.class, DrugProgramResponse.TYPE_ID, id);
	}
	

	public static RegimenAcronymCollection getRegimenAcronym(LookupService lookupService) {
		RegimenAcronymCollection collection =
			(RegimenAcronymCollection) lookupService.getLookupCollection(RegimenAcronym.TYPE_ID, 
				RegimenAcronymCollection.class, RegimenAcronym.class);
		return collection;
	}

	public static RegimenAcronym getRegimenAcronymInstance(LookupService lookupService, int id) 
	{
		return (RegimenAcronym)lookupService.getLookupInstance(RegimenAcronym.class, RegimenAcronym.TYPE_ID, id);
	}
	

	public static DrugTherapyTypeCollection getDrugTherapyType(LookupService lookupService) {
		DrugTherapyTypeCollection collection =
			(DrugTherapyTypeCollection) lookupService.getLookupCollection(DrugTherapyType.TYPE_ID, 
				DrugTherapyTypeCollection.class, DrugTherapyType.class);
		return collection;
	}

	public static DrugTherapyType getDrugTherapyTypeInstance(LookupService lookupService, int id) 
	{
		return (DrugTherapyType)lookupService.getLookupInstance(DrugTherapyType.class, DrugTherapyType.TYPE_ID, id);
	}
	

	public static UnsealedSourceTypeCollection getUnsealedSourceType(LookupService lookupService) {
		UnsealedSourceTypeCollection collection =
			(UnsealedSourceTypeCollection) lookupService.getLookupCollection(UnsealedSourceType.TYPE_ID, 
				UnsealedSourceTypeCollection.class, UnsealedSourceType.class);
		return collection;
	}

	public static UnsealedSourceType getUnsealedSourceTypeInstance(LookupService lookupService, int id) 
	{
		return (UnsealedSourceType)lookupService.getLookupInstance(UnsealedSourceType.class, UnsealedSourceType.TYPE_ID, id);
	}
	

	public static BrachyTherapyIsotopeTypeCollection getBrachyTherapyIsotopeType(LookupService lookupService) {
		BrachyTherapyIsotopeTypeCollection collection =
			(BrachyTherapyIsotopeTypeCollection) lookupService.getLookupCollection(BrachyTherapyIsotopeType.TYPE_ID, 
				BrachyTherapyIsotopeTypeCollection.class, BrachyTherapyIsotopeType.class);
		return collection;
	}

	public static BrachyTherapyIsotopeType getBrachyTherapyIsotopeTypeInstance(LookupService lookupService, int id) 
	{
		return (BrachyTherapyIsotopeType)lookupService.getLookupInstance(BrachyTherapyIsotopeType.class, BrachyTherapyIsotopeType.TYPE_ID, id);
	}
	

	public static BrachyTherapyTypeCollection getBrachyTherapyType(LookupService lookupService) {
		BrachyTherapyTypeCollection collection =
			(BrachyTherapyTypeCollection) lookupService.getLookupCollection(BrachyTherapyType.TYPE_ID, 
				BrachyTherapyTypeCollection.class, BrachyTherapyType.class);
		return collection;
	}

	public static BrachyTherapyType getBrachyTherapyTypeInstance(LookupService lookupService, int id) 
	{
		return (BrachyTherapyType)lookupService.getLookupInstance(BrachyTherapyType.class, BrachyTherapyType.TYPE_ID, id);
	}
	

	public static TreatmentCourseStatusCollection getTreatmentCourseStatus(LookupService lookupService) {
		TreatmentCourseStatusCollection collection =
			(TreatmentCourseStatusCollection) lookupService.getLookupCollection(TreatmentCourseStatus.TYPE_ID, 
				TreatmentCourseStatusCollection.class, TreatmentCourseStatus.class);
		return collection;
	}

	public static TreatmentCourseStatus getTreatmentCourseStatusInstance(LookupService lookupService, int id) 
	{
		return (TreatmentCourseStatus)lookupService.getLookupInstance(TreatmentCourseStatus.class, TreatmentCourseStatus.TYPE_ID, id);
	}
	

	public static HRGCollection getHRG(LookupService lookupService) {
		HRGCollection collection =
			(HRGCollection) lookupService.getLookupCollection(HRG.TYPE_ID, 
				HRGCollection.class, HRG.class);
		return collection;
	}

	public static HRG getHRGInstance(LookupService lookupService, int id) 
	{
		return (HRG)lookupService.getLookupInstance(HRG.class, HRG.TYPE_ID, id);
	}
	

	public static MultiplePlanningCollection getMultiplePlanning(LookupService lookupService) {
		MultiplePlanningCollection collection =
			(MultiplePlanningCollection) lookupService.getLookupCollection(MultiplePlanning.TYPE_ID, 
				MultiplePlanningCollection.class, MultiplePlanning.class);
		return collection;
	}

	public static MultiplePlanning getMultiplePlanningInstance(LookupService lookupService, int id) 
	{
		return (MultiplePlanning)lookupService.getLookupInstance(MultiplePlanning.class, MultiplePlanning.TYPE_ID, id);
	}
	

	public static AnaestheticReqCollection getAnaestheticReq(LookupService lookupService) {
		AnaestheticReqCollection collection =
			(AnaestheticReqCollection) lookupService.getLookupCollection(AnaestheticReq.TYPE_ID, 
				AnaestheticReqCollection.class, AnaestheticReq.class);
		return collection;
	}

	public static AnaestheticReq getAnaestheticReqInstance(LookupService lookupService, int id) 
	{
		return (AnaestheticReq)lookupService.getLookupInstance(AnaestheticReq.class, AnaestheticReq.TYPE_ID, id);
	}
	

	public static ComplexityGroupCollection getComplexityGroup(LookupService lookupService) {
		ComplexityGroupCollection collection =
			(ComplexityGroupCollection) lookupService.getLookupCollection(ComplexityGroup.TYPE_ID, 
				ComplexityGroupCollection.class, ComplexityGroup.class);
		return collection;
	}

	public static ComplexityGroup getComplexityGroupInstance(LookupService lookupService, int id) 
	{
		return (ComplexityGroup)lookupService.getLookupInstance(ComplexityGroup.class, ComplexityGroup.TYPE_ID, id);
	}
	

	public static BeamTypeCollection getBeamType(LookupService lookupService) {
		BeamTypeCollection collection =
			(BeamTypeCollection) lookupService.getLookupCollection(BeamType.TYPE_ID, 
				BeamTypeCollection.class, BeamType.class);
		return collection;
	}

	public static BeamType getBeamTypeInstance(LookupService lookupService, int id) 
	{
		return (BeamType)lookupService.getLookupInstance(BeamType.class, BeamType.TYPE_ID, id);
	}
	

	public static RadiotherapyTypeCollection getRadiotherapyType(LookupService lookupService) {
		RadiotherapyTypeCollection collection =
			(RadiotherapyTypeCollection) lookupService.getLookupCollection(RadiotherapyType.TYPE_ID, 
				RadiotherapyTypeCollection.class, RadiotherapyType.class);
		return collection;
	}

	public static RadiotherapyType getRadiotherapyTypeInstance(LookupService lookupService, int id) 
	{
		return (RadiotherapyType)lookupService.getLookupInstance(RadiotherapyType.class, RadiotherapyType.TYPE_ID, id);
	}
	

	public static AnatomicalTreatmentSiteCollection getAnatomicalTreatmentSite(LookupService lookupService) {
		AnatomicalTreatmentSiteCollection collection =
			(AnatomicalTreatmentSiteCollection) lookupService.getLookupCollection(AnatomicalTreatmentSite.TYPE_ID, 
				AnatomicalTreatmentSiteCollection.class, AnatomicalTreatmentSite.class);
		return collection;
	}

	public static AnatomicalTreatmentSite getAnatomicalTreatmentSiteInstance(LookupService lookupService, int id) 
	{
		return (AnatomicalTreatmentSite)lookupService.getLookupInstance(AnatomicalTreatmentSite.class, AnatomicalTreatmentSite.TYPE_ID, id);
	}
	

	public static CancerTreatmentIntentCollection getCancerTreatmentIntent(LookupService lookupService) {
		CancerTreatmentIntentCollection collection =
			(CancerTreatmentIntentCollection) lookupService.getLookupCollection(CancerTreatmentIntent.TYPE_ID, 
				CancerTreatmentIntentCollection.class, CancerTreatmentIntent.class);
		return collection;
	}

	public static CancerTreatmentIntent getCancerTreatmentIntentInstance(LookupService lookupService, int id) 
	{
		return (CancerTreatmentIntent)lookupService.getLookupInstance(CancerTreatmentIntent.class, CancerTreatmentIntent.TYPE_ID, id);
	}
	

	public static ImageAnatomicalSiteCollection getImageAnatomicalSite(LookupService lookupService) {
		ImageAnatomicalSiteCollection collection =
			(ImageAnatomicalSiteCollection) lookupService.getLookupCollection(ImageAnatomicalSite.TYPE_ID, 
				ImageAnatomicalSiteCollection.class, ImageAnatomicalSite.class);
		return collection;
	}

	public static ImageAnatomicalSite getImageAnatomicalSiteInstance(LookupService lookupService, int id) 
	{
		return (ImageAnatomicalSite)lookupService.getLookupInstance(ImageAnatomicalSite.class, ImageAnatomicalSite.TYPE_ID, id);
	}
	

	public static ImagingModalityCollection getImagingModality(LookupService lookupService) {
		ImagingModalityCollection collection =
			(ImagingModalityCollection) lookupService.getLookupCollection(ImagingModality.TYPE_ID, 
				ImagingModalityCollection.class, ImagingModality.class);
		return collection;
	}

	public static ImagingModality getImagingModalityInstance(LookupService lookupService, int id) 
	{
		return (ImagingModality)lookupService.getLookupInstance(ImagingModality.class, ImagingModality.TYPE_ID, id);
	}
	
}



