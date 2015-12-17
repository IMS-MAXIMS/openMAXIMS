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
 * @author Rory Fitzpatrick
 */
public class EventLiteVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.pathways.vo.EventLiteVo copy(ims.pathways.vo.EventLiteVo valueObjectDest, ims.pathways.vo.EventLiteVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Event(valueObjectSrc.getID_Event());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Name
		valueObjectDest.setName(valueObjectSrc.getName());
		// Description
		valueObjectDest.setDescription(valueObjectSrc.getDescription());
		// Icon
		valueObjectDest.setIcon(valueObjectSrc.getIcon());
		// Status
		valueObjectDest.setStatus(valueObjectSrc.getStatus());
		// ActioningRoles
		valueObjectDest.setActioningRoles(valueObjectSrc.getActioningRoles());
		// PatientDiaryImpact
		valueObjectDest.setPatientDiaryImpact(valueObjectSrc.getPatientDiaryImpact());
		// EventType
		valueObjectDest.setEventType(valueObjectSrc.getEventType());
		// StartsClock
		valueObjectDest.setStartsClock(valueObjectSrc.getStartsClock());
		// StopsClock
		valueObjectDest.setStopsClock(valueObjectSrc.getStopsClock());
		// EndsPathway
		valueObjectDest.setEndsPathway(valueObjectSrc.getEndsPathway());
		// IsManualScheduledEvent
		valueObjectDest.setIsManualScheduledEvent(valueObjectSrc.getIsManualScheduledEvent());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createEventLiteVoCollectionFromEvent(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.pathways.configuration.domain.objects.Event objects.
	 */
	public static ims.pathways.vo.EventLiteVoCollection createEventLiteVoCollectionFromEvent(java.util.Set domainObjectSet)	
	{
		return createEventLiteVoCollectionFromEvent(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.pathways.configuration.domain.objects.Event objects.
	 */
	public static ims.pathways.vo.EventLiteVoCollection createEventLiteVoCollectionFromEvent(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.pathways.vo.EventLiteVoCollection voList = new ims.pathways.vo.EventLiteVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.pathways.configuration.domain.objects.Event domainObject = (ims.pathways.configuration.domain.objects.Event) iterator.next();
			ims.pathways.vo.EventLiteVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.pathways.configuration.domain.objects.Event objects.
	 */
	public static ims.pathways.vo.EventLiteVoCollection createEventLiteVoCollectionFromEvent(java.util.List domainObjectList) 
	{
		return createEventLiteVoCollectionFromEvent(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.pathways.configuration.domain.objects.Event objects.
	 */
	public static ims.pathways.vo.EventLiteVoCollection createEventLiteVoCollectionFromEvent(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.pathways.vo.EventLiteVoCollection voList = new ims.pathways.vo.EventLiteVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.pathways.configuration.domain.objects.Event domainObject = (ims.pathways.configuration.domain.objects.Event) domainObjectList.get(i);
			ims.pathways.vo.EventLiteVo vo = create(map, domainObject);

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
	 * Create the ims.pathways.configuration.domain.objects.Event set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractEventSet(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.EventLiteVoCollection voCollection) 
	 {
	 	return extractEventSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractEventSet(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.EventLiteVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.pathways.vo.EventLiteVo vo = voCollection.get(i);
			ims.pathways.configuration.domain.objects.Event domainObject = EventLiteVoAssembler.extractEvent(domainFactory, vo, domMap);

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
	 * Create the ims.pathways.configuration.domain.objects.Event list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractEventList(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.EventLiteVoCollection voCollection) 
	 {
	 	return extractEventList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractEventList(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.EventLiteVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.pathways.vo.EventLiteVo vo = voCollection.get(i);
			ims.pathways.configuration.domain.objects.Event domainObject = EventLiteVoAssembler.extractEvent(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.pathways.configuration.domain.objects.Event object.
	 * @param domainObject ims.pathways.configuration.domain.objects.Event
	 */
	 public static ims.pathways.vo.EventLiteVo create(ims.pathways.configuration.domain.objects.Event domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.pathways.configuration.domain.objects.Event object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.pathways.vo.EventLiteVo create(DomainObjectMap map, ims.pathways.configuration.domain.objects.Event domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.pathways.vo.EventLiteVo valueObject = (ims.pathways.vo.EventLiteVo) map.getValueObject(domainObject, ims.pathways.vo.EventLiteVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.pathways.vo.EventLiteVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.pathways.configuration.domain.objects.Event
	 */
	 public static ims.pathways.vo.EventLiteVo insert(ims.pathways.vo.EventLiteVo valueObject, ims.pathways.configuration.domain.objects.Event domainObject) 
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
	 * @param domainObject ims.pathways.configuration.domain.objects.Event
	 */
	 public static ims.pathways.vo.EventLiteVo insert(DomainObjectMap map, ims.pathways.vo.EventLiteVo valueObject, ims.pathways.configuration.domain.objects.Event domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Event(domainObject.getId());
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
			
		// Name
		valueObject.setName(domainObject.getName());
		// Description
		valueObject.setDescription(domainObject.getDescription());
		// Icon
		valueObject.setIcon(ims.admin.vo.domain.AppImageVoAssembler.create(map, domainObject.getIcon()) );
		// Status
		ims.domain.lookups.LookupInstance instance4 = domainObject.getStatus();
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

			ims.core.vo.lookups.PreActiveActiveInactiveStatus voLookup4 = new ims.core.vo.lookups.PreActiveActiveInactiveStatus(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.PreActiveActiveInactiveStatus parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.core.vo.lookups.PreActiveActiveInactiveStatus(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setStatus(voLookup4);
		}
				// ActioningRoles
		valueObject.setActioningRoles(ims.admin.vo.domain.AppRoleShortVoAssembler.createAppRoleShortVoCollectionFromAppRole(map, domainObject.getActioningRoles()) );
		// PatientDiaryImpact
		valueObject.setPatientDiaryImpact( domainObject.isPatientDiaryImpact() );
		// EventType
		ims.domain.lookups.LookupInstance instance7 = domainObject.getEventType();
		if ( null != instance7 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance7.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance7.getImage().getImageId(), instance7.getImage().getImagePath());
			}
			color = instance7.getColor();
			if (color != null) 
				color.getValue();

			ims.pathways.vo.lookups.EventCreationType voLookup7 = new ims.pathways.vo.lookups.EventCreationType(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.pathways.vo.lookups.EventCreationType parentVoLookup7 = voLookup7;
			ims.domain.lookups.LookupInstance parent7 = instance7.getParent();
			while (parent7 != null)
			{
				if (parent7.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent7.getImage().getImageId(), parent7.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent7.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup7.setParent(new ims.pathways.vo.lookups.EventCreationType(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setEventType(voLookup7);
		}
				// StartsClock
		valueObject.setStartsClock( domainObject.isStartsClock() );
		// StopsClock
		valueObject.setStopsClock( domainObject.isStopsClock() );
		// EndsPathway
		valueObject.setEndsPathway( domainObject.isEndsPathway() );
		// IsManualScheduledEvent
		valueObject.setIsManualScheduledEvent( domainObject.isIsManualScheduledEvent() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.pathways.configuration.domain.objects.Event extractEvent(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.EventLiteVo valueObject) 
	{
		return 	extractEvent(domainFactory, valueObject, new HashMap());
	}

	public static ims.pathways.configuration.domain.objects.Event extractEvent(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.EventLiteVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Event();
		ims.pathways.configuration.domain.objects.Event domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.pathways.configuration.domain.objects.Event)domMap.get(valueObject);
			}
			// ims.pathways.vo.EventLiteVo ID_Event field is unknown
			domainObject = new ims.pathways.configuration.domain.objects.Event();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Event());
			if (domMap.get(key) != null)
			{
				return (ims.pathways.configuration.domain.objects.Event)domMap.get(key);
			}
			domainObject = (ims.pathways.configuration.domain.objects.Event) domainFactory.getDomainObject(ims.pathways.configuration.domain.objects.Event.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Event());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getName() != null && valueObject.getName().equals(""))
		{
			valueObject.setName(null);
		}
		domainObject.setName(valueObject.getName());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDescription() != null && valueObject.getDescription().equals(""))
		{
			valueObject.setDescription(null);
		}
		domainObject.setDescription(valueObject.getDescription());
		domainObject.setIcon(ims.admin.vo.domain.AppImageVoAssembler.extractAppImage(domainFactory, valueObject.getIcon(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getStatus() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getStatus().getID());
		}
		domainObject.setStatus(value4);
		domainObject.setActioningRoles(ims.admin.vo.domain.AppRoleShortVoAssembler.extractAppRoleSet(domainFactory, valueObject.getActioningRoles(), domainObject.getActioningRoles(), domMap));		
		domainObject.setPatientDiaryImpact(valueObject.getPatientDiaryImpact());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getEventType() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getEventType().getID());
		}
		domainObject.setEventType(value7);
		domainObject.setStartsClock(valueObject.getStartsClock());
		domainObject.setStopsClock(valueObject.getStopsClock());
		domainObject.setEndsPathway(valueObject.getEndsPathway());
		domainObject.setIsManualScheduledEvent(valueObject.getIsManualScheduledEvent());

		return domainObject;
	}

}
