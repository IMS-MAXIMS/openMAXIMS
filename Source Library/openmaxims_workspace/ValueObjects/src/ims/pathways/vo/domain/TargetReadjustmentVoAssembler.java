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
package ims.pathways.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Catalin Tomozei
 */
public class TargetReadjustmentVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.pathways.vo.TargetReadjustmentVo copy(ims.pathways.vo.TargetReadjustmentVo valueObjectDest, ims.pathways.vo.TargetReadjustmentVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_TargetReadjustment(valueObjectSrc.getID_TargetReadjustment());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// NoOfDays
		valueObjectDest.setNoOfDays(valueObjectSrc.getNoOfDays());
		// Reason
		valueObjectDest.setReason(valueObjectSrc.getReason());
		// SystemInformation
		valueObjectDest.setSystemInformation(valueObjectSrc.getSystemInformation());
		// TargetReadjustment
		valueObjectDest.setTargetReadjustment(valueObjectSrc.getTargetReadjustment());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createTargetReadjustmentVoCollectionFromTargetReadjustment(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.pathways.domain.objects.TargetReadjustment objects.
	 */
	public static ims.pathways.vo.TargetReadjustmentVoCollection createTargetReadjustmentVoCollectionFromTargetReadjustment(java.util.Set domainObjectSet)	
	{
		return createTargetReadjustmentVoCollectionFromTargetReadjustment(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.pathways.domain.objects.TargetReadjustment objects.
	 */
	public static ims.pathways.vo.TargetReadjustmentVoCollection createTargetReadjustmentVoCollectionFromTargetReadjustment(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.pathways.vo.TargetReadjustmentVoCollection voList = new ims.pathways.vo.TargetReadjustmentVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.pathways.domain.objects.TargetReadjustment domainObject = (ims.pathways.domain.objects.TargetReadjustment) iterator.next();
			ims.pathways.vo.TargetReadjustmentVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.pathways.domain.objects.TargetReadjustment objects.
	 */
	public static ims.pathways.vo.TargetReadjustmentVoCollection createTargetReadjustmentVoCollectionFromTargetReadjustment(java.util.List domainObjectList) 
	{
		return createTargetReadjustmentVoCollectionFromTargetReadjustment(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.pathways.domain.objects.TargetReadjustment objects.
	 */
	public static ims.pathways.vo.TargetReadjustmentVoCollection createTargetReadjustmentVoCollectionFromTargetReadjustment(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.pathways.vo.TargetReadjustmentVoCollection voList = new ims.pathways.vo.TargetReadjustmentVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.pathways.domain.objects.TargetReadjustment domainObject = (ims.pathways.domain.objects.TargetReadjustment) domainObjectList.get(i);
			ims.pathways.vo.TargetReadjustmentVo vo = create(map, domainObject);

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
	 * Create the ims.pathways.domain.objects.TargetReadjustment set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractTargetReadjustmentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.TargetReadjustmentVoCollection voCollection) 
	 {
	 	return extractTargetReadjustmentSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractTargetReadjustmentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.TargetReadjustmentVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.pathways.vo.TargetReadjustmentVo vo = voCollection.get(i);
			ims.pathways.domain.objects.TargetReadjustment domainObject = TargetReadjustmentVoAssembler.extractTargetReadjustment(domainFactory, vo, domMap);

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
	 * Create the ims.pathways.domain.objects.TargetReadjustment list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractTargetReadjustmentList(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.TargetReadjustmentVoCollection voCollection) 
	 {
	 	return extractTargetReadjustmentList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractTargetReadjustmentList(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.TargetReadjustmentVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.pathways.vo.TargetReadjustmentVo vo = voCollection.get(i);
			ims.pathways.domain.objects.TargetReadjustment domainObject = TargetReadjustmentVoAssembler.extractTargetReadjustment(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.pathways.domain.objects.TargetReadjustment object.
	 * @param domainObject ims.pathways.domain.objects.TargetReadjustment
	 */
	 public static ims.pathways.vo.TargetReadjustmentVo create(ims.pathways.domain.objects.TargetReadjustment domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.pathways.domain.objects.TargetReadjustment object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.pathways.vo.TargetReadjustmentVo create(DomainObjectMap map, ims.pathways.domain.objects.TargetReadjustment domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.pathways.vo.TargetReadjustmentVo valueObject = (ims.pathways.vo.TargetReadjustmentVo) map.getValueObject(domainObject, ims.pathways.vo.TargetReadjustmentVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.pathways.vo.TargetReadjustmentVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.pathways.domain.objects.TargetReadjustment
	 */
	 public static ims.pathways.vo.TargetReadjustmentVo insert(ims.pathways.vo.TargetReadjustmentVo valueObject, ims.pathways.domain.objects.TargetReadjustment domainObject) 
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
	 * @param domainObject ims.pathways.domain.objects.TargetReadjustment
	 */
	 public static ims.pathways.vo.TargetReadjustmentVo insert(DomainObjectMap map, ims.pathways.vo.TargetReadjustmentVo valueObject, ims.pathways.domain.objects.TargetReadjustment domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_TargetReadjustment(domainObject.getId());
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
			
		// NoOfDays
		valueObject.setNoOfDays(domainObject.getNoOfDays());
		// Reason
		valueObject.setReason(domainObject.getReason());
		// SystemInformation
		// set system information
		valueObject.setSystemInformation(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
		// TargetReadjustment
		ims.domain.lookups.LookupInstance instance4 = domainObject.getTargetReadjustment();
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

			ims.pathways.vo.lookups.TargetReadjustment voLookup4 = new ims.pathways.vo.lookups.TargetReadjustment(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.pathways.vo.lookups.TargetReadjustment parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.pathways.vo.lookups.TargetReadjustment(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setTargetReadjustment(voLookup4);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.pathways.domain.objects.TargetReadjustment extractTargetReadjustment(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.TargetReadjustmentVo valueObject) 
	{
		return 	extractTargetReadjustment(domainFactory, valueObject, new HashMap());
	}

	public static ims.pathways.domain.objects.TargetReadjustment extractTargetReadjustment(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.TargetReadjustmentVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_TargetReadjustment();
		ims.pathways.domain.objects.TargetReadjustment domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.pathways.domain.objects.TargetReadjustment)domMap.get(valueObject);
			}
			// ims.pathways.vo.TargetReadjustmentVo ID_TargetReadjustment field is unknown
			domainObject = new ims.pathways.domain.objects.TargetReadjustment();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_TargetReadjustment());
			if (domMap.get(key) != null)
			{
				return (ims.pathways.domain.objects.TargetReadjustment)domMap.get(key);
			}
			domainObject = (ims.pathways.domain.objects.TargetReadjustment) domainFactory.getDomainObject(ims.pathways.domain.objects.TargetReadjustment.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_TargetReadjustment());

		domainObject.setNoOfDays(valueObject.getNoOfDays());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getReason() != null && valueObject.getReason().equals(""))
		{
			valueObject.setReason(null);
		}
		domainObject.setReason(valueObject.getReason());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getTargetReadjustment() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getTargetReadjustment().getID());
		}
		domainObject.setTargetReadjustment(value4);

		return domainObject;
	}

}
