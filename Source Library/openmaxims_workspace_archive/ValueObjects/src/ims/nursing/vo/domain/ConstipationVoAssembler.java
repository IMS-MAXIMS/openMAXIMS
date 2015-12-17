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
 * @author John MacEnri
 */
public class ConstipationVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.nursing.vo.ConstipationVo copy(ims.nursing.vo.ConstipationVo valueObjectDest, ims.nursing.vo.ConstipationVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_BowelConstipation(valueObjectSrc.getID_BowelConstipation());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ProneToConstipation
		valueObjectDest.setProneToConstipation(valueObjectSrc.getProneToConstipation());
		// StainingOfFaeces
		valueObjectDest.setStainingOfFaeces(valueObjectSrc.getStainingOfFaeces());
		// LeakageOfFaecesAtPresent
		valueObjectDest.setLeakageOfFaecesAtPresent(valueObjectSrc.getLeakageOfFaecesAtPresent());
		// LeakageOfFaecesPast
		valueObjectDest.setLeakageOfFaecesPast(valueObjectSrc.getLeakageOfFaecesPast());
		// HowLongAgo
		valueObjectDest.setHowLongAgo(valueObjectSrc.getHowLongAgo());
		// TakingLaxatives
		valueObjectDest.setTakingLaxatives(valueObjectSrc.getTakingLaxatives());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createConstipationVoCollectionFromBowelConstipation(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.coe.assessment.domain.objects.BowelConstipation objects.
	 */
	public static ims.nursing.vo.ConstipationVoCollection createConstipationVoCollectionFromBowelConstipation(java.util.Set domainObjectSet)	
	{
		return createConstipationVoCollectionFromBowelConstipation(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.coe.assessment.domain.objects.BowelConstipation objects.
	 */
	public static ims.nursing.vo.ConstipationVoCollection createConstipationVoCollectionFromBowelConstipation(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.nursing.vo.ConstipationVoCollection voList = new ims.nursing.vo.ConstipationVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.coe.assessment.domain.objects.BowelConstipation domainObject = (ims.coe.assessment.domain.objects.BowelConstipation) iterator.next();
			ims.nursing.vo.ConstipationVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.coe.assessment.domain.objects.BowelConstipation objects.
	 */
	public static ims.nursing.vo.ConstipationVoCollection createConstipationVoCollectionFromBowelConstipation(java.util.List domainObjectList) 
	{
		return createConstipationVoCollectionFromBowelConstipation(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.coe.assessment.domain.objects.BowelConstipation objects.
	 */
	public static ims.nursing.vo.ConstipationVoCollection createConstipationVoCollectionFromBowelConstipation(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.nursing.vo.ConstipationVoCollection voList = new ims.nursing.vo.ConstipationVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.coe.assessment.domain.objects.BowelConstipation domainObject = (ims.coe.assessment.domain.objects.BowelConstipation) domainObjectList.get(i);
			ims.nursing.vo.ConstipationVo vo = create(map, domainObject);

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
	 * Create the ims.coe.assessment.domain.objects.BowelConstipation set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractBowelConstipationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.ConstipationVoCollection voCollection) 
	 {
	 	return extractBowelConstipationSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractBowelConstipationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.ConstipationVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.nursing.vo.ConstipationVo vo = voCollection.get(i);
			ims.coe.assessment.domain.objects.BowelConstipation domainObject = ConstipationVoAssembler.extractBowelConstipation(domainFactory, vo, domMap);

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
	 * Create the ims.coe.assessment.domain.objects.BowelConstipation list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractBowelConstipationList(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.ConstipationVoCollection voCollection) 
	 {
	 	return extractBowelConstipationList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractBowelConstipationList(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.ConstipationVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.nursing.vo.ConstipationVo vo = voCollection.get(i);
			ims.coe.assessment.domain.objects.BowelConstipation domainObject = ConstipationVoAssembler.extractBowelConstipation(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.coe.assessment.domain.objects.BowelConstipation object.
	 * @param domainObject ims.coe.assessment.domain.objects.BowelConstipation
	 */
	 public static ims.nursing.vo.ConstipationVo create(ims.coe.assessment.domain.objects.BowelConstipation domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.coe.assessment.domain.objects.BowelConstipation object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.nursing.vo.ConstipationVo create(DomainObjectMap map, ims.coe.assessment.domain.objects.BowelConstipation domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.nursing.vo.ConstipationVo valueObject = (ims.nursing.vo.ConstipationVo) map.getValueObject(domainObject, ims.nursing.vo.ConstipationVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.nursing.vo.ConstipationVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.coe.assessment.domain.objects.BowelConstipation
	 */
	 public static ims.nursing.vo.ConstipationVo insert(ims.nursing.vo.ConstipationVo valueObject, ims.coe.assessment.domain.objects.BowelConstipation domainObject) 
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
	 * @param domainObject ims.coe.assessment.domain.objects.BowelConstipation
	 */
	 public static ims.nursing.vo.ConstipationVo insert(DomainObjectMap map, ims.nursing.vo.ConstipationVo valueObject, ims.coe.assessment.domain.objects.BowelConstipation domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_BowelConstipation(domainObject.getId());
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
			
		// ProneToConstipation
		ims.domain.lookups.LookupInstance instance1 = domainObject.getProneToConstipation();
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

			ims.core.vo.lookups.YesNoUnknown voLookup1 = new ims.core.vo.lookups.YesNoUnknown(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.core.vo.lookups.YesNoUnknown(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setProneToConstipation(voLookup1);
		}
				// StainingOfFaeces
		ims.domain.lookups.LookupInstance instance2 = domainObject.getStainingOfFaeces();
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

			ims.core.vo.lookups.YesNoUnknown voLookup2 = new ims.core.vo.lookups.YesNoUnknown(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.core.vo.lookups.YesNoUnknown(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setStainingOfFaeces(voLookup2);
		}
				// LeakageOfFaecesAtPresent
		ims.domain.lookups.LookupInstance instance3 = domainObject.getLeakageOfFaecesAtPresent();
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

			ims.core.vo.lookups.YesNoUnknown voLookup3 = new ims.core.vo.lookups.YesNoUnknown(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.core.vo.lookups.YesNoUnknown(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setLeakageOfFaecesAtPresent(voLookup3);
		}
				// LeakageOfFaecesPast
		ims.domain.lookups.LookupInstance instance4 = domainObject.getLeakageOfFaecesPast();
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

			ims.core.vo.lookups.YesNoUnknown voLookup4 = new ims.core.vo.lookups.YesNoUnknown(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.core.vo.lookups.YesNoUnknown(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setLeakageOfFaecesPast(voLookup4);
		}
				// HowLongAgo
		valueObject.setHowLongAgo(domainObject.getHowLongAgo());
		// TakingLaxatives
		ims.domain.lookups.LookupInstance instance6 = domainObject.getTakingLaxatives();
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

			ims.core.vo.lookups.YesNoUnknown voLookup6 = new ims.core.vo.lookups.YesNoUnknown(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.core.vo.lookups.YesNoUnknown(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setTakingLaxatives(voLookup6);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.coe.assessment.domain.objects.BowelConstipation extractBowelConstipation(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.ConstipationVo valueObject) 
	{
		return 	extractBowelConstipation(domainFactory, valueObject, new HashMap());
	}

	public static ims.coe.assessment.domain.objects.BowelConstipation extractBowelConstipation(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.ConstipationVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_BowelConstipation();
		ims.coe.assessment.domain.objects.BowelConstipation domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.coe.assessment.domain.objects.BowelConstipation)domMap.get(valueObject);
			}
			// ims.nursing.vo.ConstipationVo ID_BowelConstipation field is unknown
			domainObject = new ims.coe.assessment.domain.objects.BowelConstipation();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_BowelConstipation());
			if (domMap.get(key) != null)
			{
				return (ims.coe.assessment.domain.objects.BowelConstipation)domMap.get(key);
			}
			domainObject = (ims.coe.assessment.domain.objects.BowelConstipation) domainFactory.getDomainObject(ims.coe.assessment.domain.objects.BowelConstipation.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_BowelConstipation());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getProneToConstipation() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getProneToConstipation().getID());
		}
		domainObject.setProneToConstipation(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getStainingOfFaeces() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getStainingOfFaeces().getID());
		}
		domainObject.setStainingOfFaeces(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getLeakageOfFaecesAtPresent() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getLeakageOfFaecesAtPresent().getID());
		}
		domainObject.setLeakageOfFaecesAtPresent(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getLeakageOfFaecesPast() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getLeakageOfFaecesPast().getID());
		}
		domainObject.setLeakageOfFaecesPast(value4);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getHowLongAgo() != null && valueObject.getHowLongAgo().equals(""))
		{
			valueObject.setHowLongAgo(null);
		}
		domainObject.setHowLongAgo(valueObject.getHowLongAgo());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getTakingLaxatives() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getTakingLaxatives().getID());
		}
		domainObject.setTakingLaxatives(value6);

		return domainObject;
	}

}
