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

import ims.framework.UIComponentEngine;
import ims.framework.UIEngine;
import ims.framework.WindowParam;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.MultiThreadedHttpConnectionManager;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.apache.log4j.Logger;

public class DashboardSecureKeyHelper
{
	static final Logger log = Logger.getLogger(DashboardSecureKeyHelper.class);
	private static final int TIMEOUT = 1000 * 60 * 15;
	private static final int MAX_BUFFER_LIMIT_NO_WARNING = 1024 * 1024;

	private HttpClient client;
	private ArrayList<String> paramNames;
	private ArrayList<String> paramValues;
	private EngineWrapper engine;
	private ims.domain.DomainInterface domain;
	
	private enum OpenMode {CLOSEABLE_ON_CONTEXT_CHANGE, CUSTOM_URL};

	public DashboardSecureKeyHelper(ims.domain.DomainInterface domain, UIEngine engine)
	{
		super();

		client = new HttpClient(new MultiThreadedHttpConnectionManager());
		client.getHttpConnectionManager().getParams().setConnectionTimeout(TIMEOUT);
		client.getParams().setBooleanParameter(HttpMethodParams.USE_EXPECT_CONTINUE, true);
		client.getParams().setIntParameter(HttpMethodParams.BUFFER_WARN_TRIGGER_LIMIT, MAX_BUFFER_LIMIT_NO_WARNING);
		
		paramNames = new ArrayList<String>();
		paramValues = new ArrayList<String>();
		
		this.engine = new EngineWrapper(engine);
		this.domain = domain;
	}

	public DashboardSecureKeyHelper(ims.domain.DomainInterface domain, UIComponentEngine engine)
	{
		super();

		client = new HttpClient(new MultiThreadedHttpConnectionManager());
		client.getHttpConnectionManager().getParams().setConnectionTimeout(TIMEOUT);
		client.getParams().setBooleanParameter(HttpMethodParams.USE_EXPECT_CONTINUE, true);
		client.getParams().setIntParameter(HttpMethodParams.BUFFER_WARN_TRIGGER_LIMIT, MAX_BUFFER_LIMIT_NO_WARNING);
		
		paramNames = new ArrayList<String>();
		paramValues = new ArrayList<String>();
		
		this.engine = new EngineWrapper(engine);
		this.domain = domain;
	}
	
	public void clearParams()
	{
		paramNames.clear();
		paramValues.clear();
	}
	
	public void addDashboardParams(String paramName, String paramValue)
	{
		paramNames.add(paramName);
		paramValues.add(paramValue);
	}
	
	public boolean openDashboardCloseableOnContextChange(String dashboardUrl)
	{
		return internalOpenDashboard(dashboardUrl, OpenMode.CLOSEABLE_ON_CONTEXT_CHANGE);
	}
	
	public boolean openDashboard(String dashboardUrl)
	{
		return internalOpenDashboard(dashboardUrl, OpenMode.CUSTOM_URL);
	}
	
	private boolean internalOpenDashboard(String dashboardUrl, OpenMode openMode)
	{
		boolean ret = false;
		String url = dashboardUrl;
		boolean useSecureKey = true;
		
		if(url.indexOf("?sk=0") != -1 || url.indexOf("&sk=0") != -1)
		{
			//sk=0 means without Logi SecureKey authentication
			useSecureKey = false;
		}
		
		url = url.replaceAll("[&?]sk.*?(?=&|\\?|$)", ""); //regex to remove the query param "sk" and its value
        int indexAmp = url.indexOf('&');

        if(indexAmp > -1)
        {
            int indexQuestion = url.indexOf('?');

            if(indexQuestion == -1)
            {
                char[] cc = url.toCharArray();
                cc[indexAmp] = '?';
                url = new String(cc);
            }
        }
		
		if(url.endsWith("/"))
			url = url.substring(0, url.length() - 1);
		
		if(domain.getLoggedInUser() == null)
		{
			engine.showMessage("Could not get the domain user.");
			return false;
		}

		if(domain.getLoggedInUser().getUsername() == null || domain.getLoggedInUser().getUsername().length() == 0)
		{
			engine.showMessage("Could not get the domain user name.");
			return false;
		}

		/*
		if(domain.getLoggedInUser().getHostName() == null || domain.getLoggedInUser().getHostName().length() == 0)
		{
			engine.showMessage("Could not get the client IP address.");
			return false;
		}
		*/
		
		if(useSecureKey)
		{
    		//we pass "0.0.0.0" as clientIPAddress because MAXIMS server could be behind a proxy/load balancer
			String sKey = requestSecureKey("0.0.0.0", domain.getLoggedInUser().getUsername(), url);
    		if(sKey != null && sKey.length() > 0)
    			log.info("Got Secure key from Logi server.");
    		else
    		{
    			engine.showMessage("Could not get a Secure key from Logi server.");
    			return false;
    		}
    		
    		if(url.indexOf('?') == -1)
    		{
    			url += "?";
    		}
    		else
    		{
    			url += "&";
    		}
    		
    		url += "rdSecureKey=" + sKey;
		}
		
		for(int i = 0; i < paramNames.size(); i++)
		{
    		if(url.indexOf('?') == -1)
    		{
    			url += "?";
    		}
    		else
    		{
    			url += "&";
    		}

			try
			{
				url += paramNames.get(i) + "=" + URLEncoder.encode(paramValues.get(i), "UTF-8");
			}
			catch (UnsupportedEncodingException e)
			{
				e.printStackTrace();
				engine.showMessage(e.toString());
				return false;
			}
		}
		
		List<WindowParam> params = new ArrayList<WindowParam>(); 
		params.add(new WindowParam("FullScreen","false")); 
		params.add(new WindowParam("ToolBar","false")); 
		params.add(new WindowParam("StatusBar","false")); 
		params.add(new WindowParam("StatusBar","false")); 
		params.add(new WindowParam("MenuBar","false")); 
		params.add(new WindowParam("AddressBar","false")); 
		params.add(new WindowParam("Resizable","true")); 
		params.add(new WindowParam("Visible","true"));
		params.add(new WindowParam("Width","1440")); 
		params.add(new WindowParam("Height","1000")); 

		if(OpenMode.CLOSEABLE_ON_CONTEXT_CHANGE.equals(openMode))
			engine.openCustomUrlCloseableOnContextChange(url, params, true);
		else if(OpenMode.CUSTOM_URL.equals(openMode))
			engine.openCustomUrl(url, params, true);
		
		return ret;
	}
	
	public String requestSecureKey(String clientIP, String userName, String appURL)
	{
		String result = "XXX";
		String securityKeyFileLocation = "/rdTemplate/rdGetSecureKey.aspx";

		long mili1 = 0;
		long mili2 = 0;

		if (log.isDebugEnabled())
		{
			log.debug(null);
			log.debug("param clientIP = " + clientIP);
			log.debug("param userName = " + userName);
			log.debug("param appURL = " + appURL);

			mili1 = System.currentTimeMillis();
		}

		PostMethod post = new PostMethod(appURL + securityKeyFileLocation);

		NameValuePair[] data = { new NameValuePair("Username", userName), new NameValuePair("ClientBrowserAddress", clientIP) };
		post.setRequestBody(data);

		int iGetResultCode;

		try
		{

			iGetResultCode = client.executeMethod(post);

			if (log.isDebugEnabled())
			{
				mili2 = System.currentTimeMillis();
				log.debug("The LogiSecureKeyHelper.requestSecureKey() call took " + String.valueOf(mili2 - mili1) + " miliseconds");
			}

			if (iGetResultCode == HttpStatus.SC_OK)
			{
				result = new String(getResponseAsByteArray(post));

				if (log.isDebugEnabled())
				{

					log.debug("The LogiSecureKeyHelper.requestSecureKey() call was succesfull");

				}
			}
			else
			{
				log.error("The LogiSecureKeyHelper.requestSecureKey() call returned the error: " + iGetResultCode);
				log.error("The error message was : '" + post.getResponseBodyAsString() + "'");
			}

		}

		catch (HttpException e)
		{
			log.error("The LogiSecureKeyHelper.requestSecureKey() call returned the error: " + e.toString());
		}
		catch (IOException e)
		{
			log.error("The LogiSecureKeyHelper.requestSecureKey() call returned the error: " + e.toString());
		}
		finally
		{
			post.releaseConnection();
		}

		return result;

	}

	private byte[] getResponseAsByteArray(PostMethod post) throws IOException
	{
		InputStream inStream = post.getResponseBodyAsStream();
		if (inStream != null)
		{
			long contentLength = post.getResponseContentLength();
			if (contentLength > Integer.MAX_VALUE)
			{
				throw new IOException("Content too large to be buffered: " + contentLength + " bytes");
			}

			ByteArrayOutputStream outstream = new ByteArrayOutputStream(contentLength > 0 ? (int) contentLength : 4 * 1024);
			byte[] buffer = new byte[4096];
			int len;
			while ((len = inStream.read(buffer)) > 0)
			{
				outstream.write(buffer, 0, len);
			}
			outstream.close();

			return outstream.toByteArray();
		}
		else
		{
			return null;
		}
	}

	public class EngineWrapper
	{
		private UIEngine engine;
		private UIComponentEngine componentEngine;
		
		public EngineWrapper(UIEngine engine)
		{
			this.engine = engine;
		}
		
		public void showMessage(String msg)
		{
			if(engine != null)
				engine.showMessage(msg);
			else if(componentEngine != null)
				componentEngine.showMessage(msg);
		}

		public EngineWrapper(UIComponentEngine engine)
		{
			this.componentEngine = engine;
		}

		public int openCustomUrlCloseableOnContextChange(String url, List<WindowParam> windowParams,  boolean handleWindowEvents)
		{
			if(engine != null)
				return engine.openCustomUrlCloseableOnContextChange(url, windowParams, handleWindowEvents);
			else if(componentEngine != null)
				throw new RuntimeException("openCustomUrlCloseableOnContextChange not implemented for UIComponentEngine.");
			
			return 0;
		}
		
		public int openCustomUrl(String url, List<WindowParam> windowParams,  boolean handleWindowEvents)
		{
			if(engine != null)
				return engine.openCustomUrl(url, windowParams, handleWindowEvents);
			else if(componentEngine != null)
				throw new RuntimeException("openCustomUrl not implemented for UIComponentEngine.");
			
			return 0;
		}
		
	}
}
