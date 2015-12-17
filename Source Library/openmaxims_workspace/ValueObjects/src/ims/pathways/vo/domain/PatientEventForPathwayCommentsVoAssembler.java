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
 * Generated on 12/10/2015, 13:23
 *
 */
package ims.pathways.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Gabriel Maxim
 */
public class PatientEventForPathwayCommentsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.pathways.vo.PatientEventForPathwayCommentsVo copy(ims.pathways.vo.PatientEventForPathwayCommentsVo valueObjectDest, ims.pathways.vo.PatientEventForPathwayCommentsVo valueObjectSrc) 
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
		// EventStatus
		valueObjectDest.setEventStatus(valueObjectSrc.getEventStatus());
		// Journey
		valueObjectDest.setJourney(valueObjectSrc.getJourney());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientEventForPathwayCommentsVoCollectionFromPatientEvent(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.pathways.domain.objects.PatientEvent objects.
	 */
	public static ims.pathways.vo.PatientEventForPathwayCommentsVoCollection createPatientEventForPathwayCommentsVoCollectionFromPatientEvent(java.util.Set domainObjectSet)	
	{
		return createPatientEventForPathwayCommentsVoCollectionFromPatientEvent(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.pathways.domain.objects.PatientEvent objects.
	 */
	public static ims.pathways.vo.PatientEventForPathwayCommentsVoCollection createPatientEventForPathwayCommentsVoCollectionFromPatientEvent(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.pathways.vo.PatientEventForPathwayCommentsVoCollection voList = new ims.pathways.vo.PatientEventForPathwayCommentsVoCollection();
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
			ims.pathways.vo.PatientEventForPathwayCommentsVo vo = create(map, domainObject);
			
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
	public static ims.pathways.vo.PatientEventForPathwayCommentsVoCollection createPatientEventForPathwayCommentsVoCollectionFromPatientEvent(java.util.List domainObjectList) 
	{
		return createPatientEventForPathwayCommentsVoCollectionFromPatientEvent(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.pathways.domain.objects.PatientEvent objects.
	 */
	public static ims.pathways.vo.PatientEventForPathwayCommentsVoCollection createPatientEventForPathwayCommentsVoCollectionFromPatientEvent(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.pathways.vo.PatientEventForPathwayCommentsVoCollection voList = new ims.pathways.vo.PatientEventForPathwayCommentsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.pathways.domain.objects.PatientEvent domainObject = (ims.pathways.domain.objects.PatientEvent) domainObjectList.get(i);
			ims.pathways.vo.PatientEventForPathwayCommentsVo vo = create(map, domainObject);

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
	 public static java.util.Set extractPatientEventSet(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.PatientEventForPathwayCommentsVoCollection voCollection) 
	 {
	 	return extractPatientEventSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientEventSet(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.PatientEventForPathwayCommentsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.pathways.vo.PatientEventForPathwayCommentsVo vo = voCollection.get(i);
			ims.pathways.domain.objects.PatientEvent domainObject = PatientEventForPathwayCommentsVoAssembler.extractPatientEvent(domainFactory, vo, domMap);

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
	 public static java.util.List extractPatientEventList(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.PatientEventForPathwayCommentsVoCollection voCollection) 
	 {
	 	return extractPatientEventList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientEventList(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.PatientEventForPathwayCommentsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.pathways.vo.PatientEventForPathwayCommentsVo vo = voCollection.get(i);
			ims.pathways.domain.objects.PatientEvent domainObject = PatientEventForPathwayCommentsVoAssembler.extractPatientEvent(domainFactory, vo, domMap);

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
	 public static ims.pathways.vo.PatientEventForPathwayCommentsVo create(ims.pathways.domain.objects.PatientEvent domainObject) 
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
	  public static ims.pathways.vo.PatientEventForPathwayCommentsVo create(DomainObjectMap map, ims.pathways.domain.objects.PatientEvent domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.pathways.vo.PatientEventForPathwayCommentsVo valueObject = (ims.pathways.vo.PatientEventForPathwayCommentsVo) map.getValueObject(domainObject, ims.pathways.vo.PatientEventForPathwayCommentsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.pathways.vo.PatientEventForPathwayCommentsVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.pathways.vo.PatientEventForPathwayCommentsVo insert(ims.pathways.vo.PatientEventForPathwayCommentsVo valueObject, ims.pathways.domain.objects.PatientEvent domainObject) 
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
	 public static ims.pathways.vo.PatientEventForPathwayCommentsVo insert(DomainObjectMap map, ims.pathways.vo.PatientEventForPathwayCommentsVo valueObject, ims.pathways.domain.objects.PatientEvent domainObject) 
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
		valueObject.setEvent(ims.pathways.vo.domain.EventMinVoAssembler.create(map, domainObject.getEvent()) );
		// Description
		valueObject.setDescription(domainObject.getDescription());
		// EventDateTime
		java.util.Date EventDateTime = domainObject.getEventDateTime();
		if ( null != EventDateTime ) 
		{
			valueObject.setEventDateTime(new ims.framework.utils.DateTime(EventDateTime) );
		}
		// EventStatus
		ims.domain.lookups.LookupInstance instance4 = domainObject.getEventStatus();
		if ( null != instance4 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance4.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance4.getImage().getImageId(), instance4.getImage().getImagePath());
			}
			color = instance4.getColor();
			if (color != null) 
				color.getValue();

			ims.pathways.vo.lookups.EventStatus voLookup4 = new ims.pathways.vo.lookups.EventStatus(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.pathways.vo.lookups.EventStatus parentVoLookup4 = voLookup4;
			ims.domain.lookups.LookupInstance parent4 = instance4.getParent();
			while (parent4 != null)
			{
				if (parent4.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent4.getImage().getImageId(), parent4.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent4.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup4.setParent(new ims.pathways.vo.lookups.EventStatus(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setEventStatus(voLookup4);
		}
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
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.pathways.domain.objects.PatientEvent extractPatientEvent(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.PatientEventForPathwayCommentsVo valueObject) 
	{
		return 	extractPatientEvent(domainFactory, valueObject, new HashMap());
	}

	public static ims.pathways.domain.objects.PatientEvent extractPatientEvent(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.PatientEventForPathwayCommentsVo valueObject, HashMap domMap) 
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
			// ims.pathways.vo.PatientEventForPathwayCommentsVo ID_PatientEvent field is unknown
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

	// SaveAsRefVO - treated as a refVo in extract methods
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
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getEventStatus() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getEventStatus().getID());
		}
		domainObject.setEventStatus(value4);
		ims.pathways.domain.objects.PatientPathwayJourney value5 = null;
		if ( null != valueObject.getJourney() ) 
		{
			if (valueObject.getJourney().getBoId() == null)
			{
				if (domMap.get(valueObject.getJourney()) != null)
				{
					value5 = (ims.pathways.domain.objects.PatientPathwayJourney)domMap.get(valueObject.getJourney());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value5 = domainObject.getJourney();	
			}
			else
			{
				value5 = (ims.pathways.domain.objects.PatientPathwayJourney)domainFactory.getDomainObject(ims.pathways.domain.objects.PatientPathwayJourney.class, valueObject.getJourney().getBoId());
			}
		}
		domainObject.setJourney(value5);

		return domainObject;
	}

}
