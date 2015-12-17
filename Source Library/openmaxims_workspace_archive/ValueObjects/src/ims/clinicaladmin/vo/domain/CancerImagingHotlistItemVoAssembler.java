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
package ims.clinicaladmin.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Margaret Mc Carthy
 */
public class CancerImagingHotlistItemVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinicaladmin.vo.CancerImagingHotlistItemVo copy(ims.clinicaladmin.vo.CancerImagingHotlistItemVo valueObjectDest, ims.clinicaladmin.vo.CancerImagingHotlistItemVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_CancerImagingHotlistItem(valueObjectSrc.getID_CancerImagingHotlistItem());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CancerImagingEvent
		valueObjectDest.setCancerImagingEvent(valueObjectSrc.getCancerImagingEvent());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createCancerImagingHotlistItemVoCollectionFromCancerImagingHotlistItem(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.clinical.configuration.domain.objects.CancerImagingHotlistItem objects.
	 */
	public static ims.clinicaladmin.vo.CancerImagingHotlistItemVoCollection createCancerImagingHotlistItemVoCollectionFromCancerImagingHotlistItem(java.util.Set domainObjectSet)	
	{
		return createCancerImagingHotlistItemVoCollectionFromCancerImagingHotlistItem(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.clinical.configuration.domain.objects.CancerImagingHotlistItem objects.
	 */
	public static ims.clinicaladmin.vo.CancerImagingHotlistItemVoCollection createCancerImagingHotlistItemVoCollectionFromCancerImagingHotlistItem(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinicaladmin.vo.CancerImagingHotlistItemVoCollection voList = new ims.clinicaladmin.vo.CancerImagingHotlistItemVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.clinical.configuration.domain.objects.CancerImagingHotlistItem domainObject = (ims.clinical.configuration.domain.objects.CancerImagingHotlistItem) iterator.next();
			ims.clinicaladmin.vo.CancerImagingHotlistItemVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.clinical.configuration.domain.objects.CancerImagingHotlistItem objects.
	 */
	public static ims.clinicaladmin.vo.CancerImagingHotlistItemVoCollection createCancerImagingHotlistItemVoCollectionFromCancerImagingHotlistItem(java.util.List domainObjectList) 
	{
		return createCancerImagingHotlistItemVoCollectionFromCancerImagingHotlistItem(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.clinical.configuration.domain.objects.CancerImagingHotlistItem objects.
	 */
	public static ims.clinicaladmin.vo.CancerImagingHotlistItemVoCollection createCancerImagingHotlistItemVoCollectionFromCancerImagingHotlistItem(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinicaladmin.vo.CancerImagingHotlistItemVoCollection voList = new ims.clinicaladmin.vo.CancerImagingHotlistItemVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.clinical.configuration.domain.objects.CancerImagingHotlistItem domainObject = (ims.clinical.configuration.domain.objects.CancerImagingHotlistItem) domainObjectList.get(i);
			ims.clinicaladmin.vo.CancerImagingHotlistItemVo vo = create(map, domainObject);

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
	 * Create the ims.clinical.configuration.domain.objects.CancerImagingHotlistItem set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractCancerImagingHotlistItemSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.CancerImagingHotlistItemVoCollection voCollection) 
	 {
	 	return extractCancerImagingHotlistItemSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractCancerImagingHotlistItemSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.CancerImagingHotlistItemVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinicaladmin.vo.CancerImagingHotlistItemVo vo = voCollection.get(i);
			ims.clinical.configuration.domain.objects.CancerImagingHotlistItem domainObject = CancerImagingHotlistItemVoAssembler.extractCancerImagingHotlistItem(domainFactory, vo, domMap);

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
	 * Create the ims.clinical.configuration.domain.objects.CancerImagingHotlistItem list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractCancerImagingHotlistItemList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.CancerImagingHotlistItemVoCollection voCollection) 
	 {
	 	return extractCancerImagingHotlistItemList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractCancerImagingHotlistItemList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.CancerImagingHotlistItemVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinicaladmin.vo.CancerImagingHotlistItemVo vo = voCollection.get(i);
			ims.clinical.configuration.domain.objects.CancerImagingHotlistItem domainObject = CancerImagingHotlistItemVoAssembler.extractCancerImagingHotlistItem(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.clinical.configuration.domain.objects.CancerImagingHotlistItem object.
	 * @param domainObject ims.clinical.configuration.domain.objects.CancerImagingHotlistItem
	 */
	 public static ims.clinicaladmin.vo.CancerImagingHotlistItemVo create(ims.clinical.configuration.domain.objects.CancerImagingHotlistItem domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.clinical.configuration.domain.objects.CancerImagingHotlistItem object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinicaladmin.vo.CancerImagingHotlistItemVo create(DomainObjectMap map, ims.clinical.configuration.domain.objects.CancerImagingHotlistItem domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinicaladmin.vo.CancerImagingHotlistItemVo valueObject = (ims.clinicaladmin.vo.CancerImagingHotlistItemVo) map.getValueObject(domainObject, ims.clinicaladmin.vo.CancerImagingHotlistItemVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinicaladmin.vo.CancerImagingHotlistItemVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.clinical.configuration.domain.objects.CancerImagingHotlistItem
	 */
	 public static ims.clinicaladmin.vo.CancerImagingHotlistItemVo insert(ims.clinicaladmin.vo.CancerImagingHotlistItemVo valueObject, ims.clinical.configuration.domain.objects.CancerImagingHotlistItem domainObject) 
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
	 * @param domainObject ims.clinical.configuration.domain.objects.CancerImagingHotlistItem
	 */
	 public static ims.clinicaladmin.vo.CancerImagingHotlistItemVo insert(DomainObjectMap map, ims.clinicaladmin.vo.CancerImagingHotlistItemVo valueObject, ims.clinical.configuration.domain.objects.CancerImagingHotlistItem domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_CancerImagingHotlistItem(domainObject.getId());
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
			
		// CancerImagingEvent
		valueObject.setCancerImagingEvent(ims.core.vo.domain.CancerImagingEventLiteVoAssembler.create(map, domainObject.getCancerImagingEvent()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.clinical.configuration.domain.objects.CancerImagingHotlistItem extractCancerImagingHotlistItem(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.CancerImagingHotlistItemVo valueObject) 
	{
		return 	extractCancerImagingHotlistItem(domainFactory, valueObject, new HashMap());
	}

	public static ims.clinical.configuration.domain.objects.CancerImagingHotlistItem extractCancerImagingHotlistItem(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.CancerImagingHotlistItemVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_CancerImagingHotlistItem();
		ims.clinical.configuration.domain.objects.CancerImagingHotlistItem domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.clinical.configuration.domain.objects.CancerImagingHotlistItem)domMap.get(valueObject);
			}
			// ims.clinicaladmin.vo.CancerImagingHotlistItemVo ID_CancerImagingHotlistItem field is unknown
			domainObject = new ims.clinical.configuration.domain.objects.CancerImagingHotlistItem();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_CancerImagingHotlistItem());
			if (domMap.get(key) != null)
			{
				return (ims.clinical.configuration.domain.objects.CancerImagingHotlistItem)domMap.get(key);
			}
			domainObject = (ims.clinical.configuration.domain.objects.CancerImagingHotlistItem) domainFactory.getDomainObject(ims.clinical.configuration.domain.objects.CancerImagingHotlistItem.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_CancerImagingHotlistItem());

		domainObject.setCancerImagingEvent(ims.core.vo.domain.CancerImagingEventLiteVoAssembler.extractCancerImagingEvent(domainFactory, valueObject.getCancerImagingEvent(), domMap));

		return domainObject;
	}

}
