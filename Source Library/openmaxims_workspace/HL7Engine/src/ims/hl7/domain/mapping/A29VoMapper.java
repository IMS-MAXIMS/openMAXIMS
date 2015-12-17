//#############################################################################
//#                                                                           #
//#  Copyright (C) <2015>  <IMS MAXIMS>                                       #
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
//#  IMS MAXIMS provides absolutely NO GUARANTEE OF THE CLINICAL SAFTEY of    #
//#  this program.  Users of this software do so entirely at their own risk.  #
//#  IMS MAXIMS only ensures the Clinical Safety of unaltered run-time        #
//#  software that it builds, deploys and maintains.                          #
//#                                                                           #
//#############################################################################
//#EOH
package ims.hl7.domain.mapping;

import ims.core.patient.vo.PatientRefVo;
import ims.core.vo.Patient;
import ims.domain.exceptions.DomainRuntimeException;
import ims.domain.exceptions.StaleObjectException;
import ims.hl7.domain.EventResponse;
import ims.hl7.domain.HL7EngineApplication;
import ims.hl7.utils.EvnCodes;
import ims.hl7.utils.HL7Errors;
import ims.hl7.utils.HL7Utils;
import ims.ocrr.vo.ProviderSystemVo;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v24.message.ADT_A05;
import ca.uhn.hl7v2.model.v24.segment.EVN;

public class A29VoMapper extends VoMapper
{
	//WDEV-20593
	private A28VoMapper a28mapper;

	//WDEV-20112
//	public Message processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	public EventResponse processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception //WDEV-20112
	{
		//WDEV-20112
//		return(processPatientDelete(msg, providerSystem));
		EventResponse response = new EventResponse();
		response = processPatientDelete(msg, providerSystem, response);
		return response; //WDEV-20112
	}

	public Message populateMessage()
	{
		// Not required for inbound messages
		return null;
	}

	//WDEV20593
	public Message populateMessage(PatientRefVo patient, String hl7Application, ProviderSystemVo providerSystem) throws Exception
	{
		a28mapper = (A28VoMapper) HL7EngineApplication.getVoMapper(EvnCodes.A28);
		if (a28mapper == null)
		{
			throw new HL7Exception("A29 mapper requires A28 mapper. A28 mapper not found in list of registerd mappers.");			
		}
		ADT_A05 msg =(ADT_A05)a28mapper.populateMessage(patient,hl7Application,providerSystem);
		EVN evn = msg.getEVN();
		evn.getEventTypeCode().setValue("A29");
		msg.getMSH().getMessageType().getTriggerEvent().setValue("A29");
		msg.getPV1().getPatientClass().setValue("N");
		return msg;
	}

	
	/**
	 * This does not perform an actual delete, just sets the patient to
	 * inactive.
	 * 
	 * @param msg
	 * @return
	 * @throws HL7Exception
	 */
	
	//WDEV-20112
//	private Message processPatientDelete(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	private EventResponse processPatientDelete(Message msg, ProviderSystemVo providerSystem, EventResponse response) throws HL7Exception //WDEV-20112
	{
		
		Patient patVo = getPrimaryIdFromPid(msg, providerSystem);

		Patient patVo2 = null;
		try
		{
			patVo2 = getDemog().getPatient(patVo);
			//WDEV-20112
			response.setPatient(patVo2); //WDEV-20112
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
			
			//WDEV-20112
//			Message ack = HL7Utils.buildPosAck( msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems()));
//			return ack;
			if(patVo2 == null)
			{
				response.setMessage(HL7Utils.buildErrAck( msg.get("MSH"), "Exception: Patient does not exist", HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems())));
			}
			if(patVo2 != null 
				&& patVo2.getIsActive() != null 
				&& patVo2.getIsActive().booleanValue() == false)
			{
				response.setMessage(HL7Utils.buildErrAck( msg.get("MSH"), "Exception: Patient already marked as inactive", HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems())));
			}
//				response.setMessage(HL7Utils.buildPosAck( msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems())));
			return response; //WDEV-20112			
		}
		else
		{
			patVo = patVo2;
		}

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
			//WDEV-20112
//			return HL7Utils.buildRejAck( msg.get("MSH"), "StaleObjectException: " + e.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems()));
			response.setMessage(HL7Utils.buildRejAck( msg.get("MSH"), "StaleObjectException: " + e.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems())));
			return response; //WDEV-20112
		}
		//WDEV-20112
//		Message ack = HL7Utils.buildPosAck( msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems()));
//		return ack;
		//WDEV-20112
		response.setMessage(HL7Utils.buildPosAck( msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems())));
		return response; //WDEV-20112
	}
}
