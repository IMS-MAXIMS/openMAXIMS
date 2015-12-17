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
 * Generated on 12/10/2015, 13:23
 *
 */
package ims.pathways.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Barbara Worwood
 */
public class PathwayClockVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.pathways.vo.PathwayClockVo copy(ims.pathways.vo.PathwayClockVo valueObjectDest, ims.pathways.vo.PathwayClockVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PathwayClock(valueObjectSrc.getID_PathwayClock());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// PauseDetails
		valueObjectDest.setPauseDetails(valueObjectSrc.getPauseDetails());
		// CurrentRTTStatus
		valueObjectDest.setCurrentRTTStatus(valueObjectSrc.getCurrentRTTStatus());
		// RTTStatusHistory
		valueObjectDest.setRTTStatusHistory(valueObjectSrc.getRTTStatusHistory());
		// CurrentPause
		valueObjectDest.setCurrentPause(valueObjectSrc.getCurrentPause());
		// ExtClockId
		valueObjectDest.setExtClockId(valueObjectSrc.getExtClockId());
		// ExtClockName
		valueObjectDest.setExtClockName(valueObjectSrc.getExtClockName());
		// StartDate
		valueObjectDest.setStartDate(valueObjectSrc.getStartDate());
		// StopDate
		valueObjectDest.setStopDate(valueObjectSrc.getStopDate());
		// TargetClockEnd
		valueObjectDest.setTargetClockEnd(valueObjectSrc.getTargetClockEnd());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPathwayClockVoCollectionFromPathwayClock(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.pathways.domain.objects.PathwayClock objects.
	 */
	public static ims.pathways.vo.PathwayClockVoCollection createPathwayClockVoCollectionFromPathwayClock(java.util.Set domainObjectSet)	
	{
		return createPathwayClockVoCollectionFromPathwayClock(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.pathways.domain.objects.PathwayClock objects.
	 */
	public static ims.pathways.vo.PathwayClockVoCollection createPathwayClockVoCollectionFromPathwayClock(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.pathways.vo.PathwayClockVoCollection voList = new ims.pathways.vo.PathwayClockVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.pathways.domain.objects.PathwayClock domainObject = (ims.pathways.domain.objects.PathwayClock) iterator.next();
			ims.pathways.vo.PathwayClockVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.pathways.domain.objects.PathwayClock objects.
	 */
	public static ims.pathways.vo.PathwayClockVoCollection createPathwayClockVoCollectionFromPathwayClock(java.util.List domainObjectList) 
	{
		return createPathwayClockVoCollectionFromPathwayClock(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.pathways.domain.objects.PathwayClock objects.
	 */
	public static ims.pathways.vo.PathwayClockVoCollection createPathwayClockVoCollectionFromPathwayClock(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.pathways.vo.PathwayClockVoCollection voList = new ims.pathways.vo.PathwayClockVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.pathways.domain.objects.PathwayClock domainObject = (ims.pathways.domain.objects.PathwayClock) domainObjectList.get(i);
			ims.pathways.vo.PathwayClockVo vo = create(map, domainObject);

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
	 * Create the ims.pathways.domain.objects.PathwayClock set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPathwayClockSet(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.PathwayClockVoCollection voCollection) 
	 {
	 	return extractPathwayClockSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPathwayClockSet(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.PathwayClockVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.pathways.vo.PathwayClockVo vo = voCollection.get(i);
			ims.pathways.domain.objects.PathwayClock domainObject = PathwayClockVoAssembler.extractPathwayClock(domainFactory, vo, domMap);

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
	 * Create the ims.pathways.domain.objects.PathwayClock list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPathwayClockList(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.PathwayClockVoCollection voCollection) 
	 {
	 	return extractPathwayClockList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPathwayClockList(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.PathwayClockVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.pathways.vo.PathwayClockVo vo = voCollection.get(i);
			ims.pathways.domain.objects.PathwayClock domainObject = PathwayClockVoAssembler.extractPathwayClock(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.pathways.domain.objects.PathwayClock object.
	 * @param domainObject ims.pathways.domain.objects.PathwayClock
	 */
	 public static ims.pathways.vo.PathwayClockVo create(ims.pathways.domain.objects.PathwayClock domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.pathways.domain.objects.PathwayClock object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.pathways.vo.PathwayClockVo create(DomainObjectMap map, ims.pathways.domain.objects.PathwayClock domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.pathways.vo.PathwayClockVo valueObject = (ims.pathways.vo.PathwayClockVo) map.getValueObject(domainObject, ims.pathways.vo.PathwayClockVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.pathways.vo.PathwayClockVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.pathways.domain.objects.PathwayClock
	 */
	 public static ims.pathways.vo.PathwayClockVo insert(ims.pathways.vo.PathwayClockVo valueObject, ims.pathways.domain.objects.PathwayClock domainObject) 
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
	 * @param domainObject ims.pathways.domain.objects.PathwayClock
	 */
	 public static ims.pathways.vo.PathwayClockVo insert(DomainObjectMap map, ims.pathways.vo.PathwayClockVo valueObject, ims.pathways.domain.objects.PathwayClock domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PathwayClock(domainObject.getId());
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
			
		// PauseDetails
		valueObject.setPauseDetails(ims.pathways.vo.domain.PauseDetailsVoAssembler.createPauseDetailsVoCollectionFromPauseDetails(map, domainObject.getPauseDetails()) );
		// CurrentRTTStatus
		valueObject.setCurrentRTTStatus(ims.pathways.vo.domain.PathwayRTTStatusVoAssembler.create(map, domainObject.getCurrentRTTStatus()) );
		// RTTStatusHistory
		ims.pathways.vo.PathwayRTTStatusRefVoCollection RTTStatusHistory = new ims.pathways.vo.PathwayRTTStatusRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getRTTStatusHistory().iterator(); iterator.hasNext(); ) 
		{
			ims.pathways.domain.objects.PathwayRTTStatus tmp = (ims.pathways.domain.objects.PathwayRTTStatus)iterator.next();
			if (tmp != null)
				RTTStatusHistory.add(new ims.pathways.vo.PathwayRTTStatusRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setRTTStatusHistory(RTTStatusHistory);
		// CurrentPause
		valueObject.setCurrentPause(ims.pathways.vo.domain.PauseDetailsVoAssembler.create(map, domainObject.getCurrentPause()) );
		// ExtClockId
		valueObject.setExtClockId(domainObject.getExtClockId());
		// ExtClockName
		valueObject.setExtClockName(domainObject.getExtClockName());
		// StartDate
		java.util.Date StartDate = domainObject.getStartDate();
		if ( null != StartDate ) 
		{
			valueObject.setStartDate(new ims.framework.utils.Date(StartDate) );
		}
		// StopDate
		java.util.Date StopDate = domainObject.getStopDate();
		if ( null != StopDate ) 
		{
			valueObject.setStopDate(new ims.framework.utils.Date(StopDate) );
		}
		// TargetClockEnd
		java.util.Date TargetClockEnd = domainObject.getTargetClockEnd();
		if ( null != TargetClockEnd ) 
		{
			valueObject.setTargetClockEnd(new ims.framework.utils.Date(TargetClockEnd) );
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.pathways.domain.objects.PathwayClock extractPathwayClock(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.PathwayClockVo valueObject) 
	{
		return 	extractPathwayClock(domainFactory, valueObject, new HashMap());
	}

	public static ims.pathways.domain.objects.PathwayClock extractPathwayClock(ims.domain.ILightweightDomainFactory domainFactory, ims.pathways.vo.PathwayClockVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PathwayClock();
		ims.pathways.domain.objects.PathwayClock domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.pathways.domain.objects.PathwayClock)domMap.get(valueObject);
			}
			// ims.pathways.vo.PathwayClockVo ID_PathwayClock field is unknown
			domainObject = new ims.pathways.domain.objects.PathwayClock();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PathwayClock());
			if (domMap.get(key) != null)
			{
				return (ims.pathways.domain.objects.PathwayClock)domMap.get(key);
			}
			domainObject = (ims.pathways.domain.objects.PathwayClock) domainFactory.getDomainObject(ims.pathways.domain.objects.PathwayClock.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PathwayClock());

		domainObject.setPauseDetails(ims.pathways.vo.domain.PauseDetailsVoAssembler.extractPauseDetailsList(domainFactory, valueObject.getPauseDetails(), domainObject.getPauseDetails(), domMap));		
		domainObject.setCurrentRTTStatus(ims.pathways.vo.domain.PathwayRTTStatusVoAssembler.extractPathwayRTTStatus(domainFactory, valueObject.getCurrentRTTStatus(), domMap));

		ims.pathways.vo.PathwayRTTStatusRefVoCollection refCollection3 = valueObject.getRTTStatusHistory();
		int size3 = (null == refCollection3) ? 0 : refCollection3.size();		
		java.util.List domainRTTStatusHistory3 = domainObject.getRTTStatusHistory();
		if (domainRTTStatusHistory3 == null)
		{
			domainRTTStatusHistory3 = new java.util.ArrayList();
		}
		for(int i=0; i < size3; i++) 
		{
			ims.pathways.vo.PathwayRTTStatusRefVo vo = refCollection3.get(i);			
			ims.pathways.domain.objects.PathwayRTTStatus dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.pathways.domain.objects.PathwayRTTStatus)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.pathways.domain.objects.PathwayRTTStatus)domainFactory.getDomainObject( ims.pathways.domain.objects.PathwayRTTStatus.class, vo.getBoId());
				}
			}

			int domIdx = domainRTTStatusHistory3.indexOf(dom);
			if (domIdx == -1)
			{
				domainRTTStatusHistory3.add(i, dom);
			}
			else if (i != domIdx && i < domainRTTStatusHistory3.size())
			{
				Object tmp = domainRTTStatusHistory3.get(i);
				domainRTTStatusHistory3.set(i, domainRTTStatusHistory3.get(domIdx));
				domainRTTStatusHistory3.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i3 = domainRTTStatusHistory3.size();
		while (i3 > size3)
		{
			domainRTTStatusHistory3.remove(i3-1);
			i3 = domainRTTStatusHistory3.size();
		}
		
		domainObject.setRTTStatusHistory(domainRTTStatusHistory3);		
		domainObject.setCurrentPause(ims.pathways.vo.domain.PauseDetailsVoAssembler.extractPauseDetails(domainFactory, valueObject.getCurrentPause(), domMap));
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getExtClockId() != null && valueObject.getExtClockId().equals(""))
		{
			valueObject.setExtClockId(null);
		}
		domainObject.setExtClockId(valueObject.getExtClockId());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getExtClockName() != null && valueObject.getExtClockName().equals(""))
		{
			valueObject.setExtClockName(null);
		}
		domainObject.setExtClockName(valueObject.getExtClockName());
		java.util.Date value7 = null;
		ims.framework.utils.Date date7 = valueObject.getStartDate();		
		if ( date7 != null ) 
		{
			value7 = date7.getDate();
		}
		domainObject.setStartDate(value7);
		java.util.Date value8 = null;
		ims.framework.utils.Date date8 = valueObject.getStopDate();		
		if ( date8 != null ) 
		{
			value8 = date8.getDate();
		}
		domainObject.setStopDate(value8);
		java.util.Date value9 = null;
		ims.framework.utils.Date date9 = valueObject.getTargetClockEnd();		
		if ( date9 != null ) 
		{
			value9 = date9.getDate();
		}
		domainObject.setTargetClockEnd(value9);

		return domainObject;
	}

}
