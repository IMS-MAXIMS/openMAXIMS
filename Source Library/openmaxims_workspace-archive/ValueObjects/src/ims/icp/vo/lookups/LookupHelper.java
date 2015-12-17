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
package ims.icp.vo.lookups;

import ims.domain.lookups.LookupService;

/**
 * This is a generated interface.
 * Provides methods to get the ValueObject Lookup types of this namespace.
 * 
 */
public final class LookupHelper {
	public static ICPStageStatusCollection getICPStageStatus(LookupService lookupService) {
		ICPStageStatusCollection collection =
			(ICPStageStatusCollection) lookupService.getLookupCollection(ICPStageStatus.TYPE_ID, 
				ICPStageStatusCollection.class, ICPStageStatus.class);
		return collection;
	}

	public static ICPStageStatus getICPStageStatusInstance(LookupService lookupService, int id) 
	{
		return (ICPStageStatus)lookupService.getLookupInstance(ICPStageStatus.class, ICPStageStatus.TYPE_ID, id);
	}
	

	public static ICPVarianceTypeCollection getICPVarianceType(LookupService lookupService) {
		ICPVarianceTypeCollection collection =
			(ICPVarianceTypeCollection) lookupService.getLookupCollection(ICPVarianceType.TYPE_ID, 
				ICPVarianceTypeCollection.class, ICPVarianceType.class);
		return collection;
	}

	public static ICPVarianceType getICPVarianceTypeInstance(LookupService lookupService, int id) 
	{
		return (ICPVarianceType)lookupService.getLookupInstance(ICPVarianceType.class, ICPVarianceType.TYPE_ID, id);
	}
	

	public static ICPDisciplineCollection getICPDiscipline(LookupService lookupService) {
		ICPDisciplineCollection collection =
			(ICPDisciplineCollection) lookupService.getLookupCollection(ICPDiscipline.TYPE_ID, 
				ICPDisciplineCollection.class, ICPDiscipline.class);
		return collection;
	}

	public static ICPDiscipline getICPDisciplineInstance(LookupService lookupService, int id) 
	{
		return (ICPDiscipline)lookupService.getLookupInstance(ICPDiscipline.class, ICPDiscipline.TYPE_ID, id);
	}
	

	public static ICPComponentLinkedTypeCollection getICPComponentLinkedType(LookupService lookupService) {
		ICPComponentLinkedTypeCollection collection =
			(ICPComponentLinkedTypeCollection) lookupService.getLookupCollection(ICPComponentLinkedType.TYPE_ID, 
				ICPComponentLinkedTypeCollection.class, ICPComponentLinkedType.class);
		return collection;
	}

	public static ICPComponentLinkedType getICPComponentLinkedTypeInstance(LookupService lookupService, int id) 
	{
		return (ICPComponentLinkedType)lookupService.getLookupInstance(ICPComponentLinkedType.class, ICPComponentLinkedType.TYPE_ID, id);
	}
	

	public static ICPStagePhaseCollection getICPStagePhase(LookupService lookupService) {
		ICPStagePhaseCollection collection =
			(ICPStagePhaseCollection) lookupService.getLookupCollection(ICPStagePhase.TYPE_ID, 
				ICPStagePhaseCollection.class, ICPStagePhase.class);
		return collection;
	}

	public static ICPStagePhase getICPStagePhaseInstance(LookupService lookupService, int id) 
	{
		return (ICPStagePhase)lookupService.getLookupInstance(ICPStagePhase.class, ICPStagePhase.TYPE_ID, id);
	}
	

	public static CriticalEventCollection getCriticalEvent(LookupService lookupService) {
		CriticalEventCollection collection =
			(CriticalEventCollection) lookupService.getLookupCollection(CriticalEvent.TYPE_ID, 
				CriticalEventCollection.class, CriticalEvent.class);
		return collection;
	}

	public static CriticalEvent getCriticalEventInstance(LookupService lookupService, int id) 
	{
		return (CriticalEvent)lookupService.getLookupInstance(CriticalEvent.class, CriticalEvent.TYPE_ID, id);
	}
	

	public static ICPActionStatusCollection getICPActionStatus(LookupService lookupService) {
		ICPActionStatusCollection collection =
			(ICPActionStatusCollection) lookupService.getLookupCollection(ICPActionStatus.TYPE_ID, 
				ICPActionStatusCollection.class, ICPActionStatus.class);
		return collection;
	}

	public static ICPActionStatus getICPActionStatusInstance(LookupService lookupService, int id) 
	{
		return (ICPActionStatus)lookupService.getLookupInstance(ICPActionStatus.class, ICPActionStatus.TYPE_ID, id);
	}
	

	public static ICPPhaseStatusCollection getICPPhaseStatus(LookupService lookupService) {
		ICPPhaseStatusCollection collection =
			(ICPPhaseStatusCollection) lookupService.getLookupCollection(ICPPhaseStatus.TYPE_ID, 
				ICPPhaseStatusCollection.class, ICPPhaseStatus.class);
		return collection;
	}

	public static ICPPhaseStatus getICPPhaseStatusInstance(LookupService lookupService, int id) 
	{
		return (ICPPhaseStatus)lookupService.getLookupInstance(ICPPhaseStatus.class, ICPPhaseStatus.TYPE_ID, id);
	}
	
}



