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
 * @author Marius Mihalec
 */
public class FloorBedSpaceLayoutVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.FloorBedSpaceLayoutVo copy(ims.core.vo.FloorBedSpaceLayoutVo valueObjectDest, ims.core.vo.FloorBedSpaceLayoutVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_FloorBedSpaceLayout(valueObjectSrc.getID_FloorBedSpaceLayout());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// FloorLayout
		valueObjectDest.setFloorLayout(valueObjectSrc.getFloorLayout());
		// BedSpaces
		valueObjectDest.setBedSpaces(valueObjectSrc.getBedSpaces());
		// Name
		valueObjectDest.setName(valueObjectSrc.getName());
		// Status
		valueObjectDest.setStatus(valueObjectSrc.getStatus());
		// isTemplate
		valueObjectDest.setIsTemplate(valueObjectSrc.getIsTemplate());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createFloorBedSpaceLayoutVoCollectionFromFloorBedSpaceLayout(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.layout.domain.objects.FloorBedSpaceLayout objects.
	 */
	public static ims.core.vo.FloorBedSpaceLayoutVoCollection createFloorBedSpaceLayoutVoCollectionFromFloorBedSpaceLayout(java.util.Set domainObjectSet)	
	{
		return createFloorBedSpaceLayoutVoCollectionFromFloorBedSpaceLayout(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.layout.domain.objects.FloorBedSpaceLayout objects.
	 */
	public static ims.core.vo.FloorBedSpaceLayoutVoCollection createFloorBedSpaceLayoutVoCollectionFromFloorBedSpaceLayout(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.FloorBedSpaceLayoutVoCollection voList = new ims.core.vo.FloorBedSpaceLayoutVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.layout.domain.objects.FloorBedSpaceLayout domainObject = (ims.core.layout.domain.objects.FloorBedSpaceLayout) iterator.next();
			ims.core.vo.FloorBedSpaceLayoutVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.layout.domain.objects.FloorBedSpaceLayout objects.
	 */
	public static ims.core.vo.FloorBedSpaceLayoutVoCollection createFloorBedSpaceLayoutVoCollectionFromFloorBedSpaceLayout(java.util.List domainObjectList) 
	{
		return createFloorBedSpaceLayoutVoCollectionFromFloorBedSpaceLayout(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.layout.domain.objects.FloorBedSpaceLayout objects.
	 */
	public static ims.core.vo.FloorBedSpaceLayoutVoCollection createFloorBedSpaceLayoutVoCollectionFromFloorBedSpaceLayout(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.FloorBedSpaceLayoutVoCollection voList = new ims.core.vo.FloorBedSpaceLayoutVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.layout.domain.objects.FloorBedSpaceLayout domainObject = (ims.core.layout.domain.objects.FloorBedSpaceLayout) domainObjectList.get(i);
			ims.core.vo.FloorBedSpaceLayoutVo vo = create(map, domainObject);

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
	 * Create the ims.core.layout.domain.objects.FloorBedSpaceLayout set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractFloorBedSpaceLayoutSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.FloorBedSpaceLayoutVoCollection voCollection) 
	 {
	 	return extractFloorBedSpaceLayoutSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractFloorBedSpaceLayoutSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.FloorBedSpaceLayoutVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.FloorBedSpaceLayoutVo vo = voCollection.get(i);
			ims.core.layout.domain.objects.FloorBedSpaceLayout domainObject = FloorBedSpaceLayoutVoAssembler.extractFloorBedSpaceLayout(domainFactory, vo, domMap);

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
	 * Create the ims.core.layout.domain.objects.FloorBedSpaceLayout list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractFloorBedSpaceLayoutList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.FloorBedSpaceLayoutVoCollection voCollection) 
	 {
	 	return extractFloorBedSpaceLayoutList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractFloorBedSpaceLayoutList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.FloorBedSpaceLayoutVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.FloorBedSpaceLayoutVo vo = voCollection.get(i);
			ims.core.layout.domain.objects.FloorBedSpaceLayout domainObject = FloorBedSpaceLayoutVoAssembler.extractFloorBedSpaceLayout(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.layout.domain.objects.FloorBedSpaceLayout object.
	 * @param domainObject ims.core.layout.domain.objects.FloorBedSpaceLayout
	 */
	 public static ims.core.vo.FloorBedSpaceLayoutVo create(ims.core.layout.domain.objects.FloorBedSpaceLayout domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.layout.domain.objects.FloorBedSpaceLayout object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.FloorBedSpaceLayoutVo create(DomainObjectMap map, ims.core.layout.domain.objects.FloorBedSpaceLayout domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.FloorBedSpaceLayoutVo valueObject = (ims.core.vo.FloorBedSpaceLayoutVo) map.getValueObject(domainObject, ims.core.vo.FloorBedSpaceLayoutVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.FloorBedSpaceLayoutVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.layout.domain.objects.FloorBedSpaceLayout
	 */
	 public static ims.core.vo.FloorBedSpaceLayoutVo insert(ims.core.vo.FloorBedSpaceLayoutVo valueObject, ims.core.layout.domain.objects.FloorBedSpaceLayout domainObject) 
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
	 * @param domainObject ims.core.layout.domain.objects.FloorBedSpaceLayout
	 */
	 public static ims.core.vo.FloorBedSpaceLayoutVo insert(DomainObjectMap map, ims.core.vo.FloorBedSpaceLayoutVo valueObject, ims.core.layout.domain.objects.FloorBedSpaceLayout domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_FloorBedSpaceLayout(domainObject.getId());
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
			
		// FloorLayout
		valueObject.setFloorLayout(ims.core.vo.domain.FloorLayoutVoAssembler.create(map, domainObject.getFloorLayout()) );
		// BedSpaces
		valueObject.setBedSpaces(ims.core.vo.domain.BedSpaceVoAssembler.createBedSpaceVoCollectionFromBedSpace(map, domainObject.getBedSpaces()) );
		// Name
		valueObject.setName(domainObject.getName());
		// Status
		ims.domain.lookups.LookupInstance instance4 = domainObject.getStatus();
		if ( null != instance4 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance4.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance4.getImage().getImageId(), instance4.getImage().getImagePath());
			}
			color = instance4.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.PreActiveActiveInactiveStatus voLookup4 = new ims.core.vo.lookups.PreActiveActiveInactiveStatus(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.PreActiveActiveInactiveStatus parentVoLookup4 = voLookup4;
			ims.domain.lookups.LookupInstance parent4 = instance4.getParent();
			while (parent4 != null)
			{
				if (parent4.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent4.getImage().getImageId(), parent4.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent4.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup4.setParent(new ims.core.vo.lookups.PreActiveActiveInactiveStatus(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setStatus(voLookup4);
		}
				// isTemplate
		valueObject.setIsTemplate( domainObject.isIsTemplate() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.layout.domain.objects.FloorBedSpaceLayout extractFloorBedSpaceLayout(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.FloorBedSpaceLayoutVo valueObject) 
	{
		return 	extractFloorBedSpaceLayout(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.layout.domain.objects.FloorBedSpaceLayout extractFloorBedSpaceLayout(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.FloorBedSpaceLayoutVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_FloorBedSpaceLayout();
		ims.core.layout.domain.objects.FloorBedSpaceLayout domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.layout.domain.objects.FloorBedSpaceLayout)domMap.get(valueObject);
			}
			// ims.core.vo.FloorBedSpaceLayoutVo ID_FloorBedSpaceLayout field is unknown
			domainObject = new ims.core.layout.domain.objects.FloorBedSpaceLayout();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_FloorBedSpaceLayout());
			if (domMap.get(key) != null)
			{
				return (ims.core.layout.domain.objects.FloorBedSpaceLayout)domMap.get(key);
			}
			domainObject = (ims.core.layout.domain.objects.FloorBedSpaceLayout) domainFactory.getDomainObject(ims.core.layout.domain.objects.FloorBedSpaceLayout.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_FloorBedSpaceLayout());

		domainObject.setFloorLayout(ims.core.vo.domain.FloorLayoutVoAssembler.extractFloorLayout(domainFactory, valueObject.getFloorLayout(), domMap));
		domainObject.setBedSpaces(ims.core.vo.domain.BedSpaceVoAssembler.extractBedSpaceSet(domainFactory, valueObject.getBedSpaces(), domainObject.getBedSpaces(), domMap));		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getName() != null && valueObject.getName().equals(""))
		{
			valueObject.setName(null);
		}
		domainObject.setName(valueObject.getName());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getStatus() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getStatus().getID());
		}
		domainObject.setStatus(value4);
		domainObject.setIsTemplate(valueObject.getIsTemplate());

		return domainObject;
	}

}
