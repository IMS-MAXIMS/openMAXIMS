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
 * @author Charlotte Murphy
 */
public class CommunicationSpeechAndLanguageVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.coe.vo.CommunicationSpeechAndLanguageVo copy(ims.coe.vo.CommunicationSpeechAndLanguageVo valueObjectDest, ims.coe.vo.CommunicationSpeechAndLanguageVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_CommunicationSpeechAndLanguage(valueObjectSrc.getID_CommunicationSpeechAndLanguage());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// SpeechLanguageDifficulty
		valueObjectDest.setSpeechLanguageDifficulty(valueObjectSrc.getSpeechLanguageDifficulty());
		// SpokenLanguage
		valueObjectDest.setSpokenLanguage(valueObjectSrc.getSpokenLanguage());
		// Communicates
		valueObjectDest.setCommunicates(valueObjectSrc.getCommunicates());
		// Verbally
		valueObjectDest.setVerbally(valueObjectSrc.getVerbally());
		// SpeechAndLanguageUnderstanding
		valueObjectDest.setSpeechAndLanguageUnderstanding(valueObjectSrc.getSpeechAndLanguageUnderstanding());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createCommunicationSpeechAndLanguageVoCollectionFromCommunicationSpeechAndLanguage(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguage objects.
	 */
	public static ims.coe.vo.CommunicationSpeechAndLanguageVoCollection createCommunicationSpeechAndLanguageVoCollectionFromCommunicationSpeechAndLanguage(java.util.Set domainObjectSet)	
	{
		return createCommunicationSpeechAndLanguageVoCollectionFromCommunicationSpeechAndLanguage(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguage objects.
	 */
	public static ims.coe.vo.CommunicationSpeechAndLanguageVoCollection createCommunicationSpeechAndLanguageVoCollectionFromCommunicationSpeechAndLanguage(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.coe.vo.CommunicationSpeechAndLanguageVoCollection voList = new ims.coe.vo.CommunicationSpeechAndLanguageVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguage domainObject = (ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguage) iterator.next();
			ims.coe.vo.CommunicationSpeechAndLanguageVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguage objects.
	 */
	public static ims.coe.vo.CommunicationSpeechAndLanguageVoCollection createCommunicationSpeechAndLanguageVoCollectionFromCommunicationSpeechAndLanguage(java.util.List domainObjectList) 
	{
		return createCommunicationSpeechAndLanguageVoCollectionFromCommunicationSpeechAndLanguage(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguage objects.
	 */
	public static ims.coe.vo.CommunicationSpeechAndLanguageVoCollection createCommunicationSpeechAndLanguageVoCollectionFromCommunicationSpeechAndLanguage(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.coe.vo.CommunicationSpeechAndLanguageVoCollection voList = new ims.coe.vo.CommunicationSpeechAndLanguageVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguage domainObject = (ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguage) domainObjectList.get(i);
			ims.coe.vo.CommunicationSpeechAndLanguageVo vo = create(map, domainObject);

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
	 * Create the ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguage set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractCommunicationSpeechAndLanguageSet(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.CommunicationSpeechAndLanguageVoCollection voCollection) 
	 {
	 	return extractCommunicationSpeechAndLanguageSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractCommunicationSpeechAndLanguageSet(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.CommunicationSpeechAndLanguageVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.coe.vo.CommunicationSpeechAndLanguageVo vo = voCollection.get(i);
			ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguage domainObject = CommunicationSpeechAndLanguageVoAssembler.extractCommunicationSpeechAndLanguage(domainFactory, vo, domMap);

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
	 * Create the ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguage list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractCommunicationSpeechAndLanguageList(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.CommunicationSpeechAndLanguageVoCollection voCollection) 
	 {
	 	return extractCommunicationSpeechAndLanguageList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractCommunicationSpeechAndLanguageList(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.CommunicationSpeechAndLanguageVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.coe.vo.CommunicationSpeechAndLanguageVo vo = voCollection.get(i);
			ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguage domainObject = CommunicationSpeechAndLanguageVoAssembler.extractCommunicationSpeechAndLanguage(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguage object.
	 * @param domainObject ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguage
	 */
	 public static ims.coe.vo.CommunicationSpeechAndLanguageVo create(ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguage domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguage object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.coe.vo.CommunicationSpeechAndLanguageVo create(DomainObjectMap map, ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguage domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.coe.vo.CommunicationSpeechAndLanguageVo valueObject = (ims.coe.vo.CommunicationSpeechAndLanguageVo) map.getValueObject(domainObject, ims.coe.vo.CommunicationSpeechAndLanguageVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.coe.vo.CommunicationSpeechAndLanguageVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguage
	 */
	 public static ims.coe.vo.CommunicationSpeechAndLanguageVo insert(ims.coe.vo.CommunicationSpeechAndLanguageVo valueObject, ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguage domainObject) 
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
	 * @param domainObject ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguage
	 */
	 public static ims.coe.vo.CommunicationSpeechAndLanguageVo insert(DomainObjectMap map, ims.coe.vo.CommunicationSpeechAndLanguageVo valueObject, ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguage domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_CommunicationSpeechAndLanguage(domainObject.getId());
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
			
		// SpeechLanguageDifficulty
		ims.domain.lookups.LookupInstance instance1 = domainObject.getSpeechLanguageDifficulty();
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
			valueObject.setSpeechLanguageDifficulty(voLookup1);
		}
				// SpokenLanguage
		ims.domain.lookups.LookupInstance instance2 = domainObject.getSpokenLanguage();
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

			ims.core.vo.lookups.Language voLookup2 = new ims.core.vo.lookups.Language(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.core.vo.lookups.Language parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.core.vo.lookups.Language(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setSpokenLanguage(voLookup2);
		}
				// Communicates
		java.util.List listCommunicates = domainObject.getCommunicates();
		ims.coe.vo.lookups.CommunicatesCollection Communicates = new ims.coe.vo.lookups.CommunicatesCollection();
		for(java.util.Iterator iterator = listCommunicates.iterator(); iterator.hasNext(); ) 
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
			ims.coe.vo.lookups.Communicates voInstance = new ims.coe.vo.lookups.Communicates(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.coe.vo.lookups.Communicates parentVoInstance = voInstance;
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
								parentVoInstance.setParent(new ims.coe.vo.lookups.Communicates(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			Communicates.add(voInstance);
		}
		valueObject.setCommunicates( Communicates );
		// Verbally
		java.util.List listVerbally = domainObject.getVerbally();
		ims.coe.vo.lookups.VerballyCollection Verbally = new ims.coe.vo.lookups.VerballyCollection();
		for(java.util.Iterator iterator = listVerbally.iterator(); iterator.hasNext(); ) 
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
			ims.coe.vo.lookups.Verbally voInstance = new ims.coe.vo.lookups.Verbally(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.coe.vo.lookups.Verbally parentVoInstance = voInstance;
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
								parentVoInstance.setParent(new ims.coe.vo.lookups.Verbally(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			Verbally.add(voInstance);
		}
		valueObject.setVerbally( Verbally );
		// SpeechAndLanguageUnderstanding
		valueObject.setSpeechAndLanguageUnderstanding(ims.coe.vo.domain.CommunicationUnderstandingAssembler.createCommunicationUnderstandingCollectionFromCommunicationSpeechAndLanguageUnderstanding(map, domainObject.getSpeechAndLanguageUnderstanding()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguage extractCommunicationSpeechAndLanguage(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.CommunicationSpeechAndLanguageVo valueObject) 
	{
		return 	extractCommunicationSpeechAndLanguage(domainFactory, valueObject, new HashMap());
	}

	public static ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguage extractCommunicationSpeechAndLanguage(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.CommunicationSpeechAndLanguageVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_CommunicationSpeechAndLanguage();
		ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguage domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguage)domMap.get(valueObject);
			}
			// ims.coe.vo.CommunicationSpeechAndLanguageVo ID_CommunicationSpeechAndLanguage field is unknown
			domainObject = new ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguage();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_CommunicationSpeechAndLanguage());
			if (domMap.get(key) != null)
			{
				return (ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguage)domMap.get(key);
			}
			domainObject = (ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguage) domainFactory.getDomainObject(ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguage.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_CommunicationSpeechAndLanguage());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getSpeechLanguageDifficulty() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getSpeechLanguageDifficulty().getID());
		}
		domainObject.setSpeechLanguageDifficulty(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getSpokenLanguage() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getSpokenLanguage().getID());
		}
		domainObject.setSpokenLanguage(value2);
		ims.coe.vo.lookups.CommunicatesCollection collection3 =
	valueObject.getCommunicates();
	    java.util.List domainCommunicates = domainObject.getCommunicates();;			
	    int collection3Size=0;
		if (collection3 == null)
		{
			domainCommunicates = new java.util.ArrayList(0);
		}
		else
		{
			collection3Size = collection3.size();
		}
		
		for(int i=0; i<collection3Size; i++) 
		{
			int instanceId = collection3.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainCommunicates.indexOf(dom);
			if (domIdx == -1)
			{
				domainCommunicates.add(i, dom);
			}
			else if (i != domIdx && i < domainCommunicates.size())
			{
				Object tmp = domainCommunicates.get(i);
				domainCommunicates.set(i, domainCommunicates.get(domIdx));
				domainCommunicates.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j3 = domainCommunicates.size();
		while (j3 > collection3Size)
		{
			domainCommunicates.remove(j3-1);
			j3 = domainCommunicates.size();
		}

		domainObject.setCommunicates(domainCommunicates);		
		ims.coe.vo.lookups.VerballyCollection collection4 =
	valueObject.getVerbally();
	    java.util.List domainVerbally = domainObject.getVerbally();;			
	    int collection4Size=0;
		if (collection4 == null)
		{
			domainVerbally = new java.util.ArrayList(0);
		}
		else
		{
			collection4Size = collection4.size();
		}
		
		for(int i=0; i<collection4Size; i++) 
		{
			int instanceId = collection4.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainVerbally.indexOf(dom);
			if (domIdx == -1)
			{
				domainVerbally.add(i, dom);
			}
			else if (i != domIdx && i < domainVerbally.size())
			{
				Object tmp = domainVerbally.get(i);
				domainVerbally.set(i, domainVerbally.get(domIdx));
				domainVerbally.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j4 = domainVerbally.size();
		while (j4 > collection4Size)
		{
			domainVerbally.remove(j4-1);
			j4 = domainVerbally.size();
		}

		domainObject.setVerbally(domainVerbally);		
		domainObject.setSpeechAndLanguageUnderstanding(ims.coe.vo.domain.CommunicationUnderstandingAssembler.extractCommunicationSpeechAndLanguageUnderstandingSet(domainFactory, valueObject.getSpeechAndLanguageUnderstanding(), domainObject.getSpeechAndLanguageUnderstanding(), domMap));		

		return domainObject;
	}

}
