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
// Copyright (C) 1995-2006 IMS MAXIMS plc. All rights reserved.

package ims.clinical.forms.patientsummary;

import ims.clinical.forms.patientsummary.GenForm.ctnSummaryContainer.GroupProcedureEnumeration;
import ims.clinical.forms.patientsummary.GenForm.ctnSummaryContainer.grdDiagnosisRow;
import ims.clinical.forms.patientsummary.GenForm.ctnSummaryContainer.grdProcedureRow;
import ims.clinical.forms.patientsummary.GenForm.grdListRow;
import ims.clinical.vo.CSPrimaryDiagnosisAndPoceduresVo;
import ims.clinical.vo.ClinicalDIAssociationVoCollection;
import ims.clinical.vo.ContextFilterVo;
import ims.clinical.vo.lookups.CDIAssociationDescription;
import ims.clinical.vo.lookups.PatientProcedureOutcome;
import ims.configuration.AppRight;
import ims.configuration.gen.ConfigFlag;
import ims.core.admin.pas.vo.PASEventRefVo;
import ims.core.admin.vo.CareContextRefVo;
import ims.core.admin.vo.CareContextRefVoCollection;
import ims.core.admin.vo.CareSpellRefVo;
import ims.core.admin.vo.ClinicalContactRefVo;
import ims.core.admin.vo.EpisodeOfCareRefVo;
import ims.core.admin.vo.EpisodeOfCareRefVoCollection;
import ims.core.clinical.vo.PatientDiagnosisRefVo;
import ims.core.clinical.vo.PatientProblemRefVo;
import ims.core.clinical.vo.PatientProcedureRefVo;
import ims.core.helper.ResetPIDBarHelper;
import ims.core.vo.CareContextShortVo;
import ims.core.vo.CareContextStatusHistoryVo;
import ims.core.vo.CareContextStatusHistoryVoCollection;
import ims.core.vo.CareContextVo;
import ims.core.vo.CareContextVoCollection;
import ims.core.vo.CareSpellStatusHistoryVo;
import ims.core.vo.CareSpellStatusHistoryVoCollection;
import ims.core.vo.CareSpellVo;
import ims.core.vo.CareSpellVoCollection;
import ims.core.vo.ClinicalContactShortVo;
import ims.core.vo.ClinicalContactShortVoCollection;
import ims.core.vo.ClinicalContactStatusHistoryVo;
import ims.core.vo.ClinicalContactStatusHistoryVoCollection;
import ims.core.vo.ClinicalNotesShortVo;
import ims.core.vo.ClinicalNotesVo;
import ims.core.vo.EpisodeOfCareStatusHistoryVo;
import ims.core.vo.EpisodeOfCareStatusHistoryVoCollection;
import ims.core.vo.EpisodeofCareShortVo;
import ims.core.vo.EpisodeofCareVo;
import ims.core.vo.EpisodeofCareVoCollection;
import ims.core.vo.PatientDiagnosisShortVo;
import ims.core.vo.PatientDiagnosisShortVoCollection;
import ims.core.vo.PatientProblemVo;
import ims.core.vo.PatientProblemVoCollection;
import ims.core.vo.PatientProcedureShortVo;
import ims.core.vo.PatientProcedureShortVoCollection;
import ims.core.vo.lookups.CareContextStatus;
import ims.core.vo.lookups.CareSpellDialogMode;
import ims.core.vo.lookups.ClinicalContactStatus;
import ims.core.vo.lookups.EpisodeOfCareStatus;
import ims.core.vo.lookups.LateralityLRB;
import ims.core.vo.lookups.PatientProcedureStatus;
import ims.core.vo.lookups.ProblemGroupStatus;
import ims.core.vo.lookups.SourceOfNote;
import ims.core.vo.lookups.WorklistContactType;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.exceptions.UniqueKeyViolationException;
import ims.framework.FormName;
import ims.framework.enumerations.DialogResult;
import ims.framework.enumerations.FormMode;
import ims.framework.exceptions.CodingRuntimeException;
import ims.framework.exceptions.PresentationLogicException;
import ims.framework.utils.Color;
import ims.framework.utils.Date;
import ims.framework.utils.DateTime;
import ims.framework.utils.Image;
import ims.framework.utils.PartialDate;
import ims.utils.textile.Textile;
import ims.vo.ValueObject;

public class Logic extends BaseLogic
{
	private static final String	INDENT	= "";


	protected void onFormOpen() throws ims.framework.exceptions.PresentationLogicException
	{
		initialize();
		open();
		reselectGrid();
	}

	private void reselectGrid()
	{
		CareSpellVo vocareSpell = form.getGlobalContext().Clinical.PatientSummary.getCareSpell();
		ClinicalContactShortVo voContact = form.getGlobalContext().Core.getCurrentClinicalContact();
		CareContextShortVo voCareContext = form.getGlobalContext().Core.getCurrentCareContext();
		EpisodeofCareShortVo voEpisodeOfCare = form.getGlobalContext().Core.getEpisodeofCareShort();
	
		if(voContact != null)
			form.grdList().setValue(voContact);
		else if(voCareContext != null)
			form.grdList().setValue(voCareContext);
		else if(voEpisodeOfCare != null)
			form.grdList().setValue(voEpisodeOfCare);
		else if (vocareSpell != null) //WDEV-14578
			form.grdList().setValue(vocareSpell);
		else
		{
			updateControlsState();
			return;
		}
		
		gridListSelectionChanged();
	}

	private void open()
	{
		listCareSpells();
		clearNonPersistentGlobalContexts();
		if (allowPatientSummaryCDIdisplay())
		{
			listCDIDetails();
			listProcedures();
			
			enableDiagnosisGridContextMenu();
			enableProcedureContextMenu();
		}
		form.ctnSummary().setCaption("Patient");
		//wdev-13977
		form.getContextMenus().hideAllClinicalContactsListMenuItems();
		form.getContextMenus().getClinicalContactsListNewCareGroupingItem().setVisible(true);
		updateContextMenuState();
		enableDiagnosisGridContextMenu();
		enableProcedureContextMenu();
		//---------
		
		resetPIDBarText();
	}

	private void clearNonPersistentGlobalContexts()
	{
		form.getGlobalContext().Core.CurrentCareContext.setContextType(null);
		form.getGlobalContext().Core.setParentClinContact(null);
		form.getGlobalContext().Core.setClinicalContact(null);
	}

	private void listCareSpells()
	{
		int nContext = getIndexItem(form.cmbContext().getValue());	//wdev-13335
		CareSpellVoCollection voCollCareSpells = domain.listCareSpellsByPatientAndCriteria(form.getGlobalContext().Core.getPatientShort(), form.dteDateFrom().getValue(), form.dteDateTo().getValue(),nContext,form.getLocalContext().getShowCancelledContexts()); //wdev-13335 , //wdev-13977
		//CareSpellVoCollection voCollCareSpells = domain.listCareSpellsByPatient(form.getGlobalContext().Core.getPatientShort());
		populateGrid(voCollCareSpells);
	}

	private void populateGrid(CareSpellVoCollection voCollCareSpells)
	{
		form.grdList().getRows().clear();
		form.getLocalContext().setCareContextCollection(new CareContextRefVoCollection()); 		//wdev-13896
		form.getLocalContext().setEpisodeOfCareCollection(new EpisodeOfCareRefVoCollection());	//wdev13896
		if (voCollCareSpells != null)
		{
			populateCareSpellRows(voCollCareSpells);
		}
		//wdev-13896
		form.getLocalContext().setEpisodeOfCareCollection(domain.getEpisodeOfCareIdThatHasHistory(form.getLocalContext().getEpisodeOfCareCollection()));
		form.getLocalContext().setCareContextCollection(domain.getCareContextThatHasHistoryId(form.getLocalContext().getCareContextCollection()));
		if(form.getLocalContext().getEpisodeOfCareCollectionIsNotNull())
		{
			showHistoryButtonForEpisodeOfCareInGrid();
		}
		if(form.getLocalContext().getCareContextCollectionIsNotNull())
		{
			showHistoryButtonForCareContextInGrid();
		}
		//----------
	}
	//wdev-13896
	private void showHistoryButtonForCareContextInGrid()
	{
		CareContextRefVoCollection refCareContextColl = form.getLocalContext().getCareContextCollection();
		if(refCareContextColl != null && refCareContextColl.size() > 0)
		{
			grdListRow[] rowVectColl = form.grdList().getAllRows();
			for(int k = 0; k < rowVectColl.length;k++)
			{
				
				if(rowVectColl[k].getValue() instanceof CareContextVo)
				{
					CareContextVo voCare = (CareContextVo) rowVectColl[k].getValue(); 
					for(int i = 0; i < refCareContextColl.size();i++)
					{
						if(voCare != null && voCare.getID_CareContextIsNotNull() && voCare.getID_CareContext().equals(refCareContextColl.get(i).getID_CareContext()))
						{
							rowVectColl[k].setColumnHistoryEmpty(false);
							// WDEV-17175
							rowVectColl[k].setTooltipForColumnHistory("History"); //WDEV-14021 ,wdev-16293
							
						}
					}
				}
			}
		}
	}
	//wdev-13896
	private void showHistoryButtonForEpisodeOfCareInGrid()
	{
		EpisodeOfCareRefVoCollection refEpisodeOfCareColl = form.getLocalContext().getEpisodeOfCareCollection();
		if(refEpisodeOfCareColl != null && refEpisodeOfCareColl.size() > 0)
		{
			grdListRow[] rowVectColl = form.grdList().getAllRows();
			
			for(int k = 0; k < rowVectColl.length; k++)
			{
				
				if(rowVectColl[k].getValue() instanceof EpisodeofCareVo)
				{
					EpisodeofCareVo voEpCare = (EpisodeofCareVo) rowVectColl[k].getValue(); 
					for(int i = 0; i < refEpisodeOfCareColl.size();i++)
					{
						if(voEpCare != null && voEpCare.getID_EpisodeOfCareIsNotNull() && voEpCare.getID_EpisodeOfCare().equals(refEpisodeOfCareColl.get(i).getID_EpisodeOfCare()))
						{
							rowVectColl[k].setColumnHistoryEmpty(false);
							rowVectColl[k].setTooltipForColumnHistory("History"); //WDEV-14021 
						}
					}
				}
			}
		}
	}
	private void populateCareSpellRows(CareSpellVoCollection voCollCareSpells)
	{
		grdListRow careSpellRow;
		for (int i = 0; i < voCollCareSpells.size(); i++)
		{
			careSpellRow = form.grdList().getRows().newRow();
			CareSpellVo careSpellVo = voCollCareSpells.get(i);
			setStartDateEndDateAndTooltip(careSpellRow, careSpellVo);
			careSpellRow.setCollapsedImage(form.getImages().Core.CareSpell);
			careSpellRow.setExpandedImage(form.getImages().Core.CareSpell);
			careSpellRow.setBackColor(Color.Bisque);
			careSpellRow.setBold(true);
			careSpellRow.setValue(careSpellVo);
			careSpellRow.setColumnHistoryEmpty(true);   //wdev-13896
			//wdev-13977
			if(voCollCareSpells.get(i).getCurrentStatusIsNotNull() && voCollCareSpells.get(i).getCurrentStatus().getStatusIsNotNull() 
					&& voCollCareSpells.get(i).getCurrentStatus().getStatus().equals(ProblemGroupStatus.CANCELLED))
				careSpellRow.setBackColor(ConfigFlag.UI.DISPLAY_COLOUR_FOR_CANCELLED_PROBLEM_GROUPS.getValue());
			//-------

			

			if (careSpellVo.getEndDateIsNotNull())
				form.getLocalContext().setParentEnded(Boolean.TRUE);

			boolean bCollapseAll = populateEpisodeOfCareRows(careSpellVo.getEpisodes().sort(), careSpellRow);
			careSpellRow.setExpanded(!bCollapseAll);
		}
	}

	private void setStartDateEndDateAndTooltip(grdListRow careSpellRow, CareSpellVo careSpellVo)
	{
		CSDiagnosisAndProcedureTextAndTooltip textAndTooltip = getPrimaryDiagnosisAndProblems(careSpellVo);
		careSpellRow.setcolStartDateEndDate(careSpellVo.createDisplayString() + textAndTooltip.getText());
		//careSpellRow.setTooltip(textAndTooltip.getTooltip());
		careSpellRow.setTooltip("Problem Group: " + careSpellVo.createDisplayString() + textAndTooltip.getText());
		
	}

	private boolean populateEpisodeOfCareRows(EpisodeofCareVoCollection voCollEpisodeOfCare, grdListRow careSpellRow)
	{
		int endedCount = 0;
		if (voCollEpisodeOfCare != null && careSpellRow != null)
		{
			grdListRow episodeOfCareRow;
			for (int i = 0; i < voCollEpisodeOfCare.size(); i++)
			{
				episodeOfCareRow = careSpellRow.getRows().newRow();

				episodeOfCareRow.setcolStartDateEndDate(voCollEpisodeOfCare.get(i).createDisplayString());
				episodeOfCareRow.setTooltipForcolStartDateEndDate("Episode of Care: " + voCollEpisodeOfCare.get(i).createDisplayString());
				episodeOfCareRow.setcolSpeciality( voCollEpisodeOfCare.get(i).getSpecialtyIsNotNull() ? INDENT + voCollEpisodeOfCare.get(i).getSpecialty().getText() : null);
				episodeOfCareRow.setTooltipForcolSpeciality("Episode of Care: " +(voCollEpisodeOfCare.get(i).getSpecialtyIsNotNull() ? INDENT + voCollEpisodeOfCare.get(i).getSpecialty().getText() : ""));
				if (voCollEpisodeOfCare.get(i).getResponsibleHCPIsNotNull())
				{
					//episodeOfCareRow.setcolRMO(voCollEpisodeOfCare.get(i).getResponsibleHCP().getMosIsNotNull() ? INDENT + voCollEpisodeOfCare.get(i).getResponsibleHCP().getMos().toString() : null);
					episodeOfCareRow.setcolRMO(voCollEpisodeOfCare.get(i).getResponsibleHCP().getMosIsNotNull() ? INDENT + getFirst21Char(voCollEpisodeOfCare.get(i).getResponsibleHCP().getMos().toString()) : null);		//wdev-16293
					episodeOfCareRow.setTooltipForcolRMO("Episode of Care: " + (voCollEpisodeOfCare.get(i).getResponsibleHCP().getMosIsNotNull() ? INDENT + voCollEpisodeOfCare.get(i).getResponsibleHCP().getMos().toString() : ""));
				}
				episodeOfCareRow.setCollapsedImage(form.getImages().Core.EpisodeOfCare);
				episodeOfCareRow.setExpandedImage(form.getImages().Core.EpisodeOfCare);
				episodeOfCareRow.setValue(voCollEpisodeOfCare.get(i));
				//wdev-13896
				episodeOfCareRow.setColumnHistoryEmpty(true);   //wdev-13896
				EpisodeOfCareRefVoCollection refEpisodeVoColl = form.getLocalContext().getEpisodeOfCareCollection();
				if( refEpisodeVoColl == null )
					refEpisodeVoColl = new EpisodeOfCareRefVoCollection();
				refEpisodeVoColl.add(voCollEpisodeOfCare.get(i));
				form.getLocalContext().setEpisodeOfCareCollection(refEpisodeVoColl);
				//wdev-13977
				if(voCollEpisodeOfCare.get(i).getCurrentStatusIsNotNull() && voCollEpisodeOfCare.get(i).getCurrentStatus().getStatusIsNotNull() 
						&& voCollEpisodeOfCare.get(i).getCurrentStatus().getStatus().equals(EpisodeOfCareStatus.CANCELLED))
					episodeOfCareRow.setBackColor(ConfigFlag.UI.DISPLAY_COLOUR_FOR_CANCELLED_EPISODES_OF_CARE.getValue());
				//-------
				//----------------------------------	
				populateCareContextRows(voCollEpisodeOfCare.get(i).getCareContexts().sort(), episodeOfCareRow);
				
				if(voCollEpisodeOfCare.get(i).getEndDate() == null)
					episodeOfCareRow.setExpanded(true);
				else
					endedCount++;
			}
			
			return (endedCount == voCollEpisodeOfCare.size());
		}

		return false;
	}
	//wdev-16293
	private String getFirst21Char(String dtrg)
	{
		if( dtrg != null )
		{
			int lung = dtrg.length();
			if( lung > 31)
				return dtrg.substring(0, 30);
			else
				return dtrg;
		}
		return null;
	}
	private void populateCareContextRows(CareContextVoCollection voCollCareContexts, grdListRow episodeOfCareRow)
	{
		if (voCollCareContexts != null && episodeOfCareRow != null)
		{
			voCollCareContexts.sort();
			grdListRow careContextRow;
			for (int i = 0; i < voCollCareContexts.size(); i++)
			{
				careContextRow = episodeOfCareRow.getRows().newRow();

				String displayString = "";
				if (ConfigFlag.GEN.DISPLAY_DISCHARGE_OUTCOME_INFO_ON_PATIENT_SUMMARY.getValue() == true){
					displayString = createDischargeDisplayString(voCollCareContexts.get(i));
				}
				else
					displayString = voCollCareContexts.get(i).createDisplayString();
					
				
				careContextRow.setcolStartDateEndDate(displayString);
				careContextRow.setTooltipForcolStartDateEndDate("Care Context: " + displayString);
				careContextRow.setcolSpeciality(voCollCareContexts.get(i).getContextIsNotNull() ? INDENT + INDENT +  voCollCareContexts.get(i).getContext().getText() : null);
				careContextRow.setTooltipForcolSpeciality("Care Context: " + (voCollCareContexts.get(i).getContextIsNotNull() ? INDENT + INDENT +  voCollCareContexts.get(i).getContext().getText() : ""));
				careContextRow.setCollapsedImage(form.getImages().Core.CareContext);
				careContextRow.setExpandedImage(form.getImages().Core.CareContext);
				
				//WDEV-10286
				if(voCollCareContexts.get(i).getResponsibleHCPIsNotNull())
				{
					careContextRow.setcolRMO(voCollCareContexts.get(i).getResponsibleHCP().getIHcpName());
				}
				
				//WDEV-13764 
				if(voCollCareContexts.get(i).getCurrentStatusIsNotNull() && voCollCareContexts.get(i).getCurrentStatus().getStatusIsNotNull() 
						&& voCollCareContexts.get(i).getCurrentStatus().getStatus().equals(CareContextStatus.CANCELLED))
					careContextRow.setBackColor(ConfigFlag.UI.DISPLAY_COLOUR_FOR_CANCELLED_CARE_CONTEXTS.getValue());
				
				careContextRow.setValue(voCollCareContexts.get(i));
				//wdev-13896
				careContextRow.setColumnHistoryEmpty(true);   //wdev-13896
				CareContextRefVoCollection refCareContextVoColl = form.getLocalContext().getCareContextCollection();
				if( refCareContextVoColl == null)
					refCareContextVoColl = new CareContextRefVoCollection();
				refCareContextVoColl.add(voCollCareContexts.get(i));
				form.getLocalContext().setCareContextCollection(refCareContextVoColl);
				
				//-----------------------------------
				
				populateClinicalContacts(voCollCareContexts.get(i).getClinicalContacts().sort(), careContextRow);
				
				if(voCollCareContexts.get(i).getEndDateTime() == null)
					careContextRow.setExpanded(true);
			}
		}
	}

	private String createDischargeDisplayString(CareContextVo vo) {
			String strCareContext = vo.getStartDateTimeIsNotNull() ? vo.getStartDateTime().toString() : "";

			if (vo.getEndDateTimeIsNotNull()){
				strCareContext += " - ";
				strCareContext += vo.getEndDateTime().toString();
			}
			
			if (vo.getDischargeReasonIsNotNull()){
				strCareContext += " - ";
				strCareContext += vo.getDischargeReason().toString();
			}

			return strCareContext;
	}

	private void populateClinicalContacts(ClinicalContactShortVoCollection voCollclinicalContacts, grdListRow careContextRow)
	{
		if (voCollclinicalContacts != null && careContextRow != null)
		{
			voCollclinicalContacts.sort();
			grdListRow clinicalContactRow = null;
			for (int i = 0; i < voCollclinicalContacts.size(); i++)
			{
				clinicalContactRow = careContextRow.getRows().newRow();

				clinicalContactRow.setcolStartDateEndDate(voCollclinicalContacts.get(i).createDisplayString());
				clinicalContactRow.setTooltipForcolStartDateEndDate("Clinical Contact: " + voCollclinicalContacts.get(i).createDisplayString());
				clinicalContactRow.setcolSpeciality(voCollclinicalContacts.get(i).getSpecialtyIsNotNull() ? INDENT + INDENT + INDENT + voCollclinicalContacts.get(i).getSpecialty().getText() : null);
				clinicalContactRow.setTooltipForcolSpeciality("Clinical Contact: " + (voCollclinicalContacts.get(i).getSpecialtyIsNotNull() ? INDENT + INDENT + INDENT + voCollclinicalContacts.get(i).getSpecialty().getText() : ""));
				if (ConfigFlag.UI.DISPLAY_WORKLIST_CONTACT_TYPE_ON_PATIENT_SUMMARY.getValue() == true){
					if(voCollclinicalContacts.get(i).getContactTypeIsNotNull()){
						WorklistContactType lkupWorklistContactType = domain.getWorklistContactTypeByExternalCode(voCollclinicalContacts.get(i).getContactType());
						if(lkupWorklistContactType!=null)
						{
							clinicalContactRow.setcolContactType(lkupWorklistContactType.getText());
							clinicalContactRow.setTooltipForcolContactType("Clinical Contact: " + lkupWorklistContactType.getText());
						}
						else
						{
							clinicalContactRow.setcolContactType(voCollclinicalContacts.get(i).getContactTypeIsNotNull() ? voCollclinicalContacts.get(i).getContactType().getText() : null);
							clinicalContactRow.setTooltipForcolContactType("Clinical Contact: " + (voCollclinicalContacts.get(i).getContactTypeIsNotNull() ? voCollclinicalContacts.get(i).getContactType().getText() : ""));
						}
					}
				}
				else
				{
					clinicalContactRow.setcolContactType(voCollclinicalContacts.get(i).getContactTypeIsNotNull() ? voCollclinicalContacts.get(i).getContactType().getText() : null);
					clinicalContactRow.setTooltipForcolContactType("Clinical Contact: " + (voCollclinicalContacts.get(i).getContactTypeIsNotNull() ? voCollclinicalContacts.get(i).getContactType().getText() : ""));
				}
				
				clinicalContactRow.setcolRMO(voCollclinicalContacts.get(i).getSeenByIsNotNull() ? INDENT + INDENT + INDENT +  voCollclinicalContacts.get(i).getSeenBy().toString() : null);
				clinicalContactRow.setTooltipForcolRMO("Clinical Contact: " + (voCollclinicalContacts.get(i).getSeenByIsNotNull() ? INDENT + INDENT + INDENT +  voCollclinicalContacts.get(i).getSeenBy().toString() : ""));
				clinicalContactRow.setCollapsedImage(form.getImages().Admin.MemberOfStaff);
				clinicalContactRow.setExpandedImage(form.getImages().Admin.MemberOfStaff);
				clinicalContactRow.setColumnHistoryEmpty(true);   //wdev-13896
				
				//WDEV-13764 
				if(voCollclinicalContacts.get(i).getCurrentStatusIsNotNull() && voCollclinicalContacts.get(i).getCurrentStatus().getStatusIsNotNull() 
						&& voCollclinicalContacts.get(i).getCurrentStatus().getStatus().equals(ClinicalContactStatus.CANCELLED))
					clinicalContactRow.setBackColor(ConfigFlag.UI.DISPLAY_COLOUR_FOR_CANCELLED_CLINICAL_CONTACTS.getValue());
				
				clinicalContactRow.setValue(voCollclinicalContacts.get(i));
			}
		}
	}
	
	private void initialize()
	{
		// wdev-2689
		if (ConfigFlag.DOM.READ_AUDIT_ENABLED.getValue() == true)
		{
			try
			{
				domain.recordReadAudit(form.getGlobalContext().Core.getPatientShort());
			}
			catch (StaleObjectException e)
			{
				e.printStackTrace();
			}
		}
		
		// WDEV-14909
		// Set local context to show / not show cancelled care contexts
		form.getLocalContext().setShowCancelledContexts(ConfigFlag.UI.PATIENT_SUMMARY_SHOW_CANCELLED_CONTEXTS_BY_DEFAULT.getValue());
		
		form.getContextMenus().getClinicalContactsListNewCareGroupingItem().setVisible(true);
		updateContextMenuState();
		form.ctnSummary().setCollapsed(false);
		form.chkPatientView().setValue(true);

		form.ctnSummary().GroupDiagnosis().setValue(GenForm.ctnSummaryContainer.GroupDiagnosisEnumeration.rdoAllDiag);
		form.ctnSummary().GroupProcedure().setValue(GenForm.ctnSummaryContainer.GroupProcedureEnumeration.rdoAllProc);
		
		form.getGlobalContext().Clinical.setReturnToFormName(null);//wdev-1716
		form.getGlobalContext().Clinical.setReturnToFormMode(null);//wdev-1716

		if (!allowPatientSummaryCDIdisplay())
		{
			form.ctnSummary().setCollapsed(true);
			form.ctnSummary().setVisible(false);
		}
		//wdev-13335
		form.cmbContext().clear();
		form.cmbContext().newRow("Care Spell","Care Spell");
		form.cmbContext().newRow("Episode of Care","Episode of Care");
		form.cmbContext().newRow("Care Context","Care Context");
		form.cmbContext().newRow("Clinical Contact", "Clinical Contact");//	WDEV-14914
		//wdev-13618
		ContextFilterVo tempVo = form.getGlobalContext().Clinical.getContextFilter();
		if(tempVo != null)
		{
			form.cmbContext().setValue(getContext(tempVo.getContext()));
			form.dteDateFrom().setValue(tempVo.getDateFrom());
			form.dteDateTo().setValue(tempVo.getDateTo());
		}
		//---------
		cmbContextValueHasChanghed();
	}

	protected void onGrdDiagnosisSelectionChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		enableDiagnosisGridContextMenu();
		unmarkDiagnosisGridAssociations();
		unmarkProcedureGridAssociations();
		setFlagDisplayAssociationsOnSummary(null);
	}

	private void unmarkDiagnosisGridAssociations()
	{
		if(isAssociationOnSummaryDisplayed())
		{
			for (int i = 0; i < form.ctnSummary().grdDiagnosis().getRows().size(); i++)
			{
				grdDiagnosisRow row = form.ctnSummary().grdDiagnosis().getRows().get(i);
				if(row.getValue() instanceof PatientDiagnosisShortVo)
				{
					row.setTooltip(((PatientDiagnosisShortVo)row.getValue()).getTooltipForDiAssociation());	
				}
				
				if(row.getValue() instanceof PatientProblemVo)
				{
					row.setTooltip(((PatientProblemVo)row.getValue()).getDiAssociationTooltip());
				}
				
				row.setBackColor(Color.Default);
			}
		}
	}
	
	private void unmarkProcedureGridAssociations()
	{
		if(isAssociationOnSummaryDisplayed())
		{
			for (int i = 0; i < form.ctnSummary().grdProcedure().getRows().size(); i++)
			{
				grdProcedureRow row = form.ctnSummary().grdProcedure().getRows().get(i);
				row.setBackColor(Color.Default);
				if(row.getValue() instanceof PatientProcedureShortVo)
				{
					row.setTooltip(((PatientProcedureShortVo)row.getValue()).getDiAssociationsTooltip());
				}
			}
		}
	}

	private void enableDiagnosisGridContextMenu()
	{
		boolean isRecordSelected = form.ctnSummary().grdDiagnosis().getSelectedRowIndex() >= 0;
		//boolean  = form.getGlobalContext().Core.getCurrentCareContextIsNotNull();
		boolean isCareContextSel;	//wdev-13296
		if(form.grdList().getValue() instanceof EpisodeofCareVo) //wdev-13296
		{
			if(form.ctnSummary().grdDiagnosis().getValue() != null)	//wdev-13296
				isCareContextSel =  form.getGlobalContext().Core.getEpisodeofCareShortIsNotNull() && (form.ctnSummary().grdDiagnosis().getValue() instanceof PatientDiagnosisShortVo);     //wdev-13296
			else
				isCareContextSel = form.getGlobalContext().Core.getEpisodeofCareShortIsNotNull();
		}
		else
			isCareContextSel = form.getGlobalContext().Core.getCurrentCareContextIsNotNull();
		
		form.getContextMenus().getPatSummaryDiagCompVIEWItem().setVisible(isCareContextSel && isRecordSelected);
		form.getContextMenus().getPatSummaryDiagCompVIEWLINKSDIALOGItem().setVisible(isRecordSelected);
		form.getContextMenus().getPatSummaryDiagCompDISPLAYLINKSSUMMARYItem().setVisible(isRecordSelected);
		form.getContextMenus().getPatSummaryDiagCompNEWDIAGNOSISItem().setVisible(isCareContextSel);
		form.getContextMenus().getPatSummaryDiagCompNEWPROBLEMItem().setVisible(form.getGlobalContext().Core.getCurrentCareContextIsNotNull()); //wdev-13296
	}


	private void markGridAssociations(ClinicalDIAssociationVoCollection voCollDiAsociations, Boolean bDiagnosis, String association, String headerTooltip)
	{
		setFlagDisplayAssociationsOnSummary(Boolean.TRUE);
		
		if (voCollDiAsociations == null)
			return;

		for (int p = 0; p < form.ctnSummary().grdDiagnosis().getRows().size(); p++)
		{
			form.ctnSummary().grdDiagnosis().getRows().get(p).setBackColor(Color.Default);
		}

		for (int p = 0; p < form.ctnSummary().grdProcedure().getRows().size(); p++)
		{
			form.ctnSummary().grdProcedure().getRows().get(p).setBackColor(Color.Default);
		}

		if (bDiagnosis.booleanValue())
		{
			if (form.ctnSummary().grdDiagnosis().getSelectedRow() != null)
				form.ctnSummary().grdDiagnosis().getSelectedRow().setBackColor(Color.LightYellow);
		}
		else
		{
			if (form.ctnSummary().grdProcedure().getSelectedRow() != null)
				form.ctnSummary().grdProcedure().getSelectedRow().setBackColor(Color.LightYellow);
		}

		GenForm.ctnSummaryContainer.grdDiagnosisRow dRow;
		GenForm.ctnSummaryContainer.grdProcedureRow pRow;

		for (int i = 0; i < voCollDiAsociations.size(); i++)
		{
			if(voCollDiAsociations.get(i).getIsActiveIsNotNull() && voCollDiAsociations.get(i).getIsActive().booleanValue())
			{
				for (int p = 0; p < form.ctnSummary().grdDiagnosis().getRows().size(); p++)
				{
					dRow = form.ctnSummary().grdDiagnosis().getRows().get(p);
					if (dRow.getValue().equals(voCollDiAsociations.get(i).getAssocDiagnosis()))
					{
						dRow.setBackColor(Color.OrangeRed);
						dRow.setTooltip(getAssociationTooltip(voCollDiAsociations.get(i).getAssociationDescription(), association, dRow.getcolText(), headerTooltip));	
					}
					else if (dRow.getValue().equals(voCollDiAsociations.get(i).getAssocProblem()))
					{
						dRow.setBackColor(Color.OrangeRed);
						dRow.setTooltip(getAssociationTooltip(voCollDiAsociations.get(i).getAssociationDescription(), association, dRow.getcolText(), headerTooltip));
					}
				}
	
				for (int p = 0; p < form.ctnSummary().grdProcedure().getRows().size(); p++)
				{
					pRow = form.ctnSummary().grdProcedure().getRows().get(p);
					if (pRow.getValue().equals(voCollDiAsociations.get(i).getAssocProcedure()))
					{
						pRow.setBackColor(Color.OrangeRed);
						pRow.setTooltip(getAssociationTooltip(voCollDiAsociations.get(i).getAssociationDescription(), association, pRow.getColText(), headerTooltip));
					}
				}
			}
		}
	}

	private String getAssociationTooltip(CDIAssociationDescription description, String association, String text, String headerTooltip)
	{
		StringBuffer tooltip = new StringBuffer(headerTooltip);
				
		if (description != null)
		{
			tooltip.append(new Textile().process("*" + association + "*" + " " + description.toString() + " " + "*" + text + "*"));
		}
		
		return tooltip.toString();
	}

	protected void onRadioButtonGroupDiagnosisValueChanged() throws PresentationLogicException
	{
		if (allowPatientSummaryCDIdisplay())
		{
			clearPreviousDiagnosisEpisodeOfCare();
			
			if(isAssociationOnSummaryDisplayed())
				listProcedures();
			listCDIDetails();
			enableDiagnosisGridContextMenu();
			enableProcedureContextMenu();//WDEV-14072
		}
	}

	protected void onRadioButtonGroupProcedureValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		if (allowPatientSummaryCDIdisplay())
		{
			clearPreviousProcedureEpisodeOfCare();
			
			if(isAssociationOnSummaryDisplayed())
				listCDIDetails();
			listProcedures();
			enableProcedureContextMenu();
			enableDiagnosisGridContextMenu();//WDEV-14072
		}
	}

	protected void onGrdProcedureSelectionChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		enableProcedureContextMenu();
		unmarkDiagnosisGridAssociations();
		unmarkProcedureGridAssociations();
		setFlagDisplayAssociationsOnSummary(null);
	}

	private void enableProcedureContextMenu()
	{
		boolean isRecordSelected = form.ctnSummary().grdProcedure().getSelectedRowIndex() >= 0;
		boolean isCareContextSel = form.getGlobalContext().Core.getCurrentCareContextIsNotNull();
		
		form.getContextMenus().getPatSummaryProcVIEWItem().setVisible(isCareContextSel && isRecordSelected);
		form.getContextMenus().getPatSummaryProcDISPLAYLINKSUMMARYItem().setVisible(isRecordSelected);
		form.getContextMenus().getPatSummaryProcVIEWLINKSDIALOGItem().setVisible(isRecordSelected);
		form.getContextMenus().getPatSummaryProcNEWPROCEDUREItem().setVisible(isCareContextSel);
	}
	//wdev-13977
	protected boolean checkIfCareSpellCanBeCancelled(CareSpellVo careSpell)
	{
		boolean CareSpellItem = false;
	
		if( careSpell == null )
			return CareSpellItem;
		if(careSpell.getCurrentStatus() == null || ProblemGroupStatus.OPEN.equals(careSpell.getCurrentStatus().getStatus()))//	WDEV-14910
		{
			
			CareSpellItem = true;
			for(int i = 0; careSpell.getEpisodesIsNotNull() && i < careSpell.getEpisodes().size();i++)
			{
				if( checkIfEpisodeOfCaresAreNotOpened(careSpell.getEpisodes().get(i)) == false)
					CareSpellItem = false;
			}
		}
		return CareSpellItem;
		
	}
	//wdev-13977
	protected boolean checkIfEpisodeOfCareCanBeCancelled(EpisodeofCareVo episodeOfCare)
	{
		boolean episode = false;
		if( episodeOfCare == null)
			return episode;
		if(episodeOfCare.getCurrentStatus() == null || EpisodeOfCareStatus.OPEN.equals(episodeOfCare.getCurrentStatus().getStatus()))//	WDEV-14910
		{
			episode = true;
			for(int j = 0;episodeOfCare.getCareContextsIsNotNull() && j < episodeOfCare.getCareContexts().size();j++)
			{
				if( chekIfCareContextsAreNotOpened(episodeOfCare.getCareContexts().get(j)) == false)
					episode = false;
			}
		}
		return episode;
	}
	//wdev-13977
	protected boolean checkIfCareContextCanBeCancelled(CareContextVo careContext)
	{
		if (careContext == null)
			return false;
		
		if (careContext.getCurrentStatus() != null && CareContextStatus.CANCELLED.equals(careContext.getCurrentStatus().getStatus()))
			return false;
		
		if (careContext.getClinicalContacts() != null)
		{
			for (ClinicalContactShortVo clinicalContact : careContext.getClinicalContacts())
			{
				if (clinicalContact.getCurrentStatus() == null || ClinicalContactStatus.OPEN.equals(clinicalContact.getCurrentStatus().getStatus()))
					return false;
			}
		}
		
		return true;
	}

	//wdev-13977
	protected boolean checkIfClinicalContactsAreNotOpened(ClinicalContactShortVo clinicalContact)
	{
		if(clinicalContact == null)
			return false;
		if( clinicalContact.getCurrentStatus() == null || ClinicalContactStatus.OPEN.equals(clinicalContact.getCurrentStatus().getStatus()))//	WDEV-14910
			return false;
		else
			return true;
	}
	//wdev-13977
	protected boolean chekIfCareContextsAreNotOpened(CareContextVo carecontext)
	{
		if( carecontext == null)
			return false;
		if( carecontext.getCurrentStatus() == null || CareContextStatus.OPEN.equals(carecontext.getCurrentStatus().getStatus()))//	WDEV-14910
			return false;
		else
		{
			for(int j = 0;carecontext.getClinicalContactsIsNotNull() && j < carecontext.getClinicalContacts().size();j++)
			{
				if( checkIfClinicalContactsAreNotOpened(carecontext.getClinicalContacts().get(j)) == false)
					return false;
			}
		}
		return true;
	}
	//wdev-13977
	protected boolean checkIfEpisodeOfCaresAreNotOpened(EpisodeofCareVo episode)
	{
		if(episode == null)
			return false;
		if(episode.getCurrentStatus() == null || EpisodeOfCareStatus.OPEN.equals(episode.getCurrentStatus().getStatus()))//	WDEV-14910
			return false;
		else
		{
			for(int i = 0;episode.getCareContextsIsNotNull() && i < episode.getCareContexts().size();i++)
			{
				if( chekIfCareContextsAreNotOpened(episode.getCareContexts().get(i)) == false)
					return false;
			}
		}
		return true;
	}
	protected void onGridListSelectionChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		gridListSelectionChanged();

		updateControlsState();
	}

	private void gridListSelectionChanged()
	{
		form.getGlobalContext().Core.setCurrentClinicalContact(null);
		form.getGlobalContext().Core.setEpisodeofCareShort(null);
		form.getGlobalContext().Core.setCurrentCareContext(null);
		form.getGlobalContext().Core.CurrentCareContext.setContextType(null);
		//WDEV-2416 
		form.getGlobalContext().Core.setClinicalNotesShort(null);
		form.getGlobalContext().Clinical.setCurrentClinicalNote(null);
		
		form.chkPatientView().setValue(false);
		
		form.getContextMenus().hideAllClinicalContactsListMenuItems();
		form.getContextMenus().getClinicalContactsListNewCareGroupingItem().setVisible(true);

		if (form.grdList().getValue() instanceof CareSpellVo)
		{
			CareSpellVo careSpell = (CareSpellVo) form.grdList().getValue();
			boolean isOpened = careSpell.getCurrentStatus() == null || ProblemGroupStatus.OPEN.equals(careSpell.getCurrentStatus().getStatus()); 
			
			form.getContextMenus().getClinicalContactsListNewEpisodeOfCareItem().setVisible(isOpened);
			form.getContextMenus().getClinicalContactsListEditCareGroupingItem().setVisible(isOpened);
			clearAllPreviousEpisodeOfCare();
			form.ctnSummary().setCaption("Care Spell");
			//wdev-13977
			form.getContextMenus().getClinicalContactsListCancelProblemGroupItem().setVisible(checkIfCareSpellCanBeCancelled((CareSpellVo)form.grdList().getValue()));
			//---------
			form.getGlobalContext().Clinical.PatientSummary.setCareSpell((CareSpellVo)form.grdList().getValue());
		}
		else if (form.grdList().getValue() instanceof EpisodeofCareVo)
		{
			EpisodeofCareVo episodeOfCare = (EpisodeofCareVo) form.grdList().getValue();
			boolean isOpened = episodeOfCare.getCurrentStatus() == null || EpisodeOfCareStatus.OPEN.equals(episodeOfCare.getCurrentStatus().getStatus());
			
			form.getContextMenus().getClinicalContactsListAddContactContextDetailsItem().setVisible(!parentEnded() && isOpened);
			form.getContextMenus().getClinicalContactsListNewEpisodeOfCareItem().setVisible(!parentEnded() && !parentCancelled());
			form.getContextMenus().getClinicalContactsListEditEpisodeofCareItem().setVisible(isOpened);

			EpisodeofCareVo voEpisodeofCare = (EpisodeofCareVo) form.grdList().getValue();
			//form.getGlobalContext().Core.setEpisodeofCareShort(voEpisodeofCare);
			form.getGlobalContext().Core.setEpisodeofCareShort(domain.getEpisodeOfCareShort(voEpisodeofCare));	//wdev-13335 - because in impl the episode of care is restaurated from a short vo
			form.ctnSummary().setCaption("Episode Of Care");
			//wdev-13977
			form.getContextMenus().getClinicalContactsListCancelEpisodeOfCareItem().setVisible(checkIfEpisodeOfCareCanBeCancelled((EpisodeofCareVo)form.grdList().getValue()));
			//-----
		}
		else if (form.grdList().getValue() instanceof CareContextVo)
		{
			CareContextVo careContext = (CareContextVo) form.grdList().getValue();
			boolean isOpened = careContext.getCurrentStatus() == null || CareContextStatus.OPEN.equals(careContext.getCurrentStatus().getStatus());
			
			form.getContextMenus().getClinicalContactsListAddContactContextDetailsItem().setVisible(!parentEnded() && !parentCancelled());
			form.getContextMenus().getClinicalContactsListAddContactItem().setVisible(!parentEnded() && isOpened);
			form.getContextMenus().getClinicalContactsListEditContactContextDetailsItem().setVisible(isOpened);
			

			CareContextVo voCareContext = (CareContextVo) form.grdList().getValue();
			form.getGlobalContext().Core.setCurrentCareContext(voCareContext);
			if (voCareContext.getContextIsNotNull())
				form.getGlobalContext().Core.CurrentCareContext.setContextType(new Integer(voCareContext.getContext().getId()));

			form.getGlobalContext().Clinical.PatientSummary.setCareContext(voCareContext);

			if (form.grdList().getSelectedRow().getParentRow() != null)
			{
				if (form.grdList().getSelectedRow().getParentRow().getValue() instanceof EpisodeofCareVo)
				{
					EpisodeofCareVo voEpisodeofCare = (EpisodeofCareVo) form.grdList().getSelectedRow().getParentRow().getValue();
					//form.getGlobalContext().Core.setEpisodeofCareShort(voEpisodeofCare);
					form.getGlobalContext().Core.setEpisodeofCareShort(domain.getEpisodeOfCareShort(voEpisodeofCare)); //wdev-13335
					form.getGlobalContext().Clinical.PatientSummary.setEpisodeOfCare(voEpisodeofCare);
				}
			}
			
			//WDEV-13764
			form.getContextMenus().getClinicalContactsListCancelCareContextItem().setVisible(checkIfCareContextCanBeCancelled((CareContextVo) form.grdList().getValue())); //wdev-13977

			form.ctnSummary().setCaption("Care Context");
		}
		else if (form.grdList().getValue() instanceof ClinicalContactShortVo)
		{
			ClinicalContactShortVo clinicalContact = (ClinicalContactShortVo) form.grdList().getValue();
			boolean isOpened = clinicalContact.getCurrentStatus() == null || ClinicalContactStatus.OPEN.equals(clinicalContact.getCurrentStatus().getStatus());
			
			form.getContextMenus().getClinicalContactsListEditContactItem().setVisible(isOpened);
			form.getContextMenus().getClinicalContactsListAddContactItem().setVisible(!parentEnded() && !parentCancelled());
			form.getContextMenus().getClinicalContactsListViewClinicalNotesItem().setVisible(clinicalContact.getIsClinicalNoteCreatedIsNotNull() &&
					clinicalContact.getIsClinicalNoteCreated().booleanValue() &&
					//WDEV-2511 
					domain.getMosUser() != null);
			
			if (clinicalContact.getIsClinicalNoteCreatedIsNotNull())
				selectClinicalNoteInGlobalContext();
			
			form.getGlobalContext().Core.setCurrentClinicalContact(clinicalContact);
			
			if (form.grdList().getSelectedRow().getParentRow() != null)
			{
				if (form.grdList().getSelectedRow().getParentRow().getValue() instanceof CareContextVo)
				{
					CareContextVo voCareContext = (CareContextVo) form.grdList().getSelectedRow().getParentRow().getValue();
					form.getGlobalContext().Core.setCurrentCareContext(voCareContext);
		
					if (voCareContext.getContextIsNotNull())
						form.getGlobalContext().Core.CurrentCareContext.setContextType(new Integer(voCareContext.getContext().getId()));

					if (form.grdList().getSelectedRow().getParentRow() != null && form.grdList().getSelectedRow().getParentRow().getParentRow() != null)
					{
						if (form.grdList().getSelectedRow().getParentRow().getParentRow().getValue() instanceof EpisodeofCareVo)
						{
							EpisodeofCareVo voEpisodeofCare = (EpisodeofCareVo) form.grdList().getSelectedRow().getParentRow().getParentRow().getValue();
							//form.getGlobalContext().Core.setEpisodeofCareShort(voEpisodeofCare);
							form.getGlobalContext().Core.setEpisodeofCareShort(domain.getEpisodeOfCareShort(voEpisodeofCare)); //wdev-13335
						}
					}

				}
			}
			
			//WDEV-13764
			form.getContextMenus().getClinicalContactsListCancelClinicalContactItem().setVisible(clinicalContact.getCurrentStatus()==null
					|| (ClinicalContactStatus.OPEN.equals(clinicalContact.getCurrentStatus().getStatus())));
			
			form.ctnSummary().setCaption("Clinical Contact");
		}

		setPatientSummaryGlobalContexts(form.grdList().getValue());
		
		resetPIDBarText(); //WDEV-17162

		if (allowPatientSummaryCDIdisplay())
		{
			listCDIDetails();
			listProcedures();
		}
		updateContextMenuState();
		enableDiagnosisGridContextMenu();
		enableProcedureContextMenu();

		// WDEV - 11661
		updateControlsState();
	}
	
	private void resetPIDBarText()
	{
		if (form.getGlobalContext().Core.getPatientShort() == null)
			return;

		new ResetPIDBarHelper(engine, form.getGlobalContext().Core.getPatientShort() , domain.getPIDDiagnosisInfo(form.getGlobalContext().Core.getCurrentCareContext(), form.getGlobalContext().Core.getEpisodeofCareShort(), form.getGlobalContext().Clinical.PatientSummary.getCareSpell()));
	}

	private void updateControlsState()
	{
		form.btnNewICP().setVisible(Boolean.TRUE.equals(ConfigFlag.UI.ALLOW_PATIENT_ICP_CREATION_FROM_PATIENT_SUMMARY.getValue())
				&& form.getGlobalContext().Core.getCurrentCareContextIsNotNull());
				// TODO - Add one more condition to check if the selected CareContext has an ICP instantiated
		
		updateContextMenuState();
	}

	private void updateContextMenuState()
	{
		form.getContextMenus().getClinicalContactsListViewCancelledContextsItem().setVisible(!ConfigFlag.UI.PATIENT_SUMMARY_SHOW_CANCELLED_CONTEXTS_BY_DEFAULT.getValue());  //wdev-13977 -> modified in WDEV-14909
		form.getContextMenus().getClinicalContactsListHideCancelledContextsItem().setVisible(ConfigFlag.UI.PATIENT_SUMMARY_SHOW_CANCELLED_CONTEXTS_BY_DEFAULT.getValue());	// WDEV-14909
		
		boolean isProblemGroupSelected = form.grdList().getSelectedRow() != null && form.grdList().getSelectedRow().getValue() instanceof CareSpellVo;
		boolean isProblemGroupCancelled = isProblemGroupSelected
											&& ((CareSpellVo) form.grdList().getSelectedRow().getValue()).getCurrentStatus() != null
											&& ProblemGroupStatus.CANCELLED.equals(((CareSpellVo) form.grdList().getSelectedRow().getValue()).getCurrentStatus().getStatus());

		form.getContextMenus().getClinicalContactsListUndoCancelProblemGroupItem().setVisible(isProblemGroupSelected && isProblemGroupCancelled);
		
		boolean isEpisodeOfCareSelected = form.grdList().getSelectedRow() != null && form.grdList().getSelectedRow().getValue() instanceof EpisodeofCareVo;
		boolean isEpisodeOfCareCancelled = isEpisodeOfCareSelected
											&& ((EpisodeofCareVo) form.grdList().getSelectedRow().getValue()).getCurrentStatus() != null
											&& EpisodeOfCareStatus.CANCELLED.equals(((EpisodeofCareVo) form.grdList().getSelectedRow().getValue()).getCurrentStatus().getStatus());
		
		form.getContextMenus().getClinicalContactsListUndoCancelEpisodeOfCareItem().setVisible(isEpisodeOfCareSelected && isEpisodeOfCareCancelled && !parentCancelled());
		
		boolean isCareContextSelected = form.grdList().getSelectedRow() != null && form.grdList().getSelectedRow().getValue() instanceof CareContextVo;
		boolean isCareContextCancelled = isCareContextSelected
											&& ((CareContextVo) form.grdList().getSelectedRow().getValue()).getCurrentStatus() != null
											&& CareContextStatus.CANCELLED.equals(((CareContextVo) form.grdList().getSelectedRow().getValue()).getCurrentStatus().getStatus());
		
		form.getContextMenus().getClinicalContactsListUndoCancelCareContextItem().setVisible(isCareContextSelected && isCareContextCancelled && !parentCancelled());
		
		boolean isClinicalContactSelected = form.grdList().getSelectedRow() != null && form.grdList().getSelectedRow().getValue() instanceof ClinicalContactShortVo;
		boolean isClinicalContactCancelled = isClinicalContactSelected
												&& ((ClinicalContactShortVo) form.grdList().getSelectedRow().getValue()).getCurrentStatus() != null
												&& ClinicalContactStatus.CANCELLED.equals(((ClinicalContactShortVo) form.grdList().getSelectedRow().getValue()).getCurrentStatus().getStatus());
		
		form.getContextMenus().getClinicalContactsListUndoCancelClinicalContactItem().setVisible(isClinicalContactSelected && isClinicalContactCancelled && !parentCancelled());
	}

	

	private boolean parentCancelled()
	{
		ValueObject selectedValue = form.grdList().getValue();
		
		if (selectedValue instanceof EpisodeofCareVo)
		{
			CareSpellVo careSpell = (CareSpellVo) form.grdList().getSelectedRow().getParentRow().getValue();
			
			if (careSpell.getCurrentStatus() != null && ProblemGroupStatus.CANCELLED.equals(careSpell.getCurrentStatus().getStatus()))
				return true;
		}
		
		if (selectedValue instanceof CareContextVo)
		{
			EpisodeofCareVo episodeOfCare = (EpisodeofCareVo) form.grdList().getSelectedRow().getParentRow().getValue();
			
			if (episodeOfCare.getCurrentStatus() != null && EpisodeOfCareStatus.CANCELLED.equals(episodeOfCare.getCurrentStatus().getStatus()))
				return true;
		}
		
		if (selectedValue instanceof ClinicalContactShortVo)
		{
			CareContextVo careContext = (CareContextVo) form.grdList().getSelectedRow().getParentRow().getValue();
			
			if (careContext.getCurrentStatus() != null && CareContextStatus.CANCELLED.equals(careContext.getCurrentStatus().getStatus()))
				return true;
		}

		return false;
	}

	
	//only check this according to a config flag and override anyway if the approle right 
	//is set to allow 'admin' users to enter data regardless  (WDEV-3578)
	private boolean parentEnded()
	{
		//we dont care about any rules if the user is a clinical administrator 
		if(engine.hasRight(AppRight.CAN_ADD_CONTACT_AFTER_ENDDATE_SUPPLIED))
			return false;
		
		if(ConfigFlag.UI.STOP_CLINICAL_DATACREATION_IFENDDATE_SUPPLIED.getValue())
		{
			//check if the selected item is ended
			if(form.grdList().getValue() != null)
			{
				if (form.grdList().getValue() instanceof EpisodeofCareVo)
				{
					if(((EpisodeofCareVo)form.grdList().getValue()).getEndDateIsNotNull())
						return true;
				}

				else if (form.grdList().getValue() instanceof CareContextVo)
				{
					if(((CareContextVo)form.grdList().getValue()).getEndDateTimeIsNotNull() || ((EpisodeofCareVo)form.grdList().getSelectedRow().getParentRow().getValue()).getEndDateIsNotNull())
						return true;
				}
				else if (form.grdList().getValue() instanceof ClinicalContactShortVo)
				{
					if(((CareContextVo)form.grdList().getSelectedRow().getParentRow().getValue()).getEndDateTimeIsNotNull() || ((EpisodeofCareVo)form.grdList().getSelectedRow().getParentRow().getParentRow().getValue()).getEndDateIsNotNull())
						return true;
				}
			}		
		}
		
		return false;
	}

	private void setPatientSummaryGlobalContexts(Object value)
	{
		form.getGlobalContext().Clinical.PatientSummary.setCareSpell(null);
		form.getGlobalContext().Clinical.PatientSummary.setEpisodeOfCare(null);
		form.getGlobalContext().Clinical.PatientSummary.setCareContext(null);
		form.getGlobalContext().Clinical.PatientSummary.setClinicalContact(null);

		// Care Spell
		if (value instanceof CareSpellVo)
		{
			//form.getGlobalContext().Clinical.PatientSummary.setCareSpell((CareSpellVo) value);
			form.getGlobalContext().Clinical.PatientSummary.setCareSpell(domain.getCareSpellById((CareSpellVo) value)); //wdev-13335
		}
		// Episode of Care
		if (value instanceof EpisodeofCareVo)
		{
			form.getGlobalContext().Clinical.PatientSummary.setEpisodeOfCare((EpisodeofCareVo) value);

			if (form.grdList().getSelectedRow().getParentRow() != null)
			{
				//form.getGlobalContext().Clinical.PatientSummary.setCareSpell((CareSpellVo) form.grdList().getSelectedRow().getParentRow().getValue());
				form.getGlobalContext().Clinical.PatientSummary.setCareSpell(domain.getCareSpellById((CareSpellVo) form.grdList().getSelectedRow().getParentRow().getValue())); //wdev-13335
			}
		}
		// Care Context
		if (value instanceof CareContextVo)
		{
			form.getGlobalContext().Clinical.PatientSummary.setCareContext((CareContextVo) value);
			if (form.grdList().getSelectedRow().getParentRow() != null)
			{
				form.getGlobalContext().Clinical.PatientSummary.setEpisodeOfCare((EpisodeofCareVo) form.grdList().getSelectedRow().getParentRow().getValue());

				if (form.grdList().getSelectedRow().getParentRow().getParentRow() != null)
				{
					//form.getGlobalContext().Clinical.PatientSummary.setCareSpell((CareSpellVo) form.grdList().getSelectedRow().getParentRow().getParentRow().getValue());
					form.getGlobalContext().Clinical.PatientSummary.setCareSpell(domain.getCareSpellById((CareSpellVo) form.grdList().getSelectedRow().getParentRow().getParentRow().getValue())); //wdev-13335
				}
			}
		}
		// Clinical Contact
		if (value instanceof ClinicalContactShortVo)
		{
			form.getGlobalContext().Clinical.PatientSummary.setClinicalContact((ClinicalContactShortVo) value);
			if (form.grdList().getSelectedRow().getParentRow() != null)
			{
				form.getGlobalContext().Clinical.PatientSummary.setCareContext((CareContextVo) form.grdList().getSelectedRow().getParentRow().getValue());
				if (form.grdList().getSelectedRow().getParentRow().getParentRow() != null)
				{
					form.getGlobalContext().Clinical.PatientSummary.setEpisodeOfCare((EpisodeofCareVo) form.grdList().getSelectedRow().getParentRow().getParentRow().getValue());

					if (form.grdList().getSelectedRow().getParentRow().getParentRow().getParentRow() != null)
					{
						//form.getGlobalContext().Clinical.PatientSummary.setCareSpell((CareSpellVo) form.grdList().getSelectedRow().getParentRow().getParentRow().getParentRow().getValue());
						form.getGlobalContext().Clinical.PatientSummary.setCareSpell(domain.getCareSpellById((CareSpellVo) form.grdList().getSelectedRow().getParentRow().getParentRow().getParentRow().getValue())); //wdev-13335
					}
				}
			}
		}
	}

	private void listCDIDetails()
	{
		listCDIDetails(false);	
	}
	
	private void listCDIDetails(boolean refresh)
	{
		setFlagDisplayAssociationsOnSummary(null);
		
		ClinicalContactShortVo voClinicalContact = null;
		CareContextVo 	   	   voCareContext 	 = null;
		EpisodeofCareShortVo   voEpisodeOfCare	 = null;
		CareSpellVo 		   voCareSpell 		 = null;
		
		Object value = form.grdList().getValue();

		// WDEV-2166
		if (value instanceof CareSpellVo)
			voCareSpell = (CareSpellVo) value;
		else
		{
			if (value instanceof EpisodeofCareVo)
				voEpisodeOfCare = (EpisodeofCareVo) value;
			else if (value instanceof CareContextVo || value instanceof ClinicalContactShortVo)
				voEpisodeOfCare = form.getGlobalContext().Core.getEpisodeofCareShort();

			if(refresh == false && isSameEpisodeOfCareAsPreviousForDiagnosisRecords(voEpisodeOfCare))
				return;
		}

		PatientDiagnosisShortVoCollection voCollDiagnosis = null;
		PatientProblemVoCollection voCollProblem = null;

		if (form.ctnSummary().GroupDiagnosis().getValue().equals(GenForm.ctnSummaryContainer.GroupDiagnosisEnumeration.rdoAllDiag))
		{
			if (voClinicalContact != null)
			{
				voCollDiagnosis = domain.listDiagnosisComplicationsContact(voClinicalContact);
				voCollProblem = domain.listProblemsByClinicalContact(voClinicalContact);
			}
			else if (voCareContext != null)
			{
				voCollDiagnosis = domain.listDiagnosisComplicationsCareContext(voCareContext);
				voCollProblem = domain.listProblemsByCareContext(voCareContext);
			}
			else if (voEpisodeOfCare != null)
			{
				voCollDiagnosis = domain.listDiagnosisComplicationEpisodeOfCare(voEpisodeOfCare);
				voCollProblem = domain.listProblemsByEpisodeOfCare(voEpisodeOfCare);
			}
			else if (voCareSpell != null)
			{
				voCollDiagnosis = domain.listDiagnosisComplicationCareSpell(voCareSpell);
				voCollProblem = domain.listProblemsByCareSpell(voCareSpell);
			}
			else
			{
				voCollDiagnosis = domain.listDiagnosisComplicationsPatient(form.getGlobalContext().Core.getPatientShort());
				voCollProblem = domain.listProblemsByPatient(form.getGlobalContext().Core.getPatientShort());
			}
		}
		else if (form.ctnSummary().GroupDiagnosis().getValue().equals(GenForm.ctnSummaryContainer.GroupDiagnosisEnumeration.rdoComplications) || form.ctnSummary().GroupDiagnosis().getValue().equals(GenForm.ctnSummaryContainer.GroupDiagnosisEnumeration.rdoDiagnosis))
		{
			if (voClinicalContact != null)
			{
				if (form.ctnSummary().GroupDiagnosis().getValue().equals(GenForm.ctnSummaryContainer.GroupDiagnosisEnumeration.rdoComplications))
					voCollDiagnosis = domain.listContactComplications(voClinicalContact);
				else
					voCollDiagnosis = domain.listContactDiagnoses(voClinicalContact);
			}
			else if (voCareContext != null)
			{
				if (form.ctnSummary().GroupDiagnosis().getValue().equals(GenForm.ctnSummaryContainer.GroupDiagnosisEnumeration.rdoComplications))
					voCollDiagnosis = domain.listCareContextComplications(voCareContext);
				else
					voCollDiagnosis = domain.listCareContextDiagnoses(voCareContext);
			}
			else if (voEpisodeOfCare != null)
			{
				if (form.ctnSummary().GroupDiagnosis().getValue().equals(GenForm.ctnSummaryContainer.GroupDiagnosisEnumeration.rdoComplications))
					voCollDiagnosis = domain.listEpisodeOfCareComplications(voEpisodeOfCare);
				else
					voCollDiagnosis = domain.listEpisodeOfCareDiagnoses(voEpisodeOfCare);
			}
			else
			{
				if (form.ctnSummary().GroupDiagnosis().getValue().equals(GenForm.ctnSummaryContainer.GroupDiagnosisEnumeration.rdoComplications))
					voCollDiagnosis = domain.listPatientComplications(form.getGlobalContext().Core.getPatientShort());
				else
					voCollDiagnosis = domain.listPatientDiagnoses(form.getGlobalContext().Core.getPatientShort());
			}
		}
		else if (form.ctnSummary().GroupDiagnosis().getValue().equals(GenForm.ctnSummaryContainer.GroupDiagnosisEnumeration.rdoProblems))
		{
			if (voClinicalContact != null)
			{
				voCollProblem = domain.listProblemsByClinicalContact(voClinicalContact);
			}
			else if (voCareContext != null)
			{
				voCollProblem = domain.listProblemsByCareContext(voCareContext);
			}
			else if (voEpisodeOfCare != null)
			{
				voCollProblem = domain.listProblemsByEpisodeOfCare(voEpisodeOfCare);
			}
			else if (voCareSpell != null)
			{
				voCollProblem = domain.listProblemsByCareSpell(voCareSpell);
			}
			else
			{
				voCollProblem = domain.listProblemsByPatient(form.getGlobalContext().Core.getPatientShort());
			}
		}

		populateDiagnosisAndProblems(voCollDiagnosis, voCollProblem);
	}

	private void populateDiagnosisAndProblems(PatientDiagnosisShortVoCollection voCollDiagnosis, PatientProblemVoCollection voCollProblem)
	{
		form.ctnSummary().grdDiagnosis().getRows().clear();
		if (voCollDiagnosis != null)
		{
			GenForm.ctnSummaryContainer.grdDiagnosisRow dRow = null;
			for (int i = 0; i < voCollDiagnosis.size(); i++)
			{
				dRow = form.ctnSummary().grdDiagnosis().getRows().newRow();
				PatientDiagnosisShortVo VoPatientDiagnosisShort = voCollDiagnosis.get(i);
				if(VoPatientDiagnosisShort.getIsComplicationIsNotNull() && VoPatientDiagnosisShort.getIsComplication().booleanValue())
					dRow.setcolImage(getComplicationLateralityImg(VoPatientDiagnosisShort.getDiagLaterality()));
				else
					dRow.setcolImage(getDiagnosisLateralityImg(VoPatientDiagnosisShort.getDiagLaterality()));
				dRow.setcolText(getDiagnosisText(VoPatientDiagnosisShort));
				dRow.setTooltipForcolText(VoPatientDiagnosisShort.createTooltipForPatientSummary());
				dRow.setcolOnset(VoPatientDiagnosisShort.getDateOnsetIsNotNull() ? VoPatientDiagnosisShort.getDateOnset().toString() : null);
				dRow.setcolResolved(VoPatientDiagnosisShort.getDateResolvedIsNotNull() ? VoPatientDiagnosisShort.getDateResolved().toString() : null);
				dRow.setColSource(VoPatientDiagnosisShort.getSourceofInformationIsNotNull() ? VoPatientDiagnosisShort.getSourceofInformation().getText() : null);
				if (VoPatientDiagnosisShort.getSysInfoIsNotNull() && VoPatientDiagnosisShort.getSysInfo().getLastupdateUser() != null)
					dRow.setcolHasAudit(form.getImages().Core.EditDisabled);
				dRow.setTooltip(VoPatientDiagnosisShort.getTooltipForDiAssociation());
				dRow.setValue(VoPatientDiagnosisShort);
			}
		}
		if (voCollProblem != null)
		{
			GenForm.ctnSummaryContainer.grdDiagnosisRow dRow = null;
			{
				for (int i = 0; i < voCollProblem.size(); i++)
				{
					dRow = form.ctnSummary().grdDiagnosis().getRows().newRow();
					dRow.setcolImage(form.getImages().COE.BlueViolet);
					dRow.setcolText(voCollProblem.get(i).getPatientProblem());
					dRow.setcolOnset(voCollProblem.get(i).getOnsetIsNotNull() ? voCollProblem.get(i).getOnset().toString() : null);
					dRow.setcolResolved(voCollProblem.get(i).getDateResolvedIsNotNull() ? voCollProblem.get(i).getDateResolved().toString() : null);
					dRow.setColSource(voCollProblem.get(i).getSourceIsNotNull() ? voCollProblem.get(i).getSource().getText() : null);
					dRow.setTooltipForcolText(voCollProblem.get(i).createTooltipForPatientSummary());
					if (voCollProblem.get(i).getSysInfoIsNotNull() && voCollProblem.get(i).getSysInfo().getLastupdateUser() != null)
						dRow.setcolHasAudit(form.getImages().Core.EditDisabled);
					dRow.setTooltip(voCollProblem.get(i).getDiAssociationTooltip());
					dRow.setValue(voCollProblem.get(i));
				}
			}
		}
	}

	private String getDiagnosisText(PatientDiagnosisShortVo VoPatientDiagnosisShort)
	{
		if(VoPatientDiagnosisShort != null)
			return VoPatientDiagnosisShort.getDiagnosisDescription() + (VoPatientDiagnosisShort.getSiteTextIsNotNull()?" (" + VoPatientDiagnosisShort.getSiteText() + ")":"");
		
		return "";
	}
	
	private void listProcedures()
	{
		listProcedures(false);
	}
	private void listProcedures(boolean refresh)
	{
		setFlagDisplayAssociationsOnSummary(null);
		
		ClinicalContactShortVo voClinicalContact = null;
		CareContextVo	   	   voCareContext 	 = null;
		EpisodeofCareShortVo   voEpisodeOfCare	 = null;
		CareSpellVo 		   voCareSpell 		 = null;

		Object value = form.grdList().getValue();
		
		// WDEV-2166
		if (value instanceof CareSpellVo)
			voCareSpell = (CareSpellVo) value;
		else 
		{
			if (value instanceof EpisodeofCareVo)
				voEpisodeOfCare = (EpisodeofCareVo) value;
			else if (value instanceof CareContextVo || value instanceof ClinicalContactShortVo)
				voEpisodeOfCare = form.getGlobalContext().Core.getEpisodeofCareShort();
			
			if(refresh == false && isSameEpisodeOfCareAsPreviousForProcedureRecord(voEpisodeOfCare))
				return;
		}

		PatientProcedureShortVoCollection voCollProcedure = null;
		GroupProcedureEnumeration procedureGroupValue = form.ctnSummary().GroupProcedure().getValue();

		if (procedureGroupValue.equals(GenForm.ctnSummaryContainer.GroupProcedureEnumeration.rdoAllProc) || procedureGroupValue.equals(GenForm.ctnSummaryContainer.GroupProcedureEnumeration.rdoPerformedProcedure) || procedureGroupValue.equals(GenForm.ctnSummaryContainer.GroupProcedureEnumeration.rdoPlannedProcedure))
		{
			PatientProcedureStatus status = getProcedureStatus();
			if (voClinicalContact != null)
			{
				voCollProcedure = domain.listProcedureByClinicalContactAndStatus(voClinicalContact, status);
			}
			else if (voCareContext != null)
			{
				voCollProcedure = domain.listProceduresByCareContextPatientSummaryAndStatus(voCareContext, status);
			}
			else if (voEpisodeOfCare != null)
			{
				voCollProcedure = domain.listProceduresByEpisodeOfCareAndStatus(voEpisodeOfCare, status);
			}
			else if (voCareSpell != null)
			{
				voCollProcedure = domain.listProceduresByCareSpellAndStatus(voCareSpell, status);
			}
			else
			{
				voCollProcedure = domain.listProcedureByPatientAndStatus(form.getGlobalContext().Core.getPatientShort(), status);
			}
		}
		populateProcedures(voCollProcedure);
	}

	private void populateProcedures(PatientProcedureShortVoCollection voCollProcedure)
	{
		form.ctnSummary().grdProcedure().getRows().clear();
		if (voCollProcedure != null)
		{
			for (int i = 0; i < voCollProcedure.size(); i++)
			{
				PatientProcedureShortVo voPatientProcedureShort = voCollProcedure.get(i);
				if(voPatientProcedureShort.getProcedureStatusIsNotNull())
				{
					if((voPatientProcedureShort.getProcedureStatus().equals(PatientProcedureStatus.PLANNED)  &&  (voPatientProcedureShort.getProcedureOutcome() == null || voPatientProcedureShort.getProcedureOutcome().equals(PatientProcedureOutcome.CANCELLED)) || (voPatientProcedureShort.getProcedureStatus().equals(PatientProcedureStatus.PERFORMED))))
					{
						GenForm.ctnSummaryContainer.grdProcedureRow pRow = form.ctnSummary().grdProcedure().getRows().newRow();
						pRow.setColImage(getProcedureLateralityImg(voPatientProcedureShort.getProcLaterality(), voPatientProcedureShort.getProcedureStatus()));
						pRow.setColText(getProcedureText(voPatientProcedureShort));
						pRow.setTooltipForColText(voPatientProcedureShort.createTooltipForPatientSummary());
						pRow.setColDatePerformed(getDate(voPatientProcedureShort));
						if (voPatientProcedureShort.getSysInfoIsNotNull() && voPatientProcedureShort.getSysInfo().getLastupdateUser() != null)
							pRow.setcolHasAudit(form.getImages().Core.EditDisabled);
						pRow.setTooltip(voPatientProcedureShort.getDiAssociationsTooltip());
						pRow.setColStatus(getStatus(voPatientProcedureShort));
						pRow.setValue(voPatientProcedureShort);
					}
				}
			}
		}
	}

	private String getProcedureText(PatientProcedureShortVo voPatientProcedureShort)
	{
		if(voPatientProcedureShort != null)
			return voPatientProcedureShort.getProcedureDescription() + (voPatientProcedureShort.getSiteTextIsNotNull()?" (" + voPatientProcedureShort.getSiteText() + ")":"");
		
		return "";
	}
	
	protected void onContextMenuItemClick(int menuItemID, ims.framework.Control sender) throws ims.framework.exceptions.PresentationLogicException
	{
		if (sender == null)
			throw new CodingRuntimeException("sender is null : onContextMenuItemClick");

		if (sender.equals(form.grdList()))
		{
			switch (menuItemID)
			{
				case GenForm.ContextMenus.ClinicalContactsList.NewEpisodeOfCare :
					newEpisodeofCare();
				break;
				case GenForm.ContextMenus.ClinicalContactsList.NewCareGrouping :
					newCareGrouping();
				break;
				case GenForm.ContextMenus.ClinicalContactsList.AddContactContextDetails :
					addContactContextDetails();
				break;
				case GenForm.ContextMenus.ClinicalContactsList.AddContact :
					addContact();
				break;
				case GenForm.ContextMenus.ClinicalContactsList.EditContact :
					editContact();
				break;
				case GenForm.ContextMenus.ClinicalContactsList.EditCareGrouping :
					editCareGroup();
				break;
				case GenForm.ContextMenus.ClinicalContactsList.EditContactContextDetails :
					editContactContextDetails();
				break;
				//WDEV-13764
				case GenForm.ContextMenus.ClinicalContactsList.CancelCareContext :
					cancelCareContext();
				break;
				
				case GenForm.ContextMenus.ClinicalContactsList.UndoCancelCareContext:
					undoCancelCareContext();
					break;
					
				//WDEV-13764
				case GenForm.ContextMenus.ClinicalContactsList.CancelClinicalContact :
					cancelClinicalContact();
				break;
				
				case GenForm.ContextMenus.ClinicalContactsList.UndoCancelClinicalContact:
					undoCancelClinicalContact();
					break;
					
				case GenForm.ContextMenus.ClinicalContactsList.EditEpisodeofCare :
					editEpisodeofCare();
				break;
				case GenForm.ContextMenus.ClinicalContactsList.ViewClinicalNotes:
					viewClinicalNotes();
				break;
				
				//wdev-13977
				case GenForm.ContextMenus.ClinicalContactsList.CancelProblemGroup:
					cancelCareSpell();
				break;
				
				case GenForm.ContextMenus.ClinicalContactsList.UndoCancelProblemGroup:
					undoCancelProblemGroup();
					break;
					
				//wdev-13977				
				case GenForm.ContextMenus.ClinicalContactsList.CancelEpisodeOfCare:
					cancelEpisodeOfCare();
				break;
				
				case GenForm.ContextMenus.ClinicalContactsList.UndoCancelEpisodeOfCare:
					undoCancelEpisodeOfCare();
					break;
					
				//wdev-13977
				case GenForm.ContextMenus.ClinicalContactsList.ViewCancelledContexts:
					form.getLocalContext().setShowCancelledContexts(Boolean.TRUE);
					open();
					reselectGrid();
					form.getLocalContext().setShowCancelledContexts(Boolean.FALSE);
				break;
				
				case GenForm.ContextMenus.ClinicalContactsList.HideCancelledContexts:
					form.getLocalContext().setShowCancelledContexts(Boolean.FALSE);
					open();
					reselectGrid();
					form.getLocalContext().setShowCancelledContexts(Boolean.TRUE);
					break;
					
				default :
			}
		}
		else if (sender.equals(form.ctnSummary().grdDiagnosis()))
		{
			switch (menuItemID)
			{
				case GenForm.ContextMenus.PatSummaryDiagComp.VIEW :
					viewDiagCompItem();
				break;
				case GenForm.ContextMenus.PatSummaryDiagComp.VIEWLINKSDIALOG :
					viewDiagCompAssociationsOnDialog();
				break;
				case GenForm.ContextMenus.PatSummaryDiagComp.DISPLAYLINKSSUMMARY :
					displayDiagCompAssociationsOnSummary();
				break;

				case GenForm.ContextMenus.PatSummaryDiagComp.NEWDIAGNOSIS:
					newDiagnosis();
				break;
				case GenForm.ContextMenus.PatSummaryDiagComp.NEWPROBLEM:
					newProblem();
				break;
				default :
			}
		}
		else if (sender.equals(form.ctnSummary().grdProcedure()))
		{
			switch (menuItemID)
			{
				case GenForm.ContextMenus.PatSummaryProc.VIEW :
					viewProcItem();
				break;
				case GenForm.ContextMenus.PatSummaryProc.VIEWLINKSDIALOG :
					viewProcAssociationsOnDialog();
				break;
				case GenForm.ContextMenus.PatSummaryProc.DISPLAYLINKSUMMARY :
					displayProcAssociationsOnSummary();
				break;

				case GenForm.ContextMenus.PatSummaryProc.NEWPROCEDURE:
					newProcedure();
				break;
				default :
			}
		}
	}

	private void undoCancelProblemGroup()
	{
		try
		{
			ValueObject selectedValue = form.grdList().getValue();

			if (!(selectedValue instanceof CareSpellVo))
				return;

			CareSpellVo careSpell = domain.getCareSpellById((CareSpellRefVo) selectedValue);

			if (careSpell != null && careSpell.getVersion_CareSpell() != ((CareSpellVo) selectedValue).getVersion_CareSpell())
			{
				engine.showMessage(ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
				open();
				return;
			}

			CareSpellStatusHistoryVo status = new CareSpellStatusHistoryVo();
			status.setStatus(ProblemGroupStatus.OPEN);
			status.setStatusDateTime(new DateTime());

			careSpell.setCurrentStatus(status);

			if (careSpell.getStatusHistory() == null) careSpell.setStatusHistory(new CareSpellStatusHistoryVoCollection());
			careSpell.getStatusHistory().add(status);

			careSpell.setEndDate(null);

			String[] errors = careSpell.validate();
			if (errors != null && errors.length > 0)
			{
				engine.showErrors(errors);
				return;
			}

			domain.saveCareSpell(careSpell);
		}
		catch (StaleObjectException e)
		{
			engine.showMessage(ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
		}
		catch (UniqueKeyViolationException e)
		{
			e.printStackTrace();
		}
		
		open();
		reselectGrid(); //WDEV-17162
	}

	//wdev-13977
	protected void cancelCareSpell()
	{
		if (form.grdList().getValue() instanceof CareSpellVo)
		{
			CareSpellVo tempVo = (CareSpellVo)form.grdList().getValue();
			tempVo = domain.getCareSpellById(tempVo);
			
			if (Boolean.TRUE.equals(domain.hasActiveEpisodeOfCare(tempVo)))
			{
				engine.showMessage(ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
				open();
				return;  
			}
			
			if(tempVo != null && tempVo.getVersion_CareSpell() != ((CareSpellVo)form.grdList().getValue()).getVersion_CareSpell())
			{
				engine.showMessage(ims.configuration.gen.ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
				open();
				return;
			}
			
			CareSpellStatusHistoryVo careSpellStatusHist =  new CareSpellStatusHistoryVo(); //WDEV-15259
			
			careSpellStatusHist.setStatus(ProblemGroupStatus.CANCELLED);
			careSpellStatusHist.setStatusDateTime(new DateTime());
			
			CareSpellStatusHistoryVoCollection careSpellStatusHistColl = tempVo.getStatusHistory();
			if(careSpellStatusHistColl == null)
				careSpellStatusHistColl = new CareSpellStatusHistoryVoCollection();
			
			careSpellStatusHistColl.add(careSpellStatusHist);
			tempVo.setCurrentStatus(careSpellStatusHist);
			tempVo.setStatusHistory(careSpellStatusHistColl);
			tempVo.setEndDate(new Date());
			String[] arrErrors = tempVo.validate();
			if(arrErrors != null)
			{
				engine.showErrors(arrErrors);
				return;
			}
			try 
			{
				domain.saveCareSpell(tempVo);
			} 
			catch (StaleObjectException e) 
			{
				engine.showMessage(ims.configuration.gen.ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
			} 
			catch (UniqueKeyViolationException e) 
			{
				e.printStackTrace();
			}
			
			open();
			reselectGrid();
		}
	}

	
	private void undoCancelEpisodeOfCare()
	{
		try
		{
			ValueObject selectedValue = form.grdList().getValue();

			if (!(selectedValue instanceof EpisodeofCareVo))
				return;

			EpisodeofCareVo episodeOfCare = domain.getEpisodeOfCare((EpisodeOfCareRefVo) selectedValue);

			if (episodeOfCare != null && episodeOfCare.getVersion_EpisodeOfCare() != ((EpisodeOfCareRefVo) selectedValue).getVersion_EpisodeOfCare())
			{
				engine.showMessage(ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
				open();
				return;
			}

			EpisodeOfCareStatusHistoryVo status = new EpisodeOfCareStatusHistoryVo();
			status.setStatus(EpisodeOfCareStatus.OPEN);
			status.setStatusDateTime(new DateTime());

			episodeOfCare.setCurrentStatus(status);

			if (episodeOfCare.getStatusHistory() == null) episodeOfCare.setStatusHistory(new EpisodeOfCareStatusHistoryVoCollection());
			episodeOfCare.getStatusHistory().add(status);

			episodeOfCare.setEndDate(null);

			String[] errors = episodeOfCare.validate();
			if (errors != null && errors.length > 0)
			{
				engine.showErrors(errors);
				return;
			}

			domain.saveEpisodeOfCare(episodeOfCare);
		}
		catch (StaleObjectException e)
		{
			engine.showMessage(ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
		}
		catch (UniqueKeyViolationException e)
		{
			e.printStackTrace();
		}

		open();
		reselectGrid();
	}


	// wdev-13977
	protected void cancelEpisodeOfCare()
	{
		if (form.grdList().getValue() instanceof EpisodeofCareVo)
		{
			EpisodeofCareVo trempEpOfCare = (EpisodeofCareVo)form.grdList().getValue();
			
			if (Boolean.TRUE.equals(domain.hasActiveCareContexts(trempEpOfCare)))
			{
				engine.showMessage(ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
				open();
				return;
			}
			
			trempEpOfCare = domain.getEpisodeOfCare(trempEpOfCare);
			if(trempEpOfCare != null && trempEpOfCare.getVersion_EpisodeOfCare() != ((EpisodeofCareVo)form.grdList().getValue()).getVersion_EpisodeOfCare())
			{
				engine.showMessage(ims.configuration.gen.ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
				open();
				return;
			}
			
			EpisodeOfCareStatusHistoryVo episodeOfCareHistory = new EpisodeOfCareStatusHistoryVo(); //WDEV-15259
			
			episodeOfCareHistory.setStatus(EpisodeOfCareStatus.CANCELLED);
			episodeOfCareHistory.setStatusDateTime(new DateTime());
			
			EpisodeOfCareStatusHistoryVoCollection episodeOfCareHistoryCollection = trempEpOfCare.getStatusHistory();
			
			if( episodeOfCareHistoryCollection == null)
				episodeOfCareHistoryCollection = new EpisodeOfCareStatusHistoryVoCollection();
			
			episodeOfCareHistoryCollection.add(episodeOfCareHistory);
			trempEpOfCare.setCurrentStatus(episodeOfCareHistory);
			trempEpOfCare.setStatusHistory(episodeOfCareHistoryCollection);
			trempEpOfCare.setEndDate(new Date());
			String[] arrErrors = trempEpOfCare.validate();
			if(arrErrors != null)
			{
				engine.showErrors(arrErrors);
				return;
			}
			try 
			{
				domain.saveEpisodeOfCare(trempEpOfCare);
			}
			catch (StaleObjectException e) 
			{
				engine.showMessage(ims.configuration.gen.ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
			} 
			catch (UniqueKeyViolationException e) 
			{
				e.printStackTrace();
			}
			
			open();
			reselectGrid();
		}
	}
	//WDEV-13764
	private void cancelCareContext()
	{
		if (form.grdList().getValue() instanceof CareContextVo)
		{
			CareContextVo voCareContext = (CareContextVo) form.grdList().getValue();
			
			if (Boolean.TRUE.equals(domain.hasActiveClinicalContacts(voCareContext)))
			{
				engine.showMessage(ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
				open();
				return;
			}

			voCareContext = domain.getCareContextById(voCareContext); // wdev-13977

			if (voCareContext != null && voCareContext.getVersion_CareContext() != ((CareContextVo) form.grdList().getValue()).getVersion_CareContext())
			{
				engine.showMessage(ims.configuration.gen.ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
				open();
				return;
			}

			CareContextStatusHistoryVo careContextStatusHist = new CareContextStatusHistoryVo(); // WDEV-15259

			careContextStatusHist.setStatus(CareContextStatus.CANCELLED);
			careContextStatusHist.setStatusDateTime(new DateTime());

			CareContextStatusHistoryVoCollection careContextStatusHistColl = voCareContext.getStatusHistory();
			if (careContextStatusHistColl == null)
				careContextStatusHistColl = new CareContextStatusHistoryVoCollection();

			careContextStatusHistColl.add(careContextStatusHist);
			voCareContext.setCurrentStatus(careContextStatusHist);
			voCareContext.setStatusHistory(careContextStatusHistColl);
			voCareContext.setEndDateTime(new DateTime());

			String[] arrErrors = voCareContext.validate();
			if (arrErrors != null)
			{
				engine.showErrors(arrErrors);
				return;
			}

			try
			{
				domain.saveCareContext(voCareContext);
			}
			catch (StaleObjectException e)
			{
				engine.showMessage(ims.configuration.gen.ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
			}

			open();
			reselectGrid();
		}
	}
	
	private void undoCancelCareContext()
	{
		try
		{
		ValueObject selectedValue = form.grdList().getValue();
		
		if (!(selectedValue instanceof CareContextVo))
			return;
		
		CareContextVo careContext = domain.getCareContextById((CareContextRefVo) selectedValue);
		
		if (careContext != null && careContext.getVersion_CareContext() != ((CareContextVo)selectedValue).getVersion_CareContext())
		{
			engine.showMessage(ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
			open();
			return;
		}
		
		CareContextStatusHistoryVo status = new CareContextStatusHistoryVo();
		status.setStatus(CareContextStatus.OPEN);
		status.setStatusDateTime(new DateTime());
		
		careContext.setCurrentStatus(status);
		
		if (careContext.getStatusHistory() == null) careContext.setStatusHistory(new CareContextStatusHistoryVoCollection());
		careContext.getStatusHistory().add(status);
		
		careContext.setEndDateTime(null);
		
		String[] errors = careContext.validate();
		if (errors != null && errors.length > 0)
		{
			engine.showErrors(errors);
			return;
		}
		
			domain.saveCareContext(careContext);
		}
		catch (StaleObjectException e)
		{
			engine.showMessage(ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
		}
		
		open();
		reselectGrid();
	}



	//WDEV-13764
	private void cancelClinicalContact() {
		
		if (form.grdList().getValue() instanceof ClinicalContactShortVo)
		{
			
			ClinicalContactShortVo voClinicalContact = (ClinicalContactShortVo) form.grdList().getValue();
			
			ClinicalContactStatusHistoryVo clinicalContactStatusHist =  new ClinicalContactStatusHistoryVo(); //WDEV-15259
			
			clinicalContactStatusHist.setStatus(ClinicalContactStatus.CANCELLED);
			clinicalContactStatusHist.setStatusDateTime(new DateTime());
			
			ClinicalContactStatusHistoryVoCollection clinicalContactStatusHistColl = voClinicalContact.getStatusHistory();
			
			if(clinicalContactStatusHistColl == null)
				clinicalContactStatusHistColl = new ClinicalContactStatusHistoryVoCollection();
			
			clinicalContactStatusHistColl.add(clinicalContactStatusHist);
			voClinicalContact.setCurrentStatus(clinicalContactStatusHist);
			voClinicalContact.setStatusHistory(clinicalContactStatusHistColl);
			voClinicalContact.setEndDateTime(new DateTime());
			
			String[] arrErrors = voClinicalContact.validate();
			if(arrErrors != null)
			{
				engine.showErrors(arrErrors);
				return;
			}
			
			try {
				domain.saveClinicalContact(voClinicalContact);
			} catch (StaleObjectException e) {
				engine.showMessage(ims.configuration.gen.ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
			}
			
			open();
			reselectGrid();
		}
	}
	
	private void undoCancelClinicalContact()
	{
		try
		{
			ValueObject selectedValue = form.grdList().getValue();

			if (!(selectedValue instanceof ClinicalContactShortVo))
				return;

			ClinicalContactShortVo clinicalContact = (ClinicalContactShortVo) form.grdList().getValue();

			ClinicalContactStatusHistoryVo status = new ClinicalContactStatusHistoryVo(); //WDEV-15259
			status.setStatus(ClinicalContactStatus.OPEN);
			status.setStatusDateTime(new DateTime());
			
			ClinicalContactStatusHistoryVoCollection clinicalContactStatusHistColl = clinicalContact.getStatusHistory();
			
			if(clinicalContactStatusHistColl == null)
				clinicalContactStatusHistColl = new ClinicalContactStatusHistoryVoCollection();
			
			clinicalContactStatusHistColl.add(status);
			clinicalContact.setStatusHistory(clinicalContactStatusHistColl);
			clinicalContact.setCurrentStatus(status);

			clinicalContact.setEndDateTime(null);

			String[] errors = clinicalContact.validate();
			if (errors != null && errors.length > 0)
			{
				engine.showErrors(errors);
				return;
			}

			domain.saveClinicalContact(clinicalContact);
		}
		catch (StaleObjectException e)
		{
			engine.showMessage(ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
		}

		open();
		reselectGrid();
	}

	

	private void displayDiagCompAssociationsOnSummary()
	{

		ClinicalDIAssociationVoCollection voCollDiAsociations = null;

		ValueObject value = form.ctnSummary().grdDiagnosis().getValue();
		if (value != null)
		{
			String headerToolTip = "";
			String association = "";
			
			if (value instanceof PatientProblemRefVo)
			{
				voCollDiAsociations = domain.listClinicalDiAssociationByPatientProblem((PatientProblemRefVo) value);
				if (value instanceof PatientProblemVo)
				{
					association = ((PatientProblemVo) value).getPatientProblem();
					headerToolTip = ((PatientProblemVo) value).getDiAssociationTooltip();
				}
			}
			else if (value instanceof PatientDiagnosisRefVo)
			{
				voCollDiAsociations = domain.listClinicalDiAssociationByPatientDiagnosis((PatientDiagnosisRefVo) value);
				if (value instanceof PatientDiagnosisShortVo)
				{
					association = getDiagnosisText((PatientDiagnosisShortVo) value);
					headerToolTip = ((PatientDiagnosisShortVo) value).getTooltipForDiAssociation();
				}
			}

			markGridAssociations(voCollDiAsociations, Boolean.TRUE, association, headerToolTip);
		}

	}
	

	private void displayProcAssociationsOnSummary()
	{
		ClinicalDIAssociationVoCollection voCollDiAsociations = null;
		
		if (form.ctnSummary().grdProcedure().getValue() != null)
		{
			String headerTooltip = "";
			String association = "";
			
			if (form.ctnSummary().grdProcedure().getValue() instanceof PatientProcedureRefVo)
			{
				voCollDiAsociations = domain.listClinicalDiAssociationByPatientProcedure((PatientProcedureRefVo) form.ctnSummary().grdProcedure().getValue());
				if(form.ctnSummary().grdProcedure().getValue() instanceof PatientProcedureShortVo)
				{
					association = getProcedureText(((PatientProcedureShortVo)form.ctnSummary().grdProcedure().getValue()));
					headerTooltip = ((PatientProcedureShortVo)form.ctnSummary().grdProcedure().getValue()).getDiAssociationsTooltip();
				}
			}
			
			markGridAssociations(voCollDiAsociations, Boolean.FALSE, association, headerTooltip);
		}
	}

	private void viewProcAssociationsOnDialog()
	{
		if (form.ctnSummary().grdProcedure().getSelectedRow() != null && form.ctnSummary().grdProcedure().getValue() != null)
		{
			form.getGlobalContext().Clinical.PatientSummary.setPrimaryAssociation(form.ctnSummary().grdProcedure().getValue());
		}
		else
		{
			engine.showMessage("The Menu option chosen for the Procedure grid could not be performed, as no data is selected.");
			return;
		}
		
		form.getGlobalContext().Clinical.setIsDiAssociationDialogOpenedFromPatientSummary(new Boolean(true));
		form.getGlobalContext().Clinical.setIsDiagnosisRecordUpdated(null);
		engine.open(form.getForms().Clinical.ClinicalDiAssociations);
		
	}

	private void viewDiagCompAssociationsOnDialog()
	{
		if (form.ctnSummary().grdDiagnosis().getSelectedRow() != null && form.ctnSummary().grdDiagnosis().getValue() != null)
			form.getGlobalContext().Clinical.PatientSummary.setPrimaryAssociation(form.ctnSummary().grdDiagnosis().getValue());
		else
		{
			engine.showMessage("The Menu option chosen for the Diagnosis / Complication / Problem grid could not be performed, as no data is selected.");
			return;
		}
		
		form.getGlobalContext().Clinical.setIsDiAssociationDialogOpenedFromPatientSummary(new Boolean(true));
		form.getGlobalContext().Clinical.setIsDiagnosisRecordUpdated(null);
		engine.open(form.getForms().Clinical.ClinicalDiAssociations);
		
	}
	
	private void viewProcItem()
	{
		form.getGlobalContext().Clinical.setReturnToFormName(engine.getFormName());
		form.getGlobalContext().Clinical.setReturnToFormMode(FormMode.VIEW);
		
		if (form.ctnSummary().grdProcedure().getSelectedRow() != null)
		{
			ValueObject voVal = form.ctnSummary().grdProcedure().getValue();
			if (voVal != null)
			{
				if (voVal instanceof PatientProcedureShortVo)
				{
					//WDEV-1421
					form.getGlobalContext().Clinical.setSelectedPatientProcedureFromPatientSummary((PatientProcedureShortVo)voVal);
					//WDEV-2422
					engine.open(form.getForms().Clinical.Procedures_Dialog);
				}
			}
		}
		
	}

	private void viewDiagCompItem()
	{
		form.getGlobalContext().Clinical.setReturnToFormName(engine.getFormName());
		form.getGlobalContext().Clinical.setReturnToFormMode(FormMode.VIEW);
		
		if (form.ctnSummary().grdDiagnosis().getSelectedRow() != null)
		{
			ValueObject voVal = form.ctnSummary().grdDiagnosis().getValue();
			if (voVal != null)
			{
				if (voVal instanceof PatientDiagnosisShortVo)
				{
					//WDEV-1421
					form.getGlobalContext().Clinical.setSelectedPatientDiagnosisFromPatientSummary((PatientDiagnosisShortVo)voVal);
					//WDEV-2422
					engine.open(form.getForms().Clinical.DiagnosisComplications_Dialog);
				}
				//else if (voVal instanceof ClinicalProblemVo)
				//	engine.open(form.getForms().Clinical.PatientProblems);
				else if (voVal instanceof PatientProblemVo)
				{
					//WDEV-1421
					form.getGlobalContext().Clinical.setSelectedPatientProblemFromPatientSummary((PatientProblemVo)voVal);
					//WDEV-2422
					engine.open(form.getForms().Clinical.PatientProblems_Dialog);
				}
			}
		}		
	}

	private void editContact()
	{
		setCareSpellDialogModeGC(CareSpellDialogMode.EDITCONTACT);
		engine.open(form.getForms().Core.CareSpellDialog, "Episode of Care");
	}

	private void addContact()
	{
		if(form.grdList().getSelectedRow() != null)
		{
			if(form.grdList().getSelectedRow().getValue() != null &&  form.grdList().getSelectedRow().getValue() instanceof CareContextVo)
				form.getGlobalContext().Clinical.PatientSummary.setCareContext((CareContextVo) form.grdList().getSelectedRow().getValue());
		}
		
		form.getGlobalContext().Clinical.PatientSummary.setClinicalContact(null);
		setCareSpellDialogModeGC(CareSpellDialogMode.ADDCONTACT);
		engine.open(form.getForms().Core.CareSpellDialog, "Episode of Care");
	}

	private void editEpisodeofCare()
	{
		setCareSpellDialogModeGC(CareSpellDialogMode.EDITEPISODEOFCARE);
		engine.open(form.getForms().Core.CareSpellDialog, "Episode of Care");

	}

	private void editContactContextDetails()
	{
		setCareSpellDialogModeGC(CareSpellDialogMode.EDITCONTACTCONTEXTDETAILS);
		engine.open(form.getForms().Core.CareSpellDialog, "Episode of Care");

	}

	private void editCareGroup()
	{
		setCareSpellDialogModeGC(CareSpellDialogMode.EDITCAREGROUPING);
		engine.open(form.getForms().Core.CareSpellDialog, "Episode of Care");

	}

	private void addContactContextDetails()
	{
		form.getGlobalContext().Clinical.PatientSummary.setCareContext(null);
		setCareSpellDialogModeGC(CareSpellDialogMode.ADDCONTACTCONTEXTDETAILS);
		engine.open(form.getForms().Core.CareSpellDialog, "Episode of Care");
	}

	private void newCareGrouping()
	{
		clearPatientSummaryContexts(true);
		setCareSpellDialogModeGC(CareSpellDialogMode.NEWCAREGROUPING);
		engine.open(form.getForms().Core.CareSpellDialog, "Episode of Care");
	}

	private void clearPatientSummaryContexts(boolean bClearCareSpell)
	{
		form.getGlobalContext().Clinical.PatientSummary.setClinicalContact(null);
		form.getGlobalContext().Clinical.PatientSummary.setCareContext(null);
		form.getGlobalContext().Clinical.PatientSummary.setEpisodeOfCare(null);
		
		if(bClearCareSpell)
			form.getGlobalContext().Clinical.PatientSummary.setCareSpell(null);
	}

	private void newEpisodeofCare()
	{
		clearPatientSummaryContexts(false);
		setCareSpellDialogModeGC(CareSpellDialogMode.NEWEPISODEOFCARE);
		engine.open(form.getForms().Core.CareSpellDialog, "Episode of Care");
	}

	private void setCareSpellDialogModeGC(CareSpellDialogMode careSpellDialogMode)
	{
		form.getGlobalContext().Core.setCareSpellDialogMode(careSpellDialogMode);
	}

	protected void onFormDialogClosed(FormName formName, DialogResult result) throws PresentationLogicException
	{
		if (formName.equals(form.getForms().Core.CareSpellDialog))
		{	
			
			clearGlobalContexts();
			if(form.cmbContext().getValue() != null && (form.dteDateFrom().getValue() == null || form.dteDateTo().getValue() == null)) //wdev-13335
			{
				form.cmbContext().setValue(null);
				cmbContextValueHasChanghed();
			}
			
			open();
			
			form.getContextMenus().hideAllClinicalContactsListMenuItems();
			form.getContextMenus().getClinicalContactsListNewCareGroupingItem().setVisible(true);
			updateContextMenuState();
		}
		else if (formName.equals(form.getForms().Clinical.ClinicalDiAssociations))
		{
			if(allowPatientSummaryCDIdisplay())
			{
				//Restore the Grid Associations 
				if(isAssociationOnSummaryDisplayed())
				{
					//Do a list again as the relationships might have changed
					listCDIDetails(true);
					listProcedures(true);

					//Set the value of the previous selected record
					ValueObject voSelected = form.getGlobalContext().Clinical.PatientSummary.getPrimaryAssociation();
					if(voSelected instanceof PatientProcedureShortVo)
						form.ctnSummary().grdProcedure().setValue(voSelected);
					else
						form.ctnSummary().grdDiagnosis().setValue(voSelected);
					
					//Display the associations again
					if (form.getGlobalContext().Clinical.PatientSummary.getPrimaryAssociationIsNotNull())
					{
						if (form.getGlobalContext().Clinical.PatientSummary.getPrimaryAssociation() instanceof PatientProcedureShortVo)
							displayProcAssociationsOnSummary();
						else
							displayDiagCompAssociationsOnSummary();
					}
				}
				else
				{
					//Refresh the diagnosis grid
					if(diagnosisRecordUpdated())
					{
						listCDIDetails(true);
					}
				}
			}
		}
		else if (formName.equals(form.getForms().Therapies.SOAPNoteDialog) ||
					formName.equals(form.getForms().Clinical.ClinicalNoteDrawingDialog) ||
						formName.equals(form.getForms().Clinical.ClinicalNotesDialog))
		{
			//form.getGlobalContext().Core.setClinicalNotesShort(null);
			//form.getGlobalContext().Clinical.setCurrentClinicalNote(null);
			form.getGlobalContext().Clinical.setReturnToFormMode(null);
			form.getGlobalContext().Core.setClinicalNotingMode(null);
		}
		else if(formName.equals(form.getForms().Clinical.DiagnosisComplications_Dialog) || 
					formName.equals(form.getForms().Clinical.PatientProblems_Dialog))
		{
			// If these calls are too heavy it may be improved by flagging the a
			// saved record in the calling dialog
			// but in this case we might miss other records saved by other user
			// in the Diagnosis or Problems screen

			// WDEV-2439
			grdListRow parentCareSpellRow = getParentCareSpellRow(form.grdList().getSelectedRow());
			if (parentCareSpellRow != null)
			{
				// Refresh Tree - care spell
				setStartDateEndDateAndTooltip(parentCareSpellRow, (CareSpellVo) parentCareSpellRow.getValue());

				// Refresh Diagnosis Grid
				onRadioButtonGroupDiagnosisValueChanged();
			}
		}
		//WDEV-2439 
		else if(formName.equals(form.getForms().Clinical.Procedures_Dialog))
		{
			grdListRow parentCareSpellRow = getParentCareSpellRow(form.grdList().getSelectedRow());
			if (parentCareSpellRow != null)
			{
				// Refresh Tree - care spell
				setStartDateEndDateAndTooltip(parentCareSpellRow, (CareSpellVo) parentCareSpellRow.getValue());
				// Refresh Diagnosis Grid
				onRadioButtonGroupProcedureValueChanged();
			}
		}
	}

	//Get the parent CareSpellRow recursively to cover any extra level introduced (if ever)
	private grdListRow getParentCareSpellRow(grdListRow selectedRow)
	{
		if (selectedRow != null)
		{
			if(selectedRow.getValue() instanceof CareSpellVo)
			{
				return selectedRow;
			}

			return getParentCareSpellRow(selectedRow.getParentRow());
		}

		return null;
	}

	private void clearGlobalContexts()
	{
		form.getGlobalContext().Core.setCurrentClinicalContact(null);
		form.getGlobalContext().Core.setCurrentCareContext(null);
		form.getGlobalContext().Core.setEpisodeofCareShort(null);
		form.getGlobalContext().Clinical.PatientSummary.setCareSpell(null);

		form.getGlobalContext().Core.CurrentCareContext.setContextType(null);
		form.getGlobalContext().Core.setParentClinContact(null);
		form.getGlobalContext().Core.setClinicalContact(null);
		
		resetPIDBarText();
	}

	protected void onGrdListSelectionCleared() throws PresentationLogicException
	{
		clearSelection();
		enableDiagnosisGridContextMenu(); //WDEV-15918
		enableProcedureContextMenu();
		updateControlsState();
	}

	private void clearSelection()
	{
		clearGlobalContexts();
		form.grdList().setValue(null);
		form.chkPatientView().setValue(true);
		if (allowPatientSummaryCDIdisplay())
		{
			listCDIDetails();
			listProcedures();
		}
		form.getContextMenus().hideAllClinicalContactsListMenuItems();
		form.getContextMenus().getClinicalContactsListNewCareGroupingItem().setVisible(true);
		form.ctnSummary().setCaption("Patient");
	}

	private boolean allowPatientSummaryCDIdisplay()
	{
		return ConfigFlag.UI.PATIENT_SUMMARY_CDI_DISPLAY.getValue();
	}
	
	private PatientProcedureStatus getProcedureStatus()
	{
		GroupProcedureEnumeration procedureGroupValue = form.ctnSummary().GroupProcedure().getValue();
		if(procedureGroupValue != null)
		{
			if(procedureGroupValue.equals(GenForm.ctnSummaryContainer.GroupProcedureEnumeration.rdoPerformedProcedure))
				return PatientProcedureStatus.PERFORMED;
			if(procedureGroupValue.equals(GenForm.ctnSummaryContainer.GroupProcedureEnumeration.rdoPlannedProcedure))
				return PatientProcedureStatus.PLANNED;
		}
		return null;
	}
	
	private boolean diagnosisRecordUpdated()
	{
		return form.getGlobalContext().Clinical.getIsDiagnosisRecordUpdatedIsNotNull() && form.getGlobalContext().Clinical.getIsDiagnosisRecordUpdated().booleanValue();
	}

	protected void onChkPatientViewValueChanged() throws PresentationLogicException
	{
		if (form.chkPatientView().getValue())
		{
			clearGlobalContexts();
			form.grdList().setValue(null);
			if (allowPatientSummaryCDIdisplay())
			{
				clearAllPreviousEpisodeOfCare();
				listCDIDetails();
				listProcedures();
			}
			form.getContextMenus().hideAllClinicalContactsListMenuItems();
			form.getContextMenus().getClinicalContactsListNewCareGroupingItem().setVisible(true);
			
			onImbSearchClick(); //WDEV-15887
			//enableDiagnosisGridContextMenu();
			//enableProcedureContextMenu();
			
			form.ctnSummary().setCaption("Patient");
		}
		
		updateControlsState();// 	WDEV-15253
	}
	
	private Image getProcedureLateralityImg(LateralityLRB procLaterality, PatientProcedureStatus status)
	{
		if (procLaterality != null && status != null)
		{
			if (procLaterality.equals(LateralityLRB.LEFT))
			{
				if (status.equals(PatientProcedureStatus.PLANNED))
					return form.getImages().COE.DarkCyanLeft;
				else if (status.equals(PatientProcedureStatus.PERFORMED))
					return form.getImages().COE.OrangeLeft;
	
			}
			else if (procLaterality.equals(LateralityLRB.RIGHT))
			{
				if (status.equals(PatientProcedureStatus.PLANNED))
					return form.getImages().COE.DarkCyanRight;
				else if (status.equals(PatientProcedureStatus.PERFORMED))
					return form.getImages().COE.OrangeRight;
	
			}
			else if (procLaterality.equals(LateralityLRB.BILATERAL))
			{
				if (status.equals(PatientProcedureStatus.PLANNED))
					return form.getImages().COE.DarkCyanBoth;
				else if (status.equals(PatientProcedureStatus.PERFORMED))
					return form.getImages().COE.OrangeBoth;
			}
		}
		else
		{
			if(status != null)
			{
				if (status.equals(PatientProcedureStatus.PLANNED))
					return form.getImages().COE.DarkCyan;
				else if (status.equals(PatientProcedureStatus.PERFORMED))
					return form.getImages().COE.Orange;
			}
		}
		return null;
	}

	private Image getDiagnosisLateralityImg(LateralityLRB diagLaterality)
	{
		if(diagLaterality != null)
		{
			if(diagLaterality.equals(LateralityLRB.LEFT))
				return form.getImages().COE.BlueLeft;
			else if(diagLaterality.equals(LateralityLRB.RIGHT))
				return form.getImages().COE.BlueRight;
			else if(diagLaterality.equals(LateralityLRB.BILATERAL))
				return form.getImages().COE.BlueBoth;
		}
		else
			return form.getImages().COE.Blue;
		
		return null;
	}

	private Image getComplicationLateralityImg(LateralityLRB diagLaterality)
	{
		if(diagLaterality != null)
		{
			if(diagLaterality.equals(LateralityLRB.LEFT))
				return form.getImages().COE.LightSkyBlueLeft;
			else if(diagLaterality.equals(LateralityLRB.RIGHT))
				return form.getImages().COE.LightSkyBlueRight;
			else if(diagLaterality.equals(LateralityLRB.BILATERAL))
				return form.getImages().COE.LightSkyBlueBoth;
		}
		else
			return form.getImages().COE.LightSkyBlue;
		
		return null;
	}
	
	private void setFlagDisplayAssociationsOnSummary(Boolean value)
	{
		form.getLocalContext().setIsDisplayAssociationsOnSummary(value);
	}
	
	private boolean isAssociationOnSummaryDisplayed()
	{
		return form.getLocalContext().getIsDisplayAssociationsOnSummaryIsNotNull() && form.getLocalContext().getIsDisplayAssociationsOnSummary().booleanValue();
	}
	
	private void newProcedure()
	{
		setNewItemContextData();
		//WDEV-2422
		engine.open(form.getForms().Clinical.Procedures_Dialog);
	}

	private void setNewItemContextData()
	{
		form.getGlobalContext().Clinical.setReturnToFormName(engine.getFormName());
		form.getGlobalContext().Clinical.setReturnToFormMode(FormMode.EDIT);
	}

	private void newProblem()
	{
		setNewItemContextData();
		//WDEV-2422
		engine.open(form.getForms().Clinical.PatientProblems_Dialog);
	}

	private void newDiagnosis()
	{
		setNewItemContextData();
		//WDEV-2422
		engine.open(form.getForms().Clinical.DiagnosisComplications_Dialog);
	}
	
	private String getStatus(PatientProcedureShortVo voPatientProcedure)
	{
		String status = "";
		if(voPatientProcedure != null)
		{
			PatientProcedureStatus procedureStatus = voPatientProcedure.getProcedureStatus();
			if(procedureStatus != null)
			{
				if(procedureStatus.equals(PatientProcedureStatus.PLANNED))
				{
					if(voPatientProcedure.getDatePlannedIsNotNull())
					{
						status = "Booked";
					}
					else
					{
						status = PatientProcedureStatus.PLANNED.toString();
					}
				}
				else if(procedureStatus.equals(PatientProcedureStatus.PERFORMED))
				{
					status = PatientProcedureStatus.PERFORMED.toString();
				} 
			}
		}
		
		return status;
	}
	
	private String getDate(PatientProcedureShortVo voPatientProcedureShort)
	{
		PartialDate procDate = null;
		if (voPatientProcedureShort != null)
		{
			PatientProcedureStatus procedureStatus = voPatientProcedureShort.getProcedureStatus();
			if (procedureStatus != null)
			{
				if (procedureStatus.equals(PatientProcedureStatus.PLANNED))
				{
					procDate = voPatientProcedureShort.getDatePlanned();
				}
				else if (procedureStatus.equals(PatientProcedureStatus.PERFORMED))
				{
					procDate = voPatientProcedureShort.getProcDate();
				}
			}
		}

		return procDate != null ? procDate.toString() : "";
	}
	
	private CSDiagnosisAndProcedureTextAndTooltip getPrimaryDiagnosisAndProblems(CareSpellRefVo careSpellRefVo)
	{
		if (careSpellRefVo != null)
		{
			CSPrimaryDiagnosisAndPoceduresVo voDiagAndProc = domain.listPrimaryDiagnosisAndProblems(careSpellRefVo);
			StringBuffer text = new StringBuffer();
			StringBuffer tooltip = new StringBuffer();
			String comaSeparator = ", ";
			String initialSeparator = " - "; 
						
			if (voDiagAndProc != null && voDiagAndProc.getPrimaryDiagnosisIsNotNull() && voDiagAndProc.getPrimaryDiagnosis().size() > 0)
			{
				String primaryDiagnosisTitle = "Primary Diagnosis: ";
				tooltip.append("*" + primaryDiagnosisTitle + "*");

				for (int i = 0; i < voDiagAndProc.getPrimaryDiagnosis().size(); i++)
				{
					if (voDiagAndProc.getPrimaryDiagnosis().get(i).getDiagnosisNameIsNotNull())
					{
						String diagnosisName = voDiagAndProc.getPrimaryDiagnosis().get(i).getDiagnosisName();
						
						if (i == 0)
						{
							text.append(initialSeparator);
						}
						else if (i > 0)
						{
							text.append(comaSeparator);
							tooltip.append(comaSeparator);
						}
						
						text.append(diagnosisName);
						tooltip.append(diagnosisName);
					}
				}
			}

			if (voDiagAndProc != null && voDiagAndProc.getPrimaryProceduresIsNotNull() && voDiagAndProc.getPrimaryProcedures().size() > 0)
			{
				boolean isPrimaryDiagnosisAdded = tooltip.length() > 0;
				boolean isTextAdded = text.length() > 0;
				
				if (isPrimaryDiagnosisAdded)
					tooltip.append("\n");
				
				String primaryProblemTitle = "Primary Problem: ";
				tooltip.append("*" + primaryProblemTitle + "*");

				for (int i = 0; i < voDiagAndProc.getPrimaryProcedures().size(); i++)
				{
					if (voDiagAndProc.getPrimaryProcedures().get(i).getProcedureNameIsNotNull())
					{
						String procedureName = voDiagAndProc.getPrimaryProcedures().get(i).getProcedureName();
						if (i == 0)
						{
							text.append(isTextAdded ? comaSeparator : initialSeparator);
						}
						else if (i > 0)
						{
							text.append(comaSeparator);
							tooltip.append(comaSeparator);
						}
																	
						text.append(procedureName);
						tooltip.append(procedureName);
					}
				}
			}

			return new CSDiagnosisAndProcedureTextAndTooltip(text.toString(), new ims.utils.textile.Textile().process(tooltip.toString()));

		}
		return null;
	}
	
	
	private class CSDiagnosisAndProcedureTextAndTooltip
	{
		String	text	= "";
		@SuppressWarnings("unused")
		String	tooltip	= "";

		public CSDiagnosisAndProcedureTextAndTooltip(String text, String tooltip)
		{
			this.text = text;
			this.tooltip = tooltip;
		}

		public String getText()
		{
			return text;
		}
	}
	
	private void viewClinicalNotes()
	{
		if (form.grdList().getSelectedRow() != null &&
				form.grdList().getSelectedRow().getValue() != null &&
				form.getGlobalContext().Core.getClinicalNotesShortIsNotNull() &&
				form.getGlobalContext().Clinical.getCurrentClinicalNoteIsNotNull())
		{
			if (form.grdList().getValue() instanceof ClinicalContactShortVo)
			{
				selectClinicalNoteInGlobalContext();
				form.getGlobalContext().Clinical.setReturnToFormMode(FormMode.VIEW);
				form.getGlobalContext().Core.setClinicalNotingMode(null);
				
				if (form.getGlobalContext().Core.getClinicalNotesShort().getSourceOfNoteIsNotNull()
					&& form.getGlobalContext().Core.getClinicalNotesShort().getSourceOfNote().equals(SourceOfNote.THERAPYSOAPNOTE) )
						engine.open(form.getForms().Therapies.SOAPNoteDialog);
				
				else if (form.getGlobalContext().Core.getClinicalNotesShort().getIsDerivedNoteIsNotNull()
					&& form.getGlobalContext().Core.getClinicalNotesShort().getIsDerivedNote().booleanValue())
				{
					if ( form.getGlobalContext().Core.getClinicalNotesShort().getSourceOfNoteIsNotNull()
						&& form.getGlobalContext().Core.getClinicalNotesShort().getSourceOfNote().equals(SourceOfNote.CLINICALNOTEDRAWINGIP) )
							engine.open(form.getForms().Clinical.ClinicalNoteDrawingDialog);
						
					if ( form.getGlobalContext().Core.getClinicalNotesShort().getSourceOfNoteIsNotNull()
						&& form.getGlobalContext().Core.getClinicalNotesShort().getSourceOfNote().equals(SourceOfNote.CLINICALNOTEDRAWINGOP) )
							engine.open(form.getForms().Clinical.ClinicalNoteDrawingDialog);
					
				}
				else
				{
					form.getGlobalContext().Clinical.setReturnToFormMode(FormMode.VIEW);
					engine.open(form.getForms().Clinical.ClinicalNotesDialog);
				}			
			}
		}
	}
	
	private void selectClinicalNoteInGlobalContext()
	{
		
		ClinicalNotesVo clinicalNotesVoForContact = null;
		
		try
		{
			clinicalNotesVoForContact = domain.getClinicalNotesForContact((ClinicalContactRefVo) form.grdList().getSelectedRow().getValue());
			
		}
		catch (RuntimeException e)
		{
			
			engine.showMessage(e.getMessage());
		
		}
		
		ClinicalNotesShortVo clinicalNotesForContact = null;
		
		if(clinicalNotesVoForContact != null)
			clinicalNotesForContact = domain.getClinicalNotesShort(clinicalNotesVoForContact.getID_ClinicalNotes());
		form.getGlobalContext().Core.setClinicalNotesShort(clinicalNotesForContact);
		
		if (clinicalNotesVoForContact != null)
			form.getGlobalContext().Clinical.setCurrentClinicalNote(clinicalNotesVoForContact);
		else
			form.getGlobalContext().Clinical.setCurrentClinicalNote(null);
	}
	
	//------ Optimisation mechanism for Episode Of Care ---------------------------------------------------------
	//If a Previously selected episode is the same as the current one, do not list Diagnosis and Procedures again 
	private boolean isSameEpisodeOfCareAsPreviousForDiagnosisRecords(EpisodeofCareShortVo voEpisodeOfCare)
	{
		EpisodeOfCareRefVo previousEpisodeOfCare = getPreviousDiagnosisEpisodeOfCare();
		if (voEpisodeOfCare != null && voEpisodeOfCare.equals(previousEpisodeOfCare))
			return true;

		setPreviousDiagnosisEpisodeOfCare(voEpisodeOfCare);
		return false;
	}

	private boolean isSameEpisodeOfCareAsPreviousForProcedureRecord(EpisodeofCareShortVo voEpisodeOfCare)
	{
		EpisodeOfCareRefVo previousEpisodeOfCare = getPreviousProcedureEpisodeOfCare();

		if (voEpisodeOfCare != null && voEpisodeOfCare.equals(previousEpisodeOfCare))
			return true;

		setPreviousProcedureEpisodeOfCare(voEpisodeOfCare);
		return false;
	}

	private EpisodeOfCareRefVo getPreviousDiagnosisEpisodeOfCare()
	{
		return form.getLocalContext().getPreviousDiagnosisEpisodeOfCare();
	}

	private EpisodeOfCareRefVo getPreviousProcedureEpisodeOfCare()
	{
		return form.getLocalContext().getPreviousProcedureEpisodeOfCare();
	}

	private void setPreviousDiagnosisEpisodeOfCare(EpisodeOfCareRefVo voEpisodeofCare)
	{
		form.getLocalContext().setPreviousDiagnosisEpisodeOfCare(voEpisodeofCare);
	}

	private void setPreviousProcedureEpisodeOfCare(EpisodeOfCareRefVo voEpisodeofCare)
	{
		form.getLocalContext().setPreviousProcedureEpisodeOfCare(voEpisodeofCare);
	}

	private void clearAllPreviousEpisodeOfCare()
	{
		clearPreviousDiagnosisEpisodeOfCare();
		clearPreviousProcedureEpisodeOfCare();
	}

	private void clearPreviousDiagnosisEpisodeOfCare()
	{
		form.getLocalContext().setPreviousDiagnosisEpisodeOfCare(null);
	}
	
	private void clearPreviousProcedureEpisodeOfCare()
	{
		form.getLocalContext().setPreviousProcedureEpisodeOfCare(null);
	}	
	//------ End optimisation mechanism for Episode Of Care -----------------------------------------------------

	@Override
	protected void onTxtWorkflowIDValueChanged() throws PresentationLogicException 
	{
		
	}

	@Override
	protected void onBtnSearchWorkflowIDClick() throws PresentationLogicException 
	{
		if(form.txtWorkflowID().getValue() == null || form.txtWorkflowID().getValue().trim().length() == 0)
			return;
		
		PASEventRefVo pasEvent = domain.getPASEvent(form.txtWorkflowID().getValue());
		if(pasEvent == null)
		{
			engine.showErrors(new String[] { "PAS Event with Workflow ID '" + form.txtWorkflowID().getValue().trim() + "' was not found" });
			return;		
		}
		
		GenForm.grdListRow[] rows = form.grdList().getAllRows();
		for(int x = 0; x < rows.length; x++)
		{
			if(rows[x].getValue() instanceof CareContextVo)
			{
				CareContextVo vo = (CareContextVo)rows[x].getValue();
				
				if(vo.getPasEvent() != null && vo.getPasEvent().equals(pasEvent))
				{
					form.grdList().setValue(vo);
					gridListSelectionChanged();
					return;
				}
			}
		}
		
		engine.showMessage("Unable to find the care context row for the given PAS Event with Workflow ID '" + form.txtWorkflowID().getValue().trim() + "'");
	}

	@Override
	protected void onBtnNewICPClick() throws PresentationLogicException
	{
		form.getGlobalContext().ICP.setService(domain.getServiceForEpisodeOfCareSpecialty(form.getGlobalContext().Core.getEpisodeofCareShort()));
		engine.open(form.getForms().ICP.ICPPatientSelect);
	}

	//wdev-13335
	protected void onImbClearClick() throws PresentationLogicException 
	{
		form.grdList().getRows().clear(); 
		form.chkPatientView().setValue(false);
		form.dteDateFrom().setValue(null);
		form.dteDateTo().setValue(null);
		form.cmbContext().setValue(null);
		form.ctnSummary().setCaption("Patient");//WDEV-15883
		form.ctnSummary().grdDiagnosis().getRows().clear();
		form.ctnSummary().grdProcedure().getRows().clear();
		form.ctnSummary().GroupDiagnosis().setValue(GenForm.ctnSummaryContainer.GroupDiagnosisEnumeration.rdoAllDiag);
		form.ctnSummary().GroupProcedure().setValue(GenForm.ctnSummaryContainer.GroupProcedureEnumeration.rdoAllProc);
		cmbContextValueHasChanghed();
		form.getGlobalContext().Clinical.setContextFilter(null); //wdev-13618
		//wdev-13624
		form.getContextMenus().hideAllClinicalContactsListMenuItems();
		form.getContextMenus().getClinicalContactsListNewCareGroupingItem().setVisible(true);
		form.getContextMenus().getClinicalContactsListViewCancelledContextsItem().setVisible(true);  //wdev-15988
		clearGlobalContexts();//WDEV-14072
		enableDiagnosisGridContextMenu();
		enableProcedureContextMenu();
		clearAllPreviousEpisodeOfCare();   //wdev-13624
		//----------
		resetPIDBarText();
	}

	//wdev-13335
	protected void onImbSearchClick() throws PresentationLogicException 
	{
		form.grdList().getRows().clear(); //wdev-13624
		if(form.cmbContext().getValue() != null)
		{
			if(form.dteDateFrom().getValue() == null)
			{
				engine.showErrors(new String[]{"Date From is mandatory"});
				return;
			}
			if(form.dteDateTo().getValue() == null)
			{
				engine.showErrors(new String[]{"Date To is mandatory"});
				return;
			}
			if(form.dteDateFrom().getValue().isGreaterThan(form.dteDateTo().getValue()))
			{
				engine.showErrors(new String[]{"Date From cannot be after Date To"});
				return;
			}
		}
		clearSelection();//WDEV-14072 //WDEV-15876
		int nContext = getIndexItem(form.cmbContext().getValue());
		CareSpellVoCollection voCollCareSpells = domain.listCareSpellsByPatientAndCriteria(form.getGlobalContext().Core.getPatientShort(), form.dteDateFrom().getValue(), form.dteDateTo().getValue(),nContext,form.getLocalContext().getShowCancelledContexts()); //wdev-13977
		//wdev-13618
		if( voCollCareSpells != null && voCollCareSpells.size() > 0)
			setContextFilter();
		else
		{
			form.getGlobalContext().Clinical.setContextFilter(null);
			engine.showMessage("There are no Records for the Search Criteria Provided");  //wdev-13624
		}
			
		//--------
		populateGrid(voCollCareSpells);
		//wdev-13624
		form.getContextMenus().hideAllClinicalContactsListMenuItems();
		form.getContextMenus().getClinicalContactsListNewCareGroupingItem().setVisible(true);
		updateContextMenuState();
		enableDiagnosisGridContextMenu();
		enableProcedureContextMenu();
		//----------
		
	}
	//wdev-13618
	void setContextFilter()
	{
		ContextFilterVo tempVo = new ContextFilterVo();
		if(form.cmbContext().getValue() == null)
		{
			form.getGlobalContext().Clinical.setContextFilter(null);
			return;
		}
		tempVo.setContext(getIndexItem(form.cmbContext().getValue()));
		tempVo.setDateFrom(form.dteDateFrom().getValue());
		tempVo.setDateTo(form.dteDateTo().getValue());
		form.getGlobalContext().Clinical.setContextFilter(tempVo);
		
		
	}
	//wdev-13335
	private int getIndexItem(String str)
	{
		if(str == null)
			return 0;
		else if(str.equals("Care Spell"))
			return 1;
		else if(str.equals("Episode of Care"))
			return 2;
		else if(str.equals("Care Context"))
			return 3;
		else if(str.equals("Clinical Contact"))//	WDEV-14914
			return 4;
		else
			return 0;
			
				
	}
	private String getContext(Integer ind)
	{
		if(ind == 0)
			return null;
		else if(ind == 1)
			return "Care Spell";
		else if (ind == 2)
			return "Episode of Care";
		else if(ind == 3)
			return "Care Context";
		else if(ind == 4)
			return "Clinical Contact";//	WDEV-14914
		else
			return null;
	}

	//wdev-13335
	protected void onCmbContextValueChanged() throws PresentationLogicException 
	{
		cmbContextValueHasChanghed();
		
	}
	//wdev-13335
	private void cmbContextValueHasChanghed()
	{
		if(form.cmbContext().getValue() == null)
		{
			form.dteDateFrom().setValue(null);
			form.dteDateTo().setValue(null);
			form.dteDateFrom().setRequired(false);
			form.dteDateTo().setRequired(false);
			form.dteDateFrom().setEnabled(false);
			form.dteDateTo().setEnabled(false);
		}
		else
		{
			form.dteDateFrom().setRequired(true);
			form.dteDateTo().setRequired(true);
			form.dteDateFrom().setEnabled(true);
			form.dteDateTo().setEnabled(true);
		}
	}

	//wdev-13896
	protected void onGrdListGridButtonClicked(int column, grdListRow row) throws PresentationLogicException 
	{
		if(row.getValue() instanceof EpisodeofCareVo)
		{
			form.getGlobalContext().Clinical.setEpisodeOfCareWithHistory(domain.getEpisodeOfCareWithHistory((EpisodeofCareVo) row.getValue()));
			engine.open(form.getForms().Core.EpisodeOfCareHistoryDialog);
		}
		else if(row.getValue() instanceof CareContextVo)
		{
			form.getGlobalContext().Clinical.setCareContextWithHistory(domain.getCareContextWithHistory((CareContextVo)row.getValue()));
			engine.open(form.getForms().Core.CareContextHistoryDialog);
		}
		
	}
	
}
