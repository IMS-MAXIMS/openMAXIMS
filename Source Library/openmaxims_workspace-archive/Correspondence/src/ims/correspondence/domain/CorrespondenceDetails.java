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

package ims.correspondence.domain;

// Generated from form domain impl
public interface CorrespondenceDetails extends ims.domain.DomainInterface
{
	// Generated from form domain interface definition
	/**
	* list all discharge categories for a template
	*/
	public ims.correspondence.vo.TemplateCategoryVo listTemplateDischargeCategories(ims.admin.vo.ReportTemplateVo templateFilterVo);

	// Generated from form domain interface definition
	/**
	* save the document details
	*/
	public ims.correspondence.vo.CorrespondenceDetailsVo saveCorrespondenceDetails(ims.correspondence.vo.CorrespondenceDetailsVo voDocDetail, ims.vo.LookupInstVo pasEventType) throws ims.domain.exceptions.DomainInterfaceException, ims.domain.exceptions.StaleObjectException, ims.domain.exceptions.UniqueKeyViolationException;

	// Generated from form domain interface definition
	/**
	* list Signatories (Consultants and NCHDs)
	*/
	public ims.core.vo.MedicLiteVoCollection listSignatories(String medicName);

	// Generated from form domain interface definition
	/**
	* list referral GPs
	*/
	public ims.core.vo.GpShortVoCollection listReferralGps(ims.core.vo.GP voGpFilter);

	// Generated from form domain interface definition
	/**
	* get PAS Event details
	*/
	public ims.core.vo.PasEventVo getPasEvent(ims.core.admin.pas.vo.PASEventRefVo pasEventRefVo);

	// Generated from form domain interface definition
	/**
	* get the report query and template selected
	*/
	public String[] getReportAndTemplate(Integer nReportId, Integer nTemplateIs) throws ims.domain.exceptions.DomainInterfaceException;

	// Generated from form domain interface definition
	/**
	* get document report query to retrieve 
	*/
	public ims.correspondence.vo.DocReportVo getReport(Integer nReportQueryId);

	// Generated from form domain interface definition
	/**
	* get full patient details
	*/
	public ims.core.vo.Patient getPatient(ims.core.vo.PatientShort voPatient) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	/**
	* getDocument
	*/
	public ims.core.vo.DocumentVo getDocument(ims.core.vo.DocumentVo filter);

	// Generated from form domain interface definition
	public ims.correspondence.vo.CorrespondenceDetailsVo getCorrespondenceDetails(ims.correspondence.vo.CorrespondenceDetailsRefVo voCorrespDetRefVo);

	// Generated from form domain interface definition
	public ims.correspondence.vo.CorrespondenceDetailsVo getCorrespondenceDetailsByPasEvent(ims.core.admin.pas.vo.PASEventRefVo voPasEventRef);

	// Generated from form domain interface definition
	public ims.correspondence.vo.CorrespondenceStatusHistoryVoCollection getCorrespondenceStatusHistory(ims.correspondence.vo.CorrespondenceDetailsRefVo voCorrespDetRef);

	// Generated from form domain interface definition
	/**
	* get patient locally
	*/
	public ims.core.vo.Patient getPatientLocal(ims.core.patient.vo.PatientRefVo patientRefVo);

	// Generated from form domain interface definition
	public ims.core.vo.DocumentVo getCurrentDocument(ims.correspondence.vo.CorrespondenceDetailsRefVo voRefCorrecpondenceDetail);

	// Generated from form domain interface definition
	public ims.admin.vo.ReportTemplateVoCollection listTemplates(Boolean activeOnly, Integer voMedicId, Integer voLocationId, Integer voServiceId);

	// Generated from form domain interface definition
	/**
	* get email information for appuser
	*/
	public ims.admin.vo.UserEmailAccountVo getEmailAppUser(Integer appUserId);
}