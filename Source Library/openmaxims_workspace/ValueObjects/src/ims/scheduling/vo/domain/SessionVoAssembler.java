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
		// LocationMovedDateTime
		valueObjectDest.setLocationMovedDateTime(valueObjectSrc.getLocationMovedDateTime());
		// ResponsibleHCP
		valueObjectDest.setResponsibleHCP(valueObjectSrc.getResponsibleHCP());
		// Sch_Profile
		valueObjectDest.setSch_Profile(valueObjectSrc.getSch_Profile());
		// Description
		valueObjectDest.setDescription(valueObjectSrc.getDescription());
		// isActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
		// PASClinic
		valueObjectDest.setPASClinic(valueObjectSrc.getPASClinic());
		// ListOwners
		valueObjectDest.setListOwners(valueObjectSrc.getListOwners());
		// CancellationReason
		valueObjectDest.setCancellationReason(valueObjectSrc.getCancellationReason());
		// Comment
		valueObjectDest.setComment(valueObjectSrc.getComment());
		// wasSessionMoved
		valueObjectDest.setWasSessionMoved(valueObjectSrc.getWasSessionMoved());
		// caseNoteFolderNotRequired
		valueObjectDest.setCaseNoteFolderNotRequired(valueObjectSrc.getCaseNoteFolderNotRequired());
		// SessionProfileType
		valueObjectDest.setSessionProfileType(valueObjectSrc.getSessionProfileType());
		// LetterRequired
		valueObjectDest.setLetterRequired(valueObjectSrc.getLetterRequired());
		// SafetyBriefDelayReason
		valueObjectDest.setSafetyBriefDelayReason(valueObjectSrc.getSafetyBriefDelayReason());
		// SessionMove
		valueObjectDest.setSessionMove(valueObjectSrc.getSessionMove());
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
		// SessionComment
		valueObjectDest.setSessionComment(valueObjectSrc.getSessionComment());
		// CaseNoteFolderLocation
		valueObjectDest.setCaseNoteFolderLocation(valueObjectSrc.getCaseNoteFolderLocation());
		// ListType
		valueObjectDest.setListType(valueObjectSrc.getListType());
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
		// SessionActivities
		valueObject.setSessionActivities(ims.scheduling.vo.domain.SessionActivityLiteVoAssembler.createSessionActivityLiteVoCollectionFromSessionActivity(map, domainObject.getSessionActivities()) );
		// TheatreProceduresRemaining
		valueObject.setTheatreProceduresRemaining(ims.scheduling.vo.domain.SessionTheatreProceduresRemainingVoAssembler.create(map, domainObject.getTheatreProceduresRemaining()) );
		// TheatreSlots
		valueObject.setTheatreSlots(ims.scheduling.vo.domain.SessionTheatreTCISlotLiteVoAssembler.createSessionTheatreTCISlotLiteVoCollectionFromSessionTheatreTCISlot(map, domainObject.getTheatreSlots()) );
		// ParentChildSlots
		valueObject.setParentChildSlots(ims.scheduling.vo.domain.SessionParentChildSlotVoAssembler.createSessionParentChildSlotVoCollectionFromSessionParentChildSlot(map, domainObject.getParentChildSlots()) );
		// SlotType
		ims.domain.lookups.LookupInstance instance16 = domainObject.getSlotType();
		if ( null != instance16 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance16.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance16.getImage().getImageId(), instance16.getImage().getImagePath());
			}
			color = instance16.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.SlotType voLookup16 = new ims.scheduling.vo.lookups.SlotType(instance16.getId(),instance16.getText(), instance16.isActive(), null, img, color);
			ims.scheduling.vo.lookups.SlotType parentVoLookup16 = voLookup16;
			ims.domain.lookups.LookupInstance parent16 = instance16.getParent();
			while (parent16 != null)
			{
				if (parent16.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent16.getImage().getImageId(), parent16.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent16.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup16.setParent(new ims.scheduling.vo.lookups.SlotType(parent16.getId(),parent16.getText(), parent16.isActive(), null, img, color));
				parentVoLookup16 = parentVoLookup16.getParent();
								parent16 = parent16.getParent();
			}			
			valueObject.setSlotType(voLookup16);
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
		// LocationMovedDateTime
		java.util.Date LocationMovedDateTime = domainObject.getLocationMovedDateTime();
		if ( null != LocationMovedDateTime ) 
		{
			valueObject.setLocationMovedDateTime(new ims.framework.utils.DateTime(LocationMovedDateTime) );
		}
		// ResponsibleHCP
		valueObject.setResponsibleHCP(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getResponsibleHCP()) );
		// Sch_Profile
		valueObject.setSch_Profile(ims.scheduling.vo.domain.ProfileLiteForBookingRightsVoAssembler.create(map, domainObject.getSch_Profile()) );
		// Description
		valueObject.setDescription(domainObject.getDescription());
		// isActive
		valueObject.setIsActive( domainObject.isIsActive() );
		// PASClinic
		ims.domain.lookups.LookupInstance instance23 = domainObject.getPASClinic();
		if ( null != instance23 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance23.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance23.getImage().getImageId(), instance23.getImage().getImagePath());
			}
			color = instance23.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.SchedPASClinic voLookup23 = new ims.scheduling.vo.lookups.SchedPASClinic(instance23.getId(),instance23.getText(), instance23.isActive(), null, img, color);
			ims.scheduling.vo.lookups.SchedPASClinic parentVoLookup23 = voLookup23;
			ims.domain.lookups.LookupInstance parent23 = instance23.getParent();
			while (parent23 != null)
			{
				if (parent23.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent23.getImage().getImageId(), parent23.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent23.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup23.setParent(new ims.scheduling.vo.lookups.SchedPASClinic(parent23.getId(),parent23.getText(), parent23.isActive(), null, img, color));
				parentVoLookup23 = parentVoLookup23.getParent();
								parent23 = parent23.getParent();
			}			
			valueObject.setPASClinic(voLookup23);
		}
				// ListOwners
		valueObject.setListOwners(ims.scheduling.vo.domain.Session_ListOwnerVoAssembler.createSession_ListOwnerVoCollectionFromSession_ListOwner(map, domainObject.getListOwners()) );
		// CancellationReason
		ims.domain.lookups.LookupInstance instance25 = domainObject.getCancellationReason();
		if ( null != instance25 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance25.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance25.getImage().getImageId(), instance25.getImage().getImagePath());
			}
			color = instance25.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.CancelAppointmentReason voLookup25 = new ims.scheduling.vo.lookups.CancelAppointmentReason(instance25.getId(),instance25.getText(), instance25.isActive(), null, img, color);
			ims.scheduling.vo.lookups.CancelAppointmentReason parentVoLookup25 = voLookup25;
			ims.domain.lookups.LookupInstance parent25 = instance25.getParent();
			while (parent25 != null)
			{
				if (parent25.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent25.getImage().getImageId(), parent25.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent25.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup25.setParent(new ims.scheduling.vo.lookups.CancelAppointmentReason(parent25.getId(),parent25.getText(), parent25.isActive(), null, img, color));
				parentVoLookup25 = parentVoLookup25.getParent();
								parent25 = parent25.getParent();
			}			
			valueObject.setCancellationReason(voLookup25);
		}
				// Comment
		valueObject.setComment(domainObject.getComment());
		// wasSessionMoved
		valueObject.setWasSessionMoved( domainObject.isWasSessionMoved() );
		// caseNoteFolderNotRequired
		valueObject.setCaseNoteFolderNotRequired( domainObject.isCaseNoteFolderNotRequired() );
		// SessionProfileType
		ims.domain.lookups.LookupInstance instance29 = domainObject.getSessionProfileType();
		if ( null != instance29 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance29.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance29.getImage().getImageId(), instance29.getImage().getImagePath());
			}
			color = instance29.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.SchProfileType voLookup29 = new ims.scheduling.vo.lookups.SchProfileType(instance29.getId(),instance29.getText(), instance29.isActive(), null, img, color);
			ims.scheduling.vo.lookups.SchProfileType parentVoLookup29 = voLookup29;
			ims.domain.lookups.LookupInstance parent29 = instance29.getParent();
			while (parent29 != null)
			{
				if (parent29.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent29.getImage().getImageId(), parent29.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent29.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup29.setParent(new ims.scheduling.vo.lookups.SchProfileType(parent29.getId(),parent29.getText(), parent29.isActive(), null, img, color));
				parentVoLookup29 = parentVoLookup29.getParent();
								parent29 = parent29.getParent();
			}			
			valueObject.setSessionProfileType(voLookup29);
		}
				// LetterRequired
		valueObject.setLetterRequired( domainObject.isLetterRequired() );
		// SafetyBriefDelayReason
		ims.domain.lookups.LookupInstance instance31 = domainObject.getSafetyBriefDelayReason();
		if ( null != instance31 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance31.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance31.getImage().getImageId(), instance31.getImage().getImagePath());
			}
			color = instance31.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.SafetyBriefDelayReason voLookup31 = new ims.scheduling.vo.lookups.SafetyBriefDelayReason(instance31.getId(),instance31.getText(), instance31.isActive(), null, img, color);
			ims.scheduling.vo.lookups.SafetyBriefDelayReason parentVoLookup31 = voLookup31;
			ims.domain.lookups.LookupInstance parent31 = instance31.getParent();
			while (parent31 != null)
			{
				if (parent31.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent31.getImage().getImageId(), parent31.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent31.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup31.setParent(new ims.scheduling.vo.lookups.SafetyBriefDelayReason(parent31.getId(),parent31.getText(), parent31.isActive(), null, img, color));
				parentVoLookup31 = parentVoLookup31.getParent();
								parent31 = parent31.getParent();
			}			
			valueObject.setSafetyBriefDelayReason(voLookup31);
		}
				// SessionMove
		valueObject.setSessionMove(ims.scheduling.vo.domain.SessionMoveVoAssembler.createSessionMoveVoCollectionFromSessionMove(map, domainObject.getSessionMove()) );
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
		ims.domain.lookups.LookupInstance instance38 = domainObject.getTheatreType();
		if ( null != instance38 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance38.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance38.getImage().getImageId(), instance38.getImage().getImagePath());
			}
			color = instance38.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.TheatreType voLookup38 = new ims.scheduling.vo.lookups.TheatreType(instance38.getId(),instance38.getText(), instance38.isActive(), null, img, color);
			ims.scheduling.vo.lookups.TheatreType parentVoLookup38 = voLookup38;
			ims.domain.lookups.LookupInstance parent38 = instance38.getParent();
			while (parent38 != null)
			{
				if (parent38.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent38.getImage().getImageId(), parent38.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent38.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup38.setParent(new ims.scheduling.vo.lookups.TheatreType(parent38.getId(),parent38.getText(), parent38.isActive(), null, img, color));
				parentVoLookup38 = parentVoLookup38.getParent();
								parent38 = parent38.getParent();
			}			
			valueObject.setTheatreType(voLookup38);
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
		ims.domain.lookups.LookupInstance instance46 = domainObject.getConsMediaType();
		if ( null != instance46 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance46.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance46.getImage().getImageId(), instance46.getImage().getImagePath());
			}
			color = instance46.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.ConsultationMediaType voLookup46 = new ims.scheduling.vo.lookups.ConsultationMediaType(instance46.getId(),instance46.getText(), instance46.isActive(), null, img, color);
			ims.scheduling.vo.lookups.ConsultationMediaType parentVoLookup46 = voLookup46;
			ims.domain.lookups.LookupInstance parent46 = instance46.getParent();
			while (parent46 != null)
			{
				if (parent46.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent46.getImage().getImageId(), parent46.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent46.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup46.setParent(new ims.scheduling.vo.lookups.ConsultationMediaType(parent46.getId(),parent46.getText(), parent46.isActive(), null, img, color));
				parentVoLookup46 = parentVoLookup46.getParent();
								parent46 = parent46.getParent();
			}			
			valueObject.setConsMediaType(voLookup46);
		}
				// SessionStatus
		ims.domain.lookups.LookupInstance instance47 = domainObject.getSessionStatus();
		if ( null != instance47 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance47.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance47.getImage().getImageId(), instance47.getImage().getImagePath());
			}
			color = instance47.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.Session_Status_and_Reason voLookup47 = new ims.scheduling.vo.lookups.Session_Status_and_Reason(instance47.getId(),instance47.getText(), instance47.isActive(), null, img, color);
			ims.scheduling.vo.lookups.Session_Status_and_Reason parentVoLookup47 = voLookup47;
			ims.domain.lookups.LookupInstance parent47 = instance47.getParent();
			while (parent47 != null)
			{
				if (parent47.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent47.getImage().getImageId(), parent47.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent47.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup47.setParent(new ims.scheduling.vo.lookups.Session_Status_and_Reason(parent47.getId(),parent47.getText(), parent47.isActive(), null, img, color));
				parentVoLookup47 = parentVoLookup47.getParent();
								parent47 = parent47.getParent();
			}			
			valueObject.setSessionStatus(voLookup47);
		}
				// SessionComment
		valueObject.setSessionComment(domainObject.getSessionComment());
		// CaseNoteFolderLocation
		valueObject.setCaseNoteFolderLocation(ims.core.vo.domain.LocShortVoAssembler.create(map, domainObject.getCaseNoteFolderLocation()) );
		// ListType
		ims.domain.lookups.LookupInstance instance50 = domainObject.getListType();
		if ( null != instance50 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance50.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance50.getImage().getImageId(), instance50.getImage().getImagePath());
			}
			color = instance50.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.ProfileListType voLookup50 = new ims.scheduling.vo.lookups.ProfileListType(instance50.getId(),instance50.getText(), instance50.isActive(), null, img, color);
			ims.scheduling.vo.lookups.ProfileListType parentVoLookup50 = voLookup50;
			ims.domain.lookups.LookupInstance parent50 = instance50.getParent();
			while (parent50 != null)
			{
				if (parent50.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent50.getImage().getImageId(), parent50.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent50.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup50.setParent(new ims.scheduling.vo.lookups.ProfileListType(parent50.getId(),parent50.getText(), parent50.isActive(), null, img, color));
				parentVoLookup50 = parentVoLookup50.getParent();
								parent50 = parent50.getParent();
			}			
			valueObject.setListType(voLookup50);
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
		domainObject.setSessionActivities(ims.scheduling.vo.domain.SessionActivityLiteVoAssembler.extractSessionActivitySet(domainFactory, valueObject.getSessionActivities(), domainObject.getSessionActivities(), domMap));		
		domainObject.setTheatreProceduresRemaining(ims.scheduling.vo.domain.SessionTheatreProceduresRemainingVoAssembler.extractSessionTheatreProceduresRemanining(domainFactory, valueObject.getTheatreProceduresRemaining(), domMap));
		domainObject.setTheatreSlots(ims.scheduling.vo.domain.SessionTheatreTCISlotLiteVoAssembler.extractSessionTheatreTCISlotSet(domainFactory, valueObject.getTheatreSlots(), domainObject.getTheatreSlots(), domMap));		
		domainObject.setParentChildSlots(ims.scheduling.vo.domain.SessionParentChildSlotVoAssembler.extractSessionParentChildSlotSet(domainFactory, valueObject.getParentChildSlots(), domainObject.getParentChildSlots(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value16 = null;
		if ( null != valueObject.getSlotType() ) 
		{
			value16 =
				domainFactory.getLookupInstance(valueObject.getSlotType().getID());
		}
		domainObject.setSlotType(value16);
		ims.clinical.vo.lookups.AnaestheticTypeCollection collection17 =
	valueObject.getAnaestheticType();
	    java.util.List domainAnaestheticType = domainObject.getAnaestheticType();;			
	    int collection17Size=0;
		if (collection17 == null)
		{
			domainAnaestheticType = new java.util.ArrayList(0);
		}
		else
		{
			collection17Size = collection17.size();
		}
		
		for(int i=0; i<collection17Size; i++) 
		{
			int instanceId = collection17.get(i).getID();
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
		int j17 = domainAnaestheticType.size();
		while (j17 > collection17Size)
		{
			domainAnaestheticType.remove(j17-1);
			j17 = domainAnaestheticType.size();
		}

		domainObject.setAnaestheticType(domainAnaestheticType);		
		ims.framework.utils.DateTime dateTime18 = valueObject.getLocationMovedDateTime();
		java.util.Date value18 = null;
		if ( dateTime18 != null ) 
		{
			value18 = dateTime18.getJavaDate();
		}
		domainObject.setLocationMovedDateTime(value18);
		domainObject.setResponsibleHCP(ims.core.vo.domain.HcpLiteVoAssembler.extractHcp(domainFactory, valueObject.getResponsibleHCP(), domMap));
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.scheduling.domain.objects.Sch_Profile value20 = null;
		if ( null != valueObject.getSch_Profile() ) 
		{
			if (valueObject.getSch_Profile().getBoId() == null)
			{
				if (domMap.get(valueObject.getSch_Profile()) != null)
				{
					value20 = (ims.scheduling.domain.objects.Sch_Profile)domMap.get(valueObject.getSch_Profile());
				}
			}
			else
			{
				value20 = (ims.scheduling.domain.objects.Sch_Profile)domainFactory.getDomainObject(ims.scheduling.domain.objects.Sch_Profile.class, valueObject.getSch_Profile().getBoId());
			}
		}
		domainObject.setSch_Profile(value20);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDescription() != null && valueObject.getDescription().equals(""))
		{
			valueObject.setDescription(null);
		}
		domainObject.setDescription(valueObject.getDescription());
		domainObject.setIsActive(valueObject.getIsActive());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value23 = null;
		if ( null != valueObject.getPASClinic() ) 
		{
			value23 =
				domainFactory.getLookupInstance(valueObject.getPASClinic().getID());
		}
		domainObject.setPASClinic(value23);
		domainObject.setListOwners(ims.scheduling.vo.domain.Session_ListOwnerVoAssembler.extractSession_ListOwnerSet(domainFactory, valueObject.getListOwners(), domainObject.getListOwners(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value25 = null;
		if ( null != valueObject.getCancellationReason() ) 
		{
			value25 =
				domainFactory.getLookupInstance(valueObject.getCancellationReason().getID());
		}
		domainObject.setCancellationReason(value25);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getComment() != null && valueObject.getComment().equals(""))
		{
			valueObject.setComment(null);
		}
		domainObject.setComment(valueObject.getComment());
		domainObject.setWasSessionMoved(valueObject.getWasSessionMoved());
		domainObject.setCaseNoteFolderNotRequired(valueObject.getCaseNoteFolderNotRequired());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value29 = null;
		if ( null != valueObject.getSessionProfileType() ) 
		{
			value29 =
				domainFactory.getLookupInstance(valueObject.getSessionProfileType().getID());
		}
		domainObject.setSessionProfileType(value29);
		domainObject.setLetterRequired(valueObject.getLetterRequired());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value31 = null;
		if ( null != valueObject.getSafetyBriefDelayReason() ) 
		{
			value31 =
				domainFactory.getLookupInstance(valueObject.getSafetyBriefDelayReason().getID());
		}
		domainObject.setSafetyBriefDelayReason(value31);
		domainObject.setSessionMove(ims.scheduling.vo.domain.SessionMoveVoAssembler.extractSessionMoveList(domainFactory, valueObject.getSessionMove(), domainObject.getSessionMove(), domMap));		
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
		ims.domain.lookups.LookupInstance value38 = null;
		if ( null != valueObject.getTheatreType() ) 
		{
			value38 =
				domainFactory.getLookupInstance(valueObject.getTheatreType().getID());
		}
		domainObject.setTheatreType(value38);
		domainObject.setIsFixed(valueObject.getIsFixed());
		ims.framework.utils.Time time40 = valueObject.getStartTm();
		String value40 = null;
		if ( time40 != null ) 
		{
			value40 = time40.toString();
		}
		domainObject.setStartTm(value40);
		ims.framework.utils.Time time41 = valueObject.getEndTm();
		String value41 = null;
		if ( time41 != null ) 
		{
			value41 = time41.toString();
		}
		domainObject.setEndTm(value41);
		domainObject.setRemainingTime(valueObject.getRemainingTime());
		java.util.Date value43 = null;
		ims.framework.utils.Date date43 = valueObject.getSessionDate();		
		if ( date43 != null ) 
		{
			value43 = date43.getDate();
		}
		domainObject.setSessionDate(value43);
		domainObject.setExclusionTimes(ims.scheduling.vo.domain.Session_Exc_TimesVoAssembler.extractSession_Exc_TimeSet(domainFactory, valueObject.getExclusionTimes(), domainObject.getExclusionTimes(), domMap));		
		domainObject.setMaxContinuousAvailableMins(valueObject.getMaxContinuousAvailableMins());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value46 = null;
		if ( null != valueObject.getConsMediaType() ) 
		{
			value46 =
				domainFactory.getLookupInstance(valueObject.getConsMediaType().getID());
		}
		domainObject.setConsMediaType(value46);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value47 = null;
		if ( null != valueObject.getSessionStatus() ) 
		{
			value47 =
				domainFactory.getLookupInstance(valueObject.getSessionStatus().getID());
		}
		domainObject.setSessionStatus(value47);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSessionComment() != null && valueObject.getSessionComment().equals(""))
		{
			valueObject.setSessionComment(null);
		}
		domainObject.setSessionComment(valueObject.getSessionComment());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value49 = null;
		if ( null != valueObject.getCaseNoteFolderLocation() ) 
		{
			if (valueObject.getCaseNoteFolderLocation().getBoId() == null)
			{
				if (domMap.get(valueObject.getCaseNoteFolderLocation()) != null)
				{
					value49 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getCaseNoteFolderLocation());
				}
			}
			else
			{
				value49 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getCaseNoteFolderLocation().getBoId());
			}
		}
		domainObject.setCaseNoteFolderLocation(value49);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value50 = null;
		if ( null != valueObject.getListType() ) 
		{
			value50 =
				domainFactory.getLookupInstance(valueObject.getListType().getID());
		}
		domainObject.setListType(value50);

		return domainObject;
	}

}
