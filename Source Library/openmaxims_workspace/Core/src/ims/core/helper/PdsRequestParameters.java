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

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import ims.admin.helper.SamlParser;
import ims.admin.vo.PDSConfigurationVo;
import ims.framework.interfaces.IAppRole;

public class PdsRequestParameters
{
    private String fromAccreditedSystemId;
    private String toPDSAccreditedSystemId;
    private String userUUID;
    private String roleProfileCode;
    private String sdsJobRoleCode;
    private String pdsURL;
    private String pdsHost;
    //private UIEngine engine;
    private Boolean author1only = Boolean.FALSE;
    

	public PdsRequestParameters(String fromAccreditedSystemId, String toPDSAccreditedSystemId)
	{
		super();
		
		this.fromAccreditedSystemId = fromAccreditedSystemId;
		this.toPDSAccreditedSystemId = toPDSAccreditedSystemId;
		
		this.author1only = Boolean.TRUE;
	}
    
	public PdsRequestParameters(String fromAccreditedSystemId, String toPDSAccreditedSystemId, String userUUID, String roleProfileCode, String sdsJobRoleCode)
	{
		super();
		
		this.fromAccreditedSystemId = fromAccreditedSystemId;
		this.toPDSAccreditedSystemId = toPDSAccreditedSystemId;
		this.userUUID = userUUID;
		this.roleProfileCode = roleProfileCode;
		this.sdsJobRoleCode = sdsJobRoleCode;
	}
	
	public PdsRequestParameters(String fromAccreditedSystemId, String toPDSAccreditedSystemId, String userUUID, String roleProfileCode, String sdsJobRoleCode, String pdsURL, String pdsHost)
	{
		super();
		
		this.fromAccreditedSystemId = fromAccreditedSystemId;
		this.toPDSAccreditedSystemId = toPDSAccreditedSystemId;
		this.userUUID = userUUID;
		this.roleProfileCode = roleProfileCode;
		this.sdsJobRoleCode = sdsJobRoleCode;
		this.pdsURL = pdsURL;
		this.pdsHost = pdsHost;
	}

	public PdsRequestParameters()
	{
		super();
		
		PdsQuery q = new PdsQuery(null);
		
		PDSConfigurationVo pdsConfig = q.getPdsConfiguration();
		
		fromAccreditedSystemId = pdsConfig.getFromPDSAccreditedSystemId();
		toPDSAccreditedSystemId = pdsConfig.getToPDSAccreditedSystemId();
		
        //pdsAdvancedSearchReq.setSDSJobRoleCode("S0010:G0020:R0050");
        //pdsAdvancedSearchReq.setSDSRoleProfileId("R8000");
        //pdsAdvancedSearchReq.setSDSUserId("665289892010");

		userUUID = "665289892010";
		roleProfileCode = "R8000";
		sdsJobRoleCode = "S0010:G0020:R0050";
	}
	
	public PdsRequestParameters(String samlXml, IAppRole appRole)
	{
		super();
		
		//this.engine = engine;
		
		PdsQuery q = new PdsQuery(null);
		
		PDSConfigurationVo pdsConfig = q.getPdsConfiguration();
		
		fromAccreditedSystemId = pdsConfig.getFromPDSAccreditedSystemId();
		toPDSAccreditedSystemId = pdsConfig.getToPDSAccreditedSystemId();
		
        //pdsAdvancedSearchReq.setSDSJobRoleCode("S0010:G0020:R0050");
        //pdsAdvancedSearchReq.setSDSRoleProfileId("R8000");
        //pdsAdvancedSearchReq.setSDSUserId("665289892010");

		//if it doesn't use PDS authentication then we use the default params
		if(!Boolean.TRUE.equals(pdsConfig.getPDS_AUTHENTICATION()) || IPDSDemographicDomainHelper.DEFAULT.equals(samlXml))
		{
    		userUUID = "665289892010";
    		roleProfileCode = "R8000";
    		sdsJobRoleCode = "S0010:G0020:R0050";
		}
		else
		{
			if(samlXml == null || samlXml.length() == 0)
			{
	    		userUUID = "665289892010";
	    		roleProfileCode = "R8000";
	    		sdsJobRoleCode = "S0010:G0020:R0050";
				
				return;
			}
			
			SamlParser samlParser;
			try
			{
				samlParser = new SamlParser();
			}
			catch (ParserConfigurationException e)
			{
				e.printStackTrace();
				return;
			}
			catch (SAXException e)
			{
				e.printStackTrace();
				return;
			}
		    
			samlParser.loadFileContent(samlXml);

    		try
			{
				userUUID = samlParser.getValueForField(SamlParser.UID);
	    		roleProfileCode = samlParser.getValueForField(SamlParser.NHSOCSPRCODE);
	    		sdsJobRoleCode = samlParser.getValueForField(SamlParser.NHSJOBROLECODE);
			}
			catch (SAXException e)
			{
				e.printStackTrace();
			}
		}
		
		if(roleProfileCode == null || roleProfileCode.length() == 0)
		{
			if(appRole != null && appRole.getSpineRbacRole() != null)
				roleProfileCode = appRole.getSpineRbacRole().getRoleCode();
			
			if(appRole == null || appRole.getSpineRbacRole() == null)
				System.out.println("There is no Spine Rbac Role linked to current user role.");
			else if(appRole == null || appRole.getSpineRbacRole() == null || appRole.getSpineRbacRole().getRoleCode() == null || appRole.getSpineRbacRole().getRoleCode().length() == 0)
				System.out.println("There is no Spine Rbac Role Code linked to current user role.");
		}
	}
	
	public String getFromAccreditedSystemId()
	{
		return fromAccreditedSystemId;
	}

	public void setFromAccreditedSystemId(String fromAccreditedSystemId)
	{
		this.fromAccreditedSystemId = fromAccreditedSystemId;
	}

	public String getToPDSAccreditedSystemId()
	{
		return toPDSAccreditedSystemId;
	}

	public void setToPDSAccreditedSystemId(String toPDSAccreditedSystemId)
	{
		this.toPDSAccreditedSystemId = toPDSAccreditedSystemId;
	}

	public String getUserUUID()
	{
		return userUUID;
	}

	public void setUserUUID(String userUUID)
	{
		this.userUUID = userUUID;
	}

	public String getRoleProfileCode()
	{
		return roleProfileCode;
	}

	public void setRoleProfileCode(String roleProfileCode)
	{
		this.roleProfileCode = roleProfileCode;
	}

	public String getSdsJobRoleCode()
	{
		return sdsJobRoleCode;
	}

	public void setSdsJobRoleCode(String sdsJobRoleCode)
	{
		this.sdsJobRoleCode = sdsJobRoleCode;
	}

	public String getPdsURL()
	{
		return pdsURL;
	}

	public void setPdsURL(String pdsURL)
	{
		this.pdsURL = pdsURL;
	}

	public String getPdsHost()
	{
		return pdsHost;
	}

	public void setPdsHost(String pdsHost)
	{
		this.pdsHost = pdsHost;
	}

	public Boolean isAuthor1only()
	{
		return author1only;
	}

	public void setAuthor1only(Boolean author1only)
	{
		this.author1only = author1only;
	}
}
