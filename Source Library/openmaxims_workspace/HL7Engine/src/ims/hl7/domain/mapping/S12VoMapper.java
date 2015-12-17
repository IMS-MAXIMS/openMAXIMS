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
import org.joda.time.LocalTime;
import org.joda.time.Period;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;

import ims.configuration.gen.ConfigFlag;
import ims.core.vo.MemberOfStaffShortVo;
import ims.core.vo.Patient;
import ims.core.vo.TaxonomyMap;
import ims.core.vo.lookups.ISOUnit;
import ims.core.vo.lookups.TaxonomyType;
import ims.domain.exceptions.StaleObjectException;
import ims.dtomove.vo.RadioTherapySchedQueueVo;
import ims.dtomove.vo.ifApptDetailsVo;
import ims.framework.utils.TimeFormat;
import ims.hl7.domain.EventResponse;
import ims.hl7.utils.HL7Errors;
import ims.hl7.utils.HL7Utils;
import ims.ocrr.vo.ProviderSystemVo;
import ims.scheduling.vo.AppointmentMessageQueueVo;
import ims.scheduling.vo.ifOutBookingAppointmentVo;
import ims.vo.interfaces.IHL7OutboundMessageHandler;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v24.datatype.XCN;
import ca.uhn.hl7v2.model.v24.message.SIU_S12;
import ca.uhn.hl7v2.model.v24.segment.AIL;
import ca.uhn.hl7v2.model.v24.segment.AIP;
import ca.uhn.hl7v2.model.v24.segment.AIS;
import ca.uhn.hl7v2.model.v24.segment.PD1;
import ca.uhn.hl7v2.model.v24.segment.PID;
import ca.uhn.hl7v2.model.v24.segment.PV1;
import ca.uhn.hl7v2.model.v24.segment.RGS;
import ca.uhn.hl7v2.model.v24.segment.SCH;

public class S12VoMapper extends VoMapper 
{
	private static final Logger	LOG	= Logger.getLogger(S12VoMapper.class);

	@Override
	public Message populateMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	//WDEV-20112
//	public Message processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	public EventResponse processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception //WDEV-20112
	{ 
		EventResponse response = new EventResponse();
		
		PID pid = null;
		pid = (PID) msg.get("PID");
		Patient patVo = getPrimaryIdFromPid(pid, providerSystem);
		try
		{
			Patient patVo2 = getDemog().getPatient(patVo);
			response.setPatient(patVo2);
		}
		catch (StaleObjectException e)
		{
			response.setMessage(HL7Utils.buildRejAck(msg.get("MSH"), "Exception: " + e.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems())));
			return response;
		}
		response.setMessage(HL7Utils.buildRejAck(msg.get("MSH"), "Exception: Inbound S12 message types not currently processed by application!", HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems())));
		return response; //WDEV-20112	
	}

	public Message populateMessage(IHL7OutboundMessageHandler event)  throws Exception

	{		
		LOG.debug("S12VoMapper populateMessage: entry");
		AppointmentMessageQueueVo apptVo = null;
		RadioTherapySchedQueueVo radiotherapyVo = null; //WDEV-19160

		if (event instanceof AppointmentMessageQueueVo )
		{
			apptVo = (AppointmentMessageQueueVo)event;
			ifOutBookingAppointmentVo apptDetails = adt.getBookingAppointmentDetails(apptVo);
			SIU_S12 message = new SIU_S12();
			SCH sch = message.getSCH();
			PID pid = message.getSIU_S12_PIDPD1PV1PV2OBXDG1().getPID();
			PD1 pd1 = message.getSIU_S12_PIDPD1PV1PV2OBXDG1().getPD1();
			RGS rgs = message.getSIU_S12_RGSAISNTEAIGNTEAILNTEAIPNTE().getRGS();
			AIL ail = message.getSIU_S12_RGSAISNTEAIGNTEAILNTEAIPNTE().getSIU_S12_AILNTE().getAIL();
//			AIP aip = message.getSIU_S12_RGSAISNTEAIGNTEAILNTEAIPNTE().getSIU_S12_AIPNTE().getAIP(); //WDEV-21000
			AIS ais = message.getSIU_S12_RGSAISNTEAIGNTEAILNTEAIPNTE().getSIU_S12_AISNTE().getAIS();

			sch.getPlacerAppointmentID().getEntityIdentifier().setValue(apptDetails.getUBRN());

			// http://jira/browse/WDEV-20658
			// If externally provided appointment ID is defined, use this string value for SCH-2
			// else use the Maxims provided ID
//			sch.getFillerAppointmentID().getEntityIdentifier().setValue(apptDetails.getMaximsApptId());
			if (apptDetails.getExternalID() != null)
			{
				sch.getFillerAppointmentID().getEntityIdentifier().setValue(apptDetails.getExternalID());
			} 
			else
			{
				sch.getFillerAppointmentID().getEntityIdentifier().setValue(apptDetails.getMaximsApptId());
			} //WDEV-20658

			sch.getScheduleID().getIdentifier().setValue(apptDetails.getUSRN());

			if(apptVo.getMsgType()!=null)
			{
				String eventReason = svc.getRemoteLookup(apptVo.getMsgType().getId(), apptVo.getProviderSystem().getCodeSystem().getText());
				if(eventReason!=null)
					sch.getEventReason().getIdentifier().setValue(eventReason);
			}
			sch.getAppointmentType().getIdentifier().setValue(apptDetails.getActivityCode());

			LocalTime apptStart =  LocalTime.parse(apptDetails.getApptStart());
			LocalTime apptEnd = LocalTime.parse(apptDetails.getApptEnd());

			Period period= new Period(apptStart,apptEnd);
			long duration = period.toStandardDuration().getStandardMinutes();
			sch.getAppointmentDuration().setValue(""+duration);
			sch.getAppointmentTimingQuantity(0).getDuration().setValue(""+duration); //WDEV-210001
			ail.getDuration().setValue(""+duration);
			ais.getDuration().setValue(""+duration);
//			aip.getDuration().setValue(""+duration); //WDEV-21000
			String minuteCode = svc.getRemoteLookup(ISOUnit.MINUTE.getId(), apptVo.getProviderSystem().getCodeSystem().getText());
			if(minuteCode!=null)
			{
				sch.getAppointmentDurationUnits().getIdentifier().setValue(minuteCode);
				ail.getDurationUnits().getIdentifier().setValue(minuteCode);
				ais.getDurationUnits().getIdentifier().setValue(minuteCode);
//				aip.getDurationUnits().getIdentifier().setValue(minuteCode); //WDEV-21000
			}
			String apptDate=null;
			if(apptDetails.getApptDate()!=null)
				apptDate=apptDetails.getApptDate().toString(ims.framework.utils.DateFormat.ISO);

			String apptTime=null;
			if(apptDetails.getApptStartTime()!=null)
				apptTime=apptDetails.getApptStartTime().toString(TimeFormat.FLAT6);
			String apptDateTime=null;
			if (apptDate!=null)
				apptDateTime=apptDate;
			if(apptTime!=null)
				apptDateTime+=apptTime;
			if(apptDateTime!=null)
			{
				sch.getAppointmentTimingQuantity(0).getStartDateTime().getTimeOfAnEvent().setValue(apptDateTime);
				ail.getStartDateTime().getTimeOfAnEvent().setValue(apptDateTime);
				ais.getStartDateTime().getTimeOfAnEvent().setValue(apptDateTime);
//				aip.getStartDateTime().getTimeOfAnEvent().setValue(apptDateTime); //WDEV-21000
			}

			//WDEV-21002
			String apptEndTime = null;
			if(apptDetails.getApptEndTime() != null)
				apptEndTime = apptDetails.getApptEndTime().toString(TimeFormat.FLAT6);
			String apptEndDateTime = null;
			if (apptDate != null)
				apptEndDateTime = apptDate;
			if(apptEndTime != null)
				apptEndDateTime += apptEndTime;
			if(apptEndDateTime != null)
			{
				sch.getAppointmentTimingQuantity(0).getEndDateTime().getTimeOfAnEvent().setValue(apptEndDateTime);
			} //WDEV-21002
			
			sch.getAppointmentTimingQuantity(0).getPriority().setValue(apptDetails.getPriority());
			//WDEV-21000
//			renderGpShortVoToXCN(apptDetails.getGP(), sch.getPlacerContactPerson(0), event.getProviderSystem());
			if (ConfigFlag.HL7.USE_CONFIGURED_TAXONOMYTYPES_FOR_XCN.getValue())
			{
				renderGpShortVoToPlacerContactPerson(apptDetails.getGP(), sch, event.getProviderSystem());
			}
			else
			{
				renderGpShortVoToXCN(apptDetails.getGP(), sch.getPlacerContactPerson(0), event.getProviderSystem());
			}

			renderAddressVoToXAD(apptDetails.getPracticeAddress(), sch.getPlacerContactAddress(0), apptVo.getProviderSystem());  

			renderCommChannelVoToXTN(apptDetails.getPracticeWorkNumber(), sch.getPlacerContactPhoneNumber());

			sch.getPlacerContactLocation().getPointOfCare().setValue(apptDetails.getPracticeCode());

			rgs.getSetIDRGS().setValue("1");
			ail.getSetIDAIL().setValue("1");
			ail.getLocationResourceID().getLocationDescription().setValue(apptDetails.getProfileName());
			ail.getLocationResourceID().getPointOfCare().setValue(apptDetails.getLocationCode());
			ail.getLocationResourceID().getFacility().getNamespaceID().setValue(apptDetails.getFacilityCode());
			ail.getLocationTypeAIL().getIdentifier().setValue(apptDetails.getLocationTypeCode());

			//WDEV-21000
//			aip.getSetIDAIP().setValue("1");
//			String mosType=null;
//			if(apptDetails.getMos()!=null)
//			{
//				for (int i=0;i<apptDetails.getMos().size();i++)
//				{
//					renderMemberOfStaffShortVoToXCNX(apptDetails.getMos().get(i), aip, apptVo.getProviderSystem());
//
//					if(apptDetails.getMos().get(i).getStaffType()!=null)
//					{
//						mosType=svc.getRemoteLookup(apptDetails.getMos().get(i).getStaffType().getID(), apptVo.getProviderSystem().getCodeSystem().getText());
//					}
//				}
//			}
//			if(mosType!=null)
//				aip.getResourceRole().getIdentifier().setValue(mosType);

			
			ais.getSetIDAIS().setValue("1");
			ais.getUniversalServiceIdentifier().getIdentifier().setValue(apptDetails.getServiceCode());
			ais.getPlacerSupplementalServiceInformation(0).getIdentifier().setValue(apptDetails.getDoSId());
			ais.getPlacerSupplementalServiceInformation(0).getText().setValue(apptDetails.getDoSName());

			populateMSH( event.getProviderSystem(),  message.getMSH(),Long.toString( new java.util.Date().getTime()),"SIU","S12");
			renderPatientVoToPID(apptDetails.getPatient(),pid,event.getProviderSystem());
			//WDEV-20993
//			renderGPDetailsToPD1(apptDetails.getPatient(),pd1);
			renderGPDetailsToPD1(apptDetails.getPatient(), pd1, event.getProviderSystem());
			
			
			//WDEV-21000
			/*
			 * Construct AIP segment(s)
			 * 
			 * It is possible that more than one MemberOfStaff is linked to seesion (List oweners)
			 * Therefore it is necessary to have an AIP for each MemberOfStaff
			 * 
			 */
			
			int AIPIteration = 0;
			if (apptDetails.getMos() != null)
			{
				for (int i=0; i< apptDetails.getMos().size(); i++)
				{
					if (apptDetails.getMos().get(i) != null)
					{
						AIP aip = message.getSIU_S12_RGSAISNTEAIGNTEAILNTEAIPNTE().getSIU_S12_AIPNTE(AIPIteration).getAIP();
			
						//AIP.1 Set ID (SI)
						String setID = Integer.toString(AIPIteration + 1);
						aip.getSetIDAIP().setValue(setID);
						
						//AIP.3 Personnel recource ID (XCN)
						if (ConfigFlag.HL7.USE_CONFIGURED_TAXONOMYTYPES_FOR_XCN.getValue())
						{
							renderMemberOfStaffShortVoToPersonnelResourceID(apptDetails.getMos().get(i), aip, event.getProviderSystem());
						}
						else
						{
							/* Note that this method doesn't really work properly!
							 * It overwrites a single AIP segment with each apptDetails.getMos().get(i)
							 * that has a code mapping defined! It is included for backwards compatability.
							 */
							renderMemberOfStaffShortVoToXCNX(apptDetails.getMos().get(i), aip, apptVo.getProviderSystem());
						}
			
						//AIP.4 Resource role (CE)
						String mosType = null;
						if (apptDetails.getMos().get(i).getStaffType() != null)
						{
							mosType = svc.getRemoteLookup(apptDetails.getMos().get(i).getStaffType().getID(), apptVo.getProviderSystem().getCodeSystem().getText());
							if (mosType != null)
							{
								aip.getResourceRole().getIdentifier().setValue(mosType);
							}
						}
						
						//AIP.6 Start date/time (TS)
						if (apptDateTime != null)
						{
							aip.getStartDateTime().getTimeOfAnEvent().setValue(apptDateTime);
						}
						
						//AIP.9 Duration (NM)
						aip.getDuration().setValue(""+duration);
						
						//AIP.10 Duration units (CE)
						if (minuteCode != null)
						{
							aip.getDurationUnits().getIdentifier().setValue(minuteCode);
						}
						
						AIPIteration ++;
	
					}
				}
			}

			return message;
		}

		
		
		
		
		//WDEV-19160 - Clatterbridge Varian interface
		else if (event instanceof RadioTherapySchedQueueVo)
		{
			radiotherapyVo = (RadioTherapySchedQueueVo)event;
			ifApptDetailsVo apptDetails = adt.getRadiotherapyApptDetails(radiotherapyVo);
			
			SIU_S12 message = new SIU_S12();
			SCH sch = message.getSCH();
			PID pid = message.getSIU_S12_PIDPD1PV1PV2OBXDG1().getPID();
			PD1 pd1 = message.getSIU_S12_PIDPD1PV1PV2OBXDG1().getPD1();
			PV1 pv1 = message.getSIU_S12_PIDPD1PV1PV2OBXDG1().getPV1();
			RGS rgs = message.getSIU_S12_RGSAISNTEAIGNTEAILNTEAIPNTE().getRGS();
			AIL ail = message.getSIU_S12_RGSAISNTEAIGNTEAILNTEAIPNTE().getSIU_S12_AILNTE().getAIL();
			AIP aip = message.getSIU_S12_RGSAISNTEAIGNTEAILNTEAIPNTE().getSIU_S12_AIPNTE().getAIP();
			AIS ais = message.getSIU_S12_RGSAISNTEAIGNTEAILNTEAIPNTE().getSIU_S12_AISNTE().getAIS();

			rgs.getSetIDRGS().setValue("1");
			ail.getSetIDAIL().setValue("1");
			ais.getSetIDAIS().setValue("1");
			aip.getSetIDAIP().setValue("1");
			pv1.getSetIDPV1().setValue("1");

			populateMSH( event.getProviderSystem(),  message.getMSH(),Long.toString( new java.util.Date().getTime()),"SIU","S12");

			
			// SCH-1 (Placer Appointment ID)
			if(radiotherapyVo.getAppointmentIDXIsNotNull())
			{
				String apptDetailsAppointmentID = (radiotherapyVo.getAppointment().getID_Appointment().toString() 
						+ "_" 
						+ radiotherapyVo.getAppointmentIDX());
				sch.getPlacerAppointmentID().getEntityIdentifier().setValue(apptDetailsAppointmentID);
			}
			
			
			// SCH-6 (Event reason)
			if(apptDetails.getApptStatusIsNotNull())
			{
				String statusCode = svc.getRemoteLookup(apptDetails.getApptStatus().getId(), radiotherapyVo.getProviderSystem().getCodeSystem().getText());
				sch.getEventReason().getIdentifier().setValue(statusCode);
			}

			
			//SCH-7 (Appointment reason)
			if(apptDetails.getActivityGroupNameIsNotNull())
			{
				sch.getAppointmentReason().getIdentifier().setValue(apptDetails.getActivityGroupName());
			}
				
				
			// SCH-8 (Appointment type)
			if(apptDetails.getActivityNameIsNotNull())
				{
					sch.getAppointmentType().getIdentifier().setValue(apptDetails.getActivityName());
				}
						

			// SCH-9 (Appointment duration)
			// AIL-9 (Duration)
			// AIS-7 (Duration)
			// AIP-9 (Duration)
			if(apptDetails.getApptStartIsNotNull() && apptDetails.getApptEndIsNotNull())
			{	
				// Appointment start and end times are strings. E.g. 93000 for 09:30 and 10000 for 10:00
				// Need to account for times that precede 10000 (10:00), as LocalTime.parse fails if string is wrong length (< 6)
				DateTimeFormatter hhmmss = new DateTimeFormatterBuilder()
				.appendHourOfDay(2)
				.appendMinuteOfHour(2)
				.appendSecondOfMinute(2)
				.toFormatter();

				LocalTime apptStart = null;
				LocalTime apptEnd = null;

				if(apptDetails.getApptStart().length()==5)
				{
					apptStart = LocalTime.parse("0"+apptDetails.getApptStart(),hhmmss);
				}
				else if(apptDetails.getApptStart().length()==6)
				{
					apptStart = LocalTime.parse(apptDetails.getApptStart(),hhmmss);
				}

				if(apptDetails.getApptEnd().length()==5)
				{
					apptEnd = LocalTime.parse("0"+apptDetails.getApptEnd(),hhmmss);
				}
				else if(apptDetails.getApptEnd().length()==6)
				{
					apptEnd = LocalTime.parse(apptDetails.getApptEnd(),hhmmss);
				}

				Period period = new Period(apptStart,apptEnd);

				long duration = period.toStandardDuration().getStandardMinutes();
				sch.getAppointmentDuration().setValue(""+duration);
				ail.getDuration().setValue(""+duration);
				ais.getDuration().setValue(""+duration);
				aip.getDuration().setValue(""+duration);
			}	

			
			// SCH-10 (Appointment duration units)
			// AIL-10 (Duration units)
			// AIS-8 (Duration units)
			// AIP-10 (Duration units)
			String minuteCode = svc.getRemoteLookup(ISOUnit.MINUTE.getId(), radiotherapyVo.getProviderSystem().getCodeSystem().getText());
			if(minuteCode!=null)
			{
				sch.getAppointmentDurationUnits().getIdentifier().setValue(minuteCode);
				ail.getDurationUnits().getIdentifier().setValue(minuteCode);
				ais.getDurationUnits().getIdentifier().setValue(minuteCode);
				aip.getDurationUnits().getIdentifier().setValue(minuteCode);
			}


			// SCH-11 (Appointment timing quantity)
			// AIL-6 (Start date/time)
			// AIS-4 (Start date/time)
			// AIP-6 (Start date/time)
			String apptDate=null;
			String apptTime=null;
			String apptDateTime=null;

			if(apptDetails.getApptDateIsNotNull())
				apptDate=apptDetails.getApptDate().toString(ims.framework.utils.DateFormat.ISO);

			if(apptDetails.getApptStartIsNotNull())
			{
				apptTime=apptDetails.getApptStart();
			}

			if(apptDetails.getStartTimeIsNotNull())
				apptTime=apptDetails.getStartTime().toString(TimeFormat.FLAT6);

			if (apptDate!=null)
				apptDateTime=apptDate;
			if(apptTime!=null)
				apptDateTime+=apptTime;
			
			if(apptDateTime!=null)
			{
				sch.getAppointmentTimingQuantity(0).getStartDateTime().getTimeOfAnEvent().setValue(apptDateTime);
				ail.getStartDateTime().getTimeOfAnEvent().setValue(apptDateTime);
				ais.getStartDateTime().getTimeOfAnEvent().setValue(apptDateTime);
				aip.getStartDateTime().getTimeOfAnEvent().setValue(apptDateTime);
			}

			
			// SCH-11-6 (Appointment timing quantity - priority 
			if(apptDetails.getPriorityIsNotNull())
			{
				sch.getAppointmentTimingQuantity(0).getPriority().setValue(apptDetails.getPriority().toString());
			}


			// SCH-12 (Placer Contact Person)
			if(apptDetails.getMosIsNotNull())
			{
				renderMemberOfStaffShortVoToXCN(apptDetails.getMos(), sch.getPlacerContactPerson(0), radiotherapyVo.getProviderSystem());
			}

			
			// AIL-3-1 (Location resource ID - point of care) 
			// PV1-3-1 (Assigned patient location - point of care
			// PV1-3-9 (assigned patient location - location description)
			if(apptDetails.getLocationNameIsNotNull())
			{
				ail.getLocationResourceID().getPointOfCare().setValue(apptDetails.getLocationName());
				pv1.getAssignedPatientLocation().getLocationDescription().setValue(apptDetails.getLocationName());
				pv1.getAssignedPatientLocation().getPointOfCare().setValue(apptDetails.getLocationName());
			}
			

			// AIL-3-4 (Location resource ID - facility)
			// PV1-3-4 (assigned patient location - facility)
			if(apptDetails.getFacilityNameIsNotNull())
			{
				ail.getLocationResourceID().getFacility().getNamespaceID().setValue(apptDetails.getFacilityName());
				pv1.getAssignedPatientLocation().getFacility().getNamespaceID().setValue(apptDetails.getFacilityName());
			}

			
			//AIL-3-9 (Location resource ID - location description)
			if(apptDetails.getProfileNameIsNotNull())
			{
				ail.getLocationResourceID().getLocationDescription().setValue(apptDetails.getProfileName());
			}


			// AIP-3 (Personnel Resource ID)
			if(apptDetails.getConsultantMosIsNotNull())
			{
				renderMemberOfStaffShortVoToXCN(apptDetails.getConsultantMos(), aip.getPersonnelResourceID(0)  , radiotherapyVo.getProviderSystem());
			}

			
			//AIS-3 (Universal service identifier)
			if(apptDetails.getMachineNameIsNotNull())
			{
				ais.getUniversalServiceIdentifier().getIdentifier().setValue(apptDetails.getMachineName());
			}


			// PID
			// PD1
			if(apptDetails.getPatientIsNotNull())
			{
				renderPatientVoToPID(apptDetails.getPatient(),pid,event.getProviderSystem());
				//WDEV-20993
//				renderGPDetailsToPD1(apptDetails.getPatient(),pd1);
				renderGPDetailsToPD1(apptDetails.getPatient(), pd1, event.getProviderSystem());
				renderPatientDetailsToPD1(apptDetails.getPatient(), pd1, event.getProviderSystem()); //WDEV-22624
			}
			
			
			// PV1-4 (Admission Type)
			if(apptDetails.getFirstApptIndicatorIsNotNull())
			{
				pv1.getAdmissionType().setValue(apptDetails.getFirstApptIndicator().toString());
			}
			
			
			// PV1-20 (Financial Class)
			if(apptDetails.getPatientStatusIsNotNull())
			{
				String statusCode = svc.getRemoteLookup(apptDetails.getPatientStatus().getId(), radiotherapyVo.getProviderSystem().getCodeSystem().getText());
				pv1.getFinancialClass(0).getFinancialClass().setValue(statusCode);
			}
			
			return message;

		}

		return null;

	}



	protected final void renderMemberOfStaffShortVoToXCNX(MemberOfStaffShortVo mos, AIP aip, ProviderSystemVo providerSystem) throws HL7Exception
	{
		
		//WDEV-21000 Following logic is wrong - replaced below.
		
//		int startPos=0;
//		
//		if (aip.getPersonnelResourceID().length > 0)
//		{
//			startPos = aip.getPersonnelResourceID().length-1;
//		}
//
//		if (mos.getCodeMappings() != null)
//		{
//			for (int i = 0; i < mos.getCodeMappings().size(); i++)
//			{
//				ims.core.vo.TaxonomyMap map = mos.getCodeMappings().get(i);
//				if (map.getTaxonomyName().equals(providerSystem.getCodeSystem()))
//				{
//					XCN xcnNew = aip.getPersonnelResourceID(startPos);
//					xcnNew.getGivenName().setValue(mos.getName().getForename());
//					xcnNew.getFamilyName().getSurname().setValue(mos.getName().getSurname());
//					xcnNew.getIDNumber().setValue(map.getTaxonomyCode());
//					//WDEV-21000
//					TaxonomyType taxonomyType = map.getTaxonomyName();
//					if (taxonomyType != null)
//					{
//						String taxTypeText = svc.getRemoteLookup(taxonomyType.getID(), providerSystem.getCodeSystem().getText());
//						if (taxTypeText != null)
//						{
//							xcnNew.getAssigningAuthority().getNamespaceID().setValue(map.getTaxonomyName().toString());
//						}
//					}
//					
//					startPos++;
//				}
//				
//			}
//		}
//	}

		LOG.debug("VoMapper renderMemberOfStaffShortVoToXCNX: entry");
	
		if (mos != null)
		{
			XCN xcn = aip.getPersonnelResourceID(0);

			TaxonomyMap mapping = mos.getExternalCode(TaxonomyType.NAT_CONS_CODE);
			if (!(mapping != null && mapping.getTaxonomyCode() != null))
			{
				mapping = mos.getExternalCode(providerSystem.getCodeSystem());
			}

			if (mapping != null && mapping.getTaxonomyCode() != null)
			{
				//XCN.0 ID Number (ST)
				xcn.getIDNumber().setValue(mapping.getTaxonomyCode());
			}

			if (mos.getNameIsNotNull())
			{
				//XCN.1 Family name (ST)
				if (mos.getName().getSurnameIsNotNull())
					xcn.getFamilyName().getSurname().setValue(mos.getName().getSurname().toString());
				//XCN.2 Given name (ST)
				if (mos.getName().getForenameIsNotNull())
					xcn.getGivenName().setValue(mos.getName().getForename().toString());
				//XCN.5 Prefix (ST)
				if(mos.getName().getTitleIsNotNull()) 
					xcn.getPrefixEgDR().setValue(svc.getRemoteLookup(mos.getName().getTitle().getID(), providerSystem.getCodeSystem().getText()));
			}
		}
	
		LOG.debug("VoMapper renderMemberOfStaffShortVoToXCNX: exit");

	}



}
	

