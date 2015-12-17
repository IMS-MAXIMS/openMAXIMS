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

import ims.configuration.gen.ConfigFlag;
import ims.hl7.nas.mapping.V231NasMapper;
import ims.hl7.utils.HL7Utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.app.ApplicationException;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.parser.GenericParser;

public class HL7PasApplication extends HL7NasApplication implements NasProcessor
{
	private HL7PasProcessor processor;
	private List msgQ = Collections.synchronizedList(new ArrayList());

	public HL7PasApplication()
	{
		super();
		startProcessor();
	}

	public Message processMessage(Message msg) throws ApplicationException, HL7Exception
	{
		LOG.info("Start Processing Message. " + msg.getName());
		LOG.debug("Incoming message. " + msg.toString());
		
		msgQ.add(msg);
		
		if (isMessageToBeLogged())
		{
			String msgLocation = ConfigFlag.HL7.HL7_STORE_INBOUND_LOC.getValue();
			GenericParser parser = new GenericParser();			
			logMessage(parser.encode(msg), HL7Utils.getEventCode(msg), msgLocation);
		}		
		return HL7Utils.buildPosAck(msg.get("MSH"));		
	}
	
	public static V231NasMapper getV231NasMapper(String eventCode)
	{
		return (V231NasMapper)nasMappers.get(eventCode);
	}
	
	public void startProcessor()
	{
		stopProcessor();
		processor = new HL7PasProcessor(this);
		processor.startRunning();
	}

	public void stopProcessor()
	{
		if (processor != null && processor.isRunning())
		{
			processor.interrupt();
			processor = null;
		}
	}
	
	public Message getNextMessage()
	{
		if (msgQ.size() == 0)
			return null;
		
		return (Message)msgQ.remove(msgQ.size()-1);
	}
}
