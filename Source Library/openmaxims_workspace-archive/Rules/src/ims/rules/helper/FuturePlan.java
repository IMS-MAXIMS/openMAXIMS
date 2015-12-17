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

public final class FuturePlan extends ims.rules.types.RulesEngineEntity
{
	private static final long serialVersionUID = 1L;

	public FuturePlan(List<ims.rules.types.RulesEngineEntity> entities)
	{
		super.id = "1099100000";
		if(entities.contains(this))
			return;
		else
			entities.add(this);

		int fieldEntityIndex = -1;
		super.name = "Future Plan";
		super.isPublic = true;
		super.supportsNotifications = false;
		super.description = "Future Plan";
		super.businessObjectName = "ims.edischarge.domain.objects.FuturePlan";
		super.fields = new ArrayList<ims.rules.types.RulesEngineField>();
		super.fields.add(new ims.rules.types.RulesEngineField("89452962009341039463218529731", "Follow Up Required", "Follow Up Required", false, ims.rules.types.RulesEngineFieldType.LOOKUP, null, 1021145, "HospitalFollowUp", this));
		super.fields.add(new ims.rules.types.RulesEngineField("55586662009341331523927916998", "Hospital Plan", "Hospital Plan", false, ims.rules.types.RulesEngineFieldType.STRING, null, 0, "HospitalPlan", this));
		super.fields.add(new ims.rules.types.RulesEngineField("75874722009341332185327744866", "Actions for GP and Community", "Actions for GP and Community", false, ims.rules.types.RulesEngineFieldType.STRING, null, 0, "ActionsforGPandCommunity", this));
		super.fields.add(new ims.rules.types.RulesEngineField("99373252009341333466568919459", "Certificate of Sickness Issued", "Certificate of Sickness Issued", false, ims.rules.types.RulesEngineFieldType.LOOKUP, null, 1021145, "MedicalCertificationIssued", this));
		super.fields.add(new ims.rules.types.RulesEngineField("90348982009341334242025063687", "Certificate Expires Date", "Certificate Expires Date", false, ims.rules.types.RulesEngineFieldType.DATE, null, 0, "CertificateExpiresDate", this));
		super.fields.add(new ims.rules.types.RulesEngineField("50879022009341335369048240283", "Comments", "Comments", false, ims.rules.types.RulesEngineFieldType.STRING, null, 0, "Comments", this));
		fieldEntityIndex = entities.indexOf(new ims.rules.helper.InstructionsforDischaiNurse(entities));
		super.fields.add(new ims.rules.types.RulesEngineField("43220912010114137194716016699", "Instructions for Dischai Nurse", "Instructions for Dischai Nursenrg", false, ims.rules.types.RulesEngineFieldType.ENTITY, (fieldEntityIndex >= 0 ? entities.get(fieldEntityIndex) : new ims.rules.helper.InstructionsforDischaiNurse(entities)), 0, "NurseEnabledInstructions", this));
		super.fields.add(new ims.rules.types.RulesEngineField("249081620101018942368786387", "Lives Alone", "Lives Alone", false, ims.rules.types.RulesEngineFieldType.LOOKUP, null, 1021145, "LivesAlone", this));
		super.fields.add(new ims.rules.types.RulesEngineField("24838242010101896372281123170", "Fit ToReturn To Work", "Fit ToReturn To Work", false, ims.rules.types.RulesEngineFieldType.LOOKUP, null, 1021145, "FitToReturnToWork", this));
		super.fields.add(new ims.rules.types.RulesEngineField("7793329201010191033161888850209", "Certificate Starts Date", "Certificate Starts Date", false, ims.rules.types.RulesEngineFieldType.DATE, null, 0, "CertificateStartsDate", this));
		super.actions = new ArrayList<ims.rules.types.RulesEngineEntityMethod>();
	}
}
