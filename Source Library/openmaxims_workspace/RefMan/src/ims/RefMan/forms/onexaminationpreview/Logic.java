// This code was generated by Catalin Tomozei using IMS Development Environment (version 1.71 build 3604.28092)
// Copyright (C) 1995-2009 IMS MAXIMS. All rights reserved.

package ims.RefMan.forms.onexaminationpreview;

import ims.RefMan.vo.CatsReportNoteVo;
import ims.RefMan.vo.ConsultationClinicalNotesLiteVo;
import ims.RefMan.vo.CorrespondenceNoteLiteVo;
import ims.RefMan.vo.DiagnosisManagementLiteVo;
import ims.RefMan.vo.FollowUpNoteLiteVo;
import ims.RefMan.vo.FurtherManagementDetailsVo;
import ims.RefMan.vo.FurtherManagementDetailsVoCollection;
import ims.RefMan.vo.PrescriptionsLiteVo;
import ims.RefMan.vo.ReferralDischargeVo;
import ims.RefMan.vo.ReferralOutcomeLiteVo;
import ims.RefMan.vo.TltSummaryNoteLiteVo;
import ims.RefMan.vo.enums.OnExaminationSelectedTab;
import ims.core.vo.PatientDocumentLiteVo;
import ims.framework.enumerations.DialogResult;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;	

	@Override
	protected void onFormModeChanged()
	{
		
	}
	@Override
	protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException
	{
		if (args.length > 0)
		{
			if (args.length == 2) {
				showSelectedTab(args[0], args[1], null);
			}
			else if (args.length == 3) {
				showSelectedTab(args[0], args[1], args[2]);
			}						
		}
	}

	private void showSelectedTab(Object selectedTab, Object vo, Object parentVo)
	{	
		if (selectedTab == null)
			return;
		
		if (selectedTab instanceof OnExaminationSelectedTab)
		{		
			if (selectedTab.equals(OnExaminationSelectedTab.PATIENT_DOCUMENTS))
			{
				if (vo instanceof PatientDocumentLiteVo)
				{
					form.lyr1().showtabPatientDocuments();
					form.lyr1().tabPatientDocuments().setHeaderVisible(true);
					form.lyr1().tabClinicalNotes().setHeaderVisible(false);
					form.lyr1().tabDiagnosisAndManagement().setHeaderVisible(false);
					form.lyr1().tabPrescription().setHeaderVisible(false);
					form.lyr1().tabOutcome().setHeaderVisible(false);
					form.lyr1().tabFollowUpNotes().setHeaderVisible(false);
					form.lyr1().tabReportNotes().setHeaderVisible(false);
					form.lyr1().tabTLT().setHeaderVisible(false);
					form.lyr1().tabCatsReportNote().setHeaderVisible(false);
				}
			}
			else if (selectedTab.equals(OnExaminationSelectedTab.CLINICAL_NOTES))
			{
				if (vo instanceof ConsultationClinicalNotesLiteVo)
				{
					form.lyr1().showtabClinicalNotes();
					form.lyr1().tabClinicalNotes().ccClinicalNotes().initialize(true,(ConsultationClinicalNotesLiteVo)vo);
					form.lyr1().tabPatientDocuments().setHeaderVisible(false);
					form.lyr1().tabClinicalNotes().setHeaderVisible(true);
					form.lyr1().tabDiagnosisAndManagement().setHeaderVisible(false);
					form.lyr1().tabPrescription().setHeaderVisible(false);
					form.lyr1().tabOutcome().setHeaderVisible(false);
					form.lyr1().tabFollowUpNotes().setHeaderVisible(false);
					form.lyr1().tabReportNotes().setHeaderVisible(false);
					form.lyr1().tabTLT().setHeaderVisible(false);
					form.lyr1().tabCatsReportNote().setHeaderVisible(false);
				}
			}
			else if (selectedTab.equals(OnExaminationSelectedTab.DIAGNOSIS_AND_MANAGEMENT))
			{
				form.lyr1().showtabDiagnosisAndManagement();
				form.lyr1().tabDiagnosisAndManagement().ccDiagnosisManagement().initialize(true, (DiagnosisManagementLiteVo)vo);
				form.lyr1().tabPatientDocuments().setHeaderVisible(false);
				form.lyr1().tabClinicalNotes().setHeaderVisible(false);
				form.lyr1().tabDiagnosisAndManagement().setHeaderVisible(true);
				form.lyr1().tabPrescription().setHeaderVisible(false);
				form.lyr1().tabOutcome().setHeaderVisible(false);
				form.lyr1().tabFollowUpNotes().setHeaderVisible(false);
				form.lyr1().tabReportNotes().setHeaderVisible(false);
				form.lyr1().tabTLT().setHeaderVisible(false);
				form.lyr1().tabCatsReportNote().setHeaderVisible(false);
			}
			else if (selectedTab.equals(OnExaminationSelectedTab.PRESCRIPTIONS))
			{
				form.lyr1().showtabPrescription();
				form.lyr1().tabPrescription().ccPrescription().initialize(true, (PrescriptionsLiteVo)vo);
				form.lyr1().tabPatientDocuments().setHeaderVisible(false);
				form.lyr1().tabClinicalNotes().setHeaderVisible(false);
				form.lyr1().tabDiagnosisAndManagement().setHeaderVisible(false);
				form.lyr1().tabPrescription().setHeaderVisible(true);
				form.lyr1().tabOutcome().setHeaderVisible(false);
				form.lyr1().tabFollowUpNotes().setHeaderVisible(false);
				form.lyr1().tabReportNotes().setHeaderVisible(false);
				form.lyr1().tabTLT().setHeaderVisible(false);
				form.lyr1().tabCatsReportNote().setHeaderVisible(false);
			}
			else if (selectedTab.equals(OnExaminationSelectedTab.FURTHER_MANAGEMENT))
			{
				form.lyr1().showtabOutcome();
				form.lyr1().tabOutcome().ccOutcome().initialize(true, null, (FurtherManagementDetailsVo)vo, (ReferralOutcomeLiteVo)parentVo);
				form.lyr1().tabPatientDocuments().setHeaderVisible(false);
				form.lyr1().tabClinicalNotes().setHeaderVisible(false);
				form.lyr1().tabDiagnosisAndManagement().setHeaderVisible(false);
				form.lyr1().tabPrescription().setHeaderVisible(false);
				form.lyr1().tabOutcome().setHeaderVisible(true);
				form.lyr1().tabFollowUpNotes().setHeaderVisible(false);
				form.lyr1().tabReportNotes().setHeaderVisible(false);
				form.lyr1().tabTLT().setHeaderVisible(false);
				form.lyr1().tabCatsReportNote().setHeaderVisible(false);
			}
			else if (selectedTab.equals(OnExaminationSelectedTab.REFERRAL_DISCHARGED))
			{
				form.lyr1().showtabOutcome();
				form.lyr1().tabOutcome().ccOutcome().initialize(true, (ReferralDischargeVo)vo, null, (ReferralOutcomeLiteVo)parentVo);
				form.lyr1().tabPatientDocuments().setHeaderVisible(false);
				form.lyr1().tabClinicalNotes().setHeaderVisible(false);
				form.lyr1().tabDiagnosisAndManagement().setHeaderVisible(false);
				form.lyr1().tabPrescription().setHeaderVisible(false);
				form.lyr1().tabOutcome().setHeaderVisible(true);
				form.lyr1().tabFollowUpNotes().setHeaderVisible(false);
				form.lyr1().tabReportNotes().setHeaderVisible(false);
				form.lyr1().tabTLT().setHeaderVisible(false);
				form.lyr1().tabCatsReportNote().setHeaderVisible(false);
			}
			else if (selectedTab.equals(OnExaminationSelectedTab.FOLLOW_UP_NOTES))
			{
				form.lyr1().showtabFollowUpNotes();
				form.lyr1().tabFollowUpNotes().ccFollowUpNotes().initialize(true, (FollowUpNoteLiteVo)vo);
				form.lyr1().tabPatientDocuments().setHeaderVisible(false);
				form.lyr1().tabClinicalNotes().setHeaderVisible(false);
				form.lyr1().tabDiagnosisAndManagement().setHeaderVisible(false);
				form.lyr1().tabPrescription().setHeaderVisible(false);
				form.lyr1().tabOutcome().setHeaderVisible(false);
				form.lyr1().tabFollowUpNotes().setHeaderVisible(true);
				form.lyr1().tabReportNotes().setHeaderVisible(false);
				form.lyr1().tabTLT().setHeaderVisible(false);
				form.lyr1().tabCatsReportNote().setHeaderVisible(false);
			}
			else if (selectedTab.equals(OnExaminationSelectedTab.REPORT_NOTES))
			{
				form.lyr1().showtabReportNotes();
				form.lyr1().tabReportNotes().ccReportNotes().initialize(true, (CorrespondenceNoteLiteVo)vo);
				form.lyr1().tabPatientDocuments().setHeaderVisible(false);
				form.lyr1().tabClinicalNotes().setHeaderVisible(false);
				form.lyr1().tabDiagnosisAndManagement().setHeaderVisible(false);
				form.lyr1().tabPrescription().setHeaderVisible(false);
				form.lyr1().tabOutcome().setHeaderVisible(false);
				form.lyr1().tabFollowUpNotes().setHeaderVisible(false);
				form.lyr1().tabReportNotes().setHeaderVisible(true);
				form.lyr1().tabTLT().setHeaderVisible(false);
				form.lyr1().tabCatsReportNote().setHeaderVisible(false);
			}
			else if (selectedTab.equals(OnExaminationSelectedTab.TLT))
			{
				form.lyr1().showtabTLT();
				form.lyr1().tabTLT().lyrTLT().tabPageTLTNotes().ccTLT().initialize(true, (TltSummaryNoteLiteVo)vo);
				form.lyr1().tabPatientDocuments().setHeaderVisible(false);
				form.lyr1().tabClinicalNotes().setHeaderVisible(false);
				form.lyr1().tabDiagnosisAndManagement().setHeaderVisible(false);
				form.lyr1().tabPrescription().setHeaderVisible(false);
				form.lyr1().tabOutcome().setHeaderVisible(false);
				form.lyr1().tabFollowUpNotes().setHeaderVisible(false);
				form.lyr1().tabReportNotes().setHeaderVisible(false);
				form.lyr1().tabTLT().setHeaderVisible(true);
				form.lyr1().tabCatsReportNote().setHeaderVisible(false);
			}
		}
		else if (selectedTab instanceof CatsReportNoteVo)
		{
			form.lyr1().showtabCatsReportNote();
			form.lyr1().tabCatsReportNote().ccCatsReferral().initialize(true, (CatsReportNoteVo)vo);
			form.lyr1().tabPatientDocuments().setHeaderVisible(false);
			form.lyr1().tabClinicalNotes().setHeaderVisible(false);
			form.lyr1().tabDiagnosisAndManagement().setHeaderVisible(false);
			form.lyr1().tabPrescription().setHeaderVisible(false);
			form.lyr1().tabOutcome().setHeaderVisible(false);
			form.lyr1().tabFollowUpNotes().setHeaderVisible(false);
			form.lyr1().tabReportNotes().setHeaderVisible(false);
			form.lyr1().tabTLT().setHeaderVisible(false);
			form.lyr1().tabCatsReportNote().setHeaderVisible(true);					
		}
	}
		
	@Override
	protected void onBtnCloseClick() throws ims.framework.exceptions.PresentationLogicException
	{
		engine.close(DialogResult.OK);
	}	
}