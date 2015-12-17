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
 * Generated on 12/10/2015, 13:24
 *
 */
package ims.scheduling.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Daniel Laffan
 */
public class ReferralAppointmentDetailsBookingAppointmentVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.scheduling.vo.ReferralAppointmentDetailsBookingAppointmentVo copy(ims.scheduling.vo.ReferralAppointmentDetailsBookingAppointmentVo valueObjectDest, ims.scheduling.vo.ReferralAppointmentDetailsBookingAppointmentVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Booking_Appointment(valueObjectSrc.getID_Booking_Appointment());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// AppointmentDate
		valueObjectDest.setAppointmentDate(valueObjectSrc.getAppointmentDate());
		// ApptStatus
		valueObjectDest.setApptStatus(valueObjectSrc.getApptStatus());
		// Session
		valueObjectDest.setSession(valueObjectSrc.getSession());
		// ApptStartTime
		valueObjectDest.setApptStartTime(valueObjectSrc.getApptStartTime());
		// RequiresRebook
		valueObjectDest.setRequiresRebook(valueObjectSrc.getRequiresRebook());
		// SessionSlot
		valueObjectDest.setSessionSlot(valueObjectSrc.getSessionSlot());
		// isCABBooking
		valueObjectDest.setIsCABBooking(valueObjectSrc.getIsCABBooking());
		// TheatreBooking
		valueObjectDest.setTheatreBooking(valueObjectSrc.getTheatreBooking());
		// TheatreSlot
		valueObjectDest.setTheatreSlot(valueObjectSrc.getTheatreSlot());
		// wasPrinted
		valueObjectDest.setWasPrinted(valueObjectSrc.getWasPrinted());
		// BookingLetter
		valueObjectDest.setBookingLetter(valueObjectSrc.getBookingLetter());
		// numProviderCancellations
		valueObjectDest.setNumProviderCancellations(valueObjectSrc.getNumProviderCancellations());
		// numPatientCancellations
		valueObjectDest.setNumPatientCancellations(valueObjectSrc.getNumPatientCancellations());
		// LinkedAppointments
		valueObjectDest.setLinkedAppointments(valueObjectSrc.getLinkedAppointments());
		// isFlexibleAppointment
		valueObjectDest.setIsFlexibleAppointment(valueObjectSrc.getIsFlexibleAppointment());
		// isWardAttendance
		valueObjectDest.setIsWardAttendance(valueObjectSrc.getIsWardAttendance());
		// Activity
		valueObjectDest.setActivity(valueObjectSrc.getActivity());
		// ReasonForBreachingFirstApptKPI
		valueObjectDest.setReasonForBreachingFirstApptKPI(valueObjectSrc.getReasonForBreachingFirstApptKPI());
		// CurrentStatusRecord
		valueObjectDest.setCurrentStatusRecord(valueObjectSrc.getCurrentStatusRecord());
		// Outcome
		valueObjectDest.setOutcome(valueObjectSrc.getOutcome());
		// Comments
		valueObjectDest.setComments(valueObjectSrc.getComments());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createReferralAppointmentDetailsBookingAppointmentVoCollectionFromBooking_Appointment(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.Booking_Appointment objects.
	 */
	public static ims.scheduling.vo.ReferralAppointmentDetailsBookingAppointmentVoCollection createReferralAppointmentDetailsBookingAppointmentVoCollectionFromBooking_Appointment(java.util.Set domainObjectSet)	
	{
		return createReferralAppointmentDetailsBookingAppointmentVoCollectionFromBooking_Appointment(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.Booking_Appointment objects.
	 */
	public static ims.scheduling.vo.ReferralAppointmentDetailsBookingAppointmentVoCollection createReferralAppointmentDetailsBookingAppointmentVoCollectionFromBooking_Appointment(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.scheduling.vo.ReferralAppointmentDetailsBookingAppointmentVoCollection voList = new ims.scheduling.vo.ReferralAppointmentDetailsBookingAppointmentVoCollection();
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
			ims.scheduling.vo.ReferralAppointmentDetailsBookingAppointmentVo vo = create(map, domainObject);
			
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
	public static ims.scheduling.vo.ReferralAppointmentDetailsBookingAppointmentVoCollection createReferralAppointmentDetailsBookingAppointmentVoCollectionFromBooking_Appointment(java.util.List domainObjectList) 
	{
		return createReferralAppointmentDetailsBookingAppointmentVoCollectionFromBooking_Appointment(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.scheduling.domain.objects.Booking_Appointment objects.
	 */
	public static ims.scheduling.vo.ReferralAppointmentDetailsBookingAppointmentVoCollection createReferralAppointmentDetailsBookingAppointmentVoCollectionFromBooking_Appointment(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.scheduling.vo.ReferralAppointmentDetailsBookingAppointmentVoCollection voList = new ims.scheduling.vo.ReferralAppointmentDetailsBookingAppointmentVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.scheduling.domain.objects.Booking_Appointment domainObject = (ims.scheduling.domain.objects.Booking_Appointment) domainObjectList.get(i);
			ims.scheduling.vo.ReferralAppointmentDetailsBookingAppointmentVo vo = create(map, domainObject);

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
	 public static java.util.Set extractBooking_AppointmentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.ReferralAppointmentDetailsBookingAppointmentVoCollection voCollection) 
	 {
	 	return extractBooking_AppointmentSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractBooking_AppointmentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.ReferralAppointmentDetailsBookingAppointmentVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.ReferralAppointmentDetailsBookingAppointmentVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.Booking_Appointment domainObject = ReferralAppointmentDetailsBookingAppointmentVoAssembler.extractBooking_Appointment(domainFactory, vo, domMap);

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
	 public static java.util.List extractBooking_AppointmentList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.ReferralAppointmentDetailsBookingAppointmentVoCollection voCollection) 
	 {
	 	return extractBooking_AppointmentList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractBooking_AppointmentList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.ReferralAppointmentDetailsBookingAppointmentVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.ReferralAppointmentDetailsBookingAppointmentVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.Booking_Appointment domainObject = ReferralAppointmentDetailsBookingAppointmentVoAssembler.extractBooking_Appointment(domainFactory, vo, domMap);

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
	 public static ims.scheduling.vo.ReferralAppointmentDetailsBookingAppointmentVo create(ims.scheduling.domain.objects.Booking_Appointment domainObject) 
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
	  public static ims.scheduling.vo.ReferralAppointmentDetailsBookingAppointmentVo create(DomainObjectMap map, ims.scheduling.domain.objects.Booking_Appointment domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.scheduling.vo.ReferralAppointmentDetailsBookingAppointmentVo valueObject = (ims.scheduling.vo.ReferralAppointmentDetailsBookingAppointmentVo) map.getValueObject(domainObject, ims.scheduling.vo.ReferralAppointmentDetailsBookingAppointmentVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.scheduling.vo.ReferralAppointmentDetailsBookingAppointmentVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.scheduling.vo.ReferralAppointmentDetailsBookingAppointmentVo insert(ims.scheduling.vo.ReferralAppointmentDetailsBookingAppointmentVo valueObject, ims.scheduling.domain.objects.Booking_Appointment domainObject) 
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
	 public static ims.scheduling.vo.ReferralAppointmentDetailsBookingAppointmentVo insert(DomainObjectMap map, ims.scheduling.vo.ReferralAppointmentDetailsBookingAppointmentVo valueObject, ims.scheduling.domain.objects.Booking_Appointment domainObject) 
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
		// ApptStatus
		ims.domain.lookups.LookupInstance instance2 = domainObject.getApptStatus();
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

			ims.scheduling.vo.lookups.Status_Reason voLookup2 = new ims.scheduling.vo.lookups.Status_Reason(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.scheduling.vo.lookups.Status_Reason parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.scheduling.vo.lookups.Status_Reason(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setApptStatus(voLookup2);
		}
				// Session
		valueObject.setSession(ims.scheduling.vo.domain.SessionForReferralAppointmentVoAssembler.create(map, domainObject.getSession()) );
		// ApptStartTime
		String ApptStartTime = domainObject.getApptStartTime();
		if ( null != ApptStartTime ) 
		{
			valueObject.setApptStartTime(new ims.framework.utils.Time(ApptStartTime) );
		}
		// RequiresRebook
		valueObject.setRequiresRebook( domainObject.isRequiresRebook() );
		// SessionSlot
		valueObject.setSessionSlot(ims.scheduling.vo.domain.SessionSlotVoAssembler.create(map, domainObject.getSessionSlot()) );
		// isCABBooking
		valueObject.setIsCABBooking( domainObject.isIsCABBooking() );
		// TheatreBooking
		valueObject.setTheatreBooking(ims.scheduling.vo.domain.TheatreBookingBaseVoAssembler.create(map, domainObject.getTheatreBooking()) );
		// TheatreSlot
		valueObject.setTheatreSlot(ims.scheduling.vo.domain.ToCameInTimeFromTheatreSlotVoAssembler.create(map, domainObject.getTheatreSlot()) );
		// wasPrinted
		valueObject.setWasPrinted( domainObject.isWasPrinted() );
		// BookingLetter
		valueObject.setBookingLetter(ims.core.vo.domain.PatientDocumentLiteVoAssembler.create(map, domainObject.getBookingLetter()) );
		// numProviderCancellations
		valueObject.setNumProviderCancellations(domainObject.getNumProviderCancellations());
		// numPatientCancellations
		valueObject.setNumPatientCancellations(domainObject.getNumPatientCancellations());
		// LinkedAppointments
		valueObject.setLinkedAppointments(ims.RefMan.vo.domain.LinkedAppointmentForReferralAppointmentComponentVoAssembler.createLinkedAppointmentForReferralAppointmentComponentVoCollectionFromBooking_Appointment(map, domainObject.getLinkedAppointments()) );
		// isFlexibleAppointment
		valueObject.setIsFlexibleAppointment( domainObject.isIsFlexibleAppointment() );
		// isWardAttendance
		valueObject.setIsWardAttendance( domainObject.isIsWardAttendance() );
		// Activity
		valueObject.setActivity(ims.core.vo.domain.ActivityLiteVoAssembler.create(map, domainObject.getActivity()) );
		// ReasonForBreachingFirstApptKPI
		ims.domain.lookups.LookupInstance instance18 = domainObject.getReasonForBreachingFirstApptKPI();
		if ( null != instance18 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance18.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance18.getImage().getImageId(), instance18.getImage().getImagePath());
			}
			color = instance18.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.ReasonForBreachingFirstApptKPI voLookup18 = new ims.core.vo.lookups.ReasonForBreachingFirstApptKPI(instance18.getId(),instance18.getText(), instance18.isActive(), null, img, color);
			ims.core.vo.lookups.ReasonForBreachingFirstApptKPI parentVoLookup18 = voLookup18;
			ims.domain.lookups.LookupInstance parent18 = instance18.getParent();
			while (parent18 != null)
			{
				if (parent18.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent18.getImage().getImageId(), parent18.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent18.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup18.setParent(new ims.core.vo.lookups.ReasonForBreachingFirstApptKPI(parent18.getId(),parent18.getText(), parent18.isActive(), null, img, color));
				parentVoLookup18 = parentVoLookup18.getParent();
								parent18 = parent18.getParent();
			}			
			valueObject.setReasonForBreachingFirstApptKPI(voLookup18);
		}
				// CurrentStatusRecord
		valueObject.setCurrentStatusRecord(ims.RefMan.vo.domain.AppointmentStatusForElectiveListDetailsVoAssembler.create(map, domainObject.getCurrentStatusRecord()) );
		// Outcome
		ims.domain.lookups.LookupInstance instance20 = domainObject.getOutcome();
		if ( null != instance20 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance20.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance20.getImage().getImageId(), instance20.getImage().getImagePath());
			}
			color = instance20.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.ApptOutcome voLookup20 = new ims.scheduling.vo.lookups.ApptOutcome(instance20.getId(),instance20.getText(), instance20.isActive(), null, img, color);
			ims.scheduling.vo.lookups.ApptOutcome parentVoLookup20 = voLookup20;
			ims.domain.lookups.LookupInstance parent20 = instance20.getParent();
			while (parent20 != null)
			{
				if (parent20.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent20.getImage().getImageId(), parent20.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent20.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup20.setParent(new ims.scheduling.vo.lookups.ApptOutcome(parent20.getId(),parent20.getText(), parent20.isActive(), null, img, color));
				parentVoLookup20 = parentVoLookup20.getParent();
								parent20 = parent20.getParent();
			}			
			valueObject.setOutcome(voLookup20);
		}
				// Comments
		valueObject.setComments(domainObject.getComments());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.scheduling.domain.objects.Booking_Appointment extractBooking_Appointment(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.ReferralAppointmentDetailsBookingAppointmentVo valueObject) 
	{
		return 	extractBooking_Appointment(domainFactory, valueObject, new HashMap());
	}

	public static ims.scheduling.domain.objects.Booking_Appointment extractBooking_Appointment(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.ReferralAppointmentDetailsBookingAppointmentVo valueObject, HashMap domMap) 
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
			// ims.scheduling.vo.ReferralAppointmentDetailsBookingAppointmentVo ID_Booking_Appointment field is unknown
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
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getApptStatus() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getApptStatus().getID());
		}
		domainObject.setApptStatus(value2);
		domainObject.setSession(ims.scheduling.vo.domain.SessionForReferralAppointmentVoAssembler.extractSch_Session(domainFactory, valueObject.getSession(), domMap));
		ims.framework.utils.Time time4 = valueObject.getApptStartTime();
		String value4 = null;
		if ( time4 != null ) 
		{
			value4 = time4.toString();
		}
		domainObject.setApptStartTime(value4);
		domainObject.setRequiresRebook(valueObject.getRequiresRebook());
		domainObject.setSessionSlot(ims.scheduling.vo.domain.SessionSlotVoAssembler.extractSession_Slot(domainFactory, valueObject.getSessionSlot(), domMap));
		domainObject.setIsCABBooking(valueObject.getIsCABBooking());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.scheduling.domain.objects.TheatreBooking value8 = null;
		if ( null != valueObject.getTheatreBooking() ) 
		{
			if (valueObject.getTheatreBooking().getBoId() == null)
			{
				if (domMap.get(valueObject.getTheatreBooking()) != null)
				{
					value8 = (ims.scheduling.domain.objects.TheatreBooking)domMap.get(valueObject.getTheatreBooking());
				}
			}
			else
			{
				value8 = (ims.scheduling.domain.objects.TheatreBooking)domainFactory.getDomainObject(ims.scheduling.domain.objects.TheatreBooking.class, valueObject.getTheatreBooking().getBoId());
			}
		}
		domainObject.setTheatreBooking(value8);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.scheduling.domain.objects.SessionTheatreTCISlot value9 = null;
		if ( null != valueObject.getTheatreSlot() ) 
		{
			if (valueObject.getTheatreSlot().getBoId() == null)
			{
				if (domMap.get(valueObject.getTheatreSlot()) != null)
				{
					value9 = (ims.scheduling.domain.objects.SessionTheatreTCISlot)domMap.get(valueObject.getTheatreSlot());
				}
			}
			else
			{
				value9 = (ims.scheduling.domain.objects.SessionTheatreTCISlot)domainFactory.getDomainObject(ims.scheduling.domain.objects.SessionTheatreTCISlot.class, valueObject.getTheatreSlot().getBoId());
			}
		}
		domainObject.setTheatreSlot(value9);
		domainObject.setWasPrinted(valueObject.getWasPrinted());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.documents.domain.objects.PatientDocument value11 = null;
		if ( null != valueObject.getBookingLetter() ) 
		{
			if (valueObject.getBookingLetter().getBoId() == null)
			{
				if (domMap.get(valueObject.getBookingLetter()) != null)
				{
					value11 = (ims.core.documents.domain.objects.PatientDocument)domMap.get(valueObject.getBookingLetter());
				}
			}
			else
			{
				value11 = (ims.core.documents.domain.objects.PatientDocument)domainFactory.getDomainObject(ims.core.documents.domain.objects.PatientDocument.class, valueObject.getBookingLetter().getBoId());
			}
		}
		domainObject.setBookingLetter(value11);
		domainObject.setNumProviderCancellations(valueObject.getNumProviderCancellations());
		domainObject.setNumPatientCancellations(valueObject.getNumPatientCancellations());

		// SaveAsRefVO treated as RefValueObject
		ims.scheduling.vo.Booking_AppointmentRefVoCollection refCollection14 = new ims.scheduling.vo.Booking_AppointmentRefVoCollection();
		if (valueObject.getLinkedAppointments() != null)
		{
			for (int i14=0; i14<valueObject.getLinkedAppointments().size(); i14++)
			{
				ims.scheduling.vo.Booking_AppointmentRefVo ref14 = (ims.scheduling.vo.Booking_AppointmentRefVo)valueObject.getLinkedAppointments().get(i14);
				refCollection14.add(ref14);
			}
		}
		int size14 = (null == refCollection14) ? 0 : refCollection14.size();		
		java.util.Set domainLinkedAppointments14 = domainObject.getLinkedAppointments();
		if (domainLinkedAppointments14 == null)
		{
			domainLinkedAppointments14 = new java.util.HashSet();
		}
		java.util.Set newSet14  = new java.util.HashSet();
		for(int i=0; i<size14; i++) 
		{
			ims.scheduling.vo.Booking_AppointmentRefVo vo = refCollection14.get(i);					
			ims.scheduling.domain.objects.Booking_Appointment dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.scheduling.domain.objects.Booking_Appointment)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.scheduling.domain.objects.Booking_Appointment)domainFactory.getDomainObject( ims.scheduling.domain.objects.Booking_Appointment.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainLinkedAppointments14.contains(dom))
			{
				domainLinkedAppointments14.add(dom);
			}
			newSet14.add(dom);			
		}
		java.util.Set removedSet14 = new java.util.HashSet();
		java.util.Iterator iter14 = domainLinkedAppointments14.iterator();
		//Find out which objects need to be removed
		while (iter14.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter14.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet14.contains(o))
			{
				removedSet14.add(o);
			}
		}
		iter14 = removedSet14.iterator();
		//Remove the unwanted objects
		while (iter14.hasNext())
		{
			domainLinkedAppointments14.remove(iter14.next());
		}		
		
		domainObject.setLinkedAppointments(domainLinkedAppointments14);		
		domainObject.setIsFlexibleAppointment(valueObject.getIsFlexibleAppointment());
		domainObject.setIsWardAttendance(valueObject.getIsWardAttendance());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Activity value17 = null;
		if ( null != valueObject.getActivity() ) 
		{
			if (valueObject.getActivity().getBoId() == null)
			{
				if (domMap.get(valueObject.getActivity()) != null)
				{
					value17 = (ims.core.resource.place.domain.objects.Activity)domMap.get(valueObject.getActivity());
				}
			}
			else
			{
				value17 = (ims.core.resource.place.domain.objects.Activity)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Activity.class, valueObject.getActivity().getBoId());
			}
		}
		domainObject.setActivity(value17);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value18 = null;
		if ( null != valueObject.getReasonForBreachingFirstApptKPI() ) 
		{
			value18 =
				domainFactory.getLookupInstance(valueObject.getReasonForBreachingFirstApptKPI().getID());
		}
		domainObject.setReasonForBreachingFirstApptKPI(value18);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.scheduling.domain.objects.Appointment_Status value19 = null;
		if ( null != valueObject.getCurrentStatusRecord() ) 
		{
			if (valueObject.getCurrentStatusRecord().getBoId() == null)
			{
				if (domMap.get(valueObject.getCurrentStatusRecord()) != null)
				{
					value19 = (ims.scheduling.domain.objects.Appointment_Status)domMap.get(valueObject.getCurrentStatusRecord());
				}
			}
			else
			{
				value19 = (ims.scheduling.domain.objects.Appointment_Status)domainFactory.getDomainObject(ims.scheduling.domain.objects.Appointment_Status.class, valueObject.getCurrentStatusRecord().getBoId());
			}
		}
		domainObject.setCurrentStatusRecord(value19);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value20 = null;
		if ( null != valueObject.getOutcome() ) 
		{
			value20 =
				domainFactory.getLookupInstance(valueObject.getOutcome().getID());
		}
		domainObject.setOutcome(value20);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getComments() != null && valueObject.getComments().equals(""))
		{
			valueObject.setComments(null);
		}
		domainObject.setComments(valueObject.getComments());

		return domainObject;
	}

}
