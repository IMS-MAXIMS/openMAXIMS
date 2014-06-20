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

import java.text.ParseException;

import org.apache.log4j.Logger;

import ims.admin.vo.ConfigPropertyVo;
import ims.configuration.gen.ConfigFlag;
import ims.configuration.ConfigItems;
import ims.core.vo.Patient;
import ims.core.vo.TaxonomyMap;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.StaleObjectException;
import ims.framework.utils.DateTime;
import ims.hl7.utils.HL7Utils;
import ims.ocrr.vo.ProviderSystemVo;
import ims.scheduling.vo.ExternalEventVo;
import ims.scheduling.vo.IfPatientLocationVo;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v24.message.ADT_A09;
import ca.uhn.hl7v2.model.v24.segment.EVN;
import ca.uhn.hl7v2.model.v24.segment.MSH;
import ca.uhn.hl7v2.model.v24.segment.PID;
import ca.uhn.hl7v2.model.v24.segment.PV1;

public class A10VoMapper extends VoMapper {

	private static final Logger			LOG		= Logger.getLogger(A10VoMapper.class);

	
	@Override
	public Message populateMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	//public Message populateMessage(PatientRefVo patient,LocationRefVo patLoc,ProviderSystemVo provider)throws Exception
	public Message populateMessage(ExternalEventVo newEvent) throws Exception
	{
		
		newEvent=RefMandomain.updateEventVoWithInvestigation(newEvent);
		if(null==newEvent)
			return null;
		IfPatientLocationVo patLoc =RefMandomain.getPatientLocFromAppointment(newEvent.getAppointment());
		Patient fullPatient = demog.getPatient(patLoc.getPatient());
		
		//LocShortMappingsVo location =  orgLoc.getLocation(patLoc.getID_Location());
		String locCode = "";
		String apptId = "";
		String referralId="";
		TaxonomyMap tm = patLoc.getLocMapping().getTaxonomyMap(newEvent.getProviderSystem().getCodeSystem());
		if(null==tm)
		{
			LOG.warn("Lookup mapping required for taxonomy \""+newEvent.getProviderSystem().getCodeSystem()+
					"\" for location:"+patLoc.getLocMapping().getName());
		}
		else
		{
		 locCode=tm.getTaxonomyCode();
		}
		
		if(patLoc.getAppointmentIDIsNotNull())
			apptId=patLoc.getAppointmentID();
		
		if(patLoc.getReferralIDIsNotNull())
			referralId=patLoc.getReferralID();
		
		
		// A09 is the format used for A10 messages
		ADT_A09 a10Msg = new ADT_A09();
		PID pid = a10Msg.getPID();
		renderPatientVoToPID(fullPatient, pid, newEvent.getProviderSystem());
		pid.getPatientAccountNumber().getID().setValue(referralId);
		
		PV1 pv = a10Msg.getPV1();
		pv.getPatientClass().setValue("U");  // Unknown - only mandatory item
		pv.getTemporaryLocation().getPointOfCare().setValue(locCode);
		pv.getPreadmitNumber().getID().setValue(apptId);
		populateMSH(a10Msg, newEvent.getProviderSystem());
		populateEVN(a10Msg);
		return a10Msg;


	}
	
	@Override
	public Message processEvent(Message msg, ProviderSystemVo providerSystem)
			throws HL7Exception {
		PID pid= null;
		PV1 pv1 = null;
		MSH msh = null;
		pid=((ADT_A09)msg).getPID();
		pv1 =((ADT_A09)msg).getPV1();
		msh = ((ADT_A09)msg).getMSH();
		DateTime arrivalDT=null;
		String UBRN = pv1.getPreadmitNumber().getCheckDigit().getValue();
		String maximsApptId = pv1.getPreadmitNumber().getID().getValue();
		
		//TODO check this is the correct field
		String arrivalTime = msh.getDateTimeOfMessage().getTimeOfAnEvent().getValue();
		if (arrivalTime==null)
			throw new HL7Exception("Arrival Time must not be null");
		try
		{
			arrivalDT = new DateTime(arrivalTime);
		}
		catch (ParseException e)
		{
			throw new HL7Exception("Failed to read date time from MSH-7",e);
		}
		
		
		
		Patient patVo = getPrimaryIdFromPid(pid, providerSystem);
		try {
			Patient patVo2 = getDemog().getPatient(patVo);
			//http://jira/browse/WDEV-12682
			if("CARE_UK".equals(ConfigFlag.HL7.EXTENDED_HL7_PROCESSING.getValue()))
			{
				RefMandomain.setAppointmentArrivedForUBRN(patVo2, UBRN, maximsApptId,arrivalDT);
			}

		} catch (StaleObjectException soe)
		{
			LOG.error("Patient record updated externally.Please resubmit message", soe);
			throw new HL7Exception("Patient record updated externally.Please resubmit message");
		}
		 catch (DomainInterfaceException die)
			{
				LOG.error(die);
				throw new HL7Exception(die.getMessage());
			}
		
		Message ack = HL7Utils.buildPosAck(msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems()));;
		return ack;
	}

	private void populateMSH(ADT_A09 msg, ProviderSystemVo providerSystem) throws DataTypeException, Exception
	{
		
		LOG.debug("A10VoMapper populateMSH: entry");
		String receivingFacility=null;
		ConfigPropertyVo prop = providerSystem.getConfigurationProperty(ConfigItems.Hl7Facility);
		if (prop != null)
		{
			receivingFacility = prop.getPropertyValue();
		}
		if (receivingFacility == null)
			receivingFacility = cfg.getReceivingFacility();
		String processingId=null;
		ConfigPropertyVo hl7Prop = providerSystem.getConfigurationProperty(ConfigItems.ProcessingID);
		if (hl7Prop != null)
		{
			processingId=hl7Prop.getPropertyValue();
		}
		if (processingId == null)
			processingId = cfg.getProcessingId();
		DateTime msgDateTime = new DateTime();
		renderDateTimeVoToTS(msgDateTime, msg.getMSH().getDateTimeOfMessage());
		msg.getMSH().getSendingApplication().getNamespaceID().setValue(cfg.getSendApplication());
		msg.getMSH().getSendingFacility().getNamespaceID().setValue(cfg.getSendFacility()); 

		msg.getMSH().getFieldSeparator().setValue("|");  
		msg.getMSH().getEncodingCharacters().setValue("^~\\&");
		msg.getMSH().getReceivingApplication().getNamespaceID().setValue(providerSystem.getHl7Application());
		msg.getMSH().getReceivingFacility().getNamespaceID().setValue(receivingFacility);
		msg.getMSH().getVersionID().getVersionID().setValue("2.4");
		msg.getMSH().getMessageType().getMessageType().setValue("ADT");
		msg.getMSH().getMessageType().getTriggerEvent().setValue("A10");
		msg.getMSH().getProcessingID().getProcessingID().setValue(processingId);  // Debug / Production / Training
		msg.getMSH().getMessageControlID().setValue(new String() + new java.util.Date().getTime());
		LOG.debug("A10VoMapper populateMSH: exit");
		
	}
	private void populateEVN(ADT_A09 msg) throws Exception
	{
		EVN evn = msg.getEVN();
		
		evn.getEventTypeCode().setValue("A10");
		renderDateTimeVoToTS(new DateTime(), evn.getRecordedDateTime());
	}


	
	
	
}
