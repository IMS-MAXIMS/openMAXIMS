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

public final class Plastics extends ims.rules.types.RulesEngineEntity
{
	private static final long serialVersionUID = 1L;

	public Plastics(List<ims.rules.types.RulesEngineEntity> entities)
	{
		super.id = "1099100012";
		if(entities.contains(this))
			return;
		else
			entities.add(this);

		super.name = "Plastics";
		super.isPublic = true;
		super.supportsNotifications = false;
		super.description = "Plastics";
		super.businessObjectName = "ims.edischarge.domain.objects.PlasticSurgeryAndBurns";
		super.fields = new ArrayList<ims.rules.types.RulesEngineField>();
		super.fields.add(new ims.rules.types.RulesEngineField("5353632201010121615168523247957", "Skin For Storage", "Skin For Storage", false, ims.rules.types.RulesEngineFieldType.LOOKUP, null, 1021145, "SkinForStorage", this));
		super.fields.add(new ims.rules.types.RulesEngineField("114143120101012161687623991817", "Scheduled First Dressing Date", "Scheduled First Dressing Date", false, ims.rules.types.RulesEngineFieldType.DATE, null, 0, "ScheduledFirstDressingDate", this));
		super.fields.add(new ims.rules.types.RulesEngineField("7245220201010121616316106853749", "Scheduled Suture Removal", "Scheduled Suture Removal", false, ims.rules.types.RulesEngineFieldType.DATE, null, 0, "ScheduledSutureRemoval", this));
		super.fields.add(new ims.rules.types.RulesEngineField("7290711201010121617143496471579", "is Complete", "is Complete", false, ims.rules.types.RulesEngineFieldType.BOOLEAN, null, 0, "isComplete", this));
		super.actions = new ArrayList<ims.rules.types.RulesEngineEntityMethod>();
	}
}
