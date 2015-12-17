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

public final class SystemLog extends ims.rules.types.RulesEngineEntity
{
	private static final long serialVersionUID = 1L;

	public SystemLog(List<ims.rules.types.RulesEngineEntity> entities)
	{
		super.id = "1004100037";
		if(entities.contains(this))
			return;
		else
			entities.add(this);

		super.name = "System Log";
		super.isPublic = true;
		super.supportsNotifications = false;
		super.description = "System Log";
		super.businessObjectName = "ims.core.admin.domain.objects.SystemLog";
		super.fields = new ArrayList<ims.rules.types.RulesEngineField>();
		super.fields.add(new ims.rules.types.RulesEngineField("id", "Code", "Code", false, ims.rules.types.RulesEngineFieldType.ENTITY_CODE, null, 0, "Id", this));
		super.fields.add(new ims.rules.types.RulesEngineField("11406872008930125054386502086", "Date and Time", "Date and Time", false, ims.rules.types.RulesEngineFieldType.DATETIME, null, 0, "EventDateTime", this));
		super.fields.add(new ims.rules.types.RulesEngineField("84934302008930125224664872884", "Event Type", "Event Type", false, ims.rules.types.RulesEngineFieldType.INTEGER, null, 0, "EventType", this));
		super.fields.add(new ims.rules.types.RulesEngineField("513363720089301252216116578983", "Event Level", "Event Level", false, ims.rules.types.RulesEngineFieldType.INTEGER, null, 0, "EventLevel", this));
		super.fields.add(new ims.rules.types.RulesEngineField("877968420089301252579723060785", "User", "User", false, ims.rules.types.RulesEngineFieldType.STRING, null, 0, "User", this));
		super.fields.add(new ims.rules.types.RulesEngineField("427218820089301251164966173859", "Source", "Source", false, ims.rules.types.RulesEngineFieldType.STRING, null, 0, "Source", this));
		super.fields.add(new ims.rules.types.RulesEngineField("432259220089301253229184685413", "Computer", "Computer", false, ims.rules.types.RulesEngineFieldType.STRING, null, 0, "Computer", this));
		super.fields.add(new ims.rules.types.RulesEngineField("60662472008106845426222631363", "User Agent", "User Agent", false, ims.rules.types.RulesEngineFieldType.STRING, null, 0, "UserAgent", this));
		super.fields.add(new ims.rules.types.RulesEngineField("545336120089301253523679783002", "Message", "Message", false, ims.rules.types.RulesEngineFieldType.STRING, null, 0, "Message", this));
		super.fields.add(new ims.rules.types.RulesEngineField("7458009200924163092422310449", "Application Server", "Application Server", false, ims.rules.types.RulesEngineFieldType.STRING, null, 0, "AppServer", this));
		super.actions = new ArrayList<ims.rules.types.RulesEngineEntityMethod>();
	}
}
