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

public final class ICPConfiguration extends ims.rules.types.RulesEngineEntity
{
	private static final long serialVersionUID = 1L;

	public ICPConfiguration(List<ims.rules.types.RulesEngineEntity> entities)
	{
		super.id = "1060100000";
		if(entities.contains(this))
			return;
		else
			entities.add(this);

		int fieldEntityIndex = -1;
		super.name = "ICP Configuration";
		super.isPublic = true;
		super.supportsNotifications = false;
		super.description = "ICP Configuration";
		super.businessObjectName = "ims.icps.configuration.domain.objects.ICP";
		super.fields = new ArrayList<ims.rules.types.RulesEngineField>();
		super.fields.add(new ims.rules.types.RulesEngineField("id", "Code", "Code", false, ims.rules.types.RulesEngineFieldType.ENTITY_CODE, null, 0, "Id", this));
		super.fields.add(new ims.rules.types.RulesEngineField("507668920054201327175135800518", "ICP Name", "ICP Name", false, ims.rules.types.RulesEngineFieldType.STRING, null, 0, "Name", this));
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.ICPStageConfiguration(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("570016020054201322251449858514", "Stages for the ICP", "The Stages for the ICP", true, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.ICPStageConfiguration(entities)), 0, "Stages", this));
		super.fields.add(new ims.rules.types.RulesEngineField("2468599200542298445671123556", "ICP Category", "ICP Category", false, ims.rules.types.RulesEngineFieldType.LOOKUP, null, 1021117, "Category", this));
		super.fields.add(new ims.rules.types.RulesEngineField("8530607200542298452394690712", "ICP Type", "ICP Type", false, ims.rules.types.RulesEngineFieldType.LOOKUP, null, 1021117, "Type", this));
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.Procedure(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("4230551200955826592246469871", "Linked Procedure", "ICP Procedure", true, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.Procedure(entities)), 0, "Procedures", this));
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.Diagnosis(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("480379920095151124542233704226", "Linked Diagnosis", "ICP Diagnosis", false, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.Diagnosis(entities)), 0, "Diagnosis", this));
		super.actions = new ArrayList<ims.rules.types.RulesEngineEntityMethod>();
	}
}
