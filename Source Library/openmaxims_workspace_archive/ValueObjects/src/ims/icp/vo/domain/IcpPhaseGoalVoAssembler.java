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
package ims.icp.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Ander Telleria
 */
public class IcpPhaseGoalVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.icp.vo.IcpPhaseGoalVo copy(ims.icp.vo.IcpPhaseGoalVo valueObjectDest, ims.icp.vo.IcpPhaseGoalVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ICPPhaseGoal(valueObjectSrc.getID_ICPPhaseGoal());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Goal
		valueObjectDest.setGoal(valueObjectSrc.getGoal());
		// isActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createIcpPhaseGoalVoCollectionFromICPPhaseGoal(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.icps.configuration.domain.objects.ICPPhaseGoal objects.
	 */
	public static ims.icp.vo.IcpPhaseGoalVoCollection createIcpPhaseGoalVoCollectionFromICPPhaseGoal(java.util.Set domainObjectSet)	
	{
		return createIcpPhaseGoalVoCollectionFromICPPhaseGoal(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.icps.configuration.domain.objects.ICPPhaseGoal objects.
	 */
	public static ims.icp.vo.IcpPhaseGoalVoCollection createIcpPhaseGoalVoCollectionFromICPPhaseGoal(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.icp.vo.IcpPhaseGoalVoCollection voList = new ims.icp.vo.IcpPhaseGoalVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.icps.configuration.domain.objects.ICPPhaseGoal domainObject = (ims.icps.configuration.domain.objects.ICPPhaseGoal) iterator.next();
			ims.icp.vo.IcpPhaseGoalVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.icps.configuration.domain.objects.ICPPhaseGoal objects.
	 */
	public static ims.icp.vo.IcpPhaseGoalVoCollection createIcpPhaseGoalVoCollectionFromICPPhaseGoal(java.util.List domainObjectList) 
	{
		return createIcpPhaseGoalVoCollectionFromICPPhaseGoal(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.icps.configuration.domain.objects.ICPPhaseGoal objects.
	 */
	public static ims.icp.vo.IcpPhaseGoalVoCollection createIcpPhaseGoalVoCollectionFromICPPhaseGoal(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.icp.vo.IcpPhaseGoalVoCollection voList = new ims.icp.vo.IcpPhaseGoalVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.icps.configuration.domain.objects.ICPPhaseGoal domainObject = (ims.icps.configuration.domain.objects.ICPPhaseGoal) domainObjectList.get(i);
			ims.icp.vo.IcpPhaseGoalVo vo = create(map, domainObject);

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
	 * Create the ims.icps.configuration.domain.objects.ICPPhaseGoal set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractICPPhaseGoalSet(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.IcpPhaseGoalVoCollection voCollection) 
	 {
	 	return extractICPPhaseGoalSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractICPPhaseGoalSet(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.IcpPhaseGoalVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.icp.vo.IcpPhaseGoalVo vo = voCollection.get(i);
			ims.icps.configuration.domain.objects.ICPPhaseGoal domainObject = IcpPhaseGoalVoAssembler.extractICPPhaseGoal(domainFactory, vo, domMap);

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
	 * Create the ims.icps.configuration.domain.objects.ICPPhaseGoal list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractICPPhaseGoalList(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.IcpPhaseGoalVoCollection voCollection) 
	 {
	 	return extractICPPhaseGoalList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractICPPhaseGoalList(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.IcpPhaseGoalVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.icp.vo.IcpPhaseGoalVo vo = voCollection.get(i);
			ims.icps.configuration.domain.objects.ICPPhaseGoal domainObject = IcpPhaseGoalVoAssembler.extractICPPhaseGoal(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.icps.configuration.domain.objects.ICPPhaseGoal object.
	 * @param domainObject ims.icps.configuration.domain.objects.ICPPhaseGoal
	 */
	 public static ims.icp.vo.IcpPhaseGoalVo create(ims.icps.configuration.domain.objects.ICPPhaseGoal domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.icps.configuration.domain.objects.ICPPhaseGoal object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.icp.vo.IcpPhaseGoalVo create(DomainObjectMap map, ims.icps.configuration.domain.objects.ICPPhaseGoal domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.icp.vo.IcpPhaseGoalVo valueObject = (ims.icp.vo.IcpPhaseGoalVo) map.getValueObject(domainObject, ims.icp.vo.IcpPhaseGoalVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.icp.vo.IcpPhaseGoalVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.icps.configuration.domain.objects.ICPPhaseGoal
	 */
	 public static ims.icp.vo.IcpPhaseGoalVo insert(ims.icp.vo.IcpPhaseGoalVo valueObject, ims.icps.configuration.domain.objects.ICPPhaseGoal domainObject) 
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
	 * @param domainObject ims.icps.configuration.domain.objects.ICPPhaseGoal
	 */
	 public static ims.icp.vo.IcpPhaseGoalVo insert(DomainObjectMap map, ims.icp.vo.IcpPhaseGoalVo valueObject, ims.icps.configuration.domain.objects.ICPPhaseGoal domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ICPPhaseGoal(domainObject.getId());
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
			
		// Goal
		valueObject.setGoal(domainObject.getGoal());
		// isActive
		valueObject.setIsActive( domainObject.isIsActive() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.icps.configuration.domain.objects.ICPPhaseGoal extractICPPhaseGoal(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.IcpPhaseGoalVo valueObject) 
	{
		return 	extractICPPhaseGoal(domainFactory, valueObject, new HashMap());
	}

	public static ims.icps.configuration.domain.objects.ICPPhaseGoal extractICPPhaseGoal(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.IcpPhaseGoalVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ICPPhaseGoal();
		ims.icps.configuration.domain.objects.ICPPhaseGoal domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.icps.configuration.domain.objects.ICPPhaseGoal)domMap.get(valueObject);
			}
			// ims.icp.vo.IcpPhaseGoalVo ID_ICPPhaseGoal field is unknown
			domainObject = new ims.icps.configuration.domain.objects.ICPPhaseGoal();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ICPPhaseGoal());
			if (domMap.get(key) != null)
			{
				return (ims.icps.configuration.domain.objects.ICPPhaseGoal)domMap.get(key);
			}
			domainObject = (ims.icps.configuration.domain.objects.ICPPhaseGoal) domainFactory.getDomainObject(ims.icps.configuration.domain.objects.ICPPhaseGoal.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ICPPhaseGoal());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getGoal() != null && valueObject.getGoal().equals(""))
		{
			valueObject.setGoal(null);
		}
		domainObject.setGoal(valueObject.getGoal());
		domainObject.setIsActive(valueObject.getIsActive());

		return domainObject;
	}

}
