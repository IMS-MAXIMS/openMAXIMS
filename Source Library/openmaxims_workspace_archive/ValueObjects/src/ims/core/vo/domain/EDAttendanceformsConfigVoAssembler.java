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
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cornel Ventuneac
 */
public class EDAttendanceformsConfigVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.EDAttendanceformsConfigVo copy(ims.core.vo.EDAttendanceformsConfigVo valueObjectDest, ims.core.vo.EDAttendanceformsConfigVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_EDAttendenceformsConfig(valueObjectSrc.getID_EDAttendenceformsConfig());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ChartRequestedTabVisible
		valueObjectDest.setChartRequestedTabVisible(valueObjectSrc.getChartRequestedTabVisible());
		// InvoicesBillingTabVisible
		valueObjectDest.setInvoicesBillingTabVisible(valueObjectSrc.getInvoicesBillingTabVisible());
		// ControlsConfigItems
		valueObjectDest.setControlsConfigItems(valueObjectSrc.getControlsConfigItems());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createEDAttendanceformsConfigVoCollectionFromEDAttendenceformsConfig(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.EDAttendenceformsConfig objects.
	 */
	public static ims.core.vo.EDAttendanceformsConfigVoCollection createEDAttendanceformsConfigVoCollectionFromEDAttendenceformsConfig(java.util.Set domainObjectSet)	
	{
		return createEDAttendanceformsConfigVoCollectionFromEDAttendenceformsConfig(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.EDAttendenceformsConfig objects.
	 */
	public static ims.core.vo.EDAttendanceformsConfigVoCollection createEDAttendanceformsConfigVoCollectionFromEDAttendenceformsConfig(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.EDAttendanceformsConfigVoCollection voList = new ims.core.vo.EDAttendanceformsConfigVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.domain.objects.EDAttendenceformsConfig domainObject = (ims.core.admin.domain.objects.EDAttendenceformsConfig) iterator.next();
			ims.core.vo.EDAttendanceformsConfigVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.domain.objects.EDAttendenceformsConfig objects.
	 */
	public static ims.core.vo.EDAttendanceformsConfigVoCollection createEDAttendanceformsConfigVoCollectionFromEDAttendenceformsConfig(java.util.List domainObjectList) 
	{
		return createEDAttendanceformsConfigVoCollectionFromEDAttendenceformsConfig(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.domain.objects.EDAttendenceformsConfig objects.
	 */
	public static ims.core.vo.EDAttendanceformsConfigVoCollection createEDAttendanceformsConfigVoCollectionFromEDAttendenceformsConfig(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.EDAttendanceformsConfigVoCollection voList = new ims.core.vo.EDAttendanceformsConfigVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.domain.objects.EDAttendenceformsConfig domainObject = (ims.core.admin.domain.objects.EDAttendenceformsConfig) domainObjectList.get(i);
			ims.core.vo.EDAttendanceformsConfigVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.domain.objects.EDAttendenceformsConfig set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractEDAttendenceformsConfigSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.EDAttendanceformsConfigVoCollection voCollection) 
	 {
	 	return extractEDAttendenceformsConfigSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractEDAttendenceformsConfigSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.EDAttendanceformsConfigVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.EDAttendanceformsConfigVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.EDAttendenceformsConfig domainObject = EDAttendanceformsConfigVoAssembler.extractEDAttendenceformsConfig(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.domain.objects.EDAttendenceformsConfig list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractEDAttendenceformsConfigList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.EDAttendanceformsConfigVoCollection voCollection) 
	 {
	 	return extractEDAttendenceformsConfigList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractEDAttendenceformsConfigList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.EDAttendanceformsConfigVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.EDAttendanceformsConfigVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.EDAttendenceformsConfig domainObject = EDAttendanceformsConfigVoAssembler.extractEDAttendenceformsConfig(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.domain.objects.EDAttendenceformsConfig object.
	 * @param domainObject ims.core.admin.domain.objects.EDAttendenceformsConfig
	 */
	 public static ims.core.vo.EDAttendanceformsConfigVo create(ims.core.admin.domain.objects.EDAttendenceformsConfig domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.domain.objects.EDAttendenceformsConfig object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.EDAttendanceformsConfigVo create(DomainObjectMap map, ims.core.admin.domain.objects.EDAttendenceformsConfig domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.EDAttendanceformsConfigVo valueObject = (ims.core.vo.EDAttendanceformsConfigVo) map.getValueObject(domainObject, ims.core.vo.EDAttendanceformsConfigVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.EDAttendanceformsConfigVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.domain.objects.EDAttendenceformsConfig
	 */
	 public static ims.core.vo.EDAttendanceformsConfigVo insert(ims.core.vo.EDAttendanceformsConfigVo valueObject, ims.core.admin.domain.objects.EDAttendenceformsConfig domainObject) 
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
	 * @param domainObject ims.core.admin.domain.objects.EDAttendenceformsConfig
	 */
	 public static ims.core.vo.EDAttendanceformsConfigVo insert(DomainObjectMap map, ims.core.vo.EDAttendanceformsConfigVo valueObject, ims.core.admin.domain.objects.EDAttendenceformsConfig domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_EDAttendenceformsConfig(domainObject.getId());
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
			
		// ChartRequestedTabVisible
		valueObject.setChartRequestedTabVisible( domainObject.isChartRequestedTabVisible() );
		// InvoicesBillingTabVisible
		valueObject.setInvoicesBillingTabVisible( domainObject.isInvoicesBillingTabVisible() );
		// ControlsConfigItems
		valueObject.setControlsConfigItems(ims.admin.vo.domain.EDAttendanceControlsConfigVoAssembler.createEDAttendanceControlsConfigVoCollectionFromEDAttendenceControlsConfig(map, domainObject.getControlsConfigItems()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.domain.objects.EDAttendenceformsConfig extractEDAttendenceformsConfig(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.EDAttendanceformsConfigVo valueObject) 
	{
		return 	extractEDAttendenceformsConfig(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.domain.objects.EDAttendenceformsConfig extractEDAttendenceformsConfig(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.EDAttendanceformsConfigVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_EDAttendenceformsConfig();
		ims.core.admin.domain.objects.EDAttendenceformsConfig domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.domain.objects.EDAttendenceformsConfig)domMap.get(valueObject);
			}
			// ims.core.vo.EDAttendanceformsConfigVo ID_EDAttendenceformsConfig field is unknown
			domainObject = new ims.core.admin.domain.objects.EDAttendenceformsConfig();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_EDAttendenceformsConfig());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.domain.objects.EDAttendenceformsConfig)domMap.get(key);
			}
			domainObject = (ims.core.admin.domain.objects.EDAttendenceformsConfig) domainFactory.getDomainObject(ims.core.admin.domain.objects.EDAttendenceformsConfig.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_EDAttendenceformsConfig());

		domainObject.setChartRequestedTabVisible(valueObject.getChartRequestedTabVisible());
		domainObject.setInvoicesBillingTabVisible(valueObject.getInvoicesBillingTabVisible());
		domainObject.setControlsConfigItems(ims.admin.vo.domain.EDAttendanceControlsConfigVoAssembler.extractEDAttendenceControlsConfigList(domainFactory, valueObject.getControlsConfigItems(), domainObject.getControlsConfigItems(), domMap));		

		return domainObject;
	}

}
