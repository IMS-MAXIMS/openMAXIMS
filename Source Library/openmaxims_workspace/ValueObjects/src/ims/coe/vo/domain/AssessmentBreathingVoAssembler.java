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
public class AssessmentBreathingVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.coe.vo.AssessmentBreathingVo copy(ims.coe.vo.AssessmentBreathingVo valueObjectDest, ims.coe.vo.AssessmentBreathingVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_AssessmentComponent(valueObjectSrc.getID_AssessmentComponent());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// DifficultyBreathing
		valueObjectDest.setDifficultyBreathing(valueObjectSrc.getDifficultyBreathing());
		// BreathingDyspnoea
		valueObjectDest.setBreathingDyspnoea(valueObjectSrc.getBreathingDyspnoea());
		// acuteChronic
		valueObjectDest.setAcuteChronic(valueObjectSrc.getAcuteChronic());
		// Smoking
		valueObjectDest.setSmoking(valueObjectSrc.getSmoking());
		// BreathingMedication
		valueObjectDest.setBreathingMedication(valueObjectSrc.getBreathingMedication());
		// BreathingCough
		valueObjectDest.setBreathingCough(valueObjectSrc.getBreathingCough());
		// BreathingTreatment
		valueObjectDest.setBreathingTreatment(valueObjectSrc.getBreathingTreatment());
		// VentilationTracheostomy
		valueObjectDest.setVentilationTracheostomy(valueObjectSrc.getVentilationTracheostomy());
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
 	 * If more than one call to an Assembler is made then #createAssessmentBreathingVoCollectionFromBreathingComponent(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.nursing.assessment.domain.objects.BreathingComponent objects.
	 */
	public static ims.coe.vo.AssessmentBreathingVoCollection createAssessmentBreathingVoCollectionFromBreathingComponent(java.util.Set domainObjectSet)	
	{
		return createAssessmentBreathingVoCollectionFromBreathingComponent(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.nursing.assessment.domain.objects.BreathingComponent objects.
	 */
	public static ims.coe.vo.AssessmentBreathingVoCollection createAssessmentBreathingVoCollectionFromBreathingComponent(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.coe.vo.AssessmentBreathingVoCollection voList = new ims.coe.vo.AssessmentBreathingVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.nursing.assessment.domain.objects.BreathingComponent domainObject = (ims.nursing.assessment.domain.objects.BreathingComponent) iterator.next();
			ims.coe.vo.AssessmentBreathingVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.nursing.assessment.domain.objects.BreathingComponent objects.
	 */
	public static ims.coe.vo.AssessmentBreathingVoCollection createAssessmentBreathingVoCollectionFromBreathingComponent(java.util.List domainObjectList) 
	{
		return createAssessmentBreathingVoCollectionFromBreathingComponent(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.nursing.assessment.domain.objects.BreathingComponent objects.
	 */
	public static ims.coe.vo.AssessmentBreathingVoCollection createAssessmentBreathingVoCollectionFromBreathingComponent(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.coe.vo.AssessmentBreathingVoCollection voList = new ims.coe.vo.AssessmentBreathingVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.nursing.assessment.domain.objects.BreathingComponent domainObject = (ims.nursing.assessment.domain.objects.BreathingComponent) domainObjectList.get(i);
			ims.coe.vo.AssessmentBreathingVo vo = create(map, domainObject);

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
	 * Create the ims.nursing.assessment.domain.objects.BreathingComponent set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractBreathingComponentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.AssessmentBreathingVoCollection voCollection) 
	 {
	 	return extractBreathingComponentSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractBreathingComponentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.AssessmentBreathingVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.coe.vo.AssessmentBreathingVo vo = voCollection.get(i);
			ims.nursing.assessment.domain.objects.BreathingComponent domainObject = AssessmentBreathingVoAssembler.extractBreathingComponent(domainFactory, vo, domMap);

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
	 * Create the ims.nursing.assessment.domain.objects.BreathingComponent list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractBreathingComponentList(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.AssessmentBreathingVoCollection voCollection) 
	 {
	 	return extractBreathingComponentList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractBreathingComponentList(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.AssessmentBreathingVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.coe.vo.AssessmentBreathingVo vo = voCollection.get(i);
			ims.nursing.assessment.domain.objects.BreathingComponent domainObject = AssessmentBreathingVoAssembler.extractBreathingComponent(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.nursing.assessment.domain.objects.BreathingComponent object.
	 * @param domainObject ims.nursing.assessment.domain.objects.BreathingComponent
	 */
	 public static ims.coe.vo.AssessmentBreathingVo create(ims.nursing.assessment.domain.objects.BreathingComponent domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.nursing.assessment.domain.objects.BreathingComponent object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.coe.vo.AssessmentBreathingVo create(DomainObjectMap map, ims.nursing.assessment.domain.objects.BreathingComponent domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.coe.vo.AssessmentBreathingVo valueObject = (ims.coe.vo.AssessmentBreathingVo) map.getValueObject(domainObject, ims.coe.vo.AssessmentBreathingVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.coe.vo.AssessmentBreathingVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.nursing.assessment.domain.objects.BreathingComponent
	 */
	 public static ims.coe.vo.AssessmentBreathingVo insert(ims.coe.vo.AssessmentBreathingVo valueObject, ims.nursing.assessment.domain.objects.BreathingComponent domainObject) 
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
	 * @param domainObject ims.nursing.assessment.domain.objects.BreathingComponent
	 */
	 public static ims.coe.vo.AssessmentBreathingVo insert(DomainObjectMap map, ims.coe.vo.AssessmentBreathingVo valueObject, ims.nursing.assessment.domain.objects.BreathingComponent domainObject) 
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
			
		// DifficultyBreathing
		ims.domain.lookups.LookupInstance instance1 = domainObject.getDifficultyBreathing();
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
			valueObject.setDifficultyBreathing(voLookup1);
		}
				// BreathingDyspnoea
		java.util.List listBreathingDyspnoea = domainObject.getBreathingDyspnoea();
		ims.nursing.vo.lookups.BreathingDyspnoeaCollection BreathingDyspnoea = new ims.nursing.vo.lookups.BreathingDyspnoeaCollection();
		for(java.util.Iterator iterator = listBreathingDyspnoea.iterator(); iterator.hasNext(); ) 
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
			ims.nursing.vo.lookups.BreathingDyspnoea voInstance = new ims.nursing.vo.lookups.BreathingDyspnoea(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.nursing.vo.lookups.BreathingDyspnoea parentVoInstance = voInstance;
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
								parentVoInstance.setParent(new ims.nursing.vo.lookups.BreathingDyspnoea(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			BreathingDyspnoea.add(voInstance);
		}
		valueObject.setBreathingDyspnoea( BreathingDyspnoea );
		// acuteChronic
		ims.domain.lookups.LookupInstance instance3 = domainObject.getAcuteChronic();
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

			ims.nursing.vo.lookups.BreathingAcuteChronic voLookup3 = new ims.nursing.vo.lookups.BreathingAcuteChronic(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.nursing.vo.lookups.BreathingAcuteChronic parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.nursing.vo.lookups.BreathingAcuteChronic(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setAcuteChronic(voLookup3);
		}
				// Smoking
		valueObject.setSmoking(ims.core.vo.domain.SmokingAssembler.create(map, domainObject.getSmoking()) );
		// BreathingMedication
		valueObject.setBreathingMedication(ims.core.vo.domain.PatientMedicationVoAssembler.createPatientMedicationVoCollectionFromPatientMedication(map, domainObject.getBreathingMedication()) );
		// BreathingCough
		valueObject.setBreathingCough(ims.coe.vo.domain.AssessmentBreathingCoughVoAssembler.create(map, domainObject.getBreathingCough()) );
		// BreathingTreatment
		java.util.List listBreathingTreatment = domainObject.getBreathingTreatment();
		ims.nursing.vo.lookups.BreathingTreatmentCollection BreathingTreatment = new ims.nursing.vo.lookups.BreathingTreatmentCollection();
		for(java.util.Iterator iterator = listBreathingTreatment.iterator(); iterator.hasNext(); ) 
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
			ims.nursing.vo.lookups.BreathingTreatment voInstance = new ims.nursing.vo.lookups.BreathingTreatment(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.nursing.vo.lookups.BreathingTreatment parentVoInstance = voInstance;
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
								parentVoInstance.setParent(new ims.nursing.vo.lookups.BreathingTreatment(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			BreathingTreatment.add(voInstance);
		}
		valueObject.setBreathingTreatment( BreathingTreatment );
		// VentilationTracheostomy
		valueObject.setVentilationTracheostomy(ims.core.vo.domain.VentilationTracheostomyVoAssembler.create(map, domainObject.getVentilationTracheostomy()) );
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
	public static ims.nursing.assessment.domain.objects.BreathingComponent extractBreathingComponent(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.AssessmentBreathingVo valueObject) 
	{
		return 	extractBreathingComponent(domainFactory, valueObject, new HashMap());
	}

	public static ims.nursing.assessment.domain.objects.BreathingComponent extractBreathingComponent(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.AssessmentBreathingVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_AssessmentComponent();
		ims.nursing.assessment.domain.objects.BreathingComponent domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.nursing.assessment.domain.objects.BreathingComponent)domMap.get(valueObject);
			}
			// ims.coe.vo.AssessmentBreathingVo ID_BreathingComponent field is unknown
			domainObject = new ims.nursing.assessment.domain.objects.BreathingComponent();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_AssessmentComponent());
			if (domMap.get(key) != null)
			{
				return (ims.nursing.assessment.domain.objects.BreathingComponent)domMap.get(key);
			}
			domainObject = (ims.nursing.assessment.domain.objects.BreathingComponent) domainFactory.getDomainObject(ims.nursing.assessment.domain.objects.BreathingComponent.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_AssessmentComponent());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getDifficultyBreathing() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getDifficultyBreathing().getID());
		}
		domainObject.setDifficultyBreathing(value1);
		ims.nursing.vo.lookups.BreathingDyspnoeaCollection collection2 =
	valueObject.getBreathingDyspnoea();
	    java.util.List domainBreathingDyspnoea = domainObject.getBreathingDyspnoea();;			
	    int collection2Size=0;
		if (collection2 == null)
		{
			domainBreathingDyspnoea = new java.util.ArrayList(0);
		}
		else
		{
			collection2Size = collection2.size();
		}
		
		for(int i=0; i<collection2Size; i++) 
		{
			int instanceId = collection2.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainBreathingDyspnoea.indexOf(dom);
			if (domIdx == -1)
			{
				domainBreathingDyspnoea.add(i, dom);
			}
			else if (i != domIdx && i < domainBreathingDyspnoea.size())
			{
				Object tmp = domainBreathingDyspnoea.get(i);
				domainBreathingDyspnoea.set(i, domainBreathingDyspnoea.get(domIdx));
				domainBreathingDyspnoea.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j2 = domainBreathingDyspnoea.size();
		while (j2 > collection2Size)
		{
			domainBreathingDyspnoea.remove(j2-1);
			j2 = domainBreathingDyspnoea.size();
		}

		domainObject.setBreathingDyspnoea(domainBreathingDyspnoea);		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getAcuteChronic() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getAcuteChronic().getID());
		}
		domainObject.setAcuteChronic(value3);
		domainObject.setSmoking(ims.core.vo.domain.SmokingAssembler.extractSmoking(domainFactory, valueObject.getSmoking(), domMap));
		domainObject.setBreathingMedication(ims.core.vo.domain.PatientMedicationVoAssembler.extractPatientMedicationSet(domainFactory, valueObject.getBreathingMedication(), domainObject.getBreathingMedication(), domMap));		
		domainObject.setBreathingCough(ims.coe.vo.domain.AssessmentBreathingCoughVoAssembler.extractBreathingCough(domainFactory, valueObject.getBreathingCough(), domMap));
		ims.nursing.vo.lookups.BreathingTreatmentCollection collection7 =
	valueObject.getBreathingTreatment();
	    java.util.List domainBreathingTreatment = domainObject.getBreathingTreatment();;			
	    int collection7Size=0;
		if (collection7 == null)
		{
			domainBreathingTreatment = new java.util.ArrayList(0);
		}
		else
		{
			collection7Size = collection7.size();
		}
		
		for(int i=0; i<collection7Size; i++) 
		{
			int instanceId = collection7.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainBreathingTreatment.indexOf(dom);
			if (domIdx == -1)
			{
				domainBreathingTreatment.add(i, dom);
			}
			else if (i != domIdx && i < domainBreathingTreatment.size())
			{
				Object tmp = domainBreathingTreatment.get(i);
				domainBreathingTreatment.set(i, domainBreathingTreatment.get(domIdx));
				domainBreathingTreatment.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j7 = domainBreathingTreatment.size();
		while (j7 > collection7Size)
		{
			domainBreathingTreatment.remove(j7-1);
			j7 = domainBreathingTreatment.size();
		}

		domainObject.setBreathingTreatment(domainBreathingTreatment);		
		domainObject.setVentilationTracheostomy(ims.core.vo.domain.VentilationTracheostomyVoAssembler.extractVentilationTracheostomy(domainFactory, valueObject.getVentilationTracheostomy(), domMap));
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
