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
// This code was generated by Bogdan Tofei using IMS Development Environment (version 1.80 build 4471.18200)
// Copyright (C) 1995-2012 IMS MAXIMS. All rights reserved.

package ims.emergency.domain.impl;

import ims.core.vo.lookups.LocationType;
import ims.domain.DomainFactory;
import ims.emergency.domain.base.impl.BaseEmergencyDepartmentsDialogImpl;
import ims.emergency.vo.TrackingConfigurationVoCollection;
import ims.emergency.vo.domain.TrackingConfigurationVoAssembler;

import java.util.List;

public class EmergencyDepartmentsDialogImpl extends BaseEmergencyDepartmentsDialogImpl
{

	private static final long serialVersionUID = 1L;

	public TrackingConfigurationVoCollection listEDLocations()
	{
		DomainFactory factory = getDomainFactory();
		
		StringBuffer hql = new StringBuffer();
		//List only Emergency Departments
		hql.append(" select edloc from TrackingConfiguration as edloc left join edloc.eDLocation as loc where loc.type = " + LocationType.ANE.getId()); 
		hql.append(" and loc.isActive =:active");
		hql.append(" and loc.isRIE is null");
		hql.append(" and loc.isVirtual =:virtual");
		hql.append(" order by loc.name asc ");

		List<?> locationList = factory.find(hql.toString(), new String[]{"active", "virtual"}, new Object[]{Boolean.TRUE, Boolean.FALSE});
		return TrackingConfigurationVoAssembler.createTrackingConfigurationVoCollectionFromTrackingConfiguration(locationList);
	}

}
