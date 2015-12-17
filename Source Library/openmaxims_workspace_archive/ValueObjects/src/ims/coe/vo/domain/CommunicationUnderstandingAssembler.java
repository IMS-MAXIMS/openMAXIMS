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
public class CommunicationUnderstandingAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.coe.vo.CommunicationUnderstanding copy(ims.coe.vo.CommunicationUnderstanding valueObjectDest, ims.coe.vo.CommunicationUnderstanding valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_CommunicationSpeechAndLanguageUnderstanding(valueObjectSrc.getID_CommunicationSpeechAndLanguageUnderstanding());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// SpeechAndLanguageUnderstanding
		valueObjectDest.setSpeechAndLanguageUnderstanding(valueObjectSrc.getSpeechAndLanguageUnderstanding());
		// Status
		valueObjectDest.setStatus(valueObjectSrc.getStatus());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createCommunicationUnderstandingCollectionFromCommunicationSpeechAndLanguageUnderstanding(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguageUnderstanding objects.
	 */
	public static ims.coe.vo.CommunicationUnderstandingCollection createCommunicationUnderstandingCollectionFromCommunicationSpeechAndLanguageUnderstanding(java.util.Set domainObjectSet)	
	{
		return createCommunicationUnderstandingCollectionFromCommunicationSpeechAndLanguageUnderstanding(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguageUnderstanding objects.
	 */
	public static ims.coe.vo.CommunicationUnderstandingCollection createCommunicationUnderstandingCollectionFromCommunicationSpeechAndLanguageUnderstanding(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.coe.vo.CommunicationUnderstandingCollection voList = new ims.coe.vo.CommunicationUnderstandingCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguageUnderstanding domainObject = (ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguageUnderstanding) iterator.next();
			ims.coe.vo.CommunicationUnderstanding vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguageUnderstanding objects.
	 */
	public static ims.coe.vo.CommunicationUnderstandingCollection createCommunicationUnderstandingCollectionFromCommunicationSpeechAndLanguageUnderstanding(java.util.List domainObjectList) 
	{
		return createCommunicationUnderstandingCollectionFromCommunicationSpeechAndLanguageUnderstanding(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguageUnderstanding objects.
	 */
	public static ims.coe.vo.CommunicationUnderstandingCollection createCommunicationUnderstandingCollectionFromCommunicationSpeechAndLanguageUnderstanding(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.coe.vo.CommunicationUnderstandingCollection voList = new ims.coe.vo.CommunicationUnderstandingCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguageUnderstanding domainObject = (ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguageUnderstanding) domainObjectList.get(i);
			ims.coe.vo.CommunicationUnderstanding vo = create(map, domainObject);

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
	 * Create the ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguageUnderstanding set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractCommunicationSpeechAndLanguageUnderstandingSet(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.CommunicationUnderstandingCollection voCollection) 
	 {
	 	return extractCommunicationSpeechAndLanguageUnderstandingSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractCommunicationSpeechAndLanguageUnderstandingSet(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.CommunicationUnderstandingCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.coe.vo.CommunicationUnderstanding vo = voCollection.get(i);
			ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguageUnderstanding domainObject = CommunicationUnderstandingAssembler.extractCommunicationSpeechAndLanguageUnderstanding(domainFactory, vo, domMap);

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
	 * Create the ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguageUnderstanding list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractCommunicationSpeechAndLanguageUnderstandingList(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.CommunicationUnderstandingCollection voCollection) 
	 {
	 	return extractCommunicationSpeechAndLanguageUnderstandingList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractCommunicationSpeechAndLanguageUnderstandingList(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.CommunicationUnderstandingCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.coe.vo.CommunicationUnderstanding vo = voCollection.get(i);
			ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguageUnderstanding domainObject = CommunicationUnderstandingAssembler.extractCommunicationSpeechAndLanguageUnderstanding(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguageUnderstanding object.
	 * @param domainObject ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguageUnderstanding
	 */
	 public static ims.coe.vo.CommunicationUnderstanding create(ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguageUnderstanding domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguageUnderstanding object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.coe.vo.CommunicationUnderstanding create(DomainObjectMap map, ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguageUnderstanding domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.coe.vo.CommunicationUnderstanding valueObject = (ims.coe.vo.CommunicationUnderstanding) map.getValueObject(domainObject, ims.coe.vo.CommunicationUnderstanding.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.coe.vo.CommunicationUnderstanding(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguageUnderstanding
	 */
	 public static ims.coe.vo.CommunicationUnderstanding insert(ims.coe.vo.CommunicationUnderstanding valueObject, ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguageUnderstanding domainObject) 
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
	 * @param domainObject ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguageUnderstanding
	 */
	 public static ims.coe.vo.CommunicationUnderstanding insert(DomainObjectMap map, ims.coe.vo.CommunicationUnderstanding valueObject, ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguageUnderstanding domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_CommunicationSpeechAndLanguageUnderstanding(domainObject.getId());
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
			
		// SpeechAndLanguageUnderstanding
		ims.domain.lookups.LookupInstance instance1 = domainObject.getSpeechAndLanguageUnderstanding();
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

			ims.coe.vo.lookups.SpeechAndLanguageUnderstanding voLookup1 = new ims.coe.vo.lookups.SpeechAndLanguageUnderstanding(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.coe.vo.lookups.SpeechAndLanguageUnderstanding parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.coe.vo.lookups.SpeechAndLanguageUnderstanding(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setSpeechAndLanguageUnderstanding(voLookup1);
		}
				// Status
		ims.domain.lookups.LookupInstance instance2 = domainObject.getStatus();
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
			valueObject.setStatus(voLookup2);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguageUnderstanding extractCommunicationSpeechAndLanguageUnderstanding(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.CommunicationUnderstanding valueObject) 
	{
		return 	extractCommunicationSpeechAndLanguageUnderstanding(domainFactory, valueObject, new HashMap());
	}

	public static ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguageUnderstanding extractCommunicationSpeechAndLanguageUnderstanding(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.CommunicationUnderstanding valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_CommunicationSpeechAndLanguageUnderstanding();
		ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguageUnderstanding domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguageUnderstanding)domMap.get(valueObject);
			}
			// ims.coe.vo.CommunicationUnderstanding ID_CommunicationSpeechAndLanguageUnderstanding field is unknown
			domainObject = new ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguageUnderstanding();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_CommunicationSpeechAndLanguageUnderstanding());
			if (domMap.get(key) != null)
			{
				return (ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguageUnderstanding)domMap.get(key);
			}
			domainObject = (ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguageUnderstanding) domainFactory.getDomainObject(ims.coe.assessment.domain.objects.CommunicationSpeechAndLanguageUnderstanding.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_CommunicationSpeechAndLanguageUnderstanding());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getSpeechAndLanguageUnderstanding() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getSpeechAndLanguageUnderstanding().getID());
		}
		domainObject.setSpeechAndLanguageUnderstanding(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getStatus() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getStatus().getID());
		}
		domainObject.setStatus(value2);

		return domainObject;
	}

}
