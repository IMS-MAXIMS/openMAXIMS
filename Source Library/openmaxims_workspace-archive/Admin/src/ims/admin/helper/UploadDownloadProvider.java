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
package ims.admin.helper;

import java.util.ArrayList;
import java.util.List;

import ims.configuration.gen.ConfigFlag;
import ims.domain.impl.DomainImpl;
import ims.framework.Context;
import ims.framework.UIEngine;
import ims.framework.UrlParam;
import ims.framework.exceptions.ConfigurationException;
import ims.framework.interfaces.IUploadDownloadUrlProvider;

public class UploadDownloadProvider extends DomainImpl implements IUploadDownloadUrlProvider{

	private static final long serialVersionUID = 1L;
	private Context ctx;
	
	public void setContext(Context ctx)
	{
		this.ctx = ctx;
	}
	
	public void download(UIEngine engine) throws ConfigurationException 
	{

		List<UrlParam> params = new ArrayList<UrlParam>();
		UrlParam paramUsername = new UrlParam("username",engine.getLoggedInUser().getUsername());
		UrlParam paramPassword = new UrlParam("password",engine.getLoggedInUser().getPassword());
				
		params.add(paramUsername);
		params.add(paramPassword);
		
		engine.openUrl(ConfigFlag.UI.OIT_DOWNLOAD_URL.getValue(),params);		
	}

	public void upload(UIEngine engine) throws ConfigurationException 
	{
		
		List<UrlParam> params = new ArrayList<UrlParam>();
		UrlParam paramUsername = new UrlParam("username",engine.getLoggedInUser().getUsername());
		UrlParam paramPassword = new UrlParam("password",engine.getLoggedInUser().getPassword());
				
		params.add(paramUsername);
		params.add(paramPassword);
		
		engine.openUrl(ConfigFlag.UI.OIT_UPLOAD_URL.getValue(),params);
	}
	
	public void download(UIEngine engine,String urlparams) throws ConfigurationException 
	{

		List<UrlParam> params = new ArrayList<UrlParam>();
		UrlParam paramUsername = new UrlParam("username",engine.getLoggedInUser().getUsername());
		UrlParam paramPassword = new UrlParam("password",engine.getLoggedInUser().getPassword());
				
		params.add(paramUsername);
		params.add(paramPassword);
		
		engine.openUrl(ConfigFlag.UI.OIT_DOWNLOAD_URL.getValue() + urlparams,params);		
	}

	public void upload(UIEngine engine,String urlparams) throws ConfigurationException 
	{
		
		List<UrlParam> params = new ArrayList<UrlParam>();
		UrlParam paramUsername = new UrlParam("username",engine.getLoggedInUser().getUsername());
		UrlParam paramPassword = new UrlParam("password",engine.getLoggedInUser().getPassword());
				
		params.add(paramUsername);
		params.add(paramPassword);
		
		engine.openUrl(ConfigFlag.UI.OIT_UPLOAD_URL.getValue() + urlparams,params);
	}
	
}
