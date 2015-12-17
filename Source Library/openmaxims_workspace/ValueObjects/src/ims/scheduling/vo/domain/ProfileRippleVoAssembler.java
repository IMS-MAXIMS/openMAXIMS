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
 * @author Barbara Worwood
 */
public class ProfileRippleVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.scheduling.vo.ProfileRippleVo copy(ims.scheduling.vo.ProfileRippleVo valueObjectDest, ims.scheduling.vo.ProfileRippleVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ProfileRipple(valueObjectSrc.getID_ProfileRipple());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// DateTimeRequested
		valueObjectDest.setDateTimeRequested(valueObjectSrc.getDateTimeRequested());
		// EffectiveFromDate
		valueObjectDest.setEffectiveFromDate(valueObjectSrc.getEffectiveFromDate());
		// StartTime
		valueObjectDest.setStartTime(valueObjectSrc.getStartTime());
		// EndTime
		valueObjectDest.setEndTime(valueObjectSrc.getEndTime());
		// ListOwners
		valueObjectDest.setListOwners(valueObjectSrc.getListOwners());
		// InactiveSlots
		valueObjectDest.setInactiveSlots(valueObjectSrc.getInactiveSlots());
		// NewSlots
		valueObjectDest.setNewSlots(valueObjectSrc.getNewSlots());
		// DateTimeActivated
		valueObjectDest.setDateTimeActivated(valueObjectSrc.getDateTimeActivated());
		// NumberOfSessions
		valueObjectDest.setNumberOfSessions(valueObjectSrc.getNumberOfSessions());
		// Profile
		valueObjectDest.setProfile(valueObjectSrc.getProfile());
		// Active
		valueObjectDest.setActive(valueObjectSrc.getActive());
		// Details
		valueObjectDest.setDetails(valueObjectSrc.getDetails());
		// CancellationReason
		valueObjectDest.setCancellationReason(valueObjectSrc.getCancellationReason());
		// Name
		valueObjectDest.setName(valueObjectSrc.getName());
		// Description
		valueObjectDest.setDescription(valueObjectSrc.getDescription());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createProfileRippleVoCollectionFromProfileRipple(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.ProfileRipple objects.
	 */
	public static ims.scheduling.vo.ProfileRippleVoCollection createProfileRippleVoCollectionFromProfileRipple(java.util.Set domainObjectSet)	
	{
		return createProfileRippleVoCollectionFromProfileRipple(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.ProfileRipple objects.
	 */
	public static ims.scheduling.vo.ProfileRippleVoCollection createProfileRippleVoCollectionFromProfileRipple(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.scheduling.vo.ProfileRippleVoCollection voList = new ims.scheduling.vo.ProfileRippleVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.scheduling.domain.objects.ProfileRipple domainObject = (ims.scheduling.domain.objects.ProfileRipple) iterator.next();
			ims.scheduling.vo.ProfileRippleVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.scheduling.domain.objects.ProfileRipple objects.
	 */
	public static ims.scheduling.vo.ProfileRippleVoCollection createProfileRippleVoCollectionFromProfileRipple(java.util.List domainObjectList) 
	{
		return createProfileRippleVoCollectionFromProfileRipple(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.scheduling.domain.objects.ProfileRipple objects.
	 */
	public static ims.scheduling.vo.ProfileRippleVoCollection createProfileRippleVoCollectionFromProfileRipple(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.scheduling.vo.ProfileRippleVoCollection voList = new ims.scheduling.vo.ProfileRippleVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.scheduling.domain.objects.ProfileRipple domainObject = (ims.scheduling.domain.objects.ProfileRipple) domainObjectList.get(i);
			ims.scheduling.vo.ProfileRippleVo vo = create(map, domainObject);

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
	 * Create the ims.scheduling.domain.objects.ProfileRipple set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractProfileRippleSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.ProfileRippleVoCollection voCollection) 
	 {
	 	return extractProfileRippleSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractProfileRippleSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.ProfileRippleVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.ProfileRippleVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.ProfileRipple domainObject = ProfileRippleVoAssembler.extractProfileRipple(domainFactory, vo, domMap);

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
	 * Create the ims.scheduling.domain.objects.ProfileRipple list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractProfileRippleList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.ProfileRippleVoCollection voCollection) 
	 {
	 	return extractProfileRippleList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractProfileRippleList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.ProfileRippleVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.ProfileRippleVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.ProfileRipple domainObject = ProfileRippleVoAssembler.extractProfileRipple(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.scheduling.domain.objects.ProfileRipple object.
	 * @param domainObject ims.scheduling.domain.objects.ProfileRipple
	 */
	 public static ims.scheduling.vo.ProfileRippleVo create(ims.scheduling.domain.objects.ProfileRipple domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.scheduling.domain.objects.ProfileRipple object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.scheduling.vo.ProfileRippleVo create(DomainObjectMap map, ims.scheduling.domain.objects.ProfileRipple domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.scheduling.vo.ProfileRippleVo valueObject = (ims.scheduling.vo.ProfileRippleVo) map.getValueObject(domainObject, ims.scheduling.vo.ProfileRippleVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.scheduling.vo.ProfileRippleVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.scheduling.domain.objects.ProfileRipple
	 */
	 public static ims.scheduling.vo.ProfileRippleVo insert(ims.scheduling.vo.ProfileRippleVo valueObject, ims.scheduling.domain.objects.ProfileRipple domainObject) 
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
	 * @param domainObject ims.scheduling.domain.objects.ProfileRipple
	 */
	 public static ims.scheduling.vo.ProfileRippleVo insert(DomainObjectMap map, ims.scheduling.vo.ProfileRippleVo valueObject, ims.scheduling.domain.objects.ProfileRipple domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ProfileRipple(domainObject.getId());
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
			
		// DateTimeRequested
		java.util.Date DateTimeRequested = domainObject.getDateTimeRequested();
		if ( null != DateTimeRequested ) 
		{
			valueObject.setDateTimeRequested(new ims.framework.utils.DateTime(DateTimeRequested) );
		}
		// EffectiveFromDate
		java.util.Date EffectiveFromDate = domainObject.getEffectiveFromDate();
		if ( null != EffectiveFromDate ) 
		{
			valueObject.setEffectiveFromDate(new ims.framework.utils.Date(EffectiveFromDate) );
		}
		// StartTime
		String StartTime = domainObject.getStartTime();
		if ( null != StartTime ) 
		{
			valueObject.setStartTime(new ims.framework.utils.Time(StartTime) );
		}
		// EndTime
		String EndTime = domainObject.getEndTime();
		if ( null != EndTime ) 
		{
			valueObject.setEndTime(new ims.framework.utils.Time(EndTime) );
		}
		// ListOwners
		valueObject.setListOwners(ims.scheduling.vo.domain.Profile_ListOwnerVoAssembler.createProfile_ListOwnerVoCollectionFromProfile_ListOwner(map, domainObject.getListOwners()) );
		// InactiveSlots
		valueObject.setInactiveSlots(ims.scheduling.vo.domain.Profile_SlotGenericVoAssembler.createProfile_SlotGenericVoCollectionFromProfile_Slot(map, domainObject.getInactiveSlots()) );
		// NewSlots
		valueObject.setNewSlots(ims.scheduling.vo.domain.Profile_SlotGenericVoAssembler.createProfile_SlotGenericVoCollectionFromProfile_Slot(map, domainObject.getNewSlots()) );
		// DateTimeActivated
		java.util.Date DateTimeActivated = domainObject.getDateTimeActivated();
		if ( null != DateTimeActivated ) 
		{
			valueObject.setDateTimeActivated(new ims.framework.utils.DateTime(DateTimeActivated) );
		}
		// NumberOfSessions
		valueObject.setNumberOfSessions(domainObject.getNumberOfSessions());
		// Profile
		valueObject.setProfile(ims.scheduling.vo.domain.ProfileForProfileRippleVoAssembler.create(map, domainObject.getProfile()) );
		// Active
		valueObject.setActive( domainObject.isActive() );
		// Details
		valueObject.setDetails(domainObject.getDetails());
		// CancellationReason
		ims.domain.lookups.LookupInstance instance13 = domainObject.getCancellationReason();
		if ( null != instance13 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance13.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance13.getImage().getImageId(), instance13.getImage().getImagePath());
			}
			color = instance13.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.CancelAppointmentReason voLookup13 = new ims.scheduling.vo.lookups.CancelAppointmentReason(instance13.getId(),instance13.getText(), instance13.isActive(), null, img, color);
			ims.scheduling.vo.lookups.CancelAppointmentReason parentVoLookup13 = voLookup13;
			ims.domain.lookups.LookupInstance parent13 = instance13.getParent();
			while (parent13 != null)
			{
				if (parent13.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent13.getImage().getImageId(), parent13.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent13.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup13.setParent(new ims.scheduling.vo.lookups.CancelAppointmentReason(parent13.getId(),parent13.getText(), parent13.isActive(), null, img, color));
				parentVoLookup13 = parentVoLookup13.getParent();
								parent13 = parent13.getParent();
			}			
			valueObject.setCancellationReason(voLookup13);
		}
				// Name
		valueObject.setName(domainObject.getName());
		// Description
		valueObject.setDescription(domainObject.getDescription());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.scheduling.domain.objects.ProfileRipple extractProfileRipple(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.ProfileRippleVo valueObject) 
	{
		return 	extractProfileRipple(domainFactory, valueObject, new HashMap());
	}

	public static ims.scheduling.domain.objects.ProfileRipple extractProfileRipple(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.ProfileRippleVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ProfileRipple();
		ims.scheduling.domain.objects.ProfileRipple domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.scheduling.domain.objects.ProfileRipple)domMap.get(valueObject);
			}
			// ims.scheduling.vo.ProfileRippleVo ID_ProfileRipple field is unknown
			domainObject = new ims.scheduling.domain.objects.ProfileRipple();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ProfileRipple());
			if (domMap.get(key) != null)
			{
				return (ims.scheduling.domain.objects.ProfileRipple)domMap.get(key);
			}
			domainObject = (ims.scheduling.domain.objects.ProfileRipple) domainFactory.getDomainObject(ims.scheduling.domain.objects.ProfileRipple.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ProfileRipple());

		ims.framework.utils.DateTime dateTime1 = valueObject.getDateTimeRequested();
		java.util.Date value1 = null;
		if ( dateTime1 != null ) 
		{
			value1 = dateTime1.getJavaDate();
		}
		domainObject.setDateTimeRequested(value1);
		java.util.Date value2 = null;
		ims.framework.utils.Date date2 = valueObject.getEffectiveFromDate();		
		if ( date2 != null ) 
		{
			value2 = date2.getDate();
		}
		domainObject.setEffectiveFromDate(value2);
		ims.framework.utils.Time time3 = valueObject.getStartTime();
		String value3 = null;
		if ( time3 != null ) 
		{
			value3 = time3.toString();
		}
		domainObject.setStartTime(value3);
		ims.framework.utils.Time time4 = valueObject.getEndTime();
		String value4 = null;
		if ( time4 != null ) 
		{
			value4 = time4.toString();
		}
		domainObject.setEndTime(value4);
		domainObject.setListOwners(ims.scheduling.vo.domain.Profile_ListOwnerVoAssembler.extractProfile_ListOwnerSet(domainFactory, valueObject.getListOwners(), domainObject.getListOwners(), domMap));		
		domainObject.setInactiveSlots(ims.scheduling.vo.domain.Profile_SlotGenericVoAssembler.extractProfile_SlotSet(domainFactory, valueObject.getInactiveSlots(), domainObject.getInactiveSlots(), domMap));		
		domainObject.setNewSlots(ims.scheduling.vo.domain.Profile_SlotGenericVoAssembler.extractProfile_SlotSet(domainFactory, valueObject.getNewSlots(), domainObject.getNewSlots(), domMap));		
		ims.framework.utils.DateTime dateTime8 = valueObject.getDateTimeActivated();
		java.util.Date value8 = null;
		if ( dateTime8 != null ) 
		{
			value8 = dateTime8.getJavaDate();
		}
		domainObject.setDateTimeActivated(value8);
		domainObject.setNumberOfSessions(valueObject.getNumberOfSessions());
		domainObject.setProfile(ims.scheduling.vo.domain.ProfileForProfileRippleVoAssembler.extractSch_Profile(domainFactory, valueObject.getProfile(), domMap));
		domainObject.setActive(valueObject.getActive());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDetails() != null && valueObject.getDetails().equals(""))
		{
			valueObject.setDetails(null);
		}
		domainObject.setDetails(valueObject.getDetails());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value13 = null;
		if ( null != valueObject.getCancellationReason() ) 
		{
			value13 =
				domainFactory.getLookupInstance(valueObject.getCancellationReason().getID());
		}
		domainObject.setCancellationReason(value13);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getName() != null && valueObject.getName().equals(""))
		{
			valueObject.setName(null);
		}
		domainObject.setName(valueObject.getName());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDescription() != null && valueObject.getDescription().equals(""))
		{
			valueObject.setDescription(null);
		}
		domainObject.setDescription(valueObject.getDescription());

		return domainObject;
	}

}
