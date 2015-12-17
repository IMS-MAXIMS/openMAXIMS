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
package ims.ntpf.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Rory Fitzpatrick
 */
public class LoCallWaitingListDetailsLiteVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.ntpf.vo.LoCallWaitingListDetailsLiteVo copy(ims.ntpf.vo.LoCallWaitingListDetailsLiteVo valueObjectDest, ims.ntpf.vo.LoCallWaitingListDetailsLiteVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_LoCallWaitingListDetails(valueObjectSrc.getID_LoCallWaitingListDetails());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// StatusHistory
		valueObjectDest.setStatusHistory(valueObjectSrc.getStatusHistory());
		// CurrentStatus
		valueObjectDest.setCurrentStatus(valueObjectSrc.getCurrentStatus());
		// CurrentStatusReason
		valueObjectDest.setCurrentStatusReason(valueObjectSrc.getCurrentStatusReason());
		// Procedure
		valueObjectDest.setProcedure(valueObjectSrc.getProcedure());
		// ProcedureText
		valueObjectDest.setProcedureText(valueObjectSrc.getProcedureText());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createLoCallWaitingListDetailsLiteVoCollectionFromLoCallWaitingListDetails(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.ntpf.locall.domain.objects.LoCallWaitingListDetails objects.
	 */
	public static ims.ntpf.vo.LoCallWaitingListDetailsLiteVoCollection createLoCallWaitingListDetailsLiteVoCollectionFromLoCallWaitingListDetails(java.util.Set domainObjectSet)	
	{
		return createLoCallWaitingListDetailsLiteVoCollectionFromLoCallWaitingListDetails(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.ntpf.locall.domain.objects.LoCallWaitingListDetails objects.
	 */
	public static ims.ntpf.vo.LoCallWaitingListDetailsLiteVoCollection createLoCallWaitingListDetailsLiteVoCollectionFromLoCallWaitingListDetails(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.ntpf.vo.LoCallWaitingListDetailsLiteVoCollection voList = new ims.ntpf.vo.LoCallWaitingListDetailsLiteVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.ntpf.locall.domain.objects.LoCallWaitingListDetails domainObject = (ims.ntpf.locall.domain.objects.LoCallWaitingListDetails) iterator.next();
			ims.ntpf.vo.LoCallWaitingListDetailsLiteVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.ntpf.locall.domain.objects.LoCallWaitingListDetails objects.
	 */
	public static ims.ntpf.vo.LoCallWaitingListDetailsLiteVoCollection createLoCallWaitingListDetailsLiteVoCollectionFromLoCallWaitingListDetails(java.util.List domainObjectList) 
	{
		return createLoCallWaitingListDetailsLiteVoCollectionFromLoCallWaitingListDetails(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.ntpf.locall.domain.objects.LoCallWaitingListDetails objects.
	 */
	public static ims.ntpf.vo.LoCallWaitingListDetailsLiteVoCollection createLoCallWaitingListDetailsLiteVoCollectionFromLoCallWaitingListDetails(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.ntpf.vo.LoCallWaitingListDetailsLiteVoCollection voList = new ims.ntpf.vo.LoCallWaitingListDetailsLiteVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.ntpf.locall.domain.objects.LoCallWaitingListDetails domainObject = (ims.ntpf.locall.domain.objects.LoCallWaitingListDetails) domainObjectList.get(i);
			ims.ntpf.vo.LoCallWaitingListDetailsLiteVo vo = create(map, domainObject);

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
	 * Create the ims.ntpf.locall.domain.objects.LoCallWaitingListDetails set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractLoCallWaitingListDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ntpf.vo.LoCallWaitingListDetailsLiteVoCollection voCollection) 
	 {
	 	return extractLoCallWaitingListDetailsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractLoCallWaitingListDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ntpf.vo.LoCallWaitingListDetailsLiteVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.ntpf.vo.LoCallWaitingListDetailsLiteVo vo = voCollection.get(i);
			ims.ntpf.locall.domain.objects.LoCallWaitingListDetails domainObject = LoCallWaitingListDetailsLiteVoAssembler.extractLoCallWaitingListDetails(domainFactory, vo, domMap);

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
	 * Create the ims.ntpf.locall.domain.objects.LoCallWaitingListDetails list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractLoCallWaitingListDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.ntpf.vo.LoCallWaitingListDetailsLiteVoCollection voCollection) 
	 {
	 	return extractLoCallWaitingListDetailsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractLoCallWaitingListDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.ntpf.vo.LoCallWaitingListDetailsLiteVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.ntpf.vo.LoCallWaitingListDetailsLiteVo vo = voCollection.get(i);
			ims.ntpf.locall.domain.objects.LoCallWaitingListDetails domainObject = LoCallWaitingListDetailsLiteVoAssembler.extractLoCallWaitingListDetails(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.ntpf.locall.domain.objects.LoCallWaitingListDetails object.
	 * @param domainObject ims.ntpf.locall.domain.objects.LoCallWaitingListDetails
	 */
	 public static ims.ntpf.vo.LoCallWaitingListDetailsLiteVo create(ims.ntpf.locall.domain.objects.LoCallWaitingListDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.ntpf.locall.domain.objects.LoCallWaitingListDetails object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.ntpf.vo.LoCallWaitingListDetailsLiteVo create(DomainObjectMap map, ims.ntpf.locall.domain.objects.LoCallWaitingListDetails domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.ntpf.vo.LoCallWaitingListDetailsLiteVo valueObject = (ims.ntpf.vo.LoCallWaitingListDetailsLiteVo) map.getValueObject(domainObject, ims.ntpf.vo.LoCallWaitingListDetailsLiteVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.ntpf.vo.LoCallWaitingListDetailsLiteVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.ntpf.locall.domain.objects.LoCallWaitingListDetails
	 */
	 public static ims.ntpf.vo.LoCallWaitingListDetailsLiteVo insert(ims.ntpf.vo.LoCallWaitingListDetailsLiteVo valueObject, ims.ntpf.locall.domain.objects.LoCallWaitingListDetails domainObject) 
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
	 * @param domainObject ims.ntpf.locall.domain.objects.LoCallWaitingListDetails
	 */
	 public static ims.ntpf.vo.LoCallWaitingListDetailsLiteVo insert(DomainObjectMap map, ims.ntpf.vo.LoCallWaitingListDetailsLiteVo valueObject, ims.ntpf.locall.domain.objects.LoCallWaitingListDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_LoCallWaitingListDetails(domainObject.getId());
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
			
		// StatusHistory
		valueObject.setStatusHistory(ims.ntpf.vo.domain.LoCallStatusVoAssembler.createLoCallStatusVoCollectionFromLoCallStatus(map, domainObject.getStatusHistory()) );
		// CurrentStatus
		ims.domain.lookups.LookupInstance instance2 = domainObject.getCurrentStatus();
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

			ims.ntpf.vo.lookups.LoCallStatus voLookup2 = new ims.ntpf.vo.lookups.LoCallStatus(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.ntpf.vo.lookups.LoCallStatus parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.ntpf.vo.lookups.LoCallStatus(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setCurrentStatus(voLookup2);
		}
				// CurrentStatusReason
		ims.domain.lookups.LookupInstance instance3 = domainObject.getCurrentStatusReason();
		if ( null != instance3 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance3.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance3.getImage().getImageId(), instance3.getImage().getImagePath());
			}
			color = instance3.getColor();
			if (color != null) 
				color.getValue();

			ims.ntpf.vo.lookups.LoCallStatus voLookup3 = new ims.ntpf.vo.lookups.LoCallStatus(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.ntpf.vo.lookups.LoCallStatus parentVoLookup3 = voLookup3;
			ims.domain.lookups.LookupInstance parent3 = instance3.getParent();
			while (parent3 != null)
			{
				if (parent3.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent3.getImage().getImageId(), parent3.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent3.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup3.setParent(new ims.ntpf.vo.lookups.LoCallStatus(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setCurrentStatusReason(voLookup3);
		}
				// Procedure
		valueObject.setProcedure(ims.core.vo.domain.ActivityVoAssembler.create(map, domainObject.getProcedure()) );
		// ProcedureText
		valueObject.setProcedureText(domainObject.getProcedureText());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.ntpf.locall.domain.objects.LoCallWaitingListDetails extractLoCallWaitingListDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.ntpf.vo.LoCallWaitingListDetailsLiteVo valueObject) 
	{
		return 	extractLoCallWaitingListDetails(domainFactory, valueObject, new HashMap());
	}

	public static ims.ntpf.locall.domain.objects.LoCallWaitingListDetails extractLoCallWaitingListDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.ntpf.vo.LoCallWaitingListDetailsLiteVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_LoCallWaitingListDetails();
		ims.ntpf.locall.domain.objects.LoCallWaitingListDetails domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.ntpf.locall.domain.objects.LoCallWaitingListDetails)domMap.get(valueObject);
			}
			// ims.ntpf.vo.LoCallWaitingListDetailsLiteVo ID_LoCallWaitingListDetails field is unknown
			domainObject = new ims.ntpf.locall.domain.objects.LoCallWaitingListDetails();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_LoCallWaitingListDetails());
			if (domMap.get(key) != null)
			{
				return (ims.ntpf.locall.domain.objects.LoCallWaitingListDetails)domMap.get(key);
			}
			domainObject = (ims.ntpf.locall.domain.objects.LoCallWaitingListDetails) domainFactory.getDomainObject(ims.ntpf.locall.domain.objects.LoCallWaitingListDetails.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_LoCallWaitingListDetails());

		domainObject.setStatusHistory(ims.ntpf.vo.domain.LoCallStatusVoAssembler.extractLoCallStatusSet(domainFactory, valueObject.getStatusHistory(), domainObject.getStatusHistory(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getCurrentStatus() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getCurrentStatus().getID());
		}
		domainObject.setCurrentStatus(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getCurrentStatusReason() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getCurrentStatusReason().getID());
		}
		domainObject.setCurrentStatusReason(value3);
		domainObject.setProcedure(ims.core.vo.domain.ActivityVoAssembler.extractActivity(domainFactory, valueObject.getProcedure(), domMap));
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getProcedureText() != null && valueObject.getProcedureText().equals(""))
		{
			valueObject.setProcedureText(null);
		}
		domainObject.setProcedureText(valueObject.getProcedureText());

		return domainObject;
	}

}
