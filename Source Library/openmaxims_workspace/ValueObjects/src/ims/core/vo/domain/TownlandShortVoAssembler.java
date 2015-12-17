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
 * @author Cristian Belciug
 */
public class TownlandShortVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.TownlandShortVo copy(ims.core.vo.TownlandShortVo valueObjectDest, ims.core.vo.TownlandShortVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Townland(valueObjectSrc.getID_Townland());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Name
		valueObjectDest.setName(valueObjectSrc.getName());
		// isActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
		// DED
		valueObjectDest.setDED(valueObjectSrc.getDED());
		// County
		valueObjectDest.setCounty(valueObjectSrc.getCounty());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createTownlandShortVoCollectionFromTownland(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.resource.place.domain.objects.Townland objects.
	 */
	public static ims.core.vo.TownlandShortVoCollection createTownlandShortVoCollectionFromTownland(java.util.Set domainObjectSet)	
	{
		return createTownlandShortVoCollectionFromTownland(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.resource.place.domain.objects.Townland objects.
	 */
	public static ims.core.vo.TownlandShortVoCollection createTownlandShortVoCollectionFromTownland(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.TownlandShortVoCollection voList = new ims.core.vo.TownlandShortVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.resource.place.domain.objects.Townland domainObject = (ims.core.resource.place.domain.objects.Townland) iterator.next();
			ims.core.vo.TownlandShortVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.resource.place.domain.objects.Townland objects.
	 */
	public static ims.core.vo.TownlandShortVoCollection createTownlandShortVoCollectionFromTownland(java.util.List domainObjectList) 
	{
		return createTownlandShortVoCollectionFromTownland(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.resource.place.domain.objects.Townland objects.
	 */
	public static ims.core.vo.TownlandShortVoCollection createTownlandShortVoCollectionFromTownland(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.TownlandShortVoCollection voList = new ims.core.vo.TownlandShortVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.resource.place.domain.objects.Townland domainObject = (ims.core.resource.place.domain.objects.Townland) domainObjectList.get(i);
			ims.core.vo.TownlandShortVo vo = create(map, domainObject);

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
	 * Create the ims.core.resource.place.domain.objects.Townland set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractTownlandSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.TownlandShortVoCollection voCollection) 
	 {
	 	return extractTownlandSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractTownlandSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.TownlandShortVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.TownlandShortVo vo = voCollection.get(i);
			ims.core.resource.place.domain.objects.Townland domainObject = TownlandShortVoAssembler.extractTownland(domainFactory, vo, domMap);

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
	 * Create the ims.core.resource.place.domain.objects.Townland list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractTownlandList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.TownlandShortVoCollection voCollection) 
	 {
	 	return extractTownlandList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractTownlandList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.TownlandShortVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.TownlandShortVo vo = voCollection.get(i);
			ims.core.resource.place.domain.objects.Townland domainObject = TownlandShortVoAssembler.extractTownland(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.resource.place.domain.objects.Townland object.
	 * @param domainObject ims.core.resource.place.domain.objects.Townland
	 */
	 public static ims.core.vo.TownlandShortVo create(ims.core.resource.place.domain.objects.Townland domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.resource.place.domain.objects.Townland object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.TownlandShortVo create(DomainObjectMap map, ims.core.resource.place.domain.objects.Townland domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.TownlandShortVo valueObject = (ims.core.vo.TownlandShortVo) map.getValueObject(domainObject, ims.core.vo.TownlandShortVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.TownlandShortVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.resource.place.domain.objects.Townland
	 */
	 public static ims.core.vo.TownlandShortVo insert(ims.core.vo.TownlandShortVo valueObject, ims.core.resource.place.domain.objects.Townland domainObject) 
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
	 * @param domainObject ims.core.resource.place.domain.objects.Townland
	 */
	 public static ims.core.vo.TownlandShortVo insert(DomainObjectMap map, ims.core.vo.TownlandShortVo valueObject, ims.core.resource.place.domain.objects.Townland domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Townland(domainObject.getId());
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
			
		// Name
		valueObject.setName(domainObject.getName());
		// isActive
		valueObject.setIsActive( domainObject.isIsActive() );
		// DED
		valueObject.setDED(ims.core.vo.domain.DEDLiteVoAssembler.create(map, domainObject.getDED()) );
		// County
		ims.domain.lookups.LookupInstance instance4 = domainObject.getCounty();
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

			ims.ntpf.vo.lookups.County voLookup4 = new ims.ntpf.vo.lookups.County(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.ntpf.vo.lookups.County parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.ntpf.vo.lookups.County(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setCounty(voLookup4);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.resource.place.domain.objects.Townland extractTownland(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.TownlandShortVo valueObject) 
	{
		return 	extractTownland(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.resource.place.domain.objects.Townland extractTownland(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.TownlandShortVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Townland();
		ims.core.resource.place.domain.objects.Townland domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.resource.place.domain.objects.Townland)domMap.get(valueObject);
			}
			// ims.core.vo.TownlandShortVo ID_Townland field is unknown
			domainObject = new ims.core.resource.place.domain.objects.Townland();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Townland());
			if (domMap.get(key) != null)
			{
				return (ims.core.resource.place.domain.objects.Townland)domMap.get(key);
			}
			domainObject = (ims.core.resource.place.domain.objects.Townland) domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Townland.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Townland());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getName() != null && valueObject.getName().equals(""))
		{
			valueObject.setName(null);
		}
		domainObject.setName(valueObject.getName());
		domainObject.setIsActive(valueObject.getIsActive());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.DED value3 = null;
		if ( null != valueObject.getDED() ) 
		{
			if (valueObject.getDED().getBoId() == null)
			{
				if (domMap.get(valueObject.getDED()) != null)
				{
					value3 = (ims.core.resource.place.domain.objects.DED)domMap.get(valueObject.getDED());
				}
			}
			else
			{
				value3 = (ims.core.resource.place.domain.objects.DED)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.DED.class, valueObject.getDED().getBoId());
			}
		}
		domainObject.setDED(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getCounty() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getCounty().getID());
		}
		domainObject.setCounty(value4);

		return domainObject;
	}

}
