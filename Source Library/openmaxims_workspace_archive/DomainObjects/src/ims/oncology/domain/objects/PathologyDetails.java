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
 * @author Kevin O'Carroll
 * Generated.
 */


public class PathologyDetails extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1074100015;
	private static final long serialVersionUID = 1074100015L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** CareContext */
	private ims.core.admin.domain.objects.CareContext careContext;
	/** InvestigationType */
	private ims.domain.lookups.LookupInstance investigationType;
	/** SampleReceiptDate */
	private java.util.Date sampleReceiptDate;
	/** InvestigationResultDate */
	private java.util.Date investigationResultDate;
	/** ReportingConsultantCode */
	private ims.core.resource.people.domain.objects.Hcp reportingConsultantCode;
	/** ReportingOrganisation */
	private ims.core.resource.place.domain.objects.Organisation reportingOrganisation;
	/** InvasiveLesionSize */
	private Integer invasiveLesionSize;
	/** SynchronousTumourIndicator */
	private ims.domain.lookups.LookupInstance synchronousTumourIndicator;
	/** Histology
	  * Collection of ims.oncology.configuration.domain.objects.TumourHistology.
	  */
	private java.util.Set histology;
	/** GradeOfDifferentation */
	private ims.oncology.configuration.domain.objects.TumourGroupHistopathologicGrade gradeOfDifferentation;
	/** VascularLymphInvasion */
	private ims.domain.lookups.LookupInstance vascularLymphInvasion;
	/** ExcisionMargin */
	private ims.domain.lookups.LookupInstance excisionMargin;
	/** NumberNodesExamined */
	private Integer numberNodesExamined;
	/** NodesPositiveNumber */
	private Integer nodesPositiveNumber;
	/** PathologicalTVal */
	private ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue pathologicalTVal;
	/** PathologicalNVal */
	private ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue pathologicalNVal;
	/** PathologicalMVal */
	private ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue pathologicalMVal;
	/** PathologicalOverall */
	private ims.oncology.configuration.domain.objects.TumourGroupSiteOverallStaging pathologicalOverall;
	/** ServiceReportId */
	private String serviceReportId;
	/** ServiceReportStatus */
	private ims.domain.lookups.LookupInstance serviceReportStatus;
	/** SpecimenNature */
	private ims.domain.lookups.LookupInstance specimenNature;
	/** OrgaCodeRequester */
	private ims.core.resource.place.domain.objects.Organisation orgaCodeRequester;
	/** CareProfCodeRequester */
	private ims.core.resource.people.domain.objects.Hcp careProfCodeRequester;
	/** TCategoryExtended
	  * Collection of ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue.
	  */
	private java.util.Set tCategoryExtended;
	/** MCategoryExtended
	  * Collection of ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue.
	  */
	private java.util.Set mCategoryExtended;
	/** AssociatiatedTumourDetails */
	private ims.oncology.domain.objects.PrimaryTumourDetails associatiatedTumourDetails;
	/** Status */
	private ims.domain.lookups.LookupInstance status;
	/** PreviousVersion */
	private ims.oncology.domain.objects.PathologyDetails previousVersion;
	/** AssociatedQuestions */
	private ims.assessment.instantiation.domain.objects.PatientAssessment associatedQuestions;
	/** AuthoringInformation */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInformation;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PathologyDetails (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PathologyDetails ()
    {
    	super();
    }
    public PathologyDetails (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.oncology.domain.objects.PathologyDetails.class;
	}


	public ims.core.admin.domain.objects.CareContext getCareContext() {
		return careContext;
	}
	public void setCareContext(ims.core.admin.domain.objects.CareContext careContext) {
		this.careContext = careContext;
	}

	public ims.domain.lookups.LookupInstance getInvestigationType() {
		return investigationType;
	}
	public void setInvestigationType(ims.domain.lookups.LookupInstance investigationType) {
		this.investigationType = investigationType;
	}

	public java.util.Date getSampleReceiptDate() {
		return sampleReceiptDate;
	}
	public void setSampleReceiptDate(java.util.Date sampleReceiptDate) {
		this.sampleReceiptDate = sampleReceiptDate;
	}

	public java.util.Date getInvestigationResultDate() {
		return investigationResultDate;
	}
	public void setInvestigationResultDate(java.util.Date investigationResultDate) {
		this.investigationResultDate = investigationResultDate;
	}

	public ims.core.resource.people.domain.objects.Hcp getReportingConsultantCode() {
		return reportingConsultantCode;
	}
	public void setReportingConsultantCode(ims.core.resource.people.domain.objects.Hcp reportingConsultantCode) {
		this.reportingConsultantCode = reportingConsultantCode;
	}

	public ims.core.resource.place.domain.objects.Organisation getReportingOrganisation() {
		return reportingOrganisation;
	}
	public void setReportingOrganisation(ims.core.resource.place.domain.objects.Organisation reportingOrganisation) {
		this.reportingOrganisation = reportingOrganisation;
	}

	public Integer getInvasiveLesionSize() {
		return invasiveLesionSize;
	}
	public void setInvasiveLesionSize(Integer invasiveLesionSize) {
		this.invasiveLesionSize = invasiveLesionSize;
	}

	public ims.domain.lookups.LookupInstance getSynchronousTumourIndicator() {
		return synchronousTumourIndicator;
	}
	public void setSynchronousTumourIndicator(ims.domain.lookups.LookupInstance synchronousTumourIndicator) {
		this.synchronousTumourIndicator = synchronousTumourIndicator;
	}

	public java.util.Set getHistology() {
		if ( null == histology ) {
			histology = new java.util.HashSet();
		}
		return histology;
	}
	public void setHistology(java.util.Set paramValue) {
		this.histology = paramValue;
	}

	public ims.oncology.configuration.domain.objects.TumourGroupHistopathologicGrade getGradeOfDifferentation() {
		return gradeOfDifferentation;
	}
	public void setGradeOfDifferentation(ims.oncology.configuration.domain.objects.TumourGroupHistopathologicGrade gradeOfDifferentation) {
		this.gradeOfDifferentation = gradeOfDifferentation;
	}

	public ims.domain.lookups.LookupInstance getVascularLymphInvasion() {
		return vascularLymphInvasion;
	}
	public void setVascularLymphInvasion(ims.domain.lookups.LookupInstance vascularLymphInvasion) {
		this.vascularLymphInvasion = vascularLymphInvasion;
	}

	public ims.domain.lookups.LookupInstance getExcisionMargin() {
		return excisionMargin;
	}
	public void setExcisionMargin(ims.domain.lookups.LookupInstance excisionMargin) {
		this.excisionMargin = excisionMargin;
	}

	public Integer getNumberNodesExamined() {
		return numberNodesExamined;
	}
	public void setNumberNodesExamined(Integer numberNodesExamined) {
		this.numberNodesExamined = numberNodesExamined;
	}

	public Integer getNodesPositiveNumber() {
		return nodesPositiveNumber;
	}
	public void setNodesPositiveNumber(Integer nodesPositiveNumber) {
		this.nodesPositiveNumber = nodesPositiveNumber;
	}

	public ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue getPathologicalTVal() {
		return pathologicalTVal;
	}
	public void setPathologicalTVal(ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue pathologicalTVal) {
		this.pathologicalTVal = pathologicalTVal;
	}

	public ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue getPathologicalNVal() {
		return pathologicalNVal;
	}
	public void setPathologicalNVal(ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue pathologicalNVal) {
		this.pathologicalNVal = pathologicalNVal;
	}

	public ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue getPathologicalMVal() {
		return pathologicalMVal;
	}
	public void setPathologicalMVal(ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue pathologicalMVal) {
		this.pathologicalMVal = pathologicalMVal;
	}

	public ims.oncology.configuration.domain.objects.TumourGroupSiteOverallStaging getPathologicalOverall() {
		return pathologicalOverall;
	}
	public void setPathologicalOverall(ims.oncology.configuration.domain.objects.TumourGroupSiteOverallStaging pathologicalOverall) {
		this.pathologicalOverall = pathologicalOverall;
	}

	public String getServiceReportId() {
		return serviceReportId;
	}
	public void setServiceReportId(String serviceReportId) {
		this.serviceReportId = serviceReportId;
	}

	public ims.domain.lookups.LookupInstance getServiceReportStatus() {
		return serviceReportStatus;
	}
	public void setServiceReportStatus(ims.domain.lookups.LookupInstance serviceReportStatus) {
		this.serviceReportStatus = serviceReportStatus;
	}

	public ims.domain.lookups.LookupInstance getSpecimenNature() {
		return specimenNature;
	}
	public void setSpecimenNature(ims.domain.lookups.LookupInstance specimenNature) {
		this.specimenNature = specimenNature;
	}

	public ims.core.resource.place.domain.objects.Organisation getOrgaCodeRequester() {
		return orgaCodeRequester;
	}
	public void setOrgaCodeRequester(ims.core.resource.place.domain.objects.Organisation orgaCodeRequester) {
		this.orgaCodeRequester = orgaCodeRequester;
	}

	public ims.core.resource.people.domain.objects.Hcp getCareProfCodeRequester() {
		return careProfCodeRequester;
	}
	public void setCareProfCodeRequester(ims.core.resource.people.domain.objects.Hcp careProfCodeRequester) {
		this.careProfCodeRequester = careProfCodeRequester;
	}

	public java.util.Set getTCategoryExtended() {
		if ( null == tCategoryExtended ) {
			tCategoryExtended = new java.util.HashSet();
		}
		return tCategoryExtended;
	}
	public void setTCategoryExtended(java.util.Set paramValue) {
		this.tCategoryExtended = paramValue;
	}

	public java.util.Set getMCategoryExtended() {
		if ( null == mCategoryExtended ) {
			mCategoryExtended = new java.util.HashSet();
		}
		return mCategoryExtended;
	}
	public void setMCategoryExtended(java.util.Set paramValue) {
		this.mCategoryExtended = paramValue;
	}

	public ims.oncology.domain.objects.PrimaryTumourDetails getAssociatiatedTumourDetails() {
		return associatiatedTumourDetails;
	}
	public void setAssociatiatedTumourDetails(ims.oncology.domain.objects.PrimaryTumourDetails associatiatedTumourDetails) {
		this.associatiatedTumourDetails = associatiatedTumourDetails;
	}

	public ims.domain.lookups.LookupInstance getStatus() {
		return status;
	}
	public void setStatus(ims.domain.lookups.LookupInstance status) {
		this.status = status;
	}

	public ims.oncology.domain.objects.PathologyDetails getPreviousVersion() {
		return previousVersion;
	}
	public void setPreviousVersion(ims.oncology.domain.objects.PathologyDetails previousVersion) {
		this.previousVersion = previousVersion;
	}

	public ims.assessment.instantiation.domain.objects.PatientAssessment getAssociatedQuestions() {
		return associatedQuestions;
	}
	public void setAssociatedQuestions(ims.assessment.instantiation.domain.objects.PatientAssessment associatedQuestions) {
		this.associatedQuestions = associatedQuestions;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getAuthoringInformation() {
		return authoringInformation;
	}
	public void setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation authoringInformation) {
		this.authoringInformation = authoringInformation;
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
		auditStr.append("\r\n*investigationType* :");
		if (investigationType != null)
			auditStr.append(investigationType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*sampleReceiptDate* :");
		auditStr.append(sampleReceiptDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*investigationResultDate* :");
		auditStr.append(investigationResultDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*reportingConsultantCode* :");
		if (reportingConsultantCode != null)
		{
			auditStr.append(toShortClassName(reportingConsultantCode));
				
		    auditStr.append(reportingConsultantCode.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*reportingOrganisation* :");
		if (reportingOrganisation != null)
		{
			auditStr.append(toShortClassName(reportingOrganisation));
				
		    auditStr.append(reportingOrganisation.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*invasiveLesionSize* :");
		auditStr.append(invasiveLesionSize);
	    auditStr.append("; ");
		auditStr.append("\r\n*synchronousTumourIndicator* :");
		if (synchronousTumourIndicator != null)
			auditStr.append(synchronousTumourIndicator.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*histology* :");
		if (histology != null)
		{
			java.util.Iterator it9 = histology.iterator();
			int i9=0;
			while (it9.hasNext())
			{
				if (i9 > 0)
					auditStr.append(",");
				ims.oncology.configuration.domain.objects.TumourHistology obj = (ims.oncology.configuration.domain.objects.TumourHistology)it9.next();
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
		auditStr.append("\r\n*gradeOfDifferentation* :");
		if (gradeOfDifferentation != null)
		{
			auditStr.append(toShortClassName(gradeOfDifferentation));
				
		    auditStr.append(gradeOfDifferentation.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*vascularLymphInvasion* :");
		if (vascularLymphInvasion != null)
			auditStr.append(vascularLymphInvasion.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*excisionMargin* :");
		if (excisionMargin != null)
			auditStr.append(excisionMargin.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*numberNodesExamined* :");
		auditStr.append(numberNodesExamined);
	    auditStr.append("; ");
		auditStr.append("\r\n*nodesPositiveNumber* :");
		auditStr.append(nodesPositiveNumber);
	    auditStr.append("; ");
		auditStr.append("\r\n*pathologicalTVal* :");
		if (pathologicalTVal != null)
		{
			auditStr.append(toShortClassName(pathologicalTVal));
				
		    auditStr.append(pathologicalTVal.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*pathologicalNVal* :");
		if (pathologicalNVal != null)
		{
			auditStr.append(toShortClassName(pathologicalNVal));
				
		    auditStr.append(pathologicalNVal.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*pathologicalMVal* :");
		if (pathologicalMVal != null)
		{
			auditStr.append(toShortClassName(pathologicalMVal));
				
		    auditStr.append(pathologicalMVal.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*pathologicalOverall* :");
		if (pathologicalOverall != null)
		{
			auditStr.append(toShortClassName(pathologicalOverall));
				
		    auditStr.append(pathologicalOverall.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*serviceReportId* :");
		auditStr.append(serviceReportId);
	    auditStr.append("; ");
		auditStr.append("\r\n*serviceReportStatus* :");
		if (serviceReportStatus != null)
			auditStr.append(serviceReportStatus.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*specimenNature* :");
		if (specimenNature != null)
			auditStr.append(specimenNature.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*orgaCodeRequester* :");
		if (orgaCodeRequester != null)
		{
			auditStr.append(toShortClassName(orgaCodeRequester));
				
		    auditStr.append(orgaCodeRequester.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*careProfCodeRequester* :");
		if (careProfCodeRequester != null)
		{
			auditStr.append(toShortClassName(careProfCodeRequester));
				
		    auditStr.append(careProfCodeRequester.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*tCategoryExtended* :");
		if (tCategoryExtended != null)
		{
			java.util.Iterator it24 = tCategoryExtended.iterator();
			int i24=0;
			while (it24.hasNext())
			{
				if (i24 > 0)
					auditStr.append(",");
				ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue obj = (ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue)it24.next();
		if (obj != null)
		{
		   if (i24 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i24++;
		}
		if (i24 > 0)
			auditStr.append("] " + i24);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*mCategoryExtended* :");
		if (mCategoryExtended != null)
		{
			java.util.Iterator it25 = mCategoryExtended.iterator();
			int i25=0;
			while (it25.hasNext())
			{
				if (i25 > 0)
					auditStr.append(",");
				ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue obj = (ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue)it25.next();
		if (obj != null)
		{
		   if (i25 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i25++;
		}
		if (i25 > 0)
			auditStr.append("] " + i25);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*associatiatedTumourDetails* :");
		if (associatiatedTumourDetails != null)
		{
			auditStr.append(toShortClassName(associatiatedTumourDetails));
				
		    auditStr.append(associatiatedTumourDetails.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*status* :");
		if (status != null)
			auditStr.append(status.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*previousVersion* :");
		if (previousVersion != null)
		{
			auditStr.append(toShortClassName(previousVersion));
				
		    auditStr.append(previousVersion.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*associatedQuestions* :");
		if (associatedQuestions != null)
		{
			auditStr.append(toShortClassName(associatedQuestions));
				
		    auditStr.append(associatedQuestions.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringInformation* :");
		if (authoringInformation != null)
		{
			auditStr.append(toShortClassName(authoringInformation));
				
		    auditStr.append(authoringInformation.toString());
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
		
		String keyClassName = "PathologyDetails";
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
		if (this.getInvestigationType() != null)
		{
			sb.append("<investigationType>");
			sb.append(this.getInvestigationType().toXMLString()); 
			sb.append("</investigationType>");		
		}
		if (this.getSampleReceiptDate() != null)
		{
			sb.append("<sampleReceiptDate>");
			sb.append(new ims.framework.utils.DateTime(this.getSampleReceiptDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</sampleReceiptDate>");		
		}
		if (this.getInvestigationResultDate() != null)
		{
			sb.append("<investigationResultDate>");
			sb.append(new ims.framework.utils.DateTime(this.getInvestigationResultDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</investigationResultDate>");		
		}
		if (this.getReportingConsultantCode() != null)
		{
			sb.append("<reportingConsultantCode>");
			sb.append(this.getReportingConsultantCode().toXMLString(domMap)); 	
			sb.append("</reportingConsultantCode>");		
		}
		if (this.getReportingOrganisation() != null)
		{
			sb.append("<reportingOrganisation>");
			sb.append(this.getReportingOrganisation().toXMLString(domMap)); 	
			sb.append("</reportingOrganisation>");		
		}
		if (this.getInvasiveLesionSize() != null)
		{
			sb.append("<invasiveLesionSize>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getInvasiveLesionSize().toString()));
			sb.append("</invasiveLesionSize>");		
		}
		if (this.getSynchronousTumourIndicator() != null)
		{
			sb.append("<synchronousTumourIndicator>");
			sb.append(this.getSynchronousTumourIndicator().toXMLString()); 
			sb.append("</synchronousTumourIndicator>");		
		}
		if (this.getHistology() != null)
		{
			if (this.getHistology().size() > 0 )
			{
			sb.append("<histology>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getHistology(), domMap));
			sb.append("</histology>");		
			}
		}
		if (this.getGradeOfDifferentation() != null)
		{
			sb.append("<gradeOfDifferentation>");
			sb.append(this.getGradeOfDifferentation().toXMLString(domMap)); 	
			sb.append("</gradeOfDifferentation>");		
		}
		if (this.getVascularLymphInvasion() != null)
		{
			sb.append("<vascularLymphInvasion>");
			sb.append(this.getVascularLymphInvasion().toXMLString()); 
			sb.append("</vascularLymphInvasion>");		
		}
		if (this.getExcisionMargin() != null)
		{
			sb.append("<excisionMargin>");
			sb.append(this.getExcisionMargin().toXMLString()); 
			sb.append("</excisionMargin>");		
		}
		if (this.getNumberNodesExamined() != null)
		{
			sb.append("<numberNodesExamined>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNumberNodesExamined().toString()));
			sb.append("</numberNodesExamined>");		
		}
		if (this.getNodesPositiveNumber() != null)
		{
			sb.append("<nodesPositiveNumber>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNodesPositiveNumber().toString()));
			sb.append("</nodesPositiveNumber>");		
		}
		if (this.getPathologicalTVal() != null)
		{
			sb.append("<pathologicalTVal>");
			sb.append(this.getPathologicalTVal().toXMLString(domMap)); 	
			sb.append("</pathologicalTVal>");		
		}
		if (this.getPathologicalNVal() != null)
		{
			sb.append("<pathologicalNVal>");
			sb.append(this.getPathologicalNVal().toXMLString(domMap)); 	
			sb.append("</pathologicalNVal>");		
		}
		if (this.getPathologicalMVal() != null)
		{
			sb.append("<pathologicalMVal>");
			sb.append(this.getPathologicalMVal().toXMLString(domMap)); 	
			sb.append("</pathologicalMVal>");		
		}
		if (this.getPathologicalOverall() != null)
		{
			sb.append("<pathologicalOverall>");
			sb.append(this.getPathologicalOverall().toXMLString(domMap)); 	
			sb.append("</pathologicalOverall>");		
		}
		if (this.getServiceReportId() != null)
		{
			sb.append("<serviceReportId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getServiceReportId().toString()));
			sb.append("</serviceReportId>");		
		}
		if (this.getServiceReportStatus() != null)
		{
			sb.append("<serviceReportStatus>");
			sb.append(this.getServiceReportStatus().toXMLString()); 
			sb.append("</serviceReportStatus>");		
		}
		if (this.getSpecimenNature() != null)
		{
			sb.append("<specimenNature>");
			sb.append(this.getSpecimenNature().toXMLString()); 
			sb.append("</specimenNature>");		
		}
		if (this.getOrgaCodeRequester() != null)
		{
			sb.append("<orgaCodeRequester>");
			sb.append(this.getOrgaCodeRequester().toXMLString(domMap)); 	
			sb.append("</orgaCodeRequester>");		
		}
		if (this.getCareProfCodeRequester() != null)
		{
			sb.append("<careProfCodeRequester>");
			sb.append(this.getCareProfCodeRequester().toXMLString(domMap)); 	
			sb.append("</careProfCodeRequester>");		
		}
		if (this.getTCategoryExtended() != null)
		{
			if (this.getTCategoryExtended().size() > 0 )
			{
			sb.append("<tCategoryExtended>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getTCategoryExtended(), domMap));
			sb.append("</tCategoryExtended>");		
			}
		}
		if (this.getMCategoryExtended() != null)
		{
			if (this.getMCategoryExtended().size() > 0 )
			{
			sb.append("<mCategoryExtended>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getMCategoryExtended(), domMap));
			sb.append("</mCategoryExtended>");		
			}
		}
		if (this.getAssociatiatedTumourDetails() != null)
		{
			sb.append("<associatiatedTumourDetails>");
			sb.append(this.getAssociatiatedTumourDetails().toXMLString(domMap)); 	
			sb.append("</associatiatedTumourDetails>");		
		}
		if (this.getStatus() != null)
		{
			sb.append("<status>");
			sb.append(this.getStatus().toXMLString()); 
			sb.append("</status>");		
		}
		if (this.getPreviousVersion() != null)
		{
			sb.append("<previousVersion>");
			sb.append(this.getPreviousVersion().toXMLString(domMap)); 	
			sb.append("</previousVersion>");		
		}
		if (this.getAssociatedQuestions() != null)
		{
			sb.append("<associatedQuestions>");
			sb.append(this.getAssociatedQuestions().toXMLString(domMap)); 	
			sb.append("</associatedQuestions>");		
		}
		if (this.getAuthoringInformation() != null)
		{
			sb.append("<authoringInformation>");
			sb.append(this.getAuthoringInformation().toXMLString(domMap)); 	
			sb.append("</authoringInformation>");		
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
			PathologyDetails domainObject = getPathologyDetailsfromXML(itemEl, factory, domMap);

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
			PathologyDetails domainObject = getPathologyDetailsfromXML(itemEl, factory, domMap);

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
		
	public static PathologyDetails getPathologyDetailsfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPathologyDetailsfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PathologyDetails getPathologyDetailsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PathologyDetails.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PathologyDetails.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PathologyDetails class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PathologyDetails)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PathologyDetails.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PathologyDetails ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PathologyDetails)factory.getImportedDomainObject(PathologyDetails.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PathologyDetails();
		}
		String keyClassName = "PathologyDetails";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PathologyDetails)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PathologyDetails obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("careContext");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareContext(ims.core.admin.domain.objects.CareContext.getCareContextfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("investigationType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setInvestigationType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("sampleReceiptDate");
		if(fldEl != null)
		{	
    		obj.setSampleReceiptDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("investigationResultDate");
		if(fldEl != null)
		{	
    		obj.setInvestigationResultDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("reportingConsultantCode");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setReportingConsultantCode(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("reportingOrganisation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setReportingOrganisation(ims.core.resource.place.domain.objects.Organisation.getOrganisationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("invasiveLesionSize");
		if(fldEl != null)
		{	
    		obj.setInvasiveLesionSize(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("synchronousTumourIndicator");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSynchronousTumourIndicator(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("histology");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setHistology(ims.oncology.configuration.domain.objects.TumourHistology.fromSetXMLString(fldEl, factory, obj.getHistology(), domMap));
		}
		fldEl = el.element("gradeOfDifferentation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setGradeOfDifferentation(ims.oncology.configuration.domain.objects.TumourGroupHistopathologicGrade.getTumourGroupHistopathologicGradefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("vascularLymphInvasion");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setVascularLymphInvasion(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("excisionMargin");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setExcisionMargin(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("numberNodesExamined");
		if(fldEl != null)
		{	
    		obj.setNumberNodesExamined(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("nodesPositiveNumber");
		if(fldEl != null)
		{	
    		obj.setNodesPositiveNumber(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("pathologicalTVal");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPathologicalTVal(ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue.getTumourGroupSiteTNMValuefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("pathologicalNVal");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPathologicalNVal(ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue.getTumourGroupSiteTNMValuefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("pathologicalMVal");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPathologicalMVal(ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue.getTumourGroupSiteTNMValuefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("pathologicalOverall");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPathologicalOverall(ims.oncology.configuration.domain.objects.TumourGroupSiteOverallStaging.getTumourGroupSiteOverallStagingfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("serviceReportId");
		if(fldEl != null)
		{	
    		obj.setServiceReportId(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("serviceReportStatus");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setServiceReportStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("specimenNature");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setSpecimenNature(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("orgaCodeRequester");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setOrgaCodeRequester(ims.core.resource.place.domain.objects.Organisation.getOrganisationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("careProfCodeRequester");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCareProfCodeRequester(ims.core.resource.people.domain.objects.Hcp.getHcpfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("tCategoryExtended");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setTCategoryExtended(ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue.fromSetXMLString(fldEl, factory, obj.getTCategoryExtended(), domMap));
		}
		fldEl = el.element("mCategoryExtended");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setMCategoryExtended(ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue.fromSetXMLString(fldEl, factory, obj.getMCategoryExtended(), domMap));
		}
		fldEl = el.element("associatiatedTumourDetails");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAssociatiatedTumourDetails(ims.oncology.domain.objects.PrimaryTumourDetails.getPrimaryTumourDetailsfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("status");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setStatus(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("previousVersion");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPreviousVersion(ims.oncology.domain.objects.PathologyDetails.getPathologyDetailsfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("associatedQuestions");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAssociatedQuestions(ims.assessment.instantiation.domain.objects.PatientAssessment.getPatientAssessmentfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("authoringInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "histology"
		, "tCategoryExtended"
		, "mCategoryExtended"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String CareContext = "careContext";
		public static final String InvestigationType = "investigationType";
		public static final String SampleReceiptDate = "sampleReceiptDate";
		public static final String InvestigationResultDate = "investigationResultDate";
		public static final String ReportingConsultantCode = "reportingConsultantCode";
		public static final String ReportingOrganisation = "reportingOrganisation";
		public static final String InvasiveLesionSize = "invasiveLesionSize";
		public static final String SynchronousTumourIndicator = "synchronousTumourIndicator";
		public static final String Histology = "histology";
		public static final String GradeOfDifferentation = "gradeOfDifferentation";
		public static final String VascularLymphInvasion = "vascularLymphInvasion";
		public static final String ExcisionMargin = "excisionMargin";
		public static final String NumberNodesExamined = "numberNodesExamined";
		public static final String NodesPositiveNumber = "nodesPositiveNumber";
		public static final String PathologicalTVal = "pathologicalTVal";
		public static final String PathologicalNVal = "pathologicalNVal";
		public static final String PathologicalMVal = "pathologicalMVal";
		public static final String PathologicalOverall = "pathologicalOverall";
		public static final String ServiceReportId = "serviceReportId";
		public static final String ServiceReportStatus = "serviceReportStatus";
		public static final String SpecimenNature = "specimenNature";
		public static final String OrgaCodeRequester = "orgaCodeRequester";
		public static final String CareProfCodeRequester = "careProfCodeRequester";
		public static final String TCategoryExtended = "tCategoryExtended";
		public static final String MCategoryExtended = "mCategoryExtended";
		public static final String AssociatiatedTumourDetails = "associatiatedTumourDetails";
		public static final String Status = "status";
		public static final String PreviousVersion = "previousVersion";
		public static final String AssociatedQuestions = "associatedQuestions";
		public static final String AuthoringInformation = "authoringInformation";
	}
}

