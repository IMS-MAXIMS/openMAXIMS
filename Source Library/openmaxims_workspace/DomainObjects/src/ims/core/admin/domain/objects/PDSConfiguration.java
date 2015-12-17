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
package ims.core.admin.domain.objects;

/**
 * 
 * @author Sean Nesbitt
 * Generated.
 */


public class PDSConfiguration extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1004100075;
	private static final long serialVersionUID = 1004100075L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	/** DOB Date range for Advanced Trace +- days */
	private Integer dOB_DATE_RANGE;
	/** DOD Date range for Advanced Trace +- days */
	private Integer dOD_DATE_RANGE;
	/** Indicate to PDS to search/ignore history for Alphanumeric Searches */
	private Boolean tRACE_ADVANCED_IGNORE_HISTORY;
	/** Indicate to PDS to return historic data for an Alphanumeric search */
	private Boolean tRACE_HISTORY_DATA_INDICATOR;
	/** Use LPI Cross check. If false crosscheck will be performed on PDS initially before Trace if no SCN is available. If set to TRUE, then the cross check will be performed on the LPI after the PDS Trace if no SCN is available locally */
	private Boolean uSE_LPI_CROSSCHECK;
	/** To indicate if MAXIMS should decouple a local demographics record on receipt of a deceased patient. */
	private Boolean dECOUPLE_ON_DECEASE;
	/** To indicate if MAXIMS should notify MAXIMS Back Office Administrator on receipt of a deceased patient. */
	private Boolean nOTIFY_ON_DECEASE;
	/** No fixed abode postcode to be used for defaulting on Demographics Forms. - ZZ99 */
	private String nO_FIXED_ABODE_POSTCODE;
	/** Decouple the LPI record if any updates are performed locally that require an interactive synchronise. If this is set, in such cases a back office item will be created to process the interactive synchronise. */
	private Boolean dECOUPLE_ON_SYNC_REQUIRED;
	/** Advanced Search Timer interval */
	private Integer aDVANCED_SEARCH_TIMER_INTERVAL;
	/** BackOffice Applciation User  for notifications */
	private ims.core.configuration.domain.objects.AppUser pDS_BACKOFFICE_NOTIFICATI;
	/** The number of days from Today to process PDS Batch Trace queries for Appointments */
	private Integer numOfDaysAppointBatchTrace;
	/** The number of days from Today to process PDS Batch Trace queries for TCI lists */
	private Integer numOfDaysTCIBatchTrace;
	/** Number of days since last PDS crosscheck */
	private Integer numOfDaysForNextPDSCheck;
	/** Will allow interactive synchronisation with back office worklist - default true */
	private Boolean sYNCHRONISE_WITH_BACKOFFICE;
	/** fromAsid */
	private String fromPDSAccreditedSystemId;
	/** toAsid */
	private String toPDSAccreditedSystemId;
	/** Full path and filename of the PDS Configuration File - replacement of pdsgw_configuration.xml */
	private String pDS_CONFIG_FILE;
	/** If PDS_STORE_MESSAGE is set to TRUE, this should be set pointing to a store folder. Inbound messages will be held in inbound folder off this, and outbound in outbound folder */
	private String pDS_STORE_MESSAGE_LOC;
	/** Controls whether PDS messages are stored by the application. */
	private Boolean pDS_STORE_MESSAGE;
	/** Determine whether to start the PdsGw Engine regardless of whether it is specified in web.xml or not */
	private Boolean sTART_PDS_GATEWAY;
	/** PDS Message Handler repository location. */
	private String pDS_MSH_REPOSITORY;
	/** URL of PDS MSH Servlet */
	private String pDS_MSH_URL;
	/** Create and Display Back Office Notifications. Default False */
	private Boolean cREATE_BO_NOTIFICATIONS;
	/** Spine SDS Host */
	private String sDSHost;
	/** Spine SDS Port */
	private String sDSPort;
	/** PDS URL for Synchronous calls */
	private String pDS_URL;
	/** PDS HOST for Synchronous calls */
	private String pDS_HOST;
	/** Controls whether Synchronous PDS messages are stored by the application. */
	private Boolean pDS_STORE_SYNC_MESSAGE;
	/** If PDS_STORE_SYNC_MESSAGE is set to TRUE, this should be set pointing to a store folder. Inbound messages will be held in inbound folder off this, and outbound in outbound folder */
	private String pDS_STORE_SYNC_MESSAGE_LOC;
	/** explanatory text for consent mechanism and its effect to the user */
	private String consentChangeMessage;
	/** Inactive Patient Background colour */
	private ims.framework.utils.Color inactivePatientRecordBgColour;
	/** PDS_AUTHENTICATION */
	private Boolean pDS_AUTHENTICATION;
	/** PDs Search For Patient */
	private String rBAC_PdsSearchForPatient;
	/** PDS search for Patient Advanced capability */
	private String rBAC_PdsSearchPatientAdvanced;
	/** PDS Retrieval */
	private String rBAC_PdsRetrieval;
	/** Access Sensitive Data */
	private String rBAC_AccessSensitiveData;
	/** Amend Patient */
	private String rBAC_AmendPatient;
	/** Control Consent */
	private String rBAC_ControlConsent;
	/** Amend Patient Deceased Patient */
	private String rBAC_AmendPatientDecease;
	/** PDs Postcode Search */
	private String rBAC_PostcodeSearch;
	private Boolean pDS_DISPLAY_CONSENT;
	private ims.domain.lookups.LookupInstance dOB_DATE_RANGE_TYPE;
	private ims.domain.lookups.LookupInstance dOD_DATE_RANGE_TYPE;
	/** PDS Touch Point Booking of an Outpatient Appointment */
	private Boolean tP_BookOutpatientAppt;
	/** Booking of a Ward Attender Appointment  */
	private Boolean tP_BookWardAttenderAppt;
	/** Creation of a TCI (which includes Theatre booking)  */
	private Boolean tP_CreateTCIAndTheatreBooking;
	/** Any admission */
	private Boolean tP_AnyAdmission;
	/** Any appointment arrival */
	private Boolean tP_AnyApptArrival;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public PDSConfiguration (Integer id, int ver)
    {
    	super(id, ver);
    }
    public PDSConfiguration ()
    {
    	super();
    }
    public PDSConfiguration (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.admin.domain.objects.PDSConfiguration.class;
	}


	public Integer getDOB_DATE_RANGE() {
		return dOB_DATE_RANGE;
	}
	public void setDOB_DATE_RANGE(Integer dOB_DATE_RANGE) {
		this.dOB_DATE_RANGE = dOB_DATE_RANGE;
	}

	public Integer getDOD_DATE_RANGE() {
		return dOD_DATE_RANGE;
	}
	public void setDOD_DATE_RANGE(Integer dOD_DATE_RANGE) {
		this.dOD_DATE_RANGE = dOD_DATE_RANGE;
	}

	public Boolean isTRACE_ADVANCED_IGNORE_HISTORY() {
		return tRACE_ADVANCED_IGNORE_HISTORY;
	}
	public void setTRACE_ADVANCED_IGNORE_HISTORY(Boolean tRACE_ADVANCED_IGNORE_HISTORY) {
		this.tRACE_ADVANCED_IGNORE_HISTORY = tRACE_ADVANCED_IGNORE_HISTORY;
	}

	public Boolean isTRACE_HISTORY_DATA_INDICATOR() {
		return tRACE_HISTORY_DATA_INDICATOR;
	}
	public void setTRACE_HISTORY_DATA_INDICATOR(Boolean tRACE_HISTORY_DATA_INDICATOR) {
		this.tRACE_HISTORY_DATA_INDICATOR = tRACE_HISTORY_DATA_INDICATOR;
	}

	public Boolean isUSE_LPI_CROSSCHECK() {
		return uSE_LPI_CROSSCHECK;
	}
	public void setUSE_LPI_CROSSCHECK(Boolean uSE_LPI_CROSSCHECK) {
		this.uSE_LPI_CROSSCHECK = uSE_LPI_CROSSCHECK;
	}

	public Boolean isDECOUPLE_ON_DECEASE() {
		return dECOUPLE_ON_DECEASE;
	}
	public void setDECOUPLE_ON_DECEASE(Boolean dECOUPLE_ON_DECEASE) {
		this.dECOUPLE_ON_DECEASE = dECOUPLE_ON_DECEASE;
	}

	public Boolean isNOTIFY_ON_DECEASE() {
		return nOTIFY_ON_DECEASE;
	}
	public void setNOTIFY_ON_DECEASE(Boolean nOTIFY_ON_DECEASE) {
		this.nOTIFY_ON_DECEASE = nOTIFY_ON_DECEASE;
	}

	public String getNO_FIXED_ABODE_POSTCODE() {
		return nO_FIXED_ABODE_POSTCODE;
	}
	public void setNO_FIXED_ABODE_POSTCODE(String nO_FIXED_ABODE_POSTCODE) {
		if ( null != nO_FIXED_ABODE_POSTCODE && nO_FIXED_ABODE_POSTCODE.length() > 10 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for nO_FIXED_ABODE_POSTCODE. Tried to set value: "+
				nO_FIXED_ABODE_POSTCODE);
		}
		this.nO_FIXED_ABODE_POSTCODE = nO_FIXED_ABODE_POSTCODE;
	}

	public Boolean isDECOUPLE_ON_SYNC_REQUIRED() {
		return dECOUPLE_ON_SYNC_REQUIRED;
	}
	public void setDECOUPLE_ON_SYNC_REQUIRED(Boolean dECOUPLE_ON_SYNC_REQUIRED) {
		this.dECOUPLE_ON_SYNC_REQUIRED = dECOUPLE_ON_SYNC_REQUIRED;
	}

	public Integer getADVANCED_SEARCH_TIMER_INTERVAL() {
		return aDVANCED_SEARCH_TIMER_INTERVAL;
	}
	public void setADVANCED_SEARCH_TIMER_INTERVAL(Integer aDVANCED_SEARCH_TIMER_INTERVAL) {
		this.aDVANCED_SEARCH_TIMER_INTERVAL = aDVANCED_SEARCH_TIMER_INTERVAL;
	}

	public ims.core.configuration.domain.objects.AppUser getPDS_BACKOFFICE_NOTIFICATI() {
		return pDS_BACKOFFICE_NOTIFICATI;
	}
	public void setPDS_BACKOFFICE_NOTIFICATI(ims.core.configuration.domain.objects.AppUser pDS_BACKOFFICE_NOTIFICATI) {
		this.pDS_BACKOFFICE_NOTIFICATI = pDS_BACKOFFICE_NOTIFICATI;
	}

	public Integer getNumOfDaysAppointBatchTrace() {
		return numOfDaysAppointBatchTrace;
	}
	public void setNumOfDaysAppointBatchTrace(Integer numOfDaysAppointBatchTrace) {
		this.numOfDaysAppointBatchTrace = numOfDaysAppointBatchTrace;
	}

	public Integer getNumOfDaysTCIBatchTrace() {
		return numOfDaysTCIBatchTrace;
	}
	public void setNumOfDaysTCIBatchTrace(Integer numOfDaysTCIBatchTrace) {
		this.numOfDaysTCIBatchTrace = numOfDaysTCIBatchTrace;
	}

	public Integer getNumOfDaysForNextPDSCheck() {
		return numOfDaysForNextPDSCheck;
	}
	public void setNumOfDaysForNextPDSCheck(Integer numOfDaysForNextPDSCheck) {
		this.numOfDaysForNextPDSCheck = numOfDaysForNextPDSCheck;
	}

	public Boolean isSYNCHRONISE_WITH_BACKOFFICE() {
		return sYNCHRONISE_WITH_BACKOFFICE;
	}
	public void setSYNCHRONISE_WITH_BACKOFFICE(Boolean sYNCHRONISE_WITH_BACKOFFICE) {
		this.sYNCHRONISE_WITH_BACKOFFICE = sYNCHRONISE_WITH_BACKOFFICE;
	}

	public String getFromPDSAccreditedSystemId() {
		return fromPDSAccreditedSystemId;
	}
	public void setFromPDSAccreditedSystemId(String fromPDSAccreditedSystemId) {
		if ( null != fromPDSAccreditedSystemId && fromPDSAccreditedSystemId.length() > 20 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for fromPDSAccreditedSystemId. Tried to set value: "+
				fromPDSAccreditedSystemId);
		}
		this.fromPDSAccreditedSystemId = fromPDSAccreditedSystemId;
	}

	public String getToPDSAccreditedSystemId() {
		return toPDSAccreditedSystemId;
	}
	public void setToPDSAccreditedSystemId(String toPDSAccreditedSystemId) {
		if ( null != toPDSAccreditedSystemId && toPDSAccreditedSystemId.length() > 20 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for toPDSAccreditedSystemId. Tried to set value: "+
				toPDSAccreditedSystemId);
		}
		this.toPDSAccreditedSystemId = toPDSAccreditedSystemId;
	}

	public String getPDS_CONFIG_FILE() {
		return pDS_CONFIG_FILE;
	}
	public void setPDS_CONFIG_FILE(String pDS_CONFIG_FILE) {
		if ( null != pDS_CONFIG_FILE && pDS_CONFIG_FILE.length() > 200 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for pDS_CONFIG_FILE. Tried to set value: "+
				pDS_CONFIG_FILE);
		}
		this.pDS_CONFIG_FILE = pDS_CONFIG_FILE;
	}

	public String getPDS_STORE_MESSAGE_LOC() {
		return pDS_STORE_MESSAGE_LOC;
	}
	public void setPDS_STORE_MESSAGE_LOC(String pDS_STORE_MESSAGE_LOC) {
		if ( null != pDS_STORE_MESSAGE_LOC && pDS_STORE_MESSAGE_LOC.length() > 250 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for pDS_STORE_MESSAGE_LOC. Tried to set value: "+
				pDS_STORE_MESSAGE_LOC);
		}
		this.pDS_STORE_MESSAGE_LOC = pDS_STORE_MESSAGE_LOC;
	}

	public Boolean isPDS_STORE_MESSAGE() {
		return pDS_STORE_MESSAGE;
	}
	public void setPDS_STORE_MESSAGE(Boolean pDS_STORE_MESSAGE) {
		this.pDS_STORE_MESSAGE = pDS_STORE_MESSAGE;
	}

	public Boolean isSTART_PDS_GATEWAY() {
		return sTART_PDS_GATEWAY;
	}
	public void setSTART_PDS_GATEWAY(Boolean sTART_PDS_GATEWAY) {
		this.sTART_PDS_GATEWAY = sTART_PDS_GATEWAY;
	}

	public String getPDS_MSH_REPOSITORY() {
		return pDS_MSH_REPOSITORY;
	}
	public void setPDS_MSH_REPOSITORY(String pDS_MSH_REPOSITORY) {
		if ( null != pDS_MSH_REPOSITORY && pDS_MSH_REPOSITORY.length() > 250 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for pDS_MSH_REPOSITORY. Tried to set value: "+
				pDS_MSH_REPOSITORY);
		}
		this.pDS_MSH_REPOSITORY = pDS_MSH_REPOSITORY;
	}

	public String getPDS_MSH_URL() {
		return pDS_MSH_URL;
	}
	public void setPDS_MSH_URL(String pDS_MSH_URL) {
		if ( null != pDS_MSH_URL && pDS_MSH_URL.length() > 250 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for pDS_MSH_URL. Tried to set value: "+
				pDS_MSH_URL);
		}
		this.pDS_MSH_URL = pDS_MSH_URL;
	}

	public Boolean isCREATE_BO_NOTIFICATIONS() {
		return cREATE_BO_NOTIFICATIONS;
	}
	public void setCREATE_BO_NOTIFICATIONS(Boolean cREATE_BO_NOTIFICATIONS) {
		this.cREATE_BO_NOTIFICATIONS = cREATE_BO_NOTIFICATIONS;
	}

	public String getSDSHost() {
		return sDSHost;
	}
	public void setSDSHost(String sDSHost) {
		if ( null != sDSHost && sDSHost.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for sDSHost. Tried to set value: "+
				sDSHost);
		}
		this.sDSHost = sDSHost;
	}

	public String getSDSPort() {
		return sDSPort;
	}
	public void setSDSPort(String sDSPort) {
		if ( null != sDSPort && sDSPort.length() > 20 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for sDSPort. Tried to set value: "+
				sDSPort);
		}
		this.sDSPort = sDSPort;
	}

	public String getPDS_URL() {
		return pDS_URL;
	}
	public void setPDS_URL(String pDS_URL) {
		if ( null != pDS_URL && pDS_URL.length() > 200 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for pDS_URL. Tried to set value: "+
				pDS_URL);
		}
		this.pDS_URL = pDS_URL;
	}

	public String getPDS_HOST() {
		return pDS_HOST;
	}
	public void setPDS_HOST(String pDS_HOST) {
		if ( null != pDS_HOST && pDS_HOST.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for pDS_HOST. Tried to set value: "+
				pDS_HOST);
		}
		this.pDS_HOST = pDS_HOST;
	}

	public Boolean isPDS_STORE_SYNC_MESSAGE() {
		return pDS_STORE_SYNC_MESSAGE;
	}
	public void setPDS_STORE_SYNC_MESSAGE(Boolean pDS_STORE_SYNC_MESSAGE) {
		this.pDS_STORE_SYNC_MESSAGE = pDS_STORE_SYNC_MESSAGE;
	}

	public String getPDS_STORE_SYNC_MESSAGE_LOC() {
		return pDS_STORE_SYNC_MESSAGE_LOC;
	}
	public void setPDS_STORE_SYNC_MESSAGE_LOC(String pDS_STORE_SYNC_MESSAGE_LOC) {
		if ( null != pDS_STORE_SYNC_MESSAGE_LOC && pDS_STORE_SYNC_MESSAGE_LOC.length() > 250 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for pDS_STORE_SYNC_MESSAGE_LOC. Tried to set value: "+
				pDS_STORE_SYNC_MESSAGE_LOC);
		}
		this.pDS_STORE_SYNC_MESSAGE_LOC = pDS_STORE_SYNC_MESSAGE_LOC;
	}

	public String getConsentChangeMessage() {
		return consentChangeMessage;
	}
	public void setConsentChangeMessage(String consentChangeMessage) {
		if ( null != consentChangeMessage && consentChangeMessage.length() > 400 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for consentChangeMessage. Tried to set value: "+
				consentChangeMessage);
		}
		this.consentChangeMessage = consentChangeMessage;
	}

	public ims.framework.utils.Color getInactivePatientRecordBgColour() {
		return inactivePatientRecordBgColour;
	}
	public void setInactivePatientRecordBgColour(ims.framework.utils.Color inactivePatientRecordBgColour) {
		this.inactivePatientRecordBgColour = inactivePatientRecordBgColour;
	}

	public Boolean isPDS_AUTHENTICATION() {
		return pDS_AUTHENTICATION;
	}
	public void setPDS_AUTHENTICATION(Boolean pDS_AUTHENTICATION) {
		this.pDS_AUTHENTICATION = pDS_AUTHENTICATION;
	}

	public String getRBAC_PdsSearchForPatient() {
		return rBAC_PdsSearchForPatient;
	}
	public void setRBAC_PdsSearchForPatient(String rBAC_PdsSearchForPatient) {
		if ( null != rBAC_PdsSearchForPatient && rBAC_PdsSearchForPatient.length() > 10 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for rBAC_PdsSearchForPatient. Tried to set value: "+
				rBAC_PdsSearchForPatient);
		}
		this.rBAC_PdsSearchForPatient = rBAC_PdsSearchForPatient;
	}

	public String getRBAC_PdsSearchPatientAdvanced() {
		return rBAC_PdsSearchPatientAdvanced;
	}
	public void setRBAC_PdsSearchPatientAdvanced(String rBAC_PdsSearchPatientAdvanced) {
		if ( null != rBAC_PdsSearchPatientAdvanced && rBAC_PdsSearchPatientAdvanced.length() > 10 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for rBAC_PdsSearchPatientAdvanced. Tried to set value: "+
				rBAC_PdsSearchPatientAdvanced);
		}
		this.rBAC_PdsSearchPatientAdvanced = rBAC_PdsSearchPatientAdvanced;
	}

	public String getRBAC_PdsRetrieval() {
		return rBAC_PdsRetrieval;
	}
	public void setRBAC_PdsRetrieval(String rBAC_PdsRetrieval) {
		if ( null != rBAC_PdsRetrieval && rBAC_PdsRetrieval.length() > 10 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for rBAC_PdsRetrieval. Tried to set value: "+
				rBAC_PdsRetrieval);
		}
		this.rBAC_PdsRetrieval = rBAC_PdsRetrieval;
	}

	public String getRBAC_AccessSensitiveData() {
		return rBAC_AccessSensitiveData;
	}
	public void setRBAC_AccessSensitiveData(String rBAC_AccessSensitiveData) {
		if ( null != rBAC_AccessSensitiveData && rBAC_AccessSensitiveData.length() > 10 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for rBAC_AccessSensitiveData. Tried to set value: "+
				rBAC_AccessSensitiveData);
		}
		this.rBAC_AccessSensitiveData = rBAC_AccessSensitiveData;
	}

	public String getRBAC_AmendPatient() {
		return rBAC_AmendPatient;
	}
	public void setRBAC_AmendPatient(String rBAC_AmendPatient) {
		if ( null != rBAC_AmendPatient && rBAC_AmendPatient.length() > 10 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for rBAC_AmendPatient. Tried to set value: "+
				rBAC_AmendPatient);
		}
		this.rBAC_AmendPatient = rBAC_AmendPatient;
	}

	public String getRBAC_ControlConsent() {
		return rBAC_ControlConsent;
	}
	public void setRBAC_ControlConsent(String rBAC_ControlConsent) {
		if ( null != rBAC_ControlConsent && rBAC_ControlConsent.length() > 10 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for rBAC_ControlConsent. Tried to set value: "+
				rBAC_ControlConsent);
		}
		this.rBAC_ControlConsent = rBAC_ControlConsent;
	}

	public String getRBAC_AmendPatientDecease() {
		return rBAC_AmendPatientDecease;
	}
	public void setRBAC_AmendPatientDecease(String rBAC_AmendPatientDecease) {
		if ( null != rBAC_AmendPatientDecease && rBAC_AmendPatientDecease.length() > 10 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for rBAC_AmendPatientDecease. Tried to set value: "+
				rBAC_AmendPatientDecease);
		}
		this.rBAC_AmendPatientDecease = rBAC_AmendPatientDecease;
	}

	public String getRBAC_PostcodeSearch() {
		return rBAC_PostcodeSearch;
	}
	public void setRBAC_PostcodeSearch(String rBAC_PostcodeSearch) {
		if ( null != rBAC_PostcodeSearch && rBAC_PostcodeSearch.length() > 10 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for rBAC_PostcodeSearch. Tried to set value: "+
				rBAC_PostcodeSearch);
		}
		this.rBAC_PostcodeSearch = rBAC_PostcodeSearch;
	}

	public Boolean isPDS_DISPLAY_CONSENT() {
		return pDS_DISPLAY_CONSENT;
	}
	public void setPDS_DISPLAY_CONSENT(Boolean pDS_DISPLAY_CONSENT) {
		this.pDS_DISPLAY_CONSENT = pDS_DISPLAY_CONSENT;
	}

	public ims.domain.lookups.LookupInstance getDOB_DATE_RANGE_TYPE() {
		return dOB_DATE_RANGE_TYPE;
	}
	public void setDOB_DATE_RANGE_TYPE(ims.domain.lookups.LookupInstance dOB_DATE_RANGE_TYPE) {
		this.dOB_DATE_RANGE_TYPE = dOB_DATE_RANGE_TYPE;
	}

	public ims.domain.lookups.LookupInstance getDOD_DATE_RANGE_TYPE() {
		return dOD_DATE_RANGE_TYPE;
	}
	public void setDOD_DATE_RANGE_TYPE(ims.domain.lookups.LookupInstance dOD_DATE_RANGE_TYPE) {
		this.dOD_DATE_RANGE_TYPE = dOD_DATE_RANGE_TYPE;
	}

	public Boolean isTP_BookOutpatientAppt() {
		return tP_BookOutpatientAppt;
	}
	public void setTP_BookOutpatientAppt(Boolean tP_BookOutpatientAppt) {
		this.tP_BookOutpatientAppt = tP_BookOutpatientAppt;
	}

	public Boolean isTP_BookWardAttenderAppt() {
		return tP_BookWardAttenderAppt;
	}
	public void setTP_BookWardAttenderAppt(Boolean tP_BookWardAttenderAppt) {
		this.tP_BookWardAttenderAppt = tP_BookWardAttenderAppt;
	}

	public Boolean isTP_CreateTCIAndTheatreBooking() {
		return tP_CreateTCIAndTheatreBooking;
	}
	public void setTP_CreateTCIAndTheatreBooking(Boolean tP_CreateTCIAndTheatreBooking) {
		this.tP_CreateTCIAndTheatreBooking = tP_CreateTCIAndTheatreBooking;
	}

	public Boolean isTP_AnyAdmission() {
		return tP_AnyAdmission;
	}
	public void setTP_AnyAdmission(Boolean tP_AnyAdmission) {
		this.tP_AnyAdmission = tP_AnyAdmission;
	}

	public Boolean isTP_AnyApptArrival() {
		return tP_AnyApptArrival;
	}
	public void setTP_AnyApptArrival(Boolean tP_AnyApptArrival) {
		this.tP_AnyApptArrival = tP_AnyApptArrival;
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
		
		auditStr.append("\r\n*dOB_DATE_RANGE* :");
		auditStr.append(dOB_DATE_RANGE);
	    auditStr.append("; ");
		auditStr.append("\r\n*dOD_DATE_RANGE* :");
		auditStr.append(dOD_DATE_RANGE);
	    auditStr.append("; ");
		auditStr.append("\r\n*tRACE_ADVANCED_IGNORE_HISTORY* :");
		auditStr.append(tRACE_ADVANCED_IGNORE_HISTORY);
	    auditStr.append("; ");
		auditStr.append("\r\n*tRACE_HISTORY_DATA_INDICATOR* :");
		auditStr.append(tRACE_HISTORY_DATA_INDICATOR);
	    auditStr.append("; ");
		auditStr.append("\r\n*uSE_LPI_CROSSCHECK* :");
		auditStr.append(uSE_LPI_CROSSCHECK);
	    auditStr.append("; ");
		auditStr.append("\r\n*dECOUPLE_ON_DECEASE* :");
		auditStr.append(dECOUPLE_ON_DECEASE);
	    auditStr.append("; ");
		auditStr.append("\r\n*nOTIFY_ON_DECEASE* :");
		auditStr.append(nOTIFY_ON_DECEASE);
	    auditStr.append("; ");
		auditStr.append("\r\n*nO_FIXED_ABODE_POSTCODE* :");
		auditStr.append(nO_FIXED_ABODE_POSTCODE);
	    auditStr.append("; ");
		auditStr.append("\r\n*dECOUPLE_ON_SYNC_REQUIRED* :");
		auditStr.append(dECOUPLE_ON_SYNC_REQUIRED);
	    auditStr.append("; ");
		auditStr.append("\r\n*aDVANCED_SEARCH_TIMER_INTERVAL* :");
		auditStr.append(aDVANCED_SEARCH_TIMER_INTERVAL);
	    auditStr.append("; ");
		auditStr.append("\r\n*pDS_BACKOFFICE_NOTIFICATI* :");
		if (pDS_BACKOFFICE_NOTIFICATI != null)
		{
			auditStr.append(toShortClassName(pDS_BACKOFFICE_NOTIFICATI));
				
		    auditStr.append(pDS_BACKOFFICE_NOTIFICATI.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*numOfDaysAppointBatchTrace* :");
		auditStr.append(numOfDaysAppointBatchTrace);
	    auditStr.append("; ");
		auditStr.append("\r\n*numOfDaysTCIBatchTrace* :");
		auditStr.append(numOfDaysTCIBatchTrace);
	    auditStr.append("; ");
		auditStr.append("\r\n*numOfDaysForNextPDSCheck* :");
		auditStr.append(numOfDaysForNextPDSCheck);
	    auditStr.append("; ");
		auditStr.append("\r\n*sYNCHRONISE_WITH_BACKOFFICE* :");
		auditStr.append(sYNCHRONISE_WITH_BACKOFFICE);
	    auditStr.append("; ");
		auditStr.append("\r\n*fromPDSAccreditedSystemId* :");
		auditStr.append(fromPDSAccreditedSystemId);
	    auditStr.append("; ");
		auditStr.append("\r\n*toPDSAccreditedSystemId* :");
		auditStr.append(toPDSAccreditedSystemId);
	    auditStr.append("; ");
		auditStr.append("\r\n*pDS_CONFIG_FILE* :");
		auditStr.append(pDS_CONFIG_FILE);
	    auditStr.append("; ");
		auditStr.append("\r\n*pDS_STORE_MESSAGE_LOC* :");
		auditStr.append(pDS_STORE_MESSAGE_LOC);
	    auditStr.append("; ");
		auditStr.append("\r\n*pDS_STORE_MESSAGE* :");
		auditStr.append(pDS_STORE_MESSAGE);
	    auditStr.append("; ");
		auditStr.append("\r\n*sTART_PDS_GATEWAY* :");
		auditStr.append(sTART_PDS_GATEWAY);
	    auditStr.append("; ");
		auditStr.append("\r\n*pDS_MSH_REPOSITORY* :");
		auditStr.append(pDS_MSH_REPOSITORY);
	    auditStr.append("; ");
		auditStr.append("\r\n*pDS_MSH_URL* :");
		auditStr.append(pDS_MSH_URL);
	    auditStr.append("; ");
		auditStr.append("\r\n*cREATE_BO_NOTIFICATIONS* :");
		auditStr.append(cREATE_BO_NOTIFICATIONS);
	    auditStr.append("; ");
		auditStr.append("\r\n*sDSHost* :");
		auditStr.append(sDSHost);
	    auditStr.append("; ");
		auditStr.append("\r\n*sDSPort* :");
		auditStr.append(sDSPort);
	    auditStr.append("; ");
		auditStr.append("\r\n*pDS_URL* :");
		auditStr.append(pDS_URL);
	    auditStr.append("; ");
		auditStr.append("\r\n*pDS_HOST* :");
		auditStr.append(pDS_HOST);
	    auditStr.append("; ");
		auditStr.append("\r\n*pDS_STORE_SYNC_MESSAGE* :");
		auditStr.append(pDS_STORE_SYNC_MESSAGE);
	    auditStr.append("; ");
		auditStr.append("\r\n*pDS_STORE_SYNC_MESSAGE_LOC* :");
		auditStr.append(pDS_STORE_SYNC_MESSAGE_LOC);
	    auditStr.append("; ");
		auditStr.append("\r\n*consentChangeMessage* :");
		auditStr.append(consentChangeMessage);
	    auditStr.append("; ");
		auditStr.append("\r\n*inactivePatientRecordBgColour* :");
		auditStr.append(inactivePatientRecordBgColour);
	    auditStr.append("; ");
		auditStr.append("\r\n*pDS_AUTHENTICATION* :");
		auditStr.append(pDS_AUTHENTICATION);
	    auditStr.append("; ");
		auditStr.append("\r\n*rBAC_PdsSearchForPatient* :");
		auditStr.append(rBAC_PdsSearchForPatient);
	    auditStr.append("; ");
		auditStr.append("\r\n*rBAC_PdsSearchPatientAdvanced* :");
		auditStr.append(rBAC_PdsSearchPatientAdvanced);
	    auditStr.append("; ");
		auditStr.append("\r\n*rBAC_PdsRetrieval* :");
		auditStr.append(rBAC_PdsRetrieval);
	    auditStr.append("; ");
		auditStr.append("\r\n*rBAC_AccessSensitiveData* :");
		auditStr.append(rBAC_AccessSensitiveData);
	    auditStr.append("; ");
		auditStr.append("\r\n*rBAC_AmendPatient* :");
		auditStr.append(rBAC_AmendPatient);
	    auditStr.append("; ");
		auditStr.append("\r\n*rBAC_ControlConsent* :");
		auditStr.append(rBAC_ControlConsent);
	    auditStr.append("; ");
		auditStr.append("\r\n*rBAC_AmendPatientDecease* :");
		auditStr.append(rBAC_AmendPatientDecease);
	    auditStr.append("; ");
		auditStr.append("\r\n*rBAC_PostcodeSearch* :");
		auditStr.append(rBAC_PostcodeSearch);
	    auditStr.append("; ");
		auditStr.append("\r\n*pDS_DISPLAY_CONSENT* :");
		auditStr.append(pDS_DISPLAY_CONSENT);
	    auditStr.append("; ");
		auditStr.append("\r\n*dOB_DATE_RANGE_TYPE* :");
		if (dOB_DATE_RANGE_TYPE != null)
			auditStr.append(dOB_DATE_RANGE_TYPE.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*dOD_DATE_RANGE_TYPE* :");
		if (dOD_DATE_RANGE_TYPE != null)
			auditStr.append(dOD_DATE_RANGE_TYPE.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*tP_BookOutpatientAppt* :");
		auditStr.append(tP_BookOutpatientAppt);
	    auditStr.append("; ");
		auditStr.append("\r\n*tP_BookWardAttenderAppt* :");
		auditStr.append(tP_BookWardAttenderAppt);
	    auditStr.append("; ");
		auditStr.append("\r\n*tP_CreateTCIAndTheatreBooking* :");
		auditStr.append(tP_CreateTCIAndTheatreBooking);
	    auditStr.append("; ");
		auditStr.append("\r\n*tP_AnyAdmission* :");
		auditStr.append(tP_AnyAdmission);
	    auditStr.append("; ");
		auditStr.append("\r\n*tP_AnyApptArrival* :");
		auditStr.append(tP_AnyApptArrival);
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
		
		String keyClassName = "PDSConfiguration";
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
		if (this.getDOB_DATE_RANGE() != null)
		{
			sb.append("<dOB_DATE_RANGE>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDOB_DATE_RANGE().toString()));
			sb.append("</dOB_DATE_RANGE>");		
		}
		if (this.getDOD_DATE_RANGE() != null)
		{
			sb.append("<dOD_DATE_RANGE>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getDOD_DATE_RANGE().toString()));
			sb.append("</dOD_DATE_RANGE>");		
		}
		if (this.isTRACE_ADVANCED_IGNORE_HISTORY() != null)
		{
			sb.append("<tRACE_ADVANCED_IGNORE_HISTORY>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isTRACE_ADVANCED_IGNORE_HISTORY().toString()));
			sb.append("</tRACE_ADVANCED_IGNORE_HISTORY>");		
		}
		if (this.isTRACE_HISTORY_DATA_INDICATOR() != null)
		{
			sb.append("<tRACE_HISTORY_DATA_INDICATOR>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isTRACE_HISTORY_DATA_INDICATOR().toString()));
			sb.append("</tRACE_HISTORY_DATA_INDICATOR>");		
		}
		if (this.isUSE_LPI_CROSSCHECK() != null)
		{
			sb.append("<uSE_LPI_CROSSCHECK>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isUSE_LPI_CROSSCHECK().toString()));
			sb.append("</uSE_LPI_CROSSCHECK>");		
		}
		if (this.isDECOUPLE_ON_DECEASE() != null)
		{
			sb.append("<dECOUPLE_ON_DECEASE>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isDECOUPLE_ON_DECEASE().toString()));
			sb.append("</dECOUPLE_ON_DECEASE>");		
		}
		if (this.isNOTIFY_ON_DECEASE() != null)
		{
			sb.append("<nOTIFY_ON_DECEASE>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isNOTIFY_ON_DECEASE().toString()));
			sb.append("</nOTIFY_ON_DECEASE>");		
		}
		if (this.getNO_FIXED_ABODE_POSTCODE() != null)
		{
			sb.append("<nO_FIXED_ABODE_POSTCODE>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNO_FIXED_ABODE_POSTCODE().toString()));
			sb.append("</nO_FIXED_ABODE_POSTCODE>");		
		}
		if (this.isDECOUPLE_ON_SYNC_REQUIRED() != null)
		{
			sb.append("<dECOUPLE_ON_SYNC_REQUIRED>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isDECOUPLE_ON_SYNC_REQUIRED().toString()));
			sb.append("</dECOUPLE_ON_SYNC_REQUIRED>");		
		}
		if (this.getADVANCED_SEARCH_TIMER_INTERVAL() != null)
		{
			sb.append("<aDVANCED_SEARCH_TIMER_INTERVAL>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getADVANCED_SEARCH_TIMER_INTERVAL().toString()));
			sb.append("</aDVANCED_SEARCH_TIMER_INTERVAL>");		
		}
		if (this.getPDS_BACKOFFICE_NOTIFICATI() != null)
		{
			sb.append("<pDS_BACKOFFICE_NOTIFICATI>");
			sb.append(this.getPDS_BACKOFFICE_NOTIFICATI().toXMLString(domMap)); 	
			sb.append("</pDS_BACKOFFICE_NOTIFICATI>");		
		}
		if (this.getNumOfDaysAppointBatchTrace() != null)
		{
			sb.append("<numOfDaysAppointBatchTrace>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNumOfDaysAppointBatchTrace().toString()));
			sb.append("</numOfDaysAppointBatchTrace>");		
		}
		if (this.getNumOfDaysTCIBatchTrace() != null)
		{
			sb.append("<numOfDaysTCIBatchTrace>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNumOfDaysTCIBatchTrace().toString()));
			sb.append("</numOfDaysTCIBatchTrace>");		
		}
		if (this.getNumOfDaysForNextPDSCheck() != null)
		{
			sb.append("<numOfDaysForNextPDSCheck>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getNumOfDaysForNextPDSCheck().toString()));
			sb.append("</numOfDaysForNextPDSCheck>");		
		}
		if (this.isSYNCHRONISE_WITH_BACKOFFICE() != null)
		{
			sb.append("<sYNCHRONISE_WITH_BACKOFFICE>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isSYNCHRONISE_WITH_BACKOFFICE().toString()));
			sb.append("</sYNCHRONISE_WITH_BACKOFFICE>");		
		}
		if (this.getFromPDSAccreditedSystemId() != null)
		{
			sb.append("<fromPDSAccreditedSystemId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getFromPDSAccreditedSystemId().toString()));
			sb.append("</fromPDSAccreditedSystemId>");		
		}
		if (this.getToPDSAccreditedSystemId() != null)
		{
			sb.append("<toPDSAccreditedSystemId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getToPDSAccreditedSystemId().toString()));
			sb.append("</toPDSAccreditedSystemId>");		
		}
		if (this.getPDS_CONFIG_FILE() != null)
		{
			sb.append("<pDS_CONFIG_FILE>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPDS_CONFIG_FILE().toString()));
			sb.append("</pDS_CONFIG_FILE>");		
		}
		if (this.getPDS_STORE_MESSAGE_LOC() != null)
		{
			sb.append("<pDS_STORE_MESSAGE_LOC>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPDS_STORE_MESSAGE_LOC().toString()));
			sb.append("</pDS_STORE_MESSAGE_LOC>");		
		}
		if (this.isPDS_STORE_MESSAGE() != null)
		{
			sb.append("<pDS_STORE_MESSAGE>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isPDS_STORE_MESSAGE().toString()));
			sb.append("</pDS_STORE_MESSAGE>");		
		}
		if (this.isSTART_PDS_GATEWAY() != null)
		{
			sb.append("<sTART_PDS_GATEWAY>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isSTART_PDS_GATEWAY().toString()));
			sb.append("</sTART_PDS_GATEWAY>");		
		}
		if (this.getPDS_MSH_REPOSITORY() != null)
		{
			sb.append("<pDS_MSH_REPOSITORY>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPDS_MSH_REPOSITORY().toString()));
			sb.append("</pDS_MSH_REPOSITORY>");		
		}
		if (this.getPDS_MSH_URL() != null)
		{
			sb.append("<pDS_MSH_URL>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPDS_MSH_URL().toString()));
			sb.append("</pDS_MSH_URL>");		
		}
		if (this.isCREATE_BO_NOTIFICATIONS() != null)
		{
			sb.append("<cREATE_BO_NOTIFICATIONS>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isCREATE_BO_NOTIFICATIONS().toString()));
			sb.append("</cREATE_BO_NOTIFICATIONS>");		
		}
		if (this.getSDSHost() != null)
		{
			sb.append("<sDSHost>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSDSHost().toString()));
			sb.append("</sDSHost>");		
		}
		if (this.getSDSPort() != null)
		{
			sb.append("<sDSPort>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSDSPort().toString()));
			sb.append("</sDSPort>");		
		}
		if (this.getPDS_URL() != null)
		{
			sb.append("<pDS_URL>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPDS_URL().toString()));
			sb.append("</pDS_URL>");		
		}
		if (this.getPDS_HOST() != null)
		{
			sb.append("<pDS_HOST>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPDS_HOST().toString()));
			sb.append("</pDS_HOST>");		
		}
		if (this.isPDS_STORE_SYNC_MESSAGE() != null)
		{
			sb.append("<pDS_STORE_SYNC_MESSAGE>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isPDS_STORE_SYNC_MESSAGE().toString()));
			sb.append("</pDS_STORE_SYNC_MESSAGE>");		
		}
		if (this.getPDS_STORE_SYNC_MESSAGE_LOC() != null)
		{
			sb.append("<pDS_STORE_SYNC_MESSAGE_LOC>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getPDS_STORE_SYNC_MESSAGE_LOC().toString()));
			sb.append("</pDS_STORE_SYNC_MESSAGE_LOC>");		
		}
		if (this.getConsentChangeMessage() != null)
		{
			sb.append("<consentChangeMessage>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getConsentChangeMessage().toString()));
			sb.append("</consentChangeMessage>");		
		}
		if (this.getInactivePatientRecordBgColour() != null)
		{
			sb.append("<inactivePatientRecordBgColour>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getInactivePatientRecordBgColour().toString()));
			sb.append("</inactivePatientRecordBgColour>");		
		}
		if (this.isPDS_AUTHENTICATION() != null)
		{
			sb.append("<pDS_AUTHENTICATION>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isPDS_AUTHENTICATION().toString()));
			sb.append("</pDS_AUTHENTICATION>");		
		}
		if (this.getRBAC_PdsSearchForPatient() != null)
		{
			sb.append("<rBAC_PdsSearchForPatient>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRBAC_PdsSearchForPatient().toString()));
			sb.append("</rBAC_PdsSearchForPatient>");		
		}
		if (this.getRBAC_PdsSearchPatientAdvanced() != null)
		{
			sb.append("<rBAC_PdsSearchPatientAdvanced>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRBAC_PdsSearchPatientAdvanced().toString()));
			sb.append("</rBAC_PdsSearchPatientAdvanced>");		
		}
		if (this.getRBAC_PdsRetrieval() != null)
		{
			sb.append("<rBAC_PdsRetrieval>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRBAC_PdsRetrieval().toString()));
			sb.append("</rBAC_PdsRetrieval>");		
		}
		if (this.getRBAC_AccessSensitiveData() != null)
		{
			sb.append("<rBAC_AccessSensitiveData>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRBAC_AccessSensitiveData().toString()));
			sb.append("</rBAC_AccessSensitiveData>");		
		}
		if (this.getRBAC_AmendPatient() != null)
		{
			sb.append("<rBAC_AmendPatient>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRBAC_AmendPatient().toString()));
			sb.append("</rBAC_AmendPatient>");		
		}
		if (this.getRBAC_ControlConsent() != null)
		{
			sb.append("<rBAC_ControlConsent>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRBAC_ControlConsent().toString()));
			sb.append("</rBAC_ControlConsent>");		
		}
		if (this.getRBAC_AmendPatientDecease() != null)
		{
			sb.append("<rBAC_AmendPatientDecease>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRBAC_AmendPatientDecease().toString()));
			sb.append("</rBAC_AmendPatientDecease>");		
		}
		if (this.getRBAC_PostcodeSearch() != null)
		{
			sb.append("<rBAC_PostcodeSearch>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getRBAC_PostcodeSearch().toString()));
			sb.append("</rBAC_PostcodeSearch>");		
		}
		if (this.isPDS_DISPLAY_CONSENT() != null)
		{
			sb.append("<pDS_DISPLAY_CONSENT>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isPDS_DISPLAY_CONSENT().toString()));
			sb.append("</pDS_DISPLAY_CONSENT>");		
		}
		if (this.getDOB_DATE_RANGE_TYPE() != null)
		{
			sb.append("<dOB_DATE_RANGE_TYPE>");
			sb.append(this.getDOB_DATE_RANGE_TYPE().toXMLString()); 
			sb.append("</dOB_DATE_RANGE_TYPE>");		
		}
		if (this.getDOD_DATE_RANGE_TYPE() != null)
		{
			sb.append("<dOD_DATE_RANGE_TYPE>");
			sb.append(this.getDOD_DATE_RANGE_TYPE().toXMLString()); 
			sb.append("</dOD_DATE_RANGE_TYPE>");		
		}
		if (this.isTP_BookOutpatientAppt() != null)
		{
			sb.append("<tP_BookOutpatientAppt>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isTP_BookOutpatientAppt().toString()));
			sb.append("</tP_BookOutpatientAppt>");		
		}
		if (this.isTP_BookWardAttenderAppt() != null)
		{
			sb.append("<tP_BookWardAttenderAppt>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isTP_BookWardAttenderAppt().toString()));
			sb.append("</tP_BookWardAttenderAppt>");		
		}
		if (this.isTP_CreateTCIAndTheatreBooking() != null)
		{
			sb.append("<tP_CreateTCIAndTheatreBooking>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isTP_CreateTCIAndTheatreBooking().toString()));
			sb.append("</tP_CreateTCIAndTheatreBooking>");		
		}
		if (this.isTP_AnyAdmission() != null)
		{
			sb.append("<tP_AnyAdmission>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isTP_AnyAdmission().toString()));
			sb.append("</tP_AnyAdmission>");		
		}
		if (this.isTP_AnyApptArrival() != null)
		{
			sb.append("<tP_AnyApptArrival>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isTP_AnyApptArrival().toString()));
			sb.append("</tP_AnyApptArrival>");		
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
			PDSConfiguration domainObject = getPDSConfigurationfromXML(itemEl, factory, domMap);

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
			PDSConfiguration domainObject = getPDSConfigurationfromXML(itemEl, factory, domMap);

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
		
	public static PDSConfiguration getPDSConfigurationfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getPDSConfigurationfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static PDSConfiguration getPDSConfigurationfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!PDSConfiguration.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!PDSConfiguration.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the PDSConfiguration class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (PDSConfiguration)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(PDSConfiguration.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		PDSConfiguration ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (PDSConfiguration)factory.getImportedDomainObject(PDSConfiguration.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new PDSConfiguration();
		}
		String keyClassName = "PDSConfiguration";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (PDSConfiguration)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, PDSConfiguration obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("dOB_DATE_RANGE");
		if(fldEl != null)
		{	
    		obj.setDOB_DATE_RANGE(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dOD_DATE_RANGE");
		if(fldEl != null)
		{	
    		obj.setDOD_DATE_RANGE(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("tRACE_ADVANCED_IGNORE_HISTORY");
		if(fldEl != null)
		{	
    		obj.setTRACE_ADVANCED_IGNORE_HISTORY(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("tRACE_HISTORY_DATA_INDICATOR");
		if(fldEl != null)
		{	
    		obj.setTRACE_HISTORY_DATA_INDICATOR(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("uSE_LPI_CROSSCHECK");
		if(fldEl != null)
		{	
    		obj.setUSE_LPI_CROSSCHECK(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dECOUPLE_ON_DECEASE");
		if(fldEl != null)
		{	
    		obj.setDECOUPLE_ON_DECEASE(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("nOTIFY_ON_DECEASE");
		if(fldEl != null)
		{	
    		obj.setNOTIFY_ON_DECEASE(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("nO_FIXED_ABODE_POSTCODE");
		if(fldEl != null)
		{	
    		obj.setNO_FIXED_ABODE_POSTCODE(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dECOUPLE_ON_SYNC_REQUIRED");
		if(fldEl != null)
		{	
    		obj.setDECOUPLE_ON_SYNC_REQUIRED(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("aDVANCED_SEARCH_TIMER_INTERVAL");
		if(fldEl != null)
		{	
    		obj.setADVANCED_SEARCH_TIMER_INTERVAL(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("pDS_BACKOFFICE_NOTIFICATI");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setPDS_BACKOFFICE_NOTIFICATI(ims.core.configuration.domain.objects.AppUser.getAppUserfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("numOfDaysAppointBatchTrace");
		if(fldEl != null)
		{	
    		obj.setNumOfDaysAppointBatchTrace(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("numOfDaysTCIBatchTrace");
		if(fldEl != null)
		{	
    		obj.setNumOfDaysTCIBatchTrace(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("numOfDaysForNextPDSCheck");
		if(fldEl != null)
		{	
    		obj.setNumOfDaysForNextPDSCheck(new Integer(fldEl.getTextTrim()));	
		}
		fldEl = el.element("sYNCHRONISE_WITH_BACKOFFICE");
		if(fldEl != null)
		{	
    		obj.setSYNCHRONISE_WITH_BACKOFFICE(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("fromPDSAccreditedSystemId");
		if(fldEl != null)
		{	
    		obj.setFromPDSAccreditedSystemId(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("toPDSAccreditedSystemId");
		if(fldEl != null)
		{	
    		obj.setToPDSAccreditedSystemId(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("pDS_CONFIG_FILE");
		if(fldEl != null)
		{	
    		obj.setPDS_CONFIG_FILE(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("pDS_STORE_MESSAGE_LOC");
		if(fldEl != null)
		{	
    		obj.setPDS_STORE_MESSAGE_LOC(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("pDS_STORE_MESSAGE");
		if(fldEl != null)
		{	
    		obj.setPDS_STORE_MESSAGE(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("sTART_PDS_GATEWAY");
		if(fldEl != null)
		{	
    		obj.setSTART_PDS_GATEWAY(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("pDS_MSH_REPOSITORY");
		if(fldEl != null)
		{	
    		obj.setPDS_MSH_REPOSITORY(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("pDS_MSH_URL");
		if(fldEl != null)
		{	
    		obj.setPDS_MSH_URL(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("cREATE_BO_NOTIFICATIONS");
		if(fldEl != null)
		{	
    		obj.setCREATE_BO_NOTIFICATIONS(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("sDSHost");
		if(fldEl != null)
		{	
    		obj.setSDSHost(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("sDSPort");
		if(fldEl != null)
		{	
    		obj.setSDSPort(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("pDS_URL");
		if(fldEl != null)
		{	
    		obj.setPDS_URL(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("pDS_HOST");
		if(fldEl != null)
		{	
    		obj.setPDS_HOST(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("pDS_STORE_SYNC_MESSAGE");
		if(fldEl != null)
		{	
    		obj.setPDS_STORE_SYNC_MESSAGE(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("pDS_STORE_SYNC_MESSAGE_LOC");
		if(fldEl != null)
		{	
    		obj.setPDS_STORE_SYNC_MESSAGE_LOC(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("consentChangeMessage");
		if(fldEl != null)
		{	
    		obj.setConsentChangeMessage(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("inactivePatientRecordBgColour");
		if(fldEl != null)
		{	
    		obj.setInactivePatientRecordBgColour(ims.framework.utils.Color.getColor(fldEl.getTextTrim()));		
		}
		fldEl = el.element("pDS_AUTHENTICATION");
		if(fldEl != null)
		{	
    		obj.setPDS_AUTHENTICATION(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("rBAC_PdsSearchForPatient");
		if(fldEl != null)
		{	
    		obj.setRBAC_PdsSearchForPatient(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("rBAC_PdsSearchPatientAdvanced");
		if(fldEl != null)
		{	
    		obj.setRBAC_PdsSearchPatientAdvanced(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("rBAC_PdsRetrieval");
		if(fldEl != null)
		{	
    		obj.setRBAC_PdsRetrieval(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("rBAC_AccessSensitiveData");
		if(fldEl != null)
		{	
    		obj.setRBAC_AccessSensitiveData(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("rBAC_AmendPatient");
		if(fldEl != null)
		{	
    		obj.setRBAC_AmendPatient(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("rBAC_ControlConsent");
		if(fldEl != null)
		{	
    		obj.setRBAC_ControlConsent(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("rBAC_AmendPatientDecease");
		if(fldEl != null)
		{	
    		obj.setRBAC_AmendPatientDecease(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("rBAC_PostcodeSearch");
		if(fldEl != null)
		{	
    		obj.setRBAC_PostcodeSearch(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("pDS_DISPLAY_CONSENT");
		if(fldEl != null)
		{	
    		obj.setPDS_DISPLAY_CONSENT(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("dOB_DATE_RANGE_TYPE");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDOB_DATE_RANGE_TYPE(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("dOD_DATE_RANGE_TYPE");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setDOD_DATE_RANGE_TYPE(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("tP_BookOutpatientAppt");
		if(fldEl != null)
		{	
    		obj.setTP_BookOutpatientAppt(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("tP_BookWardAttenderAppt");
		if(fldEl != null)
		{	
    		obj.setTP_BookWardAttenderAppt(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("tP_CreateTCIAndTheatreBooking");
		if(fldEl != null)
		{	
    		obj.setTP_CreateTCIAndTheatreBooking(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("tP_AnyAdmission");
		if(fldEl != null)
		{	
    		obj.setTP_AnyAdmission(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("tP_AnyApptArrival");
		if(fldEl != null)
		{	
    		obj.setTP_AnyApptArrival(new Boolean(fldEl.getTextTrim()));	
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
		public static final String DOB_DATE_RANGE = "dOB_DATE_RANGE";
		public static final String DOD_DATE_RANGE = "dOD_DATE_RANGE";
		public static final String TRACE_ADVANCED_IGNORE_HISTORY = "tRACE_ADVANCED_IGNORE_HISTORY";
		public static final String TRACE_HISTORY_DATA_INDICATOR = "tRACE_HISTORY_DATA_INDICATOR";
		public static final String USE_LPI_CROSSCHECK = "uSE_LPI_CROSSCHECK";
		public static final String DECOUPLE_ON_DECEASE = "dECOUPLE_ON_DECEASE";
		public static final String NOTIFY_ON_DECEASE = "nOTIFY_ON_DECEASE";
		public static final String NO_FIXED_ABODE_POSTCODE = "nO_FIXED_ABODE_POSTCODE";
		public static final String DECOUPLE_ON_SYNC_REQUIRED = "dECOUPLE_ON_SYNC_REQUIRED";
		public static final String ADVANCED_SEARCH_TIMER_INTERVAL = "aDVANCED_SEARCH_TIMER_INTERVAL";
		public static final String PDS_BACKOFFICE_NOTIFICATI = "pDS_BACKOFFICE_NOTIFICATI";
		public static final String NumOfDaysAppointBatchTrace = "numOfDaysAppointBatchTrace";
		public static final String NumOfDaysTCIBatchTrace = "numOfDaysTCIBatchTrace";
		public static final String NumOfDaysForNextPDSCheck = "numOfDaysForNextPDSCheck";
		public static final String SYNCHRONISE_WITH_BACKOFFICE = "sYNCHRONISE_WITH_BACKOFFICE";
		public static final String FromPDSAccreditedSystemId = "fromPDSAccreditedSystemId";
		public static final String ToPDSAccreditedSystemId = "toPDSAccreditedSystemId";
		public static final String PDS_CONFIG_FILE = "pDS_CONFIG_FILE";
		public static final String PDS_STORE_MESSAGE_LOC = "pDS_STORE_MESSAGE_LOC";
		public static final String PDS_STORE_MESSAGE = "pDS_STORE_MESSAGE";
		public static final String START_PDS_GATEWAY = "sTART_PDS_GATEWAY";
		public static final String PDS_MSH_REPOSITORY = "pDS_MSH_REPOSITORY";
		public static final String PDS_MSH_URL = "pDS_MSH_URL";
		public static final String CREATE_BO_NOTIFICATIONS = "cREATE_BO_NOTIFICATIONS";
		public static final String SDSHost = "sDSHost";
		public static final String SDSPort = "sDSPort";
		public static final String PDS_URL = "pDS_URL";
		public static final String PDS_HOST = "pDS_HOST";
		public static final String PDS_STORE_SYNC_MESSAGE = "pDS_STORE_SYNC_MESSAGE";
		public static final String PDS_STORE_SYNC_MESSAGE_LOC = "pDS_STORE_SYNC_MESSAGE_LOC";
		public static final String ConsentChangeMessage = "consentChangeMessage";
		public static final String InactivePatientRecordBgColour = "inactivePatientRecordBgColour";
		public static final String PDS_AUTHENTICATION = "pDS_AUTHENTICATION";
		public static final String RBAC_PdsSearchForPatient = "rBAC_PdsSearchForPatient";
		public static final String RBAC_PdsSearchPatientAdvanced = "rBAC_PdsSearchPatientAdvanced";
		public static final String RBAC_PdsRetrieval = "rBAC_PdsRetrieval";
		public static final String RBAC_AccessSensitiveData = "rBAC_AccessSensitiveData";
		public static final String RBAC_AmendPatient = "rBAC_AmendPatient";
		public static final String RBAC_ControlConsent = "rBAC_ControlConsent";
		public static final String RBAC_AmendPatientDecease = "rBAC_AmendPatientDecease";
		public static final String RBAC_PostcodeSearch = "rBAC_PostcodeSearch";
		public static final String PDS_DISPLAY_CONSENT = "pDS_DISPLAY_CONSENT";
		public static final String DOB_DATE_RANGE_TYPE = "dOB_DATE_RANGE_TYPE";
		public static final String DOD_DATE_RANGE_TYPE = "dOD_DATE_RANGE_TYPE";
		public static final String TP_BookOutpatientAppt = "tP_BookOutpatientAppt";
		public static final String TP_BookWardAttenderAppt = "tP_BookWardAttenderAppt";
		public static final String TP_CreateTCIAndTheatreBooking = "tP_CreateTCIAndTheatreBooking";
		public static final String TP_AnyAdmission = "tP_AnyAdmission";
		public static final String TP_AnyApptArrival = "tP_AnyApptArrival";
	}
}

