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
 * @author Daniel Laffan
 */
public class MergeRequestVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.MergeRequestVo copy(ims.core.vo.MergeRequestVo valueObjectDest, ims.core.vo.MergeRequestVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_MergeRequest(valueObjectSrc.getID_MergeRequest());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// SourcePatId
		valueObjectDest.setSourcePatId(valueObjectSrc.getSourcePatId());
		// DestinationPatId
		valueObjectDest.setDestinationPatId(valueObjectSrc.getDestinationPatId());
		// RequestedBy
		valueObjectDest.setRequestedBy(valueObjectSrc.getRequestedBy());
		// Status
		valueObjectDest.setStatus(valueObjectSrc.getStatus());
		// Comment
		valueObjectDest.setComment(valueObjectSrc.getComment());
		// sysinfo
		valueObjectDest.setSysinfo(valueObjectSrc.getSysinfo());
		// mergeIdentifiers
		valueObjectDest.setMergeIdentifiers(valueObjectSrc.getMergeIdentifiers());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createMergeRequestVoCollectionFromMergeRequest(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.patient.domain.objects.MergeRequest objects.
	 */
	public static ims.core.vo.MergeRequestVoCollection createMergeRequestVoCollectionFromMergeRequest(java.util.Set domainObjectSet)	
	{
		return createMergeRequestVoCollectionFromMergeRequest(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.patient.domain.objects.MergeRequest objects.
	 */
	public static ims.core.vo.MergeRequestVoCollection createMergeRequestVoCollectionFromMergeRequest(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.MergeRequestVoCollection voList = new ims.core.vo.MergeRequestVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.patient.domain.objects.MergeRequest domainObject = (ims.core.patient.domain.objects.MergeRequest) iterator.next();
			ims.core.vo.MergeRequestVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.patient.domain.objects.MergeRequest objects.
	 */
	public static ims.core.vo.MergeRequestVoCollection createMergeRequestVoCollectionFromMergeRequest(java.util.List domainObjectList) 
	{
		return createMergeRequestVoCollectionFromMergeRequest(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.patient.domain.objects.MergeRequest objects.
	 */
	public static ims.core.vo.MergeRequestVoCollection createMergeRequestVoCollectionFromMergeRequest(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.MergeRequestVoCollection voList = new ims.core.vo.MergeRequestVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.patient.domain.objects.MergeRequest domainObject = (ims.core.patient.domain.objects.MergeRequest) domainObjectList.get(i);
			ims.core.vo.MergeRequestVo vo = create(map, domainObject);

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
	 * Create the ims.core.patient.domain.objects.MergeRequest set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractMergeRequestSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.MergeRequestVoCollection voCollection) 
	 {
	 	return extractMergeRequestSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractMergeRequestSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.MergeRequestVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.MergeRequestVo vo = voCollection.get(i);
			ims.core.patient.domain.objects.MergeRequest domainObject = MergeRequestVoAssembler.extractMergeRequest(domainFactory, vo, domMap);

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
	 * Create the ims.core.patient.domain.objects.MergeRequest list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractMergeRequestList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.MergeRequestVoCollection voCollection) 
	 {
	 	return extractMergeRequestList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractMergeRequestList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.MergeRequestVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.MergeRequestVo vo = voCollection.get(i);
			ims.core.patient.domain.objects.MergeRequest domainObject = MergeRequestVoAssembler.extractMergeRequest(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.patient.domain.objects.MergeRequest object.
	 * @param domainObject ims.core.patient.domain.objects.MergeRequest
	 */
	 public static ims.core.vo.MergeRequestVo create(ims.core.patient.domain.objects.MergeRequest domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.patient.domain.objects.MergeRequest object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.MergeRequestVo create(DomainObjectMap map, ims.core.patient.domain.objects.MergeRequest domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.MergeRequestVo valueObject = (ims.core.vo.MergeRequestVo) map.getValueObject(domainObject, ims.core.vo.MergeRequestVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.MergeRequestVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.patient.domain.objects.MergeRequest
	 */
	 public static ims.core.vo.MergeRequestVo insert(ims.core.vo.MergeRequestVo valueObject, ims.core.patient.domain.objects.MergeRequest domainObject) 
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
	 * @param domainObject ims.core.patient.domain.objects.MergeRequest
	 */
	 public static ims.core.vo.MergeRequestVo insert(DomainObjectMap map, ims.core.vo.MergeRequestVo valueObject, ims.core.patient.domain.objects.MergeRequest domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_MergeRequest(domainObject.getId());
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
			
		// SourcePatId
		valueObject.setSourcePatId(domainObject.getSourcePatId());
		// DestinationPatId
		valueObject.setDestinationPatId(domainObject.getDestinationPatId());
		// RequestedBy
		valueObject.setRequestedBy(ims.core.vo.domain.MemberOfStaffShortVoAssembler.create(map, domainObject.getRequestedBy()) );
		// Status
		valueObject.setStatus( domainObject.isStatus() );
		// Comment
		valueObject.setComment(domainObject.getComment());
		// sysinfo
		// set system information
		valueObject.setSysinfo(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
		// mergeIdentifiers
		valueObject.setMergeIdentifiers( domainObject.isMergeIdentifiers() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.patient.domain.objects.MergeRequest extractMergeRequest(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.MergeRequestVo valueObject) 
	{
		return 	extractMergeRequest(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.patient.domain.objects.MergeRequest extractMergeRequest(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.MergeRequestVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_MergeRequest();
		ims.core.patient.domain.objects.MergeRequest domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.patient.domain.objects.MergeRequest)domMap.get(valueObject);
			}
			// ims.core.vo.MergeRequestVo ID_MergeRequest field is unknown
			domainObject = new ims.core.patient.domain.objects.MergeRequest();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_MergeRequest());
			if (domMap.get(key) != null)
			{
				return (ims.core.patient.domain.objects.MergeRequest)domMap.get(key);
			}
			domainObject = (ims.core.patient.domain.objects.MergeRequest) domainFactory.getDomainObject(ims.core.patient.domain.objects.MergeRequest.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_MergeRequest());

		domainObject.setSourcePatId(valueObject.getSourcePatId());
		domainObject.setDestinationPatId(valueObject.getDestinationPatId());
		domainObject.setRequestedBy(ims.core.vo.domain.MemberOfStaffShortVoAssembler.extractMemberOfStaff(domainFactory, valueObject.getRequestedBy(), domMap));
		domainObject.setStatus(valueObject.getStatus());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getComment() != null && valueObject.getComment().equals(""))
		{
			valueObject.setComment(null);
		}
		domainObject.setComment(valueObject.getComment());
		domainObject.setMergeIdentifiers(valueObject.getMergeIdentifiers());

		return domainObject;
	}

}
