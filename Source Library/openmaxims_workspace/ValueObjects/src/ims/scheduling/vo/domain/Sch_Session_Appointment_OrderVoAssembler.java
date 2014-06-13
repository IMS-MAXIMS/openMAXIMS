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
public class Sch_Session_Appointment_OrderVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.scheduling.vo.Sch_Session_Appointment_OrderVo copy(ims.scheduling.vo.Sch_Session_Appointment_OrderVo valueObjectDest, ims.scheduling.vo.Sch_Session_Appointment_OrderVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Sch_Session_Appointment_Order(valueObjectSrc.getID_Sch_Session_Appointment_Order());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Session
		valueObjectDest.setSession(valueObjectSrc.getSession());
		// Appointments
		valueObjectDest.setAppointments(valueObjectSrc.getAppointments());
		// isFinalised
		valueObjectDest.setIsFinalised(valueObjectSrc.getIsFinalised());
		// FinalisedBy
		valueObjectDest.setFinalisedBy(valueObjectSrc.getFinalisedBy());
		// FinalisedDateTime
		valueObjectDest.setFinalisedDateTime(valueObjectSrc.getFinalisedDateTime());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createSch_Session_Appointment_OrderVoCollectionFromSch_Session_Appointment_Order(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.Sch_Session_Appointment_Order objects.
	 */
	public static ims.scheduling.vo.Sch_Session_Appointment_OrderVoCollection createSch_Session_Appointment_OrderVoCollectionFromSch_Session_Appointment_Order(java.util.Set domainObjectSet)	
	{
		return createSch_Session_Appointment_OrderVoCollectionFromSch_Session_Appointment_Order(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.Sch_Session_Appointment_Order objects.
	 */
	public static ims.scheduling.vo.Sch_Session_Appointment_OrderVoCollection createSch_Session_Appointment_OrderVoCollectionFromSch_Session_Appointment_Order(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.scheduling.vo.Sch_Session_Appointment_OrderVoCollection voList = new ims.scheduling.vo.Sch_Session_Appointment_OrderVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.scheduling.domain.objects.Sch_Session_Appointment_Order domainObject = (ims.scheduling.domain.objects.Sch_Session_Appointment_Order) iterator.next();
			ims.scheduling.vo.Sch_Session_Appointment_OrderVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.scheduling.domain.objects.Sch_Session_Appointment_Order objects.
	 */
	public static ims.scheduling.vo.Sch_Session_Appointment_OrderVoCollection createSch_Session_Appointment_OrderVoCollectionFromSch_Session_Appointment_Order(java.util.List domainObjectList) 
	{
		return createSch_Session_Appointment_OrderVoCollectionFromSch_Session_Appointment_Order(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.scheduling.domain.objects.Sch_Session_Appointment_Order objects.
	 */
	public static ims.scheduling.vo.Sch_Session_Appointment_OrderVoCollection createSch_Session_Appointment_OrderVoCollectionFromSch_Session_Appointment_Order(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.scheduling.vo.Sch_Session_Appointment_OrderVoCollection voList = new ims.scheduling.vo.Sch_Session_Appointment_OrderVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.scheduling.domain.objects.Sch_Session_Appointment_Order domainObject = (ims.scheduling.domain.objects.Sch_Session_Appointment_Order) domainObjectList.get(i);
			ims.scheduling.vo.Sch_Session_Appointment_OrderVo vo = create(map, domainObject);

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
	 * Create the ims.scheduling.domain.objects.Sch_Session_Appointment_Order set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractSch_Session_Appointment_OrderSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.Sch_Session_Appointment_OrderVoCollection voCollection) 
	 {
	 	return extractSch_Session_Appointment_OrderSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractSch_Session_Appointment_OrderSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.Sch_Session_Appointment_OrderVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.Sch_Session_Appointment_OrderVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.Sch_Session_Appointment_Order domainObject = Sch_Session_Appointment_OrderVoAssembler.extractSch_Session_Appointment_Order(domainFactory, vo, domMap);

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
	 * Create the ims.scheduling.domain.objects.Sch_Session_Appointment_Order list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractSch_Session_Appointment_OrderList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.Sch_Session_Appointment_OrderVoCollection voCollection) 
	 {
	 	return extractSch_Session_Appointment_OrderList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractSch_Session_Appointment_OrderList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.Sch_Session_Appointment_OrderVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.Sch_Session_Appointment_OrderVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.Sch_Session_Appointment_Order domainObject = Sch_Session_Appointment_OrderVoAssembler.extractSch_Session_Appointment_Order(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.scheduling.domain.objects.Sch_Session_Appointment_Order object.
	 * @param domainObject ims.scheduling.domain.objects.Sch_Session_Appointment_Order
	 */
	 public static ims.scheduling.vo.Sch_Session_Appointment_OrderVo create(ims.scheduling.domain.objects.Sch_Session_Appointment_Order domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.scheduling.domain.objects.Sch_Session_Appointment_Order object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.scheduling.vo.Sch_Session_Appointment_OrderVo create(DomainObjectMap map, ims.scheduling.domain.objects.Sch_Session_Appointment_Order domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.scheduling.vo.Sch_Session_Appointment_OrderVo valueObject = (ims.scheduling.vo.Sch_Session_Appointment_OrderVo) map.getValueObject(domainObject, ims.scheduling.vo.Sch_Session_Appointment_OrderVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.scheduling.vo.Sch_Session_Appointment_OrderVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.scheduling.domain.objects.Sch_Session_Appointment_Order
	 */
	 public static ims.scheduling.vo.Sch_Session_Appointment_OrderVo insert(ims.scheduling.vo.Sch_Session_Appointment_OrderVo valueObject, ims.scheduling.domain.objects.Sch_Session_Appointment_Order domainObject) 
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
	 * @param domainObject ims.scheduling.domain.objects.Sch_Session_Appointment_Order
	 */
	 public static ims.scheduling.vo.Sch_Session_Appointment_OrderVo insert(DomainObjectMap map, ims.scheduling.vo.Sch_Session_Appointment_OrderVo valueObject, ims.scheduling.domain.objects.Sch_Session_Appointment_Order domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Sch_Session_Appointment_Order(domainObject.getId());
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
			
		// Session
		valueObject.setSession(ims.scheduling.vo.domain.SessionTheatreVoAssembler.create(map, domainObject.getSession()) );
		// Appointments
		valueObject.setAppointments(ims.scheduling.vo.domain.BookingAppointmentTheatreVoAssembler.createBookingAppointmentTheatreVoCollectionFromBooking_Appointment(map, domainObject.getAppointments()) );
		// isFinalised
		valueObject.setIsFinalised( domainObject.isIsFinalised() );
		// FinalisedBy
		valueObject.setFinalisedBy((ims.core.vo.MemberOfStaffLiteVo)ims.core.vo.domain.MemberOfStaffLiteVoAssembler.create(map, domainObject.getFinalisedBy()) );
		// FinalisedDateTime
		java.util.Date FinalisedDateTime = domainObject.getFinalisedDateTime();
		if ( null != FinalisedDateTime ) 
		{
			valueObject.setFinalisedDateTime(new ims.framework.utils.DateTime(FinalisedDateTime) );
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.scheduling.domain.objects.Sch_Session_Appointment_Order extractSch_Session_Appointment_Order(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.Sch_Session_Appointment_OrderVo valueObject) 
	{
		return 	extractSch_Session_Appointment_Order(domainFactory, valueObject, new HashMap());
	}

	public static ims.scheduling.domain.objects.Sch_Session_Appointment_Order extractSch_Session_Appointment_Order(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.Sch_Session_Appointment_OrderVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Sch_Session_Appointment_Order();
		ims.scheduling.domain.objects.Sch_Session_Appointment_Order domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.scheduling.domain.objects.Sch_Session_Appointment_Order)domMap.get(valueObject);
			}
			// ims.scheduling.vo.Sch_Session_Appointment_OrderVo ID_Sch_Session_Appointment_Order field is unknown
			domainObject = new ims.scheduling.domain.objects.Sch_Session_Appointment_Order();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Sch_Session_Appointment_Order());
			if (domMap.get(key) != null)
			{
				return (ims.scheduling.domain.objects.Sch_Session_Appointment_Order)domMap.get(key);
			}
			domainObject = (ims.scheduling.domain.objects.Sch_Session_Appointment_Order) domainFactory.getDomainObject(ims.scheduling.domain.objects.Sch_Session_Appointment_Order.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Sch_Session_Appointment_Order());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.scheduling.domain.objects.Sch_Session value1 = null;
		if ( null != valueObject.getSession() ) 
		{
			if (valueObject.getSession().getBoId() == null)
			{
				if (domMap.get(valueObject.getSession()) != null)
				{
					value1 = (ims.scheduling.domain.objects.Sch_Session)domMap.get(valueObject.getSession());
				}
			}
			else
			{
				value1 = (ims.scheduling.domain.objects.Sch_Session)domainFactory.getDomainObject(ims.scheduling.domain.objects.Sch_Session.class, valueObject.getSession().getBoId());
			}
		}
		domainObject.setSession(value1);
		domainObject.setAppointments(ims.scheduling.vo.domain.BookingAppointmentTheatreVoAssembler.extractBooking_AppointmentList(domainFactory, valueObject.getAppointments(), domainObject.getAppointments(), domMap));		
		domainObject.setIsFinalised(valueObject.getIsFinalised());
		domainObject.setFinalisedBy(ims.core.vo.domain.MemberOfStaffLiteVoAssembler.extractMemberOfStaff(domainFactory, (ims.core.vo.MemberOfStaffLiteVo)valueObject.getFinalisedBy(), domMap));
		ims.framework.utils.DateTime dateTime5 = valueObject.getFinalisedDateTime();
		java.util.Date value5 = null;
		if ( dateTime5 != null ) 
		{
			value5 = dateTime5.getJavaDate();
		}
		domainObject.setFinalisedDateTime(value5);

		return domainObject;
	}

}
