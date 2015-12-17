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
 * @author Peter Martin
 */
public class ElectrotherapyPneumaticTreatmentVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.therapies.vo.ElectrotherapyPneumaticTreatmentVo copy(ims.therapies.vo.ElectrotherapyPneumaticTreatmentVo valueObjectDest, ims.therapies.vo.ElectrotherapyPneumaticTreatmentVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ElectrotherapyPneumaticTreatment(valueObjectSrc.getID_ElectrotherapyPneumaticTreatment());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// MachineUsed
		valueObjectDest.setMachineUsed(valueObjectSrc.getMachineUsed());
		// StartingPosition
		valueObjectDest.setStartingPosition(valueObjectSrc.getStartingPosition());
		// Laterality
		valueObjectDest.setLaterality(valueObjectSrc.getLaterality());
		// Area
		valueObjectDest.setArea(valueObjectSrc.getArea());
		// Splints
		valueObjectDest.setSplints(valueObjectSrc.getSplints());
		// Cycle
		valueObjectDest.setCycle(valueObjectSrc.getCycle());
		// Duration
		valueObjectDest.setDuration(valueObjectSrc.getDuration());
		// Pressure
		valueObjectDest.setPressure(valueObjectSrc.getPressure());
		// MinPressure
		valueObjectDest.setMinPressure(valueObjectSrc.getMinPressure());
		// MaxPressure
		valueObjectDest.setMaxPressure(valueObjectSrc.getMaxPressure());
		// Inflation
		valueObjectDest.setInflation(valueObjectSrc.getInflation());
		// RestTime
		valueObjectDest.setRestTime(valueObjectSrc.getRestTime());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createElectrotherapyPneumaticTreatmentVoCollectionFromElectrotherapyPneumaticTreatment(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.therapies.treatment.domain.objects.ElectrotherapyPneumaticTreatment objects.
	 */
	public static ims.therapies.vo.ElectrotherapyPneumaticTreatmentVoCollection createElectrotherapyPneumaticTreatmentVoCollectionFromElectrotherapyPneumaticTreatment(java.util.Set domainObjectSet)	
	{
		return createElectrotherapyPneumaticTreatmentVoCollectionFromElectrotherapyPneumaticTreatment(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.therapies.treatment.domain.objects.ElectrotherapyPneumaticTreatment objects.
	 */
	public static ims.therapies.vo.ElectrotherapyPneumaticTreatmentVoCollection createElectrotherapyPneumaticTreatmentVoCollectionFromElectrotherapyPneumaticTreatment(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.therapies.vo.ElectrotherapyPneumaticTreatmentVoCollection voList = new ims.therapies.vo.ElectrotherapyPneumaticTreatmentVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.therapies.treatment.domain.objects.ElectrotherapyPneumaticTreatment domainObject = (ims.therapies.treatment.domain.objects.ElectrotherapyPneumaticTreatment) iterator.next();
			ims.therapies.vo.ElectrotherapyPneumaticTreatmentVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.therapies.treatment.domain.objects.ElectrotherapyPneumaticTreatment objects.
	 */
	public static ims.therapies.vo.ElectrotherapyPneumaticTreatmentVoCollection createElectrotherapyPneumaticTreatmentVoCollectionFromElectrotherapyPneumaticTreatment(java.util.List domainObjectList) 
	{
		return createElectrotherapyPneumaticTreatmentVoCollectionFromElectrotherapyPneumaticTreatment(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.therapies.treatment.domain.objects.ElectrotherapyPneumaticTreatment objects.
	 */
	public static ims.therapies.vo.ElectrotherapyPneumaticTreatmentVoCollection createElectrotherapyPneumaticTreatmentVoCollectionFromElectrotherapyPneumaticTreatment(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.therapies.vo.ElectrotherapyPneumaticTreatmentVoCollection voList = new ims.therapies.vo.ElectrotherapyPneumaticTreatmentVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.therapies.treatment.domain.objects.ElectrotherapyPneumaticTreatment domainObject = (ims.therapies.treatment.domain.objects.ElectrotherapyPneumaticTreatment) domainObjectList.get(i);
			ims.therapies.vo.ElectrotherapyPneumaticTreatmentVo vo = create(map, domainObject);

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
	 * Create the ims.therapies.treatment.domain.objects.ElectrotherapyPneumaticTreatment set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractElectrotherapyPneumaticTreatmentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.ElectrotherapyPneumaticTreatmentVoCollection voCollection) 
	 {
	 	return extractElectrotherapyPneumaticTreatmentSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractElectrotherapyPneumaticTreatmentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.ElectrotherapyPneumaticTreatmentVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.therapies.vo.ElectrotherapyPneumaticTreatmentVo vo = voCollection.get(i);
			ims.therapies.treatment.domain.objects.ElectrotherapyPneumaticTreatment domainObject = ElectrotherapyPneumaticTreatmentVoAssembler.extractElectrotherapyPneumaticTreatment(domainFactory, vo, domMap);

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
	 * Create the ims.therapies.treatment.domain.objects.ElectrotherapyPneumaticTreatment list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractElectrotherapyPneumaticTreatmentList(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.ElectrotherapyPneumaticTreatmentVoCollection voCollection) 
	 {
	 	return extractElectrotherapyPneumaticTreatmentList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractElectrotherapyPneumaticTreatmentList(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.ElectrotherapyPneumaticTreatmentVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.therapies.vo.ElectrotherapyPneumaticTreatmentVo vo = voCollection.get(i);
			ims.therapies.treatment.domain.objects.ElectrotherapyPneumaticTreatment domainObject = ElectrotherapyPneumaticTreatmentVoAssembler.extractElectrotherapyPneumaticTreatment(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.therapies.treatment.domain.objects.ElectrotherapyPneumaticTreatment object.
	 * @param domainObject ims.therapies.treatment.domain.objects.ElectrotherapyPneumaticTreatment
	 */
	 public static ims.therapies.vo.ElectrotherapyPneumaticTreatmentVo create(ims.therapies.treatment.domain.objects.ElectrotherapyPneumaticTreatment domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.therapies.treatment.domain.objects.ElectrotherapyPneumaticTreatment object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.therapies.vo.ElectrotherapyPneumaticTreatmentVo create(DomainObjectMap map, ims.therapies.treatment.domain.objects.ElectrotherapyPneumaticTreatment domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.therapies.vo.ElectrotherapyPneumaticTreatmentVo valueObject = (ims.therapies.vo.ElectrotherapyPneumaticTreatmentVo) map.getValueObject(domainObject, ims.therapies.vo.ElectrotherapyPneumaticTreatmentVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.therapies.vo.ElectrotherapyPneumaticTreatmentVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.therapies.treatment.domain.objects.ElectrotherapyPneumaticTreatment
	 */
	 public static ims.therapies.vo.ElectrotherapyPneumaticTreatmentVo insert(ims.therapies.vo.ElectrotherapyPneumaticTreatmentVo valueObject, ims.therapies.treatment.domain.objects.ElectrotherapyPneumaticTreatment domainObject) 
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
	 * @param domainObject ims.therapies.treatment.domain.objects.ElectrotherapyPneumaticTreatment
	 */
	 public static ims.therapies.vo.ElectrotherapyPneumaticTreatmentVo insert(DomainObjectMap map, ims.therapies.vo.ElectrotherapyPneumaticTreatmentVo valueObject, ims.therapies.treatment.domain.objects.ElectrotherapyPneumaticTreatment domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ElectrotherapyPneumaticTreatment(domainObject.getId());
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
			
		// MachineUsed
		valueObject.setMachineUsed(ims.therapies.vo.domain.TreatmentEquipmentConfigVoAssembler.create(map, domainObject.getMachineUsed()) );
		// StartingPosition
		ims.domain.lookups.LookupInstance instance2 = domainObject.getStartingPosition();
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

			ims.spinalinjuries.vo.lookups.PneumaticStartingPos voLookup2 = new ims.spinalinjuries.vo.lookups.PneumaticStartingPos(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.PneumaticStartingPos parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.spinalinjuries.vo.lookups.PneumaticStartingPos(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setStartingPosition(voLookup2);
		}
				// Laterality
		ims.domain.lookups.LookupInstance instance3 = domainObject.getLaterality();
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

			ims.core.vo.lookups.LateralityLRB voLookup3 = new ims.core.vo.lookups.LateralityLRB(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.LateralityLRB parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.core.vo.lookups.LateralityLRB(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setLaterality(voLookup3);
		}
				// Area
		ims.domain.lookups.LookupInstance instance4 = domainObject.getArea();
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

			ims.spinalinjuries.vo.lookups.PneumaticArea voLookup4 = new ims.spinalinjuries.vo.lookups.PneumaticArea(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.PneumaticArea parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.spinalinjuries.vo.lookups.PneumaticArea(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setArea(voLookup4);
		}
				// Splints
		ims.domain.lookups.LookupInstance instance5 = domainObject.getSplints();
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

			ims.spinalinjuries.vo.lookups.PneumaticSplints voLookup5 = new ims.spinalinjuries.vo.lookups.PneumaticSplints(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.PneumaticSplints parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.spinalinjuries.vo.lookups.PneumaticSplints(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setSplints(voLookup5);
		}
				// Cycle
		ims.domain.lookups.LookupInstance instance6 = domainObject.getCycle();
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

			ims.spinalinjuries.vo.lookups.PneumaticCycle voLookup6 = new ims.spinalinjuries.vo.lookups.PneumaticCycle(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.PneumaticCycle parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.spinalinjuries.vo.lookups.PneumaticCycle(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setCycle(voLookup6);
		}
				// Duration
		valueObject.setDuration(domainObject.getDuration());
		// Pressure
		valueObject.setPressure(domainObject.getPressure());
		// MinPressure
		valueObject.setMinPressure(domainObject.getMinPressure());
		// MaxPressure
		valueObject.setMaxPressure(domainObject.getMaxPressure());
		// Inflation
		valueObject.setInflation(domainObject.getInflation());
		// RestTime
		valueObject.setRestTime(domainObject.getRestTime());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.therapies.treatment.domain.objects.ElectrotherapyPneumaticTreatment extractElectrotherapyPneumaticTreatment(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.ElectrotherapyPneumaticTreatmentVo valueObject) 
	{
		return 	extractElectrotherapyPneumaticTreatment(domainFactory, valueObject, new HashMap());
	}

	public static ims.therapies.treatment.domain.objects.ElectrotherapyPneumaticTreatment extractElectrotherapyPneumaticTreatment(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.ElectrotherapyPneumaticTreatmentVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ElectrotherapyPneumaticTreatment();
		ims.therapies.treatment.domain.objects.ElectrotherapyPneumaticTreatment domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.therapies.treatment.domain.objects.ElectrotherapyPneumaticTreatment)domMap.get(valueObject);
			}
			// ims.therapies.vo.ElectrotherapyPneumaticTreatmentVo ID_ElectrotherapyPneumaticTreatment field is unknown
			domainObject = new ims.therapies.treatment.domain.objects.ElectrotherapyPneumaticTreatment();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ElectrotherapyPneumaticTreatment());
			if (domMap.get(key) != null)
			{
				return (ims.therapies.treatment.domain.objects.ElectrotherapyPneumaticTreatment)domMap.get(key);
			}
			domainObject = (ims.therapies.treatment.domain.objects.ElectrotherapyPneumaticTreatment) domainFactory.getDomainObject(ims.therapies.treatment.domain.objects.ElectrotherapyPneumaticTreatment.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ElectrotherapyPneumaticTreatment());

		domainObject.setMachineUsed(ims.therapies.vo.domain.TreatmentEquipmentConfigVoAssembler.extractTreatmentEquipmentConfig(domainFactory, valueObject.getMachineUsed(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getStartingPosition() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getStartingPosition().getID());
		}
		domainObject.setStartingPosition(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getLaterality() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getLaterality().getID());
		}
		domainObject.setLaterality(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getArea() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getArea().getID());
		}
		domainObject.setArea(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getSplints() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getSplints().getID());
		}
		domainObject.setSplints(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getCycle() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getCycle().getID());
		}
		domainObject.setCycle(value6);
		domainObject.setDuration(valueObject.getDuration());
		domainObject.setPressure(valueObject.getPressure());
		domainObject.setMinPressure(valueObject.getMinPressure());
		domainObject.setMaxPressure(valueObject.getMaxPressure());
		domainObject.setInflation(valueObject.getInflation());
		domainObject.setRestTime(valueObject.getRestTime());

		return domainObject;
	}

}
