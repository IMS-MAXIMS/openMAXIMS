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
// This code was generated by Florin Blindu using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2013 IMS MAXIMS. All rights reserved.

package ims.admin.forms.appointmentoutcomeconfig;

import ims.admin.forms.appointmentoutcomeconfig.GenForm.GroupFilterEnumeration;
import ims.admin.forms.appointmentoutcomeconfig.GenForm.ctnDetailsContainer.grdAppointmentOutcomeReasonsRow;
import ims.admin.forms.appointmentoutcomeconfig.GenForm.grdAppOutcomeConfigRow;
import ims.admin.vo.AppointmentOutcomeConfigVo;
import ims.admin.vo.AppointmentOutcomeConfigVoCollection;
import ims.admin.vo.AppointmentOutcomeReasonVo;
import ims.admin.vo.AppointmentOutcomeReasonVoCollection;
import ims.admin.vo.lookups.AppointmentOutcomeReason;
import ims.admin.vo.lookups.AppointmentOutcomeReasonCollection;
import ims.domain.exceptions.StaleObjectException;
import ims.framework.enumerations.FormMode;
import ims.framework.exceptions.PresentationLogicException;
import ims.framework.utils.Color;
import ims.pathways.vo.EventLiteVoCollection;
import ims.scheduling.vo.lookups.ApptOutcome;
import ims.scheduling.vo.lookups.ApptOutcomeCollection;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void onGrdAppOutcomeConfigSelectionChanged()
	{
		if (form.grdAppOutcomeConfig().getValue() instanceof AppointmentOutcomeConfigVo)
		{
			form.getLocalContext().setSelectedRecord((AppointmentOutcomeConfigVo)form.grdAppOutcomeConfig().getValue());
			form.getLocalContext().setSelectedLookup(form.getLocalContext().getSelectedRecord()!=null ? form.getLocalContext().getSelectedRecord().getAppointmentOutcome() : null);
			populateInstanceControls(form.getLocalContext().getSelectedLookup()!=null ? domain.getAppointmentOutcomeConfigByApptOutcomeLookup(form.getLocalContext().getSelectedLookup()) : null);
		}
		else if (form.grdAppOutcomeConfig().getValue() instanceof ApptOutcome)
		{
			form.getLocalContext().setSelectedRecord(null);
			form.getLocalContext().setSelectedLookup((ApptOutcome) form.grdAppOutcomeConfig().getValue());
			clearInstanceControls();
			form.ctnDetails().htmAppointmentOutcomeValue().setHTML(form.getLocalContext().getSelectedLookup()!=null ? "<b>" + form.getLocalContext().getSelectedLookup().getText() + "</b>": null);	
		}
		
		updateControlsState();
	}

	private void populateInstanceControls(AppointmentOutcomeConfigVo apptOutome)
	{
		clearInstanceControls();
		
		if (apptOutome==null)
			return;
		
		form.ctnDetails().htmAppointmentOutcomeValue().setHTML("<b>" + apptOutome.getAppointmentOutcome().getText() + "</b>");
		populateGridAppOutcomeReason(apptOutome.getAppointmentOutcomeReasons());
		form.ctnDetails().qmbFirstDefinitiveTreatment().newRow(apptOutome.getFirstDefinitiveTreatmentEvent(),apptOutome.getFirstDefinitiveTreatmentEvent()!=null ?  apptOutome.getFirstDefinitiveTreatmentEvent().getName(): null);
		form.ctnDetails().qmbFirstDefinitiveTreatment().setValue(apptOutome.getFirstDefinitiveTreatmentEvent());
		form.ctnDetails().chkFirst().setValue(apptOutome.getShowFirstDefinitiveTreatment());
		form.ctnDetails().chkWaiting().setValue(apptOutome.getCanAddtoWaitingList());
		form.ctnDetails().chkBooked().setValue(apptOutome.getCanAddtoBookedList());
		form.ctnDetails().chkPlanned().setValue(apptOutome.getCanAddtoPlannedList());
		form.ctnDetails().chkAppointment().setValue(apptOutome.getCanMakeAppointment());
		form.ctnDetails().chkOnward().setValue(apptOutome.getCanMakeOnwardReferral());
		form.ctnDetails().chkTransfer().setValue(apptOutome.getCanTransfer());
		
		
	}

	private void populateGridAppOutcomeReason(AppointmentOutcomeReasonVoCollection collAppointmentOutcomeReasons)
	{
		for (int i=0;i<form.ctnDetails().grdAppointmentOutcomeReasons().getRows().size();i++)
		{
			AppointmentOutcomeReasonVo apptOutcomeReason=getApptOutcomeReason((AppointmentOutcomeReason)form.ctnDetails().grdAppointmentOutcomeReasons().getRows().get(i).getValue(),collAppointmentOutcomeReasons);
				
			if (apptOutcomeReason!=null)
			{
				form.ctnDetails().grdAppointmentOutcomeReasons().getRows().get(i).setColSelect(apptOutcomeReason.getIsActive());	
			}	
		}
	}

	private AppointmentOutcomeReasonVo getApptOutcomeReason(AppointmentOutcomeReason value, AppointmentOutcomeReasonVoCollection collAppointmentOutcomeReasons)
	{
		if (collAppointmentOutcomeReasons==null || collAppointmentOutcomeReasons.size()==0)
			return null;
		
		for (int i=0;i<collAppointmentOutcomeReasons.size();i++)
		{
			if (collAppointmentOutcomeReasons.get(i).getAppointmentOutcomeReason().getID()==value.getID())
				return collAppointmentOutcomeReasons.get(i);
		}
		
		return null;
	}

	private void clearInstanceControls()
	{
		form.ctnDetails().htmAppointmentOutcomeValue().setHTML("");
		clearAppointmentOutcomeReasonSelection();
		form.ctnDetails().qmbFirstDefinitiveTreatment().clear();
		form.ctnDetails().chkFirst().setValue(null);
		form.ctnDetails().chkWaiting().setValue(null);
		form.ctnDetails().chkBooked().setValue(null);
		form.ctnDetails().chkPlanned().setValue(null);
		form.ctnDetails().chkAppointment().setValue(null);
		form.ctnDetails().chkOnward().setValue(null);
		form.ctnDetails().chkTransfer().setValue(null);
	}

	private void clearAppointmentOutcomeReasonSelection()
	{
		for (int i=0;i<form.ctnDetails().grdAppointmentOutcomeReasons().getRows().size();i++)
		{
			form.ctnDetails().grdAppointmentOutcomeReasons().getRows().get(i).setColSelect(false);
		}
	}

	@Override
	protected void onFormModeChanged()
	{
		updateControlsState();
	}

	private void updateControlsState()
	{
		form.ctnDetails().setCollapsed(FormMode.VIEW.equals(form.getMode()) && form.grdAppOutcomeConfig().getValue()==null);
		form.GroupFilter().setEnabled(FormMode.VIEW.equals(form.getMode()));
		form.btnEdit().setEnabled(FormMode.VIEW.equals(form.getMode()) && form.grdAppOutcomeConfig().getValue()!=null);
	}

	@Override
	protected void onFormOpen(Object[] args) throws PresentationLogicException
	{
		form.GroupFilter().setValue(GroupFilterEnumeration.rdoActive);
		initialize();
		open();
		
	}

	private void open()
	{
		populateGridAppointmentOutcomeConfig(GroupFilterEnumeration.rdoActive.equals(form.GroupFilter().getValue())); 
		form.setMode(FormMode.VIEW);
	}

	private void initialize()
	{
		
		initializeGridAppointmentOutcomeConfigWithLookups(GroupFilterEnumeration.rdoActive.equals(form.GroupFilter().getValue()));
		initializeGridAppointmentOutcomeReasonWithLookups();
	}

	private void initializeGridAppointmentOutcomeReasonWithLookups()
	{
		form.ctnDetails().grdAppointmentOutcomeReasons().getRows().clear();
		
		AppointmentOutcomeReasonCollection lookupCollection = (AppointmentOutcomeReasonCollection) domain.getLookupService().getLookupCollection(AppointmentOutcomeReason.TYPE_ID, AppointmentOutcomeReasonCollection.class, AppointmentOutcomeReason.class, false, false);
		
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			addLookupRowToAppOutcomeReasonGrid(lookupCollection.get(x));
		}
	}

	private void addLookupRowToAppOutcomeReasonGrid(AppointmentOutcomeReason appointmentOutcomeReason)
	{
	    grdAppointmentOutcomeReasonsRow row = form.ctnDetails().grdAppointmentOutcomeReasons().getRows().newRow();
		
		row.setValue(appointmentOutcomeReason);
		row.setColAppointmentOutcomeReason(appointmentOutcomeReason.getText());
		row.setTooltipForColAppointmentOutcomeReason(appointmentOutcomeReason.getText());
		row.setColActive(appointmentOutcomeReason.isActive());
	}

	private void populateGridAppointmentOutcomeConfig(boolean active)
	{
		AppointmentOutcomeConfigVoCollection collAppointmentOutcomeConfig = domain.listAppointmentsOutcomeConfig(null);
		
		for (int i=0;i<form.grdAppOutcomeConfig().getRows().size();i++)
		{
			AppointmentOutcomeConfigVo apptOutcomeConfig=null;
			if (form.grdAppOutcomeConfig().getRows().get(i).getValue() instanceof ApptOutcome)
			{
				apptOutcomeConfig=getApptOutcomeConfig((ApptOutcome)form.grdAppOutcomeConfig().getRows().get(i).getValue(),collAppointmentOutcomeConfig);
			}
			else if(form.grdAppOutcomeConfig().getRows().get(i).getValue() instanceof AppointmentOutcomeConfigVo)
			{
				apptOutcomeConfig=getApptOutcomeConfig(((AppointmentOutcomeConfigVo)form.grdAppOutcomeConfig().getRows().get(i).getValue()).getAppointmentOutcome(),collAppointmentOutcomeConfig);
			}
			
			if (apptOutcomeConfig!=null)
			{
				updateApptOutcomeConfigRow(form.grdAppOutcomeConfig().getRows().get(i),apptOutcomeConfig);	
			}
				
		}
		
		form.grdAppOutcomeConfig().setValue(form.getLocalContext().getSelectedRecord());
		populateInstanceControls(form.getLocalContext().getSelectedRecord());
	}
	
	private void updateApptOutcomeConfigRow(grdAppOutcomeConfigRow row, AppointmentOutcomeConfigVo apptOutcomeConfig)
	{
		if (apptOutcomeConfig==null)
			return;
		
		row.setColAppointmentOutcomeReason(getAppOutcomeReasons(apptOutcomeConfig.getAppointmentOutcomeReasons()));
		row.setTooltipForColAppointmentOutcomeReason(getAppOutcomeReasons(apptOutcomeConfig.getAppointmentOutcomeReasons()));
		row.setColFirst(apptOutcomeConfig.getShowFirstDefinitiveTreatment());
		row.setColWaiting(apptOutcomeConfig.getCanAddtoWaitingList());
		row.setColBooked(apptOutcomeConfig.getCanAddtoBookedList());
		row.setColPlanned(apptOutcomeConfig.getCanAddtoPlannedList());
		row.setColAppointment(apptOutcomeConfig.getCanMakeAppointment());
		row.setColOnward(apptOutcomeConfig.getCanMakeOnwardReferral());
		row.setColTransfer(apptOutcomeConfig.getCanTransfer());
		row.setValue(apptOutcomeConfig);
		
	}

	private String getAppOutcomeReasons(AppointmentOutcomeReasonVoCollection collAppointmentOutcomeReasons)
	{
		if (collAppointmentOutcomeReasons==null || collAppointmentOutcomeReasons.size()==0)
			return null;
		
		StringBuffer str=new StringBuffer("");
		for (int i=0;i < collAppointmentOutcomeReasons.size();i++) //wdev-18498
		{
			
			str.append(collAppointmentOutcomeReasons.get(i).getIsActive() ? collAppointmentOutcomeReasons.get(i).getAppointmentOutcomeReason().getText() + "," : "");
		}
			
		if( str.length() > 0)	//wdev-18498
			return str.substring(0, str.length() - 1);
		else
			return "";
	}

	private AppointmentOutcomeConfigVo getApptOutcomeConfig(ApptOutcome value, AppointmentOutcomeConfigVoCollection collAppointmentOutcomeConfig)
	{
		if (collAppointmentOutcomeConfig==null || collAppointmentOutcomeConfig.size()==0)
			return null;
		
		for (int i=0;i<collAppointmentOutcomeConfig.size();i++)
		{
			if (collAppointmentOutcomeConfig.get(i).getAppointmentOutcome().getID()==value.getID())
				return collAppointmentOutcomeConfig.get(i);
		}
		
		return null;
	}

	private void initializeGridAppointmentOutcomeConfigWithLookups(boolean active)
	{
		form.grdAppOutcomeConfig().getRows().clear();
		
		ApptOutcomeCollection lookupCollection = (ApptOutcomeCollection) domain.getLookupService().getLookupCollection(ApptOutcome.TYPE_ID, ApptOutcomeCollection.class, ApptOutcome.class, false, active);
		
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			addLookupRowToAppOutcomeGrid(lookupCollection.get(x));
		}
	}

	private void addLookupRowToAppOutcomeGrid(ApptOutcome apptOutcome)
	{
		grdAppOutcomeConfigRow row = form.grdAppOutcomeConfig().getRows().newRow();
		
		row.setValue(apptOutcome);
		row.setColAppointmentOutcome(apptOutcome.getText());
		row.setTooltipForColAppointmentOutcome(apptOutcome.getText());
		if (!apptOutcome.isActive())
		{
			row.setBackColor(Color.Cyan);
		}
	}

	@Override
	protected void onRadioButtonGroupFilterValueChanged() throws PresentationLogicException
	{
		initialize();
		form.getLocalContext().setSelectedLookup(null);
		form.getLocalContext().setSelectedRecord(null);
		populateGridAppointmentOutcomeConfig(GroupFilterEnumeration.rdoActive.equals(form.GroupFilter().getValue()));
		updateControlsState();
	}

	@Override
	protected void onBtnEditClick() throws PresentationLogicException
	{
		form.setMode(FormMode.EDIT);
	}

	@Override
	protected void onBtnSaveClick() throws PresentationLogicException
	{
		if (save())
			open();
	}

	private boolean save()
	{
		AppointmentOutcomeConfigVo apptOutcomeConfigToSave=populateDataFromScreen(form.getLocalContext().getSelectedRecord());
		
		if (apptOutcomeConfigToSave.getID_AppointmentOutcomeConfig()==null && form.getLocalContext().getSelectedLookup()!=null && domain.getAppointmentOutcomeConfigByApptOutcomeLookup(form.getLocalContext().getSelectedLookup())!=null)
		{
			engine.showMessage("An Appointment Outcome Configuration for '"+ form.getLocalContext().getSelectedLookup().getText() + "' already exist. The screen will be refreshed! ");
			open();
			return false;
		}
		String[] errors = apptOutcomeConfigToSave.validate();
		
		if (errors != null && errors.length>0)
		{
			engine.showErrors(errors);
			return false;
		}
		
		try 
		{
			form.getLocalContext().setSelectedRecord(domain.save(apptOutcomeConfigToSave));
		} 
		catch (StaleObjectException e) 
		{
			engine.showMessage(ims.configuration.gen.ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
			open();
			return false;
		}
		
		return true;
		
	}

	private AppointmentOutcomeConfigVo populateDataFromScreen(AppointmentOutcomeConfigVo selectedRecord)
	{
		if (selectedRecord==null)
			selectedRecord=new AppointmentOutcomeConfigVo();
		else
			selectedRecord=(AppointmentOutcomeConfigVo) selectedRecord.clone();
		
		selectedRecord.setAppointmentOutcome(form.getLocalContext().getSelectedLookup());
		selectedRecord.setAppointmentOutcomeReasons(populateOutcomeReasonsDataFromScreen(selectedRecord.getAppointmentOutcomeReasons()));
		
		selectedRecord.setFirstDefinitiveTreatmentEvent(form.ctnDetails().qmbFirstDefinitiveTreatment().getValue());
		selectedRecord.setShowFirstDefinitiveTreatment(form.ctnDetails().chkFirst().getValue());
		selectedRecord.setCanAddtoWaitingList(form.ctnDetails().chkWaiting().getValue());
		selectedRecord.setCanAddtoBookedList(form.ctnDetails().chkBooked().getValue());
		selectedRecord.setCanAddtoPlannedList(form.ctnDetails().chkPlanned().getValue());
		selectedRecord.setCanMakeAppointment(form.ctnDetails().chkAppointment().getValue());
		selectedRecord.setCanMakeOnwardReferral(form.ctnDetails().chkOnward().getValue());
		selectedRecord.setCanTransfer(form.ctnDetails().chkTransfer().getValue());
		
		return selectedRecord;
	}

	private AppointmentOutcomeReasonVoCollection populateOutcomeReasonsDataFromScreen(AppointmentOutcomeReasonVoCollection collAppOutcomeReason)
	{
		if (collAppOutcomeReason==null)
			collAppOutcomeReason = new AppointmentOutcomeReasonVoCollection();
		else
			collAppOutcomeReason=(AppointmentOutcomeReasonVoCollection) collAppOutcomeReason.clone();
		
		for (int i=0;i<form.ctnDetails().grdAppointmentOutcomeReasons().getRows().size();i++)
		{
			grdAppointmentOutcomeReasonsRow row = form.ctnDetails().grdAppointmentOutcomeReasons().getRows().get(i);
			Boolean isInAppOutcomeColl=false;
			for (int j=0;j<collAppOutcomeReason.size();j++)
			{
				if (collAppOutcomeReason.get(j).getAppointmentOutcomeReason().equals(row.getValue()) )
				{
					if (!row.getColSelect())
					{
						collAppOutcomeReason.get(j).setIsActive(false);
					}
					else
					{
						collAppOutcomeReason.get(j).setIsActive(true);
					}
					isInAppOutcomeColl=true;
					break;
				}
				
			}
			
			if (!isInAppOutcomeColl && row.getColSelect())
			{
				AppointmentOutcomeReasonVo appOutcomeReason = new AppointmentOutcomeReasonVo();
				appOutcomeReason.setIsActive(true);
				appOutcomeReason.setAppointmentOutcomeReason(form.ctnDetails().grdAppointmentOutcomeReasons().getRows().get(i).getValue());
				
				collAppOutcomeReason.add(appOutcomeReason);
			}
		}
		
		return collAppOutcomeReason;
	}

	@Override
	protected void onBtnCancelClick() throws PresentationLogicException
	{
		open();
	}

	@Override
	protected void onQmbFirstDefinitiveTreatmentTextSubmited(String value) throws PresentationLogicException
	{
		form.ctnDetails().qmbFirstDefinitiveTreatment().clear();
		
		EventLiteVoCollection voCollEvent = domain.listEvents(value);
		if (voCollEvent==null || voCollEvent.size() == 0)
		{
			return;
		}

		for (int i = 0; i < voCollEvent.size(); i++)
		{
			form.ctnDetails().qmbFirstDefinitiveTreatment().newRow(voCollEvent.get(i), voCollEvent.get(i).getName().toString());
		}

		if (voCollEvent.size() == 1)
			form.ctnDetails().qmbFirstDefinitiveTreatment().setValue(voCollEvent.get(0));
		else
			form.ctnDetails().qmbFirstDefinitiveTreatment().showOpened();
	}
	
	
}