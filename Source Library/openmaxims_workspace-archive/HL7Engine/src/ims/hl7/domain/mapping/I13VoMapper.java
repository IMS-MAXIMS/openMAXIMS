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
package ims.hl7.domain.mapping;

import ims.hl7.domain.HL7EngineApplication;
import ims.hl7.utils.EvnCodes;
import ims.ocrr.vo.ProviderSystemVo;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;

public class I13VoMapper extends VoMapper
{
	// This event is called when a send on leave event A21 is cancelled, i.e. the patient
	// is no longer on leave!
	
	private I12VoMapper i12mapper;

	public Message processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	{
		i12mapper = (I12VoMapper) HL7EngineApplication.getVoMapper(EvnCodes.I12);
		if (i12mapper == null)
		{
			throw new HL7Exception("I13 mapper requires I12 mapper. I12 mapper not found in list of registerd mappers.");			
		}
		return(i12mapper.processEvent(msg, providerSystem));
	}

	public Message populateMessage()
	{
		// Not required for inbound messages
		return null;
	}

}
