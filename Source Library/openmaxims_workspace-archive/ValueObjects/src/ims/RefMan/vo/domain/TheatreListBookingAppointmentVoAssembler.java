/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated on 16/04/2014, 12:32
 *
 */
package ims.RefMan.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Rory Fitzpatrick
 */
public class TheatreListBookingAppointmentVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.TheatreListBookingAppointmentVo copy(ims.RefMan.vo.TheatreListBookingAppointmentVo valueObjectDest, ims.RefMan.vo.TheatreListBookingAppointmentVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Booking_Appointment(valueObjectSrc.getID_Booking_Appointment());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ApptStartTime
		valueObjectDest.setApptStartTime(valueObjectSrc.getApptStartTime());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// TheatreBooking
		valueObjectDest.setTheatreBooking(valueObjectSrc.getTheatreBooking());
		// ApptStatus
		valueObjectDest.setApptStatus(valueObjectSrc.getApptStatus());
		// Session
		valueObjectDest.setSession(valueObjectSrc.getSession());
		// ApptStatusHistory
		valueObjectDest.setApptStatusHistory(valueObjectSrc.getApptStatusHistory());
		// CurrentStatusRecord
		valueObjectDest.setCurrentStatusRecord(valueObjectSrc.getCurrentStatusRecord());
		// isCABBooking
		valueObjectDest.setIsCABBooking(valueObjectSrc.getIsCABBooking());
		// RequiresRebook
		valueObjectDest.setRequiresRebook(valueObjectSrc.getRequiresRebook());
		// TheatreSlot
		valueObjectDest.setTheatreSlot(valueObjectSrc.getTheatreSlot());
		// IntraOperativeCareRecord
		valueObjectDest.setIntraOperativeCareRecord(valueObjectSrc.getIntraOperativeCareRecord());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createTheatreListBookingAppointmentVoCollectionFromBooking_Appointment(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.Booking_Appointment objects.
	 */
	public static ims.RefMan.vo.TheatreListBookingAppointmentVoCollection createTheatreListBookingAppointmentVoCollectionFromBooking_Appointment(java.util.Set domainObjectSet)	
	{
		return createTheatreListBookingAppointmentVoCollectionFromBooking_Appointment(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.Booking_Appointment objects.
	 */
	public static ims.RefMan.vo.TheatreListBookingAppointmentVoCollection createTheatreListBookingAppointmentVoCollectionFromBooking_Appointment(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.TheatreListBookingAppointmentVoCollection voList = new ims.RefMan.vo.TheatreListBookingAppointmentVoCollection();
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
			ims.RefMan.vo.TheatreListBookingAppointmentVo vo = create(map, domainObject);
			
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
	public static ims.RefMan.vo.TheatreListBookingAppointmentVoCollection createTheatreListBookingAppointmentVoCollectionFromBooking_Appointment(java.util.List domainObjectList) 
	{
		return createTheatreListBookingAppointmentVoCollectionFromBooking_Appointment(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.scheduling.domain.objects.Booking_Appointment objects.
	 */
	public static ims.RefMan.vo.TheatreListBookingAppointmentVoCollection createTheatreListBookingAppointmentVoCollectionFromBooking_Appointment(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.TheatreListBookingAppointmentVoCollection voList = new ims.RefMan.vo.TheatreListBookingAppointmentVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.scheduling.domain.objects.Booking_Appointment domainObject = (ims.scheduling.domain.objects.Booking_Appointment) domainObjectList.get(i);
			ims.RefMan.vo.TheatreListBookingAppointmentVo vo = create(map, domainObject);

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
	 public static java.util.Set extractBooking_AppointmentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.TheatreListBookingAppointmentVoCollection voCollection) 
	 {
	 	return extractBooking_AppointmentSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractBooking_AppointmentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.TheatreListBookingAppointmentVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.TheatreListBookingAppointmentVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.Booking_Appointment domainObject = TheatreListBookingAppointmentVoAssembler.extractBooking_Appointment(domainFactory, vo, domMap);

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
	 public static java.util.List extractBooking_AppointmentList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.TheatreListBookingAppointmentVoCollection voCollection) 
	 {
	 	return extractBooking_AppointmentList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractBooking_AppointmentList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.TheatreListBookingAppointmentVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.TheatreListBookingAppointmentVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.Booking_Appointment domainObject = TheatreListBookingAppointmentVoAssembler.extractBooking_Appointment(domainFactory, vo, domMap);

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
	 public static ims.RefMan.vo.TheatreListBookingAppointmentVo create(ims.scheduling.domain.objects.Booking_Appointment domainObject) 
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
	  public static ims.RefMan.vo.TheatreListBookingAppointmentVo create(DomainObjectMap map, ims.scheduling.domain.objects.Booking_Appointment domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.TheatreListBookingAppointmentVo valueObject = (ims.RefMan.vo.TheatreListBookingAppointmentVo) map.getValueObject(domainObject, ims.RefMan.vo.TheatreListBookingAppointmentVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.TheatreListBookingAppointmentVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.RefMan.vo.TheatreListBookingAppointmentVo insert(ims.RefMan.vo.TheatreListBookingAppointmentVo valueObject, ims.scheduling.domain.objects.Booking_Appointment domainObject) 
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
	 public static ims.RefMan.vo.TheatreListBookingAppointmentVo insert(DomainObjectMap map, ims.RefMan.vo.TheatreListBookingAppointmentVo valueObject, ims.scheduling.domain.objects.Booking_Appointment domainObject) 
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
			
		// ApptStartTime
		String ApptStartTime = domainObject.getApptStartTime();
		if ( null != ApptStartTime ) 
		{
			valueObject.setApptStartTime(new ims.framework.utils.Time(ApptStartTime) );
		}
		// Patient
		valueObject.setPatient(ims.core.vo.domain.PatientShortAssembler.create(map, domainObject.getPatient()) );
		// TheatreBooking
		valueObject.setTheatreBooking(ims.scheduling.vo.domain.TheatreBookingLiteVoAssembler.create(map, domainObject.getTheatreBooking()) );
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
				// Session
		valueObject.setSession(ims.scheduling.vo.domain.SessionLocationVoAssembler.create(map, domainObject.getSession()) );
		// ApptStatusHistory
		valueObject.setApptStatusHistory(ims.scheduling.vo.domain.Appointment_StatusVoAssembler.createAppointment_StatusVoCollectionFromAppointment_Status(map, domainObject.getApptStatusHistory()) );
		// CurrentStatusRecord
		valueObject.setCurrentStatusRecord(ims.scheduling.vo.domain.Appointment_StatusVoAssembler.create(map, domainObject.getCurrentStatusRecord()) );
		// isCABBooking
		valueObject.setIsCABBooking( domainObject.isIsCABBooking() );
		// RequiresRebook
		valueObject.setRequiresRebook( domainObject.isRequiresRebook() );
		// TheatreSlot
		if (domainObject.getTheatreSlot() != null)
		{
			if(domainObject.getTheatreSlot() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getTheatreSlot();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setTheatreSlot(new ims.scheduling.vo.SessionTheatreTCISlotRefVo(id, -1));				
			}
			else
			{
				valueObject.setTheatreSlot(new ims.scheduling.vo.SessionTheatreTCISlotRefVo(domainObject.getTheatreSlot().getId(), domainObject.getTheatreSlot().getVersion()));
			}
		}
		// IntraOperativeCareRecord
		valueObject.setIntraOperativeCareRecord(ims.clinical.vo.domain.IntraOperativeCareRecordSchedulingVoAssembler.createIntraOperativeCareRecordSchedulingVoCollectionFromIntraOperativeCareRecord(map, domainObject.getIntraOperativeCareRecord()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.scheduling.domain.objects.Booking_Appointment extractBooking_Appointment(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.TheatreListBookingAppointmentVo valueObject) 
	{
		return 	extractBooking_Appointment(domainFactory, valueObject, new HashMap());
	}

	public static ims.scheduling.domain.objects.Booking_Appointment extractBooking_Appointment(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.TheatreListBookingAppointmentVo valueObject, HashMap domMap) 
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
			// ims.RefMan.vo.TheatreListBookingAppointmentVo ID_Booking_Appointment field is unknown
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

		ims.framework.utils.Time time1 = valueObject.getApptStartTime();
		String value1 = null;
		if ( time1 != null ) 
		{
			value1 = time1.toString();
		}
		domainObject.setApptStartTime(value1);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.patient.domain.objects.Patient value2 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value2 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else
			{
				value2 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value2);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.scheduling.domain.objects.TheatreBooking value3 = null;
		if ( null != valueObject.getTheatreBooking() ) 
		{
			if (valueObject.getTheatreBooking().getBoId() == null)
			{
				if (domMap.get(valueObject.getTheatreBooking()) != null)
				{
					value3 = (ims.scheduling.domain.objects.TheatreBooking)domMap.get(valueObject.getTheatreBooking());
				}
			}
			else
			{
				value3 = (ims.scheduling.domain.objects.TheatreBooking)domainFactory.getDomainObject(ims.scheduling.domain.objects.TheatreBooking.class, valueObject.getTheatreBooking().getBoId());
			}
		}
		domainObject.setTheatreBooking(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getApptStatus() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getApptStatus().getID());
		}
		domainObject.setApptStatus(value4);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.scheduling.domain.objects.Sch_Session value5 = null;
		if ( null != valueObject.getSession() ) 
		{
			if (valueObject.getSession().getBoId() == null)
			{
				if (domMap.get(valueObject.getSession()) != null)
				{
					value5 = (ims.scheduling.domain.objects.Sch_Session)domMap.get(valueObject.getSession());
				}
			}
			else
			{
				value5 = (ims.scheduling.domain.objects.Sch_Session)domainFactory.getDomainObject(ims.scheduling.domain.objects.Sch_Session.class, valueObject.getSession().getBoId());
			}
		}
		domainObject.setSession(value5);
		domainObject.setApptStatusHistory(ims.scheduling.vo.domain.Appointment_StatusVoAssembler.extractAppointment_StatusSet(domainFactory, valueObject.getApptStatusHistory(), domainObject.getApptStatusHistory(), domMap));		
		domainObject.setCurrentStatusRecord(ims.scheduling.vo.domain.Appointment_StatusVoAssembler.extractAppointment_Status(domainFactory, valueObject.getCurrentStatusRecord(), domMap));
		domainObject.setIsCABBooking(valueObject.getIsCABBooking());
		domainObject.setRequiresRebook(valueObject.getRequiresRebook());
		ims.scheduling.domain.objects.SessionTheatreTCISlot value10 = null;
		if ( null != valueObject.getTheatreSlot() ) 
		{
			if (valueObject.getTheatreSlot().getBoId() == null)
			{
				if (domMap.get(valueObject.getTheatreSlot()) != null)
				{
					value10 = (ims.scheduling.domain.objects.SessionTheatreTCISlot)domMap.get(valueObject.getTheatreSlot());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value10 = domainObject.getTheatreSlot();	
			}
			else
			{
				value10 = (ims.scheduling.domain.objects.SessionTheatreTCISlot)domainFactory.getDomainObject(ims.scheduling.domain.objects.SessionTheatreTCISlot.class, valueObject.getTheatreSlot().getBoId());
			}
		}
		domainObject.setTheatreSlot(value10);

		// SaveAsRefVO treated as RefValueObject
		ims.core.clinical.vo.IntraOperativeCareRecordRefVoCollection refCollection11 = new ims.core.clinical.vo.IntraOperativeCareRecordRefVoCollection();
		if (valueObject.getIntraOperativeCareRecord() != null)
		{
			for (int i11=0; i11<valueObject.getIntraOperativeCareRecord().size(); i11++)
			{
				ims.core.clinical.vo.IntraOperativeCareRecordRefVo ref11 = (ims.core.clinical.vo.IntraOperativeCareRecordRefVo)valueObject.getIntraOperativeCareRecord().get(i11);
				refCollection11.add(ref11);
			}
		}
		int size11 = (null == refCollection11) ? 0 : refCollection11.size();		
		java.util.List domainIntraOperativeCareRecord11 = domainObject.getIntraOperativeCareRecord();
		if (domainIntraOperativeCareRecord11 == null)
		{
			domainIntraOperativeCareRecord11 = new java.util.ArrayList();
		}
		for(int i=0; i < size11; i++) 
		{
			ims.core.clinical.vo.IntraOperativeCareRecordRefVo vo = refCollection11.get(i);			
			ims.core.clinical.domain.objects.IntraOperativeCareRecord dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.clinical.domain.objects.IntraOperativeCareRecord)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.clinical.domain.objects.IntraOperativeCareRecord)domainFactory.getDomainObject( ims.core.clinical.domain.objects.IntraOperativeCareRecord.class, vo.getBoId());
				}
			}

			int domIdx = domainIntraOperativeCareRecord11.indexOf(dom);
			if (domIdx == -1)
			{
				domainIntraOperativeCareRecord11.add(i, dom);
			}
			else if (i != domIdx && i < domainIntraOperativeCareRecord11.size())
			{
				Object tmp = domainIntraOperativeCareRecord11.get(i);
				domainIntraOperativeCareRecord11.set(i, domainIntraOperativeCareRecord11.get(domIdx));
				domainIntraOperativeCareRecord11.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i11 = domainIntraOperativeCareRecord11.size();
		while (i11 > size11)
		{
			domainIntraOperativeCareRecord11.remove(i11-1);
			i11 = domainIntraOperativeCareRecord11.size();
		}
		
		domainObject.setIntraOperativeCareRecord(domainIntraOperativeCareRecord11);		

		return domainObject;
	}

}
