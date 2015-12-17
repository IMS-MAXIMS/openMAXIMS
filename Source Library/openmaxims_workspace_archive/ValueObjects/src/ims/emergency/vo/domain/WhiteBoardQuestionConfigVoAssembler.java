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
package ims.emergency.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Florin Blindu
 */
public class WhiteBoardQuestionConfigVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.emergency.vo.WhiteBoardQuestionConfigVo copy(ims.emergency.vo.WhiteBoardQuestionConfigVo valueObjectDest, ims.emergency.vo.WhiteBoardQuestionConfigVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_WhiteBoardQuestionConfig(valueObjectSrc.getID_WhiteBoardQuestionConfig());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// QuestionText
		valueObjectDest.setQuestionText(valueObjectSrc.getQuestionText());
		// ColumnHeaderText
		valueObjectDest.setColumnHeaderText(valueObjectSrc.getColumnHeaderText());
		// AnswerType
		valueObjectDest.setAnswerType(valueObjectSrc.getAnswerType());
		// Options
		valueObjectDest.setOptions(valueObjectSrc.getOptions());
		// ColumnWidth
		valueObjectDest.setColumnWidth(valueObjectSrc.getColumnWidth());
		// GenderSpecific
		valueObjectDest.setGenderSpecific(valueObjectSrc.getGenderSpecific());
		// AgeRangeMin
		valueObjectDest.setAgeRangeMin(valueObjectSrc.getAgeRangeMin());
		// AgeRangeMax
		valueObjectDest.setAgeRangeMax(valueObjectSrc.getAgeRangeMax());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createWhiteBoardQuestionConfigVoCollectionFromWhiteBoardQuestionConfig(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.emergency.configuration.domain.objects.WhiteBoardQuestionConfig objects.
	 */
	public static ims.emergency.vo.WhiteBoardQuestionConfigVoCollection createWhiteBoardQuestionConfigVoCollectionFromWhiteBoardQuestionConfig(java.util.Set domainObjectSet)	
	{
		return createWhiteBoardQuestionConfigVoCollectionFromWhiteBoardQuestionConfig(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.emergency.configuration.domain.objects.WhiteBoardQuestionConfig objects.
	 */
	public static ims.emergency.vo.WhiteBoardQuestionConfigVoCollection createWhiteBoardQuestionConfigVoCollectionFromWhiteBoardQuestionConfig(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.emergency.vo.WhiteBoardQuestionConfigVoCollection voList = new ims.emergency.vo.WhiteBoardQuestionConfigVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.emergency.configuration.domain.objects.WhiteBoardQuestionConfig domainObject = (ims.emergency.configuration.domain.objects.WhiteBoardQuestionConfig) iterator.next();
			ims.emergency.vo.WhiteBoardQuestionConfigVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.emergency.configuration.domain.objects.WhiteBoardQuestionConfig objects.
	 */
	public static ims.emergency.vo.WhiteBoardQuestionConfigVoCollection createWhiteBoardQuestionConfigVoCollectionFromWhiteBoardQuestionConfig(java.util.List domainObjectList) 
	{
		return createWhiteBoardQuestionConfigVoCollectionFromWhiteBoardQuestionConfig(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.emergency.configuration.domain.objects.WhiteBoardQuestionConfig objects.
	 */
	public static ims.emergency.vo.WhiteBoardQuestionConfigVoCollection createWhiteBoardQuestionConfigVoCollectionFromWhiteBoardQuestionConfig(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.emergency.vo.WhiteBoardQuestionConfigVoCollection voList = new ims.emergency.vo.WhiteBoardQuestionConfigVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.emergency.configuration.domain.objects.WhiteBoardQuestionConfig domainObject = (ims.emergency.configuration.domain.objects.WhiteBoardQuestionConfig) domainObjectList.get(i);
			ims.emergency.vo.WhiteBoardQuestionConfigVo vo = create(map, domainObject);

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
	 * Create the ims.emergency.configuration.domain.objects.WhiteBoardQuestionConfig set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractWhiteBoardQuestionConfigSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.WhiteBoardQuestionConfigVoCollection voCollection) 
	 {
	 	return extractWhiteBoardQuestionConfigSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractWhiteBoardQuestionConfigSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.WhiteBoardQuestionConfigVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.WhiteBoardQuestionConfigVo vo = voCollection.get(i);
			ims.emergency.configuration.domain.objects.WhiteBoardQuestionConfig domainObject = WhiteBoardQuestionConfigVoAssembler.extractWhiteBoardQuestionConfig(domainFactory, vo, domMap);

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
	 * Create the ims.emergency.configuration.domain.objects.WhiteBoardQuestionConfig list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractWhiteBoardQuestionConfigList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.WhiteBoardQuestionConfigVoCollection voCollection) 
	 {
	 	return extractWhiteBoardQuestionConfigList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractWhiteBoardQuestionConfigList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.WhiteBoardQuestionConfigVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.WhiteBoardQuestionConfigVo vo = voCollection.get(i);
			ims.emergency.configuration.domain.objects.WhiteBoardQuestionConfig domainObject = WhiteBoardQuestionConfigVoAssembler.extractWhiteBoardQuestionConfig(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.emergency.configuration.domain.objects.WhiteBoardQuestionConfig object.
	 * @param domainObject ims.emergency.configuration.domain.objects.WhiteBoardQuestionConfig
	 */
	 public static ims.emergency.vo.WhiteBoardQuestionConfigVo create(ims.emergency.configuration.domain.objects.WhiteBoardQuestionConfig domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.emergency.configuration.domain.objects.WhiteBoardQuestionConfig object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.emergency.vo.WhiteBoardQuestionConfigVo create(DomainObjectMap map, ims.emergency.configuration.domain.objects.WhiteBoardQuestionConfig domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.emergency.vo.WhiteBoardQuestionConfigVo valueObject = (ims.emergency.vo.WhiteBoardQuestionConfigVo) map.getValueObject(domainObject, ims.emergency.vo.WhiteBoardQuestionConfigVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.emergency.vo.WhiteBoardQuestionConfigVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.emergency.configuration.domain.objects.WhiteBoardQuestionConfig
	 */
	 public static ims.emergency.vo.WhiteBoardQuestionConfigVo insert(ims.emergency.vo.WhiteBoardQuestionConfigVo valueObject, ims.emergency.configuration.domain.objects.WhiteBoardQuestionConfig domainObject) 
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
	 * @param domainObject ims.emergency.configuration.domain.objects.WhiteBoardQuestionConfig
	 */
	 public static ims.emergency.vo.WhiteBoardQuestionConfigVo insert(DomainObjectMap map, ims.emergency.vo.WhiteBoardQuestionConfigVo valueObject, ims.emergency.configuration.domain.objects.WhiteBoardQuestionConfig domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_WhiteBoardQuestionConfig(domainObject.getId());
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
			
		// QuestionText
		valueObject.setQuestionText(domainObject.getQuestionText());
		// ColumnHeaderText
		valueObject.setColumnHeaderText(domainObject.getColumnHeaderText());
		// AnswerType
		ims.domain.lookups.LookupInstance instance3 = domainObject.getAnswerType();
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

			ims.core.vo.lookups.QuestionAnswerType voLookup3 = new ims.core.vo.lookups.QuestionAnswerType(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.QuestionAnswerType parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.core.vo.lookups.QuestionAnswerType(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setAnswerType(voLookup3);
		}
				// Options
		valueObject.setOptions(ims.core.vo.domain.AnswerOptionForEDWhiteboardConfigVoAssembler.createAnswerOptionForEDWhiteboardConfigVoCollectionFromAnswerOption(map, domainObject.getOptions()) );
		// ColumnWidth
		valueObject.setColumnWidth(domainObject.getColumnWidth());
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
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.emergency.configuration.domain.objects.WhiteBoardQuestionConfig extractWhiteBoardQuestionConfig(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.WhiteBoardQuestionConfigVo valueObject) 
	{
		return 	extractWhiteBoardQuestionConfig(domainFactory, valueObject, new HashMap());
	}

	public static ims.emergency.configuration.domain.objects.WhiteBoardQuestionConfig extractWhiteBoardQuestionConfig(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.WhiteBoardQuestionConfigVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_WhiteBoardQuestionConfig();
		ims.emergency.configuration.domain.objects.WhiteBoardQuestionConfig domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.emergency.configuration.domain.objects.WhiteBoardQuestionConfig)domMap.get(valueObject);
			}
			// ims.emergency.vo.WhiteBoardQuestionConfigVo ID_WhiteBoardQuestionConfig field is unknown
			domainObject = new ims.emergency.configuration.domain.objects.WhiteBoardQuestionConfig();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_WhiteBoardQuestionConfig());
			if (domMap.get(key) != null)
			{
				return (ims.emergency.configuration.domain.objects.WhiteBoardQuestionConfig)domMap.get(key);
			}
			domainObject = (ims.emergency.configuration.domain.objects.WhiteBoardQuestionConfig) domainFactory.getDomainObject(ims.emergency.configuration.domain.objects.WhiteBoardQuestionConfig.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_WhiteBoardQuestionConfig());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getQuestionText() != null && valueObject.getQuestionText().equals(""))
		{
			valueObject.setQuestionText(null);
		}
		domainObject.setQuestionText(valueObject.getQuestionText());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getColumnHeaderText() != null && valueObject.getColumnHeaderText().equals(""))
		{
			valueObject.setColumnHeaderText(null);
		}
		domainObject.setColumnHeaderText(valueObject.getColumnHeaderText());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getAnswerType() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getAnswerType().getID());
		}
		domainObject.setAnswerType(value3);
		domainObject.setOptions(ims.core.vo.domain.AnswerOptionForEDWhiteboardConfigVoAssembler.extractAnswerOptionList(domainFactory, valueObject.getOptions(), domainObject.getOptions(), domMap));		
		domainObject.setColumnWidth(valueObject.getColumnWidth());
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

		return domainObject;
	}

}
