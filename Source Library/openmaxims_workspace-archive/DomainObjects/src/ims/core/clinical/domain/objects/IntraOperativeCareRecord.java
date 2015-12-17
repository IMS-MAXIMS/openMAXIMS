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
package ims.core.clinical.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class IntraOperativeCareRecord extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1072100081;
	private static final long serialVersionUID = 1072100081L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Care Context */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** AuthoringInformation */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInformation;
	/** Planned Procedure */
	private ims.core.clinical.domain.objects.PatientProcedure plannedProcedure;
	/** Actual Procedure */
	private ims.core.clinical.domain.objects.PatientProcedure actualProcedure;
	/** ProcedureDate */
	private java.util.Date procedureDate;
	/** Theatre */
	private ims.core.resource.place.domain.objects.Location theatre;
	/** Time Into Pacu */
	private java.util.Date intoPacuTime;
	/** Anaesthetist Start Time */
	private java.util.Date anaesthetistStartTime;
	/** InTheatre Time  */
	private java.util.Date inTheatreTime;
	/** Surgery Start Time */
	private java.util.Date surgeryStartTime;
	/** Surgery End Time */
	private java.util.Date surgeryEndTime;
	/** Time Into Recovery */
	private java.util.Date timeIntoRecovery;
	/** Time Out Of Recovery */
	private java.util.Date timeOutOfRecovery;
	/** Surgeon */
	private ims.core.resource.people.domain.objects.Hcp surgeon;
	/** Surgeon Assistant */
	private ims.core.resource.people.domain.objects.Hcp surgeonAssistant;
	/** Anaesthetist */
	private ims.core.resource.people.domain.objects.Hcp anaesthetist;
	/** Surgeon */
	private ims.core.resource.people.domain.objects.Hcp oDA;
	/** Scrub Nurse */
	private ims.core.resource.people.domain.objects.Nurse scrubNurse;
	/** Circulating Nurse */
	private ims.core.resource.people.domain.objects.Nurse circulatingNurse;
	/** Other */
	private String other;
	/** Intra Operative Details */
	private ims.core.clinical.domain.objects.IntraOperativeDetails intraOperativeDetails;
	/** Was the actual Procedure Planned */
	private Boolean wasPlannedProcedure;
	/** Was the actual Procedure Unplanned */
	private Boolean wasUnplannedProcedure;
	/** CataractIntraOperativeDetail */
	private ims.core.clinical.domain.objects.CataractIntraOperative cataractIntraOperativeDetail;
	/** Admission Type */
	private ims.domain.lookups.LookupInstance admissionType;
	/** ReadmissionType */
	private ims.domain.lookups.LookupInstance readmissionType;
	/** UniqueLineRefNo - Used for Monthly Activity Report */
	private String uniqueLineRefNo;
	/** wasOutputtedToWeeklyReport */
	private Boolean wasOutputtedToWeeklyReport;
	/** wasOutputtedToMonthlyReport */
	private Boolean wasOutputtedToMonthlyReport;
	/** PasEvent */
	private ims.core.admin.pas.domain.objects.PASEvent pasEvent;
	/** Anaesthetic Used */
	private ims.domain.lookups.LookupInstance anaestheticUsed;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public IntraOperativeCareRecord (Integer id, int ver)
    {
    	super(id, ver);
    }
    public IntraOperativeCareRecord ()
    {
    	super();
    }
    public IntraOperativeCareRecord (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.clinical.domain.objects.IntraOperativeCareRecord.class;
	}


	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getAuthoringInformation() {
		return authoringInformation;
	}
	public void setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation authoringInformation) {
		this.authoringInformation = authoringInformation;
	}

	public ims.core.clinical.domain.objects.PatientProcedure getPlannedProcedure() {
		return plannedProcedure;
	}
	public void setPlannedProcedure(ims.core.clinical.domain.objects.PatientProcedure plannedProcedure) {
		this.plannedProcedure = plannedProcedure;
	}

	public ims.core.clinical.domain.objects.PatientProcedure getActualProcedure() {
		return actualProcedure;
	}
	public void setActualProcedure(ims.core.clinical.domain.objects.PatientProcedure actualProcedure) {
		this.actualProcedure = actualProcedure;
	}

	public java.util.Date getProcedureDate() {
		return procedureDate;
	}
	public void setProcedureDate(java.util.Date procedureDate) {
		this.procedureDate = procedureDate;
	}

	public ims.core.resource.place.domain.objects.Location getTheatre() {
		return theatre;
	}
	public void setTheatre(ims.core.resource.place.domain.objects.Location theatre) {
		this.theatre = theatre;
	}

	public java.util.Date getIntoPacuTime() {
		return intoPacuTime;
	}
	public void setIntoPacuTime(java.util.Date intoPacuTime) {
		this.intoPacuTime = intoPacuTime;
	}

	public java.util.Date getAnaesthetistStartTime() {
		return anaesthetistStartTime;
	}
	public void setAnaesthetistStartTime(java.util.Date anaesthetistStartTime) {
		this.anaesthetistStartTime = anaesthetistStartTime;
	}

	public java.util.Date getInTheatreTime() {
		return inTheatreTime;
	}
	public void setInTheatreTime(java.util.Date inTheatreTime) {
		this.inTheatreTime = inTheatreTime;
	}

	public java.util.Date getSurgeryStartTime() {
		return surgeryStartTime;
	}
	public void setSurgeryStartTime(java.util.Date surgeryStartTime) {
		this.surgeryStartTime = surgeryStartTime;
	}

	public java.util.Date getSurgeryEndTime() {
		return surgeryEndTime;
	}
	public void setSurgeryEndTime(java.util.Date surgeryEndTime) {
		this.surgeryEndTime = surgeryEndTime;
	}

	public java.util.Date getTimeIntoRecovery() {
		return timeIntoRecovery;
	}
	public void setTimeIntoRecovery(java.util.Date timeIntoRecovery) {
		this.timeIntoRecovery = timeIntoRecovery;
	}

	public java.util.Date getTimeOutOfRecovery() {
		return timeOutOfRecovery;
	}
	public void setTimeOutOfRecovery(java.util.Date timeOutOfRecovery) {
		this.timeOutOfRecovery = timeOutOfRecovery;
	}

	public ims.core.resource.people.domain.objects.Hcp getSurgeon() {
		return surgeon;
	}
	public void setSurgeon(ims.core.resource.people.domain.objects.Hcp surgeon) {
		this.surgeon = surgeon;
	}

	public ims.core.resource.people.domain.objects.Hcp getSurgeonAssistant() {
		return surgeonAssistant;
	}
	public void setSurgeonAssistant(ims.core.resource.people.domain.objects.Hcp surgeonAssistant) {
		this.surgeonAssistant = surgeonAssistant;
	}

	public ims.core.resource.people.domain.objects.Hcp getAnaesthetist() {
		return anaesthetist;
	}
	public void setAnaesthetist(ims.core.resource.people.domain.objects.Hcp anaesthetist) {
		this.anaesthetist = anaesthetist;
	}

	public ims.core.resource.people.domain.objects.Hcp getODA() {
		return oDA;
	}
	public void setODA(ims.core.resource.people.domain.objects.Hcp oDA) {
		this.oDA = oDA;
	}

	public ims.core.resource.people.domain.objects.Nurse getScrubNurse() {
		return scrubNurse;
	}
	public void setScrubNurse(ims.core.resource.people.domain.objects.Nurse scrubNurse) {
		this.scrubNurse = scrubNurse;
	}

	public ims.core.resource.people.domain.objects.Nurse getCirculatingNurse() {
		return circulatingNurse;
	}
	public void setCirculatingNurse(ims.core.resource.people.domain.objects.Nurse circulatingNurse) {
		this.circulatingNurse = circulatingNurse;
	}

	public String getOther() {
		return other;
	}
	public void setOther(String other) {
		if ( null != other && other.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for other. Tried to set value: "+
				other);
		}
		this.other = other;
	}

	public ims.core.clinical.domain.objects.IntraOperativeDetails getIntraOperativeDetails() {
		return intraOperativeDetails;
	}
	public void setIntraOperativeDetails(ims.core.clinical.domain.objects.IntraOperativeDetails intraOperativeDetails) {
		this.intraOperativeDetails = intraOperativeDetails;
	}

	public Boolean isWasPlannedProcedure() {
		return wasPlannedProcedure;
	}
	public void setWasPlannedProcedure(Boolean wasPlannedProcedure) {
		this.wasPlannedProcedure = wasPlannedProcedure;
	}

	public Boolean isWasUnplannedProcedure() {
		return wasUnplannedProcedure;
	}
	public void setWasUnplannedProcedure(Boolean wasUnplannedProcedure) {
		this.wasUnplannedProcedure = wasUnplannedProcedure;
	}

	public ims.core.clinical.domain.objects.CataractIntraOperative getCataractIntraOperativeDetail() {
		return cataractIntraOperativeDetail;
	}
	public void setCataractIntraOperativeDetail(ims.core.clinical.domain.objects.CataractIntraOperative cataractIntraOperativeDetail) {
		this.cataractIntraOperativeDetail = cataractIntraOperativeDetail;
	}

	public ims.domain.lookups.LookupInstance getAdmissionType() {
		return admissionType;
	}
	public void setAdmissionType(ims.domain.lookups.LookupInstance admissionType) {
		this.admissionType = admissionType;
	}

	public ims.domain.lookups.LookupInstance getReadmissionType() {
		return readmissionType;
	}
	public void setReadmissionType(ims.domain.lookups.LookupInstance readmissionType) {
		this.readmissionType = readmissionType;
	}

	public String getUniqueLineRefNo() {
		return uniqueLineRefNo;
	}
	public void setUniqueLineRefNo(String uniqueLineRefNo) {
		if ( null != uniqueLineRefNo && uniqueLineRefNo.length() > 8 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for uniqueLineRefNo. Tried to set value: "+
				uniqueLineRefNo);
		}
		this.uniqueLineRefNo = uniqueLineRefNo;
	}

	public Boolean isWasOutputtedToWeeklyReport() {
		return wasOutputtedToWeeklyReport;
	}
	public void setWasOutputtedToWeeklyReport(Boolean wasOutputtedToWeeklyReport) {
		this.wasOutputtedToWeeklyReport = wasOutputtedToWeeklyReport;
	}

	public Boolean isWasOutputtedToMonthlyReport() {
		return wasOutputtedToMonthlyReport;
	}
	public void setWasOutputtedToMonthlyReport(Boolean wasOutputtedToMonthlyReport) {
		this.wasOutputtedToMonthlyReport = wasOutputtedToMonthlyReport;
	}

	public ims.core.admin.pas.domain.objects.PASEvent getPasEvent() {
		return pasEvent;
	}
	public void setPasEvent(ims.core.admin.pas.domain.objects.PASEvent pasEvent) {
		this.pasEvent = pasEvent;
	}

	public ims.domain.lookups.LookupInstance getAnaestheticUsed() {
		return anaestheticUsed;
	}
	public void setAnaestheticUsed(ims.domain.lookups.LookupInstance anaestheticUsed) {
		this.anaestheticUsed = anaestheticUsed;
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
		
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringInformation* :");
		if (authoringInformation != null)
		{
			auditStr.append(toShortClassName(authoringInformation));
				
		    auditStr.append(authoringInformation.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*plannedProcedure* :");
		if (plannedProcedure != null)
		{
			auditStr.append(toShortClassName(plannedProcedure));
				
		    auditStr.append(plannedProcedure.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*actualProcedure* :");
		if (actualProcedure != null)
		{
			auditStr.append(toShortClassName(actualProcedure));
				
		    auditStr.append(actualProcedure.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*procedureDate* :");
		auditStr.append(procedureDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*theatre* :");
		if (theatre != null)
		{
			auditStr.append(toShortClassName(theatre));
				
		    auditStr.append(theatre.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*intoPacuTime* :");
		auditStr.append(intoPacuTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*anaesthetistStartTime* :");
		auditStr.append(anaesthetistStartTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*inTheatreTime* :");
		auditStr.append(inTheatreTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*surgeryStartTime* :");
		auditStr.append(surgeryStartTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*surgeryEndTime* :");
		auditStr.append(surgeryEndTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*timeIntoRecovery* :");
		auditStr.append(timeIntoRecovery);
	    auditStr.append("; ");
		auditStr.append("\r\n*timeOutOfRecovery* :");
		auditStr.append(timeOutOfRecovery);
	    auditStr.append("; ");
		auditStr.append("\r\n*surgeon* :");
		if (surgeon != null)
		{
			auditStr.append(toShortClassName(surgeon));
				
		    auditStr.append(surgeon.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*surgeonAssistant* :");
		if (surgeonAssistant != null)
		{
			auditStr.append(toShortClassName(surgeonAssistant));
				
		    auditStr.append(surgeonAssistant.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*anaesthetist* :");
		if (anaesthetist != null)
		{
			auditStr.append(toShortClassName(anaesthetist));
				
		    auditStr.append(anaesthetist.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*oDA* :");
		if (oDA != null)
		{
			auditStr.append(toShortClassName(oDA));
				
		    auditStr.append(oDA.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*scrubNurse* :");
		if (scrubNurse != null)
		{
			auditStr.append(toShortClassName(scrubNurse));
				
		    auditStr.append(scrubNurse.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*circulatingNurse* :");
		if (circulatingNurse != null)
		{
			auditStr.append(toShortClassName(circulatingNurse));
				
		    auditStr.append(circulatingNurse.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*other* :");
		auditStr.append(other);
	    auditStr.append("; ");
		auditStr.append("\r\n*intraOperativeDetails* :");
		if (intraOperativeDetails != null)
		{
			auditStr.append(toShortClassName(intraOperativeDetails));
				
		    auditStr.append(intraOperativeDetails.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*wasPlannedProcedure* :");
		auditStr.append(wasPlannedProcedure);
	    auditStr.append("; ");
		auditStr.append("\r\n*wasUnplannedProcedure* :");
		auditStr.append(wasUnplannedProcedure);
	    auditStr.append("; ");
		auditStr.append("\r\n*cataractIntraOperativeDetail* :");
		if (cataractIntraOperativeDetail != null)
		{
			auditStr.append(toShortClassName(cataractIntraOperativeDetail));
				
		    auditStr.append(cataractIntraOperativeDetail.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*admissionType* :");
		if (admissionType != null)
			auditStr.append(admissionType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*readmissionType* :");
		if (readmissionType != null)
			auditStr.append(readmissionType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*uniqueLineRefNo* :");
		auditStr.append(uniqueLineRefNo);
	    auditStr.append("; ");
		auditStr.append("\r\n*wasOutputtedToWeeklyReport* :");
		auditStr.append(wasOutputtedToWeeklyReport);
	    auditStr.append("; ");
		auditStr.append("\r\n*wasOutputtedToMonthlyReport* :");
		auditStr.append(wasOutputtedToMonthlyReport);
	    auditStr.append("; ");
		auditStr.append("\r\n*pasEvent* :");
		if (pasEvent != null)
		{
			auditStr.append(toShortClassName(pasEvent));
				
		    auditStr.append(pasEvent.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*anaestheticUsed* :");
		if (anaestheticUsed != null)
			auditStr.append(anaestheticUsed.getText());
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
		
		String keyClassName = "IntraOperativeCareRecord";
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
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
		}
		if (this.getAuthoringInformation() != null)
		{
			sb.append("<authoringInformation>");
			sb.append(this.getAuthoringInformation().toXMLString(domMap)); 	
			sb.append("</authoringInformation>");		
		}
		if (this.getPlannedProcedure() != null)
		{
			sb.append("<plannedProcedure>");
			sb.append(this.getPlannedProcedure().toXMLString(domMap)); 	
			sb.append("</plannedProcedure>");		
		}
		if (this.getActualProcedure() != null)
		{
			sb.append("<actualProcedure>");
			sb.append(this.getActualProcedure().toXMLString(domMap)); 	
			sb.append("</actualProcedure>");		
		}
		if (this.getProcedureDate() != null)
		{
			sb.append("<procedureDate>");
			sb.append(new ims.framework.utils.DateTime(this.getProcedureDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</procedureDate>");		
		}
		if (this.getTheatre() != null)
		{
			sb.append("<theatre>");
			sb.append(this.getTheatre().toXMLString(domMap)); 	
			sb.append("</theatre>");		
		}
		if (this.getIntoPacuTime() != null)
		{
			sb.append("<intoPacuTime>");
			sb.append(new ims.framework.utils.DateTime(this.getIntoPacuTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</intoPacuTime>");		
		}
		if (this.getAnaesthetistStartTime() != null)
		{
			sb.append("<anaesthetistStartTime>");
			sb.append(new ims.framework.utils.DateTime(this.getAnaesthetistStartTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</anaesthetistStartTime>");		
		}
		if (this.getInTheatreTime() != null)
		{
			sb.append("<inTheatreTime>");
			sb.append(new ims.framework.utils.DateTime(this.getInTheatreTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</inTheatreTime>");		
		}
		if (this.getSurgeryStartTime() != null)
		{
			sb.append("<surgeryStartTime>");
			sb.append(new ims.framework.utils.DateTime(this.getSurgeryStartTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</surgeryStartTime>");		
		}
		if (this.getSurgeryEndTime() != null)
		{
			sb.append("<surgeryEndTime>");
			sb.append(new ims.framework.utils.DateTime(this.getSurgeryEndTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</surgeryEndTime>");		
		}
		if (this.getTimeIntoRecovery() != null)
		{
			sb.append("<timeIntoRecovery>");
			sb.append(new ims.framework.utils.DateTime(this.getTimeIntoRecovery()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</timeIntoRecovery>");		
		}
		if (this.getTimeOutOfRecovery() != null)
		{
			sb.append("<timeOutOfRecovery>");
			sb.append(new ims.framework.utils.DateTime(this.getTimeOutOfRecovery()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</timeOutOfRecovery>");		
		}
		if (this.getSurgeon() != null)
		{
			sb.append("<surgeon>");
			sb.append(this.getSurgeon().toXMLString(domMap)); 	
			sb.append("</surgeon>");		
		}
		if (this.getSurgeonAssistant() != null)
		{
			sb.append("<surgeonAssistant>");
			sb.append(this.getSurgeonAssistant().toXMLString(domMap)); 	
			sb.append("</surgeonAssistant>");		
		}
		if (this.getAnaesthetist() != null)
		{
			sb.append("<anaesthetist>");
			sb.append(this.getAnaesthetist().toXMLString(domMap)); 	
			sb.append("</anaesthetist>");		
		}
		if (this.getODA() != null)
		{
			sb.append("<oDA>");
			sb.append(this.getODA().toXMLString(domMap)); 	
			sb.append("</oDA>");		
		}
		if (this.getScrubNurse() != null)
		{
			sb.append("<scrubNurse>");
			sb.append(this.getScrubNurse().toXMLString(domMap)); 	
			sb.append("</scrubNurse>");		
		}
		if (this.getCirculatingNurse() != null)
		{
			sb.append("<circulatingNurse>");
			sb.append(this.getCirculatingNurse().toXMLString(domMap)); 	
			sb.append("</circulatingNurse>");		
		}
		if (this.getOther() != null)
		{
			sb.append("<other>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOther().toString()));
			sb.append("</other>");		
		}
		if (this.getIntraOperativeDetails() != null)
		{
			sb.append("<intraOperativeDetails>");
			sb.append(this.getIntraOperativeDetails().toXMLString(domMap)); 	
			sb.append("</intraOperativeDetails>");		
		}
		if (this.isWasPlannedProcedure() != null)
		{
			sb.append("<wasPlannedProcedure>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isWasPlannedProcedure().toString()));
			sb.append("</wasPlannedProcedure>");		
		}
		if (this.isWasUnplannedProcedure() != null)
		{
			sb.append("<wasUnplannedProcedure>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isWasUnplannedProcedure().toString()));
			sb.append("</wasUnplannedProcedure>");		
		}
		if (this.getCataractIntraOperativeDetail() != null)
		{
			sb.append("<cataractIntraOperativeDetail>");
			sb.append(this.getCataractIntraOperativeDetail().toXMLString(domMap)); 	
			sb.append("</cataractIntraOperativeDetail>");		
		}
		if (this.getAdmissionType() != null)
		{
			sb.append("<admissionType>");
			sb.append(this.getAdmissionType().toXMLString()); 
			sb.append("</admissionType>");		
		}
		if (this.getReadmissionType() != null)
		{
			sb.append("<readmissionType>");
			sb.append(this.getReadmissionType().toXMLString()); 
			sb.append("</readmissionType>");		
		}
		if (this.getUniqueLineRefNo() != null)
		{
			sb.append("<uniqueLineRefNo>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getUniqueLineRefNo().toString()));
			sb.append("</uniqueLineRefNo>");		
		}
		if (this.isWasOutputtedToWeeklyReport() != null)
		{
			sb.append("<wasOutputtedToWeeklyReport>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isWasOutputtedToWeeklyReport().toString()));
			sb.append("</wasOutputtedToWeeklyReport>");		
		}
		if (this.isWasOutputtedToMonthlyReport() != null)
		{
			sb.append("<wasOutputtedToMonthlyReport>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isWasOutputtedToMonthlyReport().toString()));
			sb.append("</wasOutputtedToMonthlyReport>");		
		}
		if (this.getPasEvent() != null)
		{
			sb.append("<pasEvent>");
			sb.append(this.getPasEvent().toXMLString(domMap)); 	
			sb.append("</pasEvent>");		
		}
		if (this.getAnaestheticUsed() != null)
		{
			sb.append("<anaestheticUsed>");
			sb.append(this.getAnaestheticUsed().toXMLString()); 
			sb.append("</anaestheticUsed>");		
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
			IntraOperativeCareRecord domainObject = getIntraOperativeCareRecordfromXML(itemEl, factory, domMap);

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
			IntraOperativeCareRecord domainObject = getIntraOperativeCareRecordfromXML(itemEl, factory, domMap);

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
		
	public static IntraOperativeCareRecord getIntraOperativeCareRecordfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getIntraOperativeCareRecordfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static IntraOperativeCareRecord getIntraOperativeCareRecordfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!IntraOperativeCareRecord.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!IntraOperativeCareRecord.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the IntraOperativeCareRecord class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (IntraOperativeCareRecord)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(IntraOperativeCareRecord.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		IntraOperativeCareRecord ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (IntraOperativeCareRecord)factory.getImportedDomainObject(IntraOperativeCareRecord.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new IntraOperativeCareRecord();
		}
		String keyClassName = "IntraOperativeCareRecord";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (IntraOperativeCareRecord)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, IntraOperativeCareRecord obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("authoringInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("plannedProcedure");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPlannedProcedure(ims.core.clinical.domain.objects.PatientProcedure.getPatientProcedurefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("actualProcedure");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setActualProcedure(ims.core.clinical.domain.objects.PatientProcedure.getPatientProcedurefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("procedureDate");
		if(fldEl != null)
		{	
    		obj.setProcedureDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("theatre");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTheatre(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("intoPacuTime");
		if(fldEl != null)
		{	
    		obj.setIntoPacuTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("anaesthetistStartTime");
		if(fldEl != null)
		{	
    		obj.setAnaesthetistStartTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("inTheatreTime");
		if(fldEl != null)
		{	
    		obj.setInTheatreTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("surgeryStartTime");
		if(fldEl != null)
		{	
    		obj.setSurgeryStartTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("surgeryEndTime");
		if(fldEl != null)
		{	
    		obj.setSurgeryEndTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("timeIntoRecovery");
		if(fldEl != null)
		{	
    		obj.setTimeIntoRecovery(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("timeOutOfRecovery");
		if(fldEl != null)
		{	
    		obj.setTimeOutOfRecovery(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("surgeon");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSurgeon(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("surgeonAssistant");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSurgeonAssistant(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("anaesthetist");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAnaesthetist(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("oDA");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setODA(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("scrubNurse");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setScrubNurse(ims.core.resource.people.domain.objects.Nurse.getNursefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("circulatingNurse");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCirculatingNurse(ims.core.resource.people.domain.objects.Nurse.getNursefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("other");
		if(fldEl != null)
		{	
    		obj.setOther(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("intraOperativeDetails");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setIntraOperativeDetails(ims.core.clinical.domain.objects.IntraOperativeDetails.getIntraOperativeDetailsfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("wasPlannedProcedure");
		if(fldEl != null)
		{	
    		obj.setWasPlannedProcedure(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("wasUnplannedProcedure");
		if(fldEl != null)
		{	
    		obj.setWasUnplannedProcedure(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("cataractIntraOperativeDetail");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCataractIntraOperativeDetail(ims.core.clinical.domain.objects.CataractIntraOperative.getCataractIntraOperativefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("admissionType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAdmissionType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("readmissionType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReadmissionType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("uniqueLineRefNo");
		if(fldEl != null)
		{	
    		obj.setUniqueLineRefNo(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("wasOutputtedToWeeklyReport");
		if(fldEl != null)
		{	
    		obj.setWasOutputtedToWeeklyReport(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("wasOutputtedToMonthlyReport");
		if(fldEl != null)
		{	
    		obj.setWasOutputtedToMonthlyReport(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("pasEvent");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPasEvent(ims.core.admin.pas.domain.objects.PASEvent.getPASEventfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("anaestheticUsed");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAnaestheticUsed(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
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
		public static final String CareContext = "careContext";
		public static final String AuthoringInformation = "authoringInformation";
		public static final String PlannedProcedure = "plannedProcedure";
		public static final String ActualProcedure = "actualProcedure";
		public static final String ProcedureDate = "procedureDate";
		public static final String Theatre = "theatre";
		public static final String IntoPacuTime = "intoPacuTime";
		public static final String AnaesthetistStartTime = "anaesthetistStartTime";
		public static final String InTheatreTime = "inTheatreTime";
		public static final String SurgeryStartTime = "surgeryStartTime";
		public static final String SurgeryEndTime = "surgeryEndTime";
		public static final String TimeIntoRecovery = "timeIntoRecovery";
		public static final String TimeOutOfRecovery = "timeOutOfRecovery";
		public static final String Surgeon = "surgeon";
		public static final String SurgeonAssistant = "surgeonAssistant";
		public static final String Anaesthetist = "anaesthetist";
		public static final String ODA = "oDA";
		public static final String ScrubNurse = "scrubNurse";
		public static final String CirculatingNurse = "circulatingNurse";
		public static final String Other = "other";
		public static final String IntraOperativeDetails = "intraOperativeDetails";
		public static final String WasPlannedProcedure = "wasPlannedProcedure";
		public static final String WasUnplannedProcedure = "wasUnplannedProcedure";
		public static final String CataractIntraOperativeDetail = "cataractIntraOperativeDetail";
		public static final String AdmissionType = "admissionType";
		public static final String ReadmissionType = "readmissionType";
		public static final String UniqueLineRefNo = "uniqueLineRefNo";
		public static final String WasOutputtedToWeeklyReport = "wasOutputtedToWeeklyReport";
		public static final String WasOutputtedToMonthlyReport = "wasOutputtedToMonthlyReport";
		public static final String PasEvent = "pasEvent";
		public static final String AnaestheticUsed = "anaestheticUsed";
	}
}

