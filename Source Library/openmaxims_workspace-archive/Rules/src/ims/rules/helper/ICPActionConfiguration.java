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

public final class ICPActionConfiguration extends ims.rules.types.RulesEngineEntity
{
	private static final long serialVersionUID = 1L;

	public ICPActionConfiguration(List<ims.rules.types.RulesEngineEntity> entities)
	{
		super.id = "1060100008";
		if(entities.contains(this))
			return;
		else
			entities.add(this);

		super.name = "ICP Action Configuration";
		super.isPublic = true;
		super.supportsNotifications = false;
		super.description = "ICP Action Configuration";
		super.businessObjectName = "ims.icps.configuration.domain.objects.ICPAction";
		super.fields = new ArrayList<ims.rules.types.RulesEngineField>();
		super.fields.add(new ims.rules.types.RulesEngineField("id", "Code", "Code", false, ims.rules.types.RulesEngineFieldType.ENTITY_CODE, null, 0, "Id", this));
		super.fields.add(new ims.rules.types.RulesEngineField("3640130200955834364227334337", "Action Name", "Action Name", false, ims.rules.types.RulesEngineFieldType.STRING, null, 0, "Name", this));
		super.actions = new ArrayList<ims.rules.types.RulesEngineEntityMethod>();
	}
}
