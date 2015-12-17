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

import ims.admin.domain.AlertPIDBarConfiguration;
import ims.admin.domain.impl.AlertPIDBarConfigurationImpl;
import ims.alerts.NewResults;
import ims.alerts.PatientAlert;
import ims.alerts.PatientAllergy;
import ims.alerts.PatientInfo;
import ims.configuration.gen.ConfigFlag;
import ims.core.domain.Demographics;
import ims.core.domain.impl.DemographicsImpl;
import ims.core.patient.vo.PatientRefVo;
import ims.domain.SessionData;
import ims.domain.exceptions.DomainRuntimeException;
import ims.framework.enumerations.AlertCategory;
import ims.vo.ValueObjectRef;

import java.util.ArrayList;

/*
 * This ContextEvalProvider is to be used by ALL projects that have the OCS Module.
 * It has the extra alert icon for patients with new results.
 */

public class OcrrContextEvalProvider extends ContextEvalProvider
{
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
		sessData.clearAlertsByType(NewResults.class);
		
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

			// Replaced code removed in version 12 of this file with code in Version 11 - WDEV-3595
			sessData.addAlert(new PatientInfo(voPat.getPatientInfoButtonText()));
										
			AlertPIDBarConfiguration demog = (AlertPIDBarConfiguration)getDomainImpl(AlertPIDBarConfigurationImpl.class);
			ims.admin.vo.AlertPIDBarConfigVo alertPIDBarConfigVo = demog.getAlertPIDBarConfig();
			
			if (voPat.getHasAlertCategory1IsNotNull() && voPat.getHasAlertCategory1().booleanValue() && super.hasAlertsForViewOrEdit(voPat))
				sessData.addAlert(new PatientAlert("The patient has alerts of type " + //WDEV-22647  NPE fix
						(alertPIDBarConfigVo != null && alertPIDBarConfigVo.getAlertCategoryPosition1IsNotNull() ? alertPIDBarConfigVo.getAlertCategoryPosition1().getText() : "1"), AlertCategory.ONE)); 						
			if (voPat.getHasAlertCategory2IsNotNull() && voPat.getHasAlertCategory2().booleanValue() && super.hasAlertsForViewOrEdit(voPat))
				sessData.addAlert(new PatientAlert("The patient has alerts of type " +//WDEV-22647  NPE fix
						(alertPIDBarConfigVo != null && alertPIDBarConfigVo.getAlertCategoryPosition2IsNotNull() ? alertPIDBarConfigVo.getAlertCategoryPosition2().getText() : "2"), AlertCategory.TWO)); 						
			if (voPat.getHasAlertCategory3IsNotNull() && voPat.getHasAlertCategory3().booleanValue() && super.hasAlertsForViewOrEdit(voPat))
				sessData.addAlert(new PatientAlert("The patient has alerts of type " +//WDEV-22647  NPE fix
						(alertPIDBarConfigVo != null && alertPIDBarConfigVo.getAlertCategoryPosition3IsNotNull() ? alertPIDBarConfigVo.getAlertCategoryPosition3().getText() : "3"), AlertCategory.THREE));			
			if (voPat.getHasAlertCategory4IsNotNull() && voPat.getHasAlertCategory4().booleanValue() && super.hasAlertsForViewOrEdit(voPat))
				sessData.addAlert(new PatientAlert("The patient has alerts of type " + //WDEV-22647  NPE fix
						(alertPIDBarConfigVo != null && alertPIDBarConfigVo.getAlertCategoryPosition4IsNotNull() ? alertPIDBarConfigVo.getAlertCategoryPosition4().getText() : "4"), AlertCategory.FOUR));
			if (((voPat.getHasAlertCategoryOtherIsNotNull() && voPat.getHasAlertCategoryOther().booleanValue())) && super.hasAlertsForViewOrEdit(voPat))
				sessData.addAlert(new PatientAlert("The patient has alerts of type Other", AlertCategory.OTHER));
				
			//if (voPat.getHasAlerts() != null && voPat.getHasAlerts().booleanValue() && super.hasAlertsForViewOrEdit(voPat))
			//	sessData.addAlert(new PatientAlert("The patient has alerts."));
			if (voPat.getHasAllergies() != null && voPat.getHasAllergies().booleanValue())
				sessData.addAlert(new PatientAllergy("The patient has allergies."));
			if (voPat.hasPatientNotification())
				sessData.addAlert(new NewResults("The patient has new results."));
		}
		
		// wdev-2689 If the read audit functionality is switched on, we want to record
		// the fact that this new patient was read
		if (refVo != null)
		{
			recordReadAudit(refVo, "Patient Demographics");
		}
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
}
