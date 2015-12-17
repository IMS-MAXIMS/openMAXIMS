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
 * @author George Cristian Josan
 */
public class TransportBookingShortVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.TransportBookingShortVo copy(ims.RefMan.vo.TransportBookingShortVo valueObjectDest, ims.RefMan.vo.TransportBookingShortVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_TransportBooking(valueObjectSrc.getID_TransportBooking());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Appointments
		valueObjectDest.setAppointments(valueObjectSrc.getAppointments());
		// DateBooked
		valueObjectDest.setDateBooked(valueObjectSrc.getDateBooked());
		// BookingReference
		valueObjectDest.setBookingReference(valueObjectSrc.getBookingReference());
		// SysInfo
		valueObjectDest.setSysInfo(valueObjectSrc.getSysInfo());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createTransportBookingShortVoCollectionFromTransportBooking(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.domain.objects.TransportBooking objects.
	 */
	public static ims.RefMan.vo.TransportBookingShortVoCollection createTransportBookingShortVoCollectionFromTransportBooking(java.util.Set domainObjectSet)	
	{
		return createTransportBookingShortVoCollectionFromTransportBooking(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.domain.objects.TransportBooking objects.
	 */
	public static ims.RefMan.vo.TransportBookingShortVoCollection createTransportBookingShortVoCollectionFromTransportBooking(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.TransportBookingShortVoCollection voList = new ims.RefMan.vo.TransportBookingShortVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.domain.objects.TransportBooking domainObject = (ims.core.domain.objects.TransportBooking) iterator.next();
			ims.RefMan.vo.TransportBookingShortVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.domain.objects.TransportBooking objects.
	 */
	public static ims.RefMan.vo.TransportBookingShortVoCollection createTransportBookingShortVoCollectionFromTransportBooking(java.util.List domainObjectList) 
	{
		return createTransportBookingShortVoCollectionFromTransportBooking(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.domain.objects.TransportBooking objects.
	 */
	public static ims.RefMan.vo.TransportBookingShortVoCollection createTransportBookingShortVoCollectionFromTransportBooking(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.TransportBookingShortVoCollection voList = new ims.RefMan.vo.TransportBookingShortVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.domain.objects.TransportBooking domainObject = (ims.core.domain.objects.TransportBooking) domainObjectList.get(i);
			ims.RefMan.vo.TransportBookingShortVo vo = create(map, domainObject);

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
	 * Create the ims.core.domain.objects.TransportBooking set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractTransportBookingSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.TransportBookingShortVoCollection voCollection) 
	 {
	 	return extractTransportBookingSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractTransportBookingSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.TransportBookingShortVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.TransportBookingShortVo vo = voCollection.get(i);
			ims.core.domain.objects.TransportBooking domainObject = TransportBookingShortVoAssembler.extractTransportBooking(domainFactory, vo, domMap);

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
	 * Create the ims.core.domain.objects.TransportBooking list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractTransportBookingList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.TransportBookingShortVoCollection voCollection) 
	 {
	 	return extractTransportBookingList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractTransportBookingList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.TransportBookingShortVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.TransportBookingShortVo vo = voCollection.get(i);
			ims.core.domain.objects.TransportBooking domainObject = TransportBookingShortVoAssembler.extractTransportBooking(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.domain.objects.TransportBooking object.
	 * @param domainObject ims.core.domain.objects.TransportBooking
	 */
	 public static ims.RefMan.vo.TransportBookingShortVo create(ims.core.domain.objects.TransportBooking domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.domain.objects.TransportBooking object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.TransportBookingShortVo create(DomainObjectMap map, ims.core.domain.objects.TransportBooking domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.TransportBookingShortVo valueObject = (ims.RefMan.vo.TransportBookingShortVo) map.getValueObject(domainObject, ims.RefMan.vo.TransportBookingShortVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.TransportBookingShortVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.domain.objects.TransportBooking
	 */
	 public static ims.RefMan.vo.TransportBookingShortVo insert(ims.RefMan.vo.TransportBookingShortVo valueObject, ims.core.domain.objects.TransportBooking domainObject) 
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
	 * @param domainObject ims.core.domain.objects.TransportBooking
	 */
	 public static ims.RefMan.vo.TransportBookingShortVo insert(DomainObjectMap map, ims.RefMan.vo.TransportBookingShortVo valueObject, ims.core.domain.objects.TransportBooking domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_TransportBooking(domainObject.getId());
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
		ims.scheduling.vo.Booking_AppointmentRefVoCollection Appointments = new ims.scheduling.vo.Booking_AppointmentRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getAppointments().iterator(); iterator.hasNext(); ) 
		{
			ims.scheduling.domain.objects.Booking_Appointment tmp = (ims.scheduling.domain.objects.Booking_Appointment)iterator.next();
			if (tmp != null)
				Appointments.add(new ims.scheduling.vo.Booking_AppointmentRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setAppointments(Appointments);
		// DateBooked
		java.util.Date DateBooked = domainObject.getDateBooked();
		if ( null != DateBooked ) 
		{
			valueObject.setDateBooked(new ims.framework.utils.Date(DateBooked) );
		}
		// BookingReference
		valueObject.setBookingReference(domainObject.getBookingReference());
		// SysInfo
		// set system information
		valueObject.setSysInfo(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
		// CareContext
		if (domainObject.getCareContext() != null)
		{
			if(domainObject.getCareContext() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getCareContext();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setCareContext(new ims.core.admin.vo.CareContextRefVo(id, -1));				
			}
			else
			{
				valueObject.setCareContext(new ims.core.admin.vo.CareContextRefVo(domainObject.getCareContext().getId(), domainObject.getCareContext().getVersion()));
			}
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.domain.objects.TransportBooking extractTransportBooking(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.TransportBookingShortVo valueObject) 
	{
		return 	extractTransportBooking(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.domain.objects.TransportBooking extractTransportBooking(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.TransportBookingShortVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_TransportBooking();
		ims.core.domain.objects.TransportBooking domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.domain.objects.TransportBooking)domMap.get(valueObject);
			}
			// ims.RefMan.vo.TransportBookingShortVo ID_TransportBooking field is unknown
			domainObject = new ims.core.domain.objects.TransportBooking();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_TransportBooking());
			if (domMap.get(key) != null)
			{
				return (ims.core.domain.objects.TransportBooking)domMap.get(key);
			}
			domainObject = (ims.core.domain.objects.TransportBooking) domainFactory.getDomainObject(ims.core.domain.objects.TransportBooking.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_TransportBooking());


		ims.scheduling.vo.Booking_AppointmentRefVoCollection refCollection1 = valueObject.getAppointments();
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
		java.util.Date value2 = null;
		ims.framework.utils.Date date2 = valueObject.getDateBooked();		
		if ( date2 != null ) 
		{
			value2 = date2.getDate();
		}
		domainObject.setDateBooked(value2);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getBookingReference() != null && valueObject.getBookingReference().equals(""))
		{
			valueObject.setBookingReference(null);
		}
		domainObject.setBookingReference(valueObject.getBookingReference());
		ims.core.admin.domain.objects.CareContext value5 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value5 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value5 = domainObject.getCareContext();	
			}
			else
			{
				value5 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value5);

		return domainObject;
	}

}
