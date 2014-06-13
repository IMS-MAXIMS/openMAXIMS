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
package ims.ocrr.orderingresults.domain.objects;

/**
 * 
 * @author Kevin O'Carroll
 * Generated.
 */


public class OcsOrderSession extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable , ims.framework.interfaces.IEntityNotification{
	public static final int CLASSID = 1070100000;
	private static final long serialVersionUID = 1070100000L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** ClinicalContact */
	private ims.core.admin.domain.objects.ClinicalContact clinicalContact;
	/** Patient */
	private ims.core.patient.domain.objects.Patient patient;
	/** Investigation and Collection Method
	  * Collection of ims.ocrr.orderingresults.domain.objects.OrderInvestigation.
	  */
	private java.util.Set investigations;
	/** Ordered By */
	private ims.core.resource.people.domain.objects.MemberOfStaff orderedBy;
	/** Responsible HCP */
	private ims.core.resource.people.domain.objects.Hcp responsibleClinician;
	/** Applies only to GP placed Orders. */
	private ims.core.resource.people.domain.objects.Gp responsibleGp;
	/** Patient Location. (Ward etc.) */
	private ims.core.resource.place.domain.objects.Location patientLocation;
	/** PatientClinic (filled only if PatientLocation is empty) */
	private ims.core.resource.place.domain.objects.Clinic patientClinic;
	/** HCPs to be alerted
	  * Collection of ims.ocrr.orderingresults.domain.objects.OrderHCPAlert.
	  */
	private java.util.Set hcpAlerts;
	/** Clinical Trial */
	private Boolean clinicalTrial;
	/** Clinical Trial Text */
	private String clinicalTrialTxt;
	/** Clinical Information - Questions Answered */
	private ims.ocrr.orderingresults.domain.objects.OcsQASession clinicalInfo;
	/** Additional Clinical Notes */
	private String additClinNotes;
	/** Patient Mobility */
	private ims.domain.lookups.LookupInstance patMobility;
	/** OrderCategory */
	private ims.domain.lookups.LookupInstance orderCategory;
	/** ReportTo
	  * Collection of ims.ocrr.orderingresults.domain.objects.OcsReportTo.
	  */
	private java.util.List reportTo;
	/** 
	  * Collection of ims.ocrr.orderingresults.domain.objects.OrderSpecimen.
	  */
	private java.util.Set specimens;
	/** False for Maxims placed orders. True for unsolicited Orders */
	private Boolean wasProcessed;
	/** Authorisation Order Status */
	private ims.domain.lookups.LookupInstance authorisationOrderStatus;
	/** Specify whether this order has been discarded from message generation */
	private Boolean wasDiscarded;
	/** care context in which the order was placed. Required if flag CREATE_ORDERS_WITH_CARECONTEXT_ONLY */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** GHG specific: Hospital to associate the PADID with see wdev-8997 */
	private ims.core.resource.place.domain.objects.LocSite orderingHospital;
	/** True when the order has new or updated results */
	private Boolean hasNewOrUpdatedResults;
	/** Bed Number at time of Ordering */
	private String bedNumber;
	/** When processing Order use Number available for ORC.1 */
	private Boolean sendNumber;
	/** Outpatient Department */
	private ims.core.resource.place.domain.objects.Location outpatientDept;
	/** Summary Clinical Information */
	private String summaryClinicalInformation;
	/** Bleep/Ext No. - Type will be Bleep Number (-803) */
	private String bleepExtNumber;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public OcsOrderSession (Integer id, int ver)
    {
    	super(id, ver);
    }
    public OcsOrderSession ()
    {
    	super();
    }
    public OcsOrderSession (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.ocrr.orderingresults.domain.objects.OcsOrderSession.class;
	}


	public ims.core.admin.domain.objects.ClinicalContact getClinicalContact() {
		return clinicalContact;
	}
	public void setClinicalContact(ims.core.admin.domain.objects.ClinicalContact clinicalContact) {
		this.clinicalContact = clinicalContact;
	}

	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
	}

	public java.util.Set getInvestigations() {
		if ( null == investigations ) {
			investigations = new java.util.HashSet();
		}
		return investigations;
	}
	public void setInvestigations(java.util.Set paramValue) {
		this.investigations = paramValue;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getOrderedBy() {
		return orderedBy;
	}
	public void setOrderedBy(ims.core.resource.people.domain.objects.MemberOfStaff orderedBy) {
		this.orderedBy = orderedBy;
	}

	public ims.core.resource.people.domain.objects.Hcp getResponsibleClinician() {
		return responsibleClinician;
	}
	public void setResponsibleClinician(ims.core.resource.people.domain.objects.Hcp responsibleClinician) {
		this.responsibleClinician = responsibleClinician;
	}

	public ims.core.resource.people.domain.objects.Gp getResponsibleGp() {
		return responsibleGp;
	}
	public void setResponsibleGp(ims.core.resource.people.domain.objects.Gp responsibleGp) {
		this.responsibleGp = responsibleGp;
	}

	public ims.core.resource.place.domain.objects.Location getPatientLocation() {
		return patientLocation;
	}
	public void setPatientLocation(ims.core.resource.place.domain.objects.Location patientLocation) {
		this.patientLocation = patientLocation;
	}

	public ims.core.resource.place.domain.objects.Clinic getPatientClinic() {
		return patientClinic;
	}
	public void setPatientClinic(ims.core.resource.place.domain.objects.Clinic patientClinic) {
		this.patientClinic = patientClinic;
	}

	public java.util.Set getHcpAlerts() {
		if ( null == hcpAlerts ) {
			hcpAlerts = new java.util.HashSet();
		}
		return hcpAlerts;
	}
	public void setHcpAlerts(java.util.Set paramValue) {
		this.hcpAlerts = paramValue;
	}

	public Boolean isClinicalTrial() {
		return clinicalTrial;
	}
	public void setClinicalTrial(Boolean clinicalTrial) {
		this.clinicalTrial = clinicalTrial;
	}

	public String getClinicalTrialTxt() {
		return clinicalTrialTxt;
	}
	public void setClinicalTrialTxt(String clinicalTrialTxt) {
		if ( null != clinicalTrialTxt && clinicalTrialTxt.length() > 150 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for clinicalTrialTxt. Tried to set value: "+
				clinicalTrialTxt);
		}
		this.clinicalTrialTxt = clinicalTrialTxt;
	}

	public ims.ocrr.orderingresults.domain.objects.OcsQASession getClinicalInfo() {
		return clinicalInfo;
	}
	public void setClinicalInfo(ims.ocrr.orderingresults.domain.objects.OcsQASession clinicalInfo) {
		this.clinicalInfo = clinicalInfo;
	}

	public String getAdditClinNotes() {
		return additClinNotes;
	}
	public void setAdditClinNotes(String additClinNotes) {
		this.additClinNotes = additClinNotes;
	}

	public ims.domain.lookups.LookupInstance getPatMobility() {
		return patMobility;
	}
	public void setPatMobility(ims.domain.lookups.LookupInstance patMobility) {
		this.patMobility = patMobility;
	}

	public ims.domain.lookups.LookupInstance getOrderCategory() {
		return orderCategory;
	}
	public void setOrderCategory(ims.domain.lookups.LookupInstance orderCategory) {
		this.orderCategory = orderCategory;
	}

	public java.util.List getReportTo() {
		if ( null == reportTo ) {
			reportTo = new java.util.ArrayList();
		}
		return reportTo;
	}
	public void setReportTo(java.util.List paramValue) {
		this.reportTo = paramValue;
	}

	public java.util.Set getSpecimens() {
		if ( null == specimens ) {
			specimens = new java.util.HashSet();
		}
		return specimens;
	}
	public void setSpecimens(java.util.Set paramValue) {
		this.specimens = paramValue;
	}

	public Boolean isWasProcessed() {
		return wasProcessed;
	}
	public void setWasProcessed(Boolean wasProcessed) {
		this.wasProcessed = wasProcessed;
	}

	public ims.domain.lookups.LookupInstance getAuthorisationOrderStatus() {
		return authorisationOrderStatus;
	}
	public void setAuthorisationOrderStatus(ims.domain.lookups.LookupInstance authorisationOrderStatus) {
		this.authorisationOrderStatus = authorisationOrderStatus;
	}

	public Boolean isWasDiscarded() {
		return wasDiscarded;
	}
	public void setWasDiscarded(Boolean wasDiscarded) {
		this.wasDiscarded = wasDiscarded;
	}

	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public ims.core.resource.place.domain.objects.LocSite getOrderingHospital() {
		return orderingHospital;
	}
	public void setOrderingHospital(ims.core.resource.place.domain.objects.LocSite orderingHospital) {
		this.orderingHospital = orderingHospital;
	}

	public Boolean isHasNewOrUpdatedResults() {
		return hasNewOrUpdatedResults;
	}
	public void setHasNewOrUpdatedResults(Boolean hasNewOrUpdatedResults) {
		this.hasNewOrUpdatedResults = hasNewOrUpdatedResults;
	}

	public String getBedNumber() {
		return bedNumber;
	}
	public void setBedNumber(String bedNumber) {
		if ( null != bedNumber && bedNumber.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for bedNumber. Tried to set value: "+
				bedNumber);
		}
		this.bedNumber = bedNumber;
	}

	public Boolean isSendNumber() {
		return sendNumber;
	}
	public void setSendNumber(Boolean sendNumber) {
		this.sendNumber = sendNumber;
	}

	public ims.core.resource.place.domain.objects.Location getOutpatientDept() {
		return outpatientDept;
	}
	public void setOutpatientDept(ims.core.resource.place.domain.objects.Location outpatientDept) {
		this.outpatientDept = outpatientDept;
	}

	public String getSummaryClinicalInformation() {
		return summaryClinicalInformation;
	}
	public void setSummaryClinicalInformation(String summaryClinicalInformation) {
		if ( null != summaryClinicalInformation && summaryClinicalInformation.length() > 2000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for summaryClinicalInformation. Tried to set value: "+
				summaryClinicalInformation);
		}
		this.summaryClinicalInformation = summaryClinicalInformation;
	}

	public String getBleepExtNumber() {
		return bleepExtNumber;
	}
	public void setBleepExtNumber(String bleepExtNumber) {
		if ( null != bleepExtNumber && bleepExtNumber.length() > 50 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for bleepExtNumber. Tried to set value: "+
				bleepExtNumber);
		}
		this.bleepExtNumber = bleepExtNumber;
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
		
		auditStr.append("\r\n*clinicalContact* :");
		if (clinicalContact != null)
		{
			auditStr.append(toShortClassName(clinicalContact));
				
		    auditStr.append(clinicalContact.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*patient* :");
		if (patient != null)
		{
			auditStr.append(toShortClassName(patient));
				
		    auditStr.append(patient.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*investigations* :");
		if (investigations != null)
		{
			java.util.Iterator it3 = investigations.iterator();
			int i3=0;
			while (it3.hasNext())
			{
				if (i3 > 0)
					auditStr.append(",");
				ims.ocrr.orderingresults.domain.objects.OrderInvestigation obj = (ims.ocrr.orderingresults.domain.objects.OrderInvestigation)it3.next();
		if (obj != null)
		{
		   if (i3 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i3++;
		}
		if (i3 > 0)
			auditStr.append("] " + i3);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*orderedBy* :");
		if (orderedBy != null)
		{
			auditStr.append(toShortClassName(orderedBy));
				
		    auditStr.append(orderedBy.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*responsibleClinician* :");
		if (responsibleClinician != null)
		{
			auditStr.append(toShortClassName(responsibleClinician));
				
		    auditStr.append(responsibleClinician.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*responsibleGp* :");
		if (responsibleGp != null)
		{
			auditStr.append(toShortClassName(responsibleGp));
				
		    auditStr.append(responsibleGp.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*patientLocation* :");
		if (patientLocation != null)
		{
			auditStr.append(toShortClassName(patientLocation));
				
		    auditStr.append(patientLocation.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*patientClinic* :");
		if (patientClinic != null)
		{
			auditStr.append(toShortClassName(patientClinic));
				
		    auditStr.append(patientClinic.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*hcpAlerts* :");
		if (hcpAlerts != null)
		{
			java.util.Iterator it9 = hcpAlerts.iterator();
			int i9=0;
			while (it9.hasNext())
			{
				if (i9 > 0)
					auditStr.append(",");
				ims.ocrr.orderingresults.domain.objects.OrderHCPAlert obj = (ims.ocrr.orderingresults.domain.objects.OrderHCPAlert)it9.next();
		if (obj != null)
		{
		   if (i9 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i9++;
		}
		if (i9 > 0)
			auditStr.append("] " + i9);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*clinicalTrial* :");
		auditStr.append(clinicalTrial);
	    auditStr.append("; ");
		auditStr.append("\r\n*clinicalTrialTxt* :");
		auditStr.append(clinicalTrialTxt);
	    auditStr.append("; ");
		auditStr.append("\r\n*clinicalInfo* :");
		if (clinicalInfo != null)
		{
			auditStr.append(toShortClassName(clinicalInfo));
				
		    auditStr.append(clinicalInfo.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*additClinNotes* :");
		auditStr.append(additClinNotes);
	    auditStr.append("; ");
		auditStr.append("\r\n*patMobility* :");
		if (patMobility != null)
			auditStr.append(patMobility.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*orderCategory* :");
		if (orderCategory != null)
			auditStr.append(orderCategory.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*reportTo* :");
		if (reportTo != null)
		{
		int i16=0;
		for (i16=0; i16<reportTo.size(); i16++)
		{
			if (i16 > 0)
				auditStr.append(",");
			ims.ocrr.orderingresults.domain.objects.OcsReportTo obj = (ims.ocrr.orderingresults.domain.objects.OcsReportTo)reportTo.get(i16);
		    if (obj != null)
			{
				if (i16 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i16 > 0)
			auditStr.append("] " + i16);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*specimens* :");
		if (specimens != null)
		{
			java.util.Iterator it17 = specimens.iterator();
			int i17=0;
			while (it17.hasNext())
			{
				if (i17 > 0)
					auditStr.append(",");
				ims.ocrr.orderingresults.domain.objects.OrderSpecimen obj = (ims.ocrr.orderingresults.domain.objects.OrderSpecimen)it17.next();
		if (obj != null)
		{
		   if (i17 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i17++;
		}
		if (i17 > 0)
			auditStr.append("] " + i17);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*wasProcessed* :");
		auditStr.append(wasProcessed);
	    auditStr.append("; ");
		auditStr.append("\r\n*authorisationOrderStatus* :");
		if (authorisationOrderStatus != null)
			auditStr.append(authorisationOrderStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*wasDiscarded* :");
		auditStr.append(wasDiscarded);
	    auditStr.append("; ");
		auditStr.append("\r\n*careContext* :");
		if (careContext != null)
		{
			auditStr.append(toShortClassName(careContext));
				
		    auditStr.append(careContext.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*orderingHospital* :");
		if (orderingHospital != null)
		{
			auditStr.append(toShortClassName(orderingHospital));
				
		    auditStr.append(orderingHospital.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*hasNewOrUpdatedResults* :");
		auditStr.append(hasNewOrUpdatedResults);
	    auditStr.append("; ");
		auditStr.append("\r\n*bedNumber* :");
		auditStr.append(bedNumber);
	    auditStr.append("; ");
		auditStr.append("\r\n*sendNumber* :");
		auditStr.append(sendNumber);
	    auditStr.append("; ");
		auditStr.append("\r\n*outpatientDept* :");
		if (outpatientDept != null)
		{
			auditStr.append(toShortClassName(outpatientDept));
				
		    auditStr.append(outpatientDept.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*summaryClinicalInformation* :");
		auditStr.append(summaryClinicalInformation);
	    auditStr.append("; ");
		auditStr.append("\r\n*bleepExtNumber* :");
		auditStr.append(bleepExtNumber);
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
		
		String keyClassName = "OcsOrderSession";
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
		if (this.getClinicalContact() != null)
		{
			sb.append("<clinicalContact>");
			sb.append(this.getClinicalContact().toXMLString(domMap)); 	
			sb.append("</clinicalContact>");		
		}
		if (this.getPatient() != null)
		{
			sb.append("<patient>");
			sb.append(this.getPatient().toXMLString(domMap)); 	
			sb.append("</patient>");		
		}
		if (this.getInvestigations() != null)
		{
			if (this.getInvestigations().size() > 0 )
			{
			sb.append("<investigations>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getInvestigations(), domMap));
			sb.append("</investigations>");		
			}
		}
		if (this.getOrderedBy() != null)
		{
			sb.append("<orderedBy>");
			sb.append(this.getOrderedBy().toXMLString(domMap)); 	
			sb.append("</orderedBy>");		
		}
		if (this.getResponsibleClinician() != null)
		{
			sb.append("<responsibleClinician>");
			sb.append(this.getResponsibleClinician().toXMLString(domMap)); 	
			sb.append("</responsibleClinician>");		
		}
		if (this.getResponsibleGp() != null)
		{
			sb.append("<responsibleGp>");
			sb.append(this.getResponsibleGp().toXMLString(domMap)); 	
			sb.append("</responsibleGp>");		
		}
		if (this.getPatientLocation() != null)
		{
			sb.append("<patientLocation>");
			sb.append(this.getPatientLocation().toXMLString(domMap)); 	
			sb.append("</patientLocation>");		
		}
		if (this.getPatientClinic() != null)
		{
			sb.append("<patientClinic>");
			sb.append(this.getPatientClinic().toXMLString(domMap)); 	
			sb.append("</patientClinic>");		
		}
		if (this.getHcpAlerts() != null)
		{
			if (this.getHcpAlerts().size() > 0 )
			{
			sb.append("<hcpAlerts>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getHcpAlerts(), domMap));
			sb.append("</hcpAlerts>");		
			}
		}
		if (this.isClinicalTrial() != null)
		{
			sb.append("<clinicalTrial>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isClinicalTrial().toString()));
			sb.append("</clinicalTrial>");		
		}
		if (this.getClinicalTrialTxt() != null)
		{
			sb.append("<clinicalTrialTxt>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getClinicalTrialTxt().toString()));
			sb.append("</clinicalTrialTxt>");		
		}
		if (this.getClinicalInfo() != null)
		{
			sb.append("<clinicalInfo>");
			sb.append(this.getClinicalInfo().toXMLString(domMap)); 	
			sb.append("</clinicalInfo>");		
		}
		if (this.getAdditClinNotes() != null)
		{
			sb.append("<additClinNotes>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAdditClinNotes().toString()));
			sb.append("</additClinNotes>");		
		}
		if (this.getPatMobility() != null)
		{
			sb.append("<patMobility>");
			sb.append(this.getPatMobility().toXMLString()); 
			sb.append("</patMobility>");		
		}
		if (this.getOrderCategory() != null)
		{
			sb.append("<orderCategory>");
			sb.append(this.getOrderCategory().toXMLString()); 
			sb.append("</orderCategory>");		
		}
		if (this.getReportTo() != null)
		{
			if (this.getReportTo().size() > 0 )
			{
			sb.append("<reportTo>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getReportTo(), domMap));
			sb.append("</reportTo>");		
			}
		}
		if (this.getSpecimens() != null)
		{
			if (this.getSpecimens().size() > 0 )
			{
			sb.append("<specimens>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getSpecimens(), domMap));
			sb.append("</specimens>");		
			}
		}
		if (this.isWasProcessed() != null)
		{
			sb.append("<wasProcessed>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isWasProcessed().toString()));
			sb.append("</wasProcessed>");		
		}
		if (this.getAuthorisationOrderStatus() != null)
		{
			sb.append("<authorisationOrderStatus>");
			sb.append(this.getAuthorisationOrderStatus().toXMLString()); 
			sb.append("</authorisationOrderStatus>");		
		}
		if (this.isWasDiscarded() != null)
		{
			sb.append("<wasDiscarded>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isWasDiscarded().toString()));
			sb.append("</wasDiscarded>");		
		}
		if (this.getCareContext() != null)
		{
			sb.append("<careContext>");
			sb.append(this.getCareContext().toXMLString(domMap)); 	
			sb.append("</careContext>");		
		}
		if (this.getOrderingHospital() != null)
		{
			sb.append("<orderingHospital>");
			sb.append(this.getOrderingHospital().toXMLString(domMap)); 	
			sb.append("</orderingHospital>");		
		}
		if (this.isHasNewOrUpdatedResults() != null)
		{
			sb.append("<hasNewOrUpdatedResults>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHasNewOrUpdatedResults().toString()));
			sb.append("</hasNewOrUpdatedResults>");		
		}
		if (this.getBedNumber() != null)
		{
			sb.append("<bedNumber>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getBedNumber().toString()));
			sb.append("</bedNumber>");		
		}
		if (this.isSendNumber() != null)
		{
			sb.append("<sendNumber>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isSendNumber().toString()));
			sb.append("</sendNumber>");		
		}
		if (this.getOutpatientDept() != null)
		{
			sb.append("<outpatientDept>");
			sb.append(this.getOutpatientDept().toXMLString(domMap)); 	
			sb.append("</outpatientDept>");		
		}
		if (this.getSummaryClinicalInformation() != null)
		{
			sb.append("<summaryClinicalInformation>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSummaryClinicalInformation().toString()));
			sb.append("</summaryClinicalInformation>");		
		}
		if (this.getBleepExtNumber() != null)
		{
			sb.append("<bleepExtNumber>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getBleepExtNumber().toString()));
			sb.append("</bleepExtNumber>");		
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
			OcsOrderSession domainObject = getOcsOrderSessionfromXML(itemEl, factory, domMap);

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
			OcsOrderSession domainObject = getOcsOrderSessionfromXML(itemEl, factory, domMap);

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
		
	public static OcsOrderSession getOcsOrderSessionfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getOcsOrderSessionfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static OcsOrderSession getOcsOrderSessionfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!OcsOrderSession.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!OcsOrderSession.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the OcsOrderSession class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (OcsOrderSession)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(OcsOrderSession.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		OcsOrderSession ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (OcsOrderSession)factory.getImportedDomainObject(OcsOrderSession.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new OcsOrderSession();
		}
		String keyClassName = "OcsOrderSession";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (OcsOrderSession)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, OcsOrderSession obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("clinicalContact");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setClinicalContact(ims.core.admin.domain.objects.ClinicalContact.getClinicalContactfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("investigations");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setInvestigations(ims.ocrr.orderingresults.domain.objects.OrderInvestigation.fromSetXMLString(fldEl, factory, obj.getInvestigations(), domMap));
		}
		fldEl = el.element("orderedBy");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setOrderedBy(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("responsibleClinician");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setResponsibleClinician(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("responsibleGp");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setResponsibleGp(ims.core.resource.people.domain.objects.Gp.getGpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("patientLocation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatientLocation(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("patientClinic");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatientClinic(ims.core.resource.place.domain.objects.Clinic.getClinicfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("hcpAlerts");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setHcpAlerts(ims.ocrr.orderingresults.domain.objects.OrderHCPAlert.fromSetXMLString(fldEl, factory, obj.getHcpAlerts(), domMap));
		}
		fldEl = el.element("clinicalTrial");
		if(fldEl != null)
		{	
    		obj.setClinicalTrial(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("clinicalTrialTxt");
		if(fldEl != null)
		{	
    		obj.setClinicalTrialTxt(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("clinicalInfo");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setClinicalInfo(ims.ocrr.orderingresults.domain.objects.OcsQASession.getOcsQASessionfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("additClinNotes");
		if(fldEl != null)
		{	
    		obj.setAdditClinNotes(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("patMobility");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPatMobility(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("orderCategory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setOrderCategory(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("reportTo");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setReportTo(ims.ocrr.orderingresults.domain.objects.OcsReportTo.fromListXMLString(fldEl, factory, obj.getReportTo(), domMap));
		}
		fldEl = el.element("specimens");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setSpecimens(ims.ocrr.orderingresults.domain.objects.OrderSpecimen.fromSetXMLString(fldEl, factory, obj.getSpecimens(), domMap));
		}
		fldEl = el.element("wasProcessed");
		if(fldEl != null)
		{	
    		obj.setWasProcessed(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("authorisationOrderStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAuthorisationOrderStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("wasDiscarded");
		if(fldEl != null)
		{	
    		obj.setWasDiscarded(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("orderingHospital");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setOrderingHospital(ims.core.resource.place.domain.objects.LocSite.getLocSitefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("hasNewOrUpdatedResults");
		if(fldEl != null)
		{	
    		obj.setHasNewOrUpdatedResults(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("bedNumber");
		if(fldEl != null)
		{	
    		obj.setBedNumber(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("sendNumber");
		if(fldEl != null)
		{	
    		obj.setSendNumber(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("outpatientDept");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setOutpatientDept(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("summaryClinicalInformation");
		if(fldEl != null)
		{	
    		obj.setSummaryClinicalInformation(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("bleepExtNumber");
		if(fldEl != null)
		{	
    		obj.setBleepExtNumber(new String(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "investigations"
		, "hcpAlerts"
		, "reportTo"
		, "specimens"
		};
	}

	/**
	INotification Interface
	*/
	public int[] getNotificationUserIds() 
	{
		java.util.List<Integer> list = new java.util.ArrayList<Integer>();
		
		if(this.orderedBy != null && 
				this.orderedBy.getAppUser() != null && 
				this.orderedBy.getAppUser().getId() != null)
		{
			list.add(this.orderedBy.getAppUser().getId());
		}
		if(this.responsibleClinician != null && 
				this.responsibleClinician.getMos() != null && 
				this.responsibleClinician.getMos().getAppUser() != null &&
				this.responsibleClinician.getMos().getAppUser().getId() != null)
		{
			if(!list.contains(this.responsibleClinician.getMos().getAppUser().getId()))
			{
				list.add(this.responsibleClinician.getMos().getAppUser().getId());
			}
		}
		
		int[] result = new int[list.size()];
		for(int x = 0; x < list.size(); x++)
		{
			result[x] = list.get(x);
		}
		
		return result;
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String ClinicalContact = "clinicalContact";
		public static final String Patient = "patient";
		public static final String Investigations = "investigations";
		public static final String OrderedBy = "orderedBy";
		public static final String ResponsibleClinician = "responsibleClinician";
		public static final String ResponsibleGp = "responsibleGp";
		public static final String PatientLocation = "patientLocation";
		public static final String PatientClinic = "patientClinic";
		public static final String HcpAlerts = "hcpAlerts";
		public static final String ClinicalTrial = "clinicalTrial";
		public static final String ClinicalTrialTxt = "clinicalTrialTxt";
		public static final String ClinicalInfo = "clinicalInfo";
		public static final String AdditClinNotes = "additClinNotes";
		public static final String PatMobility = "patMobility";
		public static final String OrderCategory = "orderCategory";
		public static final String ReportTo = "reportTo";
		public static final String Specimens = "specimens";
		public static final String WasProcessed = "wasProcessed";
		public static final String AuthorisationOrderStatus = "authorisationOrderStatus";
		public static final String WasDiscarded = "wasDiscarded";
		public static final String CareContext = "careContext";
		public static final String OrderingHospital = "orderingHospital";
		public static final String HasNewOrUpdatedResults = "hasNewOrUpdatedResults";
		public static final String BedNumber = "bedNumber";
		public static final String SendNumber = "sendNumber";
		public static final String OutpatientDept = "outpatientDept";
		public static final String SummaryClinicalInformation = "summaryClinicalInformation";
		public static final String BleepExtNumber = "bleepExtNumber";
	}
}

