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
package ims.coe.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Charlotte Murphy
 */
public class AccommodationHousingVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.coe.vo.AccommodationHousingVo copy(ims.coe.vo.AccommodationHousingVo valueObjectDest, ims.coe.vo.AccommodationHousingVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_AccommodationHousing(valueObjectSrc.getID_AccommodationHousing());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CurrentLivingArrangements
		valueObjectDest.setCurrentLivingArrangements(valueObjectSrc.getCurrentLivingArrangements());
		// CurrentLivingArrangementsNotes
		valueObjectDest.setCurrentLivingArrangementsNotes(valueObjectSrc.getCurrentLivingArrangementsNotes());
		// Accommodation
		valueObjectDest.setAccommodation(valueObjectSrc.getAccommodation());
		// AccommodationNotes
		valueObjectDest.setAccommodationNotes(valueObjectSrc.getAccommodationNotes());
		// AssisstanceToOthers
		valueObjectDest.setAssisstanceToOthers(valueObjectSrc.getAssisstanceToOthers());
		// AssistanceToOthersNotes
		valueObjectDest.setAssistanceToOthersNotes(valueObjectSrc.getAssistanceToOthersNotes());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createAccommodationHousingVoCollectionFromAccommodationHousing(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.coe.assessment.domain.objects.AccommodationHousing objects.
	 */
	public static ims.coe.vo.AccommodationHousingVoCollection createAccommodationHousingVoCollectionFromAccommodationHousing(java.util.Set domainObjectSet)	
	{
		return createAccommodationHousingVoCollectionFromAccommodationHousing(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.coe.assessment.domain.objects.AccommodationHousing objects.
	 */
	public static ims.coe.vo.AccommodationHousingVoCollection createAccommodationHousingVoCollectionFromAccommodationHousing(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.coe.vo.AccommodationHousingVoCollection voList = new ims.coe.vo.AccommodationHousingVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.coe.assessment.domain.objects.AccommodationHousing domainObject = (ims.coe.assessment.domain.objects.AccommodationHousing) iterator.next();
			ims.coe.vo.AccommodationHousingVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.coe.assessment.domain.objects.AccommodationHousing objects.
	 */
	public static ims.coe.vo.AccommodationHousingVoCollection createAccommodationHousingVoCollectionFromAccommodationHousing(java.util.List domainObjectList) 
	{
		return createAccommodationHousingVoCollectionFromAccommodationHousing(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.coe.assessment.domain.objects.AccommodationHousing objects.
	 */
	public static ims.coe.vo.AccommodationHousingVoCollection createAccommodationHousingVoCollectionFromAccommodationHousing(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.coe.vo.AccommodationHousingVoCollection voList = new ims.coe.vo.AccommodationHousingVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.coe.assessment.domain.objects.AccommodationHousing domainObject = (ims.coe.assessment.domain.objects.AccommodationHousing) domainObjectList.get(i);
			ims.coe.vo.AccommodationHousingVo vo = create(map, domainObject);

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
	 * Create the ims.coe.assessment.domain.objects.AccommodationHousing set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractAccommodationHousingSet(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.AccommodationHousingVoCollection voCollection) 
	 {
	 	return extractAccommodationHousingSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractAccommodationHousingSet(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.AccommodationHousingVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.coe.vo.AccommodationHousingVo vo = voCollection.get(i);
			ims.coe.assessment.domain.objects.AccommodationHousing domainObject = AccommodationHousingVoAssembler.extractAccommodationHousing(domainFactory, vo, domMap);

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
	 * Create the ims.coe.assessment.domain.objects.AccommodationHousing list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractAccommodationHousingList(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.AccommodationHousingVoCollection voCollection) 
	 {
	 	return extractAccommodationHousingList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractAccommodationHousingList(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.AccommodationHousingVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.coe.vo.AccommodationHousingVo vo = voCollection.get(i);
			ims.coe.assessment.domain.objects.AccommodationHousing domainObject = AccommodationHousingVoAssembler.extractAccommodationHousing(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.coe.assessment.domain.objects.AccommodationHousing object.
	 * @param domainObject ims.coe.assessment.domain.objects.AccommodationHousing
	 */
	 public static ims.coe.vo.AccommodationHousingVo create(ims.coe.assessment.domain.objects.AccommodationHousing domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.coe.assessment.domain.objects.AccommodationHousing object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.coe.vo.AccommodationHousingVo create(DomainObjectMap map, ims.coe.assessment.domain.objects.AccommodationHousing domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.coe.vo.AccommodationHousingVo valueObject = (ims.coe.vo.AccommodationHousingVo) map.getValueObject(domainObject, ims.coe.vo.AccommodationHousingVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.coe.vo.AccommodationHousingVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.coe.assessment.domain.objects.AccommodationHousing
	 */
	 public static ims.coe.vo.AccommodationHousingVo insert(ims.coe.vo.AccommodationHousingVo valueObject, ims.coe.assessment.domain.objects.AccommodationHousing domainObject) 
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
	 * @param domainObject ims.coe.assessment.domain.objects.AccommodationHousing
	 */
	 public static ims.coe.vo.AccommodationHousingVo insert(DomainObjectMap map, ims.coe.vo.AccommodationHousingVo valueObject, ims.coe.assessment.domain.objects.AccommodationHousing domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_AccommodationHousing(domainObject.getId());
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
			
		// CurrentLivingArrangements
		ims.domain.lookups.LookupInstance instance1 = domainObject.getCurrentLivingArrangements();
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
			valueObject.setCurrentLivingArrangements(voLookup1);
		}
				// CurrentLivingArrangementsNotes
		valueObject.setCurrentLivingArrangementsNotes(domainObject.getCurrentLivingArrangementsNotes());
		// Accommodation
		ims.domain.lookups.LookupInstance instance3 = domainObject.getAccommodation();
		if ( null != instance3 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance3.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance3.getImage().getImageId(), instance3.getImage().getImagePath());
			}
			color = instance3.getColor();
			if (color != null) 
				color.getValue();

			ims.coe.vo.lookups.AccommodationHousing voLookup3 = new ims.coe.vo.lookups.AccommodationHousing(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.coe.vo.lookups.AccommodationHousing parentVoLookup3 = voLookup3;
			ims.domain.lookups.LookupInstance parent3 = instance3.getParent();
			while (parent3 != null)
			{
				if (parent3.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent3.getImage().getImageId(), parent3.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent3.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup3.setParent(new ims.coe.vo.lookups.AccommodationHousing(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setAccommodation(voLookup3);
		}
				// AccommodationNotes
		valueObject.setAccommodationNotes(domainObject.getAccommodationNotes());
		// AssisstanceToOthers
		ims.domain.lookups.LookupInstance instance5 = domainObject.getAssisstanceToOthers();
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

			ims.core.vo.lookups.YesNoUnknown voLookup5 = new ims.core.vo.lookups.YesNoUnknown(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.core.vo.lookups.YesNoUnknown(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setAssisstanceToOthers(voLookup5);
		}
				// AssistanceToOthersNotes
		valueObject.setAssistanceToOthersNotes(domainObject.getAssistanceToOthersNotes());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.coe.assessment.domain.objects.AccommodationHousing extractAccommodationHousing(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.AccommodationHousingVo valueObject) 
	{
		return 	extractAccommodationHousing(domainFactory, valueObject, new HashMap());
	}

	public static ims.coe.assessment.domain.objects.AccommodationHousing extractAccommodationHousing(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.AccommodationHousingVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_AccommodationHousing();
		ims.coe.assessment.domain.objects.AccommodationHousing domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.coe.assessment.domain.objects.AccommodationHousing)domMap.get(valueObject);
			}
			// ims.coe.vo.AccommodationHousingVo ID_AccommodationHousing field is unknown
			domainObject = new ims.coe.assessment.domain.objects.AccommodationHousing();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_AccommodationHousing());
			if (domMap.get(key) != null)
			{
				return (ims.coe.assessment.domain.objects.AccommodationHousing)domMap.get(key);
			}
			domainObject = (ims.coe.assessment.domain.objects.AccommodationHousing) domainFactory.getDomainObject(ims.coe.assessment.domain.objects.AccommodationHousing.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_AccommodationHousing());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getCurrentLivingArrangements() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getCurrentLivingArrangements().getID());
		}
		domainObject.setCurrentLivingArrangements(value1);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getCurrentLivingArrangementsNotes() != null && valueObject.getCurrentLivingArrangementsNotes().equals(""))
		{
			valueObject.setCurrentLivingArrangementsNotes(null);
		}
		domainObject.setCurrentLivingArrangementsNotes(valueObject.getCurrentLivingArrangementsNotes());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getAccommodation() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getAccommodation().getID());
		}
		domainObject.setAccommodation(value3);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAccommodationNotes() != null && valueObject.getAccommodationNotes().equals(""))
		{
			valueObject.setAccommodationNotes(null);
		}
		domainObject.setAccommodationNotes(valueObject.getAccommodationNotes());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getAssisstanceToOthers() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getAssisstanceToOthers().getID());
		}
		domainObject.setAssisstanceToOthers(value5);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAssistanceToOthersNotes() != null && valueObject.getAssistanceToOthersNotes().equals(""))
		{
			valueObject.setAssistanceToOthersNotes(null);
		}
		domainObject.setAssistanceToOthersNotes(valueObject.getAssistanceToOthersNotes());

		return domainObject;
	}

}
