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
package ims.admin.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Marius Mihalec
 */
public class MobileDeviceVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.admin.vo.MobileDeviceVo copy(ims.admin.vo.MobileDeviceVo valueObjectDest, ims.admin.vo.MobileDeviceVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_MobileDevice(valueObjectSrc.getID_MobileDevice());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// UniqueId
		valueObjectDest.setUniqueId(valueObjectSrc.getUniqueId());
		// TokenId
		valueObjectDest.setTokenId(valueObjectSrc.getTokenId());
		// Name
		valueObjectDest.setName(valueObjectSrc.getName());
		// Model
		valueObjectDest.setModel(valueObjectSrc.getModel());
		// SystemName
		valueObjectDest.setSystemName(valueObjectSrc.getSystemName());
		// SystemVersion
		valueObjectDest.setSystemVersion(valueObjectSrc.getSystemVersion());
		// Active
		valueObjectDest.setActive(valueObjectSrc.getActive());
		// ApplicationInfo
		valueObjectDest.setApplicationInfo(valueObjectSrc.getApplicationInfo());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createMobileDeviceVoCollectionFromMobileDevice(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.configuration.domain.objects.MobileDevice objects.
	 */
	public static ims.admin.vo.MobileDeviceVoCollection createMobileDeviceVoCollectionFromMobileDevice(java.util.Set domainObjectSet)	
	{
		return createMobileDeviceVoCollectionFromMobileDevice(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.configuration.domain.objects.MobileDevice objects.
	 */
	public static ims.admin.vo.MobileDeviceVoCollection createMobileDeviceVoCollectionFromMobileDevice(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.admin.vo.MobileDeviceVoCollection voList = new ims.admin.vo.MobileDeviceVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.configuration.domain.objects.MobileDevice domainObject = (ims.core.configuration.domain.objects.MobileDevice) iterator.next();
			ims.admin.vo.MobileDeviceVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.configuration.domain.objects.MobileDevice objects.
	 */
	public static ims.admin.vo.MobileDeviceVoCollection createMobileDeviceVoCollectionFromMobileDevice(java.util.List domainObjectList) 
	{
		return createMobileDeviceVoCollectionFromMobileDevice(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.configuration.domain.objects.MobileDevice objects.
	 */
	public static ims.admin.vo.MobileDeviceVoCollection createMobileDeviceVoCollectionFromMobileDevice(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.admin.vo.MobileDeviceVoCollection voList = new ims.admin.vo.MobileDeviceVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.configuration.domain.objects.MobileDevice domainObject = (ims.core.configuration.domain.objects.MobileDevice) domainObjectList.get(i);
			ims.admin.vo.MobileDeviceVo vo = create(map, domainObject);

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
	 * Create the ims.core.configuration.domain.objects.MobileDevice set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractMobileDeviceSet(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.MobileDeviceVoCollection voCollection) 
	 {
	 	return extractMobileDeviceSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractMobileDeviceSet(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.MobileDeviceVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.admin.vo.MobileDeviceVo vo = voCollection.get(i);
			ims.core.configuration.domain.objects.MobileDevice domainObject = MobileDeviceVoAssembler.extractMobileDevice(domainFactory, vo, domMap);

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
	 * Create the ims.core.configuration.domain.objects.MobileDevice list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractMobileDeviceList(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.MobileDeviceVoCollection voCollection) 
	 {
	 	return extractMobileDeviceList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractMobileDeviceList(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.MobileDeviceVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.admin.vo.MobileDeviceVo vo = voCollection.get(i);
			ims.core.configuration.domain.objects.MobileDevice domainObject = MobileDeviceVoAssembler.extractMobileDevice(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.configuration.domain.objects.MobileDevice object.
	 * @param domainObject ims.core.configuration.domain.objects.MobileDevice
	 */
	 public static ims.admin.vo.MobileDeviceVo create(ims.core.configuration.domain.objects.MobileDevice domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.configuration.domain.objects.MobileDevice object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.admin.vo.MobileDeviceVo create(DomainObjectMap map, ims.core.configuration.domain.objects.MobileDevice domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.admin.vo.MobileDeviceVo valueObject = (ims.admin.vo.MobileDeviceVo) map.getValueObject(domainObject, ims.admin.vo.MobileDeviceVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.admin.vo.MobileDeviceVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.configuration.domain.objects.MobileDevice
	 */
	 public static ims.admin.vo.MobileDeviceVo insert(ims.admin.vo.MobileDeviceVo valueObject, ims.core.configuration.domain.objects.MobileDevice domainObject) 
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
	 * @param domainObject ims.core.configuration.domain.objects.MobileDevice
	 */
	 public static ims.admin.vo.MobileDeviceVo insert(DomainObjectMap map, ims.admin.vo.MobileDeviceVo valueObject, ims.core.configuration.domain.objects.MobileDevice domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_MobileDevice(domainObject.getId());
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
			
		// UniqueId
		valueObject.setUniqueId(domainObject.getUniqueId());
		// TokenId
		valueObject.setTokenId(domainObject.getTokenId());
		// Name
		valueObject.setName(domainObject.getName());
		// Model
		valueObject.setModel(domainObject.getModel());
		// SystemName
		valueObject.setSystemName(domainObject.getSystemName());
		// SystemVersion
		valueObject.setSystemVersion(domainObject.getSystemVersion());
		// Active
		valueObject.setActive( domainObject.isActive() );
		// ApplicationInfo
		valueObject.setApplicationInfo(domainObject.getApplicationInfo());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.configuration.domain.objects.MobileDevice extractMobileDevice(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.MobileDeviceVo valueObject) 
	{
		return 	extractMobileDevice(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.configuration.domain.objects.MobileDevice extractMobileDevice(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.MobileDeviceVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_MobileDevice();
		ims.core.configuration.domain.objects.MobileDevice domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.configuration.domain.objects.MobileDevice)domMap.get(valueObject);
			}
			// ims.admin.vo.MobileDeviceVo ID_MobileDevice field is unknown
			domainObject = new ims.core.configuration.domain.objects.MobileDevice();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_MobileDevice());
			if (domMap.get(key) != null)
			{
				return (ims.core.configuration.domain.objects.MobileDevice)domMap.get(key);
			}
			domainObject = (ims.core.configuration.domain.objects.MobileDevice) domainFactory.getDomainObject(ims.core.configuration.domain.objects.MobileDevice.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_MobileDevice());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getUniqueId() != null && valueObject.getUniqueId().equals(""))
		{
			valueObject.setUniqueId(null);
		}
		domainObject.setUniqueId(valueObject.getUniqueId());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getTokenId() != null && valueObject.getTokenId().equals(""))
		{
			valueObject.setTokenId(null);
		}
		domainObject.setTokenId(valueObject.getTokenId());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getName() != null && valueObject.getName().equals(""))
		{
			valueObject.setName(null);
		}
		domainObject.setName(valueObject.getName());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getModel() != null && valueObject.getModel().equals(""))
		{
			valueObject.setModel(null);
		}
		domainObject.setModel(valueObject.getModel());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSystemName() != null && valueObject.getSystemName().equals(""))
		{
			valueObject.setSystemName(null);
		}
		domainObject.setSystemName(valueObject.getSystemName());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSystemVersion() != null && valueObject.getSystemVersion().equals(""))
		{
			valueObject.setSystemVersion(null);
		}
		domainObject.setSystemVersion(valueObject.getSystemVersion());
		domainObject.setActive(valueObject.getActive());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getApplicationInfo() != null && valueObject.getApplicationInfo().equals(""))
		{
			valueObject.setApplicationInfo(null);
		}
		domainObject.setApplicationInfo(valueObject.getApplicationInfo());

		return domainObject;
	}

}
