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
import ims.hl7.utils.EvnCodes;
import ims.hl7.utils.MsgTypes;

import org.apache.log4j.Logger;

import ca.uhn.hl7v2.app.Application;
import ca.uhn.hl7v2.app.SimpleServer;
import ca.uhn.hl7v2.app.TwoPortService;

import ca.uhn.hl7v2.llp.MinLowerLayerProtocol;
import ca.uhn.hl7v2.parser.GenericParser;

public class HL7NasListener
{
	private SimpleServer	server;		
	private Application		app;
	TwoPortService twoPort;
	private boolean isRunning = false;
	private HL7Config cfg  = new HL7Config();
	private static final Logger LOG = Logger.getLogger(HL7NasListener.class);

	public HL7NasListener() 
	{
		doConfigure();
	}

	private void doConfigure() 
	{
		try
		{
			app = (Application)(Class.forName(cfg.getApplicationClassName()).newInstance());
		}
		catch(Exception e)
		{
			throw new RuntimeException("Failed to load HL7 Nas Application", e);
		}
		
		server = new SimpleServer(cfg.getPort(), new MinLowerLayerProtocol(), new GenericParser());		
		
		//PMI ADT Messages handled
		server.registerApplication(MsgTypes.ADT, EvnCodes.A01, app); //Admit Patient
		server.registerApplication(MsgTypes.ADT, EvnCodes.A02, app); //Transfer Patient
		server.registerApplication(MsgTypes.ADT, EvnCodes.A03, app); //Discharge Patient
		server.registerApplication(MsgTypes.ADT, EvnCodes.A04, app); //Discharge Patient
		server.registerApplication(MsgTypes.ADT, EvnCodes.A05, app); //Pre-admit/book
		server.registerApplication(MsgTypes.ADT, EvnCodes.A08, app); //Update Patient Information
		server.registerApplication(MsgTypes.ADT, EvnCodes.A11, app); //Cancel Patient Admit
		server.registerApplication(MsgTypes.ADT, EvnCodes.A12, app); //Cancel Transfer
		server.registerApplication(MsgTypes.ADT, EvnCodes.A13, app); //Cancel Patient Discharge		
		server.registerApplication(MsgTypes.QRY, EvnCodes.A19, app); //Patienty Query
		server.registerApplication(MsgTypes.ADT, EvnCodes.A23, app); //Register Patient		
		server.registerApplication(MsgTypes.ADT, EvnCodes.A28, app); //Register Patient
		server.registerApplication(MsgTypes.ADT, EvnCodes.A29, app); //Delete Patient
		server.registerApplication(MsgTypes.ADT, EvnCodes.A31, app); //Update Patient
		server.registerApplication(MsgTypes.ADT, EvnCodes.A34, app); //Merge Patient
		server.registerApplication(MsgTypes.ADT, EvnCodes.A38, app); //Cancel Transfer
		server.registerApplication(MsgTypes.ADT, EvnCodes.A40, app); //Merge Patient
		server.registerApplication(MsgTypes.ADT, EvnCodes.A47, app); //Update IDs
		server.registerApplication(MsgTypes.ADT, EvnCodes.A60, app); //Allergy
		//MFN
		server.registerApplication(MsgTypes.MFN, EvnCodes.M01, app); //Lookups Master File Message
		server.registerApplication(MsgTypes.MFN, EvnCodes.M02, app);
		server.registerApplication(MsgTypes.MFN, EvnCodes.M05, app);
		//ORU
		server.registerApplication(MsgTypes.ORU, EvnCodes.R01, app); //Observation Reporting		
		//SIU
		server.registerApplication(MsgTypes.SIU, EvnCodes.S12, app); 
		server.registerApplication(MsgTypes.SIU, EvnCodes.S13, app); 
		server.registerApplication(MsgTypes.SIU, EvnCodes.S14, app); 
		server.registerApplication(MsgTypes.SIU, EvnCodes.S15, app);
		server.registerApplication(MsgTypes.SIU, EvnCodes.S26, app); 
		

		server.registerApplication(MsgTypes.ACK, "*", app); //ACK Message		
	}
	
	public void stop()
	{
		if (isRunning)
		{
			if (app instanceof NasProcessor)
			{
				NasProcessor nap = (NasProcessor)app;
				nap.stopProcessor();
			}
			server.stop();
			isRunning = false;
			LOG.warn("HL7 NAS Engine has been stopped.");
		}
	}
	
	public void start()
	{
		if (!isRunning)
		{
			server.start();
			isRunning = true;
			LOG.warn("HL7 NAS Engine has been started.");
		}
	}
	
	public boolean isRunning()
	{
		return isRunning;
	}

	public int getConnectionCount()
	{
		return server.getRemoteConnections().size();
	}

}
