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
package ims.emergency.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cristian Belciug
 */
public class LocationDepartmentTypesVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.emergency.vo.LocationDepartmentTypesVo copy(ims.emergency.vo.LocationDepartmentTypesVo valueObjectDest, ims.emergency.vo.LocationDepartmentTypesVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_LocationDepartmentTypes(valueObjectSrc.getID_LocationDepartmentTypes());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// EDLocation
		valueObjectDest.setEDLocation(valueObjectSrc.getEDLocation());
		// DepartmentTypes
		valueObjectDest.setDepartmentTypes(valueObjectSrc.getDepartmentTypes());
		// DefaultDepartmentType
		valueObjectDest.setDefaultDepartmentType(valueObjectSrc.getDefaultDepartmentType());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createLocationDepartmentTypesVoCollectionFromLocationDepartmentTypes(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.emergency.configuration.domain.objects.LocationDepartmentTypes objects.
	 */
	public static ims.emergency.vo.LocationDepartmentTypesVoCollection createLocationDepartmentTypesVoCollectionFromLocationDepartmentTypes(java.util.Set domainObjectSet)	
	{
		return createLocationDepartmentTypesVoCollectionFromLocationDepartmentTypes(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.emergency.configuration.domain.objects.LocationDepartmentTypes objects.
	 */
	public static ims.emergency.vo.LocationDepartmentTypesVoCollection createLocationDepartmentTypesVoCollectionFromLocationDepartmentTypes(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.emergency.vo.LocationDepartmentTypesVoCollection voList = new ims.emergency.vo.LocationDepartmentTypesVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.emergency.configuration.domain.objects.LocationDepartmentTypes domainObject = (ims.emergency.configuration.domain.objects.LocationDepartmentTypes) iterator.next();
			ims.emergency.vo.LocationDepartmentTypesVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.emergency.configuration.domain.objects.LocationDepartmentTypes objects.
	 */
	public static ims.emergency.vo.LocationDepartmentTypesVoCollection createLocationDepartmentTypesVoCollectionFromLocationDepartmentTypes(java.util.List domainObjectList) 
	{
		return createLocationDepartmentTypesVoCollectionFromLocationDepartmentTypes(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.emergency.configuration.domain.objects.LocationDepartmentTypes objects.
	 */
	public static ims.emergency.vo.LocationDepartmentTypesVoCollection createLocationDepartmentTypesVoCollectionFromLocationDepartmentTypes(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.emergency.vo.LocationDepartmentTypesVoCollection voList = new ims.emergency.vo.LocationDepartmentTypesVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.emergency.configuration.domain.objects.LocationDepartmentTypes domainObject = (ims.emergency.configuration.domain.objects.LocationDepartmentTypes) domainObjectList.get(i);
			ims.emergency.vo.LocationDepartmentTypesVo vo = create(map, domainObject);

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
	 * Create the ims.emergency.configuration.domain.objects.LocationDepartmentTypes set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractLocationDepartmentTypesSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.LocationDepartmentTypesVoCollection voCollection) 
	 {
	 	return extractLocationDepartmentTypesSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractLocationDepartmentTypesSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.LocationDepartmentTypesVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.LocationDepartmentTypesVo vo = voCollection.get(i);
			ims.emergency.configuration.domain.objects.LocationDepartmentTypes domainObject = LocationDepartmentTypesVoAssembler.extractLocationDepartmentTypes(domainFactory, vo, domMap);

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
	 * Create the ims.emergency.configuration.domain.objects.LocationDepartmentTypes list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractLocationDepartmentTypesList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.LocationDepartmentTypesVoCollection voCollection) 
	 {
	 	return extractLocationDepartmentTypesList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractLocationDepartmentTypesList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.LocationDepartmentTypesVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.LocationDepartmentTypesVo vo = voCollection.get(i);
			ims.emergency.configuration.domain.objects.LocationDepartmentTypes domainObject = LocationDepartmentTypesVoAssembler.extractLocationDepartmentTypes(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.emergency.configuration.domain.objects.LocationDepartmentTypes object.
	 * @param domainObject ims.emergency.configuration.domain.objects.LocationDepartmentTypes
	 */
	 public static ims.emergency.vo.LocationDepartmentTypesVo create(ims.emergency.configuration.domain.objects.LocationDepartmentTypes domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.emergency.configuration.domain.objects.LocationDepartmentTypes object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.emergency.vo.LocationDepartmentTypesVo create(DomainObjectMap map, ims.emergency.configuration.domain.objects.LocationDepartmentTypes domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.emergency.vo.LocationDepartmentTypesVo valueObject = (ims.emergency.vo.LocationDepartmentTypesVo) map.getValueObject(domainObject, ims.emergency.vo.LocationDepartmentTypesVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.emergency.vo.LocationDepartmentTypesVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.emergency.configuration.domain.objects.LocationDepartmentTypes
	 */
	 public static ims.emergency.vo.LocationDepartmentTypesVo insert(ims.emergency.vo.LocationDepartmentTypesVo valueObject, ims.emergency.configuration.domain.objects.LocationDepartmentTypes domainObject) 
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
	 * @param domainObject ims.emergency.configuration.domain.objects.LocationDepartmentTypes
	 */
	 public static ims.emergency.vo.LocationDepartmentTypesVo insert(DomainObjectMap map, ims.emergency.vo.LocationDepartmentTypesVo valueObject, ims.emergency.configuration.domain.objects.LocationDepartmentTypes domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_LocationDepartmentTypes(domainObject.getId());
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
			
		// EDLocation
		if (domainObject.getEDLocation() != null)
		{
			if(domainObject.getEDLocation() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getEDLocation();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setEDLocation(new ims.core.resource.place.vo.LocationRefVo(id, -1));				
			}
			else
			{
				valueObject.setEDLocation(new ims.core.resource.place.vo.LocationRefVo(domainObject.getEDLocation().getId(), domainObject.getEDLocation().getVersion()));
			}
		}
		// DepartmentTypes
		java.util.List listDepartmentTypes = domainObject.getDepartmentTypes();
		ims.emergency.vo.lookups.DepartmentTypeCollection DepartmentTypes = new ims.emergency.vo.lookups.DepartmentTypeCollection();
		for(java.util.Iterator iterator = listDepartmentTypes.iterator(); iterator.hasNext(); ) 
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
			ims.emergency.vo.lookups.DepartmentType voInstance = new ims.emergency.vo.lookups.DepartmentType(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.emergency.vo.lookups.DepartmentType parentVoInstance = voInstance;
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
								parentVoInstance.setParent(new ims.emergency.vo.lookups.DepartmentType(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			DepartmentTypes.add(voInstance);
		}
		valueObject.setDepartmentTypes( DepartmentTypes );
		// DefaultDepartmentType
		ims.domain.lookups.LookupInstance instance3 = domainObject.getDefaultDepartmentType();
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

			ims.emergency.vo.lookups.DepartmentType voLookup3 = new ims.emergency.vo.lookups.DepartmentType(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.emergency.vo.lookups.DepartmentType parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.emergency.vo.lookups.DepartmentType(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setDefaultDepartmentType(voLookup3);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.emergency.configuration.domain.objects.LocationDepartmentTypes extractLocationDepartmentTypes(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.LocationDepartmentTypesVo valueObject) 
	{
		return 	extractLocationDepartmentTypes(domainFactory, valueObject, new HashMap());
	}

	public static ims.emergency.configuration.domain.objects.LocationDepartmentTypes extractLocationDepartmentTypes(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.LocationDepartmentTypesVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_LocationDepartmentTypes();
		ims.emergency.configuration.domain.objects.LocationDepartmentTypes domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.emergency.configuration.domain.objects.LocationDepartmentTypes)domMap.get(valueObject);
			}
			// ims.emergency.vo.LocationDepartmentTypesVo ID_LocationDepartmentTypes field is unknown
			domainObject = new ims.emergency.configuration.domain.objects.LocationDepartmentTypes();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_LocationDepartmentTypes());
			if (domMap.get(key) != null)
			{
				return (ims.emergency.configuration.domain.objects.LocationDepartmentTypes)domMap.get(key);
			}
			domainObject = (ims.emergency.configuration.domain.objects.LocationDepartmentTypes) domainFactory.getDomainObject(ims.emergency.configuration.domain.objects.LocationDepartmentTypes.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_LocationDepartmentTypes());

		ims.core.resource.place.domain.objects.Location value1 = null;
		if ( null != valueObject.getEDLocation() ) 
		{
			if (valueObject.getEDLocation().getBoId() == null)
			{
				if (domMap.get(valueObject.getEDLocation()) != null)
				{
					value1 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getEDLocation());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getEDLocation();	
			}
			else
			{
				value1 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getEDLocation().getBoId());
			}
		}
		domainObject.setEDLocation(value1);
		ims.emergency.vo.lookups.DepartmentTypeCollection collection2 =
	valueObject.getDepartmentTypes();
	    java.util.List domainDepartmentTypes = domainObject.getDepartmentTypes();;			
	    int collection2Size=0;
		if (collection2 == null)
		{
			domainDepartmentTypes = new java.util.ArrayList(0);
		}
		else
		{
			collection2Size = collection2.size();
		}
		
		for(int i=0; i<collection2Size; i++) 
		{
			int instanceId = collection2.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainDepartmentTypes.indexOf(dom);
			if (domIdx == -1)
			{
				domainDepartmentTypes.add(i, dom);
			}
			else if (i != domIdx && i < domainDepartmentTypes.size())
			{
				Object tmp = domainDepartmentTypes.get(i);
				domainDepartmentTypes.set(i, domainDepartmentTypes.get(domIdx));
				domainDepartmentTypes.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j2 = domainDepartmentTypes.size();
		while (j2 > collection2Size)
		{
			domainDepartmentTypes.remove(j2-1);
			j2 = domainDepartmentTypes.size();
		}

		domainObject.setDepartmentTypes(domainDepartmentTypes);		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getDefaultDepartmentType() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getDefaultDepartmentType().getID());
		}
		domainObject.setDefaultDepartmentType(value3);

		return domainObject;
	}

}
