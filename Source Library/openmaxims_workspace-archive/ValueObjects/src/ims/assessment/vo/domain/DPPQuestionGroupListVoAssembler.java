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
package ims.assessment.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Alexie Ursache
 */
public class DPPQuestionGroupListVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.assessment.vo.DPPQuestionGroupListVo copy(ims.assessment.vo.DPPQuestionGroupListVo valueObjectDest, ims.assessment.vo.DPPQuestionGroupListVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_DPPQuestionGroup(valueObjectSrc.getID_DPPQuestionGroup());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// UserAssessment
		valueObjectDest.setUserAssessment(valueObjectSrc.getUserAssessment());
		// Group
		valueObjectDest.setGroup(valueObjectSrc.getGroup());
		// AssessmentQuestions
		valueObjectDest.setAssessmentQuestions(valueObjectSrc.getAssessmentQuestions());
		// isActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createDPPQuestionGroupListVoCollectionFromDPPQuestionGroup(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.assessment.configuration.domain.objects.DPPQuestionGroup objects.
	 */
	public static ims.assessment.vo.DPPQuestionGroupListVoCollection createDPPQuestionGroupListVoCollectionFromDPPQuestionGroup(java.util.Set domainObjectSet)	
	{
		return createDPPQuestionGroupListVoCollectionFromDPPQuestionGroup(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.assessment.configuration.domain.objects.DPPQuestionGroup objects.
	 */
	public static ims.assessment.vo.DPPQuestionGroupListVoCollection createDPPQuestionGroupListVoCollectionFromDPPQuestionGroup(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.assessment.vo.DPPQuestionGroupListVoCollection voList = new ims.assessment.vo.DPPQuestionGroupListVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.assessment.configuration.domain.objects.DPPQuestionGroup domainObject = (ims.assessment.configuration.domain.objects.DPPQuestionGroup) iterator.next();
			ims.assessment.vo.DPPQuestionGroupListVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.assessment.configuration.domain.objects.DPPQuestionGroup objects.
	 */
	public static ims.assessment.vo.DPPQuestionGroupListVoCollection createDPPQuestionGroupListVoCollectionFromDPPQuestionGroup(java.util.List domainObjectList) 
	{
		return createDPPQuestionGroupListVoCollectionFromDPPQuestionGroup(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.assessment.configuration.domain.objects.DPPQuestionGroup objects.
	 */
	public static ims.assessment.vo.DPPQuestionGroupListVoCollection createDPPQuestionGroupListVoCollectionFromDPPQuestionGroup(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.assessment.vo.DPPQuestionGroupListVoCollection voList = new ims.assessment.vo.DPPQuestionGroupListVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.assessment.configuration.domain.objects.DPPQuestionGroup domainObject = (ims.assessment.configuration.domain.objects.DPPQuestionGroup) domainObjectList.get(i);
			ims.assessment.vo.DPPQuestionGroupListVo vo = create(map, domainObject);

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
	 * Create the ims.assessment.configuration.domain.objects.DPPQuestionGroup set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractDPPQuestionGroupSet(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.DPPQuestionGroupListVoCollection voCollection) 
	 {
	 	return extractDPPQuestionGroupSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractDPPQuestionGroupSet(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.DPPQuestionGroupListVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.assessment.vo.DPPQuestionGroupListVo vo = voCollection.get(i);
			ims.assessment.configuration.domain.objects.DPPQuestionGroup domainObject = DPPQuestionGroupListVoAssembler.extractDPPQuestionGroup(domainFactory, vo, domMap);

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
	 * Create the ims.assessment.configuration.domain.objects.DPPQuestionGroup list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractDPPQuestionGroupList(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.DPPQuestionGroupListVoCollection voCollection) 
	 {
	 	return extractDPPQuestionGroupList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractDPPQuestionGroupList(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.DPPQuestionGroupListVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.assessment.vo.DPPQuestionGroupListVo vo = voCollection.get(i);
			ims.assessment.configuration.domain.objects.DPPQuestionGroup domainObject = DPPQuestionGroupListVoAssembler.extractDPPQuestionGroup(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.assessment.configuration.domain.objects.DPPQuestionGroup object.
	 * @param domainObject ims.assessment.configuration.domain.objects.DPPQuestionGroup
	 */
	 public static ims.assessment.vo.DPPQuestionGroupListVo create(ims.assessment.configuration.domain.objects.DPPQuestionGroup domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.assessment.configuration.domain.objects.DPPQuestionGroup object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.assessment.vo.DPPQuestionGroupListVo create(DomainObjectMap map, ims.assessment.configuration.domain.objects.DPPQuestionGroup domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.assessment.vo.DPPQuestionGroupListVo valueObject = (ims.assessment.vo.DPPQuestionGroupListVo) map.getValueObject(domainObject, ims.assessment.vo.DPPQuestionGroupListVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.assessment.vo.DPPQuestionGroupListVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.assessment.configuration.domain.objects.DPPQuestionGroup
	 */
	 public static ims.assessment.vo.DPPQuestionGroupListVo insert(ims.assessment.vo.DPPQuestionGroupListVo valueObject, ims.assessment.configuration.domain.objects.DPPQuestionGroup domainObject) 
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
	 * @param domainObject ims.assessment.configuration.domain.objects.DPPQuestionGroup
	 */
	 public static ims.assessment.vo.DPPQuestionGroupListVo insert(DomainObjectMap map, ims.assessment.vo.DPPQuestionGroupListVo valueObject, ims.assessment.configuration.domain.objects.DPPQuestionGroup domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_DPPQuestionGroup(domainObject.getId());
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
			
		// UserAssessment
		if (domainObject.getUserAssessment() != null)
		{
			if(domainObject.getUserAssessment() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getUserAssessment();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setUserAssessment(new ims.assessment.configuration.vo.UserAssessmentRefVo(id, -1));				
			}
			else
			{
				valueObject.setUserAssessment(new ims.assessment.configuration.vo.UserAssessmentRefVo(domainObject.getUserAssessment().getId(), domainObject.getUserAssessment().getVersion()));
			}
		}
		// Group
		ims.domain.lookups.LookupInstance instance2 = domainObject.getGroup();
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

			ims.clinical.vo.lookups.PlanOfCareGroupings voLookup2 = new ims.clinical.vo.lookups.PlanOfCareGroupings(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.clinical.vo.lookups.PlanOfCareGroupings parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.clinical.vo.lookups.PlanOfCareGroupings(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setGroup(voLookup2);
		}
				// AssessmentQuestions
		valueObject.setAssessmentQuestions(ims.core.vo.domain.AssessmentQuestionVoAssembler.createAssessmentQuestionVoCollectionFromAssessmentQuestion(map, domainObject.getAssessmentQuestions()) );
		// isActive
		valueObject.setIsActive( domainObject.isIsActive() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.assessment.configuration.domain.objects.DPPQuestionGroup extractDPPQuestionGroup(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.DPPQuestionGroupListVo valueObject) 
	{
		return 	extractDPPQuestionGroup(domainFactory, valueObject, new HashMap());
	}

	public static ims.assessment.configuration.domain.objects.DPPQuestionGroup extractDPPQuestionGroup(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.DPPQuestionGroupListVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_DPPQuestionGroup();
		ims.assessment.configuration.domain.objects.DPPQuestionGroup domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.assessment.configuration.domain.objects.DPPQuestionGroup)domMap.get(valueObject);
			}
			// ims.assessment.vo.DPPQuestionGroupListVo ID_DPPQuestionGroup field is unknown
			domainObject = new ims.assessment.configuration.domain.objects.DPPQuestionGroup();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_DPPQuestionGroup());
			if (domMap.get(key) != null)
			{
				return (ims.assessment.configuration.domain.objects.DPPQuestionGroup)domMap.get(key);
			}
			domainObject = (ims.assessment.configuration.domain.objects.DPPQuestionGroup) domainFactory.getDomainObject(ims.assessment.configuration.domain.objects.DPPQuestionGroup.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_DPPQuestionGroup());

		ims.assessment.configuration.domain.objects.UserAssessment value1 = null;
		if ( null != valueObject.getUserAssessment() ) 
		{
			if (valueObject.getUserAssessment().getBoId() == null)
			{
				if (domMap.get(valueObject.getUserAssessment()) != null)
				{
					value1 = (ims.assessment.configuration.domain.objects.UserAssessment)domMap.get(valueObject.getUserAssessment());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getUserAssessment();	
			}
			else
			{
				value1 = (ims.assessment.configuration.domain.objects.UserAssessment)domainFactory.getDomainObject(ims.assessment.configuration.domain.objects.UserAssessment.class, valueObject.getUserAssessment().getBoId());
			}
		}
		domainObject.setUserAssessment(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getGroup() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getGroup().getID());
		}
		domainObject.setGroup(value2);
		domainObject.setAssessmentQuestions(ims.core.vo.domain.AssessmentQuestionVoAssembler.extractAssessmentQuestionSet(domainFactory, valueObject.getAssessmentQuestions(), domainObject.getAssessmentQuestions(), domMap));		
		domainObject.setIsActive(valueObject.getIsActive());

		return domainObject;
	}

}
