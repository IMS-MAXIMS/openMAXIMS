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
package ims.rules.helper;

import java.util.List;
import java.util.ArrayList;

public final class ReferralCurrentStatus extends ims.rules.types.RulesEngineEntity
{
	private static final long serialVersionUID = 1L;

	public ReferralCurrentStatus(List<ims.rules.types.RulesEngineEntity> entities)
	{
		super.id = "1096100007";
		if(entities.contains(this))
			return;
		else
			entities.add(this);

		super.name = "Referral Current Status";
		super.isPublic = true;
		super.supportsNotifications = false;
		super.description = "Referral Current Status";
		super.businessObjectName = "ims.RefMan.domain.objects.CATSReferralStatus";
		super.fields = new ArrayList<ims.rules.types.RulesEngineField>();
		super.fields.add(new ims.rules.types.RulesEngineField("73724392008822104485073661995", "Referral Status", "Referral Status", false, ims.rules.types.RulesEngineFieldType.LOOKUP, null, 1341000, "ReferralStatus", this));
		super.actions = new ArrayList<ims.rules.types.RulesEngineEntityMethod>();
	}
}
