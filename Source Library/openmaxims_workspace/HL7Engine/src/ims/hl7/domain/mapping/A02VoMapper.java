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


import org.apache.log4j.Logger;

import ims.configuration.gen.ConfigFlag;
import ims.core.patient.vo.PatientRefVo;
import ims.core.resource.people.vo.HcpRefVo;
import ims.core.resource.place.vo.LocationRefVo;
import ims.core.vo.Patient;
import ims.core.vo.PatientShort;
import ims.core.vo.TaxonomyMap;
import ims.core.vo.ifInpatientEpisodeVo;
import ims.core.vo.domain.PatientShortAssembler;
import ims.core.vo.lookups.Specialty;
import ims.core.vo.lookups.TaxonomyType;
import ims.framework.utils.DateFormat;
import ims.framework.utils.DateTime;
import ims.hl7.domain.EventResponse;
import ims.hl7.domain.HL7EngineApplication;
import ims.hl7.utils.EvnCodes;
import ims.hl7.utils.HL7Errors;
import ims.hl7.utils.HL7Utils;
import ims.ocrr.vo.ProviderSystemVo;
import ims.ocs_if.vo.InpatientEpisodeQueueVo;
import ims.vo.interfaces.IHL7OutboundMessageHandler;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v24.message.ADT_A02;
import ca.uhn.hl7v2.model.v24.segment.EVN;
import ca.uhn.hl7v2.model.v24.segment.PD1;
import ca.uhn.hl7v2.model.v24.segment.PV1;
import ca.uhn.hl7v2.model.v24.segment.PV2;

public class A02VoMapper extends VoMapper
{
	private static final Logger			LOG		= Logger.getLogger(A02VoMapper.class);
	private A01VoMapper a01Vomapper; //WDEV-19481
	

	//WDEV-20112
//	public Message processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	public EventResponse processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception //WDEV-20012
	{
		//WDEV-20112
//		return(processPatientTransfer(msg, providerSystem));
		EventResponse response = new EventResponse();
		response = processPatientTransfer(msg, providerSystem, response);
		return response; //WDEV-20112
	}

	public Message populateMessage()
	{
		// Not needed for inbound messages
		return null;
	}
	
	//WDEV-20112
//	public Message processPatientTransfer(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	public EventResponse processPatientTransfer(Message msg, ProviderSystemVo providerSystem, EventResponse response) throws HL7Exception //WDEV-20112
	{
		
		//WDEV-20112
//		EventResponse response = null; //WDEV-20112

		try
		{
			Patient patVo;


			try
			{
				patVo = savePatient(msg,providerSystem, false);
				//WDEV-20112
				response.setPatient(patVo); //WDEV-20112
			}
			catch (Exception ex)
			{
				LOG.error(ex);
				//WDEV-20112
				//return HL7Utils.buildRejAck(msg.get("MSH"), "Exception: " + ex.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems()));
				response.setMessage(HL7Utils.buildRejAck(msg.get("MSH"), "Exception: " + ex.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems())));
				return response; //WDEV-20112
			}
			
			PV1 pv1 = (PV1) msg.get("PV1");
			PV2 pv2 = (PV2)msg.get("PV2");
			EVN evn = (EVN)msg.get("EVN");
			//WDEV-20278
//			LocationRefVo loc = orgLoc.getLocationByTaxonomyType(pv1.getAssignedPatientLocation().getPointOfCare().getValue(), TaxonomyType.PAS);
//			LocationRefVo locFrom = orgLoc.getLocationByTaxonomyType(pv1.getPriorPatientLocation().getPointOfCare().getValue(), TaxonomyType.PAS);
			LocationRefVo loc = orgLoc.getLocationByTaxonomyType(pv1.getAssignedPatientLocation().getPointOfCare().getValue(), providerSystem.getCodeSystem());
			LocationRefVo locFrom = orgLoc.getLocationByTaxonomyType(pv1.getPriorPatientLocation().getPointOfCare().getValue(), providerSystem.getCodeSystem()); //WDEV-20278
			DateTime transferDT=null;
			if(evn.getEventOccurred().getTimeOfAnEvent().getValue()!=null)
			{
				transferDT = new DateTime(evn.getEventOccurred().getTimeOfAnEvent().getValue());
			}
			//WDEV-20320
			else
			{
				response.setMessage(HL7Utils.buildRejAck(msg.get("MSH"), "Exception: No transfer date/time in EVN-6" , HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems())));
				return response;
			}//WDEV-20320

			
			//WDEV-10593
			DateTime transactionDT=null;
			if(evn.getRecordedDateTime() != null &&  evn.getRecordedDateTime().getTimeOfAnEvent() != null && evn.getRecordedDateTime().getTimeOfAnEvent().getValue() != null)
			{
				transactionDT = new DateTime(evn.getRecordedDateTime().getTimeOfAnEvent().getValue());
			}
			
			HcpRefVo hcp = hcpAdmin.getMedicByNationalCode(pv1.getAdmittingDoctor(0).getIDNumber().getValue());
			if (hcp == null && pv1.getAdmittingDoctor(1).getIDNumber().getValue() != null)  // Check by pas code if not found by national code
				hcp = hcpAdmin.getMedicMedicMappingsByPasCode(pv1.getAdmittingDoctor(1).getIDNumber().getValue());
			//if the hcp is still null try and get it from consulting doctor pv1.9 WDEV-7881 
			if (hcp == null)
			{
				hcp = hcpAdmin.getMedicByNationalCode(pv1.getConsultingDoctor(0).getIDNumber().getValue());
				if (hcp == null)
				{
					// Check to see if the pas code has been specified in second repetition of consulting doctor, try this if found
					String pasCode = pv1.getConsultingDoctor(1).getIDNumber().getValue();
					if (pasCode != null)
						hcp = hcpAdmin.getMedicMedicMappingsByPasCode(pasCode);
				}

			}
			
			// Get the stay
			Integer stay =HL7Utils.getIntegerFromNM(pv2.getEstimatedLengthOfInpatientStay());
			
			// WDEV-12588 if specialty supplied, ensure there is a mapping for it
			Specialty specialty = (Specialty) svc.getLocalLookup(Specialty.class, Specialty.TYPE_ID, providerSystem.getCodeSystem().getText(), pv1.getHospitalService().getValue());
			if (ConfigFlag.HL7.INPATIENT_EPISODE_MANAGEMENT_FROM_PAS.getValue() && specialty == null 
					&& pv1.getHospitalService().getValue() != null && !pv1.getHospitalService().getValue().equals(Hl7Null))  // WDEV-12810
			{
				throw new HL7Exception("Specialty not found with mapping value = " + pv1.getHospitalService().getValue());
			}
			getADT().transferPatient(patVo, hcp, loc, stay, locFrom, transferDT, transactionDT, specialty);
		}
		catch (Exception ex)
		{
			LOG.error(ex);
			//WDEV-20112
//			return HL7Utils.buildRejAck( msg.get("MSH"), "Exception: " + ex.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems()));
			response.setMessage(HL7Utils.buildRejAck(msg.get("MSH"), "Exception: " + ex.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems())));
			return response; //WDEV-20112
		}

		//WDEV-20112
//		Message ack = HL7Utils.buildPosAck( msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems()));
//		return ack;
		response.setMessage(HL7Utils.buildPosAck( msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems())));
		return response; //WDEV-20112
		
	}

	
	public Message populateMessage(IHL7OutboundMessageHandler event)  throws Exception
	{
		//WDEV-19481
		LOG.debug("A02VoMapper populateMessage: entry");

		ADT_A02 message = new ADT_A02();
		PV1 pv1 = message.getPV1();
		PV2 pv2 = message.getPV2();
		
		//WDEV-22479
		populateMSH(event.getProviderSystem(), message.getMSH(),Long.toString( new java.util.Date().getTime()),"ADT","A02");
		message.getEVN().getEventTypeCode().setValue("A02"); //WDEV-22429
	
		if(event instanceof InpatientEpisodeQueueVo)
		{

			a01Vomapper = (A01VoMapper)HL7EngineApplication.getVoMapper(EvnCodes.A01);
			if(a01Vomapper==null)
			{
				throw new HL7Exception("A02 mapper requires A01 mapper. A01 mapper not found in list of registered mappers.");			
			}

			InpatientEpisodeQueueVo feedVo = (InpatientEpisodeQueueVo)event;
			ifInpatientEpisodeVo inpatientEpisode = adt.getInpatientEpisodeDetails(feedVo);
			Patient patient=inpatientEpisode.getPatient();

			a01Vomapper.populateBasicEpisodeData(event, inpatientEpisode, pv1, pv2);
			
			// PV1-6-1 Prior Point of Care (IS)
			if(inpatientEpisode.getPriorWardLocation() != null
					&& inpatientEpisode.getPriorWardLocation().getCodeMappings() != null)
			{
				//WDEV-20269
				TaxonomyMap map = inpatientEpisode.getPriorWardLocation().getTaxonomyMap(event.getProviderSystem().getCodeSystem());
				if (map != null)
				{
					pv1.getPriorPatientLocation().getPointOfCare().setValue(map.getTaxonomyCode());
				} //WDEV-20269
			}
			
			// PV1-6-3 Prior Bed (IS) *** Doesn't work ***
			if(inpatientEpisode.getPriorBedNo() != null 
					&& inpatientEpisode.getPriorBedNo().length() > 0)
			{
				pv1.getPriorPatientLocation().getBed().setValue(inpatientEpisode.getPriorBedNo());
			}

			// PV1-6-4 Prior Facility (HD)
			//WDEV-20269
			if(inpatientEpisode.getPriorFacilty() != null)
			{
				pv1.getPriorPatientLocation().getFacility().getNamespaceID().setValue(inpatientEpisode.getPriorFacilty());
			}
			//WDEV-20269

			// PV1-16-9 Prior Location Description
			if(inpatientEpisode.getPriorWardLocation() != null
					&& inpatientEpisode.getPriorWardLocation().getName() != null 
					&& inpatientEpisode.getPriorWardLocation().getName().length() > 0)
			{
				pv1.getPriorPatientLocation().getLocationDescription().setValue(inpatientEpisode.getPriorWardLocation().getName());
			}

			renderPatientVoToPID(patient, message.getPID(), event.getProviderSystem());
			PD1 pd1 = message.getPD1();
			//WDEV-20993
//			renderGPDetailsToPD1(patient, pd1);
			renderGPDetailsToPD1(patient, pd1, event.getProviderSystem());
			renderPatientDetailsToPD1(patient, pd1, event.getProviderSystem()); //WDEV-22624
			
			//WDEV-22479
			// EVN-2 Recorded Date/Time (TS)
			if (inpatientEpisode.getCurrentWardStayAdmissionDateTime() != null)
			{
				renderDateTimeVoToTS(inpatientEpisode.getCurrentWardStayAdmissionDateTime(), message.getEVN().getRecordedDateTime());
			} //WDEV-22479
			
			//WDEV-22673
			// PV2-4 Transfer Reason (CE)
			if (inpatientEpisode.getPriorTransferReason() != null)
			{
				pv2.getTransferReason().getIdentifier().setValue((svc.getRemoteLookup(inpatientEpisode.getPriorTransferReason().getID(), event.getProviderSystem().getCodeSystem().getText())));
			} //WDEV-22673
			
		}
		
		// WDEV-22479 Move to beginning of method
//		populateMSH(event.getProviderSystem(), message.getMSH(),Long.toString( new java.util.Date().getTime()),"ADT","A02");
//		message.getEVN().getEventTypeCode().setValue("A02");

		return message;
		
	}

}
