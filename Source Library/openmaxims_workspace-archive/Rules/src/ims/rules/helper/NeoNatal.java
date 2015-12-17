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

public final class NeoNatal extends ims.rules.types.RulesEngineEntity
{
	private static final long serialVersionUID = 1L;

	public NeoNatal(List<ims.rules.types.RulesEngineEntity> entities)
	{
		super.id = "1099100013";
		if(entities.contains(this))
			return;
		else
			entities.add(this);

		int fieldEntityIndex = -1;
		super.name = "NeoNatal";
		super.isPublic = true;
		super.supportsNotifications = false;
		super.description = "NeoNatal";
		super.businessObjectName = "ims.edischarge.domain.objects.NeoNatal";
		super.fields = new ArrayList<ims.rules.types.RulesEngineField>();
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.Nurse(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("648729920101013128359104997156", "Discharging Nurse", "Discharging Nurse", false, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.Nurse(entities)), 0, "DischargingNurse", this));
		super.fields.add(new ims.rules.types.RulesEngineField("457388920101026129582445818509", "Route", "Route", false, ims.rules.types.RulesEngineFieldType.LOOKUP, null, 1021035, "Route", this));
		super.fields.add(new ims.rules.types.RulesEngineField("8752950201010261224406752730429", "Second PKU Test Date", "Second PKU Test Date", false, ims.rules.types.RulesEngineFieldType.DATE, null, 0, "2ndPKUTestDate", this));
		super.fields.add(new ims.rules.types.RulesEngineField("370774020101026123419409302930", "Is Complete", "Is Complete", false, ims.rules.types.RulesEngineFieldType.BOOLEAN, null, 0, "IsComplete", this));
		super.actions = new ArrayList<ims.rules.types.RulesEngineEntityMethod>();
	}
}
