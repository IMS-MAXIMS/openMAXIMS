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
package ims.clinicaladmin.helper;

import java.util.ArrayList;
import java.util.List;

import ims.admin.vo.MenuActionVo;
import ims.clinical.configuration.domain.objects.WorkflowInternalReferrals;
import ims.clinical.vo.AppFormForInternalReferralsVo;
import ims.clinical.vo.domain.AppFormForInternalReferralsVoAssembler;
import ims.clinical.vo.lookups.ClinicalReferralType;
import ims.clinicaladmin.vo.WorkflowActionInternalReferalVo;
import ims.clinicaladmin.vo.WorkflowInternalReferralsVo;
import ims.clinicaladmin.vo.domain.WorkflowInternalReferralsVoAssembler;
import ims.core.configuration.domain.objects.AppForm;
import ims.core.vo.enums.InternalReferralStatusAction;
import ims.core.vo.lookups.InternalReferralStatus;
import ims.domain.impl.DomainImpl;
import ims.framework.interfaces.IAppRole;


public class InternalReferralActionsHelper extends DomainImpl implements IInternalReferralActionsHelper
{
	private static final long serialVersionUID = 1L;
	
	
	public static final int MENU_ACTION_EDIT							= 1;
	public static final int MENU_ACTION_ATTACH_REFERRAL_LETTER			= 2;
	public static final int MENU_ACTION_SIGN_OFF						= 3;
	public static final int MENU_ACTION_REQUIRES_FURTHER_INFORMATION	= 4;
	public static final int MENU_ACTION_RECORD_FURTHER_INFORMATION		= 5;
	public static final int MENU_ACTION_ACCEPT							= 6;
	public static final int MENU_ACTION_SECOND_OPINION_REQUIRED			= 7;
	public static final int MENU_ACTION_ACCEPT_APPOINTMENT_REQUIRED		= 8;
	public static final int MENU_ACTION_APPOINTMENT_BOOKED				= 9;
	public static final int MENU_ACTION_COMPLETE_ADD_NOTE				= 10;
	public static final int MENU_ACTION_COMPLETE_LINK_CORRESPONDENCE	= 11;
	public static final int MENU_ACTION_REJECT							= 12;
	public static final int MENU_ACTION_REJECTION_ACKNOWLEDGED			= 13;

	private static final int VIEW_REFERRAL = 5610001;
	private static final int EDIT_REFERRAL = 5610002;
	private static final int REQUIRES_FURTHER_INFORMATION = 5610004;
	private static final int SECOND_OPINION_REQUIRED = 5610005;
	private static final int RECORD_FURTHER_INFORMATION = 5610006;
	private static final int ACCEPT_REFERRAL = 5610007;
	
	private static final int ACCEPT_APPOINTMENT_REQUIRED = 5610008;
	private static final int APPOINTMENT_BOOKED = 5610009;
	private static final int SIGN_OFF = 5610010;
	private static final int REJECT = 5610011;
	private static final int RIE = 5610012;
	private static final int NEW_REFERRAL = 5610013;
	
	private static final int REJECT_ACKNOWLEDGED = 5610014;
	private static final int COMPLETE_ADD_NOTE = 5610015;
	private static final int INTERNAL_REFERRAL_ADMIN_EVENT = 5610016;
	private static final int COMPLETE_LINK_CORRESPONDENCE = 5610017;
	
	/**
	 * 
	 */
	WorkflowInternalReferralsVo workflowInternalReferrals;
	AppFormForInternalReferralsVo appForm;
	
	
	public InternalReferralActionsHelper initializeInternalReferralActionsHelper()
	{
		return initializeInternalReferralActionsHelper(null);
	}
	
	public InternalReferralActionsHelper initializeInternalReferralActionsHelper(Integer appFormId)
	{
		// get the Internal Referral Actions from database
		String query = "SELECT workflow FROM WorkflowInternalReferrals AS workflow";
		this.workflowInternalReferrals = WorkflowInternalReferralsVoAssembler.create((WorkflowInternalReferrals) getDomainFactory().findFirst(query));
		
		if(appFormId != null)
		{
			AppForm domainObject = (AppForm)getDomainFactory().getDomainObject(AppForm.class, appFormId);
			this.appForm = AppFormForInternalReferralsVoAssembler.create(domainObject);
		}
		
		return this;
	}
	
	
	/**
	 * 
	 * @param referralStatus
	 * @param referralType
	 * @param action
	 * @return
	 */
	public boolean getActionState(InternalReferralStatus referralStatus, ClinicalReferralType referralType, InternalReferralStatusAction action)
	{
		if (referralStatus == null)
			return false;
		
		if (referralType == null)
			return false;
		
		if (action == null)
			return false;
		
		
		if (workflowInternalReferrals == null)
			return false;
		
		if (ClinicalReferralType.IP_TO_BE_SEEN_AS_INPATIENT.equals(referralType))
		{
			if (workflowInternalReferrals.getInpatientActions() == null)
				return false;
			
			for (WorkflowActionInternalReferalVo workflowAction : workflowInternalReferrals.getInpatientActions())
			{
				if (isActionRequested(action, workflowAction.getMenuAction()) && referralStatus.equals(workflowAction.getInternalReferralStatus()))
					return Boolean.TRUE.equals(workflowAction.getOptionAvailable());
			}
		}
		else if (ClinicalReferralType.IP_TO_BE_SEEN_AS_OUTPATIENT.equals(referralType) || ClinicalReferralType.OP_TO_BE_SEEN_AS_OUTPATIENT.equals(referralType))
		{
			if (workflowInternalReferrals.getOutpatientActions() == null)
				return false;
			
			for (WorkflowActionInternalReferalVo workflowAction : workflowInternalReferrals.getOutpatientActions())
			{
				if (isActionRequested(action, workflowAction.getMenuAction()) && referralStatus.equals(workflowAction.getInternalReferralStatus()))
					return Boolean.TRUE.equals(workflowAction.getOptionAvailable());
			}
		}
		
		return false;
	}

	private boolean isActionRequested(InternalReferralStatusAction requestedAction, Integer menuAction)
	{
		if (menuAction == null)
			return false;
		
		if (requestedAction == null)
			return false;
		
		
		switch (menuAction)
		{

			case MENU_ACTION_EDIT:
				return InternalReferralStatusAction.EDIT.equals(requestedAction);
				
			case MENU_ACTION_ATTACH_REFERRAL_LETTER:
				return InternalReferralStatusAction.ATTACH_REFERRAL_LETTER.equals(requestedAction);
				
			case MENU_ACTION_SIGN_OFF:
				return InternalReferralStatusAction.SIGN_OFF.equals(requestedAction);
			
			case MENU_ACTION_REQUIRES_FURTHER_INFORMATION:
				return InternalReferralStatusAction.REQUIRES_FURTHER_INFORMATION.equals(requestedAction);
				
			case MENU_ACTION_RECORD_FURTHER_INFORMATION:
				return InternalReferralStatusAction.RECORD_FURTHER_INFORMATION.equals(requestedAction);

			case MENU_ACTION_ACCEPT:
				return InternalReferralStatusAction.ACCEPT.equals(requestedAction);

			case MENU_ACTION_SECOND_OPINION_REQUIRED:
				return InternalReferralStatusAction.SECOND_OPINION_REQUIRED.equals(requestedAction);
				
			case MENU_ACTION_ACCEPT_APPOINTMENT_REQUIRED:
				return InternalReferralStatusAction.ACCEPT_APPOINTMENT_REQUIRED.equals(requestedAction);
				
			case MENU_ACTION_APPOINTMENT_BOOKED:
				return InternalReferralStatusAction.APPOINTMENT_BOOKED.equals(requestedAction);
				
			case MENU_ACTION_COMPLETE_ADD_NOTE:
				return InternalReferralStatusAction.COMPLETE_ADD_NOTE.equals(requestedAction);
				
			case MENU_ACTION_COMPLETE_LINK_CORRESPONDENCE:
				return InternalReferralStatusAction.COMPLETE_LINK_CORRESPONDENCE.equals(requestedAction);
				
			case MENU_ACTION_REJECT:
				return InternalReferralStatusAction.REJECT.equals(requestedAction);

			case MENU_ACTION_REJECTION_ACKNOWLEDGED:
				return InternalReferralStatusAction.REJECT_ACKNOWLEDGED.equals(requestedAction);
		}
		
		return false;
	}
	
	public List<InternalReferralStatusAction> listDeniedActionForCurrentUser(IAppRole role) 
	{
		List<InternalReferralStatusAction> deniedActions = new ArrayList<InternalReferralStatusAction>();
		
		if(appForm == null)
			return null;
		
		if(role == null)
			return null;
		
		for(MenuActionVo menuAction : appForm.getMenuActions())
		{
			if(menuAction == null)
				continue;
			
			if(!role.hasMenuActionRight(appForm, menuAction))
			{
				InternalReferralStatusAction mappedAction = getMappedAction(menuAction);
				
				if(mappedAction != null)
				{
					deniedActions.add(mappedAction);
				}
			}
		}
		
		return deniedActions.size() > 0 ? deniedActions : null;
	}
	
	private InternalReferralStatusAction getMappedAction(MenuActionVo menuAction) 
	{
		if(menuAction == null || menuAction.getID_MenuAction() == null)
			return null;
	
		if(VIEW_REFERRAL == menuAction.getID_MenuAction())
			return InternalReferralStatusAction.EDIT;
		else if(EDIT_REFERRAL == menuAction.getID_MenuAction())
			return InternalReferralStatusAction.EDIT;
		else if(REQUIRES_FURTHER_INFORMATION == menuAction.getID_MenuAction())
			return InternalReferralStatusAction.REQUIRES_FURTHER_INFORMATION;
		else if(SECOND_OPINION_REQUIRED == menuAction.getID_MenuAction())
			return InternalReferralStatusAction.SECOND_OPINION_REQUIRED;
		else if(RECORD_FURTHER_INFORMATION == menuAction.getID_MenuAction())
			return InternalReferralStatusAction.RECORD_FURTHER_INFORMATION;
		else if(ACCEPT_REFERRAL == menuAction.getID_MenuAction())
			return InternalReferralStatusAction.ACCEPT;
		else if(ACCEPT_APPOINTMENT_REQUIRED == menuAction.getID_MenuAction())
			return InternalReferralStatusAction.ACCEPT_APPOINTMENT_REQUIRED;
		else if(APPOINTMENT_BOOKED == menuAction.getID_MenuAction())
			return InternalReferralStatusAction.APPOINTMENT_BOOKED;
		else if(SIGN_OFF == menuAction.getID_MenuAction())
			return InternalReferralStatusAction.SIGN_OFF;
		else if(REJECT == menuAction.getID_MenuAction())
			return InternalReferralStatusAction.REJECT;
		else if(RIE == menuAction.getID_MenuAction())
			return InternalReferralStatusAction.RIE; //wdev-20637
		else if(NEW_REFERRAL == menuAction.getID_MenuAction())
			return InternalReferralStatusAction.EDIT;
		else if(REJECT_ACKNOWLEDGED == menuAction.getID_MenuAction())
			return InternalReferralStatusAction.REJECT_ACKNOWLEDGED;
		else if(COMPLETE_ADD_NOTE == menuAction.getID_MenuAction())
			return InternalReferralStatusAction.COMPLETE_ADD_NOTE;
		else if(INTERNAL_REFERRAL_ADMIN_EVENT == menuAction.getID_MenuAction())
			return InternalReferralStatusAction.COMPLETE_LINK_CORRESPONDENCE;
		else if(COMPLETE_LINK_CORRESPONDENCE == menuAction.getID_MenuAction())
			return InternalReferralStatusAction.COMPLETE_LINK_CORRESPONDENCE;
		
		return null;
	}
}
