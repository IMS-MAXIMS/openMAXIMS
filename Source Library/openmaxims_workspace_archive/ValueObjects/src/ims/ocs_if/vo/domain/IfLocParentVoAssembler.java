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
package ims.ocs_if.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author John MacEnri
 */
public class IfLocParentVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.ocs_if.vo.IfLocParentVo copy(ims.ocs_if.vo.IfLocParentVo valueObjectDest, ims.ocs_if.vo.IfLocParentVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Location(valueObjectSrc.getID_Location());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// parentLocation
		valueObjectDest.setParentLocation(valueObjectSrc.getParentLocation());
		// CodeMappings
		valueObjectDest.setCodeMappings(valueObjectSrc.getCodeMappings());
		// Address
		valueObjectDest.setAddress(valueObjectSrc.getAddress());
		// UpperName
		valueObjectDest.setUpperName(valueObjectSrc.getUpperName());
		// Name
		valueObjectDest.setName(valueObjectSrc.getName());
		// isActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
		// IsVirtual
		valueObjectDest.setIsVirtual(valueObjectSrc.getIsVirtual());
		// Type
		valueObjectDest.setType(valueObjectSrc.getType());
		// DisplayInEDTracking
		valueObjectDest.setDisplayInEDTracking(valueObjectSrc.getDisplayInEDTracking());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createIfLocParentVoCollectionFromLocation(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.resource.place.domain.objects.Location objects.
	 */
	public static ims.ocs_if.vo.IfLocParentVoCollection createIfLocParentVoCollectionFromLocation(java.util.Set domainObjectSet)	
	{
		return createIfLocParentVoCollectionFromLocation(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.resource.place.domain.objects.Location objects.
	 */
	public static ims.ocs_if.vo.IfLocParentVoCollection createIfLocParentVoCollectionFromLocation(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.ocs_if.vo.IfLocParentVoCollection voList = new ims.ocs_if.vo.IfLocParentVoCollection();
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
			ims.ocs_if.vo.IfLocParentVo vo = create(map, domainObject);
			
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
	public static ims.ocs_if.vo.IfLocParentVoCollection createIfLocParentVoCollectionFromLocation(java.util.List domainObjectList) 
	{
		return createIfLocParentVoCollectionFromLocation(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.resource.place.domain.objects.Location objects.
	 */
	public static ims.ocs_if.vo.IfLocParentVoCollection createIfLocParentVoCollectionFromLocation(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.ocs_if.vo.IfLocParentVoCollection voList = new ims.ocs_if.vo.IfLocParentVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.resource.place.domain.objects.Location domainObject = (ims.core.resource.place.domain.objects.Location) domainObjectList.get(i);
			ims.ocs_if.vo.IfLocParentVo vo = create(map, domainObject);

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
	 public static java.util.Set extractLocationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfLocParentVoCollection voCollection) 
	 {
	 	return extractLocationSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractLocationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfLocParentVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.ocs_if.vo.IfLocParentVo vo = voCollection.get(i);
			ims.core.resource.place.domain.objects.Location domainObject = IfLocParentVoAssembler.extractLocation(domainFactory, vo, domMap);

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
	 public static java.util.List extractLocationList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfLocParentVoCollection voCollection) 
	 {
	 	return extractLocationList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractLocationList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfLocParentVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.ocs_if.vo.IfLocParentVo vo = voCollection.get(i);
			ims.core.resource.place.domain.objects.Location domainObject = IfLocParentVoAssembler.extractLocation(domainFactory, vo, domMap);

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
	 public static ims.ocs_if.vo.IfLocParentVo create(ims.core.resource.place.domain.objects.Location domainObject) 
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
	  public static ims.ocs_if.vo.IfLocParentVo create(DomainObjectMap map, ims.core.resource.place.domain.objects.Location domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.ocs_if.vo.IfLocParentVo valueObject = (ims.ocs_if.vo.IfLocParentVo) map.getValueObject(domainObject, ims.ocs_if.vo.IfLocParentVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.ocs_if.vo.IfLocParentVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.ocs_if.vo.IfLocParentVo insert(ims.ocs_if.vo.IfLocParentVo valueObject, ims.core.resource.place.domain.objects.Location domainObject) 
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
	 public static ims.ocs_if.vo.IfLocParentVo insert(DomainObjectMap map, ims.ocs_if.vo.IfLocParentVo valueObject, ims.core.resource.place.domain.objects.Location domainObject) 
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
			
		// parentLocation
		if (domainObject.getParentLocation() != null)
		{
			if(domainObject.getParentLocation() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getParentLocation();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setParentLocation(new ims.core.resource.place.vo.LocationRefVo(id, -1));				
			}
			else
			{
				valueObject.setParentLocation(new ims.core.resource.place.vo.LocationRefVo(domainObject.getParentLocation().getId(), domainObject.getParentLocation().getVersion()));
			}
		}
		// CodeMappings
		valueObject.setCodeMappings(ims.core.vo.domain.TaxonomyMapAssembler.createTaxonomyMapCollectionFromTaxonomyMap(map, domainObject.getCodeMappings()) );
		// Address
		valueObject.setAddress(ims.core.vo.domain.PersonAddressAssembler.create(map, domainObject.getAddress()) );
		// UpperName
		valueObject.setUpperName(domainObject.getUpperName());
		// Name
		valueObject.setName(domainObject.getName());
		// isActive
		valueObject.setIsActive( domainObject.isIsActive() );
		// IsVirtual
		valueObject.setIsVirtual( domainObject.isIsVirtual() );
		// Type
		ims.domain.lookups.LookupInstance instance8 = domainObject.getType();
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

			ims.core.vo.lookups.LocationType voLookup8 = new ims.core.vo.lookups.LocationType(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.core.vo.lookups.LocationType parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.core.vo.lookups.LocationType(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setType(voLookup8);
		}
				// DisplayInEDTracking
		valueObject.setDisplayInEDTracking( domainObject.isDisplayInEDTracking() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.resource.place.domain.objects.Location extractLocation(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfLocParentVo valueObject) 
	{
		return 	extractLocation(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.resource.place.domain.objects.Location extractLocation(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfLocParentVo valueObject, HashMap domMap) 
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
			// ims.ocs_if.vo.IfLocParentVo ID_Location field is unknown
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

		ims.core.resource.place.domain.objects.Location value1 = null;
		if ( null != valueObject.getParentLocation() ) 
		{
			if (valueObject.getParentLocation().getBoId() == null)
			{
				if (domMap.get(valueObject.getParentLocation()) != null)
				{
					value1 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getParentLocation());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getParentLocation();	
			}
			else
			{
				value1 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getParentLocation().getBoId());
			}
		}
		domainObject.setParentLocation(value1);
		domainObject.setCodeMappings(ims.core.vo.domain.TaxonomyMapAssembler.extractTaxonomyMapList(domainFactory, valueObject.getCodeMappings(), domainObject.getCodeMappings(), domMap));		
		domainObject.setAddress(ims.core.vo.domain.PersonAddressAssembler.extractAddress(domainFactory, valueObject.getAddress(), domMap));
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getUpperName() != null && valueObject.getUpperName().equals(""))
		{
			valueObject.setUpperName(null);
		}
		domainObject.setUpperName(valueObject.getUpperName());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getName() != null && valueObject.getName().equals(""))
		{
			valueObject.setName(null);
		}
		domainObject.setName(valueObject.getName());
		domainObject.setIsActive(valueObject.getIsActive());
		domainObject.setIsVirtual(valueObject.getIsVirtual());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getType() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getType().getID());
		}
		domainObject.setType(value8);
		domainObject.setDisplayInEDTracking(valueObject.getDisplayInEDTracking());

		return domainObject;
	}

}
