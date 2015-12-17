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

public final class InvestigationIndex extends ims.rules.types.RulesEngineEntity
{
	private static final long serialVersionUID = 1L;

	public InvestigationIndex(List<ims.rules.types.RulesEngineEntity> entities)
	{
		super.id = "1061100003";
		if(entities.contains(this))
			return;
		else
			entities.add(this);

		int fieldEntityIndex = -1;
		super.name = "Investigation Index";
		super.isPublic = true;
		super.supportsNotifications = false;
		super.description = "Investigation Index";
		super.businessObjectName = "ims.ocrr.configuration.domain.objects.InvestigationIndex";
		super.fields = new ArrayList<ims.rules.types.RulesEngineField>();
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.TaxonomyMapping(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("929450720055101616492536374757", "Code Mappings", "Code Mappings", true, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.TaxonomyMapping(entities)), 0, "TaxonomyMap", this));
		super.actions = new ArrayList<ims.rules.types.RulesEngineEntityMethod>();
	}
}
