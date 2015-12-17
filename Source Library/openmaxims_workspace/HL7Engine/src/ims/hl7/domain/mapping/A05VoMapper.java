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

import ims.RefMan.vo.ifCatsReferralVo;
import ims.configuration.gen.ConfigFlag;
import ims.core.resource.people.domain.objects.Hcp;
import ims.core.vo.AneAttendanceVo;
import ims.core.vo.CareContextInterfaceVo;
import ims.core.vo.CareSpellVo;
import ims.core.vo.HcpLiteVo;
import ims.core.vo.InpatientEpisodeVo;
import ims.core.vo.MemberOfStaffShortVo;
import ims.core.vo.OutPatientAttendanceVo;
import ims.core.vo.PasEventVo;
import ims.core.vo.PatRelative;
import ims.core.vo.Patient;
import ims.core.vo.PendingElectiveAdmissionHl7Vo;
import ims.core.vo.lookups.ElectiveAdmissionStatus;
import ims.core.vo.lookups.SourceOfReferral;
import ims.core.vo.lookups.TCIType;
import ims.domain.exceptions.StaleObjectException;
import ims.framework.utils.DateFormat;
import ims.framework.utils.DateTime;
import ims.framework.utils.DateTimeFormat;
import ims.hl7.domain.EventResponse;
import ims.hl7.domain.HL7EngineApplication;
import ims.hl7.utils.EvnCodes;
import ims.hl7.utils.HL7Errors;
import ims.hl7.utils.HL7Utils;
import ims.hl7.vo.ElectiveListMessageQueueVo;
import ims.hl7.vo.ifElectiveListMessageQueueVo;
import ims.ocrr.vo.ProviderSystemVo;
import ims.scheduling.vo.AppointmentMessageQueueVo;
import ims.scheduling.vo.ifOutBookingAppointmentVo;
import ims.scheduling.vo.lookups.Status_Reason;
import ims.vo.interfaces.IHL7OutboundMessageHandler;

import org.apache.log4j.Logger;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v24.message.ADT_A01;
import ca.uhn.hl7v2.model.v24.message.ADT_A05;
import ca.uhn.hl7v2.model.v24.segment.EVN;
import ca.uhn.hl7v2.model.v24.segment.MSH;
import ca.uhn.hl7v2.model.v24.segment.NK1;
import ca.uhn.hl7v2.model.v24.segment.PD1;
import ca.uhn.hl7v2.model.v24.segment.PR1;
import ca.uhn.hl7v2.model.v24.segment.PV1;
import ca.uhn.hl7v2.model.v24.segment.PV2;

public class A05VoMapper extends VoMapper
{
	//WDEV-19704
	private static final Logger	LOG	= Logger.getLogger(A01VoMapper.class);
	private A01VoMapper a01Vomapper;

	//WDEV-20112
//	public Message processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	public EventResponse processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception //WDEV-20112
	{
		//WDEV-20112
//		return (processAppointmentBooking(msg, providerSystem));
		EventResponse response = new EventResponse();
		response = processAppointmentBooking(msg, providerSystem, response);
		return response;//WDEV-20112
	}

	//WDEV-20112
//	private Message processAppointmentBooking(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	private EventResponse processAppointmentBooking(Message msg, ProviderSystemVo providerSystem, EventResponse response) throws HL7Exception
	{
		
		try
		{
			Patient patVo = savePatient(msg, providerSystem);
			PV1 pv1 = (PV1) msg.get("PV1");
			PasEventVo pasResult=null;
			String visitId=pv1.getVisitNumber().getID().getValue() + "_" + pv1.getVisitNumber().getComponent(1);
			PasEventVo pas=new PasEventVo();
			
			//WDEV-20112
			response.setPatient(patVo); //WDEV-20112
			
			if (ConfigFlag.HL7.INSTANTIATE_EPISODE_FROM_ADT.getValue())
			{
				if (pv1.getAlternateVisitID().getID().getValue()!=null)
				{
					String pasEpisodeId=pv1.getAlternateVisitID().getID().getValue();
					pasResult=(PasEventVo)psearch.getPasEvent(pasEpisodeId, patVo, visitId);
								
					if (pasResult==null)
					{
						pas.setPatient(patVo);
						
						try 
						{
							fillPasEventFromPV1(pv1, pas, getOrgLoc(), getHcpAdmin(),providerSystem);
						} 
						catch (Exception e) 
						{
							throw new HL7Exception(e.getMessage(), e);
						}
						
						
						//WDEV-20278
	//					CareSpellVo careSpell=createCareSpellVo(pas,pv1);
						CareSpellVo careSpell = createCareSpellVo(pas, pv1, providerSystem);
						try 
						{
							pas = saveCareSpell(careSpell);
						} 
						catch (StaleObjectException e) 
						{
							throw new HL7Exception(e.getMessage(), e);
						}
					}
					else if (!pasResult.getPasEventId().equals(visitId))
					{
						// A new PasEvent is to be created, so pass an empty one
						pasResult = new PasEventVo();
						pas=createCareContext(patVo, pv1, pasResult,providerSystem);
						if (pas == null)  // wdev-7705
							throw new HL7Exception("Error occurred creating care context - null value was returned");
					}
					else
					{
						pas=pasResult;
						CareContextInterfaceVo careContext = careSpellDialog.getCareContextFromPasEpisodeId(pasEpisodeId, visitId);
						// wdev-7444
						if (careContext == null)
							throw new HL7Exception("CareContext not found for pasEpisodeId=" + pasEpisodeId + " and visitId=" + visitId);
						
						DateTime d=new DateTime(pv1.getAdmitDateTime().getTimeOfAnEvent().getValue());
						careContext.setStartDateTime(d);
						
						// WDEV-13901 - check if history records required for CC and EpisodeOfCare 
						careContext = createHistoryCareContextAndEpis(careContext, false, pv1, providerSystem.getCodeSystem().getText());
						
						String [] errors = careContext.validate();
						if (errors != null)
						{
							throw new HL7Exception("Validation of Care Context failed. " + VoMapper.toDisplayString(errors));				
						}
						careSpellDialog.saveCareContext(careContext);
					}
				}
			}
			String patClass = pv1.getPatientClass().getValue();
			if (patClass != null && patClass.equals(OUTPATIENT_APP))
			{
				OutPatientAttendanceVo attVo=new OutPatientAttendanceVo();
				if (pas.getID_PASEvent()==null)
				{
				pas.setPatient(patVo);
				String eventId = pv1.getVisitNumber().getID().getValue() + "_" + pv1.getVisitNumber().getComponent(1);
				pas.setPasEventId(eventId);
				
				attVo = getADT().getOutpatientAppointment(pas);
				}
				else
				{
					attVo = getADT().getOutpatientAppointment(pas);
				}
				
				if (attVo == null)
				{
					// wdev-2858 This could be an appointment re-arrange (CCO) so we will try to get an appointment
					// by the third and fourth components.  The new eventId will be set later in fillAttFromMsg
					String oldEventId = pv1.getVisitNumber().getComponent(2) + "_" + pv1.getVisitNumber().getAssigningAuthority().getNamespaceID();
				
					if (!oldEventId.equals("_") && !oldEventId.equals("null_null"))
					{
						pas.setPasEventId(oldEventId);
						attVo = getADT().getOutpatientAppointment(pas);
					}
					if (attVo == null)
						attVo = new OutPatientAttendanceVo();

					attVo.setPasEvent(pas);
				}
				attVo = fillAttFromMsg(attVo, msg, getOrgLoc(), getHcpAdmin(),providerSystem);
				
				// WDEV-13455 
				// For Patient Diary, send the recording user which is sent in EVN-5
				EVN evn = (EVN) msg.get("EVN");
				// WDEV-15884 Check not null!
				if (evn != null && evn.getOperatorID() != null && evn.getOperatorID().length > 0)
					attVo.setRecordingUser(evn.getOperatorID()[0].getIDNumber().getValue());
				
				attVo.getPasEvent().setPatient(patVo);
				attVo.setAppointmentStatus(Status_Reason.BOOKED);
				String[] errs = attVo.validate();
				if (errs != null)
				{
					throw new HL7Exception("Validation of Outpatient Attendance failed. " + VoMapper.toDisplayString(errs));				
				}
				errs = patVo.validate();
				if (errs != null)
				{
					throw new HL7Exception("Validation of Patient failed. " + VoMapper.toDisplayString(errs));				
				}
				getADT().recordOPAttendance(patVo, attVo, null);
			}
			else if (patClass != null && patClass.equals(INPATIENT_APP))
			{
				InpatientEpisodeVo attVo = fillEpisFromMsg(msg, getOrgLoc(), getHcpAdmin(),providerSystem);
				
//				attVo.setIsMaternityInpatient(isMaternity(pv1));
				
				attVo.getPasEvent().setPatient(patVo);
				String[] errs = attVo.validate();
				if (errs != null)
				{
					throw new HL7Exception("Validation of Admission failed. " + VoMapper.toDisplayString(errs));				
				}
				errs = patVo.validate();
				if (errs != null)
				{
					throw new HL7Exception("Validation of Patient failed. " + VoMapper.toDisplayString(errs));				
				}
				getADT().admitPatient(patVo, attVo, null);
			}
			else if (patClass != null && patClass.equals(EMERGENCY_APP))
			{
				PasEventVo pasEventVo = new PasEventVo();
				if (pas==null||!pas.getPatientIsNotNull()||!pas.getPasEventIdIsNotNull())
				{
					pasEventVo.setPatient(patVo);
					String eventId = pv1.getVisitNumber().getID().getValue() + "_" + pv1.getVisitNumber().getComponent(1);
					pasEventVo.setPasEventId(eventId);
				}
				else
				{
					pasEventVo=pas;
				}
				
				AneAttendanceVo attVo = getADT().getAnEAttendance(pasEventVo);
				if (attVo == null)
					attVo = new AneAttendanceVo();
				
				attVo = fillAnEAttFromMsg(attVo, msg, getOrgLoc(), getHcpAdmin(),providerSystem);
				attVo.getPasEvent().setPatient(patVo);
				String[] errs = attVo.validate();
				errs = patVo.validate(errs);
				if (errs != null)
				{
					throw new HL7Exception("Validation failed: " + VoMapper.toDisplayString(errs));				
				}
				errs = patVo.validate();
				if (errs != null)
				{
					throw new HL7Exception("Validation of Patient failed. " + VoMapper.toDisplayString(errs));				
				}
				if(msg instanceof ADT_A01&&("A13".equals(((MSH)msg.get("MSH")).getMessageType().getTriggerEvent().getValue()))) //http://jira/browse/WDEV-18129
				{
					getADT().recordAEAttendance(attVo, patVo, true);
				}
				else
				{
					getADT().recordAEAttendance(attVo, patVo, false);
				}
			
			}
			else if (patClass != null && patClass.equals(PREADMIT))
			{
				// Create PAS event and PendingElectiveAdmission with status pending
				String admitDTstr = pv1.getAdmitDateTime().getTimeOfAnEvent().getValue();
				if (admitDTstr==null)
				{
					throw new HL7Exception("PV1-44 (Admit Date Time) must be set for Preadmit(TCI) patients" );
				}
				String bedStatus = pv1.getBedStatus().getValue();
				if(bedStatus==null||!("B".equals(bedStatus)||"P".equals(bedStatus)))
				{
					throw new HL7Exception("PV1-40 (Bed status) must be either Booked B or Planned P" );
				}
				DateTime admitDateTime=new DateTime(admitDTstr);
				
//				WDEV-7429 				
//				DateTime now = new DateTime();
//				if(("B".equals(bedStatus))&&now.isGreaterOrEqualThan(admitDateTime))
//				{
//					throw new HL7Exception("PV1-44 (Admit Date Time) must be in the future for Booked Preadmit(TCI) patients" );
//				}
				PasEventVo pasEventVo = new PasEventVo();
				if (pas==null||!pas.getPatientIsNotNull()||!pas.getPasEventIdIsNotNull())
				{
					pasEventVo.setPatient(patVo);
					String eventId = pv1.getVisitNumber().getID().getValue() + "_" + pv1.getVisitNumber().getComponent(1);
					if(eventId==null)
					{
						throw new HL7Exception("PV1-19 (Visit number) must be set for Preadmit(TCI) patients" );
					}
					pasEventVo.setPasEventId(eventId);
				}
				else
				{
					pasEventVo=pas;
				}
				PendingElectiveAdmissionHl7Vo tciVo;
				tciVo=getADT().getPendingElectiveAdmission(pasEventVo);
				if(tciVo==null)
				{
					tciVo=new PendingElectiveAdmissionHl7Vo();
				}
				
				PasEventVo pe = tciVo.getPasEvent();
				if (pe == null)
					pe = new PasEventVo();

				EVN evn = (EVN) msg.get("EVN");
				PV2 pv2 = (PV2) msg.get("PV2");
				
				//Check what other message types are passing through here
				PR1 pr1=null;
				String [] procedureCodes = null;

				if (msg instanceof ADT_A05)
				{
					procedureCodes = new String[((ADT_A05)msg).getADT_A05_PR1ROLReps()];
					for (int i=0;i<((ADT_A05)msg).getADT_A05_PR1ROLReps();i++)
					{
						pr1=((ADT_A05)msg).getADT_A05_PR1ROL(i).getPR1();
						procedureCodes[i] = pr1.getProcedureCode().getIdentifier().getValue();
					}
				}
				else if (msg instanceof ADT_A01)
				{
					procedureCodes = new String[((ADT_A01)msg).getADT_A01_PR1ROLReps()];
					for (int i=0;i<((ADT_A01)msg).getADT_A01_PR1ROLReps();i++)
					{
						pr1=((ADT_A01)msg).getADT_A01_PR1ROL(i).getPR1();
						procedureCodes[i] = pr1.getProcedureCode().getIdentifier().getValue();
						
					}
				}
				
				// http://jira/browse/WDEV-11749
				if (ConfigFlag.HL7.INSTANTIATE_EPISODE_FROM_ADT.getValue()&&(pas!=null))
					pe=pas;
				
				fillPasEventFromEVN(evn, pe, null);
				fillPasEventFromPV1(pv1, pe, orgLoc, hcpAdmin,providerSystem);
				pe.setPatient(patVo);
				tciVo.setPasEvent(pe);
				
				tciVo.setAllocatedWard(pe.getLocation());
				tciVo.setTCIDate(admitDateTime.getDate());
				tciVo.setTCITime(admitDateTime.getTime());
				tciVo.setElectiveAdmissionStatus(ElectiveAdmissionStatus.TCI);
				tciVo.setWardType(getWardType(pv2));
				tciVo.setReasonForAdmission(getReasonForAdmission(pv2));
				tciVo.setAdmissionSource(getSourceAdmission(pv2));
				tciVo.setExpectedStay(HL7Utils.getIntegerFromNM(pv2.getEstimatedLengthOfInpatientStay()));
				tciVo.setManagementIntention(getManagementIntention(pv2));
				tciVo.setProcedures(procedureCodes);
				tciVo.setIsMaternity(isMaternity(pv1));
				///WDEV-8533
				tciVo.setAdmissionMethod(getMethodOfAdmission(pv1));
				
				
				if("B".equals(bedStatus))
				{	
					tciVo.setTCIType(TCIType.BOOKED);
				}
				else if("P".equals(bedStatus))
				{
					tciVo.setTCIType(TCIType.PLANNED);
				}
				//http://jira/browse/WDEV-13505
				tciVo.setPatientStatus(getPatientStatus(pv1));
				//WDEV-20278
//				tciVo.setReferringConsultant(getReferringConsultant(pv1));
				tciVo.setReferringConsultant(getReferringConsultant(pv1, providerSystem)); //WDEV-20278

				String [] errs = tciVo.validate();
				errs = pasEventVo.validate(errs);
				if (errs != null)
				{
					throw new HL7Exception("Validation failed: " + VoMapper.toDisplayString(errs));				
				}
				
				getADT().recordPendingElectiveAdmission(pasEventVo, tciVo);
				
			}
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
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

	
	public Message populateMessage()
	{
		// Not required in inbound messages
		return null;
	}

	//WDEV-19704
	public Message populateMessage(IHL7OutboundMessageHandler event) throws Exception
	{
		LOG.debug("A05VoMapper populateMessage: entry");
		ADT_A05 message = new ADT_A05();
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
			
			if(patElectList.getPatient() != null)
			{
				patient = patElectList.getPatient();
			}
			
			// EVN-2 Recorded date/time (TS)
			//WDEV-22918
//			if(patElectList.getDateReferralReceived() != null)
//			{
//				message.getEVN().getRecordedDateTime().getTimeOfAnEvent().setValue(patElectList.getDateReferralReceived().toString(DateFormat.ISO));
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
		
			//EVN-3 Date/time planned event (TS)
			if(patElectList.getDateOnList() != null)
			{
				message.getEVN().getDateTimePlannedEvent().getTimeOfAnEvent().setValue(patElectList.getDateOnList().toString(DateFormat.ISO));
			}
		
			if(patient !=null)
			{						
				renderPatientVoToPID(patient, message.getPID(), event.getProviderSystem());

				//WDEV-22006 Comment out following code and replace by calling a single method
				
//				NK1 nk1 = message.getNK1(0);
//				
//				//WDEV-20335
//				Boolean isConfidential = patient.getIsConfidential();
//	
//				//WDEV-20336 Populate NK1 from PDSRelative object first. If object is Null then use Next of Kin VO
//				int NK1Iteration = 0;
//				
//				if(patient.getPDSrelativesIsNotNull()
//						&& patient.getPDSrelatives().size() > 0)
//				{
//					for (int i=0; i < patient.getPDSrelatives().size(); i++)
//					{
//						PatRelative patRelative = patient.getPDSrelatives().get(i);
//						renderPatRelativeVoToNK1(patRelative, nk1, event.getProviderSystem(), isConfidential);
//						NK1Iteration ++;
//					}
//				} 
//				else
//				{
//					renderNextOfKinVoToNK1(patient.getNok(), nk1, event.getProviderSystem(), isConfidential);
//					NK1Iteration ++;
//				}//WDEV-20336
//				
//				
//				// If configuration flag HL7_INCLUDE_FAMILY_SUPPORT  is true and 
//				// any support family network contact details exist, then add these as NK1 segments (within a loop)
//				// renderSupportNetworkFamilyVoToNK1(SupportNetworkFamily snfVo, NK1 nk1,ProviderSystemVo providerSystem)
//				
//				if(patient.getSupportNetworkFamilyIsNotNull() && ConfigFlag.HL7.HL7_INCLUDE_FAMILY_SUPPORT.getValue())
//				{
//					
//					for (int i=0; i<patient.getSupportNetworkFamily().size(); i++)
//					{
//						NK1 sfn = message.getNK1(NK1Iteration);
//						if(patient.getSupportNetworkFamily().get(i).getInactivatingDateTime() == null)
//						{
//							//WDEV-20335
//							renderSupportNetworkFamilyVoToNK1(patient.getSupportNetworkFamily().get(i), sfn, event.getProviderSystem(), isConfidential); //WDEV-20335
//							NK1Iteration++;
//						}
//					}
//				}
				
				renderPatientVoToNK1(patient, message, event.getProviderSystem());
				//WDEV-22006

				PD1 pd1 = message.getPD1();
				//WDEV-20993
//				renderGPDetailsToPD1(patient, pd1);	
				renderGPDetailsToPD1(patient, pd1, event.getProviderSystem());	
				renderPatientDetailsToPD1(patient, pd1, event.getProviderSystem()); //WDEV-22624
				
				if(feedVo.getProviderSystem().getConfigurationProperty("PreAdmitADTOnFirstAppointment") != null
						&& feedVo.getProviderSystem().getConfigurationProperty("PreAdmitADTOnFirstAppointment").getPropertyValue() != null
						&& feedVo.getProviderSystem().getConfigurationProperty("PreAdmitADTOnFirstAppointment").getPropertyValue().equalsIgnoreCase("FALSE"))
				{
					pd1.getPatientPrimaryFacility(0).getAssigningAuthority().getNamespaceID().setValue("");
				}

			}
			
		}

		populateMSH( event.getProviderSystem(),  message.getMSH(),Long.toString( new java.util.Date().getTime()),"ADT","A05");
		message.getEVN().getEventTypeCode().setValue("A05");

		LOG.debug("A05VoMapper populateMessage: exit");

		return message;
	}

	
	//WDEV-19704
	public Message populateADT_A05For1stApptMessage(IHL7OutboundMessageHandler event) throws Exception
	{
		ADT_A05 message = new ADT_A05();
		AppointmentMessageQueueVo apptVo = (AppointmentMessageQueueVo)event;
		ifOutBookingAppointmentVo apptDetails = adt.getBookingAppointmentDetails(apptVo);
		
		ifCatsReferralVo catsReferral = apptDetails.getCatsReferral();
		
		// Only need to create an A05 if the appointment is the 'first appointment'
		if(catsReferral.getConsultationAppt() != null
				&& catsReferral.getConsultationAppt().getID_Booking_Appointment() != null
				&& catsReferral.getConsultationAppt().getID_Booking_Appointment() != apptDetails.getID_Booking_Appointment())
		{
			message = null;
		}
		else
		{
			LOG.debug("A05VoMapper populateADT_A05For1stApptMessage: entry");
			Patient patient = null;
			PV1 pv1 = message.getPV1();
			PV2 pv2 = message.getPV2();
				
			a01Vomapper = (A01VoMapper)HL7EngineApplication.getVoMapper(EvnCodes.A01);
			if(a01Vomapper==null)
			{
				throw new HL7Exception("A05 mapper requires A01 mapper. A01 mapper not found in list of registered mappers.");			
			}
			
			// Start constructing HL7 message
			//PV1-2 Patient Class (IS)
			pv1.getPatientClass().setValue("WAITLIST");

			//PV1-3-1 Point of care (IS)
			if(apptDetails.getLocationCode() != null)
			{
				pv1.getAssignedPatientLocation().getPointOfCare().setValue(apptDetails.getLocationCode());
			}
			
			//PV1-3-4 Facility (HD)
			if(apptDetails.getFacilityCode() != null)
			{
				pv1.getAssignedPatientLocation().getFacility().getNamespaceID().setValue(apptDetails.getFacilityCode());
			}
			
			//PV1-3-9 Location description (ST)
			if(apptDetails.getLocationName() != null
					&& apptDetails.getLocationName().length() > 0)
			{
				pv1.getAssignedPatientLocation().getLocationDescription().setValue(apptDetails.getLocationName());
			}
			
			//PV1-5 Preadmit number (CX)
			if(catsReferral.getID_CatsReferral() != null)
			{
				pv1.getPreadmitNumber().getID().setValue(catsReferral.getID_CatsReferral().toString());
			}
			
			//PV1-7 Attending doctor (XCN)
//			if(catsReferral.getReferralDetails() != null
//					&& catsReferral.getReferralDetails().getGPName() != null)
//			{
//				renderGpLiteVoToXCN(catsReferral.getReferralDetails().getGPName(), pv1.getAttendingDoctor(0), event.getProviderSystem());
//			}
			//WDEV-20069 Above code was incorrect
			if(apptDetails.getSlotResponsibility() != null)
			{
				//WDEV-21000
//				renderMemberOfStaffShortVoToXCNNatCode(apptDetails.getSlotResponsibility(), pv1.getAttendingDoctor(0), event.getProviderSystem());
				if (ConfigFlag.HL7.USE_CONFIGURED_TAXONOMYTYPES_FOR_XCN.getValue())
				{
					renderMemberOfStaffShortVoToAttendingDoctor(apptDetails.getSlotResponsibility(), pv1, event.getProviderSystem());
				}
				else
				{
					renderMemberOfStaffShortVoToXCNNatCode(apptDetails.getSlotResponsibility(), pv1.getAttendingDoctor(0), event.getProviderSystem());
				}
			} //WDEV-20069
			
			// WDEV-21244
			//	Use Collection of list owner(s) where Boolean AttendingClinician is true
			else
			{
				if (apptDetails.getListOwners() != null)
				{
					Boolean isAttendingClinician = true;
					
					if (ConfigFlag.HL7.USE_CONFIGURED_TAXONOMYTYPES_FOR_XCN.getValue())
					{
						renderSessionListOwnerVoCollToAttendingDoctor(apptDetails.getListOwners(), pv1, event.getProviderSystem(), isAttendingClinician);						
					}
					else
					{
						int iter = 0;
						for (int i=0; i<apptDetails.getListOwners().size(); i++)
						{
							if (apptDetails.getListOwners().get(i).getAttendingClinician() != null
									&& apptDetails.getListOwners().get(i).getAttendingClinician().equals(isAttendingClinician))
							{
								renderMemberOfStaffShortVoToXCNNatCode(apptDetails.getListOwners().get(i).getHcp().getMos(), pv1.getAttendingDoctor(iter), event.getProviderSystem());
								iter ++;
							}
						}
					}
				}
			} //WDEV-21244
			
			//PV1-8 Referring doctor (XCN)
			// **** Can be either:
			// 	**** 1. Referring GP
			// 	**** 2. Referring consultant
			// 	**** 3. Allied health professional
			if(catsReferral.getReferralDetails() != null
					&& catsReferral.getReferralDetails().getGPName() != null
					&& catsReferral.getReferrerType() != null
					&& catsReferral.getReferrerType().equals(SourceOfReferral.GP))
			{
				//WDEV-21000
//				renderGpLiteVoToXCN(catsReferral.getReferralDetails().getGPName(), pv1.getReferringDoctor(0), event.getProviderSystem());
				if (ConfigFlag.HL7.USE_CONFIGURED_TAXONOMYTYPES_FOR_XCN.getValue())
				{
					renderGpLiteVoToReferringDoctor(catsReferral.getReferralDetails().getGPName(), pv1, event.getProviderSystem());
				}
				else
				{
					renderGpLiteVoToXCN(catsReferral.getReferralDetails().getGPName(), pv1.getReferringDoctor(0), event.getProviderSystem());
				}
			}

			if(catsReferral.getReferralDetails() != null
					&& catsReferral.getReferralDetails().getReferringConsultant() != null
					&& catsReferral.getReferrerType() != null
					&& catsReferral.getReferrerType().equals(SourceOfReferral.CONSULTANT))
			{
				//WDEV-21000
//				renderHcpToXCN(catsReferral.getReferralDetails().getReferringConsultant(), pv1.getReferringDoctor(0), event.getProviderSystem());
				if (ConfigFlag.HL7.USE_CONFIGURED_TAXONOMYTYPES_FOR_XCN.getValue())
				{
					renderHcpToReferringDoctor(catsReferral.getReferralDetails().getReferringConsultant(), pv1, event.getProviderSystem());
				}
				else
				{
					renderHcpToXCN(catsReferral.getReferralDetails().getReferringConsultant(), pv1.getReferringDoctor(0), event.getProviderSystem());
				}
			}
			
			if(catsReferral.getReferralDetails() != null
					&& catsReferral.getReferralDetails().getAlliedHealthProfName() != null 
					&& catsReferral.getReferralDetails().getAlliedHealthProfName().length() > 0
					&& catsReferral.getReferrerType() != null
					&& catsReferral.getReferrerType().equals(SourceOfReferral.AHP))
			{
				pv1.getReferringDoctor(0).getFamilyName().getOwnSurname().setValue(catsReferral.getReferralDetails().getAlliedHealthProfName());
			}

			//WDEV-20069
			//PV1-9 Consulting doctor (XCN)
			if(apptDetails.getResponsibleHCP() != null)
			{
				//WDEV-21000
//				renderMemberOfStaffShortVoToXCNNatCode(apptDetails.getResponsibleHCP(), pv1.getConsultingDoctor(0), event.getProviderSystem());
				if (ConfigFlag.HL7.USE_CONFIGURED_TAXONOMYTYPES_FOR_XCN.getValue())
				{
					renderMemberOfStaffShortVoToConsultingDoctor(apptDetails.getResponsibleHCP(), pv1, event.getProviderSystem());
				}
				else
				{
					renderMemberOfStaffShortVoToXCNNatCode(apptDetails.getResponsibleHCP(), pv1.getConsultingDoctor(0), event.getProviderSystem());
				}

			} //WDEV-20069
			
			// WDEV-21244 
			//	Use Collection of list owner(s) where Boolean ListOwner is true
			else
				
			{
				if (apptDetails.getListOwners() != null)
				{
					Boolean isListOwner = true;
					if (ConfigFlag.HL7.USE_CONFIGURED_TAXONOMYTYPES_FOR_XCN.getValue())
					{
						renderSessionListOwnerVoCollToConsultingDoctor(apptDetails.getListOwners(), pv1, event.getProviderSystem(), isListOwner);	
					}
					else
					{
						int iter = 0;
						for (int i=0; i<apptDetails.getListOwners().size(); i++)
						{
							if (apptDetails.getListOwners().get(i).getListOwner() != null
									&& apptDetails.getListOwners().get(i).getListOwner().equals(isListOwner))
							{
								renderMemberOfStaffShortVoToXCNNatCode(apptDetails.getListOwners().get(i).getHcp().getMos(), pv1.getConsultingDoctor(iter), event.getProviderSystem());
								iter ++;
							}
						}						
					}
				}
			} //WDEV-21244
			
			//PV1-10 Hospital service (IS)
			if(catsReferral.getReferralDetails() != null
					&& catsReferral.getReferralDetails().getService() != null
					&& catsReferral.getReferralDetails().getService().getSpecialty() != null)
			{
				pv1.getHospitalService().setValue(svc.getRemoteLookup(catsReferral.getReferralDetails().getService().getSpecialty().getID(), event.getProviderSystem().getCodeSystem().getText()));
			}

			//PV1-18 Patient Type ((IS)
			pv1.getPatientType().setValue("OPREFERRAL");
			
			//PV1-19 Visit Number (CX)
			if(apptDetails.getMaximsApptId() != null)
			{
				pv1.getVisitNumber().getID().setValue(apptDetails.getMaximsApptId().toString());				
			}

			//PV1-39 Servicing facility (IS)
			// [Same as PV1-3-4]
			if(apptDetails.getFacilityCode() != null)
			{
				pv1.getServicingFacility().setValue(apptDetails.getFacilityCode().toString());
			}
			
			//PV1-41 Account status (IS)
			pv1.getAccountStatus().setValue("ACTIVE");
		
			//PV2-13-1 Referral source code ID Number (ST) [Referring practice code]
			if(apptDetails.getPracticeCode() != null
					&& apptDetails.getPracticeCode().length() > 0)
			{
				pv2.getReferralSourceCode(0).getIDNumber().setValue(apptDetails.getPracticeCode());
			}

			//PV2-13-9 Referral source code Assigning authority (HD) [Practice CCG code]
			if(catsReferral.getReferringPracticeCCGCode() != null)
			{
				pv2.getReferralSourceCode(0).getAssigningAuthority().getNamespaceID().setValue(catsReferral.getReferringPracticeCCGCode());
			}

			//PV2-23 Clinic organization name (XON)
			
			//PV2-25 Visit priority code [Referral Urgency]
			if(catsReferral.getUrgency() != null)
			{
				pv2.getVisitPriorityCode().setValue(svc.getRemoteLookup(catsReferral.getUrgency().getID(), event.getProviderSystem().getCodeSystem().getText()));
			}

			//PV1-41 Account status (IS) [RTT Status code]
//			if(catsReferral.getcur != null
//					&& catsReferral.getCurrentStatus() != null
//					&& catsReferral.getCurrentStatus().get)
				
			//PV2-42 Patient condition code (IS) [Cancer Type]
			if(catsReferral.getCancerType() != null)
			{
				pv2.getPatientConditionCode().getIdentifier().setValue((svc.getRemoteLookup(catsReferral.getCancerType().getID(), event.getProviderSystem().getCodeSystem().getText())));
			}
			
			//EVN-2 Recorded date/time (TS)
			//WDEV-22918
//			if(catsReferral.getReferralDetails() != null
//					&& catsReferral.getReferralDetails().getDateReferralReceived() != null)
//			{
//				message.getEVN().getRecordedDateTime().getTimeOfAnEvent().setValue(catsReferral.getReferralDetails().getDateReferralReceived().toString(DateFormat.ISO));
//			}
			if (catsReferral.getSysInfo().getLastupdateDateTime() != null)
			{
				message.getEVN().getRecordedDateTime().getTimeOfAnEvent().setValue(apptDetails.getSystemInfo().getCreationDateTime().toString(DateTimeFormat.ISO));
			}
			else if (catsReferral.getSysInfo().getCreationDateTime() != null)
			{
				message.getEVN().getRecordedDateTime().getTimeOfAnEvent().setValue(catsReferral.getSysInfo().getLastupdateDateTime().toString(DateTimeFormat.ISO));
			} //WDEV-22918
		
			//EVN-3 Date/time planned event (TS)
			if(catsReferral.getReferralDetails() != null
					&& catsReferral.getReferralDetails().getDateOfReferral() != null)
			{
				message.getEVN().getDateTimePlannedEvent().getTimeOfAnEvent().setValue(catsReferral.getReferralDetails().getDateOfReferral().toString(DateFormat.ISO));
			}
			
			
			if(apptDetails.getPatient() != null)
			{
				patient = apptDetails.getPatient();
				renderPatientVoToPID(patient, message.getPID(), event.getProviderSystem());

				//WDEV-22006 Comment out following code and replace by calling a single method
				
//				NK1 nk1 = message.getNK1(0);		
//				
//				//WDEV-20335
//				Boolean isConfidential = patient.getIsConfidential();
//
//				//WDEV-20336 Populate NK1 from PDSRelative object first. If object is Null then use Next of Kin VO
//				int NK1Iteration = 0;
//				
//				if(patient.getPDSrelatives() != null
//						&& patient.getPDSrelatives().size() > 0)
//				{
//					for (int i=0; i < patient.getPDSrelatives().size(); i++)
//					{
//						PatRelative patRelative = patient.getPDSrelatives().get(i);
//						renderPatRelativeVoToNK1(patRelative, nk1, event.getProviderSystem(), isConfidential);
//						NK1Iteration ++;
//					}
//				}
//				else
//				{
//					renderNextOfKinVoToNK1(patient.getNok(), nk1, event.getProviderSystem(), isConfidential);
//					NK1Iteration ++;
//				}//WDEV-20336
//				
//				// If configuration flag HL7_INCLUDE_FAMILY_SUPPORT  is true and 
//				// any support family network contact details exist, then add these as NK1 segments (within a loop)
//				// renderSupportNetworkFamilyVoToNK1(SupportNetworkFamily snfVo, NK1 nk1,ProviderSystemVo providerSystem)
//				
//				if(patient.getSupportNetworkFamilyIsNotNull() 
//						&& ConfigFlag.HL7.HL7_INCLUDE_FAMILY_SUPPORT.getValue())
//				{
//					for (int i=0; i<patient.getSupportNetworkFamily().size(); i++)
//					{
//						NK1 sfn = message.getNK1(NK1Iteration);
//						if(patient.getSupportNetworkFamily().get(i).getInactivatingDateTime() == null)
//						{
//							//WDEV-20335
//							renderSupportNetworkFamilyVoToNK1(patient.getSupportNetworkFamily().get(i), sfn, event.getProviderSystem(), isConfidential); //WDEV-20335
//							NK1Iteration++;
//						}
//					}
//				}

				renderPatientVoToNK1(patient, message, event.getProviderSystem());
				//WDEV-22006
				
				PD1 pd1=message.getPD1();
				//WDEV-20993
//				renderGPDetailsToPD1(patient,pd1);			
				renderGPDetailsToPD1(patient, pd1, event.getProviderSystem());			
			
			}

			populateMSH( event.getProviderSystem(),  message.getMSH(),Long.toString( new java.util.Date().getTime()),"ADT","A05");
			message.getEVN().getEventTypeCode().setValue("A05");

			LOG.debug("A05VoMapper populateADT_A05For1stApptMessage: exit");
		}
		return message;
	}

}
