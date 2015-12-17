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
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Kevin O'Carroll
 */
public class MskJointVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.MskJointVo copy(ims.core.vo.MskJointVo valueObjectDest, ims.core.vo.MskJointVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_MskJoints(valueObjectSrc.getID_MskJoints());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Name
		valueObjectDest.setName(valueObjectSrc.getName());
		// Description
		valueObjectDest.setDescription(valueObjectSrc.getDescription());
		// isActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
		// Movements
		valueObjectDest.setMovements(valueObjectSrc.getMovements());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createMskJointVoCollectionFromMskJoints(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.MskJoints objects.
	 */
	public static ims.core.vo.MskJointVoCollection createMskJointVoCollectionFromMskJoints(java.util.Set domainObjectSet)	
	{
		return createMskJointVoCollectionFromMskJoints(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.MskJoints objects.
	 */
	public static ims.core.vo.MskJointVoCollection createMskJointVoCollectionFromMskJoints(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.MskJointVoCollection voList = new ims.core.vo.MskJointVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.clinical.domain.objects.MskJoints domainObject = (ims.core.clinical.domain.objects.MskJoints) iterator.next();
			ims.core.vo.MskJointVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.MskJoints objects.
	 */
	public static ims.core.vo.MskJointVoCollection createMskJointVoCollectionFromMskJoints(java.util.List domainObjectList) 
	{
		return createMskJointVoCollectionFromMskJoints(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.MskJoints objects.
	 */
	public static ims.core.vo.MskJointVoCollection createMskJointVoCollectionFromMskJoints(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.MskJointVoCollection voList = new ims.core.vo.MskJointVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.MskJoints domainObject = (ims.core.clinical.domain.objects.MskJoints) domainObjectList.get(i);
			ims.core.vo.MskJointVo vo = create(map, domainObject);

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
	 * Create the ims.core.clinical.domain.objects.MskJoints set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractMskJointsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.MskJointVoCollection voCollection) 
	 {
	 	return extractMskJointsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractMskJointsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.MskJointVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.MskJointVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.MskJoints domainObject = MskJointVoAssembler.extractMskJoints(domainFactory, vo, domMap);

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
	 * Create the ims.core.clinical.domain.objects.MskJoints list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractMskJointsList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.MskJointVoCollection voCollection) 
	 {
	 	return extractMskJointsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractMskJointsList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.MskJointVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.MskJointVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.MskJoints domainObject = MskJointVoAssembler.extractMskJoints(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.clinical.domain.objects.MskJoints object.
	 * @param domainObject ims.core.clinical.domain.objects.MskJoints
	 */
	 public static ims.core.vo.MskJointVo create(ims.core.clinical.domain.objects.MskJoints domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.clinical.domain.objects.MskJoints object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.MskJointVo create(DomainObjectMap map, ims.core.clinical.domain.objects.MskJoints domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.MskJointVo valueObject = (ims.core.vo.MskJointVo) map.getValueObject(domainObject, ims.core.vo.MskJointVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.MskJointVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.clinical.domain.objects.MskJoints
	 */
	 public static ims.core.vo.MskJointVo insert(ims.core.vo.MskJointVo valueObject, ims.core.clinical.domain.objects.MskJoints domainObject) 
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
	 * @param domainObject ims.core.clinical.domain.objects.MskJoints
	 */
	 public static ims.core.vo.MskJointVo insert(DomainObjectMap map, ims.core.vo.MskJointVo valueObject, ims.core.clinical.domain.objects.MskJoints domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_MskJoints(domainObject.getId());
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
			
		// Name
		valueObject.setName(domainObject.getName());
		// Description
		valueObject.setDescription(domainObject.getDescription());
		// isActive
		valueObject.setIsActive( domainObject.isIsActive() );
		// Movements
		java.util.List listMovements = domainObject.getMovements();
		ims.spinalinjuries.vo.lookups.MskJointsMovementsCollection Movements = new ims.spinalinjuries.vo.lookups.MskJointsMovementsCollection();
		for(java.util.Iterator iterator = listMovements.iterator(); iterator.hasNext(); ) 
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
			ims.spinalinjuries.vo.lookups.MskJointsMovements voInstance = new ims.spinalinjuries.vo.lookups.MskJointsMovements(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.MskJointsMovements parentVoInstance = voInstance;
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
								parentVoInstance.setParent(new ims.spinalinjuries.vo.lookups.MskJointsMovements(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			Movements.add(voInstance);
		}
		valueObject.setMovements( Movements );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.domain.objects.MskJoints extractMskJoints(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.MskJointVo valueObject) 
	{
		return 	extractMskJoints(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.MskJoints extractMskJoints(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.MskJointVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_MskJoints();
		ims.core.clinical.domain.objects.MskJoints domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.clinical.domain.objects.MskJoints)domMap.get(valueObject);
			}
			// ims.core.vo.MskJointVo ID_MskJoints field is unknown
			domainObject = new ims.core.clinical.domain.objects.MskJoints();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_MskJoints());
			if (domMap.get(key) != null)
			{
				return (ims.core.clinical.domain.objects.MskJoints)domMap.get(key);
			}
			domainObject = (ims.core.clinical.domain.objects.MskJoints) domainFactory.getDomainObject(ims.core.clinical.domain.objects.MskJoints.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_MskJoints());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getName() != null && valueObject.getName().equals(""))
		{
			valueObject.setName(null);
		}
		domainObject.setName(valueObject.getName());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDescription() != null && valueObject.getDescription().equals(""))
		{
			valueObject.setDescription(null);
		}
		domainObject.setDescription(valueObject.getDescription());
		domainObject.setIsActive(valueObject.getIsActive());
		ims.spinalinjuries.vo.lookups.MskJointsMovementsCollection collection4 =
	valueObject.getMovements();
	    java.util.List domainMovements = domainObject.getMovements();;			
	    int collection4Size=0;
		if (collection4 == null)
		{
			domainMovements = new java.util.ArrayList(0);
		}
		else
		{
			collection4Size = collection4.size();
		}
		
		for(int i=0; i<collection4Size; i++) 
		{
			int instanceId = collection4.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainMovements.indexOf(dom);
			if (domIdx == -1)
			{
				domainMovements.add(i, dom);
			}
			else if (i != domIdx && i < domainMovements.size())
			{
				Object tmp = domainMovements.get(i);
				domainMovements.set(i, domainMovements.get(domIdx));
				domainMovements.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j4 = domainMovements.size();
		while (j4 > collection4Size)
		{
			domainMovements.remove(j4-1);
			j4 = domainMovements.size();
		}

		domainObject.setMovements(domainMovements);		

		return domainObject;
	}

}
