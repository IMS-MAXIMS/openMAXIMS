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
package ims.ocrr.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Daniel Laffan
 */
public class RoleDisciplineSecurityLevelVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.ocrr.vo.RoleDisciplineSecurityLevelVo copy(ims.ocrr.vo.RoleDisciplineSecurityLevelVo valueObjectDest, ims.ocrr.vo.RoleDisciplineSecurityLevelVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_RoleDisciplineSecurityLevel(valueObjectSrc.getID_RoleDisciplineSecurityLevel());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Role
		valueObjectDest.setRole(valueObjectSrc.getRole());
		// Service
		valueObjectDest.setService(valueObjectSrc.getService());
		// OrderingSecurityLevel
		valueObjectDest.setOrderingSecurityLevel(valueObjectSrc.getOrderingSecurityLevel());
		// ViewingSecurityLevel
		valueObjectDest.setViewingSecurityLevel(valueObjectSrc.getViewingSecurityLevel());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createRoleDisciplineSecurityLevelVoCollectionFromRoleDisciplineSecurityLevel(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.ocrr.configuration.domain.objects.RoleDisciplineSecurityLevel objects.
	 */
	public static ims.ocrr.vo.RoleDisciplineSecurityLevelVoCollection createRoleDisciplineSecurityLevelVoCollectionFromRoleDisciplineSecurityLevel(java.util.Set domainObjectSet)	
	{
		return createRoleDisciplineSecurityLevelVoCollectionFromRoleDisciplineSecurityLevel(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.ocrr.configuration.domain.objects.RoleDisciplineSecurityLevel objects.
	 */
	public static ims.ocrr.vo.RoleDisciplineSecurityLevelVoCollection createRoleDisciplineSecurityLevelVoCollectionFromRoleDisciplineSecurityLevel(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.ocrr.vo.RoleDisciplineSecurityLevelVoCollection voList = new ims.ocrr.vo.RoleDisciplineSecurityLevelVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.ocrr.configuration.domain.objects.RoleDisciplineSecurityLevel domainObject = (ims.ocrr.configuration.domain.objects.RoleDisciplineSecurityLevel) iterator.next();
			ims.ocrr.vo.RoleDisciplineSecurityLevelVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.ocrr.configuration.domain.objects.RoleDisciplineSecurityLevel objects.
	 */
	public static ims.ocrr.vo.RoleDisciplineSecurityLevelVoCollection createRoleDisciplineSecurityLevelVoCollectionFromRoleDisciplineSecurityLevel(java.util.List domainObjectList) 
	{
		return createRoleDisciplineSecurityLevelVoCollectionFromRoleDisciplineSecurityLevel(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.ocrr.configuration.domain.objects.RoleDisciplineSecurityLevel objects.
	 */
	public static ims.ocrr.vo.RoleDisciplineSecurityLevelVoCollection createRoleDisciplineSecurityLevelVoCollectionFromRoleDisciplineSecurityLevel(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.ocrr.vo.RoleDisciplineSecurityLevelVoCollection voList = new ims.ocrr.vo.RoleDisciplineSecurityLevelVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.ocrr.configuration.domain.objects.RoleDisciplineSecurityLevel domainObject = (ims.ocrr.configuration.domain.objects.RoleDisciplineSecurityLevel) domainObjectList.get(i);
			ims.ocrr.vo.RoleDisciplineSecurityLevelVo vo = create(map, domainObject);

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
	 * Create the ims.ocrr.configuration.domain.objects.RoleDisciplineSecurityLevel set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractRoleDisciplineSecurityLevelSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.RoleDisciplineSecurityLevelVoCollection voCollection) 
	 {
	 	return extractRoleDisciplineSecurityLevelSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractRoleDisciplineSecurityLevelSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.RoleDisciplineSecurityLevelVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.RoleDisciplineSecurityLevelVo vo = voCollection.get(i);
			ims.ocrr.configuration.domain.objects.RoleDisciplineSecurityLevel domainObject = RoleDisciplineSecurityLevelVoAssembler.extractRoleDisciplineSecurityLevel(domainFactory, vo, domMap);

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
	 * Create the ims.ocrr.configuration.domain.objects.RoleDisciplineSecurityLevel list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractRoleDisciplineSecurityLevelList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.RoleDisciplineSecurityLevelVoCollection voCollection) 
	 {
	 	return extractRoleDisciplineSecurityLevelList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractRoleDisciplineSecurityLevelList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.RoleDisciplineSecurityLevelVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.RoleDisciplineSecurityLevelVo vo = voCollection.get(i);
			ims.ocrr.configuration.domain.objects.RoleDisciplineSecurityLevel domainObject = RoleDisciplineSecurityLevelVoAssembler.extractRoleDisciplineSecurityLevel(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.ocrr.configuration.domain.objects.RoleDisciplineSecurityLevel object.
	 * @param domainObject ims.ocrr.configuration.domain.objects.RoleDisciplineSecurityLevel
	 */
	 public static ims.ocrr.vo.RoleDisciplineSecurityLevelVo create(ims.ocrr.configuration.domain.objects.RoleDisciplineSecurityLevel domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.ocrr.configuration.domain.objects.RoleDisciplineSecurityLevel object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.ocrr.vo.RoleDisciplineSecurityLevelVo create(DomainObjectMap map, ims.ocrr.configuration.domain.objects.RoleDisciplineSecurityLevel domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.ocrr.vo.RoleDisciplineSecurityLevelVo valueObject = (ims.ocrr.vo.RoleDisciplineSecurityLevelVo) map.getValueObject(domainObject, ims.ocrr.vo.RoleDisciplineSecurityLevelVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.ocrr.vo.RoleDisciplineSecurityLevelVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.ocrr.configuration.domain.objects.RoleDisciplineSecurityLevel
	 */
	 public static ims.ocrr.vo.RoleDisciplineSecurityLevelVo insert(ims.ocrr.vo.RoleDisciplineSecurityLevelVo valueObject, ims.ocrr.configuration.domain.objects.RoleDisciplineSecurityLevel domainObject) 
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
	 * @param domainObject ims.ocrr.configuration.domain.objects.RoleDisciplineSecurityLevel
	 */
	 public static ims.ocrr.vo.RoleDisciplineSecurityLevelVo insert(DomainObjectMap map, ims.ocrr.vo.RoleDisciplineSecurityLevelVo valueObject, ims.ocrr.configuration.domain.objects.RoleDisciplineSecurityLevel domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_RoleDisciplineSecurityLevel(domainObject.getId());
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
			
		// Role
		if (domainObject.getRole() != null)
		{
			if(domainObject.getRole() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getRole();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setRole(new ims.core.configuration.vo.AppRoleRefVo(id, -1));				
			}
			else
			{
				valueObject.setRole(new ims.core.configuration.vo.AppRoleRefVo(domainObject.getRole().getId(), domainObject.getRole().getVersion()));
			}
		}
		// Service
		if (domainObject.getService() != null)
		{
			if(domainObject.getService() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getService();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setService(new ims.core.clinical.vo.ServiceRefVo(id, -1));				
			}
			else
			{
				valueObject.setService(new ims.core.clinical.vo.ServiceRefVo(domainObject.getService().getId(), domainObject.getService().getVersion()));
			}
		}
		// OrderingSecurityLevel
		if (domainObject.getOrderingSecurityLevel() != null)
		{
			if(domainObject.getOrderingSecurityLevel() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getOrderingSecurityLevel();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setOrderingSecurityLevel(new ims.ocrr.configuration.vo.SecurityLevelRefVo(id, -1));				
			}
			else
			{
				valueObject.setOrderingSecurityLevel(new ims.ocrr.configuration.vo.SecurityLevelRefVo(domainObject.getOrderingSecurityLevel().getId(), domainObject.getOrderingSecurityLevel().getVersion()));
			}
		}
		// ViewingSecurityLevel
		if (domainObject.getViewingSecurityLevel() != null)
		{
			if(domainObject.getViewingSecurityLevel() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getViewingSecurityLevel();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setViewingSecurityLevel(new ims.ocrr.configuration.vo.SecurityLevelRefVo(id, -1));				
			}
			else
			{
				valueObject.setViewingSecurityLevel(new ims.ocrr.configuration.vo.SecurityLevelRefVo(domainObject.getViewingSecurityLevel().getId(), domainObject.getViewingSecurityLevel().getVersion()));
			}
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.ocrr.configuration.domain.objects.RoleDisciplineSecurityLevel extractRoleDisciplineSecurityLevel(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.RoleDisciplineSecurityLevelVo valueObject) 
	{
		return 	extractRoleDisciplineSecurityLevel(domainFactory, valueObject, new HashMap());
	}

	public static ims.ocrr.configuration.domain.objects.RoleDisciplineSecurityLevel extractRoleDisciplineSecurityLevel(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.RoleDisciplineSecurityLevelVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_RoleDisciplineSecurityLevel();
		ims.ocrr.configuration.domain.objects.RoleDisciplineSecurityLevel domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.ocrr.configuration.domain.objects.RoleDisciplineSecurityLevel)domMap.get(valueObject);
			}
			// ims.ocrr.vo.RoleDisciplineSecurityLevelVo ID_RoleDisciplineSecurityLevel field is unknown
			domainObject = new ims.ocrr.configuration.domain.objects.RoleDisciplineSecurityLevel();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_RoleDisciplineSecurityLevel());
			if (domMap.get(key) != null)
			{
				return (ims.ocrr.configuration.domain.objects.RoleDisciplineSecurityLevel)domMap.get(key);
			}
			domainObject = (ims.ocrr.configuration.domain.objects.RoleDisciplineSecurityLevel) domainFactory.getDomainObject(ims.ocrr.configuration.domain.objects.RoleDisciplineSecurityLevel.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_RoleDisciplineSecurityLevel());

		ims.core.configuration.domain.objects.AppRole value1 = null;
		if ( null != valueObject.getRole() ) 
		{
			if (valueObject.getRole().getBoId() == null)
			{
				if (domMap.get(valueObject.getRole()) != null)
				{
					value1 = (ims.core.configuration.domain.objects.AppRole)domMap.get(valueObject.getRole());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getRole();	
			}
			else
			{
				value1 = (ims.core.configuration.domain.objects.AppRole)domainFactory.getDomainObject(ims.core.configuration.domain.objects.AppRole.class, valueObject.getRole().getBoId());
			}
		}
		domainObject.setRole(value1);
		ims.core.clinical.domain.objects.Service value2 = null;
		if ( null != valueObject.getService() ) 
		{
			if (valueObject.getService().getBoId() == null)
			{
				if (domMap.get(valueObject.getService()) != null)
				{
					value2 = (ims.core.clinical.domain.objects.Service)domMap.get(valueObject.getService());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getService();	
			}
			else
			{
				value2 = (ims.core.clinical.domain.objects.Service)domainFactory.getDomainObject(ims.core.clinical.domain.objects.Service.class, valueObject.getService().getBoId());
			}
		}
		domainObject.setService(value2);
		ims.ocrr.configuration.domain.objects.SecurityLevel value3 = null;
		if ( null != valueObject.getOrderingSecurityLevel() ) 
		{
			if (valueObject.getOrderingSecurityLevel().getBoId() == null)
			{
				if (domMap.get(valueObject.getOrderingSecurityLevel()) != null)
				{
					value3 = (ims.ocrr.configuration.domain.objects.SecurityLevel)domMap.get(valueObject.getOrderingSecurityLevel());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value3 = domainObject.getOrderingSecurityLevel();	
			}
			else
			{
				value3 = (ims.ocrr.configuration.domain.objects.SecurityLevel)domainFactory.getDomainObject(ims.ocrr.configuration.domain.objects.SecurityLevel.class, valueObject.getOrderingSecurityLevel().getBoId());
			}
		}
		domainObject.setOrderingSecurityLevel(value3);
		ims.ocrr.configuration.domain.objects.SecurityLevel value4 = null;
		if ( null != valueObject.getViewingSecurityLevel() ) 
		{
			if (valueObject.getViewingSecurityLevel().getBoId() == null)
			{
				if (domMap.get(valueObject.getViewingSecurityLevel()) != null)
				{
					value4 = (ims.ocrr.configuration.domain.objects.SecurityLevel)domMap.get(valueObject.getViewingSecurityLevel());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value4 = domainObject.getViewingSecurityLevel();	
			}
			else
			{
				value4 = (ims.ocrr.configuration.domain.objects.SecurityLevel)domainFactory.getDomainObject(ims.ocrr.configuration.domain.objects.SecurityLevel.class, valueObject.getViewingSecurityLevel().getBoId());
			}
		}
		domainObject.setViewingSecurityLevel(value4);

		return domainObject;
	}

}
