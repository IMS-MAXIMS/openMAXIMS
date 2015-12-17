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
package ims.emergency.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Florin Blindu
 */
public class TrackingForEDPartialAdmissionVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.emergency.vo.TrackingForEDPartialAdmissionVo copy(ims.emergency.vo.TrackingForEDPartialAdmissionVo valueObjectDest, ims.emergency.vo.TrackingForEDPartialAdmissionVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Tracking(valueObjectSrc.getID_Tracking());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CurrentStatus
		valueObjectDest.setCurrentStatus(valueObjectSrc.getCurrentStatus());
		// CurrentPartialAdmission
		valueObjectDest.setCurrentPartialAdmission(valueObjectSrc.getCurrentPartialAdmission());
		// CurrentArea
		valueObjectDest.setCurrentArea(valueObjectSrc.getCurrentArea());
		// isDischarged
		valueObjectDest.setIsDischarged(valueObjectSrc.getIsDischarged());
		// CurrentReferral
		valueObjectDest.setCurrentReferral(valueObjectSrc.getCurrentReferral());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createTrackingForEDPartialAdmissionVoCollectionFromTracking(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.emergency.domain.objects.Tracking objects.
	 */
	public static ims.emergency.vo.TrackingForEDPartialAdmissionVoCollection createTrackingForEDPartialAdmissionVoCollectionFromTracking(java.util.Set domainObjectSet)	
	{
		return createTrackingForEDPartialAdmissionVoCollectionFromTracking(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.emergency.domain.objects.Tracking objects.
	 */
	public static ims.emergency.vo.TrackingForEDPartialAdmissionVoCollection createTrackingForEDPartialAdmissionVoCollectionFromTracking(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.emergency.vo.TrackingForEDPartialAdmissionVoCollection voList = new ims.emergency.vo.TrackingForEDPartialAdmissionVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.emergency.domain.objects.Tracking domainObject = (ims.emergency.domain.objects.Tracking) iterator.next();
			ims.emergency.vo.TrackingForEDPartialAdmissionVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.emergency.domain.objects.Tracking objects.
	 */
	public static ims.emergency.vo.TrackingForEDPartialAdmissionVoCollection createTrackingForEDPartialAdmissionVoCollectionFromTracking(java.util.List domainObjectList) 
	{
		return createTrackingForEDPartialAdmissionVoCollectionFromTracking(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.emergency.domain.objects.Tracking objects.
	 */
	public static ims.emergency.vo.TrackingForEDPartialAdmissionVoCollection createTrackingForEDPartialAdmissionVoCollectionFromTracking(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.emergency.vo.TrackingForEDPartialAdmissionVoCollection voList = new ims.emergency.vo.TrackingForEDPartialAdmissionVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.emergency.domain.objects.Tracking domainObject = (ims.emergency.domain.objects.Tracking) domainObjectList.get(i);
			ims.emergency.vo.TrackingForEDPartialAdmissionVo vo = create(map, domainObject);

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
	 * Create the ims.emergency.domain.objects.Tracking set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractTrackingSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.TrackingForEDPartialAdmissionVoCollection voCollection) 
	 {
	 	return extractTrackingSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractTrackingSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.TrackingForEDPartialAdmissionVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.TrackingForEDPartialAdmissionVo vo = voCollection.get(i);
			ims.emergency.domain.objects.Tracking domainObject = TrackingForEDPartialAdmissionVoAssembler.extractTracking(domainFactory, vo, domMap);

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
	 * Create the ims.emergency.domain.objects.Tracking list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractTrackingList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.TrackingForEDPartialAdmissionVoCollection voCollection) 
	 {
	 	return extractTrackingList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractTrackingList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.TrackingForEDPartialAdmissionVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.TrackingForEDPartialAdmissionVo vo = voCollection.get(i);
			ims.emergency.domain.objects.Tracking domainObject = TrackingForEDPartialAdmissionVoAssembler.extractTracking(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.emergency.domain.objects.Tracking object.
	 * @param domainObject ims.emergency.domain.objects.Tracking
	 */
	 public static ims.emergency.vo.TrackingForEDPartialAdmissionVo create(ims.emergency.domain.objects.Tracking domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.emergency.domain.objects.Tracking object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.emergency.vo.TrackingForEDPartialAdmissionVo create(DomainObjectMap map, ims.emergency.domain.objects.Tracking domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.emergency.vo.TrackingForEDPartialAdmissionVo valueObject = (ims.emergency.vo.TrackingForEDPartialAdmissionVo) map.getValueObject(domainObject, ims.emergency.vo.TrackingForEDPartialAdmissionVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.emergency.vo.TrackingForEDPartialAdmissionVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.emergency.domain.objects.Tracking
	 */
	 public static ims.emergency.vo.TrackingForEDPartialAdmissionVo insert(ims.emergency.vo.TrackingForEDPartialAdmissionVo valueObject, ims.emergency.domain.objects.Tracking domainObject) 
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
	 * @param domainObject ims.emergency.domain.objects.Tracking
	 */
	 public static ims.emergency.vo.TrackingForEDPartialAdmissionVo insert(DomainObjectMap map, ims.emergency.vo.TrackingForEDPartialAdmissionVo valueObject, ims.emergency.domain.objects.Tracking domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Tracking(domainObject.getId());
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
			
		// CurrentStatus
		valueObject.setCurrentStatus(ims.emergency.vo.domain.TrackingAttendanceStatusVoAssembler.create(map, domainObject.getCurrentStatus()) );
		// CurrentPartialAdmission
		valueObject.setCurrentPartialAdmission(ims.emergency.vo.domain.EDPartialAdmissionVoAssembler.create(map, domainObject.getCurrentPartialAdmission()) );
		// CurrentArea
		valueObject.setCurrentArea(ims.emergency.vo.domain.TrackingAreaLiteVoAssembler.create(map, domainObject.getCurrentArea()) );
		// isDischarged
		valueObject.setIsDischarged( domainObject.isIsDischarged() );
		// CurrentReferral
		valueObject.setCurrentReferral(ims.emergency.vo.domain.ReferralToSpecialtyTeamVoAssembler.create(map, domainObject.getCurrentReferral()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.emergency.domain.objects.Tracking extractTracking(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.TrackingForEDPartialAdmissionVo valueObject) 
	{
		return 	extractTracking(domainFactory, valueObject, new HashMap());
	}

	public static ims.emergency.domain.objects.Tracking extractTracking(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.TrackingForEDPartialAdmissionVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Tracking();
		ims.emergency.domain.objects.Tracking domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.emergency.domain.objects.Tracking)domMap.get(valueObject);
			}
			// ims.emergency.vo.TrackingForEDPartialAdmissionVo ID_Tracking field is unknown
			domainObject = new ims.emergency.domain.objects.Tracking();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Tracking());
			if (domMap.get(key) != null)
			{
				return (ims.emergency.domain.objects.Tracking)domMap.get(key);
			}
			domainObject = (ims.emergency.domain.objects.Tracking) domainFactory.getDomainObject(ims.emergency.domain.objects.Tracking.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Tracking());

		domainObject.setCurrentStatus(ims.emergency.vo.domain.TrackingAttendanceStatusVoAssembler.extractTrackingAttendanceStatus(domainFactory, valueObject.getCurrentStatus(), domMap));
		domainObject.setCurrentPartialAdmission(ims.emergency.vo.domain.EDPartialAdmissionVoAssembler.extractEDPartialAdmission(domainFactory, valueObject.getCurrentPartialAdmission(), domMap));
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.emergency.configuration.domain.objects.TrackingArea value3 = null;
		if ( null != valueObject.getCurrentArea() ) 
		{
			if (valueObject.getCurrentArea().getBoId() == null)
			{
				if (domMap.get(valueObject.getCurrentArea()) != null)
				{
					value3 = (ims.emergency.configuration.domain.objects.TrackingArea)domMap.get(valueObject.getCurrentArea());
				}
			}
			else
			{
				value3 = (ims.emergency.configuration.domain.objects.TrackingArea)domainFactory.getDomainObject(ims.emergency.configuration.domain.objects.TrackingArea.class, valueObject.getCurrentArea().getBoId());
			}
		}
		domainObject.setCurrentArea(value3);
		domainObject.setIsDischarged(valueObject.getIsDischarged());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.emergency.domain.objects.ReferralToSpecTeam value5 = null;
		if ( null != valueObject.getCurrentReferral() ) 
		{
			if (valueObject.getCurrentReferral().getBoId() == null)
			{
				if (domMap.get(valueObject.getCurrentReferral()) != null)
				{
					value5 = (ims.emergency.domain.objects.ReferralToSpecTeam)domMap.get(valueObject.getCurrentReferral());
				}
			}
			else
			{
				value5 = (ims.emergency.domain.objects.ReferralToSpecTeam)domainFactory.getDomainObject(ims.emergency.domain.objects.ReferralToSpecTeam.class, valueObject.getCurrentReferral().getBoId());
			}
		}
		domainObject.setCurrentReferral(value5);

		return domainObject;
	}

}
