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

public final class ICPPhaseConfiguration extends ims.rules.types.RulesEngineEntity
{
	private static final long serialVersionUID = 1L;

	public ICPPhaseConfiguration(List<ims.rules.types.RulesEngineEntity> entities)
	{
		super.id = "1060100002";
		if(entities.contains(this))
			return;
		else
			entities.add(this);

		int fieldEntityIndex = -1;
		super.name = "ICP Phase Configuration";
		super.isPublic = true;
		super.supportsNotifications = false;
		super.description = "ICP Phase Configuration";
		super.businessObjectName = "ims.icps.configuration.domain.objects.ICPPhase";
		super.fields = new ArrayList<ims.rules.types.RulesEngineField>();
		super.fields.add(new ims.rules.types.RulesEngineField("id", "Code", "Code", false, ims.rules.types.RulesEngineFieldType.ENTITY_CODE, null, 0, "Id", this));
		super.fields.add(new ims.rules.types.RulesEngineField("60903632007813936325776388161", "Phase Name", "Phase Name", false, ims.rules.types.RulesEngineFieldType.STRING, null, 0, "Name", this));
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.ICPActionConfiguration(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("8820975200955833407192401094", "Actions for the Phase", "The actions for the Phase", true, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.ICPActionConfiguration(entities)), 0, "Actions", this));
		super.actions = new ArrayList<ims.rules.types.RulesEngineEntityMethod>();
	}
}
