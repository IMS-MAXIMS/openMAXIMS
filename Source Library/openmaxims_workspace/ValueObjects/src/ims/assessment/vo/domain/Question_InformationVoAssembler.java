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
public class Question_InformationVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.assessment.vo.Question_InformationVo copy(ims.assessment.vo.Question_InformationVo valueObjectDest, ims.assessment.vo.Question_InformationVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_QuestionInformation(valueObjectSrc.getID_QuestionInformation());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Text
		valueObjectDest.setText(valueObjectSrc.getText());
		// ShortText
		valueObjectDest.setShortText(valueObjectSrc.getShortText());
		// isQuestion
		valueObjectDest.setIsQuestion(valueObjectSrc.getIsQuestion());
		// Status
		valueObjectDest.setStatus(valueObjectSrc.getStatus());
		// AnswerTypes
		valueObjectDest.setAnswerTypes(valueObjectSrc.getAnswerTypes());
		// GenderSpecific
		valueObjectDest.setGenderSpecific(valueObjectSrc.getGenderSpecific());
		// AgeRangeMin
		valueObjectDest.setAgeRangeMin(valueObjectSrc.getAgeRangeMin());
		// AgeRangeMax
		valueObjectDest.setAgeRangeMax(valueObjectSrc.getAgeRangeMax());
		// LegendText
		valueObjectDest.setLegendText(valueObjectSrc.getLegendText());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createQuestion_InformationVoCollectionFromQuestionInformation(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.QuestionInformation objects.
	 */
	public static ims.assessment.vo.Question_InformationVoCollection createQuestion_InformationVoCollectionFromQuestionInformation(java.util.Set domainObjectSet)	
	{
		return createQuestion_InformationVoCollectionFromQuestionInformation(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.QuestionInformation objects.
	 */
	public static ims.assessment.vo.Question_InformationVoCollection createQuestion_InformationVoCollectionFromQuestionInformation(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.assessment.vo.Question_InformationVoCollection voList = new ims.assessment.vo.Question_InformationVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.clinical.domain.objects.QuestionInformation domainObject = (ims.core.clinical.domain.objects.QuestionInformation) iterator.next();
			ims.assessment.vo.Question_InformationVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.QuestionInformation objects.
	 */
	public static ims.assessment.vo.Question_InformationVoCollection createQuestion_InformationVoCollectionFromQuestionInformation(java.util.List domainObjectList) 
	{
		return createQuestion_InformationVoCollectionFromQuestionInformation(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.QuestionInformation objects.
	 */
	public static ims.assessment.vo.Question_InformationVoCollection createQuestion_InformationVoCollectionFromQuestionInformation(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.assessment.vo.Question_InformationVoCollection voList = new ims.assessment.vo.Question_InformationVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.QuestionInformation domainObject = (ims.core.clinical.domain.objects.QuestionInformation) domainObjectList.get(i);
			ims.assessment.vo.Question_InformationVo vo = create(map, domainObject);

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
	 * Create the ims.core.clinical.domain.objects.QuestionInformation set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractQuestionInformationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.Question_InformationVoCollection voCollection) 
	 {
	 	return extractQuestionInformationSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractQuestionInformationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.Question_InformationVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.assessment.vo.Question_InformationVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.QuestionInformation domainObject = Question_InformationVoAssembler.extractQuestionInformation(domainFactory, vo, domMap);

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
	 * Create the ims.core.clinical.domain.objects.QuestionInformation list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractQuestionInformationList(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.Question_InformationVoCollection voCollection) 
	 {
	 	return extractQuestionInformationList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractQuestionInformationList(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.Question_InformationVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.assessment.vo.Question_InformationVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.QuestionInformation domainObject = Question_InformationVoAssembler.extractQuestionInformation(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.clinical.domain.objects.QuestionInformation object.
	 * @param domainObject ims.core.clinical.domain.objects.QuestionInformation
	 */
	 public static ims.assessment.vo.Question_InformationVo create(ims.core.clinical.domain.objects.QuestionInformation domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.clinical.domain.objects.QuestionInformation object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.assessment.vo.Question_InformationVo create(DomainObjectMap map, ims.core.clinical.domain.objects.QuestionInformation domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.assessment.vo.Question_InformationVo valueObject = (ims.assessment.vo.Question_InformationVo) map.getValueObject(domainObject, ims.assessment.vo.Question_InformationVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.assessment.vo.Question_InformationVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.clinical.domain.objects.QuestionInformation
	 */
	 public static ims.assessment.vo.Question_InformationVo insert(ims.assessment.vo.Question_InformationVo valueObject, ims.core.clinical.domain.objects.QuestionInformation domainObject) 
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
	 * @param domainObject ims.core.clinical.domain.objects.QuestionInformation
	 */
	 public static ims.assessment.vo.Question_InformationVo insert(DomainObjectMap map, ims.assessment.vo.Question_InformationVo valueObject, ims.core.clinical.domain.objects.QuestionInformation domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_QuestionInformation(domainObject.getId());
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
			
		// Text
		valueObject.setText(domainObject.getText());
		// ShortText
		valueObject.setShortText(domainObject.getShortText());
		// isQuestion
		valueObject.setIsQuestion( domainObject.isIsQuestion() );
		// Status
		ims.domain.lookups.LookupInstance instance4 = domainObject.getStatus();
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

			ims.core.vo.lookups.PreActiveActiveInactiveStatus voLookup4 = new ims.core.vo.lookups.PreActiveActiveInactiveStatus(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.PreActiveActiveInactiveStatus parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.core.vo.lookups.PreActiveActiveInactiveStatus(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setStatus(voLookup4);
		}
				// AnswerTypes
		valueObject.setAnswerTypes(ims.assessment.vo.domain.Question_AnswerTypeVoAssembler.createQuestion_AnswerTypeVoCollectionFromQuestionAnswerType(map, domainObject.getAnswerTypes()) );
		// GenderSpecific
		ims.domain.lookups.LookupInstance instance6 = domainObject.getGenderSpecific();
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

			ims.admin.vo.lookups.GenderSpecific voLookup6 = new ims.admin.vo.lookups.GenderSpecific(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.admin.vo.lookups.GenderSpecific parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.admin.vo.lookups.GenderSpecific(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setGenderSpecific(voLookup6);
		}
				// AgeRangeMin
		valueObject.setAgeRangeMin(domainObject.getAgeRangeMin());
		// AgeRangeMax
		valueObject.setAgeRangeMax(domainObject.getAgeRangeMax());
		// LegendText
		valueObject.setLegendText(domainObject.getLegendText());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.domain.objects.QuestionInformation extractQuestionInformation(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.Question_InformationVo valueObject) 
	{
		return 	extractQuestionInformation(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.QuestionInformation extractQuestionInformation(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.Question_InformationVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_QuestionInformation();
		ims.core.clinical.domain.objects.QuestionInformation domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.clinical.domain.objects.QuestionInformation)domMap.get(valueObject);
			}
			// ims.assessment.vo.Question_InformationVo ID_QuestionInformation field is unknown
			domainObject = new ims.core.clinical.domain.objects.QuestionInformation();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_QuestionInformation());
			if (domMap.get(key) != null)
			{
				return (ims.core.clinical.domain.objects.QuestionInformation)domMap.get(key);
			}
			domainObject = (ims.core.clinical.domain.objects.QuestionInformation) domainFactory.getDomainObject(ims.core.clinical.domain.objects.QuestionInformation.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_QuestionInformation());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getText() != null && valueObject.getText().equals(""))
		{
			valueObject.setText(null);
		}
		domainObject.setText(valueObject.getText());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getShortText() != null && valueObject.getShortText().equals(""))
		{
			valueObject.setShortText(null);
		}
		domainObject.setShortText(valueObject.getShortText());
		domainObject.setIsQuestion(valueObject.getIsQuestion());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getStatus() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getStatus().getID());
		}
		domainObject.setStatus(value4);
		domainObject.setAnswerTypes(ims.assessment.vo.domain.Question_AnswerTypeVoAssembler.extractQuestionAnswerTypeList(domainFactory, valueObject.getAnswerTypes(), domainObject.getAnswerTypes(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getGenderSpecific() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getGenderSpecific().getID());
		}
		domainObject.setGenderSpecific(value6);
		domainObject.setAgeRangeMin(valueObject.getAgeRangeMin());
		domainObject.setAgeRangeMax(valueObject.getAgeRangeMax());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getLegendText() != null && valueObject.getLegendText().equals(""))
		{
			valueObject.setLegendText(null);
		}
		domainObject.setLegendText(valueObject.getLegendText());

		return domainObject;
	}

}
