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

public final class MedicationOnAdmissionandChanges extends ims.rules.types.RulesEngineEntity
{
	private static final long serialVersionUID = 1L;

	public MedicationOnAdmissionandChanges(List<ims.rules.types.RulesEngineEntity> entities)
	{
		super.id = "1099100014";
		if(entities.contains(this))
			return;
		else
			entities.add(this);

		super.name = "Medication On Admission and Changes";
		super.isPublic = true;
		super.supportsNotifications = false;
		super.description = "Medication On Admission and Changes";
		super.businessObjectName = "ims.edischarge.domain.objects.MedicationOnAdmissionAndChanges";
		super.fields = new ArrayList<ims.rules.types.RulesEngineField>();
		super.fields.add(new ims.rules.types.RulesEngineField("600603520101015112336384208284", "Record Medication On Admission", "Record Medication On Admission", false, ims.rules.types.RulesEngineFieldType.LOOKUP, null, 1021145, "RecordMedicationOnAdmission", this));
		super.fields.add(new ims.rules.types.RulesEngineField("5291971201010151121575841960306", "Medication On Admission Details", "Medication On Admission Details", false, ims.rules.types.RulesEngineFieldType.STRING, null, 0, "MedicationOnAdmission", this));
		super.fields.add(new ims.rules.types.RulesEngineField("9993798201010151121575844601073", "Medication Changes", "Medication Changes", false, ims.rules.types.RulesEngineFieldType.STRING, null, 0, "MedicationChanges", this));
		super.fields.add(new ims.rules.types.RulesEngineField("7282496201010151121331545824274", "is Complete", "is Complete", false, ims.rules.types.RulesEngineFieldType.BOOLEAN, null, 0, "isComplete", this));
		super.actions = new ArrayList<ims.rules.types.RulesEngineEntityMethod>();
	}
}
