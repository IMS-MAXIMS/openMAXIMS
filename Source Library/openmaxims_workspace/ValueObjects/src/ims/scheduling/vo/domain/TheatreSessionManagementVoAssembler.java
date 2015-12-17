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
public class TheatreSessionManagementVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.scheduling.vo.TheatreSessionManagementVo copy(ims.scheduling.vo.TheatreSessionManagementVo valueObjectDest, ims.scheduling.vo.TheatreSessionManagementVo valueObjectSrc) 
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
		// isFixed
		valueObjectDest.setIsFixed(valueObjectSrc.getIsFixed());
		// RemainingTime
		valueObjectDest.setRemainingTime(valueObjectSrc.getRemainingTime());
		// SchLocation
		valueObjectDest.setSchLocation(valueObjectSrc.getSchLocation());
		// wasSessionMoved
		valueObjectDest.setWasSessionMoved(valueObjectSrc.getWasSessionMoved());
		// SessionComment
		valueObjectDest.setSessionComment(valueObjectSrc.getSessionComment());
		// ListType
		valueObjectDest.setListType(valueObjectSrc.getListType());
		// ResponsibleHCP
		valueObjectDest.setResponsibleHCP(valueObjectSrc.getResponsibleHCP());
		// SlotType
		valueObjectDest.setSlotType(valueObjectSrc.getSlotType());
		// SessionProfileType
		valueObjectDest.setSessionProfileType(valueObjectSrc.getSessionProfileType());
		// ListOwners
		valueObjectDest.setListOwners(valueObjectSrc.getListOwners());
		// SessionMove
		valueObjectDest.setSessionMove(valueObjectSrc.getSessionMove());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createTheatreSessionManagementVoCollectionFromSch_Session(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.Sch_Session objects.
	 */
	public static ims.scheduling.vo.TheatreSessionManagementVoCollection createTheatreSessionManagementVoCollectionFromSch_Session(java.util.Set domainObjectSet)	
	{
		return createTheatreSessionManagementVoCollectionFromSch_Session(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.Sch_Session objects.
	 */
	public static ims.scheduling.vo.TheatreSessionManagementVoCollection createTheatreSessionManagementVoCollectionFromSch_Session(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.scheduling.vo.TheatreSessionManagementVoCollection voList = new ims.scheduling.vo.TheatreSessionManagementVoCollection();
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
			ims.scheduling.vo.TheatreSessionManagementVo vo = create(map, domainObject);
			
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
	public static ims.scheduling.vo.TheatreSessionManagementVoCollection createTheatreSessionManagementVoCollectionFromSch_Session(java.util.List domainObjectList) 
	{
		return createTheatreSessionManagementVoCollectionFromSch_Session(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.scheduling.domain.objects.Sch_Session objects.
	 */
	public static ims.scheduling.vo.TheatreSessionManagementVoCollection createTheatreSessionManagementVoCollectionFromSch_Session(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.scheduling.vo.TheatreSessionManagementVoCollection voList = new ims.scheduling.vo.TheatreSessionManagementVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.scheduling.domain.objects.Sch_Session domainObject = (ims.scheduling.domain.objects.Sch_Session) domainObjectList.get(i);
			ims.scheduling.vo.TheatreSessionManagementVo vo = create(map, domainObject);

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
	 public static java.util.Set extractSch_SessionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.TheatreSessionManagementVoCollection voCollection) 
	 {
	 	return extractSch_SessionSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractSch_SessionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.TheatreSessionManagementVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.TheatreSessionManagementVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.Sch_Session domainObject = TheatreSessionManagementVoAssembler.extractSch_Session(domainFactory, vo, domMap);

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
	 public static java.util.List extractSch_SessionList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.TheatreSessionManagementVoCollection voCollection) 
	 {
	 	return extractSch_SessionList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractSch_SessionList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.TheatreSessionManagementVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.TheatreSessionManagementVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.Sch_Session domainObject = TheatreSessionManagementVoAssembler.extractSch_Session(domainFactory, vo, domMap);

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
	 public static ims.scheduling.vo.TheatreSessionManagementVo create(ims.scheduling.domain.objects.Sch_Session domainObject) 
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
	  public static ims.scheduling.vo.TheatreSessionManagementVo create(DomainObjectMap map, ims.scheduling.domain.objects.Sch_Session domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.scheduling.vo.TheatreSessionManagementVo valueObject = (ims.scheduling.vo.TheatreSessionManagementVo) map.getValueObject(domainObject, ims.scheduling.vo.TheatreSessionManagementVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.scheduling.vo.TheatreSessionManagementVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.scheduling.vo.TheatreSessionManagementVo insert(ims.scheduling.vo.TheatreSessionManagementVo valueObject, ims.scheduling.domain.objects.Sch_Session domainObject) 
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
	 public static ims.scheduling.vo.TheatreSessionManagementVo insert(DomainObjectMap map, ims.scheduling.vo.TheatreSessionManagementVo valueObject, ims.scheduling.domain.objects.Sch_Session domainObject) 
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
		// isFixed
		valueObject.setIsFixed( domainObject.isIsFixed() );
		// RemainingTime
		valueObject.setRemainingTime(domainObject.getRemainingTime());
		// SchLocation
		valueObject.setSchLocation(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getSchLocation()) );
		// wasSessionMoved
		valueObject.setWasSessionMoved( domainObject.isWasSessionMoved() );
		// SessionComment
		valueObject.setSessionComment(domainObject.getSessionComment());
		// ListType
		ims.domain.lookups.LookupInstance instance14 = domainObject.getListType();
		if ( null != instance14 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance14.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance14.getImage().getImageId(), instance14.getImage().getImagePath());
			}
			color = instance14.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.ProfileListType voLookup14 = new ims.scheduling.vo.lookups.ProfileListType(instance14.getId(),instance14.getText(), instance14.isActive(), null, img, color);
			ims.scheduling.vo.lookups.ProfileListType parentVoLookup14 = voLookup14;
			ims.domain.lookups.LookupInstance parent14 = instance14.getParent();
			while (parent14 != null)
			{
				if (parent14.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent14.getImage().getImageId(), parent14.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent14.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup14.setParent(new ims.scheduling.vo.lookups.ProfileListType(parent14.getId(),parent14.getText(), parent14.isActive(), null, img, color));
				parentVoLookup14 = parentVoLookup14.getParent();
								parent14 = parent14.getParent();
			}			
			valueObject.setListType(voLookup14);
		}
				// ResponsibleHCP
		valueObject.setResponsibleHCP(ims.core.vo.domain.HcpLiteVoAssembler.create(map, domainObject.getResponsibleHCP()) );
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
				// SessionProfileType
		ims.domain.lookups.LookupInstance instance17 = domainObject.getSessionProfileType();
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

			ims.scheduling.vo.lookups.SchProfileType voLookup17 = new ims.scheduling.vo.lookups.SchProfileType(instance17.getId(),instance17.getText(), instance17.isActive(), null, img, color);
			ims.scheduling.vo.lookups.SchProfileType parentVoLookup17 = voLookup17;
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
								parentVoLookup17.setParent(new ims.scheduling.vo.lookups.SchProfileType(parent17.getId(),parent17.getText(), parent17.isActive(), null, img, color));
				parentVoLookup17 = parentVoLookup17.getParent();
								parent17 = parent17.getParent();
			}			
			valueObject.setSessionProfileType(voLookup17);
		}
				// ListOwners
		valueObject.setListOwners(ims.scheduling.vo.domain.Session_ListOwnerVoAssembler.createSession_ListOwnerVoCollectionFromSession_ListOwner(map, domainObject.getListOwners()) );
		// SessionMove
		valueObject.setSessionMove(ims.scheduling.vo.domain.SessionMoveVoAssembler.createSessionMoveVoCollectionFromSessionMove(map, domainObject.getSessionMove()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.scheduling.domain.objects.Sch_Session extractSch_Session(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.TheatreSessionManagementVo valueObject) 
	{
		return 	extractSch_Session(domainFactory, valueObject, new HashMap());
	}

	public static ims.scheduling.domain.objects.Sch_Session extractSch_Session(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.TheatreSessionManagementVo valueObject, HashMap domMap) 
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
			// ims.scheduling.vo.TheatreSessionManagementVo ID_Sch_Session field is unknown
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
		domainObject.setIsFixed(valueObject.getIsFixed());
		domainObject.setRemainingTime(valueObject.getRemainingTime());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value11 = null;
		if ( null != valueObject.getSchLocation() ) 
		{
			if (valueObject.getSchLocation().getBoId() == null)
			{
				if (domMap.get(valueObject.getSchLocation()) != null)
				{
					value11 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getSchLocation());
				}
			}
			else
			{
				value11 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getSchLocation().getBoId());
			}
		}
		domainObject.setSchLocation(value11);
		domainObject.setWasSessionMoved(valueObject.getWasSessionMoved());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSessionComment() != null && valueObject.getSessionComment().equals(""))
		{
			valueObject.setSessionComment(null);
		}
		domainObject.setSessionComment(valueObject.getSessionComment());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value14 = null;
		if ( null != valueObject.getListType() ) 
		{
			value14 =
				domainFactory.getLookupInstance(valueObject.getListType().getID());
		}
		domainObject.setListType(value14);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.Hcp value15 = null;
		if ( null != valueObject.getResponsibleHCP() ) 
		{
			if (valueObject.getResponsibleHCP().getBoId() == null)
			{
				if (domMap.get(valueObject.getResponsibleHCP()) != null)
				{
					value15 = (ims.core.resource.people.domain.objects.Hcp)domMap.get(valueObject.getResponsibleHCP());
				}
			}
			else
			{
				value15 = (ims.core.resource.people.domain.objects.Hcp)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.Hcp.class, valueObject.getResponsibleHCP().getBoId());
			}
		}
		domainObject.setResponsibleHCP(value15);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value16 = null;
		if ( null != valueObject.getSlotType() ) 
		{
			value16 =
				domainFactory.getLookupInstance(valueObject.getSlotType().getID());
		}
		domainObject.setSlotType(value16);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value17 = null;
		if ( null != valueObject.getSessionProfileType() ) 
		{
			value17 =
				domainFactory.getLookupInstance(valueObject.getSessionProfileType().getID());
		}
		domainObject.setSessionProfileType(value17);

		// SaveAsRefVO treated as RefValueObject
		ims.scheduling.vo.Session_ListOwnerRefVoCollection refCollection18 = new ims.scheduling.vo.Session_ListOwnerRefVoCollection();
		if (valueObject.getListOwners() != null)
		{
			for (int i18=0; i18<valueObject.getListOwners().size(); i18++)
			{
				ims.scheduling.vo.Session_ListOwnerRefVo ref18 = (ims.scheduling.vo.Session_ListOwnerRefVo)valueObject.getListOwners().get(i18);
				refCollection18.add(ref18);
			}
		}
		int size18 = (null == refCollection18) ? 0 : refCollection18.size();		
		java.util.Set domainListOwners18 = domainObject.getListOwners();
		if (domainListOwners18 == null)
		{
			domainListOwners18 = new java.util.HashSet();
		}
		java.util.Set newSet18  = new java.util.HashSet();
		for(int i=0; i<size18; i++) 
		{
			ims.scheduling.vo.Session_ListOwnerRefVo vo = refCollection18.get(i);					
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
			if (!domainListOwners18.contains(dom))
			{
				domainListOwners18.add(dom);
			}
			newSet18.add(dom);			
		}
		java.util.Set removedSet18 = new java.util.HashSet();
		java.util.Iterator iter18 = domainListOwners18.iterator();
		//Find out which objects need to be removed
		while (iter18.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter18.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet18.contains(o))
			{
				removedSet18.add(o);
			}
		}
		iter18 = removedSet18.iterator();
		//Remove the unwanted objects
		while (iter18.hasNext())
		{
			domainListOwners18.remove(iter18.next());
		}		
		
		domainObject.setListOwners(domainListOwners18);		

		// SaveAsRefVO treated as RefValueObject
		ims.scheduling.vo.SessionMoveRefVoCollection refCollection19 = new ims.scheduling.vo.SessionMoveRefVoCollection();
		if (valueObject.getSessionMove() != null)
		{
			for (int i19=0; i19<valueObject.getSessionMove().size(); i19++)
			{
				ims.scheduling.vo.SessionMoveRefVo ref19 = (ims.scheduling.vo.SessionMoveRefVo)valueObject.getSessionMove().get(i19);
				refCollection19.add(ref19);
			}
		}
		int size19 = (null == refCollection19) ? 0 : refCollection19.size();		
		java.util.List domainSessionMove19 = domainObject.getSessionMove();
		if (domainSessionMove19 == null)
		{
			domainSessionMove19 = new java.util.ArrayList();
		}
		for(int i=0; i < size19; i++) 
		{
			ims.scheduling.vo.SessionMoveRefVo vo = refCollection19.get(i);			
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

			int domIdx = domainSessionMove19.indexOf(dom);
			if (domIdx == -1)
			{
				domainSessionMove19.add(i, dom);
			}
			else if (i != domIdx && i < domainSessionMove19.size())
			{
				Object tmp = domainSessionMove19.get(i);
				domainSessionMove19.set(i, domainSessionMove19.get(domIdx));
				domainSessionMove19.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i19 = domainSessionMove19.size();
		while (i19 > size19)
		{
			domainSessionMove19.remove(i19-1);
			i19 = domainSessionMove19.size();
		}
		
		domainObject.setSessionMove(domainSessionMove19);		

		return domainObject;
	}

}
