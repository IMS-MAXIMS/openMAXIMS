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


public class OrderInvestigation extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1070100002;
	private static final long serialVersionUID = 1070100002L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Investigation */
	private ims.ocrr.configuration.domain.objects.Investigation investigation;
	/** Specimen
	  * Collection of ims.ocrr.orderingresults.domain.objects.OrderSpecimen.
	  */
	private java.util.List specimen;
	/** OrderDetails */
	private ims.ocrr.orderingresults.domain.objects.OcsOrderSession orderDetails;
	/** Responsible HCP */
	private ims.core.resource.people.domain.objects.Hcp responsibleClinician;
	/** Applies only to GP placed Orders. */
	private ims.core.resource.people.domain.objects.Gp responsibleGp;
	/** Patient Location. (Ward etc.) */
	private ims.core.resource.place.domain.objects.Location patientLocation;
	/** PatientClinic (filled only if PatientLocation is empty) */
	private ims.core.resource.place.domain.objects.Clinic patientClinic;
	/** The parent of the patients location at time of order */
	private ims.core.resource.place.domain.objects.Location parentLocation;
	/** Order Priority */
	private ims.domain.lookups.LookupInstance orderPriority;
	/** Report Date Time */
	private java.util.Date repDateTime;
	/** RepTimeSupplied */
	private Boolean repTimeSupplied;
	/** Display DateTime */
	private java.util.Date displayDateTime;
	/** Flag to indicate whether the display time was supplied or not */
	private Boolean displayTimeSupplied;
	/** DisplayFlag */
	private ims.domain.lookups.LookupInstance displayFlag;
	/** wasOrdered */
	private Boolean wasOrdered;
	/** Demographics received in Result Message */
	private ims.core.patient.domain.objects.MinDemographics resultDemographics;
	/** ResultStatus */
	private ims.domain.lookups.LookupInstance resultStatus;
	/** OrdInvCurrentStatus */
	private ims.ocrr.orderingresults.domain.objects.OrderedInvestigationStatus ordInvCurrentStatus;
	/** OrdInvStatusHistory
	  * Collection of ims.ocrr.orderingresults.domain.objects.OrderedInvestigationStatus.
	  */
	private java.util.List ordInvStatusHistory;
	/** Filler Order Number */
	private String fillerOrdNum;
	private String radAttendanceId;
	private java.util.Date appointmentDate;
	/** Reason For Study */
	private String reasonForStudy;
	/** Sequence number within specimen */
	private Integer ordInvSeq;
	/** Exam is required to be carried out on or after this date */
	private java.util.Date examReqOnAfterDate;
	/** Location where exam is requested to be carried out */
	private ims.core.resource.place.domain.objects.Location requestedLocation;
	/** Location where exam was carried out */
	private ims.core.resource.place.domain.objects.Location performedLocation;
	/** Specifies whether this item has been processed by the Outbound Interface */
	private Boolean wasProcessed;
	/** History of Results for this Investigation
	  * Collection of ims.ocrr.orderingresults.domain.objects.OrderResultHistory.
	  */
	private java.util.Set resultHistory;
	/** Enter Theatre DateTime */
	private java.util.Date enterTheatreDate;
	/** Start Procedure DateTime */
	private java.util.Date startProcedureDate;
	/** End Procedure Datetime */
	private java.util.Date endProcedureDate;
	/** Leave Recovery Datetime */
	private java.util.Date leaveRecoveryDate;
	/** Report URL */
	private String reportUrl;
	/** Report Document URL */
	private String reportDocumentUrl;
	/** Investigation Date Time for 'imported' and manual results */
	private java.util.Date investigationDateTime;
	/** OBR-21 Filler Field 2 PACS Accession number */
	private String accessionNumber;
	/** OrderContainer (Note there may be multiple containers but this is to record the container type used for the investigation)
	  * Collection of ims.ocrr.orderingresults.domain.objects.OrderSpecimenContainer.
	  */
	private java.util.Set container;
	/** OrdInvXOStatusHistory
	  * Collection of ims.ocrr.orderingresults.domain.objects.OrderedInvestigationStatus.
	  */
	private java.util.List ordInvXOStatusHistory;
	/** Was Secondary Matching used to identify the Patient on receipt of a result message */
	private Boolean wasSecondaryMatchingUsed;
	/** ResultConclusionComments
	  * Collection of ims.ocrr.orderingresults.domain.objects.ResultConclusionAndActionComment.
	  */
	private java.util.List resultConclusionComments;
	/** Allocated HCP for Review */
	private ims.core.resource.people.domain.objects.Hcp allocatedHCPforReview;
	/** Allocated For Review History
	  * Collection of ims.ocrr.orderingresults.domain.objects.AllocatedResultReviewDetail.
	  */
	private java.util.List allocatedForReviewHistory;
	/** Result Specimen Source */
	private ims.domain.lookups.LookupInstance resultSpecimenType;
	/** Result Details */
	private ims.ocrr.orderingresults.domain.objects.ResultDetails resultDetails;
	/** Expected Turnaround DateTime */
	private java.util.Date expectedDateTime;
	/** The OCS Number */
	private String placerOrdNum;
	/** The reason this investiation has been re-ordered for the patient */
	private String reorderReason;
	/** Investigation Required By Date */
	private java.util.Date requiredByDate;
	private ims.domain.lookups.LookupInstance collectionType;
	/** DateTime when allocated for review */
	private java.util.Date allocatedDateForReview;
	/** Sort field for new results combination of allocatedDT/reportDT */
	private java.util.Date resultSortDate;
	private Boolean forReview;
	private String reviewRequestedBy;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public OrderInvestigation (Integer id, int ver)
    {
    	super(id, ver);
    }
    public OrderInvestigation ()
    {
    	super();
    }
    public OrderInvestigation (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.ocrr.orderingresults.domain.objects.OrderInvestigation.class;
	}


	public ims.ocrr.configuration.domain.objects.Investigation getInvestigation() {
		return investigation;
	}
	public void setInvestigation(ims.ocrr.configuration.domain.objects.Investigation investigation) {
		this.investigation = investigation;
	}

	public java.util.List getSpecimen() {
		if ( null == specimen ) {
			specimen = new java.util.ArrayList();
		}
		return specimen;
	}
	public void setSpecimen(java.util.List paramValue) {
		this.specimen = paramValue;
	}

	public ims.ocrr.orderingresults.domain.objects.OcsOrderSession getOrderDetails() {
		return orderDetails;
	}
	public void setOrderDetails(ims.ocrr.orderingresults.domain.objects.OcsOrderSession orderDetails) {
		this.orderDetails = orderDetails;
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

	public ims.core.resource.place.domain.objects.Location getParentLocation() {
		return parentLocation;
	}
	public void setParentLocation(ims.core.resource.place.domain.objects.Location parentLocation) {
		this.parentLocation = parentLocation;
	}

	public ims.domain.lookups.LookupInstance getOrderPriority() {
		return orderPriority;
	}
	public void setOrderPriority(ims.domain.lookups.LookupInstance orderPriority) {
		this.orderPriority = orderPriority;
	}

	public java.util.Date getRepDateTime() {
		return repDateTime;
	}
	public void setRepDateTime(java.util.Date repDateTime) {
		this.repDateTime = repDateTime;
	}

	public Boolean isRepTimeSupplied() {
		return repTimeSupplied;
	}
	public void setRepTimeSupplied(Boolean repTimeSupplied) {
		this.repTimeSupplied = repTimeSupplied;
	}

	public java.util.Date getDisplayDateTime() {
		return displayDateTime;
	}
	public void setDisplayDateTime(java.util.Date displayDateTime) {
		this.displayDateTime = displayDateTime;
	}

	public Boolean isDisplayTimeSupplied() {
		return displayTimeSupplied;
	}
	public void setDisplayTimeSupplied(Boolean displayTimeSupplied) {
		this.displayTimeSupplied = displayTimeSupplied;
	}

	public ims.domain.lookups.LookupInstance getDisplayFlag() {
		return displayFlag;
	}
	public void setDisplayFlag(ims.domain.lookups.LookupInstance displayFlag) {
		this.displayFlag = displayFlag;
	}

	public Boolean isWasOrdered() {
		return wasOrdered;
	}
	public void setWasOrdered(Boolean wasOrdered) {
		this.wasOrdered = wasOrdered;
	}

	public ims.core.patient.domain.objects.MinDemographics getResultDemographics() {
		return resultDemographics;
	}
	public void setResultDemographics(ims.core.patient.domain.objects.MinDemographics resultDemographics) {
		this.resultDemographics = resultDemographics;
	}

	public ims.domain.lookups.LookupInstance getResultStatus() {
		return resultStatus;
	}
	public void setResultStatus(ims.domain.lookups.LookupInstance resultStatus) {
		this.resultStatus = resultStatus;
	}

	public ims.ocrr.orderingresults.domain.objects.OrderedInvestigationStatus getOrdInvCurrentStatus() {
		return ordInvCurrentStatus;
	}
	public void setOrdInvCurrentStatus(ims.ocrr.orderingresults.domain.objects.OrderedInvestigationStatus ordInvCurrentStatus) {
		this.ordInvCurrentStatus = ordInvCurrentStatus;
	}

	public java.util.List getOrdInvStatusHistory() {
		if ( null == ordInvStatusHistory ) {
			ordInvStatusHistory = new java.util.ArrayList();
		}
		return ordInvStatusHistory;
	}
	public void setOrdInvStatusHistory(java.util.List paramValue) {
		this.ordInvStatusHistory = paramValue;
	}

	public String getFillerOrdNum() {
		return fillerOrdNum;
	}
	public void setFillerOrdNum(String fillerOrdNum) {
		if ( null != fillerOrdNum && fillerOrdNum.length() > 20 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for fillerOrdNum. Tried to set value: "+
				fillerOrdNum);
		}
		this.fillerOrdNum = fillerOrdNum;
	}

	public String getRadAttendanceId() {
		return radAttendanceId;
	}
	public void setRadAttendanceId(String radAttendanceId) {
		if ( null != radAttendanceId && radAttendanceId.length() > 20 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for radAttendanceId. Tried to set value: "+
				radAttendanceId);
		}
		this.radAttendanceId = radAttendanceId;
	}

	public java.util.Date getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(java.util.Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public String getReasonForStudy() {
		return reasonForStudy;
	}
	public void setReasonForStudy(String reasonForStudy) {
		if ( null != reasonForStudy && reasonForStudy.length() > 150 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for reasonForStudy. Tried to set value: "+
				reasonForStudy);
		}
		this.reasonForStudy = reasonForStudy;
	}

	public Integer getOrdInvSeq() {
		return ordInvSeq;
	}
	public void setOrdInvSeq(Integer ordInvSeq) {
		this.ordInvSeq = ordInvSeq;
	}

	public java.util.Date getExamReqOnAfterDate() {
		return examReqOnAfterDate;
	}
	public void setExamReqOnAfterDate(java.util.Date examReqOnAfterDate) {
		this.examReqOnAfterDate = examReqOnAfterDate;
	}

	public ims.core.resource.place.domain.objects.Location getRequestedLocation() {
		return requestedLocation;
	}
	public void setRequestedLocation(ims.core.resource.place.domain.objects.Location requestedLocation) {
		this.requestedLocation = requestedLocation;
	}

	public ims.core.resource.place.domain.objects.Location getPerformedLocation() {
		return performedLocation;
	}
	public void setPerformedLocation(ims.core.resource.place.domain.objects.Location performedLocation) {
		this.performedLocation = performedLocation;
	}

	public Boolean isWasProcessed() {
		return wasProcessed;
	}
	public void setWasProcessed(Boolean wasProcessed) {
		this.wasProcessed = wasProcessed;
	}

	public java.util.Set getResultHistory() {
		if ( null == resultHistory ) {
			resultHistory = new java.util.HashSet();
		}
		return resultHistory;
	}
	public void setResultHistory(java.util.Set paramValue) {
		this.resultHistory = paramValue;
	}

	public java.util.Date getEnterTheatreDate() {
		return enterTheatreDate;
	}
	public void setEnterTheatreDate(java.util.Date enterTheatreDate) {
		this.enterTheatreDate = enterTheatreDate;
	}

	public java.util.Date getStartProcedureDate() {
		return startProcedureDate;
	}
	public void setStartProcedureDate(java.util.Date startProcedureDate) {
		this.startProcedureDate = startProcedureDate;
	}

	public java.util.Date getEndProcedureDate() {
		return endProcedureDate;
	}
	public void setEndProcedureDate(java.util.Date endProcedureDate) {
		this.endProcedureDate = endProcedureDate;
	}

	public java.util.Date getLeaveRecoveryDate() {
		return leaveRecoveryDate;
	}
	public void setLeaveRecoveryDate(java.util.Date leaveRecoveryDate) {
		this.leaveRecoveryDate = leaveRecoveryDate;
	}

	public String getReportUrl() {
		return reportUrl;
	}
	public void setReportUrl(String reportUrl) {
		if ( null != reportUrl && reportUrl.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for reportUrl. Tried to set value: "+
				reportUrl);
		}
		this.reportUrl = reportUrl;
	}

	public String getReportDocumentUrl() {
		return reportDocumentUrl;
	}
	public void setReportDocumentUrl(String reportDocumentUrl) {
		if ( null != reportDocumentUrl && reportDocumentUrl.length() > 500 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for reportDocumentUrl. Tried to set value: "+
				reportDocumentUrl);
		}
		this.reportDocumentUrl = reportDocumentUrl;
	}

	public java.util.Date getInvestigationDateTime() {
		return investigationDateTime;
	}
	public void setInvestigationDateTime(java.util.Date investigationDateTime) {
		this.investigationDateTime = investigationDateTime;
	}

	public String getAccessionNumber() {
		return accessionNumber;
	}
	public void setAccessionNumber(String accessionNumber) {
		if ( null != accessionNumber && accessionNumber.length() > 200 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for accessionNumber. Tried to set value: "+
				accessionNumber);
		}
		this.accessionNumber = accessionNumber;
	}

	public java.util.Set getContainer() {
		if ( null == container ) {
			container = new java.util.HashSet();
		}
		return container;
	}
	public void setContainer(java.util.Set paramValue) {
		this.container = paramValue;
	}

	public java.util.List getOrdInvXOStatusHistory() {
		if ( null == ordInvXOStatusHistory ) {
			ordInvXOStatusHistory = new java.util.ArrayList();
		}
		return ordInvXOStatusHistory;
	}
	public void setOrdInvXOStatusHistory(java.util.List paramValue) {
		this.ordInvXOStatusHistory = paramValue;
	}

	public Boolean isWasSecondaryMatchingUsed() {
		return wasSecondaryMatchingUsed;
	}
	public void setWasSecondaryMatchingUsed(Boolean wasSecondaryMatchingUsed) {
		this.wasSecondaryMatchingUsed = wasSecondaryMatchingUsed;
	}

	public java.util.List getResultConclusionComments() {
		if ( null == resultConclusionComments ) {
			resultConclusionComments = new java.util.ArrayList();
		}
		return resultConclusionComments;
	}
	public void setResultConclusionComments(java.util.List paramValue) {
		this.resultConclusionComments = paramValue;
	}

	public ims.core.resource.people.domain.objects.Hcp getAllocatedHCPforReview() {
		return allocatedHCPforReview;
	}
	public void setAllocatedHCPforReview(ims.core.resource.people.domain.objects.Hcp allocatedHCPforReview) {
		this.allocatedHCPforReview = allocatedHCPforReview;
	}

	public java.util.List getAllocatedForReviewHistory() {
		if ( null == allocatedForReviewHistory ) {
			allocatedForReviewHistory = new java.util.ArrayList();
		}
		return allocatedForReviewHistory;
	}
	public void setAllocatedForReviewHistory(java.util.List paramValue) {
		this.allocatedForReviewHistory = paramValue;
	}

	public ims.domain.lookups.LookupInstance getResultSpecimenType() {
		return resultSpecimenType;
	}
	public void setResultSpecimenType(ims.domain.lookups.LookupInstance resultSpecimenType) {
		this.resultSpecimenType = resultSpecimenType;
	}

	public ims.ocrr.orderingresults.domain.objects.ResultDetails getResultDetails() {
		return resultDetails;
	}
	public void setResultDetails(ims.ocrr.orderingresults.domain.objects.ResultDetails resultDetails) {
		this.resultDetails = resultDetails;
	}

	public java.util.Date getExpectedDateTime() {
		return expectedDateTime;
	}
	public void setExpectedDateTime(java.util.Date expectedDateTime) {
		this.expectedDateTime = expectedDateTime;
	}

	public String getPlacerOrdNum() {
		return placerOrdNum;
	}
	public void setPlacerOrdNum(String placerOrdNum) {
		if ( null != placerOrdNum && placerOrdNum.length() > 20 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for placerOrdNum. Tried to set value: "+
				placerOrdNum);
		}
		this.placerOrdNum = placerOrdNum;
	}

	public String getReorderReason() {
		return reorderReason;
	}
	public void setReorderReason(String reorderReason) {
		if ( null != reorderReason && reorderReason.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for reorderReason. Tried to set value: "+
				reorderReason);
		}
		this.reorderReason = reorderReason;
	}

	public java.util.Date getRequiredByDate() {
		return requiredByDate;
	}
	public void setRequiredByDate(java.util.Date requiredByDate) {
		this.requiredByDate = requiredByDate;
	}

	public ims.domain.lookups.LookupInstance getCollectionType() {
		return collectionType;
	}
	public void setCollectionType(ims.domain.lookups.LookupInstance collectionType) {
		this.collectionType = collectionType;
	}

	public java.util.Date getAllocatedDateForReview() {
		return allocatedDateForReview;
	}
	public void setAllocatedDateForReview(java.util.Date allocatedDateForReview) {
		this.allocatedDateForReview = allocatedDateForReview;
	}

	public java.util.Date getResultSortDate() {
		return resultSortDate;
	}
	public void setResultSortDate(java.util.Date resultSortDate) {
		this.resultSortDate = resultSortDate;
	}

	public Boolean isForReview() {
		return forReview;
	}
	public void setForReview(Boolean forReview) {
		this.forReview = forReview;
	}

	public String getReviewRequestedBy() {
		return reviewRequestedBy;
	}
	public void setReviewRequestedBy(String reviewRequestedBy) {
		if ( null != reviewRequestedBy && reviewRequestedBy.length() > 50 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for reviewRequestedBy. Tried to set value: "+
				reviewRequestedBy);
		}
		this.reviewRequestedBy = reviewRequestedBy;
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
		
		auditStr.append("\r\n*investigation* :");
		if (investigation != null)
		{
			auditStr.append(toShortClassName(investigation));
				
		    auditStr.append(investigation.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*specimen* :");
		if (specimen != null)
		{
		int i2=0;
		for (i2=0; i2<specimen.size(); i2++)
		{
			if (i2 > 0)
				auditStr.append(",");
			ims.ocrr.orderingresults.domain.objects.OrderSpecimen obj = (ims.ocrr.orderingresults.domain.objects.OrderSpecimen)specimen.get(i2);
		    if (obj != null)
			{
				if (i2 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i2 > 0)
			auditStr.append("] " + i2);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*orderDetails* :");
		if (orderDetails != null)
		{
			auditStr.append(toShortClassName(orderDetails));
				
		    auditStr.append(orderDetails.getId());
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
		auditStr.append("\r\n*parentLocation* :");
		if (parentLocation != null)
		{
			auditStr.append(toShortClassName(parentLocation));
				
		    auditStr.append(parentLocation.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*orderPriority* :");
		if (orderPriority != null)
			auditStr.append(orderPriority.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*repDateTime* :");
		auditStr.append(repDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*repTimeSupplied* :");
		auditStr.append(repTimeSupplied);
	    auditStr.append("; ");
		auditStr.append("\r\n*displayDateTime* :");
		auditStr.append(displayDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*displayTimeSupplied* :");
		auditStr.append(displayTimeSupplied);
	    auditStr.append("; ");
		auditStr.append("\r\n*displayFlag* :");
		if (displayFlag != null)
			auditStr.append(displayFlag.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*wasOrdered* :");
		auditStr.append(wasOrdered);
	    auditStr.append("; ");
		auditStr.append("\r\n*resultDemographics* :");
		if (resultDemographics != null)
		{
			auditStr.append(toShortClassName(resultDemographics));
				
		    auditStr.append(resultDemographics.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*resultStatus* :");
		if (resultStatus != null)
			auditStr.append(resultStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*ordInvCurrentStatus* :");
		if (ordInvCurrentStatus != null)
		{
			auditStr.append(toShortClassName(ordInvCurrentStatus));
				
		    auditStr.append(ordInvCurrentStatus.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*ordInvStatusHistory* :");
		if (ordInvStatusHistory != null)
		{
		int i19=0;
		for (i19=0; i19<ordInvStatusHistory.size(); i19++)
		{
			if (i19 > 0)
				auditStr.append(",");
			ims.ocrr.orderingresults.domain.objects.OrderedInvestigationStatus obj = (ims.ocrr.orderingresults.domain.objects.OrderedInvestigationStatus)ordInvStatusHistory.get(i19);
		    if (obj != null)
			{
				if (i19 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i19 > 0)
			auditStr.append("] " + i19);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*fillerOrdNum* :");
		auditStr.append(fillerOrdNum);
	    auditStr.append("; ");
		auditStr.append("\r\n*radAttendanceId* :");
		auditStr.append(radAttendanceId);
	    auditStr.append("; ");
		auditStr.append("\r\n*appointmentDate* :");
		auditStr.append(appointmentDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*reasonForStudy* :");
		auditStr.append(reasonForStudy);
	    auditStr.append("; ");
		auditStr.append("\r\n*ordInvSeq* :");
		auditStr.append(ordInvSeq);
	    auditStr.append("; ");
		auditStr.append("\r\n*examReqOnAfterDate* :");
		auditStr.append(examReqOnAfterDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*requestedLocation* :");
		if (requestedLocation != null)
		{
			auditStr.append(toShortClassName(requestedLocation));
				
		    auditStr.append(requestedLocation.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*performedLocation* :");
		if (performedLocation != null)
		{
			auditStr.append(toShortClassName(performedLocation));
				
		    auditStr.append(performedLocation.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*wasProcessed* :");
		auditStr.append(wasProcessed);
	    auditStr.append("; ");
		auditStr.append("\r\n*resultHistory* :");
		if (resultHistory != null)
		{
			java.util.Iterator it29 = resultHistory.iterator();
			int i29=0;
			while (it29.hasNext())
			{
				if (i29 > 0)
					auditStr.append(",");
				ims.ocrr.orderingresults.domain.objects.OrderResultHistory obj = (ims.ocrr.orderingresults.domain.objects.OrderResultHistory)it29.next();
		if (obj != null)
		{
		   if (i29 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i29++;
		}
		if (i29 > 0)
			auditStr.append("] " + i29);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*enterTheatreDate* :");
		auditStr.append(enterTheatreDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*startProcedureDate* :");
		auditStr.append(startProcedureDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*endProcedureDate* :");
		auditStr.append(endProcedureDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*leaveRecoveryDate* :");
		auditStr.append(leaveRecoveryDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*reportUrl* :");
		auditStr.append(reportUrl);
	    auditStr.append("; ");
		auditStr.append("\r\n*reportDocumentUrl* :");
		auditStr.append(reportDocumentUrl);
	    auditStr.append("; ");
		auditStr.append("\r\n*investigationDateTime* :");
		auditStr.append(investigationDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*accessionNumber* :");
		auditStr.append(accessionNumber);
	    auditStr.append("; ");
		auditStr.append("\r\n*container* :");
		if (container != null)
		{
			java.util.Iterator it38 = container.iterator();
			int i38=0;
			while (it38.hasNext())
			{
				if (i38 > 0)
					auditStr.append(",");
				ims.ocrr.orderingresults.domain.objects.OrderSpecimenContainer obj = (ims.ocrr.orderingresults.domain.objects.OrderSpecimenContainer)it38.next();
		if (obj != null)
		{
		   if (i38 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i38++;
		}
		if (i38 > 0)
			auditStr.append("] " + i38);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*ordInvXOStatusHistory* :");
		if (ordInvXOStatusHistory != null)
		{
		int i39=0;
		for (i39=0; i39<ordInvXOStatusHistory.size(); i39++)
		{
			if (i39 > 0)
				auditStr.append(",");
			ims.ocrr.orderingresults.domain.objects.OrderedInvestigationStatus obj = (ims.ocrr.orderingresults.domain.objects.OrderedInvestigationStatus)ordInvXOStatusHistory.get(i39);
		    if (obj != null)
			{
				if (i39 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.toString());
			}
		}
		if (i39 > 0)
			auditStr.append("] " + i39);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*wasSecondaryMatchingUsed* :");
		auditStr.append(wasSecondaryMatchingUsed);
	    auditStr.append("; ");
		auditStr.append("\r\n*resultConclusionComments* :");
		if (resultConclusionComments != null)
		{
		int i41=0;
		for (i41=0; i41<resultConclusionComments.size(); i41++)
		{
			if (i41 > 0)
				auditStr.append(",");
			ims.ocrr.orderingresults.domain.objects.ResultConclusionAndActionComment obj = (ims.ocrr.orderingresults.domain.objects.ResultConclusionAndActionComment)resultConclusionComments.get(i41);
		    if (obj != null)
			{
				if (i41 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i41 > 0)
			auditStr.append("] " + i41);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*allocatedHCPforReview* :");
		if (allocatedHCPforReview != null)
		{
			auditStr.append(toShortClassName(allocatedHCPforReview));
				
		    auditStr.append(allocatedHCPforReview.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*allocatedForReviewHistory* :");
		if (allocatedForReviewHistory != null)
		{
		int i43=0;
		for (i43=0; i43<allocatedForReviewHistory.size(); i43++)
		{
			if (i43 > 0)
				auditStr.append(",");
			ims.ocrr.orderingresults.domain.objects.AllocatedResultReviewDetail obj = (ims.ocrr.orderingresults.domain.objects.AllocatedResultReviewDetail)allocatedForReviewHistory.get(i43);
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
		auditStr.append("\r\n*resultSpecimenType* :");
		if (resultSpecimenType != null)
			auditStr.append(resultSpecimenType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*resultDetails* :");
		if (resultDetails != null)
		{
			auditStr.append(toShortClassName(resultDetails));
				
		    auditStr.append(resultDetails.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*expectedDateTime* :");
		auditStr.append(expectedDateTime);
	    auditStr.append("; ");
		auditStr.append("\r\n*placerOrdNum* :");
		auditStr.append(placerOrdNum);
	    auditStr.append("; ");
		auditStr.append("\r\n*reorderReason* :");
		auditStr.append(reorderReason);
	    auditStr.append("; ");
		auditStr.append("\r\n*requiredByDate* :");
		auditStr.append(requiredByDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*collectionType* :");
		if (collectionType != null)
			auditStr.append(collectionType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*allocatedDateForReview* :");
		auditStr.append(allocatedDateForReview);
	    auditStr.append("; ");
		auditStr.append("\r\n*resultSortDate* :");
		auditStr.append(resultSortDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*forReview* :");
		auditStr.append(forReview);
	    auditStr.append("; ");
		auditStr.append("\r\n*reviewRequestedBy* :");
		auditStr.append(reviewRequestedBy);
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
		
		String keyClassName = "OrderInvestigation";
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
		if (this.getInvestigation() != null)
		{
			sb.append("<investigation>");
			sb.append(this.getInvestigation().toXMLString(domMap)); 	
			sb.append("</investigation>");		
		}
		if (this.getSpecimen() != null)
		{
			if (this.getSpecimen().size() > 0 )
			{
			sb.append("<specimen>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getSpecimen(), domMap));
			sb.append("</specimen>");		
			}
		}
		if (this.getOrderDetails() != null)
		{
			sb.append("<orderDetails>");
			sb.append(this.getOrderDetails().toXMLString(domMap)); 	
			sb.append("</orderDetails>");		
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
		if (this.getParentLocation() != null)
		{
			sb.append("<parentLocation>");
			sb.append(this.getParentLocation().toXMLString(domMap)); 	
			sb.append("</parentLocation>");		
		}
		if (this.getOrderPriority() != null)
		{
			sb.append("<orderPriority>");
			sb.append(this.getOrderPriority().toXMLString()); 
			sb.append("</orderPriority>");		
		}
		if (this.getRepDateTime() != null)
		{
			sb.append("<repDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getRepDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</repDateTime>");		
		}
		if (this.isRepTimeSupplied() != null)
		{
			sb.append("<repTimeSupplied>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isRepTimeSupplied().toString()));
			sb.append("</repTimeSupplied>");		
		}
		if (this.getDisplayDateTime() != null)
		{
			sb.append("<displayDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getDisplayDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</displayDateTime>");		
		}
		if (this.isDisplayTimeSupplied() != null)
		{
			sb.append("<displayTimeSupplied>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isDisplayTimeSupplied().toString()));
			sb.append("</displayTimeSupplied>");		
		}
		if (this.getDisplayFlag() != null)
		{
			sb.append("<displayFlag>");
			sb.append(this.getDisplayFlag().toXMLString()); 
			sb.append("</displayFlag>");		
		}
		if (this.isWasOrdered() != null)
		{
			sb.append("<wasOrdered>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isWasOrdered().toString()));
			sb.append("</wasOrdered>");		
		}
		if (this.getResultDemographics() != null)
		{
			sb.append("<resultDemographics>");
			sb.append(this.getResultDemographics().toXMLString(domMap)); 	
			sb.append("</resultDemographics>");		
		}
		if (this.getResultStatus() != null)
		{
			sb.append("<resultStatus>");
			sb.append(this.getResultStatus().toXMLString()); 
			sb.append("</resultStatus>");		
		}
		if (this.getOrdInvCurrentStatus() != null)
		{
			sb.append("<ordInvCurrentStatus>");
			sb.append(this.getOrdInvCurrentStatus().toXMLString(domMap)); 	
			sb.append("</ordInvCurrentStatus>");		
		}
		if (this.getOrdInvStatusHistory() != null)
		{
			if (this.getOrdInvStatusHistory().size() > 0 )
			{
			sb.append("<ordInvStatusHistory>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getOrdInvStatusHistory(), domMap));
			sb.append("</ordInvStatusHistory>");		
			}
		}
		if (this.getFillerOrdNum() != null)
		{
			sb.append("<fillerOrdNum>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getFillerOrdNum().toString()));
			sb.append("</fillerOrdNum>");		
		}
		if (this.getRadAttendanceId() != null)
		{
			sb.append("<radAttendanceId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRadAttendanceId().toString()));
			sb.append("</radAttendanceId>");		
		}
		if (this.getAppointmentDate() != null)
		{
			sb.append("<appointmentDate>");
			sb.append(new ims.framework.utils.DateTime(this.getAppointmentDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</appointmentDate>");		
		}
		if (this.getReasonForStudy() != null)
		{
			sb.append("<reasonForStudy>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReasonForStudy().toString()));
			sb.append("</reasonForStudy>");		
		}
		if (this.getOrdInvSeq() != null)
		{
			sb.append("<ordInvSeq>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getOrdInvSeq().toString()));
			sb.append("</ordInvSeq>");		
		}
		if (this.getExamReqOnAfterDate() != null)
		{
			sb.append("<examReqOnAfterDate>");
			sb.append(new ims.framework.utils.DateTime(this.getExamReqOnAfterDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</examReqOnAfterDate>");		
		}
		if (this.getRequestedLocation() != null)
		{
			sb.append("<requestedLocation>");
			sb.append(this.getRequestedLocation().toXMLString(domMap)); 	
			sb.append("</requestedLocation>");		
		}
		if (this.getPerformedLocation() != null)
		{
			sb.append("<performedLocation>");
			sb.append(this.getPerformedLocation().toXMLString(domMap)); 	
			sb.append("</performedLocation>");		
		}
		if (this.isWasProcessed() != null)
		{
			sb.append("<wasProcessed>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isWasProcessed().toString()));
			sb.append("</wasProcessed>");		
		}
		if (this.getResultHistory() != null)
		{
			if (this.getResultHistory().size() > 0 )
			{
			sb.append("<resultHistory>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getResultHistory(), domMap));
			sb.append("</resultHistory>");		
			}
		}
		if (this.getEnterTheatreDate() != null)
		{
			sb.append("<enterTheatreDate>");
			sb.append(new ims.framework.utils.DateTime(this.getEnterTheatreDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</enterTheatreDate>");		
		}
		if (this.getStartProcedureDate() != null)
		{
			sb.append("<startProcedureDate>");
			sb.append(new ims.framework.utils.DateTime(this.getStartProcedureDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</startProcedureDate>");		
		}
		if (this.getEndProcedureDate() != null)
		{
			sb.append("<endProcedureDate>");
			sb.append(new ims.framework.utils.DateTime(this.getEndProcedureDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</endProcedureDate>");		
		}
		if (this.getLeaveRecoveryDate() != null)
		{
			sb.append("<leaveRecoveryDate>");
			sb.append(new ims.framework.utils.DateTime(this.getLeaveRecoveryDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</leaveRecoveryDate>");		
		}
		if (this.getReportUrl() != null)
		{
			sb.append("<reportUrl>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReportUrl().toString()));
			sb.append("</reportUrl>");		
		}
		if (this.getReportDocumentUrl() != null)
		{
			sb.append("<reportDocumentUrl>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReportDocumentUrl().toString()));
			sb.append("</reportDocumentUrl>");		
		}
		if (this.getInvestigationDateTime() != null)
		{
			sb.append("<investigationDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getInvestigationDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</investigationDateTime>");		
		}
		if (this.getAccessionNumber() != null)
		{
			sb.append("<accessionNumber>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAccessionNumber().toString()));
			sb.append("</accessionNumber>");		
		}
		if (this.getContainer() != null)
		{
			if (this.getContainer().size() > 0 )
			{
			sb.append("<container>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getContainer(), domMap));
			sb.append("</container>");		
			}
		}
		if (this.getOrdInvXOStatusHistory() != null)
		{
			if (this.getOrdInvXOStatusHistory().size() > 0 )
			{
			sb.append("<ordInvXOStatusHistory>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getOrdInvXOStatusHistory(), domMap));
			sb.append("</ordInvXOStatusHistory>");		
			}
		}
		if (this.isWasSecondaryMatchingUsed() != null)
		{
			sb.append("<wasSecondaryMatchingUsed>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isWasSecondaryMatchingUsed().toString()));
			sb.append("</wasSecondaryMatchingUsed>");		
		}
		if (this.getResultConclusionComments() != null)
		{
			if (this.getResultConclusionComments().size() > 0 )
			{
			sb.append("<resultConclusionComments>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getResultConclusionComments(), domMap));
			sb.append("</resultConclusionComments>");		
			}
		}
		if (this.getAllocatedHCPforReview() != null)
		{
			sb.append("<allocatedHCPforReview>");
			sb.append(this.getAllocatedHCPforReview().toXMLString(domMap)); 	
			sb.append("</allocatedHCPforReview>");		
		}
		if (this.getAllocatedForReviewHistory() != null)
		{
			if (this.getAllocatedForReviewHistory().size() > 0 )
			{
			sb.append("<allocatedForReviewHistory>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getAllocatedForReviewHistory(), domMap));
			sb.append("</allocatedForReviewHistory>");		
			}
		}
		if (this.getResultSpecimenType() != null)
		{
			sb.append("<resultSpecimenType>");
			sb.append(this.getResultSpecimenType().toXMLString()); 	
			sb.append(this.getResultSpecimenType().toXMLString()); 
			sb.append("</resultSpecimenType>");		
		}
		if (this.getResultDetails() != null)
		{
			sb.append("<resultDetails>");
			sb.append(this.getResultDetails().toXMLString(domMap)); 	
			sb.append("</resultDetails>");		
		}
		if (this.getExpectedDateTime() != null)
		{
			sb.append("<expectedDateTime>");
			sb.append(new ims.framework.utils.DateTime(this.getExpectedDateTime()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</expectedDateTime>");		
		}
		if (this.getPlacerOrdNum() != null)
		{
			sb.append("<placerOrdNum>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPlacerOrdNum().toString()));
			sb.append("</placerOrdNum>");		
		}
		if (this.getReorderReason() != null)
		{
			sb.append("<reorderReason>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReorderReason().toString()));
			sb.append("</reorderReason>");		
		}
		if (this.getRequiredByDate() != null)
		{
			sb.append("<requiredByDate>");
			sb.append(new ims.framework.utils.DateTime(this.getRequiredByDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</requiredByDate>");		
		}
		if (this.getCollectionType() != null)
		{
			sb.append("<collectionType>");
			sb.append(this.getCollectionType().toXMLString()); 
			sb.append("</collectionType>");		
		}
		if (this.getAllocatedDateForReview() != null)
		{
			sb.append("<allocatedDateForReview>");
			sb.append(new ims.framework.utils.DateTime(this.getAllocatedDateForReview()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</allocatedDateForReview>");		
		}
		if (this.getResultSortDate() != null)
		{
			sb.append("<resultSortDate>");
			sb.append(new ims.framework.utils.DateTime(this.getResultSortDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</resultSortDate>");		
		}
		if (this.isForReview() != null)
		{
			sb.append("<forReview>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isForReview().toString()));
			sb.append("</forReview>");		
		}
		if (this.getReviewRequestedBy() != null)
		{
			sb.append("<reviewRequestedBy>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReviewRequestedBy().toString()));
			sb.append("</reviewRequestedBy>");		
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
			OrderInvestigation domainObject = getOrderInvestigationfromXML(itemEl, factory, domMap);

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
			OrderInvestigation domainObject = getOrderInvestigationfromXML(itemEl, factory, domMap);

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
		
	public static OrderInvestigation getOrderInvestigationfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getOrderInvestigationfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static OrderInvestigation getOrderInvestigationfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!OrderInvestigation.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!OrderInvestigation.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the OrderInvestigation class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (OrderInvestigation)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(OrderInvestigation.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		OrderInvestigation ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (OrderInvestigation)factory.getImportedDomainObject(OrderInvestigation.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new OrderInvestigation();
		}
		String keyClassName = "OrderInvestigation";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (OrderInvestigation)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, OrderInvestigation obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("investigation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setInvestigation(ims.ocrr.configuration.domain.objects.Investigation.getInvestigationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("specimen");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setSpecimen(ims.ocrr.orderingresults.domain.objects.OrderSpecimen.fromListXMLString(fldEl, factory, obj.getSpecimen(), domMap));
		}
		fldEl = el.element("orderDetails");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setOrderDetails(ims.ocrr.orderingresults.domain.objects.OcsOrderSession.getOcsOrderSessionfromXML(fldEl, factory, domMap)); 
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
		fldEl = el.element("parentLocation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setParentLocation(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("orderPriority");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setOrderPriority(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("repDateTime");
		if(fldEl != null)
		{	
    		obj.setRepDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("repTimeSupplied");
		if(fldEl != null)
		{	
    		obj.setRepTimeSupplied(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("displayDateTime");
		if(fldEl != null)
		{	
    		obj.setDisplayDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("displayTimeSupplied");
		if(fldEl != null)
		{	
    		obj.setDisplayTimeSupplied(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("displayFlag");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDisplayFlag(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("wasOrdered");
		if(fldEl != null)
		{	
    		obj.setWasOrdered(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("resultDemographics");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setResultDemographics(ims.core.patient.domain.objects.MinDemographics.getMinDemographicsfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("resultStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setResultStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("ordInvCurrentStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setOrdInvCurrentStatus(ims.ocrr.orderingresults.domain.objects.OrderedInvestigationStatus.getOrderedInvestigationStatusfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("ordInvStatusHistory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setOrdInvStatusHistory(ims.ocrr.orderingresults.domain.objects.OrderedInvestigationStatus.fromListXMLString(fldEl, factory, obj.getOrdInvStatusHistory(), domMap));
		}
		fldEl = el.element("fillerOrdNum");
		if(fldEl != null)
		{	
    		obj.setFillerOrdNum(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("radAttendanceId");
		if(fldEl != null)
		{	
    		obj.setRadAttendanceId(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("appointmentDate");
		if(fldEl != null)
		{	
    		obj.setAppointmentDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("reasonForStudy");
		if(fldEl != null)
		{	
    		obj.setReasonForStudy(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("ordInvSeq");
		if(fldEl != null)
		{	
    		obj.setOrdInvSeq(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("examReqOnAfterDate");
		if(fldEl != null)
		{	
    		obj.setExamReqOnAfterDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("requestedLocation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setRequestedLocation(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("performedLocation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPerformedLocation(ims.core.resource.place.domain.objects.Location.getLocationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("wasProcessed");
		if(fldEl != null)
		{	
    		obj.setWasProcessed(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("resultHistory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setResultHistory(ims.ocrr.orderingresults.domain.objects.OrderResultHistory.fromSetXMLString(fldEl, factory, obj.getResultHistory(), domMap));
		}
		fldEl = el.element("enterTheatreDate");
		if(fldEl != null)
		{	
    		obj.setEnterTheatreDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("startProcedureDate");
		if(fldEl != null)
		{	
    		obj.setStartProcedureDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("endProcedureDate");
		if(fldEl != null)
		{	
    		obj.setEndProcedureDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("leaveRecoveryDate");
		if(fldEl != null)
		{	
    		obj.setLeaveRecoveryDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("reportUrl");
		if(fldEl != null)
		{	
    		obj.setReportUrl(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("reportDocumentUrl");
		if(fldEl != null)
		{	
    		obj.setReportDocumentUrl(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("investigationDateTime");
		if(fldEl != null)
		{	
    		obj.setInvestigationDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("accessionNumber");
		if(fldEl != null)
		{	
    		obj.setAccessionNumber(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("container");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setContainer(ims.ocrr.orderingresults.domain.objects.OrderSpecimenContainer.fromSetXMLString(fldEl, factory, obj.getContainer(), domMap));
		}
		fldEl = el.element("ordInvXOStatusHistory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setOrdInvXOStatusHistory(ims.ocrr.orderingresults.domain.objects.OrderedInvestigationStatus.fromListXMLString(fldEl, factory, obj.getOrdInvXOStatusHistory(), domMap));
		}
		fldEl = el.element("wasSecondaryMatchingUsed");
		if(fldEl != null)
		{	
    		obj.setWasSecondaryMatchingUsed(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("resultConclusionComments");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setResultConclusionComments(ims.ocrr.orderingresults.domain.objects.ResultConclusionAndActionComment.fromListXMLString(fldEl, factory, obj.getResultConclusionComments(), domMap));
		}
		fldEl = el.element("allocatedHCPforReview");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAllocatedHCPforReview(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("allocatedForReviewHistory");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setAllocatedForReviewHistory(ims.ocrr.orderingresults.domain.objects.AllocatedResultReviewDetail.fromListXMLString(fldEl, factory, obj.getAllocatedForReviewHistory(), domMap));
		}
		fldEl = el.element("resultSpecimenType");
		if(fldEl != null)
		{	
    		obj.setResultSpecimenType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory));	
		}
		fldEl = el.element("resultDetails");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setResultDetails(ims.ocrr.orderingresults.domain.objects.ResultDetails.getResultDetailsfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("expectedDateTime");
		if(fldEl != null)
		{	
    		obj.setExpectedDateTime(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("placerOrdNum");
		if(fldEl != null)
		{	
    		obj.setPlacerOrdNum(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("reorderReason");
		if(fldEl != null)
		{	
    		obj.setReorderReason(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("requiredByDate");
		if(fldEl != null)
		{	
    		obj.setRequiredByDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("collectionType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCollectionType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("allocatedDateForReview");
		if(fldEl != null)
		{	
    		obj.setAllocatedDateForReview(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("resultSortDate");
		if(fldEl != null)
		{	
    		obj.setResultSortDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("forReview");
		if(fldEl != null)
		{	
    		obj.setForReview(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("reviewRequestedBy");
		if(fldEl != null)
		{	
    		obj.setReviewRequestedBy(new String(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "specimen"
		, "ordInvStatusHistory"
		, "resultHistory"
		, "container"
		, "ordInvXOStatusHistory"
		, "resultConclusionComments"
		, "allocatedForReviewHistory"
		};
	}

	/**
	hasNewOrUpdatedResults
	*/
public boolean hasNewOrUpdatedResults()
{
	if(ordInvCurrentStatus != null && ordInvCurrentStatus.getOrdInvStatus() != null)
	{
		return ordInvCurrentStatus.getOrdInvStatus().getId() == -795 || ordInvCurrentStatus.getOrdInvStatus().getId() == -796; 
	}
	
	return false;
}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Investigation = "investigation";
		public static final String Specimen = "specimen";
		public static final String OrderDetails = "orderDetails";
		public static final String ResponsibleClinician = "responsibleClinician";
		public static final String ResponsibleGp = "responsibleGp";
		public static final String PatientLocation = "patientLocation";
		public static final String PatientClinic = "patientClinic";
		public static final String ParentLocation = "parentLocation";
		public static final String OrderPriority = "orderPriority";
		public static final String RepDateTime = "repDateTime";
		public static final String RepTimeSupplied = "repTimeSupplied";
		public static final String DisplayDateTime = "displayDateTime";
		public static final String DisplayTimeSupplied = "displayTimeSupplied";
		public static final String DisplayFlag = "displayFlag";
		public static final String WasOrdered = "wasOrdered";
		public static final String ResultDemographics = "resultDemographics";
		public static final String ResultStatus = "resultStatus";
		public static final String OrdInvCurrentStatus = "ordInvCurrentStatus";
		public static final String OrdInvStatusHistory = "ordInvStatusHistory";
		public static final String FillerOrdNum = "fillerOrdNum";
		public static final String RadAttendanceId = "radAttendanceId";
		public static final String AppointmentDate = "appointmentDate";
		public static final String ReasonForStudy = "reasonForStudy";
		public static final String OrdInvSeq = "ordInvSeq";
		public static final String ExamReqOnAfterDate = "examReqOnAfterDate";
		public static final String RequestedLocation = "requestedLocation";
		public static final String PerformedLocation = "performedLocation";
		public static final String WasProcessed = "wasProcessed";
		public static final String ResultHistory = "resultHistory";
		public static final String EnterTheatreDate = "enterTheatreDate";
		public static final String StartProcedureDate = "startProcedureDate";
		public static final String EndProcedureDate = "endProcedureDate";
		public static final String LeaveRecoveryDate = "leaveRecoveryDate";
		public static final String ReportUrl = "reportUrl";
		public static final String ReportDocumentUrl = "reportDocumentUrl";
		public static final String InvestigationDateTime = "investigationDateTime";
		public static final String AccessionNumber = "accessionNumber";
		public static final String Container = "container";
		public static final String OrdInvXOStatusHistory = "ordInvXOStatusHistory";
		public static final String WasSecondaryMatchingUsed = "wasSecondaryMatchingUsed";
		public static final String ResultConclusionComments = "resultConclusionComments";
		public static final String AllocatedHCPforReview = "allocatedHCPforReview";
		public static final String AllocatedForReviewHistory = "allocatedForReviewHistory";
		public static final String ResultSpecimenType = "resultSpecimenType";
		public static final String ResultDetails = "resultDetails";
		public static final String ExpectedDateTime = "expectedDateTime";
		public static final String PlacerOrdNum = "placerOrdNum";
		public static final String ReorderReason = "reorderReason";
		public static final String RequiredByDate = "requiredByDate";
		public static final String CollectionType = "collectionType";
		public static final String AllocatedDateForReview = "allocatedDateForReview";
		public static final String ResultSortDate = "resultSortDate";
		public static final String ForReview = "forReview";
		public static final String ReviewRequestedBy = "reviewRequestedBy";
	}
}

