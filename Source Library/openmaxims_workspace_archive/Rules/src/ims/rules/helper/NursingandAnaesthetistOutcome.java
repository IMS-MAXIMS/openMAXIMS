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

public final class NursingandAnaesthetistOutcome extends ims.rules.types.RulesEngineEntity
{
	private static final long serialVersionUID = 1L;

	public NursingandAnaesthetistOutcome(List<ims.rules.types.RulesEngineEntity> entities)
	{
		super.id = "1096100024";
		if(entities.contains(this))
			return;
		else
			entities.add(this);

		int fieldEntityIndex = -1;
		super.name = "Nursing and Anaesthetist Outcome";
		super.isPublic = true;
		super.supportsNotifications = false;
		super.description = "Nursing and Anaesthetist Outcome";
		super.businessObjectName = "ims.RefMan.domain.objects.FitForSurgeryAssesment";
		super.fields = new ArrayList<ims.rules.types.RulesEngineField>();
		super.fields.add(new ims.rules.types.RulesEngineField("id", "Code", "Code", false, ims.rules.types.RulesEngineFieldType.ENTITY_CODE, null, 0, "Id", this));
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.PatientCareContext(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("98352712009721654326933984504", "Care Context", "Care Context", false, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.PatientCareContext(entities)), 0, "CareContext", this));
		super.fields.add(new ims.rules.types.RulesEngineField("95343122009721622137657979267", "ASA Score", "ASA Score", false, ims.rules.types.RulesEngineFieldType.INTEGER, null, 0, "ASAScore", this));
		super.fields.add(new ims.rules.types.RulesEngineField("62627662009721623157486360847", "Is patient fit for surgery", "Is patient fit for surgery", false, ims.rules.types.RulesEngineFieldType.BOOLEAN, null, 0, "FitForSurgery", this));
		super.actions = new ArrayList<ims.rules.types.RulesEngineEntityMethod>();
		java.util.List<ims.rules.types.RulesEngineEntityMethodArgument> arguments = null;
		arguments = new ArrayList<ims.rules.types.RulesEngineEntityMethodArgument>();
		arguments.add(new ims.rules.types.RulesEngineEntityMethodArgument("9434473200910201531146316668273", "stage", "stage", "Patient ICP Stage", ims.rules.types.RulesEngineMethodArgumentType.STRING));
		super.actions.add(new ims.rules.types.RulesEngineEntityMethod("7291892200910201531198574752131", "Bring Stage Into Scope", "bringStageIntoScope", "Bring a Patient ICP Stage its associated Phases", arguments));
		arguments = new ArrayList<ims.rules.types.RulesEngineEntityMethodArgument>();
		arguments.add(new ims.rules.types.RulesEngineEntityMethodArgument("4629639200910201531366487583720", "phase", "phase", "Patient ICP Phase", ims.rules.types.RulesEngineMethodArgumentType.STRING));
		super.actions.add(new ims.rules.types.RulesEngineEntityMethod("4243326200910201531418429133956", "Bring Phase Into Scope", "bringPhaseIntoScope", "Bring a Patient ICP Phase and its actions into Scope", arguments));
	}
}
