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
public class NurAssessmentCleansingDressingVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.spinalinjuries.vo.NurAssessmentCleansingDressingVo copy(ims.spinalinjuries.vo.NurAssessmentCleansingDressingVo valueObjectDest, ims.spinalinjuries.vo.NurAssessmentCleansingDressingVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_AssessmentComponent(valueObjectSrc.getID_AssessmentComponent());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// HygieneActivities
		valueObjectDest.setHygieneActivities(valueObjectSrc.getHygieneActivities());
		// DressingAndGrooming
		valueObjectDest.setDressingAndGrooming(valueObjectSrc.getDressingAndGrooming());
		// BathingPattern
		valueObjectDest.setBathingPattern(valueObjectSrc.getBathingPattern());
		// Frequency
		valueObjectDest.setFrequency(valueObjectSrc.getFrequency());
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
 	 * If more than one call to an Assembler is made then #createNurAssessmentCleansingDressingVoCollectionFromCleansingandDressingComponent(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.nursing.assessment.domain.objects.CleansingandDressingComponent objects.
	 */
	public static ims.spinalinjuries.vo.NurAssessmentCleansingDressingVoCollection createNurAssessmentCleansingDressingVoCollectionFromCleansingandDressingComponent(java.util.Set domainObjectSet)	
	{
		return createNurAssessmentCleansingDressingVoCollectionFromCleansingandDressingComponent(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.nursing.assessment.domain.objects.CleansingandDressingComponent objects.
	 */
	public static ims.spinalinjuries.vo.NurAssessmentCleansingDressingVoCollection createNurAssessmentCleansingDressingVoCollectionFromCleansingandDressingComponent(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.spinalinjuries.vo.NurAssessmentCleansingDressingVoCollection voList = new ims.spinalinjuries.vo.NurAssessmentCleansingDressingVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.nursing.assessment.domain.objects.CleansingandDressingComponent domainObject = (ims.nursing.assessment.domain.objects.CleansingandDressingComponent) iterator.next();
			ims.spinalinjuries.vo.NurAssessmentCleansingDressingVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.nursing.assessment.domain.objects.CleansingandDressingComponent objects.
	 */
	public static ims.spinalinjuries.vo.NurAssessmentCleansingDressingVoCollection createNurAssessmentCleansingDressingVoCollectionFromCleansingandDressingComponent(java.util.List domainObjectList) 
	{
		return createNurAssessmentCleansingDressingVoCollectionFromCleansingandDressingComponent(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.nursing.assessment.domain.objects.CleansingandDressingComponent objects.
	 */
	public static ims.spinalinjuries.vo.NurAssessmentCleansingDressingVoCollection createNurAssessmentCleansingDressingVoCollectionFromCleansingandDressingComponent(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.spinalinjuries.vo.NurAssessmentCleansingDressingVoCollection voList = new ims.spinalinjuries.vo.NurAssessmentCleansingDressingVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.nursing.assessment.domain.objects.CleansingandDressingComponent domainObject = (ims.nursing.assessment.domain.objects.CleansingandDressingComponent) domainObjectList.get(i);
			ims.spinalinjuries.vo.NurAssessmentCleansingDressingVo vo = create(map, domainObject);

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
	 * Create the ims.nursing.assessment.domain.objects.CleansingandDressingComponent set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractCleansingandDressingComponentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.spinalinjuries.vo.NurAssessmentCleansingDressingVoCollection voCollection) 
	 {
	 	return extractCleansingandDressingComponentSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractCleansingandDressingComponentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.spinalinjuries.vo.NurAssessmentCleansingDressingVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.spinalinjuries.vo.NurAssessmentCleansingDressingVo vo = voCollection.get(i);
			ims.nursing.assessment.domain.objects.CleansingandDressingComponent domainObject = NurAssessmentCleansingDressingVoAssembler.extractCleansingandDressingComponent(domainFactory, vo, domMap);

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
	 * Create the ims.nursing.assessment.domain.objects.CleansingandDressingComponent list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractCleansingandDressingComponentList(ims.domain.ILightweightDomainFactory domainFactory, ims.spinalinjuries.vo.NurAssessmentCleansingDressingVoCollection voCollection) 
	 {
	 	return extractCleansingandDressingComponentList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractCleansingandDressingComponentList(ims.domain.ILightweightDomainFactory domainFactory, ims.spinalinjuries.vo.NurAssessmentCleansingDressingVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.spinalinjuries.vo.NurAssessmentCleansingDressingVo vo = voCollection.get(i);
			ims.nursing.assessment.domain.objects.CleansingandDressingComponent domainObject = NurAssessmentCleansingDressingVoAssembler.extractCleansingandDressingComponent(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.nursing.assessment.domain.objects.CleansingandDressingComponent object.
	 * @param domainObject ims.nursing.assessment.domain.objects.CleansingandDressingComponent
	 */
	 public static ims.spinalinjuries.vo.NurAssessmentCleansingDressingVo create(ims.nursing.assessment.domain.objects.CleansingandDressingComponent domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.nursing.assessment.domain.objects.CleansingandDressingComponent object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.spinalinjuries.vo.NurAssessmentCleansingDressingVo create(DomainObjectMap map, ims.nursing.assessment.domain.objects.CleansingandDressingComponent domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.spinalinjuries.vo.NurAssessmentCleansingDressingVo valueObject = (ims.spinalinjuries.vo.NurAssessmentCleansingDressingVo) map.getValueObject(domainObject, ims.spinalinjuries.vo.NurAssessmentCleansingDressingVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.spinalinjuries.vo.NurAssessmentCleansingDressingVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.nursing.assessment.domain.objects.CleansingandDressingComponent
	 */
	 public static ims.spinalinjuries.vo.NurAssessmentCleansingDressingVo insert(ims.spinalinjuries.vo.NurAssessmentCleansingDressingVo valueObject, ims.nursing.assessment.domain.objects.CleansingandDressingComponent domainObject) 
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
	 * @param domainObject ims.nursing.assessment.domain.objects.CleansingandDressingComponent
	 */
	 public static ims.spinalinjuries.vo.NurAssessmentCleansingDressingVo insert(DomainObjectMap map, ims.spinalinjuries.vo.NurAssessmentCleansingDressingVo valueObject, ims.nursing.assessment.domain.objects.CleansingandDressingComponent domainObject) 
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
			
		// HygieneActivities
		valueObject.setHygieneActivities(ims.nursing.vo.domain.HygieneActivitiesAssembler.createHygieneActivitiesCollectionFromPersonalHygieneActivities(map, domainObject.getHygieneActivities()) );
		// DressingAndGrooming
		valueObject.setDressingAndGrooming(ims.nursing.vo.domain.DressingAndGroomingActivitiesAssembler.createDressingAndGroomingActivitiesCollectionFromDressingandGroomingActivities(map, domainObject.getDressingAndGrooming()) );
		// BathingPattern
		ims.domain.lookups.LookupInstance instance3 = domainObject.getBathingPattern();
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

			ims.nursing.vo.lookups.BathingPattern voLookup3 = new ims.nursing.vo.lookups.BathingPattern(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.nursing.vo.lookups.BathingPattern parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.nursing.vo.lookups.BathingPattern(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setBathingPattern(voLookup3);
		}
				// Frequency
		valueObject.setFrequency(domainObject.getFrequency());
		// isComplete
		valueObject.setIsComplete( domainObject.isIsComplete() );
		// AssessmentInfo
		valueObject.setAssessmentInfo(ims.nursing.vo.domain.AssessmentInfoAssembler.createAssessmentInfoCollectionFromAssessmentInfo(map, domainObject.getAssessmentInfo()) );
		// Copy
		valueObject.setCopy( domainObject.isCopy() );
		// ComponentType
		ims.domain.lookups.LookupInstance instance8 = domainObject.getComponentType();
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

			ims.nursing.vo.lookups.AssessmentComponentType voLookup8 = new ims.nursing.vo.lookups.AssessmentComponentType(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.nursing.vo.lookups.AssessmentComponentType parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.nursing.vo.lookups.AssessmentComponentType(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setComponentType(voLookup8);
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
	public static ims.nursing.assessment.domain.objects.CleansingandDressingComponent extractCleansingandDressingComponent(ims.domain.ILightweightDomainFactory domainFactory, ims.spinalinjuries.vo.NurAssessmentCleansingDressingVo valueObject) 
	{
		return 	extractCleansingandDressingComponent(domainFactory, valueObject, new HashMap());
	}

	public static ims.nursing.assessment.domain.objects.CleansingandDressingComponent extractCleansingandDressingComponent(ims.domain.ILightweightDomainFactory domainFactory, ims.spinalinjuries.vo.NurAssessmentCleansingDressingVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_AssessmentComponent();
		ims.nursing.assessment.domain.objects.CleansingandDressingComponent domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.nursing.assessment.domain.objects.CleansingandDressingComponent)domMap.get(valueObject);
			}
			// ims.spinalinjuries.vo.NurAssessmentCleansingDressingVo ID_CleansingandDressingComponent field is unknown
			domainObject = new ims.nursing.assessment.domain.objects.CleansingandDressingComponent();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_AssessmentComponent());
			if (domMap.get(key) != null)
			{
				return (ims.nursing.assessment.domain.objects.CleansingandDressingComponent)domMap.get(key);
			}
			domainObject = (ims.nursing.assessment.domain.objects.CleansingandDressingComponent) domainFactory.getDomainObject(ims.nursing.assessment.domain.objects.CleansingandDressingComponent.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_AssessmentComponent());

		domainObject.setHygieneActivities(ims.nursing.vo.domain.HygieneActivitiesAssembler.extractPersonalHygieneActivitiesSet(domainFactory, valueObject.getHygieneActivities(), domainObject.getHygieneActivities(), domMap));		
		domainObject.setDressingAndGrooming(ims.nursing.vo.domain.DressingAndGroomingActivitiesAssembler.extractDressingandGroomingActivitiesSet(domainFactory, valueObject.getDressingAndGrooming(), domainObject.getDressingAndGrooming(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getBathingPattern() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getBathingPattern().getID());
		}
		domainObject.setBathingPattern(value3);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getFrequency() != null && valueObject.getFrequency().equals(""))
		{
			valueObject.setFrequency(null);
		}
		domainObject.setFrequency(valueObject.getFrequency());
		domainObject.setIsComplete(valueObject.getIsComplete());
		domainObject.setAssessmentInfo(ims.nursing.vo.domain.AssessmentInfoAssembler.extractAssessmentInfoList(domainFactory, valueObject.getAssessmentInfo(), domainObject.getAssessmentInfo(), domMap));		
		domainObject.setCopy(valueObject.getCopy());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getComponentType() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getComponentType().getID());
		}
		domainObject.setComponentType(value8);
		domainObject.setCarePlanTemplate(ims.nursing.vo.domain.CarePlanTemplateAssembler.extractCarePlanTemplateSet(domainFactory, valueObject.getCarePlanTemplate(), domainObject.getCarePlanTemplate(), domMap));		
		domainObject.setCarePlans(ims.nursing.vo.domain.CarePlanAssembler.extractCarePlanSet(domainFactory, valueObject.getCarePlans(), domainObject.getCarePlans(), domMap));		

		return domainObject;
	}

}
