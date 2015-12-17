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
 * @author Cristian Belciug
 */
public class Appt_Tracking_Status_HistoryVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.scheduling.vo.Appt_Tracking_Status_HistoryVo copy(ims.scheduling.vo.Appt_Tracking_Status_HistoryVo valueObjectDest, ims.scheduling.vo.Appt_Tracking_Status_HistoryVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Appt_Tracking_Status_History(valueObjectSrc.getID_Appt_Tracking_Status_History());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// TrackingStatus
		valueObjectDest.setTrackingStatus(valueObjectSrc.getTrackingStatus());
		// ApptDate
		valueObjectDest.setApptDate(valueObjectSrc.getApptDate());
		// ApptTime
		valueObjectDest.setApptTime(valueObjectSrc.getApptTime());
		// StatusChangeDateTime
		valueObjectDest.setStatusChangeDateTime(valueObjectSrc.getStatusChangeDateTime());
		// ChangedBy
		valueObjectDest.setChangedBy(valueObjectSrc.getChangedBy());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createAppt_Tracking_Status_HistoryVoCollectionFromAppt_Tracking_Status_History(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.Appt_Tracking_Status_History objects.
	 */
	public static ims.scheduling.vo.Appt_Tracking_Status_HistoryVoCollection createAppt_Tracking_Status_HistoryVoCollectionFromAppt_Tracking_Status_History(java.util.Set domainObjectSet)	
	{
		return createAppt_Tracking_Status_HistoryVoCollectionFromAppt_Tracking_Status_History(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.Appt_Tracking_Status_History objects.
	 */
	public static ims.scheduling.vo.Appt_Tracking_Status_HistoryVoCollection createAppt_Tracking_Status_HistoryVoCollectionFromAppt_Tracking_Status_History(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.scheduling.vo.Appt_Tracking_Status_HistoryVoCollection voList = new ims.scheduling.vo.Appt_Tracking_Status_HistoryVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.scheduling.domain.objects.Appt_Tracking_Status_History domainObject = (ims.scheduling.domain.objects.Appt_Tracking_Status_History) iterator.next();
			ims.scheduling.vo.Appt_Tracking_Status_HistoryVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.scheduling.domain.objects.Appt_Tracking_Status_History objects.
	 */
	public static ims.scheduling.vo.Appt_Tracking_Status_HistoryVoCollection createAppt_Tracking_Status_HistoryVoCollectionFromAppt_Tracking_Status_History(java.util.List domainObjectList) 
	{
		return createAppt_Tracking_Status_HistoryVoCollectionFromAppt_Tracking_Status_History(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.scheduling.domain.objects.Appt_Tracking_Status_History objects.
	 */
	public static ims.scheduling.vo.Appt_Tracking_Status_HistoryVoCollection createAppt_Tracking_Status_HistoryVoCollectionFromAppt_Tracking_Status_History(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.scheduling.vo.Appt_Tracking_Status_HistoryVoCollection voList = new ims.scheduling.vo.Appt_Tracking_Status_HistoryVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.scheduling.domain.objects.Appt_Tracking_Status_History domainObject = (ims.scheduling.domain.objects.Appt_Tracking_Status_History) domainObjectList.get(i);
			ims.scheduling.vo.Appt_Tracking_Status_HistoryVo vo = create(map, domainObject);

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
	 * Create the ims.scheduling.domain.objects.Appt_Tracking_Status_History set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractAppt_Tracking_Status_HistorySet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.Appt_Tracking_Status_HistoryVoCollection voCollection) 
	 {
	 	return extractAppt_Tracking_Status_HistorySet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractAppt_Tracking_Status_HistorySet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.Appt_Tracking_Status_HistoryVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.Appt_Tracking_Status_HistoryVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.Appt_Tracking_Status_History domainObject = Appt_Tracking_Status_HistoryVoAssembler.extractAppt_Tracking_Status_History(domainFactory, vo, domMap);

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
	 * Create the ims.scheduling.domain.objects.Appt_Tracking_Status_History list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractAppt_Tracking_Status_HistoryList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.Appt_Tracking_Status_HistoryVoCollection voCollection) 
	 {
	 	return extractAppt_Tracking_Status_HistoryList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractAppt_Tracking_Status_HistoryList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.Appt_Tracking_Status_HistoryVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.Appt_Tracking_Status_HistoryVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.Appt_Tracking_Status_History domainObject = Appt_Tracking_Status_HistoryVoAssembler.extractAppt_Tracking_Status_History(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.scheduling.domain.objects.Appt_Tracking_Status_History object.
	 * @param domainObject ims.scheduling.domain.objects.Appt_Tracking_Status_History
	 */
	 public static ims.scheduling.vo.Appt_Tracking_Status_HistoryVo create(ims.scheduling.domain.objects.Appt_Tracking_Status_History domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.scheduling.domain.objects.Appt_Tracking_Status_History object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.scheduling.vo.Appt_Tracking_Status_HistoryVo create(DomainObjectMap map, ims.scheduling.domain.objects.Appt_Tracking_Status_History domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.scheduling.vo.Appt_Tracking_Status_HistoryVo valueObject = (ims.scheduling.vo.Appt_Tracking_Status_HistoryVo) map.getValueObject(domainObject, ims.scheduling.vo.Appt_Tracking_Status_HistoryVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.scheduling.vo.Appt_Tracking_Status_HistoryVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.scheduling.domain.objects.Appt_Tracking_Status_History
	 */
	 public static ims.scheduling.vo.Appt_Tracking_Status_HistoryVo insert(ims.scheduling.vo.Appt_Tracking_Status_HistoryVo valueObject, ims.scheduling.domain.objects.Appt_Tracking_Status_History domainObject) 
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
	 * @param domainObject ims.scheduling.domain.objects.Appt_Tracking_Status_History
	 */
	 public static ims.scheduling.vo.Appt_Tracking_Status_HistoryVo insert(DomainObjectMap map, ims.scheduling.vo.Appt_Tracking_Status_HistoryVo valueObject, ims.scheduling.domain.objects.Appt_Tracking_Status_History domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Appt_Tracking_Status_History(domainObject.getId());
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
			
		// TrackingStatus
		ims.domain.lookups.LookupInstance instance1 = domainObject.getTrackingStatus();
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

			ims.scheduling.vo.lookups.AppointmentTrackingStatus voLookup1 = new ims.scheduling.vo.lookups.AppointmentTrackingStatus(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.scheduling.vo.lookups.AppointmentTrackingStatus parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.scheduling.vo.lookups.AppointmentTrackingStatus(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setTrackingStatus(voLookup1);
		}
				// ApptDate
		java.util.Date ApptDate = domainObject.getApptDate();
		if ( null != ApptDate ) 
		{
			valueObject.setApptDate(new ims.framework.utils.Date(ApptDate) );
		}
		// ApptTime
		String ApptTime = domainObject.getApptTime();
		if ( null != ApptTime ) 
		{
			valueObject.setApptTime(new ims.framework.utils.Time(ApptTime) );
		}
		// StatusChangeDateTime
		java.util.Date StatusChangeDateTime = domainObject.getStatusChangeDateTime();
		if ( null != StatusChangeDateTime ) 
		{
			valueObject.setStatusChangeDateTime(new ims.framework.utils.DateTime(StatusChangeDateTime) );
		}
		// ChangedBy
		if (domainObject.getChangedBy() != null)
		{
			if(domainObject.getChangedBy() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getChangedBy();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setChangedBy(new ims.core.resource.people.vo.MemberOfStaffRefVo(id, -1));				
			}
			else
			{
				valueObject.setChangedBy(new ims.core.resource.people.vo.MemberOfStaffRefVo(domainObject.getChangedBy().getId(), domainObject.getChangedBy().getVersion()));
			}
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.scheduling.domain.objects.Appt_Tracking_Status_History extractAppt_Tracking_Status_History(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.Appt_Tracking_Status_HistoryVo valueObject) 
	{
		return 	extractAppt_Tracking_Status_History(domainFactory, valueObject, new HashMap());
	}

	public static ims.scheduling.domain.objects.Appt_Tracking_Status_History extractAppt_Tracking_Status_History(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.Appt_Tracking_Status_HistoryVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Appt_Tracking_Status_History();
		ims.scheduling.domain.objects.Appt_Tracking_Status_History domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.scheduling.domain.objects.Appt_Tracking_Status_History)domMap.get(valueObject);
			}
			// ims.scheduling.vo.Appt_Tracking_Status_HistoryVo ID_Appt_Tracking_Status_History field is unknown
			domainObject = new ims.scheduling.domain.objects.Appt_Tracking_Status_History();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Appt_Tracking_Status_History());
			if (domMap.get(key) != null)
			{
				return (ims.scheduling.domain.objects.Appt_Tracking_Status_History)domMap.get(key);
			}
			domainObject = (ims.scheduling.domain.objects.Appt_Tracking_Status_History) domainFactory.getDomainObject(ims.scheduling.domain.objects.Appt_Tracking_Status_History.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Appt_Tracking_Status_History());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getTrackingStatus() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getTrackingStatus().getID());
		}
		domainObject.setTrackingStatus(value1);
		java.util.Date value2 = null;
		ims.framework.utils.Date date2 = valueObject.getApptDate();		
		if ( date2 != null ) 
		{
			value2 = date2.getDate();
		}
		domainObject.setApptDate(value2);
		ims.framework.utils.Time time3 = valueObject.getApptTime();
		String value3 = null;
		if ( time3 != null ) 
		{
			value3 = time3.toString();
		}
		domainObject.setApptTime(value3);
		ims.framework.utils.DateTime dateTime4 = valueObject.getStatusChangeDateTime();
		java.util.Date value4 = null;
		if ( dateTime4 != null ) 
		{
			value4 = dateTime4.getJavaDate();
		}
		domainObject.setStatusChangeDateTime(value4);
		ims.core.resource.people.domain.objects.MemberOfStaff value5 = null;
		if ( null != valueObject.getChangedBy() ) 
		{
			if (valueObject.getChangedBy().getBoId() == null)
			{
				if (domMap.get(valueObject.getChangedBy()) != null)
				{
					value5 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getChangedBy());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value5 = domainObject.getChangedBy();	
			}
			else
			{
				value5 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getChangedBy().getBoId());
			}
		}
		domainObject.setChangedBy(value5);

		return domainObject;
	}

}
