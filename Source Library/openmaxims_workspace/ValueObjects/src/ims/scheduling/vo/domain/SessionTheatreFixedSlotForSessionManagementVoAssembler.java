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
public class SessionTheatreFixedSlotForSessionManagementVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.scheduling.vo.SessionTheatreFixedSlotForSessionManagementVo copy(ims.scheduling.vo.SessionTheatreFixedSlotForSessionManagementVo valueObjectDest, ims.scheduling.vo.SessionTheatreFixedSlotForSessionManagementVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_SessionParentChildSlot(valueObjectSrc.getID_SessionParentChildSlot());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// StartTime
		valueObjectDest.setStartTime(valueObjectSrc.getStartTime());
		// isActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
		// Appointment
		valueObjectDest.setAppointment(valueObjectSrc.getAppointment());
		// Duration
		valueObjectDest.setDuration(valueObjectSrc.getDuration());
		// Comment
		valueObjectDest.setComment(valueObjectSrc.getComment());
		// Status
		valueObjectDest.setStatus(valueObjectSrc.getStatus());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createSessionTheatreFixedSlotForSessionManagementVoCollectionFromSessionParentChildSlot(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.SessionParentChildSlot objects.
	 */
	public static ims.scheduling.vo.SessionTheatreFixedSlotForSessionManagementVoCollection createSessionTheatreFixedSlotForSessionManagementVoCollectionFromSessionParentChildSlot(java.util.Set domainObjectSet)	
	{
		return createSessionTheatreFixedSlotForSessionManagementVoCollectionFromSessionParentChildSlot(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.SessionParentChildSlot objects.
	 */
	public static ims.scheduling.vo.SessionTheatreFixedSlotForSessionManagementVoCollection createSessionTheatreFixedSlotForSessionManagementVoCollectionFromSessionParentChildSlot(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.scheduling.vo.SessionTheatreFixedSlotForSessionManagementVoCollection voList = new ims.scheduling.vo.SessionTheatreFixedSlotForSessionManagementVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.scheduling.domain.objects.SessionParentChildSlot domainObject = (ims.scheduling.domain.objects.SessionParentChildSlot) iterator.next();
			ims.scheduling.vo.SessionTheatreFixedSlotForSessionManagementVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.scheduling.domain.objects.SessionParentChildSlot objects.
	 */
	public static ims.scheduling.vo.SessionTheatreFixedSlotForSessionManagementVoCollection createSessionTheatreFixedSlotForSessionManagementVoCollectionFromSessionParentChildSlot(java.util.List domainObjectList) 
	{
		return createSessionTheatreFixedSlotForSessionManagementVoCollectionFromSessionParentChildSlot(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.scheduling.domain.objects.SessionParentChildSlot objects.
	 */
	public static ims.scheduling.vo.SessionTheatreFixedSlotForSessionManagementVoCollection createSessionTheatreFixedSlotForSessionManagementVoCollectionFromSessionParentChildSlot(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.scheduling.vo.SessionTheatreFixedSlotForSessionManagementVoCollection voList = new ims.scheduling.vo.SessionTheatreFixedSlotForSessionManagementVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.scheduling.domain.objects.SessionParentChildSlot domainObject = (ims.scheduling.domain.objects.SessionParentChildSlot) domainObjectList.get(i);
			ims.scheduling.vo.SessionTheatreFixedSlotForSessionManagementVo vo = create(map, domainObject);

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
	 * Create the ims.scheduling.domain.objects.SessionParentChildSlot set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractSessionParentChildSlotSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionTheatreFixedSlotForSessionManagementVoCollection voCollection) 
	 {
	 	return extractSessionParentChildSlotSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractSessionParentChildSlotSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionTheatreFixedSlotForSessionManagementVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.SessionTheatreFixedSlotForSessionManagementVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.SessionParentChildSlot domainObject = SessionTheatreFixedSlotForSessionManagementVoAssembler.extractSessionParentChildSlot(domainFactory, vo, domMap);

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
	 * Create the ims.scheduling.domain.objects.SessionParentChildSlot list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractSessionParentChildSlotList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionTheatreFixedSlotForSessionManagementVoCollection voCollection) 
	 {
	 	return extractSessionParentChildSlotList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractSessionParentChildSlotList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionTheatreFixedSlotForSessionManagementVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.SessionTheatreFixedSlotForSessionManagementVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.SessionParentChildSlot domainObject = SessionTheatreFixedSlotForSessionManagementVoAssembler.extractSessionParentChildSlot(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.scheduling.domain.objects.SessionParentChildSlot object.
	 * @param domainObject ims.scheduling.domain.objects.SessionParentChildSlot
	 */
	 public static ims.scheduling.vo.SessionTheatreFixedSlotForSessionManagementVo create(ims.scheduling.domain.objects.SessionParentChildSlot domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.scheduling.domain.objects.SessionParentChildSlot object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.scheduling.vo.SessionTheatreFixedSlotForSessionManagementVo create(DomainObjectMap map, ims.scheduling.domain.objects.SessionParentChildSlot domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.scheduling.vo.SessionTheatreFixedSlotForSessionManagementVo valueObject = (ims.scheduling.vo.SessionTheatreFixedSlotForSessionManagementVo) map.getValueObject(domainObject, ims.scheduling.vo.SessionTheatreFixedSlotForSessionManagementVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.scheduling.vo.SessionTheatreFixedSlotForSessionManagementVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.scheduling.domain.objects.SessionParentChildSlot
	 */
	 public static ims.scheduling.vo.SessionTheatreFixedSlotForSessionManagementVo insert(ims.scheduling.vo.SessionTheatreFixedSlotForSessionManagementVo valueObject, ims.scheduling.domain.objects.SessionParentChildSlot domainObject) 
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
	 * @param domainObject ims.scheduling.domain.objects.SessionParentChildSlot
	 */
	 public static ims.scheduling.vo.SessionTheatreFixedSlotForSessionManagementVo insert(DomainObjectMap map, ims.scheduling.vo.SessionTheatreFixedSlotForSessionManagementVo valueObject, ims.scheduling.domain.objects.SessionParentChildSlot domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_SessionParentChildSlot(domainObject.getId());
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
			
		// StartTime
		String StartTime = domainObject.getStartTime();
		if ( null != StartTime ) 
		{
			valueObject.setStartTime(new ims.framework.utils.Time(StartTime) );
		}
		// isActive
		valueObject.setIsActive( domainObject.isIsActive() );
		// Appointment
		valueObject.setAppointment(ims.scheduling.vo.domain.BookingAppointmentForSessionManagementVoAssembler.create(map, domainObject.getAppointment()) );
		// Duration
		valueObject.setDuration(domainObject.getDuration());
		// Comment
		valueObject.setComment(domainObject.getComment());
		// Status
		ims.domain.lookups.LookupInstance instance6 = domainObject.getStatus();
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
			valueObject.setStatus(voLookup6);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.scheduling.domain.objects.SessionParentChildSlot extractSessionParentChildSlot(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionTheatreFixedSlotForSessionManagementVo valueObject) 
	{
		return 	extractSessionParentChildSlot(domainFactory, valueObject, new HashMap());
	}

	public static ims.scheduling.domain.objects.SessionParentChildSlot extractSessionParentChildSlot(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionTheatreFixedSlotForSessionManagementVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_SessionParentChildSlot();
		ims.scheduling.domain.objects.SessionParentChildSlot domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.scheduling.domain.objects.SessionParentChildSlot)domMap.get(valueObject);
			}
			// ims.scheduling.vo.SessionTheatreFixedSlotForSessionManagementVo ID_SessionParentChildSlot field is unknown
			domainObject = new ims.scheduling.domain.objects.SessionParentChildSlot();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_SessionParentChildSlot());
			if (domMap.get(key) != null)
			{
				return (ims.scheduling.domain.objects.SessionParentChildSlot)domMap.get(key);
			}
			domainObject = (ims.scheduling.domain.objects.SessionParentChildSlot) domainFactory.getDomainObject(ims.scheduling.domain.objects.SessionParentChildSlot.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_SessionParentChildSlot());

		ims.framework.utils.Time time1 = valueObject.getStartTime();
		String value1 = null;
		if ( time1 != null ) 
		{
			value1 = time1.toString();
		}
		domainObject.setStartTime(value1);
		domainObject.setIsActive(valueObject.getIsActive());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.scheduling.domain.objects.Booking_Appointment value3 = null;
		if ( null != valueObject.getAppointment() ) 
		{
			if (valueObject.getAppointment().getBoId() == null)
			{
				if (domMap.get(valueObject.getAppointment()) != null)
				{
					value3 = (ims.scheduling.domain.objects.Booking_Appointment)domMap.get(valueObject.getAppointment());
				}
			}
			else
			{
				value3 = (ims.scheduling.domain.objects.Booking_Appointment)domainFactory.getDomainObject(ims.scheduling.domain.objects.Booking_Appointment.class, valueObject.getAppointment().getBoId());
			}
		}
		domainObject.setAppointment(value3);
		domainObject.setDuration(valueObject.getDuration());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getComment() != null && valueObject.getComment().equals(""))
		{
			valueObject.setComment(null);
		}
		domainObject.setComment(valueObject.getComment());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getStatus() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getStatus().getID());
		}
		domainObject.setStatus(value6);

		return domainObject;
	}

}
