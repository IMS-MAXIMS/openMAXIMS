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
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Rory Fitzpatrick
 */
public class UserWorkQueueVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.UserWorkQueueVo copy(ims.core.vo.UserWorkQueueVo valueObjectDest, ims.core.vo.UserWorkQueueVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_UserWorkQueue(valueObjectSrc.getID_UserWorkQueue());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// TargetUser
		valueObjectDest.setTargetUser(valueObjectSrc.getTargetUser());
		// RequestedBy
		valueObjectDest.setRequestedBy(valueObjectSrc.getRequestedBy());
		// RequestDateTime
		valueObjectDest.setRequestDateTime(valueObjectSrc.getRequestDateTime());
		// RequiredOnDate
		valueObjectDest.setRequiredOnDate(valueObjectSrc.getRequiredOnDate());
		// CurrentStatus
		valueObjectDest.setCurrentStatus(valueObjectSrc.getCurrentStatus());
		// RequestingObjectID
		valueObjectDest.setRequestingObjectID(valueObjectSrc.getRequestingObjectID());
		// Description
		valueObjectDest.setDescription(valueObjectSrc.getDescription());
		// TargetObjectID
		valueObjectDest.setTargetObjectID(valueObjectSrc.getTargetObjectID());
		// RequestingForm
		valueObjectDest.setRequestingForm(valueObjectSrc.getRequestingForm());
		// TargetForm
		valueObjectDest.setTargetForm(valueObjectSrc.getTargetForm());
		// RequestType
		valueObjectDest.setRequestType(valueObjectSrc.getRequestType());
		// StatusHistory
		valueObjectDest.setStatusHistory(valueObjectSrc.getStatusHistory());
		// OrigNoteType
		valueObjectDest.setOrigNoteType(valueObjectSrc.getOrigNoteType());
		// Comments
		valueObjectDest.setComments(valueObjectSrc.getComments());
		// ProcedureLocationService
		valueObjectDest.setProcedureLocationService(valueObjectSrc.getProcedureLocationService());
		// ProcedureActivity
		valueObjectDest.setProcedureActivity(valueObjectSrc.getProcedureActivity());
		// ProcedureContext
		valueObjectDest.setProcedureContext(valueObjectSrc.getProcedureContext());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createUserWorkQueueVoCollectionFromUserWorkQueue(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.resource.place.domain.objects.UserWorkQueue objects.
	 */
	public static ims.core.vo.UserWorkQueueVoCollection createUserWorkQueueVoCollectionFromUserWorkQueue(java.util.Set domainObjectSet)	
	{
		return createUserWorkQueueVoCollectionFromUserWorkQueue(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.resource.place.domain.objects.UserWorkQueue objects.
	 */
	public static ims.core.vo.UserWorkQueueVoCollection createUserWorkQueueVoCollectionFromUserWorkQueue(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.UserWorkQueueVoCollection voList = new ims.core.vo.UserWorkQueueVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.resource.place.domain.objects.UserWorkQueue domainObject = (ims.core.resource.place.domain.objects.UserWorkQueue) iterator.next();
			ims.core.vo.UserWorkQueueVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.resource.place.domain.objects.UserWorkQueue objects.
	 */
	public static ims.core.vo.UserWorkQueueVoCollection createUserWorkQueueVoCollectionFromUserWorkQueue(java.util.List domainObjectList) 
	{
		return createUserWorkQueueVoCollectionFromUserWorkQueue(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.resource.place.domain.objects.UserWorkQueue objects.
	 */
	public static ims.core.vo.UserWorkQueueVoCollection createUserWorkQueueVoCollectionFromUserWorkQueue(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.UserWorkQueueVoCollection voList = new ims.core.vo.UserWorkQueueVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.resource.place.domain.objects.UserWorkQueue domainObject = (ims.core.resource.place.domain.objects.UserWorkQueue) domainObjectList.get(i);
			ims.core.vo.UserWorkQueueVo vo = create(map, domainObject);

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
	 * Create the ims.core.resource.place.domain.objects.UserWorkQueue set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractUserWorkQueueSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.UserWorkQueueVoCollection voCollection) 
	 {
	 	return extractUserWorkQueueSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractUserWorkQueueSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.UserWorkQueueVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.UserWorkQueueVo vo = voCollection.get(i);
			ims.core.resource.place.domain.objects.UserWorkQueue domainObject = UserWorkQueueVoAssembler.extractUserWorkQueue(domainFactory, vo, domMap);

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
	 * Create the ims.core.resource.place.domain.objects.UserWorkQueue list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractUserWorkQueueList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.UserWorkQueueVoCollection voCollection) 
	 {
	 	return extractUserWorkQueueList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractUserWorkQueueList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.UserWorkQueueVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.UserWorkQueueVo vo = voCollection.get(i);
			ims.core.resource.place.domain.objects.UserWorkQueue domainObject = UserWorkQueueVoAssembler.extractUserWorkQueue(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.resource.place.domain.objects.UserWorkQueue object.
	 * @param domainObject ims.core.resource.place.domain.objects.UserWorkQueue
	 */
	 public static ims.core.vo.UserWorkQueueVo create(ims.core.resource.place.domain.objects.UserWorkQueue domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.resource.place.domain.objects.UserWorkQueue object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.UserWorkQueueVo create(DomainObjectMap map, ims.core.resource.place.domain.objects.UserWorkQueue domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.UserWorkQueueVo valueObject = (ims.core.vo.UserWorkQueueVo) map.getValueObject(domainObject, ims.core.vo.UserWorkQueueVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.UserWorkQueueVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.resource.place.domain.objects.UserWorkQueue
	 */
	 public static ims.core.vo.UserWorkQueueVo insert(ims.core.vo.UserWorkQueueVo valueObject, ims.core.resource.place.domain.objects.UserWorkQueue domainObject) 
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
	 * @param domainObject ims.core.resource.place.domain.objects.UserWorkQueue
	 */
	 public static ims.core.vo.UserWorkQueueVo insert(DomainObjectMap map, ims.core.vo.UserWorkQueueVo valueObject, ims.core.resource.place.domain.objects.UserWorkQueue domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_UserWorkQueue(domainObject.getId());
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
			
		// TargetUser
		valueObject.setTargetUser(ims.core.vo.domain.MemberOfStaffShortVoAssembler.create(map, domainObject.getTargetUser()) );
		// RequestedBy
		valueObject.setRequestedBy(ims.core.vo.domain.MemberOfStaffShortVoAssembler.create(map, domainObject.getRequestedBy()) );
		// RequestDateTime
		java.util.Date RequestDateTime = domainObject.getRequestDateTime();
		if ( null != RequestDateTime ) 
		{
			valueObject.setRequestDateTime(new ims.framework.utils.DateTime(RequestDateTime) );
		}
		// RequiredOnDate
		java.util.Date RequiredOnDate = domainObject.getRequiredOnDate();
		if ( null != RequiredOnDate ) 
		{
			valueObject.setRequiredOnDate(new ims.framework.utils.Date(RequiredOnDate) );
		}
		// CurrentStatus
		ims.domain.lookups.LookupInstance instance5 = domainObject.getCurrentStatus();
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

			ims.ntpf.vo.lookups.WorkQueueStatus voLookup5 = new ims.ntpf.vo.lookups.WorkQueueStatus(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.ntpf.vo.lookups.WorkQueueStatus parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.ntpf.vo.lookups.WorkQueueStatus(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setCurrentStatus(voLookup5);
		}
				// RequestingObjectID
		valueObject.setRequestingObjectID(domainObject.getRequestingObjectID());
		// Description
		valueObject.setDescription(domainObject.getDescription());
		// TargetObjectID
		valueObject.setTargetObjectID(domainObject.getTargetObjectID());
		// RequestingForm
		valueObject.setRequestingForm(domainObject.getRequestingForm());
		// TargetForm
		valueObject.setTargetForm(domainObject.getTargetForm());
		// RequestType
		valueObject.setRequestType(ims.core.vo.domain.ActivityVoAssembler.create(map, domainObject.getRequestType()) );
		// StatusHistory
		valueObject.setStatusHistory(ims.core.vo.domain.WorkQueueStatusHistoryVoAssembler.createWorkQueueStatusHistoryVoCollectionFromWorkQueueStatus(map, domainObject.getStatusHistory()) );
		// OrigNoteType
		ims.domain.lookups.LookupInstance instance13 = domainObject.getOrigNoteType();
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

			ims.ntpf.vo.lookups.CommentContextType voLookup13 = new ims.ntpf.vo.lookups.CommentContextType(instance13.getId(),instance13.getText(), instance13.isActive(), null, img, color);
			ims.ntpf.vo.lookups.CommentContextType parentVoLookup13 = voLookup13;
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
								parentVoLookup13.setParent(new ims.ntpf.vo.lookups.CommentContextType(parent13.getId(),parent13.getText(), parent13.isActive(), null, img, color));
				parentVoLookup13 = parentVoLookup13.getParent();
								parent13 = parent13.getParent();
			}			
			valueObject.setOrigNoteType(voLookup13);
		}
				// Comments
		valueObject.setComments(domainObject.getComments());
		// ProcedureLocationService
		if (domainObject.getProcedureLocationService() != null)
		{
			if(domainObject.getProcedureLocationService() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getProcedureLocationService();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setProcedureLocationService(new ims.core.resource.place.vo.LocationServiceRefVo(id, -1));				
			}
			else
			{
				valueObject.setProcedureLocationService(new ims.core.resource.place.vo.LocationServiceRefVo(domainObject.getProcedureLocationService().getId(), domainObject.getProcedureLocationService().getVersion()));
			}
		}
		// ProcedureActivity
		if (domainObject.getProcedureActivity() != null)
		{
			if(domainObject.getProcedureActivity() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getProcedureActivity();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setProcedureActivity(new ims.core.resource.place.vo.ActivityRefVo(id, -1));				
			}
			else
			{
				valueObject.setProcedureActivity(new ims.core.resource.place.vo.ActivityRefVo(domainObject.getProcedureActivity().getId(), domainObject.getProcedureActivity().getVersion()));
			}
		}
		// ProcedureContext
		ims.domain.lookups.LookupInstance instance17 = domainObject.getProcedureContext();
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

			ims.core.vo.lookups.ProcedureContext voLookup17 = new ims.core.vo.lookups.ProcedureContext(instance17.getId(),instance17.getText(), instance17.isActive(), null, img, color);
			ims.core.vo.lookups.ProcedureContext parentVoLookup17 = voLookup17;
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
								parentVoLookup17.setParent(new ims.core.vo.lookups.ProcedureContext(parent17.getId(),parent17.getText(), parent17.isActive(), null, img, color));
				parentVoLookup17 = parentVoLookup17.getParent();
								parent17 = parent17.getParent();
			}			
			valueObject.setProcedureContext(voLookup17);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.resource.place.domain.objects.UserWorkQueue extractUserWorkQueue(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.UserWorkQueueVo valueObject) 
	{
		return 	extractUserWorkQueue(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.resource.place.domain.objects.UserWorkQueue extractUserWorkQueue(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.UserWorkQueueVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_UserWorkQueue();
		ims.core.resource.place.domain.objects.UserWorkQueue domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.resource.place.domain.objects.UserWorkQueue)domMap.get(valueObject);
			}
			// ims.core.vo.UserWorkQueueVo ID_UserWorkQueue field is unknown
			domainObject = new ims.core.resource.place.domain.objects.UserWorkQueue();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_UserWorkQueue());
			if (domMap.get(key) != null)
			{
				return (ims.core.resource.place.domain.objects.UserWorkQueue)domMap.get(key);
			}
			domainObject = (ims.core.resource.place.domain.objects.UserWorkQueue) domainFactory.getDomainObject(ims.core.resource.place.domain.objects.UserWorkQueue.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_UserWorkQueue());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.MemberOfStaff value1 = null;
		if ( null != valueObject.getTargetUser() ) 
		{
			if (valueObject.getTargetUser().getBoId() == null)
			{
				if (domMap.get(valueObject.getTargetUser()) != null)
				{
					value1 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getTargetUser());
				}
			}
			else
			{
				value1 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getTargetUser().getBoId());
			}
		}
		domainObject.setTargetUser(value1);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.MemberOfStaff value2 = null;
		if ( null != valueObject.getRequestedBy() ) 
		{
			if (valueObject.getRequestedBy().getBoId() == null)
			{
				if (domMap.get(valueObject.getRequestedBy()) != null)
				{
					value2 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getRequestedBy());
				}
			}
			else
			{
				value2 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getRequestedBy().getBoId());
			}
		}
		domainObject.setRequestedBy(value2);
		ims.framework.utils.DateTime dateTime3 = valueObject.getRequestDateTime();
		java.util.Date value3 = null;
		if ( dateTime3 != null ) 
		{
			value3 = dateTime3.getJavaDate();
		}
		domainObject.setRequestDateTime(value3);
		java.util.Date value4 = null;
		ims.framework.utils.Date date4 = valueObject.getRequiredOnDate();		
		if ( date4 != null ) 
		{
			value4 = date4.getDate();
		}
		domainObject.setRequiredOnDate(value4);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getCurrentStatus() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getCurrentStatus().getID());
		}
		domainObject.setCurrentStatus(value5);
		domainObject.setRequestingObjectID(valueObject.getRequestingObjectID());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDescription() != null && valueObject.getDescription().equals(""))
		{
			valueObject.setDescription(null);
		}
		domainObject.setDescription(valueObject.getDescription());
		domainObject.setTargetObjectID(valueObject.getTargetObjectID());
		domainObject.setRequestingForm(valueObject.getRequestingForm());
		domainObject.setTargetForm(valueObject.getTargetForm());
		domainObject.setRequestType(ims.core.vo.domain.ActivityVoAssembler.extractActivity(domainFactory, valueObject.getRequestType(), domMap));
		domainObject.setStatusHistory(ims.core.vo.domain.WorkQueueStatusHistoryVoAssembler.extractWorkQueueStatusSet(domainFactory, valueObject.getStatusHistory(), domainObject.getStatusHistory(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value13 = null;
		if ( null != valueObject.getOrigNoteType() ) 
		{
			value13 =
				domainFactory.getLookupInstance(valueObject.getOrigNoteType().getID());
		}
		domainObject.setOrigNoteType(value13);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getComments() != null && valueObject.getComments().equals(""))
		{
			valueObject.setComments(null);
		}
		domainObject.setComments(valueObject.getComments());
		ims.core.resource.place.domain.objects.LocationService value15 = null;
		if ( null != valueObject.getProcedureLocationService() ) 
		{
			if (valueObject.getProcedureLocationService().getBoId() == null)
			{
				if (domMap.get(valueObject.getProcedureLocationService()) != null)
				{
					value15 = (ims.core.resource.place.domain.objects.LocationService)domMap.get(valueObject.getProcedureLocationService());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value15 = domainObject.getProcedureLocationService();	
			}
			else
			{
				value15 = (ims.core.resource.place.domain.objects.LocationService)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.LocationService.class, valueObject.getProcedureLocationService().getBoId());
			}
		}
		domainObject.setProcedureLocationService(value15);
		ims.core.resource.place.domain.objects.Activity value16 = null;
		if ( null != valueObject.getProcedureActivity() ) 
		{
			if (valueObject.getProcedureActivity().getBoId() == null)
			{
				if (domMap.get(valueObject.getProcedureActivity()) != null)
				{
					value16 = (ims.core.resource.place.domain.objects.Activity)domMap.get(valueObject.getProcedureActivity());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value16 = domainObject.getProcedureActivity();	
			}
			else
			{
				value16 = (ims.core.resource.place.domain.objects.Activity)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Activity.class, valueObject.getProcedureActivity().getBoId());
			}
		}
		domainObject.setProcedureActivity(value16);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value17 = null;
		if ( null != valueObject.getProcedureContext() ) 
		{
			value17 =
				domainFactory.getLookupInstance(valueObject.getProcedureContext().getID());
		}
		domainObject.setProcedureContext(value17);

		return domainObject;
	}

}
