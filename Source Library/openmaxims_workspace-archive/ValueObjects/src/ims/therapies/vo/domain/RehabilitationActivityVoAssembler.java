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
 * @author Rory Fitzpatrick
 */
public class RehabilitationActivityVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.therapies.vo.RehabilitationActivityVo copy(ims.therapies.vo.RehabilitationActivityVo valueObjectDest, ims.therapies.vo.RehabilitationActivityVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_RehabilitationActivity(valueObjectSrc.getID_RehabilitationActivity());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Location
		valueObjectDest.setLocation(valueObjectSrc.getLocation());
		// Purpose
		valueObjectDest.setPurpose(valueObjectSrc.getPurpose());
		// IndependenceLevel
		valueObjectDest.setIndependenceLevel(valueObjectSrc.getIndependenceLevel());
		// ActivityType
		valueObjectDest.setActivityType(valueObjectSrc.getActivityType());
		// ActivityCategory
		valueObjectDest.setActivityCategory(valueObjectSrc.getActivityCategory());
		// ActivityGroup
		valueObjectDest.setActivityGroup(valueObjectSrc.getActivityGroup());
		// Activity
		valueObjectDest.setActivity(valueObjectSrc.getActivity());
		// Technique
		valueObjectDest.setTechnique(valueObjectSrc.getTechnique());
		// Equipment
		valueObjectDest.setEquipment(valueObjectSrc.getEquipment());
		// EnvAdaptations
		valueObjectDest.setEnvAdaptations(valueObjectSrc.getEnvAdaptations());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createRehabilitationActivityVoCollectionFromRehabilitationActivity(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.therapies.treatment.domain.objects.RehabilitationActivity objects.
	 */
	public static ims.therapies.vo.RehabilitationActivityVoCollection createRehabilitationActivityVoCollectionFromRehabilitationActivity(java.util.Set domainObjectSet)	
	{
		return createRehabilitationActivityVoCollectionFromRehabilitationActivity(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.therapies.treatment.domain.objects.RehabilitationActivity objects.
	 */
	public static ims.therapies.vo.RehabilitationActivityVoCollection createRehabilitationActivityVoCollectionFromRehabilitationActivity(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.therapies.vo.RehabilitationActivityVoCollection voList = new ims.therapies.vo.RehabilitationActivityVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.therapies.treatment.domain.objects.RehabilitationActivity domainObject = (ims.therapies.treatment.domain.objects.RehabilitationActivity) iterator.next();
			ims.therapies.vo.RehabilitationActivityVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.therapies.treatment.domain.objects.RehabilitationActivity objects.
	 */
	public static ims.therapies.vo.RehabilitationActivityVoCollection createRehabilitationActivityVoCollectionFromRehabilitationActivity(java.util.List domainObjectList) 
	{
		return createRehabilitationActivityVoCollectionFromRehabilitationActivity(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.therapies.treatment.domain.objects.RehabilitationActivity objects.
	 */
	public static ims.therapies.vo.RehabilitationActivityVoCollection createRehabilitationActivityVoCollectionFromRehabilitationActivity(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.therapies.vo.RehabilitationActivityVoCollection voList = new ims.therapies.vo.RehabilitationActivityVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.therapies.treatment.domain.objects.RehabilitationActivity domainObject = (ims.therapies.treatment.domain.objects.RehabilitationActivity) domainObjectList.get(i);
			ims.therapies.vo.RehabilitationActivityVo vo = create(map, domainObject);

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
	 * Create the ims.therapies.treatment.domain.objects.RehabilitationActivity set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractRehabilitationActivitySet(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.RehabilitationActivityVoCollection voCollection) 
	 {
	 	return extractRehabilitationActivitySet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractRehabilitationActivitySet(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.RehabilitationActivityVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.therapies.vo.RehabilitationActivityVo vo = voCollection.get(i);
			ims.therapies.treatment.domain.objects.RehabilitationActivity domainObject = RehabilitationActivityVoAssembler.extractRehabilitationActivity(domainFactory, vo, domMap);

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
	 * Create the ims.therapies.treatment.domain.objects.RehabilitationActivity list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractRehabilitationActivityList(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.RehabilitationActivityVoCollection voCollection) 
	 {
	 	return extractRehabilitationActivityList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractRehabilitationActivityList(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.RehabilitationActivityVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.therapies.vo.RehabilitationActivityVo vo = voCollection.get(i);
			ims.therapies.treatment.domain.objects.RehabilitationActivity domainObject = RehabilitationActivityVoAssembler.extractRehabilitationActivity(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.therapies.treatment.domain.objects.RehabilitationActivity object.
	 * @param domainObject ims.therapies.treatment.domain.objects.RehabilitationActivity
	 */
	 public static ims.therapies.vo.RehabilitationActivityVo create(ims.therapies.treatment.domain.objects.RehabilitationActivity domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.therapies.treatment.domain.objects.RehabilitationActivity object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.therapies.vo.RehabilitationActivityVo create(DomainObjectMap map, ims.therapies.treatment.domain.objects.RehabilitationActivity domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.therapies.vo.RehabilitationActivityVo valueObject = (ims.therapies.vo.RehabilitationActivityVo) map.getValueObject(domainObject, ims.therapies.vo.RehabilitationActivityVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.therapies.vo.RehabilitationActivityVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.therapies.treatment.domain.objects.RehabilitationActivity
	 */
	 public static ims.therapies.vo.RehabilitationActivityVo insert(ims.therapies.vo.RehabilitationActivityVo valueObject, ims.therapies.treatment.domain.objects.RehabilitationActivity domainObject) 
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
	 * @param domainObject ims.therapies.treatment.domain.objects.RehabilitationActivity
	 */
	 public static ims.therapies.vo.RehabilitationActivityVo insert(DomainObjectMap map, ims.therapies.vo.RehabilitationActivityVo valueObject, ims.therapies.treatment.domain.objects.RehabilitationActivity domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_RehabilitationActivity(domainObject.getId());
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

			ims.spinalinjuries.vo.lookups.RehabLocation voLookup1 = new ims.spinalinjuries.vo.lookups.RehabLocation(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.RehabLocation parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.spinalinjuries.vo.lookups.RehabLocation(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setLocation(voLookup1);
		}
				// Purpose
		ims.domain.lookups.LookupInstance instance2 = domainObject.getPurpose();
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

			ims.spinalinjuries.vo.lookups.RehabPurpose voLookup2 = new ims.spinalinjuries.vo.lookups.RehabPurpose(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.RehabPurpose parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.spinalinjuries.vo.lookups.RehabPurpose(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setPurpose(voLookup2);
		}
				// IndependenceLevel
		ims.domain.lookups.LookupInstance instance3 = domainObject.getIndependenceLevel();
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

			ims.spinalinjuries.vo.lookups.RehabIndependenceLevel voLookup3 = new ims.spinalinjuries.vo.lookups.RehabIndependenceLevel(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.RehabIndependenceLevel parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.spinalinjuries.vo.lookups.RehabIndependenceLevel(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setIndependenceLevel(voLookup3);
		}
				// ActivityType
		ims.domain.lookups.LookupInstance instance4 = domainObject.getActivityType();
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

			ims.spinalinjuries.vo.lookups.RehabActivity voLookup4 = new ims.spinalinjuries.vo.lookups.RehabActivity(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.RehabActivity parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.spinalinjuries.vo.lookups.RehabActivity(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setActivityType(voLookup4);
		}
				// ActivityCategory
		ims.domain.lookups.LookupInstance instance5 = domainObject.getActivityCategory();
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

			ims.spinalinjuries.vo.lookups.RehabActivity voLookup5 = new ims.spinalinjuries.vo.lookups.RehabActivity(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.RehabActivity parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.spinalinjuries.vo.lookups.RehabActivity(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setActivityCategory(voLookup5);
		}
				// ActivityGroup
		ims.domain.lookups.LookupInstance instance6 = domainObject.getActivityGroup();
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

			ims.spinalinjuries.vo.lookups.RehabActivity voLookup6 = new ims.spinalinjuries.vo.lookups.RehabActivity(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.RehabActivity parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.spinalinjuries.vo.lookups.RehabActivity(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setActivityGroup(voLookup6);
		}
				// Activity
		ims.domain.lookups.LookupInstance instance7 = domainObject.getActivity();
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

			ims.spinalinjuries.vo.lookups.RehabActivity voLookup7 = new ims.spinalinjuries.vo.lookups.RehabActivity(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.RehabActivity parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.spinalinjuries.vo.lookups.RehabActivity(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setActivity(voLookup7);
		}
				// Technique
		java.util.List listTechnique = domainObject.getTechnique();
		ims.spinalinjuries.vo.lookups.RehabTechniqueCollection Technique = new ims.spinalinjuries.vo.lookups.RehabTechniqueCollection();
		for(java.util.Iterator iterator = listTechnique.iterator(); iterator.hasNext(); ) 
		{
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;
		
			ims.domain.lookups.LookupInstance instance = 
				(ims.domain.lookups.LookupInstance) iterator.next();
			if (instance.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance.getImage().getImageId(), instance.getImage().getImagePath());
			}
			else 
			{
				img = null;
			}
			color = instance.getColor();
			if (color != null) 
				color.getValue();
			ims.spinalinjuries.vo.lookups.RehabTechnique voInstance = new ims.spinalinjuries.vo.lookups.RehabTechnique(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.RehabTechnique parentVoInstance = voInstance;
			ims.domain.lookups.LookupInstance parent = instance.getParent();
			while (parent != null)
			{
				if (parent.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent.getImage().getImageId(), parent.getImage().getImagePath());
				}
				else 
				{
					img = null;
				}
				color = parent.getColor();
				if (color != null) 
					color.getValue();
								parentVoInstance.setParent(new ims.spinalinjuries.vo.lookups.RehabTechnique(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			Technique.add(voInstance);
		}
		valueObject.setTechnique( Technique );
		// Equipment
		java.util.List listEquipment = domainObject.getEquipment();
		ims.spinalinjuries.vo.lookups.RehabEquipmentCollection Equipment = new ims.spinalinjuries.vo.lookups.RehabEquipmentCollection();
		for(java.util.Iterator iterator = listEquipment.iterator(); iterator.hasNext(); ) 
		{
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;
		
			ims.domain.lookups.LookupInstance instance = 
				(ims.domain.lookups.LookupInstance) iterator.next();
			if (instance.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance.getImage().getImageId(), instance.getImage().getImagePath());
			}
			else 
			{
				img = null;
			}
			color = instance.getColor();
			if (color != null) 
				color.getValue();
			ims.spinalinjuries.vo.lookups.RehabEquipment voInstance = new ims.spinalinjuries.vo.lookups.RehabEquipment(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.RehabEquipment parentVoInstance = voInstance;
			ims.domain.lookups.LookupInstance parent = instance.getParent();
			while (parent != null)
			{
				if (parent.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent.getImage().getImageId(), parent.getImage().getImagePath());
				}
				else 
				{
					img = null;
				}
				color = parent.getColor();
				if (color != null) 
					color.getValue();
								parentVoInstance.setParent(new ims.spinalinjuries.vo.lookups.RehabEquipment(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			Equipment.add(voInstance);
		}
		valueObject.setEquipment( Equipment );
		// EnvAdaptations
		java.util.List listEnvAdaptations = domainObject.getEnvAdaptations();
		ims.spinalinjuries.vo.lookups.RehabEnvAdaptationCollection EnvAdaptations = new ims.spinalinjuries.vo.lookups.RehabEnvAdaptationCollection();
		for(java.util.Iterator iterator = listEnvAdaptations.iterator(); iterator.hasNext(); ) 
		{
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;
		
			ims.domain.lookups.LookupInstance instance = 
				(ims.domain.lookups.LookupInstance) iterator.next();
			if (instance.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance.getImage().getImageId(), instance.getImage().getImagePath());
			}
			else 
			{
				img = null;
			}
			color = instance.getColor();
			if (color != null) 
				color.getValue();
			ims.spinalinjuries.vo.lookups.RehabEnvAdaptation voInstance = new ims.spinalinjuries.vo.lookups.RehabEnvAdaptation(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.RehabEnvAdaptation parentVoInstance = voInstance;
			ims.domain.lookups.LookupInstance parent = instance.getParent();
			while (parent != null)
			{
				if (parent.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent.getImage().getImageId(), parent.getImage().getImagePath());
				}
				else 
				{
					img = null;
				}
				color = parent.getColor();
				if (color != null) 
					color.getValue();
								parentVoInstance.setParent(new ims.spinalinjuries.vo.lookups.RehabEnvAdaptation(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			EnvAdaptations.add(voInstance);
		}
		valueObject.setEnvAdaptations( EnvAdaptations );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.therapies.treatment.domain.objects.RehabilitationActivity extractRehabilitationActivity(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.RehabilitationActivityVo valueObject) 
	{
		return 	extractRehabilitationActivity(domainFactory, valueObject, new HashMap());
	}

	public static ims.therapies.treatment.domain.objects.RehabilitationActivity extractRehabilitationActivity(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.RehabilitationActivityVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_RehabilitationActivity();
		ims.therapies.treatment.domain.objects.RehabilitationActivity domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.therapies.treatment.domain.objects.RehabilitationActivity)domMap.get(valueObject);
			}
			// ims.therapies.vo.RehabilitationActivityVo ID_RehabilitationActivity field is unknown
			domainObject = new ims.therapies.treatment.domain.objects.RehabilitationActivity();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_RehabilitationActivity());
			if (domMap.get(key) != null)
			{
				return (ims.therapies.treatment.domain.objects.RehabilitationActivity)domMap.get(key);
			}
			domainObject = (ims.therapies.treatment.domain.objects.RehabilitationActivity) domainFactory.getDomainObject(ims.therapies.treatment.domain.objects.RehabilitationActivity.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_RehabilitationActivity());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getLocation() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getLocation().getID());
		}
		domainObject.setLocation(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getPurpose() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getPurpose().getID());
		}
		domainObject.setPurpose(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getIndependenceLevel() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getIndependenceLevel().getID());
		}
		domainObject.setIndependenceLevel(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getActivityType() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getActivityType().getID());
		}
		domainObject.setActivityType(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getActivityCategory() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getActivityCategory().getID());
		}
		domainObject.setActivityCategory(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getActivityGroup() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getActivityGroup().getID());
		}
		domainObject.setActivityGroup(value6);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getActivity() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getActivity().getID());
		}
		domainObject.setActivity(value7);
		ims.spinalinjuries.vo.lookups.RehabTechniqueCollection collection8 =
	valueObject.getTechnique();
	    java.util.List domainTechnique = domainObject.getTechnique();;			
	    int collection8Size=0;
		if (collection8 == null)
		{
			domainTechnique = new java.util.ArrayList(0);
		}
		else
		{
			collection8Size = collection8.size();
		}
		
		for(int i=0; i<collection8Size; i++) 
		{
			int instanceId = collection8.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainTechnique.indexOf(dom);
			if (domIdx == -1)
			{
				domainTechnique.add(i, dom);
			}
			else if (i != domIdx && i < domainTechnique.size())
			{
				Object tmp = domainTechnique.get(i);
				domainTechnique.set(i, domainTechnique.get(domIdx));
				domainTechnique.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j8 = domainTechnique.size();
		while (j8 > collection8Size)
		{
			domainTechnique.remove(j8-1);
			j8 = domainTechnique.size();
		}

		domainObject.setTechnique(domainTechnique);		
		ims.spinalinjuries.vo.lookups.RehabEquipmentCollection collection9 =
	valueObject.getEquipment();
	    java.util.List domainEquipment = domainObject.getEquipment();;			
	    int collection9Size=0;
		if (collection9 == null)
		{
			domainEquipment = new java.util.ArrayList(0);
		}
		else
		{
			collection9Size = collection9.size();
		}
		
		for(int i=0; i<collection9Size; i++) 
		{
			int instanceId = collection9.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainEquipment.indexOf(dom);
			if (domIdx == -1)
			{
				domainEquipment.add(i, dom);
			}
			else if (i != domIdx && i < domainEquipment.size())
			{
				Object tmp = domainEquipment.get(i);
				domainEquipment.set(i, domainEquipment.get(domIdx));
				domainEquipment.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j9 = domainEquipment.size();
		while (j9 > collection9Size)
		{
			domainEquipment.remove(j9-1);
			j9 = domainEquipment.size();
		}

		domainObject.setEquipment(domainEquipment);		
		ims.spinalinjuries.vo.lookups.RehabEnvAdaptationCollection collection10 =
	valueObject.getEnvAdaptations();
	    java.util.List domainEnvAdaptations = domainObject.getEnvAdaptations();;			
	    int collection10Size=0;
		if (collection10 == null)
		{
			domainEnvAdaptations = new java.util.ArrayList(0);
		}
		else
		{
			collection10Size = collection10.size();
		}
		
		for(int i=0; i<collection10Size; i++) 
		{
			int instanceId = collection10.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainEnvAdaptations.indexOf(dom);
			if (domIdx == -1)
			{
				domainEnvAdaptations.add(i, dom);
			}
			else if (i != domIdx && i < domainEnvAdaptations.size())
			{
				Object tmp = domainEnvAdaptations.get(i);
				domainEnvAdaptations.set(i, domainEnvAdaptations.get(domIdx));
				domainEnvAdaptations.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j10 = domainEnvAdaptations.size();
		while (j10 > collection10Size)
		{
			domainEnvAdaptations.remove(j10-1);
			j10 = domainEnvAdaptations.size();
		}

		domainObject.setEnvAdaptations(domainEnvAdaptations);		

		return domainObject;
	}

}
