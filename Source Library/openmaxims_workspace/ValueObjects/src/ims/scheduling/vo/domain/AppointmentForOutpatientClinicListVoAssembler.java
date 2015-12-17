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
 * @author Bogdan Tofei
 */
public class AppointmentForOutpatientClinicListVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.scheduling.vo.AppointmentForOutpatientClinicListVo copy(ims.scheduling.vo.AppointmentForOutpatientClinicListVo valueObjectDest, ims.scheduling.vo.AppointmentForOutpatientClinicListVo valueObjectSrc) 
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
		// Activity
		valueObjectDest.setActivity(valueObjectSrc.getActivity());
		// Session
		valueObjectDest.setSession(valueObjectSrc.getSession());
		// isCABBooking
		valueObjectDest.setIsCABBooking(valueObjectSrc.getIsCABBooking());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// Outcome
		valueObjectDest.setOutcome(valueObjectSrc.getOutcome());
		// OutcomeComments
		valueObjectDest.setOutcomeComments(valueObjectSrc.getOutcomeComments());
		// HasElectiveList
		valueObjectDest.setHasElectiveList(valueObjectSrc.getHasElectiveList());
		// wasPrinted
		valueObjectDest.setWasPrinted(valueObjectSrc.getWasPrinted());
		// BookingLetter
		valueObjectDest.setBookingLetter(valueObjectSrc.getBookingLetter());
		// LinkedAppointments
		valueObjectDest.setLinkedAppointments(valueObjectSrc.getLinkedAppointments());
		// ElectiveList
		valueObjectDest.setElectiveList(valueObjectSrc.getElectiveList());
		// Comments
		valueObjectDest.setComments(valueObjectSrc.getComments());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createAppointmentForOutpatientClinicListVoCollectionFromBooking_Appointment(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.Booking_Appointment objects.
	 */
	public static ims.scheduling.vo.AppointmentForOutpatientClinicListVoCollection createAppointmentForOutpatientClinicListVoCollectionFromBooking_Appointment(java.util.Set domainObjectSet)	
	{
		return createAppointmentForOutpatientClinicListVoCollectionFromBooking_Appointment(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.Booking_Appointment objects.
	 */
	public static ims.scheduling.vo.AppointmentForOutpatientClinicListVoCollection createAppointmentForOutpatientClinicListVoCollectionFromBooking_Appointment(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.scheduling.vo.AppointmentForOutpatientClinicListVoCollection voList = new ims.scheduling.vo.AppointmentForOutpatientClinicListVoCollection();
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
			ims.scheduling.vo.AppointmentForOutpatientClinicListVo vo = create(map, domainObject);
			
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
	public static ims.scheduling.vo.AppointmentForOutpatientClinicListVoCollection createAppointmentForOutpatientClinicListVoCollectionFromBooking_Appointment(java.util.List domainObjectList) 
	{
		return createAppointmentForOutpatientClinicListVoCollectionFromBooking_Appointment(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.scheduling.domain.objects.Booking_Appointment objects.
	 */
	public static ims.scheduling.vo.AppointmentForOutpatientClinicListVoCollection createAppointmentForOutpatientClinicListVoCollectionFromBooking_Appointment(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.scheduling.vo.AppointmentForOutpatientClinicListVoCollection voList = new ims.scheduling.vo.AppointmentForOutpatientClinicListVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.scheduling.domain.objects.Booking_Appointment domainObject = (ims.scheduling.domain.objects.Booking_Appointment) domainObjectList.get(i);
			ims.scheduling.vo.AppointmentForOutpatientClinicListVo vo = create(map, domainObject);

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
	 public static java.util.Set extractBooking_AppointmentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.AppointmentForOutpatientClinicListVoCollection voCollection) 
	 {
	 	return extractBooking_AppointmentSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractBooking_AppointmentSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.AppointmentForOutpatientClinicListVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.AppointmentForOutpatientClinicListVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.Booking_Appointment domainObject = AppointmentForOutpatientClinicListVoAssembler.extractBooking_Appointment(domainFactory, vo, domMap);

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
	 public static java.util.List extractBooking_AppointmentList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.AppointmentForOutpatientClinicListVoCollection voCollection) 
	 {
	 	return extractBooking_AppointmentList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractBooking_AppointmentList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.AppointmentForOutpatientClinicListVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.AppointmentForOutpatientClinicListVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.Booking_Appointment domainObject = AppointmentForOutpatientClinicListVoAssembler.extractBooking_Appointment(domainFactory, vo, domMap);

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
	 public static ims.scheduling.vo.AppointmentForOutpatientClinicListVo create(ims.scheduling.domain.objects.Booking_Appointment domainObject) 
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
	  public static ims.scheduling.vo.AppointmentForOutpatientClinicListVo create(DomainObjectMap map, ims.scheduling.domain.objects.Booking_Appointment domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.scheduling.vo.AppointmentForOutpatientClinicListVo valueObject = (ims.scheduling.vo.AppointmentForOutpatientClinicListVo) map.getValueObject(domainObject, ims.scheduling.vo.AppointmentForOutpatientClinicListVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.scheduling.vo.AppointmentForOutpatientClinicListVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.scheduling.vo.AppointmentForOutpatientClinicListVo insert(ims.scheduling.vo.AppointmentForOutpatientClinicListVo valueObject, ims.scheduling.domain.objects.Booking_Appointment domainObject) 
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
	 public static ims.scheduling.vo.AppointmentForOutpatientClinicListVo insert(DomainObjectMap map, ims.scheduling.vo.AppointmentForOutpatientClinicListVo valueObject, ims.scheduling.domain.objects.Booking_Appointment domainObject) 
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
				// Activity
		valueObject.setActivity(ims.core.vo.domain.ActivityForOutpatientClinicListVoAssembler.create(map, domainObject.getActivity()) );
		// Session
		valueObject.setSession(ims.scheduling.vo.domain.SessionForOutpatientClinicListVoAssembler.create(map, domainObject.getSession()) );
		// isCABBooking
		valueObject.setIsCABBooking( domainObject.isIsCABBooking() );
		// Patient
		valueObject.setPatient(ims.core.vo.domain.PatientLiteClinicListVoAssembler.create(map, domainObject.getPatient()) );
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
				// OutcomeComments
		valueObject.setOutcomeComments(domainObject.getOutcomeComments());
		// HasElectiveList
		valueObject.setHasElectiveList( domainObject.isHasElectiveList() );
		// wasPrinted
		valueObject.setWasPrinted( domainObject.isWasPrinted() );
		// BookingLetter
		valueObject.setBookingLetter(ims.core.vo.domain.PatientDocumentForOutpatientClinicListVoAssembler.create(map, domainObject.getBookingLetter()) );
		// LinkedAppointments
		valueObject.setLinkedAppointments(ims.scheduling.vo.domain.LinkedAppointmentsForClinicListWithICPActionsVoAssembler.createLinkedAppointmentsForClinicListWithICPActionsVoCollectionFromBooking_Appointment(map, domainObject.getLinkedAppointments()) );
		// ElectiveList
		if (domainObject.getElectiveList() != null)
		{
			if(domainObject.getElectiveList() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getElectiveList();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setElectiveList(new ims.RefMan.vo.PatientElectiveListRefVo(id, -1));				
			}
			else
			{
				valueObject.setElectiveList(new ims.RefMan.vo.PatientElectiveListRefVo(domainObject.getElectiveList().getId(), domainObject.getElectiveList().getVersion()));
			}
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
	public static ims.scheduling.domain.objects.Booking_Appointment extractBooking_Appointment(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.AppointmentForOutpatientClinicListVo valueObject) 
	{
		return 	extractBooking_Appointment(domainFactory, valueObject, new HashMap());
	}

	public static ims.scheduling.domain.objects.Booking_Appointment extractBooking_Appointment(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.AppointmentForOutpatientClinicListVo valueObject, HashMap domMap) 
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
			// ims.scheduling.vo.AppointmentForOutpatientClinicListVo ID_Booking_Appointment field is unknown
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
		domainObject.setIsCABBooking(valueObject.getIsCABBooking());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.patient.domain.objects.Patient value7 = null;
		if ( null != valueObject.getPatient() ) 
		{
			if (valueObject.getPatient().getBoId() == null)
			{
				if (domMap.get(valueObject.getPatient()) != null)
				{
					value7 = (ims.core.patient.domain.objects.Patient)domMap.get(valueObject.getPatient());
				}
			}
			else
			{
				value7 = (ims.core.patient.domain.objects.Patient)domainFactory.getDomainObject(ims.core.patient.domain.objects.Patient.class, valueObject.getPatient().getBoId());
			}
		}
		domainObject.setPatient(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getOutcome() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getOutcome().getID());
		}
		domainObject.setOutcome(value8);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getOutcomeComments() != null && valueObject.getOutcomeComments().equals(""))
		{
			valueObject.setOutcomeComments(null);
		}
		domainObject.setOutcomeComments(valueObject.getOutcomeComments());
		domainObject.setHasElectiveList(valueObject.getHasElectiveList());
		domainObject.setWasPrinted(valueObject.getWasPrinted());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.documents.domain.objects.PatientDocument value12 = null;
		if ( null != valueObject.getBookingLetter() ) 
		{
			if (valueObject.getBookingLetter().getBoId() == null)
			{
				if (domMap.get(valueObject.getBookingLetter()) != null)
				{
					value12 = (ims.core.documents.domain.objects.PatientDocument)domMap.get(valueObject.getBookingLetter());
				}
			}
			else
			{
				value12 = (ims.core.documents.domain.objects.PatientDocument)domainFactory.getDomainObject(ims.core.documents.domain.objects.PatientDocument.class, valueObject.getBookingLetter().getBoId());
			}
		}
		domainObject.setBookingLetter(value12);

		// SaveAsRefVO treated as RefValueObject
		ims.scheduling.vo.Booking_AppointmentRefVoCollection refCollection13 = new ims.scheduling.vo.Booking_AppointmentRefVoCollection();
		if (valueObject.getLinkedAppointments() != null)
		{
			for (int i13=0; i13<valueObject.getLinkedAppointments().size(); i13++)
			{
				ims.scheduling.vo.Booking_AppointmentRefVo ref13 = (ims.scheduling.vo.Booking_AppointmentRefVo)valueObject.getLinkedAppointments().get(i13);
				refCollection13.add(ref13);
			}
		}
		int size13 = (null == refCollection13) ? 0 : refCollection13.size();		
		java.util.Set domainLinkedAppointments13 = domainObject.getLinkedAppointments();
		if (domainLinkedAppointments13 == null)
		{
			domainLinkedAppointments13 = new java.util.HashSet();
		}
		java.util.Set newSet13  = new java.util.HashSet();
		for(int i=0; i<size13; i++) 
		{
			ims.scheduling.vo.Booking_AppointmentRefVo vo = refCollection13.get(i);					
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
			if (!domainLinkedAppointments13.contains(dom))
			{
				domainLinkedAppointments13.add(dom);
			}
			newSet13.add(dom);			
		}
		java.util.Set removedSet13 = new java.util.HashSet();
		java.util.Iterator iter13 = domainLinkedAppointments13.iterator();
		//Find out which objects need to be removed
		while (iter13.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter13.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet13.contains(o))
			{
				removedSet13.add(o);
			}
		}
		iter13 = removedSet13.iterator();
		//Remove the unwanted objects
		while (iter13.hasNext())
		{
			domainLinkedAppointments13.remove(iter13.next());
		}		
		
		domainObject.setLinkedAppointments(domainLinkedAppointments13);		
		ims.RefMan.domain.objects.PatientElectiveList value14 = null;
		if ( null != valueObject.getElectiveList() ) 
		{
			if (valueObject.getElectiveList().getBoId() == null)
			{
				if (domMap.get(valueObject.getElectiveList()) != null)
				{
					value14 = (ims.RefMan.domain.objects.PatientElectiveList)domMap.get(valueObject.getElectiveList());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value14 = domainObject.getElectiveList();	
			}
			else
			{
				value14 = (ims.RefMan.domain.objects.PatientElectiveList)domainFactory.getDomainObject(ims.RefMan.domain.objects.PatientElectiveList.class, valueObject.getElectiveList().getBoId());
			}
		}
		domainObject.setElectiveList(value14);
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
