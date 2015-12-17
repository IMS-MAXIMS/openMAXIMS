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
 * @author George Cristian Josan
 */
public class BookingAppointment_RIE_OutcomeVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.scheduling.vo.BookingAppointment_RIE_OutcomeVo copy(ims.scheduling.vo.BookingAppointment_RIE_OutcomeVo valueObjectDest, ims.scheduling.vo.BookingAppointment_RIE_OutcomeVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Booking_Appointment(valueObjectSrc.getID_Booking_Appointment());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ApptStatus
		valueObjectDest.setApptStatus(valueObjectSrc.getApptStatus());
		// ApptStatusReas
		valueObjectDest.setApptStatusReas(valueObjectSrc.getApptStatusReas());
		// CurrentStatusRecord
		valueObjectDest.setCurrentStatusRecord(valueObjectSrc.getCurrentStatusRecord());
		// ApptStatusHistory
		valueObjectDest.setApptStatusHistory(valueObjectSrc.getApptStatusHistory());
		// SeenTime
		valueObjectDest.setSeenTime(valueObjectSrc.getSeenTime());
		// SeenBy
		valueObjectDest.setSeenBy(valueObjectSrc.getSeenBy());
		// ApptCompleteTime
		valueObjectDest.setApptCompleteTime(valueObjectSrc.getApptCompleteTime());
		// Outcome
		valueObjectDest.setOutcome(valueObjectSrc.getOutcome());
		// OutcomeDateTime
		valueObjectDest.setOutcomeDateTime(valueObjectSrc.getOutcomeDateTime());
		// OutcomeReason
		valueObjectDest.setOutcomeReason(valueObjectSrc.getOutcomeReason());
		// OutcomeComments
		valueObjectDest.setOutcomeComments(valueObjectSrc.getOutcomeComments());
		// wasFirstDefinitiveTreatment
		valueObjectDest.setWasFirstDefinitiveTreatment(valueObjectSrc.getWasFirstDefinitiveTreatment());
		// OutcomeHasRTTClockImpact
		valueObjectDest.setOutcomeHasRTTClockImpact(valueObjectSrc.getOutcomeHasRTTClockImpact());
		// StatusSavedFromOutcome
		valueObjectDest.setStatusSavedFromOutcome(valueObjectSrc.getStatusSavedFromOutcome());
		// ApptBookedOnSameDay
		valueObjectDest.setApptBookedOnSameDay(valueObjectSrc.getApptBookedOnSameDay());
		// OutcomeActions
		valueObjectDest.setOutcomeActions(valueObjectSrc.getOutcomeActions());
		// RTTClockImpact
		valueObjectDest.setRTTClockImpact(valueObjectSrc.getRTTClockImpact());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createBookingAppointment_RIE_OutcomeVoCollectionFromBooking_Appointment(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.Booking_Appointment objects.
	 */
	public static ims.scheduling.vo.BookingAppointment_RIE_OutcomeVoCollection createBookingAppointment_RIE_OutcomeVoCollectionFromBooking_Appointment(java.util.Set domainObjectSet)	
	{
		return createBookingAppointment_RIE_OutcomeVoCollectionFromBooking_Appointment(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.Booking_Appointment objects.
	 */
	public static ims.scheduling.vo.BookingAppointment_RIE_OutcomeVoCollection createBookingAppointment_RIE_OutcomeVoCollectionFromBooking_Appointment(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.scheduling.vo.BookingAppointment_RIE_OutcomeVoCollection voList = new ims.scheduling.vo.BookingAppointment_RIE_OutcomeVoCollection();
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
			ims.scheduling.vo.BookingAppointment_RIE_OutcomeVo vo = create(map, domainObject);
			
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
	public static ims.scheduling.vo.BookingAppointment_RIE_OutcomeVoCollection createBookingAppointment_RIE_OutcomeVoCollectionFromBooking_Appointment(java.util.List domainObjectList) 
	{
		return createBookingAppointment_RIE_OutcomeVoCollectionFromBooking_Appointment(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.scheduling.domain.objects.Booking_Appointment objects.
	 */
	public static ims.scheduling.vo.BookingAppointment_RIE_OutcomeVoCollection createBookingAppointment_RIE_OutcomeVoCollectionFromBooking_Appointment(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.scheduling.vo.BookingAppointment_RIE_OutcomeVoCollection voList = new ims.scheduling.vo.BookingAppointment_RIE_OutcomeVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.scheduling.domain.objects.Booking_Appointment domainObject = (ims.scheduling.domain.objects.Booking_Appointment) domainObjectList.get(i);
			ims.scheduling.vo.BookingAppointment_RIE_OutcomeVo vo = create(map, domainObject);

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
	 public static java.util.Set extractBooking_AppointmentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.BookingAppointment_RIE_OutcomeVoCollection voCollection) 
	 {
	 	return extractBooking_AppointmentSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractBooking_AppointmentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.BookingAppointment_RIE_OutcomeVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.BookingAppointment_RIE_OutcomeVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.Booking_Appointment domainObject = BookingAppointment_RIE_OutcomeVoAssembler.extractBooking_Appointment(domainFactory, vo, domMap);

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
	 public static java.util.List extractBooking_AppointmentList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.BookingAppointment_RIE_OutcomeVoCollection voCollection) 
	 {
	 	return extractBooking_AppointmentList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractBooking_AppointmentList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.BookingAppointment_RIE_OutcomeVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.BookingAppointment_RIE_OutcomeVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.Booking_Appointment domainObject = BookingAppointment_RIE_OutcomeVoAssembler.extractBooking_Appointment(domainFactory, vo, domMap);

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
	 public static ims.scheduling.vo.BookingAppointment_RIE_OutcomeVo create(ims.scheduling.domain.objects.Booking_Appointment domainObject) 
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
	  public static ims.scheduling.vo.BookingAppointment_RIE_OutcomeVo create(DomainObjectMap map, ims.scheduling.domain.objects.Booking_Appointment domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.scheduling.vo.BookingAppointment_RIE_OutcomeVo valueObject = (ims.scheduling.vo.BookingAppointment_RIE_OutcomeVo) map.getValueObject(domainObject, ims.scheduling.vo.BookingAppointment_RIE_OutcomeVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.scheduling.vo.BookingAppointment_RIE_OutcomeVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.scheduling.vo.BookingAppointment_RIE_OutcomeVo insert(ims.scheduling.vo.BookingAppointment_RIE_OutcomeVo valueObject, ims.scheduling.domain.objects.Booking_Appointment domainObject) 
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
	 public static ims.scheduling.vo.BookingAppointment_RIE_OutcomeVo insert(DomainObjectMap map, ims.scheduling.vo.BookingAppointment_RIE_OutcomeVo valueObject, ims.scheduling.domain.objects.Booking_Appointment domainObject) 
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
			
		// ApptStatus
		ims.domain.lookups.LookupInstance instance1 = domainObject.getApptStatus();
		if ( null != instance1 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance1.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance1.getImage().getImageId(), instance1.getImage().getImagePath());
			}
			color = instance1.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.Status_Reason voLookup1 = new ims.scheduling.vo.lookups.Status_Reason(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.scheduling.vo.lookups.Status_Reason parentVoLookup1 = voLookup1;
			ims.domain.lookups.LookupInstance parent1 = instance1.getParent();
			while (parent1 != null)
			{
				if (parent1.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent1.getImage().getImageId(), parent1.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent1.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup1.setParent(new ims.scheduling.vo.lookups.Status_Reason(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setApptStatus(voLookup1);
		}
				// ApptStatusReas
		ims.domain.lookups.LookupInstance instance2 = domainObject.getApptStatusReas();
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
			valueObject.setApptStatusReas(voLookup2);
		}
				// CurrentStatusRecord
		valueObject.setCurrentStatusRecord(ims.scheduling.vo.domain.Appointment_StatusForAppointmentOutcomeVoAssembler.create(map, domainObject.getCurrentStatusRecord()) );
		// ApptStatusHistory
		valueObject.setApptStatusHistory(ims.scheduling.vo.domain.Appointment_StatusForAppointmentOutcomeVoAssembler.createAppointment_StatusForAppointmentOutcomeVoCollectionFromAppointment_Status(map, domainObject.getApptStatusHistory()) );
		// SeenTime
		String SeenTime = domainObject.getSeenTime();
		if ( null != SeenTime ) 
		{
			valueObject.setSeenTime(new ims.framework.utils.Time(SeenTime) );
		}
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
		// ApptCompleteTime
		String ApptCompleteTime = domainObject.getApptCompleteTime();
		if ( null != ApptCompleteTime ) 
		{
			valueObject.setApptCompleteTime(new ims.framework.utils.Time(ApptCompleteTime) );
		}
		// Outcome
		ims.domain.lookups.LookupInstance instance8 = domainObject.getOutcome();
		if ( null != instance8 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance8.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance8.getImage().getImageId(), instance8.getImage().getImagePath());
			}
			color = instance8.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.ApptOutcome voLookup8 = new ims.scheduling.vo.lookups.ApptOutcome(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.scheduling.vo.lookups.ApptOutcome parentVoLookup8 = voLookup8;
			ims.domain.lookups.LookupInstance parent8 = instance8.getParent();
			while (parent8 != null)
			{
				if (parent8.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent8.getImage().getImageId(), parent8.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent8.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup8.setParent(new ims.scheduling.vo.lookups.ApptOutcome(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setOutcome(voLookup8);
		}
				// OutcomeDateTime
		java.util.Date OutcomeDateTime = domainObject.getOutcomeDateTime();
		if ( null != OutcomeDateTime ) 
		{
			valueObject.setOutcomeDateTime(new ims.framework.utils.DateTime(OutcomeDateTime) );
		}
		// OutcomeReason
		ims.domain.lookups.LookupInstance instance10 = domainObject.getOutcomeReason();
		if ( null != instance10 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance10.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance10.getImage().getImageId(), instance10.getImage().getImagePath());
			}
			color = instance10.getColor();
			if (color != null) 
				color.getValue();

			ims.admin.vo.lookups.AppointmentOutcomeReason voLookup10 = new ims.admin.vo.lookups.AppointmentOutcomeReason(instance10.getId(),instance10.getText(), instance10.isActive(), null, img, color);
			ims.admin.vo.lookups.AppointmentOutcomeReason parentVoLookup10 = voLookup10;
			ims.domain.lookups.LookupInstance parent10 = instance10.getParent();
			while (parent10 != null)
			{
				if (parent10.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent10.getImage().getImageId(), parent10.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent10.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup10.setParent(new ims.admin.vo.lookups.AppointmentOutcomeReason(parent10.getId(),parent10.getText(), parent10.isActive(), null, img, color));
				parentVoLookup10 = parentVoLookup10.getParent();
								parent10 = parent10.getParent();
			}			
			valueObject.setOutcomeReason(voLookup10);
		}
				// OutcomeComments
		valueObject.setOutcomeComments(domainObject.getOutcomeComments());
		// wasFirstDefinitiveTreatment
		valueObject.setWasFirstDefinitiveTreatment( domainObject.isWasFirstDefinitiveTreatment() );
		// OutcomeHasRTTClockImpact
		valueObject.setOutcomeHasRTTClockImpact( domainObject.isOutcomeHasRTTClockImpact() );
		// StatusSavedFromOutcome
		valueObject.setStatusSavedFromOutcome( domainObject.isStatusSavedFromOutcome() );
		// ApptBookedOnSameDay
		valueObject.setApptBookedOnSameDay( domainObject.isApptBookedOnSameDay() );
		// OutcomeActions
		valueObject.setOutcomeActions(ims.scheduling.vo.domain.AppointmentOutcomeAction_RIE_OutcomeVoAssembler.createAppointmentOutcomeAction_RIE_OutcomeVoCollectionFromAppointmentOutcomeAction(map, domainObject.getOutcomeActions()) );
		// RTTClockImpact
		valueObject.setRTTClockImpact(ims.pathways.vo.domain.PathwayRTTClockImpactVoAssembler.create(map, domainObject.getRTTClockImpact()) );
		// Patient
		if (domainObject.getPatient() != null)
		{
			if(domainObject.getPatient() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getPatient();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setPatient(new ims.core.patient.vo.PatientRefVo(id, -1));				
			}
			else
			{
				valueObject.setPatient(new ims.core.patient.vo.PatientRefVo(domainObject.getPatient().getId(), domainObject.getPatient().getVersion()));
			}
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.scheduling.domain.objects.Booking_Appointment extractBooking_Appointment(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.BookingAppointment_RIE_OutcomeVo valueObject) 
	{
		return 	extractBooking_Appointment(domainFactory, valueObject, new HashMap());
	}

	public static ims.scheduling.domain.objects.Booking_Appointment extractBooking_Appointment(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.BookingAppointment_RIE_OutcomeVo valueObject, HashMap domMap) 
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
			// ims.scheduling.vo.BookingAppointment_RIE_OutcomeVo ID_Booking_Appointment field is unknown
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

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getApptStatus() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getApptStatus().getID());
		}
		domainObject.setApptStatus(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getApptStatusReas() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getApptStatusReas().getID());
		}
		domainObject.setApptStatusReas(value2);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.scheduling.domain.objects.Appointment_Status value3 = null;
		if ( null != valueObject.getCurrentStatusRecord() ) 
		{
			if (valueObject.getCurrentStatusRecord().getBoId() == null)
			{
				if (domMap.get(valueObject.getCurrentStatusRecord()) != null)
				{
					value3 = (ims.scheduling.domain.objects.Appointment_Status)domMap.get(valueObject.getCurrentStatusRecord());
				}
			}
			else
			{
				value3 = (ims.scheduling.domain.objects.Appointment_Status)domainFactory.getDomainObject(ims.scheduling.domain.objects.Appointment_Status.class, valueObject.getCurrentStatusRecord().getBoId());
			}
		}
		domainObject.setCurrentStatusRecord(value3);

		// SaveAsRefVO treated as RefValueObject
		ims.scheduling.vo.Appointment_StatusRefVoCollection refCollection4 = new ims.scheduling.vo.Appointment_StatusRefVoCollection();
		if (valueObject.getApptStatusHistory() != null)
		{
			for (int i4=0; i4<valueObject.getApptStatusHistory().size(); i4++)
			{
				ims.scheduling.vo.Appointment_StatusRefVo ref4 = (ims.scheduling.vo.Appointment_StatusRefVo)valueObject.getApptStatusHistory().get(i4);
				refCollection4.add(ref4);
			}
		}
		int size4 = (null == refCollection4) ? 0 : refCollection4.size();		
		java.util.Set domainApptStatusHistory4 = domainObject.getApptStatusHistory();
		if (domainApptStatusHistory4 == null)
		{
			domainApptStatusHistory4 = new java.util.HashSet();
		}
		java.util.Set newSet4  = new java.util.HashSet();
		for(int i=0; i<size4; i++) 
		{
			ims.scheduling.vo.Appointment_StatusRefVo vo = refCollection4.get(i);					
			ims.scheduling.domain.objects.Appointment_Status dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.scheduling.domain.objects.Appointment_Status)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.scheduling.domain.objects.Appointment_Status)domainFactory.getDomainObject( ims.scheduling.domain.objects.Appointment_Status.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainApptStatusHistory4.contains(dom))
			{
				domainApptStatusHistory4.add(dom);
			}
			newSet4.add(dom);			
		}
		java.util.Set removedSet4 = new java.util.HashSet();
		java.util.Iterator iter4 = domainApptStatusHistory4.iterator();
		//Find out which objects need to be removed
		while (iter4.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter4.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet4.contains(o))
			{
				removedSet4.add(o);
			}
		}
		iter4 = removedSet4.iterator();
		//Remove the unwanted objects
		while (iter4.hasNext())
		{
			domainApptStatusHistory4.remove(iter4.next());
		}		
		
		domainObject.setApptStatusHistory(domainApptStatusHistory4);		
		ims.framework.utils.Time time5 = valueObject.getSeenTime();
		String value5 = null;
		if ( time5 != null ) 
		{
			value5 = time5.toString();
		}
		domainObject.setSeenTime(value5);
		ims.core.resource.people.domain.objects.Hcp value6 = null;
		if ( null != valueObject.getSeenBy() ) 
		{
			if (valueObject.getSeenBy().getBoId() == null)
			{
				if (domMap.get(valueObject.getSeenBy()) != null)
				{
					value6 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getSeenBy());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value6 = domainObject.getSeenBy();	
			}
			else
			{
				value6 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getSeenBy().getBoId());
			}
		}
		domainObject.setSeenBy(value6);
		ims.framework.utils.Time time7 = valueObject.getApptCompleteTime();
		String value7 = null;
		if ( time7 != null ) 
		{
			value7 = time7.toString();
		}
		domainObject.setApptCompleteTime(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getOutcome() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getOutcome().getID());
		}
		domainObject.setOutcome(value8);
		ims.framework.utils.DateTime dateTime9 = valueObject.getOutcomeDateTime();
		java.util.Date value9 = null;
		if ( dateTime9 != null ) 
		{
			value9 = dateTime9.getJavaDate();
		}
		domainObject.setOutcomeDateTime(value9);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getOutcomeReason() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getOutcomeReason().getID());
		}
		domainObject.setOutcomeReason(value10);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getOutcomeComments() != null && valueObject.getOutcomeComments().equals(""))
		{
			valueObject.setOutcomeComments(null);
		}
		domainObject.setOutcomeComments(valueObject.getOutcomeComments());
		domainObject.setWasFirstDefinitiveTreatment(valueObject.getWasFirstDefinitiveTreatment());
		domainObject.setOutcomeHasRTTClockImpact(valueObject.getOutcomeHasRTTClockImpact());
		domainObject.setStatusSavedFromOutcome(valueObject.getStatusSavedFromOutcome());
		domainObject.setApptBookedOnSameDay(valueObject.getApptBookedOnSameDay());
		domainObject.setOutcomeActions(ims.scheduling.vo.domain.AppointmentOutcomeAction_RIE_OutcomeVoAssembler.extractAppointmentOutcomeActionList(domainFactory, valueObject.getOutcomeActions(), domainObject.getOutcomeActions(), domMap));		
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.pathways.domain.objects.PathwaysRTTClockImpact value17 = null;
		if ( null != valueObject.getRTTClockImpact() ) 
		{
			if (valueObject.getRTTClockImpact().getBoId() == null)
			{
				if (domMap.get(valueObject.getRTTClockImpact()) != null)
				{
					value17 = (ims.pathways.domain.objects.PathwaysRTTClockImpact)domMap.get(valueObject.getRTTClockImpact());
				}
			}
			else
			{
				value17 = (ims.pathways.domain.objects.PathwaysRTTClockImpact)domainFactory.getDomainObject(ims.pathways.domain.objects.PathwaysRTTClockImpact.class, valueObject.getRTTClockImpact().getBoId());
			}
		}
		domainObject.setRTTClockImpact(value17);
		ims.core.patient.domain.objects.Patient value18 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value18 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value18 = domainObject.getPatient();	
			}
			else
			{
				value18 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value18);

		return domainObject;
	}

}
