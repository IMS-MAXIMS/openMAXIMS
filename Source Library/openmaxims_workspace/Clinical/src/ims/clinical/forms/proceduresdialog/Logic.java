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
package ims.clinical.forms.proceduresdialog;

import ims.clinical.forms.proceduresdialog.GenForm.grpFilterEnumeration;
import ims.clinical.vo.lookups.CodingItemType;
import ims.core.vo.AuthoringInformationVo;
import ims.core.vo.HcpLiteVo;
import ims.core.vo.PatientProcedureShortVo;
import ims.core.vo.PatientProcedureShortVoCollection;
import ims.core.vo.ProcedureLiteVo;
import ims.core.vo.lookups.PatientProcedureStatus;
import ims.core.vo.lookups.SourceofInformation;
import ims.core.vo.lookups.Specialty;
import ims.framework.enumerations.DialogResult;
import ims.framework.enumerations.FormMode;
import ims.framework.exceptions.CodingRuntimeException;
import ims.framework.exceptions.PresentationLogicException;
import ims.framework.utils.Date;
import ims.framework.utils.DateTime;
import ims.framework.utils.PartialDate;
import ims.vo.interfaces.IClinicalCodingValue;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException
	{
		initializeCustomControl();
		initialize();
		form.cc1().search("");
	}
	private void initialize()
	{
		AuthoringInformationVo voAuthoringInformation=new AuthoringInformationVo();
		voAuthoringInformation.setAuthoringDateTime(new DateTime());
		if (domain.getHcpLiteUser()!=null)
			voAuthoringInformation.setAuthoringHcp((HcpLiteVo) domain.getHcpLiteUser());
		form.cc2().setValue(voAuthoringInformation);
		form.pdt1().setValue(new PartialDate(new Date()));
		
		form.grpFilter().setValue(grpFilterEnumeration.rdoSpecialty);
		
		if (domain.getHcpLiteUser() == null)
		{			
			form.pdt1().setEnabled(false);
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
		if (form.pdt1().getValue() == null)
		{
			engine.showMessage("Performed Date  is mandatory!", "Validation error");
			return;
		}
		
		PatientProcedureShortVo procedureData = populateInstanceData(new PatientProcedureShortVo());
		String[] errors = procedureData.validate();
		boolean equals=false;

		if (errors == null)
		{
			if (form.getGlobalContext().Core.getProceduresAtConsultationIsNotNull() &&
					form.getGlobalContext().Core.getProceduresAtConsultation().size() > 0)
			{
				for (int i=0; i < form.getGlobalContext().Core.getProceduresAtConsultation().size();i++)
				{
					PatientProcedureShortVo procedure = form.getGlobalContext().Core.getProceduresAtConsultation().get(i);
					if (procedure != null && procedureData != null)
					{				
						if (procedureData.getID_PatientProcedureIsNotNull()&& procedure.getID_PatientProcedureIsNotNull() && 
								procedureData.getID_PatientProcedure().equals(procedure.getID_PatientProcedure()))
						{			
							PatientProcedureShortVoCollection coll= form.getGlobalContext().Core.getProceduresAtConsultation();
							coll.remove(i);
							coll.add(i,procedureData);
							equals=true;
	
							form.getGlobalContext().Core.setProceduresAtConsultation(coll);
						}
					}
					if (!equals)
					{
						PatientProcedureShortVoCollection coll= form.getGlobalContext().Core.getProceduresAtConsultation();						
						coll.add(procedureData);
						form.getGlobalContext().Core.setProceduresAtConsultation(coll);
					}
				}
			}
			else
			{
				PatientProcedureShortVoCollection coll= new PatientProcedureShortVoCollection();
				coll.add(procedureData);
				form.getGlobalContext().Core.setProceduresAtConsultation(coll);
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
		//WDEV-11535
		form.cc1().setCodingItemType(CodingItemType.PROCEDURE);		
		form.cc1().setHotlist(new Boolean(true));		
		form.cc1().setSpecialty(getSpecialty());
		form.cc1().setSearchAllSelected(Boolean.FALSE);
		form.cc1().setHotlist(Boolean.TRUE);
		
		form.cc1().setClinicalTermMandatory(true);
		form.cc1().setDescriptionMandatory(true);
		form.cc1().setParentEditing(true);		
		form.cc1().setMode(FormMode.EDIT);				
		
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

	private PatientProcedureShortVo populateInstanceData(PatientProcedureShortVo voPatientProcedureShort)
	{
		voPatientProcedureShort.setEpisodeOfCare(form.getGlobalContext().Core.getEpisodeofCareShort());
		voPatientProcedureShort.setCareContext(form.getGlobalContext().Core.getCurrentCareContext());		
		voPatientProcedureShort.setInfoSource(SourceofInformation.CLINICALCONTACT);
		voPatientProcedureShort.setProcDate(form.pdt1().getValue());
		voPatientProcedureShort.setProcedureStatus(PatientProcedureStatus.PERFORMED); //wdev-10552
		
		IClinicalCodingValue voResult = form.cc1().getValue();
		if (voResult != null)
		{
			if (voResult.getIClinicalCodingValue() instanceof ProcedureLiteVo)
			{
				voPatientProcedureShort.setProcedure((ProcedureLiteVo) voResult.getIClinicalCodingValue());
				voPatientProcedureShort.setProcedureDescription(voResult.getIClinicalCodingValueDescription());
			}
			else
			{
				throw new CodingRuntimeException("ProcedureLiteVo expected from component");
			}
		}
		else 
		{
			voPatientProcedureShort.setProcedureDescription(null);
		}		
						
		voPatientProcedureShort.setAuthoringInformation(form.cc2().getValue());
		
		return voPatientProcedureShort;
	}

	//WDEV-11535
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
	//wdev-13784
	protected void onCc1ValueChanged() throws PresentationLogicException 
	{
		if (form.cc1().isAllSelected() != null && form.cc1().isAllSelected().booleanValue())
		{
			form.grpFilter().setValue(grpFilterEnumeration.rdoAll);
			form.cc1().setHotlist(false);
			form.cc1().search();
		}
		
	}

}
