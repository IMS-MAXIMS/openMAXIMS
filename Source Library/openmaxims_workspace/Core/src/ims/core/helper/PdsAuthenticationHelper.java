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

import ims.admin.helper.SamlParser;
import ims.admin.vo.PDSConfigurationVo;
import ims.admin.vo.RBACBaselineJobRoleVo;
import ims.configuration.gen.ConfigFlag;
import ims.core.admin.vo.RBACBaselineJobRoleRefVo;
import ims.domain.DomainInterface;
import ims.framework.UIComponentEngine;
import ims.framework.UIEngine;
import ims.framework.enumerations.SystemLogLevel;
import ims.framework.enumerations.SystemLogType;
import ims.framework.interfaces.IRBACBaselineJobRole;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.Logger;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public class PdsAuthenticationHelper
{
	private static final Logger LOG = Logger.getLogger(PdsAuthenticationHelper.class);
	
	public enum PdsRight 
	{
    	PDS_SEARCH_FOR_PATIENT, PDS_SEARCH_PATIENT_ADVANCED, 
    	PDS_RETRIEVAL, ACCESS_SENSITIVE_DATA,
    	AMEND_PATIENT, CONTROL_CONSENT,
    	AMEND_PATIENT_DECEASE,POSTCODE_SEARCH
	};

	public static class PdsCheck
	{
		public final static int CHECK_PDS_INTERACTION = 0x01;
		public final static int CHECK_SAML_XML = 0x02;
		public final static int CHECK_ACTIVITY = 0x04;
		public final static int CHECK_ALL = 0x07;
	};
	
	private PdsQuery pq;
	private UIEngine localEngine;
	private UIComponentEngine localComponentEngine;
	private String lastError;
	private SamlParser samlParser;
	private DomainInterface domain;
	
	public PdsAuthenticationHelper(UIEngine engine, DomainInterface domain)
	{
		this.localEngine = engine;
		this.domain = domain;
		
		constructorLogic();
	}

	public PdsAuthenticationHelper(UIComponentEngine engine, DomainInterface domain)
	{
		this.localComponentEngine = engine;
		this.domain = domain;
		
		constructorLogic();
	}

	//this is to be coded from other places like helpers, etc. where "engine" is not available
	/*
	public PdsAuthenticationHelper(DomainInterface domain)
	{
		this.domain = domain;
		
		constructorLogic();
	}
	*/
	
	private void constructorLogic()
	{
		pq = new PdsQuery(null);
		try
		{
			samlParser = new SamlParser();
		}
		catch (ParserConfigurationException e)
		{
			e.printStackTrace();
		}
		catch (SAXException e)
		{
			e.printStackTrace();
		}
	}
	
	public boolean hasRightsFor(PdsRight right, int checks, String samlXmlFromContext)
	{
		//if(checks != PdsCheck.CHECK_ACTIVITY)
		//	throw new CodingRuntimeException("Only PdsCheck.CHECK_ACTIVITY can be used with PdsAuthenticationHelper(domain) constructor !");
		
		lastError = "";
		PDSConfigurationVo config = pq.getPdsConfiguration();
		
		if (config == null)
			return true;
		
		if (config.getPDS_AUTHENTICATIONIsNotNull() && !config.getPDS_AUTHENTICATION())
			return true;
		
		if(!isPds())
			return true;
		
		boolean allowPdsInteraction = false;
		String samlXml = "";
		boolean usePdsAuthentication = false; 
		
		if (config.getPDS_AUTHENTICATIONIsNotNull())
			usePdsAuthentication = config.getPDS_AUTHENTICATION();
		else
			return false;
		
		if(localEngine != null)
		{
			allowPdsInteraction = localEngine.allowPdsInteraction();
			samlXml = localEngine.getSAMLXmlContent();
		}
		else if(localComponentEngine != null)
		{
			allowPdsInteraction = localComponentEngine.allowPdsInteraction();
			samlXml = localComponentEngine.getSAMLXmlContent();
		}
		
		LOG.debug("hasRightsFor START");
		
		if((checks & PdsCheck.CHECK_PDS_INTERACTION) != 0 && !allowPdsInteraction)
		{
			lastError = "Smart card not present or doesn't allow PDS interraction.";
			LOG.error(lastError);
			
			if(usePdsAuthentication)
				return false;
		}
		LOG.debug("engine.allowPdsInteraction = " + allowPdsInteraction);
		
		if((checks & PdsCheck.CHECK_SAML_XML) != 0)
		{
			if(samlXml != null && samlXml.length() > 0)
			{
				samlParser.loadFileContent(samlXml);
			}
			else if(samlXmlFromContext != null && samlXmlFromContext.length() > 0)
			{
				samlXml = samlXmlFromContext;
				samlParser.loadFileContent(samlXml);
			}
			else
			{
				if(usePdsAuthentication)
				{
	    			lastError = "PDS authentication failed: Could not get SAML from engine.";
	    			return false;
				}
				
				LOG.error("Could not get SAML from engine. Getting it from a static file. This should only be used for testing purposes !!!");
				samlXml = getStaticFromFile();
				samlParser.loadFileContent(samlXml);
			}
    		
			LOG.info(samlXml);
    
    		String samlSdsUserId;
    		String samlSdsJobRoleCode;
    		
    		//user id
    		String engineSdsUserId = localEngine != null ? localEngine.getLoggedInUser().getsdsUserId() : localComponentEngine.getLoggedInUser().getsdsUserId();
    		try
    		{
    			samlSdsUserId = samlParser.getValueForField(SamlParser.UID);
    		}
    		catch (SAXException e)
    		{
    			e.printStackTrace();
    			
    			lastError = "PDS authentication failed: error getting SdsUserId from SAML xml.";
    			return false;
    		}
    		if(engineSdsUserId != null ? !engineSdsUserId.equals(samlSdsUserId) : samlSdsUserId != null)
    		{
    			lastError = "PDS authentication failed: SdsUserId values are not the same.";
    			
    			if(domain != null)
    			{
    				StringBuilder sb = new StringBuilder();
    				sb.append("PDS authentication failed: SdsUserId values are not the same.");
    				sb.append("\r\nsamlSdsUserId = ");
    				sb.append(samlSdsUserId);
    				sb.append("\r\nengineSdsUserId = ");
    				sb.append(engineSdsUserId);
    				
    				domain.createSystemLogEntry(SystemLogType.PDS, SystemLogLevel.WARNING, sb.toString());
    			}
    			
    			return false;
    		}
    		
    		LOG.debug("engineSdsUserId=" + engineSdsUserId + ", samlSdsUserId=" + samlSdsUserId);
    		
    		//role code
    		String engineSdsJobRoleCode = "";
    		
    		if(localEngine != null)
    			engineSdsJobRoleCode = localEngine.getLoggedInRole().getSpineRbacRole() != null ? localEngine.getLoggedInRole().getSpineRbacRole().getRoleCode() : null;
   			else
   				engineSdsJobRoleCode = localComponentEngine.getLoggedInRole().getSpineRbacRole() != null ? localComponentEngine.getLoggedInRole().getSpineRbacRole().getRoleCode() : null;
    			
    		try
    		{
    			samlSdsJobRoleCode = samlParser.getValueForField(SamlParser.NHSJOBROLECODE);
    		}
    		catch (SAXException e)
    		{
    			e.printStackTrace();
    			
    			lastError = "PDS authentication failed: error getting SdsJobRoleCode from SAML xml.";
    			return false;
    		}
    		
    		LOG.debug("engineSdsJobRoleCode=" + engineSdsJobRoleCode + ", samlSdsJobRoleCode=" + samlSdsJobRoleCode);
    		
    		if(engineSdsJobRoleCode != null && samlSdsJobRoleCode != null)
    		{
    			String[] items = samlSdsJobRoleCode.split(":");
    			
    			boolean found = false;
    			for(String item : items)
    			{
    				if(engineSdsJobRoleCode.equals(item))
    				{
    					found = true;
    					break;
    				}
    			}
    			
    			if(!found)
    			{
    				lastError = "PDS authentication failed: SdsJobRoleCode values are not the same.";
    				
    				if(domain != null)
    				{
    					StringBuilder sb = new StringBuilder();
    					sb.append("PDS authentication failed: SdsJobRoleCode values are not the same.");
    					sb.append("\r\nsamlSdsJobRoleCode = ");
    					sb.append(samlSdsJobRoleCode);
    					sb.append("\r\nengineSdsJobRoleCode = ");
    					sb.append(engineSdsJobRoleCode);
    					
    					domain.createSystemLogEntry(SystemLogType.PDS, SystemLogLevel.WARNING, sb.toString());
    				}
    				
    				return false;
    			}
    		}
    		else
    		{
    			lastError = "PDS authentication failed: SdsJobRoleCode values are not the same.";
    			
    			if(domain != null)
    			{
    				StringBuilder sb = new StringBuilder();
    				sb.append("PDS authentication failed: SdsJobRoleCode values are not the same.");
    				sb.append("\r\nsamlSdsJobRoleCode = ");
    				sb.append(samlSdsJobRoleCode);
    				sb.append("\r\nengineSdsJobRoleCode = ");
    				sb.append(engineSdsJobRoleCode);
    				
    				domain.createSystemLogEntry(SystemLogType.PDS, SystemLogLevel.WARNING, sb.toString());
    			}
    			
    			return false;
    		}
		}

		if((checks & PdsCheck.CHECK_ACTIVITY) != 0)
		{
			IRBACBaselineJobRole rbac = null;
			
    		if(localEngine != null)
    		{
    			if(localEngine.getLoggedInRole().getSpineRbacRole() == null)
        		{
        			lastError = "PDS authentication failed: could not get SpineRBAC for logged in role.";
        			return false;
        		}
    			
    			rbac = localEngine.getLoggedInRole().getSpineRbacRole();
    		}
    		else
    		{
    			if(localComponentEngine.getLoggedInRole().getSpineRbacRole() == null)
        		{
        			lastError = "PDS authentication failed: could not get SpineRBAC for logged in role.";
        			return false;
        		}
    			
    			rbac = localComponentEngine.getLoggedInRole().getSpineRbacRole();
    		}
    		
    		RBACBaselineJobRoleVo rbacRole;
    		RBACBaselineJobRoleRefVo refRole = new RBACBaselineJobRoleRefVo(rbac.getId(), 0);
    		String pdsRight = "";
    		
    		try
    		{
    			rbacRole = pq.getRBACBaselineJobRole(refRole);
    		}
    		catch(Exception e)
    		{
    			e.printStackTrace();
    			
    			lastError = "PDS authentication failed: error getting RBACBaselineJobRole from local DB.";
    			return false;
    		}
    		
    		LOG.debug(" Got rbacrole: " + rbacRole);
    		
    		switch(right)
    		{
    			case PDS_SEARCH_FOR_PATIENT:
    				pdsRight = config.getRBAC_PdsSearchForPatient();
    				break;
    			case PDS_SEARCH_PATIENT_ADVANCED:
    				pdsRight = config.getRBAC_PdsSearchPatientAdvanced();
    				break;
    			case PDS_RETRIEVAL:
    				pdsRight = config.getRBAC_PdsRetrieval();
    				break;
    			case ACCESS_SENSITIVE_DATA:
    				pdsRight = config.getRBAC_AccessSensitiveData();
    				break;
    			case AMEND_PATIENT:
    				pdsRight = config.getRBAC_AmendPatient();
    				break;
    			case CONTROL_CONSENT:
    				pdsRight = config.getRBAC_ControlConsent();
    				break;
    			case AMEND_PATIENT_DECEASE:
    				pdsRight = config.getRBAC_AmendPatientDecease();
    				break;
    			case POSTCODE_SEARCH:
    				pdsRight = config.getRBAC_PostcodeSearch();
    				break;
    			default:
    				break;
    		}
    		
    		if(rbacRole.getActivities() == null || rbacRole.getActivities().size() == 0)
    		{
    			lastError = "PDS authentication failed: no activities found in RBACBaselineJobRole.";
    			return false;
    		}
    
    		boolean found = false;
    		for(int i = 0; i < rbacRole.getActivities().size(); i++)
    		{
    			if(pdsRight.equals(rbacRole.getActivities().get(i).getActivityCode()))
    			{
    				found = true;
    				break;
    			}
    		}
    		
    		LOG.info("PDS right checked: " + pdsRight + (found ? ". Found in logged in role." : ". Not found in logged in role."));
    		
    		if(!found)
    		{
    			lastError = "PDS authentication failed: could not match the activity for logged in role.";
    			
    			if(domain != null)
    			{
    				StringBuilder sb = new StringBuilder();
    				sb.append("PDS authentication failed: could not match the activity for logged in role.");
    				sb.append("\r\nRBAC activity = ");
    				sb.append(pdsRight);
    				
    				domain.createSystemLogEntry(SystemLogType.PDS, SystemLogLevel.WARNING, sb.toString());
    			}
    			
    			return false;
    		}
		}
		
		LOG.debug("hasRightsFor END");
		
		return true;
	}

	private String getStaticFromFile()
	{
		InputStream init = Thread.currentThread().getContextClassLoader().getResourceAsStream("saml.xml");

		try
		{
			if (init == null)
			{
				throw new FileNotFoundException("The file saml.xml was not found. It should be found in \\webapp\\web-inf\\classes");
			}
			else
			{
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				byte[] buffer = new byte[1024];
				int length = 0;
				while ((length = init.read(buffer)) != -1)
				{
					baos.write(buffer, 0, length);
				}

				LOG.debug("SAML content loaded succesfully from saml.xml config file.");

				return new String(baos.toByteArray());
			}
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

		return null;
	}

	public String getLastError()
	{
		return lastError;
	}
	
	private boolean isPds()
	{
		return !"None".equals(ConfigFlag.DOM.USE_PDS.getValue());
	}
	
}
