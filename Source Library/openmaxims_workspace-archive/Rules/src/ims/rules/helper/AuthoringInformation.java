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

public final class AuthoringInformation extends ims.rules.types.RulesEngineEntity
{
	private static final long serialVersionUID = 1L;

	public AuthoringInformation(List<ims.rules.types.RulesEngineEntity> entities)
	{
		super.id = "1003100069";
		if(entities.contains(this))
			return;
		else
			entities.add(this);

		int fieldEntityIndex = -1;
		super.name = "Authoring Information";
		super.isPublic = true;
		super.supportsNotifications = false;
		super.description = "Authoring Information";
		super.businessObjectName = "ims.core.clinical.domain.objects.AuthoringInformation";
		super.fields = new ArrayList<ims.rules.types.RulesEngineField>();
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.HealthCareProfessional(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("5513302200658155501779959115", "Authoring Hcp", "Authoring Hcp", false, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.HealthCareProfessional(entities)), 0, "AuthoringHcp", this));
		super.fields.add(new ims.rules.types.RulesEngineField("3553668200658155513339425382", "Authoring Date Time", "Authoring Date Time", false, ims.rules.types.RulesEngineFieldType.DATETIME, null, 0, "AuthoringDateTime", this));
		super.actions = new ArrayList<ims.rules.types.RulesEngineEntityMethod>();
	}
}
