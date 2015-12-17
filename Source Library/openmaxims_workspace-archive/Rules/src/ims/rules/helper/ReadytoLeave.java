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

public final class ReadytoLeave extends ims.rules.types.RulesEngineEntity
{
	private static final long serialVersionUID = 1L;

	public ReadytoLeave(List<ims.rules.types.RulesEngineEntity> entities)
	{
		super.id = "1099100006";
		if(entities.contains(this))
			return;
		else
			entities.add(this);

		int fieldEntityIndex = -1;
		super.name = "Ready to Leave";
		super.isPublic = true;
		super.supportsNotifications = false;
		super.description = "Ready to Leave";
		super.businessObjectName = "ims.edischarge.domain.objects.ReadyToLeave";
		super.fields = new ArrayList<ims.rules.types.RulesEngineField>();
		super.fields.add(new ims.rules.types.RulesEngineField("589434220098792427467785589", "Nurse Enabled Discharge Confirmation", "Nurse Enabled Discharge Confirmation", false, ims.rules.types.RulesEngineFieldType.STRING, null, 0, "NurseEnabledDischargeConfirmation", this));
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.DischargeDetails(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("155981420098111440277424139592", "Discharge Details", "Discharge Details", false, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.DischargeDetails(entities)), 0, "DischargeDetails", this));
		super.fields.add(new ims.rules.types.RulesEngineField("4663267201010201432355437235613", "Comments From Patient", "Comments From Patient", false, ims.rules.types.RulesEngineFieldType.STRING, null, 0, "CommentsFromPatient", this));
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.HealthCareProfessional(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("773627720101020154533586435396", "Discharging Nurse", "Discharging Nurse", false, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.HealthCareProfessional(entities)), 0, "DischargingNurse", this));
		super.fields.add(new ims.rules.types.RulesEngineField("5540769201010201552538249250712", "Clinical Discharge Date and Time", "Clinical Discharge Date and Time", false, ims.rules.types.RulesEngineFieldType.DATETIME, null, 0, "ClinicalDischargeDateTime", this));
		super.fields.add(new ims.rules.types.RulesEngineField("8926452201010281515445518482371", "Is Complete", "Is Complete", false, ims.rules.types.RulesEngineFieldType.BOOLEAN, null, 0, "IsComplete", this));
		super.actions = new ArrayList<ims.rules.types.RulesEngineEntityMethod>();
	}
}
