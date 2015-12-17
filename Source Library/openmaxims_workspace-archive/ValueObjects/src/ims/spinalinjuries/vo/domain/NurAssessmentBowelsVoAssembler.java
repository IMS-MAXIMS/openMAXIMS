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
public class NurAssessmentBowelsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.spinalinjuries.vo.NurAssessmentBowelsVo copy(ims.spinalinjuries.vo.NurAssessmentBowelsVo valueObjectDest, ims.spinalinjuries.vo.NurAssessmentBowelsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_AssessmentComponent(valueObjectSrc.getID_AssessmentComponent());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// UsualBowelPattern
		valueObjectDest.setUsualBowelPattern(valueObjectSrc.getUsualBowelPattern());
		// TimeOfDay
		valueObjectDest.setTimeOfDay(valueObjectSrc.getTimeOfDay());
		// BowelRoutinePerformedIn
		valueObjectDest.setBowelRoutinePerformedIn(valueObjectSrc.getBowelRoutinePerformedIn());
		// BowelRoutinePerformedBy
		valueObjectDest.setBowelRoutinePerformedBy(valueObjectSrc.getBowelRoutinePerformedBy());
		// BowelsOpenSpontaneously
		valueObjectDest.setBowelsOpenSpontaneously(valueObjectSrc.getBowelsOpenSpontaneously());
		// Notes
		valueObjectDest.setNotes(valueObjectSrc.getNotes());
		// BowelMedication
		valueObjectDest.setBowelMedication(valueObjectSrc.getBowelMedication());
		// OstomyDetails
		valueObjectDest.setOstomyDetails(valueObjectSrc.getOstomyDetails());
		// SufferFrom
		valueObjectDest.setSufferFrom(valueObjectSrc.getSufferFrom());
		// BowelRegime
		valueObjectDest.setBowelRegime(valueObjectSrc.getBowelRegime());
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
 	 * If more than one call to an Assembler is made then #createNurAssessmentBowelsVoCollectionFromNurBowelComponent(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.nursing.assessment.domain.objects.NurBowelComponent objects.
	 */
	public static ims.spinalinjuries.vo.NurAssessmentBowelsVoCollection createNurAssessmentBowelsVoCollectionFromNurBowelComponent(java.util.Set domainObjectSet)	
	{
		return createNurAssessmentBowelsVoCollectionFromNurBowelComponent(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.nursing.assessment.domain.objects.NurBowelComponent objects.
	 */
	public static ims.spinalinjuries.vo.NurAssessmentBowelsVoCollection createNurAssessmentBowelsVoCollectionFromNurBowelComponent(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.spinalinjuries.vo.NurAssessmentBowelsVoCollection voList = new ims.spinalinjuries.vo.NurAssessmentBowelsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.nursing.assessment.domain.objects.NurBowelComponent domainObject = (ims.nursing.assessment.domain.objects.NurBowelComponent) iterator.next();
			ims.spinalinjuries.vo.NurAssessmentBowelsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.nursing.assessment.domain.objects.NurBowelComponent objects.
	 */
	public static ims.spinalinjuries.vo.NurAssessmentBowelsVoCollection createNurAssessmentBowelsVoCollectionFromNurBowelComponent(java.util.List domainObjectList) 
	{
		return createNurAssessmentBowelsVoCollectionFromNurBowelComponent(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.nursing.assessment.domain.objects.NurBowelComponent objects.
	 */
	public static ims.spinalinjuries.vo.NurAssessmentBowelsVoCollection createNurAssessmentBowelsVoCollectionFromNurBowelComponent(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.spinalinjuries.vo.NurAssessmentBowelsVoCollection voList = new ims.spinalinjuries.vo.NurAssessmentBowelsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.nursing.assessment.domain.objects.NurBowelComponent domainObject = (ims.nursing.assessment.domain.objects.NurBowelComponent) domainObjectList.get(i);
			ims.spinalinjuries.vo.NurAssessmentBowelsVo vo = create(map, domainObject);

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
	 * Create the ims.nursing.assessment.domain.objects.NurBowelComponent set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractNurBowelComponentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.spinalinjuries.vo.NurAssessmentBowelsVoCollection voCollection) 
	 {
	 	return extractNurBowelComponentSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractNurBowelComponentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.spinalinjuries.vo.NurAssessmentBowelsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.spinalinjuries.vo.NurAssessmentBowelsVo vo = voCollection.get(i);
			ims.nursing.assessment.domain.objects.NurBowelComponent domainObject = NurAssessmentBowelsVoAssembler.extractNurBowelComponent(domainFactory, vo, domMap);

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
	 * Create the ims.nursing.assessment.domain.objects.NurBowelComponent list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractNurBowelComponentList(ims.domain.ILightweightDomainFactory domainFactory, ims.spinalinjuries.vo.NurAssessmentBowelsVoCollection voCollection) 
	 {
	 	return extractNurBowelComponentList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractNurBowelComponentList(ims.domain.ILightweightDomainFactory domainFactory, ims.spinalinjuries.vo.NurAssessmentBowelsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.spinalinjuries.vo.NurAssessmentBowelsVo vo = voCollection.get(i);
			ims.nursing.assessment.domain.objects.NurBowelComponent domainObject = NurAssessmentBowelsVoAssembler.extractNurBowelComponent(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.nursing.assessment.domain.objects.NurBowelComponent object.
	 * @param domainObject ims.nursing.assessment.domain.objects.NurBowelComponent
	 */
	 public static ims.spinalinjuries.vo.NurAssessmentBowelsVo create(ims.nursing.assessment.domain.objects.NurBowelComponent domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.nursing.assessment.domain.objects.NurBowelComponent object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.spinalinjuries.vo.NurAssessmentBowelsVo create(DomainObjectMap map, ims.nursing.assessment.domain.objects.NurBowelComponent domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.spinalinjuries.vo.NurAssessmentBowelsVo valueObject = (ims.spinalinjuries.vo.NurAssessmentBowelsVo) map.getValueObject(domainObject, ims.spinalinjuries.vo.NurAssessmentBowelsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.spinalinjuries.vo.NurAssessmentBowelsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.nursing.assessment.domain.objects.NurBowelComponent
	 */
	 public static ims.spinalinjuries.vo.NurAssessmentBowelsVo insert(ims.spinalinjuries.vo.NurAssessmentBowelsVo valueObject, ims.nursing.assessment.domain.objects.NurBowelComponent domainObject) 
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
	 * @param domainObject ims.nursing.assessment.domain.objects.NurBowelComponent
	 */
	 public static ims.spinalinjuries.vo.NurAssessmentBowelsVo insert(DomainObjectMap map, ims.spinalinjuries.vo.NurAssessmentBowelsVo valueObject, ims.nursing.assessment.domain.objects.NurBowelComponent domainObject) 
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
			
		// UsualBowelPattern
		ims.domain.lookups.LookupInstance instance1 = domainObject.getUsualBowelPattern();
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

			ims.nursing.vo.lookups.BowelPattern voLookup1 = new ims.nursing.vo.lookups.BowelPattern(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.nursing.vo.lookups.BowelPattern parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.nursing.vo.lookups.BowelPattern(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setUsualBowelPattern(voLookup1);
		}
				// TimeOfDay
		ims.domain.lookups.LookupInstance instance2 = domainObject.getTimeOfDay();
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

			ims.nursing.vo.lookups.BowelTimeOfDay voLookup2 = new ims.nursing.vo.lookups.BowelTimeOfDay(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.nursing.vo.lookups.BowelTimeOfDay parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.nursing.vo.lookups.BowelTimeOfDay(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setTimeOfDay(voLookup2);
		}
				// BowelRoutinePerformedIn
		ims.domain.lookups.LookupInstance instance3 = domainObject.getBowelRoutinePerformedIn();
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

			ims.nursing.vo.lookups.BowelRoutineLocation voLookup3 = new ims.nursing.vo.lookups.BowelRoutineLocation(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.nursing.vo.lookups.BowelRoutineLocation parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.nursing.vo.lookups.BowelRoutineLocation(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setBowelRoutinePerformedIn(voLookup3);
		}
				// BowelRoutinePerformedBy
		ims.domain.lookups.LookupInstance instance4 = domainObject.getBowelRoutinePerformedBy();
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

			ims.nursing.vo.lookups.BowelRoutinePerformedBy voLookup4 = new ims.nursing.vo.lookups.BowelRoutinePerformedBy(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.nursing.vo.lookups.BowelRoutinePerformedBy parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.nursing.vo.lookups.BowelRoutinePerformedBy(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setBowelRoutinePerformedBy(voLookup4);
		}
				// BowelsOpenSpontaneously
		ims.domain.lookups.LookupInstance instance5 = domainObject.getBowelsOpenSpontaneously();
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

			ims.core.vo.lookups.YesNoUnknown voLookup5 = new ims.core.vo.lookups.YesNoUnknown(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.core.vo.lookups.YesNoUnknown(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setBowelsOpenSpontaneously(voLookup5);
		}
				// Notes
		valueObject.setNotes(domainObject.getNotes());
		// BowelMedication
		valueObject.setBowelMedication(ims.core.vo.domain.PatientMedicationVoAssembler.createPatientMedicationVoCollectionFromPatientMedication(map, domainObject.getBowelMedication()) );
		// OstomyDetails
		valueObject.setOstomyDetails(ims.nursing.vo.domain.BowelOstomyVoAssembler.create(map, domainObject.getOstomyDetails()) );
		// SufferFrom
		valueObject.setSufferFrom(ims.nursing.vo.domain.BowelDiarrhoeaConstipationVoAssembler.createBowelDiarrhoeaConstipationVoCollectionFromBowelDiarrhoeaConstipation(map, domainObject.getSufferFrom()) );
		// BowelRegime
		valueObject.setBowelRegime(ims.nursing.vo.domain.BowelRegimeVoAssembler.createBowelRegimeVoCollectionFromBowelRegime(map, domainObject.getBowelRegime()) );
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
	public static ims.nursing.assessment.domain.objects.NurBowelComponent extractNurBowelComponent(ims.domain.ILightweightDomainFactory domainFactory, ims.spinalinjuries.vo.NurAssessmentBowelsVo valueObject) 
	{
		return 	extractNurBowelComponent(domainFactory, valueObject, new HashMap());
	}

	public static ims.nursing.assessment.domain.objects.NurBowelComponent extractNurBowelComponent(ims.domain.ILightweightDomainFactory domainFactory, ims.spinalinjuries.vo.NurAssessmentBowelsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_AssessmentComponent();
		ims.nursing.assessment.domain.objects.NurBowelComponent domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.nursing.assessment.domain.objects.NurBowelComponent)domMap.get(valueObject);
			}
			// ims.spinalinjuries.vo.NurAssessmentBowelsVo ID_NurBowelComponent field is unknown
			domainObject = new ims.nursing.assessment.domain.objects.NurBowelComponent();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_AssessmentComponent());
			if (domMap.get(key) != null)
			{
				return (ims.nursing.assessment.domain.objects.NurBowelComponent)domMap.get(key);
			}
			domainObject = (ims.nursing.assessment.domain.objects.NurBowelComponent) domainFactory.getDomainObject(ims.nursing.assessment.domain.objects.NurBowelComponent.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_AssessmentComponent());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getUsualBowelPattern() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getUsualBowelPattern().getID());
		}
		domainObject.setUsualBowelPattern(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getTimeOfDay() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getTimeOfDay().getID());
		}
		domainObject.setTimeOfDay(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getBowelRoutinePerformedIn() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getBowelRoutinePerformedIn().getID());
		}
		domainObject.setBowelRoutinePerformedIn(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getBowelRoutinePerformedBy() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getBowelRoutinePerformedBy().getID());
		}
		domainObject.setBowelRoutinePerformedBy(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getBowelsOpenSpontaneously() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getBowelsOpenSpontaneously().getID());
		}
		domainObject.setBowelsOpenSpontaneously(value5);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getNotes() != null && valueObject.getNotes().equals(""))
		{
			valueObject.setNotes(null);
		}
		domainObject.setNotes(valueObject.getNotes());
		domainObject.setBowelMedication(ims.core.vo.domain.PatientMedicationVoAssembler.extractPatientMedicationSet(domainFactory, valueObject.getBowelMedication(), domainObject.getBowelMedication(), domMap));		
		domainObject.setOstomyDetails(ims.nursing.vo.domain.BowelOstomyVoAssembler.extractBowelOstomy(domainFactory, valueObject.getOstomyDetails(), domMap));
		domainObject.setSufferFrom(ims.nursing.vo.domain.BowelDiarrhoeaConstipationVoAssembler.extractBowelDiarrhoeaConstipationSet(domainFactory, valueObject.getSufferFrom(), domainObject.getSufferFrom(), domMap));		
		domainObject.setBowelRegime(ims.nursing.vo.domain.BowelRegimeVoAssembler.extractBowelRegimeSet(domainFactory, valueObject.getBowelRegime(), domainObject.getBowelRegime(), domMap));		
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
