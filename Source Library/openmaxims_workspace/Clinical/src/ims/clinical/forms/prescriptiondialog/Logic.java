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
package ims.clinical.forms.prescriptiondialog;

import ims.core.vo.MedicationLiteVoCollection;
import ims.core.vo.PatientMedicationLiteVo;
import ims.core.vo.lookups.Specialty;
import ims.framework.enumerations.DialogResult;
import ims.framework.exceptions.PresentationLogicException;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException
	{
		initialize();//WDEV-14054
		open();//	WDEV-14054
		updateControlsState();//	WDEV-14054
	}

	//WDEV-14054
	private void initialize()
	{
		form.qmbMedication().setFocus();
	}

	//	WDEV-14054
	private void open()
	{
		populateScreenFromData();
	}

	//	WDEV-14054
	private void populateScreenFromData()
	{
		clearScreen();
		
		if(form.getGlobalContext().RefMan.getPrescriptionMedication() == null)
			return;
		
		form.qmbMedication().newRow(form.getGlobalContext().RefMan.getPrescriptionMedication().getMedication(),form.getGlobalContext().RefMan.getPrescriptionMedication().getMedication().getMedicationName());
		form.qmbMedication().setValue(form.getGlobalContext().RefMan.getPrescriptionMedication().getMedication());
		form.cmbFrequency().setValue(form.getGlobalContext().RefMan.getPrescriptionMedication().getFrequency());
		form.intNoOfDaysSupply().setValue(form.getGlobalContext().RefMan.getPrescriptionMedication().getNoDaysSupply());
	}

	//	WDEV-14054
	private void clearScreen()
	{
		form.qmbMedication().setValue(null);
		clearDetails();
	}

	//	WDEV-14054
	private void clearDetails()
	{
		form.cmbFrequency().setValue(null);
		form.intNoOfDaysSupply().setValue(null);
	}

	@Override
	protected void onBtnSaveClick() throws ims.framework.exceptions.PresentationLogicException
	{	
		if(save())
			engine.close(DialogResult.OK);					
	}

	//	WDEV-14054
	private boolean save()
	{
		PatientMedicationLiteVo medicationData = populateInstanceData();
		
		String[] errors = medicationData.validate();
		
		if(errors != null && errors.length > 0)
		{
			engine.showErrors(errors);	
			return false;
		}
		
		form.getGlobalContext().RefMan.setPrescriptionMedication(medicationData);
		return true;
	}
		
	@Override
	protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException
	{
		engine.close(DialogResult.CANCEL);
	}
	
	//	WDEV-14054
	private PatientMedicationLiteVo populateInstanceData()
	{
		PatientMedicationLiteVo voPatientMedicationLite = null;
		
		if(form.getGlobalContext().RefMan.getPrescriptionMedication() != null)
		{
			voPatientMedicationLite = (PatientMedicationLiteVo) form.getGlobalContext().RefMan.getPrescriptionMedication().clone();
		}
		
		if(voPatientMedicationLite == null)
		{
			voPatientMedicationLite = new PatientMedicationLiteVo();
		}
		
		voPatientMedicationLite.setPatient(form.getGlobalContext().Core.getPatientShort());
		
		voPatientMedicationLite.setMedication(form.qmbMedication().getValue());
		voPatientMedicationLite.setOtherMedicationText(form.qmbMedication().getValue() != null ? form.qmbMedication().getValue().getMedicationName() : null);
		voPatientMedicationLite.setFrequency(form.cmbFrequency().getValue());
		voPatientMedicationLite.setNoDaysSupply(form.intNoOfDaysSupply().getValue());
									
		return voPatientMedicationLite;
	}
	
	//	WDEV-14054
	@Override
	protected void onQmbMedicationValueChanged() throws PresentationLogicException
	{
		setDefaultValues();
		updateControlsState();
	}
	
	//	WDEV-14054
	private void setDefaultValues()
	{
		clearDetails();
		
		if(form.qmbMedication().getValue() == null)
			return;
		
		form.cmbFrequency().setValue(form.qmbMedication().getValue().getFrequencyDefault());
		form.intNoOfDaysSupply().setValue(form.qmbMedication().getValue().getNoOfDaysSupplyDefault());
	}

	//	WDEV-14054
	private void updateControlsState()
	{
		form.qmbMedication().setEnabled(form.getGlobalContext().RefMan.getPrescriptionMedication() == null);
		form.cmbFrequency().setEnabled(form.qmbMedication().getValue() != null);
		form.intNoOfDaysSupply().setEnabled(form.qmbMedication().getValue() != null);
	}
	
	//	WDEV-14054
	@Override
	protected void onQmbMedicationTextSubmited(String value) throws PresentationLogicException
	{
		populateMedicationQcmb(value);
		setDefaultValues();
		updateControlsState();
	}
	
	//	WDEV-14054
	private void populateMedicationQcmb(String value)
	{
		form.qmbMedication().clear();
		
		MedicationLiteVoCollection listMedications = domain.listMedications(value, form.getGlobalContext().RefMan.getDrugsAlreadyAddedToPrescription(), getSpecialty());
		if (listMedications == null || listMedications.size() == 0)
		{
			form.qmbMedication().showOpened();
			return;
		}
		
		for (int i = 0 ; i < listMedications.size() ; i++)
		{
			form.qmbMedication().newRow(listMedications.get(i),listMedications.get(i).getMedicationName());
		}
		
		form.qmbMedication().showOpened();
	}
	
	private Specialty getSpecialty()
	{
		if ((form.getGlobalContext().Core.getCurrentClinicalContactIsNotNull()) && (form.getGlobalContext().Core.getCurrentClinicalContact().getSpecialtyIsNotNull()))
		{
			return form.getGlobalContext().Core.getCurrentClinicalContact().getSpecialty();
		}
		else if ((form.getGlobalContext().Core.getEpisodeofCareShortIsNotNull()) && (form.getGlobalContext().Core.getEpisodeofCareShort().getSpecialtyIsNotNull()))
		{
			return form.getGlobalContext().Core.getEpisodeofCareShort().getSpecialty();
		}
		
		return null;
	}
}
