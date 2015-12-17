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
 * @author Sean Nesbitt
 */
public class ExternalPersonShortVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.ExternalPersonShortVo copy(ims.core.vo.ExternalPersonShortVo valueObjectDest, ims.core.vo.ExternalPersonShortVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ExternalPerson(valueObjectSrc.getID_ExternalPerson());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Name
		valueObjectDest.setName(valueObjectSrc.getName());
		// isActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
		// CommChannels
		valueObjectDest.setCommChannels(valueObjectSrc.getCommChannels());
		// Address
		valueObjectDest.setAddress(valueObjectSrc.getAddress());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createExternalPersonShortVoCollectionFromExternalPerson(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.generic.domain.objects.ExternalPerson objects.
	 */
	public static ims.core.vo.ExternalPersonShortVoCollection createExternalPersonShortVoCollectionFromExternalPerson(java.util.Set domainObjectSet)	
	{
		return createExternalPersonShortVoCollectionFromExternalPerson(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.generic.domain.objects.ExternalPerson objects.
	 */
	public static ims.core.vo.ExternalPersonShortVoCollection createExternalPersonShortVoCollectionFromExternalPerson(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.ExternalPersonShortVoCollection voList = new ims.core.vo.ExternalPersonShortVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.generic.domain.objects.ExternalPerson domainObject = (ims.core.generic.domain.objects.ExternalPerson) iterator.next();
			ims.core.vo.ExternalPersonShortVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.generic.domain.objects.ExternalPerson objects.
	 */
	public static ims.core.vo.ExternalPersonShortVoCollection createExternalPersonShortVoCollectionFromExternalPerson(java.util.List domainObjectList) 
	{
		return createExternalPersonShortVoCollectionFromExternalPerson(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.generic.domain.objects.ExternalPerson objects.
	 */
	public static ims.core.vo.ExternalPersonShortVoCollection createExternalPersonShortVoCollectionFromExternalPerson(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.ExternalPersonShortVoCollection voList = new ims.core.vo.ExternalPersonShortVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.generic.domain.objects.ExternalPerson domainObject = (ims.core.generic.domain.objects.ExternalPerson) domainObjectList.get(i);
			ims.core.vo.ExternalPersonShortVo vo = create(map, domainObject);

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
	 * Create the ims.core.generic.domain.objects.ExternalPerson set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractExternalPersonSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ExternalPersonShortVoCollection voCollection) 
	 {
	 	return extractExternalPersonSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractExternalPersonSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ExternalPersonShortVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.ExternalPersonShortVo vo = voCollection.get(i);
			ims.core.generic.domain.objects.ExternalPerson domainObject = ExternalPersonShortVoAssembler.extractExternalPerson(domainFactory, vo, domMap);

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
	 * Create the ims.core.generic.domain.objects.ExternalPerson list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractExternalPersonList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ExternalPersonShortVoCollection voCollection) 
	 {
	 	return extractExternalPersonList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractExternalPersonList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ExternalPersonShortVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.ExternalPersonShortVo vo = voCollection.get(i);
			ims.core.generic.domain.objects.ExternalPerson domainObject = ExternalPersonShortVoAssembler.extractExternalPerson(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.generic.domain.objects.ExternalPerson object.
	 * @param domainObject ims.core.generic.domain.objects.ExternalPerson
	 */
	 public static ims.core.vo.ExternalPersonShortVo create(ims.core.generic.domain.objects.ExternalPerson domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.generic.domain.objects.ExternalPerson object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.ExternalPersonShortVo create(DomainObjectMap map, ims.core.generic.domain.objects.ExternalPerson domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.ExternalPersonShortVo valueObject = (ims.core.vo.ExternalPersonShortVo) map.getValueObject(domainObject, ims.core.vo.ExternalPersonShortVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.ExternalPersonShortVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.generic.domain.objects.ExternalPerson
	 */
	 public static ims.core.vo.ExternalPersonShortVo insert(ims.core.vo.ExternalPersonShortVo valueObject, ims.core.generic.domain.objects.ExternalPerson domainObject) 
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
	 * @param domainObject ims.core.generic.domain.objects.ExternalPerson
	 */
	 public static ims.core.vo.ExternalPersonShortVo insert(DomainObjectMap map, ims.core.vo.ExternalPersonShortVo valueObject, ims.core.generic.domain.objects.ExternalPerson domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ExternalPerson(domainObject.getId());
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
			
		// Name
		valueObject.setName(ims.core.vo.domain.PersonNameAssembler.create(map, domainObject.getName()) );
		// isActive
		valueObject.setIsActive( domainObject.isIsActive() );
		// CommChannels
		valueObject.setCommChannels(ims.core.vo.domain.CommChannelVoAssembler.createCommChannelVoCollectionFromCommunicationChannel(map, domainObject.getCommChannels()) );
		// Address
		valueObject.setAddress(ims.core.vo.domain.PersonAddressAssembler.create(map, domainObject.getAddress()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.generic.domain.objects.ExternalPerson extractExternalPerson(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ExternalPersonShortVo valueObject) 
	{
		return 	extractExternalPerson(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.generic.domain.objects.ExternalPerson extractExternalPerson(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ExternalPersonShortVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ExternalPerson();
		ims.core.generic.domain.objects.ExternalPerson domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.generic.domain.objects.ExternalPerson)domMap.get(valueObject);
			}
			// ims.core.vo.ExternalPersonShortVo ID_ExternalPerson field is unknown
			domainObject = new ims.core.generic.domain.objects.ExternalPerson();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ExternalPerson());
			if (domMap.get(key) != null)
			{
				return (ims.core.generic.domain.objects.ExternalPerson)domMap.get(key);
			}
			domainObject = (ims.core.generic.domain.objects.ExternalPerson) domainFactory.getDomainObject(ims.core.generic.domain.objects.ExternalPerson.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ExternalPerson());

		domainObject.setName(ims.core.vo.domain.PersonNameAssembler.extractPersonName(domainFactory, valueObject.getName(), domMap));
		domainObject.setIsActive(valueObject.getIsActive());
		domainObject.setCommChannels(ims.core.vo.domain.CommChannelVoAssembler.extractCommunicationChannelList(domainFactory, valueObject.getCommChannels(), domainObject.getCommChannels(), domMap));		
		domainObject.setAddress(ims.core.vo.domain.PersonAddressAssembler.extractAddress(domainFactory, valueObject.getAddress(), domMap));

		return domainObject;
	}

}
