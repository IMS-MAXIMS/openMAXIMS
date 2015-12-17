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
import imsmaxims.common.ImsNasMsg;
import ca.uhn.hl7v2.model.Message;

public class V231S13NasMapper extends V231NasMapper
{	
	public ImsNasMsg translate(Message msg) throws Exception
	{
		NasMapper mapper = (V231NasMapper)HL7NasApplication.getNasMapper("V231S12");
		if (mapper == null)
		{
			throw new Exception("S13 mapper requires S12 mapper. S12 mapper not found in list of registerd mappers.");
		}
		mapper.setConnection(conn);
		return mapper.translate(msg);
	}
}
