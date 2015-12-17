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

public final class DischargeDetails extends ims.rules.types.RulesEngineEntity
{
	private static final long serialVersionUID = 1L;

	public DischargeDetails(List<ims.rules.types.RulesEngineEntity> entities)
	{
		super.id = "1099100001";
		if(entities.contains(this))
			return;
		else
			entities.add(this);

		super.name = "Discharge Details";
		super.isPublic = true;
		super.supportsNotifications = false;
		super.description = "Discharge Details";
		super.businessObjectName = "ims.edischarge.domain.objects.DischargeDetails";
		super.fields = new ArrayList<ims.rules.types.RulesEngineField>();
		super.fields.add(new ims.rules.types.RulesEngineField("75531172009841548381235514162", "has No Complications", "has No Complications", false, ims.rules.types.RulesEngineFieldType.BOOLEAN, null, 0, "hasNoComplications", this));
		super.fields.add(new ims.rules.types.RulesEngineField("75415452009841549397474096617", "has No Comorbidities", "has No Comorbidities", false, ims.rules.types.RulesEngineFieldType.BOOLEAN, null, 0, "hasNoComorbidities", this));
		super.fields.add(new ims.rules.types.RulesEngineField("3264840201010141629564265901721", "has No Diagnosis", "has No Diagnosis", false, ims.rules.types.RulesEngineFieldType.BOOLEAN, null, 0, "hasNoDiagnosis", this));
		super.fields.add(new ims.rules.types.RulesEngineField("894913820101110119276673855856", "is Diagnosis Complete", "is Diagnosis Complete", false, ims.rules.types.RulesEngineFieldType.BOOLEAN, null, 0, "isDiagnosisComplete", this));
		super.actions = new ArrayList<ims.rules.types.RulesEngineEntityMethod>();
	}
}
