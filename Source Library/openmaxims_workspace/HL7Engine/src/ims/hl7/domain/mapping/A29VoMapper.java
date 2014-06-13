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

import ims.core.vo.Patient;
import ims.domain.exceptions.DomainRuntimeException;
import ims.domain.exceptions.StaleObjectException;
import ims.hl7.utils.HL7Errors;
import ims.hl7.utils.HL7Utils;
import ims.ocrr.vo.ProviderSystemVo;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;

public class A29VoMapper extends VoMapper
{

	public Message processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	{
		return(processPatientDelete(msg, providerSystem));
	}

	public Message populateMessage()
	{
		// Not required for inbound messages
		return null;
	}

	/**
	 * This does not perform an actual delete, just sets the patient to
	 * inactive.
	 * 
	 * @param msg
	 * @return
	 * @throws HL7Exception
	 */
	private Message processPatientDelete(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	{
		Patient patVo = getPrimaryIdFromPid(msg, providerSystem);
		Patient patVo2 = null;
		try
		{
			patVo2 = getDemog().getPatient(patVo);
		}
		catch (StaleObjectException e1)
		{
			// this code should never be hit - only if getting a dto patient
			throw new DomainRuntimeException("Error replicating patient", e1);
		}
		if (patVo2 == null || (patVo2.getIsActive() != null && patVo2.getIsActive().booleanValue() == false))
		{
			// If we don't have the patient, no point inserting, as this is a
			// Delete call
			// or if it's already inactive.
			Message ack = HL7Utils.buildPosAck( msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems()));
			return ack;
		}
		else
			patVo = patVo2;

		try
		{
			String[] errs = patVo.validate();
			if (errs != null)
			{
				throw new HL7Exception("Validation of Patient failed. " + VoMapper.toDisplayString(errs));				
			}
			getDemog().deletePatient(patVo);
		}
		catch (StaleObjectException e)
		{
			e.printStackTrace();
			return HL7Utils.buildRejAck( msg.get("MSH"), "StaleObjectException: " + e.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems()));
		}
		Message ack = HL7Utils.buildPosAck( msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems()));
		return ack;
	}
}
