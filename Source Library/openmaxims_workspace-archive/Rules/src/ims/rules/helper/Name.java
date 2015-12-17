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

public final class Name extends ims.rules.types.RulesEngineEntity
{
	private static final long serialVersionUID = 1L;

	public Name(List<ims.rules.types.RulesEngineEntity> entities)
	{
		super.id = "1002100001";
		if(entities.contains(this))
			return;
		else
			entities.add(this);

		super.name = "Name";
		super.isPublic = false;
		super.supportsNotifications = false;
		super.description = "";
		super.businessObjectName = "ims.core.generic.domain.objects.PersonName";
		super.fields = new ArrayList<ims.rules.types.RulesEngineField>();
		super.fields.add(new ims.rules.types.RulesEngineField("492523620044301132455932389921", "Surname", "", false, ims.rules.types.RulesEngineFieldType.STRING, null, 0, "surname", this));
		super.fields.add(new ims.rules.types.RulesEngineField("750556520044301132594203610250", "Forename", "", false, ims.rules.types.RulesEngineFieldType.STRING, null, 0, "forename", this));
		super.fields.add(new ims.rules.types.RulesEngineField("65698802004430113397483613162", "Middle Name", "", false, ims.rules.types.RulesEngineFieldType.STRING, null, 0, "middleName", this));
		super.fields.add(new ims.rules.types.RulesEngineField("29469282004541537163269967709", "Title", "", false, ims.rules.types.RulesEngineFieldType.LOOKUP, null, 1021002, "title", this));
		super.actions = new ArrayList<ims.rules.types.RulesEngineEntityMethod>();
	}
}
