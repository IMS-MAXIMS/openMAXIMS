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
 * @author Kevin O'Carroll
 */
public class RespExamAuscAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.spinalinjuries.vo.RespExamAusc copy(ims.spinalinjuries.vo.RespExamAusc valueObjectDest, ims.spinalinjuries.vo.RespExamAusc valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_RespAuscultation(valueObjectSrc.getID_RespAuscultation());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// AuscName
		valueObjectDest.setAuscName(valueObjectSrc.getAuscName());
		// AuscDescription
		valueObjectDest.setAuscDescription(valueObjectSrc.getAuscDescription());
		// AuscNote
		valueObjectDest.setAuscNote(valueObjectSrc.getAuscNote());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createRespExamAuscCollectionFromRespAuscultation(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.spinalinjuries.shared.domain.objects.RespAuscultation objects.
	 */
	public static ims.spinalinjuries.vo.RespExamAuscCollection createRespExamAuscCollectionFromRespAuscultation(java.util.Set domainObjectSet)	
	{
		return createRespExamAuscCollectionFromRespAuscultation(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.spinalinjuries.shared.domain.objects.RespAuscultation objects.
	 */
	public static ims.spinalinjuries.vo.RespExamAuscCollection createRespExamAuscCollectionFromRespAuscultation(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.spinalinjuries.vo.RespExamAuscCollection voList = new ims.spinalinjuries.vo.RespExamAuscCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.spinalinjuries.shared.domain.objects.RespAuscultation domainObject = (ims.spinalinjuries.shared.domain.objects.RespAuscultation) iterator.next();
			ims.spinalinjuries.vo.RespExamAusc vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.spinalinjuries.shared.domain.objects.RespAuscultation objects.
	 */
	public static ims.spinalinjuries.vo.RespExamAuscCollection createRespExamAuscCollectionFromRespAuscultation(java.util.List domainObjectList) 
	{
		return createRespExamAuscCollectionFromRespAuscultation(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.spinalinjuries.shared.domain.objects.RespAuscultation objects.
	 */
	public static ims.spinalinjuries.vo.RespExamAuscCollection createRespExamAuscCollectionFromRespAuscultation(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.spinalinjuries.vo.RespExamAuscCollection voList = new ims.spinalinjuries.vo.RespExamAuscCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.spinalinjuries.shared.domain.objects.RespAuscultation domainObject = (ims.spinalinjuries.shared.domain.objects.RespAuscultation) domainObjectList.get(i);
			ims.spinalinjuries.vo.RespExamAusc vo = create(map, domainObject);

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
	 * Create the ims.spinalinjuries.shared.domain.objects.RespAuscultation set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractRespAuscultationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.spinalinjuries.vo.RespExamAuscCollection voCollection) 
	 {
	 	return extractRespAuscultationSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractRespAuscultationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.spinalinjuries.vo.RespExamAuscCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.spinalinjuries.vo.RespExamAusc vo = voCollection.get(i);
			ims.spinalinjuries.shared.domain.objects.RespAuscultation domainObject = RespExamAuscAssembler.extractRespAuscultation(domainFactory, vo, domMap);

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
	 * Create the ims.spinalinjuries.shared.domain.objects.RespAuscultation list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractRespAuscultationList(ims.domain.ILightweightDomainFactory domainFactory, ims.spinalinjuries.vo.RespExamAuscCollection voCollection) 
	 {
	 	return extractRespAuscultationList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractRespAuscultationList(ims.domain.ILightweightDomainFactory domainFactory, ims.spinalinjuries.vo.RespExamAuscCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.spinalinjuries.vo.RespExamAusc vo = voCollection.get(i);
			ims.spinalinjuries.shared.domain.objects.RespAuscultation domainObject = RespExamAuscAssembler.extractRespAuscultation(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.spinalinjuries.shared.domain.objects.RespAuscultation object.
	 * @param domainObject ims.spinalinjuries.shared.domain.objects.RespAuscultation
	 */
	 public static ims.spinalinjuries.vo.RespExamAusc create(ims.spinalinjuries.shared.domain.objects.RespAuscultation domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.spinalinjuries.shared.domain.objects.RespAuscultation object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.spinalinjuries.vo.RespExamAusc create(DomainObjectMap map, ims.spinalinjuries.shared.domain.objects.RespAuscultation domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.spinalinjuries.vo.RespExamAusc valueObject = (ims.spinalinjuries.vo.RespExamAusc) map.getValueObject(domainObject, ims.spinalinjuries.vo.RespExamAusc.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.spinalinjuries.vo.RespExamAusc(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.spinalinjuries.shared.domain.objects.RespAuscultation
	 */
	 public static ims.spinalinjuries.vo.RespExamAusc insert(ims.spinalinjuries.vo.RespExamAusc valueObject, ims.spinalinjuries.shared.domain.objects.RespAuscultation domainObject) 
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
	 * @param domainObject ims.spinalinjuries.shared.domain.objects.RespAuscultation
	 */
	 public static ims.spinalinjuries.vo.RespExamAusc insert(DomainObjectMap map, ims.spinalinjuries.vo.RespExamAusc valueObject, ims.spinalinjuries.shared.domain.objects.RespAuscultation domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_RespAuscultation(domainObject.getId());
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
			
		// AuscName
		valueObject.setAuscName(domainObject.getAuscName());
		// AuscDescription
		valueObject.setAuscDescription(domainObject.getAuscDescription());
		// AuscNote
		valueObject.setAuscNote(domainObject.getAuscNote());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.spinalinjuries.shared.domain.objects.RespAuscultation extractRespAuscultation(ims.domain.ILightweightDomainFactory domainFactory, ims.spinalinjuries.vo.RespExamAusc valueObject) 
	{
		return 	extractRespAuscultation(domainFactory, valueObject, new HashMap());
	}

	public static ims.spinalinjuries.shared.domain.objects.RespAuscultation extractRespAuscultation(ims.domain.ILightweightDomainFactory domainFactory, ims.spinalinjuries.vo.RespExamAusc valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_RespAuscultation();
		ims.spinalinjuries.shared.domain.objects.RespAuscultation domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.spinalinjuries.shared.domain.objects.RespAuscultation)domMap.get(valueObject);
			}
			// ims.spinalinjuries.vo.RespExamAusc ID_RespAuscultation field is unknown
			domainObject = new ims.spinalinjuries.shared.domain.objects.RespAuscultation();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_RespAuscultation());
			if (domMap.get(key) != null)
			{
				return (ims.spinalinjuries.shared.domain.objects.RespAuscultation)domMap.get(key);
			}
			domainObject = (ims.spinalinjuries.shared.domain.objects.RespAuscultation) domainFactory.getDomainObject(ims.spinalinjuries.shared.domain.objects.RespAuscultation.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_RespAuscultation());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAuscName() != null && valueObject.getAuscName().equals(""))
		{
			valueObject.setAuscName(null);
		}
		domainObject.setAuscName(valueObject.getAuscName());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAuscDescription() != null && valueObject.getAuscDescription().equals(""))
		{
			valueObject.setAuscDescription(null);
		}
		domainObject.setAuscDescription(valueObject.getAuscDescription());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAuscNote() != null && valueObject.getAuscNote().equals(""))
		{
			valueObject.setAuscNote(null);
		}
		domainObject.setAuscNote(valueObject.getAuscNote());

		return domainObject;
	}

}
