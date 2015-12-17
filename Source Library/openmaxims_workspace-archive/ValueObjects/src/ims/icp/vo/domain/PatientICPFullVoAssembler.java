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
/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated on 16/04/2014, 12:32
 *
 */
package ims.icp.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Neil McAnaspie
 */
public class PatientICPFullVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.icp.vo.PatientICPFullVo copy(ims.icp.vo.PatientICPFullVo valueObjectDest, ims.icp.vo.PatientICPFullVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientICP(valueObjectSrc.getID_PatientICP());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
		// StartedDateTime
		valueObjectDest.setStartedDateTime(valueObjectSrc.getStartedDateTime());
		// Stages
		valueObjectDest.setStages(valueObjectSrc.getStages());
		// ClinicalContact
		valueObjectDest.setClinicalContact(valueObjectSrc.getClinicalContact());
		// CompletedDateTime
		valueObjectDest.setCompletedDateTime(valueObjectSrc.getCompletedDateTime());
		// Appointments
		valueObjectDest.setAppointments(valueObjectSrc.getAppointments());
		// PasEvent
		valueObjectDest.setPasEvent(valueObjectSrc.getPasEvent());
		// CriticalEvents
		valueObjectDest.setCriticalEvents(valueObjectSrc.getCriticalEvents());
		// EvaluationNotes
		valueObjectDest.setEvaluationNotes(valueObjectSrc.getEvaluationNotes());
		// hasOutstandingAdminActions
		valueObjectDest.setHasOutstandingAdminActions(valueObjectSrc.getHasOutstandingAdminActions());
		// hasOutstandingNursingActions
		valueObjectDest.setHasOutstandingNursingActions(valueObjectSrc.getHasOutstandingNursingActions());
		// hasOutstandingPhysioActions
		valueObjectDest.setHasOutstandingPhysioActions(valueObjectSrc.getHasOutstandingPhysioActions());
		// hasOutstandingClinicalActions
		valueObjectDest.setHasOutstandingClinicalActions(valueObjectSrc.getHasOutstandingClinicalActions());
		// ICP
		valueObjectDest.setICP(valueObjectSrc.getICP());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientICPFullVoCollectionFromPatientICP(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.icps.instantiation.domain.objects.PatientICP objects.
	 */
	public static ims.icp.vo.PatientICPFullVoCollection createPatientICPFullVoCollectionFromPatientICP(java.util.Set domainObjectSet)	
	{
		return createPatientICPFullVoCollectionFromPatientICP(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.icps.instantiation.domain.objects.PatientICP objects.
	 */
	public static ims.icp.vo.PatientICPFullVoCollection createPatientICPFullVoCollectionFromPatientICP(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.icp.vo.PatientICPFullVoCollection voList = new ims.icp.vo.PatientICPFullVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.icps.instantiation.domain.objects.PatientICP domainObject = (ims.icps.instantiation.domain.objects.PatientICP) iterator.next();
			ims.icp.vo.PatientICPFullVo vo = create(map, domainObject);
			
			if (vo != null)
				voList.add(vo);
				
			if (domainObject != null)
			{				
				if (domainObject.getIsRIE() != null && domainObject.getIsRIE().booleanValue() == true)
					rieCount++;
				else
					activeCount++;
			}
		}
		voList.setRieCount(rieCount);
		voList.setActiveCount(activeCount);
		return voList;
	}

	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param domainObjectList - List of ims.icps.instantiation.domain.objects.PatientICP objects.
	 */
	public static ims.icp.vo.PatientICPFullVoCollection createPatientICPFullVoCollectionFromPatientICP(java.util.List domainObjectList) 
	{
		return createPatientICPFullVoCollectionFromPatientICP(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.icps.instantiation.domain.objects.PatientICP objects.
	 */
	public static ims.icp.vo.PatientICPFullVoCollection createPatientICPFullVoCollectionFromPatientICP(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.icp.vo.PatientICPFullVoCollection voList = new ims.icp.vo.PatientICPFullVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.icps.instantiation.domain.objects.PatientICP domainObject = (ims.icps.instantiation.domain.objects.PatientICP) domainObjectList.get(i);
			ims.icp.vo.PatientICPFullVo vo = create(map, domainObject);

			if (vo != null)
				voList.add(vo);
			
			if (domainObject != null)
			{
				if (domainObject.getIsRIE() != null && domainObject.getIsRIE().booleanValue() == true)
					rieCount++;
				else
					activeCount++;
			}
		}
		
		voList.setRieCount(rieCount);
		voList.setActiveCount(activeCount);
		return voList;
	}

	/**
	 * Create the ims.icps.instantiation.domain.objects.PatientICP set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientICPSet(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.PatientICPFullVoCollection voCollection) 
	 {
	 	return extractPatientICPSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientICPSet(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.PatientICPFullVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.icp.vo.PatientICPFullVo vo = voCollection.get(i);
			ims.icps.instantiation.domain.objects.PatientICP domainObject = PatientICPFullVoAssembler.extractPatientICP(domainFactory, vo, domMap);

			//TODO: This can only occur in the situation of a stale object exception. For now leave it to the Interceptor to handle it.
			if (domainObject == null)
			{
				continue;
			}
			
			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainObjectSet.contains(domainObject)) domainObjectSet.add(domainObject);
			newSet.add(domainObject);			
		}
		java.util.Set removedSet = new java.util.HashSet();
		java.util.Iterator iter = domainObjectSet.iterator();
		//Find out which objects need to be removed
		while (iter.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet.contains(o))
			{
				removedSet.add(o);
			}
		}
		iter = removedSet.iterator();
		//Remove the unwanted objects
		while (iter.hasNext())
		{
			domainObjectSet.remove(iter.next());
		}
		return domainObjectSet;	 
	 }


	/**
	 * Create the ims.icps.instantiation.domain.objects.PatientICP list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientICPList(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.PatientICPFullVoCollection voCollection) 
	 {
	 	return extractPatientICPList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientICPList(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.PatientICPFullVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.icp.vo.PatientICPFullVo vo = voCollection.get(i);
			ims.icps.instantiation.domain.objects.PatientICP domainObject = PatientICPFullVoAssembler.extractPatientICP(domainFactory, vo, domMap);

			//TODO: This can only occur in the situation of a stale object exception. For now leave it to the Interceptor to handle it.
			if (domainObject == null)
			{
				continue;
			}

			int domIdx = domainObjectList.indexOf(domainObject);
			if (domIdx == -1)
			{
				domainObjectList.add(i, domainObject);
			}
			else if (i != domIdx && i < domainObjectList.size())
			{
				Object tmp = domainObjectList.get(i);
				domainObjectList.set(i, domainObjectList.get(domIdx));
				domainObjectList.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i1=domainObjectList.size();
		while (i1 > size)
		{
			domainObjectList.remove(i1-1);
			i1=domainObjectList.size();
		}
		return domainObjectList;	 
	 }

 

	/**
	 * Create the ValueObject from the ims.icps.instantiation.domain.objects.PatientICP object.
	 * @param domainObject ims.icps.instantiation.domain.objects.PatientICP
	 */
	 public static ims.icp.vo.PatientICPFullVo create(ims.icps.instantiation.domain.objects.PatientICP domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.icps.instantiation.domain.objects.PatientICP object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.icp.vo.PatientICPFullVo create(DomainObjectMap map, ims.icps.instantiation.domain.objects.PatientICP domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.icp.vo.PatientICPFullVo valueObject = (ims.icp.vo.PatientICPFullVo) map.getValueObject(domainObject, ims.icp.vo.PatientICPFullVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.icp.vo.PatientICPFullVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.icps.instantiation.domain.objects.PatientICP
	 */
	 public static ims.icp.vo.PatientICPFullVo insert(ims.icp.vo.PatientICPFullVo valueObject, ims.icps.instantiation.domain.objects.PatientICP domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
		DomainObjectMap map = new DomainObjectMap();
		return insert(map, valueObject, domainObject);
	 }
	 
	/**
	 * Update the ValueObject with the Domain Object.
	 * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	 * @param valueObject to be updated
	 * @param domainObject ims.icps.instantiation.domain.objects.PatientICP
	 */
	 public static ims.icp.vo.PatientICPFullVo insert(DomainObjectMap map, ims.icp.vo.PatientICPFullVo valueObject, ims.icps.instantiation.domain.objects.PatientICP domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientICP(domainObject.getId());
		valueObject.setIsRIE(domainObject.getIsRIE());
		
		// If this is a recordedInError record, and the domainObject
		// value isIncludeRecord has not been set, then we return null and
		// not the value object
		if (valueObject.getIsRIE() != null && valueObject.getIsRIE().booleanValue() == true && !domainObject.isIncludeRecord())
			return null;
			
		// If this is not a recordedInError record, and the domainObject
		// value isIncludeRecord has been set, then we return null and
		// not the value object
		if ((valueObject.getIsRIE() == null || valueObject.getIsRIE().booleanValue() == false) && domainObject.isIncludeRecord())
			return null;
			
		// Patient
		if (domainObject.getPatient() != null)
		{
			if(domainObject.getPatient() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getPatient();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setPatient(new ims.core.patient.vo.PatientRefVo(id, -1));				
			}
			else
			{
				valueObject.setPatient(new ims.core.patient.vo.PatientRefVo(domainObject.getPatient().getId(), domainObject.getPatient().getVersion()));
			}
		}
		// AuthoringInformation
		valueObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInformation()) );
		// StartedDateTime
		java.util.Date StartedDateTime = domainObject.getStartedDateTime();
		if ( null != StartedDateTime ) 
		{
			valueObject.setStartedDateTime(new ims.framework.utils.DateTime(StartedDateTime) );
		}
		// Stages
		valueObject.setStages(ims.icp.vo.domain.PatientICPStagesFullVoAssembler.createPatientICPStagesFullVoCollectionFromPatientICPStage(map, domainObject.getStages()) );
		// ClinicalContact
		if (domainObject.getClinicalContact() != null)
		{
			if(domainObject.getClinicalContact() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getClinicalContact();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setClinicalContact(new ims.core.admin.vo.ClinicalContactRefVo(id, -1));				
			}
			else
			{
				valueObject.setClinicalContact(new ims.core.admin.vo.ClinicalContactRefVo(domainObject.getClinicalContact().getId(), domainObject.getClinicalContact().getVersion()));
			}
		}
		// CompletedDateTime
		java.util.Date CompletedDateTime = domainObject.getCompletedDateTime();
		if ( null != CompletedDateTime ) 
		{
			valueObject.setCompletedDateTime(new ims.framework.utils.DateTime(CompletedDateTime) );
		}
		// Appointments
		ims.scheduling.vo.Booking_AppointmentRefVoCollection Appointments = new ims.scheduling.vo.Booking_AppointmentRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getAppointments().iterator(); iterator.hasNext(); ) 
		{
			ims.scheduling.domain.objects.Booking_Appointment tmp = (ims.scheduling.domain.objects.Booking_Appointment)iterator.next();
			if (tmp != null)
				Appointments.add(new ims.scheduling.vo.Booking_AppointmentRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setAppointments(Appointments);
		// PasEvent
		if (domainObject.getPasEvent() != null)
		{
			if(domainObject.getPasEvent() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getPasEvent();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setPasEvent(new ims.core.admin.pas.vo.PASEventRefVo(id, -1));				
			}
			else
			{
				valueObject.setPasEvent(new ims.core.admin.pas.vo.PASEventRefVo(domainObject.getPasEvent().getId(), domainObject.getPasEvent().getVersion()));
			}
		}
		// CriticalEvents
		valueObject.setCriticalEvents(ims.icp.vo.domain.PatientCriticalEventsVoAssembler.createPatientCriticalEventsVoCollectionFromPatientCriticalEvents(map, domainObject.getCriticalEvents()) );
		// EvaluationNotes
		valueObject.setEvaluationNotes(ims.icp.vo.domain.PatientICPEvaluationNoteVoAssembler.createPatientICPEvaluationNoteVoCollectionFromPatientICPEvaluationNote(map, domainObject.getEvaluationNotes()) );
		// hasOutstandingAdminActions
		valueObject.setHasOutstandingAdminActions( domainObject.isHasOutstandingAdminActions() );
		// hasOutstandingNursingActions
		valueObject.setHasOutstandingNursingActions( domainObject.isHasOutstandingNursingActions() );
		// hasOutstandingPhysioActions
		valueObject.setHasOutstandingPhysioActions( domainObject.isHasOutstandingPhysioActions() );
		// hasOutstandingClinicalActions
		valueObject.setHasOutstandingClinicalActions( domainObject.isHasOutstandingClinicalActions() );
		// ICP
		valueObject.setICP(ims.icp.vo.domain.ICPLiteVoAssembler.create(map, domainObject.getICP()) );
		// CareContext
		if (domainObject.getCareContext() != null)
		{
			if(domainObject.getCareContext() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getCareContext();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setCareContext(new ims.core.admin.vo.CareContextRefVo(id, -1));				
			}
			else
			{
				valueObject.setCareContext(new ims.core.admin.vo.CareContextRefVo(domainObject.getCareContext().getId(), domainObject.getCareContext().getVersion()));
			}
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.icps.instantiation.domain.objects.PatientICP extractPatientICP(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.PatientICPFullVo valueObject) 
	{
		return 	extractPatientICP(domainFactory, valueObject, new HashMap());
	}

	public static ims.icps.instantiation.domain.objects.PatientICP extractPatientICP(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.PatientICPFullVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientICP();
		ims.icps.instantiation.domain.objects.PatientICP domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.icps.instantiation.domain.objects.PatientICP)domMap.get(valueObject);
			}
			// ims.icp.vo.PatientICPFullVo ID_PatientICP field is unknown
			domainObject = new ims.icps.instantiation.domain.objects.PatientICP();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientICP());
			if (domMap.get(key) != null)
			{
				return (ims.icps.instantiation.domain.objects.PatientICP)domMap.get(key);
			}
			domainObject = (ims.icps.instantiation.domain.objects.PatientICP) domainFactory.getDomainObject(ims.icps.instantiation.domain.objects.PatientICP.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientICP());

		ims.core.patient.domain.objects.Patient value1 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value1 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getPatient();	
			}
			else
			{
				value1 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value1);
		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));
		ims.framework.utils.DateTime dateTime3 = valueObject.getStartedDateTime();
		java.util.Date value3 = null;
		if ( dateTime3 != null ) 
		{
			value3 = dateTime3.getJavaDate();
		}
		domainObject.setStartedDateTime(value3);
		domainObject.setStages(ims.icp.vo.domain.PatientICPStagesFullVoAssembler.extractPatientICPStageSet(domainFactory, valueObject.getStages(), domainObject.getStages(), domMap));		
		ims.core.admin.domain.objects.ClinicalContact value5 = null;
		if ( null != valueObject.getClinicalContact() ) 
		{
			if (valueObject.getClinicalContact().getBoId() == null)
			{
				if (domMap.get(valueObject.getClinicalContact()) != null)
				{
					value5 = (ims.core.admin.domain.objects.ClinicalContact)domMap.get(valueObject.getClinicalContact());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value5 = domainObject.getClinicalContact();	
			}
			else
			{
				value5 = (ims.core.admin.domain.objects.ClinicalContact)domainFactory.getDomainObject(ims.core.admin.domain.objects.ClinicalContact.class, valueObject.getClinicalContact().getBoId());
			}
		}
		domainObject.setClinicalContact(value5);
		ims.framework.utils.DateTime dateTime6 = valueObject.getCompletedDateTime();
		java.util.Date value6 = null;
		if ( dateTime6 != null ) 
		{
			value6 = dateTime6.getJavaDate();
		}
		domainObject.setCompletedDateTime(value6);

		ims.scheduling.vo.Booking_AppointmentRefVoCollection refCollection7 = valueObject.getAppointments();
		int size7 = (null == refCollection7) ? 0 : refCollection7.size();		
		java.util.Set domainAppointments7 = domainObject.getAppointments();
		if (domainAppointments7 == null)
		{
			domainAppointments7 = new java.util.HashSet();
		}
		java.util.Set newSet7  = new java.util.HashSet();
		for(int i=0; i<size7; i++) 
		{
			ims.scheduling.vo.Booking_AppointmentRefVo vo = refCollection7.get(i);					
			ims.scheduling.domain.objects.Booking_Appointment dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.scheduling.domain.objects.Booking_Appointment)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.scheduling.domain.objects.Booking_Appointment)domainFactory.getDomainObject( ims.scheduling.domain.objects.Booking_Appointment.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainAppointments7.contains(dom))
			{
				domainAppointments7.add(dom);
			}
			newSet7.add(dom);			
		}
		java.util.Set removedSet7 = new java.util.HashSet();
		java.util.Iterator iter7 = domainAppointments7.iterator();
		//Find out which objects need to be removed
		while (iter7.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter7.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet7.contains(o))
			{
				removedSet7.add(o);
			}
		}
		iter7 = removedSet7.iterator();
		//Remove the unwanted objects
		while (iter7.hasNext())
		{
			domainAppointments7.remove(iter7.next());
		}		
		
		domainObject.setAppointments(domainAppointments7);		
		ims.core.admin.pas.domain.objects.PASEvent value8 = null;
		if ( null != valueObject.getPasEvent() ) 
		{
			if (valueObject.getPasEvent().getBoId() == null)
			{
				if (domMap.get(valueObject.getPasEvent()) != null)
				{
					value8 = (ims.core.admin.pas.domain.objects.PASEvent)domMap.get(valueObject.getPasEvent());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value8 = domainObject.getPasEvent();	
			}
			else
			{
				value8 = (ims.core.admin.pas.domain.objects.PASEvent)domainFactory.getDomainObject(ims.core.admin.pas.domain.objects.PASEvent.class, valueObject.getPasEvent().getBoId());
			}
		}
		domainObject.setPasEvent(value8);
		domainObject.setCriticalEvents(ims.icp.vo.domain.PatientCriticalEventsVoAssembler.extractPatientCriticalEventsSet(domainFactory, valueObject.getCriticalEvents(), domainObject.getCriticalEvents(), domMap));		
		domainObject.setEvaluationNotes(ims.icp.vo.domain.PatientICPEvaluationNoteVoAssembler.extractPatientICPEvaluationNoteSet(domainFactory, valueObject.getEvaluationNotes(), domainObject.getEvaluationNotes(), domMap));		
		domainObject.setHasOutstandingAdminActions(valueObject.getHasOutstandingAdminActions());
		domainObject.setHasOutstandingNursingActions(valueObject.getHasOutstandingNursingActions());
		domainObject.setHasOutstandingPhysioActions(valueObject.getHasOutstandingPhysioActions());
		domainObject.setHasOutstandingClinicalActions(valueObject.getHasOutstandingClinicalActions());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.icps.configuration.domain.objects.ICP value15 = null;
		if ( null != valueObject.getICP() ) 
		{
			if (valueObject.getICP().getBoId() == null)
			{
				if (domMap.get(valueObject.getICP()) != null)
				{
					value15 = (ims.icps.configuration.domain.objects.ICP)domMap.get(valueObject.getICP());
				}
			}
			else
			{
				value15 = (ims.icps.configuration.domain.objects.ICP)domainFactory.getDomainObject(ims.icps.configuration.domain.objects.ICP.class, valueObject.getICP().getBoId());
			}
		}
		domainObject.setICP(value15);
		ims.core.admin.domain.objects.CareContext value16 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value16 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value16 = domainObject.getCareContext();	
			}
			else
			{
				value16 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value16);

		return domainObject;
	}

}
