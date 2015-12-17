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
package ims.pci.vo.lookups;

import ims.domain.lookups.LookupService;

/**
 * This is a generated interface.
 * Provides methods to get the ValueObject Lookup types of this namespace.
 * 
 */
public final class LookupHelper {
	public static BreastFeedingStatusCollection getBreastFeedingStatus(LookupService lookupService) {
		BreastFeedingStatusCollection collection =
			(BreastFeedingStatusCollection) lookupService.getLookupCollection(BreastFeedingStatus.TYPE_ID, 
				BreastFeedingStatusCollection.class, BreastFeedingStatus.class);
		return collection;
	}

	public static BreastFeedingStatus getBreastFeedingStatusInstance(LookupService lookupService, int id) 
	{
		return (BreastFeedingStatus)lookupService.getLookupInstance(BreastFeedingStatus.class, BreastFeedingStatus.TYPE_ID, id);
	}
	

	public static VaccineCancellationReasonCollection getVaccineCancellationReason(LookupService lookupService) {
		VaccineCancellationReasonCollection collection =
			(VaccineCancellationReasonCollection) lookupService.getLookupCollection(VaccineCancellationReason.TYPE_ID, 
				VaccineCancellationReasonCollection.class, VaccineCancellationReason.class);
		return collection;
	}

	public static VaccineCancellationReason getVaccineCancellationReasonInstance(LookupService lookupService, int id) 
	{
		return (VaccineCancellationReason)lookupService.getLookupInstance(VaccineCancellationReason.class, VaccineCancellationReason.TYPE_ID, id);
	}
	

	public static ScheduleTypeCollection getScheduleType(LookupService lookupService) {
		ScheduleTypeCollection collection =
			(ScheduleTypeCollection) lookupService.getLookupCollection(ScheduleType.TYPE_ID, 
				ScheduleTypeCollection.class, ScheduleType.class);
		return collection;
	}

	public static ScheduleType getScheduleTypeInstance(LookupService lookupService, int id) 
	{
		return (ScheduleType)lookupService.getLookupInstance(ScheduleType.class, ScheduleType.TYPE_ID, id);
	}
	

	public static PaymentTypeCollection getPaymentType(LookupService lookupService) {
		PaymentTypeCollection collection =
			(PaymentTypeCollection) lookupService.getLookupCollection(PaymentType.TYPE_ID, 
				PaymentTypeCollection.class, PaymentType.class);
		return collection;
	}

	public static PaymentType getPaymentTypeInstance(LookupService lookupService, int id) 
	{
		return (PaymentType)lookupService.getLookupInstance(PaymentType.class, PaymentType.TYPE_ID, id);
	}
	

	public static UserDefinedType3Collection getUserDefinedType3(LookupService lookupService) {
		UserDefinedType3Collection collection =
			(UserDefinedType3Collection) lookupService.getLookupCollection(UserDefinedType3.TYPE_ID, 
				UserDefinedType3Collection.class, UserDefinedType3.class);
		return collection;
	}

	public static UserDefinedType3 getUserDefinedType3Instance(LookupService lookupService, int id) 
	{
		return (UserDefinedType3)lookupService.getLookupInstance(UserDefinedType3.class, UserDefinedType3.TYPE_ID, id);
	}
	

	public static UserDefinedType2Collection getUserDefinedType2(LookupService lookupService) {
		UserDefinedType2Collection collection =
			(UserDefinedType2Collection) lookupService.getLookupCollection(UserDefinedType2.TYPE_ID, 
				UserDefinedType2Collection.class, UserDefinedType2.class);
		return collection;
	}

	public static UserDefinedType2 getUserDefinedType2Instance(LookupService lookupService, int id) 
	{
		return (UserDefinedType2)lookupService.getLookupInstance(UserDefinedType2.class, UserDefinedType2.TYPE_ID, id);
	}
	

	public static UserDefinedType1Collection getUserDefinedType1(LookupService lookupService) {
		UserDefinedType1Collection collection =
			(UserDefinedType1Collection) lookupService.getLookupCollection(UserDefinedType1.TYPE_ID, 
				UserDefinedType1Collection.class, UserDefinedType1.class);
		return collection;
	}

	public static UserDefinedType1 getUserDefinedType1Instance(LookupService lookupService, int id) 
	{
		return (UserDefinedType1)lookupService.getLookupInstance(UserDefinedType1.class, UserDefinedType1.TYPE_ID, id);
	}
	

	public static StageCollection getStage(LookupService lookupService) {
		StageCollection collection =
			(StageCollection) lookupService.getLookupCollection(Stage.TYPE_ID, 
				StageCollection.class, Stage.class);
		return collection;
	}

	public static Stage getStageInstance(LookupService lookupService, int id) 
	{
		return (Stage)lookupService.getLookupInstance(Stage.class, Stage.TYPE_ID, id);
	}
	

	public static MaritalStatusAtBirthCollection getMaritalStatusAtBirth(LookupService lookupService) {
		MaritalStatusAtBirthCollection collection =
			(MaritalStatusAtBirthCollection) lookupService.getLookupCollection(MaritalStatusAtBirth.TYPE_ID, 
				MaritalStatusAtBirthCollection.class, MaritalStatusAtBirth.class);
		return collection;
	}

	public static MaritalStatusAtBirth getMaritalStatusAtBirthInstance(LookupService lookupService, int id) 
	{
		return (MaritalStatusAtBirth)lookupService.getLookupInstance(MaritalStatusAtBirth.class, MaritalStatusAtBirth.TYPE_ID, id);
	}
	

	public static DeliveryMethodBirthCollection getDeliveryMethodBirth(LookupService lookupService) {
		DeliveryMethodBirthCollection collection =
			(DeliveryMethodBirthCollection) lookupService.getLookupCollection(DeliveryMethodBirth.TYPE_ID, 
				DeliveryMethodBirthCollection.class, DeliveryMethodBirth.class);
		return collection;
	}

	public static DeliveryMethodBirth getDeliveryMethodBirthInstance(LookupService lookupService, int id) 
	{
		return (DeliveryMethodBirth)lookupService.getLookupInstance(DeliveryMethodBirth.class, DeliveryMethodBirth.TYPE_ID, id);
	}
	

	public static PlaceOfBirthCollection getPlaceOfBirth(LookupService lookupService) {
		PlaceOfBirthCollection collection =
			(PlaceOfBirthCollection) lookupService.getLookupCollection(PlaceOfBirth.TYPE_ID, 
				PlaceOfBirthCollection.class, PlaceOfBirth.class);
		return collection;
	}

	public static PlaceOfBirth getPlaceOfBirthInstance(LookupService lookupService, int id) 
	{
		return (PlaceOfBirth)lookupService.getLookupInstance(PlaceOfBirth.class, PlaceOfBirth.TYPE_ID, id);
	}
	

	public static GMSPaymentTypeCollection getGMSPaymentType(LookupService lookupService) {
		GMSPaymentTypeCollection collection =
			(GMSPaymentTypeCollection) lookupService.getLookupCollection(GMSPaymentType.TYPE_ID, 
				GMSPaymentTypeCollection.class, GMSPaymentType.class);
		return collection;
	}

	public static GMSPaymentType getGMSPaymentTypeInstance(LookupService lookupService, int id) 
	{
		return (GMSPaymentType)lookupService.getLookupInstance(GMSPaymentType.class, GMSPaymentType.TYPE_ID, id);
	}
	

	public static VaccineStatusCollection getVaccineStatus(LookupService lookupService) {
		VaccineStatusCollection collection =
			(VaccineStatusCollection) lookupService.getLookupCollection(VaccineStatus.TYPE_ID, 
				VaccineStatusCollection.class, VaccineStatus.class);
		return collection;
	}

	public static VaccineStatus getVaccineStatusInstance(LookupService lookupService, int id) 
	{
		return (VaccineStatus)lookupService.getLookupInstance(VaccineStatus.class, VaccineStatus.TYPE_ID, id);
	}
	

	public static TerminationReasonCollection getTerminationReason(LookupService lookupService) {
		TerminationReasonCollection collection =
			(TerminationReasonCollection) lookupService.getLookupCollection(TerminationReason.TYPE_ID, 
				TerminationReasonCollection.class, TerminationReason.class);
		return collection;
	}

	public static TerminationReason getTerminationReasonInstance(LookupService lookupService, int id) 
	{
		return (TerminationReason)lookupService.getLookupInstance(TerminationReason.class, TerminationReason.TYPE_ID, id);
	}
	

	public static TerminatedByCollection getTerminatedBy(LookupService lookupService) {
		TerminatedByCollection collection =
			(TerminatedByCollection) lookupService.getLookupCollection(TerminatedBy.TYPE_ID, 
				TerminatedByCollection.class, TerminatedBy.class);
		return collection;
	}

	public static TerminatedBy getTerminatedByInstance(LookupService lookupService, int id) 
	{
		return (TerminatedBy)lookupService.getLookupInstance(TerminatedBy.class, TerminatedBy.TYPE_ID, id);
	}
	

	public static UserDefinedType5Collection getUserDefinedType5(LookupService lookupService) {
		UserDefinedType5Collection collection =
			(UserDefinedType5Collection) lookupService.getLookupCollection(UserDefinedType5.TYPE_ID, 
				UserDefinedType5Collection.class, UserDefinedType5.class);
		return collection;
	}

	public static UserDefinedType5 getUserDefinedType5Instance(LookupService lookupService, int id) 
	{
		return (UserDefinedType5)lookupService.getLookupInstance(UserDefinedType5.class, UserDefinedType5.TYPE_ID, id);
	}
	

	public static UserDefinedType4Collection getUserDefinedType4(LookupService lookupService) {
		UserDefinedType4Collection collection =
			(UserDefinedType4Collection) lookupService.getLookupCollection(UserDefinedType4.TYPE_ID, 
				UserDefinedType4Collection.class, UserDefinedType4.class);
		return collection;
	}

	public static UserDefinedType4 getUserDefinedType4Instance(LookupService lookupService, int id) 
	{
		return (UserDefinedType4)lookupService.getLookupInstance(UserDefinedType4.class, UserDefinedType4.TYPE_ID, id);
	}
	
}



