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
 * @author Florin Blindu
 */
public class ServiceForElectiveListConfigVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.admin.vo.ServiceForElectiveListConfigVo copy(ims.admin.vo.ServiceForElectiveListConfigVo valueObjectDest, ims.admin.vo.ServiceForElectiveListConfigVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Service(valueObjectSrc.getID_Service());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ServiceName
		valueObjectDest.setServiceName(valueObjectSrc.getServiceName());
		// ServiceDescription
		valueObjectDest.setServiceDescription(valueObjectSrc.getServiceDescription());
		// ServiceCategory
		valueObjectDest.setServiceCategory(valueObjectSrc.getServiceCategory());
		// Specialty
		valueObjectDest.setSpecialty(valueObjectSrc.getSpecialty());
		// isActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
		// UpperName
		valueObjectDest.setUpperName(valueObjectSrc.getUpperName());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createServiceForElectiveListConfigVoCollectionFromService(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.Service objects.
	 */
	public static ims.admin.vo.ServiceForElectiveListConfigVoCollection createServiceForElectiveListConfigVoCollectionFromService(java.util.Set domainObjectSet)	
	{
		return createServiceForElectiveListConfigVoCollectionFromService(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.Service objects.
	 */
	public static ims.admin.vo.ServiceForElectiveListConfigVoCollection createServiceForElectiveListConfigVoCollectionFromService(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.admin.vo.ServiceForElectiveListConfigVoCollection voList = new ims.admin.vo.ServiceForElectiveListConfigVoCollection();
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
			ims.admin.vo.ServiceForElectiveListConfigVo vo = create(map, domainObject);
			
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
	public static ims.admin.vo.ServiceForElectiveListConfigVoCollection createServiceForElectiveListConfigVoCollectionFromService(java.util.List domainObjectList) 
	{
		return createServiceForElectiveListConfigVoCollectionFromService(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.Service objects.
	 */
	public static ims.admin.vo.ServiceForElectiveListConfigVoCollection createServiceForElectiveListConfigVoCollectionFromService(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.admin.vo.ServiceForElectiveListConfigVoCollection voList = new ims.admin.vo.ServiceForElectiveListConfigVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.Service domainObject = (ims.core.clinical.domain.objects.Service) domainObjectList.get(i);
			ims.admin.vo.ServiceForElectiveListConfigVo vo = create(map, domainObject);

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
	 public static java.util.Set extractServiceSet(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.ServiceForElectiveListConfigVoCollection voCollection) 
	 {
	 	return extractServiceSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractServiceSet(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.ServiceForElectiveListConfigVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.admin.vo.ServiceForElectiveListConfigVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.Service domainObject = ServiceForElectiveListConfigVoAssembler.extractService(domainFactory, vo, domMap);

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
	 public static java.util.List extractServiceList(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.ServiceForElectiveListConfigVoCollection voCollection) 
	 {
	 	return extractServiceList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractServiceList(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.ServiceForElectiveListConfigVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.admin.vo.ServiceForElectiveListConfigVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.Service domainObject = ServiceForElectiveListConfigVoAssembler.extractService(domainFactory, vo, domMap);

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
	 public static ims.admin.vo.ServiceForElectiveListConfigVo create(ims.core.clinical.domain.objects.Service domainObject) 
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
	  public static ims.admin.vo.ServiceForElectiveListConfigVo create(DomainObjectMap map, ims.core.clinical.domain.objects.Service domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.admin.vo.ServiceForElectiveListConfigVo valueObject = (ims.admin.vo.ServiceForElectiveListConfigVo) map.getValueObject(domainObject, ims.admin.vo.ServiceForElectiveListConfigVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.admin.vo.ServiceForElectiveListConfigVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.admin.vo.ServiceForElectiveListConfigVo insert(ims.admin.vo.ServiceForElectiveListConfigVo valueObject, ims.core.clinical.domain.objects.Service domainObject) 
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
	 public static ims.admin.vo.ServiceForElectiveListConfigVo insert(DomainObjectMap map, ims.admin.vo.ServiceForElectiveListConfigVo valueObject, ims.core.clinical.domain.objects.Service domainObject) 
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
			
		// ServiceName
		valueObject.setServiceName(domainObject.getServiceName());
		// ServiceDescription
		valueObject.setServiceDescription(domainObject.getServiceDescription());
		// ServiceCategory
		ims.domain.lookups.LookupInstance instance3 = domainObject.getServiceCategory();
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

			ims.core.vo.lookups.ServiceCategory voLookup3 = new ims.core.vo.lookups.ServiceCategory(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.ServiceCategory parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.core.vo.lookups.ServiceCategory(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setServiceCategory(voLookup3);
		}
				// Specialty
		ims.domain.lookups.LookupInstance instance4 = domainObject.getSpecialty();
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

			ims.core.vo.lookups.Specialty voLookup4 = new ims.core.vo.lookups.Specialty(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.Specialty parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.core.vo.lookups.Specialty(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setSpecialty(voLookup4);
		}
				// isActive
		valueObject.setIsActive( domainObject.isIsActive() );
		// UpperName
		valueObject.setUpperName(domainObject.getUpperName());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.domain.objects.Service extractService(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.ServiceForElectiveListConfigVo valueObject) 
	{
		return 	extractService(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.Service extractService(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.ServiceForElectiveListConfigVo valueObject, HashMap domMap) 
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
			// ims.admin.vo.ServiceForElectiveListConfigVo ID_Service field is unknown
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
		if (valueObject.getServiceName() != null && valueObject.getServiceName().equals(""))
		{
			valueObject.setServiceName(null);
		}
		domainObject.setServiceName(valueObject.getServiceName());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getServiceDescription() != null && valueObject.getServiceDescription().equals(""))
		{
			valueObject.setServiceDescription(null);
		}
		domainObject.setServiceDescription(valueObject.getServiceDescription());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getServiceCategory() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getServiceCategory().getID());
		}
		domainObject.setServiceCategory(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getSpecialty() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getSpecialty().getID());
		}
		domainObject.setSpecialty(value4);
		domainObject.setIsActive(valueObject.getIsActive());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getUpperName() != null && valueObject.getUpperName().equals(""))
		{
			valueObject.setUpperName(null);
		}
		domainObject.setUpperName(valueObject.getUpperName());

		return domainObject;
	}

}
