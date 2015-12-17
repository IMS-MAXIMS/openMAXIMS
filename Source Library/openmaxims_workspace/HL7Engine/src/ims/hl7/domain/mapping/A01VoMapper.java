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
import ims.admin.vo.InPatientADTFeedVo;
import ims.configuration.ConfigItems;
import ims.configuration.gen.ConfigFlag;
import ims.core.patient.vo.PatientRefVo;
import ims.core.vo.CareContextInterfaceVo;
import ims.core.vo.CareSpellVo;
import ims.core.vo.InpatientEpisodeVo;
import ims.core.vo.MemberOfStaffShortVo;
import ims.core.vo.PasEventVo;
import ims.core.vo.PatRelative;
import ims.core.vo.Patient;
import ims.core.vo.TaxonomyMap;
import ims.core.vo.ifInpatientEpisodeVo;
import ims.core.vo.lookups.MethodOfAdmission;
import ims.core.vo.lookups.SourceOfReferral;
import ims.domain.exceptions.StaleObjectException;
import ims.emergency.vo.ifEDAttendanceVo;
import ims.emergency.vo.ifInpatientADTVo;
import ims.framework.utils.DateFormat;
import ims.framework.utils.DateTime;
import ims.framework.utils.DateTimeFormat;
import ims.framework.utils.TimeFormat;
import ims.hl7.domain.EventResponse;
import ims.hl7.domain.HL7EngineApplication;
import ims.hl7.utils.EvnCodes;
import ims.hl7.utils.HL7Errors;
import ims.hl7.utils.HL7Utils;
import ims.hl7.vo.ifElectiveListMessageQueueVo;
import ims.ocrr.vo.ProviderSystemVo;
import ims.ocs_if.vo.InpatientEpisodeQueueVo;
import ims.vo.interfaces.IHL7OutboundMessageHandler;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v24.datatype.XCN;
import ca.uhn.hl7v2.model.v24.message.ADT_A01;
import ca.uhn.hl7v2.model.v24.segment.EVN;
import ca.uhn.hl7v2.model.v24.segment.NK1;
import ca.uhn.hl7v2.model.v24.segment.PD1;
import ca.uhn.hl7v2.model.v24.segment.PV1;
import ca.uhn.hl7v2.model.v24.segment.PV2;



public class A01VoMapper extends VoMapper
{
	private static final Logger			LOG		= Logger.getLogger(A01VoMapper.class);
	private A28VoMapper a28mapper;
	
	//WDEV-20112
//	public Message processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	public EventResponse processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception //WDEV-20112
	{
		a28mapper = (A28VoMapper) HL7EngineApplication.getVoMapper(EvnCodes.A28);
		if (a28mapper == null)
		{
			throw new HL7Exception("A01 mapper requires A28 mapper. A28 mapper not found in list of registerd mappers.");			
		}
		
		//WDEV-20112
	//	Message ack = processPatientAdmission(msg, providerSystem);
	//	return ack;
		//WDEV-20112
		EventResponse response = new EventResponse();
		response = processPatientAdmission(msg, providerSystem, response);
		return response; //WDEV-20112
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
		//EDAttendanceFeedVo edAttendance = null;
		Patient patient=null;
		PV1 pv = message.getPV1();
		
		if(event instanceof EDAttendanceFeedVo)
		{
//			edAttendance = (EDAttendanceFeedVo)event;
			ifEDAttendanceVo attendenceDetails= adt.getEDAttendanceDetails(event);
			patient=attendenceDetails.getPatient();
			//PV1-3
			renderPatientLocationToPV1(attendenceDetails.getRegistrationLocation(), null, null, pv, event.getProviderSystem());
			
			//PV1-2
			pv.getPatientClass().setValue("E");  // only mandatory item
			
			//PV1-10
			pv.getHospitalService().setValue("E");
			
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
			
			//PV2-3
			PV2 pv2=message.getPV2();
			if(attendenceDetails.getEmergencyEpisodeIsNotNull()&&attendenceDetails.getEmergencyEpisode().getPresentingComplaintIsNotNull())
			{
				pv2.getAdmitReason().getIdentifier().setValue(svc.getRemoteLookup(
						attendenceDetails.getEmergencyEpisode().getPresentingComplaint().getID(),event.getProviderSystem().getCodeSystem().getText()));
			}
		}
		else if (event instanceof InPatientADTFeedVo)
		{
			InPatientADTFeedVo feedVo = (InPatientADTFeedVo)event;
			ifInpatientADTVo details = adt.getPartialAdmissionDetails(feedVo);
			ifEDAttendanceVo attendenceDetails = details.getAttendance();
			patient = attendenceDetails.getPatient();
			
			//EVN-2 //Registration Date
			EVN evn = message.getEVN();
			if (attendenceDetails!=null)
				renderDateTimeVoToTS(attendenceDetails.getRegistrationDateTime(), evn.getRecordedDateTime());
			
			//PV1-19 Visit number (CX)
			//ED Attendance ID
			if (ConfigFlag.GEN.ED_USE_CUSTOM_ATTENDANCE_ID.getValue()
					&& attendenceDetails.getCustomIDIsNotNull())
			{
				pv.getVisitNumber().getID().setValue(attendenceDetails.getCustomID());
			}
			else if (attendenceDetails.getBoId() != null)
			{
				pv.getVisitNumber().getID().setValue(attendenceDetails.getBoId().toString());
			}
			
			//PV1-20  Financial class (FC)
			//Public or Private
			if (attendenceDetails.getPatientAttendanceStatusIsNotNull())
			{
				pv.getFinancialClass(0).getFinancialClass().setValue(svc.getRemoteLookup(attendenceDetails.getPatientAttendanceStatus().getID(), event.getProviderSystem().getCodeSystem().getText()));
			}
			
			//PV1-50 Alternate visit ID (CX)
			// Bed waiting ID
			if (details.getPartialAdmission() != null
					&& details.getPartialAdmission().getBoId() != null)
			{
				pv.getAlternateVisitID().getID().setValue(details.getPartialAdmission().getBoId().toString());
			}
			
			//PV1-2  Patient class (IS)
			// Episode type
			pv.getPatientClass().setValue("I");
			
			if (details.getPartialAdmissionIsNotNull())
			{
				//PV1-3 Assigned patient location (PL) 
				//Ward (IP) Outbound Virtual ward
				//renderPatientLocationToPV1(details.getPartialAdmission().getAllocatedWard(), null, null, pv, event.getProviderSystem());
				pv.getAssignedPatientLocation().getPointOfCare().setValue("ED");
				
				//PV1-10 Hosptial service (IS)
				//Speciality
				if (details.getPartialAdmission().getSpecialtyIsNotNull())
				{
					pv.getHospitalService().setValue(svc.getRemoteLookup(details.getPartialAdmission().getSpecialty().getID(), event.getProviderSystem().getCodeSystem().getText()));
				}

				//PV1-18 Patient type (IS)
				// Requested bed type
				if (details.getPartialAdmission().getAccomodationRequestedTypeIsNotNull())
				{
					pv.getPatientType().setValue(svc.getRemoteLookup(details.getPartialAdmission().getAccomodationRequestedType().getID(), event.getProviderSystem().getCodeSystem().getText()));
				}

				//PV1-9 Consulting doctor (XCN)
				//Consultant
				if (details.getPartialAdmission().getAdmittingConsultantIsNotNull()
						&& details.getPartialAdmission().getAdmittingConsultant().getMosIsNotNull())
				{
					renderMemberOfStaffShortVoToXCN(details.getPartialAdmission().getAdmittingConsultant().getMos(), pv.getConsultingDoctor(0), event.getProviderSystem());
				}
				
				//WDEV-23100
				//PV1-44 Admit date/time (TS)
				if (details.getPartialAdmission().getDecisionToAdmitDateTimeIsNotNull())
				{
					DateTime admitDateTime = details.getPartialAdmission().getDecisionToAdmitDateTime();
					renderDateTimeVoToTS(admitDateTime, pv.getAdmitDateTime(), DateTimeFormat.ISO);
				} //WDEV-23100
			}
		}
		
		
		//WDEV-19481
		else if(event instanceof InpatientEpisodeQueueVo)
		{
			
			PV2 pv2 = message.getPV2();
			
			InpatientEpisodeQueueVo feedVo = (InpatientEpisodeQueueVo)event;
			ifInpatientEpisodeVo inpatientEpisode = adt.getInpatientEpisodeDetails(feedVo);
			
			if(inpatientEpisode.getPatientIsNotNull())
				patient=inpatientEpisode.getPatient();
			
			populateBasicEpisodeData(event, inpatientEpisode, pv, pv2);
			
			//WDEV-22918
			// EVN-2 Recorded Date/Time (TS)
			if (inpatientEpisode.getAdmissionEventDateTime() != null)
			{
				renderDateTimeVoToTS(inpatientEpisode.getAdmissionEventDateTime(), message.getEVN().getRecordedDateTime());
			} //WDEV-22918
			
		}
		
		if(patient!=null)
		{						
			renderPatientVoToPID(patient, message.getPID(), event.getProviderSystem());
			NK1 nk1 = message.getNK1(0);
	
			//WDEV-22006 Comment out following code and replace by calling a single method
			
//			// http://jira/browse/WDEV-20335
//			Boolean isConfidential = patient.getIsConfidential();
//					
//			//WDEV-20336 Populate NK1 from PDSRelative object first. If object is Null then use Next of Kin VO
//			int NK1Iteration = 0;
//			
//			if(patient.getPDSrelativesIsNotNull()
//					&& patient.getPDSrelatives().size() > 0)
//			{
//				for (int i=0; i < patient.getPDSrelatives().size(); i++)
//				{
//					PatRelative patRelative = patient.getPDSrelatives().get(i);
//					renderPatRelativeVoToNK1(patRelative, nk1, event.getProviderSystem(), isConfidential);
//					NK1Iteration ++;
//				}
//			}
//			else
//			{
//				renderNextOfKinVoToNK1(patient.getNok(), nk1, event.getProviderSystem(), isConfidential);
//				NK1Iteration ++;
//			}//WDEV-20336
//			
//			// If config flag HL7_INCLUDE_FAMILY_SUPPORT  is true and 
//			// any support family network contact details exist, then add these as NK1 segments (within a loop)
//			// renderSupportNetworkFamilyVoToNK1(SupportNetworkFamily snfVo, NK1 nk1,ProviderSystemVo providerSystem)
//			
//			if(patient.getSupportNetworkFamilyIsNotNull() && ConfigFlag.HL7.HL7_INCLUDE_FAMILY_SUPPORT.getValue())
//			{
//				
//				for (int i=0; i<patient.getSupportNetworkFamily().size(); i++)
//				{
//					NK1 sfn = message.getNK1(NK1Iteration);
//					if(patient.getSupportNetworkFamily().get(i).getInactivatingDateTime()==null)
//					{
//						//WDEV-20335
//						renderSupportNetworkFamilyVoToNK1(patient.getSupportNetworkFamily().get(i), sfn, event.getProviderSystem(), isConfidential); //WDEV-20335
//						NK1Iteration++;
//					}
//				}
//			}
			
			renderPatientVoToNK1(patient, message, event.getProviderSystem());
			//WDEV-22006
			
			PD1 pd1=message.getPD1();
			//WDEV-20993
//			renderGPDetailsToPD1(patient,pd1);			
			renderGPDetailsToPD1(patient, pd1, event.getProviderSystem());
			//WDEV-22624
			renderPatientDetailsToPD1(patient, pd1, event.getProviderSystem()); //WDEV-22624
			
			
		}
		
		populateMSH( event.getProviderSystem(),  message.getMSH(),Long.toString( new java.util.Date().getTime()),"ADT","A01");
		message.getEVN().getEventTypeCode().setValue("A01");

		return message;
	}

	//WDEV-20112
//	private Message processPatientAdmission(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	private EventResponse processPatientAdmission(Message msg, ProviderSystemVo providerSystem, EventResponse response) throws HL7Exception //WDEV-20112
	{
		Patient patVo;
	
		PV1 pv = (PV1)msg.get("PV1");
		String visitId=pv.getVisitNumber().getID().getValue() + "_" + pv.getVisitNumber().getComponent(1);
		PasEventVo pas=new PasEventVo();
		PasEventVo pasEventResult=new PasEventVo();
		
		try
		{
			patVo = savePatient(msg, providerSystem);
			//WDEV-20112
			response.setPatient(patVo); //WDEV-20112
		}
		
		catch (Exception ex)
		{
			//WDEV-20112
			//return HL7Utils.buildRejAck(msg.get("MSH"), "Exception: " + ex.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems()));
			response.setMessage(HL7Utils.buildRejAck(msg.get("MSH"), "Exception: " + ex.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems())));
			return response; //WDEV-20112
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
					
					
					//WDEV-20278
//					CareSpellVo careSpell=createCareSpellVo(pas,pv);
					CareSpellVo careSpell = createCareSpellVo(pas,pv, providerSystem); //WDEV-20278
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
							//WDEV-20112
//							return HL7Utils.buildRejAck( msg.get("MSH"), "Exception: " + ex.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems()));
							response.setMessage(HL7Utils.buildRejAck(msg.get("MSH"), "Exception: " + ex.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems())));
							return response; //WDEV-20112

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
			//WDEV-20112
//			return HL7Utils.buildRejAck(msg.get("MSH"), "Exception: " + ex.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems()));
			response.setMessage(HL7Utils.buildRejAck(msg.get("MSH"), "Exception: " + ex.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems())));
			return response; //WDEV-20112
		}
		//WDEV-20122
//		Message ack = HL7Utils.buildPosAck(msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems()));
//		return ack;
		response.setMessage(HL7Utils.buildPosAck(msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems())));
		return response; //WDEV-20112
	}

	
	// WDEV-19481
	public void populateBasicEpisodeData(IHL7OutboundMessageHandler event, ifInpatientEpisodeVo inpatientEpisode, PV1 pv1, PV2 pv2) throws Exception
	{
		
		//PV1-2 Patient Class (IS)
		pv1.getPatientClass().setValue("I");

		//PV1-3 Assigned patient location (PL)
		//PV1-3-1 Point of Care (IS)
		if(inpatientEpisode.getWardLocation() != null
				&& inpatientEpisode.getWardLocation().getCodeMappings() != null)
		{
			//WDEV-20269
//			for (int i=0; i<inpatientEpisode.getWardLocation().getCodeMappings().size(); i++)
//			{
//				TaxonomyMap codeMapping = inpatientEpisode.getWardLocation().getCodeMappings().get(i);
//				if(codeMapping.getTaxonomyCode() != null
//						&& codeMapping.getTaxonomyCode().length() > 0)
//				{
//					pv1.getAssignedPatientLocation().getPointOfCare().setValue(codeMapping.getTaxonomyCode().toString());
//				}
//			}
			TaxonomyMap map = inpatientEpisode.getWardLocation().getTaxonomyMap(event.getProviderSystem().getCodeSystem());	
			if (map != null)
			{
				pv1.getAssignedPatientLocation().getPointOfCare().setValue(map.getTaxonomyCode());
			} //WDEV-20269
		}
		
		//WDEV-20204 
		//PV1-3-2 Bay (IS) (Room)
		ConfigItems[] providerSystemConfigItems = toConfigItemArray(event.getProviderSystem().getConfigItems());
		String includeBayInPatientLocation = HL7Utils.getConfigItem(providerSystemConfigItems, ConfigItems.IncludeBayInPatientLocaton);
		// Only populate Pv1-3-2 if config flag is true
		if (includeBayInPatientLocation != null
				&& (includeBayInPatientLocation.equalsIgnoreCase("TRUE") || includeBayInPatientLocation.equalsIgnoreCase("YES")))
		{
			if(inpatientEpisode.getBedSpaceStateBay() != null)
			{
				if(inpatientEpisode.getBedSpaceStateBay().getCodeMappings() != null)
				{
					TaxonomyMap map = inpatientEpisode.getBedSpaceStateBay().getTaxonomyMap(event.getProviderSystem().getCodeSystem());
					if (map != null) //Mapping is defined for provider system
					{
						pv1.getAssignedPatientLocation().getRoom().setValue(map.getTaxonomyCode());
					}
					else if (inpatientEpisode.getBedSpaceStateBay().getName() != null) //No mapping defined
					{
						pv1.getAssignedPatientLocation().getRoom().setValue(inpatientEpisode.getBedSpaceStateBay().getName());
					}

				}
				else if (inpatientEpisode.getBedSpaceStateBay().getName() != null) //No mapping defined
				{
					pv1.getAssignedPatientLocation().getRoom().setValue(inpatientEpisode.getBedSpaceStateBay().getName());
				}
			}			
		} //WDEV-20204
		

		//PV1-3-3 Bed (IS)
		if(inpatientEpisode.getBedNo() != null 
				&& inpatientEpisode.getBedNo().length() > 0)
		{
			pv1.getAssignedPatientLocation().getBed().setValue(inpatientEpisode.getBedNo());
		}
	
		
		
		//PV1-3-4 Facility (HD)
		//WDEV-20269
//		if(inpatientEpisode.getWardLocation() != null
//				&& inpatientEpisode.getWardLocation().getParentLocation() != null
//				&& inpatientEpisode.getWardLocation().getParentLocation().getCodeMappings() !=null
//				&& inpatientEpisode.getWardLocation().getParentLocation().getName() != null)
//		{
//			for (int i=0; i<inpatientEpisode.getWardLocation().getParentLocation().getCodeMappings().size(); i++)
//			{
//				TaxonomyMap codeMapping = inpatientEpisode.getWardLocation().getParentLocation().getCodeMappings().get(i);
//				if(codeMapping.getTaxonomyCode() != null 
//						&& codeMapping.getTaxonomyCode().length() > 0
//						&& codeMapping.getTaxonomyName() != null
//						&& codeMapping.getTaxonomyName().getText().length() > 0
//						&& inpatientEpisode.getWardLocation().getParentLocation().getName().length() > 0)
//				{
//					pv1.getAssignedPatientLocation().getFacility().getNamespaceID().setValue(inpatientEpisode.getWardLocation().getParentLocation().getName());
//					pv1.getAssignedPatientLocation().getFacility().getUniversalID().setValue(codeMapping.getTaxonomyCode());
//					pv1.getAssignedPatientLocation().getFacility().getUniversalIDType().setValue(codeMapping.getTaxonomyName().toString());
//				}
//			}
//		}
		if(inpatientEpisode.getFacility() != null)
		{
			pv1.getAssignedPatientLocation().getFacility().getNamespaceID().setValue(inpatientEpisode.getFacility());
		} //WDEV-20269

		//PV1-3-9 Location Description (ST)
		if(inpatientEpisode.getWardLocation() != null
				&& inpatientEpisode.getWardLocation().getName() != null 
				&& inpatientEpisode.getWardLocation().getName().length() > 0)
		{
			pv1.getAssignedPatientLocation().getLocationDescription().setValue(inpatientEpisode.getWardLocation().getName());
		}


		//WDEV-22983
		/*
		 * If the AdmissionDetail.MethodofAdmission has the value EMERGENCY then we should populate the PV1.4 with AdmissionDetail.SourceOfEmergencyReferral. 
		 * Otherwise continue to populate as is currently from AdmissionDetail.MethodofAdmission.
		 */
//		//WDEV-20244
//		// PV1-4 Admission type (IS)
//		if(inpatientEpisode.getMethodOfAdmission() != null)
//		{
//			pv1.getAdmissionType().setValue(svc.getRemoteLookup(inpatientEpisode.getMethodOfAdmission().getID(), event.getProviderSystem().getCodeSystem().getText()));
//		} //WDEV-20244
		if (inpatientEpisode.getMethodOfAdmission() != null)
		{
			if (MethodOfAdmission.EMERGENCY.equals(inpatientEpisode.getMethodOfAdmission())
					&& inpatientEpisode.getSourceOfEmergencyReferral() != null)
			{
				pv1.getAdmissionType().setValue(svc.getRemoteLookup(inpatientEpisode.getSourceOfEmergencyReferral().getID(), event.getProviderSystem().getCodeSystem().getText()));
			}
			else
			{
				pv1.getAdmissionType().setValue(svc.getRemoteLookup(inpatientEpisode.getMethodOfAdmission().getID(), event.getProviderSystem().getCodeSystem().getText()));
			}
		} //WDEV-22983

		
		// PV1-5 Preadmission number (CX)
		if(inpatientEpisode.getPreadmissionNumber() != null 
				&& inpatientEpisode.getPreadmissionNumber().length() > 0)
		{
			pv1.getPreadmitNumber().getID().setValue(inpatientEpisode.getPreadmissionNumber());
		}

		//PV1-7 Attending doctor
		if(inpatientEpisode.getAttendingHCP() != null)
		{
			//WDEV-21000
//			renderMemberOfStaffShortVoToXCN(inpatientEpisode.getAttendingHCP().getMos(), pv1.getAttendingDoctor(0), event.getProviderSystem());
			if (ConfigFlag.HL7.USE_CONFIGURED_TAXONOMYTYPES_FOR_XCN.getValue())
			{
				renderMemberOfStaffShortVoToAttendingDoctor(inpatientEpisode.getAttendingHCP().getMos(), pv1, event.getProviderSystem());
			}
			else
			{
				renderMemberOfStaffShortVoToXCN(inpatientEpisode.getAttendingHCP().getMos(), pv1.getAttendingDoctor(0), event.getProviderSystem());
			}
		}

		// PV1-8 Referring doctor (XCN)
		if(inpatientEpisode.getReferringGP() != null)
		{
			//WDEV-21000
//			renderGpLiteVoToXCN(inpatientEpisode.getReferringGP(), pv1.getReferringDoctor(0), event.getProviderSystem());
			if (ConfigFlag.HL7.USE_CONFIGURED_TAXONOMYTYPES_FOR_XCN.getValue())
			{
				renderGpLiteVoToReferringDoctor(inpatientEpisode.getReferringGP(), pv1, event.getProviderSystem());
			}
			else
			{
				renderGpLiteVoToXCN(inpatientEpisode.getReferringGP(), pv1.getReferringDoctor(0), event.getProviderSystem());
			}
		}

		// PV1-9 Consulting doctor (XCN)
		if(inpatientEpisode.getConsultant() != null)
		{
			//WDEV-21000
//			renderMedicWithMappingsLiteVoToXCN(inpatientEpisode.getConsultant(), pv1.getConsultingDoctor(0), event.getProviderSystem());
			if (ConfigFlag.HL7.USE_CONFIGURED_TAXONOMYTYPES_FOR_XCN.getValue())
			{
				renderMedicWithMappingsLiteVoToConsultingDoctor(inpatientEpisode.getConsultant(), pv1, event.getProviderSystem());
			}
			else
			{
				renderMedicWithMappingsLiteVoToXCN(inpatientEpisode.getConsultant(), pv1.getConsultingDoctor(0), event.getProviderSystem());
			}
		}

		// PV1-10 Hospital Service (IS) [Specialty]
		if(inpatientEpisode.getSpecialty() != null)
		{
			pv1.getHospitalService().setValue(svc.getRemoteLookup(inpatientEpisode.getSpecialty().getID(), event.getProviderSystem().getCodeSystem().getText()));
		}
	
		// PV1-14 Admit source (IS) 
		if(inpatientEpisode.getAdmitSource() != null)
		{
			pv1.getAdmitSource().setValue(svc.getRemoteLookup(inpatientEpisode.getAdmitSource().getID(), event.getProviderSystem().getCodeSystem().getText()));
		}
		
		// PV1-16 VIP indicator
		if(inpatientEpisode.getIsVip() !=null  
				&& inpatientEpisode.getIsVip().toString().equalsIgnoreCase("TRUE"))
		{
			pv1.getVIPIndicator().setValue("Y");
		}
						
		// PV1-18 Patient type
		if(inpatientEpisode.getPatientType() != null)
		{
			pv1.getPatientType().setValue(svc.getRemoteLookup(inpatientEpisode.getPatientType().getID(), event.getProviderSystem().getCodeSystem().getText()));
		}
	
		// PV1-19 Visit number
		if(inpatientEpisode.getPasEventId() != null 
				&& inpatientEpisode.getPasEventId().length() > 0)
		{
			pv1.getVisitNumber().getID().setValue(inpatientEpisode.getPasEventId());
		}
	
		// PV1-22 Courtesy code (Chaplain required?)
		if(inpatientEpisode.getIsChaplainRequired() !=null 
				&& inpatientEpisode.getIsChaplainRequired().toString().equalsIgnoreCase("TRUE"))
		{
			pv1.getCourtesyCode().setValue("Y");
		}

		// PV1-40 Bed Status (TCIType)
		if(inpatientEpisode.getElectiveAdmissionType() != null)
		{
				pv1.getBedStatus().setValue(svc.getRemoteLookup(inpatientEpisode.getElectiveAdmissionType().getID(), event.getProviderSystem().getCodeSystem().getText()));
		}
	
		// PV1-44 Admit date/time
		if(inpatientEpisode.getAdmissionDateTime() != null)
		{
			renderDateTimeVoToTS(inpatientEpisode.getAdmissionDateTime(), pv1.getAdmitDateTime());
		}
		
		// PV2-2 Accommodation code (ward type)
		if(inpatientEpisode.getWardType() != null)
		{
			pv2.getAccommodationCode().getIdentifier().setValue(svc.getRemoteLookup(inpatientEpisode.getWardType().getID() , event.getProviderSystem().getCodeSystem().getText()));
		}
	
		// PV2-3 Admission Reason
		if(inpatientEpisode.getAdmissionReason() != null 
				&& inpatientEpisode.getAdmissionReason().length() > 0)
		{
			pv2.getAdmitReason().getText().setValue(inpatientEpisode.getAdmissionReason());
		}
		
		// WDEV-20451
		// PV2-9  Expected discharge date/time
		if(inpatientEpisode.getExpectedDischargeDateTime() != null)
		{
			renderDateTimeVoToTS(inpatientEpisode.getExpectedDischargeDateTime(), pv2.getExpectedDischargeDateTime());
		}
		
		// WDEV-20018
		// PV2-10 Estimated length of inpatient stay
		if(inpatientEpisode.getEstLengthOfStay() != null)
		{
			pv2.getEstimatedLengthOfInpatientStay().setValue(inpatientEpisode.getEstLengthOfStay().toString());
		}

	}

	
	//WDEV-19704
	public void populateBasicPatientElectiveList(IHL7OutboundMessageHandler event, ifElectiveListMessageQueueVo patElectList, PV1 pv1, PV2 pv2) throws Exception
	{
		
		//PV1-2 Patient Class (IS)
		pv1.getPatientClass().setValue("P");

		//PV1-3-1 Point of care (IS)
		if(patElectList.getTCIWard() != null 
				&& patElectList.getTCIWard().getCodeMappings() != null)
		{
			//WDEV-20269
//			for (int i=0; i<patElectList.getTCIWard().getCodeMappings().size(); i++)
//			{
//				TaxonomyMap codeMapping = patElectList.getTCIWard().getCodeMappings().get(i);
//				if(codeMapping.getTaxonomyCode() != null
//						&& codeMapping.getTaxonomyCode().length() > 0)
//				{
//					pv1.getAssignedPatientLocation().getPointOfCare().setValue(codeMapping.getTaxonomyCode().toString());
//				}
//			}
			TaxonomyMap map = patElectList.getTCIWard().getTaxonomyMap(event.getProviderSystem().getCodeSystem());	
			if (map != null)
			{
				pv1.getAssignedPatientLocation().getPointOfCare().setValue(map.getTaxonomyCode().toString());
			} 
			//WDEV-20269
		}
	
		//PV1-3-3 Bed (IS)
		if(patElectList.getTCIBed() != null 
				&& patElectList.getTCIBed().length() > 0)
		{
			pv1.getAssignedPatientLocation().getBed().setValue(patElectList.getTCIBed());
		}
		
		//PV1-3-4 Facility (HD)
		if(patElectList.getTCIHospital() != null
				&& patElectList.getTCIHospital().getCodeMappings() !=null)
		{
			//WDEV-20269
//			for (int i=0; i<patElectList.getTCIHospital().getCodeMappings().size(); i++)
//			{
//				TaxonomyMap codeMapping = patElectList.getTCIHospital().getCodeMappings().get(i);
//				if(codeMapping.getTaxonomyCode() != null 
//						&& codeMapping.getTaxonomyCode().length() > 0
//						&& codeMapping.getTaxonomyName() != null
//						&& codeMapping.getTaxonomyName().getText().length() > 0)
//				{
//					pv1.getAssignedPatientLocation().getFacility().getUniversalID().setValue(codeMapping.getTaxonomyCode());
//					pv1.getAssignedPatientLocation().getFacility().getUniversalIDType().setValue(codeMapping.getTaxonomyName().toString());
//				}
//			}
			TaxonomyMap map = patElectList.getTCIHospital().getTaxonomyMap(event.getProviderSystem().getCodeSystem());	
			if (map != null)
			{
				pv1.getAssignedPatientLocation().getFacility().getUniversalID().setValue(map.getTaxonomyCode());
			} 
			//WDEV-20269
		}
		
		//PV1-3-9 Location description (ST)
		if(patElectList.getTCIWard() != null 
				&& patElectList.getTCIWard().getName() != null 
				&& patElectList.getTCIWard().getName().length() > 0)
		{
			pv1.getAssignedPatientLocation().getLocationDescription().setValue(patElectList.getTCIWard().getName());
		}
		
		//PV1-5 Preadmit number (CX)
		if(patElectList.getPreadmissionNumber() != null 
				&& patElectList.getPreadmissionNumber().length() > 0)
		{
			pv1.getPreadmitNumber().getID().setValue(patElectList.getID_PatientElectiveList().toString());
		}
		
		//PV1-7 Attending doctor (XCN)
		// http://jira/browse/WDEV-20863
		// Changed to be same as Consulting doctor (Pv1-9)
		/*if(patElectList.getAttendingDoctor() != null)
		{
			renderMemberOfStaffShortVoToXCN(patElectList.getAttendingDoctor(), pv1.getAttendingDoctor(0), event.getProviderSystem());
		} 
		*/
		//WDEV-20863
		
		//PV1-8 Referring doctor (XCN)
		// **** Can be either:
		// **** 1. Referring GP
		// **** 2. Referring consultant
		// **** 3. Allied health professional

		// http://jira/browse/WDEV-20700
//		if(patElectList.getReferringGP() != null 
//				&& patElectList.getReferrerType().equals(SourceOfReferral.GP))
//		{
//			renderGpLiteVoToXCN(patElectList.getReferringGP(), pv1.getReferringDoctor(0), event.getProviderSystem());
//		}
//
//		if(patElectList.getReferringConsultant() != null
//				&& patElectList.getReferrerType().equals(SourceOfReferral.CONSULTANT))
//
//		{
//			renderMemberOfStaffShortVoToXCN(patElectList.getReferringConsultant(), pv1.getReferringDoctor(0), event.getProviderSystem());
//		}
//		
//		if(patElectList.getAlliedHealthProfessional() != null 
//				&& patElectList.getAlliedHealthProfessional().length() > 0
//				&& patElectList.getReferrerType().equals(SourceOfReferral.AHP))
//		{
//			pv1.getReferringDoctor(0).getFamilyName().getOwnSurname().setValue(patElectList.getAlliedHealthProfessional());
//		}
		if (patElectList.getReferrerType() != null)
		{
			if(patElectList.getReferringGP() != null 
					&& patElectList.getReferrerType().equals(SourceOfReferral.GP))
			{
				//WDEV-21000
//				renderGpLiteVoToXCN(patElectList.getReferringGP(), pv1.getReferringDoctor(0), event.getProviderSystem());
				if (ConfigFlag.HL7.USE_CONFIGURED_TAXONOMYTYPES_FOR_XCN.getValue())
				{
					renderGpLiteVoToReferringDoctor(patElectList.getReferringGP(), pv1, event.getProviderSystem());
				}
				else
				{
					renderGpLiteVoToXCN(patElectList.getReferringGP(), pv1.getReferringDoctor(0), event.getProviderSystem());
				}
			}
	
			if(patElectList.getReferringConsultant() != null
					&& patElectList.getReferrerType().equals(SourceOfReferral.CONSULTANT))
			{
				//WDEV-21000
//				renderMemberOfStaffShortVoToXCN(patElectList.getReferringConsultant(), pv1.getReferringDoctor(0), event.getProviderSystem());
				if (ConfigFlag.HL7.USE_CONFIGURED_TAXONOMYTYPES_FOR_XCN.getValue())
				{
					renderMemberOfStaffShortVoToReferringDoctor(patElectList.getReferringConsultant(), pv1, event.getProviderSystem());
				}
				else
				{
					renderMemberOfStaffShortVoToXCN(patElectList.getReferringConsultant(), pv1.getReferringDoctor(0), event.getProviderSystem());
				}
			}
			
			if(patElectList.getAlliedHealthProfessional() != null 
					&& patElectList.getAlliedHealthProfessional().length() > 0
					&& patElectList.getReferrerType().equals(SourceOfReferral.AHP))
			{
				pv1.getReferringDoctor(0).getFamilyName().getOwnSurname().setValue(patElectList.getAlliedHealthProfessional());
			} 
		}//WDEV-20700

		
		//PV1-9 Consulting doctor (XCN)
		if(patElectList.getConsultingDoctor() != null)
		{
			//WDEV-21000
			//http://jira/browse/WDEV-20863
//			renderMemberOfStaffShortVoToXCN(patElectList.getConsultingDoctor(), pv1.getAttendingDoctor(0), event.getProviderSystem()); //WDEV-20863
//			renderMemberOfStaffShortVoToXCN(patElectList.getConsultingDoctor(), pv1.getConsultingDoctor(0), event.getProviderSystem());
			if (ConfigFlag.HL7.USE_CONFIGURED_TAXONOMYTYPES_FOR_XCN.getValue())
			{
				renderMemberOfStaffShortVoToAttendingDoctor(patElectList.getConsultingDoctor(), pv1, event.getProviderSystem());
				renderMemberOfStaffShortVoToConsultingDoctor(patElectList.getConsultingDoctor(), pv1, event.getProviderSystem());
			}
			else
			{
				renderMemberOfStaffShortVoToXCN(patElectList.getConsultingDoctor(), pv1.getAttendingDoctor(0), event.getProviderSystem());			
				renderMemberOfStaffShortVoToXCN(patElectList.getConsultingDoctor(), pv1.getConsultingDoctor(0), event.getProviderSystem());			
			}
		}
		
		//PV1-10 Hospital service (IS)
		if(patElectList.getSpecialty() != null)
		{
			pv1.getHospitalService().setValue(svc.getRemoteLookup(patElectList.getSpecialty().getID(), event.getProviderSystem().getCodeSystem().getText()));
		}

		//PV1-20 Financial class (FC)
		if(patElectList.getPatientStatus() != null)
		{
			pv1.getFinancialClass(0).getFinancialClass().setValue(svc.getRemoteLookup(patElectList.getPatientStatus().getID(), event.getProviderSystem().getCodeSystem().getText()));
		}
		
		//PV1-40 Bed status (IS)
		if(patElectList.getElectiveAdmissionType() != null)
		{
			pv1.getBedStatus().setValue(svc.getRemoteLookup(patElectList.getElectiveAdmissionType().getID(), event.getProviderSystem().getCodeSystem().getText()));
		}

		//PV1-41 Account status (IS) [RTT Status code]
		if(patElectList.getRTTStatusNationalCode() != null)
		{
			pv1.getAccountStatus().setValue(patElectList.getRTTStatusNationalCode());
		}
		
		//PV1-44 Admit Date/Time (TS)
		if(patElectList.getTCIDate() != null)
		{
			String tciDateTime = null;

			if(patElectList.getTCIDate().toString(DateFormat.ISO) != null)
			{
				tciDateTime = patElectList.getTCIDate().toString(DateFormat.ISO);
			}
			if(patElectList.getTCITime()!=null
					&& patElectList.getTCITime().toString(TimeFormat.FLAT4) != null)
			{
				tciDateTime += patElectList.getTCITime().toString(TimeFormat.FLAT4);
			}
			if(tciDateTime != null)
			{
				pv1.getAdmitDateTime().getTimeOfAnEvent().setValue(tciDateTime);
			}
		}
		
		//PV2-7 Visit user code (IS)
		if(patElectList.getIntendedManagement() != null)
		{
			pv2.getVisitUserCode(0).setValue(svc.getRemoteLookup(patElectList.getIntendedManagement().getID(), event.getProviderSystem().getCodeSystem().getText()));				
		}
		
		//PV2-10 Estimated length of inpatient stay (NM)
		if(patElectList.getAnticipatedStay() != null 
				&& patElectList.getAnticipatedStay().intValue() > 0)
		{
			pv2.getEstimatedLengthOfInpatientStay().setValue(patElectList.getAnticipatedStay().toString());
		}

		//PV2-13-1 Referral source code - ID Number (ST) [Referraing practice code]
		if(patElectList.getReferringPractice() != null
				&& patElectList.getReferringPractice().getNationalLocCode() != null 
				&& patElectList.getReferringPractice().getNationalLocCode().length() > 0)
		{
			pv2.getReferralSourceCode(0).getIDNumber().setValue(patElectList.getReferringPractice().getNationalLocCode());
		}

		//PV2-13-9 Referral source code - Assigning Authority (HD) [Referring practice CCG code]
		if(patElectList.getReferringPracticeCCGCode() != null)
		{
			pv2.getReferralSourceCode(0).getAssigningAuthority().getNamespaceID().setValue(patElectList.getReferringPracticeCCGCode());
		}

		//PV2-24 Patient Status (IS) [Used to indicate if TCI for referral is ACTIVE or SUSPENDED]
		//WDEV-22667 Concept of Patient status (TCI status) only applies if TCI exists
//		if(patElectList.getPatientSuspensionStatusIsNotNull())
		if (patElectList.getTCIWard() != null)
		{
			if(patElectList.getPatientSuspensionStatusIsNotNull())
			{
				pv2.getPatientStatusCode().setValue("SUSPENDED");
			} 
			else
			{
				pv2.getPatientStatusCode().setValue("ACTIVE");
			}
		} //WDEV-22667

		//PV2-25 Visit Priority Code (IS) [Referral Urgency]
		if(patElectList.getReferralUrgency() != null)
		{
			pv2.getVisitPriorityCode().setValue(svc.getRemoteLookup(patElectList.getReferralUrgency().getID(), event.getProviderSystem().getCodeSystem().getText()));
		}
		
		//PV2-42 Patient condition code (CE) [Cancer Type]
		if(patElectList.getCancerType() != null)
		{
			pv2.getPatientConditionCode().getIdentifier().setValue((svc.getRemoteLookup(patElectList.getCancerType().getID(), event.getProviderSystem().getCodeSystem().getText())));
		}
	}
	
}	
