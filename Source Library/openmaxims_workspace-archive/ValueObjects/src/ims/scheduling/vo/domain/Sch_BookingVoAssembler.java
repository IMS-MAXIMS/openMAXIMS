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
public class Sch_BookingVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.scheduling.vo.Sch_BookingVo copy(ims.scheduling.vo.Sch_BookingVo valueObjectDest, ims.scheduling.vo.Sch_BookingVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Sch_Booking(valueObjectSrc.getID_Sch_Booking());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// BookingComments
		valueObjectDest.setBookingComments(valueObjectSrc.getBookingComments());
		// UBRN
		valueObjectDest.setUBRN(valueObjectSrc.getUBRN());
		// ReferrerSdsId
		valueObjectDest.setReferrerSdsId(valueObjectSrc.getReferrerSdsId());
		// ReferrerSdsRoleId
		valueObjectDest.setReferrerSdsRoleId(valueObjectSrc.getReferrerSdsRoleId());
		// ReferrerSdsOrgId
		valueObjectDest.setReferrerSdsOrgId(valueObjectSrc.getReferrerSdsOrgId());
		// Appointments
		valueObjectDest.setAppointments(valueObjectSrc.getAppointments());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createSch_BookingVoCollectionFromSch_Booking(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.Sch_Booking objects.
	 */
	public static ims.scheduling.vo.Sch_BookingVoCollection createSch_BookingVoCollectionFromSch_Booking(java.util.Set domainObjectSet)	
	{
		return createSch_BookingVoCollectionFromSch_Booking(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.Sch_Booking objects.
	 */
	public static ims.scheduling.vo.Sch_BookingVoCollection createSch_BookingVoCollectionFromSch_Booking(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.scheduling.vo.Sch_BookingVoCollection voList = new ims.scheduling.vo.Sch_BookingVoCollection();
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
			ims.scheduling.vo.Sch_BookingVo vo = create(map, domainObject);
			
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
	public static ims.scheduling.vo.Sch_BookingVoCollection createSch_BookingVoCollectionFromSch_Booking(java.util.List domainObjectList) 
	{
		return createSch_BookingVoCollectionFromSch_Booking(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.scheduling.domain.objects.Sch_Booking objects.
	 */
	public static ims.scheduling.vo.Sch_BookingVoCollection createSch_BookingVoCollectionFromSch_Booking(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.scheduling.vo.Sch_BookingVoCollection voList = new ims.scheduling.vo.Sch_BookingVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.scheduling.domain.objects.Sch_Booking domainObject = (ims.scheduling.domain.objects.Sch_Booking) domainObjectList.get(i);
			ims.scheduling.vo.Sch_BookingVo vo = create(map, domainObject);

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
	 public static java.util.Set extractSch_BookingSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.Sch_BookingVoCollection voCollection) 
	 {
	 	return extractSch_BookingSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractSch_BookingSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.Sch_BookingVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.Sch_BookingVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.Sch_Booking domainObject = Sch_BookingVoAssembler.extractSch_Booking(domainFactory, vo, domMap);

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
	 public static java.util.List extractSch_BookingList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.Sch_BookingVoCollection voCollection) 
	 {
	 	return extractSch_BookingList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractSch_BookingList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.Sch_BookingVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.Sch_BookingVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.Sch_Booking domainObject = Sch_BookingVoAssembler.extractSch_Booking(domainFactory, vo, domMap);

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
	 public static ims.scheduling.vo.Sch_BookingVo create(ims.scheduling.domain.objects.Sch_Booking domainObject) 
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
	  public static ims.scheduling.vo.Sch_BookingVo create(DomainObjectMap map, ims.scheduling.domain.objects.Sch_Booking domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.scheduling.vo.Sch_BookingVo valueObject = (ims.scheduling.vo.Sch_BookingVo) map.getValueObject(domainObject, ims.scheduling.vo.Sch_BookingVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.scheduling.vo.Sch_BookingVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.scheduling.vo.Sch_BookingVo insert(ims.scheduling.vo.Sch_BookingVo valueObject, ims.scheduling.domain.objects.Sch_Booking domainObject) 
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
	 public static ims.scheduling.vo.Sch_BookingVo insert(DomainObjectMap map, ims.scheduling.vo.Sch_BookingVo valueObject, ims.scheduling.domain.objects.Sch_Booking domainObject) 
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
			
		// Patient
		valueObject.setPatient(ims.core.vo.domain.PatientShortAssembler.create(map, domainObject.getPatient()) );
		// BookingComments
		valueObject.setBookingComments(domainObject.getBookingComments());
		// UBRN
		valueObject.setUBRN(domainObject.getUBRN());
		// ReferrerSdsId
		valueObject.setReferrerSdsId(domainObject.getReferrerSdsId());
		// ReferrerSdsRoleId
		valueObject.setReferrerSdsRoleId(domainObject.getReferrerSdsRoleId());
		// ReferrerSdsOrgId
		valueObject.setReferrerSdsOrgId(domainObject.getReferrerSdsOrgId());
		// Appointments
		valueObject.setAppointments(ims.scheduling.vo.domain.Booking_AppointmentVoAssembler.createBooking_AppointmentVoCollectionFromBooking_Appointment(map, domainObject.getAppointments()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.scheduling.domain.objects.Sch_Booking extractSch_Booking(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.Sch_BookingVo valueObject) 
	{
		return 	extractSch_Booking(domainFactory, valueObject, new HashMap());
	}

	public static ims.scheduling.domain.objects.Sch_Booking extractSch_Booking(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.Sch_BookingVo valueObject, HashMap domMap) 
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
			// ims.scheduling.vo.Sch_BookingVo ID_Sch_Booking field is unknown
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

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.patient.domain.objects.Patient value1 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value1 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else
			{
				value1 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value1);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getBookingComments() != null && valueObject.getBookingComments().equals(""))
		{
			valueObject.setBookingComments(null);
		}
		domainObject.setBookingComments(valueObject.getBookingComments());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getUBRN() != null && valueObject.getUBRN().equals(""))
		{
			valueObject.setUBRN(null);
		}
		domainObject.setUBRN(valueObject.getUBRN());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getReferrerSdsId() != null && valueObject.getReferrerSdsId().equals(""))
		{
			valueObject.setReferrerSdsId(null);
		}
		domainObject.setReferrerSdsId(valueObject.getReferrerSdsId());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getReferrerSdsRoleId() != null && valueObject.getReferrerSdsRoleId().equals(""))
		{
			valueObject.setReferrerSdsRoleId(null);
		}
		domainObject.setReferrerSdsRoleId(valueObject.getReferrerSdsRoleId());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getReferrerSdsOrgId() != null && valueObject.getReferrerSdsOrgId().equals(""))
		{
			valueObject.setReferrerSdsOrgId(null);
		}
		domainObject.setReferrerSdsOrgId(valueObject.getReferrerSdsOrgId());
		domainObject.setAppointments(ims.scheduling.vo.domain.Booking_AppointmentVoAssembler.extractBooking_AppointmentSet(domainFactory, valueObject.getAppointments(), domainObject.getAppointments(), domMap));		

		return domainObject;
	}

}
