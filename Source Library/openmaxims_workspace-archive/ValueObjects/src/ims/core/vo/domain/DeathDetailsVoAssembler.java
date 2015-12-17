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
 * @author Rory Fitzpatrick
 */
public class DeathDetailsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.DeathDetailsVo copy(ims.core.vo.DeathDetailsVo valueObjectDest, ims.core.vo.DeathDetailsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_DeathDetails(valueObjectSrc.getID_DeathDetails());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// DeathPlaceofDeath
		valueObjectDest.setDeathPlaceofDeath(valueObjectSrc.getDeathPlaceofDeath());
		// DeathCauseEstablished
		valueObjectDest.setDeathCauseEstablished(valueObjectSrc.getDeathCauseEstablished());
		// CancerRelatedDeath
		valueObjectDest.setCancerRelatedDeath(valueObjectSrc.getCancerRelatedDeath());
		// DeathCodeDiscrepency
		valueObjectDest.setDeathCodeDiscrepency(valueObjectSrc.getDeathCodeDiscrepency());
		// DeathConditions
		valueObjectDest.setDeathConditions(valueObjectSrc.getDeathConditions());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// ReferredToCorroner
		valueObjectDest.setReferredToCorroner(valueObjectSrc.getReferredToCorroner());
		// PostMortem
		valueObjectDest.setPostMortem(valueObjectSrc.getPostMortem());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createDeathDetailsVoCollectionFromDeathDetails(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.DeathDetails objects.
	 */
	public static ims.core.vo.DeathDetailsVoCollection createDeathDetailsVoCollectionFromDeathDetails(java.util.Set domainObjectSet)	
	{
		return createDeathDetailsVoCollectionFromDeathDetails(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.DeathDetails objects.
	 */
	public static ims.core.vo.DeathDetailsVoCollection createDeathDetailsVoCollectionFromDeathDetails(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.DeathDetailsVoCollection voList = new ims.core.vo.DeathDetailsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.clinical.domain.objects.DeathDetails domainObject = (ims.core.clinical.domain.objects.DeathDetails) iterator.next();
			ims.core.vo.DeathDetailsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.DeathDetails objects.
	 */
	public static ims.core.vo.DeathDetailsVoCollection createDeathDetailsVoCollectionFromDeathDetails(java.util.List domainObjectList) 
	{
		return createDeathDetailsVoCollectionFromDeathDetails(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.DeathDetails objects.
	 */
	public static ims.core.vo.DeathDetailsVoCollection createDeathDetailsVoCollectionFromDeathDetails(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.DeathDetailsVoCollection voList = new ims.core.vo.DeathDetailsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.DeathDetails domainObject = (ims.core.clinical.domain.objects.DeathDetails) domainObjectList.get(i);
			ims.core.vo.DeathDetailsVo vo = create(map, domainObject);

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
	 * Create the ims.core.clinical.domain.objects.DeathDetails set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractDeathDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.DeathDetailsVoCollection voCollection) 
	 {
	 	return extractDeathDetailsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractDeathDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.DeathDetailsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.DeathDetailsVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.DeathDetails domainObject = DeathDetailsVoAssembler.extractDeathDetails(domainFactory, vo, domMap);

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
	 * Create the ims.core.clinical.domain.objects.DeathDetails list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractDeathDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.DeathDetailsVoCollection voCollection) 
	 {
	 	return extractDeathDetailsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractDeathDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.DeathDetailsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.DeathDetailsVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.DeathDetails domainObject = DeathDetailsVoAssembler.extractDeathDetails(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.clinical.domain.objects.DeathDetails object.
	 * @param domainObject ims.core.clinical.domain.objects.DeathDetails
	 */
	 public static ims.core.vo.DeathDetailsVo create(ims.core.clinical.domain.objects.DeathDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.clinical.domain.objects.DeathDetails object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.DeathDetailsVo create(DomainObjectMap map, ims.core.clinical.domain.objects.DeathDetails domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.DeathDetailsVo valueObject = (ims.core.vo.DeathDetailsVo) map.getValueObject(domainObject, ims.core.vo.DeathDetailsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.DeathDetailsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.clinical.domain.objects.DeathDetails
	 */
	 public static ims.core.vo.DeathDetailsVo insert(ims.core.vo.DeathDetailsVo valueObject, ims.core.clinical.domain.objects.DeathDetails domainObject) 
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
	 * @param domainObject ims.core.clinical.domain.objects.DeathDetails
	 */
	 public static ims.core.vo.DeathDetailsVo insert(DomainObjectMap map, ims.core.vo.DeathDetailsVo valueObject, ims.core.clinical.domain.objects.DeathDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_DeathDetails(domainObject.getId());
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
			
		// DeathPlaceofDeath
		ims.domain.lookups.LookupInstance instance1 = domainObject.getDeathPlaceofDeath();
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

			ims.core.vo.lookups.PlaceofDeath voLookup1 = new ims.core.vo.lookups.PlaceofDeath(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.core.vo.lookups.PlaceofDeath parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.core.vo.lookups.PlaceofDeath(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setDeathPlaceofDeath(voLookup1);
		}
				// DeathCauseEstablished
		ims.domain.lookups.LookupInstance instance2 = domainObject.getDeathCauseEstablished();
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

			ims.core.vo.lookups.DeathCauseEstablished voLookup2 = new ims.core.vo.lookups.DeathCauseEstablished(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.core.vo.lookups.DeathCauseEstablished parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.core.vo.lookups.DeathCauseEstablished(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setDeathCauseEstablished(voLookup2);
		}
				// CancerRelatedDeath
		ims.domain.lookups.LookupInstance instance3 = domainObject.getCancerRelatedDeath();
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

			ims.core.vo.lookups.DeathCauseCancer voLookup3 = new ims.core.vo.lookups.DeathCauseCancer(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.DeathCauseCancer parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.core.vo.lookups.DeathCauseCancer(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setCancerRelatedDeath(voLookup3);
		}
				// DeathCodeDiscrepency
		ims.domain.lookups.LookupInstance instance4 = domainObject.getDeathCodeDiscrepency();
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

			ims.core.vo.lookups.DeathCodeDiscrepency voLookup4 = new ims.core.vo.lookups.DeathCodeDiscrepency(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.DeathCodeDiscrepency parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.core.vo.lookups.DeathCodeDiscrepency(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setDeathCodeDiscrepency(voLookup4);
		}
				// DeathConditions
		valueObject.setDeathConditions(ims.core.vo.domain.DeathConditionsVoAssembler.createDeathConditionsVoCollectionFromDeathConditions(map, domainObject.getDeathConditions()) );
		// Patient
		valueObject.setPatient(ims.core.vo.domain.PatientShortAssembler.create(map, domainObject.getPatient()) );
		// ReferredToCorroner
		valueObject.setReferredToCorroner( domainObject.isReferredToCorroner() );
		// PostMortem
		ims.domain.lookups.LookupInstance instance8 = domainObject.getPostMortem();
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

			ims.core.vo.lookups.PostMortem voLookup8 = new ims.core.vo.lookups.PostMortem(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.core.vo.lookups.PostMortem parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.core.vo.lookups.PostMortem(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setPostMortem(voLookup8);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.domain.objects.DeathDetails extractDeathDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.DeathDetailsVo valueObject) 
	{
		return 	extractDeathDetails(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.DeathDetails extractDeathDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.DeathDetailsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_DeathDetails();
		ims.core.clinical.domain.objects.DeathDetails domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.clinical.domain.objects.DeathDetails)domMap.get(valueObject);
			}
			// ims.core.vo.DeathDetailsVo ID_DeathDetails field is unknown
			domainObject = new ims.core.clinical.domain.objects.DeathDetails();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_DeathDetails());
			if (domMap.get(key) != null)
			{
				return (ims.core.clinical.domain.objects.DeathDetails)domMap.get(key);
			}
			domainObject = (ims.core.clinical.domain.objects.DeathDetails) domainFactory.getDomainObject(ims.core.clinical.domain.objects.DeathDetails.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_DeathDetails());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getDeathPlaceofDeath() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getDeathPlaceofDeath().getID());
		}
		domainObject.setDeathPlaceofDeath(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getDeathCauseEstablished() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getDeathCauseEstablished().getID());
		}
		domainObject.setDeathCauseEstablished(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getCancerRelatedDeath() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getCancerRelatedDeath().getID());
		}
		domainObject.setCancerRelatedDeath(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getDeathCodeDiscrepency() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getDeathCodeDiscrepency().getID());
		}
		domainObject.setDeathCodeDiscrepency(value4);
		domainObject.setDeathConditions(ims.core.vo.domain.DeathConditionsVoAssembler.extractDeathConditionsSet(domainFactory, valueObject.getDeathConditions(), domainObject.getDeathConditions(), domMap));		
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.patient.domain.objects.Patient value6 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value6 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else
			{
				value6 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value6);
		domainObject.setReferredToCorroner(valueObject.getReferredToCorroner());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getPostMortem() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getPostMortem().getID());
		}
		domainObject.setPostMortem(value8);

		return domainObject;
	}

}
