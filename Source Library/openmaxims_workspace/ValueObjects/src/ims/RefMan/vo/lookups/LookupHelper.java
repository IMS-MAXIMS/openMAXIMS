//#############################################################################
//#                                                                           #
//#  Copyright (C) <2015>  <IMS MAXIMS>                                       #
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
//#  IMS MAXIMS provides absolutely NO GUARANTEE OF THE CLINICAL SAFTEY of    #
//#  this program.  Users of this software do so entirely at their own risk.  #
//#  IMS MAXIMS only ensures the Clinical Safety of unaltered run-time        #
//#  software that it builds, deploys and maintains.                          #
//#                                                                           #
//#############################################################################
//#EOH

/*
 * This code was generated.
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5589.25814)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated: 13/10/2015, 13:23
 */
package ims.RefMan.vo.lookups;

import ims.domain.lookups.LookupService;

/**
 * This is a generated interface.
 * Provides methods to get the ValueObject Lookup types of this namespace.
 * 
 */
public final class LookupHelper {
	public static WeekInTheMonthCollection getWeekInTheMonth(LookupService lookupService) {
		WeekInTheMonthCollection collection =
			(WeekInTheMonthCollection) lookupService.getLookupCollection(WeekInTheMonth.TYPE_ID, 
				WeekInTheMonthCollection.class, WeekInTheMonth.class);
		return collection;
	}

	public static WeekInTheMonth getWeekInTheMonthInstance(LookupService lookupService, int id) 
	{
		return (WeekInTheMonth)lookupService.getLookupInstance(WeekInTheMonth.class, WeekInTheMonth.TYPE_ID, id);
	}
	

	public static RecurringCollection getRecurring(LookupService lookupService) {
		RecurringCollection collection =
			(RecurringCollection) lookupService.getLookupCollection(Recurring.TYPE_ID, 
				RecurringCollection.class, Recurring.class);
		return collection;
	}

	public static Recurring getRecurringInstance(LookupService lookupService, int id) 
	{
		return (Recurring)lookupService.getLookupInstance(Recurring.class, Recurring.TYPE_ID, id);
	}
	

	public static DefaultTriageActionForCABReferralCollection getDefaultTriageActionForCABReferral(LookupService lookupService) {
		DefaultTriageActionForCABReferralCollection collection =
			(DefaultTriageActionForCABReferralCollection) lookupService.getLookupCollection(DefaultTriageActionForCABReferral.TYPE_ID, 
				DefaultTriageActionForCABReferralCollection.class, DefaultTriageActionForCABReferral.class);
		return collection;
	}

	public static DefaultTriageActionForCABReferral getDefaultTriageActionForCABReferralInstance(LookupService lookupService, int id) 
	{
		return (DefaultTriageActionForCABReferral)lookupService.getLookupInstance(DefaultTriageActionForCABReferral.class, DefaultTriageActionForCABReferral.TYPE_ID, id);
	}
	

	public static DefaultTriageActionForManualReferralCollection getDefaultTriageActionForManualReferral(LookupService lookupService) {
		DefaultTriageActionForManualReferralCollection collection =
			(DefaultTriageActionForManualReferralCollection) lookupService.getLookupCollection(DefaultTriageActionForManualReferral.TYPE_ID, 
				DefaultTriageActionForManualReferralCollection.class, DefaultTriageActionForManualReferral.class);
		return collection;
	}

	public static DefaultTriageActionForManualReferral getDefaultTriageActionForManualReferralInstance(LookupService lookupService, int id) 
	{
		return (DefaultTriageActionForManualReferral)lookupService.getLookupInstance(DefaultTriageActionForManualReferral.class, DefaultTriageActionForManualReferral.TYPE_ID, id);
	}
	

	public static ReasonDeclined28DayOfferCollection getReasonDeclined28DayOffer(LookupService lookupService) {
		ReasonDeclined28DayOfferCollection collection =
			(ReasonDeclined28DayOfferCollection) lookupService.getLookupCollection(ReasonDeclined28DayOffer.TYPE_ID, 
				ReasonDeclined28DayOfferCollection.class, ReasonDeclined28DayOffer.class);
		return collection;
	}

	public static ReasonDeclined28DayOffer getReasonDeclined28DayOfferInstance(LookupService lookupService, int id) 
	{
		return (ReasonDeclined28DayOffer)lookupService.getLookupInstance(ReasonDeclined28DayOffer.class, ReasonDeclined28DayOffer.TYPE_ID, id);
	}
	

	public static ReasonForChangeUrgencyCollection getReasonForChangeUrgency(LookupService lookupService) {
		ReasonForChangeUrgencyCollection collection =
			(ReasonForChangeUrgencyCollection) lookupService.getLookupCollection(ReasonForChangeUrgency.TYPE_ID, 
				ReasonForChangeUrgencyCollection.class, ReasonForChangeUrgency.class);
		return collection;
	}

	public static ReasonForChangeUrgency getReasonForChangeUrgencyInstance(LookupService lookupService, int id) 
	{
		return (ReasonForChangeUrgency)lookupService.getLookupInstance(ReasonForChangeUrgency.class, ReasonForChangeUrgency.TYPE_ID, id);
	}
	

	public static RedirectReasonCollection getRedirectReason(LookupService lookupService) {
		RedirectReasonCollection collection =
			(RedirectReasonCollection) lookupService.getLookupCollection(RedirectReason.TYPE_ID, 
				RedirectReasonCollection.class, RedirectReason.class);
		return collection;
	}

	public static RedirectReason getRedirectReasonInstance(LookupService lookupService, int id) 
	{
		return (RedirectReason)lookupService.getLookupInstance(RedirectReason.class, RedirectReason.TYPE_ID, id);
	}
	

	public static TriageOutcomeAppointmentDayCollection getTriageOutcomeAppointmentDay(LookupService lookupService) {
		TriageOutcomeAppointmentDayCollection collection =
			(TriageOutcomeAppointmentDayCollection) lookupService.getLookupCollection(TriageOutcomeAppointmentDay.TYPE_ID, 
				TriageOutcomeAppointmentDayCollection.class, TriageOutcomeAppointmentDay.class);
		return collection;
	}

	public static TriageOutcomeAppointmentDay getTriageOutcomeAppointmentDayInstance(LookupService lookupService, int id) 
	{
		return (TriageOutcomeAppointmentDay)lookupService.getLookupInstance(TriageOutcomeAppointmentDay.class, TriageOutcomeAppointmentDay.TYPE_ID, id);
	}
	

	public static AcceptedActionsRequiredCollection getAcceptedActionsRequired(LookupService lookupService) {
		AcceptedActionsRequiredCollection collection =
			(AcceptedActionsRequiredCollection) lookupService.getLookupCollection(AcceptedActionsRequired.TYPE_ID, 
				AcceptedActionsRequiredCollection.class, AcceptedActionsRequired.class);
		return collection;
	}

	public static AcceptedActionsRequired getAcceptedActionsRequiredInstance(LookupService lookupService, int id) 
	{
		return (AcceptedActionsRequired)lookupService.getLookupInstance(AcceptedActionsRequired.class, AcceptedActionsRequired.TYPE_ID, id);
	}
	

	public static TriageOutcomeStatusCollection getTriageOutcomeStatus(LookupService lookupService) {
		TriageOutcomeStatusCollection collection =
			(TriageOutcomeStatusCollection) lookupService.getLookupCollection(TriageOutcomeStatus.TYPE_ID, 
				TriageOutcomeStatusCollection.class, TriageOutcomeStatus.class);
		return collection;
	}

	public static TriageOutcomeStatus getTriageOutcomeStatusInstance(LookupService lookupService, int id) 
	{
		return (TriageOutcomeStatus)lookupService.getLookupInstance(TriageOutcomeStatus.class, TriageOutcomeStatus.TYPE_ID, id);
	}
	

	public static ReferralInitiatedFromCollection getReferralInitiatedFrom(LookupService lookupService) {
		ReferralInitiatedFromCollection collection =
			(ReferralInitiatedFromCollection) lookupService.getLookupCollection(ReferralInitiatedFrom.TYPE_ID, 
				ReferralInitiatedFromCollection.class, ReferralInitiatedFrom.class);
		return collection;
	}

	public static ReferralInitiatedFrom getReferralInitiatedFromInstance(LookupService lookupService, int id) 
	{
		return (ReferralInitiatedFrom)lookupService.getLookupInstance(ReferralInitiatedFrom.class, ReferralInitiatedFrom.TYPE_ID, id);
	}
	

	public static ReferralRelationTypeCollection getReferralRelationType(LookupService lookupService) {
		ReferralRelationTypeCollection collection =
			(ReferralRelationTypeCollection) lookupService.getLookupCollection(ReferralRelationType.TYPE_ID, 
				ReferralRelationTypeCollection.class, ReferralRelationType.class);
		return collection;
	}

	public static ReferralRelationType getReferralRelationTypeInstance(LookupService lookupService, int id) 
	{
		return (ReferralRelationType)lookupService.getLookupInstance(ReferralRelationType.class, ReferralRelationType.TYPE_ID, id);
	}
	

	public static WaitingCardAdmissionTypeCollection getWaitingCardAdmissionType(LookupService lookupService) {
		WaitingCardAdmissionTypeCollection collection =
			(WaitingCardAdmissionTypeCollection) lookupService.getLookupCollection(WaitingCardAdmissionType.TYPE_ID, 
				WaitingCardAdmissionTypeCollection.class, WaitingCardAdmissionType.class);
		return collection;
	}

	public static WaitingCardAdmissionType getWaitingCardAdmissionTypeInstance(LookupService lookupService, int id) 
	{
		return (WaitingCardAdmissionType)lookupService.getLookupInstance(WaitingCardAdmissionType.class, WaitingCardAdmissionType.TYPE_ID, id);
	}
	

	public static AddmitedInTimeUnitCollection getAddmitedInTimeUnit(LookupService lookupService) {
		AddmitedInTimeUnitCollection collection =
			(AddmitedInTimeUnitCollection) lookupService.getLookupCollection(AddmitedInTimeUnit.TYPE_ID, 
				AddmitedInTimeUnitCollection.class, AddmitedInTimeUnit.class);
		return collection;
	}

	public static AddmitedInTimeUnit getAddmitedInTimeUnitInstance(LookupService lookupService, int id) 
	{
		return (AddmitedInTimeUnit)lookupService.getLookupInstance(AddmitedInTimeUnit.class, AddmitedInTimeUnit.TYPE_ID, id);
	}
	

	public static CancerTypeCollection getCancerType(LookupService lookupService) {
		CancerTypeCollection collection =
			(CancerTypeCollection) lookupService.getLookupCollection(CancerType.TYPE_ID, 
				CancerTypeCollection.class, CancerType.class);
		return collection;
	}

	public static CancerType getCancerTypeInstance(LookupService lookupService, int id) 
	{
		return (CancerType)lookupService.getLookupInstance(CancerType.class, CancerType.TYPE_ID, id);
	}
	

	public static PreOpPostOpCareCollection getPreOpPostOpCare(LookupService lookupService) {
		PreOpPostOpCareCollection collection =
			(PreOpPostOpCareCollection) lookupService.getLookupCollection(PreOpPostOpCare.TYPE_ID, 
				PreOpPostOpCareCollection.class, PreOpPostOpCare.class);
		return collection;
	}

	public static PreOpPostOpCare getPreOpPostOpCareInstance(LookupService lookupService, int id) 
	{
		return (PreOpPostOpCare)lookupService.getLookupInstance(PreOpPostOpCare.class, PreOpPostOpCare.TYPE_ID, id);
	}
	

	public static ProcedureExecutantCollection getProcedureExecutant(LookupService lookupService) {
		ProcedureExecutantCollection collection =
			(ProcedureExecutantCollection) lookupService.getLookupCollection(ProcedureExecutant.TYPE_ID, 
				ProcedureExecutantCollection.class, ProcedureExecutant.class);
		return collection;
	}

	public static ProcedureExecutant getProcedureExecutantInstance(LookupService lookupService, int id) 
	{
		return (ProcedureExecutant)lookupService.getLookupInstance(ProcedureExecutant.class, ProcedureExecutant.TYPE_ID, id);
	}
	

	public static OtherProvidersCollection getOtherProviders(LookupService lookupService) {
		OtherProvidersCollection collection =
			(OtherProvidersCollection) lookupService.getLookupCollection(OtherProviders.TYPE_ID, 
				OtherProvidersCollection.class, OtherProviders.class);
		return collection;
	}

	public static OtherProviders getOtherProvidersInstance(LookupService lookupService, int id) 
	{
		return (OtherProviders)lookupService.getLookupInstance(OtherProviders.class, OtherProviders.TYPE_ID, id);
	}
	

	public static ERODReasonCollection getERODReason(LookupService lookupService) {
		ERODReasonCollection collection =
			(ERODReasonCollection) lookupService.getLookupCollection(ERODReason.TYPE_ID, 
				ERODReasonCollection.class, ERODReason.class);
		return collection;
	}

	public static ERODReason getERODReasonInstance(LookupService lookupService, int id) 
	{
		return (ERODReason)lookupService.getLookupInstance(ERODReason.class, ERODReason.TYPE_ID, id);
	}
	

	public static ElectiveListUndoReasonCollection getElectiveListUndoReason(LookupService lookupService) {
		ElectiveListUndoReasonCollection collection =
			(ElectiveListUndoReasonCollection) lookupService.getLookupCollection(ElectiveListUndoReason.TYPE_ID, 
				ElectiveListUndoReasonCollection.class, ElectiveListUndoReason.class);
		return collection;
	}

	public static ElectiveListUndoReason getElectiveListUndoReasonInstance(LookupService lookupService, int id) 
	{
		return (ElectiveListUndoReason)lookupService.getLookupInstance(ElectiveListUndoReason.class, ElectiveListUndoReason.TYPE_ID, id);
	}
	

	public static ElectiveListReviewTypeCollection getElectiveListReviewType(LookupService lookupService) {
		ElectiveListReviewTypeCollection collection =
			(ElectiveListReviewTypeCollection) lookupService.getLookupCollection(ElectiveListReviewType.TYPE_ID, 
				ElectiveListReviewTypeCollection.class, ElectiveListReviewType.class);
		return collection;
	}

	public static ElectiveListReviewType getElectiveListReviewTypeInstance(LookupService lookupService, int id) 
	{
		return (ElectiveListReviewType)lookupService.getLookupInstance(ElectiveListReviewType.class, ElectiveListReviewType.TYPE_ID, id);
	}
	

	public static RemovalOtherReasonCollection getRemovalOtherReason(LookupService lookupService) {
		RemovalOtherReasonCollection collection =
			(RemovalOtherReasonCollection) lookupService.getLookupCollection(RemovalOtherReason.TYPE_ID, 
				RemovalOtherReasonCollection.class, RemovalOtherReason.class);
		return collection;
	}

	public static RemovalOtherReason getRemovalOtherReasonInstance(LookupService lookupService, int id) 
	{
		return (RemovalOtherReason)lookupService.getLookupInstance(RemovalOtherReason.class, RemovalOtherReason.TYPE_ID, id);
	}
	

	public static AdmissionOfferOutcomeCollection getAdmissionOfferOutcome(LookupService lookupService) {
		AdmissionOfferOutcomeCollection collection =
			(AdmissionOfferOutcomeCollection) lookupService.getLookupCollection(AdmissionOfferOutcome.TYPE_ID, 
				AdmissionOfferOutcomeCollection.class, AdmissionOfferOutcome.class);
		return collection;
	}

	public static AdmissionOfferOutcome getAdmissionOfferOutcomeInstance(LookupService lookupService, int id) 
	{
		return (AdmissionOfferOutcome)lookupService.getLookupInstance(AdmissionOfferOutcome.class, AdmissionOfferOutcome.TYPE_ID, id);
	}
	

	public static SuspensionReasonCollection getSuspensionReason(LookupService lookupService) {
		SuspensionReasonCollection collection =
			(SuspensionReasonCollection) lookupService.getLookupCollection(SuspensionReason.TYPE_ID, 
				SuspensionReasonCollection.class, SuspensionReason.class);
		return collection;
	}

	public static SuspensionReason getSuspensionReasonInstance(LookupService lookupService, int id) 
	{
		return (SuspensionReason)lookupService.getLookupInstance(SuspensionReason.class, SuspensionReason.TYPE_ID, id);
	}
	

	public static ElectiveListStatusReasonCollection getElectiveListStatusReason(LookupService lookupService) {
		ElectiveListStatusReasonCollection collection =
			(ElectiveListStatusReasonCollection) lookupService.getLookupCollection(ElectiveListStatusReason.TYPE_ID, 
				ElectiveListStatusReasonCollection.class, ElectiveListStatusReason.class);
		return collection;
	}

	public static ElectiveListStatusReason getElectiveListStatusReasonInstance(LookupService lookupService, int id) 
	{
		return (ElectiveListStatusReason)lookupService.getLookupInstance(ElectiveListStatusReason.class, ElectiveListStatusReason.TYPE_ID, id);
	}
	

	public static ERODStatusCollection getERODStatus(LookupService lookupService) {
		ERODStatusCollection collection =
			(ERODStatusCollection) lookupService.getLookupCollection(ERODStatus.TYPE_ID, 
				ERODStatusCollection.class, ERODStatus.class);
		return collection;
	}

	public static ERODStatus getERODStatusInstance(LookupService lookupService, int id) 
	{
		return (ERODStatus)lookupService.getLookupInstance(ERODStatus.class, ERODStatus.TYPE_ID, id);
	}
	

	public static TCIStatusChangeReasonCollection getTCIStatusChangeReason(LookupService lookupService) {
		TCIStatusChangeReasonCollection collection =
			(TCIStatusChangeReasonCollection) lookupService.getLookupCollection(TCIStatusChangeReason.TYPE_ID, 
				TCIStatusChangeReasonCollection.class, TCIStatusChangeReason.class);
		return collection;
	}

	public static TCIStatusChangeReason getTCIStatusChangeReasonInstance(LookupService lookupService, int id) 
	{
		return (TCIStatusChangeReason)lookupService.getLookupInstance(TCIStatusChangeReason.class, TCIStatusChangeReason.TYPE_ID, id);
	}
	

	public static ElectiveAdmissionTypeCollection getElectiveAdmissionType(LookupService lookupService) {
		ElectiveAdmissionTypeCollection collection =
			(ElectiveAdmissionTypeCollection) lookupService.getLookupCollection(ElectiveAdmissionType.TYPE_ID, 
				ElectiveAdmissionTypeCollection.class, ElectiveAdmissionType.class);
		return collection;
	}

	public static ElectiveAdmissionType getElectiveAdmissionTypeInstance(LookupService lookupService, int id) 
	{
		return (ElectiveAdmissionType)lookupService.getLookupInstance(ElectiveAdmissionType.class, ElectiveAdmissionType.TYPE_ID, id);
	}
	

	public static PlanningElectiveCollection getPlanningElective(LookupService lookupService) {
		PlanningElectiveCollection collection =
			(PlanningElectiveCollection) lookupService.getLookupCollection(PlanningElective.TYPE_ID, 
				PlanningElectiveCollection.class, PlanningElective.class);
		return collection;
	}

	public static PlanningElective getPlanningElectiveInstance(LookupService lookupService, int id) 
	{
		return (PlanningElective)lookupService.getLookupInstance(PlanningElective.class, PlanningElective.TYPE_ID, id);
	}
	

	public static ERODTypeCollection getERODType(LookupService lookupService) {
		ERODTypeCollection collection =
			(ERODTypeCollection) lookupService.getLookupCollection(ERODType.TYPE_ID, 
				ERODTypeCollection.class, ERODType.class);
		return collection;
	}

	public static ERODType getERODTypeInstance(LookupService lookupService, int id) 
	{
		return (ERODType)lookupService.getLookupInstance(ERODType.class, ERODType.TYPE_ID, id);
	}
	

	public static ReferralUrgencyCollection getReferralUrgency(LookupService lookupService) {
		ReferralUrgencyCollection collection =
			(ReferralUrgencyCollection) lookupService.getLookupCollection(ReferralUrgency.TYPE_ID, 
				ReferralUrgencyCollection.class, ReferralUrgency.class);
		return collection;
	}

	public static ReferralUrgency getReferralUrgencyInstance(LookupService lookupService, int id) 
	{
		return (ReferralUrgency)lookupService.getLookupInstance(ReferralUrgency.class, ReferralUrgency.TYPE_ID, id);
	}
	

	public static ClinicalNoteTypeForAnAppointmentCollection getClinicalNoteTypeForAnAppointment(LookupService lookupService) {
		ClinicalNoteTypeForAnAppointmentCollection collection =
			(ClinicalNoteTypeForAnAppointmentCollection) lookupService.getLookupCollection(ClinicalNoteTypeForAnAppointment.TYPE_ID, 
				ClinicalNoteTypeForAnAppointmentCollection.class, ClinicalNoteTypeForAnAppointment.class);
		return collection;
	}

	public static ClinicalNoteTypeForAnAppointment getClinicalNoteTypeForAnAppointmentInstance(LookupService lookupService, int id) 
	{
		return (ClinicalNoteTypeForAnAppointment)lookupService.getLookupInstance(ClinicalNoteTypeForAnAppointment.class, ClinicalNoteTypeForAnAppointment.TYPE_ID, id);
	}
	

	public static ServiceReferredIntoCollection getServiceReferredInto(LookupService lookupService) {
		ServiceReferredIntoCollection collection =
			(ServiceReferredIntoCollection) lookupService.getLookupCollection(ServiceReferredInto.TYPE_ID, 
				ServiceReferredIntoCollection.class, ServiceReferredInto.class);
		return collection;
	}

	public static ServiceReferredInto getServiceReferredIntoInstance(LookupService lookupService, int id) 
	{
		return (ServiceReferredInto)lookupService.getLookupInstance(ServiceReferredInto.class, ServiceReferredInto.TYPE_ID, id);
	}
	

	public static CatsReferralCategoryCollection getCatsReferralCategory(LookupService lookupService) {
		CatsReferralCategoryCollection collection =
			(CatsReferralCategoryCollection) lookupService.getLookupCollection(CatsReferralCategory.TYPE_ID, 
				CatsReferralCategoryCollection.class, CatsReferralCategory.class);
		return collection;
	}

	public static CatsReferralCategory getCatsReferralCategoryInstance(LookupService lookupService, int id) 
	{
		return (CatsReferralCategory)lookupService.getLookupInstance(CatsReferralCategory.class, CatsReferralCategory.TYPE_ID, id);
	}
	

	public static SurgicalOpFollowUpInCollection getSurgicalOpFollowUpIn(LookupService lookupService) {
		SurgicalOpFollowUpInCollection collection =
			(SurgicalOpFollowUpInCollection) lookupService.getLookupCollection(SurgicalOpFollowUpIn.TYPE_ID, 
				SurgicalOpFollowUpInCollection.class, SurgicalOpFollowUpIn.class);
		return collection;
	}

	public static SurgicalOpFollowUpIn getSurgicalOpFollowUpInInstance(LookupService lookupService, int id) 
	{
		return (SurgicalOpFollowUpIn)lookupService.getLookupInstance(SurgicalOpFollowUpIn.class, SurgicalOpFollowUpIn.TYPE_ID, id);
	}
	

	public static SurgicalOpFollowUpTypeCollection getSurgicalOpFollowUpType(LookupService lookupService) {
		SurgicalOpFollowUpTypeCollection collection =
			(SurgicalOpFollowUpTypeCollection) lookupService.getLookupCollection(SurgicalOpFollowUpType.TYPE_ID, 
				SurgicalOpFollowUpTypeCollection.class, SurgicalOpFollowUpType.class);
		return collection;
	}

	public static SurgicalOpFollowUpType getSurgicalOpFollowUpTypeInstance(LookupService lookupService, int id) 
	{
		return (SurgicalOpFollowUpType)lookupService.getLookupInstance(SurgicalOpFollowUpType.class, SurgicalOpFollowUpType.TYPE_ID, id);
	}
	

	public static ClinicalOutcomeContextCollection getClinicalOutcomeContext(LookupService lookupService) {
		ClinicalOutcomeContextCollection collection =
			(ClinicalOutcomeContextCollection) lookupService.getLookupCollection(ClinicalOutcomeContext.TYPE_ID, 
				ClinicalOutcomeContextCollection.class, ClinicalOutcomeContext.class);
		return collection;
	}

	public static ClinicalOutcomeContext getClinicalOutcomeContextInstance(LookupService lookupService, int id) 
	{
		return (ClinicalOutcomeContext)lookupService.getLookupInstance(ClinicalOutcomeContext.class, ClinicalOutcomeContext.TYPE_ID, id);
	}
	

	public static ActiveMonitoringReasonCollection getActiveMonitoringReason(LookupService lookupService) {
		ActiveMonitoringReasonCollection collection =
			(ActiveMonitoringReasonCollection) lookupService.getLookupCollection(ActiveMonitoringReason.TYPE_ID, 
				ActiveMonitoringReasonCollection.class, ActiveMonitoringReason.class);
		return collection;
	}

	public static ActiveMonitoringReason getActiveMonitoringReasonInstance(LookupService lookupService, int id) 
	{
		return (ActiveMonitoringReason)lookupService.getLookupInstance(ActiveMonitoringReason.class, ActiveMonitoringReason.TYPE_ID, id);
	}
	

	public static AwaitingClinicalInformationTypeCollection getAwaitingClinicalInformationType(LookupService lookupService) {
		AwaitingClinicalInformationTypeCollection collection =
			(AwaitingClinicalInformationTypeCollection) lookupService.getLookupCollection(AwaitingClinicalInformationType.TYPE_ID, 
				AwaitingClinicalInformationTypeCollection.class, AwaitingClinicalInformationType.class);
		return collection;
	}

	public static AwaitingClinicalInformationType getAwaitingClinicalInformationTypeInstance(LookupService lookupService, int id) 
	{
		return (AwaitingClinicalInformationType)lookupService.getLookupInstance(AwaitingClinicalInformationType.class, AwaitingClinicalInformationType.TYPE_ID, id);
	}
	

	public static SecondOpinionCategoryCollection getSecondOpinionCategory(LookupService lookupService) {
		SecondOpinionCategoryCollection collection =
			(SecondOpinionCategoryCollection) lookupService.getLookupCollection(SecondOpinionCategory.TYPE_ID, 
				SecondOpinionCategoryCollection.class, SecondOpinionCategory.class);
		return collection;
	}

	public static SecondOpinionCategory getSecondOpinionCategoryInstance(LookupService lookupService, int id) 
	{
		return (SecondOpinionCategory)lookupService.getLookupInstance(SecondOpinionCategory.class, SecondOpinionCategory.TYPE_ID, id);
	}
	

	public static DischargeToGPDetailsReviewStatusCollection getDischargeToGPDetailsReviewStatus(LookupService lookupService) {
		DischargeToGPDetailsReviewStatusCollection collection =
			(DischargeToGPDetailsReviewStatusCollection) lookupService.getLookupCollection(DischargeToGPDetailsReviewStatus.TYPE_ID, 
				DischargeToGPDetailsReviewStatusCollection.class, DischargeToGPDetailsReviewStatus.class);
		return collection;
	}

	public static DischargeToGPDetailsReviewStatus getDischargeToGPDetailsReviewStatusInstance(LookupService lookupService, int id) 
	{
		return (DischargeToGPDetailsReviewStatus)lookupService.getLookupInstance(DischargeToGPDetailsReviewStatus.class, DischargeToGPDetailsReviewStatus.TYPE_ID, id);
	}
	

	public static ReportNoteStatusCollection getReportNoteStatus(LookupService lookupService) {
		ReportNoteStatusCollection collection =
			(ReportNoteStatusCollection) lookupService.getLookupCollection(ReportNoteStatus.TYPE_ID, 
				ReportNoteStatusCollection.class, ReportNoteStatus.class);
		return collection;
	}

	public static ReportNoteStatus getReportNoteStatusInstance(LookupService lookupService, int id) 
	{
		return (ReportNoteStatus)lookupService.getLookupInstance(ReportNoteStatus.class, ReportNoteStatus.TYPE_ID, id);
	}
	

	public static ReportNoteTypeCollection getReportNoteType(LookupService lookupService) {
		ReportNoteTypeCollection collection =
			(ReportNoteTypeCollection) lookupService.getLookupCollection(ReportNoteType.TYPE_ID, 
				ReportNoteTypeCollection.class, ReportNoteType.class);
		return collection;
	}

	public static ReportNoteType getReportNoteTypeInstance(LookupService lookupService, int id) 
	{
		return (ReportNoteType)lookupService.getLookupInstance(ReportNoteType.class, ReportNoteType.TYPE_ID, id);
	}
	

	public static TLTTypeCollection getTLTType(LookupService lookupService) {
		TLTTypeCollection collection =
			(TLTTypeCollection) lookupService.getLookupCollection(TLTType.TYPE_ID, 
				TLTTypeCollection.class, TLTType.class);
		return collection;
	}

	public static TLTType getTLTTypeInstance(LookupService lookupService, int id) 
	{
		return (TLTType)lookupService.getLookupInstance(TLTType.class, TLTType.TYPE_ID, id);
	}
	

	public static ReportsRequiredSubCategoryCollection getReportsRequiredSubCategory(LookupService lookupService) {
		ReportsRequiredSubCategoryCollection collection =
			(ReportsRequiredSubCategoryCollection) lookupService.getLookupCollection(ReportsRequiredSubCategory.TYPE_ID, 
				ReportsRequiredSubCategoryCollection.class, ReportsRequiredSubCategory.class);
		return collection;
	}

	public static ReportsRequiredSubCategory getReportsRequiredSubCategoryInstance(LookupService lookupService, int id) 
	{
		return (ReportsRequiredSubCategory)lookupService.getLookupInstance(ReportsRequiredSubCategory.class, ReportsRequiredSubCategory.TYPE_ID, id);
	}
	

	public static ReasonNotSuitableForSurgeryCollection getReasonNotSuitableForSurgery(LookupService lookupService) {
		ReasonNotSuitableForSurgeryCollection collection =
			(ReasonNotSuitableForSurgeryCollection) lookupService.getLookupCollection(ReasonNotSuitableForSurgery.TYPE_ID, 
				ReasonNotSuitableForSurgeryCollection.class, ReasonNotSuitableForSurgery.class);
		return collection;
	}

	public static ReasonNotSuitableForSurgery getReasonNotSuitableForSurgeryInstance(LookupService lookupService, int id) 
	{
		return (ReasonNotSuitableForSurgery)lookupService.getLookupInstance(ReasonNotSuitableForSurgery.class, ReasonNotSuitableForSurgery.TYPE_ID, id);
	}
	

	public static ConsultationOutcomeTypeCollection getConsultationOutcomeType(LookupService lookupService) {
		ConsultationOutcomeTypeCollection collection =
			(ConsultationOutcomeTypeCollection) lookupService.getLookupCollection(ConsultationOutcomeType.TYPE_ID, 
				ConsultationOutcomeTypeCollection.class, ConsultationOutcomeType.class);
		return collection;
	}

	public static ConsultationOutcomeType getConsultationOutcomeTypeInstance(LookupService lookupService, int id) 
	{
		return (ConsultationOutcomeType)lookupService.getLookupInstance(ConsultationOutcomeType.class, ConsultationOutcomeType.TYPE_ID, id);
	}
	

	public static ReferralNoteTypeCollection getReferralNoteType(LookupService lookupService) {
		ReferralNoteTypeCollection collection =
			(ReferralNoteTypeCollection) lookupService.getLookupCollection(ReferralNoteType.TYPE_ID, 
				ReferralNoteTypeCollection.class, ReferralNoteType.class);
		return collection;
	}

	public static ReferralNoteType getReferralNoteTypeInstance(LookupService lookupService, int id) 
	{
		return (ReferralNoteType)lookupService.getLookupInstance(ReferralNoteType.class, ReferralNoteType.TYPE_ID, id);
	}
	

	public static ReportStatusCollection getReportStatus(LookupService lookupService) {
		ReportStatusCollection collection =
			(ReportStatusCollection) lookupService.getLookupCollection(ReportStatus.TYPE_ID, 
				ReportStatusCollection.class, ReportStatus.class);
		return collection;
	}

	public static ReportStatus getReportStatusInstance(LookupService lookupService, int id) 
	{
		return (ReportStatus)lookupService.getLookupInstance(ReportStatus.class, ReportStatus.TYPE_ID, id);
	}
	

	public static OnwardReferralReasonCollection getOnwardReferralReason(LookupService lookupService) {
		OnwardReferralReasonCollection collection =
			(OnwardReferralReasonCollection) lookupService.getLookupCollection(OnwardReferralReason.TYPE_ID, 
				OnwardReferralReasonCollection.class, OnwardReferralReason.class);
		return collection;
	}

	public static OnwardReferralReason getOnwardReferralReasonInstance(LookupService lookupService, int id) 
	{
		return (OnwardReferralReason)lookupService.getLookupInstance(OnwardReferralReason.class, OnwardReferralReason.TYPE_ID, id);
	}
	

	public static OnwardReferralStatusCollection getOnwardReferralStatus(LookupService lookupService) {
		OnwardReferralStatusCollection collection =
			(OnwardReferralStatusCollection) lookupService.getLookupCollection(OnwardReferralStatus.TYPE_ID, 
				OnwardReferralStatusCollection.class, OnwardReferralStatus.class);
		return collection;
	}

	public static OnwardReferralStatus getOnwardReferralStatusInstance(LookupService lookupService, int id) 
	{
		return (OnwardReferralStatus)lookupService.getLookupInstance(OnwardReferralStatus.class, OnwardReferralStatus.TYPE_ID, id);
	}
	

	public static ReviewTypeCollection getReviewType(LookupService lookupService) {
		ReviewTypeCollection collection =
			(ReviewTypeCollection) lookupService.getLookupCollection(ReviewType.TYPE_ID, 
				ReviewTypeCollection.class, ReviewType.class);
		return collection;
	}

	public static ReviewType getReviewTypeInstance(LookupService lookupService, int id) 
	{
		return (ReviewType)lookupService.getLookupInstance(ReviewType.class, ReviewType.TYPE_ID, id);
	}
	

	public static FollowupManagementTypeCollection getFollowupManagementType(LookupService lookupService) {
		FollowupManagementTypeCollection collection =
			(FollowupManagementTypeCollection) lookupService.getLookupCollection(FollowupManagementType.TYPE_ID, 
				FollowupManagementTypeCollection.class, FollowupManagementType.class);
		return collection;
	}

	public static FollowupManagementType getFollowupManagementTypeInstance(LookupService lookupService, int id) 
	{
		return (FollowupManagementType)lookupService.getLookupInstance(FollowupManagementType.class, FollowupManagementType.TYPE_ID, id);
	}
	

	public static ProviderCancellationReasonCollection getProviderCancellationReason(LookupService lookupService) {
		ProviderCancellationReasonCollection collection =
			(ProviderCancellationReasonCollection) lookupService.getLookupCollection(ProviderCancellationReason.TYPE_ID, 
				ProviderCancellationReasonCollection.class, ProviderCancellationReason.class);
		return collection;
	}

	public static ProviderCancellationReason getProviderCancellationReasonInstance(LookupService lookupService, int id) 
	{
		return (ProviderCancellationReason)lookupService.getLookupInstance(ProviderCancellationReason.class, ProviderCancellationReason.TYPE_ID, id);
	}
	

	public static DischargeOtherTypeCollection getDischargeOtherType(LookupService lookupService) {
		DischargeOtherTypeCollection collection =
			(DischargeOtherTypeCollection) lookupService.getLookupCollection(DischargeOtherType.TYPE_ID, 
				DischargeOtherTypeCollection.class, DischargeOtherType.class);
		return collection;
	}

	public static DischargeOtherType getDischargeOtherTypeInstance(LookupService lookupService, int id) 
	{
		return (DischargeOtherType)lookupService.getLookupInstance(DischargeOtherType.class, DischargeOtherType.TYPE_ID, id);
	}
	

	public static ReferralWorklistStatusCollection getReferralWorklistStatus(LookupService lookupService) {
		ReferralWorklistStatusCollection collection =
			(ReferralWorklistStatusCollection) lookupService.getLookupCollection(ReferralWorklistStatus.TYPE_ID, 
				ReferralWorklistStatusCollection.class, ReferralWorklistStatus.class);
		return collection;
	}

	public static ReferralWorklistStatus getReferralWorklistStatusInstance(LookupService lookupService, int id) 
	{
		return (ReferralWorklistStatus)lookupService.getLookupInstance(ReferralWorklistStatus.class, ReferralWorklistStatus.TYPE_ID, id);
	}
	

	public static AdditionalInvestigationAppointmentsStatusCollection getAdditionalInvestigationAppointmentsStatus(LookupService lookupService) {
		AdditionalInvestigationAppointmentsStatusCollection collection =
			(AdditionalInvestigationAppointmentsStatusCollection) lookupService.getLookupCollection(AdditionalInvestigationAppointmentsStatus.TYPE_ID, 
				AdditionalInvestigationAppointmentsStatusCollection.class, AdditionalInvestigationAppointmentsStatus.class);
		return collection;
	}

	public static AdditionalInvestigationAppointmentsStatus getAdditionalInvestigationAppointmentsStatusInstance(LookupService lookupService, int id) 
	{
		return (AdditionalInvestigationAppointmentsStatus)lookupService.getLookupInstance(AdditionalInvestigationAppointmentsStatus.class, AdditionalInvestigationAppointmentsStatus.TYPE_ID, id);
	}
	

	public static CallPurposeCollection getCallPurpose(LookupService lookupService) {
		CallPurposeCollection collection =
			(CallPurposeCollection) lookupService.getLookupCollection(CallPurpose.TYPE_ID, 
				CallPurposeCollection.class, CallPurpose.class);
		return collection;
	}

	public static CallPurpose getCallPurposeInstance(LookupService lookupService, int id) 
	{
		return (CallPurpose)lookupService.getLookupInstance(CallPurpose.class, CallPurpose.TYPE_ID, id);
	}
	

	public static AnotherConsultationApptCollection getAnotherConsultationAppt(LookupService lookupService) {
		AnotherConsultationApptCollection collection =
			(AnotherConsultationApptCollection) lookupService.getLookupCollection(AnotherConsultationAppt.TYPE_ID, 
				AnotherConsultationApptCollection.class, AnotherConsultationAppt.class);
		return collection;
	}

	public static AnotherConsultationAppt getAnotherConsultationApptInstance(LookupService lookupService, int id) 
	{
		return (AnotherConsultationAppt)lookupService.getLookupInstance(AnotherConsultationAppt.class, AnotherConsultationAppt.TYPE_ID, id);
	}
	

	public static DischargeTypeCollection getDischargeType(LookupService lookupService) {
		DischargeTypeCollection collection =
			(DischargeTypeCollection) lookupService.getLookupCollection(DischargeType.TYPE_ID, 
				DischargeTypeCollection.class, DischargeType.class);
		return collection;
	}

	public static DischargeType getDischargeTypeInstance(LookupService lookupService, int id) 
	{
		return (DischargeType)lookupService.getLookupInstance(DischargeType.class, DischargeType.TYPE_ID, id);
	}
	

	public static ICABReferralStatusCollection getICABReferralStatus(LookupService lookupService) {
		ICABReferralStatusCollection collection =
			(ICABReferralStatusCollection) lookupService.getLookupCollection(ICABReferralStatus.TYPE_ID, 
				ICABReferralStatusCollection.class, ICABReferralStatus.class);
		return collection;
	}

	public static ICABReferralStatus getICABReferralStatusInstance(LookupService lookupService, int id) 
	{
		return (ICABReferralStatus)lookupService.getLookupInstance(ICABReferralStatus.class, ICABReferralStatus.TYPE_ID, id);
	}
	

	public static RejectionReasonCollection getRejectionReason(LookupService lookupService) {
		RejectionReasonCollection collection =
			(RejectionReasonCollection) lookupService.getLookupCollection(RejectionReason.TYPE_ID, 
				RejectionReasonCollection.class, RejectionReason.class);
		return collection;
	}

	public static RejectionReason getRejectionReasonInstance(LookupService lookupService, int id) 
	{
		return (RejectionReason)lookupService.getLookupInstance(RejectionReason.class, RejectionReason.TYPE_ID, id);
	}
	

	public static ReferralApptStatusCollection getReferralApptStatus(LookupService lookupService) {
		ReferralApptStatusCollection collection =
			(ReferralApptStatusCollection) lookupService.getLookupCollection(ReferralApptStatus.TYPE_ID, 
				ReferralApptStatusCollection.class, ReferralApptStatus.class);
		return collection;
	}

	public static ReferralApptStatus getReferralApptStatusInstance(LookupService lookupService, int id) 
	{
		return (ReferralApptStatus)lookupService.getLookupInstance(ReferralApptStatus.class, ReferralApptStatus.TYPE_ID, id);
	}
	

	public static OnwardReferralRejectedByCollection getOnwardReferralRejectedBy(LookupService lookupService) {
		OnwardReferralRejectedByCollection collection =
			(OnwardReferralRejectedByCollection) lookupService.getLookupCollection(OnwardReferralRejectedBy.TYPE_ID, 
				OnwardReferralRejectedByCollection.class, OnwardReferralRejectedBy.class);
		return collection;
	}

	public static OnwardReferralRejectedBy getOnwardReferralRejectedByInstance(LookupService lookupService, int id) 
	{
		return (OnwardReferralRejectedBy)lookupService.getLookupInstance(OnwardReferralRejectedBy.class, OnwardReferralRejectedBy.TYPE_ID, id);
	}
	

	public static MedicallyIncompleteCollection getMedicallyIncomplete(LookupService lookupService) {
		MedicallyIncompleteCollection collection =
			(MedicallyIncompleteCollection) lookupService.getLookupCollection(MedicallyIncomplete.TYPE_ID, 
				MedicallyIncompleteCollection.class, MedicallyIncomplete.class);
		return collection;
	}

	public static MedicallyIncomplete getMedicallyIncompleteInstance(LookupService lookupService, int id) 
	{
		return (MedicallyIncomplete)lookupService.getLookupInstance(MedicallyIncomplete.class, MedicallyIncomplete.TYPE_ID, id);
	}
	
}



