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
package ims.scheduling.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Daniel Laffan
 */
public class ExclusionDatesVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.scheduling.vo.ExclusionDatesVo copy(ims.scheduling.vo.ExclusionDatesVo valueObjectDest, ims.scheduling.vo.ExclusionDatesVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_SessionExclusionDate(valueObjectSrc.getID_SessionExclusionDate());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Dates
		valueObjectDest.setDates(valueObjectSrc.getDates());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createExclusionDatesVoCollectionFromSessionExclusionDate(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.SessionExclusionDate objects.
	 */
	public static ims.scheduling.vo.ExclusionDatesVoCollection createExclusionDatesVoCollectionFromSessionExclusionDate(java.util.Set domainObjectSet)	
	{
		return createExclusionDatesVoCollectionFromSessionExclusionDate(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.SessionExclusionDate objects.
	 */
	public static ims.scheduling.vo.ExclusionDatesVoCollection createExclusionDatesVoCollectionFromSessionExclusionDate(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.scheduling.vo.ExclusionDatesVoCollection voList = new ims.scheduling.vo.ExclusionDatesVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.scheduling.domain.objects.SessionExclusionDate domainObject = (ims.scheduling.domain.objects.SessionExclusionDate) iterator.next();
			ims.scheduling.vo.ExclusionDatesVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.scheduling.domain.objects.SessionExclusionDate objects.
	 */
	public static ims.scheduling.vo.ExclusionDatesVoCollection createExclusionDatesVoCollectionFromSessionExclusionDate(java.util.List domainObjectList) 
	{
		return createExclusionDatesVoCollectionFromSessionExclusionDate(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.scheduling.domain.objects.SessionExclusionDate objects.
	 */
	public static ims.scheduling.vo.ExclusionDatesVoCollection createExclusionDatesVoCollectionFromSessionExclusionDate(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.scheduling.vo.ExclusionDatesVoCollection voList = new ims.scheduling.vo.ExclusionDatesVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.scheduling.domain.objects.SessionExclusionDate domainObject = (ims.scheduling.domain.objects.SessionExclusionDate) domainObjectList.get(i);
			ims.scheduling.vo.ExclusionDatesVo vo = create(map, domainObject);

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
	 * Create the ims.scheduling.domain.objects.SessionExclusionDate set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractSessionExclusionDateSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.ExclusionDatesVoCollection voCollection) 
	 {
	 	return extractSessionExclusionDateSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractSessionExclusionDateSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.ExclusionDatesVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.ExclusionDatesVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.SessionExclusionDate domainObject = ExclusionDatesVoAssembler.extractSessionExclusionDate(domainFactory, vo, domMap);

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
	 * Create the ims.scheduling.domain.objects.SessionExclusionDate list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractSessionExclusionDateList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.ExclusionDatesVoCollection voCollection) 
	 {
	 	return extractSessionExclusionDateList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractSessionExclusionDateList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.ExclusionDatesVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.ExclusionDatesVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.SessionExclusionDate domainObject = ExclusionDatesVoAssembler.extractSessionExclusionDate(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.scheduling.domain.objects.SessionExclusionDate object.
	 * @param domainObject ims.scheduling.domain.objects.SessionExclusionDate
	 */
	 public static ims.scheduling.vo.ExclusionDatesVo create(ims.scheduling.domain.objects.SessionExclusionDate domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.scheduling.domain.objects.SessionExclusionDate object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.scheduling.vo.ExclusionDatesVo create(DomainObjectMap map, ims.scheduling.domain.objects.SessionExclusionDate domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.scheduling.vo.ExclusionDatesVo valueObject = (ims.scheduling.vo.ExclusionDatesVo) map.getValueObject(domainObject, ims.scheduling.vo.ExclusionDatesVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.scheduling.vo.ExclusionDatesVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.scheduling.domain.objects.SessionExclusionDate
	 */
	 public static ims.scheduling.vo.ExclusionDatesVo insert(ims.scheduling.vo.ExclusionDatesVo valueObject, ims.scheduling.domain.objects.SessionExclusionDate domainObject) 
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
	 * @param domainObject ims.scheduling.domain.objects.SessionExclusionDate
	 */
	 public static ims.scheduling.vo.ExclusionDatesVo insert(DomainObjectMap map, ims.scheduling.vo.ExclusionDatesVo valueObject, ims.scheduling.domain.objects.SessionExclusionDate domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_SessionExclusionDate(domainObject.getId());
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
			
		// Dates
		java.util.List listDates = domainObject.getDates();
		ims.framework.utils.Date[] Dates = new ims.framework.utils.Date[ listDates.size() ];
		int i1 = 0;
		for(java.util.Iterator iterator = listDates.iterator(); iterator.hasNext(); i1++ ) 
		{
			java.util.Date obj = (java.util.Date) iterator.next();
			Dates[i1] = new ims.framework.utils.Date(obj);
		}
		valueObject.setDates( Dates );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.scheduling.domain.objects.SessionExclusionDate extractSessionExclusionDate(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.ExclusionDatesVo valueObject) 
	{
		return 	extractSessionExclusionDate(domainFactory, valueObject, new HashMap());
	}

	public static ims.scheduling.domain.objects.SessionExclusionDate extractSessionExclusionDate(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.ExclusionDatesVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_SessionExclusionDate();
		ims.scheduling.domain.objects.SessionExclusionDate domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.scheduling.domain.objects.SessionExclusionDate)domMap.get(valueObject);
			}
			// ims.scheduling.vo.ExclusionDatesVo ID_SessionExclusionDate field is unknown
			domainObject = new ims.scheduling.domain.objects.SessionExclusionDate();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_SessionExclusionDate());
			if (domMap.get(key) != null)
			{
				return (ims.scheduling.domain.objects.SessionExclusionDate)domMap.get(key);
			}
			domainObject = (ims.scheduling.domain.objects.SessionExclusionDate) domainFactory.getDomainObject(ims.scheduling.domain.objects.SessionExclusionDate.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_SessionExclusionDate());

		ims.framework.utils.Date[] array1 = valueObject.getDates();
		java.util.List value1 = null;
		if ( array1 != null ) 
		{
			value1 = new java.util.ArrayList(array1.length);
			for(int i=0; i<array1.length; i++) {
				value1.add(array1[i].getDate());
			}
		}
		domainObject.setDates(value1);		

		return domainObject;
	}

}
