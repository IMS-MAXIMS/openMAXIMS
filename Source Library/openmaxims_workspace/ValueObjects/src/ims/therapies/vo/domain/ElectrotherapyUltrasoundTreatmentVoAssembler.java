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
public class ElectrotherapyUltrasoundTreatmentVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.therapies.vo.ElectrotherapyUltrasoundTreatmentVo copy(ims.therapies.vo.ElectrotherapyUltrasoundTreatmentVo valueObjectDest, ims.therapies.vo.ElectrotherapyUltrasoundTreatmentVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ElectrotherapyUltrasoundTreatment(valueObjectSrc.getID_ElectrotherapyUltrasoundTreatment());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Target
		valueObjectDest.setTarget(valueObjectSrc.getTarget());
		// AreaTreated
		valueObjectDest.setAreaTreated(valueObjectSrc.getAreaTreated());
		// MuscleAspect
		valueObjectDest.setMuscleAspect(valueObjectSrc.getMuscleAspect());
		// Wave
		valueObjectDest.setWave(valueObjectSrc.getWave());
		// Pulse
		valueObjectDest.setPulse(valueObjectSrc.getPulse());
		// Duration
		valueObjectDest.setDuration(valueObjectSrc.getDuration());
		// Frequency
		valueObjectDest.setFrequency(valueObjectSrc.getFrequency());
		// Intensity
		valueObjectDest.setIntensity(valueObjectSrc.getIntensity());
		// Comment
		valueObjectDest.setComment(valueObjectSrc.getComment());
		// MachineUsed
		valueObjectDest.setMachineUsed(valueObjectSrc.getMachineUsed());
		// Laterality
		valueObjectDest.setLaterality(valueObjectSrc.getLaterality());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createElectrotherapyUltrasoundTreatmentVoCollectionFromElectrotherapyUltrasoundTreatment(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.therapies.treatment.domain.objects.ElectrotherapyUltrasoundTreatment objects.
	 */
	public static ims.therapies.vo.ElectrotherapyUltrasoundTreatmentVoCollection createElectrotherapyUltrasoundTreatmentVoCollectionFromElectrotherapyUltrasoundTreatment(java.util.Set domainObjectSet)	
	{
		return createElectrotherapyUltrasoundTreatmentVoCollectionFromElectrotherapyUltrasoundTreatment(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.therapies.treatment.domain.objects.ElectrotherapyUltrasoundTreatment objects.
	 */
	public static ims.therapies.vo.ElectrotherapyUltrasoundTreatmentVoCollection createElectrotherapyUltrasoundTreatmentVoCollectionFromElectrotherapyUltrasoundTreatment(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.therapies.vo.ElectrotherapyUltrasoundTreatmentVoCollection voList = new ims.therapies.vo.ElectrotherapyUltrasoundTreatmentVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.therapies.treatment.domain.objects.ElectrotherapyUltrasoundTreatment domainObject = (ims.therapies.treatment.domain.objects.ElectrotherapyUltrasoundTreatment) iterator.next();
			ims.therapies.vo.ElectrotherapyUltrasoundTreatmentVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.therapies.treatment.domain.objects.ElectrotherapyUltrasoundTreatment objects.
	 */
	public static ims.therapies.vo.ElectrotherapyUltrasoundTreatmentVoCollection createElectrotherapyUltrasoundTreatmentVoCollectionFromElectrotherapyUltrasoundTreatment(java.util.List domainObjectList) 
	{
		return createElectrotherapyUltrasoundTreatmentVoCollectionFromElectrotherapyUltrasoundTreatment(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.therapies.treatment.domain.objects.ElectrotherapyUltrasoundTreatment objects.
	 */
	public static ims.therapies.vo.ElectrotherapyUltrasoundTreatmentVoCollection createElectrotherapyUltrasoundTreatmentVoCollectionFromElectrotherapyUltrasoundTreatment(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.therapies.vo.ElectrotherapyUltrasoundTreatmentVoCollection voList = new ims.therapies.vo.ElectrotherapyUltrasoundTreatmentVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.therapies.treatment.domain.objects.ElectrotherapyUltrasoundTreatment domainObject = (ims.therapies.treatment.domain.objects.ElectrotherapyUltrasoundTreatment) domainObjectList.get(i);
			ims.therapies.vo.ElectrotherapyUltrasoundTreatmentVo vo = create(map, domainObject);

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
	 * Create the ims.therapies.treatment.domain.objects.ElectrotherapyUltrasoundTreatment set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractElectrotherapyUltrasoundTreatmentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.ElectrotherapyUltrasoundTreatmentVoCollection voCollection) 
	 {
	 	return extractElectrotherapyUltrasoundTreatmentSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractElectrotherapyUltrasoundTreatmentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.ElectrotherapyUltrasoundTreatmentVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.therapies.vo.ElectrotherapyUltrasoundTreatmentVo vo = voCollection.get(i);
			ims.therapies.treatment.domain.objects.ElectrotherapyUltrasoundTreatment domainObject = ElectrotherapyUltrasoundTreatmentVoAssembler.extractElectrotherapyUltrasoundTreatment(domainFactory, vo, domMap);

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
	 * Create the ims.therapies.treatment.domain.objects.ElectrotherapyUltrasoundTreatment list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractElectrotherapyUltrasoundTreatmentList(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.ElectrotherapyUltrasoundTreatmentVoCollection voCollection) 
	 {
	 	return extractElectrotherapyUltrasoundTreatmentList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractElectrotherapyUltrasoundTreatmentList(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.ElectrotherapyUltrasoundTreatmentVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.therapies.vo.ElectrotherapyUltrasoundTreatmentVo vo = voCollection.get(i);
			ims.therapies.treatment.domain.objects.ElectrotherapyUltrasoundTreatment domainObject = ElectrotherapyUltrasoundTreatmentVoAssembler.extractElectrotherapyUltrasoundTreatment(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.therapies.treatment.domain.objects.ElectrotherapyUltrasoundTreatment object.
	 * @param domainObject ims.therapies.treatment.domain.objects.ElectrotherapyUltrasoundTreatment
	 */
	 public static ims.therapies.vo.ElectrotherapyUltrasoundTreatmentVo create(ims.therapies.treatment.domain.objects.ElectrotherapyUltrasoundTreatment domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.therapies.treatment.domain.objects.ElectrotherapyUltrasoundTreatment object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.therapies.vo.ElectrotherapyUltrasoundTreatmentVo create(DomainObjectMap map, ims.therapies.treatment.domain.objects.ElectrotherapyUltrasoundTreatment domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.therapies.vo.ElectrotherapyUltrasoundTreatmentVo valueObject = (ims.therapies.vo.ElectrotherapyUltrasoundTreatmentVo) map.getValueObject(domainObject, ims.therapies.vo.ElectrotherapyUltrasoundTreatmentVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.therapies.vo.ElectrotherapyUltrasoundTreatmentVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.therapies.treatment.domain.objects.ElectrotherapyUltrasoundTreatment
	 */
	 public static ims.therapies.vo.ElectrotherapyUltrasoundTreatmentVo insert(ims.therapies.vo.ElectrotherapyUltrasoundTreatmentVo valueObject, ims.therapies.treatment.domain.objects.ElectrotherapyUltrasoundTreatment domainObject) 
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
	 * @param domainObject ims.therapies.treatment.domain.objects.ElectrotherapyUltrasoundTreatment
	 */
	 public static ims.therapies.vo.ElectrotherapyUltrasoundTreatmentVo insert(DomainObjectMap map, ims.therapies.vo.ElectrotherapyUltrasoundTreatmentVo valueObject, ims.therapies.treatment.domain.objects.ElectrotherapyUltrasoundTreatment domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ElectrotherapyUltrasoundTreatment(domainObject.getId());
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
			
		// Target
		ims.domain.lookups.LookupInstance instance1 = domainObject.getTarget();
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

			ims.spinalinjuries.vo.lookups.UltrasoundTargetAndArea voLookup1 = new ims.spinalinjuries.vo.lookups.UltrasoundTargetAndArea(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.UltrasoundTargetAndArea parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.spinalinjuries.vo.lookups.UltrasoundTargetAndArea(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setTarget(voLookup1);
		}
				// AreaTreated
		ims.domain.lookups.LookupInstance instance2 = domainObject.getAreaTreated();
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

			ims.spinalinjuries.vo.lookups.UltrasoundTargetAndArea voLookup2 = new ims.spinalinjuries.vo.lookups.UltrasoundTargetAndArea(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.UltrasoundTargetAndArea parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.spinalinjuries.vo.lookups.UltrasoundTargetAndArea(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setAreaTreated(voLookup2);
		}
				// MuscleAspect
		ims.domain.lookups.LookupInstance instance3 = domainObject.getMuscleAspect();
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

			ims.spinalinjuries.vo.lookups.UltrasoundMuscleAspect voLookup3 = new ims.spinalinjuries.vo.lookups.UltrasoundMuscleAspect(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.UltrasoundMuscleAspect parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.spinalinjuries.vo.lookups.UltrasoundMuscleAspect(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setMuscleAspect(voLookup3);
		}
				// Wave
		ims.domain.lookups.LookupInstance instance4 = domainObject.getWave();
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

			ims.spinalinjuries.vo.lookups.UltrasoundWave voLookup4 = new ims.spinalinjuries.vo.lookups.UltrasoundWave(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.UltrasoundWave parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.spinalinjuries.vo.lookups.UltrasoundWave(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setWave(voLookup4);
		}
				// Pulse
		ims.domain.lookups.LookupInstance instance5 = domainObject.getPulse();
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

			ims.spinalinjuries.vo.lookups.UltrasoundPulse voLookup5 = new ims.spinalinjuries.vo.lookups.UltrasoundPulse(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.UltrasoundPulse parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.spinalinjuries.vo.lookups.UltrasoundPulse(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setPulse(voLookup5);
		}
				// Duration
		valueObject.setDuration(domainObject.getDuration());
		// Frequency
		ims.domain.lookups.LookupInstance instance7 = domainObject.getFrequency();
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

			ims.spinalinjuries.vo.lookups.UltrasoundFreq voLookup7 = new ims.spinalinjuries.vo.lookups.UltrasoundFreq(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.UltrasoundFreq parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.spinalinjuries.vo.lookups.UltrasoundFreq(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setFrequency(voLookup7);
		}
				// Intensity
		ims.domain.lookups.LookupInstance instance8 = domainObject.getIntensity();
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

			ims.spinalinjuries.vo.lookups.UltrasoundIntensity voLookup8 = new ims.spinalinjuries.vo.lookups.UltrasoundIntensity(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.UltrasoundIntensity parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.spinalinjuries.vo.lookups.UltrasoundIntensity(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setIntensity(voLookup8);
		}
				// Comment
		valueObject.setComment(domainObject.getComment());
		// MachineUsed
		valueObject.setMachineUsed(ims.therapies.vo.domain.TreatmentEquipmentConfigVoAssembler.create(map, domainObject.getMachineUsed()) );
		// Laterality
		ims.domain.lookups.LookupInstance instance11 = domainObject.getLaterality();
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

			ims.core.vo.lookups.LateralityLRB voLookup11 = new ims.core.vo.lookups.LateralityLRB(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.core.vo.lookups.LateralityLRB parentVoLookup11 = voLookup11;
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
								parentVoLookup11.setParent(new ims.core.vo.lookups.LateralityLRB(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setLaterality(voLookup11);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.therapies.treatment.domain.objects.ElectrotherapyUltrasoundTreatment extractElectrotherapyUltrasoundTreatment(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.ElectrotherapyUltrasoundTreatmentVo valueObject) 
	{
		return 	extractElectrotherapyUltrasoundTreatment(domainFactory, valueObject, new HashMap());
	}

	public static ims.therapies.treatment.domain.objects.ElectrotherapyUltrasoundTreatment extractElectrotherapyUltrasoundTreatment(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.ElectrotherapyUltrasoundTreatmentVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ElectrotherapyUltrasoundTreatment();
		ims.therapies.treatment.domain.objects.ElectrotherapyUltrasoundTreatment domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.therapies.treatment.domain.objects.ElectrotherapyUltrasoundTreatment)domMap.get(valueObject);
			}
			// ims.therapies.vo.ElectrotherapyUltrasoundTreatmentVo ID_ElectrotherapyUltrasoundTreatment field is unknown
			domainObject = new ims.therapies.treatment.domain.objects.ElectrotherapyUltrasoundTreatment();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ElectrotherapyUltrasoundTreatment());
			if (domMap.get(key) != null)
			{
				return (ims.therapies.treatment.domain.objects.ElectrotherapyUltrasoundTreatment)domMap.get(key);
			}
			domainObject = (ims.therapies.treatment.domain.objects.ElectrotherapyUltrasoundTreatment) domainFactory.getDomainObject(ims.therapies.treatment.domain.objects.ElectrotherapyUltrasoundTreatment.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ElectrotherapyUltrasoundTreatment());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getTarget() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getTarget().getID());
		}
		domainObject.setTarget(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getAreaTreated() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getAreaTreated().getID());
		}
		domainObject.setAreaTreated(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getMuscleAspect() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getMuscleAspect().getID());
		}
		domainObject.setMuscleAspect(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getWave() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getWave().getID());
		}
		domainObject.setWave(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getPulse() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getPulse().getID());
		}
		domainObject.setPulse(value5);
		domainObject.setDuration(valueObject.getDuration());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getFrequency() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getFrequency().getID());
		}
		domainObject.setFrequency(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getIntensity() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getIntensity().getID());
		}
		domainObject.setIntensity(value8);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getComment() != null && valueObject.getComment().equals(""))
		{
			valueObject.setComment(null);
		}
		domainObject.setComment(valueObject.getComment());
		domainObject.setMachineUsed(ims.therapies.vo.domain.TreatmentEquipmentConfigVoAssembler.extractTreatmentEquipmentConfig(domainFactory, valueObject.getMachineUsed(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getLaterality() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getLaterality().getID());
		}
		domainObject.setLaterality(value11);

		return domainObject;
	}

}
