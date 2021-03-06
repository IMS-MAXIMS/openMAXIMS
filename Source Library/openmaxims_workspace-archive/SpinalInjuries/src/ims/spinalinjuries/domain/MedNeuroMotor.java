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
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.spinalinjuries.domain;

// Generated from form domain impl
public interface MedNeuroMotor extends ims.domain.DomainInterface
{
	// Generated from form domain interface definition
	/**
	* Gets the NeuroMotorExamination record for the current Episode
	*/
	public ims.generalmedical.vo.NeuroMotorExaminationVo getNeuroMotorRecord(ims.core.vo.ClinicalContactShortVo voClinicalContact, ims.generalmedical.vo.NeuroMotorFindingsShortVo voMotorFindingsShort);

	// Generated from form domain interface definition
	/**
	* Saves the given NeuroMotor Record to the database
	*/
	public ims.generalmedical.vo.NeuroMotorExaminationVo saveNeuroMotorRecord(ims.generalmedical.vo.NeuroMotorExaminationVo exam) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	public ims.core.vo.VertebrallevelVoCollection listActiveVertebralLevel();

	// Generated from form domain interface definition
	/**
	* list all NeuroMotor records for the CareContext
	*/
	public ims.generalmedical.vo.NeuroMotorFindingsShortVoCollection listByCareContext(ims.core.vo.CareContextLiteVo voCareContext);

	// Generated from form domain interface definition
	public ims.generalmedical.vo.NeuroMotorExaminationVo getNeuroMotorByCareContext(ims.core.admin.vo.CareContextRefVo voCareContext, ims.generalmedical.vo.NeuroMotorFindingsShortVo voMotorFindings);

	// Generated from form domain interface definition
	/**
	* checks if there is a Clinical Contact of type SpinalMedicalAdission that has a Motor Exam within the CareContext, if so it will be displayed
	*/
	public ims.generalmedical.vo.NeuroMotorExaminationVo getSpinalMedicalAdmissionMotorByCareContext(ims.core.admin.vo.CareContextRefVo voCareContextRef);

	// Generated from form domain interface definition
	/**
	* List HCP's based on filter HCP passed in
	*/
	public ims.core.vo.HcpLiteVoCollection listHCPs(String strHcpName);

	// Generated from form domain interface definition
	public ims.generalmedical.vo.NeuroMotorFindingsVoCollection getNeuroMotorRecordCol(ims.core.vo.ClinicalContactShortVo voVlinicalContact, ims.generalmedical.vo.NeuroMotorFindingsShortVo voMotorFinding);

	// Generated from form domain interface definition
	public ims.generalmedical.vo.MedicalProbOnAdmisVo getPatientProblem(ims.core.vo.ClinicalContactShortVo voClinContact);

	// Generated from form domain interface definition
	public ims.generalmedical.vo.NeuroMotorFindingsVoCollection getSpinalMedicalAdmissionMotorByCareContextCollection(ims.core.admin.vo.CareContextRefVo voCareContextRef);

	// Generated from form domain interface definition
	public ims.generalmedical.vo.MedicalProbOnAdmisVo getPatientProblemByCareContext(ims.core.admin.vo.CareContextRefVo voCareContext);

	// Generated from form domain interface definition
	public ims.generalmedical.vo.NeuroMotorFindingsVoCollection getNeuroMotorCollByCareContext(ims.core.admin.vo.CareContextRefVo voCareContext, ims.generalmedical.vo.NeuroMotorFindingsShortVo voMotorFindings);
}
