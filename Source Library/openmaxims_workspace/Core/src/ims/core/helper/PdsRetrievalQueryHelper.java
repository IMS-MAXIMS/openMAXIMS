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
import hl7OrgV3.COCTMT000201UK02PartOfWhole;
import hl7OrgV3.COCTMT000202UK02PartOfWhole;
import hl7OrgV3.COCTMT000203UK02PartOfWhole;
import hl7OrgV3.COCTMT000203UK02Person;
import hl7OrgV3.IINPfITOidMandatory;
import hl7OrgV3.INT;
import hl7OrgV3.IVLTS;
import hl7OrgV3.IVXBTS;
import hl7OrgV3.PN;
import hl7OrgV3.PRPAMT000201UK03Consent;
import hl7OrgV3.PRPAMT000201UK03DeathNotification;
import hl7OrgV3.PRPAMT000201UK03LanguageCommunication;
import hl7OrgV3.PRPAMT000201UK03LanguageCommunication.LanguageCode;
import hl7OrgV3.PRPAMT000201UK03LanguageCommunication.ProficiencyLevelCode;
import hl7OrgV3.PRPAMT000201UK03OtherProviderPatient;
import hl7OrgV3.PRPAMT000201UK03PDSResponse;
import hl7OrgV3.PRPAMT000201UK03Part4;
import hl7OrgV3.PRPAMT000201UK03PatientCareProvisionEvent;
import hl7OrgV3.PRPAMT000201UK03PatientRole;
import hl7OrgV3.PRPAMT000201UK03Performer;
import hl7OrgV3.PRPAMT000201UK03Person;
import hl7OrgV3.PRPAMT000201UK03PreferredContactMethod;
import hl7OrgV3.PRPAMT000201UK03PreferredContactTimes;
import hl7OrgV3.PRPAMT000201UK03PreferredWrittenCommunicationFormat;
import hl7OrgV3.PRPAMT000201UK03RelatedPersonRole;
import hl7OrgV3.PRPAMT000201UK03ReplacementOf;
import hl7OrgV3.PRPAMT000201UK03SerialChangeNumber.Value;
import hl7OrgV3.QUPAIN000009UK03Document;
import hl7OrgV3.impl.STImpl;
import ims.admin.vo.lookups.PDSDeathNotificationStatus;
import ims.configuration.gen.ConfigFlag;
import ims.core.vo.CommChannelVoCollection;
import ims.core.vo.NextOfKin;
import ims.core.vo.PDSPatientGPVo;
import ims.core.vo.PDSRelativeContactPrefVo;
import ims.core.vo.PatRelative;
import ims.core.vo.PatRelativeCollection;
import ims.core.vo.Patient;
import ims.core.vo.PatientContactPreferenceVo;
import ims.core.vo.PatientId;
import ims.core.vo.PatientIdCollection;
import ims.core.vo.PersonAddress;
import ims.core.vo.PersonAddressCollection;
import ims.core.vo.PersonName;
import ims.core.vo.PersonNameCollection;
import ims.core.vo.lookups.PDSConsent;
import ims.core.vo.lookups.PDSConsentType;
import ims.core.vo.lookups.PDSProvisionType;
import ims.core.vo.lookups.PatIdType;
import ims.core.vo.lookups.Sex;
import ims.domain.DomainInterface;
import ims.framework.enumerations.SystemLogLevel;
import ims.framework.enumerations.SystemLogType;
import ims.framework.utils.DateFormat;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.log4j.Logger;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlOptions;

public class PdsRetrievalQueryHelper extends PdsQuery
{
	private static final Logger LOG = Logger.getLogger(PdsRetrievalQueryHelper.class);
	
	public enum HistoricDataIndicator {OFF, ON}; 
	
	public PdsRetrievalQueryHelper(DomainInterface domain)
	{
		super(domain);
		
		super.xmlMessageName = "PRPA_MT000201UK03";
	}

	public Patient makeRequest(PdsRequestParameters params, String nhsNumber, HistoricDataIndicator historicDataIndicator) throws PdsException
	{
		missingMappings.clear();
		
		super.nhsNumber = nhsNumber;
		
		Patient pat = new Patient();
		
		//String url = "http://vpurdila-sv2:8080/PdsServer/SynchronousServlet";
		final String paramsInfo = "PdsRetrievalQuery accepts the following params:\r\n nhsNumber - mandatory\r\nhistoricDataIndicator - mandatory";
		
		String url = ConfigFlag.GEN.PDS_SYNC_GATEWAY_URL.getValue();
		
		if(nhsNumber == null || nhsNumber.length() == 0)
			throw new PdsException(paramsInfo);
		if(historicDataIndicator == null)
			throw new PdsException(paramsInfo);

		if(url == null || url.length() == 0)
			throw new PdsException("PDS_SYNC_GATEWAY_URL flag was not set !");
		
		if(!url.endsWith("/"))
			url += "/";
		
		url += "SynchronousServlet";
		
		populateExtraPdsRequestParams(params);
		
		String xml = "";
		String originalXml = "";
        PostMethod post = new PostMethod(url);

        sb.append("request: PdsRetrievalQuery");
        sb.append("\n");
        sb.append("nhsNumber: " + nhsNumber);
        sb.append("\n");
        sb.append( "historicDataIndicator: " + historicDataIndicator);
        sb.append("\n");
        sb.append("\n");
        sb.append("response:\n");
        
        try
        {
            NameValuePair[] data = 
            {
                new NameValuePair("request", "PdsRetrievalQuery"),
                new NameValuePair("nhsNumber", nhsNumber),
                new NameValuePair("historicDataIndicator", historicDataIndicator.equals(HistoricDataIndicator.ON) ? "1" : "0"),
                
                new NameValuePair("fromAccreditedSystemId", params.getFromAccreditedSystemId()),
                new NameValuePair("roleProfileCode", params.getRoleProfileCode()),
                new NameValuePair("sdsJobRoleCode", params.getSdsJobRoleCode()),
                new NameValuePair("toPDSAccreditedSystemId", params.getToPDSAccreditedSystemId()),
                new NameValuePair("userUUID", params.getUserUUID()),
                new NameValuePair("pdsURL", params.getPdsURL()),
                new NameValuePair("pdsHost", params.getPdsHost()),
                new NameValuePair("author1only", Boolean.TRUE.equals(params.isAuthor1only()) ? "1" : "0"),
                new NameValuePair("err", dummyError ? "1" : "0")
            };
            
            dummyError = false;

            post.setRequestBody(data);

            // execute method and handle any error responses.
            int iGetResultCode = client.executeMethod(post);

            if (iGetResultCode == HttpStatus.SC_OK)
            {
            	xml = new String(post.getResponseBody());
            }
            else
            {
                String err = "Error getting PdsRetrievalQuery response: " + iGetResultCode;
                sb.append(err);
                sb.append("\n");
                
                domain.createSystemLogEntry(SystemLogType.PDS, SystemLogLevel.ERROR, sb.toString());

                throw new PdsException(err);
            }
        }
        catch (Exception ex)
        {
            String err = "Error getting PdsRetrievalQuery response: " + ex.toString();
            sb.append(err);
            sb.append("\n");

            domain.createSystemLogEntry(SystemLogType.PDS, SystemLogLevel.ERROR, sb.toString());
            
            throw new PdsException(err, ex);
        }
        finally
        {
        	post.releaseConnection();
        }
		
        long t1 = System.currentTimeMillis();
        
        if(receivedErrorResponse(xml))
        	return null;

        originalXml = xml;
        //xml = xml.replaceAll("PDSResponse", "PDSResponsePRPAMT000201UK03");

        
        pat.setCommChannels(new CommChannelVoCollection());
        
        QUPAIN000009UK03Document docResponse;

        XmlOptions opts = new XmlOptions();
        ArrayList validationErrors = new ArrayList();
        opts.setErrorListener(validationErrors);
        LOG.info("XmlBeans version: " + XmlBeans.getVersion());
        
		try
		{
			docResponse = QUPAIN000009UK03Document.Factory.parse(xml, opts);
		}
		catch (XmlException ex)
		{
            String err = "Error parsing PdsRetrievalQuery response (QUPA_IN000009UK03): " + ex.toString();
            sb.append(err);
            sb.append("\n");
            sb.append("QUPA_IN000009UK03 xml content");
            sb.append("\n");
            sb.append(originalXml);
            
            domain.createSystemLogEntry(SystemLogType.PDS, SystemLogLevel.ERROR, sb.toString());

            throw new PdsException(err, ex);
		}

        long t2 = System.currentTimeMillis();
        
        PRPAMT000201UK03PDSResponse pdsResponse = null;
        
        if(docResponse.getQUPAIN000009UK03().getControlActEvent() != null &&
        		docResponse.getQUPAIN000009UK03().getControlActEvent().getSubject() != null &&
        				docResponse.getQUPAIN000009UK03().getControlActEvent().getSubject().getPDSResponse() != null)
        {
        	pdsResponse = docResponse.getQUPAIN000009UK03().getControlActEvent().getSubject().getPDSResponse();
        }
        
        if(pdsResponse == null)
        {
            String err = "Error parsing PdsRetrievalQuery response (QUPA_IN000009UK03): cound not find the PDSResponse in the message !";
            sb.append(err);
            sb.append("\n");
            sb.append("QUPA_IN000009UK03 xml content");
            sb.append("\n");
            sb.append(originalXml);
            
            domain.createSystemLogEntry(SystemLogType.PDS, SystemLogLevel.ERROR, sb.toString());

            throw new PdsException(err);
        }

        //PRPAMT000201UK03PDSResponse pdsResponse = doc.getPDSResponsePRPAMT000201UK03();
        /*
        /////// - simulation to be removed 
        TELNPFITUseRequired telecom = pdsResponse.getSubject().getPatientRole().getPatientPerson().addNewCOCTMT000202UK02PartOfWhole().addNewTelecom();
        List telUse = new ArrayList<String>();
        telUse.add("H");
        telecom.setUse(telUse);
        telecom.setValue("tel:01392251289");
        II telId = telecom.addNewId();
        telId.setRoot("2.16.840.1.113883.2.1.4.3");
        telId.setExtension("T01234567800");
        IVLTS telPeriod = telecom.addNewUseablePeriod();
        telPeriod.addNewLow().setValue("20040401");
        telPeriod.addNewHigh().setValue("20150401");

        telecom = pdsResponse.getSubject().getPatientRole().getPatientPerson().addNewCOCTMT000202UK02PartOfWhole().addNewTelecom();
        telUse.clear();
        telUse.add("WP");
        telecom.setUse(telUse);
        telecom.setValue("fax:01392251689");
        telId = telecom.addNewId();
        telId.setRoot("2.16.840.1.113883.2.1.4.3");
        telId.setExtension("T01234567801");
        telPeriod = telecom.addNewUseablePeriod();
        telPeriod.addNewLow().setValue("20050501");
        telPeriod.addNewHigh().setValue("20150101");
        
        //patient relatives
    	PRPAMT000201UK03PatientRole patientRoleTest = pdsResponse.getSubject().getPatientRole();
    	PRPAMT000201UK03Person personTest = patientRoleTest.getPatientPerson();
    	PRPAMT000201UK03RelatedPersonRole rpRole = personTest.addNewScopedRelatedPersonRole();
    	PRPAMT000201UK03NextOfKin nokTest = rpRole.addNewPart3().addNewPartNextOfKin();
    	//add nhs number for a relative
    	IINPfITOidMandatory idTest = rpRole.addNewPlayer().addNewPlayedRelatedPatient().addNewId();
    	idTest.setRoot("2.16.840.1.113883.2.1.4.1");
    	idTest.setExtension("");
        */
        /*
        PRPAMT000201UK03PatientCareProvisionEvent evt = pdsResponse.getSubject().getPatientRole().getPatientPerson().getPlayedOtherProviderPatientArray()[0].getSubjectOf().addNewPatientCareProvisionEvent();
        evt.addNewCode().setCode("1");
        evt.addNewId().setRoot("2.16.840.1.113883.2.1.3.2.4.18.1");
        II entId = evt.addNewPerformer().addNewAssignedEntity().addNewId();
        entId.setRoot("2.16.840.1.113883.2.1.4.3");
        entId.setExtension("E81046");
        
        System.out.println(pdsResponse.toString());
        */
        ///////

        //serial change number
        if(pdsResponse.getPertinentInformation() != null && pdsResponse.getPertinentInformation().getPertinentSerialChangeNumber() != null && pdsResponse.getPertinentInformation().getPertinentSerialChangeNumber().getValue() != null)
        {
        	Value scn = pdsResponse.getPertinentInformation().getPertinentSerialChangeNumber().getValue();
        	
        	pat.setSCN(scn.getValue().intValue());
        }
        
        if(pdsResponse.getSubject() != null && pdsResponse.getSubject().getPatientRole() != null && pdsResponse.getSubject().getPatientRole().getPatientPerson() != null)
        {
        	PRPAMT000201UK03PatientRole patientRole = pdsResponse.getSubject().getPatientRole();
        	
        	//confidentiality code
        	if(patientRole.getConfidentialityCode() != null)
        	{
				try
				{
					code = patientRole.getConfidentialityCode().getCode();
				} 
				catch (org.apache.xmlbeans.impl.values.XmlValueOutOfRangeException ex)
				{
					//workaround for invalid values
					code = parseInvalidSchemaValueFromXml(patientRole.getConfidentialityCode().xgetCode(), "ConfidentialityCode");
				}
        		
        		if("S".equals(code))
        		{
        			isConfidential = true;
        			pat.setIsConfidential(Boolean.TRUE);
        		}
        	}

        	//NHS number
        	populatePatientIdentifiers(pat, patientRole.getId());
        	
            if(!isConfidential)
            {
                LOG.info(originalXml);
            }
            
            //consent
            if(patientRole.getSubjectOf3Array() != null && patientRole.getSubjectOf3Array().length > 0)
            {
            	for(int i = 0; i < patientRole.getSubjectOf3Array().length; i++)
            	{
                	PRPAMT000201UK03Consent consent = patientRole.getSubjectOf3Array()[i].getConsent();
                	
                	if(consent.getCode() != null && consent.getCode().getCodeSystem() != null)
                	{
                		if(consent.getCode().getCodeSystem().equals("2.16.840.1.113883.2.1.3.2.4.17.164"))
                		{
                			try
                			{
                				code = consent.getCode().getCode();
                			} 
                			catch (org.apache.xmlbeans.impl.values.XmlValueOutOfRangeException ex)
                			{
                				//workaround for invalid values
                				code = parseInvalidSchemaValueFromXml(consent.getCode().xgetCode(), "Consent.Code");
                			}
                			
                    		if("4".equals(code))
                    		{
                        		if(pat.getAlternativeContact() == null)
                        			pat.setAlternativeContact(new PatientContactPreferenceVo());
                    			
                    			pat.getAlternativeContact().setPdsConsentType(PDSConsentType.NHSCARERECORDSHARING);
                    		}
                    		else if("6".equals(code))
                    		{
                        		if(pat.getAlternativeContact() == null)
                        			pat.setAlternativeContact(new PatientContactPreferenceVo());
                    			
                    			pat.getAlternativeContact().setPdsConsentType(PDSConsentType.CALLCENTRECALLBACK);
                    		}
                		}                			
                	}
                	
                	if(consent.getValue() != null && consent.getValue().getCodeSystem() != null)
                	{
                		if(consent.getValue().getCodeSystem().equals("2.16.840.1.113883.2.1.3.2.4.16.2"))
                		{
                			try
                			{
                				code = consent.getValue().getCode();
                			} 
                			catch (org.apache.xmlbeans.impl.values.XmlValueOutOfRangeException ex)
                			{
                				//workaround for invalid values
                				code = parseInvalidSchemaValueFromXml(consent.getValue().xgetCode(), "Consent.Value");
                			}
                    		
                    		if("1".equals(code))
                    		{
                    			if(pat.getAlternativeContact() == null)
                        			pat.setAlternativeContact(new PatientContactPreferenceVo());
                    			
                    			pat.getAlternativeContact().setPdsConsent(PDSConsent.EXPLICITCONSENT);
                    		}
                    		else if("2".equals(code))
                    		{
                    			if(pat.getAlternativeContact() == null)
                        			pat.setAlternativeContact(new PatientContactPreferenceVo());
                    			
                    			pat.getAlternativeContact().setPdsConsent(PDSConsent.EXPLICITDISSENT);
                    		}
                		}

                		hl7OrgV3.TS validTime = consent.getEffectiveTime();
        			    
        	    		if(validTime != null && validTime.getValue() != null && validTime.getValue().length() >= 8)
        	    		{
                    		if(pat.getAlternativeContact() == null)
                    			pat.setAlternativeContact(new PatientContactPreferenceVo());
        	    			
        	    			try
    						{
    							pat.getAlternativeContact().setPdsDateLastChanged(new ims.framework.utils.Date(validTime.getValue().substring(0,8), DateFormat.ISO));
    						}
    						catch (ParseException e)
    						{
    							addIssueMessage("xml response has an incorrect value for Consent.EffectiveTime field !", e);
    						}
        	    		}            		
                	}
            	}
            }
            
            //preferredContactMethod
            if(patientRole.getSubjectOf4() != null)
            {
            	PRPAMT000201UK03PreferredContactMethod preferredContactMethod = patientRole.getSubjectOf4().getPreferredContactMethod();
            	
            	if(preferredContactMethod.getCode() != null && preferredContactMethod.getCode().getCodeSystem() != null)
            	{
            		if(preferredContactMethod.getCode().getCodeSystem().equals("2.16.840.1.113883.2.1.3.2.4.17.35"))
            		{
            			try
            			{
            				code = preferredContactMethod.getCode().getCode();
            			} 
            			catch (org.apache.xmlbeans.impl.values.XmlValueOutOfRangeException ex)
            			{
            				//workaround for invalid values
            				code = parseInvalidSchemaValueFromXml(preferredContactMethod.getCode().xgetCode(), "PreferredContactMethod.Code");
            			}
            			
                		if("9".equals(code))
                		{
                			//get the value
                        	if(preferredContactMethod.getValue() != null && preferredContactMethod.getValue().getCodeSystem() != null)
                        	{
                        		if(preferredContactMethod.getValue().getCodeSystem().equals("2.16.840.1.113883.2.1.3.2.4.16.16"))
                        		{
                        			try
                        			{
                        				code = preferredContactMethod.getValue().getCode();
                        			} 
                        			catch (org.apache.xmlbeans.impl.values.XmlValueOutOfRangeException ex)
                        			{
                        				//workaround for invalid values
                        				code = parseInvalidSchemaValueFromXml(preferredContactMethod.getValue().xgetCode(), "PreferredContactMethod.Value");
                        			}

                            		if(pat.getAlternativeContact() == null)
                            			pat.setAlternativeContact(new PatientContactPreferenceVo());
                            		
                            		pat.getAlternativeContact().setPdsPreferredContactMethod(getPreferredContactMethodByPdsMapping(code));                            		
                        			
                        			if(pat.getAlternativeContact().getPdsPreferredContactMethod() == null)
                        			{
										addIssueMessage("PreferredContactMethod.Value property is not mapped for PDSContactMethod lookup: " + code, PdsQuery.PdsField.PREFERRED_CONTACT_METHOD);
                        			}
                        			
                        			//contact times
                        			if(preferredContactMethod.getPertinentInformation() != null && preferredContactMethod.getPertinentInformation().getPertinentPreferredContactTimes() != null)
                        			{
                        				PRPAMT000201UK03PreferredContactTimes preferredContactTimes = preferredContactMethod.getPertinentInformation().getPertinentPreferredContactTimes();
                        				
                        				if(preferredContactTimes.getValue() != null)
                        				{
                                    		if(pat.getAlternativeContact() == null)
                                    			pat.setAlternativeContact(new PatientContactPreferenceVo());

                                    		STImpl val = (STImpl) preferredContactTimes.getValue();
                                    		
                                    		pat.getAlternativeContact().setPdsPreferredContactTimes(val.getStringValue());
                        				}
                        			}
                        		}                        		
                        	}
                		}
            		}                			
            	}
            }

            //writtenCommunicationFormat
            if(patientRole.getSubjectOf5() != null)
            {
            	PRPAMT000201UK03PreferredWrittenCommunicationFormat writtenCommunicationFormat = patientRole.getSubjectOf5().getPreferredWrittenCommunicationFormat();
            	
    			//get the value
            	if(writtenCommunicationFormat.getValue() != null && writtenCommunicationFormat.getValue().getCodeSystem() != null)
            	{
            		if(writtenCommunicationFormat.getValue().getCodeSystem().equals("2.16.840.1.113883.2.1.3.2.4.16.17"))
            		{
            			try
            			{
            				code = writtenCommunicationFormat.getValue().getCode();
            			} 
            			catch (org.apache.xmlbeans.impl.values.XmlValueOutOfRangeException ex)
            			{
            				//workaround for invalid values
            				code = parseInvalidSchemaValueFromXml(writtenCommunicationFormat.getValue().xgetCode(), "WrittenCommunicationFormat.Value");
            			}

                		if(pat.getAlternativeContact() == null)
                			pat.setAlternativeContact(new PatientContactPreferenceVo());
                		
                		pat.getAlternativeContact().setPdsPreferredWrittenComm(getPreferredWrittenCommunicationByPdsMapping(code));                            		
            			
            			if(pat.getAlternativeContact().getPdsPreferredWrittenComm() == null)
            			{
            				addIssueMessage("WrittenCommunicationFormat.Value property is not mapped for PreferredWrittenCommunication lookup: " + code, PdsQuery.PdsField.PREFERRED_WRITTEN_COMM);
            			}
            		}                			
            	}
            }
            
        	PRPAMT000201UK03Person person = patientRole.getPatientPerson();
        	
        	//person address
        	if(person.getCOCTMT000201UK02PartOfWholeArray() != null)
        	{
        		boolean foundPrimary = false;
        		for(COCTMT000201UK02PartOfWhole addr : person.getCOCTMT000201UK02PartOfWholeArray())
        		{
        			if(addr.getAddr() != null)
        			{
        				try
        				{
        					if(addr.getAddr().getUse().size() > 0)
        						code = addr.getAddr().getUse().get(0) != null ? addr.getAddr().getUse().get(0).toString() : "";
    						else
    							code = "";
        				} 
        				catch (org.apache.xmlbeans.impl.values.XmlValueOutOfRangeException ex)
        				{
        					//workaround for invalid values
        					code = parseInvalidSchemaValueFromXml(addr.getAddr().xgetUse(), "Address.Use");
        				}
        				
        				
        				if("H".equals(code) && !foundPrimary)
                    	{
                    		//primary address
        					if(pat.getAddress() == null)
        						pat.setAddress(new PersonAddress());
        					
        		        	populatePatientAddress(pat.getAddress() , addr.getAddr());
        		        	foundPrimary = true;
                    	}
                    	else
                    	{
        					//other address
                    		if(pat.getAddresses() == null)
        						pat.setAddresses(new PersonAddressCollection());
                    		
        					PersonAddress pa = new PersonAddress();
        					populatePatientAddress(pa , addr.getAddr());
        					pat.getAddresses().add(pa);
                    	}
        			}
        		}
        	}
        	
        	//sex
        	if(person.getAdministrativeGenderCode() != null)
        	{
				try
				{
					code = person.getAdministrativeGenderCode().getCode();
				} 
				catch (org.apache.xmlbeans.impl.values.XmlValueOutOfRangeException ex)
				{
					//workaround for invalid values
					code = parseInvalidSchemaValueFromXml(person.getAdministrativeGenderCode().xgetCode(), "AdministrativeGenderCode");
				}
        		
        		//1 = Male, 2 = Female
        		if("1".equals(code))
				{
        			pat.setSex(Sex.MALE);
				}
        		else if("2".equals(code))
				{
        			pat.setSex(Sex.FEMALE);
				}
        		else
				{
        			pat.setSex(Sex.UNKNOWN);
				}
        	}
        	
        	COCTMT000203UK02PartOfWhole[] nameParts = person.getCOCTMT000203UK02PartOfWholeArray();
        	
        	if(nameParts != null && nameParts.length > 0)
        	{
        		PersonNameCollection names = new PersonNameCollection();
        		
        		boolean nameFound = false;
        		for(COCTMT000203UK02PartOfWhole namePart : nameParts)
            	{
                	PN partName = namePart.getPartPerson().getName();
                	List use = null;
                	
                	code = "";
                	
                	try
                	{
                		use = partName.getUse();                		
                		
                		if(use != null && use.size() > 0)
                			code = use.get(0) != null ? use.get(0).toString() : "";
            			else
            				code = "";
                	} 
                	catch (org.apache.xmlbeans.impl.values.XmlValueOutOfRangeException ex)
                	{
                		//workaround for invalid values
                		code = parseInvalidSchemaValueFromXml(partName.xgetUse(), "Name.Use");
                	}
                	
                	if(code != null && code.length() > 0)
                	{
                		PersonName pn = new PersonName();
                		populatePN(pn, partName);
                		pn.setNameType(getNameTypeByPdsMapping(code));
                		
                		if("L".equals(code) && !nameFound)
                		{
                			pat.setName(pn);
                			nameFound = true;
                		}
                		else
                			names.add(pn);
                		
                		if(pn.getNameType() == null)
                		{
                			addIssueMessage("No mapping of type PDS was found for NameType lookup and value '" + code + "' !", PdsQuery.PdsField.NAME_TYPE);
                		}
                	}
            	}
        		
        		if(pat.getName() == null)
        			addIssueMessage("No person name of type L was found in PDS retrieval response!");        		
        		
        		if(names.size() > 0)
        			pat.setOtherNames(names);
        		
            	populateBirthTime(pat, person.getBirthTime());
            	populateDeceasedTime(pat, person.getDeceasedTime());
            	
            	//patient comm channels
            	if(person.getCOCTMT000202UK02PartOfWholeArray() != null && person.getCOCTMT000202UK02PartOfWholeArray().length > 0)
            	{
            		COCTMT000202UK02PartOfWhole[] commChannels = person.getCOCTMT000202UK02PartOfWholeArray();

					if(pat.getCommChannels() == null)
						pat.setCommChannels(new CommChannelVoCollection());
					
					populatePersonCommChannels(pat.getCommChannels(), commChannels);
            	}
            	
            	//patient GP / practice
            	if(person.getPlayedOtherProviderPatientArray() != null && person.getPlayedOtherProviderPatientArray().length > 0)
            	{
            		PRPAMT000201UK03OtherProviderPatient poppa = person.getPlayedOtherProviderPatientArray()[0]; 
            				
            		if(poppa.getSubjectOf() != null && poppa.getSubjectOf().getPatientCareProvisionEvent() != null)
            		{
                		PDSPatientGPVo gpp;
                		                		
                		if(pat.getPDSPatientGP() != null)
                			gpp = pat.getPDSPatientGP();
                		else
                		{
                			gpp = new PDSPatientGPVo();
                			pat.setPDSPatientGP(gpp);
                		}
                		
                		PRPAMT000201UK03PatientCareProvisionEvent careProvisionEvent = poppa.getSubjectOf().getPatientCareProvisionEvent();
    
                		try
                		{
                			if(careProvisionEvent.getCode() != null)
                				code = careProvisionEvent.getCode().getCode();
                			else
                				code = "";
                		} 
                		catch (org.apache.xmlbeans.impl.values.XmlValueOutOfRangeException ex)
                		{
                			//workaround for invalid values
                			code = parseInvalidSchemaValueFromXml(careProvisionEvent.getCode().xgetCode(), "CareProvisionEvent.Code");
                		}
                		
						//WDEV-22199
                		if("1".equals(code))
                		{
                			gpp.setLkp_provisiontype(PDSProvisionType.PRIMARYCARE);
                			
                			if(careProvisionEvent.getId() != null)
                				gpp.setObjectidentifier(careProvisionEvent.getId().getExtension());
                			
                			if(careProvisionEvent.getPerformer() != null)
                			{
                				PRPAMT000201UK03Performer performer = careProvisionEvent.getPerformer();
                				
                				if(performer.getAssignedEntity() != null && performer.getAssignedEntity().getId() != null)
                				{
                					IINPfITOidMandatory id = performer.getAssignedEntity().getId();
                					
                					gpp.setPrimaryCareIdentifier(id.getExtension());
                					
                				}
                			}
                			
                			if(careProvisionEvent.getEffectiveTime() != null)
                			{
                				IVLTS validTime = careProvisionEvent.getEffectiveTime();
    
                	    		//beffdate & beffdatecnf
                	    		if(validTime.getLow() != null)
                	    		{
                	    			IVXBTS low = validTime.getLow();
                	    			
                	        		try
                	        		{
                	        			gpp.setBeffdate(new ims.framework.utils.Date(low.getValue().substring(0,8), DateFormat.ISO));
                	        			gpp.setBeffdatecnf(Boolean.TRUE);
                	        		}
                	        		catch(Exception e)
                	        		{
                	        			addIssueMessage("xml response has an incorrect value for CareProvision.validTime.low field !", e);
                	        		}
                	    		}
                	    		
                	    		//betdate & Betdatecnf
                	    		if(validTime.getHigh() != null)
                	    		{
                	    			IVXBTS high = validTime.getHigh();
                	    			
                	        		try
                	        		{
                	        			gpp.setBetdate(new ims.framework.utils.Date(high.getValue().substring(0,8), DateFormat.ISO));
                	        			gpp.setBetdatecnf(Boolean.TRUE);
                	        		}
                	        		catch(Exception e)
                	        		{
                	        			addIssueMessage("xml response has an incorrect value for CareProvision.validTime.high field !", e);
                	        		}
                	    		}
                			}
                		}
						//WDEV-22199
                	}           
            	}
            	
            	//NOK
            	if(person.getScopedRelatedPersonRoleArray() != null && person.getScopedRelatedPersonRoleArray().length > 0)
            	{
            	
            		//WDEV-22172
            		boolean historic = false;
            		
            		for(PRPAMT000201UK03RelatedPersonRole relatedPersonRole : person.getScopedRelatedPersonRoleArray())
            		{
            			
            			historic = false;
                		//Check the effective dates to see if this is a historic record, therfore will not need to be processed.
                    	if(relatedPersonRole.getEffectiveTime() != null)
                    	{
            				IVLTS effectiveToTime = relatedPersonRole.getEffectiveTime();
            			    
            	    		//effectiveTo date
            	    		if(effectiveToTime.getHigh() != null)
            	    		{
            	    			IVXBTS high = effectiveToTime.getHigh();
            	    			ims.framework.utils.Date highDate;
								try {
									highDate = new ims.framework.utils.Date(high.getValue().substring(0,8), DateFormat.ISO);
	            	    			if (highDate.isLessOrEqualThan(new ims.framework.utils.Date()))
	            	    				historic = true;	            	    				
								} catch (ParseException e) 
								{
									addIssueMessage("xml response has an incorrect value for relatedPersonRole.EffectiveTime.high field !", e);
								}
            	    		}
                    	}
                    	
            	    	if (!historic)
            	    	{
	            			IINPfITOidMandatory relID = relatedPersonRole.getId();
	            			String objectIdentifier = null;
	            			
	            			if(relID != null)
	            				objectIdentifier = relID.getExtension();
	            				            			
	            			if(relatedPersonRole.getPart3() != null 
	            					&& relatedPersonRole.getPart3().getPartNextOfKin() != null 
	            					&& relatedPersonRole.getPlayer() != null
	            					&& relatedPersonRole.getPart3().getPartNextOfKin().getCode()!=null
	            					&& relatedPersonRole.getPart3().getPartNextOfKin().getCode().getCode()!=null
	            					&& relatedPersonRole.getPart3().getPartNextOfKin().getCode().getCode().equals("1"))
	            			{
	    						NextOfKin nok;
	    						
	    						if(pat.getNokIsNotNull())
	    							nok = pat.getNok();
	    						else
	    						{
	    							nok = new NextOfKin();
	    							pat.setNok(nok);
	    						}
	            				
	    						if(relatedPersonRole.getPlayer() != null 
	    								&& relatedPersonRole.getPlayer().getPlayedRelatedPatient() != null
	    								&& relatedPersonRole.getPlayer().getPlayedRelatedPatient().getId() != null
	    								&& relatedPersonRole.getPlayer().getPlayedRelatedPatient().getId().getExtension() != null
	    								)
	    						{
	    							nok.setNhsNum(relatedPersonRole.getPlayer().getPlayedRelatedPatient().getId().getExtension());
	    						}
	    						else
	    						{
	                				//NOK person name
	                				if(relatedPersonRole.getPlayer() != null 
	                						&& relatedPersonRole.getPlayer().getCOCTMT000203UK02PartOfWhole() != null 
	                						&& relatedPersonRole.getPlayer().getCOCTMT000203UK02PartOfWhole().getPartPerson() != null)
	                				{
	                					COCTMT000203UK02Person partPerson = relatedPersonRole.getPlayer().getCOCTMT000203UK02PartOfWhole().getPartPerson();
	    
	                					if(partPerson.getName() != null)
	                					{
	                						PN pn = partPerson.getName();
	                						
	                						if(nok.getName() == null)
	                							nok.setName(new PersonName());
	    
	                	                	try
	                	                	{
	                	                		List use = pn.getUse();
	
	                	                		if(use != null && use.size() > 0)
	                	                			code = use.get(0) != null ? use.get(0).toString() : "";
	                	            			else
	                	            				code = "";
	                	                	} 
	                	                	catch (org.apache.xmlbeans.impl.values.XmlValueOutOfRangeException ex)
	                	                	{
	                	                		//workaround for invalid values
	                	                		code = parseInvalidSchemaValueFromXml(pn.xgetUse(), "NOK.Name.Use");
	                	                	}
	                	                	
	                	                	
	                	                	if("L".equals(code))
	                	                	{
	                	                    	//"L" is current person name
	                	                		populatePN(nok.getName(), pn);
	                	                	}
	                					}
	                				}
	                				
	                				//NOK person address
	                				if(relatedPersonRole.getPlayer() != null 
	                						&& relatedPersonRole.getPlayer().getCOCTMT000201UK02PartOfWhole() != null 
	                						&& relatedPersonRole.getPlayer().getCOCTMT000201UK02PartOfWhole().getAddr() != null)
	                				{
	                					AD ad = relatedPersonRole.getPlayer().getCOCTMT000201UK02PartOfWhole().getAddr();
	            						
	            						if(nok.getAddress() == null)
	            							nok.setAddress(new PersonAddress());
	                					
	                		        	populatePatientAddress(nok.getAddress() , ad);
	                				}
	                				
	                				//WDEV-22200
	                				//rel person comm channels
	                				if(relatedPersonRole.getPlayer() != null 
	                						&& relatedPersonRole.getPlayer().getCOCTMT000202UK02PartOfWholeArray() != null
	                						&& relatedPersonRole.getPlayer().getCOCTMT000202UK02PartOfWholeArray().length > 0)
	                				{
	                					if(nok.getCommChannels() == null)
	                						nok.setCommChannels(new CommChannelVoCollection());
	                					
	                					populatePersonCommChannels(nok.getCommChannels(), relatedPersonRole.getPlayer().getCOCTMT000202UK02PartOfWholeArray());
	                				}
	                				//WDEV-22200
	                				
	    						}
	
	    	                	//relationship type for NOK
	    	                	if(relatedPersonRole.getCode() != null)
	    	                	{
	    	                		try
	    	                		{
	    	                			code = relatedPersonRole.getCode().getCode();
	    	                		} 
	    	                		catch (org.apache.xmlbeans.impl.values.XmlValueOutOfRangeException ex)
	    	                		{
	    	                			//workaround for invalid values
	    	                			code = parseInvalidSchemaValueFromXml(relatedPersonRole.getCode().xgetCode(), "RelatedPersonRole.Code");
	    	                		}
	    	                		
	    	                		nok.setRelationship(getPersonRelationship(code));
	    	                		
	    	                		if(nok.getRelationship() == null)
	    	                		{
	    	                    		addIssueMessage("No mapping of type PDS was found for PersonRelationship lookup and value '" + code + "' !", PdsQuery.PdsField.RELATIONSHIP);
	    	                		}
	    	                	}
	    	                	
	    	                	//NOK role
	    	                	if(relatedPersonRole.getClassCode() != null)
	    	                	{
	    	                		nok.setRole(getPDSPersonRole(relatedPersonRole.getClassCode()));
	    	                		
	    	                		if(nok.getRole() == null)
	    	                		{
	    	                    		addIssueMessage("No mapping of type PDS was found for PDSPersonRole lookup and value '" + relatedPersonRole.getClassCode() + "' !", PdsQuery.PdsField.ROLE);
	    	                		}
	    	                	}
	    	                	
	    	                	//contact ranking
	    	                	if(relatedPersonRole.getPositionNumber() != null)
	    	                	{
	    	                		try
	    	                		{
	    	                			INT pos = relatedPersonRole.getPositionNumber();
	    	                			code = pos.getValue().toString();
	    	                		} 
	    	                		catch (org.apache.xmlbeans.impl.values.XmlValueOutOfRangeException ex)
	    	                		{
	    	                			//workaround for invalid values
	    	                			parseInvalidSchemaValueFromXml(relatedPersonRole.getPositionNumber().xgetValue(), "RelatedPersonRole.PositionNumber");
	    	                			code = null;
	    	                		}
	    	                		
	    	                		nok.setContactRank(code);
	    	                	}
	    	                	
	    	                	//WDEV-22188
                				//WDEV-22200
	    	                	//partCorrespondence
	    	                	PRPAMT000201UK03Part4 corresp = relatedPersonRole.getPart4();
	    	                	//[1..1]  [M] code (CV {CNE:CorrespondenceCode } ) { Fixed="1" } This is a fixed value and will alway be 1.
	    	                	//If the part is not availabel , then set CpyCorresp to False
	    	                	if (corresp!=null
	    	                			&& corresp.getPartCorrespondence()!=null
	    	                			&& corresp.getPartCorrespondence().getCode()!=null
	    	                			&& corresp.getPartCorrespondence().getCode().getCode()!=null
	    	                			&& corresp.getPartCorrespondence().getCode().getCode().equals("1"))
	    	                		nok.setCpyCorresp(Boolean.TRUE);
	    	                	else
	    	                		nok.setCpyCorresp(Boolean.FALSE);
                				//WDEV-22200
	    	                	//WDEV-22188
	    	                	
	    	                    //preferredContactMethod - subjectOf1
	    	                    if(relatedPersonRole.getSubjectOf1() != null)
	    	                    {
	    	                    	PRPAMT000201UK03PreferredContactMethod preferredContactMethod = relatedPersonRole.getSubjectOf1().getPreferredContactMethod();
	    	                    	
	    	                    	if(preferredContactMethod.getCode() != null && preferredContactMethod.getCode().getCodeSystem() != null)
	    	                    	{
	    	                    		if(preferredContactMethod.getCode().getCodeSystem().equals("2.16.840.1.113883.2.1.3.2.4.17.35"))
	    	                    		{
	    	                    			try
	    	                    			{
	    	                    				code = preferredContactMethod.getCode().getCode();
	    	                    			} 
	    	                    			catch (org.apache.xmlbeans.impl.values.XmlValueOutOfRangeException ex)
	    	                    			{
	    	                    				//workaround for invalid values
	    	                    				code = parseInvalidSchemaValueFromXml(preferredContactMethod.getCode().xgetCode(), "PreferredContactMethod.Code");
	    	                    			}
	    	                    			
	    	                        		if("9".equals(code))
	    	                        		{
	    	                        			//get the value
	    	                                	if(preferredContactMethod.getValue() != null && preferredContactMethod.getValue().getCodeSystem() != null)
	    	                                	{
	    	                                		if(preferredContactMethod.getValue().getCodeSystem().equals("2.16.840.1.113883.2.1.3.2.4.16.16"))
	    	                                		{
	    	                                			try
	    	                                			{
	    	                                				code = preferredContactMethod.getValue().getCode();
	    	                                			} 
	    	                                			catch (org.apache.xmlbeans.impl.values.XmlValueOutOfRangeException ex)
	    	                                			{
	    	                                				//workaround for invalid values
	    	                                				code = parseInvalidSchemaValueFromXml(preferredContactMethod.getValue().xgetCode(), "PreferredContactMethod.Value");
	    	                                			}

	    	                                    		if(nok.getPDScontactPreferences() == null)
	    	                                    			nok.setPDScontactPreferences(new PDSRelativeContactPrefVo());
	    	                                    		
	    	                                    		nok.getPDScontactPreferences().setPreferredContactMethod(getPreferredContactMethodByPdsMapping(code));                            		
	    	                                			
	    	                                			if(nok.getPDScontactPreferences().getPreferredContactMethod() == null)
	    	                                			{
	    	        										addIssueMessage("PreferredContactMethod.Value property is not mapped for PDSContactMethod lookup: " + code, PdsQuery.PdsField.PREFERRED_CONTACT_METHOD);
	    	                                			}
	    	                                			
	    	                                			//contact times
	    	                                			if(preferredContactMethod.getPertinentInformation() != null && preferredContactMethod.getPertinentInformation().getPertinentPreferredContactTimes() != null)
	    	                                			{
	    	                                				PRPAMT000201UK03PreferredContactTimes preferredContactTimes = preferredContactMethod.getPertinentInformation().getPertinentPreferredContactTimes();
	    	                                				
	    	                                				if(preferredContactTimes.getValue() != null)
	    	                                				{
	    	                                            		if(nok.getPDScontactPreferences() == null)
	    	                                            			nok.setPDScontactPreferences(new PDSRelativeContactPrefVo());

	    	                                            		STImpl val = (STImpl) preferredContactTimes.getValue();
	    	                                            		
	    	                                            		nok.getPDScontactPreferences().setPdsPreferredContactTimes(val.getStringValue());
	    	                                				}
	    	                                			}
	    	                                		}                        		
	    	                                	}
	    	                        		}
	    	                    		}                			
	    	                    	}
	    	                    }
	    	                    
	    	                    //writtenCommunicationFormat
	    	                    if(relatedPersonRole.getSubjectOf2() != null)
	    	                    {
	    	                    	PRPAMT000201UK03PreferredWrittenCommunicationFormat writtenCommunicationFormat = relatedPersonRole.getSubjectOf2().getPreferredWrittenCommunicationFormat();
	    	                    	
	    	            			//get the value
	    	                    	if(writtenCommunicationFormat.getValue() != null && writtenCommunicationFormat.getValue().getCodeSystem() != null)
	    	                    	{
	    	                    		if(writtenCommunicationFormat.getValue().getCodeSystem().equals("2.16.840.1.113883.2.1.3.2.4.16.17"))
	    	                    		{
	    	                    			try
	    	                    			{
	    	                    				code = writtenCommunicationFormat.getValue().getCode();
	    	                    			} 
	    	                    			catch (org.apache.xmlbeans.impl.values.XmlValueOutOfRangeException ex)
	    	                    			{
	    	                    				//workaround for invalid values
	    	                    				code = parseInvalidSchemaValueFromXml(writtenCommunicationFormat.getValue().xgetCode(), "WrittenCommunicationFormat.Value");
	    	                    			}

	    	                        		if(nok.getPDScontactPreferences() == null)
	    	                        			nok.setPDScontactPreferences(new PDSRelativeContactPrefVo());
	    	                        		
	    	                        		nok.getPDScontactPreferences().setPdsPreferredWrittenComm(getPreferredWrittenCommunicationByPdsMapping(code));                            		
	    	                    			
	    	                    			if(nok.getPDScontactPreferences().getPdsPreferredWrittenComm() == null)
	    	                    			{
	    	                    				addIssueMessage("WrittenCommunicationFormat.Value property is not mapped for PreferredWrittenCommunication lookup: " + code, PdsQuery.PdsField.PREFERRED_WRITTEN_COMM);
	    	                    			}
	    	                    		}                			
	    	                    	}
	    	                    }	    	                    
	    	                    
                				//WDEV-22200
	    	                	
	    	                	//NOK effective time
	    	                	if(relatedPersonRole.getEffectiveTime() != null)
	    	                	{
	                				IVLTS validTime = relatedPersonRole.getEffectiveTime();
	                			    
	                	    		//beffdate & beffdatecnf
	                	    		if(validTime.getLow() != null)
	                	    		{
	                	    			IVXBTS low = validTime.getLow();
	                	    			
	                	        		try
	                	        		{
	                	        			nok.setBeffdate(new ims.framework.utils.Date(low.getValue().substring(0,8), DateFormat.ISO));
	                	        			nok.setBeffdatecnf(Boolean.TRUE);
	                	        		}
	                	        		catch(Exception e)
	                	        		{
	                	        			addIssueMessage("xml response has an incorrect value for relatedPersonRole.EffectiveTime.low field !", e);
	                	        		}
	                	    		}
	                	    		
	                	    		//betdate & Betdatecnf
	                	    		if(validTime.getHigh() != null)
	                	    		{
	                	    			IVXBTS high = validTime.getHigh();
	                	    			
	                	        		try
	                	        		{
	                	        			nok.setBetdate(new ims.framework.utils.Date(high.getValue().substring(0,8), DateFormat.ISO));
	                	        			nok.setBetdatecnf(Boolean.TRUE);
	                	        		}
	                	        		catch(Exception e)
	                	        		{
	                	        			addIssueMessage("xml response has an incorrect value for relatedPersonRole.EffectiveTime.high field !", e);
	                	        		}
	                	    		}
	    	                		
	    	                	}   
	    	                	    	                	
	    	                	nok.setNokInd(Boolean.TRUE);
	    	                	nok.setObjectidentifier(objectIdentifier);
	    	                	
	    	                	if(pat.getPDSrelatives() == null)
	    	                		pat.setPDSrelatives(new PatRelativeCollection());
	    	                	
	    	                	pat.getPDSrelatives().add(nok);
	            			}
	            			else
	            			{
	            				//patient relative
	    						PatRelative rel = new PatRelative();
	    						PatRelativeCollection relColl = pat.getPDSrelatives();    						
	    						if(relColl == null)
	    						{
	    							relColl = new PatRelativeCollection();
	    							pat.setPDSrelatives(relColl);
	    						}
	    						
	    						rel.setObjectidentifier(objectIdentifier);
	            				
	    						relColl.add(rel);
	    						
	    						if(relatedPersonRole.getPlayer() != null 
	    								&& relatedPersonRole.getPlayer().getPlayedRelatedPatient() != null
	    								&& relatedPersonRole.getPlayer().getPlayedRelatedPatient().getId() != null
	    								&& relatedPersonRole.getPlayer().getPlayedRelatedPatient().getId().getExtension() != null
	    								)
	    						{
	    							rel.setNhsNum(relatedPersonRole.getPlayer().getPlayedRelatedPatient().getId().getExtension());
	    						}
	    						else
	    						{
	                				//rel person name
	                				if(relatedPersonRole.getPlayer() != null 
	                						&& relatedPersonRole.getPlayer().getCOCTMT000203UK02PartOfWhole() != null 
	                						&& relatedPersonRole.getPlayer().getCOCTMT000203UK02PartOfWhole().getPartPerson() != null)
	                				{
	                					COCTMT000203UK02Person partPerson = relatedPersonRole.getPlayer().getCOCTMT000203UK02PartOfWhole().getPartPerson();
	    
	                					if(partPerson.getName() != null)
	                					{
	                						PN pn = partPerson.getName();
	                						
	                						if(rel.getName() == null)
	                							rel.setName(new PersonName());
	
	                	                	try
	                	                	{
	                	                		List use = pn.getUse();
	
	                	                		if(use != null && use.size() > 0)
	                	                			code = use.get(0) != null ? use.get(0).toString() : "";
	                	            			else
	                	            				code = "";
	                	                	} 
	                	                	catch (org.apache.xmlbeans.impl.values.XmlValueOutOfRangeException ex)
	                	                	{
	                	                		//workaround for invalid values
	                	                		code = parseInvalidSchemaValueFromXml(pn.xgetUse(), "Relative.Name.Use");
	                	                	}
	                						
	                	                	if("L".equals(code))
	                	                	{
	                	                    	//"L" is current person name
	                	                		populatePN(rel.getName(), pn);
	                	                	}
	                					}
	                				}
	                				
	                				//rel person address
	                				if(relatedPersonRole.getPlayer() != null 
	                						&& relatedPersonRole.getPlayer().getCOCTMT000201UK02PartOfWhole() != null 
	                						&& relatedPersonRole.getPlayer().getCOCTMT000201UK02PartOfWhole().getAddr() != null)
	                				{
	                					AD ad = relatedPersonRole.getPlayer().getCOCTMT000201UK02PartOfWhole().getAddr();
	            						
	            						if(rel.getAddress() == null)
	            							rel.setAddress(new PersonAddress());
	                					
	                		        	populatePatientAddress(rel.getAddress() , ad);
	                				}
	                				
	                				//rel person comm channels
	                				if(relatedPersonRole.getPlayer() != null 
	                						&& relatedPersonRole.getPlayer().getCOCTMT000202UK02PartOfWholeArray() != null
	                						&& relatedPersonRole.getPlayer().getCOCTMT000202UK02PartOfWholeArray().length > 0)
	                				{
	                					if(rel.getCommChannels() == null)
	                						rel.setCommChannels(new CommChannelVoCollection());
	                					
	                					populatePersonCommChannels(rel.getCommChannels(), relatedPersonRole.getPlayer().getCOCTMT000202UK02PartOfWholeArray());
	                				}
	    						}
	
	    	                	//relationship type for rel
	    	                	if(relatedPersonRole.getCode() != null)
	    	                	{
	    	                		try
	    	                		{
	    	                			code = relatedPersonRole.getCode().getCode();
	    	                		} 
	    	                		catch (org.apache.xmlbeans.impl.values.XmlValueOutOfRangeException ex)
	    	                		{
	    	                			//workaround for invalid values
	    	                			code = parseInvalidSchemaValueFromXml(relatedPersonRole.getCode().xgetCode(), "RelatedPersonRole.Code");
	    	                		}
	    	                		
	    	                		rel.setRelationship(getPersonRelationship(code));
	    	                		
	    	                		if(rel.getRelationship() == null)
	    	                		{
	    	                    		addIssueMessage("No mapping of type PDS was found for PersonRelationship lookup and value '" + code + "' !", PdsQuery.PdsField.RELATIONSHIP);
	    	                		}
	    	                		
	    	                	}
	    	                	
	    	                	//rel role
	    	                	if(relatedPersonRole.getClassCode() != null)
	    	                	{
	    	                		rel.setRole(getPDSPersonRole(relatedPersonRole.getClassCode()));
	    	                		
	    	                		if(rel.getRole() == null)
	    	                		{
	    	                    		addIssueMessage("No mapping of type PDS was found for PDSPersonRole lookup and value '" + relatedPersonRole.getClassCode() + "' !", PdsQuery.PdsField.ROLE);
	    	                		}
	    	                	}
	    	                	
	    	                	//contact ranking
	    	                	if(relatedPersonRole.getPositionNumber() != null)
	    	                	{
	    	                		try
	    	                		{
	    	                			INT pos = relatedPersonRole.getPositionNumber();
	    	                			code = pos.getValue().toString();
	    	                		} 
	    	                		catch (org.apache.xmlbeans.impl.values.XmlValueOutOfRangeException ex)
	    	                		{
	    	                			//workaround for invalid values
	    	                			parseInvalidSchemaValueFromXml(relatedPersonRole.getPositionNumber().xgetValue(), "RelatedPersonRole.PositionNumber");
	    	                			code = null;
	    	                		}
	    	                		
	    	                		rel.setContactRank(code);
	    	                	}
	    	                	
	    	                	//WDEV-22188
                				//WDEV-22200
	    	                	//partCorrespondence
	    	                	PRPAMT000201UK03Part4 corresp = relatedPersonRole.getPart4();
	    	                	//[1..1]  [M] code (CV {CNE:CorrespondenceCode } ) { Fixed="1" } This is a fixed value and will alway be 1.
	    	                	//If the part is not availabel , then set CpyCorresp to False
	    	                	if (corresp!=null
	    	                			&& corresp.getPartCorrespondence()!=null
	    	                			&& corresp.getPartCorrespondence().getCode()!=null
	    	                			&& corresp.getPartCorrespondence().getCode().getCode()!=null
	    	                			&& corresp.getPartCorrespondence().getCode().getCode().equals("1"))
	    	                		rel.setCpyCorresp(Boolean.TRUE);
	    	                	else
	    	                		rel.setCpyCorresp(Boolean.FALSE);
                				//WDEV-22200
	    	                	//WDEV-22188

                				//WDEV-22200
	    	                    //preferredContactMethod
	    	                    if(relatedPersonRole.getSubjectOf1() != null)
	    	                    {
	    	                    	PRPAMT000201UK03PreferredContactMethod preferredContactMethod = relatedPersonRole.getSubjectOf1().getPreferredContactMethod();
	    	                    	
	    	                    	if(preferredContactMethod.getCode() != null && preferredContactMethod.getCode().getCodeSystem() != null)
	    	                    	{
	    	                    		if(preferredContactMethod.getCode().getCodeSystem().equals("2.16.840.1.113883.2.1.3.2.4.17.35"))
	    	                    		{
	    	                    			try
	    	                    			{
	    	                    				code = preferredContactMethod.getCode().getCode();
	    	                    			} 
	    	                    			catch (org.apache.xmlbeans.impl.values.XmlValueOutOfRangeException ex)
	    	                    			{
	    	                    				//workaround for invalid values
	    	                    				code = parseInvalidSchemaValueFromXml(preferredContactMethod.getCode().xgetCode(), "PreferredContactMethod.Code");
	    	                    			}
	    	                    			
	    	                        		if("9".equals(code))
	    	                        		{
	    	                        			//get the value
	    	                                	if(preferredContactMethod.getValue() != null && preferredContactMethod.getValue().getCodeSystem() != null)
	    	                                	{
	    	                                		if(preferredContactMethod.getValue().getCodeSystem().equals("2.16.840.1.113883.2.1.3.2.4.16.16"))
	    	                                		{
	    	                                			try
	    	                                			{
	    	                                				code = preferredContactMethod.getValue().getCode();
	    	                                			} 
	    	                                			catch (org.apache.xmlbeans.impl.values.XmlValueOutOfRangeException ex)
	    	                                			{
	    	                                				//workaround for invalid values
	    	                                				code = parseInvalidSchemaValueFromXml(preferredContactMethod.getValue().xgetCode(), "PreferredContactMethod.Value");
	    	                                			}

	    	                                    		if(rel.getPDScontactPreferences() == null)
	    	                                    			rel.setPDScontactPreferences(new PDSRelativeContactPrefVo());
	    	                                    		
	    	                                    		rel.getPDScontactPreferences().setPreferredContactMethod(getPreferredContactMethodByPdsMapping(code));                            		
	    	                                			
	    	                                			if(rel.getPDScontactPreferences().getPreferredContactMethod() == null)
	    	                                			{
	    	        										addIssueMessage("PreferredContactMethod.Value property is not mapped for PDSContactMethod lookup: " + code, PdsQuery.PdsField.PREFERRED_CONTACT_METHOD);
	    	                                			}
	    	                                			
	    	                                			//contact times
	    	                                			if(preferredContactMethod.getPertinentInformation() != null && preferredContactMethod.getPertinentInformation().getPertinentPreferredContactTimes() != null)
	    	                                			{
	    	                                				PRPAMT000201UK03PreferredContactTimes preferredContactTimes = preferredContactMethod.getPertinentInformation().getPertinentPreferredContactTimes();
	    	                                				
	    	                                				if(preferredContactTimes.getValue() != null)
	    	                                				{
	    	                                            		if(rel.getPDScontactPreferences() == null)
	    	                                            			rel.setPDScontactPreferences(new PDSRelativeContactPrefVo());

	    	                                            		STImpl val = (STImpl) preferredContactTimes.getValue();
	    	                                            		
	    	                                            		rel.getPDScontactPreferences().setPdsPreferredContactTimes(val.getStringValue());
	    	                                				}
	    	                                			}
	    	                                		}                        		
	    	                                	}
	    	                        		}
	    	                    		}                			
	    	                    	}
	    	                    }
	    	                    
	    	                    //writtenCommunicationFormat
	    	                    if(relatedPersonRole.getSubjectOf2() != null)
	    	                    {
	    	                    	PRPAMT000201UK03PreferredWrittenCommunicationFormat writtenCommunicationFormat = relatedPersonRole.getSubjectOf2().getPreferredWrittenCommunicationFormat();
	    	                    	
	    	            			//get the value
	    	                    	if(writtenCommunicationFormat.getValue() != null && writtenCommunicationFormat.getValue().getCodeSystem() != null)
	    	                    	{
	    	                    		if(writtenCommunicationFormat.getValue().getCodeSystem().equals("2.16.840.1.113883.2.1.3.2.4.16.17"))
	    	                    		{
	    	                    			try
	    	                    			{
	    	                    				code = writtenCommunicationFormat.getValue().getCode();
	    	                    			} 
	    	                    			catch (org.apache.xmlbeans.impl.values.XmlValueOutOfRangeException ex)
	    	                    			{
	    	                    				//workaround for invalid values
	    	                    				code = parseInvalidSchemaValueFromXml(writtenCommunicationFormat.getValue().xgetCode(), "WrittenCommunicationFormat.Value");
	    	                    			}

	    	                        		if(rel.getPDScontactPreferences() == null)
	    	                        			rel.setPDScontactPreferences(new PDSRelativeContactPrefVo());
	    	                        		
	    	                        		rel.getPDScontactPreferences().setPdsPreferredWrittenComm(getPreferredWrittenCommunicationByPdsMapping(code));                            		
	    	                    			
	    	                    			if(rel.getPDScontactPreferences().getPdsPreferredWrittenComm() == null)
	    	                    			{
	    	                    				addIssueMessage("WrittenCommunicationFormat.Value property is not mapped for PreferredWrittenCommunication lookup: " + code, PdsQuery.PdsField.PREFERRED_WRITTEN_COMM);
	    	                    			}
	    	                    		}                			
	    	                    	}
	    	                    }	    	                    
	    	                    
                				//WDEV-22200

	    	                	//rel effective time
	    	                	if(relatedPersonRole.getEffectiveTime() != null)
	    	                	{
	                				IVLTS validTime = relatedPersonRole.getEffectiveTime();
	                			    
	                	    		//beffdate & beffdatecnf
	                	    		if(validTime.getLow() != null)
	                	    		{
	                	    			IVXBTS low = validTime.getLow();
	                	    			
	                	        		try
	                	        		{
	                	        			rel.setBeffdate(new ims.framework.utils.Date(low.getValue().substring(0,8), DateFormat.ISO));
	                	        			rel.setBeffdatecnf(Boolean.TRUE);
	                	        		}
	                	        		catch(Exception e)
	                	        		{
	                	        			addIssueMessage("xml response has an incorrect value for relatedPersonRole.EffectiveTime.low field !", e);
	                	        		}
	                	    		}
	                	    		
	                	    		//betdate & Betdatecnf
	                	    		if(validTime.getHigh() != null)
	                	    		{
	                	    			IVXBTS high = validTime.getHigh();
	                	    			
	                	        		try
	                	        		{
	                	        			rel.setBetdate(new ims.framework.utils.Date(high.getValue().substring(0,8), DateFormat.ISO));
	                	        			rel.setBetdatecnf(Boolean.TRUE);
	                	        		}
	                	        		catch(Exception e)
	                	        		{
	                	        			addIssueMessage("xml response has an incorrect value for relatedPersonRole.EffectiveTime.high field !", e);
	                	        		}
	                	    		}
	    	                		
	    	                	}
	            			}
            	    	}
            		}
            	}
            	
            	//language
            	if(person.getLanguageCommunication() != null)
            	{
            		PRPAMT000201UK03LanguageCommunication language = person.getLanguageCommunication();
            		
            		//preferred language
            		if(language.getLanguageCode() != null)
            		{
            			LanguageCode lc = language.getLanguageCode();

                		try
                		{
                			code = lc.getCode();
                		} 
                		catch (org.apache.xmlbeans.impl.values.XmlValueOutOfRangeException ex)
                		{
                			//workaround for invalid values
                			code = parseInvalidSchemaValueFromXml(lc.getCode(), "LanguageCommunication.LanguageCode");
                		}
            			
            			pat.setPrefCommLanguage(getCommunicationLanguageByPdsMapping(code));
            			
            			if(pat.getPrefCommLanguage() == null)
            				addIssueMessage("LanguageCommunication.Value property is not mapped for PDSPreferredCommunicationLanguage lookup: " + code, PdsQuery.PdsField.PREFERRED_COMM_LANGUAGE);
            		}
            		
            		//interpreter required
            		if(language.getProficiencyLevelCode() != null)
            		{
            			ProficiencyLevelCode plc = language.getProficiencyLevelCode();

                		try
                		{
                			code = plc.getCode();
                		} 
                		catch (org.apache.xmlbeans.impl.values.XmlValueOutOfRangeException ex)
                		{
                			//workaround for invalid values
                			code = parseInvalidSchemaValueFromXml(plc.getCode(), "LanguageCommunication.ProficiencyLevelCode");
                		}
            			
            			if("1".equals(code))
            			{
            				//interpreter required = YES
            				pat.setPDSInterpreterRequired(Boolean.TRUE);
            			}
            			else if("0".equals(code))
            			{
            				//interpreter required = NO
            				pat.setPDSInterpreterRequired(Boolean.FALSE);
            			}
            		}
            	}
        	}
        	else
        	{
                String msg = "PRPA_MT000201UK03 xml response is missing Person.PartOfWhole field !";
            	sb.append(msg);
                sb.append("\n");
                
                issueFound = true;
        	}
        	
        	//deathNotification
        	if(patientRole.getSubjectOf2() != null && patientRole.getSubjectOf2().getDeathNotification() != null)
        	{
        		PRPAMT000201UK03DeathNotification deathNotification = patientRole.getSubjectOf2().getDeathNotification();
        		
        		if(deathNotification.getCode() != null && "3".equals(deathNotification.getCode().getCode()))
				{
        			if(deathNotification.getValue() != null)
        			{
        				try
        				{
        					code = deathNotification.getValue().getCode();
        				} 
        				catch (org.apache.xmlbeans.impl.values.XmlValueOutOfRangeException ex)
        				{
        					//workaround for invalid values
        					code = parseInvalidSchemaValueFromXml(deathNotification.getValue().xgetCode(), "DeathNotification.Value.Code");
        				}
        				
        				if("1".equals(code))
        				{
        					//informal
        					pat.setPDSDeathNotificationStatus(PDSDeathNotificationStatus.INFORMAL);
        				}
        				else if("2".equals(code))
        				{
        					//formal
        					pat.setPDSDeathNotificationStatus(PDSDeathNotificationStatus.FORMAL);
        				}
        			}
				}
        	}
        	
        	//superceeded identifiers
        	if(patientRole.getReplacementOfArray() != null && patientRole.getReplacementOfArray().length > 0)
        	{
        		for(PRPAMT000201UK03ReplacementOf replacement : patientRole.getReplacementOfArray())
        		{
        			if(replacement.getOldVersion() != null && replacement.getOldVersion().getId() != null)
        			{
        				IINPfITOidMandatory id = replacement.getOldVersion().getId();
        				PatientId maximsPid = new PatientId();
        				
        				//NHS number
        				if("2.16.840.1.113883.2.1.4.1".equals(id.getRoot()))
						{
        					maximsPid.setType(PatIdType.NHSN);
						}
        				else if("2.16.840.1.113883.2.1.3.2.4.3".equals(id.getRoot()))
						{
        					maximsPid.setType(PatIdType.NHSN_TEMP);
						}
        				
    					PatientIdCollection pids = null;
    	        		
    	        		if(pat.getIdentifiers() == null)
    	        		{
    	        			pids = new PatientIdCollection();
    	        			pat.setIdentifiers(pids);
    	        		}
    	        		else
    	        		{
    	        			pids = pat.getIdentifiers();
    	        		}
    	        			
    	        		maximsPid.setValue(id.getExtension());
    	        		maximsPid.setSuperseeded(Boolean.TRUE);
        				
    	        		if(replacement.getOldVersion().getEffectiveTime() != null)
    	        		{
    	        			IVLTS et = replacement.getOldVersion().getEffectiveTime();
    	        			
                    		if(et.getLow() != null)
                    		{
                    			IVXBTS low = et.getLow();
                    			
                        		try
                        		{
                        			maximsPid.setBeffdate(new ims.framework.utils.Date(low.getValue().substring(0,8), DateFormat.ISO));
                        			maximsPid.setBeffdatecnf(Boolean.TRUE);
                        		}
                        		catch(Exception e)
                        		{
                                    String msg = "PRPA_MT000201UK03 xml response has an incorrect value for replacementOf.oldVersion.effectiveTime.low field !";
                                	sb.append(msg);
                                	sb.append("\n");
                                	sb.append(e.toString());
                                	sb.append("\n");
                                	
                                	issueFound = true;
                        		}
                    		}
                    		
                    		//betdate & Betdatecnf
                    		if(et.getHigh() != null)
                    		{
                    			IVXBTS high = et.getHigh();
                    			
                        		try
                        		{
                        			maximsPid.setBeffdate(new ims.framework.utils.Date(high.getValue().substring(0,8), DateFormat.ISO));
                        			maximsPid.setBetdatecnf(Boolean.TRUE);
                        		}
                        		catch(Exception e)
                        		{
                                    String msg = "PRPA_MT000201UK03 xml response has an incorrect value for replacementOf.oldVersion.effectiveTime.high field !";
                                	sb.append(msg);
                                	sb.append("\n");
                                	sb.append(e.toString());
                                	sb.append("\n");
                                	
                                	issueFound = true;
                        		}
                    		}
    	        		}
    	        		
    	        		pids.add(maximsPid);
        			}
        		}
        	}
        }
        else
        {
            String msg = "PRPA_MT000201UK03 xml response is missing PatientPerson field !";
        	sb.append(msg);
            sb.append("\n");
            
            issueFound = true;
        }
        
        LOG.debug("Unmarshalling PRPA_MT000201UK03 took " + (t2 - t1) + " ms.");
        
        if(issueFound)
        {
        	LOG.error(sb.toString());
        	domain.createSystemLogEntry(SystemLogType.PDS, SystemLogLevel.INFORMATION, sb.toString());
        }
        
		if(pat.getName() == null)
			throw new PdsException("The patient name could not be retrieved !");
        
		//TODO - remove - test blank data
		/*
		pat.getName().setSurname("");
		pat.getName().setForename("");
		pat.getName().setMiddleName("");
		
		pat.getAddress().setLine1("");
		pat.getAddress().setLine2("");
		pat.getAddress().setLine3("");
		pat.getAddress().setLine4("");
		pat.getAddress().setLine5("");
		
		if(pat.getCommChannelsIsNotNull() && pat.getCommChannels().size() > 0)
		{
			pat.getCommChannels().get(0).setCommValue("");
		}
		*/
		//
		
		return pat;
	}
}
