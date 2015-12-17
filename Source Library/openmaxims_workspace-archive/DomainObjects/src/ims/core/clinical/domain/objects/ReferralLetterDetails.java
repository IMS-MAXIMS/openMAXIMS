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


public class ReferralLetterDetails extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1003100093;
	private static final long serialVersionUID = 1003100093L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Service */
	private ims.core.clinical.domain.objects.Service service;
	/** Consultant */
	private ims.core.resource.people.domain.objects.Hcp consultant;
	/** Function */
	private ims.core.clinical.domain.objects.ServiceFunction function;
	/** Referrer Type */
	private ims.domain.lookups.LookupInstance referrerType;
	/** AuthoringUser */
	private ims.core.resource.people.domain.objects.MemberOfStaff authoringUser;
	/** Authoring Date Time */
	private java.util.Date authoringDateTime;
	/** GP Name */
	private ims.core.resource.people.domain.objects.Gp gPName;
	/** Practice */
	private ims.core.resource.place.domain.objects.Organisation practice;
	/** Allied Health Professional */
	private String alliedHealthProfName;
	/** Original Date Of Referral */
	private java.util.Date originalDateOfReferral;
	/** Date Of Referral */
	private java.util.Date dateOfReferral;
	/** Date Received */
	private java.util.Date dateReferralReceived;
	/** End Date KPI */
	private java.util.Date endDateKPI;
	/** End Date For Email Report KPI */
	private java.util.Date endDateEmailKPI;
	/** End 40 day Paper Report KPI */
	private java.util.Date endDatePaperKPI;
	/** End 18 WW */
	private java.util.Date end18WW;
	/** Interpreter Required */
	private ims.domain.lookups.LookupInstance interpreterRequired;
	/** Language */
	private ims.domain.lookups.LookupInstance language;
	/** Transport Required */
	private ims.domain.lookups.LookupInstance transportRequired;
	/** Transport Type */
	private ims.domain.lookups.LookupInstance transport;
	/** Copy Discharge Summary To Patient */
	private Boolean copyDischargeToPatient;
	private String pCT;
	/** Other Language */
	private String otherLanguage;
	/** SpecialRequirements */
	private String specialRequirements;
	/** Is this referral a DAD */
	private Boolean isDADReferral;
	/** DadUbrn */
	private String dadUbrn;
	/** Is the eferrer the patient's GP */
	private Boolean isReferrerPatientsGp;
	/** Location */
	private ims.core.resource.place.domain.objects.Location location;
	/** Procedure */
	private ims.core.clinical.domain.objects.Procedure procedure;
	/** Patient Transport Requirements */
	private ims.core.domain.objects.PatientTransportRequirements transportRequirements;
	/** ReferringConsultant */
	private ims.core.resource.people.domain.objects.Hcp referringConsultant;
	/** RefererAddress */
	private String refererAddress;
	/** TransferedBY */
	private String transferedBY;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public ReferralLetterDetails (Integer id, int ver)
    {
    	super(id, ver);
    }
    public ReferralLetterDetails ()
    {
    	super();
    }
    public ReferralLetterDetails (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.clinical.domain.objects.ReferralLetterDetails.class;
	}


	public ims.core.clinical.domain.objects.Service getService() {
		return service;
	}
	public void setService(ims.core.clinical.domain.objects.Service service) {
		this.service = service;
	}

	public ims.core.resource.people.domain.objects.Hcp getConsultant() {
		return consultant;
	}
	public void setConsultant(ims.core.resource.people.domain.objects.Hcp consultant) {
		this.consultant = consultant;
	}

	public ims.core.clinical.domain.objects.ServiceFunction getFunction() {
		return function;
	}
	public void setFunction(ims.core.clinical.domain.objects.ServiceFunction function) {
		this.function = function;
	}

	public ims.domain.lookups.LookupInstance getReferrerType() {
		return referrerType;
	}
	public void setReferrerType(ims.domain.lookups.LookupInstance referrerType) {
		this.referrerType = referrerType;
	}

	public ims.core.resource.people.domain.objects.MemberOfStaff getAuthoringUser() {
		return authoringUser;
	}
	public void setAuthoringUser(ims.core.resource.people.domain.objects.MemberOfStaff authoringUser) {
		this.authoringUser = authoringUser;
	}

	public java.util.Date getAuthoringDateTime() {
		return authoringDateTime;
	}
	public void setAuthoringDateTime(java.util.Date authoringDateTime) {
		this.authoringDateTime = authoringDateTime;
	}

	public ims.core.resource.people.domain.objects.Gp getGPName() {
		return gPName;
	}
	public void setGPName(ims.core.resource.people.domain.objects.Gp gPName) {
		this.gPName = gPName;
	}

	public ims.core.resource.place.domain.objects.Organisation getPractice() {
		return practice;
	}
	public void setPractice(ims.core.resource.place.domain.objects.Organisation practice) {
		this.practice = practice;
	}

	public String getAlliedHealthProfName() {
		return alliedHealthProfName;
	}
	public void setAlliedHealthProfName(String alliedHealthProfName) {
		if ( null != alliedHealthProfName && alliedHealthProfName.length() > 150 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for alliedHealthProfName. Tried to set value: "+
				alliedHealthProfName);
		}
		this.alliedHealthProfName = alliedHealthProfName;
	}

	public java.util.Date getOriginalDateOfReferral() {
		return originalDateOfReferral;
	}
	public void setOriginalDateOfReferral(java.util.Date originalDateOfReferral) {
		this.originalDateOfReferral = originalDateOfReferral;
	}

	public java.util.Date getDateOfReferral() {
		return dateOfReferral;
	}
	public void setDateOfReferral(java.util.Date dateOfReferral) {
		this.dateOfReferral = dateOfReferral;
	}

	public java.util.Date getDateReferralReceived() {
		return dateReferralReceived;
	}
	public void setDateReferralReceived(java.util.Date dateReferralReceived) {
		this.dateReferralReceived = dateReferralReceived;
	}

	public java.util.Date getEndDateKPI() {
		return endDateKPI;
	}
	public void setEndDateKPI(java.util.Date endDateKPI) {
		this.endDateKPI = endDateKPI;
	}

	public java.util.Date getEndDateEmailKPI() {
		return endDateEmailKPI;
	}
	public void setEndDateEmailKPI(java.util.Date endDateEmailKPI) {
		this.endDateEmailKPI = endDateEmailKPI;
	}

	public java.util.Date getEndDatePaperKPI() {
		return endDatePaperKPI;
	}
	public void setEndDatePaperKPI(java.util.Date endDatePaperKPI) {
		this.endDatePaperKPI = endDatePaperKPI;
	}

	public java.util.Date getEnd18WW() {
		return end18WW;
	}
	public void setEnd18WW(java.util.Date end18WW) {
		this.end18WW = end18WW;
	}

	public ims.domain.lookups.LookupInstance getInterpreterRequired() {
		return interpreterRequired;
	}
	public void setInterpreterRequired(ims.domain.lookups.LookupInstance interpreterRequired) {
		this.interpreterRequired = interpreterRequired;
	}

	public ims.domain.lookups.LookupInstance getLanguage() {
		return language;
	}
	public void setLanguage(ims.domain.lookups.LookupInstance language) {
		this.language = language;
	}

	public ims.domain.lookups.LookupInstance getTransportRequired() {
		return transportRequired;
	}
	public void setTransportRequired(ims.domain.lookups.LookupInstance transportRequired) {
		this.transportRequired = transportRequired;
	}

	public ims.domain.lookups.LookupInstance getTransport() {
		return transport;
	}
	public void setTransport(ims.domain.lookups.LookupInstance transport) {
		this.transport = transport;
	}

	public Boolean isCopyDischargeToPatient() {
		return copyDischargeToPatient;
	}
	public void setCopyDischargeToPatient(Boolean copyDischargeToPatient) {
		this.copyDischargeToPatient = copyDischargeToPatient;
	}

	public String getPCT() {
		return pCT;
	}
	public void setPCT(String pCT) {
		if ( null != pCT && pCT.length() > 25 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for pCT. Tried to set value: "+
				pCT);
		}
		this.pCT = pCT;
	}

	public String getOtherLanguage() {
		return otherLanguage;
	}
	public void setOtherLanguage(String otherLanguage) {
		if ( null != otherLanguage && otherLanguage.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for otherLanguage. Tried to set value: "+
				otherLanguage);
		}
		this.otherLanguage = otherLanguage;
	}

	public String getSpecialRequirements() {
		return specialRequirements;
	}
	public void setSpecialRequirements(String specialRequirements) {
		if ( null != specialRequirements && specialRequirements.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for specialRequirements. Tried to set value: "+
				specialRequirements);
		}
		this.specialRequirements = specialRequirements;
	}

	public Boolean isIsDADReferral() {
		return isDADReferral;
	}
	public void setIsDADReferral(Boolean isDADReferral) {
		this.isDADReferral = isDADReferral;
	}

	public String getDadUbrn() {
		return dadUbrn;
	}
	public void setDadUbrn(String dadUbrn) {
		if ( null != dadUbrn && dadUbrn.length() > 50 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for dadUbrn. Tried to set value: "+
				dadUbrn);
		}
		this.dadUbrn = dadUbrn;
	}

	public Boolean isIsReferrerPatientsGp() {
		return isReferrerPatientsGp;
	}
	public void setIsReferrerPatientsGp(Boolean isReferrerPatientsGp) {
		this.isReferrerPatientsGp = isReferrerPatientsGp;
	}

	public ims.core.resource.place.domain.objects.Location getLocation() {
		return location;
	}
	public void setLocation(ims.core.resource.place.domain.objects.Location location) {
		this.location = location;
	}

	public ims.core.clinical.domain.objects.Procedure getProcedure() {
		return procedure;
	}
	public void setProcedure(ims.core.clinical.domain.objects.Procedure procedure) {
		this.procedure = procedure;
	}

	public ims.core.domain.objects.PatientTransportRequirements getTransportRequirements() {
		return transportRequirements;
	}
	public void setTransportRequirements(ims.core.domain.objects.PatientTransportRequirements transportRequirements) {
		this.transportRequirements = transportRequirements;
	}

	public ims.core.resource.people.domain.objects.Hcp getReferringConsultant() {
		return referringConsultant;
	}
	public void setReferringConsultant(ims.core.resource.people.domain.objects.Hcp referringConsultant) {
		this.referringConsultant = referringConsultant;
	}

	public String getRefererAddress() {
		return refererAddress;
	}
	public void setRefererAddress(String refererAddress) {
		if ( null != refererAddress && refererAddress.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for refererAddress. Tried to set value: "+
				refererAddress);
		}
		this.refererAddress = refererAddress;
	}

	public String getTransferedBY() {
		return transferedBY;
	}
	public void setTransferedBY(String transferedBY) {
		if ( null != transferedBY && transferedBY.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for transferedBY. Tried to set value: "+
				transferedBY);
		}
		this.transferedBY = transferedBY;
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
		
		auditStr.append("\r\n*service* :");
		if (service != null)
		{
			auditStr.append(toShortClassName(service));
				
		    auditStr.append(service.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*consultant* :");
		if (consultant != null)
		{
			auditStr.append(toShortClassName(consultant));
				
		    auditStr.append(consultant.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*function* :");
		if (function != null)
		{
			auditStr.append(toShortClassName(function));
				
		    auditStr.append(function.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*referrerType* :");
		if (referrerType != null)
			auditStr.append(referrerType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringUser* :");
		if (authoringUser != null)
		{
			auditStr.append(toShortClassName(authoringUser));
				
		    auditStr.append(authoringUser.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringDateTime* :");
		auditStr.append(authoringDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*gPName* :");
		if (gPName != null)
		{
			auditStr.append(toShortClassName(gPName));
				
		    auditStr.append(gPName.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*practice* :");
		if (practice != null)
		{
			auditStr.append(toShortClassName(practice));
				
		    auditStr.append(practice.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*alliedHealthProfName* :");
		auditStr.append(alliedHealthProfName);
	    auditStr.append("; ");
		auditStr.append("\r\n*originalDateOfReferral* :");
		auditStr.append(originalDateOfReferral);
	    auditStr.append("; ");
		auditStr.append("\r\n*dateOfReferral* :");
		auditStr.append(dateOfReferral);
	    auditStr.append("; ");
		auditStr.append("\r\n*dateReferralReceived* :");
		auditStr.append(dateReferralReceived);
	    auditStr.append("; ");
		auditStr.append("\r\n*endDateKPI* :");
		auditStr.append(endDateKPI);
	    auditStr.append("; ");
		auditStr.append("\r\n*endDateEmailKPI* :");
		auditStr.append(endDateEmailKPI);
	    auditStr.append("; ");
		auditStr.append("\r\n*endDatePaperKPI* :");
		auditStr.append(endDatePaperKPI);
	    auditStr.append("; ");
		auditStr.append("\r\n*end18WW* :");
		auditStr.append(end18WW);
	    auditStr.append("; ");
		auditStr.append("\r\n*interpreterRequired* :");
		if (interpreterRequired != null)
			auditStr.append(interpreterRequired.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*language* :");
		if (language != null)
			auditStr.append(language.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*transportRequired* :");
		if (transportRequired != null)
			auditStr.append(transportRequired.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*transport* :");
		if (transport != null)
			auditStr.append(transport.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*copyDischargeToPatient* :");
		auditStr.append(copyDischargeToPatient);
	    auditStr.append("; ");
		auditStr.append("\r\n*pCT* :");
		auditStr.append(pCT);
	    auditStr.append("; ");
		auditStr.append("\r\n*otherLanguage* :");
		auditStr.append(otherLanguage);
	    auditStr.append("; ");
		auditStr.append("\r\n*specialRequirements* :");
		auditStr.append(specialRequirements);
	    auditStr.append("; ");
		auditStr.append("\r\n*isDADReferral* :");
		auditStr.append(isDADReferral);
	    auditStr.append("; ");
		auditStr.append("\r\n*dadUbrn* :");
		auditStr.append(dadUbrn);
	    auditStr.append("; ");
		auditStr.append("\r\n*isReferrerPatientsGp* :");
		auditStr.append(isReferrerPatientsGp);
	    auditStr.append("; ");
		auditStr.append("\r\n*location* :");
		if (location != null)
		{
			auditStr.append(toShortClassName(location));
				
		    auditStr.append(location.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*procedure* :");
		if (procedure != null)
		{
			auditStr.append(toShortClassName(procedure));
				
		    auditStr.append(procedure.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*transportRequirements* :");
		if (transportRequirements != null)
		{
			auditStr.append(toShortClassName(transportRequirements));
				
		    auditStr.append(transportRequirements.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*referringConsultant* :");
		if (referringConsultant != null)
		{
			auditStr.append(toShortClassName(referringConsultant));
				
		    auditStr.append(referringConsultant.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*refererAddress* :");
		auditStr.append(refererAddress);
	    auditStr.append("; ");
		auditStr.append("\r\n*transferedBY* :");
		auditStr.append(transferedBY);
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
		
		String keyClassName = "ReferralLetterDetails";
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
		if (this.getService() != null)
		{
			sb.append("<service>");
			sb.append(this.getService().toXMLString(domMap)); 	
			sb.append("</service>");		
		}
		if (this.getConsultant() != null)
		{
			sb.append("<consultant>");
			sb.append(this.getConsultant().toXMLString(domMap)); 	
			sb.append("</consultant>");		
		}
		if (this.getFunction() != null)
		{
			sb.append("<function>");
			sb.append(this.getFunction().toXMLString(domMap)); 	
			sb.append("</function>");		
		}
		if (this.getReferrerType() != null)
		{
			sb.append("<referrerType>");
			sb.append(this.getReferrerType().toXMLString()); 
			sb.append("</referrerType>");		
		}
		if (this.getAuthoringUser() != null)
		{
			sb.append("<authoringUser>");
			sb.append(this.getAuthoringUser().toXMLString(domMap)); 	
			sb.append("</authoringUser>");		
		}
		if (this.getAuthoringDateTime() != null)
		{
			sb.append("<authoringDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getAuthoringDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</authoringDateTime>");		
		}
		if (this.getGPName() != null)
		{
			sb.append("<gPName>");
			sb.append(this.getGPName().toXMLString(domMap)); 	
			sb.append("</gPName>");		
		}
		if (this.getPractice() != null)
		{
			sb.append("<practice>");
			sb.append(this.getPractice().toXMLString(domMap)); 	
			sb.append("</practice>");		
		}
		if (this.getAlliedHealthProfName() != null)
		{
			sb.append("<alliedHealthProfName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAlliedHealthProfName().toString()));
			sb.append("</alliedHealthProfName>");		
		}
		if (this.getOriginalDateOfReferral() != null)
		{
			sb.append("<originalDateOfReferral>");
			sb.append(new ims.framework.utils.DateTime(this.getOriginalDateOfReferral()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</originalDateOfReferral>");		
		}
		if (this.getDateOfReferral() != null)
		{
			sb.append("<dateOfReferral>");
			sb.append(new ims.framework.utils.DateTime(this.getDateOfReferral()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateOfReferral>");		
		}
		if (this.getDateReferralReceived() != null)
		{
			sb.append("<dateReferralReceived>");
			sb.append(new ims.framework.utils.DateTime(this.getDateReferralReceived()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateReferralReceived>");		
		}
		if (this.getEndDateKPI() != null)
		{
			sb.append("<endDateKPI>");
			sb.append(new ims.framework.utils.DateTime(this.getEndDateKPI()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</endDateKPI>");		
		}
		if (this.getEndDateEmailKPI() != null)
		{
			sb.append("<endDateEmailKPI>");
			sb.append(new ims.framework.utils.DateTime(this.getEndDateEmailKPI()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</endDateEmailKPI>");		
		}
		if (this.getEndDatePaperKPI() != null)
		{
			sb.append("<endDatePaperKPI>");
			sb.append(new ims.framework.utils.DateTime(this.getEndDatePaperKPI()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</endDatePaperKPI>");		
		}
		if (this.getEnd18WW() != null)
		{
			sb.append("<end18WW>");
			sb.append(new ims.framework.utils.DateTime(this.getEnd18WW()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</end18WW>");		
		}
		if (this.getInterpreterRequired() != null)
		{
			sb.append("<interpreterRequired>");
			sb.append(this.getInterpreterRequired().toXMLString()); 
			sb.append("</interpreterRequired>");		
		}
		if (this.getLanguage() != null)
		{
			sb.append("<language>");
			sb.append(this.getLanguage().toXMLString()); 
			sb.append("</language>");		
		}
		if (this.getTransportRequired() != null)
		{
			sb.append("<transportRequired>");
			sb.append(this.getTransportRequired().toXMLString()); 
			sb.append("</transportRequired>");		
		}
		if (this.getTransport() != null)
		{
			sb.append("<transport>");
			sb.append(this.getTransport().toXMLString()); 
			sb.append("</transport>");		
		}
		if (this.isCopyDischargeToPatient() != null)
		{
			sb.append("<copyDischargeToPatient>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isCopyDischargeToPatient().toString()));
			sb.append("</copyDischargeToPatient>");		
		}
		if (this.getPCT() != null)
		{
			sb.append("<pCT>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPCT().toString()));
			sb.append("</pCT>");		
		}
		if (this.getOtherLanguage() != null)
		{
			sb.append("<otherLanguage>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOtherLanguage().toString()));
			sb.append("</otherLanguage>");		
		}
		if (this.getSpecialRequirements() != null)
		{
			sb.append("<specialRequirements>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSpecialRequirements().toString()));
			sb.append("</specialRequirements>");		
		}
		if (this.isIsDADReferral() != null)
		{
			sb.append("<isDADReferral>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsDADReferral().toString()));
			sb.append("</isDADReferral>");		
		}
		if (this.getDadUbrn() != null)
		{
			sb.append("<dadUbrn>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDadUbrn().toString()));
			sb.append("</dadUbrn>");		
		}
		if (this.isIsReferrerPatientsGp() != null)
		{
			sb.append("<isReferrerPatientsGp>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsReferrerPatientsGp().toString()));
			sb.append("</isReferrerPatientsGp>");		
		}
		if (this.getLocation() != null)
		{
			sb.append("<location>");
			sb.append(this.getLocation().toXMLString(domMap)); 	
			sb.append("</location>");		
		}
		if (this.getProcedure() != null)
		{
			sb.append("<procedure>");
			sb.append(this.getProcedure().toXMLString(domMap)); 	
			sb.append("</procedure>");		
		}
		if (this.getTransportRequirements() != null)
		{
			sb.append("<transportRequirements>");
			sb.append(this.getTransportRequirements().toXMLString(domMap)); 	
			sb.append("</transportRequirements>");		
		}
		if (this.getReferringConsultant() != null)
		{
			sb.append("<referringConsultant>");
			sb.append(this.getReferringConsultant().toXMLString(domMap)); 	
			sb.append("</referringConsultant>");		
		}
		if (this.getRefererAddress() != null)
		{
			sb.append("<refererAddress>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRefererAddress().toString()));
			sb.append("</refererAddress>");		
		}
		if (this.getTransferedBY() != null)
		{
			sb.append("<transferedBY>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTransferedBY().toString()));
			sb.append("</transferedBY>");		
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
			ReferralLetterDetails domainObject = getReferralLetterDetailsfromXML(itemEl, factory, domMap);

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
			ReferralLetterDetails domainObject = getReferralLetterDetailsfromXML(itemEl, factory, domMap);

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
		
	public static ReferralLetterDetails getReferralLetterDetailsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getReferralLetterDetailsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static ReferralLetterDetails getReferralLetterDetailsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!ReferralLetterDetails.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!ReferralLetterDetails.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the ReferralLetterDetails class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (ReferralLetterDetails)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(ReferralLetterDetails.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		ReferralLetterDetails ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (ReferralLetterDetails)factory.getImportedDomainObject(ReferralLetterDetails.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new ReferralLetterDetails();
		}
		String keyClassName = "ReferralLetterDetails";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (ReferralLetterDetails)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, ReferralLetterDetails obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("service");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setService(ims.core.clinical.domain.objects.Service.getServicefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("consultant");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setConsultant(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("function");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setFunction(ims.core.clinical.domain.objects.ServiceFunction.getServiceFunctionfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("referrerType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReferrerType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("authoringUser");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringUser(ims.core.resource.people.domain.objects.MemberOfStaff.getMemberOfStafffromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("authoringDateTime");
		if(fldEl != null)
		{	
    		obj.setAuthoringDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("gPName");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setGPName(ims.core.resource.people.domain.objects.Gp.getGpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("practice");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPractice(ims.core.resource.place.domain.objects.Organisation.getOrganisationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("alliedHealthProfName");
		if(fldEl != null)
		{	
    		obj.setAlliedHealthProfName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("originalDateOfReferral");
		if(fldEl != null)
		{	
    		obj.setOriginalDateOfReferral(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("dateOfReferral");
		if(fldEl != null)
		{	
    		obj.setDateOfReferral(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("dateReferralReceived");
		if(fldEl != null)
		{	
    		obj.setDateReferralReceived(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("endDateKPI");
		if(fldEl != null)
		{	
    		obj.setEndDateKPI(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("endDateEmailKPI");
		if(fldEl != null)
		{	
    		obj.setEndDateEmailKPI(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("endDatePaperKPI");
		if(fldEl != null)
		{	
    		obj.setEndDatePaperKPI(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("end18WW");
		if(fldEl != null)
		{	
    		obj.setEnd18WW(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("interpreterRequired");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setInterpreterRequired(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("language");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setLanguage(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("transportRequired");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTransportRequired(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("transport");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setTransport(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("copyDischargeToPatient");
		if(fldEl != null)
		{	
    		obj.setCopyDischargeToPatient(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("pCT");
		if(fldEl != null)
		{	
    		obj.setPCT(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("otherLanguage");
		if(fldEl != null)
		{	
    		obj.setOtherLanguage(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("specialRequirements");
		if(fldEl != null)
		{	
    		obj.setSpecialRequirements(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isDADReferral");
		if(fldEl != null)
		{	
    		obj.setIsDADReferral(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dadUbrn");
		if(fldEl != null)
		{	
    		obj.setDadUbrn(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isReferrerPatientsGp");
		if(fldEl != null)
		{	
    		obj.setIsReferrerPatientsGp(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("location");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setLocation(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("procedure");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setProcedure(ims.core.clinical.domain.objects.Procedure.getProcedurefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("transportRequirements");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTransportRequirements(ims.core.domain.objects.PatientTransportRequirements.getPatientTransportRequirementsfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("referringConsultant");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setReferringConsultant(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("refererAddress");
		if(fldEl != null)
		{	
    		obj.setRefererAddress(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("transferedBY");
		if(fldEl != null)
		{	
    		obj.setTransferedBY(new String(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		};
	}

	/**
	calculateEnd18WW
	*/
	public java.util.Date calculateEnd18WW()
	{
		java.util.Date end18wwDt = new java.util.Date(dateOfReferral.getTime());
		java.util.Calendar cal = java.util.Calendar.getInstance();
		cal.setTime(end18wwDt);
		cal.add(java.util.Calendar.WEEK_OF_YEAR, 18);
		return cal.getTime();
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Service = "service";
		public static final String Consultant = "consultant";
		public static final String Function = "function";
		public static final String ReferrerType = "referrerType";
		public static final String AuthoringUser = "authoringUser";
		public static final String AuthoringDateTime = "authoringDateTime";
		public static final String GPName = "gPName";
		public static final String Practice = "practice";
		public static final String AlliedHealthProfName = "alliedHealthProfName";
		public static final String OriginalDateOfReferral = "originalDateOfReferral";
		public static final String DateOfReferral = "dateOfReferral";
		public static final String DateReferralReceived = "dateReferralReceived";
		public static final String EndDateKPI = "endDateKPI";
		public static final String EndDateEmailKPI = "endDateEmailKPI";
		public static final String EndDatePaperKPI = "endDatePaperKPI";
		public static final String End18WW = "end18WW";
		public static final String InterpreterRequired = "interpreterRequired";
		public static final String Language = "language";
		public static final String TransportRequired = "transportRequired";
		public static final String Transport = "transport";
		public static final String CopyDischargeToPatient = "copyDischargeToPatient";
		public static final String PCT = "pCT";
		public static final String OtherLanguage = "otherLanguage";
		public static final String SpecialRequirements = "specialRequirements";
		public static final String IsDADReferral = "isDADReferral";
		public static final String DadUbrn = "dadUbrn";
		public static final String IsReferrerPatientsGp = "isReferrerPatientsGp";
		public static final String Location = "location";
		public static final String Procedure = "procedure";
		public static final String TransportRequirements = "transportRequirements";
		public static final String ReferringConsultant = "referringConsultant";
		public static final String RefererAddress = "refererAddress";
		public static final String TransferedBY = "transferedBY";
	}
}

