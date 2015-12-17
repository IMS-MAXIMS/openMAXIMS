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

public final class Diagnosis extends ims.rules.types.RulesEngineEntity
{
	private static final long serialVersionUID = 1L;

	public Diagnosis(List<ims.rules.types.RulesEngineEntity> entities)
	{
		super.id = "1003100025";
		if(entities.contains(this))
			return;
		else
			entities.add(this);

		int fieldEntityIndex = -1;
		super.name = "Diagnosis";
		super.isPublic = true;
		super.supportsNotifications = false;
		super.description = "Diagnosis Configuration";
		super.businessObjectName = "ims.core.clinical.domain.objects.Diagnosis";
		super.fields = new ArrayList<ims.rules.types.RulesEngineField>();
		super.fields.add(new ims.rules.types.RulesEngineField("id", "Code", "Code", false, ims.rules.types.RulesEngineFieldType.ENTITY_CODE, null, 0, "Id", this));
		super.fields.add(new ims.rules.types.RulesEngineField("1905443200472116496233348971", "Diagnosis Name", "Diagnosis Name", false, ims.rules.types.RulesEngineFieldType.STRING, null, 0, "DiagnosisName", this));
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.TaxonomyMapping(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("58184162004824105674999159677", "External Mapping", "External Mapping", true, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.TaxonomyMapping(entities)), 0, "taxonomyMap", this));
		super.actions = new ArrayList<ims.rules.types.RulesEngineEntityMethod>();
	}
}
