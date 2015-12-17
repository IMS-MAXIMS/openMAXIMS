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
public class SessionManagementVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.scheduling.vo.SessionManagementVo copy(ims.scheduling.vo.SessionManagementVo valueObjectDest, ims.scheduling.vo.SessionManagementVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Sch_Session(valueObjectSrc.getID_Sch_Session());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Name
		valueObjectDest.setName(valueObjectSrc.getName());
		// SessionDate
		valueObjectDest.setSessionDate(valueObjectSrc.getSessionDate());
		// StartTm
		valueObjectDest.setStartTm(valueObjectSrc.getStartTm());
		// EndTm
		valueObjectDest.setEndTm(valueObjectSrc.getEndTm());
		// Service
		valueObjectDest.setService(valueObjectSrc.getService());
		// SessionStatus
		valueObjectDest.setSessionStatus(valueObjectSrc.getSessionStatus());
		// RemainingSlots
		valueObjectDest.setRemainingSlots(valueObjectSrc.getRemainingSlots());
		// TotalSlots
		valueObjectDest.setTotalSlots(valueObjectSrc.getTotalSlots());
		// RemainingTime
		valueObjectDest.setRemainingTime(valueObjectSrc.getRemainingTime());
		// SchLocation
		valueObjectDest.setSchLocation(valueObjectSrc.getSchLocation());
		// SessionType
		valueObjectDest.setSessionType(valueObjectSrc.getSessionType());
		// ListOwners
		valueObjectDest.setListOwners(valueObjectSrc.getListOwners());
		// DirectoryofServices
		valueObjectDest.setDirectoryofServices(valueObjectSrc.getDirectoryofServices());
		// wasSessionMoved
		valueObjectDest.setWasSessionMoved(valueObjectSrc.getWasSessionMoved());
		// ListType
		valueObjectDest.setListType(valueObjectSrc.getListType());
		// ResponsibleHCP
		valueObjectDest.setResponsibleHCP(valueObjectSrc.getResponsibleHCP());
		// SessionComment
		valueObjectDest.setSessionComment(valueObjectSrc.getSessionComment());
		// isFixed
		valueObjectDest.setIsFixed(valueObjectSrc.getIsFixed());
		// SessionActivities
		valueObjectDest.setSessionActivities(valueObjectSrc.getSessionActivities());
		// SessionProfileType
		valueObjectDest.setSessionProfileType(valueObjectSrc.getSessionProfileType());
		// CancellationReason
		valueObjectDest.setCancellationReason(valueObjectSrc.getCancellationReason());
		// Comment
		valueObjectDest.setComment(valueObjectSrc.getComment());
		// SessionMove
		valueObjectDest.setSessionMove(valueObjectSrc.getSessionMove());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createSessionManagementVoCollectionFromSch_Session(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.Sch_Session objects.
	 */
	public static ims.scheduling.vo.SessionManagementVoCollection createSessionManagementVoCollectionFromSch_Session(java.util.Set domainObjectSet)	
	{
		return createSessionManagementVoCollectionFromSch_Session(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.Sch_Session objects.
	 */
	public static ims.scheduling.vo.SessionManagementVoCollection createSessionManagementVoCollectionFromSch_Session(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.scheduling.vo.SessionManagementVoCollection voList = new ims.scheduling.vo.SessionManagementVoCollection();
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
			ims.scheduling.vo.SessionManagementVo vo = create(map, domainObject);
			
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
	public static ims.scheduling.vo.SessionManagementVoCollection createSessionManagementVoCollectionFromSch_Session(java.util.List domainObjectList) 
	{
		return createSessionManagementVoCollectionFromSch_Session(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.scheduling.domain.objects.Sch_Session objects.
	 */
	public static ims.scheduling.vo.SessionManagementVoCollection createSessionManagementVoCollectionFromSch_Session(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.scheduling.vo.SessionManagementVoCollection voList = new ims.scheduling.vo.SessionManagementVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.scheduling.domain.objects.Sch_Session domainObject = (ims.scheduling.domain.objects.Sch_Session) domainObjectList.get(i);
			ims.scheduling.vo.SessionManagementVo vo = create(map, domainObject);

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
	 public static java.util.Set extractSch_SessionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionManagementVoCollection voCollection) 
	 {
	 	return extractSch_SessionSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractSch_SessionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionManagementVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.SessionManagementVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.Sch_Session domainObject = SessionManagementVoAssembler.extractSch_Session(domainFactory, vo, domMap);

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
	 public static java.util.List extractSch_SessionList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionManagementVoCollection voCollection) 
	 {
	 	return extractSch_SessionList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractSch_SessionList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionManagementVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.SessionManagementVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.Sch_Session domainObject = SessionManagementVoAssembler.extractSch_Session(domainFactory, vo, domMap);

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
	 public static ims.scheduling.vo.SessionManagementVo create(ims.scheduling.domain.objects.Sch_Session domainObject) 
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
	  public static ims.scheduling.vo.SessionManagementVo create(DomainObjectMap map, ims.scheduling.domain.objects.Sch_Session domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.scheduling.vo.SessionManagementVo valueObject = (ims.scheduling.vo.SessionManagementVo) map.getValueObject(domainObject, ims.scheduling.vo.SessionManagementVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.scheduling.vo.SessionManagementVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.scheduling.vo.SessionManagementVo insert(ims.scheduling.vo.SessionManagementVo valueObject, ims.scheduling.domain.objects.Sch_Session domainObject) 
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
	 public static ims.scheduling.vo.SessionManagementVo insert(DomainObjectMap map, ims.scheduling.vo.SessionManagementVo valueObject, ims.scheduling.domain.objects.Sch_Session domainObject) 
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
			
		// Name
		valueObject.setName(domainObject.getName());
		// SessionDate
		java.util.Date SessionDate = domainObject.getSessionDate();
		if ( null != SessionDate ) 
		{
			valueObject.setSessionDate(new ims.framework.utils.Date(SessionDate) );
		}
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
		// Service
		valueObject.setService(ims.core.vo.domain.ServiceShortVoAssembler.create(map, domainObject.getService()) );
		// SessionStatus
		ims.domain.lookups.LookupInstance instance6 = domainObject.getSessionStatus();
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

			ims.scheduling.vo.lookups.Session_Status_and_Reason voLookup6 = new ims.scheduling.vo.lookups.Session_Status_and_Reason(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.scheduling.vo.lookups.Session_Status_and_Reason parentVoLookup6 = voLookup6;
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
								parentVoLookup6.setParent(new ims.scheduling.vo.lookups.Session_Status_and_Reason(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setSessionStatus(voLookup6);
		}
				// RemainingSlots
		valueObject.setRemainingSlots(domainObject.getRemainingSlots());
		// TotalSlots
		valueObject.setTotalSlots(domainObject.getTotalSlots());
		// RemainingTime
		valueObject.setRemainingTime(domainObject.getRemainingTime());
		// SchLocation
		valueObject.setSchLocation(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getSchLocation()) );
		// SessionType
		ims.domain.lookups.LookupInstance instance11 = domainObject.getSessionType();
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

			ims.scheduling.vo.lookups.Sched_Profile_Type voLookup11 = new ims.scheduling.vo.lookups.Sched_Profile_Type(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.scheduling.vo.lookups.Sched_Profile_Type parentVoLookup11 = voLookup11;
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
								parentVoLookup11.setParent(new ims.scheduling.vo.lookups.Sched_Profile_Type(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setSessionType(voLookup11);
		}
				// ListOwners
		valueObject.setListOwners(ims.scheduling.vo.domain.Session_ListOwnerVoAssembler.createSession_ListOwnerVoCollectionFromSession_ListOwner(map, domainObject.getListOwners()) );
		// DirectoryofServices
		valueObject.setDirectoryofServices(ims.scheduling.vo.domain.DirectoryOfServiceVoAssembler.createDirectoryOfServiceVoCollectionFromDirectoryofService(map, domainObject.getDirectoryofServices()) );
		// wasSessionMoved
		valueObject.setWasSessionMoved( domainObject.isWasSessionMoved() );
		// ListType
		ims.domain.lookups.LookupInstance instance15 = domainObject.getListType();
		if ( null != instance15 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance15.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance15.getImage().getImageId(), instance15.getImage().getImagePath());
			}
			color = instance15.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.ProfileListType voLookup15 = new ims.scheduling.vo.lookups.ProfileListType(instance15.getId(),instance15.getText(), instance15.isActive(), null, img, color);
			ims.scheduling.vo.lookups.ProfileListType parentVoLookup15 = voLookup15;
			ims.domain.lookups.LookupInstance parent15 = instance15.getParent();
			while (parent15 != null)
			{
				if (parent15.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent15.getImage().getImageId(), parent15.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent15.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup15.setParent(new ims.scheduling.vo.lookups.ProfileListType(parent15.getId(),parent15.getText(), parent15.isActive(), null, img, color));
				parentVoLookup15 = parentVoLookup15.getParent();
								parent15 = parent15.getParent();
			}			
			valueObject.setListType(voLookup15);
		}
				// ResponsibleHCP
		valueObject.setResponsibleHCP(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getResponsibleHCP()) );
		// SessionComment
		valueObject.setSessionComment(domainObject.getSessionComment());
		// isFixed
		valueObject.setIsFixed( domainObject.isIsFixed() );
		// SessionActivities
		valueObject.setSessionActivities(ims.scheduling.vo.domain.SessionActivityLiteVoAssembler.createSessionActivityLiteVoCollectionFromSessionActivity(map, domainObject.getSessionActivities()) );
		// SessionProfileType
		ims.domain.lookups.LookupInstance instance20 = domainObject.getSessionProfileType();
		if ( null != instance20 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance20.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance20.getImage().getImageId(), instance20.getImage().getImagePath());
			}
			color = instance20.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.SchProfileType voLookup20 = new ims.scheduling.vo.lookups.SchProfileType(instance20.getId(),instance20.getText(), instance20.isActive(), null, img, color);
			ims.scheduling.vo.lookups.SchProfileType parentVoLookup20 = voLookup20;
			ims.domain.lookups.LookupInstance parent20 = instance20.getParent();
			while (parent20 != null)
			{
				if (parent20.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent20.getImage().getImageId(), parent20.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent20.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup20.setParent(new ims.scheduling.vo.lookups.SchProfileType(parent20.getId(),parent20.getText(), parent20.isActive(), null, img, color));
				parentVoLookup20 = parentVoLookup20.getParent();
								parent20 = parent20.getParent();
			}			
			valueObject.setSessionProfileType(voLookup20);
		}
				// CancellationReason
		ims.domain.lookups.LookupInstance instance21 = domainObject.getCancellationReason();
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

			ims.scheduling.vo.lookups.CancelAppointmentReason voLookup21 = new ims.scheduling.vo.lookups.CancelAppointmentReason(instance21.getId(),instance21.getText(), instance21.isActive(), null, img, color);
			ims.scheduling.vo.lookups.CancelAppointmentReason parentVoLookup21 = voLookup21;
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
								parentVoLookup21.setParent(new ims.scheduling.vo.lookups.CancelAppointmentReason(parent21.getId(),parent21.getText(), parent21.isActive(), null, img, color));
				parentVoLookup21 = parentVoLookup21.getParent();
								parent21 = parent21.getParent();
			}			
			valueObject.setCancellationReason(voLookup21);
		}
				// Comment
		valueObject.setComment(domainObject.getComment());
		// SessionMove
		valueObject.setSessionMove(ims.scheduling.vo.domain.SessionMoveVoAssembler.createSessionMoveVoCollectionFromSessionMove(map, domainObject.getSessionMove()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.scheduling.domain.objects.Sch_Session extractSch_Session(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionManagementVo valueObject) 
	{
		return 	extractSch_Session(domainFactory, valueObject, new HashMap());
	}

	public static ims.scheduling.domain.objects.Sch_Session extractSch_Session(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionManagementVo valueObject, HashMap domMap) 
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
			// ims.scheduling.vo.SessionManagementVo ID_Sch_Session field is unknown
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
		if (valueObject.getName() != null && valueObject.getName().equals(""))
		{
			valueObject.setName(null);
		}
		domainObject.setName(valueObject.getName());
		java.util.Date value2 = null;
		ims.framework.utils.Date date2 = valueObject.getSessionDate();		
		if ( date2 != null ) 
		{
			value2 = date2.getDate();
		}
		domainObject.setSessionDate(value2);
		ims.framework.utils.Time time3 = valueObject.getStartTm();
		String value3 = null;
		if ( time3 != null ) 
		{
			value3 = time3.toString();
		}
		domainObject.setStartTm(value3);
		ims.framework.utils.Time time4 = valueObject.getEndTm();
		String value4 = null;
		if ( time4 != null ) 
		{
			value4 = time4.toString();
		}
		domainObject.setEndTm(value4);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.Service value5 = null;
		if ( null != valueObject.getService() ) 
		{
			if (valueObject.getService().getBoId() == null)
			{
				if (domMap.get(valueObject.getService()) != null)
				{
					value5 = (ims.core.clinical.domain.objects.Service)domMap.get(valueObject.getService());
				}
			}
			else
			{
				value5 = (ims.core.clinical.domain.objects.Service)domainFactory.getDomainObject(ims.core.clinical.domain.objects.Service.class, valueObject.getService().getBoId());
			}
		}
		domainObject.setService(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getSessionStatus() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getSessionStatus().getID());
		}
		domainObject.setSessionStatus(value6);
		domainObject.setRemainingSlots(valueObject.getRemainingSlots());
		domainObject.setTotalSlots(valueObject.getTotalSlots());
		domainObject.setRemainingTime(valueObject.getRemainingTime());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value10 = null;
		if ( null != valueObject.getSchLocation() ) 
		{
			if (valueObject.getSchLocation().getBoId() == null)
			{
				if (domMap.get(valueObject.getSchLocation()) != null)
				{
					value10 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getSchLocation());
				}
			}
			else
			{
				value10 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getSchLocation().getBoId());
			}
		}
		domainObject.setSchLocation(value10);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getSessionType() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getSessionType().getID());
		}
		domainObject.setSessionType(value11);

		// SaveAsRefVO treated as RefValueObject
		ims.scheduling.vo.Session_ListOwnerRefVoCollection refCollection12 = new ims.scheduling.vo.Session_ListOwnerRefVoCollection();
		if (valueObject.getListOwners() != null)
		{
			for (int i12=0; i12<valueObject.getListOwners().size(); i12++)
			{
				ims.scheduling.vo.Session_ListOwnerRefVo ref12 = (ims.scheduling.vo.Session_ListOwnerRefVo)valueObject.getListOwners().get(i12);
				refCollection12.add(ref12);
			}
		}
		int size12 = (null == refCollection12) ? 0 : refCollection12.size();		
		java.util.Set domainListOwners12 = domainObject.getListOwners();
		if (domainListOwners12 == null)
		{
			domainListOwners12 = new java.util.HashSet();
		}
		java.util.Set newSet12  = new java.util.HashSet();
		for(int i=0; i<size12; i++) 
		{
			ims.scheduling.vo.Session_ListOwnerRefVo vo = refCollection12.get(i);					
			ims.scheduling.domain.objects.Session_ListOwner dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.scheduling.domain.objects.Session_ListOwner)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.scheduling.domain.objects.Session_ListOwner)domainFactory.getDomainObject( ims.scheduling.domain.objects.Session_ListOwner.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainListOwners12.contains(dom))
			{
				domainListOwners12.add(dom);
			}
			newSet12.add(dom);			
		}
		java.util.Set removedSet12 = new java.util.HashSet();
		java.util.Iterator iter12 = domainListOwners12.iterator();
		//Find out which objects need to be removed
		while (iter12.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter12.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet12.contains(o))
			{
				removedSet12.add(o);
			}
		}
		iter12 = removedSet12.iterator();
		//Remove the unwanted objects
		while (iter12.hasNext())
		{
			domainListOwners12.remove(iter12.next());
		}		
		
		domainObject.setListOwners(domainListOwners12);		

		// SaveAsRefVO treated as RefValueObject
		ims.scheduling.vo.DirectoryofServiceRefVoCollection refCollection13 = new ims.scheduling.vo.DirectoryofServiceRefVoCollection();
		if (valueObject.getDirectoryofServices() != null)
		{
			for (int i13=0; i13<valueObject.getDirectoryofServices().size(); i13++)
			{
				ims.scheduling.vo.DirectoryofServiceRefVo ref13 = (ims.scheduling.vo.DirectoryofServiceRefVo)valueObject.getDirectoryofServices().get(i13);
				refCollection13.add(ref13);
			}
		}
		int size13 = (null == refCollection13) ? 0 : refCollection13.size();		
		java.util.Set domainDirectoryofServices13 = domainObject.getDirectoryofServices();
		if (domainDirectoryofServices13 == null)
		{
			domainDirectoryofServices13 = new java.util.HashSet();
		}
		java.util.Set newSet13  = new java.util.HashSet();
		for(int i=0; i<size13; i++) 
		{
			ims.scheduling.vo.DirectoryofServiceRefVo vo = refCollection13.get(i);					
			ims.scheduling.domain.objects.DirectoryofService dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.scheduling.domain.objects.DirectoryofService)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.scheduling.domain.objects.DirectoryofService)domainFactory.getDomainObject( ims.scheduling.domain.objects.DirectoryofService.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainDirectoryofServices13.contains(dom))
			{
				domainDirectoryofServices13.add(dom);
			}
			newSet13.add(dom);			
		}
		java.util.Set removedSet13 = new java.util.HashSet();
		java.util.Iterator iter13 = domainDirectoryofServices13.iterator();
		//Find out which objects need to be removed
		while (iter13.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter13.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet13.contains(o))
			{
				removedSet13.add(o);
			}
		}
		iter13 = removedSet13.iterator();
		//Remove the unwanted objects
		while (iter13.hasNext())
		{
			domainDirectoryofServices13.remove(iter13.next());
		}		
		
		domainObject.setDirectoryofServices(domainDirectoryofServices13);		
		domainObject.setWasSessionMoved(valueObject.getWasSessionMoved());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value15 = null;
		if ( null != valueObject.getListType() ) 
		{
			value15 =
				domainFactory.getLookupInstance(valueObject.getListType().getID());
		}
		domainObject.setListType(value15);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value16 = null;
		if ( null != valueObject.getResponsibleHCP() ) 
		{
			if (valueObject.getResponsibleHCP().getBoId() == null)
			{
				if (domMap.get(valueObject.getResponsibleHCP()) != null)
				{
					value16 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getResponsibleHCP());
				}
			}
			else
			{
				value16 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getResponsibleHCP().getBoId());
			}
		}
		domainObject.setResponsibleHCP(value16);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSessionComment() != null && valueObject.getSessionComment().equals(""))
		{
			valueObject.setSessionComment(null);
		}
		domainObject.setSessionComment(valueObject.getSessionComment());
		domainObject.setIsFixed(valueObject.getIsFixed());

		// SaveAsRefVO treated as RefValueObject
		ims.scheduling.vo.SessionActivityRefVoCollection refCollection19 = new ims.scheduling.vo.SessionActivityRefVoCollection();
		if (valueObject.getSessionActivities() != null)
		{
			for (int i19=0; i19<valueObject.getSessionActivities().size(); i19++)
			{
				ims.scheduling.vo.SessionActivityRefVo ref19 = (ims.scheduling.vo.SessionActivityRefVo)valueObject.getSessionActivities().get(i19);
				refCollection19.add(ref19);
			}
		}
		int size19 = (null == refCollection19) ? 0 : refCollection19.size();		
		java.util.Set domainSessionActivities19 = domainObject.getSessionActivities();
		if (domainSessionActivities19 == null)
		{
			domainSessionActivities19 = new java.util.HashSet();
		}
		java.util.Set newSet19  = new java.util.HashSet();
		for(int i=0; i<size19; i++) 
		{
			ims.scheduling.vo.SessionActivityRefVo vo = refCollection19.get(i);					
			ims.scheduling.domain.objects.SessionActivity dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.scheduling.domain.objects.SessionActivity)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.scheduling.domain.objects.SessionActivity)domainFactory.getDomainObject( ims.scheduling.domain.objects.SessionActivity.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainSessionActivities19.contains(dom))
			{
				domainSessionActivities19.add(dom);
			}
			newSet19.add(dom);			
		}
		java.util.Set removedSet19 = new java.util.HashSet();
		java.util.Iterator iter19 = domainSessionActivities19.iterator();
		//Find out which objects need to be removed
		while (iter19.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter19.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet19.contains(o))
			{
				removedSet19.add(o);
			}
		}
		iter19 = removedSet19.iterator();
		//Remove the unwanted objects
		while (iter19.hasNext())
		{
			domainSessionActivities19.remove(iter19.next());
		}		
		
		domainObject.setSessionActivities(domainSessionActivities19);		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value20 = null;
		if ( null != valueObject.getSessionProfileType() ) 
		{
			value20 =
				domainFactory.getLookupInstance(valueObject.getSessionProfileType().getID());
		}
		domainObject.setSessionProfileType(value20);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value21 = null;
		if ( null != valueObject.getCancellationReason() ) 
		{
			value21 =
				domainFactory.getLookupInstance(valueObject.getCancellationReason().getID());
		}
		domainObject.setCancellationReason(value21);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getComment() != null && valueObject.getComment().equals(""))
		{
			valueObject.setComment(null);
		}
		domainObject.setComment(valueObject.getComment());

		// SaveAsRefVO treated as RefValueObject
		ims.scheduling.vo.SessionMoveRefVoCollection refCollection23 = new ims.scheduling.vo.SessionMoveRefVoCollection();
		if (valueObject.getSessionMove() != null)
		{
			for (int i23=0; i23<valueObject.getSessionMove().size(); i23++)
			{
				ims.scheduling.vo.SessionMoveRefVo ref23 = (ims.scheduling.vo.SessionMoveRefVo)valueObject.getSessionMove().get(i23);
				refCollection23.add(ref23);
			}
		}
		int size23 = (null == refCollection23) ? 0 : refCollection23.size();		
		java.util.List domainSessionMove23 = domainObject.getSessionMove();
		if (domainSessionMove23 == null)
		{
			domainSessionMove23 = new java.util.ArrayList();
		}
		for(int i=0; i < size23; i++) 
		{
			ims.scheduling.vo.SessionMoveRefVo vo = refCollection23.get(i);			
			ims.scheduling.domain.objects.SessionMove dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.scheduling.domain.objects.SessionMove)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.scheduling.domain.objects.SessionMove)domainFactory.getDomainObject( ims.scheduling.domain.objects.SessionMove.class, vo.getBoId());
				}
			}

			int domIdx = domainSessionMove23.indexOf(dom);
			if (domIdx == -1)
			{
				domainSessionMove23.add(i, dom);
			}
			else if (i != domIdx && i < domainSessionMove23.size())
			{
				Object tmp = domainSessionMove23.get(i);
				domainSessionMove23.set(i, domainSessionMove23.get(domIdx));
				domainSessionMove23.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i23 = domainSessionMove23.size();
		while (i23 > size23)
		{
			domainSessionMove23.remove(i23-1);
			i23 = domainSessionMove23.size();
		}
		
		domainObject.setSessionMove(domainSessionMove23);		

		return domainObject;
	}

}
