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

public final class DischargeSummaryPACUandWard extends ims.rules.types.RulesEngineEntity
{
	private static final long serialVersionUID = 1L;

	public DischargeSummaryPACUandWard(List<ims.rules.types.RulesEngineEntity> entities)
	{
		super.id = "1096100034";
		if(entities.contains(this))
			return;
		else
			entities.add(this);

		int fieldEntityIndex = -1;
		super.name = "Discharge Summary PACU and Ward";
		super.isPublic = true;
		super.supportsNotifications = false;
		super.description = "Discharge Summary PACU and Ward";
		super.businessObjectName = "ims.RefMan.domain.objects.DischargeSummaryPacuAndWard";
		super.fields = new ArrayList<ims.rules.types.RulesEngineField>();
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.PatientReferral(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("37598732009831124639944663960", "Patient Referral", "Patient Referral", false, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.PatientReferral(entities)), 0, "CatsReferral", this));
		super.fields.add(new ims.rules.types.RulesEngineField("284149320098318113284479591", "Discharge Type", "Discharge Type", false, ims.rules.types.RulesEngineFieldType.LOOKUP, null, 1341003, "DischargeType", this));
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.PatientDiagnosis(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("91973712009831813504345693341", "Patient Diagnosis", "Patient Diagnosis", true, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.PatientDiagnosis(entities)), 0, "Diagnosis", this));
		super.fields.add(new ims.rules.types.RulesEngineField("66241282009831810106423154709", "Followup Management Type", "Followup Management Type", false, ims.rules.types.RulesEngineFieldType.LOOKUP, null, 1341013, "FollowupType", this));
		super.fields.add(new ims.rules.types.RulesEngineField("62204732009831810106426873173", "Medically Incomplete Reason", "Medically Incomplete Reason", false, ims.rules.types.RulesEngineFieldType.LOOKUP, null, 1341010, "MedicallyIncomplete", this));
		super.actions = new ArrayList<ims.rules.types.RulesEngineEntityMethod>();
	}
}
