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
package ims.coe.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Sinead McDermott
 */
public class AssessmentPersonalHygieneAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.coe.vo.AssessmentPersonalHygiene copy(ims.coe.vo.AssessmentPersonalHygiene valueObjectDest, ims.coe.vo.AssessmentPersonalHygiene valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_AssessmentComponent(valueObjectSrc.getID_AssessmentComponent());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// PreferredBathingPattern
		valueObjectDest.setPreferredBathingPattern(valueObjectSrc.getPreferredBathingPattern());
		// AssisstanceWithPersonalHygiene
		valueObjectDest.setAssisstanceWithPersonalHygiene(valueObjectSrc.getAssisstanceWithPersonalHygiene());
		// HygieneActivities
		valueObjectDest.setHygieneActivities(valueObjectSrc.getHygieneActivities());
		// PersonalHygieneFeet
		valueObjectDest.setPersonalHygieneFeet(valueObjectSrc.getPersonalHygieneFeet());
		// ConditionOfHair
		valueObjectDest.setConditionOfHair(valueObjectSrc.getConditionOfHair());
		// EvidenceOfHairInfestation
		valueObjectDest.setEvidenceOfHairInfestation(valueObjectSrc.getEvidenceOfHairInfestation());
		// ConditionOfNails
		valueObjectDest.setConditionOfNails(valueObjectSrc.getConditionOfNails());
		// ConditionOfSkin
		valueObjectDest.setConditionOfSkin(valueObjectSrc.getConditionOfSkin());
		// isComplete
		valueObjectDest.setIsComplete(valueObjectSrc.getIsComplete());
		// AssessmentInfo
		valueObjectDest.setAssessmentInfo(valueObjectSrc.getAssessmentInfo());
		// Copy
		valueObjectDest.setCopy(valueObjectSrc.getCopy());
		// ComponentType
		valueObjectDest.setComponentType(valueObjectSrc.getComponentType());
		// CarePlanTemplate
		valueObjectDest.setCarePlanTemplate(valueObjectSrc.getCarePlanTemplate());
		// CarePlans
		valueObjectDest.setCarePlans(valueObjectSrc.getCarePlans());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createAssessmentPersonalHygieneCollectionFromPersonalHygieneComponent(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.coe.assessment.domain.objects.PersonalHygieneComponent objects.
	 */
	public static ims.coe.vo.AssessmentPersonalHygieneCollection createAssessmentPersonalHygieneCollectionFromPersonalHygieneComponent(java.util.Set domainObjectSet)	
	{
		return createAssessmentPersonalHygieneCollectionFromPersonalHygieneComponent(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.coe.assessment.domain.objects.PersonalHygieneComponent objects.
	 */
	public static ims.coe.vo.AssessmentPersonalHygieneCollection createAssessmentPersonalHygieneCollectionFromPersonalHygieneComponent(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.coe.vo.AssessmentPersonalHygieneCollection voList = new ims.coe.vo.AssessmentPersonalHygieneCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.coe.assessment.domain.objects.PersonalHygieneComponent domainObject = (ims.coe.assessment.domain.objects.PersonalHygieneComponent) iterator.next();
			ims.coe.vo.AssessmentPersonalHygiene vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.coe.assessment.domain.objects.PersonalHygieneComponent objects.
	 */
	public static ims.coe.vo.AssessmentPersonalHygieneCollection createAssessmentPersonalHygieneCollectionFromPersonalHygieneComponent(java.util.List domainObjectList) 
	{
		return createAssessmentPersonalHygieneCollectionFromPersonalHygieneComponent(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.coe.assessment.domain.objects.PersonalHygieneComponent objects.
	 */
	public static ims.coe.vo.AssessmentPersonalHygieneCollection createAssessmentPersonalHygieneCollectionFromPersonalHygieneComponent(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.coe.vo.AssessmentPersonalHygieneCollection voList = new ims.coe.vo.AssessmentPersonalHygieneCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.coe.assessment.domain.objects.PersonalHygieneComponent domainObject = (ims.coe.assessment.domain.objects.PersonalHygieneComponent) domainObjectList.get(i);
			ims.coe.vo.AssessmentPersonalHygiene vo = create(map, domainObject);

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
	 * Create the ims.coe.assessment.domain.objects.PersonalHygieneComponent set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPersonalHygieneComponentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.AssessmentPersonalHygieneCollection voCollection) 
	 {
	 	return extractPersonalHygieneComponentSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPersonalHygieneComponentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.AssessmentPersonalHygieneCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.coe.vo.AssessmentPersonalHygiene vo = voCollection.get(i);
			ims.coe.assessment.domain.objects.PersonalHygieneComponent domainObject = AssessmentPersonalHygieneAssembler.extractPersonalHygieneComponent(domainFactory, vo, domMap);

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
	 * Create the ims.coe.assessment.domain.objects.PersonalHygieneComponent list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPersonalHygieneComponentList(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.AssessmentPersonalHygieneCollection voCollection) 
	 {
	 	return extractPersonalHygieneComponentList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPersonalHygieneComponentList(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.AssessmentPersonalHygieneCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.coe.vo.AssessmentPersonalHygiene vo = voCollection.get(i);
			ims.coe.assessment.domain.objects.PersonalHygieneComponent domainObject = AssessmentPersonalHygieneAssembler.extractPersonalHygieneComponent(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.coe.assessment.domain.objects.PersonalHygieneComponent object.
	 * @param domainObject ims.coe.assessment.domain.objects.PersonalHygieneComponent
	 */
	 public static ims.coe.vo.AssessmentPersonalHygiene create(ims.coe.assessment.domain.objects.PersonalHygieneComponent domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.coe.assessment.domain.objects.PersonalHygieneComponent object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.coe.vo.AssessmentPersonalHygiene create(DomainObjectMap map, ims.coe.assessment.domain.objects.PersonalHygieneComponent domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.coe.vo.AssessmentPersonalHygiene valueObject = (ims.coe.vo.AssessmentPersonalHygiene) map.getValueObject(domainObject, ims.coe.vo.AssessmentPersonalHygiene.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.coe.vo.AssessmentPersonalHygiene(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.coe.assessment.domain.objects.PersonalHygieneComponent
	 */
	 public static ims.coe.vo.AssessmentPersonalHygiene insert(ims.coe.vo.AssessmentPersonalHygiene valueObject, ims.coe.assessment.domain.objects.PersonalHygieneComponent domainObject) 
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
	 * @param domainObject ims.coe.assessment.domain.objects.PersonalHygieneComponent
	 */
	 public static ims.coe.vo.AssessmentPersonalHygiene insert(DomainObjectMap map, ims.coe.vo.AssessmentPersonalHygiene valueObject, ims.coe.assessment.domain.objects.PersonalHygieneComponent domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_AssessmentComponent(domainObject.getId());
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
			
		// PreferredBathingPattern
		valueObject.setPreferredBathingPattern(domainObject.getPreferredBathingPattern());
		// AssisstanceWithPersonalHygiene
		ims.domain.lookups.LookupInstance instance2 = domainObject.getAssisstanceWithPersonalHygiene();
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

			ims.core.vo.lookups.YesNoUnknown voLookup2 = new ims.core.vo.lookups.YesNoUnknown(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.core.vo.lookups.YesNoUnknown(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setAssisstanceWithPersonalHygiene(voLookup2);
		}
				// HygieneActivities
		valueObject.setHygieneActivities(ims.nursing.vo.domain.HygieneActivitiesAssembler.createHygieneActivitiesCollectionFromPersonalHygieneActivities(map, domainObject.getHygieneActivities()) );
		// PersonalHygieneFeet
		valueObject.setPersonalHygieneFeet(ims.coe.vo.domain.PersonalHygieneFeetVoAssembler.create(map, domainObject.getPersonalHygieneFeet()) );
		// ConditionOfHair
		ims.domain.lookups.LookupInstance instance5 = domainObject.getConditionOfHair();
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

			ims.coe.vo.lookups.ConditionOfHair voLookup5 = new ims.coe.vo.lookups.ConditionOfHair(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.coe.vo.lookups.ConditionOfHair parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.coe.vo.lookups.ConditionOfHair(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setConditionOfHair(voLookup5);
		}
				// EvidenceOfHairInfestation
		ims.domain.lookups.LookupInstance instance6 = domainObject.getEvidenceOfHairInfestation();
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

			ims.core.vo.lookups.YesNoUnknown voLookup6 = new ims.core.vo.lookups.YesNoUnknown(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.core.vo.lookups.YesNoUnknown(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setEvidenceOfHairInfestation(voLookup6);
		}
				// ConditionOfNails
		ims.domain.lookups.LookupInstance instance7 = domainObject.getConditionOfNails();
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

			ims.coe.vo.lookups.ConditionOfNails voLookup7 = new ims.coe.vo.lookups.ConditionOfNails(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.coe.vo.lookups.ConditionOfNails parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.coe.vo.lookups.ConditionOfNails(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setConditionOfNails(voLookup7);
		}
				// ConditionOfSkin
		valueObject.setConditionOfSkin(domainObject.getConditionOfSkin());
		// isComplete
		valueObject.setIsComplete( domainObject.isIsComplete() );
		// AssessmentInfo
		valueObject.setAssessmentInfo(ims.nursing.vo.domain.AssessmentInfoAssembler.createAssessmentInfoCollectionFromAssessmentInfo(map, domainObject.getAssessmentInfo()) );
		// Copy
		valueObject.setCopy( domainObject.isCopy() );
		// ComponentType
		ims.domain.lookups.LookupInstance instance12 = domainObject.getComponentType();
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

			ims.nursing.vo.lookups.AssessmentComponentType voLookup12 = new ims.nursing.vo.lookups.AssessmentComponentType(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.nursing.vo.lookups.AssessmentComponentType parentVoLookup12 = voLookup12;
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
								parentVoLookup12.setParent(new ims.nursing.vo.lookups.AssessmentComponentType(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setComponentType(voLookup12);
		}
				// CarePlanTemplate
		valueObject.setCarePlanTemplate(ims.nursing.vo.domain.CarePlanTemplateAssembler.createCarePlanTemplateCollectionFromCarePlanTemplate(map, domainObject.getCarePlanTemplate()) );
		// CarePlans
		valueObject.setCarePlans(ims.nursing.vo.domain.CarePlanAssembler.createCarePlanCollectionFromCarePlan(map, domainObject.getCarePlans()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.coe.assessment.domain.objects.PersonalHygieneComponent extractPersonalHygieneComponent(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.AssessmentPersonalHygiene valueObject) 
	{
		return 	extractPersonalHygieneComponent(domainFactory, valueObject, new HashMap());
	}

	public static ims.coe.assessment.domain.objects.PersonalHygieneComponent extractPersonalHygieneComponent(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.AssessmentPersonalHygiene valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_AssessmentComponent();
		ims.coe.assessment.domain.objects.PersonalHygieneComponent domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.coe.assessment.domain.objects.PersonalHygieneComponent)domMap.get(valueObject);
			}
			// ims.coe.vo.AssessmentPersonalHygiene ID_PersonalHygieneComponent field is unknown
			domainObject = new ims.coe.assessment.domain.objects.PersonalHygieneComponent();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_AssessmentComponent());
			if (domMap.get(key) != null)
			{
				return (ims.coe.assessment.domain.objects.PersonalHygieneComponent)domMap.get(key);
			}
			domainObject = (ims.coe.assessment.domain.objects.PersonalHygieneComponent) domainFactory.getDomainObject(ims.coe.assessment.domain.objects.PersonalHygieneComponent.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_AssessmentComponent());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPreferredBathingPattern() != null && valueObject.getPreferredBathingPattern().equals(""))
		{
			valueObject.setPreferredBathingPattern(null);
		}
		domainObject.setPreferredBathingPattern(valueObject.getPreferredBathingPattern());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getAssisstanceWithPersonalHygiene() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getAssisstanceWithPersonalHygiene().getID());
		}
		domainObject.setAssisstanceWithPersonalHygiene(value2);
		domainObject.setHygieneActivities(ims.nursing.vo.domain.HygieneActivitiesAssembler.extractPersonalHygieneActivitiesList(domainFactory, valueObject.getHygieneActivities(), domainObject.getHygieneActivities(), domMap));		
		domainObject.setPersonalHygieneFeet(ims.coe.vo.domain.PersonalHygieneFeetVoAssembler.extractPersonalHygieneFeet(domainFactory, valueObject.getPersonalHygieneFeet(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getConditionOfHair() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getConditionOfHair().getID());
		}
		domainObject.setConditionOfHair(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getEvidenceOfHairInfestation() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getEvidenceOfHairInfestation().getID());
		}
		domainObject.setEvidenceOfHairInfestation(value6);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getConditionOfNails() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getConditionOfNails().getID());
		}
		domainObject.setConditionOfNails(value7);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getConditionOfSkin() != null && valueObject.getConditionOfSkin().equals(""))
		{
			valueObject.setConditionOfSkin(null);
		}
		domainObject.setConditionOfSkin(valueObject.getConditionOfSkin());
		domainObject.setIsComplete(valueObject.getIsComplete());
		domainObject.setAssessmentInfo(ims.nursing.vo.domain.AssessmentInfoAssembler.extractAssessmentInfoList(domainFactory, valueObject.getAssessmentInfo(), domainObject.getAssessmentInfo(), domMap));		
		domainObject.setCopy(valueObject.getCopy());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getComponentType() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getComponentType().getID());
		}
		domainObject.setComponentType(value12);
		domainObject.setCarePlanTemplate(ims.nursing.vo.domain.CarePlanTemplateAssembler.extractCarePlanTemplateSet(domainFactory, valueObject.getCarePlanTemplate(), domainObject.getCarePlanTemplate(), domMap));		
		domainObject.setCarePlans(ims.nursing.vo.domain.CarePlanAssembler.extractCarePlanSet(domainFactory, valueObject.getCarePlans(), domainObject.getCarePlans(), domMap));		

		return domainObject;
	}

}
