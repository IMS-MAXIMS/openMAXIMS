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
/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5589.25814)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated: 12/10/2015, 13:28
 *
 */
package ims.scheduling.domain.objects;

/**
 * 
 * @author Rory Fitzpatrick
 * Generated.
 */


public class FutureAppointmentDetails extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1090100021;
	private static final long serialVersionUID = 1090100021L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Referral */
	private ims.RefMan.domain.objects.CatsReferral referral;
	/** Outcome Source */
	private ims.domain.lookups.LookupInstance source;
	/** Appointment Request Type */
	private ims.domain.lookups.LookupInstance requestToSchedule;
	/** Current Status of Pending Request */
	private ims.scheduling.domain.objects.FutureAppointmentStatus currentStatus;
	/** Status History of Pending Request
	  * Collection of ims.scheduling.domain.objects.FutureAppointmentStatus.
	  */
	private java.util.List statusHistory;
	/** All appointments to be booked for the same day */
	private Boolean sameDay;
	/** All appointments to be booked for the same service */
	private Boolean sameService;
	/** Number of Linked or Recurring Appts to be booked */
	private Integer numberOfLinkedRecurringApptsToBook;
	/** 1st Appt Service */
	private ims.core.clinical.domain.objects.Service _1stApptService;
	/** 1st Appt Function */
	private ims.domain.lookups.LookupInstance _1stApptFunction;
	/** 1st Appt Period Value */
	private Integer _1stApptPeriodValue;
	/** 1st Appt Period Type */
	private ims.domain.lookups.LookupInstance _1stApptPeriodType;
	/** 1st Appt Future Appt By Date */
	private java.util.Date _1stApptFutureApptByDate;
	/** 1st Appt to See */
	private ims.RefMan.domain.objects.OPA _1stApptToSee;
	/** The actual appointment created from this pending request */
	private ims.scheduling.domain.objects.Booking_Appointment appointments;
	/** Linked Diagnostics
	  * Collection of ims.RefMan.domain.objects.LinkedDiagnostic.
	  */
	private java.util.List linkedDiagnostics;
	/** Recurring Appointment Starting Week Commencing */
	private java.util.Date startingWeek;
	/** Monday - Recurring Appt */
	private Boolean mon;
	/** Tuesday -  - Recurring Appt */
	private Boolean tues;
	/** Wed  - Recurring Appt */
	private Boolean wed;
	/** Thurs  - Recurring Appt */
	private Boolean thurs;
	/** Fri - Recurring Appt */
	private Boolean fri;
	/** Sat - Recurring Appt */
	private Boolean sat;
	/** Sun  - Recurring Appt */
	private Boolean sun;
	/** Comments */
	private String comments;
	/** 2nd Appt Service */
	private ims.core.clinical.domain.objects.Service _2ndApptService;
	/** 2nd Appt Function */
	private ims.domain.lookups.LookupInstance _2ndApptFunction;
	/** 2nd Appt Period Value */
	private Integer _2ndApptPeriodValue;
	/** 2nd Appt Period Type */
	private ims.domain.lookups.LookupInstance _2ndApptPeriodType;
	/** 2nd Appt Future Appt By Date */
	private java.util.Date _2ndApptFutureApptByDate;
	/** 2nd Appt To See */
	private ims.RefMan.domain.objects.OPA _2ndApptToSee;
	/** 3rd Appt Service */
	private ims.core.clinical.domain.objects.Service _3rdApptService;
	/** 3rd Appt Function */
	private ims.domain.lookups.LookupInstance _3rdApptFunction;
	/** 3rd Appt Period Value */
	private Integer _3rdApptPeriodValue;
	/** 3rd Appt Period Type */
	private ims.domain.lookups.LookupInstance _3rdApptPeriodType;
	/** 3rd Appt Future Appt By Date */
	private java.util.Date _3rdApptFutureApptByDate;
	/** 3rd Appt to See */
	private ims.RefMan.domain.objects.OPA _3rdAppToSee;
	private ims.domain.lookups.LookupInstance recurring;
	private Integer endAfterNOccurrences;
	private Integer noOfTimesPerWeek;
	private Integer everyNMonths;
	private ims.domain.lookups.LookupInstance weekInTheMonth;
	/** Future Appointment Comments */
	private String futureAppointmentComments;
	/** Do Not Move Date  */
	private Boolean doNotMoveDate;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public FutureAppointmentDetails (Integer id, int ver)
    {
    	super(id, ver);
    }
    public FutureAppointmentDetails ()
    {
    	super();
    }
    public FutureAppointmentDetails (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.scheduling.domain.objects.FutureAppointmentDetails.class;
	}


	public ims.RefMan.domain.objects.CatsReferral getReferral() {
		return referral;
	}
	public void setReferral(ims.RefMan.domain.objects.CatsReferral referral) {
		this.referral = referral;
	}

	public ims.domain.lookups.LookupInstance getSource() {
		return source;
	}
	public void setSource(ims.domain.lookups.LookupInstance source) {
		this.source = source;
	}

	public ims.domain.lookups.LookupInstance getRequestToSchedule() {
		return requestToSchedule;
	}
	public void setRequestToSchedule(ims.domain.lookups.LookupInstance requestToSchedule) {
		this.requestToSchedule = requestToSchedule;
	}

	public ims.scheduling.domain.objects.FutureAppointmentStatus getCurrentStatus() {
		return currentStatus;
	}
	public void setCurrentStatus(ims.scheduling.domain.objects.FutureAppointmentStatus currentStatus) {
		this.currentStatus = currentStatus;
	}

	public java.util.List getStatusHistory() {
		if ( null == statusHistory ) {
			statusHistory = new java.util.ArrayList();
		}
		return statusHistory;
	}
	public void setStatusHistory(java.util.List paramValue) {
		this.statusHistory = paramValue;
	}

	public Boolean isSameDay() {
		return sameDay;
	}
	public void setSameDay(Boolean sameDay) {
		this.sameDay = sameDay;
	}

	public Boolean isSameService() {
		return sameService;
	}
	public void setSameService(Boolean sameService) {
		this.sameService = sameService;
	}

	public Integer getNumberOfLinkedRecurringApptsToBook() {
		return numberOfLinkedRecurringApptsToBook;
	}
	public void setNumberOfLinkedRecurringApptsToBook(Integer numberOfLinkedRecurringApptsToBook) {
		this.numberOfLinkedRecurringApptsToBook = numberOfLinkedRecurringApptsToBook;
	}

	public ims.core.clinical.domain.objects.Service get_1stApptService() {
		return _1stApptService;
	}
	public void set_1stApptService(ims.core.clinical.domain.objects.Service _1stApptService) {
		this._1stApptService = _1stApptService;
	}

	public ims.domain.lookups.LookupInstance get_1stApptFunction() {
		return _1stApptFunction;
	}
	public void set_1stApptFunction(ims.domain.lookups.LookupInstance _1stApptFunction) {
		this._1stApptFunction = _1stApptFunction;
	}

	public Integer get_1stApptPeriodValue() {
		return _1stApptPeriodValue;
	}
	public void set_1stApptPeriodValue(Integer _1stApptPeriodValue) {
		this._1stApptPeriodValue = _1stApptPeriodValue;
	}

	public ims.domain.lookups.LookupInstance get_1stApptPeriodType() {
		return _1stApptPeriodType;
	}
	public void set_1stApptPeriodType(ims.domain.lookups.LookupInstance _1stApptPeriodType) {
		this._1stApptPeriodType = _1stApptPeriodType;
	}

	public java.util.Date get_1stApptFutureApptByDate() {
		return _1stApptFutureApptByDate;
	}
	public void set_1stApptFutureApptByDate(java.util.Date _1stApptFutureApptByDate) {
		this._1stApptFutureApptByDate = _1stApptFutureApptByDate;
	}

	public ims.RefMan.domain.objects.OPA get_1stApptToSee() {
		return _1stApptToSee;
	}
	public void set_1stApptToSee(ims.RefMan.domain.objects.OPA _1stApptToSee) {
		this._1stApptToSee = _1stApptToSee;
	}

	public ims.scheduling.domain.objects.Booking_Appointment getAppointments() {
		return appointments;
	}
	public void setAppointments(ims.scheduling.domain.objects.Booking_Appointment appointments) {
		this.appointments = appointments;
	}

	public java.util.List getLinkedDiagnostics() {
		if ( null == linkedDiagnostics ) {
			linkedDiagnostics = new java.util.ArrayList();
		}
		return linkedDiagnostics;
	}
	public void setLinkedDiagnostics(java.util.List paramValue) {
		this.linkedDiagnostics = paramValue;
	}

	public java.util.Date getStartingWeek() {
		return startingWeek;
	}
	public void setStartingWeek(java.util.Date startingWeek) {
		this.startingWeek = startingWeek;
	}

	public Boolean isMon() {
		return mon;
	}
	public void setMon(Boolean mon) {
		this.mon = mon;
	}

	public Boolean isTues() {
		return tues;
	}
	public void setTues(Boolean tues) {
		this.tues = tues;
	}

	public Boolean isWed() {
		return wed;
	}
	public void setWed(Boolean wed) {
		this.wed = wed;
	}

	public Boolean isThurs() {
		return thurs;
	}
	public void setThurs(Boolean thurs) {
		this.thurs = thurs;
	}

	public Boolean isFri() {
		return fri;
	}
	public void setFri(Boolean fri) {
		this.fri = fri;
	}

	public Boolean isSat() {
		return sat;
	}
	public void setSat(Boolean sat) {
		this.sat = sat;
	}

	public Boolean isSun() {
		return sun;
	}
	public void setSun(Boolean sun) {
		this.sun = sun;
	}

	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}

	public ims.core.clinical.domain.objects.Service get_2ndApptService() {
		return _2ndApptService;
	}
	public void set_2ndApptService(ims.core.clinical.domain.objects.Service _2ndApptService) {
		this._2ndApptService = _2ndApptService;
	}

	public ims.domain.lookups.LookupInstance get_2ndApptFunction() {
		return _2ndApptFunction;
	}
	public void set_2ndApptFunction(ims.domain.lookups.LookupInstance _2ndApptFunction) {
		this._2ndApptFunction = _2ndApptFunction;
	}

	public Integer get_2ndApptPeriodValue() {
		return _2ndApptPeriodValue;
	}
	public void set_2ndApptPeriodValue(Integer _2ndApptPeriodValue) {
		this._2ndApptPeriodValue = _2ndApptPeriodValue;
	}

	public ims.domain.lookups.LookupInstance get_2ndApptPeriodType() {
		return _2ndApptPeriodType;
	}
	public void set_2ndApptPeriodType(ims.domain.lookups.LookupInstance _2ndApptPeriodType) {
		this._2ndApptPeriodType = _2ndApptPeriodType;
	}

	public java.util.Date get_2ndApptFutureApptByDate() {
		return _2ndApptFutureApptByDate;
	}
	public void set_2ndApptFutureApptByDate(java.util.Date _2ndApptFutureApptByDate) {
		this._2ndApptFutureApptByDate = _2ndApptFutureApptByDate;
	}

	public ims.RefMan.domain.objects.OPA get_2ndApptToSee() {
		return _2ndApptToSee;
	}
	public void set_2ndApptToSee(ims.RefMan.domain.objects.OPA _2ndApptToSee) {
		this._2ndApptToSee = _2ndApptToSee;
	}

	public ims.core.clinical.domain.objects.Service get_3rdApptService() {
		return _3rdApptService;
	}
	public void set_3rdApptService(ims.core.clinical.domain.objects.Service _3rdApptService) {
		this._3rdApptService = _3rdApptService;
	}

	public ims.domain.lookups.LookupInstance get_3rdApptFunction() {
		return _3rdApptFunction;
	}
	public void set_3rdApptFunction(ims.domain.lookups.LookupInstance _3rdApptFunction) {
		this._3rdApptFunction = _3rdApptFunction;
	}

	public Integer get_3rdApptPeriodValue() {
		return _3rdApptPeriodValue;
	}
	public void set_3rdApptPeriodValue(Integer _3rdApptPeriodValue) {
		this._3rdApptPeriodValue = _3rdApptPeriodValue;
	}

	public ims.domain.lookups.LookupInstance get_3rdApptPeriodType() {
		return _3rdApptPeriodType;
	}
	public void set_3rdApptPeriodType(ims.domain.lookups.LookupInstance _3rdApptPeriodType) {
		this._3rdApptPeriodType = _3rdApptPeriodType;
	}

	public java.util.Date get_3rdApptFutureApptByDate() {
		return _3rdApptFutureApptByDate;
	}
	public void set_3rdApptFutureApptByDate(java.util.Date _3rdApptFutureApptByDate) {
		this._3rdApptFutureApptByDate = _3rdApptFutureApptByDate;
	}

	public ims.RefMan.domain.objects.OPA get_3rdAppToSee() {
		return _3rdAppToSee;
	}
	public void set_3rdAppToSee(ims.RefMan.domain.objects.OPA _3rdAppToSee) {
		this._3rdAppToSee = _3rdAppToSee;
	}

	public ims.domain.lookups.LookupInstance getRecurring() {
		return recurring;
	}
	public void setRecurring(ims.domain.lookups.LookupInstance recurring) {
		this.recurring = recurring;
	}

	public Integer getEndAfterNOccurrences() {
		return endAfterNOccurrences;
	}
	public void setEndAfterNOccurrences(Integer endAfterNOccurrences) {
		this.endAfterNOccurrences = endAfterNOccurrences;
	}

	public Integer getNoOfTimesPerWeek() {
		return noOfTimesPerWeek;
	}
	public void setNoOfTimesPerWeek(Integer noOfTimesPerWeek) {
		this.noOfTimesPerWeek = noOfTimesPerWeek;
	}

	public Integer getEveryNMonths() {
		return everyNMonths;
	}
	public void setEveryNMonths(Integer everyNMonths) {
		this.everyNMonths = everyNMonths;
	}

	public ims.domain.lookups.LookupInstance getWeekInTheMonth() {
		return weekInTheMonth;
	}
	public void setWeekInTheMonth(ims.domain.lookups.LookupInstance weekInTheMonth) {
		this.weekInTheMonth = weekInTheMonth;
	}

	public String getFutureAppointmentComments() {
		return futureAppointmentComments;
	}
	public void setFutureAppointmentComments(String futureAppointmentComments) {
		if ( null != futureAppointmentComments && futureAppointmentComments.length() > 750 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for futureAppointmentComments. Tried to set value: "+
				futureAppointmentComments);
		}
		this.futureAppointmentComments = futureAppointmentComments;
	}

	public Boolean isDoNotMoveDate() {
		return doNotMoveDate;
	}
	public void setDoNotMoveDate(Boolean doNotMoveDate) {
		this.doNotMoveDate = doNotMoveDate;
	}

	public ims.domain.SystemInformation getSystemInformation() {
		if (systemInformation == null) systemInformation = new ims.domain.SystemInformation();
		return systemInformation;
	}


	/**
	 * isConfigurationObject
	 * Taken from the Usage property of the business object, this method will return
	 * a boolean indicating whether this is a configuration object or not
	 * Configuration = true, Instantiation = false
	 */
	public static boolean isConfigurationObject()
	{
		if ( "Instantiation".equals("Configuration") )
			return true;
		else
			return false;
	}





	public int getClassId() {
		return CLASSID;
	}

	public String getClassVersion()
	{
		return CLASSVERSION;
	}

	public String toAuditString()
	{
		StringBuffer auditStr = new StringBuffer();
		
		auditStr.append("\r\n*referral* :");
		if (referral != null)
		{
			auditStr.append(toShortClassName(referral));
				
		    auditStr.append(referral.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*source* :");
		if (source != null)
			auditStr.append(source.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*requestToSchedule* :");
		if (requestToSchedule != null)
			auditStr.append(requestToSchedule.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*currentStatus* :");
		if (currentStatus != null)
		{
			auditStr.append(toShortClassName(currentStatus));
				
		    auditStr.append(currentStatus.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*statusHistory* :");
		if (statusHistory != null)
		{
		int i5=0;
		for (i5=0; i5<statusHistory.size(); i5++)
		{
			if (i5 > 0)
				auditStr.append(",");
			ims.scheduling.domain.objects.FutureAppointmentStatus obj = (ims.scheduling.domain.objects.FutureAppointmentStatus)statusHistory.get(i5);
		    if (obj != null)
			{
				if (i5 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i5 > 0)
			auditStr.append("] " + i5);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*sameDay* :");
		auditStr.append(sameDay);
	    auditStr.append("; ");
		auditStr.append("\r\n*sameService* :");
		auditStr.append(sameService);
	    auditStr.append("; ");
		auditStr.append("\r\n*numberOfLinkedRecurringApptsToBook* :");
		auditStr.append(numberOfLinkedRecurringApptsToBook);
	    auditStr.append("; ");
		auditStr.append("\r\n*_1stApptService* :");
		if (_1stApptService != null)
		{
			auditStr.append(toShortClassName(_1stApptService));
				
		    auditStr.append(_1stApptService.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*_1stApptFunction* :");
		if (_1stApptFunction != null)
			auditStr.append(_1stApptFunction.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*_1stApptPeriodValue* :");
		auditStr.append(_1stApptPeriodValue);
	    auditStr.append("; ");
		auditStr.append("\r\n*_1stApptPeriodType* :");
		if (_1stApptPeriodType != null)
			auditStr.append(_1stApptPeriodType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*_1stApptFutureApptByDate* :");
		auditStr.append(_1stApptFutureApptByDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*_1stApptToSee* :");
		if (_1stApptToSee != null)
		{
			auditStr.append(toShortClassName(_1stApptToSee));
				
		    auditStr.append(_1stApptToSee.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*appointments* :");
		if (appointments != null)
		{
			auditStr.append(toShortClassName(appointments));
				
		    auditStr.append(appointments.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*linkedDiagnostics* :");
		if (linkedDiagnostics != null)
		{
		int i16=0;
		for (i16=0; i16<linkedDiagnostics.size(); i16++)
		{
			if (i16 > 0)
				auditStr.append(",");
			ims.RefMan.domain.objects.LinkedDiagnostic obj = (ims.RefMan.domain.objects.LinkedDiagnostic)linkedDiagnostics.get(i16);
		    if (obj != null)
			{
				if (i16 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i16 > 0)
			auditStr.append("] " + i16);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*startingWeek* :");
		auditStr.append(startingWeek);
	    auditStr.append("; ");
		auditStr.append("\r\n*mon* :");
		auditStr.append(mon);
	    auditStr.append("; ");
		auditStr.append("\r\n*tues* :");
		auditStr.append(tues);
	    auditStr.append("; ");
		auditStr.append("\r\n*wed* :");
		auditStr.append(wed);
	    auditStr.append("; ");
		auditStr.append("\r\n*thurs* :");
		auditStr.append(thurs);
	    auditStr.append("; ");
		auditStr.append("\r\n*fri* :");
		auditStr.append(fri);
	    auditStr.append("; ");
		auditStr.append("\r\n*sat* :");
		auditStr.append(sat);
	    auditStr.append("; ");
		auditStr.append("\r\n*sun* :");
		auditStr.append(sun);
	    auditStr.append("; ");
		auditStr.append("\r\n*comments* :");
		auditStr.append(comments);
	    auditStr.append("; ");
		auditStr.append("\r\n*_2ndApptService* :");
		if (_2ndApptService != null)
		{
			auditStr.append(toShortClassName(_2ndApptService));
				
		    auditStr.append(_2ndApptService.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*_2ndApptFunction* :");
		if (_2ndApptFunction != null)
			auditStr.append(_2ndApptFunction.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*_2ndApptPeriodValue* :");
		auditStr.append(_2ndApptPeriodValue);
	    auditStr.append("; ");
		auditStr.append("\r\n*_2ndApptPeriodType* :");
		if (_2ndApptPeriodType != null)
			auditStr.append(_2ndApptPeriodType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*_2ndApptFutureApptByDate* :");
		auditStr.append(_2ndApptFutureApptByDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*_2ndApptToSee* :");
		if (_2ndApptToSee != null)
		{
			auditStr.append(toShortClassName(_2ndApptToSee));
				
		    auditStr.append(_2ndApptToSee.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*_3rdApptService* :");
		if (_3rdApptService != null)
		{
			auditStr.append(toShortClassName(_3rdApptService));
				
		    auditStr.append(_3rdApptService.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*_3rdApptFunction* :");
		if (_3rdApptFunction != null)
			auditStr.append(_3rdApptFunction.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*_3rdApptPeriodValue* :");
		auditStr.append(_3rdApptPeriodValue);
	    auditStr.append("; ");
		auditStr.append("\r\n*_3rdApptPeriodType* :");
		if (_3rdApptPeriodType != null)
			auditStr.append(_3rdApptPeriodType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*_3rdApptFutureApptByDate* :");
		auditStr.append(_3rdApptFutureApptByDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*_3rdAppToSee* :");
		if (_3rdAppToSee != null)
		{
			auditStr.append(toShortClassName(_3rdAppToSee));
				
		    auditStr.append(_3rdAppToSee.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*recurring* :");
		if (recurring != null)
			auditStr.append(recurring.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*endAfterNOccurrences* :");
		auditStr.append(endAfterNOccurrences);
	    auditStr.append("; ");
		auditStr.append("\r\n*noOfTimesPerWeek* :");
		auditStr.append(noOfTimesPerWeek);
	    auditStr.append("; ");
		auditStr.append("\r\n*everyNMonths* :");
		auditStr.append(everyNMonths);
	    auditStr.append("; ");
		auditStr.append("\r\n*weekInTheMonth* :");
		if (weekInTheMonth != null)
			auditStr.append(weekInTheMonth.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*futureAppointmentComments* :");
		auditStr.append(futureAppointmentComments);
	    auditStr.append("; ");
		auditStr.append("\r\n*doNotMoveDate* :");
		auditStr.append(doNotMoveDate);
	    auditStr.append("; ");
		return auditStr.toString();
	}
	
	public String toXMLString()
	{
		return toXMLString(new java.util.HashMap());
	}
	
	public String toXMLString(java.util.HashMap domMap)
	{
		StringBuffer sb = new StringBuffer();
		sb.append("<class type=\"" + this.getClass().getName() + "\" ");		
		sb.append(" id=\"" + this.getId() + "\""); 
		sb.append(" source=\"" + ims.configuration.EnvironmentConfig.getImportExportSourceName() + "\" ");
		sb.append(" classVersion=\"" + this.getClassVersion() + "\" ");
		sb.append(" component=\"" + this.getIsComponentClass() + "\" >");
		
		if (domMap.get(this) == null)
		{
			domMap.put(this, this);
			sb.append(this.fieldsToXMLString(domMap));
		}
		sb.append("</class>");
		
		String keyClassName = "FutureAppointmentDetails";
		String externalSource = ims.configuration.EnvironmentConfig.getImportExportSourceName();
		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + this.getId());
		if (impObj == null)
		{
    		impObj = new ims.configuration.ImportedObject();
    		impObj.setExternalId(this.getId());
    		impObj.setExternalSource(externalSource);
    		impObj.setDomainObject(this);
			impObj.setLocalId(this.getId()); 
    		impObj.setClassName(keyClassName); 
			domMap.put(keyClassName + "_" + externalSource + "_" + this.getId(), impObj);
		}
		
		return sb.toString();
	}

	public String fieldsToXMLString(java.util.HashMap domMap)
	{
		StringBuffer sb = new StringBuffer();
		if (this.getReferral() != null)
		{
			sb.append("<referral>");
			sb.append(this.getReferral().toXMLString(domMap)); 	
			sb.append("</referral>");		
		}
		if (this.getSource() != null)
		{
			sb.append("<source>");
			sb.append(this.getSource().toXMLString()); 
			sb.append("</source>");		
		}
		if (this.getRequestToSchedule() != null)
		{
			sb.append("<requestToSchedule>");
			sb.append(this.getRequestToSchedule().toXMLString()); 
			sb.append("</requestToSchedule>");		
		}
		if (this.getCurrentStatus() != null)
		{
			sb.append("<currentStatus>");
			sb.append(this.getCurrentStatus().toXMLString(domMap)); 	
			sb.append("</currentStatus>");		
		}
		if (this.getStatusHistory() != null)
		{
			if (this.getStatusHistory().size() > 0 )
			{
			sb.append("<statusHistory>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getStatusHistory(), domMap));
			sb.append("</statusHistory>");		
			}
		}
		if (this.isSameDay() != null)
		{
			sb.append("<sameDay>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isSameDay().toString()));
			sb.append("</sameDay>");		
		}
		if (this.isSameService() != null)
		{
			sb.append("<sameService>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isSameService().toString()));
			sb.append("</sameService>");		
		}
		if (this.getNumberOfLinkedRecurringApptsToBook() != null)
		{
			sb.append("<numberOfLinkedRecurringApptsToBook>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNumberOfLinkedRecurringApptsToBook().toString()));
			sb.append("</numberOfLinkedRecurringApptsToBook>");		
		}
		if (this.get_1stApptService() != null)
		{
			sb.append("<_1stApptService>");
			sb.append(this.get_1stApptService().toXMLString(domMap)); 	
			sb.append("</_1stApptService>");		
		}
		if (this.get_1stApptFunction() != null)
		{
			sb.append("<_1stApptFunction>");
			sb.append(this.get_1stApptFunction().toXMLString()); 
			sb.append("</_1stApptFunction>");		
		}
		if (this.get_1stApptPeriodValue() != null)
		{
			sb.append("<_1stApptPeriodValue>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.get_1stApptPeriodValue().toString()));
			sb.append("</_1stApptPeriodValue>");		
		}
		if (this.get_1stApptPeriodType() != null)
		{
			sb.append("<_1stApptPeriodType>");
			sb.append(this.get_1stApptPeriodType().toXMLString()); 
			sb.append("</_1stApptPeriodType>");		
		}
		if (this.get_1stApptFutureApptByDate() != null)
		{
			sb.append("<_1stApptFutureApptByDate>");
			sb.append(new ims.framework.utils.DateTime(this.get_1stApptFutureApptByDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</_1stApptFutureApptByDate>");		
		}
		if (this.get_1stApptToSee() != null)
		{
			sb.append("<_1stApptToSee>");
			sb.append(this.get_1stApptToSee().toXMLString(domMap)); 	
			sb.append("</_1stApptToSee>");		
		}
		if (this.getAppointments() != null)
		{
			sb.append("<appointments>");
			sb.append(this.getAppointments().toXMLString(domMap)); 	
			sb.append("</appointments>");		
		}
		if (this.getLinkedDiagnostics() != null)
		{
			if (this.getLinkedDiagnostics().size() > 0 )
			{
			sb.append("<linkedDiagnostics>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getLinkedDiagnostics(), domMap));
			sb.append("</linkedDiagnostics>");		
			}
		}
		if (this.getStartingWeek() != null)
		{
			sb.append("<startingWeek>");
			sb.append(new ims.framework.utils.DateTime(this.getStartingWeek()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</startingWeek>");		
		}
		if (this.isMon() != null)
		{
			sb.append("<mon>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isMon().toString()));
			sb.append("</mon>");		
		}
		if (this.isTues() != null)
		{
			sb.append("<tues>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isTues().toString()));
			sb.append("</tues>");		
		}
		if (this.isWed() != null)
		{
			sb.append("<wed>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isWed().toString()));
			sb.append("</wed>");		
		}
		if (this.isThurs() != null)
		{
			sb.append("<thurs>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isThurs().toString()));
			sb.append("</thurs>");		
		}
		if (this.isFri() != null)
		{
			sb.append("<fri>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isFri().toString()));
			sb.append("</fri>");		
		}
		if (this.isSat() != null)
		{
			sb.append("<sat>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isSat().toString()));
			sb.append("</sat>");		
		}
		if (this.isSun() != null)
		{
			sb.append("<sun>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isSun().toString()));
			sb.append("</sun>");		
		}
		if (this.getComments() != null)
		{
			sb.append("<comments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getComments().toString()));
			sb.append("</comments>");		
		}
		if (this.get_2ndApptService() != null)
		{
			sb.append("<_2ndApptService>");
			sb.append(this.get_2ndApptService().toXMLString(domMap)); 	
			sb.append("</_2ndApptService>");		
		}
		if (this.get_2ndApptFunction() != null)
		{
			sb.append("<_2ndApptFunction>");
			sb.append(this.get_2ndApptFunction().toXMLString()); 
			sb.append("</_2ndApptFunction>");		
		}
		if (this.get_2ndApptPeriodValue() != null)
		{
			sb.append("<_2ndApptPeriodValue>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.get_2ndApptPeriodValue().toString()));
			sb.append("</_2ndApptPeriodValue>");		
		}
		if (this.get_2ndApptPeriodType() != null)
		{
			sb.append("<_2ndApptPeriodType>");
			sb.append(this.get_2ndApptPeriodType().toXMLString()); 
			sb.append("</_2ndApptPeriodType>");		
		}
		if (this.get_2ndApptFutureApptByDate() != null)
		{
			sb.append("<_2ndApptFutureApptByDate>");
			sb.append(new ims.framework.utils.DateTime(this.get_2ndApptFutureApptByDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</_2ndApptFutureApptByDate>");		
		}
		if (this.get_2ndApptToSee() != null)
		{
			sb.append("<_2ndApptToSee>");
			sb.append(this.get_2ndApptToSee().toXMLString(domMap)); 	
			sb.append("</_2ndApptToSee>");		
		}
		if (this.get_3rdApptService() != null)
		{
			sb.append("<_3rdApptService>");
			sb.append(this.get_3rdApptService().toXMLString(domMap)); 	
			sb.append("</_3rdApptService>");		
		}
		if (this.get_3rdApptFunction() != null)
		{
			sb.append("<_3rdApptFunction>");
			sb.append(this.get_3rdApptFunction().toXMLString()); 
			sb.append("</_3rdApptFunction>");		
		}
		if (this.get_3rdApptPeriodValue() != null)
		{
			sb.append("<_3rdApptPeriodValue>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.get_3rdApptPeriodValue().toString()));
			sb.append("</_3rdApptPeriodValue>");		
		}
		if (this.get_3rdApptPeriodType() != null)
		{
			sb.append("<_3rdApptPeriodType>");
			sb.append(this.get_3rdApptPeriodType().toXMLString()); 
			sb.append("</_3rdApptPeriodType>");		
		}
		if (this.get_3rdApptFutureApptByDate() != null)
		{
			sb.append("<_3rdApptFutureApptByDate>");
			sb.append(new ims.framework.utils.DateTime(this.get_3rdApptFutureApptByDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</_3rdApptFutureApptByDate>");		
		}
		if (this.get_3rdAppToSee() != null)
		{
			sb.append("<_3rdAppToSee>");
			sb.append(this.get_3rdAppToSee().toXMLString(domMap)); 	
			sb.append("</_3rdAppToSee>");		
		}
		if (this.getRecurring() != null)
		{
			sb.append("<recurring>");
			sb.append(this.getRecurring().toXMLString()); 
			sb.append("</recurring>");		
		}
		if (this.getEndAfterNOccurrences() != null)
		{
			sb.append("<endAfterNOccurrences>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getEndAfterNOccurrences().toString()));
			sb.append("</endAfterNOccurrences>");		
		}
		if (this.getNoOfTimesPerWeek() != null)
		{
			sb.append("<noOfTimesPerWeek>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNoOfTimesPerWeek().toString()));
			sb.append("</noOfTimesPerWeek>");		
		}
		if (this.getEveryNMonths() != null)
		{
			sb.append("<everyNMonths>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getEveryNMonths().toString()));
			sb.append("</everyNMonths>");		
		}
		if (this.getWeekInTheMonth() != null)
		{
			sb.append("<weekInTheMonth>");
			sb.append(this.getWeekInTheMonth().toXMLString()); 
			sb.append("</weekInTheMonth>");		
		}
		if (this.getFutureAppointmentComments() != null)
		{
			sb.append("<futureAppointmentComments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getFutureAppointmentComments().toString()));
			sb.append("</futureAppointmentComments>");		
		}
		if (this.isDoNotMoveDate() != null)
		{
			sb.append("<doNotMoveDate>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isDoNotMoveDate().toString()));
			sb.append("</doNotMoveDate>");		
		}
		return sb.toString();
	}
		
	public static java.util.List fromListXMLString(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.List list, java.util.HashMap domMap) throws Exception
	{
		if (list == null)
		 list = new java.util.ArrayList();
		fillListFromXMLString(list, el, factory, domMap);
		return list;
	}
	
	public static java.util.Set fromSetXMLString(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.Set set, java.util.HashMap domMap) throws Exception
	{
		if (set == null)
			 set = new java.util.HashSet();
		fillSetFromXMLString(set, el, factory, domMap);
		return set;
	}
	
	private static void fillSetFromXMLString(java.util.Set set, org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return;
		
		java.util.List cl = el.elements("class");
		int size = cl.size();
		
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			org.dom4j.Element itemEl = (org.dom4j.Element)cl.get(i);
			FutureAppointmentDetails domainObject = getFutureAppointmentDetailsfromXML(itemEl, factory, domMap);

			if (domainObject == null)
			{
				continue;
			}
			
			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!set.contains(domainObject)) 
				set.add(domainObject);
			newSet.add(domainObject);			
		}
		
		java.util.Set removedSet = new java.util.HashSet();
		java.util.Iterator iter = set.iterator();
		//Find out which objects need to be removed
		while (iter.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet.contains(o))
			{
				removedSet.add(o);
			}
		}
		iter = removedSet.iterator();
		//Remove the unwanted objects
		while (iter.hasNext())
		{
			set.remove(iter.next());
		}		
	}
	
	private static void fillListFromXMLString(java.util.List list, org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return;
		
		java.util.List cl = el.elements("class");
		int size = cl.size();
		
		for(int i=0; i<size; i++) 
		{
			org.dom4j.Element itemEl = (org.dom4j.Element)cl.get(i);
			FutureAppointmentDetails domainObject = getFutureAppointmentDetailsfromXML(itemEl, factory, domMap);

			if (domainObject == null)
			{
				continue;
			}

			int domIdx = list.indexOf(domainObject);
			if (domIdx == -1)
			{
				list.add(i, domainObject);
			}
			else if (i != domIdx && i < list.size())
			{
				Object tmp = list.get(i);
				list.set(i, list.get(domIdx));
				list.set(domIdx, tmp);
			}
		}		
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i1=list.size();
		while (i1 > size)
		{
			list.remove(i1-1);
			i1=list.size();
		}
	}
		
	public static FutureAppointmentDetails getFutureAppointmentDetailsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getFutureAppointmentDetailsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static FutureAppointmentDetails getFutureAppointmentDetailsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!FutureAppointmentDetails.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!FutureAppointmentDetails.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the FutureAppointmentDetails class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (FutureAppointmentDetails)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(FutureAppointmentDetails.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		FutureAppointmentDetails ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (FutureAppointmentDetails)factory.getImportedDomainObject(FutureAppointmentDetails.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new FutureAppointmentDetails();
		}
		String keyClassName = "FutureAppointmentDetails";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (FutureAppointmentDetails)impObj.getDomainObject();
		}
		else
		{
    		impObj = new ims.configuration.ImportedObject();
    		impObj.setExternalId(extId);
    		impObj.setExternalSource(externalSource);
    		impObj.setDomainObject(ret);
			domMap.put(keyClassName + "_" + externalSource + "_" + extId, impObj);
		}
		fillFieldsfromXML(el, factory, ret, domMap);
		return ret;
	}

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, FutureAppointmentDetails obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("referral");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setReferral(ims.RefMan.domain.objects.CatsReferral.getCatsReferralfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("source");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSource(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("requestToSchedule");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setRequestToSchedule(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("currentStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCurrentStatus(ims.scheduling.domain.objects.FutureAppointmentStatus.getFutureAppointmentStatusfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("statusHistory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setStatusHistory(ims.scheduling.domain.objects.FutureAppointmentStatus.fromListXMLString(fldEl, factory, obj.getStatusHistory(), domMap));
		}
		fldEl = el.element("sameDay");
		if(fldEl != null)
		{	
    		obj.setSameDay(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("sameService");
		if(fldEl != null)
		{	
    		obj.setSameService(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("numberOfLinkedRecurringApptsToBook");
		if(fldEl != null)
		{	
    		obj.setNumberOfLinkedRecurringApptsToBook(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("_1stApptService");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.set_1stApptService(ims.core.clinical.domain.objects.Service.getServicefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("_1stApptFunction");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.set_1stApptFunction(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("_1stApptPeriodValue");
		if(fldEl != null)
		{	
    		obj.set_1stApptPeriodValue(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("_1stApptPeriodType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.set_1stApptPeriodType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("_1stApptFutureApptByDate");
		if(fldEl != null)
		{	
    		obj.set_1stApptFutureApptByDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("_1stApptToSee");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.set_1stApptToSee(ims.RefMan.domain.objects.OPA.getOPAfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("appointments");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAppointments(ims.scheduling.domain.objects.Booking_Appointment.getBooking_AppointmentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("linkedDiagnostics");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setLinkedDiagnostics(ims.RefMan.domain.objects.LinkedDiagnostic.fromListXMLString(fldEl, factory, obj.getLinkedDiagnostics(), domMap));
		}
		fldEl = el.element("startingWeek");
		if(fldEl != null)
		{	
    		obj.setStartingWeek(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("mon");
		if(fldEl != null)
		{	
    		obj.setMon(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("tues");
		if(fldEl != null)
		{	
    		obj.setTues(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("wed");
		if(fldEl != null)
		{	
    		obj.setWed(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("thurs");
		if(fldEl != null)
		{	
    		obj.setThurs(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("fri");
		if(fldEl != null)
		{	
    		obj.setFri(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("sat");
		if(fldEl != null)
		{	
    		obj.setSat(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("sun");
		if(fldEl != null)
		{	
    		obj.setSun(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("comments");
		if(fldEl != null)
		{	
    		obj.setComments(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("_2ndApptService");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.set_2ndApptService(ims.core.clinical.domain.objects.Service.getServicefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("_2ndApptFunction");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.set_2ndApptFunction(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("_2ndApptPeriodValue");
		if(fldEl != null)
		{	
    		obj.set_2ndApptPeriodValue(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("_2ndApptPeriodType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.set_2ndApptPeriodType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("_2ndApptFutureApptByDate");
		if(fldEl != null)
		{	
    		obj.set_2ndApptFutureApptByDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("_2ndApptToSee");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.set_2ndApptToSee(ims.RefMan.domain.objects.OPA.getOPAfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("_3rdApptService");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.set_3rdApptService(ims.core.clinical.domain.objects.Service.getServicefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("_3rdApptFunction");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.set_3rdApptFunction(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("_3rdApptPeriodValue");
		if(fldEl != null)
		{	
    		obj.set_3rdApptPeriodValue(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("_3rdApptPeriodType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.set_3rdApptPeriodType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("_3rdApptFutureApptByDate");
		if(fldEl != null)
		{	
    		obj.set_3rdApptFutureApptByDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("_3rdAppToSee");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.set_3rdAppToSee(ims.RefMan.domain.objects.OPA.getOPAfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("recurring");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setRecurring(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("endAfterNOccurrences");
		if(fldEl != null)
		{	
    		obj.setEndAfterNOccurrences(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("noOfTimesPerWeek");
		if(fldEl != null)
		{	
    		obj.setNoOfTimesPerWeek(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("everyNMonths");
		if(fldEl != null)
		{	
    		obj.setEveryNMonths(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("weekInTheMonth");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setWeekInTheMonth(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("futureAppointmentComments");
		if(fldEl != null)
		{	
    		obj.setFutureAppointmentComments(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("doNotMoveDate");
		if(fldEl != null)
		{	
    		obj.setDoNotMoveDate(new Boolean(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "statusHistory"
		, "linkedDiagnostics"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Referral = "referral";
		public static final String Source = "source";
		public static final String RequestToSchedule = "requestToSchedule";
		public static final String CurrentStatus = "currentStatus";
		public static final String StatusHistory = "statusHistory";
		public static final String SameDay = "sameDay";
		public static final String SameService = "sameService";
		public static final String NumberOfLinkedRecurringApptsToBook = "numberOfLinkedRecurringApptsToBook";
		public static final String _1stApptService = "_1stApptService";
		public static final String _1stApptFunction = "_1stApptFunction";
		public static final String _1stApptPeriodValue = "_1stApptPeriodValue";
		public static final String _1stApptPeriodType = "_1stApptPeriodType";
		public static final String _1stApptFutureApptByDate = "_1stApptFutureApptByDate";
		public static final String _1stApptToSee = "_1stApptToSee";
		public static final String Appointments = "appointments";
		public static final String LinkedDiagnostics = "linkedDiagnostics";
		public static final String StartingWeek = "startingWeek";
		public static final String Mon = "mon";
		public static final String Tues = "tues";
		public static final String Wed = "wed";
		public static final String Thurs = "thurs";
		public static final String Fri = "fri";
		public static final String Sat = "sat";
		public static final String Sun = "sun";
		public static final String Comments = "comments";
		public static final String _2ndApptService = "_2ndApptService";
		public static final String _2ndApptFunction = "_2ndApptFunction";
		public static final String _2ndApptPeriodValue = "_2ndApptPeriodValue";
		public static final String _2ndApptPeriodType = "_2ndApptPeriodType";
		public static final String _2ndApptFutureApptByDate = "_2ndApptFutureApptByDate";
		public static final String _2ndApptToSee = "_2ndApptToSee";
		public static final String _3rdApptService = "_3rdApptService";
		public static final String _3rdApptFunction = "_3rdApptFunction";
		public static final String _3rdApptPeriodValue = "_3rdApptPeriodValue";
		public static final String _3rdApptPeriodType = "_3rdApptPeriodType";
		public static final String _3rdApptFutureApptByDate = "_3rdApptFutureApptByDate";
		public static final String _3rdAppToSee = "_3rdAppToSee";
		public static final String Recurring = "recurring";
		public static final String EndAfterNOccurrences = "endAfterNOccurrences";
		public static final String NoOfTimesPerWeek = "noOfTimesPerWeek";
		public static final String EveryNMonths = "everyNMonths";
		public static final String WeekInTheMonth = "weekInTheMonth";
		public static final String FutureAppointmentComments = "futureAppointmentComments";
		public static final String DoNotMoveDate = "doNotMoveDate";
	}
}

