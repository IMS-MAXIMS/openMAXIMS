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
 * Generated on 12/10/2015, 13:25
 *
 */
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Sean Nesbitt
 */
public class PDSTelecomVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.PDSTelecomVo copy(ims.core.vo.PDSTelecomVo valueObjectDest, ims.core.vo.PDSTelecomVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PDSTel(valueObjectSrc.getID_PDSTel());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// TelecommAddress
		valueObjectDest.setTelecommAddress(valueObjectSrc.getTelecommAddress());
		// Use
		valueObjectDest.setUse(valueObjectSrc.getUse());
		// UseablePeriodLow
		valueObjectDest.setUseablePeriodLow(valueObjectSrc.getUseablePeriodLow());
		// UseablePeriodHigh
		valueObjectDest.setUseablePeriodHigh(valueObjectSrc.getUseablePeriodHigh());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPDSTelecomVoCollectionFromPDSTel(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.patient.domain.objects.PDSTel objects.
	 */
	public static ims.core.vo.PDSTelecomVoCollection createPDSTelecomVoCollectionFromPDSTel(java.util.Set domainObjectSet)	
	{
		return createPDSTelecomVoCollectionFromPDSTel(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.patient.domain.objects.PDSTel objects.
	 */
	public static ims.core.vo.PDSTelecomVoCollection createPDSTelecomVoCollectionFromPDSTel(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.PDSTelecomVoCollection voList = new ims.core.vo.PDSTelecomVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.patient.domain.objects.PDSTel domainObject = (ims.core.patient.domain.objects.PDSTel) iterator.next();
			ims.core.vo.PDSTelecomVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.patient.domain.objects.PDSTel objects.
	 */
	public static ims.core.vo.PDSTelecomVoCollection createPDSTelecomVoCollectionFromPDSTel(java.util.List domainObjectList) 
	{
		return createPDSTelecomVoCollectionFromPDSTel(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.patient.domain.objects.PDSTel objects.
	 */
	public static ims.core.vo.PDSTelecomVoCollection createPDSTelecomVoCollectionFromPDSTel(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.PDSTelecomVoCollection voList = new ims.core.vo.PDSTelecomVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.patient.domain.objects.PDSTel domainObject = (ims.core.patient.domain.objects.PDSTel) domainObjectList.get(i);
			ims.core.vo.PDSTelecomVo vo = create(map, domainObject);

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
	 * Create the ims.core.patient.domain.objects.PDSTel set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPDSTelSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PDSTelecomVoCollection voCollection) 
	 {
	 	return extractPDSTelSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPDSTelSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PDSTelecomVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PDSTelecomVo vo = voCollection.get(i);
			ims.core.patient.domain.objects.PDSTel domainObject = PDSTelecomVoAssembler.extractPDSTel(domainFactory, vo, domMap);

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
	 * Create the ims.core.patient.domain.objects.PDSTel list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPDSTelList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PDSTelecomVoCollection voCollection) 
	 {
	 	return extractPDSTelList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPDSTelList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PDSTelecomVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PDSTelecomVo vo = voCollection.get(i);
			ims.core.patient.domain.objects.PDSTel domainObject = PDSTelecomVoAssembler.extractPDSTel(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.patient.domain.objects.PDSTel object.
	 * @param domainObject ims.core.patient.domain.objects.PDSTel
	 */
	 public static ims.core.vo.PDSTelecomVo create(ims.core.patient.domain.objects.PDSTel domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.patient.domain.objects.PDSTel object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.PDSTelecomVo create(DomainObjectMap map, ims.core.patient.domain.objects.PDSTel domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.PDSTelecomVo valueObject = (ims.core.vo.PDSTelecomVo) map.getValueObject(domainObject, ims.core.vo.PDSTelecomVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.PDSTelecomVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.patient.domain.objects.PDSTel
	 */
	 public static ims.core.vo.PDSTelecomVo insert(ims.core.vo.PDSTelecomVo valueObject, ims.core.patient.domain.objects.PDSTel domainObject) 
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
	 * @param domainObject ims.core.patient.domain.objects.PDSTel
	 */
	 public static ims.core.vo.PDSTelecomVo insert(DomainObjectMap map, ims.core.vo.PDSTelecomVo valueObject, ims.core.patient.domain.objects.PDSTel domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PDSTel(domainObject.getId());
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
			
		// TelecommAddress
		valueObject.setTelecommAddress(domainObject.getTelecommAddress());
		// Use
		valueObject.setUse(domainObject.getUse());
		// UseablePeriodLow
		java.util.Date UseablePeriodLow = domainObject.getUseablePeriodLow();
		if ( null != UseablePeriodLow ) 
		{
			valueObject.setUseablePeriodLow(new ims.framework.utils.Date(UseablePeriodLow) );
		}
		// UseablePeriodHigh
		java.util.Date UseablePeriodHigh = domainObject.getUseablePeriodHigh();
		if ( null != UseablePeriodHigh ) 
		{
			valueObject.setUseablePeriodHigh(new ims.framework.utils.Date(UseablePeriodHigh) );
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.patient.domain.objects.PDSTel extractPDSTel(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PDSTelecomVo valueObject) 
	{
		return 	extractPDSTel(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.patient.domain.objects.PDSTel extractPDSTel(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PDSTelecomVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PDSTel();
		ims.core.patient.domain.objects.PDSTel domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.patient.domain.objects.PDSTel)domMap.get(valueObject);
			}
			// ims.core.vo.PDSTelecomVo ID_PDSTel field is unknown
			domainObject = new ims.core.patient.domain.objects.PDSTel();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PDSTel());
			if (domMap.get(key) != null)
			{
				return (ims.core.patient.domain.objects.PDSTel)domMap.get(key);
			}
			domainObject = (ims.core.patient.domain.objects.PDSTel) domainFactory.getDomainObject(ims.core.patient.domain.objects.PDSTel.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PDSTel());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getTelecommAddress() != null && valueObject.getTelecommAddress().equals(""))
		{
			valueObject.setTelecommAddress(null);
		}
		domainObject.setTelecommAddress(valueObject.getTelecommAddress());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getUse() != null && valueObject.getUse().equals(""))
		{
			valueObject.setUse(null);
		}
		domainObject.setUse(valueObject.getUse());
		java.util.Date value3 = null;
		ims.framework.utils.Date date3 = valueObject.getUseablePeriodLow();		
		if ( date3 != null ) 
		{
			value3 = date3.getDate();
		}
		domainObject.setUseablePeriodLow(value3);
		java.util.Date value4 = null;
		ims.framework.utils.Date date4 = valueObject.getUseablePeriodHigh();		
		if ( date4 != null ) 
		{
			value4 = date4.getDate();
		}
		domainObject.setUseablePeriodHigh(value4);

		return domainObject;
	}

}
