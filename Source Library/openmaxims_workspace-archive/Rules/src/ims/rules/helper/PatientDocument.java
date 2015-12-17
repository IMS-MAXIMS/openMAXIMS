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

public final class PatientDocument extends ims.rules.types.RulesEngineEntity
{
	private static final long serialVersionUID = 1L;

	public PatientDocument(List<ims.rules.types.RulesEngineEntity> entities)
	{
		super.id = "1068100001";
		if(entities.contains(this))
			return;
		else
			entities.add(this);

		int fieldEntityIndex = -1;
		super.name = "Patient Document";
		super.isPublic = true;
		super.supportsNotifications = false;
		super.description = "Patient Document";
		super.businessObjectName = "ims.core.documents.domain.objects.PatientDocument";
		super.fields = new ArrayList<ims.rules.types.RulesEngineField>();
		super.fields.add(new ims.rules.types.RulesEngineField("id", "Code", "Code", false, ims.rules.types.RulesEngineFieldType.ENTITY_CODE, null, 0, "Id", this));
		super.fields.add(new ims.rules.types.RulesEngineField("732608220109271520143561294684", "CorrespondenceStatus", "", false, ims.rules.types.RulesEngineFieldType.LOOKUP, null, 1021127, "CorrespondenceStatus", this));
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.DocumentStatus(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("357606420101022944264016184249", "CurrentDocumentStatus", "", false, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.DocumentStatus(entities)), 0, "CurrentDocumentStatus", this));
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.DocumentStatus(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("77954832010102294536128037932", "DocumentStatusHistory", "", true, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.DocumentStatus(entities)), 0, "DocumentStatusHistory", this));
		super.fields.add(new ims.rules.types.RulesEngineField("71950942012291017226205586081", "wasTriggered", "", false, ims.rules.types.RulesEngineFieldType.BOOLEAN, null, 0, "wasTriggered", this));
		super.actions = new ArrayList<ims.rules.types.RulesEngineEntityMethod>();
		java.util.List<ims.rules.types.RulesEngineEntityMethodArgument> arguments = null;
		arguments = new ArrayList<ims.rules.types.RulesEngineEntityMethodArgument>();
		super.actions.add(new ims.rules.types.RulesEngineEntityMethod("280808420116101029123399589041", "triggerMDM_T02HL7Message", "triggerMDM_T02HL7Message", "triggerMDM_T02HL7Message", arguments));
	}
}
