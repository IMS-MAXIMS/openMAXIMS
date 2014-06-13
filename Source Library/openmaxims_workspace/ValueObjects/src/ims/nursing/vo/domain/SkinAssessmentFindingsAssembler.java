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
package ims.nursing.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Sinead McDermott
 */
public class SkinAssessmentFindingsAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.nursing.vo.SkinAssessmentFindings copy(ims.nursing.vo.SkinAssessmentFindings valueObjectDest, ims.nursing.vo.SkinAssessmentFindings valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_SkinAssessmentFindings(valueObjectSrc.getID_SkinAssessmentFindings());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// WoundType
		valueObjectDest.setWoundType(valueObjectSrc.getWoundType());
		// SiteImage
		valueObjectDest.setSiteImage(valueObjectSrc.getSiteImage());
		// SiteName
		valueObjectDest.setSiteName(valueObjectSrc.getSiteName());
		// SiteDetails
		valueObjectDest.setSiteDetails(valueObjectSrc.getSiteDetails());
		// HowLongIsItPresent
		valueObjectDest.setHowLongIsItPresent(valueObjectSrc.getHowLongIsItPresent());
		// PressureSoreGrade
		valueObjectDest.setPressureSoreGrade(valueObjectSrc.getPressureSoreGrade());
		// Length
		valueObjectDest.setLength(valueObjectSrc.getLength());
		// Width
		valueObjectDest.setWidth(valueObjectSrc.getWidth());
		// Depth
		valueObjectDest.setDepth(valueObjectSrc.getDepth());
		// WoundBed
		valueObjectDest.setWoundBed(valueObjectSrc.getWoundBed());
		// SurroundingSkin
		valueObjectDest.setSurroundingSkin(valueObjectSrc.getSurroundingSkin());
		// ExudateAmount
		valueObjectDest.setExudateAmount(valueObjectSrc.getExudateAmount());
		// ExudateType
		valueObjectDest.setExudateType(valueObjectSrc.getExudateType());
		// Odour
		valueObjectDest.setOdour(valueObjectSrc.getOdour());
		// Pain
		valueObjectDest.setPain(valueObjectSrc.getPain());
		// InfectionSuspected
		valueObjectDest.setInfectionSuspected(valueObjectSrc.getInfectionSuspected());
		// SwabTaken
		valueObjectDest.setSwabTaken(valueObjectSrc.getSwabTaken());
		// WoundTraced
		valueObjectDest.setWoundTraced(valueObjectSrc.getWoundTraced());
		// CleansedWith
		valueObjectDest.setCleansedWith(valueObjectSrc.getCleansedWith());
		// PrimaryDressing
		valueObjectDest.setPrimaryDressing(valueObjectSrc.getPrimaryDressing());
		// SecondaryDressing
		valueObjectDest.setSecondaryDressing(valueObjectSrc.getSecondaryDressing());
		// FrequencyOfChange
		valueObjectDest.setFrequencyOfChange(valueObjectSrc.getFrequencyOfChange());
		// Comment
		valueObjectDest.setComment(valueObjectSrc.getComment());
		// isDiscontinuedAssess
		valueObjectDest.setIsDiscontinuedAssess(valueObjectSrc.getIsDiscontinuedAssess());
		// isContinuedAssessment
		valueObjectDest.setIsContinuedAssessment(valueObjectSrc.getIsContinuedAssessment());
		// SkinAssessmentReview
		valueObjectDest.setSkinAssessmentReview(valueObjectSrc.getSkinAssessmentReview());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createSkinAssessmentFindingsCollectionFromSkinAssessmentFindings(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.nursing.assessmenttools.domain.objects.SkinAssessmentFindings objects.
	 */
	public static ims.nursing.vo.SkinAssessmentFindingsCollection createSkinAssessmentFindingsCollectionFromSkinAssessmentFindings(java.util.Set domainObjectSet)	
	{
		return createSkinAssessmentFindingsCollectionFromSkinAssessmentFindings(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.nursing.assessmenttools.domain.objects.SkinAssessmentFindings objects.
	 */
	public static ims.nursing.vo.SkinAssessmentFindingsCollection createSkinAssessmentFindingsCollectionFromSkinAssessmentFindings(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.nursing.vo.SkinAssessmentFindingsCollection voList = new ims.nursing.vo.SkinAssessmentFindingsCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.nursing.assessmenttools.domain.objects.SkinAssessmentFindings domainObject = (ims.nursing.assessmenttools.domain.objects.SkinAssessmentFindings) iterator.next();
			ims.nursing.vo.SkinAssessmentFindings vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.nursing.assessmenttools.domain.objects.SkinAssessmentFindings objects.
	 */
	public static ims.nursing.vo.SkinAssessmentFindingsCollection createSkinAssessmentFindingsCollectionFromSkinAssessmentFindings(java.util.List domainObjectList) 
	{
		return createSkinAssessmentFindingsCollectionFromSkinAssessmentFindings(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.nursing.assessmenttools.domain.objects.SkinAssessmentFindings objects.
	 */
	public static ims.nursing.vo.SkinAssessmentFindingsCollection createSkinAssessmentFindingsCollectionFromSkinAssessmentFindings(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.nursing.vo.SkinAssessmentFindingsCollection voList = new ims.nursing.vo.SkinAssessmentFindingsCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.nursing.assessmenttools.domain.objects.SkinAssessmentFindings domainObject = (ims.nursing.assessmenttools.domain.objects.SkinAssessmentFindings) domainObjectList.get(i);
			ims.nursing.vo.SkinAssessmentFindings vo = create(map, domainObject);

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
	 * Create the ims.nursing.assessmenttools.domain.objects.SkinAssessmentFindings set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractSkinAssessmentFindingsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.SkinAssessmentFindingsCollection voCollection) 
	 {
	 	return extractSkinAssessmentFindingsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractSkinAssessmentFindingsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.SkinAssessmentFindingsCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.nursing.vo.SkinAssessmentFindings vo = voCollection.get(i);
			ims.nursing.assessmenttools.domain.objects.SkinAssessmentFindings domainObject = SkinAssessmentFindingsAssembler.extractSkinAssessmentFindings(domainFactory, vo, domMap);

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
	 * Create the ims.nursing.assessmenttools.domain.objects.SkinAssessmentFindings list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractSkinAssessmentFindingsList(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.SkinAssessmentFindingsCollection voCollection) 
	 {
	 	return extractSkinAssessmentFindingsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractSkinAssessmentFindingsList(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.SkinAssessmentFindingsCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.nursing.vo.SkinAssessmentFindings vo = voCollection.get(i);
			ims.nursing.assessmenttools.domain.objects.SkinAssessmentFindings domainObject = SkinAssessmentFindingsAssembler.extractSkinAssessmentFindings(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.nursing.assessmenttools.domain.objects.SkinAssessmentFindings object.
	 * @param domainObject ims.nursing.assessmenttools.domain.objects.SkinAssessmentFindings
	 */
	 public static ims.nursing.vo.SkinAssessmentFindings create(ims.nursing.assessmenttools.domain.objects.SkinAssessmentFindings domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.nursing.assessmenttools.domain.objects.SkinAssessmentFindings object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.nursing.vo.SkinAssessmentFindings create(DomainObjectMap map, ims.nursing.assessmenttools.domain.objects.SkinAssessmentFindings domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.nursing.vo.SkinAssessmentFindings valueObject = (ims.nursing.vo.SkinAssessmentFindings) map.getValueObject(domainObject, ims.nursing.vo.SkinAssessmentFindings.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.nursing.vo.SkinAssessmentFindings(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.nursing.assessmenttools.domain.objects.SkinAssessmentFindings
	 */
	 public static ims.nursing.vo.SkinAssessmentFindings insert(ims.nursing.vo.SkinAssessmentFindings valueObject, ims.nursing.assessmenttools.domain.objects.SkinAssessmentFindings domainObject) 
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
	 * @param domainObject ims.nursing.assessmenttools.domain.objects.SkinAssessmentFindings
	 */
	 public static ims.nursing.vo.SkinAssessmentFindings insert(DomainObjectMap map, ims.nursing.vo.SkinAssessmentFindings valueObject, ims.nursing.assessmenttools.domain.objects.SkinAssessmentFindings domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_SkinAssessmentFindings(domainObject.getId());
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
			
		// WoundType
		ims.domain.lookups.LookupInstance instance1 = domainObject.getWoundType();
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

			ims.nursing.vo.lookups.SkinWoundType voLookup1 = new ims.nursing.vo.lookups.SkinWoundType(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.nursing.vo.lookups.SkinWoundType parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.nursing.vo.lookups.SkinWoundType(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setWoundType(voLookup1);
		}
				// SiteImage
		valueObject.setSiteImage(domainObject.getSiteImage());
		// SiteName
		valueObject.setSiteName(domainObject.getSiteName());
		// SiteDetails
		valueObject.setSiteDetails(domainObject.getSiteDetails());
		// HowLongIsItPresent
		valueObject.setHowLongIsItPresent(domainObject.getHowLongIsItPresent());
		// PressureSoreGrade
		ims.domain.lookups.LookupInstance instance6 = domainObject.getPressureSoreGrade();
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

			ims.nursing.vo.lookups.SkinPressureSoreGrade voLookup6 = new ims.nursing.vo.lookups.SkinPressureSoreGrade(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.nursing.vo.lookups.SkinPressureSoreGrade parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.nursing.vo.lookups.SkinPressureSoreGrade(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setPressureSoreGrade(voLookup6);
		}
				// Length
		valueObject.setLength(domainObject.getLength());
		// Width
		valueObject.setWidth(domainObject.getWidth());
		// Depth
		valueObject.setDepth(domainObject.getDepth());
		// WoundBed
		ims.domain.lookups.LookupInstance instance10 = domainObject.getWoundBed();
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

			ims.nursing.vo.lookups.SkinWoundBed voLookup10 = new ims.nursing.vo.lookups.SkinWoundBed(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.nursing.vo.lookups.SkinWoundBed parentVoLookup10 = voLookup10;
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
								parentVoLookup10.setParent(new ims.nursing.vo.lookups.SkinWoundBed(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setWoundBed(voLookup10);
		}
				// SurroundingSkin
		ims.domain.lookups.LookupInstance instance11 = domainObject.getSurroundingSkin();
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

			ims.nursing.vo.lookups.SkinSurroundingSkin voLookup11 = new ims.nursing.vo.lookups.SkinSurroundingSkin(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.nursing.vo.lookups.SkinSurroundingSkin parentVoLookup11 = voLookup11;
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
								parentVoLookup11.setParent(new ims.nursing.vo.lookups.SkinSurroundingSkin(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setSurroundingSkin(voLookup11);
		}
				// ExudateAmount
		ims.domain.lookups.LookupInstance instance12 = domainObject.getExudateAmount();
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

			ims.nursing.vo.lookups.SkinExudateAmount voLookup12 = new ims.nursing.vo.lookups.SkinExudateAmount(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.nursing.vo.lookups.SkinExudateAmount parentVoLookup12 = voLookup12;
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
								parentVoLookup12.setParent(new ims.nursing.vo.lookups.SkinExudateAmount(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setExudateAmount(voLookup12);
		}
				// ExudateType
		ims.domain.lookups.LookupInstance instance13 = domainObject.getExudateType();
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

			ims.nursing.vo.lookups.SkinExudateType voLookup13 = new ims.nursing.vo.lookups.SkinExudateType(instance13.getId(),instance13.getText(), instance13.isActive(), null, img, color);
			ims.nursing.vo.lookups.SkinExudateType parentVoLookup13 = voLookup13;
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
								parentVoLookup13.setParent(new ims.nursing.vo.lookups.SkinExudateType(parent13.getId(),parent13.getText(), parent13.isActive(), null, img, color));
				parentVoLookup13 = parentVoLookup13.getParent();
								parent13 = parent13.getParent();
			}			
			valueObject.setExudateType(voLookup13);
		}
				// Odour
		ims.domain.lookups.LookupInstance instance14 = domainObject.getOdour();
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

			ims.nursing.vo.lookups.SkinOdour voLookup14 = new ims.nursing.vo.lookups.SkinOdour(instance14.getId(),instance14.getText(), instance14.isActive(), null, img, color);
			ims.nursing.vo.lookups.SkinOdour parentVoLookup14 = voLookup14;
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
								parentVoLookup14.setParent(new ims.nursing.vo.lookups.SkinOdour(parent14.getId(),parent14.getText(), parent14.isActive(), null, img, color));
				parentVoLookup14 = parentVoLookup14.getParent();
								parent14 = parent14.getParent();
			}			
			valueObject.setOdour(voLookup14);
		}
				// Pain
		ims.domain.lookups.LookupInstance instance15 = domainObject.getPain();
		if ( null != instance15 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance15.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance15.getImage().getImageId(), instance15.getImage().getImagePath());
			}
			color = instance15.getColor();
			if (color != null) 
				color.getValue();

			ims.nursing.vo.lookups.SkinPain voLookup15 = new ims.nursing.vo.lookups.SkinPain(instance15.getId(),instance15.getText(), instance15.isActive(), null, img, color);
			ims.nursing.vo.lookups.SkinPain parentVoLookup15 = voLookup15;
			ims.domain.lookups.LookupInstance parent15 = instance15.getParent();
			while (parent15 != null)
			{
				if (parent15.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent15.getImage().getImageId(), parent15.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent15.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup15.setParent(new ims.nursing.vo.lookups.SkinPain(parent15.getId(),parent15.getText(), parent15.isActive(), null, img, color));
				parentVoLookup15 = parentVoLookup15.getParent();
								parent15 = parent15.getParent();
			}			
			valueObject.setPain(voLookup15);
		}
				// InfectionSuspected
		valueObject.setInfectionSuspected( domainObject.isInfectionSuspected() );
		// SwabTaken
		valueObject.setSwabTaken( domainObject.isSwabTaken() );
		// WoundTraced
		valueObject.setWoundTraced( domainObject.isWoundTraced() );
		// CleansedWith
		ims.domain.lookups.LookupInstance instance19 = domainObject.getCleansedWith();
		if ( null != instance19 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance19.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance19.getImage().getImageId(), instance19.getImage().getImagePath());
			}
			color = instance19.getColor();
			if (color != null) 
				color.getValue();

			ims.nursing.vo.lookups.SkinCleansedWith voLookup19 = new ims.nursing.vo.lookups.SkinCleansedWith(instance19.getId(),instance19.getText(), instance19.isActive(), null, img, color);
			ims.nursing.vo.lookups.SkinCleansedWith parentVoLookup19 = voLookup19;
			ims.domain.lookups.LookupInstance parent19 = instance19.getParent();
			while (parent19 != null)
			{
				if (parent19.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent19.getImage().getImageId(), parent19.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent19.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup19.setParent(new ims.nursing.vo.lookups.SkinCleansedWith(parent19.getId(),parent19.getText(), parent19.isActive(), null, img, color));
				parentVoLookup19 = parentVoLookup19.getParent();
								parent19 = parent19.getParent();
			}			
			valueObject.setCleansedWith(voLookup19);
		}
				// PrimaryDressing
		ims.domain.lookups.LookupInstance instance20 = domainObject.getPrimaryDressing();
		if ( null != instance20 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance20.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance20.getImage().getImageId(), instance20.getImage().getImagePath());
			}
			color = instance20.getColor();
			if (color != null) 
				color.getValue();

			ims.nursing.vo.lookups.SkinPrimaryDressing voLookup20 = new ims.nursing.vo.lookups.SkinPrimaryDressing(instance20.getId(),instance20.getText(), instance20.isActive(), null, img, color);
			ims.nursing.vo.lookups.SkinPrimaryDressing parentVoLookup20 = voLookup20;
			ims.domain.lookups.LookupInstance parent20 = instance20.getParent();
			while (parent20 != null)
			{
				if (parent20.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent20.getImage().getImageId(), parent20.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent20.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup20.setParent(new ims.nursing.vo.lookups.SkinPrimaryDressing(parent20.getId(),parent20.getText(), parent20.isActive(), null, img, color));
				parentVoLookup20 = parentVoLookup20.getParent();
								parent20 = parent20.getParent();
			}			
			valueObject.setPrimaryDressing(voLookup20);
		}
				// SecondaryDressing
		ims.domain.lookups.LookupInstance instance21 = domainObject.getSecondaryDressing();
		if ( null != instance21 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance21.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance21.getImage().getImageId(), instance21.getImage().getImagePath());
			}
			color = instance21.getColor();
			if (color != null) 
				color.getValue();

			ims.nursing.vo.lookups.SkinSecondaryDressing voLookup21 = new ims.nursing.vo.lookups.SkinSecondaryDressing(instance21.getId(),instance21.getText(), instance21.isActive(), null, img, color);
			ims.nursing.vo.lookups.SkinSecondaryDressing parentVoLookup21 = voLookup21;
			ims.domain.lookups.LookupInstance parent21 = instance21.getParent();
			while (parent21 != null)
			{
				if (parent21.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent21.getImage().getImageId(), parent21.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent21.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup21.setParent(new ims.nursing.vo.lookups.SkinSecondaryDressing(parent21.getId(),parent21.getText(), parent21.isActive(), null, img, color));
				parentVoLookup21 = parentVoLookup21.getParent();
								parent21 = parent21.getParent();
			}			
			valueObject.setSecondaryDressing(voLookup21);
		}
				// FrequencyOfChange
		ims.domain.lookups.LookupInstance instance22 = domainObject.getFrequencyOfChange();
		if ( null != instance22 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance22.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance22.getImage().getImageId(), instance22.getImage().getImagePath());
			}
			color = instance22.getColor();
			if (color != null) 
				color.getValue();

			ims.nursing.vo.lookups.SkinFrequencyOfChange voLookup22 = new ims.nursing.vo.lookups.SkinFrequencyOfChange(instance22.getId(),instance22.getText(), instance22.isActive(), null, img, color);
			ims.nursing.vo.lookups.SkinFrequencyOfChange parentVoLookup22 = voLookup22;
			ims.domain.lookups.LookupInstance parent22 = instance22.getParent();
			while (parent22 != null)
			{
				if (parent22.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent22.getImage().getImageId(), parent22.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent22.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup22.setParent(new ims.nursing.vo.lookups.SkinFrequencyOfChange(parent22.getId(),parent22.getText(), parent22.isActive(), null, img, color));
				parentVoLookup22 = parentVoLookup22.getParent();
								parent22 = parent22.getParent();
			}			
			valueObject.setFrequencyOfChange(voLookup22);
		}
				// Comment
		valueObject.setComment(domainObject.getComment());
		// isDiscontinuedAssess
		valueObject.setIsDiscontinuedAssess( domainObject.isIsDiscontinuedAssess() );
		// isContinuedAssessment
		valueObject.setIsContinuedAssessment( domainObject.isIsContinuedAssessment() );
		// SkinAssessmentReview
		valueObject.setSkinAssessmentReview(ims.nursing.vo.domain.SkinAssessmentReviewAssembler.createSkinAssessmentReviewCollectionFromSkinAssessmentReview(map, domainObject.getSkinAssessmentReview()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.nursing.assessmenttools.domain.objects.SkinAssessmentFindings extractSkinAssessmentFindings(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.SkinAssessmentFindings valueObject) 
	{
		return 	extractSkinAssessmentFindings(domainFactory, valueObject, new HashMap());
	}

	public static ims.nursing.assessmenttools.domain.objects.SkinAssessmentFindings extractSkinAssessmentFindings(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.SkinAssessmentFindings valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_SkinAssessmentFindings();
		ims.nursing.assessmenttools.domain.objects.SkinAssessmentFindings domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.nursing.assessmenttools.domain.objects.SkinAssessmentFindings)domMap.get(valueObject);
			}
			// ims.nursing.vo.SkinAssessmentFindings ID_SkinAssessmentFindings field is unknown
			domainObject = new ims.nursing.assessmenttools.domain.objects.SkinAssessmentFindings();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_SkinAssessmentFindings());
			if (domMap.get(key) != null)
			{
				return (ims.nursing.assessmenttools.domain.objects.SkinAssessmentFindings)domMap.get(key);
			}
			domainObject = (ims.nursing.assessmenttools.domain.objects.SkinAssessmentFindings) domainFactory.getDomainObject(ims.nursing.assessmenttools.domain.objects.SkinAssessmentFindings.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_SkinAssessmentFindings());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getWoundType() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getWoundType().getID());
		}
		domainObject.setWoundType(value1);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSiteImage() != null && valueObject.getSiteImage().equals(""))
		{
			valueObject.setSiteImage(null);
		}
		domainObject.setSiteImage(valueObject.getSiteImage());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSiteName() != null && valueObject.getSiteName().equals(""))
		{
			valueObject.setSiteName(null);
		}
		domainObject.setSiteName(valueObject.getSiteName());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSiteDetails() != null && valueObject.getSiteDetails().equals(""))
		{
			valueObject.setSiteDetails(null);
		}
		domainObject.setSiteDetails(valueObject.getSiteDetails());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getHowLongIsItPresent() != null && valueObject.getHowLongIsItPresent().equals(""))
		{
			valueObject.setHowLongIsItPresent(null);
		}
		domainObject.setHowLongIsItPresent(valueObject.getHowLongIsItPresent());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getPressureSoreGrade() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getPressureSoreGrade().getID());
		}
		domainObject.setPressureSoreGrade(value6);
		domainObject.setLength(valueObject.getLength());
		domainObject.setWidth(valueObject.getWidth());
		domainObject.setDepth(valueObject.getDepth());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getWoundBed() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getWoundBed().getID());
		}
		domainObject.setWoundBed(value10);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getSurroundingSkin() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getSurroundingSkin().getID());
		}
		domainObject.setSurroundingSkin(value11);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getExudateAmount() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getExudateAmount().getID());
		}
		domainObject.setExudateAmount(value12);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value13 = null;
		if ( null != valueObject.getExudateType() ) 
		{
			value13 =
				domainFactory.getLookupInstance(valueObject.getExudateType().getID());
		}
		domainObject.setExudateType(value13);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value14 = null;
		if ( null != valueObject.getOdour() ) 
		{
			value14 =
				domainFactory.getLookupInstance(valueObject.getOdour().getID());
		}
		domainObject.setOdour(value14);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value15 = null;
		if ( null != valueObject.getPain() ) 
		{
			value15 =
				domainFactory.getLookupInstance(valueObject.getPain().getID());
		}
		domainObject.setPain(value15);
		domainObject.setInfectionSuspected(valueObject.getInfectionSuspected());
		domainObject.setSwabTaken(valueObject.getSwabTaken());
		domainObject.setWoundTraced(valueObject.getWoundTraced());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value19 = null;
		if ( null != valueObject.getCleansedWith() ) 
		{
			value19 =
				domainFactory.getLookupInstance(valueObject.getCleansedWith().getID());
		}
		domainObject.setCleansedWith(value19);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value20 = null;
		if ( null != valueObject.getPrimaryDressing() ) 
		{
			value20 =
				domainFactory.getLookupInstance(valueObject.getPrimaryDressing().getID());
		}
		domainObject.setPrimaryDressing(value20);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value21 = null;
		if ( null != valueObject.getSecondaryDressing() ) 
		{
			value21 =
				domainFactory.getLookupInstance(valueObject.getSecondaryDressing().getID());
		}
		domainObject.setSecondaryDressing(value21);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value22 = null;
		if ( null != valueObject.getFrequencyOfChange() ) 
		{
			value22 =
				domainFactory.getLookupInstance(valueObject.getFrequencyOfChange().getID());
		}
		domainObject.setFrequencyOfChange(value22);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getComment() != null && valueObject.getComment().equals(""))
		{
			valueObject.setComment(null);
		}
		domainObject.setComment(valueObject.getComment());
		domainObject.setIsDiscontinuedAssess(valueObject.getIsDiscontinuedAssess());
		domainObject.setIsContinuedAssessment(valueObject.getIsContinuedAssessment());
		domainObject.setSkinAssessmentReview(ims.nursing.vo.domain.SkinAssessmentReviewAssembler.extractSkinAssessmentReviewSet(domainFactory, valueObject.getSkinAssessmentReview(), domainObject.getSkinAssessmentReview(), domMap));		

		return domainObject;
	}

}
