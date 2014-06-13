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

public final class Patient extends ims.rules.types.RulesEngineEntity
{
	private static final long serialVersionUID = 1L;

	public Patient(List<ims.rules.types.RulesEngineEntity> entities)
	{
		super.id = "1001100000";
		if(entities.contains(this))
			return;
		else
			entities.add(this);

		int fieldEntityIndex = -1;
		super.name = "Patient";
		super.isPublic = true;
		super.supportsNotifications = false;
		super.description = "";
		super.businessObjectName = "ims.core.patient.domain.objects.Patient";
		super.fields = new ArrayList<ims.rules.types.RulesEngineField>();
		super.fields.add(new ims.rules.types.RulesEngineField("id", "Code", "Code", false, ims.rules.types.RulesEngineFieldType.ENTITY_CODE, null, 0, "Id", this));
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.Name(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("987323320045182015588271899761", "Name", "", false, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.Name(entities)), 0, "name", this));
		super.fields.add(new ims.rules.types.RulesEngineField("487243720045182016102175588570", "Sex", "", false, ims.rules.types.RulesEngineFieldType.LOOKUP, null, 1021000, "sex", this));
		super.fields.add(new ims.rules.types.RulesEngineField("334642020045182016193747146379", "Date of Birth", "", false, ims.rules.types.RulesEngineFieldType.PARTIALDATE, null, 0, "dob", this));
		super.fields.add(new ims.rules.types.RulesEngineField("772103620045182017585488419332", "Date of Death", "", false, ims.rules.types.RulesEngineFieldType.DATE, null, 0, "dod", this));
		super.fields.add(new ims.rules.types.RulesEngineField("914714020102161022537353110763", "Save Complete", "Save Complete", false, ims.rules.types.RulesEngineFieldType.BOOLEAN, null, 0, "SaveComplete", this));
		super.fields.add(new ims.rules.types.RulesEngineField("654898220102161156335119392937", "Is New Patient", "Is New Patient", false, ims.rules.types.RulesEngineFieldType.BOOLEAN, null, 0, "IsNewPatient", this));
		super.actions = new ArrayList<ims.rules.types.RulesEngineEntityMethod>();
		java.util.List<ims.rules.types.RulesEngineEntityMethodArgument> arguments = null;
		arguments = new ArrayList<ims.rules.types.RulesEngineEntityMethodArgument>();
		arguments.add(new ims.rules.types.RulesEngineEntityMethodArgument("1506933200952592716502973706", "Message", "message", "Message to be included", ims.rules.types.RulesEngineMethodArgumentType.STRING));
		arguments.add(new ims.rules.types.RulesEngineEntityMethodArgument("183770820095271533185038366687", "AlertType", "alertType", "Alert Type", ims.rules.types.RulesEngineMethodArgumentType.INTEGER));
		super.actions.add(new ims.rules.types.RulesEngineEntityMethod("703950220095221253427916017607", "Create HCP Alert", "createHCPAlert", "Creates a HCP Alert", arguments));
		arguments = new ArrayList<ims.rules.types.RulesEngineEntityMethodArgument>();
		super.actions.add(new ims.rules.types.RulesEngineEntityMethod("15106612009525115939917029999", "Notify Administrators", "notifyAdministors", "Notify the administrators", arguments));
		arguments = new ArrayList<ims.rules.types.RulesEngineEntityMethodArgument>();
		super.actions.add(new ims.rules.types.RulesEngineEntityMethod("3166921200912171946361849885972", "triggerDemographicsMessage", "triggerDemographicsMessage", "triggerDemographicsMessage", arguments));
	}
}
