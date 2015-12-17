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
 * @author Rory Fitzpatrick
 */
public class TrackingVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.emergency.vo.TrackingVo copy(ims.emergency.vo.TrackingVo valueObjectDest, ims.emergency.vo.TrackingVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Tracking(valueObjectSrc.getID_Tracking());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Patient
		valueObjectDest.setPatient(valueObjectSrc.getPatient());
		// CurrentArea
		valueObjectDest.setCurrentArea(valueObjectSrc.getCurrentArea());
		// Episode
		valueObjectDest.setEpisode(valueObjectSrc.getEpisode());
		// Attendance
		valueObjectDest.setAttendance(valueObjectSrc.getAttendance());
		// CurrentReferral
		valueObjectDest.setCurrentReferral(valueObjectSrc.getCurrentReferral());
		// TriageDetails
		valueObjectDest.setTriageDetails(valueObjectSrc.getTriageDetails());
		// CurrentStatus
		valueObjectDest.setCurrentStatus(valueObjectSrc.getCurrentStatus());
		// EDLocation
		valueObjectDest.setEDLocation(valueObjectSrc.getEDLocation());
		// CurrentCubicle
		valueObjectDest.setCurrentCubicle(valueObjectSrc.getCurrentCubicle());
		// LastMovementDateTime
		valueObjectDest.setLastMovementDateTime(valueObjectSrc.getLastMovementDateTime());
		// BedAvailability
		valueObjectDest.setBedAvailability(valueObjectSrc.getBedAvailability());
		// CurrentDNW
		valueObjectDest.setCurrentDNW(valueObjectSrc.getCurrentDNW());
		// isDischarged
		valueObjectDest.setIsDischarged(valueObjectSrc.getIsDischarged());
		// SeenBy
		valueObjectDest.setSeenBy(valueObjectSrc.getSeenBy());
		// CurrentTransferRecord
		valueObjectDest.setCurrentTransferRecord(valueObjectSrc.getCurrentTransferRecord());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createTrackingVoCollectionFromTracking(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.emergency.domain.objects.Tracking objects.
	 */
	public static ims.emergency.vo.TrackingVoCollection createTrackingVoCollectionFromTracking(java.util.Set domainObjectSet)	
	{
		return createTrackingVoCollectionFromTracking(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.emergency.domain.objects.Tracking objects.
	 */
	public static ims.emergency.vo.TrackingVoCollection createTrackingVoCollectionFromTracking(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.emergency.vo.TrackingVoCollection voList = new ims.emergency.vo.TrackingVoCollection();
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
			ims.emergency.vo.TrackingVo vo = create(map, domainObject);
			
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
	public static ims.emergency.vo.TrackingVoCollection createTrackingVoCollectionFromTracking(java.util.List domainObjectList) 
	{
		return createTrackingVoCollectionFromTracking(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.emergency.domain.objects.Tracking objects.
	 */
	public static ims.emergency.vo.TrackingVoCollection createTrackingVoCollectionFromTracking(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.emergency.vo.TrackingVoCollection voList = new ims.emergency.vo.TrackingVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.emergency.domain.objects.Tracking domainObject = (ims.emergency.domain.objects.Tracking) domainObjectList.get(i);
			ims.emergency.vo.TrackingVo vo = create(map, domainObject);

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
	 public static java.util.Set extractTrackingSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.TrackingVoCollection voCollection) 
	 {
	 	return extractTrackingSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractTrackingSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.TrackingVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.TrackingVo vo = voCollection.get(i);
			ims.emergency.domain.objects.Tracking domainObject = TrackingVoAssembler.extractTracking(domainFactory, vo, domMap);

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
	 public static java.util.List extractTrackingList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.TrackingVoCollection voCollection) 
	 {
	 	return extractTrackingList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractTrackingList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.TrackingVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.TrackingVo vo = voCollection.get(i);
			ims.emergency.domain.objects.Tracking domainObject = TrackingVoAssembler.extractTracking(domainFactory, vo, domMap);

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
	 public static ims.emergency.vo.TrackingVo create(ims.emergency.domain.objects.Tracking domainObject) 
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
	  public static ims.emergency.vo.TrackingVo create(DomainObjectMap map, ims.emergency.domain.objects.Tracking domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.emergency.vo.TrackingVo valueObject = (ims.emergency.vo.TrackingVo) map.getValueObject(domainObject, ims.emergency.vo.TrackingVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.emergency.vo.TrackingVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.emergency.vo.TrackingVo insert(ims.emergency.vo.TrackingVo valueObject, ims.emergency.domain.objects.Tracking domainObject) 
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
	 public static ims.emergency.vo.TrackingVo insert(DomainObjectMap map, ims.emergency.vo.TrackingVo valueObject, ims.emergency.domain.objects.Tracking domainObject) 
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
			
		// Patient
		valueObject.setPatient(ims.emergency.vo.domain.PatientForTrackingVoAssembler.create(map, domainObject.getPatient()) );
		// CurrentArea
		valueObject.setCurrentArea(ims.emergency.vo.domain.TrackingAreaForTrackingLiteVoAssembler.create(map, domainObject.getCurrentArea()) );
		// Episode
		valueObject.setEpisode(ims.emergency.vo.domain.EmergencyEpisodeForTrackingVoAssembler.create(map, domainObject.getEpisode()) );
		// Attendance
		valueObject.setAttendance(ims.emergency.vo.domain.EmergencyAttendanceForTrackingVoAssembler.create(map, domainObject.getAttendance()) );
		// CurrentReferral
		valueObject.setCurrentReferral(ims.emergency.vo.domain.ReferToSpecTeamForTrackingVoAssembler.create(map, domainObject.getCurrentReferral()) );
		// TriageDetails
		valueObject.setTriageDetails(ims.emergency.vo.domain.TriageForTrackingVoAssembler.create(map, domainObject.getTriageDetails()) );
		// CurrentStatus
		valueObject.setCurrentStatus(ims.emergency.vo.domain.TrackingAttendanceStatusForTrackingVoAssembler.create(map, domainObject.getCurrentStatus()) );
		// EDLocation
		valueObject.setEDLocation(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getEDLocation()) );
		// CurrentCubicle
		valueObject.setCurrentCubicle(ims.emergency.vo.domain.CubicleAllocationForTrackingVoAssembler.create(map, domainObject.getCurrentCubicle()) );
		// LastMovementDateTime
		java.util.Date LastMovementDateTime = domainObject.getLastMovementDateTime();
		if ( null != LastMovementDateTime ) 
		{
			valueObject.setLastMovementDateTime(new ims.framework.utils.DateTime(LastMovementDateTime) );
		}
		// BedAvailability
		valueObject.setBedAvailability(ims.emergency.vo.domain.BedAvailabilityForTrackingVoAssembler.create(map, domainObject.getBedAvailability()) );
		// CurrentDNW
		valueObject.setCurrentDNW(ims.emergency.vo.domain.DNWForTrackingVoAssembler.create(map, domainObject.getCurrentDNW()) );
		// isDischarged
		valueObject.setIsDischarged( domainObject.isIsDischarged() );
		// SeenBy
		valueObject.setSeenBy(ims.emergency.vo.domain.SeenByHCPVoAssembler.create(map, domainObject.getSeenBy()) );
		// CurrentTransferRecord
		valueObject.setCurrentTransferRecord(ims.emergency.vo.domain.EDTransferVoAssembler.create(map, domainObject.getCurrentTransferRecord()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.emergency.domain.objects.Tracking extractTracking(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.TrackingVo valueObject) 
	{
		return 	extractTracking(domainFactory, valueObject, new HashMap());
	}

	public static ims.emergency.domain.objects.Tracking extractTracking(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.TrackingVo valueObject, HashMap domMap) 
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
			// ims.emergency.vo.TrackingVo ID_Tracking field is unknown
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

		domainObject.setPatient(ims.emergency.vo.domain.PatientForTrackingVoAssembler.extractPatient(domainFactory, valueObject.getPatient(), domMap));
		domainObject.setCurrentArea(ims.emergency.vo.domain.TrackingAreaForTrackingLiteVoAssembler.extractTrackingArea(domainFactory, valueObject.getCurrentArea(), domMap));
		domainObject.setEpisode(ims.emergency.vo.domain.EmergencyEpisodeForTrackingVoAssembler.extractEmergencyEpisode(domainFactory, valueObject.getEpisode(), domMap));
		domainObject.setAttendance(ims.emergency.vo.domain.EmergencyAttendanceForTrackingVoAssembler.extractEmergencyAttendance(domainFactory, valueObject.getAttendance(), domMap));
		domainObject.setCurrentReferral(ims.emergency.vo.domain.ReferToSpecTeamForTrackingVoAssembler.extractReferralToSpecTeam(domainFactory, valueObject.getCurrentReferral(), domMap));
		domainObject.setTriageDetails(ims.emergency.vo.domain.TriageForTrackingVoAssembler.extractTriage(domainFactory, valueObject.getTriageDetails(), domMap));
		domainObject.setCurrentStatus(ims.emergency.vo.domain.TrackingAttendanceStatusForTrackingVoAssembler.extractTrackingAttendanceStatus(domainFactory, valueObject.getCurrentStatus(), domMap));
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value8 = null;
		if ( null != valueObject.getEDLocation() ) 
		{
			if (valueObject.getEDLocation().getBoId() == null)
			{
				if (domMap.get(valueObject.getEDLocation()) != null)
				{
					value8 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getEDLocation());
				}
			}
			else
			{
				value8 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getEDLocation().getBoId());
			}
		}
		domainObject.setEDLocation(value8);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.emergency.domain.objects.CubicleAllocation value9 = null;
		if ( null != valueObject.getCurrentCubicle() ) 
		{
			if (valueObject.getCurrentCubicle().getBoId() == null)
			{
				if (domMap.get(valueObject.getCurrentCubicle()) != null)
				{
					value9 = (ims.emergency.domain.objects.CubicleAllocation)domMap.get(valueObject.getCurrentCubicle());
				}
			}
			else
			{
				value9 = (ims.emergency.domain.objects.CubicleAllocation)domainFactory.getDomainObject(ims.emergency.domain.objects.CubicleAllocation.class, valueObject.getCurrentCubicle().getBoId());
			}
		}
		domainObject.setCurrentCubicle(value9);
		ims.framework.utils.DateTime dateTime10 = valueObject.getLastMovementDateTime();
		java.util.Date value10 = null;
		if ( dateTime10 != null ) 
		{
			value10 = dateTime10.getJavaDate();
		}
		domainObject.setLastMovementDateTime(value10);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.emergency.domain.objects.BedAvailability value11 = null;
		if ( null != valueObject.getBedAvailability() ) 
		{
			if (valueObject.getBedAvailability().getBoId() == null)
			{
				if (domMap.get(valueObject.getBedAvailability()) != null)
				{
					value11 = (ims.emergency.domain.objects.BedAvailability)domMap.get(valueObject.getBedAvailability());
				}
			}
			else
			{
				value11 = (ims.emergency.domain.objects.BedAvailability)domainFactory.getDomainObject(ims.emergency.domain.objects.BedAvailability.class, valueObject.getBedAvailability().getBoId());
			}
		}
		domainObject.setBedAvailability(value11);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.emergency.domain.objects.DNW value12 = null;
		if ( null != valueObject.getCurrentDNW() ) 
		{
			if (valueObject.getCurrentDNW().getBoId() == null)
			{
				if (domMap.get(valueObject.getCurrentDNW()) != null)
				{
					value12 = (ims.emergency.domain.objects.DNW)domMap.get(valueObject.getCurrentDNW());
				}
			}
			else
			{
				value12 = (ims.emergency.domain.objects.DNW)domainFactory.getDomainObject(ims.emergency.domain.objects.DNW.class, valueObject.getCurrentDNW().getBoId());
			}
		}
		domainObject.setCurrentDNW(value12);
		domainObject.setIsDischarged(valueObject.getIsDischarged());
		domainObject.setSeenBy(ims.emergency.vo.domain.SeenByHCPVoAssembler.extractSeenByHCP(domainFactory, valueObject.getSeenBy(), domMap));
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.emergency.domain.objects.EDTransfer value15 = null;
		if ( null != valueObject.getCurrentTransferRecord() ) 
		{
			if (valueObject.getCurrentTransferRecord().getBoId() == null)
			{
				if (domMap.get(valueObject.getCurrentTransferRecord()) != null)
				{
					value15 = (ims.emergency.domain.objects.EDTransfer)domMap.get(valueObject.getCurrentTransferRecord());
				}
			}
			else
			{
				value15 = (ims.emergency.domain.objects.EDTransfer)domainFactory.getDomainObject(ims.emergency.domain.objects.EDTransfer.class, valueObject.getCurrentTransferRecord().getBoId());
			}
		}
		domainObject.setCurrentTransferRecord(value15);

		return domainObject;
	}

}
