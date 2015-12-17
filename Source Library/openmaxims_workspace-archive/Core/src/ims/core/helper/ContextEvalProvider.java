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
package ims.core.helper;

import java.util.ArrayList;

import ims.alerts.PatientAlert;
import ims.alerts.PatientAllergy;
import ims.alerts.PatientInfo;
import ims.configuration.gen.ConfigFlag;
import ims.core.admin.domain.objects.CareContext;
import ims.core.admin.domain.objects.ClinicalContact;
import ims.core.admin.domain.objects.EpisodeOfCare;
import ims.core.domain.Demographics;
import ims.core.domain.impl.DemographicsImpl;
import ims.core.patient.vo.PatientRefVo;
import ims.core.vo.domain.CareContextShortVoAssembler;
import ims.core.vo.domain.EpisodeofCareShortVoAssembler;
import ims.domain.SessionData;
import ims.domain.exceptions.DomainRuntimeException;
import ims.framework.cn.TopButtonConfig;
import ims.framework.interfaces.IContextEvalProvider;
import ims.framework.interfaces.ITopButton;
import ims.framework.interfaces.ITopButtonSection;
import ims.vo.ValueObjectRef;

public class ContextEvalProvider extends BaseContextEvalProvider implements IContextEvalProvider
{
	private static final long serialVersionUID = 1L;

	public void setPatientInfoAndIcons(ValueObjectRef refVo)
	{
		SessionData sessData = getSessionData();
		ims.core.vo.Patient voPat = null;
		
		if (refVo != null)
		{
			Demographics demog = (Demographics)getDomainImpl(DemographicsImpl.class);
			voPat = demog.getPatient((PatientRefVo)refVo);			
		}
		
		//restrictPatientAccess is set only by web service
		boolean restrictPatient = Boolean.valueOf(sessData.restrictPatientAccess.get());
		if (voPat != null && restrictPatient)
		{
			Integer patientId = sessData.restrictPatientId.get();
			if (patientId > 0)
			{
				if (Boolean.FALSE.equals(patientId.equals(voPat.getID_Patient())))
				{						
					throw new DomainRuntimeException("Patient Context cannot be changed!!");					
				}
			}
		}	
		
		sessData.clearAlertsByType(PatientInfo.class);
		sessData.clearAlertsByType(PatientAlert.class);
		sessData.clearAlertsByType(PatientAllergy.class);
		
		//Update status for TopButtons Patient Context dependent
		updateTopButtonsStatus(sessData, voPat == null ? true: false);
		
		if (voPat == null)
		{
			sessData.patientInfo.set(null);			
		}
		else
		{						
			sessData.patientId.set(voPat.getID_Patient());
			sessData.patientInfo.set(voPat.getPatientInfo());
			sessData.patientInfoTextColor.set("");
			if (voPat.getIsDead() != null && voPat.getIsDead().booleanValue())
			{
				sessData.patientInfoTextColor.set(ConfigFlag.UI.RIP_INFO_COLOUR.getValue().toString());
			}

			// Replaced code removede in version 12 of this file with code in Version 11 - WDEV-3595
			sessData.addAlert(new PatientInfo(voPat.getPatientInfoButtonText()));
			
			if (voPat.getHasAlerts() != null && voPat.getHasAlerts().booleanValue())
				sessData.addAlert(new PatientAlert("The patient has alerts."));
			if (voPat.getHasAllergies() != null && voPat.getHasAllergies().booleanValue())
				sessData.addAlert(new PatientAllergy("The patient has allergies."));
		}
		
		// wdev-2689 If the read audit functionality is switched on, we want to record
		// the fact that this new patient was read
		if (refVo != null)
		{
			recordReadAudit(refVo, "Patient Demographics");
		}
	}
	
	public void updateTopButtonsStatus(SessionData sessData, boolean enabled)
	{	    	   		
		ims.framework.TopButtonConfig topButtonConfig = (ims.framework.TopButtonConfig)sessData.topButtons.get();	    		    	
		for (int i = 0; i < topButtonConfig.getITopButtonConfigButtons().length; i++) 
		{							
			ITopButton topButton = topButtonConfig.getITopButtonConfigButtons()[i];
			if (topButton.getITopButtonContextDependent())
			{
				topButton.setITopButtonEnabled(enabled);
			}
							
			sessData.topButtons.set(new TopButtonConfig(topButtonConfig));
		}
		
		for (int i = 0; i < topButtonConfig.getITopButtonConfigSections().length; i++) 
		{				
			ITopButtonSection topButtonSelection = topButtonConfig.getITopButtonConfigSections()[i];
			for (int j = 0; j < topButtonSelection.getITopButtonSectionButtons().length; j++) 
			{
				ITopButton topButton = topButtonSelection.getITopButtonSectionButtons()[j];
				if (topButton.getITopButtonContextDependent())
				{
					topButton.setITopButtonEnabled(enabled);
				}
			}
					
			sessData.topButtons.set(new TopButtonConfig(topButtonConfig));
		}
	}    
	
	public ValueObjectRef getPatientForEpisodeOfCare(ValueObjectRef refVo)
	{
		EpisodeOfCare epis = (EpisodeOfCare)this.getDomainFactory().getDomainObject(EpisodeOfCare.class, refVo.getBoId());
		if (epis == null)
			throw new DomainRuntimeException("Invalid EpisodeOfCare refVo passed into getPatientForEpisodeOfCare. ");
		
		PatientRefVo patRef = new PatientRefVo(epis.getCareSpell().getPatient().getId(), epis.getCareSpell().getPatient().getVersion());
		Demographics demog = (Demographics)getDomainImpl(DemographicsImpl.class);
		return demog.getPatient(patRef);			
	}

	public ValueObjectRef getCareContextForClinicalContact(ValueObjectRef refVo)
	{
		ClinicalContact con = (ClinicalContact)this.getDomainFactory().getDomainObject(ClinicalContact.class, refVo.getBoId());
		if (con == null)
			throw new DomainRuntimeException("Invalid ClinicalContact refVo passed into getCareContextForClinicalContact. ");

		CareContext ctx = (CareContext)this.getDomainFactory().getDomainObject(CareContext.class, con.getCareContext().getId());
		if (ctx == null)
			throw new DomainRuntimeException("CareContext not found for ClinicalContact passed into getCareContextForClinicalContact");
		
		return CareContextShortVoAssembler.create(ctx);	
	}

	public ValueObjectRef getEpisodeOfCareForCareContext(ValueObjectRef refVo)
	{
		CareContext ctx = (CareContext)this.getDomainFactory().getDomainObject(CareContext.class, refVo.getBoId());
		if (ctx == null)
			throw new DomainRuntimeException("Invalid CareContext refVo passed into getEpisodeOfCareForCareContext. ");
		
		EpisodeOfCare epis = (EpisodeOfCare)this.getDomainFactory().getDomainObject(EpisodeOfCare.class, ctx.getEpisodeOfCare().getId());
		if (epis == null)
			throw new DomainRuntimeException("EpisodeOfCare not found for  CareContext passed into getEpisodeOfCareForCareContext");

		return EpisodeofCareShortVoAssembler.create(epis);	
	}

	public void execute(ValueObjectRef refVo) 
	{	
		SessionData sessData = getSessionData();
		ims.core.vo.Patient voPat = null;
		
		if (refVo != null)
		{
			Demographics demog = (Demographics)getDomainImpl(DemographicsImpl.class);
			voPat = demog.getPatient((PatientRefVo)refVo);			
		}
		
		if (refVo == null || (sessData.patientId.get() != null && (voPat.getID_Patient() !=  sessData.patientId.get())))
		{		
			ArrayList<Integer> urlsID = sessData.urlToClose.get();		
		    if(urlsID == null)
		      	urlsID = new ArrayList<Integer>();
		  
		    ArrayList<Integer> urlsToCloseOnContextChanged = sessData.urlToCloseOnContextChanged.get();
		    if (urlsToCloseOnContextChanged != null && urlsToCloseOnContextChanged.size() > 0)
		    {
		    	for (int i = 0; i < urlsToCloseOnContextChanged.size(); i++) 
		    	{
		    		urlsID.add(urlsToCloseOnContextChanged.get(i));
				}
		    	 
		    	sessData.urlToClose.set(urlsID);
		    }
		}
	}	
}
