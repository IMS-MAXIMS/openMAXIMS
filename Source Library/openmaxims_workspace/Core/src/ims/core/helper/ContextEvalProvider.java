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
package ims.core.helper;

import java.util.ArrayList;
import java.util.List;

import ims.alerts.PatientAlert;
import ims.alerts.PatientAllergy;
import ims.alerts.PatientDementiaStatus;
import ims.alerts.PatientInfo;
import ims.RefMan.vo.CatsReferralRefVo;
import ims.configuration.gen.ConfigFlag;
import ims.core.admin.domain.objects.CareContext;
import ims.core.admin.domain.objects.ClinicalContact;
import ims.core.admin.domain.objects.EpisodeOfCare;
import ims.core.domain.Demographics;
import ims.core.domain.impl.DemographicsImpl;
import ims.core.patient.vo.PatientRefVo;
import ims.core.vo.domain.CareContextShortVoAssembler;
import ims.core.vo.domain.EpisodeofCareShortVoAssembler;
import ims.core.vo.lookups.AlertAccessRights;
import ims.core.vo.lookups.AlertType;
import ims.core.vo.lookups.AlertTypeCollection;
import ims.core.vo.lookups.DementiaWorklistStatus;
import ims.domain.SessionData;
import ims.domain.exceptions.DomainRuntimeException;
import ims.framework.cn.TopButtonConfig;
import ims.framework.interfaces.IAlertsAccess;
import ims.framework.interfaces.IAppRole;
import ims.framework.interfaces.IContextEvalProvider;
import ims.framework.interfaces.ITopButton;
import ims.framework.interfaces.ITopButtonSection;
import ims.framework.utils.DateTime;
import ims.framework.utils.DateTimeFormat;
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
		sessData.clearAlertsByType(PatientDementiaStatus.class);
		
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
			
			if (voPat.getHasAlerts() != null && voPat.getHasAlerts().booleanValue() && hasAlertsForViewOrEdit(voPat))
				sessData.addAlert(new PatientAlert("The patient has alerts."));
			if (voPat.getHasAllergies() != null && voPat.getHasAllergies().booleanValue())
				sessData.addAlert(new PatientAllergy("The patient has allergies."));
			
			if (voPat.getDementiaWorklistStatus() != null 
					&& (DementiaWorklistStatus.STEP_ONE_FIND_OUTSTANDING.equals(voPat.getDementiaWorklistStatus())
							|| DementiaWorklistStatus.STEP_TWO_ASSESS_INVESTIGATE_OUTSTANDING.equals(voPat.getDementiaWorklistStatus())))
				sessData.addAlert(new PatientDementiaStatus(buildDementiaTooltip(voPat.getDementiaWorklistStatus(), voPat.getDementiaBreachDateTime())));
		}
		
		// wdev-2689 If the read audit functionality is switched on, we want to record
		// the fact that this new patient was read
		if (refVo != null)
		{
			recordReadAudit(refVo, "Patient Demographics");
		}
	}
	
	public boolean hasAlertsForViewOrEdit(ims.core.vo.Patient voPat)
	{
		IAppRole role = getSessionData().role.get();
		IAlertsAccess[] alertsAccessList = role.getAlertsAccessList();
		
		AlertTypeCollection alertCategoryColl = new AlertTypeCollection();
		
		for(int i=0; i<alertsAccessList.length; i++)
		{
			IAlertsAccess alertAccess = alertsAccessList[i];
			
			if(alertAccess == null)
				continue;
			
			if(!(alertAccess.getIAlertType() instanceof AlertType) || !(alertAccess.getIAccess() instanceof AlertAccessRights))
				continue;
			
			AlertType alertType = (AlertType) alertAccess.getIAlertType();
			AlertAccessRights access = (AlertAccessRights) alertAccess.getIAccess();
			
			if(AlertAccessRights.READ_ONLY.equals(access) || AlertAccessRights.READ_WRITE.equals(access))
			{
				alertCategoryColl.add(alertType);
			}
		}
		
		if(alertCategoryColl == null || alertCategoryColl.size() == 0)
			return false;
		
		Demographics demog = (Demographics)getDomainImpl(DemographicsImpl.class);
		return demog.hasAlertsForViewOrEdit(voPat, alertCategoryColl);
	}
	
	private String buildDementiaTooltip(DementiaWorklistStatus dementiaWorklistStatus, DateTime dementiaBreachDateTime)
	{
		StringBuilder tooltip = new StringBuilder();
		tooltip.append("<b>Dementia Status:</b> ").append(dementiaWorklistStatus.getText());
		
		if (dementiaBreachDateTime != null)
			tooltip.append("<br><b>Breach date time:</b> ").append(dementiaBreachDateTime.toString(DateTimeFormat.STANDARD));

		return tooltip.toString();
	}
	
	
	public void updateTopButtonsStatus(SessionData sessData, boolean enabled)
	{	    	   		
		//Check if topButtons in session
		if (sessData.topButtons.get() == null)
			return;
		
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
		
		if (refVo == null || voPat == null || (sessData.patientId.get() != null && (voPat.getID_Patient() !=  sessData.patientId.get())))
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

	//http://jira/browse/WDEV-20263
	public ValueObjectRef getReferralCareContextForCareContext(ValueObjectRef refVo) {
		CareContext ctx = (CareContext)this.getDomainFactory().getDomainObject(CareContext.class, refVo.getBoId());
		if (ctx == null)
			throw new DomainRuntimeException("Invalid CareContext refVo passed into getReferralCareContextForCareContext. ");
		
		//get CareSpell
		String epidodeHQL ="select epis.id from CareContext as cc left join cc.episodeOfCare as epis where (cc.id = :careContextID) ";
		List<?> list = this.getDomainFactory().find(epidodeHQL,new String[]{"careContextID"},new Object[]{refVo.getBoId()});
		Integer episodeId = null;
		if(list!=null&&list.size()>0)
		{
			for (Object object : list)
			{
				episodeId= (Integer)object;
			}
			String referralCareContextHQL = "select cc from CareContext as cc left join cc.episodeOfCare as epis  where (cc.context.id = -3076 and epis.id = :episodeID)"; // -3076 == ContextType Referral
			CareContext referralCareContext = (CareContext)this.getDomainFactory().findFirst(referralCareContextHQL,new String[]{"episodeID"},new Object[]{episodeId});
			return CareContextShortVoAssembler.create(referralCareContext);
		}
		else 
		{
			return null;
		}
	}
	
	//WDEV-21070
	public CatsReferralRefVo getCatsReferralForCareContext(ValueObjectRef refVo)
	{
		CareContext ctx = (CareContext)this.getDomainFactory().getDomainObject(CareContext.class, refVo.getBoId());
		if (ctx == null)
			return null;
		String catsReferralQuery = "select cr.id,cr.version from CatsReferral as cr where cr.careContext.id = :careContext";
		List<?> list = this.getDomainFactory().find(catsReferralQuery,new String[]{"careContext"},new Object[]{refVo.getBoId()});
		CatsReferralRefVo catsRefVo = null;
		if(list!=null&&list.size()>0)
		{
			 Object[] values = (Object[])  list.get(0);
//			 catsRefVo = new CatsReferralRefVo((Integer)values[0], (int)values[1]);
			 catsRefVo = new CatsReferralRefVo((Integer)values[0], ((Integer)values[1]).intValue());
		}
		return catsRefVo;
	}
	
}
