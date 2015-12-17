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
package ims.ocs_if.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Michael Noonan
 */
public class IfOrderChangeResponseVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.ocs_if.vo.IfOrderChangeResponseVo copy(ims.ocs_if.vo.IfOrderChangeResponseVo valueObjectDest, ims.ocs_if.vo.IfOrderChangeResponseVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_OrderChangeResponseQueue(valueObjectSrc.getID_OrderChangeResponseQueue());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ProviderSystem
		valueObjectDest.setProviderSystem(valueObjectSrc.getProviderSystem());
		// Investigation
		valueObjectDest.setInvestigation(valueObjectSrc.getInvestigation());
		// StatusReason
		valueObjectDest.setStatusReason(valueObjectSrc.getStatusReason());
		// CausingStatus
		valueObjectDest.setCausingStatus(valueObjectSrc.getCausingStatus());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createIfOrderChangeResponseVoCollectionFromOrderChangeResponseQueue(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.OrderChangeResponseQueue objects.
	 */
	public static ims.ocs_if.vo.IfOrderChangeResponseVoCollection createIfOrderChangeResponseVoCollectionFromOrderChangeResponseQueue(java.util.Set domainObjectSet)	
	{
		return createIfOrderChangeResponseVoCollectionFromOrderChangeResponseQueue(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.OrderChangeResponseQueue objects.
	 */
	public static ims.ocs_if.vo.IfOrderChangeResponseVoCollection createIfOrderChangeResponseVoCollectionFromOrderChangeResponseQueue(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.ocs_if.vo.IfOrderChangeResponseVoCollection voList = new ims.ocs_if.vo.IfOrderChangeResponseVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.ocrr.orderingresults.domain.objects.OrderChangeResponseQueue domainObject = (ims.ocrr.orderingresults.domain.objects.OrderChangeResponseQueue) iterator.next();
			ims.ocs_if.vo.IfOrderChangeResponseVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.ocrr.orderingresults.domain.objects.OrderChangeResponseQueue objects.
	 */
	public static ims.ocs_if.vo.IfOrderChangeResponseVoCollection createIfOrderChangeResponseVoCollectionFromOrderChangeResponseQueue(java.util.List domainObjectList) 
	{
		return createIfOrderChangeResponseVoCollectionFromOrderChangeResponseQueue(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.ocrr.orderingresults.domain.objects.OrderChangeResponseQueue objects.
	 */
	public static ims.ocs_if.vo.IfOrderChangeResponseVoCollection createIfOrderChangeResponseVoCollectionFromOrderChangeResponseQueue(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.ocs_if.vo.IfOrderChangeResponseVoCollection voList = new ims.ocs_if.vo.IfOrderChangeResponseVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.ocrr.orderingresults.domain.objects.OrderChangeResponseQueue domainObject = (ims.ocrr.orderingresults.domain.objects.OrderChangeResponseQueue) domainObjectList.get(i);
			ims.ocs_if.vo.IfOrderChangeResponseVo vo = create(map, domainObject);

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
	 * Create the ims.ocrr.orderingresults.domain.objects.OrderChangeResponseQueue set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractOrderChangeResponseQueueSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfOrderChangeResponseVoCollection voCollection) 
	 {
	 	return extractOrderChangeResponseQueueSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractOrderChangeResponseQueueSet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfOrderChangeResponseVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.ocs_if.vo.IfOrderChangeResponseVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.OrderChangeResponseQueue domainObject = IfOrderChangeResponseVoAssembler.extractOrderChangeResponseQueue(domainFactory, vo, domMap);

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
	 * Create the ims.ocrr.orderingresults.domain.objects.OrderChangeResponseQueue list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractOrderChangeResponseQueueList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfOrderChangeResponseVoCollection voCollection) 
	 {
	 	return extractOrderChangeResponseQueueList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractOrderChangeResponseQueueList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfOrderChangeResponseVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.ocs_if.vo.IfOrderChangeResponseVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.OrderChangeResponseQueue domainObject = IfOrderChangeResponseVoAssembler.extractOrderChangeResponseQueue(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.ocrr.orderingresults.domain.objects.OrderChangeResponseQueue object.
	 * @param domainObject ims.ocrr.orderingresults.domain.objects.OrderChangeResponseQueue
	 */
	 public static ims.ocs_if.vo.IfOrderChangeResponseVo create(ims.ocrr.orderingresults.domain.objects.OrderChangeResponseQueue domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.ocrr.orderingresults.domain.objects.OrderChangeResponseQueue object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.ocs_if.vo.IfOrderChangeResponseVo create(DomainObjectMap map, ims.ocrr.orderingresults.domain.objects.OrderChangeResponseQueue domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.ocs_if.vo.IfOrderChangeResponseVo valueObject = (ims.ocs_if.vo.IfOrderChangeResponseVo) map.getValueObject(domainObject, ims.ocs_if.vo.IfOrderChangeResponseVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.ocs_if.vo.IfOrderChangeResponseVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.ocrr.orderingresults.domain.objects.OrderChangeResponseQueue
	 */
	 public static ims.ocs_if.vo.IfOrderChangeResponseVo insert(ims.ocs_if.vo.IfOrderChangeResponseVo valueObject, ims.ocrr.orderingresults.domain.objects.OrderChangeResponseQueue domainObject) 
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
	 * @param domainObject ims.ocrr.orderingresults.domain.objects.OrderChangeResponseQueue
	 */
	 public static ims.ocs_if.vo.IfOrderChangeResponseVo insert(DomainObjectMap map, ims.ocs_if.vo.IfOrderChangeResponseVo valueObject, ims.ocrr.orderingresults.domain.objects.OrderChangeResponseQueue domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_OrderChangeResponseQueue(domainObject.getId());
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
			
		// ProviderSystem
		if (domainObject.getProviderSystem() != null)
		{
			if(domainObject.getProviderSystem() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getProviderSystem();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setProviderSystem(new ims.core.admin.vo.ProviderSystemRefVo(id, -1));				
			}
			else
			{
				valueObject.setProviderSystem(new ims.core.admin.vo.ProviderSystemRefVo(domainObject.getProviderSystem().getId(), domainObject.getProviderSystem().getVersion()));
			}
		}
		// Investigation
		if (domainObject.getInvestigation() != null)
		{
			if(domainObject.getInvestigation() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getInvestigation();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setInvestigation(new ims.ocrr.orderingresults.vo.OrderInvestigationRefVo(id, -1));				
			}
			else
			{
				valueObject.setInvestigation(new ims.ocrr.orderingresults.vo.OrderInvestigationRefVo(domainObject.getInvestigation().getId(), domainObject.getInvestigation().getVersion()));
			}
		}
		// StatusReason
		valueObject.setStatusReason(domainObject.getStatusReason());
		// CausingStatus
		ims.domain.lookups.LookupInstance instance4 = domainObject.getCausingStatus();
		if ( null != instance4 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance4.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance4.getImage().getImageId(), instance4.getImage().getImagePath());
			}
			color = instance4.getColor();
			if (color != null) 
				color.getValue();

			ims.ocrr.vo.lookups.OrderInvStatus voLookup4 = new ims.ocrr.vo.lookups.OrderInvStatus(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.ocrr.vo.lookups.OrderInvStatus parentVoLookup4 = voLookup4;
			ims.domain.lookups.LookupInstance parent4 = instance4.getParent();
			while (parent4 != null)
			{
				if (parent4.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent4.getImage().getImageId(), parent4.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent4.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup4.setParent(new ims.ocrr.vo.lookups.OrderInvStatus(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setCausingStatus(voLookup4);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.ocrr.orderingresults.domain.objects.OrderChangeResponseQueue extractOrderChangeResponseQueue(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfOrderChangeResponseVo valueObject) 
	{
		return 	extractOrderChangeResponseQueue(domainFactory, valueObject, new HashMap());
	}

	public static ims.ocrr.orderingresults.domain.objects.OrderChangeResponseQueue extractOrderChangeResponseQueue(ims.domain.ILightweightDomainFactory domainFactory, ims.ocs_if.vo.IfOrderChangeResponseVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_OrderChangeResponseQueue();
		ims.ocrr.orderingresults.domain.objects.OrderChangeResponseQueue domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.ocrr.orderingresults.domain.objects.OrderChangeResponseQueue)domMap.get(valueObject);
			}
			// ims.ocs_if.vo.IfOrderChangeResponseVo ID_OrderChangeResponseQueue field is unknown
			domainObject = new ims.ocrr.orderingresults.domain.objects.OrderChangeResponseQueue();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_OrderChangeResponseQueue());
			if (domMap.get(key) != null)
			{
				return (ims.ocrr.orderingresults.domain.objects.OrderChangeResponseQueue)domMap.get(key);
			}
			domainObject = (ims.ocrr.orderingresults.domain.objects.OrderChangeResponseQueue) domainFactory.getDomainObject(ims.ocrr.orderingresults.domain.objects.OrderChangeResponseQueue.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_OrderChangeResponseQueue());

		ims.core.admin.domain.objects.ProviderSystem value1 = null;
		if ( null != valueObject.getProviderSystem() ) 
		{
			if (valueObject.getProviderSystem().getBoId() == null)
			{
				if (domMap.get(valueObject.getProviderSystem()) != null)
				{
					value1 = (ims.core.admin.domain.objects.ProviderSystem)domMap.get(valueObject.getProviderSystem());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getProviderSystem();	
			}
			else
			{
				value1 = (ims.core.admin.domain.objects.ProviderSystem)domainFactory.getDomainObject(ims.core.admin.domain.objects.ProviderSystem.class, valueObject.getProviderSystem().getBoId());
			}
		}
		domainObject.setProviderSystem(value1);
		ims.ocrr.orderingresults.domain.objects.OrderInvestigation value2 = null;
		if ( null != valueObject.getInvestigation() ) 
		{
			if (valueObject.getInvestigation().getBoId() == null)
			{
				if (domMap.get(valueObject.getInvestigation()) != null)
				{
					value2 = (ims.ocrr.orderingresults.domain.objects.OrderInvestigation)domMap.get(valueObject.getInvestigation());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getInvestigation();	
			}
			else
			{
				value2 = (ims.ocrr.orderingresults.domain.objects.OrderInvestigation)domainFactory.getDomainObject(ims.ocrr.orderingresults.domain.objects.OrderInvestigation.class, valueObject.getInvestigation().getBoId());
			}
		}
		domainObject.setInvestigation(value2);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getStatusReason() != null && valueObject.getStatusReason().equals(""))
		{
			valueObject.setStatusReason(null);
		}
		domainObject.setStatusReason(valueObject.getStatusReason());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getCausingStatus() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getCausingStatus().getID());
		}
		domainObject.setCausingStatus(value4);

		return domainObject;
	}

}
