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
package ims.clinical.forms.prescriptiondialog;

import ims.configuration.gen.ConfigFlag;
import ims.core.vo.MedicationLiteVo;
import ims.core.vo.MedicationLiteVoCollection;
import ims.core.vo.PatientMedicationLiteVo;
import ims.core.vo.lookups.Specialty;
import ims.framework.enumerations.DialogResult;
import ims.framework.exceptions.PresentationLogicException;
import ims.framework.utils.Color;

import java.util.ArrayList;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;
	
	private static final Integer NO_CODE_ITEM_SELECTED_ID = new Integer(-1);
	private static final String	NO_CODE_ITEM_SELECTED	= "Medication not listed here";		
	
	@Override
	protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException
	{
		initialize(args);//WDEV-14054 //WDEV-18980
		open();//	WDEV-14054
		updateControlsState();//	WDEV-14054
	}

	//WDEV-14054 //WDEV-18980
	private void initialize(Object[] args)
	{
		form.getLocalContext().setPrescribedMedication(null);
		if (args != null && args.length > 0)//WDEV-18980
		{
			if (args.length >= 1 && args[0] != null && args[0] instanceof PatientMedicationLiteVo)
				form.getLocalContext().setPrescribedMedication((PatientMedicationLiteVo) args[0]);
			form.getGlobalContext().RefMan.setPrescriptionMedication(null);
		}
		form.qmbMedication().setFocus();
		form.getLocalContext().setbAllowFreeTextMedication(ConfigFlag.GEN.PRESCRIPTION_ALLOW_FREETEXT_MEDICATION.getValue()); //WDEV-18980		
	}

	//	WDEV-14054
	private void open()
	{		
		populateScreenFromData(form.getLocalContext().getPrescribedMedication() != null ? form.getLocalContext().getPrescribedMedication() : form.getGlobalContext().RefMan.getPrescriptionMedication()); //WDEV-18980 
	}

	//	WDEV-14054 ////WDEV-18980
	private void populateScreenFromData(PatientMedicationLiteVo medication)
	{
		clearScreen();
		
		if(medication == null)
			return;
		if (medication.getMedication() != null)
		{	
			form.qmbMedication().newRow(medication.getMedication(),medication.getMedication().getMedicationName());
			form.qmbMedication().setValue(medication.getMedication());
		}
		else
		{	
			addGenericMedicationRow(true);
		}	
		form.txtOtherMed().setValue(medication.getMedication() != null ? null: medication.getOtherMedicationText());
		form.cmbFrequency().setValue(medication.getFrequency());
		form.intNoOfDaysSupply().setValue(medication.getNoDaysSupply());
	}

	//	WDEV-14054
	private void clearScreen()
	{
		form.qmbMedication().clear();
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
		form.getGlobalContext().Emergency.setPrescriptionDrug(medicationData);
		
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
		
		if (form.getLocalContext().getPrescribedMedication() != null) //WDEV-18980
		{
			voPatientMedicationLite = (PatientMedicationLiteVo) form.getLocalContext().getPrescribedMedication() .clone();
		}
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
		voPatientMedicationLite.setOtherMedicationText(getOtherMedicationTextToSave());
		voPatientMedicationLite.setFrequency(form.cmbFrequency().getValue());
		voPatientMedicationLite.setNoDaysSupply(form.intNoOfDaysSupply().getValue());
									
		return voPatientMedicationLite;
	}
	
	//	WDEV-14054
	@Override
	protected void onQmbMedicationValueChanged() throws PresentationLogicException
	{
		if (form.qmbMedication().getValue() == null || !NO_CODE_ITEM_SELECTED_ID.equals(form.qmbMedication().getValue().getID_Medication()))
			form.txtOtherMed().setValue(null);
		setDefaultValues();
		updateControlsState();		
	}
	
	private String getOtherMedicationTextToSave() //WDEV-18980
	{
		return form.qmbMedication().getValue() != null ? NO_CODE_ITEM_SELECTED_ID.equals(form.qmbMedication().getValue().getID_Medication()) ? form.txtOtherMed().getValue() : form.qmbMedication().getValue().getMedicationName() : null;
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
		form.qmbMedication().setEnabled(form.getLocalContext().getPrescribedMedication() == null && form.getGlobalContext().RefMan.getPrescriptionMedication() == null);
		updateOtherMedicationControlsState(Boolean.TRUE.equals(form.getLocalContext().getbAllowFreeTextMedication()));//WDEV-18980
		form.cmbFrequency().setEnabled(form.qmbMedication().getValue() != null);
		form.intNoOfDaysSupply().setEnabled(form.qmbMedication().getValue() != null);
	}

	private void updateOtherMedicationControlsState(boolean showOtherControls)//WDEV-18980
	{
		form.lblOtherMeds().setVisible(showOtherControls);
		form.txtOtherMed().setVisible(showOtherControls);
		form.txtOtherMed().setEnabled(showOtherControls && form.qmbMedication().getValue() != null && NO_CODE_ITEM_SELECTED_ID.equals(form.qmbMedication().getValue().getID_Medication()));
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
		
		boolean excludeControlledDrugs = ConfigFlag.GEN.PRESCRIPTION_EXCLUDE_CONTROLLED_DRUGS_ON_SEARCH.getValue(); //WDEV-18980
		
		String drugsAlreadyInPresc = form.getGlobalContext().RefMan.getDrugsAlreadyAddedToPrescription() != null ? form.getGlobalContext().RefMan.getDrugsAlreadyAddedToPrescription() : getListofExistingMeds();
		MedicationLiteVoCollection listMedications = domain.listMedications(value, drugsAlreadyInPresc, getSpecialty(),excludeControlledDrugs); //WDEV-18980
		
		if (listMedications == null || listMedications.size() == 0)
		{
			addGenericMedicationRow(false);	
			form.qmbMedication().showOpened(); //WDEV-18980
			return;
		}
		for (int i = 0 ; i < listMedications.size() ; i++)
		{
			form.qmbMedication().newRow(listMedications.get(i),listMedications.get(i).getMedicationName());
		}
		addGenericMedicationRow(false);	//WDEV-18980
		form.qmbMedication().showOpened();
	}
	
	private String getListofExistingMeds()
	{
		if (form.getGlobalContext().Emergency.getMedsAlreadyAddedInPrescription() == null || form.getGlobalContext().Emergency.getMedsAlreadyAddedInPrescription().size() == 0)
			return null;
		
		ArrayList<Integer> idList = form.getGlobalContext().Emergency.getMedsAlreadyAddedInPrescription();
		StringBuilder textualIDList = new StringBuilder();
		String commaStr =""; //WDEV-19179
		
		for (Integer myID : idList)
		{
			if (myID == null)
				continue;
			textualIDList.append(commaStr + String.valueOf(myID)); //WDEV-19179
			commaStr = ", "; //WDEV-19179
		}

		return textualIDList.toString().trim();
	}
	private void addGenericMedicationRow(boolean canSetValue) {
		if (Boolean.TRUE.equals(form.getLocalContext().getbAllowFreeTextMedication())) //WDEV-18980
		{
			MedicationLiteVo genericMedicationVo = getGenericRowMedicationRecord();
			form.qmbMedication().newRow(genericMedicationVo,genericMedicationVo.getMedicationName(), Color.Red);
			if (canSetValue)
				form.qmbMedication().setValue(genericMedicationVo);
		}
	}
	
	private MedicationLiteVo getGenericRowMedicationRecord()
	{
		MedicationLiteVo voMedicationConfig = new MedicationLiteVo();
		
		voMedicationConfig.setID_Medication(new Integer(NO_CODE_ITEM_SELECTED_ID));
		voMedicationConfig.setMedicationName(NO_CODE_ITEM_SELECTED);
		
		return voMedicationConfig;
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
