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
package ims.clinicaladmin.vo.lookups;

import ims.domain.lookups.LookupService;

/**
 * This is a generated interface.
 * Provides methods to get the ValueObject Lookup types of this namespace.
 * 
 */
public final class LookupHelper {
	public static CaseTypeProcedureCollection getCaseTypeProcedure(LookupService lookupService) {
		CaseTypeProcedureCollection collection =
			(CaseTypeProcedureCollection) lookupService.getLookupCollection(CaseTypeProcedure.TYPE_ID, 
				CaseTypeProcedureCollection.class, CaseTypeProcedure.class);
		return collection;
	}

	public static CaseTypeProcedure getCaseTypeProcedureInstance(LookupService lookupService, int id) 
	{
		return (CaseTypeProcedure)lookupService.getLookupInstance(CaseTypeProcedure.class, CaseTypeProcedure.TYPE_ID, id);
	}
	

	public static DementiaTermConfigCollection getDementiaTermConfig(LookupService lookupService) {
		DementiaTermConfigCollection collection =
			(DementiaTermConfigCollection) lookupService.getLookupCollection(DementiaTermConfig.TYPE_ID, 
				DementiaTermConfigCollection.class, DementiaTermConfig.class);
		return collection;
	}

	public static DementiaTermConfig getDementiaTermConfigInstance(LookupService lookupService, int id) 
	{
		return (DementiaTermConfig)lookupService.getLookupInstance(DementiaTermConfig.class, DementiaTermConfig.TYPE_ID, id);
	}
	

	public static EDischargeHINTCollection getEDischargeHINT(LookupService lookupService) {
		EDischargeHINTCollection collection =
			(EDischargeHINTCollection) lookupService.getLookupCollection(EDischargeHINT.TYPE_ID, 
				EDischargeHINTCollection.class, EDischargeHINT.class);
		return collection;
	}

	public static EDischargeHINT getEDischargeHINTInstance(LookupService lookupService, int id) 
	{
		return (EDischargeHINT)lookupService.getLookupInstance(EDischargeHINT.class, EDischargeHINT.TYPE_ID, id);
	}
	

	public static HotListFormTypeCollection getHotListFormType(LookupService lookupService) {
		HotListFormTypeCollection collection =
			(HotListFormTypeCollection) lookupService.getLookupCollection(HotListFormType.TYPE_ID, 
				HotListFormTypeCollection.class, HotListFormType.class);
		return collection;
	}

	public static HotListFormType getHotListFormTypeInstance(LookupService lookupService, int id) 
	{
		return (HotListFormType)lookupService.getLookupInstance(HotListFormType.class, HotListFormType.TYPE_ID, id);
	}
	
}



