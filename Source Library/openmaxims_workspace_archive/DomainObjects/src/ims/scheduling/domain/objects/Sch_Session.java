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
/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated: 16/04/2014, 12:34
 *
 */
package ims.scheduling.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class Sch_Session extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1055100010;
	private static final long serialVersionUID = 1055100010L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Name */
	private String name;
	/** Description */
	private String description;
	/** SessionDate */
	private java.util.Date sessionDate;
	/** StartTime */
	private String startTm;
	/** End Time */
	private String endTm;
	/** Service */
	private ims.core.clinical.domain.objects.Service service;
	/** Session Status - Open/Blocked/Cancelled */
	private ims.domain.lookups.LookupInstance sessionStatus;
	/** Status Reason */
	private ims.domain.lookups.LookupInstance statusReason;
	/** RemainingSlots */
	private Integer remainingSlots;
	/** TotalSlots */
	private Integer totalSlots;
	/** isFixed */
	private Boolean isFixed;
	/** PASClinic */
	private ims.domain.lookups.LookupInstance pASClinic;
	/** Duration(min) */
	private Integer duration;
	/** Remaining Time(min) */
	private Integer remainingTime;
	/** Sch_Profile */
	private ims.scheduling.domain.objects.Sch_Profile sch_Profile;
	/** ScheduledLocation */
	private ims.core.resource.place.domain.objects.Location schLocation;
	/** SessionType - Single / Multiple */
	private ims.domain.lookups.LookupInstance sessionType;
	/** Minimal Interval Between Appointments */
	private Integer minInt;
	/** RoundAttendanceTime */
	private Integer roundAttTime;
	/** LastAppInterval */
	private Integer lastAppInterval;
	/** Maximim Number of Appointments */
	private Integer maxNoAppts;
	/** SessionSlots
	  * Collection of ims.scheduling.domain.objects.Session_Slot.
	  */
	private java.util.Set sessionSlots;
	/** BookingRights
	  * Collection of ims.scheduling.domain.objects.Session_BookingRight.
	  */
	private java.util.Set bookingRights;
	/** DirectoryOfServices
	  * Collection of ims.scheduling.domain.objects.DirectoryofService.
	  */
	private java.util.Set directoryofServices;
	/** ListOwners
	  * Collection of ims.scheduling.domain.objects.Session_ListOwner.
	  */
	private java.util.Set listOwners;
	/** ExclusionTimes
	  * Collection of ims.scheduling.domain.objects.Session_Exc_Time.
	  */
	private java.util.Set exclusionTimes;
	/** isModified */
	private Boolean isModified;
	/** isAdHocSession */
	private Boolean isAdHocSession;
	/** isActive */
	private Boolean isActive;
	/** Activity Pathway Events
	  * Collection of ims.scheduling.domain.objects.SessionActivityPathwayEvent.
	  */
	private java.util.Set activityPathwayEvents;
	/** TheatreProceduresRemaining */
	private ims.scheduling.domain.objects.SessionTheatreProceduresRemanining theatreProceduresRemaining;
	/** Theatre Session */
	private Boolean isTheatreSession;
	/** Day Case / Inpatient */
	private ims.domain.lookups.LookupInstance theatreType;
	/** SessionActivities
	  * Collection of ims.scheduling.domain.objects.SessionActivity.
	  */
	private java.util.Set sessionActivities;
	/** Max Continuous Available Mins */
	private Integer maxContinuousAvailableMins;
	/** Theatre Slots
	  * Collection of ims.scheduling.domain.objects.SessionTheatreTCISlot.
	  */
	private java.util.Set theatreSlots;
	/** Applies to Theatre  Sessions only
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List anaestheticType;
	/** Fixed Parent Child Slots
	  * Collection of ims.scheduling.domain.objects.SessionParentChildSlot.
	  */
	private java.util.Set parentChildSlots;
	/** Slots,TheatreTCITime etc. */
	private ims.domain.lookups.LookupInstance slotType;
	/** Cancellation Reason */
	private ims.domain.lookups.LookupInstance cancellationReason;
	/** Comment */
	private String comment;
	/** Flag to Indicate if the session was moved */
	private Boolean wasSessionMoved;
	/** Consultation Media Type */
	private ims.domain.lookups.LookupInstance consMediaType;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public Sch_Session (Integer id, int ver)
    {
    	super(id, ver);
    }
    public Sch_Session ()
    {
    	super();
    }
    public Sch_Session (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.scheduling.domain.objects.Sch_Session.class;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		if ( null != name && name.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for name. Tried to set value: "+
				name);
		}
		this.name = name;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		if ( null != description && description.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for description. Tried to set value: "+
				description);
		}
		this.description = description;
	}

	public java.util.Date getSessionDate() {
		return sessionDate;
	}
	public void setSessionDate(java.util.Date sessionDate) {
		this.sessionDate = sessionDate;
	}

	public String getStartTm() {
		return startTm;
	}
	public void setStartTm(String startTm) {
		this.startTm = startTm;
	}

	public String getEndTm() {
		return endTm;
	}
	public void setEndTm(String endTm) {
		this.endTm = endTm;
	}

	public ims.core.clinical.domain.objects.Service getService() {
		return service;
	}
	public void setService(ims.core.clinical.domain.objects.Service service) {
		this.service = service;
	}

	public ims.domain.lookups.LookupInstance getSessionStatus() {
		return sessionStatus;
	}
	public void setSessionStatus(ims.domain.lookups.LookupInstance sessionStatus) {
		this.sessionStatus = sessionStatus;
	}

	public ims.domain.lookups.LookupInstance getStatusReason() {
		return statusReason;
	}
	public void setStatusReason(ims.domain.lookups.LookupInstance statusReason) {
		this.statusReason = statusReason;
	}

	public Integer getRemainingSlots() {
		return remainingSlots;
	}
	public void setRemainingSlots(Integer remainingSlots) {
		this.remainingSlots = remainingSlots;
	}

	public Integer getTotalSlots() {
		return totalSlots;
	}
	public void setTotalSlots(Integer totalSlots) {
		this.totalSlots = totalSlots;
	}

	public Boolean isIsFixed() {
		return isFixed;
	}
	public void setIsFixed(Boolean isFixed) {
		this.isFixed = isFixed;
	}

	public ims.domain.lookups.LookupInstance getPASClinic() {
		return pASClinic;
	}
	public void setPASClinic(ims.domain.lookups.LookupInstance pASClinic) {
		this.pASClinic = pASClinic;
	}

	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public Integer getRemainingTime() {
		return remainingTime;
	}
	public void setRemainingTime(Integer remainingTime) {
		this.remainingTime = remainingTime;
	}

	public ims.scheduling.domain.objects.Sch_Profile getSch_Profile() {
		return sch_Profile;
	}
	public void setSch_Profile(ims.scheduling.domain.objects.Sch_Profile sch_Profile) {
		this.sch_Profile = sch_Profile;
	}

	public ims.core.resource.place.domain.objects.Location getSchLocation() {
		return schLocation;
	}
	public void setSchLocation(ims.core.resource.place.domain.objects.Location schLocation) {
		this.schLocation = schLocation;
	}

	public ims.domain.lookups.LookupInstance getSessionType() {
		return sessionType;
	}
	public void setSessionType(ims.domain.lookups.LookupInstance sessionType) {
		this.sessionType = sessionType;
	}

	public Integer getMinInt() {
		return minInt;
	}
	public void setMinInt(Integer minInt) {
		this.minInt = minInt;
	}

	public Integer getRoundAttTime() {
		return roundAttTime;
	}
	public void setRoundAttTime(Integer roundAttTime) {
		this.roundAttTime = roundAttTime;
	}

	public Integer getLastAppInterval() {
		return lastAppInterval;
	}
	public void setLastAppInterval(Integer lastAppInterval) {
		this.lastAppInterval = lastAppInterval;
	}

	public Integer getMaxNoAppts() {
		return maxNoAppts;
	}
	public void setMaxNoAppts(Integer maxNoAppts) {
		this.maxNoAppts = maxNoAppts;
	}

	public java.util.Set getSessionSlots() {
		if ( null == sessionSlots ) {
			sessionSlots = new java.util.HashSet();
		}
		return sessionSlots;
	}
	public void setSessionSlots(java.util.Set paramValue) {
		this.sessionSlots = paramValue;
	}

	public java.util.Set getBookingRights() {
		if ( null == bookingRights ) {
			bookingRights = new java.util.HashSet();
		}
		return bookingRights;
	}
	public void setBookingRights(java.util.Set paramValue) {
		this.bookingRights = paramValue;
	}

	public java.util.Set getDirectoryofServices() {
		if ( null == directoryofServices ) {
			directoryofServices = new java.util.HashSet();
		}
		return directoryofServices;
	}
	public void setDirectoryofServices(java.util.Set paramValue) {
		this.directoryofServices = paramValue;
	}

	public java.util.Set getListOwners() {
		if ( null == listOwners ) {
			listOwners = new java.util.HashSet();
		}
		return listOwners;
	}
	public void setListOwners(java.util.Set paramValue) {
		this.listOwners = paramValue;
	}

	public java.util.Set getExclusionTimes() {
		if ( null == exclusionTimes ) {
			exclusionTimes = new java.util.HashSet();
		}
		return exclusionTimes;
	}
	public void setExclusionTimes(java.util.Set paramValue) {
		this.exclusionTimes = paramValue;
	}

	public Boolean isIsModified() {
		return isModified;
	}
	public void setIsModified(Boolean isModified) {
		this.isModified = isModified;
	}

	public Boolean isIsAdHocSession() {
		return isAdHocSession;
	}
	public void setIsAdHocSession(Boolean isAdHocSession) {
		this.isAdHocSession = isAdHocSession;
	}

	public Boolean isIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public java.util.Set getActivityPathwayEvents() {
		if ( null == activityPathwayEvents ) {
			activityPathwayEvents = new java.util.HashSet();
		}
		return activityPathwayEvents;
	}
	public void setActivityPathwayEvents(java.util.Set paramValue) {
		this.activityPathwayEvents = paramValue;
	}

	public ims.scheduling.domain.objects.SessionTheatreProceduresRemanining getTheatreProceduresRemaining() {
		return theatreProceduresRemaining;
	}
	public void setTheatreProceduresRemaining(ims.scheduling.domain.objects.SessionTheatreProceduresRemanining theatreProceduresRemaining) {
		this.theatreProceduresRemaining = theatreProceduresRemaining;
	}

	public Boolean isIsTheatreSession() {
		return isTheatreSession;
	}
	public void setIsTheatreSession(Boolean isTheatreSession) {
		this.isTheatreSession = isTheatreSession;
	}

	public ims.domain.lookups.LookupInstance getTheatreType() {
		return theatreType;
	}
	public void setTheatreType(ims.domain.lookups.LookupInstance theatreType) {
		this.theatreType = theatreType;
	}

	public java.util.Set getSessionActivities() {
		if ( null == sessionActivities ) {
			sessionActivities = new java.util.HashSet();
		}
		return sessionActivities;
	}
	public void setSessionActivities(java.util.Set paramValue) {
		this.sessionActivities = paramValue;
	}

	public Integer getMaxContinuousAvailableMins() {
		return maxContinuousAvailableMins;
	}
	public void setMaxContinuousAvailableMins(Integer maxContinuousAvailableMins) {
		this.maxContinuousAvailableMins = maxContinuousAvailableMins;
	}

	public java.util.Set getTheatreSlots() {
		if ( null == theatreSlots ) {
			theatreSlots = new java.util.HashSet();
		}
		return theatreSlots;
	}
	public void setTheatreSlots(java.util.Set paramValue) {
		this.theatreSlots = paramValue;
	}

	public java.util.List getAnaestheticType() {
		if ( null == anaestheticType ) {
			anaestheticType = new java.util.ArrayList();
		}
		return anaestheticType;
	}
	public void setAnaestheticType(java.util.List paramValue) {
		this.anaestheticType = paramValue;
	}

	public java.util.Set getParentChildSlots() {
		if ( null == parentChildSlots ) {
			parentChildSlots = new java.util.HashSet();
		}
		return parentChildSlots;
	}
	public void setParentChildSlots(java.util.Set paramValue) {
		this.parentChildSlots = paramValue;
	}

	public ims.domain.lookups.LookupInstance getSlotType() {
		return slotType;
	}
	public void setSlotType(ims.domain.lookups.LookupInstance slotType) {
		this.slotType = slotType;
	}

	public ims.domain.lookups.LookupInstance getCancellationReason() {
		return cancellationReason;
	}
	public void setCancellationReason(ims.domain.lookups.LookupInstance cancellationReason) {
		this.cancellationReason = cancellationReason;
	}

	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		if ( null != comment && comment.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for comment. Tried to set value: "+
				comment);
		}
		this.comment = comment;
	}

	public Boolean isWasSessionMoved() {
		return wasSessionMoved;
	}
	public void setWasSessionMoved(Boolean wasSessionMoved) {
		this.wasSessionMoved = wasSessionMoved;
	}

	public ims.domain.lookups.LookupInstance getConsMediaType() {
		return consMediaType;
	}
	public void setConsMediaType(ims.domain.lookups.LookupInstance consMediaType) {
		this.consMediaType = consMediaType;
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
		
		auditStr.append("\r\n*name* :");
		auditStr.append(name);
	    auditStr.append("; ");
		auditStr.append("\r\n*description* :");
		auditStr.append(description);
	    auditStr.append("; ");
		auditStr.append("\r\n*sessionDate* :");
		auditStr.append(sessionDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*startTm* :");
		auditStr.append(startTm);
	    auditStr.append("; ");
		auditStr.append("\r\n*endTm* :");
		auditStr.append(endTm);
	    auditStr.append("; ");
		auditStr.append("\r\n*service* :");
		if (service != null)
		{
			auditStr.append(toShortClassName(service));
				
		    auditStr.append(service.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*sessionStatus* :");
		if (sessionStatus != null)
			auditStr.append(sessionStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*statusReason* :");
		if (statusReason != null)
			auditStr.append(statusReason.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*remainingSlots* :");
		auditStr.append(remainingSlots);
	    auditStr.append("; ");
		auditStr.append("\r\n*totalSlots* :");
		auditStr.append(totalSlots);
	    auditStr.append("; ");
		auditStr.append("\r\n*isFixed* :");
		auditStr.append(isFixed);
	    auditStr.append("; ");
		auditStr.append("\r\n*pASClinic* :");
		if (pASClinic != null)
			auditStr.append(pASClinic.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*duration* :");
		auditStr.append(duration);
	    auditStr.append("; ");
		auditStr.append("\r\n*remainingTime* :");
		auditStr.append(remainingTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*sch_Profile* :");
		if (sch_Profile != null)
		{
			auditStr.append(toShortClassName(sch_Profile));
				
		    auditStr.append(sch_Profile.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*schLocation* :");
		if (schLocation != null)
		{
			auditStr.append(toShortClassName(schLocation));
				
		    auditStr.append(schLocation.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*sessionType* :");
		if (sessionType != null)
			auditStr.append(sessionType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*minInt* :");
		auditStr.append(minInt);
	    auditStr.append("; ");
		auditStr.append("\r\n*roundAttTime* :");
		auditStr.append(roundAttTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*lastAppInterval* :");
		auditStr.append(lastAppInterval);
	    auditStr.append("; ");
		auditStr.append("\r\n*maxNoAppts* :");
		auditStr.append(maxNoAppts);
	    auditStr.append("; ");
		auditStr.append("\r\n*sessionSlots* :");
		if (sessionSlots != null)
		{
			java.util.Iterator it22 = sessionSlots.iterator();
			int i22=0;
			while (it22.hasNext())
			{
				if (i22 > 0)
					auditStr.append(",");
				ims.scheduling.domain.objects.Session_Slot obj = (ims.scheduling.domain.objects.Session_Slot)it22.next();
		if (obj != null)
		{
		   if (i22 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i22++;
		}
		if (i22 > 0)
			auditStr.append("] " + i22);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*bookingRights* :");
		if (bookingRights != null)
		{
			java.util.Iterator it23 = bookingRights.iterator();
			int i23=0;
			while (it23.hasNext())
			{
				if (i23 > 0)
					auditStr.append(",");
				ims.scheduling.domain.objects.Session_BookingRight obj = (ims.scheduling.domain.objects.Session_BookingRight)it23.next();
		if (obj != null)
		{
		   if (i23 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i23++;
		}
		if (i23 > 0)
			auditStr.append("] " + i23);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*directoryofServices* :");
		if (directoryofServices != null)
		{
			java.util.Iterator it24 = directoryofServices.iterator();
			int i24=0;
			while (it24.hasNext())
			{
				if (i24 > 0)
					auditStr.append(",");
				ims.scheduling.domain.objects.DirectoryofService obj = (ims.scheduling.domain.objects.DirectoryofService)it24.next();
		if (obj != null)
		{
		   if (i24 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i24++;
		}
		if (i24 > 0)
			auditStr.append("] " + i24);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*listOwners* :");
		if (listOwners != null)
		{
			java.util.Iterator it25 = listOwners.iterator();
			int i25=0;
			while (it25.hasNext())
			{
				if (i25 > 0)
					auditStr.append(",");
				ims.scheduling.domain.objects.Session_ListOwner obj = (ims.scheduling.domain.objects.Session_ListOwner)it25.next();
		if (obj != null)
		{
		   if (i25 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i25++;
		}
		if (i25 > 0)
			auditStr.append("] " + i25);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*exclusionTimes* :");
		if (exclusionTimes != null)
		{
			java.util.Iterator it26 = exclusionTimes.iterator();
			int i26=0;
			while (it26.hasNext())
			{
				if (i26 > 0)
					auditStr.append(",");
				ims.scheduling.domain.objects.Session_Exc_Time obj = (ims.scheduling.domain.objects.Session_Exc_Time)it26.next();
		if (obj != null)
		{
		   if (i26 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i26++;
		}
		if (i26 > 0)
			auditStr.append("] " + i26);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isModified* :");
		auditStr.append(isModified);
	    auditStr.append("; ");
		auditStr.append("\r\n*isAdHocSession* :");
		auditStr.append(isAdHocSession);
	    auditStr.append("; ");
		auditStr.append("\r\n*isActive* :");
		auditStr.append(isActive);
	    auditStr.append("; ");
		auditStr.append("\r\n*activityPathwayEvents* :");
		if (activityPathwayEvents != null)
		{
			java.util.Iterator it30 = activityPathwayEvents.iterator();
			int i30=0;
			while (it30.hasNext())
			{
				if (i30 > 0)
					auditStr.append(",");
				ims.scheduling.domain.objects.SessionActivityPathwayEvent obj = (ims.scheduling.domain.objects.SessionActivityPathwayEvent)it30.next();
		if (obj != null)
		{
		   if (i30 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i30++;
		}
		if (i30 > 0)
			auditStr.append("] " + i30);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*theatreProceduresRemaining* :");
		if (theatreProceduresRemaining != null)
		{
			auditStr.append(toShortClassName(theatreProceduresRemaining));
				
		    auditStr.append(theatreProceduresRemaining.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isTheatreSession* :");
		auditStr.append(isTheatreSession);
	    auditStr.append("; ");
		auditStr.append("\r\n*theatreType* :");
		if (theatreType != null)
			auditStr.append(theatreType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*sessionActivities* :");
		if (sessionActivities != null)
		{
			java.util.Iterator it34 = sessionActivities.iterator();
			int i34=0;
			while (it34.hasNext())
			{
				if (i34 > 0)
					auditStr.append(",");
				ims.scheduling.domain.objects.SessionActivity obj = (ims.scheduling.domain.objects.SessionActivity)it34.next();
		if (obj != null)
		{
		   if (i34 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i34++;
		}
		if (i34 > 0)
			auditStr.append("] " + i34);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*maxContinuousAvailableMins* :");
		auditStr.append(maxContinuousAvailableMins);
	    auditStr.append("; ");
		auditStr.append("\r\n*theatreSlots* :");
		if (theatreSlots != null)
		{
			java.util.Iterator it36 = theatreSlots.iterator();
			int i36=0;
			while (it36.hasNext())
			{
				if (i36 > 0)
					auditStr.append(",");
				ims.scheduling.domain.objects.SessionTheatreTCISlot obj = (ims.scheduling.domain.objects.SessionTheatreTCISlot)it36.next();
		if (obj != null)
		{
		   if (i36 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i36++;
		}
		if (i36 > 0)
			auditStr.append("] " + i36);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*anaestheticType* :");
		if (anaestheticType != null)
		{
		int i37=0;
		for (i37=0; i37<anaestheticType.size(); i37++)
		{
			if (i37 > 0)
				auditStr.append(",");
			ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)anaestheticType.get(i37);
			auditStr.append(obj.getText());
		}
		if (i37 > 0)
			auditStr.append("] " + i37);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*parentChildSlots* :");
		if (parentChildSlots != null)
		{
			java.util.Iterator it38 = parentChildSlots.iterator();
			int i38=0;
			while (it38.hasNext())
			{
				if (i38 > 0)
					auditStr.append(",");
				ims.scheduling.domain.objects.SessionParentChildSlot obj = (ims.scheduling.domain.objects.SessionParentChildSlot)it38.next();
		if (obj != null)
		{
		   if (i38 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i38++;
		}
		if (i38 > 0)
			auditStr.append("] " + i38);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*slotType* :");
		if (slotType != null)
			auditStr.append(slotType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*cancellationReason* :");
		if (cancellationReason != null)
			auditStr.append(cancellationReason.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*comment* :");
		auditStr.append(comment);
	    auditStr.append("; ");
		auditStr.append("\r\n*wasSessionMoved* :");
		auditStr.append(wasSessionMoved);
	    auditStr.append("; ");
		auditStr.append("\r\n*consMediaType* :");
		if (consMediaType != null)
			auditStr.append(consMediaType.getText());
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
		
		String keyClassName = "Sch_Session";
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
		if (this.getName() != null)
		{
			sb.append("<name>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getName().toString()));
			sb.append("</name>");		
		}
		if (this.getDescription() != null)
		{
			sb.append("<description>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDescription().toString()));
			sb.append("</description>");		
		}
		if (this.getSessionDate() != null)
		{
			sb.append("<sessionDate>");
			sb.append(new ims.framework.utils.DateTime(this.getSessionDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</sessionDate>");		
		}
		if (this.getStartTm() != null)
		{
			sb.append("<startTm>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getStartTm().toString()));
			sb.append("</startTm>");		
		}
		if (this.getEndTm() != null)
		{
			sb.append("<endTm>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getEndTm().toString()));
			sb.append("</endTm>");		
		}
		if (this.getService() != null)
		{
			sb.append("<service>");
			sb.append(this.getService().toXMLString(domMap)); 	
			sb.append("</service>");		
		}
		if (this.getSessionStatus() != null)
		{
			sb.append("<sessionStatus>");
			sb.append(this.getSessionStatus().toXMLString()); 
			sb.append("</sessionStatus>");		
		}
		if (this.getStatusReason() != null)
		{
			sb.append("<statusReason>");
			sb.append(this.getStatusReason().toXMLString()); 
			sb.append("</statusReason>");		
		}
		if (this.getRemainingSlots() != null)
		{
			sb.append("<remainingSlots>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRemainingSlots().toString()));
			sb.append("</remainingSlots>");		
		}
		if (this.getTotalSlots() != null)
		{
			sb.append("<totalSlots>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTotalSlots().toString()));
			sb.append("</totalSlots>");		
		}
		if (this.isIsFixed() != null)
		{
			sb.append("<isFixed>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsFixed().toString()));
			sb.append("</isFixed>");		
		}
		if (this.getPASClinic() != null)
		{
			sb.append("<pASClinic>");
			sb.append(this.getPASClinic().toXMLString()); 
			sb.append("</pASClinic>");		
		}
		if (this.getDuration() != null)
		{
			sb.append("<duration>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDuration().toString()));
			sb.append("</duration>");		
		}
		if (this.getRemainingTime() != null)
		{
			sb.append("<remainingTime>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRemainingTime().toString()));
			sb.append("</remainingTime>");		
		}
		if (this.getSch_Profile() != null)
		{
			sb.append("<sch_Profile>");
			sb.append(this.getSch_Profile().toXMLString(domMap)); 	
			sb.append("</sch_Profile>");		
		}
		if (this.getSchLocation() != null)
		{
			sb.append("<schLocation>");
			sb.append(this.getSchLocation().toXMLString(domMap)); 	
			sb.append("</schLocation>");		
		}
		if (this.getSessionType() != null)
		{
			sb.append("<sessionType>");
			sb.append(this.getSessionType().toXMLString()); 
			sb.append("</sessionType>");		
		}
		if (this.getMinInt() != null)
		{
			sb.append("<minInt>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMinInt().toString()));
			sb.append("</minInt>");		
		}
		if (this.getRoundAttTime() != null)
		{
			sb.append("<roundAttTime>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRoundAttTime().toString()));
			sb.append("</roundAttTime>");		
		}
		if (this.getLastAppInterval() != null)
		{
			sb.append("<lastAppInterval>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLastAppInterval().toString()));
			sb.append("</lastAppInterval>");		
		}
		if (this.getMaxNoAppts() != null)
		{
			sb.append("<maxNoAppts>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMaxNoAppts().toString()));
			sb.append("</maxNoAppts>");		
		}
		if (this.getSessionSlots() != null)
		{
			if (this.getSessionSlots().size() > 0 )
			{
			sb.append("<sessionSlots>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getSessionSlots(), domMap));
			sb.append("</sessionSlots>");		
			}
		}
		if (this.getBookingRights() != null)
		{
			if (this.getBookingRights().size() > 0 )
			{
			sb.append("<bookingRights>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getBookingRights(), domMap));
			sb.append("</bookingRights>");		
			}
		}
		if (this.getDirectoryofServices() != null)
		{
			if (this.getDirectoryofServices().size() > 0 )
			{
			sb.append("<directoryofServices>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getDirectoryofServices(), domMap));
			sb.append("</directoryofServices>");		
			}
		}
		if (this.getListOwners() != null)
		{
			if (this.getListOwners().size() > 0 )
			{
			sb.append("<listOwners>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getListOwners(), domMap));
			sb.append("</listOwners>");		
			}
		}
		if (this.getExclusionTimes() != null)
		{
			if (this.getExclusionTimes().size() > 0 )
			{
			sb.append("<exclusionTimes>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getExclusionTimes(), domMap));
			sb.append("</exclusionTimes>");		
			}
		}
		if (this.isIsModified() != null)
		{
			sb.append("<isModified>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsModified().toString()));
			sb.append("</isModified>");		
		}
		if (this.isIsAdHocSession() != null)
		{
			sb.append("<isAdHocSession>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsAdHocSession().toString()));
			sb.append("</isAdHocSession>");		
		}
		if (this.isIsActive() != null)
		{
			sb.append("<isActive>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsActive().toString()));
			sb.append("</isActive>");		
		}
		if (this.getActivityPathwayEvents() != null)
		{
			if (this.getActivityPathwayEvents().size() > 0 )
			{
			sb.append("<activityPathwayEvents>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getActivityPathwayEvents(), domMap));
			sb.append("</activityPathwayEvents>");		
			}
		}
		if (this.getTheatreProceduresRemaining() != null)
		{
			sb.append("<theatreProceduresRemaining>");
			sb.append(this.getTheatreProceduresRemaining().toXMLString(domMap)); 	
			sb.append("</theatreProceduresRemaining>");		
		}
		if (this.isIsTheatreSession() != null)
		{
			sb.append("<isTheatreSession>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsTheatreSession().toString()));
			sb.append("</isTheatreSession>");		
		}
		if (this.getTheatreType() != null)
		{
			sb.append("<theatreType>");
			sb.append(this.getTheatreType().toXMLString()); 
			sb.append("</theatreType>");		
		}
		if (this.getSessionActivities() != null)
		{
			if (this.getSessionActivities().size() > 0 )
			{
			sb.append("<sessionActivities>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getSessionActivities(), domMap));
			sb.append("</sessionActivities>");		
			}
		}
		if (this.getMaxContinuousAvailableMins() != null)
		{
			sb.append("<maxContinuousAvailableMins>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMaxContinuousAvailableMins().toString()));
			sb.append("</maxContinuousAvailableMins>");		
		}
		if (this.getTheatreSlots() != null)
		{
			if (this.getTheatreSlots().size() > 0 )
			{
			sb.append("<theatreSlots>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getTheatreSlots(), domMap));
			sb.append("</theatreSlots>");		
			}
		}
		if (this.getAnaestheticType() != null)
		{
			if (this.getAnaestheticType().size() > 0 )
			{
			sb.append("<anaestheticType>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getAnaestheticType())); 
			sb.append("</anaestheticType>");		
			}
		}
		if (this.getParentChildSlots() != null)
		{
			if (this.getParentChildSlots().size() > 0 )
			{
			sb.append("<parentChildSlots>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getParentChildSlots(), domMap));
			sb.append("</parentChildSlots>");		
			}
		}
		if (this.getSlotType() != null)
		{
			sb.append("<slotType>");
			sb.append(this.getSlotType().toXMLString()); 
			sb.append("</slotType>");		
		}
		if (this.getCancellationReason() != null)
		{
			sb.append("<cancellationReason>");
			sb.append(this.getCancellationReason().toXMLString()); 
			sb.append("</cancellationReason>");		
		}
		if (this.getComment() != null)
		{
			sb.append("<comment>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getComment().toString()));
			sb.append("</comment>");		
		}
		if (this.isWasSessionMoved() != null)
		{
			sb.append("<wasSessionMoved>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isWasSessionMoved().toString()));
			sb.append("</wasSessionMoved>");		
		}
		if (this.getConsMediaType() != null)
		{
			sb.append("<consMediaType>");
			sb.append(this.getConsMediaType().toXMLString()); 
			sb.append("</consMediaType>");		
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
			Sch_Session domainObject = getSch_SessionfromXML(itemEl, factory, domMap);

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
			Sch_Session domainObject = getSch_SessionfromXML(itemEl, factory, domMap);

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
		
	public static Sch_Session getSch_SessionfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getSch_SessionfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static Sch_Session getSch_SessionfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!Sch_Session.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!Sch_Session.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the Sch_Session class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (Sch_Session)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(Sch_Session.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		Sch_Session ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (Sch_Session)factory.getImportedDomainObject(Sch_Session.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new Sch_Session();
		}
		String keyClassName = "Sch_Session";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (Sch_Session)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, Sch_Session obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("name");
		if(fldEl != null)
		{	
    		obj.setName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("description");
		if(fldEl != null)
		{	
    		obj.setDescription(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("sessionDate");
		if(fldEl != null)
		{	
    		obj.setSessionDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("startTm");
		if(fldEl != null)
		{	
    		obj.setStartTm(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("endTm");
		if(fldEl != null)
		{	
    		obj.setEndTm(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("service");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setService(ims.core.clinical.domain.objects.Service.getServicefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("sessionStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSessionStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("statusReason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setStatusReason(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("remainingSlots");
		if(fldEl != null)
		{	
    		obj.setRemainingSlots(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("totalSlots");
		if(fldEl != null)
		{	
    		obj.setTotalSlots(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isFixed");
		if(fldEl != null)
		{	
    		obj.setIsFixed(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("pASClinic");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPASClinic(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("duration");
		if(fldEl != null)
		{	
    		obj.setDuration(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("remainingTime");
		if(fldEl != null)
		{	
    		obj.setRemainingTime(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("sch_Profile");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSch_Profile(ims.scheduling.domain.objects.Sch_Profile.getSch_ProfilefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("schLocation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSchLocation(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("sessionType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSessionType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("minInt");
		if(fldEl != null)
		{	
    		obj.setMinInt(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("roundAttTime");
		if(fldEl != null)
		{	
    		obj.setRoundAttTime(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("lastAppInterval");
		if(fldEl != null)
		{	
    		obj.setLastAppInterval(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("maxNoAppts");
		if(fldEl != null)
		{	
    		obj.setMaxNoAppts(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("sessionSlots");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setSessionSlots(ims.scheduling.domain.objects.Session_Slot.fromSetXMLString(fldEl, factory, obj.getSessionSlots(), domMap));
		}
		fldEl = el.element("bookingRights");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setBookingRights(ims.scheduling.domain.objects.Session_BookingRight.fromSetXMLString(fldEl, factory, obj.getBookingRights(), domMap));
		}
		fldEl = el.element("directoryofServices");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setDirectoryofServices(ims.scheduling.domain.objects.DirectoryofService.fromSetXMLString(fldEl, factory, obj.getDirectoryofServices(), domMap));
		}
		fldEl = el.element("listOwners");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setListOwners(ims.scheduling.domain.objects.Session_ListOwner.fromSetXMLString(fldEl, factory, obj.getListOwners(), domMap));
		}
		fldEl = el.element("exclusionTimes");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setExclusionTimes(ims.scheduling.domain.objects.Session_Exc_Time.fromSetXMLString(fldEl, factory, obj.getExclusionTimes(), domMap));
		}
		fldEl = el.element("isModified");
		if(fldEl != null)
		{	
    		obj.setIsModified(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isAdHocSession");
		if(fldEl != null)
		{	
    		obj.setIsAdHocSession(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isActive");
		if(fldEl != null)
		{	
    		obj.setIsActive(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("activityPathwayEvents");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setActivityPathwayEvents(ims.scheduling.domain.objects.SessionActivityPathwayEvent.fromSetXMLString(fldEl, factory, obj.getActivityPathwayEvents(), domMap));
		}
		fldEl = el.element("theatreProceduresRemaining");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTheatreProceduresRemaining(ims.scheduling.domain.objects.SessionTheatreProceduresRemanining.getSessionTheatreProceduresRemaniningfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("isTheatreSession");
		if(fldEl != null)
		{	
    		obj.setIsTheatreSession(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("theatreType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTheatreType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("sessionActivities");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setSessionActivities(ims.scheduling.domain.objects.SessionActivity.fromSetXMLString(fldEl, factory, obj.getSessionActivities(), domMap));
		}
		fldEl = el.element("maxContinuousAvailableMins");
		if(fldEl != null)
		{	
    		obj.setMaxContinuousAvailableMins(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("theatreSlots");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setTheatreSlots(ims.scheduling.domain.objects.SessionTheatreTCISlot.fromSetXMLString(fldEl, factory, obj.getTheatreSlots(), domMap));
		}
		fldEl = el.element("anaestheticType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setAnaestheticType(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getAnaestheticType())); 
		}
		fldEl = el.element("parentChildSlots");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setParentChildSlots(ims.scheduling.domain.objects.SessionParentChildSlot.fromSetXMLString(fldEl, factory, obj.getParentChildSlots(), domMap));
		}
		fldEl = el.element("slotType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSlotType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("cancellationReason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCancellationReason(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("comment");
		if(fldEl != null)
		{	
    		obj.setComment(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("wasSessionMoved");
		if(fldEl != null)
		{	
    		obj.setWasSessionMoved(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("consMediaType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setConsMediaType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "sessionSlots"
		, "bookingRights"
		, "directoryofServices"
		, "listOwners"
		, "exclusionTimes"
		, "activityPathwayEvents"
		, "sessionActivities"
		, "theatreSlots"
		, "anaestheticType"
		, "parentChildSlots"
		};
	}

	/**
	incrementRemainingSlots
	*/
public void incrementRemainingSlots(int incrementBy)
{
	this.remainingSlots = new Integer(this.getRemainingSlots().intValue() + incrementBy);
	if(this.remainingSlots.intValue() > this.getTotalSlots().intValue())
		this.remainingSlots = this.getTotalSlots();
}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Name = "name";
		public static final String Description = "description";
		public static final String SessionDate = "sessionDate";
		public static final String StartTm = "startTm";
		public static final String EndTm = "endTm";
		public static final String Service = "service";
		public static final String SessionStatus = "sessionStatus";
		public static final String StatusReason = "statusReason";
		public static final String RemainingSlots = "remainingSlots";
		public static final String TotalSlots = "totalSlots";
		public static final String IsFixed = "isFixed";
		public static final String PASClinic = "pASClinic";
		public static final String Duration = "duration";
		public static final String RemainingTime = "remainingTime";
		public static final String Sch_Profile = "sch_Profile";
		public static final String SchLocation = "schLocation";
		public static final String SessionType = "sessionType";
		public static final String MinInt = "minInt";
		public static final String RoundAttTime = "roundAttTime";
		public static final String LastAppInterval = "lastAppInterval";
		public static final String MaxNoAppts = "maxNoAppts";
		public static final String SessionSlots = "sessionSlots";
		public static final String BookingRights = "bookingRights";
		public static final String DirectoryofServices = "directoryofServices";
		public static final String ListOwners = "listOwners";
		public static final String ExclusionTimes = "exclusionTimes";
		public static final String IsModified = "isModified";
		public static final String IsAdHocSession = "isAdHocSession";
		public static final String IsActive = "isActive";
		public static final String ActivityPathwayEvents = "activityPathwayEvents";
		public static final String TheatreProceduresRemaining = "theatreProceduresRemaining";
		public static final String IsTheatreSession = "isTheatreSession";
		public static final String TheatreType = "theatreType";
		public static final String SessionActivities = "sessionActivities";
		public static final String MaxContinuousAvailableMins = "maxContinuousAvailableMins";
		public static final String TheatreSlots = "theatreSlots";
		public static final String AnaestheticType = "anaestheticType";
		public static final String ParentChildSlots = "parentChildSlots";
		public static final String SlotType = "slotType";
		public static final String CancellationReason = "cancellationReason";
		public static final String Comment = "comment";
		public static final String WasSessionMoved = "wasSessionMoved";
		public static final String ConsMediaType = "consMediaType";
	}
}

