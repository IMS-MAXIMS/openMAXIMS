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
package ims.core.admin.pas.domain.objects;

/**
 * 
 * @author John MacEnri
 * Generated.
 */


public class InpatientEpisode extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1014100000;
	private static final long serialVersionUID = 1014100000L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Ward Stays
	  * Collection of ims.core.admin.pas.domain.objects.WardStay.
	  */
	private java.util.Set wardStays;
	/** Consultant Stay
	  * Collection of ims.core.admin.pas.domain.objects.ConsultantStay.
	  */
	private java.util.Set consultantStays;
	/** Is On Leave */
	private Boolean isOnLeave;
	/** pasEvent */
	private ims.core.admin.pas.domain.objects.PASEvent pasEvent;
	/** Bed */
	private ims.core.admin.pas.domain.objects.BedSpaceState bed;
	/** Admission Date Time */
	private java.util.Date admissionDateTime;
	/** Estimated Discharge Date Time */
	private java.util.Date estDischargeDate;
	/** Comments */
	private String comments;
	/** Ward Type - Main\Side */
	private ims.domain.lookups.LookupInstance wardType;
	/** Is Confirmed Discharge */
	private Boolean isConfirmedDischarge;
	/** Confirmed Discharge Date Time */
	private java.util.Date confirmedDischargeDateTime;
	/** Bed Number */
	private String bedNo;
	/** Admission Type */
	private ims.domain.lookups.LookupInstance admissionType;
	/** isMaternityInpatient */
	private Boolean isMaternityInpatient;
	/** ReadmissionType */
	private ims.domain.lookups.LookupInstance readmissionType;
	/** Discharge Ready Date */
	private java.util.Date dischargeReadyDate;
	/** Reason */
	private String reasonForAdmission;
	/** is Patient On Home Leave */
	private Boolean isOnHomeLeave;
	/** Date Patient went On Home Leave */
	private java.util.Date dateOnHomeLeave;
	/** Time Patient went On Home Leave */
	private String timeOnHomeLeave;
	/** Expected Date Of Return */
	private java.util.Date expectedDateOfReturn;
	/** ExpectedTimeOfReturn */
	private String expectedTimeOfReturn;
	/** HomeLeaves
	  * Collection of ims.core.admin.pas.domain.objects.HomeLeave.
	  */
	private java.util.List homeLeaves;
	/** Vacated bed number while on Home Leave */
	private String vacatedBedNumber;
	/** VTE Assessment Status */
	private ims.domain.lookups.LookupInstance vTEAssessmentStatus;
	/** VTE Risk Assessment */
	private ims.core.clinical.domain.objects.VTERiskAssessment vTERiskAssessment;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public InpatientEpisode (Integer id, int ver)
    {
    	super(id, ver);
    }
    public InpatientEpisode ()
    {
    	super();
    }
    public InpatientEpisode (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.admin.pas.domain.objects.InpatientEpisode.class;
	}


	public java.util.Set getWardStays() {
		if ( null == wardStays ) {
			wardStays = new java.util.HashSet();
		}
		return wardStays;
	}
	public void setWardStays(java.util.Set paramValue) {
		this.wardStays = paramValue;
	}

	public java.util.Set getConsultantStays() {
		if ( null == consultantStays ) {
			consultantStays = new java.util.HashSet();
		}
		return consultantStays;
	}
	public void setConsultantStays(java.util.Set paramValue) {
		this.consultantStays = paramValue;
	}

	public Boolean isIsOnLeave() {
		return isOnLeave;
	}
	public void setIsOnLeave(Boolean isOnLeave) {
		this.isOnLeave = isOnLeave;
	}

	public ims.core.admin.pas.domain.objects.PASEvent getPasEvent() {
		return pasEvent;
	}
	public void setPasEvent(ims.core.admin.pas.domain.objects.PASEvent pasEvent) {
		this.pasEvent = pasEvent;
	}

	public ims.core.admin.pas.domain.objects.BedSpaceState getBed() {
		return bed;
	}
	public void setBed(ims.core.admin.pas.domain.objects.BedSpaceState bed) {
		this.bed = bed;
	}

	public java.util.Date getAdmissionDateTime() {
		return admissionDateTime;
	}
	public void setAdmissionDateTime(java.util.Date admissionDateTime) {
		this.admissionDateTime = admissionDateTime;
	}

	public java.util.Date getEstDischargeDate() {
		return estDischargeDate;
	}
	public void setEstDischargeDate(java.util.Date estDischargeDate) {
		this.estDischargeDate = estDischargeDate;
	}

	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		if ( null != comments && comments.length() > 1500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for comments. Tried to set value: "+
				comments);
		}
		this.comments = comments;
	}

	public ims.domain.lookups.LookupInstance getWardType() {
		return wardType;
	}
	public void setWardType(ims.domain.lookups.LookupInstance wardType) {
		this.wardType = wardType;
	}

	public Boolean isIsConfirmedDischarge() {
		return isConfirmedDischarge;
	}
	public void setIsConfirmedDischarge(Boolean isConfirmedDischarge) {
		this.isConfirmedDischarge = isConfirmedDischarge;
	}

	public java.util.Date getConfirmedDischargeDateTime() {
		return confirmedDischargeDateTime;
	}
	public void setConfirmedDischargeDateTime(java.util.Date confirmedDischargeDateTime) {
		this.confirmedDischargeDateTime = confirmedDischargeDateTime;
	}

	public String getBedNo() {
		return bedNo;
	}
	public void setBedNo(String bedNo) {
		if ( null != bedNo && bedNo.length() > 10 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for bedNo. Tried to set value: "+
				bedNo);
		}
		this.bedNo = bedNo;
	}

	public ims.domain.lookups.LookupInstance getAdmissionType() {
		return admissionType;
	}
	public void setAdmissionType(ims.domain.lookups.LookupInstance admissionType) {
		this.admissionType = admissionType;
	}

	public Boolean isIsMaternityInpatient() {
		return isMaternityInpatient;
	}
	public void setIsMaternityInpatient(Boolean isMaternityInpatient) {
		this.isMaternityInpatient = isMaternityInpatient;
	}

	public ims.domain.lookups.LookupInstance getReadmissionType() {
		return readmissionType;
	}
	public void setReadmissionType(ims.domain.lookups.LookupInstance readmissionType) {
		this.readmissionType = readmissionType;
	}

	public java.util.Date getDischargeReadyDate() {
		return dischargeReadyDate;
	}
	public void setDischargeReadyDate(java.util.Date dischargeReadyDate) {
		this.dischargeReadyDate = dischargeReadyDate;
	}

	public String getReasonForAdmission() {
		return reasonForAdmission;
	}
	public void setReasonForAdmission(String reasonForAdmission) {
		if ( null != reasonForAdmission && reasonForAdmission.length() > 32 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for reasonForAdmission. Tried to set value: "+
				reasonForAdmission);
		}
		this.reasonForAdmission = reasonForAdmission;
	}

	public Boolean isIsOnHomeLeave() {
		return isOnHomeLeave;
	}
	public void setIsOnHomeLeave(Boolean isOnHomeLeave) {
		this.isOnHomeLeave = isOnHomeLeave;
	}

	public java.util.Date getDateOnHomeLeave() {
		return dateOnHomeLeave;
	}
	public void setDateOnHomeLeave(java.util.Date dateOnHomeLeave) {
		this.dateOnHomeLeave = dateOnHomeLeave;
	}

	public String getTimeOnHomeLeave() {
		return timeOnHomeLeave;
	}
	public void setTimeOnHomeLeave(String timeOnHomeLeave) {
		this.timeOnHomeLeave = timeOnHomeLeave;
	}

	public java.util.Date getExpectedDateOfReturn() {
		return expectedDateOfReturn;
	}
	public void setExpectedDateOfReturn(java.util.Date expectedDateOfReturn) {
		this.expectedDateOfReturn = expectedDateOfReturn;
	}

	public String getExpectedTimeOfReturn() {
		return expectedTimeOfReturn;
	}
	public void setExpectedTimeOfReturn(String expectedTimeOfReturn) {
		this.expectedTimeOfReturn = expectedTimeOfReturn;
	}

	public java.util.List getHomeLeaves() {
		if ( null == homeLeaves ) {
			homeLeaves = new java.util.ArrayList();
		}
		return homeLeaves;
	}
	public void setHomeLeaves(java.util.List paramValue) {
		this.homeLeaves = paramValue;
	}

	public String getVacatedBedNumber() {
		return vacatedBedNumber;
	}
	public void setVacatedBedNumber(String vacatedBedNumber) {
		if ( null != vacatedBedNumber && vacatedBedNumber.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for vacatedBedNumber. Tried to set value: "+
				vacatedBedNumber);
		}
		this.vacatedBedNumber = vacatedBedNumber;
	}

	public ims.domain.lookups.LookupInstance getVTEAssessmentStatus() {
		return vTEAssessmentStatus;
	}
	public void setVTEAssessmentStatus(ims.domain.lookups.LookupInstance vTEAssessmentStatus) {
		this.vTEAssessmentStatus = vTEAssessmentStatus;
	}

	public ims.core.clinical.domain.objects.VTERiskAssessment getVTERiskAssessment() {
		return vTERiskAssessment;
	}
	public void setVTERiskAssessment(ims.core.clinical.domain.objects.VTERiskAssessment vTERiskAssessment) {
		this.vTERiskAssessment = vTERiskAssessment;
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
		
		auditStr.append("\r\n*wardStays* :");
		if (wardStays != null)
		{
			java.util.Iterator it1 = wardStays.iterator();
			int i1=0;
			while (it1.hasNext())
			{
				if (i1 > 0)
					auditStr.append(",");
				ims.core.admin.pas.domain.objects.WardStay obj = (ims.core.admin.pas.domain.objects.WardStay)it1.next();
		if (obj != null)
		{
		   if (i1 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i1++;
		}
		if (i1 > 0)
			auditStr.append("] " + i1);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*consultantStays* :");
		if (consultantStays != null)
		{
			java.util.Iterator it2 = consultantStays.iterator();
			int i2=0;
			while (it2.hasNext())
			{
				if (i2 > 0)
					auditStr.append(",");
				ims.core.admin.pas.domain.objects.ConsultantStay obj = (ims.core.admin.pas.domain.objects.ConsultantStay)it2.next();
		if (obj != null)
		{
		   if (i2 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i2++;
		}
		if (i2 > 0)
			auditStr.append("] " + i2);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*isOnLeave* :");
		auditStr.append(isOnLeave);
	    auditStr.append("; ");
		auditStr.append("\r\n*pasEvent* :");
		if (pasEvent != null)
		{
			auditStr.append(toShortClassName(pasEvent));
				
		    auditStr.append(pasEvent.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*bed* :");
		if (bed != null)
		{
			auditStr.append(toShortClassName(bed));
				
		    auditStr.append(bed.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*admissionDateTime* :");
		auditStr.append(admissionDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*estDischargeDate* :");
		auditStr.append(estDischargeDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*comments* :");
		auditStr.append(comments);
	    auditStr.append("; ");
		auditStr.append("\r\n*wardType* :");
		if (wardType != null)
			auditStr.append(wardType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*isConfirmedDischarge* :");
		auditStr.append(isConfirmedDischarge);
	    auditStr.append("; ");
		auditStr.append("\r\n*confirmedDischargeDateTime* :");
		auditStr.append(confirmedDischargeDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*bedNo* :");
		auditStr.append(bedNo);
	    auditStr.append("; ");
		auditStr.append("\r\n*admissionType* :");
		if (admissionType != null)
			auditStr.append(admissionType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*isMaternityInpatient* :");
		auditStr.append(isMaternityInpatient);
	    auditStr.append("; ");
		auditStr.append("\r\n*readmissionType* :");
		if (readmissionType != null)
			auditStr.append(readmissionType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*dischargeReadyDate* :");
		auditStr.append(dischargeReadyDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*reasonForAdmission* :");
		auditStr.append(reasonForAdmission);
	    auditStr.append("; ");
		auditStr.append("\r\n*isOnHomeLeave* :");
		auditStr.append(isOnHomeLeave);
	    auditStr.append("; ");
		auditStr.append("\r\n*dateOnHomeLeave* :");
		auditStr.append(dateOnHomeLeave);
	    auditStr.append("; ");
		auditStr.append("\r\n*timeOnHomeLeave* :");
		auditStr.append(timeOnHomeLeave);
	    auditStr.append("; ");
		auditStr.append("\r\n*expectedDateOfReturn* :");
		auditStr.append(expectedDateOfReturn);
	    auditStr.append("; ");
		auditStr.append("\r\n*expectedTimeOfReturn* :");
		auditStr.append(expectedTimeOfReturn);
	    auditStr.append("; ");
		auditStr.append("\r\n*homeLeaves* :");
		if (homeLeaves != null)
		{
		int i23=0;
		for (i23=0; i23<homeLeaves.size(); i23++)
		{
			if (i23 > 0)
				auditStr.append(",");
			ims.core.admin.pas.domain.objects.HomeLeave obj = (ims.core.admin.pas.domain.objects.HomeLeave)homeLeaves.get(i23);
		    if (obj != null)
			{
				if (i23 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i23 > 0)
			auditStr.append("] " + i23);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*vacatedBedNumber* :");
		auditStr.append(vacatedBedNumber);
	    auditStr.append("; ");
		auditStr.append("\r\n*vTEAssessmentStatus* :");
		if (vTEAssessmentStatus != null)
			auditStr.append(vTEAssessmentStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*vTERiskAssessment* :");
		if (vTERiskAssessment != null)
		{
			auditStr.append(toShortClassName(vTERiskAssessment));
				
		    auditStr.append(vTERiskAssessment.getId());
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
		
		String keyClassName = "InpatientEpisode";
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
		if (this.getWardStays() != null)
		{
			if (this.getWardStays().size() > 0 )
			{
			sb.append("<wardStays>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getWardStays(), domMap));
			sb.append("</wardStays>");		
			}
		}
		if (this.getConsultantStays() != null)
		{
			if (this.getConsultantStays().size() > 0 )
			{
			sb.append("<consultantStays>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getConsultantStays(), domMap));
			sb.append("</consultantStays>");		
			}
		}
		if (this.isIsOnLeave() != null)
		{
			sb.append("<isOnLeave>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsOnLeave().toString()));
			sb.append("</isOnLeave>");		
		}
		if (this.getPasEvent() != null)
		{
			sb.append("<pasEvent>");
			sb.append(this.getPasEvent().toXMLString(domMap)); 	
			sb.append("</pasEvent>");		
		}
		if (this.getBed() != null)
		{
			sb.append("<bed>");
			sb.append(this.getBed().toXMLString(domMap)); 	
			sb.append("</bed>");		
		}
		if (this.getAdmissionDateTime() != null)
		{
			sb.append("<admissionDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getAdmissionDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</admissionDateTime>");		
		}
		if (this.getEstDischargeDate() != null)
		{
			sb.append("<estDischargeDate>");
			sb.append(new ims.framework.utils.DateTime(this.getEstDischargeDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</estDischargeDate>");		
		}
		if (this.getComments() != null)
		{
			sb.append("<comments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getComments().toString()));
			sb.append("</comments>");		
		}
		if (this.getWardType() != null)
		{
			sb.append("<wardType>");
			sb.append(this.getWardType().toXMLString()); 
			sb.append("</wardType>");		
		}
		if (this.isIsConfirmedDischarge() != null)
		{
			sb.append("<isConfirmedDischarge>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsConfirmedDischarge().toString()));
			sb.append("</isConfirmedDischarge>");		
		}
		if (this.getConfirmedDischargeDateTime() != null)
		{
			sb.append("<confirmedDischargeDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getConfirmedDischargeDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</confirmedDischargeDateTime>");		
		}
		if (this.getBedNo() != null)
		{
			sb.append("<bedNo>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getBedNo().toString()));
			sb.append("</bedNo>");		
		}
		if (this.getAdmissionType() != null)
		{
			sb.append("<admissionType>");
			sb.append(this.getAdmissionType().toXMLString()); 
			sb.append("</admissionType>");		
		}
		if (this.isIsMaternityInpatient() != null)
		{
			sb.append("<isMaternityInpatient>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsMaternityInpatient().toString()));
			sb.append("</isMaternityInpatient>");		
		}
		if (this.getReadmissionType() != null)
		{
			sb.append("<readmissionType>");
			sb.append(this.getReadmissionType().toXMLString()); 
			sb.append("</readmissionType>");		
		}
		if (this.getDischargeReadyDate() != null)
		{
			sb.append("<dischargeReadyDate>");
			sb.append(new ims.framework.utils.DateTime(this.getDischargeReadyDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dischargeReadyDate>");		
		}
		if (this.getReasonForAdmission() != null)
		{
			sb.append("<reasonForAdmission>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReasonForAdmission().toString()));
			sb.append("</reasonForAdmission>");		
		}
		if (this.isIsOnHomeLeave() != null)
		{
			sb.append("<isOnHomeLeave>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsOnHomeLeave().toString()));
			sb.append("</isOnHomeLeave>");		
		}
		if (this.getDateOnHomeLeave() != null)
		{
			sb.append("<dateOnHomeLeave>");
			sb.append(new ims.framework.utils.DateTime(this.getDateOnHomeLeave()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateOnHomeLeave>");		
		}
		if (this.getTimeOnHomeLeave() != null)
		{
			sb.append("<timeOnHomeLeave>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTimeOnHomeLeave().toString()));
			sb.append("</timeOnHomeLeave>");		
		}
		if (this.getExpectedDateOfReturn() != null)
		{
			sb.append("<expectedDateOfReturn>");
			sb.append(new ims.framework.utils.DateTime(this.getExpectedDateOfReturn()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</expectedDateOfReturn>");		
		}
		if (this.getExpectedTimeOfReturn() != null)
		{
			sb.append("<expectedTimeOfReturn>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getExpectedTimeOfReturn().toString()));
			sb.append("</expectedTimeOfReturn>");		
		}
		if (this.getHomeLeaves() != null)
		{
			if (this.getHomeLeaves().size() > 0 )
			{
			sb.append("<homeLeaves>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getHomeLeaves(), domMap));
			sb.append("</homeLeaves>");		
			}
		}
		if (this.getVacatedBedNumber() != null)
		{
			sb.append("<vacatedBedNumber>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getVacatedBedNumber().toString()));
			sb.append("</vacatedBedNumber>");		
		}
		if (this.getVTEAssessmentStatus() != null)
		{
			sb.append("<vTEAssessmentStatus>");
			sb.append(this.getVTEAssessmentStatus().toXMLString()); 
			sb.append("</vTEAssessmentStatus>");		
		}
		if (this.getVTERiskAssessment() != null)
		{
			sb.append("<vTERiskAssessment>");
			sb.append(this.getVTERiskAssessment().toXMLString(domMap)); 	
			sb.append("</vTERiskAssessment>");		
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
			InpatientEpisode domainObject = getInpatientEpisodefromXML(itemEl, factory, domMap);

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
			InpatientEpisode domainObject = getInpatientEpisodefromXML(itemEl, factory, domMap);

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
		
	public static InpatientEpisode getInpatientEpisodefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getInpatientEpisodefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static InpatientEpisode getInpatientEpisodefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!InpatientEpisode.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!InpatientEpisode.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the InpatientEpisode class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (InpatientEpisode)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(InpatientEpisode.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		InpatientEpisode ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (InpatientEpisode)factory.getImportedDomainObject(InpatientEpisode.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new InpatientEpisode();
		}
		String keyClassName = "InpatientEpisode";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (InpatientEpisode)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, InpatientEpisode obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("wardStays");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setWardStays(ims.core.admin.pas.domain.objects.WardStay.fromSetXMLString(fldEl, factory, obj.getWardStays(), domMap));
		}
		fldEl = el.element("consultantStays");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setConsultantStays(ims.core.admin.pas.domain.objects.ConsultantStay.fromSetXMLString(fldEl, factory, obj.getConsultantStays(), domMap));
		}
		fldEl = el.element("isOnLeave");
		if(fldEl != null)
		{	
    		obj.setIsOnLeave(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("pasEvent");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPasEvent(ims.core.admin.pas.domain.objects.PASEvent.getPASEventfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("bed");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setBed(ims.core.admin.pas.domain.objects.BedSpaceState.getBedSpaceStatefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("admissionDateTime");
		if(fldEl != null)
		{	
    		obj.setAdmissionDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("estDischargeDate");
		if(fldEl != null)
		{	
    		obj.setEstDischargeDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("comments");
		if(fldEl != null)
		{	
    		obj.setComments(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("wardType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setWardType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("isConfirmedDischarge");
		if(fldEl != null)
		{	
    		obj.setIsConfirmedDischarge(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("confirmedDischargeDateTime");
		if(fldEl != null)
		{	
    		obj.setConfirmedDischargeDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("bedNo");
		if(fldEl != null)
		{	
    		obj.setBedNo(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("admissionType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAdmissionType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("isMaternityInpatient");
		if(fldEl != null)
		{	
    		obj.setIsMaternityInpatient(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("readmissionType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setReadmissionType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("dischargeReadyDate");
		if(fldEl != null)
		{	
    		obj.setDischargeReadyDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("reasonForAdmission");
		if(fldEl != null)
		{	
    		obj.setReasonForAdmission(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("isOnHomeLeave");
		if(fldEl != null)
		{	
    		obj.setIsOnHomeLeave(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dateOnHomeLeave");
		if(fldEl != null)
		{	
    		obj.setDateOnHomeLeave(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("timeOnHomeLeave");
		if(fldEl != null)
		{	
    		obj.setTimeOnHomeLeave(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("expectedDateOfReturn");
		if(fldEl != null)
		{	
    		obj.setExpectedDateOfReturn(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("expectedTimeOfReturn");
		if(fldEl != null)
		{	
    		obj.setExpectedTimeOfReturn(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("homeLeaves");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setHomeLeaves(ims.core.admin.pas.domain.objects.HomeLeave.fromListXMLString(fldEl, factory, obj.getHomeLeaves(), domMap));
		}
		fldEl = el.element("vacatedBedNumber");
		if(fldEl != null)
		{	
    		obj.setVacatedBedNumber(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("vTEAssessmentStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setVTEAssessmentStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("vTERiskAssessment");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setVTERiskAssessment(ims.core.clinical.domain.objects.VTERiskAssessment.getVTERiskAssessmentfromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "wardStays"
		, "consultantStays"
		, "homeLeaves"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String WardStays = "wardStays";
		public static final String ConsultantStays = "consultantStays";
		public static final String IsOnLeave = "isOnLeave";
		public static final String PasEvent = "pasEvent";
		public static final String Bed = "bed";
		public static final String AdmissionDateTime = "admissionDateTime";
		public static final String EstDischargeDate = "estDischargeDate";
		public static final String Comments = "comments";
		public static final String WardType = "wardType";
		public static final String IsConfirmedDischarge = "isConfirmedDischarge";
		public static final String ConfirmedDischargeDateTime = "confirmedDischargeDateTime";
		public static final String BedNo = "bedNo";
		public static final String AdmissionType = "admissionType";
		public static final String IsMaternityInpatient = "isMaternityInpatient";
		public static final String ReadmissionType = "readmissionType";
		public static final String DischargeReadyDate = "dischargeReadyDate";
		public static final String ReasonForAdmission = "reasonForAdmission";
		public static final String IsOnHomeLeave = "isOnHomeLeave";
		public static final String DateOnHomeLeave = "dateOnHomeLeave";
		public static final String TimeOnHomeLeave = "timeOnHomeLeave";
		public static final String ExpectedDateOfReturn = "expectedDateOfReturn";
		public static final String ExpectedTimeOfReturn = "expectedTimeOfReturn";
		public static final String HomeLeaves = "homeLeaves";
		public static final String VacatedBedNumber = "vacatedBedNumber";
		public static final String VTEAssessmentStatus = "vTEAssessmentStatus";
		public static final String VTERiskAssessment = "vTERiskAssessment";
	}
}

