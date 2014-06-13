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
package ims.emergency.vo.lookups;

import ims.domain.lookups.LookupService;

/**
 * This is a generated interface.
 * Provides methods to get the ValueObject Lookup types of this namespace.
 * 
 */
public final class LookupHelper {
	public static ElectiveListReasonCollection getElectiveListReason(LookupService lookupService) {
		ElectiveListReasonCollection collection =
			(ElectiveListReasonCollection) lookupService.getLookupCollection(ElectiveListReason.TYPE_ID, 
				ElectiveListReasonCollection.class, ElectiveListReason.class);
		return collection;
	}

	public static ElectiveListReason getElectiveListReasonInstance(LookupService lookupService, int id) 
	{
		return (ElectiveListReason)lookupService.getLookupInstance(ElectiveListReason.class, ElectiveListReason.TYPE_ID, id);
	}
	

	public static AllocationStatusCollection getAllocationStatus(LookupService lookupService) {
		AllocationStatusCollection collection =
			(AllocationStatusCollection) lookupService.getLookupCollection(AllocationStatus.TYPE_ID, 
				AllocationStatusCollection.class, AllocationStatus.class);
		return collection;
	}

	public static AllocationStatus getAllocationStatusInstance(LookupService lookupService, int id) 
	{
		return (AllocationStatus)lookupService.getLookupInstance(AllocationStatus.class, AllocationStatus.TYPE_ID, id);
	}
	

	public static AllocatedBedTypeCollection getAllocatedBedType(LookupService lookupService) {
		AllocatedBedTypeCollection collection =
			(AllocatedBedTypeCollection) lookupService.getLookupCollection(AllocatedBedType.TYPE_ID, 
				AllocatedBedTypeCollection.class, AllocatedBedType.class);
		return collection;
	}

	public static AllocatedBedType getAllocatedBedTypeInstance(LookupService lookupService, int id) 
	{
		return (AllocatedBedType)lookupService.getLookupInstance(AllocatedBedType.class, AllocatedBedType.TYPE_ID, id);
	}
	

	public static PatientAttendanceStatusCollection getPatientAttendanceStatus(LookupService lookupService) {
		PatientAttendanceStatusCollection collection =
			(PatientAttendanceStatusCollection) lookupService.getLookupCollection(PatientAttendanceStatus.TYPE_ID, 
				PatientAttendanceStatusCollection.class, PatientAttendanceStatus.class);
		return collection;
	}

	public static PatientAttendanceStatus getPatientAttendanceStatusInstance(LookupService lookupService, int id) 
	{
		return (PatientAttendanceStatus)lookupService.getLookupInstance(PatientAttendanceStatus.class, PatientAttendanceStatus.TYPE_ID, id);
	}
	

	public static TransferToHospitalCollection getTransferToHospital(LookupService lookupService) {
		TransferToHospitalCollection collection =
			(TransferToHospitalCollection) lookupService.getLookupCollection(TransferToHospital.TYPE_ID, 
				TransferToHospitalCollection.class, TransferToHospital.class);
		return collection;
	}

	public static TransferToHospital getTransferToHospitalInstance(LookupService lookupService, int id) 
	{
		return (TransferToHospital)lookupService.getLookupInstance(TransferToHospital.class, TransferToHospital.TYPE_ID, id);
	}
	

	public static HCGResultsCollection getHCGResults(LookupService lookupService) {
		HCGResultsCollection collection =
			(HCGResultsCollection) lookupService.getLookupCollection(HCGResults.TYPE_ID, 
				HCGResultsCollection.class, HCGResults.class);
		return collection;
	}

	public static HCGResults getHCGResultsInstance(LookupService lookupService, int id) 
	{
		return (HCGResults)lookupService.getLookupInstance(HCGResults.class, HCGResults.TYPE_ID, id);
	}
	

	public static DrugToxicologyTypeCollection getDrugToxicologyType(LookupService lookupService) {
		DrugToxicologyTypeCollection collection =
			(DrugToxicologyTypeCollection) lookupService.getLookupCollection(DrugToxicologyType.TYPE_ID, 
				DrugToxicologyTypeCollection.class, DrugToxicologyType.class);
		return collection;
	}

	public static DrugToxicologyType getDrugToxicologyTypeInstance(LookupService lookupService, int id) 
	{
		return (DrugToxicologyType)lookupService.getLookupInstance(DrugToxicologyType.class, DrugToxicologyType.TYPE_ID, id);
	}
	

	public static DepartmentTypeCollection getDepartmentType(LookupService lookupService) {
		DepartmentTypeCollection collection =
			(DepartmentTypeCollection) lookupService.getLookupCollection(DepartmentType.TYPE_ID, 
				DepartmentTypeCollection.class, DepartmentType.class);
		return collection;
	}

	public static DepartmentType getDepartmentTypeInstance(LookupService lookupService, int id) 
	{
		return (DepartmentType)lookupService.getLookupInstance(DepartmentType.class, DepartmentType.TYPE_ID, id);
	}
	

	public static AreaTypeCollection getAreaType(LookupService lookupService) {
		AreaTypeCollection collection =
			(AreaTypeCollection) lookupService.getLookupCollection(AreaType.TYPE_ID, 
				AreaTypeCollection.class, AreaType.class);
		return collection;
	}

	public static AreaType getAreaTypeInstance(LookupService lookupService, int id) 
	{
		return (AreaType)lookupService.getLookupInstance(AreaType.class, AreaType.TYPE_ID, id);
	}
	

	public static PoliceStationCollection getPoliceStation(LookupService lookupService) {
		PoliceStationCollection collection =
			(PoliceStationCollection) lookupService.getLookupCollection(PoliceStation.TYPE_ID, 
				PoliceStationCollection.class, PoliceStation.class);
		return collection;
	}

	public static PoliceStation getPoliceStationInstance(LookupService lookupService, int id) 
	{
		return (PoliceStation)lookupService.getLookupInstance(PoliceStation.class, PoliceStation.TYPE_ID, id);
	}
	

	public static PatientPreviouslyAssaultedByAttackerCollection getPatientPreviouslyAssaultedByAttacker(LookupService lookupService) {
		PatientPreviouslyAssaultedByAttackerCollection collection =
			(PatientPreviouslyAssaultedByAttackerCollection) lookupService.getLookupCollection(PatientPreviouslyAssaultedByAttacker.TYPE_ID, 
				PatientPreviouslyAssaultedByAttackerCollection.class, PatientPreviouslyAssaultedByAttacker.class);
		return collection;
	}

	public static PatientPreviouslyAssaultedByAttacker getPatientPreviouslyAssaultedByAttackerInstance(LookupService lookupService, int id) 
	{
		return (PatientPreviouslyAssaultedByAttacker)lookupService.getLookupInstance(PatientPreviouslyAssaultedByAttacker.class, PatientPreviouslyAssaultedByAttacker.TYPE_ID, id);
	}
	

	public static GenderofAttackerCollection getGenderofAttacker(LookupService lookupService) {
		GenderofAttackerCollection collection =
			(GenderofAttackerCollection) lookupService.getLookupCollection(GenderofAttacker.TYPE_ID, 
				GenderofAttackerCollection.class, GenderofAttacker.class);
		return collection;
	}

	public static GenderofAttacker getGenderofAttackerInstance(LookupService lookupService, int id) 
	{
		return (GenderofAttacker)lookupService.getLookupInstance(GenderofAttacker.class, GenderofAttacker.TYPE_ID, id);
	}
	

	public static AssaultWeaponCollection getAssaultWeapon(LookupService lookupService) {
		AssaultWeaponCollection collection =
			(AssaultWeaponCollection) lookupService.getLookupCollection(AssaultWeapon.TYPE_ID, 
				AssaultWeaponCollection.class, AssaultWeapon.class);
		return collection;
	}

	public static AssaultWeapon getAssaultWeaponInstance(LookupService lookupService, int id) 
	{
		return (AssaultWeapon)lookupService.getLookupInstance(AssaultWeapon.class, AssaultWeapon.TYPE_ID, id);
	}
	

	public static AssaultLocationCollection getAssaultLocation(LookupService lookupService) {
		AssaultLocationCollection collection =
			(AssaultLocationCollection) lookupService.getLookupCollection(AssaultLocation.TYPE_ID, 
				AssaultLocationCollection.class, AssaultLocation.class);
		return collection;
	}

	public static AssaultLocation getAssaultLocationInstance(LookupService lookupService, int id) 
	{
		return (AssaultLocation)lookupService.getLookupInstance(AssaultLocation.class, AssaultLocation.TYPE_ID, id);
	}
	

	public static ConsumedAlcoholThreeHoursPriorToIncidentCollection getConsumedAlcoholThreeHoursPriorToIncident(LookupService lookupService) {
		ConsumedAlcoholThreeHoursPriorToIncidentCollection collection =
			(ConsumedAlcoholThreeHoursPriorToIncidentCollection) lookupService.getLookupCollection(ConsumedAlcoholThreeHoursPriorToIncident.TYPE_ID, 
				ConsumedAlcoholThreeHoursPriorToIncidentCollection.class, ConsumedAlcoholThreeHoursPriorToIncident.class);
		return collection;
	}

	public static ConsumedAlcoholThreeHoursPriorToIncident getConsumedAlcoholThreeHoursPriorToIncidentInstance(LookupService lookupService, int id) 
	{
		return (ConsumedAlcoholThreeHoursPriorToIncident)lookupService.getLookupInstance(ConsumedAlcoholThreeHoursPriorToIncident.class, ConsumedAlcoholThreeHoursPriorToIncident.TYPE_ID, id);
	}
	

	public static TriagePriorityCollection getTriagePriority(LookupService lookupService) {
		TriagePriorityCollection collection =
			(TriagePriorityCollection) lookupService.getLookupCollection(TriagePriority.TYPE_ID, 
				TriagePriorityCollection.class, TriagePriority.class);
		return collection;
	}

	public static TriagePriority getTriagePriorityInstance(LookupService lookupService, int id) 
	{
		return (TriagePriority)lookupService.getLookupInstance(TriagePriority.class, TriagePriority.TYPE_ID, id);
	}
	

	public static CubicleCollection getCubicle(LookupService lookupService) {
		CubicleCollection collection =
			(CubicleCollection) lookupService.getLookupCollection(Cubicle.TYPE_ID, 
				CubicleCollection.class, Cubicle.class);
		return collection;
	}

	public static Cubicle getCubicleInstance(LookupService lookupService, int id) 
	{
		return (Cubicle)lookupService.getLookupInstance(Cubicle.class, Cubicle.TYPE_ID, id);
	}
	

	public static TrackingAreaColumnCollection getTrackingAreaColumn(LookupService lookupService) {
		TrackingAreaColumnCollection collection =
			(TrackingAreaColumnCollection) lookupService.getLookupCollection(TrackingAreaColumn.TYPE_ID, 
				TrackingAreaColumnCollection.class, TrackingAreaColumn.class);
		return collection;
	}

	public static TrackingAreaColumn getTrackingAreaColumnInstance(LookupService lookupService, int id) 
	{
		return (TrackingAreaColumn)lookupService.getLookupInstance(TrackingAreaColumn.class, TrackingAreaColumn.TYPE_ID, id);
	}
	

	public static EmergencyDeptTypeCollection getEmergencyDeptType(LookupService lookupService) {
		EmergencyDeptTypeCollection collection =
			(EmergencyDeptTypeCollection) lookupService.getLookupCollection(EmergencyDeptType.TYPE_ID, 
				EmergencyDeptTypeCollection.class, EmergencyDeptType.class);
		return collection;
	}

	public static EmergencyDeptType getEmergencyDeptTypeInstance(LookupService lookupService, int id) 
	{
		return (EmergencyDeptType)lookupService.getLookupInstance(EmergencyDeptType.class, EmergencyDeptType.TYPE_ID, id);
	}
	

	public static AttendanceTypeCollection getAttendanceType(LookupService lookupService) {
		AttendanceTypeCollection collection =
			(AttendanceTypeCollection) lookupService.getLookupCollection(AttendanceType.TYPE_ID, 
				AttendanceTypeCollection.class, AttendanceType.class);
		return collection;
	}

	public static AttendanceType getAttendanceTypeInstance(LookupService lookupService, int id) 
	{
		return (AttendanceType)lookupService.getLookupInstance(AttendanceType.class, AttendanceType.TYPE_ID, id);
	}
	

	public static RTAPatientTypeCollection getRTAPatientType(LookupService lookupService) {
		RTAPatientTypeCollection collection =
			(RTAPatientTypeCollection) lookupService.getLookupCollection(RTAPatientType.TYPE_ID, 
				RTAPatientTypeCollection.class, RTAPatientType.class);
		return collection;
	}

	public static RTAPatientType getRTAPatientTypeInstance(LookupService lookupService, int id) 
	{
		return (RTAPatientType)lookupService.getLookupInstance(RTAPatientType.class, RTAPatientType.TYPE_ID, id);
	}
	

	public static ElapsedInjuryPeriodCollection getElapsedInjuryPeriod(LookupService lookupService) {
		ElapsedInjuryPeriodCollection collection =
			(ElapsedInjuryPeriodCollection) lookupService.getLookupCollection(ElapsedInjuryPeriod.TYPE_ID, 
				ElapsedInjuryPeriodCollection.class, ElapsedInjuryPeriod.class);
		return collection;
	}

	public static ElapsedInjuryPeriod getElapsedInjuryPeriodInstance(LookupService lookupService, int id) 
	{
		return (ElapsedInjuryPeriod)lookupService.getLookupInstance(ElapsedInjuryPeriod.class, ElapsedInjuryPeriod.TYPE_ID, id);
	}
	

	public static PoliceInformedCollection getPoliceInformed(LookupService lookupService) {
		PoliceInformedCollection collection =
			(PoliceInformedCollection) lookupService.getLookupCollection(PoliceInformed.TYPE_ID, 
				PoliceInformedCollection.class, PoliceInformed.class);
		return collection;
	}

	public static PoliceInformed getPoliceInformedInstance(LookupService lookupService, int id) 
	{
		return (PoliceInformed)lookupService.getLookupInstance(PoliceInformed.class, PoliceInformed.TYPE_ID, id);
	}
	

	public static ConsumedOrPurchasedAlcoholFromCollection getConsumedOrPurchasedAlcoholFrom(LookupService lookupService) {
		ConsumedOrPurchasedAlcoholFromCollection collection =
			(ConsumedOrPurchasedAlcoholFromCollection) lookupService.getLookupCollection(ConsumedOrPurchasedAlcoholFrom.TYPE_ID, 
				ConsumedOrPurchasedAlcoholFromCollection.class, ConsumedOrPurchasedAlcoholFrom.class);
		return collection;
	}

	public static ConsumedOrPurchasedAlcoholFrom getConsumedOrPurchasedAlcoholFromInstance(LookupService lookupService, int id) 
	{
		return (ConsumedOrPurchasedAlcoholFrom)lookupService.getLookupInstance(ConsumedOrPurchasedAlcoholFrom.class, ConsumedOrPurchasedAlcoholFrom.TYPE_ID, id);
	}
	

	public static PresentingComplaintCollection getPresentingComplaint(LookupService lookupService) {
		PresentingComplaintCollection collection =
			(PresentingComplaintCollection) lookupService.getLookupCollection(PresentingComplaint.TYPE_ID, 
				PresentingComplaintCollection.class, PresentingComplaint.class);
		return collection;
	}

	public static PresentingComplaint getPresentingComplaintInstance(LookupService lookupService, int id) 
	{
		return (PresentingComplaint)lookupService.getLookupInstance(PresentingComplaint.class, PresentingComplaint.TYPE_ID, id);
	}
	

	public static DTAAdmissionTypeCollection getDTAAdmissionType(LookupService lookupService) {
		DTAAdmissionTypeCollection collection =
			(DTAAdmissionTypeCollection) lookupService.getLookupCollection(DTAAdmissionType.TYPE_ID, 
				DTAAdmissionTypeCollection.class, DTAAdmissionType.class);
		return collection;
	}

	public static DTAAdmissionType getDTAAdmissionTypeInstance(LookupService lookupService, int id) 
	{
		return (DTAAdmissionType)lookupService.getLookupInstance(DTAAdmissionType.class, DTAAdmissionType.TYPE_ID, id);
	}
	

	public static TransferEscortCollection getTransferEscort(LookupService lookupService) {
		TransferEscortCollection collection =
			(TransferEscortCollection) lookupService.getLookupCollection(TransferEscort.TYPE_ID, 
				TransferEscortCollection.class, TransferEscort.class);
		return collection;
	}

	public static TransferEscort getTransferEscortInstance(LookupService lookupService, int id) 
	{
		return (TransferEscort)lookupService.getLookupInstance(TransferEscort.class, TransferEscort.TYPE_ID, id);
	}
	

	public static AttendanceReqContractingStatusCollection getAttendanceReqContractingStatus(LookupService lookupService) {
		AttendanceReqContractingStatusCollection collection =
			(AttendanceReqContractingStatusCollection) lookupService.getLookupCollection(AttendanceReqContractingStatus.TYPE_ID, 
				AttendanceReqContractingStatusCollection.class, AttendanceReqContractingStatus.class);
		return collection;
	}

	public static AttendanceReqContractingStatus getAttendanceReqContractingStatusInstance(LookupService lookupService, int id) 
	{
		return (AttendanceReqContractingStatus)lookupService.getLookupInstance(AttendanceReqContractingStatus.class, AttendanceReqContractingStatus.TYPE_ID, id);
	}
	

	public static ReasonForBreachCollection getReasonForBreach(LookupService lookupService) {
		ReasonForBreachCollection collection =
			(ReasonForBreachCollection) lookupService.getLookupCollection(ReasonForBreach.TYPE_ID, 
				ReasonForBreachCollection.class, ReasonForBreach.class);
		return collection;
	}

	public static ReasonForBreach getReasonForBreachInstance(LookupService lookupService, int id) 
	{
		return (ReasonForBreach)lookupService.getLookupInstance(ReasonForBreach.class, ReasonForBreach.TYPE_ID, id);
	}
	

	public static DischargequipmentCollection getDischargequipment(LookupService lookupService) {
		DischargequipmentCollection collection =
			(DischargequipmentCollection) lookupService.getLookupCollection(Dischargequipment.TYPE_ID, 
				DischargequipmentCollection.class, Dischargequipment.class);
		return collection;
	}

	public static Dischargequipment getDischargequipmentInstance(LookupService lookupService, int id) 
	{
		return (Dischargequipment)lookupService.getLookupInstance(Dischargequipment.class, Dischargequipment.TYPE_ID, id);
	}
	

	public static AttendenceInvestigationCollection getAttendenceInvestigation(LookupService lookupService) {
		AttendenceInvestigationCollection collection =
			(AttendenceInvestigationCollection) lookupService.getLookupCollection(AttendenceInvestigation.TYPE_ID, 
				AttendenceInvestigationCollection.class, AttendenceInvestigation.class);
		return collection;
	}

	public static AttendenceInvestigation getAttendenceInvestigationInstance(LookupService lookupService, int id) 
	{
		return (AttendenceInvestigation)lookupService.getLookupInstance(AttendenceInvestigation.class, AttendenceInvestigation.TYPE_ID, id);
	}
	

	public static AttendanceClinicalNoteTypeCollection getAttendanceClinicalNoteType(LookupService lookupService) {
		AttendanceClinicalNoteTypeCollection collection =
			(AttendanceClinicalNoteTypeCollection) lookupService.getLookupCollection(AttendanceClinicalNoteType.TYPE_ID, 
				AttendanceClinicalNoteTypeCollection.class, AttendanceClinicalNoteType.class);
		return collection;
	}

	public static AttendanceClinicalNoteType getAttendanceClinicalNoteTypeInstance(LookupService lookupService, int id) 
	{
		return (AttendanceClinicalNoteType)lookupService.getLookupInstance(AttendanceClinicalNoteType.class, AttendanceClinicalNoteType.TYPE_ID, id);
	}
	

	public static ExemptionReasonCollection getExemptionReason(LookupService lookupService) {
		ExemptionReasonCollection collection =
			(ExemptionReasonCollection) lookupService.getLookupCollection(ExemptionReason.TYPE_ID, 
				ExemptionReasonCollection.class, ExemptionReason.class);
		return collection;
	}

	public static ExemptionReason getExemptionReasonInstance(LookupService lookupService, int id) 
	{
		return (ExemptionReason)lookupService.getLookupInstance(ExemptionReason.class, ExemptionReason.TYPE_ID, id);
	}
	

	public static EDConsultantCollection getEDConsultant(LookupService lookupService) {
		EDConsultantCollection collection =
			(EDConsultantCollection) lookupService.getLookupCollection(EDConsultant.TYPE_ID, 
				EDConsultantCollection.class, EDConsultant.class);
		return collection;
	}

	public static EDConsultant getEDConsultantInstance(LookupService lookupService, int id) 
	{
		return (EDConsultant)lookupService.getLookupInstance(EDConsultant.class, EDConsultant.TYPE_ID, id);
	}
	

	public static EDVisitTypeCollection getEDVisitType(LookupService lookupService) {
		EDVisitTypeCollection collection =
			(EDVisitTypeCollection) lookupService.getLookupCollection(EDVisitType.TYPE_ID, 
				EDVisitTypeCollection.class, EDVisitType.class);
		return collection;
	}

	public static EDVisitType getEDVisitTypeInstance(LookupService lookupService, int id) 
	{
		return (EDVisitType)lookupService.getLookupInstance(EDVisitType.class, EDVisitType.TYPE_ID, id);
	}
	

	public static DrugToxicologyResultCollection getDrugToxicologyResult(LookupService lookupService) {
		DrugToxicologyResultCollection collection =
			(DrugToxicologyResultCollection) lookupService.getLookupCollection(DrugToxicologyResult.TYPE_ID, 
				DrugToxicologyResultCollection.class, DrugToxicologyResult.class);
		return collection;
	}

	public static DrugToxicologyResult getDrugToxicologyResultInstance(LookupService lookupService, int id) 
	{
		return (DrugToxicologyResult)lookupService.getLookupInstance(DrugToxicologyResult.class, DrugToxicologyResult.TYPE_ID, id);
	}
	

	public static QuickRegistrationTypeCollection getQuickRegistrationType(LookupService lookupService) {
		QuickRegistrationTypeCollection collection =
			(QuickRegistrationTypeCollection) lookupService.getLookupCollection(QuickRegistrationType.TYPE_ID, 
				QuickRegistrationTypeCollection.class, QuickRegistrationType.class);
		return collection;
	}

	public static QuickRegistrationType getQuickRegistrationTypeInstance(LookupService lookupService, int id) 
	{
		return (QuickRegistrationType)lookupService.getLookupInstance(QuickRegistrationType.class, QuickRegistrationType.TYPE_ID, id);
	}
	

	public static UrgencyLevelCollection getUrgencyLevel(LookupService lookupService) {
		UrgencyLevelCollection collection =
			(UrgencyLevelCollection) lookupService.getLookupCollection(UrgencyLevel.TYPE_ID, 
				UrgencyLevelCollection.class, UrgencyLevel.class);
		return collection;
	}

	public static UrgencyLevel getUrgencyLevelInstance(LookupService lookupService, int id) 
	{
		return (UrgencyLevel)lookupService.getLookupInstance(UrgencyLevel.class, UrgencyLevel.TYPE_ID, id);
	}
	

	public static NumberOfAttackersCollection getNumberOfAttackers(LookupService lookupService) {
		NumberOfAttackersCollection collection =
			(NumberOfAttackersCollection) lookupService.getLookupCollection(NumberOfAttackers.TYPE_ID, 
				NumberOfAttackersCollection.class, NumberOfAttackers.class);
		return collection;
	}

	public static NumberOfAttackers getNumberOfAttackersInstance(LookupService lookupService, int id) 
	{
		return (NumberOfAttackers)lookupService.getLookupInstance(NumberOfAttackers.class, NumberOfAttackers.TYPE_ID, id);
	}
	

	public static RelationshipToAttackerCollection getRelationshipToAttacker(LookupService lookupService) {
		RelationshipToAttackerCollection collection =
			(RelationshipToAttackerCollection) lookupService.getLookupCollection(RelationshipToAttacker.TYPE_ID, 
				RelationshipToAttackerCollection.class, RelationshipToAttacker.class);
		return collection;
	}

	public static RelationshipToAttacker getRelationshipToAttackerInstance(LookupService lookupService, int id) 
	{
		return (RelationshipToAttacker)lookupService.getLookupInstance(RelationshipToAttacker.class, RelationshipToAttacker.TYPE_ID, id);
	}
	

	public static AttackerHadConsumedAlcoholCollection getAttackerHadConsumedAlcohol(LookupService lookupService) {
		AttackerHadConsumedAlcoholCollection collection =
			(AttackerHadConsumedAlcoholCollection) lookupService.getLookupCollection(AttackerHadConsumedAlcohol.TYPE_ID, 
				AttackerHadConsumedAlcoholCollection.class, AttackerHadConsumedAlcohol.class);
		return collection;
	}

	public static AttackerHadConsumedAlcohol getAttackerHadConsumedAlcoholInstance(LookupService lookupService, int id) 
	{
		return (AttackerHadConsumedAlcohol)lookupService.getLookupInstance(AttackerHadConsumedAlcohol.class, AttackerHadConsumedAlcohol.TYPE_ID, id);
	}
	

	public static TriageCategoryTypeCollection getTriageCategoryType(LookupService lookupService) {
		TriageCategoryTypeCollection collection =
			(TriageCategoryTypeCollection) lookupService.getLookupCollection(TriageCategoryType.TYPE_ID, 
				TriageCategoryTypeCollection.class, TriageCategoryType.class);
		return collection;
	}

	public static TriageCategoryType getTriageCategoryTypeInstance(LookupService lookupService, int id) 
	{
		return (TriageCategoryType)lookupService.getLookupInstance(TriageCategoryType.class, TriageCategoryType.TYPE_ID, id);
	}
	

	public static ReferralSpecialtyConsultantOrTeamCollection getReferralSpecialtyConsultantOrTeam(LookupService lookupService) {
		ReferralSpecialtyConsultantOrTeamCollection collection =
			(ReferralSpecialtyConsultantOrTeamCollection) lookupService.getLookupCollection(ReferralSpecialtyConsultantOrTeam.TYPE_ID, 
				ReferralSpecialtyConsultantOrTeamCollection.class, ReferralSpecialtyConsultantOrTeam.class);
		return collection;
	}

	public static ReferralSpecialtyConsultantOrTeam getReferralSpecialtyConsultantOrTeamInstance(LookupService lookupService, int id) 
	{
		return (ReferralSpecialtyConsultantOrTeam)lookupService.getLookupInstance(ReferralSpecialtyConsultantOrTeam.class, ReferralSpecialtyConsultantOrTeam.TYPE_ID, id);
	}
	

	public static TrackingStatusCollection getTrackingStatus(LookupService lookupService) {
		TrackingStatusCollection collection =
			(TrackingStatusCollection) lookupService.getLookupCollection(TrackingStatus.TYPE_ID, 
				TrackingStatusCollection.class, TrackingStatus.class);
		return collection;
	}

	public static TrackingStatus getTrackingStatusInstance(LookupService lookupService, int id) 
	{
		return (TrackingStatus)lookupService.getLookupInstance(TrackingStatus.class, TrackingStatus.TYPE_ID, id);
	}
	

	public static EmergencyWhiteBoardCollection getEmergencyWhiteBoard(LookupService lookupService) {
		EmergencyWhiteBoardCollection collection =
			(EmergencyWhiteBoardCollection) lookupService.getLookupCollection(EmergencyWhiteBoard.TYPE_ID, 
				EmergencyWhiteBoardCollection.class, EmergencyWhiteBoard.class);
		return collection;
	}

	public static EmergencyWhiteBoard getEmergencyWhiteBoardInstance(LookupService lookupService, int id) 
	{
		return (EmergencyWhiteBoard)lookupService.getLookupInstance(EmergencyWhiteBoard.class, EmergencyWhiteBoard.TYPE_ID, id);
	}
	

	public static AttendanceOutcomeCollection getAttendanceOutcome(LookupService lookupService) {
		AttendanceOutcomeCollection collection =
			(AttendanceOutcomeCollection) lookupService.getLookupCollection(AttendanceOutcome.TYPE_ID, 
				AttendanceOutcomeCollection.class, AttendanceOutcome.class);
		return collection;
	}

	public static AttendanceOutcome getAttendanceOutcomeInstance(LookupService lookupService, int id) 
	{
		return (AttendanceOutcome)lookupService.getLookupInstance(AttendanceOutcome.class, AttendanceOutcome.TYPE_ID, id);
	}
	

	public static PlaceOfEmploymentCollection getPlaceOfEmployment(LookupService lookupService) {
		PlaceOfEmploymentCollection collection =
			(PlaceOfEmploymentCollection) lookupService.getLookupCollection(PlaceOfEmployment.TYPE_ID, 
				PlaceOfEmploymentCollection.class, PlaceOfEmployment.class);
		return collection;
	}

	public static PlaceOfEmployment getPlaceOfEmploymentInstance(LookupService lookupService, int id) 
	{
		return (PlaceOfEmployment)lookupService.getLookupInstance(PlaceOfEmployment.class, PlaceOfEmployment.TYPE_ID, id);
	}
	

	public static SchoolCollection getSchool(LookupService lookupService) {
		SchoolCollection collection =
			(SchoolCollection) lookupService.getLookupCollection(School.TYPE_ID, 
				SchoolCollection.class, School.class);
		return collection;
	}

	public static School getSchoolInstance(LookupService lookupService, int id) 
	{
		return (School)lookupService.getLookupInstance(School.class, School.TYPE_ID, id);
	}
	

	public static AccompaniedByCollection getAccompaniedBy(LookupService lookupService) {
		AccompaniedByCollection collection =
			(AccompaniedByCollection) lookupService.getLookupCollection(AccompaniedBy.TYPE_ID, 
				AccompaniedByCollection.class, AccompaniedBy.class);
		return collection;
	}

	public static AccompaniedBy getAccompaniedByInstance(LookupService lookupService, int id) 
	{
		return (AccompaniedBy)lookupService.getLookupInstance(AccompaniedBy.class, AccompaniedBy.TYPE_ID, id);
	}
	

	public static ModeOfArrivalCollection getModeOfArrival(LookupService lookupService) {
		ModeOfArrivalCollection collection =
			(ModeOfArrivalCollection) lookupService.getLookupCollection(ModeOfArrival.TYPE_ID, 
				ModeOfArrivalCollection.class, ModeOfArrival.class);
		return collection;
	}

	public static ModeOfArrival getModeOfArrivalInstance(LookupService lookupService, int id) 
	{
		return (ModeOfArrival)lookupService.getLookupInstance(ModeOfArrival.class, ModeOfArrival.TYPE_ID, id);
	}
	

	public static ProtectionDeviceCollection getProtectionDevice(LookupService lookupService) {
		ProtectionDeviceCollection collection =
			(ProtectionDeviceCollection) lookupService.getLookupCollection(ProtectionDevice.TYPE_ID, 
				ProtectionDeviceCollection.class, ProtectionDevice.class);
		return collection;
	}

	public static ProtectionDevice getProtectionDeviceInstance(LookupService lookupService, int id) 
	{
		return (ProtectionDevice)lookupService.getLookupInstance(ProtectionDevice.class, ProtectionDevice.TYPE_ID, id);
	}
	

	public static PatientCategoryCollection getPatientCategory(LookupService lookupService) {
		PatientCategoryCollection collection =
			(PatientCategoryCollection) lookupService.getLookupCollection(PatientCategory.TYPE_ID, 
				PatientCategoryCollection.class, PatientCategory.class);
		return collection;
	}

	public static PatientCategory getPatientCategoryInstance(LookupService lookupService, int id) 
	{
		return (PatientCategory)lookupService.getLookupInstance(PatientCategory.class, PatientCategory.TYPE_ID, id);
	}
	

	public static IncidentLocationCollection getIncidentLocation(LookupService lookupService) {
		IncidentLocationCollection collection =
			(IncidentLocationCollection) lookupService.getLookupCollection(IncidentLocation.TYPE_ID, 
				IncidentLocationCollection.class, IncidentLocation.class);
		return collection;
	}

	public static IncidentLocation getIncidentLocationInstance(LookupService lookupService, int id) 
	{
		return (IncidentLocation)lookupService.getLookupInstance(IncidentLocation.class, IncidentLocation.TYPE_ID, id);
	}
	

	public static ReferredByCollection getReferredBy(LookupService lookupService) {
		ReferredByCollection collection =
			(ReferredByCollection) lookupService.getLookupCollection(ReferredBy.TYPE_ID, 
				ReferredByCollection.class, ReferredBy.class);
		return collection;
	}

	public static ReferredBy getReferredByInstance(LookupService lookupService, int id) 
	{
		return (ReferredBy)lookupService.getLookupInstance(ReferredBy.class, ReferredBy.TYPE_ID, id);
	}
	
}



