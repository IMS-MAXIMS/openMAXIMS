//#############################################################################
//#                                                                           #
//#  Copyright (C) <2015>  <IMS MAXIMS>                                       #
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
//#  IMS MAXIMS provides absolutely NO GUARANTEE OF THE CLINICAL SAFTEY of    #
//#  this program.  Users of this software do so entirely at their own risk.  #
//#  IMS MAXIMS only ensures the Clinical Safety of unaltered run-time        #
//#  software that it builds, deploys and maintains.                          #
//#                                                                           #
//#############################################################################
//#EOH
// This code was generated by Daniel Laffan using IMS Development Environment (version 1.22 build 41222.900)
// Copyright (C) 1995-2005 IMS MAXIMS plc. All rights reserved.

package ims.spinalinjuries.forms.medsystemreview;

import ims.framework.Control;

import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.exceptions.UniqueKeyViolationException;
import ims.framework.enumerations.DialogResult;
import ims.framework.enumerations.FormMode;
import ims.framework.exceptions.PresentationLogicException;
import ims.generalmedical.vo.AdmisSysRevewVo;
import ims.generalmedical.vo.MedicalProbOnAdmisVo;
import ims.generalmedical.vo.MedicalProbOnAdmisVoCollection;
import ims.generalmedical.vo.SystemReviewVo;
import ims.generalmedical.vo.SystemReviewVoCollection;
import ims.spinalinjuries.forms.medsystemreview.GenForm.grdProblemsRow;
import ims.spinalinjuries.vo.lookups.LookupHelper;
import ims.spinalinjuries.vo.lookups.SystemReviewHeadingsCollection;
import ims.configuration.gen.ConfigFlag;
import ims.core.vo.ClinicalContactShortVo;
import ims.core.vo.lookups.ContactType;

public class Logic extends BaseLogic
{
	public final static String LINESEPARATOR = ":" + System.getProperty("line.separator") + System.getProperty("line.separator");
		protected void onFormOpen() throws ims.framework.exceptions.FormOpenException
	{
		form.btnNew().setVisible(true);
		form.btnUpdate().setVisible(false);
		open();		
	}

	
	private void populateContactInfo(ClinicalContactShortVo voClinicalContactShort) 
	{
		if(voClinicalContactShort != null)
		{
			form.dtimAuthoring().setValue(voClinicalContactShort.getStartDateTime());
			form.txtAuthoringHcp().setValue(voClinicalContactShort.getSeenBy().toString());
		}
	}

	private void open() 
	{
		clearScreen();
		AdmisSysRevewVo voAdmisReview = new AdmisSysRevewVo();
		
		boolean medicalAdmissionSelected = isMedicalAdmission();
		
		if(medicalAdmissionSelected)
		{
			//voAdmisReview = domain.getAdmisSystemReviewByClinicalContact(form.getGlobalContext().Core.getCurrentClinicalContact());
			MedicalProbOnAdmisVoCollection tempMedicalProbColl = null;  //wdev-13525
			if(engine.isRIEMode())                                      //wdev-13525 
				tempMedicalProbColl = domain.getRiePatientProblemByClinicalContact(form.getGlobalContext().Core.getCurrentClinicalContact()); 	//wdev-13525
			else
				tempMedicalProbColl = domain.getPatientProblemByClinicalContact(form.getGlobalContext().Core.getCurrentClinicalContact()); 	//wdev-13417
			
			SystemReviewVoCollection tempSystemRevColl = domain.getAdmisSystemReviewCollByClinicalContact(form.getGlobalContext().Core.getCurrentClinicalContact());	//wdev-13417
			voAdmisReview.setProblemsOnAdmission(tempMedicalProbColl); //wdev-13417
			if(tempSystemRevColl != null && tempSystemRevColl.size() > 0) //wdev-13417
				voAdmisReview.setSystemReview(tempSystemRevColl.get(0));
				
			
			
		}
		else
		{
			//voAdmisReview = domain.getAdmisSystemReviewByCareContext(form.getGlobalContext().Core.getCurrentCareContext());
			MedicalProbOnAdmisVoCollection tempMedicalProbColl = null;	//wdev-13525
			if(engine.isRIEMode()) 										//wdev-13525
				tempMedicalProbColl = domain.getRiePatientProblemBYCareConntext(form.getGlobalContext().Core.getCurrentCareContext()); 	//wdev-13525
			else
				tempMedicalProbColl = domain.getPatientProblemByCareContext(form.getGlobalContext().Core.getCurrentCareContext()); 	//wdev-13417
			
			SystemReviewVoCollection tempSystemRevColl = domain.getAdmisSystemReviewCollByCareContext(form.getGlobalContext().Core.getCurrentCareContext());	//wdev-13417
			voAdmisReview.setProblemsOnAdmission(tempMedicalProbColl); //wdev-13417
			if(tempSystemRevColl != null && tempSystemRevColl.size() > 0) //wdev-13417
				voAdmisReview.setSystemReview(tempSystemRevColl.get(0));
		}

		form.getLocalContext().setadmisSysReviewRecord(voAdmisReview);
		if(voAdmisReview.getSystemReview() == null && (voAdmisReview.getProblemsOnAdmission() == null
				|| (voAdmisReview.getProblemsOnAdmissionIsNotNull() && voAdmisReview.getProblemsOnAdmission().size() == 0 )))
		{
			
				form.btnNew().setVisible(true);
				form.btnUpdate().setVisible(false);				
		
		}
		else
		{
			populateScreenFromData(voAdmisReview);
			if(voAdmisReview.getSystemReviewIsNotNull())
				populateContactInfo(voAdmisReview.getSystemReview().getClinicalContact());
			setProblemsRemoveVisibility();			
		}
		
		if(!medicalAdmissionSelected)
			enableButtons(medicalAdmissionSelected);
		if(voAdmisReview!=null)
			form.getLocalContext().setSelectedSystemReviewVo(voAdmisReview.getSystemReview());
	}

	private void enableButtons(boolean visible)
	{
		form.btnNew().setVisible(visible);
		form.btnUpdate().setVisible(visible);
	}


	private boolean isMedicalAdmission()
	{
		if(form.getGlobalContext().Core.getCurrentClinicalContactIsNotNull())
		{
			ClinicalContactShortVo voCurrentClinical = form.getGlobalContext().Core.getCurrentClinicalContact();
			if(voCurrentClinical.getContactType().equals(ContactType.SPINALMEDICALADMISSION))
				return true;
			else
				return false;
		}
		else
		{
			return false;					//ClinicalContact may be null, CareContext has been selected
		}
	}


	private void loadProblemsGrid(MedicalProbOnAdmisVoCollection voProbColl) 
	{
		form.grdProblems().getRows().clear();
		GenForm.grdProblemsRow row = null;
		for(int i=0;i<voProbColl.size();i++)
		{
			
			if(voProbColl.get(i).getPatientProblem() != null && voProbColl.get(i).getIsActive().equals(Boolean.TRUE))
			{
				row = form.grdProblems().getRows().newRow();
				row.setcolProblem(voProbColl.get(i).getPatientProblem());
				row.setTooltipForcolProblem(voProbColl.get(i).getPatientProblem());
				
				row.setcolProblemButton(voProbColl.get(i).getPatientProblem());
				row.setcolActive(voProbColl.get(i).getIsActive().booleanValue());
				row.setValue(voProbColl.get(i));
			}
			
		}
	}
		
	private void populateScreenFromData(AdmisSysRevewVo voAdmisReview) 
	{
		loadProblemsGrid(voAdmisReview.getProblemsOnAdmission());
		
		if(voAdmisReview.getSystemReview() == null)
		{
			form.btnNew().setVisible(true);
			return;
		}
		else
		{
			form.btnNew().setVisible(false);
			form.btnUpdate().setVisible(true);
		}
		
		SystemReviewVo voReview = voAdmisReview.getSystemReview();
		
		if(voReview != null)
			form.txtSystemReview().setValue(voReview.getReviewNotes());	
		
		
	}

	private void clearScreen() 
	{
		form.txtAuthoringHcp().setValue(null);
		form.dtimAuthoring().setValue(null);
		form.txtSystemReview().setValue(null);
		form.getLocalContext().setProblemsToBeDeactivated(null);
		form.grdProblems().getRows().clear();
	}

	private MedicalProbOnAdmisVoCollection populateProblemsOnAdmissionDataFromScreen() 
	{
		MedicalProbOnAdmisVoCollection voCollProblems = new MedicalProbOnAdmisVoCollection();
		MedicalProbOnAdmisVo item = null;
		for(int i=0;i<form.grdProblems().getRows().size();i++)
		{
			item = form.grdProblems().getRows().get(i).getValue();
			item.setPatientProblem(form.grdProblems().getRows().get(i).getcolProblemButton());
			if(item.getPatientProblemIsNotNull()){
				item.setIsActive(new Boolean(form.grdProblems().getRows().get(i).getcolActive()));
				item.setProblemContext("System Review");
				item.setCareContext(form.getGlobalContext().Core.getCurrentClinicalContact().getCareContext());
				
				voCollProblems.add(item);	
			}
		}
		
		if(form.getLocalContext().getProblemsToBeDeactivatedIsNotNull())
			for(int i=0;i<form.getLocalContext().getProblemsToBeDeactivated().size();i++)
			{
				item = form.getLocalContext().getProblemsToBeDeactivated().get(i);
				item.setIsActive(false);
				voCollProblems.add(form.getLocalContext().getProblemsToBeDeactivated().get(i));	
			}
		
		return voCollProblems;
	}

	protected void onImbAddProblemsClick()
	{
		newProblem();		
	}


	private void newProblem() 
	{
		GenForm.grdProblemsRow row = form.grdProblems().getRows().newRow();
		row.showcolProblemButtonOpened();
		row.setcolActive(true);
		row.setValue(new MedicalProbOnAdmisVo());
		form.grdProblems().setValue(null);
		form.getContextMenus().getGenericGridRemoveItem().setVisible(false);
	}
	
	protected void onBtnNewClick() throws ims.framework.exceptions.PresentationLogicException
	{
		form.grdProblems().getRows().clear();	//wdev-13512
		populateSystemReview();
		populateContactInfo(form.getGlobalContext().Core.getCurrentClinicalContact());
		
		form.setMode(FormMode.EDIT);
		
		form.btnNew().setVisible(false);
		form.btnUpdate().setVisible(false);

		form.getContextMenus().getGenericGridRemoveItem().setVisible(false);				
		form.getLocalContext().setadmisSysReviewRecord(new AdmisSysRevewVo());			
	}
	
	protected void onBtnUpdateClick() throws ims.framework.exceptions.PresentationLogicException
	{
		form.setMode(FormMode.EDIT);
		form.btnUpdate().setVisible(false);
		form.getContextMenus().getGenericGridRemoveItem().setVisible(false);	
		form.grdProblems().setValue(null);
	}
	
	protected void onBtnSaveClick() throws ims.framework.exceptions.PresentationLogicException
	{
		AdmisSysRevewVo voAdmisReview = form.getLocalContext().getadmisSysReviewRecord();
			
		populateDataFromScreen(voAdmisReview);
		
		String[] arrErrors = voAdmisReview.validate();
		if(arrErrors != null)
		{
			engine.showErrors(arrErrors);
			return;
		}
		
		
		try {
			domain.saveAdmisSystemReview(voAdmisReview, form.getGlobalContext().Core.getCurrentClinicalContact());
		} catch (StaleObjectException e) {
			engine.showMessage(ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
		} catch (UniqueKeyViolationException e) {
			engine.showMessage(e.getMessage());
		}
		
		open();
		form.setMode(FormMode.VIEW);
			
	}
	
	private AdmisSysRevewVo populateDataFromScreen(AdmisSysRevewVo voAdmisReview) 
	{
		SystemReviewVo voReview = voAdmisReview.getSystemReview();
		if(voReview == null)
			voReview = new SystemReviewVo();
		
		voReview.setReviewNotes(form.txtSystemReview().getValue());
		voReview.setClinicalContact(form.getGlobalContext().Core.getCurrentClinicalContact());
		
		voAdmisReview.setSystemReview(voReview);
		voAdmisReview.setProblemsOnAdmission(populateProblemsOnAdmissionDataFromScreen());
		return voAdmisReview;			
	}

	protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException
	{		
		open();	
		form.setMode(FormMode.VIEW);
	}

	protected void onImbRemoveProblemsClick() 
	{		removeProblem();
	}


	private void removeProblem() 
	{
		if(form.grdProblems().getSelectedRowIndex() != -1)
		{	
			if (form.grdProblems().getSelectedRow().getValue() == null || form.grdProblems().getSelectedRow().getValue().getID_PatientProblem() == null)
			{
				form.grdProblems().removeSelectedRow();
			}
			else
			{
				//delete from grid but store for deactivation on save
				if(form.getLocalContext().getProblemsToBeDeactivated()==null)
					form.getLocalContext().setProblemsToBeDeactivated(new MedicalProbOnAdmisVoCollection());
					
				form.getLocalContext().getProblemsToBeDeactivated().add(form.grdProblems().getValue());
					
				form.grdProblems().removeSelectedRow();
			}
		}
		
		setProblemsRemoveVisibility();
	}

	protected void onGrdProblemsGridCommentChanged(int column, grdProblemsRow row) throws PresentationLogicException 
	{
		row.setcolProblem(row.getcolProblemButton());
	}

	

	private void newProblemFromtxtSystemReview() 
	{
		if (form.txtSystemReview().getSelectedText() != "")
		{
			GenForm.grdProblemsRow row = form.grdProblems().getRows().newRow();
			row.setcolProblem(form.txtSystemReview().getSelectedText());
			row.setcolProblemButton(form.txtSystemReview().getSelectedText());
			row.setcolActive(true);
			row.setValue(new MedicalProbOnAdmisVo());
			form.grdProblems().setValue(null);
			form.getContextMenus().getGenericGridRemoveItem().setVisible(false);
		}
		else
			engine.showMessage("Please select a text to be added.");
	}

	protected void onFormModeChanged() 
	{
		boolean b = form.getMode().equals(FormMode.EDIT);
		form.getContextMenus().getMedInjuryDetailsTextBoxAddToProblemItem().setVisible(b);
		form.getContextMenus().getGenericGridAddItem().setVisible(b);
	}
	
	private void populateSystemReview()
	{
		String reviewHeadings = "";
		SystemReviewHeadingsCollection sysReviewColl = LookupHelper.getSystemReviewHeadings(domain.getLookupService());
		if(sysReviewColl != null)
		{
			 for(int i=0; i<sysReviewColl.size(); i++)
			 {
			 	reviewHeadings +=sysReviewColl.get(i).getText() + LINESEPARATOR;
			 }
		}
		form.txtSystemReview().setValue(reviewHeadings);		
	}

	protected void onGrdProblemsSelectionChanged() throws PresentationLogicException 
	{
		if(form.getMode().equals(FormMode.EDIT))
		{			
			form.getContextMenus().getGenericGridRemoveItem().setVisible(true);			
		}
		setProblemsRemoveVisibility();		
	}
	
	protected void onContextMenuItemClick(int menuItemID, Control sender) throws PresentationLogicException 
	{
		if (sender.equals(form.grdProblems()))
		{
			switch(menuItemID)
			{
				case GenForm.ContextMenus.GenericGrid.Add:
					newProblem();
					break;
				case GenForm.ContextMenus.GenericGrid.Remove:
					removeProblem();
					setProblemsRemoveVisibility();
					break;
			}
		}
		else if (sender.equals(form.txtSystemReview()))
		{
			switch (menuItemID)
			{
				case GenForm.ContextMenus.MedInjuryDetailsTextBox.AddToProblem:
					newProblemFromtxtSystemReview();
					break;
			}
		}
	}
	
	
	private void setProblemsRemoveVisibility()
	{
		boolean bVisible = 	form.grdProblems().getSelectedRowIndex() != -1 && 
							form.getMode().equals(FormMode.EDIT);
						   
		form.getContextMenus().getGenericGridRemoveItem().setVisible(bVisible);
	}


	//wdev-13512
	protected void onRIEDialogClosed(DialogResult result)throws PresentationLogicException 
	{
		if(result.equals(DialogResult.OK))
		{
			
			MedicalProbOnAdmisVoCollection tempProbColl = new MedicalProbOnAdmisVoCollection(); //wdev-13525
			for(int i = 0;form.getLocalContext().getadmisSysReviewRecord().getProblemsOnAdmissionIsNotNull() &&  i < form.getLocalContext().getadmisSysReviewRecord().getProblemsOnAdmission().size();i++) //wdev-13525
			{
				if(Boolean.TRUE.equals(form.getLocalContext().getadmisSysReviewRecord().getProblemsOnAdmission().get(i).getIsActive()))
					tempProbColl.add(form.getLocalContext().getadmisSysReviewRecord().getProblemsOnAdmission().get(i));
			}
			if(tempProbColl.size() < 1)
				return;
			try 
			{
				
				domain.saveProblemsAdmis(tempProbColl); //wdev-13525
			}
			catch (StaleObjectException e) 
			{
				engine.showMessage(ims.configuration.gen.ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
			} 
			catch (UniqueKeyViolationException e) 
			{
				engine.showMessage(e.getMessage());
			}
		}
		
	}


	
	
	
	
	
	
}
