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

public final class TTAandPharmacy extends ims.rules.types.RulesEngineEntity
{
	private static final long serialVersionUID = 1L;

	public TTAandPharmacy(List<ims.rules.types.RulesEngineEntity> entities)
	{
		super.id = "1099100015";
		if(entities.contains(this))
			return;
		else
			entities.add(this);

		int fieldEntityIndex = -1;
		super.name = "TTA and Pharmacy";
		super.isPublic = true;
		super.supportsNotifications = false;
		super.description = "TTA and Pharmacy";
		super.businessObjectName = "ims.edischarge.domain.objects.TTAMedicationAndPharmacy";
		super.fields = new ArrayList<ims.rules.types.RulesEngineField>();
		super.fields.add(new ims.rules.types.RulesEngineField("876377320101019103031064213356", "Body Weight", "Body Weight", false, ims.rules.types.RulesEngineFieldType.DECIMAL, null, 0, "BodyWeightKg", this));
		super.fields.add(new ims.rules.types.RulesEngineField("2740671201010191026407489322118", "Clinical CommentsTo Pharmacy", "Clinical CommentsTo Pharmacy", false, ims.rules.types.RulesEngineFieldType.STRING, null, 0, "ClinicalCommentsToPharmacy", this));
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.HealthCareProfessional(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("3595865201010191027295023258551", "Ordering Clinician", "Ordering Clinician", false, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.HealthCareProfessional(entities)), 0, "OrderingClinician", this));
		super.fields.add(new ims.rules.types.RulesEngineField("6870261201010191027589101793130", "Ordering Date Time", "Ordering Date Time", false, ims.rules.types.RulesEngineFieldType.DATETIME, null, 0, "OrderingDateTime", this));
		super.fields.add(new ims.rules.types.RulesEngineField("2244085201010191028166683001888", "Clinician Bleep No", "Clinician Bleep No", false, ims.rules.types.RulesEngineFieldType.STRING, null, 0, "ClinicianBleepNo", this));
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.TTAMedications(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("66541132010102097533785968392", "TTA Medications", "TTA Medications", true, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.TTAMedications(entities)), 0, "TTAMedications", this));
		super.actions = new ArrayList<ims.rules.types.RulesEngineEntityMethod>();
	}
}
