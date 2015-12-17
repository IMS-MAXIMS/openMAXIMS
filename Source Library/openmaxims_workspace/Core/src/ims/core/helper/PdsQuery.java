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
package ims.core.helper;

import hl7OrgV3.AD;
import hl7OrgV3.AD.StreetAddressLine;
import hl7OrgV3.CD;
import hl7OrgV3.COCTMT000202UK02PartOfWhole;
import hl7OrgV3.IINPfITOidMandatory;
import hl7OrgV3.IVLTS;
import hl7OrgV3.IVXBTS;
import hl7OrgV3.PN;
import hl7OrgV3.QUQIIN010000UK14Document;
import hl7OrgV3.QUQIIN010000UK14Message;
import hl7OrgV3.QUQIMT030101UK03Reason;
import hl7OrgV3.TELNPFITUseRequired;
import hl7OrgV3.TS;
import hl7OrgV3.impl.ADImpl.AddressKeyImpl;
import hl7OrgV3.impl.ADImpl.DescImpl;
import hl7OrgV3.impl.ADImpl.PostalCodeImpl;
import hl7OrgV3.impl.ADImpl.StreetAddressLineImpl;
import hl7OrgV3.impl.EnFamilyImpl;
import hl7OrgV3.impl.EnGivenImpl;
import hl7OrgV3.impl.EnPrefixImpl;
import hl7OrgV3.impl.EnSuffixImpl;
import ims.admin.vo.PDSConfigurationVo;
import ims.admin.vo.RBACBaselineJobRoleVo;
import ims.core.admin.vo.RBACBaselineJobRoleRefVo;
import ims.core.patient.vo.PatientRefVo;
import ims.core.vo.CommChannelVo;
import ims.core.vo.CommChannelVoCollection;
import ims.core.vo.MissingMappingVo;
import ims.core.vo.MissingMappingVoCollection;
import ims.core.vo.NotificationVo;
import ims.core.vo.NotificationVoCollection;
import ims.core.vo.PDSBackOfficeItemVo;
import ims.core.vo.PDSBackOfficeStatusVo;
import ims.core.vo.PDSBackOfficeStatusVoCollection;
import ims.core.vo.PatientId;
import ims.core.vo.PatientIdCollection;
import ims.core.vo.PatientShort;
import ims.core.vo.PdsErrorVo;
import ims.core.vo.PersonAddress;
import ims.core.vo.PersonName;
import ims.core.vo.lookups.AddressType;
import ims.core.vo.lookups.ChannelType;
import ims.core.vo.lookups.NameType;
import ims.core.vo.lookups.PDSBackOfficeType;
import ims.core.vo.lookups.PDSBackOfficeWorkPriority;
import ims.core.vo.lookups.PDSBackOfficeWorkStatus;
import ims.core.vo.lookups.PDSChannelUsage;
import ims.core.vo.lookups.PDSContactMethod;
import ims.core.vo.lookups.PDSPersonRole;
import ims.core.vo.lookups.PDSPreferredCommunicationLanguage;
import ims.core.vo.lookups.PatIdType;
import ims.core.vo.lookups.PersonRelationship;
import ims.core.vo.lookups.PersonTitle;
import ims.core.vo.lookups.PreferredWrittenCommunication;
import ims.domain.DomainInterface;
import ims.domain.DomainSession;
import ims.domain.exceptions.DomainException;
import ims.domain.impl.DomainImplFlyweightFactory;
import ims.framework.UIComponentEngine;
import ims.framework.UIEngine;
import ims.framework.enumerations.SystemLogLevel;
import ims.framework.enumerations.SystemLogType;
import ims.framework.utils.DateFormat;
import ims.framework.utils.DateTime;
import ims.framework.utils.PartialDate;

import java.io.StringReader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.MultiThreadedHttpConnectionManager;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.apache.log4j.Logger;
import org.apache.xmlbeans.XmlException;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

public class PdsQuery
{
	protected HttpClient client;
	protected DomainInterface domain;
	protected String xmlMessageName;
	protected boolean issueFound;
	protected StringBuilder sb;
	protected boolean isConfidential;
	
	protected boolean dummyError; 
	protected PdsErrorVo pdsError;
	
	protected IPdsDomainHelper impl;
	protected String nhsNumber;
	protected String superseededNhsNumber;
	protected PatientRefVo patientInContext;
	
	public static String NO_MATCH = "No match to a Service User record"; 
	
	protected String code = "";

	private static final Logger LOG = Logger.getLogger(PdsQuery.class);

	public static class PdsField
	{
		public static final Integer TITLE 						= new Integer(1); 
		public static final Integer ADDRESS_TYPE 				= new Integer(2); 
		public static final Integer NAME_TYPE 					= new Integer(3);
		public static final Integer COMM_CHANNEL_USAGE 			= new Integer(4);
		public static final Integer COMM_CHANNEL_TYPE 			= new Integer(5);
		public static final Integer RELATIONSHIP 				= new Integer(6);
		public static final Integer ROLE 						= new Integer(7);
		public static final Integer PREFERRED_COMM_LANGUAGE 	= new Integer(8);
		public static final Integer PREFERRED_CONTACT_METHOD 	= new Integer(9);
		public static final Integer PREFERRED_WRITTEN_COMM 		= new Integer(10);
	}
	
	public class MissingMapping
	{
		Integer field;
		String message;
		
		public MissingMapping(Integer field, String message)
		{
			this.field = field;
			this.message = message;
		}

		public MissingMapping()
		{
			super();
		}

		public Integer getField()
		{
			return field;
		}

		public void setField(Integer field)
		{
			this.field = field;
		}

		public String getMessage()
		{
			return message;
		}

		public void setMessage(String message)
		{
			this.message = message;
		}
	}
	
	protected MissingMappingVoCollection missingMappings = new MissingMappingVoCollection();
	
	public MissingMappingVoCollection getMissingMappings()
	{
		return missingMappings;
	}

	public PdsQuery(DomainInterface domain)
	{

		super();
		
		this.domain = domain;
		
        client = new HttpClient(new MultiThreadedHttpConnectionManager());
        client.getHttpConnectionManager().getParams().setConnectionTimeout(30000);
        client.getParams().setBooleanParameter(HttpMethodParams.USE_EXPECT_CONTINUE, true);
        
        issueFound = false;
        sb = new StringBuilder(1024);
        isConfidential = false;
        
		try
		{
			impl = (IPdsDomainHelper) getDomainImpl("ims.core.helper.PdsDomainHelperImpl");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		//to be able to instantiate it from other places than Logic.java
		if(this.domain == null && impl != null)
			this.domain = impl;
	}
	
	public PersonTitle getPatientTitle(String pdsTitle)
	{
		PersonTitle title = (PersonTitle)domain.getLookupService().getLocalLookup(PersonTitle.class, PersonTitle.TYPE_ID, "PDS", pdsTitle);

		return title;
	}

	public PersonRelationship getPersonRelationship(String pdsRelationship)
	{
		PersonRelationship instance = (PersonRelationship)domain.getLookupService().getLocalLookup(PersonRelationship.class, PersonRelationship.TYPE_ID, "PDS", pdsRelationship);

		return instance;
	}
	
	public PDSPersonRole getPDSPersonRole(String value)
	{
		PDSPersonRole instance = (PDSPersonRole)domain.getLookupService().getLocalLookup(PDSPersonRole.class, PDSPersonRole.TYPE_ID, "PDS", value);

		return instance;
	}
	
	public void addIssueMessage(String msg)
	{
    	sb.append(xmlMessageName + " " + msg);
        sb.append("\n");
        
        issueFound = true;
	}

	public void addIssueMessage(String msg, Integer pdsField)
	{
    	sb.append(xmlMessageName + " " + msg);
        sb.append("\n");
        
        issueFound = true;
        
		MissingMappingVo mm = new MissingMappingVo();
		mm.setPdsField(pdsField);
		mm.setMessage(msg);
		missingMappings.add(mm);        
	}
	
	public void addIssueMessage(String msg, Exception e)
	{
    	sb.append(xmlMessageName + " " + msg);
        sb.append("\n");
    	sb.append(e.toString());
    	sb.append("\n");
    	
    	issueFound = true;
	}

	public void populatePN(PersonName maximsPN, PN pdsPN)
	{
    	if(pdsPN.getFamilyArray() != null && pdsPN.getFamilyArray().length > 0)
    	{
    		EnFamilyImpl enFamilyImpl = (EnFamilyImpl) pdsPN.getFamilyArray()[0];
    		
    		maximsPN.setSurname(enFamilyImpl.getStringValue());
    	}
    	else
    	{
    		addIssueMessage("xml response is missing Name.Family field !");
    	}
    	
    	if(pdsPN.getGivenArray() != null && pdsPN.getGivenArray().length > 0)
    	{
    		int givenCount = pdsPN.getGivenArray().length;

            for (int i = 0; i < givenCount; i++)
            {
                EnGivenImpl enGivenImpl = (EnGivenImpl) pdsPN.getGivenArray()[i];
                
                if(i == 0)
                	maximsPN.setForename(enGivenImpl.getStringValue());
                else if(i == 1)
                	maximsPN.setMiddleName(enGivenImpl.getStringValue());
                else
                	break;
            }
    	}
            
    	if(pdsPN.getPrefixArray() != null && pdsPN.getPrefixArray().length > 0)
    	{
			//get the title here
    		EnPrefixImpl prefixImpl = (EnPrefixImpl) pdsPN.getPrefixArray()[0];
    		
    		maximsPN.setTitle(getPatientTitle(prefixImpl.getStringValue()));
    		
    		if(maximsPN.getTitle() == null)
    		{
        		addIssueMessage("No mapping of type PDS was found for PersonTitle lookup and value '" + prefixImpl.getStringValue() + "' !", PdsQuery.PdsField.TITLE);
    		}
    	}
    	else
    	{
    		addIssueMessage("xml response is missing Name.Prefix field !");
    	}
        	
    	//suffix
    	if(pdsPN.getSuffixArray() != null && pdsPN.getSuffixArray().length > 0)
    	{
			//get the title here
    		EnSuffixImpl suffixImpl = (EnSuffixImpl) pdsPN.getSuffixArray()[0];
    		
    		maximsPN.setNamesuffix(suffixImpl.getStringValue());
    	}
    	
    	//validTime
    	if(pdsPN.getValidTime() != null)
    	{
    		IVLTS validTime = pdsPN.getValidTime();
    		
    		//beffdate & beffdatecnf
    		if(validTime.getLow() != null)
    		{
    			IVXBTS low = validTime.getLow();
    			
        		try
        		{
        			maximsPN.setBeffdate(new ims.framework.utils.Date(low.getValue().substring(0,8), DateFormat.ISO));
        			maximsPN.setBeffdatecnf(Boolean.TRUE);
        		}
        		catch(Exception e)
        		{
        			addIssueMessage("xml response has an incorrect value for Person.validTime.low field !", e);
        		}
    		}
    		
    		//betdate & Betdatecnf
    		if(validTime.getHigh() != null)
    		{
    			IVXBTS high = validTime.getHigh();
    			
        		try
        		{
        			maximsPN.setBetdate(new ims.framework.utils.Date(high.getValue().substring(0,8), DateFormat.ISO));
        			maximsPN.setBetdatecnf(Boolean.TRUE);
        		}
        		catch(Exception e)
        		{
        			addIssueMessage("xml response has an incorrect value for Person.validTime.high field !", e);
        		}
    		}
    		
    	}
    	
    	//unique identifier
    	if(pdsPN.getId() != null && pdsPN.getId().getExtension() != null)
    	{
    		maximsPN.setObjectidentifier(pdsPN.getId().getExtension());
    	}
    	else
    	{
    		addIssueMessage("xml response doesn't have a value for Person's unique identifier field !");
    	}
   	}
	
	public void populateBirthTime(PatientShort pat, TS bt)
	{
    	if(bt != null)
    	{
    		try
    		{
    			pat.setDob(new PartialDate(bt.getValue()));
    		}
    		catch(Exception e)
    		{
                addIssueMessage("xml response has an incorrect value for Person.BirthTime field !", e);
    		}
    	}
    	else
    	{
    		addIssueMessage("xml response is missing Person.BirthTime field !");
    	}
	}
	
	public void populateDeceasedTime(PatientShort pat, TS ts)
	{
    	if(ts != null)
    	{
    		try
    		{
    			pat.setDod(new ims.framework.utils.Date(ts.getValue().substring(0,8), DateFormat.ISO));
    		}
    		catch(Exception e)
    		{
    			addIssueMessage("xml response has an incorrect value for Person.DeceasedTime field !", e);
    		}
    	}
    	/*
    	else
    	{
    		addIssueMessage("xml response is missing Person.DeceasedTime field !");
    	}
    	*/
	}
	
	public void populatePatientAddress(PersonAddress imsAddr, AD addr)
	{
		StreetAddressLine[] addrLine = addr.getStreetAddressLineArray();
		
		//address type
		try
		{
			if(addr.getUse() != null && addr.getUse().size() > 0)
				code = addr.getUse().get(0) != null ? addr.getUse().get(0).toString() : "";
			else
				code = "";
		} 
		catch (org.apache.xmlbeans.impl.values.XmlValueOutOfRangeException ex)
		{
			//workaround for invalid values
			code = parseInvalidSchemaValueFromXml(addr.xgetUse(), "Address.Use");
		}
		
		imsAddr.setAddressType(getAddressTypeByPdsMapping(code));
		
		if(imsAddr.getAddressType() == null)
		{
			addIssueMessage("No mapping of type PDS was found for NameType lookup and value '" + code + "' !", PdsQuery.PdsField.ADDRESS_TYPE);
		}
    	
    	if(addrLine != null)
    	{
    		for (int i = 0; i < addrLine.length; i++)
			{
				StreetAddressLineImpl streetAddressLine = (StreetAddressLineImpl) addrLine[i];
				
				if(i == 0)
					imsAddr.setLine1(streetAddressLine.getStringValue());
				if(i == 1)
					imsAddr.setLine2(streetAddressLine.getStringValue());
				if(i == 2)
					imsAddr.setLine3(streetAddressLine.getStringValue());
				if(i == 3)
					imsAddr.setLine4(streetAddressLine.getStringValue());
				if(i == 4)
					imsAddr.setLine5(streetAddressLine.getStringValue());
			}
    	}
    	
    	//postal code
		if(addr.getPostalCodeArray() != null && addr.getPostalCodeArray().length > 0)
		{
			PostalCodeImpl postalCode = (PostalCodeImpl) addr.getPostalCodeArray()[0];
			
			imsAddr.setPostCode(postalCode.getStringValue());
		}

    	//PAF key
		if(addr.getAddressKeyArray()!= null && addr.getAddressKeyArray().length > 0)
		{
			AddressKeyImpl addrKey = (AddressKeyImpl) addr.getAddressKeyArray()[0];
			
			imsAddr.setPafkey(addrKey.getStringValue());
		}

    	//description
		if(addr.getDescArray() != null && addr.getDescArray().length > 0)
		{
			DescImpl descr = (DescImpl)addr.getDescArray()[0];
			
			imsAddr.setDescription(descr.getStringValue());
		}
		
		//unique identifier
		if(addr.getId() != null)
		{
			imsAddr.setObjectidentifier(addr.getId().getExtension());
		}
		
		//useablePeriod
		if(addr.getUseablePeriodArray() != null && addr.getUseablePeriodArray().length > 0)
		{
			IVLTS validTime = addr.getUseablePeriodArray()[0];

    		//beffdate & beffdatecnf
    		if(validTime.getLow() != null)
    		{
    			IVXBTS low = validTime.getLow();
    			
        		try
        		{
        			imsAddr.setBeffdate(new ims.framework.utils.Date(low.getValue().substring(0,8), DateFormat.ISO));
        			imsAddr.setBeffdatecnf(Boolean.TRUE);
        		}
        		catch(Exception e)
        		{
        			addIssueMessage("xml response has an incorrect value for Address.validTime.low field !", e);
        		}
    		}
    		
    		//betdate & Betdatecnf
    		if(validTime.getHigh() != null)
    		{
    			IVXBTS high = validTime.getHigh();
    			
        		try
        		{
        			imsAddr.setBetdate(new ims.framework.utils.Date(high.getValue().substring(0,8), DateFormat.ISO));
        			imsAddr.setBetdatecnf(Boolean.TRUE);
        		}
        		catch(Exception e)
        		{
        			addIssueMessage("xml response has an incorrect value for Address.validTime.high field !", e);
        		}
    		}
		}	
	}
	
	public void populatePatientIdentifiers(PatientShort pat, IINPfITOidMandatory id)
	{
    	if(id != null)
    	{
    		PatientIdCollection pids = null;
    		
    		if(pat.getIdentifiers() == null)
    		{
    			pids = new PatientIdCollection();
    			pat.setIdentifiers(pids);
    			
    			PatientId nhs = new PatientId();
    			pids.add(nhs);
    			
    			nhs.setType(PatIdType.NHSN);
    		}
    		else
    		{
    			pids = pat.getIdentifiers();
    		}
    			
    		if(pat.getPatId(PatIdType.NHSN) == null)
    		{
    			PatientId nhs = new PatientId();
    			nhs.setType(PatIdType.NHSN);
    			
    			pids.add(nhs);
    		}
    		
    		PatientId nhs = pat.getPatId(PatIdType.NHSN);
    		
    		nhs.setValue(id.getExtension());
    		nhs.setVerified(Boolean.TRUE);
    	}		
	}

	public void setDummyError()
	{
		dummyError = true;
	}
	
	public boolean isErrorResponse(String xml)
	{
		return xml.indexOf("QUQI_IN010000UK14") != -1;
	}
	
	public boolean receivedErrorResponse(String xml) throws PdsException
	{
		if(isErrorResponse(xml))
		{
			//parse QUQI_IN010000UK14 message
			parseErrorResponse(xml);
			return true;
		}
		else
			return false;
	}
	
	private void parseErrorResponse(String xml) throws PdsException
	{
		QUQIIN010000UK14Document doc;
		
		try
		{
			doc = QUQIIN010000UK14Document.Factory.parse(xml);
		}
		catch (XmlException ex)
		{
            String err = "Error parsing Error response (QUQI_IN010000UK14): " + ex.toString();
            sb.append(err);
            sb.append("\n");
            sb.append("QUQI_IN010000UK14 xml content");
            sb.append("\n");
            sb.append(xml);
            
            domain.createSystemLogEntry(SystemLogType.PDS, SystemLogLevel.ERROR, sb.toString());

            throw new PdsException(err, ex);
		}
		
		QUQIIN010000UK14Message msg = doc.getQUQIIN010000UK14();
		
		if(pdsError == null)
			pdsError = new PdsErrorVo();
		else
		{
			pdsError.setCreationTime(null);
			pdsError.setId(null);
			pdsError.setInteractionId(null);
			pdsError.setProcessingCode(null);
			pdsError.setQueryResponseCode(null);
		}
		
		if(msg.getId() != null)
		{
			LOG.error("QUQI_IN010000UK14.id = " + msg.getId().getExtension());
			pdsError.setId(msg.getId().getExtension());
		}
		if(msg.getCreationTime() != null)
		{
			LOG.error("QUQI_IN010000UK14.creationTime = " + msg.getCreationTime().getValue());
			if(msg.getCreationTime() != null)
			{
    			try
    			{
    				pdsError.setCreationTime(new ims.framework.utils.DateTime(msg.getCreationTime().getValue().substring(0,12)));
    			}
    			catch (ParseException e)
    			{
    				addIssueMessage("xml response has an incorrect value for QUQI_IN010000UK14.creationTime field !", e);
    			}
			}
		}
		if(msg.getInteractionId() != null)
		{
			LOG.error("QUQI_IN010000UK14.interactionId = " + msg.getInteractionId().getExtension());
			pdsError.setInteractionId(msg.getInteractionId().getExtension());
		}
		if(msg.getProcessingCode() != null)
		{
			LOG.error("QUQI_IN010000UK14.processingCode = " + msg.getProcessingCode().getCode());
			pdsError.setProcessingCode(msg.getProcessingCode().getCode());
		}
		if(msg.getControlActEvent() != null && msg.getControlActEvent().getReasonArray() != null && msg.getControlActEvent().getReasonArray().length > 0)
		{
			QUQIMT030101UK03Reason reason = msg.getControlActEvent().getReasonArray()[0];
			
			if(reason.getJustifyingDetectedIssueEvent() != null && reason.getJustifyingDetectedIssueEvent().getCode() != null)
			{
				CD code = reason.getJustifyingDetectedIssueEvent().getCode();
				
				LOG.error("QUQI_IN010000UK14.JustifyingDetectedIssueEvent.code.DisplayName = " + code.getDisplayName());
    			pdsError.setQueryResponseCode(code.getDisplayName());
			}
		}
		
	}

	public PdsErrorVo getLastErrorDetails()
	{
		return pdsError;
	}
	
	public void setPdsErrorFromException(Exception e)
	{
		if(pdsError == null)
			pdsError = new PdsErrorVo();
		
		pdsError.setCreationTime(new DateTime());
		pdsError.setQueryResponseCode("Coding error: " + e.toString());
	}
	
	public CommChannelVo buildCommChannel(TELNPFITUseRequired telecom)
	{
		CommChannelVo commChannelVo = new CommChannelVo();
		
    	code = "";
    	
    	try
    	{
    		List use = telecom.getUse();

    		if(use != null && use.size() > 0)
    			code = use.get(0) != null ? use.get(0).toString() : "";
			else
				code = "";
    	} 
    	catch (org.apache.xmlbeans.impl.values.XmlValueOutOfRangeException ex)
    	{
    		//workaround for invalid values
    		code = parseInvalidSchemaValueFromXml(telecom.xgetUse(), "Telecom.Use");
    	}
		
    	if(code != null && code.length() > 0)
		{
			commChannelVo.setChannelUsage(getPdsChannelUsageByPdsMapping(code));
			
			if(commChannelVo.getChannelUsage() == null)
				addIssueMessage("No mapping of type PDS was found for PDSChannelUsage lookup and value '" + code + "' !", PdsQuery.PdsField.COMM_CHANNEL_USAGE);
		}
		else
		{
			addIssueMessage("Cannot find the 'use' property for COCT_MT000202UK02.PartOfWhole !");
			return null;
		}
		
		String value = telecom.getValue();
		if(value != null && value.length() > 0)
		{
			String[] parts = value.split(":");
			
			if(parts == null || parts.length < 2)
			{
				addIssueMessage("The 'value' property for COCT_MT000202UK02.PartOfWhole is invalid: " + value);
				return null;
			}
			else
			{
				commChannelVo.setChannelType(getChannelTypeByPdsMapping(parts[0]));
				commChannelVo.setCommValue(parts[1]);
				
				if(commChannelVo.getChannelType() == null)
				{
					addIssueMessage("The channel type part of 'value' property for COCT_MT000202UK02.PartOfWhole is not mapped for ChannelType lookup: " + value, PdsQuery.PdsField.COMM_CHANNEL_TYPE);
				}
				if(commChannelVo.getCommValue() == null)
				{
					addIssueMessage("The channel value part of 'value' property for COCT_MT000202UK02.PartOfWhole is null: " + value);
				}
			}
		}
		else
		{
			addIssueMessage("The 'value' property for COCT_MT000202UK02.PartOfWhole is empty !");
			return null;
		}
		
		if(telecom.getUseablePeriodArray() != null && telecom.getUseablePeriodArray().length > 0)
		{
			IVLTS useablePeriod = telecom.getUseablePeriodArray()[0];
			
			if(useablePeriod.getLow() != null && useablePeriod.getLow().getValue() != null)
			{
        		try
        		{
    				commChannelVo.setBeffdate(new ims.framework.utils.Date(useablePeriod.getLow().getValue().substring(0,8), DateFormat.ISO));
    				commChannelVo.setBeffdatecnf(Boolean.TRUE);
        		}
        		catch(Exception e)
        		{
        			addIssueMessage("xml response has an incorrect value for COCT_MT000202UK02.PartOfWhole.useablePeriod.low field !", e);
        		}
			}
			
			if(useablePeriod.getHigh() != null && useablePeriod.getHigh().getValue() != null)
			{
        		try
        		{
    				commChannelVo.setBetdate(new ims.framework.utils.Date(useablePeriod.getHigh().getValue().substring(0,8), DateFormat.ISO));
    				commChannelVo.setBetdatecnf(Boolean.TRUE);
    				
    				
    				// WDEV-21930 - If the business effective date has past, we are not interested in storing it
    				if (commChannelVo.getBetdateIsNotNull() && commChannelVo.getBetdate().isLessOrEqualThan(new ims.framework.utils.Date()))
    				{
    					return null;
    				}
        		}
        		catch(Exception e)
        		{
        			addIssueMessage("xml response has an incorrect value for COCT_MT000202UK02.PartOfWhole.useablePeriod.high field !", e);
        		}
			}
			
		}
		
		if(telecom.getId() != null)
		{
			commChannelVo.setObjectidentifier(telecom.getId().getExtension());
			
			if(telecom.getId().getExtension() == null || telecom.getId().getExtension().length() == 0)
			{
				addIssueMessage("The object identifier comm channel is empty !");
				return null;
			}
		}

		return commChannelVo;
	}
	
	public PDSChannelUsage getPdsChannelUsageByValue(String val)
	{
		String[] names = PDSChannelUsage.getNegativeInstanceNames();
		
		for(String name: names)
		{
			if(name.equals(val))
				return PDSChannelUsage.getNegativeInstance(name);
		}
		
		return null;
	}
	
	public PDSChannelUsage getPdsChannelUsageByPdsMapping(String type)
	{
		PDSChannelUsage lkp = (PDSChannelUsage)domain.getLookupService().getLocalLookup(PDSChannelUsage.class, PDSChannelUsage.TYPE_ID, "PDS", type);

		return lkp;
	}
	
	public ChannelType getChannelTypeByPdsMapping(String type)
	{
		ChannelType lkp = (ChannelType)domain.getLookupService().getLocalLookup(ChannelType.class, ChannelType.TYPE_ID, "PDS", type);

		return lkp;
	}
	
	public NameType getNameTypeByPdsMapping(String type)
	{
		NameType lkp = (NameType)domain.getLookupService().getLocalLookup(NameType.class, NameType.TYPE_ID, "PDS", type);

		return lkp;
	}
	
	public void populatePersonCommChannels(CommChannelVoCollection coll, COCTMT000202UK02PartOfWhole[] commChannels)
	{
		for(COCTMT000202UK02PartOfWhole commChannel : commChannels)
		{
			if(commChannel.getTelecom() != null)
			{
				TELNPFITUseRequired telecom = commChannel.getTelecom();

				CommChannelVo commChannelVo = buildCommChannel(telecom);
				
				if(commChannelVo != null)
				{
					coll.add(commChannelVo);
				}
			}
		}
		
	}
	
	public boolean createBackOfficeItemAndNotification(PDSBackOfficeType type, String errorDescription, PDSBackOfficeWorkPriority priority) throws PdsException
	{
		PDSBackOfficeItemVo item = buildBackOfficeItemAndNotification(type, errorDescription, priority);

        String[] errors = item.validate();
        if(errors != null && errors.length > 0)
        {
        	throw new PdsException("Validation errors while creating a BackOfficeItem: " + errors[0]);
        }
        
        try
		{
			impl.createBackOfficeItemAndNotification(item);
		}
		catch (DomainException e)
		{
			throw new PdsException(e);
		}

        return true;
	}

	public PDSBackOfficeItemVo buildBackOfficeItemAndNotification(PDSBackOfficeType type, String errorDescription, PDSBackOfficeWorkPriority priority) throws PdsException
	{
		PDSConfigurationVo pdsConfiguration = impl.getPdsConfiguration();
		
		PDSBackOfficeItemVo item = new PDSBackOfficeItemVo();

        item.setType(type);
        if(errorDescription == null)
        	item.setDescription("");
        else
        	item.setDescription(errorDescription.length() <= 200 ? errorDescription : errorDescription.substring(0, 199));
        item.setSource("PDS");
        item.setPriority(priority);
        item.setCurrentStatus(PDSBackOfficeWorkStatus.CREATED);

        PDSBackOfficeStatusVo statusHistory = new PDSBackOfficeStatusVo();
        statusHistory.setUpdateDate(new DateTime());
        statusHistory.setStatus(PDSBackOfficeWorkStatus.CREATED);

        item.setStatusHistory(new PDSBackOfficeStatusVoCollection());
        item.getStatusHistory().add(statusHistory);

        item.setNHSNumber(nhsNumber);
        item.setNHSNumberSuperseded(superseededNhsNumber);
        item.setPatient(patientInContext);

        if (pdsConfiguration.getCREATE_BO_NOTIFICATIONS() != null && Boolean.TRUE.equals(pdsConfiguration.getCREATE_BO_NOTIFICATIONS()))
        {
        	if(pdsConfiguration.getPDS_BACKOFFICE_NOTIFICATI() != null)
        	{
        		NotificationVo notification = new NotificationVo();

        		notification.setUser(impl.getAppUserById(pdsConfiguration.getPDS_BACKOFFICE_NOTIFICATI()));
        		notification.setDateTime(new DateTime());

        		if(PDSBackOfficeWorkPriority.P1.equals(priority))
        		  notification.setNotificationPriority(1);
        		else if(PDSBackOfficeWorkPriority.P2.equals(priority))
        		  notification.setNotificationPriority(2);
        		else
        		  notification.setNotificationPriority(3);

        		notification.setMessage(errorDescription);
        		notification.setSource("PDS");
        		notification.setSeen(Boolean.FALSE);

        		item.setNotifications(new NotificationVoCollection());
        		item.getNotifications().add(notification);
        	}
        	else
        	{
        		domain.createSystemLogEntry(SystemLogType.PDS, SystemLogLevel.ERROR, "PDS Back Office Notification User is not set and therefore cannot create back office notifications !");
        	}
        }

        return item;
	}
	
	private Object getDomainImpl(String className) throws Exception
	{
		DomainSession sess = DomainSession.getSession();
		Class<?> implClass = Class.forName(className);
		DomainImplFlyweightFactory factory = DomainImplFlyweightFactory.getInstance();
		return factory.create(implClass, sess);
	}

	public PatientRefVo getPatientInContext()
	{
		return patientInContext;
	}

	public void setPatientInContext(PatientRefVo patientInContext)
	{
		this.patientInContext = patientInContext;
	}

	public String getNhsNumber()
	{
		return nhsNumber;
	}

	public void setNhsNumber(String nhsNumber)
	{
		this.nhsNumber = nhsNumber;
	}
	
	public String getSuperseededNhsNumber()
	{
		return superseededNhsNumber;
	}

	public void setSuperseededNhsNumber(String superseededNhsNumber)
	{
		this.superseededNhsNumber = superseededNhsNumber;
	}

	public void populateExtraPdsRequestParams(PdsRequestParameters params) throws PdsException
	{
		PDSConfigurationVo pdsConfiguration = impl.getPdsConfiguration();
		
		if(pdsConfiguration == null)
			throw new PdsException("No PDS Configuration was found !");

		params.setPdsURL(pdsConfiguration.getPDS_URL());
		params.setPdsHost(pdsConfiguration.getPDS_HOST());
	}

	public PDSConfigurationVo getPdsConfiguration()
	{
		return impl.getPdsConfiguration();
	}
	
	public RBACBaselineJobRoleVo getRBACBaselineJobRole(RBACBaselineJobRoleRefVo role)
	{
		return impl.getRBACBaselineJobRole(role);
	}

	public String getPersonContactNumber(CommChannelVoCollection coll)
	{
		if(coll == null || coll.size() == 0)
			return "";

		//this is the order in which the person contact number is build
		//if the first type in the list is not null within the collection "coll" then that value is returned 
		//else if the second value is not null within the collection "coll" then that value is returned
		//...
		//feel free to change the order within "ct" or add more types
		
		ChannelType[] ct = new ChannelType[] {
		ChannelType.EMERGENCY, //WDEV-22220
		ChannelType.GEN_PHONE,
		ChannelType.HOME_PHONE,
		ChannelType.MOBILE,
		ChannelType.WORK_PHONE
		};
		
		for(ChannelType t : ct)
		{
			for(CommChannelVo cc : coll)
			{
				if(t.equals(cc.getChannelType()))
					return cc.getCommValue();
			}
		}
		
		return "";
	}

	public AddressType getAddressTypeByPdsMapping(String type)
	{
		AddressType lkp = (AddressType)domain.getLookupService().getLocalLookup(AddressType.class, AddressType.TYPE_ID, "PDS", type);

		return lkp;
	}
	
	public String parseInvalidSchemaValueFromXml(Object xmlObj, String element)
	{
		String code = "";
		
		if(xmlObj != null)
		{
			code = xmlObj.toString();
			
			try
			{
				DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
				Document doc = (Document) dBuilder.parse(new InputSource(new StringReader(code)));
				
				code = doc.getDocumentElement().getFirstChild().getNodeValue();
			}
			catch(Exception e)
			{
				code = "";
			}
			
			addIssueMessage("Xml PDS value out of range for element: '" + element + "' value: '" + code + "'.");
		}
		
		return code;
	}
	
	public PDSContactMethod getPreferredContactMethodByPdsMapping(String type)
	{
		PDSContactMethod lkp = (PDSContactMethod)domain.getLookupService().getLocalLookup(PDSContactMethod.class, PDSContactMethod.TYPE_ID, "PDS", type);

		return lkp;
	}

	public PreferredWrittenCommunication getPreferredWrittenCommunicationByPdsMapping(String type)
	{
		PreferredWrittenCommunication lkp = (PreferredWrittenCommunication)domain.getLookupService().getLocalLookup(PreferredWrittenCommunication.class, PreferredWrittenCommunication.TYPE_ID, "PDS", type);

		return lkp;
	}

	public PDSPreferredCommunicationLanguage getCommunicationLanguageByPdsMapping(String type)
	{
		PDSPreferredCommunicationLanguage lkp = (PDSPreferredCommunicationLanguage)domain.getLookupService().getLocalLookup(PDSPreferredCommunicationLanguage.class, PDSPreferredCommunicationLanguage.TYPE_ID, "PDS", type);

		return lkp;
	}

	public String getMissingMappingsAsText()
	{
		return getMissingMappingsAsText(missingMappings);
	}
	
	public String getMissingMappingsAsText(MissingMappingVoCollection coll)
	{
		if(coll == null || coll.size() == 0)
			return "";
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < coll.size(); i++)
		{
			sb.append(coll.get(i).getMessage());
			sb.append("\n");
		}

		return sb.toString();
	}

	public void displayMissingMappings(MissingMappingVoCollection missingMappings, UIEngine engine)
	{
		ArrayList errors = new ArrayList();
		
		errors.add("The local patient record could not be synchronized with PDS due to missing or incorrect mappings and requires MAXIMS Administration staff to resolve this.");
		errors.add(getMissingMappingsAsText(missingMappings));
		
		String[] template = new String[] {""};
		String[] patErrors = (String[]) errors.toArray(template);
		engine.showErrors(patErrors);
	}
	
	public void displayMissingMappings(MissingMappingVoCollection missingMappings, UIComponentEngine engine)
	{
		ArrayList errors = new ArrayList();
		
		errors.add("The local patient record could not be synchronized with PDS due to missing or incorrect mappings and requires MAXIMS Administration staff to resolve this.");
		errors.add(getMissingMappingsAsText(missingMappings));
		
		String[] template = new String[] {""};
		String[] patErrors = (String[]) errors.toArray(template);
		engine.showErrors(patErrors);
	}
	
}
