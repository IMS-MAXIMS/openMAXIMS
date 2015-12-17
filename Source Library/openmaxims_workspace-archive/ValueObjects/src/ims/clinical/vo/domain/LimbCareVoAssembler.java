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
 * @author Cristian Belciug
 */
public class LimbCareVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.LimbCareVo copy(ims.clinical.vo.LimbCareVo valueObjectDest, ims.clinical.vo.LimbCareVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_LimbCare(valueObjectSrc.getID_LimbCare());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// hadPaddedArmSupportLeft
		valueObjectDest.setHadPaddedArmSupportLeft(valueObjectSrc.getHadPaddedArmSupportLeft());
		// hadPaddedArmSupportRight
		valueObjectDest.setHadPaddedArmSupportRight(valueObjectSrc.getHadPaddedArmSupportRight());
		// HadLeftArmFoldedAcrossPatientsChest
		valueObjectDest.setHadLeftArmFoldedAcrossPatientsChest(valueObjectSrc.getHadLeftArmFoldedAcrossPatientsChest());
		// HadRightArmFoldedAcrossPatientsChest1
		valueObjectDest.setHadRightArmFoldedAcrossPatientsChest1(valueObjectSrc.getHadRightArmFoldedAcrossPatientsChest1());
		// HadLeftLegDVTProphylaxsis
		valueObjectDest.setHadLeftLegDVTProphylaxsis(valueObjectSrc.getHadLeftLegDVTProphylaxsis());
		// HadRightLegDVTProphylaxsis
		valueObjectDest.setHadRightLegDVTProphylaxsis(valueObjectSrc.getHadRightLegDVTProphylaxsis());
		// HadLeftLegGelPad
		valueObjectDest.setHadLeftLegGelPad(valueObjectSrc.getHadLeftLegGelPad());
		// HadRightLegGelPad
		valueObjectDest.setHadRightLegGelPad(valueObjectSrc.getHadRightLegGelPad());
		// hasRightArmSecuredBySide
		valueObjectDest.setHasRightArmSecuredBySide(valueObjectSrc.getHasRightArmSecuredBySide());
		// hasLeftArmSecuredBySide
		valueObjectDest.setHasLeftArmSecuredBySide(valueObjectSrc.getHasLeftArmSecuredBySide());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createLimbCareVoCollectionFromLimbCare(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.LimbCare objects.
	 */
	public static ims.clinical.vo.LimbCareVoCollection createLimbCareVoCollectionFromLimbCare(java.util.Set domainObjectSet)	
	{
		return createLimbCareVoCollectionFromLimbCare(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.LimbCare objects.
	 */
	public static ims.clinical.vo.LimbCareVoCollection createLimbCareVoCollectionFromLimbCare(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.LimbCareVoCollection voList = new ims.clinical.vo.LimbCareVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.clinical.domain.objects.LimbCare domainObject = (ims.core.clinical.domain.objects.LimbCare) iterator.next();
			ims.clinical.vo.LimbCareVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.LimbCare objects.
	 */
	public static ims.clinical.vo.LimbCareVoCollection createLimbCareVoCollectionFromLimbCare(java.util.List domainObjectList) 
	{
		return createLimbCareVoCollectionFromLimbCare(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.LimbCare objects.
	 */
	public static ims.clinical.vo.LimbCareVoCollection createLimbCareVoCollectionFromLimbCare(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.LimbCareVoCollection voList = new ims.clinical.vo.LimbCareVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.LimbCare domainObject = (ims.core.clinical.domain.objects.LimbCare) domainObjectList.get(i);
			ims.clinical.vo.LimbCareVo vo = create(map, domainObject);

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
	 * Create the ims.core.clinical.domain.objects.LimbCare set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractLimbCareSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.LimbCareVoCollection voCollection) 
	 {
	 	return extractLimbCareSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractLimbCareSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.LimbCareVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.LimbCareVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.LimbCare domainObject = LimbCareVoAssembler.extractLimbCare(domainFactory, vo, domMap);

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
	 * Create the ims.core.clinical.domain.objects.LimbCare list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractLimbCareList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.LimbCareVoCollection voCollection) 
	 {
	 	return extractLimbCareList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractLimbCareList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.LimbCareVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.LimbCareVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.LimbCare domainObject = LimbCareVoAssembler.extractLimbCare(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.clinical.domain.objects.LimbCare object.
	 * @param domainObject ims.core.clinical.domain.objects.LimbCare
	 */
	 public static ims.clinical.vo.LimbCareVo create(ims.core.clinical.domain.objects.LimbCare domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.clinical.domain.objects.LimbCare object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.LimbCareVo create(DomainObjectMap map, ims.core.clinical.domain.objects.LimbCare domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.LimbCareVo valueObject = (ims.clinical.vo.LimbCareVo) map.getValueObject(domainObject, ims.clinical.vo.LimbCareVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.LimbCareVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.clinical.domain.objects.LimbCare
	 */
	 public static ims.clinical.vo.LimbCareVo insert(ims.clinical.vo.LimbCareVo valueObject, ims.core.clinical.domain.objects.LimbCare domainObject) 
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
	 * @param domainObject ims.core.clinical.domain.objects.LimbCare
	 */
	 public static ims.clinical.vo.LimbCareVo insert(DomainObjectMap map, ims.clinical.vo.LimbCareVo valueObject, ims.core.clinical.domain.objects.LimbCare domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_LimbCare(domainObject.getId());
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
			
		// hadPaddedArmSupportLeft
		valueObject.setHadPaddedArmSupportLeft( domainObject.isHadPaddedArmSupportLeft() );
		// hadPaddedArmSupportRight
		valueObject.setHadPaddedArmSupportRight( domainObject.isHadPaddedArmSupportRight() );
		// HadLeftArmFoldedAcrossPatientsChest
		valueObject.setHadLeftArmFoldedAcrossPatientsChest( domainObject.isHadLeftArmFoldedAcrossPatientsChest() );
		// HadRightArmFoldedAcrossPatientsChest1
		valueObject.setHadRightArmFoldedAcrossPatientsChest1( domainObject.isHadRightArmFoldedAcrossPatientsChest1() );
		// HadLeftLegDVTProphylaxsis
		valueObject.setHadLeftLegDVTProphylaxsis( domainObject.isHadLeftLegDVTProphylaxsis() );
		// HadRightLegDVTProphylaxsis
		valueObject.setHadRightLegDVTProphylaxsis( domainObject.isHadRightLegDVTProphylaxsis() );
		// HadLeftLegGelPad
		valueObject.setHadLeftLegGelPad( domainObject.isHadLeftLegGelPad() );
		// HadRightLegGelPad
		valueObject.setHadRightLegGelPad( domainObject.isHadRightLegGelPad() );
		// hasRightArmSecuredBySide
		valueObject.setHasRightArmSecuredBySide( domainObject.isHasRightArmSecuredBySide() );
		// hasLeftArmSecuredBySide
		valueObject.setHasLeftArmSecuredBySide( domainObject.isHasLeftArmSecuredBySide() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.domain.objects.LimbCare extractLimbCare(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.LimbCareVo valueObject) 
	{
		return 	extractLimbCare(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.LimbCare extractLimbCare(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.LimbCareVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_LimbCare();
		ims.core.clinical.domain.objects.LimbCare domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.clinical.domain.objects.LimbCare)domMap.get(valueObject);
			}
			// ims.clinical.vo.LimbCareVo ID_LimbCare field is unknown
			domainObject = new ims.core.clinical.domain.objects.LimbCare();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_LimbCare());
			if (domMap.get(key) != null)
			{
				return (ims.core.clinical.domain.objects.LimbCare)domMap.get(key);
			}
			domainObject = (ims.core.clinical.domain.objects.LimbCare) domainFactory.getDomainObject(ims.core.clinical.domain.objects.LimbCare.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_LimbCare());

		domainObject.setHadPaddedArmSupportLeft(valueObject.getHadPaddedArmSupportLeft());
		domainObject.setHadPaddedArmSupportRight(valueObject.getHadPaddedArmSupportRight());
		domainObject.setHadLeftArmFoldedAcrossPatientsChest(valueObject.getHadLeftArmFoldedAcrossPatientsChest());
		domainObject.setHadRightArmFoldedAcrossPatientsChest1(valueObject.getHadRightArmFoldedAcrossPatientsChest1());
		domainObject.setHadLeftLegDVTProphylaxsis(valueObject.getHadLeftLegDVTProphylaxsis());
		domainObject.setHadRightLegDVTProphylaxsis(valueObject.getHadRightLegDVTProphylaxsis());
		domainObject.setHadLeftLegGelPad(valueObject.getHadLeftLegGelPad());
		domainObject.setHadRightLegGelPad(valueObject.getHadRightLegGelPad());
		domainObject.setHasRightArmSecuredBySide(valueObject.getHasRightArmSecuredBySide());
		domainObject.setHasLeftArmSecuredBySide(valueObject.getHasLeftArmSecuredBySide());

		return domainObject;
	}

}
