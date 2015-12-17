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

import java.util.Date;

import ims.core.vo.MergeRequestVo;
import ims.core.vo.Patient;
import ims.domain.exceptions.DomainRuntimeException;
import ims.domain.exceptions.StaleObjectException;
import ims.hl7.domain.EventResponse;
import ims.hl7.utils.HL7Errors;
import ims.hl7.utils.HL7Utils;
import ims.ocrr.vo.ProviderSystemVo;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;

public class A34VoMapper extends VoMapper
{
	//WDEV-20112
//	public Message processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	public EventResponse processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception //WDEV-20112
	{
		return(processPatientMerge(msg, providerSystem));

	}

	public Message populateMessage()
	{
		// Not required for inbound messages
		return null;
	}

	/**
	 * Fills out a Merge Request VO, and inserts it. Background Merge process
	 * will perform the actual merge at a later date.
	 * 
	 * @param msg
	 * @return
	 * @throws HL7Exception
	 */
	//WDEV-20112
//	protected Message processPatientMerge(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	protected EventResponse processPatientMerge(Message msg, ProviderSystemVo providerSystem) throws HL7Exception //WDEV-20112
	{
		//WDEV-20112
		EventResponse response = new EventResponse(); //WDEV-20112
		
		Patient masterPat = getPrimaryIdFromPid(msg, providerSystem);

		//WDEV-20112
		response.setPatient(masterPat); //WDEV-20112
		
		Patient mp2 = null;
		try
		{
			mp2 = getDemog().getPatient(masterPat);
		}
		catch (StaleObjectException e1)
		{
			// this code should never be hit - only if getting a dto patient
			throw new DomainRuntimeException("Error replicating patient", e1);
		}
		if (mp2 != null)
		{
			masterPat = mp2;
			//WDEV-20112
			response.setPatient(mp2); //WDEV-20112
		}
		else
		{
			// If we don't have the master patient on the PMI, store it in the
			// PMI before proceeding.
			try
			{
				masterPat = savePatient(msg, providerSystem, false);
			}
			catch (Exception e)
			{
				//WDEV-20112
//				return HL7Utils.buildRejAck(msg.get("MSH"), "Exception: " + e.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems()));
				response.setMessage(HL7Utils.buildRejAck(msg.get("MSH"), "Exception: " + e.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems())));
				return response; //WDEV-20112
			}
		}

		Patient slavePat = getPrimaryIdFromMrg(msg, providerSystem);
		Patient sp2 = getDemog().getLocalPatient(slavePat);

		if (sp2 != null)
			slavePat = sp2;
		else
		{
			// If we don't have the slave patient, can we simply return quietly?
			//WDEV-20112
//			return HL7Utils.buildPosAck(msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems()));
			response.setMessage(HL7Utils.buildPosAck( msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems())));
			return response; //WDEV-20112
		}

		// wdev-9968
		if (slavePat.getID_Patient().equals(masterPat.getID_Patient()))
			//WDEV-20112
//			return HL7Utils.buildRejAck(msg.get("MSH"), "Exception: Source and Destination Internal Identifiers are the same, has this merge already occurred? (" + masterPat.getID_Patient() + ")", HL7Errors.DUP_KEY_ID, toConfigItemArray(providerSystem.getConfigItems()));
		{
			response.setMessage(HL7Utils.buildRejAck(msg.get("MSH"), "Exception: Source and Destination Internal Identifiers are the same, has this merge already occurred? (" + masterPat.getID_Patient() + ")", HL7Errors.DUP_KEY_ID, toConfigItemArray(providerSystem.getConfigItems())));
			return response; //WDEV-20112
		}
		
		
		slavePat.setIsActive(Boolean.FALSE);
		MergeRequestVo mergeVo = new MergeRequestVo();
		mergeVo.setSourcePatId(slavePat.getID_Patient());
		mergeVo.setDestinationPatId(masterPat.getID_Patient());
		mergeVo.setStatus(Boolean.FALSE); // Set to pending request.
		mergeVo.setComment("Merge Requested on " + new Date());

		try
		{
			String[] errs = mergeVo.validate();
			if (errs != null)
			{
				throw new HL7Exception("Validation of Merge Request failed. " + VoMapper.toDisplayString(errs));				
			}
			getPSearch().saveMergeRequest(mergeVo);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			//WDEV-20112
//			return HL7Utils.buildRejAck( msg.get("MSH"), "Exception: " + e.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems()));
			response.setMessage(HL7Utils.buildRejAck( msg.get("MSH"), "Exception: " + e.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems())));
			return response; //WDEV-20112
		}

		//WDEV-20112
//		Message ack = HL7Utils.buildPosAck( msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems()));
//		return ack;
		response.setMessage(HL7Utils.buildPosAck( msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems())));
		return response; //WDEV-20112
	}
	
}
