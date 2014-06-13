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
 * @author Kevin O'Carroll
 */
public class Profile_Exc_DateVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.scheduling.vo.Profile_Exc_DateVo copy(ims.scheduling.vo.Profile_Exc_DateVo valueObjectDest, ims.scheduling.vo.Profile_Exc_DateVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Profile_Exc_Date(valueObjectSrc.getID_Profile_Exc_Date());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// StartDate
		valueObjectDest.setStartDate(valueObjectSrc.getStartDate());
		// EndDate
		valueObjectDest.setEndDate(valueObjectSrc.getEndDate());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createProfile_Exc_DateVoCollectionFromProfile_Exc_Date(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.Profile_Exc_Date objects.
	 */
	public static ims.scheduling.vo.Profile_Exc_DateVoCollection createProfile_Exc_DateVoCollectionFromProfile_Exc_Date(java.util.Set domainObjectSet)	
	{
		return createProfile_Exc_DateVoCollectionFromProfile_Exc_Date(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.Profile_Exc_Date objects.
	 */
	public static ims.scheduling.vo.Profile_Exc_DateVoCollection createProfile_Exc_DateVoCollectionFromProfile_Exc_Date(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.scheduling.vo.Profile_Exc_DateVoCollection voList = new ims.scheduling.vo.Profile_Exc_DateVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.scheduling.domain.objects.Profile_Exc_Date domainObject = (ims.scheduling.domain.objects.Profile_Exc_Date) iterator.next();
			ims.scheduling.vo.Profile_Exc_DateVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.scheduling.domain.objects.Profile_Exc_Date objects.
	 */
	public static ims.scheduling.vo.Profile_Exc_DateVoCollection createProfile_Exc_DateVoCollectionFromProfile_Exc_Date(java.util.List domainObjectList) 
	{
		return createProfile_Exc_DateVoCollectionFromProfile_Exc_Date(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.scheduling.domain.objects.Profile_Exc_Date objects.
	 */
	public static ims.scheduling.vo.Profile_Exc_DateVoCollection createProfile_Exc_DateVoCollectionFromProfile_Exc_Date(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.scheduling.vo.Profile_Exc_DateVoCollection voList = new ims.scheduling.vo.Profile_Exc_DateVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.scheduling.domain.objects.Profile_Exc_Date domainObject = (ims.scheduling.domain.objects.Profile_Exc_Date) domainObjectList.get(i);
			ims.scheduling.vo.Profile_Exc_DateVo vo = create(map, domainObject);

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
	 * Create the ims.scheduling.domain.objects.Profile_Exc_Date set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractProfile_Exc_DateSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.Profile_Exc_DateVoCollection voCollection) 
	 {
	 	return extractProfile_Exc_DateSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractProfile_Exc_DateSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.Profile_Exc_DateVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.Profile_Exc_DateVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.Profile_Exc_Date domainObject = Profile_Exc_DateVoAssembler.extractProfile_Exc_Date(domainFactory, vo, domMap);

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
	 * Create the ims.scheduling.domain.objects.Profile_Exc_Date list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractProfile_Exc_DateList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.Profile_Exc_DateVoCollection voCollection) 
	 {
	 	return extractProfile_Exc_DateList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractProfile_Exc_DateList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.Profile_Exc_DateVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.Profile_Exc_DateVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.Profile_Exc_Date domainObject = Profile_Exc_DateVoAssembler.extractProfile_Exc_Date(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.scheduling.domain.objects.Profile_Exc_Date object.
	 * @param domainObject ims.scheduling.domain.objects.Profile_Exc_Date
	 */
	 public static ims.scheduling.vo.Profile_Exc_DateVo create(ims.scheduling.domain.objects.Profile_Exc_Date domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.scheduling.domain.objects.Profile_Exc_Date object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.scheduling.vo.Profile_Exc_DateVo create(DomainObjectMap map, ims.scheduling.domain.objects.Profile_Exc_Date domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.scheduling.vo.Profile_Exc_DateVo valueObject = (ims.scheduling.vo.Profile_Exc_DateVo) map.getValueObject(domainObject, ims.scheduling.vo.Profile_Exc_DateVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.scheduling.vo.Profile_Exc_DateVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.scheduling.domain.objects.Profile_Exc_Date
	 */
	 public static ims.scheduling.vo.Profile_Exc_DateVo insert(ims.scheduling.vo.Profile_Exc_DateVo valueObject, ims.scheduling.domain.objects.Profile_Exc_Date domainObject) 
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
	 * @param domainObject ims.scheduling.domain.objects.Profile_Exc_Date
	 */
	 public static ims.scheduling.vo.Profile_Exc_DateVo insert(DomainObjectMap map, ims.scheduling.vo.Profile_Exc_DateVo valueObject, ims.scheduling.domain.objects.Profile_Exc_Date domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Profile_Exc_Date(domainObject.getId());
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
			
		// StartDate
		java.util.Date StartDate = domainObject.getStartDate();
		if ( null != StartDate ) 
		{
			valueObject.setStartDate(new ims.framework.utils.Date(StartDate) );
		}
		// EndDate
		java.util.Date EndDate = domainObject.getEndDate();
		if ( null != EndDate ) 
		{
			valueObject.setEndDate(new ims.framework.utils.Date(EndDate) );
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.scheduling.domain.objects.Profile_Exc_Date extractProfile_Exc_Date(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.Profile_Exc_DateVo valueObject) 
	{
		return 	extractProfile_Exc_Date(domainFactory, valueObject, new HashMap());
	}

	public static ims.scheduling.domain.objects.Profile_Exc_Date extractProfile_Exc_Date(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.Profile_Exc_DateVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Profile_Exc_Date();
		ims.scheduling.domain.objects.Profile_Exc_Date domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.scheduling.domain.objects.Profile_Exc_Date)domMap.get(valueObject);
			}
			// ims.scheduling.vo.Profile_Exc_DateVo ID_Profile_Exc_Date field is unknown
			domainObject = new ims.scheduling.domain.objects.Profile_Exc_Date();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Profile_Exc_Date());
			if (domMap.get(key) != null)
			{
				return (ims.scheduling.domain.objects.Profile_Exc_Date)domMap.get(key);
			}
			domainObject = (ims.scheduling.domain.objects.Profile_Exc_Date) domainFactory.getDomainObject(ims.scheduling.domain.objects.Profile_Exc_Date.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Profile_Exc_Date());

		java.util.Date value1 = null;
		ims.framework.utils.Date date1 = valueObject.getStartDate();		
		if ( date1 != null ) 
		{
			value1 = date1.getDate();
		}
		domainObject.setStartDate(value1);
		java.util.Date value2 = null;
		ims.framework.utils.Date date2 = valueObject.getEndDate();		
		if ( date2 != null ) 
		{
			value2 = date2.getDate();
		}
		domainObject.setEndDate(value2);

		return domainObject;
	}

}
