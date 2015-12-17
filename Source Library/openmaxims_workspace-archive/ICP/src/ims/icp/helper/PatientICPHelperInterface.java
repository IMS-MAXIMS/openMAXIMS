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
import ims.core.vo.HcpLiteVo;
import ims.domain.DomainInterface;
import ims.icp.vo.ICPConfiguration_CreateVo;
import ims.icp.vo.PatientICPPhase_StatusChangeVo;
import ims.icp.vo.PatientICPStage_StatusChangeVo;
import ims.icp.vo.PatientICP_CreationVo;
import ims.icp.vo.PatientICP_PresentationVo;
import ims.icp.vo.PatientICP_StatusChangeVo;
import ims.icps.instantiation.vo.PatientICPPhaseRefVo;
import ims.icps.instantiation.vo.PatientICPRefVo;
import ims.icps.instantiation.vo.PatientICPStageRefVo;

public interface PatientICPHelperInterface extends DomainInterface
{
	/**
	 *	Function used to retrieve Patient ICP for display
	 */
	public PatientICP_PresentationVo getPatientICPQueryFetch(PatientICPRefVo icp);


	/**
	 *	Function used to retrieve Patient ICP for bringing Stage / Phases into scope
	 */
	public PatientICP_StatusChangeVo getPatientICPBringStagePhaseIntoScope(PatientICPRefVo icp);
	
	/**
	 *	Function used to retrieve Patient ICP Stage for updating the status 
	 */
	public PatientICPStage_StatusChangeVo getPatientStageForStatusChange(PatientICPStageRefVo stage);

	/**
	 * Function used to retrieve Patient ICP Phase for updating the status
	 */
	public PatientICPPhase_StatusChangeVo getPatientPhaseForStatusChange(PatientICPPhaseRefVo phase);
	
	
	/**
	 * Function used to create a Patient ICP record based on the provided parameters 
	 * @param icpConfig
	 * @param patient
	 * @param careContext
	 * @param clinicalContact
	 * @param pasEvent
	 * @param hcp
	 * @return
	 */
	public PatientICP_CreationVo createPatientICP(ICPConfiguration_CreateVo icpConfig, PatientRefVo patient, CareContextRefVo careContext, ClinicalContactRefVo clinicalContact, PASEventRefVo pasEvent, HcpLiteVo hcp);
}
