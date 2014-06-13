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
package ims.clinicaladmin.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Rory Fitzpatrick
 */
public class DailyPatternConfigVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinicaladmin.vo.DailyPatternConfigVo copy(ims.clinicaladmin.vo.DailyPatternConfigVo valueObjectDest, ims.clinicaladmin.vo.DailyPatternConfigVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_DailyPattern(valueObjectSrc.getID_DailyPattern());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// StartTime
		valueObjectDest.setStartTime(valueObjectSrc.getStartTime());
		// UseSignatoryPeriods
		valueObjectDest.setUseSignatoryPeriods(valueObjectSrc.getUseSignatoryPeriods());
		// SignatoryPeriod
		valueObjectDest.setSignatoryPeriod(valueObjectSrc.getSignatoryPeriod());
		// DailyPatternType
		valueObjectDest.setDailyPatternType(valueObjectSrc.getDailyPatternType());
		// IsActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createDailyPatternConfigVoCollectionFromDailyPattern(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.configuration.domain.objects.DailyPattern objects.
	 */
	public static ims.clinicaladmin.vo.DailyPatternConfigVoCollection createDailyPatternConfigVoCollectionFromDailyPattern(java.util.Set domainObjectSet)	
	{
		return createDailyPatternConfigVoCollectionFromDailyPattern(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.configuration.domain.objects.DailyPattern objects.
	 */
	public static ims.clinicaladmin.vo.DailyPatternConfigVoCollection createDailyPatternConfigVoCollectionFromDailyPattern(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinicaladmin.vo.DailyPatternConfigVoCollection voList = new ims.clinicaladmin.vo.DailyPatternConfigVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.configuration.domain.objects.DailyPattern domainObject = (ims.core.configuration.domain.objects.DailyPattern) iterator.next();
			ims.clinicaladmin.vo.DailyPatternConfigVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.configuration.domain.objects.DailyPattern objects.
	 */
	public static ims.clinicaladmin.vo.DailyPatternConfigVoCollection createDailyPatternConfigVoCollectionFromDailyPattern(java.util.List domainObjectList) 
	{
		return createDailyPatternConfigVoCollectionFromDailyPattern(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.configuration.domain.objects.DailyPattern objects.
	 */
	public static ims.clinicaladmin.vo.DailyPatternConfigVoCollection createDailyPatternConfigVoCollectionFromDailyPattern(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinicaladmin.vo.DailyPatternConfigVoCollection voList = new ims.clinicaladmin.vo.DailyPatternConfigVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.configuration.domain.objects.DailyPattern domainObject = (ims.core.configuration.domain.objects.DailyPattern) domainObjectList.get(i);
			ims.clinicaladmin.vo.DailyPatternConfigVo vo = create(map, domainObject);

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
	 * Create the ims.core.configuration.domain.objects.DailyPattern set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractDailyPatternSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.DailyPatternConfigVoCollection voCollection) 
	 {
	 	return extractDailyPatternSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractDailyPatternSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.DailyPatternConfigVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinicaladmin.vo.DailyPatternConfigVo vo = voCollection.get(i);
			ims.core.configuration.domain.objects.DailyPattern domainObject = DailyPatternConfigVoAssembler.extractDailyPattern(domainFactory, vo, domMap);

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
	 * Create the ims.core.configuration.domain.objects.DailyPattern list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractDailyPatternList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.DailyPatternConfigVoCollection voCollection) 
	 {
	 	return extractDailyPatternList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractDailyPatternList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.DailyPatternConfigVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinicaladmin.vo.DailyPatternConfigVo vo = voCollection.get(i);
			ims.core.configuration.domain.objects.DailyPattern domainObject = DailyPatternConfigVoAssembler.extractDailyPattern(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.configuration.domain.objects.DailyPattern object.
	 * @param domainObject ims.core.configuration.domain.objects.DailyPattern
	 */
	 public static ims.clinicaladmin.vo.DailyPatternConfigVo create(ims.core.configuration.domain.objects.DailyPattern domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.configuration.domain.objects.DailyPattern object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinicaladmin.vo.DailyPatternConfigVo create(DomainObjectMap map, ims.core.configuration.domain.objects.DailyPattern domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinicaladmin.vo.DailyPatternConfigVo valueObject = (ims.clinicaladmin.vo.DailyPatternConfigVo) map.getValueObject(domainObject, ims.clinicaladmin.vo.DailyPatternConfigVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinicaladmin.vo.DailyPatternConfigVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.configuration.domain.objects.DailyPattern
	 */
	 public static ims.clinicaladmin.vo.DailyPatternConfigVo insert(ims.clinicaladmin.vo.DailyPatternConfigVo valueObject, ims.core.configuration.domain.objects.DailyPattern domainObject) 
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
	 * @param domainObject ims.core.configuration.domain.objects.DailyPattern
	 */
	 public static ims.clinicaladmin.vo.DailyPatternConfigVo insert(DomainObjectMap map, ims.clinicaladmin.vo.DailyPatternConfigVo valueObject, ims.core.configuration.domain.objects.DailyPattern domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_DailyPattern(domainObject.getId());
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
			
		// StartTime
		String StartTime = domainObject.getStartTime();
		if ( null != StartTime ) 
		{
			valueObject.setStartTime(new ims.framework.utils.Time(StartTime) );
		}
		// UseSignatoryPeriods
		valueObject.setUseSignatoryPeriods( domainObject.isUseSignatoryPeriods() );
		// SignatoryPeriod
		valueObject.setSignatoryPeriod(ims.clinicaladmin.vo.domain.SignatoryPeriodConfigVoAssembler.createSignatoryPeriodConfigVoCollectionFromSignatoryPeriod(map, domainObject.getSignatoryPeriod()) );
		// DailyPatternType
		ims.domain.lookups.LookupInstance instance4 = domainObject.getDailyPatternType();
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

			ims.core.vo.lookups.DailyPatternType voLookup4 = new ims.core.vo.lookups.DailyPatternType(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.DailyPatternType parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.core.vo.lookups.DailyPatternType(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setDailyPatternType(voLookup4);
		}
				// IsActive
		valueObject.setIsActive( domainObject.isIsActive() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.configuration.domain.objects.DailyPattern extractDailyPattern(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.DailyPatternConfigVo valueObject) 
	{
		return 	extractDailyPattern(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.configuration.domain.objects.DailyPattern extractDailyPattern(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.DailyPatternConfigVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_DailyPattern();
		ims.core.configuration.domain.objects.DailyPattern domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.configuration.domain.objects.DailyPattern)domMap.get(valueObject);
			}
			// ims.clinicaladmin.vo.DailyPatternConfigVo ID_DailyPattern field is unknown
			domainObject = new ims.core.configuration.domain.objects.DailyPattern();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_DailyPattern());
			if (domMap.get(key) != null)
			{
				return (ims.core.configuration.domain.objects.DailyPattern)domMap.get(key);
			}
			domainObject = (ims.core.configuration.domain.objects.DailyPattern) domainFactory.getDomainObject(ims.core.configuration.domain.objects.DailyPattern.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_DailyPattern());

		ims.framework.utils.Time time1 = valueObject.getStartTime();
		String value1 = null;
		if ( time1 != null ) 
		{
			value1 = time1.toString();
		}
		domainObject.setStartTime(value1);
		domainObject.setUseSignatoryPeriods(valueObject.getUseSignatoryPeriods());
		domainObject.setSignatoryPeriod(ims.clinicaladmin.vo.domain.SignatoryPeriodConfigVoAssembler.extractSignatoryPeriodList(domainFactory, valueObject.getSignatoryPeriod(), domainObject.getSignatoryPeriod(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getDailyPatternType() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getDailyPatternType().getID());
		}
		domainObject.setDailyPatternType(value4);
		domainObject.setIsActive(valueObject.getIsActive());

		return domainObject;
	}

}
