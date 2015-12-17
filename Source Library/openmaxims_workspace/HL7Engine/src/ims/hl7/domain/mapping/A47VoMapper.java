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
import ims.core.vo.PatientId;
import ims.core.vo.PatientIdCollection;
import ims.core.vo.lookups.PatIdType;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.exceptions.UniqueKeyViolationException;
import ims.framework.utils.DateTimeFormat;
import ims.hl7.domain.EventResponse;
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
	
	//WDEV-20112
//	public Message processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	public EventResponse processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception //WDEV-20112
	{
		//WDEV-20112
//		return processPatientIDUpdates(msg, providerSystem);
		EventResponse response = new EventResponse();
		response = processPatientIDUpdates(msg, providerSystem, response);
		return response;//WDEV-20112
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
		
		//WDEV-22918
		// EVN-2 Recorded Date/Time (TS)
		Patient fullPatient = demog.getPatient(patient);
		if (fullPatient != null
				&& fullPatient.getSysInfo() != null)
		{
			if (fullPatient.getSysInfo().getLastupdateDateTime() != null)
			{
				evn.getRecordedDateTime().getTimeOfAnEvent().setValue(fullPatient.getSysInfo().getLastupdateDateTime().toString(DateTimeFormat.ISO));
			}
			else if (fullPatient.getSysInfo().getCreationDateTime() != null)
			{
				evn.getRecordedDateTime().getTimeOfAnEvent().setValue(fullPatient.getSysInfo().getCreationDateTime().toString(DateTimeFormat.ISO));
			}
		} //WDEV-22918
		
		evn.getEventTypeCode().setValue("A47");
		msg.getMSH().getMessageType().getTriggerEvent().setValue("A47");
		return msg;
	}

	

	//WDEV-20112
//	protected Message processPatientIDUpdates(Message msg, ProviderSystemVo providerSystem) throws HL7Exception 
	protected EventResponse processPatientIDUpdates(Message msg, ProviderSystemVo providerSystem, EventResponse response) throws HL7Exception //WDEV-20112 
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
			//WDEV-20112
			response.setPatient(patVo); //WDEV-20112
			
			if (mrgPatVo != null)
			{
				patVo = getDemog().getPatient(mrgPatVo);
				if (patVo == null)  // wdev-2393 Patient not found - return silently
					//WDEV-20112
//					return HL7Utils.buildPosAck( msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems()));
				{
					response.setMessage(HL7Utils.buildPosAck( msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems())));
					return response; //WDEV-20112
				}

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
					//WDEV-20112
//					return HL7Utils.buildRejAck(msg.get("MSH"), "New Patient Data caused Validation errors - " + errors.toString(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems()));
				{
					response.setMessage(HL7Utils.buildRejAck(msg.get("MSH"), "New Patient Data caused Validation errors - " + errors.toString(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems())));
					return response; //WDEV-20112
				}
				getDemog().savePatient(patVo,true);
			}
		}
		catch (StaleObjectException ex)
		{
			//WDEV-20112
//			return HL7Utils.buildRejAck( msg.get("MSH"), "StaleObjectException occured updating Patient Identifiers - " + ex.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems()));
			response.setMessage(HL7Utils.buildRejAck( msg.get("MSH"), "StaleObjectException occured updating Patient Identifiers - " + ex.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems())));
			return response; //WDEV-20112
		}
		catch (UniqueKeyViolationException e)
		{
			//WDEV-20112
//			return HL7Utils.buildRejAck( msg.get("MSH"), "UniqueKeyViolationException occured updating Patient Identifiers - " + e.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems()));
			response.setMessage(HL7Utils.buildRejAck( msg.get("MSH"), "UniqueKeyViolationException occured updating Patient Identifiers - " + e.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems())));
			return response; //WDEV-20112
		}
		catch (Exception exc)
		{
			exc.printStackTrace();
			//WDEV-20112
//			return HL7Utils.buildRejAck( msg.get("MSH"), "Exception. " + exc.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems()));
			response.setMessage(HL7Utils.buildRejAck( msg.get("MSH"), "Exception. " + exc.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems())));
			return response; //WDEV-20112

		}

		//WDEV-20112
//		Message ack = HL7Utils.buildPosAck( msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems()));
//		return ack;
		response.setMessage(HL7Utils.buildPosAck( msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems())));
		return response; //WDEV-20112
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
