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
package ims.oncology.domain.objects;

/**
 * 
 * @author Sean Nesbitt
 * Generated.
 */


public class PatAction extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1105100038;
	private static final long serialVersionUID = 1105100038L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private java.util.Date bookedDate;
	private String bookedTime;
	private ims.dto_move.domain.objects.ActivityAction action;
	/** Appointmetn Header Id updated by BR */
	private Integer apptHeadId;
	/** 
	  * Collection of ims.oncology.domain.objects.PatTreatmentPlanDose.
	  */
	private java.util.List dose;
	/** Appointment Id in Booking */
	private Integer apptId;
	/** pretreatment plan */
	private ims.oncology.domain.objects.PreTreatmentPlan pretreatmentPlan;
	/** Action Status Reason */
	private ims.domain.lookups.LookupInstance status;
	private ims.dto_move.domain.objects.ActivityGroup activityGroup;
	private ims.dto_move.domain.objects.SchedActivity activity;
	private ims.domain.lookups.LookupInstance priority;
	/** Treatment site / technigue
	  * Collection of ims.oncology.domain.objects.PatTreatmentPlanGroupSiteTech.
	  */
	private java.util.List groupSiteTech;
	private ims.domain.lookups.LookupInstance patientStatus;
	private ims.domain.lookups.LookupInstance attendingAs;
	private ims.domain.lookups.LookupInstance transport;
	private ims.domain.lookups.LookupInstance reason;
	private ims.domain.lookups.LookupInstance category;
	private ims.domain.lookups.LookupInstance unit;
	private ims.domain.lookups.LookupInstance modality;
	private ims.domain.lookups.LookupInstance aneasthetic;
	private ims.domain.lookups.LookupInstance plannedRegime;
	private ims.core.resource.people.domain.objects.Hcp treatingConsultant;
	private Boolean active;
	private java.util.Date estartDate;
	private java.util.Date eendDate;
	private java.util.Date actionStatusDate;
	/** Y/N */
	private String waitingList;
	private String modalEnergy;
	private java.util.Date imagingDate;
	private java.util.Date startDateRegime;
	/** action order number */
	private Integer action_OrderNumber;
	/** if TreatmentActionMandatory ACTION_ID = -101 */
	private String treatmenAction;
	private java.util.Date lastAppointmentDate;
	private java.util.Date appDate;
	/** Chemotherapy Planned Start Date */
	private java.util.Date chemPlanStartDate;
	private Integer oPAClinic;
	private java.util.Date oPADate;
	/** OPA Time - updated via PAWS interface */
	private String oPATime;
	/** Waiting List Id for Action */
	private Integer wLId;
	/** Scheduled Appointment Date */
	private java.util.Date schedAppDate;
	/** Schedule appointment TIme */
	private String schedAppTIme;
	/** treatment action linked to */
	private Integer treatmentaction;
	/** action status history
	  * Collection of ims.oncology.domain.objects.PatActionStatusPoint.
	  */
	private java.util.List actionStatusPoint;
	/** Teletherapy Dose */
	private Integer tl_dose;
	/** Teletherapy Fractions */
	private Integer tl_fractions;
	/** Teletherapy Duration */
	private Integer tl_duration;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PatAction (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PatAction ()
    {
    	super();
    }
    public PatAction (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.oncology.domain.objects.PatAction.class;
	}


	public java.util.Date getBookedDate() {
		return bookedDate;
	}
	public void setBookedDate(java.util.Date bookedDate) {
		this.bookedDate = bookedDate;
	}

	public String getBookedTime() {
		return bookedTime;
	}
	public void setBookedTime(String bookedTime) {
		this.bookedTime = bookedTime;
	}

	public ims.dto_move.domain.objects.ActivityAction getAction() {
		return action;
	}
	public void setAction(ims.dto_move.domain.objects.ActivityAction action) {
		this.action = action;
	}

	public Integer getApptHeadId() {
		return apptHeadId;
	}
	public void setApptHeadId(Integer apptHeadId) {
		this.apptHeadId = apptHeadId;
	}

	public java.util.List getDose() {
		if ( null == dose ) {
			dose = new java.util.ArrayList();
		}
		return dose;
	}
	public void setDose(java.util.List paramValue) {
		this.dose = paramValue;
	}

	public Integer getApptId() {
		return apptId;
	}
	public void setApptId(Integer apptId) {
		this.apptId = apptId;
	}

	public ims.oncology.domain.objects.PreTreatmentPlan getPretreatmentPlan() {
		return pretreatmentPlan;
	}
	public void setPretreatmentPlan(ims.oncology.domain.objects.PreTreatmentPlan pretreatmentPlan) {
		this.pretreatmentPlan = pretreatmentPlan;
	}

	public ims.domain.lookups.LookupInstance getStatus() {
		return status;
	}
	public void setStatus(ims.domain.lookups.LookupInstance status) {
		this.status = status;
	}

	public ims.dto_move.domain.objects.ActivityGroup getActivityGroup() {
		return activityGroup;
	}
	public void setActivityGroup(ims.dto_move.domain.objects.ActivityGroup activityGroup) {
		this.activityGroup = activityGroup;
	}

	public ims.dto_move.domain.objects.SchedActivity getActivity() {
		return activity;
	}
	public void setActivity(ims.dto_move.domain.objects.SchedActivity activity) {
		this.activity = activity;
	}

	public ims.domain.lookups.LookupInstance getPriority() {
		return priority;
	}
	public void setPriority(ims.domain.lookups.LookupInstance priority) {
		this.priority = priority;
	}

	public java.util.List getGroupSiteTech() {
		if ( null == groupSiteTech ) {
			groupSiteTech = new java.util.ArrayList();
		}
		return groupSiteTech;
	}
	public void setGroupSiteTech(java.util.List paramValue) {
		this.groupSiteTech = paramValue;
	}

	public ims.domain.lookups.LookupInstance getPatientStatus() {
		return patientStatus;
	}
	public void setPatientStatus(ims.domain.lookups.LookupInstance patientStatus) {
		this.patientStatus = patientStatus;
	}

	public ims.domain.lookups.LookupInstance getAttendingAs() {
		return attendingAs;
	}
	public void setAttendingAs(ims.domain.lookups.LookupInstance attendingAs) {
		this.attendingAs = attendingAs;
	}

	public ims.domain.lookups.LookupInstance getTransport() {
		return transport;
	}
	public void setTransport(ims.domain.lookups.LookupInstance transport) {
		this.transport = transport;
	}

	public ims.domain.lookups.LookupInstance getReason() {
		return reason;
	}
	public void setReason(ims.domain.lookups.LookupInstance reason) {
		this.reason = reason;
	}

	public ims.domain.lookups.LookupInstance getCategory() {
		return category;
	}
	public void setCategory(ims.domain.lookups.LookupInstance category) {
		this.category = category;
	}

	public ims.domain.lookups.LookupInstance getUnit() {
		return unit;
	}
	public void setUnit(ims.domain.lookups.LookupInstance unit) {
		this.unit = unit;
	}

	public ims.domain.lookups.LookupInstance getModality() {
		return modality;
	}
	public void setModality(ims.domain.lookups.LookupInstance modality) {
		this.modality = modality;
	}

	public ims.domain.lookups.LookupInstance getAneasthetic() {
		return aneasthetic;
	}
	public void setAneasthetic(ims.domain.lookups.LookupInstance aneasthetic) {
		this.aneasthetic = aneasthetic;
	}

	public ims.domain.lookups.LookupInstance getPlannedRegime() {
		return plannedRegime;
	}
	public void setPlannedRegime(ims.domain.lookups.LookupInstance plannedRegime) {
		this.plannedRegime = plannedRegime;
	}

	public ims.core.resource.people.domain.objects.Hcp getTreatingConsultant() {
		return treatingConsultant;
	}
	public void setTreatingConsultant(ims.core.resource.people.domain.objects.Hcp treatingConsultant) {
		this.treatingConsultant = treatingConsultant;
	}

	public Boolean isActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}

	public java.util.Date getEstartDate() {
		return estartDate;
	}
	public void setEstartDate(java.util.Date estartDate) {
		this.estartDate = estartDate;
	}

	public java.util.Date getEendDate() {
		return eendDate;
	}
	public void setEendDate(java.util.Date eendDate) {
		this.eendDate = eendDate;
	}

	public java.util.Date getActionStatusDate() {
		return actionStatusDate;
	}
	public void setActionStatusDate(java.util.Date actionStatusDate) {
		this.actionStatusDate = actionStatusDate;
	}

	public String getWaitingList() {
		return waitingList;
	}
	public void setWaitingList(String waitingList) {
		if ( null != waitingList && waitingList.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for waitingList. Tried to set value: "+
				waitingList);
		}
		this.waitingList = waitingList;
	}

	public String getModalEnergy() {
		return modalEnergy;
	}
	public void setModalEnergy(String modalEnergy) {
		if ( null != modalEnergy && modalEnergy.length() > 10 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for modalEnergy. Tried to set value: "+
				modalEnergy);
		}
		this.modalEnergy = modalEnergy;
	}

	public java.util.Date getImagingDate() {
		return imagingDate;
	}
	public void setImagingDate(java.util.Date imagingDate) {
		this.imagingDate = imagingDate;
	}

	public java.util.Date getStartDateRegime() {
		return startDateRegime;
	}
	public void setStartDateRegime(java.util.Date startDateRegime) {
		this.startDateRegime = startDateRegime;
	}

	public Integer getAction_OrderNumber() {
		return action_OrderNumber;
	}
	public void setAction_OrderNumber(Integer action_OrderNumber) {
		this.action_OrderNumber = action_OrderNumber;
	}

	public String getTreatmenAction() {
		return treatmenAction;
	}
	public void setTreatmenAction(String treatmenAction) {
		if ( null != treatmenAction && treatmenAction.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for treatmenAction. Tried to set value: "+
				treatmenAction);
		}
		this.treatmenAction = treatmenAction;
	}

	public java.util.Date getLastAppointmentDate() {
		return lastAppointmentDate;
	}
	public void setLastAppointmentDate(java.util.Date lastAppointmentDate) {
		this.lastAppointmentDate = lastAppointmentDate;
	}

	public java.util.Date getAppDate() {
		return appDate;
	}
	public void setAppDate(java.util.Date appDate) {
		this.appDate = appDate;
	}

	public java.util.Date getChemPlanStartDate() {
		return chemPlanStartDate;
	}
	public void setChemPlanStartDate(java.util.Date chemPlanStartDate) {
		this.chemPlanStartDate = chemPlanStartDate;
	}

	public Integer getOPAClinic() {
		return oPAClinic;
	}
	public void setOPAClinic(Integer oPAClinic) {
		this.oPAClinic = oPAClinic;
	}

	public java.util.Date getOPADate() {
		return oPADate;
	}
	public void setOPADate(java.util.Date oPADate) {
		this.oPADate = oPADate;
	}

	public String getOPATime() {
		return oPATime;
	}
	public void setOPATime(String oPATime) {
		this.oPATime = oPATime;
	}

	public Integer getWLId() {
		return wLId;
	}
	public void setWLId(Integer wLId) {
		this.wLId = wLId;
	}

	public java.util.Date getSchedAppDate() {
		return schedAppDate;
	}
	public void setSchedAppDate(java.util.Date schedAppDate) {
		this.schedAppDate = schedAppDate;
	}

	public String getSchedAppTIme() {
		return schedAppTIme;
	}
	public void setSchedAppTIme(String schedAppTIme) {
		this.schedAppTIme = schedAppTIme;
	}

	public Integer getTreatmentaction() {
		return treatmentaction;
	}
	public void setTreatmentaction(Integer treatmentaction) {
		this.treatmentaction = treatmentaction;
	}

	public java.util.List getActionStatusPoint() {
		if ( null == actionStatusPoint ) {
			actionStatusPoint = new java.util.ArrayList();
		}
		return actionStatusPoint;
	}
	public void setActionStatusPoint(java.util.List paramValue) {
		this.actionStatusPoint = paramValue;
	}

	public Integer getTl_dose() {
		return tl_dose;
	}
	public void setTl_dose(Integer tl_dose) {
		this.tl_dose = tl_dose;
	}

	public Integer getTl_fractions() {
		return tl_fractions;
	}
	public void setTl_fractions(Integer tl_fractions) {
		this.tl_fractions = tl_fractions;
	}

	public Integer getTl_duration() {
		return tl_duration;
	}
	public void setTl_duration(Integer tl_duration) {
		this.tl_duration = tl_duration;
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
		
		auditStr.append("\r\n*bookedDate* :");
		auditStr.append(bookedDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*bookedTime* :");
		auditStr.append(bookedTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*action* :");
		if (action != null)
		{
			auditStr.append(toShortClassName(action));
				
		    auditStr.append(action.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*apptHeadId* :");
		auditStr.append(apptHeadId);
	    auditStr.append("; ");
		auditStr.append("\r\n*dose* :");
		if (dose != null)
		{
		int i5=0;
		for (i5=0; i5<dose.size(); i5++)
		{
			if (i5 > 0)
				auditStr.append(",");
			ims.oncology.domain.objects.PatTreatmentPlanDose obj = (ims.oncology.domain.objects.PatTreatmentPlanDose)dose.get(i5);
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
		auditStr.append("\r\n*apptId* :");
		auditStr.append(apptId);
	    auditStr.append("; ");
		auditStr.append("\r\n*pretreatmentPlan* :");
		if (pretreatmentPlan != null)
		{
			auditStr.append(toShortClassName(pretreatmentPlan));
				
		    auditStr.append(pretreatmentPlan.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*status* :");
		if (status != null)
			auditStr.append(status.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*activityGroup* :");
		if (activityGroup != null)
		{
			auditStr.append(toShortClassName(activityGroup));
				
		    auditStr.append(activityGroup.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*activity* :");
		if (activity != null)
		{
			auditStr.append(toShortClassName(activity));
				
		    auditStr.append(activity.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*priority* :");
		if (priority != null)
			auditStr.append(priority.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*groupSiteTech* :");
		if (groupSiteTech != null)
		{
		int i12=0;
		for (i12=0; i12<groupSiteTech.size(); i12++)
		{
			if (i12 > 0)
				auditStr.append(",");
			ims.oncology.domain.objects.PatTreatmentPlanGroupSiteTech obj = (ims.oncology.domain.objects.PatTreatmentPlanGroupSiteTech)groupSiteTech.get(i12);
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
		auditStr.append("\r\n*patientStatus* :");
		if (patientStatus != null)
			auditStr.append(patientStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*attendingAs* :");
		if (attendingAs != null)
			auditStr.append(attendingAs.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*transport* :");
		if (transport != null)
			auditStr.append(transport.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*reason* :");
		if (reason != null)
			auditStr.append(reason.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*category* :");
		if (category != null)
			auditStr.append(category.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*unit* :");
		if (unit != null)
			auditStr.append(unit.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*modality* :");
		if (modality != null)
			auditStr.append(modality.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*aneasthetic* :");
		if (aneasthetic != null)
			auditStr.append(aneasthetic.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*plannedRegime* :");
		if (plannedRegime != null)
			auditStr.append(plannedRegime.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*treatingConsultant* :");
		if (treatingConsultant != null)
		{
			auditStr.append(toShortClassName(treatingConsultant));
				
		    auditStr.append(treatingConsultant.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*active* :");
		auditStr.append(active);
	    auditStr.append("; ");
		auditStr.append("\r\n*estartDate* :");
		auditStr.append(estartDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*eendDate* :");
		auditStr.append(eendDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*actionStatusDate* :");
		auditStr.append(actionStatusDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*waitingList* :");
		auditStr.append(waitingList);
	    auditStr.append("; ");
		auditStr.append("\r\n*modalEnergy* :");
		auditStr.append(modalEnergy);
	    auditStr.append("; ");
		auditStr.append("\r\n*imagingDate* :");
		auditStr.append(imagingDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*startDateRegime* :");
		auditStr.append(startDateRegime);
	    auditStr.append("; ");
		auditStr.append("\r\n*action_OrderNumber* :");
		auditStr.append(action_OrderNumber);
	    auditStr.append("; ");
		auditStr.append("\r\n*treatmenAction* :");
		auditStr.append(treatmenAction);
	    auditStr.append("; ");
		auditStr.append("\r\n*lastAppointmentDate* :");
		auditStr.append(lastAppointmentDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*appDate* :");
		auditStr.append(appDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*chemPlanStartDate* :");
		auditStr.append(chemPlanStartDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*oPAClinic* :");
		auditStr.append(oPAClinic);
	    auditStr.append("; ");
		auditStr.append("\r\n*oPADate* :");
		auditStr.append(oPADate);
	    auditStr.append("; ");
		auditStr.append("\r\n*oPATime* :");
		auditStr.append(oPATime);
	    auditStr.append("; ");
		auditStr.append("\r\n*wLId* :");
		auditStr.append(wLId);
	    auditStr.append("; ");
		auditStr.append("\r\n*schedAppDate* :");
		auditStr.append(schedAppDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*schedAppTIme* :");
		auditStr.append(schedAppTIme);
	    auditStr.append("; ");
		auditStr.append("\r\n*treatmentaction* :");
		auditStr.append(treatmentaction);
	    auditStr.append("; ");
		auditStr.append("\r\n*actionStatusPoint* :");
		if (actionStatusPoint != null)
		{
		int i43=0;
		for (i43=0; i43<actionStatusPoint.size(); i43++)
		{
			if (i43 > 0)
				auditStr.append(",");
			ims.oncology.domain.objects.PatActionStatusPoint obj = (ims.oncology.domain.objects.PatActionStatusPoint)actionStatusPoint.get(i43);
		    if (obj != null)
			{
				if (i43 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i43 > 0)
			auditStr.append("] " + i43);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*tl_dose* :");
		auditStr.append(tl_dose);
	    auditStr.append("; ");
		auditStr.append("\r\n*tl_fractions* :");
		auditStr.append(tl_fractions);
	    auditStr.append("; ");
		auditStr.append("\r\n*tl_duration* :");
		auditStr.append(tl_duration);
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
		
		String keyClassName = "PatAction";
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
		if (this.getBookedDate() != null)
		{
			sb.append("<bookedDate>");
			sb.append(new ims.framework.utils.DateTime(this.getBookedDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</bookedDate>");		
		}
		if (this.getBookedTime() != null)
		{
			sb.append("<bookedTime>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getBookedTime().toString()));
			sb.append("</bookedTime>");		
		}
		if (this.getAction() != null)
		{
			sb.append("<action>");
			sb.append(this.getAction().toXMLString(domMap)); 	
			sb.append("</action>");		
		}
		if (this.getApptHeadId() != null)
		{
			sb.append("<apptHeadId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getApptHeadId().toString()));
			sb.append("</apptHeadId>");		
		}
		if (this.getDose() != null)
		{
			if (this.getDose().size() > 0 )
			{
			sb.append("<dose>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getDose(), domMap));
			sb.append("</dose>");		
			}
		}
		if (this.getApptId() != null)
		{
			sb.append("<apptId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getApptId().toString()));
			sb.append("</apptId>");		
		}
		if (this.getPretreatmentPlan() != null)
		{
			sb.append("<pretreatmentPlan>");
			sb.append(this.getPretreatmentPlan().toXMLString(domMap)); 	
			sb.append("</pretreatmentPlan>");		
		}
		if (this.getStatus() != null)
		{
			sb.append("<status>");
			sb.append(this.getStatus().toXMLString()); 
			sb.append("</status>");		
		}
		if (this.getActivityGroup() != null)
		{
			sb.append("<activityGroup>");
			sb.append(this.getActivityGroup().toXMLString(domMap)); 	
			sb.append("</activityGroup>");		
		}
		if (this.getActivity() != null)
		{
			sb.append("<activity>");
			sb.append(this.getActivity().toXMLString(domMap)); 	
			sb.append("</activity>");		
		}
		if (this.getPriority() != null)
		{
			sb.append("<priority>");
			sb.append(this.getPriority().toXMLString()); 
			sb.append("</priority>");		
		}
		if (this.getGroupSiteTech() != null)
		{
			if (this.getGroupSiteTech().size() > 0 )
			{
			sb.append("<groupSiteTech>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getGroupSiteTech(), domMap));
			sb.append("</groupSiteTech>");		
			}
		}
		if (this.getPatientStatus() != null)
		{
			sb.append("<patientStatus>");
			sb.append(this.getPatientStatus().toXMLString()); 
			sb.append("</patientStatus>");		
		}
		if (this.getAttendingAs() != null)
		{
			sb.append("<attendingAs>");
			sb.append(this.getAttendingAs().toXMLString()); 
			sb.append("</attendingAs>");		
		}
		if (this.getTransport() != null)
		{
			sb.append("<transport>");
			sb.append(this.getTransport().toXMLString()); 
			sb.append("</transport>");		
		}
		if (this.getReason() != null)
		{
			sb.append("<reason>");
			sb.append(this.getReason().toXMLString()); 
			sb.append("</reason>");		
		}
		if (this.getCategory() != null)
		{
			sb.append("<category>");
			sb.append(this.getCategory().toXMLString()); 
			sb.append("</category>");		
		}
		if (this.getUnit() != null)
		{
			sb.append("<unit>");
			sb.append(this.getUnit().toXMLString()); 
			sb.append("</unit>");		
		}
		if (this.getModality() != null)
		{
			sb.append("<modality>");
			sb.append(this.getModality().toXMLString()); 
			sb.append("</modality>");		
		}
		if (this.getAneasthetic() != null)
		{
			sb.append("<aneasthetic>");
			sb.append(this.getAneasthetic().toXMLString()); 
			sb.append("</aneasthetic>");		
		}
		if (this.getPlannedRegime() != null)
		{
			sb.append("<plannedRegime>");
			sb.append(this.getPlannedRegime().toXMLString()); 
			sb.append("</plannedRegime>");		
		}
		if (this.getTreatingConsultant() != null)
		{
			sb.append("<treatingConsultant>");
			sb.append(this.getTreatingConsultant().toXMLString(domMap)); 	
			sb.append("</treatingConsultant>");		
		}
		if (this.isActive() != null)
		{
			sb.append("<active>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isActive().toString()));
			sb.append("</active>");		
		}
		if (this.getEstartDate() != null)
		{
			sb.append("<estartDate>");
			sb.append(new ims.framework.utils.DateTime(this.getEstartDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</estartDate>");		
		}
		if (this.getEendDate() != null)
		{
			sb.append("<eendDate>");
			sb.append(new ims.framework.utils.DateTime(this.getEendDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</eendDate>");		
		}
		if (this.getActionStatusDate() != null)
		{
			sb.append("<actionStatusDate>");
			sb.append(new ims.framework.utils.DateTime(this.getActionStatusDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</actionStatusDate>");		
		}
		if (this.getWaitingList() != null)
		{
			sb.append("<waitingList>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getWaitingList().toString()));
			sb.append("</waitingList>");		
		}
		if (this.getModalEnergy() != null)
		{
			sb.append("<modalEnergy>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getModalEnergy().toString()));
			sb.append("</modalEnergy>");		
		}
		if (this.getImagingDate() != null)
		{
			sb.append("<imagingDate>");
			sb.append(new ims.framework.utils.DateTime(this.getImagingDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</imagingDate>");		
		}
		if (this.getStartDateRegime() != null)
		{
			sb.append("<startDateRegime>");
			sb.append(new ims.framework.utils.DateTime(this.getStartDateRegime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</startDateRegime>");		
		}
		if (this.getAction_OrderNumber() != null)
		{
			sb.append("<action_OrderNumber>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAction_OrderNumber().toString()));
			sb.append("</action_OrderNumber>");		
		}
		if (this.getTreatmenAction() != null)
		{
			sb.append("<treatmenAction>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTreatmenAction().toString()));
			sb.append("</treatmenAction>");		
		}
		if (this.getLastAppointmentDate() != null)
		{
			sb.append("<lastAppointmentDate>");
			sb.append(new ims.framework.utils.DateTime(this.getLastAppointmentDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</lastAppointmentDate>");		
		}
		if (this.getAppDate() != null)
		{
			sb.append("<appDate>");
			sb.append(new ims.framework.utils.DateTime(this.getAppDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</appDate>");		
		}
		if (this.getChemPlanStartDate() != null)
		{
			sb.append("<chemPlanStartDate>");
			sb.append(new ims.framework.utils.DateTime(this.getChemPlanStartDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</chemPlanStartDate>");		
		}
		if (this.getOPAClinic() != null)
		{
			sb.append("<oPAClinic>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOPAClinic().toString()));
			sb.append("</oPAClinic>");		
		}
		if (this.getOPADate() != null)
		{
			sb.append("<oPADate>");
			sb.append(new ims.framework.utils.DateTime(this.getOPADate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</oPADate>");		
		}
		if (this.getOPATime() != null)
		{
			sb.append("<oPATime>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOPATime().toString()));
			sb.append("</oPATime>");		
		}
		if (this.getWLId() != null)
		{
			sb.append("<wLId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getWLId().toString()));
			sb.append("</wLId>");		
		}
		if (this.getSchedAppDate() != null)
		{
			sb.append("<schedAppDate>");
			sb.append(new ims.framework.utils.DateTime(this.getSchedAppDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</schedAppDate>");		
		}
		if (this.getSchedAppTIme() != null)
		{
			sb.append("<schedAppTIme>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSchedAppTIme().toString()));
			sb.append("</schedAppTIme>");		
		}
		if (this.getTreatmentaction() != null)
		{
			sb.append("<treatmentaction>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTreatmentaction().toString()));
			sb.append("</treatmentaction>");		
		}
		if (this.getActionStatusPoint() != null)
		{
			if (this.getActionStatusPoint().size() > 0 )
			{
			sb.append("<actionStatusPoint>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getActionStatusPoint(), domMap));
			sb.append("</actionStatusPoint>");		
			}
		}
		if (this.getTl_dose() != null)
		{
			sb.append("<tl_dose>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTl_dose().toString()));
			sb.append("</tl_dose>");		
		}
		if (this.getTl_fractions() != null)
		{
			sb.append("<tl_fractions>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTl_fractions().toString()));
			sb.append("</tl_fractions>");		
		}
		if (this.getTl_duration() != null)
		{
			sb.append("<tl_duration>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTl_duration().toString()));
			sb.append("</tl_duration>");		
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
			PatAction domainObject = getPatActionfromXML(itemEl, factory, domMap);

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
			PatAction domainObject = getPatActionfromXML(itemEl, factory, domMap);

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
		
	public static PatAction getPatActionfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPatActionfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PatAction getPatActionfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PatAction.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PatAction.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PatAction class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PatAction)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PatAction.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PatAction ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PatAction)factory.getImportedDomainObject(PatAction.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PatAction();
		}
		String keyClassName = "PatAction";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PatAction)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PatAction obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("bookedDate");
		if(fldEl != null)
		{	
    		obj.setBookedDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("bookedTime");
		if(fldEl != null)
		{	
    		obj.setBookedTime(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("action");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAction(ims.dto_move.domain.objects.ActivityAction.getActivityActionfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("apptHeadId");
		if(fldEl != null)
		{	
    		obj.setApptHeadId(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dose");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setDose(ims.oncology.domain.objects.PatTreatmentPlanDose.fromListXMLString(fldEl, factory, obj.getDose(), domMap));
		}
		fldEl = el.element("apptId");
		if(fldEl != null)
		{	
    		obj.setApptId(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("pretreatmentPlan");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPretreatmentPlan(ims.oncology.domain.objects.PreTreatmentPlan.getPreTreatmentPlanfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("status");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("activityGroup");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setActivityGroup(ims.dto_move.domain.objects.ActivityGroup.getActivityGroupfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("activity");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setActivity(ims.dto_move.domain.objects.SchedActivity.getSchedActivityfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("priority");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPriority(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("groupSiteTech");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setGroupSiteTech(ims.oncology.domain.objects.PatTreatmentPlanGroupSiteTech.fromListXMLString(fldEl, factory, obj.getGroupSiteTech(), domMap));
		}
		fldEl = el.element("patientStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPatientStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("attendingAs");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAttendingAs(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("transport");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTransport(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("reason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReason(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("category");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCategory(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("unit");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setUnit(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("modality");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setModality(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("aneasthetic");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAneasthetic(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("plannedRegime");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPlannedRegime(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("treatingConsultant");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTreatingConsultant(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("active");
		if(fldEl != null)
		{	
    		obj.setActive(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("estartDate");
		if(fldEl != null)
		{	
    		obj.setEstartDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("eendDate");
		if(fldEl != null)
		{	
    		obj.setEendDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("actionStatusDate");
		if(fldEl != null)
		{	
    		obj.setActionStatusDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("waitingList");
		if(fldEl != null)
		{	
    		obj.setWaitingList(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("modalEnergy");
		if(fldEl != null)
		{	
    		obj.setModalEnergy(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("imagingDate");
		if(fldEl != null)
		{	
    		obj.setImagingDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("startDateRegime");
		if(fldEl != null)
		{	
    		obj.setStartDateRegime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("action_OrderNumber");
		if(fldEl != null)
		{	
    		obj.setAction_OrderNumber(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("treatmenAction");
		if(fldEl != null)
		{	
    		obj.setTreatmenAction(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("lastAppointmentDate");
		if(fldEl != null)
		{	
    		obj.setLastAppointmentDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("appDate");
		if(fldEl != null)
		{	
    		obj.setAppDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("chemPlanStartDate");
		if(fldEl != null)
		{	
    		obj.setChemPlanStartDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("oPAClinic");
		if(fldEl != null)
		{	
    		obj.setOPAClinic(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("oPADate");
		if(fldEl != null)
		{	
    		obj.setOPADate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("oPATime");
		if(fldEl != null)
		{	
    		obj.setOPATime(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("wLId");
		if(fldEl != null)
		{	
    		obj.setWLId(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("schedAppDate");
		if(fldEl != null)
		{	
    		obj.setSchedAppDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("schedAppTIme");
		if(fldEl != null)
		{	
    		obj.setSchedAppTIme(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("treatmentaction");
		if(fldEl != null)
		{	
    		obj.setTreatmentaction(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("actionStatusPoint");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setActionStatusPoint(ims.oncology.domain.objects.PatActionStatusPoint.fromListXMLString(fldEl, factory, obj.getActionStatusPoint(), domMap));
		}
		fldEl = el.element("tl_dose");
		if(fldEl != null)
		{	
    		obj.setTl_dose(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("tl_fractions");
		if(fldEl != null)
		{	
    		obj.setTl_fractions(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("tl_duration");
		if(fldEl != null)
		{	
    		obj.setTl_duration(new Integer(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "dose"
		, "groupSiteTech"
		, "actionStatusPoint"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String BookedDate = "bookedDate";
		public static final String BookedTime = "bookedTime";
		public static final String Action = "action";
		public static final String ApptHeadId = "apptHeadId";
		public static final String Dose = "dose";
		public static final String ApptId = "apptId";
		public static final String PretreatmentPlan = "pretreatmentPlan";
		public static final String Status = "status";
		public static final String ActivityGroup = "activityGroup";
		public static final String Activity = "activity";
		public static final String Priority = "priority";
		public static final String GroupSiteTech = "groupSiteTech";
		public static final String PatientStatus = "patientStatus";
		public static final String AttendingAs = "attendingAs";
		public static final String Transport = "transport";
		public static final String Reason = "reason";
		public static final String Category = "category";
		public static final String Unit = "unit";
		public static final String Modality = "modality";
		public static final String Aneasthetic = "aneasthetic";
		public static final String PlannedRegime = "plannedRegime";
		public static final String TreatingConsultant = "treatingConsultant";
		public static final String Active = "active";
		public static final String EstartDate = "estartDate";
		public static final String EendDate = "eendDate";
		public static final String ActionStatusDate = "actionStatusDate";
		public static final String WaitingList = "waitingList";
		public static final String ModalEnergy = "modalEnergy";
		public static final String ImagingDate = "imagingDate";
		public static final String StartDateRegime = "startDateRegime";
		public static final String Action_OrderNumber = "action_OrderNumber";
		public static final String TreatmenAction = "treatmenAction";
		public static final String LastAppointmentDate = "lastAppointmentDate";
		public static final String AppDate = "appDate";
		public static final String ChemPlanStartDate = "chemPlanStartDate";
		public static final String OPAClinic = "oPAClinic";
		public static final String OPADate = "oPADate";
		public static final String OPATime = "oPATime";
		public static final String WLId = "wLId";
		public static final String SchedAppDate = "schedAppDate";
		public static final String SchedAppTIme = "schedAppTIme";
		public static final String Treatmentaction = "treatmentaction";
		public static final String ActionStatusPoint = "actionStatusPoint";
		public static final String Tl_dose = "tl_dose";
		public static final String Tl_fractions = "tl_fractions";
		public static final String Tl_duration = "tl_duration";
	}
}

