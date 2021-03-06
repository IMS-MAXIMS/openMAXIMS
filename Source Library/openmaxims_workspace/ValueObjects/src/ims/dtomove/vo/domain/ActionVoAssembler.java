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
 * Generated on 12/10/2015, 13:24
 *
 */
package ims.dtomove.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Barbara Worwood
 */
public class ActionVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.dtomove.vo.ActionVo copy(ims.dtomove.vo.ActionVo valueObjectDest, ims.dtomove.vo.ActionVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Action(valueObjectSrc.getID_Action());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// name
		valueObjectDest.setName(valueObjectSrc.getName());
		// description
		valueObjectDest.setDescription(valueObjectSrc.getDescription());
		// timeRequired
		valueObjectDest.setTimeRequired(valueObjectSrc.getTimeRequired());
		// intervalRequired
		valueObjectDest.setIntervalRequired(valueObjectSrc.getIntervalRequired());
		// patReq
		valueObjectDest.setPatReq(valueObjectSrc.getPatReq());
		// schedFlag
		valueObjectDest.setSchedFlag(valueObjectSrc.getSchedFlag());
		// active
		valueObjectDest.setActive(valueObjectSrc.getActive());
		// activityAction
		valueObjectDest.setActivityAction(valueObjectSrc.getActivityAction());
		// actionHrg
		valueObjectDest.setActionHrg(valueObjectSrc.getActionHrg());
		// actionReason
		valueObjectDest.setActionReason(valueObjectSrc.getActionReason());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createActionVoCollectionFromAction(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.dto_move.domain.objects.Action objects.
	 */
	public static ims.dtomove.vo.ActionVoCollection createActionVoCollectionFromAction(java.util.Set domainObjectSet)	
	{
		return createActionVoCollectionFromAction(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.dto_move.domain.objects.Action objects.
	 */
	public static ims.dtomove.vo.ActionVoCollection createActionVoCollectionFromAction(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.dtomove.vo.ActionVoCollection voList = new ims.dtomove.vo.ActionVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.dto_move.domain.objects.Action domainObject = (ims.dto_move.domain.objects.Action) iterator.next();
			ims.dtomove.vo.ActionVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.dto_move.domain.objects.Action objects.
	 */
	public static ims.dtomove.vo.ActionVoCollection createActionVoCollectionFromAction(java.util.List domainObjectList) 
	{
		return createActionVoCollectionFromAction(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.dto_move.domain.objects.Action objects.
	 */
	public static ims.dtomove.vo.ActionVoCollection createActionVoCollectionFromAction(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.dtomove.vo.ActionVoCollection voList = new ims.dtomove.vo.ActionVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.dto_move.domain.objects.Action domainObject = (ims.dto_move.domain.objects.Action) domainObjectList.get(i);
			ims.dtomove.vo.ActionVo vo = create(map, domainObject);

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
	 * Create the ims.dto_move.domain.objects.Action set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractActionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.dtomove.vo.ActionVoCollection voCollection) 
	 {
	 	return extractActionSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractActionSet(ims.domain.ILightweightDomainFactory domainFactory, ims.dtomove.vo.ActionVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.dtomove.vo.ActionVo vo = voCollection.get(i);
			ims.dto_move.domain.objects.Action domainObject = ActionVoAssembler.extractAction(domainFactory, vo, domMap);

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
	 * Create the ims.dto_move.domain.objects.Action list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractActionList(ims.domain.ILightweightDomainFactory domainFactory, ims.dtomove.vo.ActionVoCollection voCollection) 
	 {
	 	return extractActionList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractActionList(ims.domain.ILightweightDomainFactory domainFactory, ims.dtomove.vo.ActionVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.dtomove.vo.ActionVo vo = voCollection.get(i);
			ims.dto_move.domain.objects.Action domainObject = ActionVoAssembler.extractAction(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.dto_move.domain.objects.Action object.
	 * @param domainObject ims.dto_move.domain.objects.Action
	 */
	 public static ims.dtomove.vo.ActionVo create(ims.dto_move.domain.objects.Action domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.dto_move.domain.objects.Action object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.dtomove.vo.ActionVo create(DomainObjectMap map, ims.dto_move.domain.objects.Action domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.dtomove.vo.ActionVo valueObject = (ims.dtomove.vo.ActionVo) map.getValueObject(domainObject, ims.dtomove.vo.ActionVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.dtomove.vo.ActionVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.dto_move.domain.objects.Action
	 */
	 public static ims.dtomove.vo.ActionVo insert(ims.dtomove.vo.ActionVo valueObject, ims.dto_move.domain.objects.Action domainObject) 
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
	 * @param domainObject ims.dto_move.domain.objects.Action
	 */
	 public static ims.dtomove.vo.ActionVo insert(DomainObjectMap map, ims.dtomove.vo.ActionVo valueObject, ims.dto_move.domain.objects.Action domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Action(domainObject.getId());
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
			
		// name
		valueObject.setName(domainObject.getName());
		// description
		valueObject.setDescription(domainObject.getDescription());
		// timeRequired
		valueObject.setTimeRequired(domainObject.getTimeRequired());
		// intervalRequired
		valueObject.setIntervalRequired(domainObject.getIntervalRequired());
		// patReq
		valueObject.setPatReq(domainObject.getPatReq());
		// schedFlag
		valueObject.setSchedFlag(domainObject.getSchedFlag());
		// active
		valueObject.setActive(domainObject.getActive());
		// activityAction
		valueObject.setActivityAction(ims.dtomove.vo.domain.ActivityActionVoAssembler.createActivityActionVoCollectionFromActivityAction(map, domainObject.getActivityAction()) );
		// actionHrg
		valueObject.setActionHrg(ims.dtomove.vo.domain.ActionHRGVoAssembler.createActionHRGVoCollectionFromActionHRG(map, domainObject.getActionHrg()) );
		// actionReason
		valueObject.setActionReason(domainObject.getActionReason());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.dto_move.domain.objects.Action extractAction(ims.domain.ILightweightDomainFactory domainFactory, ims.dtomove.vo.ActionVo valueObject) 
	{
		return 	extractAction(domainFactory, valueObject, new HashMap());
	}

	public static ims.dto_move.domain.objects.Action extractAction(ims.domain.ILightweightDomainFactory domainFactory, ims.dtomove.vo.ActionVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Action();
		ims.dto_move.domain.objects.Action domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.dto_move.domain.objects.Action)domMap.get(valueObject);
			}
			// ims.dtomove.vo.ActionVo ID_Action field is unknown
			domainObject = new ims.dto_move.domain.objects.Action();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Action());
			if (domMap.get(key) != null)
			{
				return (ims.dto_move.domain.objects.Action)domMap.get(key);
			}
			domainObject = (ims.dto_move.domain.objects.Action) domainFactory.getDomainObject(ims.dto_move.domain.objects.Action.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Action());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getName() != null && valueObject.getName().equals(""))
		{
			valueObject.setName(null);
		}
		domainObject.setName(valueObject.getName());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDescription() != null && valueObject.getDescription().equals(""))
		{
			valueObject.setDescription(null);
		}
		domainObject.setDescription(valueObject.getDescription());
		domainObject.setTimeRequired(valueObject.getTimeRequired());
		domainObject.setIntervalRequired(valueObject.getIntervalRequired());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getPatReq() != null && valueObject.getPatReq().equals(""))
		{
			valueObject.setPatReq(null);
		}
		domainObject.setPatReq(valueObject.getPatReq());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSchedFlag() != null && valueObject.getSchedFlag().equals(""))
		{
			valueObject.setSchedFlag(null);
		}
		domainObject.setSchedFlag(valueObject.getSchedFlag());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getActive() != null && valueObject.getActive().equals(""))
		{
			valueObject.setActive(null);
		}
		domainObject.setActive(valueObject.getActive());

		// SaveAsRefVO treated as RefValueObject
		ims.dto_move.vo.ActivityActionRefVoCollection refCollection8 = new ims.dto_move.vo.ActivityActionRefVoCollection();
		if (valueObject.getActivityAction() != null)
		{
			for (int i8=0; i8<valueObject.getActivityAction().size(); i8++)
			{
				ims.dto_move.vo.ActivityActionRefVo ref8 = (ims.dto_move.vo.ActivityActionRefVo)valueObject.getActivityAction().get(i8);
				refCollection8.add(ref8);
			}
		}
		int size8 = (null == refCollection8) ? 0 : refCollection8.size();		
		java.util.Set domainActivityAction8 = domainObject.getActivityAction();
		if (domainActivityAction8 == null)
		{
			domainActivityAction8 = new java.util.HashSet();
		}
		java.util.Set newSet8  = new java.util.HashSet();
		for(int i=0; i<size8; i++) 
		{
			ims.dto_move.vo.ActivityActionRefVo vo = refCollection8.get(i);					
			ims.dto_move.domain.objects.ActivityAction dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.dto_move.domain.objects.ActivityAction)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.dto_move.domain.objects.ActivityAction)domainFactory.getDomainObject( ims.dto_move.domain.objects.ActivityAction.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainActivityAction8.contains(dom))
			{
				domainActivityAction8.add(dom);
			}
			newSet8.add(dom);			
		}
		java.util.Set removedSet8 = new java.util.HashSet();
		java.util.Iterator iter8 = domainActivityAction8.iterator();
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
			domainActivityAction8.remove(iter8.next());
		}		
		
		domainObject.setActivityAction(domainActivityAction8);		

		// SaveAsRefVO treated as RefValueObject
		ims.dto_move.vo.ActionHRGRefVoCollection refCollection9 = new ims.dto_move.vo.ActionHRGRefVoCollection();
		if (valueObject.getActionHrg() != null)
		{
			for (int i9=0; i9<valueObject.getActionHrg().size(); i9++)
			{
				ims.dto_move.vo.ActionHRGRefVo ref9 = (ims.dto_move.vo.ActionHRGRefVo)valueObject.getActionHrg().get(i9);
				refCollection9.add(ref9);
			}
		}
		int size9 = (null == refCollection9) ? 0 : refCollection9.size();		
		java.util.List domainActionHrg9 = domainObject.getActionHrg();
		if (domainActionHrg9 == null)
		{
			domainActionHrg9 = new java.util.ArrayList();
		}
		for(int i=0; i < size9; i++) 
		{
			ims.dto_move.vo.ActionHRGRefVo vo = refCollection9.get(i);			
			ims.dto_move.domain.objects.ActionHRG dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.dto_move.domain.objects.ActionHRG)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.dto_move.domain.objects.ActionHRG)domainFactory.getDomainObject( ims.dto_move.domain.objects.ActionHRG.class, vo.getBoId());
				}
			}

			int domIdx = domainActionHrg9.indexOf(dom);
			if (domIdx == -1)
			{
				domainActionHrg9.add(i, dom);
			}
			else if (i != domIdx && i < domainActionHrg9.size())
			{
				Object tmp = domainActionHrg9.get(i);
				domainActionHrg9.set(i, domainActionHrg9.get(domIdx));
				domainActionHrg9.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i9 = domainActionHrg9.size();
		while (i9 > size9)
		{
			domainActionHrg9.remove(i9-1);
			i9 = domainActionHrg9.size();
		}
		
		domainObject.setActionHrg(domainActionHrg9);		
		domainObject.setActionReason(valueObject.getActionReason());

		return domainObject;
	}

}
