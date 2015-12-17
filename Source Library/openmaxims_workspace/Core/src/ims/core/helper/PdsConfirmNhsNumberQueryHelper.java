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
import hl7OrgV3.PN;
import hl7OrgV3.PRPAMT000202UK02DeathNotification;
import hl7OrgV3.PRPAMT000202UK02PdsNhsNumberConfirmation;
import hl7OrgV3.PRPAMT000202UK02Person;
import hl7OrgV3.PdsNhsNumberConfirmationPRPAMT000202UK02Document;
import ims.admin.vo.lookups.PDSDeathNotificationStatus;
import ims.configuration.gen.ConfigFlag;
import ims.core.vo.Patient;
import ims.core.vo.PersonAddress;
import ims.core.vo.PersonName;
import ims.domain.DomainInterface;
import ims.framework.enumerations.SystemLogLevel;
import ims.framework.enumerations.SystemLogType;

import java.util.List;

import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.xmlbeans.XmlException;
import org.apache.log4j.Logger;


public class PdsConfirmNhsNumberQueryHelper extends PdsQuery
{
	private static final Logger LOG = Logger.getLogger(PdsConfirmNhsNumberQueryHelper.class);

	public PdsConfirmNhsNumberQueryHelper(DomainInterface domain)
	{
		super(domain);
		
		super.xmlMessageName = "PRPA_MT000202UK02";
	}

	public Patient makeRequest(PdsRequestParameters params, String nhsNumber) throws PdsException
	{
	

		Patient pat = new Patient();
		//String url = "http://vpurdila-sv2:8080/PdsServer/SynchronousServlet";
		final String paramsInfo = "PdsConfirmNhsNumberQuery accepts the following params:\r\n nhsNumber - mandatory";
		
		String url = ConfigFlag.GEN.PDS_SYNC_GATEWAY_URL.getValue();
		
		if(nhsNumber == null || nhsNumber.length() == 0)
			throw new PdsException(paramsInfo);

		if(url == null || url.length() == 0)
			throw new PdsException("PDS_SYNC_GATEWAY_URL flag was not set !");
		
		if(!url.endsWith("/"))
			url += "/";
		
		url += "SynchronousServlet";
		
		String xml = "";
		String originalXml = "";
        PostMethod post = new PostMethod(url);

        sb.append("request: PdsConfirmNhsNumberQuery");
        sb.append("\n");
        sb.append("nhsNumber: " + nhsNumber);
        sb.append("\n");
        sb.append("\n");
        sb.append("response:\n");
        
        try
        {
            NameValuePair[] data = 
            {
                new NameValuePair("request", "PdsConfirmNhsNumberQuery"),
                new NameValuePair("nhsNumber", nhsNumber),
                
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
                String err = "Error getting PdsConfirmNhsNumberQuery response: " + iGetResultCode;
                sb.append(err);
                sb.append("\n");
                
                domain.createSystemLogEntry(SystemLogType.PDS, SystemLogLevel.ERROR, sb.toString());

                throw new PdsException(err);
            }
        }
        catch (Exception ex)
        {
            String err = "Error getting PdsConfirmNhsNumberQuery response: " + ex.toString();
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
        xml = xml.replaceAll("PdsNhsNumberConfirmation", "PdsNhsNumberConfirmationPRPAMT000202UK02");

        PdsNhsNumberConfirmationPRPAMT000202UK02Document doc;
		try
		{
			doc = PdsNhsNumberConfirmationPRPAMT000202UK02Document.Factory.parse(xml);
		}
		catch (XmlException ex)
		{
            String err = "Error parsing PdsConfirmNhsNumberQuery response (PRPA_MT000202UK02): " + ex.toString();
            sb.append(err);
            sb.append("\n");
            sb.append("PRPA_MT000202UK02 xml content");
            sb.append("\n");
            sb.append(originalXml);
            
            domain.createSystemLogEntry(SystemLogType.PDS, SystemLogLevel.ERROR, sb.toString());

            throw new PdsException(err, ex);
		}

        long t2 = System.currentTimeMillis();

        //TODO - this xml may contain sensitive information about patient, perhaps we should not output it to the console?
		LOG.debug(originalXml);

        PRPAMT000202UK02PdsNhsNumberConfirmation pdsResponse = doc.getPdsNhsNumberConfirmationPRPAMT000202UK02();

        if(pdsResponse.getSubject() != null && pdsResponse.getSubject().getPatientRole() != null && pdsResponse.getSubject().getPatientRole().getAddrArray() != null && pdsResponse.getSubject().getPatientRole().getAddrArray().length > 0)
        {
        	AD[] addrArray = pdsResponse.getSubject().getPatientRole().getAddrArray();
        	
        	for(AD addr : addrArray)
        	{
            	List use = addr.getUse();
            	
            	//H = home address ?
            	if(use != null && use.size() > 0 && "H".equals(use.get(0)))
            	{
                	PersonAddress imsAddr = new PersonAddress();
                	pat.setAddress(imsAddr);
                	populatePatientAddress(imsAddr, addr);
            	}
        	}
        }
        else
        {
            String msg = "PRPA_MT000202UK02 xml response is missing Addr field !";
        	sb.append(msg);
            sb.append("\n");
            
            issueFound = true;
        }
        
        if(pdsResponse.getSubject() != null && pdsResponse.getSubject().getPatientRole() != null && pdsResponse.getSubject().getPatientRole().getPatientPerson() != null)
        {
        	PRPAMT000202UK02Person person = pdsResponse.getSubject().getPatientRole().getPatientPerson();
        	
        	PN[] nameParts = person.getNameArray();
        	
        	if(nameParts != null && nameParts.length > 0)
        	{
            	for(PN partName : nameParts)
            	{
                	List use = partName.getUse();
                	
                	if(use != null && use.size() > 0 && "L".equals(use.get(0)))
                	{
                    	//"L" is current person name
                		pat.setName(new PersonName());
                		populatePN(pat.getName(), partName);
                	}
                	else if(use != null && use.size() > 0 && "PREVIOUS".equals(use.get(0)))
                	{
                		//(Previous) married name
                	}
                	else if(use != null && use.size() > 0 && "PREVIOUS-MAIDEN".equals(use.get(0)))
                	{
                		//(Previous) maiden name
                	}
            	}
            	
            	populateBirthTime(pat, person.getBirthTime());
            	populateDeceasedTime(pat, person.getDeceasedTime());
        	}
        	else
        	{
                String msg = "PRPA_MT000202UK02 xml response is missing Person.Name array field !";
            	sb.append(msg);
                sb.append("\n");
                
                issueFound = true;
        	}
        }
        else
        {
            String msg = "PRPA_MT000202UK02 xml response is missing PatientPerson field !";
        	sb.append(msg);
            sb.append("\n");
            
            issueFound = true;
        }
        
    	//deathNotification
        if(pdsResponse.getSubject() != null && pdsResponse.getSubject().getPatientRole() != null && pdsResponse.getSubject().getPatientRole().getSubjectOf2() != null && pdsResponse.getSubject().getPatientRole().getSubjectOf2().getDeathNotification() != null)
    	{
    		PRPAMT000202UK02DeathNotification deathNotification = pdsResponse.getSubject().getPatientRole().getSubjectOf2().getDeathNotification();
    		
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
        
       LOG.debug(" - Unmarshalling PRPA_MT000202UK02 took " + (t2 - t1) + " ms.");
        
        if(issueFound)
        {
        	LOG.error(sb.toString());
        	domain.createSystemLogEntry(SystemLogType.PDS, SystemLogLevel.INFORMATION, sb.toString());
        }
		
		return pat;
	}

}
