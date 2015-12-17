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

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import ims.configuration.gen.ConfigFlag;
import ims.core.patient.vo.PatientRefVo;
import ims.core.vo.Patient;
import ims.core.vo.PatientId;
import ims.core.vo.PatientIdCollection;
import ims.core.vo.lookups.PatIdType;
import ims.hl7.domain.HL7EngineApplication;
import ims.hl7.utils.EvnCodes;
import ims.ocrr.vo.ProviderSystemVo;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v24.datatype.CX;
import ca.uhn.hl7v2.model.v24.message.ADT_A39;
import ca.uhn.hl7v2.model.v24.segment.EVN;
import ca.uhn.hl7v2.model.v24.segment.MRG;
import ca.uhn.hl7v2.model.v24.segment.MSH;
import ca.uhn.hl7v2.model.v24.segment.PID;

public class A40VoMapper extends VoMapper
{
	private A34VoMapper a34mapper;
	private static final String eventType="A40";
	private static final Logger	LOG	= Logger.getLogger(A40VoMapper.class);

	
	public Message processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	{
		a34mapper = (A34VoMapper) HL7EngineApplication.getVoMapper(EvnCodes.A34);
		if (a34mapper == null)
		{
			throw new HL7Exception("A40 mapper requires A34 mapper. A34 mapper not found in list of registerd mappers.");			
		}
		
		return(a34mapper.processPatientMerge(msg, providerSystem));

	}

	public Message populateMessage()
	{
		// Not required for inbound messages
		return null;
	}
	public Message populateMessage(PatientRefVo patient, PatientRefVo priorPatient,PatientIdCollection priorPatsIDs,String hl7Application,ProviderSystemVo providerSystem) throws Exception
	{
		Patient fullPatient = demog.getPatient(patient);
		ADT_A39 a40 = new ADT_A39();
		MSH msh= a40.getMSH();
		
		populateMSH(providerSystem, msh, Long.toString( new java.util.Date().getTime()), "ADT", "A40");
		EVN evn = a40.getEVN();
		populateEVN(evn, eventType) ;
		
		
		//remove the priorPatIds before rendering the PID
		List <PatientId> patIdsToRemove = new ArrayList<PatientId>(); 
		for (PatientId priorPatientId : priorPatsIDs)
		{
			 for (PatientId patientId : fullPatient.getIdentifiers())
			{
				if(comparePatIds(patientId,priorPatientId))
				{
					patIdsToRemove.add(patientId);
					continue;
				}
					
			}
		}
		for (PatientId patientId : patIdsToRemove)
		{
			fullPatient.getIdentifiers().remove(patientId);
		}
		
		PID pid = a40.getADT_A39_PIDPD1MRGPV1().getPID();
		renderPatientVoToPID(fullPatient, pid, providerSystem);
		MRG mrg = a40.getADT_A39_PIDPD1MRGPV1().getMRG();
		renderPatidCollectionToMrg(priorPatsIDs,mrg,providerSystem);
		return a40;
	}
	
	private boolean comparePatIds(PatientId first,PatientId second)
	{
		if(first==null||second==null)
			return false;
		if(first.equals(second))
			return true;
		if(first.getTypeIsNotNull()&&second.getTypeIsNotNull()&&first.getType().equals(second.getType())
				&&first.getValueIsNotNull()&&second.getValueIsNotNull()&&first.getValue().equals(second.getValue())
				)
		{
			boolean firstVerified=first.getVerifiedIsNotNull()&&first.getVerified()?true:false;
			boolean secondVerified=second.getVerifiedIsNotNull()&&first.getVerified()?true:false;
			if(firstVerified==secondVerified)
				return true;
		}
		//fall through
		 return false;
	}
	
	/*
	 * If making changes to this method then check renderPatidCollectionToIdList on VOmapper  
	 */
	private final void renderPatidCollectionToMrg(PatientIdCollection coll, MRG mrg, ProviderSystemVo providerSystem) throws Exception
	{
		if (coll == null)
			return;
		LOG.debug("VoMapper renderPatidCollectionToMrg: entry");
		int posInMsg=0;
		for (int i = 0; i < coll.size(); i++)
		{
			PatientId patId = coll.get(i);
			
			//http://jira/browse/WDEV-10022
			if(ConfigFlag.HL7.SEND_ONLY_VERIFIED_NHSN.getValue()==true 
					&&patId.getTypeIsNotNull()&&patId.getType().equals(PatIdType.NHSN)
					&&(!patId.getVerifiedIsNotNull()||patId.getVerified()==false))
			{
				
				continue;
			}
			String patIdType = svc.getRemoteLookup(patId.getType().getID(), providerSystem.getCodeSystem().getText());
			if (patIdType == null)
			{
				continue;
			}
			CX id1 = mrg.getPriorPatientIdentifierList(posInMsg);
			posInMsg++;
			renderPatientIdtoCX( patId,id1, providerSystem);
			if(patId.getType().equals(providerSystem.getPrimaryPatientId()))
			{
				CX accNum = mrg.getPriorPatientAccountNumber();
				renderPatientIdtoCX( patId,accNum, providerSystem);
			}
		}
		LOG.debug("VoMapper renderPatidCollectionToMrg: exit");
	}

	private final void renderPatientIdtoCX(PatientId patId,CX cx,ProviderSystemVo providerSystem) throws Exception
	{
		if (null==patId.getType())
			return;
		String patIdType = svc.getRemoteLookup(patId.getType().getID(), providerSystem.getCodeSystem().getText());
		if (patIdType == null)
			return;
		
		if (patId.getType().equals(PatIdType.NHSN))
			cx.getID().setValue((patId.getValue()!=null)?patId.getValue().replace(" ", ""):null);

		else
			cx.getID().setValue(patId.getValue());

		if (providerSystem.getIdtypeComponent().intValue() == 4)
			cx.getAssigningAuthority().getNamespaceID().setValue(patIdType);
		else
			cx.getIdentifierTypeCode().setValue(patIdType);
		
		if (patId.getType().equals(PatIdType.NHSN))
		{
			if(patId.getVerifiedIsNotNull()&&patId.getVerified())
			{
				cx.getCheckDigit().setValue("V");
				cx.getCodeIdentifyingTheCheckDigitSchemeEmployed().setValue("MAXIMS");
			}
		}
	}
	
	
}
