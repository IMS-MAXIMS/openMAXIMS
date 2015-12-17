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
package ims.dto_move.domain.objects;

/**
 * 
 * @author Barbara Worwood
 * Generated.
 */


public class Profile extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1105100019;
	private static final long serialVersionUID = 1105100019L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** This is the activ_id */
	private Integer activityId;
	/** This id is same as grp_id */
	private ims.dto_move.domain.objects.ActivityGroup activityGroup;
	private ims.dto_move.domain.objects.InternalLocation location;
	/** Name */
	private String name;
	private Integer scheduleCategory;
	private String startTime;
	private String endTime;
	/** Effective From Date */
	private java.util.Date effFrm;
	/** Effective To Date */
	private java.util.Date effTo;
	/** Maximim Number of Appointments */
	private Integer maxNoAppts;
	/** Interval_Type */
	private Integer intervalType;
	/** Interval Size */
	private Integer intervalSize;
	private Integer schedulingType;
	/** LastAppInterval */
	private Integer lastAppInterval;
	private String cmdExtValue;
	private String specClinic;
	/** RoundAttendanceTime */
	private Integer roundAttTime;
	/** LastGenDate */
	private java.util.Date lastGenDate;
	/** Sch_Mon */
	private String isSchMon;
	/** Sch_Tue */
	private String isSchTue;
	/** Sch_Wed */
	private String isSchWed;
	/** Sch_Thur */
	private String isSchThur;
	/** Sch_Fri */
	private String isSchFri;
	/** Sch_Sat */
	private String isSchSat;
	/** Sch_Sun */
	private String isSchSun;
	private String isWeek1;
	private String isWeek2;
	private String isWeek3;
	private String isWeek4;
	private String isWeek5;
	/** isActive */
	private String isActive;
	/** Minimal Interval Between Appointments */
	private Integer minInt;
	private String contArr;
	/** Not sure which location this is? */
	private Integer contLocation;
	private Integer specialty;
	/** 
	  * Collection of ims.dto_move.domain.objects.ProfileDetail.
	  */
	private java.util.List profileDetails;
	/** 
	  * Collection of ims.dto_move.domain.objects.ProfileListOwner.
	  */
	private java.util.List profileListOwner;
	/** 
	  * Collection of ims.dto_move.domain.objects.ProfileUser.
	  */
	private java.util.List profileUsers;
	/** 
	  * Collection of ims.dto_move.domain.objects.ProfileExclusionDate.
	  */
	private java.util.List exclusionDates;
	/** 
	  * Collection of ims.dto_move.domain.objects.ProfileExclusionTime.
	  */
	private java.util.List exclusionTimes;
	/** 
	  * Collection of ims.dto_move.domain.objects.ProfileAction.
	  */
	private java.util.List actions;
    public Profile (Integer id, int ver)
    {
    	super(id, ver);
    }
    public Profile ()
    {
    	super();
    }
    public Profile (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.dto_move.domain.objects.Profile.class;
	}


	public Integer getActivityId() {
		return activityId;
	}
	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}

	public ims.dto_move.domain.objects.ActivityGroup getActivityGroup() {
		return activityGroup;
	}
	public void setActivityGroup(ims.dto_move.domain.objects.ActivityGroup activityGroup) {
		this.activityGroup = activityGroup;
	}

	public ims.dto_move.domain.objects.InternalLocation getLocation() {
		return location;
	}
	public void setLocation(ims.dto_move.domain.objects.InternalLocation location) {
		this.location = location;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		if ( null != name && name.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for name. Tried to set value: "+
				name);
		}
		this.name = name;
	}

	public Integer getScheduleCategory() {
		return scheduleCategory;
	}
	public void setScheduleCategory(Integer scheduleCategory) {
		this.scheduleCategory = scheduleCategory;
	}

	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public java.util.Date getEffFrm() {
		return effFrm;
	}
	public void setEffFrm(java.util.Date effFrm) {
		this.effFrm = effFrm;
	}

	public java.util.Date getEffTo() {
		return effTo;
	}
	public void setEffTo(java.util.Date effTo) {
		this.effTo = effTo;
	}

	public Integer getMaxNoAppts() {
		return maxNoAppts;
	}
	public void setMaxNoAppts(Integer maxNoAppts) {
		this.maxNoAppts = maxNoAppts;
	}

	public Integer getIntervalType() {
		return intervalType;
	}
	public void setIntervalType(Integer intervalType) {
		this.intervalType = intervalType;
	}

	public Integer getIntervalSize() {
		return intervalSize;
	}
	public void setIntervalSize(Integer intervalSize) {
		this.intervalSize = intervalSize;
	}

	public Integer getSchedulingType() {
		return schedulingType;
	}
	public void setSchedulingType(Integer schedulingType) {
		this.schedulingType = schedulingType;
	}

	public Integer getLastAppInterval() {
		return lastAppInterval;
	}
	public void setLastAppInterval(Integer lastAppInterval) {
		this.lastAppInterval = lastAppInterval;
	}

	public String getCmdExtValue() {
		return cmdExtValue;
	}
	public void setCmdExtValue(String cmdExtValue) {
		if ( null != cmdExtValue && cmdExtValue.length() > 20 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for cmdExtValue. Tried to set value: "+
				cmdExtValue);
		}
		this.cmdExtValue = cmdExtValue;
	}

	public String getSpecClinic() {
		return specClinic;
	}
	public void setSpecClinic(String specClinic) {
		if ( null != specClinic && specClinic.length() > 20 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for specClinic. Tried to set value: "+
				specClinic);
		}
		this.specClinic = specClinic;
	}

	public Integer getRoundAttTime() {
		return roundAttTime;
	}
	public void setRoundAttTime(Integer roundAttTime) {
		this.roundAttTime = roundAttTime;
	}

	public java.util.Date getLastGenDate() {
		return lastGenDate;
	}
	public void setLastGenDate(java.util.Date lastGenDate) {
		this.lastGenDate = lastGenDate;
	}

	public String getIsSchMon() {
		return isSchMon;
	}
	public void setIsSchMon(String isSchMon) {
		if ( null != isSchMon && isSchMon.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for isSchMon. Tried to set value: "+
				isSchMon);
		}
		this.isSchMon = isSchMon;
	}

	public String getIsSchTue() {
		return isSchTue;
	}
	public void setIsSchTue(String isSchTue) {
		if ( null != isSchTue && isSchTue.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for isSchTue. Tried to set value: "+
				isSchTue);
		}
		this.isSchTue = isSchTue;
	}

	public String getIsSchWed() {
		return isSchWed;
	}
	public void setIsSchWed(String isSchWed) {
		if ( null != isSchWed && isSchWed.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for isSchWed. Tried to set value: "+
				isSchWed);
		}
		this.isSchWed = isSchWed;
	}

	public String getIsSchThur() {
		return isSchThur;
	}
	public void setIsSchThur(String isSchThur) {
		if ( null != isSchThur && isSchThur.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for isSchThur. Tried to set value: "+
				isSchThur);
		}
		this.isSchThur = isSchThur;
	}

	public String getIsSchFri() {
		return isSchFri;
	}
	public void setIsSchFri(String isSchFri) {
		if ( null != isSchFri && isSchFri.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for isSchFri. Tried to set value: "+
				isSchFri);
		}
		this.isSchFri = isSchFri;
	}

	public String getIsSchSat() {
		return isSchSat;
	}
	public void setIsSchSat(String isSchSat) {
		if ( null != isSchSat && isSchSat.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for isSchSat. Tried to set value: "+
				isSchSat);
		}
		this.isSchSat = isSchSat;
	}

	public String getIsSchSun() {
		return isSchSun;
	}
	public void setIsSchSun(String isSchSun) {
		if ( null != isSchSun && isSchSun.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for isSchSun. Tried to set value: "+
				isSchSun);
		}
		this.isSchSun = isSchSun;
	}

	public String getIsWeek1() {
		return isWeek1;
	}
	public void setIsWeek1(String isWeek1) {
		if ( null != isWeek1 && isWeek1.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for isWeek1. Tried to set value: "+
				isWeek1);
		}
		this.isWeek1 = isWeek1;
	}

	public String getIsWeek2() {
		return isWeek2;
	}
	public void setIsWeek2(String isWeek2) {
		if ( null != isWeek2 && isWeek2.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for isWeek2. Tried to set value: "+
				isWeek2);
		}
		this.isWeek2 = isWeek2;
	}

	public String getIsWeek3() {
		return isWeek3;
	}
	public void setIsWeek3(String isWeek3) {
		if ( null != isWeek3 && isWeek3.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for isWeek3. Tried to set value: "+
				isWeek3);
		}
		this.isWeek3 = isWeek3;
	}

	public String getIsWeek4() {
		return isWeek4;
	}
	public void setIsWeek4(String isWeek4) {
		if ( null != isWeek4 && isWeek4.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for isWeek4. Tried to set value: "+
				isWeek4);
		}
		this.isWeek4 = isWeek4;
	}

	public String getIsWeek5() {
		return isWeek5;
	}
	public void setIsWeek5(String isWeek5) {
		if ( null != isWeek5 && isWeek5.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for isWeek5. Tried to set value: "+
				isWeek5);
		}
		this.isWeek5 = isWeek5;
	}

	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		if ( null != isActive && isActive.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for isActive. Tried to set value: "+
				isActive);
		}
		this.isActive = isActive;
	}

	public Integer getMinInt() {
		return minInt;
	}
	public void setMinInt(Integer minInt) {
		this.minInt = minInt;
	}

	public String getContArr() {
		return contArr;
	}
	public void setContArr(String contArr) {
		if ( null != contArr && contArr.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for contArr. Tried to set value: "+
				contArr);
		}
		this.contArr = contArr;
	}

	public Integer getContLocation() {
		return contLocation;
	}
	public void setContLocation(Integer contLocation) {
		this.contLocation = contLocation;
	}

	public Integer getSpecialty() {
		return specialty;
	}
	public void setSpecialty(Integer specialty) {
		this.specialty = specialty;
	}

	public java.util.List getProfileDetails() {
		if ( null == profileDetails ) {
			profileDetails = new java.util.ArrayList();
		}
		return profileDetails;
	}
	public void setProfileDetails(java.util.List paramValue) {
		this.profileDetails = paramValue;
	}

	public java.util.List getProfileListOwner() {
		if ( null == profileListOwner ) {
			profileListOwner = new java.util.ArrayList();
		}
		return profileListOwner;
	}
	public void setProfileListOwner(java.util.List paramValue) {
		this.profileListOwner = paramValue;
	}

	public java.util.List getProfileUsers() {
		if ( null == profileUsers ) {
			profileUsers = new java.util.ArrayList();
		}
		return profileUsers;
	}
	public void setProfileUsers(java.util.List paramValue) {
		this.profileUsers = paramValue;
	}

	public java.util.List getExclusionDates() {
		if ( null == exclusionDates ) {
			exclusionDates = new java.util.ArrayList();
		}
		return exclusionDates;
	}
	public void setExclusionDates(java.util.List paramValue) {
		this.exclusionDates = paramValue;
	}

	public java.util.List getExclusionTimes() {
		if ( null == exclusionTimes ) {
			exclusionTimes = new java.util.ArrayList();
		}
		return exclusionTimes;
	}
	public void setExclusionTimes(java.util.List paramValue) {
		this.exclusionTimes = paramValue;
	}

	public java.util.List getActions() {
		if ( null == actions ) {
			actions = new java.util.ArrayList();
		}
		return actions;
	}
	public void setActions(java.util.List paramValue) {
		this.actions = paramValue;
	}

	/**
	 * isConfigurationObject
	 * Taken from the Usage property of the business object, this method will return
	 * a boolean indicating whether this is a configuration object or not
	 * Configuration = true, Instantiation = false
	 */
	public static boolean isConfigurationObject()
	{
		if ( "Configuration".equals("Configuration") )
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
		
		auditStr.append("\r\n*activityId* :");
		auditStr.append(activityId);
	    auditStr.append("; ");
		auditStr.append("\r\n*activityGroup* :");
		if (activityGroup != null)
		{
			auditStr.append(toShortClassName(activityGroup));
				
		    auditStr.append(activityGroup.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*location* :");
		if (location != null)
		{
			auditStr.append(toShortClassName(location));
				
		    auditStr.append(location.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*name* :");
		auditStr.append(name);
	    auditStr.append("; ");
		auditStr.append("\r\n*scheduleCategory* :");
		auditStr.append(scheduleCategory);
	    auditStr.append("; ");
		auditStr.append("\r\n*startTime* :");
		auditStr.append(startTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*endTime* :");
		auditStr.append(endTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*effFrm* :");
		auditStr.append(effFrm);
	    auditStr.append("; ");
		auditStr.append("\r\n*effTo* :");
		auditStr.append(effTo);
	    auditStr.append("; ");
		auditStr.append("\r\n*maxNoAppts* :");
		auditStr.append(maxNoAppts);
	    auditStr.append("; ");
		auditStr.append("\r\n*intervalType* :");
		auditStr.append(intervalType);
	    auditStr.append("; ");
		auditStr.append("\r\n*intervalSize* :");
		auditStr.append(intervalSize);
	    auditStr.append("; ");
		auditStr.append("\r\n*schedulingType* :");
		auditStr.append(schedulingType);
	    auditStr.append("; ");
		auditStr.append("\r\n*lastAppInterval* :");
		auditStr.append(lastAppInterval);
	    auditStr.append("; ");
		auditStr.append("\r\n*cmdExtValue* :");
		auditStr.append(cmdExtValue);
	    auditStr.append("; ");
		auditStr.append("\r\n*specClinic* :");
		auditStr.append(specClinic);
	    auditStr.append("; ");
		auditStr.append("\r\n*roundAttTime* :");
		auditStr.append(roundAttTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*lastGenDate* :");
		auditStr.append(lastGenDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*isSchMon* :");
		auditStr.append(isSchMon);
	    auditStr.append("; ");
		auditStr.append("\r\n*isSchTue* :");
		auditStr.append(isSchTue);
	    auditStr.append("; ");
		auditStr.append("\r\n*isSchWed* :");
		auditStr.append(isSchWed);
	    auditStr.append("; ");
		auditStr.append("\r\n*isSchThur* :");
		auditStr.append(isSchThur);
	    auditStr.append("; ");
		auditStr.append("\r\n*isSchFri* :");
		auditStr.append(isSchFri);
	    auditStr.append("; ");
		auditStr.append("\r\n*isSchSat* :");
		auditStr.append(isSchSat);
	    auditStr.append("; ");
		auditStr.append("\r\n*isSchSun* :");
		auditStr.append(isSchSun);
	    auditStr.append("; ");
		auditStr.append("\r\n*isWeek1* :");
		auditStr.append(isWeek1);
	    auditStr.append("; ");
		auditStr.append("\r\n*isWeek2* :");
		auditStr.append(isWeek2);
	    auditStr.append("; ");
		auditStr.append("\r\n*isWeek3* :");
		auditStr.append(isWeek3);
	    auditStr.append("; ");
		auditStr.append("\r\n*isWeek4* :");
		auditStr.append(isWeek4);
	    auditStr.append("; ");
		auditStr.append("\r\n*isWeek5* :");
		auditStr.append(isWeek5);
	    auditStr.append("; ");
		auditStr.append("\r\n*isActive* :");
		auditStr.append(isActive);
	    auditStr.append("; ");
		auditStr.append("\r\n*minInt* :");
		auditStr.append(minInt);
	    auditStr.append("; ");
		auditStr.append("\r\n*contArr* :");
		auditStr.append(contArr);
	    auditStr.append("; ");
		auditStr.append("\r\n*contLocation* :");
		auditStr.append(contLocation);
	    auditStr.append("; ");
		auditStr.append("\r\n*specialty* :");
		auditStr.append(specialty);
	    auditStr.append("; ");
		auditStr.append("\r\n*profileDetails* :");
		if (profileDetails != null)
		{
		int i36=0;
		for (i36=0; i36<profileDetails.size(); i36++)
		{
			if (i36 > 0)
				auditStr.append(",");
			ims.dto_move.domain.objects.ProfileDetail obj = (ims.dto_move.domain.objects.ProfileDetail)profileDetails.get(i36);
		    if (obj != null)
			{
				if (i36 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i36 > 0)
			auditStr.append("] " + i36);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*profileListOwner* :");
		if (profileListOwner != null)
		{
		int i37=0;
		for (i37=0; i37<profileListOwner.size(); i37++)
		{
			if (i37 > 0)
				auditStr.append(",");
			ims.dto_move.domain.objects.ProfileListOwner obj = (ims.dto_move.domain.objects.ProfileListOwner)profileListOwner.get(i37);
		    if (obj != null)
			{
				if (i37 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i37 > 0)
			auditStr.append("] " + i37);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*profileUsers* :");
		if (profileUsers != null)
		{
		int i38=0;
		for (i38=0; i38<profileUsers.size(); i38++)
		{
			if (i38 > 0)
				auditStr.append(",");
			ims.dto_move.domain.objects.ProfileUser obj = (ims.dto_move.domain.objects.ProfileUser)profileUsers.get(i38);
		    if (obj != null)
			{
				if (i38 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i38 > 0)
			auditStr.append("] " + i38);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*exclusionDates* :");
		if (exclusionDates != null)
		{
		int i39=0;
		for (i39=0; i39<exclusionDates.size(); i39++)
		{
			if (i39 > 0)
				auditStr.append(",");
			ims.dto_move.domain.objects.ProfileExclusionDate obj = (ims.dto_move.domain.objects.ProfileExclusionDate)exclusionDates.get(i39);
		    if (obj != null)
			{
				if (i39 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i39 > 0)
			auditStr.append("] " + i39);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*exclusionTimes* :");
		if (exclusionTimes != null)
		{
		int i40=0;
		for (i40=0; i40<exclusionTimes.size(); i40++)
		{
			if (i40 > 0)
				auditStr.append(",");
			ims.dto_move.domain.objects.ProfileExclusionTime obj = (ims.dto_move.domain.objects.ProfileExclusionTime)exclusionTimes.get(i40);
		    if (obj != null)
			{
				if (i40 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i40 > 0)
			auditStr.append("] " + i40);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*actions* :");
		if (actions != null)
		{
		int i41=0;
		for (i41=0; i41<actions.size(); i41++)
		{
			if (i41 > 0)
				auditStr.append(",");
			ims.dto_move.domain.objects.ProfileAction obj = (ims.dto_move.domain.objects.ProfileAction)actions.get(i41);
		    if (obj != null)
			{
				if (i41 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i41 > 0)
			auditStr.append("] " + i41);
		}
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
		
		String keyClassName = "Profile";
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
		if (this.getActivityId() != null)
		{
			sb.append("<activityId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getActivityId().toString()));
			sb.append("</activityId>");		
		}
		if (this.getActivityGroup() != null)
		{
			sb.append("<activityGroup>");
			sb.append(this.getActivityGroup().toXMLString(domMap)); 	
			sb.append("</activityGroup>");		
		}
		if (this.getLocation() != null)
		{
			sb.append("<location>");
			sb.append(this.getLocation().toXMLString(domMap)); 	
			sb.append("</location>");		
		}
		if (this.getName() != null)
		{
			sb.append("<name>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getName().toString()));
			sb.append("</name>");		
		}
		if (this.getScheduleCategory() != null)
		{
			sb.append("<scheduleCategory>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getScheduleCategory().toString()));
			sb.append("</scheduleCategory>");		
		}
		if (this.getStartTime() != null)
		{
			sb.append("<startTime>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getStartTime().toString()));
			sb.append("</startTime>");		
		}
		if (this.getEndTime() != null)
		{
			sb.append("<endTime>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getEndTime().toString()));
			sb.append("</endTime>");		
		}
		if (this.getEffFrm() != null)
		{
			sb.append("<effFrm>");
			sb.append(new ims.framework.utils.DateTime(this.getEffFrm()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</effFrm>");		
		}
		if (this.getEffTo() != null)
		{
			sb.append("<effTo>");
			sb.append(new ims.framework.utils.DateTime(this.getEffTo()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</effTo>");		
		}
		if (this.getMaxNoAppts() != null)
		{
			sb.append("<maxNoAppts>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMaxNoAppts().toString()));
			sb.append("</maxNoAppts>");		
		}
		if (this.getIntervalType() != null)
		{
			sb.append("<intervalType>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getIntervalType().toString()));
			sb.append("</intervalType>");		
		}
		if (this.getIntervalSize() != null)
		{
			sb.append("<intervalSize>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getIntervalSize().toString()));
			sb.append("</intervalSize>");		
		}
		if (this.getSchedulingType() != null)
		{
			sb.append("<schedulingType>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSchedulingType().toString()));
			sb.append("</schedulingType>");		
		}
		if (this.getLastAppInterval() != null)
		{
			sb.append("<lastAppInterval>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLastAppInterval().toString()));
			sb.append("</lastAppInterval>");		
		}
		if (this.getCmdExtValue() != null)
		{
			sb.append("<cmdExtValue>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCmdExtValue().toString()));
			sb.append("</cmdExtValue>");		
		}
		if (this.getSpecClinic() != null)
		{
			sb.append("<specClinic>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSpecClinic().toString()));
			sb.append("</specClinic>");		
		}
		if (this.getRoundAttTime() != null)
		{
			sb.append("<roundAttTime>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRoundAttTime().toString()));
			sb.append("</roundAttTime>");		
		}
		if (this.getLastGenDate() != null)
		{
			sb.append("<lastGenDate>");
			sb.append(new ims.framework.utils.DateTime(this.getLastGenDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</lastGenDate>");		
		}
		if (this.getIsSchMon() != null)
		{
			sb.append("<isSchMon>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getIsSchMon().toString()));
			sb.append("</isSchMon>");		
		}
		if (this.getIsSchTue() != null)
		{
			sb.append("<isSchTue>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getIsSchTue().toString()));
			sb.append("</isSchTue>");		
		}
		if (this.getIsSchWed() != null)
		{
			sb.append("<isSchWed>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getIsSchWed().toString()));
			sb.append("</isSchWed>");		
		}
		if (this.getIsSchThur() != null)
		{
			sb.append("<isSchThur>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getIsSchThur().toString()));
			sb.append("</isSchThur>");		
		}
		if (this.getIsSchFri() != null)
		{
			sb.append("<isSchFri>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getIsSchFri().toString()));
			sb.append("</isSchFri>");		
		}
		if (this.getIsSchSat() != null)
		{
			sb.append("<isSchSat>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getIsSchSat().toString()));
			sb.append("</isSchSat>");		
		}
		if (this.getIsSchSun() != null)
		{
			sb.append("<isSchSun>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getIsSchSun().toString()));
			sb.append("</isSchSun>");		
		}
		if (this.getIsWeek1() != null)
		{
			sb.append("<isWeek1>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getIsWeek1().toString()));
			sb.append("</isWeek1>");		
		}
		if (this.getIsWeek2() != null)
		{
			sb.append("<isWeek2>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getIsWeek2().toString()));
			sb.append("</isWeek2>");		
		}
		if (this.getIsWeek3() != null)
		{
			sb.append("<isWeek3>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getIsWeek3().toString()));
			sb.append("</isWeek3>");		
		}
		if (this.getIsWeek4() != null)
		{
			sb.append("<isWeek4>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getIsWeek4().toString()));
			sb.append("</isWeek4>");		
		}
		if (this.getIsWeek5() != null)
		{
			sb.append("<isWeek5>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getIsWeek5().toString()));
			sb.append("</isWeek5>");		
		}
		if (this.getIsActive() != null)
		{
			sb.append("<isActive>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getIsActive().toString()));
			sb.append("</isActive>");		
		}
		if (this.getMinInt() != null)
		{
			sb.append("<minInt>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMinInt().toString()));
			sb.append("</minInt>");		
		}
		if (this.getContArr() != null)
		{
			sb.append("<contArr>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getContArr().toString()));
			sb.append("</contArr>");		
		}
		if (this.getContLocation() != null)
		{
			sb.append("<contLocation>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getContLocation().toString()));
			sb.append("</contLocation>");		
		}
		if (this.getSpecialty() != null)
		{
			sb.append("<specialty>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSpecialty().toString()));
			sb.append("</specialty>");		
		}
		if (this.getProfileDetails() != null)
		{
			if (this.getProfileDetails().size() > 0 )
			{
			sb.append("<profileDetails>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getProfileDetails(), domMap));
			sb.append("</profileDetails>");		
			}
		}
		if (this.getProfileListOwner() != null)
		{
			if (this.getProfileListOwner().size() > 0 )
			{
			sb.append("<profileListOwner>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getProfileListOwner(), domMap));
			sb.append("</profileListOwner>");		
			}
		}
		if (this.getProfileUsers() != null)
		{
			if (this.getProfileUsers().size() > 0 )
			{
			sb.append("<profileUsers>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getProfileUsers(), domMap));
			sb.append("</profileUsers>");		
			}
		}
		if (this.getExclusionDates() != null)
		{
			if (this.getExclusionDates().size() > 0 )
			{
			sb.append("<exclusionDates>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getExclusionDates(), domMap));
			sb.append("</exclusionDates>");		
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
		if (this.getActions() != null)
		{
			if (this.getActions().size() > 0 )
			{
			sb.append("<actions>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getActions(), domMap));
			sb.append("</actions>");		
			}
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
			Profile domainObject = getProfilefromXML(itemEl, factory, domMap);

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
			Profile domainObject = getProfilefromXML(itemEl, factory, domMap);

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
		
	public static Profile getProfilefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getProfilefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static Profile getProfilefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!Profile.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!Profile.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the Profile class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (Profile)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(Profile.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		Profile ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (Profile)factory.getImportedDomainObject(Profile.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new Profile();
		}
		String keyClassName = "Profile";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (Profile)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, Profile obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("activityId");
		if(fldEl != null)
		{	
    		obj.setActivityId(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("activityGroup");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setActivityGroup(ims.dto_move.domain.objects.ActivityGroup.getActivityGroupfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("location");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setLocation(ims.dto_move.domain.objects.InternalLocation.getInternalLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("name");
		if(fldEl != null)
		{	
    		obj.setName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("scheduleCategory");
		if(fldEl != null)
		{	
    		obj.setScheduleCategory(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("startTime");
		if(fldEl != null)
		{	
    		obj.setStartTime(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("endTime");
		if(fldEl != null)
		{	
    		obj.setEndTime(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("effFrm");
		if(fldEl != null)
		{	
    		obj.setEffFrm(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("effTo");
		if(fldEl != null)
		{	
    		obj.setEffTo(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("maxNoAppts");
		if(fldEl != null)
		{	
    		obj.setMaxNoAppts(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("intervalType");
		if(fldEl != null)
		{	
    		obj.setIntervalType(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("intervalSize");
		if(fldEl != null)
		{	
    		obj.setIntervalSize(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("schedulingType");
		if(fldEl != null)
		{	
    		obj.setSchedulingType(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("lastAppInterval");
		if(fldEl != null)
		{	
    		obj.setLastAppInterval(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("cmdExtValue");
		if(fldEl != null)
		{	
    		obj.setCmdExtValue(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("specClinic");
		if(fldEl != null)
		{	
    		obj.setSpecClinic(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("roundAttTime");
		if(fldEl != null)
		{	
    		obj.setRoundAttTime(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("lastGenDate");
		if(fldEl != null)
		{	
    		obj.setLastGenDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("isSchMon");
		if(fldEl != null)
		{	
    		obj.setIsSchMon(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isSchTue");
		if(fldEl != null)
		{	
    		obj.setIsSchTue(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isSchWed");
		if(fldEl != null)
		{	
    		obj.setIsSchWed(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isSchThur");
		if(fldEl != null)
		{	
    		obj.setIsSchThur(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isSchFri");
		if(fldEl != null)
		{	
    		obj.setIsSchFri(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isSchSat");
		if(fldEl != null)
		{	
    		obj.setIsSchSat(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isSchSun");
		if(fldEl != null)
		{	
    		obj.setIsSchSun(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isWeek1");
		if(fldEl != null)
		{	
    		obj.setIsWeek1(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isWeek2");
		if(fldEl != null)
		{	
    		obj.setIsWeek2(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isWeek3");
		if(fldEl != null)
		{	
    		obj.setIsWeek3(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isWeek4");
		if(fldEl != null)
		{	
    		obj.setIsWeek4(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isWeek5");
		if(fldEl != null)
		{	
    		obj.setIsWeek5(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isActive");
		if(fldEl != null)
		{	
    		obj.setIsActive(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("minInt");
		if(fldEl != null)
		{	
    		obj.setMinInt(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("contArr");
		if(fldEl != null)
		{	
    		obj.setContArr(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("contLocation");
		if(fldEl != null)
		{	
    		obj.setContLocation(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("specialty");
		if(fldEl != null)
		{	
    		obj.setSpecialty(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("profileDetails");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setProfileDetails(ims.dto_move.domain.objects.ProfileDetail.fromListXMLString(fldEl, factory, obj.getProfileDetails(), domMap));
		}
		fldEl = el.element("profileListOwner");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setProfileListOwner(ims.dto_move.domain.objects.ProfileListOwner.fromListXMLString(fldEl, factory, obj.getProfileListOwner(), domMap));
		}
		fldEl = el.element("profileUsers");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setProfileUsers(ims.dto_move.domain.objects.ProfileUser.fromListXMLString(fldEl, factory, obj.getProfileUsers(), domMap));
		}
		fldEl = el.element("exclusionDates");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setExclusionDates(ims.dto_move.domain.objects.ProfileExclusionDate.fromListXMLString(fldEl, factory, obj.getExclusionDates(), domMap));
		}
		fldEl = el.element("exclusionTimes");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setExclusionTimes(ims.dto_move.domain.objects.ProfileExclusionTime.fromListXMLString(fldEl, factory, obj.getExclusionTimes(), domMap));
		}
		fldEl = el.element("actions");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setActions(ims.dto_move.domain.objects.ProfileAction.fromListXMLString(fldEl, factory, obj.getActions(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "profileDetails"
		, "profileListOwner"
		, "profileUsers"
		, "exclusionDates"
		, "exclusionTimes"
		, "actions"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String ActivityId = "activityId";
		public static final String ActivityGroup = "activityGroup";
		public static final String Location = "location";
		public static final String Name = "name";
		public static final String ScheduleCategory = "scheduleCategory";
		public static final String StartTime = "startTime";
		public static final String EndTime = "endTime";
		public static final String EffFrm = "effFrm";
		public static final String EffTo = "effTo";
		public static final String MaxNoAppts = "maxNoAppts";
		public static final String IntervalType = "intervalType";
		public static final String IntervalSize = "intervalSize";
		public static final String SchedulingType = "schedulingType";
		public static final String LastAppInterval = "lastAppInterval";
		public static final String CmdExtValue = "cmdExtValue";
		public static final String SpecClinic = "specClinic";
		public static final String RoundAttTime = "roundAttTime";
		public static final String LastGenDate = "lastGenDate";
		public static final String IsSchMon = "isSchMon";
		public static final String IsSchTue = "isSchTue";
		public static final String IsSchWed = "isSchWed";
		public static final String IsSchThur = "isSchThur";
		public static final String IsSchFri = "isSchFri";
		public static final String IsSchSat = "isSchSat";
		public static final String IsSchSun = "isSchSun";
		public static final String IsWeek1 = "isWeek1";
		public static final String IsWeek2 = "isWeek2";
		public static final String IsWeek3 = "isWeek3";
		public static final String IsWeek4 = "isWeek4";
		public static final String IsWeek5 = "isWeek5";
		public static final String IsActive = "isActive";
		public static final String MinInt = "minInt";
		public static final String ContArr = "contArr";
		public static final String ContLocation = "contLocation";
		public static final String Specialty = "specialty";
		public static final String ProfileDetails = "profileDetails";
		public static final String ProfileListOwner = "profileListOwner";
		public static final String ProfileUsers = "profileUsers";
		public static final String ExclusionDates = "exclusionDates";
		public static final String ExclusionTimes = "exclusionTimes";
		public static final String Actions = "actions";
	}
}

