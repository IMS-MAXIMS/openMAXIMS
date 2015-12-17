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
 * @author Daniel Laffan
 */
public class BedSpaceStateStatusLiteVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.BedSpaceStateStatusLiteVo copy(ims.core.vo.BedSpaceStateStatusLiteVo valueObjectDest, ims.core.vo.BedSpaceStateStatusLiteVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_BedSpaceStateStatus(valueObjectSrc.getID_BedSpaceStateStatus());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// BedStatus
		valueObjectDest.setBedStatus(valueObjectSrc.getBedStatus());
		// StatusDateTime
		valueObjectDest.setStatusDateTime(valueObjectSrc.getStatusDateTime());
		// SysInfo
		valueObjectDest.setSysInfo(valueObjectSrc.getSysInfo());
		// ReasonForClosure
		valueObjectDest.setReasonForClosure(valueObjectSrc.getReasonForClosure());
		// EstReopeningDateTime
		valueObjectDest.setEstReopeningDateTime(valueObjectSrc.getEstReopeningDateTime());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createBedSpaceStateStatusLiteVoCollectionFromBedSpaceStateStatus(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.BedSpaceStateStatus objects.
	 */
	public static ims.core.vo.BedSpaceStateStatusLiteVoCollection createBedSpaceStateStatusLiteVoCollectionFromBedSpaceStateStatus(java.util.Set domainObjectSet)	
	{
		return createBedSpaceStateStatusLiteVoCollectionFromBedSpaceStateStatus(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.BedSpaceStateStatus objects.
	 */
	public static ims.core.vo.BedSpaceStateStatusLiteVoCollection createBedSpaceStateStatusLiteVoCollectionFromBedSpaceStateStatus(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.BedSpaceStateStatusLiteVoCollection voList = new ims.core.vo.BedSpaceStateStatusLiteVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.pas.domain.objects.BedSpaceStateStatus domainObject = (ims.core.admin.pas.domain.objects.BedSpaceStateStatus) iterator.next();
			ims.core.vo.BedSpaceStateStatusLiteVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.BedSpaceStateStatus objects.
	 */
	public static ims.core.vo.BedSpaceStateStatusLiteVoCollection createBedSpaceStateStatusLiteVoCollectionFromBedSpaceStateStatus(java.util.List domainObjectList) 
	{
		return createBedSpaceStateStatusLiteVoCollectionFromBedSpaceStateStatus(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.BedSpaceStateStatus objects.
	 */
	public static ims.core.vo.BedSpaceStateStatusLiteVoCollection createBedSpaceStateStatusLiteVoCollectionFromBedSpaceStateStatus(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.BedSpaceStateStatusLiteVoCollection voList = new ims.core.vo.BedSpaceStateStatusLiteVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.pas.domain.objects.BedSpaceStateStatus domainObject = (ims.core.admin.pas.domain.objects.BedSpaceStateStatus) domainObjectList.get(i);
			ims.core.vo.BedSpaceStateStatusLiteVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.pas.domain.objects.BedSpaceStateStatus set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractBedSpaceStateStatusSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.BedSpaceStateStatusLiteVoCollection voCollection) 
	 {
	 	return extractBedSpaceStateStatusSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractBedSpaceStateStatusSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.BedSpaceStateStatusLiteVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.BedSpaceStateStatusLiteVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.BedSpaceStateStatus domainObject = BedSpaceStateStatusLiteVoAssembler.extractBedSpaceStateStatus(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.pas.domain.objects.BedSpaceStateStatus list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractBedSpaceStateStatusList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.BedSpaceStateStatusLiteVoCollection voCollection) 
	 {
	 	return extractBedSpaceStateStatusList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractBedSpaceStateStatusList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.BedSpaceStateStatusLiteVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.BedSpaceStateStatusLiteVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.BedSpaceStateStatus domainObject = BedSpaceStateStatusLiteVoAssembler.extractBedSpaceStateStatus(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.pas.domain.objects.BedSpaceStateStatus object.
	 * @param domainObject ims.core.admin.pas.domain.objects.BedSpaceStateStatus
	 */
	 public static ims.core.vo.BedSpaceStateStatusLiteVo create(ims.core.admin.pas.domain.objects.BedSpaceStateStatus domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.pas.domain.objects.BedSpaceStateStatus object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.BedSpaceStateStatusLiteVo create(DomainObjectMap map, ims.core.admin.pas.domain.objects.BedSpaceStateStatus domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.BedSpaceStateStatusLiteVo valueObject = (ims.core.vo.BedSpaceStateStatusLiteVo) map.getValueObject(domainObject, ims.core.vo.BedSpaceStateStatusLiteVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.BedSpaceStateStatusLiteVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.pas.domain.objects.BedSpaceStateStatus
	 */
	 public static ims.core.vo.BedSpaceStateStatusLiteVo insert(ims.core.vo.BedSpaceStateStatusLiteVo valueObject, ims.core.admin.pas.domain.objects.BedSpaceStateStatus domainObject) 
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
	 * @param domainObject ims.core.admin.pas.domain.objects.BedSpaceStateStatus
	 */
	 public static ims.core.vo.BedSpaceStateStatusLiteVo insert(DomainObjectMap map, ims.core.vo.BedSpaceStateStatusLiteVo valueObject, ims.core.admin.pas.domain.objects.BedSpaceStateStatus domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_BedSpaceStateStatus(domainObject.getId());
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
			
		// BedStatus
		ims.domain.lookups.LookupInstance instance1 = domainObject.getBedStatus();
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

			ims.core.vo.lookups.BedStatus voLookup1 = new ims.core.vo.lookups.BedStatus(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.core.vo.lookups.BedStatus parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.core.vo.lookups.BedStatus(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setBedStatus(voLookup1);
		}
				// StatusDateTime
		java.util.Date StatusDateTime = domainObject.getStatusDateTime();
		if ( null != StatusDateTime ) 
		{
			valueObject.setStatusDateTime(new ims.framework.utils.DateTime(StatusDateTime) );
		}
		// SysInfo
		// set system information
		valueObject.setSysInfo(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
		// ReasonForClosure
		ims.domain.lookups.LookupInstance instance4 = domainObject.getReasonForClosure();
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

			ims.core.vo.lookups.ReasonForBedClosure voLookup4 = new ims.core.vo.lookups.ReasonForBedClosure(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.ReasonForBedClosure parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.core.vo.lookups.ReasonForBedClosure(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setReasonForClosure(voLookup4);
		}
				// EstReopeningDateTime
		java.util.Date EstReopeningDateTime = domainObject.getEstReopeningDateTime();
		if ( null != EstReopeningDateTime ) 
		{
			valueObject.setEstReopeningDateTime(new ims.framework.utils.DateTime(EstReopeningDateTime) );
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.pas.domain.objects.BedSpaceStateStatus extractBedSpaceStateStatus(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.BedSpaceStateStatusLiteVo valueObject) 
	{
		return 	extractBedSpaceStateStatus(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.pas.domain.objects.BedSpaceStateStatus extractBedSpaceStateStatus(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.BedSpaceStateStatusLiteVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_BedSpaceStateStatus();
		ims.core.admin.pas.domain.objects.BedSpaceStateStatus domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.pas.domain.objects.BedSpaceStateStatus)domMap.get(valueObject);
			}
			// ims.core.vo.BedSpaceStateStatusLiteVo ID_BedSpaceStateStatus field is unknown
			domainObject = new ims.core.admin.pas.domain.objects.BedSpaceStateStatus();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_BedSpaceStateStatus());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.pas.domain.objects.BedSpaceStateStatus)domMap.get(key);
			}
			domainObject = (ims.core.admin.pas.domain.objects.BedSpaceStateStatus) domainFactory.getDomainObject(ims.core.admin.pas.domain.objects.BedSpaceStateStatus.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_BedSpaceStateStatus());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getBedStatus() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getBedStatus().getID());
		}
		domainObject.setBedStatus(value1);
		ims.framework.utils.DateTime dateTime2 = valueObject.getStatusDateTime();
		java.util.Date value2 = null;
		if ( dateTime2 != null ) 
		{
			value2 = dateTime2.getJavaDate();
		}
		domainObject.setStatusDateTime(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getReasonForClosure() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getReasonForClosure().getID());
		}
		domainObject.setReasonForClosure(value4);
		ims.framework.utils.DateTime dateTime5 = valueObject.getEstReopeningDateTime();
		java.util.Date value5 = null;
		if ( dateTime5 != null ) 
		{
			value5 = dateTime5.getJavaDate();
		}
		domainObject.setEstReopeningDateTime(value5);

		return domainObject;
	}

}
