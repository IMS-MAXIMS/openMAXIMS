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
// This code was generated by Cornel Ventuneac using IMS Development Environment (version 1.80 build 4342.23748)
// Copyright (C) 1995-2012 IMS MAXIMS. All rights reserved.

package ims.emergency.forms.systemreviewconfiguration;


import ims.clinical.vo.ClinicalProblemVo;
import ims.clinical.vo.ClinicalProblemVoCollection;
import ims.clinical.vo.lookups.BodySystemCollection;
import ims.clinical.vo.lookups.LookupHelper;
import ims.configuration.gen.ConfigFlag;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.exceptions.UniqueKeyViolationException;
import ims.emergency.forms.systemreviewconfiguration.GenForm.grdProblemRow;
import ims.emergency.vo.SystemReviewForPresentingProblemConfigVo;
import ims.framework.enumerations.FormMode;
import ims.framework.exceptions.PresentationLogicException;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	
	protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException
	{
		initialize();
		open();
	}
	private void initialize()
	{
		form.getLocalContext().setProblemSearchFilter(null);
		form.getLocalContext().setSelectedRow(null);
	}
	protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException
	{
		form.getLocalContext().setProblemSearchFilter(form.grdProblem().getSelectedRow()!= null?form.grdProblem().getSelectedRow().getValue().getPCName():null);
		//form.getLocalContext().setSelectedRow(form.grdProblem().getSelectedRow()!= null?form.grdProblem().getSelectedRow().getValue():null);
		open();
	}
	
	protected void onBtnSaveClick() throws ims.framework.exceptions.PresentationLogicException
	{
		if(	save())
			open();
	}
	private boolean save()
	{
		
		SystemReviewForPresentingProblemConfigVo record = populateDataFromScreen(form.getLocalContext().getCurrentSystemReviewForPreviewConfigurationVo());
		String[] errors = record.validate();
		
		form.getLocalContext().setProblemSearchFilter((record != null && record.getProblemIsNotNull())?record.getProblem().getPCName():null);
		form.getLocalContext().setSelectedRow(form.grdProblem().getSelectedRow()!= null?form.grdProblem().getSelectedRow().getValue():null);
		
		if(errors != null && errors.length > 0)
		{
			engine.showErrors(errors);			
			return false;
		}
		try 
		{
			domain.save(record);
		}
		catch (StaleObjectException e) 
		{
			engine.showMessage(ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
		}
		catch (UniqueKeyViolationException e) 
		{
			engine.showErrors(new String[] { "Another user has just entered a Symptom  record for selected problem. The screen will be refreshed." });
			
		}
		return true;
		
	}
	private SystemReviewForPresentingProblemConfigVo populateDataFromScreen(SystemReviewForPresentingProblemConfigVo record)
	{
		if(	record == null)
			return null;
		if(	record.getProblem() == null)
			record.setProblem(form.grdProblem().getSelectedRow().getValue());
		
		
		BodySystemCollection symColl = new BodySystemCollection();
		
		for(int i = 0; i < form.grdSymptoms().getRows().size();i++)
		{
			if(	form.grdSymptoms().getRows().get(i).getColumnSelect() == true)
				symColl.add(form.grdSymptoms().getRows().get(i).getValue());
		}
		record.setSystem(symColl);
		
		return record;
	}
	
	protected void onBtnEditClick() throws ims.framework.exceptions.PresentationLogicException
	{
		form.setMode(FormMode.EDIT);
	}
	
	protected void onBtnSearchClick() throws ims.framework.exceptions.PresentationLogicException
	{
		clearDetails();
		search();
		updateControlsState();
		
	}
	protected void onFormModeChanged()
	{
		updateControlsState();
	}
	
	private void open()
	{
		
		clear();
		if(form.getLocalContext().getProblemSearchFilterIsNotNull())
		{
			form.txtProblem().setValue(form.getLocalContext().getProblemSearchFilter());
			
			search();
			
			if(	form.getLocalContext().getSelectedRow() != null)
			{
				form.grdProblem().setValue(form.getLocalContext().getSelectedRow());
				grdProblemChanged();
			}
		}
		form.setMode(FormMode.VIEW);
	}
	private void clear()
	{
		clearDetails();
		form.txtProblem().setValue(null);
		
	}
	private void clearDetails()
	{
		form.grdProblem().getRows().clear();
		form.grdSymptoms().getRows().clear();
		form.lblTextOfProblem().setValue(null);
	}
	private void updateControlsState()
	{
		if(form.getMode().equals(FormMode.VIEW))
		{
			form.btnEdit().setVisible(true);
			form.btnEdit().setEnabled(form.grdProblem().getSelectedRow() != null);
		}
	}
	private void search()
	{
		ClinicalProblemVoCollection tempColl = null;
		try 
		{
			tempColl = domain.listClinicalProblems(form.txtProblem().getValue());
		}
		catch (DomainInterfaceException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}
		populateProblemGrid(tempColl);
		
	}
	private void populateProblemGrid(ClinicalProblemVoCollection tempColl)
	{
		form.grdProblem().getRows().clear();
		if(	tempColl == null || tempColl.size() == 0)
		{
			engine.showMessage("No records found ");
			return;
		}
		for(int i = 0; i < tempColl.size();i++)
		{
			ClinicalProblemVo tempVo = tempColl.get(i);
			if(	tempVo != null)
			{
				grdProblemRow row = form.grdProblem().getRows().newRow();
				row.setColumnProblem(tempVo.getPCName());
				row.setValue(tempVo);
				
				
			}
		}
	}

	
	protected void onGrdProblemSelectionChanged() throws PresentationLogicException 
	{
		grdProblemChanged();
	}
	private void grdProblemChanged()
	{
		if(form.grdProblem().getSelectedRow() != null )
		{
			form.lblTextOfProblem().setValue(form.grdProblem().getSelectedRow().getValue().getPCName());
			form.getLocalContext().setSelectedRow(form.grdProblem().getSelectedRow().getValue());
			SystemReviewForPresentingProblemConfigVo tempVo = domain.gettSystemReviewConfigurationVo(form.grdProblem().getSelectedRow().getValue());
			
			if( tempVo == null)
				form.getLocalContext().setCurrentSystemReviewForPreviewConfigurationVo(new SystemReviewForPresentingProblemConfigVo());
			else
				form.getLocalContext().setCurrentSystemReviewForPreviewConfigurationVo(tempVo);
			populateSymptomGrid(form.getLocalContext().getCurrentSystemReviewForPreviewConfigurationVo());
			
		}
		updateControlsState();
	}
	private void populateSymptomGrid(SystemReviewForPresentingProblemConfigVo tempVo)
	{
		form.grdSymptoms().getRows().clear();
		BodySystemCollection symptomsCollection = LookupHelper.getBodySystem(domain.getLookupService());
		if(symptomsCollection != null)
		{
			for(int i = 0;i < symptomsCollection.size();i++)
			{
				ims.emergency.forms.systemreviewconfiguration.GenForm.grdSymptomsRow row = form.grdSymptoms().getRows().newRow();
				row.setColumnSymptom(symptomsCollection.get(i).getText());
				row.setColumnSelect(false);
				row.setValue(symptomsCollection.get(i));
			}
		}
		if(tempVo != null && tempVo.getSystemIsNotNull())
		{
			for(int j = 0; j < tempVo.getSystem().size();j++)
			{
				for(int k = 0; k < form.grdSymptoms().getRows().size();k++)
				{
					if(form.grdSymptoms().getRows().get(k).getValue().equals(tempVo.getSystem().get(j)))
					{
						form.grdSymptoms().getRows().get(k).setColumnSelect(true);
					}
				}
			}
		}
	}
	
}
