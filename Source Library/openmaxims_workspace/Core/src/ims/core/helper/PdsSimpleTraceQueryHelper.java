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
import hl7OrgV3.IVLTS;
import hl7OrgV3.IVXBTS;
import hl7OrgV3.PN;
import hl7OrgV3.PRPAMT000200UK01PatientCareProvision;
import hl7OrgV3.PRPAMT000200UK01PdsTraceMatch;
import hl7OrgV3.PRPAMT000200UK01Performer;
import hl7OrgV3.PRPAMT000200UK01Person;
import hl7OrgV3.QUPAIN000007UK01Document;
import ims.configuration.gen.ConfigFlag;
import ims.core.vo.Patient;
import ims.core.vo.PatientGPAndPracticeVo;
import ims.core.vo.PersonAddress;
import ims.core.vo.PersonName;
import ims.core.vo.lookups.PDSProvisionType;
import ims.domain.DomainInterface;
import ims.framework.enumerations.SystemLogLevel;
import ims.framework.enumerations.SystemLogType;
import ims.framework.utils.DateFormat;

import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.log4j.Logger;
import org.apache.xmlbeans.XmlException;

public class PdsSimpleTraceQueryHelper extends PdsQuery
{
	private static final Logger LOG = Logger.getLogger(PdsSimpleTraceQueryHelper.class);
	
	public PdsSimpleTraceQueryHelper(DomainInterface domain)
	{
		super(domain);
		
		super.xmlMessageName = "PRPA_MT000200UK01";
	}

	public Patient makeRequest(PdsRequestParameters params, String snm, String gender, String dob, String fnm, String dod, String postCode, String pafKey) throws PdsException
	{
		Patient pat = new Patient();
		//String url = "http://vpurdila-sv2:8080/PdsServer/SynchronousServlet";
		final String paramsInfo = "PdsSimpleTraceQuery accepts the following params:\r\n snm - mandatory  \r\n" + 
				" gender - mandatory   \r\n" + 
				" dob - mandatory   \r\n" + 
				" fnm - optional  \r\n" + 
				" dod - optional  \r\n" + 
				" postCode - optional  \r\n" + 
				" pafKey - optional";
		
		String url = ConfigFlag.GEN.PDS_SYNC_GATEWAY_URL.getValue();
		
		if(snm == null || snm.length() == 0)
			throw new PdsException(paramsInfo);
		if(gender == null || gender.length() == 0)
			throw new PdsException(paramsInfo);
		if(dob == null || dob.length() == 0)
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

        sb.append("request: PdsSimpleTraceQuery");
        sb.append("\n");
        sb.append("snm: " + snm);
        sb.append("\n");
        sb.append("gender: " + gender);
        sb.append("\n");
        sb.append("dob: " + dob);
        sb.append("\n");
        sb.append("fnm: " + fnm);
        sb.append("\n");
        sb.append("dod: " + dod);
        sb.append("\n");
        sb.append("postCode: " + postCode);
        sb.append("\n");
        sb.append("pafKey: " + pafKey);
        sb.append("\n");
        sb.append("\n");
        sb.append("response:\n");
        
        try
        {
            NameValuePair[] data = 
            {
                new NameValuePair("request", "PdsSimpleTraceQuery"),
                new NameValuePair("snm", snm),
                new NameValuePair("dob", dob),
                new NameValuePair("gender", gender),
                new NameValuePair("fnm", fnm),
                new NameValuePair("dod", dod),
                new NameValuePair("postCode", postCode),
                new NameValuePair("pafKey", pafKey),
                
                new NameValuePair("fromAccreditedSystemId", params.getFromAccreditedSystemId()),
                new NameValuePair("roleProfileCode", params.getRoleProfileCode()),
                new NameValuePair("sdsJobRoleCode", params.getSdsJobRoleCode()),
                new NameValuePair("toPDSAccreditedSystemId", params.getToPDSAccreditedSystemId()),
                new NameValuePair("userUUID", params.getUserUUID()),
                new NameValuePair("pdsURL", params.getPdsURL()),
                new NameValuePair("pdsHost", params.getPdsHost()),
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
                String err = "Error getting PdsSimpleTraceQuery response: " + iGetResultCode;
                sb.append(err);
                sb.append("\n");
                
                domain.createSystemLogEntry(SystemLogType.PDS, SystemLogLevel.ERROR, sb.toString());

                throw new PdsException(err);
            }
        }
        catch (Exception ex)
        {
            String err = "Error getting PdsSimpleTraceQuery response: " + ex.toString();
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
        //xml = xml.replaceAll("PdsTraceMatch", "PdsTraceMatchPRPAMT000200UK01");

        QUPAIN000007UK01Document docResponse;
        //PdsTraceMatchPRPAMT000200UK01Document doc;
		try
		{
			docResponse = QUPAIN000007UK01Document.Factory.parse(xml);
		}
		catch (XmlException ex)
		{
            String err = "Error parsing PdsSimpleTraceQuery response (QUPAIN000007UK01): " + ex.toString();
            sb.append(err);
            sb.append("\n");
            sb.append("QUPAIN000007UK01 xml content");
            sb.append("\n");
            sb.append(originalXml);
            
            domain.createSystemLogEntry(SystemLogType.PDS, SystemLogLevel.ERROR, sb.toString());

            throw new PdsException(err, ex);
		}

        long t2 = System.currentTimeMillis();

        //TODO - this xml may contain sensitive information about patient, perhaps we should not output it to the console?
        LOG.info(originalXml);

        //PRPAMT000200UK01PdsTraceMatch pdsResponse = doc.getPdsTraceMatchPRPAMT000200UK01();
        PRPAMT000200UK01PdsTraceMatch pdsResponse = null;

        if(docResponse.getQUPAIN000007UK01().getControlActEvent() != null &&
        		docResponse.getQUPAIN000007UK01().getControlActEvent().getSubject() != null &&
        				docResponse.getQUPAIN000007UK01().getControlActEvent().getSubject().getPdsTraceMatch() != null)
        {
        	pdsResponse = docResponse.getQUPAIN000007UK01().getControlActEvent().getSubject().getPdsTraceMatch();
        }
        
        if(pdsResponse == null)
        {
            String err = "Error parsing PdsRetrievalQuery response (QUPAIN000007UK01): cound not find the PDSResponse in the message !";
            sb.append(err);
            sb.append("\n");
            sb.append("QUPAIN000007UK01 xml content");
            sb.append("\n");
            sb.append(originalXml);
            
            domain.createSystemLogEntry(SystemLogType.PDS, SystemLogLevel.ERROR, sb.toString());

            throw new PdsException(err);
        }
        
        if(pdsResponse.getSubject() != null && pdsResponse.getSubject().getPatientRole() != null && pdsResponse.getSubject().getPatientRole().getPatientPerson() != null)
        {
        	PRPAMT000200UK01Person person = pdsResponse.getSubject().getPatientRole().getPatientPerson();
        	
        	pat.setName(new PersonName());
        	
        	if(person.getNameArray() != null && person.getNameArray().length > 0)
        	{
        		PN pn = person.getNameArray()[0];
        		populatePN(pat.getName(), pn);
        	}
        	else
        	{
        		addIssueMessage("xml response is missing Name field !");
        	}
        	
        	populateBirthTime(pat, person.getBirthTime());
        	populateDeceasedTime(pat, person.getDeceasedTime());
        	
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
        		
        		PRPAMT000200UK01PatientCareProvision careProvision = person.getPlayedOtherProviderPatient().getSubjectOf().getPatientCareProvision();

        		if(careProvision.getCode() != null && careProvision.getCode().getCode().equals("1"))
        		{
        			gpp.setLkp_provisiontype(PDSProvisionType.PRIMARYCARE);
        		
        			if(careProvision.getPerformer() != null)
        			{
        				PRPAMT000200UK01Performer performer = careProvision.getPerformer();
        				
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
        	addIssueMessage("xml response is missing PatientPerson field !");
        }
        	
        if(pdsResponse.getSubject() != null && pdsResponse.getSubject().getPatientRole() != null && pdsResponse.getSubject().getPatientRole().getAddrArray() != null && pdsResponse.getSubject().getPatientRole().getAddrArray().length > 0)
        {
        	AD addr = pdsResponse.getSubject().getPatientRole().getAddrArray()[0];   
        	PersonAddress imsAddr = new PersonAddress();
        	pat.setAddress(imsAddr);
        	populatePatientAddress(imsAddr, addr);
        }
        else
        {
            String msg = "PRPA_MT000200UK01 xml response is missing Addr field !";
        	sb.append(msg);
            sb.append("\n");
            
            issueFound = true;
        }
        
        LOG.debug("Unmarshalling PRPA_MT000200UK01 took " + (t2 - t1) + " ms.");
        
        if(issueFound)
        {
        	LOG.error(sb.toString());
        	domain.createSystemLogEntry(SystemLogType.PDS, SystemLogLevel.INFORMATION, sb.toString());
        }
		
		return pat;
	}

}
