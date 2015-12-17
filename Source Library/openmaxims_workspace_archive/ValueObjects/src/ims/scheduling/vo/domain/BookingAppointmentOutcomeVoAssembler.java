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
		// ApptStatus
		valueObjectDest.setApptStatus(valueObjectSrc.getApptStatus());
		// Outcome
		valueObjectDest.setOutcome(valueObjectSrc.getOutcome());
		// OutcomeComments
		valueObjectDest.setOutcomeComments(valueObjectSrc.getOutcomeComments());
		// HasElectiveList
		valueObjectDest.setHasElectiveList(valueObjectSrc.getHasElectiveList());
		// AppointmentDate
		valueObjectDest.setAppointmentDate(valueObjectSrc.getAppointmentDate());
		// SeenBy
		valueObjectDest.setSeenBy(valueObjectSrc.getSeenBy());
		// OutpatientProcedures
		valueObjectDest.setOutpatientProcedures(valueObjectSrc.getOutpatientProcedures());
		// OutpatientDiagnoses
		valueObjectDest.setOutpatientDiagnoses(valueObjectSrc.getOutpatientDiagnoses());
		// Session
		valueObjectDest.setSession(valueObjectSrc.getSession());
		// OutcomeReason
		valueObjectDest.setOutcomeReason(valueObjectSrc.getOutcomeReason());
		// wasFirstDefinitiveTreatment
		valueObjectDest.setWasFirstDefinitiveTreatment(valueObjectSrc.getWasFirstDefinitiveTreatment());
		// OutcomeActions
		valueObjectDest.setOutcomeActions(valueObjectSrc.getOutcomeActions());
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
				// Outcome
		ims.domain.lookups.LookupInstance instance2 = domainObject.getOutcome();
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

			ims.scheduling.vo.lookups.ApptOutcome voLookup2 = new ims.scheduling.vo.lookups.ApptOutcome(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.scheduling.vo.lookups.ApptOutcome parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.scheduling.vo.lookups.ApptOutcome(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setOutcome(voLookup2);
		}
				// OutcomeComments
		valueObject.setOutcomeComments(domainObject.getOutcomeComments());
		// HasElectiveList
		valueObject.setHasElectiveList( domainObject.isHasElectiveList() );
		// AppointmentDate
		java.util.Date AppointmentDate = domainObject.getAppointmentDate();
		if ( null != AppointmentDate ) 
		{
			valueObject.setAppointmentDate(new ims.framework.utils.Date(AppointmentDate) );
		}
		// SeenBy
		valueObject.setSeenBy(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getSeenBy()) );
		// OutpatientProcedures
		valueObject.setOutpatientProcedures(ims.RefMan.vo.domain.PatientProcedureForAppointmentOutcomeVoAssembler.createPatientProcedureForAppointmentOutcomeVoCollectionFromPatientProcedure(map, domainObject.getOutpatientProcedures()) );
		// OutpatientDiagnoses
		valueObject.setOutpatientDiagnoses(ims.clinical.vo.domain.PatientDiagnosisOpNotesVoAssembler.createPatientDiagnosisOpNotesVoCollectionFromPatientDiagnosis(map, domainObject.getOutpatientDiagnoses()) );
		// Session
		valueObject.setSession(ims.RefMan.vo.domain.SessionForAppointmentOutcomeVoAssembler.create(map, domainObject.getSession()) );
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
				// wasFirstDefinitiveTreatment
		valueObject.setWasFirstDefinitiveTreatment( domainObject.isWasFirstDefinitiveTreatment() );
		// OutcomeActions
		valueObject.setOutcomeActions(ims.scheduling.vo.domain.AppointmentOutcomeActionVoAssembler.createAppointmentOutcomeActionVoCollectionFromAppointmentOutcomeAction(map, domainObject.getOutcomeActions()) );
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
		if ( null != valueObject.getOutcome() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getOutcome().getID());
		}
		domainObject.setOutcome(value2);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getOutcomeComments() != null && valueObject.getOutcomeComments().equals(""))
		{
			valueObject.setOutcomeComments(null);
		}
		domainObject.setOutcomeComments(valueObject.getOutcomeComments());
		domainObject.setHasElectiveList(valueObject.getHasElectiveList());
		java.util.Date value5 = null;
		ims.framework.utils.Date date5 = valueObject.getAppointmentDate();		
		if ( date5 != null ) 
		{
			value5 = date5.getDate();
		}
		domainObject.setAppointmentDate(value5);
	// SaveAsRefVO - treated as a refVo in extract methods
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
			else
			{
				value6 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getSeenBy().getBoId());
			}
		}
		domainObject.setSeenBy(value6);
		domainObject.setOutpatientProcedures(ims.RefMan.vo.domain.PatientProcedureForAppointmentOutcomeVoAssembler.extractPatientProcedureSet(domainFactory, valueObject.getOutpatientProcedures(), domainObject.getOutpatientProcedures(), domMap));		
		domainObject.setOutpatientDiagnoses(ims.clinical.vo.domain.PatientDiagnosisOpNotesVoAssembler.extractPatientDiagnosisSet(domainFactory, valueObject.getOutpatientDiagnoses(), domainObject.getOutpatientDiagnoses(), domMap));		
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.scheduling.domain.objects.Sch_Session value9 = null;
		if ( null != valueObject.getSession() ) 
		{
			if (valueObject.getSession().getBoId() == null)
			{
				if (domMap.get(valueObject.getSession()) != null)
				{
					value9 = (ims.scheduling.domain.objects.Sch_Session)domMap.get(valueObject.getSession());
				}
			}
			else
			{
				value9 = (ims.scheduling.domain.objects.Sch_Session)domainFactory.getDomainObject(ims.scheduling.domain.objects.Sch_Session.class, valueObject.getSession().getBoId());
			}
		}
		domainObject.setSession(value9);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value10 = null;
		if ( null != valueObject.getOutcomeReason() ) 
		{
			value10 =
				domainFactory.getLookupInstance(valueObject.getOutcomeReason().getID());
		}
		domainObject.setOutcomeReason(value10);
		domainObject.setWasFirstDefinitiveTreatment(valueObject.getWasFirstDefinitiveTreatment());
		domainObject.setOutcomeActions(ims.scheduling.vo.domain.AppointmentOutcomeActionVoAssembler.extractAppointmentOutcomeActionList(domainFactory, valueObject.getOutcomeActions(), domainObject.getOutcomeActions(), domMap));		

		return domainObject;
	}

}
