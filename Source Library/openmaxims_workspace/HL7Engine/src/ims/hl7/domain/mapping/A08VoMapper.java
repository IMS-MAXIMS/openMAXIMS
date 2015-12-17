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

import ims.admin.vo.EDAttendanceFeedVo;
import ims.RefMan.vo.CatsReferralVo;
import ims.ccosched.vo.lookups.AppointmentStatus;
import ims.configuration.gen.ConfigFlag;
import ims.core.resource.place.vo.LocSiteRefVo;
import ims.core.vo.CareContextInterfaceVo;
import ims.core.vo.DischargedEpisodeVo;
import ims.core.vo.InpatientEpisodeVo;
import ims.core.vo.LocSiteShortVo;
import ims.core.vo.OutPatientAttendanceVo;
import ims.core.vo.PasEventVo;
import ims.core.vo.PatRelative;
import ims.core.vo.Patient;
import ims.core.vo.ifInpatientEpisodeVo;
import ims.core.vo.lookups.MsgUpdateType;
import ims.core.vo.lookups.SourceOfReferral;
import ims.core.vo.lookups.Specialty;
import ims.core.vo.lookups.TaxonomyType;
import ims.emergency.vo.ifEDAttendanceVo;
import ims.framework.utils.Date;
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
import ims.ocs_if.vo.InpatientEpisodeQueueVo;
import ims.scheduling.vo.AppointmentMessageQueueVo;
import ims.scheduling.vo.ifOutBookingAppointmentVo;
import ims.scheduling.vo.lookups.Status_Reason;
import ims.vo.interfaces.IHL7OutboundMessageHandler;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v24.message.ADT_A01;
import ca.uhn.hl7v2.model.v24.segment.EVN;
import ca.uhn.hl7v2.model.v24.segment.NK1;
import ca.uhn.hl7v2.model.v24.segment.PD1;
import ca.uhn.hl7v2.model.v24.segment.PV1;
import ca.uhn.hl7v2.model.v24.segment.PV2;

public class A08VoMapper extends VoMapper
{
	private static final Logger			LOG		= Logger.getLogger(A08VoMapper.class);
	private A01VoMapper a01Vomapper; //WDEV-19481
	
	public Message populateMessage(IHL7OutboundMessageHandler event)  throws Exception
	{
		
		LOG.debug("A08VoMapper populateMessage: entry");

		a01Vomapper = (A01VoMapper)HL7EngineApplication.getVoMapper(EvnCodes.A01);

		if(a01Vomapper==null)
		{
			throw new HL7Exception("A08 mapper requires A01 mapper. A01 mapper not found in list of registered mappers.");			
		}


		ADT_A01 message = new ADT_A01();
		Patient patient = null;
		PV1 pv = message.getPV1();

		if(event instanceof EDAttendanceFeedVo)
		{
			ifEDAttendanceVo attendenceDetails= adt.getEDAttendanceDetails(event);
			patient=attendenceDetails.getPatient();
			//PV1-3
			renderPatientLocationToPV1(attendenceDetails.getRegistrationLocation(), null, null, pv, event.getProviderSystem());
			
			//PV1-2
			pv.getPatientClass().setValue("E");  // only mandatory item
			
			//PV1-10
			pv.getHospitalService().setValue("E");
			
			//PV1-19
			//PV1-19
			if(ConfigFlag.GEN.ED_USE_CUSTOM_ATTENDANCE_ID.getValue()
					&&attendenceDetails.getCustomIDIsNotNull())
			{
				pv.getVisitNumber().getID().setValue(attendenceDetails.getCustomID());
			}
			else if(attendenceDetails.getBoId()!=null)
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
			
			//PV1-45
			if(attendenceDetails.getDischargeDateTimeIsNotNull())
			{
				renderDateTimeVoToTS(attendenceDetails.getDischargeDateTime(), pv.getDischargeDateTime(0));
			}
			//PV2-3
			PV2 pv2=message.getPV2();
			if(attendenceDetails.getEmergencyEpisodeIsNotNull()&&attendenceDetails.getEmergencyEpisode().getPresentingComplaintIsNotNull())
			{
				pv2.getAdmitReason().getIdentifier().setValue(svc.getRemoteLookup(
						attendenceDetails.getEmergencyEpisode().getPresentingComplaint().getID(),event.getProviderSystem().getCodeSystem().getText()));
			}
		}
		
		
		//WDEV-19481
		else if(event instanceof InpatientEpisodeQueueVo)
		{

			PV1 pv1 = message.getPV1();
			PV2 pv2 = message.getPV2();
			InpatientEpisodeQueueVo feedVo = (InpatientEpisodeQueueVo)event;
			ifInpatientEpisodeVo inpatientEpisode = adt.getInpatientEpisodeDetails(feedVo);
			patient = inpatientEpisode.getPatient();
			
			EVN evn = message.getEVN(); //http://jira/browse/WDEV-22831
			if(feedVo!=null && feedVo.getUpdateTypeIsNotNull())
			{
				evn.getEventReasonCode().setValue(svc.getRemoteLookup(feedVo.getUpdateType().getID(), event.getProviderSystem().getCodeSystem().getText()));
			}
			
			//WDEV-22918
			// EVN-2 Recorded date/time (TS)
			if (inpatientEpisode.getAdmissionEventDateTime() != null)
			{
					message.getEVN().getRecordedDateTime().getTimeOfAnEvent().setValue(inpatientEpisode.getAdmissionEventDateTime().toString(DateTimeFormat.ISO));
			}//WDEV-22918
			
			a01Vomapper.populateBasicEpisodeData(event, inpatientEpisode, pv1, pv2);
				
			// PV1-36 Discharge disposition
			if(inpatientEpisode.getDischargeDisposition() != null
					&& inpatientEpisode.getDischargeDestination().getID() > 0)
			{
				pv.getDischargeDisposition().setValue(svc.getRemoteLookup(inpatientEpisode.getDischargeDisposition().getID(), event.getProviderSystem().getCodeSystem().getText()));
			}
	
			// PV1-37 Discharged to location [*** No lookup for this - possibly a bug???]
			if(inpatientEpisode.getDischargeDestination() != null
					&& inpatientEpisode.getDischargeDestination().getID() > 0)
			{
				pv.getDischargedToLocation().getDischargeLocation().setValue(inpatientEpisode.getDischargeDestination().toString());
			}

			// PV1-45 Discharge date/time
			if(inpatientEpisode.getDischargeDateTimeIsNotNull())
			{
				renderDateTimeVoToTS(inpatientEpisode.getDischargeDateTime(), pv.getDischargeDateTime(0));
			}
										
		}
		

		//WDEV-19704
		else if(event instanceof ElectiveListMessageQueueVo)
		{
		
			a01Vomapper = (A01VoMapper)HL7EngineApplication.getVoMapper(EvnCodes.A01);
			if(a01Vomapper==null)
			{
				throw new HL7Exception("A08 mapper requires A01 mapper. A01 mapper not found in list of registered mappers.");			
			}

			PV1 pv1 = message.getPV1();
			PV2 pv2 = message.getPV2();
			ElectiveListMessageQueueVo feedVo = (ElectiveListMessageQueueVo)event;
			ifElectiveListMessageQueueVo patElectList = adt.getElectiveListMessageQueueDetails(feedVo);
			patient = patElectList.getPatient();

			a01Vomapper.populateBasicPatientElectiveList(event, patElectList, pv1, pv2);
			
			//WDEV-22918
			// EVN-2 Record date/time (TS)
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
														
		}

		populateMSH( event.getProviderSystem(),  message.getMSH(),Long.toString( new java.util.Date().getTime()), "ADT", "A08");
		renderPatientVoToPID(patient, message.getPID(), event.getProviderSystem());

		//WDEV-22006 Comment out following code and replace by calling a single method
//		NK1 nk1 = message.getNK1();
//		
//		//WDEV-20335
//		Boolean isConfidential = patient.getIsConfidential();
////		renderNextOfKinVoToNK1(patient.getNok(), nk1,event.getProviderSystem(), isConfidential); //WDEV-20335
//
//		//WDEV-20336 Populate NK1 from PDSRelative object first. If object is Null then use Next of Kin VO
//		int NK1Iteration = 0;
//		
//		if(patient.getPDSrelativesIsNotNull()
//				&& patient.getPDSrelatives().size() > 0)
//		{
//			for (int i=0; i < patient.getPDSrelatives().size(); i++)
//			{
//				PatRelative patRelative = patient.getPDSrelatives().get(i);
//				renderPatRelativeVoToNK1(patRelative, nk1, event.getProviderSystem(), isConfidential);
//				NK1Iteration ++;
//			}
//		} 
//		else
//		{
//			renderNextOfKinVoToNK1(patient.getNok(), nk1, event.getProviderSystem(), isConfidential);
//			NK1Iteration ++;
//		}//WDEV-20336
//	
//		// If config flag HL7_INCLUDE_FAMILY_SUPPORT  is true and 
//		// any support family network contact details exist, then add these as NK1 segments (within a loop)
//		// renderSupportNetworkFamilyVoToNK1(SupportNetworkFamily snfVo, NK1 nk1,ProviderSystemVo providerSystem)
//		if(patient.getSupportNetworkFamilyIsNotNull() && ConfigFlag.HL7.HL7_INCLUDE_FAMILY_SUPPORT.getValue())
//		{
//
//			for (int i=0; i<patient.getSupportNetworkFamily().size(); i++)
//			{
//				NK1 sfn = message.getNK1(NK1Iteration);
//				if(patient.getSupportNetworkFamily().get(i).getInactivatingDateTime()==null)
//				{
//					//WDEV-20335
//					renderSupportNetworkFamilyVoToNK1(patient.getSupportNetworkFamily().get(i), sfn, event.getProviderSystem(), isConfidential); //WDEV-20335
//					NK1Iteration++;
//				}
//			}
//		}
		renderPatientVoToNK1(patient, message, event.getProviderSystem());
		//WDEV-22006
		
		PD1 pd1=message.getPD1();
		//WDEV-20993
//		renderGPDetailsToPD1(patient, pd1);
		renderGPDetailsToPD1(patient, pd1, event.getProviderSystem());
		renderPatientDetailsToPD1(patient, pd1, event.getProviderSystem()); //WDEV-22624
		message.getEVN().getEventTypeCode().setValue("A08");
		
		return message;
	}
	
	
	

	//WDEV-20112
//	public Message processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	public EventResponse processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception //WDEV-20122
	{
		return (processUpdatePatientInformation(msg, providerSystem));
	}

	//WDEV-20112
//	private Message processUpdatePatientInformation(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	private EventResponse processUpdatePatientInformation(Message msg, ProviderSystemVo providerSystem) throws HL7Exception //WDEV-20112
	{
		//WDEV-20112
		EventResponse response = new EventResponse(); //WDEV-20112
		
		try
		{

			PV1 pv1 = (PV1) msg.get("PV1");
			String patClass = pv1.getPatientClass().getValue();
			
			if (patClass!=null && (patClass.equals(PREADMIT)||patClass.equals(EMERGENCY_APP)))
			{
				A05VoMapper a05mapper = (A05VoMapper) HL7EngineApplication.getVoMapper(EvnCodes.A05);
				if (a05mapper == null)
				{
					throw new HL7Exception("A08 mapper requires A05 mapper. A05 mapper not found in list of registered mappers.");			
				}
				
				//WDEV-20112
//				Message ack = a05mapper.processEvent(msg, providerSystem);
//				return ack;
				response.setMessage((Message) a05mapper.processEvent(msg, providerSystem));
				return response; //WDEV-20112
			}
			
			Patient patVo = savePatient(msg, providerSystem, false);
			//WDEV-20112
			response.setPatient(patVo); //WDEV-20112

			if(ConfigFlag.HL7.ADT_IN_UPDATE_PARTIAL_ADMISSION_ONLY.getValue())
			{
				InpatientEpisodeVo episVo=null;
				episVo = fillEpisFromMsg(episVo, msg, getOrgLoc(), getHcpAdmin(),providerSystem);
				episVo.getPasEvent().setPatient(patVo);
				String[] errs = episVo.validate();
				if (errs != null)
				{
					throw new HL7Exception("Validation of Episode failed. " + VoMapper.toDisplayString(errs));				
				}
				adt.updateInpatient(episVo, null);
				//WDEV-20112
//				Message ack = HL7Utils.buildPosAck( msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems()));
//				return ack;
				response.setMessage(HL7Utils.buildPosAck( msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems())));
				response.setPatient(patVo);
				return response; //WDEV-20112
			}

			
			if (patClass != null && patClass.equals(OUTPATIENT_APP))
			{
				PasEventVo pasEventVo = new PasEventVo(); 
				fillPasEventFromEVN((EVN) msg.get("EVN"), pasEventVo, null);
				fillPasEventFromPV1(pv1, pasEventVo, getOrgLoc(), getHcpAdmin(),providerSystem);
				pasEventVo.setPatient(patVo);
			    OutPatientAttendanceVo attVo = getADT().getOutpatientAppointment(pasEventVo);
			    if (attVo == null)
			    {
			    	// wdev-2858 This could be an appointment re-arrange (CCO) so we will try to get an appointment
					// by the third and fourth components.  The new eventId will be set later in fillAttFromMsg
					String oldEventId = pv1.getVisitNumber().getComponent(2) + "_" + pv1.getVisitNumber().getAssigningAuthority().getNamespaceID();
					if (!oldEventId.equals("_") && !oldEventId.equals("null_null"))
					{
						pasEventVo.setPasEventId(oldEventId);
						attVo = getADT().getOutpatientAppointment(pasEventVo);
					}
					if (attVo == null)
						attVo = new OutPatientAttendanceVo();
			    }
				
				attVo = fillAttFromMsg(attVo, msg, getOrgLoc(), getHcpAdmin(),providerSystem);
				attVo.getPasEvent().setPatient(patVo);  // wdev-7445
				// Force the update of the attend date by taking it from PV1.44
				if (pv1.getAdmitDateTime().getTimeOfAnEvent() != null && pv1.getAdmitDateTime().getTimeOfAnEvent().getValue() != null)
				{
					attVo.getPasEvent().setEventDateTime(new DateTime(pv1.getAdmitDateTime().getTimeOfAnEvent().getValue()));					
				}				
			
				// WDEV-13455 - Check if a disposal code was supplied
				// as the Attendance could have been marked as OnHold (DH) or DNA (DA)
				// if so, set the appointment status appropriately
				String disposal = pv1.getDischargeDisposition().getValue();
				if (disposal != null && !disposal.equals(""))
				{
					if (disposal.equals("DH"))  // On Hold
						attVo.setAppointmentStatus(Status_Reason.SUSPENDED);
					else if (disposal.equals("DA"))  // DNA
						attVo.setAppointmentStatus(Status_Reason.DNA);
				}
				
				// WDEV-13455 
				// For Patient Diary, send the recording user which is sent in EVN-5
				EVN evn = (EVN) msg.get("EVN");
				// WDEV-15884 Check not null!
				if (evn != null && evn.getOperatorID() != null && evn.getOperatorID().length > 0)
					attVo.setRecordingUser(evn.getOperatorID()[0].getIDNumber().getValue());
				
				
				String[] errs = attVo.validate();
				if (errs != null)
				{
					throw new HL7Exception("Validation of Outpatient Attendance failed. " + VoMapper.toDisplayString(errs));				
				}
				patVo.validate();
				
				//WDEV-10231
				CareContextInterfaceVo voCareContext = null;
				if(ConfigFlag.HL7.INSTANTIATE_EPISODE_FROM_ADT.getValue())
				{
					if(attVo != null && attVo.getPasEventIsNotNull())
					{
						voCareContext = getADT().getCareContextByPasEvent(attVo.getPasEvent());
						if(voCareContext != null)
						{
							// WDEV-13901 may need to create the history record
							// check if history records required for CC and EpisodeOfCare 
							voCareContext = createHistoryCareContextAndEpis(voCareContext, true, pv1, providerSystem.getCodeSystem().getText());

							voCareContext.setStartDateTime(attVo.getPasEvent().getEventDateTime());
							voCareContext.setResponsibleHCP(attVo.getPasEvent().getConsultant());
						}
					}
				}
				
				getADT().recordOPAttendance(patVo, attVo, voCareContext);
			}
			
			
			else if (patClass != null && patClass.equals(INPATIENT_APP))
			{
				DischargedEpisodeVo dischVo=null;
				InpatientEpisodeVo episVo = getADT().getCurrentAdmissionRecord(patVo);
				if (episVo == null)
				{
					// This might be a discharged inpatient record being updated!  Need to check this too
					PasEventVo pe = new PasEventVo();
					dischVo = new DischargedEpisodeVo();
					pe.setPasEventId(pv1.getVisitNumber().getID().getValue() + "_" + pv1.getVisitNumber().getComponent(1));
					dischVo.setPasEvent(pe);
					dischVo = getADT().getCurrentDischarge(patVo, dischVo);
					if (dischVo == null)  // No discharge found either, create Inpatient
						episVo = new InpatientEpisodeVo();
				}
				
				if (dischVo != null)
					updateDischargeDetails(patVo, dischVo, msg, pv1,providerSystem);
				else
					updateInpatientDetails(patVo, episVo, msg, pv1,providerSystem);

			}
			
		}
		
		
		catch (Exception ex)
		{
			ex.printStackTrace();
			//WDEV-20112
//			return HL7Utils.buildRejAck( msg.get("MSH"), "Exception: " + ex.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems()));
			response.setMessage(HL7Utils.buildRejAck(msg.get("MSH"), "Exception in A08: " + ex.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems()))); //http://jira/browse/WDEV-22946
			return response; //WDEV-20112
		}
		

		//WDEV-20112
//		Message ack = HL7Utils.buildPosAck( msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems()));
//		return ack;
		response.setMessage(HL7Utils.buildPosAck( msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems())));
		return response; //WDEV-20112
	}
	
	
	private void updateInpatientDetails(Patient patVo, InpatientEpisodeVo episVo, Message msg, PV1 pv1,ProviderSystemVo providerSystem) throws Exception
	{
		// wdev-12588  Hold on to previous PasEvent, as if location changed, we have to set bed number to null
		// we may also have to update the EpisodeOfCare hcp, start date etc..
		PasEventVo originalPE = (PasEventVo) episVo.getPasEvent().clone();
		
		fillEpisFromMsg(episVo, msg, getOrgLoc(), getHcpAdmin(),providerSystem);
		
		//Force the update of the admission date by taking it from PV1.44
		if (pv1.getAdmitDateTime().getTimeOfAnEvent() != null && pv1.getAdmitDateTime().getTimeOfAnEvent().getValue() != null)
		{
			episVo.getPasEvent().setEventDateTime(new DateTime(pv1.getAdmitDateTime().getTimeOfAnEvent().getValue()));					
		}		
		
		episVo.getPasEvent().setPatient(patVo);
		String[] errs = episVo.validate();
		if (errs != null)
		{
			throw new HL7Exception("Validation of Admission failed. " + VoMapper.toDisplayString(errs));				
		}
		
		//WDEV-10231
		CareContextInterfaceVo voCareContext = null;
		if(ConfigFlag.HL7.INSTANTIATE_EPISODE_FROM_ADT.getValue() || ConfigFlag.HL7.INPATIENT_EPISODE_MANAGEMENT_FROM_PAS.getValue())
		{
			if(episVo != null && episVo.getPasEventIsNotNull())
			{
				voCareContext = getADT().getCareContextByPasEvent(episVo.getPasEvent());
				if(voCareContext != null)
				{
					// WDEV-13901 may need to create the history record
					// check if history records required for CC and EpisodeOfCare 
					voCareContext = createHistoryCareContextAndEpis(voCareContext, true, pv1, providerSystem.getCodeSystem().getText());

					voCareContext.setStartDateTime(episVo.getPasEvent().getEventDateTime());
					voCareContext.setResponsibleHCP(episVo.getPasEvent().getConsultant());

					// wdev-12588
					voCareContext.setEstimatedDischargeDate(episVo.getEstDischargeDate().getDate());
					voCareContext.getEpisodeOfCare().setStartDate(episVo.getPasEvent().getEventDateTime().getDate());
					voCareContext.getEpisodeOfCare().setResponsibleHCP(episVo.getPasEvent().getConsultant());
					voCareContext.getEpisodeOfCare().getCareSpell().setStartDate(episVo.getPasEvent().getEventDateTime().getDate());				
					
					//WDEV-20278
//					LocSiteShortVo loc = orgLoc.getLocSiteShortByTaxonomyType(pv1.getAssignedPatientLocation().getBuilding().getValue(), TaxonomyType.PAS);
					LocSiteShortVo loc = orgLoc.getLocSiteShortByTaxonomyType(pv1.getAssignedPatientLocation().getBuilding().getValue(), providerSystem.getCodeSystem()); //WDEV-20278
					LocSiteRefVo orderingHospRef = new LocSiteRefVo();
					if (loc!=null)
					{
						orderingHospRef.setID_Location(loc.getBoId());
						voCareContext.setOrderingHospital(orderingHospRef);
					}
					
					// wdev-12588 If location changes, we need to set the carecontext bed number to null
					if (episVo.getPasEventIsNotNull() && episVo.getPasEvent().getLocationIsNotNull() &&
							originalPE != null && originalPE.getLocationIsNotNull() && !originalPE.getLocation().equals(episVo.getPasEvent().getLocation()))
					{
						voCareContext.setBedNumber(null);
					}
					
					//specialty in episode of care
					if(voCareContext.getEpisodeOfCareIsNotNull() && providerSystem != null &&  providerSystem.getCodeSystemIsNotNull())
					{
						voCareContext.getEpisodeOfCare().setSpecialty((Specialty) svc.getLocalLookup(Specialty.class, Specialty.TYPE_ID, providerSystem.getCodeSystem().getText(), pv1.getHospitalService().getValue()));
						if (!voCareContext.getEpisodeOfCare().getSpecialtyIsNotNull())
						{
							throw new HL7Exception("Specialty not found with mapping value = " + pv1.getHospitalService().getValue());
						}
					}
				}
			}
		}
		
		getADT().updateInpatient(episVo, voCareContext);
	}

	private void updateDischargeDetails(Patient patVo, DischargedEpisodeVo dischVo, Message msg, PV1 pv1,ProviderSystemVo providerSystem) throws Exception
	{
		fillDischargeFromMsg(dischVo, msg, getOrgLoc(), getHcpAdmin(),providerSystem);
		
		dischVo.getPasEvent().setPatient(patVo);
		String[] errs = dischVo.validate();
		if (errs != null)
		{
			throw new HL7Exception("Validation of Admission failed. " + VoMapper.toDisplayString(errs));				
		}
		
		// wdev-8924 - Validate Patient too
		errs = patVo.validate();
		if (errs != null)
		{
			throw new HL7Exception("Validation of Patient failed. " + VoMapper.toDisplayString(errs));				
		}
		
		//WDEV-10231
		CareContextInterfaceVo voCareContext = null;
		if(ConfigFlag.HL7.INSTANTIATE_EPISODE_FROM_ADT.getValue() || ConfigFlag.HL7.INPATIENT_EPISODE_MANAGEMENT_FROM_PAS.getValue())
		{
			if(dischVo != null && dischVo.getPasEventIsNotNull())
			{
				voCareContext = getADT().getCareContextByPasEvent(dischVo.getPasEvent());
				if(voCareContext != null)
				{
					// WDEV-13901 may need to create the history record
					// check if history records required for CC and EpisodeOfCare 
					voCareContext = createHistoryCareContextAndEpis(voCareContext, true, pv1, providerSystem.getCodeSystem().getText());

					voCareContext.setEndDateTime(dischVo.getPasEvent().getEventDateTime());
					voCareContext.setResponsibleHCP(dischVo.getPasEvent().getConsultant());
					voCareContext.getEpisodeOfCare().setResponsibleHCP(dischVo.getPasEvent().getConsultant());
					if(voCareContext.getEpisodeOfCareIsNotNull() && providerSystem != null &&  providerSystem.getCodeSystemIsNotNull())
						voCareContext.getEpisodeOfCare().setSpecialty((Specialty) svc.getLocalLookup(Specialty.class, Specialty.TYPE_ID, providerSystem.getCodeSystem().getText(), pv1.getHospitalService().getValue()));

					if (pv1.getAdmitDateTime().getTimeOfAnEvent() != null && pv1.getAdmitDateTime().getTimeOfAnEvent().getValue() != null)
					{
						Date newStartDate = new Date(pv1.getAdmitDateTime().getTimeOfAnEvent().getValue().substring(0,8), DateFormat.ISO);
						voCareContext.setStartDateTime(new DateTime(pv1.getAdmitDateTime().getTimeOfAnEvent().getValue()));
						voCareContext.getEpisodeOfCare().setStartDate(newStartDate);
						voCareContext.getEpisodeOfCare().getCareSpell().setStartDate(newStartDate);
					}				

				}
			}
		}
	
		getADT().dischargePatient(patVo, dischVo, voCareContext);	
	}

	public Message populateMessage()
	{
		// Not required for inbound messages
		return null;
	}

	
	//WDEV-19704
	public Message populateADT_A08For1stApptMessage(IHL7OutboundMessageHandler event) throws Exception
	{
		LOG.debug("A08VoMapper populateADT_A08For1stApptMessage: entry");

		a01Vomapper = (A01VoMapper)HL7EngineApplication.getVoMapper(EvnCodes.A01);

		if(a01Vomapper==null)
		{
			throw new HL7Exception("A08 mapper requires A01 mapper. A01 mapper not found in list of registered mappers.");			
		}

		ADT_A01 message = new ADT_A01();
		Patient patient=null;
		PV1 pv1 = message.getPV1();
		PV2 pv2 = message.getPV2();
		AppointmentMessageQueueVo apptVo = (AppointmentMessageQueueVo)event;

		ifOutBookingAppointmentVo apptDetails = adt.getBookingAppointmentDetails(apptVo);
		
		CatsReferralVo catsReferral = apptDetails.getCatsReferral();
		
		// Only need to create an A08 if the appointment is the 'first appointment'
		if(catsReferral.getConsultationAppt() != null
				&& catsReferral.getConsultationAppt().getID_Booking_Appointment() != null
				&& catsReferral.getConsultationAppt().getID_Booking_Appointment() != apptDetails.getID_Booking_Appointment())
		{
			message = null;
		}
		else
		{
			LOG.debug("A05VoMapper populateADT_A08For1stApptMessage: entry");
			a01Vomapper = (A01VoMapper)HL7EngineApplication.getVoMapper(EvnCodes.A01);
			if(a01Vomapper==null)
			{
				throw new HL7Exception("A08 mapper requires A01 mapper. A01 mapper not found in list of registered mappers.");			
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
			
			//PV1-7 Attending doctor (XCN) ?????????????????????????????????
			if(catsReferral.getReferralDetails() != null
					&& catsReferral.getReferralDetails().getGPName() != null)
			{
//				renderGpLiteVoToXCN(catsReferral.getReferralDetails().getGPName(), pv1.getAttendingDoctor(0), event.getProviderSystem());
				//WDEV-21000
				if (ConfigFlag.HL7.USE_CONFIGURED_TAXONOMYTYPES_FOR_XCN.getValue())
				{
					renderGpLiteVoToAttendingDoctor(catsReferral.getReferralDetails().getGPName(), pv1, event.getProviderSystem());
				}
				else
				{
					renderGpLiteVoToXCN(catsReferral.getReferralDetails().getGPName(), pv1.getAttendingDoctor(0), event.getProviderSystem());
				}
			}		
			
			//PV1-8 Referring doctor (XCN)
			// Can be either:
			// 	**** 1. Referring GP
			// 	**** 2. Referring consultant
			// 	**** 3. Allied health professional
			if(catsReferral.getReferralDetails() != null
					&& catsReferral.getReferralDetails().getGPName() != null 
					&& catsReferral.getReferralDetails().getReferrerType() != null
					&& catsReferral.getReferralDetails().getReferrerType().equals(SourceOfReferral.GP))
			{
				//WDEV-2100
//				renderGpLiteVoToXCN(catsReferral.getReferralDetails().getGPName(), pv1.getReferringDoctor(0), event.getProviderSystem());
				//WDEV-21000
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
					&& catsReferral.getReferralDetails().getReferrerType() != null
					&& catsReferral.getReferralDetails().getReferrerType().equals(SourceOfReferral.CONSULTANT))
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
					&& catsReferral.getReferralDetails().getReferrerType() != null
					&& catsReferral.getReferralDetails().getReferrerType().equals(SourceOfReferral.AHP))
			{
				pv1.getReferringDoctor(0).getFamilyName().getOwnSurname().setValue(catsReferral.getReferralDetails().getAlliedHealthProfName());
			}
			
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
			if(apptDetails.getMaximsApptId() != null
					&& (apptDetails.getApptStatus().equals(AppointmentStatus.OPEN) || apptDetails.getApptStatus().equals(AppointmentStatus.REBOOKED)))
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
		
			//PV2-13 Referral source code (XCN)
			if(apptDetails.getPracticeCode() != null
					//WDEV-20046
					&& catsReferral != null
					&& catsReferral.getConsultationAppt() != null
					&& catsReferral.getConsultationAppt().getApptStatus() != null
					//WDEV-20046
					&& (catsReferral.getConsultationAppt().getApptStatus().equals(AppointmentStatus.REBOOKED) || catsReferral.getConsultationAppt().getApptStatus().equals(AppointmentStatus.OPEN))
					&& apptDetails.getPracticeCode().length() > 0)
			{
				pv2.getReferralSourceCode(0).getSecondAndFurtherGivenNamesOrInitialsThereof().setValue(apptDetails.getPracticeCode());
			}

			//PV2-23 Clinic organization name (XON)

			// EVN-2 Record date/time (TS)
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
//				//WDEV-20335
//				Boolean isConfidential = patient.getIsConfidential();
//	
//				//WDEV-20336
//				int NK1Iteration = 0;
//				
//				if(patient.getPDSrelativesIsNotNull())
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
				
				if(event.getProviderSystem().getConfigurationProperty("PreAdmitADTOnFirstAppointment") != null
						&& event.getProviderSystem().getConfigurationProperty("PreAdmitADTOnFirstAppointment").getPropertyValue() != null
						&& event.getProviderSystem().getConfigurationProperty("PreAdmitADTOnFirstAppointment").getPropertyValue().equalsIgnoreCase("FALSE"))
				{
					pd1.getPatientPrimaryFacility(0).getAssigningAuthority().getNamespaceID().setValue("");
				}
			
			}

			populateMSH( event.getProviderSystem(),  message.getMSH(),Long.toString( new java.util.Date().getTime()),"ADT","A08");
			message.getEVN().getEventTypeCode().setValue("A08");
	
			//WDEV-22918
			// EVN-2 Recorded date/time (TS)
			if (apptDetails.getSystemInfo() != null)
			{
				if (apptDetails.getSystemInfo().getLastupdateDateTime() != null)
				{
					message.getEVN().getRecordedDateTime().getTimeOfAnEvent().setValue(apptDetails.getSystemInfo().getLastupdateDateTime().toString(DateTimeFormat.ISO));
				}
				else if (apptDetails.getSystemInfo().getCreationDateTime() != null)
				{
					message.getEVN().getRecordedDateTime().getTimeOfAnEvent().setValue(apptDetails.getSystemInfo().getCreationDateTime().toString(DateTimeFormat.ISO));
				}
			}//WDEV-22918
			
			//WDEV-22831
			// EVN-4 Event Reason Code (IS)
			message.getEVN().getEventReasonCode().setValue(svc.getRemoteLookup(MsgUpdateType.PREADMISSION.getID(), event.getProviderSystem().getCodeSystem().getText())); //WDEV-22831 


			LOG.debug("A08VoMapper populateADT_A08For1stApptMessage: exit");
		}
		return message;
	}

}
