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
 * @author Charlotte Murphy
 */
public class MuscleGroupMuscleVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinicaladmin.vo.MuscleGroupMuscleVo copy(ims.clinicaladmin.vo.MuscleGroupMuscleVo valueObjectDest, ims.clinicaladmin.vo.MuscleGroupMuscleVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_MuscleGroupMuscle(valueObjectSrc.getID_MuscleGroupMuscle());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Muscle
		valueObjectDest.setMuscle(valueObjectSrc.getMuscle());
		// MuslceGroup
		valueObjectDest.setMuslceGroup(valueObjectSrc.getMuslceGroup());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createMuscleGroupMuscleVoCollectionFromMuscleGroupMuscle(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.therapies.domain.objects.MuscleGroupMuscle objects.
	 */
	public static ims.clinicaladmin.vo.MuscleGroupMuscleVoCollection createMuscleGroupMuscleVoCollectionFromMuscleGroupMuscle(java.util.Set domainObjectSet)	
	{
		return createMuscleGroupMuscleVoCollectionFromMuscleGroupMuscle(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.therapies.domain.objects.MuscleGroupMuscle objects.
	 */
	public static ims.clinicaladmin.vo.MuscleGroupMuscleVoCollection createMuscleGroupMuscleVoCollectionFromMuscleGroupMuscle(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinicaladmin.vo.MuscleGroupMuscleVoCollection voList = new ims.clinicaladmin.vo.MuscleGroupMuscleVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.therapies.domain.objects.MuscleGroupMuscle domainObject = (ims.therapies.domain.objects.MuscleGroupMuscle) iterator.next();
			ims.clinicaladmin.vo.MuscleGroupMuscleVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.therapies.domain.objects.MuscleGroupMuscle objects.
	 */
	public static ims.clinicaladmin.vo.MuscleGroupMuscleVoCollection createMuscleGroupMuscleVoCollectionFromMuscleGroupMuscle(java.util.List domainObjectList) 
	{
		return createMuscleGroupMuscleVoCollectionFromMuscleGroupMuscle(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.therapies.domain.objects.MuscleGroupMuscle objects.
	 */
	public static ims.clinicaladmin.vo.MuscleGroupMuscleVoCollection createMuscleGroupMuscleVoCollectionFromMuscleGroupMuscle(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinicaladmin.vo.MuscleGroupMuscleVoCollection voList = new ims.clinicaladmin.vo.MuscleGroupMuscleVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.therapies.domain.objects.MuscleGroupMuscle domainObject = (ims.therapies.domain.objects.MuscleGroupMuscle) domainObjectList.get(i);
			ims.clinicaladmin.vo.MuscleGroupMuscleVo vo = create(map, domainObject);

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
	 * Create the ims.therapies.domain.objects.MuscleGroupMuscle set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractMuscleGroupMuscleSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.MuscleGroupMuscleVoCollection voCollection) 
	 {
	 	return extractMuscleGroupMuscleSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractMuscleGroupMuscleSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.MuscleGroupMuscleVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinicaladmin.vo.MuscleGroupMuscleVo vo = voCollection.get(i);
			ims.therapies.domain.objects.MuscleGroupMuscle domainObject = MuscleGroupMuscleVoAssembler.extractMuscleGroupMuscle(domainFactory, vo, domMap);

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
	 * Create the ims.therapies.domain.objects.MuscleGroupMuscle list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractMuscleGroupMuscleList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.MuscleGroupMuscleVoCollection voCollection) 
	 {
	 	return extractMuscleGroupMuscleList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractMuscleGroupMuscleList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.MuscleGroupMuscleVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinicaladmin.vo.MuscleGroupMuscleVo vo = voCollection.get(i);
			ims.therapies.domain.objects.MuscleGroupMuscle domainObject = MuscleGroupMuscleVoAssembler.extractMuscleGroupMuscle(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.therapies.domain.objects.MuscleGroupMuscle object.
	 * @param domainObject ims.therapies.domain.objects.MuscleGroupMuscle
	 */
	 public static ims.clinicaladmin.vo.MuscleGroupMuscleVo create(ims.therapies.domain.objects.MuscleGroupMuscle domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.therapies.domain.objects.MuscleGroupMuscle object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinicaladmin.vo.MuscleGroupMuscleVo create(DomainObjectMap map, ims.therapies.domain.objects.MuscleGroupMuscle domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinicaladmin.vo.MuscleGroupMuscleVo valueObject = (ims.clinicaladmin.vo.MuscleGroupMuscleVo) map.getValueObject(domainObject, ims.clinicaladmin.vo.MuscleGroupMuscleVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinicaladmin.vo.MuscleGroupMuscleVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.therapies.domain.objects.MuscleGroupMuscle
	 */
	 public static ims.clinicaladmin.vo.MuscleGroupMuscleVo insert(ims.clinicaladmin.vo.MuscleGroupMuscleVo valueObject, ims.therapies.domain.objects.MuscleGroupMuscle domainObject) 
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
	 * @param domainObject ims.therapies.domain.objects.MuscleGroupMuscle
	 */
	 public static ims.clinicaladmin.vo.MuscleGroupMuscleVo insert(DomainObjectMap map, ims.clinicaladmin.vo.MuscleGroupMuscleVo valueObject, ims.therapies.domain.objects.MuscleGroupMuscle domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_MuscleGroupMuscle(domainObject.getId());
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
			
		// Muscle
		valueObject.setMuscle(ims.clinicaladmin.vo.domain.MuscleVoAssembler.create(map, domainObject.getMuscle()) );
		// MuslceGroup
		if (domainObject.getMuslceGroup() != null)
		{
			if(domainObject.getMuslceGroup() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getMuslceGroup();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setMuslceGroup(new ims.therapies.vo.MuscleGroupRefVo(id, -1));				
			}
			else
			{
				valueObject.setMuslceGroup(new ims.therapies.vo.MuscleGroupRefVo(domainObject.getMuslceGroup().getId(), domainObject.getMuslceGroup().getVersion()));
			}
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.therapies.domain.objects.MuscleGroupMuscle extractMuscleGroupMuscle(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.MuscleGroupMuscleVo valueObject) 
	{
		return 	extractMuscleGroupMuscle(domainFactory, valueObject, new HashMap());
	}

	public static ims.therapies.domain.objects.MuscleGroupMuscle extractMuscleGroupMuscle(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.MuscleGroupMuscleVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_MuscleGroupMuscle();
		ims.therapies.domain.objects.MuscleGroupMuscle domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.therapies.domain.objects.MuscleGroupMuscle)domMap.get(valueObject);
			}
			// ims.clinicaladmin.vo.MuscleGroupMuscleVo ID_MuscleGroupMuscle field is unknown
			domainObject = new ims.therapies.domain.objects.MuscleGroupMuscle();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_MuscleGroupMuscle());
			if (domMap.get(key) != null)
			{
				return (ims.therapies.domain.objects.MuscleGroupMuscle)domMap.get(key);
			}
			domainObject = (ims.therapies.domain.objects.MuscleGroupMuscle) domainFactory.getDomainObject(ims.therapies.domain.objects.MuscleGroupMuscle.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_MuscleGroupMuscle());

		domainObject.setMuscle(ims.clinicaladmin.vo.domain.MuscleVoAssembler.extractMuscle(domainFactory, valueObject.getMuscle(), domMap));
		ims.therapies.domain.objects.MuscleGroup value2 = null;
		if ( null != valueObject.getMuslceGroup() ) 
		{
			if (valueObject.getMuslceGroup().getBoId() == null)
			{
				if (domMap.get(valueObject.getMuslceGroup()) != null)
				{
					value2 = (ims.therapies.domain.objects.MuscleGroup)domMap.get(valueObject.getMuslceGroup());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getMuslceGroup();	
			}
			else
			{
				value2 = (ims.therapies.domain.objects.MuscleGroup)domainFactory.getDomainObject(ims.therapies.domain.objects.MuscleGroup.class, valueObject.getMuslceGroup().getBoId());
			}
		}
		domainObject.setMuslceGroup(value2);

		return domainObject;
	}

}
