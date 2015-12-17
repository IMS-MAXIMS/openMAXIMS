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

import ims.hl7.utils.SegName;
import imsmaxims.common.ImsNasMsg;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v24.segment.EVN;
import ca.uhn.hl7v2.model.v24.segment.MRG;


public class A34NasMapper extends NasMapper
{
	public ImsNasMsg translate(Message msg) throws Exception
	{
		//WDEV-5010
		if (conn == null) 
		{
			throw new Exception("Cannot operate without connection to NAS Server.");
		}
		MRG mrg = (MRG) msg.get(SegName.MRG);
		
		//EVN
		EVN evn = (EVN) msg.get(SegName.EVN);
		/* field 1 */
		if (!evn.getEventTypeCode().getValue().equalsIgnoreCase("A34"))
		{
			throw new HL7Exception("Unexpected Event Type Code for this message type");
		}
		
		return doMerge(mrg,msg,null);
		
	}	
		
}
