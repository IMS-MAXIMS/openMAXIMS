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
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Bogdan Tofei
 */
public class WardAttenderOutcomeVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.WardAttenderOutcomeVo copy(ims.core.vo.WardAttenderOutcomeVo valueObjectDest, ims.core.vo.WardAttenderOutcomeVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Booking_Appointment(valueObjectSrc.getID_Booking_Appointment());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// SeenBy
		valueObjectDest.setSeenBy(valueObjectSrc.getSeenBy());
		// OutpatientProcedures
		valueObjectDest.setOutpatientProcedures(valueObjectSrc.getOutpatientProcedures());
		// WardAttendanceHcpType
		valueObjectDest.setWardAttendanceHcpType(valueObjectSrc.getWardAttendanceHcpType());
		// WardAttendanceOutcome
		valueObjectDest.setWardAttendanceOutcome(valueObjectSrc.getWardAttendanceOutcome());
		// WardAttendanceOutcomeComment
		valueObjectDest.setWardAttendanceOutcomeComment(valueObjectSrc.getWardAttendanceOutcomeComment());
		// ApptStatus
		valueObjectDest.setApptStatus(valueObjectSrc.getApptStatus());
		// Session
		valueObjectDest.setSession(valueObjectSrc.getSession());
		// AppointmentDate
		valueObjectDest.setAppointmentDate(valueObjectSrc.getAppointmentDate());
		// SeenTime
		valueObjectDest.setSeenTime(valueObjectSrc.getSeenTime());
		// ApptStatusHistory
		valueObjectDest.setApptStatusHistory(valueObjectSrc.getApptStatusHistory());
		// ApptTrackingStatusHistory
		valueObjectDest.setApptTrackingStatusHistory(valueObjectSrc.getApptTrackingStatusHistory());
		// ApptStartTime
		valueObjectDest.setApptStartTime(valueObjectSrc.getApptStartTime());
		// CurrentStatusRecord
		valueObjectDest.setCurrentStatusRecord(valueObjectSrc.getCurrentStatusRecord());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createWardAttenderOutcomeVoCollectionFromBooking_Appointment(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.Booking_Appointment objects.
	 */
	public static ims.core.vo.WardAttenderOutcomeVoCollection createWardAttenderOutcomeVoCollectionFromBooking_Appointment(java.util.Set domainObjectSet)	
	{
		return createWardAttenderOutcomeVoCollectionFromBooking_Appointment(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.Booking_Appointment objects.
	 */
	public static ims.core.vo.WardAttenderOutcomeVoCollection createWardAttenderOutcomeVoCollectionFromBooking_Appointment(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.WardAttenderOutcomeVoCollection voList = new ims.core.vo.WardAttenderOutcomeVoCollection();
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
			ims.core.vo.WardAttenderOutcomeVo vo = create(map, domainObject);
			
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
	public static ims.core.vo.WardAttenderOutcomeVoCollection createWardAttenderOutcomeVoCollectionFromBooking_Appointment(java.util.List domainObjectList) 
	{
		return createWardAttenderOutcomeVoCollectionFromBooking_Appointment(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.scheduling.domain.objects.Booking_Appointment objects.
	 */
	public static ims.core.vo.WardAttenderOutcomeVoCollection createWardAttenderOutcomeVoCollectionFromBooking_Appointment(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.WardAttenderOutcomeVoCollection voList = new ims.core.vo.WardAttenderOutcomeVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.scheduling.domain.objects.Booking_Appointment domainObject = (ims.scheduling.domain.objects.Booking_Appointment) domainObjectList.get(i);
			ims.core.vo.WardAttenderOutcomeVo vo = create(map, domainObject);

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
	 public static java.util.Set extractBooking_AppointmentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.WardAttenderOutcomeVoCollection voCollection) 
	 {
	 	return extractBooking_AppointmentSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractBooking_AppointmentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.WardAttenderOutcomeVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.WardAttenderOutcomeVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.Booking_Appointment domainObject = WardAttenderOutcomeVoAssembler.extractBooking_Appointment(domainFactory, vo, domMap);

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
	 public static java.util.List extractBooking_AppointmentList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.WardAttenderOutcomeVoCollection voCollection) 
	 {
	 	return extractBooking_AppointmentList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractBooking_AppointmentList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.WardAttenderOutcomeVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.WardAttenderOutcomeVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.Booking_Appointment domainObject = WardAttenderOutcomeVoAssembler.extractBooking_Appointment(domainFactory, vo, domMap);

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
	 public static ims.core.vo.WardAttenderOutcomeVo create(ims.scheduling.domain.objects.Booking_Appointment domainObject) 
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
	  public static ims.core.vo.WardAttenderOutcomeVo create(DomainObjectMap map, ims.scheduling.domain.objects.Booking_Appointment domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.WardAttenderOutcomeVo valueObject = (ims.core.vo.WardAttenderOutcomeVo) map.getValueObject(domainObject, ims.core.vo.WardAttenderOutcomeVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.WardAttenderOutcomeVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.core.vo.WardAttenderOutcomeVo insert(ims.core.vo.WardAttenderOutcomeVo valueObject, ims.scheduling.domain.objects.Booking_Appointment domainObject) 
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
	 public static ims.core.vo.WardAttenderOutcomeVo insert(DomainObjectMap map, ims.core.vo.WardAttenderOutcomeVo valueObject, ims.scheduling.domain.objects.Booking_Appointment domainObject) 
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
			
		// SeenBy
		valueObject.setSeenBy(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getSeenBy()) );
		// OutpatientProcedures
		valueObject.setOutpatientProcedures(ims.RefMan.vo.domain.PatientProcedureForAppointmentOutcomeVoAssembler.createPatientProcedureForAppointmentOutcomeVoCollectionFromPatientProcedure(map, domainObject.getOutpatientProcedures()) );
		// WardAttendanceHcpType
		ims.domain.lookups.LookupInstance instance3 = domainObject.getWardAttendanceHcpType();
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

			ims.core.vo.lookups.HcpDisType voLookup3 = new ims.core.vo.lookups.HcpDisType(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.HcpDisType parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.core.vo.lookups.HcpDisType(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setWardAttendanceHcpType(voLookup3);
		}
				// WardAttendanceOutcome
		ims.domain.lookups.LookupInstance instance4 = domainObject.getWardAttendanceOutcome();
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

			ims.core.vo.lookups.WardAttendanceOutcome voLookup4 = new ims.core.vo.lookups.WardAttendanceOutcome(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.WardAttendanceOutcome parentVoLookup4 = voLookup4;
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
								parentVoLookup4.setParent(new ims.core.vo.lookups.WardAttendanceOutcome(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setWardAttendanceOutcome(voLookup4);
		}
				// WardAttendanceOutcomeComment
		valueObject.setWardAttendanceOutcomeComment(domainObject.getWardAttendanceOutcomeComment());
		// ApptStatus
		ims.domain.lookups.LookupInstance instance6 = domainObject.getApptStatus();
		if ( null != instance6 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance6.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance6.getImage().getImageId(), instance6.getImage().getImagePath());
			}
			color = instance6.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.Status_Reason voLookup6 = new ims.scheduling.vo.lookups.Status_Reason(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.scheduling.vo.lookups.Status_Reason parentVoLookup6 = voLookup6;
			ims.domain.lookups.LookupInstance parent6 = instance6.getParent();
			while (parent6 != null)
			{
				if (parent6.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent6.getImage().getImageId(), parent6.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent6.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup6.setParent(new ims.scheduling.vo.lookups.Status_Reason(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setApptStatus(voLookup6);
		}
				// Session
		valueObject.setSession(ims.RefMan.vo.domain.SessionForAppointmentOutcomeVoAssembler.create(map, domainObject.getSession()) );
		// AppointmentDate
		java.util.Date AppointmentDate = domainObject.getAppointmentDate();
		if ( null != AppointmentDate ) 
		{
			valueObject.setAppointmentDate(new ims.framework.utils.Date(AppointmentDate) );
		}
		// SeenTime
		String SeenTime = domainObject.getSeenTime();
		if ( null != SeenTime ) 
		{
			valueObject.setSeenTime(new ims.framework.utils.Time(SeenTime) );
		}
		// ApptStatusHistory
		valueObject.setApptStatusHistory(ims.scheduling.vo.domain.Appointment_StatusVoAssembler.createAppointment_StatusVoCollectionFromAppointment_Status(map, domainObject.getApptStatusHistory()) );
		// ApptTrackingStatusHistory
		valueObject.setApptTrackingStatusHistory(ims.scheduling.vo.domain.Appt_Tracking_Status_HistoryVoAssembler.createAppt_Tracking_Status_HistoryVoCollectionFromAppt_Tracking_Status_History(map, domainObject.getApptTrackingStatusHistory()) );
		// ApptStartTime
		String ApptStartTime = domainObject.getApptStartTime();
		if ( null != ApptStartTime ) 
		{
			valueObject.setApptStartTime(new ims.framework.utils.Time(ApptStartTime) );
		}
		// CurrentStatusRecord
		valueObject.setCurrentStatusRecord(ims.scheduling.vo.domain.Appointment_StatusVoAssembler.create(map, domainObject.getCurrentStatusRecord()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.scheduling.domain.objects.Booking_Appointment extractBooking_Appointment(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.WardAttenderOutcomeVo valueObject) 
	{
		return 	extractBooking_Appointment(domainFactory, valueObject, new HashMap());
	}

	public static ims.scheduling.domain.objects.Booking_Appointment extractBooking_Appointment(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.WardAttenderOutcomeVo valueObject, HashMap domMap) 
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
			// ims.core.vo.WardAttenderOutcomeVo ID_Booking_Appointment field is unknown
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

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value1 = null;
		if ( null != valueObject.getSeenBy() ) 
		{
			if (valueObject.getSeenBy().getBoId() == null)
			{
				if (domMap.get(valueObject.getSeenBy()) != null)
				{
					value1 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getSeenBy());
				}
			}
			else
			{
				value1 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getSeenBy().getBoId());
			}
		}
		domainObject.setSeenBy(value1);
		domainObject.setOutpatientProcedures(ims.RefMan.vo.domain.PatientProcedureForAppointmentOutcomeVoAssembler.extractPatientProcedureSet(domainFactory, valueObject.getOutpatientProcedures(), domainObject.getOutpatientProcedures(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getWardAttendanceHcpType() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getWardAttendanceHcpType().getID());
		}
		domainObject.setWardAttendanceHcpType(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getWardAttendanceOutcome() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getWardAttendanceOutcome().getID());
		}
		domainObject.setWardAttendanceOutcome(value4);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getWardAttendanceOutcomeComment() != null && valueObject.getWardAttendanceOutcomeComment().equals(""))
		{
			valueObject.setWardAttendanceOutcomeComment(null);
		}
		domainObject.setWardAttendanceOutcomeComment(valueObject.getWardAttendanceOutcomeComment());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getApptStatus() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getApptStatus().getID());
		}
		domainObject.setApptStatus(value6);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.scheduling.domain.objects.Sch_Session value7 = null;
		if ( null != valueObject.getSession() ) 
		{
			if (valueObject.getSession().getBoId() == null)
			{
				if (domMap.get(valueObject.getSession()) != null)
				{
					value7 = (ims.scheduling.domain.objects.Sch_Session)domMap.get(valueObject.getSession());
				}
			}
			else
			{
				value7 = (ims.scheduling.domain.objects.Sch_Session)domainFactory.getDomainObject(ims.scheduling.domain.objects.Sch_Session.class, valueObject.getSession().getBoId());
			}
		}
		domainObject.setSession(value7);
		java.util.Date value8 = null;
		ims.framework.utils.Date date8 = valueObject.getAppointmentDate();		
		if ( date8 != null ) 
		{
			value8 = date8.getDate();
		}
		domainObject.setAppointmentDate(value8);
		ims.framework.utils.Time time9 = valueObject.getSeenTime();
		String value9 = null;
		if ( time9 != null ) 
		{
			value9 = time9.toString();
		}
		domainObject.setSeenTime(value9);
		domainObject.setApptStatusHistory(ims.scheduling.vo.domain.Appointment_StatusVoAssembler.extractAppointment_StatusSet(domainFactory, valueObject.getApptStatusHistory(), domainObject.getApptStatusHistory(), domMap));		
		domainObject.setApptTrackingStatusHistory(ims.scheduling.vo.domain.Appt_Tracking_Status_HistoryVoAssembler.extractAppt_Tracking_Status_HistoryList(domainFactory, valueObject.getApptTrackingStatusHistory(), domainObject.getApptTrackingStatusHistory(), domMap));		
		ims.framework.utils.Time time12 = valueObject.getApptStartTime();
		String value12 = null;
		if ( time12 != null ) 
		{
			value12 = time12.toString();
		}
		domainObject.setApptStartTime(value12);
		domainObject.setCurrentStatusRecord(ims.scheduling.vo.domain.Appointment_StatusVoAssembler.extractAppointment_Status(domainFactory, valueObject.getCurrentStatusRecord(), domMap));

		return domainObject;
	}

}
