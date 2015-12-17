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
public class TelecomUsageTypeVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.TelecomUsageTypeVo copy(ims.core.vo.TelecomUsageTypeVo valueObjectDest, ims.core.vo.TelecomUsageTypeVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_TelecomUsageType(valueObjectSrc.getID_TelecomUsageType());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Usage
		valueObjectDest.setUsage(valueObjectSrc.getUsage());
		// ChannelTypes
		valueObjectDest.setChannelTypes(valueObjectSrc.getChannelTypes());
		// DefaultChannelType
		valueObjectDest.setDefaultChannelType(valueObjectSrc.getDefaultChannelType());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createTelecomUsageTypeVoCollectionFromTelecomUsageType(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.TelecomUsageType objects.
	 */
	public static ims.core.vo.TelecomUsageTypeVoCollection createTelecomUsageTypeVoCollectionFromTelecomUsageType(java.util.Set domainObjectSet)	
	{
		return createTelecomUsageTypeVoCollectionFromTelecomUsageType(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.TelecomUsageType objects.
	 */
	public static ims.core.vo.TelecomUsageTypeVoCollection createTelecomUsageTypeVoCollectionFromTelecomUsageType(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.TelecomUsageTypeVoCollection voList = new ims.core.vo.TelecomUsageTypeVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.domain.objects.TelecomUsageType domainObject = (ims.core.admin.domain.objects.TelecomUsageType) iterator.next();
			ims.core.vo.TelecomUsageTypeVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.domain.objects.TelecomUsageType objects.
	 */
	public static ims.core.vo.TelecomUsageTypeVoCollection createTelecomUsageTypeVoCollectionFromTelecomUsageType(java.util.List domainObjectList) 
	{
		return createTelecomUsageTypeVoCollectionFromTelecomUsageType(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.domain.objects.TelecomUsageType objects.
	 */
	public static ims.core.vo.TelecomUsageTypeVoCollection createTelecomUsageTypeVoCollectionFromTelecomUsageType(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.TelecomUsageTypeVoCollection voList = new ims.core.vo.TelecomUsageTypeVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.domain.objects.TelecomUsageType domainObject = (ims.core.admin.domain.objects.TelecomUsageType) domainObjectList.get(i);
			ims.core.vo.TelecomUsageTypeVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.domain.objects.TelecomUsageType set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractTelecomUsageTypeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.TelecomUsageTypeVoCollection voCollection) 
	 {
	 	return extractTelecomUsageTypeSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractTelecomUsageTypeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.TelecomUsageTypeVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.TelecomUsageTypeVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.TelecomUsageType domainObject = TelecomUsageTypeVoAssembler.extractTelecomUsageType(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.domain.objects.TelecomUsageType list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractTelecomUsageTypeList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.TelecomUsageTypeVoCollection voCollection) 
	 {
	 	return extractTelecomUsageTypeList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractTelecomUsageTypeList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.TelecomUsageTypeVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.TelecomUsageTypeVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.TelecomUsageType domainObject = TelecomUsageTypeVoAssembler.extractTelecomUsageType(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.domain.objects.TelecomUsageType object.
	 * @param domainObject ims.core.admin.domain.objects.TelecomUsageType
	 */
	 public static ims.core.vo.TelecomUsageTypeVo create(ims.core.admin.domain.objects.TelecomUsageType domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.domain.objects.TelecomUsageType object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.TelecomUsageTypeVo create(DomainObjectMap map, ims.core.admin.domain.objects.TelecomUsageType domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.TelecomUsageTypeVo valueObject = (ims.core.vo.TelecomUsageTypeVo) map.getValueObject(domainObject, ims.core.vo.TelecomUsageTypeVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.TelecomUsageTypeVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.domain.objects.TelecomUsageType
	 */
	 public static ims.core.vo.TelecomUsageTypeVo insert(ims.core.vo.TelecomUsageTypeVo valueObject, ims.core.admin.domain.objects.TelecomUsageType domainObject) 
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
	 * @param domainObject ims.core.admin.domain.objects.TelecomUsageType
	 */
	 public static ims.core.vo.TelecomUsageTypeVo insert(DomainObjectMap map, ims.core.vo.TelecomUsageTypeVo valueObject, ims.core.admin.domain.objects.TelecomUsageType domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_TelecomUsageType(domainObject.getId());
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
			
		// Usage
		ims.domain.lookups.LookupInstance instance1 = domainObject.getUsage();
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

			ims.core.vo.lookups.PDSChannelUsage voLookup1 = new ims.core.vo.lookups.PDSChannelUsage(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.core.vo.lookups.PDSChannelUsage parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.core.vo.lookups.PDSChannelUsage(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setUsage(voLookup1);
		}
				// ChannelTypes
		java.util.List listChannelTypes = domainObject.getChannelTypes();
		ims.core.vo.lookups.ChannelTypeCollection ChannelTypes = new ims.core.vo.lookups.ChannelTypeCollection();
		for(java.util.Iterator iterator = listChannelTypes.iterator(); iterator.hasNext(); ) 
		{
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;
		
			ims.domain.lookups.LookupInstance instance = 
				(ims.domain.lookups.LookupInstance) iterator.next();
			if (instance.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance.getImage().getImageId(), instance.getImage().getImagePath());
			}
			else 
			{
				img = null;
			}
			color = instance.getColor();
			if (color != null) 
				color.getValue();
			ims.core.vo.lookups.ChannelType voInstance = new ims.core.vo.lookups.ChannelType(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.core.vo.lookups.ChannelType parentVoInstance = voInstance;
			ims.domain.lookups.LookupInstance parent = instance.getParent();
			while (parent != null)
			{
				if (parent.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent.getImage().getImageId(), parent.getImage().getImagePath());
				}
				else 
				{
					img = null;
				}
				color = parent.getColor();
				if (color != null) 
					color.getValue();
								parentVoInstance.setParent(new ims.core.vo.lookups.ChannelType(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			ChannelTypes.add(voInstance);
		}
		valueObject.setChannelTypes( ChannelTypes );
		// DefaultChannelType
		ims.domain.lookups.LookupInstance instance3 = domainObject.getDefaultChannelType();
		if ( null != instance3 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance3.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance3.getImage().getImageId(), instance3.getImage().getImagePath());
			}
			color = instance3.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.ChannelType voLookup3 = new ims.core.vo.lookups.ChannelType(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.ChannelType parentVoLookup3 = voLookup3;
			ims.domain.lookups.LookupInstance parent3 = instance3.getParent();
			while (parent3 != null)
			{
				if (parent3.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent3.getImage().getImageId(), parent3.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent3.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup3.setParent(new ims.core.vo.lookups.ChannelType(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setDefaultChannelType(voLookup3);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.domain.objects.TelecomUsageType extractTelecomUsageType(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.TelecomUsageTypeVo valueObject) 
	{
		return 	extractTelecomUsageType(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.domain.objects.TelecomUsageType extractTelecomUsageType(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.TelecomUsageTypeVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_TelecomUsageType();
		ims.core.admin.domain.objects.TelecomUsageType domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.domain.objects.TelecomUsageType)domMap.get(valueObject);
			}
			// ims.core.vo.TelecomUsageTypeVo ID_TelecomUsageType field is unknown
			domainObject = new ims.core.admin.domain.objects.TelecomUsageType();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_TelecomUsageType());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.domain.objects.TelecomUsageType)domMap.get(key);
			}
			domainObject = (ims.core.admin.domain.objects.TelecomUsageType) domainFactory.getDomainObject(ims.core.admin.domain.objects.TelecomUsageType.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_TelecomUsageType());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getUsage() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getUsage().getID());
		}
		domainObject.setUsage(value1);
		ims.core.vo.lookups.ChannelTypeCollection collection2 =
	valueObject.getChannelTypes();
	    java.util.List domainChannelTypes = domainObject.getChannelTypes();;			
	    int collection2Size=0;
		if (collection2 == null)
		{
			domainChannelTypes = new java.util.ArrayList(0);
		}
		else
		{
			collection2Size = collection2.size();
		}
		
		for(int i=0; i<collection2Size; i++) 
		{
			int instanceId = collection2.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainChannelTypes.indexOf(dom);
			if (domIdx == -1)
			{
				domainChannelTypes.add(i, dom);
			}
			else if (i != domIdx && i < domainChannelTypes.size())
			{
				Object tmp = domainChannelTypes.get(i);
				domainChannelTypes.set(i, domainChannelTypes.get(domIdx));
				domainChannelTypes.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j2 = domainChannelTypes.size();
		while (j2 > collection2Size)
		{
			domainChannelTypes.remove(j2-1);
			j2 = domainChannelTypes.size();
		}

		domainObject.setChannelTypes(domainChannelTypes);		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getDefaultChannelType() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getDefaultChannelType().getID());
		}
		domainObject.setDefaultChannelType(value3);

		return domainObject;
	}

}
