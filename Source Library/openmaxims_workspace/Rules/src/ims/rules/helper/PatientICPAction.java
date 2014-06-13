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

public final class PatientICPAction extends ims.rules.types.RulesEngineEntity
{
	private static final long serialVersionUID = 1L;

	public PatientICPAction(List<ims.rules.types.RulesEngineEntity> entities)
	{
		super.id = "1100100004";
		if(entities.contains(this))
			return;
		else
			entities.add(this);

		int fieldEntityIndex = -1;
		super.name = "Patient ICP Action";
		super.isPublic = true;
		super.supportsNotifications = false;
		super.description = "Patient ICP Action Instantiation";
		super.businessObjectName = "ims.icps.instantiation.domain.objects.PatientICPAction";
		super.fields = new ArrayList<ims.rules.types.RulesEngineField>();
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.Patient(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("679629020095191145357531058704", "Patient", "Patient", false, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.Patient(entities)), 0, "Patient", this));
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.PatientCareContext(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("639436920095191145357696989689", "Care Context", "The Care Context in which the Patient ICP record was recorded", false, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.PatientCareContext(entities)), 0, "CareContext", this));
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.PatientICP(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("209619720095191145357699630456", "Patient ICP", "Patient ICP", false, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.PatientICP(entities)), 0, "ICP", this));
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.ICPActionConfiguration(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("220656320095182134213612633009", "ICP Action Configuration", "ICP Action Configuration", false, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.ICPActionConfiguration(entities)), 0, "Action", this));
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.PatientICPActionStatus(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("829310520095182136205931218607", "Current Action Stratus", "Current Patient ICP Action Status", false, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.PatientICPActionStatus(entities)), 0, "CurrentStatus", this));
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.PatientICPActionStatus(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("244671720095182137253254412212", "Status History of the Patient ICP Action", "Status History of the Patient ICP Action", true, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.PatientICPActionStatus(entities)), 0, "StatusHistory", this));
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.PatientICPPhase(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("344820520095191148198467497314", "The Phase for this Action", "The Phase for this Action", false, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.PatientICPPhase(entities)), 0, "ParentPhase", this));
		super.actions = new ArrayList<ims.rules.types.RulesEngineEntityMethod>();
		java.util.List<ims.rules.types.RulesEngineEntityMethodArgument> arguments = null;
		arguments = new ArrayList<ims.rules.types.RulesEngineEntityMethodArgument>();
		arguments.add(new ims.rules.types.RulesEngineEntityMethodArgument("43867362009616114245571912371", "stage", "stage", "Patient ICP Stage", ims.rules.types.RulesEngineMethodArgumentType.STRING));
		super.actions.add(new ims.rules.types.RulesEngineEntityMethod("148710420096161142549483366308", "Bring Stage Into Scope", "bringStageIntoScope", "Bring a Patient ICP Stage its associated Phases and actions into Scope as a result of an action getting marked as MET", arguments));
		arguments = new ArrayList<ims.rules.types.RulesEngineEntityMethodArgument>();
		arguments.add(new ims.rules.types.RulesEngineEntityMethodArgument("565400220096161143564332875204", "phase", "phase", "Patient ICP Phase", ims.rules.types.RulesEngineMethodArgumentType.STRING));
		super.actions.add(new ims.rules.types.RulesEngineEntityMethod("63926542009616114431835236890", "Bring Phase Into Scope", "bringPhaseIntoScope", "Bring a Patient ICP Phase and its actions into Scope as a result of an action getting marked as MET", arguments));
	}
}
