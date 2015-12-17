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

public final class PatientICPStage extends ims.rules.types.RulesEngineEntity
{
	private static final long serialVersionUID = 1L;

	public PatientICPStage(List<ims.rules.types.RulesEngineEntity> entities)
	{
		super.id = "1100100001";
		if(entities.contains(this))
			return;
		else
			entities.add(this);

		int fieldEntityIndex = -1;
		super.name = "Patient ICP Stage";
		super.isPublic = true;
		super.supportsNotifications = false;
		super.description = "Patient ICP Stage Instantiation";
		super.businessObjectName = "ims.icps.instantiation.domain.objects.PatientICPStage";
		super.fields = new ArrayList<ims.rules.types.RulesEngineField>();
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.Patient(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("266443420095191141428968723090", "Patient", "Patient", false, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.Patient(entities)), 0, "Patient", this));
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.PatientCareContext(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("696260520095191141428966082323", "Care Context", "The Care Context in which the Patient ICP record was recorded", false, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.PatientCareContext(entities)), 0, "CareContext", this));
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.PatientICP(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("347001120095191141429128073639", "Patient ICP", "Patient ICP", false, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.PatientICP(entities)), 0, "ICP", this));
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.ICPStageConfiguration(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("618889620095182112227507622974", "ICP Stage Configuration", "ICP Stage Configuration", false, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.ICPStageConfiguration(entities)), 0, "Stage", this));
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.PatientICPPhase(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("47367432009518212471542634758", "Phases for the ICP Stage", "The phases for the ICP Stage", true, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.PatientICPPhase(entities)), 0, "StagePhases", this));
		super.actions = new ArrayList<ims.rules.types.RulesEngineEntityMethod>();
	}
}
