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

public final class PatientICPPhase extends ims.rules.types.RulesEngineEntity
{
	private static final long serialVersionUID = 1L;

	public PatientICPPhase(List<ims.rules.types.RulesEngineEntity> entities)
	{
		super.id = "1100100003";
		if(entities.contains(this))
			return;
		else
			entities.add(this);

		int fieldEntityIndex = -1;
		super.name = "Patient ICP Phase";
		super.isPublic = true;
		super.supportsNotifications = false;
		super.description = "Patient ICP Phase Instantiation";
		super.businessObjectName = "ims.icps.instantiation.domain.objects.PatientICPPhase";
		super.fields = new ArrayList<ims.rules.types.RulesEngineField>();
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.Patient(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("20796132009519114566287169185", "Patient", "Patient", false, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.Patient(entities)), 0, "Patient", this));
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.PatientCareContext(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("67814412009519114566289809952", "Care Context", "The Care Context in which the Patient ICP record was recorded", false, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.PatientCareContext(entities)), 0, "CareContext", this));
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.PatientICP(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("24832692009519114566283450720", "Patient ICP", "Patient ICP", false, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.PatientICP(entities)), 0, "ICP", this));
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.ICPPhaseConfiguration(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("302615220095182126313007811861", "Phase", "ICP Phase Configuration", false, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.ICPPhaseConfiguration(entities)), 0, "Phase", this));
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.PatientICPAction(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("307092320095182132592869961944", "Actions for the ICP Phase", "The Actions for the ICP Phase", true, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.PatientICPAction(entities)), 0, "PhaseActions", this));
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.PatientICPStage(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("29507382009519114606596404153", "The Stage for this phase", "The Stage for this phase", false, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.PatientICPStage(entities)), 0, "ParentStage", this));
		super.actions = new ArrayList<ims.rules.types.RulesEngineEntityMethod>();
	}
}
