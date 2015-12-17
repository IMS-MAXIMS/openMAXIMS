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
public class AssessmentLeisureAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.coe.vo.AssessmentLeisure copy(ims.coe.vo.AssessmentLeisure valueObjectDest, ims.coe.vo.AssessmentLeisure valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_AssessmentComponent(valueObjectSrc.getID_AssessmentComponent());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// LeisureClubs
		valueObjectDest.setLeisureClubs(valueObjectSrc.getLeisureClubs());
		// Hobbies
		valueObjectDest.setHobbies(valueObjectSrc.getHobbies());
		// EnjoyDoingMost
		valueObjectDest.setEnjoyDoingMost(valueObjectSrc.getEnjoyDoingMost());
		// PreferencesOfTime
		valueObjectDest.setPreferencesOfTime(valueObjectSrc.getPreferencesOfTime());
		// AlcoholSocially
		valueObjectDest.setAlcoholSocially(valueObjectSrc.getAlcoholSocially());
		// AlcoholDetails
		valueObjectDest.setAlcoholDetails(valueObjectSrc.getAlcoholDetails());
		// AlcoholUnits
		valueObjectDest.setAlcoholUnits(valueObjectSrc.getAlcoholUnits());
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
 	 * If more than one call to an Assembler is made then #createAssessmentLeisureCollectionFromLeisureComponent(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.coe.assessment.domain.objects.LeisureComponent objects.
	 */
	public static ims.coe.vo.AssessmentLeisureCollection createAssessmentLeisureCollectionFromLeisureComponent(java.util.Set domainObjectSet)	
	{
		return createAssessmentLeisureCollectionFromLeisureComponent(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.coe.assessment.domain.objects.LeisureComponent objects.
	 */
	public static ims.coe.vo.AssessmentLeisureCollection createAssessmentLeisureCollectionFromLeisureComponent(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.coe.vo.AssessmentLeisureCollection voList = new ims.coe.vo.AssessmentLeisureCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.coe.assessment.domain.objects.LeisureComponent domainObject = (ims.coe.assessment.domain.objects.LeisureComponent) iterator.next();
			ims.coe.vo.AssessmentLeisure vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.coe.assessment.domain.objects.LeisureComponent objects.
	 */
	public static ims.coe.vo.AssessmentLeisureCollection createAssessmentLeisureCollectionFromLeisureComponent(java.util.List domainObjectList) 
	{
		return createAssessmentLeisureCollectionFromLeisureComponent(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.coe.assessment.domain.objects.LeisureComponent objects.
	 */
	public static ims.coe.vo.AssessmentLeisureCollection createAssessmentLeisureCollectionFromLeisureComponent(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.coe.vo.AssessmentLeisureCollection voList = new ims.coe.vo.AssessmentLeisureCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.coe.assessment.domain.objects.LeisureComponent domainObject = (ims.coe.assessment.domain.objects.LeisureComponent) domainObjectList.get(i);
			ims.coe.vo.AssessmentLeisure vo = create(map, domainObject);

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
	 * Create the ims.coe.assessment.domain.objects.LeisureComponent set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractLeisureComponentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.AssessmentLeisureCollection voCollection) 
	 {
	 	return extractLeisureComponentSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractLeisureComponentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.AssessmentLeisureCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.coe.vo.AssessmentLeisure vo = voCollection.get(i);
			ims.coe.assessment.domain.objects.LeisureComponent domainObject = AssessmentLeisureAssembler.extractLeisureComponent(domainFactory, vo, domMap);

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
	 * Create the ims.coe.assessment.domain.objects.LeisureComponent list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractLeisureComponentList(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.AssessmentLeisureCollection voCollection) 
	 {
	 	return extractLeisureComponentList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractLeisureComponentList(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.AssessmentLeisureCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.coe.vo.AssessmentLeisure vo = voCollection.get(i);
			ims.coe.assessment.domain.objects.LeisureComponent domainObject = AssessmentLeisureAssembler.extractLeisureComponent(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.coe.assessment.domain.objects.LeisureComponent object.
	 * @param domainObject ims.coe.assessment.domain.objects.LeisureComponent
	 */
	 public static ims.coe.vo.AssessmentLeisure create(ims.coe.assessment.domain.objects.LeisureComponent domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.coe.assessment.domain.objects.LeisureComponent object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.coe.vo.AssessmentLeisure create(DomainObjectMap map, ims.coe.assessment.domain.objects.LeisureComponent domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.coe.vo.AssessmentLeisure valueObject = (ims.coe.vo.AssessmentLeisure) map.getValueObject(domainObject, ims.coe.vo.AssessmentLeisure.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.coe.vo.AssessmentLeisure(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.coe.assessment.domain.objects.LeisureComponent
	 */
	 public static ims.coe.vo.AssessmentLeisure insert(ims.coe.vo.AssessmentLeisure valueObject, ims.coe.assessment.domain.objects.LeisureComponent domainObject) 
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
	 * @param domainObject ims.coe.assessment.domain.objects.LeisureComponent
	 */
	 public static ims.coe.vo.AssessmentLeisure insert(DomainObjectMap map, ims.coe.vo.AssessmentLeisure valueObject, ims.coe.assessment.domain.objects.LeisureComponent domainObject) 
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
			
		// LeisureClubs
		valueObject.setLeisureClubs(ims.coe.vo.domain.LeisureClubAssembler.createLeisureClubCollectionFromLeisueClubs(map, domainObject.getLeisureClubs()) );
		// Hobbies
		valueObject.setHobbies(domainObject.getHobbies());
		// EnjoyDoingMost
		valueObject.setEnjoyDoingMost(domainObject.getEnjoyDoingMost());
		// PreferencesOfTime
		valueObject.setPreferencesOfTime(domainObject.getPreferencesOfTime());
		// AlcoholSocially
		ims.domain.lookups.LookupInstance instance5 = domainObject.getAlcoholSocially();
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
			valueObject.setAlcoholSocially(voLookup5);
		}
				// AlcoholDetails
		valueObject.setAlcoholDetails(domainObject.getAlcoholDetails());
		// AlcoholUnits
		valueObject.setAlcoholUnits(domainObject.getAlcoholUnits());
		// isComplete
		valueObject.setIsComplete( domainObject.isIsComplete() );
		// AssessmentInfo
		valueObject.setAssessmentInfo(ims.nursing.vo.domain.AssessmentInfoAssembler.createAssessmentInfoCollectionFromAssessmentInfo(map, domainObject.getAssessmentInfo()) );
		// Copy
		valueObject.setCopy( domainObject.isCopy() );
		// ComponentType
		ims.domain.lookups.LookupInstance instance11 = domainObject.getComponentType();
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

			ims.nursing.vo.lookups.AssessmentComponentType voLookup11 = new ims.nursing.vo.lookups.AssessmentComponentType(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.nursing.vo.lookups.AssessmentComponentType parentVoLookup11 = voLookup11;
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
								parentVoLookup11.setParent(new ims.nursing.vo.lookups.AssessmentComponentType(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setComponentType(voLookup11);
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
	public static ims.coe.assessment.domain.objects.LeisureComponent extractLeisureComponent(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.AssessmentLeisure valueObject) 
	{
		return 	extractLeisureComponent(domainFactory, valueObject, new HashMap());
	}

	public static ims.coe.assessment.domain.objects.LeisureComponent extractLeisureComponent(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.AssessmentLeisure valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_AssessmentComponent();
		ims.coe.assessment.domain.objects.LeisureComponent domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.coe.assessment.domain.objects.LeisureComponent)domMap.get(valueObject);
			}
			// ims.coe.vo.AssessmentLeisure ID_LeisureComponent field is unknown
			domainObject = new ims.coe.assessment.domain.objects.LeisureComponent();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_AssessmentComponent());
			if (domMap.get(key) != null)
			{
				return (ims.coe.assessment.domain.objects.LeisureComponent)domMap.get(key);
			}
			domainObject = (ims.coe.assessment.domain.objects.LeisureComponent) domainFactory.getDomainObject(ims.coe.assessment.domain.objects.LeisureComponent.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_AssessmentComponent());

		domainObject.setLeisureClubs(ims.coe.vo.domain.LeisureClubAssembler.extractLeisueClubsSet(domainFactory, valueObject.getLeisureClubs(), domainObject.getLeisureClubs(), domMap));		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getHobbies() != null && valueObject.getHobbies().equals(""))
		{
			valueObject.setHobbies(null);
		}
		domainObject.setHobbies(valueObject.getHobbies());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getEnjoyDoingMost() != null && valueObject.getEnjoyDoingMost().equals(""))
		{
			valueObject.setEnjoyDoingMost(null);
		}
		domainObject.setEnjoyDoingMost(valueObject.getEnjoyDoingMost());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPreferencesOfTime() != null && valueObject.getPreferencesOfTime().equals(""))
		{
			valueObject.setPreferencesOfTime(null);
		}
		domainObject.setPreferencesOfTime(valueObject.getPreferencesOfTime());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getAlcoholSocially() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getAlcoholSocially().getID());
		}
		domainObject.setAlcoholSocially(value5);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAlcoholDetails() != null && valueObject.getAlcoholDetails().equals(""))
		{
			valueObject.setAlcoholDetails(null);
		}
		domainObject.setAlcoholDetails(valueObject.getAlcoholDetails());
		domainObject.setAlcoholUnits(valueObject.getAlcoholUnits());
		domainObject.setIsComplete(valueObject.getIsComplete());
		domainObject.setAssessmentInfo(ims.nursing.vo.domain.AssessmentInfoAssembler.extractAssessmentInfoList(domainFactory, valueObject.getAssessmentInfo(), domainObject.getAssessmentInfo(), domMap));		
		domainObject.setCopy(valueObject.getCopy());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getComponentType() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getComponentType().getID());
		}
		domainObject.setComponentType(value11);
		domainObject.setCarePlanTemplate(ims.nursing.vo.domain.CarePlanTemplateAssembler.extractCarePlanTemplateSet(domainFactory, valueObject.getCarePlanTemplate(), domainObject.getCarePlanTemplate(), domMap));		
		domainObject.setCarePlans(ims.nursing.vo.domain.CarePlanAssembler.extractCarePlanSet(domainFactory, valueObject.getCarePlans(), domainObject.getCarePlans(), domMap));		

		return domainObject;
	}

}
