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

import org.apache.log4j.Logger;

import ims.admin.vo.EDAttendanceFeedVo;
import ims.admin.vo.InPatientADTFeedVo;
import ims.configuration.gen.ConfigFlag;
import ims.core.patient.vo.PatientRefVo;
import ims.core.vo.CareContextInterfaceVo;
import ims.core.vo.CareSpellVo;
import ims.core.vo.InpatientEpisodeVo;
import ims.core.vo.PasEventVo;
import ims.core.vo.Patient;
import ims.domain.exceptions.StaleObjectException;
import ims.emergency.vo.ifEDAttendanceVo;
import ims.emergency.vo.ifInpatientADTVo;
import ims.framework.utils.DateTime;
import ims.hl7.domain.HL7EngineApplication;
import ims.hl7.utils.EvnCodes;
import ims.hl7.utils.HL7Errors;
import ims.hl7.utils.HL7Utils;
import ims.ocrr.vo.ProviderSystemVo;
import ims.vo.interfaces.IHL7OutboundMessageHandler;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v24.message.ADT_A01;
import ca.uhn.hl7v2.model.v24.segment.NK1;
import ca.uhn.hl7v2.model.v24.segment.PD1;
import ca.uhn.hl7v2.model.v24.segment.PV1;
import ca.uhn.hl7v2.model.v24.segment.PV2;



public class A01VoMapper extends VoMapper
{
	private static final Logger			LOG		= Logger.getLogger(A01VoMapper.class);
	private A28VoMapper a28mapper;
	
	public Message processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	{
		a28mapper = (A28VoMapper) HL7EngineApplication.getVoMapper(EvnCodes.A28);
		if (a28mapper == null)
		{
			throw new HL7Exception("A01 mapper requires A28 mapper. A28 mapper not found in list of registerd mappers.");			
		}
		
		Message ack = processPatientAdmission(msg, providerSystem);
		return ack;
	}

	public Message populateMessage()
	{
		// TODO Auto-generated method stub
		return null;
	}

	
	public Message populateMessage(IHL7OutboundMessageHandler event)  throws Exception
	{
		LOG.debug("A01VoMapper populateMessage: entry");
		ADT_A01 message = new ADT_A01();
		EDAttendanceFeedVo edAttendance = null;
		Patient patient=null;
		PV1 pv = message.getPV1();

		if(event instanceof EDAttendanceFeedVo)
		{
			edAttendance = (EDAttendanceFeedVo)event;
			ifEDAttendanceVo attendenceDetails= adt.getEDAttendanceDetails(edAttendance.getAttendance());
			patient=attendenceDetails.getPatient();
			//PV1-3
			renderPatientLocationToPV1(attendenceDetails.getRegistrationLocation(), null, null, pv, event.getProviderSystem());
			
			//PV1-2
			pv.getPatientClass().setValue("E");  // only mandatory item
			
			//PV1-10
			pv.getHospitalService().setValue("E");
			
			//PV1-19
			if(attendenceDetails.getBoId()!=null)
			{
				pv.getVisitNumber().getID().setValue(attendenceDetails.getBoId().toString());
			}
			//PV1-13
			if(attendenceDetails.getAttendanceTypeIsNotNull())
			{
				pv.getReAdmissionIndicator().setValue(svc.getRemoteLookup(attendenceDetails.getAttendanceType().getID(), event.getProviderSystem().getCodeSystem().getText()));
			}
			//PV1-44 EVN-2
			if(attendenceDetails.getRegistrationDateTimeIsNotNull())
			{
				renderDateTimeVoToTS(attendenceDetails.getRegistrationDateTime(), pv.getAdmitDateTime());
				renderDateTimeVoToTS(attendenceDetails.getRegistrationDateTime(), message.getEVN().getRecordedDateTime());
			}
			
//			//PV1-45
//			if(attendenceDetails.getDischargeDateTimeIsNotNull())
//			{
//				renderDateTimeVoToTS(attendenceDetails.getDischargeDateTime(), pv.getDischargeDateTime(0));
//			}
			//PV2-3
			PV2 pv2=message.getPV2();
			if(attendenceDetails.getEmergencyEpisodeIsNotNull()&&attendenceDetails.getEmergencyEpisode().getPresentingComplaintIsNotNull())
			{
				pv2.getAdmitReason().getIdentifier().setValue(svc.getRemoteLookup(
						attendenceDetails.getEmergencyEpisode().getPresentingComplaint().getID(),event.getProviderSystem().getCodeSystem().getText()));
			}
		}
		else if(event instanceof InPatientADTFeedVo)
		{
			InPatientADTFeedVo feedVo = (InPatientADTFeedVo)event;
			ifInpatientADTVo details=adt.getPartialAdmissionDetails(feedVo);
			ifEDAttendanceVo attendenceDetails = details.getAttendance();
			patient=attendenceDetails.getPatient();
			
		//EVN-4
//			EVN evn = message.getEVN();
//			evn.getEventReasonCode().setValue(val);
			
		//PV1-19 //ED Attendance ID
			if(attendenceDetails.getBoId()!=null)
			{
				pv.getVisitNumber().getID().setValue(attendenceDetails.getBoId().toString());
			}

			
		//PV1-50 // Bed waiting ID
			if(details.getPartialAdmission()!=null&&details.getPartialAdmission().getBoId()!=null)
			{
				pv.getAlternateVisitID().getID().setValue(details.getPartialAdmission().getBoId().toString());
			}
		//PV1-2  // Episode type
			
		//EVN-2 //Registration Date
			
		//PV1-9 //Consultant
			
		//PV1-10 //Speciality
			if(details.getPartialAdmissionIsNotNull()&&details.getPartialAdmission().getSpecialtyIsNotNull())
			{
				pv.getHospitalService().setValue(svc.getRemoteLookup(details.getPartialAdmission().getSpecialty().getID(), event.getProviderSystem().getCodeSystem().getText()));
			}

		
			//PV1 -3  //Ward (IP) Outbound Virtual ward
			if(details.getPartialAdmissionIsNotNull())
			{
				renderPatientLocationToPV1(details.getPartialAdmission().getAllocatedWard(), null, null, pv, event.getProviderSystem());
			}
			
		//PV1-20  //Public or Private
			
		//PV1 -18 // Requested bed type
			
		
		}
		else //Other event types
		{
			
		}
		
		populateMSH( event.getProviderSystem(),  message.getMSH(),Long.toString( new java.util.Date().getTime()),"ADT","A01");
		renderPatientVoToPID(patient,message.getPID(),event.getProviderSystem());
		NK1 nk1 = message.getNK1();
		renderNextOfKinVoToNK1(patient.getNok(), nk1,event.getProviderSystem());
		PD1 pd1=message.getPD1();
		renderGPDetailsToPD1(patient,pd1);
		populateEVN(message.getEVN(),"A01");
		return message;
	}

	private Message processPatientAdmission(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	{
		Patient patVo;
	
		PV1 pv = (PV1)msg.get("PV1");
		String visitId=pv.getVisitNumber().getID().getValue() + "_" + pv.getVisitNumber().getComponent(1);
		PasEventVo pas=new PasEventVo();
		PasEventVo pasEventResult=new PasEventVo();
		
		try
		{
			patVo = savePatient(msg, providerSystem);
		}
		
		catch (Exception ex)
		{
			return HL7Utils.buildRejAck(msg.get("MSH"), "Exception: " + ex.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems()));
		}
		
		if((adt.getCurrentAdmissionRecord(new PatientRefVo(patVo.getID_Patient(),patVo.getVersion_Patient()))!=null))
			throw new HL7Exception ("This patient is already an Inpatient");	
		
		if (ConfigFlag.HL7.INSTANTIATE_EPISODE_FROM_ADT.getValue()||ConfigFlag.HL7.INPATIENT_EPISODE_MANAGEMENT_FROM_PAS.getValue())
		{
			if (pv.getAlternateVisitID().getID().getValue()!=null)
			{
				String pasEpisodeId=pv.getAlternateVisitID().getID().getValue();	
				pasEventResult=(PasEventVo)psearch.getPasEvent(pasEpisodeId, patVo, visitId);
				
				
				if (pasEventResult==null)
				{
					pas.setPatient(patVo);
					
					try 
					{
						fillPasEventFromPV1(pv, pas, getOrgLoc(), getHcpAdmin(),providerSystem);
					}
					
					catch (Exception e) 
					{
						throw new HL7Exception(e.getMessage(), e);
					}
					
					
					CareSpellVo careSpell=createCareSpellVo(pas,pv);
					try 
					{
						pas = saveCareSpell(careSpell);
					}
					catch (StaleObjectException e) 
					{
						throw new HL7Exception(e.getMessage(), e);
					}
				
				}
				else if (!pasEventResult.getPasEventId().equals(visitId))
				{
					
					try 
					{
						pas=createCareContext(patVo, pv, pas,providerSystem);
						if (pas == null) // wdev-7705
							throw new HL7Exception("Error occurred creating care context - null value was returned");
						
					} 
					catch (Exception e) 
					{						
						throw new HL7Exception(e.getMessage(), e);	
					}
					
				}
				else if (pasEventResult.getPasEventId().equals(visitId))
				{
					pas=pasEventResult;
				
					// WDEV-13901 - update an existing inpatient record
					CareContextInterfaceVo careContext = careSpellDialog.getCareContextFromPasEpisodeId(pasEpisodeId, visitId);
					if (careContext != null)
					{
						try 
						{
							createHistoryCareContextAndEpis(careContext, true, pv, providerSystem.getCodeSystem().getText());
						}
						catch (StaleObjectException ex) 
						{
							return HL7Utils.buildRejAck( msg.get("MSH"), "Exception: " + ex.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems()));

						}
					}
				
				}
			}
			
		}
		

		InpatientEpisodeVo episVo;
		try
		{
			DateTime transactionDT = new DateTime();
			episVo = a28mapper.fillEpisFromMsg(msg, getOrgLoc(), getHcpAdmin(), pas,providerSystem, transactionDT);
			episVo.getPasEvent().setPatient(patVo);
			patVo.setWard(episVo.getPasEvent().getLocation());
			String[] errs = episVo.validate();
			if (errs != null)
			{
				throw new Exception("Validation of Admission failed. " + VoMapper.toDisplayString(errs));
			}
			String [] errs2=patVo.validate();
			if(errs2 != null)
			{
				throw new Exception("Validation of Admission failed. " + VoMapper.toDisplayString(errs));
			}
			
			getADT().admitPatient(patVo, episVo, transactionDT);
		}
		catch (Exception ex)
		{
			return HL7Utils.buildRejAck(msg.get("MSH"), "Exception: " + ex.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems()));
		}

		Message ack = HL7Utils.buildPosAck(msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems()));
		return ack;
	}

}
