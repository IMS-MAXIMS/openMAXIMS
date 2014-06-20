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

public final class PatientReferral extends ims.rules.types.RulesEngineEntity
{
	private static final long serialVersionUID = 1L;

	public PatientReferral(List<ims.rules.types.RulesEngineEntity> entities)
	{
		super.id = "1004100035";
		if(entities.contains(this))
			return;
		else
			entities.add(this);

		int fieldEntityIndex = -1;
		super.name = "Patient Referral";
		super.isPublic = true;
		super.supportsNotifications = false;
		super.description = "Patient Referral";
		super.businessObjectName = "ims.RefMan.domain.objects.CatsReferral";
		super.fields = new ArrayList<ims.rules.types.RulesEngineField>();
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.Patient(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("38366782008821181706481400932", "Patient", "Patient", false, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.Patient(entities)), 0, "Patient", this));
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.ReferralCurrentStatus(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("404394620088221044526787132118", "Referral Current Status", "Referral Current Status", false, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.ReferralCurrentStatus(entities)), 0, "CurrentStatus", this));
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.PatientCareContext(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("7058196200892586525914258661", "Care Context", "Care Context", false, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.PatientCareContext(entities)), 0, "CareContext", this));
		super.fields.add(new ims.rules.types.RulesEngineField("55966892009791226397684067122", "Is Patient Suitable for Surgery", "Is Patient Suitable for Surgery", false, ims.rules.types.RulesEngineFieldType.BOOLEAN, null, 0, "isSuitableForSurgery", this));
		super.fields.add(new ims.rules.types.RulesEngineField("84618242009791227242836500405", "Is Patient Fit for Surgery", "Is Patient Fit for Surgery", false, ims.rules.types.RulesEngineFieldType.BOOLEAN, null, 0, "isFitForSurgery", this));
		super.actions = new ArrayList<ims.rules.types.RulesEngineEntityMethod>();
	}
}
