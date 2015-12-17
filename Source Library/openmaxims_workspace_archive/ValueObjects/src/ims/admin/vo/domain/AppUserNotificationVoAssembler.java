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
public class AppUserNotificationVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.admin.vo.AppUserNotificationVo copy(ims.admin.vo.AppUserNotificationVo valueObjectDest, ims.admin.vo.AppUserNotificationVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_AppUser(valueObjectSrc.getID_AppUser());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Username
		valueObjectDest.setUsername(valueObjectSrc.getUsername());
		// mos
		valueObjectDest.setMos(valueObjectSrc.getMos());
		// EmailAccount
		valueObjectDest.setEmailAccount(valueObjectSrc.getEmailAccount());
		// NotificationDetails
		valueObjectDest.setNotificationDetails(valueObjectSrc.getNotificationDetails());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createAppUserNotificationVoCollectionFromAppUser(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.configuration.domain.objects.AppUser objects.
	 */
	public static ims.admin.vo.AppUserNotificationVoCollection createAppUserNotificationVoCollectionFromAppUser(java.util.Set domainObjectSet)	
	{
		return createAppUserNotificationVoCollectionFromAppUser(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.configuration.domain.objects.AppUser objects.
	 */
	public static ims.admin.vo.AppUserNotificationVoCollection createAppUserNotificationVoCollectionFromAppUser(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.admin.vo.AppUserNotificationVoCollection voList = new ims.admin.vo.AppUserNotificationVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.configuration.domain.objects.AppUser domainObject = (ims.core.configuration.domain.objects.AppUser) iterator.next();
			ims.admin.vo.AppUserNotificationVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.configuration.domain.objects.AppUser objects.
	 */
	public static ims.admin.vo.AppUserNotificationVoCollection createAppUserNotificationVoCollectionFromAppUser(java.util.List domainObjectList) 
	{
		return createAppUserNotificationVoCollectionFromAppUser(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.configuration.domain.objects.AppUser objects.
	 */
	public static ims.admin.vo.AppUserNotificationVoCollection createAppUserNotificationVoCollectionFromAppUser(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.admin.vo.AppUserNotificationVoCollection voList = new ims.admin.vo.AppUserNotificationVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.configuration.domain.objects.AppUser domainObject = (ims.core.configuration.domain.objects.AppUser) domainObjectList.get(i);
			ims.admin.vo.AppUserNotificationVo vo = create(map, domainObject);

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
	 * Create the ims.core.configuration.domain.objects.AppUser set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractAppUserSet(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.AppUserNotificationVoCollection voCollection) 
	 {
	 	return extractAppUserSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractAppUserSet(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.AppUserNotificationVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.admin.vo.AppUserNotificationVo vo = voCollection.get(i);
			ims.core.configuration.domain.objects.AppUser domainObject = AppUserNotificationVoAssembler.extractAppUser(domainFactory, vo, domMap);

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
	 * Create the ims.core.configuration.domain.objects.AppUser list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractAppUserList(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.AppUserNotificationVoCollection voCollection) 
	 {
	 	return extractAppUserList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractAppUserList(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.AppUserNotificationVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.admin.vo.AppUserNotificationVo vo = voCollection.get(i);
			ims.core.configuration.domain.objects.AppUser domainObject = AppUserNotificationVoAssembler.extractAppUser(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.configuration.domain.objects.AppUser object.
	 * @param domainObject ims.core.configuration.domain.objects.AppUser
	 */
	 public static ims.admin.vo.AppUserNotificationVo create(ims.core.configuration.domain.objects.AppUser domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.configuration.domain.objects.AppUser object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.admin.vo.AppUserNotificationVo create(DomainObjectMap map, ims.core.configuration.domain.objects.AppUser domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.admin.vo.AppUserNotificationVo valueObject = (ims.admin.vo.AppUserNotificationVo) map.getValueObject(domainObject, ims.admin.vo.AppUserNotificationVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.admin.vo.AppUserNotificationVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.configuration.domain.objects.AppUser
	 */
	 public static ims.admin.vo.AppUserNotificationVo insert(ims.admin.vo.AppUserNotificationVo valueObject, ims.core.configuration.domain.objects.AppUser domainObject) 
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
	 * @param domainObject ims.core.configuration.domain.objects.AppUser
	 */
	 public static ims.admin.vo.AppUserNotificationVo insert(DomainObjectMap map, ims.admin.vo.AppUserNotificationVo valueObject, ims.core.configuration.domain.objects.AppUser domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_AppUser(domainObject.getId());
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
			
		// Username
		valueObject.setUsername(domainObject.getUsername());
		// mos
		valueObject.setMos(ims.core.vo.domain.MemberOfStaffNotificationVoAssembler.create(map, domainObject.getMos()) );
		// EmailAccount
		valueObject.setEmailAccount(ims.admin.vo.domain.UserEmailAccountVoAssembler.create(map, domainObject.getEmailAccount()) );
		// NotificationDetails
		valueObject.setNotificationDetails(ims.admin.vo.domain.UserNotificationDetailsVoAssembler.create(map, domainObject.getNotificationDetails()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.configuration.domain.objects.AppUser extractAppUser(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.AppUserNotificationVo valueObject) 
	{
		return 	extractAppUser(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.configuration.domain.objects.AppUser extractAppUser(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.AppUserNotificationVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_AppUser();
		ims.core.configuration.domain.objects.AppUser domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.configuration.domain.objects.AppUser)domMap.get(valueObject);
			}
			// ims.admin.vo.AppUserNotificationVo ID_AppUser field is unknown
			domainObject = new ims.core.configuration.domain.objects.AppUser();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_AppUser());
			if (domMap.get(key) != null)
			{
				return (ims.core.configuration.domain.objects.AppUser)domMap.get(key);
			}
			domainObject = (ims.core.configuration.domain.objects.AppUser) domainFactory.getDomainObject(ims.core.configuration.domain.objects.AppUser.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_AppUser());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getUsername() != null && valueObject.getUsername().equals(""))
		{
			valueObject.setUsername(null);
		}
		domainObject.setUsername(valueObject.getUsername());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.MemberOfStaff value2 = null;
		if ( null != valueObject.getMos() ) 
		{
			if (valueObject.getMos().getBoId() == null)
			{
				if (domMap.get(valueObject.getMos()) != null)
				{
					value2 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getMos());
				}
			}
			else
			{
				value2 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getMos().getBoId());
			}
		}
		domainObject.setMos(value2);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.domain.objects.UserEmailAccount value3 = null;
		if ( null != valueObject.getEmailAccount() ) 
		{
			if (valueObject.getEmailAccount().getBoId() == null)
			{
				if (domMap.get(valueObject.getEmailAccount()) != null)
				{
					value3 = (ims.core.admin.domain.objects.UserEmailAccount)domMap.get(valueObject.getEmailAccount());
				}
			}
			else
			{
				value3 = (ims.core.admin.domain.objects.UserEmailAccount)domainFactory.getDomainObject(ims.core.admin.domain.objects.UserEmailAccount.class, valueObject.getEmailAccount().getBoId());
			}
		}
		domainObject.setEmailAccount(value3);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.configuration.domain.objects.UserNotificationDetails value4 = null;
		if ( null != valueObject.getNotificationDetails() ) 
		{
			if (valueObject.getNotificationDetails().getBoId() == null)
			{
				if (domMap.get(valueObject.getNotificationDetails()) != null)
				{
					value4 = (ims.core.configuration.domain.objects.UserNotificationDetails)domMap.get(valueObject.getNotificationDetails());
				}
			}
			else
			{
				value4 = (ims.core.configuration.domain.objects.UserNotificationDetails)domainFactory.getDomainObject(ims.core.configuration.domain.objects.UserNotificationDetails.class, valueObject.getNotificationDetails().getBoId());
			}
		}
		domainObject.setNotificationDetails(value4);

		return domainObject;
	}

}
