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
package ims.eas.configuration.domain.objects;

/**
 * 
 * @author Barbara Worwood
 * Generated.
 */


public class Protocol extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1114100003;
	private static final long serialVersionUID = 1114100003L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** The PrimaryTumour associated with this protocol */
	private ims.eas.configuration.domain.objects.PrimaryTumour primaryTumour;
	/** The Treatment Site for this protocol */
	private ims.eas.configuration.domain.objects.TreatmentSites treatmentSite;
	/** Name of this Protocol */
	private String protocolName;
	/** Current Status of this protocol */
	private ims.domain.lookups.LookupInstance status;
	/** Member of staff who recording this information */
	private ims.core.resource.people.domain.objects.MemberOfStaff recordingMOS;
	/** Timestamp of when this protocol was recorded */
	private java.util.Date recordingDateTime;
	/** Is this a Clinical Trial Protocol */
	private Boolean clinTrialProtocol;
	/** The ClinicalTrial associated with this protocol */
	private ims.domain.lookups.LookupInstance clinicalTrial;
	/** Must plan in Consultant session */
	private ims.domain.lookups.LookupInstance consSessRequired;
	/** Default Value if Consultant Session is Optional */
	private ims.domain.lookups.LookupInstance consSessDefault;
	/** Planning CT */
	private ims.domain.lookups.LookupInstance planCTRequired;
	/** Default Value if Planning CT is Optional */
	private ims.domain.lookups.LookupInstance planCTDefault;
	/** Appropriate for CCC-L */
	private ims.domain.lookups.LookupInstance appropCCCL;
	/** MRI for co-reg */
	private ims.domain.lookups.LookupInstance mRICoRegRequired;
	/** Default Value if MRI for co-reg is Optional */
	private ims.domain.lookups.LookupInstance mRIDefault;
	/** Dentist Required */
	private ims.domain.lookups.LookupInstance dentistRequired;
	/** Default Value if Dentist is Optional */
	private ims.domain.lookups.LookupInstance dentistDefault;
	/** Peg Required */
	private ims.domain.lookups.LookupInstance pegRequired;
	/** Default Value if Peg is Optional */
	private ims.domain.lookups.LookupInstance pEGDefault;
	/** Default Value if PET CT for co-reg is Optional */
	private ims.domain.lookups.LookupInstance petCTDefault;
	/** Simulation Required */
	private ims.domain.lookups.LookupInstance simlRequired;
	/** Default Value if Simulation is Optional */
	private ims.domain.lookups.LookupInstance simulationDefault;
	/** PET CT for co-reg */
	private ims.domain.lookups.LookupInstance petCTRequired;
	/** IV Contrast Required */
	private ims.domain.lookups.LookupInstance iVContrastRequired;
	/** The list of IV Contrast instances appropriate for this protocol
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List iVContrastList;
	/** Default value to be selected for IVContrast  */
	private ims.domain.lookups.LookupInstance iVContrastDefault;
	/** Oral Contrast Required */
	private ims.domain.lookups.LookupInstance oralContrastRequired;
	/** The list of Oral Contrast instances appropriate for this protocol
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List oralContrastList;
	/** Default value to be selected for IVContrast  */
	private ims.domain.lookups.LookupInstance oralContrastDefault;
	/** Gating Options Required */
	private ims.domain.lookups.LookupInstance gatingOptsRequired;
	/** The list of Gating Option instances appropriate for this protocol
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List gatingOptsList;
	/** Default value to be selected for Gating Options */
	private ims.domain.lookups.LookupInstance gatingOptsDefault;
	/** IMRT Required */
	private ims.domain.lookups.LookupInstance iMRTRequired;
	/** The list of IMRT instances appropriate for this protocol
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List iMRTList;
	/** Default value to be selected for IMRT */
	private ims.domain.lookups.LookupInstance iMRTDefault;
	/** Immobilisation Type Required */
	private ims.domain.lookups.LookupInstance immobTypeRequired;
	/** The list of Immobilisation Type instances appropriate for this protocol
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List immobTypeList;
	/** Default value to be selected for Immobilisation Type */
	private ims.domain.lookups.LookupInstance immobTypeDefault;
	/** Mould Room Preparation required */
	private ims.domain.lookups.LookupInstance mouldRoomRequired;
	/** The list of Mould Room Activities instances appropriate for this protocol
	  * Collection of ims.domain.lookups.LookupInstance.
	  */
	private java.util.List mouldRoomList;
	/** Default value to be selected for Mould Room */
	private ims.domain.lookups.LookupInstance mouldRoomDefault;
	/** Phases - at least one must be configured
	  * Collection of ims.eas.configuration.domain.objects.ProtocolPhase.
	  */
	private java.util.List phases;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public Protocol (Integer id, int ver)
    {
    	super(id, ver);
    }
    public Protocol ()
    {
    	super();
    }
    public Protocol (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.eas.configuration.domain.objects.Protocol.class;
	}


	public ims.eas.configuration.domain.objects.PrimaryTumour getPrimaryTumour() {
		return primaryTumour;
	}
	public void setPrimaryTumour(ims.eas.configuration.domain.objects.PrimaryTumour primaryTumour) {
		this.primaryTumour = primaryTumour;
	}

	public ims.eas.configuration.domain.objects.TreatmentSites getTreatmentSite() {
		return treatmentSite;
	}
	public void setTreatmentSite(ims.eas.configuration.domain.objects.TreatmentSites treatmentSite) {
		this.treatmentSite = treatmentSite;
	}

	public String getProtocolName() {
		return protocolName;
	}
	public void setProtocolName(String protocolName) {
		if ( null != protocolName && protocolName.length() > 70 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for protocolName. Tried to set value: "+
				protocolName);
		}
		this.protocolName = protocolName;
	}

	public ims.domain.lookups.LookupInstance getStatus() {
		return status;
	}
	public void setStatus(ims.domain.lookups.LookupInstance status) {
		this.status = status;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getRecordingMOS() {
		return recordingMOS;
	}
	public void setRecordingMOS(ims.core.resource.people.domain.objects.MemberOfStaff recordingMOS) {
		this.recordingMOS = recordingMOS;
	}

	public java.util.Date getRecordingDateTime() {
		return recordingDateTime;
	}
	public void setRecordingDateTime(java.util.Date recordingDateTime) {
		this.recordingDateTime = recordingDateTime;
	}

	public Boolean isClinTrialProtocol() {
		return clinTrialProtocol;
	}
	public void setClinTrialProtocol(Boolean clinTrialProtocol) {
		this.clinTrialProtocol = clinTrialProtocol;
	}

	public ims.domain.lookups.LookupInstance getClinicalTrial() {
		return clinicalTrial;
	}
	public void setClinicalTrial(ims.domain.lookups.LookupInstance clinicalTrial) {
		this.clinicalTrial = clinicalTrial;
	}

	public ims.domain.lookups.LookupInstance getConsSessRequired() {
		return consSessRequired;
	}
	public void setConsSessRequired(ims.domain.lookups.LookupInstance consSessRequired) {
		this.consSessRequired = consSessRequired;
	}

	public ims.domain.lookups.LookupInstance getConsSessDefault() {
		return consSessDefault;
	}
	public void setConsSessDefault(ims.domain.lookups.LookupInstance consSessDefault) {
		this.consSessDefault = consSessDefault;
	}

	public ims.domain.lookups.LookupInstance getPlanCTRequired() {
		return planCTRequired;
	}
	public void setPlanCTRequired(ims.domain.lookups.LookupInstance planCTRequired) {
		this.planCTRequired = planCTRequired;
	}

	public ims.domain.lookups.LookupInstance getPlanCTDefault() {
		return planCTDefault;
	}
	public void setPlanCTDefault(ims.domain.lookups.LookupInstance planCTDefault) {
		this.planCTDefault = planCTDefault;
	}

	public ims.domain.lookups.LookupInstance getAppropCCCL() {
		return appropCCCL;
	}
	public void setAppropCCCL(ims.domain.lookups.LookupInstance appropCCCL) {
		this.appropCCCL = appropCCCL;
	}

	public ims.domain.lookups.LookupInstance getMRICoRegRequired() {
		return mRICoRegRequired;
	}
	public void setMRICoRegRequired(ims.domain.lookups.LookupInstance mRICoRegRequired) {
		this.mRICoRegRequired = mRICoRegRequired;
	}

	public ims.domain.lookups.LookupInstance getMRIDefault() {
		return mRIDefault;
	}
	public void setMRIDefault(ims.domain.lookups.LookupInstance mRIDefault) {
		this.mRIDefault = mRIDefault;
	}

	public ims.domain.lookups.LookupInstance getDentistRequired() {
		return dentistRequired;
	}
	public void setDentistRequired(ims.domain.lookups.LookupInstance dentistRequired) {
		this.dentistRequired = dentistRequired;
	}

	public ims.domain.lookups.LookupInstance getDentistDefault() {
		return dentistDefault;
	}
	public void setDentistDefault(ims.domain.lookups.LookupInstance dentistDefault) {
		this.dentistDefault = dentistDefault;
	}

	public ims.domain.lookups.LookupInstance getPegRequired() {
		return pegRequired;
	}
	public void setPegRequired(ims.domain.lookups.LookupInstance pegRequired) {
		this.pegRequired = pegRequired;
	}

	public ims.domain.lookups.LookupInstance getPEGDefault() {
		return pEGDefault;
	}
	public void setPEGDefault(ims.domain.lookups.LookupInstance pEGDefault) {
		this.pEGDefault = pEGDefault;
	}

	public ims.domain.lookups.LookupInstance getPetCTDefault() {
		return petCTDefault;
	}
	public void setPetCTDefault(ims.domain.lookups.LookupInstance petCTDefault) {
		this.petCTDefault = petCTDefault;
	}

	public ims.domain.lookups.LookupInstance getSimlRequired() {
		return simlRequired;
	}
	public void setSimlRequired(ims.domain.lookups.LookupInstance simlRequired) {
		this.simlRequired = simlRequired;
	}

	public ims.domain.lookups.LookupInstance getSimulationDefault() {
		return simulationDefault;
	}
	public void setSimulationDefault(ims.domain.lookups.LookupInstance simulationDefault) {
		this.simulationDefault = simulationDefault;
	}

	public ims.domain.lookups.LookupInstance getPetCTRequired() {
		return petCTRequired;
	}
	public void setPetCTRequired(ims.domain.lookups.LookupInstance petCTRequired) {
		this.petCTRequired = petCTRequired;
	}

	public ims.domain.lookups.LookupInstance getIVContrastRequired() {
		return iVContrastRequired;
	}
	public void setIVContrastRequired(ims.domain.lookups.LookupInstance iVContrastRequired) {
		this.iVContrastRequired = iVContrastRequired;
	}

	public java.util.List getIVContrastList() {
		if ( null == iVContrastList ) {
			iVContrastList = new java.util.ArrayList();
		}
		return iVContrastList;
	}
	public void setIVContrastList(java.util.List paramValue) {
		this.iVContrastList = paramValue;
	}

	public ims.domain.lookups.LookupInstance getIVContrastDefault() {
		return iVContrastDefault;
	}
	public void setIVContrastDefault(ims.domain.lookups.LookupInstance iVContrastDefault) {
		this.iVContrastDefault = iVContrastDefault;
	}

	public ims.domain.lookups.LookupInstance getOralContrastRequired() {
		return oralContrastRequired;
	}
	public void setOralContrastRequired(ims.domain.lookups.LookupInstance oralContrastRequired) {
		this.oralContrastRequired = oralContrastRequired;
	}

	public java.util.List getOralContrastList() {
		if ( null == oralContrastList ) {
			oralContrastList = new java.util.ArrayList();
		}
		return oralContrastList;
	}
	public void setOralContrastList(java.util.List paramValue) {
		this.oralContrastList = paramValue;
	}

	public ims.domain.lookups.LookupInstance getOralContrastDefault() {
		return oralContrastDefault;
	}
	public void setOralContrastDefault(ims.domain.lookups.LookupInstance oralContrastDefault) {
		this.oralContrastDefault = oralContrastDefault;
	}

	public ims.domain.lookups.LookupInstance getGatingOptsRequired() {
		return gatingOptsRequired;
	}
	public void setGatingOptsRequired(ims.domain.lookups.LookupInstance gatingOptsRequired) {
		this.gatingOptsRequired = gatingOptsRequired;
	}

	public java.util.List getGatingOptsList() {
		if ( null == gatingOptsList ) {
			gatingOptsList = new java.util.ArrayList();
		}
		return gatingOptsList;
	}
	public void setGatingOptsList(java.util.List paramValue) {
		this.gatingOptsList = paramValue;
	}

	public ims.domain.lookups.LookupInstance getGatingOptsDefault() {
		return gatingOptsDefault;
	}
	public void setGatingOptsDefault(ims.domain.lookups.LookupInstance gatingOptsDefault) {
		this.gatingOptsDefault = gatingOptsDefault;
	}

	public ims.domain.lookups.LookupInstance getIMRTRequired() {
		return iMRTRequired;
	}
	public void setIMRTRequired(ims.domain.lookups.LookupInstance iMRTRequired) {
		this.iMRTRequired = iMRTRequired;
	}

	public java.util.List getIMRTList() {
		if ( null == iMRTList ) {
			iMRTList = new java.util.ArrayList();
		}
		return iMRTList;
	}
	public void setIMRTList(java.util.List paramValue) {
		this.iMRTList = paramValue;
	}

	public ims.domain.lookups.LookupInstance getIMRTDefault() {
		return iMRTDefault;
	}
	public void setIMRTDefault(ims.domain.lookups.LookupInstance iMRTDefault) {
		this.iMRTDefault = iMRTDefault;
	}

	public ims.domain.lookups.LookupInstance getImmobTypeRequired() {
		return immobTypeRequired;
	}
	public void setImmobTypeRequired(ims.domain.lookups.LookupInstance immobTypeRequired) {
		this.immobTypeRequired = immobTypeRequired;
	}

	public java.util.List getImmobTypeList() {
		if ( null == immobTypeList ) {
			immobTypeList = new java.util.ArrayList();
		}
		return immobTypeList;
	}
	public void setImmobTypeList(java.util.List paramValue) {
		this.immobTypeList = paramValue;
	}

	public ims.domain.lookups.LookupInstance getImmobTypeDefault() {
		return immobTypeDefault;
	}
	public void setImmobTypeDefault(ims.domain.lookups.LookupInstance immobTypeDefault) {
		this.immobTypeDefault = immobTypeDefault;
	}

	public ims.domain.lookups.LookupInstance getMouldRoomRequired() {
		return mouldRoomRequired;
	}
	public void setMouldRoomRequired(ims.domain.lookups.LookupInstance mouldRoomRequired) {
		this.mouldRoomRequired = mouldRoomRequired;
	}

	public java.util.List getMouldRoomList() {
		if ( null == mouldRoomList ) {
			mouldRoomList = new java.util.ArrayList();
		}
		return mouldRoomList;
	}
	public void setMouldRoomList(java.util.List paramValue) {
		this.mouldRoomList = paramValue;
	}

	public ims.domain.lookups.LookupInstance getMouldRoomDefault() {
		return mouldRoomDefault;
	}
	public void setMouldRoomDefault(ims.domain.lookups.LookupInstance mouldRoomDefault) {
		this.mouldRoomDefault = mouldRoomDefault;
	}

	public java.util.List getPhases() {
		if ( null == phases ) {
			phases = new java.util.ArrayList();
		}
		return phases;
	}
	public void setPhases(java.util.List paramValue) {
		this.phases = paramValue;
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
		
		auditStr.append("\r\n*primaryTumour* :");
		if (primaryTumour != null)
		{
			auditStr.append(toShortClassName(primaryTumour));
				
		    auditStr.append(primaryTumour.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*treatmentSite* :");
		if (treatmentSite != null)
		{
			auditStr.append(toShortClassName(treatmentSite));
				
		    auditStr.append(treatmentSite.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*protocolName* :");
		auditStr.append(protocolName);
	    auditStr.append("; ");
		auditStr.append("\r\n*status* :");
		if (status != null)
			auditStr.append(status.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*recordingMOS* :");
		if (recordingMOS != null)
		{
			auditStr.append(toShortClassName(recordingMOS));
				
		    auditStr.append(recordingMOS.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*recordingDateTime* :");
		auditStr.append(recordingDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*clinTrialProtocol* :");
		auditStr.append(clinTrialProtocol);
	    auditStr.append("; ");
		auditStr.append("\r\n*clinicalTrial* :");
		if (clinicalTrial != null)
			auditStr.append(clinicalTrial.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*consSessRequired* :");
		if (consSessRequired != null)
			auditStr.append(consSessRequired.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*consSessDefault* :");
		if (consSessDefault != null)
			auditStr.append(consSessDefault.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*planCTRequired* :");
		if (planCTRequired != null)
			auditStr.append(planCTRequired.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*planCTDefault* :");
		if (planCTDefault != null)
			auditStr.append(planCTDefault.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*appropCCCL* :");
		if (appropCCCL != null)
			auditStr.append(appropCCCL.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*mRICoRegRequired* :");
		if (mRICoRegRequired != null)
			auditStr.append(mRICoRegRequired.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*mRIDefault* :");
		if (mRIDefault != null)
			auditStr.append(mRIDefault.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*dentistRequired* :");
		if (dentistRequired != null)
			auditStr.append(dentistRequired.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*dentistDefault* :");
		if (dentistDefault != null)
			auditStr.append(dentistDefault.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*pegRequired* :");
		if (pegRequired != null)
			auditStr.append(pegRequired.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*pEGDefault* :");
		if (pEGDefault != null)
			auditStr.append(pEGDefault.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*petCTDefault* :");
		if (petCTDefault != null)
			auditStr.append(petCTDefault.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*simlRequired* :");
		if (simlRequired != null)
			auditStr.append(simlRequired.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*simulationDefault* :");
		if (simulationDefault != null)
			auditStr.append(simulationDefault.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*petCTRequired* :");
		if (petCTRequired != null)
			auditStr.append(petCTRequired.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*iVContrastRequired* :");
		if (iVContrastRequired != null)
			auditStr.append(iVContrastRequired.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*iVContrastList* :");
		if (iVContrastList != null)
		{
		int i25=0;
		for (i25=0; i25<iVContrastList.size(); i25++)
		{
			if (i25 > 0)
				auditStr.append(",");
			ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)iVContrastList.get(i25);
			auditStr.append(obj.getText());
		}
		if (i25 > 0)
			auditStr.append("] " + i25);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*iVContrastDefault* :");
		if (iVContrastDefault != null)
			auditStr.append(iVContrastDefault.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*oralContrastRequired* :");
		if (oralContrastRequired != null)
			auditStr.append(oralContrastRequired.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*oralContrastList* :");
		if (oralContrastList != null)
		{
		int i28=0;
		for (i28=0; i28<oralContrastList.size(); i28++)
		{
			if (i28 > 0)
				auditStr.append(",");
			ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)oralContrastList.get(i28);
			auditStr.append(obj.getText());
		}
		if (i28 > 0)
			auditStr.append("] " + i28);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*oralContrastDefault* :");
		if (oralContrastDefault != null)
			auditStr.append(oralContrastDefault.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*gatingOptsRequired* :");
		if (gatingOptsRequired != null)
			auditStr.append(gatingOptsRequired.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*gatingOptsList* :");
		if (gatingOptsList != null)
		{
		int i31=0;
		for (i31=0; i31<gatingOptsList.size(); i31++)
		{
			if (i31 > 0)
				auditStr.append(",");
			ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)gatingOptsList.get(i31);
			auditStr.append(obj.getText());
		}
		if (i31 > 0)
			auditStr.append("] " + i31);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*gatingOptsDefault* :");
		if (gatingOptsDefault != null)
			auditStr.append(gatingOptsDefault.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*iMRTRequired* :");
		if (iMRTRequired != null)
			auditStr.append(iMRTRequired.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*iMRTList* :");
		if (iMRTList != null)
		{
		int i34=0;
		for (i34=0; i34<iMRTList.size(); i34++)
		{
			if (i34 > 0)
				auditStr.append(",");
			ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)iMRTList.get(i34);
			auditStr.append(obj.getText());
		}
		if (i34 > 0)
			auditStr.append("] " + i34);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*iMRTDefault* :");
		if (iMRTDefault != null)
			auditStr.append(iMRTDefault.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*immobTypeRequired* :");
		if (immobTypeRequired != null)
			auditStr.append(immobTypeRequired.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*immobTypeList* :");
		if (immobTypeList != null)
		{
		int i37=0;
		for (i37=0; i37<immobTypeList.size(); i37++)
		{
			if (i37 > 0)
				auditStr.append(",");
			ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)immobTypeList.get(i37);
			auditStr.append(obj.getText());
		}
		if (i37 > 0)
			auditStr.append("] " + i37);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*immobTypeDefault* :");
		if (immobTypeDefault != null)
			auditStr.append(immobTypeDefault.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*mouldRoomRequired* :");
		if (mouldRoomRequired != null)
			auditStr.append(mouldRoomRequired.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*mouldRoomList* :");
		if (mouldRoomList != null)
		{
		int i40=0;
		for (i40=0; i40<mouldRoomList.size(); i40++)
		{
			if (i40 > 0)
				auditStr.append(",");
			ims.domain.lookups.LookupInstance obj = (ims.domain.lookups.LookupInstance)mouldRoomList.get(i40);
			auditStr.append(obj.getText());
		}
		if (i40 > 0)
			auditStr.append("] " + i40);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*mouldRoomDefault* :");
		if (mouldRoomDefault != null)
			auditStr.append(mouldRoomDefault.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*phases* :");
		if (phases != null)
		{
		int i42=0;
		for (i42=0; i42<phases.size(); i42++)
		{
			if (i42 > 0)
				auditStr.append(",");
			ims.eas.configuration.domain.objects.ProtocolPhase obj = (ims.eas.configuration.domain.objects.ProtocolPhase)phases.get(i42);
		    if (obj != null)
			{
				if (i42 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i42 > 0)
			auditStr.append("] " + i42);
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
		
		String keyClassName = "Protocol";
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
		if (this.getPrimaryTumour() != null)
		{
			sb.append("<primaryTumour>");
			sb.append(this.getPrimaryTumour().toXMLString(domMap)); 	
			sb.append("</primaryTumour>");		
		}
		if (this.getTreatmentSite() != null)
		{
			sb.append("<treatmentSite>");
			sb.append(this.getTreatmentSite().toXMLString(domMap)); 	
			sb.append("</treatmentSite>");		
		}
		if (this.getProtocolName() != null)
		{
			sb.append("<protocolName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getProtocolName().toString()));
			sb.append("</protocolName>");		
		}
		if (this.getStatus() != null)
		{
			sb.append("<status>");
			sb.append(this.getStatus().toXMLString()); 
			sb.append("</status>");		
		}
		if (this.getRecordingMOS() != null)
		{
			sb.append("<recordingMOS>");
			sb.append(this.getRecordingMOS().toXMLString(domMap)); 	
			sb.append("</recordingMOS>");		
		}
		if (this.getRecordingDateTime() != null)
		{
			sb.append("<recordingDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getRecordingDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</recordingDateTime>");		
		}
		if (this.isClinTrialProtocol() != null)
		{
			sb.append("<clinTrialProtocol>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isClinTrialProtocol().toString()));
			sb.append("</clinTrialProtocol>");		
		}
		if (this.getClinicalTrial() != null)
		{
			sb.append("<clinicalTrial>");
			sb.append(this.getClinicalTrial().toXMLString()); 
			sb.append("</clinicalTrial>");		
		}
		if (this.getConsSessRequired() != null)
		{
			sb.append("<consSessRequired>");
			sb.append(this.getConsSessRequired().toXMLString()); 
			sb.append("</consSessRequired>");		
		}
		if (this.getConsSessDefault() != null)
		{
			sb.append("<consSessDefault>");
			sb.append(this.getConsSessDefault().toXMLString()); 
			sb.append("</consSessDefault>");		
		}
		if (this.getPlanCTRequired() != null)
		{
			sb.append("<planCTRequired>");
			sb.append(this.getPlanCTRequired().toXMLString()); 
			sb.append("</planCTRequired>");		
		}
		if (this.getPlanCTDefault() != null)
		{
			sb.append("<planCTDefault>");
			sb.append(this.getPlanCTDefault().toXMLString()); 
			sb.append("</planCTDefault>");		
		}
		if (this.getAppropCCCL() != null)
		{
			sb.append("<appropCCCL>");
			sb.append(this.getAppropCCCL().toXMLString()); 
			sb.append("</appropCCCL>");		
		}
		if (this.getMRICoRegRequired() != null)
		{
			sb.append("<mRICoRegRequired>");
			sb.append(this.getMRICoRegRequired().toXMLString()); 
			sb.append("</mRICoRegRequired>");		
		}
		if (this.getMRIDefault() != null)
		{
			sb.append("<mRIDefault>");
			sb.append(this.getMRIDefault().toXMLString()); 
			sb.append("</mRIDefault>");		
		}
		if (this.getDentistRequired() != null)
		{
			sb.append("<dentistRequired>");
			sb.append(this.getDentistRequired().toXMLString()); 
			sb.append("</dentistRequired>");		
		}
		if (this.getDentistDefault() != null)
		{
			sb.append("<dentistDefault>");
			sb.append(this.getDentistDefault().toXMLString()); 
			sb.append("</dentistDefault>");		
		}
		if (this.getPegRequired() != null)
		{
			sb.append("<pegRequired>");
			sb.append(this.getPegRequired().toXMLString()); 
			sb.append("</pegRequired>");		
		}
		if (this.getPEGDefault() != null)
		{
			sb.append("<pEGDefault>");
			sb.append(this.getPEGDefault().toXMLString()); 
			sb.append("</pEGDefault>");		
		}
		if (this.getPetCTDefault() != null)
		{
			sb.append("<petCTDefault>");
			sb.append(this.getPetCTDefault().toXMLString()); 
			sb.append("</petCTDefault>");		
		}
		if (this.getSimlRequired() != null)
		{
			sb.append("<simlRequired>");
			sb.append(this.getSimlRequired().toXMLString()); 
			sb.append("</simlRequired>");		
		}
		if (this.getSimulationDefault() != null)
		{
			sb.append("<simulationDefault>");
			sb.append(this.getSimulationDefault().toXMLString()); 
			sb.append("</simulationDefault>");		
		}
		if (this.getPetCTRequired() != null)
		{
			sb.append("<petCTRequired>");
			sb.append(this.getPetCTRequired().toXMLString()); 
			sb.append("</petCTRequired>");		
		}
		if (this.getIVContrastRequired() != null)
		{
			sb.append("<iVContrastRequired>");
			sb.append(this.getIVContrastRequired().toXMLString()); 
			sb.append("</iVContrastRequired>");		
		}
		if (this.getIVContrastList() != null)
		{
			if (this.getIVContrastList().size() > 0 )
			{
			sb.append("<iVContrastList>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getIVContrastList())); 
			sb.append("</iVContrastList>");		
			}
		}
		if (this.getIVContrastDefault() != null)
		{
			sb.append("<iVContrastDefault>");
			sb.append(this.getIVContrastDefault().toXMLString()); 
			sb.append("</iVContrastDefault>");		
		}
		if (this.getOralContrastRequired() != null)
		{
			sb.append("<oralContrastRequired>");
			sb.append(this.getOralContrastRequired().toXMLString()); 
			sb.append("</oralContrastRequired>");		
		}
		if (this.getOralContrastList() != null)
		{
			if (this.getOralContrastList().size() > 0 )
			{
			sb.append("<oralContrastList>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getOralContrastList())); 
			sb.append("</oralContrastList>");		
			}
		}
		if (this.getOralContrastDefault() != null)
		{
			sb.append("<oralContrastDefault>");
			sb.append(this.getOralContrastDefault().toXMLString()); 
			sb.append("</oralContrastDefault>");		
		}
		if (this.getGatingOptsRequired() != null)
		{
			sb.append("<gatingOptsRequired>");
			sb.append(this.getGatingOptsRequired().toXMLString()); 
			sb.append("</gatingOptsRequired>");		
		}
		if (this.getGatingOptsList() != null)
		{
			if (this.getGatingOptsList().size() > 0 )
			{
			sb.append("<gatingOptsList>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getGatingOptsList())); 
			sb.append("</gatingOptsList>");		
			}
		}
		if (this.getGatingOptsDefault() != null)
		{
			sb.append("<gatingOptsDefault>");
			sb.append(this.getGatingOptsDefault().toXMLString()); 
			sb.append("</gatingOptsDefault>");		
		}
		if (this.getIMRTRequired() != null)
		{
			sb.append("<iMRTRequired>");
			sb.append(this.getIMRTRequired().toXMLString()); 
			sb.append("</iMRTRequired>");		
		}
		if (this.getIMRTList() != null)
		{
			if (this.getIMRTList().size() > 0 )
			{
			sb.append("<iMRTList>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getIMRTList())); 
			sb.append("</iMRTList>");		
			}
		}
		if (this.getIMRTDefault() != null)
		{
			sb.append("<iMRTDefault>");
			sb.append(this.getIMRTDefault().toXMLString()); 
			sb.append("</iMRTDefault>");		
		}
		if (this.getImmobTypeRequired() != null)
		{
			sb.append("<immobTypeRequired>");
			sb.append(this.getImmobTypeRequired().toXMLString()); 
			sb.append("</immobTypeRequired>");		
		}
		if (this.getImmobTypeList() != null)
		{
			if (this.getImmobTypeList().size() > 0 )
			{
			sb.append("<immobTypeList>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getImmobTypeList())); 
			sb.append("</immobTypeList>");		
			}
		}
		if (this.getImmobTypeDefault() != null)
		{
			sb.append("<immobTypeDefault>");
			sb.append(this.getImmobTypeDefault().toXMLString()); 
			sb.append("</immobTypeDefault>");		
		}
		if (this.getMouldRoomRequired() != null)
		{
			sb.append("<mouldRoomRequired>");
			sb.append(this.getMouldRoomRequired().toXMLString()); 
			sb.append("</mouldRoomRequired>");		
		}
		if (this.getMouldRoomList() != null)
		{
			if (this.getMouldRoomList().size() > 0 )
			{
			sb.append("<mouldRoomList>");
			sb.append(ims.domain.lookups.LookupInstance.toXMLString(this.getMouldRoomList())); 
			sb.append("</mouldRoomList>");		
			}
		}
		if (this.getMouldRoomDefault() != null)
		{
			sb.append("<mouldRoomDefault>");
			sb.append(this.getMouldRoomDefault().toXMLString()); 
			sb.append("</mouldRoomDefault>");		
		}
		if (this.getPhases() != null)
		{
			if (this.getPhases().size() > 0 )
			{
			sb.append("<phases>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getPhases(), domMap));
			sb.append("</phases>");		
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
			Protocol domainObject = getProtocolfromXML(itemEl, factory, domMap);

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
			Protocol domainObject = getProtocolfromXML(itemEl, factory, domMap);

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
		
	public static Protocol getProtocolfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getProtocolfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static Protocol getProtocolfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!Protocol.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!Protocol.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the Protocol class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (Protocol)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(Protocol.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		Protocol ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (Protocol)factory.getImportedDomainObject(Protocol.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new Protocol();
		}
		String keyClassName = "Protocol";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (Protocol)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, Protocol obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("primaryTumour");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPrimaryTumour(ims.eas.configuration.domain.objects.PrimaryTumour.getPrimaryTumourfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("treatmentSite");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTreatmentSite(ims.eas.configuration.domain.objects.TreatmentSites.getTreatmentSitesfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("protocolName");
		if(fldEl != null)
		{	
    		obj.setProtocolName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("status");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("recordingMOS");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRecordingMOS(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("recordingDateTime");
		if(fldEl != null)
		{	
    		obj.setRecordingDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("clinTrialProtocol");
		if(fldEl != null)
		{	
    		obj.setClinTrialProtocol(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("clinicalTrial");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setClinicalTrial(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("consSessRequired");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setConsSessRequired(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("consSessDefault");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setConsSessDefault(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("planCTRequired");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPlanCTRequired(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("planCTDefault");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPlanCTDefault(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("appropCCCL");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAppropCCCL(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("mRICoRegRequired");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setMRICoRegRequired(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("mRIDefault");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setMRIDefault(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("dentistRequired");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDentistRequired(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("dentistDefault");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDentistDefault(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("pegRequired");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPegRequired(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("pEGDefault");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPEGDefault(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("petCTDefault");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPetCTDefault(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("simlRequired");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSimlRequired(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("simulationDefault");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSimulationDefault(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("petCTRequired");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPetCTRequired(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("iVContrastRequired");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setIVContrastRequired(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("iVContrastList");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setIVContrastList(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getIVContrastList())); 
		}
		fldEl = el.element("iVContrastDefault");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setIVContrastDefault(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("oralContrastRequired");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setOralContrastRequired(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("oralContrastList");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setOralContrastList(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getOralContrastList())); 
		}
		fldEl = el.element("oralContrastDefault");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setOralContrastDefault(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("gatingOptsRequired");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setGatingOptsRequired(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("gatingOptsList");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setGatingOptsList(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getGatingOptsList())); 
		}
		fldEl = el.element("gatingOptsDefault");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setGatingOptsDefault(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("iMRTRequired");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setIMRTRequired(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("iMRTList");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setIMRTList(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getIMRTList())); 
		}
		fldEl = el.element("iMRTDefault");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setIMRTDefault(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("immobTypeRequired");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setImmobTypeRequired(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("immobTypeList");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setImmobTypeList(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getImmobTypeList())); 
		}
		fldEl = el.element("immobTypeDefault");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setImmobTypeDefault(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("mouldRoomRequired");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setMouldRoomRequired(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("mouldRoomList");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setMouldRoomList(ims.domain.lookups.LookupInstance.fromListXMLString(fldEl, factory, obj.getMouldRoomList())); 
		}
		fldEl = el.element("mouldRoomDefault");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setMouldRoomDefault(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("phases");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setPhases(ims.eas.configuration.domain.objects.ProtocolPhase.fromListXMLString(fldEl, factory, obj.getPhases(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "iVContrastList"
		, "oralContrastList"
		, "gatingOptsList"
		, "iMRTList"
		, "immobTypeList"
		, "mouldRoomList"
		, "phases"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String PrimaryTumour = "primaryTumour";
		public static final String TreatmentSite = "treatmentSite";
		public static final String ProtocolName = "protocolName";
		public static final String Status = "status";
		public static final String RecordingMOS = "recordingMOS";
		public static final String RecordingDateTime = "recordingDateTime";
		public static final String ClinTrialProtocol = "clinTrialProtocol";
		public static final String ClinicalTrial = "clinicalTrial";
		public static final String ConsSessRequired = "consSessRequired";
		public static final String ConsSessDefault = "consSessDefault";
		public static final String PlanCTRequired = "planCTRequired";
		public static final String PlanCTDefault = "planCTDefault";
		public static final String AppropCCCL = "appropCCCL";
		public static final String MRICoRegRequired = "mRICoRegRequired";
		public static final String MRIDefault = "mRIDefault";
		public static final String DentistRequired = "dentistRequired";
		public static final String DentistDefault = "dentistDefault";
		public static final String PegRequired = "pegRequired";
		public static final String PEGDefault = "pEGDefault";
		public static final String PetCTDefault = "petCTDefault";
		public static final String SimlRequired = "simlRequired";
		public static final String SimulationDefault = "simulationDefault";
		public static final String PetCTRequired = "petCTRequired";
		public static final String IVContrastRequired = "iVContrastRequired";
		public static final String IVContrastList = "iVContrastList";
		public static final String IVContrastDefault = "iVContrastDefault";
		public static final String OralContrastRequired = "oralContrastRequired";
		public static final String OralContrastList = "oralContrastList";
		public static final String OralContrastDefault = "oralContrastDefault";
		public static final String GatingOptsRequired = "gatingOptsRequired";
		public static final String GatingOptsList = "gatingOptsList";
		public static final String GatingOptsDefault = "gatingOptsDefault";
		public static final String IMRTRequired = "iMRTRequired";
		public static final String IMRTList = "iMRTList";
		public static final String IMRTDefault = "iMRTDefault";
		public static final String ImmobTypeRequired = "immobTypeRequired";
		public static final String ImmobTypeList = "immobTypeList";
		public static final String ImmobTypeDefault = "immobTypeDefault";
		public static final String MouldRoomRequired = "mouldRoomRequired";
		public static final String MouldRoomList = "mouldRoomList";
		public static final String MouldRoomDefault = "mouldRoomDefault";
		public static final String Phases = "phases";
	}
}

