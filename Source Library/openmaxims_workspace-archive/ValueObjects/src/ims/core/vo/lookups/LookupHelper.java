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
package ims.core.vo.lookups;

import ims.domain.lookups.LookupService;

/**
 * This is a generated interface.
 * Provides methods to get the ValueObject Lookup types of this namespace.
 * 
 */
public final class LookupHelper {
	public static InitatorCollection getInitator(LookupService lookupService) {
		InitatorCollection collection =
			(InitatorCollection) lookupService.getLookupCollection(Initator.TYPE_ID, 
				InitatorCollection.class, Initator.class);
		return collection;
	}

	public static Initator getInitatorInstance(LookupService lookupService, int id) 
	{
		return (Initator)lookupService.getLookupInstance(Initator.class, Initator.TYPE_ID, id);
	}
	

	public static TCIOfferMethodCollection getTCIOfferMethod(LookupService lookupService) {
		TCIOfferMethodCollection collection =
			(TCIOfferMethodCollection) lookupService.getLookupCollection(TCIOfferMethod.TYPE_ID, 
				TCIOfferMethodCollection.class, TCIOfferMethod.class);
		return collection;
	}

	public static TCIOfferMethod getTCIOfferMethodInstance(LookupService lookupService, int id) 
	{
		return (TCIOfferMethod)lookupService.getLookupInstance(TCIOfferMethod.class, TCIOfferMethod.TYPE_ID, id);
	}
	

	public static WaitingListStatusCollection getWaitingListStatus(LookupService lookupService) {
		WaitingListStatusCollection collection =
			(WaitingListStatusCollection) lookupService.getLookupCollection(WaitingListStatus.TYPE_ID, 
				WaitingListStatusCollection.class, WaitingListStatus.class);
		return collection;
	}

	public static WaitingListStatus getWaitingListStatusInstance(LookupService lookupService, int id) 
	{
		return (WaitingListStatus)lookupService.getLookupInstance(WaitingListStatus.class, WaitingListStatus.TYPE_ID, id);
	}
	

	public static PatientMergeFieldsCollection getPatientMergeFields(LookupService lookupService) {
		PatientMergeFieldsCollection collection =
			(PatientMergeFieldsCollection) lookupService.getLookupCollection(PatientMergeFields.TYPE_ID, 
				PatientMergeFieldsCollection.class, PatientMergeFields.class);
		return collection;
	}

	public static PatientMergeFields getPatientMergeFieldsInstance(LookupService lookupService, int id) 
	{
		return (PatientMergeFields)lookupService.getLookupInstance(PatientMergeFields.class, PatientMergeFields.TYPE_ID, id);
	}
	

	public static PACSClientTypeCollection getPACSClientType(LookupService lookupService) {
		PACSClientTypeCollection collection =
			(PACSClientTypeCollection) lookupService.getLookupCollection(PACSClientType.TYPE_ID, 
				PACSClientTypeCollection.class, PACSClientType.class);
		return collection;
	}

	public static PACSClientType getPACSClientTypeInstance(LookupService lookupService, int id) 
	{
		return (PACSClientType)lookupService.getLookupInstance(PACSClientType.class, PACSClientType.TYPE_ID, id);
	}
	

	public static MRNStatusCollection getMRNStatus(LookupService lookupService) {
		MRNStatusCollection collection =
			(MRNStatusCollection) lookupService.getLookupCollection(MRNStatus.TYPE_ID, 
				MRNStatusCollection.class, MRNStatus.class);
		return collection;
	}

	public static MRNStatus getMRNStatusInstance(LookupService lookupService, int id) 
	{
		return (MRNStatus)lookupService.getLookupInstance(MRNStatus.class, MRNStatus.TYPE_ID, id);
	}
	

	public static CountryCollection getCountry(LookupService lookupService) {
		CountryCollection collection =
			(CountryCollection) lookupService.getLookupCollection(Country.TYPE_ID, 
				CountryCollection.class, Country.class);
		return collection;
	}

	public static Country getCountryInstance(LookupService lookupService, int id) 
	{
		return (Country)lookupService.getLookupInstance(Country.class, Country.TYPE_ID, id);
	}
	

	public static ExternalResourceTypeCollection getExternalResourceType(LookupService lookupService) {
		ExternalResourceTypeCollection collection =
			(ExternalResourceTypeCollection) lookupService.getLookupCollection(ExternalResourceType.TYPE_ID, 
				ExternalResourceTypeCollection.class, ExternalResourceType.class);
		return collection;
	}

	public static ExternalResourceType getExternalResourceTypeInstance(LookupService lookupService, int id) 
	{
		return (ExternalResourceType)lookupService.getLookupInstance(ExternalResourceType.class, ExternalResourceType.TYPE_ID, id);
	}
	

	public static DementiaReasonForExclusionCollection getDementiaReasonForExclusion(LookupService lookupService) {
		DementiaReasonForExclusionCollection collection =
			(DementiaReasonForExclusionCollection) lookupService.getLookupCollection(DementiaReasonForExclusion.TYPE_ID, 
				DementiaReasonForExclusionCollection.class, DementiaReasonForExclusion.class);
		return collection;
	}

	public static DementiaReasonForExclusion getDementiaReasonForExclusionInstance(LookupService lookupService, int id) 
	{
		return (DementiaReasonForExclusion)lookupService.getLookupInstance(DementiaReasonForExclusion.class, DementiaReasonForExclusion.TYPE_ID, id);
	}
	

	public static DementiaWorklistStatusCollection getDementiaWorklistStatus(LookupService lookupService) {
		DementiaWorklistStatusCollection collection =
			(DementiaWorklistStatusCollection) lookupService.getLookupCollection(DementiaWorklistStatus.TYPE_ID, 
				DementiaWorklistStatusCollection.class, DementiaWorklistStatus.class);
		return collection;
	}

	public static DementiaWorklistStatus getDementiaWorklistStatusInstance(LookupService lookupService, int id) 
	{
		return (DementiaWorklistStatus)lookupService.getLookupInstance(DementiaWorklistStatus.class, DementiaWorklistStatus.TYPE_ID, id);
	}
	

	public static PreferredCommunicationLanguageCollection getPreferredCommunicationLanguage(LookupService lookupService) {
		PreferredCommunicationLanguageCollection collection =
			(PreferredCommunicationLanguageCollection) lookupService.getLookupCollection(PreferredCommunicationLanguage.TYPE_ID, 
				PreferredCommunicationLanguageCollection.class, PreferredCommunicationLanguage.class);
		return collection;
	}

	public static PreferredCommunicationLanguage getPreferredCommunicationLanguageInstance(LookupService lookupService, int id) 
	{
		return (PreferredCommunicationLanguage)lookupService.getLookupInstance(PreferredCommunicationLanguage.class, PreferredCommunicationLanguage.TYPE_ID, id);
	}
	

	public static CDSReportTypeCollection getCDSReportType(LookupService lookupService) {
		CDSReportTypeCollection collection =
			(CDSReportTypeCollection) lookupService.getLookupCollection(CDSReportType.TYPE_ID, 
				CDSReportTypeCollection.class, CDSReportType.class);
		return collection;
	}

	public static CDSReportType getCDSReportTypeInstance(LookupService lookupService, int id) 
	{
		return (CDSReportType)lookupService.getLookupInstance(CDSReportType.class, CDSReportType.TYPE_ID, id);
	}
	

	public static ElectronicPrescribingButtonCollection getElectronicPrescribingButton(LookupService lookupService) {
		ElectronicPrescribingButtonCollection collection =
			(ElectronicPrescribingButtonCollection) lookupService.getLookupCollection(ElectronicPrescribingButton.TYPE_ID, 
				ElectronicPrescribingButtonCollection.class, ElectronicPrescribingButton.class);
		return collection;
	}

	public static ElectronicPrescribingButton getElectronicPrescribingButtonInstance(LookupService lookupService, int id) 
	{
		return (ElectronicPrescribingButton)lookupService.getLookupInstance(ElectronicPrescribingButton.class, ElectronicPrescribingButton.TYPE_ID, id);
	}
	

	public static DocumentEmailStatusCollection getDocumentEmailStatus(LookupService lookupService) {
		DocumentEmailStatusCollection collection =
			(DocumentEmailStatusCollection) lookupService.getLookupCollection(DocumentEmailStatus.TYPE_ID, 
				DocumentEmailStatusCollection.class, DocumentEmailStatus.class);
		return collection;
	}

	public static DocumentEmailStatus getDocumentEmailStatusInstance(LookupService lookupService, int id) 
	{
		return (DocumentEmailStatus)lookupService.getLookupInstance(DocumentEmailStatus.class, DocumentEmailStatus.TYPE_ID, id);
	}
	

	public static EpisodeOfCareStatusCollection getEpisodeOfCareStatus(LookupService lookupService) {
		EpisodeOfCareStatusCollection collection =
			(EpisodeOfCareStatusCollection) lookupService.getLookupCollection(EpisodeOfCareStatus.TYPE_ID, 
				EpisodeOfCareStatusCollection.class, EpisodeOfCareStatus.class);
		return collection;
	}

	public static EpisodeOfCareStatus getEpisodeOfCareStatusInstance(LookupService lookupService, int id) 
	{
		return (EpisodeOfCareStatus)lookupService.getLookupInstance(EpisodeOfCareStatus.class, EpisodeOfCareStatus.TYPE_ID, id);
	}
	

	public static ProblemGroupStatusCollection getProblemGroupStatus(LookupService lookupService) {
		ProblemGroupStatusCollection collection =
			(ProblemGroupStatusCollection) lookupService.getLookupCollection(ProblemGroupStatus.TYPE_ID, 
				ProblemGroupStatusCollection.class, ProblemGroupStatus.class);
		return collection;
	}

	public static ProblemGroupStatus getProblemGroupStatusInstance(LookupService lookupService, int id) 
	{
		return (ProblemGroupStatus)lookupService.getLookupInstance(ProblemGroupStatus.class, ProblemGroupStatus.TYPE_ID, id);
	}
	

	public static ProcedureIncompleteReasonCollection getProcedureIncompleteReason(LookupService lookupService) {
		ProcedureIncompleteReasonCollection collection =
			(ProcedureIncompleteReasonCollection) lookupService.getLookupCollection(ProcedureIncompleteReason.TYPE_ID, 
				ProcedureIncompleteReasonCollection.class, ProcedureIncompleteReason.class);
		return collection;
	}

	public static ProcedureIncompleteReason getProcedureIncompleteReasonInstance(LookupService lookupService, int id) 
	{
		return (ProcedureIncompleteReason)lookupService.getLookupInstance(ProcedureIncompleteReason.class, ProcedureIncompleteReason.TYPE_ID, id);
	}
	

	public static PrivateInsuranceStatusCollection getPrivateInsuranceStatus(LookupService lookupService) {
		PrivateInsuranceStatusCollection collection =
			(PrivateInsuranceStatusCollection) lookupService.getLookupCollection(PrivateInsuranceStatus.TYPE_ID, 
				PrivateInsuranceStatusCollection.class, PrivateInsuranceStatus.class);
		return collection;
	}

	public static PrivateInsuranceStatus getPrivateInsuranceStatusInstance(LookupService lookupService, int id) 
	{
		return (PrivateInsuranceStatus)lookupService.getLookupInstance(PrivateInsuranceStatus.class, PrivateInsuranceStatus.TYPE_ID, id);
	}
	

	public static PrivateInsurancePolicyTypeCollection getPrivateInsurancePolicyType(LookupService lookupService) {
		PrivateInsurancePolicyTypeCollection collection =
			(PrivateInsurancePolicyTypeCollection) lookupService.getLookupCollection(PrivateInsurancePolicyType.TYPE_ID, 
				PrivateInsurancePolicyTypeCollection.class, PrivateInsurancePolicyType.class);
		return collection;
	}

	public static PrivateInsurancePolicyType getPrivateInsurancePolicyTypeInstance(LookupService lookupService, int id) 
	{
		return (PrivateInsurancePolicyType)lookupService.getLookupInstance(PrivateInsurancePolicyType.class, PrivateInsurancePolicyType.TYPE_ID, id);
	}
	

	public static ClinicalContactStatusCollection getClinicalContactStatus(LookupService lookupService) {
		ClinicalContactStatusCollection collection =
			(ClinicalContactStatusCollection) lookupService.getLookupCollection(ClinicalContactStatus.TYPE_ID, 
				ClinicalContactStatusCollection.class, ClinicalContactStatus.class);
		return collection;
	}

	public static ClinicalContactStatus getClinicalContactStatusInstance(LookupService lookupService, int id) 
	{
		return (ClinicalContactStatus)lookupService.getLookupInstance(ClinicalContactStatus.class, ClinicalContactStatus.TYPE_ID, id);
	}
	

	public static PASSpecialtyCollection getPASSpecialty(LookupService lookupService) {
		PASSpecialtyCollection collection =
			(PASSpecialtyCollection) lookupService.getLookupCollection(PASSpecialty.TYPE_ID, 
				PASSpecialtyCollection.class, PASSpecialty.class);
		return collection;
	}

	public static PASSpecialty getPASSpecialtyInstance(LookupService lookupService, int id) 
	{
		return (PASSpecialty)lookupService.getLookupInstance(PASSpecialty.class, PASSpecialty.TYPE_ID, id);
	}
	

	public static HomeFolderLocationCollection getHomeFolderLocation(LookupService lookupService) {
		HomeFolderLocationCollection collection =
			(HomeFolderLocationCollection) lookupService.getLookupCollection(HomeFolderLocation.TYPE_ID, 
				HomeFolderLocationCollection.class, HomeFolderLocation.class);
		return collection;
	}

	public static HomeFolderLocation getHomeFolderLocationInstance(LookupService lookupService, int id) 
	{
		return (HomeFolderLocation)lookupService.getLookupInstance(HomeFolderLocation.class, HomeFolderLocation.TYPE_ID, id);
	}
	

	public static PostMortemCollection getPostMortem(LookupService lookupService) {
		PostMortemCollection collection =
			(PostMortemCollection) lookupService.getLookupCollection(PostMortem.TYPE_ID, 
				PostMortemCollection.class, PostMortem.class);
		return collection;
	}

	public static PostMortem getPostMortemInstance(LookupService lookupService, int id) 
	{
		return (PostMortem)lookupService.getLookupInstance(PostMortem.class, PostMortem.TYPE_ID, id);
	}
	

	public static ReferralManagementContractTypeCollection getReferralManagementContractType(LookupService lookupService) {
		ReferralManagementContractTypeCollection collection =
			(ReferralManagementContractTypeCollection) lookupService.getLookupCollection(ReferralManagementContractType.TYPE_ID, 
				ReferralManagementContractTypeCollection.class, ReferralManagementContractType.class);
		return collection;
	}

	public static ReferralManagementContractType getReferralManagementContractTypeInstance(LookupService lookupService, int id) 
	{
		return (ReferralManagementContractType)lookupService.getLookupInstance(ReferralManagementContractType.class, ReferralManagementContractType.TYPE_ID, id);
	}
	

	public static ReasonForAptDelayCollection getReasonForAptDelay(LookupService lookupService) {
		ReasonForAptDelayCollection collection =
			(ReasonForAptDelayCollection) lookupService.getLookupCollection(ReasonForAptDelay.TYPE_ID, 
				ReasonForAptDelayCollection.class, ReasonForAptDelay.class);
		return collection;
	}

	public static ReasonForAptDelay getReasonForAptDelayInstance(LookupService lookupService, int id) 
	{
		return (ReasonForAptDelay)lookupService.getLookupInstance(ReasonForAptDelay.class, ReasonForAptDelay.TYPE_ID, id);
	}
	

	public static ClinicalNotingModeCollection getClinicalNotingMode(LookupService lookupService) {
		ClinicalNotingModeCollection collection =
			(ClinicalNotingModeCollection) lookupService.getLookupCollection(ClinicalNotingMode.TYPE_ID, 
				ClinicalNotingModeCollection.class, ClinicalNotingMode.class);
		return collection;
	}

	public static ClinicalNotingMode getClinicalNotingModeInstance(LookupService lookupService, int id) 
	{
		return (ClinicalNotingMode)lookupService.getLookupInstance(ClinicalNotingMode.class, ClinicalNotingMode.TYPE_ID, id);
	}
	

	public static JobRunningFrequencyCollection getJobRunningFrequency(LookupService lookupService) {
		JobRunningFrequencyCollection collection =
			(JobRunningFrequencyCollection) lookupService.getLookupCollection(JobRunningFrequency.TYPE_ID, 
				JobRunningFrequencyCollection.class, JobRunningFrequency.class);
		return collection;
	}

	public static JobRunningFrequency getJobRunningFrequencyInstance(LookupService lookupService, int id) 
	{
		return (JobRunningFrequency)lookupService.getLookupInstance(JobRunningFrequency.class, JobRunningFrequency.TYPE_ID, id);
	}
	

	public static ProcedureCategoryCollection getProcedureCategory(LookupService lookupService) {
		ProcedureCategoryCollection collection =
			(ProcedureCategoryCollection) lookupService.getLookupCollection(ProcedureCategory.TYPE_ID, 
				ProcedureCategoryCollection.class, ProcedureCategory.class);
		return collection;
	}

	public static ProcedureCategory getProcedureCategoryInstance(LookupService lookupService, int id) 
	{
		return (ProcedureCategory)lookupService.getLookupInstance(ProcedureCategory.class, ProcedureCategory.TYPE_ID, id);
	}
	

	public static MsgEventTypeCollection getMsgEventType(LookupService lookupService) {
		MsgEventTypeCollection collection =
			(MsgEventTypeCollection) lookupService.getLookupCollection(MsgEventType.TYPE_ID, 
				MsgEventTypeCollection.class, MsgEventType.class);
		return collection;
	}

	public static MsgEventType getMsgEventTypeInstance(LookupService lookupService, int id) 
	{
		return (MsgEventType)lookupService.getLookupInstance(MsgEventType.class, MsgEventType.TYPE_ID, id);
	}
	

	public static QueueTypeCollection getQueueType(LookupService lookupService) {
		QueueTypeCollection collection =
			(QueueTypeCollection) lookupService.getLookupCollection(QueueType.TYPE_ID, 
				QueueTypeCollection.class, QueueType.class);
		return collection;
	}

	public static QueueType getQueueTypeInstance(LookupService lookupService, int id) 
	{
		return (QueueType)lookupService.getLookupInstance(QueueType.class, QueueType.TYPE_ID, id);
	}
	

	public static FollowUpTypeCollection getFollowUpType(LookupService lookupService) {
		FollowUpTypeCollection collection =
			(FollowUpTypeCollection) lookupService.getLookupCollection(FollowUpType.TYPE_ID, 
				FollowUpTypeCollection.class, FollowUpType.class);
		return collection;
	}

	public static FollowUpType getFollowUpTypeInstance(LookupService lookupService, int id) 
	{
		return (FollowUpType)lookupService.getLookupInstance(FollowUpType.class, FollowUpType.TYPE_ID, id);
	}
	

	public static BedTypeRequestedCollection getBedTypeRequested(LookupService lookupService) {
		BedTypeRequestedCollection collection =
			(BedTypeRequestedCollection) lookupService.getLookupCollection(BedTypeRequested.TYPE_ID, 
				BedTypeRequestedCollection.class, BedTypeRequested.class);
		return collection;
	}

	public static BedTypeRequested getBedTypeRequestedInstance(LookupService lookupService, int id) 
	{
		return (BedTypeRequested)lookupService.getLookupInstance(BedTypeRequested.class, BedTypeRequested.TYPE_ID, id);
	}
	

	public static CustomListTypeCollection getCustomListType(LookupService lookupService) {
		CustomListTypeCollection collection =
			(CustomListTypeCollection) lookupService.getLookupCollection(CustomListType.TYPE_ID, 
				CustomListTypeCollection.class, CustomListType.class);
		return collection;
	}

	public static CustomListType getCustomListTypeInstance(LookupService lookupService, int id) 
	{
		return (CustomListType)lookupService.getLookupInstance(CustomListType.class, CustomListType.TYPE_ID, id);
	}
	

	public static DischargeReasonCollection getDischargeReason(LookupService lookupService) {
		DischargeReasonCollection collection =
			(DischargeReasonCollection) lookupService.getLookupCollection(DischargeReason.TYPE_ID, 
				DischargeReasonCollection.class, DischargeReason.class);
		return collection;
	}

	public static DischargeReason getDischargeReasonInstance(LookupService lookupService, int id) 
	{
		return (DischargeReason)lookupService.getLookupInstance(DischargeReason.class, DischargeReason.TYPE_ID, id);
	}
	

	public static PlanOfActionCollection getPlanOfAction(LookupService lookupService) {
		PlanOfActionCollection collection =
			(PlanOfActionCollection) lookupService.getLookupCollection(PlanOfAction.TYPE_ID, 
				PlanOfActionCollection.class, PlanOfAction.class);
		return collection;
	}

	public static PlanOfAction getPlanOfActionInstance(LookupService lookupService, int id) 
	{
		return (PlanOfAction)lookupService.getLookupInstance(PlanOfAction.class, PlanOfAction.TYPE_ID, id);
	}
	

	public static AdviceToGPCollection getAdviceToGP(LookupService lookupService) {
		AdviceToGPCollection collection =
			(AdviceToGPCollection) lookupService.getLookupCollection(AdviceToGP.TYPE_ID, 
				AdviceToGPCollection.class, AdviceToGP.class);
		return collection;
	}

	public static AdviceToGP getAdviceToGPInstance(LookupService lookupService, int id) 
	{
		return (AdviceToGP)lookupService.getLookupInstance(AdviceToGP.class, AdviceToGP.TYPE_ID, id);
	}
	

	public static AdviceToPatientCollection getAdviceToPatient(LookupService lookupService) {
		AdviceToPatientCollection collection =
			(AdviceToPatientCollection) lookupService.getLookupCollection(AdviceToPatient.TYPE_ID, 
				AdviceToPatientCollection.class, AdviceToPatient.class);
		return collection;
	}

	public static AdviceToPatient getAdviceToPatientInstance(LookupService lookupService, int id) 
	{
		return (AdviceToPatient)lookupService.getLookupInstance(AdviceToPatient.class, AdviceToPatient.TYPE_ID, id);
	}
	

	public static AuscultationFindingCollection getAuscultationFinding(LookupService lookupService) {
		AuscultationFindingCollection collection =
			(AuscultationFindingCollection) lookupService.getLookupCollection(AuscultationFinding.TYPE_ID, 
				AuscultationFindingCollection.class, AuscultationFinding.class);
		return collection;
	}

	public static AuscultationFinding getAuscultationFindingInstance(LookupService lookupService, int id) 
	{
		return (AuscultationFinding)lookupService.getLookupInstance(AuscultationFinding.class, AuscultationFinding.TYPE_ID, id);
	}
	

	public static ECGFindingsCollection getECGFindings(LookupService lookupService) {
		ECGFindingsCollection collection =
			(ECGFindingsCollection) lookupService.getLookupCollection(ECGFindings.TYPE_ID, 
				ECGFindingsCollection.class, ECGFindings.class);
		return collection;
	}

	public static ECGFindings getECGFindingsInstance(LookupService lookupService, int id) 
	{
		return (ECGFindings)lookupService.getLookupInstance(ECGFindings.class, ECGFindings.TYPE_ID, id);
	}
	

	public static RACPRelevantDiagnosisListCollection getRACPRelevantDiagnosisList(LookupService lookupService) {
		RACPRelevantDiagnosisListCollection collection =
			(RACPRelevantDiagnosisListCollection) lookupService.getLookupCollection(RACPRelevantDiagnosisList.TYPE_ID, 
				RACPRelevantDiagnosisListCollection.class, RACPRelevantDiagnosisList.class);
		return collection;
	}

	public static RACPRelevantDiagnosisList getRACPRelevantDiagnosisListInstance(LookupService lookupService, int id) 
	{
		return (RACPRelevantDiagnosisList)lookupService.getLookupInstance(RACPRelevantDiagnosisList.class, RACPRelevantDiagnosisList.TYPE_ID, id);
	}
	

	public static RACPRiskFactorCollection getRACPRiskFactor(LookupService lookupService) {
		RACPRiskFactorCollection collection =
			(RACPRiskFactorCollection) lookupService.getLookupCollection(RACPRiskFactor.TYPE_ID, 
				RACPRiskFactorCollection.class, RACPRiskFactor.class);
		return collection;
	}

	public static RACPRiskFactor getRACPRiskFactorInstance(LookupService lookupService, int id) 
	{
		return (RACPRiskFactor)lookupService.getLookupInstance(RACPRiskFactor.class, RACPRiskFactor.TYPE_ID, id);
	}
	

	public static RACPSymptomCollection getRACPSymptom(LookupService lookupService) {
		RACPSymptomCollection collection =
			(RACPSymptomCollection) lookupService.getLookupCollection(RACPSymptom.TYPE_ID, 
				RACPSymptomCollection.class, RACPSymptom.class);
		return collection;
	}

	public static RACPSymptom getRACPSymptomInstance(LookupService lookupService, int id) 
	{
		return (RACPSymptom)lookupService.getLookupInstance(RACPSymptom.class, RACPSymptom.TYPE_ID, id);
	}
	

	public static TaxonomyElementCollection getTaxonomyElement(LookupService lookupService) {
		TaxonomyElementCollection collection =
			(TaxonomyElementCollection) lookupService.getLookupCollection(TaxonomyElement.TYPE_ID, 
				TaxonomyElementCollection.class, TaxonomyElement.class);
		return collection;
	}

	public static TaxonomyElement getTaxonomyElementInstance(LookupService lookupService, int id) 
	{
		return (TaxonomyElement)lookupService.getLookupInstance(TaxonomyElement.class, TaxonomyElement.TYPE_ID, id);
	}
	

	public static PollStatusCollection getPollStatus(LookupService lookupService) {
		PollStatusCollection collection =
			(PollStatusCollection) lookupService.getLookupCollection(PollStatus.TYPE_ID, 
				PollStatusCollection.class, PollStatus.class);
		return collection;
	}

	public static PollStatus getPollStatusInstance(LookupService lookupService, int id) 
	{
		return (PollStatus)lookupService.getLookupInstance(PollStatus.class, PollStatus.TYPE_ID, id);
	}
	

	public static TreatmentDeferredReasonCollection getTreatmentDeferredReason(LookupService lookupService) {
		TreatmentDeferredReasonCollection collection =
			(TreatmentDeferredReasonCollection) lookupService.getLookupCollection(TreatmentDeferredReason.TYPE_ID, 
				TreatmentDeferredReasonCollection.class, TreatmentDeferredReason.class);
		return collection;
	}

	public static TreatmentDeferredReason getTreatmentDeferredReasonInstance(LookupService lookupService, int id) 
	{
		return (TreatmentDeferredReason)lookupService.getLookupInstance(TreatmentDeferredReason.class, TreatmentDeferredReason.TYPE_ID, id);
	}
	

	public static MethodOfDischargeCollection getMethodOfDischarge(LookupService lookupService) {
		MethodOfDischargeCollection collection =
			(MethodOfDischargeCollection) lookupService.getLookupCollection(MethodOfDischarge.TYPE_ID, 
				MethodOfDischargeCollection.class, MethodOfDischarge.class);
		return collection;
	}

	public static MethodOfDischarge getMethodOfDischargeInstance(LookupService lookupService, int id) 
	{
		return (MethodOfDischarge)lookupService.getLookupInstance(MethodOfDischarge.class, MethodOfDischarge.TYPE_ID, id);
	}
	

	public static ApplicationSiteNameCollection getApplicationSiteName(LookupService lookupService) {
		ApplicationSiteNameCollection collection =
			(ApplicationSiteNameCollection) lookupService.getLookupCollection(ApplicationSiteName.TYPE_ID, 
				ApplicationSiteNameCollection.class, ApplicationSiteName.class);
		return collection;
	}

	public static ApplicationSiteName getApplicationSiteNameInstance(LookupService lookupService, int id) 
	{
		return (ApplicationSiteName)lookupService.getLookupInstance(ApplicationSiteName.class, ApplicationSiteName.TYPE_ID, id);
	}
	

	public static TCITypeCollection getTCIType(LookupService lookupService) {
		TCITypeCollection collection =
			(TCITypeCollection) lookupService.getLookupCollection(TCIType.TYPE_ID, 
				TCITypeCollection.class, TCIType.class);
		return collection;
	}

	public static TCIType getTCITypeInstance(LookupService lookupService, int id) 
	{
		return (TCIType)lookupService.getLookupInstance(TCIType.class, TCIType.TYPE_ID, id);
	}
	

	public static BedSpaceTypeCollection getBedSpaceType(LookupService lookupService) {
		BedSpaceTypeCollection collection =
			(BedSpaceTypeCollection) lookupService.getLookupCollection(BedSpaceType.TYPE_ID, 
				BedSpaceTypeCollection.class, BedSpaceType.class);
		return collection;
	}

	public static BedSpaceType getBedSpaceTypeInstance(LookupService lookupService, int id) 
	{
		return (BedSpaceType)lookupService.getLookupInstance(BedSpaceType.class, BedSpaceType.TYPE_ID, id);
	}
	

	public static ElectiveAdmissionStatusCollection getElectiveAdmissionStatus(LookupService lookupService) {
		ElectiveAdmissionStatusCollection collection =
			(ElectiveAdmissionStatusCollection) lookupService.getLookupCollection(ElectiveAdmissionStatus.TYPE_ID, 
				ElectiveAdmissionStatusCollection.class, ElectiveAdmissionStatus.class);
		return collection;
	}

	public static ElectiveAdmissionStatus getElectiveAdmissionStatusInstance(LookupService lookupService, int id) 
	{
		return (ElectiveAdmissionStatus)lookupService.getLookupInstance(ElectiveAdmissionStatus.class, ElectiveAdmissionStatus.TYPE_ID, id);
	}
	

	public static ReasonForBedClosureCollection getReasonForBedClosure(LookupService lookupService) {
		ReasonForBedClosureCollection collection =
			(ReasonForBedClosureCollection) lookupService.getLookupCollection(ReasonForBedClosure.TYPE_ID, 
				ReasonForBedClosureCollection.class, ReasonForBedClosure.class);
		return collection;
	}

	public static ReasonForBedClosure getReasonForBedClosureInstance(LookupService lookupService, int id) 
	{
		return (ReasonForBedClosure)lookupService.getLookupInstance(ReasonForBedClosure.class, ReasonForBedClosure.TYPE_ID, id);
	}
	

	public static TransferStatusCollection getTransferStatus(LookupService lookupService) {
		TransferStatusCollection collection =
			(TransferStatusCollection) lookupService.getLookupCollection(TransferStatus.TYPE_ID, 
				TransferStatusCollection.class, TransferStatus.class);
		return collection;
	}

	public static TransferStatus getTransferStatusInstance(LookupService lookupService, int id) 
	{
		return (TransferStatus)lookupService.getLookupInstance(TransferStatus.class, TransferStatus.TYPE_ID, id);
	}
	

	public static AdmissionTypeCollection getAdmissionType(LookupService lookupService) {
		AdmissionTypeCollection collection =
			(AdmissionTypeCollection) lookupService.getLookupCollection(AdmissionType.TYPE_ID, 
				AdmissionTypeCollection.class, AdmissionType.class);
		return collection;
	}

	public static AdmissionType getAdmissionTypeInstance(LookupService lookupService, int id) 
	{
		return (AdmissionType)lookupService.getLookupInstance(AdmissionType.class, AdmissionType.TYPE_ID, id);
	}
	

	public static EmergencyAdmissionStatusCollection getEmergencyAdmissionStatus(LookupService lookupService) {
		EmergencyAdmissionStatusCollection collection =
			(EmergencyAdmissionStatusCollection) lookupService.getLookupCollection(EmergencyAdmissionStatus.TYPE_ID, 
				EmergencyAdmissionStatusCollection.class, EmergencyAdmissionStatus.class);
		return collection;
	}

	public static EmergencyAdmissionStatus getEmergencyAdmissionStatusInstance(LookupService lookupService, int id) 
	{
		return (EmergencyAdmissionStatus)lookupService.getLookupInstance(EmergencyAdmissionStatus.class, EmergencyAdmissionStatus.TYPE_ID, id);
	}
	

	public static BedStatusCollection getBedStatus(LookupService lookupService) {
		BedStatusCollection collection =
			(BedStatusCollection) lookupService.getLookupCollection(BedStatus.TYPE_ID, 
				BedStatusCollection.class, BedStatus.class);
		return collection;
	}

	public static BedStatus getBedStatusInstance(LookupService lookupService, int id) 
	{
		return (BedStatus)lookupService.getLookupInstance(BedStatus.class, BedStatus.TYPE_ID, id);
	}
	

	public static WardTypeCollection getWardType(LookupService lookupService) {
		WardTypeCollection collection =
			(WardTypeCollection) lookupService.getLookupCollection(WardType.TYPE_ID, 
				WardTypeCollection.class, WardType.class);
		return collection;
	}

	public static WardType getWardTypeInstance(LookupService lookupService, int id) 
	{
		return (WardType)lookupService.getLookupInstance(WardType.class, WardType.TYPE_ID, id);
	}
	

	public static SourceOfAdmissionCollection getSourceOfAdmission(LookupService lookupService) {
		SourceOfAdmissionCollection collection =
			(SourceOfAdmissionCollection) lookupService.getLookupCollection(SourceOfAdmission.TYPE_ID, 
				SourceOfAdmissionCollection.class, SourceOfAdmission.class);
		return collection;
	}

	public static SourceOfAdmission getSourceOfAdmissionInstance(LookupService lookupService, int id) 
	{
		return (SourceOfAdmission)lookupService.getLookupInstance(SourceOfAdmission.class, SourceOfAdmission.TYPE_ID, id);
	}
	

	public static MethodOfAdmissionCollection getMethodOfAdmission(LookupService lookupService) {
		MethodOfAdmissionCollection collection =
			(MethodOfAdmissionCollection) lookupService.getLookupCollection(MethodOfAdmission.TYPE_ID, 
				MethodOfAdmissionCollection.class, MethodOfAdmission.class);
		return collection;
	}

	public static MethodOfAdmission getMethodOfAdmissionInstance(LookupService lookupService, int id) 
	{
		return (MethodOfAdmission)lookupService.getLookupInstance(MethodOfAdmission.class, MethodOfAdmission.TYPE_ID, id);
	}
	

	public static FilterTextBoxTypeCollection getFilterTextBoxType(LookupService lookupService) {
		FilterTextBoxTypeCollection collection =
			(FilterTextBoxTypeCollection) lookupService.getLookupCollection(FilterTextBoxType.TYPE_ID, 
				FilterTextBoxTypeCollection.class, FilterTextBoxType.class);
		return collection;
	}

	public static FilterTextBoxType getFilterTextBoxTypeInstance(LookupService lookupService, int id) 
	{
		return (FilterTextBoxType)lookupService.getLookupInstance(FilterTextBoxType.class, FilterTextBoxType.TYPE_ID, id);
	}
	

	public static AddressTypeCollection getAddressType(LookupService lookupService) {
		AddressTypeCollection collection =
			(AddressTypeCollection) lookupService.getLookupCollection(AddressType.TYPE_ID, 
				AddressTypeCollection.class, AddressType.class);
		return collection;
	}

	public static AddressType getAddressTypeInstance(LookupService lookupService, int id) 
	{
		return (AddressType)lookupService.getLookupInstance(AddressType.class, AddressType.TYPE_ID, id);
	}
	

	public static PatientKioskThemeCollection getPatientKioskTheme(LookupService lookupService) {
		PatientKioskThemeCollection collection =
			(PatientKioskThemeCollection) lookupService.getLookupCollection(PatientKioskTheme.TYPE_ID, 
				PatientKioskThemeCollection.class, PatientKioskTheme.class);
		return collection;
	}

	public static PatientKioskTheme getPatientKioskThemeInstance(LookupService lookupService, int id) 
	{
		return (PatientKioskTheme)lookupService.getLookupInstance(PatientKioskTheme.class, PatientKioskTheme.TYPE_ID, id);
	}
	

	public static DocumentCategoryCollection getDocumentCategory(LookupService lookupService) {
		DocumentCategoryCollection collection =
			(DocumentCategoryCollection) lookupService.getLookupCollection(DocumentCategory.TYPE_ID, 
				DocumentCategoryCollection.class, DocumentCategory.class);
		return collection;
	}

	public static DocumentCategory getDocumentCategoryInstance(LookupService lookupService, int id) 
	{
		return (DocumentCategory)lookupService.getLookupInstance(DocumentCategory.class, DocumentCategory.TYPE_ID, id);
	}
	

	public static DocumentCreationTypeCollection getDocumentCreationType(LookupService lookupService) {
		DocumentCreationTypeCollection collection =
			(DocumentCreationTypeCollection) lookupService.getLookupCollection(DocumentCreationType.TYPE_ID, 
				DocumentCreationTypeCollection.class, DocumentCreationType.class);
		return collection;
	}

	public static DocumentCreationType getDocumentCreationTypeInstance(LookupService lookupService, int id) 
	{
		return (DocumentCreationType)lookupService.getLookupInstance(DocumentCreationType.class, DocumentCreationType.TYPE_ID, id);
	}
	

	public static FileTypeCollection getFileType(LookupService lookupService) {
		FileTypeCollection collection =
			(FileTypeCollection) lookupService.getLookupCollection(FileType.TYPE_ID, 
				FileTypeCollection.class, FileType.class);
		return collection;
	}

	public static FileType getFileTypeInstance(LookupService lookupService, int id) 
	{
		return (FileType)lookupService.getLookupInstance(FileType.class, FileType.TYPE_ID, id);
	}
	

	public static SpecialNeedCollection getSpecialNeed(LookupService lookupService) {
		SpecialNeedCollection collection =
			(SpecialNeedCollection) lookupService.getLookupCollection(SpecialNeed.TYPE_ID, 
				SpecialNeedCollection.class, SpecialNeed.class);
		return collection;
	}

	public static SpecialNeed getSpecialNeedInstance(LookupService lookupService, int id) 
	{
		return (SpecialNeed)lookupService.getLookupInstance(SpecialNeed.class, SpecialNeed.TYPE_ID, id);
	}
	

	public static WorklistContactTypeCollection getWorklistContactType(LookupService lookupService) {
		WorklistContactTypeCollection collection =
			(WorklistContactTypeCollection) lookupService.getLookupCollection(WorklistContactType.TYPE_ID, 
				WorklistContactTypeCollection.class, WorklistContactType.class);
		return collection;
	}

	public static WorklistContactType getWorklistContactTypeInstance(LookupService lookupService, int id) 
	{
		return (WorklistContactType)lookupService.getLookupInstance(WorklistContactType.class, WorklistContactType.TYPE_ID, id);
	}
	

	public static RegistrationSourceOfInfoCollection getRegistrationSourceOfInfo(LookupService lookupService) {
		RegistrationSourceOfInfoCollection collection =
			(RegistrationSourceOfInfoCollection) lookupService.getLookupCollection(RegistrationSourceOfInfo.TYPE_ID, 
				RegistrationSourceOfInfoCollection.class, RegistrationSourceOfInfo.class);
		return collection;
	}

	public static RegistrationSourceOfInfo getRegistrationSourceOfInfoInstance(LookupService lookupService, int id) 
	{
		return (RegistrationSourceOfInfo)lookupService.getLookupInstance(RegistrationSourceOfInfo.class, RegistrationSourceOfInfo.TYPE_ID, id);
	}
	

	public static PatientAlertStatusCollection getPatientAlertStatus(LookupService lookupService) {
		PatientAlertStatusCollection collection =
			(PatientAlertStatusCollection) lookupService.getLookupCollection(PatientAlertStatus.TYPE_ID, 
				PatientAlertStatusCollection.class, PatientAlertStatus.class);
		return collection;
	}

	public static PatientAlertStatus getPatientAlertStatusInstance(LookupService lookupService, int id) 
	{
		return (PatientAlertStatus)lookupService.getLookupInstance(PatientAlertStatus.class, PatientAlertStatus.TYPE_ID, id);
	}
	

	public static PatientAllergyStatusCollection getPatientAllergyStatus(LookupService lookupService) {
		PatientAllergyStatusCollection collection =
			(PatientAllergyStatusCollection) lookupService.getLookupCollection(PatientAllergyStatus.TYPE_ID, 
				PatientAllergyStatusCollection.class, PatientAllergyStatus.class);
		return collection;
	}

	public static PatientAllergyStatus getPatientAllergyStatusInstance(LookupService lookupService, int id) 
	{
		return (PatientAllergyStatus)lookupService.getLookupInstance(PatientAllergyStatus.class, PatientAllergyStatus.TYPE_ID, id);
	}
	

	public static PatientCausingConcernCollection getPatientCausingConcern(LookupService lookupService) {
		PatientCausingConcernCollection collection =
			(PatientCausingConcernCollection) lookupService.getLookupCollection(PatientCausingConcern.TYPE_ID, 
				PatientCausingConcernCollection.class, PatientCausingConcern.class);
		return collection;
	}

	public static PatientCausingConcern getPatientCausingConcernInstance(LookupService lookupService, int id) 
	{
		return (PatientCausingConcern)lookupService.getLookupInstance(PatientCausingConcern.class, PatientCausingConcern.TYPE_ID, id);
	}
	

	public static UrineOutputCollection getUrineOutput(LookupService lookupService) {
		UrineOutputCollection collection =
			(UrineOutputCollection) lookupService.getLookupCollection(UrineOutput.TYPE_ID, 
				UrineOutputCollection.class, UrineOutput.class);
		return collection;
	}

	public static UrineOutput getUrineOutputInstance(LookupService lookupService, int id) 
	{
		return (UrineOutput)lookupService.getLookupInstance(UrineOutput.class, UrineOutput.TYPE_ID, id);
	}
	

	public static ConsciousLevelCollection getConsciousLevel(LookupService lookupService) {
		ConsciousLevelCollection collection =
			(ConsciousLevelCollection) lookupService.getLookupCollection(ConsciousLevel.TYPE_ID, 
				ConsciousLevelCollection.class, ConsciousLevel.class);
		return collection;
	}

	public static ConsciousLevel getConsciousLevelInstance(LookupService lookupService, int id) 
	{
		return (ConsciousLevel)lookupService.getLookupInstance(ConsciousLevel.class, ConsciousLevel.TYPE_ID, id);
	}
	

	public static CauseofDeathCollection getCauseofDeath(LookupService lookupService) {
		CauseofDeathCollection collection =
			(CauseofDeathCollection) lookupService.getLookupCollection(CauseofDeath.TYPE_ID, 
				CauseofDeathCollection.class, CauseofDeath.class);
		return collection;
	}

	public static CauseofDeath getCauseofDeathInstance(LookupService lookupService, int id) 
	{
		return (CauseofDeath)lookupService.getLookupInstance(CauseofDeath.class, CauseofDeath.TYPE_ID, id);
	}
	

	public static SurgeryASAGradeCollection getSurgeryASAGrade(LookupService lookupService) {
		SurgeryASAGradeCollection collection =
			(SurgeryASAGradeCollection) lookupService.getLookupCollection(SurgeryASAGrade.TYPE_ID, 
				SurgeryASAGradeCollection.class, SurgeryASAGrade.class);
		return collection;
	}

	public static SurgeryASAGrade getSurgeryASAGradeInstance(LookupService lookupService, int id) 
	{
		return (SurgeryASAGrade)lookupService.getLookupInstance(SurgeryASAGrade.class, SurgeryASAGrade.TYPE_ID, id);
	}
	

	public static ConsultantPresenceCollection getConsultantPresence(LookupService lookupService) {
		ConsultantPresenceCollection collection =
			(ConsultantPresenceCollection) lookupService.getLookupCollection(ConsultantPresence.TYPE_ID, 
				ConsultantPresenceCollection.class, ConsultantPresence.class);
		return collection;
	}

	public static ConsultantPresence getConsultantPresenceInstance(LookupService lookupService, int id) 
	{
		return (ConsultantPresence)lookupService.getLookupInstance(ConsultantPresence.class, ConsultantPresence.TYPE_ID, id);
	}
	

	public static ProcedureTypeCollection getProcedureType(LookupService lookupService) {
		ProcedureTypeCollection collection =
			(ProcedureTypeCollection) lookupService.getLookupCollection(ProcedureType.TYPE_ID, 
				ProcedureTypeCollection.class, ProcedureType.class);
		return collection;
	}

	public static ProcedureType getProcedureTypeInstance(LookupService lookupService, int id) 
	{
		return (ProcedureType)lookupService.getLookupInstance(ProcedureType.class, ProcedureType.TYPE_ID, id);
	}
	

	public static CancerStatusCollection getCancerStatus(LookupService lookupService) {
		CancerStatusCollection collection =
			(CancerStatusCollection) lookupService.getLookupCollection(CancerStatus.TYPE_ID, 
				CancerStatusCollection.class, CancerStatus.class);
		return collection;
	}

	public static CancerStatus getCancerStatusInstance(LookupService lookupService, int id) 
	{
		return (CancerStatus)lookupService.getLookupInstance(CancerStatus.class, CancerStatus.TYPE_ID, id);
	}
	

	public static UrgentCancerReferralTypeCollection getUrgentCancerReferralType(LookupService lookupService) {
		UrgentCancerReferralTypeCollection collection =
			(UrgentCancerReferralTypeCollection) lookupService.getLookupCollection(UrgentCancerReferralType.TYPE_ID, 
				UrgentCancerReferralTypeCollection.class, UrgentCancerReferralType.class);
		return collection;
	}

	public static UrgentCancerReferralType getUrgentCancerReferralTypeInstance(LookupService lookupService, int id) 
	{
		return (UrgentCancerReferralType)lookupService.getLookupInstance(UrgentCancerReferralType.class, UrgentCancerReferralType.TYPE_ID, id);
	}
	

	public static ReasonForReferralCollection getReasonForReferral(LookupService lookupService) {
		ReasonForReferralCollection collection =
			(ReasonForReferralCollection) lookupService.getLookupCollection(ReasonForReferral.TYPE_ID, 
				ReasonForReferralCollection.class, ReasonForReferral.class);
		return collection;
	}

	public static ReasonForReferral getReasonForReferralInstance(LookupService lookupService, int id) 
	{
		return (ReasonForReferral)lookupService.getLookupInstance(ReasonForReferral.class, ReasonForReferral.TYPE_ID, id);
	}
	

	public static ReferralPriorityCollection getReferralPriority(LookupService lookupService) {
		ReferralPriorityCollection collection =
			(ReferralPriorityCollection) lookupService.getLookupCollection(ReferralPriority.TYPE_ID, 
				ReferralPriorityCollection.class, ReferralPriority.class);
		return collection;
	}

	public static ReferralPriority getReferralPriorityInstance(LookupService lookupService, int id) 
	{
		return (ReferralPriority)lookupService.getLookupInstance(ReferralPriority.class, ReferralPriority.TYPE_ID, id);
	}
	

	public static PatientMobilityCollection getPatientMobility(LookupService lookupService) {
		PatientMobilityCollection collection =
			(PatientMobilityCollection) lookupService.getLookupCollection(PatientMobility.TYPE_ID, 
				PatientMobilityCollection.class, PatientMobility.class);
		return collection;
	}

	public static PatientMobility getPatientMobilityInstance(LookupService lookupService, int id) 
	{
		return (PatientMobility)lookupService.getLookupInstance(PatientMobility.class, PatientMobility.TYPE_ID, id);
	}
	

	public static DischargeMethodCollection getDischargeMethod(LookupService lookupService) {
		DischargeMethodCollection collection =
			(DischargeMethodCollection) lookupService.getLookupCollection(DischargeMethod.TYPE_ID, 
				DischargeMethodCollection.class, DischargeMethod.class);
		return collection;
	}

	public static DischargeMethod getDischargeMethodInstance(LookupService lookupService, int id) 
	{
		return (DischargeMethod)lookupService.getLookupInstance(DischargeMethod.class, DischargeMethod.TYPE_ID, id);
	}
	

	public static DischargeOutcomeCollection getDischargeOutcome(LookupService lookupService) {
		DischargeOutcomeCollection collection =
			(DischargeOutcomeCollection) lookupService.getLookupCollection(DischargeOutcome.TYPE_ID, 
				DischargeOutcomeCollection.class, DischargeOutcome.class);
		return collection;
	}

	public static DischargeOutcome getDischargeOutcomeInstance(LookupService lookupService, int id) 
	{
		return (DischargeOutcome)lookupService.getLookupInstance(DischargeOutcome.class, DischargeOutcome.TYPE_ID, id);
	}
	

	public static DeathConditionCollection getDeathCondition(LookupService lookupService) {
		DeathConditionCollection collection =
			(DeathConditionCollection) lookupService.getLookupCollection(DeathCondition.TYPE_ID, 
				DeathConditionCollection.class, DeathCondition.class);
		return collection;
	}

	public static DeathCondition getDeathConditionInstance(LookupService lookupService, int id) 
	{
		return (DeathCondition)lookupService.getLookupInstance(DeathCondition.class, DeathCondition.TYPE_ID, id);
	}
	

	public static DeathCodeDiscrepencyCollection getDeathCodeDiscrepency(LookupService lookupService) {
		DeathCodeDiscrepencyCollection collection =
			(DeathCodeDiscrepencyCollection) lookupService.getLookupCollection(DeathCodeDiscrepency.TYPE_ID, 
				DeathCodeDiscrepencyCollection.class, DeathCodeDiscrepency.class);
		return collection;
	}

	public static DeathCodeDiscrepency getDeathCodeDiscrepencyInstance(LookupService lookupService, int id) 
	{
		return (DeathCodeDiscrepency)lookupService.getLookupInstance(DeathCodeDiscrepency.class, DeathCodeDiscrepency.TYPE_ID, id);
	}
	

	public static PasEventTypeCollection getPasEventType(LookupService lookupService) {
		PasEventTypeCollection collection =
			(PasEventTypeCollection) lookupService.getLookupCollection(PasEventType.TYPE_ID, 
				PasEventTypeCollection.class, PasEventType.class);
		return collection;
	}

	public static PasEventType getPasEventTypeInstance(LookupService lookupService, int id) 
	{
		return (PasEventType)lookupService.getLookupInstance(PasEventType.class, PasEventType.TYPE_ID, id);
	}
	

	public static SourceOfNoteCollection getSourceOfNote(LookupService lookupService) {
		SourceOfNoteCollection collection =
			(SourceOfNoteCollection) lookupService.getLookupCollection(SourceOfNote.TYPE_ID, 
				SourceOfNoteCollection.class, SourceOfNote.class);
		return collection;
	}

	public static SourceOfNote getSourceOfNoteInstance(LookupService lookupService, int id) 
	{
		return (SourceOfNote)lookupService.getLookupInstance(SourceOfNote.class, SourceOfNote.TYPE_ID, id);
	}
	

	public static MedciationCommencedDiscontinuedTypeCollection getMedciationCommencedDiscontinuedType(LookupService lookupService) {
		MedciationCommencedDiscontinuedTypeCollection collection =
			(MedciationCommencedDiscontinuedTypeCollection) lookupService.getLookupCollection(MedciationCommencedDiscontinuedType.TYPE_ID, 
				MedciationCommencedDiscontinuedTypeCollection.class, MedciationCommencedDiscontinuedType.class);
		return collection;
	}

	public static MedciationCommencedDiscontinuedType getMedciationCommencedDiscontinuedTypeInstance(LookupService lookupService, int id) 
	{
		return (MedciationCommencedDiscontinuedType)lookupService.getLookupInstance(MedciationCommencedDiscontinuedType.class, MedciationCommencedDiscontinuedType.TYPE_ID, id);
	}
	

	public static MedOverviewCorrectnessCollection getMedOverviewCorrectness(LookupService lookupService) {
		MedOverviewCorrectnessCollection collection =
			(MedOverviewCorrectnessCollection) lookupService.getLookupCollection(MedOverviewCorrectness.TYPE_ID, 
				MedOverviewCorrectnessCollection.class, MedOverviewCorrectness.class);
		return collection;
	}

	public static MedOverviewCorrectness getMedOverviewCorrectnessInstance(LookupService lookupService, int id) 
	{
		return (MedOverviewCorrectness)lookupService.getLookupInstance(MedOverviewCorrectness.class, MedOverviewCorrectness.TYPE_ID, id);
	}
	

	public static LineTypeStatusCollection getLineTypeStatus(LookupService lookupService) {
		LineTypeStatusCollection collection =
			(LineTypeStatusCollection) lookupService.getLookupCollection(LineTypeStatus.TYPE_ID, 
				LineTypeStatusCollection.class, LineTypeStatus.class);
		return collection;
	}

	public static LineTypeStatus getLineTypeStatusInstance(LookupService lookupService, int id) 
	{
		return (LineTypeStatus)lookupService.getLookupInstance(LineTypeStatus.class, LineTypeStatus.TYPE_ID, id);
	}
	

	public static ClinicalTeamTypeCollection getClinicalTeamType(LookupService lookupService) {
		ClinicalTeamTypeCollection collection =
			(ClinicalTeamTypeCollection) lookupService.getLookupCollection(ClinicalTeamType.TYPE_ID, 
				ClinicalTeamTypeCollection.class, ClinicalTeamType.class);
		return collection;
	}

	public static ClinicalTeamType getClinicalTeamTypeInstance(LookupService lookupService, int id) 
	{
		return (ClinicalTeamType)lookupService.getLookupInstance(ClinicalTeamType.class, ClinicalTeamType.TYPE_ID, id);
	}
	

	public static DailyTimePeriodsCollection getDailyTimePeriods(LookupService lookupService) {
		DailyTimePeriodsCollection collection =
			(DailyTimePeriodsCollection) lookupService.getLookupCollection(DailyTimePeriods.TYPE_ID, 
				DailyTimePeriodsCollection.class, DailyTimePeriods.class);
		return collection;
	}

	public static DailyTimePeriods getDailyTimePeriodsInstance(LookupService lookupService, int id) 
	{
		return (DailyTimePeriods)lookupService.getLookupInstance(DailyTimePeriods.class, DailyTimePeriods.TYPE_ID, id);
	}
	

	public static CBGTypeCollection getCBGType(LookupService lookupService) {
		CBGTypeCollection collection =
			(CBGTypeCollection) lookupService.getLookupCollection(CBGType.TYPE_ID, 
				CBGTypeCollection.class, CBGType.class);
		return collection;
	}

	public static CBGType getCBGTypeInstance(LookupService lookupService, int id) 
	{
		return (CBGType)lookupService.getLookupInstance(CBGType.class, CBGType.TYPE_ID, id);
	}
	

	public static SECSTypesCollection getSECSTypes(LookupService lookupService) {
		SECSTypesCollection collection =
			(SECSTypesCollection) lookupService.getLookupCollection(SECSTypes.TYPE_ID, 
				SECSTypesCollection.class, SECSTypes.class);
		return collection;
	}

	public static SECSTypes getSECSTypesInstance(LookupService lookupService, int id) 
	{
		return (SECSTypes)lookupService.getLookupInstance(SECSTypes.class, SECSTypes.TYPE_ID, id);
	}
	

	public static VitalSignsMonitoringDurationCollection getVitalSignsMonitoringDuration(LookupService lookupService) {
		VitalSignsMonitoringDurationCollection collection =
			(VitalSignsMonitoringDurationCollection) lookupService.getLookupCollection(VitalSignsMonitoringDuration.TYPE_ID, 
				VitalSignsMonitoringDurationCollection.class, VitalSignsMonitoringDuration.class);
		return collection;
	}

	public static VitalSignsMonitoringDuration getVitalSignsMonitoringDurationInstance(LookupService lookupService, int id) 
	{
		return (VitalSignsMonitoringDuration)lookupService.getLookupInstance(VitalSignsMonitoringDuration.class, VitalSignsMonitoringDuration.TYPE_ID, id);
	}
	

	public static VitalSignsMonitoringFrequencyCollection getVitalSignsMonitoringFrequency(LookupService lookupService) {
		VitalSignsMonitoringFrequencyCollection collection =
			(VitalSignsMonitoringFrequencyCollection) lookupService.getLookupCollection(VitalSignsMonitoringFrequency.TYPE_ID, 
				VitalSignsMonitoringFrequencyCollection.class, VitalSignsMonitoringFrequency.class);
		return collection;
	}

	public static VitalSignsMonitoringFrequency getVitalSignsMonitoringFrequencyInstance(LookupService lookupService, int id) 
	{
		return (VitalSignsMonitoringFrequency)lookupService.getLookupInstance(VitalSignsMonitoringFrequency.class, VitalSignsMonitoringFrequency.TYPE_ID, id);
	}
	

	public static LineColourPointIconCollection getLineColourPointIcon(LookupService lookupService) {
		LineColourPointIconCollection collection =
			(LineColourPointIconCollection) lookupService.getLookupCollection(LineColourPointIcon.TYPE_ID, 
				LineColourPointIconCollection.class, LineColourPointIcon.class);
		return collection;
	}

	public static LineColourPointIcon getLineColourPointIconInstance(LookupService lookupService, int id) 
	{
		return (LineColourPointIcon)lookupService.getLookupInstance(LineColourPointIcon.class, LineColourPointIcon.TYPE_ID, id);
	}
	

	public static LineTypeCollection getLineType(LookupService lookupService) {
		LineTypeCollection collection =
			(LineTypeCollection) lookupService.getLookupCollection(LineType.TYPE_ID, 
				LineTypeCollection.class, LineType.class);
		return collection;
	}

	public static LineType getLineTypeInstance(LookupService lookupService, int id) 
	{
		return (LineType)lookupService.getLookupInstance(LineType.class, LineType.TYPE_ID, id);
	}
	

	public static DataSetCategoryCollection getDataSetCategory(LookupService lookupService) {
		DataSetCategoryCollection collection =
			(DataSetCategoryCollection) lookupService.getLookupCollection(DataSetCategory.TYPE_ID, 
				DataSetCategoryCollection.class, DataSetCategory.class);
		return collection;
	}

	public static DataSetCategory getDataSetCategoryInstance(LookupService lookupService, int id) 
	{
		return (DataSetCategory)lookupService.getLookupInstance(DataSetCategory.class, DataSetCategory.TYPE_ID, id);
	}
	

	public static ResuscitationStatusCollection getResuscitationStatus(LookupService lookupService) {
		ResuscitationStatusCollection collection =
			(ResuscitationStatusCollection) lookupService.getLookupCollection(ResuscitationStatus.TYPE_ID, 
				ResuscitationStatusCollection.class, ResuscitationStatus.class);
		return collection;
	}

	public static ResuscitationStatus getResuscitationStatusInstance(LookupService lookupService, int id) 
	{
		return (ResuscitationStatus)lookupService.getLookupInstance(ResuscitationStatus.class, ResuscitationStatus.TYPE_ID, id);
	}
	

	public static DailyPatternTypeCollection getDailyPatternType(LookupService lookupService) {
		DailyPatternTypeCollection collection =
			(DailyPatternTypeCollection) lookupService.getLookupCollection(DailyPatternType.TYPE_ID, 
				DailyPatternTypeCollection.class, DailyPatternType.class);
		return collection;
	}

	public static DailyPatternType getDailyPatternTypeInstance(LookupService lookupService, int id) 
	{
		return (DailyPatternType)lookupService.getLookupInstance(DailyPatternType.class, DailyPatternType.TYPE_ID, id);
	}
	

	public static ClinicalNoteTypeCollection getClinicalNoteType(LookupService lookupService) {
		ClinicalNoteTypeCollection collection =
			(ClinicalNoteTypeCollection) lookupService.getLookupCollection(ClinicalNoteType.TYPE_ID, 
				ClinicalNoteTypeCollection.class, ClinicalNoteType.class);
		return collection;
	}

	public static ClinicalNoteType getClinicalNoteTypeInstance(LookupService lookupService, int id) 
	{
		return (ClinicalNoteType)lookupService.getLookupInstance(ClinicalNoteType.class, ClinicalNoteType.TYPE_ID, id);
	}
	

	public static CareSpellDialogModeCollection getCareSpellDialogMode(LookupService lookupService) {
		CareSpellDialogModeCollection collection =
			(CareSpellDialogModeCollection) lookupService.getLookupCollection(CareSpellDialogMode.TYPE_ID, 
				CareSpellDialogModeCollection.class, CareSpellDialogMode.class);
		return collection;
	}

	public static CareSpellDialogMode getCareSpellDialogModeInstance(LookupService lookupService, int id) 
	{
		return (CareSpellDialogMode)lookupService.getLookupInstance(CareSpellDialogMode.class, CareSpellDialogMode.TYPE_ID, id);
	}
	

	public static ContextTypeCollection getContextType(LookupService lookupService) {
		ContextTypeCollection collection =
			(ContextTypeCollection) lookupService.getLookupCollection(ContextType.TYPE_ID, 
				ContextTypeCollection.class, ContextType.class);
		return collection;
	}

	public static ContextType getContextTypeInstance(LookupService lookupService, int id) 
	{
		return (ContextType)lookupService.getLookupInstance(ContextType.class, ContextType.TYPE_ID, id);
	}
	

	public static NotingMethodCollection getNotingMethod(LookupService lookupService) {
		NotingMethodCollection collection =
			(NotingMethodCollection) lookupService.getLookupCollection(NotingMethod.TYPE_ID, 
				NotingMethodCollection.class, NotingMethod.class);
		return collection;
	}

	public static NotingMethod getNotingMethodInstance(LookupService lookupService, int id) 
	{
		return (NotingMethod)lookupService.getLookupInstance(NotingMethod.class, NotingMethod.TYPE_ID, id);
	}
	

	public static CareSpelltoEpisodeRelationshipCollection getCareSpelltoEpisodeRelationship(LookupService lookupService) {
		CareSpelltoEpisodeRelationshipCollection collection =
			(CareSpelltoEpisodeRelationshipCollection) lookupService.getLookupCollection(CareSpelltoEpisodeRelationship.TYPE_ID, 
				CareSpelltoEpisodeRelationshipCollection.class, CareSpelltoEpisodeRelationship.class);
		return collection;
	}

	public static CareSpelltoEpisodeRelationship getCareSpelltoEpisodeRelationshipInstance(LookupService lookupService, int id) 
	{
		return (CareSpelltoEpisodeRelationship)lookupService.getLookupInstance(CareSpelltoEpisodeRelationship.class, CareSpelltoEpisodeRelationship.TYPE_ID, id);
	}
	

	public static PatientAssessmentStatusReasonCollection getPatientAssessmentStatusReason(LookupService lookupService) {
		PatientAssessmentStatusReasonCollection collection =
			(PatientAssessmentStatusReasonCollection) lookupService.getLookupCollection(PatientAssessmentStatusReason.TYPE_ID, 
				PatientAssessmentStatusReasonCollection.class, PatientAssessmentStatusReason.class);
		return collection;
	}

	public static PatientAssessmentStatusReason getPatientAssessmentStatusReasonInstance(LookupService lookupService, int id) 
	{
		return (PatientAssessmentStatusReason)lookupService.getLookupInstance(PatientAssessmentStatusReason.class, PatientAssessmentStatusReason.TYPE_ID, id);
	}
	

	public static PatientProcedureStatusCollection getPatientProcedureStatus(LookupService lookupService) {
		PatientProcedureStatusCollection collection =
			(PatientProcedureStatusCollection) lookupService.getLookupCollection(PatientProcedureStatus.TYPE_ID, 
				PatientProcedureStatusCollection.class, PatientProcedureStatus.class);
		return collection;
	}

	public static PatientProcedureStatus getPatientProcedureStatusInstance(LookupService lookupService, int id) 
	{
		return (PatientProcedureStatus)lookupService.getLookupInstance(PatientProcedureStatus.class, PatientProcedureStatus.TYPE_ID, id);
	}
	

	public static ProcedureUrgencyCollection getProcedureUrgency(LookupService lookupService) {
		ProcedureUrgencyCollection collection =
			(ProcedureUrgencyCollection) lookupService.getLookupCollection(ProcedureUrgency.TYPE_ID, 
				ProcedureUrgencyCollection.class, ProcedureUrgency.class);
		return collection;
	}

	public static ProcedureUrgency getProcedureUrgencyInstance(LookupService lookupService, int id) 
	{
		return (ProcedureUrgency)lookupService.getLookupInstance(ProcedureUrgency.class, ProcedureUrgency.TYPE_ID, id);
	}
	

	public static PatientProblemStatusCollection getPatientProblemStatus(LookupService lookupService) {
		PatientProblemStatusCollection collection =
			(PatientProblemStatusCollection) lookupService.getLookupCollection(PatientProblemStatus.TYPE_ID, 
				PatientProblemStatusCollection.class, PatientProblemStatus.class);
		return collection;
	}

	public static PatientProblemStatus getPatientProblemStatusInstance(LookupService lookupService, int id) 
	{
		return (PatientProblemStatus)lookupService.getLookupInstance(PatientProblemStatus.class, PatientProblemStatus.TYPE_ID, id);
	}
	

	public static DiagnosisStatusCollection getDiagnosisStatus(LookupService lookupService) {
		DiagnosisStatusCollection collection =
			(DiagnosisStatusCollection) lookupService.getLookupCollection(DiagnosisStatus.TYPE_ID, 
				DiagnosisStatusCollection.class, DiagnosisStatus.class);
		return collection;
	}

	public static DiagnosisStatus getDiagnosisStatusInstance(LookupService lookupService, int id) 
	{
		return (DiagnosisStatus)lookupService.getLookupInstance(DiagnosisStatus.class, DiagnosisStatus.TYPE_ID, id);
	}
	

	public static SocialHistoryDietCollection getSocialHistoryDiet(LookupService lookupService) {
		SocialHistoryDietCollection collection =
			(SocialHistoryDietCollection) lookupService.getLookupCollection(SocialHistoryDiet.TYPE_ID, 
				SocialHistoryDietCollection.class, SocialHistoryDiet.class);
		return collection;
	}

	public static SocialHistoryDiet getSocialHistoryDietInstance(LookupService lookupService, int id) 
	{
		return (SocialHistoryDiet)lookupService.getLookupInstance(SocialHistoryDiet.class, SocialHistoryDiet.TYPE_ID, id);
	}
	

	public static OccupationStatusCollection getOccupationStatus(LookupService lookupService) {
		OccupationStatusCollection collection =
			(OccupationStatusCollection) lookupService.getLookupCollection(OccupationStatus.TYPE_ID, 
				OccupationStatusCollection.class, OccupationStatus.class);
		return collection;
	}

	public static OccupationStatus getOccupationStatusInstance(LookupService lookupService, int id) 
	{
		return (OccupationStatus)lookupService.getLookupInstance(OccupationStatus.class, OccupationStatus.TYPE_ID, id);
	}
	

	public static CBGMTimePeriodCollection getCBGMTimePeriod(LookupService lookupService) {
		CBGMTimePeriodCollection collection =
			(CBGMTimePeriodCollection) lookupService.getLookupCollection(CBGMTimePeriod.TYPE_ID, 
				CBGMTimePeriodCollection.class, CBGMTimePeriod.class);
		return collection;
	}

	public static CBGMTimePeriod getCBGMTimePeriodInstance(LookupService lookupService, int id) 
	{
		return (CBGMTimePeriod)lookupService.getLookupInstance(CBGMTimePeriod.class, CBGMTimePeriod.TYPE_ID, id);
	}
	

	public static DeathCauseCancerCollection getDeathCauseCancer(LookupService lookupService) {
		DeathCauseCancerCollection collection =
			(DeathCauseCancerCollection) lookupService.getLookupCollection(DeathCauseCancer.TYPE_ID, 
				DeathCauseCancerCollection.class, DeathCauseCancer.class);
		return collection;
	}

	public static DeathCauseCancer getDeathCauseCancerInstance(LookupService lookupService, int id) 
	{
		return (DeathCauseCancer)lookupService.getLookupInstance(DeathCauseCancer.class, DeathCauseCancer.TYPE_ID, id);
	}
	

	public static DeathCauseEstablishedCollection getDeathCauseEstablished(LookupService lookupService) {
		DeathCauseEstablishedCollection collection =
			(DeathCauseEstablishedCollection) lookupService.getLookupCollection(DeathCauseEstablished.TYPE_ID, 
				DeathCauseEstablishedCollection.class, DeathCauseEstablished.class);
		return collection;
	}

	public static DeathCauseEstablished getDeathCauseEstablishedInstance(LookupService lookupService, int id) 
	{
		return (DeathCauseEstablished)lookupService.getLookupInstance(DeathCauseEstablished.class, DeathCauseEstablished.TYPE_ID, id);
	}
	

	public static PlaceofDeathCollection getPlaceofDeath(LookupService lookupService) {
		PlaceofDeathCollection collection =
			(PlaceofDeathCollection) lookupService.getLookupCollection(PlaceofDeath.TYPE_ID, 
				PlaceofDeathCollection.class, PlaceofDeath.class);
		return collection;
	}

	public static PlaceofDeath getPlaceofDeathInstance(LookupService lookupService, int id) 
	{
		return (PlaceofDeath)lookupService.getLookupInstance(PlaceofDeath.class, PlaceofDeath.TYPE_ID, id);
	}
	

	public static UserDefinedObjectTypeCollection getUserDefinedObjectType(LookupService lookupService) {
		UserDefinedObjectTypeCollection collection =
			(UserDefinedObjectTypeCollection) lookupService.getLookupCollection(UserDefinedObjectType.TYPE_ID, 
				UserDefinedObjectTypeCollection.class, UserDefinedObjectType.class);
		return collection;
	}

	public static UserDefinedObjectType getUserDefinedObjectTypeInstance(LookupService lookupService, int id) 
	{
		return (UserDefinedObjectType)lookupService.getLookupInstance(UserDefinedObjectType.class, UserDefinedObjectType.TYPE_ID, id);
	}
	

	public static QuestionTypeCollection getQuestionType(LookupService lookupService) {
		QuestionTypeCollection collection =
			(QuestionTypeCollection) lookupService.getLookupCollection(QuestionType.TYPE_ID, 
				QuestionTypeCollection.class, QuestionType.class);
		return collection;
	}

	public static QuestionType getQuestionTypeInstance(LookupService lookupService, int id) 
	{
		return (QuestionType)lookupService.getLookupInstance(QuestionType.class, QuestionType.TYPE_ID, id);
	}
	

	public static ChannelTypeCollection getChannelType(LookupService lookupService) {
		ChannelTypeCollection collection =
			(ChannelTypeCollection) lookupService.getLookupCollection(ChannelType.TYPE_ID, 
				ChannelTypeCollection.class, ChannelType.class);
		return collection;
	}

	public static ChannelType getChannelTypeInstance(LookupService lookupService, int id) 
	{
		return (ChannelType)lookupService.getLookupInstance(ChannelType.class, ChannelType.TYPE_ID, id);
	}
	

	public static CoreReferralStatusCollection getCoreReferralStatus(LookupService lookupService) {
		CoreReferralStatusCollection collection =
			(CoreReferralStatusCollection) lookupService.getLookupCollection(CoreReferralStatus.TYPE_ID, 
				CoreReferralStatusCollection.class, CoreReferralStatus.class);
		return collection;
	}

	public static CoreReferralStatus getCoreReferralStatusInstance(LookupService lookupService, int id) 
	{
		return (CoreReferralStatus)lookupService.getLookupInstance(CoreReferralStatus.class, CoreReferralStatus.TYPE_ID, id);
	}
	

	public static PulseOximetryValuesCollection getPulseOximetryValues(LookupService lookupService) {
		PulseOximetryValuesCollection collection =
			(PulseOximetryValuesCollection) lookupService.getLookupCollection(PulseOximetryValues.TYPE_ID, 
				PulseOximetryValuesCollection.class, PulseOximetryValues.class);
		return collection;
	}

	public static PulseOximetryValues getPulseOximetryValuesInstance(LookupService lookupService, int id) 
	{
		return (PulseOximetryValues)lookupService.getLookupInstance(PulseOximetryValues.class, PulseOximetryValues.TYPE_ID, id);
	}
	

	public static YesNoCollection getYesNo(LookupService lookupService) {
		YesNoCollection collection =
			(YesNoCollection) lookupService.getLookupCollection(YesNo.TYPE_ID, 
				YesNoCollection.class, YesNo.class);
		return collection;
	}

	public static YesNo getYesNoInstance(LookupService lookupService, int id) 
	{
		return (YesNo)lookupService.getLookupInstance(YesNo.class, YesNo.TYPE_ID, id);
	}
	

	public static TimeWeeksMonthsYearsCollection getTimeWeeksMonthsYears(LookupService lookupService) {
		TimeWeeksMonthsYearsCollection collection =
			(TimeWeeksMonthsYearsCollection) lookupService.getLookupCollection(TimeWeeksMonthsYears.TYPE_ID, 
				TimeWeeksMonthsYearsCollection.class, TimeWeeksMonthsYears.class);
		return collection;
	}

	public static TimeWeeksMonthsYears getTimeWeeksMonthsYearsInstance(LookupService lookupService, int id) 
	{
		return (TimeWeeksMonthsYears)lookupService.getLookupInstance(TimeWeeksMonthsYears.class, TimeWeeksMonthsYears.TYPE_ID, id);
	}
	

	public static UserDefinedAssessmentTypeCollection getUserDefinedAssessmentType(LookupService lookupService) {
		UserDefinedAssessmentTypeCollection collection =
			(UserDefinedAssessmentTypeCollection) lookupService.getLookupCollection(UserDefinedAssessmentType.TYPE_ID, 
				UserDefinedAssessmentTypeCollection.class, UserDefinedAssessmentType.class);
		return collection;
	}

	public static UserDefinedAssessmentType getUserDefinedAssessmentTypeInstance(LookupService lookupService, int id) 
	{
		return (UserDefinedAssessmentType)lookupService.getLookupInstance(UserDefinedAssessmentType.class, UserDefinedAssessmentType.TYPE_ID, id);
	}
	

	public static UserAssessmentScoringMethodCollection getUserAssessmentScoringMethod(LookupService lookupService) {
		UserAssessmentScoringMethodCollection collection =
			(UserAssessmentScoringMethodCollection) lookupService.getLookupCollection(UserAssessmentScoringMethod.TYPE_ID, 
				UserAssessmentScoringMethodCollection.class, UserAssessmentScoringMethod.class);
		return collection;
	}

	public static UserAssessmentScoringMethod getUserAssessmentScoringMethodInstance(LookupService lookupService, int id) 
	{
		return (UserAssessmentScoringMethod)lookupService.getLookupInstance(UserAssessmentScoringMethod.class, UserAssessmentScoringMethod.TYPE_ID, id);
	}
	

	public static UserAssessmentTypeCollection getUserAssessmentType(LookupService lookupService) {
		UserAssessmentTypeCollection collection =
			(UserAssessmentTypeCollection) lookupService.getLookupCollection(UserAssessmentType.TYPE_ID, 
				UserAssessmentTypeCollection.class, UserAssessmentType.class);
		return collection;
	}

	public static UserAssessmentType getUserAssessmentTypeInstance(LookupService lookupService, int id) 
	{
		return (UserAssessmentType)lookupService.getLookupInstance(UserAssessmentType.class, UserAssessmentType.TYPE_ID, id);
	}
	

	public static TimeDaystoYearsCollection getTimeDaystoYears(LookupService lookupService) {
		TimeDaystoYearsCollection collection =
			(TimeDaystoYearsCollection) lookupService.getLookupCollection(TimeDaystoYears.TYPE_ID, 
				TimeDaystoYearsCollection.class, TimeDaystoYears.class);
		return collection;
	}

	public static TimeDaystoYears getTimeDaystoYearsInstance(LookupService lookupService, int id) 
	{
		return (TimeDaystoYears)lookupService.getLookupInstance(TimeDaystoYears.class, TimeDaystoYears.TYPE_ID, id);
	}
	

	public static InpatientListTypeCollection getInpatientListType(LookupService lookupService) {
		InpatientListTypeCollection collection =
			(InpatientListTypeCollection) lookupService.getLookupCollection(InpatientListType.TYPE_ID, 
				InpatientListTypeCollection.class, InpatientListType.class);
		return collection;
	}

	public static InpatientListType getInpatientListTypeInstance(LookupService lookupService, int id) 
	{
		return (InpatientListType)lookupService.getLookupInstance(InpatientListType.class, InpatientListType.TYPE_ID, id);
	}
	

	public static QuestionCategoryCollection getQuestionCategory(LookupService lookupService) {
		QuestionCategoryCollection collection =
			(QuestionCategoryCollection) lookupService.getLookupCollection(QuestionCategory.TYPE_ID, 
				QuestionCategoryCollection.class, QuestionCategory.class);
		return collection;
	}

	public static QuestionCategory getQuestionCategoryInstance(LookupService lookupService, int id) 
	{
		return (QuestionCategory)lookupService.getLookupInstance(QuestionCategory.class, QuestionCategory.TYPE_ID, id);
	}
	

	public static ConfigurationStatusCollection getConfigurationStatus(LookupService lookupService) {
		ConfigurationStatusCollection collection =
			(ConfigurationStatusCollection) lookupService.getLookupCollection(ConfigurationStatus.TYPE_ID, 
				ConfigurationStatusCollection.class, ConfigurationStatus.class);
		return collection;
	}

	public static ConfigurationStatus getConfigurationStatusInstance(LookupService lookupService, int id) 
	{
		return (ConfigurationStatus)lookupService.getLookupInstance(ConfigurationStatus.class, ConfigurationStatus.TYPE_ID, id);
	}
	

	public static ActivityReasonCollection getActivityReason(LookupService lookupService) {
		ActivityReasonCollection collection =
			(ActivityReasonCollection) lookupService.getLookupCollection(ActivityReason.TYPE_ID, 
				ActivityReasonCollection.class, ActivityReason.class);
		return collection;
	}

	public static ActivityReason getActivityReasonInstance(LookupService lookupService, int id) 
	{
		return (ActivityReason)lookupService.getLookupInstance(ActivityReason.class, ActivityReason.TYPE_ID, id);
	}
	

	public static CurrencyCollection getCurrency(LookupService lookupService) {
		CurrencyCollection collection =
			(CurrencyCollection) lookupService.getLookupCollection(Currency.TYPE_ID, 
				CurrencyCollection.class, Currency.class);
		return collection;
	}

	public static Currency getCurrencyInstance(LookupService lookupService, int id) 
	{
		return (Currency)lookupService.getLookupInstance(Currency.class, Currency.TYPE_ID, id);
	}
	

	public static ServiceFunctionCollection getServiceFunction(LookupService lookupService) {
		ServiceFunctionCollection collection =
			(ServiceFunctionCollection) lookupService.getLookupCollection(ServiceFunction.TYPE_ID, 
				ServiceFunctionCollection.class, ServiceFunction.class);
		return collection;
	}

	public static ServiceFunction getServiceFunctionInstance(LookupService lookupService, int id) 
	{
		return (ServiceFunction)lookupService.getLookupInstance(ServiceFunction.class, ServiceFunction.TYPE_ID, id);
	}
	

	public static AlcoholStatusCollection getAlcoholStatus(LookupService lookupService) {
		AlcoholStatusCollection collection =
			(AlcoholStatusCollection) lookupService.getLookupCollection(AlcoholStatus.TYPE_ID, 
				AlcoholStatusCollection.class, AlcoholStatus.class);
		return collection;
	}

	public static AlcoholStatus getAlcoholStatusInstance(LookupService lookupService, int id) 
	{
		return (AlcoholStatus)lookupService.getLookupInstance(AlcoholStatus.class, AlcoholStatus.TYPE_ID, id);
	}
	

	public static ContactLocationCollection getContactLocation(LookupService lookupService) {
		ContactLocationCollection collection =
			(ContactLocationCollection) lookupService.getLookupCollection(ContactLocation.TYPE_ID, 
				ContactLocationCollection.class, ContactLocation.class);
		return collection;
	}

	public static ContactLocation getContactLocationInstance(LookupService lookupService, int id) 
	{
		return (ContactLocation)lookupService.getLookupInstance(ContactLocation.class, ContactLocation.TYPE_ID, id);
	}
	

	public static ContactTypeCollection getContactType(LookupService lookupService) {
		ContactTypeCollection collection =
			(ContactTypeCollection) lookupService.getLookupCollection(ContactType.TYPE_ID, 
				ContactTypeCollection.class, ContactType.class);
		return collection;
	}

	public static ContactType getContactTypeInstance(LookupService lookupService, int id) 
	{
		return (ContactType)lookupService.getLookupInstance(ContactType.class, ContactType.TYPE_ID, id);
	}
	

	public static CuffStatusCollection getCuffStatus(LookupService lookupService) {
		CuffStatusCollection collection =
			(CuffStatusCollection) lookupService.getLookupCollection(CuffStatus.TYPE_ID, 
				CuffStatusCollection.class, CuffStatus.class);
		return collection;
	}

	public static CuffStatus getCuffStatusInstance(LookupService lookupService, int id) 
	{
		return (CuffStatus)lookupService.getLookupInstance(CuffStatus.class, CuffStatus.TYPE_ID, id);
	}
	

	public static UrinalysisPHCollection getUrinalysisPH(LookupService lookupService) {
		UrinalysisPHCollection collection =
			(UrinalysisPHCollection) lookupService.getLookupCollection(UrinalysisPH.TYPE_ID, 
				UrinalysisPHCollection.class, UrinalysisPH.class);
		return collection;
	}

	public static UrinalysisPH getUrinalysisPHInstance(LookupService lookupService, int id) 
	{
		return (UrinalysisPH)lookupService.getLookupInstance(UrinalysisPH.class, UrinalysisPH.TYPE_ID, id);
	}
	

	public static VSTempSiteCollection getVSTempSite(LookupService lookupService) {
		VSTempSiteCollection collection =
			(VSTempSiteCollection) lookupService.getLookupCollection(VSTempSite.TYPE_ID, 
				VSTempSiteCollection.class, VSTempSite.class);
		return collection;
	}

	public static VSTempSite getVSTempSiteInstance(LookupService lookupService, int id) 
	{
		return (VSTempSite)lookupService.getLookupInstance(VSTempSite.class, VSTempSite.TYPE_ID, id);
	}
	

	public static SourceOfReferralCollection getSourceOfReferral(LookupService lookupService) {
		SourceOfReferralCollection collection =
			(SourceOfReferralCollection) lookupService.getLookupCollection(SourceOfReferral.TYPE_ID, 
				SourceOfReferralCollection.class, SourceOfReferral.class);
		return collection;
	}

	public static SourceOfReferral getSourceOfReferralInstance(LookupService lookupService, int id) 
	{
		return (SourceOfReferral)lookupService.getLookupInstance(SourceOfReferral.class, SourceOfReferral.TYPE_ID, id);
	}
	

	public static ServiceCategoryCollection getServiceCategory(LookupService lookupService) {
		ServiceCategoryCollection collection =
			(ServiceCategoryCollection) lookupService.getLookupCollection(ServiceCategory.TYPE_ID, 
				ServiceCategoryCollection.class, ServiceCategory.class);
		return collection;
	}

	public static ServiceCategory getServiceCategoryInstance(LookupService lookupService, int id) 
	{
		return (ServiceCategory)lookupService.getLookupInstance(ServiceCategory.class, ServiceCategory.TYPE_ID, id);
	}
	

	public static AllergiesSeverityCollection getAllergiesSeverity(LookupService lookupService) {
		AllergiesSeverityCollection collection =
			(AllergiesSeverityCollection) lookupService.getLookupCollection(AllergiesSeverity.TYPE_ID, 
				AllergiesSeverityCollection.class, AllergiesSeverity.class);
		return collection;
	}

	public static AllergiesSeverity getAllergiesSeverityInstance(LookupService lookupService, int id) 
	{
		return (AllergiesSeverity)lookupService.getLookupInstance(AllergiesSeverity.class, AllergiesSeverity.TYPE_ID, id);
	}
	

	public static SupportNetworkProfessionCollection getSupportNetworkProfession(LookupService lookupService) {
		SupportNetworkProfessionCollection collection =
			(SupportNetworkProfessionCollection) lookupService.getLookupCollection(SupportNetworkProfession.TYPE_ID, 
				SupportNetworkProfessionCollection.class, SupportNetworkProfession.class);
		return collection;
	}

	public static SupportNetworkProfession getSupportNetworkProfessionInstance(LookupService lookupService, int id) 
	{
		return (SupportNetworkProfession)lookupService.getLookupInstance(SupportNetworkProfession.class, SupportNetworkProfession.TYPE_ID, id);
	}
	

	public static SupportNetworkEmergencyContactCollection getSupportNetworkEmergencyContact(LookupService lookupService) {
		SupportNetworkEmergencyContactCollection collection =
			(SupportNetworkEmergencyContactCollection) lookupService.getLookupCollection(SupportNetworkEmergencyContact.TYPE_ID, 
				SupportNetworkEmergencyContactCollection.class, SupportNetworkEmergencyContact.class);
		return collection;
	}

	public static SupportNetworkEmergencyContact getSupportNetworkEmergencyContactInstance(LookupService lookupService, int id) 
	{
		return (SupportNetworkEmergencyContact)lookupService.getLookupInstance(SupportNetworkEmergencyContact.class, SupportNetworkEmergencyContact.TYPE_ID, id);
	}
	

	public static SupportNetworkRelationshipCollection getSupportNetworkRelationship(LookupService lookupService) {
		SupportNetworkRelationshipCollection collection =
			(SupportNetworkRelationshipCollection) lookupService.getLookupCollection(SupportNetworkRelationship.TYPE_ID, 
				SupportNetworkRelationshipCollection.class, SupportNetworkRelationship.class);
		return collection;
	}

	public static SupportNetworkRelationship getSupportNetworkRelationshipInstance(LookupService lookupService, int id) 
	{
		return (SupportNetworkRelationship)lookupService.getLookupInstance(SupportNetworkRelationship.class, SupportNetworkRelationship.TYPE_ID, id);
	}
	

	public static SmokingCurrentHistoricCollection getSmokingCurrentHistoric(LookupService lookupService) {
		SmokingCurrentHistoricCollection collection =
			(SmokingCurrentHistoricCollection) lookupService.getLookupCollection(SmokingCurrentHistoric.TYPE_ID, 
				SmokingCurrentHistoricCollection.class, SmokingCurrentHistoric.class);
		return collection;
	}

	public static SmokingCurrentHistoric getSmokingCurrentHistoricInstance(LookupService lookupService, int id) 
	{
		return (SmokingCurrentHistoric)lookupService.getLookupInstance(SmokingCurrentHistoric.class, SmokingCurrentHistoric.TYPE_ID, id);
	}
	

	public static MedicationDoseUnitCollection getMedicationDoseUnit(LookupService lookupService) {
		MedicationDoseUnitCollection collection =
			(MedicationDoseUnitCollection) lookupService.getLookupCollection(MedicationDoseUnit.TYPE_ID, 
				MedicationDoseUnitCollection.class, MedicationDoseUnit.class);
		return collection;
	}

	public static MedicationDoseUnit getMedicationDoseUnitInstance(LookupService lookupService, int id) 
	{
		return (MedicationDoseUnit)lookupService.getLookupInstance(MedicationDoseUnit.class, MedicationDoseUnit.TYPE_ID, id);
	}
	

	public static YesNoUnknownCollection getYesNoUnknown(LookupService lookupService) {
		YesNoUnknownCollection collection =
			(YesNoUnknownCollection) lookupService.getLookupCollection(YesNoUnknown.TYPE_ID, 
				YesNoUnknownCollection.class, YesNoUnknown.class);
		return collection;
	}

	public static YesNoUnknown getYesNoUnknownInstance(LookupService lookupService, int id) 
	{
		return (YesNoUnknown)lookupService.getLookupInstance(YesNoUnknown.class, YesNoUnknown.TYPE_ID, id);
	}
	

	public static LanguageCollection getLanguage(LookupService lookupService) {
		LanguageCollection collection =
			(LanguageCollection) lookupService.getLookupCollection(Language.TYPE_ID, 
				LanguageCollection.class, Language.class);
		return collection;
	}

	public static Language getLanguageInstance(LookupService lookupService, int id) 
	{
		return (Language)lookupService.getLookupInstance(Language.class, Language.TYPE_ID, id);
	}
	

	public static OccupationCollection getOccupation(LookupService lookupService) {
		OccupationCollection collection =
			(OccupationCollection) lookupService.getLookupCollection(Occupation.TYPE_ID, 
				OccupationCollection.class, Occupation.class);
		return collection;
	}

	public static Occupation getOccupationInstance(LookupService lookupService, int id) 
	{
		return (Occupation)lookupService.getLookupInstance(Occupation.class, Occupation.TYPE_ID, id);
	}
	

	public static MaritalStatusCollection getMaritalStatus(LookupService lookupService) {
		MaritalStatusCollection collection =
			(MaritalStatusCollection) lookupService.getLookupCollection(MaritalStatus.TYPE_ID, 
				MaritalStatusCollection.class, MaritalStatus.class);
		return collection;
	}

	public static MaritalStatus getMaritalStatusInstance(LookupService lookupService, int id) 
	{
		return (MaritalStatus)lookupService.getLookupInstance(MaritalStatus.class, MaritalStatus.TYPE_ID, id);
	}
	

	public static EthnicOriginCollection getEthnicOrigin(LookupService lookupService) {
		EthnicOriginCollection collection =
			(EthnicOriginCollection) lookupService.getLookupCollection(EthnicOrigin.TYPE_ID, 
				EthnicOriginCollection.class, EthnicOrigin.class);
		return collection;
	}

	public static EthnicOrigin getEthnicOriginInstance(LookupService lookupService, int id) 
	{
		return (EthnicOrigin)lookupService.getLookupInstance(EthnicOrigin.class, EthnicOrigin.TYPE_ID, id);
	}
	

	public static SmokingWhatCollection getSmokingWhat(LookupService lookupService) {
		SmokingWhatCollection collection =
			(SmokingWhatCollection) lookupService.getLookupCollection(SmokingWhat.TYPE_ID, 
				SmokingWhatCollection.class, SmokingWhat.class);
		return collection;
	}

	public static SmokingWhat getSmokingWhatInstance(LookupService lookupService, int id) 
	{
		return (SmokingWhat)lookupService.getLookupInstance(SmokingWhat.class, SmokingWhat.TYPE_ID, id);
	}
	

	public static SmokingStatusCollection getSmokingStatus(LookupService lookupService) {
		SmokingStatusCollection collection =
			(SmokingStatusCollection) lookupService.getLookupCollection(SmokingStatus.TYPE_ID, 
				SmokingStatusCollection.class, SmokingStatus.class);
		return collection;
	}

	public static SmokingStatus getSmokingStatusInstance(LookupService lookupService, int id) 
	{
		return (SmokingStatus)lookupService.getLookupInstance(SmokingStatus.class, SmokingStatus.TYPE_ID, id);
	}
	

	public static AdviceLeafletsCollection getAdviceLeaflets(LookupService lookupService) {
		AdviceLeafletsCollection collection =
			(AdviceLeafletsCollection) lookupService.getLookupCollection(AdviceLeaflets.TYPE_ID, 
				AdviceLeafletsCollection.class, AdviceLeaflets.class);
		return collection;
	}

	public static AdviceLeaflets getAdviceLeafletsInstance(LookupService lookupService, int id) 
	{
		return (AdviceLeaflets)lookupService.getLookupInstance(AdviceLeaflets.class, AdviceLeaflets.TYPE_ID, id);
	}
	

	public static SpecialtyCollection getSpecialty(LookupService lookupService) {
		SpecialtyCollection collection =
			(SpecialtyCollection) lookupService.getLookupCollection(Specialty.TYPE_ID, 
				SpecialtyCollection.class, Specialty.class);
		return collection;
	}

	public static Specialty getSpecialtyInstance(LookupService lookupService, int id) 
	{
		return (Specialty)lookupService.getLookupInstance(Specialty.class, Specialty.TYPE_ID, id);
	}
	

	public static EpisodeTypeCollection getEpisodeType(LookupService lookupService) {
		EpisodeTypeCollection collection =
			(EpisodeTypeCollection) lookupService.getLookupCollection(EpisodeType.TYPE_ID, 
				EpisodeTypeCollection.class, EpisodeType.class);
		return collection;
	}

	public static EpisodeType getEpisodeTypeInstance(LookupService lookupService, int id) 
	{
		return (EpisodeType)lookupService.getLookupInstance(EpisodeType.class, EpisodeType.TYPE_ID, id);
	}
	

	public static PersonRelationshipCollection getPersonRelationship(LookupService lookupService) {
		PersonRelationshipCollection collection =
			(PersonRelationshipCollection) lookupService.getLookupCollection(PersonRelationship.TYPE_ID, 
				PersonRelationshipCollection.class, PersonRelationship.class);
		return collection;
	}

	public static PersonRelationship getPersonRelationshipInstance(LookupService lookupService, int id) 
	{
		return (PersonRelationship)lookupService.getLookupInstance(PersonRelationship.class, PersonRelationship.TYPE_ID, id);
	}
	

	public static PersonTitleCollection getPersonTitle(LookupService lookupService) {
		PersonTitleCollection collection =
			(PersonTitleCollection) lookupService.getLookupCollection(PersonTitle.TYPE_ID, 
				PersonTitleCollection.class, PersonTitle.class);
		return collection;
	}

	public static PersonTitle getPersonTitleInstance(LookupService lookupService, int id) 
	{
		return (PersonTitle)lookupService.getLookupInstance(PersonTitle.class, PersonTitle.TYPE_ID, id);
	}
	

	public static PatIdTypeCollection getPatIdType(LookupService lookupService) {
		PatIdTypeCollection collection =
			(PatIdTypeCollection) lookupService.getLookupCollection(PatIdType.TYPE_ID, 
				PatIdTypeCollection.class, PatIdType.class);
		return collection;
	}

	public static PatIdType getPatIdTypeInstance(LookupService lookupService, int id) 
	{
		return (PatIdType)lookupService.getLookupInstance(PatIdType.class, PatIdType.TYPE_ID, id);
	}
	

	public static SexCollection getSex(LookupService lookupService) {
		SexCollection collection =
			(SexCollection) lookupService.getLookupCollection(Sex.TYPE_ID, 
				SexCollection.class, Sex.class);
		return collection;
	}

	public static Sex getSexInstance(LookupService lookupService, int id) 
	{
		return (Sex)lookupService.getLookupInstance(Sex.class, Sex.TYPE_ID, id);
	}
	

	public static KeyDateTypeCollection getKeyDateType(LookupService lookupService) {
		KeyDateTypeCollection collection =
			(KeyDateTypeCollection) lookupService.getLookupCollection(KeyDateType.TYPE_ID, 
				KeyDateTypeCollection.class, KeyDateType.class);
		return collection;
	}

	public static KeyDateType getKeyDateTypeInstance(LookupService lookupService, int id) 
	{
		return (KeyDateType)lookupService.getLookupInstance(KeyDateType.class, KeyDateType.TYPE_ID, id);
	}
	

	public static CareContextStatusCollection getCareContextStatus(LookupService lookupService) {
		CareContextStatusCollection collection =
			(CareContextStatusCollection) lookupService.getLookupCollection(CareContextStatus.TYPE_ID, 
				CareContextStatusCollection.class, CareContextStatus.class);
		return collection;
	}

	public static CareContextStatus getCareContextStatusInstance(LookupService lookupService, int id) 
	{
		return (CareContextStatus)lookupService.getLookupInstance(CareContextStatus.class, CareContextStatus.TYPE_ID, id);
	}
	

	public static ClinicalNotesStatusCollection getClinicalNotesStatus(LookupService lookupService) {
		ClinicalNotesStatusCollection collection =
			(ClinicalNotesStatusCollection) lookupService.getLookupCollection(ClinicalNotesStatus.TYPE_ID, 
				ClinicalNotesStatusCollection.class, ClinicalNotesStatus.class);
		return collection;
	}

	public static ClinicalNotesStatus getClinicalNotesStatusInstance(LookupService lookupService, int id) 
	{
		return (ClinicalNotesStatus)lookupService.getLookupInstance(ClinicalNotesStatus.class, ClinicalNotesStatus.TYPE_ID, id);
	}
	

	public static ReadmissionTypeCollection getReadmissionType(LookupService lookupService) {
		ReadmissionTypeCollection collection =
			(ReadmissionTypeCollection) lookupService.getLookupCollection(ReadmissionType.TYPE_ID, 
				ReadmissionTypeCollection.class, ReadmissionType.class);
		return collection;
	}

	public static ReadmissionType getReadmissionTypeInstance(LookupService lookupService, int id) 
	{
		return (ReadmissionType)lookupService.getLookupInstance(ReadmissionType.class, ReadmissionType.TYPE_ID, id);
	}
	

	public static ManagementIntentionCollection getManagementIntention(LookupService lookupService) {
		ManagementIntentionCollection collection =
			(ManagementIntentionCollection) lookupService.getLookupCollection(ManagementIntention.TYPE_ID, 
				ManagementIntentionCollection.class, ManagementIntention.class);
		return collection;
	}

	public static ManagementIntention getManagementIntentionInstance(LookupService lookupService, int id) 
	{
		return (ManagementIntention)lookupService.getLookupInstance(ManagementIntention.class, ManagementIntention.TYPE_ID, id);
	}
	

	public static OverallImpressionCollection getOverallImpression(LookupService lookupService) {
		OverallImpressionCollection collection =
			(OverallImpressionCollection) lookupService.getLookupCollection(OverallImpression.TYPE_ID, 
				OverallImpressionCollection.class, OverallImpression.class);
		return collection;
	}

	public static OverallImpression getOverallImpressionInstance(LookupService lookupService, int id) 
	{
		return (OverallImpression)lookupService.getLookupInstance(OverallImpression.class, OverallImpression.TYPE_ID, id);
	}
	

	public static PatientSupportNetworkStatusCollection getPatientSupportNetworkStatus(LookupService lookupService) {
		PatientSupportNetworkStatusCollection collection =
			(PatientSupportNetworkStatusCollection) lookupService.getLookupCollection(PatientSupportNetworkStatus.TYPE_ID, 
				PatientSupportNetworkStatusCollection.class, PatientSupportNetworkStatus.class);
		return collection;
	}

	public static PatientSupportNetworkStatus getPatientSupportNetworkStatusInstance(LookupService lookupService, int id) 
	{
		return (PatientSupportNetworkStatus)lookupService.getLookupInstance(PatientSupportNetworkStatus.class, PatientSupportNetworkStatus.TYPE_ID, id);
	}
	

	public static AreaOfNeedCollection getAreaOfNeed(LookupService lookupService) {
		AreaOfNeedCollection collection =
			(AreaOfNeedCollection) lookupService.getLookupCollection(AreaOfNeed.TYPE_ID, 
				AreaOfNeedCollection.class, AreaOfNeed.class);
		return collection;
	}

	public static AreaOfNeed getAreaOfNeedInstance(LookupService lookupService, int id) 
	{
		return (AreaOfNeed)lookupService.getLookupInstance(AreaOfNeed.class, AreaOfNeed.TYPE_ID, id);
	}
	

	public static UnitsPerWeekCollection getUnitsPerWeek(LookupService lookupService) {
		UnitsPerWeekCollection collection =
			(UnitsPerWeekCollection) lookupService.getLookupCollection(UnitsPerWeek.TYPE_ID, 
				UnitsPerWeekCollection.class, UnitsPerWeek.class);
		return collection;
	}

	public static UnitsPerWeek getUnitsPerWeekInstance(LookupService lookupService, int id) 
	{
		return (UnitsPerWeek)lookupService.getLookupInstance(UnitsPerWeek.class, UnitsPerWeek.TYPE_ID, id);
	}
	

	public static AutonomicDysreflexiaCollection getAutonomicDysreflexia(LookupService lookupService) {
		AutonomicDysreflexiaCollection collection =
			(AutonomicDysreflexiaCollection) lookupService.getLookupCollection(AutonomicDysreflexia.TYPE_ID, 
				AutonomicDysreflexiaCollection.class, AutonomicDysreflexia.class);
		return collection;
	}

	public static AutonomicDysreflexia getAutonomicDysreflexiaInstance(LookupService lookupService, int id) 
	{
		return (AutonomicDysreflexia)lookupService.getLookupInstance(AutonomicDysreflexia.class, AutonomicDysreflexia.TYPE_ID, id);
	}
	

	public static PatientListTypeCollection getPatientListType(LookupService lookupService) {
		PatientListTypeCollection collection =
			(PatientListTypeCollection) lookupService.getLookupCollection(PatientListType.TYPE_ID, 
				PatientListTypeCollection.class, PatientListType.class);
		return collection;
	}

	public static PatientListType getPatientListTypeInstance(LookupService lookupService, int id) 
	{
		return (PatientListType)lookupService.getLookupInstance(PatientListType.class, PatientListType.TYPE_ID, id);
	}
	

	public static PreActiveActiveSuperceededCollection getPreActiveActiveSuperceeded(LookupService lookupService) {
		PreActiveActiveSuperceededCollection collection =
			(PreActiveActiveSuperceededCollection) lookupService.getLookupCollection(PreActiveActiveSuperceeded.TYPE_ID, 
				PreActiveActiveSuperceededCollection.class, PreActiveActiveSuperceeded.class);
		return collection;
	}

	public static PreActiveActiveSuperceeded getPreActiveActiveSuperceededInstance(LookupService lookupService, int id) 
	{
		return (PreActiveActiveSuperceeded)lookupService.getLookupInstance(PreActiveActiveSuperceeded.class, PreActiveActiveSuperceeded.TYPE_ID, id);
	}
	

	public static UserAssessmentCategoryCollection getUserAssessmentCategory(LookupService lookupService) {
		UserAssessmentCategoryCollection collection =
			(UserAssessmentCategoryCollection) lookupService.getLookupCollection(UserAssessmentCategory.TYPE_ID, 
				UserAssessmentCategoryCollection.class, UserAssessmentCategory.class);
		return collection;
	}

	public static UserAssessmentCategory getUserAssessmentCategoryInstance(LookupService lookupService, int id) 
	{
		return (UserAssessmentCategory)lookupService.getLookupInstance(UserAssessmentCategory.class, UserAssessmentCategory.TYPE_ID, id);
	}
	

	public static ActivityTypeCollection getActivityType(LookupService lookupService) {
		ActivityTypeCollection collection =
			(ActivityTypeCollection) lookupService.getLookupCollection(ActivityType.TYPE_ID, 
				ActivityTypeCollection.class, ActivityType.class);
		return collection;
	}

	public static ActivityType getActivityTypeInstance(LookupService lookupService, int id) 
	{
		return (ActivityType)lookupService.getLookupInstance(ActivityType.class, ActivityType.TYPE_ID, id);
	}
	

	public static ICPCategoryTypeCollection getICPCategoryType(LookupService lookupService) {
		ICPCategoryTypeCollection collection =
			(ICPCategoryTypeCollection) lookupService.getLookupCollection(ICPCategoryType.TYPE_ID, 
				ICPCategoryTypeCollection.class, ICPCategoryType.class);
		return collection;
	}

	public static ICPCategoryType getICPCategoryTypeInstance(LookupService lookupService, int id) 
	{
		return (ICPCategoryType)lookupService.getLookupInstance(ICPCategoryType.class, ICPCategoryType.TYPE_ID, id);
	}
	

	public static ActivityStatusCollection getActivityStatus(LookupService lookupService) {
		ActivityStatusCollection collection =
			(ActivityStatusCollection) lookupService.getLookupCollection(ActivityStatus.TYPE_ID, 
				ActivityStatusCollection.class, ActivityStatus.class);
		return collection;
	}

	public static ActivityStatus getActivityStatusInstance(LookupService lookupService, int id) 
	{
		return (ActivityStatus)lookupService.getLookupInstance(ActivityStatus.class, ActivityStatus.TYPE_ID, id);
	}
	

	public static ClinicalContactObjectiveCollection getClinicalContactObjective(LookupService lookupService) {
		ClinicalContactObjectiveCollection collection =
			(ClinicalContactObjectiveCollection) lookupService.getLookupCollection(ClinicalContactObjective.TYPE_ID, 
				ClinicalContactObjectiveCollection.class, ClinicalContactObjective.class);
		return collection;
	}

	public static ClinicalContactObjective getClinicalContactObjectiveInstance(LookupService lookupService, int id) 
	{
		return (ClinicalContactObjective)lookupService.getLookupInstance(ClinicalContactObjective.class, ClinicalContactObjective.TYPE_ID, id);
	}
	

	public static ProcedureStatusCollection getProcedureStatus(LookupService lookupService) {
		ProcedureStatusCollection collection =
			(ProcedureStatusCollection) lookupService.getLookupCollection(ProcedureStatus.TYPE_ID, 
				ProcedureStatusCollection.class, ProcedureStatus.class);
		return collection;
	}

	public static ProcedureStatus getProcedureStatusInstance(LookupService lookupService, int id) 
	{
		return (ProcedureStatus)lookupService.getLookupInstance(ProcedureStatus.class, ProcedureStatus.TYPE_ID, id);
	}
	

	public static LivesWithCollection getLivesWith(LookupService lookupService) {
		LivesWithCollection collection =
			(LivesWithCollection) lookupService.getLookupCollection(LivesWith.TYPE_ID, 
				LivesWithCollection.class, LivesWith.class);
		return collection;
	}

	public static LivesWith getLivesWithInstance(LookupService lookupService, int id) 
	{
		return (LivesWith)lookupService.getLookupInstance(LivesWith.class, LivesWith.TYPE_ID, id);
	}
	

	public static ProcedureLocationCollection getProcedureLocation(LookupService lookupService) {
		ProcedureLocationCollection collection =
			(ProcedureLocationCollection) lookupService.getLookupCollection(ProcedureLocation.TYPE_ID, 
				ProcedureLocationCollection.class, ProcedureLocation.class);
		return collection;
	}

	public static ProcedureLocation getProcedureLocationInstance(LookupService lookupService, int id) 
	{
		return (ProcedureLocation)lookupService.getLookupInstance(ProcedureLocation.class, ProcedureLocation.TYPE_ID, id);
	}
	

	public static PatientCharacteresticTypeCollection getPatientCharacteresticType(LookupService lookupService) {
		PatientCharacteresticTypeCollection collection =
			(PatientCharacteresticTypeCollection) lookupService.getLookupCollection(PatientCharacteresticType.TYPE_ID, 
				PatientCharacteresticTypeCollection.class, PatientCharacteresticType.class);
		return collection;
	}

	public static PatientCharacteresticType getPatientCharacteresticTypeInstance(LookupService lookupService, int id) 
	{
		return (PatientCharacteresticType)lookupService.getLookupInstance(PatientCharacteresticType.class, PatientCharacteresticType.TYPE_ID, id);
	}
	

	public static ErectDysTreatScoreCollection getErectDysTreatScore(LookupService lookupService) {
		ErectDysTreatScoreCollection collection =
			(ErectDysTreatScoreCollection) lookupService.getLookupCollection(ErectDysTreatScore.TYPE_ID, 
				ErectDysTreatScoreCollection.class, ErectDysTreatScore.class);
		return collection;
	}

	public static ErectDysTreatScore getErectDysTreatScoreInstance(LookupService lookupService, int id) 
	{
		return (ErectDysTreatScore)lookupService.getLookupInstance(ErectDysTreatScore.class, ErectDysTreatScore.TYPE_ID, id);
	}
	

	public static EquipmentAdaptationSupplierCollection getEquipmentAdaptationSupplier(LookupService lookupService) {
		EquipmentAdaptationSupplierCollection collection =
			(EquipmentAdaptationSupplierCollection) lookupService.getLookupCollection(EquipmentAdaptationSupplier.TYPE_ID, 
				EquipmentAdaptationSupplierCollection.class, EquipmentAdaptationSupplier.class);
		return collection;
	}

	public static EquipmentAdaptationSupplier getEquipmentAdaptationSupplierInstance(LookupService lookupService, int id) 
	{
		return (EquipmentAdaptationSupplier)lookupService.getLookupInstance(EquipmentAdaptationSupplier.class, EquipmentAdaptationSupplier.TYPE_ID, id);
	}
	

	public static ReferralTypeCollection getReferralType(LookupService lookupService) {
		ReferralTypeCollection collection =
			(ReferralTypeCollection) lookupService.getLookupCollection(ReferralType.TYPE_ID, 
				ReferralTypeCollection.class, ReferralType.class);
		return collection;
	}

	public static ReferralType getReferralTypeInstance(LookupService lookupService, int id) 
	{
		return (ReferralType)lookupService.getLookupInstance(ReferralType.class, ReferralType.TYPE_ID, id);
	}
	

	public static TracheostomyTypeCollection getTracheostomyType(LookupService lookupService) {
		TracheostomyTypeCollection collection =
			(TracheostomyTypeCollection) lookupService.getLookupCollection(TracheostomyType.TYPE_ID, 
				TracheostomyTypeCollection.class, TracheostomyType.class);
		return collection;
	}

	public static TracheostomyType getTracheostomyTypeInstance(LookupService lookupService, int id) 
	{
		return (TracheostomyType)lookupService.getLookupInstance(TracheostomyType.class, TracheostomyType.TYPE_ID, id);
	}
	

	public static NameTypeCollection getNameType(LookupService lookupService) {
		NameTypeCollection collection =
			(NameTypeCollection) lookupService.getLookupCollection(NameType.TYPE_ID, 
				NameTypeCollection.class, NameType.class);
		return collection;
	}

	public static NameType getNameTypeInstance(LookupService lookupService, int id) 
	{
		return (NameType)lookupService.getLookupInstance(NameType.class, NameType.TYPE_ID, id);
	}
	

	public static LocationTypeCollection getLocationType(LookupService lookupService) {
		LocationTypeCollection collection =
			(LocationTypeCollection) lookupService.getLookupCollection(LocationType.TYPE_ID, 
				LocationTypeCollection.class, LocationType.class);
		return collection;
	}

	public static LocationType getLocationTypeInstance(LookupService lookupService, int id) 
	{
		return (LocationType)lookupService.getLookupInstance(LocationType.class, LocationType.TYPE_ID, id);
	}
	

	public static VentilationModeCollection getVentilationMode(LookupService lookupService) {
		VentilationModeCollection collection =
			(VentilationModeCollection) lookupService.getLookupCollection(VentilationMode.TYPE_ID, 
				VentilationModeCollection.class, VentilationMode.class);
		return collection;
	}

	public static VentilationMode getVentilationModeInstance(LookupService lookupService, int id) 
	{
		return (VentilationMode)lookupService.getLookupInstance(VentilationMode.class, VentilationMode.TYPE_ID, id);
	}
	

	public static OrganisationTypeCollection getOrganisationType(LookupService lookupService) {
		OrganisationTypeCollection collection =
			(OrganisationTypeCollection) lookupService.getLookupCollection(OrganisationType.TYPE_ID, 
				OrganisationTypeCollection.class, OrganisationType.class);
		return collection;
	}

	public static OrganisationType getOrganisationTypeInstance(LookupService lookupService, int id) 
	{
		return (OrganisationType)lookupService.getLookupInstance(OrganisationType.class, OrganisationType.TYPE_ID, id);
	}
	

	public static VentilatorTypeCollection getVentilatorType(LookupService lookupService) {
		VentilatorTypeCollection collection =
			(VentilatorTypeCollection) lookupService.getLookupCollection(VentilatorType.TYPE_ID, 
				VentilatorTypeCollection.class, VentilatorType.class);
		return collection;
	}

	public static VentilatorType getVentilatorTypeInstance(LookupService lookupService, int id) 
	{
		return (VentilatorType)lookupService.getLookupInstance(VentilatorType.class, VentilatorType.TYPE_ID, id);
	}
	

	public static MedicGradeCollection getMedicGrade(LookupService lookupService) {
		MedicGradeCollection collection =
			(MedicGradeCollection) lookupService.getLookupCollection(MedicGrade.TYPE_ID, 
				MedicGradeCollection.class, MedicGrade.class);
		return collection;
	}

	public static MedicGrade getMedicGradeInstance(LookupService lookupService, int id) 
	{
		return (MedicGrade)lookupService.getLookupInstance(MedicGrade.class, MedicGrade.TYPE_ID, id);
	}
	

	public static ExternalCodeTypeCollection getExternalCodeType(LookupService lookupService) {
		ExternalCodeTypeCollection collection =
			(ExternalCodeTypeCollection) lookupService.getLookupCollection(ExternalCodeType.TYPE_ID, 
				ExternalCodeTypeCollection.class, ExternalCodeType.class);
		return collection;
	}

	public static ExternalCodeType getExternalCodeTypeInstance(LookupService lookupService, int id) 
	{
		return (ExternalCodeType)lookupService.getLookupInstance(ExternalCodeType.class, ExternalCodeType.TYPE_ID, id);
	}
	

	public static LateralityLRonlyCollection getLateralityLRonly(LookupService lookupService) {
		LateralityLRonlyCollection collection =
			(LateralityLRonlyCollection) lookupService.getLookupCollection(LateralityLRonly.TYPE_ID, 
				LateralityLRonlyCollection.class, LateralityLRonly.class);
		return collection;
	}

	public static LateralityLRonly getLateralityLRonlyInstance(LookupService lookupService, int id) 
	{
		return (LateralityLRonly)lookupService.getLookupInstance(LateralityLRonly.class, LateralityLRonly.TYPE_ID, id);
	}
	

	public static UrinalysisResultsCollection getUrinalysisResults(LookupService lookupService) {
		UrinalysisResultsCollection collection =
			(UrinalysisResultsCollection) lookupService.getLookupCollection(UrinalysisResults.TYPE_ID, 
				UrinalysisResultsCollection.class, UrinalysisResults.class);
		return collection;
	}

	public static UrinalysisResults getUrinalysisResultsInstance(LookupService lookupService, int id) 
	{
		return (UrinalysisResults)lookupService.getLookupInstance(UrinalysisResults.class, UrinalysisResults.TYPE_ID, id);
	}
	

	public static VSVASystemCollection getVSVASystem(LookupService lookupService) {
		VSVASystemCollection collection =
			(VSVASystemCollection) lookupService.getLookupCollection(VSVASystem.TYPE_ID, 
				VSVASystemCollection.class, VSVASystem.class);
		return collection;
	}

	public static VSVASystem getVSVASystemInstance(LookupService lookupService, int id) 
	{
		return (VSVASystem)lookupService.getLookupInstance(VSVASystem.class, VSVASystem.TYPE_ID, id);
	}
	

	public static VSSnellenCollection getVSSnellen(LookupService lookupService) {
		VSSnellenCollection collection =
			(VSSnellenCollection) lookupService.getLookupCollection(VSSnellen.TYPE_ID, 
				VSSnellenCollection.class, VSSnellen.class);
		return collection;
	}

	public static VSSnellen getVSSnellenInstance(LookupService lookupService, int id) 
	{
		return (VSSnellen)lookupService.getLookupInstance(VSSnellen.class, VSSnellen.TYPE_ID, id);
	}
	

	public static AdviceLeafletGivenToCollection getAdviceLeafletGivenTo(LookupService lookupService) {
		AdviceLeafletGivenToCollection collection =
			(AdviceLeafletGivenToCollection) lookupService.getLookupCollection(AdviceLeafletGivenTo.TYPE_ID, 
				AdviceLeafletGivenToCollection.class, AdviceLeafletGivenTo.class);
		return collection;
	}

	public static AdviceLeafletGivenTo getAdviceLeafletGivenToInstance(LookupService lookupService, int id) 
	{
		return (AdviceLeafletGivenTo)lookupService.getLookupInstance(AdviceLeafletGivenTo.class, AdviceLeafletGivenTo.TYPE_ID, id);
	}
	

	public static VSTypeCollection getVSType(LookupService lookupService) {
		VSTypeCollection collection =
			(VSTypeCollection) lookupService.getLookupCollection(VSType.TYPE_ID, 
				VSTypeCollection.class, VSType.class);
		return collection;
	}

	public static VSType getVSTypeInstance(LookupService lookupService, int id) 
	{
		return (VSType)lookupService.getLookupInstance(VSType.class, VSType.TYPE_ID, id);
	}
	

	public static VSPupilReactionCollection getVSPupilReaction(LookupService lookupService) {
		VSPupilReactionCollection collection =
			(VSPupilReactionCollection) lookupService.getLookupCollection(VSPupilReaction.TYPE_ID, 
				VSPupilReactionCollection.class, VSPupilReaction.class);
		return collection;
	}

	public static VSPupilReaction getVSPupilReactionInstance(LookupService lookupService, int id) 
	{
		return (VSPupilReaction)lookupService.getLookupInstance(VSPupilReaction.class, VSPupilReaction.TYPE_ID, id);
	}
	

	public static VSBPPositionofPatientCollection getVSBPPositionofPatient(LookupService lookupService) {
		VSBPPositionofPatientCollection collection =
			(VSBPPositionofPatientCollection) lookupService.getLookupCollection(VSBPPositionofPatient.TYPE_ID, 
				VSBPPositionofPatientCollection.class, VSBPPositionofPatient.class);
		return collection;
	}

	public static VSBPPositionofPatient getVSBPPositionofPatientInstance(LookupService lookupService, int id) 
	{
		return (VSBPPositionofPatient)lookupService.getLookupInstance(VSBPPositionofPatient.class, VSBPPositionofPatient.TYPE_ID, id);
	}
	

	public static VSBPSiteCollection getVSBPSite(LookupService lookupService) {
		VSBPSiteCollection collection =
			(VSBPSiteCollection) lookupService.getLookupCollection(VSBPSite.TYPE_ID, 
				VSBPSiteCollection.class, VSBPSite.class);
		return collection;
	}

	public static VSBPSite getVSBPSiteInstance(LookupService lookupService, int id) 
	{
		return (VSBPSite)lookupService.getLookupInstance(VSBPSite.class, VSBPSite.TYPE_ID, id);
	}
	

	public static VSPulseRhythmCollection getVSPulseRhythm(LookupService lookupService) {
		VSPulseRhythmCollection collection =
			(VSPulseRhythmCollection) lookupService.getLookupCollection(VSPulseRhythm.TYPE_ID, 
				VSPulseRhythmCollection.class, VSPulseRhythm.class);
		return collection;
	}

	public static VSPulseRhythm getVSPulseRhythmInstance(LookupService lookupService, int id) 
	{
		return (VSPulseRhythm)lookupService.getLookupInstance(VSPulseRhythm.class, VSPulseRhythm.TYPE_ID, id);
	}
	

	public static VSTempInstrumentCollection getVSTempInstrument(LookupService lookupService) {
		VSTempInstrumentCollection collection =
			(VSTempInstrumentCollection) lookupService.getLookupCollection(VSTempInstrument.TYPE_ID, 
				VSTempInstrumentCollection.class, VSTempInstrument.class);
		return collection;
	}

	public static VSTempInstrument getVSTempInstrumentInstance(LookupService lookupService, int id) 
	{
		return (VSTempInstrument)lookupService.getLookupInstance(VSTempInstrument.class, VSTempInstrument.TYPE_ID, id);
	}
	

	public static HcpDisTypeCollection getHcpDisType(LookupService lookupService) {
		HcpDisTypeCollection collection =
			(HcpDisTypeCollection) lookupService.getLookupCollection(HcpDisType.TYPE_ID, 
				HcpDisTypeCollection.class, HcpDisType.class);
		return collection;
	}

	public static HcpDisType getHcpDisTypeInstance(LookupService lookupService, int id) 
	{
		return (HcpDisType)lookupService.getLookupInstance(HcpDisType.class, HcpDisType.TYPE_ID, id);
	}
	

	public static TaxonomyTypeCollection getTaxonomyType(LookupService lookupService) {
		TaxonomyTypeCollection collection =
			(TaxonomyTypeCollection) lookupService.getLookupCollection(TaxonomyType.TYPE_ID, 
				TaxonomyTypeCollection.class, TaxonomyType.class);
		return collection;
	}

	public static TaxonomyType getTaxonomyTypeInstance(LookupService lookupService, int id) 
	{
		return (TaxonomyType)lookupService.getLookupInstance(TaxonomyType.class, TaxonomyType.TYPE_ID, id);
	}
	

	public static ProcedureIntentCollection getProcedureIntent(LookupService lookupService) {
		ProcedureIntentCollection collection =
			(ProcedureIntentCollection) lookupService.getLookupCollection(ProcedureIntent.TYPE_ID, 
				ProcedureIntentCollection.class, ProcedureIntent.class);
		return collection;
	}

	public static ProcedureIntent getProcedureIntentInstance(LookupService lookupService, int id) 
	{
		return (ProcedureIntent)lookupService.getLookupInstance(ProcedureIntent.class, ProcedureIntent.TYPE_ID, id);
	}
	

	public static DiagnosisBasisofDiagnosisCollection getDiagnosisBasisofDiagnosis(LookupService lookupService) {
		DiagnosisBasisofDiagnosisCollection collection =
			(DiagnosisBasisofDiagnosisCollection) lookupService.getLookupCollection(DiagnosisBasisofDiagnosis.TYPE_ID, 
				DiagnosisBasisofDiagnosisCollection.class, DiagnosisBasisofDiagnosis.class);
		return collection;
	}

	public static DiagnosisBasisofDiagnosis getDiagnosisBasisofDiagnosisInstance(LookupService lookupService, int id) 
	{
		return (DiagnosisBasisofDiagnosis)lookupService.getLookupInstance(DiagnosisBasisofDiagnosis.class, DiagnosisBasisofDiagnosis.TYPE_ID, id);
	}
	

	public static DiagnosisInformedOfDiagnosisCollection getDiagnosisInformedOfDiagnosis(LookupService lookupService) {
		DiagnosisInformedOfDiagnosisCollection collection =
			(DiagnosisInformedOfDiagnosisCollection) lookupService.getLookupCollection(DiagnosisInformedOfDiagnosis.TYPE_ID, 
				DiagnosisInformedOfDiagnosisCollection.class, DiagnosisInformedOfDiagnosis.class);
		return collection;
	}

	public static DiagnosisInformedOfDiagnosis getDiagnosisInformedOfDiagnosisInstance(LookupService lookupService, int id) 
	{
		return (DiagnosisInformedOfDiagnosis)lookupService.getLookupInstance(DiagnosisInformedOfDiagnosis.class, DiagnosisInformedOfDiagnosis.TYPE_ID, id);
	}
	

	public static MedicationFrequencyCollection getMedicationFrequency(LookupService lookupService) {
		MedicationFrequencyCollection collection =
			(MedicationFrequencyCollection) lookupService.getLookupCollection(MedicationFrequency.TYPE_ID, 
				MedicationFrequencyCollection.class, MedicationFrequency.class);
		return collection;
	}

	public static MedicationFrequency getMedicationFrequencyInstance(LookupService lookupService, int id) 
	{
		return (MedicationFrequency)lookupService.getLookupInstance(MedicationFrequency.class, MedicationFrequency.TYPE_ID, id);
	}
	

	public static MedicationDoseReasonStoppedCollection getMedicationDoseReasonStopped(LookupService lookupService) {
		MedicationDoseReasonStoppedCollection collection =
			(MedicationDoseReasonStoppedCollection) lookupService.getLookupCollection(MedicationDoseReasonStopped.TYPE_ID, 
				MedicationDoseReasonStoppedCollection.class, MedicationDoseReasonStopped.class);
		return collection;
	}

	public static MedicationDoseReasonStopped getMedicationDoseReasonStoppedInstance(LookupService lookupService, int id) 
	{
		return (MedicationDoseReasonStopped)lookupService.getLookupInstance(MedicationDoseReasonStopped.class, MedicationDoseReasonStopped.TYPE_ID, id);
	}
	

	public static MedicationTimesOfAdministrationCollection getMedicationTimesOfAdministration(LookupService lookupService) {
		MedicationTimesOfAdministrationCollection collection =
			(MedicationTimesOfAdministrationCollection) lookupService.getLookupCollection(MedicationTimesOfAdministration.TYPE_ID, 
				MedicationTimesOfAdministrationCollection.class, MedicationTimesOfAdministration.class);
		return collection;
	}

	public static MedicationTimesOfAdministration getMedicationTimesOfAdministrationInstance(LookupService lookupService, int id) 
	{
		return (MedicationTimesOfAdministration)lookupService.getLookupInstance(MedicationTimesOfAdministration.class, MedicationTimesOfAdministration.TYPE_ID, id);
	}
	

	public static MedicationRouteCollection getMedicationRoute(LookupService lookupService) {
		MedicationRouteCollection collection =
			(MedicationRouteCollection) lookupService.getLookupCollection(MedicationRoute.TYPE_ID, 
				MedicationRouteCollection.class, MedicationRoute.class);
		return collection;
	}

	public static MedicationRoute getMedicationRouteInstance(LookupService lookupService, int id) 
	{
		return (MedicationRoute)lookupService.getLookupInstance(MedicationRoute.class, MedicationRoute.TYPE_ID, id);
	}
	

	public static SourceofInformationCollection getSourceofInformation(LookupService lookupService) {
		SourceofInformationCollection collection =
			(SourceofInformationCollection) lookupService.getLookupCollection(SourceofInformation.TYPE_ID, 
				SourceofInformationCollection.class, SourceofInformation.class);
		return collection;
	}

	public static SourceofInformation getSourceofInformationInstance(LookupService lookupService, int id) 
	{
		return (SourceofInformation)lookupService.getLookupInstance(SourceofInformation.class, SourceofInformation.TYPE_ID, id);
	}
	

	public static LateralityLRBCollection getLateralityLRB(LookupService lookupService) {
		LateralityLRBCollection collection =
			(LateralityLRBCollection) lookupService.getLookupCollection(LateralityLRB.TYPE_ID, 
				LateralityLRBCollection.class, LateralityLRB.class);
		return collection;
	}

	public static LateralityLRB getLateralityLRBInstance(LookupService lookupService, int id) 
	{
		return (LateralityLRB)lookupService.getLookupInstance(LateralityLRB.class, LateralityLRB.TYPE_ID, id);
	}
	

	public static MedicalHistoryProcedureSiteCollection getMedicalHistoryProcedureSite(LookupService lookupService) {
		MedicalHistoryProcedureSiteCollection collection =
			(MedicalHistoryProcedureSiteCollection) lookupService.getLookupCollection(MedicalHistoryProcedureSite.TYPE_ID, 
				MedicalHistoryProcedureSiteCollection.class, MedicalHistoryProcedureSite.class);
		return collection;
	}

	public static MedicalHistoryProcedureSite getMedicalHistoryProcedureSiteInstance(LookupService lookupService, int id) 
	{
		return (MedicalHistoryProcedureSite)lookupService.getLookupInstance(MedicalHistoryProcedureSite.class, MedicalHistoryProcedureSite.TYPE_ID, id);
	}
	

	public static AllergenTypeCollection getAllergenType(LookupService lookupService) {
		AllergenTypeCollection collection =
			(AllergenTypeCollection) lookupService.getLookupCollection(AllergenType.TYPE_ID, 
				AllergenTypeCollection.class, AllergenType.class);
		return collection;
	}

	public static AllergenType getAllergenTypeInstance(LookupService lookupService, int id) 
	{
		return (AllergenType)lookupService.getLookupInstance(AllergenType.class, AllergenType.TYPE_ID, id);
	}
	

	public static ConfirmedStatusCollection getConfirmedStatus(LookupService lookupService) {
		ConfirmedStatusCollection collection =
			(ConfirmedStatusCollection) lookupService.getLookupCollection(ConfirmedStatus.TYPE_ID, 
				ConfirmedStatusCollection.class, ConfirmedStatus.class);
		return collection;
	}

	public static ConfirmedStatus getConfirmedStatusInstance(LookupService lookupService, int id) 
	{
		return (ConfirmedStatus)lookupService.getLookupInstance(ConfirmedStatus.class, ConfirmedStatus.TYPE_ID, id);
	}
	

	public static AllergyReactionCollection getAllergyReaction(LookupService lookupService) {
		AllergyReactionCollection collection =
			(AllergyReactionCollection) lookupService.getLookupCollection(AllergyReaction.TYPE_ID, 
				AllergyReactionCollection.class, AllergyReaction.class);
		return collection;
	}

	public static AllergyReaction getAllergyReactionInstance(LookupService lookupService, int id) 
	{
		return (AllergyReaction)lookupService.getLookupInstance(AllergyReaction.class, AllergyReaction.TYPE_ID, id);
	}
	

	public static AlertTypeCollection getAlertType(LookupService lookupService) {
		AlertTypeCollection collection =
			(AlertTypeCollection) lookupService.getLookupCollection(AlertType.TYPE_ID, 
				AlertTypeCollection.class, AlertType.class);
		return collection;
	}

	public static AlertType getAlertTypeInstance(LookupService lookupService, int id) 
	{
		return (AlertType)lookupService.getLookupInstance(AlertType.class, AlertType.TYPE_ID, id);
	}
	

	public static ReligionCollection getReligion(LookupService lookupService) {
		ReligionCollection collection =
			(ReligionCollection) lookupService.getLookupCollection(Religion.TYPE_ID, 
				ReligionCollection.class, Religion.class);
		return collection;
	}

	public static Religion getReligionInstance(LookupService lookupService, int id) 
	{
		return (Religion)lookupService.getLookupInstance(Religion.class, Religion.TYPE_ID, id);
	}
	

	public static CorrectedReasonCollection getCorrectedReason(LookupService lookupService) {
		CorrectedReasonCollection collection =
			(CorrectedReasonCollection) lookupService.getLookupCollection(CorrectedReason.TYPE_ID, 
				CorrectedReasonCollection.class, CorrectedReason.class);
		return collection;
	}

	public static CorrectedReason getCorrectedReasonInstance(LookupService lookupService, int id) 
	{
		return (CorrectedReason)lookupService.getLookupInstance(CorrectedReason.class, CorrectedReason.TYPE_ID, id);
	}
	

	public static ArrivalModeCollection getArrivalMode(LookupService lookupService) {
		ArrivalModeCollection collection =
			(ArrivalModeCollection) lookupService.getLookupCollection(ArrivalMode.TYPE_ID, 
				ArrivalModeCollection.class, ArrivalMode.class);
		return collection;
	}

	public static ArrivalMode getArrivalModeInstance(LookupService lookupService, int id) 
	{
		return (ArrivalMode)lookupService.getLookupInstance(ArrivalMode.class, ArrivalMode.TYPE_ID, id);
	}
	

	public static DocumentStatusCollection getDocumentStatus(LookupService lookupService) {
		DocumentStatusCollection collection =
			(DocumentStatusCollection) lookupService.getLookupCollection(DocumentStatus.TYPE_ID, 
				DocumentStatusCollection.class, DocumentStatus.class);
		return collection;
	}

	public static DocumentStatus getDocumentStatusInstance(LookupService lookupService, int id) 
	{
		return (DocumentStatus)lookupService.getLookupInstance(DocumentStatus.class, DocumentStatus.TYPE_ID, id);
	}
	

	public static PreActiveActiveInactiveStatusCollection getPreActiveActiveInactiveStatus(LookupService lookupService) {
		PreActiveActiveInactiveStatusCollection collection =
			(PreActiveActiveInactiveStatusCollection) lookupService.getLookupCollection(PreActiveActiveInactiveStatus.TYPE_ID, 
				PreActiveActiveInactiveStatusCollection.class, PreActiveActiveInactiveStatus.class);
		return collection;
	}

	public static PreActiveActiveInactiveStatus getPreActiveActiveInactiveStatusInstance(LookupService lookupService, int id) 
	{
		return (PreActiveActiveInactiveStatus)lookupService.getLookupInstance(PreActiveActiveInactiveStatus.class, PreActiveActiveInactiveStatus.TYPE_ID, id);
	}
	

	public static IllicitDrugsCollection getIllicitDrugs(LookupService lookupService) {
		IllicitDrugsCollection collection =
			(IllicitDrugsCollection) lookupService.getLookupCollection(IllicitDrugs.TYPE_ID, 
				IllicitDrugsCollection.class, IllicitDrugs.class);
		return collection;
	}

	public static IllicitDrugs getIllicitDrugsInstance(LookupService lookupService, int id) 
	{
		return (IllicitDrugs)lookupService.getLookupInstance(IllicitDrugs.class, IllicitDrugs.TYPE_ID, id);
	}
	

	public static QuestionAnswerTypeCollection getQuestionAnswerType(LookupService lookupService) {
		QuestionAnswerTypeCollection collection =
			(QuestionAnswerTypeCollection) lookupService.getLookupCollection(QuestionAnswerType.TYPE_ID, 
				QuestionAnswerTypeCollection.class, QuestionAnswerType.class);
		return collection;
	}

	public static QuestionAnswerType getQuestionAnswerTypeInstance(LookupService lookupService, int id) 
	{
		return (QuestionAnswerType)lookupService.getLookupInstance(QuestionAnswerType.class, QuestionAnswerType.TYPE_ID, id);
	}
	

	public static QuestionStatusCollection getQuestionStatus(LookupService lookupService) {
		QuestionStatusCollection collection =
			(QuestionStatusCollection) lookupService.getLookupCollection(QuestionStatus.TYPE_ID, 
				QuestionStatusCollection.class, QuestionStatus.class);
		return collection;
	}

	public static QuestionStatus getQuestionStatusInstance(LookupService lookupService, int id) 
	{
		return (QuestionStatus)lookupService.getLookupInstance(QuestionStatus.class, QuestionStatus.TYPE_ID, id);
	}
	

	public static QuestionClassificationCollection getQuestionClassification(LookupService lookupService) {
		QuestionClassificationCollection collection =
			(QuestionClassificationCollection) lookupService.getLookupCollection(QuestionClassification.TYPE_ID, 
				QuestionClassificationCollection.class, QuestionClassification.class);
		return collection;
	}

	public static QuestionClassification getQuestionClassificationInstance(LookupService lookupService, int id) 
	{
		return (QuestionClassification)lookupService.getLookupInstance(QuestionClassification.class, QuestionClassification.TYPE_ID, id);
	}
	

	public static UrineTestResultCollection getUrineTestResult(LookupService lookupService) {
		UrineTestResultCollection collection =
			(UrineTestResultCollection) lookupService.getLookupCollection(UrineTestResult.TYPE_ID, 
				UrineTestResultCollection.class, UrineTestResult.class);
		return collection;
	}

	public static UrineTestResult getUrineTestResultInstance(LookupService lookupService, int id) 
	{
		return (UrineTestResult)lookupService.getLookupInstance(UrineTestResult.class, UrineTestResult.TYPE_ID, id);
	}
	

	public static StaffTypeCollection getStaffType(LookupService lookupService) {
		StaffTypeCollection collection =
			(StaffTypeCollection) lookupService.getLookupCollection(StaffType.TYPE_ID, 
				StaffTypeCollection.class, StaffType.class);
		return collection;
	}

	public static StaffType getStaffTypeInstance(LookupService lookupService, int id) 
	{
		return (StaffType)lookupService.getLookupInstance(StaffType.class, StaffType.TYPE_ID, id);
	}
	

	public static DrawingCategoriesCollection getDrawingCategories(LookupService lookupService) {
		DrawingCategoriesCollection collection =
			(DrawingCategoriesCollection) lookupService.getLookupCollection(DrawingCategories.TYPE_ID, 
				DrawingCategoriesCollection.class, DrawingCategories.class);
		return collection;
	}

	public static DrawingCategories getDrawingCategoriesInstance(LookupService lookupService, int id) 
	{
		return (DrawingCategories)lookupService.getLookupInstance(DrawingCategories.class, DrawingCategories.TYPE_ID, id);
	}
	

	public static ICPCompLinkedTypeCollection getICPCompLinkedType(LookupService lookupService) {
		ICPCompLinkedTypeCollection collection =
			(ICPCompLinkedTypeCollection) lookupService.getLookupCollection(ICPCompLinkedType.TYPE_ID, 
				ICPCompLinkedTypeCollection.class, ICPCompLinkedType.class);
		return collection;
	}

	public static ICPCompLinkedType getICPCompLinkedTypeInstance(LookupService lookupService, int id) 
	{
		return (ICPCompLinkedType)lookupService.getLookupInstance(ICPCompLinkedType.class, ICPCompLinkedType.TYPE_ID, id);
	}
	

	public static PatientStatusCollection getPatientStatus(LookupService lookupService) {
		PatientStatusCollection collection =
			(PatientStatusCollection) lookupService.getLookupCollection(PatientStatus.TYPE_ID, 
				PatientStatusCollection.class, PatientStatus.class);
		return collection;
	}

	public static PatientStatus getPatientStatusInstance(LookupService lookupService, int id) 
	{
		return (PatientStatus)lookupService.getLookupInstance(PatientStatus.class, PatientStatus.TYPE_ID, id);
	}
	

	public static AccreditationLocationStatusCollection getAccreditationLocationStatus(LookupService lookupService) {
		AccreditationLocationStatusCollection collection =
			(AccreditationLocationStatusCollection) lookupService.getLookupCollection(AccreditationLocationStatus.TYPE_ID, 
				AccreditationLocationStatusCollection.class, AccreditationLocationStatus.class);
		return collection;
	}

	public static AccreditationLocationStatus getAccreditationLocationStatusInstance(LookupService lookupService, int id) 
	{
		return (AccreditationLocationStatus)lookupService.getLookupInstance(AccreditationLocationStatus.class, AccreditationLocationStatus.TYPE_ID, id);
	}
	

	public static GPStatusCollection getGPStatus(LookupService lookupService) {
		GPStatusCollection collection =
			(GPStatusCollection) lookupService.getLookupCollection(GPStatus.TYPE_ID, 
				GPStatusCollection.class, GPStatus.class);
		return collection;
	}

	public static GPStatus getGPStatusInstance(LookupService lookupService, int id) 
	{
		return (GPStatus)lookupService.getLookupInstance(GPStatus.class, GPStatus.TYPE_ID, id);
	}
	

	public static ActivitySpecRequirementsCollection getActivitySpecRequirements(LookupService lookupService) {
		ActivitySpecRequirementsCollection collection =
			(ActivitySpecRequirementsCollection) lookupService.getLookupCollection(ActivitySpecRequirements.TYPE_ID, 
				ActivitySpecRequirementsCollection.class, ActivitySpecRequirements.class);
		return collection;
	}

	public static ActivitySpecRequirements getActivitySpecRequirementsInstance(LookupService lookupService, int id) 
	{
		return (ActivitySpecRequirements)lookupService.getLookupInstance(ActivitySpecRequirements.class, ActivitySpecRequirements.TYPE_ID, id);
	}
	

	public static ProcedureContextCollection getProcedureContext(LookupService lookupService) {
		ProcedureContextCollection collection =
			(ProcedureContextCollection) lookupService.getLookupCollection(ProcedureContext.TYPE_ID, 
				ProcedureContextCollection.class, ProcedureContext.class);
		return collection;
	}

	public static ProcedureContext getProcedureContextInstance(LookupService lookupService, int id) 
	{
		return (ProcedureContext)lookupService.getLookupInstance(ProcedureContext.class, ProcedureContext.TYPE_ID, id);
	}
	

	public static InvestigationsCollection getInvestigations(LookupService lookupService) {
		InvestigationsCollection collection =
			(InvestigationsCollection) lookupService.getLookupCollection(Investigations.TYPE_ID, 
				InvestigationsCollection.class, Investigations.class);
		return collection;
	}

	public static Investigations getInvestigationsInstance(LookupService lookupService, int id) 
	{
		return (Investigations)lookupService.getLookupInstance(Investigations.class, Investigations.TYPE_ID, id);
	}
	

	public static EquipmentAdaptationsFundedByCollection getEquipmentAdaptationsFundedBy(LookupService lookupService) {
		EquipmentAdaptationsFundedByCollection collection =
			(EquipmentAdaptationsFundedByCollection) lookupService.getLookupCollection(EquipmentAdaptationsFundedBy.TYPE_ID, 
				EquipmentAdaptationsFundedByCollection.class, EquipmentAdaptationsFundedBy.class);
		return collection;
	}

	public static EquipmentAdaptationsFundedBy getEquipmentAdaptationsFundedByInstance(LookupService lookupService, int id) 
	{
		return (EquipmentAdaptationsFundedBy)lookupService.getLookupInstance(EquipmentAdaptationsFundedBy.class, EquipmentAdaptationsFundedBy.TYPE_ID, id);
	}
	

	public static EquipmentAdaptationLoanCollection getEquipmentAdaptationLoan(LookupService lookupService) {
		EquipmentAdaptationLoanCollection collection =
			(EquipmentAdaptationLoanCollection) lookupService.getLookupCollection(EquipmentAdaptationLoan.TYPE_ID, 
				EquipmentAdaptationLoanCollection.class, EquipmentAdaptationLoan.class);
		return collection;
	}

	public static EquipmentAdaptationLoan getEquipmentAdaptationLoanInstance(LookupService lookupService, int id) 
	{
		return (EquipmentAdaptationLoan)lookupService.getLookupInstance(EquipmentAdaptationLoan.class, EquipmentAdaptationLoan.TYPE_ID, id);
	}
	

	public static EquipmentAdaptationSuppliedForCollection getEquipmentAdaptationSuppliedFor(LookupService lookupService) {
		EquipmentAdaptationSuppliedForCollection collection =
			(EquipmentAdaptationSuppliedForCollection) lookupService.getLookupCollection(EquipmentAdaptationSuppliedFor.TYPE_ID, 
				EquipmentAdaptationSuppliedForCollection.class, EquipmentAdaptationSuppliedFor.class);
		return collection;
	}

	public static EquipmentAdaptationSuppliedFor getEquipmentAdaptationSuppliedForInstance(LookupService lookupService, int id) 
	{
		return (EquipmentAdaptationSuppliedFor)lookupService.getLookupInstance(EquipmentAdaptationSuppliedFor.class, EquipmentAdaptationSuppliedFor.TYPE_ID, id);
	}
	

	public static EquipmentTypeCollection getEquipmentType(LookupService lookupService) {
		EquipmentTypeCollection collection =
			(EquipmentTypeCollection) lookupService.getLookupCollection(EquipmentType.TYPE_ID, 
				EquipmentTypeCollection.class, EquipmentType.class);
		return collection;
	}

	public static EquipmentType getEquipmentTypeInstance(LookupService lookupService, int id) 
	{
		return (EquipmentType)lookupService.getLookupInstance(EquipmentType.class, EquipmentType.TYPE_ID, id);
	}
	

	public static PatientConcernStatusCollection getPatientConcernStatus(LookupService lookupService) {
		PatientConcernStatusCollection collection =
			(PatientConcernStatusCollection) lookupService.getLookupCollection(PatientConcernStatus.TYPE_ID, 
				PatientConcernStatusCollection.class, PatientConcernStatus.class);
		return collection;
	}

	public static PatientConcernStatus getPatientConcernStatusInstance(LookupService lookupService, int id) 
	{
		return (PatientConcernStatus)lookupService.getLookupInstance(PatientConcernStatus.class, PatientConcernStatus.TYPE_ID, id);
	}
	

	public static TimeUnitsSecondsToMonthsCollection getTimeUnitsSecondsToMonths(LookupService lookupService) {
		TimeUnitsSecondsToMonthsCollection collection =
			(TimeUnitsSecondsToMonthsCollection) lookupService.getLookupCollection(TimeUnitsSecondsToMonths.TYPE_ID, 
				TimeUnitsSecondsToMonthsCollection.class, TimeUnitsSecondsToMonths.class);
		return collection;
	}

	public static TimeUnitsSecondsToMonths getTimeUnitsSecondsToMonthsInstance(LookupService lookupService, int id) 
	{
		return (TimeUnitsSecondsToMonths)lookupService.getLookupInstance(TimeUnitsSecondsToMonths.class, TimeUnitsSecondsToMonths.TYPE_ID, id);
	}
	

	public static FluidBalanceTypeCollection getFluidBalanceType(LookupService lookupService) {
		FluidBalanceTypeCollection collection =
			(FluidBalanceTypeCollection) lookupService.getLookupCollection(FluidBalanceType.TYPE_ID, 
				FluidBalanceTypeCollection.class, FluidBalanceType.class);
		return collection;
	}

	public static FluidBalanceType getFluidBalanceTypeInstance(LookupService lookupService, int id) 
	{
		return (FluidBalanceType)lookupService.getLookupInstance(FluidBalanceType.class, FluidBalanceType.TYPE_ID, id);
	}
	

	public static PatientPositionCollection getPatientPosition(LookupService lookupService) {
		PatientPositionCollection collection =
			(PatientPositionCollection) lookupService.getLookupCollection(PatientPosition.TYPE_ID, 
				PatientPositionCollection.class, PatientPosition.class);
		return collection;
	}

	public static PatientPosition getPatientPositionInstance(LookupService lookupService, int id) 
	{
		return (PatientPosition)lookupService.getLookupInstance(PatientPosition.class, PatientPosition.TYPE_ID, id);
	}
	

	public static TracheostomyAccessoriesCollection getTracheostomyAccessories(LookupService lookupService) {
		TracheostomyAccessoriesCollection collection =
			(TracheostomyAccessoriesCollection) lookupService.getLookupCollection(TracheostomyAccessories.TYPE_ID, 
				TracheostomyAccessoriesCollection.class, TracheostomyAccessories.class);
		return collection;
	}

	public static TracheostomyAccessories getTracheostomyAccessoriesInstance(LookupService lookupService, int id) 
	{
		return (TracheostomyAccessories)lookupService.getLookupInstance(TracheostomyAccessories.class, TracheostomyAccessories.TYPE_ID, id);
	}
	

	public static PersonHealthActCategoryCollection getPersonHealthActCategory(LookupService lookupService) {
		PersonHealthActCategoryCollection collection =
			(PersonHealthActCategoryCollection) lookupService.getLookupCollection(PersonHealthActCategory.TYPE_ID, 
				PersonHealthActCategoryCollection.class, PersonHealthActCategory.class);
		return collection;
	}

	public static PersonHealthActCategory getPersonHealthActCategoryInstance(LookupService lookupService, int id) 
	{
		return (PersonHealthActCategory)lookupService.getLookupInstance(PersonHealthActCategory.class, PersonHealthActCategory.TYPE_ID, id);
	}
	
}



