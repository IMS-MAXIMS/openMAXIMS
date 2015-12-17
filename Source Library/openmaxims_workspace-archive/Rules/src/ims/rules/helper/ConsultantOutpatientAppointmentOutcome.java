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

public final class ConsultantOutpatientAppointmentOutcome extends ims.rules.types.RulesEngineEntity
{
	private static final long serialVersionUID = 1L;

	public ConsultantOutpatientAppointmentOutcome(List<ims.rules.types.RulesEngineEntity> entities)
	{
		super.id = "1096100015";
		if(entities.contains(this))
			return;
		else
			entities.add(this);

		int fieldEntityIndex = -1;
		super.name = "Consultant Outpatient Appointment Outcome";
		super.isPublic = true;
		super.supportsNotifications = false;
		super.description = "Consultant Outpatient Appointment Outcome";
		super.businessObjectName = "ims.RefMan.domain.objects.SuitableForSurgeryAssessment";
		super.fields = new ArrayList<ims.rules.types.RulesEngineField>();
		super.fields.add(new ims.rules.types.RulesEngineField("id", "Code", "Code", false, ims.rules.types.RulesEngineFieldType.ENTITY_CODE, null, 0, "Id", this));
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.PatientCareContext(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("35102302009721655268481005723", "Care Context", "Care Context", false, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.PatientCareContext(entities)), 0, "CareContext", this));
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.PatientProcedure(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("7055738200972152215142135122", "Procedure", "Procedure", false, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.PatientProcedure(entities)), 0, "Procedure", this));
		super.fields.add(new ims.rules.types.RulesEngineField("93858952009721526213231502404", "Is Suitable for Surgery", "Is Suitable for Surgery", false, ims.rules.types.RulesEngineFieldType.LOOKUP, null, 1021014, "SuitableForSurgery", this));
		super.fields.add(new ims.rules.types.RulesEngineField("48119192010621353259231482734", "Is Procedure Performed", "Is Procedure Performed", false, ims.rules.types.RulesEngineFieldType.BOOLEAN, null, 0, "ProcedurePerformed", this));
		super.actions = new ArrayList<ims.rules.types.RulesEngineEntityMethod>();
		java.util.List<ims.rules.types.RulesEngineEntityMethodArgument> arguments = null;
		arguments = new ArrayList<ims.rules.types.RulesEngineEntityMethodArgument>();
		arguments.add(new ims.rules.types.RulesEngineEntityMethodArgument("2508071200910201529453609012260", "stage", "stage", "Patient ICP Stage", ims.rules.types.RulesEngineMethodArgumentType.STRING));
		super.actions.add(new ims.rules.types.RulesEngineEntityMethod("7340651200910201529595801526764", "Bring Stage Into Scope", "bringStageIntoScope", "Bring a Patient ICP Stage its associated Phases and actions into Scope", arguments));
		arguments = new ArrayList<ims.rules.types.RulesEngineEntityMethodArgument>();
		arguments.add(new ims.rules.types.RulesEngineEntityMethodArgument("5548935200910201530198631075342", "phase", "phase", "Patient ICP Phase", ims.rules.types.RulesEngineMethodArgumentType.STRING));
		super.actions.add(new ims.rules.types.RulesEngineEntityMethod("1531553200910201530286461907638", "Bring Phase Into Scope", "bringPhaseIntoScope", "Bring a Patient ICP Phase and its actions into Scope", arguments));
	}
}
