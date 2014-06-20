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
 * @author Daniel Laffan
 */
public class OrderInvApptVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.OrderInvApptVo copy(ims.RefMan.vo.OrderInvApptVo valueObjectDest, ims.RefMan.vo.OrderInvApptVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_OrderInvAppt(valueObjectSrc.getID_OrderInvAppt());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// OrderInvestigation
		valueObjectDest.setOrderInvestigation(valueObjectSrc.getOrderInvestigation());
		// Appointment
		valueObjectDest.setAppointment(valueObjectSrc.getAppointment());
		// Status
		valueObjectDest.setStatus(valueObjectSrc.getStatus());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createOrderInvApptVoCollectionFromOrderInvAppt(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.OrderInvAppt objects.
	 */
	public static ims.RefMan.vo.OrderInvApptVoCollection createOrderInvApptVoCollectionFromOrderInvAppt(java.util.Set domainObjectSet)	
	{
		return createOrderInvApptVoCollectionFromOrderInvAppt(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.OrderInvAppt objects.
	 */
	public static ims.RefMan.vo.OrderInvApptVoCollection createOrderInvApptVoCollectionFromOrderInvAppt(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.OrderInvApptVoCollection voList = new ims.RefMan.vo.OrderInvApptVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.RefMan.domain.objects.OrderInvAppt domainObject = (ims.RefMan.domain.objects.OrderInvAppt) iterator.next();
			ims.RefMan.vo.OrderInvApptVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.RefMan.domain.objects.OrderInvAppt objects.
	 */
	public static ims.RefMan.vo.OrderInvApptVoCollection createOrderInvApptVoCollectionFromOrderInvAppt(java.util.List domainObjectList) 
	{
		return createOrderInvApptVoCollectionFromOrderInvAppt(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.OrderInvAppt objects.
	 */
	public static ims.RefMan.vo.OrderInvApptVoCollection createOrderInvApptVoCollectionFromOrderInvAppt(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.OrderInvApptVoCollection voList = new ims.RefMan.vo.OrderInvApptVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.OrderInvAppt domainObject = (ims.RefMan.domain.objects.OrderInvAppt) domainObjectList.get(i);
			ims.RefMan.vo.OrderInvApptVo vo = create(map, domainObject);

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
	 * Create the ims.RefMan.domain.objects.OrderInvAppt set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractOrderInvApptSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.OrderInvApptVoCollection voCollection) 
	 {
	 	return extractOrderInvApptSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractOrderInvApptSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.OrderInvApptVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.OrderInvApptVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.OrderInvAppt domainObject = OrderInvApptVoAssembler.extractOrderInvAppt(domainFactory, vo, domMap);

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
	 * Create the ims.RefMan.domain.objects.OrderInvAppt list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractOrderInvApptList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.OrderInvApptVoCollection voCollection) 
	 {
	 	return extractOrderInvApptList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractOrderInvApptList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.OrderInvApptVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.OrderInvApptVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.OrderInvAppt domainObject = OrderInvApptVoAssembler.extractOrderInvAppt(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.RefMan.domain.objects.OrderInvAppt object.
	 * @param domainObject ims.RefMan.domain.objects.OrderInvAppt
	 */
	 public static ims.RefMan.vo.OrderInvApptVo create(ims.RefMan.domain.objects.OrderInvAppt domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.RefMan.domain.objects.OrderInvAppt object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.OrderInvApptVo create(DomainObjectMap map, ims.RefMan.domain.objects.OrderInvAppt domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.OrderInvApptVo valueObject = (ims.RefMan.vo.OrderInvApptVo) map.getValueObject(domainObject, ims.RefMan.vo.OrderInvApptVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.OrderInvApptVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.RefMan.domain.objects.OrderInvAppt
	 */
	 public static ims.RefMan.vo.OrderInvApptVo insert(ims.RefMan.vo.OrderInvApptVo valueObject, ims.RefMan.domain.objects.OrderInvAppt domainObject) 
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
	 * @param domainObject ims.RefMan.domain.objects.OrderInvAppt
	 */
	 public static ims.RefMan.vo.OrderInvApptVo insert(DomainObjectMap map, ims.RefMan.vo.OrderInvApptVo valueObject, ims.RefMan.domain.objects.OrderInvAppt domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_OrderInvAppt(domainObject.getId());
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
			
		// OrderInvestigation
		valueObject.setOrderInvestigation(ims.ocrr.vo.domain.OrderInvestigationBookingVoAssembler.create(map, domainObject.getOrderInvestigation()) );
		// Appointment
		valueObject.setAppointment(ims.scheduling.vo.domain.Booking_AppointmentVoAssembler.create(map, domainObject.getAppointment()) );
		// Status
		ims.domain.lookups.LookupInstance instance3 = domainObject.getStatus();
		if ( null != instance3 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance3.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance3.getImage().getImageId(), instance3.getImage().getImagePath());
			}
			color = instance3.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.PollStatus voLookup3 = new ims.core.vo.lookups.PollStatus(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.PollStatus parentVoLookup3 = voLookup3;
			ims.domain.lookups.LookupInstance parent3 = instance3.getParent();
			while (parent3 != null)
			{
				if (parent3.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent3.getImage().getImageId(), parent3.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent3.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup3.setParent(new ims.core.vo.lookups.PollStatus(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setStatus(voLookup3);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.RefMan.domain.objects.OrderInvAppt extractOrderInvAppt(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.OrderInvApptVo valueObject) 
	{
		return 	extractOrderInvAppt(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.OrderInvAppt extractOrderInvAppt(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.OrderInvApptVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_OrderInvAppt();
		ims.RefMan.domain.objects.OrderInvAppt domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.RefMan.domain.objects.OrderInvAppt)domMap.get(valueObject);
			}
			// ims.RefMan.vo.OrderInvApptVo ID_OrderInvAppt field is unknown
			domainObject = new ims.RefMan.domain.objects.OrderInvAppt();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_OrderInvAppt());
			if (domMap.get(key) != null)
			{
				return (ims.RefMan.domain.objects.OrderInvAppt)domMap.get(key);
			}
			domainObject = (ims.RefMan.domain.objects.OrderInvAppt) domainFactory.getDomainObject(ims.RefMan.domain.objects.OrderInvAppt.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_OrderInvAppt());

		domainObject.setOrderInvestigation(ims.ocrr.vo.domain.OrderInvestigationBookingVoAssembler.extractOrderInvestigation(domainFactory, valueObject.getOrderInvestigation(), domMap));
		domainObject.setAppointment(ims.scheduling.vo.domain.Booking_AppointmentVoAssembler.extractBooking_Appointment(domainFactory, valueObject.getAppointment(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getStatus() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getStatus().getID());
		}
		domainObject.setStatus(value3);

		return domainObject;
	}

}
