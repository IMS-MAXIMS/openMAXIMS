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
package ims.scheduling.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Rory Fitzpatrick
 */
public class SessionSlotForDisplacedAppointmentsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.scheduling.vo.SessionSlotForDisplacedAppointmentsVo copy(ims.scheduling.vo.SessionSlotForDisplacedAppointmentsVo valueObjectDest, ims.scheduling.vo.SessionSlotForDisplacedAppointmentsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Session_Slot(valueObjectSrc.getID_Session_Slot());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// StartTm
		valueObjectDest.setStartTm(valueObjectSrc.getStartTm());
		// Priority
		valueObjectDest.setPriority(valueObjectSrc.getPriority());
		// slotResp
		valueObjectDest.setSlotResp(valueObjectSrc.getSlotResp());
		// Appointment
		valueObjectDest.setAppointment(valueObjectSrc.getAppointment());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createSessionSlotForDisplacedAppointmentsVoCollectionFromSession_Slot(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.Session_Slot objects.
	 */
	public static ims.scheduling.vo.SessionSlotForDisplacedAppointmentsVoCollection createSessionSlotForDisplacedAppointmentsVoCollectionFromSession_Slot(java.util.Set domainObjectSet)	
	{
		return createSessionSlotForDisplacedAppointmentsVoCollectionFromSession_Slot(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.Session_Slot objects.
	 */
	public static ims.scheduling.vo.SessionSlotForDisplacedAppointmentsVoCollection createSessionSlotForDisplacedAppointmentsVoCollectionFromSession_Slot(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.scheduling.vo.SessionSlotForDisplacedAppointmentsVoCollection voList = new ims.scheduling.vo.SessionSlotForDisplacedAppointmentsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.scheduling.domain.objects.Session_Slot domainObject = (ims.scheduling.domain.objects.Session_Slot) iterator.next();
			ims.scheduling.vo.SessionSlotForDisplacedAppointmentsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.scheduling.domain.objects.Session_Slot objects.
	 */
	public static ims.scheduling.vo.SessionSlotForDisplacedAppointmentsVoCollection createSessionSlotForDisplacedAppointmentsVoCollectionFromSession_Slot(java.util.List domainObjectList) 
	{
		return createSessionSlotForDisplacedAppointmentsVoCollectionFromSession_Slot(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.scheduling.domain.objects.Session_Slot objects.
	 */
	public static ims.scheduling.vo.SessionSlotForDisplacedAppointmentsVoCollection createSessionSlotForDisplacedAppointmentsVoCollectionFromSession_Slot(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.scheduling.vo.SessionSlotForDisplacedAppointmentsVoCollection voList = new ims.scheduling.vo.SessionSlotForDisplacedAppointmentsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.scheduling.domain.objects.Session_Slot domainObject = (ims.scheduling.domain.objects.Session_Slot) domainObjectList.get(i);
			ims.scheduling.vo.SessionSlotForDisplacedAppointmentsVo vo = create(map, domainObject);

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
	 * Create the ims.scheduling.domain.objects.Session_Slot set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractSession_SlotSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionSlotForDisplacedAppointmentsVoCollection voCollection) 
	 {
	 	return extractSession_SlotSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractSession_SlotSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionSlotForDisplacedAppointmentsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.SessionSlotForDisplacedAppointmentsVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.Session_Slot domainObject = SessionSlotForDisplacedAppointmentsVoAssembler.extractSession_Slot(domainFactory, vo, domMap);

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
	 * Create the ims.scheduling.domain.objects.Session_Slot list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractSession_SlotList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionSlotForDisplacedAppointmentsVoCollection voCollection) 
	 {
	 	return extractSession_SlotList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractSession_SlotList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionSlotForDisplacedAppointmentsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.SessionSlotForDisplacedAppointmentsVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.Session_Slot domainObject = SessionSlotForDisplacedAppointmentsVoAssembler.extractSession_Slot(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.scheduling.domain.objects.Session_Slot object.
	 * @param domainObject ims.scheduling.domain.objects.Session_Slot
	 */
	 public static ims.scheduling.vo.SessionSlotForDisplacedAppointmentsVo create(ims.scheduling.domain.objects.Session_Slot domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.scheduling.domain.objects.Session_Slot object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.scheduling.vo.SessionSlotForDisplacedAppointmentsVo create(DomainObjectMap map, ims.scheduling.domain.objects.Session_Slot domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.scheduling.vo.SessionSlotForDisplacedAppointmentsVo valueObject = (ims.scheduling.vo.SessionSlotForDisplacedAppointmentsVo) map.getValueObject(domainObject, ims.scheduling.vo.SessionSlotForDisplacedAppointmentsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.scheduling.vo.SessionSlotForDisplacedAppointmentsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.scheduling.domain.objects.Session_Slot
	 */
	 public static ims.scheduling.vo.SessionSlotForDisplacedAppointmentsVo insert(ims.scheduling.vo.SessionSlotForDisplacedAppointmentsVo valueObject, ims.scheduling.domain.objects.Session_Slot domainObject) 
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
	 * @param domainObject ims.scheduling.domain.objects.Session_Slot
	 */
	 public static ims.scheduling.vo.SessionSlotForDisplacedAppointmentsVo insert(DomainObjectMap map, ims.scheduling.vo.SessionSlotForDisplacedAppointmentsVo valueObject, ims.scheduling.domain.objects.Session_Slot domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Session_Slot(domainObject.getId());
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
			
		// StartTm
		String StartTm = domainObject.getStartTm();
		if ( null != StartTm ) 
		{
			valueObject.setStartTm(new ims.framework.utils.Time(StartTm) );
		}
		// Priority
		ims.domain.lookups.LookupInstance instance2 = domainObject.getPriority();
		if ( null != instance2 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance2.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance2.getImage().getImageId(), instance2.getImage().getImagePath());
			}
			color = instance2.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.SchedulingPriority voLookup2 = new ims.scheduling.vo.lookups.SchedulingPriority(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.scheduling.vo.lookups.SchedulingPriority parentVoLookup2 = voLookup2;
			ims.domain.lookups.LookupInstance parent2 = instance2.getParent();
			while (parent2 != null)
			{
				if (parent2.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent2.getImage().getImageId(), parent2.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent2.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup2.setParent(new ims.scheduling.vo.lookups.SchedulingPriority(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setPriority(voLookup2);
		}
				// slotResp
		valueObject.setSlotResp(ims.scheduling.vo.domain.SessionListOwnerLiteVoAssembler.create(map, domainObject.getSlotResp()) );
		// Appointment
		if (domainObject.getAppointment() != null)
		{
			if(domainObject.getAppointment() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getAppointment();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setAppointment(new ims.scheduling.vo.Booking_AppointmentRefVo(id, -1));				
			}
			else
			{
				valueObject.setAppointment(new ims.scheduling.vo.Booking_AppointmentRefVo(domainObject.getAppointment().getId(), domainObject.getAppointment().getVersion()));
			}
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.scheduling.domain.objects.Session_Slot extractSession_Slot(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionSlotForDisplacedAppointmentsVo valueObject) 
	{
		return 	extractSession_Slot(domainFactory, valueObject, new HashMap());
	}

	public static ims.scheduling.domain.objects.Session_Slot extractSession_Slot(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionSlotForDisplacedAppointmentsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Session_Slot();
		ims.scheduling.domain.objects.Session_Slot domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.scheduling.domain.objects.Session_Slot)domMap.get(valueObject);
			}
			// ims.scheduling.vo.SessionSlotForDisplacedAppointmentsVo ID_Session_Slot field is unknown
			domainObject = new ims.scheduling.domain.objects.Session_Slot();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Session_Slot());
			if (domMap.get(key) != null)
			{
				return (ims.scheduling.domain.objects.Session_Slot)domMap.get(key);
			}
			domainObject = (ims.scheduling.domain.objects.Session_Slot) domainFactory.getDomainObject(ims.scheduling.domain.objects.Session_Slot.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Session_Slot());

		ims.framework.utils.Time time1 = valueObject.getStartTm();
		String value1 = null;
		if ( time1 != null ) 
		{
			value1 = time1.toString();
		}
		domainObject.setStartTm(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getPriority() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getPriority().getID());
		}
		domainObject.setPriority(value2);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.scheduling.domain.objects.Session_ListOwner value3 = null;
		if ( null != valueObject.getSlotResp() ) 
		{
			if (valueObject.getSlotResp().getBoId() == null)
			{
				if (domMap.get(valueObject.getSlotResp()) != null)
				{
					value3 = (ims.scheduling.domain.objects.Session_ListOwner)domMap.get(valueObject.getSlotResp());
				}
			}
			else
			{
				value3 = (ims.scheduling.domain.objects.Session_ListOwner)domainFactory.getDomainObject(ims.scheduling.domain.objects.Session_ListOwner.class, valueObject.getSlotResp().getBoId());
			}
		}
		domainObject.setSlotResp(value3);
		ims.scheduling.domain.objects.Booking_Appointment value4 = null;
		if ( null != valueObject.getAppointment() ) 
		{
			if (valueObject.getAppointment().getBoId() == null)
			{
				if (domMap.get(valueObject.getAppointment()) != null)
				{
					value4 = (ims.scheduling.domain.objects.Booking_Appointment)domMap.get(valueObject.getAppointment());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value4 = domainObject.getAppointment();	
			}
			else
			{
				value4 = (ims.scheduling.domain.objects.Booking_Appointment)domainFactory.getDomainObject(ims.scheduling.domain.objects.Booking_Appointment.class, valueObject.getAppointment().getBoId());
			}
		}
		domainObject.setAppointment(value4);

		return domainObject;
	}

}
