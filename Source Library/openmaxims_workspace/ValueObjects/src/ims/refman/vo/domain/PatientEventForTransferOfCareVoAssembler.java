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
/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5589.25814)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated on 12/10/2015, 13:24
 *
 */
package ims.RefMan.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cornel Ventuneac
 */
public class PatientEventForTransferOfCareVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.PatientEventForTransferOfCareVo copy(ims.RefMan.vo.PatientEventForTransferOfCareVo valueObjectDest, ims.RefMan.vo.PatientEventForTransferOfCareVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientEvent(valueObjectSrc.getID_PatientEvent());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// Event
		valueObjectDest.setEvent(valueObjectSrc.getEvent());
		// Description
		valueObjectDest.setDescription(valueObjectSrc.getDescription());
		// EventDateTime
		valueObjectDest.setEventDateTime(valueObjectSrc.getEventDateTime());
		// EventStatus
		valueObjectDest.setEventStatus(valueObjectSrc.getEventStatus());
		// MessageId
		valueObjectDest.setMessageId(valueObjectSrc.getMessageId());
		// ExternalEventId
		valueObjectDest.setExternalEventId(valueObjectSrc.getExternalEventId());
		// Journey
		valueObjectDest.setJourney(valueObjectSrc.getJourney());
		// PatientTarget
		valueObjectDest.setPatientTarget(valueObjectSrc.getPatientTarget());
		// ExternalEvent
		valueObjectDest.setExternalEvent(valueObjectSrc.getExternalEvent());
		// RttExternalEvent
		valueObjectDest.setRttExternalEvent(valueObjectSrc.getRttExternalEvent());
		// ClinicCode
		valueObjectDest.setClinicCode(valueObjectSrc.getClinicCode());
		// Specialty
		valueObjectDest.setSpecialty(valueObjectSrc.getSpecialty());
		// Consultant
		valueObjectDest.setConsultant(valueObjectSrc.getConsultant());
		// ScheduledDate
		valueObjectDest.setScheduledDate(valueObjectSrc.getScheduledDate());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientEventForTransferOfCareVoCollectionFromPatientEvent(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.pathways.domain.objects.PatientEvent objects.
	 */
	public static ims.RefMan.vo.PatientEventForTransferOfCareVoCollection createPatientEventForTransferOfCareVoCollectionFromPatientEvent(java.util.Set domainObjectSet)	
	{
		return createPatientEventForTransferOfCareVoCollectionFromPatientEvent(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.pathways.domain.objects.PatientEvent objects.
	 */
	public static ims.RefMan.vo.PatientEventForTransferOfCareVoCollection createPatientEventForTransferOfCareVoCollectionFromPatientEvent(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.PatientEventForTransferOfCareVoCollection voList = new ims.RefMan.vo.PatientEventForTransferOfCareVoCollection();
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
			ims.RefMan.vo.PatientEventForTransferOfCareVo vo = create(map, domainObject);
			
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
	public static ims.RefMan.vo.PatientEventForTransferOfCareVoCollection createPatientEventForTransferOfCareVoCollectionFromPatientEvent(java.util.List domainObjectList) 
	{
		return createPatientEventForTransferOfCareVoCollectionFromPatientEvent(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.pathways.domain.objects.PatientEvent objects.
	 */
	public static ims.RefMan.vo.PatientEventForTransferOfCareVoCollection createPatientEventForTransferOfCareVoCollectionFromPatientEvent(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.PatientEventForTransferOfCareVoCollection voList = new ims.RefMan.vo.PatientEventForTransferOfCareVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.pathways.domain.objects.PatientEvent domainObject = (ims.pathways.domain.objects.PatientEvent) domainObjectList.get(i);
			ims.RefMan.vo.PatientEventForTransferOfCareVo vo = create(map, domainObject);

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
	 public static java.util.Set extractPatientEventSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientEventForTransferOfCareVoCollection voCollection) 
	 {
	 	return extractPatientEventSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientEventSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientEventForTransferOfCareVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.PatientEventForTransferOfCareVo vo = voCollection.get(i);
			ims.pathways.domain.objects.PatientEvent domainObject = PatientEventForTransferOfCareVoAssembler.extractPatientEvent(domainFactory, vo, domMap);

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
	 public static java.util.List extractPatientEventList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientEventForTransferOfCareVoCollection voCollection) 
	 {
	 	return extractPatientEventList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientEventList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientEventForTransferOfCareVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.PatientEventForTransferOfCareVo vo = voCollection.get(i);
			ims.pathways.domain.objects.PatientEvent domainObject = PatientEventForTransferOfCareVoAssembler.extractPatientEvent(domainFactory, vo, domMap);

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
	 public static ims.RefMan.vo.PatientEventForTransferOfCareVo create(ims.pathways.domain.objects.PatientEvent domainObject) 
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
	  public static ims.RefMan.vo.PatientEventForTransferOfCareVo create(DomainObjectMap map, ims.pathways.domain.objects.PatientEvent domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.PatientEventForTransferOfCareVo valueObject = (ims.RefMan.vo.PatientEventForTransferOfCareVo) map.getValueObject(domainObject, ims.RefMan.vo.PatientEventForTransferOfCareVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.PatientEventForTransferOfCareVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.RefMan.vo.PatientEventForTransferOfCareVo insert(ims.RefMan.vo.PatientEventForTransferOfCareVo valueObject, ims.pathways.domain.objects.PatientEvent domainObject) 
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
	 public static ims.RefMan.vo.PatientEventForTransferOfCareVo insert(DomainObjectMap map, ims.RefMan.vo.PatientEventForTransferOfCareVo valueObject, ims.pathways.domain.objects.PatientEvent domainObject) 
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
		// EventStatus
		ims.domain.lookups.LookupInstance instance5 = domainObject.getEventStatus();
		if ( null != instance5 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance5.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance5.getImage().getImageId(), instance5.getImage().getImagePath());
			}
			color = instance5.getColor();
			if (color != null) 
				color.getValue();

			ims.pathways.vo.lookups.EventStatus voLookup5 = new ims.pathways.vo.lookups.EventStatus(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.pathways.vo.lookups.EventStatus parentVoLookup5 = voLookup5;
			ims.domain.lookups.LookupInstance parent5 = instance5.getParent();
			while (parent5 != null)
			{
				if (parent5.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent5.getImage().getImageId(), parent5.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent5.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup5.setParent(new ims.pathways.vo.lookups.EventStatus(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setEventStatus(voLookup5);
		}
				// MessageId
		valueObject.setMessageId(domainObject.getMessageId());
		// ExternalEventId
		valueObject.setExternalEventId(domainObject.getExternalEventId());
		// Journey
		if (domainObject.getJourney() != null)
		{
			if(domainObject.getJourney() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getJourney();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setJourney(new ims.pathways.vo.PatientPathwayJourneyRefVo(id, -1));				
			}
			else
			{
				valueObject.setJourney(new ims.pathways.vo.PatientPathwayJourneyRefVo(domainObject.getJourney().getId(), domainObject.getJourney().getVersion()));
			}
		}
		// PatientTarget
		valueObject.setPatientTarget(ims.RefMan.vo.domain.PatientJournayTargetForTransferOfCareVoAssembler.create(map, domainObject.getPatientTarget()) );
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
		// ClinicCode
		valueObject.setClinicCode(domainObject.getClinicCode());
		// Specialty
		ims.domain.lookups.LookupInstance instance13 = domainObject.getSpecialty();
		if ( null != instance13 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance13.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance13.getImage().getImageId(), instance13.getImage().getImagePath());
			}
			color = instance13.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.Specialty voLookup13 = new ims.core.vo.lookups.Specialty(instance13.getId(),instance13.getText(), instance13.isActive(), null, img, color);
			ims.core.vo.lookups.Specialty parentVoLookup13 = voLookup13;
			ims.domain.lookups.LookupInstance parent13 = instance13.getParent();
			while (parent13 != null)
			{
				if (parent13.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent13.getImage().getImageId(), parent13.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent13.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup13.setParent(new ims.core.vo.lookups.Specialty(parent13.getId(),parent13.getText(), parent13.isActive(), null, img, color));
				parentVoLookup13 = parentVoLookup13.getParent();
								parent13 = parent13.getParent();
			}			
			valueObject.setSpecialty(voLookup13);
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
		// ScheduledDate
		java.util.Date ScheduledDate = domainObject.getScheduledDate();
		if ( null != ScheduledDate ) 
		{
			valueObject.setScheduledDate(new ims.framework.utils.DateTime(ScheduledDate) );
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.pathways.domain.objects.PatientEvent extractPatientEvent(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientEventForTransferOfCareVo valueObject) 
	{
		return 	extractPatientEvent(domainFactory, valueObject, new HashMap());
	}

	public static ims.pathways.domain.objects.PatientEvent extractPatientEvent(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.PatientEventForTransferOfCareVo valueObject, HashMap domMap) 
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
			// ims.RefMan.vo.PatientEventForTransferOfCareVo ID_PatientEvent field is unknown
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
		ims.pathways.configuration.domain.objects.Event value2 = null;
		if ( null != valueObject.getEvent() ) 
		{
			if (valueObject.getEvent().getBoId() == null)
			{
				if (domMap.get(valueObject.getEvent()) != null)
				{
					value2 = (ims.pathways.configuration.domain.objects.Event)domMap.get(valueObject.getEvent());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getEvent();	
			}
			else
			{
				value2 = (ims.pathways.configuration.domain.objects.Event)domainFactory.getDomainObject(ims.pathways.configuration.domain.objects.Event.class, valueObject.getEvent().getBoId());
			}
		}
		domainObject.setEvent(value2);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDescription() != null && valueObject.getDescription().equals(""))
		{
			valueObject.setDescription(null);
		}
		domainObject.setDescription(valueObject.getDescription());
		ims.framework.utils.DateTime dateTime4 = valueObject.getEventDateTime();
		java.util.Date value4 = null;
		if ( dateTime4 != null ) 
		{
			value4 = dateTime4.getJavaDate();
		}
		domainObject.setEventDateTime(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getEventStatus() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getEventStatus().getID());
		}
		domainObject.setEventStatus(value5);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getMessageId() != null && valueObject.getMessageId().equals(""))
		{
			valueObject.setMessageId(null);
		}
		domainObject.setMessageId(valueObject.getMessageId());
		domainObject.setExternalEventId(valueObject.getExternalEventId());
		ims.pathways.domain.objects.PatientPathwayJourney value8 = null;
		if ( null != valueObject.getJourney() ) 
		{
			if (valueObject.getJourney().getBoId() == null)
			{
				if (domMap.get(valueObject.getJourney()) != null)
				{
					value8 = (ims.pathways.domain.objects.PatientPathwayJourney)domMap.get(valueObject.getJourney());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value8 = domainObject.getJourney();	
			}
			else
			{
				value8 = (ims.pathways.domain.objects.PatientPathwayJourney)domainFactory.getDomainObject(ims.pathways.domain.objects.PatientPathwayJourney.class, valueObject.getJourney().getBoId());
			}
		}
		domainObject.setJourney(value8);
		domainObject.setPatientTarget(ims.RefMan.vo.domain.PatientJournayTargetForTransferOfCareVoAssembler.extractPatientJourneyTarget(domainFactory, valueObject.getPatientTarget(), domMap));
		ims.pathways.configuration.domain.objects.ExternalEventMapping value10 = null;
		if ( null != valueObject.getExternalEvent() ) 
		{
			if (valueObject.getExternalEvent().getBoId() == null)
			{
				if (domMap.get(valueObject.getExternalEvent()) != null)
				{
					value10 = (ims.pathways.configuration.domain.objects.ExternalEventMapping)domMap.get(valueObject.getExternalEvent());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value10 = domainObject.getExternalEvent();	
			}
			else
			{
				value10 = (ims.pathways.configuration.domain.objects.ExternalEventMapping)domainFactory.getDomainObject(ims.pathways.configuration.domain.objects.ExternalEventMapping.class, valueObject.getExternalEvent().getBoId());
			}
		}
		domainObject.setExternalEvent(value10);
		ims.pathways.configuration.domain.objects.RTTEvent value11 = null;
		if ( null != valueObject.getRttExternalEvent() ) 
		{
			if (valueObject.getRttExternalEvent().getBoId() == null)
			{
				if (domMap.get(valueObject.getRttExternalEvent()) != null)
				{
					value11 = (ims.pathways.configuration.domain.objects.RTTEvent)domMap.get(valueObject.getRttExternalEvent());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value11 = domainObject.getRttExternalEvent();	
			}
			else
			{
				value11 = (ims.pathways.configuration.domain.objects.RTTEvent)domainFactory.getDomainObject(ims.pathways.configuration.domain.objects.RTTEvent.class, valueObject.getRttExternalEvent().getBoId());
			}
		}
		domainObject.setRttExternalEvent(value11);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getClinicCode() != null && valueObject.getClinicCode().equals(""))
		{
			valueObject.setClinicCode(null);
		}
		domainObject.setClinicCode(valueObject.getClinicCode());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value13 = null;
		if ( null != valueObject.getSpecialty() ) 
		{
			value13 =
				domainFactory.getLookupInstance(valueObject.getSpecialty().getID());
		}
		domainObject.setSpecialty(value13);
		ims.core.resource.people.domain.objects.Hcp value14 = null;
		if ( null != valueObject.getConsultant() ) 
		{
			if (valueObject.getConsultant().getBoId() == null)
			{
				if (domMap.get(valueObject.getConsultant()) != null)
				{
					value14 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getConsultant());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value14 = domainObject.getConsultant();	
			}
			else
			{
				value14 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getConsultant().getBoId());
			}
		}
		domainObject.setConsultant(value14);
		ims.framework.utils.DateTime dateTime15 = valueObject.getScheduledDate();
		java.util.Date value15 = null;
		if ( dateTime15 != null ) 
		{
			value15 = dateTime15.getJavaDate();
		}
		domainObject.setScheduledDate(value15);

		return domainObject;
	}

}
