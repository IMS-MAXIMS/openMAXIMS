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
package ims.clinical.forms.allergiesdialog;

import ims.clinical.forms.allergiesdialog.GenForm.grpFilterEnumeration;
import ims.clinical.vo.lookups.CodingItemType;
import ims.core.vo.AllergenVo;
import ims.core.vo.AuthoringInformationVo;
import ims.core.vo.HcpLiteVo;
import ims.core.vo.PatientAllergy;
import ims.core.vo.PatientAllergyCollection;
import ims.core.vo.lookups.Specialty;
import ims.framework.enumerations.DialogResult;
import ims.framework.exceptions.CodingRuntimeException;
import ims.framework.exceptions.PresentationLogicException;
import ims.framework.utils.DateTime;
import ims.vo.interfaces.IClinicalCodingValue;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException
	{
		initializeCustomControl();
		setInitialCustomControlCodingSettings();
		initialize();
	}
	private void initialize()
	{
		AuthoringInformationVo voAuthoringInformation=new AuthoringInformationVo();
		voAuthoringInformation.setAuthoringDateTime(new DateTime());
		if (domain.getHcpLiteUser()!=null)
			voAuthoringInformation.setAuthoringHcp((HcpLiteVo) domain.getHcpLiteUser());
		form.cc2().setValue(voAuthoringInformation);
		
		form.grpFilter().setValue(grpFilterEnumeration.rdoAll); //wdev-13763
		
		if (domain.getHcpLiteUser() == null)
		{			
			form.cmbSourceOfInformation().setEnabled(false);
			form.setcc1Enabled(false);
			form.setcc2Enabled(false);
		}
	}
	
	@Override
	protected void onRadioButtongrpFilterValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		form.cc1().setHotlist(!form.grpFilter().getValue().equals(grpFilterEnumeration.rdoSpecialty) ? new Boolean(false) : new Boolean(true));
	}

	@Override
	protected void onBtnSaveClick() throws ims.framework.exceptions.PresentationLogicException
	{
		if (form.cmbSourceOfInformation().getValue() == null)
		{
			engine.showMessage("Source of information is mandatory!", "Validation error");
			return;
		}
		
		PatientAllergy allergyData = populateInstanceData(new PatientAllergy());
		String[] errors = allergyData.validate();
		boolean equals=false;

		if (errors == null)
		{
			if (form.getGlobalContext().Core.getAllergiesAtConsultationIsNotNull() &&
					form.getGlobalContext().Core.getAllergiesAtConsultation().size() > 0)
			{
				for (int i=0; i < form.getGlobalContext().Core.getAllergiesAtConsultation().size();i++)
				{
					PatientAllergy allergy = form.getGlobalContext().Core.getAllergiesAtConsultation().get(i);
					if (allergy != null && allergyData != null)
					{				
						if (allergyData.getID_PatientAllergyIsNotNull()&& allergy.getID_PatientAllergyIsNotNull() && 
								allergyData.getID_PatientAllergy().equals(allergy.getID_PatientAllergy()))
						{			
							PatientAllergyCollection coll= form.getGlobalContext().Core.getAllergiesAtConsultation();
							coll.remove(i);
							coll.add(i,allergyData);
							equals=true;
	
							form.getGlobalContext().Core.setAllergiesAtConsultation(coll);
						}
					}
					if (!equals)
					{
						PatientAllergyCollection coll= form.getGlobalContext().Core.getAllergiesAtConsultation();
						coll.add(allergyData);
						form.getGlobalContext().Core.setAllergiesAtConsultation(coll);
					}
	
				}
			}
			else
			{
				PatientAllergyCollection coll= new PatientAllergyCollection();
				coll.add(allergyData);
				form.getGlobalContext().Core.setAllergiesAtConsultation(coll);
			}
			
			engine.close(DialogResult.OK);
		}
		else
			engine.showErrors(errors);						
	}
		
	@Override
	protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException
	{
		engine.close(DialogResult.CANCEL);
	}
	private void initializeCustomControl()
	{
		form.cc1().setCodingItemType(CodingItemType.ALLERGY);
		form.cc1().setHotlist(new Boolean(true));
		form.cc1().setSpecialty(getSpecialty());
		form.cc1().setClinicalTermMandatory(true);
		form.cc1().setDescriptionMandatory(true);
		form.cc1().setParentEditing(true);

		form.cc2().initializeComponent();
	}


	protected void onCustomControlCodingItemValueChanged() throws PresentationLogicException
	{
		if (form.cc1().isAllSelected() != null && form.cc1().isAllSelected().booleanValue())
		{
			form.cc1().setHotlist(new Boolean(true));
			form.cc1().search();
		}
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
	private void setInitialCustomControlCodingSettings()
	{
		form.cc1().setSearchAllSelected(Boolean.FALSE);
		form.cc1().setHotlist(Boolean.FALSE);    //wdev-13763
	}

	private PatientAllergy populateInstanceData(PatientAllergy voPatientAllergy)
	{
		voPatientAllergy.setIsCurrentlyActiveAllergy(Boolean.TRUE);		
		voPatientAllergy.setSourceofInformation(form.cmbSourceOfInformation().getValue());			
		voPatientAllergy.setPatient(form.getGlobalContext().Core.getPatientShort());
		
		IClinicalCodingValue voResult = form.cc1().getValue();
		if (voResult != null)
		{
			if (voResult.getIClinicalCodingValue() instanceof AllergenVo)
			{
				voPatientAllergy.setAllergen((AllergenVo) voResult.getIClinicalCodingValue());
				voPatientAllergy.setAllergenDescription(voResult.getIClinicalCodingValueDescription());
			}
			else
			{
				throw new CodingRuntimeException("AllergenVo expected from component");
			}
		}
		else 
		{
			voPatientAllergy.setAllergenDescription(null);
		}		
		
		voPatientAllergy.setReactions(null);
		
		voPatientAllergy.setAuthoringInformation(form.cc2().getValue());
		
		return voPatientAllergy;
	}


}
