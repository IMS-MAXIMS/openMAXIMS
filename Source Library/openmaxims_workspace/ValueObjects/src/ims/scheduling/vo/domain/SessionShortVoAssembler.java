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
 * @author Daniel Laffan
 */
public class SessionShortVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.scheduling.vo.SessionShortVo copy(ims.scheduling.vo.SessionShortVo valueObjectDest, ims.scheduling.vo.SessionShortVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Sch_Session(valueObjectSrc.getID_Sch_Session());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
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
 	 * If more than one call to an Assembler is made then #createSessionShortVoCollectionFromSch_Session(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.Sch_Session objects.
	 */
	public static ims.scheduling.vo.SessionShortVoCollection createSessionShortVoCollectionFromSch_Session(java.util.Set domainObjectSet)	
	{
		return createSessionShortVoCollectionFromSch_Session(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.Sch_Session objects.
	 */
	public static ims.scheduling.vo.SessionShortVoCollection createSessionShortVoCollectionFromSch_Session(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.scheduling.vo.SessionShortVoCollection voList = new ims.scheduling.vo.SessionShortVoCollection();
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
			ims.scheduling.vo.SessionShortVo vo = create(map, domainObject);
			
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
	public static ims.scheduling.vo.SessionShortVoCollection createSessionShortVoCollectionFromSch_Session(java.util.List domainObjectList) 
	{
		return createSessionShortVoCollectionFromSch_Session(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.scheduling.domain.objects.Sch_Session objects.
	 */
	public static ims.scheduling.vo.SessionShortVoCollection createSessionShortVoCollectionFromSch_Session(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.scheduling.vo.SessionShortVoCollection voList = new ims.scheduling.vo.SessionShortVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.scheduling.domain.objects.Sch_Session domainObject = (ims.scheduling.domain.objects.Sch_Session) domainObjectList.get(i);
			ims.scheduling.vo.SessionShortVo vo = create(map, domainObject);

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
	 public static java.util.Set extractSch_SessionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionShortVoCollection voCollection) 
	 {
	 	return extractSch_SessionSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractSch_SessionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionShortVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.SessionShortVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.Sch_Session domainObject = SessionShortVoAssembler.extractSch_Session(domainFactory, vo, domMap);

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
	 public static java.util.List extractSch_SessionList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionShortVoCollection voCollection) 
	 {
	 	return extractSch_SessionList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractSch_SessionList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionShortVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.SessionShortVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.Sch_Session domainObject = SessionShortVoAssembler.extractSch_Session(domainFactory, vo, domMap);

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
	 public static ims.scheduling.vo.SessionShortVo create(ims.scheduling.domain.objects.Sch_Session domainObject) 
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
	  public static ims.scheduling.vo.SessionShortVo create(DomainObjectMap map, ims.scheduling.domain.objects.Sch_Session domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.scheduling.vo.SessionShortVo valueObject = (ims.scheduling.vo.SessionShortVo) map.getValueObject(domainObject, ims.scheduling.vo.SessionShortVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.scheduling.vo.SessionShortVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.scheduling.vo.SessionShortVo insert(ims.scheduling.vo.SessionShortVo valueObject, ims.scheduling.domain.objects.Sch_Session domainObject) 
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
	 public static ims.scheduling.vo.SessionShortVo insert(DomainObjectMap map, ims.scheduling.vo.SessionShortVo valueObject, ims.scheduling.domain.objects.Sch_Session domainObject) 
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
			
		// Description
		valueObject.setDescription(domainObject.getDescription());
		// isActive
		valueObject.setIsActive( domainObject.isIsActive() );
		// PASClinic
		ims.domain.lookups.LookupInstance instance3 = domainObject.getPASClinic();
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

			ims.scheduling.vo.lookups.SchedPASClinic voLookup3 = new ims.scheduling.vo.lookups.SchedPASClinic(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.scheduling.vo.lookups.SchedPASClinic parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.scheduling.vo.lookups.SchedPASClinic(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setPASClinic(voLookup3);
		}
				// ListOwners
		valueObject.setListOwners(ims.scheduling.vo.domain.Session_ListOwnerVoAssembler.createSession_ListOwnerVoCollectionFromSession_ListOwner(map, domainObject.getListOwners()) );
		// CancellationReason
		ims.domain.lookups.LookupInstance instance5 = domainObject.getCancellationReason();
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

			ims.scheduling.vo.lookups.CancelAppointmentReason voLookup5 = new ims.scheduling.vo.lookups.CancelAppointmentReason(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.scheduling.vo.lookups.CancelAppointmentReason parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.scheduling.vo.lookups.CancelAppointmentReason(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setCancellationReason(voLookup5);
		}
				// Comment
		valueObject.setComment(domainObject.getComment());
		// wasSessionMoved
		valueObject.setWasSessionMoved( domainObject.isWasSessionMoved() );
		// caseNoteFolderNotRequired
		valueObject.setCaseNoteFolderNotRequired( domainObject.isCaseNoteFolderNotRequired() );
		// SessionProfileType
		ims.domain.lookups.LookupInstance instance9 = domainObject.getSessionProfileType();
		if ( null != instance9 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance9.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance9.getImage().getImageId(), instance9.getImage().getImagePath());
			}
			color = instance9.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.SchProfileType voLookup9 = new ims.scheduling.vo.lookups.SchProfileType(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.scheduling.vo.lookups.SchProfileType parentVoLookup9 = voLookup9;
			ims.domain.lookups.LookupInstance parent9 = instance9.getParent();
			while (parent9 != null)
			{
				if (parent9.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent9.getImage().getImageId(), parent9.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent9.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup9.setParent(new ims.scheduling.vo.lookups.SchProfileType(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setSessionProfileType(voLookup9);
		}
				// LetterRequired
		valueObject.setLetterRequired( domainObject.isLetterRequired() );
		// SafetyBriefDelayReason
		ims.domain.lookups.LookupInstance instance11 = domainObject.getSafetyBriefDelayReason();
		if ( null != instance11 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance11.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance11.getImage().getImageId(), instance11.getImage().getImagePath());
			}
			color = instance11.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.SafetyBriefDelayReason voLookup11 = new ims.scheduling.vo.lookups.SafetyBriefDelayReason(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.scheduling.vo.lookups.SafetyBriefDelayReason parentVoLookup11 = voLookup11;
			ims.domain.lookups.LookupInstance parent11 = instance11.getParent();
			while (parent11 != null)
			{
				if (parent11.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent11.getImage().getImageId(), parent11.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent11.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup11.setParent(new ims.scheduling.vo.lookups.SafetyBriefDelayReason(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setSafetyBriefDelayReason(voLookup11);
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
		ims.domain.lookups.LookupInstance instance18 = domainObject.getTheatreType();
		if ( null != instance18 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance18.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance18.getImage().getImageId(), instance18.getImage().getImagePath());
			}
			color = instance18.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.TheatreType voLookup18 = new ims.scheduling.vo.lookups.TheatreType(instance18.getId(),instance18.getText(), instance18.isActive(), null, img, color);
			ims.scheduling.vo.lookups.TheatreType parentVoLookup18 = voLookup18;
			ims.domain.lookups.LookupInstance parent18 = instance18.getParent();
			while (parent18 != null)
			{
				if (parent18.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent18.getImage().getImageId(), parent18.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent18.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup18.setParent(new ims.scheduling.vo.lookups.TheatreType(parent18.getId(),parent18.getText(), parent18.isActive(), null, img, color));
				parentVoLookup18 = parentVoLookup18.getParent();
								parent18 = parent18.getParent();
			}			
			valueObject.setTheatreType(voLookup18);
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
		ims.domain.lookups.LookupInstance instance26 = domainObject.getConsMediaType();
		if ( null != instance26 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance26.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance26.getImage().getImageId(), instance26.getImage().getImagePath());
			}
			color = instance26.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.ConsultationMediaType voLookup26 = new ims.scheduling.vo.lookups.ConsultationMediaType(instance26.getId(),instance26.getText(), instance26.isActive(), null, img, color);
			ims.scheduling.vo.lookups.ConsultationMediaType parentVoLookup26 = voLookup26;
			ims.domain.lookups.LookupInstance parent26 = instance26.getParent();
			while (parent26 != null)
			{
				if (parent26.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent26.getImage().getImageId(), parent26.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent26.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup26.setParent(new ims.scheduling.vo.lookups.ConsultationMediaType(parent26.getId(),parent26.getText(), parent26.isActive(), null, img, color));
				parentVoLookup26 = parentVoLookup26.getParent();
								parent26 = parent26.getParent();
			}			
			valueObject.setConsMediaType(voLookup26);
		}
				// SessionStatus
		ims.domain.lookups.LookupInstance instance27 = domainObject.getSessionStatus();
		if ( null != instance27 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance27.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance27.getImage().getImageId(), instance27.getImage().getImagePath());
			}
			color = instance27.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.Session_Status_and_Reason voLookup27 = new ims.scheduling.vo.lookups.Session_Status_and_Reason(instance27.getId(),instance27.getText(), instance27.isActive(), null, img, color);
			ims.scheduling.vo.lookups.Session_Status_and_Reason parentVoLookup27 = voLookup27;
			ims.domain.lookups.LookupInstance parent27 = instance27.getParent();
			while (parent27 != null)
			{
				if (parent27.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent27.getImage().getImageId(), parent27.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent27.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup27.setParent(new ims.scheduling.vo.lookups.Session_Status_and_Reason(parent27.getId(),parent27.getText(), parent27.isActive(), null, img, color));
				parentVoLookup27 = parentVoLookup27.getParent();
								parent27 = parent27.getParent();
			}			
			valueObject.setSessionStatus(voLookup27);
		}
				// SessionComment
		valueObject.setSessionComment(domainObject.getSessionComment());
		// CaseNoteFolderLocation
		valueObject.setCaseNoteFolderLocation(ims.core.vo.domain.LocShortVoAssembler.create(map, domainObject.getCaseNoteFolderLocation()) );
		// ListType
		ims.domain.lookups.LookupInstance instance30 = domainObject.getListType();
		if ( null != instance30 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance30.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance30.getImage().getImageId(), instance30.getImage().getImagePath());
			}
			color = instance30.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.ProfileListType voLookup30 = new ims.scheduling.vo.lookups.ProfileListType(instance30.getId(),instance30.getText(), instance30.isActive(), null, img, color);
			ims.scheduling.vo.lookups.ProfileListType parentVoLookup30 = voLookup30;
			ims.domain.lookups.LookupInstance parent30 = instance30.getParent();
			while (parent30 != null)
			{
				if (parent30.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent30.getImage().getImageId(), parent30.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent30.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup30.setParent(new ims.scheduling.vo.lookups.ProfileListType(parent30.getId(),parent30.getText(), parent30.isActive(), null, img, color));
				parentVoLookup30 = parentVoLookup30.getParent();
								parent30 = parent30.getParent();
			}			
			valueObject.setListType(voLookup30);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.scheduling.domain.objects.Sch_Session extractSch_Session(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionShortVo valueObject) 
	{
		return 	extractSch_Session(domainFactory, valueObject, new HashMap());
	}

	public static ims.scheduling.domain.objects.Sch_Session extractSch_Session(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionShortVo valueObject, HashMap domMap) 
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
			// ims.scheduling.vo.SessionShortVo ID_Sch_Session field is unknown
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

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDescription() != null && valueObject.getDescription().equals(""))
		{
			valueObject.setDescription(null);
		}
		domainObject.setDescription(valueObject.getDescription());
		domainObject.setIsActive(valueObject.getIsActive());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getPASClinic() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getPASClinic().getID());
		}
		domainObject.setPASClinic(value3);
		domainObject.setListOwners(ims.scheduling.vo.domain.Session_ListOwnerVoAssembler.extractSession_ListOwnerSet(domainFactory, valueObject.getListOwners(), domainObject.getListOwners(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getCancellationReason() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getCancellationReason().getID());
		}
		domainObject.setCancellationReason(value5);
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
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getSessionProfileType() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getSessionProfileType().getID());
		}
		domainObject.setSessionProfileType(value9);
		domainObject.setLetterRequired(valueObject.getLetterRequired());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getSafetyBriefDelayReason() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getSafetyBriefDelayReason().getID());
		}
		domainObject.setSafetyBriefDelayReason(value11);
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
		ims.domain.lookups.LookupInstance value18 = null;
		if ( null != valueObject.getTheatreType() ) 
		{
			value18 =
				domainFactory.getLookupInstance(valueObject.getTheatreType().getID());
		}
		domainObject.setTheatreType(value18);
		domainObject.setIsFixed(valueObject.getIsFixed());
		ims.framework.utils.Time time20 = valueObject.getStartTm();
		String value20 = null;
		if ( time20 != null ) 
		{
			value20 = time20.toString();
		}
		domainObject.setStartTm(value20);
		ims.framework.utils.Time time21 = valueObject.getEndTm();
		String value21 = null;
		if ( time21 != null ) 
		{
			value21 = time21.toString();
		}
		domainObject.setEndTm(value21);
		domainObject.setRemainingTime(valueObject.getRemainingTime());
		java.util.Date value23 = null;
		ims.framework.utils.Date date23 = valueObject.getSessionDate();		
		if ( date23 != null ) 
		{
			value23 = date23.getDate();
		}
		domainObject.setSessionDate(value23);
		domainObject.setExclusionTimes(ims.scheduling.vo.domain.Session_Exc_TimesVoAssembler.extractSession_Exc_TimeSet(domainFactory, valueObject.getExclusionTimes(), domainObject.getExclusionTimes(), domMap));		
		domainObject.setMaxContinuousAvailableMins(valueObject.getMaxContinuousAvailableMins());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value26 = null;
		if ( null != valueObject.getConsMediaType() ) 
		{
			value26 =
				domainFactory.getLookupInstance(valueObject.getConsMediaType().getID());
		}
		domainObject.setConsMediaType(value26);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value27 = null;
		if ( null != valueObject.getSessionStatus() ) 
		{
			value27 =
				domainFactory.getLookupInstance(valueObject.getSessionStatus().getID());
		}
		domainObject.setSessionStatus(value27);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSessionComment() != null && valueObject.getSessionComment().equals(""))
		{
			valueObject.setSessionComment(null);
		}
		domainObject.setSessionComment(valueObject.getSessionComment());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value29 = null;
		if ( null != valueObject.getCaseNoteFolderLocation() ) 
		{
			if (valueObject.getCaseNoteFolderLocation().getBoId() == null)
			{
				if (domMap.get(valueObject.getCaseNoteFolderLocation()) != null)
				{
					value29 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getCaseNoteFolderLocation());
				}
			}
			else
			{
				value29 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getCaseNoteFolderLocation().getBoId());
			}
		}
		domainObject.setCaseNoteFolderLocation(value29);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value30 = null;
		if ( null != valueObject.getListType() ) 
		{
			value30 =
				domainFactory.getLookupInstance(valueObject.getListType().getID());
		}
		domainObject.setListType(value30);

		return domainObject;
	}

}
