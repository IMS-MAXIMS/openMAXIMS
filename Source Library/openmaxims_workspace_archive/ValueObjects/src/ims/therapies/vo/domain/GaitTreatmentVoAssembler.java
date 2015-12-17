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
 * @author Charlotte Murphy
 */
public class GaitTreatmentVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.therapies.vo.GaitTreatmentVo copy(ims.therapies.vo.GaitTreatmentVo valueObjectDest, ims.therapies.vo.GaitTreatmentVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_GaitTreatment(valueObjectSrc.getID_GaitTreatment());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Environment
		valueObjectDest.setEnvironment(valueObjectSrc.getEnvironment());
		// GaitTechnique
		valueObjectDest.setGaitTechnique(valueObjectSrc.getGaitTechnique());
		// Orthosis
		valueObjectDest.setOrthosis(valueObjectSrc.getOrthosis());
		// SupervisionLevel
		valueObjectDest.setSupervisionLevel(valueObjectSrc.getSupervisionLevel());
		// GaitPractice
		valueObjectDest.setGaitPractice(valueObjectSrc.getGaitPractice());
		// StairPractice
		valueObjectDest.setStairPractice(valueObjectSrc.getStairPractice());
		// GaitSummary
		valueObjectDest.setGaitSummary(valueObjectSrc.getGaitSummary());
		// WalkTestTime
		valueObjectDest.setWalkTestTime(valueObjectSrc.getWalkTestTime());
		// SysInfo
		valueObjectDest.setSysInfo(valueObjectSrc.getSysInfo());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createGaitTreatmentVoCollectionFromGaitTreatment(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.therapies.treatment.domain.objects.GaitTreatment objects.
	 */
	public static ims.therapies.vo.GaitTreatmentVoCollection createGaitTreatmentVoCollectionFromGaitTreatment(java.util.Set domainObjectSet)	
	{
		return createGaitTreatmentVoCollectionFromGaitTreatment(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.therapies.treatment.domain.objects.GaitTreatment objects.
	 */
	public static ims.therapies.vo.GaitTreatmentVoCollection createGaitTreatmentVoCollectionFromGaitTreatment(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.therapies.vo.GaitTreatmentVoCollection voList = new ims.therapies.vo.GaitTreatmentVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.therapies.treatment.domain.objects.GaitTreatment domainObject = (ims.therapies.treatment.domain.objects.GaitTreatment) iterator.next();
			ims.therapies.vo.GaitTreatmentVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.therapies.treatment.domain.objects.GaitTreatment objects.
	 */
	public static ims.therapies.vo.GaitTreatmentVoCollection createGaitTreatmentVoCollectionFromGaitTreatment(java.util.List domainObjectList) 
	{
		return createGaitTreatmentVoCollectionFromGaitTreatment(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.therapies.treatment.domain.objects.GaitTreatment objects.
	 */
	public static ims.therapies.vo.GaitTreatmentVoCollection createGaitTreatmentVoCollectionFromGaitTreatment(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.therapies.vo.GaitTreatmentVoCollection voList = new ims.therapies.vo.GaitTreatmentVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.therapies.treatment.domain.objects.GaitTreatment domainObject = (ims.therapies.treatment.domain.objects.GaitTreatment) domainObjectList.get(i);
			ims.therapies.vo.GaitTreatmentVo vo = create(map, domainObject);

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
	 * Create the ims.therapies.treatment.domain.objects.GaitTreatment set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractGaitTreatmentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.GaitTreatmentVoCollection voCollection) 
	 {
	 	return extractGaitTreatmentSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractGaitTreatmentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.GaitTreatmentVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.therapies.vo.GaitTreatmentVo vo = voCollection.get(i);
			ims.therapies.treatment.domain.objects.GaitTreatment domainObject = GaitTreatmentVoAssembler.extractGaitTreatment(domainFactory, vo, domMap);

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
	 * Create the ims.therapies.treatment.domain.objects.GaitTreatment list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractGaitTreatmentList(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.GaitTreatmentVoCollection voCollection) 
	 {
	 	return extractGaitTreatmentList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractGaitTreatmentList(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.GaitTreatmentVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.therapies.vo.GaitTreatmentVo vo = voCollection.get(i);
			ims.therapies.treatment.domain.objects.GaitTreatment domainObject = GaitTreatmentVoAssembler.extractGaitTreatment(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.therapies.treatment.domain.objects.GaitTreatment object.
	 * @param domainObject ims.therapies.treatment.domain.objects.GaitTreatment
	 */
	 public static ims.therapies.vo.GaitTreatmentVo create(ims.therapies.treatment.domain.objects.GaitTreatment domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.therapies.treatment.domain.objects.GaitTreatment object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.therapies.vo.GaitTreatmentVo create(DomainObjectMap map, ims.therapies.treatment.domain.objects.GaitTreatment domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.therapies.vo.GaitTreatmentVo valueObject = (ims.therapies.vo.GaitTreatmentVo) map.getValueObject(domainObject, ims.therapies.vo.GaitTreatmentVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.therapies.vo.GaitTreatmentVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.therapies.treatment.domain.objects.GaitTreatment
	 */
	 public static ims.therapies.vo.GaitTreatmentVo insert(ims.therapies.vo.GaitTreatmentVo valueObject, ims.therapies.treatment.domain.objects.GaitTreatment domainObject) 
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
	 * @param domainObject ims.therapies.treatment.domain.objects.GaitTreatment
	 */
	 public static ims.therapies.vo.GaitTreatmentVo insert(DomainObjectMap map, ims.therapies.vo.GaitTreatmentVo valueObject, ims.therapies.treatment.domain.objects.GaitTreatment domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_GaitTreatment(domainObject.getId());
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
			
		// Environment
		ims.domain.lookups.LookupInstance instance1 = domainObject.getEnvironment();
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

			ims.spinalinjuries.vo.lookups.GaitTestEnvironment voLookup1 = new ims.spinalinjuries.vo.lookups.GaitTestEnvironment(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.GaitTestEnvironment parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.spinalinjuries.vo.lookups.GaitTestEnvironment(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setEnvironment(voLookup1);
		}
				// GaitTechnique
		ims.domain.lookups.LookupInstance instance2 = domainObject.getGaitTechnique();
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

			ims.spinalinjuries.vo.lookups.GaitTechnique voLookup2 = new ims.spinalinjuries.vo.lookups.GaitTechnique(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.GaitTechnique parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.spinalinjuries.vo.lookups.GaitTechnique(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setGaitTechnique(voLookup2);
		}
				// Orthosis
		ims.domain.lookups.LookupInstance instance3 = domainObject.getOrthosis();
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

			ims.therapies.vo.lookups.GaitOrthosis voLookup3 = new ims.therapies.vo.lookups.GaitOrthosis(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.therapies.vo.lookups.GaitOrthosis parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.therapies.vo.lookups.GaitOrthosis(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setOrthosis(voLookup3);
		}
				// SupervisionLevel
		ims.domain.lookups.LookupInstance instance4 = domainObject.getSupervisionLevel();
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

			ims.spinalinjuries.vo.lookups.GaitTreatmentSupervisionLevel voLookup4 = new ims.spinalinjuries.vo.lookups.GaitTreatmentSupervisionLevel(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.GaitTreatmentSupervisionLevel parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.spinalinjuries.vo.lookups.GaitTreatmentSupervisionLevel(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setSupervisionLevel(voLookup4);
		}
				// GaitPractice
		valueObject.setGaitPractice(domainObject.getGaitPractice());
		// StairPractice
		valueObject.setStairPractice(domainObject.getStairPractice());
		// GaitSummary
		valueObject.setGaitSummary(domainObject.getGaitSummary());
		// WalkTestTime
		valueObject.setWalkTestTime(domainObject.getWalkTestTime());
		// SysInfo
		// set system information
		valueObject.setSysInfo(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.therapies.treatment.domain.objects.GaitTreatment extractGaitTreatment(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.GaitTreatmentVo valueObject) 
	{
		return 	extractGaitTreatment(domainFactory, valueObject, new HashMap());
	}

	public static ims.therapies.treatment.domain.objects.GaitTreatment extractGaitTreatment(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.GaitTreatmentVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_GaitTreatment();
		ims.therapies.treatment.domain.objects.GaitTreatment domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.therapies.treatment.domain.objects.GaitTreatment)domMap.get(valueObject);
			}
			// ims.therapies.vo.GaitTreatmentVo ID_GaitTreatment field is unknown
			domainObject = new ims.therapies.treatment.domain.objects.GaitTreatment();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_GaitTreatment());
			if (domMap.get(key) != null)
			{
				return (ims.therapies.treatment.domain.objects.GaitTreatment)domMap.get(key);
			}
			domainObject = (ims.therapies.treatment.domain.objects.GaitTreatment) domainFactory.getDomainObject(ims.therapies.treatment.domain.objects.GaitTreatment.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_GaitTreatment());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getEnvironment() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getEnvironment().getID());
		}
		domainObject.setEnvironment(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getGaitTechnique() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getGaitTechnique().getID());
		}
		domainObject.setGaitTechnique(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getOrthosis() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getOrthosis().getID());
		}
		domainObject.setOrthosis(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getSupervisionLevel() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getSupervisionLevel().getID());
		}
		domainObject.setSupervisionLevel(value4);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getGaitPractice() != null && valueObject.getGaitPractice().equals(""))
		{
			valueObject.setGaitPractice(null);
		}
		domainObject.setGaitPractice(valueObject.getGaitPractice());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getStairPractice() != null && valueObject.getStairPractice().equals(""))
		{
			valueObject.setStairPractice(null);
		}
		domainObject.setStairPractice(valueObject.getStairPractice());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getGaitSummary() != null && valueObject.getGaitSummary().equals(""))
		{
			valueObject.setGaitSummary(null);
		}
		domainObject.setGaitSummary(valueObject.getGaitSummary());
		domainObject.setWalkTestTime(valueObject.getWalkTestTime());

		return domainObject;
	}

}
