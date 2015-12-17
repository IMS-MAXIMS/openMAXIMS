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

import ca.uhn.hl7v2.model.Message;
import ims.hl7.nas.HL7NasApplication;
import imsmaxims.common.ImsNasMsg;

public class A23NasMapper extends NasMapper
{
	public ImsNasMsg translate(Message msg) throws Exception
	{
		ImsNasMsg nm = new ImsNasMsg();
		ImsNasMsg undoEncounterOPT = new ImsNasMsg();
		ImsNasMsg undoEncounterAPD = new ImsNasMsg();
		NasMapper mapper = HL7NasApplication.getNasMapper("A23");
		if (mapper == null)
		{
			throw new Exception("A23 mapper requires A11 mapper. A11 mapper not found in list of registerd mappers.");			
		}
		mapper.setConnection(conn);
		nm = mapper.translate(msg);
		
		undoEncounterAPD.addPair("*SERVICE", "APD");
		undoEncounterAPD.addPair("ACTION", "DELETE"); 
		undoEncounterAPD.addPair("PKEY",nm.getPairVal("PKEY"));
		undoEncounterAPD.addPair("SCEP",nm.getPairVal("SCEP"));
		
		undoEncounterOPT.addPair("*SERVICE", "OPT");
		undoEncounterOPT.addPair("ACTION", "DELETE"); 
		undoEncounterOPT.addPair("PKEY",nm.getPairVal("PKEY"));
		undoEncounterOPT.addPair("SCEP",nm.getPairVal("SCEP"));
		
		undoEncounterAPD.append(undoEncounterOPT);
		nm.append(undoEncounterAPD);		
		
		return nm;
	}
}
