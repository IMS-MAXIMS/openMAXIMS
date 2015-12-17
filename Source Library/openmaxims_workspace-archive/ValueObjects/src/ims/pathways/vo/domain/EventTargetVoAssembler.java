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
package ims.pathways.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Barbara Worwood
 */
public class EventTargetVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.pathways.vo.EventTargetVo copy(ims.pathways.vo.EventTargetVo valueObjectDest, ims.pathways.vo.EventTargetVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_EventTarget(valueObjectSrc.getID_EventTarget());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Target
		valueObjectDest.setTarget(valueObjectSrc.getTarget());
		// Event
		valueObjectDest.setEvent(valueObjectSrc.getEvent());
		// Status
		valueObjectDest.setStatus(valueObjectSrc.getStatus());
		// ActivateTargets
		valueObjectDest.setActivateTargets(valueObjectSrc.getActivateTargets());
		// SetJourneyTargetStatusTo
		valueObjectDest.setSetJourneyTargetStatusTo(valueObjectSrc.getSetJourneyTargetStatusTo());
		// SetToInScope
		valueObjectDest.setSetToInScope(valueObjectSrc.getSetToInScope());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createEventTargetVoCollectionFromEventTarget(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.pathways.configuration.domain.objects.EventTarget objects.
	 */
	public static ims.pathways.vo.EventTargetVoCollection createEventTargetVoCollectionFromEventTarget(java.util.Set domainObjectSet)	
	{
		return createEventTargetVoCollectionFromEventTarget(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.pathways.configuration.domain.objects.EventTarget objects.
	 */
	public static ims.pathways.vo.EventTargetVoCollection createEventTargetVoCollectionFromEventTarget(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.pathways.vo.EventTargetVoCollection voList = new ims.pathways.vo.EventTargetVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.pathways.configuration.domain.objects.EventTarget domainObject = (ims.pathways.configuration.domain.objects.EventTarget) iterator.next();
			ims.pathways.vo.EventTargetVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.pathways.configuration.domain.objects.EventTarget objects.
	 */
	public static ims.pathways.vo.EventTargetVoCollection createEventTargetVoCollectionFromEventTarget(java.util.List domainObjectList) 
	{
		return createEventTargetVoCollectionFromEventTarget(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.pathways.configuration.domain.objects.EventTarget objects.
	 */
	public static ims.pathways.vo.EventTargetVoCollection createEventTargetVoCollectionFromEventTarget(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.pathways.vo.EventTargetVoCollection voList = new ims.pathways.vo.EventTargetVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.pathways.configuration.domain.objects.EventTarget domainObject = (ims.pathways.configuration.domain.objects.EventTarget) domainObjectList.get(i);
			ims.pathways.vo.EventTargetVo vo = create(map, domainObject);

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
	 * Create the ims.pathways.configuration.domain.objects.EventTarget set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractEventTargetSet(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.EventTargetVoCollection voCollection) 
	 {
	 	return extractEventTargetSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractEventTargetSet(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.EventTargetVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.pathways.vo.EventTargetVo vo = voCollection.get(i);
			ims.pathways.configuration.domain.objects.EventTarget domainObject = EventTargetVoAssembler.extractEventTarget(domainFactory, vo, domMap);

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
	 * Create the ims.pathways.configuration.domain.objects.EventTarget list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractEventTargetList(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.EventTargetVoCollection voCollection) 
	 {
	 	return extractEventTargetList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractEventTargetList(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.EventTargetVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.pathways.vo.EventTargetVo vo = voCollection.get(i);
			ims.pathways.configuration.domain.objects.EventTarget domainObject = EventTargetVoAssembler.extractEventTarget(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.pathways.configuration.domain.objects.EventTarget object.
	 * @param domainObject ims.pathways.configuration.domain.objects.EventTarget
	 */
	 public static ims.pathways.vo.EventTargetVo create(ims.pathways.configuration.domain.objects.EventTarget domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.pathways.configuration.domain.objects.EventTarget object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.pathways.vo.EventTargetVo create(DomainObjectMap map, ims.pathways.configuration.domain.objects.EventTarget domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.pathways.vo.EventTargetVo valueObject = (ims.pathways.vo.EventTargetVo) map.getValueObject(domainObject, ims.pathways.vo.EventTargetVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.pathways.vo.EventTargetVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.pathways.configuration.domain.objects.EventTarget
	 */
	 public static ims.pathways.vo.EventTargetVo insert(ims.pathways.vo.EventTargetVo valueObject, ims.pathways.configuration.domain.objects.EventTarget domainObject) 
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
	 * @param domainObject ims.pathways.configuration.domain.objects.EventTarget
	 */
	 public static ims.pathways.vo.EventTargetVo insert(DomainObjectMap map, ims.pathways.vo.EventTargetVo valueObject, ims.pathways.configuration.domain.objects.EventTarget domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_EventTarget(domainObject.getId());
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
			
		// Target
		valueObject.setTarget(ims.pathways.vo.domain.TargetShortVoAssembler.create(map, domainObject.getTarget()) );
		// Event
		if (domainObject.getEvent() != null)
		{
			if(domainObject.getEvent() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getEvent();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setEvent(new ims.pathways.configuration.vo.EventRefVo(id, -1));				
			}
			else
			{
				valueObject.setEvent(new ims.pathways.configuration.vo.EventRefVo(domainObject.getEvent().getId(), domainObject.getEvent().getVersion()));
			}
		}
		// Status
		ims.domain.lookups.LookupInstance instance3 = domainObject.getStatus();
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

			ims.core.vo.lookups.PreActiveActiveInactiveStatus voLookup3 = new ims.core.vo.lookups.PreActiveActiveInactiveStatus(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.PreActiveActiveInactiveStatus parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.core.vo.lookups.PreActiveActiveInactiveStatus(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setStatus(voLookup3);
		}
				// ActivateTargets
		ims.pathways.configuration.vo.TargetRefVoCollection ActivateTargets = new ims.pathways.configuration.vo.TargetRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getActivateTargets().iterator(); iterator.hasNext(); ) 
		{
			ims.pathways.configuration.domain.objects.Target tmp = (ims.pathways.configuration.domain.objects.Target)iterator.next();
			if (tmp != null)
				ActivateTargets.add(new ims.pathways.configuration.vo.TargetRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setActivateTargets(ActivateTargets);
		// SetJourneyTargetStatusTo
		ims.domain.lookups.LookupInstance instance5 = domainObject.getSetJourneyTargetStatusTo();
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

			ims.pathways.vo.lookups.PatientTargetStatus voLookup5 = new ims.pathways.vo.lookups.PatientTargetStatus(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.pathways.vo.lookups.PatientTargetStatus parentVoLookup5 = voLookup5;
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
								parentVoLookup5.setParent(new ims.pathways.vo.lookups.PatientTargetStatus(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setSetJourneyTargetStatusTo(voLookup5);
		}
				// SetToInScope
		valueObject.setSetToInScope( domainObject.isSetToInScope() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.pathways.configuration.domain.objects.EventTarget extractEventTarget(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.EventTargetVo valueObject) 
	{
		return 	extractEventTarget(domainFactory, valueObject, new HashMap());
	}

	public static ims.pathways.configuration.domain.objects.EventTarget extractEventTarget(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.EventTargetVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_EventTarget();
		ims.pathways.configuration.domain.objects.EventTarget domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.pathways.configuration.domain.objects.EventTarget)domMap.get(valueObject);
			}
			// ims.pathways.vo.EventTargetVo ID_EventTarget field is unknown
			domainObject = new ims.pathways.configuration.domain.objects.EventTarget();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_EventTarget());
			if (domMap.get(key) != null)
			{
				return (ims.pathways.configuration.domain.objects.EventTarget)domMap.get(key);
			}
			domainObject = (ims.pathways.configuration.domain.objects.EventTarget) domainFactory.getDomainObject(ims.pathways.configuration.domain.objects.EventTarget.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_EventTarget());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.pathways.configuration.domain.objects.Target value1 = null;
		if ( null != valueObject.getTarget() ) 
		{
			if (valueObject.getTarget().getBoId() == null)
			{
				if (domMap.get(valueObject.getTarget()) != null)
				{
					value1 = (ims.pathways.configuration.domain.objects.Target)domMap.get(valueObject.getTarget());
				}
			}
			else
			{
				value1 = (ims.pathways.configuration.domain.objects.Target)domainFactory.getDomainObject(ims.pathways.configuration.domain.objects.Target.class, valueObject.getTarget().getBoId());
			}
		}
		domainObject.setTarget(value1);
		ims.pathways.configuration.domain.objects.Event value2 = null;
		if ( null != valueObject.getEvent() ) 
		{
			if (valueObject.getEvent().getBoId() == null)
			{
				if (domMap.get(valueObject.getEvent()) != null)
				{
					value2 = (ims.pathways.configuration.domain.objects.Event)domMap.get(valueObject.getEvent());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getEvent();	
			}
			else
			{
				value2 = (ims.pathways.configuration.domain.objects.Event)domainFactory.getDomainObject(ims.pathways.configuration.domain.objects.Event.class, valueObject.getEvent().getBoId());
			}
		}
		domainObject.setEvent(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getStatus() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getStatus().getID());
		}
		domainObject.setStatus(value3);

		ims.pathways.configuration.vo.TargetRefVoCollection refCollection4 = valueObject.getActivateTargets();
		int size4 = (null == refCollection4) ? 0 : refCollection4.size();		
		java.util.Set domainActivateTargets4 = domainObject.getActivateTargets();
		if (domainActivateTargets4 == null)
		{
			domainActivateTargets4 = new java.util.HashSet();
		}
		java.util.Set newSet4  = new java.util.HashSet();
		for(int i=0; i<size4; i++) 
		{
			ims.pathways.configuration.vo.TargetRefVo vo = refCollection4.get(i);					
			ims.pathways.configuration.domain.objects.Target dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.pathways.configuration.domain.objects.Target)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.pathways.configuration.domain.objects.Target)domainFactory.getDomainObject( ims.pathways.configuration.domain.objects.Target.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainActivateTargets4.contains(dom))
			{
				domainActivateTargets4.add(dom);
			}
			newSet4.add(dom);			
		}
		java.util.Set removedSet4 = new java.util.HashSet();
		java.util.Iterator iter4 = domainActivateTargets4.iterator();
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
			domainActivateTargets4.remove(iter4.next());
		}		
		
		domainObject.setActivateTargets(domainActivateTargets4);		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getSetJourneyTargetStatusTo() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getSetJourneyTargetStatusTo().getID());
		}
		domainObject.setSetJourneyTargetStatusTo(value5);
		domainObject.setSetToInScope(valueObject.getSetToInScope());

		return domainObject;
	}

}
