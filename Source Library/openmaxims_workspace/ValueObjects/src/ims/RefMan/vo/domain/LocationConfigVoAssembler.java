/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated on 16/04/2014, 12:32
 *
 */
package ims.RefMan.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cornel Ventuneac
 */
public class LocationConfigVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.LocationConfigVo copy(ims.RefMan.vo.LocationConfigVo valueObjectDest, ims.RefMan.vo.LocationConfigVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Location(valueObjectSrc.getID_Location());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Locations
		valueObjectDest.setLocations(valueObjectSrc.getLocations());
		// Name
		valueObjectDest.setName(valueObjectSrc.getName());
		// Type
		valueObjectDest.setType(valueObjectSrc.getType());
		// isActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
		// Address
		valueObjectDest.setAddress(valueObjectSrc.getAddress());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createLocationConfigVoCollectionFromLocation(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.resource.place.domain.objects.Location objects.
	 */
	public static ims.RefMan.vo.LocationConfigVoCollection createLocationConfigVoCollectionFromLocation(java.util.Set domainObjectSet)	
	{
		return createLocationConfigVoCollectionFromLocation(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.resource.place.domain.objects.Location objects.
	 */
	public static ims.RefMan.vo.LocationConfigVoCollection createLocationConfigVoCollectionFromLocation(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.LocationConfigVoCollection voList = new ims.RefMan.vo.LocationConfigVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.resource.place.domain.objects.Location domainObject = (ims.core.resource.place.domain.objects.Location) iterator.next();
			ims.RefMan.vo.LocationConfigVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.resource.place.domain.objects.Location objects.
	 */
	public static ims.RefMan.vo.LocationConfigVoCollection createLocationConfigVoCollectionFromLocation(java.util.List domainObjectList) 
	{
		return createLocationConfigVoCollectionFromLocation(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.resource.place.domain.objects.Location objects.
	 */
	public static ims.RefMan.vo.LocationConfigVoCollection createLocationConfigVoCollectionFromLocation(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.LocationConfigVoCollection voList = new ims.RefMan.vo.LocationConfigVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.resource.place.domain.objects.Location domainObject = (ims.core.resource.place.domain.objects.Location) domainObjectList.get(i);
			ims.RefMan.vo.LocationConfigVo vo = create(map, domainObject);

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
	 * Create the ims.core.resource.place.domain.objects.Location set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractLocationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.LocationConfigVoCollection voCollection) 
	 {
	 	return extractLocationSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractLocationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.LocationConfigVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.LocationConfigVo vo = voCollection.get(i);
			ims.core.resource.place.domain.objects.Location domainObject = LocationConfigVoAssembler.extractLocation(domainFactory, vo, domMap);

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
	 * Create the ims.core.resource.place.domain.objects.Location list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractLocationList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.LocationConfigVoCollection voCollection) 
	 {
	 	return extractLocationList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractLocationList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.LocationConfigVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.LocationConfigVo vo = voCollection.get(i);
			ims.core.resource.place.domain.objects.Location domainObject = LocationConfigVoAssembler.extractLocation(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.resource.place.domain.objects.Location object.
	 * @param domainObject ims.core.resource.place.domain.objects.Location
	 */
	 public static ims.RefMan.vo.LocationConfigVo create(ims.core.resource.place.domain.objects.Location domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.resource.place.domain.objects.Location object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.LocationConfigVo create(DomainObjectMap map, ims.core.resource.place.domain.objects.Location domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.LocationConfigVo valueObject = (ims.RefMan.vo.LocationConfigVo) map.getValueObject(domainObject, ims.RefMan.vo.LocationConfigVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.LocationConfigVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.resource.place.domain.objects.Location
	 */
	 public static ims.RefMan.vo.LocationConfigVo insert(ims.RefMan.vo.LocationConfigVo valueObject, ims.core.resource.place.domain.objects.Location domainObject) 
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
	 * @param domainObject ims.core.resource.place.domain.objects.Location
	 */
	 public static ims.RefMan.vo.LocationConfigVo insert(DomainObjectMap map, ims.RefMan.vo.LocationConfigVo valueObject, ims.core.resource.place.domain.objects.Location domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Location(domainObject.getId());
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
			
		// Locations
		valueObject.setLocations(ims.RefMan.vo.domain.LocationConfigVoAssembler.createLocationConfigVoCollectionFromLocation(map, domainObject.getLocations()) );
		// Name
		valueObject.setName(domainObject.getName());
		// Type
		ims.domain.lookups.LookupInstance instance3 = domainObject.getType();
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

			ims.core.vo.lookups.LocationType voLookup3 = new ims.core.vo.lookups.LocationType(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.LocationType parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.core.vo.lookups.LocationType(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setType(voLookup3);
		}
				// isActive
		valueObject.setIsActive( domainObject.isIsActive() );
		// Address
		valueObject.setAddress(ims.core.vo.domain.PersonAddressAssembler.create(map, domainObject.getAddress()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.resource.place.domain.objects.Location extractLocation(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.LocationConfigVo valueObject) 
	{
		return 	extractLocation(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.resource.place.domain.objects.Location extractLocation(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.LocationConfigVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Location();
		ims.core.resource.place.domain.objects.Location domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject);
			}
			// ims.RefMan.vo.LocationConfigVo ID_Location field is unknown
			domainObject = new ims.core.resource.place.domain.objects.Location();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Location());
			if (domMap.get(key) != null)
			{
				return (ims.core.resource.place.domain.objects.Location)domMap.get(key);
			}
			domainObject = (ims.core.resource.place.domain.objects.Location) domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Location());


		// SaveAsRefVO treated as RefValueObject
		ims.core.resource.place.vo.LocationRefVoCollection refCollection1 = new ims.core.resource.place.vo.LocationRefVoCollection();
		if (valueObject.getLocations() != null)
		{
			for (int i1=0; i1<valueObject.getLocations().size(); i1++)
			{
				ims.core.resource.place.vo.LocationRefVo ref1 = (ims.core.resource.place.vo.LocationRefVo)valueObject.getLocations().get(i1);
				refCollection1.add(ref1);
			}
		}
		int size1 = (null == refCollection1) ? 0 : refCollection1.size();		
		java.util.Set domainLocations1 = domainObject.getLocations();
		if (domainLocations1 == null)
		{
			domainLocations1 = new java.util.HashSet();
		}
		java.util.Set newSet1  = new java.util.HashSet();
		for(int i=0; i<size1; i++) 
		{
			ims.core.resource.place.vo.LocationRefVo vo = refCollection1.get(i);					
			ims.core.resource.place.domain.objects.Location dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.resource.place.domain.objects.Location)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject( ims.core.resource.place.domain.objects.Location.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainLocations1.contains(dom))
			{
				domainLocations1.add(dom);
			}
			newSet1.add(dom);			
		}
		java.util.Set removedSet1 = new java.util.HashSet();
		java.util.Iterator iter1 = domainLocations1.iterator();
		//Find out which objects need to be removed
		while (iter1.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter1.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet1.contains(o))
			{
				removedSet1.add(o);
			}
		}
		iter1 = removedSet1.iterator();
		//Remove the unwanted objects
		while (iter1.hasNext())
		{
			domainLocations1.remove(iter1.next());
		}		
		
		domainObject.setLocations(domainLocations1);		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getName() != null && valueObject.getName().equals(""))
		{
			valueObject.setName(null);
		}
		domainObject.setName(valueObject.getName());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getType() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getType().getID());
		}
		domainObject.setType(value3);
		domainObject.setIsActive(valueObject.getIsActive());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.generic.domain.objects.Address value5 = null;
		if ( null != valueObject.getAddress() ) 
		{
			if (valueObject.getAddress().getBoId() == null)
			{
				if (domMap.get(valueObject.getAddress()) != null)
				{
					value5 = (ims.core.generic.domain.objects.Address)domMap.get(valueObject.getAddress());
				}
			}
			else
			{
				value5 = (ims.core.generic.domain.objects.Address)domainFactory.getDomainObject(ims.core.generic.domain.objects.Address.class, valueObject.getAddress().getBoId());
			}
		}
		domainObject.setAddress(value5);

		return domainObject;
	}

}
