/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated: 16/04/2014, 12:34
 *
 */
package ims.RefMan.domain.objects;

/**
 * 
 * @author Neil McAnaspie
 * Generated.
 */


public class DischargeSummaryPacuAndWard extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1096100034;
	private static final long serialVersionUID = 1096100034L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Cats Referral */
	private ims.RefMan.domain.objects.CatsReferral catsReferral;
	/** AuthoringInformation */
	private ims.core.clinical.domain.objects.AuthoringInformation authoringInformation;
	/** Discharge Date */
	private java.util.Date dischargeDate;
	/** Discharge Type */
	private ims.domain.lookups.LookupInstance dischargeType;
	/** Admission Summary */
	private String admissionSummary;
	/** Diagnosis
	  * Collection of ims.core.clinical.domain.objects.PatientDiagnosis.
	  */
	private java.util.Set diagnosis;
	/** Medication On Discharge
	  * Collection of ims.core.clinical.domain.objects.PatientMedication.
	  */
	private java.util.List medicationOnDischarge;
	/** Patients Problems And Needs */
	private String problemsAndNeeds;
	/** Additional Comments */
	private String additionalComments;
	/** DressingsAndAids
	  * Collection of ims.clinical.domain.objects.DressingsAndAids.
	  */
	private java.util.Set dressingsAndAids;
	/** Followup Management Type */
	private ims.domain.lookups.LookupInstance followupType;
	/** Further Management Instructions */
	private String furtherManagementInstructions;
	/** Medically Incomplete Reason */
	private ims.domain.lookups.LookupInstance medicallyIncomplete;
	/** Medically Incomplete No of Days */
	private Integer incompleteNoOfDays;
	/** Onward Referral */
	private ims.RefMan.domain.objects.OnwardReferral currentOnwardReferral;
	/** Onward Referrals
	  * Collection of ims.RefMan.domain.objects.OnwardReferral.
	  */
	private java.util.Set onwardReferrals;
	/** Actions for GP and Community */
	private String actionsforGPandCommunity;
	/** DischargeEpisode */
	private ims.core.admin.pas.domain.objects.DischargedEpisode dischargeEpisode;
	/** UniqueLineRefNo - Used for Monthly Activity Report */
	private String uniqueLineRefNo;
	/** wasOutputtedToWeeklyReport */
	private Boolean wasOutputtedToWeeklyReport;
	/** wasOutputtedToMonthlyReport */
	private Boolean wasOutputtedToMonthlyReport;
	/** Field will tell if this is the current record (only one that can be edited) */
	private Boolean isCurrent;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public DischargeSummaryPacuAndWard (Integer id, int ver)
    {
    	super(id, ver);
    }
    public DischargeSummaryPacuAndWard ()
    {
    	super();
    }
    public DischargeSummaryPacuAndWard (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.RefMan.domain.objects.DischargeSummaryPacuAndWard.class;
	}


	public ims.RefMan.domain.objects.CatsReferral getCatsReferral() {
		return catsReferral;
	}
	public void setCatsReferral(ims.RefMan.domain.objects.CatsReferral catsReferral) {
		this.catsReferral = catsReferral;
	}

	public ims.core.clinical.domain.objects.AuthoringInformation getAuthoringInformation() {
		return authoringInformation;
	}
	public void setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation authoringInformation) {
		this.authoringInformation = authoringInformation;
	}

	public java.util.Date getDischargeDate() {
		return dischargeDate;
	}
	public void setDischargeDate(java.util.Date dischargeDate) {
		this.dischargeDate = dischargeDate;
	}

	public ims.domain.lookups.LookupInstance getDischargeType() {
		return dischargeType;
	}
	public void setDischargeType(ims.domain.lookups.LookupInstance dischargeType) {
		this.dischargeType = dischargeType;
	}

	public String getAdmissionSummary() {
		return admissionSummary;
	}
	public void setAdmissionSummary(String admissionSummary) {
		this.admissionSummary = admissionSummary;
	}

	public java.util.Set getDiagnosis() {
		if ( null == diagnosis ) {
			diagnosis = new java.util.HashSet();
		}
		return diagnosis;
	}
	public void setDiagnosis(java.util.Set paramValue) {
		this.diagnosis = paramValue;
	}

	public java.util.List getMedicationOnDischarge() {
		if ( null == medicationOnDischarge ) {
			medicationOnDischarge = new java.util.ArrayList();
		}
		return medicationOnDischarge;
	}
	public void setMedicationOnDischarge(java.util.List paramValue) {
		this.medicationOnDischarge = paramValue;
	}

	public String getProblemsAndNeeds() {
		return problemsAndNeeds;
	}
	public void setProblemsAndNeeds(String problemsAndNeeds) {
		this.problemsAndNeeds = problemsAndNeeds;
	}

	public String getAdditionalComments() {
		return additionalComments;
	}
	public void setAdditionalComments(String additionalComments) {
		this.additionalComments = additionalComments;
	}

	public java.util.Set getDressingsAndAids() {
		if ( null == dressingsAndAids ) {
			dressingsAndAids = new java.util.HashSet();
		}
		return dressingsAndAids;
	}
	public void setDressingsAndAids(java.util.Set paramValue) {
		this.dressingsAndAids = paramValue;
	}

	public ims.domain.lookups.LookupInstance getFollowupType() {
		return followupType;
	}
	public void setFollowupType(ims.domain.lookups.LookupInstance followupType) {
		this.followupType = followupType;
	}

	public String getFurtherManagementInstructions() {
		return furtherManagementInstructions;
	}
	public void setFurtherManagementInstructions(String furtherManagementInstructions) {
		this.furtherManagementInstructions = furtherManagementInstructions;
	}

	public ims.domain.lookups.LookupInstance getMedicallyIncomplete() {
		return medicallyIncomplete;
	}
	public void setMedicallyIncomplete(ims.domain.lookups.LookupInstance medicallyIncomplete) {
		this.medicallyIncomplete = medicallyIncomplete;
	}

	public Integer getIncompleteNoOfDays() {
		return incompleteNoOfDays;
	}
	public void setIncompleteNoOfDays(Integer incompleteNoOfDays) {
		this.incompleteNoOfDays = incompleteNoOfDays;
	}

	public ims.RefMan.domain.objects.OnwardReferral getCurrentOnwardReferral() {
		return currentOnwardReferral;
	}
	public void setCurrentOnwardReferral(ims.RefMan.domain.objects.OnwardReferral currentOnwardReferral) {
		this.currentOnwardReferral = currentOnwardReferral;
	}

	public java.util.Set getOnwardReferrals() {
		if ( null == onwardReferrals ) {
			onwardReferrals = new java.util.HashSet();
		}
		return onwardReferrals;
	}
	public void setOnwardReferrals(java.util.Set paramValue) {
		this.onwardReferrals = paramValue;
	}

	public String getActionsforGPandCommunity() {
		return actionsforGPandCommunity;
	}
	public void setActionsforGPandCommunity(String actionsforGPandCommunity) {
		this.actionsforGPandCommunity = actionsforGPandCommunity;
	}

	public ims.core.admin.pas.domain.objects.DischargedEpisode getDischargeEpisode() {
		return dischargeEpisode;
	}
	public void setDischargeEpisode(ims.core.admin.pas.domain.objects.DischargedEpisode dischargeEpisode) {
		this.dischargeEpisode = dischargeEpisode;
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

	public Boolean isIsCurrent() {
		return isCurrent;
	}
	public void setIsCurrent(Boolean isCurrent) {
		this.isCurrent = isCurrent;
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
		
		auditStr.append("\r\n*catsReferral* :");
		if (catsReferral != null)
		{
			auditStr.append(toShortClassName(catsReferral));
				
		    auditStr.append(catsReferral.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*authoringInformation* :");
		if (authoringInformation != null)
		{
			auditStr.append(toShortClassName(authoringInformation));
				
		    auditStr.append(authoringInformation.toString());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*dischargeDate* :");
		auditStr.append(dischargeDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*dischargeType* :");
		if (dischargeType != null)
			auditStr.append(dischargeType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*admissionSummary* :");
		auditStr.append(admissionSummary);
	    auditStr.append("; ");
		auditStr.append("\r\n*diagnosis* :");
		if (diagnosis != null)
		{
			java.util.Iterator it6 = diagnosis.iterator();
			int i6=0;
			while (it6.hasNext())
			{
				if (i6 > 0)
					auditStr.append(",");
				ims.core.clinical.domain.objects.PatientDiagnosis obj = (ims.core.clinical.domain.objects.PatientDiagnosis)it6.next();
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
		auditStr.append("\r\n*medicationOnDischarge* :");
		if (medicationOnDischarge != null)
		{
		int i7=0;
		for (i7=0; i7<medicationOnDischarge.size(); i7++)
		{
			if (i7 > 0)
				auditStr.append(",");
			ims.core.clinical.domain.objects.PatientMedication obj = (ims.core.clinical.domain.objects.PatientMedication)medicationOnDischarge.get(i7);
		    if (obj != null)
			{
				if (i7 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i7 > 0)
			auditStr.append("] " + i7);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*problemsAndNeeds* :");
		auditStr.append(problemsAndNeeds);
	    auditStr.append("; ");
		auditStr.append("\r\n*additionalComments* :");
		auditStr.append(additionalComments);
	    auditStr.append("; ");
		auditStr.append("\r\n*dressingsAndAids* :");
		if (dressingsAndAids != null)
		{
			java.util.Iterator it10 = dressingsAndAids.iterator();
			int i10=0;
			while (it10.hasNext())
			{
				if (i10 > 0)
					auditStr.append(",");
				ims.clinical.domain.objects.DressingsAndAids obj = (ims.clinical.domain.objects.DressingsAndAids)it10.next();
		if (obj != null)
		{
		   if (i10 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i10++;
		}
		if (i10 > 0)
			auditStr.append("] " + i10);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*followupType* :");
		if (followupType != null)
			auditStr.append(followupType.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*furtherManagementInstructions* :");
		auditStr.append(furtherManagementInstructions);
	    auditStr.append("; ");
		auditStr.append("\r\n*medicallyIncomplete* :");
		if (medicallyIncomplete != null)
			auditStr.append(medicallyIncomplete.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*incompleteNoOfDays* :");
		auditStr.append(incompleteNoOfDays);
	    auditStr.append("; ");
		auditStr.append("\r\n*currentOnwardReferral* :");
		if (currentOnwardReferral != null)
		{
			auditStr.append(toShortClassName(currentOnwardReferral));
				
		    auditStr.append(currentOnwardReferral.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*onwardReferrals* :");
		if (onwardReferrals != null)
		{
			java.util.Iterator it16 = onwardReferrals.iterator();
			int i16=0;
			while (it16.hasNext())
			{
				if (i16 > 0)
					auditStr.append(",");
				ims.RefMan.domain.objects.OnwardReferral obj = (ims.RefMan.domain.objects.OnwardReferral)it16.next();
		if (obj != null)
		{
		   if (i16 == 0)
		   {
			auditStr.append(toShortClassName(obj));
			auditStr.append("[");
		   }
		
		   auditStr.append(obj.getId());
		}
			i16++;
		}
		if (i16 > 0)
			auditStr.append("] " + i16);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*actionsforGPandCommunity* :");
		auditStr.append(actionsforGPandCommunity);
	    auditStr.append("; ");
		auditStr.append("\r\n*dischargeEpisode* :");
		if (dischargeEpisode != null)
		{
			auditStr.append(toShortClassName(dischargeEpisode));
				
		    auditStr.append(dischargeEpisode.getId());
		}
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
		auditStr.append("\r\n*isCurrent* :");
		auditStr.append(isCurrent);
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
		
		String keyClassName = "DischargeSummaryPacuAndWard";
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
		if (this.getCatsReferral() != null)
		{
			sb.append("<catsReferral>");
			sb.append(this.getCatsReferral().toXMLString(domMap)); 	
			sb.append("</catsReferral>");		
		}
		if (this.getAuthoringInformation() != null)
		{
			sb.append("<authoringInformation>");
			sb.append(this.getAuthoringInformation().toXMLString(domMap)); 	
			sb.append("</authoringInformation>");		
		}
		if (this.getDischargeDate() != null)
		{
			sb.append("<dischargeDate>");
			sb.append(new ims.framework.utils.DateTime(this.getDischargeDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dischargeDate>");		
		}
		if (this.getDischargeType() != null)
		{
			sb.append("<dischargeType>");
			sb.append(this.getDischargeType().toXMLString()); 
			sb.append("</dischargeType>");		
		}
		if (this.getAdmissionSummary() != null)
		{
			sb.append("<admissionSummary>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAdmissionSummary().toString()));
			sb.append("</admissionSummary>");		
		}
		if (this.getDiagnosis() != null)
		{
			if (this.getDiagnosis().size() > 0 )
			{
			sb.append("<diagnosis>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getDiagnosis(), domMap));
			sb.append("</diagnosis>");		
			}
		}
		if (this.getMedicationOnDischarge() != null)
		{
			if (this.getMedicationOnDischarge().size() > 0 )
			{
			sb.append("<medicationOnDischarge>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getMedicationOnDischarge(), domMap));
			sb.append("</medicationOnDischarge>");		
			}
		}
		if (this.getProblemsAndNeeds() != null)
		{
			sb.append("<problemsAndNeeds>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getProblemsAndNeeds().toString()));
			sb.append("</problemsAndNeeds>");		
		}
		if (this.getAdditionalComments() != null)
		{
			sb.append("<additionalComments>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getAdditionalComments().toString()));
			sb.append("</additionalComments>");		
		}
		if (this.getDressingsAndAids() != null)
		{
			if (this.getDressingsAndAids().size() > 0 )
			{
			sb.append("<dressingsAndAids>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getDressingsAndAids(), domMap));
			sb.append("</dressingsAndAids>");		
			}
		}
		if (this.getFollowupType() != null)
		{
			sb.append("<followupType>");
			sb.append(this.getFollowupType().toXMLString()); 
			sb.append("</followupType>");		
		}
		if (this.getFurtherManagementInstructions() != null)
		{
			sb.append("<furtherManagementInstructions>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getFurtherManagementInstructions().toString()));
			sb.append("</furtherManagementInstructions>");		
		}
		if (this.getMedicallyIncomplete() != null)
		{
			sb.append("<medicallyIncomplete>");
			sb.append(this.getMedicallyIncomplete().toXMLString()); 
			sb.append("</medicallyIncomplete>");		
		}
		if (this.getIncompleteNoOfDays() != null)
		{
			sb.append("<incompleteNoOfDays>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getIncompleteNoOfDays().toString()));
			sb.append("</incompleteNoOfDays>");		
		}
		if (this.getCurrentOnwardReferral() != null)
		{
			sb.append("<currentOnwardReferral>");
			sb.append(this.getCurrentOnwardReferral().toXMLString(domMap)); 	
			sb.append("</currentOnwardReferral>");		
		}
		if (this.getOnwardReferrals() != null)
		{
			if (this.getOnwardReferrals().size() > 0 )
			{
			sb.append("<onwardReferrals>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getOnwardReferrals(), domMap));
			sb.append("</onwardReferrals>");		
			}
		}
		if (this.getActionsforGPandCommunity() != null)
		{
			sb.append("<actionsforGPandCommunity>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getActionsforGPandCommunity().toString()));
			sb.append("</actionsforGPandCommunity>");		
		}
		if (this.getDischargeEpisode() != null)
		{
			sb.append("<dischargeEpisode>");
			sb.append(this.getDischargeEpisode().toXMLString(domMap)); 	
			sb.append("</dischargeEpisode>");		
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
		if (this.isIsCurrent() != null)
		{
			sb.append("<isCurrent>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isIsCurrent().toString()));
			sb.append("</isCurrent>");		
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
			DischargeSummaryPacuAndWard domainObject = getDischargeSummaryPacuAndWardfromXML(itemEl, factory, domMap);

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
			DischargeSummaryPacuAndWard domainObject = getDischargeSummaryPacuAndWardfromXML(itemEl, factory, domMap);

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
		
	public static DischargeSummaryPacuAndWard getDischargeSummaryPacuAndWardfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getDischargeSummaryPacuAndWardfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static DischargeSummaryPacuAndWard getDischargeSummaryPacuAndWardfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!DischargeSummaryPacuAndWard.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!DischargeSummaryPacuAndWard.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the DischargeSummaryPacuAndWard class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (DischargeSummaryPacuAndWard)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(DischargeSummaryPacuAndWard.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		DischargeSummaryPacuAndWard ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (DischargeSummaryPacuAndWard)factory.getImportedDomainObject(DischargeSummaryPacuAndWard.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new DischargeSummaryPacuAndWard();
		}
		String keyClassName = "DischargeSummaryPacuAndWard";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (DischargeSummaryPacuAndWard)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, DischargeSummaryPacuAndWard obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("catsReferral");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCatsReferral(ims.RefMan.domain.objects.CatsReferral.getCatsReferralfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("authoringInformation");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setAuthoringInformation(ims.core.clinical.domain.objects.AuthoringInformation.getAuthoringInformationfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("dischargeDate");
		if(fldEl != null)
		{	
    		obj.setDischargeDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("dischargeType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDischargeType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("admissionSummary");
		if(fldEl != null)
		{	
    		obj.setAdmissionSummary(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("diagnosis");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setDiagnosis(ims.core.clinical.domain.objects.PatientDiagnosis.fromSetXMLString(fldEl, factory, obj.getDiagnosis(), domMap));
		}
		fldEl = el.element("medicationOnDischarge");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setMedicationOnDischarge(ims.core.clinical.domain.objects.PatientMedication.fromListXMLString(fldEl, factory, obj.getMedicationOnDischarge(), domMap));
		}
		fldEl = el.element("problemsAndNeeds");
		if(fldEl != null)
		{	
    		obj.setProblemsAndNeeds(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("additionalComments");
		if(fldEl != null)
		{	
    		obj.setAdditionalComments(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dressingsAndAids");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setDressingsAndAids(ims.clinical.domain.objects.DressingsAndAids.fromSetXMLString(fldEl, factory, obj.getDressingsAndAids(), domMap));
		}
		fldEl = el.element("followupType");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setFollowupType(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("furtherManagementInstructions");
		if(fldEl != null)
		{	
    		obj.setFurtherManagementInstructions(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("medicallyIncomplete");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setMedicallyIncomplete(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("incompleteNoOfDays");
		if(fldEl != null)
		{	
    		obj.setIncompleteNoOfDays(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("currentOnwardReferral");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setCurrentOnwardReferral(ims.RefMan.domain.objects.OnwardReferral.getOnwardReferralfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("onwardReferrals");
		if(fldEl != null)
		{
			fldEl = fldEl.element("set");	
			obj.setOnwardReferrals(ims.RefMan.domain.objects.OnwardReferral.fromSetXMLString(fldEl, factory, obj.getOnwardReferrals(), domMap));
		}
		fldEl = el.element("actionsforGPandCommunity");
		if(fldEl != null)
		{	
    		obj.setActionsforGPandCommunity(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dischargeEpisode");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setDischargeEpisode(ims.core.admin.pas.domain.objects.DischargedEpisode.getDischargedEpisodefromXML(fldEl, factory, domMap)); 
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
		fldEl = el.element("isCurrent");
		if(fldEl != null)
		{	
    		obj.setIsCurrent(new Boolean(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "diagnosis"
		, "medicationOnDischarge"
		, "dressingsAndAids"
		, "onwardReferrals"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String CatsReferral = "catsReferral";
		public static final String AuthoringInformation = "authoringInformation";
		public static final String DischargeDate = "dischargeDate";
		public static final String DischargeType = "dischargeType";
		public static final String AdmissionSummary = "admissionSummary";
		public static final String Diagnosis = "diagnosis";
		public static final String MedicationOnDischarge = "medicationOnDischarge";
		public static final String ProblemsAndNeeds = "problemsAndNeeds";
		public static final String AdditionalComments = "additionalComments";
		public static final String DressingsAndAids = "dressingsAndAids";
		public static final String FollowupType = "followupType";
		public static final String FurtherManagementInstructions = "furtherManagementInstructions";
		public static final String MedicallyIncomplete = "medicallyIncomplete";
		public static final String IncompleteNoOfDays = "incompleteNoOfDays";
		public static final String CurrentOnwardReferral = "currentOnwardReferral";
		public static final String OnwardReferrals = "onwardReferrals";
		public static final String ActionsforGPandCommunity = "actionsforGPandCommunity";
		public static final String DischargeEpisode = "dischargeEpisode";
		public static final String UniqueLineRefNo = "uniqueLineRefNo";
		public static final String WasOutputtedToWeeklyReport = "wasOutputtedToWeeklyReport";
		public static final String WasOutputtedToMonthlyReport = "wasOutputtedToMonthlyReport";
		public static final String IsCurrent = "isCurrent";
	}
}

