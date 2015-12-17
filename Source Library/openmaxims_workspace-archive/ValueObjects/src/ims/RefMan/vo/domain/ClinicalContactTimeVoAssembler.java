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
 * @author Ander Telleria
 */
public class ClinicalContactTimeVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.ClinicalContactTimeVo copy(ims.RefMan.vo.ClinicalContactTimeVo valueObjectDest, ims.RefMan.vo.ClinicalContactTimeVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ClinicalContactTime(valueObjectSrc.getID_ClinicalContactTime());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// StartHcp
		valueObjectDest.setStartHcp(valueObjectSrc.getStartHcp());
		// StartDateTime
		valueObjectDest.setStartDateTime(valueObjectSrc.getStartDateTime());
		// EndHcp
		valueObjectDest.setEndHcp(valueObjectSrc.getEndHcp());
		// EndDateTime
		valueObjectDest.setEndDateTime(valueObjectSrc.getEndDateTime());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createClinicalContactTimeVoCollectionFromClinicalContactTime(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.ClinicalContactTime objects.
	 */
	public static ims.RefMan.vo.ClinicalContactTimeVoCollection createClinicalContactTimeVoCollectionFromClinicalContactTime(java.util.Set domainObjectSet)	
	{
		return createClinicalContactTimeVoCollectionFromClinicalContactTime(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.ClinicalContactTime objects.
	 */
	public static ims.RefMan.vo.ClinicalContactTimeVoCollection createClinicalContactTimeVoCollectionFromClinicalContactTime(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.ClinicalContactTimeVoCollection voList = new ims.RefMan.vo.ClinicalContactTimeVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.RefMan.domain.objects.ClinicalContactTime domainObject = (ims.RefMan.domain.objects.ClinicalContactTime) iterator.next();
			ims.RefMan.vo.ClinicalContactTimeVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.RefMan.domain.objects.ClinicalContactTime objects.
	 */
	public static ims.RefMan.vo.ClinicalContactTimeVoCollection createClinicalContactTimeVoCollectionFromClinicalContactTime(java.util.List domainObjectList) 
	{
		return createClinicalContactTimeVoCollectionFromClinicalContactTime(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.ClinicalContactTime objects.
	 */
	public static ims.RefMan.vo.ClinicalContactTimeVoCollection createClinicalContactTimeVoCollectionFromClinicalContactTime(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.ClinicalContactTimeVoCollection voList = new ims.RefMan.vo.ClinicalContactTimeVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.ClinicalContactTime domainObject = (ims.RefMan.domain.objects.ClinicalContactTime) domainObjectList.get(i);
			ims.RefMan.vo.ClinicalContactTimeVo vo = create(map, domainObject);

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
	 * Create the ims.RefMan.domain.objects.ClinicalContactTime set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractClinicalContactTimeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ClinicalContactTimeVoCollection voCollection) 
	 {
	 	return extractClinicalContactTimeSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractClinicalContactTimeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ClinicalContactTimeVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.ClinicalContactTimeVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.ClinicalContactTime domainObject = ClinicalContactTimeVoAssembler.extractClinicalContactTime(domainFactory, vo, domMap);

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
	 * Create the ims.RefMan.domain.objects.ClinicalContactTime list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractClinicalContactTimeList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ClinicalContactTimeVoCollection voCollection) 
	 {
	 	return extractClinicalContactTimeList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractClinicalContactTimeList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ClinicalContactTimeVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.ClinicalContactTimeVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.ClinicalContactTime domainObject = ClinicalContactTimeVoAssembler.extractClinicalContactTime(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.RefMan.domain.objects.ClinicalContactTime object.
	 * @param domainObject ims.RefMan.domain.objects.ClinicalContactTime
	 */
	 public static ims.RefMan.vo.ClinicalContactTimeVo create(ims.RefMan.domain.objects.ClinicalContactTime domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.RefMan.domain.objects.ClinicalContactTime object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.ClinicalContactTimeVo create(DomainObjectMap map, ims.RefMan.domain.objects.ClinicalContactTime domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.ClinicalContactTimeVo valueObject = (ims.RefMan.vo.ClinicalContactTimeVo) map.getValueObject(domainObject, ims.RefMan.vo.ClinicalContactTimeVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.ClinicalContactTimeVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.RefMan.domain.objects.ClinicalContactTime
	 */
	 public static ims.RefMan.vo.ClinicalContactTimeVo insert(ims.RefMan.vo.ClinicalContactTimeVo valueObject, ims.RefMan.domain.objects.ClinicalContactTime domainObject) 
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
	 * @param domainObject ims.RefMan.domain.objects.ClinicalContactTime
	 */
	 public static ims.RefMan.vo.ClinicalContactTimeVo insert(DomainObjectMap map, ims.RefMan.vo.ClinicalContactTimeVo valueObject, ims.RefMan.domain.objects.ClinicalContactTime domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ClinicalContactTime(domainObject.getId());
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
			
		// StartHcp
		valueObject.setStartHcp(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getStartHcp()) );
		// StartDateTime
		java.util.Date StartDateTime = domainObject.getStartDateTime();
		if ( null != StartDateTime ) 
		{
			valueObject.setStartDateTime(new ims.framework.utils.DateTime(StartDateTime) );
		}
		// EndHcp
		valueObject.setEndHcp(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getEndHcp()) );
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
	public static ims.RefMan.domain.objects.ClinicalContactTime extractClinicalContactTime(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ClinicalContactTimeVo valueObject) 
	{
		return 	extractClinicalContactTime(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.ClinicalContactTime extractClinicalContactTime(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ClinicalContactTimeVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ClinicalContactTime();
		ims.RefMan.domain.objects.ClinicalContactTime domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.RefMan.domain.objects.ClinicalContactTime)domMap.get(valueObject);
			}
			// ims.RefMan.vo.ClinicalContactTimeVo ID_ClinicalContactTime field is unknown
			domainObject = new ims.RefMan.domain.objects.ClinicalContactTime();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ClinicalContactTime());
			if (domMap.get(key) != null)
			{
				return (ims.RefMan.domain.objects.ClinicalContactTime)domMap.get(key);
			}
			domainObject = (ims.RefMan.domain.objects.ClinicalContactTime) domainFactory.getDomainObject(ims.RefMan.domain.objects.ClinicalContactTime.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ClinicalContactTime());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value1 = null;
		if ( null != valueObject.getStartHcp() ) 
		{
			if (valueObject.getStartHcp().getBoId() == null)
			{
				if (domMap.get(valueObject.getStartHcp()) != null)
				{
					value1 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getStartHcp());
				}
			}
			else
			{
				value1 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getStartHcp().getBoId());
			}
		}
		domainObject.setStartHcp(value1);
		ims.framework.utils.DateTime dateTime2 = valueObject.getStartDateTime();
		java.util.Date value2 = null;
		if ( dateTime2 != null ) 
		{
			value2 = dateTime2.getJavaDate();
		}
		domainObject.setStartDateTime(value2);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value3 = null;
		if ( null != valueObject.getEndHcp() ) 
		{
			if (valueObject.getEndHcp().getBoId() == null)
			{
				if (domMap.get(valueObject.getEndHcp()) != null)
				{
					value3 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getEndHcp());
				}
			}
			else
			{
				value3 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getEndHcp().getBoId());
			}
		}
		domainObject.setEndHcp(value3);
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
