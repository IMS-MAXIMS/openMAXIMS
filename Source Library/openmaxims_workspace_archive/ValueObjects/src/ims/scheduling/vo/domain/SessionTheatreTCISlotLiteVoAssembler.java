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
public class SessionTheatreTCISlotLiteVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.scheduling.vo.SessionTheatreTCISlotLiteVo copy(ims.scheduling.vo.SessionTheatreTCISlotLiteVo valueObjectDest, ims.scheduling.vo.SessionTheatreTCISlotLiteVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_SessionTheatreTCISlot(valueObjectSrc.getID_SessionTheatreTCISlot());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ToComeInTime
		valueObjectDest.setToComeInTime(valueObjectSrc.getToComeInTime());
		// Appointment
		valueObjectDest.setAppointment(valueObjectSrc.getAppointment());
		// Status
		valueObjectDest.setStatus(valueObjectSrc.getStatus());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createSessionTheatreTCISlotLiteVoCollectionFromSessionTheatreTCISlot(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.SessionTheatreTCISlot objects.
	 */
	public static ims.scheduling.vo.SessionTheatreTCISlotLiteVoCollection createSessionTheatreTCISlotLiteVoCollectionFromSessionTheatreTCISlot(java.util.Set domainObjectSet)	
	{
		return createSessionTheatreTCISlotLiteVoCollectionFromSessionTheatreTCISlot(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.SessionTheatreTCISlot objects.
	 */
	public static ims.scheduling.vo.SessionTheatreTCISlotLiteVoCollection createSessionTheatreTCISlotLiteVoCollectionFromSessionTheatreTCISlot(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.scheduling.vo.SessionTheatreTCISlotLiteVoCollection voList = new ims.scheduling.vo.SessionTheatreTCISlotLiteVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.scheduling.domain.objects.SessionTheatreTCISlot domainObject = (ims.scheduling.domain.objects.SessionTheatreTCISlot) iterator.next();
			ims.scheduling.vo.SessionTheatreTCISlotLiteVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.scheduling.domain.objects.SessionTheatreTCISlot objects.
	 */
	public static ims.scheduling.vo.SessionTheatreTCISlotLiteVoCollection createSessionTheatreTCISlotLiteVoCollectionFromSessionTheatreTCISlot(java.util.List domainObjectList) 
	{
		return createSessionTheatreTCISlotLiteVoCollectionFromSessionTheatreTCISlot(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.scheduling.domain.objects.SessionTheatreTCISlot objects.
	 */
	public static ims.scheduling.vo.SessionTheatreTCISlotLiteVoCollection createSessionTheatreTCISlotLiteVoCollectionFromSessionTheatreTCISlot(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.scheduling.vo.SessionTheatreTCISlotLiteVoCollection voList = new ims.scheduling.vo.SessionTheatreTCISlotLiteVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.scheduling.domain.objects.SessionTheatreTCISlot domainObject = (ims.scheduling.domain.objects.SessionTheatreTCISlot) domainObjectList.get(i);
			ims.scheduling.vo.SessionTheatreTCISlotLiteVo vo = create(map, domainObject);

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
	 * Create the ims.scheduling.domain.objects.SessionTheatreTCISlot set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractSessionTheatreTCISlotSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionTheatreTCISlotLiteVoCollection voCollection) 
	 {
	 	return extractSessionTheatreTCISlotSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractSessionTheatreTCISlotSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionTheatreTCISlotLiteVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.SessionTheatreTCISlotLiteVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.SessionTheatreTCISlot domainObject = SessionTheatreTCISlotLiteVoAssembler.extractSessionTheatreTCISlot(domainFactory, vo, domMap);

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
	 * Create the ims.scheduling.domain.objects.SessionTheatreTCISlot list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractSessionTheatreTCISlotList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionTheatreTCISlotLiteVoCollection voCollection) 
	 {
	 	return extractSessionTheatreTCISlotList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractSessionTheatreTCISlotList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionTheatreTCISlotLiteVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.SessionTheatreTCISlotLiteVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.SessionTheatreTCISlot domainObject = SessionTheatreTCISlotLiteVoAssembler.extractSessionTheatreTCISlot(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.scheduling.domain.objects.SessionTheatreTCISlot object.
	 * @param domainObject ims.scheduling.domain.objects.SessionTheatreTCISlot
	 */
	 public static ims.scheduling.vo.SessionTheatreTCISlotLiteVo create(ims.scheduling.domain.objects.SessionTheatreTCISlot domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.scheduling.domain.objects.SessionTheatreTCISlot object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.scheduling.vo.SessionTheatreTCISlotLiteVo create(DomainObjectMap map, ims.scheduling.domain.objects.SessionTheatreTCISlot domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.scheduling.vo.SessionTheatreTCISlotLiteVo valueObject = (ims.scheduling.vo.SessionTheatreTCISlotLiteVo) map.getValueObject(domainObject, ims.scheduling.vo.SessionTheatreTCISlotLiteVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.scheduling.vo.SessionTheatreTCISlotLiteVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.scheduling.domain.objects.SessionTheatreTCISlot
	 */
	 public static ims.scheduling.vo.SessionTheatreTCISlotLiteVo insert(ims.scheduling.vo.SessionTheatreTCISlotLiteVo valueObject, ims.scheduling.domain.objects.SessionTheatreTCISlot domainObject) 
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
	 * @param domainObject ims.scheduling.domain.objects.SessionTheatreTCISlot
	 */
	 public static ims.scheduling.vo.SessionTheatreTCISlotLiteVo insert(DomainObjectMap map, ims.scheduling.vo.SessionTheatreTCISlotLiteVo valueObject, ims.scheduling.domain.objects.SessionTheatreTCISlot domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_SessionTheatreTCISlot(domainObject.getId());
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
			
		// ToComeInTime
		String ToComeInTime = domainObject.getToComeInTime();
		if ( null != ToComeInTime ) 
		{
			valueObject.setToComeInTime(new ims.framework.utils.Time(ToComeInTime) );
		}
		// Appointment
		if (domainObject.getAppointment() != null)
		{
			if(domainObject.getAppointment() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getAppointment();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setAppointment(new ims.scheduling.vo.Booking_AppointmentRefVo(id, -1));				
			}
			else
			{
				valueObject.setAppointment(new ims.scheduling.vo.Booking_AppointmentRefVo(domainObject.getAppointment().getId(), domainObject.getAppointment().getVersion()));
			}
		}
		// Status
		ims.domain.lookups.LookupInstance instance3 = domainObject.getStatus();
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
			valueObject.setStatus(voLookup3);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.scheduling.domain.objects.SessionTheatreTCISlot extractSessionTheatreTCISlot(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionTheatreTCISlotLiteVo valueObject) 
	{
		return 	extractSessionTheatreTCISlot(domainFactory, valueObject, new HashMap());
	}

	public static ims.scheduling.domain.objects.SessionTheatreTCISlot extractSessionTheatreTCISlot(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionTheatreTCISlotLiteVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_SessionTheatreTCISlot();
		ims.scheduling.domain.objects.SessionTheatreTCISlot domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.scheduling.domain.objects.SessionTheatreTCISlot)domMap.get(valueObject);
			}
			// ims.scheduling.vo.SessionTheatreTCISlotLiteVo ID_SessionTheatreTCISlot field is unknown
			domainObject = new ims.scheduling.domain.objects.SessionTheatreTCISlot();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_SessionTheatreTCISlot());
			if (domMap.get(key) != null)
			{
				return (ims.scheduling.domain.objects.SessionTheatreTCISlot)domMap.get(key);
			}
			domainObject = (ims.scheduling.domain.objects.SessionTheatreTCISlot) domainFactory.getDomainObject(ims.scheduling.domain.objects.SessionTheatreTCISlot.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_SessionTheatreTCISlot());

		ims.framework.utils.Time time1 = valueObject.getToComeInTime();
		String value1 = null;
		if ( time1 != null ) 
		{
			value1 = time1.toString();
		}
		domainObject.setToComeInTime(value1);
		ims.scheduling.domain.objects.Booking_Appointment value2 = null;
		if ( null != valueObject.getAppointment() ) 
		{
			if (valueObject.getAppointment().getBoId() == null)
			{
				if (domMap.get(valueObject.getAppointment()) != null)
				{
					value2 = (ims.scheduling.domain.objects.Booking_Appointment)domMap.get(valueObject.getAppointment());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getAppointment();	
			}
			else
			{
				value2 = (ims.scheduling.domain.objects.Booking_Appointment)domainFactory.getDomainObject(ims.scheduling.domain.objects.Booking_Appointment.class, valueObject.getAppointment().getBoId());
			}
		}
		domainObject.setAppointment(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getStatus() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getStatus().getID());
		}
		domainObject.setStatus(value3);

		return domainObject;
	}

}
