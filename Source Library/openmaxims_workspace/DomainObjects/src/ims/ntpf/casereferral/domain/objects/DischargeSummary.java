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
package ims.ntpf.casereferral.domain.objects;

/**
 * Need to review 
 * @author Joan Heelan
 * Generated.
 */


public class DischargeSummary extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1035100001;
	private static final long serialVersionUID = 1035100001L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Discharge Status */
	private ims.domain.lookups.LookupInstance dischargeStatus;
	/** Admission Date */
	private java.util.Date admissionDate;
	/** Discharge Date */
	private java.util.Date dischargeDate;
	/** Is Survey Sent */
	private ims.domain.lookups.LookupInstance isSurveySent;
	/** Date Survey Sent */
	private java.util.Date dateSurveySent;
	/** Business Object: Patient Medication
	  * Collection of ims.core.clinical.domain.objects.PatientMedication.
	  */
	private java.util.Set patientMedication;
	/** Results To Follow */
	private ims.domain.lookups.LookupInstance resultsToFollow;
	/** Instructions Given */
	private ims.domain.lookups.LookupInstance instructionsGiven;
	/** Referral To */
	private String referralTo;
	/** for PHN */
	private String followUpNotes;
	/** Invoice Barcode */
	private String invoiceBarcode;
	/** Discharge Summ BarCode */
	private String dischargeSummBarCode;
	/** Procedures
	  * Collection of ims.ntpf.casereferral.domain.objects.DischargeSummaryProcedure.
	  */
	private java.util.List procedures;
	/** Business Object: FollowUp Care
	  * Collection of ims.ntpf.casereferral.domain.objects.FollowUpCare.
	  */
	private java.util.Set followUpCare;
	/** Status History
	  * Collection of ims.ntpf.casereferral.domain.objects.DischargeSummaryStatus.
	  */
	private java.util.Set dischargeStatusHistory;
	private ims.ntpf.casereferral.domain.objects.CaseReferral assocCase;
	/** Comments Collection
	  * Collection of ims.ntpf.common.domain.objects.Comment.
	  */
	private java.util.Set dischargeComments;
	private Boolean isLinkedToCase;
	/** Discharge Flags
	  * Collection of ims.core.resource.place.domain.objects.Activity.
	  */
	private java.util.Set dischargeFlags;
	/** True if comments recorded against discharge summary */
	private Boolean hasComments;
	/** Treating Consultant */
	private ims.core.resource.people.domain.objects.Medic treatingCons;
	/** Treating Hospital */
	private ims.core.resource.place.domain.objects.Location treatingHosp;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public DischargeSummary (Integer id, int ver)
    {
    	super(id, ver);
    }
    public DischargeSummary ()
    {
    	super();
    }
    public DischargeSummary (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.ntpf.casereferral.domain.objects.DischargeSummary.class;
	}


	public ims.domain.lookups.LookupInstance getDischargeStatus() {
		return dischargeStatus;
	}
	public void setDischargeStatus(ims.domain.lookups.LookupInstance dischargeStatus) {
		this.dischargeStatus = dischargeStatus;
	}

	public java.util.Date getAdmissionDate() {
		return admissionDate;
	}
	public void setAdmissionDate(java.util.Date admissionDate) {
		this.admissionDate = admissionDate;
	}

	public java.util.Date getDischargeDate() {
		return dischargeDate;
	}
	public void setDischargeDate(java.util.Date dischargeDate) {
		this.dischargeDate = dischargeDate;
	}

	public ims.domain.lookups.LookupInstance getIsSurveySent() {
		return isSurveySent;
	}
	public void setIsSurveySent(ims.domain.lookups.LookupInstance isSurveySent) {
		this.isSurveySent = isSurveySent;
	}

	public java.util.Date getDateSurveySent() {
		return dateSurveySent;
	}
	public void setDateSurveySent(java.util.Date dateSurveySent) {
		this.dateSurveySent = dateSurveySent;
	}

	public java.util.Set getPatientMedication() {
		if ( null == patientMedication ) {
			patientMedication = new java.util.HashSet();
		}
		return patientMedication;
	}
	public void setPatientMedication(java.util.Set paramValue) {
		this.patientMedication = paramValue;
	}

	public ims.domain.lookups.LookupInstance getResultsToFollow() {
		return resultsToFollow;
	}
	public void setResultsToFollow(ims.domain.lookups.LookupInstance resultsToFollow) {
		this.resultsToFollow = resultsToFollow;
	}

	public ims.domain.lookups.LookupInstance getInstructionsGiven() {
		return instructionsGiven;
	}
	public void setInstructionsGiven(ims.domain.lookups.LookupInstance instructionsGiven) {
		this.instructionsGiven = instructionsGiven;
	}

	public String getReferralTo() {
		return referralTo;
	}
	public void setReferralTo(String referralTo) {
		if ( null != referralTo && referralTo.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for referralTo. Tried to set value: "+
				referralTo);
		}
		this.referralTo = referralTo;
	}

	public String getFollowUpNotes() {
		return followUpNotes;
	}
	public void setFollowUpNotes(String followUpNotes) {
		if ( null != followUpNotes && followUpNotes.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for followUpNotes. Tried to set value: "+
				followUpNotes);
		}
		this.followUpNotes = followUpNotes;
	}

	public String getInvoiceBarcode() {
		return invoiceBarcode;
	}
	public void setInvoiceBarcode(String invoiceBarcode) {
		if ( null != invoiceBarcode && invoiceBarcode.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for invoiceBarcode. Tried to set value: "+
				invoiceBarcode);
		}
		this.invoiceBarcode = invoiceBarcode;
	}

	public String getDischargeSummBarCode() {
		return dischargeSummBarCode;
	}
	public void setDischargeSummBarCode(String dischargeSummBarCode) {
		if ( null != dischargeSummBarCode && dischargeSummBarCode.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for dischargeSummBarCode. Tried to set value: "+
				dischargeSummBarCode);
		}
		this.dischargeSummBarCode = dischargeSummBarCode;
	}

	public java.util.List getProcedures() {
		if ( null == procedures ) {
			procedures = new java.util.ArrayList();
		}
		return procedures;
	}
	public void setProcedures(java.util.List paramValue) {
		this.procedures = paramValue;
	}

	public java.util.Set getFollowUpCare() {
		if ( null == followUpCare ) {
			followUpCare = new java.util.HashSet();
		}
		return followUpCare;
	}
	public void setFollowUpCare(java.util.Set paramValue) {
		this.followUpCare = paramValue;
	}

	public java.util.Set getDischargeStatusHistory() {
		if ( null == dischargeStatusHistory ) {
			dischargeStatusHistory = new java.util.HashSet();
		}
		return dischargeStatusHistory;
	}
	public void setDischargeStatusHistory(java.util.Set paramValue) {
		this.dischargeStatusHistory = paramValue;
	}

	public ims.ntpf.casereferral.domain.objects.CaseReferral getAssocCase() {
		return assocCase;
	}
	public void setAssocCase(ims.ntpf.casereferral.domain.objects.CaseReferral assocCase) {
		this.assocCase = assocCase;
	}

	public java.util.Set getDischargeComments() {
		if ( null == dischargeComments ) {
			dischargeComments = new java.util.HashSet();
		}
		return dischargeComments;
	}
	public void setDischargeComments(java.util.Set paramValue) {
		this.dischargeComments = paramValue;
	}

	public Boolean isIsLinkedToCase() {
		return isLinkedToCase;
	}
	public void setIsLinkedToCase(Boolean isLinkedToCase) {
		this.isLinkedToCase = isLinkedToCase;
	}

	public java.util.Set getDischargeFlags() {
		if ( null == dischargeFlags ) {
			dischargeFlags = new java.util.HashSet();
		}
		return dischargeFlags;
	}
	public void setDischargeFlags(java.util.Set paramValue) {
		this.dischargeFlags = paramValue;
	}

	public Boolean isHasComments() {
		return hasComments;
	}
	public void setHasComments(Boolean hasComments) {
		this.hasComments = hasComments;
	}

	public ims.core.resource.people.domain.objects.Medic getTreatingCons() {
		return treatingCons;
	}
	public void setTreatingCons(ims.core.resource.people.domain.objects.Medic treatingCons) {
		this.treatingCons = treatingCons;
	}

	public ims.core.resource.place.domain.objects.Location getTreatingHosp() {
		return treatingHosp;
	}
	public void setTreatingHosp(ims.core.resource.place.domain.objects.Location treatingHosp) {
		this.treatingHosp = treatingHosp;
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
		
		auditStr.append("\r\n*dischargeStatus* :");
		if (dischargeStatus != null)
			auditStr.append(dischargeStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*admissionDate* :");
		auditStr.append(admissionDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*dischargeDate* :");
		auditStr.append(dischargeDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*isSurveySent* :");
		if (isSurveySent != null)
			auditStr.append(isSurveySent.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*dateSurveySent* :");
		auditStr.append(dateSurveySent);
	    auditStr.append("; ");
		auditStr.append("\r\n*patientMedication* :");
		if (patientMedication != null)
		{
			java.util.Iterator it6 = patientMedication.iterator();
			int i6=0;
			while (it6.hasNext())
			{
				if (i6 > 0)
					auditStr.append(",");
				ims.core.clinical.domain.objects.PatientMedication obj = (ims.core.clinical.domain.objects.PatientMedication)it6.next();
		if (obj != null)
		{
		   if (i6 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i6++;
		}
		if (i6 > 0)
			auditStr.append("] " + i6);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*resultsToFollow* :");
		if (resultsToFollow != null)
			auditStr.append(resultsToFollow.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*instructionsGiven* :");
		if (instructionsGiven != null)
			auditStr.append(instructionsGiven.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*referralTo* :");
		auditStr.append(referralTo);
	    auditStr.append("; ");
		auditStr.append("\r\n*followUpNotes* :");
		auditStr.append(followUpNotes);
	    auditStr.append("; ");
		auditStr.append("\r\n*invoiceBarcode* :");
		auditStr.append(invoiceBarcode);
	    auditStr.append("; ");
		auditStr.append("\r\n*dischargeSummBarCode* :");
		auditStr.append(dischargeSummBarCode);
	    auditStr.append("; ");
		auditStr.append("\r\n*procedures* :");
		if (procedures != null)
		{
		int i13=0;
		for (i13=0; i13<procedures.size(); i13++)
		{
			if (i13 > 0)
				auditStr.append(",");
			ims.ntpf.casereferral.domain.objects.DischargeSummaryProcedure obj = (ims.ntpf.casereferral.domain.objects.DischargeSummaryProcedure)procedures.get(i13);
		    if (obj != null)
			{
				if (i13 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i13 > 0)
			auditStr.append("] " + i13);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*followUpCare* :");
		if (followUpCare != null)
		{
			java.util.Iterator it14 = followUpCare.iterator();
			int i14=0;
			while (it14.hasNext())
			{
				if (i14 > 0)
					auditStr.append(",");
				ims.ntpf.casereferral.domain.objects.FollowUpCare obj = (ims.ntpf.casereferral.domain.objects.FollowUpCare)it14.next();
		if (obj != null)
		{
		   if (i14 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i14++;
		}
		if (i14 > 0)
			auditStr.append("] " + i14);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*dischargeStatusHistory* :");
		if (dischargeStatusHistory != null)
		{
			java.util.Iterator it15 = dischargeStatusHistory.iterator();
			int i15=0;
			while (it15.hasNext())
			{
				if (i15 > 0)
					auditStr.append(",");
				ims.ntpf.casereferral.domain.objects.DischargeSummaryStatus obj = (ims.ntpf.casereferral.domain.objects.DischargeSummaryStatus)it15.next();
		if (obj != null)
		{
		   if (i15 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i15++;
		}
		if (i15 > 0)
			auditStr.append("] " + i15);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*assocCase* :");
		if (assocCase != null)
		{
			auditStr.append(toShortClassName(assocCase));
				
		    auditStr.append(assocCase.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*dischargeComments* :");
		if (dischargeComments != null)
		{
			java.util.Iterator it17 = dischargeComments.iterator();
			int i17=0;
			while (it17.hasNext())
			{
				if (i17 > 0)
					auditStr.append(",");
				ims.ntpf.common.domain.objects.Comment obj = (ims.ntpf.common.domain.objects.Comment)it17.next();
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
		auditStr.append("\r\n*isLinkedToCase* :");
		auditStr.append(isLinkedToCase);
	    auditStr.append("; ");
		auditStr.append("\r\n*dischargeFlags* :");
		if (dischargeFlags != null)
		{
			java.util.Iterator it19 = dischargeFlags.iterator();
			int i19=0;
			while (it19.hasNext())
			{
				if (i19 > 0)
					auditStr.append(",");
				ims.core.resource.place.domain.objects.Activity obj = (ims.core.resource.place.domain.objects.Activity)it19.next();
		if (obj != null)
		{
		   if (i19 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i19++;
		}
		if (i19 > 0)
			auditStr.append("] " + i19);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*hasComments* :");
		auditStr.append(hasComments);
	    auditStr.append("; ");
		auditStr.append("\r\n*treatingCons* :");
		if (treatingCons != null)
		{
			auditStr.append(toShortClassName(treatingCons));
				
		    auditStr.append(treatingCons.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*treatingHosp* :");
		if (treatingHosp != null)
		{
			auditStr.append(toShortClassName(treatingHosp));
				
		    auditStr.append(treatingHosp.getId());
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
		
		String keyClassName = "DischargeSummary";
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
		if (this.getDischargeStatus() != null)
		{
			sb.append("<dischargeStatus>");
			sb.append(this.getDischargeStatus().toXMLString()); 
			sb.append("</dischargeStatus>");		
		}
		if (this.getAdmissionDate() != null)
		{
			sb.append("<admissionDate>");
			sb.append(new ims.framework.utils.DateTime(this.getAdmissionDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</admissionDate>");		
		}
		if (this.getDischargeDate() != null)
		{
			sb.append("<dischargeDate>");
			sb.append(new ims.framework.utils.DateTime(this.getDischargeDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dischargeDate>");		
		}
		if (this.getIsSurveySent() != null)
		{
			sb.append("<isSurveySent>");
			sb.append(this.getIsSurveySent().toXMLString()); 
			sb.append("</isSurveySent>");		
		}
		if (this.getDateSurveySent() != null)
		{
			sb.append("<dateSurveySent>");
			sb.append(new ims.framework.utils.DateTime(this.getDateSurveySent()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dateSurveySent>");		
		}
		if (this.getPatientMedication() != null)
		{
			if (this.getPatientMedication().size() > 0 )
			{
			sb.append("<patientMedication>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getPatientMedication(), domMap));
			sb.append("</patientMedication>");		
			}
		}
		if (this.getResultsToFollow() != null)
		{
			sb.append("<resultsToFollow>");
			sb.append(this.getResultsToFollow().toXMLString()); 
			sb.append("</resultsToFollow>");		
		}
		if (this.getInstructionsGiven() != null)
		{
			sb.append("<instructionsGiven>");
			sb.append(this.getInstructionsGiven().toXMLString()); 
			sb.append("</instructionsGiven>");		
		}
		if (this.getReferralTo() != null)
		{
			sb.append("<referralTo>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReferralTo().toString()));
			sb.append("</referralTo>");		
		}
		if (this.getFollowUpNotes() != null)
		{
			sb.append("<followUpNotes>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getFollowUpNotes().toString()));
			sb.append("</followUpNotes>");		
		}
		if (this.getInvoiceBarcode() != null)
		{
			sb.append("<invoiceBarcode>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getInvoiceBarcode().toString()));
			sb.append("</invoiceBarcode>");		
		}
		if (this.getDischargeSummBarCode() != null)
		{
			sb.append("<dischargeSummBarCode>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDischargeSummBarCode().toString()));
			sb.append("</dischargeSummBarCode>");		
		}
		if (this.getProcedures() != null)
		{
			if (this.getProcedures().size() > 0 )
			{
			sb.append("<procedures>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getProcedures(), domMap));
			sb.append("</procedures>");		
			}
		}
		if (this.getFollowUpCare() != null)
		{
			if (this.getFollowUpCare().size() > 0 )
			{
			sb.append("<followUpCare>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getFollowUpCare(), domMap));
			sb.append("</followUpCare>");		
			}
		}
		if (this.getDischargeStatusHistory() != null)
		{
			if (this.getDischargeStatusHistory().size() > 0 )
			{
			sb.append("<dischargeStatusHistory>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getDischargeStatusHistory(), domMap));
			sb.append("</dischargeStatusHistory>");		
			}
		}
		if (this.getAssocCase() != null)
		{
			sb.append("<assocCase>");
			sb.append(this.getAssocCase().toXMLString(domMap)); 	
			sb.append("</assocCase>");		
		}
		if (this.getDischargeComments() != null)
		{
			if (this.getDischargeComments().size() > 0 )
			{
			sb.append("<dischargeComments>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getDischargeComments(), domMap));
			sb.append("</dischargeComments>");		
			}
		}
		if (this.isIsLinkedToCase() != null)
		{
			sb.append("<isLinkedToCase>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsLinkedToCase().toString()));
			sb.append("</isLinkedToCase>");		
		}
		if (this.getDischargeFlags() != null)
		{
			if (this.getDischargeFlags().size() > 0 )
			{
			sb.append("<dischargeFlags>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getDischargeFlags(), domMap));
			sb.append("</dischargeFlags>");		
			}
		}
		if (this.isHasComments() != null)
		{
			sb.append("<hasComments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isHasComments().toString()));
			sb.append("</hasComments>");		
		}
		if (this.getTreatingCons() != null)
		{
			sb.append("<treatingCons>");
			sb.append(this.getTreatingCons().toXMLString(domMap)); 	
			sb.append("</treatingCons>");		
		}
		if (this.getTreatingHosp() != null)
		{
			sb.append("<treatingHosp>");
			sb.append(this.getTreatingHosp().toXMLString(domMap)); 	
			sb.append("</treatingHosp>");		
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
			DischargeSummary domainObject = getDischargeSummaryfromXML(itemEl, factory, domMap);

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
			DischargeSummary domainObject = getDischargeSummaryfromXML(itemEl, factory, domMap);

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
		
	public static DischargeSummary getDischargeSummaryfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getDischargeSummaryfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static DischargeSummary getDischargeSummaryfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!DischargeSummary.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!DischargeSummary.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the DischargeSummary class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (DischargeSummary)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(DischargeSummary.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		DischargeSummary ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (DischargeSummary)factory.getImportedDomainObject(DischargeSummary.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new DischargeSummary();
		}
		String keyClassName = "DischargeSummary";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (DischargeSummary)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, DischargeSummary obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("dischargeStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDischargeStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("admissionDate");
		if(fldEl != null)
		{	
    		obj.setAdmissionDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("dischargeDate");
		if(fldEl != null)
		{	
    		obj.setDischargeDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("isSurveySent");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setIsSurveySent(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("dateSurveySent");
		if(fldEl != null)
		{	
    		obj.setDateSurveySent(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("patientMedication");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setPatientMedication(ims.core.clinical.domain.objects.PatientMedication.fromSetXMLString(fldEl, factory, obj.getPatientMedication(), domMap));
		}
		fldEl = el.element("resultsToFollow");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setResultsToFollow(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("instructionsGiven");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setInstructionsGiven(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("referralTo");
		if(fldEl != null)
		{	
    		obj.setReferralTo(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("followUpNotes");
		if(fldEl != null)
		{	
    		obj.setFollowUpNotes(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("invoiceBarcode");
		if(fldEl != null)
		{	
    		obj.setInvoiceBarcode(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dischargeSummBarCode");
		if(fldEl != null)
		{	
    		obj.setDischargeSummBarCode(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("procedures");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setProcedures(ims.ntpf.casereferral.domain.objects.DischargeSummaryProcedure.fromListXMLString(fldEl, factory, obj.getProcedures(), domMap));
		}
		fldEl = el.element("followUpCare");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setFollowUpCare(ims.ntpf.casereferral.domain.objects.FollowUpCare.fromSetXMLString(fldEl, factory, obj.getFollowUpCare(), domMap));
		}
		fldEl = el.element("dischargeStatusHistory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setDischargeStatusHistory(ims.ntpf.casereferral.domain.objects.DischargeSummaryStatus.fromSetXMLString(fldEl, factory, obj.getDischargeStatusHistory(), domMap));
		}
		fldEl = el.element("assocCase");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAssocCase(ims.ntpf.casereferral.domain.objects.CaseReferral.getCaseReferralfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("dischargeComments");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setDischargeComments(ims.ntpf.common.domain.objects.Comment.fromSetXMLString(fldEl, factory, obj.getDischargeComments(), domMap));
		}
		fldEl = el.element("isLinkedToCase");
		if(fldEl != null)
		{	
    		obj.setIsLinkedToCase(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dischargeFlags");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setDischargeFlags(ims.core.resource.place.domain.objects.Activity.fromSetXMLString(fldEl, factory, obj.getDischargeFlags(), domMap));
		}
		fldEl = el.element("hasComments");
		if(fldEl != null)
		{	
    		obj.setHasComments(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("treatingCons");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTreatingCons(ims.core.resource.people.domain.objects.Medic.getMedicfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("treatingHosp");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setTreatingHosp(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "patientMedication"
		, "procedures"
		, "followUpCare"
		, "dischargeStatusHistory"
		, "dischargeComments"
		, "dischargeFlags"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String DischargeStatus = "dischargeStatus";
		public static final String AdmissionDate = "admissionDate";
		public static final String DischargeDate = "dischargeDate";
		public static final String IsSurveySent = "isSurveySent";
		public static final String DateSurveySent = "dateSurveySent";
		public static final String PatientMedication = "patientMedication";
		public static final String ResultsToFollow = "resultsToFollow";
		public static final String InstructionsGiven = "instructionsGiven";
		public static final String ReferralTo = "referralTo";
		public static final String FollowUpNotes = "followUpNotes";
		public static final String InvoiceBarcode = "invoiceBarcode";
		public static final String DischargeSummBarCode = "dischargeSummBarCode";
		public static final String Procedures = "procedures";
		public static final String FollowUpCare = "followUpCare";
		public static final String DischargeStatusHistory = "dischargeStatusHistory";
		public static final String AssocCase = "assocCase";
		public static final String DischargeComments = "dischargeComments";
		public static final String IsLinkedToCase = "isLinkedToCase";
		public static final String DischargeFlags = "dischargeFlags";
		public static final String HasComments = "hasComments";
		public static final String TreatingCons = "treatingCons";
		public static final String TreatingHosp = "treatingHosp";
	}
}

