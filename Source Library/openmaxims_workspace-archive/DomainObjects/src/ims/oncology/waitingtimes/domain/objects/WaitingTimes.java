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
package ims.oncology.waitingtimes.domain.objects;

/**
 * 
 * @author Barbara Worwood
 * Generated.
 */


public class WaitingTimes extends ims.domain.DomainObject implements java.io.Serializable {
	public static final int CLASSID = 1098100000;
	private static final long serialVersionUID = 1098100000L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** NHS Number */
	private String nHSNumber;
	/** External Code for Source of Referral for Outpatients */
	private String referralSource;
	/** Date Decision to Refer */
	private java.util.Date refDecisionDate;
	/** Date Referral Received */
	private java.util.Date refReceivedDate;
	/** External Code for Priority */
	private String priorityCode;
	/** External Code for Urgent Cancer Referral Type */
	private String referralType;
	/** Date First Seen */
	private java.util.Date firstSeenDate;
	/** External Code for First Seen Organisation */
	private String firstSeenOrgaCode;
	/** WaitingTimes Adjustment referral decision date to date first seen */
	private Integer wTAdjustmentFS;
	/** Waiting Times Adjustment Reason Code */
	private String wTAdjustmentReasonFS;
	/** Reason for breaching target */
	private String breachReason;
	/** External Code for Delay Reason Referral to First Seen */
	private String delayReasonRefFirstSeen;
	/** Cancer Specialist Referral Date */
	private java.util.Date specReferralDate;
	/** External Code for Organisation Code */
	private String referredBy;
	/** Cancer Specialist Date First Seen */
	private java.util.Date specDateFirstSeen;
	/** External code for Cancer Specialist Organisation Code */
	private String specOrgCode;
	/** First Clinical Intervention Date */
	private java.util.Date clinlInterventionDate;
	/** External Code for First Clinical Intervention Organisation Code */
	private String clinInterventionOrgCode;
	/** MDT Discussion Indicator */
	private String mDTDiscussInd;
	/** MDT Discussion Date */
	private java.util.Date mDTDiscussDate;
	/** Cancer Status */
	private String cancerStatus;
	/** ICD code for Primary Diagnosis */
	private String primaryDiagnosis;
	/** Tumour Laterality */
	private String tumourLaterality;
	/** Decision To Treat Date Surgery */
	private java.util.Date dDTDateSurgery;
	/** Decision To Treat Date Chemotherapy */
	private java.util.Date dDTDateChemo;
	/** Decision To Treat Date Teletherapy */
	private java.util.Date dDTDateTele;
	/** Decision To Treat Date Brachytherapy */
	private java.util.Date dDTDateBrachy;
	/** Decision To Treat Date Palliative Care */
	private java.util.Date dDTDatePalliative;
	/** Decision To Treat Date Active Monitoring */
	private java.util.Date dDTDateActiveMon;
	/** External Code for Decision To Treat Organisation Code */
	private String dDTOrgCode;
	/** WaitingTimes Adjustment Treatment */
	private Integer wTAdjustmentTreat;
	/** Waitingtimes Adjustment Reason Treatment */
	private String wTAdjustmentReasonTreat;
	/** Planned Cancer Treatment Type */
	private String planCancerTreatType;
	/** First Treatment Date Surgery */
	private java.util.Date firstTreatmentDateSurg;
	/** First Treatment Date Chemotherapy */
	private java.util.Date firstTreatmentDateChemo;
	/** First Treatment Date Teletherapy */
	private java.util.Date firstTreatmentDateTele;
	/** First Treatment Date Brachytherapy */
	private java.util.Date firstTreatmentDateBrachy;
	/** First Treatment Date Specialist Palliative Care */
	private java.util.Date firstTreatmentDateSPCare;
	/** First Treatment Date Active Monitoring */
	private java.util.Date firstTreatmentDateActiveMon;
	/** External Code for First Treat Organisation Code */
	private String firstTreatmentOrgCode;
	/** Waiting times adjustment decision to treatment to first treatment reason */
	private Integer wTAdjustFirstTreat;
	/** Waiting times adjustment decision to treatment to first treatment reason */
	private String wTAdjustmentReasonFT;
	/** Delay Reason Decision to Treatment */
	private String delayReasonDTT;
	/** Delay Reason Referral To Treatment */
	private String delayReasonRTT;
	/** External Code for Delay Reason Decision to Treatment */
	private String delayCodeDTT;
	/** External Code for Delay Reason Referral to Treatment */
	private String delayCodeRTT;
    public WaitingTimes (Integer id, int ver)
    {
    	super(id, ver);
    }
    public WaitingTimes ()
    {
    	super();
    }
    public WaitingTimes (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.oncology.waitingtimes.domain.objects.WaitingTimes.class;
	}


	public String getNHSNumber() {
		return nHSNumber;
	}
	public void setNHSNumber(String nHSNumber) {
		if ( null != nHSNumber && nHSNumber.length() > 10 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for nHSNumber. Tried to set value: "+
				nHSNumber);
		}
		this.nHSNumber = nHSNumber;
	}

	public String getReferralSource() {
		return referralSource;
	}
	public void setReferralSource(String referralSource) {
		if ( null != referralSource && referralSource.length() > 15 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for referralSource. Tried to set value: "+
				referralSource);
		}
		this.referralSource = referralSource;
	}

	public java.util.Date getRefDecisionDate() {
		return refDecisionDate;
	}
	public void setRefDecisionDate(java.util.Date refDecisionDate) {
		this.refDecisionDate = refDecisionDate;
	}

	public java.util.Date getRefReceivedDate() {
		return refReceivedDate;
	}
	public void setRefReceivedDate(java.util.Date refReceivedDate) {
		this.refReceivedDate = refReceivedDate;
	}

	public String getPriorityCode() {
		return priorityCode;
	}
	public void setPriorityCode(String priorityCode) {
		if ( null != priorityCode && priorityCode.length() > 15 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for priorityCode. Tried to set value: "+
				priorityCode);
		}
		this.priorityCode = priorityCode;
	}

	public String getReferralType() {
		return referralType;
	}
	public void setReferralType(String referralType) {
		if ( null != referralType && referralType.length() > 15 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for referralType. Tried to set value: "+
				referralType);
		}
		this.referralType = referralType;
	}

	public java.util.Date getFirstSeenDate() {
		return firstSeenDate;
	}
	public void setFirstSeenDate(java.util.Date firstSeenDate) {
		this.firstSeenDate = firstSeenDate;
	}

	public String getFirstSeenOrgaCode() {
		return firstSeenOrgaCode;
	}
	public void setFirstSeenOrgaCode(String firstSeenOrgaCode) {
		if ( null != firstSeenOrgaCode && firstSeenOrgaCode.length() > 15 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for firstSeenOrgaCode. Tried to set value: "+
				firstSeenOrgaCode);
		}
		this.firstSeenOrgaCode = firstSeenOrgaCode;
	}

	public Integer getWTAdjustmentFS() {
		return wTAdjustmentFS;
	}
	public void setWTAdjustmentFS(Integer wTAdjustmentFS) {
		this.wTAdjustmentFS = wTAdjustmentFS;
	}

	public String getWTAdjustmentReasonFS() {
		return wTAdjustmentReasonFS;
	}
	public void setWTAdjustmentReasonFS(String wTAdjustmentReasonFS) {
		if ( null != wTAdjustmentReasonFS && wTAdjustmentReasonFS.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for wTAdjustmentReasonFS. Tried to set value: "+
				wTAdjustmentReasonFS);
		}
		this.wTAdjustmentReasonFS = wTAdjustmentReasonFS;
	}

	public String getBreachReason() {
		return breachReason;
	}
	public void setBreachReason(String breachReason) {
		if ( null != breachReason && breachReason.length() > 1000 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for breachReason. Tried to set value: "+
				breachReason);
		}
		this.breachReason = breachReason;
	}

	public String getDelayReasonRefFirstSeen() {
		return delayReasonRefFirstSeen;
	}
	public void setDelayReasonRefFirstSeen(String delayReasonRefFirstSeen) {
		if ( null != delayReasonRefFirstSeen && delayReasonRefFirstSeen.length() > 2 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for delayReasonRefFirstSeen. Tried to set value: "+
				delayReasonRefFirstSeen);
		}
		this.delayReasonRefFirstSeen = delayReasonRefFirstSeen;
	}

	public java.util.Date getSpecReferralDate() {
		return specReferralDate;
	}
	public void setSpecReferralDate(java.util.Date specReferralDate) {
		this.specReferralDate = specReferralDate;
	}

	public String getReferredBy() {
		return referredBy;
	}
	public void setReferredBy(String referredBy) {
		if ( null != referredBy && referredBy.length() > 5 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for referredBy. Tried to set value: "+
				referredBy);
		}
		this.referredBy = referredBy;
	}

	public java.util.Date getSpecDateFirstSeen() {
		return specDateFirstSeen;
	}
	public void setSpecDateFirstSeen(java.util.Date specDateFirstSeen) {
		this.specDateFirstSeen = specDateFirstSeen;
	}

	public String getSpecOrgCode() {
		return specOrgCode;
	}
	public void setSpecOrgCode(String specOrgCode) {
		if ( null != specOrgCode && specOrgCode.length() > 5 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for specOrgCode. Tried to set value: "+
				specOrgCode);
		}
		this.specOrgCode = specOrgCode;
	}

	public java.util.Date getClinlInterventionDate() {
		return clinlInterventionDate;
	}
	public void setClinlInterventionDate(java.util.Date clinlInterventionDate) {
		this.clinlInterventionDate = clinlInterventionDate;
	}

	public String getClinInterventionOrgCode() {
		return clinInterventionOrgCode;
	}
	public void setClinInterventionOrgCode(String clinInterventionOrgCode) {
		if ( null != clinInterventionOrgCode && clinInterventionOrgCode.length() > 5 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for clinInterventionOrgCode. Tried to set value: "+
				clinInterventionOrgCode);
		}
		this.clinInterventionOrgCode = clinInterventionOrgCode;
	}

	public String getMDTDiscussInd() {
		return mDTDiscussInd;
	}
	public void setMDTDiscussInd(String mDTDiscussInd) {
		if ( null != mDTDiscussInd && mDTDiscussInd.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for mDTDiscussInd. Tried to set value: "+
				mDTDiscussInd);
		}
		this.mDTDiscussInd = mDTDiscussInd;
	}

	public java.util.Date getMDTDiscussDate() {
		return mDTDiscussDate;
	}
	public void setMDTDiscussDate(java.util.Date mDTDiscussDate) {
		this.mDTDiscussDate = mDTDiscussDate;
	}

	public String getCancerStatus() {
		return cancerStatus;
	}
	public void setCancerStatus(String cancerStatus) {
		if ( null != cancerStatus && cancerStatus.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for cancerStatus. Tried to set value: "+
				cancerStatus);
		}
		this.cancerStatus = cancerStatus;
	}

	public String getPrimaryDiagnosis() {
		return primaryDiagnosis;
	}
	public void setPrimaryDiagnosis(String primaryDiagnosis) {
		if ( null != primaryDiagnosis && primaryDiagnosis.length() > 5 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for primaryDiagnosis. Tried to set value: "+
				primaryDiagnosis);
		}
		this.primaryDiagnosis = primaryDiagnosis;
	}

	public String getTumourLaterality() {
		return tumourLaterality;
	}
	public void setTumourLaterality(String tumourLaterality) {
		if ( null != tumourLaterality && tumourLaterality.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for tumourLaterality. Tried to set value: "+
				tumourLaterality);
		}
		this.tumourLaterality = tumourLaterality;
	}

	public java.util.Date getDDTDateSurgery() {
		return dDTDateSurgery;
	}
	public void setDDTDateSurgery(java.util.Date dDTDateSurgery) {
		this.dDTDateSurgery = dDTDateSurgery;
	}

	public java.util.Date getDDTDateChemo() {
		return dDTDateChemo;
	}
	public void setDDTDateChemo(java.util.Date dDTDateChemo) {
		this.dDTDateChemo = dDTDateChemo;
	}

	public java.util.Date getDDTDateTele() {
		return dDTDateTele;
	}
	public void setDDTDateTele(java.util.Date dDTDateTele) {
		this.dDTDateTele = dDTDateTele;
	}

	public java.util.Date getDDTDateBrachy() {
		return dDTDateBrachy;
	}
	public void setDDTDateBrachy(java.util.Date dDTDateBrachy) {
		this.dDTDateBrachy = dDTDateBrachy;
	}

	public java.util.Date getDDTDatePalliative() {
		return dDTDatePalliative;
	}
	public void setDDTDatePalliative(java.util.Date dDTDatePalliative) {
		this.dDTDatePalliative = dDTDatePalliative;
	}

	public java.util.Date getDDTDateActiveMon() {
		return dDTDateActiveMon;
	}
	public void setDDTDateActiveMon(java.util.Date dDTDateActiveMon) {
		this.dDTDateActiveMon = dDTDateActiveMon;
	}

	public String getDDTOrgCode() {
		return dDTOrgCode;
	}
	public void setDDTOrgCode(String dDTOrgCode) {
		if ( null != dDTOrgCode && dDTOrgCode.length() > 5 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for dDTOrgCode. Tried to set value: "+
				dDTOrgCode);
		}
		this.dDTOrgCode = dDTOrgCode;
	}

	public Integer getWTAdjustmentTreat() {
		return wTAdjustmentTreat;
	}
	public void setWTAdjustmentTreat(Integer wTAdjustmentTreat) {
		this.wTAdjustmentTreat = wTAdjustmentTreat;
	}

	public String getWTAdjustmentReasonTreat() {
		return wTAdjustmentReasonTreat;
	}
	public void setWTAdjustmentReasonTreat(String wTAdjustmentReasonTreat) {
		if ( null != wTAdjustmentReasonTreat && wTAdjustmentReasonTreat.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for wTAdjustmentReasonTreat. Tried to set value: "+
				wTAdjustmentReasonTreat);
		}
		this.wTAdjustmentReasonTreat = wTAdjustmentReasonTreat;
	}

	public String getPlanCancerTreatType() {
		return planCancerTreatType;
	}
	public void setPlanCancerTreatType(String planCancerTreatType) {
		if ( null != planCancerTreatType && planCancerTreatType.length() > 2 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for planCancerTreatType. Tried to set value: "+
				planCancerTreatType);
		}
		this.planCancerTreatType = planCancerTreatType;
	}

	public java.util.Date getFirstTreatmentDateSurg() {
		return firstTreatmentDateSurg;
	}
	public void setFirstTreatmentDateSurg(java.util.Date firstTreatmentDateSurg) {
		this.firstTreatmentDateSurg = firstTreatmentDateSurg;
	}

	public java.util.Date getFirstTreatmentDateChemo() {
		return firstTreatmentDateChemo;
	}
	public void setFirstTreatmentDateChemo(java.util.Date firstTreatmentDateChemo) {
		this.firstTreatmentDateChemo = firstTreatmentDateChemo;
	}

	public java.util.Date getFirstTreatmentDateTele() {
		return firstTreatmentDateTele;
	}
	public void setFirstTreatmentDateTele(java.util.Date firstTreatmentDateTele) {
		this.firstTreatmentDateTele = firstTreatmentDateTele;
	}

	public java.util.Date getFirstTreatmentDateBrachy() {
		return firstTreatmentDateBrachy;
	}
	public void setFirstTreatmentDateBrachy(java.util.Date firstTreatmentDateBrachy) {
		this.firstTreatmentDateBrachy = firstTreatmentDateBrachy;
	}

	public java.util.Date getFirstTreatmentDateSPCare() {
		return firstTreatmentDateSPCare;
	}
	public void setFirstTreatmentDateSPCare(java.util.Date firstTreatmentDateSPCare) {
		this.firstTreatmentDateSPCare = firstTreatmentDateSPCare;
	}

	public java.util.Date getFirstTreatmentDateActiveMon() {
		return firstTreatmentDateActiveMon;
	}
	public void setFirstTreatmentDateActiveMon(java.util.Date firstTreatmentDateActiveMon) {
		this.firstTreatmentDateActiveMon = firstTreatmentDateActiveMon;
	}

	public String getFirstTreatmentOrgCode() {
		return firstTreatmentOrgCode;
	}
	public void setFirstTreatmentOrgCode(String firstTreatmentOrgCode) {
		if ( null != firstTreatmentOrgCode && firstTreatmentOrgCode.length() > 5 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for firstTreatmentOrgCode. Tried to set value: "+
				firstTreatmentOrgCode);
		}
		this.firstTreatmentOrgCode = firstTreatmentOrgCode;
	}

	public Integer getWTAdjustFirstTreat() {
		return wTAdjustFirstTreat;
	}
	public void setWTAdjustFirstTreat(Integer wTAdjustFirstTreat) {
		this.wTAdjustFirstTreat = wTAdjustFirstTreat;
	}

	public String getWTAdjustmentReasonFT() {
		return wTAdjustmentReasonFT;
	}
	public void setWTAdjustmentReasonFT(String wTAdjustmentReasonFT) {
		if ( null != wTAdjustmentReasonFT && wTAdjustmentReasonFT.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for wTAdjustmentReasonFT. Tried to set value: "+
				wTAdjustmentReasonFT);
		}
		this.wTAdjustmentReasonFT = wTAdjustmentReasonFT;
	}

	public String getDelayReasonDTT() {
		return delayReasonDTT;
	}
	public void setDelayReasonDTT(String delayReasonDTT) {
		if ( null != delayReasonDTT && delayReasonDTT.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for delayReasonDTT. Tried to set value: "+
				delayReasonDTT);
		}
		this.delayReasonDTT = delayReasonDTT;
	}

	public String getDelayReasonRTT() {
		return delayReasonRTT;
	}
	public void setDelayReasonRTT(String delayReasonRTT) {
		if ( null != delayReasonRTT && delayReasonRTT.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for delayReasonRTT. Tried to set value: "+
				delayReasonRTT);
		}
		this.delayReasonRTT = delayReasonRTT;
	}

	public String getDelayCodeDTT() {
		return delayCodeDTT;
	}
	public void setDelayCodeDTT(String delayCodeDTT) {
		if ( null != delayCodeDTT && delayCodeDTT.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for delayCodeDTT. Tried to set value: "+
				delayCodeDTT);
		}
		this.delayCodeDTT = delayCodeDTT;
	}

	public String getDelayCodeRTT() {
		return delayCodeRTT;
	}
	public void setDelayCodeRTT(String delayCodeRTT) {
		if ( null != delayCodeRTT && delayCodeRTT.length() > 1 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for delayCodeRTT. Tried to set value: "+
				delayCodeRTT);
		}
		this.delayCodeRTT = delayCodeRTT;
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
		
		auditStr.append("\r\n*nHSNumber* :");
		auditStr.append(nHSNumber);
	    auditStr.append("; ");
		auditStr.append("\r\n*referralSource* :");
		auditStr.append(referralSource);
	    auditStr.append("; ");
		auditStr.append("\r\n*refDecisionDate* :");
		auditStr.append(refDecisionDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*refReceivedDate* :");
		auditStr.append(refReceivedDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*priorityCode* :");
		auditStr.append(priorityCode);
	    auditStr.append("; ");
		auditStr.append("\r\n*referralType* :");
		auditStr.append(referralType);
	    auditStr.append("; ");
		auditStr.append("\r\n*firstSeenDate* :");
		auditStr.append(firstSeenDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*firstSeenOrgaCode* :");
		auditStr.append(firstSeenOrgaCode);
	    auditStr.append("; ");
		auditStr.append("\r\n*wTAdjustmentFS* :");
		auditStr.append(wTAdjustmentFS);
	    auditStr.append("; ");
		auditStr.append("\r\n*wTAdjustmentReasonFS* :");
		auditStr.append(wTAdjustmentReasonFS);
	    auditStr.append("; ");
		auditStr.append("\r\n*breachReason* :");
		auditStr.append(breachReason);
	    auditStr.append("; ");
		auditStr.append("\r\n*delayReasonRefFirstSeen* :");
		auditStr.append(delayReasonRefFirstSeen);
	    auditStr.append("; ");
		auditStr.append("\r\n*specReferralDate* :");
		auditStr.append(specReferralDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*referredBy* :");
		auditStr.append(referredBy);
	    auditStr.append("; ");
		auditStr.append("\r\n*specDateFirstSeen* :");
		auditStr.append(specDateFirstSeen);
	    auditStr.append("; ");
		auditStr.append("\r\n*specOrgCode* :");
		auditStr.append(specOrgCode);
	    auditStr.append("; ");
		auditStr.append("\r\n*clinlInterventionDate* :");
		auditStr.append(clinlInterventionDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*clinInterventionOrgCode* :");
		auditStr.append(clinInterventionOrgCode);
	    auditStr.append("; ");
		auditStr.append("\r\n*mDTDiscussInd* :");
		auditStr.append(mDTDiscussInd);
	    auditStr.append("; ");
		auditStr.append("\r\n*mDTDiscussDate* :");
		auditStr.append(mDTDiscussDate);
	    auditStr.append("; ");
		auditStr.append("\r\n*cancerStatus* :");
		auditStr.append(cancerStatus);
	    auditStr.append("; ");
		auditStr.append("\r\n*primaryDiagnosis* :");
		auditStr.append(primaryDiagnosis);
	    auditStr.append("; ");
		auditStr.append("\r\n*tumourLaterality* :");
		auditStr.append(tumourLaterality);
	    auditStr.append("; ");
		auditStr.append("\r\n*dDTDateSurgery* :");
		auditStr.append(dDTDateSurgery);
	    auditStr.append("; ");
		auditStr.append("\r\n*dDTDateChemo* :");
		auditStr.append(dDTDateChemo);
	    auditStr.append("; ");
		auditStr.append("\r\n*dDTDateTele* :");
		auditStr.append(dDTDateTele);
	    auditStr.append("; ");
		auditStr.append("\r\n*dDTDateBrachy* :");
		auditStr.append(dDTDateBrachy);
	    auditStr.append("; ");
		auditStr.append("\r\n*dDTDatePalliative* :");
		auditStr.append(dDTDatePalliative);
	    auditStr.append("; ");
		auditStr.append("\r\n*dDTDateActiveMon* :");
		auditStr.append(dDTDateActiveMon);
	    auditStr.append("; ");
		auditStr.append("\r\n*dDTOrgCode* :");
		auditStr.append(dDTOrgCode);
	    auditStr.append("; ");
		auditStr.append("\r\n*wTAdjustmentTreat* :");
		auditStr.append(wTAdjustmentTreat);
	    auditStr.append("; ");
		auditStr.append("\r\n*wTAdjustmentReasonTreat* :");
		auditStr.append(wTAdjustmentReasonTreat);
	    auditStr.append("; ");
		auditStr.append("\r\n*planCancerTreatType* :");
		auditStr.append(planCancerTreatType);
	    auditStr.append("; ");
		auditStr.append("\r\n*firstTreatmentDateSurg* :");
		auditStr.append(firstTreatmentDateSurg);
	    auditStr.append("; ");
		auditStr.append("\r\n*firstTreatmentDateChemo* :");
		auditStr.append(firstTreatmentDateChemo);
	    auditStr.append("; ");
		auditStr.append("\r\n*firstTreatmentDateTele* :");
		auditStr.append(firstTreatmentDateTele);
	    auditStr.append("; ");
		auditStr.append("\r\n*firstTreatmentDateBrachy* :");
		auditStr.append(firstTreatmentDateBrachy);
	    auditStr.append("; ");
		auditStr.append("\r\n*firstTreatmentDateSPCare* :");
		auditStr.append(firstTreatmentDateSPCare);
	    auditStr.append("; ");
		auditStr.append("\r\n*firstTreatmentDateActiveMon* :");
		auditStr.append(firstTreatmentDateActiveMon);
	    auditStr.append("; ");
		auditStr.append("\r\n*firstTreatmentOrgCode* :");
		auditStr.append(firstTreatmentOrgCode);
	    auditStr.append("; ");
		auditStr.append("\r\n*wTAdjustFirstTreat* :");
		auditStr.append(wTAdjustFirstTreat);
	    auditStr.append("; ");
		auditStr.append("\r\n*wTAdjustmentReasonFT* :");
		auditStr.append(wTAdjustmentReasonFT);
	    auditStr.append("; ");
		auditStr.append("\r\n*delayReasonDTT* :");
		auditStr.append(delayReasonDTT);
	    auditStr.append("; ");
		auditStr.append("\r\n*delayReasonRTT* :");
		auditStr.append(delayReasonRTT);
	    auditStr.append("; ");
		auditStr.append("\r\n*delayCodeDTT* :");
		auditStr.append(delayCodeDTT);
	    auditStr.append("; ");
		auditStr.append("\r\n*delayCodeRTT* :");
		auditStr.append(delayCodeRTT);
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
		
		String keyClassName = "WaitingTimes";
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
		if (this.getNHSNumber() != null)
		{
			sb.append("<nHSNumber>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNHSNumber().toString()));
			sb.append("</nHSNumber>");		
		}
		if (this.getReferralSource() != null)
		{
			sb.append("<referralSource>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReferralSource().toString()));
			sb.append("</referralSource>");		
		}
		if (this.getRefDecisionDate() != null)
		{
			sb.append("<refDecisionDate>");
			sb.append(new ims.framework.utils.DateTime(this.getRefDecisionDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</refDecisionDate>");		
		}
		if (this.getRefReceivedDate() != null)
		{
			sb.append("<refReceivedDate>");
			sb.append(new ims.framework.utils.DateTime(this.getRefReceivedDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</refReceivedDate>");		
		}
		if (this.getPriorityCode() != null)
		{
			sb.append("<priorityCode>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPriorityCode().toString()));
			sb.append("</priorityCode>");		
		}
		if (this.getReferralType() != null)
		{
			sb.append("<referralType>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReferralType().toString()));
			sb.append("</referralType>");		
		}
		if (this.getFirstSeenDate() != null)
		{
			sb.append("<firstSeenDate>");
			sb.append(new ims.framework.utils.DateTime(this.getFirstSeenDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</firstSeenDate>");		
		}
		if (this.getFirstSeenOrgaCode() != null)
		{
			sb.append("<firstSeenOrgaCode>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getFirstSeenOrgaCode().toString()));
			sb.append("</firstSeenOrgaCode>");		
		}
		if (this.getWTAdjustmentFS() != null)
		{
			sb.append("<wTAdjustmentFS>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getWTAdjustmentFS().toString()));
			sb.append("</wTAdjustmentFS>");		
		}
		if (this.getWTAdjustmentReasonFS() != null)
		{
			sb.append("<wTAdjustmentReasonFS>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getWTAdjustmentReasonFS().toString()));
			sb.append("</wTAdjustmentReasonFS>");		
		}
		if (this.getBreachReason() != null)
		{
			sb.append("<breachReason>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getBreachReason().toString()));
			sb.append("</breachReason>");		
		}
		if (this.getDelayReasonRefFirstSeen() != null)
		{
			sb.append("<delayReasonRefFirstSeen>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDelayReasonRefFirstSeen().toString()));
			sb.append("</delayReasonRefFirstSeen>");		
		}
		if (this.getSpecReferralDate() != null)
		{
			sb.append("<specReferralDate>");
			sb.append(new ims.framework.utils.DateTime(this.getSpecReferralDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</specReferralDate>");		
		}
		if (this.getReferredBy() != null)
		{
			sb.append("<referredBy>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getReferredBy().toString()));
			sb.append("</referredBy>");		
		}
		if (this.getSpecDateFirstSeen() != null)
		{
			sb.append("<specDateFirstSeen>");
			sb.append(new ims.framework.utils.DateTime(this.getSpecDateFirstSeen()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</specDateFirstSeen>");		
		}
		if (this.getSpecOrgCode() != null)
		{
			sb.append("<specOrgCode>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSpecOrgCode().toString()));
			sb.append("</specOrgCode>");		
		}
		if (this.getClinlInterventionDate() != null)
		{
			sb.append("<clinlInterventionDate>");
			sb.append(new ims.framework.utils.DateTime(this.getClinlInterventionDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</clinlInterventionDate>");		
		}
		if (this.getClinInterventionOrgCode() != null)
		{
			sb.append("<clinInterventionOrgCode>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getClinInterventionOrgCode().toString()));
			sb.append("</clinInterventionOrgCode>");		
		}
		if (this.getMDTDiscussInd() != null)
		{
			sb.append("<mDTDiscussInd>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getMDTDiscussInd().toString()));
			sb.append("</mDTDiscussInd>");		
		}
		if (this.getMDTDiscussDate() != null)
		{
			sb.append("<mDTDiscussDate>");
			sb.append(new ims.framework.utils.DateTime(this.getMDTDiscussDate()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</mDTDiscussDate>");		
		}
		if (this.getCancerStatus() != null)
		{
			sb.append("<cancerStatus>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getCancerStatus().toString()));
			sb.append("</cancerStatus>");		
		}
		if (this.getPrimaryDiagnosis() != null)
		{
			sb.append("<primaryDiagnosis>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPrimaryDiagnosis().toString()));
			sb.append("</primaryDiagnosis>");		
		}
		if (this.getTumourLaterality() != null)
		{
			sb.append("<tumourLaterality>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTumourLaterality().toString()));
			sb.append("</tumourLaterality>");		
		}
		if (this.getDDTDateSurgery() != null)
		{
			sb.append("<dDTDateSurgery>");
			sb.append(new ims.framework.utils.DateTime(this.getDDTDateSurgery()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dDTDateSurgery>");		
		}
		if (this.getDDTDateChemo() != null)
		{
			sb.append("<dDTDateChemo>");
			sb.append(new ims.framework.utils.DateTime(this.getDDTDateChemo()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dDTDateChemo>");		
		}
		if (this.getDDTDateTele() != null)
		{
			sb.append("<dDTDateTele>");
			sb.append(new ims.framework.utils.DateTime(this.getDDTDateTele()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dDTDateTele>");		
		}
		if (this.getDDTDateBrachy() != null)
		{
			sb.append("<dDTDateBrachy>");
			sb.append(new ims.framework.utils.DateTime(this.getDDTDateBrachy()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dDTDateBrachy>");		
		}
		if (this.getDDTDatePalliative() != null)
		{
			sb.append("<dDTDatePalliative>");
			sb.append(new ims.framework.utils.DateTime(this.getDDTDatePalliative()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dDTDatePalliative>");		
		}
		if (this.getDDTDateActiveMon() != null)
		{
			sb.append("<dDTDateActiveMon>");
			sb.append(new ims.framework.utils.DateTime(this.getDDTDateActiveMon()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</dDTDateActiveMon>");		
		}
		if (this.getDDTOrgCode() != null)
		{
			sb.append("<dDTOrgCode>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDDTOrgCode().toString()));
			sb.append("</dDTOrgCode>");		
		}
		if (this.getWTAdjustmentTreat() != null)
		{
			sb.append("<wTAdjustmentTreat>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getWTAdjustmentTreat().toString()));
			sb.append("</wTAdjustmentTreat>");		
		}
		if (this.getWTAdjustmentReasonTreat() != null)
		{
			sb.append("<wTAdjustmentReasonTreat>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getWTAdjustmentReasonTreat().toString()));
			sb.append("</wTAdjustmentReasonTreat>");		
		}
		if (this.getPlanCancerTreatType() != null)
		{
			sb.append("<planCancerTreatType>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPlanCancerTreatType().toString()));
			sb.append("</planCancerTreatType>");		
		}
		if (this.getFirstTreatmentDateSurg() != null)
		{
			sb.append("<firstTreatmentDateSurg>");
			sb.append(new ims.framework.utils.DateTime(this.getFirstTreatmentDateSurg()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</firstTreatmentDateSurg>");		
		}
		if (this.getFirstTreatmentDateChemo() != null)
		{
			sb.append("<firstTreatmentDateChemo>");
			sb.append(new ims.framework.utils.DateTime(this.getFirstTreatmentDateChemo()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</firstTreatmentDateChemo>");		
		}
		if (this.getFirstTreatmentDateTele() != null)
		{
			sb.append("<firstTreatmentDateTele>");
			sb.append(new ims.framework.utils.DateTime(this.getFirstTreatmentDateTele()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</firstTreatmentDateTele>");		
		}
		if (this.getFirstTreatmentDateBrachy() != null)
		{
			sb.append("<firstTreatmentDateBrachy>");
			sb.append(new ims.framework.utils.DateTime(this.getFirstTreatmentDateBrachy()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</firstTreatmentDateBrachy>");		
		}
		if (this.getFirstTreatmentDateSPCare() != null)
		{
			sb.append("<firstTreatmentDateSPCare>");
			sb.append(new ims.framework.utils.DateTime(this.getFirstTreatmentDateSPCare()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</firstTreatmentDateSPCare>");		
		}
		if (this.getFirstTreatmentDateActiveMon() != null)
		{
			sb.append("<firstTreatmentDateActiveMon>");
			sb.append(new ims.framework.utils.DateTime(this.getFirstTreatmentDateActiveMon()).toString(ims.framework.utils.DateTimeFormat.MILLI));
			sb.append("</firstTreatmentDateActiveMon>");		
		}
		if (this.getFirstTreatmentOrgCode() != null)
		{
			sb.append("<firstTreatmentOrgCode>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getFirstTreatmentOrgCode().toString()));
			sb.append("</firstTreatmentOrgCode>");		
		}
		if (this.getWTAdjustFirstTreat() != null)
		{
			sb.append("<wTAdjustFirstTreat>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getWTAdjustFirstTreat().toString()));
			sb.append("</wTAdjustFirstTreat>");		
		}
		if (this.getWTAdjustmentReasonFT() != null)
		{
			sb.append("<wTAdjustmentReasonFT>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getWTAdjustmentReasonFT().toString()));
			sb.append("</wTAdjustmentReasonFT>");		
		}
		if (this.getDelayReasonDTT() != null)
		{
			sb.append("<delayReasonDTT>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDelayReasonDTT().toString()));
			sb.append("</delayReasonDTT>");		
		}
		if (this.getDelayReasonRTT() != null)
		{
			sb.append("<delayReasonRTT>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDelayReasonRTT().toString()));
			sb.append("</delayReasonRTT>");		
		}
		if (this.getDelayCodeDTT() != null)
		{
			sb.append("<delayCodeDTT>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDelayCodeDTT().toString()));
			sb.append("</delayCodeDTT>");		
		}
		if (this.getDelayCodeRTT() != null)
		{
			sb.append("<delayCodeRTT>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDelayCodeRTT().toString()));
			sb.append("</delayCodeRTT>");		
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
			WaitingTimes domainObject = getWaitingTimesfromXML(itemEl, factory, domMap);

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
			WaitingTimes domainObject = getWaitingTimesfromXML(itemEl, factory, domMap);

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
		
	public static WaitingTimes getWaitingTimesfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getWaitingTimesfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static WaitingTimes getWaitingTimesfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!WaitingTimes.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!WaitingTimes.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the WaitingTimes class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (WaitingTimes)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(WaitingTimes.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		WaitingTimes ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (WaitingTimes)factory.getImportedDomainObject(WaitingTimes.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new WaitingTimes();
		}
		String keyClassName = "WaitingTimes";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (WaitingTimes)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, WaitingTimes obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("nHSNumber");
		if(fldEl != null)
		{	
    		obj.setNHSNumber(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("referralSource");
		if(fldEl != null)
		{	
    		obj.setReferralSource(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("refDecisionDate");
		if(fldEl != null)
		{	
    		obj.setRefDecisionDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("refReceivedDate");
		if(fldEl != null)
		{	
    		obj.setRefReceivedDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("priorityCode");
		if(fldEl != null)
		{	
    		obj.setPriorityCode(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("referralType");
		if(fldEl != null)
		{	
    		obj.setReferralType(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("firstSeenDate");
		if(fldEl != null)
		{	
    		obj.setFirstSeenDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("firstSeenOrgaCode");
		if(fldEl != null)
		{	
    		obj.setFirstSeenOrgaCode(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("wTAdjustmentFS");
		if(fldEl != null)
		{	
    		obj.setWTAdjustmentFS(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("wTAdjustmentReasonFS");
		if(fldEl != null)
		{	
    		obj.setWTAdjustmentReasonFS(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("breachReason");
		if(fldEl != null)
		{	
    		obj.setBreachReason(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("delayReasonRefFirstSeen");
		if(fldEl != null)
		{	
    		obj.setDelayReasonRefFirstSeen(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("specReferralDate");
		if(fldEl != null)
		{	
    		obj.setSpecReferralDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("referredBy");
		if(fldEl != null)
		{	
    		obj.setReferredBy(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("specDateFirstSeen");
		if(fldEl != null)
		{	
    		obj.setSpecDateFirstSeen(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("specOrgCode");
		if(fldEl != null)
		{	
    		obj.setSpecOrgCode(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("clinlInterventionDate");
		if(fldEl != null)
		{	
    		obj.setClinlInterventionDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("clinInterventionOrgCode");
		if(fldEl != null)
		{	
    		obj.setClinInterventionOrgCode(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("mDTDiscussInd");
		if(fldEl != null)
		{	
    		obj.setMDTDiscussInd(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("mDTDiscussDate");
		if(fldEl != null)
		{	
    		obj.setMDTDiscussDate(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("cancerStatus");
		if(fldEl != null)
		{	
    		obj.setCancerStatus(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("primaryDiagnosis");
		if(fldEl != null)
		{	
    		obj.setPrimaryDiagnosis(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("tumourLaterality");
		if(fldEl != null)
		{	
    		obj.setTumourLaterality(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dDTDateSurgery");
		if(fldEl != null)
		{	
    		obj.setDDTDateSurgery(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("dDTDateChemo");
		if(fldEl != null)
		{	
    		obj.setDDTDateChemo(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("dDTDateTele");
		if(fldEl != null)
		{	
    		obj.setDDTDateTele(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("dDTDateBrachy");
		if(fldEl != null)
		{	
    		obj.setDDTDateBrachy(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("dDTDatePalliative");
		if(fldEl != null)
		{	
    		obj.setDDTDatePalliative(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("dDTDateActiveMon");
		if(fldEl != null)
		{	
    		obj.setDDTDateActiveMon(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("dDTOrgCode");
		if(fldEl != null)
		{	
    		obj.setDDTOrgCode(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("wTAdjustmentTreat");
		if(fldEl != null)
		{	
    		obj.setWTAdjustmentTreat(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("wTAdjustmentReasonTreat");
		if(fldEl != null)
		{	
    		obj.setWTAdjustmentReasonTreat(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("planCancerTreatType");
		if(fldEl != null)
		{	
    		obj.setPlanCancerTreatType(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("firstTreatmentDateSurg");
		if(fldEl != null)
		{	
    		obj.setFirstTreatmentDateSurg(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("firstTreatmentDateChemo");
		if(fldEl != null)
		{	
    		obj.setFirstTreatmentDateChemo(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("firstTreatmentDateTele");
		if(fldEl != null)
		{	
    		obj.setFirstTreatmentDateTele(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("firstTreatmentDateBrachy");
		if(fldEl != null)
		{	
    		obj.setFirstTreatmentDateBrachy(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("firstTreatmentDateSPCare");
		if(fldEl != null)
		{	
    		obj.setFirstTreatmentDateSPCare(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("firstTreatmentDateActiveMon");
		if(fldEl != null)
		{	
    		obj.setFirstTreatmentDateActiveMon(new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").parse(fldEl.getTextTrim()));
		}
		fldEl = el.element("firstTreatmentOrgCode");
		if(fldEl != null)
		{	
    		obj.setFirstTreatmentOrgCode(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("wTAdjustFirstTreat");
		if(fldEl != null)
		{	
    		obj.setWTAdjustFirstTreat(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("wTAdjustmentReasonFT");
		if(fldEl != null)
		{	
    		obj.setWTAdjustmentReasonFT(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("delayReasonDTT");
		if(fldEl != null)
		{	
    		obj.setDelayReasonDTT(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("delayReasonRTT");
		if(fldEl != null)
		{	
    		obj.setDelayReasonRTT(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("delayCodeDTT");
		if(fldEl != null)
		{	
    		obj.setDelayCodeDTT(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("delayCodeRTT");
		if(fldEl != null)
		{	
    		obj.setDelayCodeRTT(new String(fldEl.getTextTrim()));	
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
		public static final String NHSNumber = "nHSNumber";
		public static final String ReferralSource = "referralSource";
		public static final String RefDecisionDate = "refDecisionDate";
		public static final String RefReceivedDate = "refReceivedDate";
		public static final String PriorityCode = "priorityCode";
		public static final String ReferralType = "referralType";
		public static final String FirstSeenDate = "firstSeenDate";
		public static final String FirstSeenOrgaCode = "firstSeenOrgaCode";
		public static final String WTAdjustmentFS = "wTAdjustmentFS";
		public static final String WTAdjustmentReasonFS = "wTAdjustmentReasonFS";
		public static final String BreachReason = "breachReason";
		public static final String DelayReasonRefFirstSeen = "delayReasonRefFirstSeen";
		public static final String SpecReferralDate = "specReferralDate";
		public static final String ReferredBy = "referredBy";
		public static final String SpecDateFirstSeen = "specDateFirstSeen";
		public static final String SpecOrgCode = "specOrgCode";
		public static final String ClinlInterventionDate = "clinlInterventionDate";
		public static final String ClinInterventionOrgCode = "clinInterventionOrgCode";
		public static final String MDTDiscussInd = "mDTDiscussInd";
		public static final String MDTDiscussDate = "mDTDiscussDate";
		public static final String CancerStatus = "cancerStatus";
		public static final String PrimaryDiagnosis = "primaryDiagnosis";
		public static final String TumourLaterality = "tumourLaterality";
		public static final String DDTDateSurgery = "dDTDateSurgery";
		public static final String DDTDateChemo = "dDTDateChemo";
		public static final String DDTDateTele = "dDTDateTele";
		public static final String DDTDateBrachy = "dDTDateBrachy";
		public static final String DDTDatePalliative = "dDTDatePalliative";
		public static final String DDTDateActiveMon = "dDTDateActiveMon";
		public static final String DDTOrgCode = "dDTOrgCode";
		public static final String WTAdjustmentTreat = "wTAdjustmentTreat";
		public static final String WTAdjustmentReasonTreat = "wTAdjustmentReasonTreat";
		public static final String PlanCancerTreatType = "planCancerTreatType";
		public static final String FirstTreatmentDateSurg = "firstTreatmentDateSurg";
		public static final String FirstTreatmentDateChemo = "firstTreatmentDateChemo";
		public static final String FirstTreatmentDateTele = "firstTreatmentDateTele";
		public static final String FirstTreatmentDateBrachy = "firstTreatmentDateBrachy";
		public static final String FirstTreatmentDateSPCare = "firstTreatmentDateSPCare";
		public static final String FirstTreatmentDateActiveMon = "firstTreatmentDateActiveMon";
		public static final String FirstTreatmentOrgCode = "firstTreatmentOrgCode";
		public static final String WTAdjustFirstTreat = "wTAdjustFirstTreat";
		public static final String WTAdjustmentReasonFT = "wTAdjustmentReasonFT";
		public static final String DelayReasonDTT = "delayReasonDTT";
		public static final String DelayReasonRTT = "delayReasonRTT";
		public static final String DelayCodeDTT = "delayCodeDTT";
		public static final String DelayCodeRTT = "delayCodeRTT";
	}
}

