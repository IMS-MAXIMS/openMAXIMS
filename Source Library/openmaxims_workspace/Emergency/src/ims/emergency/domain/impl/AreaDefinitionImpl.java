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
// This code was generated by Florin Blindu using IMS Development Environment (version 1.80 build 4535.14223)
// Copyright (C) 1995-2012 IMS MAXIMS. All rights reserved.

package ims.emergency.domain.impl;

import ims.domain.DomainFactory;
import ims.emergency.domain.base.impl.BaseAreaDefinitionImpl;
import ims.framework.exceptions.CodingRuntimeException;

public class AreaDefinitionImpl extends BaseAreaDefinitionImpl
{

	private static final long serialVersionUID = 1L;

	public Boolean isAreaUsedInOtherConfigurations(ims.emergency.configuration.vo.TrackingAreaRefVo trackAreaRef)
	{
		if (trackAreaRef == null || trackAreaRef.getID_TrackingArea() == null)
		{
			throw new CodingRuntimeException("Cannot get TrackingAreaVo on null Id  ");
		}

		DomainFactory factory = getDomainFactory();

		StringBuffer hql = new StringBuffer();
		hql.append("select count(trackArea.id) from TrackingArea as trackArea left join trackArea.sendToAreas as sendToAreas where (sendToAreas.id = :areaId) ");
		
		Object[] count = factory.find(hql.toString(), new String[] { "areaId" }, new Object[] { trackAreaRef.getID_TrackingArea() }).toArray();

		if (count != null && count.length > 0)
			if (((Long) count[0]).intValue() > 0)
				return true;

		return false;
	}
}
