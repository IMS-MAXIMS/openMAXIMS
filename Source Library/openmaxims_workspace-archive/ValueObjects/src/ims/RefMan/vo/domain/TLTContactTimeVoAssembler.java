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
 * @author Rory Fitzpatrick
 */
public class TLTContactTimeVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.TLTContactTimeVo copy(ims.RefMan.vo.TLTContactTimeVo valueObjectDest, ims.RefMan.vo.TLTContactTimeVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_TltContactTime(valueObjectSrc.getID_TltContactTime());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// StartTherapist
		valueObjectDest.setStartTherapist(valueObjectSrc.getStartTherapist());
		// StartDateTime
		valueObjectDest.setStartDateTime(valueObjectSrc.getStartDateTime());
		// EndTherapist
		valueObjectDest.setEndTherapist(valueObjectSrc.getEndTherapist());
		// EndDateTime
		valueObjectDest.setEndDateTime(valueObjectSrc.getEndDateTime());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createTLTContactTimeVoCollectionFromTltContactTime(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.TltContactTime objects.
	 */
	public static ims.RefMan.vo.TLTContactTimeVoCollection createTLTContactTimeVoCollectionFromTltContactTime(java.util.Set domainObjectSet)	
	{
		return createTLTContactTimeVoCollectionFromTltContactTime(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.TltContactTime objects.
	 */
	public static ims.RefMan.vo.TLTContactTimeVoCollection createTLTContactTimeVoCollectionFromTltContactTime(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.TLTContactTimeVoCollection voList = new ims.RefMan.vo.TLTContactTimeVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.RefMan.domain.objects.TltContactTime domainObject = (ims.RefMan.domain.objects.TltContactTime) iterator.next();
			ims.RefMan.vo.TLTContactTimeVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.RefMan.domain.objects.TltContactTime objects.
	 */
	public static ims.RefMan.vo.TLTContactTimeVoCollection createTLTContactTimeVoCollectionFromTltContactTime(java.util.List domainObjectList) 
	{
		return createTLTContactTimeVoCollectionFromTltContactTime(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.TltContactTime objects.
	 */
	public static ims.RefMan.vo.TLTContactTimeVoCollection createTLTContactTimeVoCollectionFromTltContactTime(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.TLTContactTimeVoCollection voList = new ims.RefMan.vo.TLTContactTimeVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.TltContactTime domainObject = (ims.RefMan.domain.objects.TltContactTime) domainObjectList.get(i);
			ims.RefMan.vo.TLTContactTimeVo vo = create(map, domainObject);

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
	 * Create the ims.RefMan.domain.objects.TltContactTime set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractTltContactTimeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.TLTContactTimeVoCollection voCollection) 
	 {
	 	return extractTltContactTimeSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractTltContactTimeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.TLTContactTimeVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.TLTContactTimeVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.TltContactTime domainObject = TLTContactTimeVoAssembler.extractTltContactTime(domainFactory, vo, domMap);

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
	 * Create the ims.RefMan.domain.objects.TltContactTime list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractTltContactTimeList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.TLTContactTimeVoCollection voCollection) 
	 {
	 	return extractTltContactTimeList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractTltContactTimeList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.TLTContactTimeVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.TLTContactTimeVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.TltContactTime domainObject = TLTContactTimeVoAssembler.extractTltContactTime(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.RefMan.domain.objects.TltContactTime object.
	 * @param domainObject ims.RefMan.domain.objects.TltContactTime
	 */
	 public static ims.RefMan.vo.TLTContactTimeVo create(ims.RefMan.domain.objects.TltContactTime domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.RefMan.domain.objects.TltContactTime object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.TLTContactTimeVo create(DomainObjectMap map, ims.RefMan.domain.objects.TltContactTime domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.TLTContactTimeVo valueObject = (ims.RefMan.vo.TLTContactTimeVo) map.getValueObject(domainObject, ims.RefMan.vo.TLTContactTimeVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.TLTContactTimeVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.RefMan.domain.objects.TltContactTime
	 */
	 public static ims.RefMan.vo.TLTContactTimeVo insert(ims.RefMan.vo.TLTContactTimeVo valueObject, ims.RefMan.domain.objects.TltContactTime domainObject) 
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
	 * @param domainObject ims.RefMan.domain.objects.TltContactTime
	 */
	 public static ims.RefMan.vo.TLTContactTimeVo insert(DomainObjectMap map, ims.RefMan.vo.TLTContactTimeVo valueObject, ims.RefMan.domain.objects.TltContactTime domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_TltContactTime(domainObject.getId());
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
			
		// StartTherapist
		valueObject.setStartTherapist(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getStartTherapist()) );
		// StartDateTime
		java.util.Date StartDateTime = domainObject.getStartDateTime();
		if ( null != StartDateTime ) 
		{
			valueObject.setStartDateTime(new ims.framework.utils.DateTime(StartDateTime) );
		}
		// EndTherapist
		valueObject.setEndTherapist(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getEndTherapist()) );
		// EndDateTime
		java.util.Date EndDateTime = domainObject.getEndDateTime();
		if ( null != EndDateTime ) 
		{
			valueObject.setEndDateTime(new ims.framework.utils.DateTime(EndDateTime) );
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.RefMan.domain.objects.TltContactTime extractTltContactTime(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.TLTContactTimeVo valueObject) 
	{
		return 	extractTltContactTime(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.TltContactTime extractTltContactTime(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.TLTContactTimeVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_TltContactTime();
		ims.RefMan.domain.objects.TltContactTime domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.RefMan.domain.objects.TltContactTime)domMap.get(valueObject);
			}
			// ims.RefMan.vo.TLTContactTimeVo ID_TltContactTime field is unknown
			domainObject = new ims.RefMan.domain.objects.TltContactTime();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_TltContactTime());
			if (domMap.get(key) != null)
			{
				return (ims.RefMan.domain.objects.TltContactTime)domMap.get(key);
			}
			domainObject = (ims.RefMan.domain.objects.TltContactTime) domainFactory.getDomainObject(ims.RefMan.domain.objects.TltContactTime.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_TltContactTime());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value1 = null;
		if ( null != valueObject.getStartTherapist() ) 
		{
			if (valueObject.getStartTherapist().getBoId() == null)
			{
				if (domMap.get(valueObject.getStartTherapist()) != null)
				{
					value1 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getStartTherapist());
				}
			}
			else
			{
				value1 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getStartTherapist().getBoId());
			}
		}
		domainObject.setStartTherapist(value1);
		ims.framework.utils.DateTime dateTime2 = valueObject.getStartDateTime();
		java.util.Date value2 = null;
		if ( dateTime2 != null ) 
		{
			value2 = dateTime2.getJavaDate();
		}
		domainObject.setStartDateTime(value2);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value3 = null;
		if ( null != valueObject.getEndTherapist() ) 
		{
			if (valueObject.getEndTherapist().getBoId() == null)
			{
				if (domMap.get(valueObject.getEndTherapist()) != null)
				{
					value3 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getEndTherapist());
				}
			}
			else
			{
				value3 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getEndTherapist().getBoId());
			}
		}
		domainObject.setEndTherapist(value3);
		ims.framework.utils.DateTime dateTime4 = valueObject.getEndDateTime();
		java.util.Date value4 = null;
		if ( dateTime4 != null ) 
		{
			value4 = dateTime4.getJavaDate();
		}
		domainObject.setEndDateTime(value4);

		return domainObject;
	}

}
