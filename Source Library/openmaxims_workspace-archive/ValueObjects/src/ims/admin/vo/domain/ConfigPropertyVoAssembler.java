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
 * @author John MacEnri
 */
public class ConfigPropertyVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.admin.vo.ConfigPropertyVo copy(ims.admin.vo.ConfigPropertyVo valueObjectDest, ims.admin.vo.ConfigPropertyVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ConfigProperty(valueObjectSrc.getID_ConfigProperty());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// PropertyName
		valueObjectDest.setPropertyName(valueObjectSrc.getPropertyName());
		// PropertyValue
		valueObjectDest.setPropertyValue(valueObjectSrc.getPropertyValue());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createConfigPropertyVoCollectionFromConfigProperty(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.generic.domain.objects.ConfigProperty objects.
	 */
	public static ims.admin.vo.ConfigPropertyVoCollection createConfigPropertyVoCollectionFromConfigProperty(java.util.Set domainObjectSet)	
	{
		return createConfigPropertyVoCollectionFromConfigProperty(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.generic.domain.objects.ConfigProperty objects.
	 */
	public static ims.admin.vo.ConfigPropertyVoCollection createConfigPropertyVoCollectionFromConfigProperty(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.admin.vo.ConfigPropertyVoCollection voList = new ims.admin.vo.ConfigPropertyVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.generic.domain.objects.ConfigProperty domainObject = (ims.core.generic.domain.objects.ConfigProperty) iterator.next();
			ims.admin.vo.ConfigPropertyVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.generic.domain.objects.ConfigProperty objects.
	 */
	public static ims.admin.vo.ConfigPropertyVoCollection createConfigPropertyVoCollectionFromConfigProperty(java.util.List domainObjectList) 
	{
		return createConfigPropertyVoCollectionFromConfigProperty(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.generic.domain.objects.ConfigProperty objects.
	 */
	public static ims.admin.vo.ConfigPropertyVoCollection createConfigPropertyVoCollectionFromConfigProperty(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.admin.vo.ConfigPropertyVoCollection voList = new ims.admin.vo.ConfigPropertyVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.generic.domain.objects.ConfigProperty domainObject = (ims.core.generic.domain.objects.ConfigProperty) domainObjectList.get(i);
			ims.admin.vo.ConfigPropertyVo vo = create(map, domainObject);

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
	 * Create the ims.core.generic.domain.objects.ConfigProperty set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractConfigPropertySet(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.ConfigPropertyVoCollection voCollection) 
	 {
	 	return extractConfigPropertySet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractConfigPropertySet(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.ConfigPropertyVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.admin.vo.ConfigPropertyVo vo = voCollection.get(i);
			ims.core.generic.domain.objects.ConfigProperty domainObject = ConfigPropertyVoAssembler.extractConfigProperty(domainFactory, vo, domMap);

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
	 * Create the ims.core.generic.domain.objects.ConfigProperty list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractConfigPropertyList(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.ConfigPropertyVoCollection voCollection) 
	 {
	 	return extractConfigPropertyList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractConfigPropertyList(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.ConfigPropertyVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.admin.vo.ConfigPropertyVo vo = voCollection.get(i);
			ims.core.generic.domain.objects.ConfigProperty domainObject = ConfigPropertyVoAssembler.extractConfigProperty(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.generic.domain.objects.ConfigProperty object.
	 * @param domainObject ims.core.generic.domain.objects.ConfigProperty
	 */
	 public static ims.admin.vo.ConfigPropertyVo create(ims.core.generic.domain.objects.ConfigProperty domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.generic.domain.objects.ConfigProperty object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.admin.vo.ConfigPropertyVo create(DomainObjectMap map, ims.core.generic.domain.objects.ConfigProperty domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.admin.vo.ConfigPropertyVo valueObject = (ims.admin.vo.ConfigPropertyVo) map.getValueObject(domainObject, ims.admin.vo.ConfigPropertyVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.admin.vo.ConfigPropertyVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.generic.domain.objects.ConfigProperty
	 */
	 public static ims.admin.vo.ConfigPropertyVo insert(ims.admin.vo.ConfigPropertyVo valueObject, ims.core.generic.domain.objects.ConfigProperty domainObject) 
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
	 * @param domainObject ims.core.generic.domain.objects.ConfigProperty
	 */
	 public static ims.admin.vo.ConfigPropertyVo insert(DomainObjectMap map, ims.admin.vo.ConfigPropertyVo valueObject, ims.core.generic.domain.objects.ConfigProperty domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ConfigProperty(domainObject.getId());
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
			
		// PropertyName
		valueObject.setPropertyName(domainObject.getPropertyName());
		// PropertyValue
		valueObject.setPropertyValue(domainObject.getPropertyValue());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.generic.domain.objects.ConfigProperty extractConfigProperty(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.ConfigPropertyVo valueObject) 
	{
		return 	extractConfigProperty(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.generic.domain.objects.ConfigProperty extractConfigProperty(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.ConfigPropertyVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ConfigProperty();
		ims.core.generic.domain.objects.ConfigProperty domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.generic.domain.objects.ConfigProperty)domMap.get(valueObject);
			}
			// ims.admin.vo.ConfigPropertyVo ID_ConfigProperty field is unknown
			domainObject = new ims.core.generic.domain.objects.ConfigProperty();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ConfigProperty());
			if (domMap.get(key) != null)
			{
				return (ims.core.generic.domain.objects.ConfigProperty)domMap.get(key);
			}
			domainObject = (ims.core.generic.domain.objects.ConfigProperty) domainFactory.getDomainObject(ims.core.generic.domain.objects.ConfigProperty.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ConfigProperty());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPropertyName() != null && valueObject.getPropertyName().equals(""))
		{
			valueObject.setPropertyName(null);
		}
		domainObject.setPropertyName(valueObject.getPropertyName());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPropertyValue() != null && valueObject.getPropertyValue().equals(""))
		{
			valueObject.setPropertyValue(null);
		}
		domainObject.setPropertyValue(valueObject.getPropertyValue());

		return domainObject;
	}

}
