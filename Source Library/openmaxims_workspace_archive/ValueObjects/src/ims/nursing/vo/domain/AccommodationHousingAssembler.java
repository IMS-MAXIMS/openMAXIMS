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
package ims.nursing.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Sinead McDermott
 */
public class AccommodationHousingAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.nursing.vo.AccommodationHousing copy(ims.nursing.vo.AccommodationHousing valueObjectDest, ims.nursing.vo.AccommodationHousing valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Accommodation(valueObjectSrc.getID_Accommodation());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// LivingArrangements
		valueObjectDest.setLivingArrangements(valueObjectSrc.getLivingArrangements());
		// AccommodationType
		valueObjectDest.setAccommodationType(valueObjectSrc.getAccommodationType());
		// Notes
		valueObjectDest.setNotes(valueObjectSrc.getNotes());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createAccommodationHousingCollectionFromAccommodation(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.nursing.assessment.domain.objects.Accommodation objects.
	 */
	public static ims.nursing.vo.AccommodationHousingCollection createAccommodationHousingCollectionFromAccommodation(java.util.Set domainObjectSet)	
	{
		return createAccommodationHousingCollectionFromAccommodation(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.nursing.assessment.domain.objects.Accommodation objects.
	 */
	public static ims.nursing.vo.AccommodationHousingCollection createAccommodationHousingCollectionFromAccommodation(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.nursing.vo.AccommodationHousingCollection voList = new ims.nursing.vo.AccommodationHousingCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.nursing.assessment.domain.objects.Accommodation domainObject = (ims.nursing.assessment.domain.objects.Accommodation) iterator.next();
			ims.nursing.vo.AccommodationHousing vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.nursing.assessment.domain.objects.Accommodation objects.
	 */
	public static ims.nursing.vo.AccommodationHousingCollection createAccommodationHousingCollectionFromAccommodation(java.util.List domainObjectList) 
	{
		return createAccommodationHousingCollectionFromAccommodation(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.nursing.assessment.domain.objects.Accommodation objects.
	 */
	public static ims.nursing.vo.AccommodationHousingCollection createAccommodationHousingCollectionFromAccommodation(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.nursing.vo.AccommodationHousingCollection voList = new ims.nursing.vo.AccommodationHousingCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.nursing.assessment.domain.objects.Accommodation domainObject = (ims.nursing.assessment.domain.objects.Accommodation) domainObjectList.get(i);
			ims.nursing.vo.AccommodationHousing vo = create(map, domainObject);

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
	 * Create the ims.nursing.assessment.domain.objects.Accommodation set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractAccommodationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.AccommodationHousingCollection voCollection) 
	 {
	 	return extractAccommodationSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractAccommodationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.AccommodationHousingCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.nursing.vo.AccommodationHousing vo = voCollection.get(i);
			ims.nursing.assessment.domain.objects.Accommodation domainObject = AccommodationHousingAssembler.extractAccommodation(domainFactory, vo, domMap);

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
	 * Create the ims.nursing.assessment.domain.objects.Accommodation list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractAccommodationList(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.AccommodationHousingCollection voCollection) 
	 {
	 	return extractAccommodationList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractAccommodationList(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.AccommodationHousingCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.nursing.vo.AccommodationHousing vo = voCollection.get(i);
			ims.nursing.assessment.domain.objects.Accommodation domainObject = AccommodationHousingAssembler.extractAccommodation(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.nursing.assessment.domain.objects.Accommodation object.
	 * @param domainObject ims.nursing.assessment.domain.objects.Accommodation
	 */
	 public static ims.nursing.vo.AccommodationHousing create(ims.nursing.assessment.domain.objects.Accommodation domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.nursing.assessment.domain.objects.Accommodation object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.nursing.vo.AccommodationHousing create(DomainObjectMap map, ims.nursing.assessment.domain.objects.Accommodation domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.nursing.vo.AccommodationHousing valueObject = (ims.nursing.vo.AccommodationHousing) map.getValueObject(domainObject, ims.nursing.vo.AccommodationHousing.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.nursing.vo.AccommodationHousing(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.nursing.assessment.domain.objects.Accommodation
	 */
	 public static ims.nursing.vo.AccommodationHousing insert(ims.nursing.vo.AccommodationHousing valueObject, ims.nursing.assessment.domain.objects.Accommodation domainObject) 
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
	 * @param domainObject ims.nursing.assessment.domain.objects.Accommodation
	 */
	 public static ims.nursing.vo.AccommodationHousing insert(DomainObjectMap map, ims.nursing.vo.AccommodationHousing valueObject, ims.nursing.assessment.domain.objects.Accommodation domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Accommodation(domainObject.getId());
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
			
		// LivingArrangements
		ims.domain.lookups.LookupInstance instance1 = domainObject.getLivingArrangements();
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

			ims.coe.vo.lookups.AccommodationLivingArrangements voLookup1 = new ims.coe.vo.lookups.AccommodationLivingArrangements(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.coe.vo.lookups.AccommodationLivingArrangements parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.coe.vo.lookups.AccommodationLivingArrangements(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setLivingArrangements(voLookup1);
		}
				// AccommodationType
		ims.domain.lookups.LookupInstance instance2 = domainObject.getAccommodationType();
		if ( null != instance2 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance2.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance2.getImage().getImageId(), instance2.getImage().getImagePath());
			}
			color = instance2.getColor();
			if (color != null) 
				color.getValue();

			ims.spinalinjuries.vo.lookups.AccommodationType voLookup2 = new ims.spinalinjuries.vo.lookups.AccommodationType(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.AccommodationType parentVoLookup2 = voLookup2;
			ims.domain.lookups.LookupInstance parent2 = instance2.getParent();
			while (parent2 != null)
			{
				if (parent2.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent2.getImage().getImageId(), parent2.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent2.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup2.setParent(new ims.spinalinjuries.vo.lookups.AccommodationType(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setAccommodationType(voLookup2);
		}
				// Notes
		valueObject.setNotes(domainObject.getNotes());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.nursing.assessment.domain.objects.Accommodation extractAccommodation(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.AccommodationHousing valueObject) 
	{
		return 	extractAccommodation(domainFactory, valueObject, new HashMap());
	}

	public static ims.nursing.assessment.domain.objects.Accommodation extractAccommodation(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.AccommodationHousing valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Accommodation();
		ims.nursing.assessment.domain.objects.Accommodation domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.nursing.assessment.domain.objects.Accommodation)domMap.get(valueObject);
			}
			// ims.nursing.vo.AccommodationHousing ID_Accommodation field is unknown
			domainObject = new ims.nursing.assessment.domain.objects.Accommodation();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Accommodation());
			if (domMap.get(key) != null)
			{
				return (ims.nursing.assessment.domain.objects.Accommodation)domMap.get(key);
			}
			domainObject = (ims.nursing.assessment.domain.objects.Accommodation) domainFactory.getDomainObject(ims.nursing.assessment.domain.objects.Accommodation.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Accommodation());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getLivingArrangements() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getLivingArrangements().getID());
		}
		domainObject.setLivingArrangements(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getAccommodationType() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getAccommodationType().getID());
		}
		domainObject.setAccommodationType(value2);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getNotes() != null && valueObject.getNotes().equals(""))
		{
			valueObject.setNotes(null);
		}
		domainObject.setNotes(valueObject.getNotes());

		return domainObject;
	}

}
