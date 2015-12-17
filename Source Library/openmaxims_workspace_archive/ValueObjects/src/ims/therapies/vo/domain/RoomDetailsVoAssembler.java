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
package ims.therapies.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Peter Martin
 */
public class RoomDetailsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.therapies.vo.RoomDetailsVo copy(ims.therapies.vo.RoomDetailsVo valueObjectDest, ims.therapies.vo.RoomDetailsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_RoomDetails(valueObjectSrc.getID_RoomDetails());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Location
		valueObjectDest.setLocation(valueObjectSrc.getLocation());
		// Access
		valueObjectDest.setAccess(valueObjectSrc.getAccess());
		// DoorWidth
		valueObjectDest.setDoorWidth(valueObjectSrc.getDoorWidth());
		// RoomDetails
		valueObjectDest.setRoomDetails(valueObjectSrc.getRoomDetails());
		// SysInfo
		valueObjectDest.setSysInfo(valueObjectSrc.getSysInfo());
		// UnitOfMeasure
		valueObjectDest.setUnitOfMeasure(valueObjectSrc.getUnitOfMeasure());
		// HomeVisitRoomType
		valueObjectDest.setHomeVisitRoomType(valueObjectSrc.getHomeVisitRoomType());
		// EnvironmentVisitRoomType
		valueObjectDest.setEnvironmentVisitRoomType(valueObjectSrc.getEnvironmentVisitRoomType());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createRoomDetailsVoCollectionFromRoomDetails(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.therapies.homeandenvironmentalvisit.domain.objects.RoomDetails objects.
	 */
	public static ims.therapies.vo.RoomDetailsVoCollection createRoomDetailsVoCollectionFromRoomDetails(java.util.Set domainObjectSet)	
	{
		return createRoomDetailsVoCollectionFromRoomDetails(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.therapies.homeandenvironmentalvisit.domain.objects.RoomDetails objects.
	 */
	public static ims.therapies.vo.RoomDetailsVoCollection createRoomDetailsVoCollectionFromRoomDetails(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.therapies.vo.RoomDetailsVoCollection voList = new ims.therapies.vo.RoomDetailsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.therapies.homeandenvironmentalvisit.domain.objects.RoomDetails domainObject = (ims.therapies.homeandenvironmentalvisit.domain.objects.RoomDetails) iterator.next();
			ims.therapies.vo.RoomDetailsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.therapies.homeandenvironmentalvisit.domain.objects.RoomDetails objects.
	 */
	public static ims.therapies.vo.RoomDetailsVoCollection createRoomDetailsVoCollectionFromRoomDetails(java.util.List domainObjectList) 
	{
		return createRoomDetailsVoCollectionFromRoomDetails(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.therapies.homeandenvironmentalvisit.domain.objects.RoomDetails objects.
	 */
	public static ims.therapies.vo.RoomDetailsVoCollection createRoomDetailsVoCollectionFromRoomDetails(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.therapies.vo.RoomDetailsVoCollection voList = new ims.therapies.vo.RoomDetailsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.therapies.homeandenvironmentalvisit.domain.objects.RoomDetails domainObject = (ims.therapies.homeandenvironmentalvisit.domain.objects.RoomDetails) domainObjectList.get(i);
			ims.therapies.vo.RoomDetailsVo vo = create(map, domainObject);

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
	 * Create the ims.therapies.homeandenvironmentalvisit.domain.objects.RoomDetails set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractRoomDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.RoomDetailsVoCollection voCollection) 
	 {
	 	return extractRoomDetailsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractRoomDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.RoomDetailsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.therapies.vo.RoomDetailsVo vo = voCollection.get(i);
			ims.therapies.homeandenvironmentalvisit.domain.objects.RoomDetails domainObject = RoomDetailsVoAssembler.extractRoomDetails(domainFactory, vo, domMap);

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
	 * Create the ims.therapies.homeandenvironmentalvisit.domain.objects.RoomDetails list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractRoomDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.RoomDetailsVoCollection voCollection) 
	 {
	 	return extractRoomDetailsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractRoomDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.RoomDetailsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.therapies.vo.RoomDetailsVo vo = voCollection.get(i);
			ims.therapies.homeandenvironmentalvisit.domain.objects.RoomDetails domainObject = RoomDetailsVoAssembler.extractRoomDetails(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.therapies.homeandenvironmentalvisit.domain.objects.RoomDetails object.
	 * @param domainObject ims.therapies.homeandenvironmentalvisit.domain.objects.RoomDetails
	 */
	 public static ims.therapies.vo.RoomDetailsVo create(ims.therapies.homeandenvironmentalvisit.domain.objects.RoomDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.therapies.homeandenvironmentalvisit.domain.objects.RoomDetails object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.therapies.vo.RoomDetailsVo create(DomainObjectMap map, ims.therapies.homeandenvironmentalvisit.domain.objects.RoomDetails domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.therapies.vo.RoomDetailsVo valueObject = (ims.therapies.vo.RoomDetailsVo) map.getValueObject(domainObject, ims.therapies.vo.RoomDetailsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.therapies.vo.RoomDetailsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.therapies.homeandenvironmentalvisit.domain.objects.RoomDetails
	 */
	 public static ims.therapies.vo.RoomDetailsVo insert(ims.therapies.vo.RoomDetailsVo valueObject, ims.therapies.homeandenvironmentalvisit.domain.objects.RoomDetails domainObject) 
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
	 * @param domainObject ims.therapies.homeandenvironmentalvisit.domain.objects.RoomDetails
	 */
	 public static ims.therapies.vo.RoomDetailsVo insert(DomainObjectMap map, ims.therapies.vo.RoomDetailsVo valueObject, ims.therapies.homeandenvironmentalvisit.domain.objects.RoomDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_RoomDetails(domainObject.getId());
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
			
		// Location
		ims.domain.lookups.LookupInstance instance1 = domainObject.getLocation();
		if ( null != instance1 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance1.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance1.getImage().getImageId(), instance1.getImage().getImagePath());
			}
			color = instance1.getColor();
			if (color != null) 
				color.getValue();

			ims.spinalinjuries.vo.lookups.RoomLocation voLookup1 = new ims.spinalinjuries.vo.lookups.RoomLocation(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.RoomLocation parentVoLookup1 = voLookup1;
			ims.domain.lookups.LookupInstance parent1 = instance1.getParent();
			while (parent1 != null)
			{
				if (parent1.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent1.getImage().getImageId(), parent1.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent1.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup1.setParent(new ims.spinalinjuries.vo.lookups.RoomLocation(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setLocation(voLookup1);
		}
				// Access
		valueObject.setAccess(domainObject.getAccessDetails());
		// DoorWidth
		valueObject.setDoorWidth(domainObject.getDoorWidth());
		// RoomDetails
		valueObject.setRoomDetails(domainObject.getRoomDetails());
		// SysInfo
		// set system information
		valueObject.setSysInfo(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
		// UnitOfMeasure
		ims.domain.lookups.LookupInstance instance6 = domainObject.getUnitOfMeasure();
		if ( null != instance6 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance6.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance6.getImage().getImageId(), instance6.getImage().getImagePath());
			}
			color = instance6.getColor();
			if (color != null) 
				color.getValue();

			ims.spinalinjuries.vo.lookups.DoorWidthUnitOfMeasurement voLookup6 = new ims.spinalinjuries.vo.lookups.DoorWidthUnitOfMeasurement(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.DoorWidthUnitOfMeasurement parentVoLookup6 = voLookup6;
			ims.domain.lookups.LookupInstance parent6 = instance6.getParent();
			while (parent6 != null)
			{
				if (parent6.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent6.getImage().getImageId(), parent6.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent6.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup6.setParent(new ims.spinalinjuries.vo.lookups.DoorWidthUnitOfMeasurement(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setUnitOfMeasure(voLookup6);
		}
				// HomeVisitRoomType
		ims.domain.lookups.LookupInstance instance7 = domainObject.getHomeVisitRoomType();
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

			ims.spinalinjuries.vo.lookups.RoomType voLookup7 = new ims.spinalinjuries.vo.lookups.RoomType(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.RoomType parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.spinalinjuries.vo.lookups.RoomType(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setHomeVisitRoomType(voLookup7);
		}
				// EnvironmentVisitRoomType
		ims.domain.lookups.LookupInstance instance8 = domainObject.getEnvironmentVisitRoomType();
		if ( null != instance8 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance8.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance8.getImage().getImageId(), instance8.getImage().getImagePath());
			}
			color = instance8.getColor();
			if (color != null) 
				color.getValue();

			ims.spinalinjuries.vo.lookups.EnvironmentVisitRoomType voLookup8 = new ims.spinalinjuries.vo.lookups.EnvironmentVisitRoomType(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.EnvironmentVisitRoomType parentVoLookup8 = voLookup8;
			ims.domain.lookups.LookupInstance parent8 = instance8.getParent();
			while (parent8 != null)
			{
				if (parent8.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent8.getImage().getImageId(), parent8.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent8.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup8.setParent(new ims.spinalinjuries.vo.lookups.EnvironmentVisitRoomType(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setEnvironmentVisitRoomType(voLookup8);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.therapies.homeandenvironmentalvisit.domain.objects.RoomDetails extractRoomDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.RoomDetailsVo valueObject) 
	{
		return 	extractRoomDetails(domainFactory, valueObject, new HashMap());
	}

	public static ims.therapies.homeandenvironmentalvisit.domain.objects.RoomDetails extractRoomDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.RoomDetailsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_RoomDetails();
		ims.therapies.homeandenvironmentalvisit.domain.objects.RoomDetails domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.therapies.homeandenvironmentalvisit.domain.objects.RoomDetails)domMap.get(valueObject);
			}
			// ims.therapies.vo.RoomDetailsVo ID_RoomDetails field is unknown
			domainObject = new ims.therapies.homeandenvironmentalvisit.domain.objects.RoomDetails();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_RoomDetails());
			if (domMap.get(key) != null)
			{
				return (ims.therapies.homeandenvironmentalvisit.domain.objects.RoomDetails)domMap.get(key);
			}
			domainObject = (ims.therapies.homeandenvironmentalvisit.domain.objects.RoomDetails) domainFactory.getDomainObject(ims.therapies.homeandenvironmentalvisit.domain.objects.RoomDetails.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_RoomDetails());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getLocation() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getLocation().getID());
		}
		domainObject.setLocation(value1);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAccess() != null && valueObject.getAccess().equals(""))
		{
			valueObject.setAccess(null);
		}
		domainObject.setAccessDetails(valueObject.getAccess());
		domainObject.setDoorWidth(valueObject.getDoorWidth());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getRoomDetails() != null && valueObject.getRoomDetails().equals(""))
		{
			valueObject.setRoomDetails(null);
		}
		domainObject.setRoomDetails(valueObject.getRoomDetails());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getUnitOfMeasure() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getUnitOfMeasure().getID());
		}
		domainObject.setUnitOfMeasure(value6);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getHomeVisitRoomType() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getHomeVisitRoomType().getID());
		}
		domainObject.setHomeVisitRoomType(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getEnvironmentVisitRoomType() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getEnvironmentVisitRoomType().getID());
		}
		domainObject.setEnvironmentVisitRoomType(value8);

		return domainObject;
	}

}
