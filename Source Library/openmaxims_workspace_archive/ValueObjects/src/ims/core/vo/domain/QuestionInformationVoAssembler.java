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
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Kevin O'Carroll
 */
public class QuestionInformationVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.QuestionInformationVo copy(ims.core.vo.QuestionInformationVo valueObjectDest, ims.core.vo.QuestionInformationVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_QuestionInformation(valueObjectSrc.getID_QuestionInformation());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// TaxonomyMap
		valueObjectDest.setTaxonomyMap(valueObjectSrc.getTaxonomyMap());
		// QuestionType
		valueObjectDest.setQuestionType(valueObjectSrc.getQuestionType());
		// Keywords
		valueObjectDest.setKeywords(valueObjectSrc.getKeywords());
		// Text
		valueObjectDest.setText(valueObjectSrc.getText());
		// ShortText
		valueObjectDest.setShortText(valueObjectSrc.getShortText());
		// isQuestion
		valueObjectDest.setIsQuestion(valueObjectSrc.getIsQuestion());
		// AnswerTypes
		valueObjectDest.setAnswerTypes(valueObjectSrc.getAnswerTypes());
		// GenderSpecific
		valueObjectDest.setGenderSpecific(valueObjectSrc.getGenderSpecific());
		// AgeRangeMin
		valueObjectDest.setAgeRangeMin(valueObjectSrc.getAgeRangeMin());
		// AgeRangeMax
		valueObjectDest.setAgeRangeMax(valueObjectSrc.getAgeRangeMax());
		// Status
		valueObjectDest.setStatus(valueObjectSrc.getStatus());
		// Classification
		valueObjectDest.setClassification(valueObjectSrc.getClassification());
		// LegendText
		valueObjectDest.setLegendText(valueObjectSrc.getLegendText());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createQuestionInformationVoCollectionFromQuestionInformation(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.QuestionInformation objects.
	 */
	public static ims.core.vo.QuestionInformationVoCollection createQuestionInformationVoCollectionFromQuestionInformation(java.util.Set domainObjectSet)	
	{
		return createQuestionInformationVoCollectionFromQuestionInformation(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.QuestionInformation objects.
	 */
	public static ims.core.vo.QuestionInformationVoCollection createQuestionInformationVoCollectionFromQuestionInformation(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.QuestionInformationVoCollection voList = new ims.core.vo.QuestionInformationVoCollection();
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
			ims.core.vo.QuestionInformationVo vo = create(map, domainObject);
			
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
	public static ims.core.vo.QuestionInformationVoCollection createQuestionInformationVoCollectionFromQuestionInformation(java.util.List domainObjectList) 
	{
		return createQuestionInformationVoCollectionFromQuestionInformation(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.QuestionInformation objects.
	 */
	public static ims.core.vo.QuestionInformationVoCollection createQuestionInformationVoCollectionFromQuestionInformation(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.QuestionInformationVoCollection voList = new ims.core.vo.QuestionInformationVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.QuestionInformation domainObject = (ims.core.clinical.domain.objects.QuestionInformation) domainObjectList.get(i);
			ims.core.vo.QuestionInformationVo vo = create(map, domainObject);

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
	 public static java.util.Set extractQuestionInformationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.QuestionInformationVoCollection voCollection) 
	 {
	 	return extractQuestionInformationSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractQuestionInformationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.QuestionInformationVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.QuestionInformationVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.QuestionInformation domainObject = QuestionInformationVoAssembler.extractQuestionInformation(domainFactory, vo, domMap);

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
	 public static java.util.List extractQuestionInformationList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.QuestionInformationVoCollection voCollection) 
	 {
	 	return extractQuestionInformationList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractQuestionInformationList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.QuestionInformationVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.QuestionInformationVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.QuestionInformation domainObject = QuestionInformationVoAssembler.extractQuestionInformation(domainFactory, vo, domMap);

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
	 public static ims.core.vo.QuestionInformationVo create(ims.core.clinical.domain.objects.QuestionInformation domainObject) 
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
	  public static ims.core.vo.QuestionInformationVo create(DomainObjectMap map, ims.core.clinical.domain.objects.QuestionInformation domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.QuestionInformationVo valueObject = (ims.core.vo.QuestionInformationVo) map.getValueObject(domainObject, ims.core.vo.QuestionInformationVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.QuestionInformationVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.core.vo.QuestionInformationVo insert(ims.core.vo.QuestionInformationVo valueObject, ims.core.clinical.domain.objects.QuestionInformation domainObject) 
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
	 public static ims.core.vo.QuestionInformationVo insert(DomainObjectMap map, ims.core.vo.QuestionInformationVo valueObject, ims.core.clinical.domain.objects.QuestionInformation domainObject) 
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
			
		// TaxonomyMap
		valueObject.setTaxonomyMap(ims.core.vo.domain.TaxonomyMapAssembler.createTaxonomyMapCollectionFromTaxonomyMap(map, domainObject.getTaxonomyMap()) );
		// QuestionType
		ims.domain.lookups.LookupInstance instance2 = domainObject.getQuestionType();
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

			ims.core.vo.lookups.QuestionType voLookup2 = new ims.core.vo.lookups.QuestionType(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.core.vo.lookups.QuestionType parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.core.vo.lookups.QuestionType(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setQuestionType(voLookup2);
		}
				// Keywords
		valueObject.setKeywords(ims.core.vo.domain.KeywordVoAssembler.createKeywordVoCollectionFromKeyword(map, domainObject.getKeywords()) );
		// Text
		valueObject.setText(domainObject.getText());
		// ShortText
		valueObject.setShortText(domainObject.getShortText());
		// isQuestion
		valueObject.setIsQuestion( domainObject.isIsQuestion() );
		// AnswerTypes
		valueObject.setAnswerTypes(ims.core.vo.domain.QuestionAnswerTypeVoAssembler.createQuestionAnswerTypeVoCollectionFromQuestionAnswerType(map, domainObject.getAnswerTypes()) );
		// GenderSpecific
		ims.domain.lookups.LookupInstance instance8 = domainObject.getGenderSpecific();
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

			ims.admin.vo.lookups.GenderSpecific voLookup8 = new ims.admin.vo.lookups.GenderSpecific(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.admin.vo.lookups.GenderSpecific parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.admin.vo.lookups.GenderSpecific(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setGenderSpecific(voLookup8);
		}
				// AgeRangeMin
		valueObject.setAgeRangeMin(domainObject.getAgeRangeMin());
		// AgeRangeMax
		valueObject.setAgeRangeMax(domainObject.getAgeRangeMax());
		// Status
		ims.domain.lookups.LookupInstance instance11 = domainObject.getStatus();
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

			ims.core.vo.lookups.PreActiveActiveInactiveStatus voLookup11 = new ims.core.vo.lookups.PreActiveActiveInactiveStatus(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.core.vo.lookups.PreActiveActiveInactiveStatus parentVoLookup11 = voLookup11;
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
								parentVoLookup11.setParent(new ims.core.vo.lookups.PreActiveActiveInactiveStatus(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setStatus(voLookup11);
		}
				// Classification
		java.util.List listClassification = domainObject.getClassification();
		ims.core.vo.lookups.QuestionClassificationCollection Classification = new ims.core.vo.lookups.QuestionClassificationCollection();
		for(java.util.Iterator iterator = listClassification.iterator(); iterator.hasNext(); ) 
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
			ims.core.vo.lookups.QuestionClassification voInstance = new ims.core.vo.lookups.QuestionClassification(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.core.vo.lookups.QuestionClassification parentVoInstance = voInstance;
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
								parentVoInstance.setParent(new ims.core.vo.lookups.QuestionClassification(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			Classification.add(voInstance);
		}
		valueObject.setClassification( Classification );
		// LegendText
		valueObject.setLegendText(domainObject.getLegendText());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.domain.objects.QuestionInformation extractQuestionInformation(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.QuestionInformationVo valueObject) 
	{
		return 	extractQuestionInformation(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.QuestionInformation extractQuestionInformation(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.QuestionInformationVo valueObject, HashMap domMap) 
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
			// ims.core.vo.QuestionInformationVo ID_QuestionInformation field is unknown
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

		domainObject.setTaxonomyMap(ims.core.vo.domain.TaxonomyMapAssembler.extractTaxonomyMapList(domainFactory, valueObject.getTaxonomyMap(), domainObject.getTaxonomyMap(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getQuestionType() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getQuestionType().getID());
		}
		domainObject.setQuestionType(value2);
		domainObject.setKeywords(ims.core.vo.domain.KeywordVoAssembler.extractKeywordList(domainFactory, valueObject.getKeywords(), domainObject.getKeywords(), domMap));		
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
		domainObject.setAnswerTypes(ims.core.vo.domain.QuestionAnswerTypeVoAssembler.extractQuestionAnswerTypeList(domainFactory, valueObject.getAnswerTypes(), domainObject.getAnswerTypes(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getGenderSpecific() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getGenderSpecific().getID());
		}
		domainObject.setGenderSpecific(value8);
		domainObject.setAgeRangeMin(valueObject.getAgeRangeMin());
		domainObject.setAgeRangeMax(valueObject.getAgeRangeMax());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getStatus() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getStatus().getID());
		}
		domainObject.setStatus(value11);
		ims.core.vo.lookups.QuestionClassificationCollection collection12 =
	valueObject.getClassification();
	    java.util.List domainClassification = domainObject.getClassification();;			
	    int collection12Size=0;
		if (collection12 == null)
		{
			domainClassification = new java.util.ArrayList(0);
		}
		else
		{
			collection12Size = collection12.size();
		}
		
		for(int i=0; i<collection12Size; i++) 
		{
			int instanceId = collection12.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainClassification.indexOf(dom);
			if (domIdx == -1)
			{
				domainClassification.add(i, dom);
			}
			else if (i != domIdx && i < domainClassification.size())
			{
				Object tmp = domainClassification.get(i);
				domainClassification.set(i, domainClassification.get(domIdx));
				domainClassification.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j12 = domainClassification.size();
		while (j12 > collection12Size)
		{
			domainClassification.remove(j12-1);
			j12 = domainClassification.size();
		}

		domainObject.setClassification(domainClassification);		
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
