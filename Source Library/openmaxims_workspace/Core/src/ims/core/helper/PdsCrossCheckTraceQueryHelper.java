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

import hl7OrgV3.IVLTS;
import hl7OrgV3.IVXBTS;
import hl7OrgV3.PDSResponsePRPAMT000213UK02Document;
import hl7OrgV3.PRPAMT000213UK02DeathNotification;
import hl7OrgV3.PRPAMT000213UK02PDSResponse;
import hl7OrgV3.PRPAMT000213UK02PatientCareProvision;
import hl7OrgV3.PRPAMT000213UK02PatientRole;
import hl7OrgV3.PRPAMT000213UK02Performer;
import hl7OrgV3.PRPAMT000213UK02Person;
import ims.admin.vo.lookups.PDSDeathNotificationStatus;
import ims.configuration.gen.ConfigFlag;
import ims.core.vo.Patient;
import ims.core.vo.PatientGPAndPracticeVo;
import ims.core.vo.PersonName;
import ims.core.vo.lookups.PDSProvisionType;
import ims.core.vo.lookups.Sex;
import ims.domain.DomainInterface;
import ims.framework.enumerations.SystemLogLevel;
import ims.framework.enumerations.SystemLogType;
import ims.framework.utils.DateFormat;

import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.log4j.Logger;
import org.apache.xmlbeans.XmlException;

public class PdsCrossCheckTraceQueryHelper extends PdsQuery
{
	private static final Logger LOG = Logger.getLogger(PdsCrossCheckTraceQueryHelper.class);
	
	
	public PdsCrossCheckTraceQueryHelper(DomainInterface domain)
	{
		super(domain);
		
		super.xmlMessageName = "PRPA_MT000213UK02";
	}

	public Patient makeRequest(PdsRequestParameters params, String nhsNumber, String dob, String snm, String fnm) throws PdsException
	{
		Patient pat = new Patient();
		//String url = "http://vpurdila-sv2:8080/PdsServer/SynchronousServlet";
		
		final String paramsInfo = "PdsCrossCheckTraceQuery accepts the following params:\r\n nhsNumber - mandatory  \r\n" + 
				" dob - mandatory   \r\n" + 
				" snm - optional  \r\n" + 
				" fnm - optional";
		
		String url = ConfigFlag.GEN.PDS_SYNC_GATEWAY_URL.getValue();
		
		if(nhsNumber == null || nhsNumber.length() == 0)
			throw new PdsException(paramsInfo);
		if(dob == null || dob.length() == 0)
			throw new PdsException(paramsInfo);
		
		
		if(url == null || url.length() == 0)
			throw new PdsException("PDS_SYNC_GATEWAY_URL flag was not set !");
		
		if(!url.endsWith("/"))
			url += "/";
		
		url += "SynchronousServlet";
		
		String xml = "";
		String originalXml = "";
        PostMethod post = new PostMethod(url);

        sb.append("request: PdsCrossCheckTraceQuery");
        sb.append("\n");
        sb.append("nhsNumber: " + nhsNumber);
        sb.append("\n");
        sb.append("dob: " + dob);
        sb.append("\n");
        sb.append("snm: " + snm);
        sb.append("\n");
        sb.append("fnm: " + fnm);
        sb.append("\n");
        sb.append("\n");
        sb.append("response:\n");
        
        try
        {
            NameValuePair[] data = 
            {
                new NameValuePair("request", "PdsCrossCheckTraceQuery"),
                new NameValuePair("nhsNumber", nhsNumber),
                new NameValuePair("dob", dob),
                new NameValuePair("snm", snm),
                new NameValuePair("fnm", fnm),
                
                new NameValuePair("fromAccreditedSystemId", params.getFromAccreditedSystemId()),
                new NameValuePair("roleProfileCode", params.getRoleProfileCode()),
                new NameValuePair("sdsJobRoleCode", params.getSdsJobRoleCode()),
                new NameValuePair("toPDSAccreditedSystemId", params.getToPDSAccreditedSystemId()),
                new NameValuePair("userUUID", params.getUserUUID()),
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
                String err = "Error getting PdsCrossCheckTraceQuery response: " + iGetResultCode;
                sb.append(err);
                sb.append("\n");
                
                domain.createSystemLogEntry(SystemLogType.PDS, SystemLogLevel.ERROR, sb.toString());

                throw new PdsException(err);
            }
        }
        catch (Exception ex)
        {
            String err = "Error getting PdsCrossCheckTraceQuery response: " + ex.toString();
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
        xml = xml.replaceAll("PDSResponse", "PDSResponsePRPAMT000213UK02");

        PDSResponsePRPAMT000213UK02Document doc;
		try
		{
			doc = PDSResponsePRPAMT000213UK02Document.Factory.parse(xml);
		}
		catch (XmlException ex)
		{
            String err = "Error parsing PdsCrossCheckTraceQuery response (PRPA_MT000213UK02): " + ex.toString();
            sb.append(err);
            sb.append("\n");
            sb.append("PRPA_MT000213UK02 xml content");
            sb.append("\n");
            sb.append(originalXml);
            
            domain.createSystemLogEntry(SystemLogType.PDS, SystemLogLevel.ERROR, sb.toString());

            throw new PdsException(err, ex);
		}

        long t2 = System.currentTimeMillis();
        
        PRPAMT000213UK02PDSResponse pdsResponse = doc.getPDSResponsePRPAMT000213UK02();
        

        if(pdsResponse.getSubject() != null && pdsResponse.getSubject().getPatientRole() != null && pdsResponse.getSubject().getPatientRole().getPatientPerson() != null)
        {
            PRPAMT000213UK02PatientRole patientRole = pdsResponse.getSubject().getPatientRole();
            
        	//confidentiality code
        	if(patientRole.getConfidentialityCode() != null)
        	{
        		if("S".equals(patientRole.getConfidentialityCode().getCode()))
        		{
        			isConfidential = true;
        		}
        	}
            
            if(!isConfidential)
            {
        		LOG.info(originalXml);
            }
        	
        	PRPAMT000213UK02Person person = pdsResponse.getSubject().getPatientRole().getPatientPerson();
        	
        	if(person.getNameArray() != null && person.getNameArray().length > 0)
        	{
            	pat.setName(new PersonName());
            	populatePN(pat.getName(), person.getNameArray()[0]);
        	}
        	
        	//sex
        	if(person.getAdministrativeGenderCode() != null)
        	{
        		//1 = Male, 2 = Female
        		if("1".equals(person.getAdministrativeGenderCode().getCode()))
				{
        			pat.setSex(Sex.MALE);
				}
        		else if("2".equals(person.getAdministrativeGenderCode().getCode()))
				{
        			pat.setSex(Sex.FEMALE);
				}
        		else
				{
        			pat.setSex(Sex.UNKNOWN);
				}
        	}
        	
        	populateBirthTime(pat, person.getBirthTime());
        	populateDeceasedTime(pat, person.getDeceasedTime());
        	
        	populatePatientIdentifiers(pat, pdsResponse.getSubject().getPatientRole().getId());

        	//deathNotification
        	if(patientRole.getSubjectOf2() != null && patientRole.getSubjectOf2().getDeathNotification() != null)
        	{
        		PRPAMT000213UK02DeathNotification deathNotification = patientRole.getSubjectOf2().getDeathNotification();
        		
        		if(deathNotification.getCode() != null && "3".equals(deathNotification.getCode().getCode()))
				{
        			if(deathNotification.getValue() != null && deathNotification.getValue().getCode() != null)
        			{
        				if("1".equals(deathNotification.getValue().getCode()))
        				{
        					//informal
        					pat.setPDSDeathNotificationStatus(PDSDeathNotificationStatus.INFORMAL);
        				}
        				else if("2".equals(deathNotification.getValue().getCode()))
        				{
        					//formal
        					pat.setPDSDeathNotificationStatus(PDSDeathNotificationStatus.FORMAL);
        				}
        			}
				}
        	}

        	//patient GP / practice
        	if(person.getPlayedOtherProviderPatient() != null && person.getPlayedOtherProviderPatient().getSubjectOf() != null && person.getPlayedOtherProviderPatient().getSubjectOf().getPatientCareProvision() != null)
        	{
        		PatientGPAndPracticeVo gpp;
        		
        		//*************************
        		//TODO - fixiup
        		//*************************
//        		if(pat.getPDSPatientGP() != null)
//        			gpp = pat.getPDSPatientGP();
//        		else
//        		{
        			gpp = new PatientGPAndPracticeVo();
//        			pat.setPDSPatientGP(gpp);
//        		}
        		
        		PRPAMT000213UK02PatientCareProvision careProvision = person.getPlayedOtherProviderPatient().getSubjectOf().getPatientCareProvision();

        		if(careProvision.getCode() != null && careProvision.getCode().getCode().equals("1"))
        		{
        			gpp.setLkp_provisiontype(PDSProvisionType.PRIMARYCARE);
        			
        			if(careProvision.getPerformer() != null)
        			{
        				PRPAMT000213UK02Performer performer = careProvision.getPerformer();
        				
        				if(performer.getAssignedOrganization() != null && performer.getAssignedOrganization().getId() != null)
        					gpp.setPrimaryCareIdentifier(performer.getAssignedOrganization().getId().getExtension());
        			}
        			
        			if(careProvision.getEffectiveTime() != null)
        			{
        				IVLTS validTime = careProvision.getEffectiveTime();

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
        	}
        	
        }
        else
        {
            String msg = "PRPA_MT000213UK02 xml response is missing PatientPerson field !";
        	sb.append(msg);
            sb.append("\n");
            
            issueFound = true;
        }
        
        LOG.debug("Unmarshalling PRPA_MT000213UK02 took " + (t2 - t1) + " ms.");
        
        if(issueFound)
        {
        	LOG.error(sb.toString());
        	domain.createSystemLogEntry(SystemLogType.PDS, SystemLogLevel.INFORMATION, sb.toString());
        }
		
		return pat;
	}

	/*
	private String loadFileFromClasspath(String filename) throws IOException
	{
		InputStream in = this.getClass().getResourceAsStream(filename);
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    byte[] buffer = new byte[1024*2];
	    int length = 0;
	    while ((length = in.read(buffer)) != -1) 
	    {
	        baos.write(buffer, 0, length);
	    }
	    return new String(baos.toByteArray());		
	}
	*/
}
