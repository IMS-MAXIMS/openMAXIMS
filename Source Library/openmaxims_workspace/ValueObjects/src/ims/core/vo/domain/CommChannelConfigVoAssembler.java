//#############################################################################
//#                                                                           #
//#  Copyright (C) <2015>  <IMS MAXIMS>                                       #
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
//#  IMS MAXIMS provides absolutely NO GUARANTEE OF THE CLINICAL SAFTEY of    #
//#  this program.  Users of this software do so entirely at their own risk.  #
//#  IMS MAXIMS only ensures the Clinical Safety of unaltered run-time        #
//#  software that it builds, deploys and maintains.                          #
//#                                                                           #
//#############################################################################
//#EOH
/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5589.25814)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated on 12/10/2015, 13:24
 *
 */
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Vasile Purdila
 */
public class CommChannelConfigVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.CommChannelConfigVo copy(ims.core.vo.CommChannelConfigVo valueObjectDest, ims.core.vo.CommChannelConfigVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_CommChannelsConfig(valueObjectSrc.getID_CommChannelsConfig());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// TelecomTypes
		valueObjectDest.setTelecomTypes(valueObjectSrc.getTelecomTypes());
		// Mappings
		valueObjectDest.setMappings(valueObjectSrc.getMappings());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createCommChannelConfigVoCollectionFromCommChannelsConfig(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.CommChannelsConfig objects.
	 */
	public static ims.core.vo.CommChannelConfigVoCollection createCommChannelConfigVoCollectionFromCommChannelsConfig(java.util.Set domainObjectSet)	
	{
		return createCommChannelConfigVoCollectionFromCommChannelsConfig(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.CommChannelsConfig objects.
	 */
	public static ims.core.vo.CommChannelConfigVoCollection createCommChannelConfigVoCollectionFromCommChannelsConfig(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.CommChannelConfigVoCollection voList = new ims.core.vo.CommChannelConfigVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.domain.objects.CommChannelsConfig domainObject = (ims.core.admin.domain.objects.CommChannelsConfig) iterator.next();
			ims.core.vo.CommChannelConfigVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.domain.objects.CommChannelsConfig objects.
	 */
	public static ims.core.vo.CommChannelConfigVoCollection createCommChannelConfigVoCollectionFromCommChannelsConfig(java.util.List domainObjectList) 
	{
		return createCommChannelConfigVoCollectionFromCommChannelsConfig(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.domain.objects.CommChannelsConfig objects.
	 */
	public static ims.core.vo.CommChannelConfigVoCollection createCommChannelConfigVoCollectionFromCommChannelsConfig(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.CommChannelConfigVoCollection voList = new ims.core.vo.CommChannelConfigVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.domain.objects.CommChannelsConfig domainObject = (ims.core.admin.domain.objects.CommChannelsConfig) domainObjectList.get(i);
			ims.core.vo.CommChannelConfigVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.domain.objects.CommChannelsConfig set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractCommChannelsConfigSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CommChannelConfigVoCollection voCollection) 
	 {
	 	return extractCommChannelsConfigSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractCommChannelsConfigSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CommChannelConfigVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.CommChannelConfigVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.CommChannelsConfig domainObject = CommChannelConfigVoAssembler.extractCommChannelsConfig(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.domain.objects.CommChannelsConfig list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractCommChannelsConfigList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CommChannelConfigVoCollection voCollection) 
	 {
	 	return extractCommChannelsConfigList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractCommChannelsConfigList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CommChannelConfigVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.CommChannelConfigVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.CommChannelsConfig domainObject = CommChannelConfigVoAssembler.extractCommChannelsConfig(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.domain.objects.CommChannelsConfig object.
	 * @param domainObject ims.core.admin.domain.objects.CommChannelsConfig
	 */
	 public static ims.core.vo.CommChannelConfigVo create(ims.core.admin.domain.objects.CommChannelsConfig domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.domain.objects.CommChannelsConfig object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.CommChannelConfigVo create(DomainObjectMap map, ims.core.admin.domain.objects.CommChannelsConfig domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.CommChannelConfigVo valueObject = (ims.core.vo.CommChannelConfigVo) map.getValueObject(domainObject, ims.core.vo.CommChannelConfigVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.CommChannelConfigVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.domain.objects.CommChannelsConfig
	 */
	 public static ims.core.vo.CommChannelConfigVo insert(ims.core.vo.CommChannelConfigVo valueObject, ims.core.admin.domain.objects.CommChannelsConfig domainObject) 
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
	 * @param domainObject ims.core.admin.domain.objects.CommChannelsConfig
	 */
	 public static ims.core.vo.CommChannelConfigVo insert(DomainObjectMap map, ims.core.vo.CommChannelConfigVo valueObject, ims.core.admin.domain.objects.CommChannelsConfig domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_CommChannelsConfig(domainObject.getId());
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
			
		// TelecomTypes
		valueObject.setTelecomTypes(ims.core.vo.domain.TelecomTypeVoAssembler.createTelecomTypeVoCollectionFromTelecomType(map, domainObject.getTelecomTypes()) );
		// Mappings
		valueObject.setMappings(ims.core.vo.domain.TelecomUsageTypeVoAssembler.createTelecomUsageTypeVoCollectionFromTelecomUsageType(map, domainObject.getMappings()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.domain.objects.CommChannelsConfig extractCommChannelsConfig(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CommChannelConfigVo valueObject) 
	{
		return 	extractCommChannelsConfig(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.domain.objects.CommChannelsConfig extractCommChannelsConfig(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CommChannelConfigVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_CommChannelsConfig();
		ims.core.admin.domain.objects.CommChannelsConfig domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.domain.objects.CommChannelsConfig)domMap.get(valueObject);
			}
			// ims.core.vo.CommChannelConfigVo ID_CommChannelsConfig field is unknown
			domainObject = new ims.core.admin.domain.objects.CommChannelsConfig();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_CommChannelsConfig());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.domain.objects.CommChannelsConfig)domMap.get(key);
			}
			domainObject = (ims.core.admin.domain.objects.CommChannelsConfig) domainFactory.getDomainObject(ims.core.admin.domain.objects.CommChannelsConfig.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_CommChannelsConfig());

		domainObject.setTelecomTypes(ims.core.vo.domain.TelecomTypeVoAssembler.extractTelecomTypeList(domainFactory, valueObject.getTelecomTypes(), domainObject.getTelecomTypes(), domMap));		
		domainObject.setMappings(ims.core.vo.domain.TelecomUsageTypeVoAssembler.extractTelecomUsageTypeList(domainFactory, valueObject.getMappings(), domainObject.getMappings(), domMap));		

		return domainObject;
	}

}
