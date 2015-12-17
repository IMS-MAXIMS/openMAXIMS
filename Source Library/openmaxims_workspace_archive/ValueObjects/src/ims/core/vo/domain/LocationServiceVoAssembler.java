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
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Daniel Laffan
 */
public class LocationServiceVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.LocationServiceVo copy(ims.core.vo.LocationServiceVo valueObjectDest, ims.core.vo.LocationServiceVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_LocationService(valueObjectSrc.getID_LocationService());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Contact
		valueObjectDest.setContact(valueObjectSrc.getContact());
		// Location
		valueObjectDest.setLocation(valueObjectSrc.getLocation());
		// isActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
		// Service
		valueObjectDest.setService(valueObjectSrc.getService());
		// EffectiveTo
		valueObjectDest.setEffectiveTo(valueObjectSrc.getEffectiveTo());
		// Functions
		valueObjectDest.setFunctions(valueObjectSrc.getFunctions());
		// Activities
		valueObjectDest.setActivities(valueObjectSrc.getActivities());
		// DefaultPrinter
		valueObjectDest.setDefaultPrinter(valueObjectSrc.getDefaultPrinter());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createLocationServiceVoCollectionFromLocationService(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.resource.place.domain.objects.LocationService objects.
	 */
	public static ims.core.vo.LocationServiceVoCollection createLocationServiceVoCollectionFromLocationService(java.util.Set domainObjectSet)	
	{
		return createLocationServiceVoCollectionFromLocationService(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.resource.place.domain.objects.LocationService objects.
	 */
	public static ims.core.vo.LocationServiceVoCollection createLocationServiceVoCollectionFromLocationService(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.LocationServiceVoCollection voList = new ims.core.vo.LocationServiceVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.resource.place.domain.objects.LocationService domainObject = (ims.core.resource.place.domain.objects.LocationService) iterator.next();
			ims.core.vo.LocationServiceVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.resource.place.domain.objects.LocationService objects.
	 */
	public static ims.core.vo.LocationServiceVoCollection createLocationServiceVoCollectionFromLocationService(java.util.List domainObjectList) 
	{
		return createLocationServiceVoCollectionFromLocationService(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.resource.place.domain.objects.LocationService objects.
	 */
	public static ims.core.vo.LocationServiceVoCollection createLocationServiceVoCollectionFromLocationService(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.LocationServiceVoCollection voList = new ims.core.vo.LocationServiceVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.resource.place.domain.objects.LocationService domainObject = (ims.core.resource.place.domain.objects.LocationService) domainObjectList.get(i);
			ims.core.vo.LocationServiceVo vo = create(map, domainObject);

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
	 * Create the ims.core.resource.place.domain.objects.LocationService set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractLocationServiceSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.LocationServiceVoCollection voCollection) 
	 {
	 	return extractLocationServiceSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractLocationServiceSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.LocationServiceVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.LocationServiceVo vo = voCollection.get(i);
			ims.core.resource.place.domain.objects.LocationService domainObject = LocationServiceVoAssembler.extractLocationService(domainFactory, vo, domMap);

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
	 * Create the ims.core.resource.place.domain.objects.LocationService list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractLocationServiceList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.LocationServiceVoCollection voCollection) 
	 {
	 	return extractLocationServiceList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractLocationServiceList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.LocationServiceVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.LocationServiceVo vo = voCollection.get(i);
			ims.core.resource.place.domain.objects.LocationService domainObject = LocationServiceVoAssembler.extractLocationService(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.resource.place.domain.objects.LocationService object.
	 * @param domainObject ims.core.resource.place.domain.objects.LocationService
	 */
	 public static ims.core.vo.LocationServiceVo create(ims.core.resource.place.domain.objects.LocationService domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.resource.place.domain.objects.LocationService object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.LocationServiceVo create(DomainObjectMap map, ims.core.resource.place.domain.objects.LocationService domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.LocationServiceVo valueObject = (ims.core.vo.LocationServiceVo) map.getValueObject(domainObject, ims.core.vo.LocationServiceVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.LocationServiceVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.resource.place.domain.objects.LocationService
	 */
	 public static ims.core.vo.LocationServiceVo insert(ims.core.vo.LocationServiceVo valueObject, ims.core.resource.place.domain.objects.LocationService domainObject) 
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
	 * @param domainObject ims.core.resource.place.domain.objects.LocationService
	 */
	 public static ims.core.vo.LocationServiceVo insert(DomainObjectMap map, ims.core.vo.LocationServiceVo valueObject, ims.core.resource.place.domain.objects.LocationService domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_LocationService(domainObject.getId());
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
			
		// Contact
		valueObject.setContact(ims.core.vo.domain.ServiceContactVoAssembler.create(map, domainObject.getContact()) );
		// Location
		valueObject.setLocation(ims.core.vo.domain.LocShortVoAssembler.create(map, domainObject.getLocation()) );
		// isActive
		valueObject.setIsActive( domainObject.isIsActive() );
		// Service
		valueObject.setService(ims.core.vo.domain.ServiceVoAssembler.create(map, domainObject.getService()) );
		// EffectiveTo
		java.util.Date EffectiveTo = domainObject.getEffectiveTo();
		if ( null != EffectiveTo ) 
		{
			valueObject.setEffectiveTo(new ims.framework.utils.Date(EffectiveTo) );
		}
		// Functions
		valueObject.setFunctions(ims.core.vo.domain.LocationServiceFunctionsVoAssembler.createLocationServiceFunctionsVoCollectionFromLocationServiceFunction(map, domainObject.getFunctions()) );
		// Activities
		valueObject.setActivities(ims.core.vo.domain.LocationServiceActivityVoAssembler.createLocationServiceActivityVoCollectionFromLocationServiceActivity(map, domainObject.getActivities()) );
		// DefaultPrinter
		valueObject.setDefaultPrinter(domainObject.getDefaultPrinter());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.resource.place.domain.objects.LocationService extractLocationService(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.LocationServiceVo valueObject) 
	{
		return 	extractLocationService(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.resource.place.domain.objects.LocationService extractLocationService(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.LocationServiceVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_LocationService();
		ims.core.resource.place.domain.objects.LocationService domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.resource.place.domain.objects.LocationService)domMap.get(valueObject);
			}
			// ims.core.vo.LocationServiceVo ID_LocationService field is unknown
			domainObject = new ims.core.resource.place.domain.objects.LocationService();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_LocationService());
			if (domMap.get(key) != null)
			{
				return (ims.core.resource.place.domain.objects.LocationService)domMap.get(key);
			}
			domainObject = (ims.core.resource.place.domain.objects.LocationService) domainFactory.getDomainObject(ims.core.resource.place.domain.objects.LocationService.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_LocationService());

		domainObject.setContact(ims.core.vo.domain.ServiceContactVoAssembler.extractServiceContact(domainFactory, valueObject.getContact(), domMap));
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value2 = null;
		if ( null != valueObject.getLocation() ) 
		{
			if (valueObject.getLocation().getBoId() == null)
			{
				if (domMap.get(valueObject.getLocation()) != null)
				{
					value2 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getLocation());
				}
			}
			else
			{
				value2 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getLocation().getBoId());
			}
		}
		domainObject.setLocation(value2);
		domainObject.setIsActive(valueObject.getIsActive());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.Service value4 = null;
		if ( null != valueObject.getService() ) 
		{
			if (valueObject.getService().getBoId() == null)
			{
				if (domMap.get(valueObject.getService()) != null)
				{
					value4 = (ims.core.clinical.domain.objects.Service)domMap.get(valueObject.getService());
				}
			}
			else
			{
				value4 = (ims.core.clinical.domain.objects.Service)domainFactory.getDomainObject(ims.core.clinical.domain.objects.Service.class, valueObject.getService().getBoId());
			}
		}
		domainObject.setService(value4);
		java.util.Date value5 = null;
		ims.framework.utils.Date date5 = valueObject.getEffectiveTo();		
		if ( date5 != null ) 
		{
			value5 = date5.getDate();
		}
		domainObject.setEffectiveTo(value5);
		domainObject.setFunctions(ims.core.vo.domain.LocationServiceFunctionsVoAssembler.extractLocationServiceFunctionSet(domainFactory, valueObject.getFunctions(), domainObject.getFunctions(), domMap));		
		domainObject.setActivities(ims.core.vo.domain.LocationServiceActivityVoAssembler.extractLocationServiceActivitySet(domainFactory, valueObject.getActivities(), domainObject.getActivities(), domMap));		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDefaultPrinter() != null && valueObject.getDefaultPrinter().equals(""))
		{
			valueObject.setDefaultPrinter(null);
		}
		domainObject.setDefaultPrinter(valueObject.getDefaultPrinter());

		return domainObject;
	}

}
