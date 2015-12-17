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
package ims.spinalinjuries.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Sinead McDermott
 */
public class NurAssessmentEatingVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.spinalinjuries.vo.NurAssessmentEatingVo copy(ims.spinalinjuries.vo.NurAssessmentEatingVo valueObjectDest, ims.spinalinjuries.vo.NurAssessmentEatingVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_AssessmentComponent(valueObjectSrc.getID_AssessmentComponent());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// PatientRequireAssistance
		valueObjectDest.setPatientRequireAssistance(valueObjectSrc.getPatientRequireAssistance());
		// NutritionalMethod
		valueObjectDest.setNutritionalMethod(valueObjectSrc.getNutritionalMethod());
		// OralAssessment
		valueObjectDest.setOralAssessment(valueObjectSrc.getOralAssessment());
		// DifficultiesInSwallowing
		valueObjectDest.setDifficultiesInSwallowing(valueObjectSrc.getDifficultiesInSwallowing());
		// ReferralSpeechAndLanguageTherapist
		valueObjectDest.setReferralSpeechAndLanguageTherapist(valueObjectSrc.getReferralSpeechAndLanguageTherapist());
		// ReferralDietitian
		valueObjectDest.setReferralDietitian(valueObjectSrc.getReferralDietitian());
		// SpecialDiet
		valueObjectDest.setSpecialDiet(valueObjectSrc.getSpecialDiet());
		// AlcoholUnits
		valueObjectDest.setAlcoholUnits(valueObjectSrc.getAlcoholUnits());
		// NutritionalRiskAssessment
		valueObjectDest.setNutritionalRiskAssessment(valueObjectSrc.getNutritionalRiskAssessment());
		// NutritionalRiskScore
		valueObjectDest.setNutritionalRiskScore(valueObjectSrc.getNutritionalRiskScore());
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
 	 * If more than one call to an Assembler is made then #createNurAssessmentEatingVoCollectionFromNurEatingComponent(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.nursing.assessment.domain.objects.NurEatingComponent objects.
	 */
	public static ims.spinalinjuries.vo.NurAssessmentEatingVoCollection createNurAssessmentEatingVoCollectionFromNurEatingComponent(java.util.Set domainObjectSet)	
	{
		return createNurAssessmentEatingVoCollectionFromNurEatingComponent(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.nursing.assessment.domain.objects.NurEatingComponent objects.
	 */
	public static ims.spinalinjuries.vo.NurAssessmentEatingVoCollection createNurAssessmentEatingVoCollectionFromNurEatingComponent(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.spinalinjuries.vo.NurAssessmentEatingVoCollection voList = new ims.spinalinjuries.vo.NurAssessmentEatingVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.nursing.assessment.domain.objects.NurEatingComponent domainObject = (ims.nursing.assessment.domain.objects.NurEatingComponent) iterator.next();
			ims.spinalinjuries.vo.NurAssessmentEatingVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.nursing.assessment.domain.objects.NurEatingComponent objects.
	 */
	public static ims.spinalinjuries.vo.NurAssessmentEatingVoCollection createNurAssessmentEatingVoCollectionFromNurEatingComponent(java.util.List domainObjectList) 
	{
		return createNurAssessmentEatingVoCollectionFromNurEatingComponent(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.nursing.assessment.domain.objects.NurEatingComponent objects.
	 */
	public static ims.spinalinjuries.vo.NurAssessmentEatingVoCollection createNurAssessmentEatingVoCollectionFromNurEatingComponent(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.spinalinjuries.vo.NurAssessmentEatingVoCollection voList = new ims.spinalinjuries.vo.NurAssessmentEatingVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.nursing.assessment.domain.objects.NurEatingComponent domainObject = (ims.nursing.assessment.domain.objects.NurEatingComponent) domainObjectList.get(i);
			ims.spinalinjuries.vo.NurAssessmentEatingVo vo = create(map, domainObject);

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
	 * Create the ims.nursing.assessment.domain.objects.NurEatingComponent set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractNurEatingComponentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.spinalinjuries.vo.NurAssessmentEatingVoCollection voCollection) 
	 {
	 	return extractNurEatingComponentSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractNurEatingComponentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.spinalinjuries.vo.NurAssessmentEatingVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.spinalinjuries.vo.NurAssessmentEatingVo vo = voCollection.get(i);
			ims.nursing.assessment.domain.objects.NurEatingComponent domainObject = NurAssessmentEatingVoAssembler.extractNurEatingComponent(domainFactory, vo, domMap);

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
	 * Create the ims.nursing.assessment.domain.objects.NurEatingComponent list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractNurEatingComponentList(ims.domain.ILightweightDomainFactory domainFactory, ims.spinalinjuries.vo.NurAssessmentEatingVoCollection voCollection) 
	 {
	 	return extractNurEatingComponentList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractNurEatingComponentList(ims.domain.ILightweightDomainFactory domainFactory, ims.spinalinjuries.vo.NurAssessmentEatingVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.spinalinjuries.vo.NurAssessmentEatingVo vo = voCollection.get(i);
			ims.nursing.assessment.domain.objects.NurEatingComponent domainObject = NurAssessmentEatingVoAssembler.extractNurEatingComponent(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.nursing.assessment.domain.objects.NurEatingComponent object.
	 * @param domainObject ims.nursing.assessment.domain.objects.NurEatingComponent
	 */
	 public static ims.spinalinjuries.vo.NurAssessmentEatingVo create(ims.nursing.assessment.domain.objects.NurEatingComponent domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.nursing.assessment.domain.objects.NurEatingComponent object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.spinalinjuries.vo.NurAssessmentEatingVo create(DomainObjectMap map, ims.nursing.assessment.domain.objects.NurEatingComponent domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.spinalinjuries.vo.NurAssessmentEatingVo valueObject = (ims.spinalinjuries.vo.NurAssessmentEatingVo) map.getValueObject(domainObject, ims.spinalinjuries.vo.NurAssessmentEatingVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.spinalinjuries.vo.NurAssessmentEatingVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.nursing.assessment.domain.objects.NurEatingComponent
	 */
	 public static ims.spinalinjuries.vo.NurAssessmentEatingVo insert(ims.spinalinjuries.vo.NurAssessmentEatingVo valueObject, ims.nursing.assessment.domain.objects.NurEatingComponent domainObject) 
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
	 * @param domainObject ims.nursing.assessment.domain.objects.NurEatingComponent
	 */
	 public static ims.spinalinjuries.vo.NurAssessmentEatingVo insert(DomainObjectMap map, ims.spinalinjuries.vo.NurAssessmentEatingVo valueObject, ims.nursing.assessment.domain.objects.NurEatingComponent domainObject) 
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
			
		// PatientRequireAssistance
		ims.domain.lookups.LookupInstance instance1 = domainObject.getPatientRequireAssistance();
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

			ims.core.vo.lookups.YesNoUnknown voLookup1 = new ims.core.vo.lookups.YesNoUnknown(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.core.vo.lookups.YesNoUnknown(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setPatientRequireAssistance(voLookup1);
		}
				// NutritionalMethod
		valueObject.setNutritionalMethod(ims.nursing.vo.domain.NutritionalMethodVoAssembler.createNutritionalMethodVoCollectionFromNutritionalMethod(map, domainObject.getNutritionalMethod()) );
		// OralAssessment
		valueObject.setOralAssessment(ims.nursing.vo.domain.OralAssessmentAssembler.createOralAssessmentCollectionFromEatingOralAssessment(map, domainObject.getOralAssessment()) );
		// DifficultiesInSwallowing
		ims.domain.lookups.LookupInstance instance4 = domainObject.getDifficultiesInSwallowing();
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

			ims.core.vo.lookups.YesNoUnknown voLookup4 = new ims.core.vo.lookups.YesNoUnknown(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.core.vo.lookups.YesNoUnknown(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setDifficultiesInSwallowing(voLookup4);
		}
				// ReferralSpeechAndLanguageTherapist
		java.util.Date ReferralSpeechAndLanguageTherapist = domainObject.getReferralSpeechAndLanguageTherapist();
		if ( null != ReferralSpeechAndLanguageTherapist ) 
		{
			valueObject.setReferralSpeechAndLanguageTherapist(new ims.framework.utils.Date(ReferralSpeechAndLanguageTherapist) );
		}
		// ReferralDietitian
		java.util.Date ReferralDietitian = domainObject.getReferralDietitian();
		if ( null != ReferralDietitian ) 
		{
			valueObject.setReferralDietitian(new ims.framework.utils.Date(ReferralDietitian) );
		}
		// SpecialDiet
		java.util.List listSpecialDiet = domainObject.getSpecialDiet();
		ims.nursing.vo.lookups.SpecialDietCollection SpecialDiet = new ims.nursing.vo.lookups.SpecialDietCollection();
		for(java.util.Iterator iterator = listSpecialDiet.iterator(); iterator.hasNext(); ) 
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
			ims.nursing.vo.lookups.SpecialDiet voInstance = new ims.nursing.vo.lookups.SpecialDiet(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.nursing.vo.lookups.SpecialDiet parentVoInstance = voInstance;
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
								parentVoInstance.setParent(new ims.nursing.vo.lookups.SpecialDiet(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			SpecialDiet.add(voInstance);
		}
		valueObject.setSpecialDiet( SpecialDiet );
		// AlcoholUnits
		valueObject.setAlcoholUnits(domainObject.getAlcoholUnits());
		// NutritionalRiskAssessment
		valueObject.setNutritionalRiskAssessment(ims.nursing.vo.domain.NutritionalRiskAssessmentVoAssembler.create(map, domainObject.getNutritionalRiskAssessment()) );
		// NutritionalRiskScore
		valueObject.setNutritionalRiskScore(domainObject.getNutritionalRiskScore());
		// isComplete
		valueObject.setIsComplete( domainObject.isIsComplete() );
		// AssessmentInfo
		valueObject.setAssessmentInfo(ims.nursing.vo.domain.AssessmentInfoAssembler.createAssessmentInfoCollectionFromAssessmentInfo(map, domainObject.getAssessmentInfo()) );
		// Copy
		valueObject.setCopy( domainObject.isCopy() );
		// ComponentType
		ims.domain.lookups.LookupInstance instance14 = domainObject.getComponentType();
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

			ims.nursing.vo.lookups.AssessmentComponentType voLookup14 = new ims.nursing.vo.lookups.AssessmentComponentType(instance14.getId(),instance14.getText(), instance14.isActive(), null, img, color);
			ims.nursing.vo.lookups.AssessmentComponentType parentVoLookup14 = voLookup14;
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
								parentVoLookup14.setParent(new ims.nursing.vo.lookups.AssessmentComponentType(parent14.getId(),parent14.getText(), parent14.isActive(), null, img, color));
				parentVoLookup14 = parentVoLookup14.getParent();
								parent14 = parent14.getParent();
			}			
			valueObject.setComponentType(voLookup14);
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
	public static ims.nursing.assessment.domain.objects.NurEatingComponent extractNurEatingComponent(ims.domain.ILightweightDomainFactory domainFactory, ims.spinalinjuries.vo.NurAssessmentEatingVo valueObject) 
	{
		return 	extractNurEatingComponent(domainFactory, valueObject, new HashMap());
	}

	public static ims.nursing.assessment.domain.objects.NurEatingComponent extractNurEatingComponent(ims.domain.ILightweightDomainFactory domainFactory, ims.spinalinjuries.vo.NurAssessmentEatingVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_AssessmentComponent();
		ims.nursing.assessment.domain.objects.NurEatingComponent domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.nursing.assessment.domain.objects.NurEatingComponent)domMap.get(valueObject);
			}
			// ims.spinalinjuries.vo.NurAssessmentEatingVo ID_NurEatingComponent field is unknown
			domainObject = new ims.nursing.assessment.domain.objects.NurEatingComponent();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_AssessmentComponent());
			if (domMap.get(key) != null)
			{
				return (ims.nursing.assessment.domain.objects.NurEatingComponent)domMap.get(key);
			}
			domainObject = (ims.nursing.assessment.domain.objects.NurEatingComponent) domainFactory.getDomainObject(ims.nursing.assessment.domain.objects.NurEatingComponent.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_AssessmentComponent());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getPatientRequireAssistance() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getPatientRequireAssistance().getID());
		}
		domainObject.setPatientRequireAssistance(value1);
		domainObject.setNutritionalMethod(ims.nursing.vo.domain.NutritionalMethodVoAssembler.extractNutritionalMethodSet(domainFactory, valueObject.getNutritionalMethod(), domainObject.getNutritionalMethod(), domMap));		
		domainObject.setOralAssessment(ims.nursing.vo.domain.OralAssessmentAssembler.extractEatingOralAssessmentSet(domainFactory, valueObject.getOralAssessment(), domainObject.getOralAssessment(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getDifficultiesInSwallowing() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getDifficultiesInSwallowing().getID());
		}
		domainObject.setDifficultiesInSwallowing(value4);
		java.util.Date value5 = null;
		ims.framework.utils.Date date5 = valueObject.getReferralSpeechAndLanguageTherapist();		
		if ( date5 != null ) 
		{
			value5 = date5.getDate();
		}
		domainObject.setReferralSpeechAndLanguageTherapist(value5);
		java.util.Date value6 = null;
		ims.framework.utils.Date date6 = valueObject.getReferralDietitian();		
		if ( date6 != null ) 
		{
			value6 = date6.getDate();
		}
		domainObject.setReferralDietitian(value6);
		ims.nursing.vo.lookups.SpecialDietCollection collection7 =
	valueObject.getSpecialDiet();
	    java.util.List domainSpecialDiet = domainObject.getSpecialDiet();;			
	    int collection7Size=0;
		if (collection7 == null)
		{
			domainSpecialDiet = new java.util.ArrayList(0);
		}
		else
		{
			collection7Size = collection7.size();
		}
		
		for(int i=0; i<collection7Size; i++) 
		{
			int instanceId = collection7.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainSpecialDiet.indexOf(dom);
			if (domIdx == -1)
			{
				domainSpecialDiet.add(i, dom);
			}
			else if (i != domIdx && i < domainSpecialDiet.size())
			{
				Object tmp = domainSpecialDiet.get(i);
				domainSpecialDiet.set(i, domainSpecialDiet.get(domIdx));
				domainSpecialDiet.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j7 = domainSpecialDiet.size();
		while (j7 > collection7Size)
		{
			domainSpecialDiet.remove(j7-1);
			j7 = domainSpecialDiet.size();
		}

		domainObject.setSpecialDiet(domainSpecialDiet);		
		domainObject.setAlcoholUnits(valueObject.getAlcoholUnits());
		domainObject.setNutritionalRiskAssessment(ims.nursing.vo.domain.NutritionalRiskAssessmentVoAssembler.extractNutritionalRiskAssessment(domainFactory, valueObject.getNutritionalRiskAssessment(), domMap));
		domainObject.setNutritionalRiskScore(valueObject.getNutritionalRiskScore());
		domainObject.setIsComplete(valueObject.getIsComplete());
		domainObject.setAssessmentInfo(ims.nursing.vo.domain.AssessmentInfoAssembler.extractAssessmentInfoList(domainFactory, valueObject.getAssessmentInfo(), domainObject.getAssessmentInfo(), domMap));		
		domainObject.setCopy(valueObject.getCopy());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value14 = null;
		if ( null != valueObject.getComponentType() ) 
		{
			value14 =
				domainFactory.getLookupInstance(valueObject.getComponentType().getID());
		}
		domainObject.setComponentType(value14);
		domainObject.setCarePlanTemplate(ims.nursing.vo.domain.CarePlanTemplateAssembler.extractCarePlanTemplateSet(domainFactory, valueObject.getCarePlanTemplate(), domainObject.getCarePlanTemplate(), domMap));		
		domainObject.setCarePlans(ims.nursing.vo.domain.CarePlanAssembler.extractCarePlanSet(domainFactory, valueObject.getCarePlans(), domainObject.getCarePlans(), domMap));		

		return domainObject;
	}

}
