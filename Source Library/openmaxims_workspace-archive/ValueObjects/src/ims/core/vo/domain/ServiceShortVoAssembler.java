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
 * Generated on 16/04/2014, 12:32
 *
 */
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Daniel Laffan
 */
public class ServiceShortVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.ServiceShortVo copy(ims.core.vo.ServiceShortVo valueObjectDest, ims.core.vo.ServiceShortVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Service(valueObjectSrc.getID_Service());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ServiceDescription
		valueObjectDest.setServiceDescription(valueObjectSrc.getServiceDescription());
		// isActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
		// AlternateServiceCode
		valueObjectDest.setAlternateServiceCode(valueObjectSrc.getAlternateServiceCode());
		// ServiceName
		valueObjectDest.setServiceName(valueObjectSrc.getServiceName());
		// ServiceCategory
		valueObjectDest.setServiceCategory(valueObjectSrc.getServiceCategory());
		// CanBeScheduled
		valueObjectDest.setCanBeScheduled(valueObjectSrc.getCanBeScheduled());
		// Specialty
		valueObjectDest.setSpecialty(valueObjectSrc.getSpecialty());
		// ExpectedTurnaround
		valueObjectDest.setExpectedTurnaround(valueObjectSrc.getExpectedTurnaround());
		// TurnaroundMeasure
		valueObjectDest.setTurnaroundMeasure(valueObjectSrc.getTurnaroundMeasure());
		// MaternityIndicator
		valueObjectDest.setMaternityIndicator(valueObjectSrc.getMaternityIndicator());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createServiceShortVoCollectionFromService(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.Service objects.
	 */
	public static ims.core.vo.ServiceShortVoCollection createServiceShortVoCollectionFromService(java.util.Set domainObjectSet)	
	{
		return createServiceShortVoCollectionFromService(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.Service objects.
	 */
	public static ims.core.vo.ServiceShortVoCollection createServiceShortVoCollectionFromService(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.ServiceShortVoCollection voList = new ims.core.vo.ServiceShortVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.clinical.domain.objects.Service domainObject = (ims.core.clinical.domain.objects.Service) iterator.next();
			ims.core.vo.ServiceShortVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.Service objects.
	 */
	public static ims.core.vo.ServiceShortVoCollection createServiceShortVoCollectionFromService(java.util.List domainObjectList) 
	{
		return createServiceShortVoCollectionFromService(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.Service objects.
	 */
	public static ims.core.vo.ServiceShortVoCollection createServiceShortVoCollectionFromService(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.ServiceShortVoCollection voList = new ims.core.vo.ServiceShortVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.Service domainObject = (ims.core.clinical.domain.objects.Service) domainObjectList.get(i);
			ims.core.vo.ServiceShortVo vo = create(map, domainObject);

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
	 * Create the ims.core.clinical.domain.objects.Service set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractServiceSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ServiceShortVoCollection voCollection) 
	 {
	 	return extractServiceSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractServiceSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ServiceShortVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.ServiceShortVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.Service domainObject = ServiceShortVoAssembler.extractService(domainFactory, vo, domMap);

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
	 * Create the ims.core.clinical.domain.objects.Service list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractServiceList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ServiceShortVoCollection voCollection) 
	 {
	 	return extractServiceList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractServiceList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ServiceShortVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.ServiceShortVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.Service domainObject = ServiceShortVoAssembler.extractService(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.clinical.domain.objects.Service object.
	 * @param domainObject ims.core.clinical.domain.objects.Service
	 */
	 public static ims.core.vo.ServiceShortVo create(ims.core.clinical.domain.objects.Service domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.clinical.domain.objects.Service object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.ServiceShortVo create(DomainObjectMap map, ims.core.clinical.domain.objects.Service domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.ServiceShortVo valueObject = (ims.core.vo.ServiceShortVo) map.getValueObject(domainObject, ims.core.vo.ServiceShortVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.ServiceShortVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.clinical.domain.objects.Service
	 */
	 public static ims.core.vo.ServiceShortVo insert(ims.core.vo.ServiceShortVo valueObject, ims.core.clinical.domain.objects.Service domainObject) 
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
	 * @param domainObject ims.core.clinical.domain.objects.Service
	 */
	 public static ims.core.vo.ServiceShortVo insert(DomainObjectMap map, ims.core.vo.ServiceShortVo valueObject, ims.core.clinical.domain.objects.Service domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Service(domainObject.getId());
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
			
		// ServiceDescription
		valueObject.setServiceDescription(domainObject.getServiceDescription());
		// isActive
		valueObject.setIsActive( domainObject.isIsActive() );
		// AlternateServiceCode
		valueObject.setAlternateServiceCode(domainObject.getAlternateServiceCode());
		// ServiceName
		valueObject.setServiceName(domainObject.getServiceName());
		// ServiceCategory
		ims.domain.lookups.LookupInstance instance5 = domainObject.getServiceCategory();
		if ( null != instance5 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance5.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance5.getImage().getImageId(), instance5.getImage().getImagePath());
			}
			color = instance5.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.ServiceCategory voLookup5 = new ims.core.vo.lookups.ServiceCategory(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.core.vo.lookups.ServiceCategory parentVoLookup5 = voLookup5;
			ims.domain.lookups.LookupInstance parent5 = instance5.getParent();
			while (parent5 != null)
			{
				if (parent5.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent5.getImage().getImageId(), parent5.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent5.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup5.setParent(new ims.core.vo.lookups.ServiceCategory(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setServiceCategory(voLookup5);
		}
				// CanBeScheduled
		valueObject.setCanBeScheduled( domainObject.isCanBeScheduled() );
		// Specialty
		ims.domain.lookups.LookupInstance instance7 = domainObject.getSpecialty();
		if ( null != instance7 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance7.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance7.getImage().getImageId(), instance7.getImage().getImagePath());
			}
			color = instance7.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.Specialty voLookup7 = new ims.core.vo.lookups.Specialty(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.core.vo.lookups.Specialty parentVoLookup7 = voLookup7;
			ims.domain.lookups.LookupInstance parent7 = instance7.getParent();
			while (parent7 != null)
			{
				if (parent7.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent7.getImage().getImageId(), parent7.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent7.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup7.setParent(new ims.core.vo.lookups.Specialty(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setSpecialty(voLookup7);
		}
				// ExpectedTurnaround
		valueObject.setExpectedTurnaround(domainObject.getExpectedTurnaround());
		// TurnaroundMeasure
		ims.domain.lookups.LookupInstance instance9 = domainObject.getTurnaroundMeasure();
		if ( null != instance9 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance9.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance9.getImage().getImageId(), instance9.getImage().getImagePath());
			}
			color = instance9.getColor();
			if (color != null) 
				color.getValue();

			ims.ocrr.vo.lookups.MinReorderPeriod voLookup9 = new ims.ocrr.vo.lookups.MinReorderPeriod(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.ocrr.vo.lookups.MinReorderPeriod parentVoLookup9 = voLookup9;
			ims.domain.lookups.LookupInstance parent9 = instance9.getParent();
			while (parent9 != null)
			{
				if (parent9.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent9.getImage().getImageId(), parent9.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent9.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup9.setParent(new ims.ocrr.vo.lookups.MinReorderPeriod(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setTurnaroundMeasure(voLookup9);
		}
				// MaternityIndicator
		valueObject.setMaternityIndicator( domainObject.isMaternityIndicator() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.domain.objects.Service extractService(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ServiceShortVo valueObject) 
	{
		return 	extractService(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.Service extractService(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ServiceShortVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Service();
		ims.core.clinical.domain.objects.Service domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.clinical.domain.objects.Service)domMap.get(valueObject);
			}
			// ims.core.vo.ServiceShortVo ID_Service field is unknown
			domainObject = new ims.core.clinical.domain.objects.Service();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Service());
			if (domMap.get(key) != null)
			{
				return (ims.core.clinical.domain.objects.Service)domMap.get(key);
			}
			domainObject = (ims.core.clinical.domain.objects.Service) domainFactory.getDomainObject(ims.core.clinical.domain.objects.Service.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Service());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getServiceDescription() != null && valueObject.getServiceDescription().equals(""))
		{
			valueObject.setServiceDescription(null);
		}
		domainObject.setServiceDescription(valueObject.getServiceDescription());
		domainObject.setIsActive(valueObject.getIsActive());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAlternateServiceCode() != null && valueObject.getAlternateServiceCode().equals(""))
		{
			valueObject.setAlternateServiceCode(null);
		}
		domainObject.setAlternateServiceCode(valueObject.getAlternateServiceCode());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getServiceName() != null && valueObject.getServiceName().equals(""))
		{
			valueObject.setServiceName(null);
		}
		domainObject.setServiceName(valueObject.getServiceName());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getServiceCategory() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getServiceCategory().getID());
		}
		domainObject.setServiceCategory(value5);
		domainObject.setCanBeScheduled(valueObject.getCanBeScheduled());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getSpecialty() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getSpecialty().getID());
		}
		domainObject.setSpecialty(value7);
		domainObject.setExpectedTurnaround(valueObject.getExpectedTurnaround());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getTurnaroundMeasure() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getTurnaroundMeasure().getID());
		}
		domainObject.setTurnaroundMeasure(value9);
		domainObject.setMaternityIndicator(valueObject.getMaternityIndicator());

		return domainObject;
	}

}
