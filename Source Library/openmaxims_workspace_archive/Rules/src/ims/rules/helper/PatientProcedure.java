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

public final class PatientProcedure extends ims.rules.types.RulesEngineEntity
{
	private static final long serialVersionUID = 1L;

	public PatientProcedure(List<ims.rules.types.RulesEngineEntity> entities)
	{
		super.id = "1003100017";
		if(entities.contains(this))
			return;
		else
			entities.add(this);

		int fieldEntityIndex = -1;
		super.name = "Patient Procedure";
		super.isPublic = true;
		super.supportsNotifications = false;
		super.description = "Patient Procedure";
		super.businessObjectName = "ims.core.clinical.domain.objects.PatientProcedure";
		super.fields = new ArrayList<ims.rules.types.RulesEngineField>();
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.Procedure(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("552562920047201258289477231739", "Procedure", "Procedure", false, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.Procedure(entities)), 0, "Procedure", this));
		super.fields.add(new ims.rules.types.RulesEngineField("317202220062231310205155484986", "Site", "Site", false, ims.rules.types.RulesEngineFieldType.STRING, null, 0, "SiteText", this));
		super.fields.add(new ims.rules.types.RulesEngineField("756177520047201258579939187190", "Laterality", "Laterality", false, ims.rules.types.RulesEngineFieldType.LOOKUP, null, 1021032, "ProcLaterality", this));
		super.fields.add(new ims.rules.types.RulesEngineField("695916320047201259349611317445", "Performed Date", "Performed Date", false, ims.rules.types.RulesEngineFieldType.PARTIALDATE, null, 0, "ProcDate", this));
		super.fields.add(new ims.rules.types.RulesEngineField("29444952005241420435981443493", "Performed Time", "Performed Time", false, ims.rules.types.RulesEngineFieldType.TIME, null, 0, "ProcTime", this));
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.HealthCareProfessional(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("5778031200472015861874559365", "Performed By", "Performed By", false, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.HealthCareProfessional(entities)), 0, "PeformedBy", this));
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.PatientCareContext(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("57675942006327173505381444631", "Care Context", "Care Context", false, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.PatientCareContext(entities)), 0, "CareContext", this));
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.AuthoringInformation(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("3593519200611211134526504691283", "Authoring Information", "Authoring Information", false, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.AuthoringInformation(entities)), 0, "AuthoringInformation", this));
		super.fields.add(new ims.rules.types.RulesEngineField("45314762007591137369446749108", "Procedure Intent", "Procedure Intent", false, ims.rules.types.RulesEngineFieldType.LOOKUP, null, 1021046, "ProcedureIntent", this));
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.IntraOperativeCareRecord(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("84619152009791737157759698716", "Procedure Intra Operative Record", "Procedure Intra Operative Record", false, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.IntraOperativeCareRecord(entities)), 0, "IntraOperativeRecord", this));
		super.actions = new ArrayList<ims.rules.types.RulesEngineEntityMethod>();
	}
}
