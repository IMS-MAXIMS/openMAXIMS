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


public class Sch_Profile extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1005100001;
	private static final long serialVersionUID = 1005100001L;
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
	/** ScheduledLocation */
	private ims.core.resource.place.domain.objects.Location schLocation;
	/** Service */
	private ims.core.clinical.domain.objects.Service service;
	/** isFixed */
	private Boolean isFixed;
	/** PASClinic */
	private ims.domain.lookups.LookupInstance pASClinic;
	/** Prf_Category - Standard / Adhoc */
	private ims.domain.lookups.LookupInstance prfCategory;
	/** Prf_type - Single/Multiple */
	private ims.domain.lookups.LookupInstance prftype;
	/** isUnderContract */
	private Boolean isUnderContract;
	/** Effective From Date */
	private java.util.Date effFrm;
	/** Effective To Date */
	private java.util.Date effTo;
	/** Interval_Type */
	private ims.domain.lookups.LookupInstance intervalType;
	/** Interval Size */
	private Integer intervalSize;
	/** Sch_Mon */
	private Boolean isSchMon;
	/** Sch_Tue */
	private Boolean isSchTue;
	/** Sch_Wed */
	private Boolean isSchWed;
	/** Sch_Thur */
	private Boolean isSchThur;
	/** Sch_Fri */
	private Boolean isSchFri;
	/** Sch_Sat */
	private Boolean isSchSat;
	/** Sch_Sun */
	private Boolean isSchSun;
	/** isFirstInstance */
	private Boolean isFirstInstance;
	/** isSecondInstance */
	private Boolean isSecondInstance;
	/** isThirdInstance */
	private Boolean isThirdInstance;
	/** isFourthInstance */
	private Boolean isFourthInstance;
	/** isFifthInstance */
	private Boolean isFifthInstance;
	/** Minimal Interval Between Appointments */
	private Integer minInt;
	/** RoundAttendanceTime */
	private Integer roundAttTime;
	/** LastAppInterval */
	private Integer lastAppInterval;
	/** StartTime */
	private String startTm;
	/** End Time */
	private String endTm;
	/** Maximim Number of Appointments */
	private Integer maxNoAppts;
	/** isActive */
	private Boolean isActive;
	/** ProfileSlots
	  * Collection of ims.scheduling.domain.objects.Profile_Slot.
	  */
	private java.util.Set profileSlots;
	/** BookingRights
	  * Collection of ims.scheduling.domain.objects.Profile_BookingRight.
	  */
	private java.util.Set bookingRights;
	/** ListOwners
	  * Collection of ims.scheduling.domain.objects.Profile_ListOwner.
	  */
	private java.util.Set listOwners;
	/** LastGenDate */
	private java.util.Date lastGenDate;
	/** Date of last actual date a session was generated */
	private java.util.Date lastActualGenDate;
	/** ExclusionDates
	  * Collection of ims.scheduling.domain.objects.Profile_Exc_Date.
	  */
	private java.util.Set exclusionDates;
	/** ExclusionTimes
	  * Collection of ims.scheduling.domain.objects.Profile_Exc_Time.
	  */
	private java.util.Set exclusionTimes;
	/** Directory of Services
	  * Collection of ims.scheduling.domain.objects.DirectoryofService.
	  */
	private java.util.Set directoryOfServices;
	/** TheatreDetails
	  * Collection of ims.scheduling.domain.objects.TheatreDetail.
	  */
	private java.util.Set theatreDetails;
	/** Is this a Theatre Profile */
	private Boolean isTheatreProfile;
	/** Day Case / Inpatient */
	private ims.domain.lookups.LookupInstance theatreType;
	/** Profile Activities
	  * Collection of ims.scheduling.domain.objects.Profile_Activity.
	  */
	private java.util.Set profileActivities;
	/** Profile Theatre Slots
	  * Collection of ims.scheduling.domain.objects.ProfileTheatreTCISlot.
	  */
	private java.util.Set profileTheatreSlots;
	/** Applies to Theatre Profiles only
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List anaestheticType;
	/** Slots,TheatreTCITime etc. */
	private ims.domain.lookups.LookupInstance slotType;
	/** ParentChildSlots
	  * Collection of ims.scheduling.domain.objects.ProfileParentChildSlot.
	  */
	private java.util.Set parentChildSlots;
	/** Consultation Media Type */
	private ims.domain.lookups.LookupInstance consMediaType;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public Sch_Profile (Integer id, int ver)
    {
    	super(id, ver);
    }
    public Sch_Profile ()
    {
    	super();
    }
    public Sch_Profile (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.scheduling.domain.objects.Sch_Profile.class;
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

	public ims.core.resource.place.domain.objects.Location getSchLocation() {
		return schLocation;
	}
	public void setSchLocation(ims.core.resource.place.domain.objects.Location schLocation) {
		this.schLocation = schLocation;
	}

	public ims.core.clinical.domain.objects.Service getService() {
		return service;
	}
	public void setService(ims.core.clinical.domain.objects.Service service) {
		this.service = service;
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

	public ims.domain.lookups.LookupInstance getPrfCategory() {
		return prfCategory;
	}
	public void setPrfCategory(ims.domain.lookups.LookupInstance prfCategory) {
		this.prfCategory = prfCategory;
	}

	public ims.domain.lookups.LookupInstance getPrftype() {
		return prftype;
	}
	public void setPrftype(ims.domain.lookups.LookupInstance prftype) {
		this.prftype = prftype;
	}

	public Boolean isIsUnderContract() {
		return isUnderContract;
	}
	public void setIsUnderContract(Boolean isUnderContract) {
		this.isUnderContract = isUnderContract;
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

	public ims.domain.lookups.LookupInstance getIntervalType() {
		return intervalType;
	}
	public void setIntervalType(ims.domain.lookups.LookupInstance intervalType) {
		this.intervalType = intervalType;
	}

	public Integer getIntervalSize() {
		return intervalSize;
	}
	public void setIntervalSize(Integer intervalSize) {
		this.intervalSize = intervalSize;
	}

	public Boolean isIsSchMon() {
		return isSchMon;
	}
	public void setIsSchMon(Boolean isSchMon) {
		this.isSchMon = isSchMon;
	}

	public Boolean isIsSchTue() {
		return isSchTue;
	}
	public void setIsSchTue(Boolean isSchTue) {
		this.isSchTue = isSchTue;
	}

	public Boolean isIsSchWed() {
		return isSchWed;
	}
	public void setIsSchWed(Boolean isSchWed) {
		this.isSchWed = isSchWed;
	}

	public Boolean isIsSchThur() {
		return isSchThur;
	}
	public void setIsSchThur(Boolean isSchThur) {
		this.isSchThur = isSchThur;
	}

	public Boolean isIsSchFri() {
		return isSchFri;
	}
	public void setIsSchFri(Boolean isSchFri) {
		this.isSchFri = isSchFri;
	}

	public Boolean isIsSchSat() {
		return isSchSat;
	}
	public void setIsSchSat(Boolean isSchSat) {
		this.isSchSat = isSchSat;
	}

	public Boolean isIsSchSun() {
		return isSchSun;
	}
	public void setIsSchSun(Boolean isSchSun) {
		this.isSchSun = isSchSun;
	}

	public Boolean isIsFirstInstance() {
		return isFirstInstance;
	}
	public void setIsFirstInstance(Boolean isFirstInstance) {
		this.isFirstInstance = isFirstInstance;
	}

	public Boolean isIsSecondInstance() {
		return isSecondInstance;
	}
	public void setIsSecondInstance(Boolean isSecondInstance) {
		this.isSecondInstance = isSecondInstance;
	}

	public Boolean isIsThirdInstance() {
		return isThirdInstance;
	}
	public void setIsThirdInstance(Boolean isThirdInstance) {
		this.isThirdInstance = isThirdInstance;
	}

	public Boolean isIsFourthInstance() {
		return isFourthInstance;
	}
	public void setIsFourthInstance(Boolean isFourthInstance) {
		this.isFourthInstance = isFourthInstance;
	}

	public Boolean isIsFifthInstance() {
		return isFifthInstance;
	}
	public void setIsFifthInstance(Boolean isFifthInstance) {
		this.isFifthInstance = isFifthInstance;
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

	public Integer getMaxNoAppts() {
		return maxNoAppts;
	}
	public void setMaxNoAppts(Integer maxNoAppts) {
		this.maxNoAppts = maxNoAppts;
	}

	public Boolean isIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public java.util.Set getProfileSlots() {
		if ( null == profileSlots ) {
			profileSlots = new java.util.HashSet();
		}
		return profileSlots;
	}
	public void setProfileSlots(java.util.Set paramValue) {
		this.profileSlots = paramValue;
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

	public java.util.Set getListOwners() {
		if ( null == listOwners ) {
			listOwners = new java.util.HashSet();
		}
		return listOwners;
	}
	public void setListOwners(java.util.Set paramValue) {
		this.listOwners = paramValue;
	}

	public java.util.Date getLastGenDate() {
		return lastGenDate;
	}
	public void setLastGenDate(java.util.Date lastGenDate) {
		this.lastGenDate = lastGenDate;
	}

	public java.util.Date getLastActualGenDate() {
		return lastActualGenDate;
	}
	public void setLastActualGenDate(java.util.Date lastActualGenDate) {
		this.lastActualGenDate = lastActualGenDate;
	}

	public java.util.Set getExclusionDates() {
		if ( null == exclusionDates ) {
			exclusionDates = new java.util.HashSet();
		}
		return exclusionDates;
	}
	public void setExclusionDates(java.util.Set paramValue) {
		this.exclusionDates = paramValue;
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

	public java.util.Set getDirectoryOfServices() {
		if ( null == directoryOfServices ) {
			directoryOfServices = new java.util.HashSet();
		}
		return directoryOfServices;
	}
	public void setDirectoryOfServices(java.util.Set paramValue) {
		this.directoryOfServices = paramValue;
	}

	public java.util.Set getTheatreDetails() {
		if ( null == theatreDetails ) {
			theatreDetails = new java.util.HashSet();
		}
		return theatreDetails;
	}
	public void setTheatreDetails(java.util.Set paramValue) {
		this.theatreDetails = paramValue;
	}

	public Boolean isIsTheatreProfile() {
		return isTheatreProfile;
	}
	public void setIsTheatreProfile(Boolean isTheatreProfile) {
		this.isTheatreProfile = isTheatreProfile;
	}

	public ims.domain.lookups.LookupInstance getTheatreType() {
		return theatreType;
	}
	public void setTheatreType(ims.domain.lookups.LookupInstance theatreType) {
		this.theatreType = theatreType;
	}

	public java.util.Set getProfileActivities() {
		if ( null == profileActivities ) {
			profileActivities = new java.util.HashSet();
		}
		return profileActivities;
	}
	public void setProfileActivities(java.util.Set paramValue) {
		this.profileActivities = paramValue;
	}

	public java.util.Set getProfileTheatreSlots() {
		if ( null == profileTheatreSlots ) {
			profileTheatreSlots = new java.util.HashSet();
		}
		return profileTheatreSlots;
	}
	public void setProfileTheatreSlots(java.util.Set paramValue) {
		this.profileTheatreSlots = paramValue;
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

	public ims.domain.lookups.LookupInstance getSlotType() {
		return slotType;
	}
	public void setSlotType(ims.domain.lookups.LookupInstance slotType) {
		this.slotType = slotType;
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
		
		auditStr.append("\r\n*name* :");
		auditStr.append(name);
	    auditStr.append("; ");
		auditStr.append("\r\n*description* :");
		auditStr.append(description);
	    auditStr.append("; ");
		auditStr.append("\r\n*schLocation* :");
		if (schLocation != null)
		{
			auditStr.append(toShortClassName(schLocation));
				
		    auditStr.append(schLocation.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*service* :");
		if (service != null)
		{
			auditStr.append(toShortClassName(service));
				
		    auditStr.append(service.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isFixed* :");
		auditStr.append(isFixed);
	    auditStr.append("; ");
		auditStr.append("\r\n*pASClinic* :");
		if (pASClinic != null)
			auditStr.append(pASClinic.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*prfCategory* :");
		if (prfCategory != null)
			auditStr.append(prfCategory.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*prftype* :");
		if (prftype != null)
			auditStr.append(prftype.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*isUnderContract* :");
		auditStr.append(isUnderContract);
	    auditStr.append("; ");
		auditStr.append("\r\n*effFrm* :");
		auditStr.append(effFrm);
	    auditStr.append("; ");
		auditStr.append("\r\n*effTo* :");
		auditStr.append(effTo);
	    auditStr.append("; ");
		auditStr.append("\r\n*intervalType* :");
		if (intervalType != null)
			auditStr.append(intervalType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*intervalSize* :");
		auditStr.append(intervalSize);
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
		auditStr.append("\r\n*isFirstInstance* :");
		auditStr.append(isFirstInstance);
	    auditStr.append("; ");
		auditStr.append("\r\n*isSecondInstance* :");
		auditStr.append(isSecondInstance);
	    auditStr.append("; ");
		auditStr.append("\r\n*isThirdInstance* :");
		auditStr.append(isThirdInstance);
	    auditStr.append("; ");
		auditStr.append("\r\n*isFourthInstance* :");
		auditStr.append(isFourthInstance);
	    auditStr.append("; ");
		auditStr.append("\r\n*isFifthInstance* :");
		auditStr.append(isFifthInstance);
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
		auditStr.append("\r\n*startTm* :");
		auditStr.append(startTm);
	    auditStr.append("; ");
		auditStr.append("\r\n*endTm* :");
		auditStr.append(endTm);
	    auditStr.append("; ");
		auditStr.append("\r\n*maxNoAppts* :");
		auditStr.append(maxNoAppts);
	    auditStr.append("; ");
		auditStr.append("\r\n*isActive* :");
		auditStr.append(isActive);
	    auditStr.append("; ");
		auditStr.append("\r\n*profileSlots* :");
		if (profileSlots != null)
		{
			java.util.Iterator it33 = profileSlots.iterator();
			int i33=0;
			while (it33.hasNext())
			{
				if (i33 > 0)
					auditStr.append(",");
				ims.scheduling.domain.objects.Profile_Slot obj = (ims.scheduling.domain.objects.Profile_Slot)it33.next();
		if (obj != null)
		{
		   if (i33 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i33++;
		}
		if (i33 > 0)
			auditStr.append("] " + i33);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*bookingRights* :");
		if (bookingRights != null)
		{
			java.util.Iterator it34 = bookingRights.iterator();
			int i34=0;
			while (it34.hasNext())
			{
				if (i34 > 0)
					auditStr.append(",");
				ims.scheduling.domain.objects.Profile_BookingRight obj = (ims.scheduling.domain.objects.Profile_BookingRight)it34.next();
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
		auditStr.append("\r\n*listOwners* :");
		if (listOwners != null)
		{
			java.util.Iterator it35 = listOwners.iterator();
			int i35=0;
			while (it35.hasNext())
			{
				if (i35 > 0)
					auditStr.append(",");
				ims.scheduling.domain.objects.Profile_ListOwner obj = (ims.scheduling.domain.objects.Profile_ListOwner)it35.next();
		if (obj != null)
		{
		   if (i35 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i35++;
		}
		if (i35 > 0)
			auditStr.append("] " + i35);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*lastGenDate* :");
		auditStr.append(lastGenDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*lastActualGenDate* :");
		auditStr.append(lastActualGenDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*exclusionDates* :");
		if (exclusionDates != null)
		{
			java.util.Iterator it38 = exclusionDates.iterator();
			int i38=0;
			while (it38.hasNext())
			{
				if (i38 > 0)
					auditStr.append(",");
				ims.scheduling.domain.objects.Profile_Exc_Date obj = (ims.scheduling.domain.objects.Profile_Exc_Date)it38.next();
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
		auditStr.append("\r\n*exclusionTimes* :");
		if (exclusionTimes != null)
		{
			java.util.Iterator it39 = exclusionTimes.iterator();
			int i39=0;
			while (it39.hasNext())
			{
				if (i39 > 0)
					auditStr.append(",");
				ims.scheduling.domain.objects.Profile_Exc_Time obj = (ims.scheduling.domain.objects.Profile_Exc_Time)it39.next();
		if (obj != null)
		{
		   if (i39 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i39++;
		}
		if (i39 > 0)
			auditStr.append("] " + i39);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*directoryOfServices* :");
		if (directoryOfServices != null)
		{
			java.util.Iterator it40 = directoryOfServices.iterator();
			int i40=0;
			while (it40.hasNext())
			{
				if (i40 > 0)
					auditStr.append(",");
				ims.scheduling.domain.objects.DirectoryofService obj = (ims.scheduling.domain.objects.DirectoryofService)it40.next();
		if (obj != null)
		{
		   if (i40 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i40++;
		}
		if (i40 > 0)
			auditStr.append("] " + i40);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*theatreDetails* :");
		if (theatreDetails != null)
		{
			java.util.Iterator it41 = theatreDetails.iterator();
			int i41=0;
			while (it41.hasNext())
			{
				if (i41 > 0)
					auditStr.append(",");
				ims.scheduling.domain.objects.TheatreDetail obj = (ims.scheduling.domain.objects.TheatreDetail)it41.next();
		if (obj != null)
		{
		   if (i41 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i41++;
		}
		if (i41 > 0)
			auditStr.append("] " + i41);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isTheatreProfile* :");
		auditStr.append(isTheatreProfile);
	    auditStr.append("; ");
		auditStr.append("\r\n*theatreType* :");
		if (theatreType != null)
			auditStr.append(theatreType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*profileActivities* :");
		if (profileActivities != null)
		{
			java.util.Iterator it44 = profileActivities.iterator();
			int i44=0;
			while (it44.hasNext())
			{
				if (i44 > 0)
					auditStr.append(",");
				ims.scheduling.domain.objects.Profile_Activity obj = (ims.scheduling.domain.objects.Profile_Activity)it44.next();
		if (obj != null)
		{
		   if (i44 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i44++;
		}
		if (i44 > 0)
			auditStr.append("] " + i44);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*profileTheatreSlots* :");
		if (profileTheatreSlots != null)
		{
			java.util.Iterator it45 = profileTheatreSlots.iterator();
			int i45=0;
			while (it45.hasNext())
			{
				if (i45 > 0)
					auditStr.append(",");
				ims.scheduling.domain.objects.ProfileTheatreTCISlot obj = (ims.scheduling.domain.objects.ProfileTheatreTCISlot)it45.next();
		if (obj != null)
		{
		   if (i45 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i45++;
		}
		if (i45 > 0)
			auditStr.append("] " + i45);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*anaestheticType* :");
		if (anaestheticType != null)
		{
		int i46=0;
		for (i46=0; i46<anaestheticType.size(); i46++)
		{
			if (i46 > 0)
				auditStr.append(",");
			ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)anaestheticType.get(i46);
			auditStr.append(obj.getText());
		}
		if (i46 > 0)
			auditStr.append("] " + i46);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*slotType* :");
		if (slotType != null)
			auditStr.append(slotType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*parentChildSlots* :");
		if (parentChildSlots != null)
		{
			java.util.Iterator it48 = parentChildSlots.iterator();
			int i48=0;
			while (it48.hasNext())
			{
				if (i48 > 0)
					auditStr.append(",");
				ims.scheduling.domain.objects.ProfileParentChildSlot obj = (ims.scheduling.domain.objects.ProfileParentChildSlot)it48.next();
		if (obj != null)
		{
		   if (i48 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i48++;
		}
		if (i48 > 0)
			auditStr.append("] " + i48);
		}
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
		
		String keyClassName = "Sch_Profile";
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
		if (this.getSchLocation() != null)
		{
			sb.append("<schLocation>");
			sb.append(this.getSchLocation().toXMLString(domMap)); 	
			sb.append("</schLocation>");		
		}
		if (this.getService() != null)
		{
			sb.append("<service>");
			sb.append(this.getService().toXMLString(domMap)); 	
			sb.append("</service>");		
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
		if (this.getPrfCategory() != null)
		{
			sb.append("<prfCategory>");
			sb.append(this.getPrfCategory().toXMLString()); 
			sb.append("</prfCategory>");		
		}
		if (this.getPrftype() != null)
		{
			sb.append("<prftype>");
			sb.append(this.getPrftype().toXMLString()); 
			sb.append("</prftype>");		
		}
		if (this.isIsUnderContract() != null)
		{
			sb.append("<isUnderContract>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsUnderContract().toString()));
			sb.append("</isUnderContract>");		
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
		if (this.getIntervalType() != null)
		{
			sb.append("<intervalType>");
			sb.append(this.getIntervalType().toXMLString()); 
			sb.append("</intervalType>");		
		}
		if (this.getIntervalSize() != null)
		{
			sb.append("<intervalSize>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getIntervalSize().toString()));
			sb.append("</intervalSize>");		
		}
		if (this.isIsSchMon() != null)
		{
			sb.append("<isSchMon>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsSchMon().toString()));
			sb.append("</isSchMon>");		
		}
		if (this.isIsSchTue() != null)
		{
			sb.append("<isSchTue>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsSchTue().toString()));
			sb.append("</isSchTue>");		
		}
		if (this.isIsSchWed() != null)
		{
			sb.append("<isSchWed>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsSchWed().toString()));
			sb.append("</isSchWed>");		
		}
		if (this.isIsSchThur() != null)
		{
			sb.append("<isSchThur>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsSchThur().toString()));
			sb.append("</isSchThur>");		
		}
		if (this.isIsSchFri() != null)
		{
			sb.append("<isSchFri>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsSchFri().toString()));
			sb.append("</isSchFri>");		
		}
		if (this.isIsSchSat() != null)
		{
			sb.append("<isSchSat>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsSchSat().toString()));
			sb.append("</isSchSat>");		
		}
		if (this.isIsSchSun() != null)
		{
			sb.append("<isSchSun>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsSchSun().toString()));
			sb.append("</isSchSun>");		
		}
		if (this.isIsFirstInstance() != null)
		{
			sb.append("<isFirstInstance>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsFirstInstance().toString()));
			sb.append("</isFirstInstance>");		
		}
		if (this.isIsSecondInstance() != null)
		{
			sb.append("<isSecondInstance>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsSecondInstance().toString()));
			sb.append("</isSecondInstance>");		
		}
		if (this.isIsThirdInstance() != null)
		{
			sb.append("<isThirdInstance>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsThirdInstance().toString()));
			sb.append("</isThirdInstance>");		
		}
		if (this.isIsFourthInstance() != null)
		{
			sb.append("<isFourthInstance>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsFourthInstance().toString()));
			sb.append("</isFourthInstance>");		
		}
		if (this.isIsFifthInstance() != null)
		{
			sb.append("<isFifthInstance>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsFifthInstance().toString()));
			sb.append("</isFifthInstance>");		
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
		if (this.getMaxNoAppts() != null)
		{
			sb.append("<maxNoAppts>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMaxNoAppts().toString()));
			sb.append("</maxNoAppts>");		
		}
		if (this.isIsActive() != null)
		{
			sb.append("<isActive>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsActive().toString()));
			sb.append("</isActive>");		
		}
		if (this.getProfileSlots() != null)
		{
			if (this.getProfileSlots().size() > 0 )
			{
			sb.append("<profileSlots>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getProfileSlots(), domMap));
			sb.append("</profileSlots>");		
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
		if (this.getListOwners() != null)
		{
			if (this.getListOwners().size() > 0 )
			{
			sb.append("<listOwners>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getListOwners(), domMap));
			sb.append("</listOwners>");		
			}
		}
		if (this.getLastGenDate() != null)
		{
			sb.append("<lastGenDate>");
			sb.append(new ims.framework.utils.DateTime(this.getLastGenDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</lastGenDate>");		
		}
		if (this.getLastActualGenDate() != null)
		{
			sb.append("<lastActualGenDate>");
			sb.append(new ims.framework.utils.DateTime(this.getLastActualGenDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</lastActualGenDate>");		
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
		if (this.getDirectoryOfServices() != null)
		{
			if (this.getDirectoryOfServices().size() > 0 )
			{
			sb.append("<directoryOfServices>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getDirectoryOfServices(), domMap));
			sb.append("</directoryOfServices>");		
			}
		}
		if (this.getTheatreDetails() != null)
		{
			if (this.getTheatreDetails().size() > 0 )
			{
			sb.append("<theatreDetails>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getTheatreDetails(), domMap));
			sb.append("</theatreDetails>");		
			}
		}
		if (this.isIsTheatreProfile() != null)
		{
			sb.append("<isTheatreProfile>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsTheatreProfile().toString()));
			sb.append("</isTheatreProfile>");		
		}
		if (this.getTheatreType() != null)
		{
			sb.append("<theatreType>");
			sb.append(this.getTheatreType().toXMLString()); 
			sb.append("</theatreType>");		
		}
		if (this.getProfileActivities() != null)
		{
			if (this.getProfileActivities().size() > 0 )
			{
			sb.append("<profileActivities>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getProfileActivities(), domMap));
			sb.append("</profileActivities>");		
			}
		}
		if (this.getProfileTheatreSlots() != null)
		{
			if (this.getProfileTheatreSlots().size() > 0 )
			{
			sb.append("<profileTheatreSlots>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getProfileTheatreSlots(), domMap));
			sb.append("</profileTheatreSlots>");		
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
		if (this.getSlotType() != null)
		{
			sb.append("<slotType>");
			sb.append(this.getSlotType().toXMLString()); 
			sb.append("</slotType>");		
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
			Sch_Profile domainObject = getSch_ProfilefromXML(itemEl, factory, domMap);

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
			Sch_Profile domainObject = getSch_ProfilefromXML(itemEl, factory, domMap);

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
		
	public static Sch_Profile getSch_ProfilefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getSch_ProfilefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static Sch_Profile getSch_ProfilefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!Sch_Profile.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!Sch_Profile.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the Sch_Profile class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (Sch_Profile)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(Sch_Profile.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		Sch_Profile ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (Sch_Profile)factory.getImportedDomainObject(Sch_Profile.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new Sch_Profile();
		}
		String keyClassName = "Sch_Profile";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (Sch_Profile)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, Sch_Profile obj, java.util.HashMap domMap) throws Exception
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
		fldEl = el.element("schLocation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSchLocation(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("service");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setService(ims.core.clinical.domain.objects.Service.getServicefromXML(fldEl, factory, domMap)); 
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
		fldEl = el.element("prfCategory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPrfCategory(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("prftype");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPrftype(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("isUnderContract");
		if(fldEl != null)
		{	
    		obj.setIsUnderContract(new Boolean(fldEl.getTextTrim()));	
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
		fldEl = el.element("intervalType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setIntervalType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("intervalSize");
		if(fldEl != null)
		{	
    		obj.setIntervalSize(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isSchMon");
		if(fldEl != null)
		{	
    		obj.setIsSchMon(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isSchTue");
		if(fldEl != null)
		{	
    		obj.setIsSchTue(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isSchWed");
		if(fldEl != null)
		{	
    		obj.setIsSchWed(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isSchThur");
		if(fldEl != null)
		{	
    		obj.setIsSchThur(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isSchFri");
		if(fldEl != null)
		{	
    		obj.setIsSchFri(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isSchSat");
		if(fldEl != null)
		{	
    		obj.setIsSchSat(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isSchSun");
		if(fldEl != null)
		{	
    		obj.setIsSchSun(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isFirstInstance");
		if(fldEl != null)
		{	
    		obj.setIsFirstInstance(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isSecondInstance");
		if(fldEl != null)
		{	
    		obj.setIsSecondInstance(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isThirdInstance");
		if(fldEl != null)
		{	
    		obj.setIsThirdInstance(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isFourthInstance");
		if(fldEl != null)
		{	
    		obj.setIsFourthInstance(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isFifthInstance");
		if(fldEl != null)
		{	
    		obj.setIsFifthInstance(new Boolean(fldEl.getTextTrim()));	
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
		fldEl = el.element("maxNoAppts");
		if(fldEl != null)
		{	
    		obj.setMaxNoAppts(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isActive");
		if(fldEl != null)
		{	
    		obj.setIsActive(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("profileSlots");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setProfileSlots(ims.scheduling.domain.objects.Profile_Slot.fromSetXMLString(fldEl, factory, obj.getProfileSlots(), domMap));
		}
		fldEl = el.element("bookingRights");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setBookingRights(ims.scheduling.domain.objects.Profile_BookingRight.fromSetXMLString(fldEl, factory, obj.getBookingRights(), domMap));
		}
		fldEl = el.element("listOwners");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setListOwners(ims.scheduling.domain.objects.Profile_ListOwner.fromSetXMLString(fldEl, factory, obj.getListOwners(), domMap));
		}
		fldEl = el.element("lastGenDate");
		if(fldEl != null)
		{	
    		obj.setLastGenDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("lastActualGenDate");
		if(fldEl != null)
		{	
    		obj.setLastActualGenDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("exclusionDates");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setExclusionDates(ims.scheduling.domain.objects.Profile_Exc_Date.fromSetXMLString(fldEl, factory, obj.getExclusionDates(), domMap));
		}
		fldEl = el.element("exclusionTimes");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setExclusionTimes(ims.scheduling.domain.objects.Profile_Exc_Time.fromSetXMLString(fldEl, factory, obj.getExclusionTimes(), domMap));
		}
		fldEl = el.element("directoryOfServices");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setDirectoryOfServices(ims.scheduling.domain.objects.DirectoryofService.fromSetXMLString(fldEl, factory, obj.getDirectoryOfServices(), domMap));
		}
		fldEl = el.element("theatreDetails");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setTheatreDetails(ims.scheduling.domain.objects.TheatreDetail.fromSetXMLString(fldEl, factory, obj.getTheatreDetails(), domMap));
		}
		fldEl = el.element("isTheatreProfile");
		if(fldEl != null)
		{	
    		obj.setIsTheatreProfile(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("theatreType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTheatreType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("profileActivities");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setProfileActivities(ims.scheduling.domain.objects.Profile_Activity.fromSetXMLString(fldEl, factory, obj.getProfileActivities(), domMap));
		}
		fldEl = el.element("profileTheatreSlots");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setProfileTheatreSlots(ims.scheduling.domain.objects.ProfileTheatreTCISlot.fromSetXMLString(fldEl, factory, obj.getProfileTheatreSlots(), domMap));
		}
		fldEl = el.element("anaestheticType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setAnaestheticType(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getAnaestheticType())); 
		}
		fldEl = el.element("slotType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSlotType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("parentChildSlots");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setParentChildSlots(ims.scheduling.domain.objects.ProfileParentChildSlot.fromSetXMLString(fldEl, factory, obj.getParentChildSlots(), domMap));
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
		 "profileSlots"
		, "bookingRights"
		, "listOwners"
		, "exclusionDates"
		, "exclusionTimes"
		, "directoryOfServices"
		, "theatreDetails"
		, "profileActivities"
		, "profileTheatreSlots"
		, "anaestheticType"
		, "parentChildSlots"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Name = "name";
		public static final String Description = "description";
		public static final String SchLocation = "schLocation";
		public static final String Service = "service";
		public static final String IsFixed = "isFixed";
		public static final String PASClinic = "pASClinic";
		public static final String PrfCategory = "prfCategory";
		public static final String Prftype = "prftype";
		public static final String IsUnderContract = "isUnderContract";
		public static final String EffFrm = "effFrm";
		public static final String EffTo = "effTo";
		public static final String IntervalType = "intervalType";
		public static final String IntervalSize = "intervalSize";
		public static final String IsSchMon = "isSchMon";
		public static final String IsSchTue = "isSchTue";
		public static final String IsSchWed = "isSchWed";
		public static final String IsSchThur = "isSchThur";
		public static final String IsSchFri = "isSchFri";
		public static final String IsSchSat = "isSchSat";
		public static final String IsSchSun = "isSchSun";
		public static final String IsFirstInstance = "isFirstInstance";
		public static final String IsSecondInstance = "isSecondInstance";
		public static final String IsThirdInstance = "isThirdInstance";
		public static final String IsFourthInstance = "isFourthInstance";
		public static final String IsFifthInstance = "isFifthInstance";
		public static final String MinInt = "minInt";
		public static final String RoundAttTime = "roundAttTime";
		public static final String LastAppInterval = "lastAppInterval";
		public static final String StartTm = "startTm";
		public static final String EndTm = "endTm";
		public static final String MaxNoAppts = "maxNoAppts";
		public static final String IsActive = "isActive";
		public static final String ProfileSlots = "profileSlots";
		public static final String BookingRights = "bookingRights";
		public static final String ListOwners = "listOwners";
		public static final String LastGenDate = "lastGenDate";
		public static final String LastActualGenDate = "lastActualGenDate";
		public static final String ExclusionDates = "exclusionDates";
		public static final String ExclusionTimes = "exclusionTimes";
		public static final String DirectoryOfServices = "directoryOfServices";
		public static final String TheatreDetails = "theatreDetails";
		public static final String IsTheatreProfile = "isTheatreProfile";
		public static final String TheatreType = "theatreType";
		public static final String ProfileActivities = "profileActivities";
		public static final String ProfileTheatreSlots = "profileTheatreSlots";
		public static final String AnaestheticType = "anaestheticType";
		public static final String SlotType = "slotType";
		public static final String ParentChildSlots = "parentChildSlots";
		public static final String ConsMediaType = "consMediaType";
	}
}

