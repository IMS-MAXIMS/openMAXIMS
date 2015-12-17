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

public final class TTAMedications extends ims.rules.types.RulesEngineEntity
{
	private static final long serialVersionUID = 1L;

	public TTAMedications(List<ims.rules.types.RulesEngineEntity> entities)
	{
		super.id = "1099100016";
		if(entities.contains(this))
			return;
		else
			entities.add(this);

		int fieldEntityIndex = -1;
		super.name = "TTA Medications";
		super.isPublic = true;
		super.supportsNotifications = false;
		super.description = "TTA Medications";
		super.businessObjectName = "ims.edischarge.domain.objects.TTAMedicationDetail";
		super.fields = new ArrayList<ims.rules.types.RulesEngineField>();
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.MedicationConfig(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("3080987201010191024335419958611", "Medication", "Medication", false, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.MedicationConfig(entities)), 0, "Medication", this));
		super.fields.add(new ims.rules.types.RulesEngineField("490206020101019113421953893442", "Dose Value", "Dose Value", false, ims.rules.types.RulesEngineFieldType.DECIMAL, null, 0, "DoseValue", this));
		super.fields.add(new ims.rules.types.RulesEngineField("686368020101019114182244275106", "Dose Unit", "Dose Unit", false, ims.rules.types.RulesEngineFieldType.LOOKUP, null, 1021015, "DoseUnit", this));
		super.fields.add(new ims.rules.types.RulesEngineField("36260262010102090353937322259", "Form", "Form", false, ims.rules.types.RulesEngineFieldType.LOOKUP, null, 1231071, "Form", this));
		super.fields.add(new ims.rules.types.RulesEngineField("55117502010102091146658392508", "Route", "Route", false, ims.rules.types.RulesEngineFieldType.LOOKUP, null, 1021035, "Route", this));
		super.fields.add(new ims.rules.types.RulesEngineField("32194302010102091577051863259", "Frequency Value", "Frequency Value", false, ims.rules.types.RulesEngineFieldType.INTEGER, null, 0, "FrequencyValue", this));
		super.fields.add(new ims.rules.types.RulesEngineField("75176022010102091577058222490", "Frequency Unit", "Frequency Unit", false, ims.rules.types.RulesEngineFieldType.LOOKUP, null, 1021038, "FrequencyUnit", this));
		super.fields.add(new ims.rules.types.RulesEngineField("82770392010102094153904316509", "Duration Value", "Duration Value", false, ims.rules.types.RulesEngineFieldType.INTEGER, null, 0, "DurationValue", this));
		super.fields.add(new ims.rules.types.RulesEngineField("27501932010102095408254013839", "Duration Unit", "Duration Unit", false, ims.rules.types.RulesEngineFieldType.LOOKUP, null, 1231112, "DurationUnit", this));
		super.fields.add(new ims.rules.types.RulesEngineField("3988029201010191024335618835436", "Commencement Date", "Commencement Date", false, ims.rules.types.RulesEngineFieldType.DATE, null, 0, "CommencedDate", this));
		super.fields.add(new ims.rules.types.RulesEngineField("79913562010102096399494759896", "Clinical Comments For Pharmacy", "Clinical Comments For Pharmacy", false, ims.rules.types.RulesEngineFieldType.STRING, null, 0, "ClinicalCommentsForPharmacy", this));
		super.fields.add(new ims.rules.types.RulesEngineField("38671402010102097207598876960", "Medication Instructions For Patient", "Medication Instructions For Patient", false, ims.rules.types.RulesEngineFieldType.STRING, null, 0, "MedicationInstructionsForPatient", this));
		super.fields.add(new ims.rules.types.RulesEngineField("285851420101020914123867658997", "Prescriber Contacted", "Prescriber Contacted", false, ims.rules.types.RulesEngineFieldType.BOOLEAN, null, 0, "PrescriberContacted", this));
		super.actions = new ArrayList<ims.rules.types.RulesEngineEntityMethod>();
	}
}
