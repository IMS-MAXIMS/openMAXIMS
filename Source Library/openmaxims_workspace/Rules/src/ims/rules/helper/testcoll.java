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

public final class testcoll extends ims.rules.types.RulesEngineEntity
{
	private static final long serialVersionUID = 1L;

	public testcoll(List<ims.rules.types.RulesEngineEntity> entities)
	{
		super.id = "1004100044";
		if(entities.contains(this))
			return;
		else
			entities.add(this);

		int fieldEntityIndex = -1;
		super.name = "testcoll";
		super.isPublic = true;
		super.supportsNotifications = false;
		super.description = "testcoll";
		super.businessObjectName = "ims.core.admin.domain.objects.TestColl";
		super.fields = new ArrayList<ims.rules.types.RulesEngineField>();
		super.fields.add(new ims.rules.types.RulesEngineField("id", "Code", "Code", false, ims.rules.types.RulesEngineFieldType.ENTITY_CODE, null, 0, "Id", this));
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.TestColl2(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("1358026200910301056274472388386", "TestColl2", "TestColl2 Desc", true, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.TestColl2(entities)), 0, "Coll2Field", this));
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.Test(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("809146120091030143313612034498", "Test", "Test Desc", false, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.Test(entities)), 0, "SimpleField", this));
		super.actions = new ArrayList<ims.rules.types.RulesEngineEntityMethod>();
	}
}
