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
 * @author Calin Perebiceanu
 */
public class ContractConfigKPIHistoryVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.ContractConfigKPIHistoryVo copy(ims.RefMan.vo.ContractConfigKPIHistoryVo valueObjectDest, ims.RefMan.vo.ContractConfigKPIHistoryVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ContractConfigKPIHistory(valueObjectSrc.getID_ContractConfigKPIHistory());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// DateInstantiated
		valueObjectDest.setDateInstantiated(valueObjectSrc.getDateInstantiated());
		// DaysToRTTBreachDate
		valueObjectDest.setDaysToRTTBreachDate(valueObjectSrc.getDaysToRTTBreachDate());
		// daysTo1stAppt
		valueObjectDest.setDaysTo1stAppt(valueObjectSrc.getDaysTo1stAppt());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createContractConfigKPIHistoryVoCollectionFromContractConfigKPIHistory(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.configuration.domain.objects.ContractConfigKPIHistory objects.
	 */
	public static ims.RefMan.vo.ContractConfigKPIHistoryVoCollection createContractConfigKPIHistoryVoCollectionFromContractConfigKPIHistory(java.util.Set domainObjectSet)	
	{
		return createContractConfigKPIHistoryVoCollectionFromContractConfigKPIHistory(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.configuration.domain.objects.ContractConfigKPIHistory objects.
	 */
	public static ims.RefMan.vo.ContractConfigKPIHistoryVoCollection createContractConfigKPIHistoryVoCollectionFromContractConfigKPIHistory(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.ContractConfigKPIHistoryVoCollection voList = new ims.RefMan.vo.ContractConfigKPIHistoryVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.configuration.domain.objects.ContractConfigKPIHistory domainObject = (ims.core.configuration.domain.objects.ContractConfigKPIHistory) iterator.next();
			ims.RefMan.vo.ContractConfigKPIHistoryVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.configuration.domain.objects.ContractConfigKPIHistory objects.
	 */
	public static ims.RefMan.vo.ContractConfigKPIHistoryVoCollection createContractConfigKPIHistoryVoCollectionFromContractConfigKPIHistory(java.util.List domainObjectList) 
	{
		return createContractConfigKPIHistoryVoCollectionFromContractConfigKPIHistory(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.configuration.domain.objects.ContractConfigKPIHistory objects.
	 */
	public static ims.RefMan.vo.ContractConfigKPIHistoryVoCollection createContractConfigKPIHistoryVoCollectionFromContractConfigKPIHistory(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.ContractConfigKPIHistoryVoCollection voList = new ims.RefMan.vo.ContractConfigKPIHistoryVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.configuration.domain.objects.ContractConfigKPIHistory domainObject = (ims.core.configuration.domain.objects.ContractConfigKPIHistory) domainObjectList.get(i);
			ims.RefMan.vo.ContractConfigKPIHistoryVo vo = create(map, domainObject);

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
	 * Create the ims.core.configuration.domain.objects.ContractConfigKPIHistory set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractContractConfigKPIHistorySet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ContractConfigKPIHistoryVoCollection voCollection) 
	 {
	 	return extractContractConfigKPIHistorySet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractContractConfigKPIHistorySet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ContractConfigKPIHistoryVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.ContractConfigKPIHistoryVo vo = voCollection.get(i);
			ims.core.configuration.domain.objects.ContractConfigKPIHistory domainObject = ContractConfigKPIHistoryVoAssembler.extractContractConfigKPIHistory(domainFactory, vo, domMap);

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
	 * Create the ims.core.configuration.domain.objects.ContractConfigKPIHistory list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractContractConfigKPIHistoryList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ContractConfigKPIHistoryVoCollection voCollection) 
	 {
	 	return extractContractConfigKPIHistoryList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractContractConfigKPIHistoryList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ContractConfigKPIHistoryVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.ContractConfigKPIHistoryVo vo = voCollection.get(i);
			ims.core.configuration.domain.objects.ContractConfigKPIHistory domainObject = ContractConfigKPIHistoryVoAssembler.extractContractConfigKPIHistory(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.configuration.domain.objects.ContractConfigKPIHistory object.
	 * @param domainObject ims.core.configuration.domain.objects.ContractConfigKPIHistory
	 */
	 public static ims.RefMan.vo.ContractConfigKPIHistoryVo create(ims.core.configuration.domain.objects.ContractConfigKPIHistory domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.configuration.domain.objects.ContractConfigKPIHistory object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.ContractConfigKPIHistoryVo create(DomainObjectMap map, ims.core.configuration.domain.objects.ContractConfigKPIHistory domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.ContractConfigKPIHistoryVo valueObject = (ims.RefMan.vo.ContractConfigKPIHistoryVo) map.getValueObject(domainObject, ims.RefMan.vo.ContractConfigKPIHistoryVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.ContractConfigKPIHistoryVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.configuration.domain.objects.ContractConfigKPIHistory
	 */
	 public static ims.RefMan.vo.ContractConfigKPIHistoryVo insert(ims.RefMan.vo.ContractConfigKPIHistoryVo valueObject, ims.core.configuration.domain.objects.ContractConfigKPIHistory domainObject) 
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
	 * @param domainObject ims.core.configuration.domain.objects.ContractConfigKPIHistory
	 */
	 public static ims.RefMan.vo.ContractConfigKPIHistoryVo insert(DomainObjectMap map, ims.RefMan.vo.ContractConfigKPIHistoryVo valueObject, ims.core.configuration.domain.objects.ContractConfigKPIHistory domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ContractConfigKPIHistory(domainObject.getId());
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
			
		// DateInstantiated
		java.util.Date DateInstantiated = domainObject.getDateInstantiated();
		if ( null != DateInstantiated ) 
		{
			valueObject.setDateInstantiated(new ims.framework.utils.Date(DateInstantiated) );
		}
		// DaysToRTTBreachDate
		valueObject.setDaysToRTTBreachDate(domainObject.getDaysToRTTBreachDate());
		// daysTo1stAppt
		valueObject.setDaysTo1stAppt(domainObject.getDaysTo1stAppt());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.configuration.domain.objects.ContractConfigKPIHistory extractContractConfigKPIHistory(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ContractConfigKPIHistoryVo valueObject) 
	{
		return 	extractContractConfigKPIHistory(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.configuration.domain.objects.ContractConfigKPIHistory extractContractConfigKPIHistory(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ContractConfigKPIHistoryVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ContractConfigKPIHistory();
		ims.core.configuration.domain.objects.ContractConfigKPIHistory domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.configuration.domain.objects.ContractConfigKPIHistory)domMap.get(valueObject);
			}
			// ims.RefMan.vo.ContractConfigKPIHistoryVo ID_ContractConfigKPIHistory field is unknown
			domainObject = new ims.core.configuration.domain.objects.ContractConfigKPIHistory();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ContractConfigKPIHistory());
			if (domMap.get(key) != null)
			{
				return (ims.core.configuration.domain.objects.ContractConfigKPIHistory)domMap.get(key);
			}
			domainObject = (ims.core.configuration.domain.objects.ContractConfigKPIHistory) domainFactory.getDomainObject(ims.core.configuration.domain.objects.ContractConfigKPIHistory.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ContractConfigKPIHistory());

		java.util.Date value1 = null;
		ims.framework.utils.Date date1 = valueObject.getDateInstantiated();		
		if ( date1 != null ) 
		{
			value1 = date1.getDate();
		}
		domainObject.setDateInstantiated(value1);
		domainObject.setDaysToRTTBreachDate(valueObject.getDaysToRTTBreachDate());
		domainObject.setDaysTo1stAppt(valueObject.getDaysTo1stAppt());

		return domainObject;
	}

}
