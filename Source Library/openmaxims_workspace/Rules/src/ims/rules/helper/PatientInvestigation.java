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

public final class PatientInvestigation extends ims.rules.types.RulesEngineEntity
{
	private static final long serialVersionUID = 1L;

	public PatientInvestigation(List<ims.rules.types.RulesEngineEntity> entities)
	{
		super.id = "1070100002";
		if(entities.contains(this))
			return;
		else
			entities.add(this);

		int fieldEntityIndex = -1;
		super.name = "Patient Investigation";
		super.isPublic = true;
		super.supportsNotifications = false;
		super.description = "Patient Investigation";
		super.businessObjectName = "ims.ocrr.orderingresults.domain.objects.OrderInvestigation";
		super.fields = new ArrayList<ims.rules.types.RulesEngineField>();
		super.fields.add(new ims.rules.types.RulesEngineField("id", "Code", "Code", false, ims.rules.types.RulesEngineFieldType.ENTITY_CODE, null, 0, "Id", this));
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.Investigation(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("5799620200591104173458931762", "Investigation", "Investigation", false, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.Investigation(entities)), 0, "Investigation", this));
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.OrderDetails(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("10216322005914125620114800065", "Order Details", "Order Details", false, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.OrderDetails(entities)), 0, "OrderDetails", this));
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.HealthCareProfessional(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("534057720079241128107679455747", "Responsible HCP", "Responsible HCP", false, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.HealthCareProfessional(entities)), 0, "ResponsibleClinician", this));
		super.fields.add(new ims.rules.types.RulesEngineField("487843520062151033417443001195", "Report Date Time", "Report Date Time", false, ims.rules.types.RulesEngineFieldType.DATETIME, null, 0, "RepDateTime", this));
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.InvestigationStatus(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("850186520062151040123247295531", "Current Status", "Current Status", false, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.InvestigationStatus(entities)), 0, "OrdInvCurrentStatus", this));
		super.actions = new ArrayList<ims.rules.types.RulesEngineEntityMethod>();
	}
}
