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
import ims.core.admin.pas.vo.PASEventRefVo;
import ims.core.vo.CareContextInterfaceVo;
import ims.core.vo.CareContextStatusHistoryVo;
import ims.core.vo.LocShortVo;
import ims.core.vo.OutPatientAttendanceVo;
import ims.core.vo.PasEventVo;
import ims.core.vo.Patient;
import ims.core.vo.PendingElectiveAdmissionHl7Vo;
import ims.core.vo.PendingEmergencyAdmissionVo;
import ims.core.vo.lookups.CareContextStatus;
import ims.core.vo.lookups.ElectiveAdmissionStatus;
import ims.core.vo.lookups.TaxonomyType;
import ims.domain.exceptions.StaleObjectException;
import ims.framework.utils.DateFormat;
import ims.framework.utils.DateTimeFormat;
import ims.hl7.domain.EventResponse;
import ims.hl7.domain.HL7EngineApplication;
import ims.hl7.utils.EvnCodes;
import ims.hl7.utils.HL7Errors;
import ims.hl7.utils.HL7Utils;
import ims.hl7.vo.ElectiveListMessageQueueVo;
import ims.hl7.vo.ifElectiveListMessageQueueVo;
import ims.ocrr.vo.ProviderSystemVo;
import ims.scheduling.vo.lookups.Status_Reason;
import ims.vo.interfaces.IHL7OutboundMessageHandler;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v24.message.ADT_A38;
import ca.uhn.hl7v2.model.v24.segment.PD1;
import ca.uhn.hl7v2.model.v24.segment.PV1;
import ca.uhn.hl7v2.model.v24.segment.PV2;

public class A38VoMapper extends VoMapper
{
	//WDEV-19704
	private static final Logger	LOG	= Logger.getLogger(A01VoMapper.class);
	private A01VoMapper a01Vomapper;

	//WDEV-20012
//	public Message processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	public EventResponse processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception //WDEV-20112
	{
		//WDEV-20112
//		return processCancelAppt(msg, providerSystem);
		EventResponse response = new EventResponse(); 
		response = processCancelAppt(msg, providerSystem, response);
		return response;//WDEV-20112
	}

	public Message populateMessage()
	{
		// Not needed for inbound messages
		return null;
	}
	
	//WDEV-20112
//	protected Message processCancelAppt(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	protected EventResponse processCancelAppt(Message msg, ProviderSystemVo providerSystem, EventResponse response) throws HL7Exception //WDEV-20112
	{
		
		try
		{
			Patient patVo = getPrimaryIdFromPid(msg, providerSystem);
			if (patVo != null)
			{
				patVo = getDemog().getPatient(patVo);

				//WDEV-20112
				response.setPatient(patVo); //WDEV-20112
				
				// Return silently if patient not found, or appointment not found
				if (patVo == null)
				{
					//WDEV-20112
//					Message ack = HL7Utils.buildPosAck( msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems()));
//					return ack;
					response.setMessage(HL7Utils.buildPosAck( msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems())));
					return response; //WDEV-20112					
				}
				
				PV1 pv1 = (PV1) msg.get("PV1");
				String patClass = pv1.getPatientClass().getValue();
				if (patClass != null && patClass.equals(PREADMIT))
				{
					PasEventVo pasEventVo = new PasEventVo();
					pasEventVo.setPatient(patVo);
					String eventId = pv1.getVisitNumber().getID().getValue() + "_" + pv1.getVisitNumber().getComponent(1);
					if(eventId==null)
					{
						throw new HL7Exception("PV1-19 (Visit number) must be set for Preadmit(TCI) patients" );
					}
					pasEventVo.setPasEventId(eventId);
					PendingElectiveAdmissionHl7Vo tciVo;
					tciVo=getADT().getPendingElectiveAdmission(pasEventVo);
					if (tciVo==null)
					{
						//WDEV-20112
//						Message ack = HL7Utils.buildPosAck( msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems()));
//						return ack;
						response.setMessage(HL7Utils.buildPosAck( msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems())));
						return response; //WDEV-20112
					}

					tciVo.setElectiveAdmissionStatus(ElectiveAdmissionStatus.CANCELLED);
					pasEventVo=tciVo.getPasEvent();
					String [] errs = tciVo.validate();
					errs = pasEventVo.validate(errs);
					if (errs != null)
					{
						throw new HL7Exception("Validation failed: " + VoMapper.toDisplayString(errs));				
					}
					getADT().recordPendingElectiveAdmission(pasEventVo, tciVo);
						
				}
				else if(patClass != null && patClass.equals(EMERGENCY_APP)) 
				{
					//Blank out await date in A&E
					PasEventVo pasEventVo = new PasEventVo();
					pasEventVo.setPatient(patVo);
					String eventId = pv1.getVisitNumber().getID().getValue() + "_" + pv1.getVisitNumber().getComponent(1);
					if(eventId==null)
					{
						throw new HL7Exception("PV1-19 (Visit number) must be set for Preadmit(TCI) patients" );
					}
					pasEventVo.setPasEventId(eventId);
					PendingEmergencyAdmissionVo  pendingAneVo;
					pendingAneVo=getADT().getPendingEmergencyAdmission(pasEventVo);
					if(pendingAneVo==null)
					{
						//WDEV-20112
//						Message ack = HL7Utils.buildPosAck( msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems()));
//						return ack;
						response.setMessage(HL7Utils.buildPosAck( msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems())));
						return response; //WDEV-20112
					}
					pendingAneVo.setDTADateTime(null);
					LocShortVo currentLoc=null;
					if(pv1.getAssignedPatientLocation().getFacility().getNamespaceID().getValue()!=Hl7Null)
						//WDEV-20278
//						currentLoc = orgLoc.getLocationByTaxonomyType(pv1.getAssignedPatientLocation().getFacility().getNamespaceID().getValue(),  TaxonomyType.PAS);
						currentLoc = orgLoc.getLocationByTaxonomyType(pv1.getAssignedPatientLocation().getFacility().getNamespaceID().getValue(), providerSystem.getCodeSystem()); //WDEV-20278
					pendingAneVo.setCurrentLocation(currentLoc);
					String [] errs = pendingAneVo.validate();
					PASEventRefVo peRef = pendingAneVo.getPasEvent();
					PasEventVo pe = getADT().getPasEvent(peRef);
					errs = pe.validate(errs);
					if (errs != null)
					{
						throw new HL7Exception("Validation failed: " + VoMapper.toDisplayString(errs));				
					}
					getADT().recordPendingEmergencyAdmission(pe, pendingAneVo);
					
				}
				else
				{
					OutPatientAttendanceVo attVo = fillAttFromMsg(msg, getOrgLoc(), getHcpAdmin(),providerSystem);
					attVo.getPasEvent().setPatient(patVo);
					OutPatientAttendanceVo dbAttVo = getADT().getOutpatientAppointment(attVo.getPasEvent());
					if (dbAttVo == null)
					{
						//WDEV-20112
//						Message ack = HL7Utils.buildPosAck( msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems()));
//						return ack;
						response.setMessage(HL7Utils.buildPosAck( msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems())));
						return response; //WDEV-20112
					}
					
					dbAttVo.setAppointmentStatus(Status_Reason.CANCELLED);
					dbAttVo.setCancellationReason(Status_Reason.APPOINTMENT_CANCELLED);
					dbAttVo.setIsActive(Boolean.FALSE);
					String[] errs = dbAttVo.validate();
					if (errs != null)
					{
						throw new HL7Exception("Validation of Outpatient Attendance failed. " + VoMapper.toDisplayString(errs));				
					}
					
					//WDEV-10231
					CareContextInterfaceVo voCareContext = null;
					if(ConfigFlag.HL7.INSTANTIATE_EPISODE_FROM_ADT.getValue())
					{
						if (pv1.getAlternateVisitID().getID().getValue()!=null)
						{
							String pasEpisodeId=pv1.getAlternateVisitID().getID().getValue();
							String visitId=pv1.getVisitNumber().getID().getValue() + "_" + pv1.getVisitNumber().getComponent(1);
							PasEventVo pasResult=(PasEventVo)psearch.getPasEvent(pasEpisodeId, patVo, visitId);
							voCareContext = getADT().getCareContextByPasEvent(pasResult);

							if(voCareContext != null)
							{
								voCareContext.setCurrentStatus(new CareContextStatusHistoryVo());
								voCareContext.getCurrentStatus().setStatus(CareContextStatus.CANCELLED);
								voCareContext.setEndDateTime(attVo.getPasEvent().getEventDateTime());
								voCareContext.getCurrentStatus().setStatusDateTime(attVo.getPasEvent().getEventDateTime());
								if(voCareContext.getStatusHistoryIsNotNull())
									voCareContext.getStatusHistory().add(voCareContext.getCurrentStatus());
							}
							else 
							{
								throw new HL7Exception("Care Context not found for episode amd visit :"+pasEpisodeId+" "+visitId);
							}
						
						}
					}
					
					getADT().cancelAppointment(dbAttVo, voCareContext);
				}
			}
		}
		catch (StaleObjectException ex)
		{
			//WDEV-20112
//			return HL7Utils.buildRejAck( msg.get("MSH"), "StaleObjectException occured recording Inpatient Leave - " + ex.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems()));
			response.setMessage(HL7Utils.buildRejAck( msg.get("MSH"), "StaleObjectException occured recording Inpatient Leave - " + ex.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems())));
			return response; //WDEV-20112
		}
		catch (Exception e)
		{
			e.printStackTrace();
			//WDEV-20112
//			return HL7Utils.buildRejAck( msg.get("MSH"), "Exception occured cancelling Outpatient Appointment - " + e.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems()));
			response.setMessage(HL7Utils.buildRejAck( msg.get("MSH"), "Exception occured cancelling Outpatient Appointment - " + e.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems())));
			return response; //WDEV-20112

		}

		//WDEV-20112
//		Message ack = HL7Utils.buildPosAck( msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems()));
//		return ack;
		response.setMessage(HL7Utils.buildPosAck( msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems())));
		return response; //WDEV-2011
	}

	//WDEV-19704
	public Message populateMessage(IHL7OutboundMessageHandler event) throws Exception
	{
		LOG.debug("A38VoMapper populateMessage: entry");
		ADT_A38 message = new ADT_A38();
		Patient patient=null;
		PV1 pv1 = message.getPV1();
		PV2 pv2 = message.getPV2();
				
		if(event instanceof ElectiveListMessageQueueVo)
		{
			a01Vomapper = (A01VoMapper)HL7EngineApplication.getVoMapper(EvnCodes.A01);
			if(a01Vomapper==null)
			{
				throw new HL7Exception("A05 mapper requires A01 mapper. A01 mapper not found in list of registered mappers.");			
			}

			ElectiveListMessageQueueVo feedVo = (ElectiveListMessageQueueVo)event;
			ifElectiveListMessageQueueVo patElectList = adt.getElectiveListMessageQueueDetails(feedVo);
					
			a01Vomapper.populateBasicPatientElectiveList(event, patElectList, pv1, pv2);
			
			// EVN-2 Record date/time (TS)
			//WDEV-22918
//			if(patElectList != null
//					&& patElectList.getDateOnList()!=null)
//			{
//				message.getEVN().getDateTimePlannedEvent().getTimeOfAnEvent().setValue(patElectList.getDateOnList().toString(DateFormat.ISO));
//			}
			if (patElectList.getSystemInfo() != null)
			{
				if (patElectList.getSystemInfo().getLastupdateDateTime() != null)
				{
					message.getEVN().getRecordedDateTime().getTimeOfAnEvent().setValue(patElectList.getSystemInfo().getLastupdateDateTime().toString(DateTimeFormat.ISO));
				}
				else if (patElectList.getSystemInfo().getCreationDateTime() != null)
				{
					message.getEVN().getRecordedDateTime().getTimeOfAnEvent().setValue(patElectList.getSystemInfo().getCreationDateTime().toString(DateTimeFormat.ISO));
				}
			} //WDEV-22918
				
			if(patElectList != null
					&& patElectList.getPatient() != null)
			{
				patient=patElectList.getPatient();
				if(patient != null)
				{						
					renderPatientVoToPID(patient, message.getPID(), event.getProviderSystem());
					PD1 pd1=message.getPD1();
					//WDEV-20993
//					renderGPDetailsToPD1(patient,pd1);			
					renderGPDetailsToPD1(patient, pd1, event.getProviderSystem());
					renderPatientDetailsToPD1(patient, pd1, event.getProviderSystem()); //WDEV-22624
				}
			}
						
		}
		
		populateMSH( event.getProviderSystem(),  message.getMSH(), Long.toString(new java.util.Date().getTime()), "ADT", "A38");
		message.getEVN().getEventTypeCode().setValue("A38");
		LOG.debug("A38VoMapper populateMessage: exit");

		return message;
	}
	

}

