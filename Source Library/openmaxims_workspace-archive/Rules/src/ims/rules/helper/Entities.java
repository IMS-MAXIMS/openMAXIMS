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

import java.util.ArrayList;
import java.util.List;
import ims.rules.types.RulesEngineEntity;

public final class Entities implements ims.rules.interfaces.IRulesEngineEntitiesHelper
{
	private static final long serialVersionUID = 1L;

	private List<RulesEngineEntity> entities = null;
	private static Entities instance = new Entities();

	public static synchronized Entities getInstance()
	{
		return instance;
	}

	public List<RulesEngineEntity> getAllPublicEntities()
	{
		List<RulesEngineEntity> all = getAllEntities();
		List<RulesEngineEntity> result = new ArrayList<RulesEngineEntity>();
			for(int x = 0; x < all.size(); x++)
			{
				if(all.get(x).isPublic())
				{
					result.add(all.get(x));
				}
			}
		return result;
	}
	private List<RulesEngineEntity> getAllEntities()
	{
		if(entities != null)
			return entities;
		entities = new ArrayList<RulesEngineEntity>();

		new InstructionsforDischaiNurse(entities);
		new MedicationOnAdmissionandChanges(entities);
		new Diagnosis(entities);
		new MedicationConfig(entities);
		new DiagnosisCurrentStatus(entities);
		new InvestigationIndex(entities);
		new Investigation(entities);
		new DocumentStatus(entities);
		new PatientDocument(entities);
		new AuthoringInformation(entities);
		new ICPConfiguration(entities);
		new Test(entities);
		new testcoll(entities);
		new TestColl2(entities);
		new PatientReferral(entities);
		new SystemLog(entities);
		new PatientICPPhase(entities);
		new PatientICPStage(entities);
		new PatientICP(entities);
		new PatientICPActionStatus(entities);
		new PatientICPAction(entities);
		new PatientCareContext(entities);
		new PatientEpisodeofCare(entities);
		new PatientCareSpell(entities);
		new Plastics(entities);
		new TTAMedications(entities);
		new Patient(entities);
		new IntraOperativeCareRecord(entities);
		new ClinicalImagingResult(entities);
		new OrderDetails(entities);
		new PathologyResult(entities);
		new PatientInvestigation(entities);
		new ClinicalInformation(entities);
		new InvestigationStatus(entities);
		new NeoNatal(entities);
		new Name(entities);
		new ICPActionConfiguration(entities);
		new ICPStageConfiguration(entities);
		new ICPPhaseConfiguration(entities);
		new TTAandPharmacy(entities);
		new ReferralCurrentStatus(entities);
		new ConsultantOutpatientAppointmentOutcome(entities);
		new OutpatientPreAssessment(entities);
		new NursingandAnaesthetistOutcome(entities);
		new MemberofStaff(entities);
		new Nurse(entities);
		new HealthCareProfessional(entities);
		new DischargeSummaryPACUandWard(entities);
		new FuturePlan(entities);
		new DischargeDetails(entities);
		new ReadytoLeave(entities);
		new Procedure(entities);
		new TaxonomyMapping(entities);
		new PatientDiagnosis(entities);
		new PatientProcedure(entities);

		return entities;
	}

	public RulesEngineEntity getEntityById(String id)
	{
		for(int x = 0; x < getAllEntities().size(); x++)
		{
			if(getAllEntities().get(x).getId().equals((id)))
				return getAllEntities().get(x);
		}

		return null;
	}
}
