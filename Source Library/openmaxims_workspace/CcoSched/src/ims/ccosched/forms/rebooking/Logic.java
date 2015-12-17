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
// Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.

package ims.ccosched.forms.rebooking;
import ims.alerts.PatientAlertCCO;
import ims.ccosched.ActionData.ActionData;
import ims.ccosched.ActionSession.ActionSession;
import ims.ccosched.DateSessionSlotsClass.DateSessionSlotsClass;
import ims.ccosched.SlotTime.SlotTime;
import ims.ccosched.forms.booking.Logic.Conflict;
import ims.ccosched.vo.PatTreatPlanActionVo;
import ims.ccosched.vo.PatTreatPlanActionVoCollection;
import ims.ccosched.vo.PatTreatmentPlanLiteVo;
import ims.ccosched.vo.lookups.Modality;
import ims.ccosched.vo.lookups.Unit;
import ims.core.vo.PatientShort;
import ims.core.vo.lookups.ChannelType;
import ims.dto.Result;
import ims.dto.client.Go_ptplact;
import ims.dto.client.Go_ptreatpl.Go_ptreatplRecord;
import ims.dto.client.Lkup;
import ims.dto.client.Sd_activity_action;
import ims.dto.client.Sd_activstaff;
import ims.dto.client.Sd_appt;
import ims.dto.client.Sd_appt.Sd_apptAppt_idRecord;
import ims.dto.client.Sd_mc;
import ims.dto.client.Sd_mc_act;
import ims.dto.client.Sd_modactmc;
import ims.dto.client.Sd_sess_appts;
import ims.dto.client.Sd_sess_avail;
import ims.dto.client.Sd_sessconflicts;
import ims.dto.client.Sd_session;
import ims.dtomove.vo.PatTreatPlanActionDoseVo;
import ims.framework.UIEngine;
import ims.framework.delegates.CancelArgs;
import ims.framework.enumerations.DialogResult;
import ims.framework.exceptions.PresentationLogicException;
import ims.framework.utils.Color;
import ims.framework.utils.Date;
import ims.framework.utils.DateFormat;
import ims.framework.utils.DayOfWeek;
import ims.framework.utils.StringUtils;
import ims.framework.utils.Time;
import ims.framework.utils.TimeFormat;
import ims.framework.utils.TimeSpan;
import ims.vo.LookupInstVo;
import ims.vo.LookupInstanceCollection;
import ims.vo.lookups.ClassHelper;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class Logic extends BaseLogic
{
	public static final String INCOMPLETE = "N";
	private final static String newLine = System.getProperty("line.separator");
		
	protected void OnFormOpen() 
	{
		if(furtherAppointment())
		{
			//Show the Further Appointment Grid
			form.MainGrid().setVisible(false);
			form.grdFurtherAppt().setVisible(true);
		}
		else
		{
			form.MainGrid().setVisible(true);
			form.grdFurtherAppt().setVisible(false);
		}
		
		form.ChangeTime().getRows().clear();
		form.PreviousDate().setEnabled(false);
		form.NextDate().setEnabled(false);
		form.DateSelected().setValue("");
		
		form.ResourceSelected().setValue("");
		form.ResourceSelected().setTooltip("");//WDEV-14490
		form.LocationSelected().setValue("");
		form.NumResSelected().setValue("");
		form.NumberOfBookings().setValue("");
		form.NumberOfFirstAppointments().setValue("");
		form.bActions().setEnabled(false);
		
		ShowExternalBeem(false);
//		#region Patient
		populatePatientDetails();
//		#endregion

//		#endregion
//		#region Populate Main Grid
		form.MainGrid().getRows().clear();

		ArrayList aData = new ArrayList();
		form.getGlobalContext().CcoSched.Rebooking.setData(aData);

		Sd_appt appointments = (Sd_appt)domain.getDTOInstance(Sd_appt.class);
		appointments.Filter.clear();
		appointments.Filter.Appt_head_id = form.getGlobalContext().CcoSched.CancelledAppointments.getRebookAppointmentDetail();
		Result result = appointments.get();
		if (result != null)
		{
			form.Calendar().setEnabled(false);//WDEV-14506
			ShowMessage(result.getMessage());
			return;
		}
		if (appointments.DataCollection.count() == 0)
		{
			ShowMessage("Internal error: No information on appointment details");
			return;
		}
		Sd_appt.Sd_apptRecord appointment = appointments.DataCollection.get(0);
		if (appointment.Appt_idCollection.count() == 0)
		{
			ShowMessage("Internal error: No information on appointment details");
			return;
		}
		//25/06/2003 - Populate Transport Comment
		form.Transport().setValue(appointment.Transp_cmnt);
		
		//Avoid doing an extra get in Go_ptplact if coming from treatment plan
		if(furtherAppointment())
		{
			if(form.getGlobalContext().getPatTreatmentPlanActionIsNotNull())
			{
				PatTreatPlanActionVo go_ptplact = form.getGlobalContext().getPatTreatmentPlanAction();
				//update local context
				form.getLocalContext().setPatTreatmentPlanAction(go_ptplact);
				form.PatientCategory().setValue(go_ptplact.getCategoryIsNotNull()?go_ptplact.getCategory().getText():"");
				//Save the values in the context
				form.getGlobalContext().CcoSched.Rebooking.setPatientCategory(go_ptplact.getCategoryIsNotNull()?go_ptplact.getCategory().getText():"");
				form.getGlobalContext().CcoSched.Rebooking.setAction(go_ptplact.getActionIsNotNull()?go_ptplact.getAction().getActionIsNotNull()?go_ptplact.getAction().getAction().getName():"":"");
				form.getGlobalContext().CcoSched.Rebooking.setActivity(go_ptplact.getActivityIsNotNull()?go_ptplact.getActivity().getName():"");
			}
		}
		else
		{
			//24/06/2003 - Populate Category, Activity, Action texts
			if(!appointment.Treatpl_act_id.equals(""))
			{
				PatTreatmentPlanLiteVo ptplact = domain.getTreatmentPlan(new Integer(appointment.Treatpl_act_id));
				if (ptplact!=null)
				{
					PatTreatPlanActionVo tpActionVo = getPatTreatPlanAction(ptplact,new Integer(appointment.Treatpl_act_id));
					//update local context				
					form.getLocalContext().setPatTreatmentPlanAction(tpActionVo);
					form.PatientCategory().setValue(tpActionVo.getCategoryIsNotNull()?tpActionVo.getCategory().getText():"");
					//Save the values in the context
					form.getGlobalContext().CcoSched.Rebooking.setPatientCategory(tpActionVo.getCategoryIsNotNull()?tpActionVo.getCategory().getText():"");
					form.getGlobalContext().CcoSched.Rebooking.setAction(tpActionVo.getActionIsNotNull()?tpActionVo.getAction().getActionIsNotNull()?tpActionVo.getAction().getAction().getName():"":"");
					form.getGlobalContext().CcoSched.Rebooking.setActionID(tpActionVo.getActionIsNotNull()?tpActionVo.getAction().getActionIsNotNull()?tpActionVo.getAction().getAction().getID_ActionIsNotNull()?tpActionVo.getAction().getAction().getID_Action().toString():"":"":"");
					form.getGlobalContext().CcoSched.Rebooking.setActivity(tpActionVo.getActivityIsNotNull()?tpActionVo.getActivity().getName():"");
				}				
//				ptplact.Filter.clear();
//				ptplact.Filter.Pt_act_id = appointment.Treatpl_act_id;
//				Result res = ptplact.get();
//				if (res != null)
//				{
//					ShowMessage(res.getMessage());
//				}
//			
//				form.PatientCategory().setValue(ptplact.DataCollection.get(0).Txcattypetxt);
//				//Save the values in the context
//				form.getGlobalContext().CcoSched.Rebooking.setPatientCategory(ptplact.DataCollection.get(0).Txcattypetxt);
//				form.getGlobalContext().CcoSched.Rebooking.setAction(ptplact.DataCollection.get(0).Action_idtxt);
//				form.getGlobalContext().CcoSched.Rebooking.setActionID(ptplact.DataCollection.get(0).Action_id);
//				form.getGlobalContext().CcoSched.Rebooking.setActivity(ptplact.DataCollection.get(0).Activity_idtxt);
			}
		}

		loadTreatmentPlanTooltip();
		
		if(furtherAppointment() == false)
		{
			int Fractions =0;
			for(int i=0; i<appointment.Appt_idCollection.count(); i++)
			{
				Sd_appt.Sd_apptAppt_idRecord app = appointment.Appt_idCollection.get(i);
				
				boolean isIncomplete 	  =  isIncompleteAppt() && app.Appt_stat.equals("-2192") && app.Act_comp_flg.equals(INCOMPLETE);
				boolean isNormalRebooking = !isIncompleteAppt() && (app.Appt_stat.equals("-2190") || app.Appt_stat.equals("-2191")); 
				if (isNormalRebooking || isIncomplete)
				{
					GenForm.MainGridRow row = form.MainGrid().getRows().newRow();
					Date d = GetDateFromString(app.Appt_dt);
					if (d == null)
					{
						ShowMessage("Internal error: No date for appointment detail.");
						return;
					}
					Time sd = GetTimeFromString(app.App_stm);
					if (sd == null)
					{
						ShowMessage("Internal error: No time for appointment detail.");
						return;
					}
					StringBuffer tmp = new StringBuffer(200);
					tmp.append(d.toString(DateFormat.STANDARD));
					tmp.append(" - ");
					tmp.append(sd.toString(TimeFormat.DEFAULT));//string.Format("{0:D2}:{1:D2}", sd.Value.Hour, sd.Value.Minute));
	
					row.setAppointment(tmp.toString());
					row.setNewAppointment("");
					row.setValue(app);
					Fractions++;
					// 1 - Date selected, 2 - time selected, 3 - section ID, 4 - section details ID, 5 - list owner (attStaff_no), 6 - resource, 7 - list owner (attStaffactiv_id)
					aData.add(new Object[]{app, minDate, "", "", "", "", "", "", ""});
				}
			}
			//Kevin - setting the fraction as the number of appointments
			form.Fractions().setValue(new Integer(Fractions));
			form.getGlobalContext().CcoSched.Rebooking.setData(aData);
		}
		
//		#endregion
//		#region Populate Calendar
		Date date = new Date(form.Calendar().getCurrentMonth().getYear(), form.Calendar().getCurrentMonth().getMonth(), 1);
		for (int i = 1; i <= date.getNumberOfDaysInTheMonth(); ++i)
			form.Calendar().addNoSessionDates(new Date(form.Calendar().getCurrentMonth().getYear(), form.Calendar().getCurrentMonth().getMonth(), i));

		for(int i=0; i<appointment.Appt_idCollection.count(); i++)
		{
			Sd_appt.Sd_apptAppt_idRecord app = appointment.Appt_idCollection.get(i);
			if (!app.Appt_stat.equals("-2190") || !app.Appt_stat.equals("-2192") || !app.Appt_stat.equals("-2193") || !app.Appt_stat.equals("-2197"))
			{
				Date sd = GetDateFromString(app.Appt_dt);
				if (sd == null)
				{
					ShowMessage("Internal error: No date for appointment detail.");
					return;
				}
				form.Calendar().checkBooked(sd);
			}
		}
        loadModality();
        loadEnergyUnit();
        
//      #region Populate Calendar
        
//		#endregion
		form.getLocalContext().setTreatmentPlanAction(appointment.Treatpl_act_id);
		form.getLocalContext().setAppointments(appointment);
		form.getGlobalContext().CcoSched.Rebooking.setAppointments(appointments);
		form.getGlobalContext().CcoSched.Rebooking.setNewTimeList(new ArrayList());
		form.getGlobalContext().CcoSched.Rebooking.setMachine_Id(null);

		if(furtherAppointment() == false)
		{
			//Requirement - default the Sequence to Monday, Tuesday, if more than one record in the grid
			form.Sequence().setValue(form.MainGrid().getRows().size() > 1);
			defaultSequence(form.Sequence().getValue());
			//simulate CurrentSelection = 0;
			int rowCount = form.MainGrid().getRows().size();
			if(rowCount > 0)
			{
				form.MainGrid().setValue(form.MainGrid().getRows().get(0).getValue());
				try
				{
					//Force a selChange in the grid
					OnMainGrid();
				} catch (PresentationLogicException e)
				{
					ShowMessage(e.getMessage());
				}
			}
		}
		
		if(furtherAppointment())
		{	
			//Set the data in the context
			aData.add(new Object[]{null, minDate, "", "", "", "", "", "", ""});
			form.getGlobalContext().CcoSched.Rebooking.setData(aData);
			populateActionDetails();
			form.Sequence().setValue(true);
			defaultSequence(form.Sequence().getValue());
		}
	}
	private PatTreatPlanActionVo getPatTreatPlanAction(PatTreatmentPlanLiteVo patTPVo, Integer actionId) 
	{
		if (patTPVo != null && patTPVo.getActionsIsNotNull())
		{
			for (Iterator iter = patTPVo.getActions().iterator(); iter.hasNext();) {
				PatTreatPlanActionVo element = (PatTreatPlanActionVo) iter.next();
				
				if (element.getActionIsNotNull() && element.getID_PatAction().equals(actionId))
					return element;				
			}
		}
		return null;
	}
	protected void OnFormDialogClosed(ims.framework.FormName formName, ims.framework.enumerations.DialogResult result) throws ims.framework.exceptions.PresentationLogicException
	{
		if (formName.equals(form.getForms().CcoSched.RebookingConfirmation))
		{
			if (form.getGlobalContext().CcoSched.Rebooking.getRebookingSucceeded() != null)
				OnClose();
		}
		else if(formName.equals(form.getForms().CcoSched.RebookingSlotsWarning) && !result.equals(DialogResult.CANCEL))
		{
			//17/01/2005
			if(result.equals(DialogResult.OK))
			{
				//Clear the slot time selected
				Date selDate = form.getGlobalContext().CcoSched.Booking.getSelectedDate();
				ClearSlotTime(selDate);
				//Clear the new appointment 
				if(furtherAppointment() == false && form.MainGrid().getSelectedRowIndex() >=0)
				{
					//Clear the Main grid
					form.MainGrid().getRows().get(form.MainGrid().getSelectedRowIndex()).setNewAppointment("");
					//Clear the Slots grid
					for(int i=0; i<form.SlotsGrid().getRows().size(); i++)
					{
						if(form.SlotsGrid().getRows().get(i).getSelect())
							form.SlotsGrid().getRows().get(i).setSelect(false);
					}
				}
				
				//Call again Generate Dates (avoid checking the slots)
				onGenerateDatesClick(false);
			}
		}
		else if(formName.equals(form.getForms().CcoSched.BookingAction) && result.equals(DialogResult.OK))
		{
			//Check to see if the actionID has changed from the default value, otherwise delete these dates from the list
			ArrayList selectedDates = form.getGlobalContext().CcoSched.Booking.getCalendarSelectedDates();
			ActionSession actionSession;
			boolean bDeleted;
			Date sessionDate = null;
			//Set the percentage for every date
			for(int i=0; i<selectedDates.size(); i++)
			{
				actionSession = (ActionSession)selectedDates.get(i);
				form.Calendar().addPercentage(actionSession.getSessionDate(), actionSession.getPercentage());
			}
			//If the action has changed, reset the old slot time if it was set (as it might differ for the new action selectedfrom)
			//e.g. the time set was 09.18 ( 18 mins time interval) and if the action changed has 20 mins time interval
			//the 09.18 cannot be set
			for(int i=0; i<selectedDates.size(); i++)
			{
				actionSession = (ActionSession)selectedDates.get(i);
				if(actionSession.isActionChanged())
				{
					//Set the session date if it was changed 
					if(form.getGlobalContext().CcoSched.Booking.getSelectedDateIsNotNull() && 
					   form.getGlobalContext().CcoSched.Booking.getSelectedDate().equals(actionSession.getSessionDate()))
					   	sessionDate = actionSession.getSessionDate();
					
					//Clear the flag
					actionSession.setActionChanged(false);
					//Clear the slots time 
					ArrayList dateSessionSlots = form.getGlobalContext().CcoSched.Booking.getDateSessionSlotsList();
					if(dateSessionSlots != null)
					{
						for (int j = 0; j < dateSessionSlots.size(); ++j)
						{
							 DateSessionSlotsClass ds = (DateSessionSlotsClass)dateSessionSlots.get(j);
							 if(furtherAppointment())
							 {
							 	//TODO Please find a way to identify the time - and clear that time only
							 	/*if(ds.equals(actionSession.getSessionDate()))
								 {
								 	ds.setSlotList(new ArrayList());
								 	break;
								 }*/
							 }
							 else
							 {
							 	//TODO - Delete only the time that was unchecked from the array list
								 if(ds.getDate().equals(actionSession.getSessionDate()))
								 {
								 	ds.setSlotList(new ArrayList());
								 	break;
								 }
							 }
						}
					}
					//24/01/2004 - clear the New Appointment time selected in the grid
					//Check the appt_id
					if(furtherAppointment() == false)
					{
						for(int k=0; k<form.MainGrid().getRows().size(); k++)
						{
							if(actionSession.getAppt_id().equals("") == false && actionSession.getAppt_id().equals(form.MainGrid().getRows().get(k).getValue().Appt_id))
							{
								String newAppt = form.MainGrid().getRows().get(i).getNewAppointment();
								//Clear only the time but leave the date - the date has 10 characters (e.g. 10/02/2005)
								form.MainGrid().getRows().get(i).setNewAppointment((newAppt != null && newAppt.length() > 10)?newAppt.substring(0,10):"");
								//31/01/2004 - Clear the time as well - from the 
								clearTime(actionSession.getSessionDate(), actionSession.getAppt_id()); 
								break;
							}
						}
					}
					else
					{
						//Delete the records -- how? Delete the data and populate again?
						//TODO - for further appointments - don't forget to use break when you found the date
						
					}
					
					//------------------------------------------------
				}
			}
			//------end clear slots time----------------------------------
			
			/*//Delete the dates having the same action as the selected one
			do{
				bDeleted = false; 
				for(int i=0; i<selectedDates.size(); i++)
				{
					actionSession = (ActionSession)selectedDates.get(i);
					if(actionSession.getAction().equals(getCurrentActionSelected(actionSession.getSessionDate())))
					{
						selectedDates.remove(i);
						bDeleted = true;
						break;
					}
				}
			}while(bDeleted);*/
			//Set the time required
			for(int i=0; i<selectedDates.size(); i++)
			{
				actionSession = (ActionSession)selectedDates.get(i);
				form.Calendar().addPercentage(actionSession.getSessionDate(), actionSession.getPercentage());
				actionSession.setIntervalTimeRequired(GetIntervalTimeRequired(actionSession));
			}
			
			//If the action has changed for the date selected, refresh the Slots
			if(sessionDate != null)
				OnDateSelected(sessionDate);
			
			form.getGlobalContext().CcoSched.Booking.setCalendarSelectedDates(selectedDates);
		}
		else if(formName.equals(form.getForms().CcoSched.ResourceAvailabilty) && result.equals(DialogResult.OK))
		{
			ArrayList ar = form.getGlobalContext().CcoSched.Booking.getDefaultTime();//Context.ContextBooking.DefaultTime;
			//23/12/2004 - Array list of times - if different from the default time
			ArrayList newTimes = new ArrayList();
			if (ar.size() > 0)
			{	
				form.Calendar().clearNoSlotDates();
//				#region Check the Default Slot that exist for all dates
				for(int i=0; i<form.Calendar().getSelectedDates().size(); i++)
				{
					Date date =  (Date)form.Calendar().getSelectedDates().get(i);
					String appt_id = "";
					//26/01/2005 - Pass the appointment ID if any
					if(furtherAppointment() && i<form.MainGrid().getRows().size())
						appt_id = form.MainGrid().getRows().get(i).getValue().Appt_id;
					ArrayList slotsAvailable = GetSlotList(date, appt_id);
					for(int j=0; j<ar.size(); j++)
					{
						String a = (String)ar.get(j);
						boolean ok = false;
						if(slotsAvailable.contains(a))
							ok = true;
						else
						{
							//23/12/2005
							//apply the +- 10 mins rule (the flag - ims.configuration.gen.ConfigFlag.DTO.SCHEDULER_APPT_INTERVAL.getValue())
							Time newTime = GetRoundedTime((String)ar.get(j), slotsAvailable);
							if(newTime != null)
							{
								newTimes.add(new SlotTime(date, newTime));
								ok = true;
							}
						}
						/*for(int k=0; k<slotsAvailable.size(); k++)
						{
							String s = (String)slotsAvailable.get(k);
							if (s.equals(a))
							{
								ok = true;
								break;
							}
						}*/
						if (!ok)
						{
							engine.showMessage("The slot selected is not available for the date " + date.toString(DateFormat.STANDARD));
							form.Calendar().addNoSlotDate(date);
						}
					}
				}
//				#endregion

//				#region Check IntervalRequired of the selected slots.
				ArrayList DatesNoIntervalRequired = new ArrayList();
				for(int i = 0; i<form.Calendar().getSelectedDates().size(); i++)
				{
					Date date = (Date)form.Calendar().getSelectedDates().get(i);
					String appt_id = "";
					//26/01/2005 - Pass the appointment ID if any
					if(furtherAppointment() && i<form.MainGrid().getRows().size())
						appt_id = form.MainGrid().getRows().get(i).getValue().Appt_id;
					GetAlreadyBookedSlots(date, appt_id);
					ArrayList alreadyBooked = form.getLocalContext().getAlreadyBooked();
					boolean errorIntervalRequired = false;
					if (form.getGlobalContext().CcoSched.Booking.getIntervalRequired().intValue() > 0)
					{
						for(int j=0; j<alreadyBooked.size(); j++)
						{
							String s = (String) alreadyBooked.get(j);
							String[] time2 = s.split(":");
							
							Time t2 = null;
							try{ t2 = new Time((time2[0] + time2[1] + "00"), TimeFormat.FLAT6);}catch(RuntimeException e){e.printStackTrace();}
							if (t2 == null)
							{
								engine.showMessage("Wrong time format");
								return;
							}

							for(int k=0; k<ar.size(); k++)
							{
								String timeS = (String) ar.get(k);
								String[] time = timeS.split(":");
								Time t1 = null;
								try{t1 = new Time((time[0] + time[1] + "00"), TimeFormat.FLAT6);}catch(RuntimeException e ){e.printStackTrace();} 
								if (t1 == null)
								{
									engine.showMessage("Wrong time format");
									return;
								}

								if (!((CompareTimes(t2, t1) > 0 && (TimeSpan.getTimeSpan(t2, t1).getMinutes() >= form.getGlobalContext().CcoSched.Booking.getIntervalRequired().intValue()*60)) || (CompareTimes(t2, t1) < 0 && (TimeSpan.getTimeSpan(t1, t2).getMinutes() >= form.getGlobalContext().CcoSched.Booking.getIntervalRequired().intValue()*60))))
								{
									DatesNoIntervalRequired.add(date);
									errorIntervalRequired = true;
									break;
								}
							}
							if (errorIntervalRequired)
								break;
						}
					}
					if (errorIntervalRequired)
					{
						boolean added = false;
						for(int l=0; l<form.Calendar().getNoSlotDates().size(); l++)
						{
							Date d = (Date)form.Calendar().getNoSlotDates().get(l);
							if (d.equals(date)) added = true;
						}
						if (!added)
						{
							engine.showMessage("The interval required for the date " + date.toString(DateFormat.STANDARD) + " must be " + form.getGlobalContext().CcoSched.Booking.getIntervalRequired().toString() + " hour(s).");										
							form.Calendar().addNoSlotDate(date);
						}
					}
					
				}
//				#endregion

				ArrayList ds = form.getGlobalContext().CcoSched.Booking.getDateSessionSlotsList();
				if (ds == null)
				{
					ds = new ArrayList();
					form.getGlobalContext().CcoSched.Booking.setDateSessionSlotsList(ds);
				}
				ArrayList u = new ArrayList();

				Enumeration objects = form.getGlobalContext().CcoSched.Booking.getSelectedSessions().keys();
				while(objects.hasMoreElements()) 
				{
					Date dt = null;
					try{dt = new Date((String)objects.nextElement(), DateFormat.ISO);}catch(ParseException e){e.printStackTrace();}
					boolean flag = false;
					for (int i = 0; i < ds.size(); i++) 				
					{
						DateSessionSlotsClass d = (DateSessionSlotsClass)ds.get(i);
						if (dt != null && d.getDate().equals(dt))
						{
							boolean bSetSlot = true;
							for (int j = 0; j < form.Calendar().getNoSlotDates().size(); j++) 
							{
								Date noSlotDate = (Date)form.Calendar().getNoSlotDates().get(j);
								if (noSlotDate.equals(d.getDate()))
								{
									bSetSlot = false;
									break;
								}
									
							}
							if (bSetSlot)
							{
								for (int j = 0; j < DatesNoIntervalRequired.size(); j++) 
								{
									Date dIntervalRequired = (Date)DatesNoIntervalRequired.get(j);
									if (dIntervalRequired.equals(d.getDate()))
									{
										bSetSlot = false;
										break;
									}
								}
								if (bSetSlot)
								{
									flag = true;
									d.getSlotList().clear();
									boolean bTimeChanged = false;
									d.getSlotList().clear();
									//04/01/2005 - Check if the time has been changed (rounded)
									for(int k=0; k<newTimes.size(); k++)
									{
										SlotTime newTime = (SlotTime)newTimes.get(k);
										if(newTime.getDate().equals(dt))
										{
											//Time in hh:mm format
											d.getSlotList().add(newTime.getTime().toString());
											bTimeChanged = true;
										}
									}
									//end check
									if(!bTimeChanged)
									{
										for (int j = 0; j < ar.size(); j++) 
											d.getSlotList().add(ar.get(j));
									}
									break;
								}
							}								
						}
					}
					if (!flag)
					{
						//Simulate replace split(new char[]{',','+'} C# code
						String[] tmp = StringUtils.splitString(((String)form.getGlobalContext().CcoSched.Booking.getSelectedSessions().get(dt.toString(DateFormat.ISO))).replace(',','+'),"+");
						boolean bSetSlot = true;
						for (int i = 0; i < form.Calendar().getNoSlotDates().size(); i++) 
						{
							Date noSlotDate = (Date)form.Calendar().getNoSlotDates().get(i);
							if (dt != null && noSlotDate.equals(dt))
							{
								bSetSlot = false;
								break;
							}			
						}
						if (bSetSlot)
						{
							for (int i = 0; i < DatesNoIntervalRequired.size(); i++) 
							//foreach (DateTime dIntervalRequired in DatesNoIntervalRequired)
							{
								Date dIntervalRequired = (Date)DatesNoIntervalRequired.get(i);
								if (dt != null && dIntervalRequired.equals(dt))
								{
									bSetSlot = false;
									break;
								}
							}
							if (bSetSlot)
							{
								ArrayList a = new ArrayList();
								boolean bTimeChanged = false;
								//04/01/2005 - Check if the time has been changed (rounded)
								for(int i=0; i<newTimes.size(); i++)
								{
									SlotTime newTime = (SlotTime)newTimes.get(i);
									if(newTime.getDate().equals(dt))
									{
										//Time in hh:mm format
										a.add(newTime.getTime().toString());
										bTimeChanged = true;
									}
								}
								//end check
								
								if(!bTimeChanged)
								{
									for (int j = 0; j < ar.size(); j++) 
										a.add(ar.get(j));
								}
								//String appt_id = getApptID();
								u.add(new DateSessionSlotsClass(dt, tmp[0], tmp[1], a));
							}
						}
					}
				}
				for (int l = 0; l < u.size(); l++) 
					ds.add(u.get(l));
				//04/03/2004 - set the Slots List 
				form.getGlobalContext().CcoSched.Booking.setDateSessionSlotsList(ds);				
				
				//SetDefaultAppointmentTime(ar);
				SetConflicts();
			}
		
/*			if (form.getGlobalContext().CcoSched.Booking.getSelectedDate() != null)
				SetSlots();*/
			
			//TODO - check if you have to move SetDefaultAppointmentTime before SetDefaultAppointmentTime 
			OnSimulateGridCheckBoxClicked(true, true);
			
			//14/01/2005 - Uncheck the date that are not correspondent to the selected one
			if(furtherAppointment() == false)
			{
				//Get the date 
				int selIndex = form.MainGrid().getSelectedRowIndex();
				String newAppt = form.MainGrid().getRows().get(selIndex).getNewAppointment();
				Date dt  = null;
				//Get the date in format yyyymmdd from  dd/mm/yyyy
				if(newAppt != null && !newAppt.equals(""))
				{
					try {dt = new Date(newAppt, DateFormat.STANDARD);
					} catch (ParseException e) {e.printStackTrace();}
				}

				form.Calendar().clearChecks();
				if(dt != null)
				{
					form.Calendar().check(dt);
					form.getLocalContext().setCheckedDate(dt);
				}
				
				//Refresh the slots with the selected appt_id (for the case when acrion changed)
				if (form.getGlobalContext().CcoSched.Booking.getSelectedDate() != null)
					SetSlots(form.MainGrid().getRows().get(selIndex).getValue().Appt_id);
			}
			else
			{
				if (form.getGlobalContext().CcoSched.Booking.getSelectedDate() != null)
					SetSlots();
			}
			
			form.getGlobalContext().CcoSched.Booking.setDefaultTime(null);
		}
	}
	private void ShowExternalBeem(boolean b)
	{
		form.LabelModality().setVisible(b);
		form.LabelEnergy().setVisible(b);
		form.LabelUnit().setVisible(b);
		form.LabelDose().setVisible(b);
		form.LabelFractions().setVisible(b);
		form.LabelDuration().setVisible(b);

		form.Modality().setVisible(b);
		form.Energy().setVisible(b);
		form.EnergyUnit().setVisible(b);
		form.Dose().setVisible(b);
		form.Fractions().setVisible(b);
		form.Duration().setVisible(b);

		form.Modality().setEnabled(false);
		form.Energy().setEnabled(false);
		form.EnergyUnit().setEnabled(false);
		form.Dose().setEnabled(false);
		form.Fractions().setEnabled(false);
		form.Duration().setEnabled(furtherAppointment()?false:true);

		//23/03/2004 - Number of appointments
		form.LabelNumberOfAppointemnts().setVisible(!b);
		form.NumberOfAppointments().setVisible(!b);
	}
	protected void OnClose() throws ims.framework.exceptions.PresentationLogicException
	{
		form.getLocalContext().setCheckedDate(null);//UIEngine.Context.Remove("10020:Checked date");
		form.getLocalContext().setCheckedTime(null);//UIEngine.Context.Remove("10020:Checked time");
		form.getGlobalContext().CcoSched.Rebooking.setData(null);//UIEngine.Context.Remove("10020: Data");
		form.getLocalContext().setGroupId(null);//UIEngine.Context.Remove("10020:groupID");
		form.getLocalContext().setActivityID(null);// UIEngine.Context.Remove("10020:activityID");
		form.getLocalContext().setActionId(null);
		form.getLocalContext().setAlreadyBooked(null);//UIEngine.Context.Remove("10020:AlreadyBooked");
//		Clear New Appointment Times
		form.getGlobalContext().CcoSched.Rebooking.setNewTimeList(new ArrayList());

		form.getGlobalContext().CcoSched.Booking.setIntervalRequired(null);//Context.ContextBooking.ClearIntervalRequired();
		form.getGlobalContext().CcoSched.Booking.setTimeRequired(null);//Context.ContextBooking.ClearTimeRequired();
		form.getGlobalContext().CcoSched.Booking.setSessionIndex(null);//Context.ContextBooking.ClearSessionIndex();
		form.getGlobalContext().CcoSched.Booking.setListOwner(null);//Context.ContextBooking.ClearListOwner();
		form.getGlobalContext().CcoSched.Booking.setResourceSelected(null);//Context.ContextBooking.ClearResourceSelected();
		form.getGlobalContext().CcoSched.Booking.setSessionList(null);//Context.ContextBooking.ClearSessionList();
		form.getGlobalContext().CcoSched.Booking.setStartDate(null);//Context.ContextBooking.ClearStartDate();
		form.getGlobalContext().CcoSched.Booking.setEndDate(null);//Context.ContextBooking.ClearEndDate();
		form.getGlobalContext().CcoSched.Booking.setDateSessionSlotsList(null);//Context.ContextBooking.ClearDateSessionSlotsList();
		form.getGlobalContext().CcoSched.Rebooking.setPatientCategory(null);
		form.getGlobalContext().CcoSched.Rebooking.setAction(null);
		form.getGlobalContext().CcoSched.Rebooking.setActivity(null);
		//23/11/2004 - Clear persistant context
		form.getGlobalContext().CcoSched.Booking.setDefaultTime(null);
		form.getGlobalContext().CcoSched.Rebooking.setAppointments(null);
//		05/01/2005 - Clear persistant context
		if(form.getGlobalContext().CcoSched.Booking.getCalendarSelectedDatesIsNotNull())
			form.getGlobalContext().CcoSched.Booking.setCalendarSelectedDates(null);
		
		form.getLocalContext().setSelectedResource(null);
		form.getGlobalContext().CcoSched.Booking.setSelectedActions(null);
		if(form.getGlobalContext().CcoSched.Booking.getModalityArrayListIsNotNull())
			form.getGlobalContext().CcoSched.Booking.setModalityArrayList(null);
		if(form.getGlobalContext().CcoSched.Rebooking.getActionIDIsNotNull())
			form.getGlobalContext().CcoSched.Rebooking.setActionID(null);
		
		//WDEV-12873 - Clear persistant Context used in variables
		if(form.getGlobalContext().CcoSched.Booking.getSelectedSessionsIsNotNull())
			form.getGlobalContext().CcoSched.Booking.setSelectedSessions(null);
		
		//WDEV-12873 - Clear persistant Context used in variables
		if(form.getGlobalContext().CcoSched.Booking.getSelectedDateIsNotNull())
			form.getGlobalContext().CcoSched.Booking.setSelectedDate(null);

		if (form.getGlobalContext().CcoSched.Rebooking.getRebookingSucceeded() != null) //WDEV-16239
		{
			engine.close(DialogResult.OK);
		}
		else
		{
			engine.close(DialogResult.CANCEL);
		}
	}
	protected void OnTimeChanged(int column, GenForm.ChangeTimeRow row, ims.framework.utils.Time value) throws ims.framework.exceptions.PresentationLogicException
	{
		if(column != 2)
			return;
		if (value != null)
		{
			boolean flag = true;
			Time slotStartTime = null, slotEndTime = null;
			int gridSize = form.SlotsGrid().getRows().size();
			for (int i = 0; i < gridSize; ++i)
			{
				String[] time = StringUtils.splitString(form.SlotsGrid().getRows().get(i).getSlots(), ":");
				String[] endTime = StringUtils.splitString(form.SlotsGrid().getRows().get(gridSize-1).getSlots(), ":");
				//Get the next time in the slots
				String[] next = i < (form.SlotsGrid().getRows().size()-1)?StringUtils.splitString(form.SlotsGrid().getRows().get(i+1).getSlots(), ":"):null;
				Time ddt = GetTimeFromString(time[0] + time[1] + "00");
				if (ddt == null)
				{
					ShowMessage("Wrong time format");
					return;
				}
				//Set the start and the end time
				if(i==0)
					slotStartTime = ddt;
				slotEndTime = GetTimeFromString(endTime [0] + endTime [1] + "00");
				
				//Check to see if the time is in the slot time limits 
				if(slotStartTime != null && slotEndTime != null)
				{
					if(value.isLessThan(slotStartTime) || value.isGreaterThan(slotEndTime))
					{
						ShowMessage("Slot does not exist.");
						row.setNewTime(null);
						return;
					}
				}
				Time nextTime = next != null?GetTimeFromString(next[0] + next[1] + "00"):null;
				//Check to see if the time is between the current time and the next time
				//if(value.isLessThan(time) )
				if (ddt.equals(value))
					flag = false;
				
				//TimeInInterval(ddt)
				if(nextTime != null)
				{
					if(value.isGreaterThan(ddt) && value.isLessThan(nextTime))
					{
						row.setNewTime(ddt);
						//Set the value as the new rounded one
						value = ddt.copy();
						flag = false;
					}
				}
			}
			//If the time was not in the interval - leave the time as it is (says Kevin)
/*			if (flag)
			{
				row.setNewTime(null);
				ShowMessage("Slot does not exist.");
				return;
			}*/
			ArrayList tmp = new ArrayList();

			String s = form.getLocalContext().getCheckedTime();//UIEngine.Context.Get("10020:Checked time") as string;
			if (s != null)
			{
				String[] time = StringUtils.splitString(s, ":");
				Time ddt = GetTimeFromString(time[0] + time[1] + "00");
				if (ddt == null)
				{
					ShowMessage("Wrong time format");
					return;
				}
				tmp.add(ddt);
			}

			ArrayList alreadyBooked = form.getLocalContext().getAlreadyBooked();//gUIEngine.Context.Get("10020:AlreadyBooked") as ArrayList;
			for(int i=0; i<alreadyBooked.size(); i++)
			{
				String str = (String) alreadyBooked.get(i);
				String[] time = StringUtils.splitString(str, ":");
				Time ddt = GetTimeFromString(time[0] + time[1] + "00");
				if (ddt == null)
				{
					ShowMessage("Wrong time format");
					return;
				}
				tmp.add(ddt);
			}

			for (int i = 0; i < form.ChangeTime().getRows().size(); ++i)
				if (i != row.getOrder().intValue())
					tmp.add(form.ChangeTime().getRows().get(i).getNewTime() == null? form.ChangeTime().getRows().get(i).getOldTime() : form.ChangeTime().getRows().get(i).getNewTime());

			Time t = new Time(value.getHour(), value.getMinute());
			for(int i=0; i<tmp.size(); i++)
			{
				Time t1 = (Time) tmp.get(i);
				if (!((t.isGreaterThan(t1) && TimeSpan.getTimeSpan(t, t1).getMinutes() >= form.getGlobalContext().CcoSched.Booking.getIntervalRequired().intValue()*60) || (t.isLessThan(t1) && TimeSpan.getTimeSpan(t1 , t).getMinutes() >= form.getGlobalContext().CcoSched.Booking.getIntervalRequired().intValue()*60)))
				{
					row.setNewTime(null);
					ShowMessage("The interval required must be " + form.getGlobalContext().CcoSched.Booking.getIntervalRequired().toString() + " hour(s).");
					return;
				}
			}
			//22/10/2004 - Set in the context the record + the new time if any
			addToTimeList(new Object[]{row.getValue(), value, form.getGlobalContext().CcoSched.Booking.getSelectedDate()});
		}
		else
		{
			addToTimeList(new Object[]{row.getValue(), value, form.getGlobalContext().CcoSched.Booking.getSelectedDate()});
		}
	}
	protected void OnSessionList() throws ims.framework.exceptions.PresentationLogicException
	{
		if (form.getGlobalContext().CcoSched.Booking.getSelectedDate() != null)
			engine.open(form.getForms().CcoSched.SessionList);
	}
	
	protected void OnGridCheckBoxClicked(int column, GenForm.SlotsGridRow row, boolean isChecked) throws ims.framework.exceptions.PresentationLogicException
	{
		OnGridCheckBoxClicked(column, row, isChecked, false);// because m_Fire = true and m_ManualEvents = false by default. 
	}
	protected void OnGridCheckBoxClicked(int column, GenForm.SlotsGridRow row, boolean isChecked, boolean m_ManualEvents) throws ims.framework.exceptions.PresentationLogicException
	{
		Date selectedDate = form.getGlobalContext().CcoSched.Booking.getSelectedDate();
		int rowDataIndex = furtherAppointment()?getFurtherDataIndex(form.getGlobalContext().CcoSched.Booking.getSelectedDate()):form.MainGrid().getSelectedRowIndex();
		Object[] data = (Object[])form.getGlobalContext().CcoSched.Rebooking.getData().get(rowDataIndex);
		ArrayList alreadyBooked = form.getLocalContext().getAlreadyBooked();//form. UIEngine.Context.Get("10020:AlreadyBooked") as ArrayList;
		ArrayList dateSessionSlots = form.getGlobalContext().CcoSched.Booking.getDateSessionSlotsList();
		
		if (isChecked)
		{
			String [] time = StringUtils.splitString(row.getSlots(), ":");
			Time t = GetTimeFromString(time[0] + time[1] + "00");
			if (t == null)
			{
				ShowMessage("Wrong time format");
				return;
			}

			for (int i = 0; i < form.ChangeTime().getRows().size(); ++i)
			{
				Time t1 = (form.ChangeTime().getRows().get(i).getNewTime() == null ? form.ChangeTime().getRows().get(i).getOldTime() : form.ChangeTime().getRows().get(i).getNewTime());
				if (!((t.isGreaterThan(t1) && TimeSpan.getTimeSpan(t, t1).getMinutes() >= form.getGlobalContext().CcoSched.Booking.getIntervalRequired().intValue()*60) || (t.isLessThan(t1) && TimeSpan.getTimeSpan(t1, t).getMinutes() >= form.getGlobalContext().CcoSched.Booking.getIntervalRequired().intValue()*60)))
				{
					row.setSelect(false);
					ShowMessage("The interval required must be " + form.getGlobalContext().CcoSched.Booking.getIntervalRequired().toString() + " hour(s).");
					return;
				}
			}

			for(int i=0; i<alreadyBooked.size(); i++)
			{
				String s = (String)alreadyBooked.get(i);
				String[] time2 = StringUtils.splitString(s, ":");
				Time t1 = GetTimeFromString(time2[0] + time2[1] + "00");
				if (t1 == null)
				{
					ShowMessage("Wrong time format");
					return;
				}
				if (!((t.isGreaterThan(t1) && TimeSpan.getTimeSpan(t, t1).getMinutes() >= form.getGlobalContext().CcoSched.Booking.getIntervalRequired().intValue()*60) || (t.isLessThan(t1) && TimeSpan.getTimeSpan(t1, t).getMinutes() >= form.getGlobalContext().CcoSched.Booking.getIntervalRequired().intValue()*60)))
				{
					row.setSelect(false);
					ShowMessage("The interval required must be " + form.getGlobalContext().CcoSched.Booking.getIntervalRequired().toString() + " hour(s).");
					return;
				}
			}

			Object dt = form.getLocalContext().getCheckedTime();//UIEngine.Context.Get("10020:Checked time");
			if (!form.Calendar().getSelectedDates().contains(selectedDate))
			{
				form.Calendar().getSelectedDates().add(selectedDate);
				boolean m_Fire = false;
				form.Calendar().check(selectedDate);
				OnDateChecked(selectedDate, true, m_Fire, m_ManualEvents);
				m_Fire = true;
				//30/11/2004 - For further appointments - dont add any data to the context if 
				//the number of appointments exceeded the 
				if(furtherAppointment() && (isChecked && slotGridCleared()))
					return;					
			}
			row.setSelect(true);
			if (dt != null)
				for (int i = 0; i < form.SlotsGrid().getRows().size(); ++i)
					if (i != Integer.valueOf(row.getValue()).intValue() && form.SlotsGrid().getRows().get(i).getSelect() == true)
					{
						form.SlotsGrid().getRows().get(i).setSelect(false);
						//OnGridCheckBoxClicked(column, row, false, m_ManualEvents); 
					}
			form.getLocalContext().setCheckedTime(row.getSlots());

			data[1] = selectedDate;
			data[2] = row.getSlots();
			data[3] = form.getGlobalContext().CcoSched.Booking.getSessionId();
			data[4] = form.getGlobalContext().CcoSched.Booking.getSessionDetailsId();
			if(furtherAppointment() == false)
				form.MainGrid().getRows().get(rowDataIndex).setNewAppointment(((Date)data[1]).toString(DateFormat.STANDARD) + " - " + row.getSlots());

			if (dateSessionSlots == null)
			{
				dateSessionSlots = new ArrayList();
			}
			else if (dateSessionSlots != null && dateSessionSlots.size()==0)
			{
				DateSessionSlotsClass ds = new DateSessionSlotsClass(selectedDate, form.getGlobalContext().CcoSched.Booking.getSessionId(), form.getGlobalContext().CcoSched.Booking.getSessionDetailsId(), new ArrayList());
				ds.getSlotList().add(row.getSlots());
				dateSessionSlots.add(ds);
				form.getGlobalContext().CcoSched.Booking.setDateSessionSlotsList(dateSessionSlots);				
			}
			
			form.getLocalContext().setSelectedResource(form.Resource().getValue());
		}
		else
		{
			form.getLocalContext().setCheckedTime(null);
			if(furtherAppointment() == false)
				form.MainGrid().getRows().get(rowDataIndex).setNewAppointment("");
			data[2] = "";
			data[3] = "";
			data[4] = "";
		}
		
		SetDataInGlobalContext(data, rowDataIndex);
	}
	
	//m_ManualEvents = true, isChecked = true
	//Trying to replicate the the SlotsGrid check process
	protected void OnSimulateGridCheckBoxClicked(boolean isChecked, boolean m_ManualEvents) throws ims.framework.exceptions.PresentationLogicException
	{
		int collSize = furtherAppointment()?form.getGlobalContext().CcoSched.Rebooking.getData().size():form.Calendar().getSelectedDates().size();
		
		GenForm.MainGridRow mainGridRow = null;
		Date selectedDate = null;
		for(int j=0; j<collSize;j++)
		{
			//Object[] data = (Object[])form.getGlobalContext().CcoSched.Rebooking.getData().get(form.MainGrid().getSelectedRowIndex());
			Object[] data = (Object[])form.getGlobalContext().CcoSched.Rebooking.getData().get(j);
			ArrayList alreadyBooked = form.getLocalContext().getAlreadyBooked();//form. UIEngine.Context.Get("10020:AlreadyBooked") as ArrayList;
			if(furtherAppointment())
			{
				//Check if the date from the list is checked in the Calendar ( as the list contains unchecked dates as well) 
				if(!form.Calendar().getSelectedDates().contains(((Date)data[1])))
					continue;
				selectedDate = (Date)form.Calendar().getSelectedDates().get(form.Calendar().getSelectedDates().indexOf((Date)data[1]));
			}
			else
			{
				mainGridRow = form.MainGrid().getRows().get(j);
				selectedDate = (Date)form.Calendar().getSelectedDates().get(j);	
			}
			
			//set the session details in the context
			String[] session = setSessions(selectedDate);

			if (isChecked)
			{
				//24/01/2005 - get the new default time if changed
				ArrayList ar = getNewDefaultTime(selectedDate);//form.getGlobalContext().CcoSched.Booking.getDefaultTime();
				if(ar == null)
					ar = form.getGlobalContext().CcoSched.Booking.getDefaultTime();
				
				if(ar == null || ar.size() == 0)
				{
					ShowMessage("No default time selected.");
					return;
				}
				String [] time = StringUtils.splitString(ar.get(0).toString(), ":");
				Time t = GetTimeFromString(time[0] + time[1] + "00");
				if (t == null)
				{
					ShowMessage("Wrong time format");
					return;
				}
	
				//22/10/2004 - check against the new times (if exists) otherwise against the old ones
				ArrayList newTimes = getNewTimes(selectedDate, session);
				for(int i=0; i<newTimes.size(); i++)
				{
					Time t1 = (Time)newTimes.get(i);
					if (!((t.isGreaterThan(t1) && TimeSpan.getTimeSpan(t, t1).getMinutes() >= form.getGlobalContext().CcoSched.Booking.getIntervalRequired().intValue()*60) || (t.isLessThan(t1) && TimeSpan.getTimeSpan(t1, t).getMinutes() >= form.getGlobalContext().CcoSched.Booking.getIntervalRequired().intValue()*60)))
					{
						//row.setSelect(false);
						ShowMessage("The interval required must be " + form.getGlobalContext().CcoSched.Booking.getIntervalRequired().toString() + " hour(s).");
						return;
					}
				}
//				for (int i = 0; i < form.ChangeTime().getRows().size(); ++i)
//				{
//					Time t1 = (form.ChangeTime().getRows().get(i).getNewTime() == null ? form.ChangeTime().getRows().get(i).getOldTime() : form.ChangeTime().getRows().get(i).getNewTime());
//					if (!((t.isGreaterThan(t1) && TimeSpan.getTimeSpan(t, t1).getMinutes() >= form.getGlobalContext().CcoSched.Booking.getIntervalRequired().intValue()*60) || (t.isLessThan(t1) && TimeSpan.getTimeSpan(t1, t).getMinutes() >= form.getGlobalContext().CcoSched.Booking.getIntervalRequired().intValue()*60)))
//					{
//						//row.setSelect(false);
//						ShowMessage("The interval required must be " + form.getGlobalContext().CcoSched.Booking.getIntervalRequired().toString() + " hour(s).");
//						return;
//					}
//				}
	
				for(int i=0; i<alreadyBooked.size(); i++)
				{
					String s = (String)alreadyBooked.get(i);
					String[] time2 = StringUtils.splitString(s, ":");
					Time t1 = GetTimeFromString(time2[0] + time2[1] + "00");
					if (t1 == null)
					{
						ShowMessage("Wrong time format");
						return;
					}
					if (!((t.isGreaterThan(t1) && TimeSpan.getTimeSpan(t, t1).getMinutes() >= form.getGlobalContext().CcoSched.Booking.getIntervalRequired().intValue()*60) || (t.isLessThan(t1) && TimeSpan.getTimeSpan(t1, t).getMinutes() >= form.getGlobalContext().CcoSched.Booking.getIntervalRequired().intValue()*60)))
					{
						//row.setSelect(false);
						ShowMessage("The interval required must be " + form.getGlobalContext().CcoSched.Booking.getIntervalRequired().toString() + " hour(s).");
						return;
					}
				}
	
				Object dt = form.getLocalContext().getCheckedTime();//UIEngine.Context.Get("10020:Checked time");
				if (!form.Calendar().getSelectedDates().contains(selectedDate))
				{
					form.Calendar().getSelectedDates().add(selectedDate);
					boolean m_Fire = false;
					//form.Calendar().check(selectedDate);
					//OnDateChecked(selectedDate, true, m_Fire, m_ManualEvents);
					m_Fire = true;
				}
				//row.setSelect(true);
//				if (dt != null)
//					for (int i = 0; i < form.SlotsGrid().getRows().size(); ++i)
//						if (i != Integer.valueOf(row.getValue()).intValue() && form.SlotsGrid().getRows().get(i).getSelect() == true)
//							form.SlotsGrid().getRows().get(i).setSelect(false);
				//form.getLocalContext().setCheckedTime(row.getSlots());
				form.getLocalContext().setCheckedTime(ar.get(0).toString());
	
				//TODO - Added data[1] - Please check
				data[1] = selectedDate;
				//------------------------------------
				//data[2] = row.getSlots();
				data[2] = ar.get(0).toString();
				data[3] = form.getGlobalContext().CcoSched.Booking.getSessionId();
				data[4] = form.getGlobalContext().CcoSched.Booking.getSessionDetailsId();
				//mainGridRow.setNewAppointment(((Date)data[1]).toString(DateFormat.STANDARD) + " - " + row.getSlots());
				if(furtherAppointment() == false)
					mainGridRow.setNewAppointment(((Date)data[1]).toString(DateFormat.STANDARD) + " - " + ar.get(0).toString());
	
				form.getLocalContext().setSelectedResource(form.Resource().getValue());
			}
			else
			{
				form.getLocalContext().setCheckedTime(null);
				if(furtherAppointment() == false)
					form.MainGrid().getRows().get(j).setNewAppointment("");
				data[2] = "";
				data[3] = "";
				data[4] = "";
			}
		
			SetDataInGlobalContext(data, j);
		}
	}
	
	private ArrayList getNewDefaultTime(Date selectedDate)
	{
		//new DateSessionSlotsClass(dt, tmp[0], tmp[1], a));
 
		ArrayList slots = form.getGlobalContext().CcoSched.Booking.getDateSessionSlotsList();
		if(slots != null)
		{
			for(int i=0; i<slots.size(); i++)
			{
				if(((DateSessionSlotsClass)slots.get(i)).getDate().equals(selectedDate))
					return ((DateSessionSlotsClass)slots.get(i)).getSlotList(); 
			}
		}
	
		return null;
	}
	
	private void SetSlots()
	{
		SetSlots("");
	}
	private void SetSlots(String appt_id)
	{	
		Date date = form.getGlobalContext().CcoSched.Booking.getSelectedDate();

		form.SlotsGrid().getRows().clear();
		form.ChangeTime().getRows().clear();

		ArrayList alreadyBooked = new ArrayList();
		form.getLocalContext().setAlreadyBooked(alreadyBooked);

		Hashtable sessionList = getSession(date, appt_id);
		if(sessionList == null)
			sessionList = form.getGlobalContext().CcoSched.Booking.getSessionList();
				
		String[] sessions = ((String)sessionList.get(date.toString(DateFormat.ISO))).split(",");
		
		String[] session = StringUtils.splitString(sessions[form.getGlobalContext().CcoSched.Booking.getSessionIndex().intValue()], "+"); // sessions[Context.ContextBooking.SessionIndex] is null ??????????
		if (session.length != 2)
		{
			ShowMessage("Invalid session / session detail format.");
			return;
		}

		form.DateSelected().setValue(date.toString(DateFormat.STANDARD));
		form.NumResSelected().setValue(Integer.toString(form.getGlobalContext().CcoSched.Booking.getSessionIndex().intValue() + 1) + "/" + Integer.toString(sessions.length));

		form.PreviousDate().setEnabled(form.getGlobalContext().CcoSched.Booking.getSessionIndex().intValue() > 0);
		form.NextDate().setEnabled((form.getGlobalContext().CcoSched.Booking.getSessionIndex().intValue()+ 1 < sessions.length));
			
		form.getGlobalContext().CcoSched.Booking.setSessionId(session[0]);
		form.getGlobalContext().CcoSched.Booking.setSessionDetailsId(session[1]); 

		Sd_sess_appts sessionAppointments = (Sd_sess_appts) domain.getDTOInstance(Sd_sess_appts.class);
		sessionAppointments.Filter.clear();
		sessionAppointments.Filter.Prfile_sess_id = session[0];
		sessionAppointments.Filter.Prfiled_sess_id = session[1];
		sessionAppointments.Filter.Userrights = form.getGlobalContext().CcoSched.getLoggedInUserId();
		if (form.ListOwner().getValue() != null)
			sessionAppointments.Filter.Loid = form.ListOwner().getValue().Staff_no;
		Result result = sessionAppointments.get();
		if (result != null)
		{
			ShowMessage(result.getMessage());
			return;
		}
		if (sessionAppointments.DataCollection.count() == 0)
		{
			ShowMessage("No data return for session.");
			return;
		}

		Sd_sess_appts.Sd_sess_apptsRecord sessionAppointment = sessionAppointments.DataCollection.get(0);
		form.ResourceSelected().setValue(sessionAppointment.Mc_nm);
		form.ResourceSelected().setTooltip(sessionAppointment.Mc_nm);//WDEV-14490
		form.LocationSelected().setValue(sessionAppointment.Loc_nm);

		Time startTime = GetTimeFromString(sessionAppointment.Stm);
		if (startTime == null)
		{
			ShowMessage("Session start time not returned.");
			return;
		}
		form.getGlobalContext().CcoSched.Rebooking.setStartTime(startTime);

		Time endTime = GetTimeFromString(sessionAppointment.Etm);
		if (endTime == null)
		{
			ShowMessage("Session end time not returned.");
			return;
		}

//		#region 1. find booked periods
		ArrayList bookedPeriods = new ArrayList();
		int rowIndex = 0;
		for(int k=0; k<sessionAppointment.Seqno3Collection.count(); k++)
		{
			Sd_sess_appts.Sd_sess_apptsSeqno3Record r =  sessionAppointment.Seqno3Collection.get(k);
			if (!r.Appt_stat.equals("-2190") && !r.Appt_stat.equals("-2193") && !r.Appt_stat.equals("-2197")) //Cancelled
			{
				Time startTimeBooked = GetTimeFromString(r.Appt_stm);
				if (startTimeBooked == null)
				{
					ShowMessage("Appointment start time not returned.");
					return;
				}
				Time endTimeBooked = GetTimeFromString(r.Appt_etm);
				if (endTimeBooked == null)
				{
					ShowMessage("Appointment end time not returned.");
					return;
				}
				
				boolean self = r.Pkey.equals(form.getGlobalContext().Core.getPatientShortIsNotNull() ? form.getGlobalContext().Core.getPatientShort().getPkey().getValue() : "");
				if (self)
				{
					GenForm.ChangeTimeRow ctr = form.ChangeTime().getRows().newRow();
					//01/09/2005 - Changed Object[] (as it's not supported by the framework) into an ArrayList
					ArrayList timeData = new ArrayList(3);
					timeData.add(0, r);
					timeData.add(1, session[0]);
					timeData.add(2, session[1]);
					//voData.setPrfile_sess_id(session[0]);
					//voData.setPrfiled_sess_id(session[1]);
					//new Object[]{r, session[0], session[1]}
					ctr.setValue(timeData);
					ctr.setOldTime(startTimeBooked);
					ctr.setNewTime(getNewApptTime(r, session));
					ctr.setOrder(new Integer(rowIndex++));
				}

				ArrayList intersectedPeriods = new ArrayList();
				
				for(int j=0; j<bookedPeriods.size(); j++)
				{
					Object[] period = (Object[]) bookedPeriods.get(j);
					if (startTimeBooked.isLessThan((Time)period[1]) && endTimeBooked.isGreaterThan((Time)period[0]))
						intersectedPeriods.add(period);
				}

				Time min = new Time(startTimeBooked.getHour(), startTimeBooked.getMinute());
				Time max = new Time(endTimeBooked.getHour(), endTimeBooked.getMinute());
				for(int j=0; j<intersectedPeriods.size(); j++)
				{
					Object[] period = (Object[]) intersectedPeriods.get(j);
					if (((Time)period[0]).isLessThan(min))
						min = new Time(((Time)period[0]).getHour(), ((Time)period[0]).getMinute());
					if (((Time)period[1]).isGreaterThan(max))
						max = new Time(((Time)period[1]).getHour(), ((Time)period[1]).getMinute());
				}
				int i = 1;
				for(int j=0; j<intersectedPeriods.size(); j++)
				{
					Object[] o = (Object[])intersectedPeriods.get(j);
					i += ((Integer)o[2]).intValue();
					self |= ((Boolean)o[3]).booleanValue();
					bookedPeriods.remove(o);
				}

				bookedPeriods.add(new Object[]{min, max, new Integer(i), new Boolean(self)});
			}
		}
//		#endregion

//		#region 2. find exluded periods
		ArrayList excludedPeriods = new ArrayList();
		for(int i=0; i<sessionAppointment.Seqno2Collection.count(); i++)
		{
			Sd_sess_appts.Sd_sess_apptsSeqno2Record r = sessionAppointment.Seqno2Collection.get(i);
			Time startTimeExclusion = GetTimeFromString(r.Stm2);
			if (startTimeExclusion == null)
			{
				ShowMessage("failed to get exclusion time record.");
				return;
			}

			Time endTimeExclusion = GetTimeFromString(r.Etm2);
			if (endTimeExclusion == null)
			{
				ShowMessage("failed to get exclusion time record.");
				return;
			}

			ArrayList intersectedPeriods = new ArrayList();
			for(int j=0; j<excludedPeriods.size(); j++)
			{	
				Time[] period =  (Time[]) excludedPeriods.get(j);
				if (startTimeExclusion.isLessOrEqualThan(period[1]) && endTimeExclusion.isGreaterOrEqualThan(period[0]))
					intersectedPeriods.add(period);
			}	

			Time min = new Time(startTimeExclusion.getHour(),startTimeExclusion.getMinute());
			Time max = new Time(endTimeExclusion.getHour(), endTimeExclusion.getMinute());
			for(int j=0; j<intersectedPeriods.size(); j++)
			{
				Time[] period = (Time[]) intersectedPeriods.get(j);  
				if (period[0].isLessThan(min))
					min = period[0];
				if (period[1].isGreaterThan(max))
					max = period[1];
			}
			for(int j=0; j<intersectedPeriods.size(); j++)
				excludedPeriods.remove(intersectedPeriods.get(j));

			excludedPeriods.add(new Time[]{min, max});
		}
//		#endregion
//
//		#region 3. find purely exluded periods
		ArrayList tmpArr = new ArrayList();
		for(int i=0; i<bookedPeriods.size(); i++)
		{
			Object[] bookedPeriod = (Object[]) bookedPeriods.get(i);
			Time s = new Time(((Time)bookedPeriod[0]).getHour(), ((Time)bookedPeriod[0]).getMinute());
			Time e = new Time(((Time)bookedPeriod[1]).getHour(), ((Time)bookedPeriod[1]).getMinute());

			tmpArr.clear();
			for(int j=0; j<excludedPeriods.size(); j++)
				tmpArr.add(excludedPeriods.get(j));
				
			excludedPeriods.clear();
			
//			for(int j=0; j<tmpArr.size(); j++)
//			{
//				Time[] excludedPeriod = (Time[]) tmpArr.get(j);
//				if (s.isGreaterThan(excludedPeriod[1]) || e.isLessThan(excludedPeriod[0]))
//					excludedPeriods.add(excludedPeriod);
//				else if (s.isGreaterOrEqualThan(excludedPeriod[0]) && s.isLessOrEqualThan(excludedPeriod[1]) && e.isGreaterThan(excludedPeriod[1]))
//					excludedPeriods.add(new Time[]{excludedPeriod[1], e});
//				else if (s.isLessThan(excludedPeriod[0]) && e.isGreaterOrEqualThan(excludedPeriod[0]) && e.isLessOrEqualThan(excludedPeriod[1]))
//					excludedPeriods.add(new Time[]{s, excludedPeriod[0]});
//				else if (s.isGreaterThan(excludedPeriod[0]) && s.isLessThan(excludedPeriod[1]) && e.isGreaterThan(excludedPeriod[0]) && e.isLessThan(excludedPeriod[1]))
//				{
//					excludedPeriods.add(new Time[]{excludedPeriod[0], s});
//					excludedPeriods.add(new Time[]{e, excludedPeriod[1]});
//				}
//			}
			
			for(int j=0; j<tmpArr.size(); j++)
			{
				Time[] excludedPeriod = (Time[])tmpArr.get(j);
				// exclusion times typically start on the hour 
				if (CompareTimes(s, excludedPeriod[1]) >= 0 || CompareTimes(e, excludedPeriod[0]) <= 0)
					excludedPeriods.add(excludedPeriod);
				else if (CompareTimes(s,excludedPeriod[0]) >= 0 && CompareTimes(s, excludedPeriod[1]) <= 0 && CompareTimes(e, excludedPeriod[1]) > 0)
					excludedPeriods.add(new Time[]{excludedPeriod[1], e});
				else if (CompareTimes(s, excludedPeriod[0]) < 0 && CompareTimes(e, excludedPeriod[0]) >= 0 && CompareTimes(e, excludedPeriod[1]) <= 0)
					excludedPeriods.add(new Time[]{s, excludedPeriod[0]});
				else if (CompareTimes(s, excludedPeriod[0]) >= 0 && CompareTimes(s, excludedPeriod[1]) <= 0 && CompareTimes(e, excludedPeriod[0]) > 0 && CompareTimes(e, excludedPeriod[1]) < 0)
				{
					excludedPeriods.add(new Time[]{excludedPeriod[0], s});
					excludedPeriods.add(new Time[]{e, excludedPeriod[1]});
				}
			}
			
		}
//		#endregion
//
//		#region 4. find HCP period
		Time startTimeListOwner = null;
		Time endTimeListOwner = null;
		if (form.ListOwner().getValue() != null)
		{
			for(int i=0; i<sessionAppointment.LoseqnoCollection.count(); i++)
			{
				Sd_sess_appts.Sd_sess_apptsLoseqnoRecord listOwner =  sessionAppointment.LoseqnoCollection.get(i);
				if (listOwner.Mos_id.equals(form.ListOwner().getValue().Staff_no)) // WDEV-14442
				{
					startTimeListOwner = GetTimeFromString(listOwner.Stm1);
					if (startTimeListOwner == null)
					{
						ShowMessage("start time for list owner is not supplied.");
						return;
					}

					endTimeListOwner = GetTimeFromString(listOwner.Etm1);
					if (endTimeListOwner == null)
					{
						ShowMessage("end time for list owner is not supplied.");
						return;
					}
					break;
				}
			}
			if (startTimeListOwner == null)
			{
				ShowMessage("list owner is not found.");
				return;
			}
		}
//		#endregion
//
//		#region 5. create slots
		boolean flag = true;
		
		if (sessionAppointment.Userrights.equals("-100"))
			flag = false;
		else if (form.ListOwner().getValue() != null && sessionAppointment.Userrights.equals("-101"))
		{
			for(int i=0; i<sessionAppointment.LoseqnoCollection.count(); i++)
			{
				Sd_sess_appts.Sd_sess_apptsLoseqnoRecord listOwner = sessionAppointment.LoseqnoCollection.get(i);
				if (listOwner.Mos_id.equals(form.ListOwner().getValue().Staff_no)) // WDEV-14442
				{
					Integer si = GetIntegerFromString(listOwner.Loremnoapp);
					if (si != null && si.intValue() == 0)
						flag = false;
					break;
				}
			}
		}
		if (flag)
		{         				
			ArrayList dateSessionSlots = form.getGlobalContext().CcoSched.Booking.getDateSessionSlotsList();
			
			int timeRequired = GetSlotTimeRequired(date);
			timeRequired = timeRequired !=-1?timeRequired:form.getGlobalContext().CcoSched.Booking.getTimeRequired().intValue();
			Time slotStartTime = new Time(startTime.getHour(), startTime.getMinute());
			int indexValue = 0;
			while (true)
			{
				Time slotEndTime = new Time(slotStartTime.getHour(), slotStartTime.getMinute());
				slotEndTime.addMinutes(timeRequired);
				if (slotEndTime.isGreaterThan(endTime))
					break;

				flag = false;
				if (sessionAppointment.Userrights.equals("-102"))
					flag = true;
				else
				{
					if (form.ListOwner().getValue() == null)
						flag = true;
					else
					{
						if (startTimeListOwner.isLessOrEqualThan(slotStartTime) && slotStartTime.isLessThan(endTimeListOwner))
							flag = true;
						else
							slotStartTime = slotEndTime;
					}
				}

				if (flag)
				{
					GenForm.SlotsGridRow row = form.SlotsGrid().getRows().newRow();
					row.setSlots(slotStartTime.toString(TimeFormat.DEFAULT));
					row.setValue(Integer.toString(indexValue++));
					if (dateSessionSlots == null)
						row.setSelect(false);
					else
					{
						for (int i = 0; i < dateSessionSlots.size(); ++i)
						{
							DateSessionSlotsClass tmp = (DateSessionSlotsClass)dateSessionSlots.get(i);
							if (date.equals(tmp.getDate()) && session[0].equals(tmp.getSessionId()) && session[1].equals(tmp.getSessionDetailsId()))
							{
								boolean flag2 = false;
								for (int j = 0; j < tmp.getSlotList().size(); ++j)
									if (row.getSlots().equals((String)tmp.getSlotList().get(j)))
									{
										flag2 = true;
										break;
									}
								row.setSelect(flag2);
								//14/01/2005 - if the slot is selected set the checked time
								if(flag2)
									form.getLocalContext().setCheckedTime(row.getSlots());
								break;
							}
						}
					}
					if (startTimeListOwner != null)
					{
						if (startTimeListOwner.isLessOrEqualThan(slotStartTime) && slotStartTime.isLessThan(endTimeListOwner))
							row.setBackColor(Color.LightYellow);
					}
				
					flag = true;
					for(int j=0; j<bookedPeriods.size(); j++)
					{
						Object[] bookedPeriod =  (Object[]) bookedPeriods.get(j);
						if (slotStartTime.isLessThan((Time)bookedPeriod[1]) && slotEndTime.isGreaterThan((Time)bookedPeriod[0]))
						{
							row.setStatus("Booked (" + bookedPeriod[2].toString() + ")");
							row.setBackColor((((Boolean)bookedPeriod[3]).booleanValue() ? Color.PaletTurquoise : Color.White));
							slotStartTime = new Time(((Time)bookedPeriod[1]).getHour(), ((Time)bookedPeriod[1]).getMinute());
							flag = false;
							break;
						}
					}
					if (flag)
					{
						for(int j=0; j<excludedPeriods.size(); j++)
						{
							Time[] excludedPeriod  =  (Time[]) excludedPeriods.get(j);
							if (slotStartTime.isLessThan(excludedPeriod[1]) && slotEndTime.isGreaterThan(excludedPeriod[0]))
							{
								row.setStatus("Excluded");
								row.setBackColor(Color.LightGray);
								slotStartTime = new Time(((Time)excludedPeriod[1]).getHour(),((Time)excludedPeriod[1]).getMinute());
								flag = false;
								break;
							}
						}
						if (flag)
						{
							row.setStatus("Available");
							ArrayList arr = form.getGlobalContext().CcoSched.Rebooking.getData();
							for (int i = 0; i < form.MainGrid().getRows().size(); ++i)
							{
								if (i != form.MainGrid().getSelectedRowIndex())
								{
									Object[] data = (Object[])arr.get(i);
									if (((Date)data[1]).equals(date) && ((String)data[2]).equals(row.getSlots()) && ((String)data[3]).equals(session[0]) && ((String)data[4]).equals(session[1]))
									{
										alreadyBooked.add(row.getSlots());
										row.setBackColor(Color.PaletTurquoise);
									}
								}
							}
							slotStartTime = slotEndTime;
						}
					}
				}
			}
		}
//		#endregion

		form.NumberOfBookings().setValue(sessionAppointment.Tno_appts);
		form.NumberOfFirstAppointments().setValue(sessionAppointment.Tno_fappts);
		form.SessionList().setEnabled(form.SlotsGrid().getRows().size() > 0);
	}
	protected void OnPreviousDateClick() throws ims.framework.exceptions.PresentationLogicException
	{
		form.getGlobalContext().CcoSched.Booking.setSessionIndex(new Integer(form.getGlobalContext().CcoSched.Booking.getSessionIndex().intValue() - 1));
		SetSlots();
	}
	
	protected void OnNextDateClick() throws ims.framework.exceptions.PresentationLogicException
	{
		form.getGlobalContext().CcoSched.Booking.setSessionIndex(new Integer(form.getGlobalContext().CcoSched.Booking.getSessionIndex().intValue() + 1));			
		SetSlots();
	}
	
	protected void OnNumberOfAppointments() throws ims.framework.exceptions.PresentationLogicException
	{
		//if (form.NumberOfAppointments().getValue().intValue()== 0)
				//ShowMessage("Number of appointments must be greater then 0.");

		if(form.NumberOfAppointments().getValue() == null)
			form.NumberOfAppointments().setValue(new Integer(0));
			
		boolean b = (form.NumberOfAppointments().getValue().intValue() > 1 && form.ListOwner().getValue() != null);
		form.GenerateDates().setEnabled(b);
		form.Reset().setEnabled(b);
		form.RefreshAvailability().setEnabled(b);
		form.AvailabilityDetails().setEnabled(form.NumberOfAppointments().getValue().intValue() > 1);
		if (form.NumberOfAppointments().getValue().intValue() > 1)
		{
			form.Sequence().setVisible(true);
			form.Sequence().setValue(false);
			OnSequence();
		}
		else
		{
			form.Sequence().setVisible(false);
			form.Sequence().setValue(false);
			OnSequence();
			form.Mon().setValue(false);
			form.Tue().setValue(false);
			form.Wed().setValue(false);
			form.Thu().setValue(false);
			form.Fri().setValue(false);
			form.Sat().setValue(false);
			form.Sun().setValue(false);
		}
	}
	protected void OnSequence() throws ims.framework.exceptions.PresentationLogicException
	{
		boolean b = form.Sequence().getValue();
		form.Mon().setVisible(b);
		form.Tue().setVisible(b);
		form.Tue().setVisible(b);
		form.Wed().setVisible(b);
		form.Thu().setVisible(b);
		form.Fri().setVisible(b);
		form.Sat().setVisible(b);
		form.Sun().setVisible(b);
	}
	protected void OnResetClick() throws ims.framework.exceptions.PresentationLogicException
	{
		OnResetClick(true);
	}
	private void OnResetClick(boolean m_ClearData)
	{
		form.ChangeTime().getRows().clear();
		form.PreviousDate().setEnabled(false);
		form.NextDate().setEnabled(false);

		if (m_ClearData)
		{
			int rowDataIndex;
			if(furtherAppointment())
			{
				rowDataIndex = 0;
				clearApptData();
				//21/01/2005 - Clear the Calendar Selected Dates
				form.getGlobalContext().CcoSched.Booking.setCalendarSelectedDates(null);
			}
			else
				rowDataIndex = form.MainGrid().getSelectedRowIndex();
			if (form.getGlobalContext().CcoSched.Rebooking.getData().size() > 0 ) //WDEV-14515
			{
				Object[] data = (Object[])form.getGlobalContext().CcoSched.Rebooking.getData().get(rowDataIndex);
				//refactoring - moving the clear process to clearData method to allow reuse
				clearData(data);
//				data[1] = minDate;
//				data[2] = "";
//				data[3] = "";
//				data[4] = "";
				//Set the data back in the context as in C# does automatically
				SetDataInGlobalContext(data, rowDataIndex);
				//21/01/2005 - Remove the reset date in CalendarSelectedDates
				RemoveCalendarResetDate((Date)data[1]);
			}
			
			if(furtherAppointment() == false)
				form.MainGrid().getRows().get(rowDataIndex).setNewAppointment("");
			form.getLocalContext().setCheckedDate(null);
			form.getLocalContext().setCheckedTime(null);
			
			//26/10/2004 - Clear NewTimeContext
			form.getGlobalContext().CcoSched.Rebooking.setNewTimeList(new ArrayList());
			
			//---------------------------------------------------------
		}

		form.Calendar().setSelectedDay(null);
		form.Calendar().clearChecks();
		form.Calendar().clearConflicts();
//		form.Calendar().clearChecks();
//		form.Calendar().clearConflicts();
		form.Calendar().clearNoSlotDates();
		form.NumberOfConflicts().setValue("0");

		form.DateSelected().setValue("");
		form.ResourceSelected().setValue("");
		form.ResourceSelected().setTooltip("");//WDEV-14490
		form.LocationSelected().setValue("");
		form.NumResSelected().setValue("");
		form.SlotsGrid().getRows().clear();
		form.StartDate().setValue("");
		form.EndDate().setValue("");
		form.NumberOfBookings().setValue("");
		form.NumberOfFirstAppointments().setValue("");

		if(m_ClearData)
		{
			form.getGlobalContext().CcoSched.Booking.setDateSessionSlotsList(new ArrayList());
		}
		form.getGlobalContext().CcoSched.Booking.setSelectedSessions(new Hashtable());
		form.getGlobalContext().CcoSched.Booking.setSessionIndex(new Integer(0));
		//21/01/2005 - Check the Action button enable status
		form.bActions().setEnabled(isActionEnableable());
			
	}
	private boolean isActionEnableable()
	{
		if(form.Calendar().getSelectedDates().size() > 0)
			return true;
		//Check if there is a slot time set
		ArrayList data = form.getGlobalContext().CcoSched.Rebooking.getData();
		if(data != null)
		{
			for(int i=0; i<data.size(); i++)
			{
				//Check if there is at least one selected time
				Date appDate 	   = (Date)((Object[])data.get(i))[1];
				String defaultTime = (String)((Object[])data.get(i))[2];
				if(appDate != null && !appDate.equals(minDate))
				{
					if(defaultTime != null && defaultTime != "")
						return true;
				}
			}
		}
			
		return false;
	}
	private void RemoveCalendarResetDate(Date date)
	{
		ArrayList selectedDates = form.getGlobalContext().CcoSched.Booking.getCalendarSelectedDates();
		if(selectedDates != null)
		{
			for(int i=0; i<selectedDates.size(); i++)
			{
				if(((ActionSession)selectedDates.get(i)).getSessionDate().equals(date))
				{
					selectedDates.remove(i);
					break;
				}
			}
			//Set back the selectedDates to the context
			form.getGlobalContext().CcoSched.Booking.setCalendarSelectedDates(selectedDates);
		}
	}
	protected void onBActionsClick() throws PresentationLogicException 
	{
		form.getGlobalContext().CcoSched.Booking.setCalendarSelectedDates(GetSelectedCalendarDates());
		form.getGlobalContext().CcoSched.Booking.setSelectedActions(GetSelectedActions());
		engine.open(form.getForms().CcoSched.BookingAction);
	}
	private ArrayList GetSelectedCalendarDates()
	{
		//copy the old objects
		ArrayList selectedDates = form.getGlobalContext().CcoSched.Booking.getCalendarSelectedDates();
		
		Date date;
		boolean deleted = true;
		
		//Remove unselected dates (when the user selects a date, changes the action but then deselects that date
		do{
			deleted = false;
			if(selectedDates != null)
			{
				for(int i=0; i<selectedDates.size(); i++)
				{
					if(isDateSelected(((ActionSession)selectedDates.get(i)).getSessionDate()))
					{
						selectedDates.remove(i);
						deleted = true;
						break;
					}
				}
			}
		}
		while(deleted);
		
		if(selectedDates == null)
			selectedDates = new ArrayList();
		
		//Add the new dates depending from where the screen opened
		//Get the dates from the 
		if(furtherAppointment() || form.Calendar().getSelectedDates().size() > 1)
		{
			//Collect the dates from the grid
			for(int i=0; i<form.Calendar().getSelectedDates().size(); i++)
			{
				date = (Date)form.Calendar().getSelectedDates().get(i);
				String action_id = getCurrentActionSelected(date);
				if(furtherAppointment())
				{
					//Avoid adding duplicate dates
					if(!DateExists(date, selectedDates))
					{
						//Add a new ActionSession with the date, time and session
						ActionSession actionSession = new ActionSession(date, action_id, null, getActionData());
						//25/01/2005 - Set the action for the generated date
						//every selected date corresponds to a date (row) in the Main Grid
						if(furtherAppointment() == false)
						{
							String appt_id = form.MainGrid().getRows().get(i).getValue().Appt_id;
							actionSession.setAppt_id(i<form.MainGrid().getRows().size()?appt_id:"");
							actionSession.setSessionTime(getSessionTime(appt_id));
						}
						selectedDates.add(actionSession);
					}
				}
				else
				{
					//Avoid adding duplicate dates
					if(i<form.MainGrid().getRows().size())
					{
						String appt_id = form.MainGrid().getRows().get(i).getValue().Appt_id; 
						if(!ApptExists(appt_id , selectedDates))
						{
							//Add a new ActionSession with the date, time and session
							ActionSession actionSession = new ActionSession(date, action_id, null, getActionData());
							//25/01/2005 - Set the action for the generated date
							//every selected date corresponds to a date (row) in the Main Grid
							if(furtherAppointment() == false)
							{
								actionSession.setAppt_id(appt_id);
								actionSession.setSessionTime(getSessionTime(appt_id));
							}
								
							selectedDates.add(actionSession);
						}
					}
				}
			}
		}
		else
		{
			ArrayList data = form.getGlobalContext().CcoSched.Rebooking.getData();
			if(data != null)
			{
				Object[] dataObj;
				Sd_apptAppt_idRecord app;
				for(int i=0; i<data.size(); i++)
				{
					dataObj = (Object[])data.get(i);
					app = (Sd_apptAppt_idRecord)dataObj[0];
					date = (Date)dataObj[1];
					String action_id = GetActionID(app.Appt_id);
					if(!ApptExists(app.Appt_id, selectedDates) && !date.equals(minDate))
					{
						//Add a new ActionSession with the date, time and session
						ActionSession actionSession = new ActionSession(date, action_id, null, getActionData());
						actionSession.setAppt_id(app.Appt_id);
						actionSession.setSessionTime(getSessionTime(app.Appt_id));
						selectedDates.add(actionSession);
					}
				}
			}
		}
		
		return (ArrayList)selectedDates.clone();
	}
	private void clearTime(Date sessionDate, String appt_id)
	{
		ArrayList data = form.getGlobalContext().CcoSched.Rebooking.getData();
		Object[] dataObj;
		Sd_apptAppt_idRecord app;
		for(int i=0; i<data.size(); i++)
		{
			dataObj = (Object[])data.get(i);
			app = (Sd_apptAppt_idRecord)dataObj[0];
			Date date = (Date)dataObj[1];
			if(date.equals(sessionDate) && app.Appt_id.equals(appt_id))
			{
				//Clear the time
				dataObj[2] = "";
				break;
			}
		}
		form.getGlobalContext().CcoSched.Rebooking.setData(data);
	}
	private String getSessionTime(String appt_id)
	{
		ArrayList data = form.getGlobalContext().CcoSched.Rebooking.getData();
		if(data != null)
		{
			for(int i=0; i<data.size(); i++)
			{
				Object[] objData = (Object[])data.get(i);
				if(objData[0] != null)
				{
					if(((Sd_apptAppt_idRecord)objData[0]).Appt_id.equals(appt_id))
						return objData[2] != null?objData[2].toString():"";
				}
			}
		}
		return "";
	}
	
	private boolean isDateSelected(Date date)
	{
		ArrayList data = form.getGlobalContext().CcoSched.Rebooking.getData();
		if(data != null)
		{
			for(int i=0; i<data.size(); i++)
			{
				if(((Object[])data.get(i)).equals(date))
					return true;
			}
		}
		
		return false;
	}
//	Check to see if the date has been added in the list (has associated actioID) 
	private boolean DateExists(Date date, ArrayList selectedDates)
	{
		if(selectedDates != null)
		{
			for(int i=0; i<selectedDates.size(); i++)
			{
				if(((ActionSession)selectedDates.get(i)).getSessionDate().equals(date))
					return true;
			}
		}
		return false;
	}
	//Check to see if the date has been added in the list (has associated actioID) 
	private boolean ApptExists(String appt_id, ArrayList selectedDates)
	{
		if(selectedDates != null)
		{
			for(int i=0; i<selectedDates.size(); i++)
			{
				if(((ActionSession)selectedDates.get(i)).getAppt_id().equals(appt_id))
					return true;
			}
		}
		return false;
	}
	private ActionData getActionData()
	{
		ActionData actionData = new ActionData();
		Sd_appt appointments = form.getGlobalContext().CcoSched.Rebooking.getAppointments();
		String groupID 	  = appointments.DataCollection.get(0).First_appt_activity_gr;
		String activityID = appointments.DataCollection.get(0).First_appt_activity;
				
		if ((activityID.equals("-202") || activityID.equals("-207")) && form.Resource().getValue() == null)
		{
			if(form.Energy().getValue() != null)
				ShowMessage("Please select a resource.");
			return null;
		}

		String resourceID = new String();
		String listOwnerID = new String();
		if (activityID.equals("-202") || activityID.equals("-207"))
			resourceID = ((Sd_modactmc.Sd_modactmcRecord)form.Resource().getValue()).Mc_id;
		else
		{
			if (form.Resource().getValue() != null)
				resourceID = ((Sd_mc_act.Sd_mc_actRecord)form.Resource().getValue()).Mc_id;
			if (form.ListOwner().getValue() != null)
				listOwnerID = form.ListOwner().getValue().Staff_no;
		}

		actionData.setActivityID(activityID);
		actionData.setGroupID(groupID);
		actionData.setListOwnerID(listOwnerID);
		actionData.setResourceID(resourceID);
		
		return actionData;
	}
	
	private Hashtable getSession(Date selectedDate)
	{
		return getSession(selectedDate, "");
	}
	private Hashtable getSession(Date selectedDate, String appt_id)
	{
		ArrayList selectedDates = form.getGlobalContext().CcoSched.Booking.getCalendarSelectedDates();
		if(selectedDates == null)
			return null;
		ActionSession actionSession;
		for(int i=0; i<selectedDates.size(); i++)
		{
			actionSession = (ActionSession)selectedDates.get(i);
			if(actionSession.getSessionDate().equals(selectedDate))
			{
				//Check the appointment ID not only the date
				if(appt_id.equals("") == false)
				{
					if(appt_id.equals(actionSession.getAppt_id()))
						return actionSession.getSession();
				}
				else
					return actionSession.getSession();
			}
		}
		
		return null;
	}
	
	private String getCurrentActionSelected(Date selDate)
	{
		//If we have Further Appointment then get the actionID from the action record
		if(furtherAppointment())
		{
			if(form.getGlobalContext().CcoSched.TreatmentPlan.getTreatmentPlanActionsIsNotNull())
				return form.getGlobalContext().CcoSched.TreatmentPlan.getTreatmentPlanActions().Action_id;
		}
		else
		{
			return GetActionID(form.MainGrid().getValue().Appt_id);
		}
		
		return "";
	}
	private ArrayList GetSelectedActions()
	{
		ArrayList actions = new ArrayList();
		Sd_appt appointments = form.getGlobalContext().CcoSched.Rebooking.getAppointments();
		String groupID 	  = appointments.DataCollection.get(0).First_appt_activity_gr;
		String activityID = appointments.DataCollection.get(0).First_appt_activity;
		Sd_activity_action activityActions = form.getGlobalContext().CcoSched.ActivityView.getActions();
		if(activityActions == null)
			activityActions = getActivityAction();
		String actionID, actionTxt;
		
		if(activityActions != null)
		{
			for(int i=0; i< activityActions.DataCollection.count(); i++)
			{
				Sd_activity_action.Sd_activity_actionRecord activityAction = activityActions.DataCollection.get(i);
				//Check if the group and Activity match
				//17/02/2005 - don't add the records with the sched_flag = "N" (not schedulable)
				if(activityAction.Grp_id.equals(groupID) && activityAction.Activ_id.equals(activityID)
				   && !activityAction.Sched_flag.equals("N"))
				{
					actionID	= activityActions.DataCollection.get(i).Action_id;
					actionTxt   = activityActions.DataCollection.get(i).Action_nm;
					actions.add(new Object[]{actionID, actionTxt});
				}
			}
		}
		return actions;
	}
	private int GetIntervalTimeRequired(ActionSession actionSession)
	{
		int defaultInterval = form.getGlobalContext().CcoSched.Booking.getTimeRequired()== null?0:form.getGlobalContext().CcoSched.Booking.getTimeRequired().intValue();
		if(actionSession != null)
		{
			//Use the Group, Activity and Action and obtain the time required.
			Sd_activity_action activityactions = form.getGlobalContext().CcoSched.ActivityView.getActions();
			if(activityactions == null)
				activityactions = getActivityAction();
			for (int i = 0; i < activityactions.DataCollection.count(); i++)
			{
				Sd_activity_action.Sd_activity_actionRecord tmp = activityactions.DataCollection.get(i);
				if (tmp.Grp_id.equals(actionSession.getActionData().getGroupID()) && tmp.Activ_id.equals(actionSession.getActionData().getActivityID()) && tmp.Action_id.equals(actionSession.getAction()))
				{
					Integer si = GetIntegerFromString(tmp.Tim_req);
					if (si == null)
					{
						ShowMessage("Time required for the action is null.");
						return defaultInterval;
					}
					if (si.intValue() == 0)
					{
						ShowMessage("Time required for the action equals to 0.");
						return defaultInterval;
					}
					
					//form.getGlobalContext().CcoSched.Booking.setTimeRequired(si);
					return si.intValue();
				}
			}
		}
		//return default
		return defaultInterval;
	}
	
	//Checks and returns the time required for a date that have the actionID changed
	private int GetSlotTimeRequired(Date sessionDate)
	{
		ArrayList selectedDates = form.getGlobalContext().CcoSched.Booking.getCalendarSelectedDates();
		if(selectedDates != null)
		{
			ActionSession actionSession = null;
			//Find the Action Session for a specified date
			for(int i=0; i<selectedDates.size(); i++)
			{
				actionSession = (ActionSession)selectedDates.get(i);
				if(actionSession.getSessionDate().equals(sessionDate))
					return actionSession.getIntervalTimeRequired();
			}
		}

		return -1;
	}
	
	private Sd_activity_action getActivityAction()
	{
		Sd_activity_action actions = form.getGlobalContext().CcoSched.ActivityView.getActions(); 
		if (actions == null)
		{
			actions = (Sd_activity_action)domain.getDTOInstance(Sd_activity_action.class);
			actions.Filter.clear();
			actions.Filter.Act_ind = "Y";
			actions.Filter.Action_act_ind = "Y";
			Result result = actions.list();
			if (result != null)
			{
				engine.showMessage(result.getMessage());
				return null;
			}
			form.getGlobalContext().CcoSched.ActivityView.setActions(actions);
		}
		return actions;
	}
	
	protected void OnDateSelected(ims.framework.utils.Date date) throws ims.framework.exceptions.PresentationLogicException
	{
		if (date != null)
		{
			//Date dt = new Date(date.getYear(), date.getMonth(), date.getDay());
			form.getGlobalContext().CcoSched.Booking.setSelectedDate(date.copy());
			form.getGlobalContext().CcoSched.Booking.setSessionIndex(new Integer(0));
			SetSlots(form.MainGrid().getValue() != null?form.MainGrid().getValue().Appt_id:"");
		}
	}
	
	private void SetStartAndEndDate()
	{
		Date min = maxDate;
		Date max = minDate;

		ArrayList a = form.Calendar().getSelectedDates();
		if (a.size() == 0)
		{
			form.getGlobalContext().CcoSched.Booking.setStartDate(null);//Context.ContextBooking.ClearStartDate();
			form.getGlobalContext().CcoSched.Booking.setEndDate(null);//Context.ContextBooking.ClearEndDate();
		}
		else
		{
			for(int i=0; i<a.size(); i++)
			{
				Date dt = (Date)a.get(i);
				if (dt.isLessThan(min))
					min = new Date(dt.getYear(), dt.getMonth(), dt.getDay());
				if (dt.isGreaterThan(max))
					max = new Date(dt.getYear(), dt.getMonth(), dt.getDay());
			}
			form.getGlobalContext().CcoSched.Booking.setStartDate(min);
			form.getGlobalContext().CcoSched.Booking.setEndDate(max);
		}
	}
	
	protected void OnDateChecked(ims.framework.utils.Date date, boolean value) throws ims.framework.exceptions.PresentationLogicException
	{
		OnDateChecked(date, value, true, false);//m_Fire = true and m_ManualEvents = false by default
	}
	protected void OnDateChecked(ims.framework.utils.Date date, boolean value, boolean m_Fire, boolean m_ManualEvents) throws ims.framework.exceptions.PresentationLogicException
	{
		OnDateChecked(date, value, m_Fire, m_ManualEvents, false);
	}
	protected void OnDateChecked(ims.framework.utils.Date date, boolean value, boolean m_Fire, boolean m_ManualEvents, boolean bGenerated) throws ims.framework.exceptions.PresentationLogicException
	{
		int rowDataIndex = furtherAppointment()?getFurtherDataIndex(date):form.MainGrid().getSelectedRowIndex();
		Object[] data = (Object[])form.getGlobalContext().CcoSched.Rebooking.getData().get(rowDataIndex);
		if (value)
		{
			//Calculate datesNo for furtherAppointment
			//int datesNo = furtherAppointment()?getFractions():form.MainGrid().getRows().size();
			int datesNo;
			if(furtherAppointment())
			{
				datesNo = getFractions();
			}
			else
			{
				//If generated don't allow to uncheck the rest of the dates
				if(bGenerated)
					datesNo = form.Calendar().getSelectedDates().size();
				else
					datesNo = form.Calendar().getSelectedDates().size()-1;
			}
				
			if (datesNo == 1)
			{
				Date o = form.getLocalContext().getCheckedDate();
				//Uncheck the previous selected date if it's not the selected date itself
				if(o != null && !date.equals(o))
				{
					form.Calendar().uncheck((Date)o);
					OnDateChecked(o, false, m_Fire, m_ManualEvents);
				}
			}
			else if(datesNo > 1)
			{
				//21/10/2004 - if the number of selected dates exceeds the number of checked dates 
				//than don't allow to check any other dates 
				if(form.Calendar().getSelectedDates().size() > datesNo)
				{
					form.Calendar().uncheck(date);
					//TODO - Please if we have to manually call the event
					OnDateChecked(date, false, m_Fire, m_ManualEvents);
					return;
				}
				//---------------------------------------------------------------------------------
			}
						
			form.getLocalContext().setCheckedDate(date);
			data[1] = date;
			
			//Fill Session Details - 07.06.2004 -----------------------------------------
			Hashtable ht = form.getGlobalContext().CcoSched.Booking.getSelectedSessions();
			if (ht == null)
			{
				ht = new Hashtable();
				form.getGlobalContext().CcoSched.Booking.setSelectedSessions(ht);
			}
			Object obj = form.getGlobalContext().CcoSched.Booking.getSessionList().get(date.toString(DateFormat.ISO));
			if(obj != null)
			{
				if (ht.containsKey(date.toString(DateFormat.ISO)))
					ht.put(date.toString(DateFormat.ISO), obj);
				else
					ht.put(date.toString(DateFormat.ISO), obj);
			}
			//End fill details ----------------------------------------------------------
		}
		else
		{
			form.getLocalContext().setCheckedDate(null);//UIEngine.Context.Remove("10020:Checked date");
			data[1] = minDate;
			
			//Fill Session Details - 07.06.2004 -----------------------------------------
			Hashtable ht = form.getGlobalContext().CcoSched.Booking.getSelectedSessions();
			if (ht != null)
				form.getGlobalContext().CcoSched.Booking.getSelectedSessions().remove(date.toString(DateFormat.ISO));

//			ArrayList ds = form.getGlobalContext().CcoSched.Booking.getDateSessionSlotsList();
//			if (ds != null)
//			{
//				ArrayList ar = new ArrayList();
//				for(int i=0; i<ds.size(); i++)
//				{
//					DateSessionSlotsClass d = (DateSessionSlotsClass)ds.get(i); 
//					if(d.getDate().equals(date))
//						ar.add(d);
//				}
//				
//				for(int i=0; i<ar.size(); i++)
//					ds.remove(ar.get(i));
//
//
//				if(form.getGlobalContext().CcoSched.Booking.getSelectedDate() != null && date.equals(form.getGlobalContext().CcoSched.Booking.getSelectedDate()))
//					SetSlots();
//			}
			//End fill details ----------------------------------------------------------
			
//			07/01/2005 - Remove the date from the ActionSession if is there
			ArrayList selectedDates = form.getGlobalContext().CcoSched.Booking.getCalendarSelectedDates();
			if(selectedDates != null)
			{
				for(int i=0; i<selectedDates.size(); i++)
				{
					if(((ActionSession)selectedDates.get(i)).getAction().equals(date))
					{
						if(furtherAppointment() == false)
						{
							//Add extra checking if not opened from further assessment
							//Check the appt_id
							if(((ActionSession)selectedDates.get(i)).getAppt_id().equals(form.MainGrid().getRows().get(rowDataIndex).getValue().Appt_id))
							{
								selectedDates.remove(i);
								break;
							}
						}
						else
						{
							selectedDates.remove(i);
							break;
						}
					}
				}
			}	
			//End remove code
		}
		if (!m_ManualEvents)
		{
			data[2] = "";
			data[3] = "";
			data[4] = "";
			form.getLocalContext().setCheckedTime(null);
			if(furtherAppointment() == false)
			{
				form.MainGrid().getRows().get(rowDataIndex).setNewAppointment("");
			}
		}
		SetDataInGlobalContext(data, rowDataIndex);
		SetStartAndEndDate();
		//21/01/2004 - Enable Action button
		form.bActions().setEnabled(isActionEnableable());
		//The second condition (!value && date.equals(form.getGlobalContext().CcoSched.Booking.getSelectedDate())))
		//comes from the selected Session Details part
		if (form.getGlobalContext().CcoSched.Booking.getSelectedDate() != null && (m_Fire || (!value && date.equals(form.getGlobalContext().CcoSched.Booking.getSelectedDate()))))
			SetSlots(furtherAppointment()?"":form.MainGrid().getValue().Appt_id);
	}
	
	protected void OnMonthSelected(ims.framework.utils.Date date) throws ims.framework.exceptions.PresentationLogicException
	{
		Date dateSelected = new Date(form.Calendar().getCurrentMonth().getYear(), form.Calendar().getCurrentMonth().getMonth(), form.Calendar().getCurrentMonth().getDay()); 
		for (int i = 1; i <= dateSelected.getNumberOfDaysInTheMonth(); ++i)
			form.Calendar().addNoSessionDates(new Date(form.Calendar().getCurrentMonth().getYear(), form.Calendar().getCurrentMonth().getMonth(), i));

		GetAvailability();
	}
	protected void OnResource()throws ims.framework.exceptions.PresentationLogicException
	{
		OnResource(false);
	}
	protected void OnResource(boolean m_ManualEvents) throws ims.framework.exceptions.PresentationLogicException
	{
		//26/11/2004 - accommodate further appointment with minimum changes
		int rowDataIndex = furtherAppointment()?0:form.MainGrid().getSelectedRowIndex();
		Object[] data = (Object[]) form.getGlobalContext().CcoSched.Rebooking.getData().get(rowDataIndex);
		if(form.Resource().getValue() != null &&  form.Resource().getValue() instanceof Sd_modactmc.Sd_modactmcRecord)
		{
			data[6] = ((Sd_modactmc.Sd_modactmcRecord)form.Resource().getValue()).Mc_id;
		}
		else
		{
			if(form.Resource().getValue() != null && form.Resource().getValue() instanceof Sd_mc_act.Sd_mc_actRecord)
				data[6] = ((Sd_mc_act.Sd_mc_actRecord)form.Resource().getValue()).Mc_id;
			else
			{
				ShowMessage("Please select a resource.");
				return;
			}	
		}
		
		SetDataInGlobalContext(data, rowDataIndex);

		boolean m_ClearData = ((String)data[4]).equals("");
		OnResetClick(m_ClearData);
		if (!m_ManualEvents)
			GetAvailability();
		//10/02/2004 - Get the machine_id for obtaining MODAL_ID 
		form.getGlobalContext().CcoSched.Rebooking.setMachine_Id(data[6].toString());
	}
	private void GetAvailability()
	{
		ShowSequence(0);

		String groupID = form.getLocalContext().getGroupId();//UIEngine.Context.Get("10020:groupID") as string;
		String activityID = form.getLocalContext().getActivityID();//UIEngine.Context.Get("10020:activityID") as string;
		String actionID = getSessionActions(); 
		if (activityID != null && (activityID.equals("-202") || activityID.equals("-207"))&& form.Resource().getValue() == null)      //wdev-15835
		{
			if (form.Resource().getValue() == null)
			{
				ShowMessage("Please select a resource.");
				return;
			}
		}

		if (form.ListOwner().getValue() == null)
			form.getGlobalContext().CcoSched.Booking.setListOwner(null);//Context.ContextBooking.ClearListOwner();
		else
			form.getGlobalContext().CcoSched.Booking.setListOwner(form.ListOwner().getValue());

		if (form.Resource().getValue() == null)
			form.getGlobalContext().CcoSched.Booking.setResourceSelected(null);//Context.ContextBooking.ClearResourceSelected();
		else
			form.getGlobalContext().CcoSched.Booking.setResourceSelected(form.Resource().getValue());

		Date dateInitial = new Date(form.Calendar().getCurrentMonth().getYear(), form.Calendar().getCurrentMonth().getMonth(), 1);
		//DateTime now = new DateTime(DateTime.Now.Year, DateTime.Now.Month, DateTime.Now.Day, 0, 0, 0);
		//if (dateInitial < now)
		//	dateInitial = now;
		Date dateEnd = new Date(form.Calendar().getCurrentMonth().getYear(), form.Calendar().getCurrentMonth().getMonth(), new Date(form.Calendar().getCurrentMonth().getYear(), form.Calendar().getCurrentMonth().getMonth(), 1).getNumberOfDaysInTheMonth());

		Sd_sess_avail sessionAvailability = (Sd_sess_avail) domain.getDTOInstance(Sd_sess_avail.class);
		sessionAvailability.Filter.clear();
		sessionAvailability.Filter.Grp_id 	= groupID;
		sessionAvailability.Filter.Activ_id = activityID;
		sessionAvailability.Filter.Sess_dt  = dateInitial.toString(DateFormat.ISO) + "|" + dateEnd.toString(DateFormat.ISO);
		if(actionID != null && actionID.length() > 0)
			sessionAvailability.Filter.Act_id  = actionID;  
		
		// HCP
		if (activityID != null && (activityID.equals("-202") || activityID.equals("-207")))    //wdev-15835
			sessionAvailability.Filter.Mc_id = ((Sd_modactmc.Sd_modactmcRecord)form.Resource().getValue()).Mc_id;
		else
		{
			if (form.ListOwner().getValue() != null)
				sessionAvailability.Filter.Lo_id = form.ListOwner().getValue().Staff_no;
			if (form.Resource().getValue() != null)
				sessionAvailability.Filter.Mc_id = ((Sd_mc_act.Sd_mc_actRecord)form.Resource().getValue()).Mc_id;
		}
		Result result = sessionAvailability.list();
		if (result != null)
		{
			ShowMessage(result.getMessage());
			return;
		}

		Hashtable sessionList = new Hashtable();
		for(int i=0; i<sessionAvailability.DataCollection.count(); i++)
		{
			Sd_sess_avail.Sd_sess_availRecord sa =  sessionAvailability.DataCollection.get(i);
			Date sdt = GetDateFromString(sa.Sess_dt);
			if (sdt == null)
			{
				ShowMessage("Session date is null.");
				return;
			}
			Date date = new Date(sdt.getYear(), sdt.getMonth(), sdt.getDay());
			Integer si = GetIntegerFromString(sa.Rem_tm);
			if (si == null)
			{
				ShowMessage("Internal error: No value for remaining time.");
				return;
			}
			int remaining = si.intValue();
			Integer ttm = GetIntegerFromString(sa.Total_tm);
			if (ttm == null)
			{
				ShowMessage("Internal error: No value for total time.");
				return;
			}
			int total = ttm.intValue();
			if (remaining > total)
			{
				ShowMessage("Internal error: Error calculating remaining or total time.");
				return;
			}
			form.Calendar().addPercentage(date, (int)((total - remaining) * 100.0f / total));
			if (sa.Sessiond_ids.length() == 0)
			{
				ShowMessage("Internal error: No session details return for " + date.toString(DateFormat.STANDARD));
				// disable all;
				return;
			}
			sessionList.put(date.toString(DateFormat.ISO), sa.Sessiond_ids);
		}

		// Set the dates that do not have sessions.
		form.Calendar().clearNoSessionDates();
		Date dateSession = new Date(dateInitial.getYear(), dateInitial.getMonth(), dateInitial.getDay());
		while (dateSession.isLessOrEqualThan(dateEnd))
		{
			if (!sessionList.containsKey(dateSession.toString(DateFormat.ISO)))
				form.Calendar().addNoSessionDates(new Date(dateSession));
			dateSession.addDay(1);
		}

		if (form.getGlobalContext().CcoSched.Booking.getSessionList() != null)
		{
			Enumeration keysEnum = sessionList.keys();
			while(keysEnum.hasMoreElements())
			{	
				String o  = (String)keysEnum.nextElement();
				if (sessionList.containsKey(o))
				{
					form.getGlobalContext().CcoSched.Booking.getSessionList().put(o, sessionList.get(o));
					form.getGlobalContext().CcoSched.Booking.setSessionList(form.getGlobalContext().CcoSched.Booking.getSessionList());
				}
				else
				{
					form.getGlobalContext().CcoSched.Booking.getSessionList().put(o,sessionList.get(o));
					form.getGlobalContext().CcoSched.Booking.setSessionList(form.getGlobalContext().CcoSched.Booking.getSessionList());
				}
			}
		}
		else
			form.getGlobalContext().CcoSched.Booking.setSessionList(sessionList);
			
	}
	protected void OnListOwner() throws ims.framework.exceptions.PresentationLogicException
	{
		OnListOwner(false);
	}
	private void OnListOwner(boolean m_ManualEvents)
	{
		int rowDataIndex = furtherAppointment()?0:form.MainGrid().getSelectedRowIndex();
		Object[] data = (Object[])form.getGlobalContext().CcoSched.Rebooking.getData().get(rowDataIndex);
		if (form.ListOwner().getValue() != null)
		{
			data[5] = form.ListOwner().getValue().Staff_no;
			data[7] = form.ListOwner().getValue().Staffactiv_id;
		}
		else
		{
			data[5] = "";
			data[7] = "";
		}
		SetDataInGlobalContext(data, rowDataIndex);
		boolean m_ClearData = ((String)data[4]).equals("");
		OnResetClick(m_ClearData);
		if (!m_ManualEvents)
			GetAvailability();
	}
	protected void OnMainGrid() throws ims.framework.exceptions.PresentationLogicException
	{
		form.ChangeTime().getRows().clear();
		form.PreviousDate().setEnabled(false);
		form.NextDate().setEnabled(false);
		form.DateSelected().setValue("");
		form.ResourceSelected().setValue("");
		form.ResourceSelected().setTooltip("");//WDEV-14490
		form.LocationSelected().setValue("");
		form.NumResSelected().setValue("");
		form.NumberOfBookings().setValue("");
		form.NumberOfFirstAppointments().setValue("");

		form.ListOwner().clear();
		form.getLocalContext().setGroupId(null);//UIEngine.Context.Remove("10020:groupID");
		form.getLocalContext().setActivityID(null);//UIEngine.Context.Remove("10020:activityID");
		form.getLocalContext().setActionId(null);
		form.getLocalContext().setCheckedDate(null);//UIEngine.Context.Remove("10020:Checked date");
		form.getLocalContext().setCheckedTime(null);//UIEngine.Context.Remove("10020:Checked time");

		form.Dose().setValue(null);
//		form.Fractions().setValue(null);
		form.Duration().setValue(null);
		form.Modality().setValue(null);
		form.Energy().setValue(null);
		form.EnergyUnit().setValue(null);
		form.Resource().clear();
		
		OnSequence();
			
		Modality modalityLkp = new Modality();
		int typeId = modalityLkp.getTypeId();
		LookupInstanceCollection modalityInstColl;
		modalityInstColl = domain.getLookupService().getLookupCollection(typeId, ClassHelper.getLookupCollectionClass(typeId), ClassHelper.getLookupClass(typeId), false, true);
		
		Unit unitLkp = new Unit();
		int unittypeId = unitLkp.getTypeId();
		LookupInstanceCollection unitInstColl;
		unitInstColl = domain.getLookupService().getLookupCollection(unittypeId, ClassHelper.getLookupCollectionClass(unittypeId), ClassHelper.getLookupClass(unittypeId), false, true);

		
		boolean m_ManualEvents = false;
		Object[] data = (Object[])form.getGlobalContext().CcoSched.Rebooking.getData().get(form.MainGrid().getSelectedRowIndex());
		if (!((String)data[4]).equals(""))
			m_ManualEvents = true;
//		#region Populate List Owner
		Sd_session sessions = (Sd_session) domain.getDTOInstance(Sd_session.class);
		sessions.Filter.clear();
		sessions.Filter.Prfile_sess_id = form.MainGrid().getValue().Prfile_sess_id;
		Result result = sessions.get();
		if (result != null)
		{
			ShowMessage(result.getMessage());
			return;
		}
		if (sessions.DataCollection.count() == 0)
		{
			ShowMessage("Internal error: failed to get session detail.");
			return;
		}

		String groupID = sessions.DataCollection.get(0).Grp_id;
		String activityID = sessions.DataCollection.get(0).Activ_id;

		form.getLocalContext().setGroupId(groupID);
		form.getLocalContext().setActivityID(activityID);

		//Code refactoring - replace the code below, with the method
		if(loadListOwner(groupID, activityID) == false)
			return;
//		Sd_activstaff activstaff = (Sd_activstaff) domain.getDTOInstance(Sd_activstaff.class);
//		activstaff.Filter.clear();
//		activstaff.Filter.Grp_id = groupID;
//		activstaff.Filter.Activ_id = activityID;
//		activstaff.Filter.Act_indstf = "Y";
//		result = activstaff.list();
//		if (result != null)
//		{
//			ShowMessage(result.getMessage());
//			return;
//		}
//
//		for(int i=0; i<activstaff.DataCollection.count(); i++)
//			form.ListOwner().newRow(activstaff.DataCollection.get(i), activstaff.DataCollection.get(i).Staff_name);

		//WDEV-16945
		
//		#region Populate Resources
		String actionID = GetActionID(form.MainGrid().getValue().Appt_id);
		
		if (actionID.equals(""))
		{
			ShowMessage("Internal error: No appropriate action for this booking.");
			return;
		}
	
		//Set the Action ID in the context
		form.getLocalContext().setActionId(actionID);
		
		String selectedResourceID;
		if (form.getLocalContext().getSelectedResource() != null)
		{
			if (form.getLocalContext().getSelectedResource() instanceof Sd_modactmc.Sd_modactmcRecord)
                selectedResourceID = ((Sd_modactmc.Sd_modactmcRecord)form.getLocalContext().getSelectedResource()).Mc_id;
			else
				selectedResourceID = ((Sd_mc_act.Sd_mc_actRecord)form.getLocalContext().getSelectedResource()).Mc_id;
		}
		else
			selectedResourceID = (((String)data[4]).equals("") ? form.MainGrid().getValue().Mc_id : (String)data[6]);

		data[6] = selectedResourceID;
		SetDataInGlobalContext(data, form.MainGrid().getSelectedRowIndex());

		Resource resource = new Resource();
		resource.setGroupID(groupID);
		resource.setActivityID(activityID);
		resource.setActionID(actionID);
		resource.setManualEvents(m_ManualEvents);
		resource.setSelectedResourceID(selectedResourceID);
		//Refactoring loading the resources as we have to reuse the code
		loadResource(resource);
		//end WDEV-16945
		
//		#region 22/08/2003 - Kevin's requirement - if  lo_id has a value - display it in List Owner
		if(!form.MainGrid().getValue().Lo_id.equals(""))
		{
			for(int i=0; i<form.ListOwner().getValues().size(); i++)
				if(((Sd_activstaff.Sd_activstaffRecord)form.ListOwner().getValues().get(i)).Staff_no.equals(form.MainGrid().getValue().Lo_id))
				{
					form.ListOwner().setValue((Sd_activstaff.Sd_activstaffRecord)form.ListOwner().getValues().get(i));
					OnListOwner(m_ManualEvents);
					break;
				}
		}
//		#endregion

		String s = form.getLocalContext().getTreatmentPlanAction();
		if (s != null && s.equals(""))
		{
			if (!((String)data[4]).equals(""))
			{
				String str = (String)data[5];
				for(int i=0; i<form.ListOwner().getValues().size(); i++)
				{
					Sd_activstaff.Sd_activstaffRecord tmp = (Sd_activstaff.Sd_activstaffRecord)form.ListOwner().getValues().get(i);
					if (tmp.Staff_no.equals(str))
					{
						form.ListOwner().setValue(tmp);
						OnListOwner(m_ManualEvents);
						//Ask Kevin - about Action_Id
						break;
					}
				}
			}
		}
		else
		{
			PatTreatPlanActionVo tpa = form.getLocalContext().getPatTreatmentPlanAction();


			// set default value
			String str = ((String)(data[4])).equals("") ? tpa.getTreatingConsultantIsNotNull()?tpa.getTreatingConsultant().getID_HcpIsNotNull()?tpa.getTreatingConsultant().getID_Hcp().toString():"":"" : (String)data[5];
			
			for(int i=0; i<form.ListOwner().getValues().size(); i++)
			{
				Sd_activstaff.Sd_activstaffRecord tmp = (Sd_activstaff.Sd_activstaffRecord)form.ListOwner().getValues().get(i);
				if (tmp.Staff_no.equals(str))
				{
					form.ListOwner().setValue(tmp);
					OnListOwner(m_ManualEvents);
					data[5] = str;
					data[7] = tmp.Staffactiv_id;
					SetDataInGlobalContext(data, form.MainGrid().getSelectedRowIndex());
					break;
				}
			}
			Integer di = tpa.getTl_dose();
			form.Dose().setValue(di);

			//The Fractions are now equal with a count on appointments
//			di = GetIntegerFromString(tpa.DataCollection.get(0).Tl_fractions);
//			form.Fractions().setValue(di);

			di = tpa.getTl_duration();
			form.Duration().setValue(di);
			
//			Go_ptplact tpa = (Go_ptplact) domain.getDTOInstance(Go_ptplact.class);
//			tpa.Filter.clear();
//			tpa.Filter.Pt_act_id = s;
//
//			result = tpa.get();
//			if (result != null)
//			{
//				ShowMessage(result.getMessage());
//				return;
//			}
//			if (tpa.DataCollection.count() == 0)
//			{
//				ShowMessage("Internal error: failed to get treatment plan action.");
//				return;
//			}
//
//			// set default value
//			String str = ((String)(data[4])).equals("") ? tpa.DataCollection.get(0).Act_consult : (String)data[5];
//			
//			for(int i=0; i<form.ListOwner().getValues().size(); i++)
//			{
//				Sd_activstaff.Sd_activstaffRecord tmp = (Sd_activstaff.Sd_activstaffRecord)form.ListOwner().getValues().get(i);
//				if (tmp.Staff_no.equals(str))
//				{
//					form.ListOwner().setValue(tmp);
//					OnListOwner(m_ManualEvents);
//					data[5] = str;
//					data[7] = tmp.Staffactiv_id;
//					SetDataInGlobalContext(data, form.MainGrid().getSelectedRowIndex());
//					break;
//				}
//			}
//			Integer di = GetIntegerFromString(tpa.DataCollection.get(0).Tl_dose);
//			form.Dose().setValue(di);
//
//			//The Fractions are now equal with a count on appointments
////			di = GetIntegerFromString(tpa.DataCollection.get(0).Tl_fractions);
////			form.Fractions().setValue(di);
//
//			di = GetIntegerFromString(tpa.DataCollection.get(0).Tl_dur);
//			form.Duration().setValue(di);
		}
//		#endregion
		ShowExternalBeem(activityID.equals("-202") || activityID.equals("-207"));
//		#region Modality
		if (activityID.equals("-202") || activityID.equals("-207"))
		{
			if (form.MainGrid().getValue().Mc_id.equals(""))
			{
				ShowMessage("Internal error: No machine specified.");
				return;
			}
			Sd_mc machines = (Sd_mc) domain.getDTOInstance(Sd_mc.class);
			machines.Filter.clear();
			machines.Filter.Mc_id = form.MainGrid().getValue().Mc_id;
			result = machines.get();
			if (result != null)
			{
				ShowMessage(result.getMessage());
				return;
			}
			if (machines.DataCollection.count() == 0)
			{
				ShowMessage("Internal error: failed to get machine information.");
				return;
			}
			for(int i=0; i<machines.DataCollection.get(0).Modal_idCollection.count(); i++)
			{	
				Sd_mc.Sd_mcModal_idRecord modality  = machines.DataCollection.get(0).Modal_idCollection.get(i);// Sd_mcCollection[0].Modal_idCollection
				if (modality.Modal_id.equals(form.MainGrid().getValue().Modality_id))
				{
					if (modality.Modal_type_id.equals(""))
					{
						ShowMessage("Internal error: No modality type specified.");
						return;
					}
					if (modality.Energy.equals(""))
					{
						ShowMessage("Internal error: No energy value specified.");
						return;
					}
					if (modality.Energy_unit.equals(""))
					{
						ShowMessage("Internal error: No energy unit specified.");
						return;
					}
                    form.Modality().setValue(getModalityLkp(modalityInstColl,modality.Modal_type_id));
					Float dd = GetFloatFormString(modality.Energy);
					form.Energy().setValue(dd);
                    form.EnergyUnit().setValue(getUnitLkp(unitInstColl, modality.Energy_unit));
					break;
				}
			}
		}
//		#endregion
	
//		if (activityID.equals("-202") || activityID.equals("-207"))
//		{
//			Sd_modactmc modactmc = (Sd_modactmc) domain.getDTOInstance(Sd_modactmc.class);
//			modactmc.Filter.clear();
//			modactmc.Filter.Modal_type_id = form.Modality().getValue();
//			modactmc.Filter.Energy = form.Energy().getValue() != null?form.Energy().getValue().toString():"";
//			modactmc.Filter.Energy_unit = form.EnergyUnit().getValue();
//			modactmc.Filter.Action_id = actionID;
//			result = modactmc.list();
//			if (result != null)
//			{
//				ShowMessage(result.getMessage());
//				return;
//			}
//			for (int i = 0; i < modactmc.DataCollection.count(); i++)
//			{
//				boolean exist = false;
//				for(int j=0; j<form.Resource().getValues().size(); j++)
//				{
//					if (modactmc.DataCollection.get(i).Mc_id.equals(((Sd_modactmc.Sd_modactmcRecord)form.Resource().getValues().get(j)).Mc_id))
//						exist = true;						
//				}
//				if (!exist)
//				{
//					form.Resource().newRow(modactmc.DataCollection.get(i), modactmc.DataCollection.get(i).Mc_nm);
//					if (modactmc.DataCollection.get(i).Mc_id.equals(selectedResourceID))
//					{
//						form.Resource().setValue(modactmc.DataCollection.get(i));
//						OnResource(m_ManualEvents);
//					}
//				}
//			}
//		}
//		else
//		{
//			Sd_mc_act resource_act = (Sd_mc_act) domain.getDTOInstance(Sd_mc_act.class);
//			resource_act.Filter.clear();
//			resource_act.Filter.Group_id = groupID;
//			resource_act.Filter.Activity_id = activityID;
//			resource_act.Filter.Action_id = actionID;
//			result = resource_act.list();
//			if (result != null)
//			{
//				ShowMessage(result.getMessage());
//				return;
//			}
//			for (int i = 0; i < resource_act.DataCollection.count(); i++)
//			{
//				boolean exist = false;
//				for(int j=0; j<form.Resource().getValues().size(); j++)
//				{
//					if (resource_act.DataCollection.get(i).Mc_id.equals(((Sd_mc_act.Sd_mc_actRecord)form.Resource().getValues().get(j)).Mc_id))
//						exist = true;						
//				}
//				if (!exist)
//				{
//					form.Resource().newRow(resource_act.DataCollection.get(i), resource_act.DataCollection.get(i).Mc_name);
//					if (resource_act.DataCollection.get(i).Mc_id.equals(selectedResourceID))
//					{
//						form.Resource().setValue(resource_act.DataCollection.get(i));
//						OnResource(m_ManualEvents);
//					}
//				}
//			}
//		}
//
//		#endregion
		//Refactoring loading the Time Required and Interval Required
		loadTimeIntervalRequired(groupID, activityID, actionID);
		
//		#region Time Required and Interval Required
//		Sd_activity_action activityAction = (Sd_activity_action) domain.getDTOInstance(Sd_activity_action.class);
//		activityAction.Filter.clear();
//		activityAction.Filter.Grp_id = groupID;
//		activityAction.Filter.Activ_id = activityID;
//
//		result = activityAction.list();
//		if (result != null)
//		{
//			ShowMessage(result.getMessage());
//			return;
//		}
//
//		for(int j=0; j<activityAction.DataCollection.count(); j++)
//		{
//			Sd_activity_action.Sd_activity_actionRecord a = activityAction.DataCollection.get(j);
//			if (a.Action_id.equals(actionID))
//			{
//				Integer i = GetIntegerFromString(a.Int_req);
//				form.getGlobalContext().CcoSched.Booking.setIntervalRequired(i ==null ? new Integer(0) : i);
//				i = GetIntegerFromString(a.Tim_req);
//				form.getGlobalContext().CcoSched.Booking.setTimeRequired(i ==null? new Integer(0) : i);		
//			}
//		}
//		#endregion

		if (!((String)data[4]).equals(""))
		{
			form.Calendar().setSelectedDay((Date)data[1]);
			//17/01/2005 - call manually OnDateSelected
			OnDateSelected((Date)data[1]);
			//----------------------
			boolean m_Fire = false;
			form.Calendar().check((Date)data[1]);
			OnDateChecked((Date)data[1], true, m_Fire, m_ManualEvents);
			form.getLocalContext().setCheckedDate((Date)data[1]);
			String tmp2 = new String((String)data[2]);
			for (int i = 0; i < form.SlotsGrid().getRows().size(); ++i)
				if (tmp2.equals(form.SlotsGrid().getRows().get(i).getSlots()))
				{
					form.SlotsGrid().getRows().get(i).setSelect(true);
					OnGridCheckBoxClicked(2	, form.SlotsGrid().getRows().get(i), true, m_ManualEvents);
					form.getLocalContext().setCheckedTime(tmp2);
					break;
				}
			// if not found, clear everything????
			m_ManualEvents = false;
		}
		
		//Code added - 11/10/04
		GetAvailability();
	}
	
	private Unit getUnitLkp(LookupInstanceCollection unitInstColl, String energy_unit) 
	{
		for (int i=0;i<unitInstColl.size();i++) {
			LookupInstVo element = unitInstColl.getIndex(i);
			
			if (element.getID() == new Integer(energy_unit).intValue())
				return (Unit)element;
		}
		return null;
	}
	private Modality getModalityLkp(LookupInstanceCollection modalityInstColl, String modal_type_id) 
	{
		for (int i=0;i<modalityInstColl.size();i++) {
			LookupInstVo element = modalityInstColl.getIndex(i);
			
			if (element.getID() == new Integer(modal_type_id).intValue())
				return (Modality)element;
		}
		return null;
	}
	protected void onGrdFurtherApptSelectionChanged() throws PresentationLogicException 
	{
		// TODO Auto-generated method stub
		//Date date  = form.grdFurtherAppt().getv
		OnDateSelected(form.grdFurtherAppt().getValue());

	}
	protected void OnConfirm() throws ims.framework.exceptions.PresentationLogicException
	{
		boolean flag = false;
		
		if(form.NumberOfAppointments().isVisible() && (form.NumberOfAppointments().getValue() == null || form.NumberOfAppointments().getValue().intValue() < 1))
		{
			ShowMessage("Number of appointments must be greater than 0.");
			return;
		}
		
		if(furtherAppointment())
		{
			//Check the number of appointments
			int numAppointments = (form.Fractions().getValue() != null ? form.Fractions().getValue().intValue() : 0); //WDEV-16943
			int numSelectedDates = form.Calendar().getSelectedDates().size();

			if (numSelectedDates < numAppointments || SelectedDatesNoSlots())
			{
				ShowMessage("Insufficient number of selected appointments.");
				return;
			}
			if (numSelectedDates > numAppointments)
			{
				ShowMessage("Excess number of selected appointments.");
				return;
			}
			
			if (SetConflicts() == Conflict.Hard)
			{
				ShowMessage("Insufficient privileges.");
				return;
			}

			//end check
			
			populateCommonDetails();
			ArrayList data = form.getGlobalContext().CcoSched.Rebooking.getData();
			//TODO - check if there is any data[4] - SessionDetailsID (as in Rebooking Confirmation)?
			for(int i=0; i<data.size(); i++)
			{
				Object[] dataMember = (Object[])data.get(i);
				if (!((String)dataMember[4]).equals(""))
				{
					flag = true;
					break;
				}
			}
		}
		else
		{
			for (int i = 0; i < form.MainGrid().getRows().size(); ++i)
				if (!form.MainGrid().getRows().get(i).getNewAppointment().equals(""))
				{
					flag = true;
					break;
				}

			int i = 0;
			ArrayList dateSessionSlotsList = form.getGlobalContext().CcoSched.Booking.getDateSessionSlotsList();
			if (dateSessionSlotsList != null)
				for (int j = 0; j < dateSessionSlotsList.size(); ++j)
					i += ((DateSessionSlotsClass)dateSessionSlotsList.get(j)).getSlotList().size();			
			
			int fractions = (form.Fractions().isVisible() && form.Fractions().getValue()!=null ? form.Fractions().getValue().intValue() : form.NumberOfAppointments().getValue().intValue());//WDEV-15276
					
			if (dateSessionSlotsList!=null)
			{
			
				//different BR for rebooking canceled sequence of appts, will check for 0 only, as in older version booking is allowed for individual 
				//appointment cancellations
				if (i == 0)
				{
					ShowMessage("Insufficient number of selected appointments with slot.");
					return;
				}
				if (i > fractions)
				{
					ShowMessage("Excess number of selected appointments with slot.");
					return;
				}
				
				if (SetConflicts() == Conflict.Hard)
				{
					ShowMessage("Insufficient privileges.");
					return;
				}

			}
			
			//27/01/2005 - Get the common details
			getCommonDetails();
			
			//14/02/2005 - Check that every date has a slot selected
			if(isIncompleteAppt() && !EnoughSlotsSelected())
				return;
			//Set the ArrayList of Modality, energy and Unit
			String activityID = form.getGlobalContext().CcoSched.Rebooking.getAppointments().DataCollection.get(0).First_appt_activity;
			if(activityID.equals("-202") || activityID.equals("-207"))
			{
				ArrayList Modality = new ArrayList();
				Modality.add(form.Modality().getValue());
				Modality.add(form.Energy().getValue() != null?form.Energy().getValue().toString():"");
				Modality.add(form.EnergyUnit().getValue());
				form.getGlobalContext().CcoSched.Booking.setModalityArrayList(Modality);
			}
		}
		if (flag)
		{
			if(furtherAppointment())
				engine.open(form.getForms().CcoSched.RebookingConfirmation, "Booking Confirmation - Further Appointments");
			else
				engine.open(form.getForms().CcoSched.RebookingConfirmation);
		}
		else
			ShowMessage("No new appointment time selected.");
	}
	
	private void ShowSequence(int type)
	{
		String activityID = form.getLocalContext().getActivityID();// UIEngine.Context.Get("10020:activityID") as string;
		if (form.getLocalContext().getActivityID() != null && (activityID.equals("-202") || activityID.equals("-207")))
		{
			boolean b = form.Resource().getValue() != null;
			form.GenerateDates().setEnabled(b);
			form.RefreshAvailability().setEnabled(b);
			form.Reset().setEnabled(b);

			form.AvailabilityDetails().setEnabled(true);
			if (type != 0)
			{
				form.Sequence().setVisible(true);
				form.Sequence().setValue(true);
				try {
					OnSequence();
				} catch (PresentationLogicException e) {
					ShowMessage(e.getMessage());
				}
				form.Mon().setValue(true);
				form.Tue().setValue(true);
				form.Wed().setValue(true);
				form.Thu().setValue(true);
				form.Fri().setValue(true);
				form.Sat().setValue(false);
				form.Sun().setValue(false);
			}
		}
		else
		{
			//if (form.NumberOfAppointments().getValue() != null && form.NumberOfAppointments().getValue().intValue() == 0)
				//ShowMessage("Number of appointments must be greater then 0.");

			boolean b = (form.NumberOfAppointments().getValue().intValue() > 1 && form.ListOwner().getValue() != null);
			form.GenerateDates().setEnabled(b);
			form.RefreshAvailability().setEnabled(true);
			form.Reset().setEnabled(true);
			form.AvailabilityDetails().setEnabled(form.NumberOfAppointments().getValue().intValue() > 1);
			if (type != 0)
			{
				if (form.NumberOfAppointments().getValue().intValue() > 1)
				{
					form.Sequence().setVisible(true);
					form.Sequence().setValue(false);
				}
				else
				{
					form.Sequence().setVisible(false);
					form.Sequence().setValue(false);
					form.Mon().setValue(false);
					form.Tue().setValue(false);
					form.Wed().setValue(false);
					form.Thu().setValue(false);
					form.Fri().setValue(false);
					form.Sat().setValue(false);
					form.Sun().setValue(false);
				}
			}
		}
	}	
	
	private ArrayList GetSlotList(Date date)
	{
		return GetSlotList(date, "");
	}
	private ArrayList GetSlotList(Date date, String appt_id)
	{	
		ArrayList slotAvailable = new ArrayList();
		ArrayList alreadyBooked = new ArrayList();
		form.getLocalContext().setAlreadyBooked(alreadyBooked);
		Hashtable sessionList = getSession(date, appt_id);
		if(sessionList == null)
			sessionList = form.getGlobalContext().CcoSched.Booking.getSessionList();
		String[] sessions = ((String)sessionList.get(date.toString(DateFormat.ISO))).split(",");
		String[] session = StringUtils.splitString(sessions[form.getGlobalContext().CcoSched.Booking.getSessionIndex().intValue()],"+"); // sessions[Context.ContextBooking.SessionIndex] is null ??????????
		if (session.length != 2)
		{
			engine.showMessage("Invalid session / session detail format.");
			return new ArrayList();
		}

		form.getGlobalContext().CcoSched.Booking.setSessionId(session[0]);
		form.getGlobalContext().CcoSched.Booking.setSessionDetailsId(session[1]); 

		Sd_sess_appts sessionAppointments = (Sd_sess_appts)domain.getDTOInstance(Sd_sess_appts.class);
		sessionAppointments.Filter.clear();
		sessionAppointments.Filter.Prfile_sess_id = session[0];
		sessionAppointments.Filter.Prfiled_sess_id = session[1];
		sessionAppointments.Filter.Userrights = form.getGlobalContext().CcoSched.getLoggedInUserId();
		if (form.ListOwner().getValue() != null)
			sessionAppointments.Filter.Loid = form.ListOwner().getValue().Staff_no;
		Result result = sessionAppointments.get();
		if (result != null)
		{
			engine.showMessage(result.getMessage());
			return new ArrayList();
		}
		if (sessionAppointments.DataCollection.count() == 0)
		{
			ShowMessage("No data return for session.");
			return new ArrayList();
		}

		Sd_sess_appts.Sd_sess_apptsRecord sessionAppointment = sessionAppointments.DataCollection.get(0);
		
		Time startTime = null;
		try{startTime = new Time(sessionAppointment.Stm, TimeFormat.FLAT6);}catch(RuntimeException e){e.printStackTrace();};
		if (startTime == null)
		{
			ShowMessage("Session start time not returned.");
			return new ArrayList();
		}
		
		Time endTime = null;
		try{ endTime = new Time(sessionAppointment.Etm, TimeFormat.FLAT6);}catch(RuntimeException e){e.printStackTrace();}
		if (endTime == null)
		{
			ShowMessage("Session end time not returned.");
			return new ArrayList();
		}
//		#region 1. find booked periods
		ArrayList bookedPeriods = new ArrayList();
		for (int k = 0; k < sessionAppointment.Seqno3Collection.count(); k++) 
		{
			Sd_sess_appts.Sd_sess_apptsSeqno3Record r = sessionAppointment.Seqno3Collection.get(k);
			if (!r.Appt_stat.equals("-2190") && !r.Appt_stat.equals("-2193") && !r.Appt_stat.equals("-2197")) //Cancelled
			{
				Time startTimeBooked = null;
				try{startTimeBooked = new Time(r.Appt_stm,TimeFormat.FLAT6);}catch(RuntimeException e){e.printStackTrace();};
				if (startTimeBooked == null)
				{
					ShowMessage("Appointment start time not returned.");
					return new ArrayList();
				}
				Time endTimeBooked = null;		
				try{endTimeBooked = new Time(r.Appt_etm, TimeFormat.FLAT6);}catch(RuntimeException e){e.printStackTrace();}
				if (endTimeBooked == null)
				{
					ShowMessage("Appointment end time not returned.");
					return new ArrayList();
				}
				
				boolean self = r.Pkey.equals(form.getGlobalContext().Core.getPatientShortIsNotNull() ? form.getGlobalContext().Core.getPatientShort().getPkey().getValue() : "");
				ArrayList intersectedPeriods = new ArrayList();
				for (int l = 0; l < bookedPeriods.size(); l++) 
				{
					Object[] period = (Object[])bookedPeriods.get(l);
					if (CompareTimes(startTimeBooked, (Time)period[1]) < 0 && CompareTimes(endTimeBooked,(Time)period[0]) > 0)
						intersectedPeriods.add(period);
				}

				Time min = startTimeBooked;
				Time max = endTimeBooked;
				for(int l=0; l<intersectedPeriods.size(); l++)
				{
					Object[] period = (Object[])intersectedPeriods.get(l);
					if (CompareTimes((Time)period[0],min) < 0)
						min = (Time)period[0];
					if (CompareTimes((Time)period[1], max) > 0)
						max = (Time)period[1];
				}
				int i = 1;
				for(int l=0; l<intersectedPeriods.size(); l++)
				{
					Object[] o = (Object[])intersectedPeriods.get(l);
					i += ((Integer)o[2]).intValue();
					self |= ((Boolean)o[3]).booleanValue();
					bookedPeriods.remove(o);
				}

				bookedPeriods.add(new Object[]{min, max, new Integer(i), new Boolean(self)});
			}
		}
//		#endregion
//
//		#region 2. find exluded periods
		ArrayList excludedPeriods = new ArrayList();
		for (int i = 0; i < sessionAppointment.Seqno2Collection.count(); i++) 
		{
			Sd_sess_appts.Sd_sess_apptsSeqno2Record r = sessionAppointment.Seqno2Collection.get(i);
			Time startTimeExclusion = null;
			try{ startTimeExclusion = new Time(r.Stm2, TimeFormat.FLAT6);}catch(RuntimeException e){e.printStackTrace();};
			if (startTimeExclusion == null)
			{
				ShowMessage("failed to get exclusion time record.");
				return new ArrayList();
			}
			Time endTimeExclusion = null;
			try{endTimeExclusion = new Time(r.Etm2, TimeFormat.FLAT6);}catch(RuntimeException e){e.printStackTrace();};
			if (endTimeExclusion == null)
			{
				ShowMessage("failed to get exclusion time record.");
				return new ArrayList();
			}
			ArrayList intersectedPeriods = new ArrayList();
			for (int j = 0; j < excludedPeriods.size(); j++) 
			{	
				Time[] period = (Time[])excludedPeriods.get(j);
				if (CompareTimes(startTimeExclusion, period[1]) <= 0 && CompareTimes(endTimeExclusion, period[0]) >= 0)
					intersectedPeriods.add(period);
			}

			Time min = startTimeExclusion;
			Time max = endTimeExclusion;
			for (int k = 0; k < intersectedPeriods.size(); k++) 
			{
				Time[] period = (Time[])intersectedPeriods.get(k);
				if (CompareTimes(period[0], min) < 0)
					min = period[0];
				if (CompareTimes(period[1], max) > 0)
					max = period[1];
			}
			for (int k = 0; k < intersectedPeriods.size(); k++) 
				excludedPeriods.remove(intersectedPeriods.get(k));

			excludedPeriods.add(new Time[]{min, max});
		}
//		#endregion
//
//		#region 3. find purely exluded periods
		ArrayList tmpArr = new ArrayList();
		for (int i = 0; i < bookedPeriods.size(); i++) 
		{
			Object[] bookedPeriod = (Object[]) bookedPeriods.get(i);
			Time s = (Time)bookedPeriod[0];
			Time e = (Time)bookedPeriod[1];

			tmpArr.clear();
			for (int j = 0; j < excludedPeriods.size(); j++) 
				tmpArr.add(excludedPeriods.get(j));
			excludedPeriods.clear();
//			for (int j = 0; j < tmpArr.size(); j++)
//			{
//				Time[] excludedPeriod  = (Time[]) tmpArr.get(j);
//				if (CompareTimes(s, excludedPeriod[1]) > 0 || CompareTimes(e, excludedPeriod[0]) < 0)
//					excludedPeriods.add(excludedPeriod);
//				else if (CompareTimes(s, excludedPeriod[0]) >= 0 && CompareTimes(s, excludedPeriod[1]) <= 0 && CompareTimes(e, excludedPeriod[1]) > 0)
//					excludedPeriods.add(new Time[]{excludedPeriod[1], e});
//				else if (CompareTimes(s, excludedPeriod[0]) < 0 && CompareTimes(e, excludedPeriod[0]) >= 0 && CompareTimes(e, excludedPeriod[1]) <= 0)
//					excludedPeriods.add(new Time[]{s, excludedPeriod[0]});
//				else if (CompareTimes(s, excludedPeriod[0]) > 0 && CompareTimes(s, excludedPeriod[1]) < 0 && CompareTimes(e, excludedPeriod[0]) > 0 && CompareTimes(e, excludedPeriod[1]) < 0) 
//				{
//					excludedPeriods.add(new Time[]{excludedPeriod[0], s});
//					excludedPeriods.add(new Time[]{e, excludedPeriod[1]});
//				}
//			}
			for(int j=0; j<tmpArr.size(); j++)
			{
				Time[] excludedPeriod = (Time[])tmpArr.get(j);
				// exclusion times typically start on the hour 
				if (CompareTimes(s, excludedPeriod[1]) >= 0 || CompareTimes(e, excludedPeriod[0]) <= 0)
					excludedPeriods.add(excludedPeriod);
				else if (CompareTimes(s,excludedPeriod[0]) >= 0 && CompareTimes(s, excludedPeriod[1]) <= 0 && CompareTimes(e, excludedPeriod[1]) > 0)
					excludedPeriods.add(new Time[]{excludedPeriod[1], e});
				else if (CompareTimes(s, excludedPeriod[0]) < 0 && CompareTimes(e, excludedPeriod[0]) >= 0 && CompareTimes(e, excludedPeriod[1]) <= 0)
					excludedPeriods.add(new Time[]{s, excludedPeriod[0]});
				else if (CompareTimes(s, excludedPeriod[0]) >= 0 && CompareTimes(s, excludedPeriod[1]) <= 0 && CompareTimes(e, excludedPeriod[0]) > 0 && CompareTimes(e, excludedPeriod[1]) < 0)
				{
					excludedPeriods.add(new Time[]{excludedPeriod[0], s});
					excludedPeriods.add(new Time[]{e, excludedPeriod[1]});
				}
			}
			
		}
//		#endregion
//
//		#region 4. find HCP period
		Time startTimeListOwner = null;
		Time endTimeListOwner = null;
		if (form.ListOwner().getValue() != null)
		{
			for (int i = 0; i < sessionAppointment.LoseqnoCollection.count(); i++) 
			//foreach ( dto.Sd_sess_apptsDTO.LoseqnoClient listOwner in sessionAppointment.LoseqnoCollection)
			{
				Sd_sess_appts.Sd_sess_apptsLoseqnoRecord listOwner = sessionAppointment.LoseqnoCollection.get(i);
				if (listOwner.Mos_id.equals(form.ListOwner().getValue().Staff_no)) // WDEV-14442
				{
					try{startTimeListOwner = new Time(listOwner.Stm1, TimeFormat.FLAT6);}catch(RuntimeException e){e.printStackTrace();}
					if (startTimeListOwner == null)
					{
						ShowMessage("start time for list owner is not supplied.");
						return new ArrayList();
					}
					

					try{ endTimeListOwner = new Time(listOwner.Etm1, TimeFormat.FLAT6);}catch(RuntimeException e){e.printStackTrace();};
					if (endTimeListOwner == null)
					{
						ShowMessage("end time for list owner is not supplied.");
						return new ArrayList();
					}
					break;
				}
			}
			if (startTimeListOwner == null)
			{
				//ShowMessage("list owner is not found.");
				engine.showMessage("list owner is not found.");
				return new ArrayList();
			}
		}
//		#endregion
//		
//		#region 5. create slots
		boolean flag = true;
		
		if (sessionAppointment.Userrights.equals("-100"))
			flag = false;
		else if (form.ListOwner().getValue() != null && sessionAppointment.Userrights.equals("-101"))
			for (int i = 0; i < sessionAppointment.LoseqnoCollection.count(); i++) 
			{	
				Sd_sess_appts.Sd_sess_apptsLoseqnoRecord listOwner = sessionAppointment.LoseqnoCollection.get(i);
				if (listOwner.Mos_id.equals(form.ListOwner().getValue().Staff_no)) // WDEV-14442
				{
					Integer si = null;
					try{ si = Integer.valueOf(listOwner.Loremnoapp);}catch(NumberFormatException e){e.printStackTrace();}
					if (si != null && si.intValue() == 0)
						flag = false;
					break;
				}
			}
		if (flag)
		{         				
			ArrayList dateSessionSlots = form.getGlobalContext().CcoSched.Booking.getDateSessionSlotsList();
			int timeRequired = GetSlotTimeRequired(date);
			timeRequired = timeRequired !=-1?timeRequired:form.getGlobalContext().CcoSched.Booking.getTimeRequired().intValue();
			Time slotStartTime = startTime;
			while (true)
			{
				Time slotEndTime = new Time(slotStartTime.getHour(), slotStartTime.getMinute());
				slotEndTime.addMinutes(timeRequired);
				if (CompareTimes(slotEndTime, endTime) > 0)
					break;
				
				flag = false;
				if (sessionAppointment.Userrights.equals("-102"))
					flag = true;
				else
				{
					if (form.ListOwner().getValue() == null)
						flag = true;
					else
					{
						if (CompareTimes(startTimeListOwner, slotStartTime) <= 0 && CompareTimes(slotStartTime, endTimeListOwner) < 0)
							flag = true;
						else
							slotStartTime = new Time(slotEndTime.getHour(), slotEndTime.getMinute());
					}
				}
						
				if (flag)
				{
					for (int i = 0; i < bookedPeriods.size(); i++)
					{
						Object[] bookedPeriod = (Object[])bookedPeriods.get(i);
						if (CompareTimes(slotStartTime, (Time)bookedPeriod[1]) < 0 && CompareTimes(slotEndTime, (Time)bookedPeriod[0]) > 0)
						{
							slotStartTime = (Time)bookedPeriod[1];
							flag = false;
							break;
						}
					}
					if (flag)
					{
						for (int i = 0; i < excludedPeriods.size(); i++)
						//foreach (DateTime[] excludedPeriod in excludedPeriods)
						{
							Time[] excludedPeriod  = (Time[]) excludedPeriods.get(i);
							if (CompareTimes(slotStartTime, excludedPeriod[1]) < 0 && CompareTimes(slotEndTime, excludedPeriod[0]) > 0)
							{							
								slotStartTime = (Time)excludedPeriod[1];
								flag = false;
								break;
							}
						}
						if (flag)
						{
							slotAvailable.add(slotStartTime.toString(TimeFormat.DEFAULT));
							slotStartTime = slotEndTime;					
						}
					}
				}
			}
		}
//		#endregion		
		
		return slotAvailable;
	}
	
	private void GetAlreadyBookedSlots(Date date)
	{
		GetAlreadyBookedSlots(date, "");
	}
	private void GetAlreadyBookedSlots(Date date, String appt_id)
	{			
		ArrayList alreadyBooked = new ArrayList();
		form.getLocalContext().setAlreadyBooked(alreadyBooked);
		Hashtable sessionList = getSession(date, appt_id);
		if(sessionList == null)
			sessionList = form.getGlobalContext().CcoSched.Booking.getSessionList();
		String[] sessions = StringUtils.splitString(((String)sessionList.get(date.toString(DateFormat.ISO))),",");
		String[] session = StringUtils.splitString(sessions[form.getGlobalContext().CcoSched.Booking.getSessionIndex().intValue()],"+"); // sessions[Context.ContextBooking.SessionIndex] is null ??????????
		if (session.length != 2)
		{
			ShowMessage("Invalid session / session detail format.");
			return;
		}

		form.getGlobalContext().CcoSched.Booking.setSessionId(session[0]);
		form.getGlobalContext().CcoSched.Booking.setSessionDetailsId(session[1]); 

		Sd_sess_appts sessionAppointments = (Sd_sess_appts)domain.getDTOInstance(Sd_sess_appts.class);
		sessionAppointments.Filter.clear();
		sessionAppointments.Filter.Prfile_sess_id = session[0];
		sessionAppointments.Filter.Prfiled_sess_id = session[1];
		sessionAppointments.Filter.Userrights = form.getGlobalContext().CcoSched.getLoggedInUserId();
		if (form.ListOwner().getValue() != null)
			sessionAppointments.Filter.Loid = form.ListOwner().getValue().Staff_no;
		Result result = sessionAppointments.get();
		if (result != null)
		{
			ShowMessage(result.getMessage());
			return;
		}
		if (sessionAppointments.DataCollection.count()  == 0)
		{
			ShowMessage("No data return for session.");
			return;
		}

		Sd_sess_appts.Sd_sess_apptsRecord sessionAppointment = sessionAppointments.DataCollection.get(0);
		
		Time startTime = null;
		try{ startTime = new Time(sessionAppointment.Stm, TimeFormat.FLAT6);}catch(RuntimeException e){ShowMessage(e.getMessage());}
		if (startTime == null)
		{
			ShowMessage("Session start time not returned.");
			return;
		}
		form.getGlobalContext().CcoSched.Rebooking.setStartTime(startTime);
//
		Time endTime = null;
		try{ endTime = new Time(sessionAppointment.Etm, TimeFormat.FLAT6);}catch(RuntimeException e){ShowMessage(e.getMessage());}
		if (endTime == null)
		{
			ShowMessage("Session end time not returned.");
			return;
		}
//
//		#region 1. find booked periods
		ArrayList bookedPeriods = new ArrayList();
		for (int k = 0; k < sessionAppointment.Seqno3Collection.count(); k++) 
		{
			Sd_sess_appts.Sd_sess_apptsSeqno3Record r = sessionAppointment.Seqno3Collection.get(k);
			if (!r.Appt_stat.equals("-2190") && !r.Appt_stat.equals("-2193") && !r.Appt_stat.equals("-2197")) //Cancelled
			{
				Time startTimeBooked = null;
				try{ startTimeBooked = new Time(r.Appt_stm, TimeFormat.FLAT6);}catch(RuntimeException e){ShowMessage(e.getMessage());}
				if (startTimeBooked == null)
				{
					ShowMessage("Appointment start time not returned.");
					return;
				}
				
				Time endTimeBooked = null; 
				try{endTimeBooked = new Time(r.Appt_etm, TimeFormat.FLAT6);}catch(RuntimeException e){ShowMessage(e.getMessage());}
				if (endTimeBooked == null)
				{
					ShowMessage("Appointment end time not returned.");
					return;
				}
				
				boolean self = r.Pkey.equals(form.getGlobalContext().Core.getPatientShortIsNotNull() ? form.getGlobalContext().Core.getPatientShort().getPkey().getValue() : "");
				ArrayList intersectedPeriods = new ArrayList();
				for (int j = 0; j < bookedPeriods.size(); j++) 
				{
					Object[] period = (Object[])bookedPeriods.get(j);
					if (CompareTimes(startTimeBooked, (Time)period[1]) < 0 && CompareTimes(endTimeBooked, (Time)period[0]) > 0)
						intersectedPeriods.add(period);
				}

				Time min = startTimeBooked;
				Time max = endTimeBooked;
				for (int j = 0; j < intersectedPeriods.size(); j++) 
				{
					Object[] period = (Object[]) intersectedPeriods.get(j);
					if (CompareTimes((Time)period[0], min) < 0)
						min = (Time)period[0];
					if (CompareTimes((Time)period[1], max) > 0)
						max = (Time)period[1];
				}
				int i = 1;
				for (int j = 0; j < intersectedPeriods.size(); j++) 
				{
					Object[] o = (Object[])intersectedPeriods.get(j);
					i += ((Integer)o[2]).intValue();
					self |= ((Boolean)o[3]).booleanValue();
					bookedPeriods.remove(o);
				}

				bookedPeriods.add(new Object[]{min, max, new Integer(i), Boolean.valueOf(self)});
			}
		}
//		#endregion
//
//		#region 2. find exluded periods
		ArrayList excludedPeriods = new ArrayList();
		for (int i = 0; i < sessionAppointment.Seqno2Collection.count(); i++) 
		//foreach (dto.Sd_sess_apptsDTO.Seqno2Client r in sessionAppointment.Seqno2Collection)
		{
			Sd_sess_appts.Sd_sess_apptsSeqno2Record r =  sessionAppointment.Seqno2Collection.get(i);
			Time startTimeExclusion = null;
			try{startTimeExclusion = new Time(r.Stm2, TimeFormat.FLAT6);}catch(RuntimeException e){ShowMessage(e.getMessage());}
			if (startTimeExclusion == null)
			{
				ShowMessage("failed to get exclusion time record.");
				return;
			}

			Time endTimeExclusion = null;
			try{endTimeExclusion = new Time(r.Etm2, TimeFormat.FLAT6);}catch(RuntimeException e){ShowMessage(e.getMessage());}
			if (endTimeExclusion == null)
			{
				ShowMessage("failed to get exclusion time record.");
				return;
			}

			ArrayList intersectedPeriods = new ArrayList();
			for (int j = 0; j < excludedPeriods.size(); j++) 
			{
				Time[] period = (Time[])excludedPeriods.get(j);
				if (CompareTimes(startTimeExclusion, period[1]) <= 0 && CompareTimes(endTimeExclusion, period[0]) >= 0)
					intersectedPeriods.add(period);	
			}

			Time min = startTimeExclusion;
			Time max = endTimeExclusion;
			for (int j = 0; j < intersectedPeriods.size(); j++)
			{
				Time[] period = (Time[]) intersectedPeriods.get(j);
				if (CompareTimes(period[0], min) < 0)
					min = period[0];
				if (CompareTimes(period[1], max) > 0)
					max = period[1];
			}
			for (int j = 0; j < intersectedPeriods.size(); j++)
				excludedPeriods.remove(intersectedPeriods.get(j));

			excludedPeriods.add(new Time[]{min, max});
		}
//		#endregion
//
//		#region 3. find purely exluded periods
		ArrayList tmpArr = new ArrayList();
		for(int i=0; i<bookedPeriods.size(); i++)
		{
			Object[] bookedPeriod = (Object[])bookedPeriods.get(i);
			Time s = (Time)bookedPeriod[0];
			Time e = (Time)bookedPeriod[1];

			tmpArr.clear();
			for(int j=0; j<excludedPeriods.size(); j++)
				tmpArr.add(excludedPeriods.get(j));

			excludedPeriods.clear();
//			for(int j=0; j<tmpArr.size(); j++)
//			{
//				Time[] excludedPeriod = (Time[])tmpArr.get(j);
//				if (CompareTimes(s, excludedPeriod[1]) > 0 || CompareTimes(e, excludedPeriod[0]) < 0)
//					excludedPeriods.add(excludedPeriod);
//				else if (CompareTimes(s, excludedPeriod[0]) >= 0 && CompareTimes(s, excludedPeriod[1]) <= 0 && CompareTimes(e, excludedPeriod[1]) > 0)
//					excludedPeriods.add(new Time[]{excludedPeriod[1], e});
//				else if (CompareTimes(s, excludedPeriod[0]) < 0 && CompareTimes(e, excludedPeriod[0]) >= 0 && CompareTimes(e, excludedPeriod[1]) <= 0)
//					excludedPeriods.add(new Time[]{s, excludedPeriod[0]});
//				else if (CompareTimes(s, excludedPeriod[0]) > 0 && CompareTimes(s, excludedPeriod[1]) < 0 && CompareTimes(e, excludedPeriod[0]) > 0 && CompareTimes(e, excludedPeriod[1]) < 0)
//				{
//					excludedPeriods.add(new Time[]{excludedPeriod[0], s});
//					excludedPeriods.add(new Time[]{e, excludedPeriod[1]});
//				}
//			}
			for(int j=0; j<tmpArr.size(); j++)
			{
				Time[] excludedPeriod = (Time[])tmpArr.get(j);
				// exclusion times typically start on the hour 
				if (CompareTimes(s, excludedPeriod[1]) >= 0 || CompareTimes(e, excludedPeriod[0]) <= 0)
					excludedPeriods.add(excludedPeriod);
				else if (CompareTimes(s,excludedPeriod[0]) >= 0 && CompareTimes(s, excludedPeriod[1]) <= 0 && CompareTimes(e, excludedPeriod[1]) > 0)
					excludedPeriods.add(new Time[]{excludedPeriod[1], e});
				else if (CompareTimes(s, excludedPeriod[0]) < 0 && CompareTimes(e, excludedPeriod[0]) >= 0 && CompareTimes(e, excludedPeriod[1]) <= 0)
					excludedPeriods.add(new Time[]{s, excludedPeriod[0]});
				else if (CompareTimes(s, excludedPeriod[0]) >= 0 && CompareTimes(s, excludedPeriod[1]) <= 0 && CompareTimes(e, excludedPeriod[0]) > 0 && CompareTimes(e, excludedPeriod[1]) < 0)
				{
					excludedPeriods.add(new Time[]{excludedPeriod[0], s});
					excludedPeriods.add(new Time[]{e, excludedPeriod[1]});
				}
			}
			
		}
//		#endregion
//
//		#region 5. create slots
		ArrayList dateSessionSlots = form.getGlobalContext().CcoSched.Booking.getDateSessionSlotsList();
		int timeRequired = GetSlotTimeRequired(date);
		timeRequired = timeRequired !=-1?timeRequired:form.getGlobalContext().CcoSched.Booking.getTimeRequired().intValue();
		Time slotStartTime = new Time(startTime.getHour(),startTime.getMinute());
		while (true)
		{
			Time slotEndTime = new Time(slotStartTime.getHour(), slotStartTime.getMinute());
			slotEndTime.addMinutes(timeRequired);

			if (CompareTimes(slotEndTime,endTime) > 0)
				break;

			boolean flag = true;
			for(int i=0; i<bookedPeriods.size(); i++)
			{
				Object[] bookedPeriod = (Object[]) bookedPeriods.get(i);
				if (slotStartTime.isLessThan((Time)bookedPeriod[1]) && slotEndTime.isGreaterThan((Time)bookedPeriod[0]))
				{						
					slotStartTime = (Time)bookedPeriod[1];
					flag = false;
					if (((Boolean)bookedPeriod[3]).booleanValue())
						alreadyBooked.add(slotStartTime.toString(TimeFormat.DEFAULT));//ToString("HH:mm"));
					break;
				}
			}
			if (flag)
			{
				for(int i=0; i<excludedPeriods.size(); i++)
				{
					Time[] excludedPeriod = (Time[]) excludedPeriods.get(i);
					if (CompareTimes(slotStartTime, excludedPeriod[1]) < 0 && CompareTimes(slotEndTime, excludedPeriod[0]) > 0)
					{							
						slotStartTime = (Time)excludedPeriod[1];
						flag = false;
						break;
					}
				}
				if (flag)
					slotStartTime = new Time(slotEndTime.getHour(), slotEndTime.getMinute());					
			}
		}
//		#endregion
		form.getLocalContext().setAlreadyBooked(alreadyBooked);
	}
	
	private int SetConflicts()
	{
		int conflictResult = Conflict.None;
		form.Calendar().clearConflicts();

		Sd_sessconflicts conflicts = (Sd_sessconflicts)domain.getDTOInstance(Sd_sessconflicts.class);
		conflicts.DataCollection.add();
		Sd_sessconflicts.Sd_sessconflictsRecord conflict = conflicts.DataCollection.get(0);
		conflict.Userid = form.getGlobalContext().CcoSched.getLoggedInUserId();
		ArrayList ds = form.getGlobalContext().CcoSched.Booking.getDateSessionSlotsList();
		for(int k=0; k<ds.size(); k++)
		{
			DateSessionSlotsClass dataSlot = (DateSessionSlotsClass)ds.get(k);
			int timeRequired = GetSlotTimeRequired(dataSlot.getDate());
			timeRequired  = timeRequired !=-1?timeRequired:form.getGlobalContext().CcoSched.Booking.getTimeRequired().intValue();
			for(int m=0; m<dataSlot.getSlotList().size(); m++)
			{
				String s =  (String)dataSlot.getSlotList().get(m);
				int i = conflict.SeqnoCollection.add();
				Sd_sessconflicts.Sd_sessconflictsSeqnoRecord rep = conflict.SeqnoCollection.get(i);
				rep.Sessionid = dataSlot.getSessionId();
				rep.Sessiondid = dataSlot.getSessionDetailsId();
				String[] str = s.split(":");
				Time dt = new Time(Integer.parseInt(str[0]), Integer.parseInt(str[1]));
				//rep.App_stm = String.Format("{0:D2}{1:D2}00", dt.getHour(), dt.getMinute());
				rep.App_stm = FormatTime(dt.getHour(), dt.getMinute());
				dt.addMinutes(timeRequired);
				//rep.App_etm = String.Format("{0:D2}{1:D2}00", dt.getHour(), dt.getMinute());
				rep.App_etm = FormatTime(dt.getHour(), dt.getMinute());
			}
		}
		Result result = conflicts.transferData("VERIFY");
		if (result != null)
		{
			ShowMessage(result.getMessage());
			return conflictResult;
		}

		int j = 0;
		ArrayList wrongSlots = new ArrayList();
		if(conflicts.DataCollection.count() > 0)
		{
			conflict = conflicts.DataCollection.get(0);
			for(int k=0; k<conflict.SeqnoCollection.count(); k++)
			{
				Sd_sessconflicts.Sd_sessconflictsSeqnoRecord rep = conflict.SeqnoCollection.get(k);
				for(int l=0; l<ds.size(); l++)
				{
					DateSessionSlotsClass dataSlot = (DateSessionSlotsClass)ds.get(l);
					if (dataSlot.getSessionId().equals(rep.Sessionid) && dataSlot.getSessionDetailsId().equals(rep.Sessiondid))
					{
						if (rep.Timavail.equals("N") || rep.Userstatusflg.equals("N") || (rep.Userstatusflg.equals("U") && rep.Conflictflg.equals("Y")))
						{
							form.Calendar().addConflict(dataSlot.getDate());
							conflictResult = Conflict.Hard;
							wrongSlots.add(dataSlot);
							++j;
						}
						if (rep.Userstatusflg.equals("S") && rep.Conflictflg.equals("Y"))
						{
							if (conflictResult != Conflict.Hard)
								conflictResult = Conflict.Soft;
							form.Calendar().addConflict(dataSlot.getDate());
							++j;
						}
					}
				}
			}
		}
			
		for(int m=0; m<wrongSlots.size(); m++)
			ds.remove(wrongSlots.get(m));

		form.NumberOfConflicts().setValue(Integer.toString(j));

		return conflictResult;
	}
		
	protected void onAvailabilityDetailsClick() throws PresentationLogicException 
	{
		form.getGlobalContext().CcoSched.Booking.setCategory(form.PatientCategory().getValue());
		form.getGlobalContext().CcoSched.Booking.setTransport(form.Transport().getValue());
		
		int i = form.Calendar().getSelectedDates().size();
		if (i > 0)
			engine.open(form.getForms().CcoSched.ResourceAvailabilty);
		else
			engine.showMessage("No date selected.");		
	}
	
	protected void onGenerateDatesClick() throws PresentationLogicException
	{
		onGenerateDatesClick(true);
	}
	protected void onGenerateDatesClick(boolean bCheck) throws PresentationLogicException 
	{
		int count = form.Calendar().getSelectedDates().size();
		if (count == 0)
		{
			ShowMessage("A start date must be selected.");
			return;
		}
		else if (count > 1)
		{
			ShowMessage("Only one start date may be selected.");
			return;
		}
		
		Date startDate = (Date)form.Calendar().getSelectedDates().get(0);
		if (form.Sequence().getValue())
		{
			boolean warning = false;				
			if(startDate.getDayOfWeek().equals(DayOfWeek.MONDAY))
			{
				if (!form.Mon().getValue()) warning = true;
			}
			else if(startDate.getDayOfWeek().equals(DayOfWeek.TUESDAY)) 
			{
				if (!form.Tue().getValue()) warning = true;
			}
			else if(startDate.getDayOfWeek().equals(DayOfWeek.WEDNESDAY)) 
			{
				if (!form.Wed().getValue()) warning = true;
			}
			else if(startDate.getDayOfWeek().equals(DayOfWeek.THURSDAY)) 
			{
				if (!form.Thu().getValue()) warning = true;
			}
			else if(startDate.getDayOfWeek().equals(DayOfWeek.FRIDAY))
			{
				if (!form.Fri().getValue()) warning = true;
			}
			else if(startDate.getDayOfWeek().equals(DayOfWeek.SATURDAY)) 
			{
				if (!form.Sat().getValue()) warning = true;
			}
			else if(startDate.getDayOfWeek().equals(DayOfWeek.SUNDAY)) 
			{
				if (!form.Sun().getValue()) warning = true;
			}
			if (warning)
			{
				ShowMessage("The start date is not in the sequence selected.");
				return;
			}
		}

		if ((!form.Sequence().getValue()) || !(form.Mon().getValue() || form.Tue().getValue() || form.Wed().getValue() || form.Thu().getValue() || form.Fri().getValue() || form.Sat().getValue() || form.Sun().getValue()))
		{
			ShowMessage("Please select relevant days in sequence.");
			return;
		}
		
		//17/01/2005 - Check to see if the selected date has a slot selectd - if has warn the user
		//Get the start date and test if the method was called from OnFormDialogClosed
		if(bCheck && dateHasSlots((Date)form.Calendar().getSelectedDates().get(0)))
		{
			engine.open(form.getForms().CcoSched.RebookingSlotsWarning);
			return;
		}
		//---------------------
		
//		//Change to GetVisible
//		if (form.Hyperfractination().isVisible() && form.Hyperfractination().getValue())
//		{
//			boolean flag = false;
//			if (form.Level().getValue().intValue() == 0)
//			{
//				ShowMessage("Hyperfractination level can not be set to 0.");
//				flag = true;
//			}
//			if (form.Instances().getValue().intValue() == 0)
//			{
//				ShowMessage("Number of instances can not be set to 0.");
//				flag = true;
//			}
//			if (flag)
//				return;
//		}

		int fractions = 0;
		//Change to GetVisible
		if (form.Fractions().isVisible())
		{
			fractions = form.Fractions().getValue() != null?form.Fractions().getValue().intValue():0;
//			if (form.Hyperfractination().getValue())
//			{
//				fractions = fractions - (form.Level().getValue().intValue() * form.Instances().getValue().intValue()) + form.Instances().getValue().intValue();
//				if (fractions < 0)
//				{
//					ShowMessage("Hyperfractination level exceeds total number of fractions.");
//					return;
//				}
//			}
//			else
//			{
				if (fractions < 1)
				{
					ShowMessage("Invalid number of fractions.");
					return;
				}
//			}
		}
		else
			fractions = form.NumberOfAppointments().getValue().intValue();

		ArrayList m_DaysOfWeek = new ArrayList();
		if (form.Mon().getValue())
			m_DaysOfWeek.add(DayOfWeek.MONDAY);
		if (form.Tue().getValue())
			m_DaysOfWeek.add(DayOfWeek.TUESDAY);
		if (form.Wed().getValue())
			m_DaysOfWeek.add(DayOfWeek.WEDNESDAY);
		if (form.Thu().getValue())
			m_DaysOfWeek.add(DayOfWeek.THURSDAY);
		if (form.Fri().getValue())
			m_DaysOfWeek.add(DayOfWeek.FRIDAY);
		if (form.Sat().getValue())
			m_DaysOfWeek.add(DayOfWeek.SATURDAY);
		if (form.Sun().getValue())
			m_DaysOfWeek.add(DayOfWeek.SUNDAY);

		int numberFractions = 0;	
		ArrayList dates = new ArrayList();
		dates.add(new Date(startDate));
		numberFractions++;

		Date d = new Date(startDate);
//		#region Fix 25 June 2003
		//Change to getVisible
		Date estimatedEndDate = new Date(d);

		int nDays = 0;
		//TODO - check if there is no Duration, then don't apply the rule (don't do checking)
		if(form.Duration().isVisible())
		{
			if(form.Duration().getValue() != null)
			{
				nDays = form.Duration().getValue().intValue();
				estimatedEndDate.addDay(nDays - 1);
			}
		}
		else
		{
			if(form.NumberOfAppointments().getValue() != null)
			{
				nDays = (form.NumberOfAppointments().getValue().intValue() * 7);
				estimatedEndDate.addDay(nDays - 1);
			}
		}
		//estimatedEndDate.addDay(nDays - 1);
//		#endregion
		Hashtable sessionList = form.getGlobalContext().CcoSched.Booking.getSessionList();
		boolean firstTime = true;
		while (numberFractions < fractions)
		{
//			#region Fix 25 June 2003
			if (d.isGreaterOrEqualThan(estimatedEndDate))
			{
				ShowMessage("Insufficient number of sessions. Generated " + String.valueOf(numberFractions) + " day(s).");
				break;
			}
//			#endregion
			int month = d.getMonth();
			d.addDay(1);
			if (month != d.getMonth() && firstTime)
			{
				firstTime = false;
				String groupID 	  = form.getLocalContext().getGroupId();
				String activityID = form.getLocalContext().getActivityID();
				String actionID   = form.getLocalContext().getActionId();
										
				Sd_sess_avail sessionAvailability = (Sd_sess_avail)domain.getDTOInstance(Sd_sess_avail.class);
				sessionAvailability.Filter.clear();
				sessionAvailability.Filter.Grp_id = groupID;
				sessionAvailability.Filter.Activ_id = activityID;
				sessionAvailability.Filter.Act_id = actionID;
				sessionAvailability.Filter.Sess_dt  = d.toString(DateFormat.ISO) + "|" + estimatedEndDate.toString(DateFormat.ISO);
				// HCP
				if (activityID.equals("-202") || activityID.equals("-207"))
					sessionAvailability.Filter.Mc_id = ((Sd_modactmc.Sd_modactmcRecord)form.Resource().getValue()).Mc_id;
				else
				{
					sessionAvailability.Filter.Lo_id = form.ListOwner().getValue().Staff_no;
					if (form.Resource().getValue() != null)
						sessionAvailability.Filter.Mc_id = ((Sd_mc_act.Sd_mc_actRecord)form.Resource().getValue()).Mc_id;
				}
				Result result = sessionAvailability.list();
				if (result != null)
				{
					ShowMessage(result.getMessage());
					return;
				}
				for(int k=0; k<sessionAvailability.DataCollection.count(); k++)
				{
					Sd_sess_avail.Sd_sess_availRecord  sa = sessionAvailability.DataCollection.get(k); 
					Date sd = null;
					try{ sd = new Date(sa.Sess_dt, DateFormat.ISO);}catch(ParseException e){ShowMessage(e.getMessage());}
					if (sd == null)
					{
						ShowMessage("A blank date was returned.");
						return;
					}
					Date date = new Date(sd.getYear(), sd.getMonth(), sd.getDay());
					if (sa.Sessiond_ids.length() == 0)
					{
						ShowMessage("No session details return for " + date.toString(DateFormat.STANDARD));
						return;
					}
					if (sessionList.containsKey(date.toString(DateFormat.ISO)))
						sessionList.put(date.toString(DateFormat.ISO), sa.Sessiond_ids);
					else
						sessionList.put(date.toString(DateFormat.ISO), sa.Sessiond_ids);
				}
			}
			for (int i = 0; i < m_DaysOfWeek.size(); i++)
				if (d.getDayOfWeek().equals((DayOfWeek)m_DaysOfWeek.get(i)) && sessionList.containsKey(d.toString(DateFormat.ISO)))
				{
					dates.add(new Date(d));
					++numberFractions;
					break;
				}
		}
		
		for (int i = 0; i < dates.size(); i++)
		{
			form.Calendar().check((Date)dates.get(i));
			//03/06/2004 - Simulate the DateCheck //14/01/2004 - pass the m_fire = false and manual event, true
			OnDateChecked((Date)dates.get(i), true, false, true, true);
		}

		form.StartDate().setValue(((Date)dates.get(0)).toString(DateFormat.STANDARD));
		if(dates.size() > 0)
			form.EndDate().setValue(((Date)dates.get(dates.size() - 1)).toString(DateFormat.STANDARD));

		form.getGlobalContext().CcoSched.Booking.setSessionIndex(new Integer(0));

		SetStartAndEndDate();
		//10/01/2005 - clear the Action Dates
		form.getGlobalContext().CcoSched.Booking.setCalendarSelectedDates(null);
	}
	
	private void addToTimeList(Object[] newTimeObj)
	{
		ArrayList timeList = form.getGlobalContext().CcoSched.Rebooking.getNewTimeList();
		boolean dateFound = false; 
		if(timeList != null)
		{
			//Check if the object exists and replace the time
			for(int i=0; i<timeList.size(); i++)
			{
				Object[] timeObj 		= (Object[])timeList.get(i);
				ArrayList timeRowObj 	= (ArrayList)timeObj[0];
				ArrayList newTimeRowObj  = (ArrayList)newTimeObj[0];//newTimeRowObj
				//Check the Session appt,obj[0] //then the session ids obj[1], obj[2]
				if(((Sd_sess_appts.Sd_sess_apptsSeqno3Record)timeRowObj.get(0)).Seqno3.equals(((Sd_sess_appts.Sd_sess_apptsSeqno3Record)newTimeRowObj.get(0)).Seqno3) &&
				   ((Sd_sess_appts.Sd_sess_apptsSeqno3Record)timeRowObj.get(0)).Appt_head_id.equals(((Sd_sess_appts.Sd_sess_apptsSeqno3Record)newTimeRowObj.get(0)).Appt_head_id)
				   /*timeRowObj[1].equals(newTimeRowObj[1]) && 
				   timeRowObj[2].equals(newTimeRowObj[2])*/)
				{
				    if(newTimeObj[1] != null)
				        timeObj[1] = ((Time)newTimeObj[1]).copy();
				    else
				        timeObj[1] = null;
					dateFound = true;
					break;
				}
			}
			
			//New Object 
			if(dateFound == false)
			{
				timeList.add(newTimeObj);
			}
		}
		else
		{
			timeList = new ArrayList();
			timeList.add(newTimeObj);
		}
		
		form.getGlobalContext().CcoSched.Rebooking.setNewTimeList(timeList);
	}
	
	//returns the new Time temporarly saved
	private Time getNewApptTime(Sd_sess_appts.Sd_sess_apptsSeqno3Record record, String[] session)
	{
		ArrayList timeList = form.getGlobalContext().CcoSched.Rebooking.getNewTimeList(); 
		if(timeList != null)
		{
			for(int i=0; i<timeList.size(); i++)
			{
				Object[] timeObjs = (Object[])timeList.get(i);
				ArrayList timeObj  = (ArrayList)timeObjs[0];
				//Check the sessions and the sequence number of the record in the grid
				//01/09/05 - added the check against the old time as well
				if(((Sd_sess_appts.Sd_sess_apptsSeqno3Record)timeObj.get(0)).Seqno3.equals(record.Seqno3) &&
				   ((Sd_sess_appts.Sd_sess_apptsSeqno3Record)timeObj.get(0)).Appt_stm.equals(record.Appt_stm) && 
				   timeObj.get(1).equals(session[0]) && 
				   timeObj.get(2).equals(session[1]))
				{
					return (Time)timeObjs[1];
				}
			}
		}
		return null;
	}
	
	private ArrayList getNewTimes(Date date, String[] session)
	{
		if(session == null || session.length != 2)
			return null;
			
		ArrayList newTimes = new ArrayList();
		ArrayList timeList = form.getGlobalContext().CcoSched.Rebooking.getNewTimeList();
		Time newTime = null;
		if(timeList != null)
		{
			for(int i=0; i<timeList.size(); i++)
			{
				Object[] timeObjs = (Object[])timeList.get(i);
				ArrayList timeObj  = (ArrayList)timeObjs[0]; 
				//Check the date and the sessions
				if(timeObjs[2].equals(date) && timeObj.get(1).equals(session[0]) && timeObj.get(2).equals(session[1]))
				{
					//Check if the new Time is null then get the old time
					if(timeObjs[1] == null)
						newTime = GetTimeFromString(((Sd_sess_appts.Sd_sess_apptsSeqno3Record)timeObj.get(0)).Appt_stm);
					else
						newTime = (Time)timeObjs[1];
						
					newTimes.add(newTime);
				} 
			}
		}
		return newTimes;
	}
	
//	formatting the time hhmmss
	private String FormatTime(int hour, int minute)
	{
		StringBuffer time = new StringBuffer(6);
		time.append(hour<10?"0"+ Integer.toString(hour):Integer.toString(hour));
		time.append(minute<10?"0"+ Integer.toString(minute):Integer.toString(minute));
		time.append("00");
		return time.toString();
	}
	
	private void SetDataInGlobalContext(Object[] data, int index)
	{
		ArrayList dataArray = form.getGlobalContext().CcoSched.Rebooking.getData();
		dataArray.set(index, data);
		form.getGlobalContext().CcoSched.Rebooking.setData(dataArray);
		if(furtherAppointment())
			PopulateFurtherAppts();
	}
			
	private Date GetDateFromString(String date)
	{
		Date dt = null;
		if(date != null && date.equals("") == false)
		try{dt = new Date(date, DateFormat.ISO);}catch(ParseException e){ShowMessage(e.getMessage());}
		return dt;
	}
	
	private Time GetTimeFromString(String time)
	{
		Time tm = null;
		if(time != null && !time.equals(""))
		try{ tm = new Time(time, TimeFormat.FLAT6);}catch(RuntimeException e){ShowMessage(e.getMessage());}
		return tm;
	}
	
	private Integer GetIntegerFromString(String value)
	{
		Integer newVal = null;
		if(value != null && !value.equals(""))
		{
			try{newVal = Integer.valueOf(value);}
			catch(NumberFormatException e){ShowMessage(e.getMessage());}
		}
		return newVal;	
	}
	private int getIntFromString(String value)
	{
		Integer newVal = null;
		if(value != null && !value.equals(""))
		{
			try{newVal = Integer.valueOf(value);}
			catch(NumberFormatException e){ShowMessage(e.getMessage());}
		}
		return newVal != null?newVal.intValue():-1;	
	}
	private Float GetFloatFormString(String val)
	{
		Float newVal = null;
		if(val != null && !val.equals(""))
		{
			try{newVal = new Float(val);}
			catch(NumberFormatException e)
			{ShowMessage(e.getMessage());}	
		}
		return newVal;
	}
	
	private int CompareTimes(Time t1, Time t2)
	{	
		if(t1.isGreaterThan(t2))
			return 1;
		else if (t1.isLessThan(t2))
			return -1;
		
		return 0;
	}
	
	private void ShowMessage(String message)
	{
		engine.showMessage(message);
	}
	
	private void defaultSequence(boolean bValue)
	{
		form.Mon().setValue(bValue);
		form.Tue().setValue(bValue);
		form.Wed().setValue(bValue);
		form.Thu().setValue(bValue);
		form.Fri().setValue(bValue);
	}
	//set the session in the context
	private String[] setSessions(Date selectedDate)
	{
		Hashtable sessionList = form.getGlobalContext().CcoSched.Booking.getSessionList();//Context.ContextBooking.SessionList;
		String[] sessions = ((String)sessionList.get(selectedDate.toString(DateFormat.ISO))).split(",");
		String[] session = StringUtils.splitString(sessions[form.getGlobalContext().CcoSched.Booking.getSessionIndex().intValue()], "+"); // sessions[Context.ContextBooking.SessionIndex] is null ??????????
		if (session.length != 2)
		{
			ShowMessage("Invalid session / session detail format.");
			return null;
		}

		form.getGlobalContext().CcoSched.Booking.setSessionId(session[0]);
		form.getGlobalContext().CcoSched.Booking.setSessionDetailsId(session[1]);
		return session;
	}
	protected void onFormClosing(CancelArgs args) throws PresentationLogicException 
	{
		//14/11/2004 - Clear persistant Context used in variables
		if(form.getGlobalContext().CcoSched.Booking.getSelectedSessionsIsNotNull())
			form.getGlobalContext().CcoSched.Booking.setSelectedSessions(null);
		
		//14/11/2004 - Clear persistant Context used in variables
		if(form.getGlobalContext().CcoSched.Booking.getSelectedDateIsNotNull())
			form.getGlobalContext().CcoSched.Booking.setSelectedDate(null);
		
		//21/01/2005 - Clear persistant context
		if(form.getGlobalContext().CcoSched.Booking.getCalendarSelectedDatesIsNotNull())
			form.getGlobalContext().CcoSched.Booking.setCalendarSelectedDates(null);
	}
			
	//emulates enum Conflict = new enum(){None, Soft, Hard}
	public static class Conflict
	{
		public static int None = 0;
		public static int Soft = 1;
		public static int Hard = 2;
	}
	
	//25/10/2005 Changes -----------------------------
	private boolean furtherAppointment()
	{
		if(form.getGlobalContext().CcoSched.TreatmentPlan.getFurtherAppointmentIsNotNull() && 
		   form.getGlobalContext().CcoSched.TreatmentPlan.getFurtherAppointment().booleanValue())
			return true;
		
		return false;
	}
	private void populateActionDetails()
	{
		if(form.getLocalContext().getPatTreatmentPlanActionIsNotNull())
		{
			PatTreatPlanActionVo go_ptplact = form.getLocalContext().getPatTreatmentPlanAction();
			int dose = 0, fractions = 0, duration = 0;
			String groupID = go_ptplact.getActivityGroupIsNotNull()?go_ptplact.getActivityGroup().getID_ActivityGroupIsNotNull()?go_ptplact.getActivityGroup().getID_ActivityGroup().toString():"":"", 
				activityID = go_ptplact.getActivityIsNotNull()?go_ptplact.getActivity().getActivityIdIsNotNull()?go_ptplact.getActivity().getActivityId().toString():"":"", 
				actionID = go_ptplact.getActionIsNotNull()?go_ptplact.getAction().getActionIsNotNull()?go_ptplact.getAction().getAction().getID_ActionIsNotNull()?go_ptplact.getAction().getAction().getID_Action().toString():"":"":""; 
			ShowExternalBeem(true);
			ArrayList aData = new ArrayList();
			if (go_ptplact.getDoseIsNotNull())
			{
				for (Iterator iter = go_ptplact.getDose().iterator(); iter.hasNext();) {
					PatTreatPlanActionDoseVo doseRecord = (PatTreatPlanActionDoseVo) iter.next();
					//Active + NotBooked
					if(doseRecord.getEdoseastatIsNotNull()&& doseRecord.getEdoseastat().toString().equals(ACTIVE) && doseRecord.getEdisbookedIsNotNull()&& !doseRecord.getEdisbooked().equalsIgnoreCase("Y"))
					{
						if(doseRecord.getEbdoseIsNotNull())
							dose 	  += doseRecord.getEbdose();
						if(doseRecord.getEbfractionsIsNotNull())
							fractions += doseRecord.getEbfractions(); 
						if(doseRecord.getEbdurIsNotNull())
							duration  += doseRecord.getEbdur();
						
						//set GC for this action
						form.getGlobalContext().setPatTreatmentPlanAction(go_ptplact);
					}
					
				}
			}
			
			form.Dose().setValue(new Integer(dose));
			form.Fractions().setValue(new Integer(fractions));
			form.Duration().setValue(new Integer(duration));
            form.Modality().setValue(go_ptplact.getModality());
			if(go_ptplact.getModalEnergyIsNotNull() && !go_ptplact.getModalEnergy().equals(""))
				form.Energy().setValue(Float.valueOf(go_ptplact.getModalEnergy()));
            form.EnergyUnit().setValue(go_ptplact.getUnit());
			
			form.getLocalContext().setGroupId(groupID);
			form.getLocalContext().setActivityID(activityID);
			
			//Load List Owner
			loadListOwner(groupID, activityID);
			
			//Default List Owner
			if (go_ptplact.getTreatingConsultantIsNotNull() && go_ptplact.getTreatingConsultant().getMosIsNotNull()) //WDEV-15156
			{
				String s = go_ptplact.getTreatingConsultant().getMos().getID_MemberOfStaffIsNotNull()?go_ptplact.getTreatingConsultant().getMos().getID_MemberOfStaff().toString():"";
				for(int k = 0; k < form.ListOwner().getValues().size(); k++)
				{	
					Sd_activstaff.Sd_activstaffRecord tmp = (Sd_activstaff.Sd_activstaffRecord)form.ListOwner().getValues().get(k);
					if (tmp.Staff_no.equals(s))
					{
						form.ListOwner().setValue(tmp);
						form.getGlobalContext().CcoSched.Booking.setListOwner(tmp);
						break;
					}
				}
			}

			//Load Resource class
			Resource resource = new Resource();
			resource.setGroupID(groupID);
			resource.setActivityID(activityID);
			resource.setActionID(actionID);
			resource.setManualEvents(false);
			resource.setSelectedResourceID("");
			//Loading the resources
			loadResource(resource);
			//Loading the Time and Interval Required
			loadTimeIntervalRequired(groupID, activityID, actionID);
			//Code added - 11/10/04
			ShowSequence(0);
			GetAvailability();
		}
		
//		if(form.getGlobalContext().CcoSched.TreatmentPlan.getTreatmentPlanActionsIsNotNull())
//		{
//			Go_ptplactRecord go_ptplact = form.getGlobalContext().CcoSched.TreatmentPlan.getTreatmentPlanActions();
//			int dose = 0, fractions = 0, duration = 0;
//			String groupID = go_ptplact.Activitygrp, activityID = go_ptplact.Activity_id, actionID = go_ptplact.Action_id; 
//			Go_ptplact.Go_ptplactDose_seqRecord doseRecord;
//			ShowExternalBeem(true);
//			ArrayList aData = new ArrayList();
//			for(int i=0; i<go_ptplact.Dose_seqCollection.count(); i++)
//			{
//				doseRecord = go_ptplact.Dose_seqCollection.get(i);
//				//Active + NotBooked
//				if(doseRecord.Ed_dose_astat.equals(ACTIVE) && !doseRecord.Ed_isbooked.equalsIgnoreCase("Y"))
//				{
//					if(doseRecord.Eb_dose != null)
//						dose 	  += GetIntegerFromString(doseRecord.Eb_dose) != null?GetIntegerFromString(doseRecord.Eb_dose).intValue():0;
//					if(doseRecord.Eb_fractions != null)
//						fractions += GetIntegerFromString(doseRecord.Eb_fractions) != null?GetIntegerFromString(doseRecord.Eb_fractions).intValue():0; 
//					if(doseRecord.Eb_dur  != null)
//						duration  += GetIntegerFromString(doseRecord.Eb_dur) != null?GetIntegerFromString(doseRecord.Eb_dur).intValue():0;
//				}
//			}
//			
//			form.Dose().setValue(new Integer(dose));
//			form.Fractions().setValue(new Integer(fractions));
//			form.Duration().setValue(new Integer(duration));
//            form.Modality().setValue(go_ptplact.Modality_id);
//			if(go_ptplact.Modality_enrgy != null && !go_ptplact.Modality_enrgy.equals(""))
//				form.Energy().setValue(Float.valueOf(go_ptplact.Modality_enrgy));
//            form.EnergyUnit().setValue(go_ptplact.Modalty_unit_id);
//			
//			form.getLocalContext().setGroupId(groupID);
//			form.getLocalContext().setActivityID(activityID);
//			
//			//Load List Owner
//			loadListOwner(groupID, activityID);
//
//			//Load Resource class
//			Resource resource = new Resource();
//			resource.setGroupID(groupID);
//			resource.setActivityID(activityID);
//			resource.setActionID(actionID);
//			resource.setManualEvents(false);
//			resource.setSelectedResourceID("");
//			//Loading the resources
//			loadResource(resource);
//			//Loading the Time and Interval Required
//			loadTimeIntervalRequired(groupID, activityID, actionID);
//			//Code added - 11/10/04
//			ShowSequence(0);
//			GetAvailability();
//		}
	}
	private boolean loadListOwner(String groupID, String activityID)
	{
		Sd_activstaff activstaff = (Sd_activstaff) domain.getDTOInstance(Sd_activstaff.class);
		activstaff.Filter.clear();
		activstaff.Filter.Grp_id = groupID;
		activstaff.Filter.Activ_id = activityID;
		activstaff.Filter.Act_indstf = "Y";
		activstaff.Filter.Act_ind    = "Y";
		Result result = activstaff.list();
		if (result != null)
		{
			ShowMessage(result.getMessage());
			return false;
		}

		for(int i=0; i<activstaff.DataCollection.count(); i++)
			form.ListOwner().newRow(activstaff.DataCollection.get(i), activstaff.DataCollection.get(i).Staff_name);
		
		return true;
	}
	private void loadResource(Resource resource)
	{
		if (resource.getActivityID().equals("-202") || resource.getActivityID().equals("-207"))
		{
			Sd_modactmc modactmc = (Sd_modactmc) domain.getDTOInstance(Sd_modactmc.class);
			modactmc.Filter.clear();
			if (form.Modality().getValue()!= null)
				modactmc.Filter.Modal_type_id = new Integer(form.Modality().getValue().getID()).toString();
			else
				modactmc.Filter.Modal_type_id = "";
			modactmc.Filter.Energy = form.Energy().getValue() != null?form.Energy().getValue().toString():"";
			modactmc.Filter.Energy_unit = form.EnergyUnit().getValue() != null?new Integer(form.EnergyUnit().getValue().getID()).toString():"";
			modactmc.Filter.Action_id = resource.getActionID();
			Result result = modactmc.list();
			if (result != null)
			{
				ShowMessage(result.getMessage());
				return;
			}
			for (int i = 0; i < modactmc.DataCollection.count(); i++)
			{
				boolean exist = false;
				for(int j=0; j<form.Resource().getValues().size(); j++)
				{
					if (modactmc.DataCollection.get(i).Mc_id.equals(((Sd_modactmc.Sd_modactmcRecord)form.Resource().getValues().get(j)).Mc_id))
						exist = true;						
				}
				if (!exist)
				{
					form.Resource().newRow(modactmc.DataCollection.get(i), modactmc.DataCollection.get(i).Mc_nm);
					if (modactmc.DataCollection.get(i).Mc_id.equals(resource.getSelectedResourceID()))
					{
						form.Resource().setValue(modactmc.DataCollection.get(i));
						try {
							OnResource(resource.getManualEvents());
						} catch (PresentationLogicException e) 
						{
							ShowMessage(e.getMessage());
						}
					}
				}
			}
		}
		else
		{
			Sd_mc_act resource_act = (Sd_mc_act) domain.getDTOInstance(Sd_mc_act.class);
			resource_act.Filter.clear();
			resource_act.Filter.Group_id = resource.getGroupID();
			resource_act.Filter.Activity_id = resource.getActivityID();
			resource_act.Filter.Action_id = resource.getActionID();
			Result result = resource_act.list();
			if (result != null)
			{
				ShowMessage(result.getMessage());
				return;
			}
			for (int i = 0; i < resource_act.DataCollection.count(); i++)
			{
				boolean exist = false;
				for(int j=0; j<form.Resource().getValues().size(); j++)
				{
					if (resource_act.DataCollection.get(i).Mc_id.equals(((Sd_mc_act.Sd_mc_actRecord)form.Resource().getValues().get(j)).Mc_id))
						exist = true;						
				}
				if (!exist)
				{
					form.Resource().newRow(resource_act.DataCollection.get(i), resource_act.DataCollection.get(i).Mc_name);
					if (resource_act.DataCollection.get(i).Mc_id.equals(resource.getSelectedResourceID()))
					{
						form.Resource().setValue(resource_act.DataCollection.get(i));
						try {
							OnResource(resource.getManualEvents());
						} catch (PresentationLogicException e) 
						{
							ShowMessage(e.getMessage());
						}
					}
				}
			}
		}
	}
	private void loadTimeIntervalRequired(String groupID, String activityID, String actionID)
	{
		Sd_activity_action activityAction = (Sd_activity_action) domain.getDTOInstance(Sd_activity_action.class);
		activityAction.Filter.clear();
		activityAction.Filter.Grp_id = groupID;
		activityAction.Filter.Activ_id = activityID;

		Result result = activityAction.list();
		if (result != null)
		{
			ShowMessage(result.getMessage());
			return;
		}

		for(int j=0; j<activityAction.DataCollection.count(); j++)
		{
			Sd_activity_action.Sd_activity_actionRecord a = activityAction.DataCollection.get(j);
			if (a.Action_id.equals(actionID))
			{
				Integer i = GetIntegerFromString(a.Int_req);
				form.getGlobalContext().CcoSched.Booking.setIntervalRequired(i ==null ? new Integer(0) : i);
				i = GetIntegerFromString(a.Tim_req);
				form.getGlobalContext().CcoSched.Booking.setTimeRequired(i ==null? new Integer(0) : i);		
			}
		}
	}
	private int getFurtherDataIndex(Date date)
	{
		//int rowDataIndex = furtherAppointment()?getFurtherDataIndex(date):form.MainGrid().getSelectedRowIndex();
		//Object[] data = (Object[])form.getGlobalContext().CcoSched.Rebooking.getData().get(rowDataIndex);
		ArrayList dataList = form.getGlobalContext().CcoSched.Rebooking.getData();
		Date listDate = null;
		for(int i=0; i<dataList.size(); i++)
		{
			listDate = (((Date)((Object[])dataList.get(i))[1]));
			if(listDate != null && listDate.equals(date))
				return i;
		}
		
		dataList.add(new Object[]{null, date, "", "", "", "", "", "", ""});
		//the index of the new elements
		return (dataList.size() - 1);
	}
	private int getFractions()
	{
		return form.Fractions().getValue() != null?form.Fractions().getValue().intValue():0;
	}
	private void clearApptData()
	{
		ArrayList data = form.getGlobalContext().CcoSched.Rebooking.getData();
		for(int i=0; i<data.size(); i++)
		{
			clearData((Object[])data.get(i));
		}
		form.getGlobalContext().CcoSched.Rebooking.setData(data);
	}
	private void clearData(Object[] data)
	{
		data[1] = minDate;
		data[2] = "";
		data[3] = "";
		data[4] = "";
	}
	private void populateCommonDetails()
	{
		ArrayList dataList = form.getGlobalContext().CcoSched.Rebooking.getData();
		Object[] data;
		for(int i=0; i<dataList.size(); i++)
		{
			data = (Object[])dataList.get(i);
			if(form.Resource().getValue() != null &&  form.Resource().getValue() instanceof Sd_modactmc.Sd_modactmcRecord)
			{
				data[6] = ((Sd_modactmc.Sd_modactmcRecord)form.Resource().getValue()).Mc_id;
				data[8] = ((Sd_modactmc.Sd_modactmcRecord)form.Resource().getValue()).Modal_id;
			}
			else
			{
				if(form.Resource().getValue() != null && form.Resource().getValue() instanceof Sd_mc_act.Sd_mc_actRecord)
				{
					data[6] = ((Sd_mc_act.Sd_mc_actRecord)form.Resource().getValue()).Mc_id;
					//data[8] = ((Sd_mc_act.Sd_mc_actRecord)form.Resource().getValue()).;
				}
			}
			//List Owner
			if (form.ListOwner().getValue() != null)
			{
				data[5] = form.ListOwner().getValue().Staff_no;
				data[7] = form.ListOwner().getValue().Staffactiv_id;
			}
		}
		form.getGlobalContext().CcoSched.Rebooking.setData(dataList);
	}
	//Get the machine, modality and list owner for the dates were these are empty (e.g. teh generated dates)
	private void getCommonDetails()
	{
		ArrayList dataList = form.getGlobalContext().CcoSched.Rebooking.getData();
		Object[] data;
		for(int i=0; i<dataList.size(); i++)
		{
			data = (Object[])dataList.get(i);
			if(form.Resource().getValue() != null &&  form.Resource().getValue() instanceof Sd_modactmc.Sd_modactmcRecord)
			{
				if(data[6].equals(""))
					data[6] = ((Sd_modactmc.Sd_modactmcRecord)form.Resource().getValue()).Mc_id;
				if(data[8].equals(""))
					data[8] = ((Sd_modactmc.Sd_modactmcRecord)form.Resource().getValue()).Modal_id;
			}
			else
			{
				if(form.Resource().getValue() != null && form.Resource().getValue() instanceof Sd_mc_act.Sd_mc_actRecord)
				{
					if(data[6].equals(""))
						data[6] = ((Sd_mc_act.Sd_mc_actRecord)form.Resource().getValue()).Mc_id;
					//data[8] = ((Sd_mc_act.Sd_mc_actRecord)form.Resource().getValue()).;
				}
			}
			//List Owner
			if (form.ListOwner().getValue() != null)
			{
				if(data[5].equals(""))
					data[5] = form.ListOwner().getValue().Staff_no;
				if(data[7].equals(""))
					data[7] = form.ListOwner().getValue().Staffactiv_id;
			}
		}
		form.getGlobalContext().CcoSched.Rebooking.setData(dataList);
	}
	private boolean slotGridCleared()
	{
		for(int i=0; i<form.SlotsGrid().getRows().size(); i++)
			if(form.SlotsGrid().getRows().get(i).getSelect())
				return false;
			
		return true;
	}

	private void populatePatientDetails()
	{
		PatientShort patient = form.getGlobalContext().Core.getPatientShort();
		if (patient != null)
		{
			form.PatientName().setValue(patient.getNameIsNotNull() ? patient.getName().getForename() + " " + patient.getName().getSurname() : "");
			form.PatientDOB().setValue(patient.getDobIsNotNull() ? patient.getDob().toString() : "");
			form.PatientHospitalNumber().setValue(patient.getHospnum() != null ? patient.getHospnum().getValue() : "");
			//ICCO688
			form.PatientTelephone().setValue(patient.getCommunicationChannel(ChannelType.GEN_PHONE) !=null ? patient.getCommunicationChannel(ChannelType.GEN_PHONE).getCommValue() : "");
			
			//WDEV-14336 start here
			if (patient.getAddressIsNotNull())
			{
				StringBuffer address = new StringBuffer(200);
				if(patient.getAddress().getLine1()!=null){
					address.append(patient.getAddress().getLine1());
					address.append(newLine);
				}
				if(patient.getAddress().getLine2()!=null){
					address.append(patient.getAddress().getLine2());
					address.append(newLine);
				}
				if(patient.getAddress().getLine3()!=null){
					address.append(patient.getAddress().getLine3());
					address.append(newLine);
				}
				if(patient.getAddress().getLine4()!=null){
					address.append(patient.getAddress().getLine4());
					address.append(newLine);
				}
				if(patient.getAddress().getLine5()!=null){
					address.append(patient.getAddress().getLine5());
					address.append(newLine);
				}
				form.PatientAddress().setValue(address.toString());
			}
			//WDEV-14336 end here
		}
	}
	private void loadTreatmentPlanTooltip()
	{
		form.customControlTreatmentPlan().clear();
		PatTreatmentPlanLiteVo tp = null;
		
		if (form.getGlobalContext().getPatTreatmentPlanIsNotNull())
			tp = form.getGlobalContext().getPatTreatmentPlan(); //selected tp
		else
		{
			if (form.getLocalContext().getPatTreatmentPlanAction() != null && form.getLocalContext().getPatTreatmentPlanAction().getActionIsNotNull() && form.getLocalContext().getPatTreatmentPlanAction().getActionIsNotNull() && form.getLocalContext().getPatTreatmentPlanAction().getAction().getActionIsNotNull())
				tp = domain.getTreatmentPlan(form.getLocalContext().getPatTreatmentPlanAction().getAction().getAction().getID_Action());
		}
		if (tp != null)
		{
			form.customControlTreatmentPlan().setUpdateContext(Boolean.FALSE);
			form.customControlTreatmentPlan().displayRecordsWithActiveACtions(tp.getID_PatTreatmentPlan().toString(),Boolean.TRUE); //wdev-13770
			setPIDTooltip(form.getGlobalContext().Core.getPatientShort(), tp, form.customControlTreatmentPlan().getActions());
		}
	}
	
	private void setPIDTooltip(PatientShort patientShort, PatTreatmentPlanLiteVo tp, PatTreatPlanActionVoCollection collection)
	{
		engine.clearAlertsByType(PatientAlertCCO.class);
		PatTreatPlanActionVo go_ptplactRecord = collection!= null && collection.size() > 0?collection.get(0):null;
		engine.addAlert(new PatientAlertCCO(new ims.ccosched.Helper.PIDTooltip().getTooltip2(patientShort, tp, go_ptplactRecord)));
	}
	
	private void PopulateFurtherAppts()
	{
		ArrayList ar = (ArrayList)form.getGlobalContext().CcoSched.Rebooking.getData().clone();
		String tmp = new String();

		form.grdFurtherAppt().getRows().clear();

		SortArrayByDate(ar);
		form.getGlobalContext().CcoSched.Rebooking.setData(ar);
		for(int i=0; i<ar.size(); i++)
		{
			Object[] o  = (Object[]) ar.get(i);
			tmp = "";
			if (!((String)o[4]).equals(""))
			{					
				// Add Values To the Row
				GenForm.grdFurtherApptRow row = form.grdFurtherAppt().getRows().newRow();
				tmp += ((Date)o[1]) != null?((Date)o[1]).toString(DateFormat.STANDARD):""; 
				tmp += " - ";
				String[] time = StringUtils.splitString(((String)o[2]), ":");
				Time dt = GetTimeFromString(time[0]+time[1]+"00");
				if (dt == null)
					ShowMessage("Wrong time format type");
				else
					tmp += dt.toString(TimeFormat.DEFAULT);
				row.setFurtherAppt(tmp);
				row.setValue((Date)o[1]);
			}
		}
	}
	private void SortArrayByDate(ArrayList dataList)
	{
		boolean bSorted = false;
		if(dataList.size() < 1)
			return;
		
		do
		{
			bSorted = false;
			for(int i=0; i<dataList.size()-1; i++)
			{
				Object[] o1 = (Object[]) dataList.get(i);
				Object[] o2  = (Object[]) dataList.get(i+1);
				if(((Date)o1[1]).isGreaterThan(((Date)o2[1])))
				{
					//TODO - Swap items
					Object[] tmp = (Object[]) dataList.get(i);
					dataList.set(i,dataList.get(i+1));
					dataList.set(i+1,tmp);
					bSorted = true;
					break;
				}
			}
		}
		while(bSorted);
	}
	private boolean TimeInInterval(Time slotTime, Time boundTime)
	{
		Time upperBoundTime = slotTime.copy(), lowerBoundTime = slotTime.copy();
		int nbrMinutes = ims.configuration.gen.ConfigFlag.DTO.SCHEDULER_APPT_INTERVAL.getValue();
		//Clone the object
		Time newBoundTime = boundTime.copy(); 
		if(slotTime.isGreaterThan(newBoundTime))
		{
			newBoundTime.addMinutes(nbrMinutes);
			if(slotTime.isLessOrEqualThan(newBoundTime))
				return true;
		}
		else if(slotTime.isLessThan(newBoundTime))
		{
			newBoundTime.addMinutes(-nbrMinutes);
			if(slotTime.isGreaterOrEqualThan(newBoundTime))
				return true;
		}
		else
			return true;//equal
		
		return false;
	}
	//Check that every selected date from the Calendar has slots set
	private boolean SelectedDatesNoSlots()
	{
		ArrayList selectedDates = form.Calendar().getSelectedDates();
		for(int i=0; i<selectedDates.size(); i++)
		{
			if(DateHasNoSession((Date)selectedDates.get(i)))
				return true;
		}
		return false;
	}
	private boolean DateHasNoSession(Date date)
	{
		ArrayList data = form.getGlobalContext().CcoSched.Rebooking.getData();
		for(int i=0; i<data.size(); i++)
		{
			Object[] dataMember = (Object[])data.get(i);
			if(((Date)dataMember[1]).equals(date) && !((String)dataMember[4]).equals(""))
				return false;
		}
		return true;
	}
	//Checks the nearest Time in +-SCHEDULER_APPT_INTERVAL interval
	private Time GetRoundedTime(String roundTime, ArrayList slotsAvailable)
	{
		int nbrMinutes = ims.configuration.gen.ConfigFlag.DTO.SCHEDULER_APPT_INTERVAL.getValue();
		String arTime[] = roundTime.split(":");
		Time selTime = GetTimeFromString(arTime[0]+arTime[1]+"00");
		for(int k=0; k<slotsAvailable.size()-1; k++)
		{
			String[] time1 = ((String)slotsAvailable.get(k)).split(":");
			String[] time2 = ((String)slotsAvailable.get(k+1)).split(":");
			Time lowerBound = GetTimeFromString(time1[0] + time1[1] + "00");
			Time upperBound = GetTimeFromString(time2[0] + time2[1] + "00");
			//Apply the following rule:
			//if between the times get the lowest (if between the boundaries) otherwise the closest
			if(selTime.isGreaterThan(lowerBound) && selTime.isLessThan(upperBound))
			{
				if(TimeInInterval(selTime, lowerBound))
					return lowerBound;
				else if(TimeInInterval(selTime, upperBound))
					return upperBound;
			}
		}
		return null;
	}
	//Returns the Action_id of a specific appointment
	public String GetActionID(String appt_id)
	{
		Sd_appt.Sd_apptRecord appointment = (Sd_appt.Sd_apptRecord)form.getLocalContext().getAppointments();
		for(int i=0; i<appointment.SeqnoCollection.count(); i++)
			if(appointment.SeqnoCollection.get(i).Appt_id1.equals(appt_id))
				return new String(appointment.SeqnoCollection.get(i).Action_id);
			
		return "";
	}
	//Check if a specific date has slots
	private boolean dateHasSlots(Date date)
	{
		ArrayList data = form.getGlobalContext().CcoSched.Rebooking.getData();
		for(int i=0; i<data.size(); i++)
		{
			if(((Object[])data.get(i))[1].equals(date) && !((Object[])data.get(i))[4].equals(""))
				return true;

		}
		return false;
	}
	private void ClearSlotTime(Date date)
	{
		ArrayList data = form.getGlobalContext().CcoSched.Rebooking.getData();
		for(int i=0; i<data.size(); i++)
		{
			if(((Object[])data.get(i))[1].equals(date))
			{
				((Object[])data.get(i))[4] = "";
				break;
			}
		}
		form.getGlobalContext().CcoSched.Rebooking.setData(data);
	}
	private boolean isIncompleteAppt()
	{
		return form.getGlobalContext().CcoSched.CancelledAppointments.getIncompleteAppointmentIsNotNull()?form.getGlobalContext().CcoSched.CancelledAppointments.getIncompleteAppointment().booleanValue():false;
	}
	private boolean EnoughSlotsSelected()
	{
		int fractions = (form.Fractions().isVisible() ? form.Fractions().getValue().intValue() : form.NumberOfAppointments().getValue().intValue());
		int slots = 0;
		
		ArrayList data = form.getGlobalContext().CcoSched.Rebooking.getData();
		for (int i = 0; data != null && i < data.size(); i++)
			slots += !((Object[])data.get(i))[4].equals("")?1:0;			

		if (slots < fractions)
		{
			ShowMessage("Insufficient number of selected appointments with slot.");
			return false;
		}
		if (slots > fractions)
		{
			ShowMessage("Excess number of selected appointments with slot.");
			return false;
		}
		return true;
	}
	//08/05/2005 - Returns a list of the actions for the selected records
	private String getSessionActions()
	{
		StringBuffer actions = new StringBuffer();
		String appt_id;
		if(furtherAppointment() == false)
		{
			Sd_appt.Sd_apptAppt_idRecord sd_apptDto;
			for(int i=0; i<form.MainGrid().getRows().size(); i++)
			{
				sd_apptDto = form.MainGrid().getRows().get(i).getValue();
				if(sd_apptDto != null)
				{
					appt_id = GetActionID(sd_apptDto.Appt_id);
					//Avoid duplication
					if(actions.indexOf(appt_id) < 0)
					{
						actions.append(appt_id);
						actions.append("|");
					}
				}
			}
			
			//Remove the last "|"
			if(actions != null)
			{
				int actLength = actions.length(); 
				if(actions.lastIndexOf("|") == (actLength -1))
				{
					return actions.substring(0, actLength - 1);
				}
			}
		}
		
		return "";
	}
    private void loadModality()
    {
//        Lkup lookup = (Lkup)domain.getDTOInstance(Lkup.class);
//        lookup.Filter.clear();
//        lookup.Filter.Lkup_typ = "3422"; 
//        Result result = lookup.list();
//        if (result != null)
//        {
//            ShowMessage(result.getMessage());
//            return;
//        }
//        for (int i = 0; i < lookup.DataCollection.count(); ++i)
//            if (lookup.DataCollection.get(i).Lkup_stat.equals("Y"))
//                form.Modality().newRow(lookup.DataCollection.get(i).Lkup_id, lookup.DataCollection.get(i).Lkup_nm);
    }
    private void loadEnergyUnit()
    {
//        Lkup lookup = (Lkup)domain.getDTOInstance(Lkup.class);
//        lookup.Filter.clear();
//        lookup.Filter.Lkup_typ = "3424"; 
//        Result result = lookup.list();
//        if (result != null)
//        {
//            ShowMessage(result.getMessage());
//            return;
//        }
//        for (int i = 0; i < lookup.DataCollection.count(); ++i)
//            if (lookup.DataCollection.get(i).Lkup_stat.equals("Y"))
//                form.EnergyUnit().newRow(lookup.DataCollection.get(i).Lkup_id, lookup.DataCollection.get(i).Lkup_nm);
    }
    
	public void setAnaesthetic(Lkup value)
	{
		form.getGlobalContext().CcoSched.TreatmentPlan.setAnaesthetic(value);
	}
	
	public Lkup getAnaesthetic()
	{
		return form.getGlobalContext().CcoSched.TreatmentPlan.getAnaesthetic();
	}
	
	public UIEngine getEngine()
	{
		return engine;
	}

	public Lkup getTechnique()
	{
		return form.getGlobalContext().CcoSched.TreatmentPlan.getTechnique();
	}

	public void setTechnique(Lkup value)
	{
		form.getGlobalContext().CcoSched.TreatmentPlan.setTechnique(value);		
	}
	
	public void setTreatmentPlanActions(Go_ptplact value)
	{
		//form.getGlobalContext().CcoSched.ActionUpdate.setTreatmentPlanActions(value);		
	}
	
	public void setTreatmentPlanDetails(Go_ptreatplRecord value)
	{
		form.getGlobalContext().CcoSched.TreatmentPlan.setTreatmentPlanDetails(value);
	}
	
	public Go_ptreatplRecord getTreatmentPlanDetails()
	{
		return form.getGlobalContext().CcoSched.TreatmentPlan.getTreatmentPlanDetails();
	}    
    
	private class Resource
	{
		//Setter metods
		public String getGroupID(){return groupID;}
		public String getActivityID(){return activityID;}
		public String getActionID(){return actionID;}
		public String getSelectedResourceID(){return selectedResourceID;}
		public boolean getManualEvents(){return m_ManualEvents;}
		//Getter methods
		public void setGroupID(String groupId){groupID = groupId;}
		public void setActivityID(String activityId){activityID = activityId;}
		public void setActionID(String actionId){actionID = actionId;}
		public void setSelectedResourceID(String selectedResourceId){selectedResourceID = selectedResourceId;}
		public void setManualEvents(boolean manualEvents){m_ManualEvents = manualEvents;}
		//Attributes
		private String groupID;
		private String activityID;
		private String actionID;
		private String selectedResourceID;
		private boolean m_ManualEvents;
	}
	//25/10/2005 End Changes -----------------------------
		
	private static final Date minDate = new Date(1, 1, 1);
	private static final Date maxDate = new Date(9999, 12, 31);
	private static final String ACTIVE	= new String("-10100");
}
