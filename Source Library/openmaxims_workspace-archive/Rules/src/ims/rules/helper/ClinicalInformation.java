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

public final class ClinicalInformation extends ims.rules.types.RulesEngineEntity
{
	private static final long serialVersionUID = 1L;

	public ClinicalInformation(List<ims.rules.types.RulesEngineEntity> entities)
	{
		super.id = "1072100071";
		if(entities.contains(this))
			return;
		else
			entities.add(this);

		super.name = "Clinical Information";
		super.isPublic = true;
		super.supportsNotifications = false;
		super.description = "Clinical Information";
		super.businessObjectName = "ims.edischarge.domain.objects.DischargeClinicalInformation";
		super.fields = new ArrayList<ims.rules.types.RulesEngineField>();
		super.fields.add(new ims.rules.types.RulesEngineField("3363559200932154003144206875", "Additional Comments", "Additional Comments", false, ims.rules.types.RulesEngineFieldType.STRING, null, 0, "AdditionalComments", this));
		super.fields.add(new ims.rules.types.RulesEngineField("2258598201010141616247161497829", "Reason For Admission And Presenting Complaints", "Reason For Admission And Presenting Complaints", false, ims.rules.types.RulesEngineFieldType.STRING, null, 0, "ReasonForAdmissionAndPresentingComplaints", this));
		super.fields.add(new ims.rules.types.RulesEngineField("8274735201010141617427123327325", "Relevant Infections Risks and Warnings", "Relevant Infections Risks and Warnings", false, ims.rules.types.RulesEngineFieldType.STRING, null, 0, "RelevantInfectionsRisksWarnings", this));
		super.fields.add(new ims.rules.types.RulesEngineField("5762471201010141618247325498964", "Summary Of Inpatient Episode", "Summary Of Inpatient Episode", false, ims.rules.types.RulesEngineFieldType.STRING, null, 0, "SummaryOfInpatientEpisode", this));
		super.fields.add(new ims.rules.types.RulesEngineField("958843420101014161911735794640", "Relevant Investigations And Results", "Relevant Investigations And Results", false, ims.rules.types.RulesEngineFieldType.STRING, null, 0, "RelevantInvsAndResults", this));
		super.fields.add(new ims.rules.types.RulesEngineField("4670169201010141620237695515302", "Pending Results Comments", "Pending Results Comments", false, ims.rules.types.RulesEngineFieldType.STRING, null, 0, "PendingResultsComments", this));
		super.fields.add(new ims.rules.types.RulesEngineField("1487921201010141621218669490714", "Relevant Treatments and Changes Made to Treatments", "Relevant Treatments and Changes Made to Treatments", false, ims.rules.types.RulesEngineFieldType.STRING, null, 0, "RelevantTreatmentsAndChanges", this));
		super.fields.add(new ims.rules.types.RulesEngineField("5901319201010141628318578328979", "is Complete", "is Complete", false, ims.rules.types.RulesEngineFieldType.BOOLEAN, null, 0, "isComplete", this));
		super.actions = new ArrayList<ims.rules.types.RulesEngineEntityMethod>();
	}
}
