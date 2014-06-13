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
public class AssessmentBowelsAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.coe.vo.AssessmentBowels copy(ims.coe.vo.AssessmentBowels valueObjectDest, ims.coe.vo.AssessmentBowels valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_AssessmentComponent(valueObjectSrc.getID_AssessmentComponent());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// BowelOstomy
		valueObjectDest.setBowelOstomy(valueObjectSrc.getBowelOstomy());
		// Diarrhoea
		valueObjectDest.setDiarrhoea(valueObjectSrc.getDiarrhoea());
		// BowelsOpen
		valueObjectDest.setBowelsOpen(valueObjectSrc.getBowelsOpen());
		// Constipation
		valueObjectDest.setConstipation(valueObjectSrc.getConstipation());
		// BowelMedication
		valueObjectDest.setBowelMedication(valueObjectSrc.getBowelMedication());
		// AlternativesUsed
		valueObjectDest.setAlternativesUsed(valueObjectSrc.getAlternativesUsed());
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
 	 * If more than one call to an Assembler is made then #createAssessmentBowelsCollectionFromBowelComponent(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.coe.assessment.domain.objects.BowelComponent objects.
	 */
	public static ims.coe.vo.AssessmentBowelsCollection createAssessmentBowelsCollectionFromBowelComponent(java.util.Set domainObjectSet)	
	{
		return createAssessmentBowelsCollectionFromBowelComponent(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.coe.assessment.domain.objects.BowelComponent objects.
	 */
	public static ims.coe.vo.AssessmentBowelsCollection createAssessmentBowelsCollectionFromBowelComponent(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.coe.vo.AssessmentBowelsCollection voList = new ims.coe.vo.AssessmentBowelsCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.coe.assessment.domain.objects.BowelComponent domainObject = (ims.coe.assessment.domain.objects.BowelComponent) iterator.next();
			ims.coe.vo.AssessmentBowels vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.coe.assessment.domain.objects.BowelComponent objects.
	 */
	public static ims.coe.vo.AssessmentBowelsCollection createAssessmentBowelsCollectionFromBowelComponent(java.util.List domainObjectList) 
	{
		return createAssessmentBowelsCollectionFromBowelComponent(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.coe.assessment.domain.objects.BowelComponent objects.
	 */
	public static ims.coe.vo.AssessmentBowelsCollection createAssessmentBowelsCollectionFromBowelComponent(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.coe.vo.AssessmentBowelsCollection voList = new ims.coe.vo.AssessmentBowelsCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.coe.assessment.domain.objects.BowelComponent domainObject = (ims.coe.assessment.domain.objects.BowelComponent) domainObjectList.get(i);
			ims.coe.vo.AssessmentBowels vo = create(map, domainObject);

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
	 * Create the ims.coe.assessment.domain.objects.BowelComponent set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractBowelComponentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.AssessmentBowelsCollection voCollection) 
	 {
	 	return extractBowelComponentSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractBowelComponentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.AssessmentBowelsCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.coe.vo.AssessmentBowels vo = voCollection.get(i);
			ims.coe.assessment.domain.objects.BowelComponent domainObject = AssessmentBowelsAssembler.extractBowelComponent(domainFactory, vo, domMap);

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
	 * Create the ims.coe.assessment.domain.objects.BowelComponent list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractBowelComponentList(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.AssessmentBowelsCollection voCollection) 
	 {
	 	return extractBowelComponentList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractBowelComponentList(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.AssessmentBowelsCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.coe.vo.AssessmentBowels vo = voCollection.get(i);
			ims.coe.assessment.domain.objects.BowelComponent domainObject = AssessmentBowelsAssembler.extractBowelComponent(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.coe.assessment.domain.objects.BowelComponent object.
	 * @param domainObject ims.coe.assessment.domain.objects.BowelComponent
	 */
	 public static ims.coe.vo.AssessmentBowels create(ims.coe.assessment.domain.objects.BowelComponent domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.coe.assessment.domain.objects.BowelComponent object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.coe.vo.AssessmentBowels create(DomainObjectMap map, ims.coe.assessment.domain.objects.BowelComponent domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.coe.vo.AssessmentBowels valueObject = (ims.coe.vo.AssessmentBowels) map.getValueObject(domainObject, ims.coe.vo.AssessmentBowels.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.coe.vo.AssessmentBowels(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.coe.assessment.domain.objects.BowelComponent
	 */
	 public static ims.coe.vo.AssessmentBowels insert(ims.coe.vo.AssessmentBowels valueObject, ims.coe.assessment.domain.objects.BowelComponent domainObject) 
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
	 * @param domainObject ims.coe.assessment.domain.objects.BowelComponent
	 */
	 public static ims.coe.vo.AssessmentBowels insert(DomainObjectMap map, ims.coe.vo.AssessmentBowels valueObject, ims.coe.assessment.domain.objects.BowelComponent domainObject) 
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
			
		// BowelOstomy
		valueObject.setBowelOstomy(ims.nursing.vo.domain.BowelOstomyVoAssembler.create(map, domainObject.getBowelOstomy()) );
		// Diarrhoea
		valueObject.setDiarrhoea(ims.nursing.vo.domain.DiarrhoeaVoAssembler.create(map, domainObject.getDiarrhoea()) );
		// BowelsOpen
		ims.domain.lookups.LookupInstance instance3 = domainObject.getBowelsOpen();
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

			ims.coe.vo.lookups.BowelsOpen voLookup3 = new ims.coe.vo.lookups.BowelsOpen(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.coe.vo.lookups.BowelsOpen parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.coe.vo.lookups.BowelsOpen(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setBowelsOpen(voLookup3);
		}
				// Constipation
		valueObject.setConstipation(ims.nursing.vo.domain.ConstipationVoAssembler.create(map, domainObject.getConstipation()) );
		// BowelMedication
		valueObject.setBowelMedication(ims.coe.vo.domain.BowelMedicationAssembler.createBowelMedicationCollectionFromBowelMedication(map, domainObject.getBowelMedication()) );
		// AlternativesUsed
		valueObject.setAlternativesUsed(domainObject.getAlternativesUsed());
		// isComplete
		valueObject.setIsComplete( domainObject.isIsComplete() );
		// AssessmentInfo
		valueObject.setAssessmentInfo(ims.nursing.vo.domain.AssessmentInfoAssembler.createAssessmentInfoCollectionFromAssessmentInfo(map, domainObject.getAssessmentInfo()) );
		// Copy
		valueObject.setCopy( domainObject.isCopy() );
		// ComponentType
		ims.domain.lookups.LookupInstance instance10 = domainObject.getComponentType();
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

			ims.nursing.vo.lookups.AssessmentComponentType voLookup10 = new ims.nursing.vo.lookups.AssessmentComponentType(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.nursing.vo.lookups.AssessmentComponentType parentVoLookup10 = voLookup10;
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
								parentVoLookup10.setParent(new ims.nursing.vo.lookups.AssessmentComponentType(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setComponentType(voLookup10);
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
	public static ims.coe.assessment.domain.objects.BowelComponent extractBowelComponent(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.AssessmentBowels valueObject) 
	{
		return 	extractBowelComponent(domainFactory, valueObject, new HashMap());
	}

	public static ims.coe.assessment.domain.objects.BowelComponent extractBowelComponent(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.AssessmentBowels valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_AssessmentComponent();
		ims.coe.assessment.domain.objects.BowelComponent domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.coe.assessment.domain.objects.BowelComponent)domMap.get(valueObject);
			}
			// ims.coe.vo.AssessmentBowels ID_BowelComponent field is unknown
			domainObject = new ims.coe.assessment.domain.objects.BowelComponent();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_AssessmentComponent());
			if (domMap.get(key) != null)
			{
				return (ims.coe.assessment.domain.objects.BowelComponent)domMap.get(key);
			}
			domainObject = (ims.coe.assessment.domain.objects.BowelComponent) domainFactory.getDomainObject(ims.coe.assessment.domain.objects.BowelComponent.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_AssessmentComponent());

		domainObject.setBowelOstomy(ims.nursing.vo.domain.BowelOstomyVoAssembler.extractBowelOstomy(domainFactory, valueObject.getBowelOstomy(), domMap));
		domainObject.setDiarrhoea(ims.nursing.vo.domain.DiarrhoeaVoAssembler.extractBowelDiarrhoea(domainFactory, valueObject.getDiarrhoea(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getBowelsOpen() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getBowelsOpen().getID());
		}
		domainObject.setBowelsOpen(value3);
		domainObject.setConstipation(ims.nursing.vo.domain.ConstipationVoAssembler.extractBowelConstipation(domainFactory, valueObject.getConstipation(), domMap));
		domainObject.setBowelMedication(ims.coe.vo.domain.BowelMedicationAssembler.extractBowelMedicationList(domainFactory, valueObject.getBowelMedication(), domainObject.getBowelMedication(), domMap));		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAlternativesUsed() != null && valueObject.getAlternativesUsed().equals(""))
		{
			valueObject.setAlternativesUsed(null);
		}
		domainObject.setAlternativesUsed(valueObject.getAlternativesUsed());
		domainObject.setIsComplete(valueObject.getIsComplete());
		domainObject.setAssessmentInfo(ims.nursing.vo.domain.AssessmentInfoAssembler.extractAssessmentInfoList(domainFactory, valueObject.getAssessmentInfo(), domainObject.getAssessmentInfo(), domMap));		
		domainObject.setCopy(valueObject.getCopy());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getComponentType() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getComponentType().getID());
		}
		domainObject.setComponentType(value10);
		domainObject.setCarePlanTemplate(ims.nursing.vo.domain.CarePlanTemplateAssembler.extractCarePlanTemplateSet(domainFactory, valueObject.getCarePlanTemplate(), domainObject.getCarePlanTemplate(), domMap));		
		domainObject.setCarePlans(ims.nursing.vo.domain.CarePlanAssembler.extractCarePlanSet(domainFactory, valueObject.getCarePlans(), domainObject.getCarePlans(), domMap));		

		return domainObject;
	}

}
