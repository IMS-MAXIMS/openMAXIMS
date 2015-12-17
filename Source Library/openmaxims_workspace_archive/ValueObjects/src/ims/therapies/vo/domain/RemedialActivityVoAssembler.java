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
 * @author Rory Fitzpatrick
 */
public class RemedialActivityVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.therapies.vo.RemedialActivityVo copy(ims.therapies.vo.RemedialActivityVo valueObjectDest, ims.therapies.vo.RemedialActivityVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_RemedialActivity(valueObjectSrc.getID_RemedialActivity());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Activity
		valueObjectDest.setActivity(valueObjectSrc.getActivity());
		// PatientPosition
		valueObjectDest.setPatientPosition(valueObjectSrc.getPatientPosition());
		// ActivityPosition
		valueObjectDest.setActivityPosition(valueObjectSrc.getActivityPosition());
		// Sequence
		valueObjectDest.setSequence(valueObjectSrc.getSequence());
		// Duration
		valueObjectDest.setDuration(valueObjectSrc.getDuration());
		// ActivityHeight
		valueObjectDest.setActivityHeight(valueObjectSrc.getActivityHeight());
		// NumberPauses
		valueObjectDest.setNumberPauses(valueObjectSrc.getNumberPauses());
		// RestPeriod
		valueObjectDest.setRestPeriod(valueObjectSrc.getRestPeriod());
		// AveragePause
		valueObjectDest.setAveragePause(valueObjectSrc.getAveragePause());
		// Independence
		valueObjectDest.setIndependence(valueObjectSrc.getIndependence());
		// SubjectiveObs
		valueObjectDest.setSubjectiveObs(valueObjectSrc.getSubjectiveObs());
		// Technique
		valueObjectDest.setTechnique(valueObjectSrc.getTechnique());
		// Material
		valueObjectDest.setMaterial(valueObjectSrc.getMaterial());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createRemedialActivityVoCollectionFromRemedialActivity(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.therapies.treatment.domain.objects.RemedialActivity objects.
	 */
	public static ims.therapies.vo.RemedialActivityVoCollection createRemedialActivityVoCollectionFromRemedialActivity(java.util.Set domainObjectSet)	
	{
		return createRemedialActivityVoCollectionFromRemedialActivity(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.therapies.treatment.domain.objects.RemedialActivity objects.
	 */
	public static ims.therapies.vo.RemedialActivityVoCollection createRemedialActivityVoCollectionFromRemedialActivity(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.therapies.vo.RemedialActivityVoCollection voList = new ims.therapies.vo.RemedialActivityVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.therapies.treatment.domain.objects.RemedialActivity domainObject = (ims.therapies.treatment.domain.objects.RemedialActivity) iterator.next();
			ims.therapies.vo.RemedialActivityVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.therapies.treatment.domain.objects.RemedialActivity objects.
	 */
	public static ims.therapies.vo.RemedialActivityVoCollection createRemedialActivityVoCollectionFromRemedialActivity(java.util.List domainObjectList) 
	{
		return createRemedialActivityVoCollectionFromRemedialActivity(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.therapies.treatment.domain.objects.RemedialActivity objects.
	 */
	public static ims.therapies.vo.RemedialActivityVoCollection createRemedialActivityVoCollectionFromRemedialActivity(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.therapies.vo.RemedialActivityVoCollection voList = new ims.therapies.vo.RemedialActivityVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.therapies.treatment.domain.objects.RemedialActivity domainObject = (ims.therapies.treatment.domain.objects.RemedialActivity) domainObjectList.get(i);
			ims.therapies.vo.RemedialActivityVo vo = create(map, domainObject);

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
	 * Create the ims.therapies.treatment.domain.objects.RemedialActivity set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractRemedialActivitySet(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.RemedialActivityVoCollection voCollection) 
	 {
	 	return extractRemedialActivitySet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractRemedialActivitySet(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.RemedialActivityVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.therapies.vo.RemedialActivityVo vo = voCollection.get(i);
			ims.therapies.treatment.domain.objects.RemedialActivity domainObject = RemedialActivityVoAssembler.extractRemedialActivity(domainFactory, vo, domMap);

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
	 * Create the ims.therapies.treatment.domain.objects.RemedialActivity list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractRemedialActivityList(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.RemedialActivityVoCollection voCollection) 
	 {
	 	return extractRemedialActivityList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractRemedialActivityList(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.RemedialActivityVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.therapies.vo.RemedialActivityVo vo = voCollection.get(i);
			ims.therapies.treatment.domain.objects.RemedialActivity domainObject = RemedialActivityVoAssembler.extractRemedialActivity(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.therapies.treatment.domain.objects.RemedialActivity object.
	 * @param domainObject ims.therapies.treatment.domain.objects.RemedialActivity
	 */
	 public static ims.therapies.vo.RemedialActivityVo create(ims.therapies.treatment.domain.objects.RemedialActivity domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.therapies.treatment.domain.objects.RemedialActivity object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.therapies.vo.RemedialActivityVo create(DomainObjectMap map, ims.therapies.treatment.domain.objects.RemedialActivity domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.therapies.vo.RemedialActivityVo valueObject = (ims.therapies.vo.RemedialActivityVo) map.getValueObject(domainObject, ims.therapies.vo.RemedialActivityVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.therapies.vo.RemedialActivityVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.therapies.treatment.domain.objects.RemedialActivity
	 */
	 public static ims.therapies.vo.RemedialActivityVo insert(ims.therapies.vo.RemedialActivityVo valueObject, ims.therapies.treatment.domain.objects.RemedialActivity domainObject) 
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
	 * @param domainObject ims.therapies.treatment.domain.objects.RemedialActivity
	 */
	 public static ims.therapies.vo.RemedialActivityVo insert(DomainObjectMap map, ims.therapies.vo.RemedialActivityVo valueObject, ims.therapies.treatment.domain.objects.RemedialActivity domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_RemedialActivity(domainObject.getId());
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
		ims.domain.lookups.LookupInstance instance1 = domainObject.getActivity();
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

			ims.spinalinjuries.vo.lookups.RemedialActivity voLookup1 = new ims.spinalinjuries.vo.lookups.RemedialActivity(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.RemedialActivity parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.spinalinjuries.vo.lookups.RemedialActivity(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setActivity(voLookup1);
		}
				// PatientPosition
		ims.domain.lookups.LookupInstance instance2 = domainObject.getPatientPosition();
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

			ims.spinalinjuries.vo.lookups.RemedialPatPosition voLookup2 = new ims.spinalinjuries.vo.lookups.RemedialPatPosition(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.RemedialPatPosition parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.spinalinjuries.vo.lookups.RemedialPatPosition(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setPatientPosition(voLookup2);
		}
				// ActivityPosition
		ims.domain.lookups.LookupInstance instance3 = domainObject.getActivityPosition();
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

			ims.spinalinjuries.vo.lookups.RemedialActPosition voLookup3 = new ims.spinalinjuries.vo.lookups.RemedialActPosition(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.RemedialActPosition parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.spinalinjuries.vo.lookups.RemedialActPosition(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setActivityPosition(voLookup3);
		}
				// Sequence
		ims.domain.lookups.LookupInstance instance4 = domainObject.getSequence();
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

			ims.spinalinjuries.vo.lookups.RemedialSequence voLookup4 = new ims.spinalinjuries.vo.lookups.RemedialSequence(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.RemedialSequence parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.spinalinjuries.vo.lookups.RemedialSequence(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setSequence(voLookup4);
		}
				// Duration
		valueObject.setDuration(domainObject.getDuration());
		// ActivityHeight
		valueObject.setActivityHeight(domainObject.getActivityHeight());
		// NumberPauses
		valueObject.setNumberPauses(domainObject.getNumberPauses());
		// RestPeriod
		valueObject.setRestPeriod(domainObject.getRestPeriod());
		// AveragePause
		valueObject.setAveragePause(domainObject.getAveragePause());
		// Independence
		ims.domain.lookups.LookupInstance instance10 = domainObject.getIndependence();
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

			ims.spinalinjuries.vo.lookups.RemedialIndependence voLookup10 = new ims.spinalinjuries.vo.lookups.RemedialIndependence(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.RemedialIndependence parentVoLookup10 = voLookup10;
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
								parentVoLookup10.setParent(new ims.spinalinjuries.vo.lookups.RemedialIndependence(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setIndependence(voLookup10);
		}
				// SubjectiveObs
		ims.domain.lookups.LookupInstance instance11 = domainObject.getSubjectiveObs();
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

			ims.spinalinjuries.vo.lookups.RemedialSubjectiveObs voLookup11 = new ims.spinalinjuries.vo.lookups.RemedialSubjectiveObs(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.RemedialSubjectiveObs parentVoLookup11 = voLookup11;
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
								parentVoLookup11.setParent(new ims.spinalinjuries.vo.lookups.RemedialSubjectiveObs(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setSubjectiveObs(voLookup11);
		}
				// Technique
		java.util.List listTechnique = domainObject.getTechnique();
		ims.spinalinjuries.vo.lookups.RemedialTechniqueCollection Technique = new ims.spinalinjuries.vo.lookups.RemedialTechniqueCollection();
		for(java.util.Iterator iterator = listTechnique.iterator(); iterator.hasNext(); ) 
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
			ims.spinalinjuries.vo.lookups.RemedialTechnique voInstance = new ims.spinalinjuries.vo.lookups.RemedialTechnique(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.RemedialTechnique parentVoInstance = voInstance;
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
								parentVoInstance.setParent(new ims.spinalinjuries.vo.lookups.RemedialTechnique(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			Technique.add(voInstance);
		}
		valueObject.setTechnique( Technique );
		// Material
		valueObject.setMaterial(ims.therapies.vo.domain.RemedialMaterialVoAssembler.createRemedialMaterialVoCollectionFromRemedialMaterial(map, domainObject.getMaterial()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.therapies.treatment.domain.objects.RemedialActivity extractRemedialActivity(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.RemedialActivityVo valueObject) 
	{
		return 	extractRemedialActivity(domainFactory, valueObject, new HashMap());
	}

	public static ims.therapies.treatment.domain.objects.RemedialActivity extractRemedialActivity(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.RemedialActivityVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_RemedialActivity();
		ims.therapies.treatment.domain.objects.RemedialActivity domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.therapies.treatment.domain.objects.RemedialActivity)domMap.get(valueObject);
			}
			// ims.therapies.vo.RemedialActivityVo ID_RemedialActivity field is unknown
			domainObject = new ims.therapies.treatment.domain.objects.RemedialActivity();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_RemedialActivity());
			if (domMap.get(key) != null)
			{
				return (ims.therapies.treatment.domain.objects.RemedialActivity)domMap.get(key);
			}
			domainObject = (ims.therapies.treatment.domain.objects.RemedialActivity) domainFactory.getDomainObject(ims.therapies.treatment.domain.objects.RemedialActivity.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_RemedialActivity());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getActivity() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getActivity().getID());
		}
		domainObject.setActivity(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getPatientPosition() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getPatientPosition().getID());
		}
		domainObject.setPatientPosition(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getActivityPosition() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getActivityPosition().getID());
		}
		domainObject.setActivityPosition(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getSequence() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getSequence().getID());
		}
		domainObject.setSequence(value4);
		domainObject.setDuration(valueObject.getDuration());
		domainObject.setActivityHeight(valueObject.getActivityHeight());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getNumberPauses() != null && valueObject.getNumberPauses().equals(""))
		{
			valueObject.setNumberPauses(null);
		}
		domainObject.setNumberPauses(valueObject.getNumberPauses());
		domainObject.setRestPeriod(valueObject.getRestPeriod());
		domainObject.setAveragePause(valueObject.getAveragePause());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getIndependence() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getIndependence().getID());
		}
		domainObject.setIndependence(value10);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getSubjectiveObs() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getSubjectiveObs().getID());
		}
		domainObject.setSubjectiveObs(value11);
		ims.spinalinjuries.vo.lookups.RemedialTechniqueCollection collection12 =
	valueObject.getTechnique();
	    java.util.List domainTechnique = domainObject.getTechnique();;			
	    int collection12Size=0;
		if (collection12 == null)
		{
			domainTechnique = new java.util.ArrayList(0);
		}
		else
		{
			collection12Size = collection12.size();
		}
		
		for(int i=0; i<collection12Size; i++) 
		{
			int instanceId = collection12.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainTechnique.indexOf(dom);
			if (domIdx == -1)
			{
				domainTechnique.add(i, dom);
			}
			else if (i != domIdx && i < domainTechnique.size())
			{
				Object tmp = domainTechnique.get(i);
				domainTechnique.set(i, domainTechnique.get(domIdx));
				domainTechnique.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j12 = domainTechnique.size();
		while (j12 > collection12Size)
		{
			domainTechnique.remove(j12-1);
			j12 = domainTechnique.size();
		}

		domainObject.setTechnique(domainTechnique);		
		domainObject.setMaterial(ims.therapies.vo.domain.RemedialMaterialVoAssembler.extractRemedialMaterialSet(domainFactory, valueObject.getMaterial(), domainObject.getMaterial(), domMap));		

		return domainObject;
	}

}
