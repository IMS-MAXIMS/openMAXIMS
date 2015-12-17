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

public class O20VoMapper extends VoMapper {

	@Override
	public Message processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception 
	{
		O02VoMapper o02mapper = (O02VoMapper) HL7EngineApplication.getVoMapper(EvnCodes.O02);
		if (o02mapper == null)
		{
			throw new HL7Exception("O20 mapper requires O02 mapper. O02 mapper not found in list of registerd mappers.");			
		}
		return o02mapper.processEvent(msg, providerSystem);
		
	}

	@Override
	public Message populateMessage() 
	{		
		return null;
	}

}
