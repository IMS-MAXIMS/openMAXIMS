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
 * Generated on 16/04/2014, 12:31
 *
 */
package ims.pathways.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Barbara Worwood
 */
public class PatientEventVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.pathways.vo.PatientEventVo copy(ims.pathways.vo.PatientEventVo valueObjectDest, ims.pathways.vo.PatientEventVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientEvent(valueObjectSrc.getID_PatientEvent());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Event
		valueObjectDest.setEvent(valueObjectSrc.getEvent());
		// Description
		valueObjectDest.setDescription(valueObjectSrc.getDescription());
		// EventDateTime
		valueObjectDest.setEventDateTime(valueObjectSrc.getEventDateTime());
		// MessageId
		valueObjectDest.setMessageId(valueObjectSrc.getMessageId());
		// Journey
		valueObjectDest.setJourney(valueObjectSrc.getJourney());
		// PatientTarget
		valueObjectDest.setPatientTarget(valueObjectSrc.getPatientTarget());
		// ExternalEvent
		valueObjectDest.setExternalEvent(valueObjectSrc.getExternalEvent());
		// ClinicCode
		valueObjectDest.setClinicCode(valueObjectSrc.getClinicCode());
		// Specialty
		valueObjectDest.setSpecialty(valueObjectSrc.getSpecialty());
		// Consultant
		valueObjectDest.setConsultant(valueObjectSrc.getConsultant());
		// ExternalEventId
		valueObjectDest.setExternalEventId(valueObjectSrc.getExternalEventId());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// RttExternalEvent
		valueObjectDest.setRttExternalEvent(valueObjectSrc.getRttExternalEvent());
		// ScheduledDate
		valueObjectDest.setScheduledDate(valueObjectSrc.getScheduledDate());
		// EventStatus
		valueObjectDest.setEventStatus(valueObjectSrc.getEventStatus());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientEventVoCollectionFromPatientEvent(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.pathways.domain.objects.PatientEvent objects.
	 */
	public static ims.pathways.vo.PatientEventVoCollection createPatientEventVoCollectionFromPatientEvent(java.util.Set domainObjectSet)	
	{
		return createPatientEventVoCollectionFromPatientEvent(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.pathways.domain.objects.PatientEvent objects.
	 */
	public static ims.pathways.vo.PatientEventVoCollection createPatientEventVoCollectionFromPatientEvent(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.pathways.vo.PatientEventVoCollection voList = new ims.pathways.vo.PatientEventVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.pathways.domain.objects.PatientEvent domainObject = (ims.pathways.domain.objects.PatientEvent) iterator.next();
			ims.pathways.vo.PatientEventVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.pathways.domain.objects.PatientEvent objects.
	 */
	public static ims.pathways.vo.PatientEventVoCollection createPatientEventVoCollectionFromPatientEvent(java.util.List domainObjectList) 
	{
		return createPatientEventVoCollectionFromPatientEvent(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.pathways.domain.objects.PatientEvent objects.
	 */
	public static ims.pathways.vo.PatientEventVoCollection createPatientEventVoCollectionFromPatientEvent(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.pathways.vo.PatientEventVoCollection voList = new ims.pathways.vo.PatientEventVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.pathways.domain.objects.PatientEvent domainObject = (ims.pathways.domain.objects.PatientEvent) domainObjectList.get(i);
			ims.pathways.vo.PatientEventVo vo = create(map, domainObject);

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
	 * Create the ims.pathways.domain.objects.PatientEvent set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientEventSet(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.PatientEventVoCollection voCollection) 
	 {
	 	return extractPatientEventSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientEventSet(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.PatientEventVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.pathways.vo.PatientEventVo vo = voCollection.get(i);
			ims.pathways.domain.objects.PatientEvent domainObject = PatientEventVoAssembler.extractPatientEvent(domainFactory, vo, domMap);

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
	 * Create the ims.pathways.domain.objects.PatientEvent list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientEventList(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.PatientEventVoCollection voCollection) 
	 {
	 	return extractPatientEventList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientEventList(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.PatientEventVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.pathways.vo.PatientEventVo vo = voCollection.get(i);
			ims.pathways.domain.objects.PatientEvent domainObject = PatientEventVoAssembler.extractPatientEvent(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.pathways.domain.objects.PatientEvent object.
	 * @param domainObject ims.pathways.domain.objects.PatientEvent
	 */
	 public static ims.pathways.vo.PatientEventVo create(ims.pathways.domain.objects.PatientEvent domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.pathways.domain.objects.PatientEvent object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.pathways.vo.PatientEventVo create(DomainObjectMap map, ims.pathways.domain.objects.PatientEvent domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.pathways.vo.PatientEventVo valueObject = (ims.pathways.vo.PatientEventVo) map.getValueObject(domainObject, ims.pathways.vo.PatientEventVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.pathways.vo.PatientEventVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.pathways.domain.objects.PatientEvent
	 */
	 public static ims.pathways.vo.PatientEventVo insert(ims.pathways.vo.PatientEventVo valueObject, ims.pathways.domain.objects.PatientEvent domainObject) 
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
	 * @param domainObject ims.pathways.domain.objects.PatientEvent
	 */
	 public static ims.pathways.vo.PatientEventVo insert(DomainObjectMap map, ims.pathways.vo.PatientEventVo valueObject, ims.pathways.domain.objects.PatientEvent domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientEvent(domainObject.getId());
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
			
		// Event
		if (domainObject.getEvent() != null)
		{
			if(domainObject.getEvent() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getEvent();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setEvent(new ims.pathways.configuration.vo.EventRefVo(id, -1));				
			}
			else
			{
				valueObject.setEvent(new ims.pathways.configuration.vo.EventRefVo(domainObject.getEvent().getId(), domainObject.getEvent().getVersion()));
			}
		}
		// Description
		valueObject.setDescription(domainObject.getDescription());
		// EventDateTime
		java.util.Date EventDateTime = domainObject.getEventDateTime();
		if ( null != EventDateTime ) 
		{
			valueObject.setEventDateTime(new ims.framework.utils.DateTime(EventDateTime) );
		}
		// MessageId
		valueObject.setMessageId(domainObject.getMessageId());
		// Journey
		valueObject.setJourney(ims.pathways.vo.domain.PatientJourneyVoAssembler.create(map, domainObject.getJourney()) );
		// PatientTarget
		if (domainObject.getPatientTarget() != null)
		{
			if(domainObject.getPatientTarget() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getPatientTarget();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setPatientTarget(new ims.pathways.vo.PatientJourneyTargetRefVo(id, -1));				
			}
			else
			{
				valueObject.setPatientTarget(new ims.pathways.vo.PatientJourneyTargetRefVo(domainObject.getPatientTarget().getId(), domainObject.getPatientTarget().getVersion()));
			}
		}
		// ExternalEvent
		if (domainObject.getExternalEvent() != null)
		{
			if(domainObject.getExternalEvent() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getExternalEvent();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setExternalEvent(new ims.pathways.configuration.vo.ExternalEventMappingRefVo(id, -1));				
			}
			else
			{
				valueObject.setExternalEvent(new ims.pathways.configuration.vo.ExternalEventMappingRefVo(domainObject.getExternalEvent().getId(), domainObject.getExternalEvent().getVersion()));
			}
		}
		// ClinicCode
		valueObject.setClinicCode(domainObject.getClinicCode());
		// Specialty
		ims.domain.lookups.LookupInstance instance9 = domainObject.getSpecialty();
		if ( null != instance9 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance9.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance9.getImage().getImageId(), instance9.getImage().getImagePath());
			}
			color = instance9.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.Specialty voLookup9 = new ims.core.vo.lookups.Specialty(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.core.vo.lookups.Specialty parentVoLookup9 = voLookup9;
			ims.domain.lookups.LookupInstance parent9 = instance9.getParent();
			while (parent9 != null)
			{
				if (parent9.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent9.getImage().getImageId(), parent9.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent9.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup9.setParent(new ims.core.vo.lookups.Specialty(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setSpecialty(voLookup9);
		}
				// Consultant
		if (domainObject.getConsultant() != null)
		{
			if(domainObject.getConsultant() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getConsultant();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setConsultant(new ims.core.resource.people.vo.HcpRefVo(id, -1));				
			}
			else
			{
				valueObject.setConsultant(new ims.core.resource.people.vo.HcpRefVo(domainObject.getConsultant().getId(), domainObject.getConsultant().getVersion()));
			}
		}
		// ExternalEventId
		valueObject.setExternalEventId(domainObject.getExternalEventId());
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
		// RttExternalEvent
		if (domainObject.getRttExternalEvent() != null)
		{
			if(domainObject.getRttExternalEvent() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getRttExternalEvent();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setRttExternalEvent(new ims.pathways.configuration.vo.RTTEventRefVo(id, -1));				
			}
			else
			{
				valueObject.setRttExternalEvent(new ims.pathways.configuration.vo.RTTEventRefVo(domainObject.getRttExternalEvent().getId(), domainObject.getRttExternalEvent().getVersion()));
			}
		}
		// ScheduledDate
		java.util.Date ScheduledDate = domainObject.getScheduledDate();
		if ( null != ScheduledDate ) 
		{
			valueObject.setScheduledDate(new ims.framework.utils.DateTime(ScheduledDate) );
		}
		// EventStatus
		ims.domain.lookups.LookupInstance instance15 = domainObject.getEventStatus();
		if ( null != instance15 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance15.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance15.getImage().getImageId(), instance15.getImage().getImagePath());
			}
			color = instance15.getColor();
			if (color != null) 
				color.getValue();

			ims.pathways.vo.lookups.EventStatus voLookup15 = new ims.pathways.vo.lookups.EventStatus(instance15.getId(),instance15.getText(), instance15.isActive(), null, img, color);
			ims.pathways.vo.lookups.EventStatus parentVoLookup15 = voLookup15;
			ims.domain.lookups.LookupInstance parent15 = instance15.getParent();
			while (parent15 != null)
			{
				if (parent15.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent15.getImage().getImageId(), parent15.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent15.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup15.setParent(new ims.pathways.vo.lookups.EventStatus(parent15.getId(),parent15.getText(), parent15.isActive(), null, img, color));
				parentVoLookup15 = parentVoLookup15.getParent();
								parent15 = parent15.getParent();
			}			
			valueObject.setEventStatus(voLookup15);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.pathways.domain.objects.PatientEvent extractPatientEvent(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.PatientEventVo valueObject) 
	{
		return 	extractPatientEvent(domainFactory, valueObject, new HashMap());
	}

	public static ims.pathways.domain.objects.PatientEvent extractPatientEvent(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.PatientEventVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientEvent();
		ims.pathways.domain.objects.PatientEvent domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.pathways.domain.objects.PatientEvent)domMap.get(valueObject);
			}
			// ims.pathways.vo.PatientEventVo ID_PatientEvent field is unknown
			domainObject = new ims.pathways.domain.objects.PatientEvent();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientEvent());
			if (domMap.get(key) != null)
			{
				return (ims.pathways.domain.objects.PatientEvent)domMap.get(key);
			}
			domainObject = (ims.pathways.domain.objects.PatientEvent) domainFactory.getDomainObject(ims.pathways.domain.objects.PatientEvent.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientEvent());

		ims.pathways.configuration.domain.objects.Event value1 = null;
		if ( null != valueObject.getEvent() ) 
		{
			if (valueObject.getEvent().getBoId() == null)
			{
				if (domMap.get(valueObject.getEvent()) != null)
				{
					value1 = (ims.pathways.configuration.domain.objects.Event)domMap.get(valueObject.getEvent());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getEvent();	
			}
			else
			{
				value1 = (ims.pathways.configuration.domain.objects.Event)domainFactory.getDomainObject(ims.pathways.configuration.domain.objects.Event.class, valueObject.getEvent().getBoId());
			}
		}
		domainObject.setEvent(value1);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDescription() != null && valueObject.getDescription().equals(""))
		{
			valueObject.setDescription(null);
		}
		domainObject.setDescription(valueObject.getDescription());
		ims.framework.utils.DateTime dateTime3 = valueObject.getEventDateTime();
		java.util.Date value3 = null;
		if ( dateTime3 != null ) 
		{
			value3 = dateTime3.getJavaDate();
		}
		domainObject.setEventDateTime(value3);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getMessageId() != null && valueObject.getMessageId().equals(""))
		{
			valueObject.setMessageId(null);
		}
		domainObject.setMessageId(valueObject.getMessageId());
		domainObject.setJourney(ims.pathways.vo.domain.PatientJourneyVoAssembler.extractPatientPathwayJourney(domainFactory, valueObject.getJourney(), domMap));
		ims.pathways.domain.objects.PatientJourneyTarget value6 = null;
		if ( null != valueObject.getPatientTarget() ) 
		{
			if (valueObject.getPatientTarget().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatientTarget()) != null)
				{
					value6 = (ims.pathways.domain.objects.PatientJourneyTarget)domMap.get(valueObject.getPatientTarget());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value6 = domainObject.getPatientTarget();	
			}
			else
			{
				value6 = (ims.pathways.domain.objects.PatientJourneyTarget)domainFactory.getDomainObject(ims.pathways.domain.objects.PatientJourneyTarget.class, valueObject.getPatientTarget().getBoId());
			}
		}
		domainObject.setPatientTarget(value6);
		ims.pathways.configuration.domain.objects.ExternalEventMapping value7 = null;
		if ( null != valueObject.getExternalEvent() ) 
		{
			if (valueObject.getExternalEvent().getBoId() == null)
			{
				if (domMap.get(valueObject.getExternalEvent()) != null)
				{
					value7 = (ims.pathways.configuration.domain.objects.ExternalEventMapping)domMap.get(valueObject.getExternalEvent());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value7 = domainObject.getExternalEvent();	
			}
			else
			{
				value7 = (ims.pathways.configuration.domain.objects.ExternalEventMapping)domainFactory.getDomainObject(ims.pathways.configuration.domain.objects.ExternalEventMapping.class, valueObject.getExternalEvent().getBoId());
			}
		}
		domainObject.setExternalEvent(value7);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getClinicCode() != null && valueObject.getClinicCode().equals(""))
		{
			valueObject.setClinicCode(null);
		}
		domainObject.setClinicCode(valueObject.getClinicCode());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getSpecialty() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getSpecialty().getID());
		}
		domainObject.setSpecialty(value9);
		ims.core.resource.people.domain.objects.Hcp value10 = null;
		if ( null != valueObject.getConsultant() ) 
		{
			if (valueObject.getConsultant().getBoId() == null)
			{
				if (domMap.get(valueObject.getConsultant()) != null)
				{
					value10 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getConsultant());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value10 = domainObject.getConsultant();	
			}
			else
			{
				value10 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getConsultant().getBoId());
			}
		}
		domainObject.setConsultant(value10);
		domainObject.setExternalEventId(valueObject.getExternalEventId());
		ims.core.patient.domain.objects.Patient value12 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value12 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value12 = domainObject.getPatient();	
			}
			else
			{
				value12 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value12);
		ims.pathways.configuration.domain.objects.RTTEvent value13 = null;
		if ( null != valueObject.getRttExternalEvent() ) 
		{
			if (valueObject.getRttExternalEvent().getBoId() == null)
			{
				if (domMap.get(valueObject.getRttExternalEvent()) != null)
				{
					value13 = (ims.pathways.configuration.domain.objects.RTTEvent)domMap.get(valueObject.getRttExternalEvent());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value13 = domainObject.getRttExternalEvent();	
			}
			else
			{
				value13 = (ims.pathways.configuration.domain.objects.RTTEvent)domainFactory.getDomainObject(ims.pathways.configuration.domain.objects.RTTEvent.class, valueObject.getRttExternalEvent().getBoId());
			}
		}
		domainObject.setRttExternalEvent(value13);
		ims.framework.utils.DateTime dateTime14 = valueObject.getScheduledDate();
		java.util.Date value14 = null;
		if ( dateTime14 != null ) 
		{
			value14 = dateTime14.getJavaDate();
		}
		domainObject.setScheduledDate(value14);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value15 = null;
		if ( null != valueObject.getEventStatus() ) 
		{
			value15 =
				domainFactory.getLookupInstance(valueObject.getEventStatus().getID());
		}
		domainObject.setEventStatus(value15);

		return domainObject;
	}

}
