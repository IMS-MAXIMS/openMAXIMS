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

public final class PatientDiagnosis extends ims.rules.types.RulesEngineEntity
{
	private static final long serialVersionUID = 1L;

	public PatientDiagnosis(List<ims.rules.types.RulesEngineEntity> entities)
	{
		super.id = "1003100016";
		if(entities.contains(this))
			return;
		else
			entities.add(this);

		int fieldEntityIndex = -1;
		super.name = "Patient Diagnosis";
		super.isPublic = true;
		super.supportsNotifications = false;
		super.description = "Patient Diagnosis";
		super.businessObjectName = "ims.core.clinical.domain.objects.PatientDiagnosis";
		super.fields = new ArrayList<ims.rules.types.RulesEngineField>();
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.Diagnosis(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("92958662004721954177348839645", "Diagnosis", "Diagnosis", false, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.Diagnosis(entities)), 0, "Diagnosis", this));
		super.fields.add(new ims.rules.types.RulesEngineField("203543820062221459554993543154", "Is this diagnosis a complication", "Is this diagnosis a complication", false, ims.rules.types.RulesEngineFieldType.BOOLEAN, null, 0, "isComplication", this));
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.DiagnosisCurrentStatus(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("27804072006222151307167276730", "Diagnosis Current Status", "Diagnosis Current Status", false, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.DiagnosisCurrentStatus(entities)), 0, "CurrentStatus", this));
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.PatientCareContext(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("42647322006327173572884052657", "Care Context", "Care Context", false, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.PatientCareContext(entities)), 0, "CareContext", this));
		super.fields.add(new ims.rules.types.RulesEngineField("898120820089241222374602805311", "Is the Diagnosis a comorbidity", "Is the Diagnosis a comorbidity", false, ims.rules.types.RulesEngineFieldType.BOOLEAN, null, 0, "isComorbidity", this));
		super.fields.add(new ims.rules.types.RulesEngineField("56035582009310922369056541661", "is a Previous Relevant Diagnosis", "is a Previous Relevant Diagnosis", false, ims.rules.types.RulesEngineFieldType.BOOLEAN, null, 0, "isPrevRelevantDiagnosis", this));
		super.actions = new ArrayList<ims.rules.types.RulesEngineEntityMethod>();
	}
}
