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

public final class OutpatientPreAssessment extends ims.rules.types.RulesEngineEntity
{
	private static final long serialVersionUID = 1L;

	public OutpatientPreAssessment(List<ims.rules.types.RulesEngineEntity> entities)
	{
		super.id = "1096100027";
		if(entities.contains(this))
			return;
		else
			entities.add(this);

		int fieldEntityIndex = -1;
		super.name = "Outpatient PreAssessment";
		super.isPublic = true;
		super.supportsNotifications = false;
		super.description = "Outpatient PreAssessment";
		super.businessObjectName = "ims.RefMan.domain.objects.OutpatientPreAssessment";
		super.fields = new ArrayList<ims.rules.types.RulesEngineField>();
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.ConsultantOutpatientAppointmentOutcome(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("38833872009721632243519490121", "Suitable For Surgery Assessment", "Suitable For Surgery Assessment", false, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.ConsultantOutpatientAppointmentOutcome(entities)), 0, "SuitableForSurgeryAssessment", this));
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.NursingandAnaesthetistOutcome(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("46239892009721632429607353326", "Fit for Surgery Assesment", "Fit for Surgery Assesment", false, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.NursingandAnaesthetistOutcome(entities)), 0, "FitForSurgeryAssesment", this));
		super.actions = new ArrayList<ims.rules.types.RulesEngineEntityMethod>();
	}
}
