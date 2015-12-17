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

import java.net.InetAddress;

import org.apache.log4j.Logger;

import ims.hl7.HL7Config;
import ims.hl7.interfaces.IHL7Controller;
import ims.hl7.interfaces.IHL7InterfaceComponent;

public class HL7InterfaceController implements IHL7Controller
{
	private static final Logger	LOG		= Logger.getLogger(HL7InterfaceController.class);
	private static boolean initialised = false;
	private static String servletContext;
	private static HL7Config cfg;
	private static IHL7InterfaceComponent hl7Inbound;
	private static IHL7InterfaceComponent hl7Outbound;

	public synchronized void init(String context) throws Exception
	{
		if (initialised)
			return;
		
		servletContext = context;
		cfg = new HL7Config();
		startup();
		initialised = true;
	}
	
	public synchronized void startup() throws Exception
	{
		startInbound();
		startOutbound();		
	}
	
	public synchronized void startInbound() throws Exception 
	{
		if (cfg.startListener())
		{
			if (isInboundRunning())
				return;
			hl7Inbound = new HL7EngineListener();
			hl7Inbound.startRunning();    			
			LOG.info("HL7Engine Inbound started");
			
		}		
	}

	public synchronized void startOutbound() throws Exception
	{		
		if (cfg.startOutbound())
		{
			if (isOutboundRunning())
				return;
			
        	hl7Outbound = new HL7EngineOutbound(InetAddress.getLocalHost().getHostAddress(), servletContext);
        	hl7Outbound.startRunning();    		    			
			LOG.info("HL7Engine Outbound started");
		}
	}

	public synchronized void shutdown() 
	{
		stopInbound();
		stopOutbound();
	}
	
	public synchronized void stopInbound()
	{
        if (hl7Inbound != null)
        {
        	hl7Inbound.stopRunning();
        	hl7Inbound = null;        	
			LOG.info("HL7Engine Inbound stopped");
        }   	
	}

	public synchronized void stopOutbound()
	{
        if (hl7Outbound != null)
        {
        	hl7Outbound.stopRunning();
        	hl7Outbound = null;        	
			LOG.info("HL7Engine Outbound stopped");
        }   	
	}
	
	public boolean isOutboundRunning()
	{
		if (hl7Outbound == null || !hl7Outbound.isRunning())
			return false;
		else
			return true;
	}
	
	public boolean isInboundRunning()
	{
		if (hl7Inbound == null || !hl7Inbound.isRunning())
			return false;
		else
			return true;
	}

	public IHL7InterfaceComponent getOutbound()
	{
		return hl7Outbound;
	}
	
	public IHL7InterfaceComponent getInbound()
	{
		return hl7Inbound;
	}
	
	public boolean isOutboundEnabled()
	{
		return cfg.startOutbound();
	}

	public boolean isInboundEnabled()
	{
		return cfg.startListener();
	}

	public void disableInbound()
	{
		cfg.setStartInbound(false);
	}

	public void disableOutbound()
	{
		cfg.setStartOutbound(false);		
	}

	public void enableInbound()
	{
		cfg.setStartInbound(true);
	}

	public void enableOutbound()
	{
		cfg.setStartOutbound(true);		
	}	
}
