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
package ims.therapies.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Charlotte Murphy
 */
public class LeisureActivityOnWardVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.therapies.vo.LeisureActivityOnWardVo copy(ims.therapies.vo.LeisureActivityOnWardVo valueObjectDest, ims.therapies.vo.LeisureActivityOnWardVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_LeisureActivityOnWard(valueObjectSrc.getID_LeisureActivityOnWard());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ActivityDate
		valueObjectDest.setActivityDate(valueObjectSrc.getActivityDate());
		// Activity
		valueObjectDest.setActivity(valueObjectSrc.getActivity());
		// Comment
		valueObjectDest.setComment(valueObjectSrc.getComment());
		// AuthoringCP
		valueObjectDest.setAuthoringCP(valueObjectSrc.getAuthoringCP());
		// AuthoringDateTime
		valueObjectDest.setAuthoringDateTime(valueObjectSrc.getAuthoringDateTime());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createLeisureActivityOnWardVoCollectionFromLeisureActivityOnWard(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.therapies.workleisuredriving.domain.objects.LeisureActivityOnWard objects.
	 */
	public static ims.therapies.vo.LeisureActivityOnWardVoCollection createLeisureActivityOnWardVoCollectionFromLeisureActivityOnWard(java.util.Set domainObjectSet)	
	{
		return createLeisureActivityOnWardVoCollectionFromLeisureActivityOnWard(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.therapies.workleisuredriving.domain.objects.LeisureActivityOnWard objects.
	 */
	public static ims.therapies.vo.LeisureActivityOnWardVoCollection createLeisureActivityOnWardVoCollectionFromLeisureActivityOnWard(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.therapies.vo.LeisureActivityOnWardVoCollection voList = new ims.therapies.vo.LeisureActivityOnWardVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.therapies.workleisuredriving.domain.objects.LeisureActivityOnWard domainObject = (ims.therapies.workleisuredriving.domain.objects.LeisureActivityOnWard) iterator.next();
			ims.therapies.vo.LeisureActivityOnWardVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.therapies.workleisuredriving.domain.objects.LeisureActivityOnWard objects.
	 */
	public static ims.therapies.vo.LeisureActivityOnWardVoCollection createLeisureActivityOnWardVoCollectionFromLeisureActivityOnWard(java.util.List domainObjectList) 
	{
		return createLeisureActivityOnWardVoCollectionFromLeisureActivityOnWard(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.therapies.workleisuredriving.domain.objects.LeisureActivityOnWard objects.
	 */
	public static ims.therapies.vo.LeisureActivityOnWardVoCollection createLeisureActivityOnWardVoCollectionFromLeisureActivityOnWard(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.therapies.vo.LeisureActivityOnWardVoCollection voList = new ims.therapies.vo.LeisureActivityOnWardVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.therapies.workleisuredriving.domain.objects.LeisureActivityOnWard domainObject = (ims.therapies.workleisuredriving.domain.objects.LeisureActivityOnWard) domainObjectList.get(i);
			ims.therapies.vo.LeisureActivityOnWardVo vo = create(map, domainObject);

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
	 * Create the ims.therapies.workleisuredriving.domain.objects.LeisureActivityOnWard set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractLeisureActivityOnWardSet(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.LeisureActivityOnWardVoCollection voCollection) 
	 {
	 	return extractLeisureActivityOnWardSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractLeisureActivityOnWardSet(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.LeisureActivityOnWardVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.therapies.vo.LeisureActivityOnWardVo vo = voCollection.get(i);
			ims.therapies.workleisuredriving.domain.objects.LeisureActivityOnWard domainObject = LeisureActivityOnWardVoAssembler.extractLeisureActivityOnWard(domainFactory, vo, domMap);

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
	 * Create the ims.therapies.workleisuredriving.domain.objects.LeisureActivityOnWard list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractLeisureActivityOnWardList(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.LeisureActivityOnWardVoCollection voCollection) 
	 {
	 	return extractLeisureActivityOnWardList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractLeisureActivityOnWardList(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.LeisureActivityOnWardVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.therapies.vo.LeisureActivityOnWardVo vo = voCollection.get(i);
			ims.therapies.workleisuredriving.domain.objects.LeisureActivityOnWard domainObject = LeisureActivityOnWardVoAssembler.extractLeisureActivityOnWard(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.therapies.workleisuredriving.domain.objects.LeisureActivityOnWard object.
	 * @param domainObject ims.therapies.workleisuredriving.domain.objects.LeisureActivityOnWard
	 */
	 public static ims.therapies.vo.LeisureActivityOnWardVo create(ims.therapies.workleisuredriving.domain.objects.LeisureActivityOnWard domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.therapies.workleisuredriving.domain.objects.LeisureActivityOnWard object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.therapies.vo.LeisureActivityOnWardVo create(DomainObjectMap map, ims.therapies.workleisuredriving.domain.objects.LeisureActivityOnWard domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.therapies.vo.LeisureActivityOnWardVo valueObject = (ims.therapies.vo.LeisureActivityOnWardVo) map.getValueObject(domainObject, ims.therapies.vo.LeisureActivityOnWardVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.therapies.vo.LeisureActivityOnWardVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.therapies.workleisuredriving.domain.objects.LeisureActivityOnWard
	 */
	 public static ims.therapies.vo.LeisureActivityOnWardVo insert(ims.therapies.vo.LeisureActivityOnWardVo valueObject, ims.therapies.workleisuredriving.domain.objects.LeisureActivityOnWard domainObject) 
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
	 * @param domainObject ims.therapies.workleisuredriving.domain.objects.LeisureActivityOnWard
	 */
	 public static ims.therapies.vo.LeisureActivityOnWardVo insert(DomainObjectMap map, ims.therapies.vo.LeisureActivityOnWardVo valueObject, ims.therapies.workleisuredriving.domain.objects.LeisureActivityOnWard domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_LeisureActivityOnWard(domainObject.getId());
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
			
		// ActivityDate
		java.util.Date ActivityDate = domainObject.getActivityDate();
		if ( null != ActivityDate ) 
		{
			valueObject.setActivityDate(new ims.framework.utils.Date(ActivityDate) );
		}
		// Activity
		valueObject.setActivity(domainObject.getActivity());
		// Comment
		valueObject.setComment(domainObject.getComment());
		// AuthoringCP
		valueObject.setAuthoringCP(ims.core.vo.domain.HcpAssembler.create(map, domainObject.getAuthoringCP()) );
		// AuthoringDateTime
		java.util.Date AuthoringDateTime = domainObject.getAuthoringDateTime();
		if ( null != AuthoringDateTime ) 
		{
			valueObject.setAuthoringDateTime(new ims.framework.utils.DateTime(AuthoringDateTime) );
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.therapies.workleisuredriving.domain.objects.LeisureActivityOnWard extractLeisureActivityOnWard(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.LeisureActivityOnWardVo valueObject) 
	{
		return 	extractLeisureActivityOnWard(domainFactory, valueObject, new HashMap());
	}

	public static ims.therapies.workleisuredriving.domain.objects.LeisureActivityOnWard extractLeisureActivityOnWard(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.LeisureActivityOnWardVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_LeisureActivityOnWard();
		ims.therapies.workleisuredriving.domain.objects.LeisureActivityOnWard domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.therapies.workleisuredriving.domain.objects.LeisureActivityOnWard)domMap.get(valueObject);
			}
			// ims.therapies.vo.LeisureActivityOnWardVo ID_LeisureActivityOnWard field is unknown
			domainObject = new ims.therapies.workleisuredriving.domain.objects.LeisureActivityOnWard();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_LeisureActivityOnWard());
			if (domMap.get(key) != null)
			{
				return (ims.therapies.workleisuredriving.domain.objects.LeisureActivityOnWard)domMap.get(key);
			}
			domainObject = (ims.therapies.workleisuredriving.domain.objects.LeisureActivityOnWard) domainFactory.getDomainObject(ims.therapies.workleisuredriving.domain.objects.LeisureActivityOnWard.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_LeisureActivityOnWard());

		java.util.Date value1 = null;
		ims.framework.utils.Date date1 = valueObject.getActivityDate();		
		if ( date1 != null ) 
		{
			value1 = date1.getDate();
		}
		domainObject.setActivityDate(value1);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getActivity() != null && valueObject.getActivity().equals(""))
		{
			valueObject.setActivity(null);
		}
		domainObject.setActivity(valueObject.getActivity());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getComment() != null && valueObject.getComment().equals(""))
		{
			valueObject.setComment(null);
		}
		domainObject.setComment(valueObject.getComment());
		domainObject.setAuthoringCP(ims.core.vo.domain.HcpAssembler.extractHcp(domainFactory, valueObject.getAuthoringCP(), domMap));
		ims.framework.utils.DateTime dateTime5 = valueObject.getAuthoringDateTime();
		java.util.Date value5 = null;
		if ( dateTime5 != null ) 
		{
			value5 = dateTime5.getJavaDate();
		}
		domainObject.setAuthoringDateTime(value5);

		return domainObject;
	}

}
