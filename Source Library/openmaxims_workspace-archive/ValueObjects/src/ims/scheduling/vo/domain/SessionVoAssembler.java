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
 * @author Barbara Worwood
 */
public class SessionVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.scheduling.vo.SessionVo copy(ims.scheduling.vo.SessionVo valueObjectDest, ims.scheduling.vo.SessionVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Sch_Session(valueObjectSrc.getID_Sch_Session());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// StatusReason
		valueObjectDest.setStatusReason(valueObjectSrc.getStatusReason());
		// Duration
		valueObjectDest.setDuration(valueObjectSrc.getDuration());
		// SessionType
		valueObjectDest.setSessionType(valueObjectSrc.getSessionType());
		// MinInt
		valueObjectDest.setMinInt(valueObjectSrc.getMinInt());
		// RoundAttTime
		valueObjectDest.setRoundAttTime(valueObjectSrc.getRoundAttTime());
		// LastAppInterval
		valueObjectDest.setLastAppInterval(valueObjectSrc.getLastAppInterval());
		// MaxNoAppts
		valueObjectDest.setMaxNoAppts(valueObjectSrc.getMaxNoAppts());
		// SessionSlots
		valueObjectDest.setSessionSlots(valueObjectSrc.getSessionSlots());
		// DirectoryofServices
		valueObjectDest.setDirectoryofServices(valueObjectSrc.getDirectoryofServices());
		// isModified
		valueObjectDest.setIsModified(valueObjectSrc.getIsModified());
		// isAdHocSession
		valueObjectDest.setIsAdHocSession(valueObjectSrc.getIsAdHocSession());
		// BookingRights
		valueObjectDest.setBookingRights(valueObjectSrc.getBookingRights());
		// SessionActivities
		valueObjectDest.setSessionActivities(valueObjectSrc.getSessionActivities());
		// TheatreProceduresRemaining
		valueObjectDest.setTheatreProceduresRemaining(valueObjectSrc.getTheatreProceduresRemaining());
		// TheatreSlots
		valueObjectDest.setTheatreSlots(valueObjectSrc.getTheatreSlots());
		// ParentChildSlots
		valueObjectDest.setParentChildSlots(valueObjectSrc.getParentChildSlots());
		// SlotType
		valueObjectDest.setSlotType(valueObjectSrc.getSlotType());
		// AnaestheticType
		valueObjectDest.setAnaestheticType(valueObjectSrc.getAnaestheticType());
		// Description
		valueObjectDest.setDescription(valueObjectSrc.getDescription());
		// isActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
		// PASClinic
		valueObjectDest.setPASClinic(valueObjectSrc.getPASClinic());
		// IsTheatreSession
		valueObjectDest.setIsTheatreSession(valueObjectSrc.getIsTheatreSession());
		// ListOwners
		valueObjectDest.setListOwners(valueObjectSrc.getListOwners());
		// CancellationReason
		valueObjectDest.setCancellationReason(valueObjectSrc.getCancellationReason());
		// Comment
		valueObjectDest.setComment(valueObjectSrc.getComment());
		// wasSessionMoved
		valueObjectDest.setWasSessionMoved(valueObjectSrc.getWasSessionMoved());
		// Name
		valueObjectDest.setName(valueObjectSrc.getName());
		// SchLocation
		valueObjectDest.setSchLocation(valueObjectSrc.getSchLocation());
		// Service
		valueObjectDest.setService(valueObjectSrc.getService());
		// RemainingSlots
		valueObjectDest.setRemainingSlots(valueObjectSrc.getRemainingSlots());
		// TotalSlots
		valueObjectDest.setTotalSlots(valueObjectSrc.getTotalSlots());
		// TheatreType
		valueObjectDest.setTheatreType(valueObjectSrc.getTheatreType());
		// isFixed
		valueObjectDest.setIsFixed(valueObjectSrc.getIsFixed());
		// StartTm
		valueObjectDest.setStartTm(valueObjectSrc.getStartTm());
		// EndTm
		valueObjectDest.setEndTm(valueObjectSrc.getEndTm());
		// RemainingTime
		valueObjectDest.setRemainingTime(valueObjectSrc.getRemainingTime());
		// SessionDate
		valueObjectDest.setSessionDate(valueObjectSrc.getSessionDate());
		// ExclusionTimes
		valueObjectDest.setExclusionTimes(valueObjectSrc.getExclusionTimes());
		// MaxContinuousAvailableMins
		valueObjectDest.setMaxContinuousAvailableMins(valueObjectSrc.getMaxContinuousAvailableMins());
		// ConsMediaType
		valueObjectDest.setConsMediaType(valueObjectSrc.getConsMediaType());
		// SessionStatus
		valueObjectDest.setSessionStatus(valueObjectSrc.getSessionStatus());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createSessionVoCollectionFromSch_Session(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.Sch_Session objects.
	 */
	public static ims.scheduling.vo.SessionVoCollection createSessionVoCollectionFromSch_Session(java.util.Set domainObjectSet)	
	{
		return createSessionVoCollectionFromSch_Session(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.Sch_Session objects.
	 */
	public static ims.scheduling.vo.SessionVoCollection createSessionVoCollectionFromSch_Session(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.scheduling.vo.SessionVoCollection voList = new ims.scheduling.vo.SessionVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.scheduling.domain.objects.Sch_Session domainObject = (ims.scheduling.domain.objects.Sch_Session) iterator.next();
			ims.scheduling.vo.SessionVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.scheduling.domain.objects.Sch_Session objects.
	 */
	public static ims.scheduling.vo.SessionVoCollection createSessionVoCollectionFromSch_Session(java.util.List domainObjectList) 
	{
		return createSessionVoCollectionFromSch_Session(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.scheduling.domain.objects.Sch_Session objects.
	 */
	public static ims.scheduling.vo.SessionVoCollection createSessionVoCollectionFromSch_Session(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.scheduling.vo.SessionVoCollection voList = new ims.scheduling.vo.SessionVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.scheduling.domain.objects.Sch_Session domainObject = (ims.scheduling.domain.objects.Sch_Session) domainObjectList.get(i);
			ims.scheduling.vo.SessionVo vo = create(map, domainObject);

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
	 * Create the ims.scheduling.domain.objects.Sch_Session set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractSch_SessionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionVoCollection voCollection) 
	 {
	 	return extractSch_SessionSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractSch_SessionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.SessionVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.Sch_Session domainObject = SessionVoAssembler.extractSch_Session(domainFactory, vo, domMap);

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
	 * Create the ims.scheduling.domain.objects.Sch_Session list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractSch_SessionList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionVoCollection voCollection) 
	 {
	 	return extractSch_SessionList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractSch_SessionList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.SessionVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.Sch_Session domainObject = SessionVoAssembler.extractSch_Session(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.scheduling.domain.objects.Sch_Session object.
	 * @param domainObject ims.scheduling.domain.objects.Sch_Session
	 */
	 public static ims.scheduling.vo.SessionVo create(ims.scheduling.domain.objects.Sch_Session domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.scheduling.domain.objects.Sch_Session object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.scheduling.vo.SessionVo create(DomainObjectMap map, ims.scheduling.domain.objects.Sch_Session domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.scheduling.vo.SessionVo valueObject = (ims.scheduling.vo.SessionVo) map.getValueObject(domainObject, ims.scheduling.vo.SessionVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.scheduling.vo.SessionVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.scheduling.domain.objects.Sch_Session
	 */
	 public static ims.scheduling.vo.SessionVo insert(ims.scheduling.vo.SessionVo valueObject, ims.scheduling.domain.objects.Sch_Session domainObject) 
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
	 * @param domainObject ims.scheduling.domain.objects.Sch_Session
	 */
	 public static ims.scheduling.vo.SessionVo insert(DomainObjectMap map, ims.scheduling.vo.SessionVo valueObject, ims.scheduling.domain.objects.Sch_Session domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Sch_Session(domainObject.getId());
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
			
		// StatusReason
		ims.domain.lookups.LookupInstance instance1 = domainObject.getStatusReason();
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

			ims.scheduling.vo.lookups.Session_Status_and_Reason voLookup1 = new ims.scheduling.vo.lookups.Session_Status_and_Reason(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.scheduling.vo.lookups.Session_Status_and_Reason parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.scheduling.vo.lookups.Session_Status_and_Reason(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setStatusReason(voLookup1);
		}
				// Duration
		valueObject.setDuration(domainObject.getDuration());
		// SessionType
		ims.domain.lookups.LookupInstance instance3 = domainObject.getSessionType();
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

			ims.scheduling.vo.lookups.Sched_Profile_Type voLookup3 = new ims.scheduling.vo.lookups.Sched_Profile_Type(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.scheduling.vo.lookups.Sched_Profile_Type parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.scheduling.vo.lookups.Sched_Profile_Type(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setSessionType(voLookup3);
		}
				// MinInt
		valueObject.setMinInt(domainObject.getMinInt());
		// RoundAttTime
		valueObject.setRoundAttTime(domainObject.getRoundAttTime());
		// LastAppInterval
		valueObject.setLastAppInterval(domainObject.getLastAppInterval());
		// MaxNoAppts
		valueObject.setMaxNoAppts(domainObject.getMaxNoAppts());
		// SessionSlots
		valueObject.setSessionSlots(ims.scheduling.vo.domain.SessionSlotVoAssembler.createSessionSlotVoCollectionFromSession_Slot(map, domainObject.getSessionSlots()) );
		// DirectoryofServices
		valueObject.setDirectoryofServices(ims.scheduling.vo.domain.DirectoryOfServiceVoAssembler.createDirectoryOfServiceVoCollectionFromDirectoryofService(map, domainObject.getDirectoryofServices()) );
		// isModified
		valueObject.setIsModified( domainObject.isIsModified() );
		// isAdHocSession
		valueObject.setIsAdHocSession( domainObject.isIsAdHocSession() );
		// BookingRights
		valueObject.setBookingRights(ims.scheduling.vo.domain.Session_BookingRightVoAssembler.createSession_BookingRightVoCollectionFromSession_BookingRight(map, domainObject.getBookingRights()) );
		// SessionActivities
		valueObject.setSessionActivities(ims.scheduling.vo.domain.SessionActivityLiteVoAssembler.createSessionActivityLiteVoCollectionFromSessionActivity(map, domainObject.getSessionActivities()) );
		// TheatreProceduresRemaining
		valueObject.setTheatreProceduresRemaining(ims.scheduling.vo.domain.SessionTheatreProceduresRemainingVoAssembler.create(map, domainObject.getTheatreProceduresRemaining()) );
		// TheatreSlots
		valueObject.setTheatreSlots(ims.scheduling.vo.domain.SessionTheatreTCISlotLiteVoAssembler.createSessionTheatreTCISlotLiteVoCollectionFromSessionTheatreTCISlot(map, domainObject.getTheatreSlots()) );
		// ParentChildSlots
		valueObject.setParentChildSlots(ims.scheduling.vo.domain.SessionParentChildSlotVoAssembler.createSessionParentChildSlotVoCollectionFromSessionParentChildSlot(map, domainObject.getParentChildSlots()) );
		// SlotType
		ims.domain.lookups.LookupInstance instance17 = domainObject.getSlotType();
		if ( null != instance17 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance17.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance17.getImage().getImageId(), instance17.getImage().getImagePath());
			}
			color = instance17.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.SlotType voLookup17 = new ims.scheduling.vo.lookups.SlotType(instance17.getId(),instance17.getText(), instance17.isActive(), null, img, color);
			ims.scheduling.vo.lookups.SlotType parentVoLookup17 = voLookup17;
			ims.domain.lookups.LookupInstance parent17 = instance17.getParent();
			while (parent17 != null)
			{
				if (parent17.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent17.getImage().getImageId(), parent17.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent17.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup17.setParent(new ims.scheduling.vo.lookups.SlotType(parent17.getId(),parent17.getText(), parent17.isActive(), null, img, color));
				parentVoLookup17 = parentVoLookup17.getParent();
								parent17 = parent17.getParent();
			}			
			valueObject.setSlotType(voLookup17);
		}
				// AnaestheticType
		java.util.List listAnaestheticType = domainObject.getAnaestheticType();
		ims.clinical.vo.lookups.AnaestheticTypeCollection AnaestheticType = new ims.clinical.vo.lookups.AnaestheticTypeCollection();
		for(java.util.Iterator iterator = listAnaestheticType.iterator(); iterator.hasNext(); ) 
		{
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;
		
			ims.domain.lookups.LookupInstance instance = 
				(ims.domain.lookups.LookupInstance) iterator.next();
			if (instance.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance.getImage().getImageId(), instance.getImage().getImagePath());
			}
			else 
			{
				img = null;
			}
			color = instance.getColor();
			if (color != null) 
				color.getValue();
			ims.clinical.vo.lookups.AnaestheticType voInstance = new ims.clinical.vo.lookups.AnaestheticType(instance.getId(),instance.getText(), instance.isActive(), null, img, color);
			ims.clinical.vo.lookups.AnaestheticType parentVoInstance = voInstance;
			ims.domain.lookups.LookupInstance parent = instance.getParent();
			while (parent != null)
			{
				if (parent.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent.getImage().getImageId(), parent.getImage().getImagePath());
				}
				else 
				{
					img = null;
				}
				color = parent.getColor();
				if (color != null) 
					color.getValue();
								parentVoInstance.setParent(new ims.clinical.vo.lookups.AnaestheticType(parent.getId(),parent.getText(), parent.isActive(), null, img, color));
				parentVoInstance = parentVoInstance.getParent();
								parent = parent.getParent();
			}			
			AnaestheticType.add(voInstance);
		}
		valueObject.setAnaestheticType( AnaestheticType );
		// Description
		valueObject.setDescription(domainObject.getDescription());
		// isActive
		valueObject.setIsActive( domainObject.isIsActive() );
		// PASClinic
		ims.domain.lookups.LookupInstance instance21 = domainObject.getPASClinic();
		if ( null != instance21 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance21.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance21.getImage().getImageId(), instance21.getImage().getImagePath());
			}
			color = instance21.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.SchedPASClinic voLookup21 = new ims.scheduling.vo.lookups.SchedPASClinic(instance21.getId(),instance21.getText(), instance21.isActive(), null, img, color);
			ims.scheduling.vo.lookups.SchedPASClinic parentVoLookup21 = voLookup21;
			ims.domain.lookups.LookupInstance parent21 = instance21.getParent();
			while (parent21 != null)
			{
				if (parent21.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent21.getImage().getImageId(), parent21.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent21.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup21.setParent(new ims.scheduling.vo.lookups.SchedPASClinic(parent21.getId(),parent21.getText(), parent21.isActive(), null, img, color));
				parentVoLookup21 = parentVoLookup21.getParent();
								parent21 = parent21.getParent();
			}			
			valueObject.setPASClinic(voLookup21);
		}
				// IsTheatreSession
		valueObject.setIsTheatreSession( domainObject.isIsTheatreSession() );
		// ListOwners
		valueObject.setListOwners(ims.scheduling.vo.domain.Session_ListOwnerVoAssembler.createSession_ListOwnerVoCollectionFromSession_ListOwner(map, domainObject.getListOwners()) );
		// CancellationReason
		ims.domain.lookups.LookupInstance instance24 = domainObject.getCancellationReason();
		if ( null != instance24 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance24.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance24.getImage().getImageId(), instance24.getImage().getImagePath());
			}
			color = instance24.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.CancelAppointmentReason voLookup24 = new ims.scheduling.vo.lookups.CancelAppointmentReason(instance24.getId(),instance24.getText(), instance24.isActive(), null, img, color);
			ims.scheduling.vo.lookups.CancelAppointmentReason parentVoLookup24 = voLookup24;
			ims.domain.lookups.LookupInstance parent24 = instance24.getParent();
			while (parent24 != null)
			{
				if (parent24.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent24.getImage().getImageId(), parent24.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent24.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup24.setParent(new ims.scheduling.vo.lookups.CancelAppointmentReason(parent24.getId(),parent24.getText(), parent24.isActive(), null, img, color));
				parentVoLookup24 = parentVoLookup24.getParent();
								parent24 = parent24.getParent();
			}			
			valueObject.setCancellationReason(voLookup24);
		}
				// Comment
		valueObject.setComment(domainObject.getComment());
		// wasSessionMoved
		valueObject.setWasSessionMoved( domainObject.isWasSessionMoved() );
		// Name
		valueObject.setName(domainObject.getName());
		// SchLocation
		valueObject.setSchLocation(ims.core.vo.domain.LocShortVoAssembler.create(map, domainObject.getSchLocation()) );
		// Service
		valueObject.setService(ims.core.vo.domain.ServiceShortVoAssembler.create(map, domainObject.getService()) );
		// RemainingSlots
		valueObject.setRemainingSlots(domainObject.getRemainingSlots());
		// TotalSlots
		valueObject.setTotalSlots(domainObject.getTotalSlots());
		// TheatreType
		ims.domain.lookups.LookupInstance instance32 = domainObject.getTheatreType();
		if ( null != instance32 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance32.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance32.getImage().getImageId(), instance32.getImage().getImagePath());
			}
			color = instance32.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.TheatreType voLookup32 = new ims.scheduling.vo.lookups.TheatreType(instance32.getId(),instance32.getText(), instance32.isActive(), null, img, color);
			ims.scheduling.vo.lookups.TheatreType parentVoLookup32 = voLookup32;
			ims.domain.lookups.LookupInstance parent32 = instance32.getParent();
			while (parent32 != null)
			{
				if (parent32.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent32.getImage().getImageId(), parent32.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent32.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup32.setParent(new ims.scheduling.vo.lookups.TheatreType(parent32.getId(),parent32.getText(), parent32.isActive(), null, img, color));
				parentVoLookup32 = parentVoLookup32.getParent();
								parent32 = parent32.getParent();
			}			
			valueObject.setTheatreType(voLookup32);
		}
				// isFixed
		valueObject.setIsFixed( domainObject.isIsFixed() );
		// StartTm
		String StartTm = domainObject.getStartTm();
		if ( null != StartTm ) 
		{
			valueObject.setStartTm(new ims.framework.utils.Time(StartTm) );
		}
		// EndTm
		String EndTm = domainObject.getEndTm();
		if ( null != EndTm ) 
		{
			valueObject.setEndTm(new ims.framework.utils.Time(EndTm) );
		}
		// RemainingTime
		valueObject.setRemainingTime(domainObject.getRemainingTime());
		// SessionDate
		java.util.Date SessionDate = domainObject.getSessionDate();
		if ( null != SessionDate ) 
		{
			valueObject.setSessionDate(new ims.framework.utils.Date(SessionDate) );
		}
		// ExclusionTimes
		valueObject.setExclusionTimes(ims.scheduling.vo.domain.Session_Exc_TimesVoAssembler.createSession_Exc_TimesVoCollectionFromSession_Exc_Time(map, domainObject.getExclusionTimes()) );
		// MaxContinuousAvailableMins
		valueObject.setMaxContinuousAvailableMins(domainObject.getMaxContinuousAvailableMins());
		// ConsMediaType
		ims.domain.lookups.LookupInstance instance40 = domainObject.getConsMediaType();
		if ( null != instance40 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance40.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance40.getImage().getImageId(), instance40.getImage().getImagePath());
			}
			color = instance40.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.ConsultationMediaType voLookup40 = new ims.scheduling.vo.lookups.ConsultationMediaType(instance40.getId(),instance40.getText(), instance40.isActive(), null, img, color);
			ims.scheduling.vo.lookups.ConsultationMediaType parentVoLookup40 = voLookup40;
			ims.domain.lookups.LookupInstance parent40 = instance40.getParent();
			while (parent40 != null)
			{
				if (parent40.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent40.getImage().getImageId(), parent40.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent40.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup40.setParent(new ims.scheduling.vo.lookups.ConsultationMediaType(parent40.getId(),parent40.getText(), parent40.isActive(), null, img, color));
				parentVoLookup40 = parentVoLookup40.getParent();
								parent40 = parent40.getParent();
			}			
			valueObject.setConsMediaType(voLookup40);
		}
				// SessionStatus
		ims.domain.lookups.LookupInstance instance41 = domainObject.getSessionStatus();
		if ( null != instance41 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance41.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance41.getImage().getImageId(), instance41.getImage().getImagePath());
			}
			color = instance41.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.Session_Status_and_Reason voLookup41 = new ims.scheduling.vo.lookups.Session_Status_and_Reason(instance41.getId(),instance41.getText(), instance41.isActive(), null, img, color);
			ims.scheduling.vo.lookups.Session_Status_and_Reason parentVoLookup41 = voLookup41;
			ims.domain.lookups.LookupInstance parent41 = instance41.getParent();
			while (parent41 != null)
			{
				if (parent41.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent41.getImage().getImageId(), parent41.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent41.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup41.setParent(new ims.scheduling.vo.lookups.Session_Status_and_Reason(parent41.getId(),parent41.getText(), parent41.isActive(), null, img, color));
				parentVoLookup41 = parentVoLookup41.getParent();
								parent41 = parent41.getParent();
			}			
			valueObject.setSessionStatus(voLookup41);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.scheduling.domain.objects.Sch_Session extractSch_Session(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionVo valueObject) 
	{
		return 	extractSch_Session(domainFactory, valueObject, new HashMap());
	}

	public static ims.scheduling.domain.objects.Sch_Session extractSch_Session(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Sch_Session();
		ims.scheduling.domain.objects.Sch_Session domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.scheduling.domain.objects.Sch_Session)domMap.get(valueObject);
			}
			// ims.scheduling.vo.SessionVo ID_Sch_Session field is unknown
			domainObject = new ims.scheduling.domain.objects.Sch_Session();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Sch_Session());
			if (domMap.get(key) != null)
			{
				return (ims.scheduling.domain.objects.Sch_Session)domMap.get(key);
			}
			domainObject = (ims.scheduling.domain.objects.Sch_Session) domainFactory.getDomainObject(ims.scheduling.domain.objects.Sch_Session.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Sch_Session());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getStatusReason() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getStatusReason().getID());
		}
		domainObject.setStatusReason(value1);
		domainObject.setDuration(valueObject.getDuration());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getSessionType() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getSessionType().getID());
		}
		domainObject.setSessionType(value3);
		domainObject.setMinInt(valueObject.getMinInt());
		domainObject.setRoundAttTime(valueObject.getRoundAttTime());
		domainObject.setLastAppInterval(valueObject.getLastAppInterval());
		domainObject.setMaxNoAppts(valueObject.getMaxNoAppts());
		domainObject.setSessionSlots(ims.scheduling.vo.domain.SessionSlotVoAssembler.extractSession_SlotSet(domainFactory, valueObject.getSessionSlots(), domainObject.getSessionSlots(), domMap));		
		domainObject.setDirectoryofServices(ims.scheduling.vo.domain.DirectoryOfServiceVoAssembler.extractDirectoryofServiceSet(domainFactory, valueObject.getDirectoryofServices(), domainObject.getDirectoryofServices(), domMap));		
		domainObject.setIsModified(valueObject.getIsModified());
		domainObject.setIsAdHocSession(valueObject.getIsAdHocSession());
		domainObject.setBookingRights(ims.scheduling.vo.domain.Session_BookingRightVoAssembler.extractSession_BookingRightSet(domainFactory, valueObject.getBookingRights(), domainObject.getBookingRights(), domMap));		
		domainObject.setSessionActivities(ims.scheduling.vo.domain.SessionActivityLiteVoAssembler.extractSessionActivitySet(domainFactory, valueObject.getSessionActivities(), domainObject.getSessionActivities(), domMap));		
		domainObject.setTheatreProceduresRemaining(ims.scheduling.vo.domain.SessionTheatreProceduresRemainingVoAssembler.extractSessionTheatreProceduresRemanining(domainFactory, valueObject.getTheatreProceduresRemaining(), domMap));
		domainObject.setTheatreSlots(ims.scheduling.vo.domain.SessionTheatreTCISlotLiteVoAssembler.extractSessionTheatreTCISlotSet(domainFactory, valueObject.getTheatreSlots(), domainObject.getTheatreSlots(), domMap));		
		domainObject.setParentChildSlots(ims.scheduling.vo.domain.SessionParentChildSlotVoAssembler.extractSessionParentChildSlotSet(domainFactory, valueObject.getParentChildSlots(), domainObject.getParentChildSlots(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value17 = null;
		if ( null != valueObject.getSlotType() ) 
		{
			value17 =
				domainFactory.getLookupInstance(valueObject.getSlotType().getID());
		}
		domainObject.setSlotType(value17);
		ims.clinical.vo.lookups.AnaestheticTypeCollection collection18 =
	valueObject.getAnaestheticType();
	    java.util.List domainAnaestheticType = domainObject.getAnaestheticType();;			
	    int collection18Size=0;
		if (collection18 == null)
		{
			domainAnaestheticType = new java.util.ArrayList(0);
		}
		else
		{
			collection18Size = collection18.size();
		}
		
		for(int i=0; i<collection18Size; i++) 
		{
			int instanceId = collection18.get(i).getID();
			ims.domain.lookups.LookupInstanceRef dom =new ims.domain.lookups.LookupInstanceRef(domainFactory.getLookupInstance(instanceId));
			
			int domIdx = domainAnaestheticType.indexOf(dom);
			if (domIdx == -1)
			{
				domainAnaestheticType.add(i, dom);
			}
			else if (i != domIdx && i < domainAnaestheticType.size())
			{
				Object tmp = domainAnaestheticType.get(i);
				domainAnaestheticType.set(i, domainAnaestheticType.get(domIdx));
				domainAnaestheticType.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int j18 = domainAnaestheticType.size();
		while (j18 > collection18Size)
		{
			domainAnaestheticType.remove(j18-1);
			j18 = domainAnaestheticType.size();
		}

		domainObject.setAnaestheticType(domainAnaestheticType);		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDescription() != null && valueObject.getDescription().equals(""))
		{
			valueObject.setDescription(null);
		}
		domainObject.setDescription(valueObject.getDescription());
		domainObject.setIsActive(valueObject.getIsActive());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value21 = null;
		if ( null != valueObject.getPASClinic() ) 
		{
			value21 =
				domainFactory.getLookupInstance(valueObject.getPASClinic().getID());
		}
		domainObject.setPASClinic(value21);
		domainObject.setIsTheatreSession(valueObject.getIsTheatreSession());
		domainObject.setListOwners(ims.scheduling.vo.domain.Session_ListOwnerVoAssembler.extractSession_ListOwnerSet(domainFactory, valueObject.getListOwners(), domainObject.getListOwners(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value24 = null;
		if ( null != valueObject.getCancellationReason() ) 
		{
			value24 =
				domainFactory.getLookupInstance(valueObject.getCancellationReason().getID());
		}
		domainObject.setCancellationReason(value24);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getComment() != null && valueObject.getComment().equals(""))
		{
			valueObject.setComment(null);
		}
		domainObject.setComment(valueObject.getComment());
		domainObject.setWasSessionMoved(valueObject.getWasSessionMoved());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getName() != null && valueObject.getName().equals(""))
		{
			valueObject.setName(null);
		}
		domainObject.setName(valueObject.getName());
		domainObject.setSchLocation(ims.core.vo.domain.LocShortVoAssembler.extractLocation(domainFactory, valueObject.getSchLocation(), domMap));
		domainObject.setService(ims.core.vo.domain.ServiceShortVoAssembler.extractService(domainFactory, valueObject.getService(), domMap));
		domainObject.setRemainingSlots(valueObject.getRemainingSlots());
		domainObject.setTotalSlots(valueObject.getTotalSlots());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value32 = null;
		if ( null != valueObject.getTheatreType() ) 
		{
			value32 =
				domainFactory.getLookupInstance(valueObject.getTheatreType().getID());
		}
		domainObject.setTheatreType(value32);
		domainObject.setIsFixed(valueObject.getIsFixed());
		ims.framework.utils.Time time34 = valueObject.getStartTm();
		String value34 = null;
		if ( time34 != null ) 
		{
			value34 = time34.toString();
		}
		domainObject.setStartTm(value34);
		ims.framework.utils.Time time35 = valueObject.getEndTm();
		String value35 = null;
		if ( time35 != null ) 
		{
			value35 = time35.toString();
		}
		domainObject.setEndTm(value35);
		domainObject.setRemainingTime(valueObject.getRemainingTime());
		java.util.Date value37 = null;
		ims.framework.utils.Date date37 = valueObject.getSessionDate();		
		if ( date37 != null ) 
		{
			value37 = date37.getDate();
		}
		domainObject.setSessionDate(value37);
		domainObject.setExclusionTimes(ims.scheduling.vo.domain.Session_Exc_TimesVoAssembler.extractSession_Exc_TimeSet(domainFactory, valueObject.getExclusionTimes(), domainObject.getExclusionTimes(), domMap));		
		domainObject.setMaxContinuousAvailableMins(valueObject.getMaxContinuousAvailableMins());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value40 = null;
		if ( null != valueObject.getConsMediaType() ) 
		{
			value40 =
				domainFactory.getLookupInstance(valueObject.getConsMediaType().getID());
		}
		domainObject.setConsMediaType(value40);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value41 = null;
		if ( null != valueObject.getSessionStatus() ) 
		{
			value41 =
				domainFactory.getLookupInstance(valueObject.getSessionStatus().getID());
		}
		domainObject.setSessionStatus(value41);

		return domainObject;
	}

}
