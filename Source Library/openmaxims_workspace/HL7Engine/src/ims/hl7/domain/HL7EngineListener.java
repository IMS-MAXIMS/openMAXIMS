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


import ims.domain.DomainSession;
import ims.domain.impl.DomainImplFlyweightFactory;
import ims.framework.enumerations.SystemLogLevel;
import ims.framework.enumerations.SystemLogType;
import ims.framework.utils.DateTime;
import ims.hl7.HL7Config;
import ims.hl7.interfaces.IHL7InterfaceComponent;
import ims.hl7.utils.EvnCodes;
import ims.hl7.utils.MsgTypes;
import ims.ocs_if.domain.OcsIfInbound;



import org.apache.log4j.Logger;

import ca.uhn.hl7v2.app.Application;
import ca.uhn.hl7v2.app.SimpleServer;
import ca.uhn.hl7v2.llp.MinLowerLayerProtocol;


/**
 * This is the main HL7 MLLP listener class responsible for 
 * receiving all HL7 message types over TCP/IP and passing 
 * them to applications that have registered what messages they will receive.
 * Normally this listener will have been started from HL7EngineServlet
 * during Servlet Container startup.
 * 
 * @author jmacenri
 *
 */
public class HL7EngineListener implements IHL7InterfaceComponent
{
	private boolean isRunning = false;
	private SimpleServer server;
	private Application app;
	private HL7Config cfg;
	private OcsIfInbound			ocsIfInbound;
	private DomainSession			sess = DomainSession.getSession();

	private DateTime startTime;

	private static final Logger LOG = Logger.getLogger(HL7EngineListener.class);

	public HL7EngineListener() throws Exception
	{
		doConfigure();		
	}

	private void doConfigure() throws Exception
	{
		cfg = new HL7Config();
		app = new HL7EngineApplication(cfg);
		
		server = new SimpleServer(cfg.getPort(), new MinLowerLayerProtocol(), ((HL7EngineApplication)app).getParser());		
		//PMI ADT Messages handled
		server.registerApplication(MsgTypes.ADT, EvnCodes.A28, app); //Register Patient
		server.registerApplication(MsgTypes.ADT, EvnCodes.A31, app); //Update Patient
		server.registerApplication(MsgTypes.ADT, EvnCodes.A29, app); //Delete Patient
		server.registerApplication(MsgTypes.ADT, EvnCodes.A47, app); //Update Patient ID Numbers
		server.registerApplication(MsgTypes.ADT, EvnCodes.A34, app); //Patient Merge		
		server.registerApplication(MsgTypes.ADT, EvnCodes.A40, app); //Patient Merge		

		//INPATIENT ADT Messages handled
		server.registerApplication(MsgTypes.ADT, EvnCodes.A01, app); //Admit a Patient		
		server.registerApplication(MsgTypes.ADT, EvnCodes.A02, app); //Transfer a Patient		
		server.registerApplication(MsgTypes.ADT, EvnCodes.A03, app); //Discharge a Patient		
		server.registerApplication(MsgTypes.ADT, EvnCodes.A08, app); //Update Admission/Discharge details
		server.registerApplication(MsgTypes.ADT, EvnCodes.A10, app); //PATIENT ARRIVING - TRACKING
		server.registerApplication(MsgTypes.ADT, EvnCodes.A11, app); //Delete an Admission		
		server.registerApplication(MsgTypes.ADT, EvnCodes.A12, app); //Delete a Transfer		
		server.registerApplication(MsgTypes.ADT, EvnCodes.A13, app); //Delete a Discharge
		server.registerApplication(MsgTypes.ADT, EvnCodes.A21, app); //Send on leave
		server.registerApplication(MsgTypes.ADT, EvnCodes.A22, app); //Return from leave
		server.registerApplication(MsgTypes.ADT, EvnCodes.A52, app); //Delete on leave
		server.registerApplication(MsgTypes.ADT, EvnCodes.A53, app); //Delete on leave
		server.registerApplication(MsgTypes.ADT, EvnCodes.A60, app); //Allergy messages
		
		//OUTPATIENT ADT Messages handled
		server.registerApplication(MsgTypes.ADT, EvnCodes.A05, app); //Book an Appointment
		server.registerApplication(MsgTypes.ADT, EvnCodes.A04, app); //Record an Arrival
		server.registerApplication(MsgTypes.ADT, EvnCodes.A38, app); //Cancel an Appointment
		
		//OCS RESULTS ORU Messages Handled
		server.registerApplication(MsgTypes.ORU, EvnCodes.R01, app); //Order Observation/Result
		server.registerApplication(MsgTypes.ORR, EvnCodes.R01, app); //Order Response
		server.registerApplication(MsgTypes.ORR, EvnCodes.O02, app); //General Order Response
		
		
		//OCS ORDER Messages Handles
		server.registerApplication(MsgTypes.ORM, EvnCodes.O01, app); //Used for Order Updates
		server.registerApplication(MsgTypes.OMG, EvnCodes.O19, app); //Used for General Order Updates
		server.registerApplication(MsgTypes.ORG, EvnCodes.O20, app); //Used for Gen Clinical Order Response
		server.registerApplication(MsgTypes.RDS, EvnCodes.O13, app);
		
		
		//Master Files
		server.registerApplication(MsgTypes.MFN, EvnCodes.M01, app); //lOOKUPS
		server.registerApplication(MsgTypes.MFN, EvnCodes.M02, app); //GP and Consultant Master File messages
		server.registerApplication(MsgTypes.MFN, EvnCodes.M05, app); //Ward and Clinic Master File messages

		// Patient Pathways
		server.registerApplication(MsgTypes.PPG, EvnCodes.PCG, app); // Patient Pathway - Goal Oriented
		
		server.registerApplication(MsgTypes.RDS, EvnCodes.O13, app);
		
		// Referral Messages WDEV-11723 
		server.registerApplication(MsgTypes.REF, EvnCodes.I12, app);
		server.registerApplication(MsgTypes.REF, EvnCodes.I13, app);
		server.registerApplication(MsgTypes.REF, EvnCodes.I14, app);
		
		server.registerApplication("ACK", "*", app); //ACK Message	
		
		//WDEV-6776
		try{
			if (ocsIfInbound == null)
			{
				ocsIfInbound = (OcsIfInbound) getDomainImpl("ims.ocs_if.domain.impl.OcsIfInboundImpl");			
			}			
		}
		catch (Exception e)
		{
			throw new RuntimeException("Exception occurred creating ocsIfInbound instance - " + e.getMessage(), e);
		}
	}
	
	public int getConnectionCount()
	{
		return server.getRemoteConnections().size();
	}
	
	public static void main(String[] args)
	{ 
		HL7EngineListener listener;
		try
		{
			listener = new HL7EngineListener();
			listener.startRunning();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void stopRunning()
	{
		if (isRunning)
		{
			server.stop();
			isRunning = false;
			LOG.warn("HL7 Engine has been stopped.");
			ocsIfInbound.createSystemLogEntry(SystemLogType.HL7, SystemLogLevel.WARNING, "HL7 Inbound Stopped");
		}
	}
	
	public void startRunning()
	{
		if (!isRunning)
		{
			server.start();
			startTime = new DateTime();
			isRunning = true;
			LOG.warn("HL7 Engine has been started.");			
			ocsIfInbound.createSystemLogEntry(SystemLogType.HL7, SystemLogLevel.WARNING, "HL7 Inbound Started, PORT:"  + Integer.toString(cfg.getPort()));			
		}
	}
	
	private Object getDomainImpl(String className) throws Exception
	{
		Class<?> implClass = Class.forName(className);
		DomainImplFlyweightFactory factory = DomainImplFlyweightFactory.getInstance();
		return factory.create(implClass, sess);
	}
	
	public boolean isRunning()
	{
		return isRunning;
	}
	
	public DateTime getStartTime()
	{		
		return startTime;
	}
	
	public int getProcessedCount(String evn)
	{
		return ((HL7EngineApplication)app).getProcessedCount(evn);
	}
	
	public int getSuccessfulCount(String evn)
	{
		return ((HL7EngineApplication)app).getSuccessCount(evn);
	}

	public int getErrorCount(String evn)
	{
		return ((HL7EngineApplication)app).getErrorCount(evn);
	}

	public String[] getEventCodesHandled()
	{
		return ((HL7EngineApplication)app).getEventCodesHandled();
	}


	public DateTime getLastSuccesfulDateTime(String evn)
	{
		return ((HL7EngineApplication)app).getLastSuccesfulDateTime(evn);
	}

	public String getLastSuccesfulMessage(String evn)
	{
		return ((HL7EngineApplication)app).getLastSuccesfulMessage(evn);
	}

	public DateTime getLastFailedDateTime(String evn)
	{
		return ((HL7EngineApplication)app).getLastFailedDateTime(evn);
	}

	public String getLastFailedMessage(String evn)
	{
		return ((HL7EngineApplication)app).getLastFailedMessage(evn);
	}
	
	public String getIpAddress()
	{
		return "";
	}
}
