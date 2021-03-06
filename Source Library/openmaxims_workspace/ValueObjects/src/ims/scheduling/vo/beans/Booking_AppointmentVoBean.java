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
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5589.25814)
// Copyright (C) 1995-2015 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.scheduling.vo.beans;

public class Booking_AppointmentVoBean extends ims.vo.ValueObjectBean
{
	public Booking_AppointmentVoBean()
	{
	}
	public Booking_AppointmentVoBean(ims.scheduling.vo.Booking_AppointmentVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.appointmentdate = vo.getAppointmentDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getAppointmentDate().getBean();
		this.apptstarttime = vo.getApptStartTime() == null ? null : (ims.framework.utils.beans.TimeBean)vo.getApptStartTime().getBean();
		this.apptendtime = vo.getApptEndTime() == null ? null : (ims.framework.utils.beans.TimeBean)vo.getApptEndTime().getBean();
		this.apptstatus = vo.getApptStatus() == null ? null : (ims.vo.LookupInstanceBean)vo.getApptStatus().getBean();
		this.apptstatusreas = vo.getApptStatusReas() == null ? null : (ims.vo.LookupInstanceBean)vo.getApptStatusReas().getBean();
		this.apptstatushistory = vo.getApptStatusHistory() == null ? null : vo.getApptStatusHistory().getBeanCollection();
		this.session = vo.getSession() == null ? null : (ims.scheduling.vo.beans.SessionIntermediateVoBean)vo.getSession().getBean();
		this.sessionslot = vo.getSessionSlot() == null ? null : (ims.scheduling.vo.beans.SessionSlotVoBean)vo.getSessionSlot().getBean();
		this.priority = vo.getPriority() == null ? null : (ims.vo.LookupInstanceBean)vo.getPriority().getBean();
		this.activity = vo.getActivity() == null ? null : (ims.core.vo.beans.ActivitySchedVoBean)vo.getActivity().getBean();
		this.iscabbooking = vo.getIsCABBooking();
		this.patient = vo.getPatient() == null ? null : (ims.core.vo.beans.PatientShortBean)vo.getPatient().getBean();
		this.requiresrebook = vo.getRequiresRebook();
		this.earliestoffereddate = vo.getEarliestOfferedDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getEarliestOfferedDate().getBean();
		this.journey = vo.getJourney() == null ? null : (ims.pathways.vo.beans.PatientJourneyVoBean)vo.getJourney().getBean();
		this.event = vo.getEvent() == null ? null : (ims.pathways.vo.beans.EventLiteVoBean)vo.getEvent().getBean();
		this.orderinvestigation = vo.getOrderInvestigation() == null ? null : (ims.ocrr.vo.beans.OrderInvestigationBookingVoBean)vo.getOrderInvestigation().getBean();
		this.currentstatusrecord = vo.getCurrentStatusRecord() == null ? null : (ims.scheduling.vo.beans.Appointment_StatusVoBean)vo.getCurrentStatusRecord().getBean();
		this.transporttype = vo.getTransportType() == null ? null : (ims.vo.LookupInstanceBean)vo.getTransportType().getBean();
		this.istransportrequired = vo.getIsTransportRequired();
		this.istransportbooked = vo.getIsTransportBooked();
		this.outcome = vo.getOutcome() == null ? null : (ims.vo.LookupInstanceBean)vo.getOutcome().getBean();
		this.comments = vo.getComments();
		this.theatrebooking = vo.getTheatreBooking() == null ? null : (ims.scheduling.vo.beans.TheatreBookingLiteVoBean)vo.getTheatreBooking().getBean();
		this.arrivaltime = vo.getArrivalTime() == null ? null : (ims.framework.utils.beans.TimeBean)vo.getArrivalTime().getBean();
		this.seentime = vo.getSeenTime() == null ? null : (ims.framework.utils.beans.TimeBean)vo.getSeenTime().getBean();
		this.carecontext = vo.getCareContext() == null ? null : new ims.vo.RefVoBean(vo.getCareContext().getBoId(), vo.getCareContext().getBoVersion());
		this.appttrackingstatushistory = vo.getApptTrackingStatusHistory() == null ? null : vo.getApptTrackingStatusHistory().getBeanCollection();
		this.dummycolour = vo.getDummyColour() == null ? null : (ims.framework.utils.beans.ColorBean)vo.getDummyColour().getBean();
		this.wasreviewed = vo.getWasReviewed();
		this.seenby = vo.getSeenBy() == null ? null : new ims.vo.RefVoBean(vo.getSeenBy().getBoId(), vo.getSeenBy().getBoVersion());
		this.outcomecomments = vo.getOutcomeComments();
		this.pathwayclock = vo.getPathwayClock() == null ? null : new ims.vo.RefVoBean(vo.getPathwayClock().getBoId(), vo.getPathwayClock().getBoVersion());
		this.consmediatype = vo.getConsMediaType() == null ? null : (ims.vo.LookupInstanceBean)vo.getConsMediaType().getBean();
		this.category = vo.getCategory() == null ? null : (ims.vo.LookupInstanceBean)vo.getCategory().getBean();
		this.numprovidercancellations = vo.getNumProviderCancellations();
		this.wasprinted = vo.getWasPrinted();
		this.bookingletter = vo.getBookingLetter() == null ? null : (ims.core.vo.beans.PatientDocumentLiteVoBean)vo.getBookingLetter().getBean();
		this.numpatientcancellations = vo.getNumPatientCancellations();
		this.firstapptkpidate = vo.getFirstApptKPIDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getFirstApptKPIDate().getBean();
		this.rttbreachkpidate = vo.getRTTBreachKPIDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getRTTBreachKPIDate().getBean();
		this.reasonforbreachingfirstapptkpi = vo.getReasonForBreachingFirstApptKPI() == null ? null : (ims.vo.LookupInstanceBean)vo.getReasonForBreachingFirstApptKPI().getBean();
		this.commentsforbreachingfirstapptkpi = vo.getCommentsForBreachingFirstApptKPI();
		this.date28dayrulebreach = vo.getDate28DayRuleBreach() == null ? null : (ims.framework.utils.beans.DateBean)vo.getDate28DayRuleBreach().getBean();
		this.donotmove = vo.getDoNotMove();
		this.linkedappointments = vo.getLinkedAppointments() == null ? null : vo.getLinkedAppointments().getBeanCollection();
		this.linkedapptstobecancelled = vo.getLinkedApptsToBeCancelled() == null ? null : vo.getLinkedApptsToBeCancelled().getBeanCollection();
		this.day28breachreason = vo.getDay28BreachReason() == null ? null : (ims.vo.LookupInstanceBean)vo.getDay28BreachReason().getBean();
		this.day28breachcomment = vo.getDay28BreachComment();
		this.parentchildslot = vo.getParentChildSlot() == null ? null : (ims.scheduling.vo.beans.SessionParentChildSlotForBookingVoBean)vo.getParentChildSlot().getBean();
		this.isflexibleappointment = vo.getIsFlexibleAppointment();
		this.iswardattendance = vo.getIsWardAttendance();
		this.servicefunction = vo.getServiceFunction() == null ? null : (ims.core.vo.beans.ServiceFunctionLiteVoBean)vo.getServiceFunction().getBean();
		this.firstconsultationactivity = vo.getFirstConsultationActivity();
		this.electivelist = vo.getElectiveList() == null ? null : new ims.vo.RefVoBean(vo.getElectiveList().getBoId(), vo.getElectiveList().getBoVersion());
		this.patientcategory = vo.getPatientCategory() == null ? null : (ims.vo.LookupInstanceBean)vo.getPatientCategory().getBean();
		this.apptbookedonsameday = vo.getApptBookedOnSameDay();
		this.wasapptcommunicated = vo.getWasApptCommunicated();
		this.isdisplaced = vo.getIsDisplaced();
		this.listownerbooked = vo.getListOwnerBooked() == null ? null : (ims.core.vo.beans.HcpLiteVoBean)vo.getListOwnerBooked().getBean();
		this.outcomedatetime = vo.getOutcomeDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getOutcomeDateTime().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.scheduling.vo.Booking_AppointmentVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.appointmentdate = vo.getAppointmentDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getAppointmentDate().getBean();
		this.apptstarttime = vo.getApptStartTime() == null ? null : (ims.framework.utils.beans.TimeBean)vo.getApptStartTime().getBean();
		this.apptendtime = vo.getApptEndTime() == null ? null : (ims.framework.utils.beans.TimeBean)vo.getApptEndTime().getBean();
		this.apptstatus = vo.getApptStatus() == null ? null : (ims.vo.LookupInstanceBean)vo.getApptStatus().getBean();
		this.apptstatusreas = vo.getApptStatusReas() == null ? null : (ims.vo.LookupInstanceBean)vo.getApptStatusReas().getBean();
		this.apptstatushistory = vo.getApptStatusHistory() == null ? null : vo.getApptStatusHistory().getBeanCollection();
		this.session = vo.getSession() == null ? null : (ims.scheduling.vo.beans.SessionIntermediateVoBean)vo.getSession().getBean(map);
		this.sessionslot = vo.getSessionSlot() == null ? null : (ims.scheduling.vo.beans.SessionSlotVoBean)vo.getSessionSlot().getBean(map);
		this.priority = vo.getPriority() == null ? null : (ims.vo.LookupInstanceBean)vo.getPriority().getBean();
		this.activity = vo.getActivity() == null ? null : (ims.core.vo.beans.ActivitySchedVoBean)vo.getActivity().getBean(map);
		this.iscabbooking = vo.getIsCABBooking();
		this.patient = vo.getPatient() == null ? null : (ims.core.vo.beans.PatientShortBean)vo.getPatient().getBean(map);
		this.requiresrebook = vo.getRequiresRebook();
		this.earliestoffereddate = vo.getEarliestOfferedDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getEarliestOfferedDate().getBean();
		this.journey = vo.getJourney() == null ? null : (ims.pathways.vo.beans.PatientJourneyVoBean)vo.getJourney().getBean(map);
		this.event = vo.getEvent() == null ? null : (ims.pathways.vo.beans.EventLiteVoBean)vo.getEvent().getBean(map);
		this.orderinvestigation = vo.getOrderInvestigation() == null ? null : (ims.ocrr.vo.beans.OrderInvestigationBookingVoBean)vo.getOrderInvestigation().getBean(map);
		this.currentstatusrecord = vo.getCurrentStatusRecord() == null ? null : (ims.scheduling.vo.beans.Appointment_StatusVoBean)vo.getCurrentStatusRecord().getBean(map);
		this.transporttype = vo.getTransportType() == null ? null : (ims.vo.LookupInstanceBean)vo.getTransportType().getBean();
		this.istransportrequired = vo.getIsTransportRequired();
		this.istransportbooked = vo.getIsTransportBooked();
		this.outcome = vo.getOutcome() == null ? null : (ims.vo.LookupInstanceBean)vo.getOutcome().getBean();
		this.comments = vo.getComments();
		this.theatrebooking = vo.getTheatreBooking() == null ? null : (ims.scheduling.vo.beans.TheatreBookingLiteVoBean)vo.getTheatreBooking().getBean(map);
		this.arrivaltime = vo.getArrivalTime() == null ? null : (ims.framework.utils.beans.TimeBean)vo.getArrivalTime().getBean();
		this.seentime = vo.getSeenTime() == null ? null : (ims.framework.utils.beans.TimeBean)vo.getSeenTime().getBean();
		this.carecontext = vo.getCareContext() == null ? null : new ims.vo.RefVoBean(vo.getCareContext().getBoId(), vo.getCareContext().getBoVersion());
		this.appttrackingstatushistory = vo.getApptTrackingStatusHistory() == null ? null : vo.getApptTrackingStatusHistory().getBeanCollection();
		this.dummycolour = vo.getDummyColour() == null ? null : (ims.framework.utils.beans.ColorBean)vo.getDummyColour().getBean();
		this.wasreviewed = vo.getWasReviewed();
		this.seenby = vo.getSeenBy() == null ? null : new ims.vo.RefVoBean(vo.getSeenBy().getBoId(), vo.getSeenBy().getBoVersion());
		this.outcomecomments = vo.getOutcomeComments();
		this.pathwayclock = vo.getPathwayClock() == null ? null : new ims.vo.RefVoBean(vo.getPathwayClock().getBoId(), vo.getPathwayClock().getBoVersion());
		this.consmediatype = vo.getConsMediaType() == null ? null : (ims.vo.LookupInstanceBean)vo.getConsMediaType().getBean();
		this.category = vo.getCategory() == null ? null : (ims.vo.LookupInstanceBean)vo.getCategory().getBean();
		this.numprovidercancellations = vo.getNumProviderCancellations();
		this.wasprinted = vo.getWasPrinted();
		this.bookingletter = vo.getBookingLetter() == null ? null : (ims.core.vo.beans.PatientDocumentLiteVoBean)vo.getBookingLetter().getBean(map);
		this.numpatientcancellations = vo.getNumPatientCancellations();
		this.firstapptkpidate = vo.getFirstApptKPIDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getFirstApptKPIDate().getBean();
		this.rttbreachkpidate = vo.getRTTBreachKPIDate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getRTTBreachKPIDate().getBean();
		this.reasonforbreachingfirstapptkpi = vo.getReasonForBreachingFirstApptKPI() == null ? null : (ims.vo.LookupInstanceBean)vo.getReasonForBreachingFirstApptKPI().getBean();
		this.commentsforbreachingfirstapptkpi = vo.getCommentsForBreachingFirstApptKPI();
		this.date28dayrulebreach = vo.getDate28DayRuleBreach() == null ? null : (ims.framework.utils.beans.DateBean)vo.getDate28DayRuleBreach().getBean();
		this.donotmove = vo.getDoNotMove();
		this.linkedappointments = vo.getLinkedAppointments() == null ? null : vo.getLinkedAppointments().getBeanCollection();
		this.linkedapptstobecancelled = vo.getLinkedApptsToBeCancelled() == null ? null : vo.getLinkedApptsToBeCancelled().getBeanCollection();
		this.day28breachreason = vo.getDay28BreachReason() == null ? null : (ims.vo.LookupInstanceBean)vo.getDay28BreachReason().getBean();
		this.day28breachcomment = vo.getDay28BreachComment();
		this.parentchildslot = vo.getParentChildSlot() == null ? null : (ims.scheduling.vo.beans.SessionParentChildSlotForBookingVoBean)vo.getParentChildSlot().getBean(map);
		this.isflexibleappointment = vo.getIsFlexibleAppointment();
		this.iswardattendance = vo.getIsWardAttendance();
		this.servicefunction = vo.getServiceFunction() == null ? null : (ims.core.vo.beans.ServiceFunctionLiteVoBean)vo.getServiceFunction().getBean(map);
		this.firstconsultationactivity = vo.getFirstConsultationActivity();
		this.electivelist = vo.getElectiveList() == null ? null : new ims.vo.RefVoBean(vo.getElectiveList().getBoId(), vo.getElectiveList().getBoVersion());
		this.patientcategory = vo.getPatientCategory() == null ? null : (ims.vo.LookupInstanceBean)vo.getPatientCategory().getBean();
		this.apptbookedonsameday = vo.getApptBookedOnSameDay();
		this.wasapptcommunicated = vo.getWasApptCommunicated();
		this.isdisplaced = vo.getIsDisplaced();
		this.listownerbooked = vo.getListOwnerBooked() == null ? null : (ims.core.vo.beans.HcpLiteVoBean)vo.getListOwnerBooked().getBean(map);
		this.outcomedatetime = vo.getOutcomeDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getOutcomeDateTime().getBean();
	}

	public ims.scheduling.vo.Booking_AppointmentVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.scheduling.vo.Booking_AppointmentVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.scheduling.vo.Booking_AppointmentVo vo = null;
		if(map != null)
			vo = (ims.scheduling.vo.Booking_AppointmentVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.scheduling.vo.Booking_AppointmentVo();
			map.addValueObject(this, vo);
			vo.populate(map, this);
		}
		return vo;
	}

	public Integer getId()
	{
		return this.id;
	}
	public void setId(Integer value)
	{
		this.id = value;
	}
	public int getVersion()
	{
		return this.version;
	}
	public void setVersion(int value)
	{
		this.version = value;
	}
	public ims.framework.utils.beans.DateBean getAppointmentDate()
	{
		return this.appointmentdate;
	}
	public void setAppointmentDate(ims.framework.utils.beans.DateBean value)
	{
		this.appointmentdate = value;
	}
	public ims.framework.utils.beans.TimeBean getApptStartTime()
	{
		return this.apptstarttime;
	}
	public void setApptStartTime(ims.framework.utils.beans.TimeBean value)
	{
		this.apptstarttime = value;
	}
	public ims.framework.utils.beans.TimeBean getApptEndTime()
	{
		return this.apptendtime;
	}
	public void setApptEndTime(ims.framework.utils.beans.TimeBean value)
	{
		this.apptendtime = value;
	}
	public ims.vo.LookupInstanceBean getApptStatus()
	{
		return this.apptstatus;
	}
	public void setApptStatus(ims.vo.LookupInstanceBean value)
	{
		this.apptstatus = value;
	}
	public ims.vo.LookupInstanceBean getApptStatusReas()
	{
		return this.apptstatusreas;
	}
	public void setApptStatusReas(ims.vo.LookupInstanceBean value)
	{
		this.apptstatusreas = value;
	}
	public ims.scheduling.vo.beans.Appointment_StatusVoBean[] getApptStatusHistory()
	{
		return this.apptstatushistory;
	}
	public void setApptStatusHistory(ims.scheduling.vo.beans.Appointment_StatusVoBean[] value)
	{
		this.apptstatushistory = value;
	}
	public ims.scheduling.vo.beans.SessionIntermediateVoBean getSession()
	{
		return this.session;
	}
	public void setSession(ims.scheduling.vo.beans.SessionIntermediateVoBean value)
	{
		this.session = value;
	}
	public ims.scheduling.vo.beans.SessionSlotVoBean getSessionSlot()
	{
		return this.sessionslot;
	}
	public void setSessionSlot(ims.scheduling.vo.beans.SessionSlotVoBean value)
	{
		this.sessionslot = value;
	}
	public ims.vo.LookupInstanceBean getPriority()
	{
		return this.priority;
	}
	public void setPriority(ims.vo.LookupInstanceBean value)
	{
		this.priority = value;
	}
	public ims.core.vo.beans.ActivitySchedVoBean getActivity()
	{
		return this.activity;
	}
	public void setActivity(ims.core.vo.beans.ActivitySchedVoBean value)
	{
		this.activity = value;
	}
	public Boolean getIsCABBooking()
	{
		return this.iscabbooking;
	}
	public void setIsCABBooking(Boolean value)
	{
		this.iscabbooking = value;
	}
	public ims.core.vo.beans.PatientShortBean getPatient()
	{
		return this.patient;
	}
	public void setPatient(ims.core.vo.beans.PatientShortBean value)
	{
		this.patient = value;
	}
	public Boolean getRequiresRebook()
	{
		return this.requiresrebook;
	}
	public void setRequiresRebook(Boolean value)
	{
		this.requiresrebook = value;
	}
	public ims.framework.utils.beans.DateBean getEarliestOfferedDate()
	{
		return this.earliestoffereddate;
	}
	public void setEarliestOfferedDate(ims.framework.utils.beans.DateBean value)
	{
		this.earliestoffereddate = value;
	}
	public ims.pathways.vo.beans.PatientJourneyVoBean getJourney()
	{
		return this.journey;
	}
	public void setJourney(ims.pathways.vo.beans.PatientJourneyVoBean value)
	{
		this.journey = value;
	}
	public ims.pathways.vo.beans.EventLiteVoBean getEvent()
	{
		return this.event;
	}
	public void setEvent(ims.pathways.vo.beans.EventLiteVoBean value)
	{
		this.event = value;
	}
	public ims.ocrr.vo.beans.OrderInvestigationBookingVoBean getOrderInvestigation()
	{
		return this.orderinvestigation;
	}
	public void setOrderInvestigation(ims.ocrr.vo.beans.OrderInvestigationBookingVoBean value)
	{
		this.orderinvestigation = value;
	}
	public ims.scheduling.vo.beans.Appointment_StatusVoBean getCurrentStatusRecord()
	{
		return this.currentstatusrecord;
	}
	public void setCurrentStatusRecord(ims.scheduling.vo.beans.Appointment_StatusVoBean value)
	{
		this.currentstatusrecord = value;
	}
	public ims.vo.LookupInstanceBean getTransportType()
	{
		return this.transporttype;
	}
	public void setTransportType(ims.vo.LookupInstanceBean value)
	{
		this.transporttype = value;
	}
	public Boolean getIsTransportRequired()
	{
		return this.istransportrequired;
	}
	public void setIsTransportRequired(Boolean value)
	{
		this.istransportrequired = value;
	}
	public Boolean getIsTransportBooked()
	{
		return this.istransportbooked;
	}
	public void setIsTransportBooked(Boolean value)
	{
		this.istransportbooked = value;
	}
	public ims.vo.LookupInstanceBean getOutcome()
	{
		return this.outcome;
	}
	public void setOutcome(ims.vo.LookupInstanceBean value)
	{
		this.outcome = value;
	}
	public String getComments()
	{
		return this.comments;
	}
	public void setComments(String value)
	{
		this.comments = value;
	}
	public ims.scheduling.vo.beans.TheatreBookingLiteVoBean getTheatreBooking()
	{
		return this.theatrebooking;
	}
	public void setTheatreBooking(ims.scheduling.vo.beans.TheatreBookingLiteVoBean value)
	{
		this.theatrebooking = value;
	}
	public ims.framework.utils.beans.TimeBean getArrivalTime()
	{
		return this.arrivaltime;
	}
	public void setArrivalTime(ims.framework.utils.beans.TimeBean value)
	{
		this.arrivaltime = value;
	}
	public ims.framework.utils.beans.TimeBean getSeenTime()
	{
		return this.seentime;
	}
	public void setSeenTime(ims.framework.utils.beans.TimeBean value)
	{
		this.seentime = value;
	}
	public ims.vo.RefVoBean getCareContext()
	{
		return this.carecontext;
	}
	public void setCareContext(ims.vo.RefVoBean value)
	{
		this.carecontext = value;
	}
	public ims.scheduling.vo.beans.Appt_Tracking_Status_HistoryVoBean[] getApptTrackingStatusHistory()
	{
		return this.appttrackingstatushistory;
	}
	public void setApptTrackingStatusHistory(ims.scheduling.vo.beans.Appt_Tracking_Status_HistoryVoBean[] value)
	{
		this.appttrackingstatushistory = value;
	}
	public ims.framework.utils.beans.ColorBean getDummyColour()
	{
		return this.dummycolour;
	}
	public void setDummyColour(ims.framework.utils.beans.ColorBean value)
	{
		this.dummycolour = value;
	}
	public Boolean getWasReviewed()
	{
		return this.wasreviewed;
	}
	public void setWasReviewed(Boolean value)
	{
		this.wasreviewed = value;
	}
	public ims.vo.RefVoBean getSeenBy()
	{
		return this.seenby;
	}
	public void setSeenBy(ims.vo.RefVoBean value)
	{
		this.seenby = value;
	}
	public String getOutcomeComments()
	{
		return this.outcomecomments;
	}
	public void setOutcomeComments(String value)
	{
		this.outcomecomments = value;
	}
	public ims.vo.RefVoBean getPathwayClock()
	{
		return this.pathwayclock;
	}
	public void setPathwayClock(ims.vo.RefVoBean value)
	{
		this.pathwayclock = value;
	}
	public ims.vo.LookupInstanceBean getConsMediaType()
	{
		return this.consmediatype;
	}
	public void setConsMediaType(ims.vo.LookupInstanceBean value)
	{
		this.consmediatype = value;
	}
	public ims.vo.LookupInstanceBean getCategory()
	{
		return this.category;
	}
	public void setCategory(ims.vo.LookupInstanceBean value)
	{
		this.category = value;
	}
	public Integer getNumProviderCancellations()
	{
		return this.numprovidercancellations;
	}
	public void setNumProviderCancellations(Integer value)
	{
		this.numprovidercancellations = value;
	}
	public Boolean getWasPrinted()
	{
		return this.wasprinted;
	}
	public void setWasPrinted(Boolean value)
	{
		this.wasprinted = value;
	}
	public ims.core.vo.beans.PatientDocumentLiteVoBean getBookingLetter()
	{
		return this.bookingletter;
	}
	public void setBookingLetter(ims.core.vo.beans.PatientDocumentLiteVoBean value)
	{
		this.bookingletter = value;
	}
	public Integer getNumPatientCancellations()
	{
		return this.numpatientcancellations;
	}
	public void setNumPatientCancellations(Integer value)
	{
		this.numpatientcancellations = value;
	}
	public ims.framework.utils.beans.DateBean getFirstApptKPIDate()
	{
		return this.firstapptkpidate;
	}
	public void setFirstApptKPIDate(ims.framework.utils.beans.DateBean value)
	{
		this.firstapptkpidate = value;
	}
	public ims.framework.utils.beans.DateBean getRTTBreachKPIDate()
	{
		return this.rttbreachkpidate;
	}
	public void setRTTBreachKPIDate(ims.framework.utils.beans.DateBean value)
	{
		this.rttbreachkpidate = value;
	}
	public ims.vo.LookupInstanceBean getReasonForBreachingFirstApptKPI()
	{
		return this.reasonforbreachingfirstapptkpi;
	}
	public void setReasonForBreachingFirstApptKPI(ims.vo.LookupInstanceBean value)
	{
		this.reasonforbreachingfirstapptkpi = value;
	}
	public String getCommentsForBreachingFirstApptKPI()
	{
		return this.commentsforbreachingfirstapptkpi;
	}
	public void setCommentsForBreachingFirstApptKPI(String value)
	{
		this.commentsforbreachingfirstapptkpi = value;
	}
	public ims.framework.utils.beans.DateBean getDate28DayRuleBreach()
	{
		return this.date28dayrulebreach;
	}
	public void setDate28DayRuleBreach(ims.framework.utils.beans.DateBean value)
	{
		this.date28dayrulebreach = value;
	}
	public Boolean getDoNotMove()
	{
		return this.donotmove;
	}
	public void setDoNotMove(Boolean value)
	{
		this.donotmove = value;
	}
	public ims.scheduling.vo.beans.BookingAppointmentForLinkedAppointmentsVoBean[] getLinkedAppointments()
	{
		return this.linkedappointments;
	}
	public void setLinkedAppointments(ims.scheduling.vo.beans.BookingAppointmentForLinkedAppointmentsVoBean[] value)
	{
		this.linkedappointments = value;
	}
	public ims.scheduling.vo.beans.BookingAppointmentForLinkedAppointmentsVoBean[] getLinkedApptsToBeCancelled()
	{
		return this.linkedapptstobecancelled;
	}
	public void setLinkedApptsToBeCancelled(ims.scheduling.vo.beans.BookingAppointmentForLinkedAppointmentsVoBean[] value)
	{
		this.linkedapptstobecancelled = value;
	}
	public ims.vo.LookupInstanceBean getDay28BreachReason()
	{
		return this.day28breachreason;
	}
	public void setDay28BreachReason(ims.vo.LookupInstanceBean value)
	{
		this.day28breachreason = value;
	}
	public String getDay28BreachComment()
	{
		return this.day28breachcomment;
	}
	public void setDay28BreachComment(String value)
	{
		this.day28breachcomment = value;
	}
	public ims.scheduling.vo.beans.SessionParentChildSlotForBookingVoBean getParentChildSlot()
	{
		return this.parentchildslot;
	}
	public void setParentChildSlot(ims.scheduling.vo.beans.SessionParentChildSlotForBookingVoBean value)
	{
		this.parentchildslot = value;
	}
	public Boolean getIsFlexibleAppointment()
	{
		return this.isflexibleappointment;
	}
	public void setIsFlexibleAppointment(Boolean value)
	{
		this.isflexibleappointment = value;
	}
	public Boolean getIsWardAttendance()
	{
		return this.iswardattendance;
	}
	public void setIsWardAttendance(Boolean value)
	{
		this.iswardattendance = value;
	}
	public ims.core.vo.beans.ServiceFunctionLiteVoBean getServiceFunction()
	{
		return this.servicefunction;
	}
	public void setServiceFunction(ims.core.vo.beans.ServiceFunctionLiteVoBean value)
	{
		this.servicefunction = value;
	}
	public Boolean getFirstConsultationActivity()
	{
		return this.firstconsultationactivity;
	}
	public void setFirstConsultationActivity(Boolean value)
	{
		this.firstconsultationactivity = value;
	}
	public ims.vo.RefVoBean getElectiveList()
	{
		return this.electivelist;
	}
	public void setElectiveList(ims.vo.RefVoBean value)
	{
		this.electivelist = value;
	}
	public ims.vo.LookupInstanceBean getPatientCategory()
	{
		return this.patientcategory;
	}
	public void setPatientCategory(ims.vo.LookupInstanceBean value)
	{
		this.patientcategory = value;
	}
	public Boolean getApptBookedOnSameDay()
	{
		return this.apptbookedonsameday;
	}
	public void setApptBookedOnSameDay(Boolean value)
	{
		this.apptbookedonsameday = value;
	}
	public Boolean getWasApptCommunicated()
	{
		return this.wasapptcommunicated;
	}
	public void setWasApptCommunicated(Boolean value)
	{
		this.wasapptcommunicated = value;
	}
	public Boolean getIsDisplaced()
	{
		return this.isdisplaced;
	}
	public void setIsDisplaced(Boolean value)
	{
		this.isdisplaced = value;
	}
	public ims.core.vo.beans.HcpLiteVoBean getListOwnerBooked()
	{
		return this.listownerbooked;
	}
	public void setListOwnerBooked(ims.core.vo.beans.HcpLiteVoBean value)
	{
		this.listownerbooked = value;
	}
	public ims.framework.utils.beans.DateTimeBean getOutcomeDateTime()
	{
		return this.outcomedatetime;
	}
	public void setOutcomeDateTime(ims.framework.utils.beans.DateTimeBean value)
	{
		this.outcomedatetime = value;
	}

	private Integer id;
	private int version;
	private ims.framework.utils.beans.DateBean appointmentdate;
	private ims.framework.utils.beans.TimeBean apptstarttime;
	private ims.framework.utils.beans.TimeBean apptendtime;
	private ims.vo.LookupInstanceBean apptstatus;
	private ims.vo.LookupInstanceBean apptstatusreas;
	private ims.scheduling.vo.beans.Appointment_StatusVoBean[] apptstatushistory;
	private ims.scheduling.vo.beans.SessionIntermediateVoBean session;
	private ims.scheduling.vo.beans.SessionSlotVoBean sessionslot;
	private ims.vo.LookupInstanceBean priority;
	private ims.core.vo.beans.ActivitySchedVoBean activity;
	private Boolean iscabbooking;
	private ims.core.vo.beans.PatientShortBean patient;
	private Boolean requiresrebook;
	private ims.framework.utils.beans.DateBean earliestoffereddate;
	private ims.pathways.vo.beans.PatientJourneyVoBean journey;
	private ims.pathways.vo.beans.EventLiteVoBean event;
	private ims.ocrr.vo.beans.OrderInvestigationBookingVoBean orderinvestigation;
	private ims.scheduling.vo.beans.Appointment_StatusVoBean currentstatusrecord;
	private ims.vo.LookupInstanceBean transporttype;
	private Boolean istransportrequired;
	private Boolean istransportbooked;
	private ims.vo.LookupInstanceBean outcome;
	private String comments;
	private ims.scheduling.vo.beans.TheatreBookingLiteVoBean theatrebooking;
	private ims.framework.utils.beans.TimeBean arrivaltime;
	private ims.framework.utils.beans.TimeBean seentime;
	private ims.vo.RefVoBean carecontext;
	private ims.scheduling.vo.beans.Appt_Tracking_Status_HistoryVoBean[] appttrackingstatushistory;
	private ims.framework.utils.beans.ColorBean dummycolour;
	private Boolean wasreviewed;
	private ims.vo.RefVoBean seenby;
	private String outcomecomments;
	private ims.vo.RefVoBean pathwayclock;
	private ims.vo.LookupInstanceBean consmediatype;
	private ims.vo.LookupInstanceBean category;
	private Integer numprovidercancellations;
	private Boolean wasprinted;
	private ims.core.vo.beans.PatientDocumentLiteVoBean bookingletter;
	private Integer numpatientcancellations;
	private ims.framework.utils.beans.DateBean firstapptkpidate;
	private ims.framework.utils.beans.DateBean rttbreachkpidate;
	private ims.vo.LookupInstanceBean reasonforbreachingfirstapptkpi;
	private String commentsforbreachingfirstapptkpi;
	private ims.framework.utils.beans.DateBean date28dayrulebreach;
	private Boolean donotmove;
	private ims.scheduling.vo.beans.BookingAppointmentForLinkedAppointmentsVoBean[] linkedappointments;
	private ims.scheduling.vo.beans.BookingAppointmentForLinkedAppointmentsVoBean[] linkedapptstobecancelled;
	private ims.vo.LookupInstanceBean day28breachreason;
	private String day28breachcomment;
	private ims.scheduling.vo.beans.SessionParentChildSlotForBookingVoBean parentchildslot;
	private Boolean isflexibleappointment;
	private Boolean iswardattendance;
	private ims.core.vo.beans.ServiceFunctionLiteVoBean servicefunction;
	private Boolean firstconsultationactivity;
	private ims.vo.RefVoBean electivelist;
	private ims.vo.LookupInstanceBean patientcategory;
	private Boolean apptbookedonsameday;
	private Boolean wasapptcommunicated;
	private Boolean isdisplaced;
	private ims.core.vo.beans.HcpLiteVoBean listownerbooked;
	private ims.framework.utils.beans.DateTimeBean outcomedatetime;
}
