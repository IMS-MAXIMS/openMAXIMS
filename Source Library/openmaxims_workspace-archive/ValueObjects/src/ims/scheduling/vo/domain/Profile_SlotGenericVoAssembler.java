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
package ims.scheduling.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Daniel Laffan
 */
public class Profile_SlotGenericVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.scheduling.vo.Profile_SlotGenericVo copy(ims.scheduling.vo.Profile_SlotGenericVo valueObjectDest, ims.scheduling.vo.Profile_SlotGenericVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Profile_Slot(valueObjectSrc.getID_Profile_Slot());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Activity
		valueObjectDest.setActivity(valueObjectSrc.getActivity());
		// StartTm
		valueObjectDest.setStartTm(valueObjectSrc.getStartTm());
		// Duration
		valueObjectDest.setDuration(valueObjectSrc.getDuration());
		// Priority
		valueObjectDest.setPriority(valueObjectSrc.getPriority());
		// NumberSlotsReq
		valueObjectDest.setNumberSlotsReq(valueObjectSrc.getNumberSlotsReq());
		// NoOfInstances
		valueObjectDest.setNoOfInstances(valueObjectSrc.getNoOfInstances());
		// DeallocNoOfDays
		valueObjectDest.setDeallocNoOfDays(valueObjectSrc.getDeallocNoOfDays());
		// isActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
		// Type
		valueObjectDest.setType(valueObjectSrc.getType());
		// DirectoryOfService
		valueObjectDest.setDirectoryOfService(valueObjectSrc.getDirectoryOfService());
		// slotResp
		valueObjectDest.setSlotResp(valueObjectSrc.getSlotResp());
		// Functions
		valueObjectDest.setFunctions(valueObjectSrc.getFunctions());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createProfile_SlotGenericVoCollectionFromProfile_Slot(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.Profile_Slot objects.
	 */
	public static ims.scheduling.vo.Profile_SlotGenericVoCollection createProfile_SlotGenericVoCollectionFromProfile_Slot(java.util.Set domainObjectSet)	
	{
		return createProfile_SlotGenericVoCollectionFromProfile_Slot(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.Profile_Slot objects.
	 */
	public static ims.scheduling.vo.Profile_SlotGenericVoCollection createProfile_SlotGenericVoCollectionFromProfile_Slot(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.scheduling.vo.Profile_SlotGenericVoCollection voList = new ims.scheduling.vo.Profile_SlotGenericVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.scheduling.domain.objects.Profile_Slot domainObject = (ims.scheduling.domain.objects.Profile_Slot) iterator.next();
			ims.scheduling.vo.Profile_SlotGenericVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.scheduling.domain.objects.Profile_Slot objects.
	 */
	public static ims.scheduling.vo.Profile_SlotGenericVoCollection createProfile_SlotGenericVoCollectionFromProfile_Slot(java.util.List domainObjectList) 
	{
		return createProfile_SlotGenericVoCollectionFromProfile_Slot(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.scheduling.domain.objects.Profile_Slot objects.
	 */
	public static ims.scheduling.vo.Profile_SlotGenericVoCollection createProfile_SlotGenericVoCollectionFromProfile_Slot(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.scheduling.vo.Profile_SlotGenericVoCollection voList = new ims.scheduling.vo.Profile_SlotGenericVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.scheduling.domain.objects.Profile_Slot domainObject = (ims.scheduling.domain.objects.Profile_Slot) domainObjectList.get(i);
			ims.scheduling.vo.Profile_SlotGenericVo vo = create(map, domainObject);

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
	 * Create the ims.scheduling.domain.objects.Profile_Slot set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractProfile_SlotSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.Profile_SlotGenericVoCollection voCollection) 
	 {
	 	return extractProfile_SlotSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractProfile_SlotSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.Profile_SlotGenericVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.Profile_SlotGenericVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.Profile_Slot domainObject = Profile_SlotGenericVoAssembler.extractProfile_Slot(domainFactory, vo, domMap);

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
	 * Create the ims.scheduling.domain.objects.Profile_Slot list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractProfile_SlotList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.Profile_SlotGenericVoCollection voCollection) 
	 {
	 	return extractProfile_SlotList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractProfile_SlotList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.Profile_SlotGenericVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.Profile_SlotGenericVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.Profile_Slot domainObject = Profile_SlotGenericVoAssembler.extractProfile_Slot(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.scheduling.domain.objects.Profile_Slot object.
	 * @param domainObject ims.scheduling.domain.objects.Profile_Slot
	 */
	 public static ims.scheduling.vo.Profile_SlotGenericVo create(ims.scheduling.domain.objects.Profile_Slot domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.scheduling.domain.objects.Profile_Slot object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.scheduling.vo.Profile_SlotGenericVo create(DomainObjectMap map, ims.scheduling.domain.objects.Profile_Slot domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.scheduling.vo.Profile_SlotGenericVo valueObject = (ims.scheduling.vo.Profile_SlotGenericVo) map.getValueObject(domainObject, ims.scheduling.vo.Profile_SlotGenericVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.scheduling.vo.Profile_SlotGenericVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.scheduling.domain.objects.Profile_Slot
	 */
	 public static ims.scheduling.vo.Profile_SlotGenericVo insert(ims.scheduling.vo.Profile_SlotGenericVo valueObject, ims.scheduling.domain.objects.Profile_Slot domainObject) 
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
	 * @param domainObject ims.scheduling.domain.objects.Profile_Slot
	 */
	 public static ims.scheduling.vo.Profile_SlotGenericVo insert(DomainObjectMap map, ims.scheduling.vo.Profile_SlotGenericVo valueObject, ims.scheduling.domain.objects.Profile_Slot domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Profile_Slot(domainObject.getId());
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
			
		// Activity
		valueObject.setActivity(ims.core.vo.domain.ActivityVoAssembler.create(map, domainObject.getActivity()) );
		// StartTm
		String StartTm = domainObject.getStartTm();
		if ( null != StartTm ) 
		{
			valueObject.setStartTm(new ims.framework.utils.Time(StartTm) );
		}
		// Duration
		valueObject.setDuration(domainObject.getDuration());
		// Priority
		ims.domain.lookups.LookupInstance instance4 = domainObject.getPriority();
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

			ims.scheduling.vo.lookups.SchedulingPriority voLookup4 = new ims.scheduling.vo.lookups.SchedulingPriority(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.scheduling.vo.lookups.SchedulingPriority parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.scheduling.vo.lookups.SchedulingPriority(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setPriority(voLookup4);
		}
				// NumberSlotsReq
		valueObject.setNumberSlotsReq(domainObject.getNumberSlotsReq());
		// NoOfInstances
		valueObject.setNoOfInstances(domainObject.getNoOfInstances());
		// DeallocNoOfDays
		valueObject.setDeallocNoOfDays(domainObject.getDeallocNoOfDays());
		// isActive
		valueObject.setIsActive( domainObject.isIsActive() );
		// Type
		ims.domain.lookups.LookupInstance instance9 = domainObject.getDirectAccessSlot();
		if ( null != instance9 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance9.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance9.getImage().getImageId(), instance9.getImage().getImagePath());
			}
			color = instance9.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.SchedCABSlotType voLookup9 = new ims.scheduling.vo.lookups.SchedCABSlotType(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.scheduling.vo.lookups.SchedCABSlotType parentVoLookup9 = voLookup9;
			ims.domain.lookups.LookupInstance parent9 = instance9.getParent();
			while (parent9 != null)
			{
				if (parent9.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent9.getImage().getImageId(), parent9.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent9.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup9.setParent(new ims.scheduling.vo.lookups.SchedCABSlotType(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setType(voLookup9);
		}
				// DirectoryOfService
		valueObject.setDirectoryOfService(ims.scheduling.vo.domain.SlotDirectoryOfServiceVoAssembler.createSlotDirectoryOfServiceVoCollectionFromSlotDirectoryOfService(map, domainObject.getDirectoryOfServices()) );
		// slotResp
		valueObject.setSlotResp(ims.scheduling.vo.domain.Profile_ListOwnerVoAssembler.create(map, domainObject.getSlotResp()) );
		// Functions
		ims.core.clinical.vo.ServiceFunctionRefVoCollection Functions = new ims.core.clinical.vo.ServiceFunctionRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getFunctions().iterator(); iterator.hasNext(); ) 
		{
			ims.core.clinical.domain.objects.ServiceFunction tmp = (ims.core.clinical.domain.objects.ServiceFunction)iterator.next();
			if (tmp != null)
				Functions.add(new ims.core.clinical.vo.ServiceFunctionRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setFunctions(Functions);
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.scheduling.domain.objects.Profile_Slot extractProfile_Slot(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.Profile_SlotGenericVo valueObject) 
	{
		return 	extractProfile_Slot(domainFactory, valueObject, new HashMap());
	}

	public static ims.scheduling.domain.objects.Profile_Slot extractProfile_Slot(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.Profile_SlotGenericVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Profile_Slot();
		ims.scheduling.domain.objects.Profile_Slot domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.scheduling.domain.objects.Profile_Slot)domMap.get(valueObject);
			}
			// ims.scheduling.vo.Profile_SlotGenericVo ID_Profile_Slot field is unknown
			domainObject = new ims.scheduling.domain.objects.Profile_Slot();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Profile_Slot());
			if (domMap.get(key) != null)
			{
				return (ims.scheduling.domain.objects.Profile_Slot)domMap.get(key);
			}
			domainObject = (ims.scheduling.domain.objects.Profile_Slot) domainFactory.getDomainObject(ims.scheduling.domain.objects.Profile_Slot.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Profile_Slot());

		domainObject.setActivity(ims.core.vo.domain.ActivityVoAssembler.extractActivity(domainFactory, valueObject.getActivity(), domMap));
		ims.framework.utils.Time time2 = valueObject.getStartTm();
		String value2 = null;
		if ( time2 != null ) 
		{
			value2 = time2.toString();
		}
		domainObject.setStartTm(value2);
		domainObject.setDuration(valueObject.getDuration());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getPriority() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getPriority().getID());
		}
		domainObject.setPriority(value4);
		domainObject.setNumberSlotsReq(valueObject.getNumberSlotsReq());
		domainObject.setNoOfInstances(valueObject.getNoOfInstances());
		domainObject.setDeallocNoOfDays(valueObject.getDeallocNoOfDays());
		domainObject.setIsActive(valueObject.getIsActive());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getType() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getType().getID());
		}
		domainObject.setDirectAccessSlot(value9);
		domainObject.setDirectoryOfServices(ims.scheduling.vo.domain.SlotDirectoryOfServiceVoAssembler.extractSlotDirectoryOfServiceSet(domainFactory, valueObject.getDirectoryOfService(), domainObject.getDirectoryOfServices(), domMap));		
		domainObject.setSlotResp(ims.scheduling.vo.domain.Profile_ListOwnerVoAssembler.extractProfile_ListOwner(domainFactory, valueObject.getSlotResp(), domMap));

		ims.core.clinical.vo.ServiceFunctionRefVoCollection refCollection12 = valueObject.getFunctions();
		int size12 = (null == refCollection12) ? 0 : refCollection12.size();		
		java.util.Set domainFunctions12 = domainObject.getFunctions();
		if (domainFunctions12 == null)
		{
			domainFunctions12 = new java.util.HashSet();
		}
		java.util.Set newSet12  = new java.util.HashSet();
		for(int i=0; i<size12; i++) 
		{
			ims.core.clinical.vo.ServiceFunctionRefVo vo = refCollection12.get(i);					
			ims.core.clinical.domain.objects.ServiceFunction dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.clinical.domain.objects.ServiceFunction)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.clinical.domain.objects.ServiceFunction)domainFactory.getDomainObject( ims.core.clinical.domain.objects.ServiceFunction.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainFunctions12.contains(dom))
			{
				domainFunctions12.add(dom);
			}
			newSet12.add(dom);			
		}
		java.util.Set removedSet12 = new java.util.HashSet();
		java.util.Iterator iter12 = domainFunctions12.iterator();
		//Find out which objects need to be removed
		while (iter12.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter12.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet12.contains(o))
			{
				removedSet12.add(o);
			}
		}
		iter12 = removedSet12.iterator();
		//Remove the unwanted objects
		while (iter12.hasNext())
		{
			domainFunctions12.remove(iter12.next());
		}		
		
		domainObject.setFunctions(domainFunctions12);		

		return domainObject;
	}

}
