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
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Marius Mihalec
 */
public class ScreenHintVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.ScreenHintVo copy(ims.core.vo.ScreenHintVo valueObjectDest, ims.core.vo.ScreenHintVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ScreenHint(valueObjectSrc.getID_ScreenHint());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ImsId
		valueObjectDest.setImsId(valueObjectSrc.getImsId());
		// FormId
		valueObjectDest.setFormId(valueObjectSrc.getFormId());
		// UsageDescription
		valueObjectDest.setUsageDescription(valueObjectSrc.getUsageDescription());
		// UserHintText
		valueObjectDest.setUserHintText(valueObjectSrc.getUserHintText());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createScreenHintVoCollectionFromScreenHint(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.generic.domain.objects.ScreenHint objects.
	 */
	public static ims.core.vo.ScreenHintVoCollection createScreenHintVoCollectionFromScreenHint(java.util.Set domainObjectSet)	
	{
		return createScreenHintVoCollectionFromScreenHint(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.generic.domain.objects.ScreenHint objects.
	 */
	public static ims.core.vo.ScreenHintVoCollection createScreenHintVoCollectionFromScreenHint(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.ScreenHintVoCollection voList = new ims.core.vo.ScreenHintVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.generic.domain.objects.ScreenHint domainObject = (ims.core.generic.domain.objects.ScreenHint) iterator.next();
			ims.core.vo.ScreenHintVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.generic.domain.objects.ScreenHint objects.
	 */
	public static ims.core.vo.ScreenHintVoCollection createScreenHintVoCollectionFromScreenHint(java.util.List domainObjectList) 
	{
		return createScreenHintVoCollectionFromScreenHint(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.generic.domain.objects.ScreenHint objects.
	 */
	public static ims.core.vo.ScreenHintVoCollection createScreenHintVoCollectionFromScreenHint(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.ScreenHintVoCollection voList = new ims.core.vo.ScreenHintVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.generic.domain.objects.ScreenHint domainObject = (ims.core.generic.domain.objects.ScreenHint) domainObjectList.get(i);
			ims.core.vo.ScreenHintVo vo = create(map, domainObject);

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
	 * Create the ims.core.generic.domain.objects.ScreenHint set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractScreenHintSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ScreenHintVoCollection voCollection) 
	 {
	 	return extractScreenHintSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractScreenHintSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ScreenHintVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.ScreenHintVo vo = voCollection.get(i);
			ims.core.generic.domain.objects.ScreenHint domainObject = ScreenHintVoAssembler.extractScreenHint(domainFactory, vo, domMap);

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
	 * Create the ims.core.generic.domain.objects.ScreenHint list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractScreenHintList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ScreenHintVoCollection voCollection) 
	 {
	 	return extractScreenHintList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractScreenHintList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ScreenHintVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.ScreenHintVo vo = voCollection.get(i);
			ims.core.generic.domain.objects.ScreenHint domainObject = ScreenHintVoAssembler.extractScreenHint(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.generic.domain.objects.ScreenHint object.
	 * @param domainObject ims.core.generic.domain.objects.ScreenHint
	 */
	 public static ims.core.vo.ScreenHintVo create(ims.core.generic.domain.objects.ScreenHint domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.generic.domain.objects.ScreenHint object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.ScreenHintVo create(DomainObjectMap map, ims.core.generic.domain.objects.ScreenHint domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.ScreenHintVo valueObject = (ims.core.vo.ScreenHintVo) map.getValueObject(domainObject, ims.core.vo.ScreenHintVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.ScreenHintVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.generic.domain.objects.ScreenHint
	 */
	 public static ims.core.vo.ScreenHintVo insert(ims.core.vo.ScreenHintVo valueObject, ims.core.generic.domain.objects.ScreenHint domainObject) 
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
	 * @param domainObject ims.core.generic.domain.objects.ScreenHint
	 */
	 public static ims.core.vo.ScreenHintVo insert(DomainObjectMap map, ims.core.vo.ScreenHintVo valueObject, ims.core.generic.domain.objects.ScreenHint domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ScreenHint(domainObject.getId());
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
			
		// ImsId
		valueObject.setImsId(domainObject.getImsId());
		// FormId
		valueObject.setFormId(domainObject.getFormId());
		// UsageDescription
		valueObject.setUsageDescription(domainObject.getUsageDescription());
		// UserHintText
		valueObject.setUserHintText(domainObject.getUserHintText());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.generic.domain.objects.ScreenHint extractScreenHint(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ScreenHintVo valueObject) 
	{
		return 	extractScreenHint(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.generic.domain.objects.ScreenHint extractScreenHint(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ScreenHintVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ScreenHint();
		ims.core.generic.domain.objects.ScreenHint domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.generic.domain.objects.ScreenHint)domMap.get(valueObject);
			}
			// ims.core.vo.ScreenHintVo ID_ScreenHint field is unknown
			domainObject = new ims.core.generic.domain.objects.ScreenHint();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ScreenHint());
			if (domMap.get(key) != null)
			{
				return (ims.core.generic.domain.objects.ScreenHint)domMap.get(key);
			}
			domainObject = (ims.core.generic.domain.objects.ScreenHint) domainFactory.getDomainObject(ims.core.generic.domain.objects.ScreenHint.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ScreenHint());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getImsId() != null && valueObject.getImsId().equals(""))
		{
			valueObject.setImsId(null);
		}
		domainObject.setImsId(valueObject.getImsId());
		domainObject.setFormId(valueObject.getFormId());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getUsageDescription() != null && valueObject.getUsageDescription().equals(""))
		{
			valueObject.setUsageDescription(null);
		}
		domainObject.setUsageDescription(valueObject.getUsageDescription());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getUserHintText() != null && valueObject.getUserHintText().equals(""))
		{
			valueObject.setUserHintText(null);
		}
		domainObject.setUserHintText(valueObject.getUserHintText());

		return domainObject;
	}

}
