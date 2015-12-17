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

import ims.core.patient.vo.PatientRefVo;
import ims.core.vo.Patient;
import ims.core.vo.PatientId;
import ims.core.vo.PatientIdCollection;
import ims.core.vo.lookups.PatIdType;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.exceptions.UniqueKeyViolationException;
import ims.hl7.domain.HL7EngineApplication;
import ims.hl7.utils.EvnCodes;
import ims.hl7.utils.HL7Errors;
import ims.hl7.utils.HL7Utils;
import ims.ocrr.vo.ProviderSystemVo;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v24.datatype.CX;
import ca.uhn.hl7v2.model.v24.message.ADT_A05;
import ca.uhn.hl7v2.model.v24.segment.EVN;
import ca.uhn.hl7v2.model.v24.segment.MRG;
import ca.uhn.hl7v2.model.v24.segment.PID;

public class A47VoMapper extends VoMapper
{
	private A28VoMapper a28mapper;
	
	public Message processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	{
		return processPatientIDUpdates(msg, providerSystem);
	}

	public Message populateMessage()
	{
		// Not required for inbound messages
		return null;
	}
	
	public Message populateMessage(PatientRefVo patient, String hl7Application,ProviderSystemVo providerSystem) throws Exception
	{
		a28mapper = (A28VoMapper) HL7EngineApplication.getVoMapper(EvnCodes.A28);
		if (a28mapper == null)
		{
			throw new HL7Exception("A47 mapper requires A28 mapper. A28 mapper not found in list of registerd mappers.");			
		}
		ADT_A05 msg =(ADT_A05)a28mapper.populateMessage(patient,hl7Application,providerSystem);
		EVN evn = msg.getEVN();
		evn.getEventTypeCode().setValue("A47");
		msg.getMSH().getMessageType().getTriggerEvent().setValue("A47");
		return msg;
	}

	
	
	protected Message processPatientIDUpdates(Message msg, ProviderSystemVo providerSystem) throws HL7Exception 
	{
		try
		{
			PID pid = (PID) msg.get("PID");
			CX[] idList = pid.getPatientIdentifierList();
			
			PatientIdCollection pidColl;
			try
			{
				pidColl = populatePatidCollectionFromIdList(idList, providerSystem);
			}
			catch (HL7Exception ex)
			{
				pidColl = new PatientIdCollection();
			}

  			Patient mrgPatVo = getPatientIdsFromMrg(msg, providerSystem);
			PatientIdCollection mrgColl = mrgPatVo.getIdentifiers();
			
  			Patient patVo = null;  
  			
			if (mrgPatVo != null)
			{
				patVo = getDemog().getPatient(mrgPatVo);
				if (patVo == null)  // wdev-2393 Patient not found - return silently
					return HL7Utils.buildPosAck( msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems()));

				PatientIdCollection removedIds = new PatientIdCollection();
				
				for (int i = 0; i < mrgColl.size(); i++)
				{
					PatientId mrgId = mrgColl.get(i);
					PatientId pidId = getPatientIdFromColl(pidColl, mrgId.getType());
					if (pidId == null)
					{
						// Cannot remove primary type
						if (providerSystem.getPrimaryPatientIdIsNotNull() && mrgId.getType().getId() == providerSystem.getPrimaryPatientId().getId())
							throw new HL7Exception("The Primary Patient Id cannot be removed");

						removedIds.add(mrgId);					
					}
					else
					{
						PatientId currId = patVo.getPatId(pidId.getType());
						if (currId == null)
						{
							patVo.getIdentifiers().add(pidId);
						}
						else
						{
							currId.setValue(pidId.getValue());
						}
					}
				}
							
				for (int i = 0; i < removedIds.size(); i++)
				{
					PatientId remId = removedIds.get(i);
					removePatId(patVo.getIdentifiers(), remId.getType());
				}
				
				String[] errors = patVo.validate();
				if (errors != null)
					return HL7Utils.buildRejAck(msg.get("MSH"), "New Patient Data caused Validation errors - " + errors.toString(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems()));
				getDemog().savePatient(patVo,true);
			}
		}
		catch (StaleObjectException ex)
		{
			return HL7Utils.buildRejAck( msg.get("MSH"), "StaleObjectException occured updating Patient Identifiers - " + ex.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems()));
		}
		catch (UniqueKeyViolationException e)
		{
			return HL7Utils.buildRejAck( msg.get("MSH"), "UniqueKeyViolationException occured updating Patient Identifiers - " + e.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems()));
		}
		catch (Exception exc)
		{
			exc.printStackTrace();
			return HL7Utils.buildRejAck( msg.get("MSH"), "Exception. " + exc.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems()));

		}

		Message ack = HL7Utils.buildPosAck( msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems()));
		return ack;
	}
	
	private PatientId getPatientIdFromColl(PatientIdCollection coll, PatIdType idType)
	{
		if (coll == null) 
			return null;
		
		for (int i = 0; i < coll.size(); i++)
		{
			ims.core.vo.PatientId id = coll.get(i);
			if (id.getType().equals(idType))
			{
				return id;
			}
		}
		return null;
		
	}

	private void removePatId(PatientIdCollection coll, PatIdType remType)
	{
		for (int i = 0; i < coll.size(); i++)
		{
			PatientId id = coll.get(i);
			if (id.getType().equals(remType))
			{
				coll.remove(i);
				return;
			}			
		}
	}

	private Patient getPatientIdsFromMrg(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	{
		Patient patVo = new Patient();
		MRG mrg = (MRG) msg.get("MRG");
		CX[] idList = mrg.getPriorPatientIdentifierList();
		PatientIdCollection idColl;
		try
		{
			idColl = populatePatidCollectionFromIdList(idList, providerSystem);
		}
		catch (HL7Exception ex)
		{
			idColl = new PatientIdCollection();
		}

		patVo.setIdentifiers(idColl);
		return patVo;
	}
	
}
