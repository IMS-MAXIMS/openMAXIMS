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
 * @author Aidan Melly
 */
public class AppUserShortVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.admin.vo.AppUserShortVo copy(ims.admin.vo.AppUserShortVo valueObjectDest, ims.admin.vo.AppUserShortVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_AppUser(valueObjectSrc.getID_AppUser());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Username
		valueObjectDest.setUsername(valueObjectSrc.getUsername());
		// Password
		valueObjectDest.setPassword(valueObjectSrc.getPassword());
		// EncodedPassword
		valueObjectDest.setEncodedPassword(valueObjectSrc.getEncodedPassword());
		// Theme
		valueObjectDest.setTheme(valueObjectSrc.getTheme());
		// PwdExpDate
		valueObjectDest.setPwdExpDate(valueObjectSrc.getPwdExpDate());
		// EffectiveFrom
		valueObjectDest.setEffectiveFrom(valueObjectSrc.getEffectiveFrom());
		// EffectiveTo
		valueObjectDest.setEffectiveTo(valueObjectSrc.getEffectiveTo());
		// IsActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
		// DebugMode
		valueObjectDest.setDebugMode(valueObjectSrc.getDebugMode());
		// LDAPUsername
		valueObjectDest.setLDAPUsername(valueObjectSrc.getLDAPUsername());
		// LDAPPassword
		valueObjectDest.setLDAPPassword(valueObjectSrc.getLDAPPassword());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createAppUserShortVoCollectionFromAppUser(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.configuration.domain.objects.AppUser objects.
	 */
	public static ims.admin.vo.AppUserShortVoCollection createAppUserShortVoCollectionFromAppUser(java.util.Set domainObjectSet)	
	{
		return createAppUserShortVoCollectionFromAppUser(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.configuration.domain.objects.AppUser objects.
	 */
	public static ims.admin.vo.AppUserShortVoCollection createAppUserShortVoCollectionFromAppUser(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.admin.vo.AppUserShortVoCollection voList = new ims.admin.vo.AppUserShortVoCollection();
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
			ims.admin.vo.AppUserShortVo vo = create(map, domainObject);
			
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
	public static ims.admin.vo.AppUserShortVoCollection createAppUserShortVoCollectionFromAppUser(java.util.List domainObjectList) 
	{
		return createAppUserShortVoCollectionFromAppUser(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.configuration.domain.objects.AppUser objects.
	 */
	public static ims.admin.vo.AppUserShortVoCollection createAppUserShortVoCollectionFromAppUser(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.admin.vo.AppUserShortVoCollection voList = new ims.admin.vo.AppUserShortVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.configuration.domain.objects.AppUser domainObject = (ims.core.configuration.domain.objects.AppUser) domainObjectList.get(i);
			ims.admin.vo.AppUserShortVo vo = create(map, domainObject);

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
	 public static java.util.Set extractAppUserSet(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.AppUserShortVoCollection voCollection) 
	 {
	 	return extractAppUserSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractAppUserSet(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.AppUserShortVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.admin.vo.AppUserShortVo vo = voCollection.get(i);
			ims.core.configuration.domain.objects.AppUser domainObject = AppUserShortVoAssembler.extractAppUser(domainFactory, vo, domMap);

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
	 public static java.util.List extractAppUserList(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.AppUserShortVoCollection voCollection) 
	 {
	 	return extractAppUserList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractAppUserList(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.AppUserShortVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.admin.vo.AppUserShortVo vo = voCollection.get(i);
			ims.core.configuration.domain.objects.AppUser domainObject = AppUserShortVoAssembler.extractAppUser(domainFactory, vo, domMap);

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
	 public static ims.admin.vo.AppUserShortVo create(ims.core.configuration.domain.objects.AppUser domainObject) 
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
	  public static ims.admin.vo.AppUserShortVo create(DomainObjectMap map, ims.core.configuration.domain.objects.AppUser domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.admin.vo.AppUserShortVo valueObject = (ims.admin.vo.AppUserShortVo) map.getValueObject(domainObject, ims.admin.vo.AppUserShortVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.admin.vo.AppUserShortVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.admin.vo.AppUserShortVo insert(ims.admin.vo.AppUserShortVo valueObject, ims.core.configuration.domain.objects.AppUser domainObject) 
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
	 public static ims.admin.vo.AppUserShortVo insert(DomainObjectMap map, ims.admin.vo.AppUserShortVo valueObject, ims.core.configuration.domain.objects.AppUser domainObject) 
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
		// Password
		valueObject.setPassword(domainObject.getPassword());
		// EncodedPassword
		valueObject.setEncodedPassword(domainObject.getEncodedPassword());
		// Theme
		valueObject.setTheme(domainObject.getTheme());
		// PwdExpDate
		java.util.Date PwdExpDate = domainObject.getPwdExpDate();
		if ( null != PwdExpDate ) 
		{
			valueObject.setPwdExpDate(new ims.framework.utils.DateTime(PwdExpDate) );
		}
		// EffectiveFrom
		java.util.Date EffectiveFrom = domainObject.getEffectiveFrom();
		if ( null != EffectiveFrom ) 
		{
			valueObject.setEffectiveFrom(new ims.framework.utils.DateTime(EffectiveFrom) );
		}
		// EffectiveTo
		java.util.Date EffectiveTo = domainObject.getEffectiveTo();
		if ( null != EffectiveTo ) 
		{
			valueObject.setEffectiveTo(new ims.framework.utils.DateTime(EffectiveTo) );
		}
		// IsActive
		valueObject.setIsActive( domainObject.isIsActive() );
		// DebugMode
		valueObject.setDebugMode( domainObject.isDebugMode() );
		// LDAPUsername
		valueObject.setLDAPUsername(domainObject.getLDAPUsername());
		// LDAPPassword
		valueObject.setLDAPPassword(domainObject.getLDAPPassword());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.configuration.domain.objects.AppUser extractAppUser(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.AppUserShortVo valueObject) 
	{
		return 	extractAppUser(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.configuration.domain.objects.AppUser extractAppUser(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.AppUserShortVo valueObject, HashMap domMap) 
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
			// ims.admin.vo.AppUserShortVo ID_AppUser field is unknown
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
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPassword() != null && valueObject.getPassword().equals(""))
		{
			valueObject.setPassword(null);
		}
		domainObject.setPassword(valueObject.getPassword());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getEncodedPassword() != null && valueObject.getEncodedPassword().equals(""))
		{
			valueObject.setEncodedPassword(null);
		}
		domainObject.setEncodedPassword(valueObject.getEncodedPassword());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getTheme() != null && valueObject.getTheme().equals(""))
		{
			valueObject.setTheme(null);
		}
		domainObject.setTheme(valueObject.getTheme());
		ims.framework.utils.DateTime dateTime5 = valueObject.getPwdExpDate();
		java.util.Date value5 = null;
		if ( dateTime5 != null ) 
		{
			value5 = dateTime5.getJavaDate();
		}
		domainObject.setPwdExpDate(value5);
		ims.framework.utils.DateTime dateTime6 = valueObject.getEffectiveFrom();
		java.util.Date value6 = null;
		if ( dateTime6 != null ) 
		{
			value6 = dateTime6.getJavaDate();
		}
		domainObject.setEffectiveFrom(value6);
		ims.framework.utils.DateTime dateTime7 = valueObject.getEffectiveTo();
		java.util.Date value7 = null;
		if ( dateTime7 != null ) 
		{
			value7 = dateTime7.getJavaDate();
		}
		domainObject.setEffectiveTo(value7);
		domainObject.setIsActive(valueObject.getIsActive());
		domainObject.setDebugMode(valueObject.getDebugMode());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getLDAPUsername() != null && valueObject.getLDAPUsername().equals(""))
		{
			valueObject.setLDAPUsername(null);
		}
		domainObject.setLDAPUsername(valueObject.getLDAPUsername());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getLDAPPassword() != null && valueObject.getLDAPPassword().equals(""))
		{
			valueObject.setLDAPPassword(null);
		}
		domainObject.setLDAPPassword(valueObject.getLDAPPassword());

		return domainObject;
	}

}
