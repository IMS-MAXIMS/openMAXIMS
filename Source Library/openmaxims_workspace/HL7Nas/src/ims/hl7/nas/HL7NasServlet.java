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
package ims.hl7.nas;

import ims.hl7.HL7Config;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class HL7NasServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	
	private HL7NasListener		hl7Engine;
	private static final Logger	LOG	= Logger.getLogger(HL7NasServlet.class);
	private static HL7Config	cfg;

	/**
	 * The init() method is called just once by the servlet container. If the servlet has been marked as load-on-startup it will get called early.
	 */
	public void init()
	{
		cfg = new HL7Config();
		startEngine();
	}

	public void destroy()
	{
		stopEngine();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doGet(request, response);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// Parameters are received with ?action=
		// Valid values are...
		// stop
		// start
		// restart
		String responseStr;
		if (!request.getParameterNames().hasMoreElements())
		{
			responseStr = "";
		}
		else
		{
			String param = request.getParameter("action");
			if (param != null && param.equalsIgnoreCase("stop"))
				responseStr = stopExtractProgram();
			else if (param != null && param.equalsIgnoreCase("start"))
				responseStr = startExtractProgram();
			else if (param != null && param.equalsIgnoreCase("refresh"))
				responseStr = "Status refreshed successfully.";
			else if (param != null && param.equalsIgnoreCase("restart"))
			{
				stopExtractProgram();
				startExtractProgram();
				responseStr = "HL7 NAS Engine has been restarted successfully.";
			}
			else if (param != null && param.equalsIgnoreCase("reset Nas"))
			{
				ConnectionManager.getInstance().reset();
				responseStr = "Nas Connection(s) Reset";
			}
			else
			{
				responseStr = "Invalid parameter specified - possible values are (action=stop, start, restart,reset Nas)";
			}
		}

		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		pw.write(getPage(responseStr));
	}

	private String getCurrentStatus()
	{
		String resp;
    	if (hl7Engine != null && hl7Engine.isRunning())
    	{
    		resp = "<p>HL7 NAS Engine is running.</p>";
    	}
    	else
    	{
       		if (hl7Engine != null && !hl7Engine.isRunning())
    		{
       			hl7Engine = null;
    		}
     		resp = "<p>HL7 NAS Engine is stopped.</p>";    		
    	}
		return resp;
	}

	public String stopExtractProgram()
	{
		if (hl7Engine == null)
			return "HL7 NAS Engine is not currently running.";

		stopEngine();

		return "HL7 Engine has been stopped successfully.";
	}

	private void stopEngine()
	{
		if (hl7Engine != null)
		{
			hl7Engine.stop();
			hl7Engine = null;
		}
	}

	public String startExtractProgram()
	{
		if (hl7Engine != null && cfg.startListener())
			return "HL7 NAS Engine is already running.";

		startEngine();
		return "HL7 NAS Engine has been started successfully.";
	}

    private void startEngine()
    {
    	stopEngine();
    	try
    	{
    		if (cfg.startListener())
    		{
            	hl7Engine = new HL7NasListener();
            	hl7Engine.start();    			
    		}
    	}
    	catch (Exception e)
    	{
			LOG.error("Failed to start HL7 NAS Engine", e);
            if (hl7Engine != null)
            {
                hl7Engine.stop();
                hl7Engine = null;        	
            }
    	}
    }    

	private String getPage(String msg)
	{
	   	String whatConfig = "";
    	if (cfg.startListener())
    	{
    		whatConfig += "<p>HL7 NAS Listener is configured to run.</p>";
    	}
    	else
    	{
    		whatConfig += "<p>HL7 NAS Listener is not configured to run.</p>";
    	}
    	
    	String currentStatus = getCurrentStatus();
    	
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>MAXIMS HL7 NAS Engine Controller</title>");
		sb.append("</head>");
		sb.append("<body bgcolor='white'>");
		sb.append("<h1 align='center'>MAXIMS HL7 NAS Engine v0.5</h1><hr>");
    	sb.append("<h3 align='center'>" + whatConfig + "</h3><hr>");
    	sb.append("Current Status : <b>" + currentStatus + "</b><br>");
		sb.append("<form>");
		sb.append("<input type='submit' value='Refresh' name='action'>");
		String btnText = "Start";
    	if (currentStatus.indexOf("running") > 0)
    	{
			sb.append("<input type='submit' value='Restart' name='action'>");
			btnText = "Stop";
		}
		sb.append("<input type='submit' value='" + btnText + "' name='action'>");
		btnText = "Reset NAS";
		sb.append("<input type='submit' value='" + btnText + "' name='action'>");
		sb.append("</form>");
		if (!msg.equals(""))
		{
			sb.append("<b>" + msg + "</b>");
		}
		sb.append("</body>");
		sb.append("</html>");

		return sb.toString();
	}
}
