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
		// Name
		valueObjectDest.setName(valueObjectSrc.getName());
		// Status
		valueObjectDest.setStatus(valueObjectSrc.getStatus());
		// isTemplate
		valueObjectDest.setIsTemplate(valueObjectSrc.getIsTemplate());
		// BedSpaces
		valueObjectDest.setBedSpaces(valueObjectSrc.getBedSpaces());
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
		// Name
		valueObject.setName(domainObject.getName());
		// Status
		ims.domain.lookups.LookupInstance instance3 = domainObject.getStatus();
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

			ims.core.vo.lookups.PreActiveActiveInactiveStatus voLookup3 = new ims.core.vo.lookups.PreActiveActiveInactiveStatus(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.PreActiveActiveInactiveStatus parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.core.vo.lookups.PreActiveActiveInactiveStatus(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setStatus(voLookup3);
		}
				// isTemplate
		valueObject.setIsTemplate( domainObject.isIsTemplate() );
		// BedSpaces
		valueObject.setBedSpaces(ims.core.vo.domain.BedSpaceVoAssembler.createBedSpaceVoCollectionFromBedSpace(map, domainObject.getBedSpaces()) );
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
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getName() != null && valueObject.getName().equals(""))
		{
			valueObject.setName(null);
		}
		domainObject.setName(valueObject.getName());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getStatus() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getStatus().getID());
		}
		domainObject.setStatus(value3);
		domainObject.setIsTemplate(valueObject.getIsTemplate());
		domainObject.setBedSpaces(ims.core.vo.domain.BedSpaceVoAssembler.extractBedSpaceSet(domainFactory, valueObject.getBedSpaces(), domainObject.getBedSpaces(), domMap));		

		return domainObject;
	}

}
