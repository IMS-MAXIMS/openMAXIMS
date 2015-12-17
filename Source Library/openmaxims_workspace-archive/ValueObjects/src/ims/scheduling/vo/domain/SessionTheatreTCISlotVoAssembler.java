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
public class SessionTheatreTCISlotVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.scheduling.vo.SessionTheatreTCISlotVo copy(ims.scheduling.vo.SessionTheatreTCISlotVo valueObjectDest, ims.scheduling.vo.SessionTheatreTCISlotVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_SessionTheatreTCISlot(valueObjectSrc.getID_SessionTheatreTCISlot());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// isActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
		// profileSlot
		valueObjectDest.setProfileSlot(valueObjectSrc.getProfileSlot());
		// sessDateTime
		valueObjectDest.setSessDateTime(valueObjectSrc.getSessDateTime());
		// StatusReason
		valueObjectDest.setStatusReason(valueObjectSrc.getStatusReason());
		// Session
		valueObjectDest.setSession(valueObjectSrc.getSession());
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
 	 * If more than one call to an Assembler is made then #createSessionTheatreTCISlotVoCollectionFromSessionTheatreTCISlot(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.SessionTheatreTCISlot objects.
	 */
	public static ims.scheduling.vo.SessionTheatreTCISlotVoCollection createSessionTheatreTCISlotVoCollectionFromSessionTheatreTCISlot(java.util.Set domainObjectSet)	
	{
		return createSessionTheatreTCISlotVoCollectionFromSessionTheatreTCISlot(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.SessionTheatreTCISlot objects.
	 */
	public static ims.scheduling.vo.SessionTheatreTCISlotVoCollection createSessionTheatreTCISlotVoCollectionFromSessionTheatreTCISlot(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.scheduling.vo.SessionTheatreTCISlotVoCollection voList = new ims.scheduling.vo.SessionTheatreTCISlotVoCollection();
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
			ims.scheduling.vo.SessionTheatreTCISlotVo vo = create(map, domainObject);
			
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
	public static ims.scheduling.vo.SessionTheatreTCISlotVoCollection createSessionTheatreTCISlotVoCollectionFromSessionTheatreTCISlot(java.util.List domainObjectList) 
	{
		return createSessionTheatreTCISlotVoCollectionFromSessionTheatreTCISlot(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.scheduling.domain.objects.SessionTheatreTCISlot objects.
	 */
	public static ims.scheduling.vo.SessionTheatreTCISlotVoCollection createSessionTheatreTCISlotVoCollectionFromSessionTheatreTCISlot(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.scheduling.vo.SessionTheatreTCISlotVoCollection voList = new ims.scheduling.vo.SessionTheatreTCISlotVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.scheduling.domain.objects.SessionTheatreTCISlot domainObject = (ims.scheduling.domain.objects.SessionTheatreTCISlot) domainObjectList.get(i);
			ims.scheduling.vo.SessionTheatreTCISlotVo vo = create(map, domainObject);

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
	 public static java.util.Set extractSessionTheatreTCISlotSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionTheatreTCISlotVoCollection voCollection) 
	 {
	 	return extractSessionTheatreTCISlotSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractSessionTheatreTCISlotSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionTheatreTCISlotVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.SessionTheatreTCISlotVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.SessionTheatreTCISlot domainObject = SessionTheatreTCISlotVoAssembler.extractSessionTheatreTCISlot(domainFactory, vo, domMap);

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
	 public static java.util.List extractSessionTheatreTCISlotList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionTheatreTCISlotVoCollection voCollection) 
	 {
	 	return extractSessionTheatreTCISlotList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractSessionTheatreTCISlotList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionTheatreTCISlotVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.SessionTheatreTCISlotVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.SessionTheatreTCISlot domainObject = SessionTheatreTCISlotVoAssembler.extractSessionTheatreTCISlot(domainFactory, vo, domMap);

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
	 public static ims.scheduling.vo.SessionTheatreTCISlotVo create(ims.scheduling.domain.objects.SessionTheatreTCISlot domainObject) 
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
	  public static ims.scheduling.vo.SessionTheatreTCISlotVo create(DomainObjectMap map, ims.scheduling.domain.objects.SessionTheatreTCISlot domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.scheduling.vo.SessionTheatreTCISlotVo valueObject = (ims.scheduling.vo.SessionTheatreTCISlotVo) map.getValueObject(domainObject, ims.scheduling.vo.SessionTheatreTCISlotVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.scheduling.vo.SessionTheatreTCISlotVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.scheduling.vo.SessionTheatreTCISlotVo insert(ims.scheduling.vo.SessionTheatreTCISlotVo valueObject, ims.scheduling.domain.objects.SessionTheatreTCISlot domainObject) 
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
	 public static ims.scheduling.vo.SessionTheatreTCISlotVo insert(DomainObjectMap map, ims.scheduling.vo.SessionTheatreTCISlotVo valueObject, ims.scheduling.domain.objects.SessionTheatreTCISlot domainObject) 
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
			
		// isActive
		valueObject.setIsActive( domainObject.isIsActive() );
		// profileSlot
		if (domainObject.getProfileSlot() != null)
		{
			if(domainObject.getProfileSlot() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getProfileSlot();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setProfileSlot(new ims.scheduling.vo.ProfileTheatreTCISlotRefVo(id, -1));				
			}
			else
			{
				valueObject.setProfileSlot(new ims.scheduling.vo.ProfileTheatreTCISlotRefVo(domainObject.getProfileSlot().getId(), domainObject.getProfileSlot().getVersion()));
			}
		}
		// sessDateTime
		java.util.Date sessDateTime = domainObject.getSessDateTime();
		if ( null != sessDateTime ) 
		{
			valueObject.setSessDateTime(new ims.framework.utils.DateTime(sessDateTime) );
		}
		// StatusReason
		ims.domain.lookups.LookupInstance instance4 = domainObject.getStatusReason();
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
			valueObject.setStatusReason(voLookup4);
		}
				// Session
		if (domainObject.getSession() != null)
		{
			if(domainObject.getSession() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getSession();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setSession(new ims.scheduling.vo.Sch_SessionRefVo(id, -1));				
			}
			else
			{
				valueObject.setSession(new ims.scheduling.vo.Sch_SessionRefVo(domainObject.getSession().getId(), domainObject.getSession().getVersion()));
			}
		}
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
		ims.domain.lookups.LookupInstance instance8 = domainObject.getStatus();
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

			ims.scheduling.vo.lookups.Status_Reason voLookup8 = new ims.scheduling.vo.lookups.Status_Reason(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.scheduling.vo.lookups.Status_Reason parentVoLookup8 = voLookup8;
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
								parentVoLookup8.setParent(new ims.scheduling.vo.lookups.Status_Reason(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setStatus(voLookup8);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.scheduling.domain.objects.SessionTheatreTCISlot extractSessionTheatreTCISlot(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionTheatreTCISlotVo valueObject) 
	{
		return 	extractSessionTheatreTCISlot(domainFactory, valueObject, new HashMap());
	}

	public static ims.scheduling.domain.objects.SessionTheatreTCISlot extractSessionTheatreTCISlot(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionTheatreTCISlotVo valueObject, HashMap domMap) 
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
			// ims.scheduling.vo.SessionTheatreTCISlotVo ID_SessionTheatreTCISlot field is unknown
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

		domainObject.setIsActive(valueObject.getIsActive());
		ims.scheduling.domain.objects.ProfileTheatreTCISlot value2 = null;
		if ( null != valueObject.getProfileSlot() ) 
		{
			if (valueObject.getProfileSlot().getBoId() == null)
			{
				if (domMap.get(valueObject.getProfileSlot()) != null)
				{
					value2 = (ims.scheduling.domain.objects.ProfileTheatreTCISlot)domMap.get(valueObject.getProfileSlot());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getProfileSlot();	
			}
			else
			{
				value2 = (ims.scheduling.domain.objects.ProfileTheatreTCISlot)domainFactory.getDomainObject(ims.scheduling.domain.objects.ProfileTheatreTCISlot.class, valueObject.getProfileSlot().getBoId());
			}
		}
		domainObject.setProfileSlot(value2);
		ims.framework.utils.DateTime dateTime3 = valueObject.getSessDateTime();
		java.util.Date value3 = null;
		if ( dateTime3 != null ) 
		{
			value3 = dateTime3.getJavaDate();
		}
		domainObject.setSessDateTime(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getStatusReason() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getStatusReason().getID());
		}
		domainObject.setStatusReason(value4);
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
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value5 = domainObject.getSession();	
			}
			else
			{
				value5 = (ims.scheduling.domain.objects.Sch_Session)domainFactory.getDomainObject(ims.scheduling.domain.objects.Sch_Session.class, valueObject.getSession().getBoId());
			}
		}
		domainObject.setSession(value5);
		ims.framework.utils.Time time6 = valueObject.getToComeInTime();
		String value6 = null;
		if ( time6 != null ) 
		{
			value6 = time6.toString();
		}
		domainObject.setToComeInTime(value6);
		ims.scheduling.domain.objects.Booking_Appointment value7 = null;
		if ( null != valueObject.getAppointment() ) 
		{
			if (valueObject.getAppointment().getBoId() == null)
			{
				if (domMap.get(valueObject.getAppointment()) != null)
				{
					value7 = (ims.scheduling.domain.objects.Booking_Appointment)domMap.get(valueObject.getAppointment());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value7 = domainObject.getAppointment();	
			}
			else
			{
				value7 = (ims.scheduling.domain.objects.Booking_Appointment)domainFactory.getDomainObject(ims.scheduling.domain.objects.Booking_Appointment.class, valueObject.getAppointment().getBoId());
			}
		}
		domainObject.setAppointment(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getStatus() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getStatus().getID());
		}
		domainObject.setStatus(value8);

		return domainObject;
	}

}
