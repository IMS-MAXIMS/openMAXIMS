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
package ims.scheduling.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Daniel Laffan
 */
public class Booking_AppointmentVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.scheduling.vo.Booking_AppointmentVo copy(ims.scheduling.vo.Booking_AppointmentVo valueObjectDest, ims.scheduling.vo.Booking_AppointmentVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Booking_Appointment(valueObjectSrc.getID_Booking_Appointment());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// AppointmentDate
		valueObjectDest.setAppointmentDate(valueObjectSrc.getAppointmentDate());
		// ApptStartTime
		valueObjectDest.setApptStartTime(valueObjectSrc.getApptStartTime());
		// ApptEndTime
		valueObjectDest.setApptEndTime(valueObjectSrc.getApptEndTime());
		// ApptStatus
		valueObjectDest.setApptStatus(valueObjectSrc.getApptStatus());
		// ApptStatusReas
		valueObjectDest.setApptStatusReas(valueObjectSrc.getApptStatusReas());
		// ApptStatusHistory
		valueObjectDest.setApptStatusHistory(valueObjectSrc.getApptStatusHistory());
		// Session
		valueObjectDest.setSession(valueObjectSrc.getSession());
		// SessionSlot
		valueObjectDest.setSessionSlot(valueObjectSrc.getSessionSlot());
		// Priority
		valueObjectDest.setPriority(valueObjectSrc.getPriority());
		// Activity
		valueObjectDest.setActivity(valueObjectSrc.getActivity());
		// isCABBooking
		valueObjectDest.setIsCABBooking(valueObjectSrc.getIsCABBooking());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// RequiresRebook
		valueObjectDest.setRequiresRebook(valueObjectSrc.getRequiresRebook());
		// EarliestOfferedDate
		valueObjectDest.setEarliestOfferedDate(valueObjectSrc.getEarliestOfferedDate());
		// CurrentStatusRecord
		valueObjectDest.setCurrentStatusRecord(valueObjectSrc.getCurrentStatusRecord());
		// TransportType
		valueObjectDest.setTransportType(valueObjectSrc.getTransportType());
		// isTransportRequired
		valueObjectDest.setIsTransportRequired(valueObjectSrc.getIsTransportRequired());
		// isTransportBooked
		valueObjectDest.setIsTransportBooked(valueObjectSrc.getIsTransportBooked());
		// Outcome
		valueObjectDest.setOutcome(valueObjectSrc.getOutcome());
		// Comments
		valueObjectDest.setComments(valueObjectSrc.getComments());
		// TheatreBooking
		valueObjectDest.setTheatreBooking(valueObjectSrc.getTheatreBooking());
		// ArrivalTime
		valueObjectDest.setArrivalTime(valueObjectSrc.getArrivalTime());
		// SeenTime
		valueObjectDest.setSeenTime(valueObjectSrc.getSeenTime());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// ApptTrackingStatusHistory
		valueObjectDest.setApptTrackingStatusHistory(valueObjectSrc.getApptTrackingStatusHistory());
		// wasReviewed
		valueObjectDest.setWasReviewed(valueObjectSrc.getWasReviewed());
		// SeenBy
		valueObjectDest.setSeenBy(valueObjectSrc.getSeenBy());
		// OutcomeComments
		valueObjectDest.setOutcomeComments(valueObjectSrc.getOutcomeComments());
		// PathwayClock
		valueObjectDest.setPathwayClock(valueObjectSrc.getPathwayClock());
		// ConsMediaType
		valueObjectDest.setConsMediaType(valueObjectSrc.getConsMediaType());
		// Category
		valueObjectDest.setCategory(valueObjectSrc.getCategory());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createBooking_AppointmentVoCollectionFromBooking_Appointment(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.Booking_Appointment objects.
	 */
	public static ims.scheduling.vo.Booking_AppointmentVoCollection createBooking_AppointmentVoCollectionFromBooking_Appointment(java.util.Set domainObjectSet)	
	{
		return createBooking_AppointmentVoCollectionFromBooking_Appointment(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.Booking_Appointment objects.
	 */
	public static ims.scheduling.vo.Booking_AppointmentVoCollection createBooking_AppointmentVoCollectionFromBooking_Appointment(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.scheduling.vo.Booking_AppointmentVoCollection voList = new ims.scheduling.vo.Booking_AppointmentVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.scheduling.domain.objects.Booking_Appointment domainObject = (ims.scheduling.domain.objects.Booking_Appointment) iterator.next();
			ims.scheduling.vo.Booking_AppointmentVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.scheduling.domain.objects.Booking_Appointment objects.
	 */
	public static ims.scheduling.vo.Booking_AppointmentVoCollection createBooking_AppointmentVoCollectionFromBooking_Appointment(java.util.List domainObjectList) 
	{
		return createBooking_AppointmentVoCollectionFromBooking_Appointment(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.scheduling.domain.objects.Booking_Appointment objects.
	 */
	public static ims.scheduling.vo.Booking_AppointmentVoCollection createBooking_AppointmentVoCollectionFromBooking_Appointment(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.scheduling.vo.Booking_AppointmentVoCollection voList = new ims.scheduling.vo.Booking_AppointmentVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.scheduling.domain.objects.Booking_Appointment domainObject = (ims.scheduling.domain.objects.Booking_Appointment) domainObjectList.get(i);
			ims.scheduling.vo.Booking_AppointmentVo vo = create(map, domainObject);

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
	 * Create the ims.scheduling.domain.objects.Booking_Appointment set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractBooking_AppointmentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.Booking_AppointmentVoCollection voCollection) 
	 {
	 	return extractBooking_AppointmentSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractBooking_AppointmentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.Booking_AppointmentVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.Booking_AppointmentVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.Booking_Appointment domainObject = Booking_AppointmentVoAssembler.extractBooking_Appointment(domainFactory, vo, domMap);

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
	 * Create the ims.scheduling.domain.objects.Booking_Appointment list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractBooking_AppointmentList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.Booking_AppointmentVoCollection voCollection) 
	 {
	 	return extractBooking_AppointmentList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractBooking_AppointmentList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.Booking_AppointmentVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.Booking_AppointmentVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.Booking_Appointment domainObject = Booking_AppointmentVoAssembler.extractBooking_Appointment(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.scheduling.domain.objects.Booking_Appointment object.
	 * @param domainObject ims.scheduling.domain.objects.Booking_Appointment
	 */
	 public static ims.scheduling.vo.Booking_AppointmentVo create(ims.scheduling.domain.objects.Booking_Appointment domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.scheduling.domain.objects.Booking_Appointment object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.scheduling.vo.Booking_AppointmentVo create(DomainObjectMap map, ims.scheduling.domain.objects.Booking_Appointment domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.scheduling.vo.Booking_AppointmentVo valueObject = (ims.scheduling.vo.Booking_AppointmentVo) map.getValueObject(domainObject, ims.scheduling.vo.Booking_AppointmentVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.scheduling.vo.Booking_AppointmentVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.scheduling.domain.objects.Booking_Appointment
	 */
	 public static ims.scheduling.vo.Booking_AppointmentVo insert(ims.scheduling.vo.Booking_AppointmentVo valueObject, ims.scheduling.domain.objects.Booking_Appointment domainObject) 
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
	 * @param domainObject ims.scheduling.domain.objects.Booking_Appointment
	 */
	 public static ims.scheduling.vo.Booking_AppointmentVo insert(DomainObjectMap map, ims.scheduling.vo.Booking_AppointmentVo valueObject, ims.scheduling.domain.objects.Booking_Appointment domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Booking_Appointment(domainObject.getId());
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
			
		// AppointmentDate
		java.util.Date AppointmentDate = domainObject.getAppointmentDate();
		if ( null != AppointmentDate ) 
		{
			valueObject.setAppointmentDate(new ims.framework.utils.Date(AppointmentDate) );
		}
		// ApptStartTime
		String ApptStartTime = domainObject.getApptStartTime();
		if ( null != ApptStartTime ) 
		{
			valueObject.setApptStartTime(new ims.framework.utils.Time(ApptStartTime) );
		}
		// ApptEndTime
		String ApptEndTime = domainObject.getApptEndTime();
		if ( null != ApptEndTime ) 
		{
			valueObject.setApptEndTime(new ims.framework.utils.Time(ApptEndTime) );
		}
		// ApptStatus
		ims.domain.lookups.LookupInstance instance4 = domainObject.getApptStatus();
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

			ims.scheduling.vo.lookups.Status_Reason voLookup4 = new ims.scheduling.vo.lookups.Status_Reason(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.scheduling.vo.lookups.Status_Reason parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.scheduling.vo.lookups.Status_Reason(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setApptStatus(voLookup4);
		}
				// ApptStatusReas
		ims.domain.lookups.LookupInstance instance5 = domainObject.getApptStatusReas();
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
			valueObject.setApptStatusReas(voLookup5);
		}
				// ApptStatusHistory
		valueObject.setApptStatusHistory(ims.scheduling.vo.domain.Appointment_StatusVoAssembler.createAppointment_StatusVoCollectionFromAppointment_Status(map, domainObject.getApptStatusHistory()) );
		// Session
		valueObject.setSession(ims.scheduling.vo.domain.SessionIntermediateVoAssembler.create(map, domainObject.getSession()) );
		// SessionSlot
		valueObject.setSessionSlot(ims.scheduling.vo.domain.SessionSlotVoAssembler.create(map, domainObject.getSessionSlot()) );
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
				// Activity
		valueObject.setActivity(ims.core.vo.domain.ActivitySchedVoAssembler.create(map, domainObject.getActivity()) );
		// isCABBooking
		valueObject.setIsCABBooking( domainObject.isIsCABBooking() );
		// Patient
		valueObject.setPatient(ims.core.vo.domain.PatientShortAssembler.create(map, domainObject.getPatient()) );
		// RequiresRebook
		valueObject.setRequiresRebook( domainObject.isRequiresRebook() );
		// EarliestOfferedDate
		java.util.Date EarliestOfferedDate = domainObject.getEarliestOfferedDate();
		if ( null != EarliestOfferedDate ) 
		{
			valueObject.setEarliestOfferedDate(new ims.framework.utils.Date(EarliestOfferedDate) );
		}
		// CurrentStatusRecord
		valueObject.setCurrentStatusRecord(ims.scheduling.vo.domain.Appointment_StatusVoAssembler.create(map, domainObject.getCurrentStatusRecord()) );
		// TransportType
		ims.domain.lookups.LookupInstance instance16 = domainObject.getTransportType();
		if ( null != instance16 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance16.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance16.getImage().getImageId(), instance16.getImage().getImagePath());
			}
			color = instance16.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.ApptTransportType voLookup16 = new ims.scheduling.vo.lookups.ApptTransportType(instance16.getId(),instance16.getText(), instance16.isActive(), null, img, color);
			ims.scheduling.vo.lookups.ApptTransportType parentVoLookup16 = voLookup16;
			ims.domain.lookups.LookupInstance parent16 = instance16.getParent();
			while (parent16 != null)
			{
				if (parent16.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent16.getImage().getImageId(), parent16.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent16.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup16.setParent(new ims.scheduling.vo.lookups.ApptTransportType(parent16.getId(),parent16.getText(), parent16.isActive(), null, img, color));
				parentVoLookup16 = parentVoLookup16.getParent();
								parent16 = parent16.getParent();
			}			
			valueObject.setTransportType(voLookup16);
		}
				// isTransportRequired
		valueObject.setIsTransportRequired( domainObject.isIsTransportRequired() );
		// isTransportBooked
		valueObject.setIsTransportBooked( domainObject.isIsTransportBooked() );
		// Outcome
		ims.domain.lookups.LookupInstance instance19 = domainObject.getOutcome();
		if ( null != instance19 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance19.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance19.getImage().getImageId(), instance19.getImage().getImagePath());
			}
			color = instance19.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.ApptOutcome voLookup19 = new ims.scheduling.vo.lookups.ApptOutcome(instance19.getId(),instance19.getText(), instance19.isActive(), null, img, color);
			ims.scheduling.vo.lookups.ApptOutcome parentVoLookup19 = voLookup19;
			ims.domain.lookups.LookupInstance parent19 = instance19.getParent();
			while (parent19 != null)
			{
				if (parent19.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent19.getImage().getImageId(), parent19.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent19.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup19.setParent(new ims.scheduling.vo.lookups.ApptOutcome(parent19.getId(),parent19.getText(), parent19.isActive(), null, img, color));
				parentVoLookup19 = parentVoLookup19.getParent();
								parent19 = parent19.getParent();
			}			
			valueObject.setOutcome(voLookup19);
		}
				// Comments
		valueObject.setComments(domainObject.getComments());
		// TheatreBooking
		valueObject.setTheatreBooking(ims.scheduling.vo.domain.TheatreBookingLiteVoAssembler.create(map, domainObject.getTheatreBooking()) );
		// ArrivalTime
		String ArrivalTime = domainObject.getArrivalTime();
		if ( null != ArrivalTime ) 
		{
			valueObject.setArrivalTime(new ims.framework.utils.Time(ArrivalTime) );
		}
		// SeenTime
		String SeenTime = domainObject.getSeenTime();
		if ( null != SeenTime ) 
		{
			valueObject.setSeenTime(new ims.framework.utils.Time(SeenTime) );
		}
		// CareContext
		if (domainObject.getCareContext() != null)
		{
			if(domainObject.getCareContext() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getCareContext();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setCareContext(new ims.core.admin.vo.CareContextRefVo(id, -1));				
			}
			else
			{
				valueObject.setCareContext(new ims.core.admin.vo.CareContextRefVo(domainObject.getCareContext().getId(), domainObject.getCareContext().getVersion()));
			}
		}
		// ApptTrackingStatusHistory
		valueObject.setApptTrackingStatusHistory(ims.scheduling.vo.domain.Appt_Tracking_Status_HistoryVoAssembler.createAppt_Tracking_Status_HistoryVoCollectionFromAppt_Tracking_Status_History(map, domainObject.getApptTrackingStatusHistory()) );
		// wasReviewed
		valueObject.setWasReviewed( domainObject.isWasReviewed() );
		// SeenBy
		if (domainObject.getSeenBy() != null)
		{
			if(domainObject.getSeenBy() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getSeenBy();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setSeenBy(new ims.core.resource.people.vo.HcpRefVo(id, -1));				
			}
			else
			{
				valueObject.setSeenBy(new ims.core.resource.people.vo.HcpRefVo(domainObject.getSeenBy().getId(), domainObject.getSeenBy().getVersion()));
			}
		}
		// OutcomeComments
		valueObject.setOutcomeComments(domainObject.getOutcomeComments());
		// PathwayClock
		if (domainObject.getPathwayClock() != null)
		{
			if(domainObject.getPathwayClock() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getPathwayClock();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setPathwayClock(new ims.pathways.vo.PathwayClockRefVo(id, -1));				
			}
			else
			{
				valueObject.setPathwayClock(new ims.pathways.vo.PathwayClockRefVo(domainObject.getPathwayClock().getId(), domainObject.getPathwayClock().getVersion()));
			}
		}
		// ConsMediaType
		ims.domain.lookups.LookupInstance instance30 = domainObject.getConsMediaType();
		if ( null != instance30 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance30.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance30.getImage().getImageId(), instance30.getImage().getImagePath());
			}
			color = instance30.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.ConsultationMediaType voLookup30 = new ims.scheduling.vo.lookups.ConsultationMediaType(instance30.getId(),instance30.getText(), instance30.isActive(), null, img, color);
			ims.scheduling.vo.lookups.ConsultationMediaType parentVoLookup30 = voLookup30;
			ims.domain.lookups.LookupInstance parent30 = instance30.getParent();
			while (parent30 != null)
			{
				if (parent30.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent30.getImage().getImageId(), parent30.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent30.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup30.setParent(new ims.scheduling.vo.lookups.ConsultationMediaType(parent30.getId(),parent30.getText(), parent30.isActive(), null, img, color));
				parentVoLookup30 = parentVoLookup30.getParent();
								parent30 = parent30.getParent();
			}			
			valueObject.setConsMediaType(voLookup30);
		}
				// Category
		ims.domain.lookups.LookupInstance instance31 = domainObject.getCategory();
		if ( null != instance31 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance31.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance31.getImage().getImageId(), instance31.getImage().getImagePath());
			}
			color = instance31.getColor();
			if (color != null) 
				color.getValue();

			ims.RefMan.vo.lookups.CatsReferralCategory voLookup31 = new ims.RefMan.vo.lookups.CatsReferralCategory(instance31.getId(),instance31.getText(), instance31.isActive(), null, img, color);
			ims.RefMan.vo.lookups.CatsReferralCategory parentVoLookup31 = voLookup31;
			ims.domain.lookups.LookupInstance parent31 = instance31.getParent();
			while (parent31 != null)
			{
				if (parent31.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent31.getImage().getImageId(), parent31.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent31.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup31.setParent(new ims.RefMan.vo.lookups.CatsReferralCategory(parent31.getId(),parent31.getText(), parent31.isActive(), null, img, color));
				parentVoLookup31 = parentVoLookup31.getParent();
								parent31 = parent31.getParent();
			}			
			valueObject.setCategory(voLookup31);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.scheduling.domain.objects.Booking_Appointment extractBooking_Appointment(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.Booking_AppointmentVo valueObject) 
	{
		return 	extractBooking_Appointment(domainFactory, valueObject, new HashMap());
	}

	public static ims.scheduling.domain.objects.Booking_Appointment extractBooking_Appointment(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.Booking_AppointmentVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Booking_Appointment();
		ims.scheduling.domain.objects.Booking_Appointment domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.scheduling.domain.objects.Booking_Appointment)domMap.get(valueObject);
			}
			// ims.scheduling.vo.Booking_AppointmentVo ID_Booking_Appointment field is unknown
			domainObject = new ims.scheduling.domain.objects.Booking_Appointment();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Booking_Appointment());
			if (domMap.get(key) != null)
			{
				return (ims.scheduling.domain.objects.Booking_Appointment)domMap.get(key);
			}
			domainObject = (ims.scheduling.domain.objects.Booking_Appointment) domainFactory.getDomainObject(ims.scheduling.domain.objects.Booking_Appointment.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Booking_Appointment());

		java.util.Date value1 = null;
		ims.framework.utils.Date date1 = valueObject.getAppointmentDate();		
		if ( date1 != null ) 
		{
			value1 = date1.getDate();
		}
		domainObject.setAppointmentDate(value1);
		ims.framework.utils.Time time2 = valueObject.getApptStartTime();
		String value2 = null;
		if ( time2 != null ) 
		{
			value2 = time2.toString();
		}
		domainObject.setApptStartTime(value2);
		ims.framework.utils.Time time3 = valueObject.getApptEndTime();
		String value3 = null;
		if ( time3 != null ) 
		{
			value3 = time3.toString();
		}
		domainObject.setApptEndTime(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getApptStatus() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getApptStatus().getID());
		}
		domainObject.setApptStatus(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getApptStatusReas() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getApptStatusReas().getID());
		}
		domainObject.setApptStatusReas(value5);
		domainObject.setApptStatusHistory(ims.scheduling.vo.domain.Appointment_StatusVoAssembler.extractAppointment_StatusSet(domainFactory, valueObject.getApptStatusHistory(), domainObject.getApptStatusHistory(), domMap));		
		domainObject.setSession(ims.scheduling.vo.domain.SessionIntermediateVoAssembler.extractSch_Session(domainFactory, valueObject.getSession(), domMap));
		domainObject.setSessionSlot(ims.scheduling.vo.domain.SessionSlotVoAssembler.extractSession_Slot(domainFactory, valueObject.getSessionSlot(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getPriority() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getPriority().getID());
		}
		domainObject.setPriority(value9);
		domainObject.setActivity(ims.core.vo.domain.ActivitySchedVoAssembler.extractActivity(domainFactory, valueObject.getActivity(), domMap));
		domainObject.setIsCABBooking(valueObject.getIsCABBooking());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.patient.domain.objects.Patient value12 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value12 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else
			{
				value12 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value12);
		domainObject.setRequiresRebook(valueObject.getRequiresRebook());
		java.util.Date value14 = null;
		ims.framework.utils.Date date14 = valueObject.getEarliestOfferedDate();		
		if ( date14 != null ) 
		{
			value14 = date14.getDate();
		}
		domainObject.setEarliestOfferedDate(value14);
		domainObject.setCurrentStatusRecord(ims.scheduling.vo.domain.Appointment_StatusVoAssembler.extractAppointment_Status(domainFactory, valueObject.getCurrentStatusRecord(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value16 = null;
		if ( null != valueObject.getTransportType() ) 
		{
			value16 =
				domainFactory.getLookupInstance(valueObject.getTransportType().getID());
		}
		domainObject.setTransportType(value16);
		domainObject.setIsTransportRequired(valueObject.getIsTransportRequired());
		domainObject.setIsTransportBooked(valueObject.getIsTransportBooked());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value19 = null;
		if ( null != valueObject.getOutcome() ) 
		{
			value19 =
				domainFactory.getLookupInstance(valueObject.getOutcome().getID());
		}
		domainObject.setOutcome(value19);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getComments() != null && valueObject.getComments().equals(""))
		{
			valueObject.setComments(null);
		}
		domainObject.setComments(valueObject.getComments());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.scheduling.domain.objects.TheatreBooking value21 = null;
		if ( null != valueObject.getTheatreBooking() ) 
		{
			if (valueObject.getTheatreBooking().getBoId() == null)
			{
				if (domMap.get(valueObject.getTheatreBooking()) != null)
				{
					value21 = (ims.scheduling.domain.objects.TheatreBooking)domMap.get(valueObject.getTheatreBooking());
				}
			}
			else
			{
				value21 = (ims.scheduling.domain.objects.TheatreBooking)domainFactory.getDomainObject(ims.scheduling.domain.objects.TheatreBooking.class, valueObject.getTheatreBooking().getBoId());
			}
		}
		domainObject.setTheatreBooking(value21);
		ims.framework.utils.Time time22 = valueObject.getArrivalTime();
		String value22 = null;
		if ( time22 != null ) 
		{
			value22 = time22.toString();
		}
		domainObject.setArrivalTime(value22);
		ims.framework.utils.Time time23 = valueObject.getSeenTime();
		String value23 = null;
		if ( time23 != null ) 
		{
			value23 = time23.toString();
		}
		domainObject.setSeenTime(value23);
		ims.core.admin.domain.objects.CareContext value24 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value24 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value24 = domainObject.getCareContext();	
			}
			else
			{
				value24 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value24);
		domainObject.setApptTrackingStatusHistory(ims.scheduling.vo.domain.Appt_Tracking_Status_HistoryVoAssembler.extractAppt_Tracking_Status_HistoryList(domainFactory, valueObject.getApptTrackingStatusHistory(), domainObject.getApptTrackingStatusHistory(), domMap));		
		domainObject.setWasReviewed(valueObject.getWasReviewed());
		ims.core.resource.people.domain.objects.Hcp value27 = null;
		if ( null != valueObject.getSeenBy() ) 
		{
			if (valueObject.getSeenBy().getBoId() == null)
			{
				if (domMap.get(valueObject.getSeenBy()) != null)
				{
					value27 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getSeenBy());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value27 = domainObject.getSeenBy();	
			}
			else
			{
				value27 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getSeenBy().getBoId());
			}
		}
		domainObject.setSeenBy(value27);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getOutcomeComments() != null && valueObject.getOutcomeComments().equals(""))
		{
			valueObject.setOutcomeComments(null);
		}
		domainObject.setOutcomeComments(valueObject.getOutcomeComments());
		ims.pathways.domain.objects.PathwayClock value29 = null;
		if ( null != valueObject.getPathwayClock() ) 
		{
			if (valueObject.getPathwayClock().getBoId() == null)
			{
				if (domMap.get(valueObject.getPathwayClock()) != null)
				{
					value29 = (ims.pathways.domain.objects.PathwayClock)domMap.get(valueObject.getPathwayClock());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value29 = domainObject.getPathwayClock();	
			}
			else
			{
				value29 = (ims.pathways.domain.objects.PathwayClock)domainFactory.getDomainObject(ims.pathways.domain.objects.PathwayClock.class, valueObject.getPathwayClock().getBoId());
			}
		}
		domainObject.setPathwayClock(value29);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value30 = null;
		if ( null != valueObject.getConsMediaType() ) 
		{
			value30 =
				domainFactory.getLookupInstance(valueObject.getConsMediaType().getID());
		}
		domainObject.setConsMediaType(value30);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value31 = null;
		if ( null != valueObject.getCategory() ) 
		{
			value31 =
				domainFactory.getLookupInstance(valueObject.getCategory().getID());
		}
		domainObject.setCategory(value31);

		return domainObject;
	}

}
