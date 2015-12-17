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
package ims.core.patient.domain.objects;

/**
 * 
 * @author Sean Nesbitt
 * Generated.
 */


public class PDSPatientUpdate extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1001100024;
	private static final long serialVersionUID = 1001100024L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** Communication Channels to be removed
	  * Collection of ims.core.patient.domain.objects.PDSCommChannelRemoved.
	  */
	private java.util.List commChannels;
	/** Address to be removed
	  * Collection of ims.core.patient.domain.objects.PDSAddr.
	  */
	private java.util.List address;
	/** "added" or "altered". This item cannot be "removed".  */
	private ims.domain.lookups.LookupInstance administrativeGenderCode;
	/** "added" or "altered". This item cannot be "removed".  */
	private ims.domain.lookups.LookupInstance birthTime;
	/** "added" or "altered". This item cannot be "removed".  */
	private ims.domain.lookups.LookupInstance deceasedTime;
	/** "added" or "altered". This item cannot be "removed".  */
	private ims.domain.lookups.LookupInstance languageCodeUpdateMode;
	/** "added" or "altered". This item cannot be "removed".  */
	private ims.domain.lookups.LookupInstance proficiencyLevelCodeUpdateMode;
	/** "added" or "altered". This item cannot be "removed".  */
	private ims.domain.lookups.LookupInstance preferredContactMethodUpdateMode;
	/** "added" or "altered". This item cannot be "removed".  */
	private ims.domain.lookups.LookupInstance preferredContactTimesUpdateMode;
	/** "added" or "altered". This item cannot be "removed".  */
	private ims.domain.lookups.LookupInstance callCentreCallBackConsentUpdateMode;
	/** Names to be removed
	  * Collection of ims.core.patient.domain.objects.PDSNamesRemoved.
	  */
	private java.util.List names;
	/** Nok address removed */
	private ims.core.patient.domain.objects.PDSAddr nokAddress;
	/** Nok relationship added or altered or removed */
	private ims.domain.lookups.LookupInstance nokRelationshipUpdateMode;
	/** Nok Efective dates added or altered or removed */
	private ims.domain.lookups.LookupInstance nokEffectiveDatesUpdateMode;
	/** Nok Contact Rank Update Mode */
	private ims.domain.lookups.LookupInstance nokContactRankUpdateMode;
	/** Nok added or altered or removed */
	private ims.domain.lookups.LookupInstance nokUpdateMode;
	/** Nok Communication Channels
	  * Collection of ims.core.patient.domain.objects.PDSCommChannelRemoved.
	  */
	private java.util.List nokCommChannels;
	/** Nok Language Update Mode added,altered,removed */
	private ims.domain.lookups.LookupInstance nokLanguageCommunicationUpdateMode;
	/** Current update request for PDS */
	private ims.core.patient.domain.objects.PDSGeneralUpdateRequest pDSUpdateRequest;
	/** Relatives and/or Communication channels to be removed
	  * Collection of ims.core.patient.domain.objects.PDSRelativeRemove.
	  */
	private java.util.List relatives;
	/** administrativeGenderCode updateMode attribute to indicate whether the item should be "added" or "altered". This item cannot be "removed".  */
	private ims.domain.lookups.LookupInstance genderUpdateMode;
	/** birthTime updateMode attribute to indicate whether the item should be "added" or "altered". This item cannot be "removed".  */
	private ims.domain.lookups.LookupInstance dateOfBirthUpdateMode;
	/** deceasedTime updateMode attribute to indicate whether the item should be "added" or "altered". This item cannot be "removed".  */
	private ims.domain.lookups.LookupInstance dateOfDeathUpdateMode;
	private ims.domain.lookups.LookupInstance consentUpdateMode;
	private ims.domain.lookups.LookupInstance preferredWrittenCommFormatUpdateMode;
	private ims.domain.lookups.LookupInstance deathNotificationUpdateMode;
	/** Serial Change Number for this update */
	private Integer sCN;
	/** Reference back to Patient */
	private ims.core.patient.domain.objects.Patient patient;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PDSPatientUpdate (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PDSPatientUpdate ()
    {
    	super();
    }
    public PDSPatientUpdate (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.patient.domain.objects.PDSPatientUpdate.class;
	}


	public java.util.List getCommChannels() {
		if ( null == commChannels ) {
			commChannels = new java.util.ArrayList();
		}
		return commChannels;
	}
	public void setCommChannels(java.util.List paramValue) {
		this.commChannels = paramValue;
	}

	public java.util.List getAddress() {
		if ( null == address ) {
			address = new java.util.ArrayList();
		}
		return address;
	}
	public void setAddress(java.util.List paramValue) {
		this.address = paramValue;
	}

	public ims.domain.lookups.LookupInstance getAdministrativeGenderCode() {
		return administrativeGenderCode;
	}
	public void setAdministrativeGenderCode(ims.domain.lookups.LookupInstance administrativeGenderCode) {
		this.administrativeGenderCode = administrativeGenderCode;
	}

	public ims.domain.lookups.LookupInstance getBirthTime() {
		return birthTime;
	}
	public void setBirthTime(ims.domain.lookups.LookupInstance birthTime) {
		this.birthTime = birthTime;
	}

	public ims.domain.lookups.LookupInstance getDeceasedTime() {
		return deceasedTime;
	}
	public void setDeceasedTime(ims.domain.lookups.LookupInstance deceasedTime) {
		this.deceasedTime = deceasedTime;
	}

	public ims.domain.lookups.LookupInstance getLanguageCodeUpdateMode() {
		return languageCodeUpdateMode;
	}
	public void setLanguageCodeUpdateMode(ims.domain.lookups.LookupInstance languageCodeUpdateMode) {
		this.languageCodeUpdateMode = languageCodeUpdateMode;
	}

	public ims.domain.lookups.LookupInstance getProficiencyLevelCodeUpdateMode() {
		return proficiencyLevelCodeUpdateMode;
	}
	public void setProficiencyLevelCodeUpdateMode(ims.domain.lookups.LookupInstance proficiencyLevelCodeUpdateMode) {
		this.proficiencyLevelCodeUpdateMode = proficiencyLevelCodeUpdateMode;
	}

	public ims.domain.lookups.LookupInstance getPreferredContactMethodUpdateMode() {
		return preferredContactMethodUpdateMode;
	}
	public void setPreferredContactMethodUpdateMode(ims.domain.lookups.LookupInstance preferredContactMethodUpdateMode) {
		this.preferredContactMethodUpdateMode = preferredContactMethodUpdateMode;
	}

	public ims.domain.lookups.LookupInstance getPreferredContactTimesUpdateMode() {
		return preferredContactTimesUpdateMode;
	}
	public void setPreferredContactTimesUpdateMode(ims.domain.lookups.LookupInstance preferredContactTimesUpdateMode) {
		this.preferredContactTimesUpdateMode = preferredContactTimesUpdateMode;
	}

	public ims.domain.lookups.LookupInstance getCallCentreCallBackConsentUpdateMode() {
		return callCentreCallBackConsentUpdateMode;
	}
	public void setCallCentreCallBackConsentUpdateMode(ims.domain.lookups.LookupInstance callCentreCallBackConsentUpdateMode) {
		this.callCentreCallBackConsentUpdateMode = callCentreCallBackConsentUpdateMode;
	}

	public java.util.List getNames() {
		if ( null == names ) {
			names = new java.util.ArrayList();
		}
		return names;
	}
	public void setNames(java.util.List paramValue) {
		this.names = paramValue;
	}

	public ims.core.patient.domain.objects.PDSAddr getNokAddress() {
		return nokAddress;
	}
	public void setNokAddress(ims.core.patient.domain.objects.PDSAddr nokAddress) {
		this.nokAddress = nokAddress;
	}

	public ims.domain.lookups.LookupInstance getNokRelationshipUpdateMode() {
		return nokRelationshipUpdateMode;
	}
	public void setNokRelationshipUpdateMode(ims.domain.lookups.LookupInstance nokRelationshipUpdateMode) {
		this.nokRelationshipUpdateMode = nokRelationshipUpdateMode;
	}

	public ims.domain.lookups.LookupInstance getNokEffectiveDatesUpdateMode() {
		return nokEffectiveDatesUpdateMode;
	}
	public void setNokEffectiveDatesUpdateMode(ims.domain.lookups.LookupInstance nokEffectiveDatesUpdateMode) {
		this.nokEffectiveDatesUpdateMode = nokEffectiveDatesUpdateMode;
	}

	public ims.domain.lookups.LookupInstance getNokContactRankUpdateMode() {
		return nokContactRankUpdateMode;
	}
	public void setNokContactRankUpdateMode(ims.domain.lookups.LookupInstance nokContactRankUpdateMode) {
		this.nokContactRankUpdateMode = nokContactRankUpdateMode;
	}

	public ims.domain.lookups.LookupInstance getNokUpdateMode() {
		return nokUpdateMode;
	}
	public void setNokUpdateMode(ims.domain.lookups.LookupInstance nokUpdateMode) {
		this.nokUpdateMode = nokUpdateMode;
	}

	public java.util.List getNokCommChannels() {
		if ( null == nokCommChannels ) {
			nokCommChannels = new java.util.ArrayList();
		}
		return nokCommChannels;
	}
	public void setNokCommChannels(java.util.List paramValue) {
		this.nokCommChannels = paramValue;
	}

	public ims.domain.lookups.LookupInstance getNokLanguageCommunicationUpdateMode() {
		return nokLanguageCommunicationUpdateMode;
	}
	public void setNokLanguageCommunicationUpdateMode(ims.domain.lookups.LookupInstance nokLanguageCommunicationUpdateMode) {
		this.nokLanguageCommunicationUpdateMode = nokLanguageCommunicationUpdateMode;
	}

	public ims.core.patient.domain.objects.PDSGeneralUpdateRequest getPDSUpdateRequest() {
		return pDSUpdateRequest;
	}
	public void setPDSUpdateRequest(ims.core.patient.domain.objects.PDSGeneralUpdateRequest pDSUpdateRequest) {
		this.pDSUpdateRequest = pDSUpdateRequest;
	}

	public java.util.List getRelatives() {
		if ( null == relatives ) {
			relatives = new java.util.ArrayList();
		}
		return relatives;
	}
	public void setRelatives(java.util.List paramValue) {
		this.relatives = paramValue;
	}

	public ims.domain.lookups.LookupInstance getGenderUpdateMode() {
		return genderUpdateMode;
	}
	public void setGenderUpdateMode(ims.domain.lookups.LookupInstance genderUpdateMode) {
		this.genderUpdateMode = genderUpdateMode;
	}

	public ims.domain.lookups.LookupInstance getDateOfBirthUpdateMode() {
		return dateOfBirthUpdateMode;
	}
	public void setDateOfBirthUpdateMode(ims.domain.lookups.LookupInstance dateOfBirthUpdateMode) {
		this.dateOfBirthUpdateMode = dateOfBirthUpdateMode;
	}

	public ims.domain.lookups.LookupInstance getDateOfDeathUpdateMode() {
		return dateOfDeathUpdateMode;
	}
	public void setDateOfDeathUpdateMode(ims.domain.lookups.LookupInstance dateOfDeathUpdateMode) {
		this.dateOfDeathUpdateMode = dateOfDeathUpdateMode;
	}

	public ims.domain.lookups.LookupInstance getConsentUpdateMode() {
		return consentUpdateMode;
	}
	public void setConsentUpdateMode(ims.domain.lookups.LookupInstance consentUpdateMode) {
		this.consentUpdateMode = consentUpdateMode;
	}

	public ims.domain.lookups.LookupInstance getPreferredWrittenCommFormatUpdateMode() {
		return preferredWrittenCommFormatUpdateMode;
	}
	public void setPreferredWrittenCommFormatUpdateMode(ims.domain.lookups.LookupInstance preferredWrittenCommFormatUpdateMode) {
		this.preferredWrittenCommFormatUpdateMode = preferredWrittenCommFormatUpdateMode;
	}

	public ims.domain.lookups.LookupInstance getDeathNotificationUpdateMode() {
		return deathNotificationUpdateMode;
	}
	public void setDeathNotificationUpdateMode(ims.domain.lookups.LookupInstance deathNotificationUpdateMode) {
		this.deathNotificationUpdateMode = deathNotificationUpdateMode;
	}

	public Integer getSCN() {
		return sCN;
	}
	public void setSCN(Integer sCN) {
		this.sCN = sCN;
	}

	public ims.core.patient.domain.objects.Patient getPatient() {
		return patient;
	}
	public void setPatient(ims.core.patient.domain.objects.Patient patient) {
		this.patient = patient;
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
		
		auditStr.append("\r\n*commChannels* :");
		if (commChannels != null)
		{
		int i1=0;
		for (i1=0; i1<commChannels.size(); i1++)
		{
			if (i1 > 0)
				auditStr.append(",");
			ims.core.patient.domain.objects.PDSCommChannelRemoved obj = (ims.core.patient.domain.objects.PDSCommChannelRemoved)commChannels.get(i1);
		    if (obj != null)
			{
				if (i1 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i1 > 0)
			auditStr.append("] " + i1);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*address* :");
		if (address != null)
		{
		int i2=0;
		for (i2=0; i2<address.size(); i2++)
		{
			if (i2 > 0)
				auditStr.append(",");
			ims.core.patient.domain.objects.PDSAddr obj = (ims.core.patient.domain.objects.PDSAddr)address.get(i2);
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
		auditStr.append("\r\n*administrativeGenderCode* :");
		if (administrativeGenderCode != null)
			auditStr.append(administrativeGenderCode.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*birthTime* :");
		if (birthTime != null)
			auditStr.append(birthTime.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*deceasedTime* :");
		if (deceasedTime != null)
			auditStr.append(deceasedTime.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*languageCodeUpdateMode* :");
		if (languageCodeUpdateMode != null)
			auditStr.append(languageCodeUpdateMode.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*proficiencyLevelCodeUpdateMode* :");
		if (proficiencyLevelCodeUpdateMode != null)
			auditStr.append(proficiencyLevelCodeUpdateMode.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*preferredContactMethodUpdateMode* :");
		if (preferredContactMethodUpdateMode != null)
			auditStr.append(preferredContactMethodUpdateMode.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*preferredContactTimesUpdateMode* :");
		if (preferredContactTimesUpdateMode != null)
			auditStr.append(preferredContactTimesUpdateMode.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*callCentreCallBackConsentUpdateMode* :");
		if (callCentreCallBackConsentUpdateMode != null)
			auditStr.append(callCentreCallBackConsentUpdateMode.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*names* :");
		if (names != null)
		{
		int i11=0;
		for (i11=0; i11<names.size(); i11++)
		{
			if (i11 > 0)
				auditStr.append(",");
			ims.core.patient.domain.objects.PDSNamesRemoved obj = (ims.core.patient.domain.objects.PDSNamesRemoved)names.get(i11);
		    if (obj != null)
			{
				if (i11 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i11 > 0)
			auditStr.append("] " + i11);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*nokAddress* :");
		if (nokAddress != null)
		{
			auditStr.append(toShortClassName(nokAddress));
				
		    auditStr.append(nokAddress.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*nokRelationshipUpdateMode* :");
		if (nokRelationshipUpdateMode != null)
			auditStr.append(nokRelationshipUpdateMode.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*nokEffectiveDatesUpdateMode* :");
		if (nokEffectiveDatesUpdateMode != null)
			auditStr.append(nokEffectiveDatesUpdateMode.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*nokContactRankUpdateMode* :");
		if (nokContactRankUpdateMode != null)
			auditStr.append(nokContactRankUpdateMode.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*nokUpdateMode* :");
		if (nokUpdateMode != null)
			auditStr.append(nokUpdateMode.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*nokCommChannels* :");
		if (nokCommChannels != null)
		{
		int i17=0;
		for (i17=0; i17<nokCommChannels.size(); i17++)
		{
			if (i17 > 0)
				auditStr.append(",");
			ims.core.patient.domain.objects.PDSCommChannelRemoved obj = (ims.core.patient.domain.objects.PDSCommChannelRemoved)nokCommChannels.get(i17);
		    if (obj != null)
			{
				if (i17 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i17 > 0)
			auditStr.append("] " + i17);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*nokLanguageCommunicationUpdateMode* :");
		if (nokLanguageCommunicationUpdateMode != null)
			auditStr.append(nokLanguageCommunicationUpdateMode.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*pDSUpdateRequest* :");
		if (pDSUpdateRequest != null)
		{
			auditStr.append(toShortClassName(pDSUpdateRequest));
				
		    auditStr.append(pDSUpdateRequest.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*relatives* :");
		if (relatives != null)
		{
		int i20=0;
		for (i20=0; i20<relatives.size(); i20++)
		{
			if (i20 > 0)
				auditStr.append(",");
			ims.core.patient.domain.objects.PDSRelativeRemove obj = (ims.core.patient.domain.objects.PDSRelativeRemove)relatives.get(i20);
		    if (obj != null)
			{
				if (i20 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i20 > 0)
			auditStr.append("] " + i20);
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*genderUpdateMode* :");
		if (genderUpdateMode != null)
			auditStr.append(genderUpdateMode.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*dateOfBirthUpdateMode* :");
		if (dateOfBirthUpdateMode != null)
			auditStr.append(dateOfBirthUpdateMode.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*dateOfDeathUpdateMode* :");
		if (dateOfDeathUpdateMode != null)
			auditStr.append(dateOfDeathUpdateMode.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*consentUpdateMode* :");
		if (consentUpdateMode != null)
			auditStr.append(consentUpdateMode.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*preferredWrittenCommFormatUpdateMode* :");
		if (preferredWrittenCommFormatUpdateMode != null)
			auditStr.append(preferredWrittenCommFormatUpdateMode.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*deathNotificationUpdateMode* :");
		if (deathNotificationUpdateMode != null)
			auditStr.append(deathNotificationUpdateMode.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*sCN* :");
		auditStr.append(sCN);
	    auditStr.append("; ");
		auditStr.append("\r\n*patient* :");
		if (patient != null)
		{
			auditStr.append(toShortClassName(patient));
				
		    auditStr.append(patient.getId());
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
		
		String keyClassName = "PDSPatientUpdate";
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
		if (this.getCommChannels() != null)
		{
			if (this.getCommChannels().size() > 0 )
			{
			sb.append("<commChannels>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getCommChannels(), domMap));
			sb.append("</commChannels>");		
			}
		}
		if (this.getAddress() != null)
		{
			if (this.getAddress().size() > 0 )
			{
			sb.append("<address>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getAddress(), domMap));
			sb.append("</address>");		
			}
		}
		if (this.getAdministrativeGenderCode() != null)
		{
			sb.append("<administrativeGenderCode>");
			sb.append(this.getAdministrativeGenderCode().toXMLString()); 
			sb.append("</administrativeGenderCode>");		
		}
		if (this.getBirthTime() != null)
		{
			sb.append("<birthTime>");
			sb.append(this.getBirthTime().toXMLString()); 
			sb.append("</birthTime>");		
		}
		if (this.getDeceasedTime() != null)
		{
			sb.append("<deceasedTime>");
			sb.append(this.getDeceasedTime().toXMLString()); 
			sb.append("</deceasedTime>");		
		}
		if (this.getLanguageCodeUpdateMode() != null)
		{
			sb.append("<languageCodeUpdateMode>");
			sb.append(this.getLanguageCodeUpdateMode().toXMLString()); 
			sb.append("</languageCodeUpdateMode>");		
		}
		if (this.getProficiencyLevelCodeUpdateMode() != null)
		{
			sb.append("<proficiencyLevelCodeUpdateMode>");
			sb.append(this.getProficiencyLevelCodeUpdateMode().toXMLString()); 
			sb.append("</proficiencyLevelCodeUpdateMode>");		
		}
		if (this.getPreferredContactMethodUpdateMode() != null)
		{
			sb.append("<preferredContactMethodUpdateMode>");
			sb.append(this.getPreferredContactMethodUpdateMode().toXMLString()); 
			sb.append("</preferredContactMethodUpdateMode>");		
		}
		if (this.getPreferredContactTimesUpdateMode() != null)
		{
			sb.append("<preferredContactTimesUpdateMode>");
			sb.append(this.getPreferredContactTimesUpdateMode().toXMLString()); 
			sb.append("</preferredContactTimesUpdateMode>");		
		}
		if (this.getCallCentreCallBackConsentUpdateMode() != null)
		{
			sb.append("<callCentreCallBackConsentUpdateMode>");
			sb.append(this.getCallCentreCallBackConsentUpdateMode().toXMLString()); 
			sb.append("</callCentreCallBackConsentUpdateMode>");		
		}
		if (this.getNames() != null)
		{
			if (this.getNames().size() > 0 )
			{
			sb.append("<names>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getNames(), domMap));
			sb.append("</names>");		
			}
		}
		if (this.getNokAddress() != null)
		{
			sb.append("<nokAddress>");
			sb.append(this.getNokAddress().toXMLString(domMap)); 	
			sb.append("</nokAddress>");		
		}
		if (this.getNokRelationshipUpdateMode() != null)
		{
			sb.append("<nokRelationshipUpdateMode>");
			sb.append(this.getNokRelationshipUpdateMode().toXMLString()); 
			sb.append("</nokRelationshipUpdateMode>");		
		}
		if (this.getNokEffectiveDatesUpdateMode() != null)
		{
			sb.append("<nokEffectiveDatesUpdateMode>");
			sb.append(this.getNokEffectiveDatesUpdateMode().toXMLString()); 
			sb.append("</nokEffectiveDatesUpdateMode>");		
		}
		if (this.getNokContactRankUpdateMode() != null)
		{
			sb.append("<nokContactRankUpdateMode>");
			sb.append(this.getNokContactRankUpdateMode().toXMLString()); 
			sb.append("</nokContactRankUpdateMode>");		
		}
		if (this.getNokUpdateMode() != null)
		{
			sb.append("<nokUpdateMode>");
			sb.append(this.getNokUpdateMode().toXMLString()); 
			sb.append("</nokUpdateMode>");		
		}
		if (this.getNokCommChannels() != null)
		{
			if (this.getNokCommChannels().size() > 0 )
			{
			sb.append("<nokCommChannels>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getNokCommChannels(), domMap));
			sb.append("</nokCommChannels>");		
			}
		}
		if (this.getNokLanguageCommunicationUpdateMode() != null)
		{
			sb.append("<nokLanguageCommunicationUpdateMode>");
			sb.append(this.getNokLanguageCommunicationUpdateMode().toXMLString()); 
			sb.append("</nokLanguageCommunicationUpdateMode>");		
		}
		if (this.getPDSUpdateRequest() != null)
		{
			sb.append("<pDSUpdateRequest>");
			sb.append(this.getPDSUpdateRequest().toXMLString(domMap)); 	
			sb.append("</pDSUpdateRequest>");		
		}
		if (this.getRelatives() != null)
		{
			if (this.getRelatives().size() > 0 )
			{
			sb.append("<relatives>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getRelatives(), domMap));
			sb.append("</relatives>");		
			}
		}
		if (this.getGenderUpdateMode() != null)
		{
			sb.append("<genderUpdateMode>");
			sb.append(this.getGenderUpdateMode().toXMLString()); 
			sb.append("</genderUpdateMode>");		
		}
		if (this.getDateOfBirthUpdateMode() != null)
		{
			sb.append("<dateOfBirthUpdateMode>");
			sb.append(this.getDateOfBirthUpdateMode().toXMLString()); 
			sb.append("</dateOfBirthUpdateMode>");		
		}
		if (this.getDateOfDeathUpdateMode() != null)
		{
			sb.append("<dateOfDeathUpdateMode>");
			sb.append(this.getDateOfDeathUpdateMode().toXMLString()); 
			sb.append("</dateOfDeathUpdateMode>");		
		}
		if (this.getConsentUpdateMode() != null)
		{
			sb.append("<consentUpdateMode>");
			sb.append(this.getConsentUpdateMode().toXMLString()); 
			sb.append("</consentUpdateMode>");		
		}
		if (this.getPreferredWrittenCommFormatUpdateMode() != null)
		{
			sb.append("<preferredWrittenCommFormatUpdateMode>");
			sb.append(this.getPreferredWrittenCommFormatUpdateMode().toXMLString()); 
			sb.append("</preferredWrittenCommFormatUpdateMode>");		
		}
		if (this.getDeathNotificationUpdateMode() != null)
		{
			sb.append("<deathNotificationUpdateMode>");
			sb.append(this.getDeathNotificationUpdateMode().toXMLString()); 
			sb.append("</deathNotificationUpdateMode>");		
		}
		if (this.getSCN() != null)
		{
			sb.append("<sCN>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSCN().toString()));
			sb.append("</sCN>");		
		}
		if (this.getPatient() != null)
		{
			sb.append("<patient>");
			sb.append(this.getPatient().toXMLString(domMap)); 	
			sb.append("</patient>");		
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
			PDSPatientUpdate domainObject = getPDSPatientUpdatefromXML(itemEl, factory, domMap);

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
			PDSPatientUpdate domainObject = getPDSPatientUpdatefromXML(itemEl, factory, domMap);

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
		
	public static PDSPatientUpdate getPDSPatientUpdatefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPDSPatientUpdatefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PDSPatientUpdate getPDSPatientUpdatefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PDSPatientUpdate.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PDSPatientUpdate.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PDSPatientUpdate class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PDSPatientUpdate)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PDSPatientUpdate.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PDSPatientUpdate ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PDSPatientUpdate)factory.getImportedDomainObject(PDSPatientUpdate.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PDSPatientUpdate();
		}
		String keyClassName = "PDSPatientUpdate";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PDSPatientUpdate)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PDSPatientUpdate obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("commChannels");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setCommChannels(ims.core.patient.domain.objects.PDSCommChannelRemoved.fromListXMLString(fldEl, factory, obj.getCommChannels(), domMap));
		}
		fldEl = el.element("address");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setAddress(ims.core.patient.domain.objects.PDSAddr.fromListXMLString(fldEl, factory, obj.getAddress(), domMap));
		}
		fldEl = el.element("administrativeGenderCode");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAdministrativeGenderCode(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("birthTime");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setBirthTime(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("deceasedTime");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDeceasedTime(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("languageCodeUpdateMode");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setLanguageCodeUpdateMode(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("proficiencyLevelCodeUpdateMode");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setProficiencyLevelCodeUpdateMode(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("preferredContactMethodUpdateMode");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPreferredContactMethodUpdateMode(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("preferredContactTimesUpdateMode");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPreferredContactTimesUpdateMode(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("callCentreCallBackConsentUpdateMode");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setCallCentreCallBackConsentUpdateMode(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("names");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setNames(ims.core.patient.domain.objects.PDSNamesRemoved.fromListXMLString(fldEl, factory, obj.getNames(), domMap));
		}
		fldEl = el.element("nokAddress");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setNokAddress(ims.core.patient.domain.objects.PDSAddr.getPDSAddrfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("nokRelationshipUpdateMode");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setNokRelationshipUpdateMode(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("nokEffectiveDatesUpdateMode");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setNokEffectiveDatesUpdateMode(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("nokContactRankUpdateMode");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setNokContactRankUpdateMode(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("nokUpdateMode");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setNokUpdateMode(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("nokCommChannels");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setNokCommChannels(ims.core.patient.domain.objects.PDSCommChannelRemoved.fromListXMLString(fldEl, factory, obj.getNokCommChannels(), domMap));
		}
		fldEl = el.element("nokLanguageCommunicationUpdateMode");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setNokLanguageCommunicationUpdateMode(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("pDSUpdateRequest");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPDSUpdateRequest(ims.core.patient.domain.objects.PDSGeneralUpdateRequest.getPDSGeneralUpdateRequestfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("relatives");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setRelatives(ims.core.patient.domain.objects.PDSRelativeRemove.fromListXMLString(fldEl, factory, obj.getRelatives(), domMap));
		}
		fldEl = el.element("genderUpdateMode");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setGenderUpdateMode(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("dateOfBirthUpdateMode");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDateOfBirthUpdateMode(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("dateOfDeathUpdateMode");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDateOfDeathUpdateMode(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("consentUpdateMode");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setConsentUpdateMode(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("preferredWrittenCommFormatUpdateMode");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setPreferredWrittenCommFormatUpdateMode(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("deathNotificationUpdateMode");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDeathNotificationUpdateMode(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("sCN");
		if(fldEl != null)
		{	
    		obj.setSCN(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("patient");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPatient(ims.core.patient.domain.objects.Patient.getPatientfromXML(fldEl, factory, domMap)); 
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "commChannels"
		, "address"
		, "names"
		, "nokCommChannels"
		, "relatives"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String CommChannels = "commChannels";
		public static final String Address = "address";
		public static final String AdministrativeGenderCode = "administrativeGenderCode";
		public static final String BirthTime = "birthTime";
		public static final String DeceasedTime = "deceasedTime";
		public static final String LanguageCodeUpdateMode = "languageCodeUpdateMode";
		public static final String ProficiencyLevelCodeUpdateMode = "proficiencyLevelCodeUpdateMode";
		public static final String PreferredContactMethodUpdateMode = "preferredContactMethodUpdateMode";
		public static final String PreferredContactTimesUpdateMode = "preferredContactTimesUpdateMode";
		public static final String CallCentreCallBackConsentUpdateMode = "callCentreCallBackConsentUpdateMode";
		public static final String Names = "names";
		public static final String NokAddress = "nokAddress";
		public static final String NokRelationshipUpdateMode = "nokRelationshipUpdateMode";
		public static final String NokEffectiveDatesUpdateMode = "nokEffectiveDatesUpdateMode";
		public static final String NokContactRankUpdateMode = "nokContactRankUpdateMode";
		public static final String NokUpdateMode = "nokUpdateMode";
		public static final String NokCommChannels = "nokCommChannels";
		public static final String NokLanguageCommunicationUpdateMode = "nokLanguageCommunicationUpdateMode";
		public static final String PDSUpdateRequest = "pDSUpdateRequest";
		public static final String Relatives = "relatives";
		public static final String GenderUpdateMode = "genderUpdateMode";
		public static final String DateOfBirthUpdateMode = "dateOfBirthUpdateMode";
		public static final String DateOfDeathUpdateMode = "dateOfDeathUpdateMode";
		public static final String ConsentUpdateMode = "consentUpdateMode";
		public static final String PreferredWrittenCommFormatUpdateMode = "preferredWrittenCommFormatUpdateMode";
		public static final String DeathNotificationUpdateMode = "deathNotificationUpdateMode";
		public static final String SCN = "sCN";
		public static final String Patient = "patient";
	}
}

