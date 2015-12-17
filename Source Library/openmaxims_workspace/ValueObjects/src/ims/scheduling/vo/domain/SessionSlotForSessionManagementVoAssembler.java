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
 * @author Bogdan Tofei
 */
public class SessionSlotForSessionManagementVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.scheduling.vo.SessionSlotForSessionManagementVo copy(ims.scheduling.vo.SessionSlotForSessionManagementVo valueObjectDest, ims.scheduling.vo.SessionSlotForSessionManagementVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Session_Slot(valueObjectSrc.getID_Session_Slot());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Activity
		valueObjectDest.setActivity(valueObjectSrc.getActivity());
		// StartTm
		valueObjectDest.setStartTm(valueObjectSrc.getStartTm());
		// Duration
		valueObjectDest.setDuration(valueObjectSrc.getDuration());
		// isActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
		// Status
		valueObjectDest.setStatus(valueObjectSrc.getStatus());
		// Appointment
		valueObjectDest.setAppointment(valueObjectSrc.getAppointment());
		// slotResp
		valueObjectDest.setSlotResp(valueObjectSrc.getSlotResp());
		// DirectoryOfServices
		valueObjectDest.setDirectoryOfServices(valueObjectSrc.getDirectoryOfServices());
		// Priority
		valueObjectDest.setPriority(valueObjectSrc.getPriority());
		// Comment
		valueObjectDest.setComment(valueObjectSrc.getComment());
		// Functions
		valueObjectDest.setFunctions(valueObjectSrc.getFunctions());
		// CancelBlockReason
		valueObjectDest.setCancelBlockReason(valueObjectSrc.getCancelBlockReason());
		// CancelBlockComment
		valueObjectDest.setCancelBlockComment(valueObjectSrc.getCancelBlockComment());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createSessionSlotForSessionManagementVoCollectionFromSession_Slot(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.Session_Slot objects.
	 */
	public static ims.scheduling.vo.SessionSlotForSessionManagementVoCollection createSessionSlotForSessionManagementVoCollectionFromSession_Slot(java.util.Set domainObjectSet)	
	{
		return createSessionSlotForSessionManagementVoCollectionFromSession_Slot(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.Session_Slot objects.
	 */
	public static ims.scheduling.vo.SessionSlotForSessionManagementVoCollection createSessionSlotForSessionManagementVoCollectionFromSession_Slot(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.scheduling.vo.SessionSlotForSessionManagementVoCollection voList = new ims.scheduling.vo.SessionSlotForSessionManagementVoCollection();
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
			ims.scheduling.vo.SessionSlotForSessionManagementVo vo = create(map, domainObject);
			
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
	public static ims.scheduling.vo.SessionSlotForSessionManagementVoCollection createSessionSlotForSessionManagementVoCollectionFromSession_Slot(java.util.List domainObjectList) 
	{
		return createSessionSlotForSessionManagementVoCollectionFromSession_Slot(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.scheduling.domain.objects.Session_Slot objects.
	 */
	public static ims.scheduling.vo.SessionSlotForSessionManagementVoCollection createSessionSlotForSessionManagementVoCollectionFromSession_Slot(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.scheduling.vo.SessionSlotForSessionManagementVoCollection voList = new ims.scheduling.vo.SessionSlotForSessionManagementVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.scheduling.domain.objects.Session_Slot domainObject = (ims.scheduling.domain.objects.Session_Slot) domainObjectList.get(i);
			ims.scheduling.vo.SessionSlotForSessionManagementVo vo = create(map, domainObject);

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
	 public static java.util.Set extractSession_SlotSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionSlotForSessionManagementVoCollection voCollection) 
	 {
	 	return extractSession_SlotSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractSession_SlotSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionSlotForSessionManagementVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.SessionSlotForSessionManagementVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.Session_Slot domainObject = SessionSlotForSessionManagementVoAssembler.extractSession_Slot(domainFactory, vo, domMap);

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
	 public static java.util.List extractSession_SlotList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionSlotForSessionManagementVoCollection voCollection) 
	 {
	 	return extractSession_SlotList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractSession_SlotList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionSlotForSessionManagementVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.SessionSlotForSessionManagementVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.Session_Slot domainObject = SessionSlotForSessionManagementVoAssembler.extractSession_Slot(domainFactory, vo, domMap);

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
	 public static ims.scheduling.vo.SessionSlotForSessionManagementVo create(ims.scheduling.domain.objects.Session_Slot domainObject) 
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
	  public static ims.scheduling.vo.SessionSlotForSessionManagementVo create(DomainObjectMap map, ims.scheduling.domain.objects.Session_Slot domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.scheduling.vo.SessionSlotForSessionManagementVo valueObject = (ims.scheduling.vo.SessionSlotForSessionManagementVo) map.getValueObject(domainObject, ims.scheduling.vo.SessionSlotForSessionManagementVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.scheduling.vo.SessionSlotForSessionManagementVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.scheduling.vo.SessionSlotForSessionManagementVo insert(ims.scheduling.vo.SessionSlotForSessionManagementVo valueObject, ims.scheduling.domain.objects.Session_Slot domainObject) 
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
	 public static ims.scheduling.vo.SessionSlotForSessionManagementVo insert(DomainObjectMap map, ims.scheduling.vo.SessionSlotForSessionManagementVo valueObject, ims.scheduling.domain.objects.Session_Slot domainObject) 
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
			
		// Activity
		valueObject.setActivity(ims.core.vo.domain.ActivityForSessionManagementVoAssembler.create(map, domainObject.getActivity()) );
		// StartTm
		String StartTm = domainObject.getStartTm();
		if ( null != StartTm ) 
		{
			valueObject.setStartTm(new ims.framework.utils.Time(StartTm) );
		}
		// Duration
		valueObject.setDuration(domainObject.getDuration());
		// isActive
		valueObject.setIsActive( domainObject.isIsActive() );
		// Status
		ims.domain.lookups.LookupInstance instance5 = domainObject.getStatus();
		if ( null != instance5 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance5.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance5.getImage().getImageId(), instance5.getImage().getImagePath());
			}
			color = instance5.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.Status_Reason voLookup5 = new ims.scheduling.vo.lookups.Status_Reason(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.scheduling.vo.lookups.Status_Reason parentVoLookup5 = voLookup5;
			ims.domain.lookups.LookupInstance parent5 = instance5.getParent();
			while (parent5 != null)
			{
				if (parent5.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent5.getImage().getImageId(), parent5.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent5.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup5.setParent(new ims.scheduling.vo.lookups.Status_Reason(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setStatus(voLookup5);
		}
				// Appointment
		valueObject.setAppointment(ims.scheduling.vo.domain.BookingAppointmentForSessionManagementVoAssembler.create(map, domainObject.getAppointment()) );
		// slotResp
		valueObject.setSlotResp(ims.scheduling.vo.domain.SessionListOwnerLiteVoAssembler.create(map, domainObject.getSlotResp()) );
		// DirectoryOfServices
		valueObject.setDirectoryOfServices(ims.scheduling.vo.domain.DirectoryOfServiceSessionSlotVoAssembler.createDirectoryOfServiceSessionSlotVoCollectionFromDirectoryOfServiceSessionSlot(map, domainObject.getDirectoryOfServices()) );
		// Priority
		ims.domain.lookups.LookupInstance instance9 = domainObject.getPriority();
		if ( null != instance9 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance9.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance9.getImage().getImageId(), instance9.getImage().getImagePath());
			}
			color = instance9.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.SchedulingPriority voLookup9 = new ims.scheduling.vo.lookups.SchedulingPriority(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.scheduling.vo.lookups.SchedulingPriority parentVoLookup9 = voLookup9;
			ims.domain.lookups.LookupInstance parent9 = instance9.getParent();
			while (parent9 != null)
			{
				if (parent9.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent9.getImage().getImageId(), parent9.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent9.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup9.setParent(new ims.scheduling.vo.lookups.SchedulingPriority(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setPriority(voLookup9);
		}
				// Comment
		valueObject.setComment(domainObject.getComment());
		// Functions
		valueObject.setFunctions(ims.core.vo.domain.ServiceFunctionLiteVoAssembler.createServiceFunctionLiteVoCollectionFromServiceFunction(map, domainObject.getFunctions()) );
		// CancelBlockReason
		ims.domain.lookups.LookupInstance instance12 = domainObject.getCancelBlockReason();
		if ( null != instance12 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance12.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance12.getImage().getImageId(), instance12.getImage().getImagePath());
			}
			color = instance12.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.CancelAppointmentReason voLookup12 = new ims.scheduling.vo.lookups.CancelAppointmentReason(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.scheduling.vo.lookups.CancelAppointmentReason parentVoLookup12 = voLookup12;
			ims.domain.lookups.LookupInstance parent12 = instance12.getParent();
			while (parent12 != null)
			{
				if (parent12.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent12.getImage().getImageId(), parent12.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent12.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup12.setParent(new ims.scheduling.vo.lookups.CancelAppointmentReason(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setCancelBlockReason(voLookup12);
		}
				// CancelBlockComment
		valueObject.setCancelBlockComment(domainObject.getCancelBlockComment());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.scheduling.domain.objects.Session_Slot extractSession_Slot(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionSlotForSessionManagementVo valueObject) 
	{
		return 	extractSession_Slot(domainFactory, valueObject, new HashMap());
	}

	public static ims.scheduling.domain.objects.Session_Slot extractSession_Slot(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionSlotForSessionManagementVo valueObject, HashMap domMap) 
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
			// ims.scheduling.vo.SessionSlotForSessionManagementVo ID_Session_Slot field is unknown
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

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Activity value1 = null;
		if ( null != valueObject.getActivity() ) 
		{
			if (valueObject.getActivity().getBoId() == null)
			{
				if (domMap.get(valueObject.getActivity()) != null)
				{
					value1 = (ims.core.resource.place.domain.objects.Activity)domMap.get(valueObject.getActivity());
				}
			}
			else
			{
				value1 = (ims.core.resource.place.domain.objects.Activity)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Activity.class, valueObject.getActivity().getBoId());
			}
		}
		domainObject.setActivity(value1);
		ims.framework.utils.Time time2 = valueObject.getStartTm();
		String value2 = null;
		if ( time2 != null ) 
		{
			value2 = time2.toString();
		}
		domainObject.setStartTm(value2);
		domainObject.setDuration(valueObject.getDuration());
		domainObject.setIsActive(valueObject.getIsActive());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getStatus() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getStatus().getID());
		}
		domainObject.setStatus(value5);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.scheduling.domain.objects.Booking_Appointment value6 = null;
		if ( null != valueObject.getAppointment() ) 
		{
			if (valueObject.getAppointment().getBoId() == null)
			{
				if (domMap.get(valueObject.getAppointment()) != null)
				{
					value6 = (ims.scheduling.domain.objects.Booking_Appointment)domMap.get(valueObject.getAppointment());
				}
			}
			else
			{
				value6 = (ims.scheduling.domain.objects.Booking_Appointment)domainFactory.getDomainObject(ims.scheduling.domain.objects.Booking_Appointment.class, valueObject.getAppointment().getBoId());
			}
		}
		domainObject.setAppointment(value6);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.scheduling.domain.objects.Session_ListOwner value7 = null;
		if ( null != valueObject.getSlotResp() ) 
		{
			if (valueObject.getSlotResp().getBoId() == null)
			{
				if (domMap.get(valueObject.getSlotResp()) != null)
				{
					value7 = (ims.scheduling.domain.objects.Session_ListOwner)domMap.get(valueObject.getSlotResp());
				}
			}
			else
			{
				value7 = (ims.scheduling.domain.objects.Session_ListOwner)domainFactory.getDomainObject(ims.scheduling.domain.objects.Session_ListOwner.class, valueObject.getSlotResp().getBoId());
			}
		}
		domainObject.setSlotResp(value7);

		// SaveAsRefVO treated as RefValueObject
		ims.scheduling.vo.DirectoryOfServiceSessionSlotRefVoCollection refCollection8 = new ims.scheduling.vo.DirectoryOfServiceSessionSlotRefVoCollection();
		if (valueObject.getDirectoryOfServices() != null)
		{
			for (int i8=0; i8<valueObject.getDirectoryOfServices().size(); i8++)
			{
				ims.scheduling.vo.DirectoryOfServiceSessionSlotRefVo ref8 = (ims.scheduling.vo.DirectoryOfServiceSessionSlotRefVo)valueObject.getDirectoryOfServices().get(i8);
				refCollection8.add(ref8);
			}
		}
		int size8 = (null == refCollection8) ? 0 : refCollection8.size();		
		java.util.Set domainDirectoryOfServices8 = domainObject.getDirectoryOfServices();
		if (domainDirectoryOfServices8 == null)
		{
			domainDirectoryOfServices8 = new java.util.HashSet();
		}
		java.util.Set newSet8  = new java.util.HashSet();
		for(int i=0; i<size8; i++) 
		{
			ims.scheduling.vo.DirectoryOfServiceSessionSlotRefVo vo = refCollection8.get(i);					
			ims.scheduling.domain.objects.DirectoryOfServiceSessionSlot dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.scheduling.domain.objects.DirectoryOfServiceSessionSlot)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.scheduling.domain.objects.DirectoryOfServiceSessionSlot)domainFactory.getDomainObject( ims.scheduling.domain.objects.DirectoryOfServiceSessionSlot.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainDirectoryOfServices8.contains(dom))
			{
				domainDirectoryOfServices8.add(dom);
			}
			newSet8.add(dom);			
		}
		java.util.Set removedSet8 = new java.util.HashSet();
		java.util.Iterator iter8 = domainDirectoryOfServices8.iterator();
		//Find out which objects need to be removed
		while (iter8.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter8.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet8.contains(o))
			{
				removedSet8.add(o);
			}
		}
		iter8 = removedSet8.iterator();
		//Remove the unwanted objects
		while (iter8.hasNext())
		{
			domainDirectoryOfServices8.remove(iter8.next());
		}		
		
		domainObject.setDirectoryOfServices(domainDirectoryOfServices8);		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getPriority() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getPriority().getID());
		}
		domainObject.setPriority(value9);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getComment() != null && valueObject.getComment().equals(""))
		{
			valueObject.setComment(null);
		}
		domainObject.setComment(valueObject.getComment());

		// SaveAsRefVO treated as RefValueObject
		ims.core.clinical.vo.ServiceFunctionRefVoCollection refCollection11 = new ims.core.clinical.vo.ServiceFunctionRefVoCollection();
		if (valueObject.getFunctions() != null)
		{
			for (int i11=0; i11<valueObject.getFunctions().size(); i11++)
			{
				ims.core.clinical.vo.ServiceFunctionRefVo ref11 = (ims.core.clinical.vo.ServiceFunctionRefVo)valueObject.getFunctions().get(i11);
				refCollection11.add(ref11);
			}
		}
		int size11 = (null == refCollection11) ? 0 : refCollection11.size();		
		java.util.Set domainFunctions11 = domainObject.getFunctions();
		if (domainFunctions11 == null)
		{
			domainFunctions11 = new java.util.HashSet();
		}
		java.util.Set newSet11  = new java.util.HashSet();
		for(int i=0; i<size11; i++) 
		{
			ims.core.clinical.vo.ServiceFunctionRefVo vo = refCollection11.get(i);					
			ims.core.clinical.domain.objects.ServiceFunction dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.clinical.domain.objects.ServiceFunction)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.clinical.domain.objects.ServiceFunction)domainFactory.getDomainObject( ims.core.clinical.domain.objects.ServiceFunction.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainFunctions11.contains(dom))
			{
				domainFunctions11.add(dom);
			}
			newSet11.add(dom);			
		}
		java.util.Set removedSet11 = new java.util.HashSet();
		java.util.Iterator iter11 = domainFunctions11.iterator();
		//Find out which objects need to be removed
		while (iter11.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter11.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet11.contains(o))
			{
				removedSet11.add(o);
			}
		}
		iter11 = removedSet11.iterator();
		//Remove the unwanted objects
		while (iter11.hasNext())
		{
			domainFunctions11.remove(iter11.next());
		}		
		
		domainObject.setFunctions(domainFunctions11);		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getCancelBlockReason() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getCancelBlockReason().getID());
		}
		domainObject.setCancelBlockReason(value12);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getCancelBlockComment() != null && valueObject.getCancelBlockComment().equals(""))
		{
			valueObject.setCancelBlockComment(null);
		}
		domainObject.setCancelBlockComment(valueObject.getCancelBlockComment());

		return domainObject;
	}

}
