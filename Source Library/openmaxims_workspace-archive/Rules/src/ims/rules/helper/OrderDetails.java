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

public final class OrderDetails extends ims.rules.types.RulesEngineEntity
{
	private static final long serialVersionUID = 1L;

	public OrderDetails(List<ims.rules.types.RulesEngineEntity> entities)
	{
		super.id = "1070100000";
		if(entities.contains(this))
			return;
		else
			entities.add(this);

		int fieldEntityIndex = -1;
		super.name = "Order Details";
		super.isPublic = true;
		super.supportsNotifications = true;
		super.description = "Order Details";
		super.businessObjectName = "ims.ocrr.orderingresults.domain.objects.OcsOrderSession";
		super.fields = new ArrayList<ims.rules.types.RulesEngineField>();
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.Patient(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("20009882005913144665467398424", "Patient", "Patient", false, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.Patient(entities)), 0, "Patient", this));
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.PatientInvestigation(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("3093521200591940142007713378", "Investigations", "Investigations", true, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.PatientInvestigation(entities)), 0, "Investigations", this));
		super.fields.add(new ims.rules.types.RulesEngineField("2157049200591946282383801927", "Is Clinical Trial", "Is Clinical Trial", false, ims.rules.types.RulesEngineFieldType.BOOLEAN, null, 0, "ClinicalTrial", this));
		super.fields.add(new ims.rules.types.RulesEngineField("325383920051061431231949219919", "Order Category", "Order Category", false, ims.rules.types.RulesEngineFieldType.LOOKUP, null, 1161035, "OrderCategory", this));
		super.fields.add(new ims.rules.types.RulesEngineField("7605485200642714376326637370", "Was Processed", "Was Processed", false, ims.rules.types.RulesEngineFieldType.BOOLEAN, null, 0, "wasProcessed", this));
		super.fields.add(new ims.rules.types.RulesEngineField("948935520073161049201088776612", "Was Discarded", "Was Discarded", false, ims.rules.types.RulesEngineFieldType.BOOLEAN, null, 0, "wasDiscarded", this));
		super.fields.add(new ims.rules.types.RulesEngineField("360257620102161422208068003090", "Has New or Updated Results", "Has New or Updated Results", false, ims.rules.types.RulesEngineFieldType.BOOLEAN, null, 0, "HasNewOrUpdatedResults", this));
		super.actions = new ArrayList<ims.rules.types.RulesEngineEntityMethod>();
	}
}
