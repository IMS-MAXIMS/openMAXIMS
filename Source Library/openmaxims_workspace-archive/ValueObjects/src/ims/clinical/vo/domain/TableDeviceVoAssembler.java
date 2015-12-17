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
package ims.clinical.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cornel Ventuneac
 */
public class TableDeviceVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.TableDeviceVo copy(ims.clinical.vo.TableDeviceVo valueObjectDest, ims.clinical.vo.TableDeviceVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_TableDevice(valueObjectSrc.getID_TableDevice());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// TableDevice
		valueObjectDest.setTableDevice(valueObjectSrc.getTableDevice());
		// OtherTableDevice
		valueObjectDest.setOtherTableDevice(valueObjectSrc.getOtherTableDevice());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createTableDeviceVoCollectionFromTableDevice(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.TableDevice objects.
	 */
	public static ims.clinical.vo.TableDeviceVoCollection createTableDeviceVoCollectionFromTableDevice(java.util.Set domainObjectSet)	
	{
		return createTableDeviceVoCollectionFromTableDevice(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.TableDevice objects.
	 */
	public static ims.clinical.vo.TableDeviceVoCollection createTableDeviceVoCollectionFromTableDevice(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.TableDeviceVoCollection voList = new ims.clinical.vo.TableDeviceVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.clinical.domain.objects.TableDevice domainObject = (ims.core.clinical.domain.objects.TableDevice) iterator.next();
			ims.clinical.vo.TableDeviceVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.TableDevice objects.
	 */
	public static ims.clinical.vo.TableDeviceVoCollection createTableDeviceVoCollectionFromTableDevice(java.util.List domainObjectList) 
	{
		return createTableDeviceVoCollectionFromTableDevice(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.TableDevice objects.
	 */
	public static ims.clinical.vo.TableDeviceVoCollection createTableDeviceVoCollectionFromTableDevice(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.TableDeviceVoCollection voList = new ims.clinical.vo.TableDeviceVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.TableDevice domainObject = (ims.core.clinical.domain.objects.TableDevice) domainObjectList.get(i);
			ims.clinical.vo.TableDeviceVo vo = create(map, domainObject);

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
	 * Create the ims.core.clinical.domain.objects.TableDevice set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractTableDeviceSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.TableDeviceVoCollection voCollection) 
	 {
	 	return extractTableDeviceSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractTableDeviceSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.TableDeviceVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.TableDeviceVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.TableDevice domainObject = TableDeviceVoAssembler.extractTableDevice(domainFactory, vo, domMap);

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
	 * Create the ims.core.clinical.domain.objects.TableDevice list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractTableDeviceList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.TableDeviceVoCollection voCollection) 
	 {
	 	return extractTableDeviceList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractTableDeviceList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.TableDeviceVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.TableDeviceVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.TableDevice domainObject = TableDeviceVoAssembler.extractTableDevice(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.clinical.domain.objects.TableDevice object.
	 * @param domainObject ims.core.clinical.domain.objects.TableDevice
	 */
	 public static ims.clinical.vo.TableDeviceVo create(ims.core.clinical.domain.objects.TableDevice domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.clinical.domain.objects.TableDevice object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.TableDeviceVo create(DomainObjectMap map, ims.core.clinical.domain.objects.TableDevice domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.TableDeviceVo valueObject = (ims.clinical.vo.TableDeviceVo) map.getValueObject(domainObject, ims.clinical.vo.TableDeviceVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.TableDeviceVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.clinical.domain.objects.TableDevice
	 */
	 public static ims.clinical.vo.TableDeviceVo insert(ims.clinical.vo.TableDeviceVo valueObject, ims.core.clinical.domain.objects.TableDevice domainObject) 
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
	 * @param domainObject ims.core.clinical.domain.objects.TableDevice
	 */
	 public static ims.clinical.vo.TableDeviceVo insert(DomainObjectMap map, ims.clinical.vo.TableDeviceVo valueObject, ims.core.clinical.domain.objects.TableDevice domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_TableDevice(domainObject.getId());
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
			
		// TableDevice
		ims.domain.lookups.LookupInstance instance1 = domainObject.getTableDevice();
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

			ims.clinical.vo.lookups.TableDevices voLookup1 = new ims.clinical.vo.lookups.TableDevices(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.clinical.vo.lookups.TableDevices parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.clinical.vo.lookups.TableDevices(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setTableDevice(voLookup1);
		}
				// OtherTableDevice
		valueObject.setOtherTableDevice(domainObject.getOtherTableDevice());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.domain.objects.TableDevice extractTableDevice(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.TableDeviceVo valueObject) 
	{
		return 	extractTableDevice(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.TableDevice extractTableDevice(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.TableDeviceVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_TableDevice();
		ims.core.clinical.domain.objects.TableDevice domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.clinical.domain.objects.TableDevice)domMap.get(valueObject);
			}
			// ims.clinical.vo.TableDeviceVo ID_TableDevice field is unknown
			domainObject = new ims.core.clinical.domain.objects.TableDevice();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_TableDevice());
			if (domMap.get(key) != null)
			{
				return (ims.core.clinical.domain.objects.TableDevice)domMap.get(key);
			}
			domainObject = (ims.core.clinical.domain.objects.TableDevice) domainFactory.getDomainObject(ims.core.clinical.domain.objects.TableDevice.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_TableDevice());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getTableDevice() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getTableDevice().getID());
		}
		domainObject.setTableDevice(value1);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getOtherTableDevice() != null && valueObject.getOtherTableDevice().equals(""))
		{
			valueObject.setOtherTableDevice(null);
		}
		domainObject.setOtherTableDevice(valueObject.getOtherTableDevice());

		return domainObject;
	}

}
