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
package ims.admin.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Marius Mihalec
 */
public class UserDictionaryVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.admin.vo.UserDictionaryVo copy(ims.admin.vo.UserDictionaryVo valueObjectDest, ims.admin.vo.UserDictionaryVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_UserDictionary(valueObjectSrc.getID_UserDictionary());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// User
		valueObjectDest.setUser(valueObjectSrc.getUser());
		// Words
		valueObjectDest.setWords(valueObjectSrc.getWords());
		// GlobalDictionaries
		valueObjectDest.setGlobalDictionaries(valueObjectSrc.getGlobalDictionaries());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createUserDictionaryVoCollectionFromUserDictionary(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.UserDictionary objects.
	 */
	public static ims.admin.vo.UserDictionaryVoCollection createUserDictionaryVoCollectionFromUserDictionary(java.util.Set domainObjectSet)	
	{
		return createUserDictionaryVoCollectionFromUserDictionary(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.UserDictionary objects.
	 */
	public static ims.admin.vo.UserDictionaryVoCollection createUserDictionaryVoCollectionFromUserDictionary(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.admin.vo.UserDictionaryVoCollection voList = new ims.admin.vo.UserDictionaryVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.domain.objects.UserDictionary domainObject = (ims.core.admin.domain.objects.UserDictionary) iterator.next();
			ims.admin.vo.UserDictionaryVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.domain.objects.UserDictionary objects.
	 */
	public static ims.admin.vo.UserDictionaryVoCollection createUserDictionaryVoCollectionFromUserDictionary(java.util.List domainObjectList) 
	{
		return createUserDictionaryVoCollectionFromUserDictionary(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.domain.objects.UserDictionary objects.
	 */
	public static ims.admin.vo.UserDictionaryVoCollection createUserDictionaryVoCollectionFromUserDictionary(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.admin.vo.UserDictionaryVoCollection voList = new ims.admin.vo.UserDictionaryVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.domain.objects.UserDictionary domainObject = (ims.core.admin.domain.objects.UserDictionary) domainObjectList.get(i);
			ims.admin.vo.UserDictionaryVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.domain.objects.UserDictionary set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractUserDictionarySet(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.UserDictionaryVoCollection voCollection) 
	 {
	 	return extractUserDictionarySet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractUserDictionarySet(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.UserDictionaryVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.admin.vo.UserDictionaryVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.UserDictionary domainObject = UserDictionaryVoAssembler.extractUserDictionary(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.domain.objects.UserDictionary list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractUserDictionaryList(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.UserDictionaryVoCollection voCollection) 
	 {
	 	return extractUserDictionaryList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractUserDictionaryList(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.UserDictionaryVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.admin.vo.UserDictionaryVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.UserDictionary domainObject = UserDictionaryVoAssembler.extractUserDictionary(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.domain.objects.UserDictionary object.
	 * @param domainObject ims.core.admin.domain.objects.UserDictionary
	 */
	 public static ims.admin.vo.UserDictionaryVo create(ims.core.admin.domain.objects.UserDictionary domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.domain.objects.UserDictionary object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.admin.vo.UserDictionaryVo create(DomainObjectMap map, ims.core.admin.domain.objects.UserDictionary domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.admin.vo.UserDictionaryVo valueObject = (ims.admin.vo.UserDictionaryVo) map.getValueObject(domainObject, ims.admin.vo.UserDictionaryVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.admin.vo.UserDictionaryVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.domain.objects.UserDictionary
	 */
	 public static ims.admin.vo.UserDictionaryVo insert(ims.admin.vo.UserDictionaryVo valueObject, ims.core.admin.domain.objects.UserDictionary domainObject) 
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
	 * @param domainObject ims.core.admin.domain.objects.UserDictionary
	 */
	 public static ims.admin.vo.UserDictionaryVo insert(DomainObjectMap map, ims.admin.vo.UserDictionaryVo valueObject, ims.core.admin.domain.objects.UserDictionary domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_UserDictionary(domainObject.getId());
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
			
		// User
		if (domainObject.getUser() != null)
		{
			if(domainObject.getUser() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getUser();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setUser(new ims.core.configuration.vo.AppUserRefVo(id, -1));				
			}
			else
			{
				valueObject.setUser(new ims.core.configuration.vo.AppUserRefVo(domainObject.getUser().getId(), domainObject.getUser().getVersion()));
			}
		}
		// Words
		valueObject.setWords(ims.admin.vo.domain.UserDictionaryWordVoAssembler.createUserDictionaryWordVoCollectionFromUserDictionaryWord(map, domainObject.getWords()) );
		// GlobalDictionaries
		ims.core.admin.vo.GlobalDictionaryRefVoCollection GlobalDictionaries = new ims.core.admin.vo.GlobalDictionaryRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getGlobalDictionaries().iterator(); iterator.hasNext(); ) 
		{
			ims.core.admin.domain.objects.GlobalDictionary tmp = (ims.core.admin.domain.objects.GlobalDictionary)iterator.next();
			if (tmp != null)
				GlobalDictionaries.add(new ims.core.admin.vo.GlobalDictionaryRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setGlobalDictionaries(GlobalDictionaries);
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.domain.objects.UserDictionary extractUserDictionary(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.UserDictionaryVo valueObject) 
	{
		return 	extractUserDictionary(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.domain.objects.UserDictionary extractUserDictionary(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.UserDictionaryVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_UserDictionary();
		ims.core.admin.domain.objects.UserDictionary domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.domain.objects.UserDictionary)domMap.get(valueObject);
			}
			// ims.admin.vo.UserDictionaryVo ID_UserDictionary field is unknown
			domainObject = new ims.core.admin.domain.objects.UserDictionary();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_UserDictionary());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.domain.objects.UserDictionary)domMap.get(key);
			}
			domainObject = (ims.core.admin.domain.objects.UserDictionary) domainFactory.getDomainObject(ims.core.admin.domain.objects.UserDictionary.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_UserDictionary());

		ims.core.configuration.domain.objects.AppUser value1 = null;
		if ( null != valueObject.getUser() ) 
		{
			if (valueObject.getUser().getBoId() == null)
			{
				if (domMap.get(valueObject.getUser()) != null)
				{
					value1 = (ims.core.configuration.domain.objects.AppUser)domMap.get(valueObject.getUser());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getUser();	
			}
			else
			{
				value1 = (ims.core.configuration.domain.objects.AppUser)domainFactory.getDomainObject(ims.core.configuration.domain.objects.AppUser.class, valueObject.getUser().getBoId());
			}
		}
		domainObject.setUser(value1);
		domainObject.setWords(ims.admin.vo.domain.UserDictionaryWordVoAssembler.extractUserDictionaryWordSet(domainFactory, valueObject.getWords(), domainObject.getWords(), domMap));		

		ims.core.admin.vo.GlobalDictionaryRefVoCollection refCollection3 = valueObject.getGlobalDictionaries();
		int size3 = (null == refCollection3) ? 0 : refCollection3.size();		
		java.util.Set domainGlobalDictionaries3 = domainObject.getGlobalDictionaries();
		if (domainGlobalDictionaries3 == null)
		{
			domainGlobalDictionaries3 = new java.util.HashSet();
		}
		java.util.Set newSet3  = new java.util.HashSet();
		for(int i=0; i<size3; i++) 
		{
			ims.core.admin.vo.GlobalDictionaryRefVo vo = refCollection3.get(i);					
			ims.core.admin.domain.objects.GlobalDictionary dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.admin.domain.objects.GlobalDictionary)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.admin.domain.objects.GlobalDictionary)domainFactory.getDomainObject( ims.core.admin.domain.objects.GlobalDictionary.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainGlobalDictionaries3.contains(dom))
			{
				domainGlobalDictionaries3.add(dom);
			}
			newSet3.add(dom);			
		}
		java.util.Set removedSet3 = new java.util.HashSet();
		java.util.Iterator iter3 = domainGlobalDictionaries3.iterator();
		//Find out which objects need to be removed
		while (iter3.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter3.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet3.contains(o))
			{
				removedSet3.add(o);
			}
		}
		iter3 = removedSet3.iterator();
		//Remove the unwanted objects
		while (iter3.hasNext())
		{
			domainGlobalDictionaries3.remove(iter3.next());
		}		
		
		domainObject.setGlobalDictionaries(domainGlobalDictionaries3);		

		return domainObject;
	}

}
