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
package ims.ccosched.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Sean Nesbitt
 */
public class PatActionStatusPointVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.ccosched.vo.PatActionStatusPointVo copy(ims.ccosched.vo.PatActionStatusPointVo valueObjectDest, ims.ccosched.vo.PatActionStatusPointVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatActionStatusPoint(valueObjectSrc.getID_PatActionStatusPoint());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ActionStatusReason
		valueObjectDest.setActionStatusReason(valueObjectSrc.getActionStatusReason());
		// spEndDate
		valueObjectDest.setSpEndDate(valueObjectSrc.getSpEndDate());
		// spStartDate
		valueObjectDest.setSpStartDate(valueObjectSrc.getSpStartDate());
		// ActionStatus
		valueObjectDest.setActionStatus(valueObjectSrc.getActionStatus());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatActionStatusPointVoCollectionFromPatActionStatusPoint(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.oncology.domain.objects.PatActionStatusPoint objects.
	 */
	public static ims.ccosched.vo.PatActionStatusPointVoCollection createPatActionStatusPointVoCollectionFromPatActionStatusPoint(java.util.Set domainObjectSet)	
	{
		return createPatActionStatusPointVoCollectionFromPatActionStatusPoint(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.oncology.domain.objects.PatActionStatusPoint objects.
	 */
	public static ims.ccosched.vo.PatActionStatusPointVoCollection createPatActionStatusPointVoCollectionFromPatActionStatusPoint(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.ccosched.vo.PatActionStatusPointVoCollection voList = new ims.ccosched.vo.PatActionStatusPointVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.oncology.domain.objects.PatActionStatusPoint domainObject = (ims.oncology.domain.objects.PatActionStatusPoint) iterator.next();
			ims.ccosched.vo.PatActionStatusPointVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.oncology.domain.objects.PatActionStatusPoint objects.
	 */
	public static ims.ccosched.vo.PatActionStatusPointVoCollection createPatActionStatusPointVoCollectionFromPatActionStatusPoint(java.util.List domainObjectList) 
	{
		return createPatActionStatusPointVoCollectionFromPatActionStatusPoint(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.oncology.domain.objects.PatActionStatusPoint objects.
	 */
	public static ims.ccosched.vo.PatActionStatusPointVoCollection createPatActionStatusPointVoCollectionFromPatActionStatusPoint(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.ccosched.vo.PatActionStatusPointVoCollection voList = new ims.ccosched.vo.PatActionStatusPointVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.oncology.domain.objects.PatActionStatusPoint domainObject = (ims.oncology.domain.objects.PatActionStatusPoint) domainObjectList.get(i);
			ims.ccosched.vo.PatActionStatusPointVo vo = create(map, domainObject);

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
	 * Create the ims.oncology.domain.objects.PatActionStatusPoint set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatActionStatusPointSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ccosched.vo.PatActionStatusPointVoCollection voCollection) 
	 {
	 	return extractPatActionStatusPointSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatActionStatusPointSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ccosched.vo.PatActionStatusPointVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.ccosched.vo.PatActionStatusPointVo vo = voCollection.get(i);
			ims.oncology.domain.objects.PatActionStatusPoint domainObject = PatActionStatusPointVoAssembler.extractPatActionStatusPoint(domainFactory, vo, domMap);

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
	 * Create the ims.oncology.domain.objects.PatActionStatusPoint list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatActionStatusPointList(ims.domain.ILightweightDomainFactory domainFactory, ims.ccosched.vo.PatActionStatusPointVoCollection voCollection) 
	 {
	 	return extractPatActionStatusPointList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatActionStatusPointList(ims.domain.ILightweightDomainFactory domainFactory, ims.ccosched.vo.PatActionStatusPointVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.ccosched.vo.PatActionStatusPointVo vo = voCollection.get(i);
			ims.oncology.domain.objects.PatActionStatusPoint domainObject = PatActionStatusPointVoAssembler.extractPatActionStatusPoint(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.oncology.domain.objects.PatActionStatusPoint object.
	 * @param domainObject ims.oncology.domain.objects.PatActionStatusPoint
	 */
	 public static ims.ccosched.vo.PatActionStatusPointVo create(ims.oncology.domain.objects.PatActionStatusPoint domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.oncology.domain.objects.PatActionStatusPoint object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.ccosched.vo.PatActionStatusPointVo create(DomainObjectMap map, ims.oncology.domain.objects.PatActionStatusPoint domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.ccosched.vo.PatActionStatusPointVo valueObject = (ims.ccosched.vo.PatActionStatusPointVo) map.getValueObject(domainObject, ims.ccosched.vo.PatActionStatusPointVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.ccosched.vo.PatActionStatusPointVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.oncology.domain.objects.PatActionStatusPoint
	 */
	 public static ims.ccosched.vo.PatActionStatusPointVo insert(ims.ccosched.vo.PatActionStatusPointVo valueObject, ims.oncology.domain.objects.PatActionStatusPoint domainObject) 
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
	 * @param domainObject ims.oncology.domain.objects.PatActionStatusPoint
	 */
	 public static ims.ccosched.vo.PatActionStatusPointVo insert(DomainObjectMap map, ims.ccosched.vo.PatActionStatusPointVo valueObject, ims.oncology.domain.objects.PatActionStatusPoint domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatActionStatusPoint(domainObject.getId());
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
			
		// ActionStatusReason
		ims.domain.lookups.LookupInstance instance1 = domainObject.getActionStatusReason();
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

			ims.ccosched.vo.lookups.ActionStatusReason voLookup1 = new ims.ccosched.vo.lookups.ActionStatusReason(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.ccosched.vo.lookups.ActionStatusReason parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.ccosched.vo.lookups.ActionStatusReason(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setActionStatusReason(voLookup1);
		}
				// spEndDate
		java.util.Date spEndDate = domainObject.getSpEndDate();
		if ( null != spEndDate ) 
		{
			valueObject.setSpEndDate(new ims.framework.utils.Date(spEndDate) );
		}
		// spStartDate
		java.util.Date spStartDate = domainObject.getSpStartDate();
		if ( null != spStartDate ) 
		{
			valueObject.setSpStartDate(new ims.framework.utils.Date(spStartDate) );
		}
		// ActionStatus
		ims.domain.lookups.LookupInstance instance4 = domainObject.getActionStatus();
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

			ims.ccosched.vo.lookups.ActionStatusReason voLookup4 = new ims.ccosched.vo.lookups.ActionStatusReason(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.ccosched.vo.lookups.ActionStatusReason parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.ccosched.vo.lookups.ActionStatusReason(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setActionStatus(voLookup4);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.oncology.domain.objects.PatActionStatusPoint extractPatActionStatusPoint(ims.domain.ILightweightDomainFactory domainFactory, ims.ccosched.vo.PatActionStatusPointVo valueObject) 
	{
		return 	extractPatActionStatusPoint(domainFactory, valueObject, new HashMap());
	}

	public static ims.oncology.domain.objects.PatActionStatusPoint extractPatActionStatusPoint(ims.domain.ILightweightDomainFactory domainFactory, ims.ccosched.vo.PatActionStatusPointVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatActionStatusPoint();
		ims.oncology.domain.objects.PatActionStatusPoint domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.oncology.domain.objects.PatActionStatusPoint)domMap.get(valueObject);
			}
			// ims.ccosched.vo.PatActionStatusPointVo ID_PatActionStatusPoint field is unknown
			domainObject = new ims.oncology.domain.objects.PatActionStatusPoint();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatActionStatusPoint());
			if (domMap.get(key) != null)
			{
				return (ims.oncology.domain.objects.PatActionStatusPoint)domMap.get(key);
			}
			domainObject = (ims.oncology.domain.objects.PatActionStatusPoint) domainFactory.getDomainObject(ims.oncology.domain.objects.PatActionStatusPoint.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatActionStatusPoint());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getActionStatusReason() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getActionStatusReason().getID());
		}
		domainObject.setActionStatusReason(value1);
		java.util.Date value2 = null;
		ims.framework.utils.Date date2 = valueObject.getSpEndDate();		
		if ( date2 != null ) 
		{
			value2 = date2.getDate();
		}
		domainObject.setSpEndDate(value2);
		java.util.Date value3 = null;
		ims.framework.utils.Date date3 = valueObject.getSpStartDate();		
		if ( date3 != null ) 
		{
			value3 = date3.getDate();
		}
		domainObject.setSpStartDate(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getActionStatus() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getActionStatus().getID());
		}
		domainObject.setActionStatus(value4);

		return domainObject;
	}

}
