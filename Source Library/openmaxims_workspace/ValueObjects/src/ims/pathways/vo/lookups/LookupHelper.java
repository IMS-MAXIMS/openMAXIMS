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
package ims.pathways.vo.lookups;

import ims.domain.lookups.LookupService;

/**
 * This is a generated interface.
 * Provides methods to get the ValueObject Lookup types of this namespace.
 * 
 */
public final class LookupHelper {
	public static NoValidationReasonCollection getNoValidationReason(LookupService lookupService) {
		NoValidationReasonCollection collection =
			(NoValidationReasonCollection) lookupService.getLookupCollection(NoValidationReason.TYPE_ID, 
				NoValidationReasonCollection.class, NoValidationReason.class);
		return collection;
	}

	public static NoValidationReason getNoValidationReasonInstance(LookupService lookupService, int id) 
	{
		return (NoValidationReason)lookupService.getLookupInstance(NoValidationReason.class, NoValidationReason.TYPE_ID, id);
	}
	

	public static AdminEventOutcomeCollection getAdminEventOutcome(LookupService lookupService) {
		AdminEventOutcomeCollection collection =
			(AdminEventOutcomeCollection) lookupService.getLookupCollection(AdminEventOutcome.TYPE_ID, 
				AdminEventOutcomeCollection.class, AdminEventOutcome.class);
		return collection;
	}

	public static AdminEventOutcome getAdminEventOutcomeInstance(LookupService lookupService, int id) 
	{
		return (AdminEventOutcome)lookupService.getLookupInstance(AdminEventOutcome.class, AdminEventOutcome.TYPE_ID, id);
	}
	

	public static TargetReadjustmentCollection getTargetReadjustment(LookupService lookupService) {
		TargetReadjustmentCollection collection =
			(TargetReadjustmentCollection) lookupService.getLookupCollection(TargetReadjustment.TYPE_ID, 
				TargetReadjustmentCollection.class, TargetReadjustment.class);
		return collection;
	}

	public static TargetReadjustment getTargetReadjustmentInstance(LookupService lookupService, int id) 
	{
		return (TargetReadjustment)lookupService.getLookupInstance(TargetReadjustment.class, TargetReadjustment.TYPE_ID, id);
	}
	

	public static TargetDateCalculationCollection getTargetDateCalculation(LookupService lookupService) {
		TargetDateCalculationCollection collection =
			(TargetDateCalculationCollection) lookupService.getLookupCollection(TargetDateCalculation.TYPE_ID, 
				TargetDateCalculationCollection.class, TargetDateCalculation.class);
		return collection;
	}

	public static TargetDateCalculation getTargetDateCalculationInstance(LookupService lookupService, int id) 
	{
		return (TargetDateCalculation)lookupService.getLookupInstance(TargetDateCalculation.class, TargetDateCalculation.TYPE_ID, id);
	}
	

	public static JourneyCountTypeCollection getJourneyCountType(LookupService lookupService) {
		JourneyCountTypeCollection collection =
			(JourneyCountTypeCollection) lookupService.getLookupCollection(JourneyCountType.TYPE_ID, 
				JourneyCountTypeCollection.class, JourneyCountType.class);
		return collection;
	}

	public static JourneyCountType getJourneyCountTypeInstance(LookupService lookupService, int id) 
	{
		return (JourneyCountType)lookupService.getLookupInstance(JourneyCountType.class, JourneyCountType.TYPE_ID, id);
	}
	

	public static BreachManagementCollection getBreachManagement(LookupService lookupService) {
		BreachManagementCollection collection =
			(BreachManagementCollection) lookupService.getLookupCollection(BreachManagement.TYPE_ID, 
				BreachManagementCollection.class, BreachManagement.class);
		return collection;
	}

	public static BreachManagement getBreachManagementInstance(LookupService lookupService, int id) 
	{
		return (BreachManagement)lookupService.getLookupInstance(BreachManagement.class, BreachManagement.TYPE_ID, id);
	}
	

	public static EventCreationTypeCollection getEventCreationType(LookupService lookupService) {
		EventCreationTypeCollection collection =
			(EventCreationTypeCollection) lookupService.getLookupCollection(EventCreationType.TYPE_ID, 
				EventCreationTypeCollection.class, EventCreationType.class);
		return collection;
	}

	public static EventCreationType getEventCreationTypeInstance(LookupService lookupService, int id) 
	{
		return (EventCreationType)lookupService.getLookupInstance(EventCreationType.class, EventCreationType.TYPE_ID, id);
	}
	

	public static EventStatusCollection getEventStatus(LookupService lookupService) {
		EventStatusCollection collection =
			(EventStatusCollection) lookupService.getLookupCollection(EventStatus.TYPE_ID, 
				EventStatusCollection.class, EventStatus.class);
		return collection;
	}

	public static EventStatus getEventStatusInstance(LookupService lookupService, int id) 
	{
		return (EventStatus)lookupService.getLookupInstance(EventStatus.class, EventStatus.TYPE_ID, id);
	}
	

	public static JourneyStatusCollection getJourneyStatus(LookupService lookupService) {
		JourneyStatusCollection collection =
			(JourneyStatusCollection) lookupService.getLookupCollection(JourneyStatus.TYPE_ID, 
				JourneyStatusCollection.class, JourneyStatus.class);
		return collection;
	}

	public static JourneyStatus getJourneyStatusInstance(LookupService lookupService, int id) 
	{
		return (JourneyStatus)lookupService.getLookupInstance(JourneyStatus.class, JourneyStatus.TYPE_ID, id);
	}
	

	public static EventLinkTypeCollection getEventLinkType(LookupService lookupService) {
		EventLinkTypeCollection collection =
			(EventLinkTypeCollection) lookupService.getLookupCollection(EventLinkType.TYPE_ID, 
				EventLinkTypeCollection.class, EventLinkType.class);
		return collection;
	}

	public static EventLinkType getEventLinkTypeInstance(LookupService lookupService, int id) 
	{
		return (EventLinkType)lookupService.getLookupInstance(EventLinkType.class, EventLinkType.TYPE_ID, id);
	}
	

	public static PathwaysDetailCollection getPathwaysDetail(LookupService lookupService) {
		PathwaysDetailCollection collection =
			(PathwaysDetailCollection) lookupService.getLookupCollection(PathwaysDetail.TYPE_ID, 
				PathwaysDetailCollection.class, PathwaysDetail.class);
		return collection;
	}

	public static PathwaysDetail getPathwaysDetailInstance(LookupService lookupService, int id) 
	{
		return (PathwaysDetail)lookupService.getLookupInstance(PathwaysDetail.class, PathwaysDetail.TYPE_ID, id);
	}
	

	public static PatientTargetStatusCollection getPatientTargetStatus(LookupService lookupService) {
		PatientTargetStatusCollection collection =
			(PatientTargetStatusCollection) lookupService.getLookupCollection(PatientTargetStatus.TYPE_ID, 
				PatientTargetStatusCollection.class, PatientTargetStatus.class);
		return collection;
	}

	public static PatientTargetStatus getPatientTargetStatusInstance(LookupService lookupService, int id) 
	{
		return (PatientTargetStatus)lookupService.getLookupInstance(PatientTargetStatus.class, PatientTargetStatus.TYPE_ID, id);
	}
	

	public static RTTActionCollection getRTTAction(LookupService lookupService) {
		RTTActionCollection collection =
			(RTTActionCollection) lookupService.getLookupCollection(RTTAction.TYPE_ID, 
				RTTActionCollection.class, RTTAction.class);
		return collection;
	}

	public static RTTAction getRTTActionInstance(LookupService lookupService, int id) 
	{
		return (RTTAction)lookupService.getLookupInstance(RTTAction.class, RTTAction.TYPE_ID, id);
	}
	

	public static RTTStatusUpdateReasonCollection getRTTStatusUpdateReason(LookupService lookupService) {
		RTTStatusUpdateReasonCollection collection =
			(RTTStatusUpdateReasonCollection) lookupService.getLookupCollection(RTTStatusUpdateReason.TYPE_ID, 
				RTTStatusUpdateReasonCollection.class, RTTStatusUpdateReason.class);
		return collection;
	}

	public static RTTStatusUpdateReason getRTTStatusUpdateReasonInstance(LookupService lookupService, int id) 
	{
		return (RTTStatusUpdateReason)lookupService.getLookupInstance(RTTStatusUpdateReason.class, RTTStatusUpdateReason.TYPE_ID, id);
	}
	

	public static PatientJourneyBreachReasonCollection getPatientJourneyBreachReason(LookupService lookupService) {
		PatientJourneyBreachReasonCollection collection =
			(PatientJourneyBreachReasonCollection) lookupService.getLookupCollection(PatientJourneyBreachReason.TYPE_ID, 
				PatientJourneyBreachReasonCollection.class, PatientJourneyBreachReason.class);
		return collection;
	}

	public static PatientJourneyBreachReason getPatientJourneyBreachReasonInstance(LookupService lookupService, int id) 
	{
		return (PatientJourneyBreachReason)lookupService.getLookupInstance(PatientJourneyBreachReason.class, PatientJourneyBreachReason.TYPE_ID, id);
	}
	

	public static CommentLevelCollection getCommentLevel(LookupService lookupService) {
		CommentLevelCollection collection =
			(CommentLevelCollection) lookupService.getLookupCollection(CommentLevel.TYPE_ID, 
				CommentLevelCollection.class, CommentLevel.class);
		return collection;
	}

	public static CommentLevel getCommentLevelInstance(LookupService lookupService, int id) 
	{
		return (CommentLevel)lookupService.getLookupInstance(CommentLevel.class, CommentLevel.TYPE_ID, id);
	}
	

	public static RTTClockImpactSourceCollection getRTTClockImpactSource(LookupService lookupService) {
		RTTClockImpactSourceCollection collection =
			(RTTClockImpactSourceCollection) lookupService.getLookupCollection(RTTClockImpactSource.TYPE_ID, 
				RTTClockImpactSourceCollection.class, RTTClockImpactSource.class);
		return collection;
	}

	public static RTTClockImpactSource getRTTClockImpactSourceInstance(LookupService lookupService, int id) 
	{
		return (RTTClockImpactSource)lookupService.getLookupInstance(RTTClockImpactSource.class, RTTClockImpactSource.TYPE_ID, id);
	}
	

	public static PathwaysGroupCollection getPathwaysGroup(LookupService lookupService) {
		PathwaysGroupCollection collection =
			(PathwaysGroupCollection) lookupService.getLookupCollection(PathwaysGroup.TYPE_ID, 
				PathwaysGroupCollection.class, PathwaysGroup.class);
		return collection;
	}

	public static PathwaysGroup getPathwaysGroupInstance(LookupService lookupService, int id) 
	{
		return (PathwaysGroup)lookupService.getLookupInstance(PathwaysGroup.class, PathwaysGroup.TYPE_ID, id);
	}
	

	public static RTTClockStateCollection getRTTClockState(LookupService lookupService) {
		RTTClockStateCollection collection =
			(RTTClockStateCollection) lookupService.getLookupCollection(RTTClockState.TYPE_ID, 
				RTTClockStateCollection.class, RTTClockState.class);
		return collection;
	}

	public static RTTClockState getRTTClockStateInstance(LookupService lookupService, int id) 
	{
		return (RTTClockState)lookupService.getLookupInstance(RTTClockState.class, RTTClockState.TYPE_ID, id);
	}
	

	public static AdminEventOutcomeReasonCollection getAdminEventOutcomeReason(LookupService lookupService) {
		AdminEventOutcomeReasonCollection collection =
			(AdminEventOutcomeReasonCollection) lookupService.getLookupCollection(AdminEventOutcomeReason.TYPE_ID, 
				AdminEventOutcomeReasonCollection.class, AdminEventOutcomeReason.class);
		return collection;
	}

	public static AdminEventOutcomeReason getAdminEventOutcomeReasonInstance(LookupService lookupService, int id) 
	{
		return (AdminEventOutcomeReason)lookupService.getLookupInstance(AdminEventOutcomeReason.class, AdminEventOutcomeReason.TYPE_ID, id);
	}
	

	public static EventEncounterTypeCollection getEventEncounterType(LookupService lookupService) {
		EventEncounterTypeCollection collection =
			(EventEncounterTypeCollection) lookupService.getLookupCollection(EventEncounterType.TYPE_ID, 
				EventEncounterTypeCollection.class, EventEncounterType.class);
		return collection;
	}

	public static EventEncounterType getEventEncounterTypeInstance(LookupService lookupService, int id) 
	{
		return (EventEncounterType)lookupService.getLookupInstance(EventEncounterType.class, EventEncounterType.TYPE_ID, id);
	}
	
}



