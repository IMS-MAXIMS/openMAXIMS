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
// This code was generated by Mara Iroaie using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2013 IMS MAXIMS. All rights reserved.

package ims.core.forms.admissiongenderwarningdialog;

import ims.core.vo.AdmissionReasonVo;
import ims.core.vo.enums.BedAdmissionValidationType;
import ims.framework.enumerations.DialogResult;
import ims.framework.exceptions.PresentationLogicException;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void onFormOpen(Object[] args) throws PresentationLogicException
	{
		//form.lblWarningMessage().setValue(form.getGlobalContext().Core.getAdmissionValidationMessage());	
		if (args != null && args.length > 0)
		{
			if (args[0] != null && args[0] instanceof BedAdmissionValidationType)
			{
				form.getLocalContext().setDialogMode((BedAdmissionValidationType) args[0]);
			}
		}
	}

	@Override
	protected void onBtnCancelClick() throws PresentationLogicException
	{
		engine.close(DialogResult.CANCEL);		
	}

	@Override
	protected void onBtnOKClick() throws PresentationLogicException
	{
		if (validateUI(form.getLocalContext().getDialogMode()))
		{
			form.getGlobalContext().Core.setBedRuleBreachReason(populateDateFromScreen(form.getLocalContext().getDialogMode()));
			engine.close(DialogResult.OK);
		}	
	}

	private boolean validateUI(BedAdmissionValidationType dialogMode)
	{
		if (BedAdmissionValidationType.MIXED_GENDER.equals(dialogMode) && form.cmbReason().getValue() == null)
		{
			engine.showErrors(new String[] {"Reason is mandatory."});
			return false;
		}
		return true;
	}
	private AdmissionReasonVo populateDateFromScreen(BedAdmissionValidationType dialogMode)
	{
		AdmissionReasonVo voData = form.getGlobalContext().Core.getBedRuleBreachReason();
		if (voData == null)
			voData = new AdmissionReasonVo();
		if (BedAdmissionValidationType.MIXED_GENDER.equals(dialogMode))
		{	
			voData.setReasonForMixingBayGender(form.cmbReason().getValue());
			voData.setReasonForMixingBayGenderComment(form.txtComments().getValue());
			voData.setValidationType(dialogMode.getIItemText());
			voData.setIsMixingGenderBayValidated(true);
		}	
		
		return voData;
	}
}