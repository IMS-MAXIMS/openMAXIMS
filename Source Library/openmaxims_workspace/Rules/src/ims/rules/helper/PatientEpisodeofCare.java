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

public final class PatientEpisodeofCare extends ims.rules.types.RulesEngineEntity
{
	private static final long serialVersionUID = 1L;

	public PatientEpisodeofCare(List<ims.rules.types.RulesEngineEntity> entities)
	{
		super.id = "1004100018";
		if(entities.contains(this))
			return;
		else
			entities.add(this);

		int fieldEntityIndex = -1;
		super.name = "Patient Episode of Care";
		super.isPublic = true;
		super.supportsNotifications = false;
		super.description = "Patient Episode of Care";
		super.businessObjectName = "ims.core.admin.domain.objects.EpisodeOfCare";
		super.fields = new ArrayList<ims.rules.types.RulesEngineField>();
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.HealthCareProfessional(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("12630402006327129133987480496", "Responsable HCP", "Responsable HCP", false, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.HealthCareProfessional(entities)), 0, "ResponsibleHCP", this));
		super.fields.add(new ims.rules.types.RulesEngineField("59648682006327129133981121265", "Start Date", "Start Date", false, ims.rules.types.RulesEngineFieldType.DATE, null, 0, "StartDate", this));
		super.fields.add(new ims.rules.types.RulesEngineField("16666962006327129133983762032", "End Date", "End Date", false, ims.rules.types.RulesEngineFieldType.DATE, null, 0, "EndDate", this));
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.PatientCareSpell(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("731674020063271210382401440018", "Patient Care Spell", "Patient Care Spell", false, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.PatientCareSpell(entities)), 0, "CareSpell", this));
		super.actions = new ArrayList<ims.rules.types.RulesEngineEntityMethod>();
	}
}
