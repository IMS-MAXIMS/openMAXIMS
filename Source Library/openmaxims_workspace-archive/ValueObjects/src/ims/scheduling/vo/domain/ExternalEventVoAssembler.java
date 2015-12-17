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
 * @author Michael Noonan
 */
public class ExternalEventVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.scheduling.vo.ExternalEventVo copy(ims.scheduling.vo.ExternalEventVo valueObjectDest, ims.scheduling.vo.ExternalEventVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ExternalSystemEvent(valueObjectSrc.getID_ExternalSystemEvent());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// EventType
		valueObjectDest.setEventType(valueObjectSrc.getEventType());
		// Appointment
		valueObjectDest.setAppointment(valueObjectSrc.getAppointment());
		// wasProcessed
		valueObjectDest.setWasProcessed(valueObjectSrc.getWasProcessed());
		// ProviderSystem
		valueObjectDest.setProviderSystem(valueObjectSrc.getProviderSystem());
		// messageStatus
		valueObjectDest.setMessageStatus(valueObjectSrc.getMessageStatus());
		// msgText
		valueObjectDest.setMsgText(valueObjectSrc.getMsgText());
		// failureMsg
		valueObjectDest.setFailureMsg(valueObjectSrc.getFailureMsg());
		// ProcessedDateTime
		valueObjectDest.setProcessedDateTime(valueObjectSrc.getProcessedDateTime());
		// Investigation
		valueObjectDest.setInvestigation(valueObjectSrc.getInvestigation());
		// ackText
		valueObjectDest.setAckText(valueObjectSrc.getAckText());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createExternalEventVoCollectionFromExternalSystemEvent(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.ExternalSystemEvent objects.
	 */
	public static ims.scheduling.vo.ExternalEventVoCollection createExternalEventVoCollectionFromExternalSystemEvent(java.util.Set domainObjectSet)	
	{
		return createExternalEventVoCollectionFromExternalSystemEvent(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.ExternalSystemEvent objects.
	 */
	public static ims.scheduling.vo.ExternalEventVoCollection createExternalEventVoCollectionFromExternalSystemEvent(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.scheduling.vo.ExternalEventVoCollection voList = new ims.scheduling.vo.ExternalEventVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.scheduling.domain.objects.ExternalSystemEvent domainObject = (ims.scheduling.domain.objects.ExternalSystemEvent) iterator.next();
			ims.scheduling.vo.ExternalEventVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.scheduling.domain.objects.ExternalSystemEvent objects.
	 */
	public static ims.scheduling.vo.ExternalEventVoCollection createExternalEventVoCollectionFromExternalSystemEvent(java.util.List domainObjectList) 
	{
		return createExternalEventVoCollectionFromExternalSystemEvent(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.scheduling.domain.objects.ExternalSystemEvent objects.
	 */
	public static ims.scheduling.vo.ExternalEventVoCollection createExternalEventVoCollectionFromExternalSystemEvent(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.scheduling.vo.ExternalEventVoCollection voList = new ims.scheduling.vo.ExternalEventVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.scheduling.domain.objects.ExternalSystemEvent domainObject = (ims.scheduling.domain.objects.ExternalSystemEvent) domainObjectList.get(i);
			ims.scheduling.vo.ExternalEventVo vo = create(map, domainObject);

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
	 * Create the ims.scheduling.domain.objects.ExternalSystemEvent set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractExternalSystemEventSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.ExternalEventVoCollection voCollection) 
	 {
	 	return extractExternalSystemEventSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractExternalSystemEventSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.ExternalEventVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.ExternalEventVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.ExternalSystemEvent domainObject = ExternalEventVoAssembler.extractExternalSystemEvent(domainFactory, vo, domMap);

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
	 * Create the ims.scheduling.domain.objects.ExternalSystemEvent list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractExternalSystemEventList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.ExternalEventVoCollection voCollection) 
	 {
	 	return extractExternalSystemEventList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractExternalSystemEventList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.ExternalEventVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.ExternalEventVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.ExternalSystemEvent domainObject = ExternalEventVoAssembler.extractExternalSystemEvent(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.scheduling.domain.objects.ExternalSystemEvent object.
	 * @param domainObject ims.scheduling.domain.objects.ExternalSystemEvent
	 */
	 public static ims.scheduling.vo.ExternalEventVo create(ims.scheduling.domain.objects.ExternalSystemEvent domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.scheduling.domain.objects.ExternalSystemEvent object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.scheduling.vo.ExternalEventVo create(DomainObjectMap map, ims.scheduling.domain.objects.ExternalSystemEvent domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.scheduling.vo.ExternalEventVo valueObject = (ims.scheduling.vo.ExternalEventVo) map.getValueObject(domainObject, ims.scheduling.vo.ExternalEventVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.scheduling.vo.ExternalEventVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.scheduling.domain.objects.ExternalSystemEvent
	 */
	 public static ims.scheduling.vo.ExternalEventVo insert(ims.scheduling.vo.ExternalEventVo valueObject, ims.scheduling.domain.objects.ExternalSystemEvent domainObject) 
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
	 * @param domainObject ims.scheduling.domain.objects.ExternalSystemEvent
	 */
	 public static ims.scheduling.vo.ExternalEventVo insert(DomainObjectMap map, ims.scheduling.vo.ExternalEventVo valueObject, ims.scheduling.domain.objects.ExternalSystemEvent domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ExternalSystemEvent(domainObject.getId());
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
			
		// EventType
		ims.domain.lookups.LookupInstance instance1 = domainObject.getEventType();
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

			ims.scheduling.vo.lookups.ExternalSystemEventTypes voLookup1 = new ims.scheduling.vo.lookups.ExternalSystemEventTypes(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.scheduling.vo.lookups.ExternalSystemEventTypes parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.scheduling.vo.lookups.ExternalSystemEventTypes(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setEventType(voLookup1);
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
		// wasProcessed
		valueObject.setWasProcessed( domainObject.isWasProcessed() );
		// ProviderSystem
		valueObject.setProviderSystem(ims.ocrr.vo.domain.ProviderSystemVoAssembler.create(map, domainObject.getProviderSystem()) );
		// messageStatus
		ims.domain.lookups.LookupInstance instance5 = domainObject.getMessageStatus();
		if ( null != instance5 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance5.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance5.getImage().getImageId(), instance5.getImage().getImagePath());
			}
			color = instance5.getColor();
			if (color != null) 
				color.getValue();

			ims.ocrr.vo.lookups.OrderMessageStatus voLookup5 = new ims.ocrr.vo.lookups.OrderMessageStatus(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.ocrr.vo.lookups.OrderMessageStatus parentVoLookup5 = voLookup5;
			ims.domain.lookups.LookupInstance parent5 = instance5.getParent();
			while (parent5 != null)
			{
				if (parent5.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent5.getImage().getImageId(), parent5.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent5.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup5.setParent(new ims.ocrr.vo.lookups.OrderMessageStatus(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setMessageStatus(voLookup5);
		}
				// msgText
		valueObject.setMsgText(domainObject.getMsgText());
		// failureMsg
		valueObject.setFailureMsg(domainObject.getFailureMsg());
		// ProcessedDateTime
		java.util.Date ProcessedDateTime = domainObject.getProcessedDateTime();
		if ( null != ProcessedDateTime ) 
		{
			valueObject.setProcessedDateTime(new ims.framework.utils.DateTime(ProcessedDateTime) );
		}
		// Investigation
		if (domainObject.getInvestigation() != null)
		{
			if(domainObject.getInvestigation() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getInvestigation();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setInvestigation(new ims.ocrr.orderingresults.vo.OrderInvestigationRefVo(id, -1));				
			}
			else
			{
				valueObject.setInvestigation(new ims.ocrr.orderingresults.vo.OrderInvestigationRefVo(domainObject.getInvestigation().getId(), domainObject.getInvestigation().getVersion()));
			}
		}
		// ackText
		valueObject.setAckText(domainObject.getAckText());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.scheduling.domain.objects.ExternalSystemEvent extractExternalSystemEvent(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.ExternalEventVo valueObject) 
	{
		return 	extractExternalSystemEvent(domainFactory, valueObject, new HashMap());
	}

	public static ims.scheduling.domain.objects.ExternalSystemEvent extractExternalSystemEvent(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.ExternalEventVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ExternalSystemEvent();
		ims.scheduling.domain.objects.ExternalSystemEvent domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.scheduling.domain.objects.ExternalSystemEvent)domMap.get(valueObject);
			}
			// ims.scheduling.vo.ExternalEventVo ID_ExternalSystemEvent field is unknown
			domainObject = new ims.scheduling.domain.objects.ExternalSystemEvent();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ExternalSystemEvent());
			if (domMap.get(key) != null)
			{
				return (ims.scheduling.domain.objects.ExternalSystemEvent)domMap.get(key);
			}
			domainObject = (ims.scheduling.domain.objects.ExternalSystemEvent) domainFactory.getDomainObject(ims.scheduling.domain.objects.ExternalSystemEvent.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ExternalSystemEvent());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getEventType() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getEventType().getID());
		}
		domainObject.setEventType(value1);
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
		domainObject.setWasProcessed(valueObject.getWasProcessed());
		domainObject.setProviderSystem(ims.ocrr.vo.domain.ProviderSystemVoAssembler.extractProviderSystem(domainFactory, valueObject.getProviderSystem(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getMessageStatus() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getMessageStatus().getID());
		}
		domainObject.setMessageStatus(value5);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getMsgText() != null && valueObject.getMsgText().equals(""))
		{
			valueObject.setMsgText(null);
		}
		domainObject.setMsgText(valueObject.getMsgText());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getFailureMsg() != null && valueObject.getFailureMsg().equals(""))
		{
			valueObject.setFailureMsg(null);
		}
		domainObject.setFailureMsg(valueObject.getFailureMsg());
		ims.framework.utils.DateTime dateTime8 = valueObject.getProcessedDateTime();
		java.util.Date value8 = null;
		if ( dateTime8 != null ) 
		{
			value8 = dateTime8.getJavaDate();
		}
		domainObject.setProcessedDateTime(value8);
		ims.ocrr.orderingresults.domain.objects.OrderInvestigation value9 = null;
		if ( null != valueObject.getInvestigation() ) 
		{
			if (valueObject.getInvestigation().getBoId() == null)
			{
				if (domMap.get(valueObject.getInvestigation()) != null)
				{
					value9 = (ims.ocrr.orderingresults.domain.objects.OrderInvestigation)domMap.get(valueObject.getInvestigation());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value9 = domainObject.getInvestigation();	
			}
			else
			{
				value9 = (ims.ocrr.orderingresults.domain.objects.OrderInvestigation)domainFactory.getDomainObject(ims.ocrr.orderingresults.domain.objects.OrderInvestigation.class, valueObject.getInvestigation().getBoId());
			}
		}
		domainObject.setInvestigation(value9);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getAckText() != null && valueObject.getAckText().equals(""))
		{
			valueObject.setAckText(null);
		}
		domainObject.setAckText(valueObject.getAckText());

		return domainObject;
	}

}
