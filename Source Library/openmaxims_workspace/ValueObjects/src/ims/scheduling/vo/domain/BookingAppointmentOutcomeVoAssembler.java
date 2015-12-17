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
public class BookingAppointmentOutcomeVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.scheduling.vo.BookingAppointmentOutcomeVo copy(ims.scheduling.vo.BookingAppointmentOutcomeVo valueObjectDest, ims.scheduling.vo.BookingAppointmentOutcomeVo valueObjectSrc) 
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
		// ApptStatus
		valueObjectDest.setApptStatus(valueObjectSrc.getApptStatus());
		// ApptStatusReason
		valueObjectDest.setApptStatusReason(valueObjectSrc.getApptStatusReason());
		// CurrentStatusRecord
		valueObjectDest.setCurrentStatusRecord(valueObjectSrc.getCurrentStatusRecord());
		// ApptStatusHistory
		valueObjectDest.setApptStatusHistory(valueObjectSrc.getApptStatusHistory());
		// ApptConfirmStatus
		valueObjectDest.setApptConfirmStatus(valueObjectSrc.getApptConfirmStatus());
		// StatusSavedFromOutcome
		valueObjectDest.setStatusSavedFromOutcome(valueObjectSrc.getStatusSavedFromOutcome());
		// SeenTime
		valueObjectDest.setSeenTime(valueObjectSrc.getSeenTime());
		// SeenBy
		valueObjectDest.setSeenBy(valueObjectSrc.getSeenBy());
		// Outcome
		valueObjectDest.setOutcome(valueObjectSrc.getOutcome());
		// OutcomeReason
		valueObjectDest.setOutcomeReason(valueObjectSrc.getOutcomeReason());
		// OutcomeDateTime
		valueObjectDest.setOutcomeDateTime(valueObjectSrc.getOutcomeDateTime());
		// wasFirstDefinitiveTreatment
		valueObjectDest.setWasFirstDefinitiveTreatment(valueObjectSrc.getWasFirstDefinitiveTreatment());
		// OutcomeComments
		valueObjectDest.setOutcomeComments(valueObjectSrc.getOutcomeComments());
		// OutpatientProcedures
		valueObjectDest.setOutpatientProcedures(valueObjectSrc.getOutpatientProcedures());
		// OutpatientDiagnoses
		valueObjectDest.setOutpatientDiagnoses(valueObjectSrc.getOutpatientDiagnoses());
		// OutcomeActions
		valueObjectDest.setOutcomeActions(valueObjectSrc.getOutcomeActions());
		// OutcomeHasRTTClockImpact
		valueObjectDest.setOutcomeHasRTTClockImpact(valueObjectSrc.getOutcomeHasRTTClockImpact());
		// RTTClockImpact
		valueObjectDest.setRTTClockImpact(valueObjectSrc.getRTTClockImpact());
		// Session
		valueObjectDest.setSession(valueObjectSrc.getSession());
		// Activity
		valueObjectDest.setActivity(valueObjectSrc.getActivity());
		// firstConsultationActivity
		valueObjectDest.setFirstConsultationActivity(valueObjectSrc.getFirstConsultationActivity());
		// PathwayClock
		valueObjectDest.setPathwayClock(valueObjectSrc.getPathwayClock());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createBookingAppointmentOutcomeVoCollectionFromBooking_Appointment(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.Booking_Appointment objects.
	 */
	public static ims.scheduling.vo.BookingAppointmentOutcomeVoCollection createBookingAppointmentOutcomeVoCollectionFromBooking_Appointment(java.util.Set domainObjectSet)	
	{
		return createBookingAppointmentOutcomeVoCollectionFromBooking_Appointment(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.Booking_Appointment objects.
	 */
	public static ims.scheduling.vo.BookingAppointmentOutcomeVoCollection createBookingAppointmentOutcomeVoCollectionFromBooking_Appointment(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.scheduling.vo.BookingAppointmentOutcomeVoCollection voList = new ims.scheduling.vo.BookingAppointmentOutcomeVoCollection();
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
			ims.scheduling.vo.BookingAppointmentOutcomeVo vo = create(map, domainObject);
			
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
	public static ims.scheduling.vo.BookingAppointmentOutcomeVoCollection createBookingAppointmentOutcomeVoCollectionFromBooking_Appointment(java.util.List domainObjectList) 
	{
		return createBookingAppointmentOutcomeVoCollectionFromBooking_Appointment(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.scheduling.domain.objects.Booking_Appointment objects.
	 */
	public static ims.scheduling.vo.BookingAppointmentOutcomeVoCollection createBookingAppointmentOutcomeVoCollectionFromBooking_Appointment(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.scheduling.vo.BookingAppointmentOutcomeVoCollection voList = new ims.scheduling.vo.BookingAppointmentOutcomeVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.scheduling.domain.objects.Booking_Appointment domainObject = (ims.scheduling.domain.objects.Booking_Appointment) domainObjectList.get(i);
			ims.scheduling.vo.BookingAppointmentOutcomeVo vo = create(map, domainObject);

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
	 public static java.util.Set extractBooking_AppointmentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.BookingAppointmentOutcomeVoCollection voCollection) 
	 {
	 	return extractBooking_AppointmentSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractBooking_AppointmentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.BookingAppointmentOutcomeVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.BookingAppointmentOutcomeVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.Booking_Appointment domainObject = BookingAppointmentOutcomeVoAssembler.extractBooking_Appointment(domainFactory, vo, domMap);

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
	 public static java.util.List extractBooking_AppointmentList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.BookingAppointmentOutcomeVoCollection voCollection) 
	 {
	 	return extractBooking_AppointmentList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractBooking_AppointmentList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.BookingAppointmentOutcomeVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.BookingAppointmentOutcomeVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.Booking_Appointment domainObject = BookingAppointmentOutcomeVoAssembler.extractBooking_Appointment(domainFactory, vo, domMap);

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
	 public static ims.scheduling.vo.BookingAppointmentOutcomeVo create(ims.scheduling.domain.objects.Booking_Appointment domainObject) 
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
	  public static ims.scheduling.vo.BookingAppointmentOutcomeVo create(DomainObjectMap map, ims.scheduling.domain.objects.Booking_Appointment domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.scheduling.vo.BookingAppointmentOutcomeVo valueObject = (ims.scheduling.vo.BookingAppointmentOutcomeVo) map.getValueObject(domainObject, ims.scheduling.vo.BookingAppointmentOutcomeVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.scheduling.vo.BookingAppointmentOutcomeVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.scheduling.vo.BookingAppointmentOutcomeVo insert(ims.scheduling.vo.BookingAppointmentOutcomeVo valueObject, ims.scheduling.domain.objects.Booking_Appointment domainObject) 
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
	 public static ims.scheduling.vo.BookingAppointmentOutcomeVo insert(DomainObjectMap map, ims.scheduling.vo.BookingAppointmentOutcomeVo valueObject, ims.scheduling.domain.objects.Booking_Appointment domainObject) 
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
		// ApptStatus
		ims.domain.lookups.LookupInstance instance3 = domainObject.getApptStatus();
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

			ims.scheduling.vo.lookups.Status_Reason voLookup3 = new ims.scheduling.vo.lookups.Status_Reason(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.scheduling.vo.lookups.Status_Reason parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.scheduling.vo.lookups.Status_Reason(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setApptStatus(voLookup3);
		}
				// ApptStatusReason
		ims.domain.lookups.LookupInstance instance4 = domainObject.getApptStatusReas();
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
			valueObject.setApptStatusReason(voLookup4);
		}
				// CurrentStatusRecord
		valueObject.setCurrentStatusRecord(ims.scheduling.vo.domain.Appointment_StatusForAppointmentOutcomeVoAssembler.create(map, domainObject.getCurrentStatusRecord()) );
		// ApptStatusHistory
		valueObject.setApptStatusHistory(ims.scheduling.vo.domain.Appointment_StatusForAppointmentOutcomeVoAssembler.createAppointment_StatusForAppointmentOutcomeVoCollectionFromAppointment_Status(map, domainObject.getApptStatusHistory()) );
		// ApptConfirmStatus
		ims.domain.lookups.LookupInstance instance7 = domainObject.getApptConfirmStatus();
		if ( null != instance7 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance7.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance7.getImage().getImageId(), instance7.getImage().getImagePath());
			}
			color = instance7.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.ApptConfStatus voLookup7 = new ims.scheduling.vo.lookups.ApptConfStatus(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.scheduling.vo.lookups.ApptConfStatus parentVoLookup7 = voLookup7;
			ims.domain.lookups.LookupInstance parent7 = instance7.getParent();
			while (parent7 != null)
			{
				if (parent7.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent7.getImage().getImageId(), parent7.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent7.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup7.setParent(new ims.scheduling.vo.lookups.ApptConfStatus(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setApptConfirmStatus(voLookup7);
		}
				// StatusSavedFromOutcome
		valueObject.setStatusSavedFromOutcome( domainObject.isStatusSavedFromOutcome() );
		// SeenTime
		String SeenTime = domainObject.getSeenTime();
		if ( null != SeenTime ) 
		{
			valueObject.setSeenTime(new ims.framework.utils.Time(SeenTime) );
		}
		// SeenBy
		valueObject.setSeenBy(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getSeenBy()) );
		// Outcome
		ims.domain.lookups.LookupInstance instance11 = domainObject.getOutcome();
		if ( null != instance11 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance11.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance11.getImage().getImageId(), instance11.getImage().getImagePath());
			}
			color = instance11.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.ApptOutcome voLookup11 = new ims.scheduling.vo.lookups.ApptOutcome(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.scheduling.vo.lookups.ApptOutcome parentVoLookup11 = voLookup11;
			ims.domain.lookups.LookupInstance parent11 = instance11.getParent();
			while (parent11 != null)
			{
				if (parent11.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent11.getImage().getImageId(), parent11.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent11.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup11.setParent(new ims.scheduling.vo.lookups.ApptOutcome(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setOutcome(voLookup11);
		}
				// OutcomeReason
		ims.domain.lookups.LookupInstance instance12 = domainObject.getOutcomeReason();
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

			ims.admin.vo.lookups.AppointmentOutcomeReason voLookup12 = new ims.admin.vo.lookups.AppointmentOutcomeReason(instance12.getId(),instance12.getText(), instance12.isActive(), null, img, color);
			ims.admin.vo.lookups.AppointmentOutcomeReason parentVoLookup12 = voLookup12;
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
								parentVoLookup12.setParent(new ims.admin.vo.lookups.AppointmentOutcomeReason(parent12.getId(),parent12.getText(), parent12.isActive(), null, img, color));
				parentVoLookup12 = parentVoLookup12.getParent();
								parent12 = parent12.getParent();
			}			
			valueObject.setOutcomeReason(voLookup12);
		}
				// OutcomeDateTime
		java.util.Date OutcomeDateTime = domainObject.getOutcomeDateTime();
		if ( null != OutcomeDateTime ) 
		{
			valueObject.setOutcomeDateTime(new ims.framework.utils.DateTime(OutcomeDateTime) );
		}
		// wasFirstDefinitiveTreatment
		valueObject.setWasFirstDefinitiveTreatment( domainObject.isWasFirstDefinitiveTreatment() );
		// OutcomeComments
		valueObject.setOutcomeComments(domainObject.getOutcomeComments());
		// OutpatientProcedures
		valueObject.setOutpatientProcedures(ims.RefMan.vo.domain.PatientProcedureForAppointmentOutcomeVoAssembler.createPatientProcedureForAppointmentOutcomeVoCollectionFromPatientProcedure(map, domainObject.getOutpatientProcedures()) );
		// OutpatientDiagnoses
		valueObject.setOutpatientDiagnoses(ims.RefMan.vo.domain.PatientDiagnosisForAppointmentOutcomeVoAssembler.createPatientDiagnosisForAppointmentOutcomeVoCollectionFromPatientDiagnosis(map, domainObject.getOutpatientDiagnoses()) );
		// OutcomeActions
		valueObject.setOutcomeActions(ims.scheduling.vo.domain.AppointmentOutcomeActionVoAssembler.createAppointmentOutcomeActionVoCollectionFromAppointmentOutcomeAction(map, domainObject.getOutcomeActions()) );
		// OutcomeHasRTTClockImpact
		valueObject.setOutcomeHasRTTClockImpact( domainObject.isOutcomeHasRTTClockImpact() );
		// RTTClockImpact
		valueObject.setRTTClockImpact(ims.pathways.vo.domain.PathwayRTTClockImpactVoAssembler.create(map, domainObject.getRTTClockImpact()) );
		// Session
		valueObject.setSession(ims.scheduling.vo.domain.Sch_SessionShortVoAssembler.create(map, domainObject.getSession()) );
		// Activity
		valueObject.setActivity(ims.core.vo.domain.ActivityLiteVoAssembler.create(map, domainObject.getActivity()) );
		// firstConsultationActivity
		valueObject.setFirstConsultationActivity( domainObject.isFirstConsultationActivity() );
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
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.scheduling.domain.objects.Booking_Appointment extractBooking_Appointment(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.BookingAppointmentOutcomeVo valueObject) 
	{
		return 	extractBooking_Appointment(domainFactory, valueObject, new HashMap());
	}

	public static ims.scheduling.domain.objects.Booking_Appointment extractBooking_Appointment(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.BookingAppointmentOutcomeVo valueObject, HashMap domMap) 
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
			// ims.scheduling.vo.BookingAppointmentOutcomeVo ID_Booking_Appointment field is unknown
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
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getApptStatus() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getApptStatus().getID());
		}
		domainObject.setApptStatus(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getApptStatusReason() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getApptStatusReason().getID());
		}
		domainObject.setApptStatusReas(value4);
		domainObject.setCurrentStatusRecord(ims.scheduling.vo.domain.Appointment_StatusForAppointmentOutcomeVoAssembler.extractAppointment_Status(domainFactory, valueObject.getCurrentStatusRecord(), domMap));
		domainObject.setApptStatusHistory(ims.scheduling.vo.domain.Appointment_StatusForAppointmentOutcomeVoAssembler.extractAppointment_StatusSet(domainFactory, valueObject.getApptStatusHistory(), domainObject.getApptStatusHistory(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getApptConfirmStatus() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getApptConfirmStatus().getID());
		}
		domainObject.setApptConfirmStatus(value7);
		domainObject.setStatusSavedFromOutcome(valueObject.getStatusSavedFromOutcome());
		ims.framework.utils.Time time9 = valueObject.getSeenTime();
		String value9 = null;
		if ( time9 != null ) 
		{
			value9 = time9.toString();
		}
		domainObject.setSeenTime(value9);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value10 = null;
		if ( null != valueObject.getSeenBy() ) 
		{
			if (valueObject.getSeenBy().getBoId() == null)
			{
				if (domMap.get(valueObject.getSeenBy()) != null)
				{
					value10 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getSeenBy());
				}
			}
			else
			{
				value10 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getSeenBy().getBoId());
			}
		}
		domainObject.setSeenBy(value10);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getOutcome() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getOutcome().getID());
		}
		domainObject.setOutcome(value11);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value12 = null;
		if ( null != valueObject.getOutcomeReason() ) 
		{
			value12 =
				domainFactory.getLookupInstance(valueObject.getOutcomeReason().getID());
		}
		domainObject.setOutcomeReason(value12);
		ims.framework.utils.DateTime dateTime13 = valueObject.getOutcomeDateTime();
		java.util.Date value13 = null;
		if ( dateTime13 != null ) 
		{
			value13 = dateTime13.getJavaDate();
		}
		domainObject.setOutcomeDateTime(value13);
		domainObject.setWasFirstDefinitiveTreatment(valueObject.getWasFirstDefinitiveTreatment());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getOutcomeComments() != null && valueObject.getOutcomeComments().equals(""))
		{
			valueObject.setOutcomeComments(null);
		}
		domainObject.setOutcomeComments(valueObject.getOutcomeComments());
		domainObject.setOutpatientProcedures(ims.RefMan.vo.domain.PatientProcedureForAppointmentOutcomeVoAssembler.extractPatientProcedureSet(domainFactory, valueObject.getOutpatientProcedures(), domainObject.getOutpatientProcedures(), domMap));		
		domainObject.setOutpatientDiagnoses(ims.RefMan.vo.domain.PatientDiagnosisForAppointmentOutcomeVoAssembler.extractPatientDiagnosisSet(domainFactory, valueObject.getOutpatientDiagnoses(), domainObject.getOutpatientDiagnoses(), domMap));		
		domainObject.setOutcomeActions(ims.scheduling.vo.domain.AppointmentOutcomeActionVoAssembler.extractAppointmentOutcomeActionList(domainFactory, valueObject.getOutcomeActions(), domainObject.getOutcomeActions(), domMap));		
		domainObject.setOutcomeHasRTTClockImpact(valueObject.getOutcomeHasRTTClockImpact());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.pathways.domain.objects.PathwaysRTTClockImpact value20 = null;
		if ( null != valueObject.getRTTClockImpact() ) 
		{
			if (valueObject.getRTTClockImpact().getBoId() == null)
			{
				if (domMap.get(valueObject.getRTTClockImpact()) != null)
				{
					value20 = (ims.pathways.domain.objects.PathwaysRTTClockImpact)domMap.get(valueObject.getRTTClockImpact());
				}
			}
			else
			{
				value20 = (ims.pathways.domain.objects.PathwaysRTTClockImpact)domainFactory.getDomainObject(ims.pathways.domain.objects.PathwaysRTTClockImpact.class, valueObject.getRTTClockImpact().getBoId());
			}
		}
		domainObject.setRTTClockImpact(value20);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.scheduling.domain.objects.Sch_Session value21 = null;
		if ( null != valueObject.getSession() ) 
		{
			if (valueObject.getSession().getBoId() == null)
			{
				if (domMap.get(valueObject.getSession()) != null)
				{
					value21 = (ims.scheduling.domain.objects.Sch_Session)domMap.get(valueObject.getSession());
				}
			}
			else
			{
				value21 = (ims.scheduling.domain.objects.Sch_Session)domainFactory.getDomainObject(ims.scheduling.domain.objects.Sch_Session.class, valueObject.getSession().getBoId());
			}
		}
		domainObject.setSession(value21);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Activity value22 = null;
		if ( null != valueObject.getActivity() ) 
		{
			if (valueObject.getActivity().getBoId() == null)
			{
				if (domMap.get(valueObject.getActivity()) != null)
				{
					value22 = (ims.core.resource.place.domain.objects.Activity)domMap.get(valueObject.getActivity());
				}
			}
			else
			{
				value22 = (ims.core.resource.place.domain.objects.Activity)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Activity.class, valueObject.getActivity().getBoId());
			}
		}
		domainObject.setActivity(value22);
		domainObject.setFirstConsultationActivity(valueObject.getFirstConsultationActivity());
		ims.pathways.domain.objects.PathwayClock value24 = null;
		if ( null != valueObject.getPathwayClock() ) 
		{
			if (valueObject.getPathwayClock().getBoId() == null)
			{
				if (domMap.get(valueObject.getPathwayClock()) != null)
				{
					value24 = (ims.pathways.domain.objects.PathwayClock)domMap.get(valueObject.getPathwayClock());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value24 = domainObject.getPathwayClock();	
			}
			else
			{
				value24 = (ims.pathways.domain.objects.PathwayClock)domainFactory.getDomainObject(ims.pathways.domain.objects.PathwayClock.class, valueObject.getPathwayClock().getBoId());
			}
		}
		domainObject.setPathwayClock(value24);

		return domainObject;
	}

}
