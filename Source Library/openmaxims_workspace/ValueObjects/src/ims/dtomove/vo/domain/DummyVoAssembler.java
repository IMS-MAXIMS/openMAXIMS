//#############################################################################
//#                                                                           #
//#  Copyright (C) <2015>  <IMS MAXIMS>                                       #
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
//#  IMS MAXIMS provides absolutely NO GUARANTEE OF THE CLINICAL SAFTEY of    #
//#  this program.  Users of this software do so entirely at their own risk.  #
//#  IMS MAXIMS only ensures the Clinical Safety of unaltered run-time        #
//#  software that it builds, deploys and maintains.                          #
//#                                                                           #
//#############################################################################
//#EOH
/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5589.25814)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated on 12/10/2015, 13:24
 *
 */
package ims.dtomove.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Barbara Worwood
 */
public class DummyVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.dtomove.vo.DummyVo copy(ims.dtomove.vo.DummyVo valueObjectDest, ims.dtomove.vo.DummyVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Dummy(valueObjectSrc.getID_Dummy());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// active
		valueObjectDest.setActive(valueObjectSrc.getActive());
		// Priority
		valueObjectDest.setPriority(valueObjectSrc.getPriority());
		// SpecialtyCode
		valueObjectDest.setSpecialtyCode(valueObjectSrc.getSpecialtyCode());
		// ServiceType
		valueObjectDest.setServiceType(valueObjectSrc.getServiceType());
		// ContractLocation
		valueObjectDest.setContractLocation(valueObjectSrc.getContractLocation());
		// CancelReason
		valueObjectDest.setCancelReason(valueObjectSrc.getCancelReason());
		// ApptStatus
		valueObjectDest.setApptStatus(valueObjectSrc.getApptStatus());
		// TreatmentCategory
		valueObjectDest.setTreatmentCategory(valueObjectSrc.getTreatmentCategory());
		// DNAReason
		valueObjectDest.setDNAReason(valueObjectSrc.getDNAReason());
		// MachineType
		valueObjectDest.setMachineType(valueObjectSrc.getMachineType());
		// ScheduleType
		valueObjectDest.setScheduleType(valueObjectSrc.getScheduleType());
		// ScheduleCategory
		valueObjectDest.setScheduleCategory(valueObjectSrc.getScheduleCategory());
		// IntervalType
		valueObjectDest.setIntervalType(valueObjectSrc.getIntervalType());
		// LocationChar
		valueObjectDest.setLocationChar(valueObjectSrc.getLocationChar());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createDummyVoCollectionFromDummy(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.dto_move.domain.objects.Dummy objects.
	 */
	public static ims.dtomove.vo.DummyVoCollection createDummyVoCollectionFromDummy(java.util.Set domainObjectSet)	
	{
		return createDummyVoCollectionFromDummy(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.dto_move.domain.objects.Dummy objects.
	 */
	public static ims.dtomove.vo.DummyVoCollection createDummyVoCollectionFromDummy(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.dtomove.vo.DummyVoCollection voList = new ims.dtomove.vo.DummyVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.dto_move.domain.objects.Dummy domainObject = (ims.dto_move.domain.objects.Dummy) iterator.next();
			ims.dtomove.vo.DummyVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.dto_move.domain.objects.Dummy objects.
	 */
	public static ims.dtomove.vo.DummyVoCollection createDummyVoCollectionFromDummy(java.util.List domainObjectList) 
	{
		return createDummyVoCollectionFromDummy(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.dto_move.domain.objects.Dummy objects.
	 */
	public static ims.dtomove.vo.DummyVoCollection createDummyVoCollectionFromDummy(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.dtomove.vo.DummyVoCollection voList = new ims.dtomove.vo.DummyVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.dto_move.domain.objects.Dummy domainObject = (ims.dto_move.domain.objects.Dummy) domainObjectList.get(i);
			ims.dtomove.vo.DummyVo vo = create(map, domainObject);

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
	 * Create the ims.dto_move.domain.objects.Dummy set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractDummySet(ims.domain.ILightweightDomainFactory domainFactory, ims.dtomove.vo.DummyVoCollection voCollection) 
	 {
	 	return extractDummySet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractDummySet(ims.domain.ILightweightDomainFactory domainFactory, ims.dtomove.vo.DummyVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.dtomove.vo.DummyVo vo = voCollection.get(i);
			ims.dto_move.domain.objects.Dummy domainObject = DummyVoAssembler.extractDummy(domainFactory, vo, domMap);

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
	 * Create the ims.dto_move.domain.objects.Dummy list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractDummyList(ims.domain.ILightweightDomainFactory domainFactory, ims.dtomove.vo.DummyVoCollection voCollection) 
	 {
	 	return extractDummyList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractDummyList(ims.domain.ILightweightDomainFactory domainFactory, ims.dtomove.vo.DummyVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.dtomove.vo.DummyVo vo = voCollection.get(i);
			ims.dto_move.domain.objects.Dummy domainObject = DummyVoAssembler.extractDummy(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.dto_move.domain.objects.Dummy object.
	 * @param domainObject ims.dto_move.domain.objects.Dummy
	 */
	 public static ims.dtomove.vo.DummyVo create(ims.dto_move.domain.objects.Dummy domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.dto_move.domain.objects.Dummy object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.dtomove.vo.DummyVo create(DomainObjectMap map, ims.dto_move.domain.objects.Dummy domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.dtomove.vo.DummyVo valueObject = (ims.dtomove.vo.DummyVo) map.getValueObject(domainObject, ims.dtomove.vo.DummyVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.dtomove.vo.DummyVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.dto_move.domain.objects.Dummy
	 */
	 public static ims.dtomove.vo.DummyVo insert(ims.dtomove.vo.DummyVo valueObject, ims.dto_move.domain.objects.Dummy domainObject) 
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
	 * @param domainObject ims.dto_move.domain.objects.Dummy
	 */
	 public static ims.dtomove.vo.DummyVo insert(DomainObjectMap map, ims.dtomove.vo.DummyVo valueObject, ims.dto_move.domain.objects.Dummy domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Dummy(domainObject.getId());
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
			
		// active
		valueObject.setActive(domainObject.getActive());
		// Priority
		ims.domain.lookups.LookupInstance instance2 = domainObject.getPriority();
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

			ims.ccosched.vo.lookups.Priority voLookup2 = new ims.ccosched.vo.lookups.Priority(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.ccosched.vo.lookups.Priority parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.ccosched.vo.lookups.Priority(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setPriority(voLookup2);
		}
				// SpecialtyCode
		ims.domain.lookups.LookupInstance instance3 = domainObject.getSpecialtyCode();
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

			ims.dtomove.vo.lookups.SpecialtyCode voLookup3 = new ims.dtomove.vo.lookups.SpecialtyCode(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.dtomove.vo.lookups.SpecialtyCode parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.dtomove.vo.lookups.SpecialtyCode(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setSpecialtyCode(voLookup3);
		}
				// ServiceType
		ims.domain.lookups.LookupInstance instance4 = domainObject.getServiceType();
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

			ims.dtomove.vo.lookups.ActionReason voLookup4 = new ims.dtomove.vo.lookups.ActionReason(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.dtomove.vo.lookups.ActionReason parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.dtomove.vo.lookups.ActionReason(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setServiceType(voLookup4);
		}
				// ContractLocation
		ims.domain.lookups.LookupInstance instance5 = domainObject.getContractLocation();
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

			ims.dtomove.vo.lookups.ContractLocation voLookup5 = new ims.dtomove.vo.lookups.ContractLocation(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.dtomove.vo.lookups.ContractLocation parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.dtomove.vo.lookups.ContractLocation(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setContractLocation(voLookup5);
		}
				// CancelReason
		ims.domain.lookups.LookupInstance instance6 = domainObject.getCancelReason();
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

			ims.dtomove.vo.lookups.ApptCancelledReason voLookup6 = new ims.dtomove.vo.lookups.ApptCancelledReason(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.dtomove.vo.lookups.ApptCancelledReason parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.dtomove.vo.lookups.ApptCancelledReason(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setCancelReason(voLookup6);
		}
				// ApptStatus
		ims.domain.lookups.LookupInstance instance7 = domainObject.getApptStatus();
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

			ims.ccosched.vo.lookups.AppointmentStatus voLookup7 = new ims.ccosched.vo.lookups.AppointmentStatus(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.ccosched.vo.lookups.AppointmentStatus parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.ccosched.vo.lookups.AppointmentStatus(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setApptStatus(voLookup7);
		}
				// TreatmentCategory
		ims.domain.lookups.LookupInstance instance8 = domainObject.getTreatmentCategory();
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

			ims.ccosched.vo.lookups.SchedCategory voLookup8 = new ims.ccosched.vo.lookups.SchedCategory(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.ccosched.vo.lookups.SchedCategory parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.ccosched.vo.lookups.SchedCategory(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setTreatmentCategory(voLookup8);
		}
				// DNAReason
		ims.domain.lookups.LookupInstance instance9 = domainObject.getDNAReason();
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

			ims.ccosched.vo.lookups.ReasonDNA voLookup9 = new ims.ccosched.vo.lookups.ReasonDNA(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.ccosched.vo.lookups.ReasonDNA parentVoLookup9 = voLookup9;
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
								parentVoLookup9.setParent(new ims.ccosched.vo.lookups.ReasonDNA(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setDNAReason(voLookup9);
		}
				// MachineType
		ims.domain.lookups.LookupInstance instance10 = domainObject.getMachineType();
		if ( null != instance10 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance10.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance10.getImage().getImageId(), instance10.getImage().getImagePath());
			}
			color = instance10.getColor();
			if (color != null) 
				color.getValue();

			ims.dtomove.vo.lookups.MachineTypes voLookup10 = new ims.dtomove.vo.lookups.MachineTypes(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.dtomove.vo.lookups.MachineTypes parentVoLookup10 = voLookup10;
			ims.domain.lookups.LookupInstance parent10 = instance10.getParent();
			while (parent10 != null)
			{
				if (parent10.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent10.getImage().getImageId(), parent10.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent10.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup10.setParent(new ims.dtomove.vo.lookups.MachineTypes(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setMachineType(voLookup10);
		}
				// ScheduleType
		ims.domain.lookups.LookupInstance instance11 = domainObject.getScheduleType();
		if ( null != instance11 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance11.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance11.getImage().getImageId(), instance11.getImage().getImagePath());
			}
			color = instance11.getColor();
			if (color != null) 
				color.getValue();

			ims.dtomove.vo.lookups.SchedulingType voLookup11 = new ims.dtomove.vo.lookups.SchedulingType(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.dtomove.vo.lookups.SchedulingType parentVoLookup11 = voLookup11;
			ims.domain.lookups.LookupInstance parent11 = instance11.getParent();
			while (parent11 != null)
			{
				if (parent11.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent11.getImage().getImageId(), parent11.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent11.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup11.setParent(new ims.dtomove.vo.lookups.SchedulingType(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setScheduleType(voLookup11);
		}
				// ScheduleCategory
		ims.domain.lookups.LookupInstance instance12 = domainObject.getScheduleCategory();
		if ( null != instance12 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance12.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance12.getImage().getImageId(), instance12.getImage().getImagePath());
			}
			color = instance12.getColor();
			if (color != null) 
				color.getValue();

			ims.dtomove.vo.lookups.SchedulingCategory voLookup12 = new ims.dtomove.vo.lookups.SchedulingCategory(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.dtomove.vo.lookups.SchedulingCategory parentVoLookup12 = voLookup12;
			ims.domain.lookups.LookupInstance parent12 = instance12.getParent();
			while (parent12 != null)
			{
				if (parent12.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent12.getImage().getImageId(), parent12.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent12.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup12.setParent(new ims.dtomove.vo.lookups.SchedulingCategory(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setScheduleCategory(voLookup12);
		}
				// IntervalType
		ims.domain.lookups.LookupInstance instance13 = domainObject.getIntervalType();
		if ( null != instance13 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance13.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance13.getImage().getImageId(), instance13.getImage().getImagePath());
			}
			color = instance13.getColor();
			if (color != null) 
				color.getValue();

			ims.dtomove.vo.lookups.IntervalType voLookup13 = new ims.dtomove.vo.lookups.IntervalType(instance13.getId(),instance13.getText(), instance13.isActive(), null, img, color);
			ims.dtomove.vo.lookups.IntervalType parentVoLookup13 = voLookup13;
			ims.domain.lookups.LookupInstance parent13 = instance13.getParent();
			while (parent13 != null)
			{
				if (parent13.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent13.getImage().getImageId(), parent13.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent13.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup13.setParent(new ims.dtomove.vo.lookups.IntervalType(parent13.getId(),parent13.getText(), parent13.isActive(), null, img, color));
				parentVoLookup13 = parentVoLookup13.getParent();
								parent13 = parent13.getParent();
			}			
			valueObject.setIntervalType(voLookup13);
		}
				// LocationChar
		ims.domain.lookups.LookupInstance instance14 = domainObject.getLocationChar();
		if ( null != instance14 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance14.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance14.getImage().getImageId(), instance14.getImage().getImagePath());
			}
			color = instance14.getColor();
			if (color != null) 
				color.getValue();

			ims.dtomove.vo.lookups.LocationCharacteristics voLookup14 = new ims.dtomove.vo.lookups.LocationCharacteristics(instance14.getId(),instance14.getText(), instance14.isActive(), null, img, color);
			ims.dtomove.vo.lookups.LocationCharacteristics parentVoLookup14 = voLookup14;
			ims.domain.lookups.LookupInstance parent14 = instance14.getParent();
			while (parent14 != null)
			{
				if (parent14.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent14.getImage().getImageId(), parent14.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent14.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup14.setParent(new ims.dtomove.vo.lookups.LocationCharacteristics(parent14.getId(),parent14.getText(), parent14.isActive(), null, img, color));
				parentVoLookup14 = parentVoLookup14.getParent();
								parent14 = parent14.getParent();
			}			
			valueObject.setLocationChar(voLookup14);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.dto_move.domain.objects.Dummy extractDummy(ims.domain.ILightweightDomainFactory domainFactory, ims.dtomove.vo.DummyVo valueObject) 
	{
		return 	extractDummy(domainFactory, valueObject, new HashMap());
	}

	public static ims.dto_move.domain.objects.Dummy extractDummy(ims.domain.ILightweightDomainFactory domainFactory, ims.dtomove.vo.DummyVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Dummy();
		ims.dto_move.domain.objects.Dummy domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.dto_move.domain.objects.Dummy)domMap.get(valueObject);
			}
			// ims.dtomove.vo.DummyVo ID_Dummy field is unknown
			domainObject = new ims.dto_move.domain.objects.Dummy();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Dummy());
			if (domMap.get(key) != null)
			{
				return (ims.dto_move.domain.objects.Dummy)domMap.get(key);
			}
			domainObject = (ims.dto_move.domain.objects.Dummy) domainFactory.getDomainObject(ims.dto_move.domain.objects.Dummy.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Dummy());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getActive() != null && valueObject.getActive().equals(""))
		{
			valueObject.setActive(null);
		}
		domainObject.setActive(valueObject.getActive());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getPriority() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getPriority().getID());
		}
		domainObject.setPriority(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getSpecialtyCode() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getSpecialtyCode().getID());
		}
		domainObject.setSpecialtyCode(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getServiceType() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getServiceType().getID());
		}
		domainObject.setServiceType(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getContractLocation() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getContractLocation().getID());
		}
		domainObject.setContractLocation(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getCancelReason() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getCancelReason().getID());
		}
		domainObject.setCancelReason(value6);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getApptStatus() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getApptStatus().getID());
		}
		domainObject.setApptStatus(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getTreatmentCategory() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getTreatmentCategory().getID());
		}
		domainObject.setTreatmentCategory(value8);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getDNAReason() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getDNAReason().getID());
		}
		domainObject.setDNAReason(value9);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getMachineType() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getMachineType().getID());
		}
		domainObject.setMachineType(value10);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getScheduleType() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getScheduleType().getID());
		}
		domainObject.setScheduleType(value11);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getScheduleCategory() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getScheduleCategory().getID());
		}
		domainObject.setScheduleCategory(value12);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value13 = null;
		if ( null != valueObject.getIntervalType() ) 
		{
			value13 =
				domainFactory.getLookupInstance(valueObject.getIntervalType().getID());
		}
		domainObject.setIntervalType(value13);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value14 = null;
		if ( null != valueObject.getLocationChar() ) 
		{
			value14 =
				domainFactory.getLookupInstance(valueObject.getLocationChar().getID());
		}
		domainObject.setLocationChar(value14);

		return domainObject;
	}

}
