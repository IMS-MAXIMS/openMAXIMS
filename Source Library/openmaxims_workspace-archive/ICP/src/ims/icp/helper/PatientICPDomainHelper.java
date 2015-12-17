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
package ims.icp.helper;

import ims.core.admin.pas.vo.PASEventRefVo;
import ims.core.admin.vo.CareContextRefVo;
import ims.core.admin.vo.ClinicalContactRefVo;
import ims.core.patient.vo.PatientRefVo;
import ims.core.vo.AuthoringInformationVo;
import ims.core.vo.HcpLiteVo;
import ims.core.vo.lookups.HcpDisType;
import ims.core.vo.lookups.PreActiveActiveInactiveStatus;
import ims.domain.impl.DomainImpl;
import ims.framework.exceptions.CodingRuntimeException;
import ims.framework.utils.DateTime;
import ims.icp.vo.ICPActionConfiguration_CreateVo;
import ims.icp.vo.ICPConfiguration_CreateVo;
import ims.icp.vo.ICPPhaseConfiguration_CreateVo;
import ims.icp.vo.ICPStageConfiguration_CreateVo;
import ims.icp.vo.PatientICPActionStatusVo;
import ims.icp.vo.PatientICPActionStatusVoCollection;
import ims.icp.vo.PatientICPAction_CreationVo;
import ims.icp.vo.PatientICPAction_CreationVoCollection;
import ims.icp.vo.PatientICPPhaseStatusVo;
import ims.icp.vo.PatientICPPhaseStatusVoCollection;
import ims.icp.vo.PatientICPPhase_CreationVo;
import ims.icp.vo.PatientICPPhase_CreationVoCollection;
import ims.icp.vo.PatientICPPhase_StatusChangeVo;
import ims.icp.vo.PatientICPStageStatusVo;
import ims.icp.vo.PatientICPStageStatusVoCollection;
import ims.icp.vo.PatientICPStage_CreationVo;
import ims.icp.vo.PatientICPStage_CreationVoCollection;
import ims.icp.vo.PatientICPStage_StatusChangeVo;
import ims.icp.vo.PatientICP_CreationVo;
import ims.icp.vo.PatientICP_PresentationVo;
import ims.icp.vo.PatientICP_StatusChangeVo;
import ims.icp.vo.domain.PatientICPPhase_StatusChangeVoAssembler;
import ims.icp.vo.domain.PatientICPStage_StatusChangeVoAssembler;
import ims.icp.vo.domain.PatientICP_PresentationVoAssembler;
import ims.icp.vo.domain.PatientICP_StatusChangeVoAssembler;
import ims.icp.vo.lookups.ICPActionStatus;
import ims.icp.vo.lookups.ICPPhaseStatus;
import ims.icp.vo.lookups.ICPStageStatus;
import ims.icps.instantiation.domain.objects.PatientICP;
import ims.icps.instantiation.domain.objects.PatientICPPhase;
import ims.icps.instantiation.domain.objects.PatientICPStage;
import ims.icps.instantiation.vo.PatientICPPhaseRefVo;
import ims.icps.instantiation.vo.PatientICPRefVo;
import ims.icps.instantiation.vo.PatientICPStageRefVo;


public class PatientICPDomainHelper extends DomainImpl implements PatientICPHelperInterface
{
	private static final long serialVersionUID = 1L;

	
	/**
	 *	Function used to retrieve Patient ICP for display
	 */
	public PatientICP_PresentationVo getPatientICPQueryFetch(PatientICPRefVo patientICP)
	{
		if (patientICP == null || !patientICP.getID_PatientICPIsNotNull())
			return null;
		
		long startTime = System.currentTimeMillis();
		
		StringBuilder hqlQuery = new StringBuilder();
		
		hqlQuery.append("SELECT icp FROM PatientICP AS icp LEFT JOIN FETCH icp.iCP ");

		hqlQuery.append("LEFT JOIN FETCH icp.stages AS stages LEFT JOIN FETCH stages.stage LEFT JOIN FETCH stages.currentStatus ");
		hqlQuery.append("LEFT JOIN FETCH stages.stagePhases AS phases LEFT JOIN FETCH phases.phase AS configPhase LEFT JOIN FETCH configPhase.goals LEFT JOIN FETCH phases.currentStatus ");
		hqlQuery.append("LEFT JOIN FETCH phases.phaseActions AS actions LEFT JOIN FETCH actions.action LEFT JOIN FETCH actions.currentStatus AS status LEFT JOIN FETCH status.changedBy ");
		hqlQuery.append("LEFT JOIN FETCH icp.criticalEvents ");		// Commented this part because of a bug in Hibernate (see https://hibernate.onjira.com/browse/HHH-5465)
		
		// AS events LEFT JOIN FETCH events.authoringInformation LEFT JOIN FETCH eventInfo.authoringHcp AS eventHCP LEFT JOIN FETCH eventHCP.mos ");
		
		hqlQuery.append("LEFT JOIN FETCH icp.evaluationNotes "); 	// Commented this part because of a bug in Hibernate (see https://hibernate.onjira.com/browse/HHH-5465)
		
		// AS notes LEFT JOIN FETCH notes.authoringInformation AS notesInfo LEFT JOIN FETCH notesInfo.authoringHcp AS notesHCP LEFT JOIN FETCH notesHCP.mos ");
		
		hqlQuery.append("WHERE icp.id = :ID_ICP");
		
		PatientICP_PresentationVo result = PatientICP_PresentationVoAssembler.create((PatientICP) getDomainFactory().findFirst(hqlQuery.toString(), "ID_ICP", patientICP.getID_PatientICP()));
		
		long endTime = System.currentTimeMillis();
		
		@SuppressWarnings("unused")
		long miliseconds = endTime - startTime;
		
		return result;
	}


	/**
	 *	Function used to retrieve Patient ICP for bringing Stage / Phases into scope
	 */
	public PatientICPStage_StatusChangeVo getPatientStageForStatusChange(PatientICPStageRefVo stage)
	{
		if (stage == null || !stage.getID_PatientICPStageIsNotNull())
			return null;
		
		long startTime = System.currentTimeMillis();
		
		StringBuilder hqlQuery = new StringBuilder();
		
		hqlQuery.append("SELECT stage FROM PatientICPStage AS stage ");
		hqlQuery.append("LEFT JOIN FETCH stage.currentStatus ");
		hqlQuery.append("LEFT JOIN FETCH stage.stagePhases AS phase LEFT JOIN FETCH phase.currentStatus ");
		hqlQuery.append("LEFT JOIN FETCH phase.phaseActions AS action LEFT JOIN FETCH action.currentStatus LEFT JOIN FETCH action.action ");
		hqlQuery.append("WHERE stage.id = :ID_STAGE");
		
		PatientICPStage_StatusChangeVo result = PatientICPStage_StatusChangeVoAssembler.create((PatientICPStage) getDomainFactory().findFirst(hqlQuery.toString(), "ID_STAGE", stage.getID_PatientICPStage()));
		
		long endTime = System.currentTimeMillis();
		
		@SuppressWarnings("unused")
		long miliseconds = endTime - startTime;

		return result;
	}


	/**
	 *	Function used to retrieve Patient ICP Stage for updating the status 
	 */
	public PatientICPPhase_StatusChangeVo getPatientPhaseForStatusChange(PatientICPPhaseRefVo phase)
	{
		if (phase == null || !phase.getID_PatientICPPhaseIsNotNull())
			return null;
		
		long startTime = System.currentTimeMillis();
		
		StringBuilder hqlQuery = new StringBuilder();
		
		hqlQuery.append("SELECT phase FROM PatientICPPhase AS phase ");
		hqlQuery.append("LEFT JOIN FETCH phase.currentStatus ");
		hqlQuery.append("LEFT JOIN FETCH phase.phaseActions AS action LEFT JOIN FETCH action.currentStatus LEFT JOIN FETCH action.action ");
		hqlQuery.append("WHERE phase.id = :ID_PHASE");
		
		PatientICPPhase_StatusChangeVo result = PatientICPPhase_StatusChangeVoAssembler.create((PatientICPPhase) getDomainFactory().findFirst(hqlQuery.toString(), "ID_PHASE", phase.getID_PatientICPPhase()));
		
		long endTime = System.currentTimeMillis();
		
		@SuppressWarnings("unused")
		long miliseconds = endTime - startTime;

		return result;
	}


	/**
	 * Function used to retrieve Patient ICP Phase for updating the status
	 */
	public PatientICP_StatusChangeVo getPatientICPBringStagePhaseIntoScope(PatientICPRefVo icp)
	{
		if (icp == null || !icp.getID_PatientICPIsNotNull())
			return null;
		
		long startTime = System.currentTimeMillis();
		
		StringBuilder hqlQuery = new StringBuilder();
		
		hqlQuery.append("SELECT icp FROM PatientICP AS icp ");

		// Do NOT use LEFT JOIN FETCH on this query
		
		hqlQuery.append("WHERE icp.id = :ID_ICP");
		
		
		PatientICP_StatusChangeVo result = PatientICP_StatusChangeVoAssembler.create((PatientICP) getDomainFactory().findFirst(hqlQuery.toString(), "ID_ICP", icp.getID_PatientICP()));
		
		long endTime = System.currentTimeMillis();
		
		@SuppressWarnings("unused")
		long miliseconds = endTime - startTime;

		return result;
	}




	
	
	/**
	 * Function used to create a Patient ICP record
	 * <br> NOTE: The record will be ready to be committed to data base, but it will not be saved
	 */
	public PatientICP_CreationVo createPatientICP(ICPConfiguration_CreateVo icpConfig, PatientRefVo patient, CareContextRefVo careContext, ClinicalContactRefVo clinicalContact, PASEventRefVo pasEvent, HcpLiteVo hcp)
	{
		// Check mandatory parameters
		if (icpConfig == null)
			throw new CodingRuntimeException("A configuration ICP must be provided for creating a Patient ICP record.");
		
		if (patient == null)
			throw new CodingRuntimeException("Patient is a mandatory parameter in creation process for a Patient ICP record.");
		
		if (careContext == null)
			throw new CodingRuntimeException("CareContext is a mandatory parameter in creation process for a Patient ICP record.");
		
		if (hcp == null)
			throw new CodingRuntimeException("HCP is a mandatory parameter in creation process for a Patient ICP record.");
		
		
		// Create Patient ICP record
		PatientICP_CreationVo patientICP = new PatientICP_CreationVo();
		
		// Set values into Patient ICP record (Patient, CareContext, ClinicalContact, PasEvent)
		patientICP.setPatient(patient);
		patientICP.setCareContext(careContext);
		patientICP.setICP(icpConfig);
		patientICP.setClinicalContact(clinicalContact);
		patientICP.setPasEvent(pasEvent);
		
		// Create & set the authoring information for the Patient ICP record
		AuthoringInformationVo authInfo = new AuthoringInformationVo();
		authInfo.setAuthoringHcp(hcp);
		authInfo.setAuthoringDateTime(new DateTime());
		
		patientICP.setAuthoringInformation(authInfo);
		
		
		// Set started date
		patientICP.setStartedDateTime(new DateTime());
		

		// Set default values to outstanding disciplines
		// These values will be updated when creating the PatientICPActions
		patientICP.setHasOutstandingAdminActions(Boolean.FALSE);
		patientICP.setHasOutstandingClinicalActions(Boolean.FALSE);
		patientICP.setHasOutstandingNursingActions(Boolean.FALSE);
		patientICP.setHasOutstandingPhysioActions(Boolean.FALSE);
		
		
		// Start stage creation process
		if (icpConfig.getStagesIsNotNull())
		{
			// Create stage collection
			patientICP.setStages(new PatientICPStage_CreationVoCollection());
			
			for (ICPStageConfiguration_CreateVo stage : icpConfig.getStages())
			{
				// If the stage is active then create Patient ICP Stage
				if (PreActiveActiveInactiveStatus.ACTIVE.equals(stage.getStatus()))
				{
					patientICP.getStages().add(createPatientICPStage(stage, patientICP, hcp));
				}
			}
		}
		
		// Return Patient ICP
		return patientICP;
	}


	private PatientICPStage_CreationVo createPatientICPStage(ICPStageConfiguration_CreateVo stageConfig, PatientICP_CreationVo patientICP, HcpLiteVo hcp)
	{
		// Check mandatory parameters
		if (stageConfig == null)
			throw new CodingRuntimeException("A configuration ICP Stage must be provided for creating a Patient ICP Stage record.");
		
		if (patientICP == null)
			throw new CodingRuntimeException("Patient ICP is a mandatory parameter in creation process for a Patient ICP Stage record.");
		
		if (hcp == null)
			throw new CodingRuntimeException("HCP is a mandatory parameter in creation process for a Patient ICP Stage record.");
		
		// Create Patient ICP Stage record
		PatientICPStage_CreationVo patientStage = new PatientICPStage_CreationVo();
		
		// Set values into Patient ICP Stage record
		patientStage.setPatient(patientICP.getPatient());
		patientStage.setCareContext(patientICP.getCareContext());
		patientStage.setICP(patientICP);
		patientStage.setStage(stageConfig);
		
		// Create & set Patient ICP Stage status & status history
    		PatientICPStageStatusVo status = new PatientICPStageStatusVo();
    		
    		status.setStatusDate(new DateTime());
    		status.setChangedBy(hcp.getIHcpName());
    		
    		if (Boolean.TRUE.equals(stageConfig.getIsActivatedOnInitiation()))
    		{
    			status.setStatus(ICPStageStatus.OUTSTANDING);
    		}
    		else
    		{
    			status.setStatus(ICPStageStatus.NOTINSCOPE);
    		}
    		
    		patientStage.setCurrentStatus(status);
    		patientStage.setStatusHistory(new PatientICPStageStatusVoCollection());
    		patientStage.getStatusHistory().add(status);
		
				
		// Start phase creation process
		if (stageConfig.getPhasesIsNotNull())
		{
			// Create phase collection
			patientStage.setStagePhases(new PatientICPPhase_CreationVoCollection());
			
			for (ICPPhaseConfiguration_CreateVo phase : stageConfig.getPhases())
			{
				if (PreActiveActiveInactiveStatus.ACTIVE.equals(phase.getStatus()))
				{
					patientStage.getStagePhases().add(createPatientICPPhase(phase, patientICP, patientStage, hcp));
				}
			}
			
		}
		
		// Return Patient ICP Stage
		return patientStage;
	}


	private PatientICPPhase_CreationVo createPatientICPPhase(ICPPhaseConfiguration_CreateVo phaseConfig, PatientICP_CreationVo patientICP, PatientICPStage_CreationVo parentStage, HcpLiteVo hcp)
	{
		// Check mandatory parameters
		if (phaseConfig == null)
			throw new CodingRuntimeException("A configuration ICP Phase must be provided for creating a Patient ICP Phase record.");
		
		if (patientICP == null)
			throw new CodingRuntimeException("Patient ICP is a mandatory parameter in creation process for a Patient ICP Phase record.");
		
		if (parentStage == null)
			throw new CodingRuntimeException("Parent Stage is a mandatory parameter in creation process for a Patient ICP Phase record.");
			
		if (hcp == null)
			throw new CodingRuntimeException("HCP is a mandatory parameter in creation process for a Patient ICP Phase record.");
		
		
		// Create Patient ICP Phase record
		PatientICPPhase_CreationVo patientPhase = new PatientICPPhase_CreationVo();
		
		// Set values into Patient ICP Phase record
		patientPhase.setPatient(patientICP.getPatient());
		patientPhase.setCareContext(patientICP.getCareContext());
		patientPhase.setICP(patientICP);
		patientPhase.setParentStage(parentStage);
		patientPhase.setPhase(phaseConfig);
		
		
		// Create & set Patient ICP Phase status & status history
		PatientICPPhaseStatusVo status = new PatientICPPhaseStatusVo();
		
		status.setStatusDate(new DateTime());
		status.setChangedBy(hcp.getIHcpName());
		
		if (Boolean.TRUE.equals(phaseConfig.getIsActivatedOnInitiation()) && ICPStageStatus.OUTSTANDING.equals(parentStage.getCurrentStatus().getStatus()))
		{
			status.setStatus(ICPPhaseStatus.INPROGRESS);
		}
		else
		{
			status.setStatus(ICPPhaseStatus.NOTINSCOPE);
		}
		
		patientPhase.setCurrentStatus(status);
		patientPhase.setStatusHistory(new PatientICPPhaseStatusVoCollection());
		patientPhase.getStatusHistory().add(status);
		
		
		// Start actions creation process
		if (phaseConfig.getActionsIsNotNull())
		{
			patientPhase.setPhaseActions(new PatientICPAction_CreationVoCollection());
			
			for (ICPActionConfiguration_CreateVo action : phaseConfig.getActions())
			{
				if (PreActiveActiveInactiveStatus.ACTIVE.equals(action.getStatus()))
				{
					patientPhase.getPhaseActions().add(createPatientICPAction(action, patientICP, patientPhase, parentStage, hcp));
				}
			}
		}
		
		// Return Patient ICP Phase
		return patientPhase;
	}


	private PatientICPAction_CreationVo createPatientICPAction(ICPActionConfiguration_CreateVo actionConfig, PatientICP_CreationVo patientICP, PatientICPPhase_CreationVo parentPhase, PatientICPStage_CreationVo parentStage, HcpLiteVo hcp)
	{
		// Check mandatory parameters
		if (actionConfig == null)
			throw new CodingRuntimeException("A configuration ICP Action must be provided for creating a Patient ICP Action record.");
		
		if (patientICP == null)
			throw new CodingRuntimeException("Patient ICP is a mandatory parameter in creation process for a Patient ICP Action record.");
		
		if (parentPhase == null)
			throw new CodingRuntimeException("Parent Phase is a mandatory parameter in creation process for a Patient ICP Action record.");
		
		if (hcp == null)
			throw new CodingRuntimeException("HCP is a mandatory parameter in creation process for a Patient ICP Action record.");

		
		// Create Patient ICP Action record
		PatientICPAction_CreationVo patientAction = new PatientICPAction_CreationVo();
		
		// Set values into Patient ICP Action record
		patientAction.setPatient(patientICP.getPatient());
		patientAction.setCareContext(patientICP.getCareContext());
		patientAction.setICP(patientICP);
		patientAction.setParentPhase(parentPhase);
		
		patientAction.setAction(actionConfig);
		
		// Create & set Patient ICP Action status & history
		PatientICPActionStatusVo status = new PatientICPActionStatusVo();
		
		status.setStatusDate(new DateTime());
		status.setChangedBy(hcp.getMos());
		
		if (ICPStageStatus.OUTSTANDING.equals(parentStage.getCurrentStatus().getStatus()) && ICPPhaseStatus.INPROGRESS.equals(parentPhase.getCurrentStatus().getStatus()))
		{
			status.setStatus(ICPActionStatus.OUTSTANDING);
		}
		else
		{
			status.setStatus(ICPActionStatus.NOTINSCOPE);
		}
		
			
		patientAction.setCurrentStatus(status);
		patientAction.setStatusHistory(new PatientICPActionStatusVoCollection());
		patientAction.getStatusHistory().add(status);
		
		
		// Update outstanding disciplines in Patient ICP
		if (actionConfig.getDisciplineIsNotNull() && ICPActionStatus.OUTSTANDING.equals(status.getStatus()))
		{
			if (actionConfig.getDiscipline().contains(HcpDisType.OTHER))
				patientICP.setHasOutstandingAdminActions(Boolean.TRUE);
			
			if (actionConfig.getDiscipline().contains(HcpDisType.MEDICAL))
				patientICP.setHasOutstandingClinicalActions(Boolean.TRUE);
			
			if (actionConfig.getDiscipline().contains(HcpDisType.NURSING))
				patientICP.setHasOutstandingNursingActions(Boolean.TRUE);
			
			if (actionConfig.getDiscipline().contains(HcpDisType.THERAPY))
				patientICP.setHasOutstandingPhysioActions(Boolean.TRUE);
		}
		
		// Return Patient ICP Action
		return patientAction;
	}
}
