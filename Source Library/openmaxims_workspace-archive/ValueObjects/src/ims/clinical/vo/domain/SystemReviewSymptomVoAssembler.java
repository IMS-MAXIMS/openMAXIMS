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
package ims.clinical.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Dara Hickey
 */
public class SystemReviewSymptomVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.SystemReviewSymptomVo copy(ims.clinical.vo.SystemReviewSymptomVo valueObjectDest, ims.clinical.vo.SystemReviewSymptomVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_SystemReviewSymptoms(valueObjectSrc.getID_SystemReviewSymptoms());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Symptom
		valueObjectDest.setSymptom(valueObjectSrc.getSymptom());
		// AbsentPresent
		valueObjectDest.setAbsentPresent(valueObjectSrc.getAbsentPresent());
		// DurationValue
		valueObjectDest.setDurationValue(valueObjectSrc.getDurationValue());
		// DurationUnit
		valueObjectDest.setDurationUnit(valueObjectSrc.getDurationUnit());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createSystemReviewSymptomVoCollectionFromSystemReviewSymptoms(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.SystemReviewSymptoms objects.
	 */
	public static ims.clinical.vo.SystemReviewSymptomVoCollection createSystemReviewSymptomVoCollectionFromSystemReviewSymptoms(java.util.Set domainObjectSet)	
	{
		return createSystemReviewSymptomVoCollectionFromSystemReviewSymptoms(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.SystemReviewSymptoms objects.
	 */
	public static ims.clinical.vo.SystemReviewSymptomVoCollection createSystemReviewSymptomVoCollectionFromSystemReviewSymptoms(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.SystemReviewSymptomVoCollection voList = new ims.clinical.vo.SystemReviewSymptomVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.clinical.domain.objects.SystemReviewSymptoms domainObject = (ims.clinical.domain.objects.SystemReviewSymptoms) iterator.next();
			ims.clinical.vo.SystemReviewSymptomVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.clinical.domain.objects.SystemReviewSymptoms objects.
	 */
	public static ims.clinical.vo.SystemReviewSymptomVoCollection createSystemReviewSymptomVoCollectionFromSystemReviewSymptoms(java.util.List domainObjectList) 
	{
		return createSystemReviewSymptomVoCollectionFromSystemReviewSymptoms(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.clinical.domain.objects.SystemReviewSymptoms objects.
	 */
	public static ims.clinical.vo.SystemReviewSymptomVoCollection createSystemReviewSymptomVoCollectionFromSystemReviewSymptoms(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.SystemReviewSymptomVoCollection voList = new ims.clinical.vo.SystemReviewSymptomVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.clinical.domain.objects.SystemReviewSymptoms domainObject = (ims.clinical.domain.objects.SystemReviewSymptoms) domainObjectList.get(i);
			ims.clinical.vo.SystemReviewSymptomVo vo = create(map, domainObject);

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
	 * Create the ims.clinical.domain.objects.SystemReviewSymptoms set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractSystemReviewSymptomsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SystemReviewSymptomVoCollection voCollection) 
	 {
	 	return extractSystemReviewSymptomsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractSystemReviewSymptomsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SystemReviewSymptomVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.SystemReviewSymptomVo vo = voCollection.get(i);
			ims.clinical.domain.objects.SystemReviewSymptoms domainObject = SystemReviewSymptomVoAssembler.extractSystemReviewSymptoms(domainFactory, vo, domMap);

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
	 * Create the ims.clinical.domain.objects.SystemReviewSymptoms list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractSystemReviewSymptomsList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SystemReviewSymptomVoCollection voCollection) 
	 {
	 	return extractSystemReviewSymptomsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractSystemReviewSymptomsList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SystemReviewSymptomVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.SystemReviewSymptomVo vo = voCollection.get(i);
			ims.clinical.domain.objects.SystemReviewSymptoms domainObject = SystemReviewSymptomVoAssembler.extractSystemReviewSymptoms(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.clinical.domain.objects.SystemReviewSymptoms object.
	 * @param domainObject ims.clinical.domain.objects.SystemReviewSymptoms
	 */
	 public static ims.clinical.vo.SystemReviewSymptomVo create(ims.clinical.domain.objects.SystemReviewSymptoms domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.clinical.domain.objects.SystemReviewSymptoms object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.SystemReviewSymptomVo create(DomainObjectMap map, ims.clinical.domain.objects.SystemReviewSymptoms domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.SystemReviewSymptomVo valueObject = (ims.clinical.vo.SystemReviewSymptomVo) map.getValueObject(domainObject, ims.clinical.vo.SystemReviewSymptomVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.SystemReviewSymptomVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.clinical.domain.objects.SystemReviewSymptoms
	 */
	 public static ims.clinical.vo.SystemReviewSymptomVo insert(ims.clinical.vo.SystemReviewSymptomVo valueObject, ims.clinical.domain.objects.SystemReviewSymptoms domainObject) 
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
	 * @param domainObject ims.clinical.domain.objects.SystemReviewSymptoms
	 */
	 public static ims.clinical.vo.SystemReviewSymptomVo insert(DomainObjectMap map, ims.clinical.vo.SystemReviewSymptomVo valueObject, ims.clinical.domain.objects.SystemReviewSymptoms domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_SystemReviewSymptoms(domainObject.getId());
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
			
		// Symptom
		ims.domain.lookups.LookupInstance instance1 = domainObject.getSymptom();
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

			ims.clinical.vo.lookups.Symptoms voLookup1 = new ims.clinical.vo.lookups.Symptoms(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.clinical.vo.lookups.Symptoms parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.clinical.vo.lookups.Symptoms(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setSymptom(voLookup1);
		}
				// AbsentPresent
		ims.domain.lookups.LookupInstance instance2 = domainObject.getAbsentPresent();
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

			ims.clinical.vo.lookups.AbsentPresent voLookup2 = new ims.clinical.vo.lookups.AbsentPresent(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.clinical.vo.lookups.AbsentPresent parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.clinical.vo.lookups.AbsentPresent(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setAbsentPresent(voLookup2);
		}
				// DurationValue
		valueObject.setDurationValue(domainObject.getDurationValue());
		// DurationUnit
		ims.domain.lookups.LookupInstance instance4 = domainObject.getDurationUnit();
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

			ims.core.vo.lookups.TimeDaystoYears voLookup4 = new ims.core.vo.lookups.TimeDaystoYears(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.TimeDaystoYears parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.core.vo.lookups.TimeDaystoYears(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setDurationUnit(voLookup4);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.clinical.domain.objects.SystemReviewSymptoms extractSystemReviewSymptoms(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SystemReviewSymptomVo valueObject) 
	{
		return 	extractSystemReviewSymptoms(domainFactory, valueObject, new HashMap());
	}

	public static ims.clinical.domain.objects.SystemReviewSymptoms extractSystemReviewSymptoms(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.SystemReviewSymptomVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_SystemReviewSymptoms();
		ims.clinical.domain.objects.SystemReviewSymptoms domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.clinical.domain.objects.SystemReviewSymptoms)domMap.get(valueObject);
			}
			// ims.clinical.vo.SystemReviewSymptomVo ID_SystemReviewSymptoms field is unknown
			domainObject = new ims.clinical.domain.objects.SystemReviewSymptoms();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_SystemReviewSymptoms());
			if (domMap.get(key) != null)
			{
				return (ims.clinical.domain.objects.SystemReviewSymptoms)domMap.get(key);
			}
			domainObject = (ims.clinical.domain.objects.SystemReviewSymptoms) domainFactory.getDomainObject(ims.clinical.domain.objects.SystemReviewSymptoms.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_SystemReviewSymptoms());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getSymptom() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getSymptom().getID());
		}
		domainObject.setSymptom(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getAbsentPresent() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getAbsentPresent().getID());
		}
		domainObject.setAbsentPresent(value2);
		domainObject.setDurationValue(valueObject.getDurationValue());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getDurationUnit() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getDurationUnit().getID());
		}
		domainObject.setDurationUnit(value4);

		return domainObject;
	}

}
