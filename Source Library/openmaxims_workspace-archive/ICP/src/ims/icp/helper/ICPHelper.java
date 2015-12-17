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

/**
 *	Created 24.06.2009 - WDEV-7504
 */
package ims.icp.helper;

import ims.domain.DomainFactory;
import ims.domain.impl.DomainImpl;
import ims.framework.utils.DateTime;
import ims.icp.vo.PatientICPActionStatusVo;
import ims.icp.vo.PatientICPPhaseStatusVo;
import ims.icp.vo.PatientICPStageStatusVo;
import ims.icp.vo.domain.PatientICPActionStatusVoAssembler;
import ims.icp.vo.domain.PatientICPPhaseStatusVoAssembler;
import ims.icp.vo.domain.PatientICPStageStatusVoAssembler;
import ims.icp.vo.lookups.ICPActionStatus;
import ims.icp.vo.lookups.ICPPhaseStatus;
import ims.icp.vo.lookups.ICPStageStatus;
import ims.icps.instantiation.domain.objects.PatientICP;
import ims.icps.instantiation.domain.objects.PatientICPAction;
import ims.icps.instantiation.domain.objects.PatientICPActionStatus;
import ims.icps.instantiation.domain.objects.PatientICPPhase;
import ims.icps.instantiation.domain.objects.PatientICPPhaseStatus;
import ims.icps.instantiation.domain.objects.PatientICPStage;
import ims.icps.instantiation.domain.objects.PatientICPStageStatus;

import java.util.Iterator;




public class ICPHelper extends DomainImpl
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private final static int STATUS_NOT_IN_SCOPE = -1746;
	
	/**
	 * 
	 * @param patientICP
	 * @param stage
	 */
	@SuppressWarnings("unchecked")
	public void bringStageIntoScope(PatientICP patientICP, String stage)
	{
		// Check for existing stages (no point to continue if there are no stages)
		if (patientICP == null || patientICP.getStages() == null || patientICP.getStages().size() == 0)
			return;
		
		// Check for stage ID
		if (stage == null)
			return;
		
		DomainFactory factory = getDomainFactory();
		
		// Parse for stage ID
		Integer stageID = Integer.parseInt(stage);

		Iterator<PatientICPStage> iterator = patientICP.getStages().iterator();
		
		while (iterator.hasNext())
		{
			PatientICPStage patientICPStage = iterator.next();
			
			if (patientICPStage.getStage() != null && stageID.equals(patientICPStage.getStage().getId()) && patientICPStage.getCurrentStatus().getStatus().getId() == STATUS_NOT_IN_SCOPE)
			{
				// Create a status VO for the stage
				PatientICPStageStatusVo status = new PatientICPStageStatusVo();
				status.setChangedBy("");
				status.setStatus(ICPStageStatus.OUTSTANDING);
				status.setStatusDate(new DateTime());
				
				// Extract the BO from status VO
				PatientICPStageStatus statusDOM = PatientICPStageStatusVoAssembler.extractPatientICPStageStatus(factory, status);
				
				// Set stage status to status BO
				patientICPStage.setCurrentStatus(statusDOM);
				// Add status BO to status history
				patientICPStage.getStatusHistory().add(statusDOM);
				
				// Mark phases as INPROGRESS
				if (patientICPStage.getStagePhases() != null)
				{
					Iterator<PatientICPPhase> iteratorPhases = patientICPStage.getStagePhases().iterator();
					
					while (iteratorPhases.hasNext())
					{
						PatientICPPhase patientICPPhase = iteratorPhases.next();
						
						markPhaseAsInProgress(patientICPPhase);
					}
				}
			}
		}
	}

	/**
	 * 
	 * @param patientICP
	 * @param phase
	 */
	@SuppressWarnings("unchecked")
	public void bringPhaseIntoScope(PatientICP patientICP, String phase)
	{
		// Check for existing stages
		if (patientICP == null || patientICP.getStages() == null || patientICP.getStages().size() == 0)
			return;
		
		// Check for phase ID
		if (phase == null)
			return;
		
		// Iterate through stages
		Iterator<PatientICPStage> iteratorStage = patientICP.getStages().iterator();
		
		while (iteratorStage.hasNext())
		{
			PatientICPStage icpStage = iteratorStage.next();
			
			// Check for existing phases
			if (icpStage.getStagePhases() != null)
			{
				// Iterate through phases
				Iterator<PatientICPPhase> iteratorPhase = icpStage.getStagePhases().iterator();
				
				while (iteratorPhase.hasNext())
				{
					PatientICPPhase icpPhase = iteratorPhase.next();
					
					// Parse for phase ID
					Integer phaseID = Integer.parseInt(phase);
				
					if (phaseID.equals(icpPhase.getId()) && icpStage.getCurrentStatus().getStatus().getId() == STATUS_NOT_IN_SCOPE)
					{
						// Mark the phase as in progress
						markPhaseAsInProgress(icpPhase);
					}
				}
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	private void markPhaseAsInProgress(PatientICPPhase phase)
	{
		if (phase == null)
			return;
		
		// Create a Phase status VO
		PatientICPPhaseStatusVo status = new PatientICPPhaseStatusVo();
		status.setChangedBy("");
		status.setStatus(ICPPhaseStatus.INPROGRESS);
		status.setStatusDate(new DateTime());
		
		DomainFactory factory = getDomainFactory();
		
		// Extract the BO from status VO
		PatientICPPhaseStatus statusDOM = PatientICPPhaseStatusVoAssembler.extractPatientICPPhaseStatus(factory, status);
		
		// Set phase status to status BO
		phase.setCurrentStatus(statusDOM);
		// Add status BO to status history 
		phase.getStatusHistory().add(statusDOM);
		
		// Mark phase actions as OUTSTANDING
		if (phase.getPhaseActions() != null)
		{
			Iterator<PatientICPAction> iteratorActions = phase.getPhaseActions().iterator();
			
			while (iteratorActions.hasNext())
			{
				PatientICPAction action = iteratorActions.next();
				
				markActionAsOutstanding(action);
			}
		}
	}

	@SuppressWarnings("unchecked")
	private void markActionAsOutstanding(PatientICPAction action)
	{
		if (action == null)
			return;
		
		// Create an action status VO
		PatientICPActionStatusVo status = new PatientICPActionStatusVo();
		status.setChangedBy(null);												// TODO - Fill in member of staff and additional fields
		status.setStatus(ICPActionStatus.OUTSTANDING);
		status.setStatusDate(new DateTime());
		
		DomainFactory factory = getDomainFactory();
		
		// Extract the BO from status VO
		PatientICPActionStatus statusDOM = PatientICPActionStatusVoAssembler.extractPatientICPActionStatus(factory, status);
		
		// Set action status to status BO
		action.setCurrentStatus(statusDOM);
		// Add status BO to status history
		action.getStatusHistory().add(statusDOM);
	}
}
