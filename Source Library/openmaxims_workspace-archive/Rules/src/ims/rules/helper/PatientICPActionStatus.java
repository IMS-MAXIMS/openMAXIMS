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

public final class PatientICPActionStatus extends ims.rules.types.RulesEngineEntity
{
	private static final long serialVersionUID = 1L;

	public PatientICPActionStatus(List<ims.rules.types.RulesEngineEntity> entities)
	{
		super.id = "1100100006";
		if(entities.contains(this))
			return;
		else
			entities.add(this);

		int fieldEntityIndex = -1;
		super.name = "Patient ICP Action Status";
		super.isPublic = true;
		super.supportsNotifications = false;
		super.description = "Patient ICP Action Status";
		super.businessObjectName = "ims.icps.instantiation.domain.objects.PatientICPActionStatus";
		super.fields = new ArrayList<ims.rules.types.RulesEngineField>();
		super.fields.add(new ims.rules.types.RulesEngineField("340540420095182139175704225017", "Date and Time of Status Change", "Date and Time of Status Change", false, ims.rules.types.RulesEngineFieldType.DATETIME, null, 0, "StatusDate", this));
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.MemberofStaff(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("810723220095182139175706865784", "Name of User responsible for status change", "Name of User responsible for status change", false, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.MemberofStaff(entities)), 0, "ChangedBy", this));
		super.fields.add(new ims.rules.types.RulesEngineField("380906020095182139175709506551", "The status of the Patient ICP Action", "The status of the Patient ICP Action", false, ims.rules.types.RulesEngineFieldType.LOOKUP, null, 1181014, "Status", this));
		super.actions = new ArrayList<ims.rules.types.RulesEngineEntityMethod>();
	}
}
