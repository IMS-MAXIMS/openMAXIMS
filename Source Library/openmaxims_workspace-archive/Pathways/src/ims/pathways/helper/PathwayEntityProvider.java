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
package ims.pathways.helper;


import java.util.List;

import ims.core.patient.domain.objects.Patient;
import ims.core.patient.vo.PatientRefVo;
import ims.domain.DomainFactory;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.impl.DomainImpl;
import ims.framework.enumerations.SystemLogLevel;
import ims.framework.enumerations.SystemLogType;
import ims.framework.interfaces.IPathwayEntityProvider;
import ims.framework.utils.DateTime;
import ims.pathways.configuration.domain.objects.Event;
import ims.pathways.configuration.vo.EventRefVo;
import ims.pathways.domain.HL7PathwayIf;
import ims.pathways.domain.impl.HL7PathwayIfImpl;
import ims.pathways.domain.objects.PatientPathwayJourney;
import ims.pathways.vo.PatientEventVo;
import ims.pathways.vo.domain.PatientJourneyVoAssembler;

public class PathwayEntityProvider extends DomainImpl implements IPathwayEntityProvider 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final org.apache.log4j.Logger LOG = ims.utils.Logging.getLogger(PathwayEntityProvider.class);
	public void createEvent(Integer eventId, String entityName, Integer entityId,
			Integer patientId, Integer careContextId, DateTime scheduledDateTime, String description) 
	{
		// TODO - need to save entityId
		
		if (eventId == null || entityName == null || patientId == null)
		{
			LOG.error("Cannot create event with null values");
			return;
		}
		// Need to instantiate the event provided for the given entity
		DomainFactory factory = getDomainFactory();
		
		// Check to see if an event exists with the given it
		Event domEvent = (Event) factory.getDomainObject(Event.class, eventId);
		if (domEvent == null)
		{
			LOG.error("Event not found with id = " + eventId + " cannot proceed with event creation");
			return;
		}
		
		Patient domPatient = (Patient) factory.getDomainObject(Patient.class, patientId);
		if (domPatient == null)
		{
			LOG.error("Patient not found with id = " + patientId + " cannot proceed with event creation");
			return;
		}
		
		// Get the current PatientJourney for this patient
		List<PatientPathwayJourney> lst = factory.find(" from PatientPathwayJourney jou where jou.patient = :patient and jou.endedOnDate is null order by jou.startDate desc", "patient", domPatient);
		if (lst == null || lst.size() == 0)
		{
			LOG.error("No PatientJourneys found for this patient");
			return;
		}
		// There could be more than one returned, we need a way to ensure we are working with the
		// correct one, for now though just take the most recent one.
		PatientPathwayJourney journey = lst.get(0);
		
		// Build up the PatientEventVo in order to make the call to the HL7PathwayIfImpl instantiate method
		PatientEventVo patEvent = new PatientEventVo();
		patEvent.setEvent(new EventRefVo(domEvent.getId(), domEvent.getVersion()));
		patEvent.setEventDateTime(new DateTime());
		patEvent.setJourney(PatientJourneyVoAssembler.create(journey));
		patEvent.setPatient(new PatientRefVo(domPatient.getId(), domPatient.getVersion()));
		patEvent.setScheduledDate(scheduledDateTime);
		patEvent.setDescription(description);
		
	
		HL7PathwayIf domPathway = (HL7PathwayIf) getDomainImpl(HL7PathwayIfImpl.class);
		try 
		{
			patEvent = domPathway.instantiatePatientEvent(patEvent);
		} 
		catch (DomainInterfaceException e) 
		{
			LOG.error("DomainInterfaceException instantiation patient event " + e.getMessage());
			return;
		} 
		catch (StaleObjectException e) 
		{
			LOG.error("StaleObjectException on instantiation of patient event " + e.getMessage());
			return;
		}
		
		super.createSystemLogEntry(SystemLogType.INTEGRATION_ENGINE, SystemLogLevel.INFORMATION, "Patient Event has been instantiated for this entity event :" + patEvent.getID_PatientEvent());

	}

}
