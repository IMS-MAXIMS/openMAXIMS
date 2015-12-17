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

import java.util.HashSet;
import java.util.Set;

import ims.core.vo.IfLookupInstanceVo;
import ims.core.vo.IfLookupInstanceVoCollection;
import ims.core.vo.IfLookupVo;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.StaleObjectException;
import ims.hl7.domain.EventResponse;
import ims.hl7.utils.HL7Errors;
import ims.hl7.utils.HL7Utils;
import ims.ocrr.vo.ProviderSystemVo;

import org.apache.log4j.Logger;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.Structure;
import ca.uhn.hl7v2.model.Varies;
import ca.uhn.hl7v2.model.v24.datatype.CE;
import ca.uhn.hl7v2.model.v24.datatype.ID;
import ca.uhn.hl7v2.model.v24.group.MFN_M01_MFEZxx;
import ca.uhn.hl7v2.model.v24.segment.MFE;
import ca.uhn.hl7v2.model.v24.segment.MFI;

public class M01VoMapper extends VoMapper
{
	/**
	 * MFN_M01
	 * Lookups
	 */
	
	private static final Logger		LOG		= Logger.getLogger(M01VoMapper.class);

	public Message populateMessage()
	{
		// TODO Auto-generated method stub
		return null;
	}

	//WDEV-20112
//	public Message processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	public EventResponse processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception //WDEV-20112
	{
		//WDEV-20112
		EventResponse response = new EventResponse(); //WDEV-20112
		
		try
		{
			if (isLookupType(msg))
			{
				processLookup(msg,providerSystem);
			}
		}
		catch (Exception ex)
		{
			LOG.error(ex.getMessage(), ex);
			//WDEV-20112
//			return HL7Utils.buildRejAck(msg.get("MSH"), ex.getClass().getName() + " occurred. " + ex.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems()));
			response.setMessage(HL7Utils.buildRejAck(msg.get("MSH"), ex.getClass().getName() + " occurred. " + ex.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems())));
			return response; //WDEV-20112
		}

		//WDEV-20122
//		Message ack = HL7Utils.buildPosAck(msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems()));
//		return ack;
		response.setMessage(HL7Utils.buildPosAck(msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems())));
		return response; //WDEV-20112
	}
	
	public boolean isLookupType(Message msg) throws HL7Exception
	{
		MFI mfi = (MFI) msg.get("MFI");
		if (mfi.getMasterFileIdentifier().getIdentifier().getValue().equals("MFE"))
			return true;
		else
			return false;
	}
	
	public void processLookup(Message msg,ProviderSystemVo providerSystem) throws HL7Exception, StaleObjectException,DomainInterfaceException
	{
		MFI mfi = (MFI) msg.get("MFI");
		Structure[] mo1mfes=msg.getAll("MFN_M01_MFEZxx");
		IfLookupVo lookup = new IfLookupVo();
		lookup.setLookupType(mfi.getMasterFileIdentifier().getText().getValue());
		lookup.setInstances(new IfLookupInstanceVoCollection());
		Set<String> verbs = new HashSet<String>();
		for (int i=0;i<mo1mfes.length;i++)
		{
			IfLookupInstanceVo instance = new IfLookupInstanceVo();
			MFN_M01_MFEZxx mo1mfe=(MFN_M01_MFEZxx)mo1mfes[i];
			MFE mfe=(MFE)mo1mfe.get("MFE");
			ID id = mfe.getPrimaryKeyValueType(0);
			if(id==null||!"CE".equalsIgnoreCase(id.getValue()))
				throw new HL7Exception("MFE-5 Primary key value type must be CE");
			Varies[] varies = mfe.getPrimaryKeyValueMFE();
			for (Varies varies2 : varies)  //should only be one
			{
				CE ce = new CE();
				varies2.setData(ce);
				ce = (CE)varies2.getData();
				instance.setCode(ce.getIdentifier().getValue());
				instance.setInstanceName(ce.getText().getValue());
				instance.setSystem(ce.getNameOfCodingSystem().getValue());
				String verb = mfe.getRecordLevelEventCode().getValue();
				instance.setVerb(verb);
				verbs.add(verb);
				if(!("MDC".equals(verb)||"MAD".equals(verb)||"MUP".equals(verb)))
				{
					throw new HL7Exception("MFE-1 Record level event code must be one of MDC, MUD or MAD");
				}
				
				lookup.getInstances().add(instance);
			}
		}
		if(verbs.size()>1&&verbs.contains("MDC"))
			throw new HL7Exception("MFE-1 Record level event code MDC cannot be used with other event codes.");
		try
		{
			lookupTree.saveInstanceDataFromHL7(lookup);
		}
		catch (DomainInterfaceException e)
		{
			throw new HL7Exception(e.getMessage());
		}
	}

}
