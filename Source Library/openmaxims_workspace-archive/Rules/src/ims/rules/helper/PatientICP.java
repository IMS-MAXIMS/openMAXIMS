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

public final class PatientICP extends ims.rules.types.RulesEngineEntity
{
	private static final long serialVersionUID = 1L;

	public PatientICP(List<ims.rules.types.RulesEngineEntity> entities)
	{
		super.id = "1100100000";
		if(entities.contains(this))
			return;
		else
			entities.add(this);

		int fieldEntityIndex = -1;
		super.name = "Patient ICP";
		super.isPublic = true;
		super.supportsNotifications = false;
		super.description = "Patient ICP Instantiation";
		super.businessObjectName = "ims.icps.instantiation.domain.objects.PatientICP";
		super.fields = new ArrayList<ims.rules.types.RulesEngineField>();
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.Patient(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("753529020095191110377129694690", "Patient", "Patient", false, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.Patient(entities)), 0, "Patient", this));
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.PatientCareContext(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("50061932009518145271512582277", "Care Context", "The Care Context in which the Patient ICP record was recorded", false, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.PatientCareContext(entities)), 0, "CareContext", this));
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.ICPConfiguration(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("830858420095181452457484544575", "ICP Configuration", "ICP Configuration Record", false, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.ICPConfiguration(entities)), 0, "ICP", this));
		super.fields.add(new ims.rules.types.RulesEngineField("613611420095181452118555667932", "Date that the ICP started", "Date that the ICP started", false, ims.rules.types.RulesEngineFieldType.DATETIME, null, 0, "StartedDateTime", this));
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.PatientICPStage(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("58369722009519119391804184295", "The stages for the Patient ICP", "The stages for the Patient ICP", true, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.PatientICPStage(entities)), 0, "Stages", this));
		super.fields.add(new ims.rules.types.RulesEngineField("54098492009518145271517863811", "Date the ICP was completed", "The date the ICP was completed", false, ims.rules.types.RulesEngineFieldType.DATETIME, null, 0, "CompletedDateTime", this));
		super.actions = new ArrayList<ims.rules.types.RulesEngineEntityMethod>();
		java.util.List<ims.rules.types.RulesEngineEntityMethodArgument> arguments = null;
		arguments = new ArrayList<ims.rules.types.RulesEngineEntityMethodArgument>();
		arguments.add(new ims.rules.types.RulesEngineEntityMethodArgument("972412820091111926582175830293", "Stage", "stageID", "Stage Identifier", ims.rules.types.RulesEngineMethodArgumentType.STRING));
		super.actions.add(new ims.rules.types.RulesEngineEntityMethod("43817932009111192845393980362", "Bring Stage Into Scope", "bringStageIntoScope", "Bring Stage Into Scope", arguments));
		arguments = new ArrayList<ims.rules.types.RulesEngineEntityMethodArgument>();
		arguments.add(new ims.rules.types.RulesEngineEntityMethodArgument("301524620091111928455571911095", "Phase", "phaseID", "Phase Code", ims.rules.types.RulesEngineMethodArgumentType.STRING));
		super.actions.add(new ims.rules.types.RulesEngineEntityMethod("516182020091111928595879815908", "Bring Phase Into Scope", "bringPhaseIntoScope", "Bring Phase Into Scope", arguments));
		arguments = new ArrayList<ims.rules.types.RulesEngineEntityMethodArgument>();
		arguments.add(new ims.rules.types.RulesEngineEntityMethodArgument("5048953201198152371308116579", "phaseID", "phaseID", "represents the configuration ID", ims.rules.types.RulesEngineMethodArgumentType.STRING));
		super.actions.add(new ims.rules.types.RulesEngineEntityMethod("913670220119815259983027257", "Remove Phase From Scope", "removePhaseFromScope", "Moves the PatientICPPhase (for the configuration ICPPhase id provided) outside the scope of this PatientICP ", arguments));
		arguments = new ArrayList<ims.rules.types.RulesEngineEntityMethodArgument>();
		arguments.add(new ims.rules.types.RulesEngineEntityMethodArgument("9394049201199718444747013911", "StageID", "stageID", "Configuration stage ID passed as a string.", ims.rules.types.RulesEngineMethodArgumentType.STRING));
		super.actions.add(new ims.rules.types.RulesEngineEntityMethod("3606580201199718474436714624", "Remove Stage From Scope", "removeStageFromScope", "Function used to remove an action from scope", arguments));
	}
}
