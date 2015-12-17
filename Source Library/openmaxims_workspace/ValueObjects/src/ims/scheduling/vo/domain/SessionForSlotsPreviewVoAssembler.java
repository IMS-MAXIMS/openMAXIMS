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
public class SessionForSlotsPreviewVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.scheduling.vo.SessionForSlotsPreviewVo copy(ims.scheduling.vo.SessionForSlotsPreviewVo valueObjectDest, ims.scheduling.vo.SessionForSlotsPreviewVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Sch_Session(valueObjectSrc.getID_Sch_Session());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Name
		valueObjectDest.setName(valueObjectSrc.getName());
		// isFixed
		valueObjectDest.setIsFixed(valueObjectSrc.getIsFixed());
		// SessionType
		valueObjectDest.setSessionType(valueObjectSrc.getSessionType());
		// SessionSlots
		valueObjectDest.setSessionSlots(valueObjectSrc.getSessionSlots());
		// TheatreSlots
		valueObjectDest.setTheatreSlots(valueObjectSrc.getTheatreSlots());
		// ParentChildSlots
		valueObjectDest.setParentChildSlots(valueObjectSrc.getParentChildSlots());
		// SlotType
		valueObjectDest.setSlotType(valueObjectSrc.getSlotType());
		// SessionActivities
		valueObjectDest.setSessionActivities(valueObjectSrc.getSessionActivities());
		// SessionDate
		valueObjectDest.setSessionDate(valueObjectSrc.getSessionDate());
		// TheatreProceduresRemaining
		valueObjectDest.setTheatreProceduresRemaining(valueObjectSrc.getTheatreProceduresRemaining());
		// SessionProfileType
		valueObjectDest.setSessionProfileType(valueObjectSrc.getSessionProfileType());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createSessionForSlotsPreviewVoCollectionFromSch_Session(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.Sch_Session objects.
	 */
	public static ims.scheduling.vo.SessionForSlotsPreviewVoCollection createSessionForSlotsPreviewVoCollectionFromSch_Session(java.util.Set domainObjectSet)	
	{
		return createSessionForSlotsPreviewVoCollectionFromSch_Session(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.Sch_Session objects.
	 */
	public static ims.scheduling.vo.SessionForSlotsPreviewVoCollection createSessionForSlotsPreviewVoCollectionFromSch_Session(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.scheduling.vo.SessionForSlotsPreviewVoCollection voList = new ims.scheduling.vo.SessionForSlotsPreviewVoCollection();
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
			ims.scheduling.vo.SessionForSlotsPreviewVo vo = create(map, domainObject);
			
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
	public static ims.scheduling.vo.SessionForSlotsPreviewVoCollection createSessionForSlotsPreviewVoCollectionFromSch_Session(java.util.List domainObjectList) 
	{
		return createSessionForSlotsPreviewVoCollectionFromSch_Session(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.scheduling.domain.objects.Sch_Session objects.
	 */
	public static ims.scheduling.vo.SessionForSlotsPreviewVoCollection createSessionForSlotsPreviewVoCollectionFromSch_Session(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.scheduling.vo.SessionForSlotsPreviewVoCollection voList = new ims.scheduling.vo.SessionForSlotsPreviewVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.scheduling.domain.objects.Sch_Session domainObject = (ims.scheduling.domain.objects.Sch_Session) domainObjectList.get(i);
			ims.scheduling.vo.SessionForSlotsPreviewVo vo = create(map, domainObject);

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
	 public static java.util.Set extractSch_SessionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionForSlotsPreviewVoCollection voCollection) 
	 {
	 	return extractSch_SessionSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractSch_SessionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionForSlotsPreviewVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.SessionForSlotsPreviewVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.Sch_Session domainObject = SessionForSlotsPreviewVoAssembler.extractSch_Session(domainFactory, vo, domMap);

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
	 public static java.util.List extractSch_SessionList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionForSlotsPreviewVoCollection voCollection) 
	 {
	 	return extractSch_SessionList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractSch_SessionList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionForSlotsPreviewVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.SessionForSlotsPreviewVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.Sch_Session domainObject = SessionForSlotsPreviewVoAssembler.extractSch_Session(domainFactory, vo, domMap);

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
	 public static ims.scheduling.vo.SessionForSlotsPreviewVo create(ims.scheduling.domain.objects.Sch_Session domainObject) 
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
	  public static ims.scheduling.vo.SessionForSlotsPreviewVo create(DomainObjectMap map, ims.scheduling.domain.objects.Sch_Session domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.scheduling.vo.SessionForSlotsPreviewVo valueObject = (ims.scheduling.vo.SessionForSlotsPreviewVo) map.getValueObject(domainObject, ims.scheduling.vo.SessionForSlotsPreviewVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.scheduling.vo.SessionForSlotsPreviewVo(domainObject.getId(), domainObject.getVersion());
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
	 public static ims.scheduling.vo.SessionForSlotsPreviewVo insert(ims.scheduling.vo.SessionForSlotsPreviewVo valueObject, ims.scheduling.domain.objects.Sch_Session domainObject) 
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
	 public static ims.scheduling.vo.SessionForSlotsPreviewVo insert(DomainObjectMap map, ims.scheduling.vo.SessionForSlotsPreviewVo valueObject, ims.scheduling.domain.objects.Sch_Session domainObject) 
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
		// isFixed
		valueObject.setIsFixed( domainObject.isIsFixed() );
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
				// SessionSlots
		valueObject.setSessionSlots(ims.scheduling.vo.domain.SessionSlotForPreviewVoAssembler.createSessionSlotForPreviewVoCollectionFromSession_Slot(map, domainObject.getSessionSlots()) );
		// TheatreSlots
		valueObject.setTheatreSlots(ims.scheduling.vo.domain.SessionTheatreTCISlotForPreviewVoAssembler.createSessionTheatreTCISlotForPreviewVoCollectionFromSessionTheatreTCISlot(map, domainObject.getTheatreSlots()) );
		// ParentChildSlots
		valueObject.setParentChildSlots(ims.scheduling.vo.domain.SessionParentChildSlotForPreviewVoAssembler.createSessionParentChildSlotForPreviewVoCollectionFromSessionParentChildSlot(map, domainObject.getParentChildSlots()) );
		// SlotType
		ims.domain.lookups.LookupInstance instance7 = domainObject.getSlotType();
		if ( null != instance7 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance7.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance7.getImage().getImageId(), instance7.getImage().getImagePath());
			}
			color = instance7.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.SlotType voLookup7 = new ims.scheduling.vo.lookups.SlotType(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.scheduling.vo.lookups.SlotType parentVoLookup7 = voLookup7;
			ims.domain.lookups.LookupInstance parent7 = instance7.getParent();
			while (parent7 != null)
			{
				if (parent7.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent7.getImage().getImageId(), parent7.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent7.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup7.setParent(new ims.scheduling.vo.lookups.SlotType(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setSlotType(voLookup7);
		}
				// SessionActivities
		valueObject.setSessionActivities(ims.scheduling.vo.domain.SessionActivityLiteVoAssembler.createSessionActivityLiteVoCollectionFromSessionActivity(map, domainObject.getSessionActivities()) );
		// SessionDate
		java.util.Date SessionDate = domainObject.getSessionDate();
		if ( null != SessionDate ) 
		{
			valueObject.setSessionDate(new ims.framework.utils.Date(SessionDate) );
		}
		// TheatreProceduresRemaining
		valueObject.setTheatreProceduresRemaining(ims.scheduling.vo.domain.SessionTheatreProceduresForSlotsPreviewVoAssembler.create(map, domainObject.getTheatreProceduresRemaining()) );
		// SessionProfileType
		ims.domain.lookups.LookupInstance instance11 = domainObject.getSessionProfileType();
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

			ims.scheduling.vo.lookups.SchProfileType voLookup11 = new ims.scheduling.vo.lookups.SchProfileType(instance11.getId(),instance11.getText(), instance11.isActive(), null, img, color);
			ims.scheduling.vo.lookups.SchProfileType parentVoLookup11 = voLookup11;
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
								parentVoLookup11.setParent(new ims.scheduling.vo.lookups.SchProfileType(parent11.getId(),parent11.getText(), parent11.isActive(), null, img, color));
				parentVoLookup11 = parentVoLookup11.getParent();
								parent11 = parent11.getParent();
			}			
			valueObject.setSessionProfileType(voLookup11);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.scheduling.domain.objects.Sch_Session extractSch_Session(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionForSlotsPreviewVo valueObject) 
	{
		return 	extractSch_Session(domainFactory, valueObject, new HashMap());
	}

	public static ims.scheduling.domain.objects.Sch_Session extractSch_Session(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionForSlotsPreviewVo valueObject, HashMap domMap) 
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
			// ims.scheduling.vo.SessionForSlotsPreviewVo ID_Sch_Session field is unknown
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
		domainObject.setIsFixed(valueObject.getIsFixed());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getSessionType() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getSessionType().getID());
		}
		domainObject.setSessionType(value3);

		// SaveAsRefVO treated as RefValueObject
		ims.scheduling.vo.Session_SlotRefVoCollection refCollection4 = new ims.scheduling.vo.Session_SlotRefVoCollection();
		if (valueObject.getSessionSlots() != null)
		{
			for (int i4=0; i4<valueObject.getSessionSlots().size(); i4++)
			{
				ims.scheduling.vo.Session_SlotRefVo ref4 = (ims.scheduling.vo.Session_SlotRefVo)valueObject.getSessionSlots().get(i4);
				refCollection4.add(ref4);
			}
		}
		int size4 = (null == refCollection4) ? 0 : refCollection4.size();		
		java.util.Set domainSessionSlots4 = domainObject.getSessionSlots();
		if (domainSessionSlots4 == null)
		{
			domainSessionSlots4 = new java.util.HashSet();
		}
		java.util.Set newSet4  = new java.util.HashSet();
		for(int i=0; i<size4; i++) 
		{
			ims.scheduling.vo.Session_SlotRefVo vo = refCollection4.get(i);					
			ims.scheduling.domain.objects.Session_Slot dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.scheduling.domain.objects.Session_Slot)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.scheduling.domain.objects.Session_Slot)domainFactory.getDomainObject( ims.scheduling.domain.objects.Session_Slot.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainSessionSlots4.contains(dom))
			{
				domainSessionSlots4.add(dom);
			}
			newSet4.add(dom);			
		}
		java.util.Set removedSet4 = new java.util.HashSet();
		java.util.Iterator iter4 = domainSessionSlots4.iterator();
		//Find out which objects need to be removed
		while (iter4.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter4.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet4.contains(o))
			{
				removedSet4.add(o);
			}
		}
		iter4 = removedSet4.iterator();
		//Remove the unwanted objects
		while (iter4.hasNext())
		{
			domainSessionSlots4.remove(iter4.next());
		}		
		
		domainObject.setSessionSlots(domainSessionSlots4);		

		// SaveAsRefVO treated as RefValueObject
		ims.scheduling.vo.SessionTheatreTCISlotRefVoCollection refCollection5 = new ims.scheduling.vo.SessionTheatreTCISlotRefVoCollection();
		if (valueObject.getTheatreSlots() != null)
		{
			for (int i5=0; i5<valueObject.getTheatreSlots().size(); i5++)
			{
				ims.scheduling.vo.SessionTheatreTCISlotRefVo ref5 = (ims.scheduling.vo.SessionTheatreTCISlotRefVo)valueObject.getTheatreSlots().get(i5);
				refCollection5.add(ref5);
			}
		}
		int size5 = (null == refCollection5) ? 0 : refCollection5.size();		
		java.util.Set domainTheatreSlots5 = domainObject.getTheatreSlots();
		if (domainTheatreSlots5 == null)
		{
			domainTheatreSlots5 = new java.util.HashSet();
		}
		java.util.Set newSet5  = new java.util.HashSet();
		for(int i=0; i<size5; i++) 
		{
			ims.scheduling.vo.SessionTheatreTCISlotRefVo vo = refCollection5.get(i);					
			ims.scheduling.domain.objects.SessionTheatreTCISlot dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.scheduling.domain.objects.SessionTheatreTCISlot)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.scheduling.domain.objects.SessionTheatreTCISlot)domainFactory.getDomainObject( ims.scheduling.domain.objects.SessionTheatreTCISlot.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainTheatreSlots5.contains(dom))
			{
				domainTheatreSlots5.add(dom);
			}
			newSet5.add(dom);			
		}
		java.util.Set removedSet5 = new java.util.HashSet();
		java.util.Iterator iter5 = domainTheatreSlots5.iterator();
		//Find out which objects need to be removed
		while (iter5.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter5.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet5.contains(o))
			{
				removedSet5.add(o);
			}
		}
		iter5 = removedSet5.iterator();
		//Remove the unwanted objects
		while (iter5.hasNext())
		{
			domainTheatreSlots5.remove(iter5.next());
		}		
		
		domainObject.setTheatreSlots(domainTheatreSlots5);		

		// SaveAsRefVO treated as RefValueObject
		ims.scheduling.vo.SessionParentChildSlotRefVoCollection refCollection6 = new ims.scheduling.vo.SessionParentChildSlotRefVoCollection();
		if (valueObject.getParentChildSlots() != null)
		{
			for (int i6=0; i6<valueObject.getParentChildSlots().size(); i6++)
			{
				ims.scheduling.vo.SessionParentChildSlotRefVo ref6 = (ims.scheduling.vo.SessionParentChildSlotRefVo)valueObject.getParentChildSlots().get(i6);
				refCollection6.add(ref6);
			}
		}
		int size6 = (null == refCollection6) ? 0 : refCollection6.size();		
		java.util.Set domainParentChildSlots6 = domainObject.getParentChildSlots();
		if (domainParentChildSlots6 == null)
		{
			domainParentChildSlots6 = new java.util.HashSet();
		}
		java.util.Set newSet6  = new java.util.HashSet();
		for(int i=0; i<size6; i++) 
		{
			ims.scheduling.vo.SessionParentChildSlotRefVo vo = refCollection6.get(i);					
			ims.scheduling.domain.objects.SessionParentChildSlot dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.scheduling.domain.objects.SessionParentChildSlot)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.scheduling.domain.objects.SessionParentChildSlot)domainFactory.getDomainObject( ims.scheduling.domain.objects.SessionParentChildSlot.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainParentChildSlots6.contains(dom))
			{
				domainParentChildSlots6.add(dom);
			}
			newSet6.add(dom);			
		}
		java.util.Set removedSet6 = new java.util.HashSet();
		java.util.Iterator iter6 = domainParentChildSlots6.iterator();
		//Find out which objects need to be removed
		while (iter6.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter6.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet6.contains(o))
			{
				removedSet6.add(o);
			}
		}
		iter6 = removedSet6.iterator();
		//Remove the unwanted objects
		while (iter6.hasNext())
		{
			domainParentChildSlots6.remove(iter6.next());
		}		
		
		domainObject.setParentChildSlots(domainParentChildSlots6);		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getSlotType() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getSlotType().getID());
		}
		domainObject.setSlotType(value7);

		// SaveAsRefVO treated as RefValueObject
		ims.scheduling.vo.SessionActivityRefVoCollection refCollection8 = new ims.scheduling.vo.SessionActivityRefVoCollection();
		if (valueObject.getSessionActivities() != null)
		{
			for (int i8=0; i8<valueObject.getSessionActivities().size(); i8++)
			{
				ims.scheduling.vo.SessionActivityRefVo ref8 = (ims.scheduling.vo.SessionActivityRefVo)valueObject.getSessionActivities().get(i8);
				refCollection8.add(ref8);
			}
		}
		int size8 = (null == refCollection8) ? 0 : refCollection8.size();		
		java.util.Set domainSessionActivities8 = domainObject.getSessionActivities();
		if (domainSessionActivities8 == null)
		{
			domainSessionActivities8 = new java.util.HashSet();
		}
		java.util.Set newSet8  = new java.util.HashSet();
		for(int i=0; i<size8; i++) 
		{
			ims.scheduling.vo.SessionActivityRefVo vo = refCollection8.get(i);					
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
			if (!domainSessionActivities8.contains(dom))
			{
				domainSessionActivities8.add(dom);
			}
			newSet8.add(dom);			
		}
		java.util.Set removedSet8 = new java.util.HashSet();
		java.util.Iterator iter8 = domainSessionActivities8.iterator();
		//Find out which objects need to be removed
		while (iter8.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter8.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet8.contains(o))
			{
				removedSet8.add(o);
			}
		}
		iter8 = removedSet8.iterator();
		//Remove the unwanted objects
		while (iter8.hasNext())
		{
			domainSessionActivities8.remove(iter8.next());
		}		
		
		domainObject.setSessionActivities(domainSessionActivities8);		
		java.util.Date value9 = null;
		ims.framework.utils.Date date9 = valueObject.getSessionDate();		
		if ( date9 != null ) 
		{
			value9 = date9.getDate();
		}
		domainObject.setSessionDate(value9);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.scheduling.domain.objects.SessionTheatreProceduresRemanining value10 = null;
		if ( null != valueObject.getTheatreProceduresRemaining() ) 
		{
			if (valueObject.getTheatreProceduresRemaining().getBoId() == null)
			{
				if (domMap.get(valueObject.getTheatreProceduresRemaining()) != null)
				{
					value10 = (ims.scheduling.domain.objects.SessionTheatreProceduresRemanining)domMap.get(valueObject.getTheatreProceduresRemaining());
				}
			}
			else
			{
				value10 = (ims.scheduling.domain.objects.SessionTheatreProceduresRemanining)domainFactory.getDomainObject(ims.scheduling.domain.objects.SessionTheatreProceduresRemanining.class, valueObject.getTheatreProceduresRemaining().getBoId());
			}
		}
		domainObject.setTheatreProceduresRemaining(value10);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value11 = null;
		if ( null != valueObject.getSessionProfileType() ) 
		{
			value11 =
				domainFactory.getLookupInstance(valueObject.getSessionProfileType().getID());
		}
		domainObject.setSessionProfileType(value11);

		return domainObject;
	}

}
