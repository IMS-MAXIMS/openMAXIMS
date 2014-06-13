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
public class MuscleVertebralLevelsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinicaladmin.vo.MuscleVertebralLevelsVo copy(ims.clinicaladmin.vo.MuscleVertebralLevelsVo valueObjectDest, ims.clinicaladmin.vo.MuscleVertebralLevelsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_MuscleVertebralLevel(valueObjectSrc.getID_MuscleVertebralLevel());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// VertebralLevel
		valueObjectDest.setVertebralLevel(valueObjectSrc.getVertebralLevel());
		// Muscle
		valueObjectDest.setMuscle(valueObjectSrc.getMuscle());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createMuscleVertebralLevelsVoCollectionFromMuscleVertebralLevel(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.therapies.domain.objects.MuscleVertebralLevel objects.
	 */
	public static ims.clinicaladmin.vo.MuscleVertebralLevelsVoCollection createMuscleVertebralLevelsVoCollectionFromMuscleVertebralLevel(java.util.Set domainObjectSet)	
	{
		return createMuscleVertebralLevelsVoCollectionFromMuscleVertebralLevel(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.therapies.domain.objects.MuscleVertebralLevel objects.
	 */
	public static ims.clinicaladmin.vo.MuscleVertebralLevelsVoCollection createMuscleVertebralLevelsVoCollectionFromMuscleVertebralLevel(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinicaladmin.vo.MuscleVertebralLevelsVoCollection voList = new ims.clinicaladmin.vo.MuscleVertebralLevelsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.therapies.domain.objects.MuscleVertebralLevel domainObject = (ims.therapies.domain.objects.MuscleVertebralLevel) iterator.next();
			ims.clinicaladmin.vo.MuscleVertebralLevelsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.therapies.domain.objects.MuscleVertebralLevel objects.
	 */
	public static ims.clinicaladmin.vo.MuscleVertebralLevelsVoCollection createMuscleVertebralLevelsVoCollectionFromMuscleVertebralLevel(java.util.List domainObjectList) 
	{
		return createMuscleVertebralLevelsVoCollectionFromMuscleVertebralLevel(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.therapies.domain.objects.MuscleVertebralLevel objects.
	 */
	public static ims.clinicaladmin.vo.MuscleVertebralLevelsVoCollection createMuscleVertebralLevelsVoCollectionFromMuscleVertebralLevel(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinicaladmin.vo.MuscleVertebralLevelsVoCollection voList = new ims.clinicaladmin.vo.MuscleVertebralLevelsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.therapies.domain.objects.MuscleVertebralLevel domainObject = (ims.therapies.domain.objects.MuscleVertebralLevel) domainObjectList.get(i);
			ims.clinicaladmin.vo.MuscleVertebralLevelsVo vo = create(map, domainObject);

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
	 * Create the ims.therapies.domain.objects.MuscleVertebralLevel set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractMuscleVertebralLevelSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.MuscleVertebralLevelsVoCollection voCollection) 
	 {
	 	return extractMuscleVertebralLevelSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractMuscleVertebralLevelSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.MuscleVertebralLevelsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinicaladmin.vo.MuscleVertebralLevelsVo vo = voCollection.get(i);
			ims.therapies.domain.objects.MuscleVertebralLevel domainObject = MuscleVertebralLevelsVoAssembler.extractMuscleVertebralLevel(domainFactory, vo, domMap);

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
	 * Create the ims.therapies.domain.objects.MuscleVertebralLevel list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractMuscleVertebralLevelList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.MuscleVertebralLevelsVoCollection voCollection) 
	 {
	 	return extractMuscleVertebralLevelList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractMuscleVertebralLevelList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.MuscleVertebralLevelsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinicaladmin.vo.MuscleVertebralLevelsVo vo = voCollection.get(i);
			ims.therapies.domain.objects.MuscleVertebralLevel domainObject = MuscleVertebralLevelsVoAssembler.extractMuscleVertebralLevel(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.therapies.domain.objects.MuscleVertebralLevel object.
	 * @param domainObject ims.therapies.domain.objects.MuscleVertebralLevel
	 */
	 public static ims.clinicaladmin.vo.MuscleVertebralLevelsVo create(ims.therapies.domain.objects.MuscleVertebralLevel domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.therapies.domain.objects.MuscleVertebralLevel object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinicaladmin.vo.MuscleVertebralLevelsVo create(DomainObjectMap map, ims.therapies.domain.objects.MuscleVertebralLevel domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinicaladmin.vo.MuscleVertebralLevelsVo valueObject = (ims.clinicaladmin.vo.MuscleVertebralLevelsVo) map.getValueObject(domainObject, ims.clinicaladmin.vo.MuscleVertebralLevelsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinicaladmin.vo.MuscleVertebralLevelsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.therapies.domain.objects.MuscleVertebralLevel
	 */
	 public static ims.clinicaladmin.vo.MuscleVertebralLevelsVo insert(ims.clinicaladmin.vo.MuscleVertebralLevelsVo valueObject, ims.therapies.domain.objects.MuscleVertebralLevel domainObject) 
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
	 * @param domainObject ims.therapies.domain.objects.MuscleVertebralLevel
	 */
	 public static ims.clinicaladmin.vo.MuscleVertebralLevelsVo insert(DomainObjectMap map, ims.clinicaladmin.vo.MuscleVertebralLevelsVo valueObject, ims.therapies.domain.objects.MuscleVertebralLevel domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_MuscleVertebralLevel(domainObject.getId());
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
			
		// VertebralLevel
		if (domainObject.getVertebralLevel() != null)
		{
			if(domainObject.getVertebralLevel() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getVertebralLevel();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setVertebralLevel(new ims.core.clinical.vo.VertebralLevelsRefVo(id, -1));				
			}
			else
			{
				valueObject.setVertebralLevel(new ims.core.clinical.vo.VertebralLevelsRefVo(domainObject.getVertebralLevel().getId(), domainObject.getVertebralLevel().getVersion()));
			}
		}
		// Muscle
		if (domainObject.getMuscle() != null)
		{
			if(domainObject.getMuscle() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getMuscle();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setMuscle(new ims.therapies.vo.MuscleRefVo(id, -1));				
			}
			else
			{
				valueObject.setMuscle(new ims.therapies.vo.MuscleRefVo(domainObject.getMuscle().getId(), domainObject.getMuscle().getVersion()));
			}
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.therapies.domain.objects.MuscleVertebralLevel extractMuscleVertebralLevel(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.MuscleVertebralLevelsVo valueObject) 
	{
		return 	extractMuscleVertebralLevel(domainFactory, valueObject, new HashMap());
	}

	public static ims.therapies.domain.objects.MuscleVertebralLevel extractMuscleVertebralLevel(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.MuscleVertebralLevelsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_MuscleVertebralLevel();
		ims.therapies.domain.objects.MuscleVertebralLevel domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.therapies.domain.objects.MuscleVertebralLevel)domMap.get(valueObject);
			}
			// ims.clinicaladmin.vo.MuscleVertebralLevelsVo ID_MuscleVertebralLevel field is unknown
			domainObject = new ims.therapies.domain.objects.MuscleVertebralLevel();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_MuscleVertebralLevel());
			if (domMap.get(key) != null)
			{
				return (ims.therapies.domain.objects.MuscleVertebralLevel)domMap.get(key);
			}
			domainObject = (ims.therapies.domain.objects.MuscleVertebralLevel) domainFactory.getDomainObject(ims.therapies.domain.objects.MuscleVertebralLevel.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_MuscleVertebralLevel());

		ims.core.clinical.domain.objects.VertebralLevels value1 = null;
		if ( null != valueObject.getVertebralLevel() ) 
		{
			if (valueObject.getVertebralLevel().getBoId() == null)
			{
				if (domMap.get(valueObject.getVertebralLevel()) != null)
				{
					value1 = (ims.core.clinical.domain.objects.VertebralLevels)domMap.get(valueObject.getVertebralLevel());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getVertebralLevel();	
			}
			else
			{
				value1 = (ims.core.clinical.domain.objects.VertebralLevels)domainFactory.getDomainObject(ims.core.clinical.domain.objects.VertebralLevels.class, valueObject.getVertebralLevel().getBoId());
			}
		}
		domainObject.setVertebralLevel(value1);
		ims.therapies.domain.objects.Muscle value2 = null;
		if ( null != valueObject.getMuscle() ) 
		{
			if (valueObject.getMuscle().getBoId() == null)
			{
				if (domMap.get(valueObject.getMuscle()) != null)
				{
					value2 = (ims.therapies.domain.objects.Muscle)domMap.get(valueObject.getMuscle());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getMuscle();	
			}
			else
			{
				value2 = (ims.therapies.domain.objects.Muscle)domainFactory.getDomainObject(ims.therapies.domain.objects.Muscle.class, valueObject.getMuscle().getBoId());
			}
		}
		domainObject.setMuscle(value2);

		return domainObject;
	}

}
