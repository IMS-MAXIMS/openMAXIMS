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

import ims.core.vo.LocShortVo;
import ims.core.vo.PatientShort;
import ims.core.vo.lookups.TaxonomyType;
import ims.domain.exceptions.StaleObjectException;
import ims.hl7.utils.HL7Errors;
import ims.hl7.utils.HL7Utils;
import ims.ocrr.vo.ProviderSystemVo;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v24.segment.PV1;

public class A21VoMapper extends VoMapper
{
	public Message processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	{
		return processPatientLeave(msg, providerSystem);
	}

	public Message populateMessage()
	{
		// Not needed for inbound messages
		return null;
	}
	
	protected Message processPatientLeave(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	{
		try
		{
			
			PatientShort patVo = (PatientShort)getPrimaryIdFromPid(msg, providerSystem);
			
			if (patVo != null)
			{
				patVo = getDemog().getPatient(patVo);
				
				if (patVo == null)
					return HL7Utils.buildRejAck(msg.get("MSH"), "This patient has not been registered within the system", HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems()));

				String eventCode = HL7Utils.getEventCode(msg);
				if (eventCode.equals("A21") || eventCode.equals("A53"))  // A21 set's patient on leave, A53 cancels the cancelled Patient Leave i.e. sets them on leave again
					adt.recordInpatientLeave(patVo);
				else if (eventCode.equals("A22") || eventCode.equals("A52"))  // Cancel Patient's Leave
				{
					PV1 pv1 = (PV1) msg.get("PV1");
					LocShortVo loc = null;
					loc = orgLoc.getLocationByTaxonomyType(pv1.getAssignedPatientLocation().getPointOfCare().getValue(), TaxonomyType.PAS);
					patVo.setWard(loc);
					adt.cancelInpatientLeave(patVo);  // A22
				}
			}
		}
		catch (StaleObjectException ex)
		{
			return HL7Utils.buildRejAck( msg.get("MSH"), "StaleObjectException occured recording Inpatient Leave - " + ex.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems()));
		}

		Message ack = HL7Utils.buildPosAck( msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems()));
		return ack;
	}
	

}
