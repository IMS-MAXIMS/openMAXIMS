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
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Gabriel Maxim
 */
public class BayConfigLiteVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.BayConfigLiteVo copy(ims.core.vo.BayConfigLiteVo valueObjectDest, ims.core.vo.BayConfigLiteVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_BayConfig(valueObjectSrc.getID_BayConfig());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Bay
		valueObjectDest.setBay(valueObjectSrc.getBay());
		// isActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
		// Male
		valueObjectDest.setMale(valueObjectSrc.getMale());
		// Female
		valueObjectDest.setFemale(valueObjectSrc.getFemale());
		// Paediatric
		valueObjectDest.setPaediatric(valueObjectSrc.getPaediatric());
		// numOfBeds
		valueObjectDest.setNumOfBeds(valueObjectSrc.getNumOfBeds());
		// numOfOccupiedBeds
		valueObjectDest.setNumOfOccupiedBeds(valueObjectSrc.getNumOfOccupiedBeds());
		// OpeningTime
		valueObjectDest.setOpeningTime(valueObjectSrc.getOpeningTime());
		// ClosingTime
		valueObjectDest.setClosingTime(valueObjectSrc.getClosingTime());
		// WeekdaysOnly
		valueObjectDest.setWeekdaysOnly(valueObjectSrc.getWeekdaysOnly());
		// BayAvailabilityStatus
		valueObjectDest.setBayAvailabilityStatus(valueObjectSrc.getBayAvailabilityStatus());
		// ReOpenOutOfHours
		valueObjectDest.setReOpenOutOfHours(valueObjectSrc.getReOpenOutOfHours());
		// TemporaryBayGender
		valueObjectDest.setTemporaryBayGender(valueObjectSrc.getTemporaryBayGender());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createBayConfigLiteVoCollectionFromBayConfig(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.layout.domain.objects.BayConfig objects.
	 */
	public static ims.core.vo.BayConfigLiteVoCollection createBayConfigLiteVoCollectionFromBayConfig(java.util.Set domainObjectSet)	
	{
		return createBayConfigLiteVoCollectionFromBayConfig(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.layout.domain.objects.BayConfig objects.
	 */
	public static ims.core.vo.BayConfigLiteVoCollection createBayConfigLiteVoCollectionFromBayConfig(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.BayConfigLiteVoCollection voList = new ims.core.vo.BayConfigLiteVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.layout.domain.objects.BayConfig domainObject = (ims.core.layout.domain.objects.BayConfig) iterator.next();
			ims.core.vo.BayConfigLiteVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.layout.domain.objects.BayConfig objects.
	 */
	public static ims.core.vo.BayConfigLiteVoCollection createBayConfigLiteVoCollectionFromBayConfig(java.util.List domainObjectList) 
	{
		return createBayConfigLiteVoCollectionFromBayConfig(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.layout.domain.objects.BayConfig objects.
	 */
	public static ims.core.vo.BayConfigLiteVoCollection createBayConfigLiteVoCollectionFromBayConfig(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.BayConfigLiteVoCollection voList = new ims.core.vo.BayConfigLiteVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.layout.domain.objects.BayConfig domainObject = (ims.core.layout.domain.objects.BayConfig) domainObjectList.get(i);
			ims.core.vo.BayConfigLiteVo vo = create(map, domainObject);

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
	 * Create the ims.core.layout.domain.objects.BayConfig set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractBayConfigSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.BayConfigLiteVoCollection voCollection) 
	 {
	 	return extractBayConfigSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractBayConfigSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.BayConfigLiteVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.BayConfigLiteVo vo = voCollection.get(i);
			ims.core.layout.domain.objects.BayConfig domainObject = BayConfigLiteVoAssembler.extractBayConfig(domainFactory, vo, domMap);

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
	 * Create the ims.core.layout.domain.objects.BayConfig list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractBayConfigList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.BayConfigLiteVoCollection voCollection) 
	 {
	 	return extractBayConfigList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractBayConfigList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.BayConfigLiteVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.BayConfigLiteVo vo = voCollection.get(i);
			ims.core.layout.domain.objects.BayConfig domainObject = BayConfigLiteVoAssembler.extractBayConfig(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.layout.domain.objects.BayConfig object.
	 * @param domainObject ims.core.layout.domain.objects.BayConfig
	 */
	 public static ims.core.vo.BayConfigLiteVo create(ims.core.layout.domain.objects.BayConfig domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.layout.domain.objects.BayConfig object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.BayConfigLiteVo create(DomainObjectMap map, ims.core.layout.domain.objects.BayConfig domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.BayConfigLiteVo valueObject = (ims.core.vo.BayConfigLiteVo) map.getValueObject(domainObject, ims.core.vo.BayConfigLiteVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.BayConfigLiteVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.layout.domain.objects.BayConfig
	 */
	 public static ims.core.vo.BayConfigLiteVo insert(ims.core.vo.BayConfigLiteVo valueObject, ims.core.layout.domain.objects.BayConfig domainObject) 
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
	 * @param domainObject ims.core.layout.domain.objects.BayConfig
	 */
	 public static ims.core.vo.BayConfigLiteVo insert(DomainObjectMap map, ims.core.vo.BayConfigLiteVo valueObject, ims.core.layout.domain.objects.BayConfig domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_BayConfig(domainObject.getId());
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
			
		// Bay
		valueObject.setBay(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getBay()) );
		// isActive
		valueObject.setIsActive( domainObject.isIsActive() );
		// Male
		valueObject.setMale( domainObject.isMale() );
		// Female
		valueObject.setFemale( domainObject.isFemale() );
		// Paediatric
		valueObject.setPaediatric( domainObject.isPediatric() );
		// numOfBeds
		valueObject.setNumOfBeds(domainObject.getNumOfBeds());
		// numOfOccupiedBeds
		valueObject.setNumOfOccupiedBeds(domainObject.getNumOfOccupiedBeds());
		// OpeningTime
		String OpeningTime = domainObject.getOpeningTime();
		if ( null != OpeningTime ) 
		{
			valueObject.setOpeningTime(new ims.framework.utils.Time(OpeningTime) );
		}
		// ClosingTime
		String ClosingTime = domainObject.getClosingTime();
		if ( null != ClosingTime ) 
		{
			valueObject.setClosingTime(new ims.framework.utils.Time(ClosingTime) );
		}
		// WeekdaysOnly
		valueObject.setWeekdaysOnly( domainObject.isWeekdaysOnly() );
		// BayAvailabilityStatus
		ims.domain.lookups.LookupInstance instance11 = domainObject.getBayStatus();
		if ( null != instance11 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance11.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance11.getImage().getImageId(), instance11.getImage().getImagePath());
			}
			color = instance11.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.WardBayStatus voLookup11 = new ims.core.vo.lookups.WardBayStatus(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.core.vo.lookups.WardBayStatus parentVoLookup11 = voLookup11;
			ims.domain.lookups.LookupInstance parent11 = instance11.getParent();
			while (parent11 != null)
			{
				if (parent11.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent11.getImage().getImageId(), parent11.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent11.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup11.setParent(new ims.core.vo.lookups.WardBayStatus(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setBayAvailabilityStatus(voLookup11);
		}
				// ReOpenOutOfHours
		valueObject.setReOpenOutOfHours(ims.core.vo.domain.ReopenBayOutOfHoursVoAssembler.createReopenBayOutOfHoursVoCollectionFromReopenOutOfHours(map, domainObject.getReOpenOutOfHours()) );
		// TemporaryBayGender
		ims.domain.lookups.LookupInstance instance13 = domainObject.getTemporaryBayGender();
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

			ims.core.vo.lookups.Sex voLookup13 = new ims.core.vo.lookups.Sex(instance13.getId(),instance13.getText(), instance13.isActive(), null, img, color);
			ims.core.vo.lookups.Sex parentVoLookup13 = voLookup13;
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
								parentVoLookup13.setParent(new ims.core.vo.lookups.Sex(parent13.getId(),parent13.getText(), parent13.isActive(), null, img, color));
				parentVoLookup13 = parentVoLookup13.getParent();
								parent13 = parent13.getParent();
			}			
			valueObject.setTemporaryBayGender(voLookup13);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.layout.domain.objects.BayConfig extractBayConfig(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.BayConfigLiteVo valueObject) 
	{
		return 	extractBayConfig(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.layout.domain.objects.BayConfig extractBayConfig(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.BayConfigLiteVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_BayConfig();
		ims.core.layout.domain.objects.BayConfig domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.layout.domain.objects.BayConfig)domMap.get(valueObject);
			}
			// ims.core.vo.BayConfigLiteVo ID_BayConfig field is unknown
			domainObject = new ims.core.layout.domain.objects.BayConfig();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_BayConfig());
			if (domMap.get(key) != null)
			{
				return (ims.core.layout.domain.objects.BayConfig)domMap.get(key);
			}
			domainObject = (ims.core.layout.domain.objects.BayConfig) domainFactory.getDomainObject(ims.core.layout.domain.objects.BayConfig.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_BayConfig());

		domainObject.setBay(ims.core.vo.domain.LocationLiteVoAssembler.extractLocation(domainFactory, valueObject.getBay(), domMap));
		domainObject.setIsActive(valueObject.getIsActive());
		domainObject.setMale(valueObject.getMale());
		domainObject.setFemale(valueObject.getFemale());
		domainObject.setPediatric(valueObject.getPaediatric());
		domainObject.setNumOfBeds(valueObject.getNumOfBeds());
		domainObject.setNumOfOccupiedBeds(valueObject.getNumOfOccupiedBeds());
		ims.framework.utils.Time time8 = valueObject.getOpeningTime();
		String value8 = null;
		if ( time8 != null ) 
		{
			value8 = time8.toString();
		}
		domainObject.setOpeningTime(value8);
		ims.framework.utils.Time time9 = valueObject.getClosingTime();
		String value9 = null;
		if ( time9 != null ) 
		{
			value9 = time9.toString();
		}
		domainObject.setClosingTime(value9);
		domainObject.setWeekdaysOnly(valueObject.getWeekdaysOnly());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getBayAvailabilityStatus() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getBayAvailabilityStatus().getID());
		}
		domainObject.setBayStatus(value11);
		domainObject.setReOpenOutOfHours(ims.core.vo.domain.ReopenBayOutOfHoursVoAssembler.extractReopenOutOfHoursList(domainFactory, valueObject.getReOpenOutOfHours(), domainObject.getReOpenOutOfHours(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value13 = null;
		if ( null != valueObject.getTemporaryBayGender() ) 
		{
			value13 =
				domainFactory.getLookupInstance(valueObject.getTemporaryBayGender().getID());
		}
		domainObject.setTemporaryBayGender(value13);

		return domainObject;
	}

}
