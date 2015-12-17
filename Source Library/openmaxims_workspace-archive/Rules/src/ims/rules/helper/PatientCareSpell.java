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

public final class PatientCareSpell extends ims.rules.types.RulesEngineEntity
{
	private static final long serialVersionUID = 1L;

	public PatientCareSpell(List<ims.rules.types.RulesEngineEntity> entities)
	{
		super.id = "1004100017";
		if(entities.contains(this))
			return;
		else
			entities.add(this);

		super.name = "Patient Care Spell";
		super.isPublic = true;
		super.supportsNotifications = false;
		super.description = "Patient Care Spell";
		super.businessObjectName = "ims.core.admin.domain.objects.CareSpell";
		super.fields = new ArrayList<ims.rules.types.RulesEngineField>();
		super.fields.add(new ims.rules.types.RulesEngineField("329007620063151035343919723587", "Start Date", "Start Date", false, ims.rules.types.RulesEngineFieldType.DATE, null, 0, "StartDate", this));
		super.fields.add(new ims.rules.types.RulesEngineField("1346682200631510353504753331", "End Date", "End Date", false, ims.rules.types.RulesEngineFieldType.DATE, null, 0, "EndDate", this));
		super.actions = new ArrayList<ims.rules.types.RulesEngineEntityMethod>();
	}
}
