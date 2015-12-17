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

import ims.configuration.gen.ConfigFlag;
import ims.core.vo.AneAttendanceVo;
import ims.core.vo.CareContextInterfaceVo;
import ims.core.vo.CareSpellVo;
import ims.core.vo.InpatientEpisodeVo;
import ims.core.vo.OutPatientAttendanceVo;
import ims.core.vo.PasEventVo;
import ims.core.vo.Patient;
import ims.core.vo.PendingElectiveAdmissionHl7Vo;
import ims.core.vo.lookups.ElectiveAdmissionStatus;
import ims.core.vo.lookups.TCIType;
import ims.domain.exceptions.StaleObjectException;
import ims.framework.utils.DateTime;
import ims.hl7.utils.HL7Errors;
import ims.hl7.utils.HL7Utils;
import ims.ocrr.vo.ProviderSystemVo;
import ims.scheduling.vo.lookups.Status_Reason;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v24.message.ADT_A01;
import ca.uhn.hl7v2.model.v24.message.ADT_A05;
import ca.uhn.hl7v2.model.v24.segment.EVN;
import ca.uhn.hl7v2.model.v24.segment.MSH;
import ca.uhn.hl7v2.model.v24.segment.PR1;
import ca.uhn.hl7v2.model.v24.segment.PV1;
import ca.uhn.hl7v2.model.v24.segment.PV2;

public class A05VoMapper extends VoMapper
{

	public Message processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	{
		return (processAppointmentBooking(msg, providerSystem));
	}

	private Message processAppointmentBooking(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	{
		try
		{
			Patient patVo = savePatient(msg, providerSystem);
			PV1 pv1 = (PV1) msg.get("PV1");
			PasEventVo pasResult=null;
			String visitId=pv1.getVisitNumber().getID().getValue() + "_" + pv1.getVisitNumber().getComponent(1);
			PasEventVo pas=new PasEventVo();
			
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
						
						
						CareSpellVo careSpell=createCareSpellVo(pas,pv1);
						
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
				tciVo.setReferringConsultant(getReferringConsultant(pv1));

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
			return HL7Utils.buildRejAck( msg.get("MSH"), "Exception: " + ex.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems()));
		}
		

		Message ack = HL7Utils.buildPosAck( msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems()));
		return ack;
	}

	
	public Message populateMessage()
	{
		// Not required in inbound messages
		return null;
	}

}
