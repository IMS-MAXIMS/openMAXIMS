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
public class AssessmentMobilityAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.coe.vo.AssessmentMobility copy(ims.coe.vo.AssessmentMobility valueObjectDest, ims.coe.vo.AssessmentMobility valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_AssessmentComponent(valueObjectSrc.getID_AssessmentComponent());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// optionalFallAssessment
		valueObjectDest.setOptionalFallAssessment(valueObjectSrc.getOptionalFallAssessment());
		// AssistanceWithMobility
		valueObjectDest.setAssistanceWithMobility(valueObjectSrc.getAssistanceWithMobility());
		// Notes
		valueObjectDest.setNotes(valueObjectSrc.getNotes());
		// BedType
		valueObjectDest.setBedType(valueObjectSrc.getBedType());
		// ChairType
		valueObjectDest.setChairType(valueObjectSrc.getChairType());
		// PatientHandling
		valueObjectDest.setPatientHandling(valueObjectSrc.getPatientHandling());
		// PatientMovement
		valueObjectDest.setPatientMovement(valueObjectSrc.getPatientMovement());
		// FallAssessmentScore
		valueObjectDest.setFallAssessmentScore(valueObjectSrc.getFallAssessmentScore());
		// EnvironmentChecklist
		valueObjectDest.setEnvironmentChecklist(valueObjectSrc.getEnvironmentChecklist());
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
 	 * If more than one call to an Assembler is made then #createAssessmentMobilityCollectionFromMobilityComponent(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.coe.assessment.domain.objects.MobilityComponent objects.
	 */
	public static ims.coe.vo.AssessmentMobilityCollection createAssessmentMobilityCollectionFromMobilityComponent(java.util.Set domainObjectSet)	
	{
		return createAssessmentMobilityCollectionFromMobilityComponent(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.coe.assessment.domain.objects.MobilityComponent objects.
	 */
	public static ims.coe.vo.AssessmentMobilityCollection createAssessmentMobilityCollectionFromMobilityComponent(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.coe.vo.AssessmentMobilityCollection voList = new ims.coe.vo.AssessmentMobilityCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.coe.assessment.domain.objects.MobilityComponent domainObject = (ims.coe.assessment.domain.objects.MobilityComponent) iterator.next();
			ims.coe.vo.AssessmentMobility vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.coe.assessment.domain.objects.MobilityComponent objects.
	 */
	public static ims.coe.vo.AssessmentMobilityCollection createAssessmentMobilityCollectionFromMobilityComponent(java.util.List domainObjectList) 
	{
		return createAssessmentMobilityCollectionFromMobilityComponent(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.coe.assessment.domain.objects.MobilityComponent objects.
	 */
	public static ims.coe.vo.AssessmentMobilityCollection createAssessmentMobilityCollectionFromMobilityComponent(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.coe.vo.AssessmentMobilityCollection voList = new ims.coe.vo.AssessmentMobilityCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.coe.assessment.domain.objects.MobilityComponent domainObject = (ims.coe.assessment.domain.objects.MobilityComponent) domainObjectList.get(i);
			ims.coe.vo.AssessmentMobility vo = create(map, domainObject);

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
	 * Create the ims.coe.assessment.domain.objects.MobilityComponent set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractMobilityComponentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.AssessmentMobilityCollection voCollection) 
	 {
	 	return extractMobilityComponentSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractMobilityComponentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.AssessmentMobilityCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.coe.vo.AssessmentMobility vo = voCollection.get(i);
			ims.coe.assessment.domain.objects.MobilityComponent domainObject = AssessmentMobilityAssembler.extractMobilityComponent(domainFactory, vo, domMap);

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
	 * Create the ims.coe.assessment.domain.objects.MobilityComponent list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractMobilityComponentList(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.AssessmentMobilityCollection voCollection) 
	 {
	 	return extractMobilityComponentList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractMobilityComponentList(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.AssessmentMobilityCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.coe.vo.AssessmentMobility vo = voCollection.get(i);
			ims.coe.assessment.domain.objects.MobilityComponent domainObject = AssessmentMobilityAssembler.extractMobilityComponent(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.coe.assessment.domain.objects.MobilityComponent object.
	 * @param domainObject ims.coe.assessment.domain.objects.MobilityComponent
	 */
	 public static ims.coe.vo.AssessmentMobility create(ims.coe.assessment.domain.objects.MobilityComponent domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.coe.assessment.domain.objects.MobilityComponent object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.coe.vo.AssessmentMobility create(DomainObjectMap map, ims.coe.assessment.domain.objects.MobilityComponent domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.coe.vo.AssessmentMobility valueObject = (ims.coe.vo.AssessmentMobility) map.getValueObject(domainObject, ims.coe.vo.AssessmentMobility.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.coe.vo.AssessmentMobility(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.coe.assessment.domain.objects.MobilityComponent
	 */
	 public static ims.coe.vo.AssessmentMobility insert(ims.coe.vo.AssessmentMobility valueObject, ims.coe.assessment.domain.objects.MobilityComponent domainObject) 
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
	 * @param domainObject ims.coe.assessment.domain.objects.MobilityComponent
	 */
	 public static ims.coe.vo.AssessmentMobility insert(DomainObjectMap map, ims.coe.vo.AssessmentMobility valueObject, ims.coe.assessment.domain.objects.MobilityComponent domainObject) 
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
			
		// optionalFallAssessment
		valueObject.setOptionalFallAssessment(ims.coe.vo.domain.FallAssessmentAssembler.create(map, domainObject.getOptionalFallAssessment()) );
		// AssistanceWithMobility
		ims.domain.lookups.LookupInstance instance2 = domainObject.getAssistanceWithMobility();
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
			valueObject.setAssistanceWithMobility(voLookup2);
		}
				// Notes
		valueObject.setNotes(domainObject.getNotes());
		// BedType
		ims.domain.lookups.LookupInstance instance4 = domainObject.getBedType();
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

			ims.nursing.vo.lookups.BedType voLookup4 = new ims.nursing.vo.lookups.BedType(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.nursing.vo.lookups.BedType parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.nursing.vo.lookups.BedType(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setBedType(voLookup4);
		}
				// ChairType
		ims.domain.lookups.LookupInstance instance5 = domainObject.getChairType();
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

			ims.nursing.vo.lookups.ChairType voLookup5 = new ims.nursing.vo.lookups.ChairType(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.nursing.vo.lookups.ChairType parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.nursing.vo.lookups.ChairType(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setChairType(voLookup5);
		}
				// PatientHandling
		valueObject.setPatientHandling(ims.coe.vo.domain.PatientHandlingHeaderAssembler.create(map, domainObject.getPatientHandling()) );
		// PatientMovement
		valueObject.setPatientMovement(ims.coe.vo.domain.PatientMovementHeaderAssembler.create(map, domainObject.getPatientMovement()) );
		// FallAssessmentScore
		valueObject.setFallAssessmentScore(domainObject.getFallAssessmentScore());
		// EnvironmentChecklist
		valueObject.setEnvironmentChecklist(ims.nursing.vo.domain.EnvironmentalChecklistVoAssembler.create(map, domainObject.getEnvironmentChecklist()) );
		// isComplete
		valueObject.setIsComplete( domainObject.isIsComplete() );
		// AssessmentInfo
		valueObject.setAssessmentInfo(ims.nursing.vo.domain.AssessmentInfoAssembler.createAssessmentInfoCollectionFromAssessmentInfo(map, domainObject.getAssessmentInfo()) );
		// Copy
		valueObject.setCopy( domainObject.isCopy() );
		// ComponentType
		ims.domain.lookups.LookupInstance instance13 = domainObject.getComponentType();
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

			ims.nursing.vo.lookups.AssessmentComponentType voLookup13 = new ims.nursing.vo.lookups.AssessmentComponentType(instance13.getId(),instance13.getText(), instance13.isActive(), null, img, color);
			ims.nursing.vo.lookups.AssessmentComponentType parentVoLookup13 = voLookup13;
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
								parentVoLookup13.setParent(new ims.nursing.vo.lookups.AssessmentComponentType(parent13.getId(),parent13.getText(), parent13.isActive(), null, img, color));
				parentVoLookup13 = parentVoLookup13.getParent();
								parent13 = parent13.getParent();
			}			
			valueObject.setComponentType(voLookup13);
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
	public static ims.coe.assessment.domain.objects.MobilityComponent extractMobilityComponent(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.AssessmentMobility valueObject) 
	{
		return 	extractMobilityComponent(domainFactory, valueObject, new HashMap());
	}

	public static ims.coe.assessment.domain.objects.MobilityComponent extractMobilityComponent(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.AssessmentMobility valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_AssessmentComponent();
		ims.coe.assessment.domain.objects.MobilityComponent domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.coe.assessment.domain.objects.MobilityComponent)domMap.get(valueObject);
			}
			// ims.coe.vo.AssessmentMobility ID_MobilityComponent field is unknown
			domainObject = new ims.coe.assessment.domain.objects.MobilityComponent();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_AssessmentComponent());
			if (domMap.get(key) != null)
			{
				return (ims.coe.assessment.domain.objects.MobilityComponent)domMap.get(key);
			}
			domainObject = (ims.coe.assessment.domain.objects.MobilityComponent) domainFactory.getDomainObject(ims.coe.assessment.domain.objects.MobilityComponent.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_AssessmentComponent());

		domainObject.setOptionalFallAssessment(ims.coe.vo.domain.FallAssessmentAssembler.extractFallAssessment(domainFactory, valueObject.getOptionalFallAssessment(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getAssistanceWithMobility() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getAssistanceWithMobility().getID());
		}
		domainObject.setAssistanceWithMobility(value2);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getNotes() != null && valueObject.getNotes().equals(""))
		{
			valueObject.setNotes(null);
		}
		domainObject.setNotes(valueObject.getNotes());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getBedType() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getBedType().getID());
		}
		domainObject.setBedType(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getChairType() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getChairType().getID());
		}
		domainObject.setChairType(value5);
		domainObject.setPatientHandling(ims.coe.vo.domain.PatientHandlingHeaderAssembler.extractPatientMovementHandlingScreening(domainFactory, valueObject.getPatientHandling(), domMap));
		domainObject.setPatientMovement(ims.coe.vo.domain.PatientMovementHeaderAssembler.extractPatientMovementHandling(domainFactory, valueObject.getPatientMovement(), domMap));
		domainObject.setFallAssessmentScore(valueObject.getFallAssessmentScore());
		domainObject.setEnvironmentChecklist(ims.nursing.vo.domain.EnvironmentalChecklistVoAssembler.extractEnvironmentalChecklist(domainFactory, valueObject.getEnvironmentChecklist(), domMap));
		domainObject.setIsComplete(valueObject.getIsComplete());
		domainObject.setAssessmentInfo(ims.nursing.vo.domain.AssessmentInfoAssembler.extractAssessmentInfoList(domainFactory, valueObject.getAssessmentInfo(), domainObject.getAssessmentInfo(), domMap));		
		domainObject.setCopy(valueObject.getCopy());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value13 = null;
		if ( null != valueObject.getComponentType() ) 
		{
			value13 =
				domainFactory.getLookupInstance(valueObject.getComponentType().getID());
		}
		domainObject.setComponentType(value13);
		domainObject.setCarePlanTemplate(ims.nursing.vo.domain.CarePlanTemplateAssembler.extractCarePlanTemplateSet(domainFactory, valueObject.getCarePlanTemplate(), domainObject.getCarePlanTemplate(), domMap));		
		domainObject.setCarePlans(ims.nursing.vo.domain.CarePlanAssembler.extractCarePlanSet(domainFactory, valueObject.getCarePlans(), domainObject.getCarePlans(), domMap));		

		return domainObject;
	}

}
