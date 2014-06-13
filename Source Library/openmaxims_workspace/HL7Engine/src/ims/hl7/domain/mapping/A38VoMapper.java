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
import ims.hl7.utils.HL7Errors;
import ims.hl7.utils.HL7Utils;
import ims.ocrr.vo.ProviderSystemVo;
import ims.scheduling.vo.lookups.Status_Reason;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v24.segment.PV1;

public class A38VoMapper extends VoMapper
{

	public Message processEvent(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	{
		return processCancelAppt(msg, providerSystem);
	}

	public Message populateMessage()
	{
		// Not needed for inbound messages
		return null;
	}
	
	protected Message processCancelAppt(Message msg, ProviderSystemVo providerSystem) throws HL7Exception
	{
		try
		{
			Patient patVo = getPrimaryIdFromPid(msg, providerSystem);
			if (patVo != null)
			{
				patVo = getDemog().getPatient(patVo);

				// Return silently if patient not found, or appointment not found
				if (patVo == null)
				{
					Message ack = HL7Utils.buildPosAck( msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems()));
					return ack;
//					return HL7Utils.buildRejAck(msg.get("MSH"), "This patient has not been registered within the system", HL7Errors.APP_INT_ERROR);
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
						Message ack = HL7Utils.buildPosAck( msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems()));
						return ack;
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
							Message ack = HL7Utils.buildPosAck( msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems()));
							return ack;
						}
					pendingAneVo.setDTADateTime(null);
					LocShortVo currentLoc=null;
					if(pv1.getAssignedPatientLocation().getFacility().getNamespaceID().getValue()!=Hl7Null)
						currentLoc = orgLoc.getLocationByTaxonomyType(pv1.getAssignedPatientLocation().getFacility().getNamespaceID().getValue(),  TaxonomyType.PAS);
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
						Message ack = HL7Utils.buildPosAck( msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems()));
						return ack;
						//return HL7Utils.buildRejAck(msg.get("MSH"), "No current outpatient appointment exists for this patient", HL7Errors.APP_INT_ERROR);
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
			return HL7Utils.buildRejAck( msg.get("MSH"), "StaleObjectException occured recording Inpatient Leave - " + ex.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems()));
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return HL7Utils.buildRejAck( msg.get("MSH"), "Exception occured cancelling Outpatient Appointment - " + e.getMessage(), HL7Errors.APP_INT_ERROR, toConfigItemArray(providerSystem.getConfigItems()));
		}

		Message ack = HL7Utils.buildPosAck( msg.get("MSH"), toConfigItemArray(providerSystem.getConfigItems()));
		return ack;
	}
	

}

