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
// This code was generated by Catalin Tomozei using IMS Development Environment (version 1.51 build 2467.19631)
// Copyright (C) 1995-2006 IMS MAXIMS plc. All rights reserved.

package ims.nursing.domain.impl;

import ims.admin.domain.HcpAdmin;
import ims.admin.domain.impl.HcpAdminImpl;
import ims.core.admin.vo.CareContextRefVo;
import ims.core.vo.HcpLiteVoCollection;
import ims.domain.DomainFactory;
import ims.domain.exceptions.DomainRuntimeException;
import ims.domain.exceptions.StaleObjectException;
import ims.framework.exceptions.CodingRuntimeException;
import ims.framework.utils.DateTime;
import ims.nursing.domain.base.impl.BasePlanOfCareActionsImpl;
import ims.nursing.domain.objects.PlanOfCareNoting;
import ims.nursing.vo.PlanOfCareActionsVoCollection;
import ims.nursing.vo.PlanOfCareListVoCollection;
import ims.nursing.vo.PlanOfCareNotingVo;
import ims.nursing.vo.PlanOfCareNotingVoCollection;
import ims.nursing.vo.domain.PlanOfCareListVoAssembler;
import ims.nursing.vo.domain.PlanOfCareNotingVoAssembler;

public class PlanOfCareActionsImpl extends BasePlanOfCareActionsImpl
{
	private static final long serialVersionUID = 1L;

	public PlanOfCareListVoCollection listPlanOfCare(CareContextRefVo voCareContextRef) 
	{
		return PlanOfCareListVoAssembler.createPlanOfCareListVoCollectionFromPlanOfCare(
				getDomainFactory().find("from PlanOfCare as poc where poc.status.id <> -1090 and poc.careContext.id = :CARE_CONTEXT", 
						new String[] {"CARE_CONTEXT"}, new Object[] {voCareContextRef.getID_CareContext()}));
	}
	
	public PlanOfCareNotingVoCollection listSearchNoting(DateTime startDate, DateTime endDate, CareContextRefVo voCareContextRef ) 
	{
		if(startDate != null && endDate != null)
			return PlanOfCareNotingVoAssembler.createPlanOfCareNotingVoCollectionFromPlanOfCareNoting(
					getDomainFactory().find("from PlanOfCareNoting as pocn where pocn.authoringInformation.authoringDateTime between :startDate and :endDate and pocn.careContext.id = :careContext order by pocn.authoringInformation.authoringDateTime desc", 
							new String[] {"startDate", "endDate", "careContext"}, new Object[] {startDate.getJavaDate(), endDate.getJavaDate(), voCareContextRef.getID_CareContext()}));
		else if(startDate != null)
			return PlanOfCareNotingVoAssembler.createPlanOfCareNotingVoCollectionFromPlanOfCareNoting(
					getDomainFactory().find("from PlanOfCareNoting as pocn where pocn.authoringInformation.authoringDateTime >= :startDate and pocn.careContext.id = :careContext order by pocn.authoringInformation.authoringDateTime desc", 
							new String[] {"startDate", "careContext"}, new Object[] {startDate.getJavaDate(), voCareContextRef.getID_CareContext()}));
		else if(endDate != null)
			return PlanOfCareNotingVoAssembler.createPlanOfCareNotingVoCollectionFromPlanOfCareNoting(
					getDomainFactory().find("from PlanOfCareNoting as pocn where pocn.authoringInformation.authoringDateTime <= :endDate and pocn.careContext.id = :careContext order by pocn.authoringInformation.authoringDateTime desc", 
							new String[] {"endDate", "careContext"}, new Object[] {endDate.getJavaDate(), voCareContextRef.getID_CareContext()}));
		
		return null;
	}
	
	public HcpLiteVoCollection listHcps(String value) {
		HcpAdmin hcpAdmin = (HcpAdmin) getDomainImpl(HcpAdminImpl.class);
		return hcpAdmin.listHcpLiteByName(value);
	}

	public void saveNewActions(PlanOfCareActionsVoCollection voPlanOfCareActionColl, PlanOfCareNotingVo voPlanOfCareNoting) throws StaleObjectException 
	{
		if(voPlanOfCareActionColl == null)
			throw new DomainRuntimeException("Invalid records");
		if(!voPlanOfCareActionColl.isValidated())
			throw new CodingRuntimeException("Records not validated");
		
		DomainFactory factory = getDomainFactory();
		
		PlanOfCareNoting doPlanOfCareNoting = PlanOfCareNotingVoAssembler.extractPlanOfCareNoting(factory, voPlanOfCareNoting);
		factory.save(doPlanOfCareNoting);
	}
}