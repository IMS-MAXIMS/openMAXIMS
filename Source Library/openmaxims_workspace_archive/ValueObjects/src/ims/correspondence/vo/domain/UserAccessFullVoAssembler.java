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
package ims.correspondence.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Dara Hickey
 */
public class UserAccessFullVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.correspondence.vo.UserAccessFullVo copy(ims.correspondence.vo.UserAccessFullVo valueObjectDest, ims.correspondence.vo.UserAccessFullVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_UserAccess(valueObjectSrc.getID_UserAccess());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// AppUser
		valueObjectDest.setAppUser(valueObjectSrc.getAppUser());
		// ConsultantAccess
		valueObjectDest.setConsultantAccess(valueObjectSrc.getConsultantAccess());
		// ClinicAccess
		valueObjectDest.setClinicAccess(valueObjectSrc.getClinicAccess());
		// SpecialtyAccess
		valueObjectDest.setSpecialtyAccess(valueObjectSrc.getSpecialtyAccess());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createUserAccessFullVoCollectionFromUserAccess(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.correspondence.configuration.domain.objects.UserAccess objects.
	 */
	public static ims.correspondence.vo.UserAccessFullVoCollection createUserAccessFullVoCollectionFromUserAccess(java.util.Set domainObjectSet)	
	{
		return createUserAccessFullVoCollectionFromUserAccess(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.correspondence.configuration.domain.objects.UserAccess objects.
	 */
	public static ims.correspondence.vo.UserAccessFullVoCollection createUserAccessFullVoCollectionFromUserAccess(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.correspondence.vo.UserAccessFullVoCollection voList = new ims.correspondence.vo.UserAccessFullVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.correspondence.configuration.domain.objects.UserAccess domainObject = (ims.correspondence.configuration.domain.objects.UserAccess) iterator.next();
			ims.correspondence.vo.UserAccessFullVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.correspondence.configuration.domain.objects.UserAccess objects.
	 */
	public static ims.correspondence.vo.UserAccessFullVoCollection createUserAccessFullVoCollectionFromUserAccess(java.util.List domainObjectList) 
	{
		return createUserAccessFullVoCollectionFromUserAccess(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.correspondence.configuration.domain.objects.UserAccess objects.
	 */
	public static ims.correspondence.vo.UserAccessFullVoCollection createUserAccessFullVoCollectionFromUserAccess(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.correspondence.vo.UserAccessFullVoCollection voList = new ims.correspondence.vo.UserAccessFullVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.correspondence.configuration.domain.objects.UserAccess domainObject = (ims.correspondence.configuration.domain.objects.UserAccess) domainObjectList.get(i);
			ims.correspondence.vo.UserAccessFullVo vo = create(map, domainObject);

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
	 * Create the ims.correspondence.configuration.domain.objects.UserAccess set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractUserAccessSet(ims.domain.ILightweightDomainFactory domainFactory, ims.correspondence.vo.UserAccessFullVoCollection voCollection) 
	 {
	 	return extractUserAccessSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractUserAccessSet(ims.domain.ILightweightDomainFactory domainFactory, ims.correspondence.vo.UserAccessFullVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.correspondence.vo.UserAccessFullVo vo = voCollection.get(i);
			ims.correspondence.configuration.domain.objects.UserAccess domainObject = UserAccessFullVoAssembler.extractUserAccess(domainFactory, vo, domMap);

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
	 * Create the ims.correspondence.configuration.domain.objects.UserAccess list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractUserAccessList(ims.domain.ILightweightDomainFactory domainFactory, ims.correspondence.vo.UserAccessFullVoCollection voCollection) 
	 {
	 	return extractUserAccessList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractUserAccessList(ims.domain.ILightweightDomainFactory domainFactory, ims.correspondence.vo.UserAccessFullVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.correspondence.vo.UserAccessFullVo vo = voCollection.get(i);
			ims.correspondence.configuration.domain.objects.UserAccess domainObject = UserAccessFullVoAssembler.extractUserAccess(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.correspondence.configuration.domain.objects.UserAccess object.
	 * @param domainObject ims.correspondence.configuration.domain.objects.UserAccess
	 */
	 public static ims.correspondence.vo.UserAccessFullVo create(ims.correspondence.configuration.domain.objects.UserAccess domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.correspondence.configuration.domain.objects.UserAccess object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.correspondence.vo.UserAccessFullVo create(DomainObjectMap map, ims.correspondence.configuration.domain.objects.UserAccess domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.correspondence.vo.UserAccessFullVo valueObject = (ims.correspondence.vo.UserAccessFullVo) map.getValueObject(domainObject, ims.correspondence.vo.UserAccessFullVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.correspondence.vo.UserAccessFullVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.correspondence.configuration.domain.objects.UserAccess
	 */
	 public static ims.correspondence.vo.UserAccessFullVo insert(ims.correspondence.vo.UserAccessFullVo valueObject, ims.correspondence.configuration.domain.objects.UserAccess domainObject) 
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
	 * @param domainObject ims.correspondence.configuration.domain.objects.UserAccess
	 */
	 public static ims.correspondence.vo.UserAccessFullVo insert(DomainObjectMap map, ims.correspondence.vo.UserAccessFullVo valueObject, ims.correspondence.configuration.domain.objects.UserAccess domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_UserAccess(domainObject.getId());
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
			
		// AppUser
		if (domainObject.getAppUser() != null)
		{
			if(domainObject.getAppUser() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getAppUser();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setAppUser(new ims.core.configuration.vo.AppUserRefVo(id, -1));				
			}
			else
			{
				valueObject.setAppUser(new ims.core.configuration.vo.AppUserRefVo(domainObject.getAppUser().getId(), domainObject.getAppUser().getVersion()));
			}
		}
		// ConsultantAccess
		valueObject.setConsultantAccess(ims.correspondence.vo.domain.ConsultantAccessFullVoAssembler.createConsultantAccessFullVoCollectionFromConsultantAccess(map, domainObject.getConsultantAccess()) );
		// ClinicAccess
		valueObject.setClinicAccess(ims.correspondence.vo.domain.ClinicAccessFullVoAssembler.createClinicAccessFullVoCollectionFromClinicAccess(map, domainObject.getClinicAccess()) );
		// SpecialtyAccess
		valueObject.setSpecialtyAccess(ims.correspondence.vo.domain.SpecialtyAccessVoAssembler.createSpecialtyAccessVoCollectionFromSpecialtyAccess(map, domainObject.getSpecialtyAccess()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.correspondence.configuration.domain.objects.UserAccess extractUserAccess(ims.domain.ILightweightDomainFactory domainFactory, ims.correspondence.vo.UserAccessFullVo valueObject) 
	{
		return 	extractUserAccess(domainFactory, valueObject, new HashMap());
	}

	public static ims.correspondence.configuration.domain.objects.UserAccess extractUserAccess(ims.domain.ILightweightDomainFactory domainFactory, ims.correspondence.vo.UserAccessFullVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_UserAccess();
		ims.correspondence.configuration.domain.objects.UserAccess domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.correspondence.configuration.domain.objects.UserAccess)domMap.get(valueObject);
			}
			// ims.correspondence.vo.UserAccessFullVo ID_UserAccess field is unknown
			domainObject = new ims.correspondence.configuration.domain.objects.UserAccess();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_UserAccess());
			if (domMap.get(key) != null)
			{
				return (ims.correspondence.configuration.domain.objects.UserAccess)domMap.get(key);
			}
			domainObject = (ims.correspondence.configuration.domain.objects.UserAccess) domainFactory.getDomainObject(ims.correspondence.configuration.domain.objects.UserAccess.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_UserAccess());

		ims.core.configuration.domain.objects.AppUser value1 = null;
		if ( null != valueObject.getAppUser() ) 
		{
			if (valueObject.getAppUser().getBoId() == null)
			{
				if (domMap.get(valueObject.getAppUser()) != null)
				{
					value1 = (ims.core.configuration.domain.objects.AppUser)domMap.get(valueObject.getAppUser());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getAppUser();	
			}
			else
			{
				value1 = (ims.core.configuration.domain.objects.AppUser)domainFactory.getDomainObject(ims.core.configuration.domain.objects.AppUser.class, valueObject.getAppUser().getBoId());
			}
		}
		domainObject.setAppUser(value1);
		domainObject.setConsultantAccess(ims.correspondence.vo.domain.ConsultantAccessFullVoAssembler.extractConsultantAccessSet(domainFactory, valueObject.getConsultantAccess(), domainObject.getConsultantAccess(), domMap));		
		domainObject.setClinicAccess(ims.correspondence.vo.domain.ClinicAccessFullVoAssembler.extractClinicAccessSet(domainFactory, valueObject.getClinicAccess(), domainObject.getClinicAccess(), domMap));		
		domainObject.setSpecialtyAccess(ims.correspondence.vo.domain.SpecialtyAccessVoAssembler.extractSpecialtyAccessSet(domainFactory, valueObject.getSpecialtyAccess(), domainObject.getSpecialtyAccess(), domMap));		

		return domainObject;
	}

}
