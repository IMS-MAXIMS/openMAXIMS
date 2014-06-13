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
 * @author Charlotte Murphy
 */
public class VSLungFunctionTestVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.VSLungFunctionTestVo copy(ims.core.vo.VSLungFunctionTestVo valueObjectDest, ims.core.vo.VSLungFunctionTestVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_LungFunctionTests(valueObjectSrc.getID_LungFunctionTests());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// PeakFlowPre
		valueObjectDest.setPeakFlowPre(valueObjectSrc.getPeakFlowPre());
		// PeakFlowPost
		valueObjectDest.setPeakFlowPost(valueObjectSrc.getPeakFlowPost());
		// TimeInterval
		valueObjectDest.setTimeInterval(valueObjectSrc.getTimeInterval());
		// TidalVolume
		valueObjectDest.setTidalVolume(valueObjectSrc.getTidalVolume());
		// IncentiveSpirometer
		valueObjectDest.setIncentiveSpirometer(valueObjectSrc.getIncentiveSpirometer());
		// TotalLungCapacity
		valueObjectDest.setTotalLungCapacity(valueObjectSrc.getTotalLungCapacity());
		// FunctionalResidualCapacity
		valueObjectDest.setFunctionalResidualCapacity(valueObjectSrc.getFunctionalResidualCapacity());
		// ForcedExpiratoryVolume
		valueObjectDest.setForcedExpiratoryVolume(valueObjectSrc.getForcedExpiratoryVolume());
		// ForcedVitalCapacity
		valueObjectDest.setForcedVitalCapacity(valueObjectSrc.getForcedVitalCapacity());
		// MinuteVolume
		valueObjectDest.setMinuteVolume(valueObjectSrc.getMinuteVolume());
		// VitalCapacity
		valueObjectDest.setVitalCapacity(valueObjectSrc.getVitalCapacity());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createVSLungFunctionTestVoCollectionFromLungFunctionTests(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.vitals.domain.objects.LungFunctionTests objects.
	 */
	public static ims.core.vo.VSLungFunctionTestVoCollection createVSLungFunctionTestVoCollectionFromLungFunctionTests(java.util.Set domainObjectSet)	
	{
		return createVSLungFunctionTestVoCollectionFromLungFunctionTests(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.vitals.domain.objects.LungFunctionTests objects.
	 */
	public static ims.core.vo.VSLungFunctionTestVoCollection createVSLungFunctionTestVoCollectionFromLungFunctionTests(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.VSLungFunctionTestVoCollection voList = new ims.core.vo.VSLungFunctionTestVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.vitals.domain.objects.LungFunctionTests domainObject = (ims.core.vitals.domain.objects.LungFunctionTests) iterator.next();
			ims.core.vo.VSLungFunctionTestVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.vitals.domain.objects.LungFunctionTests objects.
	 */
	public static ims.core.vo.VSLungFunctionTestVoCollection createVSLungFunctionTestVoCollectionFromLungFunctionTests(java.util.List domainObjectList) 
	{
		return createVSLungFunctionTestVoCollectionFromLungFunctionTests(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.vitals.domain.objects.LungFunctionTests objects.
	 */
	public static ims.core.vo.VSLungFunctionTestVoCollection createVSLungFunctionTestVoCollectionFromLungFunctionTests(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.VSLungFunctionTestVoCollection voList = new ims.core.vo.VSLungFunctionTestVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.vitals.domain.objects.LungFunctionTests domainObject = (ims.core.vitals.domain.objects.LungFunctionTests) domainObjectList.get(i);
			ims.core.vo.VSLungFunctionTestVo vo = create(map, domainObject);

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
	 * Create the ims.core.vitals.domain.objects.LungFunctionTests set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractLungFunctionTestsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.VSLungFunctionTestVoCollection voCollection) 
	 {
	 	return extractLungFunctionTestsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractLungFunctionTestsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.VSLungFunctionTestVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.VSLungFunctionTestVo vo = voCollection.get(i);
			ims.core.vitals.domain.objects.LungFunctionTests domainObject = VSLungFunctionTestVoAssembler.extractLungFunctionTests(domainFactory, vo, domMap);

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
	 * Create the ims.core.vitals.domain.objects.LungFunctionTests list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractLungFunctionTestsList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.VSLungFunctionTestVoCollection voCollection) 
	 {
	 	return extractLungFunctionTestsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractLungFunctionTestsList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.VSLungFunctionTestVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.VSLungFunctionTestVo vo = voCollection.get(i);
			ims.core.vitals.domain.objects.LungFunctionTests domainObject = VSLungFunctionTestVoAssembler.extractLungFunctionTests(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.vitals.domain.objects.LungFunctionTests object.
	 * @param domainObject ims.core.vitals.domain.objects.LungFunctionTests
	 */
	 public static ims.core.vo.VSLungFunctionTestVo create(ims.core.vitals.domain.objects.LungFunctionTests domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.vitals.domain.objects.LungFunctionTests object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.VSLungFunctionTestVo create(DomainObjectMap map, ims.core.vitals.domain.objects.LungFunctionTests domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.VSLungFunctionTestVo valueObject = (ims.core.vo.VSLungFunctionTestVo) map.getValueObject(domainObject, ims.core.vo.VSLungFunctionTestVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.VSLungFunctionTestVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.vitals.domain.objects.LungFunctionTests
	 */
	 public static ims.core.vo.VSLungFunctionTestVo insert(ims.core.vo.VSLungFunctionTestVo valueObject, ims.core.vitals.domain.objects.LungFunctionTests domainObject) 
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
	 * @param domainObject ims.core.vitals.domain.objects.LungFunctionTests
	 */
	 public static ims.core.vo.VSLungFunctionTestVo insert(DomainObjectMap map, ims.core.vo.VSLungFunctionTestVo valueObject, ims.core.vitals.domain.objects.LungFunctionTests domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_LungFunctionTests(domainObject.getId());
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
			
		// PeakFlowPre
		valueObject.setPeakFlowPre(domainObject.getPeakFlowPre());
		// PeakFlowPost
		valueObject.setPeakFlowPost(domainObject.getPeakFlowPost());
		// TimeInterval
		valueObject.setTimeInterval(domainObject.getTimeInterval());
		// TidalVolume
		valueObject.setTidalVolume(domainObject.getTidalVolume());
		// IncentiveSpirometer
		valueObject.setIncentiveSpirometer(domainObject.getIncentiveSpirometer());
		// TotalLungCapacity
		valueObject.setTotalLungCapacity(domainObject.getTotalLungCapacity());
		// FunctionalResidualCapacity
		valueObject.setFunctionalResidualCapacity(domainObject.getFunctionalResidualCapacity());
		// ForcedExpiratoryVolume
		valueObject.setForcedExpiratoryVolume(domainObject.getForcedExpiratoryVolume());
		// ForcedVitalCapacity
		valueObject.setForcedVitalCapacity(domainObject.getForcedVitalCapacity());
		// MinuteVolume
		valueObject.setMinuteVolume(domainObject.getMinuteVolume());
		// VitalCapacity
		valueObject.setVitalCapacity(domainObject.getVitalCapacity());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.vitals.domain.objects.LungFunctionTests extractLungFunctionTests(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.VSLungFunctionTestVo valueObject) 
	{
		return 	extractLungFunctionTests(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.vitals.domain.objects.LungFunctionTests extractLungFunctionTests(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.VSLungFunctionTestVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_LungFunctionTests();
		ims.core.vitals.domain.objects.LungFunctionTests domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.vitals.domain.objects.LungFunctionTests)domMap.get(valueObject);
			}
			// ims.core.vo.VSLungFunctionTestVo ID_LungFunctionTests field is unknown
			domainObject = new ims.core.vitals.domain.objects.LungFunctionTests();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_LungFunctionTests());
			if (domMap.get(key) != null)
			{
				return (ims.core.vitals.domain.objects.LungFunctionTests)domMap.get(key);
			}
			domainObject = (ims.core.vitals.domain.objects.LungFunctionTests) domainFactory.getDomainObject(ims.core.vitals.domain.objects.LungFunctionTests.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_LungFunctionTests());

		domainObject.setPeakFlowPre(valueObject.getPeakFlowPre());
		domainObject.setPeakFlowPost(valueObject.getPeakFlowPost());
		domainObject.setTimeInterval(valueObject.getTimeInterval());
		domainObject.setTidalVolume(valueObject.getTidalVolume());
		domainObject.setIncentiveSpirometer(valueObject.getIncentiveSpirometer());
		domainObject.setTotalLungCapacity(valueObject.getTotalLungCapacity());
		domainObject.setFunctionalResidualCapacity(valueObject.getFunctionalResidualCapacity());
		domainObject.setForcedExpiratoryVolume(valueObject.getForcedExpiratoryVolume());
		domainObject.setForcedVitalCapacity(valueObject.getForcedVitalCapacity());
		domainObject.setMinuteVolume(valueObject.getMinuteVolume());
		domainObject.setVitalCapacity(valueObject.getVitalCapacity());

		return domainObject;
	}

}
