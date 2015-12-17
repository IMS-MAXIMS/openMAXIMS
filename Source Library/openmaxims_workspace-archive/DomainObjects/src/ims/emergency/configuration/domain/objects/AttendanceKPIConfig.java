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
package ims.emergency.configuration.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class AttendanceKPIConfig extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1087100007;
	private static final long serialVersionUID = 1087100007L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** ED Location */
	private ims.core.resource.place.domain.objects.Location eDLocation;
	/** Awaiting Triage Breach Warning KPI in Mins */
	private Integer awaitingTriageBreachWarningKPI;
	/** Awaiting Triage Breach Warning KPI Text Colour */
	private ims.framework.utils.Color awaitingTriageBreachWarningKPITextColour;
	/** AwaitingTriageBreachWarningFlashingText - Yes or No */
	private ims.domain.lookups.LookupInstance awaitingTriageBreachWarningKPIFlashingText;
	/** Awaiting Triage Breach Warning KPI Flashing Text Colour */
	private ims.framework.utils.Color awaitingTriageBreachWarningKPIFlashingTextColour;
	/** Awaiting Triage Breach Warning KPI Background Colour */
	private ims.framework.utils.Color awaitingTriageBreachWarningKPIBackgroundColour;
	/** Awaiting Triage Breached KPI */
	private Integer awaitingTriageBreachedKPI;
	/** Awaiting Triage Breach KPI Colour */
	private ims.framework.utils.Color awaitingTriageBreachKPITextColour;
	/** Awaiting Triage Breach KPI Flashing Text */
	private ims.domain.lookups.LookupInstance awaitingTriageBreachKPIFlashingText;
	/** Awaiting Triage Breach KPI Flashing Text Colour */
	private ims.framework.utils.Color awaitingTriageBreachKPIFlashingTextColour;
	/** Awaiting Triage Breach KPI Background Colour */
	private ims.framework.utils.Color awaitingTriageBreachKPIBackgroundColour;
	/** Triage Priority KPIs
	  * Collection of ims.emergency.configuration.domain.objects.TriagePriorityKPConfig.
	  */
	private java.util.List triagePriorityKPIs;
	/** Awaiting Clinician Breach Warning KPI in Mins */
	private Integer awaitingClinicianBreachWarningKPI;
	/** Awaiting Clinician Breach Warning KPI Text Colour */
	private ims.framework.utils.Color awaitingClinicianBreachWarningKPITextColour;
	/** Awaiting Triage Breach KPI Flashing Text */
	private ims.domain.lookups.LookupInstance awaitingClinicianBreachWarningKPIFlashingText;
	/** Awaiting Clinician Breach Warning KPI Flashing Text Colour */
	private ims.framework.utils.Color awaitingClinicianBreachWarningKPIFlashingTextColour;
	/** Awaiting Clinician Breach Warning KPI Background Colour */
	private ims.framework.utils.Color awaitingClinicianBreachWarningKPIBackgroundColour;
	/** Awaiting Clinician Breached KPI */
	private Integer awaitingClinicianBreachedKPI;
	/** Awaiting Clinician Breach KPI Text Colour */
	private ims.framework.utils.Color awaitingClinicianBreachKPITextColour;
	/** Awaiting Clinician Breach KPI Flashing Text */
	private ims.domain.lookups.LookupInstance awaitingClinicianBreachKPIFlashingText;
	/** Awaiting Clinician Breach KPI Flashing Text Colour */
	private ims.framework.utils.Color awaitingClinicianBreachKPIFlashingTextColour;
	/** Awaiting Clinician Breach KPI Background Colour */
	private ims.framework.utils.Color awaitingClinicianBreachKPIBackgroundColour;
	/** Length of Stay Breach Warning KPI in Mins */
	private Integer losBreachWarningKPI;
	/** Length of Stay Breach Warning KPI Colour */
	private ims.framework.utils.Color losBreachWarningKPITextColour;
	/** Los Breach Warning KPI Flashing Text */
	private ims.domain.lookups.LookupInstance losBreachWarningKPIFlashingText;
	/** Los Breach Warning KPI Flashing Text Colour */
	private ims.framework.utils.Color losBreachWarningKPIFlashingTextColour;
	/** Los Breach Warning KPI Background Colour */
	private ims.framework.utils.Color losBreachWarningKPIBackgroundColour;
	/** Length of Stay Breached KPI */
	private Integer losBreachedKPI;
	/** Lenght of Stay Breach KPI Colour */
	private ims.framework.utils.Color losBreachKPITextColour;
	/** Los Breached KPI Flashing Text */
	private ims.domain.lookups.LookupInstance losBreachedKPIFlashingText;
	/** Los Breached KPI Flashing Text Colour */
	private ims.framework.utils.Color losBreachedKPIFlashingTextColour;
	/** Los Breached KPI Background Colour */
	private ims.framework.utils.Color losBreachedKPIBackgroundColour;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public AttendanceKPIConfig (Integer id, int ver)
    {
    	super(id, ver);
    }
    public AttendanceKPIConfig ()
    {
    	super();
    }
    public AttendanceKPIConfig (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.emergency.configuration.domain.objects.AttendanceKPIConfig.class;
	}


	public ims.core.resource.place.domain.objects.Location getEDLocation() {
		return eDLocation;
	}
	public static AttendanceKPIConfig getAttendanceKPIConfigFromEDLocation(ims.domain.ILightweightDomainFactory factory, Integer id)
	{
		java.util.List l = factory.find("from AttendanceKPIConfig c where c.eDLocation.id = " + id);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. AttendanceKPIConfig.eDLocation.id = " + id + " returned " + l.size() + " records. " );
		return (AttendanceKPIConfig)l.get(0);
	}
	public void setEDLocation(ims.core.resource.place.domain.objects.Location eDLocation) {
		this.eDLocation = eDLocation;
	}

	public Integer getAwaitingTriageBreachWarningKPI() {
		return awaitingTriageBreachWarningKPI;
	}
	public void setAwaitingTriageBreachWarningKPI(Integer awaitingTriageBreachWarningKPI) {
		this.awaitingTriageBreachWarningKPI = awaitingTriageBreachWarningKPI;
	}

	public ims.framework.utils.Color getAwaitingTriageBreachWarningKPITextColour() {
		return awaitingTriageBreachWarningKPITextColour;
	}
	public void setAwaitingTriageBreachWarningKPITextColour(ims.framework.utils.Color awaitingTriageBreachWarningKPITextColour) {
		this.awaitingTriageBreachWarningKPITextColour = awaitingTriageBreachWarningKPITextColour;
	}

	public ims.domain.lookups.LookupInstance getAwaitingTriageBreachWarningKPIFlashingText() {
		return awaitingTriageBreachWarningKPIFlashingText;
	}
	public void setAwaitingTriageBreachWarningKPIFlashingText(ims.domain.lookups.LookupInstance awaitingTriageBreachWarningKPIFlashingText) {
		this.awaitingTriageBreachWarningKPIFlashingText = awaitingTriageBreachWarningKPIFlashingText;
	}

	public ims.framework.utils.Color getAwaitingTriageBreachWarningKPIFlashingTextColour() {
		return awaitingTriageBreachWarningKPIFlashingTextColour;
	}
	public void setAwaitingTriageBreachWarningKPIFlashingTextColour(ims.framework.utils.Color awaitingTriageBreachWarningKPIFlashingTextColour) {
		this.awaitingTriageBreachWarningKPIFlashingTextColour = awaitingTriageBreachWarningKPIFlashingTextColour;
	}

	public ims.framework.utils.Color getAwaitingTriageBreachWarningKPIBackgroundColour() {
		return awaitingTriageBreachWarningKPIBackgroundColour;
	}
	public void setAwaitingTriageBreachWarningKPIBackgroundColour(ims.framework.utils.Color awaitingTriageBreachWarningKPIBackgroundColour) {
		this.awaitingTriageBreachWarningKPIBackgroundColour = awaitingTriageBreachWarningKPIBackgroundColour;
	}

	public Integer getAwaitingTriageBreachedKPI() {
		return awaitingTriageBreachedKPI;
	}
	public void setAwaitingTriageBreachedKPI(Integer awaitingTriageBreachedKPI) {
		this.awaitingTriageBreachedKPI = awaitingTriageBreachedKPI;
	}

	public ims.framework.utils.Color getAwaitingTriageBreachKPITextColour() {
		return awaitingTriageBreachKPITextColour;
	}
	public void setAwaitingTriageBreachKPITextColour(ims.framework.utils.Color awaitingTriageBreachKPITextColour) {
		this.awaitingTriageBreachKPITextColour = awaitingTriageBreachKPITextColour;
	}

	public ims.domain.lookups.LookupInstance getAwaitingTriageBreachKPIFlashingText() {
		return awaitingTriageBreachKPIFlashingText;
	}
	public void setAwaitingTriageBreachKPIFlashingText(ims.domain.lookups.LookupInstance awaitingTriageBreachKPIFlashingText) {
		this.awaitingTriageBreachKPIFlashingText = awaitingTriageBreachKPIFlashingText;
	}

	public ims.framework.utils.Color getAwaitingTriageBreachKPIFlashingTextColour() {
		return awaitingTriageBreachKPIFlashingTextColour;
	}
	public void setAwaitingTriageBreachKPIFlashingTextColour(ims.framework.utils.Color awaitingTriageBreachKPIFlashingTextColour) {
		this.awaitingTriageBreachKPIFlashingTextColour = awaitingTriageBreachKPIFlashingTextColour;
	}

	public ims.framework.utils.Color getAwaitingTriageBreachKPIBackgroundColour() {
		return awaitingTriageBreachKPIBackgroundColour;
	}
	public void setAwaitingTriageBreachKPIBackgroundColour(ims.framework.utils.Color awaitingTriageBreachKPIBackgroundColour) {
		this.awaitingTriageBreachKPIBackgroundColour = awaitingTriageBreachKPIBackgroundColour;
	}

	public java.util.List getTriagePriorityKPIs() {
		if ( null == triagePriorityKPIs ) {
			triagePriorityKPIs = new java.util.ArrayList();
		}
		return triagePriorityKPIs;
	}
	public void setTriagePriorityKPIs(java.util.List paramValue) {
		this.triagePriorityKPIs = paramValue;
	}

	public Integer getAwaitingClinicianBreachWarningKPI() {
		return awaitingClinicianBreachWarningKPI;
	}
	public void setAwaitingClinicianBreachWarningKPI(Integer awaitingClinicianBreachWarningKPI) {
		this.awaitingClinicianBreachWarningKPI = awaitingClinicianBreachWarningKPI;
	}

	public ims.framework.utils.Color getAwaitingClinicianBreachWarningKPITextColour() {
		return awaitingClinicianBreachWarningKPITextColour;
	}
	public void setAwaitingClinicianBreachWarningKPITextColour(ims.framework.utils.Color awaitingClinicianBreachWarningKPITextColour) {
		this.awaitingClinicianBreachWarningKPITextColour = awaitingClinicianBreachWarningKPITextColour;
	}

	public ims.domain.lookups.LookupInstance getAwaitingClinicianBreachWarningKPIFlashingText() {
		return awaitingClinicianBreachWarningKPIFlashingText;
	}
	public void setAwaitingClinicianBreachWarningKPIFlashingText(ims.domain.lookups.LookupInstance awaitingClinicianBreachWarningKPIFlashingText) {
		this.awaitingClinicianBreachWarningKPIFlashingText = awaitingClinicianBreachWarningKPIFlashingText;
	}

	public ims.framework.utils.Color getAwaitingClinicianBreachWarningKPIFlashingTextColour() {
		return awaitingClinicianBreachWarningKPIFlashingTextColour;
	}
	public void setAwaitingClinicianBreachWarningKPIFlashingTextColour(ims.framework.utils.Color awaitingClinicianBreachWarningKPIFlashingTextColour) {
		this.awaitingClinicianBreachWarningKPIFlashingTextColour = awaitingClinicianBreachWarningKPIFlashingTextColour;
	}

	public ims.framework.utils.Color getAwaitingClinicianBreachWarningKPIBackgroundColour() {
		return awaitingClinicianBreachWarningKPIBackgroundColour;
	}
	public void setAwaitingClinicianBreachWarningKPIBackgroundColour(ims.framework.utils.Color awaitingClinicianBreachWarningKPIBackgroundColour) {
		this.awaitingClinicianBreachWarningKPIBackgroundColour = awaitingClinicianBreachWarningKPIBackgroundColour;
	}

	public Integer getAwaitingClinicianBreachedKPI() {
		return awaitingClinicianBreachedKPI;
	}
	public void setAwaitingClinicianBreachedKPI(Integer awaitingClinicianBreachedKPI) {
		this.awaitingClinicianBreachedKPI = awaitingClinicianBreachedKPI;
	}

	public ims.framework.utils.Color getAwaitingClinicianBreachKPITextColour() {
		return awaitingClinicianBreachKPITextColour;
	}
	public void setAwaitingClinicianBreachKPITextColour(ims.framework.utils.Color awaitingClinicianBreachKPITextColour) {
		this.awaitingClinicianBreachKPITextColour = awaitingClinicianBreachKPITextColour;
	}

	public ims.domain.lookups.LookupInstance getAwaitingClinicianBreachKPIFlashingText() {
		return awaitingClinicianBreachKPIFlashingText;
	}
	public void setAwaitingClinicianBreachKPIFlashingText(ims.domain.lookups.LookupInstance awaitingClinicianBreachKPIFlashingText) {
		this.awaitingClinicianBreachKPIFlashingText = awaitingClinicianBreachKPIFlashingText;
	}

	public ims.framework.utils.Color getAwaitingClinicianBreachKPIFlashingTextColour() {
		return awaitingClinicianBreachKPIFlashingTextColour;
	}
	public void setAwaitingClinicianBreachKPIFlashingTextColour(ims.framework.utils.Color awaitingClinicianBreachKPIFlashingTextColour) {
		this.awaitingClinicianBreachKPIFlashingTextColour = awaitingClinicianBreachKPIFlashingTextColour;
	}

	public ims.framework.utils.Color getAwaitingClinicianBreachKPIBackgroundColour() {
		return awaitingClinicianBreachKPIBackgroundColour;
	}
	public void setAwaitingClinicianBreachKPIBackgroundColour(ims.framework.utils.Color awaitingClinicianBreachKPIBackgroundColour) {
		this.awaitingClinicianBreachKPIBackgroundColour = awaitingClinicianBreachKPIBackgroundColour;
	}

	public Integer getLosBreachWarningKPI() {
		return losBreachWarningKPI;
	}
	public void setLosBreachWarningKPI(Integer losBreachWarningKPI) {
		this.losBreachWarningKPI = losBreachWarningKPI;
	}

	public ims.framework.utils.Color getLosBreachWarningKPITextColour() {
		return losBreachWarningKPITextColour;
	}
	public void setLosBreachWarningKPITextColour(ims.framework.utils.Color losBreachWarningKPITextColour) {
		this.losBreachWarningKPITextColour = losBreachWarningKPITextColour;
	}

	public ims.domain.lookups.LookupInstance getLosBreachWarningKPIFlashingText() {
		return losBreachWarningKPIFlashingText;
	}
	public void setLosBreachWarningKPIFlashingText(ims.domain.lookups.LookupInstance losBreachWarningKPIFlashingText) {
		this.losBreachWarningKPIFlashingText = losBreachWarningKPIFlashingText;
	}

	public ims.framework.utils.Color getLosBreachWarningKPIFlashingTextColour() {
		return losBreachWarningKPIFlashingTextColour;
	}
	public void setLosBreachWarningKPIFlashingTextColour(ims.framework.utils.Color losBreachWarningKPIFlashingTextColour) {
		this.losBreachWarningKPIFlashingTextColour = losBreachWarningKPIFlashingTextColour;
	}

	public ims.framework.utils.Color getLosBreachWarningKPIBackgroundColour() {
		return losBreachWarningKPIBackgroundColour;
	}
	public void setLosBreachWarningKPIBackgroundColour(ims.framework.utils.Color losBreachWarningKPIBackgroundColour) {
		this.losBreachWarningKPIBackgroundColour = losBreachWarningKPIBackgroundColour;
	}

	public Integer getLosBreachedKPI() {
		return losBreachedKPI;
	}
	public void setLosBreachedKPI(Integer losBreachedKPI) {
		this.losBreachedKPI = losBreachedKPI;
	}

	public ims.framework.utils.Color getLosBreachKPITextColour() {
		return losBreachKPITextColour;
	}
	public void setLosBreachKPITextColour(ims.framework.utils.Color losBreachKPITextColour) {
		this.losBreachKPITextColour = losBreachKPITextColour;
	}

	public ims.domain.lookups.LookupInstance getLosBreachedKPIFlashingText() {
		return losBreachedKPIFlashingText;
	}
	public void setLosBreachedKPIFlashingText(ims.domain.lookups.LookupInstance losBreachedKPIFlashingText) {
		this.losBreachedKPIFlashingText = losBreachedKPIFlashingText;
	}

	public ims.framework.utils.Color getLosBreachedKPIFlashingTextColour() {
		return losBreachedKPIFlashingTextColour;
	}
	public void setLosBreachedKPIFlashingTextColour(ims.framework.utils.Color losBreachedKPIFlashingTextColour) {
		this.losBreachedKPIFlashingTextColour = losBreachedKPIFlashingTextColour;
	}

	public ims.framework.utils.Color getLosBreachedKPIBackgroundColour() {
		return losBreachedKPIBackgroundColour;
	}
	public void setLosBreachedKPIBackgroundColour(ims.framework.utils.Color losBreachedKPIBackgroundColour) {
		this.losBreachedKPIBackgroundColour = losBreachedKPIBackgroundColour;
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
		
		auditStr.append("\r\n*eDLocation* :");
		if (eDLocation != null)
		{
			auditStr.append(toShortClassName(eDLocation));
				
		    auditStr.append(eDLocation.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*awaitingTriageBreachWarningKPI* :");
		auditStr.append(awaitingTriageBreachWarningKPI);
	    auditStr.append("; ");
		auditStr.append("\r\n*awaitingTriageBreachWarningKPITextColour* :");
		auditStr.append(awaitingTriageBreachWarningKPITextColour);
	    auditStr.append("; ");
		auditStr.append("\r\n*awaitingTriageBreachWarningKPIFlashingText* :");
		if (awaitingTriageBreachWarningKPIFlashingText != null)
			auditStr.append(awaitingTriageBreachWarningKPIFlashingText.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*awaitingTriageBreachWarningKPIFlashingTextColour* :");
		auditStr.append(awaitingTriageBreachWarningKPIFlashingTextColour);
	    auditStr.append("; ");
		auditStr.append("\r\n*awaitingTriageBreachWarningKPIBackgroundColour* :");
		auditStr.append(awaitingTriageBreachWarningKPIBackgroundColour);
	    auditStr.append("; ");
		auditStr.append("\r\n*awaitingTriageBreachedKPI* :");
		auditStr.append(awaitingTriageBreachedKPI);
	    auditStr.append("; ");
		auditStr.append("\r\n*awaitingTriageBreachKPITextColour* :");
		auditStr.append(awaitingTriageBreachKPITextColour);
	    auditStr.append("; ");
		auditStr.append("\r\n*awaitingTriageBreachKPIFlashingText* :");
		if (awaitingTriageBreachKPIFlashingText != null)
			auditStr.append(awaitingTriageBreachKPIFlashingText.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*awaitingTriageBreachKPIFlashingTextColour* :");
		auditStr.append(awaitingTriageBreachKPIFlashingTextColour);
	    auditStr.append("; ");
		auditStr.append("\r\n*awaitingTriageBreachKPIBackgroundColour* :");
		auditStr.append(awaitingTriageBreachKPIBackgroundColour);
	    auditStr.append("; ");
		auditStr.append("\r\n*triagePriorityKPIs* :");
		if (triagePriorityKPIs != null)
		{
		int i12=0;
		for (i12=0; i12<triagePriorityKPIs.size(); i12++)
		{
			if (i12 > 0)
				auditStr.append(",");
			ims.emergency.configuration.domain.objects.TriagePriorityKPConfig obj = (ims.emergency.configuration.domain.objects.TriagePriorityKPConfig)triagePriorityKPIs.get(i12);
		    if (obj != null)
			{
				if (i12 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i12 > 0)
			auditStr.append("] " + i12);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*awaitingClinicianBreachWarningKPI* :");
		auditStr.append(awaitingClinicianBreachWarningKPI);
	    auditStr.append("; ");
		auditStr.append("\r\n*awaitingClinicianBreachWarningKPITextColour* :");
		auditStr.append(awaitingClinicianBreachWarningKPITextColour);
	    auditStr.append("; ");
		auditStr.append("\r\n*awaitingClinicianBreachWarningKPIFlashingText* :");
		if (awaitingClinicianBreachWarningKPIFlashingText != null)
			auditStr.append(awaitingClinicianBreachWarningKPIFlashingText.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*awaitingClinicianBreachWarningKPIFlashingTextColour* :");
		auditStr.append(awaitingClinicianBreachWarningKPIFlashingTextColour);
	    auditStr.append("; ");
		auditStr.append("\r\n*awaitingClinicianBreachWarningKPIBackgroundColour* :");
		auditStr.append(awaitingClinicianBreachWarningKPIBackgroundColour);
	    auditStr.append("; ");
		auditStr.append("\r\n*awaitingClinicianBreachedKPI* :");
		auditStr.append(awaitingClinicianBreachedKPI);
	    auditStr.append("; ");
		auditStr.append("\r\n*awaitingClinicianBreachKPITextColour* :");
		auditStr.append(awaitingClinicianBreachKPITextColour);
	    auditStr.append("; ");
		auditStr.append("\r\n*awaitingClinicianBreachKPIFlashingText* :");
		if (awaitingClinicianBreachKPIFlashingText != null)
			auditStr.append(awaitingClinicianBreachKPIFlashingText.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*awaitingClinicianBreachKPIFlashingTextColour* :");
		auditStr.append(awaitingClinicianBreachKPIFlashingTextColour);
	    auditStr.append("; ");
		auditStr.append("\r\n*awaitingClinicianBreachKPIBackgroundColour* :");
		auditStr.append(awaitingClinicianBreachKPIBackgroundColour);
	    auditStr.append("; ");
		auditStr.append("\r\n*losBreachWarningKPI* :");
		auditStr.append(losBreachWarningKPI);
	    auditStr.append("; ");
		auditStr.append("\r\n*losBreachWarningKPITextColour* :");
		auditStr.append(losBreachWarningKPITextColour);
	    auditStr.append("; ");
		auditStr.append("\r\n*losBreachWarningKPIFlashingText* :");
		if (losBreachWarningKPIFlashingText != null)
			auditStr.append(losBreachWarningKPIFlashingText.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*losBreachWarningKPIFlashingTextColour* :");
		auditStr.append(losBreachWarningKPIFlashingTextColour);
	    auditStr.append("; ");
		auditStr.append("\r\n*losBreachWarningKPIBackgroundColour* :");
		auditStr.append(losBreachWarningKPIBackgroundColour);
	    auditStr.append("; ");
		auditStr.append("\r\n*losBreachedKPI* :");
		auditStr.append(losBreachedKPI);
	    auditStr.append("; ");
		auditStr.append("\r\n*losBreachKPITextColour* :");
		auditStr.append(losBreachKPITextColour);
	    auditStr.append("; ");
		auditStr.append("\r\n*losBreachedKPIFlashingText* :");
		if (losBreachedKPIFlashingText != null)
			auditStr.append(losBreachedKPIFlashingText.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*losBreachedKPIFlashingTextColour* :");
		auditStr.append(losBreachedKPIFlashingTextColour);
	    auditStr.append("; ");
		auditStr.append("\r\n*losBreachedKPIBackgroundColour* :");
		auditStr.append(losBreachedKPIBackgroundColour);
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
		
		String keyClassName = "AttendanceKPIConfig";
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
		if (this.getEDLocation() != null)
		{
			sb.append("<eDLocation>");
			sb.append(this.getEDLocation().toXMLString(domMap)); 	
			sb.append("</eDLocation>");		
		}
		if (this.getAwaitingTriageBreachWarningKPI() != null)
		{
			sb.append("<awaitingTriageBreachWarningKPI>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAwaitingTriageBreachWarningKPI().toString()));
			sb.append("</awaitingTriageBreachWarningKPI>");		
		}
		if (this.getAwaitingTriageBreachWarningKPITextColour() != null)
		{
			sb.append("<awaitingTriageBreachWarningKPITextColour>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAwaitingTriageBreachWarningKPITextColour().toString()));
			sb.append("</awaitingTriageBreachWarningKPITextColour>");		
		}
		if (this.getAwaitingTriageBreachWarningKPIFlashingText() != null)
		{
			sb.append("<awaitingTriageBreachWarningKPIFlashingText>");
			sb.append(this.getAwaitingTriageBreachWarningKPIFlashingText().toXMLString()); 
			sb.append("</awaitingTriageBreachWarningKPIFlashingText>");		
		}
		if (this.getAwaitingTriageBreachWarningKPIFlashingTextColour() != null)
		{
			sb.append("<awaitingTriageBreachWarningKPIFlashingTextColour>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAwaitingTriageBreachWarningKPIFlashingTextColour().toString()));
			sb.append("</awaitingTriageBreachWarningKPIFlashingTextColour>");		
		}
		if (this.getAwaitingTriageBreachWarningKPIBackgroundColour() != null)
		{
			sb.append("<awaitingTriageBreachWarningKPIBackgroundColour>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAwaitingTriageBreachWarningKPIBackgroundColour().toString()));
			sb.append("</awaitingTriageBreachWarningKPIBackgroundColour>");		
		}
		if (this.getAwaitingTriageBreachedKPI() != null)
		{
			sb.append("<awaitingTriageBreachedKPI>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAwaitingTriageBreachedKPI().toString()));
			sb.append("</awaitingTriageBreachedKPI>");		
		}
		if (this.getAwaitingTriageBreachKPITextColour() != null)
		{
			sb.append("<awaitingTriageBreachKPITextColour>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAwaitingTriageBreachKPITextColour().toString()));
			sb.append("</awaitingTriageBreachKPITextColour>");		
		}
		if (this.getAwaitingTriageBreachKPIFlashingText() != null)
		{
			sb.append("<awaitingTriageBreachKPIFlashingText>");
			sb.append(this.getAwaitingTriageBreachKPIFlashingText().toXMLString()); 
			sb.append("</awaitingTriageBreachKPIFlashingText>");		
		}
		if (this.getAwaitingTriageBreachKPIFlashingTextColour() != null)
		{
			sb.append("<awaitingTriageBreachKPIFlashingTextColour>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAwaitingTriageBreachKPIFlashingTextColour().toString()));
			sb.append("</awaitingTriageBreachKPIFlashingTextColour>");		
		}
		if (this.getAwaitingTriageBreachKPIBackgroundColour() != null)
		{
			sb.append("<awaitingTriageBreachKPIBackgroundColour>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAwaitingTriageBreachKPIBackgroundColour().toString()));
			sb.append("</awaitingTriageBreachKPIBackgroundColour>");		
		}
		if (this.getTriagePriorityKPIs() != null)
		{
			if (this.getTriagePriorityKPIs().size() > 0 )
			{
			sb.append("<triagePriorityKPIs>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getTriagePriorityKPIs(), domMap));
			sb.append("</triagePriorityKPIs>");		
			}
		}
		if (this.getAwaitingClinicianBreachWarningKPI() != null)
		{
			sb.append("<awaitingClinicianBreachWarningKPI>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAwaitingClinicianBreachWarningKPI().toString()));
			sb.append("</awaitingClinicianBreachWarningKPI>");		
		}
		if (this.getAwaitingClinicianBreachWarningKPITextColour() != null)
		{
			sb.append("<awaitingClinicianBreachWarningKPITextColour>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAwaitingClinicianBreachWarningKPITextColour().toString()));
			sb.append("</awaitingClinicianBreachWarningKPITextColour>");		
		}
		if (this.getAwaitingClinicianBreachWarningKPIFlashingText() != null)
		{
			sb.append("<awaitingClinicianBreachWarningKPIFlashingText>");
			sb.append(this.getAwaitingClinicianBreachWarningKPIFlashingText().toXMLString()); 
			sb.append("</awaitingClinicianBreachWarningKPIFlashingText>");		
		}
		if (this.getAwaitingClinicianBreachWarningKPIFlashingTextColour() != null)
		{
			sb.append("<awaitingClinicianBreachWarningKPIFlashingTextColour>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAwaitingClinicianBreachWarningKPIFlashingTextColour().toString()));
			sb.append("</awaitingClinicianBreachWarningKPIFlashingTextColour>");		
		}
		if (this.getAwaitingClinicianBreachWarningKPIBackgroundColour() != null)
		{
			sb.append("<awaitingClinicianBreachWarningKPIBackgroundColour>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAwaitingClinicianBreachWarningKPIBackgroundColour().toString()));
			sb.append("</awaitingClinicianBreachWarningKPIBackgroundColour>");		
		}
		if (this.getAwaitingClinicianBreachedKPI() != null)
		{
			sb.append("<awaitingClinicianBreachedKPI>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAwaitingClinicianBreachedKPI().toString()));
			sb.append("</awaitingClinicianBreachedKPI>");		
		}
		if (this.getAwaitingClinicianBreachKPITextColour() != null)
		{
			sb.append("<awaitingClinicianBreachKPITextColour>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAwaitingClinicianBreachKPITextColour().toString()));
			sb.append("</awaitingClinicianBreachKPITextColour>");		
		}
		if (this.getAwaitingClinicianBreachKPIFlashingText() != null)
		{
			sb.append("<awaitingClinicianBreachKPIFlashingText>");
			sb.append(this.getAwaitingClinicianBreachKPIFlashingText().toXMLString()); 
			sb.append("</awaitingClinicianBreachKPIFlashingText>");		
		}
		if (this.getAwaitingClinicianBreachKPIFlashingTextColour() != null)
		{
			sb.append("<awaitingClinicianBreachKPIFlashingTextColour>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAwaitingClinicianBreachKPIFlashingTextColour().toString()));
			sb.append("</awaitingClinicianBreachKPIFlashingTextColour>");		
		}
		if (this.getAwaitingClinicianBreachKPIBackgroundColour() != null)
		{
			sb.append("<awaitingClinicianBreachKPIBackgroundColour>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAwaitingClinicianBreachKPIBackgroundColour().toString()));
			sb.append("</awaitingClinicianBreachKPIBackgroundColour>");		
		}
		if (this.getLosBreachWarningKPI() != null)
		{
			sb.append("<losBreachWarningKPI>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLosBreachWarningKPI().toString()));
			sb.append("</losBreachWarningKPI>");		
		}
		if (this.getLosBreachWarningKPITextColour() != null)
		{
			sb.append("<losBreachWarningKPITextColour>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLosBreachWarningKPITextColour().toString()));
			sb.append("</losBreachWarningKPITextColour>");		
		}
		if (this.getLosBreachWarningKPIFlashingText() != null)
		{
			sb.append("<losBreachWarningKPIFlashingText>");
			sb.append(this.getLosBreachWarningKPIFlashingText().toXMLString()); 
			sb.append("</losBreachWarningKPIFlashingText>");		
		}
		if (this.getLosBreachWarningKPIFlashingTextColour() != null)
		{
			sb.append("<losBreachWarningKPIFlashingTextColour>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLosBreachWarningKPIFlashingTextColour().toString()));
			sb.append("</losBreachWarningKPIFlashingTextColour>");		
		}
		if (this.getLosBreachWarningKPIBackgroundColour() != null)
		{
			sb.append("<losBreachWarningKPIBackgroundColour>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLosBreachWarningKPIBackgroundColour().toString()));
			sb.append("</losBreachWarningKPIBackgroundColour>");		
		}
		if (this.getLosBreachedKPI() != null)
		{
			sb.append("<losBreachedKPI>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLosBreachedKPI().toString()));
			sb.append("</losBreachedKPI>");		
		}
		if (this.getLosBreachKPITextColour() != null)
		{
			sb.append("<losBreachKPITextColour>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLosBreachKPITextColour().toString()));
			sb.append("</losBreachKPITextColour>");		
		}
		if (this.getLosBreachedKPIFlashingText() != null)
		{
			sb.append("<losBreachedKPIFlashingText>");
			sb.append(this.getLosBreachedKPIFlashingText().toXMLString()); 
			sb.append("</losBreachedKPIFlashingText>");		
		}
		if (this.getLosBreachedKPIFlashingTextColour() != null)
		{
			sb.append("<losBreachedKPIFlashingTextColour>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLosBreachedKPIFlashingTextColour().toString()));
			sb.append("</losBreachedKPIFlashingTextColour>");		
		}
		if (this.getLosBreachedKPIBackgroundColour() != null)
		{
			sb.append("<losBreachedKPIBackgroundColour>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getLosBreachedKPIBackgroundColour().toString()));
			sb.append("</losBreachedKPIBackgroundColour>");		
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
			AttendanceKPIConfig domainObject = getAttendanceKPIConfigfromXML(itemEl, factory, domMap);

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
			AttendanceKPIConfig domainObject = getAttendanceKPIConfigfromXML(itemEl, factory, domMap);

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
		
	public static AttendanceKPIConfig getAttendanceKPIConfigfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getAttendanceKPIConfigfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static AttendanceKPIConfig getAttendanceKPIConfigfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!AttendanceKPIConfig.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!AttendanceKPIConfig.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the AttendanceKPIConfig class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (AttendanceKPIConfig)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(AttendanceKPIConfig.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		AttendanceKPIConfig ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (AttendanceKPIConfig)factory.getImportedDomainObject(AttendanceKPIConfig.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new AttendanceKPIConfig();
		}
		String keyClassName = "AttendanceKPIConfig";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (AttendanceKPIConfig)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, AttendanceKPIConfig obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("eDLocation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setEDLocation(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("awaitingTriageBreachWarningKPI");
		if(fldEl != null)
		{	
    		obj.setAwaitingTriageBreachWarningKPI(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("awaitingTriageBreachWarningKPITextColour");
		if(fldEl != null)
		{	
    		obj.setAwaitingTriageBreachWarningKPITextColour(ims.framework.utils.Color.getColor(fldEl.getTextTrim()));		
		}
		fldEl = el.element("awaitingTriageBreachWarningKPIFlashingText");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAwaitingTriageBreachWarningKPIFlashingText(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("awaitingTriageBreachWarningKPIFlashingTextColour");
		if(fldEl != null)
		{	
    		obj.setAwaitingTriageBreachWarningKPIFlashingTextColour(ims.framework.utils.Color.getColor(fldEl.getTextTrim()));		
		}
		fldEl = el.element("awaitingTriageBreachWarningKPIBackgroundColour");
		if(fldEl != null)
		{	
    		obj.setAwaitingTriageBreachWarningKPIBackgroundColour(ims.framework.utils.Color.getColor(fldEl.getTextTrim()));		
		}
		fldEl = el.element("awaitingTriageBreachedKPI");
		if(fldEl != null)
		{	
    		obj.setAwaitingTriageBreachedKPI(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("awaitingTriageBreachKPITextColour");
		if(fldEl != null)
		{	
    		obj.setAwaitingTriageBreachKPITextColour(ims.framework.utils.Color.getColor(fldEl.getTextTrim()));		
		}
		fldEl = el.element("awaitingTriageBreachKPIFlashingText");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAwaitingTriageBreachKPIFlashingText(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("awaitingTriageBreachKPIFlashingTextColour");
		if(fldEl != null)
		{	
    		obj.setAwaitingTriageBreachKPIFlashingTextColour(ims.framework.utils.Color.getColor(fldEl.getTextTrim()));		
		}
		fldEl = el.element("awaitingTriageBreachKPIBackgroundColour");
		if(fldEl != null)
		{	
    		obj.setAwaitingTriageBreachKPIBackgroundColour(ims.framework.utils.Color.getColor(fldEl.getTextTrim()));		
		}
		fldEl = el.element("triagePriorityKPIs");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setTriagePriorityKPIs(ims.emergency.configuration.domain.objects.TriagePriorityKPConfig.fromListXMLString(fldEl, factory, obj.getTriagePriorityKPIs(), domMap));
		}
		fldEl = el.element("awaitingClinicianBreachWarningKPI");
		if(fldEl != null)
		{	
    		obj.setAwaitingClinicianBreachWarningKPI(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("awaitingClinicianBreachWarningKPITextColour");
		if(fldEl != null)
		{	
    		obj.setAwaitingClinicianBreachWarningKPITextColour(ims.framework.utils.Color.getColor(fldEl.getTextTrim()));		
		}
		fldEl = el.element("awaitingClinicianBreachWarningKPIFlashingText");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAwaitingClinicianBreachWarningKPIFlashingText(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("awaitingClinicianBreachWarningKPIFlashingTextColour");
		if(fldEl != null)
		{	
    		obj.setAwaitingClinicianBreachWarningKPIFlashingTextColour(ims.framework.utils.Color.getColor(fldEl.getTextTrim()));		
		}
		fldEl = el.element("awaitingClinicianBreachWarningKPIBackgroundColour");
		if(fldEl != null)
		{	
    		obj.setAwaitingClinicianBreachWarningKPIBackgroundColour(ims.framework.utils.Color.getColor(fldEl.getTextTrim()));		
		}
		fldEl = el.element("awaitingClinicianBreachedKPI");
		if(fldEl != null)
		{	
    		obj.setAwaitingClinicianBreachedKPI(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("awaitingClinicianBreachKPITextColour");
		if(fldEl != null)
		{	
    		obj.setAwaitingClinicianBreachKPITextColour(ims.framework.utils.Color.getColor(fldEl.getTextTrim()));		
		}
		fldEl = el.element("awaitingClinicianBreachKPIFlashingText");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAwaitingClinicianBreachKPIFlashingText(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("awaitingClinicianBreachKPIFlashingTextColour");
		if(fldEl != null)
		{	
    		obj.setAwaitingClinicianBreachKPIFlashingTextColour(ims.framework.utils.Color.getColor(fldEl.getTextTrim()));		
		}
		fldEl = el.element("awaitingClinicianBreachKPIBackgroundColour");
		if(fldEl != null)
		{	
    		obj.setAwaitingClinicianBreachKPIBackgroundColour(ims.framework.utils.Color.getColor(fldEl.getTextTrim()));		
		}
		fldEl = el.element("losBreachWarningKPI");
		if(fldEl != null)
		{	
    		obj.setLosBreachWarningKPI(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("losBreachWarningKPITextColour");
		if(fldEl != null)
		{	
    		obj.setLosBreachWarningKPITextColour(ims.framework.utils.Color.getColor(fldEl.getTextTrim()));		
		}
		fldEl = el.element("losBreachWarningKPIFlashingText");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setLosBreachWarningKPIFlashingText(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("losBreachWarningKPIFlashingTextColour");
		if(fldEl != null)
		{	
    		obj.setLosBreachWarningKPIFlashingTextColour(ims.framework.utils.Color.getColor(fldEl.getTextTrim()));		
		}
		fldEl = el.element("losBreachWarningKPIBackgroundColour");
		if(fldEl != null)
		{	
    		obj.setLosBreachWarningKPIBackgroundColour(ims.framework.utils.Color.getColor(fldEl.getTextTrim()));		
		}
		fldEl = el.element("losBreachedKPI");
		if(fldEl != null)
		{	
    		obj.setLosBreachedKPI(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("losBreachKPITextColour");
		if(fldEl != null)
		{	
    		obj.setLosBreachKPITextColour(ims.framework.utils.Color.getColor(fldEl.getTextTrim()));		
		}
		fldEl = el.element("losBreachedKPIFlashingText");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setLosBreachedKPIFlashingText(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("losBreachedKPIFlashingTextColour");
		if(fldEl != null)
		{	
    		obj.setLosBreachedKPIFlashingTextColour(ims.framework.utils.Color.getColor(fldEl.getTextTrim()));		
		}
		fldEl = el.element("losBreachedKPIBackgroundColour");
		if(fldEl != null)
		{	
    		obj.setLosBreachedKPIBackgroundColour(ims.framework.utils.Color.getColor(fldEl.getTextTrim()));		
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "triagePriorityKPIs"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String EDLocation = "eDLocation";
		public static final String AwaitingTriageBreachWarningKPI = "awaitingTriageBreachWarningKPI";
		public static final String AwaitingTriageBreachWarningKPITextColour = "awaitingTriageBreachWarningKPITextColour";
		public static final String AwaitingTriageBreachWarningKPIFlashingText = "awaitingTriageBreachWarningKPIFlashingText";
		public static final String AwaitingTriageBreachWarningKPIFlashingTextColour = "awaitingTriageBreachWarningKPIFlashingTextColour";
		public static final String AwaitingTriageBreachWarningKPIBackgroundColour = "awaitingTriageBreachWarningKPIBackgroundColour";
		public static final String AwaitingTriageBreachedKPI = "awaitingTriageBreachedKPI";
		public static final String AwaitingTriageBreachKPITextColour = "awaitingTriageBreachKPITextColour";
		public static final String AwaitingTriageBreachKPIFlashingText = "awaitingTriageBreachKPIFlashingText";
		public static final String AwaitingTriageBreachKPIFlashingTextColour = "awaitingTriageBreachKPIFlashingTextColour";
		public static final String AwaitingTriageBreachKPIBackgroundColour = "awaitingTriageBreachKPIBackgroundColour";
		public static final String TriagePriorityKPIs = "triagePriorityKPIs";
		public static final String AwaitingClinicianBreachWarningKPI = "awaitingClinicianBreachWarningKPI";
		public static final String AwaitingClinicianBreachWarningKPITextColour = "awaitingClinicianBreachWarningKPITextColour";
		public static final String AwaitingClinicianBreachWarningKPIFlashingText = "awaitingClinicianBreachWarningKPIFlashingText";
		public static final String AwaitingClinicianBreachWarningKPIFlashingTextColour = "awaitingClinicianBreachWarningKPIFlashingTextColour";
		public static final String AwaitingClinicianBreachWarningKPIBackgroundColour = "awaitingClinicianBreachWarningKPIBackgroundColour";
		public static final String AwaitingClinicianBreachedKPI = "awaitingClinicianBreachedKPI";
		public static final String AwaitingClinicianBreachKPITextColour = "awaitingClinicianBreachKPITextColour";
		public static final String AwaitingClinicianBreachKPIFlashingText = "awaitingClinicianBreachKPIFlashingText";
		public static final String AwaitingClinicianBreachKPIFlashingTextColour = "awaitingClinicianBreachKPIFlashingTextColour";
		public static final String AwaitingClinicianBreachKPIBackgroundColour = "awaitingClinicianBreachKPIBackgroundColour";
		public static final String LosBreachWarningKPI = "losBreachWarningKPI";
		public static final String LosBreachWarningKPITextColour = "losBreachWarningKPITextColour";
		public static final String LosBreachWarningKPIFlashingText = "losBreachWarningKPIFlashingText";
		public static final String LosBreachWarningKPIFlashingTextColour = "losBreachWarningKPIFlashingTextColour";
		public static final String LosBreachWarningKPIBackgroundColour = "losBreachWarningKPIBackgroundColour";
		public static final String LosBreachedKPI = "losBreachedKPI";
		public static final String LosBreachKPITextColour = "losBreachKPITextColour";
		public static final String LosBreachedKPIFlashingText = "losBreachedKPIFlashingText";
		public static final String LosBreachedKPIFlashingTextColour = "losBreachedKPIFlashingTextColour";
		public static final String LosBreachedKPIBackgroundColour = "losBreachedKPIBackgroundColour";
	}
}

