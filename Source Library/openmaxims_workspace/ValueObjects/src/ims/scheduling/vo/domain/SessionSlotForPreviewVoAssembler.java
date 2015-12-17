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
public class SessionSlotForPreviewVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.scheduling.vo.SessionSlotForPreviewVo copy(ims.scheduling.vo.SessionSlotForPreviewVo valueObjectDest, ims.scheduling.vo.SessionSlotForPreviewVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Session_Slot(valueObjectSrc.getID_Session_Slot());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Activity
		valueObjectDest.setActivity(valueObjectSrc.getActivity());
		// StartTm
		valueObjectDest.setStartTm(valueObjectSrc.getStartTm());
		// Duration
		valueObjectDest.setDuration(valueObjectSrc.getDuration());
		// Priority
		valueObjectDest.setPriority(valueObjectSrc.getPriority());
		// slotResp
		valueObjectDest.setSlotResp(valueObjectSrc.getSlotResp());
		// sessDateTime
		valueObjectDest.setSessDateTime(valueObjectSrc.getSessDateTime());
		// Functions
		valueObjectDest.setFunctions(valueObjectSrc.getFunctions());
		// DirectAccessSlot
		valueObjectDest.setDirectAccessSlot(valueObjectSrc.getDirectAccessSlot());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createSessionSlotForPreviewVoCollectionFromSession_Slot(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.Session_Slot objects.
	 */
	public static ims.scheduling.vo.SessionSlotForPreviewVoCollection createSessionSlotForPreviewVoCollectionFromSession_Slot(java.util.Set domainObjectSet)	
	{
		return createSessionSlotForPreviewVoCollectionFromSession_Slot(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.Session_Slot objects.
	 */
	public static ims.scheduling.vo.SessionSlotForPreviewVoCollection createSessionSlotForPreviewVoCollectionFromSession_Slot(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.scheduling.vo.SessionSlotForPreviewVoCollection voList = new ims.scheduling.vo.SessionSlotForPreviewVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.scheduling.domain.objects.Session_Slot domainObject = (ims.scheduling.domain.objects.Session_Slot) iterator.next();
			ims.scheduling.vo.SessionSlotForPreviewVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.scheduling.domain.objects.Session_Slot objects.
	 */
	public static ims.scheduling.vo.SessionSlotForPreviewVoCollection createSessionSlotForPreviewVoCollectionFromSession_Slot(java.util.List domainObjectList) 
	{
		return createSessionSlotForPreviewVoCollectionFromSession_Slot(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.scheduling.domain.objects.Session_Slot objects.
	 */
	public static ims.scheduling.vo.SessionSlotForPreviewVoCollection createSessionSlotForPreviewVoCollectionFromSession_Slot(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.scheduling.vo.SessionSlotForPreviewVoCollection voList = new ims.scheduling.vo.SessionSlotForPreviewVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.scheduling.domain.objects.Session_Slot domainObject = (ims.scheduling.domain.objects.Session_Slot) domainObjectList.get(i);
			ims.scheduling.vo.SessionSlotForPreviewVo vo = create(map, domainObject);

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
	 * Create the ims.scheduling.domain.objects.Session_Slot set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractSession_SlotSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionSlotForPreviewVoCollection voCollection) 
	 {
	 	return extractSession_SlotSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractSession_SlotSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionSlotForPreviewVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.SessionSlotForPreviewVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.Session_Slot domainObject = SessionSlotForPreviewVoAssembler.extractSession_Slot(domainFactory, vo, domMap);

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
	 * Create the ims.scheduling.domain.objects.Session_Slot list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractSession_SlotList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionSlotForPreviewVoCollection voCollection) 
	 {
	 	return extractSession_SlotList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractSession_SlotList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionSlotForPreviewVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.SessionSlotForPreviewVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.Session_Slot domainObject = SessionSlotForPreviewVoAssembler.extractSession_Slot(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.scheduling.domain.objects.Session_Slot object.
	 * @param domainObject ims.scheduling.domain.objects.Session_Slot
	 */
	 public static ims.scheduling.vo.SessionSlotForPreviewVo create(ims.scheduling.domain.objects.Session_Slot domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.scheduling.domain.objects.Session_Slot object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.scheduling.vo.SessionSlotForPreviewVo create(DomainObjectMap map, ims.scheduling.domain.objects.Session_Slot domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.scheduling.vo.SessionSlotForPreviewVo valueObject = (ims.scheduling.vo.SessionSlotForPreviewVo) map.getValueObject(domainObject, ims.scheduling.vo.SessionSlotForPreviewVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.scheduling.vo.SessionSlotForPreviewVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.scheduling.domain.objects.Session_Slot
	 */
	 public static ims.scheduling.vo.SessionSlotForPreviewVo insert(ims.scheduling.vo.SessionSlotForPreviewVo valueObject, ims.scheduling.domain.objects.Session_Slot domainObject) 
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
	 * @param domainObject ims.scheduling.domain.objects.Session_Slot
	 */
	 public static ims.scheduling.vo.SessionSlotForPreviewVo insert(DomainObjectMap map, ims.scheduling.vo.SessionSlotForPreviewVo valueObject, ims.scheduling.domain.objects.Session_Slot domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Session_Slot(domainObject.getId());
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
			
		// Activity
		valueObject.setActivity(ims.core.vo.domain.ActivityForSessionManagementVoAssembler.create(map, domainObject.getActivity()) );
		// StartTm
		String StartTm = domainObject.getStartTm();
		if ( null != StartTm ) 
		{
			valueObject.setStartTm(new ims.framework.utils.Time(StartTm) );
		}
		// Duration
		valueObject.setDuration(domainObject.getDuration());
		// Priority
		ims.domain.lookups.LookupInstance instance4 = domainObject.getPriority();
		if ( null != instance4 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance4.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance4.getImage().getImageId(), instance4.getImage().getImagePath());
			}
			color = instance4.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.SchedulingPriority voLookup4 = new ims.scheduling.vo.lookups.SchedulingPriority(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.scheduling.vo.lookups.SchedulingPriority parentVoLookup4 = voLookup4;
			ims.domain.lookups.LookupInstance parent4 = instance4.getParent();
			while (parent4 != null)
			{
				if (parent4.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent4.getImage().getImageId(), parent4.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent4.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup4.setParent(new ims.scheduling.vo.lookups.SchedulingPriority(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setPriority(voLookup4);
		}
				// slotResp
		valueObject.setSlotResp(ims.scheduling.vo.domain.SessionListOwnerLiteVoAssembler.create(map, domainObject.getSlotResp()) );
		// sessDateTime
		java.util.Date sessDateTime = domainObject.getSessDateTime();
		if ( null != sessDateTime ) 
		{
			valueObject.setSessDateTime(new ims.framework.utils.DateTime(sessDateTime) );
		}
		// Functions
		valueObject.setFunctions(ims.core.vo.domain.ServiceFunctionLiteVoAssembler.createServiceFunctionLiteVoCollectionFromServiceFunction(map, domainObject.getFunctions()) );
		// DirectAccessSlot
		ims.domain.lookups.LookupInstance instance8 = domainObject.getDirectAccessSlot();
		if ( null != instance8 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance8.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance8.getImage().getImageId(), instance8.getImage().getImagePath());
			}
			color = instance8.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.SchedCABSlotType voLookup8 = new ims.scheduling.vo.lookups.SchedCABSlotType(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.scheduling.vo.lookups.SchedCABSlotType parentVoLookup8 = voLookup8;
			ims.domain.lookups.LookupInstance parent8 = instance8.getParent();
			while (parent8 != null)
			{
				if (parent8.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent8.getImage().getImageId(), parent8.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent8.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup8.setParent(new ims.scheduling.vo.lookups.SchedCABSlotType(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setDirectAccessSlot(voLookup8);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.scheduling.domain.objects.Session_Slot extractSession_Slot(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionSlotForPreviewVo valueObject) 
	{
		return 	extractSession_Slot(domainFactory, valueObject, new HashMap());
	}

	public static ims.scheduling.domain.objects.Session_Slot extractSession_Slot(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionSlotForPreviewVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Session_Slot();
		ims.scheduling.domain.objects.Session_Slot domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.scheduling.domain.objects.Session_Slot)domMap.get(valueObject);
			}
			// ims.scheduling.vo.SessionSlotForPreviewVo ID_Session_Slot field is unknown
			domainObject = new ims.scheduling.domain.objects.Session_Slot();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Session_Slot());
			if (domMap.get(key) != null)
			{
				return (ims.scheduling.domain.objects.Session_Slot)domMap.get(key);
			}
			domainObject = (ims.scheduling.domain.objects.Session_Slot) domainFactory.getDomainObject(ims.scheduling.domain.objects.Session_Slot.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Session_Slot());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Activity value1 = null;
		if ( null != valueObject.getActivity() ) 
		{
			if (valueObject.getActivity().getBoId() == null)
			{
				if (domMap.get(valueObject.getActivity()) != null)
				{
					value1 = (ims.core.resource.place.domain.objects.Activity)domMap.get(valueObject.getActivity());
				}
			}
			else
			{
				value1 = (ims.core.resource.place.domain.objects.Activity)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Activity.class, valueObject.getActivity().getBoId());
			}
		}
		domainObject.setActivity(value1);
		ims.framework.utils.Time time2 = valueObject.getStartTm();
		String value2 = null;
		if ( time2 != null ) 
		{
			value2 = time2.toString();
		}
		domainObject.setStartTm(value2);
		domainObject.setDuration(valueObject.getDuration());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getPriority() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getPriority().getID());
		}
		domainObject.setPriority(value4);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.scheduling.domain.objects.Session_ListOwner value5 = null;
		if ( null != valueObject.getSlotResp() ) 
		{
			if (valueObject.getSlotResp().getBoId() == null)
			{
				if (domMap.get(valueObject.getSlotResp()) != null)
				{
					value5 = (ims.scheduling.domain.objects.Session_ListOwner)domMap.get(valueObject.getSlotResp());
				}
			}
			else
			{
				value5 = (ims.scheduling.domain.objects.Session_ListOwner)domainFactory.getDomainObject(ims.scheduling.domain.objects.Session_ListOwner.class, valueObject.getSlotResp().getBoId());
			}
		}
		domainObject.setSlotResp(value5);
		ims.framework.utils.DateTime dateTime6 = valueObject.getSessDateTime();
		java.util.Date value6 = null;
		if ( dateTime6 != null ) 
		{
			value6 = dateTime6.getJavaDate();
		}
		domainObject.setSessDateTime(value6);

		// SaveAsRefVO treated as RefValueObject
		ims.core.clinical.vo.ServiceFunctionRefVoCollection refCollection7 = new ims.core.clinical.vo.ServiceFunctionRefVoCollection();
		if (valueObject.getFunctions() != null)
		{
			for (int i7=0; i7<valueObject.getFunctions().size(); i7++)
			{
				ims.core.clinical.vo.ServiceFunctionRefVo ref7 = (ims.core.clinical.vo.ServiceFunctionRefVo)valueObject.getFunctions().get(i7);
				refCollection7.add(ref7);
			}
		}
		int size7 = (null == refCollection7) ? 0 : refCollection7.size();		
		java.util.Set domainFunctions7 = domainObject.getFunctions();
		if (domainFunctions7 == null)
		{
			domainFunctions7 = new java.util.HashSet();
		}
		java.util.Set newSet7  = new java.util.HashSet();
		for(int i=0; i<size7; i++) 
		{
			ims.core.clinical.vo.ServiceFunctionRefVo vo = refCollection7.get(i);					
			ims.core.clinical.domain.objects.ServiceFunction dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.clinical.domain.objects.ServiceFunction)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.clinical.domain.objects.ServiceFunction)domainFactory.getDomainObject( ims.core.clinical.domain.objects.ServiceFunction.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainFunctions7.contains(dom))
			{
				domainFunctions7.add(dom);
			}
			newSet7.add(dom);			
		}
		java.util.Set removedSet7 = new java.util.HashSet();
		java.util.Iterator iter7 = domainFunctions7.iterator();
		//Find out which objects need to be removed
		while (iter7.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter7.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet7.contains(o))
			{
				removedSet7.add(o);
			}
		}
		iter7 = removedSet7.iterator();
		//Remove the unwanted objects
		while (iter7.hasNext())
		{
			domainFunctions7.remove(iter7.next());
		}		
		
		domainObject.setFunctions(domainFunctions7);		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getDirectAccessSlot() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getDirectAccessSlot().getID());
		}
		domainObject.setDirectAccessSlot(value8);

		return domainObject;
	}

}
