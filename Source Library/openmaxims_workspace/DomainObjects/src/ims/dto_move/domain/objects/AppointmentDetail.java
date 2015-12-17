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


public class AppointmentDetail extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1105100032;
	private static final long serialVersionUID = 1105100032L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private java.util.Date apptDate;
	private Integer pkey;
	private ims.core.patient.domain.objects.Patient patient;
	private ims.dto_move.domain.objects.Session session;
	private Integer sessionDetailId;
	private ims.dto_move.domain.objects.RadiotherapyMachine machine;
	private ims.core.resource.people.domain.objects.MemberOfStaff mos;
	private String startTime;
	private String endTime;
	private Integer duration;
	private String attendTime;
	private Integer attendStat;
	private String actualAttendTime;
	private Integer apptStatus;
	private Integer transportType;
	/** SessionListowner */
	private Integer staffId;
	private Integer modality;
	private String comments;
	private String contractId;
	private Integer priority;
	private String timeSeem;
	private ims.core.resource.people.domain.objects.Hcp hcpSeen;
	private Integer hcpPresent;
	private String actualCompleteTime;
	private java.util.Date dateChanged;
	private Integer apptStatReason;
	private Integer confirmationStat;
	/** Used for contract allocation */
	private String recipient1;
	private String actionComplete;
	/** Used for contract allocation */
	private String recipient2;
	/** Used for contract allocation */
	private String recipient3;
	/** Used for contract allocation */
	private String recipient4;
	/** Used for contract allocation */
	private String recipient5;
	/** Used for contract allocation */
	private String recipient6;
	/** Used for contract allocation */
	private String recipient7;
	private Integer machineModality;
	private java.lang.Float energy;
	private Integer energyUnit;
	/** Is Patient inpatient when appointment took place */
	private String isInpatient;
	/** Disposal Code */
	private Integer dispCode;
	/** staff activity id */
	private Integer activityId;
	/** Actual location attended dc */
	private Integer actualLocAtt;
    public AppointmentDetail (Integer id, int ver)
    {
    	super(id, ver);
		isComponentClass=true;
    }
    public AppointmentDetail ()
    {
    	super();
		isComponentClass=true;
    }
    public AppointmentDetail (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
		isComponentClass=true;
    }
	public Class getRealDomainClass()
	{
		return ims.dto_move.domain.objects.AppointmentDetail.class;
	}


	public java.util.Date getApptDate() {
		return apptDate;
	}
	public void setApptDate(java.util.Date apptDate) {
		this.apptDate = apptDate;
	}

	public Integer getPkey() {
		return pkey;
	}
	public void setPkey(Integer pkey) {
		this.pkey = pkey;
	}

	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public ims.dto_move.domain.objects.Session getSession() {
		return session;
	}
	public void setSession(ims.dto_move.domain.objects.Session session) {
		this.session = session;
	}

	public Integer getSessionDetailId() {
		return sessionDetailId;
	}
	public void setSessionDetailId(Integer sessionDetailId) {
		this.sessionDetailId = sessionDetailId;
	}

	public ims.dto_move.domain.objects.RadiotherapyMachine getMachine() {
		return machine;
	}
	public void setMachine(ims.dto_move.domain.objects.RadiotherapyMachine machine) {
		this.machine = machine;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getMos() {
		return mos;
	}
	public void setMos(ims.core.resource.people.domain.objects.MemberOfStaff mos) {
		this.mos = mos;
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

	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public String getAttendTime() {
		return attendTime;
	}
	public void setAttendTime(String attendTime) {
		this.attendTime = attendTime;
	}

	public Integer getAttendStat() {
		return attendStat;
	}
	public void setAttendStat(Integer attendStat) {
		this.attendStat = attendStat;
	}

	public String getActualAttendTime() {
		return actualAttendTime;
	}
	public void setActualAttendTime(String actualAttendTime) {
		this.actualAttendTime = actualAttendTime;
	}

	public Integer getApptStatus() {
		return apptStatus;
	}
	public void setApptStatus(Integer apptStatus) {
		this.apptStatus = apptStatus;
	}

	public Integer getTransportType() {
		return transportType;
	}
	public void setTransportType(Integer transportType) {
		this.transportType = transportType;
	}

	public Integer getStaffId() {
		return staffId;
	}
	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
	}

	public Integer getModality() {
		return modality;
	}
	public void setModality(Integer modality) {
		this.modality = modality;
	}

	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		if ( null != comments && comments.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for comments. Tried to set value: "+
				comments);
		}
		this.comments = comments;
	}

	public String getContractId() {
		return contractId;
	}
	public void setContractId(String contractId) {
		if ( null != contractId && contractId.length() > 15 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for contractId. Tried to set value: "+
				contractId);
		}
		this.contractId = contractId;
	}

	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public String getTimeSeem() {
		return timeSeem;
	}
	public void setTimeSeem(String timeSeem) {
		this.timeSeem = timeSeem;
	}

	public ims.core.resource.people.domain.objects.Hcp getHcpSeen() {
		return hcpSeen;
	}
	public void setHcpSeen(ims.core.resource.people.domain.objects.Hcp hcpSeen) {
		this.hcpSeen = hcpSeen;
	}

	public Integer getHcpPresent() {
		return hcpPresent;
	}
	public void setHcpPresent(Integer hcpPresent) {
		this.hcpPresent = hcpPresent;
	}

	public String getActualCompleteTime() {
		return actualCompleteTime;
	}
	public void setActualCompleteTime(String actualCompleteTime) {
		this.actualCompleteTime = actualCompleteTime;
	}

	public java.util.Date getDateChanged() {
		return dateChanged;
	}
	public void setDateChanged(java.util.Date dateChanged) {
		this.dateChanged = dateChanged;
	}

	public Integer getApptStatReason() {
		return apptStatReason;
	}
	public void setApptStatReason(Integer apptStatReason) {
		this.apptStatReason = apptStatReason;
	}

	public Integer getConfirmationStat() {
		return confirmationStat;
	}
	public void setConfirmationStat(Integer confirmationStat) {
		this.confirmationStat = confirmationStat;
	}

	public String getRecipient1() {
		return recipient1;
	}
	public void setRecipient1(String recipient1) {
		if ( null != recipient1 && recipient1.length() > 5 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for recipient1. Tried to set value: "+
				recipient1);
		}
		this.recipient1 = recipient1;
	}

	public String getActionComplete() {
		return actionComplete;
	}
	public void setActionComplete(String actionComplete) {
		if ( null != actionComplete && actionComplete.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for actionComplete. Tried to set value: "+
				actionComplete);
		}
		this.actionComplete = actionComplete;
	}

	public String getRecipient2() {
		return recipient2;
	}
	public void setRecipient2(String recipient2) {
		if ( null != recipient2 && recipient2.length() > 3 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for recipient2. Tried to set value: "+
				recipient2);
		}
		this.recipient2 = recipient2;
	}

	public String getRecipient3() {
		return recipient3;
	}
	public void setRecipient3(String recipient3) {
		if ( null != recipient3 && recipient3.length() > 5 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for recipient3. Tried to set value: "+
				recipient3);
		}
		this.recipient3 = recipient3;
	}

	public String getRecipient4() {
		return recipient4;
	}
	public void setRecipient4(String recipient4) {
		if ( null != recipient4 && recipient4.length() > 3 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for recipient4. Tried to set value: "+
				recipient4);
		}
		this.recipient4 = recipient4;
	}

	public String getRecipient5() {
		return recipient5;
	}
	public void setRecipient5(String recipient5) {
		if ( null != recipient5 && recipient5.length() > 5 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for recipient5. Tried to set value: "+
				recipient5);
		}
		this.recipient5 = recipient5;
	}

	public String getRecipient6() {
		return recipient6;
	}
	public void setRecipient6(String recipient6) {
		if ( null != recipient6 && recipient6.length() > 5 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for recipient6. Tried to set value: "+
				recipient6);
		}
		this.recipient6 = recipient6;
	}

	public String getRecipient7() {
		return recipient7;
	}
	public void setRecipient7(String recipient7) {
		if ( null != recipient7 && recipient7.length() > 5 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for recipient7. Tried to set value: "+
				recipient7);
		}
		this.recipient7 = recipient7;
	}

	public Integer getMachineModality() {
		return machineModality;
	}
	public void setMachineModality(Integer machineModality) {
		this.machineModality = machineModality;
	}

	public java.lang.Float getEnergy() {
		return energy;
	}
	public void setEnergy(java.lang.Float energy) {
		this.energy = energy;
	}

	public Integer getEnergyUnit() {
		return energyUnit;
	}
	public void setEnergyUnit(Integer energyUnit) {
		this.energyUnit = energyUnit;
	}

	public String getIsInpatient() {
		return isInpatient;
	}
	public void setIsInpatient(String isInpatient) {
		if ( null != isInpatient && isInpatient.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for isInpatient. Tried to set value: "+
				isInpatient);
		}
		this.isInpatient = isInpatient;
	}

	public Integer getDispCode() {
		return dispCode;
	}
	public void setDispCode(Integer dispCode) {
		this.dispCode = dispCode;
	}

	public Integer getActivityId() {
		return activityId;
	}
	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}

	public Integer getActualLocAtt() {
		return actualLocAtt;
	}
	public void setActualLocAtt(Integer actualLocAtt) {
		this.actualLocAtt = actualLocAtt;
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
		
		auditStr.append("\r\n*apptDate* :");
		auditStr.append(apptDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*pkey* :");
		auditStr.append(pkey);
	    auditStr.append("; ");
		auditStr.append("\r\n*patient* :");
		if (patient != null)
		{
			auditStr.append(toShortClassName(patient));
				
		    auditStr.append(patient.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*session* :");
		if (session != null)
		{
			auditStr.append(toShortClassName(session));
				
		    auditStr.append(session.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*sessionDetailId* :");
		auditStr.append(sessionDetailId);
	    auditStr.append("; ");
		auditStr.append("\r\n*machine* :");
		if (machine != null)
		{
			auditStr.append(toShortClassName(machine));
				
		    auditStr.append(machine.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*mos* :");
		if (mos != null)
		{
			auditStr.append(toShortClassName(mos));
				
		    auditStr.append(mos.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*startTime* :");
		auditStr.append(startTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*endTime* :");
		auditStr.append(endTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*duration* :");
		auditStr.append(duration);
	    auditStr.append("; ");
		auditStr.append("\r\n*attendTime* :");
		auditStr.append(attendTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*attendStat* :");
		auditStr.append(attendStat);
	    auditStr.append("; ");
		auditStr.append("\r\n*actualAttendTime* :");
		auditStr.append(actualAttendTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*apptStatus* :");
		auditStr.append(apptStatus);
	    auditStr.append("; ");
		auditStr.append("\r\n*transportType* :");
		auditStr.append(transportType);
	    auditStr.append("; ");
		auditStr.append("\r\n*staffId* :");
		auditStr.append(staffId);
	    auditStr.append("; ");
		auditStr.append("\r\n*modality* :");
		auditStr.append(modality);
	    auditStr.append("; ");
		auditStr.append("\r\n*comments* :");
		auditStr.append(comments);
	    auditStr.append("; ");
		auditStr.append("\r\n*contractId* :");
		auditStr.append(contractId);
	    auditStr.append("; ");
		auditStr.append("\r\n*priority* :");
		auditStr.append(priority);
	    auditStr.append("; ");
		auditStr.append("\r\n*timeSeem* :");
		auditStr.append(timeSeem);
	    auditStr.append("; ");
		auditStr.append("\r\n*hcpSeen* :");
		if (hcpSeen != null)
		{
			auditStr.append(toShortClassName(hcpSeen));
				
		    auditStr.append(hcpSeen.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*hcpPresent* :");
		auditStr.append(hcpPresent);
	    auditStr.append("; ");
		auditStr.append("\r\n*actualCompleteTime* :");
		auditStr.append(actualCompleteTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*dateChanged* :");
		auditStr.append(dateChanged);
	    auditStr.append("; ");
		auditStr.append("\r\n*apptStatReason* :");
		auditStr.append(apptStatReason);
	    auditStr.append("; ");
		auditStr.append("\r\n*confirmationStat* :");
		auditStr.append(confirmationStat);
	    auditStr.append("; ");
		auditStr.append("\r\n*recipient1* :");
		auditStr.append(recipient1);
	    auditStr.append("; ");
		auditStr.append("\r\n*actionComplete* :");
		auditStr.append(actionComplete);
	    auditStr.append("; ");
		auditStr.append("\r\n*recipient2* :");
		auditStr.append(recipient2);
	    auditStr.append("; ");
		auditStr.append("\r\n*recipient3* :");
		auditStr.append(recipient3);
	    auditStr.append("; ");
		auditStr.append("\r\n*recipient4* :");
		auditStr.append(recipient4);
	    auditStr.append("; ");
		auditStr.append("\r\n*recipient5* :");
		auditStr.append(recipient5);
	    auditStr.append("; ");
		auditStr.append("\r\n*recipient6* :");
		auditStr.append(recipient6);
	    auditStr.append("; ");
		auditStr.append("\r\n*recipient7* :");
		auditStr.append(recipient7);
	    auditStr.append("; ");
		auditStr.append("\r\n*machineModality* :");
		auditStr.append(machineModality);
	    auditStr.append("; ");
		auditStr.append("\r\n*energy* :");
		auditStr.append(energy);
	    auditStr.append("; ");
		auditStr.append("\r\n*energyUnit* :");
		auditStr.append(energyUnit);
	    auditStr.append("; ");
		auditStr.append("\r\n*isInpatient* :");
		auditStr.append(isInpatient);
	    auditStr.append("; ");
		auditStr.append("\r\n*dispCode* :");
		auditStr.append(dispCode);
	    auditStr.append("; ");
		auditStr.append("\r\n*activityId* :");
		auditStr.append(activityId);
	    auditStr.append("; ");
		auditStr.append("\r\n*actualLocAtt* :");
		auditStr.append(actualLocAtt);
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
		sb.append(" source=\"" + ims.configuration.EnvironmentConfig.getImportExportSourceName() + "\" ");
		sb.append(" classVersion=\"" + this.getClassVersion() + "\" ");
		sb.append(" component=\"" + this.getIsComponentClass() + "\" >");
		
		if (domMap.get(this) == null)
		{
			domMap.put(this, this);
			sb.append(this.fieldsToXMLString(domMap));
		}
		sb.append("</class>");
		
		
		return sb.toString();
	}

	public String fieldsToXMLString(java.util.HashMap domMap)
	{
		StringBuffer sb = new StringBuffer();
		if (this.getApptDate() != null)
		{
			sb.append("<apptDate>");
			sb.append(new ims.framework.utils.DateTime(this.getApptDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</apptDate>");		
		}
		if (this.getPkey() != null)
		{
			sb.append("<pkey>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPkey().toString()));
			sb.append("</pkey>");		
		}
		if (this.getPatient() != null)
		{
			sb.append("<patient>");
			sb.append(this.getPatient().toXMLString(domMap)); 	
			sb.append("</patient>");		
		}
		if (this.getSession() != null)
		{
			sb.append("<session>");
			sb.append(this.getSession().toXMLString(domMap)); 	
			sb.append("</session>");		
		}
		if (this.getSessionDetailId() != null)
		{
			sb.append("<sessionDetailId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSessionDetailId().toString()));
			sb.append("</sessionDetailId>");		
		}
		if (this.getMachine() != null)
		{
			sb.append("<machine>");
			sb.append(this.getMachine().toXMLString(domMap)); 	
			sb.append("</machine>");		
		}
		if (this.getMos() != null)
		{
			sb.append("<mos>");
			sb.append(this.getMos().toXMLString(domMap)); 	
			sb.append("</mos>");		
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
		if (this.getDuration() != null)
		{
			sb.append("<duration>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDuration().toString()));
			sb.append("</duration>");		
		}
		if (this.getAttendTime() != null)
		{
			sb.append("<attendTime>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAttendTime().toString()));
			sb.append("</attendTime>");		
		}
		if (this.getAttendStat() != null)
		{
			sb.append("<attendStat>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAttendStat().toString()));
			sb.append("</attendStat>");		
		}
		if (this.getActualAttendTime() != null)
		{
			sb.append("<actualAttendTime>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getActualAttendTime().toString()));
			sb.append("</actualAttendTime>");		
		}
		if (this.getApptStatus() != null)
		{
			sb.append("<apptStatus>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getApptStatus().toString()));
			sb.append("</apptStatus>");		
		}
		if (this.getTransportType() != null)
		{
			sb.append("<transportType>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTransportType().toString()));
			sb.append("</transportType>");		
		}
		if (this.getStaffId() != null)
		{
			sb.append("<staffId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getStaffId().toString()));
			sb.append("</staffId>");		
		}
		if (this.getModality() != null)
		{
			sb.append("<modality>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getModality().toString()));
			sb.append("</modality>");		
		}
		if (this.getComments() != null)
		{
			sb.append("<comments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getComments().toString()));
			sb.append("</comments>");		
		}
		if (this.getContractId() != null)
		{
			sb.append("<contractId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getContractId().toString()));
			sb.append("</contractId>");		
		}
		if (this.getPriority() != null)
		{
			sb.append("<priority>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPriority().toString()));
			sb.append("</priority>");		
		}
		if (this.getTimeSeem() != null)
		{
			sb.append("<timeSeem>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTimeSeem().toString()));
			sb.append("</timeSeem>");		
		}
		if (this.getHcpSeen() != null)
		{
			sb.append("<hcpSeen>");
			sb.append(this.getHcpSeen().toXMLString(domMap)); 	
			sb.append("</hcpSeen>");		
		}
		if (this.getHcpPresent() != null)
		{
			sb.append("<hcpPresent>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getHcpPresent().toString()));
			sb.append("</hcpPresent>");		
		}
		if (this.getActualCompleteTime() != null)
		{
			sb.append("<actualCompleteTime>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getActualCompleteTime().toString()));
			sb.append("</actualCompleteTime>");		
		}
		if (this.getDateChanged() != null)
		{
			sb.append("<dateChanged>");
			sb.append(new ims.framework.utils.DateTime(this.getDateChanged()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateChanged>");		
		}
		if (this.getApptStatReason() != null)
		{
			sb.append("<apptStatReason>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getApptStatReason().toString()));
			sb.append("</apptStatReason>");		
		}
		if (this.getConfirmationStat() != null)
		{
			sb.append("<confirmationStat>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getConfirmationStat().toString()));
			sb.append("</confirmationStat>");		
		}
		if (this.getRecipient1() != null)
		{
			sb.append("<recipient1>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRecipient1().toString()));
			sb.append("</recipient1>");		
		}
		if (this.getActionComplete() != null)
		{
			sb.append("<actionComplete>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getActionComplete().toString()));
			sb.append("</actionComplete>");		
		}
		if (this.getRecipient2() != null)
		{
			sb.append("<recipient2>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRecipient2().toString()));
			sb.append("</recipient2>");		
		}
		if (this.getRecipient3() != null)
		{
			sb.append("<recipient3>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRecipient3().toString()));
			sb.append("</recipient3>");		
		}
		if (this.getRecipient4() != null)
		{
			sb.append("<recipient4>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRecipient4().toString()));
			sb.append("</recipient4>");		
		}
		if (this.getRecipient5() != null)
		{
			sb.append("<recipient5>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRecipient5().toString()));
			sb.append("</recipient5>");		
		}
		if (this.getRecipient6() != null)
		{
			sb.append("<recipient6>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRecipient6().toString()));
			sb.append("</recipient6>");		
		}
		if (this.getRecipient7() != null)
		{
			sb.append("<recipient7>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRecipient7().toString()));
			sb.append("</recipient7>");		
		}
		if (this.getMachineModality() != null)
		{
			sb.append("<machineModality>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMachineModality().toString()));
			sb.append("</machineModality>");		
		}
		if (this.getEnergy() != null)
		{
			sb.append("<energy>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getEnergy().toString()));
			sb.append("</energy>");		
		}
		if (this.getEnergyUnit() != null)
		{
			sb.append("<energyUnit>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getEnergyUnit().toString()));
			sb.append("</energyUnit>");		
		}
		if (this.getIsInpatient() != null)
		{
			sb.append("<isInpatient>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getIsInpatient().toString()));
			sb.append("</isInpatient>");		
		}
		if (this.getDispCode() != null)
		{
			sb.append("<dispCode>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDispCode().toString()));
			sb.append("</dispCode>");		
		}
		if (this.getActivityId() != null)
		{
			sb.append("<activityId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getActivityId().toString()));
			sb.append("</activityId>");		
		}
		if (this.getActualLocAtt() != null)
		{
			sb.append("<actualLocAtt>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getActualLocAtt().toString()));
			sb.append("</actualLocAtt>");		
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
			AppointmentDetail domainObject = getAppointmentDetailfromXML(itemEl, factory, domMap);

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
			AppointmentDetail domainObject = getAppointmentDetailfromXML(itemEl, factory, domMap);

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
		
	public static AppointmentDetail getAppointmentDetailfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getAppointmentDetailfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static AppointmentDetail getAppointmentDetailfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!AppointmentDetail.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!AppointmentDetail.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the AppointmentDetail class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (AppointmentDetail)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(AppointmentDetail.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		AppointmentDetail ret = null;
		if (ret == null)
		{
			ret = new AppointmentDetail();
		}
		fillFieldsfromXML(el, factory, ret, domMap);
		return ret;
	}

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, AppointmentDetail obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("apptDate");
		if(fldEl != null)
		{	
    		obj.setApptDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("pkey");
		if(fldEl != null)
		{	
    		obj.setPkey(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("session");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSession(ims.dto_move.domain.objects.Session.getSessionfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("sessionDetailId");
		if(fldEl != null)
		{	
    		obj.setSessionDetailId(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("machine");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setMachine(ims.dto_move.domain.objects.RadiotherapyMachine.getRadiotherapyMachinefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("mos");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setMos(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
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
		fldEl = el.element("duration");
		if(fldEl != null)
		{	
    		obj.setDuration(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("attendTime");
		if(fldEl != null)
		{	
    		obj.setAttendTime(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("attendStat");
		if(fldEl != null)
		{	
    		obj.setAttendStat(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("actualAttendTime");
		if(fldEl != null)
		{	
    		obj.setActualAttendTime(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("apptStatus");
		if(fldEl != null)
		{	
    		obj.setApptStatus(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("transportType");
		if(fldEl != null)
		{	
    		obj.setTransportType(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("staffId");
		if(fldEl != null)
		{	
    		obj.setStaffId(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("modality");
		if(fldEl != null)
		{	
    		obj.setModality(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("comments");
		if(fldEl != null)
		{	
    		obj.setComments(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("contractId");
		if(fldEl != null)
		{	
    		obj.setContractId(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("priority");
		if(fldEl != null)
		{	
    		obj.setPriority(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("timeSeem");
		if(fldEl != null)
		{	
    		obj.setTimeSeem(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("hcpSeen");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setHcpSeen(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("hcpPresent");
		if(fldEl != null)
		{	
    		obj.setHcpPresent(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("actualCompleteTime");
		if(fldEl != null)
		{	
    		obj.setActualCompleteTime(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dateChanged");
		if(fldEl != null)
		{	
    		obj.setDateChanged(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("apptStatReason");
		if(fldEl != null)
		{	
    		obj.setApptStatReason(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("confirmationStat");
		if(fldEl != null)
		{	
    		obj.setConfirmationStat(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("recipient1");
		if(fldEl != null)
		{	
    		obj.setRecipient1(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("actionComplete");
		if(fldEl != null)
		{	
    		obj.setActionComplete(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("recipient2");
		if(fldEl != null)
		{	
    		obj.setRecipient2(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("recipient3");
		if(fldEl != null)
		{	
    		obj.setRecipient3(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("recipient4");
		if(fldEl != null)
		{	
    		obj.setRecipient4(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("recipient5");
		if(fldEl != null)
		{	
    		obj.setRecipient5(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("recipient6");
		if(fldEl != null)
		{	
    		obj.setRecipient6(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("recipient7");
		if(fldEl != null)
		{	
    		obj.setRecipient7(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("machineModality");
		if(fldEl != null)
		{	
    		obj.setMachineModality(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("energy");
		if(fldEl != null)
		{	
    		obj.setEnergy(new java.lang.Float(fldEl.getTextTrim()));	
		}
		fldEl = el.element("energyUnit");
		if(fldEl != null)
		{	
    		obj.setEnergyUnit(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isInpatient");
		if(fldEl != null)
		{	
    		obj.setIsInpatient(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dispCode");
		if(fldEl != null)
		{	
    		obj.setDispCode(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("activityId");
		if(fldEl != null)
		{	
    		obj.setActivityId(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("actualLocAtt");
		if(fldEl != null)
		{	
    		obj.setActualLocAtt(new Integer(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String ApptDate = "apptDate";
		public static final String Pkey = "pkey";
		public static final String Patient = "patient";
		public static final String Session = "session";
		public static final String SessionDetailId = "sessionDetailId";
		public static final String Machine = "machine";
		public static final String Mos = "mos";
		public static final String StartTime = "startTime";
		public static final String EndTime = "endTime";
		public static final String Duration = "duration";
		public static final String AttendTime = "attendTime";
		public static final String AttendStat = "attendStat";
		public static final String ActualAttendTime = "actualAttendTime";
		public static final String ApptStatus = "apptStatus";
		public static final String TransportType = "transportType";
		public static final String StaffId = "staffId";
		public static final String Modality = "modality";
		public static final String Comments = "comments";
		public static final String ContractId = "contractId";
		public static final String Priority = "priority";
		public static final String TimeSeem = "timeSeem";
		public static final String HcpSeen = "hcpSeen";
		public static final String HcpPresent = "hcpPresent";
		public static final String ActualCompleteTime = "actualCompleteTime";
		public static final String DateChanged = "dateChanged";
		public static final String ApptStatReason = "apptStatReason";
		public static final String ConfirmationStat = "confirmationStat";
		public static final String Recipient1 = "recipient1";
		public static final String ActionComplete = "actionComplete";
		public static final String Recipient2 = "recipient2";
		public static final String Recipient3 = "recipient3";
		public static final String Recipient4 = "recipient4";
		public static final String Recipient5 = "recipient5";
		public static final String Recipient6 = "recipient6";
		public static final String Recipient7 = "recipient7";
		public static final String MachineModality = "machineModality";
		public static final String Energy = "energy";
		public static final String EnergyUnit = "energyUnit";
		public static final String IsInpatient = "isInpatient";
		public static final String DispCode = "dispCode";
		public static final String ActivityId = "activityId";
		public static final String ActualLocAtt = "actualLocAtt";
	}
}

