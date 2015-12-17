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

public final class Test extends ims.rules.types.RulesEngineEntity
{
	private static final long serialVersionUID = 1L;

	public Test(List<ims.rules.types.RulesEngineEntity> entities)
	{
		super.id = "1004100042";
		if(entities.contains(this))
			return;
		else
			entities.add(this);

		int fieldEntityIndex = -1;
		super.name = "Test";
		super.isPublic = true;
		super.supportsNotifications = true;
		super.description = "Test";
		super.businessObjectName = "ims.core.admin.domain.objects.Test";
		super.fields = new ArrayList<ims.rules.types.RulesEngineField>();
		super.fields.add(new ims.rules.types.RulesEngineField("id", "Code", "Code", false, ims.rules.types.RulesEngineFieldType.ENTITY_CODE, null, 0, "Id", this));
		super.fields.add(new ims.rules.types.RulesEngineField("47709562009610153744188131453", "StringField", "StringField", false, ims.rules.types.RulesEngineFieldType.STRING, null, 0, "StringField", this));
		super.fields.add(new ims.rules.types.RulesEngineField("25232772009610153814348560228", "IntField", "z", false, ims.rules.types.RulesEngineFieldType.INTEGER, null, 0, "IntField", this));
		super.fields.add(new ims.rules.types.RulesEngineField("575132520096101538164106568272", "BooleanField", "z", false, ims.rules.types.RulesEngineFieldType.BOOLEAN, null, 0, "BooleanField", this));
		super.fields.add(new ims.rules.types.RulesEngineField("569371220096101538299154244492", "DecimalField", "z", false, ims.rules.types.RulesEngineFieldType.DECIMAL, null, 0, "DecimalField", this));
		super.fields.add(new ims.rules.types.RulesEngineField("31249122009610153938869877084", "DateField", "z", false, ims.rules.types.RulesEngineFieldType.DATE, null, 0, "DateField", this));
		super.fields.add(new ims.rules.types.RulesEngineField("955162520096101539475426824441", "TimeField", "z", false, ims.rules.types.RulesEngineFieldType.TIME, null, 0, "TimeField", this));
		super.fields.add(new ims.rules.types.RulesEngineField("457170620096101539595437292060", "DateTimeField", "z", false, ims.rules.types.RulesEngineFieldType.DATETIME, null, 0, "DateTimeField", this));
		super.fields.add(new ims.rules.types.RulesEngineField("737280920096101540124871124653", "PartialDateField", "z", false, ims.rules.types.RulesEngineFieldType.PARTIALDATE, null, 0, "PartialDateField", this));
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.testcoll(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("5045694200910301044164969864625", "TestColl", "TestColl Desc", true, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.testcoll(entities)), 0, "TestColl", this));
		super.actions = new ArrayList<ims.rules.types.RulesEngineEntityMethod>();
	}
}
