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
 * @author Florin Blindu
 */
public class Sch_BookingApptForLinkedAppointmentsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.scheduling.vo.Sch_BookingApptForLinkedAppointmentsVo copy(ims.scheduling.vo.Sch_BookingApptForLinkedAppointmentsVo valueObjectDest, ims.scheduling.vo.Sch_BookingApptForLinkedAppointmentsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Sch_Booking(valueObjectSrc.getID_Sch_Booking());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Appointments
		valueObjectDest.setAppointments(valueObjectSrc.getAppointments());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createSch_BookingApptForLinkedAppointmentsVoCollectionFromSch_Booking(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.Sch_Booking objects.
	 */
	public static ims.scheduling.vo.Sch_BookingApptForLinkedAppointmentsVoCollection createSch_BookingApptForLinkedAppointmentsVoCollectionFromSch_Booking(java.util.Set domainObjectSet)	
	{
		return createSch_BookingApptForLinkedAppointmentsVoCollectionFromSch_Booking(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.Sch_Booking objects.
	 */
	public static ims.scheduling.vo.Sch_BookingApptForLinkedAppointmentsVoCollection createSch_BookingApptForLinkedAppointmentsVoCollectionFromSch_Booking(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.scheduling.vo.Sch_BookingApptForLinkedAppointmentsVoCollection voList = new ims.scheduling.vo.Sch_BookingApptForLinkedAppointmentsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.scheduling.domain.objects.Sch_Booking domainObject = (ims.scheduling.domain.objects.Sch_Booking) iterator.next();
			ims.scheduling.vo.Sch_BookingApptForLinkedAppointmentsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.scheduling.domain.objects.Sch_Booking objects.
	 */
	public static ims.scheduling.vo.Sch_BookingApptForLinkedAppointmentsVoCollection createSch_BookingApptForLinkedAppointmentsVoCollectionFromSch_Booking(java.util.List domainObjectList) 
	{
		return createSch_BookingApptForLinkedAppointmentsVoCollectionFromSch_Booking(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.scheduling.domain.objects.Sch_Booking objects.
	 */
	public static ims.scheduling.vo.Sch_BookingApptForLinkedAppointmentsVoCollection createSch_BookingApptForLinkedAppointmentsVoCollectionFromSch_Booking(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.scheduling.vo.Sch_BookingApptForLinkedAppointmentsVoCollection voList = new ims.scheduling.vo.Sch_BookingApptForLinkedAppointmentsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.scheduling.domain.objects.Sch_Booking domainObject = (ims.scheduling.domain.objects.Sch_Booking) domainObjectList.get(i);
			ims.scheduling.vo.Sch_BookingApptForLinkedAppointmentsVo vo = create(map, domainObject);

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
	 * Create the ims.scheduling.domain.objects.Sch_Booking set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractSch_BookingSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.Sch_BookingApptForLinkedAppointmentsVoCollection voCollection) 
	 {
	 	return extractSch_BookingSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractSch_BookingSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.Sch_BookingApptForLinkedAppointmentsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.Sch_BookingApptForLinkedAppointmentsVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.Sch_Booking domainObject = Sch_BookingApptForLinkedAppointmentsVoAssembler.extractSch_Booking(domainFactory, vo, domMap);

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
	 * Create the ims.scheduling.domain.objects.Sch_Booking list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractSch_BookingList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.Sch_BookingApptForLinkedAppointmentsVoCollection voCollection) 
	 {
	 	return extractSch_BookingList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractSch_BookingList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.Sch_BookingApptForLinkedAppointmentsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.Sch_BookingApptForLinkedAppointmentsVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.Sch_Booking domainObject = Sch_BookingApptForLinkedAppointmentsVoAssembler.extractSch_Booking(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.scheduling.domain.objects.Sch_Booking object.
	 * @param domainObject ims.scheduling.domain.objects.Sch_Booking
	 */
	 public static ims.scheduling.vo.Sch_BookingApptForLinkedAppointmentsVo create(ims.scheduling.domain.objects.Sch_Booking domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.scheduling.domain.objects.Sch_Booking object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.scheduling.vo.Sch_BookingApptForLinkedAppointmentsVo create(DomainObjectMap map, ims.scheduling.domain.objects.Sch_Booking domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.scheduling.vo.Sch_BookingApptForLinkedAppointmentsVo valueObject = (ims.scheduling.vo.Sch_BookingApptForLinkedAppointmentsVo) map.getValueObject(domainObject, ims.scheduling.vo.Sch_BookingApptForLinkedAppointmentsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.scheduling.vo.Sch_BookingApptForLinkedAppointmentsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.scheduling.domain.objects.Sch_Booking
	 */
	 public static ims.scheduling.vo.Sch_BookingApptForLinkedAppointmentsVo insert(ims.scheduling.vo.Sch_BookingApptForLinkedAppointmentsVo valueObject, ims.scheduling.domain.objects.Sch_Booking domainObject) 
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
	 * @param domainObject ims.scheduling.domain.objects.Sch_Booking
	 */
	 public static ims.scheduling.vo.Sch_BookingApptForLinkedAppointmentsVo insert(DomainObjectMap map, ims.scheduling.vo.Sch_BookingApptForLinkedAppointmentsVo valueObject, ims.scheduling.domain.objects.Sch_Booking domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Sch_Booking(domainObject.getId());
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
			
		// Appointments
		valueObject.setAppointments(ims.scheduling.vo.domain.BookingAppointmentForLinkedAppointmentsVoAssembler.createBookingAppointmentForLinkedAppointmentsVoCollectionFromBooking_Appointment(map, domainObject.getAppointments()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.scheduling.domain.objects.Sch_Booking extractSch_Booking(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.Sch_BookingApptForLinkedAppointmentsVo valueObject) 
	{
		return 	extractSch_Booking(domainFactory, valueObject, new HashMap());
	}

	public static ims.scheduling.domain.objects.Sch_Booking extractSch_Booking(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.Sch_BookingApptForLinkedAppointmentsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Sch_Booking();
		ims.scheduling.domain.objects.Sch_Booking domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.scheduling.domain.objects.Sch_Booking)domMap.get(valueObject);
			}
			// ims.scheduling.vo.Sch_BookingApptForLinkedAppointmentsVo ID_Sch_Booking field is unknown
			domainObject = new ims.scheduling.domain.objects.Sch_Booking();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Sch_Booking());
			if (domMap.get(key) != null)
			{
				return (ims.scheduling.domain.objects.Sch_Booking)domMap.get(key);
			}
			domainObject = (ims.scheduling.domain.objects.Sch_Booking) domainFactory.getDomainObject(ims.scheduling.domain.objects.Sch_Booking.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Sch_Booking());


		// SaveAsRefVO treated as RefValueObject
		ims.scheduling.vo.Booking_AppointmentRefVoCollection refCollection1 = new ims.scheduling.vo.Booking_AppointmentRefVoCollection();
		if (valueObject.getAppointments() != null)
		{
			for (int i1=0; i1<valueObject.getAppointments().size(); i1++)
			{
				ims.scheduling.vo.Booking_AppointmentRefVo ref1 = (ims.scheduling.vo.Booking_AppointmentRefVo)valueObject.getAppointments().get(i1);
				refCollection1.add(ref1);
			}
		}
		int size1 = (null == refCollection1) ? 0 : refCollection1.size();		
		java.util.Set domainAppointments1 = domainObject.getAppointments();
		if (domainAppointments1 == null)
		{
			domainAppointments1 = new java.util.HashSet();
		}
		java.util.Set newSet1  = new java.util.HashSet();
		for(int i=0; i<size1; i++) 
		{
			ims.scheduling.vo.Booking_AppointmentRefVo vo = refCollection1.get(i);					
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
			if (!domainAppointments1.contains(dom))
			{
				domainAppointments1.add(dom);
			}
			newSet1.add(dom);			
		}
		java.util.Set removedSet1 = new java.util.HashSet();
		java.util.Iterator iter1 = domainAppointments1.iterator();
		//Find out which objects need to be removed
		while (iter1.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter1.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet1.contains(o))
			{
				removedSet1.add(o);
			}
		}
		iter1 = removedSet1.iterator();
		//Remove the unwanted objects
		while (iter1.hasNext())
		{
			domainAppointments1.remove(iter1.next());
		}		
		
		domainObject.setAppointments(domainAppointments1);		

		return domainObject;
	}

}
