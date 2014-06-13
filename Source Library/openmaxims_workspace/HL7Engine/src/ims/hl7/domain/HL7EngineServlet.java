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
package ims.hl7.domain;


import ims.hl7.HL7ControllerFactory;
import ims.hl7.interfaces.IHL7Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

/**
 * This class only exists as a mechanism of getting the HL7EngineListener automatically
 * started when the Servlet Container (e.g. Tomcat) is starting.
 * It's <servlet> entry in web.xml must have <load-on-startup> set to > 0
 * @author jmacenri
 */
public class HL7EngineServlet extends HttpServlet 
{
	private static final long	serialVersionUID	= 1L;
	private static final Logger	LOG		= Logger.getLogger(HL7EngineServlet.class);
	private static int initCount = 0;
	private static int destroyCount = 0;

	/**
	 * The init() method is called just once by the servlet container. 
	 * If the servlet has been marked as load-on-startup it will get called early.
	 */
    public void init()
    {
    	if (initCount == 0)
    	{
        	try
    		{
        		IHL7Controller controller = HL7ControllerFactory.getController();
        		controller.init(this.getServletContext().getRealPath("/"));
    		}
    		catch (Exception e)
    		{
    			e.printStackTrace();
    		}
    		LOG.warn("init() method of HL7EngineServlet called for the first time.");
    	}
    	else
    	{
    		LOG.warn("init() method of HL7EngineServlet called " + initCount + " times");    		
    	}
		initCount++;
    }
    
    public void destroy()
    {
    	if (destroyCount == 0)
    	{
//			IHL7Controller controller = HL7ControllerFactory.getController();
//			if (controller != null)
//				controller.shutdown();
			destroyCount++;
    	}
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
    	doGet(request, response);
	}
    
    public void doGet(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException 
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
    		if (param != null && param.equalsIgnoreCase("refresh"))
    			responseStr = "Status refreshed successfully.";
    		else
    		{
    		    responseStr = "Invalid parameter specified - possible values are (action=stop, start, restart)";
    		}       	
        }

		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		pw.write(getPage(responseStr));
	}
    
    private String getCurrentStatus() 
    {
    	IHL7Controller controller = HL7ControllerFactory.getController();
    	if (controller == null) 
    		return "<p>No HL7 Interface Controller has been found</p>";
    	
		String resp;
    	if (controller.isInboundRunning())
    	{
    		resp = "<p>Inbound Interface is running.</p>";
    	}
    	else
    	{
     		resp = "<p>Inbound Interface is stopped.</p>";    		
    	}
    	if (controller.isOutboundRunning())
    	{
    		resp += "<p>Outbound Interface is running.</p>";
    	}
    	else
    	{
     		resp += "<p>Outbound Interface is stopped.</p>";
    	}
		return resp;
	}

    
    private String getPage(String msg)
    {
    	IHL7Controller controller = HL7ControllerFactory.getController();
    	if (controller == null) 
    		return "<p>No HL7 Interface Controller has been found</p>";
    	
		String whatConfig = "";
    	if (controller.isInboundEnabled())
    	{
    		whatConfig += "<p>Inbound Listener is configured to run.</p>";
    	}
    	else
    	{
    		whatConfig += "<p>Inbound Listener is not configured to run.</p>";
    	}
    	if (controller.isOutboundEnabled())
    	{
    		whatConfig += "<p>Outbound Thread is configured to run.</p>";    		
    	}
		else
		{
			whatConfig += "<p>Outbound Thread is not configured to run.</p>";
		}
    	
    	String currentStatus = getCurrentStatus();
    	
    	StringBuffer sb = new StringBuffer();
    	sb.append("<html>");
    	sb.append("<head>");
    	sb.append("<title>MAXIMS HL7 Engine Controller</title>");
    	sb.append("</head>");
    	sb.append("<body bgcolor='white'>");
    	sb.append("<h1 align='center'>MAXIMS HL7 Engine v1.1</h1><hr>");
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
