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
package ims.coe.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Sinead McDermott
 */
public class AssessmentEatingAndDrinkingAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.coe.vo.AssessmentEatingAndDrinking copy(ims.coe.vo.AssessmentEatingAndDrinking valueObjectDest, ims.coe.vo.AssessmentEatingAndDrinking valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_AssessmentComponent(valueObjectSrc.getID_AssessmentComponent());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// NutritionalMethod
		valueObjectDest.setNutritionalMethod(valueObjectSrc.getNutritionalMethod());
		// OralAssessment
		valueObjectDest.setOralAssessment(valueObjectSrc.getOralAssessment());
		// DifficultiesWithSwallowing
		valueObjectDest.setDifficultiesWithSwallowing(valueObjectSrc.getDifficultiesWithSwallowing());
		// Swallowing
		valueObjectDest.setSwallowing(valueObjectSrc.getSwallowing());
		// ManualDexterity
		valueObjectDest.setManualDexterity(valueObjectSrc.getManualDexterity());
		// DescribeAppetite
		valueObjectDest.setDescribeAppetite(valueObjectSrc.getDescribeAppetite());
		// AnySpecialDiet
		valueObjectDest.setAnySpecialDiet(valueObjectSrc.getAnySpecialDiet());
		// SpecialDiet
		valueObjectDest.setSpecialDiet(valueObjectSrc.getSpecialDiet());
		// FoodPatientLikes
		valueObjectDest.setFoodPatientLikes(valueObjectSrc.getFoodPatientLikes());
		// FoodPatientDislikes
		valueObjectDest.setFoodPatientDislikes(valueObjectSrc.getFoodPatientDislikes());
		// FoodPatientFavourite
		valueObjectDest.setFoodPatientFavourite(valueObjectSrc.getFoodPatientFavourite());
		// RequireAssistance
		valueObjectDest.setRequireAssistance(valueObjectSrc.getRequireAssistance());
		// MiniNutritionalAssessment
		valueObjectDest.setMiniNutritionalAssessment(valueObjectSrc.getMiniNutritionalAssessment());
		// MNAScore
		valueObjectDest.setMNAScore(valueObjectSrc.getMNAScore());
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
 	 * If more than one call to an Assembler is made then #createAssessmentEatingAndDrinkingCollectionFromEatingComponent(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.nursing.assessment.domain.objects.EatingComponent objects.
	 */
	public static ims.coe.vo.AssessmentEatingAndDrinkingCollection createAssessmentEatingAndDrinkingCollectionFromEatingComponent(java.util.Set domainObjectSet)	
	{
		return createAssessmentEatingAndDrinkingCollectionFromEatingComponent(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.nursing.assessment.domain.objects.EatingComponent objects.
	 */
	public static ims.coe.vo.AssessmentEatingAndDrinkingCollection createAssessmentEatingAndDrinkingCollectionFromEatingComponent(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.coe.vo.AssessmentEatingAndDrinkingCollection voList = new ims.coe.vo.AssessmentEatingAndDrinkingCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.nursing.assessment.domain.objects.EatingComponent domainObject = (ims.nursing.assessment.domain.objects.EatingComponent) iterator.next();
			ims.coe.vo.AssessmentEatingAndDrinking vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.nursing.assessment.domain.objects.EatingComponent objects.
	 */
	public static ims.coe.vo.AssessmentEatingAndDrinkingCollection createAssessmentEatingAndDrinkingCollectionFromEatingComponent(java.util.List domainObjectList) 
	{
		return createAssessmentEatingAndDrinkingCollectionFromEatingComponent(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.nursing.assessment.domain.objects.EatingComponent objects.
	 */
	public static ims.coe.vo.AssessmentEatingAndDrinkingCollection createAssessmentEatingAndDrinkingCollectionFromEatingComponent(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.coe.vo.AssessmentEatingAndDrinkingCollection voList = new ims.coe.vo.AssessmentEatingAndDrinkingCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.nursing.assessment.domain.objects.EatingComponent domainObject = (ims.nursing.assessment.domain.objects.EatingComponent) domainObjectList.get(i);
			ims.coe.vo.AssessmentEatingAndDrinking vo = create(map, domainObject);

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
	 * Create the ims.nursing.assessment.domain.objects.EatingComponent set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractEatingComponentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.AssessmentEatingAndDrinkingCollection voCollection) 
	 {
	 	return extractEatingComponentSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractEatingComponentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.AssessmentEatingAndDrinkingCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.coe.vo.AssessmentEatingAndDrinking vo = voCollection.get(i);
			ims.nursing.assessment.domain.objects.EatingComponent domainObject = AssessmentEatingAndDrinkingAssembler.extractEatingComponent(domainFactory, vo, domMap);

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
	 * Create the ims.nursing.assessment.domain.objects.EatingComponent list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractEatingComponentList(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.AssessmentEatingAndDrinkingCollection voCollection) 
	 {
	 	return extractEatingComponentList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractEatingComponentList(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.AssessmentEatingAndDrinkingCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.coe.vo.AssessmentEatingAndDrinking vo = voCollection.get(i);
			ims.nursing.assessment.domain.objects.EatingComponent domainObject = AssessmentEatingAndDrinkingAssembler.extractEatingComponent(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.nursing.assessment.domain.objects.EatingComponent object.
	 * @param domainObject ims.nursing.assessment.domain.objects.EatingComponent
	 */
	 public static ims.coe.vo.AssessmentEatingAndDrinking create(ims.nursing.assessment.domain.objects.EatingComponent domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.nursing.assessment.domain.objects.EatingComponent object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.coe.vo.AssessmentEatingAndDrinking create(DomainObjectMap map, ims.nursing.assessment.domain.objects.EatingComponent domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.coe.vo.AssessmentEatingAndDrinking valueObject = (ims.coe.vo.AssessmentEatingAndDrinking) map.getValueObject(domainObject, ims.coe.vo.AssessmentEatingAndDrinking.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.coe.vo.AssessmentEatingAndDrinking(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.nursing.assessment.domain.objects.EatingComponent
	 */
	 public static ims.coe.vo.AssessmentEatingAndDrinking insert(ims.coe.vo.AssessmentEatingAndDrinking valueObject, ims.nursing.assessment.domain.objects.EatingComponent domainObject) 
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
	 * @param domainObject ims.nursing.assessment.domain.objects.EatingComponent
	 */
	 public static ims.coe.vo.AssessmentEatingAndDrinking insert(DomainObjectMap map, ims.coe.vo.AssessmentEatingAndDrinking valueObject, ims.nursing.assessment.domain.objects.EatingComponent domainObject) 
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
			
		// NutritionalMethod
		java.util.List listNutritionalMethod = domainObject.getNutritionalMethod();
		ims.nursing.vo.lookups.NutritionalMethodCollection NutritionalMethod = new ims.nursing.vo.lookups.NutritionalMethodCollection();
		for(java.util.Iterator iterator = listNutritionalMethod.iterator(); iterator.hasNext(); ) 
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
			ims.nursing.vo.lookups.NutritionalMethod voInstance = new ims.nursing.vo.lookups.NutritionalMethod(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.nursing.vo.lookups.NutritionalMethod parentVoInstance = voInstance;
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
								parentVoInstance.setParent(new ims.nursing.vo.lookups.NutritionalMethod(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			NutritionalMethod.add(voInstance);
		}
		valueObject.setNutritionalMethod( NutritionalMethod );
		// OralAssessment
		valueObject.setOralAssessment(ims.nursing.vo.domain.OralAssessmentAssembler.createOralAssessmentCollectionFromEatingOralAssessment(map, domainObject.getOralAssessment()) );
		// DifficultiesWithSwallowing
		ims.domain.lookups.LookupInstance instance3 = domainObject.getDifficultiesWithSwallowing();
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

			ims.core.vo.lookups.YesNoUnknown voLookup3 = new ims.core.vo.lookups.YesNoUnknown(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.core.vo.lookups.YesNoUnknown(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setDifficultiesWithSwallowing(voLookup3);
		}
				// Swallowing
		valueObject.setSwallowing(ims.coe.vo.domain.SwallowingAssessmentAssembler.createSwallowingAssessmentCollectionFromEatingSwallowingDetails(map, domainObject.getSwallowing()) );
		// ManualDexterity
		valueObject.setManualDexterity(ims.coe.vo.domain.ManualDexterityAssembler.createManualDexterityCollectionFromEatingManualDexterity(map, domainObject.getManualDexterity()) );
		// DescribeAppetite
		ims.domain.lookups.LookupInstance instance6 = domainObject.getDescribeAppetite();
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

			ims.coe.vo.lookups.DescribeAppetite voLookup6 = new ims.coe.vo.lookups.DescribeAppetite(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.coe.vo.lookups.DescribeAppetite parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.coe.vo.lookups.DescribeAppetite(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setDescribeAppetite(voLookup6);
		}
				// AnySpecialDiet
		ims.domain.lookups.LookupInstance instance7 = domainObject.getAnySpecialDiet();
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

			ims.core.vo.lookups.YesNoUnknown voLookup7 = new ims.core.vo.lookups.YesNoUnknown(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.core.vo.lookups.YesNoUnknown(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setAnySpecialDiet(voLookup7);
		}
				// SpecialDiet
		ims.domain.lookups.LookupInstance instance8 = domainObject.getSpecialDiet();
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

			ims.nursing.vo.lookups.SpecialDiet voLookup8 = new ims.nursing.vo.lookups.SpecialDiet(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.nursing.vo.lookups.SpecialDiet parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.nursing.vo.lookups.SpecialDiet(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setSpecialDiet(voLookup8);
		}
				// FoodPatientLikes
		valueObject.setFoodPatientLikes(domainObject.getFoodPatientLikes());
		// FoodPatientDislikes
		valueObject.setFoodPatientDislikes(domainObject.getFoodPatientDislikes());
		// FoodPatientFavourite
		valueObject.setFoodPatientFavourite(domainObject.getFoodPatientFavourite());
		// RequireAssistance
		ims.domain.lookups.LookupInstance instance12 = domainObject.getRequireAssistance();
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

			ims.core.vo.lookups.YesNoUnknown voLookup12 = new ims.core.vo.lookups.YesNoUnknown(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup12 = voLookup12;
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
								parentVoLookup12.setParent(new ims.core.vo.lookups.YesNoUnknown(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setRequireAssistance(voLookup12);
		}
				// MiniNutritionalAssessment
		valueObject.setMiniNutritionalAssessment(ims.nursing.vo.domain.MiniNutritionalAssessmentAssembler.create(map, domainObject.getMiniNutritionalAssessment()) );
		// MNAScore
		valueObject.setMNAScore(domainObject.getMNAScore());
		// isComplete
		valueObject.setIsComplete( domainObject.isIsComplete() );
		// AssessmentInfo
		valueObject.setAssessmentInfo(ims.nursing.vo.domain.AssessmentInfoAssembler.createAssessmentInfoCollectionFromAssessmentInfo(map, domainObject.getAssessmentInfo()) );
		// Copy
		valueObject.setCopy( domainObject.isCopy() );
		// ComponentType
		ims.domain.lookups.LookupInstance instance18 = domainObject.getComponentType();
		if ( null != instance18 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance18.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance18.getImage().getImageId(), instance18.getImage().getImagePath());
			}
			color = instance18.getColor();
			if (color != null) 
				color.getValue();

			ims.nursing.vo.lookups.AssessmentComponentType voLookup18 = new ims.nursing.vo.lookups.AssessmentComponentType(instance18.getId(),instance18.getText(), instance18.isActive(), null, img, color);
			ims.nursing.vo.lookups.AssessmentComponentType parentVoLookup18 = voLookup18;
			ims.domain.lookups.LookupInstance parent18 = instance18.getParent();
			while (parent18 != null)
			{
				if (parent18.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent18.getImage().getImageId(), parent18.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent18.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup18.setParent(new ims.nursing.vo.lookups.AssessmentComponentType(parent18.getId(),parent18.getText(), parent18.isActive(), null, img, color));
				parentVoLookup18 = parentVoLookup18.getParent();
								parent18 = parent18.getParent();
			}			
			valueObject.setComponentType(voLookup18);
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
	public static ims.nursing.assessment.domain.objects.EatingComponent extractEatingComponent(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.AssessmentEatingAndDrinking valueObject) 
	{
		return 	extractEatingComponent(domainFactory, valueObject, new HashMap());
	}

	public static ims.nursing.assessment.domain.objects.EatingComponent extractEatingComponent(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.AssessmentEatingAndDrinking valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_AssessmentComponent();
		ims.nursing.assessment.domain.objects.EatingComponent domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.nursing.assessment.domain.objects.EatingComponent)domMap.get(valueObject);
			}
			// ims.coe.vo.AssessmentEatingAndDrinking ID_EatingComponent field is unknown
			domainObject = new ims.nursing.assessment.domain.objects.EatingComponent();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_AssessmentComponent());
			if (domMap.get(key) != null)
			{
				return (ims.nursing.assessment.domain.objects.EatingComponent)domMap.get(key);
			}
			domainObject = (ims.nursing.assessment.domain.objects.EatingComponent) domainFactory.getDomainObject(ims.nursing.assessment.domain.objects.EatingComponent.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_AssessmentComponent());

		ims.nursing.vo.lookups.NutritionalMethodCollection collection1 =
	valueObject.getNutritionalMethod();
	    java.util.List domainNutritionalMethod = domainObject.getNutritionalMethod();;			
	    int collection1Size=0;
		if (collection1 == null)
		{
			domainNutritionalMethod = new java.util.ArrayList(0);
		}
		else
		{
			collection1Size = collection1.size();
		}
		
		for(int i=0; i<collection1Size; i++) 
		{
			int instanceId = collection1.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainNutritionalMethod.indexOf(dom);
			if (domIdx == -1)
			{
				domainNutritionalMethod.add(i, dom);
			}
			else if (i != domIdx && i < domainNutritionalMethod.size())
			{
				Object tmp = domainNutritionalMethod.get(i);
				domainNutritionalMethod.set(i, domainNutritionalMethod.get(domIdx));
				domainNutritionalMethod.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j1 = domainNutritionalMethod.size();
		while (j1 > collection1Size)
		{
			domainNutritionalMethod.remove(j1-1);
			j1 = domainNutritionalMethod.size();
		}

		domainObject.setNutritionalMethod(domainNutritionalMethod);		
		domainObject.setOralAssessment(ims.nursing.vo.domain.OralAssessmentAssembler.extractEatingOralAssessmentSet(domainFactory, valueObject.getOralAssessment(), domainObject.getOralAssessment(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getDifficultiesWithSwallowing() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getDifficultiesWithSwallowing().getID());
		}
		domainObject.setDifficultiesWithSwallowing(value3);
		domainObject.setSwallowing(ims.coe.vo.domain.SwallowingAssessmentAssembler.extractEatingSwallowingDetailsSet(domainFactory, valueObject.getSwallowing(), domainObject.getSwallowing(), domMap));		
		domainObject.setManualDexterity(ims.coe.vo.domain.ManualDexterityAssembler.extractEatingManualDexteritySet(domainFactory, valueObject.getManualDexterity(), domainObject.getManualDexterity(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getDescribeAppetite() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getDescribeAppetite().getID());
		}
		domainObject.setDescribeAppetite(value6);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getAnySpecialDiet() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getAnySpecialDiet().getID());
		}
		domainObject.setAnySpecialDiet(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getSpecialDiet() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getSpecialDiet().getID());
		}
		domainObject.setSpecialDiet(value8);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getFoodPatientLikes() != null && valueObject.getFoodPatientLikes().equals(""))
		{
			valueObject.setFoodPatientLikes(null);
		}
		domainObject.setFoodPatientLikes(valueObject.getFoodPatientLikes());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getFoodPatientDislikes() != null && valueObject.getFoodPatientDislikes().equals(""))
		{
			valueObject.setFoodPatientDislikes(null);
		}
		domainObject.setFoodPatientDislikes(valueObject.getFoodPatientDislikes());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getFoodPatientFavourite() != null && valueObject.getFoodPatientFavourite().equals(""))
		{
			valueObject.setFoodPatientFavourite(null);
		}
		domainObject.setFoodPatientFavourite(valueObject.getFoodPatientFavourite());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getRequireAssistance() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getRequireAssistance().getID());
		}
		domainObject.setRequireAssistance(value12);
		domainObject.setMiniNutritionalAssessment(ims.nursing.vo.domain.MiniNutritionalAssessmentAssembler.extractMiniNutritionalAssessment(domainFactory, valueObject.getMiniNutritionalAssessment(), domMap));
		domainObject.setMNAScore(valueObject.getMNAScore());
		domainObject.setIsComplete(valueObject.getIsComplete());
		domainObject.setAssessmentInfo(ims.nursing.vo.domain.AssessmentInfoAssembler.extractAssessmentInfoList(domainFactory, valueObject.getAssessmentInfo(), domainObject.getAssessmentInfo(), domMap));		
		domainObject.setCopy(valueObject.getCopy());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value18 = null;
		if ( null != valueObject.getComponentType() ) 
		{
			value18 =
				domainFactory.getLookupInstance(valueObject.getComponentType().getID());
		}
		domainObject.setComponentType(value18);
		domainObject.setCarePlanTemplate(ims.nursing.vo.domain.CarePlanTemplateAssembler.extractCarePlanTemplateSet(domainFactory, valueObject.getCarePlanTemplate(), domainObject.getCarePlanTemplate(), domMap));		
		domainObject.setCarePlans(ims.nursing.vo.domain.CarePlanAssembler.extractCarePlanSet(domainFactory, valueObject.getCarePlans(), domainObject.getCarePlans(), domMap));		

		return domainObject;
	}

}
