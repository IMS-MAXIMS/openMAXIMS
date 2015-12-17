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
 * @author Neil McAnaspie
 * Generated.
 */


public class PendingEmergencyTheatre extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1090100024;
	private static final long serialVersionUID = 1090100024L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Patient */
	private ims.core.patient.domain.objects.Patient patient;
	/** Cats Referral */
	private ims.RefMan.domain.objects.CatsReferral catsReferral;
	/** Current Status */
	private ims.domain.lookups.LookupInstance currentStatus;
	/** The patient was an inpatient when added to Pending Theatre List */
	private Boolean wasInpatientWhenAddedToList;
	/** Responsible HCP */
	private ims.core.resource.people.domain.objects.Hcp responsibleHCP;
	/** Urgency Category */
	private ims.domain.lookups.LookupInstance urgencyCategory;
	/** Service */
	private ims.core.clinical.domain.objects.Service service;
	/** PrimaryProcedure */
	private ims.core.clinical.domain.objects.Procedure primaryProcedure;
	/** ProcLaterality */
	private ims.domain.lookups.LookupInstance procLaterality;
	/** Secondary Procedure */
	private ims.core.clinical.domain.objects.Procedure secondaryProcedure;
	/** Secondary Procedure Laterality */
	private ims.domain.lookups.LookupInstance secondaryProcLaterality;
	/** Procedure Details */
	private String procedureDetails;
	/** isEndoscopyProcedure */
	private Boolean isEndoscopyProcedure;
	/** Surgery Time Mins */
	private Integer surgeryTimeMins;
	/** Day Case / Inpatient */
	private ims.domain.lookups.LookupInstance theatreType;
	/** Current Location Of Patient */
	private ims.domain.lookups.LookupInstance currentLocationOfPatient;
	/** ExpectedHospital */
	private ims.core.resource.place.domain.objects.Location expectedHospital;
	/** ExpectedWard */
	private ims.core.resource.place.domain.objects.Location expectedWard;
	/** Expected Date Time */
	private java.util.Date expectedDateTime;
	/** Theatre Appointment Booked */
	private ims.scheduling.domain.objects.Booking_Appointment theatreAppointmentBooked;
	/** RemovedBy */
	private ims.core.resource.people.domain.objects.MemberOfStaff removedBy;
	/** Removal Reason */
	private ims.domain.lookups.LookupInstance removalReason;
	/** Removal Date Time */
	private java.util.Date removalDateTime;
	/** isEndoscopySecondProcedure */
	private Boolean isEndoscopySecondProcedure;
	private ims.core.admin.pas.domain.objects.AdmissionDetail admissionDetail;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PendingEmergencyTheatre (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PendingEmergencyTheatre ()
    {
    	super();
    }
    public PendingEmergencyTheatre (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.scheduling.domain.objects.PendingEmergencyTheatre.class;
	}


	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public static java.util.List listPendingEmergencyTheatreByPatient(ims.domain.ILightweightDomainFactory factory, ims.core.patient.domain.objects.Patient val)
	{
		String hql = "from PendingEmergencyTheatre c where c.patient = :patient";		
		return factory.find(hql, new String[]{"patient"}, new Object[]{val});		
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public ims.RefMan.domain.objects.CatsReferral getCatsReferral() {
		return catsReferral;
	}
	public void setCatsReferral(ims.RefMan.domain.objects.CatsReferral catsReferral) {
		this.catsReferral = catsReferral;
	}

	public ims.domain.lookups.LookupInstance getCurrentStatus() {
		return currentStatus;
	}
	public void setCurrentStatus(ims.domain.lookups.LookupInstance currentStatus) {
		this.currentStatus = currentStatus;
	}

	public Boolean isWasInpatientWhenAddedToList() {
		return wasInpatientWhenAddedToList;
	}
	public void setWasInpatientWhenAddedToList(Boolean wasInpatientWhenAddedToList) {
		this.wasInpatientWhenAddedToList = wasInpatientWhenAddedToList;
	}

	public ims.core.resource.people.domain.objects.Hcp getResponsibleHCP() {
		return responsibleHCP;
	}
	public void setResponsibleHCP(ims.core.resource.people.domain.objects.Hcp responsibleHCP) {
		this.responsibleHCP = responsibleHCP;
	}

	public ims.domain.lookups.LookupInstance getUrgencyCategory() {
		return urgencyCategory;
	}
	public void setUrgencyCategory(ims.domain.lookups.LookupInstance urgencyCategory) {
		this.urgencyCategory = urgencyCategory;
	}

	public ims.core.clinical.domain.objects.Service getService() {
		return service;
	}
	public void setService(ims.core.clinical.domain.objects.Service service) {
		this.service = service;
	}

	public ims.core.clinical.domain.objects.Procedure getPrimaryProcedure() {
		return primaryProcedure;
	}
	public void setPrimaryProcedure(ims.core.clinical.domain.objects.Procedure primaryProcedure) {
		this.primaryProcedure = primaryProcedure;
	}

	public ims.domain.lookups.LookupInstance getProcLaterality() {
		return procLaterality;
	}
	public void setProcLaterality(ims.domain.lookups.LookupInstance procLaterality) {
		this.procLaterality = procLaterality;
	}

	public ims.core.clinical.domain.objects.Procedure getSecondaryProcedure() {
		return secondaryProcedure;
	}
	public void setSecondaryProcedure(ims.core.clinical.domain.objects.Procedure secondaryProcedure) {
		this.secondaryProcedure = secondaryProcedure;
	}

	public ims.domain.lookups.LookupInstance getSecondaryProcLaterality() {
		return secondaryProcLaterality;
	}
	public void setSecondaryProcLaterality(ims.domain.lookups.LookupInstance secondaryProcLaterality) {
		this.secondaryProcLaterality = secondaryProcLaterality;
	}

	public String getProcedureDetails() {
		return procedureDetails;
	}
	public void setProcedureDetails(String procedureDetails) {
		if ( null != procedureDetails && procedureDetails.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for procedureDetails. Tried to set value: "+
				procedureDetails);
		}
		this.procedureDetails = procedureDetails;
	}

	public Boolean isIsEndoscopyProcedure() {
		return isEndoscopyProcedure;
	}
	public void setIsEndoscopyProcedure(Boolean isEndoscopyProcedure) {
		this.isEndoscopyProcedure = isEndoscopyProcedure;
	}

	public Integer getSurgeryTimeMins() {
		return surgeryTimeMins;
	}
	public void setSurgeryTimeMins(Integer surgeryTimeMins) {
		this.surgeryTimeMins = surgeryTimeMins;
	}

	public ims.domain.lookups.LookupInstance getTheatreType() {
		return theatreType;
	}
	public void setTheatreType(ims.domain.lookups.LookupInstance theatreType) {
		this.theatreType = theatreType;
	}

	public ims.domain.lookups.LookupInstance getCurrentLocationOfPatient() {
		return currentLocationOfPatient;
	}
	public void setCurrentLocationOfPatient(ims.domain.lookups.LookupInstance currentLocationOfPatient) {
		this.currentLocationOfPatient = currentLocationOfPatient;
	}

	public ims.core.resource.place.domain.objects.Location getExpectedHospital() {
		return expectedHospital;
	}
	public void setExpectedHospital(ims.core.resource.place.domain.objects.Location expectedHospital) {
		this.expectedHospital = expectedHospital;
	}

	public ims.core.resource.place.domain.objects.Location getExpectedWard() {
		return expectedWard;
	}
	public void setExpectedWard(ims.core.resource.place.domain.objects.Location expectedWard) {
		this.expectedWard = expectedWard;
	}

	public java.util.Date getExpectedDateTime() {
		return expectedDateTime;
	}
	public void setExpectedDateTime(java.util.Date expectedDateTime) {
		this.expectedDateTime = expectedDateTime;
	}

	public ims.scheduling.domain.objects.Booking_Appointment getTheatreAppointmentBooked() {
		return theatreAppointmentBooked;
	}
	public void setTheatreAppointmentBooked(ims.scheduling.domain.objects.Booking_Appointment theatreAppointmentBooked) {
		this.theatreAppointmentBooked = theatreAppointmentBooked;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getRemovedBy() {
		return removedBy;
	}
	public void setRemovedBy(ims.core.resource.people.domain.objects.MemberOfStaff removedBy) {
		this.removedBy = removedBy;
	}

	public ims.domain.lookups.LookupInstance getRemovalReason() {
		return removalReason;
	}
	public void setRemovalReason(ims.domain.lookups.LookupInstance removalReason) {
		this.removalReason = removalReason;
	}

	public java.util.Date getRemovalDateTime() {
		return removalDateTime;
	}
	public void setRemovalDateTime(java.util.Date removalDateTime) {
		this.removalDateTime = removalDateTime;
	}

	public Boolean isIsEndoscopySecondProcedure() {
		return isEndoscopySecondProcedure;
	}
	public void setIsEndoscopySecondProcedure(Boolean isEndoscopySecondProcedure) {
		this.isEndoscopySecondProcedure = isEndoscopySecondProcedure;
	}

	public ims.core.admin.pas.domain.objects.AdmissionDetail getAdmissionDetail() {
		return admissionDetail;
	}
	public void setAdmissionDetail(ims.core.admin.pas.domain.objects.AdmissionDetail admissionDetail) {
		this.admissionDetail = admissionDetail;
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
		
		auditStr.append("\r\n*patient* :");
		if (patient != null)
		{
			auditStr.append(toShortClassName(patient));
				
		    auditStr.append(patient.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*catsReferral* :");
		if (catsReferral != null)
		{
			auditStr.append(toShortClassName(catsReferral));
				
		    auditStr.append(catsReferral.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*currentStatus* :");
		if (currentStatus != null)
			auditStr.append(currentStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*wasInpatientWhenAddedToList* :");
		auditStr.append(wasInpatientWhenAddedToList);
	    auditStr.append("; ");
		auditStr.append("\r\n*responsibleHCP* :");
		if (responsibleHCP != null)
		{
			auditStr.append(toShortClassName(responsibleHCP));
				
		    auditStr.append(responsibleHCP.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*urgencyCategory* :");
		if (urgencyCategory != null)
			auditStr.append(urgencyCategory.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*service* :");
		if (service != null)
		{
			auditStr.append(toShortClassName(service));
				
		    auditStr.append(service.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*primaryProcedure* :");
		if (primaryProcedure != null)
		{
			auditStr.append(toShortClassName(primaryProcedure));
				
		    auditStr.append(primaryProcedure.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*procLaterality* :");
		if (procLaterality != null)
			auditStr.append(procLaterality.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*secondaryProcedure* :");
		if (secondaryProcedure != null)
		{
			auditStr.append(toShortClassName(secondaryProcedure));
				
		    auditStr.append(secondaryProcedure.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*secondaryProcLaterality* :");
		if (secondaryProcLaterality != null)
			auditStr.append(secondaryProcLaterality.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*procedureDetails* :");
		auditStr.append(procedureDetails);
	    auditStr.append("; ");
		auditStr.append("\r\n*isEndoscopyProcedure* :");
		auditStr.append(isEndoscopyProcedure);
	    auditStr.append("; ");
		auditStr.append("\r\n*surgeryTimeMins* :");
		auditStr.append(surgeryTimeMins);
	    auditStr.append("; ");
		auditStr.append("\r\n*theatreType* :");
		if (theatreType != null)
			auditStr.append(theatreType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*currentLocationOfPatient* :");
		if (currentLocationOfPatient != null)
			auditStr.append(currentLocationOfPatient.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*expectedHospital* :");
		if (expectedHospital != null)
		{
			auditStr.append(toShortClassName(expectedHospital));
				
		    auditStr.append(expectedHospital.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*expectedWard* :");
		if (expectedWard != null)
		{
			auditStr.append(toShortClassName(expectedWard));
				
		    auditStr.append(expectedWard.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*expectedDateTime* :");
		auditStr.append(expectedDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*theatreAppointmentBooked* :");
		if (theatreAppointmentBooked != null)
		{
			auditStr.append(toShortClassName(theatreAppointmentBooked));
				
		    auditStr.append(theatreAppointmentBooked.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*removedBy* :");
		if (removedBy != null)
		{
			auditStr.append(toShortClassName(removedBy));
				
		    auditStr.append(removedBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*removalReason* :");
		if (removalReason != null)
			auditStr.append(removalReason.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*removalDateTime* :");
		auditStr.append(removalDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*isEndoscopySecondProcedure* :");
		auditStr.append(isEndoscopySecondProcedure);
	    auditStr.append("; ");
		auditStr.append("\r\n*admissionDetail* :");
		if (admissionDetail != null)
		{
			auditStr.append(toShortClassName(admissionDetail));
				
		    auditStr.append(admissionDetail.getId());
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
		
		String keyClassName = "PendingEmergencyTheatre";
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
		if (this.getPatient() != null)
		{
			sb.append("<patient>");
			sb.append(this.getPatient().toXMLString(domMap)); 	
			sb.append("</patient>");		
		}
		if (this.getCatsReferral() != null)
		{
			sb.append("<catsReferral>");
			sb.append(this.getCatsReferral().toXMLString(domMap)); 	
			sb.append("</catsReferral>");		
		}
		if (this.getCurrentStatus() != null)
		{
			sb.append("<currentStatus>");
			sb.append(this.getCurrentStatus().toXMLString()); 
			sb.append("</currentStatus>");		
		}
		if (this.isWasInpatientWhenAddedToList() != null)
		{
			sb.append("<wasInpatientWhenAddedToList>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isWasInpatientWhenAddedToList().toString()));
			sb.append("</wasInpatientWhenAddedToList>");		
		}
		if (this.getResponsibleHCP() != null)
		{
			sb.append("<responsibleHCP>");
			sb.append(this.getResponsibleHCP().toXMLString(domMap)); 	
			sb.append("</responsibleHCP>");		
		}
		if (this.getUrgencyCategory() != null)
		{
			sb.append("<urgencyCategory>");
			sb.append(this.getUrgencyCategory().toXMLString()); 
			sb.append("</urgencyCategory>");		
		}
		if (this.getService() != null)
		{
			sb.append("<service>");
			sb.append(this.getService().toXMLString(domMap)); 	
			sb.append("</service>");		
		}
		if (this.getPrimaryProcedure() != null)
		{
			sb.append("<primaryProcedure>");
			sb.append(this.getPrimaryProcedure().toXMLString(domMap)); 	
			sb.append("</primaryProcedure>");		
		}
		if (this.getProcLaterality() != null)
		{
			sb.append("<procLaterality>");
			sb.append(this.getProcLaterality().toXMLString()); 
			sb.append("</procLaterality>");		
		}
		if (this.getSecondaryProcedure() != null)
		{
			sb.append("<secondaryProcedure>");
			sb.append(this.getSecondaryProcedure().toXMLString(domMap)); 	
			sb.append("</secondaryProcedure>");		
		}
		if (this.getSecondaryProcLaterality() != null)
		{
			sb.append("<secondaryProcLaterality>");
			sb.append(this.getSecondaryProcLaterality().toXMLString()); 
			sb.append("</secondaryProcLaterality>");		
		}
		if (this.getProcedureDetails() != null)
		{
			sb.append("<procedureDetails>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getProcedureDetails().toString()));
			sb.append("</procedureDetails>");		
		}
		if (this.isIsEndoscopyProcedure() != null)
		{
			sb.append("<isEndoscopyProcedure>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsEndoscopyProcedure().toString()));
			sb.append("</isEndoscopyProcedure>");		
		}
		if (this.getSurgeryTimeMins() != null)
		{
			sb.append("<surgeryTimeMins>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSurgeryTimeMins().toString()));
			sb.append("</surgeryTimeMins>");		
		}
		if (this.getTheatreType() != null)
		{
			sb.append("<theatreType>");
			sb.append(this.getTheatreType().toXMLString()); 
			sb.append("</theatreType>");		
		}
		if (this.getCurrentLocationOfPatient() != null)
		{
			sb.append("<currentLocationOfPatient>");
			sb.append(this.getCurrentLocationOfPatient().toXMLString()); 
			sb.append("</currentLocationOfPatient>");		
		}
		if (this.getExpectedHospital() != null)
		{
			sb.append("<expectedHospital>");
			sb.append(this.getExpectedHospital().toXMLString(domMap)); 	
			sb.append("</expectedHospital>");		
		}
		if (this.getExpectedWard() != null)
		{
			sb.append("<expectedWard>");
			sb.append(this.getExpectedWard().toXMLString(domMap)); 	
			sb.append("</expectedWard>");		
		}
		if (this.getExpectedDateTime() != null)
		{
			sb.append("<expectedDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getExpectedDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</expectedDateTime>");		
		}
		if (this.getTheatreAppointmentBooked() != null)
		{
			sb.append("<theatreAppointmentBooked>");
			sb.append(this.getTheatreAppointmentBooked().toXMLString(domMap)); 	
			sb.append("</theatreAppointmentBooked>");		
		}
		if (this.getRemovedBy() != null)
		{
			sb.append("<removedBy>");
			sb.append(this.getRemovedBy().toXMLString(domMap)); 	
			sb.append("</removedBy>");		
		}
		if (this.getRemovalReason() != null)
		{
			sb.append("<removalReason>");
			sb.append(this.getRemovalReason().toXMLString()); 
			sb.append("</removalReason>");		
		}
		if (this.getRemovalDateTime() != null)
		{
			sb.append("<removalDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getRemovalDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</removalDateTime>");		
		}
		if (this.isIsEndoscopySecondProcedure() != null)
		{
			sb.append("<isEndoscopySecondProcedure>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsEndoscopySecondProcedure().toString()));
			sb.append("</isEndoscopySecondProcedure>");		
		}
		if (this.getAdmissionDetail() != null)
		{
			sb.append("<admissionDetail>");
			sb.append(this.getAdmissionDetail().toXMLString(domMap)); 	
			sb.append("</admissionDetail>");		
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
			PendingEmergencyTheatre domainObject = getPendingEmergencyTheatrefromXML(itemEl, factory, domMap);

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
			PendingEmergencyTheatre domainObject = getPendingEmergencyTheatrefromXML(itemEl, factory, domMap);

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
		
	public static PendingEmergencyTheatre getPendingEmergencyTheatrefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPendingEmergencyTheatrefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PendingEmergencyTheatre getPendingEmergencyTheatrefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PendingEmergencyTheatre.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PendingEmergencyTheatre.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PendingEmergencyTheatre class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PendingEmergencyTheatre)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PendingEmergencyTheatre.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PendingEmergencyTheatre ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PendingEmergencyTheatre)factory.getImportedDomainObject(PendingEmergencyTheatre.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PendingEmergencyTheatre();
		}
		String keyClassName = "PendingEmergencyTheatre";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PendingEmergencyTheatre)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PendingEmergencyTheatre obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("catsReferral");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCatsReferral(ims.RefMan.domain.objects.CatsReferral.getCatsReferralfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("currentStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCurrentStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("wasInpatientWhenAddedToList");
		if(fldEl != null)
		{	
    		obj.setWasInpatientWhenAddedToList(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("responsibleHCP");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setResponsibleHCP(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("urgencyCategory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setUrgencyCategory(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("service");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setService(ims.core.clinical.domain.objects.Service.getServicefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("primaryProcedure");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPrimaryProcedure(ims.core.clinical.domain.objects.Procedure.getProcedurefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("procLaterality");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setProcLaterality(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("secondaryProcedure");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setSecondaryProcedure(ims.core.clinical.domain.objects.Procedure.getProcedurefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("secondaryProcLaterality");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSecondaryProcLaterality(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("procedureDetails");
		if(fldEl != null)
		{	
    		obj.setProcedureDetails(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isEndoscopyProcedure");
		if(fldEl != null)
		{	
    		obj.setIsEndoscopyProcedure(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("surgeryTimeMins");
		if(fldEl != null)
		{	
    		obj.setSurgeryTimeMins(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("theatreType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTheatreType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("currentLocationOfPatient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCurrentLocationOfPatient(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("expectedHospital");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setExpectedHospital(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("expectedWard");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setExpectedWard(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("expectedDateTime");
		if(fldEl != null)
		{	
    		obj.setExpectedDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("theatreAppointmentBooked");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTheatreAppointmentBooked(ims.scheduling.domain.objects.Booking_Appointment.getBooking_AppointmentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("removedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRemovedBy(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("removalReason");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setRemovalReason(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("removalDateTime");
		if(fldEl != null)
		{	
    		obj.setRemovalDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("isEndoscopySecondProcedure");
		if(fldEl != null)
		{	
    		obj.setIsEndoscopySecondProcedure(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("admissionDetail");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAdmissionDetail(ims.core.admin.pas.domain.objects.AdmissionDetail.getAdmissionDetailfromXML(fldEl, factory, domMap)); 
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
		public static final String Patient = "patient";
		public static final String CatsReferral = "catsReferral";
		public static final String CurrentStatus = "currentStatus";
		public static final String WasInpatientWhenAddedToList = "wasInpatientWhenAddedToList";
		public static final String ResponsibleHCP = "responsibleHCP";
		public static final String UrgencyCategory = "urgencyCategory";
		public static final String Service = "service";
		public static final String PrimaryProcedure = "primaryProcedure";
		public static final String ProcLaterality = "procLaterality";
		public static final String SecondaryProcedure = "secondaryProcedure";
		public static final String SecondaryProcLaterality = "secondaryProcLaterality";
		public static final String ProcedureDetails = "procedureDetails";
		public static final String IsEndoscopyProcedure = "isEndoscopyProcedure";
		public static final String SurgeryTimeMins = "surgeryTimeMins";
		public static final String TheatreType = "theatreType";
		public static final String CurrentLocationOfPatient = "currentLocationOfPatient";
		public static final String ExpectedHospital = "expectedHospital";
		public static final String ExpectedWard = "expectedWard";
		public static final String ExpectedDateTime = "expectedDateTime";
		public static final String TheatreAppointmentBooked = "theatreAppointmentBooked";
		public static final String RemovedBy = "removedBy";
		public static final String RemovalReason = "removalReason";
		public static final String RemovalDateTime = "removalDateTime";
		public static final String IsEndoscopySecondProcedure = "isEndoscopySecondProcedure";
		public static final String AdmissionDetail = "admissionDetail";
	}
}

