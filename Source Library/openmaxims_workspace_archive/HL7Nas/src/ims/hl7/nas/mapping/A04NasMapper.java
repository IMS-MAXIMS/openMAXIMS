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
package ims.hl7.nas.mapping;

import ims.hl7.nas.HL7NasApplication;
import ims.hl7.utils.SegName;

import imsmaxims.common.ImsNasMsg;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v24.segment.PV1;

public class A04NasMapper extends NasMapper
{
	public ImsNasMsg translate(Message msg) throws Exception 
	{
		if (conn == null) 
		{
			throw new Exception("Cannot operate without connection to NAS Server.");
		}
		
		PV1 pv1 = (PV1) msg.get(SegName.PV1);
		String tmpVal = pv1.getPatientClass().getValue(); 
		if (tmpVal != null && tmpVal.equalsIgnoreCase("O"))
		{
			NasMapper mapper = HL7NasApplication.getNasMapper("A05");
			if (mapper == null)
			{
				throw new Exception("A04 mapper requires A05 mapper. A05 mapper not found in list of registerd mappers.");			
			}
			mapper.setConnection(conn);
			return mapper.translate(msg);
		}
		else return null; //will just pos ack.
	
	}
}
