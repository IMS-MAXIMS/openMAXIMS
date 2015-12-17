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
 * @author Barbara Worwood
 */
public class CDSCriticalCareVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.CDSCriticalCareVo copy(ims.core.vo.CDSCriticalCareVo valueObjectDest, ims.core.vo.CDSCriticalCareVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_CDSCriticalCareDetails(valueObjectSrc.getID_CDSCriticalCareDetails());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// LocalId
		valueObjectDest.setLocalId(valueObjectSrc.getLocalId());
		// StartDate
		valueObjectDest.setStartDate(valueObjectSrc.getStartDate());
		// StartTime
		valueObjectDest.setStartTime(valueObjectSrc.getStartTime());
		// UnitFunction
		valueObjectDest.setUnitFunction(valueObjectSrc.getUnitFunction());
		// GestationLen
		valueObjectDest.setGestationLen(valueObjectSrc.getGestationLen());
		// ActivityDate
		valueObjectDest.setActivityDate(valueObjectSrc.getActivityDate());
		// PersonWeight
		valueObjectDest.setPersonWeight(valueObjectSrc.getPersonWeight());
		// ActivityCode
		valueObjectDest.setActivityCode(valueObjectSrc.getActivityCode());
		// HighCostDrugs
		valueObjectDest.setHighCostDrugs(valueObjectSrc.getHighCostDrugs());
		// DischargeDate
		valueObjectDest.setDischargeDate(valueObjectSrc.getDischargeDate());
		// DischargeTime
		valueObjectDest.setDischargeTime(valueObjectSrc.getDischargeTime());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createCDSCriticalCareVoCollectionFromCDSCriticalCareDetails(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.cds.domain.objects.CDSCriticalCareDetails objects.
	 */
	public static ims.core.vo.CDSCriticalCareVoCollection createCDSCriticalCareVoCollectionFromCDSCriticalCareDetails(java.util.Set domainObjectSet)	
	{
		return createCDSCriticalCareVoCollectionFromCDSCriticalCareDetails(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.cds.domain.objects.CDSCriticalCareDetails objects.
	 */
	public static ims.core.vo.CDSCriticalCareVoCollection createCDSCriticalCareVoCollectionFromCDSCriticalCareDetails(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.CDSCriticalCareVoCollection voList = new ims.core.vo.CDSCriticalCareVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.cds.domain.objects.CDSCriticalCareDetails domainObject = (ims.core.cds.domain.objects.CDSCriticalCareDetails) iterator.next();
			ims.core.vo.CDSCriticalCareVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.cds.domain.objects.CDSCriticalCareDetails objects.
	 */
	public static ims.core.vo.CDSCriticalCareVoCollection createCDSCriticalCareVoCollectionFromCDSCriticalCareDetails(java.util.List domainObjectList) 
	{
		return createCDSCriticalCareVoCollectionFromCDSCriticalCareDetails(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.cds.domain.objects.CDSCriticalCareDetails objects.
	 */
	public static ims.core.vo.CDSCriticalCareVoCollection createCDSCriticalCareVoCollectionFromCDSCriticalCareDetails(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.CDSCriticalCareVoCollection voList = new ims.core.vo.CDSCriticalCareVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.cds.domain.objects.CDSCriticalCareDetails domainObject = (ims.core.cds.domain.objects.CDSCriticalCareDetails) domainObjectList.get(i);
			ims.core.vo.CDSCriticalCareVo vo = create(map, domainObject);

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
	 * Create the ims.core.cds.domain.objects.CDSCriticalCareDetails set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractCDSCriticalCareDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CDSCriticalCareVoCollection voCollection) 
	 {
	 	return extractCDSCriticalCareDetailsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractCDSCriticalCareDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CDSCriticalCareVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.CDSCriticalCareVo vo = voCollection.get(i);
			ims.core.cds.domain.objects.CDSCriticalCareDetails domainObject = CDSCriticalCareVoAssembler.extractCDSCriticalCareDetails(domainFactory, vo, domMap);

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
	 * Create the ims.core.cds.domain.objects.CDSCriticalCareDetails list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractCDSCriticalCareDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CDSCriticalCareVoCollection voCollection) 
	 {
	 	return extractCDSCriticalCareDetailsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractCDSCriticalCareDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CDSCriticalCareVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.CDSCriticalCareVo vo = voCollection.get(i);
			ims.core.cds.domain.objects.CDSCriticalCareDetails domainObject = CDSCriticalCareVoAssembler.extractCDSCriticalCareDetails(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.cds.domain.objects.CDSCriticalCareDetails object.
	 * @param domainObject ims.core.cds.domain.objects.CDSCriticalCareDetails
	 */
	 public static ims.core.vo.CDSCriticalCareVo create(ims.core.cds.domain.objects.CDSCriticalCareDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.cds.domain.objects.CDSCriticalCareDetails object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.CDSCriticalCareVo create(DomainObjectMap map, ims.core.cds.domain.objects.CDSCriticalCareDetails domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.CDSCriticalCareVo valueObject = (ims.core.vo.CDSCriticalCareVo) map.getValueObject(domainObject, ims.core.vo.CDSCriticalCareVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.CDSCriticalCareVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.cds.domain.objects.CDSCriticalCareDetails
	 */
	 public static ims.core.vo.CDSCriticalCareVo insert(ims.core.vo.CDSCriticalCareVo valueObject, ims.core.cds.domain.objects.CDSCriticalCareDetails domainObject) 
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
	 * @param domainObject ims.core.cds.domain.objects.CDSCriticalCareDetails
	 */
	 public static ims.core.vo.CDSCriticalCareVo insert(DomainObjectMap map, ims.core.vo.CDSCriticalCareVo valueObject, ims.core.cds.domain.objects.CDSCriticalCareDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_CDSCriticalCareDetails(domainObject.getId());
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
			
		// LocalId
		valueObject.setLocalId(domainObject.getLocalId());
		// StartDate
		java.util.Date StartDate = domainObject.getStartDate();
		if ( null != StartDate ) 
		{
			valueObject.setStartDate(new ims.framework.utils.Date(StartDate) );
		}
		// StartTime
		String StartTime = domainObject.getStartTime();
		if ( null != StartTime ) 
		{
			valueObject.setStartTime(new ims.framework.utils.Time(StartTime) );
		}
		// UnitFunction
		valueObject.setUnitFunction(domainObject.getUnitFunction());
		// GestationLen
		valueObject.setGestationLen(domainObject.getGestationLen());
		// ActivityDate
		java.util.Date ActivityDate = domainObject.getActivityDate();
		if ( null != ActivityDate ) 
		{
			valueObject.setActivityDate(new ims.framework.utils.Date(ActivityDate) );
		}
		// PersonWeight
		valueObject.setPersonWeight(domainObject.getPersonWeight());
		// ActivityCode
		valueObject.setActivityCode(domainObject.getActivityCode());
		// HighCostDrugs
		valueObject.setHighCostDrugs(domainObject.getHighCostDrugs());
		// DischargeDate
		java.util.Date DischargeDate = domainObject.getDischargeDate();
		if ( null != DischargeDate ) 
		{
			valueObject.setDischargeDate(new ims.framework.utils.Date(DischargeDate) );
		}
		// DischargeTime
		String DischargeTime = domainObject.getDischargeTime();
		if ( null != DischargeTime ) 
		{
			valueObject.setDischargeTime(new ims.framework.utils.Time(DischargeTime) );
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.cds.domain.objects.CDSCriticalCareDetails extractCDSCriticalCareDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CDSCriticalCareVo valueObject) 
	{
		return 	extractCDSCriticalCareDetails(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.cds.domain.objects.CDSCriticalCareDetails extractCDSCriticalCareDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.CDSCriticalCareVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_CDSCriticalCareDetails();
		ims.core.cds.domain.objects.CDSCriticalCareDetails domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.cds.domain.objects.CDSCriticalCareDetails)domMap.get(valueObject);
			}
			// ims.core.vo.CDSCriticalCareVo ID_CDSCriticalCareDetails field is unknown
			domainObject = new ims.core.cds.domain.objects.CDSCriticalCareDetails();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_CDSCriticalCareDetails());
			if (domMap.get(key) != null)
			{
				return (ims.core.cds.domain.objects.CDSCriticalCareDetails)domMap.get(key);
			}
			domainObject = (ims.core.cds.domain.objects.CDSCriticalCareDetails) domainFactory.getDomainObject(ims.core.cds.domain.objects.CDSCriticalCareDetails.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_CDSCriticalCareDetails());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getLocalId() != null && valueObject.getLocalId().equals(""))
		{
			valueObject.setLocalId(null);
		}
		domainObject.setLocalId(valueObject.getLocalId());
		java.util.Date value2 = null;
		ims.framework.utils.Date date2 = valueObject.getStartDate();		
		if ( date2 != null ) 
		{
			value2 = date2.getDate();
		}
		domainObject.setStartDate(value2);
		ims.framework.utils.Time time3 = valueObject.getStartTime();
		String value3 = null;
		if ( time3 != null ) 
		{
			value3 = time3.toString();
		}
		domainObject.setStartTime(value3);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getUnitFunction() != null && valueObject.getUnitFunction().equals(""))
		{
			valueObject.setUnitFunction(null);
		}
		domainObject.setUnitFunction(valueObject.getUnitFunction());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getGestationLen() != null && valueObject.getGestationLen().equals(""))
		{
			valueObject.setGestationLen(null);
		}
		domainObject.setGestationLen(valueObject.getGestationLen());
		java.util.Date value6 = null;
		ims.framework.utils.Date date6 = valueObject.getActivityDate();		
		if ( date6 != null ) 
		{
			value6 = date6.getDate();
		}
		domainObject.setActivityDate(value6);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPersonWeight() != null && valueObject.getPersonWeight().equals(""))
		{
			valueObject.setPersonWeight(null);
		}
		domainObject.setPersonWeight(valueObject.getPersonWeight());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getActivityCode() != null && valueObject.getActivityCode().equals(""))
		{
			valueObject.setActivityCode(null);
		}
		domainObject.setActivityCode(valueObject.getActivityCode());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getHighCostDrugs() != null && valueObject.getHighCostDrugs().equals(""))
		{
			valueObject.setHighCostDrugs(null);
		}
		domainObject.setHighCostDrugs(valueObject.getHighCostDrugs());
		java.util.Date value10 = null;
		ims.framework.utils.Date date10 = valueObject.getDischargeDate();		
		if ( date10 != null ) 
		{
			value10 = date10.getDate();
		}
		domainObject.setDischargeDate(value10);
		ims.framework.utils.Time time11 = valueObject.getDischargeTime();
		String value11 = null;
		if ( time11 != null ) 
		{
			value11 = time11.toString();
		}
		domainObject.setDischargeTime(value11);

		return domainObject;
	}

}
