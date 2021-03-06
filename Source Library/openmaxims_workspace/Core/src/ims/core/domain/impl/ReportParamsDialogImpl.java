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
// This code was generated by Vasile Purdila using IMS Development Environment (version 1.66 build 3271.26979)
// Copyright (C) 1995-2008 IMS MAXIMS plc. All rights reserved.

package ims.core.domain.impl;

import java.util.List;

import ims.core.domain.base.impl.BaseReportParamsDialogImpl;
import ims.domain.DomainFactory;

public class ReportParamsDialogImpl extends BaseReportParamsDialogImpl
{

	private static final long serialVersionUID = 1L;

	public ims.core.vo.HcpLiteVoCollection listHcpLiteByNameAndDisciplineType(String hcpName, ims.core.vo.lookups.HcpDisType hcpDisciplineType)
	{
		ReportRunnerDialogImpl impl = (ReportRunnerDialogImpl) getDomainImpl(ReportRunnerDialogImpl.class);
		return impl.listHcpLiteByNameAndDisciplineType(hcpName, hcpDisciplineType);
	}

	/**
	* Returns a MosList based on the search criteria in the passed in filter
	*/
	public ims.core.vo.MemberOfStaffShortVoCollection listMembersOfStaff(ims.core.vo.MemberOfStaffShortVo filter)
	{
		ReportRunnerDialogImpl impl = (ReportRunnerDialogImpl) getDomainImpl(ReportRunnerDialogImpl.class);
		return impl.listMembersOfStaff(filter);
	}

	/**
	* Lists GPs by Surname
	*/
	public ims.core.vo.GpShortVoCollection listGPsBySurname(String surname)
	{
		ReportRunnerDialogImpl impl = (ReportRunnerDialogImpl) getDomainImpl(ReportRunnerDialogImpl.class);
		return impl.listGPsBySurname(surname);
	}

	public ims.core.vo.OrgShortVoCollection listOrganisationsShort(ims.core.vo.OrgShortVo filter)
	{
		ReportRunnerDialogImpl impl = (ReportRunnerDialogImpl) getDomainImpl(ReportRunnerDialogImpl.class);
		return impl.listOrganisationsShort(filter);
	}

	/**
	* list Location Site
	*/
	public ims.core.vo.LocSiteLiteVoCollection listLocSite(String locationName)
	{
		ReportRunnerDialogImpl impl = (ReportRunnerDialogImpl) getDomainImpl(ReportRunnerDialogImpl.class);
		return impl.listLocSite(locationName);
	}

	/**
	* list Locations By Name
	*/
	public ims.core.vo.LocationLiteVoCollection listLocationByName(String locationName)
	{
		ReportRunnerDialogImpl impl = (ReportRunnerDialogImpl) getDomainImpl(ReportRunnerDialogImpl.class);
		return impl.listLocationByName(locationName);
	}

	/**
	* getSystemReportAndTemplate
	*/
	public String[] getSystemReportAndTemplate(Integer imsId)
	{
		String[] result = null;
		
		DomainFactory factory = getDomainFactory();
		
		List lst = factory.find("select r1_1.reportXml, t1_1.templateXml, r1_1.reportName, r1_1.reportDescription, t1_1.name, t1_1.description from ReportBo as r1_1 left join r1_1.templates as t1_1 where (r1_1.imsId= :imsid) order by t1_1.name", new String[] {"imsid"}, new Object[] {imsId});
		
		if(lst.iterator().hasNext())
		{
			Object[] obj = (Object[])lst.iterator().next();
			
			result = new String[] {(String)obj[0], (String)obj[1], (String)obj[2], (String)obj[3], (String)obj[4], (String)obj[5]};
		}
		
		return result;
	}
}
