// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.domain;

// Generated from form domain impl
public interface PrintCorrespondenceNoteDialog extends ims.domain.DomainInterface
{
	// Generated from form domain interface definition
	/**
	* listReportNotes
	*/
	public ims.RefMan.vo.AppointmentClinicalNotesVoCollection listReportNotes(ims.RefMan.vo.CatsReferralRefVo catsRefVo);

	// Generated from form domain interface definition
	public ims.RefMan.vo.CorrespondenceNoteVo saveReportNote(ims.RefMan.vo.CorrespondenceNoteVo note) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	/**
	* getFollowUpNote
	*/
	public ims.RefMan.vo.CorrespondenceNoteVo getReportNote(ims.RefMan.vo.ReportNoteRefVo note);

	// Generated from form domain interface definition
	public ims.RefMan.vo.CatsReferralWizardVo getCatsReferral(ims.RefMan.vo.CatsReferralRefVo voCatsRef);

	// Generated from form domain interface definition
	public ims.RefMan.vo.CatsReferralWizardVo saveCatsReferral(ims.RefMan.vo.CatsReferralWizardVo record) throws ims.domain.exceptions.DomainInterfaceException, ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	/**
	* getSystemReportAndTemplate
	*/
	public String[] getReportAndTemplate(ims.RefMan.vo.lookups.ReportNoteType reportNoteType);

	// Generated from form domain interface definition
	/**
	* savePatientDocument
	*/
	public void savePatientDocument(ims.core.vo.PatientDocumentVo document, ims.RefMan.vo.CatsReferralWizardVo catReferral) throws ims.domain.exceptions.StaleObjectException;
}
