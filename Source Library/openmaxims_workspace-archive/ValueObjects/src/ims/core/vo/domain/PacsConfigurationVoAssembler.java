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
 * @author Rory Fitzpatrick
 */
public class PacsConfigurationVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.PacsConfigurationVo copy(ims.core.vo.PacsConfigurationVo valueObjectDest, ims.core.vo.PacsConfigurationVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PACSConfiguration(valueObjectSrc.getID_PACSConfiguration());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ServerAddress
		valueObjectDest.setServerAddress(valueObjectSrc.getServerAddress());
		// UserNameParam
		valueObjectDest.setUserNameParam(valueObjectSrc.getUserNameParam());
		// Username
		valueObjectDest.setUsername(valueObjectSrc.getUsername());
		// PasswordParam
		valueObjectDest.setPasswordParam(valueObjectSrc.getPasswordParam());
		// Password
		valueObjectDest.setPassword(valueObjectSrc.getPassword());
		// AccessionParam
		valueObjectDest.setAccessionParam(valueObjectSrc.getAccessionParam());
		// AccessionTestValue
		valueObjectDest.setAccessionTestValue(valueObjectSrc.getAccessionTestValue());
		// PACSClientType
		valueObjectDest.setPACSClientType(valueObjectSrc.getPACSClientType());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPacsConfigurationVoCollectionFromPACSConfiguration(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.configuration.domain.objects.PACSConfiguration objects.
	 */
	public static ims.core.vo.PacsConfigurationVoCollection createPacsConfigurationVoCollectionFromPACSConfiguration(java.util.Set domainObjectSet)	
	{
		return createPacsConfigurationVoCollectionFromPACSConfiguration(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.configuration.domain.objects.PACSConfiguration objects.
	 */
	public static ims.core.vo.PacsConfigurationVoCollection createPacsConfigurationVoCollectionFromPACSConfiguration(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.PacsConfigurationVoCollection voList = new ims.core.vo.PacsConfigurationVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.configuration.domain.objects.PACSConfiguration domainObject = (ims.core.configuration.domain.objects.PACSConfiguration) iterator.next();
			ims.core.vo.PacsConfigurationVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.configuration.domain.objects.PACSConfiguration objects.
	 */
	public static ims.core.vo.PacsConfigurationVoCollection createPacsConfigurationVoCollectionFromPACSConfiguration(java.util.List domainObjectList) 
	{
		return createPacsConfigurationVoCollectionFromPACSConfiguration(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.configuration.domain.objects.PACSConfiguration objects.
	 */
	public static ims.core.vo.PacsConfigurationVoCollection createPacsConfigurationVoCollectionFromPACSConfiguration(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.PacsConfigurationVoCollection voList = new ims.core.vo.PacsConfigurationVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.configuration.domain.objects.PACSConfiguration domainObject = (ims.core.configuration.domain.objects.PACSConfiguration) domainObjectList.get(i);
			ims.core.vo.PacsConfigurationVo vo = create(map, domainObject);

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
	 * Create the ims.core.configuration.domain.objects.PACSConfiguration set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPACSConfigurationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PacsConfigurationVoCollection voCollection) 
	 {
	 	return extractPACSConfigurationSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPACSConfigurationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PacsConfigurationVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PacsConfigurationVo vo = voCollection.get(i);
			ims.core.configuration.domain.objects.PACSConfiguration domainObject = PacsConfigurationVoAssembler.extractPACSConfiguration(domainFactory, vo, domMap);

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
	 * Create the ims.core.configuration.domain.objects.PACSConfiguration list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPACSConfigurationList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PacsConfigurationVoCollection voCollection) 
	 {
	 	return extractPACSConfigurationList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPACSConfigurationList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PacsConfigurationVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PacsConfigurationVo vo = voCollection.get(i);
			ims.core.configuration.domain.objects.PACSConfiguration domainObject = PacsConfigurationVoAssembler.extractPACSConfiguration(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.configuration.domain.objects.PACSConfiguration object.
	 * @param domainObject ims.core.configuration.domain.objects.PACSConfiguration
	 */
	 public static ims.core.vo.PacsConfigurationVo create(ims.core.configuration.domain.objects.PACSConfiguration domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.configuration.domain.objects.PACSConfiguration object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.PacsConfigurationVo create(DomainObjectMap map, ims.core.configuration.domain.objects.PACSConfiguration domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.PacsConfigurationVo valueObject = (ims.core.vo.PacsConfigurationVo) map.getValueObject(domainObject, ims.core.vo.PacsConfigurationVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.PacsConfigurationVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.configuration.domain.objects.PACSConfiguration
	 */
	 public static ims.core.vo.PacsConfigurationVo insert(ims.core.vo.PacsConfigurationVo valueObject, ims.core.configuration.domain.objects.PACSConfiguration domainObject) 
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
	 * @param domainObject ims.core.configuration.domain.objects.PACSConfiguration
	 */
	 public static ims.core.vo.PacsConfigurationVo insert(DomainObjectMap map, ims.core.vo.PacsConfigurationVo valueObject, ims.core.configuration.domain.objects.PACSConfiguration domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PACSConfiguration(domainObject.getId());
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
			
		// ServerAddress
		valueObject.setServerAddress(domainObject.getServerAddress());
		// UserNameParam
		valueObject.setUserNameParam(domainObject.getUserNameParam());
		// Username
		valueObject.setUsername(domainObject.getUsername());
		// PasswordParam
		valueObject.setPasswordParam(domainObject.getPasswordParam());
		// Password
		valueObject.setPassword(domainObject.getPassword());
		// AccessionParam
		valueObject.setAccessionParam(domainObject.getAccessionParam());
		// AccessionTestValue
		valueObject.setAccessionTestValue(domainObject.getAccessionTestValue());
		// PACSClientType
		ims.domain.lookups.LookupInstance instance8 = domainObject.getPACSClientType();
		if ( null != instance8 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance8.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance8.getImage().getImageId(), instance8.getImage().getImagePath());
			}
			color = instance8.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.PACSClientType voLookup8 = new ims.core.vo.lookups.PACSClientType(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.core.vo.lookups.PACSClientType parentVoLookup8 = voLookup8;
			ims.domain.lookups.LookupInstance parent8 = instance8.getParent();
			while (parent8 != null)
			{
				if (parent8.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent8.getImage().getImageId(), parent8.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent8.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup8.setParent(new ims.core.vo.lookups.PACSClientType(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setPACSClientType(voLookup8);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.configuration.domain.objects.PACSConfiguration extractPACSConfiguration(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PacsConfigurationVo valueObject) 
	{
		return 	extractPACSConfiguration(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.configuration.domain.objects.PACSConfiguration extractPACSConfiguration(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PacsConfigurationVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PACSConfiguration();
		ims.core.configuration.domain.objects.PACSConfiguration domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.configuration.domain.objects.PACSConfiguration)domMap.get(valueObject);
			}
			// ims.core.vo.PacsConfigurationVo ID_PACSConfiguration field is unknown
			domainObject = new ims.core.configuration.domain.objects.PACSConfiguration();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PACSConfiguration());
			if (domMap.get(key) != null)
			{
				return (ims.core.configuration.domain.objects.PACSConfiguration)domMap.get(key);
			}
			domainObject = (ims.core.configuration.domain.objects.PACSConfiguration) domainFactory.getDomainObject(ims.core.configuration.domain.objects.PACSConfiguration.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PACSConfiguration());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getServerAddress() != null && valueObject.getServerAddress().equals(""))
		{
			valueObject.setServerAddress(null);
		}
		domainObject.setServerAddress(valueObject.getServerAddress());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getUserNameParam() != null && valueObject.getUserNameParam().equals(""))
		{
			valueObject.setUserNameParam(null);
		}
		domainObject.setUserNameParam(valueObject.getUserNameParam());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getUsername() != null && valueObject.getUsername().equals(""))
		{
			valueObject.setUsername(null);
		}
		domainObject.setUsername(valueObject.getUsername());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPasswordParam() != null && valueObject.getPasswordParam().equals(""))
		{
			valueObject.setPasswordParam(null);
		}
		domainObject.setPasswordParam(valueObject.getPasswordParam());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPassword() != null && valueObject.getPassword().equals(""))
		{
			valueObject.setPassword(null);
		}
		domainObject.setPassword(valueObject.getPassword());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAccessionParam() != null && valueObject.getAccessionParam().equals(""))
		{
			valueObject.setAccessionParam(null);
		}
		domainObject.setAccessionParam(valueObject.getAccessionParam());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAccessionTestValue() != null && valueObject.getAccessionTestValue().equals(""))
		{
			valueObject.setAccessionTestValue(null);
		}
		domainObject.setAccessionTestValue(valueObject.getAccessionTestValue());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getPACSClientType() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getPACSClientType().getID());
		}
		domainObject.setPACSClientType(value8);

		return domainObject;
	}

}
