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
 * @author Cristian Belciug
 */
public class Graphic_AssessmentQuestionVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.assessment.vo.Graphic_AssessmentQuestionVo copy(ims.assessment.vo.Graphic_AssessmentQuestionVo valueObjectDest, ims.assessment.vo.Graphic_AssessmentQuestionVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_GraphicAssessmentQuestion(valueObjectSrc.getID_GraphicAssessmentQuestion());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// isMandatory
		valueObjectDest.setIsMandatory(valueObjectSrc.getIsMandatory());
		// ActiveStatus
		valueObjectDest.setActiveStatus(valueObjectSrc.getActiveStatus());
		// Question
		valueObjectDest.setQuestion(valueObjectSrc.getQuestion());
		// Sequence
		valueObjectDest.setSequence(valueObjectSrc.getSequence());
		// allowsMultipleAnswers
		valueObjectDest.setAllowsMultipleAnswers(valueObjectSrc.getAllowsMultipleAnswers());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createGraphic_AssessmentQuestionVoCollectionFromGraphicAssessmentQuestion(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.assessment.configuration.domain.objects.GraphicAssessmentQuestion objects.
	 */
	public static ims.assessment.vo.Graphic_AssessmentQuestionVoCollection createGraphic_AssessmentQuestionVoCollectionFromGraphicAssessmentQuestion(java.util.Set domainObjectSet)	
	{
		return createGraphic_AssessmentQuestionVoCollectionFromGraphicAssessmentQuestion(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.assessment.configuration.domain.objects.GraphicAssessmentQuestion objects.
	 */
	public static ims.assessment.vo.Graphic_AssessmentQuestionVoCollection createGraphic_AssessmentQuestionVoCollectionFromGraphicAssessmentQuestion(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.assessment.vo.Graphic_AssessmentQuestionVoCollection voList = new ims.assessment.vo.Graphic_AssessmentQuestionVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.assessment.configuration.domain.objects.GraphicAssessmentQuestion domainObject = (ims.assessment.configuration.domain.objects.GraphicAssessmentQuestion) iterator.next();
			ims.assessment.vo.Graphic_AssessmentQuestionVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.assessment.configuration.domain.objects.GraphicAssessmentQuestion objects.
	 */
	public static ims.assessment.vo.Graphic_AssessmentQuestionVoCollection createGraphic_AssessmentQuestionVoCollectionFromGraphicAssessmentQuestion(java.util.List domainObjectList) 
	{
		return createGraphic_AssessmentQuestionVoCollectionFromGraphicAssessmentQuestion(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.assessment.configuration.domain.objects.GraphicAssessmentQuestion objects.
	 */
	public static ims.assessment.vo.Graphic_AssessmentQuestionVoCollection createGraphic_AssessmentQuestionVoCollectionFromGraphicAssessmentQuestion(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.assessment.vo.Graphic_AssessmentQuestionVoCollection voList = new ims.assessment.vo.Graphic_AssessmentQuestionVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.assessment.configuration.domain.objects.GraphicAssessmentQuestion domainObject = (ims.assessment.configuration.domain.objects.GraphicAssessmentQuestion) domainObjectList.get(i);
			ims.assessment.vo.Graphic_AssessmentQuestionVo vo = create(map, domainObject);

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
	 * Create the ims.assessment.configuration.domain.objects.GraphicAssessmentQuestion set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractGraphicAssessmentQuestionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.Graphic_AssessmentQuestionVoCollection voCollection) 
	 {
	 	return extractGraphicAssessmentQuestionSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractGraphicAssessmentQuestionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.Graphic_AssessmentQuestionVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.assessment.vo.Graphic_AssessmentQuestionVo vo = voCollection.get(i);
			ims.assessment.configuration.domain.objects.GraphicAssessmentQuestion domainObject = Graphic_AssessmentQuestionVoAssembler.extractGraphicAssessmentQuestion(domainFactory, vo, domMap);

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
	 * Create the ims.assessment.configuration.domain.objects.GraphicAssessmentQuestion list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractGraphicAssessmentQuestionList(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.Graphic_AssessmentQuestionVoCollection voCollection) 
	 {
	 	return extractGraphicAssessmentQuestionList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractGraphicAssessmentQuestionList(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.Graphic_AssessmentQuestionVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.assessment.vo.Graphic_AssessmentQuestionVo vo = voCollection.get(i);
			ims.assessment.configuration.domain.objects.GraphicAssessmentQuestion domainObject = Graphic_AssessmentQuestionVoAssembler.extractGraphicAssessmentQuestion(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.assessment.configuration.domain.objects.GraphicAssessmentQuestion object.
	 * @param domainObject ims.assessment.configuration.domain.objects.GraphicAssessmentQuestion
	 */
	 public static ims.assessment.vo.Graphic_AssessmentQuestionVo create(ims.assessment.configuration.domain.objects.GraphicAssessmentQuestion domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.assessment.configuration.domain.objects.GraphicAssessmentQuestion object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.assessment.vo.Graphic_AssessmentQuestionVo create(DomainObjectMap map, ims.assessment.configuration.domain.objects.GraphicAssessmentQuestion domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.assessment.vo.Graphic_AssessmentQuestionVo valueObject = (ims.assessment.vo.Graphic_AssessmentQuestionVo) map.getValueObject(domainObject, ims.assessment.vo.Graphic_AssessmentQuestionVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.assessment.vo.Graphic_AssessmentQuestionVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.assessment.configuration.domain.objects.GraphicAssessmentQuestion
	 */
	 public static ims.assessment.vo.Graphic_AssessmentQuestionVo insert(ims.assessment.vo.Graphic_AssessmentQuestionVo valueObject, ims.assessment.configuration.domain.objects.GraphicAssessmentQuestion domainObject) 
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
	 * @param domainObject ims.assessment.configuration.domain.objects.GraphicAssessmentQuestion
	 */
	 public static ims.assessment.vo.Graphic_AssessmentQuestionVo insert(DomainObjectMap map, ims.assessment.vo.Graphic_AssessmentQuestionVo valueObject, ims.assessment.configuration.domain.objects.GraphicAssessmentQuestion domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_GraphicAssessmentQuestion(domainObject.getId());
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
			
		// isMandatory
		valueObject.setIsMandatory( domainObject.isIsMandatory() );
		// ActiveStatus
		ims.domain.lookups.LookupInstance instance2 = domainObject.getActiveStatus();
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

			ims.core.vo.lookups.PreActiveActiveInactiveStatus voLookup2 = new ims.core.vo.lookups.PreActiveActiveInactiveStatus(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.core.vo.lookups.PreActiveActiveInactiveStatus parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.core.vo.lookups.PreActiveActiveInactiveStatus(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setActiveStatus(voLookup2);
		}
				// Question
		valueObject.setQuestion(ims.assessment.vo.domain.Question_InformationVoAssembler.create(map, domainObject.getQuestion()) );
		// Sequence
		valueObject.setSequence(domainObject.getSequence());
		// allowsMultipleAnswers
		valueObject.setAllowsMultipleAnswers( domainObject.isAllowsMultipleAnswers() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.assessment.configuration.domain.objects.GraphicAssessmentQuestion extractGraphicAssessmentQuestion(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.Graphic_AssessmentQuestionVo valueObject) 
	{
		return 	extractGraphicAssessmentQuestion(domainFactory, valueObject, new HashMap());
	}

	public static ims.assessment.configuration.domain.objects.GraphicAssessmentQuestion extractGraphicAssessmentQuestion(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.Graphic_AssessmentQuestionVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_GraphicAssessmentQuestion();
		ims.assessment.configuration.domain.objects.GraphicAssessmentQuestion domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.assessment.configuration.domain.objects.GraphicAssessmentQuestion)domMap.get(valueObject);
			}
			// ims.assessment.vo.Graphic_AssessmentQuestionVo ID_GraphicAssessmentQuestion field is unknown
			domainObject = new ims.assessment.configuration.domain.objects.GraphicAssessmentQuestion();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_GraphicAssessmentQuestion());
			if (domMap.get(key) != null)
			{
				return (ims.assessment.configuration.domain.objects.GraphicAssessmentQuestion)domMap.get(key);
			}
			domainObject = (ims.assessment.configuration.domain.objects.GraphicAssessmentQuestion) domainFactory.getDomainObject(ims.assessment.configuration.domain.objects.GraphicAssessmentQuestion.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_GraphicAssessmentQuestion());

		domainObject.setIsMandatory(valueObject.getIsMandatory());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getActiveStatus() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getActiveStatus().getID());
		}
		domainObject.setActiveStatus(value2);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.QuestionInformation value3 = null;
		if ( null != valueObject.getQuestion() ) 
		{
			if (valueObject.getQuestion().getBoId() == null)
			{
				if (domMap.get(valueObject.getQuestion()) != null)
				{
					value3 = (ims.core.clinical.domain.objects.QuestionInformation)domMap.get(valueObject.getQuestion());
				}
			}
			else
			{
				value3 = (ims.core.clinical.domain.objects.QuestionInformation)domainFactory.getDomainObject(ims.core.clinical.domain.objects.QuestionInformation.class, valueObject.getQuestion().getBoId());
			}
		}
		domainObject.setQuestion(value3);
		domainObject.setSequence(valueObject.getSequence());
		domainObject.setAllowsMultipleAnswers(valueObject.getAllowsMultipleAnswers());

		return domainObject;
	}

}
