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

public final class HealthCareProfessional extends ims.rules.types.RulesEngineEntity
{
	private static final long serialVersionUID = 1L;

	public HealthCareProfessional(List<ims.rules.types.RulesEngineEntity> entities)
	{
		super.id = "1006100000";
		if(entities.contains(this))
			return;
		else
			entities.add(this);

		int fieldEntityIndex = -1;
		super.name = "Health Care Professional";
		super.isPublic = true;
		super.supportsNotifications = false;
		super.description = "Health Care Professional";
		super.businessObjectName = "ims.core.resource.people.domain.objects.Hcp";
		super.fields = new ArrayList<ims.rules.types.RulesEngineField>();
		super.fields.add(new ims.rules.types.RulesEngineField("614271620047301652271786492765", "Type", "Type", false, ims.rules.types.RulesEngineFieldType.LOOKUP, null, 1021048, "hcpType", this));
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.MemberofStaff(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("678818420055251310194841482402", "Member of Staff", "Member of Staff", false, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.MemberofStaff(entities)), 0, "Mos", this));
		super.actions = new ArrayList<ims.rules.types.RulesEngineEntityMethod>();
	}
}
