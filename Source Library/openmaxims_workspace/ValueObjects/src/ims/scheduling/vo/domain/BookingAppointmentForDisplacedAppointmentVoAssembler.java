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
 * @author Rory Fitzpatrick
 */
public class BookingAppointmentForDisplacedAppointmentVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.scheduling.vo.BookingAppointmentForDisplacedAppointmentVo copy(ims.scheduling.vo.BookingAppointmentForDisplacedAppointmentVo valueObjectDest, ims.scheduling.vo.BookingAppointmentForDisplacedAppointmentVo valueObjectSrc) 
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
		// Activity
		valueObjectDest.setActivity(valueObjectSrc.getActivity());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// LinkedAppointments
		valueObjectDest.setLinkedAppointments(valueObjectSrc.getLinkedAppointments());
		// isDisplaced
		valueObjectDest.setIsDisplaced(valueObjectSrc.getIsDisplaced());
		// ServiceFunction
		valueObjectDest.setServiceFunction(valueObjectSrc.getServiceFunction());
		// RTTBreachKPIDate
		valueObjectDest.setRTTBreachKPIDate(valueObjectSrc.getRTTBreachKPIDate());
		// isCABBooking
		valueObjectDest.setIsCABBooking(valueObjectSrc.getIsCABBooking());
		// CurrentStatusRecord
		valueObjectDest.setCurrentStatusRecord(valueObjectSrc.getCurrentStatusRecord());
		// SessionSlot
		valueObjectDest.setSessionSlot(valueObjectSrc.getSessionSlot());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createBookingAppointmentForDisplacedAppointmentVoCollectionFromBooking_Appointment(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.Booking_Appointment objects.
	 */
	public static ims.scheduling.vo.BookingAppointmentForDisplacedAppointmentVoCollection createBookingAppointmentForDisplacedAppointmentVoCollectionFromBooking_Appointment(java.util.Set domainObjectSet)	
	{
		return createBookingAppointmentForDisplacedAppointmentVoCollectionFromBooking_Appointment(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.Booking_Appointment objects.
	 */
	public static ims.scheduling.vo.BookingAppointmentForDisplacedAppointmentVoCollection createBookingAppointmentForDisplacedAppointmentVoCollectionFromBooking_Appointment(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.scheduling.vo.BookingAppointmentForDisplacedAppointmentVoCollection voList = new ims.scheduling.vo.BookingAppointmentForDisplacedAppointmentVoCollection();
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
			ims.scheduling.vo.BookingAppointmentForDisplacedAppointmentVo vo = create(map, domainObject);
			
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
	public static ims.scheduling.vo.BookingAppointmentForDisplacedAppointmentVoCollection createBookingAppointmentForDisplacedAppointmentVoCollectionFromBooking_Appointment(java.util.List domainObjectList) 
	{
		return createBookingAppointmentForDisplacedAppointmentVoCollectionFromBooking_Appointment(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.scheduling.domain.objects.Booking_Appointment objects.
	 */
	public static ims.scheduling.vo.BookingAppointmentForDisplacedAppointmentVoCollection createBookingAppointmentForDisplacedAppointmentVoCollectionFromBooking_Appointment(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.scheduling.vo.BookingAppointmentForDisplacedAppointmentVoCollection voList = new ims.scheduling.vo.BookingAppointmentForDisplacedAppointmentVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.scheduling.domain.objects.Booking_Appointment domainObject = (ims.scheduling.domain.objects.Booking_Appointment) domainObjectList.get(i);
			ims.scheduling.vo.BookingAppointmentForDisplacedAppointmentVo vo = create(map, domainObject);

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
	 public static java.util.Set extractBooking_AppointmentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.BookingAppointmentForDisplacedAppointmentVoCollection voCollection) 
	 {
	 	return extractBooking_AppointmentSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractBooking_AppointmentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.BookingAppointmentForDisplacedAppointmentVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.BookingAppointmentForDisplacedAppointmentVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.Booking_Appointment domainObject = BookingAppointmentForDisplacedAppointmentVoAssembler.extractBooking_Appointment(domainFactory, vo, domMap);

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
	 public static java.util.List extractBooking_AppointmentList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.BookingAppointmentForDisplacedAppointmentVoCollection voCollection) 
	 {
	 	return extractBooking_AppointmentList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractBooking_AppointmentList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.BookingAppointmentForDisplacedAppointmentVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.BookingAppointmentForDisplacedAppointmentVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.Booking_Appointment domainObject = BookingAppointmentForDisplacedAppointmentVoAssembler.extractBooking_Appointment(domainFactory, vo, domMap);

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
	 public static ims.scheduling.vo.BookingAppointmentForDisplacedAppointmentVo create(ims.scheduling.domain.objects.Booking_Appointment domainObject) 
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
	  public static ims.scheduling.vo.BookingAppointmentForDisplacedAppointmentVo create(DomainObjectMap map, ims.scheduling.domain.objects.Booking_Appointment domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.scheduling.vo.BookingAppointmentForDisplacedAppointmentVo valueObject = (ims.scheduling.vo.BookingAppointmentForDisplacedAppointmentVo) map.getValueObject(domainObject, ims.scheduling.vo.BookingAppointmentForDisplacedAppointmentVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.scheduling.vo.BookingAppointmentForDisplacedAppointmentVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.scheduling.vo.BookingAppointmentForDisplacedAppointmentVo insert(ims.scheduling.vo.BookingAppointmentForDisplacedAppointmentVo valueObject, ims.scheduling.domain.objects.Booking_Appointment domainObject) 
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
	 public static ims.scheduling.vo.BookingAppointmentForDisplacedAppointmentVo insert(DomainObjectMap map, ims.scheduling.vo.BookingAppointmentForDisplacedAppointmentVo valueObject, ims.scheduling.domain.objects.Booking_Appointment domainObject) 
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
		// Activity
		valueObject.setActivity(ims.core.vo.domain.ActivityLiteVoAssembler.create(map, domainObject.getActivity()) );
		// Patient
		valueObject.setPatient(ims.core.vo.domain.PatientLiteVoAssembler.create(map, domainObject.getPatient()) );
		// LinkedAppointments
		ims.scheduling.vo.Booking_AppointmentRefVoCollection LinkedAppointments = new ims.scheduling.vo.Booking_AppointmentRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getLinkedAppointments().iterator(); iterator.hasNext(); ) 
		{
			ims.scheduling.domain.objects.Booking_Appointment tmp = (ims.scheduling.domain.objects.Booking_Appointment)iterator.next();
			if (tmp != null)
				LinkedAppointments.add(new ims.scheduling.vo.Booking_AppointmentRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setLinkedAppointments(LinkedAppointments);
		// isDisplaced
		valueObject.setIsDisplaced( domainObject.isIsDisplaced() );
		// ServiceFunction
		valueObject.setServiceFunction(ims.core.vo.domain.ServiceFunctionVoAssembler.create(map, domainObject.getServiceFunction()) );
		// RTTBreachKPIDate
		java.util.Date RTTBreachKPIDate = domainObject.getRTTBreachKPIDate();
		if ( null != RTTBreachKPIDate ) 
		{
			valueObject.setRTTBreachKPIDate(new ims.framework.utils.Date(RTTBreachKPIDate) );
		}
		// isCABBooking
		valueObject.setIsCABBooking( domainObject.isIsCABBooking() );
		// CurrentStatusRecord
		valueObject.setCurrentStatusRecord(ims.scheduling.vo.domain.AppointmentStatusForDisplacedApptsVoAssembler.create(map, domainObject.getCurrentStatusRecord()) );
		// SessionSlot
		valueObject.setSessionSlot(ims.scheduling.vo.domain.SessionSlotForDisplacedAppointmentsVoAssembler.create(map, domainObject.getSessionSlot()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.scheduling.domain.objects.Booking_Appointment extractBooking_Appointment(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.BookingAppointmentForDisplacedAppointmentVo valueObject) 
	{
		return 	extractBooking_Appointment(domainFactory, valueObject, new HashMap());
	}

	public static ims.scheduling.domain.objects.Booking_Appointment extractBooking_Appointment(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.BookingAppointmentForDisplacedAppointmentVo valueObject, HashMap domMap) 
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
			// ims.scheduling.vo.BookingAppointmentForDisplacedAppointmentVo ID_Booking_Appointment field is unknown
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
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Activity value4 = null;
		if ( null != valueObject.getActivity() ) 
		{
			if (valueObject.getActivity().getBoId() == null)
			{
				if (domMap.get(valueObject.getActivity()) != null)
				{
					value4 = (ims.core.resource.place.domain.objects.Activity)domMap.get(valueObject.getActivity());
				}
			}
			else
			{
				value4 = (ims.core.resource.place.domain.objects.Activity)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Activity.class, valueObject.getActivity().getBoId());
			}
		}
		domainObject.setActivity(value4);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.patient.domain.objects.Patient value5 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value5 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else
			{
				value5 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value5);

		ims.scheduling.vo.Booking_AppointmentRefVoCollection refCollection6 = valueObject.getLinkedAppointments();
		int size6 = (null == refCollection6) ? 0 : refCollection6.size();		
		java.util.Set domainLinkedAppointments6 = domainObject.getLinkedAppointments();
		if (domainLinkedAppointments6 == null)
		{
			domainLinkedAppointments6 = new java.util.HashSet();
		}
		java.util.Set newSet6  = new java.util.HashSet();
		for(int i=0; i<size6; i++) 
		{
			ims.scheduling.vo.Booking_AppointmentRefVo vo = refCollection6.get(i);					
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
			if (!domainLinkedAppointments6.contains(dom))
			{
				domainLinkedAppointments6.add(dom);
			}
			newSet6.add(dom);			
		}
		java.util.Set removedSet6 = new java.util.HashSet();
		java.util.Iterator iter6 = domainLinkedAppointments6.iterator();
		//Find out which objects need to be removed
		while (iter6.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter6.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet6.contains(o))
			{
				removedSet6.add(o);
			}
		}
		iter6 = removedSet6.iterator();
		//Remove the unwanted objects
		while (iter6.hasNext())
		{
			domainLinkedAppointments6.remove(iter6.next());
		}		
		
		domainObject.setLinkedAppointments(domainLinkedAppointments6);		
		domainObject.setIsDisplaced(valueObject.getIsDisplaced());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.ServiceFunction value8 = null;
		if ( null != valueObject.getServiceFunction() ) 
		{
			if (valueObject.getServiceFunction().getBoId() == null)
			{
				if (domMap.get(valueObject.getServiceFunction()) != null)
				{
					value8 = (ims.core.clinical.domain.objects.ServiceFunction)domMap.get(valueObject.getServiceFunction());
				}
			}
			else
			{
				value8 = (ims.core.clinical.domain.objects.ServiceFunction)domainFactory.getDomainObject(ims.core.clinical.domain.objects.ServiceFunction.class, valueObject.getServiceFunction().getBoId());
			}
		}
		domainObject.setServiceFunction(value8);
		java.util.Date value9 = null;
		ims.framework.utils.Date date9 = valueObject.getRTTBreachKPIDate();		
		if ( date9 != null ) 
		{
			value9 = date9.getDate();
		}
		domainObject.setRTTBreachKPIDate(value9);
		domainObject.setIsCABBooking(valueObject.getIsCABBooking());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.scheduling.domain.objects.Appointment_Status value11 = null;
		if ( null != valueObject.getCurrentStatusRecord() ) 
		{
			if (valueObject.getCurrentStatusRecord().getBoId() == null)
			{
				if (domMap.get(valueObject.getCurrentStatusRecord()) != null)
				{
					value11 = (ims.scheduling.domain.objects.Appointment_Status)domMap.get(valueObject.getCurrentStatusRecord());
				}
			}
			else
			{
				value11 = (ims.scheduling.domain.objects.Appointment_Status)domainFactory.getDomainObject(ims.scheduling.domain.objects.Appointment_Status.class, valueObject.getCurrentStatusRecord().getBoId());
			}
		}
		domainObject.setCurrentStatusRecord(value11);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.scheduling.domain.objects.Session_Slot value12 = null;
		if ( null != valueObject.getSessionSlot() ) 
		{
			if (valueObject.getSessionSlot().getBoId() == null)
			{
				if (domMap.get(valueObject.getSessionSlot()) != null)
				{
					value12 = (ims.scheduling.domain.objects.Session_Slot)domMap.get(valueObject.getSessionSlot());
				}
			}
			else
			{
				value12 = (ims.scheduling.domain.objects.Session_Slot)domainFactory.getDomainObject(ims.scheduling.domain.objects.Session_Slot.class, valueObject.getSessionSlot().getBoId());
			}
		}
		domainObject.setSessionSlot(value12);

		return domainObject;
	}

}
