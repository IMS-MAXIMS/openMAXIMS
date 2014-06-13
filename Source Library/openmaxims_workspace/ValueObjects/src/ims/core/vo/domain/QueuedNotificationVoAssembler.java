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
 * @author Marius Mihalec
 */
public class QueuedNotificationVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.QueuedNotificationVo copy(ims.core.vo.QueuedNotificationVo valueObjectDest, ims.core.vo.QueuedNotificationVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_QueuedNotification(valueObjectSrc.getID_QueuedNotification());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// DateTime
		valueObjectDest.setDateTime(valueObjectSrc.getDateTime());
		// Message
		valueObjectDest.setMessage(valueObjectSrc.getMessage());
		// Priority
		valueObjectDest.setPriority(valueObjectSrc.getPriority());
		// EntityType
		valueObjectDest.setEntityType(valueObjectSrc.getEntityType());
		// EntityId
		valueObjectDest.setEntityId(valueObjectSrc.getEntityId());
		// Source
		valueObjectDest.setSource(valueObjectSrc.getSource());
		// userId
		valueObjectDest.setUserId(valueObjectSrc.getUserId());
		// deliveryMethod
		valueObjectDest.setDeliveryMethod(valueObjectSrc.getDeliveryMethod());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createQueuedNotificationVoCollectionFromQueuedNotification(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.QueuedNotification objects.
	 */
	public static ims.core.vo.QueuedNotificationVoCollection createQueuedNotificationVoCollectionFromQueuedNotification(java.util.Set domainObjectSet)	
	{
		return createQueuedNotificationVoCollectionFromQueuedNotification(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.QueuedNotification objects.
	 */
	public static ims.core.vo.QueuedNotificationVoCollection createQueuedNotificationVoCollectionFromQueuedNotification(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.QueuedNotificationVoCollection voList = new ims.core.vo.QueuedNotificationVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.domain.objects.QueuedNotification domainObject = (ims.core.admin.domain.objects.QueuedNotification) iterator.next();
			ims.core.vo.QueuedNotificationVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.domain.objects.QueuedNotification objects.
	 */
	public static ims.core.vo.QueuedNotificationVoCollection createQueuedNotificationVoCollectionFromQueuedNotification(java.util.List domainObjectList) 
	{
		return createQueuedNotificationVoCollectionFromQueuedNotification(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.domain.objects.QueuedNotification objects.
	 */
	public static ims.core.vo.QueuedNotificationVoCollection createQueuedNotificationVoCollectionFromQueuedNotification(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.QueuedNotificationVoCollection voList = new ims.core.vo.QueuedNotificationVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.domain.objects.QueuedNotification domainObject = (ims.core.admin.domain.objects.QueuedNotification) domainObjectList.get(i);
			ims.core.vo.QueuedNotificationVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.domain.objects.QueuedNotification set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractQueuedNotificationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.QueuedNotificationVoCollection voCollection) 
	 {
	 	return extractQueuedNotificationSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractQueuedNotificationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.QueuedNotificationVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.QueuedNotificationVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.QueuedNotification domainObject = QueuedNotificationVoAssembler.extractQueuedNotification(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.domain.objects.QueuedNotification list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractQueuedNotificationList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.QueuedNotificationVoCollection voCollection) 
	 {
	 	return extractQueuedNotificationList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractQueuedNotificationList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.QueuedNotificationVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.QueuedNotificationVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.QueuedNotification domainObject = QueuedNotificationVoAssembler.extractQueuedNotification(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.domain.objects.QueuedNotification object.
	 * @param domainObject ims.core.admin.domain.objects.QueuedNotification
	 */
	 public static ims.core.vo.QueuedNotificationVo create(ims.core.admin.domain.objects.QueuedNotification domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.domain.objects.QueuedNotification object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.QueuedNotificationVo create(DomainObjectMap map, ims.core.admin.domain.objects.QueuedNotification domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.QueuedNotificationVo valueObject = (ims.core.vo.QueuedNotificationVo) map.getValueObject(domainObject, ims.core.vo.QueuedNotificationVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.QueuedNotificationVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.domain.objects.QueuedNotification
	 */
	 public static ims.core.vo.QueuedNotificationVo insert(ims.core.vo.QueuedNotificationVo valueObject, ims.core.admin.domain.objects.QueuedNotification domainObject) 
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
	 * @param domainObject ims.core.admin.domain.objects.QueuedNotification
	 */
	 public static ims.core.vo.QueuedNotificationVo insert(DomainObjectMap map, ims.core.vo.QueuedNotificationVo valueObject, ims.core.admin.domain.objects.QueuedNotification domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_QueuedNotification(domainObject.getId());
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
			
		// DateTime
		java.util.Date DateTime = domainObject.getDateTime();
		if ( null != DateTime ) 
		{
			valueObject.setDateTime(new ims.framework.utils.DateTime(DateTime) );
		}
		// Message
		valueObject.setMessage(domainObject.getMessage());
		// Priority
		valueObject.setPriority(domainObject.getPriority());
		// EntityType
		valueObject.setEntityType(domainObject.getEntityType());
		// EntityId
		valueObject.setEntityId(domainObject.getEntityId());
		// Source
		valueObject.setSource(domainObject.getSource());
		// userId
		valueObject.setUserId(domainObject.getUserId());
		// deliveryMethod
		valueObject.setDeliveryMethod(domainObject.getDeliveryMethod());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.domain.objects.QueuedNotification extractQueuedNotification(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.QueuedNotificationVo valueObject) 
	{
		return 	extractQueuedNotification(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.domain.objects.QueuedNotification extractQueuedNotification(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.QueuedNotificationVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_QueuedNotification();
		ims.core.admin.domain.objects.QueuedNotification domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.domain.objects.QueuedNotification)domMap.get(valueObject);
			}
			// ims.core.vo.QueuedNotificationVo ID_QueuedNotification field is unknown
			domainObject = new ims.core.admin.domain.objects.QueuedNotification();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_QueuedNotification());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.domain.objects.QueuedNotification)domMap.get(key);
			}
			domainObject = (ims.core.admin.domain.objects.QueuedNotification) domainFactory.getDomainObject(ims.core.admin.domain.objects.QueuedNotification.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_QueuedNotification());

		ims.framework.utils.DateTime dateTime1 = valueObject.getDateTime();
		java.util.Date value1 = null;
		if ( dateTime1 != null ) 
		{
			value1 = dateTime1.getJavaDate();
		}
		domainObject.setDateTime(value1);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getMessage() != null && valueObject.getMessage().equals(""))
		{
			valueObject.setMessage(null);
		}
		domainObject.setMessage(valueObject.getMessage());
		domainObject.setPriority(valueObject.getPriority());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getEntityType() != null && valueObject.getEntityType().equals(""))
		{
			valueObject.setEntityType(null);
		}
		domainObject.setEntityType(valueObject.getEntityType());
		domainObject.setEntityId(valueObject.getEntityId());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSource() != null && valueObject.getSource().equals(""))
		{
			valueObject.setSource(null);
		}
		domainObject.setSource(valueObject.getSource());
		domainObject.setUserId(valueObject.getUserId());
		domainObject.setDeliveryMethod(valueObject.getDeliveryMethod());

		return domainObject;
	}

}
