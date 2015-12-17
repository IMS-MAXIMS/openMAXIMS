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
package ims.dtomove.vo.lookups;

import ims.domain.lookups.LookupService;

/**
 * This is a generated interface.
 * Provides methods to get the ValueObject Lookup types of this namespace.
 * 
 */
public final class LookupHelper {
	public static LocationCharacteristicsCollection getLocationCharacteristics(LookupService lookupService) {
		LocationCharacteristicsCollection collection =
			(LocationCharacteristicsCollection) lookupService.getLookupCollection(LocationCharacteristics.TYPE_ID, 
				LocationCharacteristicsCollection.class, LocationCharacteristics.class);
		return collection;
	}

	public static LocationCharacteristics getLocationCharacteristicsInstance(LookupService lookupService, int id) 
	{
		return (LocationCharacteristics)lookupService.getLookupInstance(LocationCharacteristics.class, LocationCharacteristics.TYPE_ID, id);
	}
	

	public static ActionPriorityCollection getActionPriority(LookupService lookupService) {
		ActionPriorityCollection collection =
			(ActionPriorityCollection) lookupService.getLookupCollection(ActionPriority.TYPE_ID, 
				ActionPriorityCollection.class, ActionPriority.class);
		return collection;
	}

	public static ActionPriority getActionPriorityInstance(LookupService lookupService, int id) 
	{
		return (ActionPriority)lookupService.getLookupInstance(ActionPriority.class, ActionPriority.TYPE_ID, id);
	}
	

	public static ActionReasonCollection getActionReason(LookupService lookupService) {
		ActionReasonCollection collection =
			(ActionReasonCollection) lookupService.getLookupCollection(ActionReason.TYPE_ID, 
				ActionReasonCollection.class, ActionReason.class);
		return collection;
	}

	public static ActionReason getActionReasonInstance(LookupService lookupService, int id) 
	{
		return (ActionReason)lookupService.getLookupInstance(ActionReason.class, ActionReason.TYPE_ID, id);
	}
	

	public static ContractLocationCollection getContractLocation(LookupService lookupService) {
		ContractLocationCollection collection =
			(ContractLocationCollection) lookupService.getLookupCollection(ContractLocation.TYPE_ID, 
				ContractLocationCollection.class, ContractLocation.class);
		return collection;
	}

	public static ContractLocation getContractLocationInstance(LookupService lookupService, int id) 
	{
		return (ContractLocation)lookupService.getLookupInstance(ContractLocation.class, ContractLocation.TYPE_ID, id);
	}
	

	public static SpecialtyCodeCollection getSpecialtyCode(LookupService lookupService) {
		SpecialtyCodeCollection collection =
			(SpecialtyCodeCollection) lookupService.getLookupCollection(SpecialtyCode.TYPE_ID, 
				SpecialtyCodeCollection.class, SpecialtyCode.class);
		return collection;
	}

	public static SpecialtyCode getSpecialtyCodeInstance(LookupService lookupService, int id) 
	{
		return (SpecialtyCode)lookupService.getLookupInstance(SpecialtyCode.class, SpecialtyCode.TYPE_ID, id);
	}
	

	public static ApptCancelledReasonCollection getApptCancelledReason(LookupService lookupService) {
		ApptCancelledReasonCollection collection =
			(ApptCancelledReasonCollection) lookupService.getLookupCollection(ApptCancelledReason.TYPE_ID, 
				ApptCancelledReasonCollection.class, ApptCancelledReason.class);
		return collection;
	}

	public static ApptCancelledReason getApptCancelledReasonInstance(LookupService lookupService, int id) 
	{
		return (ApptCancelledReason)lookupService.getLookupInstance(ApptCancelledReason.class, ApptCancelledReason.TYPE_ID, id);
	}
	

	public static IntervalTypeCollection getIntervalType(LookupService lookupService) {
		IntervalTypeCollection collection =
			(IntervalTypeCollection) lookupService.getLookupCollection(IntervalType.TYPE_ID, 
				IntervalTypeCollection.class, IntervalType.class);
		return collection;
	}

	public static IntervalType getIntervalTypeInstance(LookupService lookupService, int id) 
	{
		return (IntervalType)lookupService.getLookupInstance(IntervalType.class, IntervalType.TYPE_ID, id);
	}
	

	public static SchedulingTypeCollection getSchedulingType(LookupService lookupService) {
		SchedulingTypeCollection collection =
			(SchedulingTypeCollection) lookupService.getLookupCollection(SchedulingType.TYPE_ID, 
				SchedulingTypeCollection.class, SchedulingType.class);
		return collection;
	}

	public static SchedulingType getSchedulingTypeInstance(LookupService lookupService, int id) 
	{
		return (SchedulingType)lookupService.getLookupInstance(SchedulingType.class, SchedulingType.TYPE_ID, id);
	}
	

	public static MachineTypesCollection getMachineTypes(LookupService lookupService) {
		MachineTypesCollection collection =
			(MachineTypesCollection) lookupService.getLookupCollection(MachineTypes.TYPE_ID, 
				MachineTypesCollection.class, MachineTypes.class);
		return collection;
	}

	public static MachineTypes getMachineTypesInstance(LookupService lookupService, int id) 
	{
		return (MachineTypes)lookupService.getLookupInstance(MachineTypes.class, MachineTypes.TYPE_ID, id);
	}
	

	public static SchedulingCategoryCollection getSchedulingCategory(LookupService lookupService) {
		SchedulingCategoryCollection collection =
			(SchedulingCategoryCollection) lookupService.getLookupCollection(SchedulingCategory.TYPE_ID, 
				SchedulingCategoryCollection.class, SchedulingCategory.class);
		return collection;
	}

	public static SchedulingCategory getSchedulingCategoryInstance(LookupService lookupService, int id) 
	{
		return (SchedulingCategory)lookupService.getLookupInstance(SchedulingCategory.class, SchedulingCategory.TYPE_ID, id);
	}
	
}



